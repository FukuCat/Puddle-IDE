package org.cmpiler.kotlin.ide.view.panel;


import org.cmpiler.kotlin.ide.controller.ConsoleController;

import javax.swing.*;
import java.awt.*;

public class ConsolePanel extends JPanel {
    JScrollPane scl_scroll;
    public ConsolePanel(int w, int h) {
        super();
        scl_scroll = new JScrollPane(ConsoleController.getInstance().getConsoleTextArea());
        scl_scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scl_scroll.setPreferredSize(new Dimension(w - 16, h));
        this.add(scl_scroll);
    }
}
