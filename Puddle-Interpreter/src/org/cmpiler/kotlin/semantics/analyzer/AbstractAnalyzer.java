package org.cmpiler.kotlin.semantics.analyzer;

import org.antlr.v4.runtime.ParserRuleContext;
import org.cmpiler.kotlin.interpreter.parser.symboltable.SymbolTableHandler;

public abstract class AbstractAnalyzer {

    protected SymbolTableHandler symtab;

    public AbstractAnalyzer(){
        symtab = SymbolTableHandler.getInstance();
    }

    public abstract void enterRule(ParserRuleContext context);

    public abstract void exitRule(ParserRuleContext context);

}
