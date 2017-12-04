package org.cmpiler.kotlin.ide.controller;

import org.cmpiler.kotlin.ide.model.editorSyntax.KotlinFoldMaker;
import org.fife.ui.autocomplete.*;
import org.fife.ui.rsyntaxtextarea.AbstractTokenMakerFactory;
import org.fife.ui.rsyntaxtextarea.RSyntaxTextArea;
import org.fife.ui.rsyntaxtextarea.SyntaxConstants;
import org.fife.ui.rsyntaxtextarea.TokenMakerFactory;
import org.fife.ui.rsyntaxtextarea.folding.CurlyFoldParser;
import org.fife.ui.rsyntaxtextarea.folding.FoldParserManager;
import org.fife.ui.rtextarea.RTextScrollPane;

import javax.swing.*;
import javax.swing.text.BadLocationException;
import javax.swing.text.DefaultHighlighter;
import java.awt.*;
import java.util.HashSet;

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

        editorScrollArea = new RTextScrollPane(editorTextArea);
        editorScrollArea.setVerticalScrollBarPolicy ( ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS );
        InterpreterController.getInstance().startAutoBuild();
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

    public void addAutoCompleteionItem(String name){
        DefaultCompletionProvider provider = ((DefaultCompletionProvider)editorCompletionProvider);
        provider.addCompletion(new BasicCompletion(provider, name));
    }

    public void addAutoCompleteionFunction(String name, String desc){
        DefaultCompletionProvider provider = ((DefaultCompletionProvider)editorCompletionProvider);
        provider.addCompletion(new ShorthandCompletion(provider, name,
                name+"(", desc));
    }

    public void clearHighlights(){
        getEditorTextArea().getHighlighter().removeAllHighlights();
    }

    public void highlightEditorLine(int start, int end){
        if(start <= end)
            for(int i = start; i <= end; i++)
                highlightEditorLine(i);
    }

    public void highlightEditorLine(int line){
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
        editorTextArea.setCaretPosition(positionStart);

        DefaultHighlighter.DefaultHighlightPainter highlightPainter =
                new DefaultHighlighter.DefaultHighlightPainter(DEFAULT_ERROR_HIGHLIGHT_COLOR);
        try {
            editorTextArea.getHighlighter().addHighlight(positionStart, positionEnd,
                    highlightPainter);
        } catch (BadLocationException e) {
            e.printStackTrace();
        }
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
