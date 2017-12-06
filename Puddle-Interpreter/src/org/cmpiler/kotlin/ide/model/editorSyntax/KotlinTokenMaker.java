package org.cmpiler.kotlin.ide.model.editorSyntax;

import org.fife.ui.rsyntaxtextarea.AbstractTokenMaker;
import org.fife.ui.rsyntaxtextarea.RSyntaxUtilities;
import org.fife.ui.rsyntaxtextarea.Token;
import org.fife.ui.rsyntaxtextarea.TokenMap;

import javax.swing.text.Segment;
import java.util.HashSet;

public class KotlinTokenMaker extends AbstractTokenMaker {

    @Override
    public boolean getMarkOccurrencesOfTokenType(int type) {
        return type==Token.IDENTIFIER || type==Token.VARIABLE || type==Token.FUNCTION;
    }

    @Override
    public TokenMap getWordsToHighlight() {
        TokenMap tokenMap = new TokenMap();

        tokenMap.put("case",  Token.RESERVED_WORD);
        tokenMap.put("return", Token.RESERVED_WORD);

        tokenMap.put("print", Token.FUNCTION);
        tokenMap.put("scan",  Token.FUNCTION);
        tokenMap.put("main",  Token.FUNCTION);
        tokenMap.put("if", Token.FUNCTION);
        tokenMap.put("for",  Token.FUNCTION);
        tokenMap.put("while",  Token.FUNCTION);
        tokenMap.put("do",  Token.FUNCTION);

        tokenMap.put("Int", Token.DATA_TYPE);
        tokenMap.put("Float", Token.DATA_TYPE);
        tokenMap.put("Double", Token.DATA_TYPE);
        tokenMap.put("Long", Token.DATA_TYPE);
        tokenMap.put("String", Token.DATA_TYPE);
        tokenMap.put("Char", Token.DATA_TYPE);
        tokenMap.put("IntArray", Token.DATA_TYPE);
        tokenMap.put("FloatArray", Token.DATA_TYPE);
        tokenMap.put("DoubleArray", Token.DATA_TYPE);
        tokenMap.put("LongArray", Token.DATA_TYPE);
        tokenMap.put("StringArray", Token.DATA_TYPE);
        tokenMap.put("CharArray", Token.DATA_TYPE);

        tokenMap.put("var", Token.RESERVED_WORD);
        tokenMap.put("val", Token.RESERVED_WORD);
        tokenMap.put("class", Token.RESERVED_WORD);
        tokenMap.put("fun", Token.RESERVED_WORD);

/*
        tokenMap.put("(", Token.RESERVED_WORD_2);
        tokenMap.put(")", Token.RESERVED_WORD_2);
        tokenMap.put("{", Token.RESERVED_WORD_2);
        tokenMap.put("}", Token.RESERVED_WORD_2);
        */
        return tokenMap;
    }

    @Override
    public void addToken(Segment segment, int start, int end, int tokenType, int startOffset) {
        // This assumes all keywords, etc. were parsed as "identifiers."

        switch (tokenType){
            case Token.IDENTIFIER:
                int value = wordsToHighlight.get(segment, start, end);
                if (value != -1) {
                    tokenType = value;
                }
                break;
            case Token.COMMENT_MULTILINE:
            case Token.COMMENT_EOL:
            case Token.SEPARATOR:
            case Token.OPERATOR:
            case Token.LITERAL_NUMBER_DECIMAL_INT:
            case Token.LITERAL_NUMBER_FLOAT:
            case Token.LITERAL_STRING_DOUBLE_QUOTE:
            case Token.WHITESPACE:
                break;
            default:
                tokenType = Token.IDENTIFIER;
                break;
        }


        super.addToken(segment, start, end, tokenType, startOffset);
    }

