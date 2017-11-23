package org.cmpiler.kotlin.interpreter.parser;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.atn.PredictionMode;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.cmpiler.kotlin.antlr.KotlinLexer;
import org.cmpiler.kotlin.antlr.KotlinParser;
import org.cmpiler.kotlin.interpreter.console.Console;
import org.cmpiler.kotlin.interpreter.parser.symboltable.SymbolTableBuilder;
import org.cmpiler.kotlin.interpreter.parser.symboltable.SymbolTableBuilder1;
import org.cmpiler.kotlin.interpreter.parser.symboltable.SymbolTableHandler;

import java.io.IOException;
import java.nio.charset.Charset;

public class Interpreter {

    private static Interpreter instance = null;
    private boolean devMode;

    private Interpreter(){
        devMode = false;
    }

    public static Interpreter getInstance(){
        return instance == null? (instance = new Interpreter()):instance;
    }

    public void parseText(String text){
        CodeValidator.getInstance().reset();

        // lexer
        KotlinLexer lexer = generateLexer(text);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        // parser
        KotlinParser parser = generateParser(tokens);

        parseCode(parser);
    }

    public void parseFile(String path, String charset) throws IOException{
        CodeValidator.getInstance().reset();

        // lexer
        KotlinLexer lexer = generateLexer(path, charset);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        // parser
        KotlinParser parser = generateParser(tokens);

        parseCode(parser);
    }

    private KotlinLexer generateLexer(String text){
        // lexer
        KotlinLexer lexer = new KotlinLexer(CharStreams.fromString(text));
        return lexer;
    }

    private KotlinLexer generateLexer(String path, String charset) throws IOException {
        // lexer
        KotlinLexer lexer = new KotlinLexer(CharStreams.fromFileName(path, Charset.forName(charset)));
        return lexer;
    }

    private KotlinParser generateParser(CommonTokenStream tokens){
        KotlinParser parser = new KotlinParser(tokens);
        parser.removeErrorListeners();
        //parser.addErrorListener(new DiagnosticErrorListener());
        parser.addErrorListener(CodeValidator.getInstance());
        parser.getInterpreter().setPredictionMode(PredictionMode.LL_EXACT_AMBIG_DETECTION);
        return parser;
    }

    private void parseCode(KotlinParser parser){
        // test tree
        ParserRuleContext parserRuleContext = parser.kotlinFile();
        Console.log(Console.DEV_CONSOLE, "Parse Tree: " + parserRuleContext.toStringTree(parser));

        // build & test symbol table
        if(CodeValidator.getInstance().isValid()) {
            // reset symbol table
            SymbolTableHandler.reset();
            // tree walker
            ParseTreeWalker treeWalker = new ParseTreeWalker();
            // build scopes and check scope validity
            // will check if a symbol has been defined more than once in a scope
            treeWalker.walk(new SymbolTableBuilder(), parserRuleContext); //TODO: make another listener solely for highlighting
            SymbolTableHandler.getInstance().printTable();
            Console.log(Console.USER_CONSOLE, "Parsing done. Click RUN to execute.");
        }
        //add another if statement here for 2nd SymbolTableHandler
        if(CodeValidator.getInstance().isValid()) {
            // tree walker
            ParseTreeWalker treeWalker = new ParseTreeWalker();
            // build scopes and check scope validity
            // will check if a symbol has been defined more than once in a scope
            treeWalker.walk(new SymbolTableBuilder1(), parserRuleContext); //TODO: make another listener solely for highlighting
            SymbolTableHandler.getInstance().printTable();
            Console.log(Console.USER_CONSOLE, "Execution done.");
        }
    }

}
