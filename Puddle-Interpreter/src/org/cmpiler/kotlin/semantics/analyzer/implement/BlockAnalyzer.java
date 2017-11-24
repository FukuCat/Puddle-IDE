package org.cmpiler.kotlin.semantics.analyzer.implement;

import org.antlr.symtab.LocalScope;
import org.antlr.v4.runtime.ParserRuleContext;
import org.cmpiler.kotlin.antlr.KotlinParser;
import org.cmpiler.kotlin.semantics.analyzer.AbstractAnalyzer;

public class BlockAnalyzer extends AbstractAnalyzer {
    @Override
    public void enterRule(ParserRuleContext context) {
        KotlinParser.BlockContext ctx = (KotlinParser.BlockContext) context;
        LocalScope l = new LocalScope(symtab.getCurrentScope());
        ctx.scope = l;
        symtab.pushScope(l);
    }

    @Override
    public void exitRule(ParserRuleContext context) {
        symtab.popScope();
    }
}
