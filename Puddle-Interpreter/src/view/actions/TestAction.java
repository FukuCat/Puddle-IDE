package view.actions;

import main.antlr.AbstractSyntaxTreePrinter;
import main.antlr.ParserFacade;
import main.antlr.kotlin.KotlinLexer;
import main.antlr.kotlin.KotlinParser;
import main.parser.AntlrKotlinListener;
import model.SharedData;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class TestAction implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        SharedData.getInstance().clearConsole();
        //new AbstractSyntaxTreePrinter().print( new ParserFacade().parseString(SharedData.getInstance().getEditorText()));

        parse();

    }

    public void parse(){
        ANTLRInputStream stream = null;
        stream = new ANTLRInputStream(SharedData.getInstance().getEditorText());
        // Get our lexer
        KotlinLexer lexer = new KotlinLexer(stream);

        // Get a list of matched tokens
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // Pass the tokens to the parser
        KotlinParser parser = new KotlinParser(tokens);

        // Walk it and attach our listener
        parser.kotlinFile();
        AntlrKotlinListener listener = new AntlrKotlinListener();
        ParseTreeWalker.DEFAULT.walk(listener, parser.kotlinFile());
    }
}
