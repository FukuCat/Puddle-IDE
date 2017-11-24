package org.cmpiler.kotlin.semantics.analyzer.implement;

import org.antlr.symtab.*;
import org.antlr.v4.runtime.ParserRuleContext;
import org.cmpiler.kotlin.antlr.KotlinParser;
import org.cmpiler.kotlin.interpreter.console.Console;
import org.cmpiler.kotlin.interpreter.parser.CodeValidator;
import org.cmpiler.kotlin.interpreter.parser.ErrorDictionary;
import org.cmpiler.kotlin.interpreter.parser.symboltable.SymbolTableHandler;
import org.cmpiler.kotlin.semantics.analyzer.AbstractAnalyzer;

public class VariableDeclarationAnalyzer extends AbstractAnalyzer{
    @Override
    public void enterRule(ParserRuleContext context) {
        KotlinParser.VariableDeclarationContext ctx = (KotlinParser.VariableDeclarationContext) context;
        String name = ctx.getChild(0).getText();
        if(symtab.isSymbolDefinedInCurrentScope(name)) {
            CodeValidator.reportCustomError(ErrorDictionary.MULTIPLE_VARIABLE, "",name,ctx.start.getLine());
        } else {

            // data type and name
            if(ctx.parent.parent instanceof KotlinParser.ClassMemberDeclarationContext) {
                FieldSymbol f = new FieldSymbol(name);
                ClassSymbol c = (ClassSymbol) symtab.getCurrentScope();
                c.setSlotNumber(f);
                f.setDefNode(ctx);
                if (ctx.getChildCount() < 3) {
                    CodeValidator.reportCustomError(ErrorDictionary.UNDECLARED_TYPE, "", name, ctx.start.getLine());
                } else {
                    ctx.symbol = f;
                    Console.log(Console.DEV_CONSOLE, "Field added [" + name + "]");
                }
                // const or not
                if(ctx.parent.getChild(0).getText().equalsIgnoreCase("val"))
                    SymbolTableHandler.getInstance().getSymbolConstant().add(f);
                symtab.getCurrentScope().define(f);
            } else {
                VariableSymbol v = new VariableSymbol(name);
                v.setDefNode(ctx);
                if (ctx.getChildCount() < 3) {
                    CodeValidator.reportCustomError(ErrorDictionary.UNDECLARED_TYPE, "", name, ctx.start.getLine());
                }else {
                    ctx.symbol = v;
                    Console.log(Console.DEV_CONSOLE, "Symbol added [" + name + "]");
                }
                // const or not
                if(ctx.parent.getChild(0).getText().equalsIgnoreCase("val")){
                    SymbolTableHandler.getInstance().getSymbolConstant().add(v);
                    Console.log(Console.DEV_CONSOLE, "val [" + name + "] is a constant.");
                }
                symtab.getCurrentScope().define(v);
            }
        }
    }

    @Override
    public void exitRule(ParserRuleContext context) {

    }
}
