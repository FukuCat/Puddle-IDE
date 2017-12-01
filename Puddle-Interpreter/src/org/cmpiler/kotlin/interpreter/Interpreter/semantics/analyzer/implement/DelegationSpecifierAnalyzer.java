package org.cmpiler.kotlin.interpreter.Interpreter.semantics.analyzer.implement;

import org.antlr.symtab.ClassSymbol;
import org.antlr.symtab.Scope;
import org.antlr.v4.runtime.ParserRuleContext;
import org.cmpiler.kotlin.antlr.KotlinParser;
import org.cmpiler.kotlin.interpreter.Interpreter.semantics.analyzer.AbstractAnalyzer;
import org.cmpiler.kotlin.utils.console.Console;

public class DelegationSpecifierAnalyzer extends AbstractAnalyzer {
    @Override
    public void enterBuildRule(ParserRuleContext context) {
    }

    @Override
    public void exitBuildRule(ParserRuleContext context) {
    }

    @Override
    public void evaluateRule(ParserRuleContext context) {
        KotlinParser.DelegationSpecifierContext ctx = (KotlinParser.DelegationSpecifierContext) context;
        Scope s = symtab.getCurrentScope();
        if(s instanceof ClassSymbol){
            ((ClassSymbol)s).setSuperClass(ctx.getText());
            Console.log(Console.DEV_CONSOLE, "Super class defined ["+ctx.getText()+"]");
        }
    }
}
