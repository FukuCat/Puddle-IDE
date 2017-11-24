package org.cmpiler.kotlin.semantics.analyzer.implement;

import org.antlr.symtab.ClassSymbol;
import org.antlr.symtab.LocalScope;
import org.antlr.v4.runtime.ParserRuleContext;
import org.cmpiler.kotlin.antlr.KotlinParser;
import org.cmpiler.kotlin.interpreter.console.Console;
import org.cmpiler.kotlin.interpreter.parser.CodeValidator;
import org.cmpiler.kotlin.interpreter.parser.ErrorDictionary;
import org.cmpiler.kotlin.interpreter.parser.symboltable.SymbolTableHandler;
import org.cmpiler.kotlin.semantics.analyzer.AbstractAnalyzer;

public class ClassDeclarationAnalyzer extends AbstractAnalyzer {
    @Override
    public void enterRule(ParserRuleContext context) {
        KotlinParser.ClassDeclarationContext ctx = (KotlinParser.ClassDeclarationContext) context;

        String name = ctx.getChild(1).getText();
        if(SymbolTableHandler.isSymbolDefinedInCurrentScope(name)) {
            CodeValidator.reportCustomError(ErrorDictionary.MULTIPLE_CLASS, "",name,ctx.start.getLine());
            LocalScope l = new LocalScope(SymbolTableHandler.getCurrentScope());
            SymbolTableHandler.pushScope(l);
        } else {
            ClassSymbol c = new ClassSymbol(name);
            c.setEnclosingScope(SymbolTableHandler.getCurrentScope());
            c.setDefNode(ctx);
            ctx.scope = c;
            SymbolTableHandler.getCurrentScope().define(c);
            Console.log(Console.DEV_CONSOLE, "Class defined ["+c.getName()+"]");
            SymbolTableHandler.pushScope(c);
        }
    }

    @Override
    public void exitRule(ParserRuleContext context) {
        SymbolTableHandler.popScope();
    }
}
