package org.cmpiler.kotlin.interpreter.parser;

import org.antlr.symtab.*;

import java.util.HashMap;
import java.util.HashSet;

public class SymbolTableHandler extends SymbolTable {

    public static final int VISIBILITY_PUBLIC = 1;
    public static final int VISIBILITY_PRIVATE = 2;
    public static final int VISIBILITY_PROTECTED = 3;
    public static String TEMP1 = "divideCounter";
    public static String TEMP2 = "conquerCounter";
    public static String TEMP3 = "sortedArr";
    public static String TEMP4 = "mergeSortProper";
    public static String TEMP5 = "merge";

    private static SymbolTableHandler instance;

    private HashMap<String, GlobalScope> packages;

    private Scope currentScope;
    private Scope mainScope;

    private HashMap<Symbol, Integer> symbolVisibility; // private, public, internal
    private HashSet<FunctionSymbol> symbolFunctionWithReturn; // private, public, internal
    private HashSet<Symbol> symbolConstant; // val is constant and will be added here
    // TODO: scope var vals
    private HashMap<String, Object> symbolValue;
    private SymbolTableHandler(){
        super();
        symbolFunctionWithReturn = new HashSet<>();
        symbolValue = new HashMap<>();
        packages = new HashMap<>();
        symbolVisibility = new HashMap<>();
        symbolConstant = new HashSet<>();
        initTypeSystem();
    }
    public void reset(){
        GLOBALS = new GlobalScope(PREDEFINED);
        symbolFunctionWithReturn.clear();
        symbolValue.clear();
        packages.clear();
        symbolConstant.clear();
        symbolVisibility.clear();
        mainScope = null;
        currentScope = null;
    }

    public void definePackage(String name){
        GlobalScope g = new GlobalScope(PREDEFINED);
        packages.put(name, g);
    }

    public static SymbolTableHandler getInstance(){return instance == null? (instance = new SymbolTableHandler()):instance;}

