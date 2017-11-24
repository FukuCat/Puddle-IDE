/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.cmpiler.kotlin.interpreter.parser.symboltable;

/**
 *
 * @author msi
 */

import java.util.*;
import javax.script.ScriptEngineManager;
import javax.script.ScriptEngine;
import javax.script.ScriptException;
import javax.swing.JOptionPane;
import org.antlr.symtab.*;
import org.cmpiler.kotlin.Driver;
import org.cmpiler.kotlin.antlr.KotlinParser;
import org.cmpiler.kotlin.antlr.KotlinParserBaseListener;

public class SymbolTableBuilder1 extends KotlinParserBaseListener {
    
    private boolean end = false;
    
    @Override
    public void enterKotlinFile(KotlinParser.KotlinFileContext ctx) {
    }

    @Override
    public void exitKotlinFile(KotlinParser.KotlinFileContext ctx) {
    }

    @Override
    public void enterBlock(KotlinParser.BlockContext ctx) {
        String name, input;
        boolean match = false, stop = false, whilecheck = false;
        int i = 0, returnline = 0;
        int closeBrace = 0;
        if(!end){
            while(i<ctx.getChildCount()){
                name = "";
                name = ctx.getChild(i).getText();
                if(name.contains("}")){
                    closeBrace--;
                }
                if(name.contains("{")){
                    closeBrace++;
                }
                if(name.contains("if ")||name.contains("if(")){
                    ifLoop(name);
                }
                else if(name.contains("while ")||name.contains("while(")){
                    whileLoop(name);
                }
                else if(name.contains("for ")||name.contains("for(")){
                    forLoop(name);
                }
                else if(name.contains("scan ")||name.contains("scan(")){
                    scan(name);
                }
                else if(name.contains("print ")||name.contains("print(")){
                    print(name);
                }
                else if(name.contains("*")||name.contains("/")||name.contains("+")||name.contains("-")){
                    math(name);
                }
                else if(name.contains("=")){
                    assign(name);
                }
                i++;
            }
            end = true;
        }
    }
    
    public void assign(String name){
        name = name.replaceAll("\\s+", "");
        name = name.replaceAll("val", "");
        name = name.replaceAll(":", "");
        name = name.replaceAll("val", "");
        name = name.replaceAll("Int", "");
        name = name.replaceAll("String", "");
        name = name.replaceAll("Float", "");
        name = name.replaceAll("Boolean", "");
        name = name.replaceAll("IntArray", "");
        name = name.replaceAll("const", "");
        String[] myArr = name.split("=");
        if(Character.isAlphabetic(myArr[1].charAt(0)) || myArr[1].charAt(0) == '_'){
            myArr[1] = String.valueOf(SymbolTableHandler.getInstance().getSymbolValue().get(myArr[1]));
        }
        SymbolTableHandler.getInstance().getSymbolValue().put(myArr[0], myArr[1]);
    }
    
    public void ifLoop(String name){
        String[] myArr = null, myArr1 = null;
        myArr = name.split("else");
        boolean checker = false;
        int i = 0;
        while(i<myArr.length && checker == false){
            myArr1 = null;
            myArr1 = myArr[i].split("[\\r\\n]+");
            myArr1[0] = myArr1[0].replaceAll("\\s+", "");
            myArr1[0] = myArr1[0].replaceAll("\\(", "");
            myArr1[0] = myArr1[0].replaceAll("\\)", "");
            for(int j=0; j<myArr1.length; j++){
               myArr1[j] = myArr1[j].replaceAll("\\{", "");
               myArr1[j] = myArr1[j].replaceAll("\\}", "");
            }
            if(!myArr1[0].contains("if"))
                checker = true;
            else{  
                myArr1[0] = myArr1[0].replaceAll("else", "");
                myArr1[0] = myArr1[0].replaceAll("if", "");
                String temp = "", temp1 = "";
                boolean check = false;
                for(int j=0; j<myArr1[0].length(); j++){
                    if(Character.isAlphabetic(myArr1[0].charAt(j)) || myArr1[0].charAt(j) == '_' ||(Character.isDigit(myArr1[0].charAt(j)))&&!check){
                        temp1 = temp1.concat(String.valueOf(myArr1[0].charAt(j)));
                        check = false;
                    }
                    else{
                        check = true;
                        if(!temp1.equals(""))
                            temp1 = String.valueOf(SymbolTableHandler.getInstance().getSymbolValue().get(temp1));
                        temp = temp.concat(temp1);
                        temp = temp.concat(String.valueOf(myArr1[0].charAt(j)));
                        temp1 = "";
                    }
                    if(!temp1.equals("") && (j == (myArr1[0].length()-1))){
                        temp1 = String.valueOf(SymbolTableHandler.getInstance().getSymbolValue().get(temp1));
                        temp = temp.concat(temp1);
                    }
                }
                try {
                    ScriptEngineManager sem = new ScriptEngineManager();
                    ScriptEngine se = sem.getEngineByName("JavaScript");
                    checker = (boolean)se.eval(temp);
                } catch (ScriptException e) {
                    e.printStackTrace();
                }
            }
            if(checker){
                for(int j=1; j<myArr1.length; j++){
                    if(myArr1[j].contains("scan")){
                        scan(myArr1[j]);
                    }
                    else if(myArr1[j].contains("print")){
                        print(myArr1[j]);
                    }
                    else if(myArr1[j].contains("*")||myArr1[j].contains("/")||myArr1[j].contains("+")||myArr1[j].contains("-")){
                        math(myArr1[j]);
                    }
                }
            }
            i++;
        }
    }
    
