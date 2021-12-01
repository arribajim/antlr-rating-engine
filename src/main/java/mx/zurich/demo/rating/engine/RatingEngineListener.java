// Generated from RatingEngine.g4 by ANTLR 4.9.3
package mx.zurich.demo.rating.engine;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link RatingEngineParser}.
 */
public interface RatingEngineListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link RatingEngineParser#parse}.
	 * @param ctx the parse tree
	 */
	void enterParse(RatingEngineParser.ParseContext ctx);
	/**
	 * Exit a parse tree produced by {@link RatingEngineParser#parse}.
	 * @param ctx the parse tree
	 */
	void exitParse(RatingEngineParser.ParseContext ctx);
	/**
	 * Enter a parse tree produced by {@link RatingEngineParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(RatingEngineParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link RatingEngineParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(RatingEngineParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link RatingEngineParser#errorFunctionCall}.
	 * @param ctx the parse tree
	 */
	void enterErrorFunctionCall(RatingEngineParser.ErrorFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link RatingEngineParser#errorFunctionCall}.
	 * @param ctx the parse tree
	 */
	void exitErrorFunctionCall(RatingEngineParser.ErrorFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code maxFunctionCall}
	 * labeled alternative in {@link RatingEngineParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterMaxFunctionCall(RatingEngineParser.MaxFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code maxFunctionCall}
	 * labeled alternative in {@link RatingEngineParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitMaxFunctionCall(RatingEngineParser.MaxFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code minFunctionCall}
	 * labeled alternative in {@link RatingEngineParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterMinFunctionCall(RatingEngineParser.MinFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code minFunctionCall}
	 * labeled alternative in {@link RatingEngineParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitMinFunctionCall(RatingEngineParser.MinFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code roundFunctionCall}
	 * labeled alternative in {@link RatingEngineParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterRoundFunctionCall(RatingEngineParser.RoundFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code roundFunctionCall}
	 * labeled alternative in {@link RatingEngineParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitRoundFunctionCall(RatingEngineParser.RoundFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ceilFunctionCall}
	 * labeled alternative in {@link RatingEngineParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterCeilFunctionCall(RatingEngineParser.CeilFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ceilFunctionCall}
	 * labeled alternative in {@link RatingEngineParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitCeilFunctionCall(RatingEngineParser.CeilFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code floorFunctionCall}
	 * labeled alternative in {@link RatingEngineParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFloorFunctionCall(RatingEngineParser.FloorFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code floorFunctionCall}
	 * labeled alternative in {@link RatingEngineParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFloorFunctionCall(RatingEngineParser.FloorFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expFunctionCall}
	 * labeled alternative in {@link RatingEngineParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterExpFunctionCall(RatingEngineParser.ExpFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expFunctionCall}
	 * labeled alternative in {@link RatingEngineParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitExpFunctionCall(RatingEngineParser.ExpFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dayFunctionCall}
	 * labeled alternative in {@link RatingEngineParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterDayFunctionCall(RatingEngineParser.DayFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dayFunctionCall}
	 * labeled alternative in {@link RatingEngineParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitDayFunctionCall(RatingEngineParser.DayFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code monthFunctionCall}
	 * labeled alternative in {@link RatingEngineParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterMonthFunctionCall(RatingEngineParser.MonthFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code monthFunctionCall}
	 * labeled alternative in {@link RatingEngineParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitMonthFunctionCall(RatingEngineParser.MonthFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code yearFunctionCall}
	 * labeled alternative in {@link RatingEngineParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterYearFunctionCall(RatingEngineParser.YearFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code yearFunctionCall}
	 * labeled alternative in {@link RatingEngineParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitYearFunctionCall(RatingEngineParser.YearFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code substrFunctionCall}
	 * labeled alternative in {@link RatingEngineParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterSubstrFunctionCall(RatingEngineParser.SubstrFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code substrFunctionCall}
	 * labeled alternative in {@link RatingEngineParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitSubstrFunctionCall(RatingEngineParser.SubstrFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addDaysFunctionCall}
	 * labeled alternative in {@link RatingEngineParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterAddDaysFunctionCall(RatingEngineParser.AddDaysFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addDaysFunctionCall}
	 * labeled alternative in {@link RatingEngineParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitAddDaysFunctionCall(RatingEngineParser.AddDaysFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code getDiffDaysFunctionCall}
	 * labeled alternative in {@link RatingEngineParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterGetDiffDaysFunctionCall(RatingEngineParser.GetDiffDaysFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code getDiffDaysFunctionCall}
	 * labeled alternative in {@link RatingEngineParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitGetDiffDaysFunctionCall(RatingEngineParser.GetDiffDaysFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code paddedStringFunctionCall}
	 * labeled alternative in {@link RatingEngineParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterPaddedStringFunctionCall(RatingEngineParser.PaddedStringFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code paddedStringFunctionCall}
	 * labeled alternative in {@link RatingEngineParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitPaddedStringFunctionCall(RatingEngineParser.PaddedStringFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code differenceInMonthsFunctionCall}
	 * labeled alternative in {@link RatingEngineParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterDifferenceInMonthsFunctionCall(RatingEngineParser.DifferenceInMonthsFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code differenceInMonthsFunctionCall}
	 * labeled alternative in {@link RatingEngineParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitDifferenceInMonthsFunctionCall(RatingEngineParser.DifferenceInMonthsFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code identifierFunctionCall}
	 * labeled alternative in {@link RatingEngineParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierFunctionCall(RatingEngineParser.IdentifierFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code identifierFunctionCall}
	 * labeled alternative in {@link RatingEngineParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierFunctionCall(RatingEngineParser.IdentifierFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link RatingEngineParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(RatingEngineParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link RatingEngineParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(RatingEngineParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link RatingEngineParser#ifStat}.
	 * @param ctx the parse tree
	 */
	void enterIfStat(RatingEngineParser.IfStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link RatingEngineParser#ifStat}.
	 * @param ctx the parse tree
	 */
	void exitIfStat(RatingEngineParser.IfStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link RatingEngineParser#elseIfStat}.
	 * @param ctx the parse tree
	 */
	void enterElseIfStat(RatingEngineParser.ElseIfStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link RatingEngineParser#elseIfStat}.
	 * @param ctx the parse tree
	 */
	void exitElseIfStat(RatingEngineParser.ElseIfStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link RatingEngineParser#elseStat}.
	 * @param ctx the parse tree
	 */
	void enterElseStat(RatingEngineParser.ElseStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link RatingEngineParser#elseStat}.
	 * @param ctx the parse tree
	 */
	void exitElseStat(RatingEngineParser.ElseStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link RatingEngineParser#exprList}.
	 * @param ctx the parse tree
	 */
	void enterExprList(RatingEngineParser.ExprListContext ctx);
	/**
	 * Exit a parse tree produced by {@link RatingEngineParser#exprList}.
	 * @param ctx the parse tree
	 */
	void exitExprList(RatingEngineParser.ExprListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ltExpression}
	 * labeled alternative in {@link RatingEngineParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLtExpression(RatingEngineParser.LtExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ltExpression}
	 * labeled alternative in {@link RatingEngineParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLtExpression(RatingEngineParser.LtExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code gtExpression}
	 * labeled alternative in {@link RatingEngineParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterGtExpression(RatingEngineParser.GtExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code gtExpression}
	 * labeled alternative in {@link RatingEngineParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitGtExpression(RatingEngineParser.GtExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolExpression}
	 * labeled alternative in {@link RatingEngineParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBoolExpression(RatingEngineParser.BoolExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolExpression}
	 * labeled alternative in {@link RatingEngineParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBoolExpression(RatingEngineParser.BoolExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notEqExpression}
	 * labeled alternative in {@link RatingEngineParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNotEqExpression(RatingEngineParser.NotEqExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notEqExpression}
	 * labeled alternative in {@link RatingEngineParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNotEqExpression(RatingEngineParser.NotEqExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code moduloExpression}
	 * labeled alternative in {@link RatingEngineParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterModuloExpression(RatingEngineParser.ModuloExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code moduloExpression}
	 * labeled alternative in {@link RatingEngineParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitModuloExpression(RatingEngineParser.ModuloExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numberExpression}
	 * labeled alternative in {@link RatingEngineParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNumberExpression(RatingEngineParser.NumberExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numberExpression}
	 * labeled alternative in {@link RatingEngineParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNumberExpression(RatingEngineParser.NumberExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code identifierExpression}
	 * labeled alternative in {@link RatingEngineParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierExpression(RatingEngineParser.IdentifierExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code identifierExpression}
	 * labeled alternative in {@link RatingEngineParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierExpression(RatingEngineParser.IdentifierExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notExpression}
	 * labeled alternative in {@link RatingEngineParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNotExpression(RatingEngineParser.NotExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notExpression}
	 * labeled alternative in {@link RatingEngineParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNotExpression(RatingEngineParser.NotExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multiplyExpression}
	 * labeled alternative in {@link RatingEngineParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplyExpression(RatingEngineParser.MultiplyExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multiplyExpression}
	 * labeled alternative in {@link RatingEngineParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplyExpression(RatingEngineParser.MultiplyExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code gtEqExpression}
	 * labeled alternative in {@link RatingEngineParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterGtEqExpression(RatingEngineParser.GtEqExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code gtEqExpression}
	 * labeled alternative in {@link RatingEngineParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitGtEqExpression(RatingEngineParser.GtEqExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code divideExpression}
	 * labeled alternative in {@link RatingEngineParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterDivideExpression(RatingEngineParser.DivideExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code divideExpression}
	 * labeled alternative in {@link RatingEngineParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitDivideExpression(RatingEngineParser.DivideExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code orExpression}
	 * labeled alternative in {@link RatingEngineParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterOrExpression(RatingEngineParser.OrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code orExpression}
	 * labeled alternative in {@link RatingEngineParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitOrExpression(RatingEngineParser.OrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unaryMinusExpression}
	 * labeled alternative in {@link RatingEngineParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryMinusExpression(RatingEngineParser.UnaryMinusExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unaryMinusExpression}
	 * labeled alternative in {@link RatingEngineParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryMinusExpression(RatingEngineParser.UnaryMinusExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code powerExpression}
	 * labeled alternative in {@link RatingEngineParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPowerExpression(RatingEngineParser.PowerExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code powerExpression}
	 * labeled alternative in {@link RatingEngineParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPowerExpression(RatingEngineParser.PowerExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code eqExpression}
	 * labeled alternative in {@link RatingEngineParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterEqExpression(RatingEngineParser.EqExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code eqExpression}
	 * labeled alternative in {@link RatingEngineParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitEqExpression(RatingEngineParser.EqExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code andExpression}
	 * labeled alternative in {@link RatingEngineParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAndExpression(RatingEngineParser.AndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code andExpression}
	 * labeled alternative in {@link RatingEngineParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAndExpression(RatingEngineParser.AndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringExpression}
	 * labeled alternative in {@link RatingEngineParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterStringExpression(RatingEngineParser.StringExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringExpression}
	 * labeled alternative in {@link RatingEngineParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitStringExpression(RatingEngineParser.StringExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionExpression}
	 * labeled alternative in {@link RatingEngineParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionExpression(RatingEngineParser.ExpressionExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionExpression}
	 * labeled alternative in {@link RatingEngineParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionExpression(RatingEngineParser.ExpressionExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addExpression}
	 * labeled alternative in {@link RatingEngineParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAddExpression(RatingEngineParser.AddExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addExpression}
	 * labeled alternative in {@link RatingEngineParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAddExpression(RatingEngineParser.AddExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code subtractExpression}
	 * labeled alternative in {@link RatingEngineParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterSubtractExpression(RatingEngineParser.SubtractExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code subtractExpression}
	 * labeled alternative in {@link RatingEngineParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitSubtractExpression(RatingEngineParser.SubtractExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functionCallExpression}
	 * labeled alternative in {@link RatingEngineParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCallExpression(RatingEngineParser.FunctionCallExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functionCallExpression}
	 * labeled alternative in {@link RatingEngineParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCallExpression(RatingEngineParser.FunctionCallExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ltEqExpression}
	 * labeled alternative in {@link RatingEngineParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLtEqExpression(RatingEngineParser.LtEqExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ltEqExpression}
	 * labeled alternative in {@link RatingEngineParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLtEqExpression(RatingEngineParser.LtEqExpressionContext ctx);
}