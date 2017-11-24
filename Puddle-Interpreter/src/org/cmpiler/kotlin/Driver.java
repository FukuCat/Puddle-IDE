package org.cmpiler.kotlin;

/*
* Setup instructions:
* Run in terminal
* java -cp "lib\antlr-4.7-complete.jar" org.antlr.v4.Tool "src\org\cmpiler\kotlin\antlr\UnicodeClasses.g4" -package org.cmpiler.kotlin.antlr
* java -cp "lib\antlr-4.7-complete.jar" org.antlr.v4.Tool "src\org\cmpiler\kotlin\antlr\KotlinLexer.g4" -package org.cmpiler.kotlin.antlr
* copy "PuddleLexer.tokens" to root of terminal
* java -cp "lib\antlr-4.7-complete.jar" org.antlr.v4.Tool "src\org\cmpiler\kotlin\antlr\KotlinParser.g4" -package org.cmpiler.kotlin.antlr
*
* delete "PuddleLexer.tokens" from root of terminal
*
* add "package org.cmpiler.puddle.antlr;" to start of all generated java files
* */
// Lexer added reserved keywords
// parser added reserved keywords rule to "type" rule

import org.cmpiler.kotlin.ide.view.window.*;

import javax.swing.JFrame;

/*
* TODO
* 1) rename error codes and descriptions in error dictionary
* 2) add rule syntax error in error dictionary and remove from CodeValidator
* 3) error when no main function found
* */
public class Driver {
    public static JFrame frame;
    public static void main(String[] args){
        frame = new MainWindow("Puddle IDE",1280,720);
        /*try {
            Interpreter.getInstance().parseFile("rcs/template/test.kt","UTF-8");
            /*
            Interpreter.getInstance().parseText(
                    "fun main(args : Array<String>) {\n" +
                            "\tval x: Int = 0\n" +
                            "\tval _veryWeirdIdentifier567: Float = 999.9\n" +
                            "\tval y = (5 > 4 && true) || (false && !(x==0))\n" +
                            "\tval myArray: Array<Integer> = Array(10)\n" +
                            "\t\n" +
                            "\tscan(\"What is the input: \" ,x)\n" +
                            "\tprint(\"Input: \" ,x)\n" +
                            "\t\n" +
                            "\tfor(i in 1..5) {\n" +
                            "\t\tval x: Float = 0\n" +
                            "\t\tprint(\"Hello world\");\n" +
                            "\t}\n" +
                            "}"
            );
            */
        /*} catch (IOException e) {
            e.printStackTrace();
        }*/

    }
}