    public void forLoop(String name){
        String[] myArr = null, myArr1 = null;
        myArr = name.split("[\\r\\n]+");
        myArr[0] = myArr[0].replaceAll("Int", "");
        myArr1 = myArr[0].split("in");
        myArr1[1] = myArr1[1].replaceAll("\\s+", "");
        myArr1[1] = myArr1[1].replaceAll("\\)", "");
        myArr1[1] = myArr1[1].replaceAll("\\{", "");
        myArr[0] = myArr1[1];
        myArr1 = null;
        myArr1 = myArr[0].split("\\.\\.");
        for(int j=0; j<myArr.length; j++){
           myArr[j] = myArr[j].replaceAll("\\{", "");
           myArr[j] = myArr[j].replaceAll("\\}", "");
        }
        String temp = "";
        int init = 0, fin = 0, k = 0;
        boolean first = true;
        for(int j=0; j<myArr1.length; j++){
            temp = "";
            k=0;
            while(k<myArr1[j].length()){
                temp = temp.concat(String.valueOf(myArr1[j].charAt(k)));
                k++;
            }
            if(Character.isAlphabetic(myArr1[j].charAt(0))|| myArr1[j].charAt(0) == '_'){
                temp = String.valueOf(SymbolTableHandler.getInstance().getSymbolValue().get(temp));
            }
            if(first){
                init = Integer.parseInt(temp);
                first = false;
            }
            else{
                fin = Integer.parseInt(temp);
            }
        }
        while(init<fin){
            for(int j=1; j<myArr.length; j++){
                if(myArr[j].contains("scan")){
                    scan(myArr[j]);
                }
                else if(myArr[j].contains("print")){
                    print(myArr[j]);
                }
                else if(myArr[j].contains("*")||myArr[j].contains("/")||myArr[j].contains("+")||myArr[j].contains("-")){
                    math(myArr[j]);
                }
            }
            init++;
        }
    }
    
    public void whileLoop(String name){
        boolean whilecheck = true;
        String[] myArr = null;
        while(whilecheck){
            myArr = name.split("[\\r\\n]+");
            myArr[0] = myArr[0].replaceAll("while", "");
            myArr[0] = myArr[0].replaceAll("\\s+", "");
            myArr[0] = myArr[0].replaceAll("\\(", "");
            myArr[0] = myArr[0].replaceAll("\\)", "");
            for(int j=0; j<myArr.length; j++){
               myArr[j] = myArr[j].replaceAll("\\{", "");
               myArr[j] = myArr[j].replaceAll("\\}", "");
            }
            String temp = "", temp1 = "";
            boolean check = false;
                for(int j=0; j<myArr[0].length(); j++){
                    if(Character.isAlphabetic(myArr[0].charAt(j))|| myArr[0].charAt(j) == '_' ||(Character.isDigit(myArr[0].charAt(j)))&&!check){
                        temp1 = temp1.concat(String.valueOf(myArr[0].charAt(j)));
                        check = false;
                    }
                    else{
                        check = true;
                        if(!temp1.equals(""))
                            temp1 = String.valueOf(SymbolTableHandler.getInstance().getSymbolValue().get(temp1));
                        temp = temp.concat(temp1);
                        temp = temp.concat(String.valueOf(myArr[0].charAt(j)));
                        temp1 = "";
                    }
                    if(!temp1.equals("") && (j == (myArr[0].length()-1))){
                        temp1 = String.valueOf(SymbolTableHandler.getInstance().getSymbolValue().get(temp1));
                        temp = temp.concat(temp1);
                    }
                }
            try {
                ScriptEngineManager sem = new ScriptEngineManager();
                ScriptEngine se = sem.getEngineByName("JavaScript");
                whilecheck = (boolean)se.eval(temp);
            } catch (ScriptException e) {
                e.printStackTrace();
            }
            if(whilecheck){
                for(int j=1; j<myArr.length; j++){
                    if(myArr[j].contains("scan")){
                        scan(myArr[j]);
                    }
                    else if(myArr[j].contains("print")){
                        print(myArr[j]);
                    }
                    else if(myArr[j].contains("*")||myArr[j].contains("/")||myArr[j].contains("+")||myArr[j].contains("-")){
                        math(myArr[j]);
                    }
                }
            }
        }
    }
    
