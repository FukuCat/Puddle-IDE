package org.cmpiler.kotlin.ide.view.actions;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import org.cmpiler.kotlin.ide.controller.ConsoleController;
import org.cmpiler.kotlin.ide.controller.EditorController;
import org.cmpiler.kotlin.ide.controller.InterpreterController;
import org.cmpiler.kotlin.interpreter.Interpreter;

public class TestAction implements ActionListener {

    ConsoleController console = ConsoleController.getInstance();
    EditorController editor = EditorController.getInstance();
    InterpreterController interpreter = InterpreterController.getInstance();

    @Override
    public void actionPerformed(ActionEvent e) {
        console.clear();
        editor.clearHighlights();
        try {
            interpreter.build();
        } catch (InterruptedException e1) {
            e1.printStackTrace();
        }
    }
}

