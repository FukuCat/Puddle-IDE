package org.cmpiler.kotlin.ide.controller;

import org.cmpiler.kotlin.ide.model.consoleWindow.MessageConsole;

import javax.swing.*;
import java.awt.*;

public class ConsoleController {

    private static ConsoleController instance = null;

    private static final Color DEFAULT_COLOR_BACKGROUD = Color.WHITE;
    private static final Color DEFAULT_COLOR_TEXT = Color.BLACK;
    private static final Color DEFAULT_COLOR_ERROR = Color.RED;

    private JTextPane consoleTextArea;
    private MessageConsole console;

    private ConsoleController(){
        consoleTextArea = new JTextPane();
        consoleTextArea.setFont(new Font( "Courier New", Font.PLAIN, 15));
        consoleTextArea.setForeground(DEFAULT_COLOR_TEXT);
        consoleTextArea.setBackground(DEFAULT_COLOR_BACKGROUD);
        consoleTextArea.setEditable(false);
        consoleTextArea.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
        console = new MessageConsole(consoleTextArea);
        console.setMessageLines(100);
        console.redirectOut(DEFAULT_COLOR_TEXT, System.out);
        console.redirectErr(DEFAULT_COLOR_ERROR, System.err);
        consoleTextArea.setText("");
    }

    public static ConsoleController getInstance(){return instance == null? (instance = new ConsoleController()): instance;}

    public void clear(){
        consoleTextArea.setText("");
    }

    public JTextPane getConsoleTextArea() {
        return consoleTextArea;
    }

    public void setConsoleTextArea(JTextPane consoleTextArea) {
        this.consoleTextArea = consoleTextArea;
    }

    public MessageConsole getConsole() {
        return console;
    }

    public void setConsole(MessageConsole console) {
        this.console = console;
    }
}
