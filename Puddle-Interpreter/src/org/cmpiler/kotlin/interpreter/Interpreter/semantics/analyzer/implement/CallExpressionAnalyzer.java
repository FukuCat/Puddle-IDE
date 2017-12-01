package org.cmpiler.kotlin.interpreter.Interpreter.semantics.analyzer.implement;

import org.antlr.symtab.VariableSymbol;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.cmpiler.kotlin.antlr.KotlinParser;
import org.cmpiler.kotlin.antlr.KotlinParserBaseListener;
import org.cmpiler.kotlin.interpreter.Interpreter.semantics.KotlinCodeValidator;
import org.cmpiler.kotlin.interpreter.Interpreter.semantics.analyzer.AbstractAnalyzer;
import org.cmpiler.kotlin.utils.ErrorDictionary;
import org.cmpiler.kotlin.utils.FunctionSignatureGenerator;
import org.kon.jgame.model.utils.list.Stack;

import java.util.ArrayList;
import java.util.List;

public class CallExpressionAnalyzer extends AbstractAnalyzer {



    @Override
    public void enterBuildRule(ParserRuleContext context) {
        KotlinParser.CallExpressionContext ctx = (KotlinParser.CallExpressionContext) context;
        ctx.scope = symtab.getCurrentScope();
    }

    @Override
    public void exitBuildRule(ParserRuleContext context) {

    }

    @Override
    public void evaluateRule(ParserRuleContext context) {
        KotlinParser.CallExpressionContext ctx = (KotlinParser.CallExpressionContext) context;
        symtab.setCurrentScope(ctx.scope);
        ValueArgumentChecker argChecker = new ValueArgumentChecker();
        ParseTreeWalker treeWalker = new ParseTreeWalker();
        treeWalker.walk(argChecker, ctx);
        String name = ctx.getChild(0).getText();
        String signature = FunctionSignatureGenerator.getInstance().toSignature(name, argChecker.getArguments());
        // Resolve
        if(symtab.getCurrentScope().resolve(signature) == null)
            KotlinCodeValidator.reportCustomError(ErrorDictionary.UNDECLARED_FUNCTION, "",ctx.getText(),ctx.start.getLine());


    }

    private class ValueArgumentChecker extends KotlinParserBaseListener {
        private List<String> arguments;
        private Stack<String> typeStack;

        public ValueArgumentChecker(){
            arguments = new ArrayList<>();
            typeStack = new Stack<>();
        }

        @Override public void enterValueArgument(KotlinParser.ValueArgumentContext ctx) {
            TypeChecker typeChecker = new TypeChecker();
            ParseTreeWalker treeWalker = new ParseTreeWalker();
            treeWalker.walk(typeChecker, ctx);
        }

        @Override public void exitValueArgument(KotlinParser.ValueArgumentContext ctx) {
            typeStack.reverse();
            for(String s: typeStack.getStack()) arguments.add(s);
                typeStack.clear();
        }



        private class TypeChecker extends KotlinParserBaseListener {

            @Override
            public void exitCallExpression(KotlinParser.CallExpressionContext ctx){

            }

            // set boolean
            @Override
            public void exitDisjunction(KotlinParser.DisjunctionContext ctx) {

            }

            // set boolean
            @Override
            public void exitConjunction(KotlinParser.ConjunctionContext ctx) {

            }

            // set boolean
            @Override
            public void exitEquality(KotlinParser.EqualityContext ctx) {

            }

            // set boolean
            @Override
            public void exitComparison(KotlinParser.ComparisonContext ctx) {

            }

            // var x "in" 1..5
            @Override
            public void exitInfixOperation(KotlinParser.InfixOperationContext ctx) {

            }

            // 1 ".." 5
            @Override
            public void exitRangeExpression(KotlinParser.RangeExpressionContext ctx) {

            }

