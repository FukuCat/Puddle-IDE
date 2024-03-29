package org.cmpiler.kotlin.ide.view.panel;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import org.cmpiler.kotlin.ide.view.actions.OpenAction;
import org.cmpiler.kotlin.ide.view.actions.RunAction;
import org.cmpiler.kotlin.ide.view.actions.SaveAction;
import org.cmpiler.kotlin.ide.view.actions.TestAction;

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
        mi_array.add(new JMenuItem("Run"));

        for(int i = 0; i < 2; i++)
            m_file.add(mi_array.get(i));

        for(int i = 2; i < 4; i++)
            m_run.add(mi_array.get(i));

        mi_array.get(0).addActionListener(new OpenAction(this));
        mi_array.get(1).addActionListener(new SaveAction(this));
        mi_array.get(2).addActionListener(new TestAction());
        mi_array.get(3).addActionListener(new RunAction());

        mb_toolbar.add(m_file);
        mb_toolbar.add(m_run);

    }
}
