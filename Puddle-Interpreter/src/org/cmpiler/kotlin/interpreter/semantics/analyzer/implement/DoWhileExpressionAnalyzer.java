package org.cmpiler.kotlin.interpreter.semantics.analyzer.implement;

import org.antlr.symtab.LocalScope;
import org.antlr.symtab.Type;
import org.antlr.v4.runtime.ParserRuleContext;
import org.cmpiler.kotlin.antlr.KotlinParser;
import org.cmpiler.kotlin.interpreter.semantics.KotlinCodeValidator;
import org.cmpiler.kotlin.interpreter.semantics.analyzer.AbstractAnalyzer;
import org.cmpiler.kotlin.utils.ErrorDictionary;
import org.cmpiler.kotlin.utils.ExpressionEvaluator;

public class DoWhileExpressionAnalyzer extends AbstractAnalyzer {
    @Override
    public void enterBuildRule(ParserRuleContext context) {
        KotlinParser.DoWhileExpressionContext ctx = (KotlinParser.DoWhileExpressionContext) context;
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
        KotlinParser.DoWhileExpressionContext ctx = (KotlinParser.DoWhileExpressionContext) context;
        ExpressionEvaluator expEval = new ExpressionEvaluator();
        KotlinParser.ExpressionContext exp = ctx.expression();
        Type t = expEval.evaluate(exp);
        if(t == null)
            KotlinCodeValidator.reportCustomError(ErrorDictionary.TYPE_MISMATCH, "", context.start.getLine());
        else if(!t.getName().equalsIgnoreCase("boolean"))
            KotlinCodeValidator.reportCustomError(ErrorDictionary.TYPE_MISMATCH, "", context.start.getLine());
    }

}