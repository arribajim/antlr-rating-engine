// Generated from RatingEngine.g4 by ANTLR 4.9.3
package mx.zurich.demo.rating.engine;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class RatingEngineParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, If=4, Then=5, Else=6, Return=7, End=8, Or=9, And=10, 
		Max=11, Min=12, Rnd=13, Ceil=14, Floor=15, Exp=16, Year=17, Month=18, 
		Day=19, Substr=20, Error=21, Mod=22, AddDays=23, GetDiffDays=24, PaddedString=25, 
		DifferenceInMonths=26, A=27, B=28, C=29, D=30, E=31, F=32, G=33, H=34, 
		I=35, L=36, M=37, N=38, O=39, P=40, R=41, S=42, T=43, U=44, X=45, Y=46, 
		Equals=47, NEquals=48, GTEquals=49, LTEquals=50, Pow=51, Excl=52, GT=53, 
		LT=54, Add=55, Subtract=56, Multiply=57, Divide=58, Modulus=59, Bool=60, 
		Number=61, Identifier=62, String=63, Space=64, Line_Comment=65, Comment=66, 
		ErrorCharacter=67;
	public static final int
		RULE_parse = 0, RULE_block = 1, RULE_errorFunctionCall = 2, RULE_functionCall = 3, 
		RULE_ifStatement = 4, RULE_ifStat = 5, RULE_elseIfStat = 6, RULE_elseStat = 7, 
		RULE_exprList = 8, RULE_expression = 9;
	private static String[] makeRuleNames() {
		return new String[] {
			"parse", "block", "errorFunctionCall", "functionCall", "ifStatement", 
			"ifStat", "elseIfStat", "elseStat", "exprList", "expression"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "','", null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"'='", "'<>'", "'>='", "'<='", "'^'", "'!'", "'>'", "'<'", "'+'", "'-'", 
			"'*'", "'/'", "'%'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "If", "Then", "Else", "Return", "End", "Or", 
			"And", "Max", "Min", "Rnd", "Ceil", "Floor", "Exp", "Year", "Month", 
			"Day", "Substr", "Error", "Mod", "AddDays", "GetDiffDays", "PaddedString", 
			"DifferenceInMonths", "A", "B", "C", "D", "E", "F", "G", "H", "I", "L", 
			"M", "N", "O", "P", "R", "S", "T", "U", "X", "Y", "Equals", "NEquals", 
			"GTEquals", "LTEquals", "Pow", "Excl", "GT", "LT", "Add", "Subtract", 
			"Multiply", "Divide", "Modulus", "Bool", "Number", "Identifier", "String", 
			"Space", "Line_Comment", "Comment", "ErrorCharacter"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "RatingEngine.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public RatingEngineParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ParseContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode EOF() { return getToken(RatingEngineParser.EOF, 0); }
		public ParseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RatingEngineListener ) ((RatingEngineListener)listener).enterParse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RatingEngineListener ) ((RatingEngineListener)listener).exitParse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RatingEngineVisitor ) return ((RatingEngineVisitor<? extends T>)visitor).visitParse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParseContext parse() throws RecognitionException {
		ParseContext _localctx = new ParseContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_parse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(20);
			block();
			setState(21);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public TerminalNode Return() { return getToken(RatingEngineParser.Return, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ErrorFunctionCallContext errorFunctionCall() {
			return getRuleContext(ErrorFunctionCallContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RatingEngineListener ) ((RatingEngineListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RatingEngineListener ) ((RatingEngineListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RatingEngineVisitor ) return ((RatingEngineVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_block);
		try {
			setState(27);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case If:
				enterOuterAlt(_localctx, 1);
				{
				setState(23);
				ifStatement();
				}
				break;
			case Return:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(24);
				match(Return);
				setState(25);
				expression(0);
				}
				}
				break;
			case Error:
				enterOuterAlt(_localctx, 3);
				{
				setState(26);
				errorFunctionCall();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ErrorFunctionCallContext extends ParserRuleContext {
		public TerminalNode Error() { return getToken(RatingEngineParser.Error, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ErrorFunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_errorFunctionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RatingEngineListener ) ((RatingEngineListener)listener).enterErrorFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RatingEngineListener ) ((RatingEngineListener)listener).exitErrorFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RatingEngineVisitor ) return ((RatingEngineVisitor<? extends T>)visitor).visitErrorFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ErrorFunctionCallContext errorFunctionCall() throws RecognitionException {
		ErrorFunctionCallContext _localctx = new ErrorFunctionCallContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_errorFunctionCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(29);
			match(Error);
			setState(30);
			match(T__0);
			setState(31);
			expression(0);
			setState(32);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionCallContext extends ParserRuleContext {
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
	 
		public FunctionCallContext() { }
		public void copyFrom(FunctionCallContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DifferenceInMonthsFunctionCallContext extends FunctionCallContext {
		public TerminalNode DifferenceInMonths() { return getToken(RatingEngineParser.DifferenceInMonths, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public DifferenceInMonthsFunctionCallContext(FunctionCallContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RatingEngineListener ) ((RatingEngineListener)listener).enterDifferenceInMonthsFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RatingEngineListener ) ((RatingEngineListener)listener).exitDifferenceInMonthsFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RatingEngineVisitor ) return ((RatingEngineVisitor<? extends T>)visitor).visitDifferenceInMonthsFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class YearFunctionCallContext extends FunctionCallContext {
		public TerminalNode Year() { return getToken(RatingEngineParser.Year, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public YearFunctionCallContext(FunctionCallContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RatingEngineListener ) ((RatingEngineListener)listener).enterYearFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RatingEngineListener ) ((RatingEngineListener)listener).exitYearFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RatingEngineVisitor ) return ((RatingEngineVisitor<? extends T>)visitor).visitYearFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DayFunctionCallContext extends FunctionCallContext {
		public TerminalNode Day() { return getToken(RatingEngineParser.Day, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DayFunctionCallContext(FunctionCallContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RatingEngineListener ) ((RatingEngineListener)listener).enterDayFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RatingEngineListener ) ((RatingEngineListener)listener).exitDayFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RatingEngineVisitor ) return ((RatingEngineVisitor<? extends T>)visitor).visitDayFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FloorFunctionCallContext extends FunctionCallContext {
		public TerminalNode Floor() { return getToken(RatingEngineParser.Floor, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FloorFunctionCallContext(FunctionCallContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RatingEngineListener ) ((RatingEngineListener)listener).enterFloorFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RatingEngineListener ) ((RatingEngineListener)listener).exitFloorFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RatingEngineVisitor ) return ((RatingEngineVisitor<? extends T>)visitor).visitFloorFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddDaysFunctionCallContext extends FunctionCallContext {
		public TerminalNode AddDays() { return getToken(RatingEngineParser.AddDays, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public AddDaysFunctionCallContext(FunctionCallContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RatingEngineListener ) ((RatingEngineListener)listener).enterAddDaysFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RatingEngineListener ) ((RatingEngineListener)listener).exitAddDaysFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RatingEngineVisitor ) return ((RatingEngineVisitor<? extends T>)visitor).visitAddDaysFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdentifierFunctionCallContext extends FunctionCallContext {
		public TerminalNode Identifier() { return getToken(RatingEngineParser.Identifier, 0); }
		public ExprListContext exprList() {
			return getRuleContext(ExprListContext.class,0);
		}
		public IdentifierFunctionCallContext(FunctionCallContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RatingEngineListener ) ((RatingEngineListener)listener).enterIdentifierFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RatingEngineListener ) ((RatingEngineListener)listener).exitIdentifierFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RatingEngineVisitor ) return ((RatingEngineVisitor<? extends T>)visitor).visitIdentifierFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PaddedStringFunctionCallContext extends FunctionCallContext {
		public TerminalNode PaddedString() { return getToken(RatingEngineParser.PaddedString, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public PaddedStringFunctionCallContext(FunctionCallContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RatingEngineListener ) ((RatingEngineListener)listener).enterPaddedStringFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RatingEngineListener ) ((RatingEngineListener)listener).exitPaddedStringFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RatingEngineVisitor ) return ((RatingEngineVisitor<? extends T>)visitor).visitPaddedStringFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpFunctionCallContext extends FunctionCallContext {
		public TerminalNode Exp() { return getToken(RatingEngineParser.Exp, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpFunctionCallContext(FunctionCallContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RatingEngineListener ) ((RatingEngineListener)listener).enterExpFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RatingEngineListener ) ((RatingEngineListener)listener).exitExpFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RatingEngineVisitor ) return ((RatingEngineVisitor<? extends T>)visitor).visitExpFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MinFunctionCallContext extends FunctionCallContext {
		public TerminalNode Min() { return getToken(RatingEngineParser.Min, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public MinFunctionCallContext(FunctionCallContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RatingEngineListener ) ((RatingEngineListener)listener).enterMinFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RatingEngineListener ) ((RatingEngineListener)listener).exitMinFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RatingEngineVisitor ) return ((RatingEngineVisitor<? extends T>)visitor).visitMinFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MaxFunctionCallContext extends FunctionCallContext {
		public TerminalNode Max() { return getToken(RatingEngineParser.Max, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public MaxFunctionCallContext(FunctionCallContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RatingEngineListener ) ((RatingEngineListener)listener).enterMaxFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RatingEngineListener ) ((RatingEngineListener)listener).exitMaxFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RatingEngineVisitor ) return ((RatingEngineVisitor<? extends T>)visitor).visitMaxFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RoundFunctionCallContext extends FunctionCallContext {
		public TerminalNode Rnd() { return getToken(RatingEngineParser.Rnd, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public RoundFunctionCallContext(FunctionCallContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RatingEngineListener ) ((RatingEngineListener)listener).enterRoundFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RatingEngineListener ) ((RatingEngineListener)listener).exitRoundFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RatingEngineVisitor ) return ((RatingEngineVisitor<? extends T>)visitor).visitRoundFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MonthFunctionCallContext extends FunctionCallContext {
		public TerminalNode Month() { return getToken(RatingEngineParser.Month, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public MonthFunctionCallContext(FunctionCallContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RatingEngineListener ) ((RatingEngineListener)listener).enterMonthFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RatingEngineListener ) ((RatingEngineListener)listener).exitMonthFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RatingEngineVisitor ) return ((RatingEngineVisitor<? extends T>)visitor).visitMonthFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GetDiffDaysFunctionCallContext extends FunctionCallContext {
		public TerminalNode GetDiffDays() { return getToken(RatingEngineParser.GetDiffDays, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public GetDiffDaysFunctionCallContext(FunctionCallContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RatingEngineListener ) ((RatingEngineListener)listener).enterGetDiffDaysFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RatingEngineListener ) ((RatingEngineListener)listener).exitGetDiffDaysFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RatingEngineVisitor ) return ((RatingEngineVisitor<? extends T>)visitor).visitGetDiffDaysFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CeilFunctionCallContext extends FunctionCallContext {
		public TerminalNode Ceil() { return getToken(RatingEngineParser.Ceil, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public CeilFunctionCallContext(FunctionCallContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RatingEngineListener ) ((RatingEngineListener)listener).enterCeilFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RatingEngineListener ) ((RatingEngineListener)listener).exitCeilFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RatingEngineVisitor ) return ((RatingEngineVisitor<? extends T>)visitor).visitCeilFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SubstrFunctionCallContext extends FunctionCallContext {
		public TerminalNode Substr() { return getToken(RatingEngineParser.Substr, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public SubstrFunctionCallContext(FunctionCallContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RatingEngineListener ) ((RatingEngineListener)listener).enterSubstrFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RatingEngineListener ) ((RatingEngineListener)listener).exitSubstrFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RatingEngineVisitor ) return ((RatingEngineVisitor<? extends T>)visitor).visitSubstrFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_functionCall);
		int _la;
		try {
			setState(128);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Max:
				_localctx = new MaxFunctionCallContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(34);
				match(Max);
				setState(35);
				match(T__0);
				setState(36);
				expression(0);
				setState(37);
				match(T__2);
				setState(38);
				expression(0);
				setState(39);
				match(T__1);
				}
				break;
			case Min:
				_localctx = new MinFunctionCallContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(41);
				match(Min);
				setState(42);
				match(T__0);
				setState(43);
				expression(0);
				setState(44);
				match(T__2);
				setState(45);
				expression(0);
				setState(46);
				match(T__1);
				}
				break;
			case Rnd:
				_localctx = new RoundFunctionCallContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(48);
				match(Rnd);
				setState(49);
				match(T__0);
				setState(50);
				expression(0);
				setState(51);
				match(T__2);
				setState(52);
				expression(0);
				setState(53);
				match(T__1);
				}
				break;
			case Ceil:
				_localctx = new CeilFunctionCallContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(55);
				match(Ceil);
				setState(56);
				match(T__0);
				setState(57);
				expression(0);
				setState(58);
				match(T__1);
				}
				break;
			case Floor:
				_localctx = new FloorFunctionCallContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(60);
				match(Floor);
				setState(61);
				match(T__0);
				setState(62);
				expression(0);
				setState(63);
				match(T__1);
				}
				break;
			case Exp:
				_localctx = new ExpFunctionCallContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(65);
				match(Exp);
				setState(66);
				match(T__0);
				setState(67);
				expression(0);
				setState(68);
				match(T__1);
				}
				break;
			case Day:
				_localctx = new DayFunctionCallContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(70);
				match(Day);
				setState(71);
				match(T__0);
				setState(72);
				expression(0);
				setState(73);
				match(T__1);
				}
				break;
			case Month:
				_localctx = new MonthFunctionCallContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(75);
				match(Month);
				setState(76);
				match(T__0);
				setState(77);
				expression(0);
				setState(78);
				match(T__1);
				}
				break;
			case Year:
				_localctx = new YearFunctionCallContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(80);
				match(Year);
				setState(81);
				match(T__0);
				setState(82);
				expression(0);
				setState(83);
				match(T__1);
				}
				break;
			case Substr:
				_localctx = new SubstrFunctionCallContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(85);
				match(Substr);
				setState(86);
				match(T__0);
				setState(87);
				expression(0);
				setState(88);
				match(T__2);
				setState(89);
				expression(0);
				setState(90);
				match(T__2);
				setState(91);
				expression(0);
				setState(92);
				match(T__1);
				}
				break;
			case AddDays:
				_localctx = new AddDaysFunctionCallContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(94);
				match(AddDays);
				setState(95);
				match(T__0);
				setState(96);
				expression(0);
				setState(97);
				match(T__2);
				setState(98);
				expression(0);
				setState(99);
				match(T__1);
				}
				break;
			case GetDiffDays:
				_localctx = new GetDiffDaysFunctionCallContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(101);
				match(GetDiffDays);
				setState(102);
				match(T__0);
				setState(103);
				expression(0);
				setState(104);
				match(T__2);
				setState(105);
				expression(0);
				setState(106);
				match(T__1);
				}
				break;
			case PaddedString:
				_localctx = new PaddedStringFunctionCallContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(108);
				match(PaddedString);
				setState(109);
				match(T__0);
				setState(110);
				expression(0);
				setState(111);
				match(T__2);
				setState(112);
				expression(0);
				setState(113);
				match(T__1);
				}
				break;
			case DifferenceInMonths:
				_localctx = new DifferenceInMonthsFunctionCallContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(115);
				match(DifferenceInMonths);
				setState(116);
				match(T__0);
				setState(117);
				expression(0);
				setState(118);
				match(T__2);
				setState(119);
				expression(0);
				setState(120);
				match(T__1);
				}
				break;
			case Identifier:
				_localctx = new IdentifierFunctionCallContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(122);
				match(Identifier);
				setState(123);
				match(T__0);
				setState(125);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << Max) | (1L << Min) | (1L << Rnd) | (1L << Ceil) | (1L << Floor) | (1L << Exp) | (1L << Year) | (1L << Month) | (1L << Day) | (1L << Substr) | (1L << AddDays) | (1L << GetDiffDays) | (1L << PaddedString) | (1L << DifferenceInMonths) | (1L << Excl) | (1L << Subtract) | (1L << Bool) | (1L << Number) | (1L << Identifier) | (1L << String))) != 0)) {
					{
					setState(124);
					exprList();
					}
				}

				setState(127);
				match(T__1);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfStatementContext extends ParserRuleContext {
		public IfStatContext ifStat() {
			return getRuleContext(IfStatContext.class,0);
		}
		public TerminalNode End() { return getToken(RatingEngineParser.End, 0); }
		public List<ElseIfStatContext> elseIfStat() {
			return getRuleContexts(ElseIfStatContext.class);
		}
		public ElseIfStatContext elseIfStat(int i) {
			return getRuleContext(ElseIfStatContext.class,i);
		}
		public ElseStatContext elseStat() {
			return getRuleContext(ElseStatContext.class,0);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RatingEngineListener ) ((RatingEngineListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RatingEngineListener ) ((RatingEngineListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RatingEngineVisitor ) return ((RatingEngineVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_ifStatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			ifStat();
			setState(134);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(131);
					elseIfStat();
					}
					} 
				}
				setState(136);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			setState(138);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Else) {
				{
				setState(137);
				elseStat();
				}
			}

			setState(140);
			match(End);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfStatContext extends ParserRuleContext {
		public TerminalNode If() { return getToken(RatingEngineParser.If, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Then() { return getToken(RatingEngineParser.Then, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public IfStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RatingEngineListener ) ((RatingEngineListener)listener).enterIfStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RatingEngineListener ) ((RatingEngineListener)listener).exitIfStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RatingEngineVisitor ) return ((RatingEngineVisitor<? extends T>)visitor).visitIfStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatContext ifStat() throws RecognitionException {
		IfStatContext _localctx = new IfStatContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_ifStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			match(If);
			setState(143);
			match(T__0);
			setState(144);
			expression(0);
			setState(145);
			match(T__1);
			setState(146);
			match(Then);
			setState(147);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElseIfStatContext extends ParserRuleContext {
		public TerminalNode Else() { return getToken(RatingEngineParser.Else, 0); }
		public TerminalNode If() { return getToken(RatingEngineParser.If, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Then() { return getToken(RatingEngineParser.Then, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ElseIfStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseIfStat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RatingEngineListener ) ((RatingEngineListener)listener).enterElseIfStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RatingEngineListener ) ((RatingEngineListener)listener).exitElseIfStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RatingEngineVisitor ) return ((RatingEngineVisitor<? extends T>)visitor).visitElseIfStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseIfStatContext elseIfStat() throws RecognitionException {
		ElseIfStatContext _localctx = new ElseIfStatContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_elseIfStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			match(Else);
			setState(150);
			match(If);
			setState(151);
			match(T__0);
			setState(152);
			expression(0);
			setState(153);
			match(T__1);
			setState(154);
			match(Then);
			setState(155);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElseStatContext extends ParserRuleContext {
		public TerminalNode Else() { return getToken(RatingEngineParser.Else, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ElseStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseStat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RatingEngineListener ) ((RatingEngineListener)listener).enterElseStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RatingEngineListener ) ((RatingEngineListener)listener).exitElseStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RatingEngineVisitor ) return ((RatingEngineVisitor<? extends T>)visitor).visitElseStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseStatContext elseStat() throws RecognitionException {
		ElseStatContext _localctx = new ElseStatContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_elseStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			match(Else);
			setState(158);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExprListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RatingEngineListener ) ((RatingEngineListener)listener).enterExprList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RatingEngineListener ) ((RatingEngineListener)listener).exitExprList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RatingEngineVisitor ) return ((RatingEngineVisitor<? extends T>)visitor).visitExprList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprListContext exprList() throws RecognitionException {
		ExprListContext _localctx = new ExprListContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_exprList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			expression(0);
			setState(165);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(161);
				match(T__2);
				setState(162);
				expression(0);
				}
				}
				setState(167);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LtExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode LT() { return getToken(RatingEngineParser.LT, 0); }
		public LtExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RatingEngineListener ) ((RatingEngineListener)listener).enterLtExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RatingEngineListener ) ((RatingEngineListener)listener).exitLtExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RatingEngineVisitor ) return ((RatingEngineVisitor<? extends T>)visitor).visitLtExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GtExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode GT() { return getToken(RatingEngineParser.GT, 0); }
		public GtExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RatingEngineListener ) ((RatingEngineListener)listener).enterGtExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RatingEngineListener ) ((RatingEngineListener)listener).exitGtExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RatingEngineVisitor ) return ((RatingEngineVisitor<? extends T>)visitor).visitGtExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolExpressionContext extends ExpressionContext {
		public TerminalNode Bool() { return getToken(RatingEngineParser.Bool, 0); }
		public BoolExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RatingEngineListener ) ((RatingEngineListener)listener).enterBoolExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RatingEngineListener ) ((RatingEngineListener)listener).exitBoolExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RatingEngineVisitor ) return ((RatingEngineVisitor<? extends T>)visitor).visitBoolExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NotEqExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode NEquals() { return getToken(RatingEngineParser.NEquals, 0); }
		public NotEqExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RatingEngineListener ) ((RatingEngineListener)listener).enterNotEqExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RatingEngineListener ) ((RatingEngineListener)listener).exitNotEqExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RatingEngineVisitor ) return ((RatingEngineVisitor<? extends T>)visitor).visitNotEqExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ModuloExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode Mod() { return getToken(RatingEngineParser.Mod, 0); }
		public ModuloExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RatingEngineListener ) ((RatingEngineListener)listener).enterModuloExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RatingEngineListener ) ((RatingEngineListener)listener).exitModuloExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RatingEngineVisitor ) return ((RatingEngineVisitor<? extends T>)visitor).visitModuloExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumberExpressionContext extends ExpressionContext {
		public TerminalNode Number() { return getToken(RatingEngineParser.Number, 0); }
		public NumberExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RatingEngineListener ) ((RatingEngineListener)listener).enterNumberExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RatingEngineListener ) ((RatingEngineListener)listener).exitNumberExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RatingEngineVisitor ) return ((RatingEngineVisitor<? extends T>)visitor).visitNumberExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdentifierExpressionContext extends ExpressionContext {
		public TerminalNode Identifier() { return getToken(RatingEngineParser.Identifier, 0); }
		public IdentifierExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RatingEngineListener ) ((RatingEngineListener)listener).enterIdentifierExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RatingEngineListener ) ((RatingEngineListener)listener).exitIdentifierExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RatingEngineVisitor ) return ((RatingEngineVisitor<? extends T>)visitor).visitIdentifierExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NotExpressionContext extends ExpressionContext {
		public TerminalNode Excl() { return getToken(RatingEngineParser.Excl, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NotExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RatingEngineListener ) ((RatingEngineListener)listener).enterNotExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RatingEngineListener ) ((RatingEngineListener)listener).exitNotExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RatingEngineVisitor ) return ((RatingEngineVisitor<? extends T>)visitor).visitNotExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultiplyExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode Multiply() { return getToken(RatingEngineParser.Multiply, 0); }
		public MultiplyExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RatingEngineListener ) ((RatingEngineListener)listener).enterMultiplyExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RatingEngineListener ) ((RatingEngineListener)listener).exitMultiplyExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RatingEngineVisitor ) return ((RatingEngineVisitor<? extends T>)visitor).visitMultiplyExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GtEqExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode GTEquals() { return getToken(RatingEngineParser.GTEquals, 0); }
		public GtEqExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RatingEngineListener ) ((RatingEngineListener)listener).enterGtEqExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RatingEngineListener ) ((RatingEngineListener)listener).exitGtEqExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RatingEngineVisitor ) return ((RatingEngineVisitor<? extends T>)visitor).visitGtEqExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DivideExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode Divide() { return getToken(RatingEngineParser.Divide, 0); }
		public DivideExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RatingEngineListener ) ((RatingEngineListener)listener).enterDivideExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RatingEngineListener ) ((RatingEngineListener)listener).exitDivideExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RatingEngineVisitor ) return ((RatingEngineVisitor<? extends T>)visitor).visitDivideExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OrExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode Or() { return getToken(RatingEngineParser.Or, 0); }
		public OrExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RatingEngineListener ) ((RatingEngineListener)listener).enterOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RatingEngineListener ) ((RatingEngineListener)listener).exitOrExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RatingEngineVisitor ) return ((RatingEngineVisitor<? extends T>)visitor).visitOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnaryMinusExpressionContext extends ExpressionContext {
		public TerminalNode Subtract() { return getToken(RatingEngineParser.Subtract, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public UnaryMinusExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RatingEngineListener ) ((RatingEngineListener)listener).enterUnaryMinusExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RatingEngineListener ) ((RatingEngineListener)listener).exitUnaryMinusExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RatingEngineVisitor ) return ((RatingEngineVisitor<? extends T>)visitor).visitUnaryMinusExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PowerExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode Pow() { return getToken(RatingEngineParser.Pow, 0); }
		public PowerExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RatingEngineListener ) ((RatingEngineListener)listener).enterPowerExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RatingEngineListener ) ((RatingEngineListener)listener).exitPowerExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RatingEngineVisitor ) return ((RatingEngineVisitor<? extends T>)visitor).visitPowerExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EqExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode Equals() { return getToken(RatingEngineParser.Equals, 0); }
		public EqExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RatingEngineListener ) ((RatingEngineListener)listener).enterEqExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RatingEngineListener ) ((RatingEngineListener)listener).exitEqExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RatingEngineVisitor ) return ((RatingEngineVisitor<? extends T>)visitor).visitEqExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AndExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode And() { return getToken(RatingEngineParser.And, 0); }
		public AndExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RatingEngineListener ) ((RatingEngineListener)listener).enterAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RatingEngineListener ) ((RatingEngineListener)listener).exitAndExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RatingEngineVisitor ) return ((RatingEngineVisitor<? extends T>)visitor).visitAndExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringExpressionContext extends ExpressionContext {
		public TerminalNode String() { return getToken(RatingEngineParser.String, 0); }
		public StringExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RatingEngineListener ) ((RatingEngineListener)listener).enterStringExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RatingEngineListener ) ((RatingEngineListener)listener).exitStringExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RatingEngineVisitor ) return ((RatingEngineVisitor<? extends T>)visitor).visitStringExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpressionExpressionContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RatingEngineListener ) ((RatingEngineListener)listener).enterExpressionExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RatingEngineListener ) ((RatingEngineListener)listener).exitExpressionExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RatingEngineVisitor ) return ((RatingEngineVisitor<? extends T>)visitor).visitExpressionExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode Add() { return getToken(RatingEngineParser.Add, 0); }
		public AddExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RatingEngineListener ) ((RatingEngineListener)listener).enterAddExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RatingEngineListener ) ((RatingEngineListener)listener).exitAddExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RatingEngineVisitor ) return ((RatingEngineVisitor<? extends T>)visitor).visitAddExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SubtractExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode Subtract() { return getToken(RatingEngineParser.Subtract, 0); }
		public SubtractExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RatingEngineListener ) ((RatingEngineListener)listener).enterSubtractExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RatingEngineListener ) ((RatingEngineListener)listener).exitSubtractExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RatingEngineVisitor ) return ((RatingEngineVisitor<? extends T>)visitor).visitSubtractExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunctionCallExpressionContext extends ExpressionContext {
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public FunctionCallExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RatingEngineListener ) ((RatingEngineListener)listener).enterFunctionCallExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RatingEngineListener ) ((RatingEngineListener)listener).exitFunctionCallExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RatingEngineVisitor ) return ((RatingEngineVisitor<? extends T>)visitor).visitFunctionCallExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LtEqExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode LTEquals() { return getToken(RatingEngineParser.LTEquals, 0); }
		public LtEqExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RatingEngineListener ) ((RatingEngineListener)listener).enterLtEqExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RatingEngineListener ) ((RatingEngineListener)listener).exitLtEqExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RatingEngineVisitor ) return ((RatingEngineVisitor<? extends T>)visitor).visitLtEqExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				_localctx = new UnaryMinusExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(169);
				match(Subtract);
				setState(170);
				expression(22);
				}
				break;
			case 2:
				{
				_localctx = new NotExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(171);
				match(Excl);
				setState(172);
				expression(21);
				}
				break;
			case 3:
				{
				_localctx = new NumberExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(173);
				match(Number);
				}
				break;
			case 4:
				{
				_localctx = new BoolExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(174);
				match(Bool);
				}
				break;
			case 5:
				{
				_localctx = new FunctionCallExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(175);
				functionCall();
				}
				break;
			case 6:
				{
				_localctx = new IdentifierExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(176);
				match(Identifier);
				}
				break;
			case 7:
				{
				_localctx = new StringExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(177);
				match(String);
				}
				break;
			case 8:
				{
				_localctx = new ExpressionExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(178);
				match(T__0);
				setState(179);
				expression(0);
				setState(180);
				match(T__1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(228);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(226);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						_localctx = new PowerExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(184);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(185);
						match(Pow);
						setState(186);
						expression(21);
						}
						break;
					case 2:
						{
						_localctx = new MultiplyExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(187);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(188);
						match(Multiply);
						setState(189);
						expression(20);
						}
						break;
					case 3:
						{
						_localctx = new DivideExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(190);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(191);
						match(Divide);
						setState(192);
						expression(19);
						}
						break;
					case 4:
						{
						_localctx = new AddExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(193);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(194);
						match(Add);
						setState(195);
						expression(18);
						}
						break;
					case 5:
						{
						_localctx = new SubtractExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(196);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(197);
						match(Subtract);
						setState(198);
						expression(17);
						}
						break;
					case 6:
						{
						_localctx = new GtEqExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(199);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(200);
						match(GTEquals);
						setState(201);
						expression(16);
						}
						break;
					case 7:
						{
						_localctx = new LtEqExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(202);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(203);
						match(LTEquals);
						setState(204);
						expression(15);
						}
						break;
					case 8:
						{
						_localctx = new GtExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(205);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(206);
						match(GT);
						setState(207);
						expression(14);
						}
						break;
					case 9:
						{
						_localctx = new LtExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(208);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(209);
						match(LT);
						setState(210);
						expression(13);
						}
						break;
					case 10:
						{
						_localctx = new EqExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(211);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(212);
						match(Equals);
						setState(213);
						expression(12);
						}
						break;
					case 11:
						{
						_localctx = new NotEqExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(214);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(215);
						match(NEquals);
						setState(216);
						expression(11);
						}
						break;
					case 12:
						{
						_localctx = new AndExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(217);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(218);
						match(And);
						setState(219);
						expression(10);
						}
						break;
					case 13:
						{
						_localctx = new OrExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(220);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(221);
						match(Or);
						setState(222);
						expression(9);
						}
						break;
					case 14:
						{
						_localctx = new ModuloExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(223);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(224);
						match(Mod);
						setState(225);
						expression(8);
						}
						break;
					}
					} 
				}
				setState(230);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 9:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 20);
		case 1:
			return precpred(_ctx, 19);
		case 2:
			return precpred(_ctx, 18);
		case 3:
			return precpred(_ctx, 17);
		case 4:
			return precpred(_ctx, 16);
		case 5:
			return precpred(_ctx, 15);
		case 6:
			return precpred(_ctx, 14);
		case 7:
			return precpred(_ctx, 13);
		case 8:
			return precpred(_ctx, 12);
		case 9:
			return precpred(_ctx, 11);
		case 10:
			return precpred(_ctx, 10);
		case 11:
			return precpred(_ctx, 9);
		case 12:
			return precpred(_ctx, 8);
		case 13:
			return precpred(_ctx, 7);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3E\u00ea\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\3\2\3\2\3\2\3\3\3\3\3\3\3\3\5\3\36\n\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\5\5\u0080\n\5\3\5\5\5\u0083\n\5\3\6\3\6\7\6\u0087\n\6\f\6\16\6"+
		"\u008a\13\6\3\6\5\6\u008d\n\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\7\n\u00a6\n\n\f\n"+
		"\16\n\u00a9\13\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\5\13\u00b9\n\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u00e5\n\13\f\13\16\13\u00e8\13\13"+
		"\3\13\2\3\24\f\2\4\6\b\n\f\16\20\22\24\2\2\2\u0108\2\26\3\2\2\2\4\35\3"+
		"\2\2\2\6\37\3\2\2\2\b\u0082\3\2\2\2\n\u0084\3\2\2\2\f\u0090\3\2\2\2\16"+
		"\u0097\3\2\2\2\20\u009f\3\2\2\2\22\u00a2\3\2\2\2\24\u00b8\3\2\2\2\26\27"+
		"\5\4\3\2\27\30\7\2\2\3\30\3\3\2\2\2\31\36\5\n\6\2\32\33\7\t\2\2\33\36"+
		"\5\24\13\2\34\36\5\6\4\2\35\31\3\2\2\2\35\32\3\2\2\2\35\34\3\2\2\2\36"+
		"\5\3\2\2\2\37 \7\27\2\2 !\7\3\2\2!\"\5\24\13\2\"#\7\4\2\2#\7\3\2\2\2$"+
		"%\7\r\2\2%&\7\3\2\2&\'\5\24\13\2\'(\7\5\2\2()\5\24\13\2)*\7\4\2\2*\u0083"+
		"\3\2\2\2+,\7\16\2\2,-\7\3\2\2-.\5\24\13\2./\7\5\2\2/\60\5\24\13\2\60\61"+
		"\7\4\2\2\61\u0083\3\2\2\2\62\63\7\17\2\2\63\64\7\3\2\2\64\65\5\24\13\2"+
		"\65\66\7\5\2\2\66\67\5\24\13\2\678\7\4\2\28\u0083\3\2\2\29:\7\20\2\2:"+
		";\7\3\2\2;<\5\24\13\2<=\7\4\2\2=\u0083\3\2\2\2>?\7\21\2\2?@\7\3\2\2@A"+
		"\5\24\13\2AB\7\4\2\2B\u0083\3\2\2\2CD\7\22\2\2DE\7\3\2\2EF\5\24\13\2F"+
		"G\7\4\2\2G\u0083\3\2\2\2HI\7\25\2\2IJ\7\3\2\2JK\5\24\13\2KL\7\4\2\2L\u0083"+
		"\3\2\2\2MN\7\24\2\2NO\7\3\2\2OP\5\24\13\2PQ\7\4\2\2Q\u0083\3\2\2\2RS\7"+
		"\23\2\2ST\7\3\2\2TU\5\24\13\2UV\7\4\2\2V\u0083\3\2\2\2WX\7\26\2\2XY\7"+
		"\3\2\2YZ\5\24\13\2Z[\7\5\2\2[\\\5\24\13\2\\]\7\5\2\2]^\5\24\13\2^_\7\4"+
		"\2\2_\u0083\3\2\2\2`a\7\31\2\2ab\7\3\2\2bc\5\24\13\2cd\7\5\2\2de\5\24"+
		"\13\2ef\7\4\2\2f\u0083\3\2\2\2gh\7\32\2\2hi\7\3\2\2ij\5\24\13\2jk\7\5"+
		"\2\2kl\5\24\13\2lm\7\4\2\2m\u0083\3\2\2\2no\7\33\2\2op\7\3\2\2pq\5\24"+
		"\13\2qr\7\5\2\2rs\5\24\13\2st\7\4\2\2t\u0083\3\2\2\2uv\7\34\2\2vw\7\3"+
		"\2\2wx\5\24\13\2xy\7\5\2\2yz\5\24\13\2z{\7\4\2\2{\u0083\3\2\2\2|}\7@\2"+
		"\2}\177\7\3\2\2~\u0080\5\22\n\2\177~\3\2\2\2\177\u0080\3\2\2\2\u0080\u0081"+
		"\3\2\2\2\u0081\u0083\7\4\2\2\u0082$\3\2\2\2\u0082+\3\2\2\2\u0082\62\3"+
		"\2\2\2\u00829\3\2\2\2\u0082>\3\2\2\2\u0082C\3\2\2\2\u0082H\3\2\2\2\u0082"+
		"M\3\2\2\2\u0082R\3\2\2\2\u0082W\3\2\2\2\u0082`\3\2\2\2\u0082g\3\2\2\2"+
		"\u0082n\3\2\2\2\u0082u\3\2\2\2\u0082|\3\2\2\2\u0083\t\3\2\2\2\u0084\u0088"+
		"\5\f\7\2\u0085\u0087\5\16\b\2\u0086\u0085\3\2\2\2\u0087\u008a\3\2\2\2"+
		"\u0088\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008c\3\2\2\2\u008a\u0088"+
		"\3\2\2\2\u008b\u008d\5\20\t\2\u008c\u008b\3\2\2\2\u008c\u008d\3\2\2\2"+
		"\u008d\u008e\3\2\2\2\u008e\u008f\7\n\2\2\u008f\13\3\2\2\2\u0090\u0091"+
		"\7\6\2\2\u0091\u0092\7\3\2\2\u0092\u0093\5\24\13\2\u0093\u0094\7\4\2\2"+
		"\u0094\u0095\7\7\2\2\u0095\u0096\5\4\3\2\u0096\r\3\2\2\2\u0097\u0098\7"+
		"\b\2\2\u0098\u0099\7\6\2\2\u0099\u009a\7\3\2\2\u009a\u009b\5\24\13\2\u009b"+
		"\u009c\7\4\2\2\u009c\u009d\7\7\2\2\u009d\u009e\5\4\3\2\u009e\17\3\2\2"+
		"\2\u009f\u00a0\7\b\2\2\u00a0\u00a1\5\4\3\2\u00a1\21\3\2\2\2\u00a2\u00a7"+
		"\5\24\13\2\u00a3\u00a4\7\5\2\2\u00a4\u00a6\5\24\13\2\u00a5\u00a3\3\2\2"+
		"\2\u00a6\u00a9\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\23"+
		"\3\2\2\2\u00a9\u00a7\3\2\2\2\u00aa\u00ab\b\13\1\2\u00ab\u00ac\7:\2\2\u00ac"+
		"\u00b9\5\24\13\30\u00ad\u00ae\7\66\2\2\u00ae\u00b9\5\24\13\27\u00af\u00b9"+
		"\7?\2\2\u00b0\u00b9\7>\2\2\u00b1\u00b9\5\b\5\2\u00b2\u00b9\7@\2\2\u00b3"+
		"\u00b9\7A\2\2\u00b4\u00b5\7\3\2\2\u00b5\u00b6\5\24\13\2\u00b6\u00b7\7"+
		"\4\2\2\u00b7\u00b9\3\2\2\2\u00b8\u00aa\3\2\2\2\u00b8\u00ad\3\2\2\2\u00b8"+
		"\u00af\3\2\2\2\u00b8\u00b0\3\2\2\2\u00b8\u00b1\3\2\2\2\u00b8\u00b2\3\2"+
		"\2\2\u00b8\u00b3\3\2\2\2\u00b8\u00b4\3\2\2\2\u00b9\u00e6\3\2\2\2\u00ba"+
		"\u00bb\f\26\2\2\u00bb\u00bc\7\65\2\2\u00bc\u00e5\5\24\13\27\u00bd\u00be"+
		"\f\25\2\2\u00be\u00bf\7;\2\2\u00bf\u00e5\5\24\13\26\u00c0\u00c1\f\24\2"+
		"\2\u00c1\u00c2\7<\2\2\u00c2\u00e5\5\24\13\25\u00c3\u00c4\f\23\2\2\u00c4"+
		"\u00c5\79\2\2\u00c5\u00e5\5\24\13\24\u00c6\u00c7\f\22\2\2\u00c7\u00c8"+
		"\7:\2\2\u00c8\u00e5\5\24\13\23\u00c9\u00ca\f\21\2\2\u00ca\u00cb\7\63\2"+
		"\2\u00cb\u00e5\5\24\13\22\u00cc\u00cd\f\20\2\2\u00cd\u00ce\7\64\2\2\u00ce"+
		"\u00e5\5\24\13\21\u00cf\u00d0\f\17\2\2\u00d0\u00d1\7\67\2\2\u00d1\u00e5"+
		"\5\24\13\20\u00d2\u00d3\f\16\2\2\u00d3\u00d4\78\2\2\u00d4\u00e5\5\24\13"+
		"\17\u00d5\u00d6\f\r\2\2\u00d6\u00d7\7\61\2\2\u00d7\u00e5\5\24\13\16\u00d8"+
		"\u00d9\f\f\2\2\u00d9\u00da\7\62\2\2\u00da\u00e5\5\24\13\r\u00db\u00dc"+
		"\f\13\2\2\u00dc\u00dd\7\f\2\2\u00dd\u00e5\5\24\13\f\u00de\u00df\f\n\2"+
		"\2\u00df\u00e0\7\13\2\2\u00e0\u00e5\5\24\13\13\u00e1\u00e2\f\t\2\2\u00e2"+
		"\u00e3\7\30\2\2\u00e3\u00e5\5\24\13\n\u00e4\u00ba\3\2\2\2\u00e4\u00bd"+
		"\3\2\2\2\u00e4\u00c0\3\2\2\2\u00e4\u00c3\3\2\2\2\u00e4\u00c6\3\2\2\2\u00e4"+
		"\u00c9\3\2\2\2\u00e4\u00cc\3\2\2\2\u00e4\u00cf\3\2\2\2\u00e4\u00d2\3\2"+
		"\2\2\u00e4\u00d5\3\2\2\2\u00e4\u00d8\3\2\2\2\u00e4\u00db\3\2\2\2\u00e4"+
		"\u00de\3\2\2\2\u00e4\u00e1\3\2\2\2\u00e5\u00e8\3\2\2\2\u00e6\u00e4\3\2"+
		"\2\2\u00e6\u00e7\3\2\2\2\u00e7\25\3\2\2\2\u00e8\u00e6\3\2\2\2\13\35\177"+
		"\u0082\u0088\u008c\u00a7\u00b8\u00e4\u00e6";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}