package main;

import main.antlr.AbstractSyntaxTreePrinter;
import main.antlr.ParserFacade;
import main.antlr.kotlin.KotlinLexer;
import main.antlr.kotlin.KotlinParser;
import main.scanner.AntlrPuddleListener;
import main.antlr.puddle.PuddleLexer;
import main.antlr.puddle.PuddleParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Driver {
    public static void main(String[] args){

        try {
            new AbstractSyntaxTreePrinter().print( new ParserFacade().parse("rcs/hello_world.pdl", "UTF-8"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void testKotlin(){
        ANTLRInputStream stream = null;
        try {
            stream = new ANTLRInputStream(fileToInputStream("rcs/hello_world.pdl"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        // Get our lexer
        KotlinLexer lexer = new KotlinLexer((org.antlr.v4.runtime.CharStream) stream);

        // Get a list of matched tokens
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        System.out.println(tokens.getNumberOfOnChannelTokens());
        for(Token t: tokens.getTokens())
            System.out.println("["+t.getText()+"]");

        // Pass the tokens to the parser
        KotlinParser parser = new KotlinParser(tokens);


        // Walk it and attach our listener
        parser.kotlinFile();
    }

    public static void testPuddle(){
        ANTLRInputStream stream = null;
        try {
            stream = new ANTLRInputStream(fileToInputStream("rcs/test.pdl"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        // Get our lexer
        PuddleLexer lexer = new PuddleLexer((org.antlr.v4.runtime.CharStream) stream);

        // Get a list of matched tokens
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // Pass the tokens to the parser
        PuddleParser parser = new PuddleParser(tokens);


        // Walk it and attach our listener
        ParseTreeWalker walker = new ParseTreeWalker();
        AntlrPuddleListener listener = new AntlrPuddleListener();
        // Specify our entry point
        walker.walk(listener, (ParseTree) parser.main());
    }

    public static InputStream stringToInputStream(String text) throws UnsupportedEncodingException{
        return new ByteArrayInputStream(text.getBytes(StandardCharsets.UTF_8.name()));
    }

    public static InputStream fileToInputStream(String path) throws FileNotFoundException{
        File initialFile = new File(path);
        return new FileInputStream(initialFile);
    }

}
