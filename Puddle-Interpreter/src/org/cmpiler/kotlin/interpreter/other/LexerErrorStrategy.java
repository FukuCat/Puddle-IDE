/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.cmpiler.kotlin.interpreter.other;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.LexerNoViableAltException;
import org.cmpiler.kotlin.antlr.KotlinLexer;

/**
 *
 * @author msi
 */
public class LexerErrorStrategy extends KotlinLexer {
    public LexerErrorStrategy(CharStream input) { super(input); }
    public void recover(LexerNoViableAltException e) {
        throw new RuntimeException(e); // Bail out
    }
}
