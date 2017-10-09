package main.antlr;

import main.antlr.kotlin.KotlinLexer;
import main.antlr.kotlin.KotlinParser;
import org.antlr.v4.runtime.*;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;

public class ParserFacade {
    public KotlinParser.KotlinFileContext parse(String path, String charset) throws IOException {
        //charset = "UTF-8"
        KotlinLexer lexer = new KotlinLexer(CharStreams.fromFileName(path, Charset.forName(charset)));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        printTokens(tokens);
        KotlinParser parser = new KotlinParser(tokens);
        return parser.kotlinFile();
    }

    private void printTokens(CommonTokenStream tokens){
        System.out.println("Printing Tokens...");
        System.out.println("Token count: " + tokens.getNumberOfOnChannelTokens());
        for(Token t: tokens.getTokens())
            System.out.println("["+t.getText()+"]");
        System.out.println("Done.");
    }
}
