// Generated from BythonLexer.g4 by ANTLR 4.3
package oo2.redictado.antlr4;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class BythonLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		DEF=1, LAMBDA=2, RETURN=3, FOR=4, WHILE=5, IF=6, ELSE=7, FROM=8, IMPORT=9, 
		AS=10, ASSIGN=11, SEMI=12, LPAR=13, RPAR=14, LBRACK=15, RBRACK=16, LBRACE=17, 
		RBRACE=18, COMMA=19, COLON=20, CLASS=21, SELF=22, DOT=23, STAR=24, SLASH=25, 
		PLUS=26, MINUS=27, PLUS_ASSIGN=28, MINUS_ASSIGN=29, STAR_ASSIGN=30, SLASH_ASSIGN=31, 
		CallableLiteral=32, NUMBER_LITERAL=33, EQUAL=34, NOTEQUAL=35, LESS=36, 
		GREATER=37, LESSEQUAL=38, GREATEREQUAL=39, AND=40, OR=41, NOT=42, IN=43, 
		IS=44, UNION=45, TRUE=46, FALSE=47, BREAK=48, CONTINUE=49, PASS=50, TRY=51, 
		EXCEPT=52, FINALLY=53, INTEGER_LITERAL=54, DOUBLE_LITERAL=55, STRING_LITERAL=56, 
		ID=57, WS=58, COMMENT=59;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'", "'\\u0017'", "'\\u0018'", 
		"'\\u0019'", "'\\u001A'", "'\\u001B'", "'\\u001C'", "'\\u001D'", "'\\u001E'", 
		"'\\u001F'", "' '", "'!'", "'\"'", "'#'", "'$'", "'%'", "'&'", "'''", 
		"'('", "')'", "'*'", "'+'", "','", "'-'", "'.'", "'/'", "'0'", "'1'", 
		"'2'", "'3'", "'4'", "'5'", "'6'", "'7'", "'8'", "'9'", "':'", "';'"
	};
	public static final String[] ruleNames = {
		"DEF", "LAMBDA", "RETURN", "FOR", "WHILE", "IF", "ELSE", "FROM", "IMPORT", 
		"AS", "ASSIGN", "SEMI", "LPAR", "RPAR", "LBRACK", "RBRACK", "LBRACE", 
		"RBRACE", "COMMA", "COLON", "CLASS", "SELF", "DOT", "STAR", "SLASH", "PLUS", 
		"MINUS", "PLUS_ASSIGN", "MINUS_ASSIGN", "STAR_ASSIGN", "SLASH_ASSIGN", 
		"CallableLiteral", "NUMBER_LITERAL", "EQUAL", "NOTEQUAL", "LESS", "GREATER", 
		"LESSEQUAL", "GREATEREQUAL", "AND", "OR", "NOT", "IN", "IS", "UNION", 
		"TRUE", "FALSE", "BREAK", "CONTINUE", "PASS", "TRY", "EXCEPT", "FINALLY", 
		"INTEGER_LITERAL", "DOUBLE_LITERAL", "STRING_LITERAL", "ID", "WS", "COMMENT"
	};


	public BythonLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "BythonLexer.g4"; }

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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2=\u017a\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\3\2\3"+
		"\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5"+
		"\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3"+
		"\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f"+
		"\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3"+
		"\24\3\24\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3"+
		"\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\35\3"+
		"\36\3\36\3\36\3\37\3\37\3\37\3 \3 \3 \3!\3!\3!\5!\u00e5\n!\3\"\3\"\5\""+
		"\u00e9\n\"\3#\3#\3#\3$\3$\3$\3%\3%\3&\3&\3\'\3\'\3\'\3(\3(\3(\3)\3)\3"+
		")\3)\3*\3*\3*\3+\3+\3+\3+\3,\3,\3,\3-\3-\3-\3.\3.\3/\3/\3/\3/\3/\3\60"+
		"\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\61\3\62\3\62\3\62"+
		"\3\62\3\62\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\63\3\64\3\64\3\64"+
		"\3\64\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3\66\3\66"+
		"\3\66\3\66\3\67\6\67\u0141\n\67\r\67\16\67\u0142\38\68\u0146\n8\r8\16"+
		"8\u0147\38\38\68\u014c\n8\r8\168\u014d\39\39\79\u0152\n9\f9\169\u0155"+
		"\139\39\39\39\79\u015a\n9\f9\169\u015d\139\39\59\u0160\n9\3:\3:\7:\u0164"+
		"\n:\f:\16:\u0167\13:\3;\6;\u016a\n;\r;\16;\u016b\3;\3;\3<\3<\3<\3<\7<"+
		"\u0174\n<\f<\16<\u0177\13<\3<\3<\4\u0153\u015b\2=\3\3\5\4\7\5\t\6\13\7"+
		"\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25"+
		")\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O"+
		")Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s;u<w=\3\2\7\3\2\62"+
		";\5\2C\\aac|\6\2\62;C\\aac|\5\2\13\f\17\17\"\"\4\2\f\f\17\17\u0185\2\3"+
		"\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2"+
		"\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31"+
		"\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2"+
		"\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2"+
		"\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2"+
		"\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2"+
		"I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3"+
		"\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2"+
		"\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2"+
		"o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\3y\3\2\2\2\5}\3"+
		"\2\2\2\7\u0084\3\2\2\2\t\u008b\3\2\2\2\13\u008f\3\2\2\2\r\u0095\3\2\2"+
		"\2\17\u0098\3\2\2\2\21\u009d\3\2\2\2\23\u00a2\3\2\2\2\25\u00a9\3\2\2\2"+
		"\27\u00ac\3\2\2\2\31\u00ae\3\2\2\2\33\u00b0\3\2\2\2\35\u00b2\3\2\2\2\37"+
		"\u00b4\3\2\2\2!\u00b6\3\2\2\2#\u00b8\3\2\2\2%\u00ba\3\2\2\2\'\u00bc\3"+
		"\2\2\2)\u00be\3\2\2\2+\u00c0\3\2\2\2-\u00c6\3\2\2\2/\u00cb\3\2\2\2\61"+
		"\u00cd\3\2\2\2\63\u00cf\3\2\2\2\65\u00d1\3\2\2\2\67\u00d3\3\2\2\29\u00d5"+
		"\3\2\2\2;\u00d8\3\2\2\2=\u00db\3\2\2\2?\u00de\3\2\2\2A\u00e4\3\2\2\2C"+
		"\u00e8\3\2\2\2E\u00ea\3\2\2\2G\u00ed\3\2\2\2I\u00f0\3\2\2\2K\u00f2\3\2"+
		"\2\2M\u00f4\3\2\2\2O\u00f7\3\2\2\2Q\u00fa\3\2\2\2S\u00fe\3\2\2\2U\u0101"+
		"\3\2\2\2W\u0105\3\2\2\2Y\u0108\3\2\2\2[\u010b\3\2\2\2]\u010d\3\2\2\2_"+
		"\u0112\3\2\2\2a\u0118\3\2\2\2c\u011e\3\2\2\2e\u0127\3\2\2\2g\u012c\3\2"+
		"\2\2i\u0130\3\2\2\2k\u0137\3\2\2\2m\u0140\3\2\2\2o\u0145\3\2\2\2q\u015f"+
		"\3\2\2\2s\u0161\3\2\2\2u\u0169\3\2\2\2w\u016f\3\2\2\2yz\7f\2\2z{\7g\2"+
		"\2{|\7h\2\2|\4\3\2\2\2}~\7n\2\2~\177\7c\2\2\177\u0080\7o\2\2\u0080\u0081"+
		"\7d\2\2\u0081\u0082\7f\2\2\u0082\u0083\7c\2\2\u0083\6\3\2\2\2\u0084\u0085"+
		"\7t\2\2\u0085\u0086\7g\2\2\u0086\u0087\7v\2\2\u0087\u0088\7w\2\2\u0088"+
		"\u0089\7t\2\2\u0089\u008a\7p\2\2\u008a\b\3\2\2\2\u008b\u008c\7h\2\2\u008c"+
		"\u008d\7q\2\2\u008d\u008e\7t\2\2\u008e\n\3\2\2\2\u008f\u0090\7y\2\2\u0090"+
		"\u0091\7j\2\2\u0091\u0092\7k\2\2\u0092\u0093\7n\2\2\u0093\u0094\7g\2\2"+
		"\u0094\f\3\2\2\2\u0095\u0096\7k\2\2\u0096\u0097\7h\2\2\u0097\16\3\2\2"+
		"\2\u0098\u0099\7g\2\2\u0099\u009a\7n\2\2\u009a\u009b\7u\2\2\u009b\u009c"+
		"\7g\2\2\u009c\20\3\2\2\2\u009d\u009e\7h\2\2\u009e\u009f\7t\2\2\u009f\u00a0"+
		"\7q\2\2\u00a0\u00a1\7o\2\2\u00a1\22\3\2\2\2\u00a2\u00a3\7k\2\2\u00a3\u00a4"+
		"\7o\2\2\u00a4\u00a5\7r\2\2\u00a5\u00a6\7q\2\2\u00a6\u00a7\7t\2\2\u00a7"+
		"\u00a8\7v\2\2\u00a8\24\3\2\2\2\u00a9\u00aa\7c\2\2\u00aa\u00ab\7u\2\2\u00ab"+
		"\26\3\2\2\2\u00ac\u00ad\7?\2\2\u00ad\30\3\2\2\2\u00ae\u00af\7=\2\2\u00af"+
		"\32\3\2\2\2\u00b0\u00b1\7*\2\2\u00b1\34\3\2\2\2\u00b2\u00b3\7+\2\2\u00b3"+
		"\36\3\2\2\2\u00b4\u00b5\7]\2\2\u00b5 \3\2\2\2\u00b6\u00b7\7_\2\2\u00b7"+
		"\"\3\2\2\2\u00b8\u00b9\7}\2\2\u00b9$\3\2\2\2\u00ba\u00bb\7\177\2\2\u00bb"+
		"&\3\2\2\2\u00bc\u00bd\7.\2\2\u00bd(\3\2\2\2\u00be\u00bf\7<\2\2\u00bf*"+
		"\3\2\2\2\u00c0\u00c1\7e\2\2\u00c1\u00c2\7n\2\2\u00c2\u00c3\7c\2\2\u00c3"+
		"\u00c4\7u\2\2\u00c4\u00c5\7u\2\2\u00c5,\3\2\2\2\u00c6\u00c7\7u\2\2\u00c7"+
		"\u00c8\7g\2\2\u00c8\u00c9\7n\2\2\u00c9\u00ca\7h\2\2\u00ca.\3\2\2\2\u00cb"+
		"\u00cc\7\60\2\2\u00cc\60\3\2\2\2\u00cd\u00ce\7,\2\2\u00ce\62\3\2\2\2\u00cf"+
		"\u00d0\7\61\2\2\u00d0\64\3\2\2\2\u00d1\u00d2\7-\2\2\u00d2\66\3\2\2\2\u00d3"+
		"\u00d4\7/\2\2\u00d48\3\2\2\2\u00d5\u00d6\7-\2\2\u00d6\u00d7\7?\2\2\u00d7"+
		":\3\2\2\2\u00d8\u00d9\7/\2\2\u00d9\u00da\7?\2\2\u00da<\3\2\2\2\u00db\u00dc"+
		"\7,\2\2\u00dc\u00dd\7?\2\2\u00dd>\3\2\2\2\u00de\u00df\7\61\2\2\u00df\u00e0"+
		"\7?\2\2\u00e0@\3\2\2\2\u00e1\u00e5\5q9\2\u00e2\u00e5\5]/\2\u00e3\u00e5"+
		"\5_\60\2\u00e4\u00e1\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e4\u00e3\3\2\2\2\u00e5"+
		"B\3\2\2\2\u00e6\u00e9\5m\67\2\u00e7\u00e9\5o8\2\u00e8\u00e6\3\2\2\2\u00e8"+
		"\u00e7\3\2\2\2\u00e9D\3\2\2\2\u00ea\u00eb\7?\2\2\u00eb\u00ec\7?\2\2\u00ec"+
		"F\3\2\2\2\u00ed\u00ee\7#\2\2\u00ee\u00ef\7?\2\2\u00efH\3\2\2\2\u00f0\u00f1"+
		"\7>\2\2\u00f1J\3\2\2\2\u00f2\u00f3\7@\2\2\u00f3L\3\2\2\2\u00f4\u00f5\7"+
		">\2\2\u00f5\u00f6\7?\2\2\u00f6N\3\2\2\2\u00f7\u00f8\7@\2\2\u00f8\u00f9"+
		"\7?\2\2\u00f9P\3\2\2\2\u00fa\u00fb\7c\2\2\u00fb\u00fc\7p\2\2\u00fc\u00fd"+
		"\7f\2\2\u00fdR\3\2\2\2\u00fe\u00ff\7q\2\2\u00ff\u0100\7t\2\2\u0100T\3"+
		"\2\2\2\u0101\u0102\7p\2\2\u0102\u0103\7q\2\2\u0103\u0104\7v\2\2\u0104"+
		"V\3\2\2\2\u0105\u0106\7k\2\2\u0106\u0107\7p\2\2\u0107X\3\2\2\2\u0108\u0109"+
		"\7k\2\2\u0109\u010a\7u\2\2\u010aZ\3\2\2\2\u010b\u010c\7~\2\2\u010c\\\3"+
		"\2\2\2\u010d\u010e\7V\2\2\u010e\u010f\7t\2\2\u010f\u0110\7w\2\2\u0110"+
		"\u0111\7g\2\2\u0111^\3\2\2\2\u0112\u0113\7H\2\2\u0113\u0114\7c\2\2\u0114"+
		"\u0115\7n\2\2\u0115\u0116\7u\2\2\u0116\u0117\7g\2\2\u0117`\3\2\2\2\u0118"+
		"\u0119\7d\2\2\u0119\u011a\7t\2\2\u011a\u011b\7g\2\2\u011b\u011c\7c\2\2"+
		"\u011c\u011d\7m\2\2\u011db\3\2\2\2\u011e\u011f\7e\2\2\u011f\u0120\7q\2"+
		"\2\u0120\u0121\7p\2\2\u0121\u0122\7v\2\2\u0122\u0123\7k\2\2\u0123\u0124"+
		"\7p\2\2\u0124\u0125\7w\2\2\u0125\u0126\7g\2\2\u0126d\3\2\2\2\u0127\u0128"+
		"\7r\2\2\u0128\u0129\7c\2\2\u0129\u012a\7u\2\2\u012a\u012b\7u\2\2\u012b"+
		"f\3\2\2\2\u012c\u012d\7v\2\2\u012d\u012e\7t\2\2\u012e\u012f\7{\2\2\u012f"+
		"h\3\2\2\2\u0130\u0131\7g\2\2\u0131\u0132\7z\2\2\u0132\u0133\7e\2\2\u0133"+
		"\u0134\7g\2\2\u0134\u0135\7r\2\2\u0135\u0136\7v\2\2\u0136j\3\2\2\2\u0137"+
		"\u0138\7h\2\2\u0138\u0139\7k\2\2\u0139\u013a\7p\2\2\u013a\u013b\7c\2\2"+
		"\u013b\u013c\7n\2\2\u013c\u013d\7n\2\2\u013d\u013e\7{\2\2\u013el\3\2\2"+
		"\2\u013f\u0141\t\2\2\2\u0140\u013f\3\2\2\2\u0141\u0142\3\2\2\2\u0142\u0140"+
		"\3\2\2\2\u0142\u0143\3\2\2\2\u0143n\3\2\2\2\u0144\u0146\t\2\2\2\u0145"+
		"\u0144\3\2\2\2\u0146\u0147\3\2\2\2\u0147\u0145\3\2\2\2\u0147\u0148\3\2"+
		"\2\2\u0148\u0149\3\2\2\2\u0149\u014b\7\60\2\2\u014a\u014c\t\2\2\2\u014b"+
		"\u014a\3\2\2\2\u014c\u014d\3\2\2\2\u014d\u014b\3\2\2\2\u014d\u014e\3\2"+
		"\2\2\u014ep\3\2\2\2\u014f\u0153\7$\2\2\u0150\u0152\13\2\2\2\u0151\u0150"+
		"\3\2\2\2\u0152\u0155\3\2\2\2\u0153\u0154\3\2\2\2\u0153\u0151\3\2\2\2\u0154"+
		"\u0156\3\2\2\2\u0155\u0153\3\2\2\2\u0156\u0160\7$\2\2\u0157\u015b\7)\2"+
		"\2\u0158\u015a\13\2\2\2\u0159\u0158\3\2\2\2\u015a\u015d\3\2\2\2\u015b"+
		"\u015c\3\2\2\2\u015b\u0159\3\2\2\2\u015c\u015e\3\2\2\2\u015d\u015b\3\2"+
		"\2\2\u015e\u0160\7)\2\2\u015f\u014f\3\2\2\2\u015f\u0157\3\2\2\2\u0160"+
		"r\3\2\2\2\u0161\u0165\t\3\2\2\u0162\u0164\t\4\2\2\u0163\u0162\3\2\2\2"+
		"\u0164\u0167\3\2\2\2\u0165\u0163\3\2\2\2\u0165\u0166\3\2\2\2\u0166t\3"+
		"\2\2\2\u0167\u0165\3\2\2\2\u0168\u016a\t\5\2\2\u0169\u0168\3\2\2\2\u016a"+
		"\u016b\3\2\2\2\u016b\u0169\3\2\2\2\u016b\u016c\3\2\2\2\u016c\u016d\3\2"+
		"\2\2\u016d\u016e\b;\2\2\u016ev\3\2\2\2\u016f\u0170\7\61\2\2\u0170\u0171"+
		"\7\61\2\2\u0171\u0175\3\2\2\2\u0172\u0174\n\6\2\2\u0173\u0172\3\2\2\2"+
		"\u0174\u0177\3\2\2\2\u0175\u0173\3\2\2\2\u0175\u0176\3\2\2\2\u0176\u0178"+
		"\3\2\2\2\u0177\u0175\3\2\2\2\u0178\u0179\b<\2\2\u0179x\3\2\2\2\16\2\u00e4"+
		"\u00e8\u0142\u0147\u014d\u0153\u015b\u015f\u0165\u016b\u0175\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}