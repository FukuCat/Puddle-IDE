package org.cmpiler.kotlin.interpreter.Interpreter.semantics.analyzer.implement;

import org.antlr.v4.runtime.ParserRuleContext;
import org.cmpiler.kotlin.interpreter.Interpreter.semantics.analyzer.AbstractAnalyzer;
import org.cmpiler.kotlin.utils.console.Console;

public class DefaultAnalyzer extends AbstractAnalyzer {

    @Override
    public void enterBuildRule(ParserRuleContext ctx) {
        Console.log(Console.DEV_CONSOLE,"Entered DefaultAnalyzer");
    }

    @Override
    public void exitBuildRule(ParserRuleContext ctx) {
        Console.log(Console.DEV_CONSOLE,"Exited DefaultAnalyzer");
    }

    @Override
    public void evaluateRule(ParserRuleContext context) {

    }

}
