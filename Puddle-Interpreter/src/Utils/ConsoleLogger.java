package Utils;

import model.SharedData;

public class ConsoleLogger {
    public static void log(String text){
        System.out.print(text);
        SharedData.getInstance().appendConsoleText(text);
    }

    public static void clear(){
        SharedData.getInstance().clearConsole();
    }
}
