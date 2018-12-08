// Generated from ./g4/MiniJava.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MiniJavaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LPAREN=1, RPAREN=2, LBRACE=3, RBRACE=4, LBRACK=5, RBRACK=6, SEMI=7, COMMA=8, 
		DOT=9, AND=10, LT=11, ADD=12, SUB=13, MUL=14, ASSIGN=15, BANG=16, CLASS=17, 
		PUBLIC=18, STATIC=19, VOID=20, MAIN=21, STRING=22, EXTENDS=23, RETURN=24, 
		INT=25, BOOLEAN=26, IF=27, ELSE=28, WHILE=29, SOP=30, LENGTH=31, TRUE=32, 
		FALSE=33, THIS=34, NEW=35, WS=36, NUMBER=37, Integer=38, ALPHABET=39, 
		DIGIT=40;
	public static final int
		RULE_goal = 0, RULE_mainClass = 1, RULE_classDeclaration = 2, RULE_varDeclaration = 3, 
		RULE_methodDeclaration = 4, RULE_type = 5, RULE_statement = 6, RULE_expression = 7, 
		RULE_identifier = 8;
	public static final String[] ruleNames = {
		"goal", "mainClass", "classDeclaration", "varDeclaration", "methodDeclaration", 
		"type", "statement", "expression", "identifier"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "')'", "'{'", "'}'", "'['", "']'", "';'", "','", "'.'", "'&&'", 
		"'<'", "'+'", "'-'", "'*'", "'='", "'!'", "'class'", "'public'", "'static'", 
		"'void'", "'main'", "'String'", "'extends'", "'return'", "'int'", "'boolean'", 
		"'if'", "'else'", "'while'", "'System.out.println'", "'length'", "'true'", 
		"'false'", "'this'", "'new'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "LPAREN", "RPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK", "SEMI", 
		"COMMA", "DOT", "AND", "LT", "ADD", "SUB", "MUL", "ASSIGN", "BANG", "CLASS", 
		"PUBLIC", "STATIC", "VOID", "MAIN", "STRING", "EXTENDS", "RETURN", "INT", 
		"BOOLEAN", "IF", "ELSE", "WHILE", "SOP", "LENGTH", "TRUE", "FALSE", "THIS", 
		"NEW", "WS", "NUMBER", "Integer", "ALPHABET", "DIGIT"
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
	public String getGrammarFileName() { return "MiniJava.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MiniJavaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class GoalContext extends ParserRuleContext {
		public MainClassContext mainClass() {
			return getRuleContext(MainClassContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(MiniJavaParser.LPAREN, 0); }
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public List<TerminalNode> RPAREN() { return getTokens(MiniJavaParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(MiniJavaParser.RPAREN, i);
		}
		public GoalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_goal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterGoal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitGoal(this);
		}
	}

	public final GoalContext goal() throws RecognitionException {
		GoalContext _localctx = new GoalContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_goal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(18);
			mainClass();
			setState(19);
			match(LPAREN);
			setState(20);
			classDeclaration();
			setState(24);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==RPAREN) {
				{
				{
				setState(21);
				match(RPAREN);
				}
				}
				setState(26);
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

	public static class MainClassContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(MiniJavaParser.CLASS, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> LBRACE() { return getTokens(MiniJavaParser.LBRACE); }
		public TerminalNode LBRACE(int i) {
			return getToken(MiniJavaParser.LBRACE, i);
		}
		public TerminalNode PUBLIC() { return getToken(MiniJavaParser.PUBLIC, 0); }
		public TerminalNode STATIC() { return getToken(MiniJavaParser.STATIC, 0); }
		public TerminalNode VOID() { return getToken(MiniJavaParser.VOID, 0); }
		public TerminalNode MAIN() { return getToken(MiniJavaParser.MAIN, 0); }
		public TerminalNode LPAREN() { return getToken(MiniJavaParser.LPAREN, 0); }
		public TerminalNode STRING() { return getToken(MiniJavaParser.STRING, 0); }
		public TerminalNode LBRACK() { return getToken(MiniJavaParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(MiniJavaParser.RBRACK, 0); }
		public TerminalNode RPAREN() { return getToken(MiniJavaParser.RPAREN, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public List<TerminalNode> RBRACE() { return getTokens(MiniJavaParser.RBRACE); }
		public TerminalNode RBRACE(int i) {
			return getToken(MiniJavaParser.RBRACE, i);
		}
		public MainClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainClass; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterMainClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitMainClass(this);
		}
	}

	public final MainClassContext mainClass() throws RecognitionException {
		MainClassContext _localctx = new MainClassContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_mainClass);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(27);
			match(CLASS);
			setState(28);
			identifier();
			setState(29);
			match(LBRACE);
			setState(30);
			match(PUBLIC);
			setState(31);
			match(STATIC);
			setState(32);
			match(VOID);
			setState(33);
			match(MAIN);
			setState(34);
			match(LPAREN);
			setState(35);
			match(STRING);
			setState(36);
			match(LBRACK);
			setState(37);
			match(RBRACK);
			setState(38);
			identifier();
			setState(39);
			match(RPAREN);
			setState(40);
			match(LBRACE);
			setState(41);
			statement();
			setState(42);
			match(RBRACE);
			setState(43);
			match(RBRACE);
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

	public static class ClassDeclarationContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(MiniJavaParser.CLASS, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> LPAREN() { return getTokens(MiniJavaParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(MiniJavaParser.LPAREN, i);
		}
		public TerminalNode EXTENDS() { return getToken(MiniJavaParser.EXTENDS, 0); }
		public TerminalNode LBRACE() { return getToken(MiniJavaParser.LBRACE, 0); }
		public VarDeclarationContext varDeclaration() {
			return getRuleContext(VarDeclarationContext.class,0);
		}
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(MiniJavaParser.RBRACE, 0); }
		public List<TerminalNode> RPAREN() { return getTokens(MiniJavaParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(MiniJavaParser.RPAREN, i);
		}
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitClassDeclaration(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_classDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			match(CLASS);
			setState(46);
			identifier();
			setState(47);
			match(LPAREN);
			setState(48);
			match(EXTENDS);
			setState(49);
			identifier();
			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RPAREN) {
				{
				setState(50);
				match(RPAREN);
				}
			}

			setState(53);
			match(LBRACE);
			setState(54);
			match(LPAREN);
			setState(55);
			varDeclaration();
			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==RPAREN) {
				{
				{
				setState(56);
				match(RPAREN);
				}
				}
				setState(61);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(62);
			match(LPAREN);
			setState(63);
			methodDeclaration();
			setState(67);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==RPAREN) {
				{
				{
				setState(64);
				match(RPAREN);
				}
				}
				setState(69);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(70);
			match(RBRACE);
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

	public static class VarDeclarationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(MiniJavaParser.SEMI, 0); }
		public VarDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterVarDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitVarDeclaration(this);
		}
	}

	public final VarDeclarationContext varDeclaration() throws RecognitionException {
		VarDeclarationContext _localctx = new VarDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_varDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			type();
			setState(73);
			identifier();
			setState(74);
			match(SEMI);
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

	public static class MethodDeclarationContext extends ParserRuleContext {
		public TerminalNode PUBLIC() { return getToken(MiniJavaParser.PUBLIC, 0); }
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> LPAREN() { return getTokens(MiniJavaParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(MiniJavaParser.LPAREN, i);
		}
		public TerminalNode COMMA() { return getToken(MiniJavaParser.COMMA, 0); }
		public List<TerminalNode> RPAREN() { return getTokens(MiniJavaParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(MiniJavaParser.RPAREN, i);
		}
		public TerminalNode LBRACE() { return getToken(MiniJavaParser.LBRACE, 0); }
		public VarDeclarationContext varDeclaration() {
			return getRuleContext(VarDeclarationContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode RETURN() { return getToken(MiniJavaParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(MiniJavaParser.SEMI, 0); }
		public TerminalNode RBRACE() { return getToken(MiniJavaParser.RBRACE, 0); }
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitMethodDeclaration(this);
		}
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_methodDeclaration);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			match(PUBLIC);
			setState(77);
			type();
			setState(78);
			identifier();
			setState(79);
			match(LPAREN);
			setState(80);
			match(LPAREN);
			setState(81);
			type();
			setState(82);
			identifier();
			setState(83);
			match(LPAREN);
			setState(84);
			match(COMMA);
			setState(85);
			type();
			setState(86);
			identifier();
			setState(90);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(87);
					match(RPAREN);
					}
					} 
				}
				setState(92);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(94);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(93);
				match(RPAREN);
				}
				break;
			}
			setState(96);
			match(RPAREN);
			setState(97);
			match(LBRACE);
			setState(98);
			match(LPAREN);
			setState(99);
			varDeclaration();
			setState(103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==RPAREN) {
				{
				{
				setState(100);
				match(RPAREN);
				}
				}
				setState(105);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(106);
			match(LPAREN);
			setState(107);
			statement();
			setState(111);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==RPAREN) {
				{
				{
				setState(108);
				match(RPAREN);
				}
				}
				setState(113);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(114);
			match(RETURN);
			setState(115);
			expression(0);
			setState(116);
			match(SEMI);
			setState(117);
			match(RBRACE);
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(MiniJavaParser.INT, 0); }
		public TerminalNode LBRACK() { return getToken(MiniJavaParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(MiniJavaParser.RBRACK, 0); }
		public TerminalNode BOOLEAN() { return getToken(MiniJavaParser.BOOLEAN, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_type);
		try {
			setState(125);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(119);
				match(INT);
				setState(120);
				match(LBRACK);
				setState(121);
				match(RBRACK);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(122);
				match(BOOLEAN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(123);
				match(INT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(124);
				identifier();
				}
				break;
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

	public static class StatementContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(MiniJavaParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(MiniJavaParser.RBRACE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode IF() { return getToken(MiniJavaParser.IF, 0); }
		public TerminalNode LPAREN() { return getToken(MiniJavaParser.LPAREN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(MiniJavaParser.RPAREN, 0); }
		public TerminalNode ELSE() { return getToken(MiniJavaParser.ELSE, 0); }
		public TerminalNode WHILE() { return getToken(MiniJavaParser.WHILE, 0); }
		public TerminalNode SOP() { return getToken(MiniJavaParser.SOP, 0); }
		public TerminalNode SEMI() { return getToken(MiniJavaParser.SEMI, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(MiniJavaParser.ASSIGN, 0); }
		public TerminalNode LBRACK() { return getToken(MiniJavaParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(MiniJavaParser.RBRACK, 0); }
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_statement);
		int _la;
		try {
			setState(168);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(127);
				match(LBRACE);
				setState(131);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LBRACE) | (1L << IF) | (1L << WHILE) | (1L << SOP) | (1L << ALPHABET))) != 0)) {
					{
					{
					setState(128);
					statement();
					}
					}
					setState(133);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(134);
				match(RBRACE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(135);
				match(IF);
				setState(136);
				match(LPAREN);
				setState(137);
				expression(0);
				setState(138);
				match(RPAREN);
				setState(139);
				statement();
				setState(140);
				match(ELSE);
				setState(141);
				statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(143);
				match(WHILE);
				setState(144);
				match(LPAREN);
				setState(145);
				expression(0);
				setState(146);
				match(RPAREN);
				setState(147);
				statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(149);
				match(SOP);
				setState(150);
				match(LPAREN);
				setState(151);
				expression(0);
				setState(152);
				match(RPAREN);
				setState(153);
				match(SEMI);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(155);
				identifier();
				setState(156);
				match(ASSIGN);
				setState(157);
				expression(0);
				setState(158);
				match(SEMI);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(160);
				identifier();
				setState(161);
				match(LBRACK);
				setState(162);
				expression(0);
				setState(163);
				match(RBRACK);
				setState(164);
				match(ASSIGN);
				setState(165);
				expression(0);
				setState(166);
				match(SEMI);
				}
				break;
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
		public TerminalNode Integer() { return getToken(MiniJavaParser.Integer, 0); }
		public TerminalNode TRUE() { return getToken(MiniJavaParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(MiniJavaParser.FALSE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode THIS() { return getToken(MiniJavaParser.THIS, 0); }
		public TerminalNode NEW() { return getToken(MiniJavaParser.NEW, 0); }
		public TerminalNode INT() { return getToken(MiniJavaParser.INT, 0); }
		public TerminalNode LBRACK() { return getToken(MiniJavaParser.LBRACK, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode RBRACK() { return getToken(MiniJavaParser.RBRACK, 0); }
		public TerminalNode LPAREN() { return getToken(MiniJavaParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(MiniJavaParser.RPAREN, 0); }
		public TerminalNode BANG() { return getToken(MiniJavaParser.BANG, 0); }
		public TerminalNode AND() { return getToken(MiniJavaParser.AND, 0); }
		public TerminalNode LT() { return getToken(MiniJavaParser.LT, 0); }
		public TerminalNode ADD() { return getToken(MiniJavaParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(MiniJavaParser.SUB, 0); }
		public TerminalNode MUL() { return getToken(MiniJavaParser.MUL, 0); }
		public TerminalNode DOT() { return getToken(MiniJavaParser.DOT, 0); }
		public TerminalNode LENGTH() { return getToken(MiniJavaParser.LENGTH, 0); }
		public List<TerminalNode> COMMA() { return getTokens(MiniJavaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MiniJavaParser.COMMA, i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitExpression(this);
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
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(171);
				match(Integer);
				}
				break;
			case 2:
				{
				setState(172);
				match(TRUE);
				}
				break;
			case 3:
				{
				setState(173);
				match(FALSE);
				}
				break;
			case 4:
				{
				setState(174);
				identifier();
				}
				break;
			case 5:
				{
				setState(175);
				match(THIS);
				}
				break;
			case 6:
				{
				setState(176);
				match(NEW);
				setState(177);
				match(INT);
				setState(178);
				match(LBRACK);
				setState(179);
				expression(0);
				setState(180);
				match(RBRACK);
				}
				break;
			case 7:
				{
				setState(182);
				match(NEW);
				setState(183);
				identifier();
				setState(184);
				match(LPAREN);
				setState(185);
				match(RPAREN);
				}
				break;
			case 8:
				{
				setState(187);
				match(BANG);
				setState(188);
				expression(2);
				}
				break;
			case 9:
				{
				setState(189);
				match(LPAREN);
				setState(190);
				expression(0);
				setState(191);
				match(RPAREN);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(224);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(222);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(195);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(196);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AND) | (1L << LT) | (1L << ADD) | (1L << SUB) | (1L << MUL))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(197);
						expression(14);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(198);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(199);
						match(LBRACK);
						setState(200);
						expression(0);
						setState(201);
						match(RBRACK);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(203);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(204);
						match(DOT);
						setState(205);
						match(LENGTH);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(206);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(207);
						match(DOT);
						setState(208);
						identifier();
						setState(209);
						match(LPAREN);
						setState(218);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAREN) | (1L << BANG) | (1L << TRUE) | (1L << FALSE) | (1L << THIS) | (1L << NEW) | (1L << Integer) | (1L << ALPHABET))) != 0)) {
							{
							setState(210);
							expression(0);
							setState(215);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==COMMA) {
								{
								{
								setState(211);
								match(COMMA);
								setState(212);
								expression(0);
								}
								}
								setState(217);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							}
						}

						setState(220);
						match(RPAREN);
						}
						break;
					}
					} 
				}
				setState(226);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
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

	public static class IdentifierContext extends ParserRuleContext {
		public List<TerminalNode> ALPHABET() { return getTokens(MiniJavaParser.ALPHABET); }
		public TerminalNode ALPHABET(int i) {
			return getToken(MiniJavaParser.ALPHABET, i);
		}
		public List<TerminalNode> DIGIT() { return getTokens(MiniJavaParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(MiniJavaParser.DIGIT, i);
		}
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitIdentifier(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_identifier);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(228); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(227);
					match(ALPHABET);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(230); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(241);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(232);
					match(DIGIT);
					setState(236);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(233);
							match(ALPHABET);
							}
							} 
						}
						setState(238);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
					}
					}
					} 
				}
				setState(243);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 7:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3*\u00f7\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3\2"+
		"\3\2\3\2\7\2\31\n\2\f\2\16\2\34\13\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\5\4\66"+
		"\n\4\3\4\3\4\3\4\3\4\7\4<\n\4\f\4\16\4?\13\4\3\4\3\4\3\4\7\4D\n\4\f\4"+
		"\16\4G\13\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\7\6[\n\6\f\6\16\6^\13\6\3\6\5\6a\n\6\3\6\3\6\3\6\3\6\3"+
		"\6\7\6h\n\6\f\6\16\6k\13\6\3\6\3\6\3\6\7\6p\n\6\f\6\16\6s\13\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u0080\n\7\3\b\3\b\7\b\u0084\n"+
		"\b\f\b\16\b\u0087\13\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\5\b\u00ab\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00c4\n\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\7\t\u00d8\n\t\f\t\16\t\u00db\13\t\5\t\u00dd\n\t\3\t\3\t\7\t\u00e1\n\t"+
		"\f\t\16\t\u00e4\13\t\3\n\6\n\u00e7\n\n\r\n\16\n\u00e8\3\n\3\n\7\n\u00ed"+
		"\n\n\f\n\16\n\u00f0\13\n\7\n\u00f2\n\n\f\n\16\n\u00f5\13\n\3\n\2\3\20"+
		"\13\2\4\6\b\n\f\16\20\22\2\3\3\2\f\20\2\u010f\2\24\3\2\2\2\4\35\3\2\2"+
		"\2\6/\3\2\2\2\bJ\3\2\2\2\nN\3\2\2\2\f\177\3\2\2\2\16\u00aa\3\2\2\2\20"+
		"\u00c3\3\2\2\2\22\u00e6\3\2\2\2\24\25\5\4\3\2\25\26\7\3\2\2\26\32\5\6"+
		"\4\2\27\31\7\4\2\2\30\27\3\2\2\2\31\34\3\2\2\2\32\30\3\2\2\2\32\33\3\2"+
		"\2\2\33\3\3\2\2\2\34\32\3\2\2\2\35\36\7\23\2\2\36\37\5\22\n\2\37 \7\5"+
		"\2\2 !\7\24\2\2!\"\7\25\2\2\"#\7\26\2\2#$\7\27\2\2$%\7\3\2\2%&\7\30\2"+
		"\2&\'\7\7\2\2\'(\7\b\2\2()\5\22\n\2)*\7\4\2\2*+\7\5\2\2+,\5\16\b\2,-\7"+
		"\6\2\2-.\7\6\2\2.\5\3\2\2\2/\60\7\23\2\2\60\61\5\22\n\2\61\62\7\3\2\2"+
		"\62\63\7\31\2\2\63\65\5\22\n\2\64\66\7\4\2\2\65\64\3\2\2\2\65\66\3\2\2"+
		"\2\66\67\3\2\2\2\678\7\5\2\289\7\3\2\29=\5\b\5\2:<\7\4\2\2;:\3\2\2\2<"+
		"?\3\2\2\2=;\3\2\2\2=>\3\2\2\2>@\3\2\2\2?=\3\2\2\2@A\7\3\2\2AE\5\n\6\2"+
		"BD\7\4\2\2CB\3\2\2\2DG\3\2\2\2EC\3\2\2\2EF\3\2\2\2FH\3\2\2\2GE\3\2\2\2"+
		"HI\7\6\2\2I\7\3\2\2\2JK\5\f\7\2KL\5\22\n\2LM\7\t\2\2M\t\3\2\2\2NO\7\24"+
		"\2\2OP\5\f\7\2PQ\5\22\n\2QR\7\3\2\2RS\7\3\2\2ST\5\f\7\2TU\5\22\n\2UV\7"+
		"\3\2\2VW\7\n\2\2WX\5\f\7\2X\\\5\22\n\2Y[\7\4\2\2ZY\3\2\2\2[^\3\2\2\2\\"+
		"Z\3\2\2\2\\]\3\2\2\2]`\3\2\2\2^\\\3\2\2\2_a\7\4\2\2`_\3\2\2\2`a\3\2\2"+
		"\2ab\3\2\2\2bc\7\4\2\2cd\7\5\2\2de\7\3\2\2ei\5\b\5\2fh\7\4\2\2gf\3\2\2"+
		"\2hk\3\2\2\2ig\3\2\2\2ij\3\2\2\2jl\3\2\2\2ki\3\2\2\2lm\7\3\2\2mq\5\16"+
		"\b\2np\7\4\2\2on\3\2\2\2ps\3\2\2\2qo\3\2\2\2qr\3\2\2\2rt\3\2\2\2sq\3\2"+
		"\2\2tu\7\32\2\2uv\5\20\t\2vw\7\t\2\2wx\7\6\2\2x\13\3\2\2\2yz\7\33\2\2"+
		"z{\7\7\2\2{\u0080\7\b\2\2|\u0080\7\34\2\2}\u0080\7\33\2\2~\u0080\5\22"+
		"\n\2\177y\3\2\2\2\177|\3\2\2\2\177}\3\2\2\2\177~\3\2\2\2\u0080\r\3\2\2"+
		"\2\u0081\u0085\7\5\2\2\u0082\u0084\5\16\b\2\u0083\u0082\3\2\2\2\u0084"+
		"\u0087\3\2\2\2\u0085\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0088\3\2"+
		"\2\2\u0087\u0085\3\2\2\2\u0088\u00ab\7\6\2\2\u0089\u008a\7\35\2\2\u008a"+
		"\u008b\7\3\2\2\u008b\u008c\5\20\t\2\u008c\u008d\7\4\2\2\u008d\u008e\5"+
		"\16\b\2\u008e\u008f\7\36\2\2\u008f\u0090\5\16\b\2\u0090\u00ab\3\2\2\2"+
		"\u0091\u0092\7\37\2\2\u0092\u0093\7\3\2\2\u0093\u0094\5\20\t\2\u0094\u0095"+
		"\7\4\2\2\u0095\u0096\5\16\b\2\u0096\u00ab\3\2\2\2\u0097\u0098\7 \2\2\u0098"+
		"\u0099\7\3\2\2\u0099\u009a\5\20\t\2\u009a\u009b\7\4\2\2\u009b\u009c\7"+
		"\t\2\2\u009c\u00ab\3\2\2\2\u009d\u009e\5\22\n\2\u009e\u009f\7\21\2\2\u009f"+
		"\u00a0\5\20\t\2\u00a0\u00a1\7\t\2\2\u00a1\u00ab\3\2\2\2\u00a2\u00a3\5"+
		"\22\n\2\u00a3\u00a4\7\7\2\2\u00a4\u00a5\5\20\t\2\u00a5\u00a6\7\b\2\2\u00a6"+
		"\u00a7\7\21\2\2\u00a7\u00a8\5\20\t\2\u00a8\u00a9\7\t\2\2\u00a9\u00ab\3"+
		"\2\2\2\u00aa\u0081\3\2\2\2\u00aa\u0089\3\2\2\2\u00aa\u0091\3\2\2\2\u00aa"+
		"\u0097\3\2\2\2\u00aa\u009d\3\2\2\2\u00aa\u00a2\3\2\2\2\u00ab\17\3\2\2"+
		"\2\u00ac\u00ad\b\t\1\2\u00ad\u00c4\7(\2\2\u00ae\u00c4\7\"\2\2\u00af\u00c4"+
		"\7#\2\2\u00b0\u00c4\5\22\n\2\u00b1\u00c4\7$\2\2\u00b2\u00b3\7%\2\2\u00b3"+
		"\u00b4\7\33\2\2\u00b4\u00b5\7\7\2\2\u00b5\u00b6\5\20\t\2\u00b6\u00b7\7"+
		"\b\2\2\u00b7\u00c4\3\2\2\2\u00b8\u00b9\7%\2\2\u00b9\u00ba\5\22\n\2\u00ba"+
		"\u00bb\7\3\2\2\u00bb\u00bc\7\4\2\2\u00bc\u00c4\3\2\2\2\u00bd\u00be\7\22"+
		"\2\2\u00be\u00c4\5\20\t\4\u00bf\u00c0\7\3\2\2\u00c0\u00c1\5\20\t\2\u00c1"+
		"\u00c2\7\4\2\2\u00c2\u00c4\3\2\2\2\u00c3\u00ac\3\2\2\2\u00c3\u00ae\3\2"+
		"\2\2\u00c3\u00af\3\2\2\2\u00c3\u00b0\3\2\2\2\u00c3\u00b1\3\2\2\2\u00c3"+
		"\u00b2\3\2\2\2\u00c3\u00b8\3\2\2\2\u00c3\u00bd\3\2\2\2\u00c3\u00bf\3\2"+
		"\2\2\u00c4\u00e2\3\2\2\2\u00c5\u00c6\f\17\2\2\u00c6\u00c7\t\2\2\2\u00c7"+
		"\u00e1\5\20\t\20\u00c8\u00c9\f\16\2\2\u00c9\u00ca\7\7\2\2\u00ca\u00cb"+
		"\5\20\t\2\u00cb\u00cc\7\b\2\2\u00cc\u00e1\3\2\2\2\u00cd\u00ce\f\r\2\2"+
		"\u00ce\u00cf\7\13\2\2\u00cf\u00e1\7!\2\2\u00d0\u00d1\f\f\2\2\u00d1\u00d2"+
		"\7\13\2\2\u00d2\u00d3\5\22\n\2\u00d3\u00dc\7\3\2\2\u00d4\u00d9\5\20\t"+
		"\2\u00d5\u00d6\7\n\2\2\u00d6\u00d8\5\20\t\2\u00d7\u00d5\3\2\2\2\u00d8"+
		"\u00db\3\2\2\2\u00d9\u00d7\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00dd\3\2"+
		"\2\2\u00db\u00d9\3\2\2\2\u00dc\u00d4\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd"+
		"\u00de\3\2\2\2\u00de\u00df\7\4\2\2\u00df\u00e1\3\2\2\2\u00e0\u00c5\3\2"+
		"\2\2\u00e0\u00c8\3\2\2\2\u00e0\u00cd\3\2\2\2\u00e0\u00d0\3\2\2\2\u00e1"+
		"\u00e4\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\21\3\2\2"+
		"\2\u00e4\u00e2\3\2\2\2\u00e5\u00e7\7)\2\2\u00e6\u00e5\3\2\2\2\u00e7\u00e8"+
		"\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00f3\3\2\2\2\u00ea"+
		"\u00ee\7*\2\2\u00eb\u00ed\7)\2\2\u00ec\u00eb\3\2\2\2\u00ed\u00f0\3\2\2"+
		"\2\u00ee\u00ec\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00f2\3\2\2\2\u00f0\u00ee"+
		"\3\2\2\2\u00f1\u00ea\3\2\2\2\u00f2\u00f5\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f3"+
		"\u00f4\3\2\2\2\u00f4\23\3\2\2\2\u00f5\u00f3\3\2\2\2\25\32\65=E\\`iq\177"+
		"\u0085\u00aa\u00c3\u00d9\u00dc\u00e0\u00e2\u00e8\u00ee\u00f3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}