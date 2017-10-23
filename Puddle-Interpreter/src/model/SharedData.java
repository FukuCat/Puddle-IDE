package model;

import org.fife.ui.rsyntaxtextarea.AbstractTokenMakerFactory;
import org.fife.ui.rsyntaxtextarea.RSyntaxTextArea;
import org.fife.ui.rsyntaxtextarea.TokenMakerFactory;
import view.components.consoleWindow.MessageConsole;

import javax.swing.*;
import java.awt.*;

public class SharedData {

    private static SharedData instance = null;

    public static synchronized SharedData getInstance(){return instance == null? (instance = new SharedData()) : instance; }

    private RSyntaxTextArea editorTextArea;
    private JTextPane consoleTextArea;
    private MessageConsole console;

    private SharedData(){
        editorTextArea = new RSyntaxTextArea();
        AbstractTokenMakerFactory atmf = (AbstractTokenMakerFactory) TokenMakerFactory.getDefaultInstance();
        atmf.putMapping("text/puddle", "view.components.editorSyntax.KotlinTokenMaker");
        editorTextArea.setSyntaxEditingStyle("text/puddle");
        consoleTextArea = new JTextPane();
        console = new MessageConsole(consoleTextArea);
        console.setMessageLines(100);
        console.redirectOut(Color.WHITE, System.out);
        console.redirectErr(Color.RED, System.err);
    }

    public void highlightEditorLine(int line){
        editorTextArea.setCaretPosition(line);
    }

    public RSyntaxTextArea getEditorTextArea() {
        return editorTextArea;
    }

    public void setEditorTextArea(RSyntaxTextArea editorTextArea) {
        this.editorTextArea = editorTextArea;
    }

    public void setEditorText(String text){
        editorTextArea.setText(text);
    }

    public void clearConsole(){consoleTextArea.setText("");}

    public String getEditorText(){
        return editorTextArea.getText();
    }

    public JTextPane getConsoleTextArea() {
        return consoleTextArea;
    }

    public void setConsoleTextArea(JTextPane consoleTextArea) {
        this.consoleTextArea = consoleTextArea;
    }
}
