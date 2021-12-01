package mx.zurich.demo.rating.engine;

import lombok.extern.slf4j.Slf4j;
import mx.zurich.demo.rating.engine.RatingEngineParser.AddDaysFunctionCallContext;
import mx.zurich.demo.rating.engine.RatingEngineParser.AddExpressionContext;
import mx.zurich.demo.rating.engine.RatingEngineParser.AndExpressionContext;
import mx.zurich.demo.rating.engine.RatingEngineParser.BlockContext;
import mx.zurich.demo.rating.engine.RatingEngineParser.BoolExpressionContext;
import mx.zurich.demo.rating.engine.RatingEngineParser.CeilFunctionCallContext;
import mx.zurich.demo.rating.engine.RatingEngineParser.DayFunctionCallContext;
import mx.zurich.demo.rating.engine.RatingEngineParser.DifferenceInMonthsFunctionCallContext;
import mx.zurich.demo.rating.engine.RatingEngineParser.DivideExpressionContext;
import mx.zurich.demo.rating.engine.RatingEngineParser.ElseIfStatContext;
import mx.zurich.demo.rating.engine.RatingEngineParser.ElseStatContext;
import mx.zurich.demo.rating.engine.RatingEngineParser.EqExpressionContext;
import mx.zurich.demo.rating.engine.RatingEngineParser.ErrorFunctionCallContext;
import mx.zurich.demo.rating.engine.RatingEngineParser.ExpFunctionCallContext;
import mx.zurich.demo.rating.engine.RatingEngineParser.ExprListContext;
import mx.zurich.demo.rating.engine.RatingEngineParser.FloorFunctionCallContext;
import mx.zurich.demo.rating.engine.RatingEngineParser.FunctionCallExpressionContext;
import mx.zurich.demo.rating.engine.RatingEngineParser.GetDiffDaysFunctionCallContext;
import mx.zurich.demo.rating.engine.RatingEngineParser.GtEqExpressionContext;
import mx.zurich.demo.rating.engine.RatingEngineParser.GtExpressionContext;
import mx.zurich.demo.rating.engine.RatingEngineParser.IdentifierExpressionContext;
import mx.zurich.demo.rating.engine.RatingEngineParser.IdentifierFunctionCallContext;
import mx.zurich.demo.rating.engine.RatingEngineParser.IfStatContext;
import mx.zurich.demo.rating.engine.RatingEngineParser.IfStatementContext;
import mx.zurich.demo.rating.engine.RatingEngineParser.LtEqExpressionContext;
import mx.zurich.demo.rating.engine.RatingEngineParser.LtExpressionContext;
import mx.zurich.demo.rating.engine.RatingEngineParser.MaxFunctionCallContext;
import mx.zurich.demo.rating.engine.RatingEngineParser.MinFunctionCallContext;
import mx.zurich.demo.rating.engine.RatingEngineParser.ModuloExpressionContext;
import mx.zurich.demo.rating.engine.RatingEngineParser.MonthFunctionCallContext;
import mx.zurich.demo.rating.engine.RatingEngineParser.MultiplyExpressionContext;
import mx.zurich.demo.rating.engine.RatingEngineParser.NotEqExpressionContext;
import mx.zurich.demo.rating.engine.RatingEngineParser.NotExpressionContext;
import mx.zurich.demo.rating.engine.RatingEngineParser.NumberExpressionContext;
import mx.zurich.demo.rating.engine.RatingEngineParser.OrExpressionContext;
import mx.zurich.demo.rating.engine.RatingEngineParser.PaddedStringFunctionCallContext;
import mx.zurich.demo.rating.engine.RatingEngineParser.ParseContext;
import mx.zurich.demo.rating.engine.RatingEngineParser.RoundFunctionCallContext;
import mx.zurich.demo.rating.engine.RatingEngineParser.StringExpressionContext;
import mx.zurich.demo.rating.engine.RatingEngineParser.SubstrFunctionCallContext;
import mx.zurich.demo.rating.engine.RatingEngineParser.SubtractExpressionContext;
import mx.zurich.demo.rating.engine.RatingEngineParser.UnaryMinusExpressionContext;
import mx.zurich.demo.rating.engine.RatingEngineParser.YearFunctionCallContext;
@Slf4j
public class RatingEngineVisitorImpl extends RatingEngineBaseVisitor<Double>{

