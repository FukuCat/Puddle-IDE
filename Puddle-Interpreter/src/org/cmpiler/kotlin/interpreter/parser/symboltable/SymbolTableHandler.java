package org.cmpiler.kotlin.interpreter.parser.symboltable;

import org.antlr.symtab.*;

import java.util.HashMap;
import java.util.HashSet;

public class SymbolTableHandler extends SymbolTable{

    private static SymbolTableHandler instance;

    private Scope currentScope;
    private Scope mainScope;

    private HashMap<Symbol, Integer> symbolArraySize;
    private HashMap<Symbol, String> symbolVisibility; // private, public, internal
    private HashSet<Symbol> symbolConstant; // val is constant and will be added here
    private HashMap<String,Object> symbolValue;

    public HashMap<String, Object> getSymbolValue() {
        return symbolValue;
    }

    public void setSymbolValue(HashMap<String, Object> symbolValue) {
        this.symbolValue = symbolValue;
    }

    private SymbolTableHandler(){
        super();
        currentScope = null;
        setSymbolVisibility(new HashMap<>());
        setSymbolConstant(new HashSet<>());
        symbolValue = new HashMap<>();
        initTypeSystem();
    }

    public static SymbolTableHandler getInstance(){return instance == null? (instance = new SymbolTableHandler()):instance;}

    public void initTypeSystem() {
        PrimitiveType pVoid, pNull;
        ClassSymbol pBoolean, pInt, pFloat, pDouble, pChar, pString, pLong;
        ClassSymbol pBooleanArray, pIntArray, pFloatArray, pDoubleArray, pCharArray, pStringArray, pLongArray;
        FunctionSymbol fPrint, fPrintln, fScanInt, fScanFloat, fScanChar, fScanString;
        MethodSymbol fBooleanArray, fIntArray, fFloatArray, fDoubleArray, fCharArray, fStringArray, fLongArray;

        pVoid = new PrimitiveType("void");
        pNull = new PrimitiveType("null");

        definePredefinedSymbol(pVoid);
        definePredefinedSymbol(pNull);

        pBoolean = new ClassSymbol("Boolean");
        pInt = new ClassSymbol("Int");
        pFloat = new ClassSymbol("Float");
        pDouble = new ClassSymbol("Double");
        pChar = new ClassSymbol("Char");
        pString = new ClassSymbol("String");
        pLong = new ClassSymbol("Long");

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

        // array constructors
        fBooleanArray = new MethodSymbol("BooleanArray(Int)");
        fIntArray = new MethodSymbol("IntArray(Int)");
        fFloatArray = new MethodSymbol("FloatArray(Int)");
        fDoubleArray = new MethodSymbol("DoubleArray(Int)");
        fCharArray = new MethodSymbol("CharArray(Int)");
        fStringArray = new MethodSymbol("StringArray(Int)");
        fLongArray = new MethodSymbol("LongArray(Int)");

        // return type
        fPrint.setType(pVoid);
        fPrintln.setType(pVoid);
        fScanInt.setType(pInt);
        fScanFloat.setType(pFloat);
        fScanChar.setType(pChar);
        fScanString.setType(pString);

        fBooleanArray.setType(pBooleanArray);
        fIntArray.setType(pIntArray);
        fFloatArray.setType(pFloatArray);
        fDoubleArray.setType(pDoubleArray);
        fCharArray.setType(pCharArray);
        fStringArray.setType(pStringArray);
        fLongArray.setType(pLongArray);

        // argument params
        fPrint.define(pString);
        fPrintln.define(pString);

        fBooleanArray.define(pInt);
        fIntArray.define(pInt);
        fFloatArray.define(pInt);
        fDoubleArray.define(pInt);
        fCharArray.define(pInt);
        fStringArray.define(pInt);
        fLongArray.define(pInt);

        definePredefinedSymbol(fPrint);
        definePredefinedSymbol(fPrintln);
        definePredefinedSymbol(fScanInt);
        definePredefinedSymbol(fScanFloat);
        definePredefinedSymbol(fScanChar);
        definePredefinedSymbol(fScanString);

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

    public static Symbol getSymbolDefinedInCurrentScope(String name){return getInstance().currentScope.getSymbol(name);}

    public static void reset(){
        getInstance().getSymbolConstant().clear();
        getInstance().getSymbolVisibility().clear();
        getInstance().currentScope = null;
    }

    public static void pushScope(Scope s) {
        getInstance().currentScope = s;
    }

    public static void popScope() {
        getInstance().currentScope = getInstance().currentScope.getEnclosingScope();
    }
    public static boolean isSymbolDefinedInCurrentScope(String name){
        return getInstance().currentScope.getSymbol(name) != null || getInstance().GLOBALS.getSymbol(name) != null || getInstance().PREDEFINED.getSymbol(name) != null;
    }
    public static Scope getCurrentScope(){ return getInstance().currentScope; }

    public void setCurrentScope(Scope scope){this.currentScope = scope;}

    public void printTable(){
    }

    public static Symbol getPredefinedSymbol(String name){return getInstance().PREDEFINED.getSymbol(name);}

    public Scope getMainScope() {
        return mainScope;
    }

    public void setMainScope(Scope mainScope) {
        this.mainScope = mainScope;
    }

    public HashMap<Symbol, String> getSymbolVisibility() {
        return symbolVisibility;
    }

    public void setSymbolVisibility(HashMap<Symbol, String> symbolVisibility) {
        this.symbolVisibility = symbolVisibility;
    }

    public HashSet<Symbol> getSymbolConstant() {
        return symbolConstant;
    }

    public void setSymbolConstant(HashSet<Symbol> symbolConstant) {
        this.symbolConstant = symbolConstant;
    }
}
