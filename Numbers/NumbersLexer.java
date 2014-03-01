// Generated from Numbers.g4 by ANTLR 4.2

package numbers;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class NumbersLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__6=1, T__5=2, T__4=3, T__3=4, T__2=5, T__1=6, T__0=7, STMTEND=8, ROMANNUMERAL=9, 
		WS=10, NUMBER=11, DECIMAL=12, OP=13, DOT=14;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'/'", "'%'", "'('", "')'", "'*'", "'+'", "'-'", "STMTEND", "ROMANNUMERAL", 
		"WS", "NUMBER", "DECIMAL", "OP", "'.'"
	};
	public static final String[] ruleNames = {
		"T__6", "T__5", "T__4", "T__3", "T__2", "T__1", "T__0", "STMTEND", "SEMICOLON", 
		"NEWLINE", "DIGIT", "ROMANNUMERAL", "WS", "NUMBER", "DECIMAL", "OP", "DOT"
	};


	public NumbersLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Numbers.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\20x\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\7\t\65\n"+
		"\t\f\t\16\t8\13\t\3\t\3\t\7\t<\n\t\f\t\16\t?\13\t\3\t\7\tB\n\t\f\t\16"+
		"\tE\13\t\3\t\6\tH\n\t\r\t\16\tI\5\tL\n\t\3\t\3\t\3\n\3\n\3\13\3\13\3\13"+
		"\5\13U\n\13\3\f\3\f\3\r\6\rZ\n\r\r\r\16\r[\3\16\6\16_\n\16\r\16\16\16"+
		"`\3\16\3\16\3\17\6\17f\n\17\r\17\16\17g\3\20\6\20k\n\20\r\20\16\20l\3"+
		"\20\3\20\6\20q\n\20\r\20\16\20r\3\21\3\21\3\22\3\22\2\2\23\3\3\5\4\7\5"+
		"\t\6\13\7\r\b\17\t\21\n\23\2\25\2\27\2\31\13\33\f\35\r\37\16!\17#\20\3"+
		"\2\7\4\2\f\f\17\17\3\2\62;\7\2EFKKNOXXZZ\4\2\13\13\"\"\5\2,-//\61\61\177"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2"+
		"\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\3%\3\2\2\2\5\'\3\2\2\2\7)\3\2\2\2"+
		"\t+\3\2\2\2\13-\3\2\2\2\r/\3\2\2\2\17\61\3\2\2\2\21K\3\2\2\2\23O\3\2\2"+
		"\2\25T\3\2\2\2\27V\3\2\2\2\31Y\3\2\2\2\33^\3\2\2\2\35e\3\2\2\2\37j\3\2"+
		"\2\2!t\3\2\2\2#v\3\2\2\2%&\7\61\2\2&\4\3\2\2\2\'(\7\'\2\2(\6\3\2\2\2)"+
		"*\7*\2\2*\b\3\2\2\2+,\7+\2\2,\n\3\2\2\2-.\7,\2\2.\f\3\2\2\2/\60\7-\2\2"+
		"\60\16\3\2\2\2\61\62\7/\2\2\62\20\3\2\2\2\63\65\5\33\16\2\64\63\3\2\2"+
		"\2\658\3\2\2\2\66\64\3\2\2\2\66\67\3\2\2\2\679\3\2\2\28\66\3\2\2\29=\5"+
		"\23\n\2:<\5\25\13\2;:\3\2\2\2<?\3\2\2\2=;\3\2\2\2=>\3\2\2\2>L\3\2\2\2"+
		"?=\3\2\2\2@B\5\33\16\2A@\3\2\2\2BE\3\2\2\2CA\3\2\2\2CD\3\2\2\2DG\3\2\2"+
		"\2EC\3\2\2\2FH\5\25\13\2GF\3\2\2\2HI\3\2\2\2IG\3\2\2\2IJ\3\2\2\2JL\3\2"+
		"\2\2K\66\3\2\2\2KC\3\2\2\2LM\3\2\2\2MN\b\t\2\2N\22\3\2\2\2OP\7=\2\2P\24"+
		"\3\2\2\2QR\7\17\2\2RU\7\f\2\2SU\t\2\2\2TQ\3\2\2\2TS\3\2\2\2U\26\3\2\2"+
		"\2VW\t\3\2\2W\30\3\2\2\2XZ\t\4\2\2YX\3\2\2\2Z[\3\2\2\2[Y\3\2\2\2[\\\3"+
		"\2\2\2\\\32\3\2\2\2]_\t\5\2\2^]\3\2\2\2_`\3\2\2\2`^\3\2\2\2`a\3\2\2\2"+
		"ab\3\2\2\2bc\b\16\2\2c\34\3\2\2\2df\5\27\f\2ed\3\2\2\2fg\3\2\2\2ge\3\2"+
		"\2\2gh\3\2\2\2h\36\3\2\2\2ik\5\27\f\2ji\3\2\2\2kl\3\2\2\2lj\3\2\2\2lm"+
		"\3\2\2\2mn\3\2\2\2np\7\60\2\2oq\5\27\f\2po\3\2\2\2qr\3\2\2\2rp\3\2\2\2"+
		"rs\3\2\2\2s \3\2\2\2tu\t\6\2\2u\"\3\2\2\2vw\7\60\2\2w$\3\2\2\2\16\2\66"+
		"=CIKT[`glr\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}