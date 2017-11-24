package org.cmpiler.kotlin.semantics;

import org.cmpiler.kotlin.antlr.KotlinParser;
import org.cmpiler.kotlin.antlr.KotlinParserBaseListener;
import org.cmpiler.kotlin.semantics.analyzer.AnalyzerHandler;
import org.cmpiler.kotlin.semantics.analyzer.implement.CallExpressionAnalyzer;

public class ScopeVerifyer  extends KotlinParserBaseListener {
    @Override public void enterCallExpression(KotlinParser.CallExpressionContext ctx) {
        AnalyzerHandler.getAnalyzer(CallExpressionAnalyzer.class).enterRule(ctx);
    }
    @Override public void exitCallExpression(KotlinParser.CallExpressionContext ctx) {
        AnalyzerHandler.getAnalyzer(CallExpressionAnalyzer.class).exitRule(ctx);
    }
}
