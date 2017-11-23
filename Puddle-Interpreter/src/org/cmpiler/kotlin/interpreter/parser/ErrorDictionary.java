package org.cmpiler.kotlin.interpreter.parser;

import java.util.HashMap;

public class ErrorDictionary {

    private static ErrorDictionary instance = null;

    public final static int INCONSISTENT_CLASS_NAME = 1000;
    public final static int TYPE_MISMATCH = 2000;
    public final static int UNDECLARED_VARIABLE = 3000;
    public final static int UNDECLARED_FUNCTION = 3333;
    public final static int UNDECLARED_TYPE = 3666;
    public final static int CONST_REASSIGNMENT = 3100;
    public final static int MULTIPLE_VARIABLE = 5000;
    public final static int MULTIPLE_FUNCTION = 5250;
    public final static int MULTIPLE_CLASS = 5500;
    public final static int MULTIPLE_MAIN = 5750;
    public final static int PARAMETER_COUNT_MISMATCH = 6000;
    public final static int RUNTIME_ARRAY_OUT_OF_BOUNDS = 7000;
    public final static int MISSING_THIS_KEYWORD = 8000;

    private HashMap<Integer, String> dictionary;

    private ErrorDictionary(){
        dictionary = new HashMap<>();
        initialize();
    }

    public static ErrorDictionary getInstance(){return instance == null? (instance = new ErrorDictionary()):instance; }

    private void initialize(){
        dictionary.put(INCONSISTENT_CLASS_NAME, "Inconsistent class name. ");
        dictionary.put(TYPE_MISMATCH, "Type mismatch at line %d. ");
        dictionary.put(UNDECLARED_VARIABLE, "Undeclared variable %s at line %d. ");
        dictionary.put(UNDECLARED_FUNCTION, "Undeclared function %s at line %d. ");
        dictionary.put(UNDECLARED_TYPE, "Undeclared type on function or variable %s at line %d. ");
        dictionary.put(CONST_REASSIGNMENT, "Constant %s can no longer reassign a new value at line %d.");
        dictionary.put(MULTIPLE_CLASS, "Duplicate declaration of class %s at line %d. ");
        dictionary.put(MULTIPLE_VARIABLE, "Duplicate declaration of variable %s at line %d. ");
        dictionary.put(MULTIPLE_FUNCTION, "Duplicate method declaration %s at line %d. ");
        dictionary.put(MULTIPLE_MAIN, "Multiple main functions found at line %d. ");
        dictionary.put(PARAMETER_COUNT_MISMATCH, "Argument size for method call %s at line %d does not match with its declaration. ");
        dictionary.put(RUNTIME_ARRAY_OUT_OF_BOUNDS, "Array %s out of bounds. Aborting operation. ");
        dictionary.put(MISSING_THIS_KEYWORD, "Missing 'this' keyword for method call %s line %d.");
    }

    public static String getMessage(int errorCode){
        if(getInstance().dictionary.containsKey(errorCode))
            return getInstance().dictionary.get(errorCode);
        return "ERROR! Error number ["+errorCode+"] is undefined. Please define in ErrorDictionary.java";
    }


}
