package utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileIO {

    public static String openFile(String path, String charset){
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
