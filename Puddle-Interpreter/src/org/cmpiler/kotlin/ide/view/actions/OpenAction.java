package org.cmpiler.kotlin.ide.view.actions;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class OpenAction implements ActionListener {

    JPanel parent;

    public OpenAction(JPanel parent){
        this.parent = parent;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String filename = "", dir = "";
        JFileChooser c = new JFileChooser();
        // Demonstrate "Open" dialog:
        c.setCurrentDirectory(new File
                (System.getProperty("user.home") + System.getProperty("file.separator")+ "Desktop"));
        int rVal = c.showOpenDialog(parent);
        if (rVal == JFileChooser.APPROVE_OPTION) {

            filename = c.getSelectedFile().getName();
            dir = c.getCurrentDirectory().toString();
            //SharedData.getInstance().setEditorText(FileIO.openFile(dir +"\\"+ filename,"UTF-8"));
        }
        if (rVal == JFileChooser.CANCEL_OPTION) {

        }
        }

}