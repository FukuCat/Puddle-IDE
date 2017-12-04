package org.cmpiler.kotlin.interpreter.semantics.analyzer.implement;

import org.antlr.symtab.FunctionSymbol;
import org.antlr.symtab.MethodSymbol;
import org.antlr.symtab.Scope;
import org.antlr.symtab.Type;
import org.antlr.v4.runtime.ParserRuleContext;
import org.cmpiler.kotlin.antlr.KotlinParser;
import org.cmpiler.kotlin.interpreter.semantics.KotlinCodeValidator;
import org.cmpiler.kotlin.interpreter.semantics.analyzer.AbstractAnalyzer;
import org.cmpiler.kotlin.utils.ErrorDictionary;
import org.cmpiler.kotlin.utils.ExpressionEvaluator;

public class JumpExpressionAnalyzer extends AbstractAnalyzer {
    @Override
    public void enterBuildRule(ParserRuleContext context) {

    }

    @Override
    public void exitBuildRule(ParserRuleContext context) {

    }

    @Override
    public void evaluateRule(ParserRuleContext context) {
        Scope parent = symtab.getCurrentScope().getEnclosingScope();
        boolean hasError = false;
        if(parent instanceof MethodSymbol) {
            MethodSymbol m = (MethodSymbol) parent;
            if(m.getType().getName().equalsIgnoreCase("void")){
                if(context.getChildCount() > 1)
                    hasError = true;
            } else {
                if(context.getChildCount() > 1){
                    ExpressionEvaluator expEval = new ExpressionEvaluator();
                    KotlinParser.ExpressionContext exp = (KotlinParser.ExpressionContext) context.getChild(1);
                    Type t = expEval.evaluate(exp);
                    if(t == null)
                        hasError = true;
                    else if( !t.getName().equalsIgnoreCase(m.getType().getName()))
                        hasError = true;
                } else hasError = true;
            }
            if(!hasError)
                symtab.getSymbolFunctionWithReturn().add((MethodSymbol)parent);
        }else if(parent instanceof FunctionSymbol) {
            FunctionSymbol f = (FunctionSymbol) parent;
            if(f.getType().getName().equalsIgnoreCase("void")){
                if(context.getChildCount() > 1)
                    hasError = true;
            } else {
                if(context.getChildCount() > 1){
                    ExpressionEvaluator expEval = new ExpressionEvaluator();
                    KotlinParser.ExpressionContext exp = (KotlinParser.ExpressionContext) context.getChild(1);
                    Type t = expEval.evaluate(exp);
                    if(t == null)
                        hasError = true;
                    else if( !t.getName().equalsIgnoreCase(f.getType().getName()))
                        hasError = true;
                } else hasError = true;
            }
            if(!hasError)
                symtab.getSymbolFunctionWithReturn().add((FunctionSymbol) parent);

        }
        if(hasError)
            KotlinCodeValidator.reportCustomError(ErrorDictionary.TYPE_RETURN, "", context.start.getLine());
    }
}
