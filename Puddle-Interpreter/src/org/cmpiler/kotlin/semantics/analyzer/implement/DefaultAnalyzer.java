package org.cmpiler.kotlin.semantics.analyzer.implement;

import org.antlr.v4.runtime.ParserRuleContext;
import org.cmpiler.kotlin.interpreter.console.Console;
import org.cmpiler.kotlin.semantics.analyzer.AbstractAnalyzer;

public class DefaultAnalyzer extends AbstractAnalyzer {

    @Override
    public void enterRule(ParserRuleContext ctx) {
        Console.log(Console.DEV_CONSOLE,"Entered DefaultAnalyzer");
    }

    @Override
    public void exitRule(ParserRuleContext ctx) {
        Console.log(Console.DEV_CONSOLE,"Exited DefaultAnalyzer");
    }

}
