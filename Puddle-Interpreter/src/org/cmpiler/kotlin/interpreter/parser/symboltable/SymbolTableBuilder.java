package org.cmpiler.kotlin.interpreter.parser.symboltable;

import java.util.*;
import org.antlr.symtab.*;
import org.cmpiler.kotlin.antlr.KotlinParser;
import org.cmpiler.kotlin.antlr.KotlinParserBaseListener;
import org.cmpiler.kotlin.interpreter.console.Console;
import org.cmpiler.kotlin.interpreter.parser.CodeValidator;
import org.cmpiler.kotlin.interpreter.parser.ErrorDictionary;

public class SymbolTableBuilder extends KotlinParserBaseListener {
    @Override
    public void enterKotlinFile(KotlinParser.KotlinFileContext ctx) {
        LocalScope l = new LocalScope(null);
        ctx.scope = l;
        pushScope(l);
    }

    @Override
    public void exitKotlinFile(KotlinParser.KotlinFileContext ctx) {
        popScope();

    }

    @Override
    public void enterBlock(KotlinParser.BlockContext ctx) {
        LocalScope l = new LocalScope(getCurrentScope());
        pushScope(l);
    }

    @Override
    public void exitBlock(KotlinParser.BlockContext ctx) {
        popScope();

    }

    @Override public void enterClassDeclaration(KotlinParser.ClassDeclarationContext ctx) {
        String name = ctx.getChild(1).getText();
        if(SymbolTableHandler.isSymbolDefinedInCurrentScope(name)) {
            CodeValidator.reportCustomError(ErrorDictionary.MULTIPLE_CLASS, "",name,ctx.start.getLine());
            LocalScope l = new LocalScope(getCurrentScope());
            pushScope(l);
        } else {
            ClassSymbol c = new ClassSymbol(name);
            c.setEnclosingScope(getCurrentScope());
            c.setDefNode(ctx);
            ctx.scope = c;
            getCurrentScope().define(c);
            Console.log(Console.DEV_CONSOLE, "Class defined ["+c.getName()+"]");
            pushScope(c);
        }
    }

    @Override public void exitClassDeclaration(KotlinParser.ClassDeclarationContext ctx) {
        popScope();
    }

    @Override public void enterFunctionDeclaration(KotlinParser.FunctionDeclarationContext ctx) {
        String name = ctx.getChild(1).getText();
        if(SymbolTableHandler.isSymbolDefinedInCurrentScope(name) && !(ctx.parent instanceof KotlinParser.ClassMemberDeclarationContext)) {
            CodeValidator.reportCustomError(ErrorDictionary.MULTIPLE_FUNCTION, "",name,ctx.start.getLine());
            LocalScope l = new LocalScope(getCurrentScope());
            pushScope(l);
        } else {
            FunctionSymbol f = null;
            if(ctx.parent instanceof KotlinParser.ClassMemberDeclarationContext){
                // found first method
                if(!SymbolTableHandler.isSymbolDefinedInCurrentScope(name)){
                    MethodSymbol m = new MethodSymbol(name);
                    ClassSymbol c = (ClassSymbol) getCurrentScope();
                    c.setSlotNumber(m);
                    m.setEnclosingScope(getCurrentScope());
                    m.setDefNode(ctx);
                    getCurrentScope().define(m);
                    // check return type
                    if(ctx.getChildCount() > 4)
                        m.setType(getPredefienedType(ctx.getChild(4).getText()));
                    else
                        m.setType(getPredefienedType("void"));
                    f = m;
                } else {
                    // found overriden method
                    //MethodSymbol m = (MethodSymbol) SymbolTableHandler.getSymbolDefinedInCurrentScope(name);
                    MethodSymbol m = new MethodSymbol(name);
                    ClassSymbol c = (ClassSymbol) getCurrentScope();
                    c.setSlotNumber(m);
                    m.setEnclosingScope(getCurrentScope());
                    m.setDefNode(ctx);
                    // check return type
                    if(ctx.getChildCount() > 4)
                        m.setType(getPredefienedType(ctx.getChild(4).getText()));
                    else
                        m.setType(getPredefienedType("void"));
                    f = m;
                }
                Console.log(Console.DEV_CONSOLE, "Method defined ["+f.getName()+"]["+f.getType().getName()+"]");
            }
            else {
                f = new FunctionSymbol(name);
                f.setEnclosingScope(getCurrentScope());
                f.setDefNode(ctx);
                getCurrentScope().define(f);
                // check return type
                if(ctx.getChildCount() > 4)
                    f.setType(getPredefienedType(ctx.getChild(4).getText()));
                else
                    f.setType(getPredefienedType("void"));
                Console.log(Console.DEV_CONSOLE, "Function defined ["+f.getName()+"]["+f.getType().getName()+"]");
            }
            ctx.scope = f;
            pushScope(f);
            if(name.equalsIgnoreCase("main")){
                if(SymbolTableHandler.getInstance().getMainScope() == null)
                    SymbolTableHandler.getInstance().setMainScope(f);
                else
                    CodeValidator.reportCustomError(ErrorDictionary.MULTIPLE_MAIN, "",ctx.start.getLine());
            }
        }
    }
    @Override public void exitFunctionDeclaration(KotlinParser.FunctionDeclarationContext ctx) {
        popScope();
    }

