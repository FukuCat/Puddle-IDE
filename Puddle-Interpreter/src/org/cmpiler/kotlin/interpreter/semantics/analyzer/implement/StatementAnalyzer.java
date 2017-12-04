package org.cmpiler.kotlin.interpreter.semantics.analyzer.implement;

import org.antlr.symtab.FunctionSymbol;
import org.antlr.symtab.Symbol;
import org.antlr.symtab.Type;
import org.antlr.symtab.VariableSymbol;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.cmpiler.kotlin.antlr.KotlinParser;
import org.cmpiler.kotlin.interpreter.semantics.KotlinCodeValidator;
import org.cmpiler.kotlin.interpreter.semantics.analyzer.AbstractAnalyzer;
import org.cmpiler.kotlin.utils.ErrorDictionary;
import org.cmpiler.kotlin.utils.ExpressionEvaluator;
import org.cmpiler.kotlin.utils.console.Console;

public class StatementAnalyzer extends AbstractAnalyzer {
    // statement
    @Override
    public void enterBuildRule(ParserRuleContext context) {

    }

    @Override
    public void exitBuildRule(ParserRuleContext context) {

    }

    @Override
    public void evaluateRule(ParserRuleContext context) {
        KotlinParser.StatementContext ctx = (KotlinParser.StatementContext) context;

        if(context.getChild(0) instanceof KotlinParser.DeclarationContext)
            evaluateDeclaration((KotlinParser.DeclarationContext) ctx.getChild(0));
        if(context.getChild(0) instanceof KotlinParser.AssignmentContext)
            evaluateAssignment((KotlinParser.AssignmentContext) ctx.getChild(0));
        if(context.getChild(0) instanceof KotlinParser.ExpressionContext)
            evaluateExpression((KotlinParser.ExpressionContext) ctx.getChild(0));
    }

    // declaration
    private void evaluateDeclaration(KotlinParser.DeclarationContext ctx){
        //Console.log(Console.DEV_ERROR, ctx.getText());
    }
    // assignment
    private void evaluateAssignment(KotlinParser.AssignmentContext ctx){
        ParseTree name = null;
        if(ctx.getChild(0).getChild(0) instanceof KotlinParser.PrimaryExpressionContext)
            name = ctx.getChild(0);
        else if(ctx.getChild(0).getChild(0) instanceof KotlinParser.IndexingExpressionContext)
            name = ctx.getChild(0).getChild(0).getChild(0);
        Symbol s = symtab.getCurrentScope().resolve(name.getText());

        if(symtab.isSymbolConstant(s))
            KotlinCodeValidator.reportCustomError(ErrorDictionary.CONST_REASSIGNMENT, "", s.getName(),ctx.start.getLine());
        else {
            String exprectedType = s instanceof VariableSymbol ? ((VariableSymbol) s).getType().getName()
                    : s instanceof FunctionSymbol ? ((FunctionSymbol) s).getType().getName() : "unknown";
            if (ctx.getChild(0).getChild(0) instanceof KotlinParser.IndexingExpressionContext) { //TODO: despaghettify array checking
                if (exprectedType.equalsIgnoreCase("intarray"))
                    exprectedType = "Int";
                else if (exprectedType.equalsIgnoreCase("longarray"))
                    exprectedType = "Long";
                else if (exprectedType.equalsIgnoreCase("floatarray"))
                    exprectedType = "Float";
                else if (exprectedType.equalsIgnoreCase("doublearray"))
                    exprectedType = "Double";
                else if (exprectedType.equalsIgnoreCase("stringarray"))
                    exprectedType = "String";
                else if (exprectedType.equalsIgnoreCase("chararray"))
                    exprectedType = "Char";
            }
            ExpressionEvaluator expressionEvaluator = new ExpressionEvaluator();
            Type t = expressionEvaluator.evaluate((KotlinParser.DisjunctionContext) ctx.getChild(2));
            if (s == null)
                KotlinCodeValidator.reportCustomError(ErrorDictionary.UNDECLARED_VARIABLE, "",name.getText(), ctx.start.getLine());
            else if (t == null)
                KotlinCodeValidator.reportCustomError(ErrorDictionary.TYPE_MISMATCH, name.getText() + " is expecting type: " + exprectedType, ctx.start.getLine());
            else if (!t.getName().equalsIgnoreCase(exprectedType)) {
                KotlinCodeValidator.reportCustomError(ErrorDictionary.TYPE_MISMATCH, ctx.getChild(0).getText() + " is of type: " + exprectedType + " entered type: " + t.getName(), ctx.start.getLine());
            }
        }
        //symtab.getSymbolDefinedInCurrentScope(ctx.getChild(0).getText());
    }
    // call
    private void evaluateExpression(KotlinParser.ExpressionContext ctx){
        //Console.log(Console.DEV_ERROR, ctx.getText());
    }
}
