package org.cmpiler.kotlin.semantics.analyzer.implement;

import org.antlr.symtab.GlobalScope;
import org.antlr.v4.runtime.ParserRuleContext;
import org.cmpiler.kotlin.antlr.KotlinParser;
import org.cmpiler.kotlin.interpreter.parser.symboltable.SymbolTableHandler;
import org.cmpiler.kotlin.semantics.analyzer.AbstractAnalyzer;

public class KotlinFileAnalyzer extends AbstractAnalyzer {
    @Override
    public void enterRule(ParserRuleContext context) {
        KotlinParser.KotlinFileContext ctx = (KotlinParser.KotlinFileContext) context;
        GlobalScope g = SymbolTableHandler.getInstance().GLOBALS;
        ctx.scope = g;
        symtab.pushScope(g);
    }

    @Override
    public void exitRule(ParserRuleContext context) {
        symtab.popScope();
    }
}
