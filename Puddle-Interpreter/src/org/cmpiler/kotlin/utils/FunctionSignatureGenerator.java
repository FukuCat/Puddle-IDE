package org.cmpiler.kotlin.utils;

import org.antlr.symtab.Type;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.cmpiler.kotlin.antlr.KotlinParser;
import org.cmpiler.kotlin.antlr.KotlinParserBaseListener;

import java.util.List;

public class FunctionSignatureGenerator {

    private static FunctionSignatureGenerator instance = null;

    private FunctionSignatureGenerator(){ }

    public static FunctionSignatureGenerator getInstance(){
        return instance == null? (instance = new FunctionSignatureGenerator()): instance;
    }

    public String toSignatureFromTypeList(String name, List<Type> type){
        StringBuilder sb = new StringBuilder();
        sb.append(name);
        sb.append('(');
        if(type != null) {
            boolean first = true;
            for (Type s : type) {
                if(first)
                    first = false;
                else
                    sb.append('|');
                sb.append(s.getName());
            }
        }
        sb.append(')');
        return sb.toString();
    }

    public String toSignature(String name, List<String> type){
        StringBuilder sb = new StringBuilder();
        sb.append(name);
        sb.append('(');
        if(type != null) {
            boolean first = true;
            for (String s : type) {
                if(first)
                    first = false;
                else
                    sb.append('|');
                sb.append(s);
            }
        }
        sb.append(')');
        return sb.toString();
    }

    public String toSignature(KotlinParser.FunctionDeclarationContext ctx){
        StringBuilder sb = new StringBuilder();
        sb.append(ctx.identifier().getText());
        sb.append('(');
        if(ctx.getChild(0)!= null){
            boolean isValid = true;
            for(int i = 0; i < ctx.getChild(0).getChildCount(); i++)
                if(ctx.getChild(0).getChild(i) == null)
                    isValid = false;
            if(isValid)
                sb.append(extractParameters(ctx));
        }
        sb.append(')');
        return sb.toString();
    }

    private String extractParameters(KotlinParser.FunctionDeclarationContext ctx){
        ParameterBuilder paramBulder = new ParameterBuilder();
        ParseTreeWalker treeWalker = new ParseTreeWalker();
        treeWalker.walk(paramBulder ,ctx);
        return paramBulder.getParamsSignature();
    }

    private class ParameterBuilder extends KotlinParserBaseListener {

        private String paramsSignature;
        private StringBuilder sb;
        private boolean first;
        public ParameterBuilder(){
            paramsSignature="";
            sb = new StringBuilder();
            first = true;
        }

        @Override public void enterFunctionValueParameter(KotlinParser.FunctionValueParameterContext ctx) {
            if(ctx.getChild(0) != null)
            if (ctx.getChild(0).getChildCount() >= 3){
                if(first){
                    first = false;
                } else {
                    sb.append('|');
                }
                String parameter = ctx.getChild(0).getChild(2).getText();
                sb.append(parameter);
            }
        }
        @Override public void exitFunctionValueParameter(KotlinParser.FunctionValueParameterContext ctx) {
            paramsSignature = sb.toString();
        }


        public String getParamsSignature() {
            return paramsSignature;
        }
    }
}
