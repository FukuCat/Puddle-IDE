package org.cmpiler.kotlin.interpreter.semantics.analyzer.implement;

import org.antlr.symtab.*;
import org.antlr.v4.runtime.ParserRuleContext;
import org.cmpiler.kotlin.antlr.KotlinParser;
import org.cmpiler.kotlin.ide.controller.EditorController;
import org.cmpiler.kotlin.interpreter.parser.SymbolTableHandler;
import org.cmpiler.kotlin.interpreter.semantics.KotlinCodeValidator;
import org.cmpiler.kotlin.interpreter.semantics.analyzer.AbstractAnalyzer;
import org.cmpiler.kotlin.utils.ErrorDictionary;
import org.cmpiler.kotlin.utils.console.Console;

public class VariableDeclarationAnalyzer extends AbstractAnalyzer {
    @Override
    public void enterBuildRule(ParserRuleContext context) {
        KotlinParser.VariableDeclarationContext ctx = (KotlinParser.VariableDeclarationContext) context;
        String name = ctx.getChild(0).getText();
        if(symtab.isSymbolDefinedInCurrentScope(name)) {
            KotlinCodeValidator.reportCustomError(ErrorDictionary.MULTIPLE_VARIABLE,ctx.start.getLine(),"",name,ctx.start.getLine());
        } else {

            // data type and name
            if(ctx.parent.parent instanceof KotlinParser.ClassMemberDeclarationContext) {
                FieldSymbol f = new FieldSymbol(name);
                ClassSymbol c = (ClassSymbol) symtab.getCurrentScope();
                c.setSlotNumber(f);
                f.setDefNode(ctx);
                if (ctx.getChildCount() < 3) {
                    KotlinCodeValidator.reportCustomError(ErrorDictionary.UNDECLARED_TYPE,ctx.start.getLine(),"", name, ctx.start.getLine());
                } else {
                    ctx.symbol = f;
                    Console.log(Console.DEV_CONSOLE, "Field added [" + name + "]");
                }
                // const or not
                if(ctx.parent.getChild(0).getText().equalsIgnoreCase("val"))
                    SymbolTableHandler.getInstance().setSymbolConstant(f);
                symtab.getCurrentScope().define(f);
            } else {
                VariableSymbol v = new VariableSymbol(name);
                v.setDefNode(ctx);
                if (ctx.getChildCount() < 3) {
                    KotlinCodeValidator.reportCustomError(ErrorDictionary.UNDECLARED_TYPE,ctx.start.getLine(),"", name, ctx.start.getLine());
                }else {
                    ctx.symbol = v;
                    Console.log(Console.DEV_CONSOLE, "Variable added [" + name + "]");
                }
                // const or not
                if(ctx.parent.getChild(0).getText().equalsIgnoreCase("val")){
                    SymbolTableHandler.getInstance().setSymbolConstant(v);
                    Console.log(Console.DEV_CONSOLE, "val [" + name + "] is a constant.");
                }
                symtab.getCurrentScope().define(v);
            }
        }
    }

    @Override
    public void exitBuildRule(ParserRuleContext context) {

    }

    @Override
    public void evaluateRule(ParserRuleContext context) {
        KotlinParser.VariableDeclarationContext ctx = (KotlinParser.VariableDeclarationContext) context;
        VariableSymbol v = (VariableSymbol) ctx.symbol;
        String name = ctx.getChild(0).getText();
        if(v != null)
            if (ctx.getChildCount() >= 3){
                Type t = symtab.getDefinedType(ctx.type().getText());
                if (t != null) {
                    v.setType(t);

                    int endline = -1;
                    int selectedLine = EditorController.getInstance().selectedLine();
                    Scope s = symtab.findNonLocalParentScope(symtab.getCurrentScope());
                    System.out.println(s.getName());
                    if (s != null) {
                        if(s instanceof FunctionSymbol){
                            FunctionSymbol f = (FunctionSymbol)s;
                            KotlinParser.FunctionDeclarationContext fctx = (KotlinParser.FunctionDeclarationContext) f.getDefNode();
                            if(fctx.functionBody() != null)
                                if(fctx.functionBody().block() != null)
                                    if(fctx.functionBody().block().RCURL() != null)
                                        endline = fctx.functionBody().block().RCURL().getSymbol().getLine();
                            if(endline != -1 && selectedLine <= endline && selectedLine >= ctx.start.getLine())
                                EditorController.getInstance().addAutoCompleteionVariable(v.getName(), v.getType().getName());
                        }
                    } else // is global variable
                        EditorController.getInstance().addAutoCompleteionVariable(v.getName(), v.getType().getName());
                } else {
                    KotlinCodeValidator.reportCustomError(ErrorDictionary.UNDECLARED_TYPE,ctx.start.getLine(),"", name, ctx.start.getLine());
                }
            }


    }

}
