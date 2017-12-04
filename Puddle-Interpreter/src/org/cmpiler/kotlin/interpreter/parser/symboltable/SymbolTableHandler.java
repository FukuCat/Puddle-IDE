package org.cmpiler.kotlin.interpreter.parser.symboltable;

import org.antlr.symtab.*;

import java.util.HashMap;
import java.util.HashSet;

public class SymbolTableHandler extends SymbolTable{

    private static SymbolTableHandler instance;

    private Scope currentScope;
    private Scope mainScope;
    public static String TEMP1 = "divideCounter";
    public static String TEMP2 = "conquerCounter";
    public static String TEMP3 = "sortedArr";
    public static String TEMP4 = "mergeSortProper";
    public static String TEMP5 = "merge";
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

    @Override
    public void initTypeSystem() {

        definePredefinedSymbol(new PrimitiveType("Boolean"));
        definePredefinedSymbol(new PrimitiveType("Int"));
        definePredefinedSymbol(new PrimitiveType("Short"));
        definePredefinedSymbol(new PrimitiveType("Float"));
        definePredefinedSymbol(new PrimitiveType("Double"));
        definePredefinedSymbol(new PrimitiveType("Char"));
        definePredefinedSymbol(new PrimitiveType("String"));
        definePredefinedSymbol(new PrimitiveType("Long"));
        definePredefinedSymbol(new PrimitiveType("void"));

        definePredefinedSymbol(new ClassSymbol("BooleanArray"));
        definePredefinedSymbol(new ClassSymbol("IntArray"));
        definePredefinedSymbol(new ClassSymbol("ShortArray"));
        definePredefinedSymbol(new ClassSymbol("FloatArray"));
        definePredefinedSymbol(new ClassSymbol("DoubleArray"));
        definePredefinedSymbol(new ClassSymbol("CharArray"));
        definePredefinedSymbol(new ClassSymbol("StringArray"));
        definePredefinedSymbol(new ClassSymbol("LongArray"));

        definePredefinedSymbol(new FunctionSymbol("print"));
        definePredefinedSymbol(new FunctionSymbol("println"));
        definePredefinedSymbol(new FunctionSymbol("scan"));
    }

    public static Type getDefinedType(String name){
        if(getPredefinedSymbol(name) instanceof PrimitiveType) {
            return (PrimitiveType) getPredefinedSymbol(name);
        }
        if(getPredefinedSymbol(name) instanceof TypeAlias) {
            return (TypeAlias) getPredefinedSymbol(name);
        }
        if(getPredefinedSymbol(name) instanceof DataAggregateSymbol) {
            return (DataAggregateSymbol) getPredefinedSymbol(name);
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
