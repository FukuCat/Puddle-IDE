package view.panel;

import view.actions.OpenAction;
import view.actions.SaveAction;
import view.actions.TestAction;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class ToolBarPanel extends JPanel {
    private ArrayList<JMenuItem> mi_array;
    private JMenuBar mb_toolbar;
    private JMenu m_file;
    private JMenu m_run;
    public ToolBarPanel(int w, int h){
        super();
        this.setPreferredSize(new Dimension(w, h));
        setLayout(new FlowLayout(FlowLayout.LEFT));
        initializeButtons(h);

        this.add(mb_toolbar);

    }

    public void initializeButtons(int h){mb_toolbar = new JMenuBar();
        mi_array = new ArrayList<>();

        m_file = new JMenu("File");
        m_run = new JMenu("Run");

        mi_array.add(new JMenuItem("Open"));
        mi_array.add(new JMenuItem("Save"));
        mi_array.add(new JMenuItem("Test"));

        for(int i = 0; i < 2; i++)
            m_file.add(mi_array.get(i));

        for(int i = 2; i < 3; i++)
            m_run.add(mi_array.get(i));

        mi_array.get(0).addActionListener(new OpenAction(this));
        mi_array.get(1).addActionListener(new SaveAction(this));
        mi_array.get(2).addActionListener(new TestAction());

        mb_toolbar.add(m_file);
        mb_toolbar.add(m_run);

    }
}
