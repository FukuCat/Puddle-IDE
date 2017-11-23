package org.cmpiler.kotlin.ide.view.actions;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TestAction implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        //SharedData.getInstance().clearConsole();
        //new AbstractSyntaxTreePrinter().print( new KotlinParserFacade().parseString(SharedData.getInstance().getEditorText()));

        parse();
    }

    public void parse(){
        //SharedData.getInstance().setErrorLine(null);
        /*
        PuddleParserFacade parser = new PuddleParserFacade();
        try {
            ParseTreeWalker.DEFAULT.walk(new AntlrKotlinListener(), parser.parseString(SharedData.getInstance().getEditorText()));
        } catch (IOException e) {
            e.printStackTrace();
        }
        */
    }
}
