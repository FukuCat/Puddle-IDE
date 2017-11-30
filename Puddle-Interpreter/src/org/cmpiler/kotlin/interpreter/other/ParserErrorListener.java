package org.cmpiler.kotlin.interpreter.other;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATNConfigSet;
import org.antlr.v4.runtime.dfa.DFA;

import java.util.BitSet;
import java.util.Collections;
import java.util.List;

public class ParserErrorListener extends BaseErrorListener {

    private boolean hasError = false;

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
        if(!hasError && offendingSymbol instanceof Token) {
            Token t = (Token) offendingSymbol;
            List<String> stack = ((Parser) recognizer).getRuleInvocationStack();
            Collections.reverse(stack);
            //Console.err("rule stack: "+stack+"\n");
            /*
            Console.err(
                    "[SyntaxError]" +
                            "[Line " + t.getLine() + ":" + t.getCharPositionInLine() + "]" +
                            "[Symbol \'" + t.getText() + "\']" +
                            "[ "+msg+" ]\n");
                            */
            //Console.err("line "+line+":"+charPositionInLine+" before "+offendingSymbol+": "+msg+"\n");
            /*if (!stack.isEmpty()) {
                switch (stack.get(0)) {
                    case "functionValueParameters":
                        Console.err(
                                "[SyntaxError]" +
                                        "[Line " + t.getLine() + ":" + t.getCharPositionInLine() + "]" +
                                        "[Symbol \'" + t.getText() + "\']" +
                                        "[ Missing close parenthesis. ]\n");
                        SharedData.getInstance().highlightEditorLine(t.getLine());
                        break;
                    case "block":
                        Console.err(
                                "[SyntaxError]" +
                                        "[Line " + t.getLine() + ":" + t.getCharPositionInLine() + "]" +
                                        "[Symbol \'" + t.getText() + "\']" +
                                        "[ Check if statements are formatted properly / function block is closed. ]\n");
                        SharedData.getInstance().highlightEditorLine(t.getLine());
                        break;
                    case "kotlinFile":
                        Console.err(
                                "[SyntaxError]" +
                                        "[Line " + t.getLine() + ":" + t.getCharPositionInLine() + "]" +
                                        "[Symbol \'" + t.getText() + "\']" +
                                        "[ Unexpected symbol found at top-level. ]\n");
                        SharedData.getInstance().highlightEditorLine(t.getLine());
                        break;
                    default:
                        Collections.reverse(stack);
                        Console.err("Rule Stack: " + stack + "\n");
                        Console.err(
                                "[SyntaxError]" +
                                        "[Line " + t.getLine() + ":" + t.getCharPositionInLine() + "]" +
                                        "[Symbol \'" + t.getText() + "\']" +
                                        "[" + msg + "]\n");
                        SharedData.getInstance().highlightEditorLine(t.getLine());
                }
            }*/
            //hasError = true;
            /*
            Vocabulary vocab = KotlinLexer.VOCABULARY;
            Console.err(e.getExpectedTokens().toString(KotlinParser.VOCABULARY)+"\n");
            Console.err(e.getCtx().getText()+"\n");
            Console.err(e.getCtx().getParent().getText()+"\n");
            Console.err(vocab.getSymbolicName(e.getOffendingToken().getTokenIndex())+"\n");
            Console.err(vocab.getSymbolicName(e.getOffendingToken().getType())+"\n");
            */
        }
    }

    @Override
    public void reportAmbiguity(Parser recognizer, DFA dfa, int startIndex, int stopIndex, boolean exact, BitSet ambigAlts, ATNConfigSet configs) {
        //System.out.println("A");
    }
    @Override
    public void reportAttemptingFullContext(Parser recognizer, DFA dfa, int startIndex, int stopIndex, BitSet conflictingAlts, ATNConfigSet configs) {
        //System.out.println("AFC");
    }
    @Override
    public void reportContextSensitivity(Parser recognizer, DFA dfa, int startIndex, int stopIndex, int prediction, ATNConfigSet configs) {
        //System.out.println("CS");
    }

}