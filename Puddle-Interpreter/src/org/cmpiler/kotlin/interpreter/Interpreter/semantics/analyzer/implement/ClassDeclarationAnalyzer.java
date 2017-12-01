package org.cmpiler.kotlin.interpreter.Interpreter.semantics.analyzer.implement;

import org.antlr.symtab.ClassSymbol;
import org.antlr.symtab.LocalScope;
import org.antlr.v4.runtime.ParserRuleContext;
import org.cmpiler.kotlin.antlr.KotlinParser;
import org.cmpiler.kotlin.utils.ErrorDictionary;
import org.cmpiler.kotlin.interpreter.Interpreter.semantics.KotlinCodeValidator;
import org.cmpiler.kotlin.interpreter.Interpreter.semantics.analyzer.AbstractAnalyzer;
import org.cmpiler.kotlin.utils.console.Console;

public class ClassDeclarationAnalyzer extends AbstractAnalyzer {
    @Override
    public void enterBuildRule(ParserRuleContext context) {
        KotlinParser.ClassDeclarationContext ctx = (KotlinParser.ClassDeclarationContext) context;

        String name = ctx.simpleIdentifier().getText();
        if(symtab.isSymbolDefinedInCurrentScope(name)) {
            KotlinCodeValidator.reportCustomError(ErrorDictionary.MULTIPLE_CLASS, "",name,ctx.start.getLine());
            LocalScope l = new LocalScope(symtab.getCurrentScope());
            ctx.scope = l;
            symtab.pushScope(l);
        } else {
            ClassSymbol c = new ClassSymbol(name);
            c.setEnclosingScope(symtab.getCurrentScope());
            c.setDefNode(ctx);
            ctx.scope = c;
            symtab.getCurrentScope().define(c);
            Console.log(Console.DEV_CONSOLE, "Class defined ["+c.getName()+"]");
            symtab.pushScope(c);
        }
    }

    @Override
    public void exitBuildRule(ParserRuleContext context) {
        symtab.popScope();
    }

    @Override
    public void evaluateRule(ParserRuleContext context) {
        KotlinParser.ClassDeclarationContext ctx = (KotlinParser.ClassDeclarationContext) context;
        symtab.setCurrentScope(ctx.scope);
    }
}
