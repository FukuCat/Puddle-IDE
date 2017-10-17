package main.parser;

import main.antlr.kotlin.KotlinLexer;
import main.antlr.kotlin.KotlinParser;
import main.antlr.kotlin.KotlinParserBaseListener;
import org.antlr.v4.runtime.Vocabulary;
import org.antlr.v4.runtime.tree.TerminalNode;

public class AntlrKotlinListener extends KotlinParserBaseListener {
    @Override
    public void enterKotlinFile(KotlinParser.KotlinFileContext ctx) {
        System.out.println("Program Start");
    }

    @Override
    public void exitKotlinFile(KotlinParser.KotlinFileContext ctx) {
        System.out.println("Program End");
    }

}
