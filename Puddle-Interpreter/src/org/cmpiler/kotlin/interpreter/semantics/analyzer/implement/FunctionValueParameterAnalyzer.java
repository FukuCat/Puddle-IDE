package org.cmpiler.kotlin.interpreter.semantics.analyzer.implement;

import org.antlr.symtab.*;
import org.antlr.v4.runtime.ParserRuleContext;
import org.cmpiler.kotlin.antlr.KotlinParser;
import org.cmpiler.kotlin.utils.ErrorDictionary;
import org.cmpiler.kotlin.interpreter.semantics.KotlinCodeValidator;
import org.cmpiler.kotlin.interpreter.semantics.analyzer.AbstractAnalyzer;
import org.cmpiler.kotlin.utils.console.Console;

public class FunctionValueParameterAnalyzer extends AbstractAnalyzer {
    @Override
    public void enterBuildRule(ParserRuleContext context) {
        KotlinParser.FunctionValueParameterContext ctx = (KotlinParser.FunctionValueParameterContext) context;
        if(ctx.getChild(0)!= null)
            if(ctx.getChild(0).getChild(0)!= null) {
                String name = ctx.getChild(0).getChild(0).getText();
                if (symtab.isSymbolDefinedInCurrentScope(name)) {
                    KotlinCodeValidator.reportCustomError(ErrorDictionary.MULTIPLE_VARIABLE, "", name, ctx.start.getLine());
                } else {
                    VariableSymbol v = null;
                    if (symtab.getCurrentScope() instanceof MethodSymbol) {
                        ParameterSymbol p = new ParameterSymbol(name);
                        p.setDefNode(ctx);
                        if (ctx.getChild(0).getChildCount() < 3)
                            KotlinCodeValidator.reportCustomError(ErrorDictionary.UNDECLARED_TYPE, "", name, ctx.start.getLine());
                        else {
                            ctx.symbol = p;
                            Console.log(Console.DEV_CONSOLE, "Parameter added [" + p.getName() + "]");
                        }
                        v = p;
                    } else {
                        FieldSymbol f = new FieldSymbol(name);
                        f.setDefNode(ctx);
                        if (ctx.getChild(0).getChildCount() < 3)
                            KotlinCodeValidator.reportCustomError(ErrorDictionary.UNDECLARED_TYPE, "", name, ctx.start.getLine());
                        else {
                            ctx.symbol = f;
                            Console.log(Console.DEV_CONSOLE, "Field added [" + f.getName() + "]");
                        }
                        v = f;
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
        KotlinParser.FunctionValueParameterContext ctx = (KotlinParser.FunctionValueParameterContext) context;
        VariableSymbol v = (VariableSymbol) ctx.symbol;
        if(v != null)
            if (ctx.getChild(0).getChildCount() >= 3) {
                Type t = symtab.getDefinedType(ctx.getChild(0).getChild(2).getText());
                if (t != null) {
                    v.setType(t);
                } else {
                    KotlinCodeValidator.reportCustomError(ErrorDictionary.UNDECLARED_TYPE, "", v.getName(), ctx.start.getLine());
                }
            }
    }

}