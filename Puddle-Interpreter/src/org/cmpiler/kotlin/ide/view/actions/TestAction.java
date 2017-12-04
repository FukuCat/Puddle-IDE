package org.cmpiler.kotlin.ide.view.actions;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import org.cmpiler.kotlin.ide.controller.ConsoleController;
import org.cmpiler.kotlin.ide.controller.EditorController;
import org.cmpiler.kotlin.interpreter.Interpreter;

public class TestAction implements ActionListener {

    ConsoleController console = ConsoleController.getInstance();
    EditorController editor = EditorController.getInstance();

    @Override
    public void actionPerformed(ActionEvent e) {
        console.clear();
        editor.clearHighlights();
        //new AbstractSyntaxTreePrinter().print( new KotlinParserFacade().parseString(SharedData.getInstance().getEditorText()));

        parse();
    }

    public void parse(){
        /*KotlinParserFacade parser = new KotlinParserFacade();
        try {
            ParseTreeWalker.DEFAULT.walk(new AntlrKotlinListener(), parser.parseString(SharedData.getInstance().getEditorText()));
        } catch (IOException e) {
            e.printStackTrace();
        }*/
        Interpreter.getInstance().parseText(editor.getEditorTextArea().getText());
    }
}

