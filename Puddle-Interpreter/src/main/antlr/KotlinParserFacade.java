package main.antlr;

import main.error.ParserErrorListener;
import main.error.ParserErrorStrategy;
import org.antlr.v4.runtime.tree.ParseTree;
import utils.ConsoleLogger;
import main.antlr.kotlin.KotlinLexer;
import main.antlr.kotlin.KotlinParser;
import org.antlr.v4.runtime.*;

import java.io.IOException;
import java.nio.charset.Charset;
import main.error.LexerErrorStrategy;
import org.antlr.v4.runtime.atn.PredictionMode;

public class KotlinParserFacade {

    public KotlinParser.KotlinFileContext parseString(String text) throws IOException {
        // charset = "UTF-8"
        LexerErrorStrategy lexer = new LexerErrorStrategy(CharStreams.fromString(text));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        // print tokens
        //printTokens(tokens);
        KotlinParser parser = new KotlinParser(tokens);
        parser.removeErrorListeners();
        parser.addErrorListener(new ParserErrorListener());
        parser.setErrorHandler(new ParserErrorStrategy());
        parser.getInterpreter().setPredictionMode(PredictionMode.LL_EXACT_AMBIG_DETECTION);
        // print syntax tree
        printSyntaxTree(parser.kotlinFile());
        return parser.kotlinFile();
    }

    public KotlinParser.KotlinFileContext parseFile(String path, String charset) throws IOException {
        // charset = "UTF-8"
        LexerErrorStrategy lexer = new LexerErrorStrategy(CharStreams.fromFileName(path, Charset.forName(charset)));
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
        ConsoleLogger.log("Printing Abstract Syntax Tree...\n");
        exploreSyntaxTree(ctx, 0, true);
        ConsoleLogger.log("Done.\n");
    }
    private void exploreSyntaxTree(RuleContext ctx, int indentation, boolean doPrint) {
        String ruleName = KotlinParser.ruleNames[ctx.getRuleIndex()];
        if(doPrint) {
            for (int i = 0; i < indentation; i++) {
                ConsoleLogger.log(" ");
            }
            ConsoleLogger.log("["+ruleName + ":"+ctx.getRuleIndex()+"]: [" + ctx.getText()+"]\n");
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

        ConsoleLogger.log("Printing Tokens...\n");
        ConsoleLogger.log("Token count: " + tokens.getNumberOfOnChannelTokens()+"\n");
        for(Token t: tokens.getTokens()){
            ConsoleLogger.log("["+vocab.getSymbolicName(t.getType())+":"+t.getType()+"]: ["+t.getText()+"]\n");
        }
        ConsoleLogger.log("Done.\n");
        }
    }
}
