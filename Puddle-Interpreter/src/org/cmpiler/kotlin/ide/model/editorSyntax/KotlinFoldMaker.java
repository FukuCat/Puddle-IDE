package org.cmpiler.kotlin.ide.model.editorSyntax;

import org.fife.ui.rsyntaxtextarea.RSyntaxTextArea;
import org.fife.ui.rsyntaxtextarea.folding.CurlyFoldParser;
import org.fife.ui.rsyntaxtextarea.folding.Fold;

import java.util.ArrayList;
import java.util.List;

public class KotlinFoldMaker extends CurlyFoldParser {

    public KotlinFoldMaker() {
        super(true, false);
    }
/*
    @Override
    public List<Fold> getFolds(RSyntaxTextArea rSyntaxTextArea) {
        List<Fold> result = new ArrayList<>();



        return result;
    }
    */
}