    @Override
    public Token getTokenList(Segment text, int startTokenType, int startOffset) {

        resetTokenList();

        char[] array = text.array;
        int offset = text.offset;
        int count = text.count;
        int end = offset + count;

        // Token starting offsets are always of the form:
        // 'startOffset + (currentTokenStart-offset)', but since startOffset and
        // offset are constant, tokens' starting positions become:
        // 'newStartOffset+currentTokenStart'.
        int newStartOffset = startOffset - offset;

        int currentTokenStart = offset;
        int currentTokenType  = startTokenType;

        for (int i=offset; i<end; i++) {

            char c = array[i];

            switch (currentTokenType) {

                case Token.NULL:

                    currentTokenStart = i;   // Starting a new token here.

                    switch (c) {

                        case ' ':
                        case '\t':
                            currentTokenType = Token.WHITESPACE;
                            break;
                        case '{':
                        case '}':
                        case '(':
                        case ')':
                            currentTokenType = Token.SEPARATOR;
                            break;

                        case '+':
                            currentTokenType = Token.OPERATOR;
                            if (firstToken==null && i<end-1) {
                                char next = array[i+1];
                                switch(next) {
                                    case '+':
                                    case '=':
                                        currentTokenType = Token.OPERATOR;
                                        break;
                                    default:
                                        currentTokenType = Token.IDENTIFIER;
                                }
                            }
                            break;
                        case '-':
                            currentTokenType = Token.OPERATOR;
                            if (firstToken==null && i<end-1) {
                                char next = array[i+1];
                                switch(next) {
                                    case '-':
                                    case '=':
                                        currentTokenType = Token.OPERATOR;
                                        break;
                                    default:
                                        currentTokenType = Token.IDENTIFIER;
                                }
                            }
                            break;
                        case '=':
                            currentTokenType = Token.OPERATOR;
                            if (firstToken==null && i<end-1) {
                                char next = array[i+1];
                                switch(next) {
                                    case '=':
                                        currentTokenType = Token.OPERATOR;
                                        break;
                                    default:
                                        currentTokenType = Token.IDENTIFIER;
                                }
                            }
                            break;
                        case '*':
                        case ':':
                            currentTokenType = Token.OPERATOR;
                            break;
                        case '<':
                        case '>':
                            currentTokenType = Token.OPERATOR;
                            if (firstToken==null && i<end-1) {
                                char next = array[i+1];
                                switch(next) {
                                    case '=':
                                        currentTokenType = Token.OPERATOR;
                                        break;
                                    default:
                                        currentTokenType = Token.IDENTIFIER;
                                }
                            }
                            break;

                        case '"':
                            currentTokenType = Token.LITERAL_STRING_DOUBLE_QUOTE;
                            break;

                        case '/':
                            currentTokenType = Token.OPERATOR;
                            if (firstToken==null && i<end-1) {
                                char next = array[i+1];
                                switch(next) {
                                    case '/':
                                        currentTokenType = Token.COMMENT_EOL;
                                        break;
                                    case '*':
                                        currentTokenType = Token.COMMENT_MULTILINE;
                                        break;
                                    default:
                                        currentTokenType = Token.IDENTIFIER;
                                }
                            }
                            break;

                        default:
                            if (RSyntaxUtilities.isDigit(c)) {
                                currentTokenType = Token.LITERAL_NUMBER_DECIMAL_INT;
                                break;
                            }
                            else if (RSyntaxUtilities.isLetter(c) || c=='/' || c=='_') {
                                currentTokenType = Token.IDENTIFIER;
                                break;
                            }

                            // Anything not currently handled - mark as an identifier
                            currentTokenType = Token.IDENTIFIER;
                            break;

                    } // End of switch (c).

                    break;

                case Token.WHITESPACE:

                    switch (c) {

                        case ' ':
                        case '\t':
                            break;   // Still whitespace.

                        case '{':
                        case '}':
                        case '(':
                        case ')':
                            addToken(text, currentTokenStart,i-1, Token.WHITESPACE, newStartOffset+currentTokenStart);
                            currentTokenStart = i;
                            currentTokenType = Token.SEPARATOR;
                            break;

                        case '+':
                            addToken(text, currentTokenStart,i-1, Token.WHITESPACE, newStartOffset+currentTokenStart);
                            currentTokenStart = i;
                            currentTokenType = Token.OPERATOR;
                            if (firstToken==null && i<end-1) {
                                char next = array[i+1];
                                switch(next) {
                                    case '+':
                                    case '=':
                                        currentTokenType = Token.OPERATOR;
                                        break;
                                    default:
                                        currentTokenType = Token.IDENTIFIER;
                                }
                            }
                            break;
                        case '-':
                            addToken(text, currentTokenStart,i-1, Token.WHITESPACE, newStartOffset+currentTokenStart);
                            currentTokenStart = i;
                            currentTokenType = Token.OPERATOR;
                            if (firstToken==null && i<end-1) {
                                char next = array[i+1];
                                switch(next) {
                                    case '-':
                                    case '=':
                                        currentTokenType = Token.OPERATOR;
                                        break;
                                    default:
                                        currentTokenType = Token.IDENTIFIER;
                                }
                            }
                            break;
                        case '=':
                            addToken(text, currentTokenStart,i-1, Token.WHITESPACE, newStartOffset+currentTokenStart);
                            currentTokenStart = i;
                            currentTokenType = Token.OPERATOR;
                            if (firstToken==null && i<end-1) {
                                char next = array[i+1];
                                switch(next) {
                                    case '=':
                                        currentTokenType = Token.OPERATOR;
                                        break;
                                    default:
                                        currentTokenType = Token.IDENTIFIER;
                                }
                            }
                            break;
                        case '*':
                        case ':':
                            addToken(text, currentTokenStart,i-1, Token.WHITESPACE, newStartOffset+currentTokenStart);
                            currentTokenStart = i;
                            currentTokenType = Token.OPERATOR;
                            break;
                        case '<':
                        case '>':
                            addToken(text, currentTokenStart,i-1, Token.WHITESPACE, newStartOffset+currentTokenStart);
                            currentTokenStart = i;
                            currentTokenType = Token.OPERATOR;
                            if (firstToken==null && i<end-1) {
                                char next = array[i+1];
                                switch(next) {
                                    case '=':
                                        currentTokenType = Token.OPERATOR;
                                        break;
                                    default:
                                        currentTokenType = Token.IDENTIFIER;
                                }
                            }
                            break;

                        case '"':
                            addToken(text, currentTokenStart,i-1, Token.WHITESPACE, newStartOffset+currentTokenStart);
                            currentTokenStart = i;
                            currentTokenType = Token.LITERAL_STRING_DOUBLE_QUOTE;
                            break;
                        case '/':
                            addToken(text, currentTokenStart,i-1, Token.WHITESPACE, newStartOffset+currentTokenStart);
                            currentTokenStart = i;
                            currentTokenType = Token.OPERATOR;
                            if (i<end-1) {
                                char next = array[i+1];
                                switch(next) {
                                    case '/':
                                        currentTokenType = Token.COMMENT_EOL;
                                        break;
                                    case '*':
                                        currentTokenType = Token.COMMENT_MULTILINE;
                                        break;
                                    default:
                                        currentTokenType = Token.IDENTIFIER;
                                }
                            }
                            break;

                        default:   // Add the whitespace token and start anew.

                            addToken(text, currentTokenStart,i-1, Token.WHITESPACE, newStartOffset+currentTokenStart);
                            currentTokenStart = i;

                            if (RSyntaxUtilities.isDigit(c)) {
                                currentTokenType = Token.LITERAL_NUMBER_DECIMAL_INT;
                                break;
                            }
                            else if (RSyntaxUtilities.isLetter(c) || c=='/' || c=='_') {
                                currentTokenType = Token.IDENTIFIER;
                                break;
                            }

                            // Anything not currently handled - mark as identifier
                            currentTokenType = Token.IDENTIFIER;

                    } // End of switch (c).

                    break;

                default: // Should never happen
                case Token.IDENTIFIER:

                    switch (c) {

                        case ' ':
                        case '\t':
                            addToken(text, currentTokenStart,i-1, Token.IDENTIFIER, newStartOffset+currentTokenStart);
                            currentTokenStart = i;
                            currentTokenType = Token.WHITESPACE;
                            break;
                        case '{':
                        case '}':
                        case '(':
                        case ')':
                            addToken(text, currentTokenStart,i-1, Token.IDENTIFIER, newStartOffset+currentTokenStart);
                            currentTokenStart = i;
                            currentTokenType = Token.SEPARATOR;
                            break;
                        case '+':
                            addToken(text, currentTokenStart,i-1, Token.IDENTIFIER, newStartOffset+currentTokenStart);
                            currentTokenStart = i;
                            currentTokenType = Token.OPERATOR;
                            if (firstToken==null && i<end-1) {
                                char next = array[i+1];
                                switch(next) {
                                    case '+':
                                    case '=':
                                        currentTokenType = Token.OPERATOR;
                                        break;
                                    default:
                                        currentTokenType = Token.IDENTIFIER;
                                }
                            }
                            break;
                        case '-':
                            addToken(text, currentTokenStart,i-1, Token.IDENTIFIER, newStartOffset+currentTokenStart);
                            currentTokenStart = i;
                            currentTokenType = Token.OPERATOR;
                            if (firstToken==null && i<end-1) {
                                char next = array[i+1];
                                switch(next) {
                                    case '-':
                                    case '=':
                                        currentTokenType = Token.OPERATOR;
                                        break;
                                    default:
                                        currentTokenType = Token.IDENTIFIER;
                                }
                            }
                            break;
                        case '=':
                            addToken(text, currentTokenStart,i-1, Token.IDENTIFIER, newStartOffset+currentTokenStart);
                            currentTokenStart = i;
                            currentTokenType = Token.OPERATOR;
                            if (firstToken==null && i<end-1) {
                                char next = array[i+1];
                                switch(next) {
                                    case '=':
                                        currentTokenType = Token.OPERATOR;
                                        break;
                                    default:
                                        currentTokenType = Token.IDENTIFIER;
                                }
                            }
                            break;
                        case '*':
                        case ':':
                            addToken(text, currentTokenStart,i-1, Token.IDENTIFIER, newStartOffset+currentTokenStart);
                            currentTokenStart = i;
                            currentTokenType = Token.OPERATOR;
                            break;
                        case '<':
                        case '>':
                            addToken(text, currentTokenStart,i-1, Token.IDENTIFIER, newStartOffset+currentTokenStart);
                            currentTokenStart = i;
                            currentTokenType = Token.OPERATOR;
                            if (firstToken==null && i<end-1) {
                                char next = array[i+1];
                                switch(next) {
                                    case '=':
                                        currentTokenType = Token.OPERATOR;
                                        break;
                                    default:
                                        currentTokenType = Token.IDENTIFIER;
                                }
                            }
                            break;
                        case '"':
                            addToken(text, currentTokenStart,i-1, Token.IDENTIFIER, newStartOffset+currentTokenStart);
                            currentTokenStart = i;
                            currentTokenType = Token.LITERAL_STRING_DOUBLE_QUOTE;
                            break;
                        case '/':
                            addToken(text, currentTokenStart,i-1, Token.IDENTIFIER, newStartOffset+currentTokenStart);
                            currentTokenStart = i;
                            currentTokenType = Token.OPERATOR;
                            if (i<end-1) {
                                char next = array[i+1];
                                switch(next) {
                                    case '/':
                                        currentTokenType = Token.COMMENT_EOL;
                                        break;
                                    case '*':
                                        currentTokenType = Token.COMMENT_MULTILINE;
                                        break;
                                    default:
                                        currentTokenType = Token.IDENTIFIER;
                                }
                            }
                            break;
                        default:
                            if (RSyntaxUtilities.isLetterOrDigit(c) || c=='/' || c=='_') {
                                break;   // Still an identifier of some type.
                            }
                            // Otherwise, we're still an identifier (?).

                    } // End of switch (c).

                    break;

                case Token.LITERAL_NUMBER_DECIMAL_INT:

                    switch (c) {

                        case ' ':
                        case '\t':
                            addToken(text, currentTokenStart,i-1, Token.LITERAL_NUMBER_DECIMAL_INT, newStartOffset+currentTokenStart);
                            currentTokenStart = i;
                            currentTokenType = Token.WHITESPACE;
                            break;
                        case '{':
                        case '}':
                        case '(':
                        case ')':
                            addToken(text, currentTokenStart,i-1, Token.LITERAL_NUMBER_DECIMAL_INT, newStartOffset+currentTokenStart);
                            currentTokenStart = i;
                            currentTokenType = Token.SEPARATOR;
                            break;

                        case '"':
                            addToken(text, currentTokenStart,i-1, Token.LITERAL_NUMBER_DECIMAL_INT, newStartOffset+currentTokenStart);
                            currentTokenStart = i;
                            currentTokenType = Token.LITERAL_STRING_DOUBLE_QUOTE;
                            break;

                        case '+':
                            addToken(text, currentTokenStart,i-1, Token.LITERAL_NUMBER_DECIMAL_INT, newStartOffset+currentTokenStart);
                            currentTokenStart = i;
                            currentTokenType = Token.OPERATOR;
                            if (firstToken==null && i<end-1) {
                                char next = array[i+1];
                                switch(next) {
                                    case '+':
                                    case '=':
                                        currentTokenType = Token.OPERATOR;
                                        break;
                                    default:
                                        currentTokenType = Token.IDENTIFIER;
                                }
                            }
                            break;
                        case '-':
                            addToken(text, currentTokenStart,i-1, Token.LITERAL_NUMBER_DECIMAL_INT, newStartOffset+currentTokenStart);
                            currentTokenStart = i;
                            currentTokenType = Token.OPERATOR;
                            if (firstToken==null && i<end-1) {
                                char next = array[i+1];
                                switch(next) {
                                    case '-':
                                    case '=':
                                        currentTokenType = Token.OPERATOR;
                                        break;
                                    default:
                                        currentTokenType = Token.IDENTIFIER;
                                }
                            }
                            break;
                        case '=':
                            addToken(text, currentTokenStart,i-1, Token.LITERAL_NUMBER_DECIMAL_INT, newStartOffset+currentTokenStart);
                            currentTokenStart = i;
                            currentTokenType = Token.OPERATOR;
                            if (firstToken==null && i<end-1) {
                                char next = array[i+1];
                                switch(next) {
                                    case '=':
                                        currentTokenType = Token.OPERATOR;
                                        break;
                                    default:
                                        currentTokenType = Token.IDENTIFIER;
                                }
                            }
                            break;
                        case '*':
                        case ':':
                            addToken(text, currentTokenStart,i-1, Token.LITERAL_NUMBER_DECIMAL_INT, newStartOffset+currentTokenStart);
                            currentTokenStart = i;
                            currentTokenType = Token.OPERATOR;
                            break;
                        case '<':
                        case '>':
                            addToken(text, currentTokenStart,i-1, Token.LITERAL_NUMBER_DECIMAL_INT, newStartOffset+currentTokenStart);
                            currentTokenStart = i;
                            currentTokenType = Token.OPERATOR;
                            if (firstToken==null && i<end-1) {
                                char next = array[i+1];
                                switch(next) {
                                    case '=':
                                        currentTokenType = Token.OPERATOR;
                                        break;
                                    default:
                                        currentTokenType = Token.IDENTIFIER;
                                }
                            }
                            break;

                        case '/':
                            addToken(text, currentTokenStart,i-1, Token.LITERAL_NUMBER_DECIMAL_INT, newStartOffset+currentTokenStart);
                            currentTokenStart = i;
                            currentTokenType = Token.OPERATOR;
                            if (i<end-1) {
                                char next = array[i+1];
                                switch(next) {
                                    case '/':
                                        currentTokenType = Token.COMMENT_EOL;
                                        break;
                                    case '*':
                                        currentTokenType = Token.COMMENT_MULTILINE;
                                        break;
                                    default:
                                        currentTokenType = Token.IDENTIFIER;
                                }
                            }
                            break;
                        default:

                            if (RSyntaxUtilities.isDigit(c)) {
                                break;   // Still a literal number.
                            }

                            // Otherwise, remember this was a number and start over.
                            addToken(text, currentTokenStart,i-1, Token.LITERAL_NUMBER_DECIMAL_INT, newStartOffset+currentTokenStart);
                            i--;
                            currentTokenType = Token.NULL;

                    } // End of switch (c).

                    break;

                case Token.SEPARATOR:
                    addToken(text, currentTokenStart,i-1, Token.SEPARATOR, newStartOffset+currentTokenStart);
                    i--;
                    currentTokenType = Token.NULL;
                    break;
                case Token.OPERATOR:
                    addToken(text, currentTokenStart,i-1, Token.OPERATOR, newStartOffset+currentTokenStart);
                    i--;
                    currentTokenType = Token.NULL;
                    break;
                case Token.COMMENT_EOL:
                    i = end - 1;
                    addToken(text, currentTokenStart,i, Token.COMMENT_EOL, newStartOffset+currentTokenStart);
                    // We need to set token type to null so at the bottom we don't add one more token.
                    currentTokenType = Token.NULL;
                    break;
                case Token.COMMENT_MULTILINE:
                    boolean endMultilineComment = false;

                    if (i<end && i > 0 && array[i-1] == '*') {
                        char next = array[i];
                        if(next=='/')
                            endMultilineComment = true;
                    }

                    if(endMultilineComment){
                        addToken(text, currentTokenStart,i, Token.COMMENT_MULTILINE, newStartOffset+currentTokenStart);
                        currentTokenType = Token.NULL;
                    }
                    break;
                case Token.LITERAL_STRING_DOUBLE_QUOTE:
                    if (c=='"') {
                        addToken(text, currentTokenStart,i, Token.LITERAL_STRING_DOUBLE_QUOTE, newStartOffset+currentTokenStart);
                        currentTokenType = Token.NULL;
                    }
                    break;
            } // End of switch (currentTokenType).

        } // End of for (int i=offset; i<end; i++).

        switch (currentTokenType) {

            // Remember what token type to begin the next line with.
            case Token.LITERAL_STRING_DOUBLE_QUOTE:
                addToken(text, currentTokenStart,end-1, currentTokenType, newStartOffset+currentTokenStart);
                break;

            case Token.COMMENT_MULTILINE:
                addToken(text, currentTokenStart, end-1, Token.COMMENT_MULTILINE, newStartOffset+currentTokenStart);
                break;

            // Do nothing if everything was okay.
            case Token.NULL:
                addNullToken();
                break;

            // All other token types don't continue to the next line...
            default:
                addToken(text, currentTokenStart,end-1, currentTokenType, newStartOffset+currentTokenStart);
                addNullToken();

        }

        return firstToken;

    }
}
