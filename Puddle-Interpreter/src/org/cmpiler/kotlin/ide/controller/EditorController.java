package org.cmpiler.kotlin.ide.controller;

import org.cmpiler.kotlin.ide.model.editorSyntax.KotlinFoldMaker;
import org.fife.ui.autocomplete.*;
import org.fife.ui.rsyntaxtextarea.*;
import org.fife.ui.rsyntaxtextarea.folding.CurlyFoldParser;
import org.fife.ui.rsyntaxtextarea.folding.FoldParserManager;
import org.fife.ui.rtextarea.RTextScrollPane;

import javax.swing.*;
import javax.swing.text.BadLocationException;
import javax.swing.text.DefaultHighlighter;
import java.awt.*;
import java.util.HashSet;
import java.util.Queue;

public class EditorController {

    private static EditorController instance = null;

    private static final Color DEFAULT_ERROR_HIGHLIGHT_COLOR = Color.PINK;

    //private HashSet<String> added

    private RTextScrollPane editorScrollArea;
    private RSyntaxTextArea editorTextArea;
    private AutoCompletion editorAutoCompletion;
    private CompletionProvider editorCompletionProvider;

    private EditorController(){
        editorTextArea = new RSyntaxTextArea();
        AbstractTokenMakerFactory atmf = (AbstractTokenMakerFactory) TokenMakerFactory.getDefaultInstance();
        atmf.putMapping("text/kotlin", "org.cmpiler.kotlin.ide.model.editorSyntax.KotlinTokenMaker");
        FoldParserManager.get().addFoldParserMapping("text/kotlin", new KotlinFoldMaker());
        editorTextArea.setSyntaxEditingStyle("text/kotlin");
        editorTextArea.setCodeFoldingEnabled(true);
        editorTextArea.setEditable(true);
        editorTextArea.setFont(new Font( "Courier New", Font.PLAIN, 15));
        resetCompletionProvider();
        setEditorStyle();


        editorScrollArea = new RTextScrollPane(editorTextArea);
        editorScrollArea.setVerticalScrollBarPolicy ( ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS );
        InterpreterController.getInstance().startAutoBuild();
    }

    public void setEditorStyle(){
        editorTextArea.setFont(new Font( "Courier New", Font.PLAIN, 15));
        SyntaxScheme scheme = editorTextArea.getSyntaxScheme();
        scheme.getStyle(Token.OPERATOR).foreground = Color.ORANGE.darker();
        scheme.getStyle(Token.OPERATOR).font = new Font("Courier New", Font.BOLD, 16);
        scheme.getStyle(Token.RESERVED_WORD).font = new Font("Courier New", Font.BOLD, 15);
        scheme.getStyle(Token.SEPARATOR).font = new Font("Courier New", Font.BOLD, 16);
        scheme.getStyle(Token.LITERAL_STRING_DOUBLE_QUOTE).foreground = Color.GREEN.darker();
        scheme.getStyle(Token.LITERAL_NUMBER_DECIMAL_INT).foreground = Color.BLUE;
        scheme.getStyle(Token.LITERAL_NUMBER_FLOAT).foreground = Color.BLUE;
        /*
        scheme.getStyle(Token.RESERVED_WORD).background = Color.pink;
        scheme.getStyle(Token.DATA_TYPE).foreground = Color.blue;
        scheme.getStyle(Token.LITERAL_STRING_DOUBLE_QUOTE).underline = true;
        scheme.getStyle(Token.COMMENT_EOL).font = new Font("Georgia",
                Font.ITALIC, 12);
                */
    }


    public String getCode(){return editorTextArea.getText();}

    public static EditorController getInstance(){return instance == null? (instance = new EditorController()): instance;}

