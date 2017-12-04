package org.cmpiler.kotlin.interpreter.parser;

import org.antlr.symtab.FunctionSymbol;
import org.antlr.symtab.Scope;
import org.antlr.v4.runtime.ParserRuleContext;
import org.cmpiler.kotlin.antlr.KotlinParser;
import org.cmpiler.kotlin.antlr.KotlinParserBaseListener;
import org.cmpiler.kotlin.utils.ErrorDictionary;
import org.cmpiler.kotlin.interpreter.semantics.KotlinCodeValidator;
import org.cmpiler.kotlin.interpreter.semantics.analyzer.AbstractAnalyzer;
import org.cmpiler.kotlin.interpreter.semantics.analyzer.AnalyzerHandler;
import org.cmpiler.kotlin.interpreter.semantics.analyzer.implement.*;
import org.kon.jgame.model.utils.list.Queue;
import org.kon.jgame.model.utils.wrapper.Pair;
import org.kon.jgame.model.utils.wrapper.Triple;

public class KotlinSymbolTableBuilder extends KotlinParserBaseListener {


    private SymbolTableHandler symtab;
    private Queue<Triple<AbstractAnalyzer, ParserRuleContext, Scope>> evalRules;
    private Queue<Triple<AbstractAnalyzer, ParserRuleContext, Scope>> evalFunctionCalls;
    private Queue<Triple<AbstractAnalyzer, ParserRuleContext, Scope>> evalDotCall;
    private Queue<Triple<AbstractAnalyzer, ParserRuleContext, Scope>> evalStatements;
    private Queue<Pair<ParserRuleContext, Scope>> evalReturnChecks;

    public KotlinSymbolTableBuilder(){
        symtab = SymbolTableHandler.getInstance();
        evalRules = new Queue<>();
        evalFunctionCalls = new Queue<>();
        evalStatements = new Queue<>(); // fill statement list
        evalDotCall = new Queue<>();
        evalReturnChecks =  new Queue<>();
    }

    private void evaluateRules(){
        Scope temp = symtab.getCurrentScope();
        while(!evalRules.isEmpty()){
            Triple<AbstractAnalyzer, ParserRuleContext, Scope> p = evalRules.dequeue();
            AbstractAnalyzer a  = p.getFirst();
            ParserRuleContext c = p.getSecond();
            symtab.setCurrentScope(p.getThird());
            a.evaluateRule(c);
        }
        while(!evalFunctionCalls.isEmpty()){
            Triple<AbstractAnalyzer, ParserRuleContext, Scope> p = evalFunctionCalls.dequeue();
            AbstractAnalyzer a  = p.getFirst();
            ParserRuleContext c = p.getSecond();
            symtab.setCurrentScope(p.getThird());
            a.evaluateRule(c);
        }
        while(!evalStatements.isEmpty()){
            Triple<AbstractAnalyzer, ParserRuleContext, Scope> p = evalStatements.dequeue();
            AbstractAnalyzer a  = p.getFirst();
            ParserRuleContext c = p.getSecond();
            symtab.setCurrentScope(p.getThird());
            a.evaluateRule(c);
        }
        while(!evalReturnChecks.isEmpty()){
            Pair<ParserRuleContext, Scope> p = evalReturnChecks.dequeue();
            ParserRuleContext a  = p.getFirst();
            Scope c = p.getSecond();
            KotlinParser.FunctionDeclarationContext ctx = (KotlinParser.FunctionDeclarationContext) a;
            if(ctx.scope instanceof FunctionSymbol) {
                FunctionSymbol f = ((FunctionSymbol) ctx.scope);
                if((f.getType().getName().equalsIgnoreCase("void") && symtab.getSymbolFunctionWithReturn().contains(f))
                        || (!f.getType().getName().equalsIgnoreCase("void") && !symtab.getSymbolFunctionWithReturn().contains(f)))
                    KotlinCodeValidator.reportCustomError(ErrorDictionary.TYPE_RETURN, "", a.start.getLine());

            }
        }
        symtab.setCurrentScope(temp);
    }

    @Override
    public void enterKotlinFile(KotlinParser.KotlinFileContext ctx) {
        AbstractAnalyzer a = AnalyzerHandler.getAnalyzer(KotlinFileAnalyzer.class);
        a.enterBuildRule(ctx);
        evalRules.enqueue(new Triple<>(a, ctx, symtab.getCurrentScope()));
    }

