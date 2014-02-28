// Generated from Numbers.g4 by ANTLR 4.1

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
		T__6=1, T__5=2, T__4=3, T__3=4, T__2=5, T__1=6, T__0=7, STMTEND=8, WS=9, 
		NUMBER=10, OP=11, DOT=12;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'%'", "')'", "'+'", "'*'", "'-'", "'('", "'/'", "STMTEND", "WS", "NUMBER", 
		"OP", "'.'"
	};
	public static final String[] ruleNames = {
		"T__6", "T__5", "T__4", "T__3", "T__2", "T__1", "T__0", "STMTEND", "SEMICOLON", 
		"NEWLINE", "DIGIT", "WS", "NUMBER", "OP", "DOT"
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
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 7: STMTEND_action((RuleContext)_localctx, actionIndex); break;

		case 11: WS_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1: skip();  break;
		}
	}
	private void STMTEND_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2\16d\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\3\3\3\3\4"+
		"\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\7\t\61\n\t\f\t\16\t\64\13\t\3"+
		"\t\3\t\7\t8\n\t\f\t\16\t;\13\t\3\t\7\t>\n\t\f\t\16\tA\13\t\3\t\6\tD\n"+
		"\t\r\t\16\tE\5\tH\n\t\3\t\3\t\3\n\3\n\3\13\3\13\3\13\5\13Q\n\13\3\f\3"+
		"\f\3\r\6\rV\n\r\r\r\16\rW\3\r\3\r\3\16\6\16]\n\16\r\16\16\16^\3\17\3\17"+
		"\3\20\3\20\2\21\3\3\1\5\4\1\7\5\1\t\6\1\13\7\1\r\b\1\17\t\1\21\n\2\23"+
		"\2\1\25\2\1\27\2\1\31\13\3\33\f\1\35\r\1\37\16\1\3\2\6\4\2\f\f\17\17\3"+
		"\2\62;\4\2\13\13\"\"\5\2,-//\61\61h\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2"+
		"\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\31"+
		"\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\3!\3\2\2\2\5#\3\2\2\2"+
		"\7%\3\2\2\2\t\'\3\2\2\2\13)\3\2\2\2\r+\3\2\2\2\17-\3\2\2\2\21G\3\2\2\2"+
		"\23K\3\2\2\2\25P\3\2\2\2\27R\3\2\2\2\31U\3\2\2\2\33\\\3\2\2\2\35`\3\2"+
		"\2\2\37b\3\2\2\2!\"\7\'\2\2\"\4\3\2\2\2#$\7+\2\2$\6\3\2\2\2%&\7-\2\2&"+
		"\b\3\2\2\2\'(\7,\2\2(\n\3\2\2\2)*\7/\2\2*\f\3\2\2\2+,\7*\2\2,\16\3\2\2"+
		"\2-.\7\61\2\2.\20\3\2\2\2/\61\5\31\r\2\60/\3\2\2\2\61\64\3\2\2\2\62\60"+
		"\3\2\2\2\62\63\3\2\2\2\63\65\3\2\2\2\64\62\3\2\2\2\659\5\23\n\2\668\5"+
		"\25\13\2\67\66\3\2\2\28;\3\2\2\29\67\3\2\2\29:\3\2\2\2:H\3\2\2\2;9\3\2"+
		"\2\2<>\5\31\r\2=<\3\2\2\2>A\3\2\2\2?=\3\2\2\2?@\3\2\2\2@C\3\2\2\2A?\3"+
		"\2\2\2BD\5\25\13\2CB\3\2\2\2DE\3\2\2\2EC\3\2\2\2EF\3\2\2\2FH\3\2\2\2G"+
		"\62\3\2\2\2G?\3\2\2\2HI\3\2\2\2IJ\b\t\2\2J\22\3\2\2\2KL\7=\2\2L\24\3\2"+
		"\2\2MN\7\17\2\2NQ\7\f\2\2OQ\t\2\2\2PM\3\2\2\2PO\3\2\2\2Q\26\3\2\2\2RS"+
		"\t\3\2\2S\30\3\2\2\2TV\t\4\2\2UT\3\2\2\2VW\3\2\2\2WU\3\2\2\2WX\3\2\2\2"+
		"XY\3\2\2\2YZ\b\r\3\2Z\32\3\2\2\2[]\5\27\f\2\\[\3\2\2\2]^\3\2\2\2^\\\3"+
		"\2\2\2^_\3\2\2\2_\34\3\2\2\2`a\t\5\2\2a\36\3\2\2\2bc\7\60\2\2c \3\2\2"+
		"\2\13\2\629?EGPW^";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}