    /* inherited class
    * */
    @Override public void enterDelegationSpecifier(KotlinParser.DelegationSpecifierContext ctx) {
        Scope s = getCurrentScope();
        if(s instanceof ClassSymbol){
            ((ClassSymbol)s).setSuperClass(ctx.getText());
            Console.log(Console.DEV_CONSOLE, "Super class defined ["+ctx.getText()+"]");
        }
    }

    @Override public void exitDelegationSpecifier(KotlinParser.DelegationSpecifierContext ctx) { }

    /* Variable Declaration
    * */
    @Override public void enterVariableDeclaration(KotlinParser.VariableDeclarationContext ctx) {
        String name = ctx.getChild(0).getText();
        if(SymbolTableHandler.isSymbolDefinedInCurrentScope(name)) {
            CodeValidator.reportCustomError(ErrorDictionary.MULTIPLE_VARIABLE, "",name,ctx.start.getLine());
        } else {
            //SymbolTableHandler.getInstance().getSymbolVisibility().get(ctx.symbol);
            // data type and name
            if(ctx.parent.parent instanceof KotlinParser.ClassMemberDeclarationContext) {
                FieldSymbol f = new FieldSymbol(name);
                ClassSymbol c = (ClassSymbol) getCurrentScope();
                c.setSlotNumber(f);
                f.setDefNode(ctx);
                if (ctx.getChildCount() < 3)
                    CodeValidator.reportCustomError(ErrorDictionary.UNDECLARED_TYPE, "", name, ctx.start.getLine());
                else {
                    Type t = getPredefienedType(ctx.getChild(2).getText());
                    if (t != null) {
                        f.setType(t);
                        ctx.symbol = f;
                        Console.log(Console.DEV_CONSOLE, "Symbol added [" + name + "][" + t.getName() + "]");
                    } else {
                        CodeValidator.reportCustomError(ErrorDictionary.UNDECLARED_TYPE, "", name, ctx.start.getLine());
                    }
                }
                // const or not
                if(ctx.parent.getChild(0).getText().equalsIgnoreCase("val"))
                    SymbolTableHandler.getInstance().getSymbolConstant().add(f);
                getCurrentScope().define(f);
            } else {
                VariableSymbol v = new VariableSymbol(name);
                v.setDefNode(ctx);
                if (ctx.getChildCount() < 3)
                    CodeValidator.reportCustomError(ErrorDictionary.UNDECLARED_TYPE, "", name, ctx.start.getLine());
                else {
                    Type t = getPredefienedType(ctx.getChild(2).getText());
                    if (t != null) {
                        v.setType(t);
                        ctx.symbol = v;
                        Console.log(Console.DEV_CONSOLE, "Symbol added [" + name + "][" + t.getName() + "]");
                    } else {
                        CodeValidator.reportCustomError(ErrorDictionary.UNDECLARED_TYPE, "", name, ctx.start.getLine());
                    }
                }
                // const or not
                if(ctx.parent.getChild(0).getText().equalsIgnoreCase("val")){
                    SymbolTableHandler.getInstance().getSymbolConstant().add(v);
                    Console.log(Console.DEV_CONSOLE, "val [" + name + "] is a constant.");
                }
                getCurrentScope().define(v);
            }
        }
    }
    @Override public void enterFunctionValueParameter(KotlinParser.FunctionValueParameterContext ctx) {
        String name = ctx.getChild(0).getChild(0).getText();
        if(SymbolTableHandler.isSymbolDefinedInCurrentScope(name)) {
            CodeValidator.reportCustomError(ErrorDictionary.MULTIPLE_VARIABLE, "",name,ctx.start.getLine());
        } else {
            Symbol s = null;
            if(ctx.parent instanceof KotlinParser.ClassMemberDeclarationContext) {
                ParameterSymbol p = new ParameterSymbol(name);
                p.setDefNode(ctx);
                if (ctx.getChild(0).getChildCount() < 3)
                    CodeValidator.reportCustomError(ErrorDictionary.UNDECLARED_TYPE, "", name, ctx.start.getLine());
                else {
                    Type t = getPredefienedType(ctx.getChild(0).getChild(2).getText());
                    if (t != null) {
                        p.setType(t);
                        ctx.symbol = p;
                        Console.log(Console.DEV_CONSOLE, "Symbol added [" + name + "]["+t.getName()+"]");
                    } else {
                        CodeValidator.reportCustomError(ErrorDictionary.UNDECLARED_TYPE, "", name, ctx.start.getLine());
                    }
                }
                s = p;
            } else {
                FieldSymbol f = new FieldSymbol(name);
                f.setDefNode(ctx);
                if (ctx.getChild(0).getChildCount() < 3)
                    CodeValidator.reportCustomError(ErrorDictionary.UNDECLARED_TYPE, "", name, ctx.start.getLine());
                else {
                    Type t = getPredefienedType(ctx.getChild(0).getChild(2).getText());
                    if (t != null) {
                        f.setType(t);
                        ctx.symbol = f;
                        Console.log(Console.DEV_CONSOLE, "Symbol added [" + name + "]["+t.getName()+"]");
                    } else {
                        CodeValidator.reportCustomError(ErrorDictionary.UNDECLARED_TYPE, "", name, ctx.start.getLine());
                    }
                }
                s = f;
            }
            getCurrentScope().define(s);
        }
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
        LocalScope l = new LocalScope(getCurrentScope());
        pushScope(l);
    }

    @Override public void exitLoopExpression(KotlinParser.LoopExpressionContext ctx) {
        popScope();
    }

    private Scope getCurrentScope(){return SymbolTableHandler.getCurrentScope();}

    private Type getPredefienedType(String name){ return  SymbolTableHandler.getDefinedType(name); }

    private Symbol getPredefinedSymbol(String name){ return SymbolTableHandler.getPredefinedSymbol(name);}

    private void pushScope(Scope s) {
        SymbolTableHandler.pushScope(s);
        //Console.log(Console.DEV_CONSOLE, "Entering scope ["+ getCurrentScope().getName()+"]");
    }

    private void popScope() {
        Scope currentScope = getCurrentScope();
        //Console.log(Console.DEV_CONSOLE, "Leaving scope ["+currentScope.getName()+"]");
        SymbolTableHandler.popScope();
    }
}
