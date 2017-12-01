// Generated from src\org\cmpiler\kotlin\antlr\KotlinParser.g4 by ANTLR 4.7
package org.cmpiler.kotlin.antlr;

import org.antlr.symtab.*;
import org.antlr.v4.runtime.misc.Utils;

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
		HexLiteral=136, BinLiteral=137, BooleanLiteral=138, NullLiteral=139, Identifier=140, 
		LabelReference=141, LabelDefinition=142, FieldIdentifier=143, CharacterLiteral=144, 
		UNICODE_CLASS_LL=145, UNICODE_CLASS_LM=146, UNICODE_CLASS_LO=147, UNICODE_CLASS_LT=148, 
		UNICODE_CLASS_LU=149, UNICODE_CLASS_ND=150, UNICODE_CLASS_NL=151, Inside_Comment=152, 
		Inside_WS=153, Inside_NL=154, QUOTE_CLOSE=155, LineStrRef=156, LineStrText=157, 
		LineStrEscapedChar=158, LineStrExprStart=159, TRIPLE_QUOTE_CLOSE=160, 
		MultiLineStringQuote=161, MultiLineStrRef=162, MultiLineStrText=163, MultiLineStrEscapedChar=164, 
		MultiLineStrExprStart=165, MultiLineNL=166, StrExpr_IN=167, StrExpr_Comment=168, 
		StrExpr_WS=169, StrExpr_NL=170;
	public static final int
		RULE_kotlinFile = 0, RULE_packageHeader = 1, RULE_importList = 2, RULE_importHeader = 3, 
		RULE_importAlias = 4, RULE_topLevelObject = 5, RULE_classDeclaration = 6, 
		RULE_primaryConstructor = 7, RULE_classParameters = 8, RULE_classParameter = 9, 
		RULE_delegationSpecifiers = 10, RULE_delegationSpecifier = 11, RULE_constructorInvocation = 12, 
		RULE_explicitDelegation = 13, RULE_classBody = 14, RULE_classMemberDeclaration = 15, 
		RULE_anonymousInitializer = 16, RULE_secondaryConstructor = 17, RULE_constructorDelegationCall = 18, 
		RULE_enumClassBody = 19, RULE_enumEntries = 20, RULE_enumEntry = 21, RULE_functionDeclaration = 22, 
		RULE_functionValueParameters = 23, RULE_functionValueParameter = 24, RULE_parameter = 25, 
		RULE_functionBody = 26, RULE_propertyDeclaration = 27, RULE_multiVariableDeclaration = 28, 
		RULE_variableDeclaration = 29, RULE_getter = 30, RULE_setter = 31, RULE_typeAlias = 32, 
		RULE_typeParameters = 33, RULE_typeParameter = 34, RULE_type = 35, RULE_typeModifierList = 36, 
		RULE_parenthesizedType = 37, RULE_nullableType = 38, RULE_typeReference = 39, 
		RULE_functionType = 40, RULE_functionTypeReceiver = 41, RULE_userType = 42, 
		RULE_simpleUserType = 43, RULE_functionTypeParameters = 44, RULE_typeConstraints = 45, 
		RULE_typeConstraint = 46, RULE_block = 47, RULE_statements = 48, RULE_statement = 49, 
		RULE_declaration = 50, RULE_assignment = 51, RULE_expression = 52, RULE_disjunction = 53, 
		RULE_conjunction = 54, RULE_equality = 55, RULE_comparison = 56, RULE_infixOperation = 57, 
		RULE_elvisExpression = 58, RULE_infixFunctionCall = 59, RULE_rangeExpression = 60, 
		RULE_additiveExpression = 61, RULE_multiplicativeExpression = 62, RULE_asExpression = 63, 
		RULE_asExpressionTail = 64, RULE_prefixUnaryExpression = 65, RULE_postfixUnaryExpression = 66, 
		RULE_callExpression = 67, RULE_labeledExpression = 68, RULE_dotQualifiedExpression = 69, 
		RULE_assignableExpression = 70, RULE_indexingExpression = 71, RULE_callSuffix = 72, 
		RULE_annotatedLambda = 73, RULE_arrayAccess = 74, RULE_valueArguments = 75, 
		RULE_typeArguments = 76, RULE_typeProjection = 77, RULE_typeProjectionModifierList = 78, 
		RULE_valueArgument = 79, RULE_primaryExpression = 80, RULE_parenthesizedExpression = 81, 
		RULE_literalConstant = 82, RULE_stringLiteral = 83, RULE_lineStringLiteral = 84, 
		RULE_multiLineStringLiteral = 85, RULE_lineStringContent = 86, RULE_lineStringExpression = 87, 
		RULE_multiLineStringContent = 88, RULE_multiLineStringExpression = 89, 
		RULE_functionLiteral = 90, RULE_lambdaParameters = 91, RULE_lambdaParameter = 92, 
		RULE_objectLiteral = 93, RULE_collectionLiteral = 94, RULE_thisExpression = 95, 
		RULE_superExpression = 96, RULE_conditionalExpression = 97, RULE_ifExpression = 98, 
		RULE_controlStructureBody = 99, RULE_whenExpression = 100, RULE_whenEntry = 101, 
		RULE_whenCondition = 102, RULE_rangeTest = 103, RULE_typeTest = 104, RULE_tryExpression = 105, 
		RULE_catchBlock = 106, RULE_finallyBlock = 107, RULE_loopExpression = 108, 
		RULE_forExpression = 109, RULE_whileExpression = 110, RULE_doWhileExpression = 111, 
		RULE_jumpExpression = 112, RULE_callableReference = 113, RULE_assignmentOperator = 114, 
		RULE_equalityOperator = 115, RULE_comparisonOperator = 116, RULE_inOperator = 117, 
		RULE_isOperator = 118, RULE_additiveOperator = 119, RULE_multiplicativeOperator = 120, 
		RULE_asOperator = 121, RULE_prefixUnaryOperator = 122, RULE_postfixUnaryOperator = 123, 
		RULE_memberAccessOperator = 124, RULE_modifierList = 125, RULE_modifier = 126, 
		RULE_classModifier = 127, RULE_memberModifier = 128, RULE_visibilityModifier = 129, 
		RULE_varianceAnnotation = 130, RULE_functionModifier = 131, RULE_propertyModifier = 132, 
		RULE_inheritanceModifier = 133, RULE_parameterModifier = 134, RULE_typeParameterModifier = 135, 
		RULE_labelDefinition = 136, RULE_annotations = 137, RULE_annotation = 138, 
		RULE_annotationList = 139, RULE_annotationUseSiteTarget = 140, RULE_unescapedAnnotation = 141, 
		RULE_identifier = 142, RULE_simpleIdentifier = 143, RULE_semi = 144;
	public static final String[] ruleNames = {
		"kotlinFile", "packageHeader", "importList", "importHeader", "importAlias", 
		"topLevelObject", "classDeclaration", "primaryConstructor", "classParameters", 
		"classParameter", "delegationSpecifiers", "delegationSpecifier", "constructorInvocation", 
		"explicitDelegation", "classBody", "classMemberDeclaration", "anonymousInitializer", 
		"secondaryConstructor", "constructorDelegationCall", "enumClassBody", 
		"enumEntries", "enumEntry", "functionDeclaration", "functionValueParameters", 
		"functionValueParameter", "parameter", "functionBody", "propertyDeclaration", 
		"multiVariableDeclaration", "variableDeclaration", "getter", "setter", 
		"typeAlias", "typeParameters", "typeParameter", "type", "typeModifierList", 
		"parenthesizedType", "nullableType", "typeReference", "functionType", 
		"functionTypeReceiver", "userType", "simpleUserType", "functionTypeParameters", 
		"typeConstraints", "typeConstraint", "block", "statements", "statement", 
		"declaration", "assignment", "expression", "disjunction", "conjunction", 
		"equality", "comparison", "infixOperation", "elvisExpression", "infixFunctionCall", 
		"rangeExpression", "additiveExpression", "multiplicativeExpression", "asExpression", 
		"asExpressionTail", "prefixUnaryExpression", "postfixUnaryExpression", 
		"callExpression", "labeledExpression", "dotQualifiedExpression", "assignableExpression", 
		"indexingExpression", "callSuffix", "annotatedLambda", "arrayAccess", 
		"valueArguments", "typeArguments", "typeProjection", "typeProjectionModifierList", 
		"valueArgument", "primaryExpression", "parenthesizedExpression", "literalConstant", 
		"stringLiteral", "lineStringLiteral", "multiLineStringLiteral", "lineStringContent", 
		"lineStringExpression", "multiLineStringContent", "multiLineStringExpression", 
		"functionLiteral", "lambdaParameters", "lambdaParameter", "objectLiteral", 
		"collectionLiteral", "thisExpression", "superExpression", "conditionalExpression", 
		"ifExpression", "controlStructureBody", "whenExpression", "whenEntry", 
		"whenCondition", "rangeTest", "typeTest", "tryExpression", "catchBlock", 
		"finallyBlock", "loopExpression", "forExpression", "whileExpression", 
		"doWhileExpression", "jumpExpression", "callableReference", "assignmentOperator", 
		"equalityOperator", "comparisonOperator", "inOperator", "isOperator", 
		"additiveOperator", "multiplicativeOperator", "asOperator", "prefixUnaryOperator", 
		"postfixUnaryOperator", "memberAccessOperator", "modifierList", "modifier", 
		"classModifier", "memberModifier", "visibilityModifier", "varianceAnnotation", 
		"functionModifier", "propertyModifier", "inheritanceModifier", "parameterModifier", 
		"typeParameterModifier", "labelDefinition", "annotations", "annotation", 
		"annotationList", "annotationUseSiteTarget", "unescapedAnnotation", "identifier", 
		"simpleIdentifier", "semi"
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
		"Identifier", "LabelReference", "LabelDefinition", "FieldIdentifier", 
		"CharacterLiteral", "UNICODE_CLASS_LL", "UNICODE_CLASS_LM", "UNICODE_CLASS_LO", 
		"UNICODE_CLASS_LT", "UNICODE_CLASS_LU", "UNICODE_CLASS_ND", "UNICODE_CLASS_NL", 
		"Inside_Comment", "Inside_WS", "Inside_NL", "QUOTE_CLOSE", "LineStrRef", 
		"LineStrText", "LineStrEscapedChar", "LineStrExprStart", "TRIPLE_QUOTE_CLOSE", 
		"MultiLineStringQuote", "MultiLineStrRef", "MultiLineStrText", "MultiLineStrEscapedChar", 
		"MultiLineStrExprStart", "MultiLineNL", "StrExpr_IN", "StrExpr_Comment", 
		"StrExpr_WS", "StrExpr_NL"
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
		public org.antlr.symtab.Scope scope;
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
			setState(293);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(290);
				match(NL);
				}
				}
				setState(295);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(296);
			packageHeader();
			setState(297);
			importList();
			setState(301);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 40)) & ~0x3f) == 0 && ((1L << (_la - 40)) & ((1L << (AT - 40)) | (1L << (FILE - 40)) | (1L << (CLASS - 40)) | (1L << (INTERFACE - 40)) | (1L << (FUN - 40)) | (1L << (VAL - 40)) | (1L << (VAR - 40)) | (1L << (TYPE_ALIAS - 40)) | (1L << (IN - 40)) | (1L << (OUT - 40)) | (1L << (FIELD - 40)) | (1L << (PROPERTY - 40)) | (1L << (GET - 40)) | (1L << (SET - 40)) | (1L << (RECEIVER - 40)) | (1L << (PARAM - 40)) | (1L << (SETPARAM - 40)) | (1L << (DELEGATE - 40)))) != 0) || ((((_la - 104)) & ~0x3f) == 0 && ((1L << (_la - 104)) & ((1L << (PUBLIC - 104)) | (1L << (PRIVATE - 104)) | (1L << (PROTECTED - 104)) | (1L << (INTERNAL - 104)) | (1L << (ENUM - 104)) | (1L << (SEALED - 104)) | (1L << (ANNOTATION - 104)) | (1L << (DATA - 104)) | (1L << (INNER - 104)) | (1L << (TAILREC - 104)) | (1L << (OPERATOR - 104)) | (1L << (INLINE - 104)) | (1L << (INFIX - 104)) | (1L << (EXTERNAL - 104)) | (1L << (SUSPEND - 104)) | (1L << (OVERRIDE - 104)) | (1L << (ABSTRACT - 104)) | (1L << (FINAL - 104)) | (1L << (OPEN - 104)) | (1L << (CONST - 104)) | (1L << (LATEINIT - 104)) | (1L << (VARARG - 104)) | (1L << (NOINLINE - 104)) | (1L << (CROSSINLINE - 104)) | (1L << (REIFIED - 104)) | (1L << (LabelReference - 104)))) != 0)) {
				{
				{
				setState(298);
				topLevelObject();
				}
				}
				setState(303);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(304);
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
		enterRule(_localctx, 2, RULE_packageHeader);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(311);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PACKAGE) {
				{
				setState(306);
				match(PACKAGE);
				setState(307);
				identifier();
				setState(309);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NL || _la==SEMICOLON) {
					{
					setState(308);
					semi();
					}
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
		enterRule(_localctx, 4, RULE_importList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(316);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(313);
				importHeader();
				}
				}
				setState(318);
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
		enterRule(_localctx, 6, RULE_importHeader);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(319);
			match(IMPORT);
			setState(320);
			identifier();
			setState(324);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOT:
				{
				setState(321);
				match(DOT);
				setState(322);
				match(MULT);
				}
				break;
			case AS:
				{
				setState(323);
				importAlias();
				}
				break;
			case EOF:
			case NL:
			case SEMICOLON:
			case AT:
			case FILE:
			case IMPORT:
			case CLASS:
			case INTERFACE:
			case FUN:
			case VAL:
			case VAR:
			case TYPE_ALIAS:
			case IN:
			case OUT:
			case FIELD:
			case PROPERTY:
			case GET:
			case SET:
			case RECEIVER:
			case PARAM:
			case SETPARAM:
			case DELEGATE:
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
			case LabelReference:
				break;
			default:
				break;
			}
			setState(327);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NL || _la==SEMICOLON) {
				{
				setState(326);
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
		enterRule(_localctx, 8, RULE_importAlias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(329);
			match(AS);
			setState(330);
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
		enterRule(_localctx, 10, RULE_topLevelObject);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(336);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(332);
				classDeclaration();
				}
				break;
			case 2:
				{
				setState(333);
				functionDeclaration();
				}
				break;
			case 3:
				{
				setState(334);
				propertyDeclaration();
				}
				break;
			case 4:
				{
				setState(335);
				typeAlias();
				}
				break;
			}
			setState(339);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NL || _la==SEMICOLON) {
				{
				setState(338);
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
		public org.antlr.symtab.Scope scope;
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
		enterRule(_localctx, 12, RULE_classDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(342);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT || _la==FILE || ((((_la - 89)) & ~0x3f) == 0 && ((1L << (_la - 89)) & ((1L << (IN - 89)) | (1L << (OUT - 89)) | (1L << (FIELD - 89)) | (1L << (PROPERTY - 89)) | (1L << (GET - 89)) | (1L << (SET - 89)) | (1L << (RECEIVER - 89)) | (1L << (PARAM - 89)) | (1L << (SETPARAM - 89)) | (1L << (DELEGATE - 89)) | (1L << (PUBLIC - 89)) | (1L << (PRIVATE - 89)) | (1L << (PROTECTED - 89)) | (1L << (INTERNAL - 89)) | (1L << (ENUM - 89)) | (1L << (SEALED - 89)) | (1L << (ANNOTATION - 89)) | (1L << (DATA - 89)) | (1L << (INNER - 89)) | (1L << (TAILREC - 89)) | (1L << (OPERATOR - 89)) | (1L << (INLINE - 89)) | (1L << (INFIX - 89)) | (1L << (EXTERNAL - 89)) | (1L << (SUSPEND - 89)) | (1L << (OVERRIDE - 89)) | (1L << (ABSTRACT - 89)) | (1L << (FINAL - 89)) | (1L << (OPEN - 89)) | (1L << (CONST - 89)) | (1L << (LATEINIT - 89)) | (1L << (VARARG - 89)) | (1L << (NOINLINE - 89)) | (1L << (CROSSINLINE - 89)) | (1L << (REIFIED - 89)) | (1L << (LabelReference - 89)))) != 0)) {
				{
				setState(341);
				modifierList();
				}
			}

			setState(344);
			_la = _input.LA(1);
			if ( !(_la==CLASS || _la==INTERFACE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(348);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(345);
				match(NL);
				}
				}
				setState(350);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(351);
			simpleIdentifier();
			setState(359);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(355);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(352);
					match(NL);
					}
					}
					setState(357);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(358);
				typeParameters();
				}
				break;
			}
			setState(368);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(364);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(361);
					match(NL);
					}
					}
					setState(366);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(367);
				primaryConstructor();
				}
				break;
			}
			setState(384);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(373);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(370);
					match(NL);
					}
					}
					setState(375);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(376);
				match(COLON);
				setState(380);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(377);
					match(NL);
					}
					}
					setState(382);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(383);
				delegationSpecifiers();
				}
				break;
			}
			setState(393);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(389);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(386);
					match(NL);
					}
					}
					setState(391);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(392);
				typeConstraints();
				}
				break;
			}
			setState(409);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(398);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(395);
					match(NL);
					}
					}
					setState(400);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(401);
				classBody();
				}
				break;
			case 2:
				{
				setState(405);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(402);
					match(NL);
					}
					}
					setState(407);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(408);
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
		enterRule(_localctx, 14, RULE_primaryConstructor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(412);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT || _la==FILE || ((((_la - 89)) & ~0x3f) == 0 && ((1L << (_la - 89)) & ((1L << (IN - 89)) | (1L << (OUT - 89)) | (1L << (FIELD - 89)) | (1L << (PROPERTY - 89)) | (1L << (GET - 89)) | (1L << (SET - 89)) | (1L << (RECEIVER - 89)) | (1L << (PARAM - 89)) | (1L << (SETPARAM - 89)) | (1L << (DELEGATE - 89)) | (1L << (PUBLIC - 89)) | (1L << (PRIVATE - 89)) | (1L << (PROTECTED - 89)) | (1L << (INTERNAL - 89)) | (1L << (ENUM - 89)) | (1L << (SEALED - 89)) | (1L << (ANNOTATION - 89)) | (1L << (DATA - 89)) | (1L << (INNER - 89)) | (1L << (TAILREC - 89)) | (1L << (OPERATOR - 89)) | (1L << (INLINE - 89)) | (1L << (INFIX - 89)) | (1L << (EXTERNAL - 89)) | (1L << (SUSPEND - 89)) | (1L << (OVERRIDE - 89)) | (1L << (ABSTRACT - 89)) | (1L << (FINAL - 89)) | (1L << (OPEN - 89)) | (1L << (CONST - 89)) | (1L << (LATEINIT - 89)) | (1L << (VARARG - 89)) | (1L << (NOINLINE - 89)) | (1L << (CROSSINLINE - 89)) | (1L << (REIFIED - 89)) | (1L << (LabelReference - 89)))) != 0)) {
				{
				setState(411);
				modifierList();
				}
			}

			setState(421);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONSTRUCTOR) {
				{
				setState(414);
				match(CONSTRUCTOR);
				setState(418);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(415);
					match(NL);
					}
					}
					setState(420);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(423);
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
		enterRule(_localctx, 16, RULE_classParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(425);
			match(LPAREN);
			setState(434);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 40)) & ~0x3f) == 0 && ((1L << (_la - 40)) & ((1L << (AT - 40)) | (1L << (FILE - 40)) | (1L << (IMPORT - 40)) | (1L << (VAL - 40)) | (1L << (VAR - 40)) | (1L << (CONSTRUCTOR - 40)) | (1L << (BY - 40)) | (1L << (COMPANION - 40)) | (1L << (INIT - 40)) | (1L << (WHERE - 40)) | (1L << (CATCH - 40)) | (1L << (FINALLY - 40)) | (1L << (IN - 40)) | (1L << (OUT - 40)) | (1L << (FIELD - 40)) | (1L << (PROPERTY - 40)) | (1L << (GET - 40)) | (1L << (SET - 40)) | (1L << (GETTER - 40)) | (1L << (SETTER - 40)) | (1L << (RECEIVER - 40)) | (1L << (PARAM - 40)) | (1L << (SETPARAM - 40)) | (1L << (DELEGATE - 40)) | (1L << (DYNAMIC - 40)))) != 0) || ((((_la - 104)) & ~0x3f) == 0 && ((1L << (_la - 104)) & ((1L << (PUBLIC - 104)) | (1L << (PRIVATE - 104)) | (1L << (PROTECTED - 104)) | (1L << (INTERNAL - 104)) | (1L << (ENUM - 104)) | (1L << (SEALED - 104)) | (1L << (ANNOTATION - 104)) | (1L << (DATA - 104)) | (1L << (INNER - 104)) | (1L << (TAILREC - 104)) | (1L << (OPERATOR - 104)) | (1L << (INLINE - 104)) | (1L << (INFIX - 104)) | (1L << (EXTERNAL - 104)) | (1L << (SUSPEND - 104)) | (1L << (OVERRIDE - 104)) | (1L << (ABSTRACT - 104)) | (1L << (FINAL - 104)) | (1L << (OPEN - 104)) | (1L << (CONST - 104)) | (1L << (LATEINIT - 104)) | (1L << (VARARG - 104)) | (1L << (NOINLINE - 104)) | (1L << (CROSSINLINE - 104)) | (1L << (REIFIED - 104)) | (1L << (Identifier - 104)) | (1L << (LabelReference - 104)))) != 0)) {
				{
				setState(426);
				classParameter();
				setState(431);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(427);
					match(COMMA);
					setState(428);
					classParameter();
					}
					}
					setState(433);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(436);
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
		enterRule(_localctx, 18, RULE_classParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(439);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(438);
				modifierList();
				}
				break;
			}
			setState(442);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAL || _la==VAR) {
				{
				setState(441);
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

			setState(444);
			simpleIdentifier();
			setState(445);
			match(COLON);
			setState(446);
			type();
			setState(449);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGNMENT) {
				{
				setState(447);
				match(ASSIGNMENT);
				setState(448);
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
		enterRule(_localctx, 20, RULE_delegationSpecifiers);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(454);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT || _la==FILE || ((((_la - 93)) & ~0x3f) == 0 && ((1L << (_la - 93)) & ((1L << (FIELD - 93)) | (1L << (PROPERTY - 93)) | (1L << (GET - 93)) | (1L << (SET - 93)) | (1L << (RECEIVER - 93)) | (1L << (PARAM - 93)) | (1L << (SETPARAM - 93)) | (1L << (DELEGATE - 93)) | (1L << (LabelReference - 93)))) != 0)) {
				{
				{
				setState(451);
				annotations();
				}
				}
				setState(456);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(457);
			delegationSpecifier();
			setState(474);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(461);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(458);
						match(NL);
						}
						}
						setState(463);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(464);
					match(COMMA);
					setState(468);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(465);
						match(NL);
						}
						}
						setState(470);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(471);
					delegationSpecifier();
					}
					} 
				}
				setState(476);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
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
		enterRule(_localctx, 22, RULE_delegationSpecifier);
		try {
			setState(480);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(477);
				constructorInvocation();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(478);
				userType();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(479);
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
		enterRule(_localctx, 24, RULE_constructorInvocation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(482);
			userType();
			setState(483);
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
		enterRule(_localctx, 26, RULE_explicitDelegation);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(485);
			userType();
			setState(489);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(486);
				match(NL);
				}
				}
				setState(491);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(492);
			match(BY);
			setState(496);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(493);
					match(NL);
					}
					} 
				}
				setState(498);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			}
			setState(499);
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
		enterRule(_localctx, 28, RULE_classBody);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(501);
			match(LCURL);
			setState(505);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(502);
					match(NL);
					}
					} 
				}
				setState(507);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			}
			setState(511);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 40)) & ~0x3f) == 0 && ((1L << (_la - 40)) & ((1L << (AT - 40)) | (1L << (FILE - 40)) | (1L << (CLASS - 40)) | (1L << (INTERFACE - 40)) | (1L << (FUN - 40)) | (1L << (VAL - 40)) | (1L << (VAR - 40)) | (1L << (TYPE_ALIAS - 40)) | (1L << (CONSTRUCTOR - 40)) | (1L << (INIT - 40)) | (1L << (IN - 40)) | (1L << (OUT - 40)) | (1L << (FIELD - 40)) | (1L << (PROPERTY - 40)) | (1L << (GET - 40)) | (1L << (SET - 40)) | (1L << (RECEIVER - 40)) | (1L << (PARAM - 40)) | (1L << (SETPARAM - 40)) | (1L << (DELEGATE - 40)))) != 0) || ((((_la - 104)) & ~0x3f) == 0 && ((1L << (_la - 104)) & ((1L << (PUBLIC - 104)) | (1L << (PRIVATE - 104)) | (1L << (PROTECTED - 104)) | (1L << (INTERNAL - 104)) | (1L << (ENUM - 104)) | (1L << (SEALED - 104)) | (1L << (ANNOTATION - 104)) | (1L << (DATA - 104)) | (1L << (INNER - 104)) | (1L << (TAILREC - 104)) | (1L << (OPERATOR - 104)) | (1L << (INLINE - 104)) | (1L << (INFIX - 104)) | (1L << (EXTERNAL - 104)) | (1L << (SUSPEND - 104)) | (1L << (OVERRIDE - 104)) | (1L << (ABSTRACT - 104)) | (1L << (FINAL - 104)) | (1L << (OPEN - 104)) | (1L << (CONST - 104)) | (1L << (LATEINIT - 104)) | (1L << (VARARG - 104)) | (1L << (NOINLINE - 104)) | (1L << (CROSSINLINE - 104)) | (1L << (REIFIED - 104)) | (1L << (LabelReference - 104)))) != 0)) {
				{
				{
				setState(508);
				classMemberDeclaration();
				}
				}
				setState(513);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(517);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(514);
				match(NL);
				}
				}
				setState(519);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(520);
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
		enterRule(_localctx, 30, RULE_classMemberDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(528);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				{
				setState(522);
				classDeclaration();
				}
				break;
			case 2:
				{
				setState(523);
				functionDeclaration();
				}
				break;
			case 3:
				{
				setState(524);
				propertyDeclaration();
				}
				break;
			case 4:
				{
				setState(525);
				anonymousInitializer();
				}
				break;
			case 5:
				{
				setState(526);
				secondaryConstructor();
				}
				break;
			case 6:
				{
				setState(527);
				typeAlias();
				}
				break;
			}
			setState(531);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				{
				setState(530);
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
		enterRule(_localctx, 32, RULE_anonymousInitializer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(533);
			match(INIT);
			setState(537);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(534);
				match(NL);
				}
				}
				setState(539);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(540);
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
		enterRule(_localctx, 34, RULE_secondaryConstructor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(543);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT || _la==FILE || ((((_la - 89)) & ~0x3f) == 0 && ((1L << (_la - 89)) & ((1L << (IN - 89)) | (1L << (OUT - 89)) | (1L << (FIELD - 89)) | (1L << (PROPERTY - 89)) | (1L << (GET - 89)) | (1L << (SET - 89)) | (1L << (RECEIVER - 89)) | (1L << (PARAM - 89)) | (1L << (SETPARAM - 89)) | (1L << (DELEGATE - 89)) | (1L << (PUBLIC - 89)) | (1L << (PRIVATE - 89)) | (1L << (PROTECTED - 89)) | (1L << (INTERNAL - 89)) | (1L << (ENUM - 89)) | (1L << (SEALED - 89)) | (1L << (ANNOTATION - 89)) | (1L << (DATA - 89)) | (1L << (INNER - 89)) | (1L << (TAILREC - 89)) | (1L << (OPERATOR - 89)) | (1L << (INLINE - 89)) | (1L << (INFIX - 89)) | (1L << (EXTERNAL - 89)) | (1L << (SUSPEND - 89)) | (1L << (OVERRIDE - 89)) | (1L << (ABSTRACT - 89)) | (1L << (FINAL - 89)) | (1L << (OPEN - 89)) | (1L << (CONST - 89)) | (1L << (LATEINIT - 89)) | (1L << (VARARG - 89)) | (1L << (NOINLINE - 89)) | (1L << (CROSSINLINE - 89)) | (1L << (REIFIED - 89)) | (1L << (LabelReference - 89)))) != 0)) {
				{
				setState(542);
				modifierList();
				}
			}

			setState(545);
			match(CONSTRUCTOR);
			setState(549);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(546);
				match(NL);
				}
				}
				setState(551);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(552);
			functionValueParameters();
			setState(567);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				{
				setState(556);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(553);
					match(NL);
					}
					}
					setState(558);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(559);
				match(COLON);
				setState(563);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(560);
					match(NL);
					}
					}
					setState(565);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(566);
				constructorDelegationCall();
				}
				break;
			}
			setState(572);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(569);
				match(NL);
				}
				}
				setState(574);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(575);
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
		enterRule(_localctx, 36, RULE_constructorDelegationCall);
		int _la;
		try {
			setState(593);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case THIS:
				enterOuterAlt(_localctx, 1);
				{
				setState(577);
				match(THIS);
				setState(581);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(578);
					match(NL);
					}
					}
					setState(583);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(584);
				valueArguments();
				}
				break;
			case SUPER:
				enterOuterAlt(_localctx, 2);
				{
				setState(585);
				match(SUPER);
				setState(589);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(586);
					match(NL);
					}
					}
					setState(591);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(592);
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
		enterRule(_localctx, 38, RULE_enumClassBody);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(595);
			match(LCURL);
			setState(599);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(596);
					match(NL);
					}
					} 
				}
				setState(601);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			}
			setState(603);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 58)) & ~0x3f) == 0 && ((1L << (_la - 58)) & ((1L << (IMPORT - 58)) | (1L << (CONSTRUCTOR - 58)) | (1L << (BY - 58)) | (1L << (COMPANION - 58)) | (1L << (INIT - 58)) | (1L << (WHERE - 58)) | (1L << (CATCH - 58)) | (1L << (FINALLY - 58)) | (1L << (OUT - 58)) | (1L << (GETTER - 58)) | (1L << (SETTER - 58)) | (1L << (DYNAMIC - 58)) | (1L << (PUBLIC - 58)) | (1L << (PRIVATE - 58)) | (1L << (PROTECTED - 58)) | (1L << (INTERNAL - 58)) | (1L << (ENUM - 58)) | (1L << (SEALED - 58)) | (1L << (ANNOTATION - 58)) | (1L << (DATA - 58)) | (1L << (INNER - 58)) | (1L << (TAILREC - 58)) | (1L << (OPERATOR - 58)) | (1L << (INLINE - 58)) | (1L << (INFIX - 58)) | (1L << (EXTERNAL - 58)) | (1L << (SUSPEND - 58)) | (1L << (OVERRIDE - 58)) | (1L << (ABSTRACT - 58)) | (1L << (FINAL - 58)))) != 0) || ((((_la - 122)) & ~0x3f) == 0 && ((1L << (_la - 122)) & ((1L << (OPEN - 122)) | (1L << (CONST - 122)) | (1L << (LATEINIT - 122)) | (1L << (VARARG - 122)) | (1L << (NOINLINE - 122)) | (1L << (CROSSINLINE - 122)) | (1L << (REIFIED - 122)) | (1L << (Identifier - 122)))) != 0)) {
				{
				setState(602);
				enumEntries();
				}
			}

			setState(624);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				{
				setState(608);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(605);
					match(NL);
					}
					}
					setState(610);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(611);
				match(SEMICOLON);
				setState(615);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(612);
						match(NL);
						}
						} 
					}
					setState(617);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
				}
				setState(621);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 40)) & ~0x3f) == 0 && ((1L << (_la - 40)) & ((1L << (AT - 40)) | (1L << (FILE - 40)) | (1L << (CLASS - 40)) | (1L << (INTERFACE - 40)) | (1L << (FUN - 40)) | (1L << (VAL - 40)) | (1L << (VAR - 40)) | (1L << (TYPE_ALIAS - 40)) | (1L << (CONSTRUCTOR - 40)) | (1L << (INIT - 40)) | (1L << (IN - 40)) | (1L << (OUT - 40)) | (1L << (FIELD - 40)) | (1L << (PROPERTY - 40)) | (1L << (GET - 40)) | (1L << (SET - 40)) | (1L << (RECEIVER - 40)) | (1L << (PARAM - 40)) | (1L << (SETPARAM - 40)) | (1L << (DELEGATE - 40)))) != 0) || ((((_la - 104)) & ~0x3f) == 0 && ((1L << (_la - 104)) & ((1L << (PUBLIC - 104)) | (1L << (PRIVATE - 104)) | (1L << (PROTECTED - 104)) | (1L << (INTERNAL - 104)) | (1L << (ENUM - 104)) | (1L << (SEALED - 104)) | (1L << (ANNOTATION - 104)) | (1L << (DATA - 104)) | (1L << (INNER - 104)) | (1L << (TAILREC - 104)) | (1L << (OPERATOR - 104)) | (1L << (INLINE - 104)) | (1L << (INFIX - 104)) | (1L << (EXTERNAL - 104)) | (1L << (SUSPEND - 104)) | (1L << (OVERRIDE - 104)) | (1L << (ABSTRACT - 104)) | (1L << (FINAL - 104)) | (1L << (OPEN - 104)) | (1L << (CONST - 104)) | (1L << (LATEINIT - 104)) | (1L << (VARARG - 104)) | (1L << (NOINLINE - 104)) | (1L << (CROSSINLINE - 104)) | (1L << (REIFIED - 104)) | (1L << (LabelReference - 104)))) != 0)) {
					{
					{
					setState(618);
					classMemberDeclaration();
					}
					}
					setState(623);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(629);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(626);
				match(NL);
				}
				}
				setState(631);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(632);
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
		enterRule(_localctx, 40, RULE_enumEntries);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(641); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(634);
				enumEntry();
				setState(638);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(635);
						match(NL);
						}
						} 
					}
					setState(640);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
				}
				}
				}
				setState(643); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 58)) & ~0x3f) == 0 && ((1L << (_la - 58)) & ((1L << (IMPORT - 58)) | (1L << (CONSTRUCTOR - 58)) | (1L << (BY - 58)) | (1L << (COMPANION - 58)) | (1L << (INIT - 58)) | (1L << (WHERE - 58)) | (1L << (CATCH - 58)) | (1L << (FINALLY - 58)) | (1L << (OUT - 58)) | (1L << (GETTER - 58)) | (1L << (SETTER - 58)) | (1L << (DYNAMIC - 58)) | (1L << (PUBLIC - 58)) | (1L << (PRIVATE - 58)) | (1L << (PROTECTED - 58)) | (1L << (INTERNAL - 58)) | (1L << (ENUM - 58)) | (1L << (SEALED - 58)) | (1L << (ANNOTATION - 58)) | (1L << (DATA - 58)) | (1L << (INNER - 58)) | (1L << (TAILREC - 58)) | (1L << (OPERATOR - 58)) | (1L << (INLINE - 58)) | (1L << (INFIX - 58)) | (1L << (EXTERNAL - 58)) | (1L << (SUSPEND - 58)) | (1L << (OVERRIDE - 58)) | (1L << (ABSTRACT - 58)) | (1L << (FINAL - 58)))) != 0) || ((((_la - 122)) & ~0x3f) == 0 && ((1L << (_la - 122)) & ((1L << (OPEN - 122)) | (1L << (CONST - 122)) | (1L << (LATEINIT - 122)) | (1L << (VARARG - 122)) | (1L << (NOINLINE - 122)) | (1L << (CROSSINLINE - 122)) | (1L << (REIFIED - 122)) | (1L << (Identifier - 122)))) != 0) );
			setState(646);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				{
				setState(645);
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
		enterRule(_localctx, 42, RULE_enumEntry);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(648);
			simpleIdentifier();
			setState(656);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				{
				setState(652);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(649);
					match(NL);
					}
					}
					setState(654);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(655);
				valueArguments();
				}
				break;
			}
			setState(665);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				{
				setState(661);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(658);
					match(NL);
					}
					}
					setState(663);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(664);
				classBody();
				}
				break;
			}
			setState(674);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
			case 1:
				{
				setState(670);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(667);
					match(NL);
					}
					}
					setState(672);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(673);
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
		public org.antlr.symtab.Scope scope;
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
		enterRule(_localctx, 44, RULE_functionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(677);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT || _la==FILE || ((((_la - 89)) & ~0x3f) == 0 && ((1L << (_la - 89)) & ((1L << (IN - 89)) | (1L << (OUT - 89)) | (1L << (FIELD - 89)) | (1L << (PROPERTY - 89)) | (1L << (GET - 89)) | (1L << (SET - 89)) | (1L << (RECEIVER - 89)) | (1L << (PARAM - 89)) | (1L << (SETPARAM - 89)) | (1L << (DELEGATE - 89)) | (1L << (PUBLIC - 89)) | (1L << (PRIVATE - 89)) | (1L << (PROTECTED - 89)) | (1L << (INTERNAL - 89)) | (1L << (ENUM - 89)) | (1L << (SEALED - 89)) | (1L << (ANNOTATION - 89)) | (1L << (DATA - 89)) | (1L << (INNER - 89)) | (1L << (TAILREC - 89)) | (1L << (OPERATOR - 89)) | (1L << (INLINE - 89)) | (1L << (INFIX - 89)) | (1L << (EXTERNAL - 89)) | (1L << (SUSPEND - 89)) | (1L << (OVERRIDE - 89)) | (1L << (ABSTRACT - 89)) | (1L << (FINAL - 89)) | (1L << (OPEN - 89)) | (1L << (CONST - 89)) | (1L << (LATEINIT - 89)) | (1L << (VARARG - 89)) | (1L << (NOINLINE - 89)) | (1L << (CROSSINLINE - 89)) | (1L << (REIFIED - 89)) | (1L << (LabelReference - 89)))) != 0)) {
				{
				setState(676);
				modifierList();
				}
			}

			setState(679);
			match(FUN);
			setState(695);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				{
				setState(683);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(680);
					match(NL);
					}
					}
					setState(685);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(686);
				type();
				setState(690);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(687);
					match(NL);
					}
					}
					setState(692);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(693);
				match(DOT);
				}
				break;
			}
			setState(704);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				{
				setState(700);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(697);
					match(NL);
					}
					}
					setState(702);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(703);
				typeParameters();
				}
				break;
			}
			setState(713);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
			case 1:
				{
				setState(709);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(706);
					match(NL);
					}
					}
					setState(711);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(712);
				identifier();
				}
				break;
			}
			setState(718);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(715);
				match(NL);
				}
				}
				setState(720);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(721);
			functionValueParameters();
			setState(736);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
			case 1:
				{
				setState(725);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(722);
					match(NL);
					}
					}
					setState(727);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(728);
				match(COLON);
				setState(732);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(729);
					match(NL);
					}
					}
					setState(734);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(735);
				type();
				}
				break;
			}
			setState(745);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
			case 1:
				{
				setState(741);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(738);
					match(NL);
					}
					}
					setState(743);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(744);
				typeConstraints();
				}
				break;
			}
			setState(754);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
			case 1:
				{
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
		enterRule(_localctx, 46, RULE_functionValueParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(756);
			match(LPAREN);
			setState(765);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 40)) & ~0x3f) == 0 && ((1L << (_la - 40)) & ((1L << (AT - 40)) | (1L << (FILE - 40)) | (1L << (IMPORT - 40)) | (1L << (CONSTRUCTOR - 40)) | (1L << (BY - 40)) | (1L << (COMPANION - 40)) | (1L << (INIT - 40)) | (1L << (WHERE - 40)) | (1L << (CATCH - 40)) | (1L << (FINALLY - 40)) | (1L << (IN - 40)) | (1L << (OUT - 40)) | (1L << (FIELD - 40)) | (1L << (PROPERTY - 40)) | (1L << (GET - 40)) | (1L << (SET - 40)) | (1L << (GETTER - 40)) | (1L << (SETTER - 40)) | (1L << (RECEIVER - 40)) | (1L << (PARAM - 40)) | (1L << (SETPARAM - 40)) | (1L << (DELEGATE - 40)) | (1L << (DYNAMIC - 40)))) != 0) || ((((_la - 104)) & ~0x3f) == 0 && ((1L << (_la - 104)) & ((1L << (PUBLIC - 104)) | (1L << (PRIVATE - 104)) | (1L << (PROTECTED - 104)) | (1L << (INTERNAL - 104)) | (1L << (ENUM - 104)) | (1L << (SEALED - 104)) | (1L << (ANNOTATION - 104)) | (1L << (DATA - 104)) | (1L << (INNER - 104)) | (1L << (TAILREC - 104)) | (1L << (OPERATOR - 104)) | (1L << (INLINE - 104)) | (1L << (INFIX - 104)) | (1L << (EXTERNAL - 104)) | (1L << (SUSPEND - 104)) | (1L << (OVERRIDE - 104)) | (1L << (ABSTRACT - 104)) | (1L << (FINAL - 104)) | (1L << (OPEN - 104)) | (1L << (CONST - 104)) | (1L << (LATEINIT - 104)) | (1L << (VARARG - 104)) | (1L << (NOINLINE - 104)) | (1L << (CROSSINLINE - 104)) | (1L << (REIFIED - 104)) | (1L << (Identifier - 104)) | (1L << (LabelReference - 104)))) != 0)) {
				{
				setState(757);
				functionValueParameter();
				setState(762);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(758);
					match(COMMA);
					setState(759);
					functionValueParameter();
					}
					}
					setState(764);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(767);
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
		public org.antlr.symtab.Symbol symbol;
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
		enterRule(_localctx, 48, RULE_functionValueParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(770);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
			case 1:
				{
				setState(769);
				modifierList();
				}
				break;
			}
			setState(772);
			parameter();
			setState(775);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGNMENT) {
				{
				setState(773);
				match(ASSIGNMENT);
				setState(774);
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
		enterRule(_localctx, 50, RULE_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(777);
			simpleIdentifier();
			setState(778);
			match(COLON);
			setState(779);
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
		enterRule(_localctx, 52, RULE_functionBody);
		try {
			int _alt;
			setState(790);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LCURL:
				enterOuterAlt(_localctx, 1);
				{
				setState(781);
				block();
				}
				break;
			case ASSIGNMENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(782);
				match(ASSIGNMENT);
				setState(786);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,89,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(783);
						match(NL);
						}
						} 
					}
					setState(788);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,89,_ctx);
				}
				setState(789);
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
		enterRule(_localctx, 54, RULE_propertyDeclaration);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(793);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT || _la==FILE || ((((_la - 89)) & ~0x3f) == 0 && ((1L << (_la - 89)) & ((1L << (IN - 89)) | (1L << (OUT - 89)) | (1L << (FIELD - 89)) | (1L << (PROPERTY - 89)) | (1L << (GET - 89)) | (1L << (SET - 89)) | (1L << (RECEIVER - 89)) | (1L << (PARAM - 89)) | (1L << (SETPARAM - 89)) | (1L << (DELEGATE - 89)) | (1L << (PUBLIC - 89)) | (1L << (PRIVATE - 89)) | (1L << (PROTECTED - 89)) | (1L << (INTERNAL - 89)) | (1L << (ENUM - 89)) | (1L << (SEALED - 89)) | (1L << (ANNOTATION - 89)) | (1L << (DATA - 89)) | (1L << (INNER - 89)) | (1L << (TAILREC - 89)) | (1L << (OPERATOR - 89)) | (1L << (INLINE - 89)) | (1L << (INFIX - 89)) | (1L << (EXTERNAL - 89)) | (1L << (SUSPEND - 89)) | (1L << (OVERRIDE - 89)) | (1L << (ABSTRACT - 89)) | (1L << (FINAL - 89)) | (1L << (OPEN - 89)) | (1L << (CONST - 89)) | (1L << (LATEINIT - 89)) | (1L << (VARARG - 89)) | (1L << (NOINLINE - 89)) | (1L << (CROSSINLINE - 89)) | (1L << (REIFIED - 89)) | (1L << (LabelReference - 89)))) != 0)) {
				{
				setState(792);
				modifierList();
				}
			}

			setState(795);
			_la = _input.LA(1);
			if ( !(_la==VAL || _la==VAR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(803);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
			case 1:
				{
				setState(799);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(796);
					match(NL);
					}
					}
					setState(801);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(802);
				typeParameters();
				}
				break;
			}
			setState(820);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,96,_ctx) ) {
			case 1:
				{
				setState(808);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(805);
					match(NL);
					}
					}
					setState(810);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(811);
				type();
				setState(815);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(812);
					match(NL);
					}
					}
					setState(817);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(818);
				match(DOT);
				}
				break;
			}
			{
			setState(825);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(822);
				match(NL);
				}
				}
				setState(827);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(830);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				{
				setState(828);
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
				setState(829);
				variableDeclaration();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
			setState(839);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
			case 1:
				{
				setState(835);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(832);
					match(NL);
					}
					}
					setState(837);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(838);
				typeConstraints();
				}
				break;
			}
			setState(855);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,103,_ctx) ) {
			case 1:
				{
				setState(844);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(841);
					match(NL);
					}
					}
					setState(846);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(847);
				_la = _input.LA(1);
				if ( !(_la==ASSIGNMENT || _la==BY) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(851);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,102,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(848);
						match(NL);
						}
						} 
					}
					setState(853);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,102,_ctx);
				}
				setState(854);
				expression();
				}
				break;
			}
			setState(858);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,104,_ctx) ) {
			case 1:
				{
				setState(857);
				semi();
				}
				break;
			}
			setState(884);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,111,_ctx) ) {
			case 1:
				{
				setState(861);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,105,_ctx) ) {
				case 1:
					{
					setState(860);
					getter();
					}
					break;
				}
				setState(870);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
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
					setter();
					}
					break;
				}
				}
				break;
			case 2:
				{
				setState(873);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
				case 1:
					{
					setState(872);
					setter();
					}
					break;
				}
				setState(882);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,110,_ctx) ) {
				case 1:
					{
					setState(878);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(875);
						match(NL);
						}
						}
						setState(880);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(881);
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
		enterRule(_localctx, 56, RULE_multiVariableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(886);
			match(LPAREN);
			setState(887);
			variableDeclaration();
			setState(892);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(888);
				match(COMMA);
				setState(889);
				variableDeclaration();
				}
				}
				setState(894);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(895);
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
		public org.antlr.symtab.Symbol symbol;
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
		enterRule(_localctx, 58, RULE_variableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(897);
			simpleIdentifier();
			setState(900);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(898);
				match(COLON);
				setState(899);
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
		enterRule(_localctx, 60, RULE_getter);
		int _la;
		try {
			int _alt;
			setState(951);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,123,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(903);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AT || _la==FILE || ((((_la - 89)) & ~0x3f) == 0 && ((1L << (_la - 89)) & ((1L << (IN - 89)) | (1L << (OUT - 89)) | (1L << (FIELD - 89)) | (1L << (PROPERTY - 89)) | (1L << (GET - 89)) | (1L << (SET - 89)) | (1L << (RECEIVER - 89)) | (1L << (PARAM - 89)) | (1L << (SETPARAM - 89)) | (1L << (DELEGATE - 89)) | (1L << (PUBLIC - 89)) | (1L << (PRIVATE - 89)) | (1L << (PROTECTED - 89)) | (1L << (INTERNAL - 89)) | (1L << (ENUM - 89)) | (1L << (SEALED - 89)) | (1L << (ANNOTATION - 89)) | (1L << (DATA - 89)) | (1L << (INNER - 89)) | (1L << (TAILREC - 89)) | (1L << (OPERATOR - 89)) | (1L << (INLINE - 89)) | (1L << (INFIX - 89)) | (1L << (EXTERNAL - 89)) | (1L << (SUSPEND - 89)) | (1L << (OVERRIDE - 89)) | (1L << (ABSTRACT - 89)) | (1L << (FINAL - 89)) | (1L << (OPEN - 89)) | (1L << (CONST - 89)) | (1L << (LATEINIT - 89)) | (1L << (VARARG - 89)) | (1L << (NOINLINE - 89)) | (1L << (CROSSINLINE - 89)) | (1L << (REIFIED - 89)) | (1L << (LabelReference - 89)))) != 0)) {
					{
					setState(902);
					modifierList();
					}
				}

				setState(905);
				match(GETTER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(907);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AT || _la==FILE || ((((_la - 89)) & ~0x3f) == 0 && ((1L << (_la - 89)) & ((1L << (IN - 89)) | (1L << (OUT - 89)) | (1L << (FIELD - 89)) | (1L << (PROPERTY - 89)) | (1L << (GET - 89)) | (1L << (SET - 89)) | (1L << (RECEIVER - 89)) | (1L << (PARAM - 89)) | (1L << (SETPARAM - 89)) | (1L << (DELEGATE - 89)) | (1L << (PUBLIC - 89)) | (1L << (PRIVATE - 89)) | (1L << (PROTECTED - 89)) | (1L << (INTERNAL - 89)) | (1L << (ENUM - 89)) | (1L << (SEALED - 89)) | (1L << (ANNOTATION - 89)) | (1L << (DATA - 89)) | (1L << (INNER - 89)) | (1L << (TAILREC - 89)) | (1L << (OPERATOR - 89)) | (1L << (INLINE - 89)) | (1L << (INFIX - 89)) | (1L << (EXTERNAL - 89)) | (1L << (SUSPEND - 89)) | (1L << (OVERRIDE - 89)) | (1L << (ABSTRACT - 89)) | (1L << (FINAL - 89)) | (1L << (OPEN - 89)) | (1L << (CONST - 89)) | (1L << (LATEINIT - 89)) | (1L << (VARARG - 89)) | (1L << (NOINLINE - 89)) | (1L << (CROSSINLINE - 89)) | (1L << (REIFIED - 89)) | (1L << (LabelReference - 89)))) != 0)) {
					{
					setState(906);
					modifierList();
					}
				}

				setState(909);
				match(GETTER);
				setState(913);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(910);
					match(NL);
					}
					}
					setState(915);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(916);
				match(LPAREN);
				setState(917);
				match(RPAREN);
				setState(932);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,119,_ctx) ) {
				case 1:
					{
					setState(921);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(918);
						match(NL);
						}
						}
						setState(923);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(924);
					match(COLON);
					setState(928);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(925);
						match(NL);
						}
						}
						setState(930);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(931);
					type();
					}
					break;
				}
				setState(937);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(934);
					match(NL);
					}
					}
					setState(939);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(949);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LCURL:
					{
					setState(940);
					block();
					}
					break;
				case ASSIGNMENT:
					{
					setState(941);
					match(ASSIGNMENT);
					setState(945);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,121,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(942);
							match(NL);
							}
							} 
						}
						setState(947);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,121,_ctx);
					}
					setState(948);
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
		enterRule(_localctx, 62, RULE_setter);
		int _la;
		try {
			int _alt;
			setState(988);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,131,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(954);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AT || _la==FILE || ((((_la - 89)) & ~0x3f) == 0 && ((1L << (_la - 89)) & ((1L << (IN - 89)) | (1L << (OUT - 89)) | (1L << (FIELD - 89)) | (1L << (PROPERTY - 89)) | (1L << (GET - 89)) | (1L << (SET - 89)) | (1L << (RECEIVER - 89)) | (1L << (PARAM - 89)) | (1L << (SETPARAM - 89)) | (1L << (DELEGATE - 89)) | (1L << (PUBLIC - 89)) | (1L << (PRIVATE - 89)) | (1L << (PROTECTED - 89)) | (1L << (INTERNAL - 89)) | (1L << (ENUM - 89)) | (1L << (SEALED - 89)) | (1L << (ANNOTATION - 89)) | (1L << (DATA - 89)) | (1L << (INNER - 89)) | (1L << (TAILREC - 89)) | (1L << (OPERATOR - 89)) | (1L << (INLINE - 89)) | (1L << (INFIX - 89)) | (1L << (EXTERNAL - 89)) | (1L << (SUSPEND - 89)) | (1L << (OVERRIDE - 89)) | (1L << (ABSTRACT - 89)) | (1L << (FINAL - 89)) | (1L << (OPEN - 89)) | (1L << (CONST - 89)) | (1L << (LATEINIT - 89)) | (1L << (VARARG - 89)) | (1L << (NOINLINE - 89)) | (1L << (CROSSINLINE - 89)) | (1L << (REIFIED - 89)) | (1L << (LabelReference - 89)))) != 0)) {
					{
					setState(953);
					modifierList();
					}
				}

				setState(956);
				match(SETTER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(958);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AT || _la==FILE || ((((_la - 89)) & ~0x3f) == 0 && ((1L << (_la - 89)) & ((1L << (IN - 89)) | (1L << (OUT - 89)) | (1L << (FIELD - 89)) | (1L << (PROPERTY - 89)) | (1L << (GET - 89)) | (1L << (SET - 89)) | (1L << (RECEIVER - 89)) | (1L << (PARAM - 89)) | (1L << (SETPARAM - 89)) | (1L << (DELEGATE - 89)) | (1L << (PUBLIC - 89)) | (1L << (PRIVATE - 89)) | (1L << (PROTECTED - 89)) | (1L << (INTERNAL - 89)) | (1L << (ENUM - 89)) | (1L << (SEALED - 89)) | (1L << (ANNOTATION - 89)) | (1L << (DATA - 89)) | (1L << (INNER - 89)) | (1L << (TAILREC - 89)) | (1L << (OPERATOR - 89)) | (1L << (INLINE - 89)) | (1L << (INFIX - 89)) | (1L << (EXTERNAL - 89)) | (1L << (SUSPEND - 89)) | (1L << (OVERRIDE - 89)) | (1L << (ABSTRACT - 89)) | (1L << (FINAL - 89)) | (1L << (OPEN - 89)) | (1L << (CONST - 89)) | (1L << (LATEINIT - 89)) | (1L << (VARARG - 89)) | (1L << (NOINLINE - 89)) | (1L << (CROSSINLINE - 89)) | (1L << (REIFIED - 89)) | (1L << (LabelReference - 89)))) != 0)) {
					{
					setState(957);
					modifierList();
					}
				}

				setState(960);
				match(SETTER);
				setState(964);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(961);
					match(NL);
					}
					}
					setState(966);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(967);
				match(LPAREN);
				setState(972);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,128,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						setState(970);
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
							setState(968);
							annotations();
							}
							break;
						case VARARG:
						case NOINLINE:
						case CROSSINLINE:
							{
							setState(969);
							parameterModifier();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						} 
					}
					setState(974);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,128,_ctx);
				}
				setState(977);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,129,_ctx) ) {
				case 1:
					{
					setState(975);
					simpleIdentifier();
					}
					break;
				case 2:
					{
					setState(976);
					parameter();
					}
					break;
				}
				setState(979);
				match(RPAREN);
				setState(983);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(980);
					match(NL);
					}
					}
					setState(985);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(986);
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
		enterRule(_localctx, 64, RULE_typeAlias);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(991);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT || _la==FILE || ((((_la - 89)) & ~0x3f) == 0 && ((1L << (_la - 89)) & ((1L << (IN - 89)) | (1L << (OUT - 89)) | (1L << (FIELD - 89)) | (1L << (PROPERTY - 89)) | (1L << (GET - 89)) | (1L << (SET - 89)) | (1L << (RECEIVER - 89)) | (1L << (PARAM - 89)) | (1L << (SETPARAM - 89)) | (1L << (DELEGATE - 89)) | (1L << (PUBLIC - 89)) | (1L << (PRIVATE - 89)) | (1L << (PROTECTED - 89)) | (1L << (INTERNAL - 89)) | (1L << (ENUM - 89)) | (1L << (SEALED - 89)) | (1L << (ANNOTATION - 89)) | (1L << (DATA - 89)) | (1L << (INNER - 89)) | (1L << (TAILREC - 89)) | (1L << (OPERATOR - 89)) | (1L << (INLINE - 89)) | (1L << (INFIX - 89)) | (1L << (EXTERNAL - 89)) | (1L << (SUSPEND - 89)) | (1L << (OVERRIDE - 89)) | (1L << (ABSTRACT - 89)) | (1L << (FINAL - 89)) | (1L << (OPEN - 89)) | (1L << (CONST - 89)) | (1L << (LATEINIT - 89)) | (1L << (VARARG - 89)) | (1L << (NOINLINE - 89)) | (1L << (CROSSINLINE - 89)) | (1L << (REIFIED - 89)) | (1L << (LabelReference - 89)))) != 0)) {
				{
				setState(990);
				modifierList();
				}
			}

			setState(993);
			match(TYPE_ALIAS);
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
			simpleIdentifier();
			setState(1008);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,135,_ctx) ) {
			case 1:
				{
				setState(1004);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1001);
					match(NL);
					}
					}
					setState(1006);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1007);
				typeParameters();
				}
				break;
			}
			setState(1013);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(1010);
				match(NL);
				}
				}
				setState(1015);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1016);
			match(ASSIGNMENT);
			setState(1020);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(1017);
				match(NL);
				}
				}
				setState(1022);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1023);
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
		enterRule(_localctx, 66, RULE_typeParameters);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1025);
			match(LANGLE);
			setState(1029);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,138,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1026);
					match(NL);
					}
					} 
				}
				setState(1031);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,138,_ctx);
			}
			setState(1032);
			typeParameter();
			setState(1049);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,141,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1036);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(1033);
						match(NL);
						}
						}
						setState(1038);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1039);
					match(COMMA);
					setState(1043);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,140,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(1040);
							match(NL);
							}
							} 
						}
						setState(1045);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,140,_ctx);
					}
					setState(1046);
					typeParameter();
					}
					} 
				}
				setState(1051);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,141,_ctx);
			}
			setState(1055);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(1052);
				match(NL);
				}
				}
				setState(1057);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1058);
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
		enterRule(_localctx, 68, RULE_typeParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1061);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,143,_ctx) ) {
			case 1:
				{
				setState(1060);
				modifierList();
				}
				break;
			}
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
			simpleIdentifier();
			setState(1084);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,147,_ctx) ) {
			case 1:
				{
				setState(1073);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1070);
					match(NL);
					}
					}
					setState(1075);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1076);
				match(COLON);
				setState(1080);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1077);
					match(NL);
					}
					}
					setState(1082);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1083);
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
		enterRule(_localctx, 70, RULE_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1087);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,148,_ctx) ) {
			case 1:
				{
				setState(1086);
				typeModifierList();
				}
				break;
			}
			setState(1093);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,149,_ctx) ) {
			case 1:
				{
				setState(1089);
				parenthesizedType();
				}
				break;
			case 2:
				{
				setState(1090);
				nullableType();
				}
				break;
			case 3:
				{
				setState(1091);
				typeReference();
				}
				break;
			case 4:
				{
				setState(1092);
				functionType();
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
		enterRule(_localctx, 72, RULE_typeModifierList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1103); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(1103);
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
						setState(1095);
						annotations();
						}
						break;
					case SUSPEND:
						{
						setState(1096);
						match(SUSPEND);
						setState(1100);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==NL) {
							{
							{
							setState(1097);
							match(NL);
							}
							}
							setState(1102);
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
				setState(1105); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,152,_ctx);
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
		enterRule(_localctx, 74, RULE_parenthesizedType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1107);
			match(LPAREN);
			setState(1108);
			type();
			setState(1109);
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
		enterRule(_localctx, 76, RULE_nullableType);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1113);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,153,_ctx) ) {
			case 1:
				{
				setState(1111);
				typeReference();
				}
				break;
			case 2:
				{
				setState(1112);
				parenthesizedType();
				}
				break;
			}
			setState(1118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(1115);
				match(NL);
				}
				}
				setState(1120);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1122); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1121);
					match(QUEST);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1124); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,155,_ctx);
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
		enterRule(_localctx, 78, RULE_typeReference);
		try {
			setState(1132);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,156,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1126);
				match(LPAREN);
				setState(1127);
				typeReference();
				setState(1128);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1130);
				userType();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1131);
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
		enterRule(_localctx, 80, RULE_functionType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1148);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,159,_ctx) ) {
			case 1:
				{
				setState(1134);
				functionTypeReceiver();
				setState(1138);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1135);
					match(NL);
					}
					}
					setState(1140);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1141);
				match(DOT);
				setState(1145);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1142);
					match(NL);
					}
					}
					setState(1147);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(1150);
			functionTypeParameters();
			setState(1154);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(1151);
				match(NL);
				}
				}
				setState(1156);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1157);
			match(ARROW);
			setState(1165);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,162,_ctx) ) {
			case 1:
				{
				setState(1161);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1158);
					match(NL);
					}
					}
					setState(1163);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1164);
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
		enterRule(_localctx, 82, RULE_functionTypeReceiver);
		try {
			setState(1170);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,163,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1167);
				parenthesizedType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1168);
				nullableType();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1169);
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
		enterRule(_localctx, 84, RULE_userType);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1172);
			simpleUserType();
			setState(1189);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,166,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1176);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(1173);
						match(NL);
						}
						}
						setState(1178);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1179);
					match(DOT);
					setState(1183);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(1180);
						match(NL);
						}
						}
						setState(1185);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1186);
					simpleUserType();
					}
					} 
				}
				setState(1191);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,166,_ctx);
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
		enterRule(_localctx, 86, RULE_simpleUserType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1192);
			simpleIdentifier();
			setState(1200);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,168,_ctx) ) {
			case 1:
				{
				setState(1196);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1193);
					match(NL);
					}
					}
					setState(1198);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1199);
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
		enterRule(_localctx, 88, RULE_functionTypeParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1202);
			match(LPAREN);
			setState(1205);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,169,_ctx) ) {
			case 1:
				{
				setState(1203);
				parameter();
				}
				break;
			case 2:
				{
				setState(1204);
				type();
				}
				break;
			}
			setState(1214);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1207);
				match(COMMA);
				setState(1210);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,170,_ctx) ) {
				case 1:
					{
					setState(1208);
					parameter();
					}
					break;
				case 2:
					{
					setState(1209);
					type();
					}
					break;
				}
				}
				}
				setState(1216);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1217);
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
		enterRule(_localctx, 90, RULE_typeConstraints);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1219);
			match(WHERE);
			setState(1223);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(1220);
				match(NL);
				}
				}
				setState(1225);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1226);
			typeConstraint();
			setState(1243);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,175,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1230);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(1227);
						match(NL);
						}
						}
						setState(1232);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1233);
					match(COMMA);
					setState(1237);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(1234);
						match(NL);
						}
						}
						setState(1239);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1240);
					typeConstraint();
					}
					} 
				}
				setState(1245);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,175,_ctx);
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
		enterRule(_localctx, 92, RULE_typeConstraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1249);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT || _la==FILE || ((((_la - 93)) & ~0x3f) == 0 && ((1L << (_la - 93)) & ((1L << (FIELD - 93)) | (1L << (PROPERTY - 93)) | (1L << (GET - 93)) | (1L << (SET - 93)) | (1L << (RECEIVER - 93)) | (1L << (PARAM - 93)) | (1L << (SETPARAM - 93)) | (1L << (DELEGATE - 93)) | (1L << (LabelReference - 93)))) != 0)) {
				{
				{
				setState(1246);
				annotations();
				}
				}
				setState(1251);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1252);
			simpleIdentifier();
			setState(1256);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(1253);
				match(NL);
				}
				}
				setState(1258);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1259);
			match(COLON);
			setState(1263);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(1260);
				match(NL);
				}
				}
				setState(1265);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1266);
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
		public org.antlr.symtab.Scope scope;
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
		enterRule(_localctx, 94, RULE_block);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1268);
			match(LCURL);
			setState(1272);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,179,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1269);
					match(NL);
					}
					} 
				}
				setState(1274);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,179,_ctx);
			}
			setState(1280);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,180,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1275);
					statement();
					setState(1276);
					semi();
					}
					} 
				}
				setState(1282);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,180,_ctx);
			}
			setState(1287);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,182,_ctx) ) {
			case 1:
				{
				setState(1283);
				statement();
				setState(1285);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,181,_ctx) ) {
				case 1:
					{
					setState(1284);
					semi();
					}
					break;
				}
				}
				break;
			}
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
		enterRule(_localctx, 96, RULE_statements);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1309);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,186,_ctx) ) {
			case 1:
				{
				setState(1302);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,184,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1297);
						statement();
						setState(1298);
						semi();
						}
						} 
					}
					setState(1304);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,184,_ctx);
				}
				setState(1305);
				statement();
				setState(1307);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,185,_ctx) ) {
				case 1:
					{
					setState(1306);
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
		enterRule(_localctx, 98, RULE_statement);
		try {
			setState(1314);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,187,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1311);
				declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1312);
				assignment();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1313);
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
		enterRule(_localctx, 100, RULE_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1319);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LabelDefinition) {
				{
				{
				setState(1316);
				labelDefinition();
				}
				}
				setState(1321);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1326);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,189,_ctx) ) {
			case 1:
				{
				setState(1322);
				classDeclaration();
				}
				break;
			case 2:
				{
				setState(1323);
				functionDeclaration();
				}
				break;
			case 3:
				{
				setState(1324);
				propertyDeclaration();
				}
				break;
			case 4:
				{
				setState(1325);
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
		enterRule(_localctx, 102, RULE_assignment);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1328);
			assignableExpression();
			setState(1329);
			assignmentOperator();
			setState(1333);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,190,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1330);
					match(NL);
					}
					} 
				}
				setState(1335);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,190,_ctx);
			}
			setState(1336);
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
		enterRule(_localctx, 104, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1338);
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
		enterRule(_localctx, 106, RULE_disjunction);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1340);
			conjunction();
			setState(1357);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,193,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1344);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(1341);
						match(NL);
						}
						}
						setState(1346);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1347);
					match(DISJ);
					setState(1351);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,192,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(1348);
							match(NL);
							}
							} 
						}
						setState(1353);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,192,_ctx);
					}
					setState(1354);
					conjunction();
					}
					} 
				}
				setState(1359);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,193,_ctx);
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
		enterRule(_localctx, 108, RULE_conjunction);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1360);
			equality();
			setState(1377);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,196,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1364);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(1361);
						match(NL);
						}
						}
						setState(1366);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1367);
					match(CONJ);
					setState(1371);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,195,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(1368);
							match(NL);
							}
							} 
						}
						setState(1373);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,195,_ctx);
					}
					setState(1374);
					equality();
					}
					} 
				}
				setState(1379);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,196,_ctx);
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
		enterRule(_localctx, 110, RULE_equality);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1380);
			comparison();
			setState(1392);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,198,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1381);
					equalityOperator();
					setState(1385);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,197,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(1382);
							match(NL);
							}
							} 
						}
						setState(1387);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,197,_ctx);
					}
					setState(1388);
					comparison();
					}
					} 
				}
				setState(1394);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,198,_ctx);
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
		enterRule(_localctx, 112, RULE_comparison);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1395);
			infixOperation();
			setState(1405);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,200,_ctx) ) {
			case 1:
				{
				setState(1396);
				comparisonOperator();
				setState(1400);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,199,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1397);
						match(NL);
						}
						} 
					}
					setState(1402);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,199,_ctx);
				}
				setState(1403);
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
		enterRule(_localctx, 114, RULE_infixOperation);
		int _la;
		try {
			int _alt;
			setState(1434);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,205,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1407);
				elvisExpression();
				setState(1419);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,202,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1408);
						inOperator();
						setState(1412);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,201,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(1409);
								match(NL);
								}
								} 
							}
							setState(1414);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,201,_ctx);
						}
						setState(1415);
						elvisExpression();
						}
						} 
					}
					setState(1421);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,202,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1422);
				elvisExpression();
				setState(1432);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,204,_ctx) ) {
				case 1:
					{
					setState(1423);
					isOperator();
					setState(1427);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(1424);
						match(NL);
						}
						}
						setState(1429);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1430);
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
		enterRule(_localctx, 116, RULE_elvisExpression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1436);
			infixFunctionCall();
			setState(1453);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,208,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1440);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(1437);
						match(NL);
						}
						}
						setState(1442);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1443);
					match(ELVIS);
					setState(1447);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,207,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(1444);
							match(NL);
							}
							} 
						}
						setState(1449);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,207,_ctx);
					}
					setState(1450);
					infixFunctionCall();
					}
					} 
				}
				setState(1455);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,208,_ctx);
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
		enterRule(_localctx, 118, RULE_infixFunctionCall);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1456);
			rangeExpression();
			setState(1468);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,210,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1457);
					simpleIdentifier();
					setState(1461);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,209,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(1458);
							match(NL);
							}
							} 
						}
						setState(1463);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,209,_ctx);
					}
					setState(1464);
					rangeExpression();
					}
					} 
				}
				setState(1470);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,210,_ctx);
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
		enterRule(_localctx, 120, RULE_rangeExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1471);
			additiveExpression();
			setState(1482);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,212,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1472);
					match(RANGE);
					setState(1476);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,211,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(1473);
							match(NL);
							}
							} 
						}
						setState(1478);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,211,_ctx);
					}
					setState(1479);
					additiveExpression();
					}
					} 
				}
				setState(1484);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,212,_ctx);
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
		enterRule(_localctx, 122, RULE_additiveExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1485);
			multiplicativeExpression();
			setState(1497);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,214,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1486);
					additiveOperator();
					setState(1490);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,213,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(1487);
							match(NL);
							}
							} 
						}
						setState(1492);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,213,_ctx);
					}
					setState(1493);
					multiplicativeExpression();
					}
					} 
				}
				setState(1499);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,214,_ctx);
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
		enterRule(_localctx, 124, RULE_multiplicativeExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1500);
			asExpression();
			setState(1512);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,216,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1501);
					multiplicativeOperator();
					setState(1505);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,215,_ctx);
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
						_alt = getInterpreter().adaptivePredict(_input,215,_ctx);
					}
					setState(1508);
					asExpression();
					}
					} 
				}
				setState(1514);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,216,_ctx);
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
		enterRule(_localctx, 126, RULE_asExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1515);
			prefixUnaryExpression();
			setState(1517);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,217,_ctx) ) {
			case 1:
				{
				setState(1516);
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
		enterRule(_localctx, 128, RULE_asExpressionTail);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1522);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(1519);
				match(NL);
				}
				}
				setState(1524);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1525);
			asOperator();
			setState(1529);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(1526);
				match(NL);
				}
				}
				setState(1531);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1532);
			type();
			setState(1534);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,220,_ctx) ) {
			case 1:
				{
				setState(1533);
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
		enterRule(_localctx, 130, RULE_prefixUnaryExpression);
		int _la;
		try {
			int _alt;
			setState(1550);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,223,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1539);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << SUB) | (1L << INCR) | (1L << DECR) | (1L << EXCL))) != 0)) {
					{
					{
					setState(1536);
					prefixUnaryOperator();
					}
					}
					setState(1541);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1542);
				postfixUnaryExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1546);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,222,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1543);
						annotations();
						}
						} 
					}
					setState(1548);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,222,_ctx);
				}
				setState(1549);
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
		enterRule(_localctx, 132, RULE_postfixUnaryExpression);
		try {
			int _alt;
			setState(1572);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,226,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1552);
				assignableExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1553);
				callExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1554);
				labeledExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1555);
				dotQualifiedExpression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1556);
				assignableExpression();
				setState(1560);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,224,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1557);
						postfixUnaryOperator();
						}
						} 
					}
					setState(1562);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,224,_ctx);
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1563);
				match(LPAREN);
				setState(1564);
				callableReference();
				setState(1565);
				match(RPAREN);
				setState(1567); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1566);
						postfixUnaryOperator();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1569); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,225,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1571);
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
		public org.antlr.symtab.Scope scope;
		public AssignableExpressionContext assignableExpression() {
			return getRuleContext(AssignableExpressionContext.class,0);
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
		enterRule(_localctx, 134, RULE_callExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1574);
			assignableExpression();
			setState(1576);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,227,_ctx) ) {
			case 1:
				{
				setState(1575);
				typeArguments();
				}
				break;
			}
			setState(1579);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,228,_ctx) ) {
			case 1:
				{
				setState(1578);
				valueArguments();
				}
				break;
			}
			setState(1584);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,229,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1581);
					annotatedLambda();
					}
					} 
				}
				setState(1586);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,229,_ctx);
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
		enterRule(_localctx, 136, RULE_labeledExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1587);
			labelDefinition();
			setState(1588);
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
		enterRule(_localctx, 138, RULE_dotQualifiedExpression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1590);
			assignableExpression();
			setState(1600); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
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
					memberAccessOperator();
					setState(1598);
					postfixUnaryExpression();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1602); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,231,_ctx);
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
		enterRule(_localctx, 140, RULE_assignableExpression);
		try {
			setState(1606);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,232,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1604);
				primaryExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1605);
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
		enterRule(_localctx, 142, RULE_indexingExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1608);
			identifier();
			setState(1610); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1609);
					arrayAccess();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1612); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,233,_ctx);
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
		enterRule(_localctx, 144, RULE_callSuffix);
		int _la;
		try {
			int _alt;
			setState(1631);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,237,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1615);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LANGLE) {
					{
					setState(1614);
					typeArguments();
					}
				}

				setState(1617);
				valueArguments();
				setState(1621);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,235,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1618);
						annotatedLambda();
						}
						} 
					}
					setState(1623);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,235,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1624);
				typeArguments();
				setState(1628);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,236,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1625);
						annotatedLambda();
						}
						} 
					}
					setState(1630);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,236,_ctx);
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
		enterRule(_localctx, 146, RULE_annotatedLambda);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1636);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 58)) & ~0x3f) == 0 && ((1L << (_la - 58)) & ((1L << (IMPORT - 58)) | (1L << (CONSTRUCTOR - 58)) | (1L << (BY - 58)) | (1L << (COMPANION - 58)) | (1L << (INIT - 58)) | (1L << (WHERE - 58)) | (1L << (CATCH - 58)) | (1L << (FINALLY - 58)) | (1L << (OUT - 58)) | (1L << (GETTER - 58)) | (1L << (SETTER - 58)) | (1L << (DYNAMIC - 58)) | (1L << (PUBLIC - 58)) | (1L << (PRIVATE - 58)) | (1L << (PROTECTED - 58)) | (1L << (INTERNAL - 58)) | (1L << (ENUM - 58)) | (1L << (SEALED - 58)) | (1L << (ANNOTATION - 58)) | (1L << (DATA - 58)) | (1L << (INNER - 58)) | (1L << (TAILREC - 58)) | (1L << (OPERATOR - 58)) | (1L << (INLINE - 58)) | (1L << (INFIX - 58)) | (1L << (EXTERNAL - 58)) | (1L << (SUSPEND - 58)) | (1L << (OVERRIDE - 58)) | (1L << (ABSTRACT - 58)) | (1L << (FINAL - 58)))) != 0) || ((((_la - 122)) & ~0x3f) == 0 && ((1L << (_la - 122)) & ((1L << (OPEN - 122)) | (1L << (CONST - 122)) | (1L << (LATEINIT - 122)) | (1L << (VARARG - 122)) | (1L << (NOINLINE - 122)) | (1L << (CROSSINLINE - 122)) | (1L << (REIFIED - 122)) | (1L << (Identifier - 122)))) != 0)) {
				{
				{
				setState(1633);
				unescapedAnnotation();
				}
				}
				setState(1638);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1640);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LabelDefinition) {
				{
				setState(1639);
				match(LabelDefinition);
				}
			}

			setState(1645);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(1642);
				match(NL);
				}
				}
				setState(1647);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1648);
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
		enterRule(_localctx, 148, RULE_arrayAccess);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1650);
			match(LSQUARE);
			setState(1659);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NL) | (1L << LPAREN) | (1L << LSQUARE) | (1L << LCURL) | (1L << ADD) | (1L << SUB) | (1L << INCR) | (1L << DECR) | (1L << EXCL) | (1L << COLONCOLON) | (1L << Q_COLONCOLON) | (1L << AT) | (1L << RETURN_AT) | (1L << CONTINUE_AT) | (1L << BREAK_AT) | (1L << FILE) | (1L << IMPORT) | (1L << OBJECT))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (CONSTRUCTOR - 66)) | (1L << (BY - 66)) | (1L << (COMPANION - 66)) | (1L << (INIT - 66)) | (1L << (THIS - 66)) | (1L << (SUPER - 66)) | (1L << (WHERE - 66)) | (1L << (IF - 66)) | (1L << (WHEN - 66)) | (1L << (TRY - 66)) | (1L << (CATCH - 66)) | (1L << (FINALLY - 66)) | (1L << (FOR - 66)) | (1L << (DO - 66)) | (1L << (WHILE - 66)) | (1L << (THROW - 66)) | (1L << (RETURN - 66)) | (1L << (CONTINUE - 66)) | (1L << (BREAK - 66)) | (1L << (OUT - 66)) | (1L << (FIELD - 66)) | (1L << (PROPERTY - 66)) | (1L << (GET - 66)) | (1L << (SET - 66)) | (1L << (GETTER - 66)) | (1L << (SETTER - 66)) | (1L << (RECEIVER - 66)) | (1L << (PARAM - 66)) | (1L << (SETPARAM - 66)) | (1L << (DELEGATE - 66)) | (1L << (DYNAMIC - 66)) | (1L << (PUBLIC - 66)) | (1L << (PRIVATE - 66)) | (1L << (PROTECTED - 66)) | (1L << (INTERNAL - 66)) | (1L << (ENUM - 66)) | (1L << (SEALED - 66)) | (1L << (ANNOTATION - 66)) | (1L << (DATA - 66)) | (1L << (INNER - 66)) | (1L << (TAILREC - 66)) | (1L << (OPERATOR - 66)) | (1L << (INLINE - 66)) | (1L << (INFIX - 66)) | (1L << (EXTERNAL - 66)) | (1L << (SUSPEND - 66)) | (1L << (OVERRIDE - 66)) | (1L << (ABSTRACT - 66)) | (1L << (FINAL - 66)) | (1L << (OPEN - 66)) | (1L << (CONST - 66)) | (1L << (LATEINIT - 66)) | (1L << (VARARG - 66)) | (1L << (NOINLINE - 66)) | (1L << (CROSSINLINE - 66)) | (1L << (REIFIED - 66)) | (1L << (QUOTE_OPEN - 66)))) != 0) || ((((_la - 130)) & ~0x3f) == 0 && ((1L << (_la - 130)) & ((1L << (TRIPLE_QUOTE_OPEN - 130)) | (1L << (RealLiteral - 130)) | (1L << (LongLiteral - 130)) | (1L << (IntegerLiteral - 130)) | (1L << (HexLiteral - 130)) | (1L << (BinLiteral - 130)) | (1L << (BooleanLiteral - 130)) | (1L << (NullLiteral - 130)) | (1L << (Identifier - 130)) | (1L << (LabelReference - 130)) | (1L << (LabelDefinition - 130)) | (1L << (CharacterLiteral - 130)))) != 0)) {
				{
				setState(1651);
				expression();
				setState(1656);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1652);
					match(COMMA);
					setState(1653);
					expression();
					}
					}
					setState(1658);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1661);
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
		enterRule(_localctx, 150, RULE_valueArguments);
		int _la;
		try {
			setState(1679);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,245,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1663);
				match(LPAREN);
				setState(1665);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NL) | (1L << LPAREN) | (1L << LSQUARE) | (1L << LCURL) | (1L << MULT) | (1L << ADD) | (1L << SUB) | (1L << INCR) | (1L << DECR) | (1L << EXCL) | (1L << COLONCOLON) | (1L << Q_COLONCOLON) | (1L << AT) | (1L << RETURN_AT) | (1L << CONTINUE_AT) | (1L << BREAK_AT) | (1L << FILE) | (1L << IMPORT) | (1L << OBJECT))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (CONSTRUCTOR - 66)) | (1L << (BY - 66)) | (1L << (COMPANION - 66)) | (1L << (INIT - 66)) | (1L << (THIS - 66)) | (1L << (SUPER - 66)) | (1L << (WHERE - 66)) | (1L << (IF - 66)) | (1L << (WHEN - 66)) | (1L << (TRY - 66)) | (1L << (CATCH - 66)) | (1L << (FINALLY - 66)) | (1L << (FOR - 66)) | (1L << (DO - 66)) | (1L << (WHILE - 66)) | (1L << (THROW - 66)) | (1L << (RETURN - 66)) | (1L << (CONTINUE - 66)) | (1L << (BREAK - 66)) | (1L << (OUT - 66)) | (1L << (FIELD - 66)) | (1L << (PROPERTY - 66)) | (1L << (GET - 66)) | (1L << (SET - 66)) | (1L << (GETTER - 66)) | (1L << (SETTER - 66)) | (1L << (RECEIVER - 66)) | (1L << (PARAM - 66)) | (1L << (SETPARAM - 66)) | (1L << (DELEGATE - 66)) | (1L << (DYNAMIC - 66)) | (1L << (PUBLIC - 66)) | (1L << (PRIVATE - 66)) | (1L << (PROTECTED - 66)) | (1L << (INTERNAL - 66)) | (1L << (ENUM - 66)) | (1L << (SEALED - 66)) | (1L << (ANNOTATION - 66)) | (1L << (DATA - 66)) | (1L << (INNER - 66)) | (1L << (TAILREC - 66)) | (1L << (OPERATOR - 66)) | (1L << (INLINE - 66)) | (1L << (INFIX - 66)) | (1L << (EXTERNAL - 66)) | (1L << (SUSPEND - 66)) | (1L << (OVERRIDE - 66)) | (1L << (ABSTRACT - 66)) | (1L << (FINAL - 66)) | (1L << (OPEN - 66)) | (1L << (CONST - 66)) | (1L << (LATEINIT - 66)) | (1L << (VARARG - 66)) | (1L << (NOINLINE - 66)) | (1L << (CROSSINLINE - 66)) | (1L << (REIFIED - 66)) | (1L << (QUOTE_OPEN - 66)))) != 0) || ((((_la - 130)) & ~0x3f) == 0 && ((1L << (_la - 130)) & ((1L << (TRIPLE_QUOTE_OPEN - 130)) | (1L << (RealLiteral - 130)) | (1L << (LongLiteral - 130)) | (1L << (IntegerLiteral - 130)) | (1L << (HexLiteral - 130)) | (1L << (BinLiteral - 130)) | (1L << (BooleanLiteral - 130)) | (1L << (NullLiteral - 130)) | (1L << (Identifier - 130)) | (1L << (LabelReference - 130)) | (1L << (LabelDefinition - 130)) | (1L << (CharacterLiteral - 130)))) != 0)) {
					{
					setState(1664);
					valueArgument();
					}
				}

				setState(1667);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1668);
				match(LPAREN);
				setState(1669);
				valueArgument();
				setState(1674);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1670);
					match(COMMA);
					setState(1671);
					valueArgument();
					}
					}
					setState(1676);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1677);
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
		enterRule(_localctx, 152, RULE_typeArguments);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1681);
			match(LANGLE);
			setState(1685);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(1682);
				match(NL);
				}
				}
				setState(1687);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1688);
			typeProjection();
			setState(1699);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,248,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1692);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(1689);
						match(NL);
						}
						}
						setState(1694);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1695);
					match(COMMA);
					setState(1696);
					typeProjection();
					}
					} 
				}
				setState(1701);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,248,_ctx);
			}
			setState(1705);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(1702);
				match(NL);
				}
				}
				setState(1707);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1708);
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
		enterRule(_localctx, 154, RULE_typeProjection);
		try {
			setState(1715);
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
			case Identifier:
			case LabelReference:
				enterOuterAlt(_localctx, 1);
				{
				setState(1711);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,250,_ctx) ) {
				case 1:
					{
					setState(1710);
					typeProjectionModifierList();
					}
					break;
				}
				setState(1713);
				type();
				}
				break;
			case MULT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1714);
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
		enterRule(_localctx, 156, RULE_typeProjectionModifierList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1718); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1717);
					varianceAnnotation();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1720); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,252,_ctx);
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
		enterRule(_localctx, 158, RULE_valueArgument);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1736);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,255,_ctx) ) {
			case 1:
				{
				setState(1722);
				simpleIdentifier();
				setState(1726);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1723);
					match(NL);
					}
					}
					setState(1728);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1729);
				match(ASSIGNMENT);
				setState(1733);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,254,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1730);
						match(NL);
						}
						} 
					}
					setState(1735);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,254,_ctx);
				}
				}
				break;
			}
			setState(1739);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MULT) {
				{
				setState(1738);
				match(MULT);
				}
			}

			setState(1744);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,257,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1741);
					match(NL);
					}
					} 
				}
				setState(1746);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,257,_ctx);
			}
			setState(1747);
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
		enterRule(_localctx, 160, RULE_primaryExpression);
		try {
			setState(1762);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(1749);
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
				setState(1750);
				literalConstant();
				}
				break;
			case QUOTE_OPEN:
			case TRIPLE_QUOTE_OPEN:
				enterOuterAlt(_localctx, 3);
				{
				setState(1751);
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
				setState(1752);
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
				setState(1753);
				functionLiteral();
				}
				break;
			case OBJECT:
				enterOuterAlt(_localctx, 6);
				{
				setState(1754);
				objectLiteral();
				}
				break;
			case LSQUARE:
				enterOuterAlt(_localctx, 7);
				{
				setState(1755);
				collectionLiteral();
				}
				break;
			case THIS:
				enterOuterAlt(_localctx, 8);
				{
				setState(1756);
				thisExpression();
				}
				break;
			case SUPER:
				enterOuterAlt(_localctx, 9);
				{
				setState(1757);
				superExpression();
				}
				break;
			case IF:
			case WHEN:
				enterOuterAlt(_localctx, 10);
				{
				setState(1758);
				conditionalExpression();
				}
				break;
			case TRY:
				enterOuterAlt(_localctx, 11);
				{
				setState(1759);
				tryExpression();
				}
				break;
			case FOR:
			case DO:
			case WHILE:
				enterOuterAlt(_localctx, 12);
				{
				setState(1760);
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
				setState(1761);
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
		enterRule(_localctx, 162, RULE_parenthesizedExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1764);
			match(LPAREN);
			setState(1765);
			expression();
			setState(1766);
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
		enterRule(_localctx, 164, RULE_literalConstant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1768);
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
		enterRule(_localctx, 166, RULE_stringLiteral);
		try {
			setState(1772);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case QUOTE_OPEN:
				enterOuterAlt(_localctx, 1);
				{
				setState(1770);
				lineStringLiteral();
				}
				break;
			case TRIPLE_QUOTE_OPEN:
				enterOuterAlt(_localctx, 2);
				{
				setState(1771);
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
		enterRule(_localctx, 168, RULE_lineStringLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1774);
			match(QUOTE_OPEN);
			setState(1779);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 156)) & ~0x3f) == 0 && ((1L << (_la - 156)) & ((1L << (LineStrRef - 156)) | (1L << (LineStrText - 156)) | (1L << (LineStrEscapedChar - 156)) | (1L << (LineStrExprStart - 156)))) != 0)) {
				{
				setState(1777);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LineStrRef:
				case LineStrText:
				case LineStrEscapedChar:
					{
					setState(1775);
					lineStringContent();
					}
					break;
				case LineStrExprStart:
					{
					setState(1776);
					lineStringExpression();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(1781);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1782);
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
		enterRule(_localctx, 170, RULE_multiLineStringLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1784);
			match(TRIPLE_QUOTE_OPEN);
			setState(1791);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (QUOTE_OPEN - 129)) | (1L << (MultiLineStringQuote - 129)) | (1L << (MultiLineStrRef - 129)) | (1L << (MultiLineStrText - 129)) | (1L << (MultiLineStrEscapedChar - 129)) | (1L << (MultiLineStrExprStart - 129)))) != 0)) {
				{
				setState(1789);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case MultiLineStrRef:
				case MultiLineStrText:
				case MultiLineStrEscapedChar:
					{
					setState(1785);
					multiLineStringContent();
					}
					break;
				case MultiLineStrExprStart:
					{
					setState(1786);
					multiLineStringExpression();
					}
					break;
				case QUOTE_OPEN:
					{
					setState(1787);
					lineStringLiteral();
					}
					break;
				case MultiLineStringQuote:
					{
					setState(1788);
					match(MultiLineStringQuote);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(1793);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1794);
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
		enterRule(_localctx, 172, RULE_lineStringContent);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1796);
			_la = _input.LA(1);
			if ( !(((((_la - 156)) & ~0x3f) == 0 && ((1L << (_la - 156)) & ((1L << (LineStrRef - 156)) | (1L << (LineStrText - 156)) | (1L << (LineStrEscapedChar - 156)))) != 0)) ) {
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
		enterRule(_localctx, 174, RULE_lineStringExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1798);
			match(LineStrExprStart);
			setState(1799);
			expression();
			setState(1800);
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
		enterRule(_localctx, 176, RULE_multiLineStringContent);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1802);
			_la = _input.LA(1);
			if ( !(((((_la - 162)) & ~0x3f) == 0 && ((1L << (_la - 162)) & ((1L << (MultiLineStrRef - 162)) | (1L << (MultiLineStrText - 162)) | (1L << (MultiLineStrEscapedChar - 162)))) != 0)) ) {
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
		enterRule(_localctx, 178, RULE_multiLineStringExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1804);
			match(MultiLineStrExprStart);
			setState(1805);
			expression();
			setState(1806);
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
		enterRule(_localctx, 180, RULE_functionLiteral);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1811);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT || _la==FILE || ((((_la - 93)) & ~0x3f) == 0 && ((1L << (_la - 93)) & ((1L << (FIELD - 93)) | (1L << (PROPERTY - 93)) | (1L << (GET - 93)) | (1L << (SET - 93)) | (1L << (RECEIVER - 93)) | (1L << (PARAM - 93)) | (1L << (SETPARAM - 93)) | (1L << (DELEGATE - 93)) | (1L << (LabelReference - 93)))) != 0)) {
				{
				{
				setState(1808);
				annotations();
				}
				}
				setState(1813);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1860);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,271,_ctx) ) {
			case 1:
				{
				setState(1814);
				match(LCURL);
				setState(1818);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,265,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1815);
						match(NL);
						}
						} 
					}
					setState(1820);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,265,_ctx);
				}
				setState(1821);
				statements();
				setState(1825);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1822);
					match(NL);
					}
					}
					setState(1827);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1828);
				match(RCURL);
				}
				break;
			case 2:
				{
				setState(1830);
				match(LCURL);
				setState(1834);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,267,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1831);
						match(NL);
						}
						} 
					}
					setState(1836);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,267,_ctx);
				}
				setState(1837);
				lambdaParameters();
				setState(1841);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1838);
					match(NL);
					}
					}
					setState(1843);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1844);
				match(ARROW);
				setState(1848);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,269,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1845);
						match(NL);
						}
						} 
					}
					setState(1850);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,269,_ctx);
				}
				setState(1851);
				statements();
				setState(1855);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1852);
					match(NL);
					}
					}
					setState(1857);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1858);
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
		enterRule(_localctx, 182, RULE_lambdaParameters);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1863);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN || _la==IMPORT || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (CONSTRUCTOR - 66)) | (1L << (BY - 66)) | (1L << (COMPANION - 66)) | (1L << (INIT - 66)) | (1L << (WHERE - 66)) | (1L << (CATCH - 66)) | (1L << (FINALLY - 66)) | (1L << (OUT - 66)) | (1L << (GETTER - 66)) | (1L << (SETTER - 66)) | (1L << (DYNAMIC - 66)) | (1L << (PUBLIC - 66)) | (1L << (PRIVATE - 66)) | (1L << (PROTECTED - 66)) | (1L << (INTERNAL - 66)) | (1L << (ENUM - 66)) | (1L << (SEALED - 66)) | (1L << (ANNOTATION - 66)) | (1L << (DATA - 66)) | (1L << (INNER - 66)) | (1L << (TAILREC - 66)) | (1L << (OPERATOR - 66)) | (1L << (INLINE - 66)) | (1L << (INFIX - 66)) | (1L << (EXTERNAL - 66)) | (1L << (SUSPEND - 66)) | (1L << (OVERRIDE - 66)) | (1L << (ABSTRACT - 66)) | (1L << (FINAL - 66)) | (1L << (OPEN - 66)) | (1L << (CONST - 66)) | (1L << (LATEINIT - 66)) | (1L << (VARARG - 66)) | (1L << (NOINLINE - 66)) | (1L << (CROSSINLINE - 66)) | (1L << (REIFIED - 66)))) != 0) || _la==Identifier) {
				{
				setState(1862);
				lambdaParameter();
				}
			}

			setState(1881);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,275,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1868);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(1865);
						match(NL);
						}
						}
						setState(1870);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1871);
					match(COMMA);
					setState(1875);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(1872);
						match(NL);
						}
						}
						setState(1877);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1878);
					lambdaParameter();
					}
					} 
				}
				setState(1883);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,275,_ctx);
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
		enterRule(_localctx, 184, RULE_lambdaParameter);
		int _la;
		try {
			setState(1902);
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
				setState(1884);
				variableDeclaration();
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(1885);
				multiVariableDeclaration();
				setState(1900);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,278,_ctx) ) {
				case 1:
					{
					setState(1889);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(1886);
						match(NL);
						}
						}
						setState(1891);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1892);
					match(COLON);
					setState(1896);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(1893);
						match(NL);
						}
						}
						setState(1898);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1899);
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
		enterRule(_localctx, 186, RULE_objectLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1904);
			match(OBJECT);
			setState(1919);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,282,_ctx) ) {
			case 1:
				{
				setState(1908);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1905);
					match(NL);
					}
					}
					setState(1910);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1911);
				match(COLON);
				setState(1915);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1912);
					match(NL);
					}
					}
					setState(1917);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1918);
				delegationSpecifiers();
				}
				break;
			}
			setState(1924);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(1921);
				match(NL);
				}
				}
				setState(1926);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1927);
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
		enterRule(_localctx, 188, RULE_collectionLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1929);
			match(LSQUARE);
			setState(1931);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NL) | (1L << LPAREN) | (1L << LSQUARE) | (1L << LCURL) | (1L << ADD) | (1L << SUB) | (1L << INCR) | (1L << DECR) | (1L << EXCL) | (1L << COLONCOLON) | (1L << Q_COLONCOLON) | (1L << AT) | (1L << RETURN_AT) | (1L << CONTINUE_AT) | (1L << BREAK_AT) | (1L << FILE) | (1L << IMPORT) | (1L << OBJECT))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (CONSTRUCTOR - 66)) | (1L << (BY - 66)) | (1L << (COMPANION - 66)) | (1L << (INIT - 66)) | (1L << (THIS - 66)) | (1L << (SUPER - 66)) | (1L << (WHERE - 66)) | (1L << (IF - 66)) | (1L << (WHEN - 66)) | (1L << (TRY - 66)) | (1L << (CATCH - 66)) | (1L << (FINALLY - 66)) | (1L << (FOR - 66)) | (1L << (DO - 66)) | (1L << (WHILE - 66)) | (1L << (THROW - 66)) | (1L << (RETURN - 66)) | (1L << (CONTINUE - 66)) | (1L << (BREAK - 66)) | (1L << (OUT - 66)) | (1L << (FIELD - 66)) | (1L << (PROPERTY - 66)) | (1L << (GET - 66)) | (1L << (SET - 66)) | (1L << (GETTER - 66)) | (1L << (SETTER - 66)) | (1L << (RECEIVER - 66)) | (1L << (PARAM - 66)) | (1L << (SETPARAM - 66)) | (1L << (DELEGATE - 66)) | (1L << (DYNAMIC - 66)) | (1L << (PUBLIC - 66)) | (1L << (PRIVATE - 66)) | (1L << (PROTECTED - 66)) | (1L << (INTERNAL - 66)) | (1L << (ENUM - 66)) | (1L << (SEALED - 66)) | (1L << (ANNOTATION - 66)) | (1L << (DATA - 66)) | (1L << (INNER - 66)) | (1L << (TAILREC - 66)) | (1L << (OPERATOR - 66)) | (1L << (INLINE - 66)) | (1L << (INFIX - 66)) | (1L << (EXTERNAL - 66)) | (1L << (SUSPEND - 66)) | (1L << (OVERRIDE - 66)) | (1L << (ABSTRACT - 66)) | (1L << (FINAL - 66)) | (1L << (OPEN - 66)) | (1L << (CONST - 66)) | (1L << (LATEINIT - 66)) | (1L << (VARARG - 66)) | (1L << (NOINLINE - 66)) | (1L << (CROSSINLINE - 66)) | (1L << (REIFIED - 66)) | (1L << (QUOTE_OPEN - 66)))) != 0) || ((((_la - 130)) & ~0x3f) == 0 && ((1L << (_la - 130)) & ((1L << (TRIPLE_QUOTE_OPEN - 130)) | (1L << (RealLiteral - 130)) | (1L << (LongLiteral - 130)) | (1L << (IntegerLiteral - 130)) | (1L << (HexLiteral - 130)) | (1L << (BinLiteral - 130)) | (1L << (BooleanLiteral - 130)) | (1L << (NullLiteral - 130)) | (1L << (Identifier - 130)) | (1L << (LabelReference - 130)) | (1L << (LabelDefinition - 130)) | (1L << (CharacterLiteral - 130)))) != 0)) {
				{
				setState(1930);
				expression();
				}
			}

			setState(1937);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1933);
				match(COMMA);
				setState(1934);
				expression();
				}
				}
				setState(1939);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1940);
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
		enterRule(_localctx, 190, RULE_thisExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1942);
			match(THIS);
			setState(1944);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,286,_ctx) ) {
			case 1:
				{
				setState(1943);
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
		enterRule(_localctx, 192, RULE_superExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1946);
			match(SUPER);
			setState(1963);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,289,_ctx) ) {
			case 1:
				{
				setState(1947);
				match(LANGLE);
				setState(1951);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1948);
					match(NL);
					}
					}
					setState(1953);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1954);
				type();
				setState(1958);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1955);
					match(NL);
					}
					}
					setState(1960);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1961);
				match(RANGLE);
				}
				break;
			}
			setState(1966);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,290,_ctx) ) {
			case 1:
				{
				setState(1965);
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
		enterRule(_localctx, 194, RULE_conditionalExpression);
		try {
			setState(1970);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(1968);
				ifExpression();
				}
				break;
			case WHEN:
				enterOuterAlt(_localctx, 2);
				{
				setState(1969);
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
		enterRule(_localctx, 196, RULE_ifExpression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1972);
			match(IF);
			setState(1976);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(1973);
				match(NL);
				}
				}
				setState(1978);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1979);
			match(LPAREN);
			setState(1980);
			expression();
			setState(1981);
			match(RPAREN);
			setState(1985);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,293,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1982);
					match(NL);
					}
					} 
				}
				setState(1987);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,293,_ctx);
			}
			setState(1989);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,294,_ctx) ) {
			case 1:
				{
				setState(1988);
				controlStructureBody();
				}
				break;
			}
			setState(1992);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,295,_ctx) ) {
			case 1:
				{
				setState(1991);
				match(SEMICOLON);
				}
				break;
			}
			setState(2010);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,299,_ctx) ) {
			case 1:
				{
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
				match(ELSE);
				setState(2004);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,297,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(2001);
						match(NL);
						}
						} 
					}
					setState(2006);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,297,_ctx);
				}
				setState(2008);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,298,_ctx) ) {
				case 1:
					{
					setState(2007);
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
		enterRule(_localctx, 198, RULE_controlStructureBody);
		try {
			setState(2014);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,300,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2012);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2013);
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
		enterRule(_localctx, 200, RULE_whenExpression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2016);
			match(WHEN);
			setState(2020);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,301,_ctx);
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
				_alt = getInterpreter().adaptivePredict(_input,301,_ctx);
			}
			setState(2027);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(2023);
				match(LPAREN);
				setState(2024);
				expression();
				setState(2025);
				match(RPAREN);
				}
			}

			setState(2032);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2029);
				match(NL);
				}
				}
				setState(2034);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2035);
			match(LCURL);
			setState(2039);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,304,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2036);
					match(NL);
					}
					} 
				}
				setState(2041);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,304,_ctx);
			}
			setState(2051);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,306,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2042);
					whenEntry();
					setState(2046);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,305,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(2043);
							match(NL);
							}
							} 
						}
						setState(2048);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,305,_ctx);
					}
					}
					} 
				}
				setState(2053);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,306,_ctx);
			}
			setState(2057);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2054);
				match(NL);
				}
				}
				setState(2059);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2060);
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
		enterRule(_localctx, 202, RULE_whenEntry);
		int _la;
		try {
			int _alt;
			setState(2114);
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
				setState(2062);
				whenCondition();
				setState(2079);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,310,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(2066);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==NL) {
							{
							{
							setState(2063);
							match(NL);
							}
							}
							setState(2068);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(2069);
						match(COMMA);
						setState(2073);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,309,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(2070);
								match(NL);
								}
								} 
							}
							setState(2075);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,309,_ctx);
						}
						setState(2076);
						whenCondition();
						}
						} 
					}
					setState(2081);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,310,_ctx);
				}
				setState(2085);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(2082);
					match(NL);
					}
					}
					setState(2087);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2088);
				match(ARROW);
				setState(2092);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,312,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(2089);
						match(NL);
						}
						} 
					}
					setState(2094);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,312,_ctx);
				}
				setState(2095);
				controlStructureBody();
				setState(2097);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,313,_ctx) ) {
				case 1:
					{
					setState(2096);
					semi();
					}
					break;
				}
				}
				break;
			case ELSE:
				enterOuterAlt(_localctx, 2);
				{
				setState(2099);
				match(ELSE);
				setState(2103);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(2100);
					match(NL);
					}
					}
					setState(2105);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2106);
				match(ARROW);
				setState(2110);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,315,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(2107);
						match(NL);
						}
						} 
					}
					setState(2112);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,315,_ctx);
				}
				setState(2113);
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
		enterRule(_localctx, 204, RULE_whenCondition);
		try {
			setState(2119);
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
				setState(2116);
				expression();
				}
				break;
			case IN:
			case NOT_IN:
				enterOuterAlt(_localctx, 2);
				{
				setState(2117);
				rangeTest();
				}
				break;
			case IS:
			case NOT_IS:
				enterOuterAlt(_localctx, 3);
				{
				setState(2118);
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
		enterRule(_localctx, 206, RULE_rangeTest);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2121);
			inOperator();
			setState(2125);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,318,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2122);
					match(NL);
					}
					} 
				}
				setState(2127);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,318,_ctx);
			}
			setState(2128);
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
		enterRule(_localctx, 208, RULE_typeTest);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2130);
			isOperator();
			setState(2134);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2131);
				match(NL);
				}
				}
				setState(2136);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2137);
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
		enterRule(_localctx, 210, RULE_tryExpression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2139);
			match(TRY);
			setState(2143);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2140);
				match(NL);
				}
				}
				setState(2145);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2146);
			block();
			setState(2156);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,322,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2150);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(2147);
						match(NL);
						}
						}
						setState(2152);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2153);
					catchBlock();
					}
					} 
				}
				setState(2158);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,322,_ctx);
			}
			setState(2166);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,324,_ctx) ) {
			case 1:
				{
				setState(2162);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(2159);
					match(NL);
					}
					}
					setState(2164);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2165);
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
		enterRule(_localctx, 212, RULE_catchBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2168);
			match(CATCH);
			setState(2172);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2169);
				match(NL);
				}
				}
				setState(2174);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2175);
			match(LPAREN);
			setState(2179);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT || _la==FILE || ((((_la - 93)) & ~0x3f) == 0 && ((1L << (_la - 93)) & ((1L << (FIELD - 93)) | (1L << (PROPERTY - 93)) | (1L << (GET - 93)) | (1L << (SET - 93)) | (1L << (RECEIVER - 93)) | (1L << (PARAM - 93)) | (1L << (SETPARAM - 93)) | (1L << (DELEGATE - 93)) | (1L << (LabelReference - 93)))) != 0)) {
				{
				{
				setState(2176);
				annotations();
				}
				}
				setState(2181);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2182);
			simpleIdentifier();
			setState(2183);
			match(COLON);
			setState(2184);
			userType();
			setState(2185);
			match(RPAREN);
			setState(2189);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2186);
				match(NL);
				}
				}
				setState(2191);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2192);
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
		enterRule(_localctx, 214, RULE_finallyBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2194);
			match(FINALLY);
			setState(2198);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2195);
				match(NL);
				}
				}
				setState(2200);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2201);
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
		enterRule(_localctx, 216, RULE_loopExpression);
		try {
			setState(2206);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(2203);
				forExpression();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(2204);
				whileExpression();
				}
				break;
			case DO:
				enterOuterAlt(_localctx, 3);
				{
				setState(2205);
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
		public org.antlr.symtab.Scope scope;
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
		enterRule(_localctx, 218, RULE_forExpression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2208);
			match(FOR);
			setState(2212);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2209);
				match(NL);
				}
				}
				setState(2214);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2215);
			match(LPAREN);
			setState(2219);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT || _la==FILE || ((((_la - 93)) & ~0x3f) == 0 && ((1L << (_la - 93)) & ((1L << (FIELD - 93)) | (1L << (PROPERTY - 93)) | (1L << (GET - 93)) | (1L << (SET - 93)) | (1L << (RECEIVER - 93)) | (1L << (PARAM - 93)) | (1L << (SETPARAM - 93)) | (1L << (DELEGATE - 93)) | (1L << (LabelReference - 93)))) != 0)) {
				{
				{
				setState(2216);
				annotations();
				}
				}
				setState(2221);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2224);
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
				setState(2222);
				variableDeclaration();
				}
				break;
			case LPAREN:
				{
				setState(2223);
				multiVariableDeclaration();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(2226);
			match(IN);
			setState(2227);
			expression();
			setState(2228);
			match(RPAREN);
			setState(2232);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,333,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2229);
					match(NL);
					}
					} 
				}
				setState(2234);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,333,_ctx);
			}
			setState(2236);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,334,_ctx) ) {
			case 1:
				{
				setState(2235);
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
		public org.antlr.symtab.Scope scope;
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
		enterRule(_localctx, 220, RULE_whileExpression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2238);
			match(WHILE);
			setState(2242);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2239);
				match(NL);
				}
				}
				setState(2244);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2245);
			match(LPAREN);
			setState(2246);
			expression();
			setState(2247);
			match(RPAREN);
			setState(2251);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,336,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2248);
					match(NL);
					}
					} 
				}
				setState(2253);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,336,_ctx);
			}
			setState(2255);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,337,_ctx) ) {
			case 1:
				{
				setState(2254);
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
		public org.antlr.symtab.Scope scope;
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
		enterRule(_localctx, 222, RULE_doWhileExpression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2257);
			match(DO);
			setState(2261);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,338,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2258);
					match(NL);
					}
					} 
				}
				setState(2263);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,338,_ctx);
			}
			setState(2265);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,339,_ctx) ) {
			case 1:
				{
				setState(2264);
				controlStructureBody();
				}
				break;
			}
			setState(2270);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2267);
				match(NL);
				}
				}
				setState(2272);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2273);
			match(WHILE);
			setState(2277);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2274);
				match(NL);
				}
				}
				setState(2279);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2280);
			match(LPAREN);
			setState(2281);
			expression();
			setState(2282);
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
		enterRule(_localctx, 224, RULE_jumpExpression);
		int _la;
		try {
			int _alt;
			setState(2300);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case THROW:
				enterOuterAlt(_localctx, 1);
				{
				setState(2284);
				match(THROW);
				setState(2288);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,342,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(2285);
						match(NL);
						}
						} 
					}
					setState(2290);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,342,_ctx);
				}
				setState(2291);
				expression();
				}
				break;
			case RETURN_AT:
			case RETURN:
				enterOuterAlt(_localctx, 2);
				{
				setState(2292);
				_la = _input.LA(1);
				if ( !(_la==RETURN_AT || _la==RETURN) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2294);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,343,_ctx) ) {
				case 1:
					{
					setState(2293);
					expression();
					}
					break;
				}
				}
				break;
			case CONTINUE:
				enterOuterAlt(_localctx, 3);
				{
				setState(2296);
				match(CONTINUE);
				}
				break;
			case CONTINUE_AT:
				enterOuterAlt(_localctx, 4);
				{
				setState(2297);
				match(CONTINUE_AT);
				}
				break;
			case BREAK:
				enterOuterAlt(_localctx, 5);
				{
				setState(2298);
				match(BREAK);
				}
				break;
			case BREAK_AT:
				enterOuterAlt(_localctx, 6);
				{
				setState(2299);
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
		enterRule(_localctx, 226, RULE_callableReference);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2315);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 58)) & ~0x3f) == 0 && ((1L << (_la - 58)) & ((1L << (IMPORT - 58)) | (1L << (CONSTRUCTOR - 58)) | (1L << (BY - 58)) | (1L << (COMPANION - 58)) | (1L << (INIT - 58)) | (1L << (WHERE - 58)) | (1L << (CATCH - 58)) | (1L << (FINALLY - 58)) | (1L << (OUT - 58)) | (1L << (GETTER - 58)) | (1L << (SETTER - 58)) | (1L << (DYNAMIC - 58)) | (1L << (PUBLIC - 58)) | (1L << (PRIVATE - 58)) | (1L << (PROTECTED - 58)) | (1L << (INTERNAL - 58)) | (1L << (ENUM - 58)) | (1L << (SEALED - 58)) | (1L << (ANNOTATION - 58)) | (1L << (DATA - 58)) | (1L << (INNER - 58)) | (1L << (TAILREC - 58)) | (1L << (OPERATOR - 58)) | (1L << (INLINE - 58)) | (1L << (INFIX - 58)) | (1L << (EXTERNAL - 58)) | (1L << (SUSPEND - 58)) | (1L << (OVERRIDE - 58)) | (1L << (ABSTRACT - 58)) | (1L << (FINAL - 58)))) != 0) || ((((_la - 122)) & ~0x3f) == 0 && ((1L << (_la - 122)) & ((1L << (OPEN - 122)) | (1L << (CONST - 122)) | (1L << (LATEINIT - 122)) | (1L << (VARARG - 122)) | (1L << (NOINLINE - 122)) | (1L << (CROSSINLINE - 122)) | (1L << (REIFIED - 122)) | (1L << (Identifier - 122)))) != 0)) {
				{
				setState(2302);
				userType();
				setState(2312);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==QUEST) {
					{
					{
					setState(2303);
					match(QUEST);
					setState(2307);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,345,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(2304);
							match(NL);
							}
							} 
						}
						setState(2309);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,345,_ctx);
					}
					}
					}
					setState(2314);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(2320);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2317);
				match(NL);
				}
				}
				setState(2322);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2323);
			_la = _input.LA(1);
			if ( !(_la==COLONCOLON || _la==Q_COLONCOLON) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(2327);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2324);
				match(NL);
				}
				}
				setState(2329);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2332);
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
				setState(2330);
				identifier();
				}
				break;
			case CLASS:
				{
				setState(2331);
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
		enterRule(_localctx, 228, RULE_assignmentOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2334);
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
		enterRule(_localctx, 230, RULE_equalityOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2336);
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
		enterRule(_localctx, 232, RULE_comparisonOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2338);
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
		enterRule(_localctx, 234, RULE_inOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2340);
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
		enterRule(_localctx, 236, RULE_isOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2342);
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
		enterRule(_localctx, 238, RULE_additiveOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2344);
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
		enterRule(_localctx, 240, RULE_multiplicativeOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2346);
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
		enterRule(_localctx, 242, RULE_asOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2348);
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
		enterRule(_localctx, 244, RULE_prefixUnaryOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2350);
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
		enterRule(_localctx, 246, RULE_postfixUnaryOperator);
		try {
			setState(2356);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INCR:
				enterOuterAlt(_localctx, 1);
				{
				setState(2352);
				match(INCR);
				}
				break;
			case DECR:
				enterOuterAlt(_localctx, 2);
				{
				setState(2353);
				match(DECR);
				}
				break;
			case EXCL:
				enterOuterAlt(_localctx, 3);
				{
				setState(2354);
				match(EXCL);
				setState(2355);
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
		enterRule(_localctx, 248, RULE_memberAccessOperator);
		try {
			setState(2361);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(2358);
				match(DOT);
				}
				break;
			case QUEST:
				enterOuterAlt(_localctx, 2);
				{
				setState(2359);
				match(QUEST);
				setState(2360);
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
		enterRule(_localctx, 250, RULE_modifierList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2365); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(2365);
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
						setState(2363);
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
						setState(2364);
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
				setState(2367); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,354,_ctx);
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
		enterRule(_localctx, 252, RULE_modifier);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2378);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ENUM:
			case SEALED:
			case ANNOTATION:
			case DATA:
			case INNER:
				{
				setState(2369);
				classModifier();
				}
				break;
			case OVERRIDE:
			case LATEINIT:
				{
				setState(2370);
				memberModifier();
				}
				break;
			case PUBLIC:
			case PRIVATE:
			case PROTECTED:
			case INTERNAL:
				{
				setState(2371);
				visibilityModifier();
				}
				break;
			case IN:
			case OUT:
				{
				setState(2372);
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
				setState(2373);
				functionModifier();
				}
				break;
			case CONST:
				{
				setState(2374);
				propertyModifier();
				}
				break;
			case ABSTRACT:
			case FINAL:
			case OPEN:
				{
				setState(2375);
				inheritanceModifier();
				}
				break;
			case VARARG:
			case NOINLINE:
			case CROSSINLINE:
				{
				setState(2376);
				parameterModifier();
				}
				break;
			case REIFIED:
				{
				setState(2377);
				typeParameterModifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(2383);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,356,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2380);
					match(NL);
					}
					} 
				}
				setState(2385);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,356,_ctx);
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
		enterRule(_localctx, 254, RULE_classModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2386);
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
		enterRule(_localctx, 256, RULE_memberModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2388);
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
		enterRule(_localctx, 258, RULE_visibilityModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2390);
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
		enterRule(_localctx, 260, RULE_varianceAnnotation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2392);
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
		enterRule(_localctx, 262, RULE_functionModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2394);
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
		enterRule(_localctx, 264, RULE_propertyModifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2396);
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
		enterRule(_localctx, 266, RULE_inheritanceModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2398);
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
		enterRule(_localctx, 268, RULE_parameterModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2400);
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
		enterRule(_localctx, 270, RULE_typeParameterModifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2402);
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
		enterRule(_localctx, 272, RULE_labelDefinition);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2404);
			match(LabelDefinition);
			setState(2408);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,357,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2405);
					match(NL);
					}
					} 
				}
				setState(2410);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,357,_ctx);
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
		enterRule(_localctx, 274, RULE_annotations);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2413);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,358,_ctx) ) {
			case 1:
				{
				setState(2411);
				annotation();
				}
				break;
			case 2:
				{
				setState(2412);
				annotationList();
				}
				break;
			}
			setState(2418);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,359,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2415);
					match(NL);
					}
					} 
				}
				setState(2420);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,359,_ctx);
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
		enterRule(_localctx, 276, RULE_annotation);
		int _la;
		try {
			setState(2456);
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
				setState(2421);
				annotationUseSiteTarget();
				setState(2425);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(2422);
					match(NL);
					}
					}
					setState(2427);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2428);
				match(COLON);
				setState(2432);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(2429);
					match(NL);
					}
					}
					setState(2434);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2435);
				unescapedAnnotation();
				}
				break;
			case LabelReference:
				enterOuterAlt(_localctx, 2);
				{
				setState(2437);
				match(LabelReference);
				setState(2445);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,363,_ctx) ) {
				case 1:
					{
					setState(2441);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(2438);
						match(NL);
						}
						}
						setState(2443);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2444);
					typeArguments();
					}
					break;
				}
				setState(2454);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,365,_ctx) ) {
				case 1:
					{
					setState(2450);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(2447);
						match(NL);
						}
						}
						setState(2452);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2453);
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
		enterRule(_localctx, 278, RULE_annotationList);
		int _la;
		try {
			setState(2477);
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
				setState(2458);
				annotationUseSiteTarget();
				setState(2459);
				match(COLON);
				setState(2460);
				match(LSQUARE);
				setState(2462); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2461);
					unescapedAnnotation();
					}
					}
					setState(2464); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 58)) & ~0x3f) == 0 && ((1L << (_la - 58)) & ((1L << (IMPORT - 58)) | (1L << (CONSTRUCTOR - 58)) | (1L << (BY - 58)) | (1L << (COMPANION - 58)) | (1L << (INIT - 58)) | (1L << (WHERE - 58)) | (1L << (CATCH - 58)) | (1L << (FINALLY - 58)) | (1L << (OUT - 58)) | (1L << (GETTER - 58)) | (1L << (SETTER - 58)) | (1L << (DYNAMIC - 58)) | (1L << (PUBLIC - 58)) | (1L << (PRIVATE - 58)) | (1L << (PROTECTED - 58)) | (1L << (INTERNAL - 58)) | (1L << (ENUM - 58)) | (1L << (SEALED - 58)) | (1L << (ANNOTATION - 58)) | (1L << (DATA - 58)) | (1L << (INNER - 58)) | (1L << (TAILREC - 58)) | (1L << (OPERATOR - 58)) | (1L << (INLINE - 58)) | (1L << (INFIX - 58)) | (1L << (EXTERNAL - 58)) | (1L << (SUSPEND - 58)) | (1L << (OVERRIDE - 58)) | (1L << (ABSTRACT - 58)) | (1L << (FINAL - 58)))) != 0) || ((((_la - 122)) & ~0x3f) == 0 && ((1L << (_la - 122)) & ((1L << (OPEN - 122)) | (1L << (CONST - 122)) | (1L << (LATEINIT - 122)) | (1L << (VARARG - 122)) | (1L << (NOINLINE - 122)) | (1L << (CROSSINLINE - 122)) | (1L << (REIFIED - 122)) | (1L << (Identifier - 122)))) != 0) );
				setState(2466);
				match(RSQUARE);
				}
				break;
			case AT:
				enterOuterAlt(_localctx, 2);
				{
				setState(2468);
				match(AT);
				setState(2469);
				match(LSQUARE);
				setState(2471); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2470);
					unescapedAnnotation();
					}
					}
					setState(2473); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 58)) & ~0x3f) == 0 && ((1L << (_la - 58)) & ((1L << (IMPORT - 58)) | (1L << (CONSTRUCTOR - 58)) | (1L << (BY - 58)) | (1L << (COMPANION - 58)) | (1L << (INIT - 58)) | (1L << (WHERE - 58)) | (1L << (CATCH - 58)) | (1L << (FINALLY - 58)) | (1L << (OUT - 58)) | (1L << (GETTER - 58)) | (1L << (SETTER - 58)) | (1L << (DYNAMIC - 58)) | (1L << (PUBLIC - 58)) | (1L << (PRIVATE - 58)) | (1L << (PROTECTED - 58)) | (1L << (INTERNAL - 58)) | (1L << (ENUM - 58)) | (1L << (SEALED - 58)) | (1L << (ANNOTATION - 58)) | (1L << (DATA - 58)) | (1L << (INNER - 58)) | (1L << (TAILREC - 58)) | (1L << (OPERATOR - 58)) | (1L << (INLINE - 58)) | (1L << (INFIX - 58)) | (1L << (EXTERNAL - 58)) | (1L << (SUSPEND - 58)) | (1L << (OVERRIDE - 58)) | (1L << (ABSTRACT - 58)) | (1L << (FINAL - 58)))) != 0) || ((((_la - 122)) & ~0x3f) == 0 && ((1L << (_la - 122)) & ((1L << (OPEN - 122)) | (1L << (CONST - 122)) | (1L << (LATEINIT - 122)) | (1L << (VARARG - 122)) | (1L << (NOINLINE - 122)) | (1L << (CROSSINLINE - 122)) | (1L << (REIFIED - 122)) | (1L << (Identifier - 122)))) != 0) );
				setState(2475);
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
		enterRule(_localctx, 280, RULE_annotationUseSiteTarget);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2479);
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
		enterRule(_localctx, 282, RULE_unescapedAnnotation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2481);
			identifier();
			setState(2483);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LANGLE) {
				{
				setState(2482);
				typeArguments();
				}
			}

			setState(2486);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,371,_ctx) ) {
			case 1:
				{
				setState(2485);
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
		enterRule(_localctx, 284, RULE_identifier);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2488);
			simpleIdentifier();
			setState(2499);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,373,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
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
					match(DOT);
					setState(2496);
					simpleIdentifier();
					}
					} 
				}
				setState(2501);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,373,_ctx);
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
		enterRule(_localctx, 286, RULE_simpleIdentifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2502);
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
		enterRule(_localctx, 288, RULE_semi);
		try {
			int _alt;
			setState(2516);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,376,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2505); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(2504);
						match(NL);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(2507); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,374,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2509);
				match(SEMICOLON);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2510);
				match(SEMICOLON);
				setState(2512); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(2511);
						match(NL);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(2514); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,375,_ctx);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u00ac\u09d9\4\2\t"+
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
		"\3\2\7\2\u0126\n\2\f\2\16\2\u0129\13\2\3\2\3\2\3\2\7\2\u012e\n\2\f\2\16"+
		"\2\u0131\13\2\3\2\3\2\3\3\3\3\3\3\5\3\u0138\n\3\5\3\u013a\n\3\3\4\7\4"+
		"\u013d\n\4\f\4\16\4\u0140\13\4\3\5\3\5\3\5\3\5\3\5\5\5\u0147\n\5\3\5\5"+
		"\5\u014a\n\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\5\7\u0153\n\7\3\7\5\7\u0156\n"+
		"\7\3\b\5\b\u0159\n\b\3\b\3\b\7\b\u015d\n\b\f\b\16\b\u0160\13\b\3\b\3\b"+
		"\7\b\u0164\n\b\f\b\16\b\u0167\13\b\3\b\5\b\u016a\n\b\3\b\7\b\u016d\n\b"+
		"\f\b\16\b\u0170\13\b\3\b\5\b\u0173\n\b\3\b\7\b\u0176\n\b\f\b\16\b\u0179"+
		"\13\b\3\b\3\b\7\b\u017d\n\b\f\b\16\b\u0180\13\b\3\b\5\b\u0183\n\b\3\b"+
		"\7\b\u0186\n\b\f\b\16\b\u0189\13\b\3\b\5\b\u018c\n\b\3\b\7\b\u018f\n\b"+
		"\f\b\16\b\u0192\13\b\3\b\3\b\7\b\u0196\n\b\f\b\16\b\u0199\13\b\3\b\5\b"+
		"\u019c\n\b\3\t\5\t\u019f\n\t\3\t\3\t\7\t\u01a3\n\t\f\t\16\t\u01a6\13\t"+
		"\5\t\u01a8\n\t\3\t\3\t\3\n\3\n\3\n\3\n\7\n\u01b0\n\n\f\n\16\n\u01b3\13"+
		"\n\5\n\u01b5\n\n\3\n\3\n\3\13\5\13\u01ba\n\13\3\13\5\13\u01bd\n\13\3\13"+
		"\3\13\3\13\3\13\3\13\5\13\u01c4\n\13\3\f\7\f\u01c7\n\f\f\f\16\f\u01ca"+
		"\13\f\3\f\3\f\7\f\u01ce\n\f\f\f\16\f\u01d1\13\f\3\f\3\f\7\f\u01d5\n\f"+
		"\f\f\16\f\u01d8\13\f\3\f\7\f\u01db\n\f\f\f\16\f\u01de\13\f\3\r\3\r\3\r"+
		"\5\r\u01e3\n\r\3\16\3\16\3\16\3\17\3\17\7\17\u01ea\n\17\f\17\16\17\u01ed"+
		"\13\17\3\17\3\17\7\17\u01f1\n\17\f\17\16\17\u01f4\13\17\3\17\3\17\3\20"+
		"\3\20\7\20\u01fa\n\20\f\20\16\20\u01fd\13\20\3\20\7\20\u0200\n\20\f\20"+
		"\16\20\u0203\13\20\3\20\7\20\u0206\n\20\f\20\16\20\u0209\13\20\3\20\3"+
		"\20\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u0213\n\21\3\21\5\21\u0216\n\21"+
		"\3\22\3\22\7\22\u021a\n\22\f\22\16\22\u021d\13\22\3\22\3\22\3\23\5\23"+
		"\u0222\n\23\3\23\3\23\7\23\u0226\n\23\f\23\16\23\u0229\13\23\3\23\3\23"+
		"\7\23\u022d\n\23\f\23\16\23\u0230\13\23\3\23\3\23\7\23\u0234\n\23\f\23"+
		"\16\23\u0237\13\23\3\23\5\23\u023a\n\23\3\23\7\23\u023d\n\23\f\23\16\23"+
		"\u0240\13\23\3\23\3\23\3\24\3\24\7\24\u0246\n\24\f\24\16\24\u0249\13\24"+
		"\3\24\3\24\3\24\7\24\u024e\n\24\f\24\16\24\u0251\13\24\3\24\5\24\u0254"+
		"\n\24\3\25\3\25\7\25\u0258\n\25\f\25\16\25\u025b\13\25\3\25\5\25\u025e"+
		"\n\25\3\25\7\25\u0261\n\25\f\25\16\25\u0264\13\25\3\25\3\25\7\25\u0268"+
		"\n\25\f\25\16\25\u026b\13\25\3\25\7\25\u026e\n\25\f\25\16\25\u0271\13"+
		"\25\5\25\u0273\n\25\3\25\7\25\u0276\n\25\f\25\16\25\u0279\13\25\3\25\3"+
		"\25\3\26\3\26\7\26\u027f\n\26\f\26\16\26\u0282\13\26\6\26\u0284\n\26\r"+
		"\26\16\26\u0285\3\26\5\26\u0289\n\26\3\27\3\27\7\27\u028d\n\27\f\27\16"+
		"\27\u0290\13\27\3\27\5\27\u0293\n\27\3\27\7\27\u0296\n\27\f\27\16\27\u0299"+
		"\13\27\3\27\5\27\u029c\n\27\3\27\7\27\u029f\n\27\f\27\16\27\u02a2\13\27"+
		"\3\27\5\27\u02a5\n\27\3\30\5\30\u02a8\n\30\3\30\3\30\7\30\u02ac\n\30\f"+
		"\30\16\30\u02af\13\30\3\30\3\30\7\30\u02b3\n\30\f\30\16\30\u02b6\13\30"+
		"\3\30\3\30\5\30\u02ba\n\30\3\30\7\30\u02bd\n\30\f\30\16\30\u02c0\13\30"+
		"\3\30\5\30\u02c3\n\30\3\30\7\30\u02c6\n\30\f\30\16\30\u02c9\13\30\3\30"+
		"\5\30\u02cc\n\30\3\30\7\30\u02cf\n\30\f\30\16\30\u02d2\13\30\3\30\3\30"+
		"\7\30\u02d6\n\30\f\30\16\30\u02d9\13\30\3\30\3\30\7\30\u02dd\n\30\f\30"+
		"\16\30\u02e0\13\30\3\30\5\30\u02e3\n\30\3\30\7\30\u02e6\n\30\f\30\16\30"+
		"\u02e9\13\30\3\30\5\30\u02ec\n\30\3\30\7\30\u02ef\n\30\f\30\16\30\u02f2"+
		"\13\30\3\30\5\30\u02f5\n\30\3\31\3\31\3\31\3\31\7\31\u02fb\n\31\f\31\16"+
		"\31\u02fe\13\31\5\31\u0300\n\31\3\31\3\31\3\32\5\32\u0305\n\32\3\32\3"+
		"\32\3\32\5\32\u030a\n\32\3\33\3\33\3\33\3\33\3\34\3\34\3\34\7\34\u0313"+
		"\n\34\f\34\16\34\u0316\13\34\3\34\5\34\u0319\n\34\3\35\5\35\u031c\n\35"+
		"\3\35\3\35\7\35\u0320\n\35\f\35\16\35\u0323\13\35\3\35\5\35\u0326\n\35"+
		"\3\35\7\35\u0329\n\35\f\35\16\35\u032c\13\35\3\35\3\35\7\35\u0330\n\35"+
		"\f\35\16\35\u0333\13\35\3\35\3\35\5\35\u0337\n\35\3\35\7\35\u033a\n\35"+
		"\f\35\16\35\u033d\13\35\3\35\3\35\5\35\u0341\n\35\3\35\7\35\u0344\n\35"+
		"\f\35\16\35\u0347\13\35\3\35\5\35\u034a\n\35\3\35\7\35\u034d\n\35\f\35"+
		"\16\35\u0350\13\35\3\35\3\35\7\35\u0354\n\35\f\35\16\35\u0357\13\35\3"+
		"\35\5\35\u035a\n\35\3\35\5\35\u035d\n\35\3\35\5\35\u0360\n\35\3\35\7\35"+
		"\u0363\n\35\f\35\16\35\u0366\13\35\3\35\5\35\u0369\n\35\3\35\5\35\u036c"+
		"\n\35\3\35\7\35\u036f\n\35\f\35\16\35\u0372\13\35\3\35\5\35\u0375\n\35"+
		"\5\35\u0377\n\35\3\36\3\36\3\36\3\36\7\36\u037d\n\36\f\36\16\36\u0380"+
		"\13\36\3\36\3\36\3\37\3\37\3\37\5\37\u0387\n\37\3 \5 \u038a\n \3 \3 \5"+
		" \u038e\n \3 \3 \7 \u0392\n \f \16 \u0395\13 \3 \3 \3 \7 \u039a\n \f "+
		"\16 \u039d\13 \3 \3 \7 \u03a1\n \f \16 \u03a4\13 \3 \5 \u03a7\n \3 \7"+
		" \u03aa\n \f \16 \u03ad\13 \3 \3 \3 \7 \u03b2\n \f \16 \u03b5\13 \3 \5"+
		" \u03b8\n \5 \u03ba\n \3!\5!\u03bd\n!\3!\3!\5!\u03c1\n!\3!\3!\7!\u03c5"+
		"\n!\f!\16!\u03c8\13!\3!\3!\3!\7!\u03cd\n!\f!\16!\u03d0\13!\3!\3!\5!\u03d4"+
		"\n!\3!\3!\7!\u03d8\n!\f!\16!\u03db\13!\3!\3!\5!\u03df\n!\3\"\5\"\u03e2"+
		"\n\"\3\"\3\"\7\"\u03e6\n\"\f\"\16\"\u03e9\13\"\3\"\3\"\7\"\u03ed\n\"\f"+
		"\"\16\"\u03f0\13\"\3\"\5\"\u03f3\n\"\3\"\7\"\u03f6\n\"\f\"\16\"\u03f9"+
		"\13\"\3\"\3\"\7\"\u03fd\n\"\f\"\16\"\u0400\13\"\3\"\3\"\3#\3#\7#\u0406"+
		"\n#\f#\16#\u0409\13#\3#\3#\7#\u040d\n#\f#\16#\u0410\13#\3#\3#\7#\u0414"+
		"\n#\f#\16#\u0417\13#\3#\7#\u041a\n#\f#\16#\u041d\13#\3#\7#\u0420\n#\f"+
		"#\16#\u0423\13#\3#\3#\3$\5$\u0428\n$\3$\7$\u042b\n$\f$\16$\u042e\13$\3"+
		"$\3$\7$\u0432\n$\f$\16$\u0435\13$\3$\3$\7$\u0439\n$\f$\16$\u043c\13$\3"+
		"$\5$\u043f\n$\3%\5%\u0442\n%\3%\3%\3%\3%\5%\u0448\n%\3&\3&\3&\7&\u044d"+
		"\n&\f&\16&\u0450\13&\6&\u0452\n&\r&\16&\u0453\3\'\3\'\3\'\3\'\3(\3(\5"+
		"(\u045c\n(\3(\7(\u045f\n(\f(\16(\u0462\13(\3(\6(\u0465\n(\r(\16(\u0466"+
		"\3)\3)\3)\3)\3)\3)\5)\u046f\n)\3*\3*\7*\u0473\n*\f*\16*\u0476\13*\3*\3"+
		"*\7*\u047a\n*\f*\16*\u047d\13*\5*\u047f\n*\3*\3*\7*\u0483\n*\f*\16*\u0486"+
		"\13*\3*\3*\7*\u048a\n*\f*\16*\u048d\13*\3*\5*\u0490\n*\3+\3+\3+\5+\u0495"+
		"\n+\3,\3,\7,\u0499\n,\f,\16,\u049c\13,\3,\3,\7,\u04a0\n,\f,\16,\u04a3"+
		"\13,\3,\7,\u04a6\n,\f,\16,\u04a9\13,\3-\3-\7-\u04ad\n-\f-\16-\u04b0\13"+
		"-\3-\5-\u04b3\n-\3.\3.\3.\5.\u04b8\n.\3.\3.\3.\5.\u04bd\n.\7.\u04bf\n"+
		".\f.\16.\u04c2\13.\3.\3.\3/\3/\7/\u04c8\n/\f/\16/\u04cb\13/\3/\3/\7/\u04cf"+
		"\n/\f/\16/\u04d2\13/\3/\3/\7/\u04d6\n/\f/\16/\u04d9\13/\3/\7/\u04dc\n"+
		"/\f/\16/\u04df\13/\3\60\7\60\u04e2\n\60\f\60\16\60\u04e5\13\60\3\60\3"+
		"\60\7\60\u04e9\n\60\f\60\16\60\u04ec\13\60\3\60\3\60\7\60\u04f0\n\60\f"+
		"\60\16\60\u04f3\13\60\3\60\3\60\3\61\3\61\7\61\u04f9\n\61\f\61\16\61\u04fc"+
		"\13\61\3\61\3\61\3\61\7\61\u0501\n\61\f\61\16\61\u0504\13\61\3\61\3\61"+
		"\5\61\u0508\n\61\5\61\u050a\n\61\3\61\7\61\u050d\n\61\f\61\16\61\u0510"+
		"\13\61\3\61\3\61\3\62\3\62\3\62\7\62\u0517\n\62\f\62\16\62\u051a\13\62"+
		"\3\62\3\62\5\62\u051e\n\62\5\62\u0520\n\62\3\63\3\63\3\63\5\63\u0525\n"+
		"\63\3\64\7\64\u0528\n\64\f\64\16\64\u052b\13\64\3\64\3\64\3\64\3\64\5"+
		"\64\u0531\n\64\3\65\3\65\3\65\7\65\u0536\n\65\f\65\16\65\u0539\13\65\3"+
		"\65\3\65\3\66\3\66\3\67\3\67\7\67\u0541\n\67\f\67\16\67\u0544\13\67\3"+
		"\67\3\67\7\67\u0548\n\67\f\67\16\67\u054b\13\67\3\67\7\67\u054e\n\67\f"+
		"\67\16\67\u0551\13\67\38\38\78\u0555\n8\f8\168\u0558\138\38\38\78\u055c"+
		"\n8\f8\168\u055f\138\38\78\u0562\n8\f8\168\u0565\138\39\39\39\79\u056a"+
		"\n9\f9\169\u056d\139\39\39\79\u0571\n9\f9\169\u0574\139\3:\3:\3:\7:\u0579"+
		"\n:\f:\16:\u057c\13:\3:\3:\5:\u0580\n:\3;\3;\3;\7;\u0585\n;\f;\16;\u0588"+
		"\13;\3;\3;\7;\u058c\n;\f;\16;\u058f\13;\3;\3;\3;\7;\u0594\n;\f;\16;\u0597"+
		"\13;\3;\3;\5;\u059b\n;\5;\u059d\n;\3<\3<\7<\u05a1\n<\f<\16<\u05a4\13<"+
		"\3<\3<\7<\u05a8\n<\f<\16<\u05ab\13<\3<\7<\u05ae\n<\f<\16<\u05b1\13<\3"+
		"=\3=\3=\7=\u05b6\n=\f=\16=\u05b9\13=\3=\3=\7=\u05bd\n=\f=\16=\u05c0\13"+
		"=\3>\3>\3>\7>\u05c5\n>\f>\16>\u05c8\13>\3>\7>\u05cb\n>\f>\16>\u05ce\13"+
		">\3?\3?\3?\7?\u05d3\n?\f?\16?\u05d6\13?\3?\3?\7?\u05da\n?\f?\16?\u05dd"+
		"\13?\3@\3@\3@\7@\u05e2\n@\f@\16@\u05e5\13@\3@\3@\7@\u05e9\n@\f@\16@\u05ec"+
		"\13@\3A\3A\5A\u05f0\nA\3B\7B\u05f3\nB\fB\16B\u05f6\13B\3B\3B\7B\u05fa"+
		"\nB\fB\16B\u05fd\13B\3B\3B\5B\u0601\nB\3C\7C\u0604\nC\fC\16C\u0607\13"+
		"C\3C\3C\7C\u060b\nC\fC\16C\u060e\13C\3C\5C\u0611\nC\3D\3D\3D\3D\3D\3D"+
		"\7D\u0619\nD\fD\16D\u061c\13D\3D\3D\3D\3D\6D\u0622\nD\rD\16D\u0623\3D"+
		"\5D\u0627\nD\3E\3E\5E\u062b\nE\3E\5E\u062e\nE\3E\7E\u0631\nE\fE\16E\u0634"+
		"\13E\3F\3F\3F\3G\3G\7G\u063b\nG\fG\16G\u063e\13G\3G\3G\3G\6G\u0643\nG"+
		"\rG\16G\u0644\3H\3H\5H\u0649\nH\3I\3I\6I\u064d\nI\rI\16I\u064e\3J\5J\u0652"+
		"\nJ\3J\3J\7J\u0656\nJ\fJ\16J\u0659\13J\3J\3J\7J\u065d\nJ\fJ\16J\u0660"+
		"\13J\5J\u0662\nJ\3K\7K\u0665\nK\fK\16K\u0668\13K\3K\5K\u066b\nK\3K\7K"+
		"\u066e\nK\fK\16K\u0671\13K\3K\3K\3L\3L\3L\3L\7L\u0679\nL\fL\16L\u067c"+
		"\13L\5L\u067e\nL\3L\3L\3M\3M\5M\u0684\nM\3M\3M\3M\3M\3M\7M\u068b\nM\f"+
		"M\16M\u068e\13M\3M\3M\5M\u0692\nM\3N\3N\7N\u0696\nN\fN\16N\u0699\13N\3"+
		"N\3N\7N\u069d\nN\fN\16N\u06a0\13N\3N\3N\7N\u06a4\nN\fN\16N\u06a7\13N\3"+
		"N\7N\u06aa\nN\fN\16N\u06ad\13N\3N\3N\3O\5O\u06b2\nO\3O\3O\5O\u06b6\nO"+
		"\3P\6P\u06b9\nP\rP\16P\u06ba\3Q\3Q\7Q\u06bf\nQ\fQ\16Q\u06c2\13Q\3Q\3Q"+
		"\7Q\u06c6\nQ\fQ\16Q\u06c9\13Q\5Q\u06cb\nQ\3Q\5Q\u06ce\nQ\3Q\7Q\u06d1\n"+
		"Q\fQ\16Q\u06d4\13Q\3Q\3Q\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\5R\u06e5"+
		"\nR\3S\3S\3S\3S\3T\3T\3U\3U\5U\u06ef\nU\3V\3V\3V\7V\u06f4\nV\fV\16V\u06f7"+
		"\13V\3V\3V\3W\3W\3W\3W\3W\7W\u0700\nW\fW\16W\u0703\13W\3W\3W\3X\3X\3Y"+
		"\3Y\3Y\3Y\3Z\3Z\3[\3[\3[\3[\3\\\7\\\u0714\n\\\f\\\16\\\u0717\13\\\3\\"+
		"\3\\\7\\\u071b\n\\\f\\\16\\\u071e\13\\\3\\\3\\\7\\\u0722\n\\\f\\\16\\"+
		"\u0725\13\\\3\\\3\\\3\\\3\\\7\\\u072b\n\\\f\\\16\\\u072e\13\\\3\\\3\\"+
		"\7\\\u0732\n\\\f\\\16\\\u0735\13\\\3\\\3\\\7\\\u0739\n\\\f\\\16\\\u073c"+
		"\13\\\3\\\3\\\7\\\u0740\n\\\f\\\16\\\u0743\13\\\3\\\3\\\5\\\u0747\n\\"+
		"\3]\5]\u074a\n]\3]\7]\u074d\n]\f]\16]\u0750\13]\3]\3]\7]\u0754\n]\f]\16"+
		"]\u0757\13]\3]\7]\u075a\n]\f]\16]\u075d\13]\3^\3^\3^\7^\u0762\n^\f^\16"+
		"^\u0765\13^\3^\3^\7^\u0769\n^\f^\16^\u076c\13^\3^\5^\u076f\n^\5^\u0771"+
		"\n^\3_\3_\7_\u0775\n_\f_\16_\u0778\13_\3_\3_\7_\u077c\n_\f_\16_\u077f"+
		"\13_\3_\5_\u0782\n_\3_\7_\u0785\n_\f_\16_\u0788\13_\3_\3_\3`\3`\5`\u078e"+
		"\n`\3`\3`\7`\u0792\n`\f`\16`\u0795\13`\3`\3`\3a\3a\5a\u079b\na\3b\3b\3"+
		"b\7b\u07a0\nb\fb\16b\u07a3\13b\3b\3b\7b\u07a7\nb\fb\16b\u07aa\13b\3b\3"+
		"b\5b\u07ae\nb\3b\5b\u07b1\nb\3c\3c\5c\u07b5\nc\3d\3d\7d\u07b9\nd\fd\16"+
		"d\u07bc\13d\3d\3d\3d\3d\7d\u07c2\nd\fd\16d\u07c5\13d\3d\5d\u07c8\nd\3"+
		"d\5d\u07cb\nd\3d\7d\u07ce\nd\fd\16d\u07d1\13d\3d\3d\7d\u07d5\nd\fd\16"+
		"d\u07d8\13d\3d\5d\u07db\nd\5d\u07dd\nd\3e\3e\5e\u07e1\ne\3f\3f\7f\u07e5"+
		"\nf\ff\16f\u07e8\13f\3f\3f\3f\3f\5f\u07ee\nf\3f\7f\u07f1\nf\ff\16f\u07f4"+
		"\13f\3f\3f\7f\u07f8\nf\ff\16f\u07fb\13f\3f\3f\7f\u07ff\nf\ff\16f\u0802"+
		"\13f\7f\u0804\nf\ff\16f\u0807\13f\3f\7f\u080a\nf\ff\16f\u080d\13f\3f\3"+
		"f\3g\3g\7g\u0813\ng\fg\16g\u0816\13g\3g\3g\7g\u081a\ng\fg\16g\u081d\13"+
		"g\3g\7g\u0820\ng\fg\16g\u0823\13g\3g\7g\u0826\ng\fg\16g\u0829\13g\3g\3"+
		"g\7g\u082d\ng\fg\16g\u0830\13g\3g\3g\5g\u0834\ng\3g\3g\7g\u0838\ng\fg"+
		"\16g\u083b\13g\3g\3g\7g\u083f\ng\fg\16g\u0842\13g\3g\5g\u0845\ng\3h\3"+
		"h\3h\5h\u084a\nh\3i\3i\7i\u084e\ni\fi\16i\u0851\13i\3i\3i\3j\3j\7j\u0857"+
		"\nj\fj\16j\u085a\13j\3j\3j\3k\3k\7k\u0860\nk\fk\16k\u0863\13k\3k\3k\7"+
		"k\u0867\nk\fk\16k\u086a\13k\3k\7k\u086d\nk\fk\16k\u0870\13k\3k\7k\u0873"+
		"\nk\fk\16k\u0876\13k\3k\5k\u0879\nk\3l\3l\7l\u087d\nl\fl\16l\u0880\13"+
		"l\3l\3l\7l\u0884\nl\fl\16l\u0887\13l\3l\3l\3l\3l\3l\7l\u088e\nl\fl\16"+
		"l\u0891\13l\3l\3l\3m\3m\7m\u0897\nm\fm\16m\u089a\13m\3m\3m\3n\3n\3n\5"+
		"n\u08a1\nn\3o\3o\7o\u08a5\no\fo\16o\u08a8\13o\3o\3o\7o\u08ac\no\fo\16"+
		"o\u08af\13o\3o\3o\5o\u08b3\no\3o\3o\3o\3o\7o\u08b9\no\fo\16o\u08bc\13"+
		"o\3o\5o\u08bf\no\3p\3p\7p\u08c3\np\fp\16p\u08c6\13p\3p\3p\3p\3p\7p\u08cc"+
		"\np\fp\16p\u08cf\13p\3p\5p\u08d2\np\3q\3q\7q\u08d6\nq\fq\16q\u08d9\13"+
		"q\3q\5q\u08dc\nq\3q\7q\u08df\nq\fq\16q\u08e2\13q\3q\3q\7q\u08e6\nq\fq"+
		"\16q\u08e9\13q\3q\3q\3q\3q\3r\3r\7r\u08f1\nr\fr\16r\u08f4\13r\3r\3r\3"+
		"r\5r\u08f9\nr\3r\3r\3r\3r\5r\u08ff\nr\3s\3s\3s\7s\u0904\ns\fs\16s\u0907"+
		"\13s\7s\u0909\ns\fs\16s\u090c\13s\5s\u090e\ns\3s\7s\u0911\ns\fs\16s\u0914"+
		"\13s\3s\3s\7s\u0918\ns\fs\16s\u091b\13s\3s\3s\5s\u091f\ns\3t\3t\3u\3u"+
		"\3v\3v\3w\3w\3x\3x\3y\3y\3z\3z\3{\3{\3|\3|\3}\3}\3}\3}\5}\u0937\n}\3~"+
		"\3~\3~\5~\u093c\n~\3\177\3\177\6\177\u0940\n\177\r\177\16\177\u0941\3"+
		"\u0080\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080"+
		"\5\u0080\u094d\n\u0080\3\u0080\7\u0080\u0950\n\u0080\f\u0080\16\u0080"+
		"\u0953\13\u0080\3\u0081\3\u0081\3\u0082\3\u0082\3\u0083\3\u0083\3\u0084"+
		"\3\u0084\3\u0085\3\u0085\3\u0086\3\u0086\3\u0087\3\u0087\3\u0088\3\u0088"+
		"\3\u0089\3\u0089\3\u008a\3\u008a\7\u008a\u0969\n\u008a\f\u008a\16\u008a"+
		"\u096c\13\u008a\3\u008b\3\u008b\5\u008b\u0970\n\u008b\3\u008b\7\u008b"+
		"\u0973\n\u008b\f\u008b\16\u008b\u0976\13\u008b\3\u008c\3\u008c\7\u008c"+
		"\u097a\n\u008c\f\u008c\16\u008c\u097d\13\u008c\3\u008c\3\u008c\7\u008c"+
		"\u0981\n\u008c\f\u008c\16\u008c\u0984\13\u008c\3\u008c\3\u008c\3\u008c"+
		"\3\u008c\7\u008c\u098a\n\u008c\f\u008c\16\u008c\u098d\13\u008c\3\u008c"+
		"\5\u008c\u0990\n\u008c\3\u008c\7\u008c\u0993\n\u008c\f\u008c\16\u008c"+
		"\u0996\13\u008c\3\u008c\5\u008c\u0999\n\u008c\5\u008c\u099b\n\u008c\3"+
		"\u008d\3\u008d\3\u008d\3\u008d\6\u008d\u09a1\n\u008d\r\u008d\16\u008d"+
		"\u09a2\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\6\u008d\u09aa\n\u008d\r"+
		"\u008d\16\u008d\u09ab\3\u008d\3\u008d\5\u008d\u09b0\n\u008d\3\u008e\3"+
		"\u008e\3\u008f\3\u008f\5\u008f\u09b6\n\u008f\3\u008f\5\u008f\u09b9\n\u008f"+
		"\3\u0090\3\u0090\7\u0090\u09bd\n\u0090\f\u0090\16\u0090\u09c0\13\u0090"+
		"\3\u0090\3\u0090\7\u0090\u09c4\n\u0090\f\u0090\16\u0090\u09c7\13\u0090"+
		"\3\u0091\3\u0091\3\u0092\6\u0092\u09cc\n\u0092\r\u0092\16\u0092\u09cd"+
		"\3\u0092\3\u0092\3\u0092\6\u0092\u09d3\n\u0092\r\u0092\16\u0092\u09d4"+
		"\5\u0092\u09d7\n\u0092\3\u0092\2\2\u0093\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080"+
		"\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098"+
		"\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0"+
		"\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8"+
		"\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\u00dc\u00de\u00e0"+
		"\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0\u00f2\u00f4\u00f6\u00f8"+
		"\u00fa\u00fc\u00fe\u0100\u0102\u0104\u0106\u0108\u010a\u010c\u010e\u0110"+
		"\u0112\u0114\u0116\u0118\u011a\u011c\u011e\u0120\u0122\2\34\3\2=>\3\2"+
		"AB\4\2\35\35EE\5\2\u0085\u0085\u0088\u008d\u0092\u0092\3\2\u009e\u00a0"+
		"\3\2\u00a4\u00a6\4\2\67\67VV\3\2&\'\3\2\35\"\4\2\61\62\64\65\3\2-\60\4"+
		"\2[[]]\4\2ZZ\\\\\3\2\24\25\3\2\21\23\5\2\33\33\63\63YY\4\2\24\27\32\32"+
		"\3\2nr\4\2yy~~\3\2jm\4\2[[^^\3\2sx\3\2z|\3\2\177\u0081\5\2::_beh\n\2<"+
		"<DGKKPQ^^cdi\u0082\u008e\u008e\2\u0af2\2\u0127\3\2\2\2\4\u0139\3\2\2\2"+
		"\6\u013e\3\2\2\2\b\u0141\3\2\2\2\n\u014b\3\2\2\2\f\u0152\3\2\2\2\16\u0158"+
		"\3\2\2\2\20\u019e\3\2\2\2\22\u01ab\3\2\2\2\24\u01b9\3\2\2\2\26\u01c8\3"+
		"\2\2\2\30\u01e2\3\2\2\2\32\u01e4\3\2\2\2\34\u01e7\3\2\2\2\36\u01f7\3\2"+
		"\2\2 \u0212\3\2\2\2\"\u0217\3\2\2\2$\u0221\3\2\2\2&\u0253\3\2\2\2(\u0255"+
		"\3\2\2\2*\u0283\3\2\2\2,\u028a\3\2\2\2.\u02a7\3\2\2\2\60\u02f6\3\2\2\2"+
		"\62\u0304\3\2\2\2\64\u030b\3\2\2\2\66\u0318\3\2\2\28\u031b\3\2\2\2:\u0378"+
		"\3\2\2\2<\u0383\3\2\2\2>\u03b9\3\2\2\2@\u03de\3\2\2\2B\u03e1\3\2\2\2D"+
		"\u0403\3\2\2\2F\u0427\3\2\2\2H\u0441\3\2\2\2J\u0451\3\2\2\2L\u0455\3\2"+
		"\2\2N\u045b\3\2\2\2P\u046e\3\2\2\2R\u047e\3\2\2\2T\u0494\3\2\2\2V\u0496"+
		"\3\2\2\2X\u04aa\3\2\2\2Z\u04b4\3\2\2\2\\\u04c5\3\2\2\2^\u04e3\3\2\2\2"+
		"`\u04f6\3\2\2\2b\u051f\3\2\2\2d\u0524\3\2\2\2f\u0529\3\2\2\2h\u0532\3"+
		"\2\2\2j\u053c\3\2\2\2l\u053e\3\2\2\2n\u0552\3\2\2\2p\u0566\3\2\2\2r\u0575"+
		"\3\2\2\2t\u059c\3\2\2\2v\u059e\3\2\2\2x\u05b2\3\2\2\2z\u05c1\3\2\2\2|"+
		"\u05cf\3\2\2\2~\u05de\3\2\2\2\u0080\u05ed\3\2\2\2\u0082\u05f4\3\2\2\2"+
		"\u0084\u0610\3\2\2\2\u0086\u0626\3\2\2\2\u0088\u0628\3\2\2\2\u008a\u0635"+
		"\3\2\2\2\u008c\u0638\3\2\2\2\u008e\u0648\3\2\2\2\u0090\u064a\3\2\2\2\u0092"+
		"\u0661\3\2\2\2\u0094\u0666\3\2\2\2\u0096\u0674\3\2\2\2\u0098\u0691\3\2"+
		"\2\2\u009a\u0693\3\2\2\2\u009c\u06b5\3\2\2\2\u009e\u06b8\3\2\2\2\u00a0"+
		"\u06ca\3\2\2\2\u00a2\u06e4\3\2\2\2\u00a4\u06e6\3\2\2\2\u00a6\u06ea\3\2"+
		"\2\2\u00a8\u06ee\3\2\2\2\u00aa\u06f0\3\2\2\2\u00ac\u06fa\3\2\2\2\u00ae"+
		"\u0706\3\2\2\2\u00b0\u0708\3\2\2\2\u00b2\u070c\3\2\2\2\u00b4\u070e\3\2"+
		"\2\2\u00b6\u0715\3\2\2\2\u00b8\u0749\3\2\2\2\u00ba\u0770\3\2\2\2\u00bc"+
		"\u0772\3\2\2\2\u00be\u078b\3\2\2\2\u00c0\u0798\3\2\2\2\u00c2\u079c\3\2"+
		"\2\2\u00c4\u07b4\3\2\2\2\u00c6\u07b6\3\2\2\2\u00c8\u07e0\3\2\2\2\u00ca"+
		"\u07e2\3\2\2\2\u00cc\u0844\3\2\2\2\u00ce\u0849\3\2\2\2\u00d0\u084b\3\2"+
		"\2\2\u00d2\u0854\3\2\2\2\u00d4\u085d\3\2\2\2\u00d6\u087a\3\2\2\2\u00d8"+
		"\u0894\3\2\2\2\u00da\u08a0\3\2\2\2\u00dc\u08a2\3\2\2\2\u00de\u08c0\3\2"+
		"\2\2\u00e0\u08d3\3\2\2\2\u00e2\u08fe\3\2\2\2\u00e4\u090d\3\2\2\2\u00e6"+
		"\u0920\3\2\2\2\u00e8\u0922\3\2\2\2\u00ea\u0924\3\2\2\2\u00ec\u0926\3\2"+
		"\2\2\u00ee\u0928\3\2\2\2\u00f0\u092a\3\2\2\2\u00f2\u092c\3\2\2\2\u00f4"+
		"\u092e\3\2\2\2\u00f6\u0930\3\2\2\2\u00f8\u0936\3\2\2\2\u00fa\u093b\3\2"+
		"\2\2\u00fc\u093f\3\2\2\2\u00fe\u094c\3\2\2\2\u0100\u0954\3\2\2\2\u0102"+
		"\u0956\3\2\2\2\u0104\u0958\3\2\2\2\u0106\u095a\3\2\2\2\u0108\u095c\3\2"+
		"\2\2\u010a\u095e\3\2\2\2\u010c\u0960\3\2\2\2\u010e\u0962\3\2\2\2\u0110"+
		"\u0964\3\2\2\2\u0112\u0966\3\2\2\2\u0114\u096f\3\2\2\2\u0116\u099a\3\2"+
		"\2\2\u0118\u09af\3\2\2\2\u011a\u09b1\3\2\2\2\u011c\u09b3\3\2\2\2\u011e"+
		"\u09ba\3\2\2\2\u0120\u09c8\3\2\2\2\u0122\u09d6\3\2\2\2\u0124\u0126\7\7"+
		"\2\2\u0125\u0124\3\2\2\2\u0126\u0129\3\2\2\2\u0127\u0125\3\2\2\2\u0127"+
		"\u0128\3\2\2\2\u0128\u012a\3\2\2\2\u0129\u0127\3\2\2\2\u012a\u012b\5\4"+
		"\3\2\u012b\u012f\5\6\4\2\u012c\u012e\5\f\7\2\u012d\u012c\3\2\2\2\u012e"+
		"\u0131\3\2\2\2\u012f\u012d\3\2\2\2\u012f\u0130\3\2\2\2\u0130\u0132\3\2"+
		"\2\2\u0131\u012f\3\2\2\2\u0132\u0133\7\2\2\3\u0133\3\3\2\2\2\u0134\u0135"+
		"\7;\2\2\u0135\u0137\5\u011e\u0090\2\u0136\u0138\5\u0122\u0092\2\u0137"+
		"\u0136\3\2\2\2\u0137\u0138\3\2\2\2\u0138\u013a\3\2\2\2\u0139\u0134\3\2"+
		"\2\2\u0139\u013a\3\2\2\2\u013a\5\3\2\2\2\u013b\u013d\5\b\5\2\u013c\u013b"+
		"\3\2\2\2\u013d\u0140\3\2\2\2\u013e\u013c\3\2\2\2\u013e\u013f\3\2\2\2\u013f"+
		"\7\3\2\2\2\u0140\u013e\3\2\2\2\u0141\u0142\7<\2\2\u0142\u0146\5\u011e"+
		"\u0090\2\u0143\u0144\7\t\2\2\u0144\u0147\7\21\2\2\u0145\u0147\5\n\6\2"+
		"\u0146\u0143\3\2\2\2\u0146\u0145\3\2\2\2\u0146\u0147\3\2\2\2\u0147\u0149"+
		"\3\2\2\2\u0148\u014a\5\u0122\u0092\2\u0149\u0148\3\2\2\2\u0149\u014a\3"+
		"\2\2\2\u014a\t\3\2\2\2\u014b\u014c\7Y\2\2\u014c\u014d\5\u0120\u0091\2"+
		"\u014d\13\3\2\2\2\u014e\u0153\5\16\b\2\u014f\u0153\5.\30\2\u0150\u0153"+
		"\58\35\2\u0151\u0153\5B\"\2\u0152\u014e\3\2\2\2\u0152\u014f\3\2\2\2\u0152"+
		"\u0150\3\2\2\2\u0152\u0151\3\2\2\2\u0153\u0155\3\2\2\2\u0154\u0156\5\u0122"+
		"\u0092\2\u0155\u0154\3\2\2\2\u0155\u0156\3\2\2\2\u0156\r\3\2\2\2\u0157"+
		"\u0159\5\u00fc\177\2\u0158\u0157\3\2\2\2\u0158\u0159\3\2\2\2\u0159\u015a"+
		"\3\2\2\2\u015a\u015e\t\2\2\2\u015b\u015d\7\7\2\2\u015c\u015b\3\2\2\2\u015d"+
		"\u0160\3\2\2\2\u015e\u015c\3\2\2\2\u015e\u015f\3\2\2\2\u015f\u0161\3\2"+
		"\2\2\u0160\u015e\3\2\2\2\u0161\u0169\5\u0120\u0091\2\u0162\u0164\7\7\2"+
		"\2\u0163\u0162\3\2\2\2\u0164\u0167\3\2\2\2\u0165\u0163\3\2\2\2\u0165\u0166"+
		"\3\2\2\2\u0166\u0168\3\2\2\2\u0167\u0165\3\2\2\2\u0168\u016a\5D#\2\u0169"+
		"\u0165\3\2\2\2\u0169\u016a\3\2\2\2\u016a\u0172\3\2\2\2\u016b\u016d\7\7"+
		"\2\2\u016c\u016b\3\2\2\2\u016d\u0170\3\2\2\2\u016e\u016c\3\2\2\2\u016e"+
		"\u016f\3\2\2\2\u016f\u0171\3\2\2\2\u0170\u016e\3\2\2\2\u0171\u0173\5\20"+
		"\t\2\u0172\u016e\3\2\2\2\u0172\u0173\3\2\2\2\u0173\u0182\3\2\2\2\u0174"+
		"\u0176\7\7\2\2\u0175\u0174\3\2\2\2\u0176\u0179\3\2\2\2\u0177\u0175\3\2"+
		"\2\2\u0177\u0178\3\2\2\2\u0178\u017a\3\2\2\2\u0179\u0177\3\2\2\2\u017a"+
		"\u017e\7\33\2\2\u017b\u017d\7\7\2\2\u017c\u017b\3\2\2\2\u017d\u0180\3"+
		"\2\2\2\u017e\u017c\3\2\2\2\u017e\u017f\3\2\2\2\u017f\u0181\3\2\2\2\u0180"+
		"\u017e\3\2\2\2\u0181\u0183\5\26\f\2\u0182\u0177\3\2\2\2\u0182\u0183\3"+
		"\2\2\2\u0183\u018b\3\2\2\2\u0184\u0186\7\7\2\2\u0185\u0184\3\2\2\2\u0186"+
		"\u0189\3\2\2\2\u0187\u0185\3\2\2\2\u0187\u0188\3\2\2\2\u0188\u018a\3\2"+
		"\2\2\u0189\u0187\3\2\2\2\u018a\u018c\5\\/\2\u018b\u0187\3\2\2\2\u018b"+
		"\u018c\3\2\2\2\u018c\u019b\3\2\2\2\u018d\u018f\7\7\2\2\u018e\u018d\3\2"+
		"\2\2\u018f\u0192\3\2\2\2\u0190\u018e\3\2\2\2\u0190\u0191\3\2\2\2\u0191"+
		"\u0193\3\2\2\2\u0192\u0190\3\2\2\2\u0193\u019c\5\36\20\2\u0194\u0196\7"+
		"\7\2\2\u0195\u0194\3\2\2\2\u0196\u0199\3\2\2\2\u0197\u0195\3\2\2\2\u0197"+
		"\u0198\3\2\2\2\u0198\u019a\3\2\2\2\u0199\u0197\3\2\2\2\u019a\u019c\5("+
		"\25\2\u019b\u0190\3\2\2\2\u019b\u0197\3\2\2\2\u019b\u019c\3\2\2\2\u019c"+
		"\17\3\2\2\2\u019d\u019f\5\u00fc\177\2\u019e\u019d\3\2\2\2\u019e\u019f"+
		"\3\2\2\2\u019f\u01a7\3\2\2\2\u01a0\u01a4\7D\2\2\u01a1\u01a3\7\7\2\2\u01a2"+
		"\u01a1\3\2\2\2\u01a3\u01a6\3\2\2\2\u01a4\u01a2\3\2\2\2\u01a4\u01a5\3\2"+
		"\2\2\u01a5\u01a8\3\2\2\2\u01a6\u01a4\3\2\2\2\u01a7\u01a0\3\2\2\2\u01a7"+
		"\u01a8\3\2\2\2\u01a8\u01a9\3\2\2\2\u01a9\u01aa\5\22\n\2\u01aa\21\3\2\2"+
		"\2\u01ab\u01b4\7\13\2\2\u01ac\u01b1\5\24\13\2\u01ad\u01ae\7\n\2\2\u01ae"+
		"\u01b0\5\24\13\2\u01af\u01ad\3\2\2\2\u01b0\u01b3\3\2\2\2\u01b1\u01af\3"+
		"\2\2\2\u01b1\u01b2\3\2\2\2\u01b2\u01b5\3\2\2\2\u01b3\u01b1\3\2\2\2\u01b4"+
		"\u01ac\3\2\2\2\u01b4\u01b5\3\2\2\2\u01b5\u01b6\3\2\2\2\u01b6\u01b7\7\f"+
		"\2\2\u01b7\23\3\2\2\2\u01b8\u01ba\5\u00fc\177\2\u01b9\u01b8\3\2\2\2\u01b9"+
		"\u01ba\3\2\2\2\u01ba\u01bc\3\2\2\2\u01bb\u01bd\t\3\2\2\u01bc\u01bb\3\2"+
		"\2\2\u01bc\u01bd\3\2\2\2\u01bd\u01be\3\2\2\2\u01be\u01bf\5\u0120\u0091"+
		"\2\u01bf\u01c0\7\33\2\2\u01c0\u01c3\5H%\2\u01c1\u01c2\7\35\2\2\u01c2\u01c4"+
		"\5j\66\2\u01c3\u01c1\3\2\2\2\u01c3\u01c4\3\2\2\2\u01c4\25\3\2\2\2\u01c5"+
		"\u01c7\5\u0114\u008b\2\u01c6\u01c5\3\2\2\2\u01c7\u01ca\3\2\2\2\u01c8\u01c6"+
		"\3\2\2\2\u01c8\u01c9\3\2\2\2\u01c9\u01cb\3\2\2\2\u01ca\u01c8\3\2\2\2\u01cb"+
		"\u01dc\5\30\r\2\u01cc\u01ce\7\7\2\2\u01cd\u01cc\3\2\2\2\u01ce\u01d1\3"+
		"\2\2\2\u01cf\u01cd\3\2\2\2\u01cf\u01d0\3\2\2\2\u01d0\u01d2\3\2\2\2\u01d1"+
		"\u01cf\3\2\2\2\u01d2\u01d6\7\n\2\2\u01d3\u01d5\7\7\2\2\u01d4\u01d3\3\2"+
		"\2\2\u01d5\u01d8\3\2\2\2\u01d6\u01d4\3\2\2\2\u01d6\u01d7\3\2\2\2\u01d7"+
		"\u01d9\3\2\2\2\u01d8\u01d6\3\2\2\2\u01d9\u01db\5\30\r\2\u01da\u01cf\3"+
		"\2\2\2\u01db\u01de\3\2\2\2\u01dc\u01da\3\2\2\2\u01dc\u01dd\3\2\2\2\u01dd"+
		"\27\3\2\2\2\u01de\u01dc\3\2\2\2\u01df\u01e3\5\32\16\2\u01e0\u01e3\5V,"+
		"\2\u01e1\u01e3\5\34\17\2\u01e2\u01df\3\2\2\2\u01e2\u01e0\3\2\2\2\u01e2"+
		"\u01e1\3\2\2\2\u01e3\31\3\2\2\2\u01e4\u01e5\5V,\2\u01e5\u01e6\5\u0092"+
		"J\2\u01e6\33\3\2\2\2\u01e7\u01eb\5V,\2\u01e8\u01ea\7\7\2\2\u01e9\u01e8"+
		"\3\2\2\2\u01ea\u01ed\3\2\2\2\u01eb\u01e9\3\2\2\2\u01eb\u01ec\3\2\2\2\u01ec"+
		"\u01ee\3\2\2\2\u01ed\u01eb\3\2\2\2\u01ee\u01f2\7E\2\2\u01ef\u01f1\7\7"+
		"\2\2\u01f0\u01ef\3\2\2\2\u01f1\u01f4\3\2\2\2\u01f2\u01f0\3\2\2\2\u01f2"+
		"\u01f3\3\2\2\2\u01f3\u01f5\3\2\2\2\u01f4\u01f2\3\2\2\2\u01f5\u01f6\5j"+
		"\66\2\u01f6\35\3\2\2\2\u01f7\u01fb\7\17\2\2\u01f8\u01fa\7\7\2\2\u01f9"+
		"\u01f8\3\2\2\2\u01fa\u01fd\3\2\2\2\u01fb\u01f9\3\2\2\2\u01fb\u01fc\3\2"+
		"\2\2\u01fc\u0201\3\2\2\2\u01fd\u01fb\3\2\2\2\u01fe\u0200\5 \21\2\u01ff"+
		"\u01fe\3\2\2\2\u0200\u0203\3\2\2\2\u0201\u01ff\3\2\2\2\u0201\u0202\3\2"+
		"\2\2\u0202\u0207\3\2\2\2\u0203\u0201\3\2\2\2\u0204\u0206\7\7\2\2\u0205"+
		"\u0204\3\2\2\2\u0206\u0209\3\2\2\2\u0207\u0205\3\2\2\2\u0207\u0208\3\2"+
		"\2\2\u0208\u020a\3\2\2\2\u0209\u0207\3\2\2\2\u020a\u020b\7\20\2\2\u020b"+
		"\37\3\2\2\2\u020c\u0213\5\16\b\2\u020d\u0213\5.\30\2\u020e\u0213\58\35"+
		"\2\u020f\u0213\5\"\22\2\u0210\u0213\5$\23\2\u0211\u0213\5B\"\2\u0212\u020c"+
		"\3\2\2\2\u0212\u020d\3\2\2\2\u0212\u020e\3\2\2\2\u0212\u020f\3\2\2\2\u0212"+
		"\u0210\3\2\2\2\u0212\u0211\3\2\2\2\u0213\u0215\3\2\2\2\u0214\u0216\5\u0122"+
		"\u0092\2\u0215\u0214\3\2\2\2\u0215\u0216\3\2\2\2\u0216!\3\2\2\2\u0217"+
		"\u021b\7G\2\2\u0218\u021a\7\7\2\2\u0219\u0218\3\2\2\2\u021a\u021d\3\2"+
		"\2\2\u021b\u0219\3\2\2\2\u021b\u021c\3\2\2\2\u021c\u021e\3\2\2\2\u021d"+
		"\u021b\3\2\2\2\u021e\u021f\5`\61\2\u021f#\3\2\2\2\u0220\u0222\5\u00fc"+
		"\177\2\u0221\u0220\3\2\2\2\u0221\u0222\3\2\2\2\u0222\u0223\3\2\2\2\u0223"+
		"\u0227\7D\2\2\u0224\u0226\7\7\2\2\u0225\u0224\3\2\2\2\u0226\u0229\3\2"+
		"\2\2\u0227\u0225\3\2\2\2\u0227\u0228\3\2\2\2\u0228\u022a\3\2\2\2\u0229"+
		"\u0227\3\2\2\2\u022a\u0239\5\60\31\2\u022b\u022d\7\7\2\2\u022c\u022b\3"+
		"\2\2\2\u022d\u0230\3\2\2\2\u022e\u022c\3\2\2\2\u022e\u022f\3\2\2\2\u022f"+
		"\u0231\3\2\2\2\u0230\u022e\3\2\2\2\u0231\u0235\7\33\2\2\u0232\u0234\7"+
		"\7\2\2\u0233\u0232\3\2\2\2\u0234\u0237\3\2\2\2\u0235\u0233\3\2\2\2\u0235"+
		"\u0236\3\2\2\2\u0236\u0238\3\2\2\2\u0237\u0235\3\2\2\2\u0238\u023a\5&"+
		"\24\2\u0239\u022e\3\2\2\2\u0239\u023a\3\2\2\2\u023a\u023e\3\2\2\2\u023b"+
		"\u023d\7\7\2\2\u023c\u023b\3\2\2\2\u023d\u0240\3\2\2\2\u023e\u023c\3\2"+
		"\2\2\u023e\u023f\3\2\2\2\u023f\u0241\3\2\2\2\u0240\u023e\3\2\2\2\u0241"+
		"\u0242\5`\61\2\u0242%\3\2\2\2\u0243\u0247\7H\2\2\u0244\u0246\7\7\2\2\u0245"+
		"\u0244\3\2\2\2\u0246\u0249\3\2\2\2\u0247\u0245\3\2\2\2\u0247\u0248\3\2"+
		"\2\2\u0248\u024a\3\2\2\2\u0249\u0247\3\2\2\2\u024a\u0254\5\u0098M\2\u024b"+
		"\u024f\7I\2\2\u024c\u024e\7\7\2\2\u024d\u024c\3\2\2\2\u024e\u0251\3\2"+
		"\2\2\u024f\u024d\3\2\2\2\u024f\u0250\3\2\2\2\u0250\u0252\3\2\2\2\u0251"+
		"\u024f\3\2\2\2\u0252\u0254\5\u0098M\2\u0253\u0243\3\2\2\2\u0253\u024b"+
		"\3\2\2\2\u0254\'\3\2\2\2\u0255\u0259\7\17\2\2\u0256\u0258\7\7\2\2\u0257"+
		"\u0256\3\2\2\2\u0258\u025b\3\2\2\2\u0259\u0257\3\2\2\2\u0259\u025a\3\2"+
		"\2\2\u025a\u025d\3\2\2\2\u025b\u0259\3\2\2\2\u025c\u025e\5*\26\2\u025d"+
		"\u025c\3\2\2\2\u025d\u025e\3\2\2\2\u025e\u0272\3\2\2\2\u025f\u0261\7\7"+
		"\2\2\u0260\u025f\3\2\2\2\u0261\u0264\3\2\2\2\u0262\u0260\3\2\2\2\u0262"+
		"\u0263\3\2\2\2\u0263\u0265\3\2\2\2\u0264\u0262\3\2\2\2\u0265\u0269\7\34"+
		"\2\2\u0266\u0268\7\7\2\2\u0267\u0266\3\2\2\2\u0268\u026b\3\2\2\2\u0269"+
		"\u0267\3\2\2\2\u0269\u026a\3\2\2\2\u026a\u026f\3\2\2\2\u026b\u0269\3\2"+
		"\2\2\u026c\u026e\5 \21\2\u026d\u026c\3\2\2\2\u026e\u0271\3\2\2\2\u026f"+
		"\u026d\3\2\2\2\u026f\u0270\3\2\2\2\u0270\u0273\3\2\2\2\u0271\u026f\3\2"+
		"\2\2\u0272\u0262\3\2\2\2\u0272\u0273\3\2\2\2\u0273\u0277\3\2\2\2\u0274"+
		"\u0276\7\7\2\2\u0275\u0274\3\2\2\2\u0276\u0279\3\2\2\2\u0277\u0275\3\2"+
		"\2\2\u0277\u0278\3\2\2\2\u0278\u027a\3\2\2\2\u0279\u0277\3\2\2\2\u027a"+
		"\u027b\7\20\2\2\u027b)\3\2\2\2\u027c\u0280\5,\27\2\u027d\u027f\7\7\2\2"+
		"\u027e\u027d\3\2\2\2\u027f\u0282\3\2\2\2\u0280\u027e\3\2\2\2\u0280\u0281"+
		"\3\2\2\2\u0281\u0284\3\2\2\2\u0282\u0280\3\2\2\2\u0283\u027c\3\2\2\2\u0284"+
		"\u0285\3\2\2\2\u0285\u0283\3\2\2\2\u0285\u0286\3\2\2\2\u0286\u0288\3\2"+
		"\2\2\u0287\u0289\7\34\2\2\u0288\u0287\3\2\2\2\u0288\u0289\3\2\2\2\u0289"+
		"+\3\2\2\2\u028a\u0292\5\u0120\u0091\2\u028b\u028d\7\7\2\2\u028c\u028b"+
		"\3\2\2\2\u028d\u0290\3\2\2\2\u028e\u028c\3\2\2\2\u028e\u028f\3\2\2\2\u028f"+
		"\u0291\3\2\2\2\u0290\u028e\3\2\2\2\u0291\u0293\5\u0098M\2\u0292\u028e"+
		"\3\2\2\2\u0292\u0293\3\2\2\2\u0293\u029b\3\2\2\2\u0294\u0296\7\7\2\2\u0295"+
		"\u0294\3\2\2\2\u0296\u0299\3\2\2\2\u0297\u0295\3\2\2\2\u0297\u0298\3\2"+
		"\2\2\u0298\u029a\3\2\2\2\u0299\u0297\3\2\2\2\u029a\u029c\5\36\20\2\u029b"+
		"\u0297\3\2\2\2\u029b\u029c\3\2\2\2\u029c\u02a4\3\2\2\2\u029d\u029f\7\7"+
		"\2\2\u029e\u029d\3\2\2\2\u029f\u02a2\3\2\2\2\u02a0\u029e\3\2\2\2\u02a0"+
		"\u02a1\3\2\2\2\u02a1\u02a3\3\2\2\2\u02a2\u02a0\3\2\2\2\u02a3\u02a5\7\n"+
		"\2\2\u02a4\u02a0\3\2\2\2\u02a4\u02a5\3\2\2\2\u02a5-\3\2\2\2\u02a6\u02a8"+
		"\5\u00fc\177\2\u02a7\u02a6\3\2\2\2\u02a7\u02a8\3\2\2\2\u02a8\u02a9\3\2"+
		"\2\2\u02a9\u02b9\7?\2\2\u02aa\u02ac\7\7\2\2\u02ab\u02aa\3\2\2\2\u02ac"+
		"\u02af\3\2\2\2\u02ad\u02ab\3\2\2\2\u02ad\u02ae\3\2\2\2\u02ae\u02b0\3\2"+
		"\2\2\u02af\u02ad\3\2\2\2\u02b0\u02b4\5H%\2\u02b1\u02b3\7\7\2\2\u02b2\u02b1"+
		"\3\2\2\2\u02b3\u02b6\3\2\2\2\u02b4\u02b2\3\2\2\2\u02b4\u02b5\3\2\2\2\u02b5"+
		"\u02b7\3\2\2\2\u02b6\u02b4\3\2\2\2\u02b7\u02b8\7\t\2\2\u02b8\u02ba\3\2"+
		"\2\2\u02b9\u02ad\3\2\2\2\u02b9\u02ba\3\2\2\2\u02ba\u02c2\3\2\2\2\u02bb"+
		"\u02bd\7\7\2\2\u02bc\u02bb\3\2\2\2\u02bd\u02c0\3\2\2\2\u02be\u02bc\3\2"+
		"\2\2\u02be\u02bf\3\2\2\2\u02bf\u02c1\3\2\2\2\u02c0\u02be\3\2\2\2\u02c1"+
		"\u02c3\5D#\2\u02c2\u02be\3\2\2\2\u02c2\u02c3\3\2\2\2\u02c3\u02cb\3\2\2"+
		"\2\u02c4\u02c6\7\7\2\2\u02c5\u02c4\3\2\2\2\u02c6\u02c9\3\2\2\2\u02c7\u02c5"+
		"\3\2\2\2\u02c7\u02c8\3\2\2\2\u02c8\u02ca\3\2\2\2\u02c9\u02c7\3\2\2\2\u02ca"+
		"\u02cc\5\u011e\u0090\2\u02cb\u02c7\3\2\2\2\u02cb\u02cc\3\2\2\2\u02cc\u02d0"+
		"\3\2\2\2\u02cd\u02cf\7\7\2\2\u02ce\u02cd\3\2\2\2\u02cf\u02d2\3\2\2\2\u02d0"+
		"\u02ce\3\2\2\2\u02d0\u02d1\3\2\2\2\u02d1\u02d3\3\2\2\2\u02d2\u02d0\3\2"+
		"\2\2\u02d3\u02e2\5\60\31\2\u02d4\u02d6\7\7\2\2\u02d5\u02d4\3\2\2\2\u02d6"+
		"\u02d9\3\2\2\2\u02d7\u02d5\3\2\2\2\u02d7\u02d8\3\2\2\2\u02d8\u02da\3\2"+
		"\2\2\u02d9\u02d7\3\2\2\2\u02da\u02de\7\33\2\2\u02db\u02dd\7\7\2\2\u02dc"+
		"\u02db\3\2\2\2\u02dd\u02e0\3\2\2\2\u02de\u02dc\3\2\2\2\u02de\u02df\3\2"+
		"\2\2\u02df\u02e1\3\2\2\2\u02e0\u02de\3\2\2\2\u02e1\u02e3\5H%\2\u02e2\u02d7"+
		"\3\2\2\2\u02e2\u02e3\3\2\2\2\u02e3\u02eb\3\2\2\2\u02e4\u02e6\7\7\2\2\u02e5"+
		"\u02e4\3\2\2\2\u02e6\u02e9\3\2\2\2\u02e7\u02e5\3\2\2\2\u02e7\u02e8\3\2"+
		"\2\2\u02e8\u02ea\3\2\2\2\u02e9\u02e7\3\2\2\2\u02ea\u02ec\5\\/\2\u02eb"+
		"\u02e7\3\2\2\2\u02eb\u02ec\3\2\2\2\u02ec\u02f4\3\2\2\2\u02ed\u02ef\7\7"+
		"\2\2\u02ee\u02ed\3\2\2\2\u02ef\u02f2\3\2\2\2\u02f0\u02ee\3\2\2\2\u02f0"+
		"\u02f1\3\2\2\2\u02f1\u02f3\3\2\2\2\u02f2\u02f0\3\2\2\2\u02f3\u02f5\5\66"+
		"\34\2\u02f4\u02f0\3\2\2\2\u02f4\u02f5\3\2\2\2\u02f5/\3\2\2\2\u02f6\u02ff"+
		"\7\13\2\2\u02f7\u02fc\5\62\32\2\u02f8\u02f9\7\n\2\2\u02f9\u02fb\5\62\32"+
		"\2\u02fa\u02f8\3\2\2\2\u02fb\u02fe\3\2\2\2\u02fc\u02fa\3\2\2\2\u02fc\u02fd"+
		"\3\2\2\2\u02fd\u0300\3\2\2\2\u02fe\u02fc\3\2\2\2\u02ff\u02f7\3\2\2\2\u02ff"+
		"\u0300\3\2\2\2\u0300\u0301\3\2\2\2\u0301\u0302\7\f\2\2\u0302\61\3\2\2"+
		"\2\u0303\u0305\5\u00fc\177\2\u0304\u0303\3\2\2\2\u0304\u0305\3\2\2\2\u0305"+
		"\u0306\3\2\2\2\u0306\u0309\5\64\33\2\u0307\u0308\7\35\2\2\u0308\u030a"+
		"\5j\66\2\u0309\u0307\3\2\2\2\u0309\u030a\3\2\2\2\u030a\63\3\2\2\2\u030b"+
		"\u030c\5\u0120\u0091\2\u030c\u030d\7\33\2\2\u030d\u030e\5H%\2\u030e\65"+
		"\3\2\2\2\u030f\u0319\5`\61\2\u0310\u0314\7\35\2\2\u0311\u0313\7\7\2\2"+
		"\u0312\u0311\3\2\2\2\u0313\u0316\3\2\2\2\u0314\u0312\3\2\2\2\u0314\u0315"+
		"\3\2\2\2\u0315\u0317\3\2\2\2\u0316\u0314\3\2\2\2\u0317\u0319\5j\66\2\u0318"+
		"\u030f\3\2\2\2\u0318\u0310\3\2\2\2\u0319\67\3\2\2\2\u031a\u031c\5\u00fc"+
		"\177\2\u031b\u031a\3\2\2\2\u031b\u031c\3\2\2\2\u031c\u031d\3\2\2\2\u031d"+
		"\u0325\t\3\2\2\u031e\u0320\7\7\2\2\u031f\u031e\3\2\2\2\u0320\u0323\3\2"+
		"\2\2\u0321\u031f\3\2\2\2\u0321\u0322\3\2\2\2\u0322\u0324\3\2\2\2\u0323"+
		"\u0321\3\2\2\2\u0324\u0326\5D#\2\u0325\u0321\3\2\2\2\u0325\u0326\3\2\2"+
		"\2\u0326\u0336\3\2\2\2\u0327\u0329\7\7\2\2\u0328\u0327\3\2\2\2\u0329\u032c"+
		"\3\2\2\2\u032a\u0328\3\2\2\2\u032a\u032b\3\2\2\2\u032b\u032d\3\2\2\2\u032c"+
		"\u032a\3\2\2\2\u032d\u0331\5H%\2\u032e\u0330\7\7\2\2\u032f\u032e\3\2\2"+
		"\2\u0330\u0333\3\2\2\2\u0331\u032f\3\2\2\2\u0331\u0332\3\2\2\2\u0332\u0334"+
		"\3\2\2\2\u0333\u0331\3\2\2\2\u0334\u0335\7\t\2\2\u0335\u0337\3\2\2\2\u0336"+
		"\u032a\3\2\2\2\u0336\u0337\3\2\2\2\u0337\u033b\3\2\2\2\u0338\u033a\7\7"+
		"\2\2\u0339\u0338\3\2\2\2\u033a\u033d\3\2\2\2\u033b\u0339\3\2\2\2\u033b"+
		"\u033c\3\2\2\2\u033c\u0340\3\2\2\2\u033d\u033b\3\2\2\2\u033e\u0341\5:"+
		"\36\2\u033f\u0341\5<\37\2\u0340\u033e\3\2\2\2\u0340\u033f\3\2\2\2\u0341"+
		"\u0349\3\2\2\2\u0342\u0344\7\7\2\2\u0343\u0342\3\2\2\2\u0344\u0347\3\2"+
		"\2\2\u0345\u0343\3\2\2\2\u0345\u0346\3\2\2\2\u0346\u0348\3\2\2\2\u0347"+
		"\u0345\3\2\2\2\u0348\u034a\5\\/\2\u0349\u0345\3\2\2\2\u0349\u034a\3\2"+
		"\2\2\u034a\u0359\3\2\2\2\u034b\u034d\7\7\2\2\u034c\u034b\3\2\2\2\u034d"+
		"\u0350\3\2\2\2\u034e\u034c\3\2\2\2\u034e\u034f\3\2\2\2\u034f\u0351\3\2"+
		"\2\2\u0350\u034e\3\2\2\2\u0351\u0355\t\4\2\2\u0352\u0354\7\7\2\2\u0353"+
		"\u0352\3\2\2\2\u0354\u0357\3\2\2\2\u0355\u0353\3\2\2\2\u0355\u0356\3\2"+
		"\2\2\u0356\u0358\3\2\2\2\u0357\u0355\3\2\2\2\u0358\u035a\5j\66\2\u0359"+
		"\u034e\3\2\2\2\u0359\u035a\3\2\2\2\u035a\u035c\3\2\2\2\u035b\u035d\5\u0122"+
		"\u0092\2\u035c\u035b\3\2\2\2\u035c\u035d\3\2\2\2\u035d\u0376\3\2\2\2\u035e"+
		"\u0360\5> \2\u035f\u035e\3\2\2\2\u035f\u0360\3\2\2\2\u0360\u0368\3\2\2"+
		"\2\u0361\u0363\7\7\2\2\u0362\u0361\3\2\2\2\u0363\u0366\3\2\2\2\u0364\u0362"+
		"\3\2\2\2\u0364\u0365\3\2\2\2\u0365\u0367\3\2\2\2\u0366\u0364\3\2\2\2\u0367"+
		"\u0369\5@!\2\u0368\u0364\3\2\2\2\u0368\u0369\3\2\2\2\u0369\u0377\3\2\2"+
		"\2\u036a\u036c\5@!\2\u036b\u036a\3\2\2\2\u036b\u036c\3\2\2\2\u036c\u0374"+
		"\3\2\2\2\u036d\u036f\7\7\2\2\u036e\u036d\3\2\2\2\u036f\u0372\3\2\2\2\u0370"+
		"\u036e\3\2\2\2\u0370\u0371\3\2\2\2\u0371\u0373\3\2\2\2\u0372\u0370\3\2"+
		"\2\2\u0373\u0375\5> \2\u0374\u0370\3\2\2\2\u0374\u0375\3\2\2\2\u0375\u0377"+
		"\3\2\2\2\u0376\u035f\3\2\2\2\u0376\u036b\3\2\2\2\u03779\3\2\2\2\u0378"+
		"\u0379\7\13\2\2\u0379\u037e\5<\37\2\u037a\u037b\7\n\2\2\u037b\u037d\5"+
		"<\37\2\u037c\u037a\3\2\2\2\u037d\u0380\3\2\2\2\u037e\u037c\3\2\2\2\u037e"+
		"\u037f\3\2\2\2\u037f\u0381\3\2\2\2\u0380\u037e\3\2\2\2\u0381\u0382\7\f"+
		"\2\2\u0382;\3\2\2\2\u0383\u0386\5\u0120\u0091\2\u0384\u0385\7\33\2\2\u0385"+
		"\u0387\5H%\2\u0386\u0384\3\2\2\2\u0386\u0387\3\2\2\2\u0387=\3\2\2\2\u0388"+
		"\u038a\5\u00fc\177\2\u0389\u0388\3\2\2\2\u0389\u038a\3\2\2\2\u038a\u038b"+
		"\3\2\2\2\u038b\u03ba\7c\2\2\u038c\u038e\5\u00fc\177\2\u038d\u038c\3\2"+
		"\2\2\u038d\u038e\3\2\2\2\u038e\u038f\3\2\2\2\u038f\u0393\7c\2\2\u0390"+
		"\u0392\7\7\2\2\u0391\u0390\3\2\2\2\u0392\u0395\3\2\2\2\u0393\u0391\3\2"+
		"\2\2\u0393\u0394\3\2\2\2\u0394\u0396\3\2\2\2\u0395\u0393\3\2\2\2\u0396"+
		"\u0397\7\13\2\2\u0397\u03a6\7\f\2\2\u0398\u039a\7\7\2\2\u0399\u0398\3"+
		"\2\2\2\u039a\u039d\3\2\2\2\u039b\u0399\3\2\2\2\u039b\u039c\3\2\2\2\u039c"+
		"\u039e\3\2\2\2\u039d\u039b\3\2\2\2\u039e\u03a2\7\33\2\2\u039f\u03a1\7"+
		"\7\2\2\u03a0\u039f\3\2\2\2\u03a1\u03a4\3\2\2\2\u03a2\u03a0\3\2\2\2\u03a2"+
		"\u03a3\3\2\2\2\u03a3\u03a5\3\2\2\2\u03a4\u03a2\3\2\2\2\u03a5\u03a7\5H"+
		"%\2\u03a6\u039b\3\2\2\2\u03a6\u03a7\3\2\2\2\u03a7\u03ab\3\2\2\2\u03a8"+
		"\u03aa\7\7\2\2\u03a9\u03a8\3\2\2\2\u03aa\u03ad\3\2\2\2\u03ab\u03a9\3\2"+
		"\2\2\u03ab\u03ac\3\2\2\2\u03ac\u03b7\3\2\2\2\u03ad\u03ab\3\2\2\2\u03ae"+
		"\u03b8\5`\61\2\u03af\u03b3\7\35\2\2\u03b0\u03b2\7\7\2\2\u03b1\u03b0\3"+
		"\2\2\2\u03b2\u03b5\3\2\2\2\u03b3\u03b1\3\2\2\2\u03b3\u03b4\3\2\2\2\u03b4"+
		"\u03b6\3\2\2\2\u03b5\u03b3\3\2\2\2\u03b6\u03b8\5j\66\2\u03b7\u03ae\3\2"+
		"\2\2\u03b7\u03af\3\2\2\2\u03b8\u03ba\3\2\2\2\u03b9\u0389\3\2\2\2\u03b9"+
		"\u038d\3\2\2\2\u03ba?\3\2\2\2\u03bb\u03bd\5\u00fc\177\2\u03bc\u03bb\3"+
		"\2\2\2\u03bc\u03bd\3\2\2\2\u03bd\u03be\3\2\2\2\u03be\u03df\7d\2\2\u03bf"+
		"\u03c1\5\u00fc\177\2\u03c0\u03bf\3\2\2\2\u03c0\u03c1\3\2\2\2\u03c1\u03c2"+
		"\3\2\2\2\u03c2\u03c6\7d\2\2\u03c3\u03c5\7\7\2\2\u03c4\u03c3\3\2\2\2\u03c5"+
		"\u03c8\3\2\2\2\u03c6\u03c4\3\2\2\2\u03c6\u03c7\3\2\2\2\u03c7\u03c9\3\2"+
		"\2\2\u03c8\u03c6\3\2\2\2\u03c9\u03ce\7\13\2\2\u03ca\u03cd\5\u0114\u008b"+
		"\2\u03cb\u03cd\5\u010e\u0088\2\u03cc\u03ca\3\2\2\2\u03cc\u03cb\3\2\2\2"+
		"\u03cd\u03d0\3\2\2\2\u03ce\u03cc\3\2\2\2\u03ce\u03cf\3\2\2\2\u03cf\u03d3"+
		"\3\2\2\2\u03d0\u03ce\3\2\2\2\u03d1\u03d4\5\u0120\u0091\2\u03d2\u03d4\5"+
		"\64\33\2\u03d3\u03d1\3\2\2\2\u03d3\u03d2\3\2\2\2\u03d4\u03d5\3\2\2\2\u03d5"+
		"\u03d9\7\f\2\2\u03d6\u03d8\7\7\2\2\u03d7\u03d6\3\2\2\2\u03d8\u03db\3\2"+
		"\2\2\u03d9\u03d7\3\2\2\2\u03d9\u03da\3\2\2\2\u03da\u03dc\3\2\2\2\u03db"+
		"\u03d9\3\2\2\2\u03dc\u03dd\5\66\34\2\u03dd\u03df\3\2\2\2\u03de\u03bc\3"+
		"\2\2\2\u03de\u03c0\3\2\2\2\u03dfA\3\2\2\2\u03e0\u03e2\5\u00fc\177\2\u03e1"+
		"\u03e0\3\2\2\2\u03e1\u03e2\3\2\2\2\u03e2\u03e3\3\2\2\2\u03e3\u03e7\7C"+
		"\2\2\u03e4\u03e6\7\7\2\2\u03e5\u03e4\3\2\2\2\u03e6\u03e9\3\2\2\2\u03e7"+
		"\u03e5\3\2\2\2\u03e7\u03e8\3\2\2\2\u03e8\u03ea\3\2\2\2\u03e9\u03e7\3\2"+
		"\2\2\u03ea\u03f2\5\u0120\u0091\2\u03eb\u03ed\7\7\2\2\u03ec\u03eb\3\2\2"+
		"\2\u03ed\u03f0\3\2\2\2\u03ee\u03ec\3\2\2\2\u03ee\u03ef\3\2\2\2\u03ef\u03f1"+
		"\3\2\2\2\u03f0\u03ee\3\2\2\2\u03f1\u03f3\5D#\2\u03f2\u03ee\3\2\2\2\u03f2"+
		"\u03f3\3\2\2\2\u03f3\u03f7\3\2\2\2\u03f4\u03f6\7\7\2\2\u03f5\u03f4\3\2"+
		"\2\2\u03f6\u03f9\3\2\2\2\u03f7\u03f5\3\2\2\2\u03f7\u03f8\3\2\2\2\u03f8"+
		"\u03fa\3\2\2\2\u03f9\u03f7\3\2\2\2\u03fa\u03fe\7\35\2\2\u03fb\u03fd\7"+
		"\7\2\2\u03fc\u03fb\3\2\2\2\u03fd\u0400\3\2\2\2\u03fe\u03fc\3\2\2\2\u03fe"+
		"\u03ff\3\2\2\2\u03ff\u0401\3\2\2\2\u0400\u03fe\3\2\2\2\u0401\u0402\5H"+
		"%\2\u0402C\3\2\2\2\u0403\u0407\7-\2\2\u0404\u0406\7\7\2\2\u0405\u0404"+
		"\3\2\2\2\u0406\u0409\3\2\2\2\u0407\u0405\3\2\2\2\u0407\u0408\3\2\2\2\u0408"+
		"\u040a\3\2\2\2\u0409\u0407\3\2\2\2\u040a\u041b\5F$\2\u040b\u040d\7\7\2"+
		"\2\u040c\u040b\3\2\2\2\u040d\u0410\3\2\2\2\u040e\u040c\3\2\2\2\u040e\u040f"+
		"\3\2\2\2\u040f\u0411\3\2\2\2\u0410\u040e\3\2\2\2\u0411\u0415\7\n\2\2\u0412"+
		"\u0414\7\7\2\2\u0413\u0412\3\2\2\2\u0414\u0417\3\2\2\2\u0415\u0413\3\2"+
		"\2\2\u0415\u0416\3\2\2\2\u0416\u0418\3\2\2\2\u0417\u0415\3\2\2\2\u0418"+
		"\u041a\5F$\2\u0419\u040e\3\2\2\2\u041a\u041d\3\2\2\2\u041b\u0419\3\2\2"+
		"\2\u041b\u041c\3\2\2\2\u041c\u0421\3\2\2\2\u041d\u041b\3\2\2\2\u041e\u0420"+
		"\7\7\2\2\u041f\u041e\3\2\2\2\u0420\u0423\3\2\2\2\u0421\u041f\3\2\2\2\u0421"+
		"\u0422\3\2\2\2\u0422\u0424\3\2\2\2\u0423\u0421\3\2\2\2\u0424\u0425\7."+
		"\2\2\u0425E\3\2\2\2\u0426\u0428\5\u00fc\177\2\u0427\u0426\3\2\2\2\u0427"+
		"\u0428\3\2\2\2\u0428\u042c\3\2\2\2\u0429\u042b\7\7\2\2\u042a\u0429\3\2"+
		"\2\2\u042b\u042e\3\2\2\2\u042c\u042a\3\2\2\2\u042c\u042d\3\2\2\2\u042d"+
		"\u042f\3\2\2\2\u042e\u042c\3\2\2\2\u042f\u043e\5\u0120\u0091\2\u0430\u0432"+
		"\7\7\2\2\u0431\u0430\3\2\2\2\u0432\u0435\3\2\2\2\u0433\u0431\3\2\2\2\u0433"+
		"\u0434\3\2\2\2\u0434\u0436\3\2\2\2\u0435\u0433\3\2\2\2\u0436\u043a\7\33"+
		"\2\2\u0437\u0439\7\7\2\2\u0438\u0437\3\2\2\2\u0439\u043c\3\2\2\2\u043a"+
		"\u0438\3\2\2\2\u043a\u043b\3\2\2\2\u043b\u043d\3\2\2\2\u043c\u043a\3\2"+
		"\2\2\u043d\u043f\5H%\2\u043e\u0433\3\2\2\2\u043e\u043f\3\2\2\2\u043fG"+
		"\3\2\2\2\u0440\u0442\5J&\2\u0441\u0440\3\2\2\2\u0441\u0442\3\2\2\2\u0442"+
		"\u0447\3\2\2\2\u0443\u0448\5L\'\2\u0444\u0448\5N(\2\u0445\u0448\5P)\2"+
		"\u0446\u0448\5R*\2\u0447\u0443\3\2\2\2\u0447\u0444\3\2\2\2\u0447\u0445"+
		"\3\2\2\2\u0447\u0446\3\2\2\2\u0448I\3\2\2\2\u0449\u0452\5\u0114\u008b"+
		"\2\u044a\u044e\7x\2\2\u044b\u044d\7\7\2\2\u044c\u044b\3\2\2\2\u044d\u0450"+
		"\3\2\2\2\u044e\u044c\3\2\2\2\u044e\u044f\3\2\2\2\u044f\u0452\3\2\2\2\u0450"+
		"\u044e\3\2\2\2\u0451\u0449\3\2\2\2\u0451\u044a\3\2\2\2\u0452\u0453\3\2"+
		"\2\2\u0453\u0451\3\2\2\2\u0453\u0454\3\2\2\2\u0454K\3\2\2\2\u0455\u0456"+
		"\7\13\2\2\u0456\u0457\5H%\2\u0457\u0458\7\f\2\2\u0458M\3\2\2\2\u0459\u045c"+
		"\5P)\2\u045a\u045c\5L\'\2\u045b\u0459\3\2\2\2\u045b\u045a\3\2\2\2\u045c"+
		"\u0460\3\2\2\2\u045d\u045f\7\7\2\2\u045e\u045d\3\2\2\2\u045f\u0462\3\2"+
		"\2\2\u0460\u045e\3\2\2\2\u0460\u0461\3\2\2\2\u0461\u0464\3\2\2\2\u0462"+
		"\u0460\3\2\2\2\u0463\u0465\7+\2\2\u0464\u0463\3\2\2\2\u0465\u0466\3\2"+
		"\2\2\u0466\u0464\3\2\2\2\u0466\u0467\3\2\2\2\u0467O\3\2\2\2\u0468\u0469"+
		"\7\13\2\2\u0469\u046a\5P)\2\u046a\u046b\7\f\2\2\u046b\u046f\3\2\2\2\u046c"+
		"\u046f\5V,\2\u046d\u046f\7i\2\2\u046e\u0468\3\2\2\2\u046e\u046c\3\2\2"+
		"\2\u046e\u046d\3\2\2\2\u046fQ\3\2\2\2\u0470\u0474\5T+\2\u0471\u0473\7"+
		"\7\2\2\u0472\u0471\3\2\2\2\u0473\u0476\3\2\2\2\u0474\u0472\3\2\2\2\u0474"+
		"\u0475\3\2\2\2\u0475\u0477\3\2\2\2\u0476\u0474\3\2\2\2\u0477\u047b\7\t"+
		"\2\2\u0478\u047a\7\7\2\2\u0479\u0478\3\2\2\2\u047a\u047d\3\2\2\2\u047b"+
		"\u0479\3\2\2\2\u047b\u047c\3\2\2\2\u047c\u047f\3\2\2\2\u047d\u047b\3\2"+
		"\2\2\u047e\u0470\3\2\2\2\u047e\u047f\3\2\2\2\u047f\u0480\3\2\2\2\u0480"+
		"\u0484\5Z.\2\u0481\u0483\7\7\2\2\u0482\u0481\3\2\2\2\u0483\u0486\3\2\2"+
		"\2\u0484\u0482\3\2\2\2\u0484\u0485\3\2\2\2\u0485\u0487\3\2\2\2\u0486\u0484"+
		"\3\2\2\2\u0487\u048f\7#\2\2\u0488\u048a\7\7\2\2\u0489\u0488\3\2\2\2\u048a"+
		"\u048d\3\2\2\2\u048b\u0489\3\2\2\2\u048b\u048c\3\2\2\2\u048c\u048e\3\2"+
		"\2\2\u048d\u048b\3\2\2\2\u048e\u0490\5H%\2\u048f\u048b\3\2\2\2\u048f\u0490"+
		"\3\2\2\2\u0490S\3\2\2\2\u0491\u0495\5L\'\2\u0492\u0495\5N(\2\u0493\u0495"+
		"\5P)\2\u0494\u0491\3\2\2\2\u0494\u0492\3\2\2\2\u0494\u0493\3\2\2\2\u0495"+
		"U\3\2\2\2\u0496\u04a7\5X-\2\u0497\u0499\7\7\2\2\u0498\u0497\3\2\2\2\u0499"+
		"\u049c\3\2\2\2\u049a\u0498\3\2\2\2\u049a\u049b\3\2\2\2\u049b\u049d\3\2"+
		"\2\2\u049c\u049a\3\2\2\2\u049d\u04a1\7\t\2\2\u049e\u04a0\7\7\2\2\u049f"+
		"\u049e\3\2\2\2\u04a0\u04a3\3\2\2\2\u04a1\u049f\3\2\2\2\u04a1\u04a2\3\2"+
		"\2\2\u04a2\u04a4\3\2\2\2\u04a3\u04a1\3\2\2\2\u04a4\u04a6\5X-\2\u04a5\u049a"+
		"\3\2\2\2\u04a6\u04a9\3\2\2\2\u04a7\u04a5\3\2\2\2\u04a7\u04a8\3\2\2\2\u04a8"+
		"W\3\2\2\2\u04a9\u04a7\3\2\2\2\u04aa\u04b2\5\u0120\u0091\2\u04ab\u04ad"+
		"\7\7\2\2\u04ac\u04ab\3\2\2\2\u04ad\u04b0\3\2\2\2\u04ae\u04ac\3\2\2\2\u04ae"+
		"\u04af\3\2\2\2\u04af\u04b1\3\2\2\2\u04b0\u04ae\3\2\2\2\u04b1\u04b3\5\u009a"+
		"N\2\u04b2\u04ae\3\2\2\2\u04b2\u04b3\3\2\2\2\u04b3Y\3\2\2\2\u04b4\u04b7"+
		"\7\13\2\2\u04b5\u04b8\5\64\33\2\u04b6\u04b8\5H%\2\u04b7\u04b5\3\2\2\2"+
		"\u04b7\u04b6\3\2\2\2\u04b7\u04b8\3\2\2\2\u04b8\u04c0\3\2\2\2\u04b9\u04bc"+
		"\7\n\2\2\u04ba\u04bd\5\64\33\2\u04bb\u04bd\5H%\2\u04bc\u04ba\3\2\2\2\u04bc"+
		"\u04bb\3\2\2\2\u04bd\u04bf\3\2\2\2\u04be\u04b9\3\2\2\2\u04bf\u04c2\3\2"+
		"\2\2\u04c0\u04be\3\2\2\2\u04c0\u04c1\3\2\2\2\u04c1\u04c3\3\2\2\2\u04c2"+
		"\u04c0\3\2\2\2\u04c3\u04c4\7\f\2\2\u04c4[\3\2\2\2\u04c5\u04c9\7K\2\2\u04c6"+
		"\u04c8\7\7\2\2\u04c7\u04c6\3\2\2\2\u04c8\u04cb\3\2\2\2\u04c9\u04c7\3\2"+
		"\2\2\u04c9\u04ca\3\2\2\2\u04ca\u04cc\3\2\2\2\u04cb\u04c9\3\2\2\2\u04cc"+
		"\u04dd\5^\60\2\u04cd\u04cf\7\7\2\2\u04ce\u04cd\3\2\2\2\u04cf\u04d2\3\2"+
		"\2\2\u04d0\u04ce\3\2\2\2\u04d0\u04d1\3\2\2\2\u04d1\u04d3\3\2\2\2\u04d2"+
		"\u04d0\3\2\2\2\u04d3\u04d7\7\n\2\2\u04d4\u04d6\7\7\2\2\u04d5\u04d4\3\2"+
		"\2\2\u04d6\u04d9\3\2\2\2\u04d7\u04d5\3\2\2\2\u04d7\u04d8\3\2\2\2\u04d8"+
		"\u04da\3\2\2\2\u04d9\u04d7\3\2\2\2\u04da\u04dc\5^\60\2\u04db\u04d0\3\2"+
		"\2\2\u04dc\u04df\3\2\2\2\u04dd\u04db\3\2\2\2\u04dd\u04de\3\2\2\2\u04de"+
		"]\3\2\2\2\u04df\u04dd\3\2\2\2\u04e0\u04e2\5\u0114\u008b\2\u04e1\u04e0"+
		"\3\2\2\2\u04e2\u04e5\3\2\2\2\u04e3\u04e1\3\2\2\2\u04e3\u04e4\3\2\2\2\u04e4"+
		"\u04e6\3\2\2\2\u04e5\u04e3\3\2\2\2\u04e6\u04ea\5\u0120\u0091\2\u04e7\u04e9"+
		"\7\7\2\2\u04e8\u04e7\3\2\2\2\u04e9\u04ec\3\2\2\2\u04ea\u04e8\3\2\2\2\u04ea"+
		"\u04eb\3\2\2\2\u04eb\u04ed\3\2\2\2\u04ec\u04ea\3\2\2\2\u04ed\u04f1\7\33"+
		"\2\2\u04ee\u04f0\7\7\2\2\u04ef\u04ee\3\2\2\2\u04f0\u04f3\3\2\2\2\u04f1"+
		"\u04ef\3\2\2\2\u04f1\u04f2\3\2\2\2\u04f2\u04f4\3\2\2\2\u04f3\u04f1\3\2"+
		"\2\2\u04f4\u04f5\5H%\2\u04f5_\3\2\2\2\u04f6\u04fa\7\17\2\2\u04f7\u04f9"+
		"\7\7\2\2\u04f8\u04f7\3\2\2\2\u04f9\u04fc\3\2\2\2\u04fa\u04f8\3\2\2\2\u04fa"+
		"\u04fb\3\2\2\2\u04fb\u0502\3\2\2\2\u04fc\u04fa\3\2\2\2\u04fd\u04fe\5d"+
		"\63\2\u04fe\u04ff\5\u0122\u0092\2\u04ff\u0501\3\2\2\2\u0500\u04fd\3\2"+
		"\2\2\u0501\u0504\3\2\2\2\u0502\u0500\3\2\2\2\u0502\u0503\3\2\2\2\u0503"+
		"\u0509\3\2\2\2\u0504\u0502\3\2\2\2\u0505\u0507\5d\63\2\u0506\u0508\5\u0122"+
		"\u0092\2\u0507\u0506\3\2\2\2\u0507\u0508\3\2\2\2\u0508\u050a\3\2\2\2\u0509"+
		"\u0505\3\2\2\2\u0509\u050a\3\2\2\2\u050a\u050e\3\2\2\2\u050b\u050d\7\7"+
		"\2\2\u050c\u050b\3\2\2\2\u050d\u0510\3\2\2\2\u050e\u050c\3\2\2\2\u050e"+
		"\u050f\3\2\2\2\u050f\u0511\3\2\2\2\u0510\u050e\3\2\2\2\u0511\u0512\7\20"+
		"\2\2\u0512a\3\2\2\2\u0513\u0514\5d\63\2\u0514\u0515\5\u0122\u0092\2\u0515"+
		"\u0517\3\2\2\2\u0516\u0513\3\2\2\2\u0517\u051a\3\2\2\2\u0518\u0516\3\2"+
		"\2\2\u0518\u0519\3\2\2\2\u0519\u051b\3\2\2\2\u051a\u0518\3\2\2\2\u051b"+
		"\u051d\5d\63\2\u051c\u051e\5\u0122\u0092\2\u051d\u051c\3\2\2\2\u051d\u051e"+
		"\3\2\2\2\u051e\u0520\3\2\2\2\u051f\u0518\3\2\2\2\u051f\u0520\3\2\2\2\u0520"+
		"c\3\2\2\2\u0521\u0525\5f\64\2\u0522\u0525\5h\65\2\u0523\u0525\5j\66\2"+
		"\u0524\u0521\3\2\2\2\u0524\u0522\3\2\2\2\u0524\u0523\3\2\2\2\u0525e\3"+
		"\2\2\2\u0526\u0528\5\u0112\u008a\2\u0527\u0526\3\2\2\2\u0528\u052b\3\2"+
		"\2\2\u0529\u0527\3\2\2\2\u0529\u052a\3\2\2\2\u052a\u0530\3\2\2\2\u052b"+
		"\u0529\3\2\2\2\u052c\u0531\5\16\b\2\u052d\u0531\5.\30\2\u052e\u0531\5"+
		"8\35\2\u052f\u0531\5B\"\2\u0530\u052c\3\2\2\2\u0530\u052d\3\2\2\2\u0530"+
		"\u052e\3\2\2\2\u0530\u052f\3\2\2\2\u0531g\3\2\2\2\u0532\u0533\5\u008e"+
		"H\2\u0533\u0537\5\u00e6t\2\u0534\u0536\7\7\2\2\u0535\u0534\3\2\2\2\u0536"+
		"\u0539\3\2\2\2\u0537\u0535\3\2\2\2\u0537\u0538\3\2\2\2\u0538\u053a\3\2"+
		"\2\2\u0539\u0537\3\2\2\2\u053a\u053b\5l\67\2\u053bi\3\2\2\2\u053c\u053d"+
		"\5l\67\2\u053dk\3\2\2\2\u053e\u054f\5n8\2\u053f\u0541\7\7\2\2\u0540\u053f"+
		"\3\2\2\2\u0541\u0544\3\2\2\2\u0542\u0540\3\2\2\2\u0542\u0543\3\2\2\2\u0543"+
		"\u0545\3\2\2\2\u0544\u0542\3\2\2\2\u0545\u0549\7\31\2\2\u0546\u0548\7"+
		"\7\2\2\u0547\u0546\3\2\2\2\u0548\u054b\3\2\2\2\u0549\u0547\3\2\2\2\u0549"+
		"\u054a\3\2\2\2\u054a\u054c\3\2\2\2\u054b\u0549\3\2\2\2\u054c\u054e\5n"+
		"8\2\u054d\u0542\3\2\2\2\u054e\u0551\3\2\2\2\u054f\u054d\3\2\2\2\u054f"+
		"\u0550\3\2\2\2\u0550m\3\2\2\2\u0551\u054f\3\2\2\2\u0552\u0563\5p9\2\u0553"+
		"\u0555\7\7\2\2\u0554\u0553\3\2\2\2\u0555\u0558\3\2\2\2\u0556\u0554\3\2"+
		"\2\2\u0556\u0557\3\2\2\2\u0557\u0559\3\2\2\2\u0558\u0556\3\2\2\2\u0559"+
		"\u055d\7\30\2\2\u055a\u055c\7\7\2\2\u055b\u055a\3\2\2\2\u055c\u055f\3"+
		"\2\2\2\u055d\u055b\3\2\2\2\u055d\u055e\3\2\2\2\u055e\u0560\3\2\2\2\u055f"+
		"\u055d\3\2\2\2\u0560\u0562\5p9\2\u0561\u0556\3\2\2\2\u0562\u0565\3\2\2"+
		"\2\u0563\u0561\3\2\2\2\u0563\u0564\3\2\2\2\u0564o\3\2\2\2\u0565\u0563"+
		"\3\2\2\2\u0566\u0572\5r:\2\u0567\u056b\5\u00e8u\2\u0568\u056a\7\7\2\2"+
		"\u0569\u0568\3\2\2\2\u056a\u056d\3\2\2\2\u056b\u0569\3\2\2\2\u056b\u056c"+
		"\3\2\2\2\u056c\u056e\3\2\2\2\u056d\u056b\3\2\2\2\u056e\u056f\5r:\2\u056f"+
		"\u0571\3\2\2\2\u0570\u0567\3\2\2\2\u0571\u0574\3\2\2\2\u0572\u0570\3\2"+
		"\2\2\u0572\u0573\3\2\2\2\u0573q\3\2\2\2\u0574\u0572\3\2\2\2\u0575\u057f"+
		"\5t;\2\u0576\u057a\5\u00eav\2\u0577\u0579\7\7\2\2\u0578\u0577\3\2\2\2"+
		"\u0579\u057c\3\2\2\2\u057a\u0578\3\2\2\2\u057a\u057b\3\2\2\2\u057b\u057d"+
		"\3\2\2\2\u057c\u057a\3\2\2\2\u057d\u057e\5t;\2\u057e\u0580\3\2\2\2\u057f"+
		"\u0576\3\2\2\2\u057f\u0580\3\2\2\2\u0580s\3\2\2\2\u0581\u058d\5v<\2\u0582"+
		"\u0586\5\u00ecw\2\u0583\u0585\7\7\2\2\u0584\u0583\3\2\2\2\u0585\u0588"+
		"\3\2\2\2\u0586\u0584\3\2\2\2\u0586\u0587\3\2\2\2\u0587\u0589\3\2\2\2\u0588"+
		"\u0586\3\2\2\2\u0589\u058a\5v<\2\u058a\u058c\3\2\2\2\u058b\u0582\3\2\2"+
		"\2\u058c\u058f\3\2\2\2\u058d\u058b\3\2\2\2\u058d\u058e\3\2\2\2\u058e\u059d"+
		"\3\2\2\2\u058f\u058d\3\2\2\2\u0590\u059a\5v<\2\u0591\u0595\5\u00eex\2"+
		"\u0592\u0594\7\7\2\2\u0593\u0592\3\2\2\2\u0594\u0597\3\2\2\2\u0595\u0593"+
		"\3\2\2\2\u0595\u0596\3\2\2\2\u0596\u0598\3\2\2\2\u0597\u0595\3\2\2\2\u0598"+
		"\u0599\5H%\2\u0599\u059b\3\2\2\2\u059a\u0591\3\2\2\2\u059a\u059b\3\2\2"+
		"\2\u059b\u059d\3\2\2\2\u059c\u0581\3\2\2\2\u059c\u0590\3\2\2\2\u059du"+
		"\3\2\2\2\u059e\u05af\5x=\2\u059f\u05a1\7\7\2\2\u05a0\u059f\3\2\2\2\u05a1"+
		"\u05a4\3\2\2\2\u05a2\u05a0\3\2\2\2\u05a2\u05a3\3\2\2\2\u05a3\u05a5\3\2"+
		"\2\2\u05a4\u05a2\3\2\2\2\u05a5\u05a9\7,\2\2\u05a6\u05a8\7\7\2\2\u05a7"+
		"\u05a6\3\2\2\2\u05a8\u05ab\3\2\2\2\u05a9\u05a7\3\2\2\2\u05a9\u05aa\3\2"+
		"\2\2\u05aa\u05ac\3\2\2\2\u05ab\u05a9\3\2\2\2\u05ac\u05ae\5x=\2\u05ad\u05a2"+
		"\3\2\2\2\u05ae\u05b1\3\2\2\2\u05af\u05ad\3\2\2\2\u05af\u05b0\3\2\2\2\u05b0"+
		"w\3\2\2\2\u05b1\u05af\3\2\2\2\u05b2\u05be\5z>\2\u05b3\u05b7\5\u0120\u0091"+
		"\2\u05b4\u05b6\7\7\2\2\u05b5\u05b4\3\2\2\2\u05b6\u05b9\3\2\2\2\u05b7\u05b5"+
		"\3\2\2\2\u05b7\u05b8\3\2\2\2\u05b8\u05ba\3\2\2\2\u05b9\u05b7\3\2\2\2\u05ba"+
		"\u05bb\5z>\2\u05bb\u05bd\3\2\2\2\u05bc\u05b3\3\2\2\2\u05bd\u05c0\3\2\2"+
		"\2\u05be\u05bc\3\2\2\2\u05be\u05bf\3\2\2\2\u05bfy\3\2\2\2\u05c0\u05be"+
		"\3\2\2\2\u05c1\u05cc\5|?\2\u05c2\u05c6\7%\2\2\u05c3\u05c5\7\7\2\2\u05c4"+
		"\u05c3\3\2\2\2\u05c5\u05c8\3\2\2\2\u05c6\u05c4\3\2\2\2\u05c6\u05c7\3\2"+
		"\2\2\u05c7\u05c9\3\2\2\2\u05c8\u05c6\3\2\2\2\u05c9\u05cb\5|?\2\u05ca\u05c2"+
		"\3\2\2\2\u05cb\u05ce\3\2\2\2\u05cc\u05ca\3\2\2\2\u05cc\u05cd\3\2\2\2\u05cd"+
		"{\3\2\2\2\u05ce\u05cc\3\2\2\2\u05cf\u05db\5~@\2\u05d0\u05d4\5\u00f0y\2"+
		"\u05d1\u05d3\7\7\2\2\u05d2\u05d1\3\2\2\2\u05d3\u05d6\3\2\2\2\u05d4\u05d2"+
		"\3\2\2\2\u05d4\u05d5\3\2\2\2\u05d5\u05d7\3\2\2\2\u05d6\u05d4\3\2\2\2\u05d7"+
		"\u05d8\5~@\2\u05d8\u05da\3\2\2\2\u05d9\u05d0\3\2\2\2\u05da\u05dd\3\2\2"+
		"\2\u05db\u05d9\3\2\2\2\u05db\u05dc\3\2\2\2\u05dc}\3\2\2\2\u05dd\u05db"+
		"\3\2\2\2\u05de\u05ea\5\u0080A\2\u05df\u05e3\5\u00f2z\2\u05e0\u05e2\7\7"+
		"\2\2\u05e1\u05e0\3\2\2\2\u05e2\u05e5\3\2\2\2\u05e3\u05e1\3\2\2\2\u05e3"+
		"\u05e4\3\2\2\2\u05e4\u05e6\3\2\2\2\u05e5\u05e3\3\2\2\2\u05e6\u05e7\5\u0080"+
		"A\2\u05e7\u05e9\3\2\2\2\u05e8\u05df\3\2\2\2\u05e9\u05ec\3\2\2\2\u05ea"+
		"\u05e8\3\2\2\2\u05ea\u05eb\3\2\2\2\u05eb\177\3\2\2\2\u05ec\u05ea\3\2\2"+
		"\2\u05ed\u05ef\5\u0084C\2\u05ee\u05f0\5\u0082B\2\u05ef\u05ee\3\2\2\2\u05ef"+
		"\u05f0\3\2\2\2\u05f0\u0081\3\2\2\2\u05f1\u05f3\7\7\2\2\u05f2\u05f1\3\2"+
		"\2\2\u05f3\u05f6\3\2\2\2\u05f4\u05f2\3\2\2\2\u05f4\u05f5\3\2\2\2\u05f5"+
		"\u05f7\3\2\2\2\u05f6\u05f4\3\2\2\2\u05f7\u05fb\5\u00f4{\2\u05f8\u05fa"+
		"\7\7\2\2\u05f9\u05f8\3\2\2\2\u05fa\u05fd\3\2\2\2\u05fb\u05f9\3\2\2\2\u05fb"+
		"\u05fc\3\2\2\2\u05fc\u05fe\3\2\2\2\u05fd\u05fb\3\2\2\2\u05fe\u0600\5H"+
		"%\2\u05ff\u0601\5\u0082B\2\u0600\u05ff\3\2\2\2\u0600\u0601\3\2\2\2\u0601"+
		"\u0083\3\2\2\2\u0602\u0604\5\u00f6|\2\u0603\u0602\3\2\2\2\u0604\u0607"+
		"\3\2\2\2\u0605\u0603\3\2\2\2\u0605\u0606\3\2\2\2\u0606\u0608\3\2\2\2\u0607"+
		"\u0605\3\2\2\2\u0608\u0611\5\u0086D\2\u0609\u060b\5\u0114\u008b\2\u060a"+
		"\u0609\3\2\2\2\u060b\u060e\3\2\2\2\u060c\u060a\3\2\2\2\u060c\u060d\3\2"+
		"\2\2\u060d\u060f\3\2\2\2\u060e\u060c\3\2\2\2\u060f\u0611\5\u0086D\2\u0610"+
		"\u0605\3\2\2\2\u0610\u060c\3\2\2\2\u0611\u0085\3\2\2\2\u0612\u0627\5\u008e"+
		"H\2\u0613\u0627\5\u0088E\2\u0614\u0627\5\u008aF\2\u0615\u0627\5\u008c"+
		"G\2\u0616\u061a\5\u008eH\2\u0617\u0619\5\u00f8}\2\u0618\u0617\3\2\2\2"+
		"\u0619\u061c\3\2\2\2\u061a\u0618\3\2\2\2\u061a\u061b\3\2\2\2\u061b\u0627"+
		"\3\2\2\2\u061c\u061a\3\2\2\2\u061d\u061e\7\13\2\2\u061e\u061f\5\u00e4"+
		"s\2\u061f\u0621\7\f\2\2\u0620\u0622\5\u00f8}\2\u0621\u0620\3\2\2\2\u0622"+
		"\u0623\3\2\2\2\u0623\u0621\3\2\2\2\u0623\u0624\3\2\2\2\u0624\u0627\3\2"+
		"\2\2\u0625\u0627\5\u00e4s\2\u0626\u0612\3\2\2\2\u0626\u0613\3\2\2\2\u0626"+
		"\u0614\3\2\2\2\u0626\u0615\3\2\2\2\u0626\u0616\3\2\2\2\u0626\u061d\3\2"+
		"\2\2\u0626\u0625\3\2\2\2\u0627\u0087\3\2\2\2\u0628\u062a\5\u008eH\2\u0629"+
		"\u062b\5\u009aN\2\u062a\u0629\3\2\2\2\u062a\u062b\3\2\2\2\u062b\u062d"+
		"\3\2\2\2\u062c\u062e\5\u0098M\2\u062d\u062c\3\2\2\2\u062d\u062e\3\2\2"+
		"\2\u062e\u0632\3\2\2\2\u062f\u0631\5\u0094K\2\u0630\u062f\3\2\2\2\u0631"+
		"\u0634\3\2\2\2\u0632\u0630\3\2\2\2\u0632\u0633\3\2\2\2\u0633\u0089\3\2"+
		"\2\2\u0634\u0632\3\2\2\2\u0635\u0636\5\u0112\u008a\2\u0636\u0637\5\u0086"+
		"D\2\u0637\u008b\3\2\2\2\u0638\u0642\5\u008eH\2\u0639\u063b\7\7\2\2\u063a"+
		"\u0639\3\2\2\2\u063b\u063e\3\2\2\2\u063c\u063a\3\2\2\2\u063c\u063d\3\2"+
		"\2\2\u063d\u063f\3\2\2\2\u063e\u063c\3\2\2\2\u063f\u0640\5\u00fa~\2\u0640"+
		"\u0641\5\u0086D\2\u0641\u0643\3\2\2\2\u0642\u063c\3\2\2\2\u0643\u0644"+
		"\3\2\2\2\u0644\u0642\3\2\2\2\u0644\u0645\3\2\2\2\u0645\u008d\3\2\2\2\u0646"+
		"\u0649\5\u00a2R\2\u0647\u0649\5\u0090I\2\u0648\u0646\3\2\2\2\u0648\u0647"+
		"\3\2\2\2\u0649\u008f\3\2\2\2\u064a\u064c\5\u011e\u0090\2\u064b\u064d\5"+
		"\u0096L\2\u064c\u064b\3\2\2\2\u064d\u064e\3\2\2\2\u064e\u064c\3\2\2\2"+
		"\u064e\u064f\3\2\2\2\u064f\u0091\3\2\2\2\u0650\u0652\5\u009aN\2\u0651"+
		"\u0650\3\2\2\2\u0651\u0652\3\2\2\2\u0652\u0653\3\2\2\2\u0653\u0657\5\u0098"+
		"M\2\u0654\u0656\5\u0094K\2\u0655\u0654\3\2\2\2\u0656\u0659\3\2\2\2\u0657"+
		"\u0655\3\2\2\2\u0657\u0658\3\2\2\2\u0658\u0662\3\2\2\2\u0659\u0657\3\2"+
		"\2\2\u065a\u065e\5\u009aN\2\u065b\u065d\5\u0094K\2\u065c\u065b\3\2\2\2"+
		"\u065d\u0660\3\2\2\2\u065e\u065c\3\2\2\2\u065e\u065f\3\2\2\2\u065f\u0662"+
		"\3\2\2\2\u0660\u065e\3\2\2\2\u0661\u0651\3\2\2\2\u0661\u065a\3\2\2\2\u0662"+
		"\u0093\3\2\2\2\u0663\u0665\5\u011c\u008f\2\u0664\u0663\3\2\2\2\u0665\u0668"+
		"\3\2\2\2\u0666\u0664\3\2\2\2\u0666\u0667\3\2\2\2\u0667\u066a\3\2\2\2\u0668"+
		"\u0666\3\2\2\2\u0669\u066b\7\u0090\2\2\u066a\u0669\3\2\2\2\u066a\u066b"+
		"\3\2\2\2\u066b\u066f\3\2\2\2\u066c\u066e\7\7\2\2\u066d\u066c\3\2\2\2\u066e"+
		"\u0671\3\2\2\2\u066f\u066d\3\2\2\2\u066f\u0670\3\2\2\2\u0670\u0672\3\2"+
		"\2\2\u0671\u066f\3\2\2\2\u0672\u0673\5\u00b6\\\2\u0673\u0095\3\2\2\2\u0674"+
		"\u067d\7\r\2\2\u0675\u067a\5j\66\2\u0676\u0677\7\n\2\2\u0677\u0679\5j"+
		"\66\2\u0678\u0676\3\2\2\2\u0679\u067c\3\2\2\2\u067a\u0678\3\2\2\2\u067a"+
		"\u067b\3\2\2\2\u067b\u067e\3\2\2\2\u067c\u067a\3\2\2\2\u067d\u0675\3\2"+
		"\2\2\u067d\u067e\3\2\2\2\u067e\u067f\3\2\2\2\u067f\u0680\7\16\2\2\u0680"+
		"\u0097\3\2\2\2\u0681\u0683\7\13\2\2\u0682\u0684\5\u00a0Q\2\u0683\u0682"+
		"\3\2\2\2\u0683\u0684\3\2\2\2\u0684\u0685\3\2\2\2\u0685\u0692\7\f\2\2\u0686"+
		"\u0687\7\13\2\2\u0687\u068c\5\u00a0Q\2\u0688\u0689\7\n\2\2\u0689\u068b"+
		"\5\u00a0Q\2\u068a\u0688\3\2\2\2\u068b\u068e\3\2\2\2\u068c\u068a\3\2\2"+
		"\2\u068c\u068d\3\2\2\2\u068d\u068f\3\2\2\2\u068e\u068c\3\2\2\2\u068f\u0690"+
		"\7\f\2\2\u0690\u0692\3\2\2\2\u0691\u0681\3\2\2\2\u0691\u0686\3\2\2\2\u0692"+
		"\u0099\3\2\2\2\u0693\u0697\7-\2\2\u0694\u0696\7\7\2\2\u0695\u0694\3\2"+
		"\2\2\u0696\u0699\3\2\2\2\u0697\u0695\3\2\2\2\u0697\u0698\3\2\2\2\u0698"+
		"\u069a\3\2\2\2\u0699\u0697\3\2\2\2\u069a\u06a5\5\u009cO\2\u069b\u069d"+
		"\7\7\2\2\u069c\u069b\3\2\2\2\u069d\u06a0\3\2\2\2\u069e\u069c\3\2\2\2\u069e"+
		"\u069f\3\2\2\2\u069f\u06a1\3\2\2\2\u06a0\u069e\3\2\2\2\u06a1\u06a2\7\n"+
		"\2\2\u06a2\u06a4\5\u009cO\2\u06a3\u069e\3\2\2\2\u06a4\u06a7\3\2\2\2\u06a5"+
		"\u06a3\3\2\2\2\u06a5\u06a6\3\2\2\2\u06a6\u06ab\3\2\2\2\u06a7\u06a5\3\2"+
		"\2\2\u06a8\u06aa\7\7\2\2\u06a9\u06a8\3\2\2\2\u06aa\u06ad\3\2\2\2\u06ab"+
		"\u06a9\3\2\2\2\u06ab\u06ac\3\2\2\2\u06ac\u06ae\3\2\2\2\u06ad\u06ab\3\2"+
		"\2\2\u06ae\u06af\7.\2\2\u06af\u009b\3\2\2\2\u06b0\u06b2\5\u009eP\2\u06b1"+
		"\u06b0\3\2\2\2\u06b1\u06b2\3\2\2\2\u06b2\u06b3\3\2\2\2\u06b3\u06b6\5H"+
		"%\2\u06b4\u06b6\7\21\2\2\u06b5\u06b1\3\2\2\2\u06b5\u06b4\3\2\2\2\u06b6"+
		"\u009d\3\2\2\2\u06b7\u06b9\5\u0106\u0084\2\u06b8\u06b7\3\2\2\2\u06b9\u06ba"+
		"\3\2\2\2\u06ba\u06b8\3\2\2\2\u06ba\u06bb\3\2\2\2\u06bb\u009f\3\2\2\2\u06bc"+
		"\u06c0\5\u0120\u0091\2\u06bd\u06bf\7\7\2\2\u06be\u06bd\3\2\2\2\u06bf\u06c2"+
		"\3\2\2\2\u06c0\u06be\3\2\2\2\u06c0\u06c1\3\2\2\2\u06c1\u06c3\3\2\2\2\u06c2"+
		"\u06c0\3\2\2\2\u06c3\u06c7\7\35\2\2\u06c4\u06c6\7\7\2\2\u06c5\u06c4\3"+
		"\2\2\2\u06c6\u06c9\3\2\2\2\u06c7\u06c5\3\2\2\2\u06c7\u06c8\3\2\2\2\u06c8"+
		"\u06cb\3\2\2\2\u06c9\u06c7\3\2\2\2\u06ca\u06bc\3\2\2\2\u06ca\u06cb\3\2"+
		"\2\2\u06cb\u06cd\3\2\2\2\u06cc\u06ce\7\21\2\2\u06cd\u06cc\3\2\2\2\u06cd"+
		"\u06ce\3\2\2\2\u06ce\u06d2\3\2\2\2\u06cf\u06d1\7\7\2\2\u06d0\u06cf\3\2"+
		"\2\2\u06d1\u06d4\3\2\2\2\u06d2\u06d0\3\2\2\2\u06d2\u06d3\3\2\2\2\u06d3"+
		"\u06d5\3\2\2\2\u06d4\u06d2\3\2\2\2\u06d5\u06d6\5j\66\2\u06d6\u00a1\3\2"+
		"\2\2\u06d7\u06e5\5\u00a4S\2\u06d8\u06e5\5\u00a6T\2\u06d9\u06e5\5\u00a8"+
		"U\2\u06da\u06e5\5\u0120\u0091\2\u06db\u06e5\5\u00b6\\\2\u06dc\u06e5\5"+
		"\u00bc_\2\u06dd\u06e5\5\u00be`\2\u06de\u06e5\5\u00c0a\2\u06df\u06e5\5"+
		"\u00c2b\2\u06e0\u06e5\5\u00c4c\2\u06e1\u06e5\5\u00d4k\2\u06e2\u06e5\5"+
		"\u00dan\2\u06e3\u06e5\5\u00e2r\2\u06e4\u06d7\3\2\2\2\u06e4\u06d8\3\2\2"+
		"\2\u06e4\u06d9\3\2\2\2\u06e4\u06da\3\2\2\2\u06e4\u06db\3\2\2\2\u06e4\u06dc"+
		"\3\2\2\2\u06e4\u06dd\3\2\2\2\u06e4\u06de\3\2\2\2\u06e4\u06df\3\2\2\2\u06e4"+
		"\u06e0\3\2\2\2\u06e4\u06e1\3\2\2\2\u06e4\u06e2\3\2\2\2\u06e4\u06e3\3\2"+
		"\2\2\u06e5\u00a3\3\2\2\2\u06e6\u06e7\7\13\2\2\u06e7\u06e8\5j\66\2\u06e8"+
		"\u06e9\7\f\2\2\u06e9\u00a5\3\2\2\2\u06ea\u06eb\t\5\2\2\u06eb\u00a7\3\2"+
		"\2\2\u06ec\u06ef\5\u00aaV\2\u06ed\u06ef\5\u00acW\2\u06ee\u06ec\3\2\2\2"+
		"\u06ee\u06ed\3\2\2\2\u06ef\u00a9\3\2\2\2\u06f0\u06f5\7\u0083\2\2\u06f1"+
		"\u06f4\5\u00aeX\2\u06f2\u06f4\5\u00b0Y\2\u06f3\u06f1\3\2\2\2\u06f3\u06f2"+
		"\3\2\2\2\u06f4\u06f7\3\2\2\2\u06f5\u06f3\3\2\2\2\u06f5\u06f6\3\2\2\2\u06f6"+
		"\u06f8\3\2\2\2\u06f7\u06f5\3\2\2\2\u06f8\u06f9\7\u009d\2\2\u06f9\u00ab"+
		"\3\2\2\2\u06fa\u0701\7\u0084\2\2\u06fb\u0700\5\u00b2Z\2\u06fc\u0700\5"+
		"\u00b4[\2\u06fd\u0700\5\u00aaV\2\u06fe\u0700\7\u00a3\2\2\u06ff\u06fb\3"+
		"\2\2\2\u06ff\u06fc\3\2\2\2\u06ff\u06fd\3\2\2\2\u06ff\u06fe\3\2\2\2\u0700"+
		"\u0703\3\2\2\2\u0701\u06ff\3\2\2\2\u0701\u0702\3\2\2\2\u0702\u0704\3\2"+
		"\2\2\u0703\u0701\3\2\2\2\u0704\u0705\7\u00a2\2\2\u0705\u00ad\3\2\2\2\u0706"+
		"\u0707\t\6\2\2\u0707\u00af\3\2\2\2\u0708\u0709\7\u00a1\2\2\u0709\u070a"+
		"\5j\66\2\u070a\u070b\7\20\2\2\u070b\u00b1\3\2\2\2\u070c\u070d\t\7\2\2"+
		"\u070d\u00b3\3\2\2\2\u070e\u070f\7\u00a7\2\2\u070f\u0710\5j\66\2\u0710"+
		"\u0711\7\20\2\2\u0711\u00b5\3\2\2\2\u0712\u0714\5\u0114\u008b\2\u0713"+
		"\u0712\3\2\2\2\u0714\u0717\3\2\2\2\u0715\u0713\3\2\2\2\u0715\u0716\3\2"+
		"\2\2\u0716\u0746\3\2\2\2\u0717\u0715\3\2\2\2\u0718\u071c\7\17\2\2\u0719"+
		"\u071b\7\7\2\2\u071a\u0719\3\2\2\2\u071b\u071e\3\2\2\2\u071c\u071a\3\2"+
		"\2\2\u071c\u071d\3\2\2\2\u071d\u071f\3\2\2\2\u071e\u071c\3\2\2\2\u071f"+
		"\u0723\5b\62\2\u0720\u0722\7\7\2\2\u0721\u0720\3\2\2\2\u0722\u0725\3\2"+
		"\2\2\u0723\u0721\3\2\2\2\u0723\u0724\3\2\2\2\u0724\u0726\3\2\2\2\u0725"+
		"\u0723\3\2\2\2\u0726\u0727\7\20\2\2\u0727\u0747\3\2\2\2\u0728\u072c\7"+
		"\17\2\2\u0729\u072b\7\7\2\2\u072a\u0729\3\2\2\2\u072b\u072e\3\2\2\2\u072c"+
		"\u072a\3\2\2\2\u072c\u072d\3\2\2\2\u072d\u072f\3\2\2\2\u072e\u072c\3\2"+
		"\2\2\u072f\u0733\5\u00b8]\2\u0730\u0732\7\7\2\2\u0731\u0730\3\2\2\2\u0732"+
		"\u0735\3\2\2\2\u0733\u0731\3\2\2\2\u0733\u0734\3\2\2\2\u0734\u0736\3\2"+
		"\2\2\u0735\u0733\3\2\2\2\u0736\u073a\7#\2\2\u0737\u0739\7\7\2\2\u0738"+
		"\u0737\3\2\2\2\u0739\u073c\3\2\2\2\u073a\u0738\3\2\2\2\u073a\u073b\3\2"+
		"\2\2\u073b\u073d\3\2\2\2\u073c\u073a\3\2\2\2\u073d\u0741\5b\62\2\u073e"+
		"\u0740\7\7\2\2\u073f\u073e\3\2\2\2\u0740\u0743\3\2\2\2\u0741\u073f\3\2"+
		"\2\2\u0741\u0742\3\2\2\2\u0742\u0744\3\2\2\2\u0743\u0741\3\2\2\2\u0744"+
		"\u0745\7\20\2\2\u0745\u0747\3\2\2\2\u0746\u0718\3\2\2\2\u0746\u0728\3"+
		"\2\2\2\u0747\u00b7\3\2\2\2\u0748\u074a\5\u00ba^\2\u0749\u0748\3\2\2\2"+
		"\u0749\u074a\3\2\2\2\u074a\u075b\3\2\2\2\u074b\u074d\7\7\2\2\u074c\u074b"+
		"\3\2\2\2\u074d\u0750\3\2\2\2\u074e\u074c\3\2\2\2\u074e\u074f\3\2\2\2\u074f"+
		"\u0751\3\2\2\2\u0750\u074e\3\2\2\2\u0751\u0755\7\n\2\2\u0752\u0754\7\7"+
		"\2\2\u0753\u0752\3\2\2\2\u0754\u0757\3\2\2\2\u0755\u0753\3\2\2\2\u0755"+
		"\u0756\3\2\2\2\u0756\u0758\3\2\2\2\u0757\u0755\3\2\2\2\u0758\u075a\5\u00ba"+
		"^\2\u0759\u074e\3\2\2\2\u075a\u075d\3\2\2\2\u075b\u0759\3\2\2\2\u075b"+
		"\u075c\3\2\2\2\u075c\u00b9\3\2\2\2\u075d\u075b\3\2\2\2\u075e\u0771\5<"+
		"\37\2\u075f\u076e\5:\36\2\u0760\u0762\7\7\2\2\u0761\u0760\3\2\2\2\u0762"+
		"\u0765\3\2\2\2\u0763\u0761\3\2\2\2\u0763\u0764\3\2\2\2\u0764\u0766\3\2"+
		"\2\2\u0765\u0763\3\2\2\2\u0766\u076a\7\33\2\2\u0767\u0769\7\7\2\2\u0768"+
		"\u0767\3\2\2\2\u0769\u076c\3\2\2\2\u076a\u0768\3\2\2\2\u076a\u076b\3\2"+
		"\2\2\u076b\u076d\3\2\2\2\u076c\u076a\3\2\2\2\u076d\u076f\5H%\2\u076e\u0763"+
		"\3\2\2\2\u076e\u076f\3\2\2\2\u076f\u0771\3\2\2\2\u0770\u075e\3\2\2\2\u0770"+
		"\u075f\3\2\2\2\u0771\u00bb\3\2\2\2\u0772\u0781\7@\2\2\u0773\u0775\7\7"+
		"\2\2\u0774\u0773\3\2\2\2\u0775\u0778\3\2\2\2\u0776\u0774\3\2\2\2\u0776"+
		"\u0777\3\2\2\2\u0777\u0779\3\2\2\2\u0778\u0776\3\2\2\2\u0779\u077d\7\33"+
		"\2\2\u077a\u077c\7\7\2\2\u077b\u077a\3\2\2\2\u077c\u077f\3\2\2\2\u077d"+
		"\u077b\3\2\2\2\u077d\u077e\3\2\2\2\u077e\u0780\3\2\2\2\u077f\u077d\3\2"+
		"\2\2\u0780\u0782\5\26\f\2\u0781\u0776\3\2\2\2\u0781\u0782\3\2\2\2\u0782"+
		"\u0786\3\2\2\2\u0783\u0785\7\7\2\2\u0784\u0783\3\2\2\2\u0785\u0788\3\2"+
		"\2\2\u0786\u0784\3\2\2\2\u0786\u0787\3\2\2\2\u0787\u0789\3\2\2\2\u0788"+
		"\u0786\3\2\2\2\u0789\u078a\5\36\20\2\u078a\u00bd\3\2\2\2\u078b\u078d\7"+
		"\r\2\2\u078c\u078e\5j\66\2\u078d\u078c\3\2\2\2\u078d\u078e\3\2\2\2\u078e"+
		"\u0793\3\2\2\2\u078f\u0790\7\n\2\2\u0790\u0792\5j\66\2\u0791\u078f\3\2"+
		"\2\2\u0792\u0795\3\2\2\2\u0793\u0791\3\2\2\2\u0793\u0794\3\2\2\2\u0794"+
		"\u0796\3\2\2\2\u0795\u0793\3\2\2\2\u0796\u0797\7\16\2\2\u0797\u00bf\3"+
		"\2\2\2\u0798\u079a\7H\2\2\u0799\u079b\7\u008f\2\2\u079a\u0799\3\2\2\2"+
		"\u079a\u079b\3\2\2\2\u079b\u00c1\3\2\2\2\u079c\u07ad\7I\2\2\u079d\u07a1"+
		"\7-\2\2\u079e\u07a0\7\7\2\2\u079f\u079e\3\2\2\2\u07a0\u07a3\3\2\2\2\u07a1"+
		"\u079f\3\2\2\2\u07a1\u07a2\3\2\2\2\u07a2\u07a4\3\2\2\2\u07a3\u07a1\3\2"+
		"\2\2\u07a4\u07a8\5H%\2\u07a5\u07a7\7\7\2\2\u07a6\u07a5\3\2\2\2\u07a7\u07aa"+
		"\3\2\2\2\u07a8\u07a6\3\2\2\2\u07a8\u07a9\3\2\2\2\u07a9\u07ab\3\2\2\2\u07aa"+
		"\u07a8\3\2\2\2\u07ab\u07ac\7.\2\2\u07ac\u07ae\3\2\2\2\u07ad\u079d\3\2"+
		"\2\2\u07ad\u07ae\3\2\2\2\u07ae\u07b0\3\2\2\2\u07af\u07b1\7\u008f\2\2\u07b0"+
		"\u07af\3\2\2\2\u07b0\u07b1\3\2\2\2\u07b1\u00c3\3\2\2\2\u07b2\u07b5\5\u00c6"+
		"d\2\u07b3\u07b5\5\u00caf\2\u07b4\u07b2\3\2\2\2\u07b4\u07b3\3\2\2\2\u07b5"+
		"\u00c5\3\2\2\2\u07b6\u07ba\7L\2\2\u07b7\u07b9\7\7\2\2\u07b8\u07b7\3\2"+
		"\2\2\u07b9\u07bc\3\2\2\2\u07ba\u07b8\3\2\2\2\u07ba\u07bb\3\2\2\2\u07bb"+
		"\u07bd\3\2\2\2\u07bc\u07ba\3\2\2\2\u07bd\u07be\7\13\2\2\u07be\u07bf\5"+
		"j\66\2\u07bf\u07c3\7\f\2\2\u07c0\u07c2\7\7\2\2\u07c1\u07c0\3\2\2\2\u07c2"+
		"\u07c5\3\2\2\2\u07c3\u07c1\3\2\2\2\u07c3\u07c4\3\2\2\2\u07c4\u07c7\3\2"+
		"\2\2\u07c5\u07c3\3\2\2\2\u07c6\u07c8\5\u00c8e\2\u07c7\u07c6\3\2\2\2\u07c7"+
		"\u07c8\3\2\2\2\u07c8\u07ca\3\2\2\2\u07c9\u07cb\7\34\2\2\u07ca\u07c9\3"+
		"\2\2\2\u07ca\u07cb\3\2\2\2\u07cb\u07dc\3\2\2\2\u07cc\u07ce\7\7\2\2\u07cd"+
		"\u07cc\3\2\2\2\u07ce\u07d1\3\2\2\2\u07cf\u07cd\3\2\2\2\u07cf\u07d0\3\2"+
		"\2\2\u07d0\u07d2\3\2\2\2\u07d1\u07cf\3\2\2\2\u07d2\u07d6\7M\2\2\u07d3"+
		"\u07d5\7\7\2\2\u07d4\u07d3\3\2\2\2\u07d5\u07d8\3\2\2\2\u07d6\u07d4\3\2"+
		"\2\2\u07d6\u07d7\3\2\2\2\u07d7\u07da\3\2\2\2\u07d8\u07d6\3\2\2\2\u07d9"+
		"\u07db\5\u00c8e\2\u07da\u07d9\3\2\2\2\u07da\u07db\3\2\2\2\u07db\u07dd"+
		"\3\2\2\2\u07dc\u07cf\3\2\2\2\u07dc\u07dd\3\2\2\2\u07dd\u00c7\3\2\2\2\u07de"+
		"\u07e1\5`\61\2\u07df\u07e1\5j\66\2\u07e0\u07de\3\2\2\2\u07e0\u07df\3\2"+
		"\2\2\u07e1\u00c9\3\2\2\2\u07e2\u07e6\7N\2\2\u07e3\u07e5\7\7\2\2\u07e4"+
		"\u07e3\3\2\2\2\u07e5\u07e8\3\2\2\2\u07e6\u07e4\3\2\2\2\u07e6\u07e7\3\2"+
		"\2\2\u07e7\u07ed\3\2\2\2\u07e8\u07e6\3\2\2\2\u07e9\u07ea\7\13\2\2\u07ea"+
		"\u07eb\5j\66\2\u07eb\u07ec\7\f\2\2\u07ec\u07ee\3\2\2\2\u07ed\u07e9\3\2"+
		"\2\2\u07ed\u07ee\3\2\2\2\u07ee\u07f2\3\2\2\2\u07ef\u07f1\7\7\2\2\u07f0"+
		"\u07ef\3\2\2\2\u07f1\u07f4\3\2\2\2\u07f2\u07f0\3\2\2\2\u07f2\u07f3\3\2"+
		"\2\2\u07f3\u07f5\3\2\2\2\u07f4\u07f2\3\2\2\2\u07f5\u07f9\7\17\2\2\u07f6"+
		"\u07f8\7\7\2\2\u07f7\u07f6\3\2\2\2\u07f8\u07fb\3\2\2\2\u07f9\u07f7\3\2"+
		"\2\2\u07f9\u07fa\3\2\2\2\u07fa\u0805\3\2\2\2\u07fb\u07f9\3\2\2\2\u07fc"+
		"\u0800\5\u00ccg\2\u07fd\u07ff\7\7\2\2\u07fe\u07fd\3\2\2\2\u07ff\u0802"+
		"\3\2\2\2\u0800\u07fe\3\2\2\2\u0800\u0801\3\2\2\2\u0801\u0804\3\2\2\2\u0802"+
		"\u0800\3\2\2\2\u0803\u07fc\3\2\2\2\u0804\u0807\3\2\2\2\u0805\u0803\3\2"+
		"\2\2\u0805\u0806\3\2\2\2\u0806\u080b\3\2\2\2\u0807\u0805\3\2\2\2\u0808"+
		"\u080a\7\7\2\2\u0809\u0808\3\2\2\2\u080a\u080d\3\2\2\2\u080b\u0809\3\2"+
		"\2\2\u080b\u080c\3\2\2\2\u080c\u080e\3\2\2\2\u080d\u080b\3\2\2\2\u080e"+
		"\u080f\7\20\2\2\u080f\u00cb\3\2\2\2\u0810\u0821\5\u00ceh\2\u0811\u0813"+
		"\7\7\2\2\u0812\u0811\3\2\2\2\u0813\u0816\3\2\2\2\u0814\u0812\3\2\2\2\u0814"+
		"\u0815\3\2\2\2\u0815\u0817\3\2\2\2\u0816\u0814\3\2\2\2\u0817\u081b\7\n"+
		"\2\2\u0818\u081a\7\7\2\2\u0819\u0818\3\2\2\2\u081a\u081d\3\2\2\2\u081b"+
		"\u0819\3\2\2\2\u081b\u081c\3\2\2\2\u081c\u081e\3\2\2\2\u081d\u081b\3\2"+
		"\2\2\u081e\u0820\5\u00ceh\2\u081f\u0814\3\2\2\2\u0820\u0823\3\2\2\2\u0821"+
		"\u081f\3\2\2\2\u0821\u0822\3\2\2\2\u0822\u0827\3\2\2\2\u0823\u0821\3\2"+
		"\2\2\u0824\u0826\7\7\2\2\u0825\u0824\3\2\2\2\u0826\u0829\3\2\2\2\u0827"+
		"\u0825\3\2\2\2\u0827\u0828\3\2\2\2\u0828\u082a\3\2\2\2\u0829\u0827\3\2"+
		"\2\2\u082a\u082e\7#\2\2\u082b\u082d\7\7\2\2\u082c\u082b\3\2\2\2\u082d"+
		"\u0830\3\2\2\2\u082e\u082c\3\2\2\2\u082e\u082f\3\2\2\2\u082f\u0831\3\2"+
		"\2\2\u0830\u082e\3\2\2\2\u0831\u0833\5\u00c8e\2\u0832\u0834\5\u0122\u0092"+
		"\2\u0833\u0832\3\2\2\2\u0833\u0834\3\2\2\2\u0834\u0845\3\2\2\2\u0835\u0839"+
		"\7M\2\2\u0836\u0838\7\7\2\2\u0837\u0836\3\2\2\2\u0838\u083b\3\2\2\2\u0839"+
		"\u0837\3\2\2\2\u0839\u083a\3\2\2\2\u083a\u083c\3\2\2\2\u083b\u0839\3\2"+
		"\2\2\u083c\u0840\7#\2\2\u083d\u083f\7\7\2\2\u083e\u083d\3\2\2\2\u083f"+
		"\u0842\3\2\2\2\u0840\u083e\3\2\2\2\u0840\u0841\3\2\2\2\u0841\u0843\3\2"+
		"\2\2\u0842\u0840\3\2\2\2\u0843\u0845\5\u00c8e\2\u0844\u0810\3\2\2\2\u0844"+
		"\u0835\3\2\2\2\u0845\u00cd\3\2\2\2\u0846\u084a\5j\66\2\u0847\u084a\5\u00d0"+
		"i\2\u0848\u084a\5\u00d2j\2\u0849\u0846\3\2\2\2\u0849\u0847\3\2\2\2\u0849"+
		"\u0848\3\2\2\2\u084a\u00cf\3\2\2\2\u084b\u084f\5\u00ecw\2\u084c\u084e"+
		"\7\7\2\2\u084d\u084c\3\2\2\2\u084e\u0851\3\2\2\2\u084f\u084d\3\2\2\2\u084f"+
		"\u0850\3\2\2\2\u0850\u0852\3\2\2\2\u0851\u084f\3\2\2\2\u0852\u0853\5j"+
		"\66\2\u0853\u00d1\3\2\2\2\u0854\u0858\5\u00eex\2\u0855\u0857\7\7\2\2\u0856"+
		"\u0855\3\2\2\2\u0857\u085a\3\2\2\2\u0858\u0856\3\2\2\2\u0858\u0859\3\2"+
		"\2\2\u0859\u085b\3\2\2\2\u085a\u0858\3\2\2\2\u085b\u085c\5H%\2\u085c\u00d3"+
		"\3\2\2\2\u085d\u0861\7O\2\2\u085e\u0860\7\7\2\2\u085f\u085e\3\2\2\2\u0860"+
		"\u0863\3\2\2\2\u0861\u085f\3\2\2\2\u0861\u0862\3\2\2\2\u0862\u0864\3\2"+
		"\2\2\u0863\u0861\3\2\2\2\u0864\u086e\5`\61\2\u0865\u0867\7\7\2\2\u0866"+
		"\u0865\3\2\2\2\u0867\u086a\3\2\2\2\u0868\u0866\3\2\2\2\u0868\u0869\3\2"+
		"\2\2\u0869\u086b\3\2\2\2\u086a\u0868\3\2\2\2\u086b\u086d\5\u00d6l\2\u086c"+
		"\u0868\3\2\2\2\u086d\u0870\3\2\2\2\u086e\u086c\3\2\2\2\u086e\u086f\3\2"+
		"\2\2\u086f\u0878\3\2\2\2\u0870\u086e\3\2\2\2\u0871\u0873\7\7\2\2\u0872"+
		"\u0871\3\2\2\2\u0873\u0876\3\2\2\2\u0874\u0872\3\2\2\2\u0874\u0875\3\2"+
		"\2\2\u0875\u0877\3\2\2\2\u0876\u0874\3\2\2\2\u0877\u0879\5\u00d8m\2\u0878"+
		"\u0874\3\2\2\2\u0878\u0879\3\2\2\2\u0879\u00d5\3\2\2\2\u087a\u087e\7P"+
		"\2\2\u087b\u087d\7\7\2\2\u087c\u087b\3\2\2\2\u087d\u0880\3\2\2\2\u087e"+
		"\u087c\3\2\2\2\u087e\u087f\3\2\2\2\u087f\u0881\3\2\2\2\u0880\u087e\3\2"+
		"\2\2\u0881\u0885\7\13\2\2\u0882\u0884\5\u0114\u008b\2\u0883\u0882\3\2"+
		"\2\2\u0884\u0887\3\2\2\2\u0885\u0883\3\2\2\2\u0885\u0886\3\2\2\2\u0886"+
		"\u0888\3\2\2\2\u0887\u0885\3\2\2\2\u0888\u0889\5\u0120\u0091\2\u0889\u088a"+
		"\7\33\2\2\u088a\u088b\5V,\2\u088b\u088f\7\f\2\2\u088c\u088e\7\7\2\2\u088d"+
		"\u088c\3\2\2\2\u088e\u0891\3\2\2\2\u088f\u088d\3\2\2\2\u088f\u0890\3\2"+
		"\2\2\u0890\u0892\3\2\2\2\u0891\u088f\3\2\2\2\u0892\u0893\5`\61\2\u0893"+
		"\u00d7\3\2\2\2\u0894\u0898\7Q\2\2\u0895\u0897\7\7\2\2\u0896\u0895\3\2"+
		"\2\2\u0897\u089a\3\2\2\2\u0898\u0896\3\2\2\2\u0898\u0899\3\2\2\2\u0899"+
		"\u089b\3\2\2\2\u089a\u0898\3\2\2\2\u089b\u089c\5`\61\2\u089c\u00d9\3\2"+
		"\2\2\u089d\u08a1\5\u00dco\2\u089e\u08a1\5\u00dep\2\u089f\u08a1\5\u00e0"+
		"q\2\u08a0\u089d\3\2\2\2\u08a0\u089e\3\2\2\2\u08a0\u089f\3\2\2\2\u08a1"+
		"\u00db\3\2\2\2\u08a2\u08a6\7R\2\2\u08a3\u08a5\7\7\2\2\u08a4\u08a3\3\2"+
		"\2\2\u08a5\u08a8\3\2\2\2\u08a6\u08a4\3\2\2\2\u08a6\u08a7\3\2\2\2\u08a7"+
		"\u08a9\3\2\2\2\u08a8\u08a6\3\2\2\2\u08a9\u08ad\7\13\2\2\u08aa\u08ac\5"+
		"\u0114\u008b\2\u08ab\u08aa\3\2\2\2\u08ac\u08af\3\2\2\2\u08ad\u08ab\3\2"+
		"\2\2\u08ad\u08ae\3\2\2\2\u08ae\u08b2\3\2\2\2\u08af\u08ad\3\2\2\2\u08b0"+
		"\u08b3\5<\37\2\u08b1\u08b3\5:\36\2\u08b2\u08b0\3\2\2\2\u08b2\u08b1\3\2"+
		"\2\2\u08b3\u08b4\3\2\2\2\u08b4\u08b5\7[\2\2\u08b5\u08b6\5j\66\2\u08b6"+
		"\u08ba\7\f\2\2\u08b7\u08b9\7\7\2\2\u08b8\u08b7\3\2\2\2\u08b9\u08bc\3\2"+
		"\2\2\u08ba\u08b8\3\2\2\2\u08ba\u08bb\3\2\2\2\u08bb\u08be\3\2\2\2\u08bc"+
		"\u08ba\3\2\2\2\u08bd\u08bf\5\u00c8e\2\u08be\u08bd\3\2\2\2\u08be\u08bf"+
		"\3\2\2\2\u08bf\u00dd\3\2\2\2\u08c0\u08c4\7T\2\2\u08c1\u08c3\7\7\2\2\u08c2"+
		"\u08c1\3\2\2\2\u08c3\u08c6\3\2\2\2\u08c4\u08c2\3\2\2\2\u08c4\u08c5\3\2"+
		"\2\2\u08c5\u08c7\3\2\2\2\u08c6\u08c4\3\2\2\2\u08c7\u08c8\7\13\2\2\u08c8"+
		"\u08c9\5j\66\2\u08c9\u08cd\7\f\2\2\u08ca\u08cc\7\7\2\2\u08cb\u08ca\3\2"+
		"\2\2\u08cc\u08cf\3\2\2\2\u08cd\u08cb\3\2\2\2\u08cd\u08ce\3\2\2\2\u08ce"+
		"\u08d1\3\2\2\2\u08cf\u08cd\3\2\2\2\u08d0\u08d2\5\u00c8e\2\u08d1\u08d0"+
		"\3\2\2\2\u08d1\u08d2\3\2\2\2\u08d2\u00df\3\2\2\2\u08d3\u08d7\7S\2\2\u08d4"+
		"\u08d6\7\7\2\2\u08d5\u08d4\3\2\2\2\u08d6\u08d9\3\2\2\2\u08d7\u08d5\3\2"+
		"\2\2\u08d7\u08d8\3\2\2\2\u08d8\u08db\3\2\2\2\u08d9\u08d7\3\2\2\2\u08da"+
		"\u08dc\5\u00c8e\2\u08db\u08da\3\2\2\2\u08db\u08dc\3\2\2\2\u08dc\u08e0"+
		"\3\2\2\2\u08dd\u08df\7\7\2\2\u08de\u08dd\3\2\2\2\u08df\u08e2\3\2\2\2\u08e0"+
		"\u08de\3\2\2\2\u08e0\u08e1\3\2\2\2\u08e1\u08e3\3\2\2\2\u08e2\u08e0\3\2"+
		"\2\2\u08e3\u08e7\7T\2\2\u08e4\u08e6\7\7\2\2\u08e5\u08e4\3\2\2\2\u08e6"+
		"\u08e9\3\2\2\2\u08e7\u08e5\3\2\2\2\u08e7\u08e8\3\2\2\2\u08e8\u08ea\3\2"+
		"\2\2\u08e9\u08e7\3\2\2\2\u08ea\u08eb\7\13\2\2\u08eb\u08ec\5j\66\2\u08ec"+
		"\u08ed\7\f\2\2\u08ed\u00e1\3\2\2\2\u08ee\u08f2\7U\2\2\u08ef\u08f1\7\7"+
		"\2\2\u08f0\u08ef\3\2\2\2\u08f1\u08f4\3\2\2\2\u08f2\u08f0\3\2\2\2\u08f2"+
		"\u08f3\3\2\2\2\u08f3\u08f5\3\2\2\2\u08f4\u08f2\3\2\2\2\u08f5\u08ff\5j"+
		"\66\2\u08f6\u08f8\t\b\2\2\u08f7\u08f9\5j\66\2\u08f8\u08f7\3\2\2\2\u08f8"+
		"\u08f9\3\2\2\2\u08f9\u08ff\3\2\2\2\u08fa\u08ff\7W\2\2\u08fb\u08ff\78\2"+
		"\2\u08fc\u08ff\7X\2\2\u08fd\u08ff\79\2\2\u08fe\u08ee\3\2\2\2\u08fe\u08f6"+
		"\3\2\2\2\u08fe\u08fa\3\2\2\2\u08fe\u08fb\3\2\2\2\u08fe\u08fc\3\2\2\2\u08fe"+
		"\u08fd\3\2\2\2\u08ff\u00e3\3\2\2\2\u0900\u090a\5V,\2\u0901\u0905\7+\2"+
		"\2\u0902\u0904\7\7\2\2\u0903\u0902\3\2\2\2\u0904\u0907\3\2\2\2\u0905\u0903"+
		"\3\2\2\2\u0905\u0906\3\2\2\2\u0906\u0909\3\2\2\2\u0907\u0905\3\2\2\2\u0908"+
		"\u0901\3\2\2\2\u0909\u090c\3\2\2\2\u090a\u0908\3\2\2\2\u090a\u090b\3\2"+
		"\2\2\u090b\u090e\3\2\2\2\u090c\u090a\3\2\2\2\u090d\u0900\3\2\2\2\u090d"+
		"\u090e\3\2\2\2\u090e\u0912\3\2\2\2\u090f\u0911\7\7\2\2\u0910\u090f\3\2"+
		"\2\2\u0911\u0914\3\2\2\2\u0912\u0910\3\2\2\2\u0912\u0913\3\2\2\2\u0913"+
		"\u0915\3\2\2\2\u0914\u0912\3\2\2\2\u0915\u0919\t\t\2\2\u0916\u0918\7\7"+
		"\2\2\u0917\u0916\3\2\2\2\u0918\u091b\3\2\2\2\u0919\u0917\3\2\2\2\u0919"+
		"\u091a\3\2\2\2\u091a\u091e\3\2\2\2\u091b\u0919\3\2\2\2\u091c\u091f\5\u011e"+
		"\u0090\2\u091d\u091f\7=\2\2\u091e\u091c\3\2\2\2\u091e\u091d\3\2\2\2\u091f"+
		"\u00e5\3\2\2\2\u0920\u0921\t\n\2\2\u0921\u00e7\3\2\2\2\u0922\u0923\t\13"+
		"\2\2\u0923\u00e9\3\2\2\2\u0924\u0925\t\f\2\2\u0925\u00eb\3\2\2\2\u0926"+
		"\u0927\t\r\2\2\u0927\u00ed\3\2\2\2\u0928\u0929\t\16\2\2\u0929\u00ef\3"+
		"\2\2\2\u092a\u092b\t\17\2\2\u092b\u00f1\3\2\2\2\u092c\u092d\t\20\2\2\u092d"+
		"\u00f3\3\2\2\2\u092e\u092f\t\21\2\2\u092f\u00f5\3\2\2\2\u0930\u0931\t"+
		"\22\2\2\u0931\u00f7\3\2\2\2\u0932\u0937\7\26\2\2\u0933\u0937\7\27\2\2"+
		"\u0934\u0935\7\32\2\2\u0935\u0937\7\32\2\2\u0936\u0932\3\2\2\2\u0936\u0933"+
		"\3\2\2\2\u0936\u0934\3\2\2\2\u0937\u00f9\3\2\2\2\u0938\u093c\7\t\2\2\u0939"+
		"\u093a\7+\2\2\u093a\u093c\7\t\2\2\u093b\u0938\3\2\2\2\u093b\u0939\3\2"+
		"\2\2\u093c\u00fb\3\2\2\2\u093d\u0940\5\u0114\u008b\2\u093e\u0940\5\u00fe"+
		"\u0080\2\u093f\u093d\3\2\2\2\u093f\u093e\3\2\2\2\u0940\u0941\3\2\2\2\u0941"+
		"\u093f\3\2\2\2\u0941\u0942\3\2\2\2\u0942\u00fd\3\2\2\2\u0943\u094d\5\u0100"+
		"\u0081\2\u0944\u094d\5\u0102\u0082\2\u0945\u094d\5\u0104\u0083\2\u0946"+
		"\u094d\5\u0106\u0084\2\u0947\u094d\5\u0108\u0085\2\u0948\u094d\5\u010a"+
		"\u0086\2\u0949\u094d\5\u010c\u0087\2\u094a\u094d\5\u010e\u0088\2\u094b"+
		"\u094d\5\u0110\u0089\2\u094c\u0943\3\2\2\2\u094c\u0944\3\2\2\2\u094c\u0945"+
		"\3\2\2\2\u094c\u0946\3\2\2\2\u094c\u0947\3\2\2\2\u094c\u0948\3\2\2\2\u094c"+
		"\u0949\3\2\2\2\u094c\u094a\3\2\2\2\u094c\u094b\3\2\2\2\u094d\u0951\3\2"+
		"\2\2\u094e\u0950\7\7\2\2\u094f\u094e\3\2\2\2\u0950\u0953\3\2\2\2\u0951"+
		"\u094f\3\2\2\2\u0951\u0952\3\2\2\2\u0952\u00ff\3\2\2\2\u0953\u0951\3\2"+
		"\2\2\u0954\u0955\t\23\2\2\u0955\u0101\3\2\2\2\u0956\u0957\t\24";
	private static final String _serializedATNSegment1 =
		"\2\2\u0957\u0103\3\2\2\2\u0958\u0959\t\25\2\2\u0959\u0105\3\2\2\2\u095a"+
		"\u095b\t\26\2\2\u095b\u0107\3\2\2\2\u095c\u095d\t\27\2\2\u095d\u0109\3"+
		"\2\2\2\u095e\u095f\7}\2\2\u095f\u010b\3\2\2\2\u0960\u0961\t\30\2\2\u0961"+
		"\u010d\3\2\2\2\u0962\u0963\t\31\2\2\u0963\u010f\3\2\2\2\u0964\u0965\7"+
		"\u0082\2\2\u0965\u0111\3\2\2\2\u0966\u096a\7\u0090\2\2\u0967\u0969\7\7"+
		"\2\2\u0968\u0967\3\2\2\2\u0969\u096c\3\2\2\2\u096a\u0968\3\2\2\2\u096a"+
		"\u096b\3\2\2\2\u096b\u0113\3\2\2\2\u096c\u096a\3\2\2\2\u096d\u0970\5\u0116"+
		"\u008c\2\u096e\u0970\5\u0118\u008d\2\u096f\u096d\3\2\2\2\u096f\u096e\3"+
		"\2\2\2\u0970\u0974\3\2\2\2\u0971\u0973\7\7\2\2\u0972\u0971\3\2\2\2\u0973"+
		"\u0976\3\2\2\2\u0974\u0972\3\2\2\2\u0974\u0975\3\2\2\2\u0975\u0115\3\2"+
		"\2\2\u0976\u0974\3\2\2\2\u0977\u097b\5\u011a\u008e\2\u0978\u097a\7\7\2"+
		"\2\u0979\u0978\3\2\2\2\u097a\u097d\3\2\2\2\u097b\u0979\3\2\2\2\u097b\u097c"+
		"\3\2\2\2\u097c\u097e\3\2\2\2\u097d\u097b\3\2\2\2\u097e\u0982\7\33\2\2"+
		"\u097f\u0981\7\7\2\2\u0980\u097f\3\2\2\2\u0981\u0984\3\2\2\2\u0982\u0980"+
		"\3\2\2\2\u0982\u0983\3\2\2\2\u0983\u0985\3\2\2\2\u0984\u0982\3\2\2\2\u0985"+
		"\u0986\5\u011c\u008f\2\u0986\u099b\3\2\2\2\u0987\u098f\7\u008f\2\2\u0988"+
		"\u098a\7\7\2\2\u0989\u0988\3\2\2\2\u098a\u098d\3\2\2\2\u098b\u0989\3\2"+
		"\2\2\u098b\u098c\3\2\2\2\u098c\u098e\3\2\2\2\u098d\u098b\3\2\2\2\u098e"+
		"\u0990\5\u009aN\2\u098f\u098b\3\2\2\2\u098f\u0990\3\2\2\2\u0990\u0998"+
		"\3\2\2\2\u0991\u0993\7\7\2\2\u0992\u0991\3\2\2\2\u0993\u0996\3\2\2\2\u0994"+
		"\u0992\3\2\2\2\u0994\u0995\3\2\2\2\u0995\u0997\3\2\2\2\u0996\u0994\3\2"+
		"\2\2\u0997\u0999\5\u0098M\2\u0998\u0994\3\2\2\2\u0998\u0999\3\2\2\2\u0999"+
		"\u099b\3\2\2\2\u099a\u0977\3\2\2\2\u099a\u0987\3\2\2\2\u099b\u0117\3\2"+
		"\2\2\u099c\u099d\5\u011a\u008e\2\u099d\u099e\7\33\2\2\u099e\u09a0\7\r"+
		"\2\2\u099f\u09a1\5\u011c\u008f\2\u09a0\u099f\3\2\2\2\u09a1\u09a2\3\2\2"+
		"\2\u09a2\u09a0\3\2\2\2\u09a2\u09a3\3\2\2\2\u09a3\u09a4\3\2\2\2\u09a4\u09a5"+
		"\7\16\2\2\u09a5\u09b0\3\2\2\2\u09a6\u09a7\7*\2\2\u09a7\u09a9\7\r\2\2\u09a8"+
		"\u09aa\5\u011c\u008f\2\u09a9\u09a8\3\2\2\2\u09aa\u09ab\3\2\2\2\u09ab\u09a9"+
		"\3\2\2\2\u09ab\u09ac\3\2\2\2\u09ac\u09ad\3\2\2\2\u09ad\u09ae\7\16\2\2"+
		"\u09ae\u09b0\3\2\2\2\u09af\u099c\3\2\2\2\u09af\u09a6\3\2\2\2\u09b0\u0119"+
		"\3\2\2\2\u09b1\u09b2\t\32\2\2\u09b2\u011b\3\2\2\2\u09b3\u09b5\5\u011e"+
		"\u0090\2\u09b4\u09b6\5\u009aN\2\u09b5\u09b4\3\2\2\2\u09b5\u09b6\3\2\2"+
		"\2\u09b6\u09b8\3\2\2\2\u09b7\u09b9\5\u0098M\2\u09b8\u09b7\3\2\2\2\u09b8"+
		"\u09b9\3\2\2\2\u09b9\u011d\3\2\2\2\u09ba\u09c5\5\u0120\u0091\2\u09bb\u09bd"+
		"\7\7\2\2\u09bc\u09bb\3\2\2\2\u09bd\u09c0\3\2\2\2\u09be\u09bc\3\2\2\2\u09be"+
		"\u09bf\3\2\2\2\u09bf\u09c1\3\2\2\2\u09c0\u09be\3\2\2\2\u09c1\u09c2\7\t"+
		"\2\2\u09c2\u09c4\5\u0120\u0091\2\u09c3\u09be\3\2\2\2\u09c4\u09c7\3\2\2"+
		"\2\u09c5\u09c3\3\2\2\2\u09c5\u09c6\3\2\2\2\u09c6\u011f\3\2\2\2\u09c7\u09c5"+
		"\3\2\2\2\u09c8\u09c9\t\33\2\2\u09c9\u0121\3\2\2\2\u09ca\u09cc\7\7\2\2"+
		"\u09cb\u09ca\3\2\2\2\u09cc\u09cd\3\2\2\2\u09cd\u09cb\3\2\2\2\u09cd\u09ce"+
		"\3\2\2\2\u09ce\u09d7\3\2\2\2\u09cf\u09d7\7\34\2\2\u09d0\u09d2\7\34\2\2"+
		"\u09d1\u09d3\7\7\2\2\u09d2\u09d1\3\2\2\2\u09d3\u09d4\3\2\2\2\u09d4\u09d2"+
		"\3\2\2\2\u09d4\u09d5\3\2\2\2\u09d5\u09d7\3\2\2\2\u09d6\u09cb\3\2\2\2\u09d6"+
		"\u09cf\3\2\2\2\u09d6\u09d0\3\2\2\2\u09d7\u0123\3\2\2\2\u017b\u0127\u012f"+
		"\u0137\u0139\u013e\u0146\u0149\u0152\u0155\u0158\u015e\u0165\u0169\u016e"+
		"\u0172\u0177\u017e\u0182\u0187\u018b\u0190\u0197\u019b\u019e\u01a4\u01a7"+
		"\u01b1\u01b4\u01b9\u01bc\u01c3\u01c8\u01cf\u01d6\u01dc\u01e2\u01eb\u01f2"+
		"\u01fb\u0201\u0207\u0212\u0215\u021b\u0221\u0227\u022e\u0235\u0239\u023e"+
		"\u0247\u024f\u0253\u0259\u025d\u0262\u0269\u026f\u0272\u0277\u0280\u0285"+
		"\u0288\u028e\u0292\u0297\u029b\u02a0\u02a4\u02a7\u02ad\u02b4\u02b9\u02be"+
		"\u02c2\u02c7\u02cb\u02d0\u02d7\u02de\u02e2\u02e7\u02eb\u02f0\u02f4\u02fc"+
		"\u02ff\u0304\u0309\u0314\u0318\u031b\u0321\u0325\u032a\u0331\u0336\u033b"+
		"\u0340\u0345\u0349\u034e\u0355\u0359\u035c\u035f\u0364\u0368\u036b\u0370"+
		"\u0374\u0376\u037e\u0386\u0389\u038d\u0393\u039b\u03a2\u03a6\u03ab\u03b3"+
		"\u03b7\u03b9\u03bc\u03c0\u03c6\u03cc\u03ce\u03d3\u03d9\u03de\u03e1\u03e7"+
		"\u03ee\u03f2\u03f7\u03fe\u0407\u040e\u0415\u041b\u0421\u0427\u042c\u0433"+
		"\u043a\u043e\u0441\u0447\u044e\u0451\u0453\u045b\u0460\u0466\u046e\u0474"+
		"\u047b\u047e\u0484\u048b\u048f\u0494\u049a\u04a1\u04a7\u04ae\u04b2\u04b7"+
		"\u04bc\u04c0\u04c9\u04d0\u04d7\u04dd\u04e3\u04ea\u04f1\u04fa\u0502\u0507"+
		"\u0509\u050e\u0518\u051d\u051f\u0524\u0529\u0530\u0537\u0542\u0549\u054f"+
		"\u0556\u055d\u0563\u056b\u0572\u057a\u057f\u0586\u058d\u0595\u059a\u059c"+
		"\u05a2\u05a9\u05af\u05b7\u05be\u05c6\u05cc\u05d4\u05db\u05e3\u05ea\u05ef"+
		"\u05f4\u05fb\u0600\u0605\u060c\u0610\u061a\u0623\u0626\u062a\u062d\u0632"+
		"\u063c\u0644\u0648\u064e\u0651\u0657\u065e\u0661\u0666\u066a\u066f\u067a"+
		"\u067d\u0683\u068c\u0691\u0697\u069e\u06a5\u06ab\u06b1\u06b5\u06ba\u06c0"+
		"\u06c7\u06ca\u06cd\u06d2\u06e4\u06ee\u06f3\u06f5\u06ff\u0701\u0715\u071c"+
		"\u0723\u072c\u0733\u073a\u0741\u0746\u0749\u074e\u0755\u075b\u0763\u076a"+
		"\u076e\u0770\u0776\u077d\u0781\u0786\u078d\u0793\u079a\u07a1\u07a8\u07ad"+
		"\u07b0\u07b4\u07ba\u07c3\u07c7\u07ca\u07cf\u07d6\u07da\u07dc\u07e0\u07e6"+
		"\u07ed\u07f2\u07f9\u0800\u0805\u080b\u0814\u081b\u0821\u0827\u082e\u0833"+
		"\u0839\u0840\u0844\u0849\u084f\u0858\u0861\u0868\u086e\u0874\u0878\u087e"+
		"\u0885\u088f\u0898\u08a0\u08a6\u08ad\u08b2\u08ba\u08be\u08c4\u08cd\u08d1"+
		"\u08d7\u08db\u08e0\u08e7\u08f2\u08f8\u08fe\u0905\u090a\u090d\u0912\u0919"+
		"\u091e\u0936\u093b\u093f\u0941\u094c\u0951\u096a\u096f\u0974\u097b\u0982"+
		"\u098b\u098f\u0994\u0998\u099a\u09a2\u09ab\u09af\u09b5\u09b8\u09be\u09c5"+
		"\u09cd\u09d4\u09d6";
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