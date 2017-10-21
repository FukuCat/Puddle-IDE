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
public class Driver {
    public static void main(String[] args){
        //new MainWindow("Puddle IDE",1280,720);
        String text =
                "fun main(args : Array<String> {\n" +
                        "    val x: Int = 0;\n" +
                        "\tval _veryWeirdIdentifier567: Float = 999.9;\n" +
                        "\tval y = (5 > 4 && true) || (false && !(x==0));\n" +
                        "\tval myArray: Array<Integer> = Array(10);\n" +
                        "\t\n" +
                        "\tscan(\"What is the input: \" ,x)\n" +
                        "\tprint(\"Input: \" ,x)\n" +
                        "\t\n" +
                        "\tfor(i in 1..5) {\n" +
                        "\t\tprint(\"Hello world\");\n" +
                        "\t}\n" +
                        "}";
        KotlinParserFacade parser = new KotlinParserFacade();
        try {
            ParseTreeWalker.DEFAULT.walk(new AntlrKotlinListener(), parser.parseString(text));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
