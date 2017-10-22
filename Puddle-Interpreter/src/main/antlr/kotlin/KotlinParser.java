// Generated from KotlinParser.g4 by ANTLR 4.7
package main.antlr.kotlin;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class KotlinParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ShebangLine=1, DelimitedComment=2, LineComment=3, WS=4, NL=5, RESERVED=6, 
		DOT=7, COMMA=8, LPAREN=9, RPAREN=10, LSQUARE=11, RSQUARE=12, LCURL=13, 
		RCURL=14, MULT=15, MOD=16, DIV=17, ADD=18, SUB=19, INCR=20, DECR=21, CONJ=22, 
		DISJ=23, EXCL=24, COLON=25, SEMICOLON=26, ASSIGNMENT=27, ADD_ASSIGNMENT=28, 
		SUB_ASSIGNMENT=29, MULT_ASSIGNMENT=30, DIV_ASSIGNMENT=31, MOD_ASSIGNMENT=32, 
		ARROW=33, DOUBLE_ARROW=34, RANGE=35, COLONCOLON=36, Q_COLONCOLON=37, DOUBLE_SEMICOLON=38, 
		HASH=39, AT=40, QUEST=41, ELVIS=42, LANGLE=43, RANGLE=44, LE=45, GE=46, 
		EXCL_EQ=47, EXCL_EQEQ=48, AS_SAFE=49, EQEQ=50, EQEQEQ=51, SINGLE_QUOTE=52, 
		RETURN_AT=53, CONTINUE_AT=54, BREAK_AT=55, FILE=56, PACKAGE=57, IMPORT=58, 
		CLASS=59, INTERFACE=60, FUN=61, OBJECT=62, VAL=63, VAR=64, TYPE_ALIAS=65, 
		CONSTRUCTOR=66, BY=67, COMPANION=68, INIT=69, THIS=70, SUPER=71, TYPEOF=72, 
		WHERE=73, IF=74, ELSE=75, WHEN=76, TRY=77, CATCH=78, FINALLY=79, FOR=80, 
		DO=81, WHILE=82, THROW=83, RETURN=84, CONTINUE=85, BREAK=86, AS=87, IS=88, 
		IN=89, NOT_IS=90, NOT_IN=91, OUT=92, FIELD=93, PROPERTY=94, GET=95, SET=96, 
		GETTER=97, SETTER=98, RECEIVER=99, PARAM=100, SETPARAM=101, DELEGATE=102, 
		DYNAMIC=103, PUBLIC=104, PRIVATE=105, PROTECTED=106, INTERNAL=107, ENUM=108, 
		SEALED=109, ANNOTATION=110, DATA=111, INNER=112, TAILREC=113, OPERATOR=114, 
		INLINE=115, INFIX=116, EXTERNAL=117, SUSPEND=118, OVERRIDE=119, ABSTRACT=120, 
		FINAL=121, OPEN=122, CONST=123, LATEINIT=124, VARARG=125, NOINLINE=126, 
		CROSSINLINE=127, REIFIED=128, QUOTE_OPEN=129, TRIPLE_QUOTE_OPEN=130, RealLiteral=131, 
		FloatLiteral=132, DoubleLiteral=133, LongLiteral=134, IntegerLiteral=135, 
		HexLiteral=136, BinLiteral=137, BooleanLiteral=138, NullLiteral=139, ReservedKeywords=140, 
		Identifier=141, LabelReference=142, LabelDefinition=143, FieldIdentifier=144, 
		CharacterLiteral=145, UNICODE_CLASS_LL=146, UNICODE_CLASS_LM=147, UNICODE_CLASS_LO=148, 
		UNICODE_CLASS_LT=149, UNICODE_CLASS_LU=150, UNICODE_CLASS_ND=151, UNICODE_CLASS_NL=152, 
		Inside_Comment=153, Inside_WS=154, Inside_NL=155, QUOTE_CLOSE=156, LineStrRef=157, 
		LineStrText=158, LineStrEscapedChar=159, LineStrExprStart=160, TRIPLE_QUOTE_CLOSE=161, 
		MultiLineStringQuote=162, MultiLineStrRef=163, MultiLineStrText=164, MultiLineStrEscapedChar=165, 
		MultiLineStrExprStart=166, MultiLineNL=167, StrExpr_IN=168, StrExpr_Comment=169, 
		StrExpr_WS=170, StrExpr_NL=171;
	public static final int
		RULE_kotlinFile = 0, RULE_script = 1, RULE_fileAnnotation = 2, RULE_packageHeader = 3, 
		RULE_importList = 4, RULE_importHeader = 5, RULE_importAlias = 6, RULE_topLevelObject = 7, 
		RULE_classDeclaration = 8, RULE_primaryConstructor = 9, RULE_classParameters = 10, 
		RULE_classParameter = 11, RULE_delegationSpecifiers = 12, RULE_delegationSpecifier = 13, 
		RULE_constructorInvocation = 14, RULE_explicitDelegation = 15, RULE_classBody = 16, 
		RULE_classMemberDeclaration = 17, RULE_anonymousInitializer = 18, RULE_secondaryConstructor = 19, 
		RULE_constructorDelegationCall = 20, RULE_enumClassBody = 21, RULE_enumEntries = 22, 
		RULE_enumEntry = 23, RULE_functionDeclaration = 24, RULE_functionValueParameters = 25, 
		RULE_functionValueParameter = 26, RULE_parameter = 27, RULE_functionBody = 28, 
		RULE_objectDeclaration = 29, RULE_companionObject = 30, RULE_propertyDeclaration = 31, 
		RULE_multiVariableDeclaration = 32, RULE_variableDeclaration = 33, RULE_getter = 34, 
		RULE_setter = 35, RULE_typeAlias = 36, RULE_typeParameters = 37, RULE_typeParameter = 38, 
		RULE_type = 39, RULE_typeModifierList = 40, RULE_parenthesizedType = 41, 
		RULE_nullableType = 42, RULE_typeReference = 43, RULE_functionType = 44, 
		RULE_functionTypeReceiver = 45, RULE_userType = 46, RULE_simpleUserType = 47, 
		RULE_functionTypeParameters = 48, RULE_typeConstraints = 49, RULE_typeConstraint = 50, 
		RULE_block = 51, RULE_statements = 52, RULE_statement = 53, RULE_declaration = 54, 
		RULE_assignment = 55, RULE_expression = 56, RULE_disjunction = 57, RULE_conjunction = 58, 
		RULE_equality = 59, RULE_comparison = 60, RULE_infixOperation = 61, RULE_elvisExpression = 62, 
		RULE_infixFunctionCall = 63, RULE_rangeExpression = 64, RULE_additiveExpression = 65, 
		RULE_multiplicativeExpression = 66, RULE_asExpression = 67, RULE_asExpressionTail = 68, 
		RULE_prefixUnaryExpression = 69, RULE_postfixUnaryExpression = 70, RULE_callExpression = 71, 
		RULE_labeledExpression = 72, RULE_dotQualifiedExpression = 73, RULE_assignableExpressionNoNumber = 74, 
		RULE_assignableExpression = 75, RULE_indexingExpression = 76, RULE_callSuffix = 77, 
		RULE_annotatedLambda = 78, RULE_arrayAccess = 79, RULE_valueArguments = 80, 
		RULE_typeArguments = 81, RULE_typeProjection = 82, RULE_typeProjectionModifierList = 83, 
		RULE_valueArgument = 84, RULE_primaryExpressionNoNumber = 85, RULE_primaryExpression = 86, 
		RULE_parenthesizedExpression = 87, RULE_literalConstant = 88, RULE_stringLiteral = 89, 
		RULE_lineStringLiteral = 90, RULE_multiLineStringLiteral = 91, RULE_lineStringContent = 92, 
		RULE_lineStringExpression = 93, RULE_multiLineStringContent = 94, RULE_multiLineStringExpression = 95, 
		RULE_functionLiteral = 96, RULE_lambdaParameters = 97, RULE_lambdaParameter = 98, 
		RULE_objectLiteral = 99, RULE_collectionLiteral = 100, RULE_thisExpression = 101, 
		RULE_superExpression = 102, RULE_conditionalExpression = 103, RULE_ifExpression = 104, 
		RULE_controlStructureBody = 105, RULE_whenExpression = 106, RULE_whenEntry = 107, 
		RULE_whenCondition = 108, RULE_rangeTest = 109, RULE_typeTest = 110, RULE_tryExpression = 111, 
		RULE_catchBlock = 112, RULE_finallyBlock = 113, RULE_loopExpression = 114, 
		RULE_forExpression = 115, RULE_whileExpression = 116, RULE_doWhileExpression = 117, 
		RULE_jumpExpression = 118, RULE_callableReference = 119, RULE_assignmentOperator = 120, 
		RULE_equalityOperator = 121, RULE_comparisonOperator = 122, RULE_inOperator = 123, 
		RULE_isOperator = 124, RULE_additiveOperator = 125, RULE_multiplicativeOperator = 126, 
		RULE_asOperator = 127, RULE_prefixUnaryOperator = 128, RULE_postfixUnaryOperator = 129, 
		RULE_memberAccessOperator = 130, RULE_modifierList = 131, RULE_modifier = 132, 
		RULE_classModifier = 133, RULE_memberModifier = 134, RULE_visibilityModifier = 135, 
		RULE_varianceAnnotation = 136, RULE_functionModifier = 137, RULE_propertyModifier = 138, 
		RULE_inheritanceModifier = 139, RULE_parameterModifier = 140, RULE_typeParameterModifier = 141, 
		RULE_labelDefinition = 142, RULE_annotations = 143, RULE_annotation = 144, 
		RULE_annotationList = 145, RULE_annotationUseSiteTarget = 146, RULE_unescapedAnnotation = 147, 
		RULE_identifier = 148, RULE_simpleIdentifier = 149, RULE_semi = 150;
	public static final String[] ruleNames = {
		"kotlinFile", "script", "fileAnnotation", "packageHeader", "importList", 
		"importHeader", "importAlias", "topLevelObject", "classDeclaration", "primaryConstructor", 
		"classParameters", "classParameter", "delegationSpecifiers", "delegationSpecifier", 
		"constructorInvocation", "explicitDelegation", "classBody", "classMemberDeclaration", 
		"anonymousInitializer", "secondaryConstructor", "constructorDelegationCall", 
		"enumClassBody", "enumEntries", "enumEntry", "functionDeclaration", "functionValueParameters", 
		"functionValueParameter", "parameter", "functionBody", "objectDeclaration", 
		"companionObject", "propertyDeclaration", "multiVariableDeclaration", 
		"variableDeclaration", "getter", "setter", "typeAlias", "typeParameters", 
		"typeParameter", "type", "typeModifierList", "parenthesizedType", "nullableType", 
		"typeReference", "functionType", "functionTypeReceiver", "userType", "simpleUserType", 
		"functionTypeParameters", "typeConstraints", "typeConstraint", "block", 
		"statements", "statement", "declaration", "assignment", "expression", 
		"disjunction", "conjunction", "equality", "comparison", "infixOperation", 
		"elvisExpression", "infixFunctionCall", "rangeExpression", "additiveExpression", 
		"multiplicativeExpression", "asExpression", "asExpressionTail", "prefixUnaryExpression", 
		"postfixUnaryExpression", "callExpression", "labeledExpression", "dotQualifiedExpression", 
		"assignableExpressionNoNumber", "assignableExpression", "indexingExpression", 
		"callSuffix", "annotatedLambda", "arrayAccess", "valueArguments", "typeArguments", 
		"typeProjection", "typeProjectionModifierList", "valueArgument", "primaryExpressionNoNumber", 
		"primaryExpression", "parenthesizedExpression", "literalConstant", "stringLiteral", 
		"lineStringLiteral", "multiLineStringLiteral", "lineStringContent", "lineStringExpression", 
		"multiLineStringContent", "multiLineStringExpression", "functionLiteral", 
		"lambdaParameters", "lambdaParameter", "objectLiteral", "collectionLiteral", 
		"thisExpression", "superExpression", "conditionalExpression", "ifExpression", 
		"controlStructureBody", "whenExpression", "whenEntry", "whenCondition", 
		"rangeTest", "typeTest", "tryExpression", "catchBlock", "finallyBlock", 
		"loopExpression", "forExpression", "whileExpression", "doWhileExpression", 
		"jumpExpression", "callableReference", "assignmentOperator", "equalityOperator", 
		"comparisonOperator", "inOperator", "isOperator", "additiveOperator", 
		"multiplicativeOperator", "asOperator", "prefixUnaryOperator", "postfixUnaryOperator", 
		"memberAccessOperator", "modifierList", "modifier", "classModifier", "memberModifier", 
		"visibilityModifier", "varianceAnnotation", "functionModifier", "propertyModifier", 
		"inheritanceModifier", "parameterModifier", "typeParameterModifier", "labelDefinition", 
		"annotations", "annotation", "annotationList", "annotationUseSiteTarget", 
		"unescapedAnnotation", "identifier", "simpleIdentifier", "semi"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, "'...'", "'.'", "','", "'('", null, 
		"'['", null, "'{'", "'}'", "'*'", "'%'", "'/'", "'+'", "'-'", "'++'", 
		"'--'", "'&&'", "'||'", "'!'", "':'", "';'", "'='", "'+='", "'-='", "'*='", 
		"'/='", "'%='", "'->'", "'=>'", "'..'", "'::'", "'?::'", "';;'", "'#'", 
		"'@'", "'?'", "'?:'", "'<'", "'>'", "'<='", "'>='", "'!='", "'!=='", "'as?'", 
		"'=='", "'==='", "'''", null, null, null, "'@file'", "'package'", "'import'", 
		"'class'", "'interface'", "'fun'", "'object'", "'val'", "'var'", "'typealias'", 
		"'constructor'", "'by'", "'companion'", "'init'", "'this'", "'super'", 
		"'typeof'", "'where'", "'if'", "'else'", "'when'", "'try'", "'catch'", 
		"'finally'", "'for'", "'do'", "'while'", "'throw'", "'return'", "'continue'", 
		"'break'", "'as'", "'is'", "'in'", null, null, "'out'", "'@field'", "'@property'", 
		"'@get'", "'@set'", "'get'", "'set'", "'@receiver'", "'@param'", "'@setparam'", 
		"'@delegate'", "'dynamic'", "'public'", "'private'", "'protected'", "'internal'", 
		"'enum'", "'sealed'", "'annotation'", "'data'", "'inner'", "'tailrec'", 
		"'operator'", "'inline'", "'infix'", "'external'", "'suspend'", "'override'", 
		"'abstract'", "'final'", "'open'", "'const'", "'lateinit'", "'vararg'", 
		"'noinline'", "'crossinline'", "'reified'", null, "'\"\"\"'", null, null, 
		null, null, null, null, null, null, "'null'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "ShebangLine", "DelimitedComment", "LineComment", "WS", "NL", "RESERVED", 
		"DOT", "COMMA", "LPAREN", "RPAREN", "LSQUARE", "RSQUARE", "LCURL", "RCURL", 
		"MULT", "MOD", "DIV", "ADD", "SUB", "INCR", "DECR", "CONJ", "DISJ", "EXCL", 
		"COLON", "SEMICOLON", "ASSIGNMENT", "ADD_ASSIGNMENT", "SUB_ASSIGNMENT", 
		"MULT_ASSIGNMENT", "DIV_ASSIGNMENT", "MOD_ASSIGNMENT", "ARROW", "DOUBLE_ARROW", 
		"RANGE", "COLONCOLON", "Q_COLONCOLON", "DOUBLE_SEMICOLON", "HASH", "AT", 
		"QUEST", "ELVIS", "LANGLE", "RANGLE", "LE", "GE", "EXCL_EQ", "EXCL_EQEQ", 
		"AS_SAFE", "EQEQ", "EQEQEQ", "SINGLE_QUOTE", "RETURN_AT", "CONTINUE_AT", 
		"BREAK_AT", "FILE", "PACKAGE", "IMPORT", "CLASS", "INTERFACE", "FUN", 
		"OBJECT", "VAL", "VAR", "TYPE_ALIAS", "CONSTRUCTOR", "BY", "COMPANION", 
		"INIT", "THIS", "SUPER", "TYPEOF", "WHERE", "IF", "ELSE", "WHEN", "TRY", 
		"CATCH", "FINALLY", "FOR", "DO", "WHILE", "THROW", "RETURN", "CONTINUE", 
		"BREAK", "AS", "IS", "IN", "NOT_IS", "NOT_IN", "OUT", "FIELD", "PROPERTY", 
		"GET", "SET", "GETTER", "SETTER", "RECEIVER", "PARAM", "SETPARAM", "DELEGATE", 
		"DYNAMIC", "PUBLIC", "PRIVATE", "PROTECTED", "INTERNAL", "ENUM", "SEALED", 
		"ANNOTATION", "DATA", "INNER", "TAILREC", "OPERATOR", "INLINE", "INFIX", 
		"EXTERNAL", "SUSPEND", "OVERRIDE", "ABSTRACT", "FINAL", "OPEN", "CONST", 
		"LATEINIT", "VARARG", "NOINLINE", "CROSSINLINE", "REIFIED", "QUOTE_OPEN", 
		"TRIPLE_QUOTE_OPEN", "RealLiteral", "FloatLiteral", "DoubleLiteral", "LongLiteral", 
		"IntegerLiteral", "HexLiteral", "BinLiteral", "BooleanLiteral", "NullLiteral", 
		"ReservedKeywords", "Identifier", "LabelReference", "LabelDefinition", 
		"FieldIdentifier", "CharacterLiteral", "UNICODE_CLASS_LL", "UNICODE_CLASS_LM", 
		"UNICODE_CLASS_LO", "UNICODE_CLASS_LT", "UNICODE_CLASS_LU", "UNICODE_CLASS_ND", 
		"UNICODE_CLASS_NL", "Inside_Comment", "Inside_WS", "Inside_NL", "QUOTE_CLOSE", 
		"LineStrRef", "LineStrText", "LineStrEscapedChar", "LineStrExprStart", 
		"TRIPLE_QUOTE_CLOSE", "MultiLineStringQuote", "MultiLineStrRef", "MultiLineStrText", 
		"MultiLineStrEscapedChar", "MultiLineStrExprStart", "MultiLineNL", "StrExpr_IN", 
		"StrExpr_Comment", "StrExpr_WS", "StrExpr_NL"
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
	public String getGrammarFileName() { return "KotlinParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public KotlinParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class KotlinFileContext extends ParserRuleContext {
		public PackageHeaderContext packageHeader() {
			return getRuleContext(PackageHeaderContext.class,0);
		}
		public ImportListContext importList() {
			return getRuleContext(ImportListContext.class,0);
		}
		public TerminalNode EOF() { return getToken(KotlinParser.EOF, 0); }
		public List<TerminalNode> NL() { return getTokens(KotlinParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(KotlinParser.NL, i);
		}
		public FileAnnotationContext fileAnnotation() {
			return getRuleContext(FileAnnotationContext.class,0);
		}
		public List<TopLevelObjectContext> topLevelObject() {
			return getRuleContexts(TopLevelObjectContext.class);
		}
		public TopLevelObjectContext topLevelObject(int i) {
			return getRuleContext(TopLevelObjectContext.class,i);
		}
		public KotlinFileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kotlinFile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterKotlinFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitKotlinFile(this);
		}
	}

	public final KotlinFileContext kotlinFile() throws RecognitionException {
		KotlinFileContext _localctx = new KotlinFileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_kotlinFile);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(302);
				match(NL);
				}
				}
				setState(307);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(309);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(308);
				fileAnnotation();
				}
				break;
			}
			setState(311);
			packageHeader();
			setState(312);
			importList();
			setState(316);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 40)) & ~0x3f) == 0 && ((1L << (_la - 40)) & ((1L << (AT - 40)) | (1L << (FILE - 40)) | (1L << (CLASS - 40)) | (1L << (INTERFACE - 40)) | (1L << (FUN - 40)) | (1L << (OBJECT - 40)) | (1L << (VAL - 40)) | (1L << (VAR - 40)) | (1L << (TYPE_ALIAS - 40)) | (1L << (IN - 40)) | (1L << (OUT - 40)) | (1L << (FIELD - 40)) | (1L << (PROPERTY - 40)) | (1L << (GET - 40)) | (1L << (SET - 40)) | (1L << (RECEIVER - 40)) | (1L << (PARAM - 40)) | (1L << (SETPARAM - 40)) | (1L << (DELEGATE - 40)))) != 0) || ((((_la - 104)) & ~0x3f) == 0 && ((1L << (_la - 104)) & ((1L << (PUBLIC - 104)) | (1L << (PRIVATE - 104)) | (1L << (PROTECTED - 104)) | (1L << (INTERNAL - 104)) | (1L << (ENUM - 104)) | (1L << (SEALED - 104)) | (1L << (ANNOTATION - 104)) | (1L << (DATA - 104)) | (1L << (INNER - 104)) | (1L << (TAILREC - 104)) | (1L << (OPERATOR - 104)) | (1L << (INLINE - 104)) | (1L << (INFIX - 104)) | (1L << (EXTERNAL - 104)) | (1L << (SUSPEND - 104)) | (1L << (OVERRIDE - 104)) | (1L << (ABSTRACT - 104)) | (1L << (FINAL - 104)) | (1L << (OPEN - 104)) | (1L << (CONST - 104)) | (1L << (LATEINIT - 104)) | (1L << (VARARG - 104)) | (1L << (NOINLINE - 104)) | (1L << (CROSSINLINE - 104)) | (1L << (REIFIED - 104)) | (1L << (LabelReference - 104)))) != 0)) {
				{
				{
				setState(313);
				topLevelObject();
				}
				}
				setState(318);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(319);
			match(EOF);
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

	public static class ScriptContext extends ParserRuleContext {
		public PackageHeaderContext packageHeader() {
			return getRuleContext(PackageHeaderContext.class,0);
		}
		public ImportListContext importList() {
			return getRuleContext(ImportListContext.class,0);
		}
		public TerminalNode EOF() { return getToken(KotlinParser.EOF, 0); }
		public List<TerminalNode> NL() { return getTokens(KotlinParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(KotlinParser.NL, i);
		}
		public FileAnnotationContext fileAnnotation() {
			return getRuleContext(FileAnnotationContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<SemiContext> semi() {
			return getRuleContexts(SemiContext.class);
		}
		public SemiContext semi(int i) {
			return getRuleContext(SemiContext.class,i);
		}
		public ScriptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_script; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterScript(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitScript(this);
		}
	}

	public final ScriptContext script() throws RecognitionException {
		ScriptContext _localctx = new ScriptContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_script);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(324);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(321);
					match(NL);
					}
					} 
				}
				setState(326);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			setState(328);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(327);
				fileAnnotation();
				}
				break;
			}
			setState(330);
			packageHeader();
			setState(331);
			importList();
			setState(338);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NL) | (1L << LPAREN) | (1L << LSQUARE) | (1L << LCURL) | (1L << ADD) | (1L << SUB) | (1L << INCR) | (1L << DECR) | (1L << EXCL) | (1L << COLONCOLON) | (1L << Q_COLONCOLON) | (1L << AT) | (1L << RETURN_AT) | (1L << CONTINUE_AT) | (1L << BREAK_AT) | (1L << FILE) | (1L << IMPORT) | (1L << OBJECT))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (CONSTRUCTOR - 66)) | (1L << (BY - 66)) | (1L << (COMPANION - 66)) | (1L << (INIT - 66)) | (1L << (THIS - 66)) | (1L << (SUPER - 66)) | (1L << (WHERE - 66)) | (1L << (IF - 66)) | (1L << (WHEN - 66)) | (1L << (TRY - 66)) | (1L << (CATCH - 66)) | (1L << (FINALLY - 66)) | (1L << (FOR - 66)) | (1L << (DO - 66)) | (1L << (WHILE - 66)) | (1L << (THROW - 66)) | (1L << (RETURN - 66)) | (1L << (CONTINUE - 66)) | (1L << (BREAK - 66)) | (1L << (OUT - 66)) | (1L << (FIELD - 66)) | (1L << (PROPERTY - 66)) | (1L << (GET - 66)) | (1L << (SET - 66)) | (1L << (GETTER - 66)) | (1L << (SETTER - 66)) | (1L << (RECEIVER - 66)) | (1L << (PARAM - 66)) | (1L << (SETPARAM - 66)) | (1L << (DELEGATE - 66)) | (1L << (DYNAMIC - 66)) | (1L << (PUBLIC - 66)) | (1L << (PRIVATE - 66)) | (1L << (PROTECTED - 66)) | (1L << (INTERNAL - 66)) | (1L << (ENUM - 66)) | (1L << (SEALED - 66)) | (1L << (ANNOTATION - 66)) | (1L << (DATA - 66)) | (1L << (INNER - 66)) | (1L << (TAILREC - 66)) | (1L << (OPERATOR - 66)) | (1L << (INLINE - 66)) | (1L << (INFIX - 66)) | (1L << (EXTERNAL - 66)) | (1L << (SUSPEND - 66)) | (1L << (OVERRIDE - 66)) | (1L << (ABSTRACT - 66)) | (1L << (FINAL - 66)) | (1L << (OPEN - 66)) | (1L << (CONST - 66)) | (1L << (LATEINIT - 66)) | (1L << (VARARG - 66)) | (1L << (NOINLINE - 66)) | (1L << (CROSSINLINE - 66)) | (1L << (REIFIED - 66)) | (1L << (QUOTE_OPEN - 66)))) != 0) || ((((_la - 130)) & ~0x3f) == 0 && ((1L << (_la - 130)) & ((1L << (TRIPLE_QUOTE_OPEN - 130)) | (1L << (RealLiteral - 130)) | (1L << (LongLiteral - 130)) | (1L << (IntegerLiteral - 130)) | (1L << (HexLiteral - 130)) | (1L << (BinLiteral - 130)) | (1L << (BooleanLiteral - 130)) | (1L << (NullLiteral - 130)) | (1L << (Identifier - 130)) | (1L << (LabelReference - 130)) | (1L << (LabelDefinition - 130)) | (1L << (CharacterLiteral - 130)))) != 0)) {
				{
				{
				setState(332);
				expression();
				setState(334);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(333);
					semi();
					}
					break;
				}
				}
				}
				setState(340);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(341);
			match(EOF);
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

	public static class FileAnnotationContext extends ParserRuleContext {
		public List<TerminalNode> FILE() { return getTokens(KotlinParser.FILE); }
		public TerminalNode FILE(int i) {
			return getToken(KotlinParser.FILE, i);
		}
		public List<TerminalNode> COLON() { return getTokens(KotlinParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(KotlinParser.COLON, i);
		}
		public List<TerminalNode> LSQUARE() { return getTokens(KotlinParser.LSQUARE); }
		public TerminalNode LSQUARE(int i) {
			return getToken(KotlinParser.LSQUARE, i);
		}
		public List<TerminalNode> RSQUARE() { return getTokens(KotlinParser.RSQUARE); }
		public TerminalNode RSQUARE(int i) {
			return getToken(KotlinParser.RSQUARE, i);
		}
		public List<UnescapedAnnotationContext> unescapedAnnotation() {
			return getRuleContexts(UnescapedAnnotationContext.class);
		}
		public UnescapedAnnotationContext unescapedAnnotation(int i) {
			return getRuleContext(UnescapedAnnotationContext.class,i);
		}
		public List<SemiContext> semi() {
			return getRuleContexts(SemiContext.class);
		}
		public SemiContext semi(int i) {
			return getRuleContext(SemiContext.class,i);
		}
		public FileAnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fileAnnotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterFileAnnotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitFileAnnotation(this);
		}
	}

	public final FileAnnotationContext fileAnnotation() throws RecognitionException {
		FileAnnotationContext _localctx = new FileAnnotationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_fileAnnotation);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(359); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(343);
					match(FILE);
					setState(344);
					match(COLON);
					setState(354);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case LSQUARE:
						{
						setState(345);
						match(LSQUARE);
						setState(347); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(346);
							unescapedAnnotation();
							}
							}
							setState(349); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( ((((_la - 58)) & ~0x3f) == 0 && ((1L << (_la - 58)) & ((1L << (IMPORT - 58)) | (1L << (CONSTRUCTOR - 58)) | (1L << (BY - 58)) | (1L << (COMPANION - 58)) | (1L << (INIT - 58)) | (1L << (WHERE - 58)) | (1L << (CATCH - 58)) | (1L << (FINALLY - 58)) | (1L << (OUT - 58)) | (1L << (GETTER - 58)) | (1L << (SETTER - 58)) | (1L << (DYNAMIC - 58)) | (1L << (PUBLIC - 58)) | (1L << (PRIVATE - 58)) | (1L << (PROTECTED - 58)) | (1L << (INTERNAL - 58)) | (1L << (ENUM - 58)) | (1L << (SEALED - 58)) | (1L << (ANNOTATION - 58)) | (1L << (DATA - 58)) | (1L << (INNER - 58)) | (1L << (TAILREC - 58)) | (1L << (OPERATOR - 58)) | (1L << (INLINE - 58)) | (1L << (INFIX - 58)) | (1L << (EXTERNAL - 58)) | (1L << (SUSPEND - 58)) | (1L << (OVERRIDE - 58)) | (1L << (ABSTRACT - 58)) | (1L << (FINAL - 58)))) != 0) || ((((_la - 122)) & ~0x3f) == 0 && ((1L << (_la - 122)) & ((1L << (OPEN - 122)) | (1L << (CONST - 122)) | (1L << (LATEINIT - 122)) | (1L << (VARARG - 122)) | (1L << (NOINLINE - 122)) | (1L << (CROSSINLINE - 122)) | (1L << (REIFIED - 122)) | (1L << (Identifier - 122)))) != 0) );
						setState(351);
						match(RSQUARE);
						}
						break;
					case IMPORT:
					case CONSTRUCTOR:
					case BY:
					case COMPANION:
					case INIT:
					case WHERE:
					case CATCH:
					case FINALLY:
					case OUT:
					case GETTER:
					case SETTER:
					case DYNAMIC:
					case PUBLIC:
					case PRIVATE:
					case PROTECTED:
					case INTERNAL:
					case ENUM:
					case SEALED:
					case ANNOTATION:
					case DATA:
					case INNER:
					case TAILREC:
					case OPERATOR:
					case INLINE:
					case INFIX:
					case EXTERNAL:
					case SUSPEND:
					case OVERRIDE:
					case ABSTRACT:
					case FINAL:
					case OPEN:
					case CONST:
					case LATEINIT:
					case VARARG:
					case NOINLINE:
					case CROSSINLINE:
					case REIFIED:
					case Identifier:
						{
						setState(353);
						unescapedAnnotation();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(357);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						setState(356);
						semi();
						}
						break;
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(361); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class PackageHeaderContext extends ParserRuleContext {
		public TerminalNode PACKAGE() { return getToken(KotlinParser.PACKAGE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public SemiContext semi() {
			return getRuleContext(SemiContext.class,0);
		}
		public PackageHeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageHeader; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterPackageHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitPackageHeader(this);
		}
	}

	public final PackageHeaderContext packageHeader() throws RecognitionException {
		PackageHeaderContext _localctx = new PackageHeaderContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_packageHeader);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(368);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PACKAGE) {
				{
				setState(363);
				match(PACKAGE);
				setState(364);
				identifier();
				setState(366);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(365);
					semi();
					}
					break;
				}
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

	public static class ImportListContext extends ParserRuleContext {
		public List<ImportHeaderContext> importHeader() {
			return getRuleContexts(ImportHeaderContext.class);
		}
		public ImportHeaderContext importHeader(int i) {
			return getRuleContext(ImportHeaderContext.class,i);
		}
		public ImportListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterImportList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitImportList(this);
		}
	}

	public final ImportListContext importList() throws RecognitionException {
		ImportListContext _localctx = new ImportListContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_importList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(373);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(370);
					importHeader();
					}
					} 
				}
				setState(375);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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

	public static class ImportHeaderContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(KotlinParser.IMPORT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode DOT() { return getToken(KotlinParser.DOT, 0); }
		public TerminalNode MULT() { return getToken(KotlinParser.MULT, 0); }
		public ImportAliasContext importAlias() {
			return getRuleContext(ImportAliasContext.class,0);
		}
		public SemiContext semi() {
			return getRuleContext(SemiContext.class,0);
		}
		public ImportHeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importHeader; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterImportHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitImportHeader(this);
		}
	}

	public final ImportHeaderContext importHeader() throws RecognitionException {
		ImportHeaderContext _localctx = new ImportHeaderContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_importHeader);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(376);
			match(IMPORT);
			setState(377);
			identifier();
			setState(381);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOT:
				{
				setState(378);
				match(DOT);
				setState(379);
				match(MULT);
				}
				break;
			case AS:
				{
				setState(380);
				importAlias();
				}
				break;
			case EOF:
			case NL:
			case LPAREN:
			case LSQUARE:
			case LCURL:
			case ADD:
			case SUB:
			case INCR:
			case DECR:
			case EXCL:
			case SEMICOLON:
			case COLONCOLON:
			case Q_COLONCOLON:
			case AT:
			case RETURN_AT:
			case CONTINUE_AT:
			case BREAK_AT:
			case FILE:
			case IMPORT:
			case CLASS:
			case INTERFACE:
			case FUN:
			case OBJECT:
			case VAL:
			case VAR:
			case TYPE_ALIAS:
			case CONSTRUCTOR:
			case BY:
			case COMPANION:
			case INIT:
			case THIS:
			case SUPER:
			case WHERE:
			case IF:
			case WHEN:
			case TRY:
			case CATCH:
			case FINALLY:
			case FOR:
			case DO:
			case WHILE:
			case THROW:
			case RETURN:
			case CONTINUE:
			case BREAK:
			case IN:
			case OUT:
			case FIELD:
			case PROPERTY:
			case GET:
			case SET:
			case GETTER:
			case SETTER:
			case RECEIVER:
			case PARAM:
			case SETPARAM:
			case DELEGATE:
			case DYNAMIC:
			case PUBLIC:
			case PRIVATE:
			case PROTECTED:
			case INTERNAL:
			case ENUM:
			case SEALED:
			case ANNOTATION:
			case DATA:
			case INNER:
			case TAILREC:
			case OPERATOR:
			case INLINE:
			case INFIX:
			case EXTERNAL:
			case SUSPEND:
			case OVERRIDE:
			case ABSTRACT:
			case FINAL:
			case OPEN:
			case CONST:
			case LATEINIT:
			case VARARG:
			case NOINLINE:
			case CROSSINLINE:
			case REIFIED:
			case QUOTE_OPEN:
			case TRIPLE_QUOTE_OPEN:
			case RealLiteral:
			case LongLiteral:
			case IntegerLiteral:
			case HexLiteral:
			case BinLiteral:
			case BooleanLiteral:
			case NullLiteral:
			case Identifier:
			case LabelReference:
			case LabelDefinition:
			case CharacterLiteral:
				break;
			default:
				break;
			}
			setState(384);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(383);
				semi();
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

	public static class ImportAliasContext extends ParserRuleContext {
		public TerminalNode AS() { return getToken(KotlinParser.AS, 0); }
		public SimpleIdentifierContext simpleIdentifier() {
			return getRuleContext(SimpleIdentifierContext.class,0);
		}
		public ImportAliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importAlias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterImportAlias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitImportAlias(this);
		}
	}

	public final ImportAliasContext importAlias() throws RecognitionException {
		ImportAliasContext _localctx = new ImportAliasContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_importAlias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(386);
			match(AS);
			setState(387);
			simpleIdentifier();
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

	public static class TopLevelObjectContext extends ParserRuleContext {
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public ObjectDeclarationContext objectDeclaration() {
			return getRuleContext(ObjectDeclarationContext.class,0);
		}
		public PropertyDeclarationContext propertyDeclaration() {
			return getRuleContext(PropertyDeclarationContext.class,0);
		}
		public TypeAliasContext typeAlias() {
			return getRuleContext(TypeAliasContext.class,0);
		}
		public SemiContext semi() {
			return getRuleContext(SemiContext.class,0);
		}
		public TopLevelObjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_topLevelObject; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterTopLevelObject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitTopLevelObject(this);
		}
	}

	public final TopLevelObjectContext topLevelObject() throws RecognitionException {
		TopLevelObjectContext _localctx = new TopLevelObjectContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_topLevelObject);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(394);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(389);
				classDeclaration();
				}
				break;
			case 2:
				{
				setState(390);
				functionDeclaration();
				}
				break;
			case 3:
				{
				setState(391);
				objectDeclaration();
				}
				break;
			case 4:
				{
				setState(392);
				propertyDeclaration();
				}
				break;
			case 5:
				{
				setState(393);
				typeAlias();
				}
				break;
			}
			setState(397);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NL || _la==SEMICOLON) {
				{
				setState(396);
				semi();
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

	public static class ClassDeclarationContext extends ParserRuleContext {
		public SimpleIdentifierContext simpleIdentifier() {
			return getRuleContext(SimpleIdentifierContext.class,0);
		}
		public TerminalNode CLASS() { return getToken(KotlinParser.CLASS, 0); }
		public TerminalNode INTERFACE() { return getToken(KotlinParser.INTERFACE, 0); }
		public ModifierListContext modifierList() {
			return getRuleContext(ModifierListContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(KotlinParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(KotlinParser.NL, i);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public PrimaryConstructorContext primaryConstructor() {
			return getRuleContext(PrimaryConstructorContext.class,0);
		}
		public TerminalNode COLON() { return getToken(KotlinParser.COLON, 0); }
		public DelegationSpecifiersContext delegationSpecifiers() {
			return getRuleContext(DelegationSpecifiersContext.class,0);
		}
		public TypeConstraintsContext typeConstraints() {
			return getRuleContext(TypeConstraintsContext.class,0);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public EnumClassBodyContext enumClassBody() {
			return getRuleContext(EnumClassBodyContext.class,0);
		}
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitClassDeclaration(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_classDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(400);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT || _la==FILE || ((((_la - 89)) & ~0x3f) == 0 && ((1L << (_la - 89)) & ((1L << (IN - 89)) | (1L << (OUT - 89)) | (1L << (FIELD - 89)) | (1L << (PROPERTY - 89)) | (1L << (GET - 89)) | (1L << (SET - 89)) | (1L << (RECEIVER - 89)) | (1L << (PARAM - 89)) | (1L << (SETPARAM - 89)) | (1L << (DELEGATE - 89)) | (1L << (PUBLIC - 89)) | (1L << (PRIVATE - 89)) | (1L << (PROTECTED - 89)) | (1L << (INTERNAL - 89)) | (1L << (ENUM - 89)) | (1L << (SEALED - 89)) | (1L << (ANNOTATION - 89)) | (1L << (DATA - 89)) | (1L << (INNER - 89)) | (1L << (TAILREC - 89)) | (1L << (OPERATOR - 89)) | (1L << (INLINE - 89)) | (1L << (INFIX - 89)) | (1L << (EXTERNAL - 89)) | (1L << (SUSPEND - 89)) | (1L << (OVERRIDE - 89)) | (1L << (ABSTRACT - 89)) | (1L << (FINAL - 89)) | (1L << (OPEN - 89)) | (1L << (CONST - 89)) | (1L << (LATEINIT - 89)) | (1L << (VARARG - 89)) | (1L << (NOINLINE - 89)) | (1L << (CROSSINLINE - 89)) | (1L << (REIFIED - 89)) | (1L << (LabelReference - 89)))) != 0)) {
				{
				setState(399);
				modifierList();
				}
			}

			setState(402);
			_la = _input.LA(1);
			if ( !(_la==CLASS || _la==INTERFACE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(406);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(403);
				match(NL);
				}
				}
				setState(408);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(409);
			simpleIdentifier();
			setState(417);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(413);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(410);
					match(NL);
					}
					}
					setState(415);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(416);
				typeParameters();
				}
				break;
			}
			setState(426);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(422);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(419);
					match(NL);
					}
					}
					setState(424);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(425);
				primaryConstructor();
				}
				break;
			}
			setState(442);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(431);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(428);
					match(NL);
					}
					}
					setState(433);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(434);
				match(COLON);
				setState(438);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(435);
					match(NL);
					}
					}
					setState(440);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(441);
				delegationSpecifiers();
				}
				break;
			}
			setState(451);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(447);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(444);
					match(NL);
					}
					}
					setState(449);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(450);
				typeConstraints();
				}
				break;
			}
			setState(467);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				setState(456);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(453);
					match(NL);
					}
					}
					setState(458);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(459);
				classBody();
				}
				break;
			case 2:
				{
				setState(463);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(460);
					match(NL);
					}
					}
					setState(465);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(466);
				enumClassBody();
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

	public static class PrimaryConstructorContext extends ParserRuleContext {
		public ClassParametersContext classParameters() {
			return getRuleContext(ClassParametersContext.class,0);
		}
		public ModifierListContext modifierList() {
			return getRuleContext(ModifierListContext.class,0);
		}
		public TerminalNode CONSTRUCTOR() { return getToken(KotlinParser.CONSTRUCTOR, 0); }
		public List<TerminalNode> NL() { return getTokens(KotlinParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(KotlinParser.NL, i);
		}
		public PrimaryConstructorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryConstructor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterPrimaryConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitPrimaryConstructor(this);
		}
	}

	public final PrimaryConstructorContext primaryConstructor() throws RecognitionException {
		PrimaryConstructorContext _localctx = new PrimaryConstructorContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_primaryConstructor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(470);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT || _la==FILE || ((((_la - 89)) & ~0x3f) == 0 && ((1L << (_la - 89)) & ((1L << (IN - 89)) | (1L << (OUT - 89)) | (1L << (FIELD - 89)) | (1L << (PROPERTY - 89)) | (1L << (GET - 89)) | (1L << (SET - 89)) | (1L << (RECEIVER - 89)) | (1L << (PARAM - 89)) | (1L << (SETPARAM - 89)) | (1L << (DELEGATE - 89)) | (1L << (PUBLIC - 89)) | (1L << (PRIVATE - 89)) | (1L << (PROTECTED - 89)) | (1L << (INTERNAL - 89)) | (1L << (ENUM - 89)) | (1L << (SEALED - 89)) | (1L << (ANNOTATION - 89)) | (1L << (DATA - 89)) | (1L << (INNER - 89)) | (1L << (TAILREC - 89)) | (1L << (OPERATOR - 89)) | (1L << (INLINE - 89)) | (1L << (INFIX - 89)) | (1L << (EXTERNAL - 89)) | (1L << (SUSPEND - 89)) | (1L << (OVERRIDE - 89)) | (1L << (ABSTRACT - 89)) | (1L << (FINAL - 89)) | (1L << (OPEN - 89)) | (1L << (CONST - 89)) | (1L << (LATEINIT - 89)) | (1L << (VARARG - 89)) | (1L << (NOINLINE - 89)) | (1L << (CROSSINLINE - 89)) | (1L << (REIFIED - 89)) | (1L << (LabelReference - 89)))) != 0)) {
				{
				setState(469);
				modifierList();
				}
			}

			setState(479);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONSTRUCTOR) {
				{
				setState(472);
				match(CONSTRUCTOR);
				setState(476);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(473);
					match(NL);
					}
					}
					setState(478);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(481);
			classParameters();
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

	public static class ClassParametersContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(KotlinParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(KotlinParser.RPAREN, 0); }
		public List<ClassParameterContext> classParameter() {
			return getRuleContexts(ClassParameterContext.class);
		}
		public ClassParameterContext classParameter(int i) {
			return getRuleContext(ClassParameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(KotlinParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(KotlinParser.COMMA, i);
		}
		public ClassParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterClassParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitClassParameters(this);
		}
	}

	public final ClassParametersContext classParameters() throws RecognitionException {
		ClassParametersContext _localctx = new ClassParametersContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_classParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(483);
			match(LPAREN);
			setState(492);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 40)) & ~0x3f) == 0 && ((1L << (_la - 40)) & ((1L << (AT - 40)) | (1L << (FILE - 40)) | (1L << (IMPORT - 40)) | (1L << (VAL - 40)) | (1L << (VAR - 40)) | (1L << (CONSTRUCTOR - 40)) | (1L << (BY - 40)) | (1L << (COMPANION - 40)) | (1L << (INIT - 40)) | (1L << (WHERE - 40)) | (1L << (CATCH - 40)) | (1L << (FINALLY - 40)) | (1L << (IN - 40)) | (1L << (OUT - 40)) | (1L << (FIELD - 40)) | (1L << (PROPERTY - 40)) | (1L << (GET - 40)) | (1L << (SET - 40)) | (1L << (GETTER - 40)) | (1L << (SETTER - 40)) | (1L << (RECEIVER - 40)) | (1L << (PARAM - 40)) | (1L << (SETPARAM - 40)) | (1L << (DELEGATE - 40)) | (1L << (DYNAMIC - 40)))) != 0) || ((((_la - 104)) & ~0x3f) == 0 && ((1L << (_la - 104)) & ((1L << (PUBLIC - 104)) | (1L << (PRIVATE - 104)) | (1L << (PROTECTED - 104)) | (1L << (INTERNAL - 104)) | (1L << (ENUM - 104)) | (1L << (SEALED - 104)) | (1L << (ANNOTATION - 104)) | (1L << (DATA - 104)) | (1L << (INNER - 104)) | (1L << (TAILREC - 104)) | (1L << (OPERATOR - 104)) | (1L << (INLINE - 104)) | (1L << (INFIX - 104)) | (1L << (EXTERNAL - 104)) | (1L << (SUSPEND - 104)) | (1L << (OVERRIDE - 104)) | (1L << (ABSTRACT - 104)) | (1L << (FINAL - 104)) | (1L << (OPEN - 104)) | (1L << (CONST - 104)) | (1L << (LATEINIT - 104)) | (1L << (VARARG - 104)) | (1L << (NOINLINE - 104)) | (1L << (CROSSINLINE - 104)) | (1L << (REIFIED - 104)) | (1L << (Identifier - 104)) | (1L << (LabelReference - 104)))) != 0)) {
				{
				setState(484);
				classParameter();
				setState(489);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(485);
					match(COMMA);
					setState(486);
					classParameter();
					}
					}
					setState(491);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(494);
			match(RPAREN);
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

	public static class ClassParameterContext extends ParserRuleContext {
		public SimpleIdentifierContext simpleIdentifier() {
			return getRuleContext(SimpleIdentifierContext.class,0);
		}
		public TerminalNode COLON() { return getToken(KotlinParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ModifierListContext modifierList() {
			return getRuleContext(ModifierListContext.class,0);
		}
		public TerminalNode ASSIGNMENT() { return getToken(KotlinParser.ASSIGNMENT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode VAL() { return getToken(KotlinParser.VAL, 0); }
		public TerminalNode VAR() { return getToken(KotlinParser.VAR, 0); }
		public ClassParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterClassParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitClassParameter(this);
		}
	}

	public final ClassParameterContext classParameter() throws RecognitionException {
		ClassParameterContext _localctx = new ClassParameterContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_classParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(497);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				{
				setState(496);
				modifierList();
				}
				break;
			}
			setState(500);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAL || _la==VAR) {
				{
				setState(499);
				_la = _input.LA(1);
				if ( !(_la==VAL || _la==VAR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(502);
			simpleIdentifier();
			setState(503);
			match(COLON);
			setState(504);
			type();
			setState(507);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGNMENT) {
				{
				setState(505);
				match(ASSIGNMENT);
				setState(506);
				expression();
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

	public static class DelegationSpecifiersContext extends ParserRuleContext {
		public List<DelegationSpecifierContext> delegationSpecifier() {
			return getRuleContexts(DelegationSpecifierContext.class);
		}
		public DelegationSpecifierContext delegationSpecifier(int i) {
			return getRuleContext(DelegationSpecifierContext.class,i);
		}
		public List<AnnotationsContext> annotations() {
			return getRuleContexts(AnnotationsContext.class);
		}
		public AnnotationsContext annotations(int i) {
			return getRuleContext(AnnotationsContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(KotlinParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(KotlinParser.COMMA, i);
		}
		public List<TerminalNode> NL() { return getTokens(KotlinParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(KotlinParser.NL, i);
		}
		public DelegationSpecifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delegationSpecifiers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterDelegationSpecifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitDelegationSpecifiers(this);
		}
	}

	public final DelegationSpecifiersContext delegationSpecifiers() throws RecognitionException {
		DelegationSpecifiersContext _localctx = new DelegationSpecifiersContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_delegationSpecifiers);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(512);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT || _la==FILE || ((((_la - 93)) & ~0x3f) == 0 && ((1L << (_la - 93)) & ((1L << (FIELD - 93)) | (1L << (PROPERTY - 93)) | (1L << (GET - 93)) | (1L << (SET - 93)) | (1L << (RECEIVER - 93)) | (1L << (PARAM - 93)) | (1L << (SETPARAM - 93)) | (1L << (DELEGATE - 93)) | (1L << (LabelReference - 93)))) != 0)) {
				{
				{
				setState(509);
				annotations();
				}
				}
				setState(514);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(515);
			delegationSpecifier();
			setState(532);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(519);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(516);
						match(NL);
						}
						}
						setState(521);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(522);
					match(COMMA);
					setState(526);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(523);
						match(NL);
						}
						}
						setState(528);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(529);
					delegationSpecifier();
					}
					} 
				}
				setState(534);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
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

	public static class DelegationSpecifierContext extends ParserRuleContext {
		public ConstructorInvocationContext constructorInvocation() {
			return getRuleContext(ConstructorInvocationContext.class,0);
		}
		public UserTypeContext userType() {
			return getRuleContext(UserTypeContext.class,0);
		}
		public ExplicitDelegationContext explicitDelegation() {
			return getRuleContext(ExplicitDelegationContext.class,0);
		}
		public DelegationSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delegationSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterDelegationSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitDelegationSpecifier(this);
		}
	}

	public final DelegationSpecifierContext delegationSpecifier() throws RecognitionException {
		DelegationSpecifierContext _localctx = new DelegationSpecifierContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_delegationSpecifier);
		try {
			setState(538);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(535);
				constructorInvocation();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(536);
				userType();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(537);
				explicitDelegation();
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

	public static class ConstructorInvocationContext extends ParserRuleContext {
		public UserTypeContext userType() {
			return getRuleContext(UserTypeContext.class,0);
		}
		public CallSuffixContext callSuffix() {
			return getRuleContext(CallSuffixContext.class,0);
		}
		public ConstructorInvocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorInvocation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterConstructorInvocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitConstructorInvocation(this);
		}
	}

	public final ConstructorInvocationContext constructorInvocation() throws RecognitionException {
		ConstructorInvocationContext _localctx = new ConstructorInvocationContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_constructorInvocation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(540);
			userType();
			setState(541);
			callSuffix();
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

	public static class ExplicitDelegationContext extends ParserRuleContext {
		public UserTypeContext userType() {
			return getRuleContext(UserTypeContext.class,0);
		}
		public TerminalNode BY() { return getToken(KotlinParser.BY, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(KotlinParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(KotlinParser.NL, i);
		}
		public ExplicitDelegationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explicitDelegation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterExplicitDelegation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitExplicitDelegation(this);
		}
	}

	public final ExplicitDelegationContext explicitDelegation() throws RecognitionException {
		ExplicitDelegationContext _localctx = new ExplicitDelegationContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_explicitDelegation);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(543);
			userType();
			setState(547);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(544);
				match(NL);
				}
				}
				setState(549);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(550);
			match(BY);
			setState(554);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(551);
					match(NL);
					}
					} 
				}
				setState(556);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
			}
			setState(557);
			expression();
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

	public static class ClassBodyContext extends ParserRuleContext {
		public TerminalNode LCURL() { return getToken(KotlinParser.LCURL, 0); }
		public TerminalNode RCURL() { return getToken(KotlinParser.RCURL, 0); }
		public List<TerminalNode> NL() { return getTokens(KotlinParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(KotlinParser.NL, i);
		}
		public List<ClassMemberDeclarationContext> classMemberDeclaration() {
			return getRuleContexts(ClassMemberDeclarationContext.class);
		}
		public ClassMemberDeclarationContext classMemberDeclaration(int i) {
			return getRuleContext(ClassMemberDeclarationContext.class,i);
		}
		public ClassBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterClassBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitClassBody(this);
		}
	}

	public final ClassBodyContext classBody() throws RecognitionException {
		ClassBodyContext _localctx = new ClassBodyContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_classBody);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(559);
			match(LCURL);
			setState(563);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(560);
					match(NL);
					}
					} 
				}
				setState(565);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
			}
			setState(569);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 40)) & ~0x3f) == 0 && ((1L << (_la - 40)) & ((1L << (AT - 40)) | (1L << (FILE - 40)) | (1L << (CLASS - 40)) | (1L << (INTERFACE - 40)) | (1L << (FUN - 40)) | (1L << (OBJECT - 40)) | (1L << (VAL - 40)) | (1L << (VAR - 40)) | (1L << (TYPE_ALIAS - 40)) | (1L << (CONSTRUCTOR - 40)) | (1L << (COMPANION - 40)) | (1L << (INIT - 40)) | (1L << (IN - 40)) | (1L << (OUT - 40)) | (1L << (FIELD - 40)) | (1L << (PROPERTY - 40)) | (1L << (GET - 40)) | (1L << (SET - 40)) | (1L << (RECEIVER - 40)) | (1L << (PARAM - 40)) | (1L << (SETPARAM - 40)) | (1L << (DELEGATE - 40)))) != 0) || ((((_la - 104)) & ~0x3f) == 0 && ((1L << (_la - 104)) & ((1L << (PUBLIC - 104)) | (1L << (PRIVATE - 104)) | (1L << (PROTECTED - 104)) | (1L << (INTERNAL - 104)) | (1L << (ENUM - 104)) | (1L << (SEALED - 104)) | (1L << (ANNOTATION - 104)) | (1L << (DATA - 104)) | (1L << (INNER - 104)) | (1L << (TAILREC - 104)) | (1L << (OPERATOR - 104)) | (1L << (INLINE - 104)) | (1L << (INFIX - 104)) | (1L << (EXTERNAL - 104)) | (1L << (SUSPEND - 104)) | (1L << (OVERRIDE - 104)) | (1L << (ABSTRACT - 104)) | (1L << (FINAL - 104)) | (1L << (OPEN - 104)) | (1L << (CONST - 104)) | (1L << (LATEINIT - 104)) | (1L << (VARARG - 104)) | (1L << (NOINLINE - 104)) | (1L << (CROSSINLINE - 104)) | (1L << (REIFIED - 104)) | (1L << (LabelReference - 104)))) != 0)) {
				{
				{
				setState(566);
				classMemberDeclaration();
				}
				}
				setState(571);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(575);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(572);
				match(NL);
				}
				}
				setState(577);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(578);
			match(RCURL);
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

	public static class ClassMemberDeclarationContext extends ParserRuleContext {
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public ObjectDeclarationContext objectDeclaration() {
			return getRuleContext(ObjectDeclarationContext.class,0);
		}
		public CompanionObjectContext companionObject() {
			return getRuleContext(CompanionObjectContext.class,0);
		}
		public PropertyDeclarationContext propertyDeclaration() {
			return getRuleContext(PropertyDeclarationContext.class,0);
		}
		public AnonymousInitializerContext anonymousInitializer() {
			return getRuleContext(AnonymousInitializerContext.class,0);
		}
		public SecondaryConstructorContext secondaryConstructor() {
			return getRuleContext(SecondaryConstructorContext.class,0);
		}
		public TypeAliasContext typeAlias() {
			return getRuleContext(TypeAliasContext.class,0);
		}
		public SemiContext semi() {
			return getRuleContext(SemiContext.class,0);
		}
		public ClassMemberDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classMemberDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterClassMemberDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitClassMemberDeclaration(this);
		}
	}

	public final ClassMemberDeclarationContext classMemberDeclaration() throws RecognitionException {
		ClassMemberDeclarationContext _localctx = new ClassMemberDeclarationContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_classMemberDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(588);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				{
				setState(580);
				classDeclaration();
				}
				break;
			case 2:
				{
				setState(581);
				functionDeclaration();
				}
				break;
			case 3:
				{
				setState(582);
				objectDeclaration();
				}
				break;
			case 4:
				{
				setState(583);
				companionObject();
				}
				break;
			case 5:
				{
				setState(584);
				propertyDeclaration();
				}
				break;
			case 6:
				{
				setState(585);
				anonymousInitializer();
				}
				break;
			case 7:
				{
				setState(586);
				secondaryConstructor();
				}
				break;
			case 8:
				{
				setState(587);
				typeAlias();
				}
				break;
			}
			setState(591);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				{
				setState(590);
				semi();
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

	public static class AnonymousInitializerContext extends ParserRuleContext {
		public TerminalNode INIT() { return getToken(KotlinParser.INIT, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(KotlinParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(KotlinParser.NL, i);
		}
		public AnonymousInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anonymousInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterAnonymousInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitAnonymousInitializer(this);
		}
	}

	public final AnonymousInitializerContext anonymousInitializer() throws RecognitionException {
		AnonymousInitializerContext _localctx = new AnonymousInitializerContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_anonymousInitializer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(593);
			match(INIT);
			setState(597);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(594);
				match(NL);
				}
				}
				setState(599);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(600);
			block();
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

	public static class SecondaryConstructorContext extends ParserRuleContext {
		public TerminalNode CONSTRUCTOR() { return getToken(KotlinParser.CONSTRUCTOR, 0); }
		public FunctionValueParametersContext functionValueParameters() {
			return getRuleContext(FunctionValueParametersContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ModifierListContext modifierList() {
			return getRuleContext(ModifierListContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(KotlinParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(KotlinParser.NL, i);
		}
		public TerminalNode COLON() { return getToken(KotlinParser.COLON, 0); }
		public ConstructorDelegationCallContext constructorDelegationCall() {
			return getRuleContext(ConstructorDelegationCallContext.class,0);
		}
		public SecondaryConstructorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_secondaryConstructor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterSecondaryConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitSecondaryConstructor(this);
		}
	}

	public final SecondaryConstructorContext secondaryConstructor() throws RecognitionException {
		SecondaryConstructorContext _localctx = new SecondaryConstructorContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_secondaryConstructor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(603);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT || _la==FILE || ((((_la - 89)) & ~0x3f) == 0 && ((1L << (_la - 89)) & ((1L << (IN - 89)) | (1L << (OUT - 89)) | (1L << (FIELD - 89)) | (1L << (PROPERTY - 89)) | (1L << (GET - 89)) | (1L << (SET - 89)) | (1L << (RECEIVER - 89)) | (1L << (PARAM - 89)) | (1L << (SETPARAM - 89)) | (1L << (DELEGATE - 89)) | (1L << (PUBLIC - 89)) | (1L << (PRIVATE - 89)) | (1L << (PROTECTED - 89)) | (1L << (INTERNAL - 89)) | (1L << (ENUM - 89)) | (1L << (SEALED - 89)) | (1L << (ANNOTATION - 89)) | (1L << (DATA - 89)) | (1L << (INNER - 89)) | (1L << (TAILREC - 89)) | (1L << (OPERATOR - 89)) | (1L << (INLINE - 89)) | (1L << (INFIX - 89)) | (1L << (EXTERNAL - 89)) | (1L << (SUSPEND - 89)) | (1L << (OVERRIDE - 89)) | (1L << (ABSTRACT - 89)) | (1L << (FINAL - 89)) | (1L << (OPEN - 89)) | (1L << (CONST - 89)) | (1L << (LATEINIT - 89)) | (1L << (VARARG - 89)) | (1L << (NOINLINE - 89)) | (1L << (CROSSINLINE - 89)) | (1L << (REIFIED - 89)) | (1L << (LabelReference - 89)))) != 0)) {
				{
				setState(602);
				modifierList();
				}
			}

			setState(605);
			match(CONSTRUCTOR);
			setState(609);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(606);
				match(NL);
				}
				}
				setState(611);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(612);
			functionValueParameters();
			setState(627);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				{
				setState(616);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(613);
					match(NL);
					}
					}
					setState(618);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(619);
				match(COLON);
				setState(623);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(620);
					match(NL);
					}
					}
					setState(625);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(626);
				constructorDelegationCall();
				}
				break;
			}
			setState(632);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(629);
				match(NL);
				}
				}
				setState(634);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(635);
			block();
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

	public static class ConstructorDelegationCallContext extends ParserRuleContext {
		public TerminalNode THIS() { return getToken(KotlinParser.THIS, 0); }
		public ValueArgumentsContext valueArguments() {
			return getRuleContext(ValueArgumentsContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(KotlinParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(KotlinParser.NL, i);
		}
		public TerminalNode SUPER() { return getToken(KotlinParser.SUPER, 0); }
		public ConstructorDelegationCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorDelegationCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterConstructorDelegationCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitConstructorDelegationCall(this);
		}
	}

	public final ConstructorDelegationCallContext constructorDelegationCall() throws RecognitionException {
		ConstructorDelegationCallContext _localctx = new ConstructorDelegationCallContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_constructorDelegationCall);
		int _la;
		try {
			setState(653);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case THIS:
				enterOuterAlt(_localctx, 1);
				{
				setState(637);
				match(THIS);
				setState(641);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(638);
					match(NL);
					}
					}
					setState(643);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(644);
				valueArguments();
				}
				break;
			case SUPER:
				enterOuterAlt(_localctx, 2);
				{
				setState(645);
				match(SUPER);
				setState(649);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(646);
					match(NL);
					}
					}
					setState(651);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(652);
				valueArguments();
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

	public static class EnumClassBodyContext extends ParserRuleContext {
		public TerminalNode LCURL() { return getToken(KotlinParser.LCURL, 0); }
		public TerminalNode RCURL() { return getToken(KotlinParser.RCURL, 0); }
		public List<TerminalNode> NL() { return getTokens(KotlinParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(KotlinParser.NL, i);
		}
		public EnumEntriesContext enumEntries() {
			return getRuleContext(EnumEntriesContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(KotlinParser.SEMICOLON, 0); }
		public List<ClassMemberDeclarationContext> classMemberDeclaration() {
			return getRuleContexts(ClassMemberDeclarationContext.class);
		}
		public ClassMemberDeclarationContext classMemberDeclaration(int i) {
			return getRuleContext(ClassMemberDeclarationContext.class,i);
		}
		public EnumClassBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumClassBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterEnumClassBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitEnumClassBody(this);
		}
	}

	public final EnumClassBodyContext enumClassBody() throws RecognitionException {
		EnumClassBodyContext _localctx = new EnumClassBodyContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_enumClassBody);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(655);
			match(LCURL);
			setState(659);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(656);
					match(NL);
					}
					} 
				}
				setState(661);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
			}
			setState(663);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 58)) & ~0x3f) == 0 && ((1L << (_la - 58)) & ((1L << (IMPORT - 58)) | (1L << (CONSTRUCTOR - 58)) | (1L << (BY - 58)) | (1L << (COMPANION - 58)) | (1L << (INIT - 58)) | (1L << (WHERE - 58)) | (1L << (CATCH - 58)) | (1L << (FINALLY - 58)) | (1L << (OUT - 58)) | (1L << (GETTER - 58)) | (1L << (SETTER - 58)) | (1L << (DYNAMIC - 58)) | (1L << (PUBLIC - 58)) | (1L << (PRIVATE - 58)) | (1L << (PROTECTED - 58)) | (1L << (INTERNAL - 58)) | (1L << (ENUM - 58)) | (1L << (SEALED - 58)) | (1L << (ANNOTATION - 58)) | (1L << (DATA - 58)) | (1L << (INNER - 58)) | (1L << (TAILREC - 58)) | (1L << (OPERATOR - 58)) | (1L << (INLINE - 58)) | (1L << (INFIX - 58)) | (1L << (EXTERNAL - 58)) | (1L << (SUSPEND - 58)) | (1L << (OVERRIDE - 58)) | (1L << (ABSTRACT - 58)) | (1L << (FINAL - 58)))) != 0) || ((((_la - 122)) & ~0x3f) == 0 && ((1L << (_la - 122)) & ((1L << (OPEN - 122)) | (1L << (CONST - 122)) | (1L << (LATEINIT - 122)) | (1L << (VARARG - 122)) | (1L << (NOINLINE - 122)) | (1L << (CROSSINLINE - 122)) | (1L << (REIFIED - 122)) | (1L << (Identifier - 122)))) != 0)) {
				{
				setState(662);
				enumEntries();
				}
			}

			setState(684);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				{
				setState(668);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(665);
					match(NL);
					}
					}
					setState(670);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(671);
				match(SEMICOLON);
				setState(675);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(672);
						match(NL);
						}
						} 
					}
					setState(677);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
				}
				setState(681);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 40)) & ~0x3f) == 0 && ((1L << (_la - 40)) & ((1L << (AT - 40)) | (1L << (FILE - 40)) | (1L << (CLASS - 40)) | (1L << (INTERFACE - 40)) | (1L << (FUN - 40)) | (1L << (OBJECT - 40)) | (1L << (VAL - 40)) | (1L << (VAR - 40)) | (1L << (TYPE_ALIAS - 40)) | (1L << (CONSTRUCTOR - 40)) | (1L << (COMPANION - 40)) | (1L << (INIT - 40)) | (1L << (IN - 40)) | (1L << (OUT - 40)) | (1L << (FIELD - 40)) | (1L << (PROPERTY - 40)) | (1L << (GET - 40)) | (1L << (SET - 40)) | (1L << (RECEIVER - 40)) | (1L << (PARAM - 40)) | (1L << (SETPARAM - 40)) | (1L << (DELEGATE - 40)))) != 0) || ((((_la - 104)) & ~0x3f) == 0 && ((1L << (_la - 104)) & ((1L << (PUBLIC - 104)) | (1L << (PRIVATE - 104)) | (1L << (PROTECTED - 104)) | (1L << (INTERNAL - 104)) | (1L << (ENUM - 104)) | (1L << (SEALED - 104)) | (1L << (ANNOTATION - 104)) | (1L << (DATA - 104)) | (1L << (INNER - 104)) | (1L << (TAILREC - 104)) | (1L << (OPERATOR - 104)) | (1L << (INLINE - 104)) | (1L << (INFIX - 104)) | (1L << (EXTERNAL - 104)) | (1L << (SUSPEND - 104)) | (1L << (OVERRIDE - 104)) | (1L << (ABSTRACT - 104)) | (1L << (FINAL - 104)) | (1L << (OPEN - 104)) | (1L << (CONST - 104)) | (1L << (LATEINIT - 104)) | (1L << (VARARG - 104)) | (1L << (NOINLINE - 104)) | (1L << (CROSSINLINE - 104)) | (1L << (REIFIED - 104)) | (1L << (LabelReference - 104)))) != 0)) {
					{
					{
					setState(678);
					classMemberDeclaration();
					}
					}
					setState(683);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(689);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(686);
				match(NL);
				}
				}
				setState(691);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(692);
			match(RCURL);
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

	public static class EnumEntriesContext extends ParserRuleContext {
		public List<EnumEntryContext> enumEntry() {
			return getRuleContexts(EnumEntryContext.class);
		}
		public EnumEntryContext enumEntry(int i) {
			return getRuleContext(EnumEntryContext.class,i);
		}
		public TerminalNode SEMICOLON() { return getToken(KotlinParser.SEMICOLON, 0); }
		public List<TerminalNode> NL() { return getTokens(KotlinParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(KotlinParser.NL, i);
		}
		public EnumEntriesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumEntries; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterEnumEntries(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitEnumEntries(this);
		}
	}

	public final EnumEntriesContext enumEntries() throws RecognitionException {
		EnumEntriesContext _localctx = new EnumEntriesContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_enumEntries);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(701); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(694);
				enumEntry();
				setState(698);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(695);
						match(NL);
						}
						} 
					}
					setState(700);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
				}
				}
				}
				setState(703); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 58)) & ~0x3f) == 0 && ((1L << (_la - 58)) & ((1L << (IMPORT - 58)) | (1L << (CONSTRUCTOR - 58)) | (1L << (BY - 58)) | (1L << (COMPANION - 58)) | (1L << (INIT - 58)) | (1L << (WHERE - 58)) | (1L << (CATCH - 58)) | (1L << (FINALLY - 58)) | (1L << (OUT - 58)) | (1L << (GETTER - 58)) | (1L << (SETTER - 58)) | (1L << (DYNAMIC - 58)) | (1L << (PUBLIC - 58)) | (1L << (PRIVATE - 58)) | (1L << (PROTECTED - 58)) | (1L << (INTERNAL - 58)) | (1L << (ENUM - 58)) | (1L << (SEALED - 58)) | (1L << (ANNOTATION - 58)) | (1L << (DATA - 58)) | (1L << (INNER - 58)) | (1L << (TAILREC - 58)) | (1L << (OPERATOR - 58)) | (1L << (INLINE - 58)) | (1L << (INFIX - 58)) | (1L << (EXTERNAL - 58)) | (1L << (SUSPEND - 58)) | (1L << (OVERRIDE - 58)) | (1L << (ABSTRACT - 58)) | (1L << (FINAL - 58)))) != 0) || ((((_la - 122)) & ~0x3f) == 0 && ((1L << (_la - 122)) & ((1L << (OPEN - 122)) | (1L << (CONST - 122)) | (1L << (LATEINIT - 122)) | (1L << (VARARG - 122)) | (1L << (NOINLINE - 122)) | (1L << (CROSSINLINE - 122)) | (1L << (REIFIED - 122)) | (1L << (Identifier - 122)))) != 0) );
			setState(706);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				{
				setState(705);
				match(SEMICOLON);
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

	public static class EnumEntryContext extends ParserRuleContext {
		public SimpleIdentifierContext simpleIdentifier() {
			return getRuleContext(SimpleIdentifierContext.class,0);
		}
		public ValueArgumentsContext valueArguments() {
			return getRuleContext(ValueArgumentsContext.class,0);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(KotlinParser.COMMA, 0); }
		public List<TerminalNode> NL() { return getTokens(KotlinParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(KotlinParser.NL, i);
		}
		public EnumEntryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumEntry; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterEnumEntry(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitEnumEntry(this);
		}
	}

	public final EnumEntryContext enumEntry() throws RecognitionException {
		EnumEntryContext _localctx = new EnumEntryContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_enumEntry);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(708);
			simpleIdentifier();
			setState(716);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
			case 1:
				{
				setState(712);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(709);
					match(NL);
					}
					}
					setState(714);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(715);
				valueArguments();
				}
				break;
			}
			setState(725);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
			case 1:
				{
				setState(721);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(718);
					match(NL);
					}
					}
					setState(723);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(724);
				classBody();
				}
				break;
			}
			setState(734);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
			case 1:
				{
				setState(730);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(727);
					match(NL);
					}
					}
					setState(732);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(733);
				match(COMMA);
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

	public static class FunctionDeclarationContext extends ParserRuleContext {
		public TerminalNode FUN() { return getToken(KotlinParser.FUN, 0); }
		public FunctionValueParametersContext functionValueParameters() {
			return getRuleContext(FunctionValueParametersContext.class,0);
		}
		public ModifierListContext modifierList() {
			return getRuleContext(ModifierListContext.class,0);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public TerminalNode DOT() { return getToken(KotlinParser.DOT, 0); }
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(KotlinParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(KotlinParser.NL, i);
		}
		public TerminalNode COLON() { return getToken(KotlinParser.COLON, 0); }
		public TypeConstraintsContext typeConstraints() {
			return getRuleContext(TypeConstraintsContext.class,0);
		}
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public FunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterFunctionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitFunctionDeclaration(this);
		}
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_functionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(737);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT || _la==FILE || ((((_la - 89)) & ~0x3f) == 0 && ((1L << (_la - 89)) & ((1L << (IN - 89)) | (1L << (OUT - 89)) | (1L << (FIELD - 89)) | (1L << (PROPERTY - 89)) | (1L << (GET - 89)) | (1L << (SET - 89)) | (1L << (RECEIVER - 89)) | (1L << (PARAM - 89)) | (1L << (SETPARAM - 89)) | (1L << (DELEGATE - 89)) | (1L << (PUBLIC - 89)) | (1L << (PRIVATE - 89)) | (1L << (PROTECTED - 89)) | (1L << (INTERNAL - 89)) | (1L << (ENUM - 89)) | (1L << (SEALED - 89)) | (1L << (ANNOTATION - 89)) | (1L << (DATA - 89)) | (1L << (INNER - 89)) | (1L << (TAILREC - 89)) | (1L << (OPERATOR - 89)) | (1L << (INLINE - 89)) | (1L << (INFIX - 89)) | (1L << (EXTERNAL - 89)) | (1L << (SUSPEND - 89)) | (1L << (OVERRIDE - 89)) | (1L << (ABSTRACT - 89)) | (1L << (FINAL - 89)) | (1L << (OPEN - 89)) | (1L << (CONST - 89)) | (1L << (LATEINIT - 89)) | (1L << (VARARG - 89)) | (1L << (NOINLINE - 89)) | (1L << (CROSSINLINE - 89)) | (1L << (REIFIED - 89)) | (1L << (LabelReference - 89)))) != 0)) {
				{
				setState(736);
				modifierList();
				}
			}

			setState(739);
			match(FUN);
			setState(755);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
			case 1:
				{
				setState(743);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(740);
					match(NL);
					}
					}
					setState(745);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(746);
				type();
				setState(750);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(747);
					match(NL);
					}
					}
					setState(752);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(753);
				match(DOT);
				}
				break;
			}
			setState(764);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
			case 1:
				{
				setState(760);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(757);
					match(NL);
					}
					}
					setState(762);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(763);
				typeParameters();
				}
				break;
			}
			setState(773);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
			case 1:
				{
				setState(769);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(766);
					match(NL);
					}
					}
					setState(771);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(772);
				identifier();
				}
				break;
			}
			setState(778);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(775);
				match(NL);
				}
				}
				setState(780);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(781);
			functionValueParameters();
			setState(796);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
			case 1:
				{
				setState(785);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(782);
					match(NL);
					}
					}
					setState(787);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(788);
				match(COLON);
				setState(792);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(789);
					match(NL);
					}
					}
					setState(794);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(795);
				type();
				}
				break;
			}
			setState(805);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
			case 1:
				{
				setState(801);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(798);
					match(NL);
					}
					}
					setState(803);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(804);
				typeConstraints();
				}
				break;
			}
			setState(814);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
			case 1:
				{
				setState(810);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(807);
					match(NL);
					}
					}
					setState(812);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(813);
				functionBody();
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

	public static class FunctionValueParametersContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(KotlinParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(KotlinParser.RPAREN, 0); }
		public List<FunctionValueParameterContext> functionValueParameter() {
			return getRuleContexts(FunctionValueParameterContext.class);
		}
		public FunctionValueParameterContext functionValueParameter(int i) {
			return getRuleContext(FunctionValueParameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(KotlinParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(KotlinParser.COMMA, i);
		}
		public FunctionValueParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionValueParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterFunctionValueParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitFunctionValueParameters(this);
		}
	}

	public final FunctionValueParametersContext functionValueParameters() throws RecognitionException {
		FunctionValueParametersContext _localctx = new FunctionValueParametersContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_functionValueParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(816);
			match(LPAREN);
			setState(825);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 40)) & ~0x3f) == 0 && ((1L << (_la - 40)) & ((1L << (AT - 40)) | (1L << (FILE - 40)) | (1L << (IMPORT - 40)) | (1L << (CONSTRUCTOR - 40)) | (1L << (BY - 40)) | (1L << (COMPANION - 40)) | (1L << (INIT - 40)) | (1L << (WHERE - 40)) | (1L << (CATCH - 40)) | (1L << (FINALLY - 40)) | (1L << (IN - 40)) | (1L << (OUT - 40)) | (1L << (FIELD - 40)) | (1L << (PROPERTY - 40)) | (1L << (GET - 40)) | (1L << (SET - 40)) | (1L << (GETTER - 40)) | (1L << (SETTER - 40)) | (1L << (RECEIVER - 40)) | (1L << (PARAM - 40)) | (1L << (SETPARAM - 40)) | (1L << (DELEGATE - 40)) | (1L << (DYNAMIC - 40)))) != 0) || ((((_la - 104)) & ~0x3f) == 0 && ((1L << (_la - 104)) & ((1L << (PUBLIC - 104)) | (1L << (PRIVATE - 104)) | (1L << (PROTECTED - 104)) | (1L << (INTERNAL - 104)) | (1L << (ENUM - 104)) | (1L << (SEALED - 104)) | (1L << (ANNOTATION - 104)) | (1L << (DATA - 104)) | (1L << (INNER - 104)) | (1L << (TAILREC - 104)) | (1L << (OPERATOR - 104)) | (1L << (INLINE - 104)) | (1L << (INFIX - 104)) | (1L << (EXTERNAL - 104)) | (1L << (SUSPEND - 104)) | (1L << (OVERRIDE - 104)) | (1L << (ABSTRACT - 104)) | (1L << (FINAL - 104)) | (1L << (OPEN - 104)) | (1L << (CONST - 104)) | (1L << (LATEINIT - 104)) | (1L << (VARARG - 104)) | (1L << (NOINLINE - 104)) | (1L << (CROSSINLINE - 104)) | (1L << (REIFIED - 104)) | (1L << (Identifier - 104)) | (1L << (LabelReference - 104)))) != 0)) {
				{
				setState(817);
				functionValueParameter();
				setState(822);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(818);
					match(COMMA);
					setState(819);
					functionValueParameter();
					}
					}
					setState(824);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(827);
			match(RPAREN);
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

	public static class FunctionValueParameterContext extends ParserRuleContext {
		public ParameterContext parameter() {
			return getRuleContext(ParameterContext.class,0);
		}
		public ModifierListContext modifierList() {
			return getRuleContext(ModifierListContext.class,0);
		}
		public TerminalNode ASSIGNMENT() { return getToken(KotlinParser.ASSIGNMENT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FunctionValueParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionValueParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterFunctionValueParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitFunctionValueParameter(this);
		}
	}

	public final FunctionValueParameterContext functionValueParameter() throws RecognitionException {
		FunctionValueParameterContext _localctx = new FunctionValueParameterContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_functionValueParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(830);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,96,_ctx) ) {
			case 1:
				{
				setState(829);
				modifierList();
				}
				break;
			}
			setState(832);
			parameter();
			setState(835);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGNMENT) {
				{
				setState(833);
				match(ASSIGNMENT);
				setState(834);
				expression();
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

	public static class ParameterContext extends ParserRuleContext {
		public SimpleIdentifierContext simpleIdentifier() {
			return getRuleContext(SimpleIdentifierContext.class,0);
		}
		public TerminalNode COLON() { return getToken(KotlinParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitParameter(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(837);
			simpleIdentifier();
			setState(838);
			match(COLON);
			setState(839);
			type();
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

	public static class FunctionBodyContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode ASSIGNMENT() { return getToken(KotlinParser.ASSIGNMENT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(KotlinParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(KotlinParser.NL, i);
		}
		public FunctionBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterFunctionBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitFunctionBody(this);
		}
	}

	public final FunctionBodyContext functionBody() throws RecognitionException {
		FunctionBodyContext _localctx = new FunctionBodyContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_functionBody);
		try {
			int _alt;
			setState(850);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LCURL:
				enterOuterAlt(_localctx, 1);
				{
				setState(841);
				block();
				}
				break;
			case ASSIGNMENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(842);
				match(ASSIGNMENT);
				setState(846);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,98,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(843);
						match(NL);
						}
						} 
					}
					setState(848);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,98,_ctx);
				}
				setState(849);
				expression();
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

	public static class ObjectDeclarationContext extends ParserRuleContext {
		public TerminalNode OBJECT() { return getToken(KotlinParser.OBJECT, 0); }
		public SimpleIdentifierContext simpleIdentifier() {
			return getRuleContext(SimpleIdentifierContext.class,0);
		}
		public ModifierListContext modifierList() {
			return getRuleContext(ModifierListContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(KotlinParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(KotlinParser.NL, i);
		}
		public PrimaryConstructorContext primaryConstructor() {
			return getRuleContext(PrimaryConstructorContext.class,0);
		}
		public TerminalNode COLON() { return getToken(KotlinParser.COLON, 0); }
		public DelegationSpecifiersContext delegationSpecifiers() {
			return getRuleContext(DelegationSpecifiersContext.class,0);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public ObjectDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterObjectDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitObjectDeclaration(this);
		}
	}

	public final ObjectDeclarationContext objectDeclaration() throws RecognitionException {
		ObjectDeclarationContext _localctx = new ObjectDeclarationContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_objectDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(853);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT || _la==FILE || ((((_la - 89)) & ~0x3f) == 0 && ((1L << (_la - 89)) & ((1L << (IN - 89)) | (1L << (OUT - 89)) | (1L << (FIELD - 89)) | (1L << (PROPERTY - 89)) | (1L << (GET - 89)) | (1L << (SET - 89)) | (1L << (RECEIVER - 89)) | (1L << (PARAM - 89)) | (1L << (SETPARAM - 89)) | (1L << (DELEGATE - 89)) | (1L << (PUBLIC - 89)) | (1L << (PRIVATE - 89)) | (1L << (PROTECTED - 89)) | (1L << (INTERNAL - 89)) | (1L << (ENUM - 89)) | (1L << (SEALED - 89)) | (1L << (ANNOTATION - 89)) | (1L << (DATA - 89)) | (1L << (INNER - 89)) | (1L << (TAILREC - 89)) | (1L << (OPERATOR - 89)) | (1L << (INLINE - 89)) | (1L << (INFIX - 89)) | (1L << (EXTERNAL - 89)) | (1L << (SUSPEND - 89)) | (1L << (OVERRIDE - 89)) | (1L << (ABSTRACT - 89)) | (1L << (FINAL - 89)) | (1L << (OPEN - 89)) | (1L << (CONST - 89)) | (1L << (LATEINIT - 89)) | (1L << (VARARG - 89)) | (1L << (NOINLINE - 89)) | (1L << (CROSSINLINE - 89)) | (1L << (REIFIED - 89)) | (1L << (LabelReference - 89)))) != 0)) {
				{
				setState(852);
				modifierList();
				}
			}

			setState(855);
			match(OBJECT);
			setState(859);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(856);
				match(NL);
				}
				}
				setState(861);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(862);
			simpleIdentifier();
			setState(870);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,103,_ctx) ) {
			case 1:
				{
				setState(866);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(863);
					match(NL);
					}
					}
					setState(868);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(869);
				primaryConstructor();
				}
				break;
			}
			setState(886);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
			case 1:
				{
				setState(875);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(872);
					match(NL);
					}
					}
					setState(877);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(878);
				match(COLON);
				setState(882);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(879);
					match(NL);
					}
					}
					setState(884);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(885);
				delegationSpecifiers();
				}
				break;
			}
			setState(895);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
			case 1:
				{
				setState(891);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(888);
					match(NL);
					}
					}
					setState(893);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(894);
				classBody();
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

	public static class CompanionObjectContext extends ParserRuleContext {
		public TerminalNode COMPANION() { return getToken(KotlinParser.COMPANION, 0); }
		public TerminalNode OBJECT() { return getToken(KotlinParser.OBJECT, 0); }
		public List<ModifierListContext> modifierList() {
			return getRuleContexts(ModifierListContext.class);
		}
		public ModifierListContext modifierList(int i) {
			return getRuleContext(ModifierListContext.class,i);
		}
		public List<TerminalNode> NL() { return getTokens(KotlinParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(KotlinParser.NL, i);
		}
		public SimpleIdentifierContext simpleIdentifier() {
			return getRuleContext(SimpleIdentifierContext.class,0);
		}
		public TerminalNode COLON() { return getToken(KotlinParser.COLON, 0); }
		public DelegationSpecifiersContext delegationSpecifiers() {
			return getRuleContext(DelegationSpecifiersContext.class,0);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public CompanionObjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_companionObject; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterCompanionObject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitCompanionObject(this);
		}
	}

	public final CompanionObjectContext companionObject() throws RecognitionException {
		CompanionObjectContext _localctx = new CompanionObjectContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_companionObject);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(898);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT || _la==FILE || ((((_la - 89)) & ~0x3f) == 0 && ((1L << (_la - 89)) & ((1L << (IN - 89)) | (1L << (OUT - 89)) | (1L << (FIELD - 89)) | (1L << (PROPERTY - 89)) | (1L << (GET - 89)) | (1L << (SET - 89)) | (1L << (RECEIVER - 89)) | (1L << (PARAM - 89)) | (1L << (SETPARAM - 89)) | (1L << (DELEGATE - 89)) | (1L << (PUBLIC - 89)) | (1L << (PRIVATE - 89)) | (1L << (PROTECTED - 89)) | (1L << (INTERNAL - 89)) | (1L << (ENUM - 89)) | (1L << (SEALED - 89)) | (1L << (ANNOTATION - 89)) | (1L << (DATA - 89)) | (1L << (INNER - 89)) | (1L << (TAILREC - 89)) | (1L << (OPERATOR - 89)) | (1L << (INLINE - 89)) | (1L << (INFIX - 89)) | (1L << (EXTERNAL - 89)) | (1L << (SUSPEND - 89)) | (1L << (OVERRIDE - 89)) | (1L << (ABSTRACT - 89)) | (1L << (FINAL - 89)) | (1L << (OPEN - 89)) | (1L << (CONST - 89)) | (1L << (LATEINIT - 89)) | (1L << (VARARG - 89)) | (1L << (NOINLINE - 89)) | (1L << (CROSSINLINE - 89)) | (1L << (REIFIED - 89)) | (1L << (LabelReference - 89)))) != 0)) {
				{
				setState(897);
				modifierList();
				}
			}

			setState(900);
			match(COMPANION);
			setState(904);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(901);
				match(NL);
				}
				}
				setState(906);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(908);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT || _la==FILE || ((((_la - 89)) & ~0x3f) == 0 && ((1L << (_la - 89)) & ((1L << (IN - 89)) | (1L << (OUT - 89)) | (1L << (FIELD - 89)) | (1L << (PROPERTY - 89)) | (1L << (GET - 89)) | (1L << (SET - 89)) | (1L << (RECEIVER - 89)) | (1L << (PARAM - 89)) | (1L << (SETPARAM - 89)) | (1L << (DELEGATE - 89)) | (1L << (PUBLIC - 89)) | (1L << (PRIVATE - 89)) | (1L << (PROTECTED - 89)) | (1L << (INTERNAL - 89)) | (1L << (ENUM - 89)) | (1L << (SEALED - 89)) | (1L << (ANNOTATION - 89)) | (1L << (DATA - 89)) | (1L << (INNER - 89)) | (1L << (TAILREC - 89)) | (1L << (OPERATOR - 89)) | (1L << (INLINE - 89)) | (1L << (INFIX - 89)) | (1L << (EXTERNAL - 89)) | (1L << (SUSPEND - 89)) | (1L << (OVERRIDE - 89)) | (1L << (ABSTRACT - 89)) | (1L << (FINAL - 89)) | (1L << (OPEN - 89)) | (1L << (CONST - 89)) | (1L << (LATEINIT - 89)) | (1L << (VARARG - 89)) | (1L << (NOINLINE - 89)) | (1L << (CROSSINLINE - 89)) | (1L << (REIFIED - 89)) | (1L << (LabelReference - 89)))) != 0)) {
				{
				setState(907);
				modifierList();
				}
			}

			setState(910);
			match(OBJECT);
			setState(918);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,113,_ctx) ) {
			case 1:
				{
				setState(914);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(911);
					match(NL);
					}
					}
					setState(916);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(917);
				simpleIdentifier();
				}
				break;
			}
			setState(934);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,116,_ctx) ) {
			case 1:
				{
				setState(923);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(920);
					match(NL);
					}
					}
					setState(925);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(926);
				match(COLON);
				setState(930);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(927);
					match(NL);
					}
					}
					setState(932);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(933);
				delegationSpecifiers();
				}
				break;
			}
			setState(943);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,118,_ctx) ) {
			case 1:
				{
				setState(939);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(936);
					match(NL);
					}
					}
					setState(941);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(942);
				classBody();
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

	public static class PropertyDeclarationContext extends ParserRuleContext {
		public TerminalNode VAL() { return getToken(KotlinParser.VAL, 0); }
		public TerminalNode VAR() { return getToken(KotlinParser.VAR, 0); }
		public ModifierListContext modifierList() {
			return getRuleContext(ModifierListContext.class,0);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode DOT() { return getToken(KotlinParser.DOT, 0); }
		public TypeConstraintsContext typeConstraints() {
			return getRuleContext(TypeConstraintsContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SemiContext semi() {
			return getRuleContext(SemiContext.class,0);
		}
		public MultiVariableDeclarationContext multiVariableDeclaration() {
			return getRuleContext(MultiVariableDeclarationContext.class,0);
		}
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public TerminalNode BY() { return getToken(KotlinParser.BY, 0); }
		public TerminalNode ASSIGNMENT() { return getToken(KotlinParser.ASSIGNMENT, 0); }
		public List<TerminalNode> NL() { return getTokens(KotlinParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(KotlinParser.NL, i);
		}
		public GetterContext getter() {
			return getRuleContext(GetterContext.class,0);
		}
		public SetterContext setter() {
			return getRuleContext(SetterContext.class,0);
		}
		public PropertyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterPropertyDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitPropertyDeclaration(this);
		}
	}

	public final PropertyDeclarationContext propertyDeclaration() throws RecognitionException {
		PropertyDeclarationContext _localctx = new PropertyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_propertyDeclaration);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(946);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT || _la==FILE || ((((_la - 89)) & ~0x3f) == 0 && ((1L << (_la - 89)) & ((1L << (IN - 89)) | (1L << (OUT - 89)) | (1L << (FIELD - 89)) | (1L << (PROPERTY - 89)) | (1L << (GET - 89)) | (1L << (SET - 89)) | (1L << (RECEIVER - 89)) | (1L << (PARAM - 89)) | (1L << (SETPARAM - 89)) | (1L << (DELEGATE - 89)) | (1L << (PUBLIC - 89)) | (1L << (PRIVATE - 89)) | (1L << (PROTECTED - 89)) | (1L << (INTERNAL - 89)) | (1L << (ENUM - 89)) | (1L << (SEALED - 89)) | (1L << (ANNOTATION - 89)) | (1L << (DATA - 89)) | (1L << (INNER - 89)) | (1L << (TAILREC - 89)) | (1L << (OPERATOR - 89)) | (1L << (INLINE - 89)) | (1L << (INFIX - 89)) | (1L << (EXTERNAL - 89)) | (1L << (SUSPEND - 89)) | (1L << (OVERRIDE - 89)) | (1L << (ABSTRACT - 89)) | (1L << (FINAL - 89)) | (1L << (OPEN - 89)) | (1L << (CONST - 89)) | (1L << (LATEINIT - 89)) | (1L << (VARARG - 89)) | (1L << (NOINLINE - 89)) | (1L << (CROSSINLINE - 89)) | (1L << (REIFIED - 89)) | (1L << (LabelReference - 89)))) != 0)) {
				{
				setState(945);
				modifierList();
				}
			}

			setState(948);
			_la = _input.LA(1);
			if ( !(_la==VAL || _la==VAR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(956);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,121,_ctx) ) {
			case 1:
				{
				setState(952);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(949);
					match(NL);
					}
					}
					setState(954);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(955);
				typeParameters();
				}
				break;
			}
			setState(973);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,124,_ctx) ) {
			case 1:
				{
				setState(961);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(958);
					match(NL);
					}
					}
					setState(963);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(964);
				type();
				setState(968);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(965);
					match(NL);
					}
					}
					setState(970);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(971);
				match(DOT);
				}
				break;
			}
			{
			setState(978);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(975);
				match(NL);
				}
				}
				setState(980);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(983);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				{
				setState(981);
				multiVariableDeclaration();
				}
				break;
			case IMPORT:
			case CONSTRUCTOR:
			case BY:
			case COMPANION:
			case INIT:
			case WHERE:
			case CATCH:
			case FINALLY:
			case OUT:
			case GETTER:
			case SETTER:
			case DYNAMIC:
			case PUBLIC:
			case PRIVATE:
			case PROTECTED:
			case INTERNAL:
			case ENUM:
			case SEALED:
			case ANNOTATION:
			case DATA:
			case INNER:
			case TAILREC:
			case OPERATOR:
			case INLINE:
			case INFIX:
			case EXTERNAL:
			case SUSPEND:
			case OVERRIDE:
			case ABSTRACT:
			case FINAL:
			case OPEN:
			case CONST:
			case LATEINIT:
			case VARARG:
			case NOINLINE:
			case CROSSINLINE:
			case REIFIED:
			case Identifier:
				{
				setState(982);
				variableDeclaration();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
			setState(992);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,128,_ctx) ) {
			case 1:
				{
				setState(988);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(985);
					match(NL);
					}
					}
					setState(990);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(991);
				typeConstraints();
				}
				break;
			}
			setState(1008);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,131,_ctx) ) {
			case 1:
				{
				setState(997);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(994);
					match(NL);
					}
					}
					setState(999);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1000);
				_la = _input.LA(1);
				if ( !(_la==ASSIGNMENT || _la==BY) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1004);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,130,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1001);
						match(NL);
						}
						} 
					}
					setState(1006);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,130,_ctx);
				}
				setState(1007);
				expression();
				}
				break;
			}
			setState(1011);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,132,_ctx) ) {
			case 1:
				{
				setState(1010);
				semi();
				}
				break;
			}
			setState(1037);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,139,_ctx) ) {
			case 1:
				{
				setState(1014);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,133,_ctx) ) {
				case 1:
					{
					setState(1013);
					getter();
					}
					break;
				}
				setState(1023);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,135,_ctx) ) {
				case 1:
					{
					setState(1019);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(1016);
						match(NL);
						}
						}
						setState(1021);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1022);
					setter();
					}
					break;
				}
				}
				break;
			case 2:
				{
				setState(1026);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,136,_ctx) ) {
				case 1:
					{
					setState(1025);
					setter();
					}
					break;
				}
				setState(1035);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,138,_ctx) ) {
				case 1:
					{
					setState(1031);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(1028);
						match(NL);
						}
						}
						setState(1033);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1034);
					getter();
					}
					break;
				}
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

	public static class MultiVariableDeclarationContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(KotlinParser.LPAREN, 0); }
		public List<VariableDeclarationContext> variableDeclaration() {
			return getRuleContexts(VariableDeclarationContext.class);
		}
		public VariableDeclarationContext variableDeclaration(int i) {
			return getRuleContext(VariableDeclarationContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(KotlinParser.RPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(KotlinParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(KotlinParser.COMMA, i);
		}
		public MultiVariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiVariableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterMultiVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitMultiVariableDeclaration(this);
		}
	}

	public final MultiVariableDeclarationContext multiVariableDeclaration() throws RecognitionException {
		MultiVariableDeclarationContext _localctx = new MultiVariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_multiVariableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1039);
			match(LPAREN);
			setState(1040);
			variableDeclaration();
			setState(1045);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1041);
				match(COMMA);
				setState(1042);
				variableDeclaration();
				}
				}
				setState(1047);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1048);
			match(RPAREN);
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

	public static class VariableDeclarationContext extends ParserRuleContext {
		public SimpleIdentifierContext simpleIdentifier() {
			return getRuleContext(SimpleIdentifierContext.class,0);
		}
		public TerminalNode COLON() { return getToken(KotlinParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitVariableDeclaration(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_variableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1050);
			simpleIdentifier();
			setState(1053);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(1051);
				match(COLON);
				setState(1052);
				type();
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

	public static class GetterContext extends ParserRuleContext {
		public TerminalNode GETTER() { return getToken(KotlinParser.GETTER, 0); }
		public ModifierListContext modifierList() {
			return getRuleContext(ModifierListContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(KotlinParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(KotlinParser.RPAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode ASSIGNMENT() { return getToken(KotlinParser.ASSIGNMENT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(KotlinParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(KotlinParser.NL, i);
		}
		public TerminalNode COLON() { return getToken(KotlinParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public GetterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_getter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterGetter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitGetter(this);
		}
	}

	public final GetterContext getter() throws RecognitionException {
		GetterContext _localctx = new GetterContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_getter);
		int _la;
		try {
			int _alt;
			setState(1104);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,151,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1056);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AT || _la==FILE || ((((_la - 89)) & ~0x3f) == 0 && ((1L << (_la - 89)) & ((1L << (IN - 89)) | (1L << (OUT - 89)) | (1L << (FIELD - 89)) | (1L << (PROPERTY - 89)) | (1L << (GET - 89)) | (1L << (SET - 89)) | (1L << (RECEIVER - 89)) | (1L << (PARAM - 89)) | (1L << (SETPARAM - 89)) | (1L << (DELEGATE - 89)) | (1L << (PUBLIC - 89)) | (1L << (PRIVATE - 89)) | (1L << (PROTECTED - 89)) | (1L << (INTERNAL - 89)) | (1L << (ENUM - 89)) | (1L << (SEALED - 89)) | (1L << (ANNOTATION - 89)) | (1L << (DATA - 89)) | (1L << (INNER - 89)) | (1L << (TAILREC - 89)) | (1L << (OPERATOR - 89)) | (1L << (INLINE - 89)) | (1L << (INFIX - 89)) | (1L << (EXTERNAL - 89)) | (1L << (SUSPEND - 89)) | (1L << (OVERRIDE - 89)) | (1L << (ABSTRACT - 89)) | (1L << (FINAL - 89)) | (1L << (OPEN - 89)) | (1L << (CONST - 89)) | (1L << (LATEINIT - 89)) | (1L << (VARARG - 89)) | (1L << (NOINLINE - 89)) | (1L << (CROSSINLINE - 89)) | (1L << (REIFIED - 89)) | (1L << (LabelReference - 89)))) != 0)) {
					{
					setState(1055);
					modifierList();
					}
				}

				setState(1058);
				match(GETTER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1060);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AT || _la==FILE || ((((_la - 89)) & ~0x3f) == 0 && ((1L << (_la - 89)) & ((1L << (IN - 89)) | (1L << (OUT - 89)) | (1L << (FIELD - 89)) | (1L << (PROPERTY - 89)) | (1L << (GET - 89)) | (1L << (SET - 89)) | (1L << (RECEIVER - 89)) | (1L << (PARAM - 89)) | (1L << (SETPARAM - 89)) | (1L << (DELEGATE - 89)) | (1L << (PUBLIC - 89)) | (1L << (PRIVATE - 89)) | (1L << (PROTECTED - 89)) | (1L << (INTERNAL - 89)) | (1L << (ENUM - 89)) | (1L << (SEALED - 89)) | (1L << (ANNOTATION - 89)) | (1L << (DATA - 89)) | (1L << (INNER - 89)) | (1L << (TAILREC - 89)) | (1L << (OPERATOR - 89)) | (1L << (INLINE - 89)) | (1L << (INFIX - 89)) | (1L << (EXTERNAL - 89)) | (1L << (SUSPEND - 89)) | (1L << (OVERRIDE - 89)) | (1L << (ABSTRACT - 89)) | (1L << (FINAL - 89)) | (1L << (OPEN - 89)) | (1L << (CONST - 89)) | (1L << (LATEINIT - 89)) | (1L << (VARARG - 89)) | (1L << (NOINLINE - 89)) | (1L << (CROSSINLINE - 89)) | (1L << (REIFIED - 89)) | (1L << (LabelReference - 89)))) != 0)) {
					{
					setState(1059);
					modifierList();
					}
				}

				setState(1062);
				match(GETTER);
				setState(1066);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1063);
					match(NL);
					}
					}
					setState(1068);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1069);
				match(LPAREN);
				setState(1070);
				match(RPAREN);
				setState(1085);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,147,_ctx) ) {
				case 1:
					{
					setState(1074);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(1071);
						match(NL);
						}
						}
						setState(1076);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1077);
					match(COLON);
					setState(1081);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(1078);
						match(NL);
						}
						}
						setState(1083);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1084);
					type();
					}
					break;
				}
				setState(1090);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1087);
					match(NL);
					}
					}
					setState(1092);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1102);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LCURL:
					{
					setState(1093);
					block();
					}
					break;
				case ASSIGNMENT:
					{
					setState(1094);
					match(ASSIGNMENT);
					setState(1098);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,149,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(1095);
							match(NL);
							}
							} 
						}
						setState(1100);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,149,_ctx);
					}
					setState(1101);
					expression();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
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

	public static class SetterContext extends ParserRuleContext {
		public TerminalNode SETTER() { return getToken(KotlinParser.SETTER, 0); }
		public ModifierListContext modifierList() {
			return getRuleContext(ModifierListContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(KotlinParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(KotlinParser.RPAREN, 0); }
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public SimpleIdentifierContext simpleIdentifier() {
			return getRuleContext(SimpleIdentifierContext.class,0);
		}
		public ParameterContext parameter() {
			return getRuleContext(ParameterContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(KotlinParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(KotlinParser.NL, i);
		}
		public List<AnnotationsContext> annotations() {
			return getRuleContexts(AnnotationsContext.class);
		}
		public AnnotationsContext annotations(int i) {
			return getRuleContext(AnnotationsContext.class,i);
		}
		public List<ParameterModifierContext> parameterModifier() {
			return getRuleContexts(ParameterModifierContext.class);
		}
		public ParameterModifierContext parameterModifier(int i) {
			return getRuleContext(ParameterModifierContext.class,i);
		}
		public SetterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterSetter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitSetter(this);
		}
	}

	public final SetterContext setter() throws RecognitionException {
		SetterContext _localctx = new SetterContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_setter);
		int _la;
		try {
			int _alt;
			setState(1141);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,159,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1107);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AT || _la==FILE || ((((_la - 89)) & ~0x3f) == 0 && ((1L << (_la - 89)) & ((1L << (IN - 89)) | (1L << (OUT - 89)) | (1L << (FIELD - 89)) | (1L << (PROPERTY - 89)) | (1L << (GET - 89)) | (1L << (SET - 89)) | (1L << (RECEIVER - 89)) | (1L << (PARAM - 89)) | (1L << (SETPARAM - 89)) | (1L << (DELEGATE - 89)) | (1L << (PUBLIC - 89)) | (1L << (PRIVATE - 89)) | (1L << (PROTECTED - 89)) | (1L << (INTERNAL - 89)) | (1L << (ENUM - 89)) | (1L << (SEALED - 89)) | (1L << (ANNOTATION - 89)) | (1L << (DATA - 89)) | (1L << (INNER - 89)) | (1L << (TAILREC - 89)) | (1L << (OPERATOR - 89)) | (1L << (INLINE - 89)) | (1L << (INFIX - 89)) | (1L << (EXTERNAL - 89)) | (1L << (SUSPEND - 89)) | (1L << (OVERRIDE - 89)) | (1L << (ABSTRACT - 89)) | (1L << (FINAL - 89)) | (1L << (OPEN - 89)) | (1L << (CONST - 89)) | (1L << (LATEINIT - 89)) | (1L << (VARARG - 89)) | (1L << (NOINLINE - 89)) | (1L << (CROSSINLINE - 89)) | (1L << (REIFIED - 89)) | (1L << (LabelReference - 89)))) != 0)) {
					{
					setState(1106);
					modifierList();
					}
				}

				setState(1109);
				match(SETTER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1111);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AT || _la==FILE || ((((_la - 89)) & ~0x3f) == 0 && ((1L << (_la - 89)) & ((1L << (IN - 89)) | (1L << (OUT - 89)) | (1L << (FIELD - 89)) | (1L << (PROPERTY - 89)) | (1L << (GET - 89)) | (1L << (SET - 89)) | (1L << (RECEIVER - 89)) | (1L << (PARAM - 89)) | (1L << (SETPARAM - 89)) | (1L << (DELEGATE - 89)) | (1L << (PUBLIC - 89)) | (1L << (PRIVATE - 89)) | (1L << (PROTECTED - 89)) | (1L << (INTERNAL - 89)) | (1L << (ENUM - 89)) | (1L << (SEALED - 89)) | (1L << (ANNOTATION - 89)) | (1L << (DATA - 89)) | (1L << (INNER - 89)) | (1L << (TAILREC - 89)) | (1L << (OPERATOR - 89)) | (1L << (INLINE - 89)) | (1L << (INFIX - 89)) | (1L << (EXTERNAL - 89)) | (1L << (SUSPEND - 89)) | (1L << (OVERRIDE - 89)) | (1L << (ABSTRACT - 89)) | (1L << (FINAL - 89)) | (1L << (OPEN - 89)) | (1L << (CONST - 89)) | (1L << (LATEINIT - 89)) | (1L << (VARARG - 89)) | (1L << (NOINLINE - 89)) | (1L << (CROSSINLINE - 89)) | (1L << (REIFIED - 89)) | (1L << (LabelReference - 89)))) != 0)) {
					{
					setState(1110);
					modifierList();
					}
				}

				setState(1113);
				match(SETTER);
				setState(1117);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1114);
					match(NL);
					}
					}
					setState(1119);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1120);
				match(LPAREN);
				setState(1125);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,156,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						setState(1123);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case AT:
						case FILE:
						case FIELD:
						case PROPERTY:
						case GET:
						case SET:
						case RECEIVER:
						case PARAM:
						case SETPARAM:
						case DELEGATE:
						case LabelReference:
							{
							setState(1121);
							annotations();
							}
							break;
						case VARARG:
						case NOINLINE:
						case CROSSINLINE:
							{
							setState(1122);
							parameterModifier();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						} 
					}
					setState(1127);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,156,_ctx);
				}
				setState(1130);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,157,_ctx) ) {
				case 1:
					{
					setState(1128);
					simpleIdentifier();
					}
					break;
				case 2:
					{
					setState(1129);
					parameter();
					}
					break;
				}
				setState(1132);
				match(RPAREN);
				setState(1136);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1133);
					match(NL);
					}
					}
					setState(1138);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1139);
				functionBody();
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

	public static class TypeAliasContext extends ParserRuleContext {
		public TerminalNode TYPE_ALIAS() { return getToken(KotlinParser.TYPE_ALIAS, 0); }
		public SimpleIdentifierContext simpleIdentifier() {
			return getRuleContext(SimpleIdentifierContext.class,0);
		}
		public TerminalNode ASSIGNMENT() { return getToken(KotlinParser.ASSIGNMENT, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ModifierListContext modifierList() {
			return getRuleContext(ModifierListContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(KotlinParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(KotlinParser.NL, i);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public TypeAliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeAlias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterTypeAlias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitTypeAlias(this);
		}
	}

	public final TypeAliasContext typeAlias() throws RecognitionException {
		TypeAliasContext _localctx = new TypeAliasContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_typeAlias);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1144);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT || _la==FILE || ((((_la - 89)) & ~0x3f) == 0 && ((1L << (_la - 89)) & ((1L << (IN - 89)) | (1L << (OUT - 89)) | (1L << (FIELD - 89)) | (1L << (PROPERTY - 89)) | (1L << (GET - 89)) | (1L << (SET - 89)) | (1L << (RECEIVER - 89)) | (1L << (PARAM - 89)) | (1L << (SETPARAM - 89)) | (1L << (DELEGATE - 89)) | (1L << (PUBLIC - 89)) | (1L << (PRIVATE - 89)) | (1L << (PROTECTED - 89)) | (1L << (INTERNAL - 89)) | (1L << (ENUM - 89)) | (1L << (SEALED - 89)) | (1L << (ANNOTATION - 89)) | (1L << (DATA - 89)) | (1L << (INNER - 89)) | (1L << (TAILREC - 89)) | (1L << (OPERATOR - 89)) | (1L << (INLINE - 89)) | (1L << (INFIX - 89)) | (1L << (EXTERNAL - 89)) | (1L << (SUSPEND - 89)) | (1L << (OVERRIDE - 89)) | (1L << (ABSTRACT - 89)) | (1L << (FINAL - 89)) | (1L << (OPEN - 89)) | (1L << (CONST - 89)) | (1L << (LATEINIT - 89)) | (1L << (VARARG - 89)) | (1L << (NOINLINE - 89)) | (1L << (CROSSINLINE - 89)) | (1L << (REIFIED - 89)) | (1L << (LabelReference - 89)))) != 0)) {
				{
				setState(1143);
				modifierList();
				}
			}

			setState(1146);
			match(TYPE_ALIAS);
			setState(1150);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(1147);
				match(NL);
				}
				}
				setState(1152);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1153);
			simpleIdentifier();
			setState(1161);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,163,_ctx) ) {
			case 1:
				{
				setState(1157);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1154);
					match(NL);
					}
					}
					setState(1159);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1160);
				typeParameters();
				}
				break;
			}
			setState(1166);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(1163);
				match(NL);
				}
				}
				setState(1168);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1169);
			match(ASSIGNMENT);
			setState(1173);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(1170);
				match(NL);
				}
				}
				setState(1175);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1176);
			type();
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

	public static class TypeParametersContext extends ParserRuleContext {
		public TerminalNode LANGLE() { return getToken(KotlinParser.LANGLE, 0); }
		public List<TypeParameterContext> typeParameter() {
			return getRuleContexts(TypeParameterContext.class);
		}
		public TypeParameterContext typeParameter(int i) {
			return getRuleContext(TypeParameterContext.class,i);
		}
		public TerminalNode RANGLE() { return getToken(KotlinParser.RANGLE, 0); }
		public List<TerminalNode> NL() { return getTokens(KotlinParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(KotlinParser.NL, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(KotlinParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(KotlinParser.COMMA, i);
		}
		public TypeParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterTypeParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitTypeParameters(this);
		}
	}

	public final TypeParametersContext typeParameters() throws RecognitionException {
		TypeParametersContext _localctx = new TypeParametersContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_typeParameters);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1178);
			match(LANGLE);
			setState(1182);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,166,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1179);
					match(NL);
					}
					} 
				}
				setState(1184);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,166,_ctx);
			}
			setState(1185);
			typeParameter();
			setState(1202);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,169,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1189);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(1186);
						match(NL);
						}
						}
						setState(1191);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1192);
					match(COMMA);
					setState(1196);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,168,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(1193);
							match(NL);
							}
							} 
						}
						setState(1198);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,168,_ctx);
					}
					setState(1199);
					typeParameter();
					}
					} 
				}
				setState(1204);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,169,_ctx);
			}
			setState(1208);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(1205);
				match(NL);
				}
				}
				setState(1210);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1211);
			match(RANGLE);
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

	public static class TypeParameterContext extends ParserRuleContext {
		public SimpleIdentifierContext simpleIdentifier() {
			return getRuleContext(SimpleIdentifierContext.class,0);
		}
		public ModifierListContext modifierList() {
			return getRuleContext(ModifierListContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(KotlinParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(KotlinParser.NL, i);
		}
		public TerminalNode COLON() { return getToken(KotlinParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TypeParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterTypeParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitTypeParameter(this);
		}
	}

	public final TypeParameterContext typeParameter() throws RecognitionException {
		TypeParameterContext _localctx = new TypeParameterContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_typeParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1214);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,171,_ctx) ) {
			case 1:
				{
				setState(1213);
				modifierList();
				}
				break;
			}
			setState(1219);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(1216);
				match(NL);
				}
				}
				setState(1221);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1222);
			simpleIdentifier();
			setState(1237);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,175,_ctx) ) {
			case 1:
				{
				setState(1226);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1223);
					match(NL);
					}
					}
					setState(1228);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1229);
				match(COLON);
				setState(1233);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1230);
					match(NL);
					}
					}
					setState(1235);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1236);
				type();
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

	public static class TypeContext extends ParserRuleContext {
		public ParenthesizedTypeContext parenthesizedType() {
			return getRuleContext(ParenthesizedTypeContext.class,0);
		}
		public NullableTypeContext nullableType() {
			return getRuleContext(NullableTypeContext.class,0);
		}
		public TypeReferenceContext typeReference() {
			return getRuleContext(TypeReferenceContext.class,0);
		}
		public FunctionTypeContext functionType() {
			return getRuleContext(FunctionTypeContext.class,0);
		}
		public TerminalNode ReservedKeywords() { return getToken(KotlinParser.ReservedKeywords, 0); }
		public TypeModifierListContext typeModifierList() {
			return getRuleContext(TypeModifierListContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1240);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,176,_ctx) ) {
			case 1:
				{
				setState(1239);
				typeModifierList();
				}
				break;
			}
			setState(1247);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,177,_ctx) ) {
			case 1:
				{
				setState(1242);
				parenthesizedType();
				}
				break;
			case 2:
				{
				setState(1243);
				nullableType();
				}
				break;
			case 3:
				{
				setState(1244);
				typeReference();
				}
				break;
			case 4:
				{
				setState(1245);
				functionType();
				}
				break;
			case 5:
				{
				setState(1246);
				match(ReservedKeywords);
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

	public static class TypeModifierListContext extends ParserRuleContext {
		public List<AnnotationsContext> annotations() {
			return getRuleContexts(AnnotationsContext.class);
		}
		public AnnotationsContext annotations(int i) {
			return getRuleContext(AnnotationsContext.class,i);
		}
		public List<TerminalNode> SUSPEND() { return getTokens(KotlinParser.SUSPEND); }
		public TerminalNode SUSPEND(int i) {
			return getToken(KotlinParser.SUSPEND, i);
		}
		public List<TerminalNode> NL() { return getTokens(KotlinParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(KotlinParser.NL, i);
		}
		public TypeModifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeModifierList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterTypeModifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitTypeModifierList(this);
		}
	}

	public final TypeModifierListContext typeModifierList() throws RecognitionException {
		TypeModifierListContext _localctx = new TypeModifierListContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_typeModifierList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1257); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(1257);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case AT:
					case FILE:
					case FIELD:
					case PROPERTY:
					case GET:
					case SET:
					case RECEIVER:
					case PARAM:
					case SETPARAM:
					case DELEGATE:
					case LabelReference:
						{
						setState(1249);
						annotations();
						}
						break;
					case SUSPEND:
						{
						setState(1250);
						match(SUSPEND);
						setState(1254);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==NL) {
							{
							{
							setState(1251);
							match(NL);
							}
							}
							setState(1256);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1259); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,180,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class ParenthesizedTypeContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(KotlinParser.LPAREN, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(KotlinParser.RPAREN, 0); }
		public ParenthesizedTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parenthesizedType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterParenthesizedType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitParenthesizedType(this);
		}
	}

	public final ParenthesizedTypeContext parenthesizedType() throws RecognitionException {
		ParenthesizedTypeContext _localctx = new ParenthesizedTypeContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_parenthesizedType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1261);
			match(LPAREN);
			setState(1262);
			type();
			setState(1263);
			match(RPAREN);
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

	public static class NullableTypeContext extends ParserRuleContext {
		public TypeReferenceContext typeReference() {
			return getRuleContext(TypeReferenceContext.class,0);
		}
		public ParenthesizedTypeContext parenthesizedType() {
			return getRuleContext(ParenthesizedTypeContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(KotlinParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(KotlinParser.NL, i);
		}
		public List<TerminalNode> QUEST() { return getTokens(KotlinParser.QUEST); }
		public TerminalNode QUEST(int i) {
			return getToken(KotlinParser.QUEST, i);
		}
		public NullableTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nullableType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterNullableType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitNullableType(this);
		}
	}

	public final NullableTypeContext nullableType() throws RecognitionException {
		NullableTypeContext _localctx = new NullableTypeContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_nullableType);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1267);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,181,_ctx) ) {
			case 1:
				{
				setState(1265);
				typeReference();
				}
				break;
			case 2:
				{
				setState(1266);
				parenthesizedType();
				}
				break;
			}
			setState(1272);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(1269);
				match(NL);
				}
				}
				setState(1274);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1276); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1275);
					match(QUEST);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1278); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,183,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class TypeReferenceContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(KotlinParser.LPAREN, 0); }
		public TypeReferenceContext typeReference() {
			return getRuleContext(TypeReferenceContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(KotlinParser.RPAREN, 0); }
		public UserTypeContext userType() {
			return getRuleContext(UserTypeContext.class,0);
		}
		public TerminalNode DYNAMIC() { return getToken(KotlinParser.DYNAMIC, 0); }
		public TypeReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeReference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterTypeReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitTypeReference(this);
		}
	}

	public final TypeReferenceContext typeReference() throws RecognitionException {
		TypeReferenceContext _localctx = new TypeReferenceContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_typeReference);
		try {
			setState(1286);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,184,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1280);
				match(LPAREN);
				setState(1281);
				typeReference();
				setState(1282);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1284);
				userType();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1285);
				match(DYNAMIC);
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

	public static class FunctionTypeContext extends ParserRuleContext {
		public FunctionTypeParametersContext functionTypeParameters() {
			return getRuleContext(FunctionTypeParametersContext.class,0);
		}
		public TerminalNode ARROW() { return getToken(KotlinParser.ARROW, 0); }
		public FunctionTypeReceiverContext functionTypeReceiver() {
			return getRuleContext(FunctionTypeReceiverContext.class,0);
		}
		public TerminalNode DOT() { return getToken(KotlinParser.DOT, 0); }
		public List<TerminalNode> NL() { return getTokens(KotlinParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(KotlinParser.NL, i);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public FunctionTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterFunctionType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitFunctionType(this);
		}
	}

	public final FunctionTypeContext functionType() throws RecognitionException {
		FunctionTypeContext _localctx = new FunctionTypeContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_functionType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1302);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,187,_ctx) ) {
			case 1:
				{
				setState(1288);
				functionTypeReceiver();
				setState(1292);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1289);
					match(NL);
					}
					}
					setState(1294);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1295);
				match(DOT);
				setState(1299);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1296);
					match(NL);
					}
					}
					setState(1301);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(1304);
			functionTypeParameters();
			setState(1308);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(1305);
				match(NL);
				}
				}
				setState(1310);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1311);
			match(ARROW);
			setState(1319);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,190,_ctx) ) {
			case 1:
				{
				setState(1315);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1312);
					match(NL);
					}
					}
					setState(1317);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1318);
				type();
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

	public static class FunctionTypeReceiverContext extends ParserRuleContext {
		public ParenthesizedTypeContext parenthesizedType() {
			return getRuleContext(ParenthesizedTypeContext.class,0);
		}
		public NullableTypeContext nullableType() {
			return getRuleContext(NullableTypeContext.class,0);
		}
		public TypeReferenceContext typeReference() {
			return getRuleContext(TypeReferenceContext.class,0);
		}
		public FunctionTypeReceiverContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionTypeReceiver; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterFunctionTypeReceiver(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitFunctionTypeReceiver(this);
		}
	}

	public final FunctionTypeReceiverContext functionTypeReceiver() throws RecognitionException {
		FunctionTypeReceiverContext _localctx = new FunctionTypeReceiverContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_functionTypeReceiver);
		try {
			setState(1324);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,191,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1321);
				parenthesizedType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1322);
				nullableType();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1323);
				typeReference();
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

	public static class UserTypeContext extends ParserRuleContext {
		public List<SimpleUserTypeContext> simpleUserType() {
			return getRuleContexts(SimpleUserTypeContext.class);
		}
		public SimpleUserTypeContext simpleUserType(int i) {
			return getRuleContext(SimpleUserTypeContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(KotlinParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(KotlinParser.DOT, i);
		}
		public List<TerminalNode> NL() { return getTokens(KotlinParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(KotlinParser.NL, i);
		}
		public UserTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_userType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterUserType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitUserType(this);
		}
	}

	public final UserTypeContext userType() throws RecognitionException {
		UserTypeContext _localctx = new UserTypeContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_userType);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1326);
			simpleUserType();
			setState(1343);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,194,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1330);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(1327);
						match(NL);
						}
						}
						setState(1332);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1333);
					match(DOT);
					setState(1337);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(1334);
						match(NL);
						}
						}
						setState(1339);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1340);
					simpleUserType();
					}
					} 
				}
				setState(1345);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,194,_ctx);
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

	public static class SimpleUserTypeContext extends ParserRuleContext {
		public SimpleIdentifierContext simpleIdentifier() {
			return getRuleContext(SimpleIdentifierContext.class,0);
		}
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(KotlinParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(KotlinParser.NL, i);
		}
		public SimpleUserTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleUserType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterSimpleUserType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitSimpleUserType(this);
		}
	}

	public final SimpleUserTypeContext simpleUserType() throws RecognitionException {
		SimpleUserTypeContext _localctx = new SimpleUserTypeContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_simpleUserType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1346);
			simpleIdentifier();
			setState(1354);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,196,_ctx) ) {
			case 1:
				{
				setState(1350);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1347);
					match(NL);
					}
					}
					setState(1352);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1353);
				typeArguments();
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

	public static class FunctionTypeParametersContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(KotlinParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(KotlinParser.RPAREN, 0); }
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(KotlinParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(KotlinParser.COMMA, i);
		}
		public FunctionTypeParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionTypeParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterFunctionTypeParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitFunctionTypeParameters(this);
		}
	}

	public final FunctionTypeParametersContext functionTypeParameters() throws RecognitionException {
		FunctionTypeParametersContext _localctx = new FunctionTypeParametersContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_functionTypeParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1356);
			match(LPAREN);
			setState(1359);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,197,_ctx) ) {
			case 1:
				{
				setState(1357);
				parameter();
				}
				break;
			case 2:
				{
				setState(1358);
				type();
				}
				break;
			}
			setState(1368);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1361);
				match(COMMA);
				setState(1364);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,198,_ctx) ) {
				case 1:
					{
					setState(1362);
					parameter();
					}
					break;
				case 2:
					{
					setState(1363);
					type();
					}
					break;
				}
				}
				}
				setState(1370);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1371);
			match(RPAREN);
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

	public static class TypeConstraintsContext extends ParserRuleContext {
		public TerminalNode WHERE() { return getToken(KotlinParser.WHERE, 0); }
		public List<TypeConstraintContext> typeConstraint() {
			return getRuleContexts(TypeConstraintContext.class);
		}
		public TypeConstraintContext typeConstraint(int i) {
			return getRuleContext(TypeConstraintContext.class,i);
		}
		public List<TerminalNode> NL() { return getTokens(KotlinParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(KotlinParser.NL, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(KotlinParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(KotlinParser.COMMA, i);
		}
		public TypeConstraintsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeConstraints; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterTypeConstraints(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitTypeConstraints(this);
		}
	}

	public final TypeConstraintsContext typeConstraints() throws RecognitionException {
		TypeConstraintsContext _localctx = new TypeConstraintsContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_typeConstraints);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1373);
			match(WHERE);
			setState(1377);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(1374);
				match(NL);
				}
				}
				setState(1379);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1380);
			typeConstraint();
			setState(1397);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,203,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1384);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(1381);
						match(NL);
						}
						}
						setState(1386);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1387);
					match(COMMA);
					setState(1391);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(1388);
						match(NL);
						}
						}
						setState(1393);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1394);
					typeConstraint();
					}
					} 
				}
				setState(1399);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,203,_ctx);
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

	public static class TypeConstraintContext extends ParserRuleContext {
		public SimpleIdentifierContext simpleIdentifier() {
			return getRuleContext(SimpleIdentifierContext.class,0);
		}
		public TerminalNode COLON() { return getToken(KotlinParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<AnnotationsContext> annotations() {
			return getRuleContexts(AnnotationsContext.class);
		}
		public AnnotationsContext annotations(int i) {
			return getRuleContext(AnnotationsContext.class,i);
		}
		public List<TerminalNode> NL() { return getTokens(KotlinParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(KotlinParser.NL, i);
		}
		public TypeConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeConstraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterTypeConstraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitTypeConstraint(this);
		}
	}

	public final TypeConstraintContext typeConstraint() throws RecognitionException {
		TypeConstraintContext _localctx = new TypeConstraintContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_typeConstraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1403);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT || _la==FILE || ((((_la - 93)) & ~0x3f) == 0 && ((1L << (_la - 93)) & ((1L << (FIELD - 93)) | (1L << (PROPERTY - 93)) | (1L << (GET - 93)) | (1L << (SET - 93)) | (1L << (RECEIVER - 93)) | (1L << (PARAM - 93)) | (1L << (SETPARAM - 93)) | (1L << (DELEGATE - 93)) | (1L << (LabelReference - 93)))) != 0)) {
				{
				{
				setState(1400);
				annotations();
				}
				}
				setState(1405);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1406);
			simpleIdentifier();
			setState(1410);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(1407);
				match(NL);
				}
				}
				setState(1412);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1413);
			match(COLON);
			setState(1417);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(1414);
				match(NL);
				}
				}
				setState(1419);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1420);
			type();
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
		public TerminalNode LCURL() { return getToken(KotlinParser.LCURL, 0); }
		public TerminalNode RCURL() { return getToken(KotlinParser.RCURL, 0); }
		public List<TerminalNode> NL() { return getTokens(KotlinParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(KotlinParser.NL, i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<SemiContext> semi() {
			return getRuleContexts(SemiContext.class);
		}
		public SemiContext semi(int i) {
			return getRuleContext(SemiContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_block);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1422);
			match(LCURL);
			setState(1426);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,207,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1423);
					match(NL);
					}
					} 
				}
				setState(1428);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,207,_ctx);
			}
			setState(1434);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,208,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1429);
					statement();
					setState(1430);
					semi();
					}
					} 
				}
				setState(1436);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,208,_ctx);
			}
			setState(1441);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,210,_ctx) ) {
			case 1:
				{
				setState(1437);
				statement();
				setState(1439);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,209,_ctx) ) {
				case 1:
					{
					setState(1438);
					semi();
					}
					break;
				}
				}
				break;
			}
			setState(1446);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(1443);
				match(NL);
				}
				}
				setState(1448);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1449);
			match(RCURL);
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

	public static class StatementsContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<SemiContext> semi() {
			return getRuleContexts(SemiContext.class);
		}
		public SemiContext semi(int i) {
			return getRuleContext(SemiContext.class,i);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitStatements(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_statements);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1463);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,214,_ctx) ) {
			case 1:
				{
				setState(1456);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,212,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1451);
						statement();
						setState(1452);
						semi();
						}
						} 
					}
					setState(1458);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,212,_ctx);
				}
				setState(1459);
				statement();
				setState(1461);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,213,_ctx) ) {
				case 1:
					{
					setState(1460);
					semi();
					}
					break;
				}
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

	public static class StatementContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_statement);
		try {
			setState(1468);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,215,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1465);
				declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1466);
				assignment();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1467);
				expression();
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

	public static class DeclarationContext extends ParserRuleContext {
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public PropertyDeclarationContext propertyDeclaration() {
			return getRuleContext(PropertyDeclarationContext.class,0);
		}
		public TypeAliasContext typeAlias() {
			return getRuleContext(TypeAliasContext.class,0);
		}
		public List<LabelDefinitionContext> labelDefinition() {
			return getRuleContexts(LabelDefinitionContext.class);
		}
		public LabelDefinitionContext labelDefinition(int i) {
			return getRuleContext(LabelDefinitionContext.class,i);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitDeclaration(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1473);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LabelDefinition) {
				{
				{
				setState(1470);
				labelDefinition();
				}
				}
				setState(1475);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1480);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,217,_ctx) ) {
			case 1:
				{
				setState(1476);
				classDeclaration();
				}
				break;
			case 2:
				{
				setState(1477);
				functionDeclaration();
				}
				break;
			case 3:
				{
				setState(1478);
				propertyDeclaration();
				}
				break;
			case 4:
				{
				setState(1479);
				typeAlias();
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

	public static class AssignmentContext extends ParserRuleContext {
		public AssignableExpressionContext assignableExpression() {
			return getRuleContext(AssignableExpressionContext.class,0);
		}
		public AssignmentOperatorContext assignmentOperator() {
			return getRuleContext(AssignmentOperatorContext.class,0);
		}
		public DisjunctionContext disjunction() {
			return getRuleContext(DisjunctionContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(KotlinParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(KotlinParser.NL, i);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitAssignment(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_assignment);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1482);
			assignableExpression();
			setState(1483);
			assignmentOperator();
			setState(1487);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,218,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1484);
					match(NL);
					}
					} 
				}
				setState(1489);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,218,_ctx);
			}
			setState(1490);
			disjunction();
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
		public DisjunctionContext disjunction() {
			return getRuleContext(DisjunctionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1492);
			disjunction();
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

	public static class DisjunctionContext extends ParserRuleContext {
		public List<ConjunctionContext> conjunction() {
			return getRuleContexts(ConjunctionContext.class);
		}
		public ConjunctionContext conjunction(int i) {
			return getRuleContext(ConjunctionContext.class,i);
		}
		public List<TerminalNode> DISJ() { return getTokens(KotlinParser.DISJ); }
		public TerminalNode DISJ(int i) {
			return getToken(KotlinParser.DISJ, i);
		}
		public List<TerminalNode> NL() { return getTokens(KotlinParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(KotlinParser.NL, i);
		}
		public DisjunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_disjunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterDisjunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitDisjunction(this);
		}
	}

	public final DisjunctionContext disjunction() throws RecognitionException {
		DisjunctionContext _localctx = new DisjunctionContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_disjunction);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1494);
			conjunction();
			setState(1511);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,221,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1498);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(1495);
						match(NL);
						}
						}
						setState(1500);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1501);
					match(DISJ);
					setState(1505);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,220,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(1502);
							match(NL);
							}
							} 
						}
						setState(1507);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,220,_ctx);
					}
					setState(1508);
					conjunction();
					}
					} 
				}
				setState(1513);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,221,_ctx);
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

	public static class ConjunctionContext extends ParserRuleContext {
		public List<EqualityContext> equality() {
			return getRuleContexts(EqualityContext.class);
		}
		public EqualityContext equality(int i) {
			return getRuleContext(EqualityContext.class,i);
		}
		public List<TerminalNode> CONJ() { return getTokens(KotlinParser.CONJ); }
		public TerminalNode CONJ(int i) {
			return getToken(KotlinParser.CONJ, i);
		}
		public List<TerminalNode> NL() { return getTokens(KotlinParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(KotlinParser.NL, i);
		}
		public ConjunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conjunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterConjunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitConjunction(this);
		}
	}

	public final ConjunctionContext conjunction() throws RecognitionException {
		ConjunctionContext _localctx = new ConjunctionContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_conjunction);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1514);
			equality();
			setState(1531);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,224,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1518);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(1515);
						match(NL);
						}
						}
						setState(1520);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1521);
					match(CONJ);
					setState(1525);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,223,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(1522);
							match(NL);
							}
							} 
						}
						setState(1527);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,223,_ctx);
					}
					setState(1528);
					equality();
					}
					} 
				}
				setState(1533);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,224,_ctx);
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

	public static class EqualityContext extends ParserRuleContext {
		public List<ComparisonContext> comparison() {
			return getRuleContexts(ComparisonContext.class);
		}
		public ComparisonContext comparison(int i) {
			return getRuleContext(ComparisonContext.class,i);
		}
		public List<EqualityOperatorContext> equalityOperator() {
			return getRuleContexts(EqualityOperatorContext.class);
		}
		public EqualityOperatorContext equalityOperator(int i) {
			return getRuleContext(EqualityOperatorContext.class,i);
		}
		public List<TerminalNode> NL() { return getTokens(KotlinParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(KotlinParser.NL, i);
		}
		public EqualityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equality; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterEquality(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitEquality(this);
		}
	}

	public final EqualityContext equality() throws RecognitionException {
		EqualityContext _localctx = new EqualityContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_equality);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1534);
			comparison();
			setState(1546);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,226,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1535);
					equalityOperator();
					setState(1539);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,225,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(1536);
							match(NL);
							}
							} 
						}
						setState(1541);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,225,_ctx);
					}
					setState(1542);
					comparison();
					}
					} 
				}
				setState(1548);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,226,_ctx);
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

	public static class ComparisonContext extends ParserRuleContext {
		public List<InfixOperationContext> infixOperation() {
			return getRuleContexts(InfixOperationContext.class);
		}
		public InfixOperationContext infixOperation(int i) {
			return getRuleContext(InfixOperationContext.class,i);
		}
		public ComparisonOperatorContext comparisonOperator() {
			return getRuleContext(ComparisonOperatorContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(KotlinParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(KotlinParser.NL, i);
		}
		public ComparisonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparison; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitComparison(this);
		}
	}

	public final ComparisonContext comparison() throws RecognitionException {
		ComparisonContext _localctx = new ComparisonContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_comparison);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1549);
			infixOperation();
			setState(1559);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,228,_ctx) ) {
			case 1:
				{
				setState(1550);
				comparisonOperator();
				setState(1554);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,227,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1551);
						match(NL);
						}
						} 
					}
					setState(1556);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,227,_ctx);
				}
				setState(1557);
				infixOperation();
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

	public static class InfixOperationContext extends ParserRuleContext {
		public List<ElvisExpressionContext> elvisExpression() {
			return getRuleContexts(ElvisExpressionContext.class);
		}
		public ElvisExpressionContext elvisExpression(int i) {
			return getRuleContext(ElvisExpressionContext.class,i);
		}
		public List<InOperatorContext> inOperator() {
			return getRuleContexts(InOperatorContext.class);
		}
		public InOperatorContext inOperator(int i) {
			return getRuleContext(InOperatorContext.class,i);
		}
		public List<TerminalNode> NL() { return getTokens(KotlinParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(KotlinParser.NL, i);
		}
		public IsOperatorContext isOperator() {
			return getRuleContext(IsOperatorContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public InfixOperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_infixOperation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterInfixOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitInfixOperation(this);
		}
	}

	public final InfixOperationContext infixOperation() throws RecognitionException {
		InfixOperationContext _localctx = new InfixOperationContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_infixOperation);
		int _la;
		try {
			int _alt;
			setState(1588);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,233,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1561);
				elvisExpression();
				setState(1573);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,230,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1562);
						inOperator();
						setState(1566);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,229,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(1563);
								match(NL);
								}
								} 
							}
							setState(1568);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,229,_ctx);
						}
						setState(1569);
						elvisExpression();
						}
						} 
					}
					setState(1575);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,230,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1576);
				elvisExpression();
				setState(1586);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,232,_ctx) ) {
				case 1:
					{
					setState(1577);
					isOperator();
					setState(1581);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(1578);
						match(NL);
						}
						}
						setState(1583);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1584);
					type();
					}
					break;
				}
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

	public static class ElvisExpressionContext extends ParserRuleContext {
		public List<InfixFunctionCallContext> infixFunctionCall() {
			return getRuleContexts(InfixFunctionCallContext.class);
		}
		public InfixFunctionCallContext infixFunctionCall(int i) {
			return getRuleContext(InfixFunctionCallContext.class,i);
		}
		public List<TerminalNode> ELVIS() { return getTokens(KotlinParser.ELVIS); }
		public TerminalNode ELVIS(int i) {
			return getToken(KotlinParser.ELVIS, i);
		}
		public List<TerminalNode> NL() { return getTokens(KotlinParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(KotlinParser.NL, i);
		}
		public ElvisExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elvisExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterElvisExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitElvisExpression(this);
		}
	}

	public final ElvisExpressionContext elvisExpression() throws RecognitionException {
		ElvisExpressionContext _localctx = new ElvisExpressionContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_elvisExpression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1590);
			infixFunctionCall();
			setState(1607);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,236,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1594);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(1591);
						match(NL);
						}
						}
						setState(1596);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1597);
					match(ELVIS);
					setState(1601);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,235,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(1598);
							match(NL);
							}
							} 
						}
						setState(1603);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,235,_ctx);
					}
					setState(1604);
					infixFunctionCall();
					}
					} 
				}
				setState(1609);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,236,_ctx);
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

	public static class InfixFunctionCallContext extends ParserRuleContext {
		public List<RangeExpressionContext> rangeExpression() {
			return getRuleContexts(RangeExpressionContext.class);
		}
		public RangeExpressionContext rangeExpression(int i) {
			return getRuleContext(RangeExpressionContext.class,i);
		}
		public List<SimpleIdentifierContext> simpleIdentifier() {
			return getRuleContexts(SimpleIdentifierContext.class);
		}
		public SimpleIdentifierContext simpleIdentifier(int i) {
			return getRuleContext(SimpleIdentifierContext.class,i);
		}
		public List<TerminalNode> NL() { return getTokens(KotlinParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(KotlinParser.NL, i);
		}
		public InfixFunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_infixFunctionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterInfixFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitInfixFunctionCall(this);
		}
	}

	public final InfixFunctionCallContext infixFunctionCall() throws RecognitionException {
		InfixFunctionCallContext _localctx = new InfixFunctionCallContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_infixFunctionCall);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1610);
			rangeExpression();
			setState(1622);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,238,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1611);
					simpleIdentifier();
					setState(1615);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,237,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(1612);
							match(NL);
							}
							} 
						}
						setState(1617);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,237,_ctx);
					}
					setState(1618);
					rangeExpression();
					}
					} 
				}
				setState(1624);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,238,_ctx);
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

	public static class RangeExpressionContext extends ParserRuleContext {
		public List<AdditiveExpressionContext> additiveExpression() {
			return getRuleContexts(AdditiveExpressionContext.class);
		}
		public AdditiveExpressionContext additiveExpression(int i) {
			return getRuleContext(AdditiveExpressionContext.class,i);
		}
		public List<TerminalNode> RANGE() { return getTokens(KotlinParser.RANGE); }
		public TerminalNode RANGE(int i) {
			return getToken(KotlinParser.RANGE, i);
		}
		public List<TerminalNode> NL() { return getTokens(KotlinParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(KotlinParser.NL, i);
		}
		public RangeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rangeExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterRangeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitRangeExpression(this);
		}
	}

	public final RangeExpressionContext rangeExpression() throws RecognitionException {
		RangeExpressionContext _localctx = new RangeExpressionContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_rangeExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1625);
			additiveExpression();
			setState(1636);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,240,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1626);
					match(RANGE);
					setState(1630);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,239,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(1627);
							match(NL);
							}
							} 
						}
						setState(1632);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,239,_ctx);
					}
					setState(1633);
					additiveExpression();
					}
					} 
				}
				setState(1638);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,240,_ctx);
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

	public static class AdditiveExpressionContext extends ParserRuleContext {
		public List<MultiplicativeExpressionContext> multiplicativeExpression() {
			return getRuleContexts(MultiplicativeExpressionContext.class);
		}
		public MultiplicativeExpressionContext multiplicativeExpression(int i) {
			return getRuleContext(MultiplicativeExpressionContext.class,i);
		}
		public List<AdditiveOperatorContext> additiveOperator() {
			return getRuleContexts(AdditiveOperatorContext.class);
		}
		public AdditiveOperatorContext additiveOperator(int i) {
			return getRuleContext(AdditiveOperatorContext.class,i);
		}
		public List<TerminalNode> NL() { return getTokens(KotlinParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(KotlinParser.NL, i);
		}
		public AdditiveExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterAdditiveExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitAdditiveExpression(this);
		}
	}

	public final AdditiveExpressionContext additiveExpression() throws RecognitionException {
		AdditiveExpressionContext _localctx = new AdditiveExpressionContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_additiveExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1639);
			multiplicativeExpression();
			setState(1651);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,242,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1640);
					additiveOperator();
					setState(1644);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,241,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(1641);
							match(NL);
							}
							} 
						}
						setState(1646);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,241,_ctx);
					}
					setState(1647);
					multiplicativeExpression();
					}
					} 
				}
				setState(1653);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,242,_ctx);
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

	public static class MultiplicativeExpressionContext extends ParserRuleContext {
		public List<AsExpressionContext> asExpression() {
			return getRuleContexts(AsExpressionContext.class);
		}
		public AsExpressionContext asExpression(int i) {
			return getRuleContext(AsExpressionContext.class,i);
		}
		public List<MultiplicativeOperatorContext> multiplicativeOperator() {
			return getRuleContexts(MultiplicativeOperatorContext.class);
		}
		public MultiplicativeOperatorContext multiplicativeOperator(int i) {
			return getRuleContext(MultiplicativeOperatorContext.class,i);
		}
		public List<TerminalNode> NL() { return getTokens(KotlinParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(KotlinParser.NL, i);
		}
		public MultiplicativeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterMultiplicativeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitMultiplicativeExpression(this);
		}
	}

	public final MultiplicativeExpressionContext multiplicativeExpression() throws RecognitionException {
		MultiplicativeExpressionContext _localctx = new MultiplicativeExpressionContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_multiplicativeExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1654);
			asExpression();
			setState(1666);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,244,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1655);
					multiplicativeOperator();
					setState(1659);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,243,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(1656);
							match(NL);
							}
							} 
						}
						setState(1661);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,243,_ctx);
					}
					setState(1662);
					asExpression();
					}
					} 
				}
				setState(1668);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,244,_ctx);
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

	public static class AsExpressionContext extends ParserRuleContext {
		public PrefixUnaryExpressionContext prefixUnaryExpression() {
			return getRuleContext(PrefixUnaryExpressionContext.class,0);
		}
		public AsExpressionTailContext asExpressionTail() {
			return getRuleContext(AsExpressionTailContext.class,0);
		}
		public AsExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterAsExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitAsExpression(this);
		}
	}

	public final AsExpressionContext asExpression() throws RecognitionException {
		AsExpressionContext _localctx = new AsExpressionContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_asExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1669);
			prefixUnaryExpression();
			setState(1671);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,245,_ctx) ) {
			case 1:
				{
				setState(1670);
				asExpressionTail();
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

	public static class AsExpressionTailContext extends ParserRuleContext {
		public AsOperatorContext asOperator() {
			return getRuleContext(AsOperatorContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(KotlinParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(KotlinParser.NL, i);
		}
		public AsExpressionTailContext asExpressionTail() {
			return getRuleContext(AsExpressionTailContext.class,0);
		}
		public AsExpressionTailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asExpressionTail; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterAsExpressionTail(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitAsExpressionTail(this);
		}
	}

	public final AsExpressionTailContext asExpressionTail() throws RecognitionException {
		AsExpressionTailContext _localctx = new AsExpressionTailContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_asExpressionTail);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1676);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(1673);
				match(NL);
				}
				}
				setState(1678);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1679);
			asOperator();
			setState(1683);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(1680);
				match(NL);
				}
				}
				setState(1685);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1686);
			type();
			setState(1688);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,248,_ctx) ) {
			case 1:
				{
				setState(1687);
				asExpressionTail();
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

	public static class PrefixUnaryExpressionContext extends ParserRuleContext {
		public PostfixUnaryExpressionContext postfixUnaryExpression() {
			return getRuleContext(PostfixUnaryExpressionContext.class,0);
		}
		public List<PrefixUnaryOperatorContext> prefixUnaryOperator() {
			return getRuleContexts(PrefixUnaryOperatorContext.class);
		}
		public PrefixUnaryOperatorContext prefixUnaryOperator(int i) {
			return getRuleContext(PrefixUnaryOperatorContext.class,i);
		}
		public List<AnnotationsContext> annotations() {
			return getRuleContexts(AnnotationsContext.class);
		}
		public AnnotationsContext annotations(int i) {
			return getRuleContext(AnnotationsContext.class,i);
		}
		public PrefixUnaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prefixUnaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterPrefixUnaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitPrefixUnaryExpression(this);
		}
	}

	public final PrefixUnaryExpressionContext prefixUnaryExpression() throws RecognitionException {
		PrefixUnaryExpressionContext _localctx = new PrefixUnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_prefixUnaryExpression);
		int _la;
		try {
			int _alt;
			setState(1704);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,251,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1693);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << SUB) | (1L << INCR) | (1L << DECR) | (1L << EXCL))) != 0)) {
					{
					{
					setState(1690);
					prefixUnaryOperator();
					}
					}
					setState(1695);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1696);
				postfixUnaryExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1700);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,250,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1697);
						annotations();
						}
						} 
					}
					setState(1702);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,250,_ctx);
				}
				setState(1703);
				postfixUnaryExpression();
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

	public static class PostfixUnaryExpressionContext extends ParserRuleContext {
		public AssignableExpressionContext assignableExpression() {
			return getRuleContext(AssignableExpressionContext.class,0);
		}
		public CallExpressionContext callExpression() {
			return getRuleContext(CallExpressionContext.class,0);
		}
		public LabeledExpressionContext labeledExpression() {
			return getRuleContext(LabeledExpressionContext.class,0);
		}
		public DotQualifiedExpressionContext dotQualifiedExpression() {
			return getRuleContext(DotQualifiedExpressionContext.class,0);
		}
		public List<PostfixUnaryOperatorContext> postfixUnaryOperator() {
			return getRuleContexts(PostfixUnaryOperatorContext.class);
		}
		public PostfixUnaryOperatorContext postfixUnaryOperator(int i) {
			return getRuleContext(PostfixUnaryOperatorContext.class,i);
		}
		public TerminalNode LPAREN() { return getToken(KotlinParser.LPAREN, 0); }
		public CallableReferenceContext callableReference() {
			return getRuleContext(CallableReferenceContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(KotlinParser.RPAREN, 0); }
		public PostfixUnaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfixUnaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterPostfixUnaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitPostfixUnaryExpression(this);
		}
	}

	public final PostfixUnaryExpressionContext postfixUnaryExpression() throws RecognitionException {
		PostfixUnaryExpressionContext _localctx = new PostfixUnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_postfixUnaryExpression);
		try {
			int _alt;
			setState(1726);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,254,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1706);
				assignableExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1707);
				callExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1708);
				labeledExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1709);
				dotQualifiedExpression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1710);
				assignableExpression();
				setState(1714);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,252,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1711);
						postfixUnaryOperator();
						}
						} 
					}
					setState(1716);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,252,_ctx);
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1717);
				match(LPAREN);
				setState(1718);
				callableReference();
				setState(1719);
				match(RPAREN);
				setState(1721); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1720);
						postfixUnaryOperator();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1723); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,253,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1725);
				callableReference();
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

	public static class CallExpressionContext extends ParserRuleContext {
		public AssignableExpressionNoNumberContext assignableExpressionNoNumber() {
			return getRuleContext(AssignableExpressionNoNumberContext.class,0);
		}
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public ValueArgumentsContext valueArguments() {
			return getRuleContext(ValueArgumentsContext.class,0);
		}
		public List<AnnotatedLambdaContext> annotatedLambda() {
			return getRuleContexts(AnnotatedLambdaContext.class);
		}
		public AnnotatedLambdaContext annotatedLambda(int i) {
			return getRuleContext(AnnotatedLambdaContext.class,i);
		}
		public CallExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterCallExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitCallExpression(this);
		}
	}

	public final CallExpressionContext callExpression() throws RecognitionException {
		CallExpressionContext _localctx = new CallExpressionContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_callExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1728);
			assignableExpressionNoNumber();
			setState(1730);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,255,_ctx) ) {
			case 1:
				{
				setState(1729);
				typeArguments();
				}
				break;
			}
			setState(1733);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,256,_ctx) ) {
			case 1:
				{
				setState(1732);
				valueArguments();
				}
				break;
			}
			setState(1738);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,257,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1735);
					annotatedLambda();
					}
					} 
				}
				setState(1740);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,257,_ctx);
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

	public static class LabeledExpressionContext extends ParserRuleContext {
		public LabelDefinitionContext labelDefinition() {
			return getRuleContext(LabelDefinitionContext.class,0);
		}
		public PostfixUnaryExpressionContext postfixUnaryExpression() {
			return getRuleContext(PostfixUnaryExpressionContext.class,0);
		}
		public LabeledExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labeledExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterLabeledExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitLabeledExpression(this);
		}
	}

	public final LabeledExpressionContext labeledExpression() throws RecognitionException {
		LabeledExpressionContext _localctx = new LabeledExpressionContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_labeledExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1741);
			labelDefinition();
			setState(1742);
			postfixUnaryExpression();
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

	public static class DotQualifiedExpressionContext extends ParserRuleContext {
		public AssignableExpressionContext assignableExpression() {
			return getRuleContext(AssignableExpressionContext.class,0);
		}
		public List<MemberAccessOperatorContext> memberAccessOperator() {
			return getRuleContexts(MemberAccessOperatorContext.class);
		}
		public MemberAccessOperatorContext memberAccessOperator(int i) {
			return getRuleContext(MemberAccessOperatorContext.class,i);
		}
		public List<PostfixUnaryExpressionContext> postfixUnaryExpression() {
			return getRuleContexts(PostfixUnaryExpressionContext.class);
		}
		public PostfixUnaryExpressionContext postfixUnaryExpression(int i) {
			return getRuleContext(PostfixUnaryExpressionContext.class,i);
		}
		public List<TerminalNode> NL() { return getTokens(KotlinParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(KotlinParser.NL, i);
		}
		public DotQualifiedExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dotQualifiedExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterDotQualifiedExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitDotQualifiedExpression(this);
		}
	}

	public final DotQualifiedExpressionContext dotQualifiedExpression() throws RecognitionException {
		DotQualifiedExpressionContext _localctx = new DotQualifiedExpressionContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_dotQualifiedExpression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1744);
			assignableExpression();
			setState(1754); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1748);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(1745);
						match(NL);
						}
						}
						setState(1750);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1751);
					memberAccessOperator();
					setState(1752);
					postfixUnaryExpression();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1756); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,259,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class AssignableExpressionNoNumberContext extends ParserRuleContext {
		public PrimaryExpressionNoNumberContext primaryExpressionNoNumber() {
			return getRuleContext(PrimaryExpressionNoNumberContext.class,0);
		}
		public IndexingExpressionContext indexingExpression() {
			return getRuleContext(IndexingExpressionContext.class,0);
		}
		public AssignableExpressionNoNumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignableExpressionNoNumber; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterAssignableExpressionNoNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitAssignableExpressionNoNumber(this);
		}
	}

	public final AssignableExpressionNoNumberContext assignableExpressionNoNumber() throws RecognitionException {
		AssignableExpressionNoNumberContext _localctx = new AssignableExpressionNoNumberContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_assignableExpressionNoNumber);
		try {
			setState(1760);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,260,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1758);
				primaryExpressionNoNumber();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1759);
				indexingExpression();
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

	public static class AssignableExpressionContext extends ParserRuleContext {
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public IndexingExpressionContext indexingExpression() {
			return getRuleContext(IndexingExpressionContext.class,0);
		}
		public AssignableExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignableExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterAssignableExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitAssignableExpression(this);
		}
	}

	public final AssignableExpressionContext assignableExpression() throws RecognitionException {
		AssignableExpressionContext _localctx = new AssignableExpressionContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_assignableExpression);
		try {
			setState(1764);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,261,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1762);
				primaryExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1763);
				indexingExpression();
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

	public static class IndexingExpressionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<ArrayAccessContext> arrayAccess() {
			return getRuleContexts(ArrayAccessContext.class);
		}
		public ArrayAccessContext arrayAccess(int i) {
			return getRuleContext(ArrayAccessContext.class,i);
		}
		public IndexingExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexingExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterIndexingExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitIndexingExpression(this);
		}
	}

	public final IndexingExpressionContext indexingExpression() throws RecognitionException {
		IndexingExpressionContext _localctx = new IndexingExpressionContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_indexingExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1766);
			identifier();
			setState(1768); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1767);
					arrayAccess();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1770); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,262,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class CallSuffixContext extends ParserRuleContext {
		public ValueArgumentsContext valueArguments() {
			return getRuleContext(ValueArgumentsContext.class,0);
		}
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public List<AnnotatedLambdaContext> annotatedLambda() {
			return getRuleContexts(AnnotatedLambdaContext.class);
		}
		public AnnotatedLambdaContext annotatedLambda(int i) {
			return getRuleContext(AnnotatedLambdaContext.class,i);
		}
		public CallSuffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callSuffix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterCallSuffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitCallSuffix(this);
		}
	}

	public final CallSuffixContext callSuffix() throws RecognitionException {
		CallSuffixContext _localctx = new CallSuffixContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_callSuffix);
		int _la;
		try {
			int _alt;
			setState(1789);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,266,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1773);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LANGLE) {
					{
					setState(1772);
					typeArguments();
					}
				}

				setState(1775);
				valueArguments();
				setState(1779);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,264,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1776);
						annotatedLambda();
						}
						} 
					}
					setState(1781);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,264,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1782);
				typeArguments();
				setState(1786);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,265,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1783);
						annotatedLambda();
						}
						} 
					}
					setState(1788);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,265,_ctx);
				}
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

	public static class AnnotatedLambdaContext extends ParserRuleContext {
		public FunctionLiteralContext functionLiteral() {
			return getRuleContext(FunctionLiteralContext.class,0);
		}
		public List<UnescapedAnnotationContext> unescapedAnnotation() {
			return getRuleContexts(UnescapedAnnotationContext.class);
		}
		public UnescapedAnnotationContext unescapedAnnotation(int i) {
			return getRuleContext(UnescapedAnnotationContext.class,i);
		}
		public TerminalNode LabelDefinition() { return getToken(KotlinParser.LabelDefinition, 0); }
		public List<TerminalNode> NL() { return getTokens(KotlinParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(KotlinParser.NL, i);
		}
		public AnnotatedLambdaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotatedLambda; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterAnnotatedLambda(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitAnnotatedLambda(this);
		}
	}

	public final AnnotatedLambdaContext annotatedLambda() throws RecognitionException {
		AnnotatedLambdaContext _localctx = new AnnotatedLambdaContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_annotatedLambda);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1794);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 58)) & ~0x3f) == 0 && ((1L << (_la - 58)) & ((1L << (IMPORT - 58)) | (1L << (CONSTRUCTOR - 58)) | (1L << (BY - 58)) | (1L << (COMPANION - 58)) | (1L << (INIT - 58)) | (1L << (WHERE - 58)) | (1L << (CATCH - 58)) | (1L << (FINALLY - 58)) | (1L << (OUT - 58)) | (1L << (GETTER - 58)) | (1L << (SETTER - 58)) | (1L << (DYNAMIC - 58)) | (1L << (PUBLIC - 58)) | (1L << (PRIVATE - 58)) | (1L << (PROTECTED - 58)) | (1L << (INTERNAL - 58)) | (1L << (ENUM - 58)) | (1L << (SEALED - 58)) | (1L << (ANNOTATION - 58)) | (1L << (DATA - 58)) | (1L << (INNER - 58)) | (1L << (TAILREC - 58)) | (1L << (OPERATOR - 58)) | (1L << (INLINE - 58)) | (1L << (INFIX - 58)) | (1L << (EXTERNAL - 58)) | (1L << (SUSPEND - 58)) | (1L << (OVERRIDE - 58)) | (1L << (ABSTRACT - 58)) | (1L << (FINAL - 58)))) != 0) || ((((_la - 122)) & ~0x3f) == 0 && ((1L << (_la - 122)) & ((1L << (OPEN - 122)) | (1L << (CONST - 122)) | (1L << (LATEINIT - 122)) | (1L << (VARARG - 122)) | (1L << (NOINLINE - 122)) | (1L << (CROSSINLINE - 122)) | (1L << (REIFIED - 122)) | (1L << (Identifier - 122)))) != 0)) {
				{
				{
				setState(1791);
				unescapedAnnotation();
				}
				}
				setState(1796);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1798);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LabelDefinition) {
				{
				setState(1797);
				match(LabelDefinition);
				}
			}

			setState(1803);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(1800);
				match(NL);
				}
				}
				setState(1805);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1806);
			functionLiteral();
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

	public static class ArrayAccessContext extends ParserRuleContext {
		public TerminalNode LSQUARE() { return getToken(KotlinParser.LSQUARE, 0); }
		public TerminalNode RSQUARE() { return getToken(KotlinParser.RSQUARE, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(KotlinParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(KotlinParser.COMMA, i);
		}
		public ArrayAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayAccess; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterArrayAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitArrayAccess(this);
		}
	}

	public final ArrayAccessContext arrayAccess() throws RecognitionException {
		ArrayAccessContext _localctx = new ArrayAccessContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_arrayAccess);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1808);
			match(LSQUARE);
			setState(1817);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NL) | (1L << LPAREN) | (1L << LSQUARE) | (1L << LCURL) | (1L << ADD) | (1L << SUB) | (1L << INCR) | (1L << DECR) | (1L << EXCL) | (1L << COLONCOLON) | (1L << Q_COLONCOLON) | (1L << AT) | (1L << RETURN_AT) | (1L << CONTINUE_AT) | (1L << BREAK_AT) | (1L << FILE) | (1L << IMPORT) | (1L << OBJECT))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (CONSTRUCTOR - 66)) | (1L << (BY - 66)) | (1L << (COMPANION - 66)) | (1L << (INIT - 66)) | (1L << (THIS - 66)) | (1L << (SUPER - 66)) | (1L << (WHERE - 66)) | (1L << (IF - 66)) | (1L << (WHEN - 66)) | (1L << (TRY - 66)) | (1L << (CATCH - 66)) | (1L << (FINALLY - 66)) | (1L << (FOR - 66)) | (1L << (DO - 66)) | (1L << (WHILE - 66)) | (1L << (THROW - 66)) | (1L << (RETURN - 66)) | (1L << (CONTINUE - 66)) | (1L << (BREAK - 66)) | (1L << (OUT - 66)) | (1L << (FIELD - 66)) | (1L << (PROPERTY - 66)) | (1L << (GET - 66)) | (1L << (SET - 66)) | (1L << (GETTER - 66)) | (1L << (SETTER - 66)) | (1L << (RECEIVER - 66)) | (1L << (PARAM - 66)) | (1L << (SETPARAM - 66)) | (1L << (DELEGATE - 66)) | (1L << (DYNAMIC - 66)) | (1L << (PUBLIC - 66)) | (1L << (PRIVATE - 66)) | (1L << (PROTECTED - 66)) | (1L << (INTERNAL - 66)) | (1L << (ENUM - 66)) | (1L << (SEALED - 66)) | (1L << (ANNOTATION - 66)) | (1L << (DATA - 66)) | (1L << (INNER - 66)) | (1L << (TAILREC - 66)) | (1L << (OPERATOR - 66)) | (1L << (INLINE - 66)) | (1L << (INFIX - 66)) | (1L << (EXTERNAL - 66)) | (1L << (SUSPEND - 66)) | (1L << (OVERRIDE - 66)) | (1L << (ABSTRACT - 66)) | (1L << (FINAL - 66)) | (1L << (OPEN - 66)) | (1L << (CONST - 66)) | (1L << (LATEINIT - 66)) | (1L << (VARARG - 66)) | (1L << (NOINLINE - 66)) | (1L << (CROSSINLINE - 66)) | (1L << (REIFIED - 66)) | (1L << (QUOTE_OPEN - 66)))) != 0) || ((((_la - 130)) & ~0x3f) == 0 && ((1L << (_la - 130)) & ((1L << (TRIPLE_QUOTE_OPEN - 130)) | (1L << (RealLiteral - 130)) | (1L << (LongLiteral - 130)) | (1L << (IntegerLiteral - 130)) | (1L << (HexLiteral - 130)) | (1L << (BinLiteral - 130)) | (1L << (BooleanLiteral - 130)) | (1L << (NullLiteral - 130)) | (1L << (Identifier - 130)) | (1L << (LabelReference - 130)) | (1L << (LabelDefinition - 130)) | (1L << (CharacterLiteral - 130)))) != 0)) {
				{
				setState(1809);
				expression();
				setState(1814);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1810);
					match(COMMA);
					setState(1811);
					expression();
					}
					}
					setState(1816);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1819);
			match(RSQUARE);
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

	public static class ValueArgumentsContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(KotlinParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(KotlinParser.RPAREN, 0); }
		public List<ValueArgumentContext> valueArgument() {
			return getRuleContexts(ValueArgumentContext.class);
		}
		public ValueArgumentContext valueArgument(int i) {
			return getRuleContext(ValueArgumentContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(KotlinParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(KotlinParser.COMMA, i);
		}
		public ValueArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valueArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterValueArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitValueArguments(this);
		}
	}

	public final ValueArgumentsContext valueArguments() throws RecognitionException {
		ValueArgumentsContext _localctx = new ValueArgumentsContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_valueArguments);
		int _la;
		try {
			setState(1837);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,274,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1821);
				match(LPAREN);
				setState(1823);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NL) | (1L << LPAREN) | (1L << LSQUARE) | (1L << LCURL) | (1L << MULT) | (1L << ADD) | (1L << SUB) | (1L << INCR) | (1L << DECR) | (1L << EXCL) | (1L << COLONCOLON) | (1L << Q_COLONCOLON) | (1L << AT) | (1L << RETURN_AT) | (1L << CONTINUE_AT) | (1L << BREAK_AT) | (1L << FILE) | (1L << IMPORT) | (1L << OBJECT))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (CONSTRUCTOR - 66)) | (1L << (BY - 66)) | (1L << (COMPANION - 66)) | (1L << (INIT - 66)) | (1L << (THIS - 66)) | (1L << (SUPER - 66)) | (1L << (WHERE - 66)) | (1L << (IF - 66)) | (1L << (WHEN - 66)) | (1L << (TRY - 66)) | (1L << (CATCH - 66)) | (1L << (FINALLY - 66)) | (1L << (FOR - 66)) | (1L << (DO - 66)) | (1L << (WHILE - 66)) | (1L << (THROW - 66)) | (1L << (RETURN - 66)) | (1L << (CONTINUE - 66)) | (1L << (BREAK - 66)) | (1L << (OUT - 66)) | (1L << (FIELD - 66)) | (1L << (PROPERTY - 66)) | (1L << (GET - 66)) | (1L << (SET - 66)) | (1L << (GETTER - 66)) | (1L << (SETTER - 66)) | (1L << (RECEIVER - 66)) | (1L << (PARAM - 66)) | (1L << (SETPARAM - 66)) | (1L << (DELEGATE - 66)) | (1L << (DYNAMIC - 66)) | (1L << (PUBLIC - 66)) | (1L << (PRIVATE - 66)) | (1L << (PROTECTED - 66)) | (1L << (INTERNAL - 66)) | (1L << (ENUM - 66)) | (1L << (SEALED - 66)) | (1L << (ANNOTATION - 66)) | (1L << (DATA - 66)) | (1L << (INNER - 66)) | (1L << (TAILREC - 66)) | (1L << (OPERATOR - 66)) | (1L << (INLINE - 66)) | (1L << (INFIX - 66)) | (1L << (EXTERNAL - 66)) | (1L << (SUSPEND - 66)) | (1L << (OVERRIDE - 66)) | (1L << (ABSTRACT - 66)) | (1L << (FINAL - 66)) | (1L << (OPEN - 66)) | (1L << (CONST - 66)) | (1L << (LATEINIT - 66)) | (1L << (VARARG - 66)) | (1L << (NOINLINE - 66)) | (1L << (CROSSINLINE - 66)) | (1L << (REIFIED - 66)) | (1L << (QUOTE_OPEN - 66)))) != 0) || ((((_la - 130)) & ~0x3f) == 0 && ((1L << (_la - 130)) & ((1L << (TRIPLE_QUOTE_OPEN - 130)) | (1L << (RealLiteral - 130)) | (1L << (LongLiteral - 130)) | (1L << (IntegerLiteral - 130)) | (1L << (HexLiteral - 130)) | (1L << (BinLiteral - 130)) | (1L << (BooleanLiteral - 130)) | (1L << (NullLiteral - 130)) | (1L << (Identifier - 130)) | (1L << (LabelReference - 130)) | (1L << (LabelDefinition - 130)) | (1L << (CharacterLiteral - 130)))) != 0)) {
					{
					setState(1822);
					valueArgument();
					}
				}

				setState(1825);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1826);
				match(LPAREN);
				setState(1827);
				valueArgument();
				setState(1832);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1828);
					match(COMMA);
					setState(1829);
					valueArgument();
					}
					}
					setState(1834);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1835);
				match(RPAREN);
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

	public static class TypeArgumentsContext extends ParserRuleContext {
		public TerminalNode LANGLE() { return getToken(KotlinParser.LANGLE, 0); }
		public List<TypeProjectionContext> typeProjection() {
			return getRuleContexts(TypeProjectionContext.class);
		}
		public TypeProjectionContext typeProjection(int i) {
			return getRuleContext(TypeProjectionContext.class,i);
		}
		public TerminalNode RANGLE() { return getToken(KotlinParser.RANGLE, 0); }
		public List<TerminalNode> NL() { return getTokens(KotlinParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(KotlinParser.NL, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(KotlinParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(KotlinParser.COMMA, i);
		}
		public TypeArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterTypeArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitTypeArguments(this);
		}
	}

	public final TypeArgumentsContext typeArguments() throws RecognitionException {
		TypeArgumentsContext _localctx = new TypeArgumentsContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_typeArguments);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1839);
			match(LANGLE);
			setState(1843);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(1840);
				match(NL);
				}
				}
				setState(1845);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1846);
			typeProjection();
			setState(1857);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,277,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1850);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(1847);
						match(NL);
						}
						}
						setState(1852);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1853);
					match(COMMA);
					setState(1854);
					typeProjection();
					}
					} 
				}
				setState(1859);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,277,_ctx);
			}
			setState(1863);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(1860);
				match(NL);
				}
				}
				setState(1865);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1866);
			match(RANGLE);
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

	public static class TypeProjectionContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TypeProjectionModifierListContext typeProjectionModifierList() {
			return getRuleContext(TypeProjectionModifierListContext.class,0);
		}
		public TerminalNode MULT() { return getToken(KotlinParser.MULT, 0); }
		public TypeProjectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeProjection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterTypeProjection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitTypeProjection(this);
		}
	}

	public final TypeProjectionContext typeProjection() throws RecognitionException {
		TypeProjectionContext _localctx = new TypeProjectionContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_typeProjection);
		try {
			setState(1873);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
			case AT:
			case FILE:
			case IMPORT:
			case CONSTRUCTOR:
			case BY:
			case COMPANION:
			case INIT:
			case WHERE:
			case CATCH:
			case FINALLY:
			case IN:
			case OUT:
			case FIELD:
			case PROPERTY:
			case GET:
			case SET:
			case GETTER:
			case SETTER:
			case RECEIVER:
			case PARAM:
			case SETPARAM:
			case DELEGATE:
			case DYNAMIC:
			case PUBLIC:
			case PRIVATE:
			case PROTECTED:
			case INTERNAL:
			case ENUM:
			case SEALED:
			case ANNOTATION:
			case DATA:
			case INNER:
			case TAILREC:
			case OPERATOR:
			case INLINE:
			case INFIX:
			case EXTERNAL:
			case SUSPEND:
			case OVERRIDE:
			case ABSTRACT:
			case FINAL:
			case OPEN:
			case CONST:
			case LATEINIT:
			case VARARG:
			case NOINLINE:
			case CROSSINLINE:
			case REIFIED:
			case ReservedKeywords:
			case Identifier:
			case LabelReference:
				enterOuterAlt(_localctx, 1);
				{
				setState(1869);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,279,_ctx) ) {
				case 1:
					{
					setState(1868);
					typeProjectionModifierList();
					}
					break;
				}
				setState(1871);
				type();
				}
				break;
			case MULT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1872);
				match(MULT);
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

	public static class TypeProjectionModifierListContext extends ParserRuleContext {
		public List<VarianceAnnotationContext> varianceAnnotation() {
			return getRuleContexts(VarianceAnnotationContext.class);
		}
		public VarianceAnnotationContext varianceAnnotation(int i) {
			return getRuleContext(VarianceAnnotationContext.class,i);
		}
		public TypeProjectionModifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeProjectionModifierList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterTypeProjectionModifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitTypeProjectionModifierList(this);
		}
	}

	public final TypeProjectionModifierListContext typeProjectionModifierList() throws RecognitionException {
		TypeProjectionModifierListContext _localctx = new TypeProjectionModifierListContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_typeProjectionModifierList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1876); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1875);
					varianceAnnotation();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1878); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,281,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class ValueArgumentContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SimpleIdentifierContext simpleIdentifier() {
			return getRuleContext(SimpleIdentifierContext.class,0);
		}
		public TerminalNode ASSIGNMENT() { return getToken(KotlinParser.ASSIGNMENT, 0); }
		public TerminalNode MULT() { return getToken(KotlinParser.MULT, 0); }
		public List<TerminalNode> NL() { return getTokens(KotlinParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(KotlinParser.NL, i);
		}
		public ValueArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valueArgument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterValueArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitValueArgument(this);
		}
	}

	public final ValueArgumentContext valueArgument() throws RecognitionException {
		ValueArgumentContext _localctx = new ValueArgumentContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_valueArgument);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1894);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,284,_ctx) ) {
			case 1:
				{
				setState(1880);
				simpleIdentifier();
				setState(1884);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1881);
					match(NL);
					}
					}
					setState(1886);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1887);
				match(ASSIGNMENT);
				setState(1891);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,283,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1888);
						match(NL);
						}
						} 
					}
					setState(1893);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,283,_ctx);
				}
				}
				break;
			}
			setState(1897);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MULT) {
				{
				setState(1896);
				match(MULT);
				}
			}

			setState(1902);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,286,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1899);
					match(NL);
					}
					} 
				}
				setState(1904);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,286,_ctx);
			}
			setState(1905);
			expression();
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

	public static class PrimaryExpressionNoNumberContext extends ParserRuleContext {
		public ParenthesizedExpressionContext parenthesizedExpression() {
			return getRuleContext(ParenthesizedExpressionContext.class,0);
		}
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public SimpleIdentifierContext simpleIdentifier() {
			return getRuleContext(SimpleIdentifierContext.class,0);
		}
		public FunctionLiteralContext functionLiteral() {
			return getRuleContext(FunctionLiteralContext.class,0);
		}
		public ObjectLiteralContext objectLiteral() {
			return getRuleContext(ObjectLiteralContext.class,0);
		}
		public CollectionLiteralContext collectionLiteral() {
			return getRuleContext(CollectionLiteralContext.class,0);
		}
		public ThisExpressionContext thisExpression() {
			return getRuleContext(ThisExpressionContext.class,0);
		}
		public SuperExpressionContext superExpression() {
			return getRuleContext(SuperExpressionContext.class,0);
		}
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public TryExpressionContext tryExpression() {
			return getRuleContext(TryExpressionContext.class,0);
		}
		public LoopExpressionContext loopExpression() {
			return getRuleContext(LoopExpressionContext.class,0);
		}
		public JumpExpressionContext jumpExpression() {
			return getRuleContext(JumpExpressionContext.class,0);
		}
		public PrimaryExpressionNoNumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpressionNoNumber; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterPrimaryExpressionNoNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitPrimaryExpressionNoNumber(this);
		}
	}

	public final PrimaryExpressionNoNumberContext primaryExpressionNoNumber() throws RecognitionException {
		PrimaryExpressionNoNumberContext _localctx = new PrimaryExpressionNoNumberContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_primaryExpressionNoNumber);
		try {
			setState(1919);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(1907);
				parenthesizedExpression();
				}
				break;
			case QUOTE_OPEN:
			case TRIPLE_QUOTE_OPEN:
				enterOuterAlt(_localctx, 2);
				{
				setState(1908);
				stringLiteral();
				}
				break;
			case IMPORT:
			case CONSTRUCTOR:
			case BY:
			case COMPANION:
			case INIT:
			case WHERE:
			case CATCH:
			case FINALLY:
			case OUT:
			case GETTER:
			case SETTER:
			case DYNAMIC:
			case PUBLIC:
			case PRIVATE:
			case PROTECTED:
			case INTERNAL:
			case ENUM:
			case SEALED:
			case ANNOTATION:
			case DATA:
			case INNER:
			case TAILREC:
			case OPERATOR:
			case INLINE:
			case INFIX:
			case EXTERNAL:
			case SUSPEND:
			case OVERRIDE:
			case ABSTRACT:
			case FINAL:
			case OPEN:
			case CONST:
			case LATEINIT:
			case VARARG:
			case NOINLINE:
			case CROSSINLINE:
			case REIFIED:
			case Identifier:
				enterOuterAlt(_localctx, 3);
				{
				setState(1909);
				simpleIdentifier();
				}
				break;
			case LCURL:
			case AT:
			case FILE:
			case FIELD:
			case PROPERTY:
			case GET:
			case SET:
			case RECEIVER:
			case PARAM:
			case SETPARAM:
			case DELEGATE:
			case LabelReference:
				enterOuterAlt(_localctx, 4);
				{
				setState(1910);
				functionLiteral();
				}
				break;
			case OBJECT:
				enterOuterAlt(_localctx, 5);
				{
				setState(1911);
				objectLiteral();
				}
				break;
			case LSQUARE:
				enterOuterAlt(_localctx, 6);
				{
				setState(1912);
				collectionLiteral();
				}
				break;
			case THIS:
				enterOuterAlt(_localctx, 7);
				{
				setState(1913);
				thisExpression();
				}
				break;
			case SUPER:
				enterOuterAlt(_localctx, 8);
				{
				setState(1914);
				superExpression();
				}
				break;
			case IF:
			case WHEN:
				enterOuterAlt(_localctx, 9);
				{
				setState(1915);
				conditionalExpression();
				}
				break;
			case TRY:
				enterOuterAlt(_localctx, 10);
				{
				setState(1916);
				tryExpression();
				}
				break;
			case FOR:
			case DO:
			case WHILE:
				enterOuterAlt(_localctx, 11);
				{
				setState(1917);
				loopExpression();
				}
				break;
			case RETURN_AT:
			case CONTINUE_AT:
			case BREAK_AT:
			case THROW:
			case RETURN:
			case CONTINUE:
			case BREAK:
				enterOuterAlt(_localctx, 12);
				{
				setState(1918);
				jumpExpression();
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

	public static class PrimaryExpressionContext extends ParserRuleContext {
		public ParenthesizedExpressionContext parenthesizedExpression() {
			return getRuleContext(ParenthesizedExpressionContext.class,0);
		}
		public LiteralConstantContext literalConstant() {
			return getRuleContext(LiteralConstantContext.class,0);
		}
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public SimpleIdentifierContext simpleIdentifier() {
			return getRuleContext(SimpleIdentifierContext.class,0);
		}
		public FunctionLiteralContext functionLiteral() {
			return getRuleContext(FunctionLiteralContext.class,0);
		}
		public ObjectLiteralContext objectLiteral() {
			return getRuleContext(ObjectLiteralContext.class,0);
		}
		public CollectionLiteralContext collectionLiteral() {
			return getRuleContext(CollectionLiteralContext.class,0);
		}
		public ThisExpressionContext thisExpression() {
			return getRuleContext(ThisExpressionContext.class,0);
		}
		public SuperExpressionContext superExpression() {
			return getRuleContext(SuperExpressionContext.class,0);
		}
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public TryExpressionContext tryExpression() {
			return getRuleContext(TryExpressionContext.class,0);
		}
		public LoopExpressionContext loopExpression() {
			return getRuleContext(LoopExpressionContext.class,0);
		}
		public JumpExpressionContext jumpExpression() {
			return getRuleContext(JumpExpressionContext.class,0);
		}
		public PrimaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterPrimaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitPrimaryExpression(this);
		}
	}

	public final PrimaryExpressionContext primaryExpression() throws RecognitionException {
		PrimaryExpressionContext _localctx = new PrimaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_primaryExpression);
		try {
			setState(1934);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(1921);
				parenthesizedExpression();
				}
				break;
			case RealLiteral:
			case LongLiteral:
			case IntegerLiteral:
			case HexLiteral:
			case BinLiteral:
			case BooleanLiteral:
			case NullLiteral:
			case CharacterLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(1922);
				literalConstant();
				}
				break;
			case QUOTE_OPEN:
			case TRIPLE_QUOTE_OPEN:
				enterOuterAlt(_localctx, 3);
				{
				setState(1923);
				stringLiteral();
				}
				break;
			case IMPORT:
			case CONSTRUCTOR:
			case BY:
			case COMPANION:
			case INIT:
			case WHERE:
			case CATCH:
			case FINALLY:
			case OUT:
			case GETTER:
			case SETTER:
			case DYNAMIC:
			case PUBLIC:
			case PRIVATE:
			case PROTECTED:
			case INTERNAL:
			case ENUM:
			case SEALED:
			case ANNOTATION:
			case DATA:
			case INNER:
			case TAILREC:
			case OPERATOR:
			case INLINE:
			case INFIX:
			case EXTERNAL:
			case SUSPEND:
			case OVERRIDE:
			case ABSTRACT:
			case FINAL:
			case OPEN:
			case CONST:
			case LATEINIT:
			case VARARG:
			case NOINLINE:
			case CROSSINLINE:
			case REIFIED:
			case Identifier:
				enterOuterAlt(_localctx, 4);
				{
				setState(1924);
				simpleIdentifier();
				}
				break;
			case LCURL:
			case AT:
			case FILE:
			case FIELD:
			case PROPERTY:
			case GET:
			case SET:
			case RECEIVER:
			case PARAM:
			case SETPARAM:
			case DELEGATE:
			case LabelReference:
				enterOuterAlt(_localctx, 5);
				{
				setState(1925);
				functionLiteral();
				}
				break;
			case OBJECT:
				enterOuterAlt(_localctx, 6);
				{
				setState(1926);
				objectLiteral();
				}
				break;
			case LSQUARE:
				enterOuterAlt(_localctx, 7);
				{
				setState(1927);
				collectionLiteral();
				}
				break;
			case THIS:
				enterOuterAlt(_localctx, 8);
				{
				setState(1928);
				thisExpression();
				}
				break;
			case SUPER:
				enterOuterAlt(_localctx, 9);
				{
				setState(1929);
				superExpression();
				}
				break;
			case IF:
			case WHEN:
				enterOuterAlt(_localctx, 10);
				{
				setState(1930);
				conditionalExpression();
				}
				break;
			case TRY:
				enterOuterAlt(_localctx, 11);
				{
				setState(1931);
				tryExpression();
				}
				break;
			case FOR:
			case DO:
			case WHILE:
				enterOuterAlt(_localctx, 12);
				{
				setState(1932);
				loopExpression();
				}
				break;
			case RETURN_AT:
			case CONTINUE_AT:
			case BREAK_AT:
			case THROW:
			case RETURN:
			case CONTINUE:
			case BREAK:
				enterOuterAlt(_localctx, 13);
				{
				setState(1933);
				jumpExpression();
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

	public static class ParenthesizedExpressionContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(KotlinParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(KotlinParser.RPAREN, 0); }
		public ParenthesizedExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parenthesizedExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterParenthesizedExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitParenthesizedExpression(this);
		}
	}

	public final ParenthesizedExpressionContext parenthesizedExpression() throws RecognitionException {
		ParenthesizedExpressionContext _localctx = new ParenthesizedExpressionContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_parenthesizedExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1936);
			match(LPAREN);
			setState(1937);
			expression();
			setState(1938);
			match(RPAREN);
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

	public static class LiteralConstantContext extends ParserRuleContext {
		public TerminalNode BooleanLiteral() { return getToken(KotlinParser.BooleanLiteral, 0); }
		public TerminalNode IntegerLiteral() { return getToken(KotlinParser.IntegerLiteral, 0); }
		public TerminalNode HexLiteral() { return getToken(KotlinParser.HexLiteral, 0); }
		public TerminalNode BinLiteral() { return getToken(KotlinParser.BinLiteral, 0); }
		public TerminalNode CharacterLiteral() { return getToken(KotlinParser.CharacterLiteral, 0); }
		public TerminalNode RealLiteral() { return getToken(KotlinParser.RealLiteral, 0); }
		public TerminalNode NullLiteral() { return getToken(KotlinParser.NullLiteral, 0); }
		public TerminalNode LongLiteral() { return getToken(KotlinParser.LongLiteral, 0); }
		public LiteralConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literalConstant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterLiteralConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitLiteralConstant(this);
		}
	}

	public final LiteralConstantContext literalConstant() throws RecognitionException {
		LiteralConstantContext _localctx = new LiteralConstantContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_literalConstant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1940);
			_la = _input.LA(1);
			if ( !(((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & ((1L << (RealLiteral - 131)) | (1L << (LongLiteral - 131)) | (1L << (IntegerLiteral - 131)) | (1L << (HexLiteral - 131)) | (1L << (BinLiteral - 131)) | (1L << (BooleanLiteral - 131)) | (1L << (NullLiteral - 131)) | (1L << (CharacterLiteral - 131)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class StringLiteralContext extends ParserRuleContext {
		public LineStringLiteralContext lineStringLiteral() {
			return getRuleContext(LineStringLiteralContext.class,0);
		}
		public MultiLineStringLiteralContext multiLineStringLiteral() {
			return getRuleContext(MultiLineStringLiteralContext.class,0);
		}
		public StringLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterStringLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitStringLiteral(this);
		}
	}

	public final StringLiteralContext stringLiteral() throws RecognitionException {
		StringLiteralContext _localctx = new StringLiteralContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_stringLiteral);
		try {
			setState(1944);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case QUOTE_OPEN:
				enterOuterAlt(_localctx, 1);
				{
				setState(1942);
				lineStringLiteral();
				}
				break;
			case TRIPLE_QUOTE_OPEN:
				enterOuterAlt(_localctx, 2);
				{
				setState(1943);
				multiLineStringLiteral();
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

	public static class LineStringLiteralContext extends ParserRuleContext {
		public TerminalNode QUOTE_OPEN() { return getToken(KotlinParser.QUOTE_OPEN, 0); }
		public TerminalNode QUOTE_CLOSE() { return getToken(KotlinParser.QUOTE_CLOSE, 0); }
		public List<LineStringContentContext> lineStringContent() {
			return getRuleContexts(LineStringContentContext.class);
		}
		public LineStringContentContext lineStringContent(int i) {
			return getRuleContext(LineStringContentContext.class,i);
		}
		public List<LineStringExpressionContext> lineStringExpression() {
			return getRuleContexts(LineStringExpressionContext.class);
		}
		public LineStringExpressionContext lineStringExpression(int i) {
			return getRuleContext(LineStringExpressionContext.class,i);
		}
		public LineStringLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lineStringLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterLineStringLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitLineStringLiteral(this);
		}
	}

	public final LineStringLiteralContext lineStringLiteral() throws RecognitionException {
		LineStringLiteralContext _localctx = new LineStringLiteralContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_lineStringLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1946);
			match(QUOTE_OPEN);
			setState(1951);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 157)) & ~0x3f) == 0 && ((1L << (_la - 157)) & ((1L << (LineStrRef - 157)) | (1L << (LineStrText - 157)) | (1L << (LineStrEscapedChar - 157)) | (1L << (LineStrExprStart - 157)))) != 0)) {
				{
				setState(1949);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LineStrRef:
				case LineStrText:
				case LineStrEscapedChar:
					{
					setState(1947);
					lineStringContent();
					}
					break;
				case LineStrExprStart:
					{
					setState(1948);
					lineStringExpression();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(1953);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1954);
			match(QUOTE_CLOSE);
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

	public static class MultiLineStringLiteralContext extends ParserRuleContext {
		public TerminalNode TRIPLE_QUOTE_OPEN() { return getToken(KotlinParser.TRIPLE_QUOTE_OPEN, 0); }
		public TerminalNode TRIPLE_QUOTE_CLOSE() { return getToken(KotlinParser.TRIPLE_QUOTE_CLOSE, 0); }
		public List<MultiLineStringContentContext> multiLineStringContent() {
			return getRuleContexts(MultiLineStringContentContext.class);
		}
		public MultiLineStringContentContext multiLineStringContent(int i) {
			return getRuleContext(MultiLineStringContentContext.class,i);
		}
		public List<MultiLineStringExpressionContext> multiLineStringExpression() {
			return getRuleContexts(MultiLineStringExpressionContext.class);
		}
		public MultiLineStringExpressionContext multiLineStringExpression(int i) {
			return getRuleContext(MultiLineStringExpressionContext.class,i);
		}
		public List<LineStringLiteralContext> lineStringLiteral() {
			return getRuleContexts(LineStringLiteralContext.class);
		}
		public LineStringLiteralContext lineStringLiteral(int i) {
			return getRuleContext(LineStringLiteralContext.class,i);
		}
		public List<TerminalNode> MultiLineStringQuote() { return getTokens(KotlinParser.MultiLineStringQuote); }
		public TerminalNode MultiLineStringQuote(int i) {
			return getToken(KotlinParser.MultiLineStringQuote, i);
		}
		public MultiLineStringLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiLineStringLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterMultiLineStringLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitMultiLineStringLiteral(this);
		}
	}

	public final MultiLineStringLiteralContext multiLineStringLiteral() throws RecognitionException {
		MultiLineStringLiteralContext _localctx = new MultiLineStringLiteralContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_multiLineStringLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1956);
			match(TRIPLE_QUOTE_OPEN);
			setState(1963);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (QUOTE_OPEN - 129)) | (1L << (MultiLineStringQuote - 129)) | (1L << (MultiLineStrRef - 129)) | (1L << (MultiLineStrText - 129)) | (1L << (MultiLineStrEscapedChar - 129)) | (1L << (MultiLineStrExprStart - 129)))) != 0)) {
				{
				setState(1961);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case MultiLineStrRef:
				case MultiLineStrText:
				case MultiLineStrEscapedChar:
					{
					setState(1957);
					multiLineStringContent();
					}
					break;
				case MultiLineStrExprStart:
					{
					setState(1958);
					multiLineStringExpression();
					}
					break;
				case QUOTE_OPEN:
					{
					setState(1959);
					lineStringLiteral();
					}
					break;
				case MultiLineStringQuote:
					{
					setState(1960);
					match(MultiLineStringQuote);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(1965);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1966);
			match(TRIPLE_QUOTE_CLOSE);
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

	public static class LineStringContentContext extends ParserRuleContext {
		public TerminalNode LineStrText() { return getToken(KotlinParser.LineStrText, 0); }
		public TerminalNode LineStrEscapedChar() { return getToken(KotlinParser.LineStrEscapedChar, 0); }
		public TerminalNode LineStrRef() { return getToken(KotlinParser.LineStrRef, 0); }
		public LineStringContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lineStringContent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterLineStringContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitLineStringContent(this);
		}
	}

	public final LineStringContentContext lineStringContent() throws RecognitionException {
		LineStringContentContext _localctx = new LineStringContentContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_lineStringContent);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1968);
			_la = _input.LA(1);
			if ( !(((((_la - 157)) & ~0x3f) == 0 && ((1L << (_la - 157)) & ((1L << (LineStrRef - 157)) | (1L << (LineStrText - 157)) | (1L << (LineStrEscapedChar - 157)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class LineStringExpressionContext extends ParserRuleContext {
		public TerminalNode LineStrExprStart() { return getToken(KotlinParser.LineStrExprStart, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RCURL() { return getToken(KotlinParser.RCURL, 0); }
		public LineStringExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lineStringExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterLineStringExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitLineStringExpression(this);
		}
	}

	public final LineStringExpressionContext lineStringExpression() throws RecognitionException {
		LineStringExpressionContext _localctx = new LineStringExpressionContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_lineStringExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1970);
			match(LineStrExprStart);
			setState(1971);
			expression();
			setState(1972);
			match(RCURL);
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

	public static class MultiLineStringContentContext extends ParserRuleContext {
		public TerminalNode MultiLineStrText() { return getToken(KotlinParser.MultiLineStrText, 0); }
		public TerminalNode MultiLineStrEscapedChar() { return getToken(KotlinParser.MultiLineStrEscapedChar, 0); }
		public TerminalNode MultiLineStrRef() { return getToken(KotlinParser.MultiLineStrRef, 0); }
		public MultiLineStringContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiLineStringContent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterMultiLineStringContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitMultiLineStringContent(this);
		}
	}

	public final MultiLineStringContentContext multiLineStringContent() throws RecognitionException {
		MultiLineStringContentContext _localctx = new MultiLineStringContentContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_multiLineStringContent);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1974);
			_la = _input.LA(1);
			if ( !(((((_la - 163)) & ~0x3f) == 0 && ((1L << (_la - 163)) & ((1L << (MultiLineStrRef - 163)) | (1L << (MultiLineStrText - 163)) | (1L << (MultiLineStrEscapedChar - 163)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class MultiLineStringExpressionContext extends ParserRuleContext {
		public TerminalNode MultiLineStrExprStart() { return getToken(KotlinParser.MultiLineStrExprStart, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RCURL() { return getToken(KotlinParser.RCURL, 0); }
		public MultiLineStringExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiLineStringExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterMultiLineStringExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitMultiLineStringExpression(this);
		}
	}

	public final MultiLineStringExpressionContext multiLineStringExpression() throws RecognitionException {
		MultiLineStringExpressionContext _localctx = new MultiLineStringExpressionContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_multiLineStringExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1976);
			match(MultiLineStrExprStart);
			setState(1977);
			expression();
			setState(1978);
			match(RCURL);
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

	public static class FunctionLiteralContext extends ParserRuleContext {
		public TerminalNode LCURL() { return getToken(KotlinParser.LCURL, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode RCURL() { return getToken(KotlinParser.RCURL, 0); }
		public LambdaParametersContext lambdaParameters() {
			return getRuleContext(LambdaParametersContext.class,0);
		}
		public TerminalNode ARROW() { return getToken(KotlinParser.ARROW, 0); }
		public List<AnnotationsContext> annotations() {
			return getRuleContexts(AnnotationsContext.class);
		}
		public AnnotationsContext annotations(int i) {
			return getRuleContext(AnnotationsContext.class,i);
		}
		public List<TerminalNode> NL() { return getTokens(KotlinParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(KotlinParser.NL, i);
		}
		public FunctionLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterFunctionLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitFunctionLiteral(this);
		}
	}

	public final FunctionLiteralContext functionLiteral() throws RecognitionException {
		FunctionLiteralContext _localctx = new FunctionLiteralContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_functionLiteral);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1983);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT || _la==FILE || ((((_la - 93)) & ~0x3f) == 0 && ((1L << (_la - 93)) & ((1L << (FIELD - 93)) | (1L << (PROPERTY - 93)) | (1L << (GET - 93)) | (1L << (SET - 93)) | (1L << (RECEIVER - 93)) | (1L << (PARAM - 93)) | (1L << (SETPARAM - 93)) | (1L << (DELEGATE - 93)) | (1L << (LabelReference - 93)))) != 0)) {
				{
				{
				setState(1980);
				annotations();
				}
				}
				setState(1985);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2032);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,301,_ctx) ) {
			case 1:
				{
				setState(1986);
				match(LCURL);
				setState(1990);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,295,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1987);
						match(NL);
						}
						} 
					}
					setState(1992);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,295,_ctx);
				}
				setState(1993);
				statements();
				setState(1997);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1994);
					match(NL);
					}
					}
					setState(1999);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2000);
				match(RCURL);
				}
				break;
			case 2:
				{
				setState(2002);
				match(LCURL);
				setState(2006);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,297,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(2003);
						match(NL);
						}
						} 
					}
					setState(2008);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,297,_ctx);
				}
				setState(2009);
				lambdaParameters();
				setState(2013);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(2010);
					match(NL);
					}
					}
					setState(2015);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2016);
				match(ARROW);
				setState(2020);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,299,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(2017);
						match(NL);
						}
						} 
					}
					setState(2022);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,299,_ctx);
				}
				setState(2023);
				statements();
				setState(2027);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(2024);
					match(NL);
					}
					}
					setState(2029);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2030);
				match(RCURL);
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

	public static class LambdaParametersContext extends ParserRuleContext {
		public List<LambdaParameterContext> lambdaParameter() {
			return getRuleContexts(LambdaParameterContext.class);
		}
		public LambdaParameterContext lambdaParameter(int i) {
			return getRuleContext(LambdaParameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(KotlinParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(KotlinParser.COMMA, i);
		}
		public List<TerminalNode> NL() { return getTokens(KotlinParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(KotlinParser.NL, i);
		}
		public LambdaParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterLambdaParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitLambdaParameters(this);
		}
	}

	public final LambdaParametersContext lambdaParameters() throws RecognitionException {
		LambdaParametersContext _localctx = new LambdaParametersContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_lambdaParameters);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2035);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN || _la==IMPORT || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (CONSTRUCTOR - 66)) | (1L << (BY - 66)) | (1L << (COMPANION - 66)) | (1L << (INIT - 66)) | (1L << (WHERE - 66)) | (1L << (CATCH - 66)) | (1L << (FINALLY - 66)) | (1L << (OUT - 66)) | (1L << (GETTER - 66)) | (1L << (SETTER - 66)) | (1L << (DYNAMIC - 66)) | (1L << (PUBLIC - 66)) | (1L << (PRIVATE - 66)) | (1L << (PROTECTED - 66)) | (1L << (INTERNAL - 66)) | (1L << (ENUM - 66)) | (1L << (SEALED - 66)) | (1L << (ANNOTATION - 66)) | (1L << (DATA - 66)) | (1L << (INNER - 66)) | (1L << (TAILREC - 66)) | (1L << (OPERATOR - 66)) | (1L << (INLINE - 66)) | (1L << (INFIX - 66)) | (1L << (EXTERNAL - 66)) | (1L << (SUSPEND - 66)) | (1L << (OVERRIDE - 66)) | (1L << (ABSTRACT - 66)) | (1L << (FINAL - 66)) | (1L << (OPEN - 66)) | (1L << (CONST - 66)) | (1L << (LATEINIT - 66)) | (1L << (VARARG - 66)) | (1L << (NOINLINE - 66)) | (1L << (CROSSINLINE - 66)) | (1L << (REIFIED - 66)))) != 0) || _la==Identifier) {
				{
				setState(2034);
				lambdaParameter();
				}
			}

			setState(2053);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,305,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2040);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(2037);
						match(NL);
						}
						}
						setState(2042);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2043);
					match(COMMA);
					setState(2047);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(2044);
						match(NL);
						}
						}
						setState(2049);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2050);
					lambdaParameter();
					}
					} 
				}
				setState(2055);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,305,_ctx);
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

	public static class LambdaParameterContext extends ParserRuleContext {
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public MultiVariableDeclarationContext multiVariableDeclaration() {
			return getRuleContext(MultiVariableDeclarationContext.class,0);
		}
		public TerminalNode COLON() { return getToken(KotlinParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(KotlinParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(KotlinParser.NL, i);
		}
		public LambdaParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterLambdaParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitLambdaParameter(this);
		}
	}

	public final LambdaParameterContext lambdaParameter() throws RecognitionException {
		LambdaParameterContext _localctx = new LambdaParameterContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_lambdaParameter);
		int _la;
		try {
			setState(2074);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IMPORT:
			case CONSTRUCTOR:
			case BY:
			case COMPANION:
			case INIT:
			case WHERE:
			case CATCH:
			case FINALLY:
			case OUT:
			case GETTER:
			case SETTER:
			case DYNAMIC:
			case PUBLIC:
			case PRIVATE:
			case PROTECTED:
			case INTERNAL:
			case ENUM:
			case SEALED:
			case ANNOTATION:
			case DATA:
			case INNER:
			case TAILREC:
			case OPERATOR:
			case INLINE:
			case INFIX:
			case EXTERNAL:
			case SUSPEND:
			case OVERRIDE:
			case ABSTRACT:
			case FINAL:
			case OPEN:
			case CONST:
			case LATEINIT:
			case VARARG:
			case NOINLINE:
			case CROSSINLINE:
			case REIFIED:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(2056);
				variableDeclaration();
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(2057);
				multiVariableDeclaration();
				setState(2072);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,308,_ctx) ) {
				case 1:
					{
					setState(2061);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(2058);
						match(NL);
						}
						}
						setState(2063);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2064);
					match(COLON);
					setState(2068);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(2065);
						match(NL);
						}
						}
						setState(2070);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2071);
					type();
					}
					break;
				}
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

	public static class ObjectLiteralContext extends ParserRuleContext {
		public TerminalNode OBJECT() { return getToken(KotlinParser.OBJECT, 0); }
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public TerminalNode COLON() { return getToken(KotlinParser.COLON, 0); }
		public DelegationSpecifiersContext delegationSpecifiers() {
			return getRuleContext(DelegationSpecifiersContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(KotlinParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(KotlinParser.NL, i);
		}
		public ObjectLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterObjectLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitObjectLiteral(this);
		}
	}

	public final ObjectLiteralContext objectLiteral() throws RecognitionException {
		ObjectLiteralContext _localctx = new ObjectLiteralContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_objectLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2076);
			match(OBJECT);
			setState(2091);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,312,_ctx) ) {
			case 1:
				{
				setState(2080);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(2077);
					match(NL);
					}
					}
					setState(2082);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2083);
				match(COLON);
				setState(2087);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(2084);
					match(NL);
					}
					}
					setState(2089);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2090);
				delegationSpecifiers();
				}
				break;
			}
			setState(2096);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2093);
				match(NL);
				}
				}
				setState(2098);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2099);
			classBody();
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

	public static class CollectionLiteralContext extends ParserRuleContext {
		public TerminalNode LSQUARE() { return getToken(KotlinParser.LSQUARE, 0); }
		public TerminalNode RSQUARE() { return getToken(KotlinParser.RSQUARE, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(KotlinParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(KotlinParser.COMMA, i);
		}
		public CollectionLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_collectionLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterCollectionLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitCollectionLiteral(this);
		}
	}

	public final CollectionLiteralContext collectionLiteral() throws RecognitionException {
		CollectionLiteralContext _localctx = new CollectionLiteralContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_collectionLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2101);
			match(LSQUARE);
			setState(2103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NL) | (1L << LPAREN) | (1L << LSQUARE) | (1L << LCURL) | (1L << ADD) | (1L << SUB) | (1L << INCR) | (1L << DECR) | (1L << EXCL) | (1L << COLONCOLON) | (1L << Q_COLONCOLON) | (1L << AT) | (1L << RETURN_AT) | (1L << CONTINUE_AT) | (1L << BREAK_AT) | (1L << FILE) | (1L << IMPORT) | (1L << OBJECT))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (CONSTRUCTOR - 66)) | (1L << (BY - 66)) | (1L << (COMPANION - 66)) | (1L << (INIT - 66)) | (1L << (THIS - 66)) | (1L << (SUPER - 66)) | (1L << (WHERE - 66)) | (1L << (IF - 66)) | (1L << (WHEN - 66)) | (1L << (TRY - 66)) | (1L << (CATCH - 66)) | (1L << (FINALLY - 66)) | (1L << (FOR - 66)) | (1L << (DO - 66)) | (1L << (WHILE - 66)) | (1L << (THROW - 66)) | (1L << (RETURN - 66)) | (1L << (CONTINUE - 66)) | (1L << (BREAK - 66)) | (1L << (OUT - 66)) | (1L << (FIELD - 66)) | (1L << (PROPERTY - 66)) | (1L << (GET - 66)) | (1L << (SET - 66)) | (1L << (GETTER - 66)) | (1L << (SETTER - 66)) | (1L << (RECEIVER - 66)) | (1L << (PARAM - 66)) | (1L << (SETPARAM - 66)) | (1L << (DELEGATE - 66)) | (1L << (DYNAMIC - 66)) | (1L << (PUBLIC - 66)) | (1L << (PRIVATE - 66)) | (1L << (PROTECTED - 66)) | (1L << (INTERNAL - 66)) | (1L << (ENUM - 66)) | (1L << (SEALED - 66)) | (1L << (ANNOTATION - 66)) | (1L << (DATA - 66)) | (1L << (INNER - 66)) | (1L << (TAILREC - 66)) | (1L << (OPERATOR - 66)) | (1L << (INLINE - 66)) | (1L << (INFIX - 66)) | (1L << (EXTERNAL - 66)) | (1L << (SUSPEND - 66)) | (1L << (OVERRIDE - 66)) | (1L << (ABSTRACT - 66)) | (1L << (FINAL - 66)) | (1L << (OPEN - 66)) | (1L << (CONST - 66)) | (1L << (LATEINIT - 66)) | (1L << (VARARG - 66)) | (1L << (NOINLINE - 66)) | (1L << (CROSSINLINE - 66)) | (1L << (REIFIED - 66)) | (1L << (QUOTE_OPEN - 66)))) != 0) || ((((_la - 130)) & ~0x3f) == 0 && ((1L << (_la - 130)) & ((1L << (TRIPLE_QUOTE_OPEN - 130)) | (1L << (RealLiteral - 130)) | (1L << (LongLiteral - 130)) | (1L << (IntegerLiteral - 130)) | (1L << (HexLiteral - 130)) | (1L << (BinLiteral - 130)) | (1L << (BooleanLiteral - 130)) | (1L << (NullLiteral - 130)) | (1L << (Identifier - 130)) | (1L << (LabelReference - 130)) | (1L << (LabelDefinition - 130)) | (1L << (CharacterLiteral - 130)))) != 0)) {
				{
				setState(2102);
				expression();
				}
			}

			setState(2109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2105);
				match(COMMA);
				setState(2106);
				expression();
				}
				}
				setState(2111);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2112);
			match(RSQUARE);
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

	public static class ThisExpressionContext extends ParserRuleContext {
		public TerminalNode THIS() { return getToken(KotlinParser.THIS, 0); }
		public TerminalNode LabelReference() { return getToken(KotlinParser.LabelReference, 0); }
		public ThisExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_thisExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterThisExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitThisExpression(this);
		}
	}

	public final ThisExpressionContext thisExpression() throws RecognitionException {
		ThisExpressionContext _localctx = new ThisExpressionContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_thisExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2114);
			match(THIS);
			setState(2116);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,316,_ctx) ) {
			case 1:
				{
				setState(2115);
				match(LabelReference);
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

	public static class SuperExpressionContext extends ParserRuleContext {
		public TerminalNode SUPER() { return getToken(KotlinParser.SUPER, 0); }
		public TerminalNode LANGLE() { return getToken(KotlinParser.LANGLE, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode RANGLE() { return getToken(KotlinParser.RANGLE, 0); }
		public TerminalNode LabelReference() { return getToken(KotlinParser.LabelReference, 0); }
		public List<TerminalNode> NL() { return getTokens(KotlinParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(KotlinParser.NL, i);
		}
		public SuperExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_superExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterSuperExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitSuperExpression(this);
		}
	}

	public final SuperExpressionContext superExpression() throws RecognitionException {
		SuperExpressionContext _localctx = new SuperExpressionContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_superExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2118);
			match(SUPER);
			setState(2135);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,319,_ctx) ) {
			case 1:
				{
				setState(2119);
				match(LANGLE);
				setState(2123);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(2120);
					match(NL);
					}
					}
					setState(2125);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2126);
				type();
				setState(2130);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(2127);
					match(NL);
					}
					}
					setState(2132);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2133);
				match(RANGLE);
				}
				break;
			}
			setState(2138);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,320,_ctx) ) {
			case 1:
				{
				setState(2137);
				match(LabelReference);
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

	public static class ConditionalExpressionContext extends ParserRuleContext {
		public IfExpressionContext ifExpression() {
			return getRuleContext(IfExpressionContext.class,0);
		}
		public WhenExpressionContext whenExpression() {
			return getRuleContext(WhenExpressionContext.class,0);
		}
		public ConditionalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterConditionalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitConditionalExpression(this);
		}
	}

	public final ConditionalExpressionContext conditionalExpression() throws RecognitionException {
		ConditionalExpressionContext _localctx = new ConditionalExpressionContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_conditionalExpression);
		try {
			setState(2142);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(2140);
				ifExpression();
				}
				break;
			case WHEN:
				enterOuterAlt(_localctx, 2);
				{
				setState(2141);
				whenExpression();
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

	public static class IfExpressionContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(KotlinParser.IF, 0); }
		public TerminalNode LPAREN() { return getToken(KotlinParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(KotlinParser.RPAREN, 0); }
		public List<TerminalNode> NL() { return getTokens(KotlinParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(KotlinParser.NL, i);
		}
		public List<ControlStructureBodyContext> controlStructureBody() {
			return getRuleContexts(ControlStructureBodyContext.class);
		}
		public ControlStructureBodyContext controlStructureBody(int i) {
			return getRuleContext(ControlStructureBodyContext.class,i);
		}
		public TerminalNode SEMICOLON() { return getToken(KotlinParser.SEMICOLON, 0); }
		public TerminalNode ELSE() { return getToken(KotlinParser.ELSE, 0); }
		public IfExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterIfExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitIfExpression(this);
		}
	}

	public final IfExpressionContext ifExpression() throws RecognitionException {
		IfExpressionContext _localctx = new IfExpressionContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_ifExpression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2144);
			match(IF);
			setState(2148);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2145);
				match(NL);
				}
				}
				setState(2150);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2151);
			match(LPAREN);
			setState(2152);
			expression();
			setState(2153);
			match(RPAREN);
			setState(2157);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,323,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2154);
					match(NL);
					}
					} 
				}
				setState(2159);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,323,_ctx);
			}
			setState(2161);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,324,_ctx) ) {
			case 1:
				{
				setState(2160);
				controlStructureBody();
				}
				break;
			}
			setState(2164);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,325,_ctx) ) {
			case 1:
				{
				setState(2163);
				match(SEMICOLON);
				}
				break;
			}
			setState(2182);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,329,_ctx) ) {
			case 1:
				{
				setState(2169);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(2166);
					match(NL);
					}
					}
					setState(2171);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2172);
				match(ELSE);
				setState(2176);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,327,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(2173);
						match(NL);
						}
						} 
					}
					setState(2178);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,327,_ctx);
				}
				setState(2180);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,328,_ctx) ) {
				case 1:
					{
					setState(2179);
					controlStructureBody();
					}
					break;
				}
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

	public static class ControlStructureBodyContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ControlStructureBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_controlStructureBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterControlStructureBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitControlStructureBody(this);
		}
	}

	public final ControlStructureBodyContext controlStructureBody() throws RecognitionException {
		ControlStructureBodyContext _localctx = new ControlStructureBodyContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_controlStructureBody);
		try {
			setState(2186);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,330,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2184);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2185);
				expression();
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

	public static class WhenExpressionContext extends ParserRuleContext {
		public TerminalNode WHEN() { return getToken(KotlinParser.WHEN, 0); }
		public TerminalNode LCURL() { return getToken(KotlinParser.LCURL, 0); }
		public TerminalNode RCURL() { return getToken(KotlinParser.RCURL, 0); }
		public List<TerminalNode> NL() { return getTokens(KotlinParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(KotlinParser.NL, i);
		}
		public TerminalNode LPAREN() { return getToken(KotlinParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(KotlinParser.RPAREN, 0); }
		public List<WhenEntryContext> whenEntry() {
			return getRuleContexts(WhenEntryContext.class);
		}
		public WhenEntryContext whenEntry(int i) {
			return getRuleContext(WhenEntryContext.class,i);
		}
		public WhenExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whenExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterWhenExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitWhenExpression(this);
		}
	}

	public final WhenExpressionContext whenExpression() throws RecognitionException {
		WhenExpressionContext _localctx = new WhenExpressionContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_whenExpression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2188);
			match(WHEN);
			setState(2192);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,331,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2189);
					match(NL);
					}
					} 
				}
				setState(2194);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,331,_ctx);
			}
			setState(2199);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(2195);
				match(LPAREN);
				setState(2196);
				expression();
				setState(2197);
				match(RPAREN);
				}
			}

			setState(2204);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2201);
				match(NL);
				}
				}
				setState(2206);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2207);
			match(LCURL);
			setState(2211);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,334,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2208);
					match(NL);
					}
					} 
				}
				setState(2213);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,334,_ctx);
			}
			setState(2223);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,336,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2214);
					whenEntry();
					setState(2218);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,335,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(2215);
							match(NL);
							}
							} 
						}
						setState(2220);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,335,_ctx);
					}
					}
					} 
				}
				setState(2225);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,336,_ctx);
			}
			setState(2229);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2226);
				match(NL);
				}
				}
				setState(2231);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2232);
			match(RCURL);
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

	public static class WhenEntryContext extends ParserRuleContext {
		public List<WhenConditionContext> whenCondition() {
			return getRuleContexts(WhenConditionContext.class);
		}
		public WhenConditionContext whenCondition(int i) {
			return getRuleContext(WhenConditionContext.class,i);
		}
		public TerminalNode ARROW() { return getToken(KotlinParser.ARROW, 0); }
		public ControlStructureBodyContext controlStructureBody() {
			return getRuleContext(ControlStructureBodyContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(KotlinParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(KotlinParser.COMMA, i);
		}
		public List<TerminalNode> NL() { return getTokens(KotlinParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(KotlinParser.NL, i);
		}
		public SemiContext semi() {
			return getRuleContext(SemiContext.class,0);
		}
		public TerminalNode ELSE() { return getToken(KotlinParser.ELSE, 0); }
		public WhenEntryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whenEntry; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterWhenEntry(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitWhenEntry(this);
		}
	}

	public final WhenEntryContext whenEntry() throws RecognitionException {
		WhenEntryContext _localctx = new WhenEntryContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_whenEntry);
		int _la;
		try {
			int _alt;
			setState(2286);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NL:
			case LPAREN:
			case LSQUARE:
			case LCURL:
			case ADD:
			case SUB:
			case INCR:
			case DECR:
			case EXCL:
			case COLONCOLON:
			case Q_COLONCOLON:
			case AT:
			case RETURN_AT:
			case CONTINUE_AT:
			case BREAK_AT:
			case FILE:
			case IMPORT:
			case OBJECT:
			case CONSTRUCTOR:
			case BY:
			case COMPANION:
			case INIT:
			case THIS:
			case SUPER:
			case WHERE:
			case IF:
			case WHEN:
			case TRY:
			case CATCH:
			case FINALLY:
			case FOR:
			case DO:
			case WHILE:
			case THROW:
			case RETURN:
			case CONTINUE:
			case BREAK:
			case IS:
			case IN:
			case NOT_IS:
			case NOT_IN:
			case OUT:
			case FIELD:
			case PROPERTY:
			case GET:
			case SET:
			case GETTER:
			case SETTER:
			case RECEIVER:
			case PARAM:
			case SETPARAM:
			case DELEGATE:
			case DYNAMIC:
			case PUBLIC:
			case PRIVATE:
			case PROTECTED:
			case INTERNAL:
			case ENUM:
			case SEALED:
			case ANNOTATION:
			case DATA:
			case INNER:
			case TAILREC:
			case OPERATOR:
			case INLINE:
			case INFIX:
			case EXTERNAL:
			case SUSPEND:
			case OVERRIDE:
			case ABSTRACT:
			case FINAL:
			case OPEN:
			case CONST:
			case LATEINIT:
			case VARARG:
			case NOINLINE:
			case CROSSINLINE:
			case REIFIED:
			case QUOTE_OPEN:
			case TRIPLE_QUOTE_OPEN:
			case RealLiteral:
			case LongLiteral:
			case IntegerLiteral:
			case HexLiteral:
			case BinLiteral:
			case BooleanLiteral:
			case NullLiteral:
			case Identifier:
			case LabelReference:
			case LabelDefinition:
			case CharacterLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(2234);
				whenCondition();
				setState(2251);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,340,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(2238);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==NL) {
							{
							{
							setState(2235);
							match(NL);
							}
							}
							setState(2240);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(2241);
						match(COMMA);
						setState(2245);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,339,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(2242);
								match(NL);
								}
								} 
							}
							setState(2247);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,339,_ctx);
						}
						setState(2248);
						whenCondition();
						}
						} 
					}
					setState(2253);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,340,_ctx);
				}
				setState(2257);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(2254);
					match(NL);
					}
					}
					setState(2259);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2260);
				match(ARROW);
				setState(2264);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,342,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(2261);
						match(NL);
						}
						} 
					}
					setState(2266);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,342,_ctx);
				}
				setState(2267);
				controlStructureBody();
				setState(2269);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,343,_ctx) ) {
				case 1:
					{
					setState(2268);
					semi();
					}
					break;
				}
				}
				break;
			case ELSE:
				enterOuterAlt(_localctx, 2);
				{
				setState(2271);
				match(ELSE);
				setState(2275);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(2272);
					match(NL);
					}
					}
					setState(2277);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2278);
				match(ARROW);
				setState(2282);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,345,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(2279);
						match(NL);
						}
						} 
					}
					setState(2284);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,345,_ctx);
				}
				setState(2285);
				controlStructureBody();
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

	public static class WhenConditionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public RangeTestContext rangeTest() {
			return getRuleContext(RangeTestContext.class,0);
		}
		public TypeTestContext typeTest() {
			return getRuleContext(TypeTestContext.class,0);
		}
		public WhenConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whenCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterWhenCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitWhenCondition(this);
		}
	}

	public final WhenConditionContext whenCondition() throws RecognitionException {
		WhenConditionContext _localctx = new WhenConditionContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_whenCondition);
		try {
			setState(2291);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NL:
			case LPAREN:
			case LSQUARE:
			case LCURL:
			case ADD:
			case SUB:
			case INCR:
			case DECR:
			case EXCL:
			case COLONCOLON:
			case Q_COLONCOLON:
			case AT:
			case RETURN_AT:
			case CONTINUE_AT:
			case BREAK_AT:
			case FILE:
			case IMPORT:
			case OBJECT:
			case CONSTRUCTOR:
			case BY:
			case COMPANION:
			case INIT:
			case THIS:
			case SUPER:
			case WHERE:
			case IF:
			case WHEN:
			case TRY:
			case CATCH:
			case FINALLY:
			case FOR:
			case DO:
			case WHILE:
			case THROW:
			case RETURN:
			case CONTINUE:
			case BREAK:
			case OUT:
			case FIELD:
			case PROPERTY:
			case GET:
			case SET:
			case GETTER:
			case SETTER:
			case RECEIVER:
			case PARAM:
			case SETPARAM:
			case DELEGATE:
			case DYNAMIC:
			case PUBLIC:
			case PRIVATE:
			case PROTECTED:
			case INTERNAL:
			case ENUM:
			case SEALED:
			case ANNOTATION:
			case DATA:
			case INNER:
			case TAILREC:
			case OPERATOR:
			case INLINE:
			case INFIX:
			case EXTERNAL:
			case SUSPEND:
			case OVERRIDE:
			case ABSTRACT:
			case FINAL:
			case OPEN:
			case CONST:
			case LATEINIT:
			case VARARG:
			case NOINLINE:
			case CROSSINLINE:
			case REIFIED:
			case QUOTE_OPEN:
			case TRIPLE_QUOTE_OPEN:
			case RealLiteral:
			case LongLiteral:
			case IntegerLiteral:
			case HexLiteral:
			case BinLiteral:
			case BooleanLiteral:
			case NullLiteral:
			case Identifier:
			case LabelReference:
			case LabelDefinition:
			case CharacterLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(2288);
				expression();
				}
				break;
			case IN:
			case NOT_IN:
				enterOuterAlt(_localctx, 2);
				{
				setState(2289);
				rangeTest();
				}
				break;
			case IS:
			case NOT_IS:
				enterOuterAlt(_localctx, 3);
				{
				setState(2290);
				typeTest();
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

	public static class RangeTestContext extends ParserRuleContext {
		public InOperatorContext inOperator() {
			return getRuleContext(InOperatorContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(KotlinParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(KotlinParser.NL, i);
		}
		public RangeTestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rangeTest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterRangeTest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitRangeTest(this);
		}
	}

	public final RangeTestContext rangeTest() throws RecognitionException {
		RangeTestContext _localctx = new RangeTestContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_rangeTest);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2293);
			inOperator();
			setState(2297);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,348,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2294);
					match(NL);
					}
					} 
				}
				setState(2299);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,348,_ctx);
			}
			setState(2300);
			expression();
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

	public static class TypeTestContext extends ParserRuleContext {
		public IsOperatorContext isOperator() {
			return getRuleContext(IsOperatorContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(KotlinParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(KotlinParser.NL, i);
		}
		public TypeTestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeTest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterTypeTest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitTypeTest(this);
		}
	}

	public final TypeTestContext typeTest() throws RecognitionException {
		TypeTestContext _localctx = new TypeTestContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_typeTest);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2302);
			isOperator();
			setState(2306);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2303);
				match(NL);
				}
				}
				setState(2308);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2309);
			type();
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

	public static class TryExpressionContext extends ParserRuleContext {
		public TerminalNode TRY() { return getToken(KotlinParser.TRY, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(KotlinParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(KotlinParser.NL, i);
		}
		public List<CatchBlockContext> catchBlock() {
			return getRuleContexts(CatchBlockContext.class);
		}
		public CatchBlockContext catchBlock(int i) {
			return getRuleContext(CatchBlockContext.class,i);
		}
		public FinallyBlockContext finallyBlock() {
			return getRuleContext(FinallyBlockContext.class,0);
		}
		public TryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterTryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitTryExpression(this);
		}
	}

	public final TryExpressionContext tryExpression() throws RecognitionException {
		TryExpressionContext _localctx = new TryExpressionContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_tryExpression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2311);
			match(TRY);
			setState(2315);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2312);
				match(NL);
				}
				}
				setState(2317);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2318);
			block();
			setState(2328);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,352,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2322);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(2319);
						match(NL);
						}
						}
						setState(2324);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2325);
					catchBlock();
					}
					} 
				}
				setState(2330);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,352,_ctx);
			}
			setState(2338);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,354,_ctx) ) {
			case 1:
				{
				setState(2334);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(2331);
					match(NL);
					}
					}
					setState(2336);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2337);
				finallyBlock();
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

	public static class CatchBlockContext extends ParserRuleContext {
		public TerminalNode CATCH() { return getToken(KotlinParser.CATCH, 0); }
		public TerminalNode LPAREN() { return getToken(KotlinParser.LPAREN, 0); }
		public SimpleIdentifierContext simpleIdentifier() {
			return getRuleContext(SimpleIdentifierContext.class,0);
		}
		public TerminalNode COLON() { return getToken(KotlinParser.COLON, 0); }
		public UserTypeContext userType() {
			return getRuleContext(UserTypeContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(KotlinParser.RPAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(KotlinParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(KotlinParser.NL, i);
		}
		public List<AnnotationsContext> annotations() {
			return getRuleContexts(AnnotationsContext.class);
		}
		public AnnotationsContext annotations(int i) {
			return getRuleContext(AnnotationsContext.class,i);
		}
		public CatchBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterCatchBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitCatchBlock(this);
		}
	}

	public final CatchBlockContext catchBlock() throws RecognitionException {
		CatchBlockContext _localctx = new CatchBlockContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_catchBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2340);
			match(CATCH);
			setState(2344);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2341);
				match(NL);
				}
				}
				setState(2346);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2347);
			match(LPAREN);
			setState(2351);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT || _la==FILE || ((((_la - 93)) & ~0x3f) == 0 && ((1L << (_la - 93)) & ((1L << (FIELD - 93)) | (1L << (PROPERTY - 93)) | (1L << (GET - 93)) | (1L << (SET - 93)) | (1L << (RECEIVER - 93)) | (1L << (PARAM - 93)) | (1L << (SETPARAM - 93)) | (1L << (DELEGATE - 93)) | (1L << (LabelReference - 93)))) != 0)) {
				{
				{
				setState(2348);
				annotations();
				}
				}
				setState(2353);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2354);
			simpleIdentifier();
			setState(2355);
			match(COLON);
			setState(2356);
			userType();
			setState(2357);
			match(RPAREN);
			setState(2361);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2358);
				match(NL);
				}
				}
				setState(2363);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2364);
			block();
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

	public static class FinallyBlockContext extends ParserRuleContext {
		public TerminalNode FINALLY() { return getToken(KotlinParser.FINALLY, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(KotlinParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(KotlinParser.NL, i);
		}
		public FinallyBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_finallyBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterFinallyBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitFinallyBlock(this);
		}
	}

	public final FinallyBlockContext finallyBlock() throws RecognitionException {
		FinallyBlockContext _localctx = new FinallyBlockContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_finallyBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2366);
			match(FINALLY);
			setState(2370);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2367);
				match(NL);
				}
				}
				setState(2372);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2373);
			block();
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

	public static class LoopExpressionContext extends ParserRuleContext {
		public ForExpressionContext forExpression() {
			return getRuleContext(ForExpressionContext.class,0);
		}
		public WhileExpressionContext whileExpression() {
			return getRuleContext(WhileExpressionContext.class,0);
		}
		public DoWhileExpressionContext doWhileExpression() {
			return getRuleContext(DoWhileExpressionContext.class,0);
		}
		public LoopExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterLoopExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitLoopExpression(this);
		}
	}

	public final LoopExpressionContext loopExpression() throws RecognitionException {
		LoopExpressionContext _localctx = new LoopExpressionContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_loopExpression);
		try {
			setState(2378);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(2375);
				forExpression();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(2376);
				whileExpression();
				}
				break;
			case DO:
				enterOuterAlt(_localctx, 3);
				{
				setState(2377);
				doWhileExpression();
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

	public static class ForExpressionContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(KotlinParser.FOR, 0); }
		public TerminalNode LPAREN() { return getToken(KotlinParser.LPAREN, 0); }
		public TerminalNode IN() { return getToken(KotlinParser.IN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(KotlinParser.RPAREN, 0); }
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public MultiVariableDeclarationContext multiVariableDeclaration() {
			return getRuleContext(MultiVariableDeclarationContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(KotlinParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(KotlinParser.NL, i);
		}
		public List<AnnotationsContext> annotations() {
			return getRuleContexts(AnnotationsContext.class);
		}
		public AnnotationsContext annotations(int i) {
			return getRuleContext(AnnotationsContext.class,i);
		}
		public ControlStructureBodyContext controlStructureBody() {
			return getRuleContext(ControlStructureBodyContext.class,0);
		}
		public ForExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterForExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitForExpression(this);
		}
	}

	public final ForExpressionContext forExpression() throws RecognitionException {
		ForExpressionContext _localctx = new ForExpressionContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_forExpression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2380);
			match(FOR);
			setState(2384);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2381);
				match(NL);
				}
				}
				setState(2386);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2387);
			match(LPAREN);
			setState(2391);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT || _la==FILE || ((((_la - 93)) & ~0x3f) == 0 && ((1L << (_la - 93)) & ((1L << (FIELD - 93)) | (1L << (PROPERTY - 93)) | (1L << (GET - 93)) | (1L << (SET - 93)) | (1L << (RECEIVER - 93)) | (1L << (PARAM - 93)) | (1L << (SETPARAM - 93)) | (1L << (DELEGATE - 93)) | (1L << (LabelReference - 93)))) != 0)) {
				{
				{
				setState(2388);
				annotations();
				}
				}
				setState(2393);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2396);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IMPORT:
			case CONSTRUCTOR:
			case BY:
			case COMPANION:
			case INIT:
			case WHERE:
			case CATCH:
			case FINALLY:
			case OUT:
			case GETTER:
			case SETTER:
			case DYNAMIC:
			case PUBLIC:
			case PRIVATE:
			case PROTECTED:
			case INTERNAL:
			case ENUM:
			case SEALED:
			case ANNOTATION:
			case DATA:
			case INNER:
			case TAILREC:
			case OPERATOR:
			case INLINE:
			case INFIX:
			case EXTERNAL:
			case SUSPEND:
			case OVERRIDE:
			case ABSTRACT:
			case FINAL:
			case OPEN:
			case CONST:
			case LATEINIT:
			case VARARG:
			case NOINLINE:
			case CROSSINLINE:
			case REIFIED:
			case Identifier:
				{
				setState(2394);
				variableDeclaration();
				}
				break;
			case LPAREN:
				{
				setState(2395);
				multiVariableDeclaration();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(2398);
			match(IN);
			setState(2399);
			expression();
			setState(2400);
			match(RPAREN);
			setState(2404);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,363,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2401);
					match(NL);
					}
					} 
				}
				setState(2406);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,363,_ctx);
			}
			setState(2408);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,364,_ctx) ) {
			case 1:
				{
				setState(2407);
				controlStructureBody();
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

	public static class WhileExpressionContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(KotlinParser.WHILE, 0); }
		public TerminalNode LPAREN() { return getToken(KotlinParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(KotlinParser.RPAREN, 0); }
		public List<TerminalNode> NL() { return getTokens(KotlinParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(KotlinParser.NL, i);
		}
		public ControlStructureBodyContext controlStructureBody() {
			return getRuleContext(ControlStructureBodyContext.class,0);
		}
		public WhileExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterWhileExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitWhileExpression(this);
		}
	}

	public final WhileExpressionContext whileExpression() throws RecognitionException {
		WhileExpressionContext _localctx = new WhileExpressionContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_whileExpression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2410);
			match(WHILE);
			setState(2414);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2411);
				match(NL);
				}
				}
				setState(2416);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2417);
			match(LPAREN);
			setState(2418);
			expression();
			setState(2419);
			match(RPAREN);
			setState(2423);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,366,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2420);
					match(NL);
					}
					} 
				}
				setState(2425);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,366,_ctx);
			}
			setState(2427);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,367,_ctx) ) {
			case 1:
				{
				setState(2426);
				controlStructureBody();
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

	public static class DoWhileExpressionContext extends ParserRuleContext {
		public TerminalNode DO() { return getToken(KotlinParser.DO, 0); }
		public TerminalNode WHILE() { return getToken(KotlinParser.WHILE, 0); }
		public TerminalNode LPAREN() { return getToken(KotlinParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(KotlinParser.RPAREN, 0); }
		public List<TerminalNode> NL() { return getTokens(KotlinParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(KotlinParser.NL, i);
		}
		public ControlStructureBodyContext controlStructureBody() {
			return getRuleContext(ControlStructureBodyContext.class,0);
		}
		public DoWhileExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doWhileExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterDoWhileExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitDoWhileExpression(this);
		}
	}

	public final DoWhileExpressionContext doWhileExpression() throws RecognitionException {
		DoWhileExpressionContext _localctx = new DoWhileExpressionContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_doWhileExpression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2429);
			match(DO);
			setState(2433);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,368,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2430);
					match(NL);
					}
					} 
				}
				setState(2435);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,368,_ctx);
			}
			setState(2437);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,369,_ctx) ) {
			case 1:
				{
				setState(2436);
				controlStructureBody();
				}
				break;
			}
			setState(2442);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2439);
				match(NL);
				}
				}
				setState(2444);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2445);
			match(WHILE);
			setState(2449);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2446);
				match(NL);
				}
				}
				setState(2451);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2452);
			match(LPAREN);
			setState(2453);
			expression();
			setState(2454);
			match(RPAREN);
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

	public static class JumpExpressionContext extends ParserRuleContext {
		public TerminalNode THROW() { return getToken(KotlinParser.THROW, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(KotlinParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(KotlinParser.NL, i);
		}
		public TerminalNode RETURN() { return getToken(KotlinParser.RETURN, 0); }
		public TerminalNode RETURN_AT() { return getToken(KotlinParser.RETURN_AT, 0); }
		public TerminalNode CONTINUE() { return getToken(KotlinParser.CONTINUE, 0); }
		public TerminalNode CONTINUE_AT() { return getToken(KotlinParser.CONTINUE_AT, 0); }
		public TerminalNode BREAK() { return getToken(KotlinParser.BREAK, 0); }
		public TerminalNode BREAK_AT() { return getToken(KotlinParser.BREAK_AT, 0); }
		public JumpExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jumpExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterJumpExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitJumpExpression(this);
		}
	}

	public final JumpExpressionContext jumpExpression() throws RecognitionException {
		JumpExpressionContext _localctx = new JumpExpressionContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_jumpExpression);
		int _la;
		try {
			int _alt;
			setState(2472);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case THROW:
				enterOuterAlt(_localctx, 1);
				{
				setState(2456);
				match(THROW);
				setState(2460);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,372,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(2457);
						match(NL);
						}
						} 
					}
					setState(2462);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,372,_ctx);
				}
				setState(2463);
				expression();
				}
				break;
			case RETURN_AT:
			case RETURN:
				enterOuterAlt(_localctx, 2);
				{
				setState(2464);
				_la = _input.LA(1);
				if ( !(_la==RETURN_AT || _la==RETURN) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2466);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,373,_ctx) ) {
				case 1:
					{
					setState(2465);
					expression();
					}
					break;
				}
				}
				break;
			case CONTINUE:
				enterOuterAlt(_localctx, 3);
				{
				setState(2468);
				match(CONTINUE);
				}
				break;
			case CONTINUE_AT:
				enterOuterAlt(_localctx, 4);
				{
				setState(2469);
				match(CONTINUE_AT);
				}
				break;
			case BREAK:
				enterOuterAlt(_localctx, 5);
				{
				setState(2470);
				match(BREAK);
				}
				break;
			case BREAK_AT:
				enterOuterAlt(_localctx, 6);
				{
				setState(2471);
				match(BREAK_AT);
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

	public static class CallableReferenceContext extends ParserRuleContext {
		public TerminalNode COLONCOLON() { return getToken(KotlinParser.COLONCOLON, 0); }
		public TerminalNode Q_COLONCOLON() { return getToken(KotlinParser.Q_COLONCOLON, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode CLASS() { return getToken(KotlinParser.CLASS, 0); }
		public UserTypeContext userType() {
			return getRuleContext(UserTypeContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(KotlinParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(KotlinParser.NL, i);
		}
		public List<TerminalNode> QUEST() { return getTokens(KotlinParser.QUEST); }
		public TerminalNode QUEST(int i) {
			return getToken(KotlinParser.QUEST, i);
		}
		public CallableReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callableReference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterCallableReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitCallableReference(this);
		}
	}

	public final CallableReferenceContext callableReference() throws RecognitionException {
		CallableReferenceContext _localctx = new CallableReferenceContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_callableReference);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2487);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 58)) & ~0x3f) == 0 && ((1L << (_la - 58)) & ((1L << (IMPORT - 58)) | (1L << (CONSTRUCTOR - 58)) | (1L << (BY - 58)) | (1L << (COMPANION - 58)) | (1L << (INIT - 58)) | (1L << (WHERE - 58)) | (1L << (CATCH - 58)) | (1L << (FINALLY - 58)) | (1L << (OUT - 58)) | (1L << (GETTER - 58)) | (1L << (SETTER - 58)) | (1L << (DYNAMIC - 58)) | (1L << (PUBLIC - 58)) | (1L << (PRIVATE - 58)) | (1L << (PROTECTED - 58)) | (1L << (INTERNAL - 58)) | (1L << (ENUM - 58)) | (1L << (SEALED - 58)) | (1L << (ANNOTATION - 58)) | (1L << (DATA - 58)) | (1L << (INNER - 58)) | (1L << (TAILREC - 58)) | (1L << (OPERATOR - 58)) | (1L << (INLINE - 58)) | (1L << (INFIX - 58)) | (1L << (EXTERNAL - 58)) | (1L << (SUSPEND - 58)) | (1L << (OVERRIDE - 58)) | (1L << (ABSTRACT - 58)) | (1L << (FINAL - 58)))) != 0) || ((((_la - 122)) & ~0x3f) == 0 && ((1L << (_la - 122)) & ((1L << (OPEN - 122)) | (1L << (CONST - 122)) | (1L << (LATEINIT - 122)) | (1L << (VARARG - 122)) | (1L << (NOINLINE - 122)) | (1L << (CROSSINLINE - 122)) | (1L << (REIFIED - 122)) | (1L << (Identifier - 122)))) != 0)) {
				{
				setState(2474);
				userType();
				setState(2484);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==QUEST) {
					{
					{
					setState(2475);
					match(QUEST);
					setState(2479);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,375,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(2476);
							match(NL);
							}
							} 
						}
						setState(2481);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,375,_ctx);
					}
					}
					}
					setState(2486);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(2492);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2489);
				match(NL);
				}
				}
				setState(2494);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2495);
			_la = _input.LA(1);
			if ( !(_la==COLONCOLON || _la==Q_COLONCOLON) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(2499);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2496);
				match(NL);
				}
				}
				setState(2501);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2504);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IMPORT:
			case CONSTRUCTOR:
			case BY:
			case COMPANION:
			case INIT:
			case WHERE:
			case CATCH:
			case FINALLY:
			case OUT:
			case GETTER:
			case SETTER:
			case DYNAMIC:
			case PUBLIC:
			case PRIVATE:
			case PROTECTED:
			case INTERNAL:
			case ENUM:
			case SEALED:
			case ANNOTATION:
			case DATA:
			case INNER:
			case TAILREC:
			case OPERATOR:
			case INLINE:
			case INFIX:
			case EXTERNAL:
			case SUSPEND:
			case OVERRIDE:
			case ABSTRACT:
			case FINAL:
			case OPEN:
			case CONST:
			case LATEINIT:
			case VARARG:
			case NOINLINE:
			case CROSSINLINE:
			case REIFIED:
			case Identifier:
				{
				setState(2502);
				identifier();
				}
				break;
			case CLASS:
				{
				setState(2503);
				match(CLASS);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class AssignmentOperatorContext extends ParserRuleContext {
		public TerminalNode ASSIGNMENT() { return getToken(KotlinParser.ASSIGNMENT, 0); }
		public TerminalNode ADD_ASSIGNMENT() { return getToken(KotlinParser.ADD_ASSIGNMENT, 0); }
		public TerminalNode SUB_ASSIGNMENT() { return getToken(KotlinParser.SUB_ASSIGNMENT, 0); }
		public TerminalNode MULT_ASSIGNMENT() { return getToken(KotlinParser.MULT_ASSIGNMENT, 0); }
		public TerminalNode DIV_ASSIGNMENT() { return getToken(KotlinParser.DIV_ASSIGNMENT, 0); }
		public TerminalNode MOD_ASSIGNMENT() { return getToken(KotlinParser.MOD_ASSIGNMENT, 0); }
		public AssignmentOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterAssignmentOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitAssignmentOperator(this);
		}
	}

	public final AssignmentOperatorContext assignmentOperator() throws RecognitionException {
		AssignmentOperatorContext _localctx = new AssignmentOperatorContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_assignmentOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2506);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ASSIGNMENT) | (1L << ADD_ASSIGNMENT) | (1L << SUB_ASSIGNMENT) | (1L << MULT_ASSIGNMENT) | (1L << DIV_ASSIGNMENT) | (1L << MOD_ASSIGNMENT))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class EqualityOperatorContext extends ParserRuleContext {
		public TerminalNode EXCL_EQ() { return getToken(KotlinParser.EXCL_EQ, 0); }
		public TerminalNode EXCL_EQEQ() { return getToken(KotlinParser.EXCL_EQEQ, 0); }
		public TerminalNode EQEQ() { return getToken(KotlinParser.EQEQ, 0); }
		public TerminalNode EQEQEQ() { return getToken(KotlinParser.EQEQEQ, 0); }
		public EqualityOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalityOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterEqualityOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitEqualityOperator(this);
		}
	}

	public final EqualityOperatorContext equalityOperator() throws RecognitionException {
		EqualityOperatorContext _localctx = new EqualityOperatorContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_equalityOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2508);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EXCL_EQ) | (1L << EXCL_EQEQ) | (1L << EQEQ) | (1L << EQEQEQ))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class ComparisonOperatorContext extends ParserRuleContext {
		public TerminalNode LANGLE() { return getToken(KotlinParser.LANGLE, 0); }
		public TerminalNode RANGLE() { return getToken(KotlinParser.RANGLE, 0); }
		public TerminalNode LE() { return getToken(KotlinParser.LE, 0); }
		public TerminalNode GE() { return getToken(KotlinParser.GE, 0); }
		public ComparisonOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterComparisonOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitComparisonOperator(this);
		}
	}

	public final ComparisonOperatorContext comparisonOperator() throws RecognitionException {
		ComparisonOperatorContext _localctx = new ComparisonOperatorContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_comparisonOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2510);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LANGLE) | (1L << RANGLE) | (1L << LE) | (1L << GE))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class InOperatorContext extends ParserRuleContext {
		public TerminalNode IN() { return getToken(KotlinParser.IN, 0); }
		public TerminalNode NOT_IN() { return getToken(KotlinParser.NOT_IN, 0); }
		public InOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterInOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitInOperator(this);
		}
	}

	public final InOperatorContext inOperator() throws RecognitionException {
		InOperatorContext _localctx = new InOperatorContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_inOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2512);
			_la = _input.LA(1);
			if ( !(_la==IN || _la==NOT_IN) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class IsOperatorContext extends ParserRuleContext {
		public TerminalNode IS() { return getToken(KotlinParser.IS, 0); }
		public TerminalNode NOT_IS() { return getToken(KotlinParser.NOT_IS, 0); }
		public IsOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_isOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterIsOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitIsOperator(this);
		}
	}

	public final IsOperatorContext isOperator() throws RecognitionException {
		IsOperatorContext _localctx = new IsOperatorContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_isOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2514);
			_la = _input.LA(1);
			if ( !(_la==IS || _la==NOT_IS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class AdditiveOperatorContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(KotlinParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(KotlinParser.SUB, 0); }
		public AdditiveOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterAdditiveOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitAdditiveOperator(this);
		}
	}

	public final AdditiveOperatorContext additiveOperator() throws RecognitionException {
		AdditiveOperatorContext _localctx = new AdditiveOperatorContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_additiveOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2516);
			_la = _input.LA(1);
			if ( !(_la==ADD || _la==SUB) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class MultiplicativeOperatorContext extends ParserRuleContext {
		public TerminalNode MULT() { return getToken(KotlinParser.MULT, 0); }
		public TerminalNode DIV() { return getToken(KotlinParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(KotlinParser.MOD, 0); }
		public MultiplicativeOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterMultiplicativeOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitMultiplicativeOperator(this);
		}
	}

	public final MultiplicativeOperatorContext multiplicativeOperator() throws RecognitionException {
		MultiplicativeOperatorContext _localctx = new MultiplicativeOperatorContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_multiplicativeOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2518);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MULT) | (1L << MOD) | (1L << DIV))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class AsOperatorContext extends ParserRuleContext {
		public TerminalNode AS() { return getToken(KotlinParser.AS, 0); }
		public TerminalNode AS_SAFE() { return getToken(KotlinParser.AS_SAFE, 0); }
		public TerminalNode COLON() { return getToken(KotlinParser.COLON, 0); }
		public AsOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterAsOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitAsOperator(this);
		}
	}

	public final AsOperatorContext asOperator() throws RecognitionException {
		AsOperatorContext _localctx = new AsOperatorContext(_ctx, getState());
		enterRule(_localctx, 254, RULE_asOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2520);
			_la = _input.LA(1);
			if ( !(((((_la - 25)) & ~0x3f) == 0 && ((1L << (_la - 25)) & ((1L << (COLON - 25)) | (1L << (AS_SAFE - 25)) | (1L << (AS - 25)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class PrefixUnaryOperatorContext extends ParserRuleContext {
		public TerminalNode INCR() { return getToken(KotlinParser.INCR, 0); }
		public TerminalNode DECR() { return getToken(KotlinParser.DECR, 0); }
		public TerminalNode ADD() { return getToken(KotlinParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(KotlinParser.SUB, 0); }
		public TerminalNode EXCL() { return getToken(KotlinParser.EXCL, 0); }
		public PrefixUnaryOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prefixUnaryOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterPrefixUnaryOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitPrefixUnaryOperator(this);
		}
	}

	public final PrefixUnaryOperatorContext prefixUnaryOperator() throws RecognitionException {
		PrefixUnaryOperatorContext _localctx = new PrefixUnaryOperatorContext(_ctx, getState());
		enterRule(_localctx, 256, RULE_prefixUnaryOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2522);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << SUB) | (1L << INCR) | (1L << DECR) | (1L << EXCL))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class PostfixUnaryOperatorContext extends ParserRuleContext {
		public TerminalNode INCR() { return getToken(KotlinParser.INCR, 0); }
		public TerminalNode DECR() { return getToken(KotlinParser.DECR, 0); }
		public List<TerminalNode> EXCL() { return getTokens(KotlinParser.EXCL); }
		public TerminalNode EXCL(int i) {
			return getToken(KotlinParser.EXCL, i);
		}
		public PostfixUnaryOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfixUnaryOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterPostfixUnaryOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitPostfixUnaryOperator(this);
		}
	}

	public final PostfixUnaryOperatorContext postfixUnaryOperator() throws RecognitionException {
		PostfixUnaryOperatorContext _localctx = new PostfixUnaryOperatorContext(_ctx, getState());
		enterRule(_localctx, 258, RULE_postfixUnaryOperator);
		try {
			setState(2528);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INCR:
				enterOuterAlt(_localctx, 1);
				{
				setState(2524);
				match(INCR);
				}
				break;
			case DECR:
				enterOuterAlt(_localctx, 2);
				{
				setState(2525);
				match(DECR);
				}
				break;
			case EXCL:
				enterOuterAlt(_localctx, 3);
				{
				setState(2526);
				match(EXCL);
				setState(2527);
				match(EXCL);
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

	public static class MemberAccessOperatorContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(KotlinParser.DOT, 0); }
		public TerminalNode QUEST() { return getToken(KotlinParser.QUEST, 0); }
		public MemberAccessOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberAccessOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterMemberAccessOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitMemberAccessOperator(this);
		}
	}

	public final MemberAccessOperatorContext memberAccessOperator() throws RecognitionException {
		MemberAccessOperatorContext _localctx = new MemberAccessOperatorContext(_ctx, getState());
		enterRule(_localctx, 260, RULE_memberAccessOperator);
		try {
			setState(2533);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(2530);
				match(DOT);
				}
				break;
			case QUEST:
				enterOuterAlt(_localctx, 2);
				{
				setState(2531);
				match(QUEST);
				setState(2532);
				match(DOT);
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

	public static class ModifierListContext extends ParserRuleContext {
		public List<AnnotationsContext> annotations() {
			return getRuleContexts(AnnotationsContext.class);
		}
		public AnnotationsContext annotations(int i) {
			return getRuleContext(AnnotationsContext.class,i);
		}
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public ModifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifierList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterModifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitModifierList(this);
		}
	}

	public final ModifierListContext modifierList() throws RecognitionException {
		ModifierListContext _localctx = new ModifierListContext(_ctx, getState());
		enterRule(_localctx, 262, RULE_modifierList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2537); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(2537);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case AT:
					case FILE:
					case FIELD:
					case PROPERTY:
					case GET:
					case SET:
					case RECEIVER:
					case PARAM:
					case SETPARAM:
					case DELEGATE:
					case LabelReference:
						{
						setState(2535);
						annotations();
						}
						break;
					case IN:
					case OUT:
					case PUBLIC:
					case PRIVATE:
					case PROTECTED:
					case INTERNAL:
					case ENUM:
					case SEALED:
					case ANNOTATION:
					case DATA:
					case INNER:
					case TAILREC:
					case OPERATOR:
					case INLINE:
					case INFIX:
					case EXTERNAL:
					case SUSPEND:
					case OVERRIDE:
					case ABSTRACT:
					case FINAL:
					case OPEN:
					case CONST:
					case LATEINIT:
					case VARARG:
					case NOINLINE:
					case CROSSINLINE:
					case REIFIED:
						{
						setState(2536);
						modifier();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2539); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,384,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class ModifierContext extends ParserRuleContext {
		public ClassModifierContext classModifier() {
			return getRuleContext(ClassModifierContext.class,0);
		}
		public MemberModifierContext memberModifier() {
			return getRuleContext(MemberModifierContext.class,0);
		}
		public VisibilityModifierContext visibilityModifier() {
			return getRuleContext(VisibilityModifierContext.class,0);
		}
		public VarianceAnnotationContext varianceAnnotation() {
			return getRuleContext(VarianceAnnotationContext.class,0);
		}
		public FunctionModifierContext functionModifier() {
			return getRuleContext(FunctionModifierContext.class,0);
		}
		public PropertyModifierContext propertyModifier() {
			return getRuleContext(PropertyModifierContext.class,0);
		}
		public InheritanceModifierContext inheritanceModifier() {
			return getRuleContext(InheritanceModifierContext.class,0);
		}
		public ParameterModifierContext parameterModifier() {
			return getRuleContext(ParameterModifierContext.class,0);
		}
		public TypeParameterModifierContext typeParameterModifier() {
			return getRuleContext(TypeParameterModifierContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(KotlinParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(KotlinParser.NL, i);
		}
		public ModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitModifier(this);
		}
	}

	public final ModifierContext modifier() throws RecognitionException {
		ModifierContext _localctx = new ModifierContext(_ctx, getState());
		enterRule(_localctx, 264, RULE_modifier);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2550);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ENUM:
			case SEALED:
			case ANNOTATION:
			case DATA:
			case INNER:
				{
				setState(2541);
				classModifier();
				}
				break;
			case OVERRIDE:
			case LATEINIT:
				{
				setState(2542);
				memberModifier();
				}
				break;
			case PUBLIC:
			case PRIVATE:
			case PROTECTED:
			case INTERNAL:
				{
				setState(2543);
				visibilityModifier();
				}
				break;
			case IN:
			case OUT:
				{
				setState(2544);
				varianceAnnotation();
				}
				break;
			case TAILREC:
			case OPERATOR:
			case INLINE:
			case INFIX:
			case EXTERNAL:
			case SUSPEND:
				{
				setState(2545);
				functionModifier();
				}
				break;
			case CONST:
				{
				setState(2546);
				propertyModifier();
				}
				break;
			case ABSTRACT:
			case FINAL:
			case OPEN:
				{
				setState(2547);
				inheritanceModifier();
				}
				break;
			case VARARG:
			case NOINLINE:
			case CROSSINLINE:
				{
				setState(2548);
				parameterModifier();
				}
				break;
			case REIFIED:
				{
				setState(2549);
				typeParameterModifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(2555);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,386,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2552);
					match(NL);
					}
					} 
				}
				setState(2557);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,386,_ctx);
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

	public static class ClassModifierContext extends ParserRuleContext {
		public TerminalNode ENUM() { return getToken(KotlinParser.ENUM, 0); }
		public TerminalNode SEALED() { return getToken(KotlinParser.SEALED, 0); }
		public TerminalNode ANNOTATION() { return getToken(KotlinParser.ANNOTATION, 0); }
		public TerminalNode DATA() { return getToken(KotlinParser.DATA, 0); }
		public TerminalNode INNER() { return getToken(KotlinParser.INNER, 0); }
		public ClassModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterClassModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitClassModifier(this);
		}
	}

	public final ClassModifierContext classModifier() throws RecognitionException {
		ClassModifierContext _localctx = new ClassModifierContext(_ctx, getState());
		enterRule(_localctx, 266, RULE_classModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2558);
			_la = _input.LA(1);
			if ( !(((((_la - 108)) & ~0x3f) == 0 && ((1L << (_la - 108)) & ((1L << (ENUM - 108)) | (1L << (SEALED - 108)) | (1L << (ANNOTATION - 108)) | (1L << (DATA - 108)) | (1L << (INNER - 108)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class MemberModifierContext extends ParserRuleContext {
		public TerminalNode OVERRIDE() { return getToken(KotlinParser.OVERRIDE, 0); }
		public TerminalNode LATEINIT() { return getToken(KotlinParser.LATEINIT, 0); }
		public MemberModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterMemberModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitMemberModifier(this);
		}
	}

	public final MemberModifierContext memberModifier() throws RecognitionException {
		MemberModifierContext _localctx = new MemberModifierContext(_ctx, getState());
		enterRule(_localctx, 268, RULE_memberModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2560);
			_la = _input.LA(1);
			if ( !(_la==OVERRIDE || _la==LATEINIT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class VisibilityModifierContext extends ParserRuleContext {
		public TerminalNode PUBLIC() { return getToken(KotlinParser.PUBLIC, 0); }
		public TerminalNode PRIVATE() { return getToken(KotlinParser.PRIVATE, 0); }
		public TerminalNode INTERNAL() { return getToken(KotlinParser.INTERNAL, 0); }
		public TerminalNode PROTECTED() { return getToken(KotlinParser.PROTECTED, 0); }
		public VisibilityModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_visibilityModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterVisibilityModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitVisibilityModifier(this);
		}
	}

	public final VisibilityModifierContext visibilityModifier() throws RecognitionException {
		VisibilityModifierContext _localctx = new VisibilityModifierContext(_ctx, getState());
		enterRule(_localctx, 270, RULE_visibilityModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2562);
			_la = _input.LA(1);
			if ( !(((((_la - 104)) & ~0x3f) == 0 && ((1L << (_la - 104)) & ((1L << (PUBLIC - 104)) | (1L << (PRIVATE - 104)) | (1L << (PROTECTED - 104)) | (1L << (INTERNAL - 104)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class VarianceAnnotationContext extends ParserRuleContext {
		public TerminalNode IN() { return getToken(KotlinParser.IN, 0); }
		public TerminalNode OUT() { return getToken(KotlinParser.OUT, 0); }
		public VarianceAnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varianceAnnotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterVarianceAnnotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitVarianceAnnotation(this);
		}
	}

	public final VarianceAnnotationContext varianceAnnotation() throws RecognitionException {
		VarianceAnnotationContext _localctx = new VarianceAnnotationContext(_ctx, getState());
		enterRule(_localctx, 272, RULE_varianceAnnotation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2564);
			_la = _input.LA(1);
			if ( !(_la==IN || _la==OUT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class FunctionModifierContext extends ParserRuleContext {
		public TerminalNode TAILREC() { return getToken(KotlinParser.TAILREC, 0); }
		public TerminalNode OPERATOR() { return getToken(KotlinParser.OPERATOR, 0); }
		public TerminalNode INFIX() { return getToken(KotlinParser.INFIX, 0); }
		public TerminalNode INLINE() { return getToken(KotlinParser.INLINE, 0); }
		public TerminalNode EXTERNAL() { return getToken(KotlinParser.EXTERNAL, 0); }
		public TerminalNode SUSPEND() { return getToken(KotlinParser.SUSPEND, 0); }
		public FunctionModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterFunctionModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitFunctionModifier(this);
		}
	}

	public final FunctionModifierContext functionModifier() throws RecognitionException {
		FunctionModifierContext _localctx = new FunctionModifierContext(_ctx, getState());
		enterRule(_localctx, 274, RULE_functionModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2566);
			_la = _input.LA(1);
			if ( !(((((_la - 113)) & ~0x3f) == 0 && ((1L << (_la - 113)) & ((1L << (TAILREC - 113)) | (1L << (OPERATOR - 113)) | (1L << (INLINE - 113)) | (1L << (INFIX - 113)) | (1L << (EXTERNAL - 113)) | (1L << (SUSPEND - 113)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class PropertyModifierContext extends ParserRuleContext {
		public TerminalNode CONST() { return getToken(KotlinParser.CONST, 0); }
		public PropertyModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterPropertyModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitPropertyModifier(this);
		}
	}

	public final PropertyModifierContext propertyModifier() throws RecognitionException {
		PropertyModifierContext _localctx = new PropertyModifierContext(_ctx, getState());
		enterRule(_localctx, 276, RULE_propertyModifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2568);
			match(CONST);
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

	public static class InheritanceModifierContext extends ParserRuleContext {
		public TerminalNode ABSTRACT() { return getToken(KotlinParser.ABSTRACT, 0); }
		public TerminalNode FINAL() { return getToken(KotlinParser.FINAL, 0); }
		public TerminalNode OPEN() { return getToken(KotlinParser.OPEN, 0); }
		public InheritanceModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inheritanceModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterInheritanceModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitInheritanceModifier(this);
		}
	}

	public final InheritanceModifierContext inheritanceModifier() throws RecognitionException {
		InheritanceModifierContext _localctx = new InheritanceModifierContext(_ctx, getState());
		enterRule(_localctx, 278, RULE_inheritanceModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2570);
			_la = _input.LA(1);
			if ( !(((((_la - 120)) & ~0x3f) == 0 && ((1L << (_la - 120)) & ((1L << (ABSTRACT - 120)) | (1L << (FINAL - 120)) | (1L << (OPEN - 120)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class ParameterModifierContext extends ParserRuleContext {
		public TerminalNode VARARG() { return getToken(KotlinParser.VARARG, 0); }
		public TerminalNode NOINLINE() { return getToken(KotlinParser.NOINLINE, 0); }
		public TerminalNode CROSSINLINE() { return getToken(KotlinParser.CROSSINLINE, 0); }
		public ParameterModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterParameterModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitParameterModifier(this);
		}
	}

	public final ParameterModifierContext parameterModifier() throws RecognitionException {
		ParameterModifierContext _localctx = new ParameterModifierContext(_ctx, getState());
		enterRule(_localctx, 280, RULE_parameterModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2572);
			_la = _input.LA(1);
			if ( !(((((_la - 125)) & ~0x3f) == 0 && ((1L << (_la - 125)) & ((1L << (VARARG - 125)) | (1L << (NOINLINE - 125)) | (1L << (CROSSINLINE - 125)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class TypeParameterModifierContext extends ParserRuleContext {
		public TerminalNode REIFIED() { return getToken(KotlinParser.REIFIED, 0); }
		public TypeParameterModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameterModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterTypeParameterModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitTypeParameterModifier(this);
		}
	}

	public final TypeParameterModifierContext typeParameterModifier() throws RecognitionException {
		TypeParameterModifierContext _localctx = new TypeParameterModifierContext(_ctx, getState());
		enterRule(_localctx, 282, RULE_typeParameterModifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2574);
			match(REIFIED);
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

	public static class LabelDefinitionContext extends ParserRuleContext {
		public TerminalNode LabelDefinition() { return getToken(KotlinParser.LabelDefinition, 0); }
		public List<TerminalNode> NL() { return getTokens(KotlinParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(KotlinParser.NL, i);
		}
		public LabelDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labelDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterLabelDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitLabelDefinition(this);
		}
	}

	public final LabelDefinitionContext labelDefinition() throws RecognitionException {
		LabelDefinitionContext _localctx = new LabelDefinitionContext(_ctx, getState());
		enterRule(_localctx, 284, RULE_labelDefinition);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2576);
			match(LabelDefinition);
			setState(2580);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,387,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2577);
					match(NL);
					}
					} 
				}
				setState(2582);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,387,_ctx);
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

	public static class AnnotationsContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public AnnotationListContext annotationList() {
			return getRuleContext(AnnotationListContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(KotlinParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(KotlinParser.NL, i);
		}
		public AnnotationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterAnnotations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitAnnotations(this);
		}
	}

	public final AnnotationsContext annotations() throws RecognitionException {
		AnnotationsContext _localctx = new AnnotationsContext(_ctx, getState());
		enterRule(_localctx, 286, RULE_annotations);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2585);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,388,_ctx) ) {
			case 1:
				{
				setState(2583);
				annotation();
				}
				break;
			case 2:
				{
				setState(2584);
				annotationList();
				}
				break;
			}
			setState(2590);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,389,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2587);
					match(NL);
					}
					} 
				}
				setState(2592);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,389,_ctx);
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

	public static class AnnotationContext extends ParserRuleContext {
		public AnnotationUseSiteTargetContext annotationUseSiteTarget() {
			return getRuleContext(AnnotationUseSiteTargetContext.class,0);
		}
		public TerminalNode COLON() { return getToken(KotlinParser.COLON, 0); }
		public UnescapedAnnotationContext unescapedAnnotation() {
			return getRuleContext(UnescapedAnnotationContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(KotlinParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(KotlinParser.NL, i);
		}
		public TerminalNode LabelReference() { return getToken(KotlinParser.LabelReference, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public ValueArgumentsContext valueArguments() {
			return getRuleContext(ValueArgumentsContext.class,0);
		}
		public AnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterAnnotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitAnnotation(this);
		}
	}

	public final AnnotationContext annotation() throws RecognitionException {
		AnnotationContext _localctx = new AnnotationContext(_ctx, getState());
		enterRule(_localctx, 288, RULE_annotation);
		int _la;
		try {
			setState(2628);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FILE:
			case FIELD:
			case PROPERTY:
			case GET:
			case SET:
			case RECEIVER:
			case PARAM:
			case SETPARAM:
			case DELEGATE:
				enterOuterAlt(_localctx, 1);
				{
				setState(2593);
				annotationUseSiteTarget();
				setState(2597);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(2594);
					match(NL);
					}
					}
					setState(2599);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2600);
				match(COLON);
				setState(2604);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(2601);
					match(NL);
					}
					}
					setState(2606);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2607);
				unescapedAnnotation();
				}
				break;
			case LabelReference:
				enterOuterAlt(_localctx, 2);
				{
				setState(2609);
				match(LabelReference);
				setState(2617);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,393,_ctx) ) {
				case 1:
					{
					setState(2613);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(2610);
						match(NL);
						}
						}
						setState(2615);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2616);
					typeArguments();
					}
					break;
				}
				setState(2626);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,395,_ctx) ) {
				case 1:
					{
					setState(2622);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(2619);
						match(NL);
						}
						}
						setState(2624);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2625);
					valueArguments();
					}
					break;
				}
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

	public static class AnnotationListContext extends ParserRuleContext {
		public AnnotationUseSiteTargetContext annotationUseSiteTarget() {
			return getRuleContext(AnnotationUseSiteTargetContext.class,0);
		}
		public TerminalNode COLON() { return getToken(KotlinParser.COLON, 0); }
		public TerminalNode LSQUARE() { return getToken(KotlinParser.LSQUARE, 0); }
		public TerminalNode RSQUARE() { return getToken(KotlinParser.RSQUARE, 0); }
		public List<UnescapedAnnotationContext> unescapedAnnotation() {
			return getRuleContexts(UnescapedAnnotationContext.class);
		}
		public UnescapedAnnotationContext unescapedAnnotation(int i) {
			return getRuleContext(UnescapedAnnotationContext.class,i);
		}
		public TerminalNode AT() { return getToken(KotlinParser.AT, 0); }
		public AnnotationListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterAnnotationList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitAnnotationList(this);
		}
	}

	public final AnnotationListContext annotationList() throws RecognitionException {
		AnnotationListContext _localctx = new AnnotationListContext(_ctx, getState());
		enterRule(_localctx, 290, RULE_annotationList);
		int _la;
		try {
			setState(2649);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FILE:
			case FIELD:
			case PROPERTY:
			case GET:
			case SET:
			case RECEIVER:
			case PARAM:
			case SETPARAM:
			case DELEGATE:
				enterOuterAlt(_localctx, 1);
				{
				setState(2630);
				annotationUseSiteTarget();
				setState(2631);
				match(COLON);
				setState(2632);
				match(LSQUARE);
				setState(2634); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2633);
					unescapedAnnotation();
					}
					}
					setState(2636); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 58)) & ~0x3f) == 0 && ((1L << (_la - 58)) & ((1L << (IMPORT - 58)) | (1L << (CONSTRUCTOR - 58)) | (1L << (BY - 58)) | (1L << (COMPANION - 58)) | (1L << (INIT - 58)) | (1L << (WHERE - 58)) | (1L << (CATCH - 58)) | (1L << (FINALLY - 58)) | (1L << (OUT - 58)) | (1L << (GETTER - 58)) | (1L << (SETTER - 58)) | (1L << (DYNAMIC - 58)) | (1L << (PUBLIC - 58)) | (1L << (PRIVATE - 58)) | (1L << (PROTECTED - 58)) | (1L << (INTERNAL - 58)) | (1L << (ENUM - 58)) | (1L << (SEALED - 58)) | (1L << (ANNOTATION - 58)) | (1L << (DATA - 58)) | (1L << (INNER - 58)) | (1L << (TAILREC - 58)) | (1L << (OPERATOR - 58)) | (1L << (INLINE - 58)) | (1L << (INFIX - 58)) | (1L << (EXTERNAL - 58)) | (1L << (SUSPEND - 58)) | (1L << (OVERRIDE - 58)) | (1L << (ABSTRACT - 58)) | (1L << (FINAL - 58)))) != 0) || ((((_la - 122)) & ~0x3f) == 0 && ((1L << (_la - 122)) & ((1L << (OPEN - 122)) | (1L << (CONST - 122)) | (1L << (LATEINIT - 122)) | (1L << (VARARG - 122)) | (1L << (NOINLINE - 122)) | (1L << (CROSSINLINE - 122)) | (1L << (REIFIED - 122)) | (1L << (Identifier - 122)))) != 0) );
				setState(2638);
				match(RSQUARE);
				}
				break;
			case AT:
				enterOuterAlt(_localctx, 2);
				{
				setState(2640);
				match(AT);
				setState(2641);
				match(LSQUARE);
				setState(2643); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2642);
					unescapedAnnotation();
					}
					}
					setState(2645); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 58)) & ~0x3f) == 0 && ((1L << (_la - 58)) & ((1L << (IMPORT - 58)) | (1L << (CONSTRUCTOR - 58)) | (1L << (BY - 58)) | (1L << (COMPANION - 58)) | (1L << (INIT - 58)) | (1L << (WHERE - 58)) | (1L << (CATCH - 58)) | (1L << (FINALLY - 58)) | (1L << (OUT - 58)) | (1L << (GETTER - 58)) | (1L << (SETTER - 58)) | (1L << (DYNAMIC - 58)) | (1L << (PUBLIC - 58)) | (1L << (PRIVATE - 58)) | (1L << (PROTECTED - 58)) | (1L << (INTERNAL - 58)) | (1L << (ENUM - 58)) | (1L << (SEALED - 58)) | (1L << (ANNOTATION - 58)) | (1L << (DATA - 58)) | (1L << (INNER - 58)) | (1L << (TAILREC - 58)) | (1L << (OPERATOR - 58)) | (1L << (INLINE - 58)) | (1L << (INFIX - 58)) | (1L << (EXTERNAL - 58)) | (1L << (SUSPEND - 58)) | (1L << (OVERRIDE - 58)) | (1L << (ABSTRACT - 58)) | (1L << (FINAL - 58)))) != 0) || ((((_la - 122)) & ~0x3f) == 0 && ((1L << (_la - 122)) & ((1L << (OPEN - 122)) | (1L << (CONST - 122)) | (1L << (LATEINIT - 122)) | (1L << (VARARG - 122)) | (1L << (NOINLINE - 122)) | (1L << (CROSSINLINE - 122)) | (1L << (REIFIED - 122)) | (1L << (Identifier - 122)))) != 0) );
				setState(2647);
				match(RSQUARE);
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

	public static class AnnotationUseSiteTargetContext extends ParserRuleContext {
		public TerminalNode FIELD() { return getToken(KotlinParser.FIELD, 0); }
		public TerminalNode FILE() { return getToken(KotlinParser.FILE, 0); }
		public TerminalNode PROPERTY() { return getToken(KotlinParser.PROPERTY, 0); }
		public TerminalNode GET() { return getToken(KotlinParser.GET, 0); }
		public TerminalNode SET() { return getToken(KotlinParser.SET, 0); }
		public TerminalNode RECEIVER() { return getToken(KotlinParser.RECEIVER, 0); }
		public TerminalNode PARAM() { return getToken(KotlinParser.PARAM, 0); }
		public TerminalNode SETPARAM() { return getToken(KotlinParser.SETPARAM, 0); }
		public TerminalNode DELEGATE() { return getToken(KotlinParser.DELEGATE, 0); }
		public AnnotationUseSiteTargetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationUseSiteTarget; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterAnnotationUseSiteTarget(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitAnnotationUseSiteTarget(this);
		}
	}

	public final AnnotationUseSiteTargetContext annotationUseSiteTarget() throws RecognitionException {
		AnnotationUseSiteTargetContext _localctx = new AnnotationUseSiteTargetContext(_ctx, getState());
		enterRule(_localctx, 292, RULE_annotationUseSiteTarget);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2651);
			_la = _input.LA(1);
			if ( !(((((_la - 56)) & ~0x3f) == 0 && ((1L << (_la - 56)) & ((1L << (FILE - 56)) | (1L << (FIELD - 56)) | (1L << (PROPERTY - 56)) | (1L << (GET - 56)) | (1L << (SET - 56)) | (1L << (RECEIVER - 56)) | (1L << (PARAM - 56)) | (1L << (SETPARAM - 56)) | (1L << (DELEGATE - 56)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class UnescapedAnnotationContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public ValueArgumentsContext valueArguments() {
			return getRuleContext(ValueArgumentsContext.class,0);
		}
		public UnescapedAnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unescapedAnnotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterUnescapedAnnotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitUnescapedAnnotation(this);
		}
	}

	public final UnescapedAnnotationContext unescapedAnnotation() throws RecognitionException {
		UnescapedAnnotationContext _localctx = new UnescapedAnnotationContext(_ctx, getState());
		enterRule(_localctx, 294, RULE_unescapedAnnotation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2653);
			identifier();
			setState(2655);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LANGLE) {
				{
				setState(2654);
				typeArguments();
				}
			}

			setState(2658);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,401,_ctx) ) {
			case 1:
				{
				setState(2657);
				valueArguments();
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

	public static class IdentifierContext extends ParserRuleContext {
		public List<SimpleIdentifierContext> simpleIdentifier() {
			return getRuleContexts(SimpleIdentifierContext.class);
		}
		public SimpleIdentifierContext simpleIdentifier(int i) {
			return getRuleContext(SimpleIdentifierContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(KotlinParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(KotlinParser.DOT, i);
		}
		public List<TerminalNode> NL() { return getTokens(KotlinParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(KotlinParser.NL, i);
		}
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitIdentifier(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 296, RULE_identifier);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2660);
			simpleIdentifier();
			setState(2671);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,403,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2664);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(2661);
						match(NL);
						}
						}
						setState(2666);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2667);
					match(DOT);
					setState(2668);
					simpleIdentifier();
					}
					} 
				}
				setState(2673);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,403,_ctx);
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

	public static class SimpleIdentifierContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(KotlinParser.Identifier, 0); }
		public TerminalNode ABSTRACT() { return getToken(KotlinParser.ABSTRACT, 0); }
		public TerminalNode ANNOTATION() { return getToken(KotlinParser.ANNOTATION, 0); }
		public TerminalNode BY() { return getToken(KotlinParser.BY, 0); }
		public TerminalNode CATCH() { return getToken(KotlinParser.CATCH, 0); }
		public TerminalNode COMPANION() { return getToken(KotlinParser.COMPANION, 0); }
		public TerminalNode CONSTRUCTOR() { return getToken(KotlinParser.CONSTRUCTOR, 0); }
		public TerminalNode CROSSINLINE() { return getToken(KotlinParser.CROSSINLINE, 0); }
		public TerminalNode DATA() { return getToken(KotlinParser.DATA, 0); }
		public TerminalNode DYNAMIC() { return getToken(KotlinParser.DYNAMIC, 0); }
		public TerminalNode ENUM() { return getToken(KotlinParser.ENUM, 0); }
		public TerminalNode EXTERNAL() { return getToken(KotlinParser.EXTERNAL, 0); }
		public TerminalNode FINAL() { return getToken(KotlinParser.FINAL, 0); }
		public TerminalNode FINALLY() { return getToken(KotlinParser.FINALLY, 0); }
		public TerminalNode GETTER() { return getToken(KotlinParser.GETTER, 0); }
		public TerminalNode IMPORT() { return getToken(KotlinParser.IMPORT, 0); }
		public TerminalNode INFIX() { return getToken(KotlinParser.INFIX, 0); }
		public TerminalNode INIT() { return getToken(KotlinParser.INIT, 0); }
		public TerminalNode INLINE() { return getToken(KotlinParser.INLINE, 0); }
		public TerminalNode INNER() { return getToken(KotlinParser.INNER, 0); }
		public TerminalNode INTERNAL() { return getToken(KotlinParser.INTERNAL, 0); }
		public TerminalNode LATEINIT() { return getToken(KotlinParser.LATEINIT, 0); }
		public TerminalNode NOINLINE() { return getToken(KotlinParser.NOINLINE, 0); }
		public TerminalNode OPEN() { return getToken(KotlinParser.OPEN, 0); }
		public TerminalNode OPERATOR() { return getToken(KotlinParser.OPERATOR, 0); }
		public TerminalNode OUT() { return getToken(KotlinParser.OUT, 0); }
		public TerminalNode OVERRIDE() { return getToken(KotlinParser.OVERRIDE, 0); }
		public TerminalNode PRIVATE() { return getToken(KotlinParser.PRIVATE, 0); }
		public TerminalNode PROTECTED() { return getToken(KotlinParser.PROTECTED, 0); }
		public TerminalNode PUBLIC() { return getToken(KotlinParser.PUBLIC, 0); }
		public TerminalNode REIFIED() { return getToken(KotlinParser.REIFIED, 0); }
		public TerminalNode SEALED() { return getToken(KotlinParser.SEALED, 0); }
		public TerminalNode TAILREC() { return getToken(KotlinParser.TAILREC, 0); }
		public TerminalNode SETTER() { return getToken(KotlinParser.SETTER, 0); }
		public TerminalNode VARARG() { return getToken(KotlinParser.VARARG, 0); }
		public TerminalNode WHERE() { return getToken(KotlinParser.WHERE, 0); }
		public TerminalNode CONST() { return getToken(KotlinParser.CONST, 0); }
		public TerminalNode SUSPEND() { return getToken(KotlinParser.SUSPEND, 0); }
		public SimpleIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterSimpleIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitSimpleIdentifier(this);
		}
	}

	public final SimpleIdentifierContext simpleIdentifier() throws RecognitionException {
		SimpleIdentifierContext _localctx = new SimpleIdentifierContext(_ctx, getState());
		enterRule(_localctx, 298, RULE_simpleIdentifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2674);
			_la = _input.LA(1);
			if ( !(((((_la - 58)) & ~0x3f) == 0 && ((1L << (_la - 58)) & ((1L << (IMPORT - 58)) | (1L << (CONSTRUCTOR - 58)) | (1L << (BY - 58)) | (1L << (COMPANION - 58)) | (1L << (INIT - 58)) | (1L << (WHERE - 58)) | (1L << (CATCH - 58)) | (1L << (FINALLY - 58)) | (1L << (OUT - 58)) | (1L << (GETTER - 58)) | (1L << (SETTER - 58)) | (1L << (DYNAMIC - 58)) | (1L << (PUBLIC - 58)) | (1L << (PRIVATE - 58)) | (1L << (PROTECTED - 58)) | (1L << (INTERNAL - 58)) | (1L << (ENUM - 58)) | (1L << (SEALED - 58)) | (1L << (ANNOTATION - 58)) | (1L << (DATA - 58)) | (1L << (INNER - 58)) | (1L << (TAILREC - 58)) | (1L << (OPERATOR - 58)) | (1L << (INLINE - 58)) | (1L << (INFIX - 58)) | (1L << (EXTERNAL - 58)) | (1L << (SUSPEND - 58)) | (1L << (OVERRIDE - 58)) | (1L << (ABSTRACT - 58)) | (1L << (FINAL - 58)))) != 0) || ((((_la - 122)) & ~0x3f) == 0 && ((1L << (_la - 122)) & ((1L << (OPEN - 122)) | (1L << (CONST - 122)) | (1L << (LATEINIT - 122)) | (1L << (VARARG - 122)) | (1L << (NOINLINE - 122)) | (1L << (CROSSINLINE - 122)) | (1L << (REIFIED - 122)) | (1L << (Identifier - 122)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class SemiContext extends ParserRuleContext {
		public List<TerminalNode> NL() { return getTokens(KotlinParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(KotlinParser.NL, i);
		}
		public TerminalNode SEMICOLON() { return getToken(KotlinParser.SEMICOLON, 0); }
		public SemiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_semi; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterSemi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitSemi(this);
		}
	}

	public final SemiContext semi() throws RecognitionException {
		SemiContext _localctx = new SemiContext(_ctx, getState());
		enterRule(_localctx, 300, RULE_semi);
		try {
			int _alt;
			setState(2688);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,406,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2677); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(2676);
						match(NL);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(2679); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,404,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2681);
				match(SEMICOLON);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2682);
				match(SEMICOLON);
				setState(2684); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(2683);
						match(NL);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(2686); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,405,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	private static final int _serializedATNSegments = 2;
	private static final String _serializedATNSegment0 =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u00ad\u0a85\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\4"+
		"w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\4\177\t\177\4\u0080\t\u0080"+
		"\4\u0081\t\u0081\4\u0082\t\u0082\4\u0083\t\u0083\4\u0084\t\u0084\4\u0085"+
		"\t\u0085\4\u0086\t\u0086\4\u0087\t\u0087\4\u0088\t\u0088\4\u0089\t\u0089"+
		"\4\u008a\t\u008a\4\u008b\t\u008b\4\u008c\t\u008c\4\u008d\t\u008d\4\u008e"+
		"\t\u008e\4\u008f\t\u008f\4\u0090\t\u0090\4\u0091\t\u0091\4\u0092\t\u0092"+
		"\4\u0093\t\u0093\4\u0094\t\u0094\4\u0095\t\u0095\4\u0096\t\u0096\4\u0097"+
		"\t\u0097\4\u0098\t\u0098\3\2\7\2\u0132\n\2\f\2\16\2\u0135\13\2\3\2\5\2"+
		"\u0138\n\2\3\2\3\2\3\2\7\2\u013d\n\2\f\2\16\2\u0140\13\2\3\2\3\2\3\3\7"+
		"\3\u0145\n\3\f\3\16\3\u0148\13\3\3\3\5\3\u014b\n\3\3\3\3\3\3\3\3\3\5\3"+
		"\u0151\n\3\7\3\u0153\n\3\f\3\16\3\u0156\13\3\3\3\3\3\3\4\3\4\3\4\3\4\6"+
		"\4\u015e\n\4\r\4\16\4\u015f\3\4\3\4\3\4\5\4\u0165\n\4\3\4\5\4\u0168\n"+
		"\4\6\4\u016a\n\4\r\4\16\4\u016b\3\5\3\5\3\5\5\5\u0171\n\5\5\5\u0173\n"+
		"\5\3\6\7\6\u0176\n\6\f\6\16\6\u0179\13\6\3\7\3\7\3\7\3\7\3\7\5\7\u0180"+
		"\n\7\3\7\5\7\u0183\n\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\5\t\u018d\n\t\3"+
		"\t\5\t\u0190\n\t\3\n\5\n\u0193\n\n\3\n\3\n\7\n\u0197\n\n\f\n\16\n\u019a"+
		"\13\n\3\n\3\n\7\n\u019e\n\n\f\n\16\n\u01a1\13\n\3\n\5\n\u01a4\n\n\3\n"+
		"\7\n\u01a7\n\n\f\n\16\n\u01aa\13\n\3\n\5\n\u01ad\n\n\3\n\7\n\u01b0\n\n"+
		"\f\n\16\n\u01b3\13\n\3\n\3\n\7\n\u01b7\n\n\f\n\16\n\u01ba\13\n\3\n\5\n"+
		"\u01bd\n\n\3\n\7\n\u01c0\n\n\f\n\16\n\u01c3\13\n\3\n\5\n\u01c6\n\n\3\n"+
		"\7\n\u01c9\n\n\f\n\16\n\u01cc\13\n\3\n\3\n\7\n\u01d0\n\n\f\n\16\n\u01d3"+
		"\13\n\3\n\5\n\u01d6\n\n\3\13\5\13\u01d9\n\13\3\13\3\13\7\13\u01dd\n\13"+
		"\f\13\16\13\u01e0\13\13\5\13\u01e2\n\13\3\13\3\13\3\f\3\f\3\f\3\f\7\f"+
		"\u01ea\n\f\f\f\16\f\u01ed\13\f\5\f\u01ef\n\f\3\f\3\f\3\r\5\r\u01f4\n\r"+
		"\3\r\5\r\u01f7\n\r\3\r\3\r\3\r\3\r\3\r\5\r\u01fe\n\r\3\16\7\16\u0201\n"+
		"\16\f\16\16\16\u0204\13\16\3\16\3\16\7\16\u0208\n\16\f\16\16\16\u020b"+
		"\13\16\3\16\3\16\7\16\u020f\n\16\f\16\16\16\u0212\13\16\3\16\7\16\u0215"+
		"\n\16\f\16\16\16\u0218\13\16\3\17\3\17\3\17\5\17\u021d\n\17\3\20\3\20"+
		"\3\20\3\21\3\21\7\21\u0224\n\21\f\21\16\21\u0227\13\21\3\21\3\21\7\21"+
		"\u022b\n\21\f\21\16\21\u022e\13\21\3\21\3\21\3\22\3\22\7\22\u0234\n\22"+
		"\f\22\16\22\u0237\13\22\3\22\7\22\u023a\n\22\f\22\16\22\u023d\13\22\3"+
		"\22\7\22\u0240\n\22\f\22\16\22\u0243\13\22\3\22\3\22\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\5\23\u024f\n\23\3\23\5\23\u0252\n\23\3\24\3\24"+
		"\7\24\u0256\n\24\f\24\16\24\u0259\13\24\3\24\3\24\3\25\5\25\u025e\n\25"+
		"\3\25\3\25\7\25\u0262\n\25\f\25\16\25\u0265\13\25\3\25\3\25\7\25\u0269"+
		"\n\25\f\25\16\25\u026c\13\25\3\25\3\25\7\25\u0270\n\25\f\25\16\25\u0273"+
		"\13\25\3\25\5\25\u0276\n\25\3\25\7\25\u0279\n\25\f\25\16\25\u027c\13\25"+
		"\3\25\3\25\3\26\3\26\7\26\u0282\n\26\f\26\16\26\u0285\13\26\3\26\3\26"+
		"\3\26\7\26\u028a\n\26\f\26\16\26\u028d\13\26\3\26\5\26\u0290\n\26\3\27"+
		"\3\27\7\27\u0294\n\27\f\27\16\27\u0297\13\27\3\27\5\27\u029a\n\27\3\27"+
		"\7\27\u029d\n\27\f\27\16\27\u02a0\13\27\3\27\3\27\7\27\u02a4\n\27\f\27"+
		"\16\27\u02a7\13\27\3\27\7\27\u02aa\n\27\f\27\16\27\u02ad\13\27\5\27\u02af"+
		"\n\27\3\27\7\27\u02b2\n\27\f\27\16\27\u02b5\13\27\3\27\3\27\3\30\3\30"+
		"\7\30\u02bb\n\30\f\30\16\30\u02be\13\30\6\30\u02c0\n\30\r\30\16\30\u02c1"+
		"\3\30\5\30\u02c5\n\30\3\31\3\31\7\31\u02c9\n\31\f\31\16\31\u02cc\13\31"+
		"\3\31\5\31\u02cf\n\31\3\31\7\31\u02d2\n\31\f\31\16\31\u02d5\13\31\3\31"+
		"\5\31\u02d8\n\31\3\31\7\31\u02db\n\31\f\31\16\31\u02de\13\31\3\31\5\31"+
		"\u02e1\n\31\3\32\5\32\u02e4\n\32\3\32\3\32\7\32\u02e8\n\32\f\32\16\32"+
		"\u02eb\13\32\3\32\3\32\7\32\u02ef\n\32\f\32\16\32\u02f2\13\32\3\32\3\32"+
		"\5\32\u02f6\n\32\3\32\7\32\u02f9\n\32\f\32\16\32\u02fc\13\32\3\32\5\32"+
		"\u02ff\n\32\3\32\7\32\u0302\n\32\f\32\16\32\u0305\13\32\3\32\5\32\u0308"+
		"\n\32\3\32\7\32\u030b\n\32\f\32\16\32\u030e\13\32\3\32\3\32\7\32\u0312"+
		"\n\32\f\32\16\32\u0315\13\32\3\32\3\32\7\32\u0319\n\32\f\32\16\32\u031c"+
		"\13\32\3\32\5\32\u031f\n\32\3\32\7\32\u0322\n\32\f\32\16\32\u0325\13\32"+
		"\3\32\5\32\u0328\n\32\3\32\7\32\u032b\n\32\f\32\16\32\u032e\13\32\3\32"+
		"\5\32\u0331\n\32\3\33\3\33\3\33\3\33\7\33\u0337\n\33\f\33\16\33\u033a"+
		"\13\33\5\33\u033c\n\33\3\33\3\33\3\34\5\34\u0341\n\34\3\34\3\34\3\34\5"+
		"\34\u0346\n\34\3\35\3\35\3\35\3\35\3\36\3\36\3\36\7\36\u034f\n\36\f\36"+
		"\16\36\u0352\13\36\3\36\5\36\u0355\n\36\3\37\5\37\u0358\n\37\3\37\3\37"+
		"\7\37\u035c\n\37\f\37\16\37\u035f\13\37\3\37\3\37\7\37\u0363\n\37\f\37"+
		"\16\37\u0366\13\37\3\37\5\37\u0369\n\37\3\37\7\37\u036c\n\37\f\37\16\37"+
		"\u036f\13\37\3\37\3\37\7\37\u0373\n\37\f\37\16\37\u0376\13\37\3\37\5\37"+
		"\u0379\n\37\3\37\7\37\u037c\n\37\f\37\16\37\u037f\13\37\3\37\5\37\u0382"+
		"\n\37\3 \5 \u0385\n \3 \3 \7 \u0389\n \f \16 \u038c\13 \3 \5 \u038f\n"+
		" \3 \3 \7 \u0393\n \f \16 \u0396\13 \3 \5 \u0399\n \3 \7 \u039c\n \f "+
		"\16 \u039f\13 \3 \3 \7 \u03a3\n \f \16 \u03a6\13 \3 \5 \u03a9\n \3 \7"+
		" \u03ac\n \f \16 \u03af\13 \3 \5 \u03b2\n \3!\5!\u03b5\n!\3!\3!\7!\u03b9"+
		"\n!\f!\16!\u03bc\13!\3!\5!\u03bf\n!\3!\7!\u03c2\n!\f!\16!\u03c5\13!\3"+
		"!\3!\7!\u03c9\n!\f!\16!\u03cc\13!\3!\3!\5!\u03d0\n!\3!\7!\u03d3\n!\f!"+
		"\16!\u03d6\13!\3!\3!\5!\u03da\n!\3!\7!\u03dd\n!\f!\16!\u03e0\13!\3!\5"+
		"!\u03e3\n!\3!\7!\u03e6\n!\f!\16!\u03e9\13!\3!\3!\7!\u03ed\n!\f!\16!\u03f0"+
		"\13!\3!\5!\u03f3\n!\3!\5!\u03f6\n!\3!\5!\u03f9\n!\3!\7!\u03fc\n!\f!\16"+
		"!\u03ff\13!\3!\5!\u0402\n!\3!\5!\u0405\n!\3!\7!\u0408\n!\f!\16!\u040b"+
		"\13!\3!\5!\u040e\n!\5!\u0410\n!\3\"\3\"\3\"\3\"\7\"\u0416\n\"\f\"\16\""+
		"\u0419\13\"\3\"\3\"\3#\3#\3#\5#\u0420\n#\3$\5$\u0423\n$\3$\3$\5$\u0427"+
		"\n$\3$\3$\7$\u042b\n$\f$\16$\u042e\13$\3$\3$\3$\7$\u0433\n$\f$\16$\u0436"+
		"\13$\3$\3$\7$\u043a\n$\f$\16$\u043d\13$\3$\5$\u0440\n$\3$\7$\u0443\n$"+
		"\f$\16$\u0446\13$\3$\3$\3$\7$\u044b\n$\f$\16$\u044e\13$\3$\5$\u0451\n"+
		"$\5$\u0453\n$\3%\5%\u0456\n%\3%\3%\5%\u045a\n%\3%\3%\7%\u045e\n%\f%\16"+
		"%\u0461\13%\3%\3%\3%\7%\u0466\n%\f%\16%\u0469\13%\3%\3%\5%\u046d\n%\3"+
		"%\3%\7%\u0471\n%\f%\16%\u0474\13%\3%\3%\5%\u0478\n%\3&\5&\u047b\n&\3&"+
		"\3&\7&\u047f\n&\f&\16&\u0482\13&\3&\3&\7&\u0486\n&\f&\16&\u0489\13&\3"+
		"&\5&\u048c\n&\3&\7&\u048f\n&\f&\16&\u0492\13&\3&\3&\7&\u0496\n&\f&\16"+
		"&\u0499\13&\3&\3&\3\'\3\'\7\'\u049f\n\'\f\'\16\'\u04a2\13\'\3\'\3\'\7"+
		"\'\u04a6\n\'\f\'\16\'\u04a9\13\'\3\'\3\'\7\'\u04ad\n\'\f\'\16\'\u04b0"+
		"\13\'\3\'\7\'\u04b3\n\'\f\'\16\'\u04b6\13\'\3\'\7\'\u04b9\n\'\f\'\16\'"+
		"\u04bc\13\'\3\'\3\'\3(\5(\u04c1\n(\3(\7(\u04c4\n(\f(\16(\u04c7\13(\3("+
		"\3(\7(\u04cb\n(\f(\16(\u04ce\13(\3(\3(\7(\u04d2\n(\f(\16(\u04d5\13(\3"+
		"(\5(\u04d8\n(\3)\5)\u04db\n)\3)\3)\3)\3)\3)\5)\u04e2\n)\3*\3*\3*\7*\u04e7"+
		"\n*\f*\16*\u04ea\13*\6*\u04ec\n*\r*\16*\u04ed\3+\3+\3+\3+\3,\3,\5,\u04f6"+
		"\n,\3,\7,\u04f9\n,\f,\16,\u04fc\13,\3,\6,\u04ff\n,\r,\16,\u0500\3-\3-"+
		"\3-\3-\3-\3-\5-\u0509\n-\3.\3.\7.\u050d\n.\f.\16.\u0510\13.\3.\3.\7.\u0514"+
		"\n.\f.\16.\u0517\13.\5.\u0519\n.\3.\3.\7.\u051d\n.\f.\16.\u0520\13.\3"+
		".\3.\7.\u0524\n.\f.\16.\u0527\13.\3.\5.\u052a\n.\3/\3/\3/\5/\u052f\n/"+
		"\3\60\3\60\7\60\u0533\n\60\f\60\16\60\u0536\13\60\3\60\3\60\7\60\u053a"+
		"\n\60\f\60\16\60\u053d\13\60\3\60\7\60\u0540\n\60\f\60\16\60\u0543\13"+
		"\60\3\61\3\61\7\61\u0547\n\61\f\61\16\61\u054a\13\61\3\61\5\61\u054d\n"+
		"\61\3\62\3\62\3\62\5\62\u0552\n\62\3\62\3\62\3\62\5\62\u0557\n\62\7\62"+
		"\u0559\n\62\f\62\16\62\u055c\13\62\3\62\3\62\3\63\3\63\7\63\u0562\n\63"+
		"\f\63\16\63\u0565\13\63\3\63\3\63\7\63\u0569\n\63\f\63\16\63\u056c\13"+
		"\63\3\63\3\63\7\63\u0570\n\63\f\63\16\63\u0573\13\63\3\63\7\63\u0576\n"+
		"\63\f\63\16\63\u0579\13\63\3\64\7\64\u057c\n\64\f\64\16\64\u057f\13\64"+
		"\3\64\3\64\7\64\u0583\n\64\f\64\16\64\u0586\13\64\3\64\3\64\7\64\u058a"+
		"\n\64\f\64\16\64\u058d\13\64\3\64\3\64\3\65\3\65\7\65\u0593\n\65\f\65"+
		"\16\65\u0596\13\65\3\65\3\65\3\65\7\65\u059b\n\65\f\65\16\65\u059e\13"+
		"\65\3\65\3\65\5\65\u05a2\n\65\5\65\u05a4\n\65\3\65\7\65\u05a7\n\65\f\65"+
		"\16\65\u05aa\13\65\3\65\3\65\3\66\3\66\3\66\7\66\u05b1\n\66\f\66\16\66"+
		"\u05b4\13\66\3\66\3\66\5\66\u05b8\n\66\5\66\u05ba\n\66\3\67\3\67\3\67"+
		"\5\67\u05bf\n\67\38\78\u05c2\n8\f8\168\u05c5\138\38\38\38\38\58\u05cb"+
		"\n8\39\39\39\79\u05d0\n9\f9\169\u05d3\139\39\39\3:\3:\3;\3;\7;\u05db\n"+
		";\f;\16;\u05de\13;\3;\3;\7;\u05e2\n;\f;\16;\u05e5\13;\3;\7;\u05e8\n;\f"+
		";\16;\u05eb\13;\3<\3<\7<\u05ef\n<\f<\16<\u05f2\13<\3<\3<\7<\u05f6\n<\f"+
		"<\16<\u05f9\13<\3<\7<\u05fc\n<\f<\16<\u05ff\13<\3=\3=\3=\7=\u0604\n=\f"+
		"=\16=\u0607\13=\3=\3=\7=\u060b\n=\f=\16=\u060e\13=\3>\3>\3>\7>\u0613\n"+
		">\f>\16>\u0616\13>\3>\3>\5>\u061a\n>\3?\3?\3?\7?\u061f\n?\f?\16?\u0622"+
		"\13?\3?\3?\7?\u0626\n?\f?\16?\u0629\13?\3?\3?\3?\7?\u062e\n?\f?\16?\u0631"+
		"\13?\3?\3?\5?\u0635\n?\5?\u0637\n?\3@\3@\7@\u063b\n@\f@\16@\u063e\13@"+
		"\3@\3@\7@\u0642\n@\f@\16@\u0645\13@\3@\7@\u0648\n@\f@\16@\u064b\13@\3"+
		"A\3A\3A\7A\u0650\nA\fA\16A\u0653\13A\3A\3A\7A\u0657\nA\fA\16A\u065a\13"+
		"A\3B\3B\3B\7B\u065f\nB\fB\16B\u0662\13B\3B\7B\u0665\nB\fB\16B\u0668\13"+
		"B\3C\3C\3C\7C\u066d\nC\fC\16C\u0670\13C\3C\3C\7C\u0674\nC\fC\16C\u0677"+
		"\13C\3D\3D\3D\7D\u067c\nD\fD\16D\u067f\13D\3D\3D\7D\u0683\nD\fD\16D\u0686"+
		"\13D\3E\3E\5E\u068a\nE\3F\7F\u068d\nF\fF\16F\u0690\13F\3F\3F\7F\u0694"+
		"\nF\fF\16F\u0697\13F\3F\3F\5F\u069b\nF\3G\7G\u069e\nG\fG\16G\u06a1\13"+
		"G\3G\3G\7G\u06a5\nG\fG\16G\u06a8\13G\3G\5G\u06ab\nG\3H\3H\3H\3H\3H\3H"+
		"\7H\u06b3\nH\fH\16H\u06b6\13H\3H\3H\3H\3H\6H\u06bc\nH\rH\16H\u06bd\3H"+
		"\5H\u06c1\nH\3I\3I\5I\u06c5\nI\3I\5I\u06c8\nI\3I\7I\u06cb\nI\fI\16I\u06ce"+
		"\13I\3J\3J\3J\3K\3K\7K\u06d5\nK\fK\16K\u06d8\13K\3K\3K\3K\6K\u06dd\nK"+
		"\rK\16K\u06de\3L\3L\5L\u06e3\nL\3M\3M\5M\u06e7\nM\3N\3N\6N\u06eb\nN\r"+
		"N\16N\u06ec\3O\5O\u06f0\nO\3O\3O\7O\u06f4\nO\fO\16O\u06f7\13O\3O\3O\7"+
		"O\u06fb\nO\fO\16O\u06fe\13O\5O\u0700\nO\3P\7P\u0703\nP\fP\16P\u0706\13"+
		"P\3P\5P\u0709\nP\3P\7P\u070c\nP\fP\16P\u070f\13P\3P\3P\3Q\3Q\3Q\3Q\7Q"+
		"\u0717\nQ\fQ\16Q\u071a\13Q\5Q\u071c\nQ\3Q\3Q\3R\3R\5R\u0722\nR\3R\3R\3"+
		"R\3R\3R\7R\u0729\nR\fR\16R\u072c\13R\3R\3R\5R\u0730\nR\3S\3S\7S\u0734"+
		"\nS\fS\16S\u0737\13S\3S\3S\7S\u073b\nS\fS\16S\u073e\13S\3S\3S\7S\u0742"+
		"\nS\fS\16S\u0745\13S\3S\7S\u0748\nS\fS\16S\u074b\13S\3S\3S\3T\5T\u0750"+
		"\nT\3T\3T\5T\u0754\nT\3U\6U\u0757\nU\rU\16U\u0758\3V\3V\7V\u075d\nV\f"+
		"V\16V\u0760\13V\3V\3V\7V\u0764\nV\fV\16V\u0767\13V\5V\u0769\nV\3V\5V\u076c"+
		"\nV\3V\7V\u076f\nV\fV\16V\u0772\13V\3V\3V\3W\3W\3W\3W\3W\3W\3W\3W\3W\3"+
		"W\3W\3W\5W\u0782\nW\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\5X\u0791\n"+
		"X\3Y\3Y\3Y\3Y\3Z\3Z\3[\3[\5[\u079b\n[\3\\\3\\\3\\\7\\\u07a0\n\\\f\\\16"+
		"\\\u07a3\13\\\3\\\3\\\3]\3]\3]\3]\3]\7]\u07ac\n]\f]\16]\u07af\13]\3]\3"+
		"]\3^\3^\3_\3_\3_\3_\3`\3`\3a\3a\3a\3a\3b\7b\u07c0\nb\fb\16b\u07c3\13b"+
		"\3b\3b\7b\u07c7\nb\fb\16b\u07ca\13b\3b\3b\7b\u07ce\nb\fb\16b\u07d1\13"+
		"b\3b\3b\3b\3b\7b\u07d7\nb\fb\16b\u07da\13b\3b\3b\7b\u07de\nb\fb\16b\u07e1"+
		"\13b\3b\3b\7b\u07e5\nb\fb\16b\u07e8\13b\3b\3b\7b\u07ec\nb\fb\16b\u07ef"+
		"\13b\3b\3b\5b\u07f3\nb\3c\5c\u07f6\nc\3c\7c\u07f9\nc\fc\16c\u07fc\13c"+
		"\3c\3c\7c\u0800\nc\fc\16c\u0803\13c\3c\7c\u0806\nc\fc\16c\u0809\13c\3"+
		"d\3d\3d\7d\u080e\nd\fd\16d\u0811\13d\3d\3d\7d\u0815\nd\fd\16d\u0818\13"+
		"d\3d\5d\u081b\nd\5d\u081d\nd\3e\3e\7e\u0821\ne\fe\16e\u0824\13e\3e\3e"+
		"\7e\u0828\ne\fe\16e\u082b\13e\3e\5e\u082e\ne\3e\7e\u0831\ne\fe\16e\u0834"+
		"\13e\3e\3e\3f\3f\5f\u083a\nf\3f\3f\7f\u083e\nf\ff\16f\u0841\13f\3f\3f"+
		"\3g\3g\5g\u0847\ng\3h\3h\3h\7h\u084c\nh\fh\16h\u084f\13h\3h\3h\7h\u0853"+
		"\nh\fh\16h\u0856\13h\3h\3h\5h\u085a\nh\3h\5h\u085d\nh\3i\3i\5i\u0861\n"+
		"i\3j\3j\7j\u0865\nj\fj\16j\u0868\13j\3j\3j\3j\3j\7j\u086e\nj\fj\16j\u0871"+
		"\13j\3j\5j\u0874\nj\3j\5j\u0877\nj\3j\7j\u087a\nj\fj\16j\u087d\13j\3j"+
		"\3j\7j\u0881\nj\fj\16j\u0884\13j\3j\5j\u0887\nj\5j\u0889\nj\3k\3k\5k\u088d"+
		"\nk\3l\3l\7l\u0891\nl\fl\16l\u0894\13l\3l\3l\3l\3l\5l\u089a\nl\3l\7l\u089d"+
		"\nl\fl\16l\u08a0\13l\3l\3l\7l\u08a4\nl\fl\16l\u08a7\13l\3l\3l\7l\u08ab"+
		"\nl\fl\16l\u08ae\13l\7l\u08b0\nl\fl\16l\u08b3\13l\3l\7l\u08b6\nl\fl\16"+
		"l\u08b9\13l\3l\3l\3m\3m\7m\u08bf\nm\fm\16m\u08c2\13m\3m\3m\7m\u08c6\n"+
		"m\fm\16m\u08c9\13m\3m\7m\u08cc\nm\fm\16m\u08cf\13m\3m\7m\u08d2\nm\fm\16"+
		"m\u08d5\13m\3m\3m\7m\u08d9\nm\fm\16m\u08dc\13m\3m\3m\5m\u08e0\nm\3m\3"+
		"m\7m\u08e4\nm\fm\16m\u08e7\13m\3m\3m\7m\u08eb\nm\fm\16m\u08ee\13m\3m\5"+
		"m\u08f1\nm\3n\3n\3n\5n\u08f6\nn\3o\3o\7o\u08fa\no\fo\16o\u08fd\13o\3o"+
		"\3o\3p\3p\7p\u0903\np\fp\16p\u0906\13p\3p\3p\3q\3q\7q\u090c\nq\fq\16q"+
		"\u090f\13q\3q\3q\7q\u0913\nq\fq\16q\u0916\13q\3q\7q\u0919\nq\fq\16q\u091c"+
		"\13q\3q\7q\u091f\nq\fq\16q\u0922\13q\3q\5q\u0925\nq\3r\3r\7r\u0929\nr"+
		"\fr\16r\u092c\13r\3r\3r\7r\u0930\nr\fr\16r\u0933\13r\3r\3r\3r\3r\3r\7"+
		"r\u093a\nr\fr\16r\u093d\13r\3r\3r\3s\3s\7s\u0943\ns\fs\16s\u0946\13s\3"+
		"s\3s\3t\3t\3t\5t\u094d\nt\3u\3u\7u\u0951\nu\fu\16u\u0954\13u\3u\3u\7u"+
		"\u0958\nu\fu\16u\u095b\13u\3u\3u\5u\u095f\nu\3u\3u\3u\3u\7u\u0965\nu\f"+
		"u\16u\u0968\13u\3u\5u\u096b\nu\3v\3v\7v\u096f\nv\fv\16v\u0972\13v\3v\3"+
		"v\3v\3v\7v\u0978\nv\fv\16v\u097b\13v\3v\5v\u097e\nv\3w\3w\7w\u0982\nw"+
		"\fw\16w\u0985\13w\3w\5w\u0988\nw\3w\7w\u098b\nw\fw\16w\u098e\13w\3w\3"+
		"w\7w\u0992\nw\fw\16w\u0995\13w\3w\3w\3w\3w\3x\3x\7x\u099d\nx\fx\16x\u09a0"+
		"\13x\3x\3x\3x\5x\u09a5\nx\3x\3x\3x\3x\5x\u09ab\nx\3y\3y\3y\7y\u09b0\n"+
		"y\fy\16y\u09b3\13y\7y\u09b5\ny\fy\16y\u09b8\13y\5y\u09ba\ny\3y\7y\u09bd"+
		"\ny\fy\16y\u09c0\13y\3y\3y\7y\u09c4\ny\fy\16y\u09c7\13y\3y\3y\5y\u09cb"+
		"\ny\3z\3z\3{\3{\3|\3|\3}\3}\3~\3~\3\177\3\177\3\u0080\3\u0080\3\u0081"+
		"\3\u0081\3\u0082\3\u0082\3\u0083\3\u0083\3\u0083\3\u0083\5\u0083\u09e3"+
		"\n\u0083\3\u0084\3\u0084\3\u0084\5\u0084\u09e8\n\u0084\3\u0085\3\u0085"+
		"\6\u0085\u09ec\n\u0085\r\u0085\16\u0085\u09ed\3\u0086\3\u0086\3\u0086"+
		"\3\u0086\3\u0086\3\u0086\3\u0086\3\u0086\3\u0086\5\u0086\u09f9\n\u0086"+
		"\3\u0086\7\u0086\u09fc\n\u0086\f\u0086\16\u0086\u09ff\13\u0086\3\u0087"+
		"\3\u0087\3\u0088\3\u0088\3\u0089\3\u0089\3\u008a\3\u008a\3\u008b\3\u008b"+
		"\3\u008c\3\u008c\3\u008d\3\u008d\3\u008e\3\u008e\3\u008f\3\u008f\3\u0090"+
		"\3\u0090\7\u0090\u0a15\n\u0090\f\u0090\16\u0090\u0a18\13\u0090\3\u0091"+
		"\3\u0091\5\u0091\u0a1c\n\u0091\3\u0091\7\u0091\u0a1f\n\u0091\f\u0091\16"+
		"\u0091\u0a22\13\u0091\3\u0092\3\u0092\7\u0092\u0a26\n\u0092\f\u0092\16"+
		"\u0092\u0a29\13\u0092\3\u0092\3\u0092\7\u0092\u0a2d\n\u0092\f\u0092\16"+
		"\u0092\u0a30\13\u0092\3\u0092\3\u0092\3\u0092\3\u0092\7\u0092\u0a36\n"+
		"\u0092\f\u0092\16\u0092\u0a39\13\u0092\3\u0092\5\u0092\u0a3c\n\u0092\3"+
		"\u0092\7\u0092\u0a3f\n\u0092\f\u0092\16\u0092\u0a42\13\u0092\3\u0092\5"+
		"\u0092\u0a45\n\u0092\5\u0092\u0a47\n\u0092\3\u0093\3\u0093\3\u0093\3\u0093"+
		"\6\u0093\u0a4d\n\u0093\r\u0093\16\u0093\u0a4e\3\u0093\3\u0093\3\u0093"+
		"\3\u0093\3\u0093\6\u0093\u0a56\n\u0093\r\u0093\16\u0093\u0a57\3\u0093"+
		"\3\u0093\5\u0093\u0a5c\n\u0093\3\u0094\3\u0094\3\u0095\3\u0095\5\u0095"+
		"\u0a62\n\u0095\3\u0095\5\u0095\u0a65\n\u0095\3\u0096\3\u0096\7\u0096\u0a69"+
		"\n\u0096\f\u0096\16\u0096\u0a6c\13\u0096\3\u0096\3\u0096\7\u0096\u0a70"+
		"\n\u0096\f\u0096\16\u0096\u0a73\13\u0096\3\u0097\3\u0097\3\u0098\6\u0098"+
		"\u0a78\n\u0098\r\u0098\16\u0098\u0a79\3\u0098\3\u0098\3\u0098\6\u0098"+
		"\u0a7f\n\u0098\r\u0098\16\u0098\u0a80\5\u0098\u0a83\n\u0098\3\u0098\2"+
		"\2\u0099\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668"+
		":<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a"+
		"\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2"+
		"\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba"+
		"\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2"+
		"\u00d4\u00d6\u00d8\u00da\u00dc\u00de\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea"+
		"\u00ec\u00ee\u00f0\u00f2\u00f4\u00f6\u00f8\u00fa\u00fc\u00fe\u0100\u0102"+
		"\u0104\u0106\u0108\u010a\u010c\u010e\u0110\u0112\u0114\u0116\u0118\u011a"+
		"\u011c\u011e\u0120\u0122\u0124\u0126\u0128\u012a\u012c\u012e\2\34\3\2"+
		"=>\3\2AB\4\2\35\35EE\5\2\u0085\u0085\u0088\u008d\u0093\u0093\3\2\u009f"+
		"\u00a1\3\2\u00a5\u00a7\4\2\67\67VV\3\2&\'\3\2\35\"\4\2\61\62\64\65\3\2"+
		"-\60\4\2[[]]\4\2ZZ\\\\\3\2\24\25\3\2\21\23\5\2\33\33\63\63YY\4\2\24\27"+
		"\32\32\3\2nr\4\2yy~~\3\2jm\4\2[[^^\3\2sx\3\2z|\3\2\177\u0081\5\2::_be"+
		"h\n\2<<DGKKPQ^^cdi\u0082\u008f\u008f\2\u0bc4\2\u0133\3\2\2\2\4\u0146\3"+
		"\2\2\2\6\u0169\3\2\2\2\b\u0172\3\2\2\2\n\u0177\3\2\2\2\f\u017a\3\2\2\2"+
		"\16\u0184\3\2\2\2\20\u018c\3\2\2\2\22\u0192\3\2\2\2\24\u01d8\3\2\2\2\26"+
		"\u01e5\3\2\2\2\30\u01f3\3\2\2\2\32\u0202\3\2\2\2\34\u021c\3\2\2\2\36\u021e"+
		"\3\2\2\2 \u0221\3\2\2\2\"\u0231\3\2\2\2$\u024e\3\2\2\2&\u0253\3\2\2\2"+
		"(\u025d\3\2\2\2*\u028f\3\2\2\2,\u0291\3\2\2\2.\u02bf\3\2\2\2\60\u02c6"+
		"\3\2\2\2\62\u02e3\3\2\2\2\64\u0332\3\2\2\2\66\u0340\3\2\2\28\u0347\3\2"+
		"\2\2:\u0354\3\2\2\2<\u0357\3\2\2\2>\u0384\3\2\2\2@\u03b4\3\2\2\2B\u0411"+
		"\3\2\2\2D\u041c\3\2\2\2F\u0452\3\2\2\2H\u0477\3\2\2\2J\u047a\3\2\2\2L"+
		"\u049c\3\2\2\2N\u04c0\3\2\2\2P\u04da\3\2\2\2R\u04eb\3\2\2\2T\u04ef\3\2"+
		"\2\2V\u04f5\3\2\2\2X\u0508\3\2\2\2Z\u0518\3\2\2\2\\\u052e\3\2\2\2^\u0530"+
		"\3\2\2\2`\u0544\3\2\2\2b\u054e\3\2\2\2d\u055f\3\2\2\2f\u057d\3\2\2\2h"+
		"\u0590\3\2\2\2j\u05b9\3\2\2\2l\u05be\3\2\2\2n\u05c3\3\2\2\2p\u05cc\3\2"+
		"\2\2r\u05d6\3\2\2\2t\u05d8\3\2\2\2v\u05ec\3\2\2\2x\u0600\3\2\2\2z\u060f"+
		"\3\2\2\2|\u0636\3\2\2\2~\u0638\3\2\2\2\u0080\u064c\3\2\2\2\u0082\u065b"+
		"\3\2\2\2\u0084\u0669\3\2\2\2\u0086\u0678\3\2\2\2\u0088\u0687\3\2\2\2\u008a"+
		"\u068e\3\2\2\2\u008c\u06aa\3\2\2\2\u008e\u06c0\3\2\2\2\u0090\u06c2\3\2"+
		"\2\2\u0092\u06cf\3\2\2\2\u0094\u06d2\3\2\2\2\u0096\u06e2\3\2\2\2\u0098"+
		"\u06e6\3\2\2\2\u009a\u06e8\3\2\2\2\u009c\u06ff\3\2\2\2\u009e\u0704\3\2"+
		"\2\2\u00a0\u0712\3\2\2\2\u00a2\u072f\3\2\2\2\u00a4\u0731\3\2\2\2\u00a6"+
		"\u0753\3\2\2\2\u00a8\u0756\3\2\2\2\u00aa\u0768\3\2\2\2\u00ac\u0781\3\2"+
		"\2\2\u00ae\u0790\3\2\2\2\u00b0\u0792\3\2\2\2\u00b2\u0796\3\2\2\2\u00b4"+
		"\u079a\3\2\2\2\u00b6\u079c\3\2\2\2\u00b8\u07a6\3\2\2\2\u00ba\u07b2\3\2"+
		"\2\2\u00bc\u07b4\3\2\2\2\u00be\u07b8\3\2\2\2\u00c0\u07ba\3\2\2\2\u00c2"+
		"\u07c1\3\2\2\2\u00c4\u07f5\3\2\2\2\u00c6\u081c\3\2\2\2\u00c8\u081e\3\2"+
		"\2\2\u00ca\u0837\3\2\2\2\u00cc\u0844\3\2\2\2\u00ce\u0848\3\2\2\2\u00d0"+
		"\u0860\3\2\2\2\u00d2\u0862\3\2\2\2\u00d4\u088c\3\2\2\2\u00d6\u088e\3\2"+
		"\2\2\u00d8\u08f0\3\2\2\2\u00da\u08f5\3\2\2\2\u00dc\u08f7\3\2\2\2\u00de"+
		"\u0900\3\2\2\2\u00e0\u0909\3\2\2\2\u00e2\u0926\3\2\2\2\u00e4\u0940\3\2"+
		"\2\2\u00e6\u094c\3\2\2\2\u00e8\u094e\3\2\2\2\u00ea\u096c\3\2\2\2\u00ec"+
		"\u097f\3\2\2\2\u00ee\u09aa\3\2\2\2\u00f0\u09b9\3\2\2\2\u00f2\u09cc\3\2"+
		"\2\2\u00f4\u09ce\3\2\2\2\u00f6\u09d0\3\2\2\2\u00f8\u09d2\3\2\2\2\u00fa"+
		"\u09d4\3\2\2\2\u00fc\u09d6\3\2\2\2\u00fe\u09d8\3\2\2\2\u0100\u09da\3\2"+
		"\2\2\u0102\u09dc\3\2\2\2\u0104\u09e2\3\2\2\2\u0106\u09e7\3\2\2\2\u0108"+
		"\u09eb\3\2\2\2\u010a\u09f8\3\2\2\2\u010c\u0a00\3\2\2\2\u010e\u0a02\3\2"+
		"\2\2\u0110\u0a04\3\2\2\2\u0112\u0a06\3\2\2\2\u0114\u0a08\3\2\2\2\u0116"+
		"\u0a0a\3\2\2\2\u0118\u0a0c\3\2\2\2\u011a\u0a0e\3\2\2\2\u011c\u0a10\3\2"+
		"\2\2\u011e\u0a12\3\2\2\2\u0120\u0a1b\3\2\2\2\u0122\u0a46\3\2\2\2\u0124"+
		"\u0a5b\3\2\2\2\u0126\u0a5d\3\2\2\2\u0128\u0a5f\3\2\2\2\u012a\u0a66\3\2"+
		"\2\2\u012c\u0a74\3\2\2\2\u012e\u0a82\3\2\2\2\u0130\u0132\7\7\2\2\u0131"+
		"\u0130\3\2\2\2\u0132\u0135\3\2\2\2\u0133\u0131\3\2\2\2\u0133\u0134\3\2"+
		"\2\2\u0134\u0137\3\2\2\2\u0135\u0133\3\2\2\2\u0136\u0138\5\6\4\2\u0137"+
		"\u0136\3\2\2\2\u0137\u0138\3\2\2\2\u0138\u0139\3\2\2\2\u0139\u013a\5\b"+
		"\5\2\u013a\u013e\5\n\6\2\u013b\u013d\5\20\t\2\u013c\u013b\3\2\2\2\u013d"+
		"\u0140\3\2\2\2\u013e\u013c\3\2\2\2\u013e\u013f\3\2\2\2\u013f\u0141\3\2"+
		"\2\2\u0140\u013e\3\2\2\2\u0141\u0142\7\2\2\3\u0142\3\3\2\2\2\u0143\u0145"+
		"\7\7\2\2\u0144\u0143\3\2\2\2\u0145\u0148\3\2\2\2\u0146\u0144\3\2\2\2\u0146"+
		"\u0147\3\2\2\2\u0147\u014a\3\2\2\2\u0148\u0146\3\2\2\2\u0149\u014b\5\6"+
		"\4\2\u014a\u0149\3\2\2\2\u014a\u014b\3\2\2\2\u014b\u014c\3\2\2\2\u014c"+
		"\u014d\5\b\5\2\u014d\u0154\5\n\6\2\u014e\u0150\5r:\2\u014f\u0151\5\u012e"+
		"\u0098\2\u0150\u014f\3\2\2\2\u0150\u0151\3\2\2\2\u0151\u0153\3\2\2\2\u0152"+
		"\u014e\3\2\2\2\u0153\u0156\3\2\2\2\u0154\u0152\3\2\2\2\u0154\u0155\3\2"+
		"\2\2\u0155\u0157\3\2\2\2\u0156\u0154\3\2\2\2\u0157\u0158\7\2\2\3\u0158"+
		"\5\3\2\2\2\u0159\u015a\7:\2\2\u015a\u0164\7\33\2\2\u015b\u015d\7\r\2\2"+
		"\u015c\u015e\5\u0128\u0095\2\u015d\u015c\3\2\2\2\u015e\u015f\3\2\2\2\u015f"+
		"\u015d\3\2\2\2\u015f\u0160\3\2\2\2\u0160\u0161\3\2\2\2\u0161\u0162\7\16"+
		"\2\2\u0162\u0165\3\2\2\2\u0163\u0165\5\u0128\u0095\2\u0164\u015b\3\2\2"+
		"\2\u0164\u0163\3\2\2\2\u0165\u0167\3\2\2\2\u0166\u0168\5\u012e\u0098\2"+
		"\u0167\u0166\3\2\2\2\u0167\u0168\3\2\2\2\u0168\u016a\3\2\2\2\u0169\u0159"+
		"\3\2\2\2\u016a\u016b\3\2\2\2\u016b\u0169\3\2\2\2\u016b\u016c\3\2\2\2\u016c"+
		"\7\3\2\2\2\u016d\u016e\7;\2\2\u016e\u0170\5\u012a\u0096\2\u016f\u0171"+
		"\5\u012e\u0098\2\u0170\u016f\3\2\2\2\u0170\u0171\3\2\2\2\u0171\u0173\3"+
		"\2\2\2\u0172\u016d\3\2\2\2\u0172\u0173\3\2\2\2\u0173\t\3\2\2\2\u0174\u0176"+
		"\5\f\7\2\u0175\u0174\3\2\2\2\u0176\u0179\3\2\2\2\u0177\u0175\3\2\2\2\u0177"+
		"\u0178\3\2\2\2\u0178\13\3\2\2\2\u0179\u0177\3\2\2\2\u017a\u017b\7<\2\2"+
		"\u017b\u017f\5\u012a\u0096\2\u017c\u017d\7\t\2\2\u017d\u0180\7\21\2\2"+
		"\u017e\u0180\5\16\b\2\u017f\u017c\3\2\2\2\u017f\u017e\3\2\2\2\u017f\u0180"+
		"\3\2\2\2\u0180\u0182\3\2\2\2\u0181\u0183\5\u012e\u0098\2\u0182\u0181\3"+
		"\2\2\2\u0182\u0183\3\2\2\2\u0183\r\3\2\2\2\u0184\u0185\7Y\2\2\u0185\u0186"+
		"\5\u012c\u0097\2\u0186\17\3\2\2\2\u0187\u018d\5\22\n\2\u0188\u018d\5\62"+
		"\32\2\u0189\u018d\5<\37\2\u018a\u018d\5@!\2\u018b\u018d\5J&\2\u018c\u0187"+
		"\3\2\2\2\u018c\u0188\3\2\2\2\u018c\u0189\3\2\2\2\u018c\u018a\3\2\2\2\u018c"+
		"\u018b\3\2\2\2\u018d\u018f\3\2\2\2\u018e\u0190\5\u012e\u0098\2\u018f\u018e"+
		"\3\2\2\2\u018f\u0190\3\2\2\2\u0190\21\3\2\2\2\u0191\u0193\5\u0108\u0085"+
		"\2\u0192\u0191\3\2\2\2\u0192\u0193\3\2\2\2\u0193\u0194\3\2\2\2\u0194\u0198"+
		"\t\2\2\2\u0195\u0197\7\7\2\2\u0196\u0195\3\2\2\2\u0197\u019a\3\2\2\2\u0198"+
		"\u0196\3\2\2\2\u0198\u0199\3\2\2\2\u0199\u019b\3\2\2\2\u019a\u0198\3\2"+
		"\2\2\u019b\u01a3\5\u012c\u0097\2\u019c\u019e\7\7\2\2\u019d\u019c\3\2\2"+
		"\2\u019e\u01a1\3\2\2\2\u019f\u019d\3\2\2\2\u019f\u01a0\3\2\2\2\u01a0\u01a2"+
		"\3\2\2\2\u01a1\u019f\3\2\2\2\u01a2\u01a4\5L\'\2\u01a3\u019f\3\2\2\2\u01a3"+
		"\u01a4\3\2\2\2\u01a4\u01ac\3\2\2\2\u01a5\u01a7\7\7\2\2\u01a6\u01a5\3\2"+
		"\2\2\u01a7\u01aa\3\2\2\2\u01a8\u01a6\3\2\2\2\u01a8\u01a9\3\2\2\2\u01a9"+
		"\u01ab\3\2\2\2\u01aa\u01a8\3\2\2\2\u01ab\u01ad\5\24\13\2\u01ac\u01a8\3"+
		"\2\2\2\u01ac\u01ad\3\2\2\2\u01ad\u01bc\3\2\2\2\u01ae\u01b0\7\7\2\2\u01af"+
		"\u01ae\3\2\2\2\u01b0\u01b3\3\2\2\2\u01b1\u01af\3\2\2\2\u01b1\u01b2\3\2"+
		"\2\2\u01b2\u01b4\3\2\2\2\u01b3\u01b1\3\2\2\2\u01b4\u01b8\7\33\2\2\u01b5"+
		"\u01b7\7\7\2\2\u01b6\u01b5\3\2\2\2\u01b7\u01ba\3\2\2\2\u01b8\u01b6\3\2"+
		"\2\2\u01b8\u01b9\3\2\2\2\u01b9\u01bb\3\2\2\2\u01ba\u01b8\3\2\2\2\u01bb"+
		"\u01bd\5\32\16\2\u01bc\u01b1\3\2\2\2\u01bc\u01bd\3\2\2\2\u01bd\u01c5\3"+
		"\2\2\2\u01be\u01c0\7\7\2\2\u01bf\u01be\3\2\2\2\u01c0\u01c3\3\2\2\2\u01c1"+
		"\u01bf\3\2\2\2\u01c1\u01c2\3\2\2\2\u01c2\u01c4\3\2\2\2\u01c3\u01c1\3\2"+
		"\2\2\u01c4\u01c6\5d\63\2\u01c5\u01c1\3\2\2\2\u01c5\u01c6\3\2\2\2\u01c6"+
		"\u01d5\3\2\2\2\u01c7\u01c9\7\7\2\2\u01c8\u01c7\3\2\2\2\u01c9\u01cc\3\2"+
		"\2\2\u01ca\u01c8\3\2\2\2\u01ca\u01cb\3\2\2\2\u01cb\u01cd\3\2\2\2\u01cc"+
		"\u01ca\3\2\2\2\u01cd\u01d6\5\"\22\2\u01ce\u01d0\7\7\2\2\u01cf\u01ce\3"+
		"\2\2\2\u01d0\u01d3\3\2\2\2\u01d1\u01cf\3\2\2\2\u01d1\u01d2\3\2\2\2\u01d2"+
		"\u01d4\3\2\2\2\u01d3\u01d1\3\2\2\2\u01d4\u01d6\5,\27\2\u01d5\u01ca\3\2"+
		"\2\2\u01d5\u01d1\3\2\2\2\u01d5\u01d6\3\2\2\2\u01d6\23\3\2\2\2\u01d7\u01d9"+
		"\5\u0108\u0085\2\u01d8\u01d7\3\2\2\2\u01d8\u01d9\3\2\2\2\u01d9\u01e1\3"+
		"\2\2\2\u01da\u01de\7D\2\2\u01db\u01dd\7\7\2\2\u01dc\u01db\3\2\2\2\u01dd"+
		"\u01e0\3\2\2\2\u01de\u01dc\3\2\2\2\u01de\u01df\3\2\2\2\u01df\u01e2\3\2"+
		"\2\2\u01e0\u01de\3\2\2\2\u01e1\u01da\3\2\2\2\u01e1\u01e2\3\2\2\2\u01e2"+
		"\u01e3\3\2\2\2\u01e3\u01e4\5\26\f\2\u01e4\25\3\2\2\2\u01e5\u01ee\7\13"+
		"\2\2\u01e6\u01eb\5\30\r\2\u01e7\u01e8\7\n\2\2\u01e8\u01ea\5\30\r\2\u01e9"+
		"\u01e7\3\2\2\2\u01ea\u01ed\3\2\2\2\u01eb\u01e9\3\2\2\2\u01eb\u01ec\3\2"+
		"\2\2\u01ec\u01ef\3\2\2\2\u01ed\u01eb\3\2\2\2\u01ee\u01e6\3\2\2\2\u01ee"+
		"\u01ef\3\2\2\2\u01ef\u01f0\3\2\2\2\u01f0\u01f1\7\f\2\2\u01f1\27\3\2\2"+
		"\2\u01f2\u01f4\5\u0108\u0085\2\u01f3\u01f2\3\2\2\2\u01f3\u01f4\3\2\2\2"+
		"\u01f4\u01f6\3\2\2\2\u01f5\u01f7\t\3\2\2\u01f6\u01f5\3\2\2\2\u01f6\u01f7"+
		"\3\2\2\2\u01f7\u01f8\3\2\2\2\u01f8\u01f9\5\u012c\u0097\2\u01f9\u01fa\7"+
		"\33\2\2\u01fa\u01fd\5P)\2\u01fb\u01fc\7\35\2\2\u01fc\u01fe\5r:\2\u01fd"+
		"\u01fb\3\2\2\2\u01fd\u01fe\3\2\2\2\u01fe\31\3\2\2\2\u01ff\u0201\5\u0120"+
		"\u0091\2\u0200\u01ff\3\2\2\2\u0201\u0204\3\2\2\2\u0202\u0200\3\2\2\2\u0202"+
		"\u0203\3\2\2\2\u0203\u0205\3\2\2\2\u0204\u0202\3\2\2\2\u0205\u0216\5\34"+
		"\17\2\u0206\u0208\7\7\2\2\u0207\u0206\3\2\2\2\u0208\u020b\3\2\2\2\u0209"+
		"\u0207\3\2\2\2\u0209\u020a\3\2\2\2\u020a\u020c\3\2\2\2\u020b\u0209\3\2"+
		"\2\2\u020c\u0210\7\n\2\2\u020d\u020f\7\7\2\2\u020e\u020d\3\2\2\2\u020f"+
		"\u0212\3\2\2\2\u0210\u020e\3\2\2\2\u0210\u0211\3\2\2\2\u0211\u0213\3\2"+
		"\2\2\u0212\u0210\3\2\2\2\u0213\u0215\5\34\17\2\u0214\u0209\3\2\2\2\u0215"+
		"\u0218\3\2\2\2\u0216\u0214\3\2\2\2\u0216\u0217\3\2\2\2\u0217\33\3\2\2"+
		"\2\u0218\u0216\3\2\2\2\u0219\u021d\5\36\20\2\u021a\u021d\5^\60\2\u021b"+
		"\u021d\5 \21\2\u021c\u0219\3\2\2\2\u021c\u021a\3\2\2\2\u021c\u021b\3\2"+
		"\2\2\u021d\35\3\2\2\2\u021e\u021f\5^\60\2\u021f\u0220\5\u009cO\2\u0220"+
		"\37\3\2\2\2\u0221\u0225\5^\60\2\u0222\u0224\7\7\2\2\u0223\u0222\3\2\2"+
		"\2\u0224\u0227\3\2\2\2\u0225\u0223\3\2\2\2\u0225\u0226\3\2\2\2\u0226\u0228"+
		"\3\2\2\2\u0227\u0225\3\2\2\2\u0228\u022c\7E\2\2\u0229\u022b\7\7\2\2\u022a"+
		"\u0229\3\2\2\2\u022b\u022e\3\2\2\2\u022c\u022a\3\2\2\2\u022c\u022d\3\2"+
		"\2\2\u022d\u022f\3\2\2\2\u022e\u022c\3\2\2\2\u022f\u0230\5r:\2\u0230!"+
		"\3\2\2\2\u0231\u0235\7\17\2\2\u0232\u0234\7\7\2\2\u0233\u0232\3\2\2\2"+
		"\u0234\u0237\3\2\2\2\u0235\u0233\3\2\2\2\u0235\u0236\3\2\2\2\u0236\u023b"+
		"\3\2\2\2\u0237\u0235\3\2\2\2\u0238\u023a\5$\23\2\u0239\u0238\3\2\2\2\u023a"+
		"\u023d\3\2\2\2\u023b\u0239\3\2\2\2\u023b\u023c\3\2\2\2\u023c\u0241\3\2"+
		"\2\2\u023d\u023b\3\2\2\2\u023e\u0240\7\7\2\2\u023f\u023e\3\2\2\2\u0240"+
		"\u0243\3\2\2\2\u0241\u023f\3\2\2\2\u0241\u0242\3\2\2\2\u0242\u0244\3\2"+
		"\2\2\u0243\u0241\3\2\2\2\u0244\u0245\7\20\2\2\u0245#\3\2\2\2\u0246\u024f"+
		"\5\22\n\2\u0247\u024f\5\62\32\2\u0248\u024f\5<\37\2\u0249\u024f\5> \2"+
		"\u024a\u024f\5@!\2\u024b\u024f\5&\24\2\u024c\u024f\5(\25\2\u024d\u024f"+
		"\5J&\2\u024e\u0246\3\2\2\2\u024e\u0247\3\2\2\2\u024e\u0248\3\2\2\2\u024e"+
		"\u0249\3\2\2\2\u024e\u024a\3\2\2\2\u024e\u024b\3\2\2\2\u024e\u024c\3\2"+
		"\2\2\u024e\u024d\3\2\2\2\u024f\u0251\3\2\2\2\u0250\u0252\5\u012e\u0098"+
		"\2\u0251\u0250\3\2\2\2\u0251\u0252\3\2\2\2\u0252%\3\2\2\2\u0253\u0257"+
		"\7G\2\2\u0254\u0256\7\7\2\2\u0255\u0254\3\2\2\2\u0256\u0259\3\2\2\2\u0257"+
		"\u0255\3\2\2\2\u0257\u0258\3\2\2\2\u0258\u025a\3\2\2\2\u0259\u0257\3\2"+
		"\2\2\u025a\u025b\5h\65\2\u025b\'\3\2\2\2\u025c\u025e\5\u0108\u0085\2\u025d"+
		"\u025c\3\2\2\2\u025d\u025e\3\2\2\2\u025e\u025f\3\2\2\2\u025f\u0263\7D"+
		"\2\2\u0260\u0262\7\7\2\2\u0261\u0260\3\2\2\2\u0262\u0265\3\2\2\2\u0263"+
		"\u0261\3\2\2\2\u0263\u0264\3\2\2\2\u0264\u0266\3\2\2\2\u0265\u0263\3\2"+
		"\2\2\u0266\u0275\5\64\33\2\u0267\u0269\7\7\2\2\u0268\u0267\3\2\2\2\u0269"+
		"\u026c\3\2\2\2\u026a\u0268\3\2\2\2\u026a\u026b\3\2\2\2\u026b\u026d\3\2"+
		"\2\2\u026c\u026a\3\2\2\2\u026d\u0271\7\33\2\2\u026e\u0270\7\7\2\2\u026f"+
		"\u026e\3\2\2\2\u0270\u0273\3\2\2\2\u0271\u026f\3\2\2\2\u0271\u0272\3\2"+
		"\2\2\u0272\u0274\3\2\2\2\u0273\u0271\3\2\2\2\u0274\u0276\5*\26\2\u0275"+
		"\u026a\3\2\2\2\u0275\u0276\3\2\2\2\u0276\u027a\3\2\2\2\u0277\u0279\7\7"+
		"\2\2\u0278\u0277\3\2\2\2\u0279\u027c\3\2\2\2\u027a\u0278\3\2\2\2\u027a"+
		"\u027b\3\2\2\2\u027b\u027d\3\2\2\2\u027c\u027a\3\2\2\2\u027d\u027e\5h"+
		"\65\2\u027e)\3\2\2\2\u027f\u0283\7H\2\2\u0280\u0282\7\7\2\2\u0281\u0280"+
		"\3\2\2\2\u0282\u0285\3\2\2\2\u0283\u0281\3\2\2\2\u0283\u0284\3\2\2\2\u0284"+
		"\u0286\3\2\2\2\u0285\u0283\3\2\2\2\u0286\u0290\5\u00a2R\2\u0287\u028b"+
		"\7I\2\2\u0288\u028a\7\7\2\2\u0289\u0288\3\2\2\2\u028a\u028d\3\2\2\2\u028b"+
		"\u0289\3\2\2\2\u028b\u028c\3\2\2\2\u028c\u028e\3\2\2\2\u028d\u028b\3\2"+
		"\2\2\u028e\u0290\5\u00a2R\2\u028f\u027f\3\2\2\2\u028f\u0287\3\2\2\2\u0290"+
		"+\3\2\2\2\u0291\u0295\7\17\2\2\u0292\u0294\7\7\2\2\u0293\u0292\3\2\2\2"+
		"\u0294\u0297\3\2\2\2\u0295\u0293\3\2\2\2\u0295\u0296\3\2\2\2\u0296\u0299"+
		"\3\2\2\2\u0297\u0295\3\2\2\2\u0298\u029a\5.\30\2\u0299\u0298\3\2\2\2\u0299"+
		"\u029a\3\2\2\2\u029a\u02ae\3\2\2\2\u029b\u029d\7\7\2\2\u029c\u029b\3\2"+
		"\2\2\u029d\u02a0\3\2\2\2\u029e\u029c\3\2\2\2\u029e\u029f\3\2\2\2\u029f"+
		"\u02a1\3\2\2\2\u02a0\u029e\3\2\2\2\u02a1\u02a5\7\34\2\2\u02a2\u02a4\7"+
		"\7\2\2\u02a3\u02a2\3\2\2\2\u02a4\u02a7\3\2\2\2\u02a5\u02a3\3\2\2\2\u02a5"+
		"\u02a6\3\2\2\2\u02a6\u02ab\3\2\2\2\u02a7\u02a5\3\2\2\2\u02a8\u02aa\5$"+
		"\23\2\u02a9\u02a8\3\2\2\2\u02aa\u02ad\3\2\2\2\u02ab\u02a9\3\2\2\2\u02ab"+
		"\u02ac\3\2\2\2\u02ac\u02af\3\2\2\2\u02ad\u02ab\3\2\2\2\u02ae\u029e\3\2"+
		"\2\2\u02ae\u02af\3\2\2\2\u02af\u02b3\3\2\2\2\u02b0\u02b2\7\7\2\2\u02b1"+
		"\u02b0\3\2\2\2\u02b2\u02b5\3\2\2\2\u02b3\u02b1\3\2\2\2\u02b3\u02b4\3\2"+
		"\2\2\u02b4\u02b6\3\2\2\2\u02b5\u02b3\3\2\2\2\u02b6\u02b7\7\20\2\2\u02b7"+
		"-\3\2\2\2\u02b8\u02bc\5\60\31\2\u02b9\u02bb\7\7\2\2\u02ba\u02b9\3\2\2"+
		"\2\u02bb\u02be\3\2\2\2\u02bc\u02ba\3\2\2\2\u02bc\u02bd\3\2\2\2\u02bd\u02c0"+
		"\3\2\2\2\u02be\u02bc\3\2\2\2\u02bf\u02b8\3\2\2\2\u02c0\u02c1\3\2\2\2\u02c1"+
		"\u02bf\3\2\2\2\u02c1\u02c2\3\2\2\2\u02c2\u02c4\3\2\2\2\u02c3\u02c5\7\34"+
		"\2\2\u02c4\u02c3\3\2\2\2\u02c4\u02c5\3\2\2\2\u02c5/\3\2\2\2\u02c6\u02ce"+
		"\5\u012c\u0097\2\u02c7\u02c9\7\7\2\2\u02c8\u02c7\3\2\2\2\u02c9\u02cc\3"+
		"\2\2\2\u02ca\u02c8\3\2\2\2\u02ca\u02cb\3\2\2\2\u02cb\u02cd\3\2\2\2\u02cc"+
		"\u02ca\3\2\2\2\u02cd\u02cf\5\u00a2R\2\u02ce\u02ca\3\2\2\2\u02ce\u02cf"+
		"\3\2\2\2\u02cf\u02d7\3\2\2\2\u02d0\u02d2\7\7\2\2\u02d1\u02d0\3\2\2\2\u02d2"+
		"\u02d5\3\2\2\2\u02d3\u02d1\3\2\2\2\u02d3\u02d4\3\2\2\2\u02d4\u02d6\3\2"+
		"\2\2\u02d5\u02d3\3\2\2\2\u02d6\u02d8\5\"\22\2\u02d7\u02d3\3\2\2\2\u02d7"+
		"\u02d8\3\2\2\2\u02d8\u02e0\3\2\2\2\u02d9\u02db\7\7\2\2\u02da\u02d9\3\2"+
		"\2\2\u02db\u02de\3\2\2\2\u02dc\u02da\3\2\2\2\u02dc\u02dd\3\2\2\2\u02dd"+
		"\u02df\3\2\2\2\u02de\u02dc\3\2\2\2\u02df\u02e1\7\n\2\2\u02e0\u02dc\3\2"+
		"\2\2\u02e0\u02e1\3\2\2\2\u02e1\61\3\2\2\2\u02e2\u02e4\5\u0108\u0085\2"+
		"\u02e3\u02e2\3\2\2\2\u02e3\u02e4\3\2\2\2\u02e4\u02e5\3\2\2\2\u02e5\u02f5"+
		"\7?\2\2\u02e6\u02e8\7\7\2\2\u02e7\u02e6\3\2\2\2\u02e8\u02eb\3\2\2\2\u02e9"+
		"\u02e7\3\2\2\2\u02e9\u02ea\3\2\2\2\u02ea\u02ec\3\2\2\2\u02eb\u02e9\3\2"+
		"\2\2\u02ec\u02f0\5P)\2\u02ed\u02ef\7\7\2\2\u02ee\u02ed\3\2\2\2\u02ef\u02f2"+
		"\3\2\2\2\u02f0\u02ee\3\2\2\2\u02f0\u02f1\3\2\2\2\u02f1\u02f3\3\2\2\2\u02f2"+
		"\u02f0\3\2\2\2\u02f3\u02f4\7\t\2\2\u02f4\u02f6\3\2\2\2\u02f5\u02e9\3\2"+
		"\2\2\u02f5\u02f6\3\2\2\2\u02f6\u02fe\3\2\2\2\u02f7\u02f9\7\7\2\2\u02f8"+
		"\u02f7\3\2\2\2\u02f9\u02fc\3\2\2\2\u02fa\u02f8\3\2\2\2\u02fa\u02fb\3\2"+
		"\2\2\u02fb\u02fd\3\2\2\2\u02fc\u02fa\3\2\2\2\u02fd\u02ff\5L\'\2\u02fe"+
		"\u02fa\3\2\2\2\u02fe\u02ff\3\2\2\2\u02ff\u0307\3\2\2\2\u0300\u0302\7\7"+
		"\2\2\u0301\u0300\3\2\2\2\u0302\u0305\3\2\2\2\u0303\u0301\3\2\2\2\u0303"+
		"\u0304\3\2\2\2\u0304\u0306\3\2\2\2\u0305\u0303\3\2\2\2\u0306\u0308\5\u012a"+
		"\u0096\2\u0307\u0303\3\2\2\2\u0307\u0308\3\2\2\2\u0308\u030c\3\2\2\2\u0309"+
		"\u030b\7\7\2\2\u030a\u0309\3\2\2\2\u030b\u030e\3\2\2\2\u030c\u030a\3\2"+
		"\2\2\u030c\u030d\3\2\2\2\u030d\u030f\3\2\2\2\u030e\u030c\3\2\2\2\u030f"+
		"\u031e\5\64\33\2\u0310\u0312\7\7\2\2\u0311\u0310\3\2\2\2\u0312\u0315\3"+
		"\2\2\2\u0313\u0311\3\2\2\2\u0313\u0314\3\2\2\2\u0314\u0316\3\2\2\2\u0315"+
		"\u0313\3\2\2\2\u0316\u031a\7\33\2\2\u0317\u0319\7\7\2\2\u0318\u0317\3"+
		"\2\2\2\u0319\u031c\3\2\2\2\u031a\u0318\3\2\2\2\u031a\u031b\3\2\2\2\u031b"+
		"\u031d\3\2\2\2\u031c\u031a\3\2\2\2\u031d\u031f\5P)\2\u031e\u0313\3\2\2"+
		"\2\u031e\u031f\3\2\2\2\u031f\u0327\3\2\2\2\u0320\u0322\7\7\2\2\u0321\u0320"+
		"\3\2\2\2\u0322\u0325\3\2\2\2\u0323\u0321\3\2\2\2\u0323\u0324\3\2\2\2\u0324"+
		"\u0326\3\2\2\2\u0325\u0323\3\2\2\2\u0326\u0328\5d\63\2\u0327\u0323\3\2"+
		"\2\2\u0327\u0328\3\2\2\2\u0328\u0330\3\2\2\2\u0329\u032b\7\7\2\2\u032a"+
		"\u0329\3\2\2\2\u032b\u032e\3\2\2\2\u032c\u032a\3\2\2\2\u032c\u032d\3\2"+
		"\2\2\u032d\u032f\3\2\2\2\u032e\u032c\3\2\2\2\u032f\u0331\5:\36\2\u0330"+
		"\u032c\3\2\2\2\u0330\u0331\3\2\2\2\u0331\63\3\2\2\2\u0332\u033b\7\13\2"+
		"\2\u0333\u0338\5\66\34\2\u0334\u0335\7\n\2\2\u0335\u0337\5\66\34\2\u0336"+
		"\u0334\3\2\2\2\u0337\u033a\3\2\2\2\u0338\u0336\3\2\2\2\u0338\u0339\3\2"+
		"\2\2\u0339\u033c\3\2\2\2\u033a\u0338\3\2\2\2\u033b\u0333\3\2\2\2\u033b"+
		"\u033c\3\2\2\2\u033c\u033d\3\2\2\2\u033d\u033e\7\f\2\2\u033e\65\3\2\2"+
		"\2\u033f\u0341\5\u0108\u0085\2\u0340\u033f\3\2\2\2\u0340\u0341\3\2\2\2"+
		"\u0341\u0342\3\2\2\2\u0342\u0345\58\35\2\u0343\u0344\7\35\2\2\u0344\u0346"+
		"\5r:\2\u0345\u0343\3\2\2\2\u0345\u0346\3\2\2\2\u0346\67\3\2\2\2\u0347"+
		"\u0348\5\u012c\u0097\2\u0348\u0349\7\33\2\2\u0349\u034a\5P)\2\u034a9\3"+
		"\2\2\2\u034b\u0355\5h\65\2\u034c\u0350\7\35\2\2\u034d\u034f\7\7\2\2\u034e"+
		"\u034d\3\2\2\2\u034f\u0352\3\2\2\2\u0350\u034e\3\2\2\2\u0350\u0351\3\2"+
		"\2\2\u0351\u0353\3\2\2\2\u0352\u0350\3\2\2\2\u0353\u0355\5r:\2\u0354\u034b"+
		"\3\2\2\2\u0354\u034c\3\2\2\2\u0355;\3\2\2\2\u0356\u0358\5\u0108\u0085"+
		"\2\u0357\u0356\3\2\2\2\u0357\u0358\3\2\2\2\u0358\u0359\3\2\2\2\u0359\u035d"+
		"\7@\2\2\u035a\u035c\7\7\2\2\u035b\u035a\3\2\2\2\u035c\u035f\3\2\2\2\u035d"+
		"\u035b\3\2\2\2\u035d\u035e\3\2\2\2\u035e\u0360\3\2\2\2\u035f\u035d\3\2"+
		"\2\2\u0360\u0368\5\u012c\u0097\2\u0361\u0363\7\7\2\2\u0362\u0361\3\2\2"+
		"\2\u0363\u0366\3\2\2\2\u0364\u0362\3\2\2\2\u0364\u0365\3\2\2\2\u0365\u0367"+
		"\3\2\2\2\u0366\u0364\3\2\2\2\u0367\u0369\5\24\13\2\u0368\u0364\3\2\2\2"+
		"\u0368\u0369\3\2\2\2\u0369\u0378\3\2\2\2\u036a\u036c\7\7\2\2\u036b\u036a"+
		"\3\2\2\2\u036c\u036f\3\2\2\2\u036d\u036b\3\2\2\2\u036d\u036e\3\2\2\2\u036e"+
		"\u0370\3\2\2\2\u036f\u036d\3\2\2\2\u0370\u0374\7\33\2\2\u0371\u0373\7"+
		"\7\2\2\u0372\u0371\3\2\2\2\u0373\u0376\3\2\2\2\u0374\u0372\3\2\2\2\u0374"+
		"\u0375\3\2\2\2\u0375\u0377\3\2\2\2\u0376\u0374\3\2\2\2\u0377\u0379\5\32"+
		"\16\2\u0378\u036d\3\2\2\2\u0378\u0379\3\2\2\2\u0379\u0381\3\2\2\2\u037a"+
		"\u037c\7\7\2\2\u037b\u037a\3\2\2\2\u037c\u037f\3\2\2\2\u037d\u037b\3\2"+
		"\2\2\u037d\u037e\3\2\2\2\u037e\u0380\3\2\2\2\u037f\u037d\3\2\2\2\u0380"+
		"\u0382\5\"\22\2\u0381\u037d\3\2\2\2\u0381\u0382\3\2\2\2\u0382=\3\2\2\2"+
		"\u0383\u0385\5\u0108\u0085\2\u0384\u0383\3\2\2\2\u0384\u0385\3\2\2\2\u0385"+
		"\u0386\3\2\2\2\u0386\u038a\7F\2\2\u0387\u0389\7\7\2\2\u0388\u0387\3\2"+
		"\2\2\u0389\u038c\3\2\2\2\u038a\u0388\3\2\2\2\u038a\u038b\3\2\2\2\u038b"+
		"\u038e\3\2\2\2\u038c\u038a\3\2\2\2\u038d\u038f\5\u0108\u0085\2\u038e\u038d"+
		"\3\2\2\2\u038e\u038f\3\2\2\2\u038f\u0390\3\2\2\2\u0390\u0398\7@\2\2\u0391"+
		"\u0393\7\7\2\2\u0392\u0391\3\2\2\2\u0393\u0396\3\2\2\2\u0394\u0392\3\2"+
		"\2\2\u0394\u0395\3\2\2\2\u0395\u0397\3\2\2\2\u0396\u0394\3\2\2\2\u0397"+
		"\u0399\5\u012c\u0097\2\u0398\u0394\3\2\2\2\u0398\u0399\3\2\2\2\u0399\u03a8"+
		"\3\2\2\2\u039a\u039c\7\7\2\2\u039b\u039a\3\2\2\2\u039c\u039f\3\2\2\2\u039d"+
		"\u039b\3\2\2\2\u039d\u039e\3\2\2\2\u039e\u03a0\3\2\2\2\u039f\u039d\3\2"+
		"\2\2\u03a0\u03a4\7\33\2\2\u03a1\u03a3\7\7\2\2\u03a2\u03a1\3\2\2\2\u03a3"+
		"\u03a6\3\2\2\2\u03a4\u03a2\3\2\2\2\u03a4\u03a5\3\2\2\2\u03a5\u03a7\3\2"+
		"\2\2\u03a6\u03a4\3\2\2\2\u03a7\u03a9\5\32\16\2\u03a8\u039d\3\2\2\2\u03a8"+
		"\u03a9\3\2\2\2\u03a9\u03b1\3\2\2\2\u03aa\u03ac\7\7\2\2\u03ab\u03aa\3\2"+
		"\2\2\u03ac\u03af\3\2\2\2\u03ad\u03ab\3\2\2\2\u03ad\u03ae\3\2\2\2\u03ae"+
		"\u03b0\3\2\2\2\u03af\u03ad\3\2\2\2\u03b0\u03b2\5\"\22\2\u03b1\u03ad\3"+
		"\2\2\2\u03b1\u03b2\3\2\2\2\u03b2?\3\2\2\2\u03b3\u03b5\5\u0108\u0085\2"+
		"\u03b4\u03b3\3\2\2\2\u03b4\u03b5\3\2\2\2\u03b5\u03b6\3\2\2\2\u03b6\u03be"+
		"\t\3\2\2\u03b7\u03b9\7\7\2\2\u03b8\u03b7\3\2\2\2\u03b9\u03bc\3\2\2\2\u03ba"+
		"\u03b8\3\2\2\2\u03ba\u03bb\3\2\2\2\u03bb\u03bd\3\2\2\2\u03bc\u03ba\3\2"+
		"\2\2\u03bd\u03bf\5L\'\2\u03be\u03ba\3\2\2\2\u03be\u03bf\3\2\2\2\u03bf"+
		"\u03cf\3\2\2\2\u03c0\u03c2\7\7\2\2\u03c1\u03c0\3\2\2\2\u03c2\u03c5\3\2"+
		"\2\2\u03c3\u03c1\3\2\2\2\u03c3\u03c4\3\2\2\2\u03c4\u03c6\3\2\2\2\u03c5"+
		"\u03c3\3\2\2\2\u03c6\u03ca\5P)\2\u03c7\u03c9\7\7\2\2\u03c8\u03c7\3\2\2"+
		"\2\u03c9\u03cc\3\2\2\2\u03ca\u03c8\3\2\2\2\u03ca\u03cb\3\2\2\2\u03cb\u03cd"+
		"\3\2\2\2\u03cc\u03ca\3\2\2\2\u03cd\u03ce\7\t\2\2\u03ce\u03d0\3\2\2\2\u03cf"+
		"\u03c3\3\2\2\2\u03cf\u03d0\3\2\2\2\u03d0\u03d4\3\2\2\2\u03d1\u03d3\7\7"+
		"\2\2\u03d2\u03d1\3\2\2\2\u03d3\u03d6\3\2\2\2\u03d4\u03d2\3\2\2\2\u03d4"+
		"\u03d5\3\2\2\2\u03d5\u03d9\3\2\2\2\u03d6\u03d4\3\2\2\2\u03d7\u03da\5B"+
		"\"\2\u03d8\u03da\5D#\2\u03d9\u03d7\3\2\2\2\u03d9\u03d8\3\2\2\2\u03da\u03e2"+
		"\3\2\2\2\u03db\u03dd\7\7\2\2\u03dc\u03db\3\2\2\2\u03dd\u03e0\3\2\2\2\u03de"+
		"\u03dc\3\2\2\2\u03de\u03df\3\2\2\2\u03df\u03e1\3\2\2\2\u03e0\u03de\3\2"+
		"\2\2\u03e1\u03e3\5d\63\2\u03e2\u03de\3\2\2\2\u03e2\u03e3\3\2\2\2\u03e3"+
		"\u03f2\3\2\2\2\u03e4\u03e6\7\7\2\2\u03e5\u03e4\3\2\2\2\u03e6\u03e9\3\2"+
		"\2\2\u03e7\u03e5\3\2\2\2\u03e7\u03e8\3\2\2\2\u03e8\u03ea\3\2\2\2\u03e9"+
		"\u03e7\3\2\2\2\u03ea\u03ee\t\4\2\2\u03eb\u03ed\7\7\2\2\u03ec\u03eb\3\2"+
		"\2\2\u03ed\u03f0\3\2\2\2\u03ee\u03ec\3\2\2\2\u03ee\u03ef\3\2\2\2\u03ef"+
		"\u03f1\3\2\2\2\u03f0\u03ee\3\2\2\2\u03f1\u03f3\5r:\2\u03f2\u03e7\3\2\2"+
		"\2\u03f2\u03f3\3\2\2\2\u03f3\u03f5\3\2\2\2\u03f4\u03f6\5\u012e\u0098\2"+
		"\u03f5\u03f4\3\2\2\2\u03f5\u03f6\3\2\2\2\u03f6\u040f\3\2\2\2\u03f7\u03f9"+
		"\5F$\2\u03f8\u03f7\3\2\2\2\u03f8\u03f9\3\2\2\2\u03f9\u0401\3\2\2\2\u03fa"+
		"\u03fc\7\7\2\2\u03fb\u03fa\3\2\2\2\u03fc\u03ff\3\2\2\2\u03fd\u03fb\3\2"+
		"\2\2\u03fd\u03fe\3\2\2\2\u03fe\u0400\3\2\2\2\u03ff\u03fd\3\2\2\2\u0400"+
		"\u0402\5H%\2\u0401\u03fd\3\2\2\2\u0401\u0402\3\2\2\2\u0402\u0410\3\2\2"+
		"\2\u0403\u0405\5H%\2\u0404\u0403\3\2\2\2\u0404\u0405\3\2\2\2\u0405\u040d"+
		"\3\2\2\2\u0406\u0408\7\7\2\2\u0407\u0406\3\2\2\2\u0408\u040b\3\2\2\2\u0409"+
		"\u0407\3\2\2\2\u0409\u040a\3\2\2\2\u040a\u040c\3\2\2\2\u040b\u0409\3\2"+
		"\2\2\u040c\u040e\5F$\2\u040d\u0409\3\2\2\2\u040d\u040e\3\2\2\2\u040e\u0410"+
		"\3\2\2\2\u040f\u03f8\3\2\2\2\u040f\u0404\3\2\2\2\u0410A\3\2\2\2\u0411"+
		"\u0412\7\13\2\2\u0412\u0417\5D#\2\u0413\u0414\7\n\2\2\u0414\u0416\5D#"+
		"\2\u0415\u0413\3\2\2\2\u0416\u0419\3\2\2\2\u0417\u0415\3\2\2\2\u0417\u0418"+
		"\3\2\2\2\u0418\u041a\3\2\2\2\u0419\u0417\3\2\2\2\u041a\u041b\7\f\2\2\u041b"+
		"C\3\2\2\2\u041c\u041f\5\u012c\u0097\2\u041d\u041e\7\33\2\2\u041e\u0420"+
		"\5P)\2\u041f\u041d\3\2\2\2\u041f\u0420\3\2\2\2\u0420E\3\2\2\2\u0421\u0423"+
		"\5\u0108\u0085\2\u0422\u0421\3\2\2\2\u0422\u0423\3\2\2\2\u0423\u0424\3"+
		"\2\2\2\u0424\u0453\7c\2\2\u0425\u0427\5\u0108\u0085\2\u0426\u0425\3\2"+
		"\2\2\u0426\u0427\3\2\2\2\u0427\u0428\3\2\2\2\u0428\u042c\7c\2\2\u0429"+
		"\u042b\7\7\2\2\u042a\u0429\3\2\2\2\u042b\u042e\3\2\2\2\u042c\u042a\3\2"+
		"\2\2\u042c\u042d\3\2\2\2\u042d\u042f\3\2\2\2\u042e\u042c\3\2\2\2\u042f"+
		"\u0430\7\13\2\2\u0430\u043f\7\f\2\2\u0431\u0433\7\7\2\2\u0432\u0431\3"+
		"\2\2\2\u0433\u0436\3\2\2\2\u0434\u0432\3\2\2\2\u0434\u0435\3\2\2\2\u0435"+
		"\u0437\3\2\2\2\u0436\u0434\3\2\2\2\u0437\u043b\7\33\2\2\u0438\u043a\7"+
		"\7\2\2\u0439\u0438\3\2\2\2\u043a\u043d\3\2\2\2\u043b\u0439\3\2\2\2\u043b"+
		"\u043c\3\2\2\2\u043c\u043e\3\2\2\2\u043d\u043b\3\2\2\2\u043e\u0440\5P"+
		")\2\u043f\u0434\3\2\2\2\u043f\u0440\3\2\2\2\u0440\u0444\3\2\2\2\u0441"+
		"\u0443\7\7\2\2\u0442\u0441\3\2\2\2\u0443\u0446\3\2\2\2\u0444\u0442\3\2"+
		"\2\2\u0444\u0445\3\2\2\2\u0445\u0450\3\2\2\2\u0446\u0444\3\2\2\2\u0447"+
		"\u0451\5h\65\2\u0448\u044c\7\35\2\2\u0449\u044b\7\7\2\2\u044a\u0449\3"+
		"\2\2\2\u044b\u044e\3\2\2\2\u044c\u044a\3\2\2\2\u044c\u044d\3\2\2\2\u044d"+
		"\u044f\3\2\2\2\u044e\u044c\3\2\2\2\u044f\u0451\5r:\2\u0450\u0447\3\2\2"+
		"\2\u0450\u0448\3\2\2\2\u0451\u0453\3\2\2\2\u0452\u0422\3\2\2\2\u0452\u0426"+
		"\3\2\2\2\u0453G\3\2\2\2\u0454\u0456\5\u0108\u0085\2\u0455\u0454\3\2\2"+
		"\2\u0455\u0456\3\2\2\2\u0456\u0457\3\2\2\2\u0457\u0478\7d\2\2\u0458\u045a"+
		"\5\u0108\u0085\2\u0459\u0458\3\2\2\2\u0459\u045a\3\2\2\2\u045a\u045b\3"+
		"\2\2\2\u045b\u045f\7d\2\2\u045c\u045e\7\7\2\2\u045d\u045c\3\2\2\2\u045e"+
		"\u0461\3\2\2\2\u045f\u045d\3\2\2\2\u045f\u0460\3\2\2\2\u0460\u0462\3\2"+
		"\2\2\u0461\u045f\3\2\2\2\u0462\u0467\7\13\2\2\u0463\u0466\5\u0120\u0091"+
		"\2\u0464\u0466\5\u011a\u008e\2\u0465\u0463\3\2\2\2\u0465\u0464\3\2\2\2"+
		"\u0466\u0469\3\2\2\2\u0467\u0465\3\2\2\2\u0467\u0468\3\2\2\2\u0468\u046c"+
		"\3\2\2\2\u0469\u0467\3\2\2\2\u046a\u046d\5\u012c\u0097\2\u046b\u046d\5"+
		"8\35\2\u046c\u046a\3\2\2\2\u046c\u046b\3\2\2\2\u046d\u046e\3\2\2\2\u046e"+
		"\u0472\7\f\2\2\u046f\u0471\7\7\2\2\u0470\u046f\3\2\2\2\u0471\u0474\3\2"+
		"\2\2\u0472\u0470\3\2\2\2\u0472\u0473\3\2\2\2\u0473\u0475\3\2\2\2\u0474"+
		"\u0472\3\2\2\2\u0475\u0476\5:\36\2\u0476\u0478\3\2\2\2\u0477\u0455\3\2"+
		"\2\2\u0477\u0459\3\2\2\2\u0478I\3\2\2\2\u0479\u047b\5\u0108\u0085\2\u047a"+
		"\u0479\3\2\2\2\u047a\u047b\3\2\2\2\u047b\u047c\3\2\2\2\u047c\u0480\7C"+
		"\2\2\u047d\u047f\7\7\2\2\u047e\u047d\3\2\2\2\u047f\u0482\3\2\2\2\u0480"+
		"\u047e\3\2\2\2\u0480\u0481\3\2\2\2\u0481\u0483\3\2\2\2\u0482\u0480\3\2"+
		"\2\2\u0483\u048b\5\u012c\u0097\2\u0484\u0486\7\7\2\2\u0485\u0484\3\2\2"+
		"\2\u0486\u0489\3\2\2\2\u0487\u0485\3\2\2\2\u0487\u0488\3\2\2\2\u0488\u048a"+
		"\3\2\2\2\u0489\u0487\3\2\2\2\u048a\u048c\5L\'\2\u048b\u0487\3\2\2\2\u048b"+
		"\u048c\3\2\2\2\u048c\u0490\3\2\2\2\u048d\u048f\7\7\2\2\u048e\u048d\3\2"+
		"\2\2\u048f\u0492\3\2\2\2\u0490\u048e\3\2\2\2\u0490\u0491\3\2\2\2\u0491"+
		"\u0493\3\2\2\2\u0492\u0490\3\2\2\2\u0493\u0497\7\35\2\2\u0494\u0496\7"+
		"\7\2\2\u0495\u0494\3\2\2\2\u0496\u0499\3\2\2\2\u0497\u0495\3\2\2\2\u0497"+
		"\u0498\3\2\2\2\u0498\u049a\3\2\2\2\u0499\u0497\3\2\2\2\u049a\u049b\5P"+
		")\2\u049bK\3\2\2\2\u049c\u04a0\7-\2\2\u049d\u049f\7\7\2\2\u049e\u049d"+
		"\3\2\2\2\u049f\u04a2\3\2\2\2\u04a0\u049e\3\2\2\2\u04a0\u04a1\3\2\2\2\u04a1"+
		"\u04a3\3\2\2\2\u04a2\u04a0\3\2\2\2\u04a3\u04b4\5N(\2\u04a4\u04a6\7\7\2"+
		"\2\u04a5\u04a4\3\2\2\2\u04a6\u04a9\3\2\2\2\u04a7\u04a5\3\2\2\2\u04a7\u04a8"+
		"\3\2\2\2\u04a8\u04aa\3\2\2\2\u04a9\u04a7\3\2\2\2\u04aa\u04ae\7\n\2\2\u04ab"+
		"\u04ad\7\7\2\2\u04ac\u04ab\3\2\2\2\u04ad\u04b0\3\2\2\2\u04ae\u04ac\3\2"+
		"\2\2\u04ae\u04af\3\2\2\2\u04af\u04b1\3\2\2\2\u04b0\u04ae\3\2\2\2\u04b1"+
		"\u04b3\5N(\2\u04b2\u04a7\3\2\2\2\u04b3\u04b6\3\2\2\2\u04b4\u04b2\3\2\2"+
		"\2\u04b4\u04b5\3\2\2\2\u04b5\u04ba\3\2\2\2\u04b6\u04b4\3\2\2\2\u04b7\u04b9"+
		"\7\7\2\2\u04b8\u04b7\3\2\2\2\u04b9\u04bc\3\2\2\2\u04ba\u04b8\3\2\2\2\u04ba"+
		"\u04bb\3\2\2\2\u04bb\u04bd\3\2\2\2\u04bc\u04ba\3\2\2\2\u04bd\u04be\7."+
		"\2\2\u04beM\3\2\2\2\u04bf\u04c1\5\u0108\u0085\2\u04c0\u04bf\3\2\2\2\u04c0"+
		"\u04c1\3\2\2\2\u04c1\u04c5\3\2\2\2\u04c2\u04c4\7\7\2\2\u04c3\u04c2\3\2"+
		"\2\2\u04c4\u04c7\3\2\2\2\u04c5\u04c3\3\2\2\2\u04c5\u04c6\3\2\2\2\u04c6"+
		"\u04c8\3\2\2\2\u04c7\u04c5\3\2\2\2\u04c8\u04d7\5\u012c\u0097\2\u04c9\u04cb"+
		"\7\7\2\2\u04ca\u04c9\3\2\2\2\u04cb\u04ce\3\2\2\2\u04cc\u04ca\3\2\2\2\u04cc"+
		"\u04cd\3\2\2\2\u04cd\u04cf\3\2\2\2\u04ce\u04cc\3\2\2\2\u04cf\u04d3\7\33"+
		"\2\2\u04d0\u04d2\7\7\2\2\u04d1\u04d0\3\2\2\2\u04d2\u04d5\3\2\2\2\u04d3"+
		"\u04d1\3\2\2\2\u04d3\u04d4\3\2\2\2\u04d4\u04d6\3\2\2\2\u04d5\u04d3\3\2"+
		"\2\2\u04d6\u04d8\5P)\2\u04d7\u04cc\3\2\2\2\u04d7\u04d8\3\2\2\2\u04d8O"+
		"\3\2\2\2\u04d9\u04db\5R*\2\u04da\u04d9\3\2\2\2\u04da\u04db\3\2\2\2\u04db"+
		"\u04e1\3\2\2\2\u04dc\u04e2\5T+\2\u04dd\u04e2\5V,\2\u04de\u04e2\5X-\2\u04df"+
		"\u04e2\5Z.\2\u04e0\u04e2\7\u008e\2\2\u04e1\u04dc\3\2\2\2\u04e1\u04dd\3"+
		"\2\2\2\u04e1\u04de\3\2\2\2\u04e1\u04df\3\2\2\2\u04e1\u04e0\3\2\2\2\u04e2"+
		"Q\3\2\2\2\u04e3\u04ec\5\u0120\u0091\2\u04e4\u04e8\7x\2\2\u04e5\u04e7\7"+
		"\7\2\2\u04e6\u04e5\3\2\2\2\u04e7\u04ea\3\2\2\2\u04e8\u04e6\3\2\2\2\u04e8"+
		"\u04e9\3\2\2\2\u04e9\u04ec\3\2\2\2\u04ea\u04e8\3\2\2\2\u04eb\u04e3\3\2"+
		"\2\2\u04eb\u04e4\3\2\2\2\u04ec\u04ed\3\2\2\2\u04ed\u04eb\3\2\2\2\u04ed"+
		"\u04ee\3\2\2\2\u04eeS\3\2\2\2\u04ef\u04f0\7\13\2\2\u04f0\u04f1\5P)\2\u04f1"+
		"\u04f2\7\f\2\2\u04f2U\3\2\2\2\u04f3\u04f6\5X-\2\u04f4\u04f6\5T+\2\u04f5"+
		"\u04f3\3\2\2\2\u04f5\u04f4\3\2\2\2\u04f6\u04fa\3\2\2\2\u04f7\u04f9\7\7"+
		"\2\2\u04f8\u04f7\3\2\2\2\u04f9\u04fc\3\2\2\2\u04fa\u04f8\3\2\2\2\u04fa"+
		"\u04fb\3\2\2\2\u04fb\u04fe\3\2\2\2\u04fc\u04fa\3\2\2\2\u04fd\u04ff\7+"+
		"\2\2\u04fe\u04fd\3\2\2\2\u04ff\u0500\3\2\2\2\u0500\u04fe\3\2\2\2\u0500"+
		"\u0501\3\2\2\2\u0501W\3\2\2\2\u0502\u0503\7\13\2\2\u0503\u0504\5X-\2\u0504"+
		"\u0505\7\f\2\2\u0505\u0509\3\2\2\2\u0506\u0509\5^\60\2\u0507\u0509\7i"+
		"\2\2\u0508\u0502\3\2\2\2\u0508\u0506\3\2\2\2\u0508\u0507\3\2\2\2\u0509"+
		"Y\3\2\2\2\u050a\u050e\5\\/\2\u050b\u050d\7\7\2\2\u050c\u050b\3\2\2\2\u050d"+
		"\u0510\3\2\2\2\u050e\u050c\3\2\2\2\u050e\u050f\3\2\2\2\u050f\u0511\3\2"+
		"\2\2\u0510\u050e\3\2\2\2\u0511\u0515\7\t\2\2\u0512\u0514\7\7\2\2\u0513"+
		"\u0512\3\2\2\2\u0514\u0517\3\2\2\2\u0515\u0513\3\2\2\2\u0515\u0516\3\2"+
		"\2\2\u0516\u0519\3\2\2\2\u0517\u0515\3\2\2\2\u0518\u050a\3\2\2\2\u0518"+
		"\u0519\3\2\2\2\u0519\u051a\3\2\2\2\u051a\u051e\5b\62\2\u051b\u051d\7\7"+
		"\2\2\u051c\u051b\3\2\2\2\u051d\u0520\3\2\2\2\u051e\u051c\3\2\2\2\u051e"+
		"\u051f\3\2\2\2\u051f\u0521\3\2\2\2\u0520\u051e\3\2\2\2\u0521\u0529\7#"+
		"\2\2\u0522\u0524\7\7\2\2\u0523\u0522\3\2\2\2\u0524\u0527\3\2\2\2\u0525"+
		"\u0523\3\2\2\2\u0525\u0526\3\2\2\2\u0526\u0528\3\2\2\2\u0527\u0525\3\2"+
		"\2\2\u0528\u052a\5P)\2\u0529\u0525\3\2\2\2\u0529\u052a\3\2\2\2\u052a["+
		"\3\2\2\2\u052b\u052f\5T+\2\u052c\u052f\5V,\2\u052d\u052f\5X-\2\u052e\u052b"+
		"\3\2\2\2\u052e\u052c\3\2\2\2\u052e\u052d\3\2\2\2\u052f]\3\2\2\2\u0530"+
		"\u0541\5`\61\2\u0531\u0533\7\7\2\2\u0532\u0531\3\2\2\2\u0533\u0536\3\2"+
		"\2\2\u0534\u0532\3\2\2\2\u0534\u0535\3\2\2\2\u0535\u0537\3\2\2\2\u0536"+
		"\u0534\3\2\2\2\u0537\u053b\7\t\2\2\u0538\u053a\7\7\2\2\u0539\u0538\3\2"+
		"\2\2\u053a\u053d\3\2\2\2\u053b\u0539\3\2\2\2\u053b\u053c\3\2\2\2\u053c"+
		"\u053e\3\2\2\2\u053d\u053b\3\2\2\2\u053e\u0540\5`\61\2\u053f\u0534\3\2"+
		"\2\2\u0540\u0543\3\2\2\2\u0541\u053f\3\2\2\2\u0541\u0542\3\2\2\2\u0542"+
		"_\3\2\2\2\u0543\u0541\3\2\2\2\u0544\u054c\5\u012c\u0097\2\u0545\u0547"+
		"\7\7\2\2\u0546\u0545\3\2\2\2\u0547\u054a\3\2\2\2\u0548\u0546\3\2\2\2\u0548"+
		"\u0549\3\2\2\2\u0549\u054b\3\2\2\2\u054a\u0548\3\2\2\2\u054b\u054d\5\u00a4"+
		"S\2\u054c\u0548\3\2\2\2\u054c\u054d\3\2\2\2\u054da\3\2\2\2\u054e\u0551"+
		"\7\13\2\2\u054f\u0552\58\35\2\u0550\u0552\5P)\2\u0551\u054f\3\2\2\2\u0551"+
		"\u0550\3\2\2\2\u0551\u0552\3\2\2\2\u0552\u055a\3\2\2\2\u0553\u0556\7\n"+
		"\2\2\u0554\u0557\58\35\2\u0555\u0557\5P)\2\u0556\u0554\3\2\2\2\u0556\u0555"+
		"\3\2\2\2\u0557\u0559\3\2\2\2\u0558\u0553\3\2\2\2\u0559\u055c\3\2\2\2\u055a"+
		"\u0558\3\2\2\2\u055a\u055b\3\2\2\2\u055b\u055d\3\2\2\2\u055c\u055a\3\2"+
		"\2\2\u055d\u055e\7\f\2\2\u055ec\3\2\2\2\u055f\u0563\7K\2\2\u0560\u0562"+
		"\7\7\2\2\u0561\u0560\3\2\2\2\u0562\u0565\3\2\2\2\u0563\u0561\3\2\2\2\u0563"+
		"\u0564\3\2\2\2\u0564\u0566\3\2\2\2\u0565\u0563\3\2\2\2\u0566\u0577\5f"+
		"\64\2\u0567\u0569\7\7\2\2\u0568\u0567\3\2\2\2\u0569\u056c\3\2\2\2\u056a"+
		"\u0568\3\2\2\2\u056a\u056b\3\2\2\2\u056b\u056d\3\2\2\2\u056c\u056a\3\2"+
		"\2\2\u056d\u0571\7\n\2\2\u056e\u0570\7\7\2\2\u056f\u056e\3\2\2\2\u0570"+
		"\u0573\3\2\2\2\u0571\u056f\3\2\2\2\u0571\u0572\3\2\2\2\u0572\u0574\3\2"+
		"\2\2\u0573\u0571\3\2\2\2\u0574\u0576\5f\64\2\u0575\u056a\3\2\2\2\u0576"+
		"\u0579\3\2\2\2\u0577\u0575\3\2\2\2\u0577\u0578\3\2\2\2\u0578e\3\2\2\2"+
		"\u0579\u0577\3\2\2\2\u057a\u057c\5\u0120\u0091\2\u057b\u057a\3\2\2\2\u057c"+
		"\u057f\3\2\2\2\u057d\u057b\3\2\2\2\u057d\u057e\3\2\2\2\u057e\u0580\3\2"+
		"\2\2\u057f\u057d\3\2\2\2\u0580\u0584\5\u012c\u0097\2\u0581\u0583\7\7\2"+
		"\2\u0582\u0581\3\2\2\2\u0583\u0586\3\2\2\2\u0584\u0582\3\2\2\2\u0584\u0585"+
		"\3\2\2\2\u0585\u0587\3\2\2\2\u0586\u0584\3\2\2\2\u0587\u058b\7\33\2\2"+
		"\u0588\u058a\7\7\2\2\u0589\u0588\3\2\2\2\u058a\u058d\3\2\2\2\u058b\u0589"+
		"\3\2\2\2\u058b\u058c\3\2\2\2\u058c\u058e\3\2\2\2\u058d\u058b\3\2\2\2\u058e"+
		"\u058f\5P)\2\u058fg\3\2\2\2\u0590\u0594\7\17\2\2\u0591\u0593\7\7\2\2\u0592"+
		"\u0591\3\2\2\2\u0593\u0596\3\2\2\2\u0594\u0592\3\2\2\2\u0594\u0595\3\2"+
		"\2\2\u0595\u059c\3\2\2\2\u0596\u0594\3\2\2\2\u0597\u0598\5l\67\2\u0598"+
		"\u0599\5\u012e\u0098\2\u0599\u059b\3\2\2\2\u059a\u0597\3\2\2\2\u059b\u059e"+
		"\3\2\2\2\u059c\u059a\3\2\2\2\u059c\u059d\3\2\2\2\u059d\u05a3\3\2\2\2\u059e"+
		"\u059c\3\2\2\2\u059f\u05a1\5l\67\2\u05a0\u05a2\5\u012e\u0098\2\u05a1\u05a0"+
		"\3\2\2\2\u05a1\u05a2\3\2\2\2\u05a2\u05a4\3\2\2\2\u05a3\u059f\3\2\2\2\u05a3"+
		"\u05a4\3\2\2\2\u05a4\u05a8\3\2\2\2\u05a5\u05a7\7\7\2\2\u05a6\u05a5\3\2"+
		"\2\2\u05a7\u05aa\3\2\2\2\u05a8\u05a6\3\2\2\2\u05a8\u05a9\3\2\2\2\u05a9"+
		"\u05ab\3\2\2\2\u05aa\u05a8\3\2\2\2\u05ab\u05ac\7\20\2\2\u05aci\3\2\2\2"+
		"\u05ad\u05ae\5l\67\2\u05ae\u05af\5\u012e\u0098\2\u05af\u05b1\3\2\2\2\u05b0"+
		"\u05ad\3\2\2\2\u05b1\u05b4\3\2\2\2\u05b2\u05b0\3\2\2\2\u05b2\u05b3\3\2"+
		"\2\2\u05b3\u05b5\3\2\2\2\u05b4\u05b2\3\2\2\2\u05b5\u05b7\5l\67\2\u05b6"+
		"\u05b8\5\u012e\u0098\2\u05b7\u05b6\3\2\2\2\u05b7\u05b8\3\2\2\2\u05b8\u05ba"+
		"\3\2\2\2\u05b9\u05b2\3\2\2\2\u05b9\u05ba\3\2\2\2\u05bak\3\2\2\2\u05bb"+
		"\u05bf\5n8\2\u05bc\u05bf\5p9\2\u05bd\u05bf\5r:\2\u05be\u05bb\3\2\2\2\u05be"+
		"\u05bc\3\2\2\2\u05be\u05bd\3\2\2\2\u05bfm\3\2\2\2\u05c0\u05c2\5\u011e"+
		"\u0090\2\u05c1\u05c0\3\2\2\2\u05c2\u05c5\3\2\2\2\u05c3\u05c1\3\2\2\2\u05c3"+
		"\u05c4\3\2\2\2\u05c4\u05ca\3\2\2\2\u05c5\u05c3\3\2\2\2\u05c6\u05cb\5\22"+
		"\n\2\u05c7\u05cb\5\62\32\2\u05c8\u05cb\5@!\2\u05c9\u05cb\5J&\2\u05ca\u05c6"+
		"\3\2\2\2\u05ca\u05c7\3\2\2\2\u05ca\u05c8\3\2\2\2\u05ca\u05c9\3\2\2\2\u05cb"+
		"o\3\2\2\2\u05cc\u05cd\5\u0098M\2\u05cd\u05d1\5\u00f2z\2\u05ce\u05d0\7"+
		"\7\2\2\u05cf\u05ce\3\2\2\2\u05d0\u05d3\3\2\2\2\u05d1\u05cf\3\2\2\2\u05d1"+
		"\u05d2\3\2\2\2\u05d2\u05d4\3\2\2\2\u05d3\u05d1\3\2\2\2\u05d4\u05d5\5t"+
		";\2\u05d5q\3\2\2\2\u05d6\u05d7\5t;\2\u05d7s\3\2\2\2\u05d8\u05e9\5v<\2"+
		"\u05d9\u05db\7\7\2\2\u05da\u05d9\3\2\2\2\u05db\u05de\3\2\2\2\u05dc\u05da"+
		"\3\2\2\2\u05dc\u05dd\3\2\2\2\u05dd\u05df\3\2\2\2\u05de\u05dc\3\2\2\2\u05df"+
		"\u05e3\7\31\2\2\u05e0\u05e2\7\7\2\2\u05e1\u05e0\3\2\2\2\u05e2\u05e5\3"+
		"\2\2\2\u05e3\u05e1\3\2\2\2\u05e3\u05e4\3\2\2\2\u05e4\u05e6\3\2\2\2\u05e5"+
		"\u05e3\3\2\2\2\u05e6\u05e8\5v<\2\u05e7\u05dc\3\2\2\2\u05e8\u05eb\3\2\2"+
		"\2\u05e9\u05e7\3\2\2\2\u05e9\u05ea\3\2\2\2\u05eau\3\2\2\2\u05eb\u05e9"+
		"\3\2\2\2\u05ec\u05fd\5x=\2\u05ed\u05ef\7\7\2\2\u05ee\u05ed\3\2\2\2\u05ef"+
		"\u05f2\3\2\2\2\u05f0\u05ee\3\2\2\2\u05f0\u05f1\3\2\2\2\u05f1\u05f3\3\2"+
		"\2\2\u05f2\u05f0\3\2\2\2\u05f3\u05f7\7\30\2\2\u05f4\u05f6\7\7\2\2\u05f5"+
		"\u05f4\3\2\2\2\u05f6\u05f9\3\2\2\2\u05f7\u05f5\3\2\2\2\u05f7\u05f8\3\2"+
		"\2\2\u05f8\u05fa\3\2\2\2\u05f9\u05f7\3\2\2\2\u05fa\u05fc\5x=\2\u05fb\u05f0"+
		"\3\2\2\2\u05fc\u05ff\3\2\2\2\u05fd\u05fb\3\2\2\2\u05fd\u05fe\3\2\2\2\u05fe"+
		"w\3\2\2\2\u05ff\u05fd\3\2\2\2\u0600\u060c\5z>\2\u0601\u0605\5\u00f4{\2"+
		"\u0602\u0604\7\7\2\2\u0603\u0602\3\2\2\2\u0604\u0607\3\2\2\2\u0605\u0603"+
		"\3\2\2\2\u0605\u0606\3\2\2\2\u0606\u0608\3\2\2\2\u0607\u0605\3\2\2\2\u0608"+
		"\u0609\5z>\2\u0609\u060b\3\2\2\2\u060a\u0601\3\2\2\2\u060b\u060e\3\2\2"+
		"\2\u060c\u060a\3\2\2\2\u060c\u060d\3\2\2\2\u060dy\3\2\2\2\u060e\u060c"+
		"\3\2\2\2\u060f\u0619\5|?\2\u0610\u0614\5\u00f6|\2\u0611\u0613\7\7\2\2"+
		"\u0612\u0611\3\2\2\2\u0613\u0616\3\2\2\2\u0614\u0612\3\2\2\2\u0614\u0615"+
		"\3\2\2\2\u0615\u0617\3\2\2\2\u0616\u0614\3\2\2\2\u0617\u0618\5|?\2\u0618"+
		"\u061a\3\2\2\2\u0619\u0610\3\2\2\2\u0619\u061a\3\2\2\2\u061a{\3\2\2\2"+
		"\u061b\u0627\5~@\2\u061c\u0620\5\u00f8}\2\u061d\u061f\7\7\2\2\u061e\u061d"+
		"\3\2\2\2\u061f\u0622\3\2\2\2\u0620\u061e\3\2\2\2\u0620\u0621\3\2\2\2\u0621"+
		"\u0623\3\2\2\2\u0622\u0620\3\2\2\2\u0623\u0624\5~@\2\u0624\u0626\3\2\2"+
		"\2\u0625\u061c\3\2\2\2\u0626\u0629\3\2\2\2\u0627\u0625\3\2\2\2\u0627\u0628"+
		"\3\2\2\2\u0628\u0637\3\2\2\2\u0629\u0627\3\2\2\2\u062a\u0634\5~@\2\u062b"+
		"\u062f\5\u00fa~\2\u062c\u062e\7\7\2\2\u062d\u062c\3\2\2\2\u062e\u0631"+
		"\3\2\2\2\u062f\u062d\3\2\2\2\u062f\u0630\3\2\2\2\u0630\u0632\3\2\2\2\u0631"+
		"\u062f\3\2\2\2\u0632\u0633\5P)\2\u0633\u0635\3\2\2\2\u0634\u062b\3\2\2"+
		"\2\u0634\u0635\3\2\2\2\u0635\u0637\3\2\2\2\u0636\u061b\3\2\2\2\u0636\u062a"+
		"\3\2\2\2\u0637}\3\2\2\2\u0638\u0649\5\u0080A\2\u0639\u063b\7\7\2\2\u063a"+
		"\u0639\3\2\2\2\u063b\u063e\3\2\2\2\u063c\u063a\3\2\2\2\u063c\u063d\3\2"+
		"\2\2\u063d\u063f\3\2\2\2\u063e\u063c\3\2\2\2\u063f\u0643\7,\2\2\u0640"+
		"\u0642\7\7\2\2\u0641\u0640\3\2\2\2\u0642\u0645\3\2\2\2\u0643\u0641\3\2"+
		"\2\2\u0643\u0644\3\2\2\2\u0644\u0646\3\2\2\2\u0645\u0643\3\2\2\2\u0646"+
		"\u0648\5\u0080A\2\u0647\u063c\3\2\2\2\u0648\u064b\3\2\2\2\u0649\u0647"+
		"\3\2\2\2\u0649\u064a\3\2\2\2\u064a\177\3\2\2\2\u064b\u0649\3\2\2\2\u064c"+
		"\u0658\5\u0082B\2\u064d\u0651\5\u012c\u0097\2\u064e\u0650\7\7\2\2\u064f"+
		"\u064e\3\2\2\2\u0650\u0653\3\2\2\2\u0651\u064f\3\2\2\2\u0651\u0652\3\2"+
		"\2\2\u0652\u0654\3\2\2\2\u0653\u0651\3\2\2\2\u0654\u0655\5\u0082B\2\u0655"+
		"\u0657\3\2\2\2\u0656\u064d\3\2\2\2\u0657\u065a\3\2\2\2\u0658\u0656\3\2"+
		"\2\2\u0658\u0659\3\2\2\2\u0659\u0081\3\2\2\2\u065a\u0658\3\2\2\2\u065b"+
		"\u0666\5\u0084C\2\u065c\u0660\7%\2\2\u065d\u065f\7\7\2\2\u065e\u065d\3"+
		"\2\2\2\u065f\u0662\3\2\2\2\u0660\u065e\3\2\2\2\u0660\u0661\3\2\2\2\u0661"+
		"\u0663\3\2\2\2\u0662\u0660\3\2\2\2\u0663\u0665\5\u0084C\2\u0664\u065c"+
		"\3\2\2\2\u0665\u0668\3\2\2\2\u0666\u0664\3\2\2\2\u0666\u0667\3\2\2\2\u0667"+
		"\u0083\3\2\2\2\u0668\u0666\3\2\2\2\u0669\u0675\5\u0086D\2\u066a\u066e"+
		"\5\u00fc\177\2\u066b\u066d\7\7\2\2\u066c\u066b\3\2\2\2\u066d\u0670\3\2"+
		"\2\2\u066e\u066c\3\2\2\2\u066e\u066f\3\2\2\2\u066f\u0671\3\2\2\2\u0670"+
		"\u066e\3\2\2\2\u0671\u0672\5\u0086D\2\u0672\u0674\3\2\2\2\u0673\u066a"+
		"\3\2\2\2\u0674\u0677\3\2\2\2\u0675\u0673\3\2\2\2\u0675\u0676\3\2\2\2\u0676"+
		"\u0085\3\2\2\2\u0677\u0675\3\2\2\2\u0678\u0684\5\u0088E\2\u0679\u067d"+
		"\5\u00fe\u0080\2\u067a\u067c\7\7\2\2\u067b\u067a\3\2\2\2\u067c\u067f\3"+
		"\2\2\2\u067d\u067b\3\2\2\2\u067d\u067e\3\2\2\2\u067e\u0680\3\2\2\2\u067f"+
		"\u067d\3\2\2\2\u0680\u0681\5\u0088E\2\u0681\u0683\3\2\2\2\u0682\u0679"+
		"\3\2\2\2\u0683\u0686\3\2\2\2\u0684\u0682\3\2\2\2\u0684\u0685\3\2\2\2\u0685"+
		"\u0087\3\2\2\2\u0686\u0684\3\2\2\2\u0687\u0689\5\u008cG\2\u0688\u068a"+
		"\5\u008aF\2\u0689\u0688\3\2\2\2\u0689\u068a\3\2\2\2\u068a\u0089\3\2\2"+
		"\2\u068b\u068d\7\7\2\2\u068c\u068b\3\2\2\2\u068d\u0690\3\2\2\2\u068e\u068c"+
		"\3\2\2\2\u068e\u068f\3\2\2\2\u068f\u0691\3\2\2\2\u0690\u068e\3\2\2\2\u0691"+
		"\u0695\5\u0100\u0081\2\u0692\u0694\7\7\2\2\u0693\u0692\3\2\2\2\u0694\u0697"+
		"\3\2\2\2\u0695\u0693\3\2\2\2\u0695\u0696\3\2\2\2\u0696\u0698\3\2\2\2\u0697"+
		"\u0695\3\2\2\2\u0698\u069a\5P)\2\u0699\u069b\5\u008aF\2\u069a\u0699\3"+
		"\2\2\2\u069a\u069b\3\2\2\2\u069b\u008b\3\2\2\2\u069c\u069e\5\u0102\u0082"+
		"\2\u069d\u069c\3\2\2\2\u069e\u06a1\3\2\2\2\u069f\u069d\3\2\2\2\u069f\u06a0"+
		"\3\2\2\2\u06a0\u06a2\3\2\2\2\u06a1\u069f\3\2\2\2\u06a2\u06ab\5\u008eH"+
		"\2\u06a3\u06a5\5\u0120\u0091\2\u06a4\u06a3\3\2\2\2\u06a5\u06a8\3\2\2\2"+
		"\u06a6\u06a4\3\2\2\2\u06a6\u06a7\3\2\2\2\u06a7\u06a9\3\2\2\2\u06a8\u06a6"+
		"\3\2\2\2\u06a9\u06ab\5\u008eH\2\u06aa\u069f\3\2\2\2\u06aa\u06a6\3\2\2"+
		"\2\u06ab\u008d\3\2\2\2\u06ac\u06c1\5\u0098M\2\u06ad\u06c1\5\u0090I\2\u06ae"+
		"\u06c1\5\u0092J\2\u06af\u06c1\5\u0094K\2\u06b0\u06b4\5\u0098M\2\u06b1"+
		"\u06b3\5\u0104\u0083\2\u06b2\u06b1\3\2\2\2\u06b3\u06b6\3\2\2\2\u06b4\u06b2"+
		"\3\2\2\2\u06b4\u06b5\3\2\2\2\u06b5\u06c1\3\2\2\2\u06b6\u06b4\3\2\2\2\u06b7"+
		"\u06b8\7\13\2\2\u06b8\u06b9\5\u00f0y\2\u06b9\u06bb\7\f\2\2\u06ba\u06bc"+
		"\5\u0104\u0083\2\u06bb\u06ba\3\2\2\2\u06bc\u06bd\3\2\2\2\u06bd\u06bb\3"+
		"\2\2\2\u06bd\u06be\3\2\2\2\u06be\u06c1\3\2\2\2\u06bf\u06c1\5\u00f0y\2"+
		"\u06c0\u06ac\3\2\2\2\u06c0\u06ad\3\2\2\2\u06c0\u06ae\3\2\2\2\u06c0\u06af"+
		"\3\2\2\2\u06c0\u06b0\3\2\2\2\u06c0\u06b7\3\2\2\2\u06c0\u06bf\3\2\2\2\u06c1"+
		"\u008f\3\2\2\2\u06c2\u06c4\5\u0096L\2\u06c3\u06c5\5\u00a4S\2\u06c4\u06c3"+
		"\3\2\2\2\u06c4\u06c5\3\2\2\2\u06c5\u06c7\3\2\2\2\u06c6\u06c8\5\u00a2R"+
		"\2\u06c7\u06c6\3\2\2\2\u06c7\u06c8\3\2\2\2\u06c8\u06cc\3\2\2\2\u06c9\u06cb"+
		"\5\u009eP\2\u06ca\u06c9\3\2\2\2\u06cb\u06ce\3\2\2\2\u06cc\u06ca\3\2\2"+
		"\2\u06cc\u06cd\3\2\2\2\u06cd\u0091\3\2\2\2\u06ce\u06cc\3\2\2\2\u06cf\u06d0"+
		"\5\u011e\u0090\2\u06d0\u06d1\5\u008eH\2\u06d1\u0093\3\2\2\2\u06d2\u06dc"+
		"\5\u0098M\2\u06d3\u06d5\7\7\2\2\u06d4\u06d3\3\2\2\2\u06d5\u06d8\3\2\2"+
		"\2\u06d6\u06d4\3\2\2\2\u06d6\u06d7\3\2\2\2\u06d7\u06d9\3\2\2\2\u06d8\u06d6"+
		"\3\2\2\2\u06d9\u06da\5\u0106\u0084\2\u06da\u06db\5\u008eH\2\u06db\u06dd"+
		"\3\2\2\2\u06dc\u06d6\3\2\2\2\u06dd\u06de\3\2\2\2\u06de\u06dc\3\2\2\2\u06de"+
		"\u06df\3\2\2\2\u06df\u0095\3\2\2\2\u06e0\u06e3\5\u00acW\2\u06e1\u06e3"+
		"\5\u009aN\2\u06e2\u06e0\3\2\2\2\u06e2\u06e1\3\2\2\2\u06e3\u0097\3\2\2"+
		"\2\u06e4\u06e7\5\u00aeX\2\u06e5\u06e7\5\u009aN\2\u06e6\u06e4\3\2\2\2\u06e6"+
		"\u06e5\3\2\2\2\u06e7\u0099\3\2\2\2\u06e8\u06ea\5\u012a\u0096\2\u06e9\u06eb"+
		"\5\u00a0Q\2\u06ea\u06e9\3\2\2\2\u06eb\u06ec\3\2\2\2\u06ec\u06ea\3\2\2"+
		"\2\u06ec\u06ed\3\2\2\2\u06ed\u009b\3\2\2\2\u06ee\u06f0\5\u00a4S\2\u06ef"+
		"\u06ee\3\2\2\2\u06ef\u06f0\3\2\2\2\u06f0\u06f1\3\2\2\2\u06f1\u06f5\5\u00a2"+
		"R\2\u06f2\u06f4\5\u009eP\2\u06f3\u06f2\3\2\2\2\u06f4\u06f7\3\2\2\2\u06f5"+
		"\u06f3\3\2\2\2\u06f5\u06f6\3\2\2\2\u06f6\u0700\3\2\2\2\u06f7\u06f5\3\2"+
		"\2\2\u06f8\u06fc\5\u00a4S\2\u06f9\u06fb\5\u009eP\2\u06fa\u06f9\3\2\2\2"+
		"\u06fb\u06fe\3\2\2\2\u06fc\u06fa\3\2\2\2\u06fc\u06fd\3\2\2\2\u06fd\u0700"+
		"\3\2\2\2\u06fe\u06fc\3\2\2\2\u06ff\u06ef\3\2\2\2\u06ff\u06f8\3\2\2\2\u0700"+
		"\u009d\3\2\2\2\u0701\u0703\5\u0128\u0095\2\u0702\u0701\3\2\2\2\u0703\u0706"+
		"\3\2\2\2\u0704\u0702\3\2\2\2\u0704\u0705\3\2\2\2\u0705\u0708\3\2\2\2\u0706"+
		"\u0704\3\2\2\2\u0707\u0709\7\u0091\2\2\u0708\u0707\3\2\2\2\u0708\u0709"+
		"\3\2\2\2\u0709\u070d\3\2\2\2\u070a\u070c\7\7\2\2\u070b\u070a\3\2\2\2\u070c"+
		"\u070f\3\2\2\2\u070d\u070b\3\2\2\2\u070d\u070e\3\2\2\2\u070e\u0710\3\2"+
		"\2\2\u070f\u070d\3\2\2\2\u0710\u0711\5\u00c2b\2\u0711\u009f\3\2\2\2\u0712"+
		"\u071b\7\r\2\2\u0713\u0718\5r:\2\u0714\u0715\7\n\2\2\u0715\u0717\5r:\2"+
		"\u0716\u0714\3\2\2\2\u0717\u071a\3\2\2\2\u0718\u0716\3\2\2\2\u0718\u0719"+
		"\3\2\2\2\u0719\u071c\3\2\2\2\u071a\u0718\3\2\2\2\u071b\u0713\3\2\2\2\u071b"+
		"\u071c\3\2\2\2\u071c\u071d\3\2\2\2\u071d\u071e\7\16\2\2\u071e\u00a1\3"+
		"\2\2\2\u071f\u0721\7\13\2\2\u0720\u0722\5\u00aaV\2\u0721\u0720\3\2\2\2"+
		"\u0721\u0722\3\2\2\2\u0722\u0723\3\2\2\2\u0723\u0730\7\f\2\2\u0724\u0725"+
		"\7\13\2\2\u0725\u072a\5\u00aaV\2\u0726\u0727\7\n\2\2\u0727\u0729\5\u00aa"+
		"V\2\u0728\u0726\3\2\2\2\u0729\u072c\3\2\2\2\u072a\u0728\3\2\2\2\u072a"+
		"\u072b\3\2\2\2\u072b\u072d\3\2\2\2\u072c\u072a\3\2\2\2\u072d\u072e\7\f"+
		"\2\2\u072e\u0730\3\2\2\2\u072f\u071f\3\2\2\2\u072f\u0724\3\2\2\2\u0730"+
		"\u00a3\3\2\2\2\u0731\u0735\7-\2\2\u0732\u0734\7\7\2\2\u0733\u0732\3\2"+
		"\2\2\u0734\u0737\3\2\2\2\u0735\u0733\3\2\2\2\u0735\u0736\3\2\2\2\u0736"+
		"\u0738\3\2\2\2\u0737\u0735\3\2\2\2\u0738\u0743\5\u00a6T\2\u0739\u073b"+
		"\7\7\2\2\u073a\u0739\3\2\2\2\u073b\u073e\3\2\2\2\u073c\u073a\3\2\2\2\u073c"+
		"\u073d\3\2\2\2\u073d\u073f\3\2\2\2\u073e\u073c\3\2\2\2\u073f\u0740\7\n"+
		"\2\2\u0740\u0742\5\u00a6T\2\u0741\u073c\3\2\2\2\u0742\u0745\3\2\2\2\u0743"+
		"\u0741\3\2\2\2\u0743\u0744\3\2\2\2\u0744\u0749\3\2\2\2\u0745\u0743\3\2"+
		"\2\2\u0746\u0748\7\7\2\2\u0747\u0746\3\2\2\2\u0748\u074b\3\2\2\2\u0749"+
		"\u0747\3\2\2\2\u0749\u074a\3\2\2\2\u074a\u074c\3\2\2\2\u074b\u0749\3\2"+
		"\2\2\u074c\u074d\7.\2\2\u074d\u00a5\3\2\2\2\u074e\u0750\5\u00a8U\2\u074f"+
		"\u074e\3\2\2\2\u074f\u0750\3\2\2\2\u0750\u0751\3\2\2\2\u0751\u0754\5P"+
		")\2\u0752\u0754\7\21\2\2\u0753\u074f\3\2\2\2\u0753\u0752\3\2\2\2\u0754"+
		"\u00a7\3\2\2\2\u0755\u0757\5\u0112\u008a\2\u0756\u0755\3\2\2\2\u0757\u0758"+
		"\3\2\2\2\u0758\u0756\3\2\2\2\u0758\u0759\3\2\2\2\u0759\u00a9\3\2\2\2\u075a"+
		"\u075e\5\u012c\u0097\2\u075b\u075d\7\7\2\2\u075c\u075b\3\2\2\2\u075d\u0760"+
		"\3\2\2\2\u075e\u075c\3\2\2\2\u075e\u075f\3\2\2\2\u075f\u0761\3\2\2\2\u0760"+
		"\u075e\3\2\2\2\u0761\u0765\7\35\2\2\u0762\u0764\7\7\2\2\u0763\u0762\3"+
		"\2\2\2\u0764\u0767\3\2\2\2\u0765\u0763\3\2\2\2\u0765\u0766\3\2\2\2\u0766"+
		"\u0769\3\2\2\2\u0767\u0765\3\2\2\2\u0768\u075a\3\2\2\2\u0768\u0769\3\2"+
		"\2\2\u0769\u076b\3\2\2\2\u076a\u076c\7\21\2\2\u076b\u076a\3\2\2\2\u076b"+
		"\u076c\3\2\2\2\u076c\u0770\3\2\2\2\u076d\u076f\7\7\2\2\u076e\u076d\3\2"+
		"\2\2\u076f\u0772\3\2\2\2\u0770\u076e\3\2\2\2\u0770\u0771\3\2\2\2\u0771"+
		"\u0773\3\2\2\2\u0772\u0770\3\2\2\2\u0773\u0774\5r:\2\u0774\u00ab\3\2\2"+
		"\2\u0775\u0782\5\u00b0Y\2\u0776\u0782\5\u00b4[\2\u0777\u0782\5\u012c\u0097"+
		"\2\u0778\u0782\5\u00c2b\2\u0779\u0782\5\u00c8e\2\u077a\u0782\5\u00caf"+
		"\2\u077b\u0782\5\u00ccg\2\u077c\u0782\5\u00ceh\2\u077d\u0782\5\u00d0i"+
		"\2\u077e\u0782\5\u00e0q\2\u077f\u0782\5\u00e6t\2\u0780\u0782\5\u00eex"+
		"\2\u0781\u0775\3\2\2\2\u0781\u0776\3\2\2\2\u0781\u0777\3\2\2\2\u0781\u0778"+
		"\3\2\2\2\u0781\u0779\3\2\2\2\u0781\u077a\3\2\2\2\u0781\u077b\3\2\2\2\u0781"+
		"\u077c\3\2\2\2\u0781\u077d\3\2\2\2\u0781\u077e\3\2\2\2\u0781\u077f\3\2"+
		"\2\2\u0781\u0780\3\2\2\2\u0782\u00ad\3\2\2\2\u0783\u0791\5\u00b0Y\2\u0784"+
		"\u0791\5\u00b2Z\2\u0785\u0791\5\u00b4[\2\u0786\u0791\5\u012c\u0097\2\u0787"+
		"\u0791\5\u00c2b\2\u0788\u0791\5\u00c8e\2\u0789\u0791\5\u00caf\2\u078a"+
		"\u0791\5\u00ccg\2\u078b\u0791\5\u00ceh\2\u078c\u0791\5\u00d0i\2\u078d"+
		"\u0791\5\u00e0q\2\u078e\u0791\5\u00e6t\2\u078f\u0791\5\u00eex\2\u0790"+
		"\u0783\3\2\2\2\u0790\u0784\3\2\2\2\u0790\u0785\3\2\2\2\u0790\u0786\3\2"+
		"\2\2\u0790\u0787\3\2\2\2\u0790\u0788\3\2\2\2\u0790\u0789\3\2\2\2\u0790"+
		"\u078a\3\2\2\2\u0790\u078b\3\2\2\2\u0790\u078c\3\2\2\2\u0790\u078d\3\2"+
		"\2\2\u0790\u078e\3\2\2\2\u0790\u078f\3\2\2\2\u0791\u00af\3\2\2\2\u0792"+
		"\u0793\7\13\2\2\u0793\u0794\5r:\2\u0794\u0795\7\f\2\2\u0795\u00b1\3\2"+
		"\2\2\u0796\u0797\t\5\2\2\u0797\u00b3\3\2\2\2\u0798\u079b\5\u00b6\\\2\u0799"+
		"\u079b\5\u00b8]\2\u079a\u0798\3\2\2\2\u079a\u0799\3\2\2\2\u079b\u00b5"+
		"\3\2\2\2\u079c\u07a1\7\u0083\2\2\u079d\u07a0\5\u00ba^\2\u079e\u07a0\5"+
		"\u00bc_\2\u079f\u079d\3\2\2\2\u079f\u079e\3\2\2\2\u07a0\u07a3\3\2\2\2"+
		"\u07a1\u079f\3\2\2\2\u07a1\u07a2\3\2\2\2\u07a2\u07a4\3\2\2\2\u07a3\u07a1"+
		"\3\2\2\2\u07a4\u07a5\7\u009e\2\2\u07a5\u00b7\3\2\2\2\u07a6\u07ad\7\u0084"+
		"\2\2\u07a7\u07ac\5\u00be`\2\u07a8\u07ac\5\u00c0a\2\u07a9\u07ac\5\u00b6"+
		"\\\2\u07aa\u07ac\7\u00a4\2\2\u07ab\u07a7\3\2\2\2\u07ab\u07a8\3\2\2\2\u07ab"+
		"\u07a9\3\2\2\2\u07ab\u07aa\3\2\2\2\u07ac\u07af\3\2\2\2\u07ad\u07ab\3\2"+
		"\2\2\u07ad\u07ae\3\2\2\2\u07ae\u07b0\3\2\2\2\u07af\u07ad\3\2\2\2\u07b0"+
		"\u07b1\7\u00a3\2\2\u07b1\u00b9\3\2\2\2\u07b2\u07b3\t\6\2\2\u07b3\u00bb"+
		"\3\2\2\2\u07b4\u07b5\7\u00a2\2\2\u07b5\u07b6\5r:\2\u07b6\u07b7\7\20\2"+
		"\2\u07b7\u00bd\3\2\2\2\u07b8\u07b9\t\7\2\2\u07b9\u00bf\3\2\2\2\u07ba\u07bb"+
		"\7\u00a8\2\2\u07bb\u07bc\5r:\2\u07bc\u07bd\7\20\2\2\u07bd\u00c1\3\2\2"+
		"\2\u07be\u07c0\5\u0120\u0091\2\u07bf\u07be\3\2\2\2\u07c0\u07c3\3\2\2\2"+
		"\u07c1\u07bf\3\2\2\2\u07c1\u07c2\3\2\2\2\u07c2\u07f2\3\2\2\2\u07c3\u07c1"+
		"\3\2\2\2\u07c4\u07c8\7\17\2\2\u07c5\u07c7\7\7\2\2\u07c6\u07c5\3\2\2\2"+
		"\u07c7\u07ca\3\2\2\2\u07c8\u07c6\3\2\2\2\u07c8\u07c9\3\2\2\2\u07c9\u07cb"+
		"\3\2\2\2\u07ca\u07c8\3\2\2\2\u07cb\u07cf\5j\66\2\u07cc\u07ce\7\7\2\2\u07cd"+
		"\u07cc\3\2\2\2\u07ce\u07d1\3\2\2\2\u07cf\u07cd\3\2\2\2\u07cf\u07d0\3\2"+
		"\2\2\u07d0\u07d2\3\2\2\2\u07d1\u07cf\3\2\2\2\u07d2\u07d3\7\20\2\2\u07d3"+
		"\u07f3\3\2\2\2\u07d4\u07d8\7\17\2\2\u07d5\u07d7\7\7\2\2\u07d6\u07d5\3"+
		"\2\2\2\u07d7\u07da\3\2\2\2\u07d8\u07d6\3\2\2\2\u07d8\u07d9\3\2\2\2\u07d9"+
		"\u07db\3\2\2\2\u07da\u07d8\3\2\2\2\u07db\u07df\5\u00c4c\2\u07dc\u07de"+
		"\7\7\2\2\u07dd\u07dc\3\2\2\2\u07de\u07e1\3\2\2\2\u07df\u07dd\3\2\2\2\u07df"+
		"\u07e0\3\2\2\2\u07e0\u07e2\3\2\2\2\u07e1\u07df\3\2\2\2\u07e2\u07e6\7#"+
		"\2\2\u07e3\u07e5\7\7\2\2\u07e4\u07e3\3\2\2\2\u07e5\u07e8\3\2\2\2\u07e6"+
		"\u07e4\3\2\2\2\u07e6\u07e7\3\2\2\2\u07e7\u07e9\3\2\2\2\u07e8\u07e6\3\2"+
		"\2\2\u07e9\u07ed\5j\66\2\u07ea\u07ec\7\7\2\2\u07eb\u07ea\3\2\2\2\u07ec"+
		"\u07ef\3\2\2\2\u07ed\u07eb\3\2\2\2\u07ed\u07ee\3\2\2\2\u07ee\u07f0\3\2"+
		"\2\2\u07ef\u07ed\3\2\2\2\u07f0\u07f1\7\20\2\2\u07f1\u07f3\3\2\2\2\u07f2"+
		"\u07c4\3\2\2\2\u07f2\u07d4\3\2\2\2\u07f3\u00c3\3\2\2\2\u07f4\u07f6\5\u00c6"+
		"d\2\u07f5\u07f4\3\2\2\2\u07f5\u07f6\3\2\2\2\u07f6\u0807\3\2\2\2\u07f7"+
		"\u07f9\7\7\2\2\u07f8\u07f7\3\2\2\2\u07f9\u07fc\3\2\2\2\u07fa\u07f8\3\2"+
		"\2\2\u07fa\u07fb\3\2\2\2\u07fb\u07fd\3\2\2\2\u07fc\u07fa\3\2\2\2\u07fd"+
		"\u0801\7\n\2\2\u07fe\u0800\7\7\2\2\u07ff\u07fe\3\2\2\2\u0800\u0803\3\2"+
		"\2\2\u0801\u07ff\3\2\2\2\u0801\u0802\3\2\2\2\u0802\u0804\3\2\2\2\u0803"+
		"\u0801\3\2\2\2\u0804\u0806\5\u00c6d\2\u0805\u07fa\3\2\2\2\u0806\u0809"+
		"\3\2\2\2\u0807\u0805\3\2\2\2\u0807\u0808\3\2\2\2\u0808\u00c5\3\2\2\2\u0809"+
		"\u0807\3\2\2\2\u080a\u081d\5D#\2\u080b\u081a\5B\"\2\u080c\u080e\7\7\2"+
		"\2\u080d\u080c\3\2\2\2\u080e\u0811\3\2\2\2\u080f\u080d\3\2\2\2\u080f\u0810"+
		"\3\2\2\2\u0810\u0812\3\2\2\2\u0811\u080f\3\2\2\2\u0812\u0816\7\33\2\2"+
		"\u0813\u0815\7\7\2\2\u0814\u0813\3\2\2\2\u0815\u0818\3\2\2\2\u0816\u0814"+
		"\3\2\2\2\u0816\u0817\3\2\2\2\u0817\u0819\3\2\2\2\u0818\u0816\3\2\2\2\u0819"+
		"\u081b\5P)\2\u081a\u080f\3\2\2\2\u081a\u081b\3\2\2\2\u081b\u081d\3\2\2"+
		"\2\u081c\u080a\3\2\2\2\u081c\u080b\3\2\2\2\u081d\u00c7\3\2\2\2\u081e\u082d"+
		"\7@\2\2\u081f\u0821\7\7\2\2\u0820\u081f\3\2\2\2\u0821\u0824\3\2\2\2\u0822"+
		"\u0820\3\2\2\2\u0822\u0823\3\2\2\2\u0823\u0825\3\2\2\2\u0824\u0822\3\2"+
		"\2\2\u0825\u0829\7\33\2\2\u0826\u0828\7\7\2\2\u0827\u0826\3\2\2\2\u0828"+
		"\u082b\3\2\2\2\u0829\u0827\3\2\2\2\u0829\u082a\3\2\2\2\u082a\u082c\3\2"+
		"\2\2\u082b\u0829\3\2\2\2\u082c\u082e\5\32\16\2\u082d\u0822\3\2\2\2\u082d"+
		"\u082e\3\2\2\2\u082e\u0832\3\2\2\2\u082f\u0831\7\7\2\2\u0830\u082f\3\2"+
		"\2\2\u0831\u0834\3\2\2\2\u0832\u0830\3\2\2\2\u0832\u0833\3\2\2\2\u0833"+
		"\u0835\3\2\2\2\u0834\u0832\3\2\2\2\u0835\u0836\5\"\22\2\u0836\u00c9\3"+
		"\2\2\2\u0837\u0839\7\r\2\2\u0838\u083a\5r:\2\u0839\u0838\3\2\2\2\u0839"+
		"\u083a\3\2\2\2\u083a\u083f\3\2\2\2\u083b\u083c\7\n\2\2\u083c\u083e\5r"+
		":\2\u083d\u083b\3\2\2\2\u083e\u0841\3\2\2\2\u083f\u083d\3\2\2\2\u083f"+
		"\u0840\3\2\2\2\u0840\u0842\3\2\2\2\u0841\u083f\3\2\2\2\u0842\u0843\7\16"+
		"\2\2\u0843\u00cb\3\2\2\2\u0844\u0846\7H\2\2\u0845\u0847\7\u0090\2\2\u0846"+
		"\u0845\3\2\2\2\u0846\u0847\3\2\2\2\u0847\u00cd\3\2\2\2\u0848\u0859\7I"+
		"\2\2\u0849\u084d\7-\2\2\u084a\u084c\7\7\2\2\u084b\u084a\3\2\2\2\u084c"+
		"\u084f\3\2\2\2\u084d\u084b\3\2\2\2\u084d\u084e\3\2\2\2\u084e\u0850\3\2"+
		"\2\2\u084f\u084d\3\2\2\2\u0850\u0854\5P)\2\u0851\u0853\7\7\2\2\u0852\u0851"+
		"\3\2\2\2\u0853\u0856\3\2\2\2\u0854\u0852\3\2\2\2\u0854\u0855\3\2\2\2\u0855"+
		"\u0857\3\2\2\2\u0856\u0854\3\2\2\2\u0857\u0858\7.\2\2\u0858\u085a\3\2"+
		"\2\2\u0859\u0849\3\2\2\2\u0859\u085a\3\2\2\2\u085a\u085c\3\2\2\2\u085b"+
		"\u085d\7\u0090\2\2\u085c\u085b\3\2\2\2\u085c\u085d\3\2\2\2\u085d\u00cf"+
		"\3\2\2\2\u085e\u0861\5\u00d2j\2\u085f\u0861\5\u00d6l\2\u0860\u085e\3\2"+
		"\2\2\u0860\u085f\3\2\2\2\u0861\u00d1\3\2\2\2\u0862\u0866\7L\2\2\u0863"+
		"\u0865\7\7\2\2\u0864\u0863\3\2\2\2\u0865\u0868\3\2\2\2\u0866\u0864\3\2"+
		"\2\2\u0866\u0867\3\2\2\2\u0867\u0869\3\2\2\2\u0868\u0866\3\2\2\2\u0869"+
		"\u086a\7\13\2\2\u086a\u086b\5r:\2\u086b\u086f\7\f\2\2\u086c\u086e\7\7"+
		"\2\2\u086d\u086c\3\2\2\2\u086e\u0871\3\2\2\2\u086f\u086d\3\2\2\2\u086f"+
		"\u0870\3\2\2\2\u0870\u0873\3\2\2\2\u0871\u086f\3\2\2\2\u0872\u0874\5\u00d4"+
		"k\2\u0873\u0872\3\2\2\2\u0873\u0874\3\2\2\2\u0874\u0876\3\2\2\2\u0875"+
		"\u0877\7\34\2\2\u0876\u0875\3\2\2\2\u0876\u0877\3\2\2\2\u0877\u0888\3"+
		"\2\2\2\u0878\u087a\7\7\2\2\u0879\u0878\3\2\2\2\u087a\u087d\3\2\2\2\u087b"+
		"\u0879\3\2\2\2\u087b\u087c\3\2\2\2\u087c\u087e\3\2\2\2\u087d\u087b\3\2"+
		"\2\2\u087e\u0882\7M\2\2\u087f\u0881\7\7\2\2\u0880\u087f\3\2\2\2\u0881"+
		"\u0884\3\2\2\2\u0882\u0880\3\2\2\2\u0882\u0883\3\2\2\2\u0883\u0886\3\2"+
		"\2\2\u0884\u0882\3\2\2\2\u0885\u0887\5\u00d4k\2\u0886\u0885\3\2\2\2\u0886"+
		"\u0887\3\2\2\2\u0887\u0889\3\2\2\2\u0888\u087b\3\2\2\2\u0888\u0889\3\2"+
		"\2\2\u0889\u00d3\3\2\2\2\u088a\u088d\5h\65\2\u088b\u088d\5r:\2\u088c\u088a"+
		"\3\2\2\2\u088c\u088b\3\2\2\2\u088d\u00d5\3\2\2\2\u088e\u0892\7N\2\2\u088f"+
		"\u0891\7\7\2\2\u0890\u088f\3\2\2\2\u0891\u0894\3\2\2\2\u0892\u0890\3\2"+
		"\2\2\u0892\u0893\3\2\2\2\u0893\u0899\3\2\2\2\u0894\u0892\3\2\2\2\u0895"+
		"\u0896\7\13\2\2\u0896\u0897\5r:\2\u0897\u0898\7\f\2\2\u0898\u089a\3\2"+
		"\2\2\u0899\u0895\3\2\2\2\u0899\u089a\3\2\2\2\u089a\u089e\3\2\2\2\u089b"+
		"\u089d\7\7\2\2\u089c\u089b\3\2\2\2\u089d\u08a0\3\2\2\2\u089e\u089c\3\2"+
		"\2\2\u089e\u089f\3\2\2\2\u089f\u08a1\3\2\2\2\u08a0\u089e\3\2\2\2\u08a1"+
		"\u08a5\7\17\2\2\u08a2\u08a4\7\7\2\2\u08a3\u08a2\3\2\2\2\u08a4\u08a7\3"+
		"\2\2\2\u08a5\u08a3\3\2\2\2\u08a5\u08a6\3\2\2\2\u08a6\u08b1\3\2\2\2\u08a7"+
		"\u08a5\3\2\2\2\u08a8\u08ac\5\u00d8m\2\u08a9\u08ab\7\7\2\2\u08aa\u08a9"+
		"\3\2\2\2\u08ab\u08ae\3\2\2\2\u08ac\u08aa\3\2\2\2\u08ac\u08ad\3\2\2\2\u08ad"+
		"\u08b0\3\2\2\2\u08ae\u08ac\3\2\2\2\u08af\u08a8\3\2\2\2\u08b0\u08b3\3\2"+
		"\2\2\u08b1\u08af\3\2\2\2\u08b1\u08b2\3\2\2\2\u08b2\u08b7\3\2\2\2\u08b3"+
		"\u08b1\3\2\2\2\u08b4\u08b6\7\7\2\2\u08b5\u08b4\3\2\2\2\u08b6\u08b9\3\2"+
		"\2\2\u08b7\u08b5\3\2\2\2\u08b7\u08b8\3\2\2\2\u08b8\u08ba\3\2\2\2\u08b9"+
		"\u08b7\3\2\2\2\u08ba\u08bb\7\20\2\2\u08bb\u00d7\3\2\2\2\u08bc\u08cd\5"+
		"\u00dan\2\u08bd\u08bf\7\7\2\2\u08be\u08bd\3\2\2\2\u08bf\u08c2\3\2\2\2"+
		"\u08c0\u08be\3\2\2\2\u08c0\u08c1\3\2\2\2\u08c1\u08c3\3\2\2\2\u08c2\u08c0"+
		"\3\2\2\2\u08c3\u08c7\7\n\2\2\u08c4\u08c6\7\7\2\2\u08c5\u08c4\3\2\2\2\u08c6"+
		"\u08c9\3\2\2\2\u08c7\u08c5\3\2\2\2\u08c7\u08c8\3\2\2\2\u08c8\u08ca\3\2"+
		"\2\2\u08c9\u08c7\3\2\2\2\u08ca\u08cc\5\u00dan\2\u08cb\u08c0\3\2\2\2\u08cc"+
		"\u08cf\3\2\2\2\u08cd\u08cb\3\2\2\2\u08cd\u08ce\3\2\2\2\u08ce\u08d3\3\2"+
		"\2\2\u08cf\u08cd\3\2\2\2\u08d0\u08d2\7\7\2\2\u08d1\u08d0\3\2\2\2\u08d2"+
		"\u08d5\3\2\2\2\u08d3\u08d1\3\2\2\2\u08d3\u08d4\3\2\2\2\u08d4\u08d6\3\2"+
		"\2\2\u08d5\u08d3\3\2\2\2\u08d6\u08da\7#\2\2\u08d7\u08d9\7\7\2\2\u08d8"+
		"\u08d7\3\2\2\2\u08d9\u08dc\3\2\2\2\u08da\u08d8\3\2\2\2\u08da\u08db\3\2"+
		"\2\2\u08db\u08dd\3\2\2\2\u08dc\u08da\3\2\2\2\u08dd\u08df\5\u00d4k\2\u08de"+
		"\u08e0\5\u012e\u0098\2\u08df\u08de\3\2\2\2\u08df\u08e0\3\2\2\2\u08e0\u08f1"+
		"\3\2\2\2\u08e1\u08e5\7M\2\2\u08e2\u08e4\7\7\2\2\u08e3\u08e2\3\2\2\2\u08e4"+
		"\u08e7\3\2\2\2\u08e5\u08e3\3\2\2\2\u08e5\u08e6\3\2\2\2\u08e6\u08e8\3\2"+
		"\2\2\u08e7\u08e5\3\2\2\2\u08e8\u08ec\7#\2\2\u08e9\u08eb\7\7\2\2\u08ea"+
		"\u08e9\3\2\2\2\u08eb\u08ee\3\2\2\2\u08ec\u08ea\3\2\2\2\u08ec\u08ed\3\2"+
		"\2\2\u08ed\u08ef\3\2\2\2\u08ee\u08ec\3\2\2\2\u08ef\u08f1\5\u00d4k\2\u08f0"+
		"\u08bc\3\2\2\2\u08f0\u08e1\3\2\2\2\u08f1\u00d9\3\2\2\2\u08f2\u08f6\5r"+
		":\2\u08f3\u08f6\5\u00dco\2\u08f4\u08f6\5\u00dep\2\u08f5\u08f2\3\2\2\2"+
		"\u08f5\u08f3\3\2\2\2\u08f5\u08f4\3\2\2\2\u08f6\u00db\3\2\2\2\u08f7\u08fb"+
		"\5\u00f8}\2\u08f8\u08fa\7\7\2\2\u08f9\u08f8\3\2\2\2\u08fa\u08fd\3\2\2"+
		"\2\u08fb\u08f9\3\2\2\2\u08fb\u08fc\3\2\2\2\u08fc\u08fe\3\2\2\2\u08fd\u08fb"+
		"\3\2\2\2\u08fe\u08ff\5r:\2\u08ff\u00dd\3\2\2\2\u0900\u0904\5\u00fa~\2"+
		"\u0901\u0903\7\7\2\2\u0902\u0901\3\2\2\2\u0903\u0906\3\2\2\2\u0904\u0902"+
		"\3\2\2\2\u0904\u0905\3\2\2\2\u0905\u0907\3\2\2\2\u0906\u0904\3\2\2\2\u0907"+
		"\u0908\5P)\2\u0908\u00df\3\2\2\2\u0909\u090d\7O\2\2\u090a\u090c\7\7\2"+
		"\2\u090b\u090a\3\2\2\2\u090c\u090f\3\2\2\2\u090d\u090b\3\2\2\2\u090d\u090e"+
		"\3\2\2\2\u090e\u0910\3\2\2\2\u090f\u090d\3\2\2\2\u0910\u091a\5h\65\2\u0911"+
		"\u0913\7\7\2\2\u0912\u0911\3\2\2\2\u0913\u0916\3\2\2\2\u0914\u0912\3\2"+
		"\2\2\u0914\u0915\3\2\2\2\u0915\u0917\3\2\2\2\u0916\u0914\3\2\2\2\u0917"+
		"\u0919\5\u00e2r\2\u0918\u0914\3\2\2\2\u0919\u091c\3\2\2\2\u091a\u0918"+
		"\3\2\2\2\u091a\u091b\3\2\2\2\u091b\u0924\3\2\2\2\u091c\u091a\3\2\2\2\u091d"+
		"\u091f\7\7\2\2";
	private static final String _serializedATNSegment1 =
		"\u091e\u091d\3\2\2\2\u091f\u0922\3\2\2\2\u0920\u091e\3\2\2\2\u0920\u0921"+
		"\3\2\2\2\u0921\u0923\3\2\2\2\u0922\u0920\3\2\2\2\u0923\u0925\5\u00e4s"+
		"\2\u0924\u0920\3\2\2\2\u0924\u0925\3\2\2\2\u0925\u00e1\3\2\2\2\u0926\u092a"+
		"\7P\2\2\u0927\u0929\7\7\2\2\u0928\u0927\3\2\2\2\u0929\u092c\3\2\2\2\u092a"+
		"\u0928\3\2\2\2\u092a\u092b\3\2\2\2\u092b\u092d\3\2\2\2\u092c\u092a\3\2"+
		"\2\2\u092d\u0931\7\13\2\2\u092e\u0930\5\u0120\u0091\2\u092f\u092e\3\2"+
		"\2\2\u0930\u0933\3\2\2\2\u0931\u092f\3\2\2\2\u0931\u0932\3\2\2\2\u0932"+
		"\u0934\3\2\2\2\u0933\u0931\3\2\2\2\u0934\u0935\5\u012c\u0097\2\u0935\u0936"+
		"\7\33\2\2\u0936\u0937\5^\60\2\u0937\u093b\7\f\2\2\u0938\u093a\7\7\2\2"+
		"\u0939\u0938\3\2\2\2\u093a\u093d\3\2\2\2\u093b\u0939\3\2\2\2\u093b\u093c"+
		"\3\2\2\2\u093c\u093e\3\2\2\2\u093d\u093b\3\2\2\2\u093e\u093f\5h\65\2\u093f"+
		"\u00e3\3\2\2\2\u0940\u0944\7Q\2\2\u0941\u0943\7\7\2\2\u0942\u0941\3\2"+
		"\2\2\u0943\u0946\3\2\2\2\u0944\u0942\3\2\2\2\u0944\u0945\3\2\2\2\u0945"+
		"\u0947\3\2\2\2\u0946\u0944\3\2\2\2\u0947\u0948\5h\65\2\u0948\u00e5\3\2"+
		"\2\2\u0949\u094d\5\u00e8u\2\u094a\u094d\5\u00eav\2\u094b\u094d\5\u00ec"+
		"w\2\u094c\u0949\3\2\2\2\u094c\u094a\3\2\2\2\u094c\u094b\3\2\2\2\u094d"+
		"\u00e7\3\2\2\2\u094e\u0952\7R\2\2\u094f\u0951\7\7\2\2\u0950\u094f\3\2"+
		"\2\2\u0951\u0954\3\2\2\2\u0952\u0950\3\2\2\2\u0952\u0953\3\2\2\2\u0953"+
		"\u0955\3\2\2\2\u0954\u0952\3\2\2\2\u0955\u0959\7\13\2\2\u0956\u0958\5"+
		"\u0120\u0091\2\u0957\u0956\3\2\2\2\u0958\u095b\3\2\2\2\u0959\u0957\3\2"+
		"\2\2\u0959\u095a\3\2\2\2\u095a\u095e\3\2\2\2\u095b\u0959\3\2\2\2\u095c"+
		"\u095f\5D#\2\u095d\u095f\5B\"\2\u095e\u095c\3\2\2\2\u095e\u095d\3\2\2"+
		"\2\u095f\u0960\3\2\2\2\u0960\u0961\7[\2\2\u0961\u0962\5r:\2\u0962\u0966"+
		"\7\f\2\2\u0963\u0965\7\7\2\2\u0964\u0963\3\2\2\2\u0965\u0968\3\2\2\2\u0966"+
		"\u0964\3\2\2\2\u0966\u0967\3\2\2\2\u0967\u096a\3\2\2\2\u0968\u0966\3\2"+
		"\2\2\u0969\u096b\5\u00d4k\2\u096a\u0969\3\2\2\2\u096a\u096b\3\2\2\2\u096b"+
		"\u00e9\3\2\2\2\u096c\u0970\7T\2\2\u096d\u096f\7\7\2\2\u096e\u096d\3\2"+
		"\2\2\u096f\u0972\3\2\2\2\u0970\u096e\3\2\2\2\u0970\u0971\3\2\2\2\u0971"+
		"\u0973\3\2\2\2\u0972\u0970\3\2\2\2\u0973\u0974\7\13\2\2\u0974\u0975\5"+
		"r:\2\u0975\u0979\7\f\2\2\u0976\u0978\7\7\2\2\u0977\u0976\3\2\2\2\u0978"+
		"\u097b\3\2\2\2\u0979\u0977\3\2\2\2\u0979\u097a\3\2\2\2\u097a\u097d\3\2"+
		"\2\2\u097b\u0979\3\2\2\2\u097c\u097e\5\u00d4k\2\u097d\u097c\3\2\2\2\u097d"+
		"\u097e\3\2\2\2\u097e\u00eb\3\2\2\2\u097f\u0983\7S\2\2\u0980\u0982\7\7"+
		"\2\2\u0981\u0980\3\2\2\2\u0982\u0985\3\2\2\2\u0983\u0981\3\2\2\2\u0983"+
		"\u0984\3\2\2\2\u0984\u0987\3\2\2\2\u0985\u0983\3\2\2\2\u0986\u0988\5\u00d4"+
		"k\2\u0987\u0986\3\2\2\2\u0987\u0988\3\2\2\2\u0988\u098c\3\2\2\2\u0989"+
		"\u098b\7\7\2\2\u098a\u0989\3\2\2\2\u098b\u098e\3\2\2\2\u098c\u098a\3\2"+
		"\2\2\u098c\u098d\3\2\2\2\u098d\u098f\3\2\2\2\u098e\u098c\3\2\2\2\u098f"+
		"\u0993\7T\2\2\u0990\u0992\7\7\2\2\u0991\u0990\3\2\2\2\u0992\u0995\3\2"+
		"\2\2\u0993\u0991\3\2\2\2\u0993\u0994\3\2\2\2\u0994\u0996\3\2\2\2\u0995"+
		"\u0993\3\2\2\2\u0996\u0997\7\13\2\2\u0997\u0998\5r:\2\u0998\u0999\7\f"+
		"\2\2\u0999\u00ed\3\2\2\2\u099a\u099e\7U\2\2\u099b\u099d\7\7\2\2\u099c"+
		"\u099b\3\2\2\2\u099d\u09a0\3\2\2\2\u099e\u099c\3\2\2\2\u099e\u099f\3\2"+
		"\2\2\u099f\u09a1\3\2\2\2\u09a0\u099e\3\2\2\2\u09a1\u09ab\5r:\2\u09a2\u09a4"+
		"\t\b\2\2\u09a3\u09a5\5r:\2\u09a4\u09a3\3\2\2\2\u09a4\u09a5\3\2\2\2\u09a5"+
		"\u09ab\3\2\2\2\u09a6\u09ab\7W\2\2\u09a7\u09ab\78\2\2\u09a8\u09ab\7X\2"+
		"\2\u09a9\u09ab\79\2\2\u09aa\u099a\3\2\2\2\u09aa\u09a2\3\2\2\2\u09aa\u09a6"+
		"\3\2\2\2\u09aa\u09a7\3\2\2\2\u09aa\u09a8\3\2\2\2\u09aa\u09a9\3\2\2\2\u09ab"+
		"\u00ef\3\2\2\2\u09ac\u09b6\5^\60\2\u09ad\u09b1\7+\2\2\u09ae\u09b0\7\7"+
		"\2\2\u09af\u09ae\3\2\2\2\u09b0\u09b3\3\2\2\2\u09b1\u09af\3\2\2\2\u09b1"+
		"\u09b2\3\2\2\2\u09b2\u09b5\3\2\2\2\u09b3\u09b1\3\2\2\2\u09b4\u09ad\3\2"+
		"\2\2\u09b5\u09b8\3\2\2\2\u09b6\u09b4\3\2\2\2\u09b6\u09b7\3\2\2\2\u09b7"+
		"\u09ba\3\2\2\2\u09b8\u09b6\3\2\2\2\u09b9\u09ac\3\2\2\2\u09b9\u09ba\3\2"+
		"\2\2\u09ba\u09be\3\2\2\2\u09bb\u09bd\7\7\2\2\u09bc\u09bb\3\2\2\2\u09bd"+
		"\u09c0\3\2\2\2\u09be\u09bc\3\2\2\2\u09be\u09bf\3\2\2\2\u09bf\u09c1\3\2"+
		"\2\2\u09c0\u09be\3\2\2\2\u09c1\u09c5\t\t\2\2\u09c2\u09c4\7\7\2\2\u09c3"+
		"\u09c2\3\2\2\2\u09c4\u09c7\3\2\2\2\u09c5\u09c3\3\2\2\2\u09c5\u09c6\3\2"+
		"\2\2\u09c6\u09ca\3\2\2\2\u09c7\u09c5\3\2\2\2\u09c8\u09cb\5\u012a\u0096"+
		"\2\u09c9\u09cb\7=\2\2\u09ca\u09c8\3\2\2\2\u09ca\u09c9\3\2\2\2\u09cb\u00f1"+
		"\3\2\2\2\u09cc\u09cd\t\n\2\2\u09cd\u00f3\3\2\2\2\u09ce\u09cf\t\13\2\2"+
		"\u09cf\u00f5\3\2\2\2\u09d0\u09d1\t\f\2\2\u09d1\u00f7\3\2\2\2\u09d2\u09d3"+
		"\t\r\2\2\u09d3\u00f9\3\2\2\2\u09d4\u09d5\t\16\2\2\u09d5\u00fb\3\2\2\2"+
		"\u09d6\u09d7\t\17\2\2\u09d7\u00fd\3\2\2\2\u09d8\u09d9\t\20\2\2\u09d9\u00ff"+
		"\3\2\2\2\u09da\u09db\t\21\2\2\u09db\u0101\3\2\2\2\u09dc\u09dd\t\22\2\2"+
		"\u09dd\u0103\3\2\2\2\u09de\u09e3\7\26\2\2\u09df\u09e3\7\27\2\2\u09e0\u09e1"+
		"\7\32\2\2\u09e1\u09e3\7\32\2\2\u09e2\u09de\3\2\2\2\u09e2\u09df\3\2\2\2"+
		"\u09e2\u09e0\3\2\2\2\u09e3\u0105\3\2\2\2\u09e4\u09e8\7\t\2\2\u09e5\u09e6"+
		"\7+\2\2\u09e6\u09e8\7\t\2\2\u09e7\u09e4\3\2\2\2\u09e7\u09e5\3\2\2\2\u09e8"+
		"\u0107\3\2\2\2\u09e9\u09ec\5\u0120\u0091\2\u09ea\u09ec\5\u010a\u0086\2"+
		"\u09eb\u09e9\3\2\2\2\u09eb\u09ea\3\2\2\2\u09ec\u09ed\3\2\2\2\u09ed\u09eb"+
		"\3\2\2\2\u09ed\u09ee\3\2\2\2\u09ee\u0109\3\2\2\2\u09ef\u09f9\5\u010c\u0087"+
		"\2\u09f0\u09f9\5\u010e\u0088\2\u09f1\u09f9\5\u0110\u0089\2\u09f2\u09f9"+
		"\5\u0112\u008a\2\u09f3\u09f9\5\u0114\u008b\2\u09f4\u09f9\5\u0116\u008c"+
		"\2\u09f5\u09f9\5\u0118\u008d\2\u09f6\u09f9\5\u011a\u008e\2\u09f7\u09f9"+
		"\5\u011c\u008f\2\u09f8\u09ef\3\2\2\2\u09f8\u09f0\3\2\2\2\u09f8\u09f1\3"+
		"\2\2\2\u09f8\u09f2\3\2\2\2\u09f8\u09f3\3\2\2\2\u09f8\u09f4\3\2\2\2\u09f8"+
		"\u09f5\3\2\2\2\u09f8\u09f6\3\2\2\2\u09f8\u09f7\3\2\2\2\u09f9\u09fd\3\2"+
		"\2\2\u09fa\u09fc\7\7\2\2\u09fb\u09fa\3\2\2\2\u09fc\u09ff\3\2\2\2\u09fd"+
		"\u09fb\3\2\2\2\u09fd\u09fe\3\2\2\2\u09fe\u010b\3\2\2\2\u09ff\u09fd\3\2"+
		"\2\2\u0a00\u0a01\t\23\2\2\u0a01\u010d\3\2\2\2\u0a02\u0a03\t\24\2\2\u0a03"+
		"\u010f\3\2\2\2\u0a04\u0a05\t\25\2\2\u0a05\u0111\3\2\2\2\u0a06\u0a07\t"+
		"\26\2\2\u0a07\u0113\3\2\2\2\u0a08\u0a09\t\27\2\2\u0a09\u0115\3\2\2\2\u0a0a"+
		"\u0a0b\7}\2\2\u0a0b\u0117\3\2\2\2\u0a0c\u0a0d\t\30\2\2\u0a0d\u0119\3\2"+
		"\2\2\u0a0e\u0a0f\t\31\2\2\u0a0f\u011b\3\2\2\2\u0a10\u0a11\7\u0082\2\2"+
		"\u0a11\u011d\3\2\2\2\u0a12\u0a16\7\u0091\2\2\u0a13\u0a15\7\7\2\2\u0a14"+
		"\u0a13\3\2\2\2\u0a15\u0a18\3\2\2\2\u0a16\u0a14\3\2\2\2\u0a16\u0a17\3\2"+
		"\2\2\u0a17\u011f\3\2\2\2\u0a18\u0a16\3\2\2\2\u0a19\u0a1c\5\u0122\u0092"+
		"\2\u0a1a\u0a1c\5\u0124\u0093\2\u0a1b\u0a19\3\2\2\2\u0a1b\u0a1a\3\2\2\2"+
		"\u0a1c\u0a20\3\2\2\2\u0a1d\u0a1f\7\7\2\2\u0a1e\u0a1d\3\2\2\2\u0a1f\u0a22"+
		"\3\2\2\2\u0a20\u0a1e\3\2\2\2\u0a20\u0a21\3\2\2\2\u0a21\u0121\3\2\2\2\u0a22"+
		"\u0a20\3\2\2\2\u0a23\u0a27\5\u0126\u0094\2\u0a24\u0a26\7\7\2\2\u0a25\u0a24"+
		"\3\2\2\2\u0a26\u0a29\3\2\2\2\u0a27\u0a25\3\2\2\2\u0a27\u0a28\3\2\2\2\u0a28"+
		"\u0a2a\3\2\2\2\u0a29\u0a27\3\2\2\2\u0a2a\u0a2e\7\33\2\2\u0a2b\u0a2d\7"+
		"\7\2\2\u0a2c\u0a2b\3\2\2\2\u0a2d\u0a30\3\2\2\2\u0a2e\u0a2c\3\2\2\2\u0a2e"+
		"\u0a2f\3\2\2\2\u0a2f\u0a31\3\2\2\2\u0a30\u0a2e\3\2\2\2\u0a31\u0a32\5\u0128"+
		"\u0095\2\u0a32\u0a47\3\2\2\2\u0a33\u0a3b\7\u0090\2\2\u0a34\u0a36\7\7\2"+
		"\2\u0a35\u0a34\3\2\2\2\u0a36\u0a39\3\2\2\2\u0a37\u0a35\3\2\2\2\u0a37\u0a38"+
		"\3\2\2\2\u0a38\u0a3a\3\2\2\2\u0a39\u0a37\3\2\2\2\u0a3a\u0a3c\5\u00a4S"+
		"\2\u0a3b\u0a37\3\2\2\2\u0a3b\u0a3c\3\2\2\2\u0a3c\u0a44\3\2\2\2\u0a3d\u0a3f"+
		"\7\7\2\2\u0a3e\u0a3d\3\2\2\2\u0a3f\u0a42\3\2\2\2\u0a40\u0a3e\3\2\2\2\u0a40"+
		"\u0a41\3\2\2\2\u0a41\u0a43\3\2\2\2\u0a42\u0a40\3\2\2\2\u0a43\u0a45\5\u00a2"+
		"R\2\u0a44\u0a40\3\2\2\2\u0a44\u0a45\3\2\2\2\u0a45\u0a47\3\2\2\2\u0a46"+
		"\u0a23\3\2\2\2\u0a46\u0a33\3\2\2\2\u0a47\u0123\3\2\2\2\u0a48\u0a49\5\u0126"+
		"\u0094\2\u0a49\u0a4a\7\33\2\2\u0a4a\u0a4c\7\r\2\2\u0a4b\u0a4d\5\u0128"+
		"\u0095\2\u0a4c\u0a4b\3\2\2\2\u0a4d\u0a4e\3\2\2\2\u0a4e\u0a4c\3\2\2\2\u0a4e"+
		"\u0a4f\3\2\2\2\u0a4f\u0a50\3\2\2\2\u0a50\u0a51\7\16\2\2\u0a51\u0a5c\3"+
		"\2\2\2\u0a52\u0a53\7*\2\2\u0a53\u0a55\7\r\2\2\u0a54\u0a56\5\u0128\u0095"+
		"\2\u0a55\u0a54\3\2\2\2\u0a56\u0a57\3\2\2\2\u0a57\u0a55\3\2\2\2\u0a57\u0a58"+
		"\3\2\2\2\u0a58\u0a59\3\2\2\2\u0a59\u0a5a\7\16\2\2\u0a5a\u0a5c\3\2\2\2"+
		"\u0a5b\u0a48\3\2\2\2\u0a5b\u0a52\3\2\2\2\u0a5c\u0125\3\2\2\2\u0a5d\u0a5e"+
		"\t\32\2\2\u0a5e\u0127\3\2\2\2\u0a5f\u0a61\5\u012a\u0096\2\u0a60\u0a62"+
		"\5\u00a4S\2\u0a61\u0a60\3\2\2\2\u0a61\u0a62\3\2\2\2\u0a62\u0a64\3\2\2"+
		"\2\u0a63\u0a65\5\u00a2R\2\u0a64\u0a63\3\2\2\2\u0a64\u0a65\3\2\2\2\u0a65"+
		"\u0129\3\2\2\2\u0a66\u0a71\5\u012c\u0097\2\u0a67\u0a69\7\7\2\2\u0a68\u0a67"+
		"\3\2\2\2\u0a69\u0a6c\3\2\2\2\u0a6a\u0a68\3\2\2\2\u0a6a\u0a6b\3\2\2\2\u0a6b"+
		"\u0a6d\3\2\2\2\u0a6c\u0a6a\3\2\2\2\u0a6d\u0a6e\7\t\2\2\u0a6e\u0a70\5\u012c"+
		"\u0097\2\u0a6f\u0a6a\3\2\2\2\u0a70\u0a73\3\2\2\2\u0a71\u0a6f\3\2\2\2\u0a71"+
		"\u0a72\3\2\2\2\u0a72\u012b\3\2\2\2\u0a73\u0a71\3\2\2\2\u0a74\u0a75\t\33"+
		"\2\2\u0a75\u012d\3\2\2\2\u0a76\u0a78\7\7\2\2\u0a77\u0a76\3\2\2\2\u0a78"+
		"\u0a79\3\2\2\2\u0a79\u0a77\3\2\2\2\u0a79\u0a7a\3\2\2\2\u0a7a\u0a83\3\2"+
		"\2\2\u0a7b\u0a83\7\34\2\2\u0a7c\u0a7e\7\34\2\2\u0a7d\u0a7f\7\7\2\2\u0a7e"+
		"\u0a7d\3\2\2\2\u0a7f\u0a80\3\2\2\2\u0a80\u0a7e\3\2\2\2\u0a80\u0a81\3\2"+
		"\2\2\u0a81\u0a83\3\2\2\2\u0a82\u0a77\3\2\2\2\u0a82\u0a7b\3\2\2\2\u0a82"+
		"\u0a7c\3\2\2\2\u0a83\u012f\3\2\2\2\u0199\u0133\u0137\u013e\u0146\u014a"+
		"\u0150\u0154\u015f\u0164\u0167\u016b\u0170\u0172\u0177\u017f\u0182\u018c"+
		"\u018f\u0192\u0198\u019f\u01a3\u01a8\u01ac\u01b1\u01b8\u01bc\u01c1\u01c5"+
		"\u01ca\u01d1\u01d5\u01d8\u01de\u01e1\u01eb\u01ee\u01f3\u01f6\u01fd\u0202"+
		"\u0209\u0210\u0216\u021c\u0225\u022c\u0235\u023b\u0241\u024e\u0251\u0257"+
		"\u025d\u0263\u026a\u0271\u0275\u027a\u0283\u028b\u028f\u0295\u0299\u029e"+
		"\u02a5\u02ab\u02ae\u02b3\u02bc\u02c1\u02c4\u02ca\u02ce\u02d3\u02d7\u02dc"+
		"\u02e0\u02e3\u02e9\u02f0\u02f5\u02fa\u02fe\u0303\u0307\u030c\u0313\u031a"+
		"\u031e\u0323\u0327\u032c\u0330\u0338\u033b\u0340\u0345\u0350\u0354\u0357"+
		"\u035d\u0364\u0368\u036d\u0374\u0378\u037d\u0381\u0384\u038a\u038e\u0394"+
		"\u0398\u039d\u03a4\u03a8\u03ad\u03b1\u03b4\u03ba\u03be\u03c3\u03ca\u03cf"+
		"\u03d4\u03d9\u03de\u03e2\u03e7\u03ee\u03f2\u03f5\u03f8\u03fd\u0401\u0404"+
		"\u0409\u040d\u040f\u0417\u041f\u0422\u0426\u042c\u0434\u043b\u043f\u0444"+
		"\u044c\u0450\u0452\u0455\u0459\u045f\u0465\u0467\u046c\u0472\u0477\u047a"+
		"\u0480\u0487\u048b\u0490\u0497\u04a0\u04a7\u04ae\u04b4\u04ba\u04c0\u04c5"+
		"\u04cc\u04d3\u04d7\u04da\u04e1\u04e8\u04eb\u04ed\u04f5\u04fa\u0500\u0508"+
		"\u050e\u0515\u0518\u051e\u0525\u0529\u052e\u0534\u053b\u0541\u0548\u054c"+
		"\u0551\u0556\u055a\u0563\u056a\u0571\u0577\u057d\u0584\u058b\u0594\u059c"+
		"\u05a1\u05a3\u05a8\u05b2\u05b7\u05b9\u05be\u05c3\u05ca\u05d1\u05dc\u05e3"+
		"\u05e9\u05f0\u05f7\u05fd\u0605\u060c\u0614\u0619\u0620\u0627\u062f\u0634"+
		"\u0636\u063c\u0643\u0649\u0651\u0658\u0660\u0666\u066e\u0675\u067d\u0684"+
		"\u0689\u068e\u0695\u069a\u069f\u06a6\u06aa\u06b4\u06bd\u06c0\u06c4\u06c7"+
		"\u06cc\u06d6\u06de\u06e2\u06e6\u06ec\u06ef\u06f5\u06fc\u06ff\u0704\u0708"+
		"\u070d\u0718\u071b\u0721\u072a\u072f\u0735\u073c\u0743\u0749\u074f\u0753"+
		"\u0758\u075e\u0765\u0768\u076b\u0770\u0781\u0790\u079a\u079f\u07a1\u07ab"+
		"\u07ad\u07c1\u07c8\u07cf\u07d8\u07df\u07e6\u07ed\u07f2\u07f5\u07fa\u0801"+
		"\u0807\u080f\u0816\u081a\u081c\u0822\u0829\u082d\u0832\u0839\u083f\u0846"+
		"\u084d\u0854\u0859\u085c\u0860\u0866\u086f\u0873\u0876\u087b\u0882\u0886"+
		"\u0888\u088c\u0892\u0899\u089e\u08a5\u08ac\u08b1\u08b7\u08c0\u08c7\u08cd"+
		"\u08d3\u08da\u08df\u08e5\u08ec\u08f0\u08f5\u08fb\u0904\u090d\u0914\u091a"+
		"\u0920\u0924\u092a\u0931\u093b\u0944\u094c\u0952\u0959\u095e\u0966\u096a"+
		"\u0970\u0979\u097d\u0983\u0987\u098c\u0993\u099e\u09a4\u09aa\u09b1\u09b6"+
		"\u09b9\u09be\u09c5\u09ca\u09e2\u09e7\u09eb\u09ed\u09f8\u09fd\u0a16\u0a1b"+
		"\u0a20\u0a27\u0a2e\u0a37\u0a3b\u0a40\u0a44\u0a46\u0a4e\u0a57\u0a5b\u0a61"+
		"\u0a64\u0a6a\u0a71\u0a79\u0a80\u0a82";
	public static final String _serializedATN = Utils.join(
		new String[] {
			_serializedATNSegment0,
			_serializedATNSegment1
		},
		""
	);
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}