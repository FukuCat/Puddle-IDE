package model;

import org.fife.ui.rsyntaxtextarea.AbstractTokenMakerFactory;
import org.fife.ui.rsyntaxtextarea.RSyntaxTextArea;
import org.fife.ui.rsyntaxtextarea.TokenMakerFactory;
import org.fife.ui.rtextarea.RTextScrollPane;
import view.components.consoleWindow.MessageConsole;

import javax.swing.*;
import javax.swing.text.BadLocationException;
import javax.swing.text.DefaultHighlighter;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import java.awt.*;
import java.util.ArrayList;

public class SharedData {

    private static SharedData instance = null;

    public static synchronized SharedData getInstance(){return instance == null? (instance = new SharedData()) : instance; }

    private Integer errorLine = null;
    private RTextScrollPane editorScrollArea;
    private RSyntaxTextArea editorTextArea;
    private JTextPane consoleTextArea;
    private MessageConsole console;

    private SharedData(){
        editorTextArea = new RSyntaxTextArea();
        AbstractTokenMakerFactory atmf = (AbstractTokenMakerFactory) TokenMakerFactory.getDefaultInstance();
        atmf.putMapping("text/puddle", "view.components.editorSyntax.KotlinTokenMaker");
        editorTextArea.setSyntaxEditingStyle("text/puddle");

        editorScrollArea = new RTextScrollPane(editorTextArea);

        consoleTextArea = new JTextPane();
        console = new MessageConsole(consoleTextArea);
        console.setMessageLines(100);
        console.redirectOut(Color.WHITE, System.out);
        console.redirectErr(Color.RED, System.err);
    }

    public void highlightEditorLine(int line){
        String[] lineString = editorTextArea.getText().split("\\r?\\n");
        int positionStart = 0;
        int positionEnd = 0;
        for(int i = 0; i < lineString.length && i < line; i++){
            if(i < line - 1)
                positionStart += lineString[i].length();
            positionEnd+= lineString[i].length();
        }
        positionStart += line - 1;
        positionEnd += line;
        editorTextArea.setCaretPosition(positionStart);

        DefaultHighlighter.DefaultHighlightPainter highlightPainter =
                new DefaultHighlighter.DefaultHighlightPainter(Color.PINK);
        try {
            editorTextArea.getHighlighter().addHighlight(positionStart, positionEnd,
                    highlightPainter);
        } catch (BadLocationException e) {
            e.printStackTrace();
        }
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

    public void clearConsole(){
        editorTextArea.getHighlighter().removeAllHighlights();
        consoleTextArea.setText("");
    }

    public String getEditorText(){
        return editorTextArea.getText();
    }

    public JTextPane getConsoleTextArea() {
        return consoleTextArea;
    }

    public void setConsoleTextArea(JTextPane consoleTextArea) {
        this.consoleTextArea = consoleTextArea;
    }

    public Integer getErrorLine() {
        return errorLine;
    }

    public void setErrorLine(Integer errorLine) {
        this.errorLine = errorLine != null? this.errorLine == null? errorLine : this.errorLine : null;
    }

    public RTextScrollPane getEditorScrollArea() {
        return editorScrollArea;
    }

    public void setEditorScrollArea(RTextScrollPane editorScrollArea) {
        this.editorScrollArea = editorScrollArea;
    }
}