    public void scan(String name){
        String[] myArr = name.split("\"");
        String input = "";
        System.out.print(myArr[1]);
        for(int j=0;j<myArr.length; j++){
            myArr[j] = myArr[j].replaceAll("[(+)]","");
            myArr[j] = myArr[j].replaceAll("\\s+","");
            myArr[j] = myArr[j].replaceAll(";","");
        }
        /*Scanner sc = new Scanner(System.in);
        input = sc.nextLine();*/
        /*while(true){
            print("zup");
        }*/
        while(input.equals("")){
            input = (String)JOptionPane.showInputDialog(
                        Driver.frame,
                        "Enter input:\n",
                        "Input Dialog",
                        JOptionPane.PLAIN_MESSAGE);
        }
        System.out.println(input);
//                if(SymbolTableHandler.isSymbolDefinedInCurrentScope(myArr[myArr.length-1])) {
        SymbolTableHandler.getInstance().getSymbolValue().put(myArr[myArr.length-1], input);
//               }
    }
    
    public void print(String name){
        String[] myArr = name.split("\"");
        for(int j=0;j<myArr.length; j++){
            if(myArr[j].contains("+")){
                myArr[j] = myArr[j].replaceAll("[(+)]","");
                myArr[j] = myArr[j].replaceAll("\\s+","");
                myArr[j] = myArr[j].replaceAll(";","");
                myArr[j] = String.valueOf(SymbolTableHandler.getInstance().getSymbolValue().get(myArr[j]));
            }
            else{
                myArr[j] = myArr[j].replaceAll("[()]","");
            }
            if(j>0)
                System.out.print(myArr[j]);
        }
        System.out.println();
    }
    
    public void math(String name){
        String[] myArr = name.split("\"");
        try{
            ScriptEngineManager mgr = new ScriptEngineManager();
            ScriptEngine engine = mgr.getEngineByName("JavaScript");
            myArr = name.split("=");
            for(int j=0; j<myArr.length; j++){
                myArr[j] = myArr[j].replaceAll("\\s+","");
                myArr[j] = myArr[j].replaceAll(";","");
            }
            String temp = "";
            String[] myArr1;
            temp = myArr[myArr.length-1].replaceAll("\\+"," ");
            temp = temp.replaceAll("\\-"," ");
            temp = temp.replaceAll("\\*"," ");
            temp = temp.replaceAll("\\/"," ");
            temp = temp.replaceAll("\\(","");
            temp = temp.replaceAll("\\)","");
            myArr1 = temp.split("\\s+");
            for(int j=0; j<myArr1.length; j++){
                if(myArr1[j].matches(".*[a-zA-Z]+.*")){
                    myArr1[j] = String.valueOf(SymbolTableHandler.getInstance().getSymbolValue().get(myArr1[j]));
                }
            }
            String equation = "";
            int count = 0, k = 0;
            boolean check = false;
            while(count < myArr[1].length()){
                if(!Character.isAlphabetic(myArr[1].charAt(count))&&!Character.isDigit(myArr[1].charAt(count))){
                    equation = equation.concat(String.valueOf(myArr[1].charAt(count)));
                    check = false;
                }
                else if(!check){
                    equation = equation.concat(myArr1[k]);
                    k++;
                    check = true;
                }
                count++;
            }
            equation = String.valueOf(engine.eval(equation));
            SymbolTableHandler.getInstance().getSymbolValue().put(myArr[0], equation);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    @Override
    public void exitBlock(KotlinParser.BlockContext ctx) {

    }

    @Override public void enterClassDeclaration(KotlinParser.ClassDeclarationContext ctx) {

    }

    @Override public void exitClassDeclaration(KotlinParser.ClassDeclarationContext ctx) {
    }

    @Override public void enterFunctionDeclaration(KotlinParser.FunctionDeclarationContext ctx) {
        
    }
    @Override public void exitFunctionDeclaration(KotlinParser.FunctionDeclarationContext ctx) {
    }

    /* inherited class
    * */
    @Override public void enterDelegationSpecifier(KotlinParser.DelegationSpecifierContext ctx) {
    }

    @Override public void exitDelegationSpecifier(KotlinParser.DelegationSpecifierContext ctx) { }

    /* Variable Declaration
    * */
    @Override public void enterVariableDeclaration(KotlinParser.VariableDeclarationContext ctx) {
    }
    @Override public void enterFunctionValueParameter(KotlinParser.FunctionValueParameterContext ctx) {
    }
    /*
    @Override public void enterBlock(KotlinParser.BlockContext ctx) {
        LocalScope l = new LocalScope(getCurrentScope());
        pushScope(l);
    }

    @Override public void exitBlock(KotlinParser.BlockContext ctx) {
        popScope();
    }
    */
    @Override public void enterLoopExpression(KotlinParser.LoopExpressionContext ctx) {
    }

    @Override public void exitLoopExpression(KotlinParser.LoopExpressionContext ctx) {
    }

    private Scope getCurrentScope(){return SymbolTableHandler.getCurrentScope();}

    private Type getPredefienedType(String name){ return  SymbolTableHandler.getDefinedType(name); }

    private Symbol getPredefinedSymbol(String name){ return SymbolTableHandler.getPredefinedSymbol(name);}


}
