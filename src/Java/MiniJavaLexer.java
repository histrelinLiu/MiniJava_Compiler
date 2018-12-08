// Generated from ./g4/MiniJava.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MiniJavaLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LPAREN=1, RPAREN=2, LBRACE=3, RBRACE=4, LBRACK=5, RBRACK=6, SEMI=7, COMMA=8, 
		DOT=9, AND=10, LT=11, ADD=12, SUB=13, MUL=14, ASSIGN=15, BANG=16, CLASS=17, 
		PUBLIC=18, STATIC=19, VOID=20, MAIN=21, STRING=22, EXTENDS=23, RETURN=24, 
		INT=25, BOOLEAN=26, IF=27, ELSE=28, WHILE=29, SOP=30, LENGTH=31, TRUE=32, 
		FALSE=33, THIS=34, NEW=35, WS=36, IDENTIFIER=37, Integer=38;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"LPAREN", "RPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK", "SEMI", "COMMA", 
		"DOT", "AND", "LT", "ADD", "SUB", "MUL", "ASSIGN", "BANG", "CLASS", "PUBLIC", 
		"STATIC", "VOID", "MAIN", "STRING", "EXTENDS", "RETURN", "INT", "BOOLEAN", 
		"IF", "ELSE", "WHILE", "SOP", "LENGTH", "TRUE", "FALSE", "THIS", "NEW", 
		"WS", "ALPHABET", "DIGIT", "IDENTIFIER", "Integer"
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
		"NEW", "WS", "IDENTIFIER", "Integer"
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


	public MiniJavaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MiniJava.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2(\u0114\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\3\2\3\2\3\3\3"+
		"\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3"+
		"\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3"+
		" \3 \3 \3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3$\3$\3"+
		"$\3$\3%\6%\u00f2\n%\r%\16%\u00f3\3%\3%\3&\3&\3\'\3\'\3(\6(\u00fd\n(\r"+
		"(\16(\u00fe\3(\3(\7(\u0103\n(\f(\16(\u0106\13(\7(\u0108\n(\f(\16(\u010b"+
		"\13(\3)\5)\u010e\n)\3)\6)\u0111\n)\r)\16)\u0112\2\2*\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'"+
		"\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\2"+
		"M\2O\'Q(\3\2\5\5\2\13\f\17\17\"\"\5\2C\\aac|\3\2\62;\2\u0117\2\3\3\2\2"+
		"\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3"+
		"\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2"+
		"\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2"+
		"\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2"+
		"\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3"+
		"\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2"+
		"\2\2O\3\2\2\2\2Q\3\2\2\2\3S\3\2\2\2\5U\3\2\2\2\7W\3\2\2\2\tY\3\2\2\2\13"+
		"[\3\2\2\2\r]\3\2\2\2\17_\3\2\2\2\21a\3\2\2\2\23c\3\2\2\2\25e\3\2\2\2\27"+
		"h\3\2\2\2\31j\3\2\2\2\33l\3\2\2\2\35n\3\2\2\2\37p\3\2\2\2!r\3\2\2\2#t"+
		"\3\2\2\2%z\3\2\2\2\'\u0081\3\2\2\2)\u0088\3\2\2\2+\u008d\3\2\2\2-\u0092"+
		"\3\2\2\2/\u0099\3\2\2\2\61\u00a1\3\2\2\2\63\u00a8\3\2\2\2\65\u00ac\3\2"+
		"\2\2\67\u00b4\3\2\2\29\u00b7\3\2\2\2;\u00bc\3\2\2\2=\u00c2\3\2\2\2?\u00d5"+
		"\3\2\2\2A\u00dc\3\2\2\2C\u00e1\3\2\2\2E\u00e7\3\2\2\2G\u00ec\3\2\2\2I"+
		"\u00f1\3\2\2\2K\u00f7\3\2\2\2M\u00f9\3\2\2\2O\u00fc\3\2\2\2Q\u010d\3\2"+
		"\2\2ST\7*\2\2T\4\3\2\2\2UV\7+\2\2V\6\3\2\2\2WX\7}\2\2X\b\3\2\2\2YZ\7\177"+
		"\2\2Z\n\3\2\2\2[\\\7]\2\2\\\f\3\2\2\2]^\7_\2\2^\16\3\2\2\2_`\7=\2\2`\20"+
		"\3\2\2\2ab\7.\2\2b\22\3\2\2\2cd\7\60\2\2d\24\3\2\2\2ef\7(\2\2fg\7(\2\2"+
		"g\26\3\2\2\2hi\7>\2\2i\30\3\2\2\2jk\7-\2\2k\32\3\2\2\2lm\7/\2\2m\34\3"+
		"\2\2\2no\7,\2\2o\36\3\2\2\2pq\7?\2\2q \3\2\2\2rs\7#\2\2s\"\3\2\2\2tu\7"+
		"e\2\2uv\7n\2\2vw\7c\2\2wx\7u\2\2xy\7u\2\2y$\3\2\2\2z{\7r\2\2{|\7w\2\2"+
		"|}\7d\2\2}~\7n\2\2~\177\7k\2\2\177\u0080\7e\2\2\u0080&\3\2\2\2\u0081\u0082"+
		"\7u\2\2\u0082\u0083\7v\2\2\u0083\u0084\7c\2\2\u0084\u0085\7v\2\2\u0085"+
		"\u0086\7k\2\2\u0086\u0087\7e\2\2\u0087(\3\2\2\2\u0088\u0089\7x\2\2\u0089"+
		"\u008a\7q\2\2\u008a\u008b\7k\2\2\u008b\u008c\7f\2\2\u008c*\3\2\2\2\u008d"+
		"\u008e\7o\2\2\u008e\u008f\7c\2\2\u008f\u0090\7k\2\2\u0090\u0091\7p\2\2"+
		"\u0091,\3\2\2\2\u0092\u0093\7U\2\2\u0093\u0094\7v\2\2\u0094\u0095\7t\2"+
		"\2\u0095\u0096\7k\2\2\u0096\u0097\7p\2\2\u0097\u0098\7i\2\2\u0098.\3\2"+
		"\2\2\u0099\u009a\7g\2\2\u009a\u009b\7z\2\2\u009b\u009c\7v\2\2\u009c\u009d"+
		"\7g\2\2\u009d\u009e\7p\2\2\u009e\u009f\7f\2\2\u009f\u00a0\7u\2\2\u00a0"+
		"\60\3\2\2\2\u00a1\u00a2\7t\2\2\u00a2\u00a3\7g\2\2\u00a3\u00a4\7v\2\2\u00a4"+
		"\u00a5\7w\2\2\u00a5\u00a6\7t\2\2\u00a6\u00a7\7p\2\2\u00a7\62\3\2\2\2\u00a8"+
		"\u00a9\7k\2\2\u00a9\u00aa\7p\2\2\u00aa\u00ab\7v\2\2\u00ab\64\3\2\2\2\u00ac"+
		"\u00ad\7d\2\2\u00ad\u00ae\7q\2\2\u00ae\u00af\7q\2\2\u00af\u00b0\7n\2\2"+
		"\u00b0\u00b1\7g\2\2\u00b1\u00b2\7c\2\2\u00b2\u00b3\7p\2\2\u00b3\66\3\2"+
		"\2\2\u00b4\u00b5\7k\2\2\u00b5\u00b6\7h\2\2\u00b68\3\2\2\2\u00b7\u00b8"+
		"\7g\2\2\u00b8\u00b9\7n\2\2\u00b9\u00ba\7u\2\2\u00ba\u00bb\7g\2\2\u00bb"+
		":\3\2\2\2\u00bc\u00bd\7y\2\2\u00bd\u00be\7j\2\2\u00be\u00bf\7k\2\2\u00bf"+
		"\u00c0\7n\2\2\u00c0\u00c1\7g\2\2\u00c1<\3\2\2\2\u00c2\u00c3\7U\2\2\u00c3"+
		"\u00c4\7{\2\2\u00c4\u00c5\7u\2\2\u00c5\u00c6\7v\2\2\u00c6\u00c7\7g\2\2"+
		"\u00c7\u00c8\7o\2\2\u00c8\u00c9\7\60\2\2\u00c9\u00ca\7q\2\2\u00ca\u00cb"+
		"\7w\2\2\u00cb\u00cc\7v\2\2\u00cc\u00cd\7\60\2\2\u00cd\u00ce\7r\2\2\u00ce"+
		"\u00cf\7t\2\2\u00cf\u00d0\7k\2\2\u00d0\u00d1\7p\2\2\u00d1\u00d2\7v\2\2"+
		"\u00d2\u00d3\7n\2\2\u00d3\u00d4\7p\2\2\u00d4>\3\2\2\2\u00d5\u00d6\7n\2"+
		"\2\u00d6\u00d7\7g\2\2\u00d7\u00d8\7p\2\2\u00d8\u00d9\7i\2\2\u00d9\u00da"+
		"\7v\2\2\u00da\u00db\7j\2\2\u00db@\3\2\2\2\u00dc\u00dd\7v\2\2\u00dd\u00de"+
		"\7t\2\2\u00de\u00df\7w\2\2\u00df\u00e0\7g\2\2\u00e0B\3\2\2\2\u00e1\u00e2"+
		"\7h\2\2\u00e2\u00e3\7c\2\2\u00e3\u00e4\7n\2\2\u00e4\u00e5\7u\2\2\u00e5"+
		"\u00e6\7g\2\2\u00e6D\3\2\2\2\u00e7\u00e8\7v\2\2\u00e8\u00e9\7j\2\2\u00e9"+
		"\u00ea\7k\2\2\u00ea\u00eb\7u\2\2\u00ebF\3\2\2\2\u00ec\u00ed\7p\2\2\u00ed"+
		"\u00ee\7g\2\2\u00ee\u00ef\7y\2\2\u00efH\3\2\2\2\u00f0\u00f2\t\2\2\2\u00f1"+
		"\u00f0\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f3\u00f4\3\2"+
		"\2\2\u00f4\u00f5\3\2\2\2\u00f5\u00f6\b%\2\2\u00f6J\3\2\2\2\u00f7\u00f8"+
		"\t\3\2\2\u00f8L\3\2\2\2\u00f9\u00fa\t\4\2\2\u00faN\3\2\2\2\u00fb\u00fd"+
		"\5K&\2\u00fc\u00fb\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\u00fc\3\2\2\2\u00fe"+
		"\u00ff\3\2\2\2\u00ff\u0109\3\2\2\2\u0100\u0104\5M\'\2\u0101\u0103\5K&"+
		"\2\u0102\u0101\3\2\2\2\u0103\u0106\3\2\2\2\u0104\u0102\3\2\2\2\u0104\u0105"+
		"\3\2\2\2\u0105\u0108\3\2\2\2\u0106\u0104\3\2\2\2\u0107\u0100\3\2\2\2\u0108"+
		"\u010b\3\2\2\2\u0109\u0107\3\2\2\2\u0109\u010a\3\2\2\2\u010aP\3\2\2\2"+
		"\u010b\u0109\3\2\2\2\u010c\u010e\5\33\16\2\u010d\u010c\3\2\2\2\u010d\u010e"+
		"\3\2\2\2\u010e\u0110\3\2\2\2\u010f\u0111\5M\'\2\u0110\u010f\3\2\2\2\u0111"+
		"\u0112\3\2\2\2\u0112\u0110\3\2\2\2\u0112\u0113\3\2\2\2\u0113R\3\2\2\2"+
		"\t\2\u00f3\u00fe\u0104\u0109\u010d\u0112\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}