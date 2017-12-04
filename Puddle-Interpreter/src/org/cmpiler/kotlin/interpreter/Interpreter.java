package org.cmpiler.kotlin.interpreter;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.atn.PredictionMode;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.cmpiler.kotlin.antlr.KotlinLexer;
import org.cmpiler.kotlin.antlr.KotlinParser;
import org.cmpiler.kotlin.ide.controller.EditorController;
import org.cmpiler.kotlin.interpreter.semantics.CodeValidator;
import org.cmpiler.kotlin.interpreter.semantics.KotlinCodeValidator;
import org.cmpiler.kotlin.interpreter.semantics.KotlinParserErrorStrategy;
import org.cmpiler.kotlin.interpreter.parser.KotlinSymbolTableBuilder;
import org.cmpiler.kotlin.utils.config.GlobalConfig;
import org.cmpiler.kotlin.utils.console.Console;
import org.cmpiler.kotlin.interpreter.parser.SymbolTableBuilder1;
import org.cmpiler.kotlin.interpreter.parser.SymbolTableHandler;

import java.io.IOException;
import java.nio.charset.Charset;

public class Interpreter {

    private SymbolTableHandler symtab;
    private static Interpreter instance = null;

    private KotlinLexer lexer;
    private KotlinParser parser;
    private GlobalConfig config;

    private Interpreter(){
        symtab = SymbolTableHandler.getInstance();
        config = GlobalConfig.getInstance();
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
        parser.setErrorHandler(new KotlinParserErrorStrategy());
        parser.addErrorListener(KotlinCodeValidator.getInstance());
        parser.getInterpreter().setPredictionMode(PredictionMode.LL_EXACT_AMBIG_DETECTION);
        return parser;
    }

    private void parseCode(KotlinParser parser){
        // test tree
        ParserRuleContext parserRuleContext = parser.kotlinFile();
        Console.log(Console.DEV_CONSOLE, "Parse Tree: " + parserRuleContext.toStringTree(parser));

        // build & test symbol table
        if(true) {
            // reset symbol table and editor syntax completeion list
            symtab.reset();
            EditorController.getInstance().resetCompletionProvider();
            // tree walker
            ParseTreeWalker treeWalker = new ParseTreeWalker();
            // build scopes and check scope validity
            // will check if a symbol has been defined more than once in a scope
            treeWalker.walk(new KotlinSymbolTableBuilder(), parserRuleContext); //TODO: make another listener solely for highlighting
            SymbolTableHandler.getInstance().printTable();
            if(KotlinCodeValidator.getInstance().isValid())
                Console.log(Console.USER_CONSOLE, "Parsing done. Click RUN to execute.");

        }
        if(!KotlinCodeValidator.getInstance().isValid()){
            Console.log(Console.USER_ERROR, "Build failed! Please fix errors and try again.");
        }
        // run code
        execute(parserRuleContext);
    }

    private void execute(ParserRuleContext parserRuleContext){
        if(KotlinCodeValidator.getInstance().isValid()) {
            Console.log(Console.DEV_CONSOLE, "Running code...");
            // tree walker
            ParseTreeWalker treeWalker = new ParseTreeWalker();
            // build scopes and check scope validity
            // will check if a symbol has been defined more than once in a scope
            treeWalker.walk(new SymbolTableBuilder1(), parserRuleContext); //TODO: make another listener solely for highlighting
            SymbolTableHandler.getInstance().printTable();
            Console.log(Console.USER_CONSOLE, "Execution done.");
        } else
            Console.log(Console.USER_ERROR, "Code contains errors... Please rebuild code and run again.");
    }

}