    @Override
    public void initTypeSystem() {
        PrimitiveType pVoid, pNull;
        PrimitiveType pBoolean, pInt, pFloat, pDouble, pChar, pString, pLong;
        ClassSymbol pBooleanArray, pIntArray, pFloatArray, pDoubleArray, pCharArray, pStringArray, pLongArray;
        FunctionSymbol fPrint, fPrintln, fScanInt, fScanFloat, fScanChar, fScanString, fScan;
        MethodSymbol fBooleanArray, fIntArray, fFloatArray, fDoubleArray, fCharArray, fStringArray, fLongArray;
        MethodSymbol fGetBooleanArray, fGetIntArray, fGetFloatArray, fGetDoubleArray, fGetCharArray, fGetStringArray, fGetLongArray;
        MethodSymbol fSetBooleanArray, fSetIntArray, fSetFloatArray, fSetDoubleArray, fSetCharArray, fSetStringArray, fSetLongArray;

        pVoid = new PrimitiveType("void");
        pNull = new PrimitiveType("null");

        definePredefinedSymbol(pVoid);
        definePredefinedSymbol(pNull);

        pBoolean = new PrimitiveType("Boolean");
        pInt = new PrimitiveType("Int");
        pFloat = new PrimitiveType("Float");
        pDouble = new PrimitiveType("Double");
        pChar = new PrimitiveType("Char");
        pString = new PrimitiveType("String");
        pLong = new PrimitiveType("Long");

        pBooleanArray = new ClassSymbol("BooleanArray");
        pIntArray = new ClassSymbol("IntArray");
        pFloatArray = new ClassSymbol("FloatArray");
        pDoubleArray = new ClassSymbol("DoubleArray");
        pCharArray = new ClassSymbol("CharArray");
        pStringArray = new ClassSymbol("StringArray");
        pLongArray = new ClassSymbol("LongArray");

        definePredefinedSymbol(pBoolean);
        definePredefinedSymbol(pInt);
        definePredefinedSymbol(pFloat);
        definePredefinedSymbol(pDouble);
        definePredefinedSymbol(pChar);
        definePredefinedSymbol(pString);
        definePredefinedSymbol(pLong);

        definePredefinedSymbol(pBooleanArray);
        definePredefinedSymbol(pIntArray);
        definePredefinedSymbol(pFloatArray);
        definePredefinedSymbol(pDoubleArray);
        definePredefinedSymbol(pCharArray);
        definePredefinedSymbol(pStringArray);
        definePredefinedSymbol(pLongArray);
        // functions
        fPrint = new FunctionSymbol("print(String)");
        fPrintln = new FunctionSymbol("println(String)");
        fScanInt = new FunctionSymbol("scanInt()");
        fScanFloat = new FunctionSymbol("scanFloat()");
        fScanChar = new FunctionSymbol("scanChar()");
        fScanString = new FunctionSymbol("scanString()");
        fScan = new FunctionSymbol("scan(String)");

        // array constructors
        fBooleanArray = new MethodSymbol("BooleanArray(Int)");
        fIntArray = new MethodSymbol("IntArray(Int)");
        fFloatArray = new MethodSymbol("FloatArray(Int)");
        fDoubleArray = new MethodSymbol("DoubleArray(Int)");
        fCharArray = new MethodSymbol("CharArray(Int)");
        fStringArray = new MethodSymbol("StringArray(Int)");
        fLongArray = new MethodSymbol("LongArray(Int)");
        // array get / set
        fGetBooleanArray = new MethodSymbol("get(Int)");
        fGetIntArray = new MethodSymbol("get(Int)");
        fGetFloatArray = new MethodSymbol("get(Int)");
        fGetDoubleArray = new MethodSymbol("get(Int)");
        fGetCharArray = new MethodSymbol("get(Int)");
        fGetStringArray = new MethodSymbol("get(Int)");
        fGetLongArray = new MethodSymbol("get(Int)");

        fGetBooleanArray.setType(pBoolean);
        fGetIntArray.setType(pInt);
        fGetFloatArray.setType(pFloat);
        fGetDoubleArray.setType(pDouble);
        fGetCharArray.setType(pChar);
        fGetStringArray.setType(pString);
        fGetLongArray.setType(pLong);

        fSetBooleanArray = new MethodSymbol("set(Int|Boolean)");
        fSetIntArray = new MethodSymbol("set(Int|Int)");
        fSetFloatArray = new MethodSymbol("set(Int|Float)");
        fSetDoubleArray = new MethodSymbol("set(Int|Double)");
        fSetCharArray = new MethodSymbol("set(Int|Char)");
        fSetStringArray = new MethodSymbol("set(Int|String)");
        fSetLongArray = new MethodSymbol("set(Int|Long)");

        // return type
        fPrint.setType(pVoid);
        fPrintln.setType(pVoid);
        fScanInt.setType(pInt);
        fScanFloat.setType(pFloat);
        fScanChar.setType(pChar);
        fScanString.setType(pString);
        fScan.setType(pVoid);

        fBooleanArray.setType(pBooleanArray);
        fIntArray.setType(pIntArray);
        fFloatArray.setType(pFloatArray);
        fDoubleArray.setType(pDoubleArray);
        fCharArray.setType(pCharArray);
        fStringArray.setType(pStringArray);
        fLongArray.setType(pLongArray);

        fSetBooleanArray.setType(pVoid);
        fSetIntArray.setType(pVoid);
        fSetFloatArray.setType(pVoid);
        fSetDoubleArray.setType(pVoid);
        fSetCharArray.setType(pVoid);
        fSetStringArray.setType(pVoid);
        fSetLongArray.setType(pVoid);

        fGetBooleanArray.setType(pBoolean);
        fGetIntArray.setType(pInt);
        fGetFloatArray.setType(pFloat);
        fGetDoubleArray.setType(pDouble);
        fGetCharArray.setType(pChar);
        fGetStringArray.setType(pString);
        fGetLongArray.setType(pLong);


        // argument params
        ParameterSymbol p;
        p  = new ParameterSymbol("text");
        p.setType(pString);
        fPrint.define(p);
        p  = new ParameterSymbol("text");
        p.setType(pString);
        fPrintln.define(p);

        p  = new ParameterSymbol("size");
        p.setType(pInt);
        fBooleanArray.define(p);
        p  = new ParameterSymbol("size");
        p.setType(pInt);
        fIntArray.define(p);
        p  = new ParameterSymbol("size");
        p.setType(pInt);
        fFloatArray.define(p);
        p  = new ParameterSymbol("size");
        p.setType(pInt);
        fDoubleArray.define(p);
        p  = new ParameterSymbol("size");
        p.setType(pInt);
        fCharArray.define(p);
        p  = new ParameterSymbol("size");
        p.setType(pInt);
        fStringArray.define(p);
        p  = new ParameterSymbol("size");
        p.setType(pInt);
        fLongArray.define(p);

        p  = new ParameterSymbol("index");
        p.setType(pInt);
        fGetBooleanArray.define(p);
        p  = new ParameterSymbol("index");
        p.setType(pInt);
        fGetIntArray.define(p);
        p  = new ParameterSymbol("index");
        p.setType(pInt);
        fGetFloatArray.define(p);
        p  = new ParameterSymbol("index");
        p.setType(pInt);
        fGetDoubleArray.define(p);
        p  = new ParameterSymbol("index");
        p.setType(pInt);
        fGetCharArray.define(p);
        p  = new ParameterSymbol("index");
        p.setType(pInt);
        fGetStringArray.define(p);
        p  = new ParameterSymbol("index");
        p.setType(pInt);
        fGetLongArray.define(p);
        p  = new ParameterSymbol("text");
        p.setType(pString);
        fScan.define(p);

        ParameterSymbol p2, p1;
        p1  = new ParameterSymbol("index");
        p1.setType(pInt);
        p2  = new ParameterSymbol("value");
        p2.setType(pBoolean);
        fSetBooleanArray.define(p1);
        fSetBooleanArray.define(p2);
        p1  = new ParameterSymbol("index");
        p1.setType(pInt);
        p2  = new ParameterSymbol("value");
        p2.setType(pInt);
        fSetIntArray.define(p1);
        fSetIntArray.define(p2);
        p1  = new ParameterSymbol("index");
        p1.setType(pInt);
        p2  = new ParameterSymbol("value");
        p2.setType(pFloat);
        fSetFloatArray.define(p1);
        fSetFloatArray.define(p2);
        p1  = new ParameterSymbol("index");
        p1.setType(pInt);
        p2  = new ParameterSymbol("value");
        p2.setType(pDouble);
        fSetDoubleArray.define(p1);
        fSetDoubleArray.define(p2);
        p1  = new ParameterSymbol("index");
        p1.setType(pInt);
        p2  = new ParameterSymbol("value");
        p2.setType(pChar);
        fSetCharArray.define(p1);
        fSetCharArray.define(p2);
        p1  = new ParameterSymbol("index");
        p1.setType(pInt);
        p2  = new ParameterSymbol("value");
        p2.setType(pString);
        fSetStringArray.define(p1);
        fSetStringArray.define(p2);
        p1  = new ParameterSymbol("index");
        p1.setType(pInt);
        p2  = new ParameterSymbol("value");
        p2.setType(pLong);
        fSetLongArray.define(p1);
        fSetLongArray.define(p2);

        pBooleanArray.define(fGetBooleanArray);
        pBooleanArray.define(fSetBooleanArray);
        pIntArray.define(fSetIntArray);
        pIntArray.define(fGetIntArray);
        pFloatArray.define(fSetFloatArray);
        pFloatArray.define(fGetFloatArray);
        pDoubleArray.define(fSetDoubleArray);
        pDoubleArray.define(fGetDoubleArray);
        pCharArray.define(fSetCharArray);
        pCharArray.define(fGetCharArray);
        pStringArray.define(fSetStringArray);
        pStringArray.define(fGetStringArray);
        pLongArray.define(fSetLongArray);
        pLongArray.define(fGetLongArray);

        definePredefinedSymbol(fPrint);
        definePredefinedSymbol(fPrintln);
        definePredefinedSymbol(fScanInt);
        definePredefinedSymbol(fScanFloat);
        definePredefinedSymbol(fScanChar);
        definePredefinedSymbol(fScanString);
        definePredefinedSymbol(fScan);

        definePredefinedSymbol(fBooleanArray);
        definePredefinedSymbol(fIntArray);
        definePredefinedSymbol(fFloatArray);
        definePredefinedSymbol(fDoubleArray);
        definePredefinedSymbol(fCharArray);
        definePredefinedSymbol(fStringArray);
        definePredefinedSymbol(fLongArray);
    }

