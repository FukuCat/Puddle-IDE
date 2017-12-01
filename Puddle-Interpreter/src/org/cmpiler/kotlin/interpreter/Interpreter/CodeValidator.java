package org.cmpiler.kotlin.interpreter.Interpreter;

import org.antlr.v4.runtime.ANTLRErrorListener;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.atn.ATNConfigSet;
import org.antlr.v4.runtime.dfa.DFA;
import org.cmpiler.kotlin.utils.ErrorDictionary;
import org.cmpiler.kotlin.utils.console.Console;

import java.util.BitSet;

public class CodeValidator implements ANTLRErrorListener {

    private static CodeValidator instance = null;

    private boolean isValid;

    private CodeValidator(){
        reset();
    }

    public void reset(){
        isValid = true;
    }

    public boolean isValid(){ return isValid; }

    public static CodeValidator getInstance(){ return instance == null? (instance = new CodeValidator()):instance; }

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer,
        Object offendingSymbol, int line, int charPositionInLine,
        String msg, RecognitionException e) {
        Console.log(Console.USER_ERROR, "Syntax error at line [" +line+ "]: " +msg);
        isValid = false;
    }

    @Override
    public void reportAmbiguity(Parser recognizer, DFA dfa, int startIndex,
        int stopIndex, boolean exact, BitSet ambigAlts, ATNConfigSet configs) {

    }

    @Override
    public void reportAttemptingFullContext(Parser recognizer, DFA dfa,
        int startIndex, int stopIndex, BitSet conflictingAlts,
        ATNConfigSet configs) {

    }

    @Override
    public void reportContextSensitivity(Parser recognizer, DFA dfa,
        int startIndex, int stopIndex, int prediction, ATNConfigSet configs) {

    }

    public static void reportCustomError(int errorCode, String additionalMessage) {
        String errorMessage = ErrorDictionary.getMessage(errorCode) + " " + additionalMessage;
        Console.log(Console.USER_ERROR, errorMessage);

        getInstance().isValid = false;
    }

    public static void reportCustomError(int errorCode, String additionalMessage, Object... parameters) {
        String errorMessage = String.format(ErrorDictionary.getMessage(errorCode) + " " + additionalMessage, parameters);
        Console.log(Console.USER_ERROR, errorMessage);

        getInstance().isValid = false;
    }
}
