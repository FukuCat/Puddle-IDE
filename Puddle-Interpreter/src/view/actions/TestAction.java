package view.actions;

import main.antlr.AbstractSyntaxTreePrinter;
import main.antlr.ParserFacade;
import model.SharedData;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class TestAction implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            SharedData.getInstance().clearConsole();
            new AbstractSyntaxTreePrinter().print( new ParserFacade().parseString(SharedData.getInstance().getEditorText()));
        } catch (IOException e1) {
            e1.printStackTrace();
        }
    }
}