    @Override
    public void exitKotlinFile(KotlinParser.KotlinFileContext ctx) {
        AnalyzerHandler.getAnalyzer(KotlinFileAnalyzer.class).exitBuildRule(ctx);
        evaluateRules();
        if(symtab.getMainScope()== null){
            KotlinCodeValidator.reportCustomError(ErrorDictionary.MISSING_MAIN, "");
        }
    }

    @Override
    public void enterBlock(KotlinParser.BlockContext ctx) {
        AbstractAnalyzer a = AnalyzerHandler.getAnalyzer(BlockAnalyzer.class);
        a.enterBuildRule(ctx);
        evalRules.enqueue(new Triple<>(a, ctx, symtab.getCurrentScope()));
    }

    @Override
    public void exitBlock(KotlinParser.BlockContext ctx) {
        AnalyzerHandler.getAnalyzer(BlockAnalyzer.class).exitBuildRule(ctx);
    }

    @Override public void enterClassDeclaration(KotlinParser.ClassDeclarationContext ctx) {
        AbstractAnalyzer a = AnalyzerHandler.getAnalyzer(ClassDeclarationAnalyzer.class);
        a.enterBuildRule(ctx);
        evalRules.enqueue(new Triple<>(a, ctx, symtab.getCurrentScope()));
    }

    @Override public void exitClassDeclaration(KotlinParser.ClassDeclarationContext ctx) {
        AnalyzerHandler.getAnalyzer(ClassDeclarationAnalyzer.class).exitBuildRule(ctx);
    }
    @Override public void enterDelegationSpecifier(KotlinParser.DelegationSpecifierContext ctx) {
        AbstractAnalyzer a = AnalyzerHandler.getAnalyzer(DelegationSpecifierAnalyzer.class);
        a.enterBuildRule(ctx);
        evalRules.enqueue(new Triple<>(a, ctx, symtab.getCurrentScope()));
    }
    @Override public void exitDelegationSpecifier(KotlinParser.DelegationSpecifierContext ctx) {
        AnalyzerHandler.getAnalyzer(DelegationSpecifierAnalyzer.class).exitBuildRule(ctx);
    }
    @Override public void enterFunctionDeclaration(KotlinParser.FunctionDeclarationContext ctx) {
        AbstractAnalyzer a = AnalyzerHandler.getAnalyzer(FunctionDeclarationAnalyzer.class);
        a.enterBuildRule(ctx);
        evalRules.enqueue(new Triple<>(a, ctx, symtab.getCurrentScope()));
        evalReturnChecks.enqueue(new Pair<>(ctx, symtab.getCurrentScope()));
    }
    @Override public void exitFunctionDeclaration(KotlinParser.FunctionDeclarationContext ctx) {
        AnalyzerHandler.getAnalyzer(FunctionDeclarationAnalyzer.class).exitBuildRule(ctx);
    }
    @Override public void enterVariableDeclaration(KotlinParser.VariableDeclarationContext ctx) {
        AbstractAnalyzer a = AnalyzerHandler.getAnalyzer(VariableDeclarationAnalyzer.class);
        a.enterBuildRule(ctx);
        evalRules.enqueue(new Triple<>(a, ctx, symtab.getCurrentScope()));
    }
    @Override public void exitVariableDeclaration(KotlinParser.VariableDeclarationContext ctx) {
        AnalyzerHandler.getAnalyzer(VariableDeclarationAnalyzer.class).exitBuildRule(ctx);
    }
    @Override public void enterFunctionValueParameter(KotlinParser.FunctionValueParameterContext ctx) {
        AbstractAnalyzer a = AnalyzerHandler.getAnalyzer(FunctionValueParameterAnalyzer.class);
        a.enterBuildRule(ctx);
        evalRules.enqueue(new Triple<>(a, ctx, symtab.getCurrentScope()));
    }
    @Override public void exitFunctionValueParameter(KotlinParser.FunctionValueParameterContext ctx) {
        AnalyzerHandler.getAnalyzer(FunctionValueParameterAnalyzer.class).exitBuildRule(ctx);
    }

    @Override public void enterForExpression(KotlinParser.ForExpressionContext ctx) {
        AbstractAnalyzer a = AnalyzerHandler.getAnalyzer(ForExpressionAnalyzer.class);
        a.enterBuildRule(ctx);
        evalRules.enqueue(new Triple<>(a, ctx, symtab.getCurrentScope()));
    }

    @Override public void exitForExpression(KotlinParser.ForExpressionContext ctx) {
        AnalyzerHandler.getAnalyzer(ForExpressionAnalyzer.class).exitBuildRule(ctx);
    }
    @Override public void enterDoWhileExpression(KotlinParser.DoWhileExpressionContext ctx) {
        AbstractAnalyzer a = AnalyzerHandler.getAnalyzer(DoWhileExpressionAnalyzer.class);
        a.enterBuildRule(ctx);
        evalRules.enqueue(new Triple<>(a, ctx, symtab.getCurrentScope()));
    }