            // +
            @Override
            public void exitAdditiveExpression(KotlinParser.AdditiveExpressionContext ctx) {
                if(typeStack.getSize() > 0){
                    String type1 = typeStack.pop();
                    while(!typeStack.isEmpty()){
                        String type2 = typeStack.pop();
                        if(symtab.getCurrentScope().resolve(ctx.getChild(0).getText()) != null)
                            KotlinCodeValidator.reportCustomError(ErrorDictionary.UNDECLARED_TYPE, "", ctx.getChild(0).getText(), ctx.start.getLine());
                        else if(type1.equals("String") || type2.equals("String"))
                            type1 = "String";
                        else if(type1.equals("Double") || type2.equals("Double"))
                            type1 = "Double";
                        else if(type1.equals("Float") || type2.equals("Float"))
                            type1 = "Float";
                        else if(type1.equals("Long") || type2.equals("Long"))
                            type1 = "Long";
                        else if(type1.equals("Int") || type2.equals("Int"))
                            type1 = "Int";

                    }
                    typeStack.push(type1);
                }
            }

            // *
            @Override
            public void exitMultiplicativeExpression(KotlinParser.MultiplicativeExpressionContext ctx) {

            }

            // += -= =+ -=
            @Override
            public void exitAssignment(KotlinParser.AssignmentContext ctx) {

            }

            // "string", this , 5 , constant
            @Override
            public void exitPrimaryExpression(KotlinParser.PrimaryExpressionContext ctx) {
                if (ctx.getChild(0) instanceof KotlinParser.LiteralConstantContext) {
                    KotlinParser.LiteralConstantContext x = (KotlinParser.LiteralConstantContext) ctx.getChild(0);
                    switch (((TerminalNode) x.getChild(0)).getSymbol().getType()) {
                        case KotlinParser.BinLiteral: // binary
                            break;
                        case KotlinParser.BooleanLiteral:
                            typeStack.push(symtab.PREDEFINED.getSymbol("Boolean").getName());
                            break;
                        case KotlinParser.IntegerLiteral:
                            typeStack.push(symtab.PREDEFINED.getSymbol("Int").getName());
                            break;
                        case KotlinParser.HexLiteral:
                            break;
                        case KotlinParser.CharacterLiteral:
                            typeStack.push(symtab.PREDEFINED.getSymbol("Char").getName());
                            break;
                        case KotlinParser.RealLiteral: // float or double
                            String errorVariable = null;
                            if(x.getChild(0) != null){
                                if(x.getChild(0).getText().endsWith("f")||x.getChild(0).getText().endsWith("F")){
                                    typeStack.push(symtab.PREDEFINED.getSymbol("Float").getName());
                                } else {
                                    typeStack.push(symtab.PREDEFINED.getSymbol("Double").getName());
                                }
                            } else errorVariable = ctx.getText();
                            if(errorVariable!= null)
                                KotlinCodeValidator.reportCustomError(ErrorDictionary.UNDECLARED_TYPE, "", errorVariable, ctx.start.getLine());
                            break;
                        case KotlinParser.NullLiteral:
                            typeStack.push(symtab.PREDEFINED.getSymbol("null").getName());
                            break;
                        case KotlinParser.LongLiteral:
                            typeStack.push(symtab.PREDEFINED.getSymbol("Long").getName());
                            break;
                    }
                } // number
                else if (ctx.getChild(0) instanceof KotlinParser.StringLiteralContext) {
                    typeStack.push(symtab.PREDEFINED.getSymbol("String").getName());
                } // string
                else if (ctx.getChild(0) instanceof KotlinParser.ThisExpressionContext) {
                    typeStack.push(symtab.PREDEFINED.getSymbol("Boolean").getName());
                } // current class
                else if (ctx.getChild(0) instanceof KotlinParser.SimpleIdentifierContext) {
                    VariableSymbol v = (VariableSymbol)symtab.getCurrentScope().resolve(ctx.getChild(0).getText());
                    if(v != null){
                        String name = v.getType().getName();
                        typeStack.push(name);
                    } else {
                        KotlinCodeValidator.reportCustomError(ErrorDictionary.UNDECLARED_TYPE, "", ctx.getChild(0).getText(), ctx.start.getLine());
                    }
                }

            }
        }
        public List<String> getArguments(){return arguments;}

    }

}
