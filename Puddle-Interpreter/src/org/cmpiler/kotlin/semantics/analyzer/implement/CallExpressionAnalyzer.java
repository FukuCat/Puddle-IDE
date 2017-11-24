package org.cmpiler.kotlin.semantics.analyzer.implement;

import org.antlr.symtab.VariableSymbol;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.cmpiler.kotlin.antlr.KotlinParser;
import org.cmpiler.kotlin.antlr.KotlinParserBaseListener;
import org.cmpiler.kotlin.interpreter.parser.CodeValidator;
import org.cmpiler.kotlin.interpreter.parser.ErrorDictionary;
import org.cmpiler.kotlin.semantics.analyzer.AbstractAnalyzer;
import org.cmpiler.kotlin.utils.FunctionSignatureGenerator;
import org.kon.jgame.model.utils.SimpleStack;

import java.util.ArrayList;
import java.util.List;

public class CallExpressionAnalyzer extends AbstractAnalyzer {



    @Override
    public void enterRule(ParserRuleContext context) {
        KotlinParser.CallExpressionContext ctx = (KotlinParser.CallExpressionContext) context;
        ValueArgumentChecker argChecker = new ValueArgumentChecker();
        ParseTreeWalker treeWalker = new ParseTreeWalker();
        treeWalker.walk(argChecker, ctx);
        String name = ctx.getChild(0).getText();
        String signature = FunctionSignatureGenerator.getInstance().toSignature(name, argChecker.getArguments());
        // Resolve
        if(symtab.getCurrentScope().resolve(signature) == null)
            CodeValidator.reportCustomError(ErrorDictionary.UNDECLARED_FUNCTION, "",ctx.getText(),ctx.start.getLine());
        //Console.log(Console.DEV_ERROR, signature);

    }

    @Override
    public void exitRule(ParserRuleContext context) {

    }

    private class ValueArgumentChecker extends KotlinParserBaseListener {
        private List<String> arguments;
        private SimpleStack<String> typeStack;

        public ValueArgumentChecker(){
            arguments = new ArrayList<>();
            typeStack = new SimpleStack<>();
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
                if(typeStack.getSize() > 1){
                    String type1 = typeStack.pop();
                    String type2 = typeStack.pop();
                    if(type1.equals("String") || type2.equals("String"))
                        typeStack.push("String");
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
                            switch (((TerminalNode) x.getChild(0).getChild(0)).getSymbol().getType()) {
                                case KotlinParser.FloatLiteral:
                                    typeStack.push(symtab.PREDEFINED.getSymbol("Float").getName());
                                    break;
                                case KotlinParser.DoubleLiteral:
                                    typeStack.push(symtab.PREDEFINED.getSymbol("Double").getName());
                                    break;
                            }
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
                        CodeValidator.reportCustomError(ErrorDictionary.UNDECLARED_TYPE, "", ctx.getChild(0), ctx.start.getLine());
                    }
                }

            }
        }
        public List<String> getArguments(){return arguments;}

    }

}
