package main.scanner;

import main.antlr.puddle.PuddleBaseListener;
import main.antlr.puddle.PuddleParser;

public class AntlrPuddleListener extends PuddleBaseListener {

    @Override
    public void enterMain(PuddleParser.MainContext ctx) {
        System.out.println("Program Start");
        System.out.println(ctx.getText());
    }

    @Override
    public void exitMain(PuddleParser.MainContext ctx) {
        System.out.println("Program End");
    }

}
