package main.antlr;

import main.antlr.kotlin.KotlinParser;
import model.SharedData;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.tree.ParseTree;

public class AbstractSyntaxTreePrinter {
    public void print(RuleContext ctx) {
        System.out.println("Printing Abstract Syntax Tree...");
        SharedData.getInstance().appendConsoleText("Printing Abstract Syntax Tree...\n");
        explore(ctx, 0, true);
        System.out.println("Done.");
        SharedData.getInstance().appendConsoleText("Done.\n");
    }
    private void explore(RuleContext ctx, int indentation, boolean isImportant) {
        String ruleName = KotlinParser.ruleNames[ctx.getRuleIndex()];
        if(isImportant) {
            for (int i = 0; i < indentation; i++) {
                System.out.print(" ");
                SharedData.getInstance().appendConsoleText(" ");
            }
            System.out.println("["+ruleName + "]: [" + ctx.getText()+"]");
            SharedData.getInstance().appendConsoleText("["+ruleName + "]: [" + ctx.getText()+"]\n");
        }
        for (int i=0;i<ctx.getChildCount();i++) {
            ParseTree element = ctx.getChild(i);
            if (element instanceof RuleContext) {
                explore((RuleContext)element,
                        element.getChildCount() > 1? indentation + 1: indentation,
                        element.getChildCount() > 1);
            }
        }
    }
}
