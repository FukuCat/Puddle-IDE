package org.cmpiler.kotlin.utils;

import org.antlr.symtab.FunctionSymbol;
import org.antlr.symtab.Type;
import org.antlr.symtab.VariableSymbol;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.cmpiler.kotlin.antlr.KotlinParser;
import org.cmpiler.kotlin.antlr.KotlinParserBaseListener;
import org.cmpiler.kotlin.interpreter.parser.SymbolTableHandler;
import org.cmpiler.kotlin.interpreter.semantics.KotlinCodeValidator;
import org.kon.jgame.model.utils.list.Stack;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class ExpressionEvaluator extends KotlinParserBaseListener {

    private SymbolTableHandler symtab = SymbolTableHandler.getInstance();

    private Type type;

    @Override
    public void enterExpression(KotlinParser.ExpressionContext ctx){
        TypeChecker typeChecker = new TypeChecker();
        ParseTreeWalker treeWalker = new ParseTreeWalker();
        treeWalker.walk(typeChecker, ctx);
        setType(typeChecker.getType());
    }

    public Type evaluate(ParserRuleContext ctx){
        TypeChecker typeChecker = new TypeChecker();
        ParseTreeWalker treeWalker = new ParseTreeWalker();
        treeWalker.walk(typeChecker, ctx);
        setType(typeChecker.getType());
        return type;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    protected class ValueArgumentChecker extends KotlinParserBaseListener {
        private List<Type> arguments;
        private TypeChecker typeChecker;

        public ValueArgumentChecker() {
            arguments = new ArrayList<>();
        }

        @Override
        public void enterValueArgument(KotlinParser.ValueArgumentContext ctx) {
            typeChecker = new TypeChecker();
            ParseTreeWalker treeWalker = new ParseTreeWalker();
            treeWalker.walk(typeChecker, ctx);
        }

        @Override
        public void exitValueArgument(KotlinParser.ValueArgumentContext ctx) {
            arguments.add(typeChecker.getType());
        }

        public List<Type> getArgs(){return arguments;}
    }

    protected class TypeChecker extends KotlinParserBaseListener {

        private Stack<TypeScope> scopeStack;

        private HashSet<Type> mathable, stringable;

        private Type result;

        public Type getResult() {
            return result;
        }

        public void setResult(Type result) {
            this.result = result;
        }

        private class TypeScope{
            Stack<Type> typeStack;

            public TypeScope(){
                typeStack = new Stack<>();
            }

            public Stack<Type> getTypeStack() {
                return typeStack;
            }
        }

        public Type getType(){
            return result;
        }

        public TypeChecker(){
            scopeStack = new Stack<>();
            mathable = new HashSet<>();
            stringable = new HashSet<>();
            mathable.add(symtab.getDefinedType("Int"));
            mathable.add(symtab.getDefinedType("Long"));
            mathable.add(symtab.getDefinedType("Double"));
            mathable.add(symtab.getDefinedType("Float"));
            stringable.add(symtab.getDefinedType("String"));
            stringable.add(symtab.getDefinedType("Char"));
        }

        // set boolean
        @Override
        public void enterDisjunction(KotlinParser.DisjunctionContext ctx) {
            scopeStack.push(new TypeScope());
        }
        @Override
        public void exitDisjunction(KotlinParser.DisjunctionContext ctx) {
            Type tempType = null;
            if(!scopeStack.isEmpty()){
                TypeScope typeScope = scopeStack.pop();
                    while(typeScope.getTypeStack().getSize() > 1){
                        Type t1 = typeScope.getTypeStack().pop();
                        Type t2 = typeScope.getTypeStack().pop();

                        if(t1.getName().equalsIgnoreCase("boolean") && t2.getName().equalsIgnoreCase("boolean"))
                            typeScope.getTypeStack().push(t1);
                        else
                            KotlinCodeValidator.reportCustomError(ErrorDictionary.TYPE_CAST_MISMATCH, "", ctx.getChild(0).getText(), ctx.start.getLine());
                    }
                    if(typeScope.getTypeStack().getSize() > 0) {
                        tempType = typeScope.getTypeStack().pop();
                        if(!scopeStack.isEmpty())
                            scopeStack.peek().getTypeStack().push(tempType);
                        else
                            result = tempType;
                    }
            }
        }

        // set boolean
        @Override
        public void enterConjunction(KotlinParser.ConjunctionContext ctx) {
            scopeStack.push(new TypeScope());
        }
        @Override
        public void exitConjunction(KotlinParser.ConjunctionContext ctx) {
            Type tempType = null;
            if(!scopeStack.isEmpty()){
                TypeScope typeScope = scopeStack.pop();
                    while(typeScope.getTypeStack().getSize() > 1){
                        Type t1 = typeScope.getTypeStack().pop();
                        Type t2 = typeScope.getTypeStack().pop();

                        if(t1.getName().equalsIgnoreCase("boolean") && t2.getName().equalsIgnoreCase("boolean"))
                            typeScope.getTypeStack().push(t1);
                        else
                            KotlinCodeValidator.reportCustomError(ErrorDictionary.TYPE_CAST_MISMATCH, "", ctx.getChild(0).getText(), ctx.start.getLine());
                    }
                    if(typeScope.getTypeStack().getSize() > 0) {
                        tempType = typeScope.getTypeStack().pop();
                        scopeStack.peek().getTypeStack().push(tempType);
                    }
            }
        }

        // set boolean
        @Override
        public void enterEquality(KotlinParser.EqualityContext ctx) {
            scopeStack.push(new TypeScope());
        }

        @Override
        public void exitEquality(KotlinParser.EqualityContext ctx) {
            Type tempType = null;
            if(!scopeStack.isEmpty()){
                TypeScope typeScope = scopeStack.pop();
                    while(typeScope.getTypeStack().getSize() > 1){
                        Type t1 = typeScope.getTypeStack().pop();
                        Type t2 = typeScope.getTypeStack().pop();

                        if(t1.getName().equalsIgnoreCase("boolean") && t2.getName().equalsIgnoreCase("boolean")
                                || mathable.contains(t1) && mathable.contains(t2)
                                || t1.getName().equalsIgnoreCase("char") && t2.getName().equalsIgnoreCase("char"))
                            typeScope.getTypeStack().push(symtab.getDefinedType("Boolean"));
                        else
                            KotlinCodeValidator.reportCustomError(ErrorDictionary.TYPE_CAST_MISMATCH, "", ctx.getChild(0).getText(), ctx.start.getLine());
                    }

                if(typeScope.getTypeStack().getSize() > 0) {
                    tempType = typeScope.getTypeStack().pop();
                    scopeStack.peek().getTypeStack().push(tempType);
                }
            }
        }

        // set boolean
        @Override
        public void enterComparison(KotlinParser.ComparisonContext ctx) {
            scopeStack.push(new TypeScope());
        }

        @Override
        public void exitComparison(KotlinParser.ComparisonContext ctx) {
            Type tempType = null;
            if(!scopeStack.isEmpty()){
                TypeScope typeScope = scopeStack.pop();
                while(typeScope.getTypeStack().getSize() > 1){
                    Type t1 = typeScope.getTypeStack().pop();
                    Type t2 = typeScope.getTypeStack().pop();

                    if(mathable.contains(t1) && mathable.contains(t2))
                        typeScope.getTypeStack().push(symtab.getDefinedType("Boolean"));
                    else
                        KotlinCodeValidator.reportCustomError(ErrorDictionary.TYPE_MISMATCH, "", ctx.getChild(0).getText(), ctx.start.getLine());
                }

                if(typeScope.getTypeStack().getSize() > 0) {
                    tempType = typeScope.getTypeStack().pop();
                    scopeStack.peek().getTypeStack().push(tempType);
                }
            }
        }

        // var x "in" 1..5 ? boolean
        @Override
        public void exitInfixOperation(KotlinParser.InfixOperationContext ctx) {

        }

        // 1 ".." 5
        @Override
        public void exitRangeExpression(KotlinParser.RangeExpressionContext ctx) {

        }

        // +
        @Override
        public void enterAdditiveExpression(KotlinParser.AdditiveExpressionContext ctx) {
            scopeStack.push(new TypeScope());
        }

        @Override
        public void exitAdditiveExpression(KotlinParser.AdditiveExpressionContext ctx) {
            Type tempType = null;

            if(!scopeStack.isEmpty()){
                TypeScope typeScope = scopeStack.pop();
                    while(typeScope.getTypeStack().getSize() > 1){
                        Type t1 = typeScope.getTypeStack().pop();
                        Type t2 = typeScope.getTypeStack().pop();

                        if((mathable.contains(t1) && stringable.contains(t1))||(mathable.contains(t2) && stringable.contains(t2)))
                            typeScope.getTypeStack().push(t1);
                        else if(mathable.contains(t1) && mathable.contains(t2)){
                            Type rankedType = null;
                            if(t1.getName().equalsIgnoreCase("double") || t2.getName().equalsIgnoreCase("double"))
                                rankedType = symtab.getDefinedType("Double");
                            else if(t1.getName().equalsIgnoreCase("float") || t2.getName().equalsIgnoreCase("float"))
                                rankedType = symtab.getDefinedType("Float");
                            else if(t1.getName().equalsIgnoreCase("long") || t2.getName().equalsIgnoreCase("long"))
                                rankedType = symtab.getDefinedType("Long");
                            else if(t1.getName().equalsIgnoreCase("int") || t2.getName().equalsIgnoreCase("int"))
                                rankedType = symtab.getDefinedType("Int");
                            typeScope.getTypeStack().push(rankedType);
                        }
                        else if(stringable.contains(t1) && stringable.contains(t2))
                            typeScope.getTypeStack().push(t1);
                        else
                            KotlinCodeValidator.reportCustomError(ErrorDictionary.TYPE_CAST_MISMATCH, "", ctx.getChild(0).getText(), ctx.start.getLine());
                    }

                if(typeScope.getTypeStack().getSize() > 0) {
                    tempType = typeScope.getTypeStack().pop();
                    scopeStack.peek().getTypeStack().push(tempType);
                }
            }
        }

        // *
        @Override
        public void enterMultiplicativeExpression(KotlinParser.MultiplicativeExpressionContext ctx) {
            scopeStack.push(new TypeScope());
        }

        @Override
        public void exitMultiplicativeExpression(KotlinParser.MultiplicativeExpressionContext ctx) {
            Type tempType = null;
            if(!scopeStack.isEmpty()){
                TypeScope typeScope = scopeStack.pop();
                    while(typeScope.getTypeStack().getSize() > 1){
                        Type t1 = typeScope.getTypeStack().pop();
                        Type t2 = typeScope.getTypeStack().pop();


                        if(mathable.contains(t1) && mathable.contains(t2)){
                            Type rankedType = null;
                            if(t1.getName().equalsIgnoreCase("double") || t2.getName().equalsIgnoreCase("double"))
                                rankedType = symtab.getDefinedType("Double");
                            else if(t1.getName().equalsIgnoreCase("float") || t2.getName().equalsIgnoreCase("float"))
                                rankedType = symtab.getDefinedType("Float");
                            else if(t1.getName().equalsIgnoreCase("long") || t2.getName().equalsIgnoreCase("long"))
                                rankedType = symtab.getDefinedType("Long");
                            else if(t1.getName().equalsIgnoreCase("int") || t2.getName().equalsIgnoreCase("int"))
                                rankedType = symtab.getDefinedType("Int");
                            typeScope.getTypeStack().push(rankedType);
                        }
                        else
                            KotlinCodeValidator.reportCustomError(ErrorDictionary.TYPE_CAST_MISMATCH, "", ctx.getChild(0).getText(), ctx.start.getLine());
                    }


                if(typeScope.getTypeStack().getSize() > 0) {
                    tempType = typeScope.getTypeStack().pop();
                    scopeStack.peek().getTypeStack().push(tempType);
                }
            }
        }

        // += -= =+ -=

        @Override
        public void enterAssignment(KotlinParser.AssignmentContext ctx){
            scopeStack.push(new TypeScope());
        }

        @Override
        public void exitAssignment(KotlinParser.AssignmentContext ctx) {
            Type tempType = null;
            if(!scopeStack.isEmpty()){
                TypeScope typeScope = scopeStack.pop();
                    while(!typeScope.getTypeStack().isEmpty()){
                        Type t1 = typeScope.getTypeStack().pop();
                        Type t2 = typeScope.getTypeStack().pop();

                        if(mathable.contains(t1) && mathable.contains(t2))
                            typeScope.getTypeStack().push(t1);
                        else
                            KotlinCodeValidator.reportCustomError(ErrorDictionary.TYPE_CAST_MISMATCH, "", ctx.getChild(0).getText(), ctx.start.getLine());
                    }


                if(typeScope.getTypeStack().getSize() > 0) {
                    tempType = typeScope.getTypeStack().pop();
                    scopeStack.peek().getTypeStack().push(tempType);
                }
            }
        }

        // "string", this , 5 , constant
        public void enterPrimaryExpression(KotlinParser.PrimaryExpressionContext ctx) {
            if (ctx.getChild(0) instanceof KotlinParser.LiteralConstantContext) {
                KotlinParser.LiteralConstantContext x = (KotlinParser.LiteralConstantContext) ctx.getChild(0);
                switch (((TerminalNode) x.getChild(0)).getSymbol().getType()) {
                    case KotlinParser.BinLiteral: // binary
                        break;
                    case KotlinParser.BooleanLiteral:
                        scopeStack.peek().getTypeStack().push(symtab.getDefinedType("Boolean"));
                        break;
                    case KotlinParser.IntegerLiteral:
                        scopeStack.peek().getTypeStack().push(symtab.getDefinedType("Int"));
                        break;
                    case KotlinParser.HexLiteral:
                        break;
                    case KotlinParser.CharacterLiteral:
                        scopeStack.peek().getTypeStack().push(symtab.getDefinedType("Char"));
                        break;
                    case KotlinParser.RealLiteral: // float or double
                        String errorVariable = null;
                        if(x.getChild(0) != null){
                            if(x.getChild(0).getText().endsWith("f")||x.getChild(0).getText().endsWith("F")){
                                scopeStack.peek().getTypeStack().push(symtab.getDefinedType("Float"));
                            } else {
                                scopeStack.peek().getTypeStack().push(symtab.getDefinedType("Double"));
                            }
                        } else errorVariable = ctx.getText();
                        if(errorVariable!= null)
                            KotlinCodeValidator.reportCustomError(ErrorDictionary.UNDECLARED_TYPE, "", errorVariable, ctx.start.getLine());
                        break;
                    case KotlinParser.NullLiteral:
                        scopeStack.peek().getTypeStack().push(symtab.getDefinedType("null"));
                        break;
                    case KotlinParser.LongLiteral:
                        scopeStack.peek().getTypeStack().push(symtab.getDefinedType("Long"));
                        break;
                }
            } // number
            else if (ctx.getChild(0) instanceof KotlinParser.StringLiteralContext) {
                scopeStack.peek().getTypeStack().push(symtab.getDefinedType("String"));
            } // string
            else if (ctx.getChild(0) instanceof KotlinParser.ThisExpressionContext) {
                //TODO: return current class
            } // current class
        }

        public void enterCallExpression(KotlinParser.CallExpressionContext ctx){
            scopeStack.push(new TypeScope());
        }

        public void exitCallExpression(KotlinParser.CallExpressionContext ctx){
            Type tempType = null;

            ValueArgumentChecker argChecker = new ValueArgumentChecker();
            ParseTreeWalker treeWalker = new ParseTreeWalker();
            treeWalker.walk(argChecker, ctx.parent.parent);
            String name = ctx.getChild(0).getText();
            String signature = FunctionSignatureGenerator.getInstance().toSignatureFromTypeList(name, argChecker.getArgs());
            FunctionSymbol f = (FunctionSymbol) symtab.getCurrentScope().resolve(signature);
            if(f == null){
                scopeStack.peek().getTypeStack().pop();
                KotlinCodeValidator.reportCustomError(ErrorDictionary.UNDECLARED_FUNCTION, "", ctx.getChild(0).getText(), ctx.start.getLine());
            } else {
                tempType = f.getType();
                scopeStack.peek().getTypeStack().push(f.getType());
            }


            if(!scopeStack.isEmpty()){
                TypeScope typeScope = scopeStack.pop();
                while(!typeScope.getTypeStack().isEmpty()){
                    typeScope.getTypeStack().pop();
                }

                scopeStack.peek().getTypeStack().push(tempType);

            }
        }

        @Override
        public void exitPrimaryExpression(KotlinParser.PrimaryExpressionContext ctx) {
            if (ctx.getChild(0) instanceof KotlinParser.SimpleIdentifierContext) {
                if(!(ctx.parent.parent instanceof KotlinParser.CallExpressionContext)) {
                    VariableSymbol v = (VariableSymbol)symtab.getCurrentScope().resolve(ctx.getChild(0).getText());
                    if(v != null){
                        scopeStack.peek().getTypeStack().push( v.getType());
                    } else {
                        scopeStack.peek().getTypeStack().push( symtab.getDefinedType("null"));
                        KotlinCodeValidator.reportCustomError(ErrorDictionary.UNDECLARED_TYPE, "", ctx.getChild(0).getText(), ctx.start.getLine());
                    }
                }
            }
        }
    }

}