    public Type getDefinedType(String name){
        if(currentScope.resolve(name) instanceof PrimitiveType) {
            return (PrimitiveType) currentScope.resolve(name);
        }
        if(currentScope.resolve(name) instanceof TypeAlias) {
            return (TypeAlias) currentScope.resolve(name);
        }
        if(currentScope.resolve(name) instanceof DataAggregateSymbol) {
            return (DataAggregateSymbol) currentScope.resolve(name);
        }
        return null;
    }

    public boolean isSymbolConstant(Symbol symbol){
        return symbolConstant.contains(symbol);
    }

    public void setSymbolConstant(Symbol symbol){
        symbolConstant.add(symbol);
    }

    public Symbol getSymbolDefinedInCurrentScope(String name){return getCurrentScope().getSymbol(name);}

    public void pushScope(Scope s) {
        setCurrentScope(s);
    }

    public void popScope() {
        getInstance().setCurrentScope(getCurrentScope().getEnclosingScope());
    }
    public boolean isSymbolDefinedInCurrentScope(String name){
        return getCurrentScope().getSymbol(name) != null || GLOBALS.getSymbol(name) != null || PREDEFINED.getSymbol(name) != null;
    }
    public Scope getCurrentScope(){ return currentScope; }

    public void printTable(){
    }

    public Symbol getPredefinedSymbol(String name){return PREDEFINED.getSymbol(name);}

    public Scope getMainScope() {
        return mainScope;
    }

    public void setMainScope(Scope mainScope) {
        this.mainScope = mainScope;
    }

    public int getSymbolVisibility(Symbol symbol) {
        Integer result = symbolVisibility.get(symbol);
        if(result == null)
            return VISIBILITY_PUBLIC;
        return result;
    }

    public void setSymbolVisibility(Symbol symbol, int value) {
        symbolVisibility.put(symbol,value);
    }

    public void setCurrentScope(Scope currentScope) {
        this.currentScope = currentScope;
    }

    public HashMap<String, GlobalScope> getPackages() {
        return packages;
    }

    public void setPackages(HashMap<String, GlobalScope> packages) {
        this.packages = packages;
    }

    public HashMap<String, Object> getSymbolValue() {
        return symbolValue;
    }

    public void setSymbolValue(HashMap<String, Object> symbolValue) {
        this.symbolValue = symbolValue;
    }

    public HashSet<FunctionSymbol> getSymbolFunctionWithReturn() {
        return symbolFunctionWithReturn;
    }

    public void setSymbolFunctionWithReturn(HashSet<FunctionSymbol> symbolFunctionWithReturn) {
        this.symbolFunctionWithReturn = symbolFunctionWithReturn;
    }
}
