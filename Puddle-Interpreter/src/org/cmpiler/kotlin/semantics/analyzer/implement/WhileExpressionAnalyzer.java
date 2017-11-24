package org.cmpiler.kotlin.semantics.analyzer.implement;

import org.antlr.symtab.LocalScope;
import org.antlr.v4.runtime.ParserRuleContext;
import org.cmpiler.kotlin.antlr.KotlinParser;
import org.cmpiler.kotlin.semantics.analyzer.AbstractAnalyzer;

public class WhileExpressionAnalyzer  extends AbstractAnalyzer {
    @Override
    public void enterRule(ParserRuleContext context) {
        KotlinParser.WhileExpressionContext ctx = (KotlinParser.WhileExpressionContext) context;
        LocalScope l = new LocalScope(symtab.getCurrentScope());
        symtab.pushScope(l);
    }

    @Override
    public void exitRule(ParserRuleContext context) {
        symtab.popScope();
    }
}