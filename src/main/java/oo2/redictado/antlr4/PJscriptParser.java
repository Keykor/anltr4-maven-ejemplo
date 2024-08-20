// Generated from PJscriptParser.g4 by ANTLR 4.3
package oo2.redictado.antlr4;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PJscriptParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NEW=1, EXTENDS=17, SEMI=9, RPAR=11, CLASS=15, ASSIGN=8, COMMENT=41, MINUS=22, 
		RETURN=3, Identifier=36, LPAR=10, ELSE=7, WS=40, IF=6, IntegerLiteral=37, 
		COMMA=14, LESSEQUAL=29, OR=32, DEF=2, EQUAL=25, FOR=4, DOT=18, SLASH=20, 
		GREATER=28, TRUE=34, NOTEQUAL=26, NOT=33, RBRACE=13, STAR=19, StringLiteral=39, 
		CallableLiteral=23, AND=31, GREATEREQUAL=30, THIS=16, WHILE=5, LESS=27, 
		FALSE=35, DoubleLiteral=38, NumberLiteral=24, LBRACE=12, PLUS=21;
	public static final String[] tokenNames = {
		"<INVALID>", "'new'", "'def'", "'return'", "'for'", "'while'", "'if'", 
		"'else'", "'='", "';'", "'('", "')'", "'{'", "'}'", "','", "'class'", 
		"'this'", "'extends'", "'.'", "'*'", "'/'", "'+'", "'-'", "CallableLiteral", 
		"NumberLiteral", "'=='", "'!='", "'<'", "'>'", "'<='", "'>='", "'and'", 
		"'or'", "'not'", "'True'", "'False'", "Identifier", "IntegerLiteral", 
		"DoubleLiteral", "StringLiteral", "WS", "COMMENT"
	};
	public static final int
		RULE_program = 0, RULE_classDecl = 1, RULE_classMember = 2, RULE_methodDecl = 3, 
		RULE_variableDecl = 4, RULE_parameterList = 5, RULE_block = 6, RULE_statement = 7, 
		RULE_assignment = 8, RULE_methodCall = 9, RULE_ifStatement = 10, RULE_whileStatement = 11, 
		RULE_forStatement = 12, RULE_returnStatement = 13, RULE_expression = 14, 
		RULE_valueExpression = 15, RULE_callableExpression = 16, RULE_objectInstantation = 17, 
		RULE_objectProperty = 18, RULE_argumentList = 19;
	public static final String[] ruleNames = {
		"program", "classDecl", "classMember", "methodDecl", "variableDecl", "parameterList", 
		"block", "statement", "assignment", "methodCall", "ifStatement", "whileStatement", 
		"forStatement", "returnStatement", "expression", "valueExpression", "callableExpression", 
		"objectInstantation", "objectProperty", "argumentList"
	};

	@Override
	public String getGrammarFileName() { return "PJscriptParser.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PJscriptParser(CommonTokenStream tokens) {
		super(tokens);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public List<MethodDeclContext> methodDecl() {
			return getRuleContexts(MethodDeclContext.class);
		}
		public TerminalNode EOF() { return getToken(PJscriptParser.EOF, 0); }
		public ClassDeclContext classDecl(int i) {
			return getRuleContext(ClassDeclContext.class,i);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public List<ClassDeclContext> classDecl() {
			return getRuleContexts(ClassDeclContext.class);
		}
		public MethodDeclContext methodDecl(int i) {
			return getRuleContext(MethodDeclContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PJscriptParserListener ) ((PJscriptParserListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PJscriptParserListener ) ((PJscriptParserListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJscriptParserVisitor ) return ((PJscriptParserVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << DEF) | (1L << RETURN) | (1L << FOR) | (1L << WHILE) | (1L << IF) | (1L << LPAR) | (1L << LBRACE) | (1L << CLASS) | (1L << THIS) | (1L << CallableLiteral) | (1L << NumberLiteral) | (1L << NOT) | (1L << Identifier))) != 0)) {
				{
				setState(43);
				switch (_input.LA(1)) {
				case CLASS:
					{
					setState(40); classDecl();
					}
					break;
				case DEF:
					{
					setState(41); methodDecl();
					}
					break;
				case NEW:
				case RETURN:
				case FOR:
				case WHILE:
				case IF:
				case LPAR:
				case LBRACE:
				case THIS:
				case CallableLiteral:
				case NumberLiteral:
				case NOT:
				case Identifier:
					{
					setState(42); statement();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(47);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(48); match(EOF);
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

	public static class ClassDeclContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(PJscriptParser.Identifier); }
		public TerminalNode RBRACE() { return getToken(PJscriptParser.RBRACE, 0); }
		public TerminalNode Identifier(int i) {
			return getToken(PJscriptParser.Identifier, i);
		}
		public ClassMemberContext classMember(int i) {
			return getRuleContext(ClassMemberContext.class,i);
		}
		public TerminalNode LBRACE() { return getToken(PJscriptParser.LBRACE, 0); }
		public List<ClassMemberContext> classMember() {
			return getRuleContexts(ClassMemberContext.class);
		}
		public TerminalNode CLASS() { return getToken(PJscriptParser.CLASS, 0); }
		public TerminalNode EXTENDS() { return getToken(PJscriptParser.EXTENDS, 0); }
		public ClassDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PJscriptParserListener ) ((PJscriptParserListener)listener).enterClassDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PJscriptParserListener ) ((PJscriptParserListener)listener).exitClassDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJscriptParserVisitor ) return ((PJscriptParserVisitor<? extends T>)visitor).visitClassDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDeclContext classDecl() throws RecognitionException {
		ClassDeclContext _localctx = new ClassDeclContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_classDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50); match(CLASS);
			setState(51); match(Identifier);
			setState(54);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(52); match(EXTENDS);
				setState(53); match(Identifier);
				}
			}

			setState(56); match(LBRACE);
			setState(60);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DEF || _la==Identifier) {
				{
				{
				setState(57); classMember();
				}
				}
				setState(62);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(63); match(RBRACE);
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

	public static class ClassMemberContext extends ParserRuleContext {
		public MethodDeclContext methodDecl() {
			return getRuleContext(MethodDeclContext.class,0);
		}
		public VariableDeclContext variableDecl() {
			return getRuleContext(VariableDeclContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(PJscriptParser.SEMI, 0); }
		public ClassMemberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classMember; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PJscriptParserListener ) ((PJscriptParserListener)listener).enterClassMember(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PJscriptParserListener ) ((PJscriptParserListener)listener).exitClassMember(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJscriptParserVisitor ) return ((PJscriptParserVisitor<? extends T>)visitor).visitClassMember(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassMemberContext classMember() throws RecognitionException {
		ClassMemberContext _localctx = new ClassMemberContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_classMember);
		try {
			setState(69);
			switch (_input.LA(1)) {
			case DEF:
				enterOuterAlt(_localctx, 1);
				{
				setState(65); methodDecl();
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(66); variableDecl();
				setState(67); match(SEMI);
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

	public static class MethodDeclContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(PJscriptParser.Identifier, 0); }
		public TerminalNode DEF() { return getToken(PJscriptParser.DEF, 0); }
		public TerminalNode LPAR() { return getToken(PJscriptParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(PJscriptParser.RPAR, 0); }
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public MethodDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PJscriptParserListener ) ((PJscriptParserListener)listener).enterMethodDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PJscriptParserListener ) ((PJscriptParserListener)listener).exitMethodDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJscriptParserVisitor ) return ((PJscriptParserVisitor<? extends T>)visitor).visitMethodDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodDeclContext methodDecl() throws RecognitionException {
		MethodDeclContext _localctx = new MethodDeclContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_methodDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71); match(DEF);
			setState(72); match(Identifier);
			setState(73); match(LPAR);
			setState(75);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(74); parameterList();
				}
			}

			setState(77); match(RPAR);
			setState(78); block();
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

	public static class VariableDeclContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(PJscriptParser.Identifier, 0); }
		public TerminalNode ASSIGN() { return getToken(PJscriptParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PJscriptParserListener ) ((PJscriptParserListener)listener).enterVariableDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PJscriptParserListener ) ((PJscriptParserListener)listener).exitVariableDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJscriptParserVisitor ) return ((PJscriptParserVisitor<? extends T>)visitor).visitVariableDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclContext variableDecl() throws RecognitionException {
		VariableDeclContext _localctx = new VariableDeclContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_variableDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80); match(Identifier);
			setState(83);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(81); match(ASSIGN);
				setState(82); expression();
				}
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

	public static class ParameterListContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(PJscriptParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(PJscriptParser.Identifier, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PJscriptParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PJscriptParser.COMMA, i);
		}
		public ParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PJscriptParserListener ) ((PJscriptParserListener)listener).enterParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PJscriptParserListener ) ((PJscriptParserListener)listener).exitParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJscriptParserVisitor ) return ((PJscriptParserVisitor<? extends T>)visitor).visitParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		ParameterListContext _localctx = new ParameterListContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_parameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85); match(Identifier);
			setState(90);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(86); match(COMMA);
				setState(87); match(Identifier);
				}
				}
				setState(92);
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

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode RBRACE() { return getToken(PJscriptParser.RBRACE, 0); }
		public TerminalNode LBRACE() { return getToken(PJscriptParser.LBRACE, 0); }
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PJscriptParserListener ) ((PJscriptParserListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PJscriptParserListener ) ((PJscriptParserListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJscriptParserVisitor ) return ((PJscriptParserVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93); match(LBRACE);
			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << RETURN) | (1L << FOR) | (1L << WHILE) | (1L << IF) | (1L << LPAR) | (1L << LBRACE) | (1L << THIS) | (1L << CallableLiteral) | (1L << NumberLiteral) | (1L << NOT) | (1L << Identifier))) != 0)) {
				{
				{
				setState(94); statement();
				}
				}
				setState(99);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(100); match(RBRACE);
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
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(PJscriptParser.SEMI, 0); }
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PJscriptParserListener ) ((PJscriptParserListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PJscriptParserListener ) ((PJscriptParserListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJscriptParserVisitor ) return ((PJscriptParserVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_statement);
		try {
			setState(110);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(102); block();
				}
				break;
			case NEW:
			case LPAR:
			case THIS:
			case CallableLiteral:
			case NumberLiteral:
			case NOT:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(103); expression();
				setState(104); match(SEMI);
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 3);
				{
				setState(106); ifStatement();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 4);
				{
				setState(107); whileStatement();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 5);
				{
				setState(108); forStatement();
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 6);
				{
				setState(109); returnStatement();
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

	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode ASSIGN() { return getToken(PJscriptParser.ASSIGN, 0); }
		public TerminalNode Identifier() { return getToken(PJscriptParser.Identifier, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ObjectPropertyContext objectProperty() {
			return getRuleContext(ObjectPropertyContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PJscriptParserListener ) ((PJscriptParserListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PJscriptParserListener ) ((PJscriptParserListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJscriptParserVisitor ) return ((PJscriptParserVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(112); match(Identifier);
				}
				break;

			case 2:
				{
				setState(113); objectProperty();
				}
				break;
			}
			setState(116); match(ASSIGN);
			setState(117); expression();
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

	public static class MethodCallContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(PJscriptParser.Identifier, 0); }
		public List<TerminalNode> DOT() { return getTokens(PJscriptParser.DOT); }
		public MethodCallContext methodCall() {
			return getRuleContext(MethodCallContext.class,0);
		}
		public TerminalNode LPAR() { return getToken(PJscriptParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(PJscriptParser.RPAR, 0); }
		public CallableExpressionContext callableExpression() {
			return getRuleContext(CallableExpressionContext.class,0);
		}
		public TerminalNode DOT(int i) {
			return getToken(PJscriptParser.DOT, i);
		}
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public MethodCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PJscriptParserListener ) ((PJscriptParserListener)listener).enterMethodCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PJscriptParserListener ) ((PJscriptParserListener)listener).exitMethodCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJscriptParserVisitor ) return ((PJscriptParserVisitor<? extends T>)visitor).visitMethodCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodCallContext methodCall() throws RecognitionException {
		MethodCallContext _localctx = new MethodCallContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_methodCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(119); callableExpression();
				setState(120); match(DOT);
				}
				break;
			}
			setState(124); match(Identifier);
			setState(125); match(LPAR);
			setState(127);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << LPAR) | (1L << THIS) | (1L << CallableLiteral) | (1L << NumberLiteral) | (1L << NOT) | (1L << Identifier))) != 0)) {
				{
				setState(126); argumentList();
				}
			}

			setState(129); match(RPAR);
			setState(132);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(130); match(DOT);
				setState(131); methodCall();
				}
				break;
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

	public static class IfStatementContext extends ParserRuleContext {
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public TerminalNode ELSE() { return getToken(PJscriptParser.ELSE, 0); }
		public TerminalNode IF() { return getToken(PJscriptParser.IF, 0); }
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public TerminalNode LPAR() { return getToken(PJscriptParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(PJscriptParser.RPAR, 0); }
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PJscriptParserListener ) ((PJscriptParserListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PJscriptParserListener ) ((PJscriptParserListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJscriptParserVisitor ) return ((PJscriptParserVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134); match(IF);
			setState(135); match(LPAR);
			setState(136); valueExpression(0);
			setState(137); match(RPAR);
			setState(138); block();
			setState(141);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(139); match(ELSE);
				setState(140); block();
				}
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

	public static class WhileStatementContext extends ParserRuleContext {
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public TerminalNode LPAR() { return getToken(PJscriptParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(PJscriptParser.RPAR, 0); }
		public TerminalNode WHILE() { return getToken(PJscriptParser.WHILE, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PJscriptParserListener ) ((PJscriptParserListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PJscriptParserListener ) ((PJscriptParserListener)listener).exitWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJscriptParserVisitor ) return ((PJscriptParserVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143); match(WHILE);
			setState(144); match(LPAR);
			setState(145); valueExpression(0);
			setState(146); match(RPAR);
			setState(147); block();
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

	public static class ForStatementContext extends ParserRuleContext {
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public VariableDeclContext variableDecl() {
			return getRuleContext(VariableDeclContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public List<TerminalNode> SEMI() { return getTokens(PJscriptParser.SEMI); }
		public TerminalNode FOR() { return getToken(PJscriptParser.FOR, 0); }
		public TerminalNode SEMI(int i) {
			return getToken(PJscriptParser.SEMI, i);
		}
		public TerminalNode LPAR() { return getToken(PJscriptParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(PJscriptParser.RPAR, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PJscriptParserListener ) ((PJscriptParserListener)listener).enterForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PJscriptParserListener ) ((PJscriptParserListener)listener).exitForStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJscriptParserVisitor ) return ((PJscriptParserVisitor<? extends T>)visitor).visitForStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_forStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149); match(FOR);
			setState(150); match(LPAR);
			setState(151); variableDecl();
			setState(152); match(SEMI);
			setState(153); valueExpression(0);
			setState(154); match(SEMI);
			setState(155); assignment();
			setState(156); match(RPAR);
			setState(157); block();
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

	public static class ReturnStatementContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(PJscriptParser.RETURN, 0); }
		public TerminalNode SEMI() { return getToken(PJscriptParser.SEMI, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PJscriptParserListener ) ((PJscriptParserListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PJscriptParserListener ) ((PJscriptParserListener)listener).exitReturnStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJscriptParserVisitor ) return ((PJscriptParserVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_returnStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159); match(RETURN);
			setState(161);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << LPAR) | (1L << THIS) | (1L << CallableLiteral) | (1L << NumberLiteral) | (1L << NOT) | (1L << Identifier))) != 0)) {
				{
				setState(160); expression();
				}
			}

			setState(163); match(SEMI);
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
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public ObjectInstantationContext objectInstantation() {
			return getRuleContext(ObjectInstantationContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PJscriptParserListener ) ((PJscriptParserListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PJscriptParserListener ) ((PJscriptParserListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJscriptParserVisitor ) return ((PJscriptParserVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_expression);
		try {
			setState(168);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(165); valueExpression(0);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(166); assignment();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(167); objectInstantation();
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

	public static class ValueExpressionContext extends ParserRuleContext {
		public TerminalNode LESS() { return getToken(PJscriptParser.LESS, 0); }
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public TerminalNode GREATEREQUAL() { return getToken(PJscriptParser.GREATEREQUAL, 0); }
		public TerminalNode NumberLiteral() { return getToken(PJscriptParser.NumberLiteral, 0); }
		public MethodCallContext methodCall() {
			return getRuleContext(MethodCallContext.class,0);
		}
		public TerminalNode LPAR() { return getToken(PJscriptParser.LPAR, 0); }
		public TerminalNode STAR() { return getToken(PJscriptParser.STAR, 0); }
		public TerminalNode OR() { return getToken(PJscriptParser.OR, 0); }
		public TerminalNode GREATER() { return getToken(PJscriptParser.GREATER, 0); }
		public TerminalNode NOT() { return getToken(PJscriptParser.NOT, 0); }
		public TerminalNode EQUAL() { return getToken(PJscriptParser.EQUAL, 0); }
		public TerminalNode LESSEQUAL() { return getToken(PJscriptParser.LESSEQUAL, 0); }
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public TerminalNode SLASH() { return getToken(PJscriptParser.SLASH, 0); }
		public TerminalNode AND() { return getToken(PJscriptParser.AND, 0); }
		public TerminalNode PLUS() { return getToken(PJscriptParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(PJscriptParser.MINUS, 0); }
		public TerminalNode RPAR() { return getToken(PJscriptParser.RPAR, 0); }
		public CallableExpressionContext callableExpression() {
			return getRuleContext(CallableExpressionContext.class,0);
		}
		public TerminalNode NOTEQUAL() { return getToken(PJscriptParser.NOTEQUAL, 0); }
		public ValueExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valueExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PJscriptParserListener ) ((PJscriptParserListener)listener).enterValueExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PJscriptParserListener ) ((PJscriptParserListener)listener).exitValueExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJscriptParserVisitor ) return ((PJscriptParserVisitor<? extends T>)visitor).visitValueExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueExpressionContext valueExpression() throws RecognitionException {
		return valueExpression(0);
	}

	private ValueExpressionContext valueExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ValueExpressionContext _localctx = new ValueExpressionContext(_ctx, _parentState);
		ValueExpressionContext _prevctx = _localctx;
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_valueExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(171); match(NOT);
				setState(172); valueExpression(7);
				}
				break;

			case 2:
				{
				setState(173); match(LPAR);
				setState(174); valueExpression(0);
				setState(175); match(RPAR);
				}
				break;

			case 3:
				{
				setState(177); match(NumberLiteral);
				}
				break;

			case 4:
				{
				setState(178); callableExpression();
				}
				break;

			case 5:
				{
				setState(179); methodCall();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(199);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(197);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						_localctx = new ValueExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(182);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(183);
						_la = _input.LA(1);
						if ( !(_la==STAR || _la==SLASH) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(184); valueExpression(11);
						}
						break;

					case 2:
						{
						_localctx = new ValueExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(185);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(186);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(187); valueExpression(10);
						}
						break;

					case 3:
						{
						_localctx = new ValueExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(188);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(189);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQUAL) | (1L << NOTEQUAL) | (1L << LESS) | (1L << GREATER) | (1L << LESSEQUAL) | (1L << GREATEREQUAL))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(190); valueExpression(9);
						}
						break;

					case 4:
						{
						_localctx = new ValueExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(191);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(192); match(AND);
						setState(193); valueExpression(7);
						}
						break;

					case 5:
						{
						_localctx = new ValueExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(194);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(195); match(OR);
						setState(196); valueExpression(6);
						}
						break;
					}
					} 
				}
				setState(201);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
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

	public static class CallableExpressionContext extends ParserRuleContext {
		public TerminalNode CallableLiteral() { return getToken(PJscriptParser.CallableLiteral, 0); }
		public TerminalNode Identifier() { return getToken(PJscriptParser.Identifier, 0); }
		public ObjectPropertyContext objectProperty() {
			return getRuleContext(ObjectPropertyContext.class,0);
		}
		public CallableExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callableExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PJscriptParserListener ) ((PJscriptParserListener)listener).enterCallableExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PJscriptParserListener ) ((PJscriptParserListener)listener).exitCallableExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJscriptParserVisitor ) return ((PJscriptParserVisitor<? extends T>)visitor).visitCallableExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallableExpressionContext callableExpression() throws RecognitionException {
		CallableExpressionContext _localctx = new CallableExpressionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_callableExpression);
		try {
			setState(205);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(202); objectProperty();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(203); match(Identifier);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(204); match(CallableLiteral);
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

	public static class ObjectInstantationContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(PJscriptParser.Identifier, 0); }
		public TerminalNode LPAR() { return getToken(PJscriptParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(PJscriptParser.RPAR, 0); }
		public TerminalNode NEW() { return getToken(PJscriptParser.NEW, 0); }
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public ObjectInstantationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectInstantation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PJscriptParserListener ) ((PJscriptParserListener)listener).enterObjectInstantation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PJscriptParserListener ) ((PJscriptParserListener)listener).exitObjectInstantation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJscriptParserVisitor ) return ((PJscriptParserVisitor<? extends T>)visitor).visitObjectInstantation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectInstantationContext objectInstantation() throws RecognitionException {
		ObjectInstantationContext _localctx = new ObjectInstantationContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_objectInstantation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207); match(NEW);
			setState(208); match(Identifier);
			setState(209); match(LPAR);
			setState(211);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << LPAR) | (1L << THIS) | (1L << CallableLiteral) | (1L << NumberLiteral) | (1L << NOT) | (1L << Identifier))) != 0)) {
				{
				setState(210); argumentList();
				}
			}

			setState(213); match(RPAR);
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

	public static class ObjectPropertyContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(PJscriptParser.DOT, 0); }
		public List<TerminalNode> Identifier() { return getTokens(PJscriptParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(PJscriptParser.Identifier, i);
		}
		public TerminalNode THIS() { return getToken(PJscriptParser.THIS, 0); }
		public ObjectPropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectProperty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PJscriptParserListener ) ((PJscriptParserListener)listener).enterObjectProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PJscriptParserListener ) ((PJscriptParserListener)listener).exitObjectProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJscriptParserVisitor ) return ((PJscriptParserVisitor<? extends T>)visitor).visitObjectProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectPropertyContext objectProperty() throws RecognitionException {
		ObjectPropertyContext _localctx = new ObjectPropertyContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_objectProperty);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			_la = _input.LA(1);
			if ( !(_la==THIS || _la==Identifier) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(216); match(DOT);
			setState(217); match(Identifier);
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

	public static class ArgumentListContext extends ParserRuleContext {
		public List<TerminalNode> COMMA() { return getTokens(PJscriptParser.COMMA); }
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode COMMA(int i) {
			return getToken(PJscriptParser.COMMA, i);
		}
		public ArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PJscriptParserListener ) ((PJscriptParserListener)listener).enterArgumentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PJscriptParserListener ) ((PJscriptParserListener)listener).exitArgumentList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJscriptParserVisitor ) return ((PJscriptParserVisitor<? extends T>)visitor).visitArgumentList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentListContext argumentList() throws RecognitionException {
		ArgumentListContext _localctx = new ArgumentListContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_argumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219); expression();
			setState(224);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(220); match(COMMA);
				setState(221); expression();
				}
				}
				setState(226);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 15: return valueExpression_sempred((ValueExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean valueExpression_sempred(ValueExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 10);

		case 1: return precpred(_ctx, 9);

		case 2: return precpred(_ctx, 8);

		case 3: return precpred(_ctx, 6);

		case 4: return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3+\u00e6\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\2\7\2.\n\2\f\2\16\2\61\13\2\3"+
		"\2\3\2\3\3\3\3\3\3\3\3\5\39\n\3\3\3\3\3\7\3=\n\3\f\3\16\3@\13\3\3\3\3"+
		"\3\3\4\3\4\3\4\3\4\5\4H\n\4\3\5\3\5\3\5\3\5\5\5N\n\5\3\5\3\5\3\5\3\6\3"+
		"\6\3\6\5\6V\n\6\3\7\3\7\3\7\7\7[\n\7\f\7\16\7^\13\7\3\b\3\b\7\bb\n\b\f"+
		"\b\16\be\13\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\tq\n\t\3\n\3\n"+
		"\5\nu\n\n\3\n\3\n\3\n\3\13\3\13\3\13\5\13}\n\13\3\13\3\13\3\13\5\13\u0082"+
		"\n\13\3\13\3\13\3\13\5\13\u0087\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u0090"+
		"\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\17\3\17\5\17\u00a4\n\17\3\17\3\17\3\20\3\20\3\20\5\20\u00ab"+
		"\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00b7\n\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\7\21\u00c8\n\21\f\21\16\21\u00cb\13\21\3\22\3\22\3\22\5\22\u00d0"+
		"\n\22\3\23\3\23\3\23\3\23\5\23\u00d6\n\23\3\23\3\23\3\24\3\24\3\24\3\24"+
		"\3\25\3\25\3\25\7\25\u00e1\n\25\f\25\16\25\u00e4\13\25\3\25\2\3 \26\2"+
		"\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(\2\6\3\2\25\26\3\2\27\30\3"+
		"\2\33 \4\2\22\22&&\u00f5\2/\3\2\2\2\4\64\3\2\2\2\6G\3\2\2\2\bI\3\2\2\2"+
		"\nR\3\2\2\2\fW\3\2\2\2\16_\3\2\2\2\20p\3\2\2\2\22t\3\2\2\2\24|\3\2\2\2"+
		"\26\u0088\3\2\2\2\30\u0091\3\2\2\2\32\u0097\3\2\2\2\34\u00a1\3\2\2\2\36"+
		"\u00aa\3\2\2\2 \u00b6\3\2\2\2\"\u00cf\3\2\2\2$\u00d1\3\2\2\2&\u00d9\3"+
		"\2\2\2(\u00dd\3\2\2\2*.\5\4\3\2+.\5\b\5\2,.\5\20\t\2-*\3\2\2\2-+\3\2\2"+
		"\2-,\3\2\2\2.\61\3\2\2\2/-\3\2\2\2/\60\3\2\2\2\60\62\3\2\2\2\61/\3\2\2"+
		"\2\62\63\7\2\2\3\63\3\3\2\2\2\64\65\7\21\2\2\658\7&\2\2\66\67\7\23\2\2"+
		"\679\7&\2\28\66\3\2\2\289\3\2\2\29:\3\2\2\2:>\7\16\2\2;=\5\6\4\2<;\3\2"+
		"\2\2=@\3\2\2\2><\3\2\2\2>?\3\2\2\2?A\3\2\2\2@>\3\2\2\2AB\7\17\2\2B\5\3"+
		"\2\2\2CH\5\b\5\2DE\5\n\6\2EF\7\13\2\2FH\3\2\2\2GC\3\2\2\2GD\3\2\2\2H\7"+
		"\3\2\2\2IJ\7\4\2\2JK\7&\2\2KM\7\f\2\2LN\5\f\7\2ML\3\2\2\2MN\3\2\2\2NO"+
		"\3\2\2\2OP\7\r\2\2PQ\5\16\b\2Q\t\3\2\2\2RU\7&\2\2ST\7\n\2\2TV\5\36\20"+
		"\2US\3\2\2\2UV\3\2\2\2V\13\3\2\2\2W\\\7&\2\2XY\7\20\2\2Y[\7&\2\2ZX\3\2"+
		"\2\2[^\3\2\2\2\\Z\3\2\2\2\\]\3\2\2\2]\r\3\2\2\2^\\\3\2\2\2_c\7\16\2\2"+
		"`b\5\20\t\2a`\3\2\2\2be\3\2\2\2ca\3\2\2\2cd\3\2\2\2df\3\2\2\2ec\3\2\2"+
		"\2fg\7\17\2\2g\17\3\2\2\2hq\5\16\b\2ij\5\36\20\2jk\7\13\2\2kq\3\2\2\2"+
		"lq\5\26\f\2mq\5\30\r\2nq\5\32\16\2oq\5\34\17\2ph\3\2\2\2pi\3\2\2\2pl\3"+
		"\2\2\2pm\3\2\2\2pn\3\2\2\2po\3\2\2\2q\21\3\2\2\2ru\7&\2\2su\5&\24\2tr"+
		"\3\2\2\2ts\3\2\2\2uv\3\2\2\2vw\7\n\2\2wx\5\36\20\2x\23\3\2\2\2yz\5\"\22"+
		"\2z{\7\24\2\2{}\3\2\2\2|y\3\2\2\2|}\3\2\2\2}~\3\2\2\2~\177\7&\2\2\177"+
		"\u0081\7\f\2\2\u0080\u0082\5(\25\2\u0081\u0080\3\2\2\2\u0081\u0082\3\2"+
		"\2\2\u0082\u0083\3\2\2\2\u0083\u0086\7\r\2\2\u0084\u0085\7\24\2\2\u0085"+
		"\u0087\5\24\13\2\u0086\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087\25\3\2"+
		"\2\2\u0088\u0089\7\b\2\2\u0089\u008a\7\f\2\2\u008a\u008b\5 \21\2\u008b"+
		"\u008c\7\r\2\2\u008c\u008f\5\16\b\2\u008d\u008e\7\t\2\2\u008e\u0090\5"+
		"\16\b\2\u008f\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090\27\3\2\2\2\u0091"+
		"\u0092\7\7\2\2\u0092\u0093\7\f\2\2\u0093\u0094\5 \21\2\u0094\u0095\7\r"+
		"\2\2\u0095\u0096\5\16\b\2\u0096\31\3\2\2\2\u0097\u0098\7\6\2\2\u0098\u0099"+
		"\7\f\2\2\u0099\u009a\5\n\6\2\u009a\u009b\7\13\2\2\u009b\u009c\5 \21\2"+
		"\u009c\u009d\7\13\2\2\u009d\u009e\5\22\n\2\u009e\u009f\7\r\2\2\u009f\u00a0"+
		"\5\16\b\2\u00a0\33\3\2\2\2\u00a1\u00a3\7\5\2\2\u00a2\u00a4\5\36\20\2\u00a3"+
		"\u00a2\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a6\7\13"+
		"\2\2\u00a6\35\3\2\2\2\u00a7\u00ab\5 \21\2\u00a8\u00ab\5\22\n\2\u00a9\u00ab"+
		"\5$\23\2\u00aa\u00a7\3\2\2\2\u00aa\u00a8\3\2\2\2\u00aa\u00a9\3\2\2\2\u00ab"+
		"\37\3\2\2\2\u00ac\u00ad\b\21\1\2\u00ad\u00ae\7#\2\2\u00ae\u00b7\5 \21"+
		"\t\u00af\u00b0\7\f\2\2\u00b0\u00b1\5 \21\2\u00b1\u00b2\7\r\2\2\u00b2\u00b7"+
		"\3\2\2\2\u00b3\u00b7\7\32\2\2\u00b4\u00b7\5\"\22\2\u00b5\u00b7\5\24\13"+
		"\2\u00b6\u00ac\3\2\2\2\u00b6\u00af\3\2\2\2\u00b6\u00b3\3\2\2\2\u00b6\u00b4"+
		"\3\2\2\2\u00b6\u00b5\3\2\2\2\u00b7\u00c9\3\2\2\2\u00b8\u00b9\f\f\2\2\u00b9"+
		"\u00ba\t\2\2\2\u00ba\u00c8\5 \21\r\u00bb\u00bc\f\13\2\2\u00bc\u00bd\t"+
		"\3\2\2\u00bd\u00c8\5 \21\f\u00be\u00bf\f\n\2\2\u00bf\u00c0\t\4\2\2\u00c0"+
		"\u00c8\5 \21\13\u00c1\u00c2\f\b\2\2\u00c2\u00c3\7!\2\2\u00c3\u00c8\5 "+
		"\21\t\u00c4\u00c5\f\7\2\2\u00c5\u00c6\7\"\2\2\u00c6\u00c8\5 \21\b\u00c7"+
		"\u00b8\3\2\2\2\u00c7\u00bb\3\2\2\2\u00c7\u00be\3\2\2\2\u00c7\u00c1\3\2"+
		"\2\2\u00c7\u00c4\3\2\2\2\u00c8\u00cb\3\2\2\2\u00c9\u00c7\3\2\2\2\u00c9"+
		"\u00ca\3\2\2\2\u00ca!\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cc\u00d0\5&\24\2"+
		"\u00cd\u00d0\7&\2\2\u00ce\u00d0\7\31\2\2\u00cf\u00cc\3\2\2\2\u00cf\u00cd"+
		"\3\2\2\2\u00cf\u00ce\3\2\2\2\u00d0#\3\2\2\2\u00d1\u00d2\7\3\2\2\u00d2"+
		"\u00d3\7&\2\2\u00d3\u00d5\7\f\2\2\u00d4\u00d6\5(\25\2\u00d5\u00d4\3\2"+
		"\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00d8\7\r\2\2\u00d8"+
		"%\3\2\2\2\u00d9\u00da\t\5\2\2\u00da\u00db\7\24\2\2\u00db\u00dc\7&\2\2"+
		"\u00dc\'\3\2\2\2\u00dd\u00e2\5\36\20\2\u00de\u00df\7\20\2\2\u00df\u00e1"+
		"\5\36\20\2\u00e0\u00de\3\2\2\2\u00e1\u00e4\3\2\2\2\u00e2\u00e0\3\2\2\2"+
		"\u00e2\u00e3\3\2\2\2\u00e3)\3\2\2\2\u00e4\u00e2\3\2\2\2\31-/8>GMU\\cp"+
		"t|\u0081\u0086\u008f\u00a3\u00aa\u00b6\u00c7\u00c9\u00cf\u00d5\u00e2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}