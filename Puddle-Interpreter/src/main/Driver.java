package main;

import main.antlr.KotlinParserFacade;
import main.antlr.kotlin.listener.AntlrKotlinListener;
import model.SharedData;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import view.window.MainWindow;

import java.io.IOException;

/*
* Setup instructions:
* Run in powershell
* cd "C:\Users\fukon\Desktop\New folder\" <-- path to jar and g4 files in same dir
* java -cp "antlr-4.7-complete.jar" org.antlr.v4.Tool "UnicodeClasses.g4"
* java -cp "antlr-4.7-complete.jar" org.antlr.v4.Tool "KotlinLexer.g4"
* java -cp "antlr-4.7-complete.jar" org.antlr.v4.Tool "KotlinParser.g4"
* */
// Lexer added reserved keywords
// parser added reserved keywords rule to "type" rule
public class Driver {
    public static void main(String[] args){
        new MainWindow("Puddle IDE",1280,720);
        /*
        String text =
                "//Convert this into your language rule syntax.\n" +
                        "\n" +
                        "fun testOne() {\n" +
                        "\tval x: Int =  0;\n" +
                        "\tscan(\"Hello. I need your number: \" ,x);\n" +
                        "\t\n" +
                        "\tfor(i in 1..10) { //syntax error #1\n" +
                        "\t\tprint(\"Petmalu \" +x); //syntax error #2\n" +
                        "\t\t\n" +
                        "\t}//syntax error #3 (missing curly brace)\n" +
                        "}\n" +
                        "\n" +
                        "fun testTwo(x: Float) {\n" +
                        "\tif(x = 4)//syntax error #4 \n" +
                        "\t{\n" +
                        "\t\tprint(x is a very huge number); //syntax error #5\n" +
                        "\t} \n" +
                        "}\n" +
                        "fun main(args : Array<String>) {\n" +
                        "\tfloat value = (5 * 1) + (5 * 5 / 1 + 3 + (4 + (5 * 3)))/2.0f * 8.0f;\n" +
                        "\t\n" +
                        "\tthis.testOne()(x); //syntax error #6\n" +
                        "\tthis.testTwo(123 ++value); //syntax error #7\n" +
                        "}\n";
        KotlinParserFacade parser = new KotlinParserFacade();
        try {
            ParseTreeWalker.DEFAULT.walk(new AntlrKotlinListener(), parser.parseString(text));
        } catch (IOException e) {
            e.printStackTrace();
        }
        */
    }
}
