package view.actions;

import model.SharedData;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SaveAction implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        String text = SharedData.getInstance().getEditorText();
        System.out.println(text);
    }
}
