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
import org.cmpiler.kotlin.interpreter.Interpreter.Interpreter;
import org.cmpiler.kotlin.utils.config.GlobalConfig;

import javax.swing.JFrame;
import java.io.IOException;

/*
* TODO
* 1) rename error codes and descriptions in error dictionary
* 2) add rule syntax error in error dictionary and remove from CodeValidator
* 3) error when no main function found
* */
public class Driver {
    public static JFrame frame;
    public static void main(String[] args){
        GlobalConfig g = GlobalConfig.getInstance();

        if(g.isRunUI()){
            frame = new MainWindow("Puddle IDE",1280,720);
        } else {
            if(g.isQuickRun())quickRun(g.getQuickRunPath(),"UTF-8");
        }
    }

    private static void quickRun(String path, String charset){
        try {
            Interpreter.getInstance().parseFile(path, charset);
            //Interpreter.getInstance().execute();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
