package org.cmpiler.kotlin.interpreter.Interpreter.semantics.analyzer.implement;

import org.antlr.symtab.LocalScope;
import org.antlr.symtab.Type;
import org.antlr.v4.runtime.ParserRuleContext;
import org.cmpiler.kotlin.antlr.KotlinParser;
import org.cmpiler.kotlin.utils.ErrorDictionary;
import org.cmpiler.kotlin.interpreter.Interpreter.semantics.KotlinCodeValidator;
import org.cmpiler.kotlin.interpreter.Interpreter.semantics.analyzer.AbstractAnalyzer;
import org.cmpiler.kotlin.utils.ExpressionEvaluator;

public class WhileExpressionAnalyzer  extends AbstractAnalyzer {
    @Override
    public void enterBuildRule(ParserRuleContext context) {
        KotlinParser.WhileExpressionContext ctx = (KotlinParser.WhileExpressionContext) context;
        LocalScope l = new LocalScope(symtab.getCurrentScope());
        ctx.scope = l;
        symtab.pushScope(l);
    }

    @Override
    public void exitBuildRule(ParserRuleContext context) {
        symtab.popScope();
    }

    @Override
    public void evaluateRule(ParserRuleContext context) {
        KotlinParser.WhileExpressionContext ctx = (KotlinParser.WhileExpressionContext) context;
        ExpressionEvaluator expEval = new ExpressionEvaluator();
        KotlinParser.ExpressionContext exp = ctx.expression();
        Type t = expEval.evaluate(exp);
        if(t == null)
            KotlinCodeValidator.reportCustomError(ErrorDictionary.TYPE_MISMATCH, "", context.start.getLine());
        else if(!t.getName().equalsIgnoreCase("boolean"))
            KotlinCodeValidator.reportCustomError(ErrorDictionary.TYPE_MISMATCH, "", context.start.getLine());
    }

}