package org.cmpiler.kotlin.semantics.analyzer.implement;

import org.antlr.symtab.LocalScope;
import org.antlr.v4.runtime.ParserRuleContext;
import org.cmpiler.kotlin.semantics.analyzer.AbstractAnalyzer;

public class ForExpressionAnalyzer extends AbstractAnalyzer {
    @Override
    public void enterRule(ParserRuleContext context) {
        LocalScope l = new LocalScope(symtab.getCurrentScope());
        symtab.pushScope(l);
    }

    @Override
    public void exitRule(ParserRuleContext context) {
        symtab.popScope();
    }
}