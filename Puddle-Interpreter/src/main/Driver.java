package main;

import main.antlr.KotlinParserFacade;
import main.antlr.kotlin.listener.AntlrKotlinListener;
import model.SharedData;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import view.window.MainWindow;

import java.io.IOException;

/*
* cd "C:\Users\fukon\Desktop\New folder\"
* java -cp "antlr-4.7-complete.jar" org.antlr.v4.Tool "UnicodeClasses.g4"
* java -cp "antlr-4.7-complete.jar" org.antlr.v4.Tool "KotlinLexer.g4"
* java -cp "antlr-4.7-complete.jar" org.antlr.v4.Tool "KotlinParser.g4"
* */
// Lexer added reserved keywords
// parser added reserved keywords rule to "type" rule
public class Driver {
    public static void main(String[] args){
        //new MainWindow("Puddle IDE",1280,720);
        String text =
                "fun myFunction(x: Int): Int {\n" +
                        "\tval add: Int =  x + 50 + 1; //syntax error #1\n" +
                        "\t\n" +
                        "\treturn add; //syntax error #2\n" +
                        "}\n" +
                        "\n" +
                        "fun myFunctionFloat(x: Float): Float {\n" +
                        "\tval fTest: Float = ((x * 50) + (x * 15)); //syntax error #3\n" +
                        "\t\n" +
                        "\treturn fTest * 50 (); //syntax error #4\n" +
                        "}\n" +
                        "\n" +
                        "fun main(args : Array<String>) {\n" +
                        "\tthis.myFunction(50);\n" +
                        "\tthis.myFunctionFloat(50.0f);\n" +
                        "}";
        KotlinParserFacade parser = new KotlinParserFacade();
        try {
            ParseTreeWalker.DEFAULT.walk(new AntlrKotlinListener(), parser.parseString(text));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
