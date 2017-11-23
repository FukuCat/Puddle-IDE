package org.cmpiler.kotlin.ide.view.panel;

import org.fife.ui.rsyntaxtextarea.RSyntaxTextArea;
import org.fife.ui.rtextarea.RTextScrollPane;

import javax.swing.*;
import java.awt.*;

public class TextEditorPanel extends JPanel {
    RSyntaxTextArea txt_textArea;
    RTextScrollPane scl_scroll;
    public TextEditorPanel(int w, int h){
        super();
        //txt_textArea = SharedData.getInstance().getEditorTextArea();
        txt_textArea.setEditable(true);
        txt_textArea.setFont(new Font( "Courier New", Font.PLAIN, 15));
        //scl_scroll = SharedData.getInstance().getEditorScrollArea();
        scl_scroll.setVerticalScrollBarPolicy ( ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS );
        scl_scroll.setPreferredSize(new Dimension(w - 16, h));
        this.add(scl_scroll);
    }
}
