package main.antlr;

import Utils.ConsoleLogger;
import main.antlr.kotlin.KotlinParser;
import model.SharedData;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.tree.ParseTree;

public class AbstractSyntaxTreePrinter {
    public void print(RuleContext ctx) {
        ConsoleLogger.log("Printing Abstract Syntax Tree...\n");
        explore(ctx, 0, true);
        ConsoleLogger.log("Done.\n");
    }
    private void explore(RuleContext ctx, int indentation, boolean doPrint) {
        String ruleName = KotlinParser.ruleNames[ctx.getRuleIndex()];
        if(doPrint) {
            for (int i = 0; i < indentation; i++) {
                ConsoleLogger.log(" ");
            }
            ConsoleLogger.log("["+ruleName + ":"+ctx.getRuleIndex()+"]: [" + ctx.getText()+"]\n");
        }
        boolean isImportant;
        for (int i=0;i<ctx.getChildCount();i++) {
            ParseTree element = ctx.getChild(i);
            isImportant = element.getChildCount() > 1;
            if (element instanceof RuleContext) {
                explore((RuleContext)element,
                        isImportant? indentation + 1: indentation,
                        isImportant);
            }
        }
    }
}
