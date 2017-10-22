package main.error;

import main.antlr.kotlin.KotlinLexer;
import main.antlr.kotlin.KotlinParser;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATNConfigSet;
import org.antlr.v4.runtime.dfa.DFA;
import utils.ConsoleLogger;

import java.util.BitSet;
import java.util.Collections;
import java.util.List;

public class ParserErrorListener extends BaseErrorListener {

    private boolean hasError = false;

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
        if(!hasError) {
            List<String> stack = ((Parser) recognizer).getRuleInvocationStack();
            if (!stack.isEmpty()) {
                switch (stack.get(0)) {
                    case "functionValueParameters":
                        ConsoleLogger.err(
                                "[SyntaxError]" +
                                        "[Line " + line + ":" + charPositionInLine + "]" +
                                        "[" + ((Token) offendingSymbol).getText() + "]" +
                                        "[ Missing close parenthesis. ]\n");
                        break;
                    case "block":
                        ConsoleLogger.err(
                                "[SyntaxError]" +
                                        "[Line " + line + ":" + charPositionInLine + "]" +
                                        "[" + ((Token) offendingSymbol).getText() + "]" +
                                        "[ Check if functions are called properly. ]\n");
                        break;
                    default:
                        Collections.reverse(stack);
                        ConsoleLogger.err("Rule Stack: " + stack + "\n");
                        ConsoleLogger.err(
                                "[SyntaxError]" +
                                        "[Line " + line + ":" + charPositionInLine + "]" +
                                        "[" + ((Token) offendingSymbol).getText() + "]" +
                                        "[" + msg + "]\n");
                }
            }
            //hasError = true;
        }
    }

    @Override
    public void reportAmbiguity(Parser recognizer, DFA dfa, int startIndex, int stopIndex, boolean exact, BitSet ambigAlts, ATNConfigSet configs) {
    }
    @Override
    public void reportAttemptingFullContext(Parser recognizer, DFA dfa, int startIndex, int stopIndex, BitSet conflictingAlts, ATNConfigSet configs) {
    }
    @Override
    public void reportContextSensitivity(Parser recognizer, DFA dfa, int startIndex, int stopIndex, int prediction, ATNConfigSet configs) {
    }

}
