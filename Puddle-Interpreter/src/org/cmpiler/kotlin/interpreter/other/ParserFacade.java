package org.cmpiler.kotlin.interpreter.other;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.PredictionMode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.cmpiler.kotlin.antlr.KotlinLexer;
import org.cmpiler.kotlin.antlr.KotlinParser;

import java.io.IOException;
import java.nio.charset.Charset;

public class ParserFacade {

    public KotlinParser.KotlinFileContext parseString(String text) throws IOException {
        // charset = "UTF-8"
        KotlinLexer lexer = new KotlinLexer(CharStreams.fromString(text));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        // print tokens
        //printTokens(tokens);
        KotlinParser parser = new KotlinParser(tokens);
        parser.removeErrorListeners();
        parser.addErrorListener(new ParserErrorListener());
        parser.setErrorHandler(new ParserErrorStrategy());
        parser.getInterpreter().setPredictionMode(PredictionMode.LL_EXACT_AMBIG_DETECTION);
        // print syntax tree
        //printSyntaxTree(parser.kotlinFile());
        return parser.kotlinFile();
    }

    public KotlinParser.KotlinFileContext parseFile(String path, String charset) throws IOException {
        // charset = "UTF-8"
        KotlinLexer lexer = new KotlinLexer(CharStreams.fromFileName(path, Charset.forName(charset)));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        // print tokens
        //printTokens(tokens);
        KotlinParser parser = new KotlinParser(tokens);
        parser.removeErrorListeners();
        parser.addErrorListener(new ParserErrorListener());
        parser.setErrorHandler(new ParserErrorStrategy());
        parser.getInterpreter().setPredictionMode(PredictionMode.LL_EXACT_AMBIG_DETECTION);
        // print syntax tree
        //printSyntaxTree(parser.kotlinFile());
        return parser.kotlinFile();
    }


    public void printSyntaxTree(RuleContext ctx) {
        //Console.log("Printing Abstract Syntax Tree...\n");
        exploreSyntaxTree(ctx, 0, true);
        //Console.log("Done.\n");
    }
    private void exploreSyntaxTree(RuleContext ctx, int indentation, boolean doPrint) {
        String ruleName = KotlinParser.ruleNames[ctx.getRuleIndex()];
        if(doPrint) {
            for (int i = 0; i < indentation; i++) {
               // Console.log(" ");
            }
            //Console.log("["+ruleName + ":"+ctx.getRuleIndex()+"]: [" + ctx.getText()+"]\n");
        }
        boolean isImportant;
        for (int i=0;i<ctx.getChildCount();i++) {
            ParseTree element = ctx.getChild(i);
            boolean isTerminal = false;
            if(element.getChild(i) != null){
                if(element.getChildCount() > 1)
                    isTerminal = element.getChild(i).getChildCount() == 0;
            }
            isImportant = element.getChildCount() > 1 || isTerminal;
            isImportant = true; // Show all rules

            if (element instanceof RuleContext) {
                exploreSyntaxTree((RuleContext)element,
                        isImportant? indentation + 1: indentation,
                        isImportant);
            }
        }
    }

    private void printTokens(CommonTokenStream tokens){
        if(tokens != null){
            Vocabulary vocab = KotlinLexer.VOCABULARY;

            //Console.log("Printing Tokens...\n");
            //Console.log("Token count: " + tokens.getNumberOfOnChannelTokens()+"\n");
            for(Token t: tokens.getTokens()){
                //Console.log("["+vocab.getSymbolicName(t.getType())+":"+t.getType()+"]: ["+t.getText()+"]\n");
            }
            //Console.log("Done.\n");
        }
    }

}