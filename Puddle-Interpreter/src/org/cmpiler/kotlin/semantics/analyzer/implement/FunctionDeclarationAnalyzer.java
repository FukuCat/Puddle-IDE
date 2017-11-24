package org.cmpiler.kotlin.semantics.analyzer.implement;

import org.antlr.symtab.ClassSymbol;
import org.antlr.symtab.FunctionSymbol;
import org.antlr.symtab.LocalScope;
import org.antlr.symtab.MethodSymbol;
import org.antlr.v4.runtime.ParserRuleContext;
import org.cmpiler.kotlin.antlr.KotlinParser;
import org.cmpiler.kotlin.interpreter.console.Console;
import org.cmpiler.kotlin.interpreter.parser.CodeValidator;
import org.cmpiler.kotlin.interpreter.parser.ErrorDictionary;
import org.cmpiler.kotlin.interpreter.parser.symboltable.SymbolTableHandler;
import org.cmpiler.kotlin.semantics.analyzer.AbstractAnalyzer;
import org.cmpiler.kotlin.utils.FunctionSignatureGenerator;

public class FunctionDeclarationAnalyzer extends AbstractAnalyzer {
    @Override
    public void enterRule(ParserRuleContext context) {
        KotlinParser.FunctionDeclarationContext ctx = (KotlinParser.FunctionDeclarationContext) context;
        //String name = symtab.getCurrentScope().toQualifierString(".")+"."+ FunctionSignatureGenerator.getInstance().toSignature(ctx);
        String name = FunctionSignatureGenerator.getInstance().toSignature(ctx);

        if(symtab.isSymbolDefinedInCurrentScope(name) && !(ctx.parent instanceof KotlinParser.ClassMemberDeclarationContext)) {
            CodeValidator.reportCustomError(ErrorDictionary.MULTIPLE_FUNCTION, "",name,ctx.start.getLine());
            LocalScope l = new LocalScope(symtab.getCurrentScope());
            symtab.pushScope(l);
        } else {
            FunctionSymbol f = null;
            if(ctx.parent instanceof KotlinParser.ClassMemberDeclarationContext){
                // found first method
                ClassSymbol c = (ClassSymbol) symtab.getCurrentScope();
                if(!symtab.isSymbolDefinedInCurrentScope(name)){
                    MethodSymbol m = new MethodSymbol(name);
                    m.setEnclosingScope(symtab.getCurrentScope());
                    m.setDefNode(ctx);
                    c.setSlotNumber(m);
                    symtab.getCurrentScope().define(m);
                    f = m;
                    Console.log(Console.DEV_CONSOLE, "Method defined ["+f.getName()+"]");
                } else {
                    CodeValidator.reportCustomError(ErrorDictionary.MULTIPLE_FUNCTION, "",name,ctx.start.getLine());
                }
            }
            else {
                f = new FunctionSymbol(name);
                f.setEnclosingScope(symtab.getCurrentScope());
                f.setDefNode(ctx);
                symtab.getCurrentScope().define(f);
                Console.log(Console.DEV_CONSOLE, "Function defined ["+f.getName()+"]");
            }
            ctx.scope = f;
            symtab.pushScope(f);
            if(ctx.getChild(1).getText().equalsIgnoreCase("main")){
                if(SymbolTableHandler.getInstance().getMainScope() == null)
                    SymbolTableHandler.getInstance().setMainScope(f);
                else
                    CodeValidator.reportCustomError(ErrorDictionary.MULTIPLE_MAIN, "",ctx.start.getLine());
            }
        }
    }

    @Override
    public void exitRule(ParserRuleContext context) {
        symtab.popScope();
    }
}
