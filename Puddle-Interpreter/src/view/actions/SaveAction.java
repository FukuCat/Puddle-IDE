package view.actions;

import utils.ConsoleLogger;
import model.SharedData;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

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
            code = SharedData.getInstance().getEditorText();
            saveFile(dir,filename,code);
        }
        if (rVal == JFileChooser.CANCEL_OPTION) {

        }
    }

    private boolean saveFile(String dir, String filename, String text){
        BufferedWriter writer = null;
        try {
            //create a temporary file
            File logFile = new File(dir+"\\"+filename);

            // This will output the full path where the file will be written to...
            ConsoleLogger.log("Saved: "+logFile.getCanonicalPath());
            writer = new BufferedWriter(new FileWriter(logFile));
            writer.write(text);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                // Close the writer regardless of what happens...
                writer.close();
            } catch (Exception e) {
                e.printStackTrace();
                return false;
            }
        }
        return true;
    }
}
