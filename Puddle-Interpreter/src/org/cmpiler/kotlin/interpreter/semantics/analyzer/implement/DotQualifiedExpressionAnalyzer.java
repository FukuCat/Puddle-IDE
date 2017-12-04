package org.cmpiler.kotlin.interpreter.semantics.analyzer.implement;

import org.antlr.v4.runtime.ParserRuleContext;
import org.cmpiler.kotlin.interpreter.semantics.analyzer.AbstractAnalyzer;

public class DotQualifiedExpressionAnalyzer extends AbstractAnalyzer {
    @Override
    public void enterBuildRule(ParserRuleContext context) {

    }

    @Override
    public void exitBuildRule(ParserRuleContext context) {
        //Console.log(Console.DEV_ERROR,context.getText()+"||"+context.getChildCount());


    }

    @Override
    public void evaluateRule(ParserRuleContext context) {
        // this
        // variable call
        // function call
    }
}
