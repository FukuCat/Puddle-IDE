package org.cmpiler.kotlin.interpreter.Interpreter.semantics.analyzer.implement;

import org.antlr.symtab.GlobalScope;
import org.antlr.v4.runtime.ParserRuleContext;
import org.cmpiler.kotlin.antlr.KotlinParser;
import org.cmpiler.kotlin.interpreter.Interpreter.parser.SymbolTableHandler;
import org.cmpiler.kotlin.interpreter.Interpreter.semantics.analyzer.AbstractAnalyzer;

public class KotlinFileAnalyzer extends AbstractAnalyzer {
    @Override
    public void enterBuildRule(ParserRuleContext context) {
        KotlinParser.KotlinFileContext ctx = (KotlinParser.KotlinFileContext) context;
        GlobalScope g = SymbolTableHandler.getInstance().GLOBALS;
        ctx.scope = g;
        symtab.pushScope(g);
    }

    @Override
    public void exitBuildRule(ParserRuleContext context) {
        symtab.popScope();
    }

    @Override
    public void evaluateRule(ParserRuleContext context) {
        KotlinParser.KotlinFileContext ctx = (KotlinParser.KotlinFileContext) context;
        symtab.setCurrentScope(ctx.scope);
    }

}
