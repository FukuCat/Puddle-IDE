package main.antlr;

import Utils.ConsoleLogger;
import main.antlr.kotlin.KotlinLexer;
import main.antlr.kotlin.KotlinParser;
import model.SharedData;
import org.antlr.v4.runtime.*;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.util.HashMap;

public class ParserFacade {

    public KotlinParser.KotlinFileContext parseString(String text) throws IOException {
        //charset = "UTF-8"
        KotlinLexer lexer = new KotlinLexer(CharStreams.fromString(text));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        printTokens(tokens);
        KotlinParser parser = new KotlinParser(tokens);
        return parser.kotlinFile();
    }

    public KotlinParser.KotlinFileContext parseFile(String path, String charset) throws IOException {
        //charset = "UTF-8"
        KotlinLexer lexer = new KotlinLexer(CharStreams.fromFileName(path, Charset.forName(charset)));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        printTokens(tokens);
        KotlinParser parser = new KotlinParser(tokens);
        return parser.kotlinFile();
    }

    private void printTokens(CommonTokenStream tokens){

        Vocabulary vocab = KotlinLexer.VOCABULARY;

        ConsoleLogger.log("Printing Tokens...\n");
        ConsoleLogger.log("Token count: " + tokens.getNumberOfOnChannelTokens()+"\n");
        for(Token t: tokens.getTokens()){
            ConsoleLogger.log("["+vocab.getSymbolicName(t.getType())+"]: ["+t.getText()+"]\n");
        }
        ConsoleLogger.log("Done.\n");
    }
}
