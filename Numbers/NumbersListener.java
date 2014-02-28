// Generated from Numbers.g4 by ANTLR 4.1

package numbers;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link NumbersParser}.
 */
public interface NumbersListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link NumbersParser#Mod}.
	 * @param ctx the parse tree
	 */
	void enterMod(@NotNull NumbersParser.ModContext ctx);
	/**
	 * Exit a parse tree produced by {@link NumbersParser#Mod}.
	 * @param ctx the parse tree
	 */
	void exitMod(@NotNull NumbersParser.ModContext ctx);

	/**
	 * Enter a parse tree produced by {@link NumbersParser#Mul}.
	 * @param ctx the parse tree
	 */
	void enterMul(@NotNull NumbersParser.MulContext ctx);
	/**
	 * Exit a parse tree produced by {@link NumbersParser#Mul}.
	 * @param ctx the parse tree
	 */
	void exitMul(@NotNull NumbersParser.MulContext ctx);

	/**
	 * Enter a parse tree produced by {@link NumbersParser#Num}.
	 * @param ctx the parse tree
	 */
	void enterNum(@NotNull NumbersParser.NumContext ctx);
	/**
	 * Exit a parse tree produced by {@link NumbersParser#Num}.
	 * @param ctx the parse tree
	 */
	void exitNum(@NotNull NumbersParser.NumContext ctx);

	/**
	 * Enter a parse tree produced by {@link NumbersParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(@NotNull NumbersParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link NumbersParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(@NotNull NumbersParser.ProgramContext ctx);

	/**
	 * Enter a parse tree produced by {@link NumbersParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(@NotNull NumbersParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link NumbersParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(@NotNull NumbersParser.ValueContext ctx);

	/**
	 * Enter a parse tree produced by {@link NumbersParser#Add}.
	 * @param ctx the parse tree
	 */
	void enterAdd(@NotNull NumbersParser.AddContext ctx);
	/**
	 * Exit a parse tree produced by {@link NumbersParser#Add}.
	 * @param ctx the parse tree
	 */
	void exitAdd(@NotNull NumbersParser.AddContext ctx);

	/**
	 * Enter a parse tree produced by {@link NumbersParser#parens}.
	 * @param ctx the parse tree
	 */
	void enterParens(@NotNull NumbersParser.ParensContext ctx);
	/**
	 * Exit a parse tree produced by {@link NumbersParser#parens}.
	 * @param ctx the parse tree
	 */
	void exitParens(@NotNull NumbersParser.ParensContext ctx);

	/**
	 * Enter a parse tree produced by {@link NumbersParser#Sub}.
	 * @param ctx the parse tree
	 */
	void enterSub(@NotNull NumbersParser.SubContext ctx);
	/**
	 * Exit a parse tree produced by {@link NumbersParser#Sub}.
	 * @param ctx the parse tree
	 */
	void exitSub(@NotNull NumbersParser.SubContext ctx);

	/**
	 * Enter a parse tree produced by {@link NumbersParser#Div}.
	 * @param ctx the parse tree
	 */
	void enterDiv(@NotNull NumbersParser.DivContext ctx);
	/**
	 * Exit a parse tree produced by {@link NumbersParser#Div}.
	 * @param ctx the parse tree
	 */
	void exitDiv(@NotNull NumbersParser.DivContext ctx);
}