    @Override public void exitDoWhileExpression(KotlinParser.DoWhileExpressionContext ctx) {
        AnalyzerHandler.getAnalyzer(DoWhileExpressionAnalyzer.class).exitBuildRule(ctx);
    }

    @Override public void enterWhileExpression(KotlinParser.WhileExpressionContext ctx) {
        AbstractAnalyzer a = AnalyzerHandler.getAnalyzer(WhileExpressionAnalyzer.class);
        a.enterBuildRule(ctx);
        evalRules.enqueue(new Triple<>(a, ctx, symtab.getCurrentScope()));
    }

    @Override public void exitWhileExpression(KotlinParser.WhileExpressionContext ctx) {
        AnalyzerHandler.getAnalyzer(WhileExpressionAnalyzer.class).exitBuildRule(ctx);
    }

    @Override public void enterCallExpression(KotlinParser.CallExpressionContext ctx) {
        AbstractAnalyzer a = AnalyzerHandler.getAnalyzer(CallExpressionAnalyzer.class);
        a.enterBuildRule(ctx);
        evalFunctionCalls.enqueue(new Triple<>(a, ctx, symtab.getCurrentScope()));
    }
    @Override public void exitCallExpression(KotlinParser.CallExpressionContext ctx) {
        AnalyzerHandler.getAnalyzer(CallExpressionAnalyzer.class).exitBuildRule(ctx);
    }

    @Override public void enterDotQualifiedExpression(KotlinParser.DotQualifiedExpressionContext ctx) {
        AbstractAnalyzer a = AnalyzerHandler.getAnalyzer(DotQualifiedExpressionAnalyzer.class);
        a.enterBuildRule(ctx);
        evalDotCall.enqueue(new Triple<>(a, ctx, symtab.getCurrentScope()));
    }
    @Override public void exitDotQualifiedExpression(KotlinParser.DotQualifiedExpressionContext ctx) {
        AnalyzerHandler.getAnalyzer(DotQualifiedExpressionAnalyzer.class).exitBuildRule(ctx);
    }

    @Override public void enterStatement(KotlinParser.StatementContext ctx) {
        AbstractAnalyzer a = AnalyzerHandler.getAnalyzer(StatementAnalyzer.class);
        a.enterBuildRule(ctx);
        evalRules.enqueue(new Triple<>(a, ctx, symtab.getCurrentScope()));
    }
    @Override public void exitStatement(KotlinParser.StatementContext ctx) {
        AnalyzerHandler.getAnalyzer(StatementAnalyzer.class).exitBuildRule(ctx);
    }

    @Override public void enterIndexingExpression(KotlinParser.IndexingExpressionContext ctx) {
        AbstractAnalyzer a = AnalyzerHandler.getAnalyzer(IndexingExpressionAnalyzer.class);
        a.enterBuildRule(ctx);
        evalRules.enqueue(new Triple<>(a, ctx, symtab.getCurrentScope()));
    }
    @Override public void exitIndexingExpression(KotlinParser.IndexingExpressionContext ctx) {
        AnalyzerHandler.getAnalyzer(IndexingExpressionAnalyzer.class).exitBuildRule(ctx);
    }

    @Override public void enterJumpExpression(KotlinParser.JumpExpressionContext ctx) {
        AbstractAnalyzer a = AnalyzerHandler.getAnalyzer(JumpExpressionAnalyzer.class);
        a.enterBuildRule(ctx);
        evalStatements.enqueue(new Triple<>(a, ctx, symtab.getCurrentScope()));
    }
    @Override public void exitJumpExpression(KotlinParser.JumpExpressionContext ctx) {
        AnalyzerHandler.getAnalyzer(JumpExpressionAnalyzer.class).exitBuildRule(ctx);
    }

    @Override public void enterIfExpression(KotlinParser.IfExpressionContext ctx) {
        AbstractAnalyzer a = AnalyzerHandler.getAnalyzer(IfExpressionAnalyzer.class);
        a.enterBuildRule(ctx);
        evalRules.enqueue(new Triple<>(a, ctx, symtab.getCurrentScope()));
    }
    @Override public void exitIfExpression(KotlinParser.IfExpressionContext ctx) {
        AnalyzerHandler.getAnalyzer(IfExpressionAnalyzer.class).exitBuildRule(ctx);
    }

}
