package org.cmpiler.kotlin.ide.view.panel;

import org.cmpiler.kotlin.ide.controller.EditorController;
import org.fife.ui.rtextarea.RTextScrollPane;

import javax.swing.*;
import java.awt.*;

public class TextEditorPanel extends JPanel {
    RTextScrollPane scl_scroll;
    public TextEditorPanel(int w, int h){
        super();
        scl_scroll = EditorController.getInstance().getEditorScrollArea();
        scl_scroll.setPreferredSize(new Dimension(w - 16, h));
        this.add(scl_scroll);
    }
}
