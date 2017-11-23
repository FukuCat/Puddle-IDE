package org.cmpiler.kotlin.ide.view.actions;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class SaveAction implements ActionListener {

    JPanel parent;

    public SaveAction(JPanel parent){
        this.parent = parent;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String filename = "", dir = "", code;

        JFileChooser c = new JFileChooser();
        c.setCurrentDirectory(new File
                (System.getProperty("user.home") + System.getProperty("file.separator")+ "Desktop"));
        // Demonstrate "Save" dialog:
        int rVal = c.showSaveDialog(parent);
        if (rVal == JFileChooser.APPROVE_OPTION) {
            filename = c.getSelectedFile().getName();
            dir = c.getCurrentDirectory().toString();
            //code = SharedData.getInstance().getEditorText();
            //FileIO.saveFile(dir,filename,code);
        }
        if (rVal == JFileChooser.CANCEL_OPTION) {

        }
    }
}
