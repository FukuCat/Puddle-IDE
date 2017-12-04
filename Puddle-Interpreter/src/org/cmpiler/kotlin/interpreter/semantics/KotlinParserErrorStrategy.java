package org.cmpiler.kotlin.interpreter.semantics;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.IntervalSet;
import org.cmpiler.kotlin.antlr.KotlinParser;

public class KotlinParserErrorStrategy extends DefaultErrorStrategy {

    @Override
    public void recover(Parser recognizer, RecognitionException e) {
        testFix(recognizer, e);
    }

    private void testFix(Parser recognizer, RecognitionException e) {
        if (e instanceof InputMismatchException) {
            int ttype = recognizer.getInputStream().LA(1);
            while (ttype != KotlinParser.EOF && ttype != KotlinParser.SEMICOLON) {
                recognizer.consume();
                ttype = recognizer.getInputStream().LA(1);
            }
        } else {
            super.recover(recognizer, e);
        }
    }

    private void original(Parser recognizer, RecognitionException e) {
        super.recover(recognizer, e);

        TokenStream tokenStream = recognizer.getTokenStream();

        // Verify we are where we expect to be
        int currentToken = tokenStream.LA(1);
        if (currentToken == KotlinParser.EOF || currentToken == KotlinParser.WS || currentToken == KotlinParser.SEMICOLON) {
            // Get the next possible tokens
            IntervalSet intervalSet = getErrorRecoverySet(recognizer);

            // Move to the next token
            tokenStream.consume();

            // Move to the next possible token
            // If the errant element is the last in the set, this will move to the 'END' token in 'END MODULE'.
            // If there are subsequent elements in the set, this will move to the 'BEGIN' token in 'BEGIN module_element'.
            consumeUntil(recognizer, intervalSet);
            currentToken = tokenStream.LA(1);
        }
    }
}
