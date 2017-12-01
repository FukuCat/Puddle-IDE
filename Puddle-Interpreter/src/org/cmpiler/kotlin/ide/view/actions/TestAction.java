package org.cmpiler.kotlin.ide.view.actions;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import org.cmpiler.kotlin.ide.model.SharedData;
import org.cmpiler.kotlin.interpreter.Interpreter.Interpreter;

public class TestAction implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        SharedData.getInstance().clearConsole();
        //new AbstractSyntaxTreePrinter().print( new KotlinParserFacade().parseString(SharedData.getInstance().getEditorText()));

        parse();
    }

    public void parse(){
        SharedData.getInstance().setErrorLine(null);
        /*KotlinParserFacade parser = new KotlinParserFacade();
        try {
            ParseTreeWalker.DEFAULT.walk(new AntlrKotlinListener(), parser.parseString(SharedData.getInstance().getEditorText()));
        } catch (IOException e) {
            e.printStackTrace();
        }*/
        Interpreter.getInstance().parseText(SharedData.getInstance().getEditorText());
    }
}