    public void resetCompletionProvider() {

        // A DefaultCompletionProvider is the simplest concrete implementation
        // of CompletionProvider. This provider has no understanding of
        // language semantics. It simply checks the text entered up to the
        // caret position for a match against known completions. This is all
        // that is needed in the majority of cases.
        DefaultCompletionProvider provider = new DefaultCompletionProvider();

        // Add completions for all Java keywords. A BasicCompletion is just
        // a straightforward word completion.
        provider.addCompletion(new BasicCompletion(provider, "case"));
        provider.addCompletion(new BasicCompletion(provider, "return"));
        provider.addCompletion(new BasicCompletion(provider, "if"));
        provider.addCompletion(new BasicCompletion(provider, "for"));
        provider.addCompletion(new BasicCompletion(provider, "while"));
        provider.addCompletion(new BasicCompletion(provider, "do"));

        provider.addCompletion(new BasicCompletion(provider, "val"));
        provider.addCompletion(new BasicCompletion(provider, "var"));
        provider.addCompletion(new BasicCompletion(provider, "class"));
        provider.addCompletion(new BasicCompletion(provider, "fun"));

        provider.addCompletion(new BasicCompletion(provider, "Int"));
        provider.addCompletion(new BasicCompletion(provider, "Float"));
        provider.addCompletion(new BasicCompletion(provider, "Double"));
        provider.addCompletion(new BasicCompletion(provider, "Long"));
        provider.addCompletion(new BasicCompletion(provider, "String"));
        provider.addCompletion(new BasicCompletion(provider, "Char"));

        provider.addCompletion(new BasicCompletion(provider, "IntArray"));
        provider.addCompletion(new BasicCompletion(provider, "FloatArray"));
        provider.addCompletion(new BasicCompletion(provider, "DoubleArray"));
        provider.addCompletion(new BasicCompletion(provider, "LongArray"));
        provider.addCompletion(new BasicCompletion(provider, "StringArray"));
        provider.addCompletion(new BasicCompletion(provider, "CharArray"));

        provider.addCompletion(new ShorthandCompletion(provider, "prt",
                "print(", "print(String)"));
        provider.addCompletion(new ShorthandCompletion(provider, "scn",
                "scan(", "scan(String)"));

        editorCompletionProvider = provider;
        editorAutoCompletion = new AutoCompletion(editorCompletionProvider);
        editorAutoCompletion.install(editorTextArea);

    }

    public void addAutoCompleteionVariable(String name, String desc){
        DefaultCompletionProvider provider = ((DefaultCompletionProvider)editorCompletionProvider);
        provider.addCompletion(new BasicCompletion(provider, name, desc));
    }

    public void addAutoCompleteionFunction(String name, String signature, String desc){
        DefaultCompletionProvider provider = ((DefaultCompletionProvider)editorCompletionProvider);
        provider.addCompletion(new ShorthandCompletion(provider, name,
                signature, desc));
    }

    public void clearHighlights(){
        editorTextArea.getHighlighter().removeAllHighlights();
        editorTextArea.removeAllLineHighlights();
    }

    public void highlightEditorLine(int start, int end){
        int caret = editorTextArea.getCaretPosition();
        if(start <= end)
            for(int i = start; i <= end; i++)
                highlightEditorLine(i);
        editorTextArea.setCaretPosition(caret);
    }


    public int selectedLine(){
        return editorTextArea.getCaretLineNumber();
    }

    public void highlightEditorLine(int line){
        int selectedLine = editorTextArea.getCaretLineNumber();
        boolean noHighlight = selectedLine == line;
        if(!noHighlight) {
        String[] lineString = getEditorTextArea().getText().split("\\r?\\n");
        int positionStart = 0;
        int positionEnd = 0;
        for(int i = 0; i < lineString.length && i < line; i++){
            if(i < line - 1)
                positionStart += lineString[i].length();
            positionEnd+= lineString[i].length();
        }
        positionStart += line - 1;
        positionEnd += line;
            DefaultHighlighter.DefaultHighlightPainter highlightPainter =
                    new DefaultHighlighter.DefaultHighlightPainter(DEFAULT_ERROR_HIGHLIGHT_COLOR);
            try {
                editorTextArea.getHighlighter().addHighlight(positionStart, positionEnd,
                        highlightPainter);
                //editorTextArea.addLineHighlight(line-1, DEFAULT_ERROR_HIGHLIGHT_COLOR);
            } catch (BadLocationException e) {
                e.printStackTrace();
            }
        }
        //editorTextArea.setCaretPosition(caret);
    }

    public RTextScrollPane getEditorScrollArea() {
        return editorScrollArea;
    }

    public void setEditorScrollArea(RTextScrollPane editorScrollArea) {
        this.editorScrollArea = editorScrollArea;
    }

    public RSyntaxTextArea getEditorTextArea() {
        return editorTextArea;
    }

    public void setEditorTextArea(RSyntaxTextArea editorTextArea) {
        this.editorTextArea = editorTextArea;
    }
}
