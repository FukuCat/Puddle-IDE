package org.cmpiler.kotlin.interpreter.semantics;

import org.antlr.symtab.BaseScope;
import org.antlr.symtab.Scope;

public class LoopScope extends BaseScope {
    public LoopScope(Scope enclosingScope) {
        super(enclosingScope);
    }

    @Override
    public String getName() {
        return "loop";
    }
}