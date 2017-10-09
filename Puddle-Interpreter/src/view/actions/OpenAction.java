package view.actions;

import model.SharedData;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OpenAction implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        SharedData.getInstance().setEditorText("testing");
    }
}