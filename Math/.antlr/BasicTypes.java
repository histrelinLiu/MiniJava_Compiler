// Generated from c:\Users\15307\Desktop\MiniJava_Compiler\Math\BasicTypes.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class BasicTypes extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NUMBER=1, STRING=2, ID=3, WS=4;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"DIGIT", "S_QUOTE", "QUOTE", "ALPHABET", "NUMBER", "STRING", "ID", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "NUMBER", "STRING", "ID", "WS"
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


	public BasicTypes(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "BasicTypes.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\6V\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\3\3\3\3"+
		"\3\4\3\4\3\5\3\5\3\6\6\6\35\n\6\r\6\16\6\36\3\6\3\6\6\6#\n\6\r\6\16\6"+
		"$\5\6\'\n\6\3\7\3\7\7\7+\n\7\f\7\16\7.\13\7\3\7\3\7\3\7\3\7\3\7\3\7\7"+
		"\7\66\n\7\f\7\16\79\13\7\3\7\3\7\5\7=\n\7\3\b\6\b@\n\b\r\b\16\bA\3\b\3"+
		"\b\7\bF\n\b\f\b\16\bI\13\b\7\bK\n\b\f\b\16\bN\13\b\3\t\6\tQ\n\t\r\t\16"+
		"\tR\3\t\3\t\2\2\n\3\2\5\2\7\2\t\2\13\3\r\4\17\5\21\6\3\2\7\3\2\62;\5\2"+
		"C\\aac|\3\2))\3\2$$\5\2\13\f\17\17\"\"\2\\\2\13\3\2\2\2\2\r\3\2\2\2\2"+
		"\17\3\2\2\2\2\21\3\2\2\2\3\23\3\2\2\2\5\25\3\2\2\2\7\27\3\2\2\2\t\31\3"+
		"\2\2\2\13\34\3\2\2\2\r<\3\2\2\2\17?\3\2\2\2\21P\3\2\2\2\23\24\t\2\2\2"+
		"\24\4\3\2\2\2\25\26\7)\2\2\26\6\3\2\2\2\27\30\7$\2\2\30\b\3\2\2\2\31\32"+
		"\t\3\2\2\32\n\3\2\2\2\33\35\5\3\2\2\34\33\3\2\2\2\35\36\3\2\2\2\36\34"+
		"\3\2\2\2\36\37\3\2\2\2\37&\3\2\2\2 \"\7\60\2\2!#\5\3\2\2\"!\3\2\2\2#$"+
		"\3\2\2\2$\"\3\2\2\2$%\3\2\2\2%\'\3\2\2\2& \3\2\2\2&\'\3\2\2\2\'\f\3\2"+
		"\2\2(,\5\5\3\2)+\n\4\2\2*)\3\2\2\2+.\3\2\2\2,*\3\2\2\2,-\3\2\2\2-/\3\2"+
		"\2\2.,\3\2\2\2/\60\5\5\3\2\60=\3\2\2\2\61\67\5\7\4\2\62\63\7^\2\2\63\66"+
		"\7$\2\2\64\66\n\5\2\2\65\62\3\2\2\2\65\64\3\2\2\2\669\3\2\2\2\67\65\3"+
		"\2\2\2\678\3\2\2\28:\3\2\2\29\67\3\2\2\2:;\5\7\4\2;=\3\2\2\2<(\3\2\2\2"+
		"<\61\3\2\2\2=\16\3\2\2\2>@\5\t\5\2?>\3\2\2\2@A\3\2\2\2A?\3\2\2\2AB\3\2"+
		"\2\2BL\3\2\2\2CG\5\3\2\2DF\5\t\5\2ED\3\2\2\2FI\3\2\2\2GE\3\2\2\2GH\3\2"+
		"\2\2HK\3\2\2\2IG\3\2\2\2JC\3\2\2\2KN\3\2\2\2LJ\3\2\2\2LM\3\2\2\2M\20\3"+
		"\2\2\2NL\3\2\2\2OQ\t\6\2\2PO\3\2\2\2QR\3\2\2\2RP\3\2\2\2RS\3\2\2\2ST\3"+
		"\2\2\2TU\b\t\2\2U\22\3\2\2\2\16\2\36$&,\65\67<AGLR\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}