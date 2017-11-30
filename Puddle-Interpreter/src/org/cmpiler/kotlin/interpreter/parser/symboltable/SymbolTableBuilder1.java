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
    
    private boolean end = false, functionCall = false, executeFunctionAgain = false;
    private HashMap <String,String> funVariables;
    private HashMap <String, String[]> arrayValues;
    
    @Override
    public void enterKotlinFile(KotlinParser.KotlinFileContext ctx) {
        String name, input, currentfunction = "", carryOnFormula = "", previousline = "";
        ArrayList<String> functions = new ArrayList<>();
        ArrayList<Integer> functionLine = new ArrayList<>();
        String[] myArr = null;
        boolean match = false, firstfunrun = false, mainRun = true, firstStoreMainReturn =true;
        int i = 0, returnline = 0, tempLine = 1;
        int closeBrace = 0;
        String returnVariable = "", returnValue = "";
        functionCall = false;
        funVariables = new HashMap<>();
        arrayValues = new HashMap<>();
        if(!end){
            for(int j=0; j<ctx.getChildCount(); j++){
                if(ctx.getChild(j).getText().contains("fun")){
                    String[] temp = ctx.getChild(j).getText().split("[\\r\\n]+");
                    String[] temp1 = temp[0].split("\\(");
                    temp1[0] = temp1[0].replaceAll("\\s+", "");
                    temp1[0] = temp1[0].replaceAll("fun","");
                    functions.add(temp1[0]);
                    functionLine.add(j);
                }
            }
            while(i<ctx.getChildCount()-1){
                name = ctx.getChild(i).getText();
                if(name.contains("funmain(args:StringArray)")){
                    myArr = name.split("[\\r\\n]+");
                    int j = 1;
                    int braces = 0;
                    while(j<myArr.length && mainRun == true){
                        String[] tempCon = null, returnvalue = null, values = null;
                        for(int k=0; k<functions.size(); k++){
                            if(myArr[j].contains(functions.get(k)+"(")){
                                currentfunction = functions.get(k);
                                if(executeFunctionAgain){
                                    myArr[j] = previousline;
                                }
                                /*if(!funVariables.isEmpty()&&!executeFunctionAgain){
                                    funVariables.clear();
                                }*/
                                if(myArr[j].contains("=")){
                                    returnvalue = myArr[j].split("=");
                                    returnVariable = returnvalue[0].replaceAll("\\s+", "");
                                    returnVariable = returnVariable.replaceAll("return", "");
                                }
                                if(myArr[j].contains("="))
                                    values = returnvalue[1].split("\\(");
                                else
                                    values = myArr[j].split("\\(");
                                if(!functionCall){
                                    values[0] = values[0].replaceAll(functions.get(k), "");
                                    values[0] = values[0].replaceAll("\\s+", "");
                                    carryOnFormula = carryOnFormula.concat(values[0]);
                                }
                                values[1] = values[1].replaceAll("\\)", "");
                                tempCon = null;
                                if(values[1].contains(",")){
                                    tempCon = values[1].split(",");
                                }
                                else if(values[1].contains("+")||values[1].contains("-")||values[1].contains("*")||values[1].contains("/")){
                                    tempCon = new String[1];
                                    tempCon[0] = mathEquation(values[1]);
                                }
                                else{
                                    tempCon = new String[1];
                                    tempCon[0] = values[1];
                                }
                                for(int l=0; l<tempCon.length; l++){
                                    tempCon[l] = tempCon[l].replaceAll("\\)", "");
                                    tempCon[l] = tempCon[l].replaceAll("\\s+", "");
                                    tempCon[l] = tempCon[l].replaceAll("\\;", "");
                                    if(Character.isAlphabetic(tempCon[l].charAt(0)) || tempCon[l].charAt(0) == '_'){
                                        if(executeFunctionAgain && funVariables.containsKey(tempCon[l])){
                                            tempCon[l] = funVariables.get(tempCon[l]);
                                         }
                                        else{
                                            tempCon[l] = String.valueOf(SymbolTableHandler.getInstance().getSymbolValue().get(tempCon[l]));
                                        }
                                    }
                                }
                                if(firstStoreMainReturn){
                                    tempLine = j+1;
                                    firstStoreMainReturn = false;
                                }
                                j = 1;
                                name = ctx.getChild(functionLine.get(k)).getText();
                                myArr = name.split("[\\r\\n]+");
                                String[] tempVarCon1 = myArr[0].split("\\(");
                                String[] tempVarCon2 = tempVarCon1[1].split("\\)");
                                tempVarCon2[0] = tempVarCon2[0].replaceAll("\\s+", "");
                                tempVarCon2[0] = tempVarCon2[0].replaceAll("\\:", "");
                                tempVarCon2[0] = tempVarCon2[0].replaceAll("Int", "");
                                tempVarCon2[0] = tempVarCon2[0].replaceAll("String", "");
                                tempVarCon2[0] = tempVarCon2[0].replaceAll("Float", "");
                                tempVarCon2[0] = tempVarCon2[0].replaceAll("Double", "");
                                String[] tempVarCon3 = null;
                                if(tempVarCon2[0].contains(",")){
                                    tempVarCon3 = tempVarCon2[0].split(",");
                                }
                                else{
                                    tempVarCon3 = new String[1];
                                    tempVarCon3[0] = tempVarCon2[0];
                                }
                                for(int l=0; l<tempCon.length; l++){
                                    funVariables.put(tempVarCon3[l], tempCon[l]);
                                }
                                functionCall = true;
                                firstfunrun = true; 
                                executeFunctionAgain = false;
                            }
                        }
                        if(j==myArr.length-1 && functionCall == true){
                            functionCall = false;
                            j = tempLine;
                            name = ctx.getChild(i).getText();
                            myArr = name.split("[\\r\\n]+");
                            firstfunrun = true;
                            returnValue = mathEquation(carryOnFormula+""+returnValue);
                            SymbolTableHandler.getInstance().getSymbolValue().put(returnVariable, returnValue);
                            carryOnFormula = "";
                            firstStoreMainReturn = true;
                        }
                        else if(j==myArr.length-1 && functionCall == false){
                            mainRun = false;
                        }
                        if(!firstfunrun){
                            if(myArr[j].contains("if ")||myArr[j].contains("if(")){
                                braces = 1;
                                boolean firstrun = true;
                                String ifblock = myArr[j]+"\n";
                                j++;
                                while((braces>0||myArr[j].contains("elseif")||myArr[j].contains("else"))){
                                    if(firstrun){
                                        firstrun = false;
                                        braces--;
                                    }
                                    if(myArr[j].contains("}"))
                                        braces--;
                                    if(myArr[j].contains("{"))
                                        braces++;
                                    ifblock = ifblock.concat(myArr[j]+"\n");
                                    j++;
                                }
                                j--;
                                String returnStatement = ifLoop(ifblock);
                                if(returnStatement.contains("return")){
                                    String tempString = returnStatement.replaceAll("return", "");
                                    tempString = tempString .replaceAll("\\s+", "");
                                    tempString  = tempString .replaceAll("\\;", "");
                                    if(tempString.contains(""+currentfunction+"(")){
                                        executeFunctionAgain = true;
                                    }
                                    else if(Character.isAlphabetic(tempString .charAt(0)) || tempString .charAt(0) == '_'){
                                        returnValue = funVariables.get(tempString );
                                    }
                                    else if(tempString .contains("+")||tempString .contains("-")||tempString .contains("*")||tempString .contains("/")){
                                        returnValue = mathEquation(tempString );
                                    }
                                    else {
                                        returnValue = tempString ;
                                    }
                                    if(!executeFunctionAgain){
                                        j = myArr.length-2;
                                        
                                    }
                                }
                                ifblock = "";
                            }
                            else if(myArr[j].contains("while ")||myArr[j].contains("while(")){
                                braces = 1;
                                String whileblock = myArr[j]+"\n";
                                j++;
                                while((braces>0)){
                                    if(myArr[j].contains("}"))
                                        braces--;
                                    if(myArr[j].contains("{"))
                                        braces++;
                                    whileblock = whileblock.concat(myArr[j]+"\n");
                                    j++;
                                }
                                j--;
                                whileLoop(whileblock);
                                whileblock = "";
                            }
                            else if(myArr[j].contains("for ")||myArr[j].contains("for(")){
                                braces = 1;
                                String forblock = myArr[j]+"\n";
                                j++;
                                while((braces>0)){
                                    if(myArr[j].contains("}"))
                                        braces--;
                                    if(myArr[j].contains("{"))
                                        braces++;
                                    forblock = forblock.concat(myArr[j]+"\n");
                                    j++;
                                }
                                j--;
                                forLoop(forblock);
                                forblock = "";
                            }
                            else if(myArr[j].contains("scan ")||myArr[j].contains("scan(")){
                                scan(myArr[j]);
                            }
                            else if(myArr[j].contains("println ")||myArr[j].contains("println(")){
                                println(myArr[j]);
                            }
                            else if(myArr[j].contains("print ")||myArr[j].contains("print(")){
                                print(myArr[j]);
                            }
                            else if(myArr[j].contains("return")){
                                myArr[j] = myArr[j].replaceAll("return", "");
                                myArr[j] = myArr[j].replaceAll("\\s+", "");
                                myArr[j] = myArr[j].replaceAll("\\;", "");
                                if(myArr[j].contains(currentfunction+"(")){
                                    executeFunctionAgain = true;
                                }
                                else if(Character.isAlphabetic(myArr[j].charAt(0)) || myArr[j].charAt(0) == '_'){
                                    returnValue = funVariables.get(myArr[j]);
                                }
                                else if(myArr[j].contains("+")||myArr[j].contains("-")||myArr[j].contains("*")||myArr[j].contains("/")){
                                    returnValue = mathEquation(myArr[j]);
                                }
                                else{
                                    returnValue = myArr[j];
                                }
                                if(!executeFunctionAgain){
                                    j=myArr.length-1;
                                    functionCall = false;
                                }
                            }
                            else if(myArr[j].contains("=")){
                                assign(myArr[j]);
                            }
                            else if(myArr[j].contains("*")||myArr[j].contains("/")||myArr[j].contains("+")||myArr[j].contains("-")){
                                math(myArr[j]);
                            }
                        }
                        if(executeFunctionAgain){
                            previousline = myArr[j];
                            String temps = myArr[j].replaceAll("return", "");
                            String[] tempArr = temps.split("\\(");
                            tempArr[0] = tempArr[0].replaceAll(currentfunction, "");
                            tempArr[0] = tempArr[0].replaceAll("\\s+", "");
                            carryOnFormula = carryOnFormula.concat(tempArr[0]);
                            j=-1;
                        }
                        if(!firstfunrun){
                            j++;
                        }
                        else{
                            firstfunrun = false;
                        }
                    }
                }
                
                i++;
            }
            end = true;
        }
    }

    @Override
    public void exitKotlinFile(KotlinParser.KotlinFileContext ctx) {
    }

    @Override
    public void enterBlock(KotlinParser.BlockContext ctx) {
    }
    
    public void assign(String name){
        String[] myArr1 = null;
        name = name.replaceAll("\\s+", "");
        name = name.replaceAll("val", "");
        name = name.replaceAll(":", "");
        name = name.replaceAll("var", "");
        name = name.replaceAll("Int", "");
        name = name.replaceAll("String", "");
        name = name.replaceAll("Float", "");
        name = name.replaceAll("Boolean", "");
        name = name.replaceAll("IntArray", "");
        name = name.replaceAll("CharArray", "");
        name = name.replaceAll("const", "");
        if(name.contains("=")){
            String[] myArr = name.split("=");
            boolean found = false;
            if(myArr[1].contains("arrayOfNulls")){
                myArr[1] = myArr[1].replaceAll("arrayOfNulls","");
                myArr[1] = myArr[1].replaceAll("\\(","");
                myArr[1] = myArr[1].replaceAll("\\)","");
                if(Character.isAlphabetic(myArr[1].charAt(0)) || myArr[1].charAt(0) == '_'){
                    myArr[1] = String.valueOf(SymbolTableHandler.getInstance().getSymbolValue().get(myArr[1]));
                }
                String[] container = new String[Integer.parseInt(myArr[1])];
                arrayValues.put(myArr[0], container);
            }
            else if(myArr[1].contains("[")||myArr[0].contains("[")){
                String[] tempArray = null;
                String index = "", index1 = "";
                if(myArr[0].contains("[")){
                    myArr1 = myArr[0].split("\\[");
                    myArr1[1] = myArr1[1].replaceAll("\\]", "");
                    if(myArr1[1].contains("+")||myArr1[1].contains("-")||myArr1[1].contains("*")||myArr1[1].contains("/")){
                        index = mathEquation(myArr1[1]);
                    }
                    else if(Character.isAlphabetic(myArr1[1].charAt(0))||myArr1[1].charAt(0)=='_'){
                        index = String.valueOf(SymbolTableHandler.getInstance().getSymbolValue().get(myArr1[1]));
                    }
                    else{
                        index = myArr1[1];
                    }
                    tempArray = arrayValues.get(myArr1[0]);
                }
                if(myArr[1].contains("[")){
                    myArr1 = myArr[1].split("\\[");
                    myArr1[1] = myArr1[1].replaceAll("\\]", "");
                    myArr1[1] = myArr1[1].replaceAll("\\;", "");
                    if(myArr1[1].contains("+")||myArr1[1].contains("-")||myArr1[1].contains("*")||myArr1[1].contains("/")){
                        index1 = mathEquation(myArr1[1]);
                    }
                    else if(Character.isAlphabetic(myArr1[1].charAt(0))||myArr1[1].charAt(0)=='_'){
                        index1 = String.valueOf(SymbolTableHandler.getInstance().getSymbolValue().get(myArr1[1]));
                    }
                    else{
                        index1 = myArr1[1];
                    }
                    tempArray = arrayValues.get(myArr1[0]);
                    myArr[1] = tempArray[Integer.parseInt(index1)];
                }
                else if(Character.isAlphabetic(myArr[1].charAt(0))||myArr[1].charAt(0)=='_'){
                    myArr[1] = String.valueOf(SymbolTableHandler.getInstance().getSymbolValue().get(myArr[1]));
                }
                if(myArr[0].contains("[")){
                    tempArray[Integer.parseInt(index)] = myArr[1];
                    arrayValues.put(myArr1[0], tempArray);
                }
                else{
                    SymbolTableHandler.getInstance().getSymbolValue().put(myArr[0],myArr[1]);
                }
            }
            else if(myArr[1].contains("+")||myArr[1].contains("-")||myArr[1].contains("*")||myArr[1].contains("/")){
                String answer = mathEquation(myArr[1]);
                SymbolTableHandler.getInstance().getSymbolValue().put(myArr[0], answer);
            }
            else{
                if(Character.isAlphabetic(myArr[1].charAt(0)) || myArr[1].charAt(0) == '_'){
                    if(functionCall && funVariables.containsKey(myArr[1])){
                        myArr[1] = String.valueOf(funVariables.get(myArr[1]));
                        found = true;
                    }
                    if(!found){
                        myArr[1] = String.valueOf(SymbolTableHandler.getInstance().getSymbolValue().get(myArr[1]));
                    }
                }
                if(found){
                    funVariables.put(myArr[0], myArr[1]);
                }
                else{
                    SymbolTableHandler.getInstance().getSymbolValue().put(myArr[0], myArr[1]);
                }
            }
        }
        else{
            SymbolTableHandler.getInstance().getSymbolValue().put(name, null);
        }
    }
    
    public String ifLoop(String name){
        String returnStatement = "";
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
            myArr1[0] = myArr1[0].replaceAll("\\{", "");
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
                        if(!temp1.equals("")){
                            if(functionCall && funVariables.containsKey(temp1))
                                temp1 = funVariables.get(temp1);
                            else
                                temp1 = String.valueOf(SymbolTableHandler.getInstance().getSymbolValue().get(temp1));
                        }
                        temp = temp.concat(temp1);
                        temp = temp.concat(String.valueOf(myArr1[0].charAt(j)));
                        temp1 = "";
                    }
                    if(!temp1.equals("") && (j == (myArr1[0].length()-1))){
                        if(functionCall && funVariables.containsKey(temp1))
                            temp1 = funVariables.get(temp1);
                        else
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
            int braces = 0;
            if(checker){
                for(int j=1; j<myArr1.length; j++){
                    if(myArr1[j].contains("scan")){
                        scan(myArr1[j]);
                    }
                    else if(myArr1[j].contains("println")){
                        println(myArr1[j]);
                    }
                    else if(myArr1[j].contains("print")){
                        print(myArr1[j]);
                    }
                    else if(myArr1[j].contains("return")){
                        returnStatement = myArr1[j];
                    }
                    else if(myArr1[j].contains("if ")||myArr1[j].contains("if(")){
                        braces = 1;
                        String ifblock = myArr1[j]+"\n";
                        j++;
                        while((braces>0||myArr1[j].contains("elseif")||myArr1[j].contains("else{"))){
                            if(myArr1[j].contains("}"))
                                braces--;
                            if(myArr1[j].contains("{"))
                                braces++;
                            ifblock = ifblock.concat(myArr1[j]+"\n");
                            j++;
                        }
                        j--;
                        ifLoop(ifblock);
                        ifblock = "";
                    }
                    else if(myArr1[j].contains("while ")||myArr1[j].contains("while(")){
                        braces = 1;
                        String whileblock = myArr1[j]+"\n";
                        j++;
                        while((braces>0)){
                            if(myArr1[j].contains("}"))
                                braces--;
                            if(myArr1[j].contains("{"))
                                braces++;
                            whileblock = whileblock.concat(myArr1[j]+"\n");
                            j++;
                        }
                        j--;
                        whileLoop(whileblock);
                        whileblock = "";
                    }
                    else if(myArr1[j].contains("for ")||myArr1[j].contains("for(")){
                        braces = 1;
                        String forblock = myArr1[j]+"\n";
                        j++;
                        while((braces>0)){
                            if(myArr1[j].contains("}"))
                                braces--;
                            if(myArr1[j].contains("{"))
                                braces++;
                            forblock = forblock.concat(myArr1[j]+"\n");
                            j++;
                        }
                        j--;
                        forLoop(forblock);
                        forblock = "";
                    }
                    else if(myArr1[j].contains("=")){
                        assign(myArr1[j]);
                    }
                    else if(myArr1[j].contains("*")||myArr1[j].contains("/")||myArr1[j].contains("+")||myArr1[j].contains("-")){
                        math(myArr1[j]);
                    }
                }
            }
            i++;
        }
        return returnStatement;
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
                if(functionCall && funVariables.containsKey(temp))
                    temp = funVariables.get(temp);
                else
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
        int braces = 0;
        while(init<fin){
            for(int j=1; j<myArr.length; j++){
                if(myArr[j].contains("scan")){
                    scan(myArr[j]);
                }
                else if(myArr[j].contains("println")){
                    println(myArr[j]);
                }
                else if(myArr[j].contains("print")){
                    print(myArr[j]);
                }
                else if(myArr[j].contains("if ")||myArr[j].contains("if(")){
                    braces = 1;
                    String ifblock = myArr[j]+"\n";
                    j++;
                    while((braces>0||myArr[j].contains("elseif")||myArr[j].contains("else{"))){
                        if(myArr[j].contains("}"))
                            braces--;
                        if(myArr[j].contains("{"))
                            braces++;
                        ifblock = ifblock.concat(myArr[j]+"\n");
                        j++;
                    }
                    j--;
                    ifLoop(ifblock);
                    ifblock = "";
                }
                else if(myArr[j].contains("while ")||myArr[j].contains("while(")){
                    braces = 1;
                    String whileblock = myArr[j]+"\n";
                    j++;
                    while((braces>0)){
                        if(myArr[j].contains("}"))
                            braces--;
                        if(myArr[j].contains("{"))
                            braces++;
                        whileblock = whileblock.concat(myArr[j]+"\n");
                        j++;
                    }
                    j--;
                    whileLoop(whileblock);
                    whileblock = "";
                }
                else if(myArr[j].contains("for ")||myArr[j].contains("for(")){
                    braces = 1;
                    String forblock = myArr[j]+"\n";
                    j++;
                    while((braces>0)){
                        if(myArr[j].contains("}"))
                            braces--;
                        if(myArr[j].contains("{"))
                            braces++;
                        forblock = forblock.concat(myArr[j]+"\n");
                        j++;
                    }
                    j--;
                    forLoop(forblock);
                    forblock = "";
                }
                else if(myArr[j].contains("*")||myArr[j].contains("/")||myArr[j].contains("+")||myArr[j].contains("-")){
                    math(myArr[j]);
                }
                else if(myArr[j].contains("=")){
                        assign(myArr[j]);
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
            myArr[0] = myArr[0].replaceAll("\\{", "");
            String temp = "", temp1 = "";
            boolean check = false;
                for(int j=0; j<myArr[0].length(); j++){
                    if(Character.isAlphabetic(myArr[0].charAt(j))|| myArr[0].charAt(j) == '_' ||(Character.isDigit(myArr[0].charAt(j)))&&!check){
                        temp1 = temp1.concat(String.valueOf(myArr[0].charAt(j)));
                        check = false;
                    }
                    else{
                        check = true;
                        if(!temp1.equals("")){
                            if(functionCall && funVariables.containsKey(temp1))
                                temp1 = funVariables.get(temp1);
                            else
                                temp1 = String.valueOf(SymbolTableHandler.getInstance().getSymbolValue().get(temp1));
                        }
                        temp = temp.concat(temp1);
                        temp = temp.concat(String.valueOf(myArr[0].charAt(j)));
                        temp1 = "";
                    }
                    if(!temp1.equals("") && (j == (myArr[0].length()-1))){
                        if(functionCall && funVariables.containsKey(temp1))
                            temp1 = funVariables.get(temp1);
                        else
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
            int braces = 0;
            if(whilecheck){
                for(int j=1; j<myArr.length; j++){
                    if(myArr[j].contains("scan")){
                        scan(myArr[j]);
                    }
                    else if(myArr[j].contains("println")){
                        println(myArr[j]);
                    }
                    else if(myArr[j].contains("print")){
                        print(myArr[j]);
                    }
                    else if(myArr[j].contains("if ")||myArr[j].contains("if(")){
                        braces = 1;
                        String ifblock = myArr[j]+"\n";
                        j++;
                        while((braces>0||myArr[j].contains("elseif")||myArr[j].contains("else{"))){
                            if(myArr[j].contains("}"))
                                braces--;
                            if(myArr[j].contains("{"))
                                braces++;
                            ifblock = ifblock.concat(myArr[j]+"\n");
                            j++;
                        }
                        j--;
                        ifLoop(ifblock);
                        ifblock = "";
                    }
                    else if(myArr[j].contains("while ")||myArr[j].contains("while(")){
                        braces = 1;
                        String whileblock = myArr[j]+"\n";
                        j++;
                        while((braces>0)){
                            if(myArr[j].contains("}"))
                                braces--;
                            if(myArr[j].contains("{"))
                                braces++;
                            whileblock = whileblock.concat(myArr[j]+"\n");
                            j++;
                        }
                        j--;
                        whileLoop(whileblock);
                        whileblock = "";
                    }
                    else if(myArr[j].contains("for ")||myArr[j].contains("for(")){
                        braces = 1;
                        String forblock = myArr[j]+"\n";
                        j++;
                        while((braces>0)){
                            if(myArr[j].contains("}"))
                                braces--;
                            if(myArr[j].contains("{"))
                                braces++;
                            forblock = forblock.concat(myArr[j]+"\n");
                            j++;
                        }
                        j--;
                        forLoop(forblock);
                        forblock = "";
                    }
                    else if(myArr[j].contains("=")){
                        assign(myArr[j]);
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
        int index = 0;
        System.out.print(myArr[1]);
        if(name.contains("[")&&name.contains("]")){
            String[] temp1 = myArr[2].split("\\[");
            String[] temp2 = temp1[1].split("\\]");
            if(Character.isAlphabetic(temp2[0].charAt(0))||temp2[0].charAt(0)=='_')
                temp2[0] = String.valueOf(SymbolTableHandler.getInstance().getSymbolValue().get(temp2[0]));
            index = Integer.parseInt(temp2[0]);
            while(input.equals("")){
                input = (String)JOptionPane.showInputDialog(
                            Driver.frame,
                            myArr[1],
                            "Input Dialog",
                            JOptionPane.PLAIN_MESSAGE);
            }
            System.out.println(input);
            temp1[0] = temp1[0].replaceAll("\\+","");
            String[] tempArray = arrayValues.get(temp1[0]);
            tempArray[index] = input;
            arrayValues.put(temp1[0], tempArray);
        }
        else{
            while(input.equals("")){
                input = (String)JOptionPane.showInputDialog(
                            Driver.frame,
                            myArr[1],
                            "Input Dialog",
                            JOptionPane.PLAIN_MESSAGE);
            }
            System.out.println(input);
            for(int j=0;j<myArr.length; j++){
                myArr[j] = myArr[j].replaceAll("[(+)]","");
                myArr[j] = myArr[j].replaceAll("\\s+","");
                myArr[j] = myArr[j].replaceAll(";","");
                myArr[j] = myArr[j].replaceAll("\\{","");
                myArr[j] = myArr[j].replaceAll("\\}","");
            }
            if(functionCall && funVariables.containsKey(myArr[myArr.length-1]))
                funVariables.put(myArr[myArr.length-1], input);
            else
                SymbolTableHandler.getInstance().getSymbolValue().put(myArr[myArr.length-1], input);
        }
    }
    
    public void println(String name){
        int index = 0;
        String[] myArr = name.split("\"");
        for(int j=0;j<myArr.length; j++){
            if(myArr[j].contains("[")){
                myArr[j] = myArr[j].replaceAll("\\+","");
                String[] temp1 = myArr[j].split("\\[");
                temp1[1] = temp1[1].replaceAll("\\]", "");
                temp1[1] = temp1[1].replaceAll("\\)", "");
                temp1[1] = temp1[1].replaceAll("\\;", "");
                if(Character.isAlphabetic(temp1[1].charAt(0))||temp1[1].charAt(0)=='_')
                    temp1[1] = String.valueOf(SymbolTableHandler.getInstance().getSymbolValue().get(temp1[1]));
                index = Integer.parseInt(temp1[1]);
                String[] tempArray = arrayValues.get(temp1[0]);
                myArr[j] = tempArray[index];
            }
            else if(myArr[j].contains("+")){
                myArr[j] = myArr[j].replaceAll("[(+)]","");
                myArr[j] = myArr[j].replaceAll("\\s+","");
                myArr[j] = myArr[j].replaceAll(";","");
                myArr[j] = myArr[j].replaceAll("\\{","");
                myArr[j] = myArr[j].replaceAll("\\}","");
                myArr[j] = myArr[j].replaceAll("\n","");
                if(functionCall && funVariables.containsKey(myArr[j])){
                    myArr[j] = funVariables.get(myArr[j]);
                }
                else{
                    myArr[j] = String.valueOf(SymbolTableHandler.getInstance().getSymbolValue().get(myArr[j]));
                }
            }
            else{
                myArr[j] = myArr[j].replaceAll("[()]","");
            }
            if(j>0)
                System.out.print(myArr[j]);
        }
        System.out.println("");
    }
    
    public void print(String name){
        int index = 0;
        String[] myArr = name.split("\"");
        for(int j=0;j<myArr.length; j++){
            if(myArr[j].contains("[")){
                myArr[j] = myArr[j].replaceAll("\\+","");
                String[] temp1 = myArr[j].split("\\[");
                temp1[1] = temp1[1].replaceAll("\\]", "");
                temp1[1] = temp1[1].replaceAll("\\)", "");
                temp1[1] = temp1[1].replaceAll("\\;", "");
                if(Character.isAlphabetic(temp1[1].charAt(0))||temp1[1].charAt(0)=='_')
                    temp1[1] = String.valueOf(SymbolTableHandler.getInstance().getSymbolValue().get(temp1[1]));
                index = Integer.parseInt(temp1[1]);
                String[] tempArray = arrayValues.get(temp1[0]);
                myArr[j] = tempArray[index];
            }
            else if(myArr[j].contains("+")){
                if(myArr[j].contains("(")){
                    String[] myArr1 = myArr[j].split("\\(");
                    myArr1[1] = myArr1[1].replaceAll("\\)", "");
                    myArr1[1] = myArr1[1].replaceAll("\\;", "");
                    String result = mathEquation(myArr1[1]);
                    myArr[j] = result;
                }
                else{
                    //String answer = mathEquation(myArr[1]);
                    //SymbolTableHandler.getInstance().getSymbolValue().put(myArr[0], answer);
                    myArr[j] = myArr[j].replaceAll("[(+)]","");
                    myArr[j] = myArr[j].replaceAll("\\s+","");
                    myArr[j] = myArr[j].replaceAll(";","");
                    myArr[j] = myArr[j].replaceAll("\\{","");
                    myArr[j] = myArr[j].replaceAll("\\}","");
                    myArr[j] = myArr[j].replaceAll("\n","");
                    if(functionCall && funVariables.containsKey(myArr[j])){
                        myArr[j] = funVariables.get(myArr[j]);
                    }
                    else{
                        myArr[j] = String.valueOf(SymbolTableHandler.getInstance().getSymbolValue().get(myArr[j]));
                    }
                }
            }
            else{
                myArr[j] = myArr[j].replaceAll("[()]","");
            }
            if(j>0)
                System.out.print(myArr[j]);
        }
    }
    
    public void math(String name){
        System.out.println("Equation: "+name);
        String[] myArr = name.split("\"");
        try{
            ScriptEngineManager mgr = new ScriptEngineManager();
            ScriptEngine engine = mgr.getEngineByName("JavaScript");
            myArr = name.split("=");
            for(int j=0; j<myArr.length; j++){
                myArr[j] = myArr[j].replaceAll("\\s+","");
                myArr[j] = myArr[j].replaceAll(";","");
                myArr[j] = myArr[j].replaceAll("\\{","");
                myArr[j] = myArr[j].replaceAll("\\}","");
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
                    if(functionCall && funVariables.containsKey(myArr1[j]))
                       myArr1[j] = funVariables.get(myArr1[j]); 
                    else
                        myArr1[j] = String.valueOf(SymbolTableHandler.getInstance().getSymbolValue().get(myArr1[j]));
                    myArr1[j] = myArr1[j].replaceAll("f", "");
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
            if(functionCall && funVariables.containsKey(myArr[0]))
                funVariables.put(myArr[0], equation);
            else
                SymbolTableHandler.getInstance().getSymbolValue().put(myArr[0], equation);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public String mathEquation(String equation){
        String answer = "";
        try{
            ScriptEngineManager mgr = new ScriptEngineManager();
            ScriptEngine engine = mgr.getEngineByName("JavaScript");
            String temp = "";
            String[] myArr1;
            temp = equation.replaceAll("\\+"," ");
            temp = temp.replaceAll("\\-"," ");
            temp = temp.replaceAll("\\*"," ");
            temp = temp.replaceAll("\\/"," ");
            temp = temp.replaceAll("\\(","");
            temp = temp.replaceAll("\\)","");
            myArr1 = temp.split("\\s+");
            for(int j=0; j<myArr1.length; j++){
                if(myArr1[j].matches(".*[a-zA-Z]+.*")){
                    if(functionCall && funVariables.containsKey(myArr1[j])){
                       myArr1[j] = funVariables.get(myArr1[j]); 
                    }
                    else
                        myArr1[j] = String.valueOf(SymbolTableHandler.getInstance().getSymbolValue().get(myArr1[j]));
                    myArr1[j] = myArr1[j].replaceAll("f", "");
                }
            }
            String finalequation = "";
            int count = 0, k = 0;
            boolean check = false;
            while(count < equation.length()){
                if(!Character.isAlphabetic(equation.charAt(count))&&!Character.isDigit(equation.charAt(count))){
                    finalequation = finalequation.concat(String.valueOf(equation.charAt(count)));
                    check = false;
                }
                else if(!check){
                    finalequation = finalequation.concat(myArr1[k]);
                    k++;
                    check = true;
                }
                count++;
            }
            equation = String.valueOf(engine.eval(finalequation));
            count = 0;
            boolean stop = false;
            answer = "";
            while(count<equation.length()){
                if(equation.charAt(count) == '.'){
                    stop = true;
                }
                if(!stop){
                    answer = answer.concat(String.valueOf(equation.charAt(count)));
                }
                count++;
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return answer;
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
