package main.antlr.puddle;// Generated from src\main\antlr\Puddle.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PuddleParser}.
 */
public interface PuddleListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PuddleParser#main}.
	 * @param ctx the parse tree
	 */
	void enterMain(PuddleParser.MainContext ctx);
	/**
	 * Exit a parse tree produced by {@link PuddleParser#main}.
	 * @param ctx the parse tree
	 */
	void exitMain(PuddleParser.MainContext ctx);
	/**
	 * Enter a parse tree produced by {@link PuddleParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(PuddleParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PuddleParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(PuddleParser.ExprContext ctx);
}