	@Override
	public Double visitPowerExpression(RatingEngineParser.PowerExpressionContext ctx) {				
		Double a = Double.parseDouble(ctx.expression(0).getText());
		Double b = Double.parseDouble(ctx.expression(1).getText());
		
		log.info(a +" ^ " +b + " " + visit(ctx.expression(0)));
		if(a==null || b ==null) {
			return null;
		}else {
			return Math.pow(a,b);
		}		
	}
	
	@Override 
	public Double visitExpressionExpression(RatingEngineParser.ExpressionExpressionContext ctx) { 
		return visit(ctx.expression()); 
	}

	@Override
	public Double visitParse(ParseContext ctx) {
		// TODO Auto-generated method stub
		return super.visitParse(ctx);
	}

	@Override
	public Double visitBlock(BlockContext ctx) {
		// TODO Auto-generated method stub
		return super.visitBlock(ctx);
	}

	@Override
	public Double visitErrorFunctionCall(ErrorFunctionCallContext ctx) {
		// TODO Auto-generated method stub
		return super.visitErrorFunctionCall(ctx);
	}

	@Override
	public Double visitMaxFunctionCall(MaxFunctionCallContext ctx) {
		// TODO Auto-generated method stub
		return super.visitMaxFunctionCall(ctx);
	}

	@Override
	public Double visitMinFunctionCall(MinFunctionCallContext ctx) {
		// TODO Auto-generated method stub
		return super.visitMinFunctionCall(ctx);
	}

	@Override
	public Double visitRoundFunctionCall(RoundFunctionCallContext ctx) {
		// TODO Auto-generated method stub
		return super.visitRoundFunctionCall(ctx);
	}

	@Override
	public Double visitCeilFunctionCall(CeilFunctionCallContext ctx) {
		// TODO Auto-generated method stub
		return super.visitCeilFunctionCall(ctx);
	}

	@Override
	public Double visitFloorFunctionCall(FloorFunctionCallContext ctx) {
		// TODO Auto-generated method stub
		return super.visitFloorFunctionCall(ctx);
	}

	@Override
	public Double visitExpFunctionCall(ExpFunctionCallContext ctx) {
		// TODO Auto-generated method stub
		return super.visitExpFunctionCall(ctx);
	}

	@Override
	public Double visitDayFunctionCall(DayFunctionCallContext ctx) {
		// TODO Auto-generated method stub
		return super.visitDayFunctionCall(ctx);
	}

	@Override
	public Double visitMonthFunctionCall(MonthFunctionCallContext ctx) {
		// TODO Auto-generated method stub
		return super.visitMonthFunctionCall(ctx);
	}

	@Override
	public Double visitYearFunctionCall(YearFunctionCallContext ctx) {
		// TODO Auto-generated method stub
		return super.visitYearFunctionCall(ctx);
	}

	@Override
	public Double visitSubstrFunctionCall(SubstrFunctionCallContext ctx) {
		// TODO Auto-generated method stub
		return super.visitSubstrFunctionCall(ctx);
	}

	@Override
	public Double visitAddDaysFunctionCall(AddDaysFunctionCallContext ctx) {
		// TODO Auto-generated method stub
		return super.visitAddDaysFunctionCall(ctx);
	}

	@Override
	public Double visitGetDiffDaysFunctionCall(GetDiffDaysFunctionCallContext ctx) {
		// TODO Auto-generated method stub
		return super.visitGetDiffDaysFunctionCall(ctx);
	}

	@Override
	public Double visitPaddedStringFunctionCall(PaddedStringFunctionCallContext ctx) {
		// TODO Auto-generated method stub
		return super.visitPaddedStringFunctionCall(ctx);
	}

	@Override
	public Double visitDifferenceInMonthsFunctionCall(DifferenceInMonthsFunctionCallContext ctx) {
		// TODO Auto-generated method stub
		return super.visitDifferenceInMonthsFunctionCall(ctx);
	}

	@Override
	public Double visitIdentifierFunctionCall(IdentifierFunctionCallContext ctx) {
		// TODO Auto-generated method stub
		return super.visitIdentifierFunctionCall(ctx);
	}

