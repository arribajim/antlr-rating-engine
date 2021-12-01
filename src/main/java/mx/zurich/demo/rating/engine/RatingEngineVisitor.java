// Generated from RatingEngine.g4 by ANTLR 4.9.3
package mx.zurich.demo.rating.engine;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link RatingEngineParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface RatingEngineVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link RatingEngineParser#parse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParse(RatingEngineParser.ParseContext ctx);
	/**
	 * Visit a parse tree produced by {@link RatingEngineParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(RatingEngineParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link RatingEngineParser#errorFunctionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitErrorFunctionCall(RatingEngineParser.ErrorFunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code maxFunctionCall}
	 * labeled alternative in {@link RatingEngineParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMaxFunctionCall(RatingEngineParser.MaxFunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code minFunctionCall}
	 * labeled alternative in {@link RatingEngineParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinFunctionCall(RatingEngineParser.MinFunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code roundFunctionCall}
	 * labeled alternative in {@link RatingEngineParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoundFunctionCall(RatingEngineParser.RoundFunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ceilFunctionCall}
	 * labeled alternative in {@link RatingEngineParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCeilFunctionCall(RatingEngineParser.CeilFunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code floorFunctionCall}
	 * labeled alternative in {@link RatingEngineParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloorFunctionCall(RatingEngineParser.FloorFunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expFunctionCall}
	 * labeled alternative in {@link RatingEngineParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpFunctionCall(RatingEngineParser.ExpFunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dayFunctionCall}
	 * labeled alternative in {@link RatingEngineParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDayFunctionCall(RatingEngineParser.DayFunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code monthFunctionCall}
	 * labeled alternative in {@link RatingEngineParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMonthFunctionCall(RatingEngineParser.MonthFunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code yearFunctionCall}
	 * labeled alternative in {@link RatingEngineParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitYearFunctionCall(RatingEngineParser.YearFunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code substrFunctionCall}
	 * labeled alternative in {@link RatingEngineParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubstrFunctionCall(RatingEngineParser.SubstrFunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code addDaysFunctionCall}
	 * labeled alternative in {@link RatingEngineParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddDaysFunctionCall(RatingEngineParser.AddDaysFunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code getDiffDaysFunctionCall}
	 * labeled alternative in {@link RatingEngineParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGetDiffDaysFunctionCall(RatingEngineParser.GetDiffDaysFunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code paddedStringFunctionCall}
	 * labeled alternative in {@link RatingEngineParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPaddedStringFunctionCall(RatingEngineParser.PaddedStringFunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code differenceInMonthsFunctionCall}
	 * labeled alternative in {@link RatingEngineParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDifferenceInMonthsFunctionCall(RatingEngineParser.DifferenceInMonthsFunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code identifierFunctionCall}
	 * labeled alternative in {@link RatingEngineParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierFunctionCall(RatingEngineParser.IdentifierFunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link RatingEngineParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(RatingEngineParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link RatingEngineParser#ifStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStat(RatingEngineParser.IfStatContext ctx);
	/**
	 * Visit a parse tree produced by {@link RatingEngineParser#elseIfStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseIfStat(RatingEngineParser.ElseIfStatContext ctx);
	/**
	 * Visit a parse tree produced by {@link RatingEngineParser#elseStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseStat(RatingEngineParser.ElseStatContext ctx);
	/**
	 * Visit a parse tree produced by {@link RatingEngineParser#exprList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprList(RatingEngineParser.ExprListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ltExpression}
	 * labeled alternative in {@link RatingEngineParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLtExpression(RatingEngineParser.LtExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code gtExpression}
	 * labeled alternative in {@link RatingEngineParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGtExpression(RatingEngineParser.GtExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boolExpression}
	 * labeled alternative in {@link RatingEngineParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolExpression(RatingEngineParser.BoolExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code notEqExpression}
	 * labeled alternative in {@link RatingEngineParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotEqExpression(RatingEngineParser.NotEqExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code moduloExpression}
	 * labeled alternative in {@link RatingEngineParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModuloExpression(RatingEngineParser.ModuloExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numberExpression}
	 * labeled alternative in {@link RatingEngineParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberExpression(RatingEngineParser.NumberExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code identifierExpression}
	 * labeled alternative in {@link RatingEngineParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierExpression(RatingEngineParser.IdentifierExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code notExpression}
	 * labeled alternative in {@link RatingEngineParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotExpression(RatingEngineParser.NotExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multiplyExpression}
	 * labeled alternative in {@link RatingEngineParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplyExpression(RatingEngineParser.MultiplyExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code gtEqExpression}
	 * labeled alternative in {@link RatingEngineParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGtEqExpression(RatingEngineParser.GtEqExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code divideExpression}
	 * labeled alternative in {@link RatingEngineParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivideExpression(RatingEngineParser.DivideExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code orExpression}
	 * labeled alternative in {@link RatingEngineParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrExpression(RatingEngineParser.OrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unaryMinusExpression}
	 * labeled alternative in {@link RatingEngineParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryMinusExpression(RatingEngineParser.UnaryMinusExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code powerExpression}
	 * labeled alternative in {@link RatingEngineParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPowerExpression(RatingEngineParser.PowerExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code eqExpression}
	 * labeled alternative in {@link RatingEngineParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqExpression(RatingEngineParser.EqExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code andExpression}
	 * labeled alternative in {@link RatingEngineParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpression(RatingEngineParser.AndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringExpression}
	 * labeled alternative in {@link RatingEngineParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringExpression(RatingEngineParser.StringExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expressionExpression}
	 * labeled alternative in {@link RatingEngineParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionExpression(RatingEngineParser.ExpressionExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code addExpression}
	 * labeled alternative in {@link RatingEngineParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddExpression(RatingEngineParser.AddExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code subtractExpression}
	 * labeled alternative in {@link RatingEngineParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubtractExpression(RatingEngineParser.SubtractExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functionCallExpression}
	 * labeled alternative in {@link RatingEngineParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCallExpression(RatingEngineParser.FunctionCallExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ltEqExpression}
	 * labeled alternative in {@link RatingEngineParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLtEqExpression(RatingEngineParser.LtEqExpressionContext ctx);
}