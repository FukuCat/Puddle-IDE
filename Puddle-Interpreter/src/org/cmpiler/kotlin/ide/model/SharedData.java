package org.cmpiler.kotlin.ide.model;

import org.fife.ui.rsyntaxtextarea.AbstractTokenMakerFactory;
import org.fife.ui.rsyntaxtextarea.RSyntaxTextArea;
import org.fife.ui.rsyntaxtextarea.TokenMakerFactory;
import org.fife.ui.rtextarea.RTextScrollPane;
import org.cmpiler.kotlin.ide.view.components.consoleWindow.MessageConsole;

import javax.swing.*;
import javax.swing.text.BadLocationException;
import javax.swing.text.DefaultHighlighter;
import java.awt.*;

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
        atmf.putMapping("text/puddle", "org.cmpiler.kotlin.ide.view.components.editorSyntax.KotlinTokenMaker");
        editorTextArea.setSyntaxEditingStyle("text/puddle");
        editorScrollArea = new RTextScrollPane(editorTextArea);

        consoleTextArea = new JTextPane();
        console = new MessageConsole(consoleTextArea);
        console.setMessageLines(100);
        console.redirectOut(Color.WHITE, System.out);
        console.redirectErr(Color.RED, System.err);

        setEditorText("fun testOne() {\n" +
                "    val x: Int = 0;\n" +
                "\tscan(\"Hello. I need your number\", x);\n" +
                "\n" +
                "\tfor( i in ..10){ // #1\n" +
                "\t    print (\"Yes\"+x+); #2\n" +
                "\t//#3\n" +
                "\tx = 5x; // #4\n" +
                "}\n" +
                "\n" +
                "fun testTwo(x: Float) {\n" +
                "    if( x = 4) // #5\n" +
                "    {\n" +
                "        print (x is a very large number); // #6\n" +
                "    }\n" +
                "}\n" +
                "\n" +
                "fun testThree(x: Int, y: Int) {\n" +
                "    val i: Int = 0;\n" +
                "    do {\n" +
                "        i++;\n" +
                "    } while ( i == x );\n" +
                "}\n" +
                "\n" +
                "fun main() {\n" +
                "  val value : Float = ( 5 * 1 ) + ( 5 * 5 / 1 + 3 ( 4 + ( 5 * 3 ))) / 2.0f * 8.0f;\n" +
                "  this.testOne() (x); // #7\n" +
                "  this.testTwo(123 ++value); // #8\n" +
                "  val nextValue: Float = 5 ** 5 + 5 ++ 5 ** 5; // #9, 10, 11\n" +
                "  this.testTwo(5.0f)); // #12\n" +
                "  this.testTwo(5.0f; // #13\n" +
                "  this.testThree(25 13); // #14\n" +
                "  this.testThree((12 * 10); // #15\n" +
                "  this.testThree(4,,5); // #16\n" +
                "}");
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