	@Override
	public Double visitIfStatement(IfStatementContext ctx) {
		// TODO Auto-generated method stub
		return super.visitIfStatement(ctx);
	}

	@Override
	public Double visitIfStat(IfStatContext ctx) {
		// TODO Auto-generated method stub
		return super.visitIfStat(ctx);
	}

	@Override
	public Double visitElseIfStat(ElseIfStatContext ctx) {
		// TODO Auto-generated method stub
		return super.visitElseIfStat(ctx);
	}

	@Override
	public Double visitElseStat(ElseStatContext ctx) {
		// TODO Auto-generated method stub
		return super.visitElseStat(ctx);
	}

	@Override
	public Double visitExprList(ExprListContext ctx) {
		// TODO Auto-generated method stub
		return super.visitExprList(ctx);
	}

	@Override
	public Double visitLtExpression(LtExpressionContext ctx) {
		// TODO Auto-generated method stub
		return super.visitLtExpression(ctx);
	}

	@Override
	public Double visitGtExpression(GtExpressionContext ctx) {
		// TODO Auto-generated method stub
		return super.visitGtExpression(ctx);
	}

	@Override
	public Double visitBoolExpression(BoolExpressionContext ctx) {
		// TODO Auto-generated method stub
		return super.visitBoolExpression(ctx);
	}

	@Override
	public Double visitNotEqExpression(NotEqExpressionContext ctx) {
		// TODO Auto-generated method stub
		return super.visitNotEqExpression(ctx);
	}

	@Override
	public Double visitModuloExpression(ModuloExpressionContext ctx) {
		// TODO Auto-generated method stub
		return super.visitModuloExpression(ctx);
	}

	@Override
	public Double visitNumberExpression(NumberExpressionContext ctx) {
		// TODO Auto-generated method stub
		return super.visitNumberExpression(ctx);
	}

	@Override
	public Double visitIdentifierExpression(IdentifierExpressionContext ctx) {
		// TODO Auto-generated method stub
		return super.visitIdentifierExpression(ctx);
	}

	@Override
	public Double visitNotExpression(NotExpressionContext ctx) {
		// TODO Auto-generated method stub
		return super.visitNotExpression(ctx);
	}

	@Override
	public Double visitMultiplyExpression(MultiplyExpressionContext ctx) {
		// TODO Auto-generated method stub
		return super.visitMultiplyExpression(ctx);
	}

	@Override
	public Double visitGtEqExpression(GtEqExpressionContext ctx) {
		// TODO Auto-generated method stub
		return super.visitGtEqExpression(ctx);
	}

	@Override
	public Double visitDivideExpression(DivideExpressionContext ctx) {
		// TODO Auto-generated method stub
		return super.visitDivideExpression(ctx);
	}

	@Override
	public Double visitOrExpression(OrExpressionContext ctx) {
		// TODO Auto-generated method stub
		return super.visitOrExpression(ctx);
	}

	@Override
	public Double visitUnaryMinusExpression(UnaryMinusExpressionContext ctx) {
		// TODO Auto-generated method stub
		return super.visitUnaryMinusExpression(ctx);
	}

	@Override
	public Double visitEqExpression(EqExpressionContext ctx) {
		// TODO Auto-generated method stub
		return super.visitEqExpression(ctx);
	}

	@Override
	public Double visitAndExpression(AndExpressionContext ctx) {
		// TODO Auto-generated method stub
		return super.visitAndExpression(ctx);
	}

	@Override
	public Double visitStringExpression(StringExpressionContext ctx) {
		// TODO Auto-generated method stub
		return super.visitStringExpression(ctx);
	}

	@Override
	public Double visitAddExpression(AddExpressionContext ctx) {
		// TODO Auto-generated method stub
		return super.visitAddExpression(ctx);
	}

	@Override
	public Double visitSubtractExpression(SubtractExpressionContext ctx) {
		// TODO Auto-generated method stub
		return super.visitSubtractExpression(ctx);
	}

	@Override
	public Double visitFunctionCallExpression(FunctionCallExpressionContext ctx) {
		// TODO Auto-generated method stub
		return super.visitFunctionCallExpression(ctx);
	}

	@Override
	public Double visitLtEqExpression(LtEqExpressionContext ctx) {
		// TODO Auto-generated method stub
		return super.visitLtEqExpression(ctx);
	}
}
