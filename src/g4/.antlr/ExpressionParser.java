// Generated from c:\Users\15307\Desktop\MiniJava_Compiler\src\g4\Expression.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ExpressionParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Integer=1, TRUE=2, FALSE=3, IDENTIFIER=4, THIS=5, NEW=6, INT=7, LBRACK=8, 
		RBRACK=9, LPAREN=10, RPAREN=11, BANG=12, AND=13, LT=14, ADD=15, SUB=16, 
		MUL=17, DOT=18, LENGTH=19, COMMA=20;
	public static final int
		RULE_expression = 0;
	public static final String[] ruleNames = {
		"expression"
	};

	private static final String[] _LITERAL_NAMES = {
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "Integer", "TRUE", "FALSE", "IDENTIFIER", "THIS", "NEW", "INT", 
		"LBRACK", "RBRACK", "LPAREN", "RPAREN", "BANG", "AND", "LT", "ADD", "SUB", 
		"MUL", "DOT", "LENGTH", "COMMA"
	};
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
	public String getGrammarFileName() { return "Expression.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ExpressionParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ExpressionContext extends ParserRuleContext {
		public TerminalNode Integer() { return getToken(ExpressionParser.Integer, 0); }
		public TerminalNode TRUE() { return getToken(ExpressionParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(ExpressionParser.FALSE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(ExpressionParser.IDENTIFIER, 0); }
		public TerminalNode THIS() { return getToken(ExpressionParser.THIS, 0); }
		public TerminalNode NEW() { return getToken(ExpressionParser.NEW, 0); }
		public TerminalNode INT() { return getToken(ExpressionParser.INT, 0); }
		public TerminalNode LBRACK() { return getToken(ExpressionParser.LBRACK, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode RBRACK() { return getToken(ExpressionParser.RBRACK, 0); }
		public TerminalNode LPAREN() { return getToken(ExpressionParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(ExpressionParser.RPAREN, 0); }
		public TerminalNode BANG() { return getToken(ExpressionParser.BANG, 0); }
		public TerminalNode AND() { return getToken(ExpressionParser.AND, 0); }
		public TerminalNode LT() { return getToken(ExpressionParser.LT, 0); }
		public TerminalNode ADD() { return getToken(ExpressionParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(ExpressionParser.SUB, 0); }
		public TerminalNode MUL() { return getToken(ExpressionParser.MUL, 0); }
		public TerminalNode DOT() { return getToken(ExpressionParser.DOT, 0); }
		public TerminalNode LENGTH() { return getToken(ExpressionParser.LENGTH, 0); }
		public List<TerminalNode> COMMA() { return getTokens(ExpressionParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ExpressionParser.COMMA, i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 0;
		enterRecursionRule(_localctx, 0, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(3);
				match(Integer);
				}
				break;
			case 2:
				{
				setState(4);
				match(TRUE);
				}
				break;
			case 3:
				{
				setState(5);
				match(FALSE);
				}
				break;
			case 4:
				{
				setState(6);
				match(IDENTIFIER);
				}
				break;
			case 5:
				{
				setState(7);
				match(THIS);
				}
				break;
			case 6:
				{
				setState(8);
				match(NEW);
				setState(9);
				match(INT);
				setState(10);
				match(LBRACK);
				setState(11);
				expression(0);
				setState(12);
				match(RBRACK);
				}
				break;
			case 7:
				{
				setState(14);
				match(NEW);
				setState(15);
				match(IDENTIFIER);
				setState(16);
				match(LPAREN);
				setState(17);
				match(RPAREN);
				}
				break;
			case 8:
				{
				setState(18);
				match(BANG);
				setState(19);
				expression(2);
				}
				break;
			case 9:
				{
				setState(20);
				match(LPAREN);
				setState(21);
				expression(0);
				setState(22);
				match(RPAREN);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(54);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(52);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(26);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(27);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AND) | (1L << LT) | (1L << ADD) | (1L << SUB) | (1L << MUL))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(28);
						expression(14);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(29);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(30);
						match(LBRACK);
						setState(31);
						expression(0);
						setState(32);
						match(RBRACK);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(34);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(35);
						match(DOT);
						setState(36);
						match(LENGTH);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(37);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(38);
						match(DOT);
						setState(39);
						match(IDENTIFIER);
						setState(40);
						match(LPAREN);
						setState(49);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Integer) | (1L << TRUE) | (1L << FALSE) | (1L << IDENTIFIER) | (1L << THIS) | (1L << NEW) | (1L << LPAREN) | (1L << BANG))) != 0)) {
							{
							setState(41);
							expression(0);
							setState(46);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==COMMA) {
								{
								{
								setState(42);
								match(COMMA);
								setState(43);
								expression(0);
								}
								}
								setState(48);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							}
						}

						setState(51);
						match(RPAREN);
						}
						break;
					}
					} 
				}
				setState(56);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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
		case 0:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 13);
		case 1:
			return precpred(_ctx, 12);
		case 2:
			return precpred(_ctx, 11);
		case 3:
			return precpred(_ctx, 10);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\26<\4\2\t\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\5\2\33\n\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\7\2/\n\2\f\2\16\2\62\13\2\5\2\64\n\2\3\2\7"+
		"\2\67\n\2\f\2\16\2:\13\2\3\2\2\3\2\3\2\2\3\3\2\17\23\2H\2\32\3\2\2\2\4"+
		"\5\b\2\1\2\5\33\7\3\2\2\6\33\7\4\2\2\7\33\7\5\2\2\b\33\7\6\2\2\t\33\7"+
		"\7\2\2\n\13\7\b\2\2\13\f\7\t\2\2\f\r\7\n\2\2\r\16\5\2\2\2\16\17\7\13\2"+
		"\2\17\33\3\2\2\2\20\21\7\b\2\2\21\22\7\6\2\2\22\23\7\f\2\2\23\33\7\r\2"+
		"\2\24\25\7\16\2\2\25\33\5\2\2\4\26\27\7\f\2\2\27\30\5\2\2\2\30\31\7\r"+
		"\2\2\31\33\3\2\2\2\32\4\3\2\2\2\32\6\3\2\2\2\32\7\3\2\2\2\32\b\3\2\2\2"+
		"\32\t\3\2\2\2\32\n\3\2\2\2\32\20\3\2\2\2\32\24\3\2\2\2\32\26\3\2\2\2\33"+
		"8\3\2\2\2\34\35\f\17\2\2\35\36\t\2\2\2\36\67\5\2\2\20\37 \f\16\2\2 !\7"+
		"\n\2\2!\"\5\2\2\2\"#\7\13\2\2#\67\3\2\2\2$%\f\r\2\2%&\7\24\2\2&\67\7\25"+
		"\2\2\'(\f\f\2\2()\7\24\2\2)*\7\6\2\2*\63\7\f\2\2+\60\5\2\2\2,-\7\26\2"+
		"\2-/\5\2\2\2.,\3\2\2\2/\62\3\2\2\2\60.\3\2\2\2\60\61\3\2\2\2\61\64\3\2"+
		"\2\2\62\60\3\2\2\2\63+\3\2\2\2\63\64\3\2\2\2\64\65\3\2\2\2\65\67\7\r\2"+
		"\2\66\34\3\2\2\2\66\37\3\2\2\2\66$\3\2\2\2\66\'\3\2\2\2\67:\3\2\2\28\66"+
		"\3\2\2\289\3\2\2\29\3\3\2\2\2:8\3\2\2\2\7\32\60\63\668";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}