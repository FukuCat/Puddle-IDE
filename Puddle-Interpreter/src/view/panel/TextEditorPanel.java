package view.panel;

import model.SharedData;

import javax.swing.*;
import java.awt.*;

public class TextEditorPanel extends JPanel {
    int w, h;
    JTextArea txt_textArea;
    JScrollPane scl_scroll;
    public TextEditorPanel(int w, int h){
        super();
        txt_textArea = SharedData.getInstance().getEditorTextArea();
        txt_textArea.setEditable(true);
        txt_textArea.setFont(new Font( "Courier New", Font.PLAIN, 15));
        scl_scroll = new JScrollPane (txt_textArea);
        scl_scroll.setVerticalScrollBarPolicy ( ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS );
        scl_scroll.setPreferredSize(new Dimension(w - 16, h));
        this.add(scl_scroll);
    }
}
