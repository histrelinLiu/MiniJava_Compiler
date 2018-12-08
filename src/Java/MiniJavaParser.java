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
		FALSE=33, THIS=34, NEW=35, WS=36, NUMBER=37, IDENTIFIER=38, Integer=39;
	public static final int
		RULE_goal = 0, RULE_mainClass = 1, RULE_classDeclaration = 2, RULE_varDeclaration = 3, 
		RULE_methodDeclaration = 4, RULE_type = 5, RULE_statement = 6, RULE_expression = 7;
	public static final String[] ruleNames = {
		"goal", "mainClass", "classDeclaration", "varDeclaration", "methodDeclaration", 
		"type", "statement", "expression"
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
		"NEW", "WS", "NUMBER", "IDENTIFIER", "Integer"
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
			setState(16);
			mainClass();
			setState(17);
			match(LPAREN);
			setState(18);
			classDeclaration();
			setState(22);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==RPAREN) {
				{
				{
				setState(19);
				match(RPAREN);
				}
				}
				setState(24);
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
		public List<TerminalNode> IDENTIFIER() { return getTokens(MiniJavaParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(MiniJavaParser.IDENTIFIER, i);
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
			setState(25);
			match(CLASS);
			setState(26);
			match(IDENTIFIER);
			setState(27);
			match(LBRACE);
			setState(28);
			match(PUBLIC);
			setState(29);
			match(STATIC);
			setState(30);
			match(VOID);
			setState(31);
			match(MAIN);
			setState(32);
			match(LPAREN);
			setState(33);
			match(STRING);
			setState(34);
			match(LBRACK);
			setState(35);
			match(RBRACK);
			setState(36);
			match(IDENTIFIER);
			setState(37);
			match(RPAREN);
			setState(38);
			match(LBRACE);
			setState(39);
			statement();
			setState(40);
			match(RBRACE);
			setState(41);
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
		public List<TerminalNode> IDENTIFIER() { return getTokens(MiniJavaParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(MiniJavaParser.IDENTIFIER, i);
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
			setState(43);
			match(CLASS);
			setState(44);
			match(IDENTIFIER);
			setState(45);
			match(LPAREN);
			setState(46);
			match(EXTENDS);
			setState(47);
			match(IDENTIFIER);
			setState(49);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RPAREN) {
				{
				setState(48);
				match(RPAREN);
				}
			}

			setState(51);
			match(LBRACE);
			setState(52);
			match(LPAREN);
			setState(53);
			varDeclaration();
			setState(57);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==RPAREN) {
				{
				{
				setState(54);
				match(RPAREN);
				}
				}
				setState(59);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(60);
			match(LPAREN);
			setState(61);
			methodDeclaration();
			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==RPAREN) {
				{
				{
				setState(62);
				match(RPAREN);
				}
				}
				setState(67);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(68);
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
		public TerminalNode IDENTIFIER() { return getToken(MiniJavaParser.IDENTIFIER, 0); }
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
			setState(70);
			type();
			setState(71);
			match(IDENTIFIER);
			setState(72);
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
		public List<TerminalNode> IDENTIFIER() { return getTokens(MiniJavaParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(MiniJavaParser.IDENTIFIER, i);
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
			setState(74);
			match(PUBLIC);
			setState(75);
			type();
			setState(76);
			match(IDENTIFIER);
			setState(77);
			match(LPAREN);
			setState(78);
			match(LPAREN);
			setState(79);
			type();
			setState(80);
			match(IDENTIFIER);
			setState(81);
			match(LPAREN);
			setState(82);
			match(COMMA);
			setState(83);
			type();
			setState(84);
			match(IDENTIFIER);
			setState(88);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(85);
					match(RPAREN);
					}
					} 
				}
				setState(90);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(92);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(91);
				match(RPAREN);
				}
				break;
			}
			setState(94);
			match(RPAREN);
			setState(95);
			match(LBRACE);
			setState(96);
			match(LPAREN);
			setState(97);
			varDeclaration();
			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==RPAREN) {
				{
				{
				setState(98);
				match(RPAREN);
				}
				}
				setState(103);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(104);
			match(LPAREN);
			setState(105);
			statement();
			setState(109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==RPAREN) {
				{
				{
				setState(106);
				match(RPAREN);
				}
				}
				setState(111);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(112);
			match(RETURN);
			setState(113);
			expression(0);
			setState(114);
			match(SEMI);
			setState(115);
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
		public TerminalNode IDENTIFIER() { return getToken(MiniJavaParser.IDENTIFIER, 0); }
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
			setState(123);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(117);
				match(INT);
				setState(118);
				match(LBRACK);
				setState(119);
				match(RBRACK);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(120);
				match(BOOLEAN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(121);
				match(INT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(122);
				match(IDENTIFIER);
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
		public TerminalNode IDENTIFIER() { return getToken(MiniJavaParser.IDENTIFIER, 0); }
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
			setState(166);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(125);
				match(LBRACE);
				setState(129);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LBRACE) | (1L << IF) | (1L << WHILE) | (1L << SOP) | (1L << IDENTIFIER))) != 0)) {
					{
					{
					setState(126);
					statement();
					}
					}
					setState(131);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(132);
				match(RBRACE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(133);
				match(IF);
				setState(134);
				match(LPAREN);
				setState(135);
				expression(0);
				setState(136);
				match(RPAREN);
				setState(137);
				statement();
				setState(138);
				match(ELSE);
				setState(139);
				statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(141);
				match(WHILE);
				setState(142);
				match(LPAREN);
				setState(143);
				expression(0);
				setState(144);
				match(RPAREN);
				setState(145);
				statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(147);
				match(SOP);
				setState(148);
				match(LPAREN);
				setState(149);
				expression(0);
				setState(150);
				match(RPAREN);
				setState(151);
				match(SEMI);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(153);
				match(IDENTIFIER);
				setState(154);
				match(ASSIGN);
				setState(155);
				expression(0);
				setState(156);
				match(SEMI);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(158);
				match(IDENTIFIER);
				setState(159);
				match(LBRACK);
				setState(160);
				expression(0);
				setState(161);
				match(RBRACK);
				setState(162);
				match(ASSIGN);
				setState(163);
				expression(0);
				setState(164);
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
		public TerminalNode IDENTIFIER() { return getToken(MiniJavaParser.IDENTIFIER, 0); }
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
			setState(190);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(169);
				match(Integer);
				}
				break;
			case 2:
				{
				setState(170);
				match(TRUE);
				}
				break;
			case 3:
				{
				setState(171);
				match(FALSE);
				}
				break;
			case 4:
				{
				setState(172);
				match(IDENTIFIER);
				}
				break;
			case 5:
				{
				setState(173);
				match(THIS);
				}
				break;
			case 6:
				{
				setState(174);
				match(NEW);
				setState(175);
				match(INT);
				setState(176);
				match(LBRACK);
				setState(177);
				expression(0);
				setState(178);
				match(RBRACK);
				}
				break;
			case 7:
				{
				setState(180);
				match(NEW);
				setState(181);
				match(IDENTIFIER);
				setState(182);
				match(LPAREN);
				setState(183);
				match(RPAREN);
				}
				break;
			case 8:
				{
				setState(184);
				match(BANG);
				setState(185);
				expression(2);
				}
				break;
			case 9:
				{
				setState(186);
				match(LPAREN);
				setState(187);
				expression(0);
				setState(188);
				match(RPAREN);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(220);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(218);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(192);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(193);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AND) | (1L << LT) | (1L << ADD) | (1L << SUB) | (1L << MUL))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(194);
						expression(14);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(195);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(196);
						match(LBRACK);
						setState(197);
						expression(0);
						setState(198);
						match(RBRACK);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(200);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(201);
						match(DOT);
						setState(202);
						match(LENGTH);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(203);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(204);
						match(DOT);
						setState(205);
						match(IDENTIFIER);
						setState(206);
						match(LPAREN);
						setState(215);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAREN) | (1L << BANG) | (1L << TRUE) | (1L << FALSE) | (1L << THIS) | (1L << NEW) | (1L << IDENTIFIER) | (1L << Integer))) != 0)) {
							{
							setState(207);
							expression(0);
							setState(212);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==COMMA) {
								{
								{
								setState(208);
								match(COMMA);
								setState(209);
								expression(0);
								}
								}
								setState(214);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							}
						}

						setState(217);
						match(RPAREN);
						}
						break;
					}
					} 
				}
				setState(222);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3)\u00e2\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\3\2\3\2"+
		"\7\2\27\n\2\f\2\16\2\32\13\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\5\4\64\n\4\3\4"+
		"\3\4\3\4\3\4\7\4:\n\4\f\4\16\4=\13\4\3\4\3\4\3\4\7\4B\n\4\f\4\16\4E\13"+
		"\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\7\6Y\n\6\f\6\16\6\\\13\6\3\6\5\6_\n\6\3\6\3\6\3\6\3\6\3\6\7\6f\n"+
		"\6\f\6\16\6i\13\6\3\6\3\6\3\6\7\6n\n\6\f\6\16\6q\13\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\7\3\7\3\7\3\7\3\7\3\7\5\7~\n\7\3\b\3\b\7\b\u0082\n\b\f\b\16\b\u0085"+
		"\13\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\5\b\u00a9\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00c1\n\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u00d5\n\t\f\t\16"+
		"\t\u00d8\13\t\5\t\u00da\n\t\3\t\7\t\u00dd\n\t\f\t\16\t\u00e0\13\t\3\t"+
		"\2\3\20\n\2\4\6\b\n\f\16\20\2\3\3\2\f\20\2\u00f8\2\22\3\2\2\2\4\33\3\2"+
		"\2\2\6-\3\2\2\2\bH\3\2\2\2\nL\3\2\2\2\f}\3\2\2\2\16\u00a8\3\2\2\2\20\u00c0"+
		"\3\2\2\2\22\23\5\4\3\2\23\24\7\3\2\2\24\30\5\6\4\2\25\27\7\4\2\2\26\25"+
		"\3\2\2\2\27\32\3\2\2\2\30\26\3\2\2\2\30\31\3\2\2\2\31\3\3\2\2\2\32\30"+
		"\3\2\2\2\33\34\7\23\2\2\34\35\7(\2\2\35\36\7\5\2\2\36\37\7\24\2\2\37 "+
		"\7\25\2\2 !\7\26\2\2!\"\7\27\2\2\"#\7\3\2\2#$\7\30\2\2$%\7\7\2\2%&\7\b"+
		"\2\2&\'\7(\2\2\'(\7\4\2\2()\7\5\2\2)*\5\16\b\2*+\7\6\2\2+,\7\6\2\2,\5"+
		"\3\2\2\2-.\7\23\2\2./\7(\2\2/\60\7\3\2\2\60\61\7\31\2\2\61\63\7(\2\2\62"+
		"\64\7\4\2\2\63\62\3\2\2\2\63\64\3\2\2\2\64\65\3\2\2\2\65\66\7\5\2\2\66"+
		"\67\7\3\2\2\67;\5\b\5\28:\7\4\2\298\3\2\2\2:=\3\2\2\2;9\3\2\2\2;<\3\2"+
		"\2\2<>\3\2\2\2=;\3\2\2\2>?\7\3\2\2?C\5\n\6\2@B\7\4\2\2A@\3\2\2\2BE\3\2"+
		"\2\2CA\3\2\2\2CD\3\2\2\2DF\3\2\2\2EC\3\2\2\2FG\7\6\2\2G\7\3\2\2\2HI\5"+
		"\f\7\2IJ\7(\2\2JK\7\t\2\2K\t\3\2\2\2LM\7\24\2\2MN\5\f\7\2NO\7(\2\2OP\7"+
		"\3\2\2PQ\7\3\2\2QR\5\f\7\2RS\7(\2\2ST\7\3\2\2TU\7\n\2\2UV\5\f\7\2VZ\7"+
		"(\2\2WY\7\4\2\2XW\3\2\2\2Y\\\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2[^\3\2\2\2\\Z"+
		"\3\2\2\2]_\7\4\2\2^]\3\2\2\2^_\3\2\2\2_`\3\2\2\2`a\7\4\2\2ab\7\5\2\2b"+
		"c\7\3\2\2cg\5\b\5\2df\7\4\2\2ed\3\2\2\2fi\3\2\2\2ge\3\2\2\2gh\3\2\2\2"+
		"hj\3\2\2\2ig\3\2\2\2jk\7\3\2\2ko\5\16\b\2ln\7\4\2\2ml\3\2\2\2nq\3\2\2"+
		"\2om\3\2\2\2op\3\2\2\2pr\3\2\2\2qo\3\2\2\2rs\7\32\2\2st\5\20\t\2tu\7\t"+
		"\2\2uv\7\6\2\2v\13\3\2\2\2wx\7\33\2\2xy\7\7\2\2y~\7\b\2\2z~\7\34\2\2{"+
		"~\7\33\2\2|~\7(\2\2}w\3\2\2\2}z\3\2\2\2}{\3\2\2\2}|\3\2\2\2~\r\3\2\2\2"+
		"\177\u0083\7\5\2\2\u0080\u0082\5\16\b\2\u0081\u0080\3\2\2\2\u0082\u0085"+
		"\3\2\2\2\u0083\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0086\3\2\2\2\u0085"+
		"\u0083\3\2\2\2\u0086\u00a9\7\6\2\2\u0087\u0088\7\35\2\2\u0088\u0089\7"+
		"\3\2\2\u0089\u008a\5\20\t\2\u008a\u008b\7\4\2\2\u008b\u008c\5\16\b\2\u008c"+
		"\u008d\7\36\2\2\u008d\u008e\5\16\b\2\u008e\u00a9\3\2\2\2\u008f\u0090\7"+
		"\37\2\2\u0090\u0091\7\3\2\2\u0091\u0092\5\20\t\2\u0092\u0093\7\4\2\2\u0093"+
		"\u0094\5\16\b\2\u0094\u00a9\3\2\2\2\u0095\u0096\7 \2\2\u0096\u0097\7\3"+
		"\2\2\u0097\u0098\5\20\t\2\u0098\u0099\7\4\2\2\u0099\u009a\7\t\2\2\u009a"+
		"\u00a9\3\2\2\2\u009b\u009c\7(\2\2\u009c\u009d\7\21\2\2\u009d\u009e\5\20"+
		"\t\2\u009e\u009f\7\t\2\2\u009f\u00a9\3\2\2\2\u00a0\u00a1\7(\2\2\u00a1"+
		"\u00a2\7\7\2\2\u00a2\u00a3\5\20\t\2\u00a3\u00a4\7\b\2\2\u00a4\u00a5\7"+
		"\21\2\2\u00a5\u00a6\5\20\t\2\u00a6\u00a7\7\t\2\2\u00a7\u00a9\3\2\2\2\u00a8"+
		"\177\3\2\2\2\u00a8\u0087\3\2\2\2\u00a8\u008f\3\2\2\2\u00a8\u0095\3\2\2"+
		"\2\u00a8\u009b\3\2\2\2\u00a8\u00a0\3\2\2\2\u00a9\17\3\2\2\2\u00aa\u00ab"+
		"\b\t\1\2\u00ab\u00c1\7)\2\2\u00ac\u00c1\7\"\2\2\u00ad\u00c1\7#\2\2\u00ae"+
		"\u00c1\7(\2\2\u00af\u00c1\7$\2\2\u00b0\u00b1\7%\2\2\u00b1\u00b2\7\33\2"+
		"\2\u00b2\u00b3\7\7\2\2\u00b3\u00b4\5\20\t\2\u00b4\u00b5\7\b\2\2\u00b5"+
		"\u00c1\3\2\2\2\u00b6\u00b7\7%\2\2\u00b7\u00b8\7(\2\2\u00b8\u00b9\7\3\2"+
		"\2\u00b9\u00c1\7\4\2\2\u00ba\u00bb\7\22\2\2\u00bb\u00c1\5\20\t\4\u00bc"+
		"\u00bd\7\3\2\2\u00bd\u00be\5\20\t\2\u00be\u00bf\7\4\2\2\u00bf\u00c1\3"+
		"\2\2\2\u00c0\u00aa\3\2\2\2\u00c0\u00ac\3\2\2\2\u00c0\u00ad\3\2\2\2\u00c0"+
		"\u00ae\3\2\2\2\u00c0\u00af\3\2\2\2\u00c0\u00b0\3\2\2\2\u00c0\u00b6\3\2"+
		"\2\2\u00c0\u00ba\3\2\2\2\u00c0\u00bc\3\2\2\2\u00c1\u00de\3\2\2\2\u00c2"+
		"\u00c3\f\17\2\2\u00c3\u00c4\t\2\2\2\u00c4\u00dd\5\20\t\20\u00c5\u00c6"+
		"\f\16\2\2\u00c6\u00c7\7\7\2\2\u00c7\u00c8\5\20\t\2\u00c8\u00c9\7\b\2\2"+
		"\u00c9\u00dd\3\2\2\2\u00ca\u00cb\f\r\2\2\u00cb\u00cc\7\13\2\2\u00cc\u00dd"+
		"\7!\2\2\u00cd\u00ce\f\f\2\2\u00ce\u00cf\7\13\2\2\u00cf\u00d0\7(\2\2\u00d0"+
		"\u00d9\7\3\2\2\u00d1\u00d6\5\20\t\2\u00d2\u00d3\7\n\2\2\u00d3\u00d5\5"+
		"\20\t\2\u00d4\u00d2\3\2\2\2\u00d5\u00d8\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d6"+
		"\u00d7\3\2\2\2\u00d7\u00da\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d9\u00d1\3\2"+
		"\2\2\u00d9\u00da\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00dd\7\4\2\2\u00dc"+
		"\u00c2\3\2\2\2\u00dc\u00c5\3\2\2\2\u00dc\u00ca\3\2\2\2\u00dc\u00cd\3\2"+
		"\2\2\u00dd\u00e0\3\2\2\2\u00de\u00dc\3\2\2\2\u00de\u00df\3\2\2\2\u00df"+
		"\21\3\2\2\2\u00e0\u00de\3\2\2\2\22\30\63;CZ^go}\u0083\u00a8\u00c0\u00d6"+
		"\u00d9\u00dc\u00de";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}