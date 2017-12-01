package org.cmpiler.kotlin.interpreter.Interpreter.semantics.analyzer.implement;

import org.antlr.symtab.LocalScope;
import org.antlr.v4.runtime.ParserRuleContext;
import org.cmpiler.kotlin.antlr.KotlinParser;
import org.cmpiler.kotlin.interpreter.Interpreter.semantics.analyzer.AbstractAnalyzer;

public class ForExpressionAnalyzer extends AbstractAnalyzer {
    @Override
    public void enterBuildRule(ParserRuleContext context) {
        KotlinParser.ForExpressionContext ctx = (KotlinParser.ForExpressionContext) context;
        LocalScope l = new LocalScope(symtab.getCurrentScope());
        ctx.scope = l;
        symtab.pushScope(l);
    }

    @Override
    public void exitBuildRule(ParserRuleContext context) {
        symtab.popScope();
    }

    @Override
    public void evaluateRule(ParserRuleContext context) {
        KotlinParser.ForExpressionContext ctx = (KotlinParser.ForExpressionContext) context;
        LocalScope l = new LocalScope(ctx.scope);
        symtab.pushScope(l);
    }
}