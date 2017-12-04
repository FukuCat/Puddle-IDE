package org.cmpiler.kotlin.interpreter.semantics.analyzer;

import org.antlr.v4.runtime.ParserRuleContext;
import org.cmpiler.kotlin.interpreter.parser.SymbolTableHandler;

public abstract class AbstractAnalyzer {

    protected SymbolTableHandler symtab;

    public AbstractAnalyzer(){
        symtab = SymbolTableHandler.getInstance();
    }

    public abstract void enterBuildRule(ParserRuleContext context);

    public abstract void exitBuildRule(ParserRuleContext context);

    public abstract void evaluateRule(ParserRuleContext context);

}
