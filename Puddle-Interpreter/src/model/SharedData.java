package model;

import javax.swing.*;

public class SharedData {

    private static SharedData instance = null;

    public static synchronized SharedData getInstance(){return instance == null? (instance = new SharedData()) : instance; }

    private JTextArea editorTextArea;
    private JTextArea consoleTextArea;

    private SharedData(){
        editorTextArea = new JTextArea();
        consoleTextArea = new JTextArea();
    }

    public JTextArea getEditorTextArea() {
        return editorTextArea;
    }

    public void setEditorTextArea(JTextArea editorTextArea) {
        this.editorTextArea = editorTextArea;
    }

    public void setEditorText(String text){
        editorTextArea.setText(text);
    }

    public String getEditorText(){
        return editorTextArea.getText();
    }

    public void appendConsoleText(String text){
        consoleTextArea.append(text);
    }

    public JTextArea getConsoleTextArea() {
        return consoleTextArea;
    }

    public void setConsoleTextArea(JTextArea consoleTextArea) {
        this.consoleTextArea = consoleTextArea;
    }
}
