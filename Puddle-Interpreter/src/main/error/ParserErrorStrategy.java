package main.error;


import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.IntervalSet;
import org.antlr.v4.runtime.DefaultErrorStrategy;
import org.antlr.v4.runtime.InputMismatchException;
import org.antlr.v4.runtime.NoViableAltException;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Token;

public class ParserErrorStrategy extends DefaultErrorStrategy {
    
    @Override
    public void recover(Parser recognizer, RecognitionException e) {
        if ( lastErrorIndex==recognizer.getInputStream().index() &&
                lastErrorStates != null &&
                lastErrorStates.contains(recognizer.getState()) ) {
            // uh oh, another error at same token index and previously-visited
            // state in ATN; must be a case where LT(1) is in the recovery
            // token set so nothing got consumed. Consume a single token
            // at least to prevent an infinite loop; this is a failsafe.
//			System.err.println("seen error condition before index="+
//							   lastErrorIndex+", states="+lastErrorStates);
//			System.err.println("FAILSAFE consumes "+recognizer.getTokenNames()[recognizer.getInputStream().LA(1)]);
            recognizer.consume();
        }
        lastErrorIndex = recognizer.getInputStream().index();
        if ( lastErrorStates==null ) lastErrorStates = new IntervalSet();
        lastErrorStates.add(recognizer.getState());
        IntervalSet followSet = getErrorRecoverySet(recognizer);
        consumeUntil(recognizer, followSet);
    }
    /*
    @Override
    public Token recoverInline(Parser recognizer)throws RecognitionException {
        throw new RuntimeException(new InputMismatchException(recognizer));
    }
    
    @Override
    public void sync(Parser recognizer) { }
    
    @Override
    public void reportNoViableAlternative(Parser parser,NoViableAltException e) throws RecognitionException {
        // ANTLR generates Parser subclasses from grammars and
        // Parser extends Recognizer. Parameter parser is a
        // pointer to the parser that detected the error
        String msg = "can't choose between alternatives"; // nonstandard msg
        parser.notifyErrorListeners(e.getOffendingToken(), msg, e);
    }
    */
}
