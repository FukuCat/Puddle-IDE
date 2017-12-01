package org.cmpiler.kotlin.interpreter.Interpreter.semantics.analyzer.implement;

import org.antlr.v4.runtime.ParserRuleContext;
import org.cmpiler.kotlin.interpreter.Interpreter.semantics.analyzer.AbstractAnalyzer;

public class IndexingExpressionAnalyzer extends AbstractAnalyzer {
    @Override
    public void enterBuildRule(ParserRuleContext context) {

    }

    @Override
    public void exitBuildRule(ParserRuleContext context) {

    }

    @Override
    public void evaluateRule(ParserRuleContext context) {
        /*
        KotlinParser.IndexingExpressionContext ctx = (KotlinParser.IndexingExpressionContext) context;
        ExpressionEvaluator expressionEvaluator = new ExpressionEvaluator();
        ParseTreeWalker treeWalker = new ParseTreeWalker();
        treeWalker.walk(expressionEvaluator, ctx.getChild(1).getChild(1));
        if(!expressionEvaluator.getType().getName().equalsIgnoreCase("Int"))
            KotlinCodeValidator.reportCustomError(ErrorDictionary.TYPE_MISMATCH, ctx.getChild(0).getText()+" is of type "+expressionEvaluator.getType().getName(), ctx.start.getLine());
        */
    }
}
