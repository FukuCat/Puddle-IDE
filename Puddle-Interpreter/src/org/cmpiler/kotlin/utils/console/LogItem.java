package org.cmpiler.kotlin.utils.console;

public class LogItem {

    public static final int TYPE_ERROR = 1;
    public static final int TYPE_CONSOLE = 2;

    private int type;
    private String text;

    public LogItem(int type, String text){
        this.type = type;
        this.text = text;
    }

    public int getType(){return type;}
    public String getText(){return text;}


}
