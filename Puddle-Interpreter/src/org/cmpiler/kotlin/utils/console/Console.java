package org.cmpiler.kotlin.utils.console;

import org.kon.jgame.model.utils.list.Queue;

public class Console {

    private static Console instance = null;

    public static final int USER_CONSOLE = 1;
    public static final int USER_ERROR = 2;
    public static final int DEV_CONSOLE = 3;
    public static final int DEV_ERROR = 4;

    private Queue<LogItem> logs;

    private Console(){
        logs = new Queue<>();
    }


    public static Console getInstance(){return instance == null? (instance = new Console()): instance;}

    public static void reset(){
        getInstance().logs.clear();
    }
    public static LogItem popLog(){ return getInstance().logs.dequeue(); }
    public static boolean hasLog(){ return !getInstance().logs.isEmpty(); }

    public static void log(int outputType, Object text){
        switch (outputType){
            case USER_CONSOLE:
                //getInstance().logs.enqueue(new LogItem(LogItem.TYPE_CONSOLE, text + ""));
                System.out.println(text);
            case DEV_CONSOLE:
                //System.out.println(text);
                break;
            case USER_ERROR:
                //getInstance().logs.enqueue(new LogItem(LogItem.TYPE_ERROR, text + ""));
                System.err.println(text);
            case DEV_ERROR:
                //System.err.println(text);
                break;
        }
    }

}
