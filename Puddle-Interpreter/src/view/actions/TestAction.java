package view.actions;

import main.antlr.KotlinParserFacade;
import main.antlr.kotlin.listener.AntlrKotlinListener;
import model.SharedData;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class TestAction implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        SharedData.getInstance().clearConsole();
        //new AbstractSyntaxTreePrinter().print( new KotlinParserFacade().parseString(SharedData.getInstance().getEditorText()));

        parse();

    }

    public void parse(){
        KotlinParserFacade parser = new KotlinParserFacade();
        try {
            ParseTreeWalker.DEFAULT.walk(new AntlrKotlinListener(), parser.parseString(SharedData.getInstance().getEditorText()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
