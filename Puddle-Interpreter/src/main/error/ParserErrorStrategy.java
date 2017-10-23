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
        throw new RuntimeException(e);
    }
    
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
    

}
