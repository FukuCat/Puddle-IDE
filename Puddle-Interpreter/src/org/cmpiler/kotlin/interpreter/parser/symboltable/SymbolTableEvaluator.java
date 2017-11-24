package org.cmpiler.kotlin.interpreter.parser.symboltable;

import org.antlr.symtab.FunctionSymbol;
import org.antlr.symtab.Type;
import org.antlr.symtab.VariableSymbol;
import org.cmpiler.kotlin.antlr.KotlinParser;
import org.cmpiler.kotlin.antlr.KotlinParserBaseListener;
import org.cmpiler.kotlin.interpreter.parser.CodeValidator;
import org.cmpiler.kotlin.interpreter.parser.ErrorDictionary;
import org.cmpiler.kotlin.semantics.analyzer.AnalyzerHandler;
import org.cmpiler.kotlin.semantics.analyzer.implement.*;

public class SymbolTableEvaluator extends KotlinParserBaseListener {

    SymbolTableHandler symtab = SymbolTableHandler.getInstance();

    @Override
    public void enterKotlinFile(KotlinParser.KotlinFileContext ctx) {
        symtab.setCurrentScope(ctx.scope);
    }

    @Override
    public void exitKotlinFile(KotlinParser.KotlinFileContext ctx) {
        symtab.popScope();
    }

    @Override
    public void enterBlock(KotlinParser.BlockContext ctx) {
        symtab.setCurrentScope(ctx.scope);
    }

    @Override
    public void exitBlock(KotlinParser.BlockContext ctx) {
        symtab.popScope();
    }

    @Override public void enterClassDeclaration(KotlinParser.ClassDeclarationContext ctx) {
        symtab.setCurrentScope(ctx.scope);
    }

    @Override public void exitClassDeclaration(KotlinParser.ClassDeclarationContext ctx) {
        symtab.popScope();
    }

    @Override public void enterFunctionDeclaration(KotlinParser.FunctionDeclarationContext ctx) {
        // set return type
        FunctionSymbol f = ((FunctionSymbol)ctx.scope);
        String type;
        if(f != null) {
            if (ctx.getChildCount() > 4)
                type = ctx.getChild(4).getText();
            else
                type = "void";
            f.setType(symtab.getDefinedType(type));
        }
        symtab.setCurrentScope(ctx.scope);
    }
    @Override public void exitFunctionDeclaration(KotlinParser.FunctionDeclarationContext ctx) {
        symtab.popScope();
    }
    @Override public void enterDelegationSpecifier(KotlinParser.DelegationSpecifierContext ctx) {
        AnalyzerHandler.getAnalyzer(DelegationSpecifierAnalyzer.class).enterRule(ctx);
    }
    @Override public void exitDelegationSpecifier(KotlinParser.DelegationSpecifierContext ctx) {
        AnalyzerHandler.getAnalyzer(DelegationSpecifierAnalyzer.class).exitRule(ctx);
    }
    @Override public void enterCallExpression(KotlinParser.CallExpressionContext ctx) {
        AnalyzerHandler.getAnalyzer(CallExpressionAnalyzer.class).enterRule(ctx);
    }
    @Override public void exitCallExpression(KotlinParser.CallExpressionContext ctx) {
        AnalyzerHandler.getAnalyzer(CallExpressionAnalyzer.class).exitRule(ctx);
    }

    @Override public void enterFunctionValueParameter(KotlinParser.FunctionValueParameterContext ctx) {
        VariableSymbol v = (VariableSymbol) ctx.symbol;
        if(v != null)
        if (ctx.getChild(0).getChildCount() >= 3) {
            Type t = symtab.getDefinedType(ctx.getChild(0).getChild(2).getText());
            if (t != null) {
                v.setType(t);
            } else {
                CodeValidator.reportCustomError(ErrorDictionary.UNDECLARED_TYPE, "", v.getName(), ctx.start.getLine());
            }
        }
    }
    @Override public void enterVariableDeclaration(KotlinParser.VariableDeclarationContext ctx) {
        VariableSymbol v = (VariableSymbol) ctx.symbol;
        String name = ctx.getChild(0).getText();
        if(v != null)
        if (ctx.getChildCount() >= 3){
            Type t = symtab.getDefinedType(ctx.getChild(2).getText());
            if (t != null) {
                v.setType(t);
            } else {
                CodeValidator.reportCustomError(ErrorDictionary.UNDECLARED_TYPE, "", name, ctx.start.getLine());
            }
        }
    }

}
