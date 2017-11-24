package org.cmpiler.kotlin.interpreter.parser.symboltable;

import org.cmpiler.kotlin.antlr.KotlinParser;
import org.cmpiler.kotlin.antlr.KotlinParserBaseListener;
import org.cmpiler.kotlin.semantics.analyzer.AnalyzerHandler;
import org.cmpiler.kotlin.semantics.analyzer.implement.*;

public class SymbolTableBuilder extends KotlinParserBaseListener {

    @Override
    public void enterKotlinFile(KotlinParser.KotlinFileContext ctx) {
        AnalyzerHandler.getAnalyzer(KotlinFileAnalyzer.class).enterRule(ctx);
    }

    @Override
    public void exitKotlinFile(KotlinParser.KotlinFileContext ctx) {
        AnalyzerHandler.getAnalyzer(KotlinFileAnalyzer.class).exitRule(ctx);
    }

    @Override
    public void enterBlock(KotlinParser.BlockContext ctx) {
        AnalyzerHandler.getAnalyzer(BlockAnalyzer.class).enterRule(ctx);
    }

    @Override
    public void exitBlock(KotlinParser.BlockContext ctx) {
        AnalyzerHandler.getAnalyzer(BlockAnalyzer.class).exitRule(ctx);
    }

    @Override public void enterClassDeclaration(KotlinParser.ClassDeclarationContext ctx) {
        AnalyzerHandler.getAnalyzer(ClassDeclarationAnalyzer.class).enterRule(ctx);
    }

    @Override public void exitClassDeclaration(KotlinParser.ClassDeclarationContext ctx) {
        AnalyzerHandler.getAnalyzer(ClassDeclarationAnalyzer.class).exitRule(ctx);
    }

    @Override public void enterFunctionDeclaration(KotlinParser.FunctionDeclarationContext ctx) {
        AnalyzerHandler.getAnalyzer(FunctionDeclarationAnalyzer.class).enterRule(ctx);
    }
    @Override public void exitFunctionDeclaration(KotlinParser.FunctionDeclarationContext ctx) {
        AnalyzerHandler.getAnalyzer(FunctionDeclarationAnalyzer.class).exitRule(ctx);
    }
    @Override public void enterVariableDeclaration(KotlinParser.VariableDeclarationContext ctx) {
        AnalyzerHandler.getAnalyzer(VariableDeclarationAnalyzer.class).enterRule(ctx);
    }
    @Override public void exitVariableDeclaration(KotlinParser.VariableDeclarationContext ctx) {
        AnalyzerHandler.getAnalyzer(VariableDeclarationAnalyzer.class).exitRule(ctx);
    }
    @Override public void enterFunctionValueParameter(KotlinParser.FunctionValueParameterContext ctx) {
        AnalyzerHandler.getAnalyzer(FunctionValueParameterAnalyzer.class).enterRule(ctx);
    }
    @Override public void exitFunctionValueParameter(KotlinParser.FunctionValueParameterContext ctx) {
        AnalyzerHandler.getAnalyzer(FunctionValueParameterAnalyzer.class).exitRule(ctx);
    }

    @Override public void enterForExpression(KotlinParser.ForExpressionContext ctx) {
        AnalyzerHandler.getAnalyzer(ForExpressionAnalyzer.class).enterRule(ctx);
    }

    @Override public void exitForExpression(KotlinParser.ForExpressionContext ctx) {
        AnalyzerHandler.getAnalyzer(ForExpressionAnalyzer.class).exitRule(ctx);
    }
    @Override public void enterDoWhileExpression(KotlinParser.DoWhileExpressionContext ctx) {
        AnalyzerHandler.getAnalyzer(DoWhileExpressionAnalyzer.class).enterRule(ctx);
    }

    @Override public void exitDoWhileExpression(KotlinParser.DoWhileExpressionContext ctx) {
        AnalyzerHandler.getAnalyzer(DoWhileExpressionAnalyzer.class).exitRule(ctx);
    }

    @Override public void enterWhileExpression(KotlinParser.WhileExpressionContext ctx) {
        AnalyzerHandler.getAnalyzer(WhileExpressionAnalyzer.class).enterRule(ctx);
    }

    @Override public void exitWhileExpression(KotlinParser.WhileExpressionContext ctx) {
        AnalyzerHandler.getAnalyzer(WhileExpressionAnalyzer.class).exitRule(ctx);
    }
}
