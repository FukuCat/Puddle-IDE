package org.cmpiler.kotlin.interpreter.Interpreter.semantics.analyzer.implement;

import org.antlr.symtab.ClassSymbol;
import org.antlr.symtab.FieldSymbol;
import org.antlr.symtab.Type;
import org.antlr.symtab.VariableSymbol;
import org.antlr.v4.runtime.ParserRuleContext;
import org.cmpiler.kotlin.antlr.KotlinParser;
import org.cmpiler.kotlin.interpreter.Interpreter.parser.SymbolTableHandler;
import org.cmpiler.kotlin.interpreter.Interpreter.semantics.KotlinCodeValidator;
import org.cmpiler.kotlin.interpreter.Interpreter.semantics.analyzer.AbstractAnalyzer;
import org.cmpiler.kotlin.utils.ErrorDictionary;
import org.cmpiler.kotlin.utils.console.Console;

public class VariableDeclarationAnalyzer extends AbstractAnalyzer {
    @Override
    public void enterBuildRule(ParserRuleContext context) {
        KotlinParser.VariableDeclarationContext ctx = (KotlinParser.VariableDeclarationContext) context;
        String name = ctx.getChild(0).getText();
        if(symtab.isSymbolDefinedInCurrentScope(name)) {
            KotlinCodeValidator.reportCustomError(ErrorDictionary.MULTIPLE_VARIABLE, "",name,ctx.start.getLine());
        } else {

            // data type and name
            if(ctx.parent.parent instanceof KotlinParser.ClassMemberDeclarationContext) {
                FieldSymbol f = new FieldSymbol(name);
                ClassSymbol c = (ClassSymbol) symtab.getCurrentScope();
                c.setSlotNumber(f);
                f.setDefNode(ctx);
                if (ctx.getChildCount() < 3) {
                    KotlinCodeValidator.reportCustomError(ErrorDictionary.UNDECLARED_TYPE, "", name, ctx.start.getLine());
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
                    KotlinCodeValidator.reportCustomError(ErrorDictionary.UNDECLARED_TYPE, "", name, ctx.start.getLine());
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
                Type t = symtab.getDefinedType(ctx.getChild(2).getText());
                if (t != null) {
                    v.setType(t);
                } else {
                    KotlinCodeValidator.reportCustomError(ErrorDictionary.UNDECLARED_TYPE, "", name, ctx.start.getLine());
                }
            }
    }

}
