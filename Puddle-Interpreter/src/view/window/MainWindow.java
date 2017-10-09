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
        this.setPreferredSize(new Dimension(w, h));
        JPanel container = new JPanel();
        FlowLayout layout = new FlowLayout();
        layout.setVgap(0);
        layout.setHgap(0);
        container.setLayout(layout);
        container.add(new ToolBarPanel(w,36));
        container.add(new TextEditorPanel(w,(h - 72)/2));
        container.add(new ConsolePanel(w,(h - 72)/2));

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
