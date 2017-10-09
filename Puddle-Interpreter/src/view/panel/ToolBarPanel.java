package view.panel;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class ToolBarPanel extends JPanel {
    int w, h;
    private ArrayList<JButton> btn_array;

    public ToolBarPanel(int w, int h){
        super();
        this.setPreferredSize(new Dimension(w, h));
        initializeButtons();

        for(JButton btn : btn_array){
            this.add(btn);
        }

    }

    public void initializeButtons(){
        btn_array = new ArrayList<>();
        btn_array.add(new JButton("Open"));
        btn_array.add(new JButton("Save"));
        btn_array.add(new JButton("Test"));
        for(JButton btn : btn_array){
            btn.setMaximumSize(new Dimension(100, 30));
        }

    }
}
