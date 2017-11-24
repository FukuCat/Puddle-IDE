package org.cmpiler.kotlin.semantics.analyzer.implement;

import org.antlr.symtab.ClassSymbol;
import org.antlr.symtab.Scope;
import org.antlr.v4.runtime.ParserRuleContext;
import org.cmpiler.kotlin.antlr.KotlinParser;
import org.cmpiler.kotlin.interpreter.console.Console;
import org.cmpiler.kotlin.semantics.analyzer.AbstractAnalyzer;

public class DelegationSpecifierAnalyzer extends AbstractAnalyzer {
    @Override
    public void enterRule(ParserRuleContext context) {
        KotlinParser.DelegationSpecifierContext ctx = (KotlinParser.DelegationSpecifierContext) context;
        Scope s = symtab.getCurrentScope();
        if(s instanceof ClassSymbol){
            ((ClassSymbol)s).setSuperClass(ctx.getText());
            Console.log(Console.DEV_CONSOLE, "Super class defined ["+ctx.getText()+"]");
        }
    }

    @Override
    public void exitRule(ParserRuleContext context) {
    }
}
