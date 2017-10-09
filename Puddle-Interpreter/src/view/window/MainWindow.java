package view.window;

import view.panel.ConsolePanel;
import view.panel.TextEditorPanel;
import view.panel.ToolBarPanel;

import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame{
    int w, h;
    String title;

    public MainWindow(String title, int w, int h){
        super();
        this.setTitle(title);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());
        this.setSize(new Dimension(w, h));
        JPanel container = new JPanel();
        FlowLayout layout = new FlowLayout();
        layout.setVgap(0);
        layout.setHgap(0);
        container.setLayout(layout);
        container.add(new ToolBarPanel(100,20));
        container.add(new TextEditorPanel(100,20));
        container.add(new ConsolePanel(100,20));

        // center
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) (dimension.getWidth() / 2);
        int y = (int) (dimension.getHeight() / 2);
        this.setLocation(x, y);

        this.add(container);
        this.pack();
        this.setVisible(true);
    }
}
