package org.cmpiler.kotlin.ide.view.actions;

import org.cmpiler.kotlin.ide.controller.InterpreterController;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RunAction implements ActionListener {
    InterpreterController interpreter = InterpreterController.getInstance();
    @Override
    public void actionPerformed(ActionEvent e) {
        interpreter.execute();
    }
}
