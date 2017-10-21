package view.actions;

import utils.ConsoleLogger;
import model.SharedData;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

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
        int rVal = c.showOpenDialog(parent);
        if (rVal == JFileChooser.APPROVE_OPTION) {

            filename = c.getSelectedFile().getName();
            dir = c.getCurrentDirectory().toString();
            SharedData.getInstance().setEditorText(openFile(dir +"\\"+ filename,"UTF-8"));
        }
        if (rVal == JFileChooser.CANCEL_OPTION) {

        }
        }

    private String openFile(String path, String charset){
        StringBuilder sb = new StringBuilder();
        // Specify the encoding of the file.
        Charset encoding = Charset.forName(charset);
        // Path to the file
        Path file = Paths.get(path);
        ConsoleLogger.log("Opened: \""+path+"\"\n");

        // Try with resources to close reader at the end.
        try(BufferedReader br = Files.newBufferedReader(file, encoding)) {
            // The line read in.
            String line;

            // Combine assignment with null check (null being EOF).
            // Could put the assignment on its on line if you'd prefer.
            while((line = br.readLine()) != null) {
                sb.append(line);
                sb.append('\n');
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        return sb.toString();
    }
}