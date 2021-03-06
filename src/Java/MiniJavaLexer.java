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
		FALSE=33, THIS=34, NEW=35, WS=36, SL_COMMENT=37, IDENTIFIER=38, Integer=39;
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
		"WS", "SL_COMMENT", "ALPHABET", "DIGIT", "IDENTIFIER", "Integer"
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
		"NEW", "WS", "SL_COMMENT", "IDENTIFIER", "Integer"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2)\u0120\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\3\2\3\2"+
		"\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13"+
		"\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26"+
		"\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\35\3\35"+
		"\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 "+
		"\3 \3 \3 \3 \3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3$"+
		"\3$\3$\3$\3%\6%\u00f4\n%\r%\16%\u00f5\3%\3%\3&\3&\3&\3&\7&\u00fe\n&\f"+
		"&\16&\u0101\13&\3&\3&\3&\3&\3\'\3\'\3(\3(\3)\6)\u010c\n)\r)\16)\u010d"+
		"\3)\3)\7)\u0112\n)\f)\16)\u0115\13)\7)\u0117\n)\f)\16)\u011a\13)\3*\6"+
		"*\u011d\n*\r*\16*\u011e\3\u00ff\2+\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n"+
		"\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30"+
		"/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M\2O\2Q(S)\3\2\5"+
		"\5\2\13\f\17\17\"\"\5\2C\\aac|\3\2\62;\2\u0123\2\3\3\2\2\2\2\5\3\2\2\2"+
		"\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3"+
		"\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2"+
		"\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2"+
		"\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2"+
		"\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2"+
		"\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2"+
		"\2Q\3\2\2\2\2S\3\2\2\2\3U\3\2\2\2\5W\3\2\2\2\7Y\3\2\2\2\t[\3\2\2\2\13"+
		"]\3\2\2\2\r_\3\2\2\2\17a\3\2\2\2\21c\3\2\2\2\23e\3\2\2\2\25g\3\2\2\2\27"+
		"j\3\2\2\2\31l\3\2\2\2\33n\3\2\2\2\35p\3\2\2\2\37r\3\2\2\2!t\3\2\2\2#v"+
		"\3\2\2\2%|\3\2\2\2\'\u0083\3\2\2\2)\u008a\3\2\2\2+\u008f\3\2\2\2-\u0094"+
		"\3\2\2\2/\u009b\3\2\2\2\61\u00a3\3\2\2\2\63\u00aa\3\2\2\2\65\u00ae\3\2"+
		"\2\2\67\u00b6\3\2\2\29\u00b9\3\2\2\2;\u00be\3\2\2\2=\u00c4\3\2\2\2?\u00d7"+
		"\3\2\2\2A\u00de\3\2\2\2C\u00e3\3\2\2\2E\u00e9\3\2\2\2G\u00ee\3\2\2\2I"+
		"\u00f3\3\2\2\2K\u00f9\3\2\2\2M\u0106\3\2\2\2O\u0108\3\2\2\2Q\u010b\3\2"+
		"\2\2S\u011c\3\2\2\2UV\7*\2\2V\4\3\2\2\2WX\7+\2\2X\6\3\2\2\2YZ\7}\2\2Z"+
		"\b\3\2\2\2[\\\7\177\2\2\\\n\3\2\2\2]^\7]\2\2^\f\3\2\2\2_`\7_\2\2`\16\3"+
		"\2\2\2ab\7=\2\2b\20\3\2\2\2cd\7.\2\2d\22\3\2\2\2ef\7\60\2\2f\24\3\2\2"+
		"\2gh\7(\2\2hi\7(\2\2i\26\3\2\2\2jk\7>\2\2k\30\3\2\2\2lm\7-\2\2m\32\3\2"+
		"\2\2no\7/\2\2o\34\3\2\2\2pq\7,\2\2q\36\3\2\2\2rs\7?\2\2s \3\2\2\2tu\7"+
		"#\2\2u\"\3\2\2\2vw\7e\2\2wx\7n\2\2xy\7c\2\2yz\7u\2\2z{\7u\2\2{$\3\2\2"+
		"\2|}\7r\2\2}~\7w\2\2~\177\7d\2\2\177\u0080\7n\2\2\u0080\u0081\7k\2\2\u0081"+
		"\u0082\7e\2\2\u0082&\3\2\2\2\u0083\u0084\7u\2\2\u0084\u0085\7v\2\2\u0085"+
		"\u0086\7c\2\2\u0086\u0087\7v\2\2\u0087\u0088\7k\2\2\u0088\u0089\7e\2\2"+
		"\u0089(\3\2\2\2\u008a\u008b\7x\2\2\u008b\u008c\7q\2\2\u008c\u008d\7k\2"+
		"\2\u008d\u008e\7f\2\2\u008e*\3\2\2\2\u008f\u0090\7o\2\2\u0090\u0091\7"+
		"c\2\2\u0091\u0092\7k\2\2\u0092\u0093\7p\2\2\u0093,\3\2\2\2\u0094\u0095"+
		"\7U\2\2\u0095\u0096\7v\2\2\u0096\u0097\7t\2\2\u0097\u0098\7k\2\2\u0098"+
		"\u0099\7p\2\2\u0099\u009a\7i\2\2\u009a.\3\2\2\2\u009b\u009c\7g\2\2\u009c"+
		"\u009d\7z\2\2\u009d\u009e\7v\2\2\u009e\u009f\7g\2\2\u009f\u00a0\7p\2\2"+
		"\u00a0\u00a1\7f\2\2\u00a1\u00a2\7u\2\2\u00a2\60\3\2\2\2\u00a3\u00a4\7"+
		"t\2\2\u00a4\u00a5\7g\2\2\u00a5\u00a6\7v\2\2\u00a6\u00a7\7w\2\2\u00a7\u00a8"+
		"\7t\2\2\u00a8\u00a9\7p\2\2\u00a9\62\3\2\2\2\u00aa\u00ab\7k\2\2\u00ab\u00ac"+
		"\7p\2\2\u00ac\u00ad\7v\2\2\u00ad\64\3\2\2\2\u00ae\u00af\7d\2\2\u00af\u00b0"+
		"\7q\2\2\u00b0\u00b1\7q\2\2\u00b1\u00b2\7n\2\2\u00b2\u00b3\7g\2\2\u00b3"+
		"\u00b4\7c\2\2\u00b4\u00b5\7p\2\2\u00b5\66\3\2\2\2\u00b6\u00b7\7k\2\2\u00b7"+
		"\u00b8\7h\2\2\u00b88\3\2\2\2\u00b9\u00ba\7g\2\2\u00ba\u00bb\7n\2\2\u00bb"+
		"\u00bc\7u\2\2\u00bc\u00bd\7g\2\2\u00bd:\3\2\2\2\u00be\u00bf\7y\2\2\u00bf"+
		"\u00c0\7j\2\2\u00c0\u00c1\7k\2\2\u00c1\u00c2\7n\2\2\u00c2\u00c3\7g\2\2"+
		"\u00c3<\3\2\2\2\u00c4\u00c5\7U\2\2\u00c5\u00c6\7{\2\2\u00c6\u00c7\7u\2"+
		"\2\u00c7\u00c8\7v\2\2\u00c8\u00c9\7g\2\2\u00c9\u00ca\7o\2\2\u00ca\u00cb"+
		"\7\60\2\2\u00cb\u00cc\7q\2\2\u00cc\u00cd\7w\2\2\u00cd\u00ce\7v\2\2\u00ce"+
		"\u00cf\7\60\2\2\u00cf\u00d0\7r\2\2\u00d0\u00d1\7t\2\2\u00d1\u00d2\7k\2"+
		"\2\u00d2\u00d3\7p\2\2\u00d3\u00d4\7v\2\2\u00d4\u00d5\7n\2\2\u00d5\u00d6"+
		"\7p\2\2\u00d6>\3\2\2\2\u00d7\u00d8\7n\2\2\u00d8\u00d9\7g\2\2\u00d9\u00da"+
		"\7p\2\2\u00da\u00db\7i\2\2\u00db\u00dc\7v\2\2\u00dc\u00dd\7j\2\2\u00dd"+
		"@\3\2\2\2\u00de\u00df\7v\2\2\u00df\u00e0\7t\2\2\u00e0\u00e1\7w\2\2\u00e1"+
		"\u00e2\7g\2\2\u00e2B\3\2\2\2\u00e3\u00e4\7h\2\2\u00e4\u00e5\7c\2\2\u00e5"+
		"\u00e6\7n\2\2\u00e6\u00e7\7u\2\2\u00e7\u00e8\7g\2\2\u00e8D\3\2\2\2\u00e9"+
		"\u00ea\7v\2\2\u00ea\u00eb\7j\2\2\u00eb\u00ec\7k\2\2\u00ec\u00ed\7u\2\2"+
		"\u00edF\3\2\2\2\u00ee\u00ef\7p\2\2\u00ef\u00f0\7g\2\2\u00f0\u00f1\7y\2"+
		"\2\u00f1H\3\2\2\2\u00f2\u00f4\t\2\2\2\u00f3\u00f2\3\2\2\2\u00f4\u00f5"+
		"\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7"+
		"\u00f8\b%\2\2\u00f8J\3\2\2\2\u00f9\u00fa\7\61\2\2\u00fa\u00fb\7\61\2\2"+
		"\u00fb\u00ff\3\2\2\2\u00fc\u00fe\13\2\2\2\u00fd\u00fc\3\2\2\2\u00fe\u0101"+
		"\3\2\2\2\u00ff\u0100\3\2\2\2\u00ff\u00fd\3\2\2\2\u0100\u0102\3\2\2\2\u0101"+
		"\u00ff\3\2\2\2\u0102\u0103\7\f\2\2\u0103\u0104\3\2\2\2\u0104\u0105\b&"+
		"\2\2\u0105L\3\2\2\2\u0106\u0107\t\3\2\2\u0107N\3\2\2\2\u0108\u0109\t\4"+
		"\2\2\u0109P\3\2\2\2\u010a\u010c\5M\'\2\u010b\u010a\3\2\2\2\u010c\u010d"+
		"\3\2\2\2\u010d\u010b\3\2\2\2\u010d\u010e\3\2\2\2\u010e\u0118\3\2\2\2\u010f"+
		"\u0113\5O(\2\u0110\u0112\5M\'\2\u0111\u0110\3\2\2\2\u0112\u0115\3\2\2"+
		"\2\u0113\u0111\3\2\2\2\u0113\u0114\3\2\2\2\u0114\u0117\3\2\2\2\u0115\u0113"+
		"\3\2\2\2\u0116\u010f\3\2\2\2\u0117\u011a\3\2\2\2\u0118\u0116\3\2\2\2\u0118"+
		"\u0119\3\2\2\2\u0119R\3\2\2\2\u011a\u0118\3\2\2\2\u011b\u011d\5O(\2\u011c"+
		"\u011b\3\2\2\2\u011d\u011e\3\2\2\2\u011e\u011c\3\2\2\2\u011e\u011f\3\2"+
		"\2\2\u011fT\3\2\2\2\t\2\u00f5\u00ff\u010d\u0113\u0118\u011e\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}