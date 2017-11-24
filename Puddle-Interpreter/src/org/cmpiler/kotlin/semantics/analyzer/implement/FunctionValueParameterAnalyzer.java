package org.cmpiler.kotlin.semantics.analyzer.implement;

import org.antlr.symtab.*;
import org.antlr.v4.runtime.ParserRuleContext;
import org.cmpiler.kotlin.antlr.KotlinParser;
import org.cmpiler.kotlin.interpreter.console.Console;
import org.cmpiler.kotlin.interpreter.parser.CodeValidator;
import org.cmpiler.kotlin.interpreter.parser.ErrorDictionary;
import org.cmpiler.kotlin.semantics.analyzer.AbstractAnalyzer;

public class FunctionValueParameterAnalyzer extends AbstractAnalyzer {
    @Override
    public void enterRule(ParserRuleContext context) {
        KotlinParser.FunctionValueParameterContext ctx = (KotlinParser.FunctionValueParameterContext) context;
        String name = ctx.getChild(0).getChild(0).getText();
        if(symtab.isSymbolDefinedInCurrentScope(name)) {
            CodeValidator.reportCustomError(ErrorDictionary.MULTIPLE_VARIABLE, "",name,ctx.start.getLine());
        } else {
            VariableSymbol v = null;
            if(symtab.getCurrentScope() instanceof MethodSymbol) {
                ParameterSymbol p = new ParameterSymbol(name);
                p.setDefNode(ctx);
                if (ctx.getChild(0).getChildCount() < 3)
                    CodeValidator.reportCustomError(ErrorDictionary.UNDECLARED_TYPE, "", name, ctx.start.getLine());
                else {
                    ctx.symbol = p;
                    Console.log(Console.DEV_CONSOLE, "Parameter added [" + p.getName() + "]");
                }
                v = p;
            } else {
                FieldSymbol f = new FieldSymbol(name);
                f.setDefNode(ctx);
                if (ctx.getChild(0).getChildCount() < 3)
                    CodeValidator.reportCustomError(ErrorDictionary.UNDECLARED_TYPE, "", name, ctx.start.getLine());
                else {
                    ctx.symbol = f;
                    Console.log(Console.DEV_CONSOLE, "Field added [" + f.getName() + "]");
                }
                v = f;
            }
            symtab.getCurrentScope().define(v);
        }
    }

    @Override
    public void exitRule(ParserRuleContext context) {

    }
}