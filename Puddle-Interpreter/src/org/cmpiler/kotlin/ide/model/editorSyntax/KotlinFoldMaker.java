package org.cmpiler.kotlin.ide.model.editorSyntax;

import org.fife.ui.rsyntaxtextarea.folding.CurlyFoldParser;

public class KotlinFoldMaker extends CurlyFoldParser {

    public KotlinFoldMaker() {
        super(true, false);
    }
}
