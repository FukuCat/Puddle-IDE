package main.antlr.kotlin.listener;

import main.antlr.kotlin.KotlinLexer;
import main.antlr.kotlin.KotlinParser;
import main.antlr.kotlin.KotlinParserBaseListener;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.Vocabulary;
import org.antlr.v4.runtime.tree.TerminalNode;
import utils.ConsoleLogger;

public class AntlrKotlinListener extends KotlinParserBaseListener {
    @Override
    public void enterKotlinFile(KotlinParser.KotlinFileContext ctx) {

        //System.out.println("Program Start");
        //print(ctx);

    }

    @Override
    public void exitKotlinFile(KotlinParser.KotlinFileContext ctx) {

        //System.out.println("Program End");

    }

    public void print(RuleContext ctx){
        ConsoleLogger.log("["+KotlinParser.ruleNames[ctx.getRuleIndex()] + ":"+ctx.getRuleIndex()+"]: [" + ctx.getText()+"]\n");
    }

}
