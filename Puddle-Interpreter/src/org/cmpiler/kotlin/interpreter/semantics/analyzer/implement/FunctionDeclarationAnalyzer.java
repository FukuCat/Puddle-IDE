package org.cmpiler.kotlin.interpreter.semantics.analyzer.implement;

import org.antlr.symtab.ClassSymbol;
import org.antlr.symtab.FunctionSymbol;
import org.antlr.symtab.LocalScope;
import org.antlr.symtab.MethodSymbol;
import org.antlr.v4.runtime.ParserRuleContext;
import org.cmpiler.kotlin.antlr.KotlinParser;
import org.cmpiler.kotlin.ide.controller.EditorController;
import org.cmpiler.kotlin.utils.ErrorDictionary;
import org.cmpiler.kotlin.interpreter.parser.SymbolTableHandler;
import org.cmpiler.kotlin.interpreter.semantics.KotlinCodeValidator;
import org.cmpiler.kotlin.interpreter.semantics.analyzer.AbstractAnalyzer;
import org.cmpiler.kotlin.utils.FunctionSignatureGenerator;
import org.cmpiler.kotlin.utils.console.Console;

public class FunctionDeclarationAnalyzer extends AbstractAnalyzer {
    @Override
    public void enterBuildRule(ParserRuleContext context) {
        KotlinParser.FunctionDeclarationContext ctx = (KotlinParser.FunctionDeclarationContext) context;
        //String name = symtab.getCurrentScope().toQualifierString(".")+"."+ FunctionSignatureGenerator.getInstance().toSignature(ctx);
        if(ctx.identifier() == null){

        } else {
            String name = FunctionSignatureGenerator.getInstance().toSignature(ctx);

            if (symtab.isSymbolDefinedInCurrentScope(name) && !(ctx.parent instanceof KotlinParser.ClassMemberDeclarationContext)) {
                KotlinCodeValidator.reportCustomError(ErrorDictionary.MULTIPLE_FUNCTION,ctx.start.getLine(),"", name, ctx.start.getLine());
                LocalScope l = new LocalScope(symtab.getCurrentScope());
                ctx.scope = l;
                symtab.pushScope(l);
            } else {
                FunctionSymbol f = null;
                if (ctx.parent instanceof KotlinParser.ClassMemberDeclarationContext) {
                    // found first method
                    ClassSymbol c = (ClassSymbol) symtab.getCurrentScope();
                    if (!symtab.isSymbolDefinedInCurrentScope(name)) {
                        MethodSymbol m = new MethodSymbol(name);
                        m.setEnclosingScope(symtab.getCurrentScope());
                        m.setDefNode(ctx);
                        c.setSlotNumber(m);
                        symtab.getCurrentScope().define(m);
                        f = m;
                        Console.log(Console.DEV_CONSOLE, "Method defined [" + f.getName() + "]");
                    } else {
                        KotlinCodeValidator.reportCustomError(ErrorDictionary.MULTIPLE_FUNCTION,ctx.start.getLine(),"", name, ctx.start.getLine());
                    }
                } else {
                    f = new FunctionSymbol(name);
                    f.setEnclosingScope(symtab.getCurrentScope());
                    f.setDefNode(ctx);
                    symtab.getCurrentScope().define(f);
                    Console.log(Console.DEV_CONSOLE, "Function defined [" + f.getName() + "]");
                }
                ctx.scope = f;
                symtab.pushScope(f);
                if (ctx.getChild(1).getText().equalsIgnoreCase("main")) {
                    if (SymbolTableHandler.getInstance().getMainScope() == null)
                        SymbolTableHandler.getInstance().setMainScope(f);
                    else
                        KotlinCodeValidator.reportCustomError(ErrorDictionary.MULTIPLE_MAIN,ctx.start.getLine(),"", ctx.start.getLine());
                }
            }
        }
    }

    @Override
    public void exitBuildRule(ParserRuleContext context) {
        symtab.popScope();
    }

    @Override
    public void evaluateRule(ParserRuleContext context) {
        KotlinParser.FunctionDeclarationContext ctx = (KotlinParser.FunctionDeclarationContext) context;
        // set return type
        if(ctx.scope instanceof FunctionSymbol) {
            FunctionSymbol f = ((FunctionSymbol) ctx.scope);
            String type;
            if (f != null) {
                if (ctx.type().size() > 0)
                    type = ctx.type(0).getText();
                else
                    type = "void";
                f.setType(symtab.getDefinedType(type));
                if(ctx.identifier() != null)
                    EditorController.getInstance().addAutoCompleteionFunction(ctx.identifier().getText(), f.getName()+":"+type);
            }

        }
        symtab.setCurrentScope(ctx.scope);
    }

}
