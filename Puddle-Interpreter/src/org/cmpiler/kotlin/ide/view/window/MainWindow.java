package org.cmpiler.kotlin.ide.view.window;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import org.cmpiler.kotlin.ide.controller.InterpreterController;
import org.cmpiler.kotlin.ide.view.panel.ConsolePanel;
import org.cmpiler.kotlin.ide.view.panel.TextEditorPanel;
import org.cmpiler.kotlin.ide.view.panel.ToolBarPanel;

public class MainWindow extends JFrame{

    private static final int TOOLBAR_HEIGHT = 36;

    public MainWindow(String title, int w, int h){
        super();
        this.setTitle(title);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());
        this.setPreferredSize(new Dimension(w, h + TOOLBAR_HEIGHT));
        this.setResizable(false);
        JPanel container = new JPanel();
        FlowLayout layout = new FlowLayout();
        layout.setVgap(0);
        layout.setHgap(0);
        container.setLayout(layout);
        container.add(new ToolBarPanel(w,TOOLBAR_HEIGHT));
        container.add(new TextEditorPanel(w,(int)((h - TOOLBAR_HEIGHT * 2) * .70)));
        container.add(new ConsolePanel(w,(int)((h - TOOLBAR_HEIGHT * 2) * .30)));
        // center
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) (dimension.getWidth() / 2) - w/2;
        int y = (int) (dimension.getHeight() / 2) - h/2;

        addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent e){
                System.out.println("Closed");
                InterpreterController.getInstance().setRunning(false);
                e.getWindow().dispose();
            }
        });

        this.setLocation(x, y);

        this.add(container);
        this.pack();
        this.setVisible(true);
    }

}
