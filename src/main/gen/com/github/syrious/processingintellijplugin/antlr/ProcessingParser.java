// Generated from /home/dbrinkmann/Privat/Repo/Java/Processing-Intellij-Plugin/src/main/java/com/github/syrious/processingintellijplugin/antlr/Processing.g4 by ANTLR 4.10.1
package com.github.syrious.processingintellijplugin.antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ProcessingParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, HexColorLiteral=2, WS=3, COMMENT=4, LINE_COMMENT=5, CHAR_LITERAL=6, 
		ABSTRACT=7, ASSERT=8, BOOLEAN=9, BREAK=10, BYTE=11, CASE=12, CATCH=13, 
		CHAR=14, CLASS=15, CONST=16, CONTINUE=17, DEFAULT=18, DO=19, DOUBLE=20, 
		ELSE=21, ENUM=22, EXTENDS=23, FINAL=24, FINALLY=25, FLOAT=26, FOR=27, 
		IF=28, GOTO=29, IMPLEMENTS=30, IMPORT=31, INSTANCEOF=32, INT=33, INTERFACE=34, 
		LONG=35, NATIVE=36, NEW=37, PACKAGE=38, PRIVATE=39, PROTECTED=40, PUBLIC=41, 
		RETURN=42, SHORT=43, STATIC=44, STRICTFP=45, SUPER=46, SWITCH=47, SYNCHRONIZED=48, 
		THIS=49, THROW=50, THROWS=51, TRANSIENT=52, TRY=53, VAR=54, VOID=55, VOLATILE=56, 
		WHILE=57, DECIMAL_LITERAL=58, HEX_LITERAL=59, OCT_LITERAL=60, BINARY_LITERAL=61, 
		FLOAT_LITERAL=62, HEX_FLOAT_LITERAL=63, BOOL_LITERAL=64, STRING_LITERAL=65, 
		MULTI_STRING_LIT=66, NULL_LITERAL=67, LPAREN=68, RPAREN=69, LBRACE=70, 
		RBRACE=71, LBRACK=72, RBRACK=73, SEMI=74, COMMA=75, DOT=76, ASSIGN=77, 
		GT=78, LT=79, BANG=80, TILDE=81, QUESTION=82, COLON=83, EQUAL=84, LE=85, 
		GE=86, NOTEQUAL=87, AND=88, OR=89, INC=90, DEC=91, ADD=92, SUB=93, MUL=94, 
		DIV=95, BITAND=96, BITOR=97, CARET=98, MOD=99, ADD_ASSIGN=100, SUB_ASSIGN=101, 
		MUL_ASSIGN=102, DIV_ASSIGN=103, AND_ASSIGN=104, OR_ASSIGN=105, XOR_ASSIGN=106, 
		MOD_ASSIGN=107, LSHIFT_ASSIGN=108, RSHIFT_ASSIGN=109, URSHIFT_ASSIGN=110, 
		ARROW=111, COLONCOLON=112, AT=113, ELLIPSIS=114, IDENTIFIER=115;
	public static final int
		RULE_processingSketch = 0, RULE_javaProcessingSketch = 1, RULE_staticProcessingSketch = 2, 
		RULE_activeProcessingSketch = 3, RULE_warnMixedModes = 4, RULE_variableDeclaratorId = 5, 
		RULE_warnTypeAsVariableName = 6, RULE_methodCall = 7, RULE_functionWithPrimitiveTypeName = 8, 
		RULE_primitiveType = 9, RULE_colorPrimitiveType = 10, RULE_qualifiedName = 11, 
		RULE_literal = 12, RULE_hexColorLiteral = 13, RULE_compilationUnit = 14, 
		RULE_packageDeclaration = 15, RULE_importDeclaration = 16, RULE_typeDeclaration = 17, 
		RULE_modifier = 18, RULE_classOrInterfaceModifier = 19, RULE_variableModifier = 20, 
		RULE_classDeclaration = 21, RULE_typeParameters = 22, RULE_typeParameter = 23, 
		RULE_typeBound = 24, RULE_enumDeclaration = 25, RULE_enumConstants = 26, 
		RULE_enumConstant = 27, RULE_enumBodyDeclarations = 28, RULE_interfaceDeclaration = 29, 
		RULE_classBody = 30, RULE_interfaceBody = 31, RULE_classBodyDeclaration = 32, 
		RULE_memberDeclaration = 33, RULE_methodDeclaration = 34, RULE_methodBody = 35, 
		RULE_typeTypeOrVoid = 36, RULE_genericMethodDeclaration = 37, RULE_genericConstructorDeclaration = 38, 
		RULE_constructorDeclaration = 39, RULE_fieldDeclaration = 40, RULE_interfaceBodyDeclaration = 41, 
		RULE_interfaceMemberDeclaration = 42, RULE_constDeclaration = 43, RULE_constantDeclarator = 44, 
		RULE_interfaceMethodDeclaration = 45, RULE_interfaceMethodModifier = 46, 
		RULE_genericInterfaceMethodDeclaration = 47, RULE_variableDeclarators = 48, 
		RULE_variableDeclarator = 49, RULE_variableInitializer = 50, RULE_arrayInitializer = 51, 
		RULE_classOrInterfaceType = 52, RULE_typeArgument = 53, RULE_qualifiedNameList = 54, 
		RULE_formalParameters = 55, RULE_formalParameterList = 56, RULE_formalParameter = 57, 
		RULE_lastFormalParameter = 58, RULE_baseStringLiteral = 59, RULE_multilineStringLiteral = 60, 
		RULE_stringLiteral = 61, RULE_integerLiteral = 62, RULE_floatLiteral = 63, 
		RULE_annotation = 64, RULE_elementValuePairs = 65, RULE_elementValuePair = 66, 
		RULE_elementValue = 67, RULE_elementValueArrayInitializer = 68, RULE_annotationTypeDeclaration = 69, 
		RULE_annotationTypeBody = 70, RULE_annotationTypeElementDeclaration = 71, 
		RULE_annotationTypeElementRest = 72, RULE_annotationMethodOrConstantRest = 73, 
		RULE_annotationMethodRest = 74, RULE_annotationConstantRest = 75, RULE_defaultValue = 76, 
		RULE_block = 77, RULE_blockStatement = 78, RULE_localVariableDeclaration = 79, 
		RULE_localTypeDeclaration = 80, RULE_statement = 81, RULE_catchClause = 82, 
		RULE_catchType = 83, RULE_finallyBlock = 84, RULE_resourceSpecification = 85, 
		RULE_resources = 86, RULE_resource = 87, RULE_switchBlockStatementGroup = 88, 
		RULE_switchLabel = 89, RULE_forControl = 90, RULE_forInit = 91, RULE_enhancedForControl = 92, 
		RULE_parExpression = 93, RULE_expressionList = 94, RULE_expression = 95, 
		RULE_lambdaExpression = 96, RULE_lambdaParameters = 97, RULE_lambdaBody = 98, 
		RULE_primary = 99, RULE_classType = 100, RULE_creator = 101, RULE_createdName = 102, 
		RULE_innerCreator = 103, RULE_arrayCreatorRest = 104, RULE_classCreatorRest = 105, 
		RULE_explicitGenericInvocation = 106, RULE_typeArgumentsOrDiamond = 107, 
		RULE_nonWildcardTypeArgumentsOrDiamond = 108, RULE_nonWildcardTypeArguments = 109, 
		RULE_typeList = 110, RULE_typeType = 111, RULE_typeArguments = 112, RULE_superSuffix = 113, 
		RULE_explicitGenericInvocationSuffix = 114, RULE_arguments = 115;
	private static String[] makeRuleNames() {
		return new String[] {
			"processingSketch", "javaProcessingSketch", "staticProcessingSketch", 
			"activeProcessingSketch", "warnMixedModes", "variableDeclaratorId", "warnTypeAsVariableName", 
			"methodCall", "functionWithPrimitiveTypeName", "primitiveType", "colorPrimitiveType", 
			"qualifiedName", "literal", "hexColorLiteral", "compilationUnit", "packageDeclaration", 
			"importDeclaration", "typeDeclaration", "modifier", "classOrInterfaceModifier", 
			"variableModifier", "classDeclaration", "typeParameters", "typeParameter", 
			"typeBound", "enumDeclaration", "enumConstants", "enumConstant", "enumBodyDeclarations", 
			"interfaceDeclaration", "classBody", "interfaceBody", "classBodyDeclaration", 
			"memberDeclaration", "methodDeclaration", "methodBody", "typeTypeOrVoid", 
			"genericMethodDeclaration", "genericConstructorDeclaration", "constructorDeclaration", 
			"fieldDeclaration", "interfaceBodyDeclaration", "interfaceMemberDeclaration", 
			"constDeclaration", "constantDeclarator", "interfaceMethodDeclaration", 
			"interfaceMethodModifier", "genericInterfaceMethodDeclaration", "variableDeclarators", 
			"variableDeclarator", "variableInitializer", "arrayInitializer", "classOrInterfaceType", 
			"typeArgument", "qualifiedNameList", "formalParameters", "formalParameterList", 
			"formalParameter", "lastFormalParameter", "baseStringLiteral", "multilineStringLiteral", 
			"stringLiteral", "integerLiteral", "floatLiteral", "annotation", "elementValuePairs", 
			"elementValuePair", "elementValue", "elementValueArrayInitializer", "annotationTypeDeclaration", 
			"annotationTypeBody", "annotationTypeElementDeclaration", "annotationTypeElementRest", 
			"annotationMethodOrConstantRest", "annotationMethodRest", "annotationConstantRest", 
			"defaultValue", "block", "blockStatement", "localVariableDeclaration", 
			"localTypeDeclaration", "statement", "catchClause", "catchType", "finallyBlock", 
			"resourceSpecification", "resources", "resource", "switchBlockStatementGroup", 
			"switchLabel", "forControl", "forInit", "enhancedForControl", "parExpression", 
			"expressionList", "expression", "lambdaExpression", "lambdaParameters", 
			"lambdaBody", "primary", "classType", "creator", "createdName", "innerCreator", 
			"arrayCreatorRest", "classCreatorRest", "explicitGenericInvocation", 
			"typeArgumentsOrDiamond", "nonWildcardTypeArgumentsOrDiamond", "nonWildcardTypeArguments", 
			"typeList", "typeType", "typeArguments", "superSuffix", "explicitGenericInvocationSuffix", 
			"arguments"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'color'", null, null, null, null, null, "'abstract'", "'assert'", 
			"'boolean'", "'break'", "'byte'", "'case'", "'catch'", "'char'", "'class'", 
			"'const'", "'continue'", "'default'", "'do'", "'double'", "'else'", "'enum'", 
			"'extends'", "'final'", "'finally'", "'float'", "'for'", "'if'", "'goto'", 
			"'implements'", "'import'", "'instanceof'", "'int'", "'interface'", "'long'", 
			"'native'", "'new'", "'package'", "'private'", "'protected'", "'public'", 
			"'return'", "'short'", "'static'", "'strictfp'", "'super'", "'switch'", 
			"'synchronized'", "'this'", "'throw'", "'throws'", "'transient'", "'try'", 
			"'var'", "'void'", "'volatile'", "'while'", null, null, null, null, null, 
			null, null, null, null, "'null'", "'('", "')'", "'{'", "'}'", "'['", 
			"']'", "';'", "','", "'.'", "'='", "'>'", "'<'", "'!'", "'~'", "'?'", 
			"':'", "'=='", "'<='", "'>='", "'!='", "'&&'", "'||'", "'++'", "'--'", 
			"'+'", "'-'", "'*'", "'/'", "'&'", "'|'", "'^'", "'%'", "'+='", "'-='", 
			"'*='", "'/='", "'&='", "'|='", "'^='", "'%='", "'<<='", "'>>='", "'>>>='", 
			"'->'", "'::'", "'@'", "'...'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "HexColorLiteral", "WS", "COMMENT", "LINE_COMMENT", "CHAR_LITERAL", 
			"ABSTRACT", "ASSERT", "BOOLEAN", "BREAK", "BYTE", "CASE", "CATCH", "CHAR", 
			"CLASS", "CONST", "CONTINUE", "DEFAULT", "DO", "DOUBLE", "ELSE", "ENUM", 
			"EXTENDS", "FINAL", "FINALLY", "FLOAT", "FOR", "IF", "GOTO", "IMPLEMENTS", 
			"IMPORT", "INSTANCEOF", "INT", "INTERFACE", "LONG", "NATIVE", "NEW", 
			"PACKAGE", "PRIVATE", "PROTECTED", "PUBLIC", "RETURN", "SHORT", "STATIC", 
			"STRICTFP", "SUPER", "SWITCH", "SYNCHRONIZED", "THIS", "THROW", "THROWS", 
			"TRANSIENT", "TRY", "VAR", "VOID", "VOLATILE", "WHILE", "DECIMAL_LITERAL", 
			"HEX_LITERAL", "OCT_LITERAL", "BINARY_LITERAL", "FLOAT_LITERAL", "HEX_FLOAT_LITERAL", 
			"BOOL_LITERAL", "STRING_LITERAL", "MULTI_STRING_LIT", "NULL_LITERAL", 
			"LPAREN", "RPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK", "SEMI", "COMMA", 
			"DOT", "ASSIGN", "GT", "LT", "BANG", "TILDE", "QUESTION", "COLON", "EQUAL", 
			"LE", "GE", "NOTEQUAL", "AND", "OR", "INC", "DEC", "ADD", "SUB", "MUL", 
			"DIV", "BITAND", "BITOR", "CARET", "MOD", "ADD_ASSIGN", "SUB_ASSIGN", 
			"MUL_ASSIGN", "DIV_ASSIGN", "AND_ASSIGN", "OR_ASSIGN", "XOR_ASSIGN", 
			"MOD_ASSIGN", "LSHIFT_ASSIGN", "RSHIFT_ASSIGN", "URSHIFT_ASSIGN", "ARROW", 
			"COLONCOLON", "AT", "ELLIPSIS", "IDENTIFIER"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
	public String getGrammarFileName() { return "Processing.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ProcessingParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProcessingSketchContext extends ParserRuleContext {
		public JavaProcessingSketchContext javaProcessingSketch() {
			return getRuleContext(JavaProcessingSketchContext.class,0);
		}
		public StaticProcessingSketchContext staticProcessingSketch() {
			return getRuleContext(StaticProcessingSketchContext.class,0);
		}
		public ActiveProcessingSketchContext activeProcessingSketch() {
			return getRuleContext(ActiveProcessingSketchContext.class,0);
		}
		public WarnMixedModesContext warnMixedModes() {
			return getRuleContext(WarnMixedModesContext.class,0);
		}
		public ProcessingSketchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_processingSketch; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).enterProcessingSketch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).exitProcessingSketch(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProcessingVisitor ) return ((ProcessingVisitor<? extends T>)visitor).visitProcessingSketch(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProcessingSketchContext processingSketch() throws RecognitionException {
		ProcessingSketchContext _localctx = new ProcessingSketchContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_processingSketch);
		try {
			setState(236);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(232);
				javaProcessingSketch();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(233);
				staticProcessingSketch();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(234);
				activeProcessingSketch();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(235);
				warnMixedModes();
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

	public static class JavaProcessingSketchContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(ProcessingParser.EOF, 0); }
		public PackageDeclarationContext packageDeclaration() {
			return getRuleContext(PackageDeclarationContext.class,0);
		}
		public List<ImportDeclarationContext> importDeclaration() {
			return getRuleContexts(ImportDeclarationContext.class);
		}
		public ImportDeclarationContext importDeclaration(int i) {
			return getRuleContext(ImportDeclarationContext.class,i);
		}
		public List<TypeDeclarationContext> typeDeclaration() {
			return getRuleContexts(TypeDeclarationContext.class);
		}
		public TypeDeclarationContext typeDeclaration(int i) {
			return getRuleContext(TypeDeclarationContext.class,i);
		}
		public JavaProcessingSketchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_javaProcessingSketch; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).enterJavaProcessingSketch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).exitJavaProcessingSketch(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProcessingVisitor ) return ((ProcessingVisitor<? extends T>)visitor).visitJavaProcessingSketch(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JavaProcessingSketchContext javaProcessingSketch() throws RecognitionException {
		JavaProcessingSketchContext _localctx = new JavaProcessingSketchContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_javaProcessingSketch);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(238);
				packageDeclaration();
				}
				break;
			}
			setState(244);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(241);
				importDeclaration();
				}
				}
				setState(246);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(248); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(247);
				typeDeclaration();
				}
				}
				setState(250); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << CLASS) | (1L << ENUM) | (1L << FINAL) | (1L << INTERFACE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0) || _la==SEMI || _la==AT );
			setState(252);
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

	public static class StaticProcessingSketchContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(ProcessingParser.EOF, 0); }
		public List<ImportDeclarationContext> importDeclaration() {
			return getRuleContexts(ImportDeclarationContext.class);
		}
		public ImportDeclarationContext importDeclaration(int i) {
			return getRuleContext(ImportDeclarationContext.class,i);
		}
		public List<BlockStatementContext> blockStatement() {
			return getRuleContexts(BlockStatementContext.class);
		}
		public BlockStatementContext blockStatement(int i) {
			return getRuleContext(BlockStatementContext.class,i);
		}
		public StaticProcessingSketchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_staticProcessingSketch; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).enterStaticProcessingSketch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).exitStaticProcessingSketch(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProcessingVisitor ) return ((ProcessingVisitor<? extends T>)visitor).visitStaticProcessingSketch(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StaticProcessingSketchContext staticProcessingSketch() throws RecognitionException {
		StaticProcessingSketchContext _localctx = new StaticProcessingSketchContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_staticProcessingSketch);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << HexColorLiteral) | (1L << CHAR_LITERAL) | (1L << ABSTRACT) | (1L << ASSERT) | (1L << BOOLEAN) | (1L << BREAK) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << CONTINUE) | (1L << DO) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << FOR) | (1L << IF) | (1L << IMPORT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NEW) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << RETURN) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SUPER) | (1L << SWITCH) | (1L << SYNCHRONIZED) | (1L << THIS) | (1L << THROW) | (1L << TRY) | (1L << VAR) | (1L << VOID) | (1L << WHILE) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (BOOL_LITERAL - 64)) | (1L << (STRING_LITERAL - 64)) | (1L << (MULTI_STRING_LIT - 64)) | (1L << (NULL_LITERAL - 64)) | (1L << (LPAREN - 64)) | (1L << (LBRACE - 64)) | (1L << (SEMI - 64)) | (1L << (LT - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (AT - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
				{
				setState(256);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IMPORT:
					{
					setState(254);
					importDeclaration();
					}
					break;
				case T__0:
				case HexColorLiteral:
				case CHAR_LITERAL:
				case ABSTRACT:
				case ASSERT:
				case BOOLEAN:
				case BREAK:
				case BYTE:
				case CHAR:
				case CLASS:
				case CONTINUE:
				case DO:
				case DOUBLE:
				case FINAL:
				case FLOAT:
				case FOR:
				case IF:
				case INT:
				case INTERFACE:
				case LONG:
				case NEW:
				case PRIVATE:
				case PROTECTED:
				case PUBLIC:
				case RETURN:
				case SHORT:
				case STATIC:
				case STRICTFP:
				case SUPER:
				case SWITCH:
				case SYNCHRONIZED:
				case THIS:
				case THROW:
				case TRY:
				case VAR:
				case VOID:
				case WHILE:
				case DECIMAL_LITERAL:
				case HEX_LITERAL:
				case OCT_LITERAL:
				case BINARY_LITERAL:
				case FLOAT_LITERAL:
				case HEX_FLOAT_LITERAL:
				case BOOL_LITERAL:
				case STRING_LITERAL:
				case MULTI_STRING_LIT:
				case NULL_LITERAL:
				case LPAREN:
				case LBRACE:
				case SEMI:
				case LT:
				case BANG:
				case TILDE:
				case INC:
				case DEC:
				case ADD:
				case SUB:
				case AT:
				case IDENTIFIER:
					{
					setState(255);
					blockStatement();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(260);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(261);
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

	public static class ActiveProcessingSketchContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(ProcessingParser.EOF, 0); }
		public List<ImportDeclarationContext> importDeclaration() {
			return getRuleContexts(ImportDeclarationContext.class);
		}
		public ImportDeclarationContext importDeclaration(int i) {
			return getRuleContext(ImportDeclarationContext.class,i);
		}
		public List<ClassBodyDeclarationContext> classBodyDeclaration() {
			return getRuleContexts(ClassBodyDeclarationContext.class);
		}
		public ClassBodyDeclarationContext classBodyDeclaration(int i) {
			return getRuleContext(ClassBodyDeclarationContext.class,i);
		}
		public ActiveProcessingSketchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_activeProcessingSketch; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).enterActiveProcessingSketch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).exitActiveProcessingSketch(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProcessingVisitor ) return ((ProcessingVisitor<? extends T>)visitor).visitActiveProcessingSketch(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ActiveProcessingSketchContext activeProcessingSketch() throws RecognitionException {
		ActiveProcessingSketchContext _localctx = new ActiveProcessingSketchContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_activeProcessingSketch);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << IMPORT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VAR) | (1L << VOID) | (1L << VOLATILE))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (LBRACE - 70)) | (1L << (SEMI - 70)) | (1L << (LT - 70)) | (1L << (AT - 70)) | (1L << (IDENTIFIER - 70)))) != 0)) {
				{
				setState(265);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(263);
					importDeclaration();
					}
					break;
				case 2:
					{
					setState(264);
					classBodyDeclaration();
					}
					break;
				}
				}
				setState(269);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(270);
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

	public static class WarnMixedModesContext extends ParserRuleContext {
		public List<BlockStatementContext> blockStatement() {
			return getRuleContexts(BlockStatementContext.class);
		}
		public BlockStatementContext blockStatement(int i) {
			return getRuleContext(BlockStatementContext.class,i);
		}
		public List<ClassBodyDeclarationContext> classBodyDeclaration() {
			return getRuleContexts(ClassBodyDeclarationContext.class);
		}
		public ClassBodyDeclarationContext classBodyDeclaration(int i) {
			return getRuleContext(ClassBodyDeclarationContext.class,i);
		}
		public List<ImportDeclarationContext> importDeclaration() {
			return getRuleContexts(ImportDeclarationContext.class);
		}
		public ImportDeclarationContext importDeclaration(int i) {
			return getRuleContext(ImportDeclarationContext.class,i);
		}
		public WarnMixedModesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_warnMixedModes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).enterWarnMixedModes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).exitWarnMixedModes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProcessingVisitor ) return ((ProcessingVisitor<? extends T>)visitor).visitWarnMixedModes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WarnMixedModesContext warnMixedModes() throws RecognitionException {
		WarnMixedModesContext _localctx = new WarnMixedModesContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_warnMixedModes);
		int _la;
		try {
			int _alt;
			setState(308);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(277);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						setState(275);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
						case 1:
							{
							setState(272);
							importDeclaration();
							}
							break;
						case 2:
							{
							setState(273);
							classBodyDeclaration();
							}
							break;
						case 3:
							{
							setState(274);
							blockStatement();
							}
							break;
						}
						} 
					}
					setState(279);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				}
				setState(280);
				blockStatement();
				setState(281);
				classBodyDeclaration();
				setState(287);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << HexColorLiteral) | (1L << CHAR_LITERAL) | (1L << ABSTRACT) | (1L << ASSERT) | (1L << BOOLEAN) | (1L << BREAK) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << CONTINUE) | (1L << DO) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << FOR) | (1L << IF) | (1L << IMPORT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NATIVE) | (1L << NEW) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << RETURN) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SUPER) | (1L << SWITCH) | (1L << SYNCHRONIZED) | (1L << THIS) | (1L << THROW) | (1L << TRANSIENT) | (1L << TRY) | (1L << VAR) | (1L << VOID) | (1L << VOLATILE) | (1L << WHILE) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (BOOL_LITERAL - 64)) | (1L << (STRING_LITERAL - 64)) | (1L << (MULTI_STRING_LIT - 64)) | (1L << (NULL_LITERAL - 64)) | (1L << (LPAREN - 64)) | (1L << (LBRACE - 64)) | (1L << (SEMI - 64)) | (1L << (LT - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (AT - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
					{
					setState(285);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						setState(282);
						importDeclaration();
						}
						break;
					case 2:
						{
						setState(283);
						classBodyDeclaration();
						}
						break;
					case 3:
						{
						setState(284);
						blockStatement();
						}
						break;
					}
					}
					setState(289);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(295);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						setState(293);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
						case 1:
							{
							setState(290);
							importDeclaration();
							}
							break;
						case 2:
							{
							setState(291);
							classBodyDeclaration();
							}
							break;
						case 3:
							{
							setState(292);
							blockStatement();
							}
							break;
						}
						} 
					}
					setState(297);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
				}
				setState(298);
				classBodyDeclaration();
				setState(299);
				blockStatement();
				setState(305);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << HexColorLiteral) | (1L << CHAR_LITERAL) | (1L << ABSTRACT) | (1L << ASSERT) | (1L << BOOLEAN) | (1L << BREAK) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << CONTINUE) | (1L << DO) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << FOR) | (1L << IF) | (1L << IMPORT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NATIVE) | (1L << NEW) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << RETURN) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SUPER) | (1L << SWITCH) | (1L << SYNCHRONIZED) | (1L << THIS) | (1L << THROW) | (1L << TRANSIENT) | (1L << TRY) | (1L << VAR) | (1L << VOID) | (1L << VOLATILE) | (1L << WHILE) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (BOOL_LITERAL - 64)) | (1L << (STRING_LITERAL - 64)) | (1L << (MULTI_STRING_LIT - 64)) | (1L << (NULL_LITERAL - 64)) | (1L << (LPAREN - 64)) | (1L << (LBRACE - 64)) | (1L << (SEMI - 64)) | (1L << (LT - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (AT - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
					{
					setState(303);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						setState(300);
						importDeclaration();
						}
						break;
					case 2:
						{
						setState(301);
						classBodyDeclaration();
						}
						break;
					case 3:
						{
						setState(302);
						blockStatement();
						}
						break;
					}
					}
					setState(307);
					_errHandler.sync(this);
					_la = _input.LA(1);
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

	public static class VariableDeclaratorIdContext extends ParserRuleContext {
		public WarnTypeAsVariableNameContext warnTypeAsVariableName() {
			return getRuleContext(WarnTypeAsVariableNameContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(ProcessingParser.IDENTIFIER, 0); }
		public List<TerminalNode> LBRACK() { return getTokens(ProcessingParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(ProcessingParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(ProcessingParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(ProcessingParser.RBRACK, i);
		}
		public VariableDeclaratorIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaratorId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).enterVariableDeclaratorId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).exitVariableDeclaratorId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProcessingVisitor ) return ((ProcessingVisitor<? extends T>)visitor).visitVariableDeclaratorId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclaratorIdContext variableDeclaratorId() throws RecognitionException {
		VariableDeclaratorIdContext _localctx = new VariableDeclaratorIdContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_variableDeclaratorId);
		int _la;
		try {
			setState(319);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
				enterOuterAlt(_localctx, 1);
				{
				setState(310);
				warnTypeAsVariableName();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(311);
				match(IDENTIFIER);
				setState(316);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(312);
					match(LBRACK);
					setState(313);
					match(RBRACK);
					}
					}
					setState(318);
					_errHandler.sync(this);
					_la = _input.LA(1);
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

	public static class WarnTypeAsVariableNameContext extends ParserRuleContext {
		public PrimitiveTypeContext primitiveType;
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public List<TerminalNode> LBRACK() { return getTokens(ProcessingParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(ProcessingParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(ProcessingParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(ProcessingParser.RBRACK, i);
		}
		public WarnTypeAsVariableNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_warnTypeAsVariableName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).enterWarnTypeAsVariableName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).exitWarnTypeAsVariableName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProcessingVisitor ) return ((ProcessingVisitor<? extends T>)visitor).visitWarnTypeAsVariableName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WarnTypeAsVariableNameContext warnTypeAsVariableName() throws RecognitionException {
		WarnTypeAsVariableNameContext _localctx = new WarnTypeAsVariableNameContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_warnTypeAsVariableName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(321);
			((WarnTypeAsVariableNameContext)_localctx).primitiveType = primitiveType();
			setState(326);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(322);
				match(LBRACK);
				setState(323);
				match(RBRACK);
				}
				}
				setState(328);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}

			        notifyErrorListeners("Type names are not allowed as variable names: "+(((WarnTypeAsVariableNameContext)_localctx).primitiveType!=null?_input.getText(((WarnTypeAsVariableNameContext)_localctx).primitiveType.start,((WarnTypeAsVariableNameContext)_localctx).primitiveType.stop):null));
			      
			}
		}
		catch (RecognitionException re) {
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
		public FunctionWithPrimitiveTypeNameContext functionWithPrimitiveTypeName() {
			return getRuleContext(FunctionWithPrimitiveTypeNameContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(ProcessingParser.IDENTIFIER, 0); }
		public TerminalNode LPAREN() { return getToken(ProcessingParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(ProcessingParser.RPAREN, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public TerminalNode THIS() { return getToken(ProcessingParser.THIS, 0); }
		public TerminalNode SUPER() { return getToken(ProcessingParser.SUPER, 0); }
		public MethodCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).enterMethodCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).exitMethodCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProcessingVisitor ) return ((ProcessingVisitor<? extends T>)visitor).visitMethodCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodCallContext methodCall() throws RecognitionException {
		MethodCallContext _localctx = new MethodCallContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_methodCall);
		int _la;
		try {
			setState(350);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case FLOAT:
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(331);
				functionWithPrimitiveTypeName();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(332);
				match(IDENTIFIER);
				setState(333);
				match(LPAREN);
				setState(335);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << HexColorLiteral) | (1L << CHAR_LITERAL) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VAR) | (1L << VOID) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (BOOL_LITERAL - 64)) | (1L << (STRING_LITERAL - 64)) | (1L << (MULTI_STRING_LIT - 64)) | (1L << (NULL_LITERAL - 64)) | (1L << (LPAREN - 64)) | (1L << (LT - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (AT - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
					{
					setState(334);
					expressionList();
					}
				}

				setState(337);
				match(RPAREN);
				}
				break;
			case THIS:
				enterOuterAlt(_localctx, 3);
				{
				setState(338);
				match(THIS);
				setState(339);
				match(LPAREN);
				setState(341);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << HexColorLiteral) | (1L << CHAR_LITERAL) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VAR) | (1L << VOID) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (BOOL_LITERAL - 64)) | (1L << (STRING_LITERAL - 64)) | (1L << (MULTI_STRING_LIT - 64)) | (1L << (NULL_LITERAL - 64)) | (1L << (LPAREN - 64)) | (1L << (LT - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (AT - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
					{
					setState(340);
					expressionList();
					}
				}

				setState(343);
				match(RPAREN);
				}
				break;
			case SUPER:
				enterOuterAlt(_localctx, 4);
				{
				setState(344);
				match(SUPER);
				setState(345);
				match(LPAREN);
				setState(347);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << HexColorLiteral) | (1L << CHAR_LITERAL) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VAR) | (1L << VOID) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (BOOL_LITERAL - 64)) | (1L << (STRING_LITERAL - 64)) | (1L << (MULTI_STRING_LIT - 64)) | (1L << (NULL_LITERAL - 64)) | (1L << (LPAREN - 64)) | (1L << (LT - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (AT - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
					{
					setState(346);
					expressionList();
					}
				}

				setState(349);
				match(RPAREN);
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

	public static class FunctionWithPrimitiveTypeNameContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(ProcessingParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(ProcessingParser.RPAREN, 0); }
		public TerminalNode BOOLEAN() { return getToken(ProcessingParser.BOOLEAN, 0); }
		public TerminalNode BYTE() { return getToken(ProcessingParser.BYTE, 0); }
		public TerminalNode CHAR() { return getToken(ProcessingParser.CHAR, 0); }
		public TerminalNode FLOAT() { return getToken(ProcessingParser.FLOAT, 0); }
		public TerminalNode INT() { return getToken(ProcessingParser.INT, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public FunctionWithPrimitiveTypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionWithPrimitiveTypeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).enterFunctionWithPrimitiveTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).exitFunctionWithPrimitiveTypeName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProcessingVisitor ) return ((ProcessingVisitor<? extends T>)visitor).visitFunctionWithPrimitiveTypeName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionWithPrimitiveTypeNameContext functionWithPrimitiveTypeName() throws RecognitionException {
		FunctionWithPrimitiveTypeNameContext _localctx = new FunctionWithPrimitiveTypeNameContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_functionWithPrimitiveTypeName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(352);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << FLOAT) | (1L << INT))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(353);
			match(LPAREN);
			setState(355);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << HexColorLiteral) | (1L << CHAR_LITERAL) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VAR) | (1L << VOID) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (BOOL_LITERAL - 64)) | (1L << (STRING_LITERAL - 64)) | (1L << (MULTI_STRING_LIT - 64)) | (1L << (NULL_LITERAL - 64)) | (1L << (LPAREN - 64)) | (1L << (LT - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (AT - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
				{
				setState(354);
				expressionList();
				}
			}

			setState(357);
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

	public static class PrimitiveTypeContext extends ParserRuleContext {
		public TerminalNode BOOLEAN() { return getToken(ProcessingParser.BOOLEAN, 0); }
		public TerminalNode CHAR() { return getToken(ProcessingParser.CHAR, 0); }
		public TerminalNode BYTE() { return getToken(ProcessingParser.BYTE, 0); }
		public TerminalNode SHORT() { return getToken(ProcessingParser.SHORT, 0); }
		public TerminalNode INT() { return getToken(ProcessingParser.INT, 0); }
		public TerminalNode LONG() { return getToken(ProcessingParser.LONG, 0); }
		public TerminalNode FLOAT() { return getToken(ProcessingParser.FLOAT, 0); }
		public TerminalNode DOUBLE() { return getToken(ProcessingParser.DOUBLE, 0); }
		public ColorPrimitiveTypeContext colorPrimitiveType() {
			return getRuleContext(ColorPrimitiveTypeContext.class,0);
		}
		public PrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).enterPrimitiveType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).exitPrimitiveType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProcessingVisitor ) return ((ProcessingVisitor<? extends T>)visitor).visitPrimitiveType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimitiveTypeContext primitiveType() throws RecognitionException {
		PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_primitiveType);
		try {
			setState(368);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
				enterOuterAlt(_localctx, 1);
				{
				setState(359);
				match(BOOLEAN);
				}
				break;
			case CHAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(360);
				match(CHAR);
				}
				break;
			case BYTE:
				enterOuterAlt(_localctx, 3);
				{
				setState(361);
				match(BYTE);
				}
				break;
			case SHORT:
				enterOuterAlt(_localctx, 4);
				{
				setState(362);
				match(SHORT);
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 5);
				{
				setState(363);
				match(INT);
				}
				break;
			case LONG:
				enterOuterAlt(_localctx, 6);
				{
				setState(364);
				match(LONG);
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 7);
				{
				setState(365);
				match(FLOAT);
				}
				break;
			case DOUBLE:
				enterOuterAlt(_localctx, 8);
				{
				setState(366);
				match(DOUBLE);
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 9);
				{
				setState(367);
				colorPrimitiveType();
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

	public static class ColorPrimitiveTypeContext extends ParserRuleContext {
		public ColorPrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_colorPrimitiveType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).enterColorPrimitiveType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).exitColorPrimitiveType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProcessingVisitor ) return ((ProcessingVisitor<? extends T>)visitor).visitColorPrimitiveType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColorPrimitiveTypeContext colorPrimitiveType() throws RecognitionException {
		ColorPrimitiveTypeContext _localctx = new ColorPrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_colorPrimitiveType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(370);
			match(T__0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QualifiedNameContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(ProcessingParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(ProcessingParser.IDENTIFIER, i);
		}
		public List<ColorPrimitiveTypeContext> colorPrimitiveType() {
			return getRuleContexts(ColorPrimitiveTypeContext.class);
		}
		public ColorPrimitiveTypeContext colorPrimitiveType(int i) {
			return getRuleContext(ColorPrimitiveTypeContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(ProcessingParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(ProcessingParser.DOT, i);
		}
		public QualifiedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).enterQualifiedName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).exitQualifiedName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProcessingVisitor ) return ((ProcessingVisitor<? extends T>)visitor).visitQualifiedName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedNameContext qualifiedName() throws RecognitionException {
		QualifiedNameContext _localctx = new QualifiedNameContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_qualifiedName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(374);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				setState(372);
				match(IDENTIFIER);
				}
				break;
			case T__0:
				{
				setState(373);
				colorPrimitiveType();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(383);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(376);
					match(DOT);
					setState(379);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case IDENTIFIER:
						{
						setState(377);
						match(IDENTIFIER);
						}
						break;
					case T__0:
						{
						setState(378);
						colorPrimitiveType();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					} 
				}
				setState(385);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
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

	public static class LiteralContext extends ParserRuleContext {
		public IntegerLiteralContext integerLiteral() {
			return getRuleContext(IntegerLiteralContext.class,0);
		}
		public FloatLiteralContext floatLiteral() {
			return getRuleContext(FloatLiteralContext.class,0);
		}
		public TerminalNode CHAR_LITERAL() { return getToken(ProcessingParser.CHAR_LITERAL, 0); }
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public TerminalNode BOOL_LITERAL() { return getToken(ProcessingParser.BOOL_LITERAL, 0); }
		public TerminalNode NULL_LITERAL() { return getToken(ProcessingParser.NULL_LITERAL, 0); }
		public HexColorLiteralContext hexColorLiteral() {
			return getRuleContext(HexColorLiteralContext.class,0);
		}
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProcessingVisitor ) return ((ProcessingVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_literal);
		try {
			setState(393);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DECIMAL_LITERAL:
			case HEX_LITERAL:
			case OCT_LITERAL:
			case BINARY_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(386);
				integerLiteral();
				}
				break;
			case FLOAT_LITERAL:
			case HEX_FLOAT_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(387);
				floatLiteral();
				}
				break;
			case CHAR_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(388);
				match(CHAR_LITERAL);
				}
				break;
			case STRING_LITERAL:
			case MULTI_STRING_LIT:
				enterOuterAlt(_localctx, 4);
				{
				setState(389);
				stringLiteral();
				}
				break;
			case BOOL_LITERAL:
				enterOuterAlt(_localctx, 5);
				{
				setState(390);
				match(BOOL_LITERAL);
				}
				break;
			case NULL_LITERAL:
				enterOuterAlt(_localctx, 6);
				{
				setState(391);
				match(NULL_LITERAL);
				}
				break;
			case HexColorLiteral:
				enterOuterAlt(_localctx, 7);
				{
				setState(392);
				hexColorLiteral();
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

	public static class HexColorLiteralContext extends ParserRuleContext {
		public TerminalNode HexColorLiteral() { return getToken(ProcessingParser.HexColorLiteral, 0); }
		public HexColorLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hexColorLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).enterHexColorLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).exitHexColorLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProcessingVisitor ) return ((ProcessingVisitor<? extends T>)visitor).visitHexColorLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HexColorLiteralContext hexColorLiteral() throws RecognitionException {
		HexColorLiteralContext _localctx = new HexColorLiteralContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_hexColorLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(395);
			match(HexColorLiteral);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CompilationUnitContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(ProcessingParser.EOF, 0); }
		public PackageDeclarationContext packageDeclaration() {
			return getRuleContext(PackageDeclarationContext.class,0);
		}
		public List<ImportDeclarationContext> importDeclaration() {
			return getRuleContexts(ImportDeclarationContext.class);
		}
		public ImportDeclarationContext importDeclaration(int i) {
			return getRuleContext(ImportDeclarationContext.class,i);
		}
		public List<TypeDeclarationContext> typeDeclaration() {
			return getRuleContexts(TypeDeclarationContext.class);
		}
		public TypeDeclarationContext typeDeclaration(int i) {
			return getRuleContext(TypeDeclarationContext.class,i);
		}
		public CompilationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilationUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).enterCompilationUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).exitCompilationUnit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProcessingVisitor ) return ((ProcessingVisitor<? extends T>)visitor).visitCompilationUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompilationUnitContext compilationUnit() throws RecognitionException {
		CompilationUnitContext _localctx = new CompilationUnitContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_compilationUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(398);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(397);
				packageDeclaration();
				}
				break;
			}
			setState(403);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(400);
				importDeclaration();
				}
				}
				setState(405);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(409);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << CLASS) | (1L << ENUM) | (1L << FINAL) | (1L << INTERFACE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0) || _la==SEMI || _la==AT) {
				{
				{
				setState(406);
				typeDeclaration();
				}
				}
				setState(411);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(412);
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

	public static class PackageDeclarationContext extends ParserRuleContext {
		public TerminalNode PACKAGE() { return getToken(ProcessingParser.PACKAGE, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(ProcessingParser.SEMI, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public PackageDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).enterPackageDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).exitPackageDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProcessingVisitor ) return ((ProcessingVisitor<? extends T>)visitor).visitPackageDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PackageDeclarationContext packageDeclaration() throws RecognitionException {
		PackageDeclarationContext _localctx = new PackageDeclarationContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_packageDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(417);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(414);
				annotation();
				}
				}
				setState(419);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(420);
			match(PACKAGE);
			setState(421);
			qualifiedName();
			setState(422);
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

	public static class ImportDeclarationContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(ProcessingParser.IMPORT, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(ProcessingParser.SEMI, 0); }
		public TerminalNode STATIC() { return getToken(ProcessingParser.STATIC, 0); }
		public TerminalNode DOT() { return getToken(ProcessingParser.DOT, 0); }
		public TerminalNode MUL() { return getToken(ProcessingParser.MUL, 0); }
		public ImportDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).enterImportDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).exitImportDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProcessingVisitor ) return ((ProcessingVisitor<? extends T>)visitor).visitImportDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportDeclarationContext importDeclaration() throws RecognitionException {
		ImportDeclarationContext _localctx = new ImportDeclarationContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_importDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(424);
			match(IMPORT);
			setState(426);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STATIC) {
				{
				setState(425);
				match(STATIC);
				}
			}

			setState(428);
			qualifiedName();
			setState(431);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOT) {
				{
				setState(429);
				match(DOT);
				setState(430);
				match(MUL);
				}
			}

			setState(433);
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

	public static class TypeDeclarationContext extends ParserRuleContext {
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public EnumDeclarationContext enumDeclaration() {
			return getRuleContext(EnumDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public AnnotationTypeDeclarationContext annotationTypeDeclaration() {
			return getRuleContext(AnnotationTypeDeclarationContext.class,0);
		}
		public List<ClassOrInterfaceModifierContext> classOrInterfaceModifier() {
			return getRuleContexts(ClassOrInterfaceModifierContext.class);
		}
		public ClassOrInterfaceModifierContext classOrInterfaceModifier(int i) {
			return getRuleContext(ClassOrInterfaceModifierContext.class,i);
		}
		public TerminalNode SEMI() { return getToken(ProcessingParser.SEMI, 0); }
		public TypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).enterTypeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).exitTypeDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProcessingVisitor ) return ((ProcessingVisitor<? extends T>)visitor).visitTypeDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeDeclarationContext typeDeclaration() throws RecognitionException {
		TypeDeclarationContext _localctx = new TypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_typeDeclaration);
		try {
			int _alt;
			setState(448);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ABSTRACT:
			case CLASS:
			case ENUM:
			case FINAL:
			case INTERFACE:
			case PRIVATE:
			case PROTECTED:
			case PUBLIC:
			case STATIC:
			case STRICTFP:
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(438);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(435);
						classOrInterfaceModifier();
						}
						} 
					}
					setState(440);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
				}
				setState(445);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CLASS:
					{
					setState(441);
					classDeclaration();
					}
					break;
				case ENUM:
					{
					setState(442);
					enumDeclaration();
					}
					break;
				case INTERFACE:
					{
					setState(443);
					interfaceDeclaration();
					}
					break;
				case AT:
					{
					setState(444);
					annotationTypeDeclaration();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(447);
				match(SEMI);
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

	public static class ModifierContext extends ParserRuleContext {
		public ClassOrInterfaceModifierContext classOrInterfaceModifier() {
			return getRuleContext(ClassOrInterfaceModifierContext.class,0);
		}
		public TerminalNode NATIVE() { return getToken(ProcessingParser.NATIVE, 0); }
		public TerminalNode SYNCHRONIZED() { return getToken(ProcessingParser.SYNCHRONIZED, 0); }
		public TerminalNode TRANSIENT() { return getToken(ProcessingParser.TRANSIENT, 0); }
		public TerminalNode VOLATILE() { return getToken(ProcessingParser.VOLATILE, 0); }
		public ModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).enterModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).exitModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProcessingVisitor ) return ((ProcessingVisitor<? extends T>)visitor).visitModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModifierContext modifier() throws RecognitionException {
		ModifierContext _localctx = new ModifierContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_modifier);
		try {
			setState(455);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ABSTRACT:
			case FINAL:
			case PRIVATE:
			case PROTECTED:
			case PUBLIC:
			case STATIC:
			case STRICTFP:
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(450);
				classOrInterfaceModifier();
				}
				break;
			case NATIVE:
				enterOuterAlt(_localctx, 2);
				{
				setState(451);
				match(NATIVE);
				}
				break;
			case SYNCHRONIZED:
				enterOuterAlt(_localctx, 3);
				{
				setState(452);
				match(SYNCHRONIZED);
				}
				break;
			case TRANSIENT:
				enterOuterAlt(_localctx, 4);
				{
				setState(453);
				match(TRANSIENT);
				}
				break;
			case VOLATILE:
				enterOuterAlt(_localctx, 5);
				{
				setState(454);
				match(VOLATILE);
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

	public static class ClassOrInterfaceModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public TerminalNode PUBLIC() { return getToken(ProcessingParser.PUBLIC, 0); }
		public TerminalNode PROTECTED() { return getToken(ProcessingParser.PROTECTED, 0); }
		public TerminalNode PRIVATE() { return getToken(ProcessingParser.PRIVATE, 0); }
		public TerminalNode STATIC() { return getToken(ProcessingParser.STATIC, 0); }
		public TerminalNode ABSTRACT() { return getToken(ProcessingParser.ABSTRACT, 0); }
		public TerminalNode FINAL() { return getToken(ProcessingParser.FINAL, 0); }
		public TerminalNode STRICTFP() { return getToken(ProcessingParser.STRICTFP, 0); }
		public ClassOrInterfaceModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classOrInterfaceModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).enterClassOrInterfaceModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).exitClassOrInterfaceModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProcessingVisitor ) return ((ProcessingVisitor<? extends T>)visitor).visitClassOrInterfaceModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassOrInterfaceModifierContext classOrInterfaceModifier() throws RecognitionException {
		ClassOrInterfaceModifierContext _localctx = new ClassOrInterfaceModifierContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_classOrInterfaceModifier);
		try {
			setState(465);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(457);
				annotation();
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(458);
				match(PUBLIC);
				}
				break;
			case PROTECTED:
				enterOuterAlt(_localctx, 3);
				{
				setState(459);
				match(PROTECTED);
				}
				break;
			case PRIVATE:
				enterOuterAlt(_localctx, 4);
				{
				setState(460);
				match(PRIVATE);
				}
				break;
			case STATIC:
				enterOuterAlt(_localctx, 5);
				{
				setState(461);
				match(STATIC);
				}
				break;
			case ABSTRACT:
				enterOuterAlt(_localctx, 6);
				{
				setState(462);
				match(ABSTRACT);
				}
				break;
			case FINAL:
				enterOuterAlt(_localctx, 7);
				{
				setState(463);
				match(FINAL);
				}
				break;
			case STRICTFP:
				enterOuterAlt(_localctx, 8);
				{
				setState(464);
				match(STRICTFP);
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

	public static class VariableModifierContext extends ParserRuleContext {
		public TerminalNode FINAL() { return getToken(ProcessingParser.FINAL, 0); }
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public VariableModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).enterVariableModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).exitVariableModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProcessingVisitor ) return ((ProcessingVisitor<? extends T>)visitor).visitVariableModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableModifierContext variableModifier() throws RecognitionException {
		VariableModifierContext _localctx = new VariableModifierContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_variableModifier);
		try {
			setState(469);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FINAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(467);
				match(FINAL);
				}
				break;
			case AT:
				enterOuterAlt(_localctx, 2);
				{
				setState(468);
				annotation();
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

	public static class ClassDeclarationContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(ProcessingParser.CLASS, 0); }
		public TerminalNode IDENTIFIER() { return getToken(ProcessingParser.IDENTIFIER, 0); }
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public TerminalNode EXTENDS() { return getToken(ProcessingParser.EXTENDS, 0); }
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public TerminalNode IMPLEMENTS() { return getToken(ProcessingParser.IMPLEMENTS, 0); }
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
		}
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).exitClassDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProcessingVisitor ) return ((ProcessingVisitor<? extends T>)visitor).visitClassDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_classDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(471);
			match(CLASS);
			setState(472);
			match(IDENTIFIER);
			setState(474);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(473);
				typeParameters();
				}
			}

			setState(478);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(476);
				match(EXTENDS);
				setState(477);
				typeType();
				}
			}

			setState(482);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(480);
				match(IMPLEMENTS);
				setState(481);
				typeList();
				}
			}

			setState(484);
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

	public static class TypeParametersContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(ProcessingParser.LT, 0); }
		public List<TypeParameterContext> typeParameter() {
			return getRuleContexts(TypeParameterContext.class);
		}
		public TypeParameterContext typeParameter(int i) {
			return getRuleContext(TypeParameterContext.class,i);
		}
		public TerminalNode GT() { return getToken(ProcessingParser.GT, 0); }
		public List<TerminalNode> COMMA() { return getTokens(ProcessingParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ProcessingParser.COMMA, i);
		}
		public TypeParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).enterTypeParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).exitTypeParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProcessingVisitor ) return ((ProcessingVisitor<? extends T>)visitor).visitTypeParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeParametersContext typeParameters() throws RecognitionException {
		TypeParametersContext _localctx = new TypeParametersContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_typeParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(486);
			match(LT);
			setState(487);
			typeParameter();
			setState(492);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(488);
				match(COMMA);
				setState(489);
				typeParameter();
				}
				}
				setState(494);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(495);
			match(GT);
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode IDENTIFIER() { return getToken(ProcessingParser.IDENTIFIER, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public TerminalNode EXTENDS() { return getToken(ProcessingParser.EXTENDS, 0); }
		public TypeBoundContext typeBound() {
			return getRuleContext(TypeBoundContext.class,0);
		}
		public TypeParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).enterTypeParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).exitTypeParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProcessingVisitor ) return ((ProcessingVisitor<? extends T>)visitor).visitTypeParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeParameterContext typeParameter() throws RecognitionException {
		TypeParameterContext _localctx = new TypeParameterContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_typeParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(500);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(497);
				annotation();
				}
				}
				setState(502);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(503);
			match(IDENTIFIER);
			setState(506);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(504);
				match(EXTENDS);
				setState(505);
				typeBound();
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

	public static class TypeBoundContext extends ParserRuleContext {
		public List<TypeTypeContext> typeType() {
			return getRuleContexts(TypeTypeContext.class);
		}
		public TypeTypeContext typeType(int i) {
			return getRuleContext(TypeTypeContext.class,i);
		}
		public List<TerminalNode> BITAND() { return getTokens(ProcessingParser.BITAND); }
		public TerminalNode BITAND(int i) {
			return getToken(ProcessingParser.BITAND, i);
		}
		public TypeBoundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeBound; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).enterTypeBound(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).exitTypeBound(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProcessingVisitor ) return ((ProcessingVisitor<? extends T>)visitor).visitTypeBound(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeBoundContext typeBound() throws RecognitionException {
		TypeBoundContext _localctx = new TypeBoundContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_typeBound);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(508);
			typeType();
			setState(513);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BITAND) {
				{
				{
				setState(509);
				match(BITAND);
				setState(510);
				typeType();
				}
				}
				setState(515);
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

	public static class EnumDeclarationContext extends ParserRuleContext {
		public TerminalNode ENUM() { return getToken(ProcessingParser.ENUM, 0); }
		public TerminalNode IDENTIFIER() { return getToken(ProcessingParser.IDENTIFIER, 0); }
		public TerminalNode LBRACE() { return getToken(ProcessingParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(ProcessingParser.RBRACE, 0); }
		public TerminalNode IMPLEMENTS() { return getToken(ProcessingParser.IMPLEMENTS, 0); }
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
		}
		public EnumConstantsContext enumConstants() {
			return getRuleContext(EnumConstantsContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(ProcessingParser.COMMA, 0); }
		public EnumBodyDeclarationsContext enumBodyDeclarations() {
			return getRuleContext(EnumBodyDeclarationsContext.class,0);
		}
		public EnumDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).enterEnumDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).exitEnumDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProcessingVisitor ) return ((ProcessingVisitor<? extends T>)visitor).visitEnumDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumDeclarationContext enumDeclaration() throws RecognitionException {
		EnumDeclarationContext _localctx = new EnumDeclarationContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_enumDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(516);
			match(ENUM);
			setState(517);
			match(IDENTIFIER);
			setState(520);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(518);
				match(IMPLEMENTS);
				setState(519);
				typeList();
				}
			}

			setState(522);
			match(LBRACE);
			setState(524);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT || _la==IDENTIFIER) {
				{
				setState(523);
				enumConstants();
				}
			}

			setState(527);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(526);
				match(COMMA);
				}
			}

			setState(530);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(529);
				enumBodyDeclarations();
				}
			}

			setState(532);
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

	public static class EnumConstantsContext extends ParserRuleContext {
		public List<EnumConstantContext> enumConstant() {
			return getRuleContexts(EnumConstantContext.class);
		}
		public EnumConstantContext enumConstant(int i) {
			return getRuleContext(EnumConstantContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ProcessingParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ProcessingParser.COMMA, i);
		}
		public EnumConstantsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumConstants; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).enterEnumConstants(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).exitEnumConstants(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProcessingVisitor ) return ((ProcessingVisitor<? extends T>)visitor).visitEnumConstants(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumConstantsContext enumConstants() throws RecognitionException {
		EnumConstantsContext _localctx = new EnumConstantsContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_enumConstants);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(534);
			enumConstant();
			setState(539);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(535);
					match(COMMA);
					setState(536);
					enumConstant();
					}
					} 
				}
				setState(541);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
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

	public static class EnumConstantContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ProcessingParser.IDENTIFIER, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public EnumConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumConstant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).enterEnumConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).exitEnumConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProcessingVisitor ) return ((ProcessingVisitor<? extends T>)visitor).visitEnumConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumConstantContext enumConstant() throws RecognitionException {
		EnumConstantContext _localctx = new EnumConstantContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_enumConstant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(545);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(542);
				annotation();
				}
				}
				setState(547);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(548);
			match(IDENTIFIER);
			setState(550);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(549);
				arguments();
				}
			}

			setState(553);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACE) {
				{
				setState(552);
				classBody();
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

	public static class EnumBodyDeclarationsContext extends ParserRuleContext {
		public TerminalNode SEMI() { return getToken(ProcessingParser.SEMI, 0); }
		public List<ClassBodyDeclarationContext> classBodyDeclaration() {
			return getRuleContexts(ClassBodyDeclarationContext.class);
		}
		public ClassBodyDeclarationContext classBodyDeclaration(int i) {
			return getRuleContext(ClassBodyDeclarationContext.class,i);
		}
		public EnumBodyDeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumBodyDeclarations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).enterEnumBodyDeclarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).exitEnumBodyDeclarations(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProcessingVisitor ) return ((ProcessingVisitor<? extends T>)visitor).visitEnumBodyDeclarations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumBodyDeclarationsContext enumBodyDeclarations() throws RecognitionException {
		EnumBodyDeclarationsContext _localctx = new EnumBodyDeclarationsContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_enumBodyDeclarations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(555);
			match(SEMI);
			setState(559);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << IMPORT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VAR) | (1L << VOID) | (1L << VOLATILE))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (LBRACE - 70)) | (1L << (SEMI - 70)) | (1L << (LT - 70)) | (1L << (AT - 70)) | (1L << (IDENTIFIER - 70)))) != 0)) {
				{
				{
				setState(556);
				classBodyDeclaration();
				}
				}
				setState(561);
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

	public static class InterfaceDeclarationContext extends ParserRuleContext {
		public TerminalNode INTERFACE() { return getToken(ProcessingParser.INTERFACE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(ProcessingParser.IDENTIFIER, 0); }
		public InterfaceBodyContext interfaceBody() {
			return getRuleContext(InterfaceBodyContext.class,0);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public TerminalNode EXTENDS() { return getToken(ProcessingParser.EXTENDS, 0); }
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
		}
		public InterfaceDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).enterInterfaceDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).exitInterfaceDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProcessingVisitor ) return ((ProcessingVisitor<? extends T>)visitor).visitInterfaceDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceDeclarationContext interfaceDeclaration() throws RecognitionException {
		InterfaceDeclarationContext _localctx = new InterfaceDeclarationContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_interfaceDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(562);
			match(INTERFACE);
			setState(563);
			match(IDENTIFIER);
			setState(565);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(564);
				typeParameters();
				}
			}

			setState(569);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(567);
				match(EXTENDS);
				setState(568);
				typeList();
				}
			}

			setState(571);
			interfaceBody();
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode LBRACE() { return getToken(ProcessingParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(ProcessingParser.RBRACE, 0); }
		public List<ClassBodyDeclarationContext> classBodyDeclaration() {
			return getRuleContexts(ClassBodyDeclarationContext.class);
		}
		public ClassBodyDeclarationContext classBodyDeclaration(int i) {
			return getRuleContext(ClassBodyDeclarationContext.class,i);
		}
		public ClassBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).enterClassBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).exitClassBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProcessingVisitor ) return ((ProcessingVisitor<? extends T>)visitor).visitClassBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassBodyContext classBody() throws RecognitionException {
		ClassBodyContext _localctx = new ClassBodyContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_classBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(573);
			match(LBRACE);
			setState(577);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << IMPORT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VAR) | (1L << VOID) | (1L << VOLATILE))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (LBRACE - 70)) | (1L << (SEMI - 70)) | (1L << (LT - 70)) | (1L << (AT - 70)) | (1L << (IDENTIFIER - 70)))) != 0)) {
				{
				{
				setState(574);
				classBodyDeclaration();
				}
				}
				setState(579);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(580);
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

	public static class InterfaceBodyContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(ProcessingParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(ProcessingParser.RBRACE, 0); }
		public List<InterfaceBodyDeclarationContext> interfaceBodyDeclaration() {
			return getRuleContexts(InterfaceBodyDeclarationContext.class);
		}
		public InterfaceBodyDeclarationContext interfaceBodyDeclaration(int i) {
			return getRuleContext(InterfaceBodyDeclarationContext.class,i);
		}
		public InterfaceBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).enterInterfaceBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).exitInterfaceBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProcessingVisitor ) return ((ProcessingVisitor<? extends T>)visitor).visitInterfaceBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceBodyContext interfaceBody() throws RecognitionException {
		InterfaceBodyContext _localctx = new InterfaceBodyContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_interfaceBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(582);
			match(LBRACE);
			setState(586);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DEFAULT) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VAR) | (1L << VOID) | (1L << VOLATILE))) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (SEMI - 74)) | (1L << (LT - 74)) | (1L << (AT - 74)) | (1L << (IDENTIFIER - 74)))) != 0)) {
				{
				{
				setState(583);
				interfaceBodyDeclaration();
				}
				}
				setState(588);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(589);
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

	public static class ClassBodyDeclarationContext extends ParserRuleContext {
		public TerminalNode SEMI() { return getToken(ProcessingParser.SEMI, 0); }
		public ImportDeclarationContext importDeclaration() {
			return getRuleContext(ImportDeclarationContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode STATIC() { return getToken(ProcessingParser.STATIC, 0); }
		public MemberDeclarationContext memberDeclaration() {
			return getRuleContext(MemberDeclarationContext.class,0);
		}
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public ClassBodyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBodyDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).enterClassBodyDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).exitClassBodyDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProcessingVisitor ) return ((ProcessingVisitor<? extends T>)visitor).visitClassBodyDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassBodyDeclarationContext classBodyDeclaration() throws RecognitionException {
		ClassBodyDeclarationContext _localctx = new ClassBodyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_classBodyDeclaration);
		int _la;
		try {
			int _alt;
			setState(604);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(591);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(592);
				importDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(594);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STATIC) {
					{
					setState(593);
					match(STATIC);
					}
				}

				setState(596);
				block();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(600);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(597);
						modifier();
						}
						} 
					}
					setState(602);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
				}
				setState(603);
				memberDeclaration();
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

	public static class MemberDeclarationContext extends ParserRuleContext {
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public GenericMethodDeclarationContext genericMethodDeclaration() {
			return getRuleContext(GenericMethodDeclarationContext.class,0);
		}
		public FieldDeclarationContext fieldDeclaration() {
			return getRuleContext(FieldDeclarationContext.class,0);
		}
		public ConstructorDeclarationContext constructorDeclaration() {
			return getRuleContext(ConstructorDeclarationContext.class,0);
		}
		public GenericConstructorDeclarationContext genericConstructorDeclaration() {
			return getRuleContext(GenericConstructorDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public AnnotationTypeDeclarationContext annotationTypeDeclaration() {
			return getRuleContext(AnnotationTypeDeclarationContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public EnumDeclarationContext enumDeclaration() {
			return getRuleContext(EnumDeclarationContext.class,0);
		}
		public MemberDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).enterMemberDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).exitMemberDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProcessingVisitor ) return ((ProcessingVisitor<? extends T>)visitor).visitMemberDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MemberDeclarationContext memberDeclaration() throws RecognitionException {
		MemberDeclarationContext _localctx = new MemberDeclarationContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_memberDeclaration);
		try {
			setState(615);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(606);
				methodDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(607);
				genericMethodDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(608);
				fieldDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(609);
				constructorDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(610);
				genericConstructorDeclaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(611);
				interfaceDeclaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(612);
				annotationTypeDeclaration();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(613);
				classDeclaration();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(614);
				enumDeclaration();
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

	public static class MethodDeclarationContext extends ParserRuleContext {
		public TypeTypeOrVoidContext typeTypeOrVoid() {
			return getRuleContext(TypeTypeOrVoidContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(ProcessingParser.IDENTIFIER, 0); }
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public List<TerminalNode> LBRACK() { return getTokens(ProcessingParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(ProcessingParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(ProcessingParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(ProcessingParser.RBRACK, i);
		}
		public TerminalNode THROWS() { return getToken(ProcessingParser.THROWS, 0); }
		public QualifiedNameListContext qualifiedNameList() {
			return getRuleContext(QualifiedNameListContext.class,0);
		}
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).enterMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).exitMethodDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProcessingVisitor ) return ((ProcessingVisitor<? extends T>)visitor).visitMethodDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_methodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(617);
			typeTypeOrVoid();
			setState(618);
			match(IDENTIFIER);
			setState(619);
			formalParameters();
			setState(624);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(620);
				match(LBRACK);
				setState(621);
				match(RBRACK);
				}
				}
				setState(626);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(629);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(627);
				match(THROWS);
				setState(628);
				qualifiedNameList();
				}
			}

			setState(631);
			methodBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodBodyContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(ProcessingParser.SEMI, 0); }
		public MethodBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).enterMethodBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).exitMethodBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProcessingVisitor ) return ((ProcessingVisitor<? extends T>)visitor).visitMethodBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodBodyContext methodBody() throws RecognitionException {
		MethodBodyContext _localctx = new MethodBodyContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_methodBody);
		try {
			setState(635);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(633);
				block();
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(634);
				match(SEMI);
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

	public static class TypeTypeOrVoidContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public TerminalNode VOID() { return getToken(ProcessingParser.VOID, 0); }
		public TypeTypeOrVoidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeTypeOrVoid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).enterTypeTypeOrVoid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).exitTypeTypeOrVoid(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProcessingVisitor ) return ((ProcessingVisitor<? extends T>)visitor).visitTypeTypeOrVoid(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeTypeOrVoidContext typeTypeOrVoid() throws RecognitionException {
		TypeTypeOrVoidContext _localctx = new TypeTypeOrVoidContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_typeTypeOrVoid);
		try {
			setState(639);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
			case VAR:
			case AT:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(637);
				typeType();
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 2);
				{
				setState(638);
				match(VOID);
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

	public static class GenericMethodDeclarationContext extends ParserRuleContext {
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public GenericMethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericMethodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).enterGenericMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).exitGenericMethodDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProcessingVisitor ) return ((ProcessingVisitor<? extends T>)visitor).visitGenericMethodDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GenericMethodDeclarationContext genericMethodDeclaration() throws RecognitionException {
		GenericMethodDeclarationContext _localctx = new GenericMethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_genericMethodDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(641);
			typeParameters();
			setState(642);
			methodDeclaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GenericConstructorDeclarationContext extends ParserRuleContext {
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public ConstructorDeclarationContext constructorDeclaration() {
			return getRuleContext(ConstructorDeclarationContext.class,0);
		}
		public GenericConstructorDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericConstructorDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).enterGenericConstructorDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).exitGenericConstructorDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProcessingVisitor ) return ((ProcessingVisitor<? extends T>)visitor).visitGenericConstructorDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GenericConstructorDeclarationContext genericConstructorDeclaration() throws RecognitionException {
		GenericConstructorDeclarationContext _localctx = new GenericConstructorDeclarationContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_genericConstructorDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(644);
			typeParameters();
			setState(645);
			constructorDeclaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstructorDeclarationContext extends ParserRuleContext {
		public BlockContext constructorBody;
		public TerminalNode IDENTIFIER() { return getToken(ProcessingParser.IDENTIFIER, 0); }
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode THROWS() { return getToken(ProcessingParser.THROWS, 0); }
		public QualifiedNameListContext qualifiedNameList() {
			return getRuleContext(QualifiedNameListContext.class,0);
		}
		public ConstructorDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).enterConstructorDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).exitConstructorDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProcessingVisitor ) return ((ProcessingVisitor<? extends T>)visitor).visitConstructorDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorDeclarationContext constructorDeclaration() throws RecognitionException {
		ConstructorDeclarationContext _localctx = new ConstructorDeclarationContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_constructorDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(647);
			match(IDENTIFIER);
			setState(648);
			formalParameters();
			setState(651);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(649);
				match(THROWS);
				setState(650);
				qualifiedNameList();
				}
			}

			setState(653);
			((ConstructorDeclarationContext)_localctx).constructorBody = block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldDeclarationContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public VariableDeclaratorsContext variableDeclarators() {
			return getRuleContext(VariableDeclaratorsContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(ProcessingParser.SEMI, 0); }
		public FieldDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).enterFieldDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).exitFieldDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProcessingVisitor ) return ((ProcessingVisitor<? extends T>)visitor).visitFieldDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldDeclarationContext fieldDeclaration() throws RecognitionException {
		FieldDeclarationContext _localctx = new FieldDeclarationContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_fieldDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(655);
			typeType();
			setState(656);
			variableDeclarators();
			setState(657);
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

	public static class InterfaceBodyDeclarationContext extends ParserRuleContext {
		public InterfaceMemberDeclarationContext interfaceMemberDeclaration() {
			return getRuleContext(InterfaceMemberDeclarationContext.class,0);
		}
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public TerminalNode SEMI() { return getToken(ProcessingParser.SEMI, 0); }
		public InterfaceBodyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceBodyDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).enterInterfaceBodyDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).exitInterfaceBodyDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProcessingVisitor ) return ((ProcessingVisitor<? extends T>)visitor).visitInterfaceBodyDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceBodyDeclarationContext interfaceBodyDeclaration() throws RecognitionException {
		InterfaceBodyDeclarationContext _localctx = new InterfaceBodyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_interfaceBodyDeclaration);
		try {
			int _alt;
			setState(667);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case ABSTRACT:
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case CLASS:
			case DEFAULT:
			case DOUBLE:
			case ENUM:
			case FINAL:
			case FLOAT:
			case INT:
			case INTERFACE:
			case LONG:
			case NATIVE:
			case PRIVATE:
			case PROTECTED:
			case PUBLIC:
			case SHORT:
			case STATIC:
			case STRICTFP:
			case SYNCHRONIZED:
			case TRANSIENT:
			case VAR:
			case VOID:
			case VOLATILE:
			case LT:
			case AT:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(662);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(659);
						modifier();
						}
						} 
					}
					setState(664);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
				}
				setState(665);
				interfaceMemberDeclaration();
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(666);
				match(SEMI);
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

	public static class InterfaceMemberDeclarationContext extends ParserRuleContext {
		public ConstDeclarationContext constDeclaration() {
			return getRuleContext(ConstDeclarationContext.class,0);
		}
		public InterfaceMethodDeclarationContext interfaceMethodDeclaration() {
			return getRuleContext(InterfaceMethodDeclarationContext.class,0);
		}
		public GenericInterfaceMethodDeclarationContext genericInterfaceMethodDeclaration() {
			return getRuleContext(GenericInterfaceMethodDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public AnnotationTypeDeclarationContext annotationTypeDeclaration() {
			return getRuleContext(AnnotationTypeDeclarationContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public EnumDeclarationContext enumDeclaration() {
			return getRuleContext(EnumDeclarationContext.class,0);
		}
		public InterfaceMemberDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceMemberDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).enterInterfaceMemberDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).exitInterfaceMemberDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProcessingVisitor ) return ((ProcessingVisitor<? extends T>)visitor).visitInterfaceMemberDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceMemberDeclarationContext interfaceMemberDeclaration() throws RecognitionException {
		InterfaceMemberDeclarationContext _localctx = new InterfaceMemberDeclarationContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_interfaceMemberDeclaration);
		try {
			setState(676);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(669);
				constDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(670);
				interfaceMethodDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(671);
				genericInterfaceMethodDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(672);
				interfaceDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(673);
				annotationTypeDeclaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(674);
				classDeclaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(675);
				enumDeclaration();
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

	public static class ConstDeclarationContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public List<ConstantDeclaratorContext> constantDeclarator() {
			return getRuleContexts(ConstantDeclaratorContext.class);
		}
		public ConstantDeclaratorContext constantDeclarator(int i) {
			return getRuleContext(ConstantDeclaratorContext.class,i);
		}
		public TerminalNode SEMI() { return getToken(ProcessingParser.SEMI, 0); }
		public List<TerminalNode> COMMA() { return getTokens(ProcessingParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ProcessingParser.COMMA, i);
		}
		public ConstDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).enterConstDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).exitConstDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProcessingVisitor ) return ((ProcessingVisitor<? extends T>)visitor).visitConstDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstDeclarationContext constDeclaration() throws RecognitionException {
		ConstDeclarationContext _localctx = new ConstDeclarationContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_constDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(678);
			typeType();
			setState(679);
			constantDeclarator();
			setState(684);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(680);
				match(COMMA);
				setState(681);
				constantDeclarator();
				}
				}
				setState(686);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(687);
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

	public static class ConstantDeclaratorContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ProcessingParser.IDENTIFIER, 0); }
		public TerminalNode ASSIGN() { return getToken(ProcessingParser.ASSIGN, 0); }
		public VariableInitializerContext variableInitializer() {
			return getRuleContext(VariableInitializerContext.class,0);
		}
		public List<TerminalNode> LBRACK() { return getTokens(ProcessingParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(ProcessingParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(ProcessingParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(ProcessingParser.RBRACK, i);
		}
		public ConstantDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).enterConstantDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).exitConstantDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProcessingVisitor ) return ((ProcessingVisitor<? extends T>)visitor).visitConstantDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantDeclaratorContext constantDeclarator() throws RecognitionException {
		ConstantDeclaratorContext _localctx = new ConstantDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_constantDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(689);
			match(IDENTIFIER);
			setState(694);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(690);
				match(LBRACK);
				setState(691);
				match(RBRACK);
				}
				}
				setState(696);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(697);
			match(ASSIGN);
			setState(698);
			variableInitializer();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceMethodDeclarationContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ProcessingParser.IDENTIFIER, 0); }
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public TypeTypeOrVoidContext typeTypeOrVoid() {
			return getRuleContext(TypeTypeOrVoidContext.class,0);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public List<InterfaceMethodModifierContext> interfaceMethodModifier() {
			return getRuleContexts(InterfaceMethodModifierContext.class);
		}
		public InterfaceMethodModifierContext interfaceMethodModifier(int i) {
			return getRuleContext(InterfaceMethodModifierContext.class,i);
		}
		public List<TerminalNode> LBRACK() { return getTokens(ProcessingParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(ProcessingParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(ProcessingParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(ProcessingParser.RBRACK, i);
		}
		public TerminalNode THROWS() { return getToken(ProcessingParser.THROWS, 0); }
		public QualifiedNameListContext qualifiedNameList() {
			return getRuleContext(QualifiedNameListContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public InterfaceMethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceMethodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).enterInterfaceMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).exitInterfaceMethodDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProcessingVisitor ) return ((ProcessingVisitor<? extends T>)visitor).visitInterfaceMethodDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceMethodDeclarationContext interfaceMethodDeclaration() throws RecognitionException {
		InterfaceMethodDeclarationContext _localctx = new InterfaceMethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_interfaceMethodDeclaration);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(703);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,76,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(700);
					interfaceMethodModifier();
					}
					} 
				}
				setState(705);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,76,_ctx);
			}
			setState(716);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
			case VAR:
			case VOID:
			case AT:
			case IDENTIFIER:
				{
				setState(706);
				typeTypeOrVoid();
				}
				break;
			case LT:
				{
				setState(707);
				typeParameters();
				setState(711);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(708);
						annotation();
						}
						} 
					}
					setState(713);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
				}
				setState(714);
				typeTypeOrVoid();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(718);
			match(IDENTIFIER);
			setState(719);
			formalParameters();
			setState(724);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(720);
				match(LBRACK);
				setState(721);
				match(RBRACK);
				}
				}
				setState(726);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(729);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(727);
				match(THROWS);
				setState(728);
				qualifiedNameList();
				}
			}

			setState(731);
			methodBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceMethodModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public TerminalNode PUBLIC() { return getToken(ProcessingParser.PUBLIC, 0); }
		public TerminalNode ABSTRACT() { return getToken(ProcessingParser.ABSTRACT, 0); }
		public TerminalNode DEFAULT() { return getToken(ProcessingParser.DEFAULT, 0); }
		public TerminalNode STATIC() { return getToken(ProcessingParser.STATIC, 0); }
		public TerminalNode STRICTFP() { return getToken(ProcessingParser.STRICTFP, 0); }
		public InterfaceMethodModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceMethodModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).enterInterfaceMethodModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).exitInterfaceMethodModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProcessingVisitor ) return ((ProcessingVisitor<? extends T>)visitor).visitInterfaceMethodModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceMethodModifierContext interfaceMethodModifier() throws RecognitionException {
		InterfaceMethodModifierContext _localctx = new InterfaceMethodModifierContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_interfaceMethodModifier);
		try {
			setState(739);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(733);
				annotation();
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(734);
				match(PUBLIC);
				}
				break;
			case ABSTRACT:
				enterOuterAlt(_localctx, 3);
				{
				setState(735);
				match(ABSTRACT);
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 4);
				{
				setState(736);
				match(DEFAULT);
				}
				break;
			case STATIC:
				enterOuterAlt(_localctx, 5);
				{
				setState(737);
				match(STATIC);
				}
				break;
			case STRICTFP:
				enterOuterAlt(_localctx, 6);
				{
				setState(738);
				match(STRICTFP);
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

	public static class GenericInterfaceMethodDeclarationContext extends ParserRuleContext {
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public InterfaceMethodDeclarationContext interfaceMethodDeclaration() {
			return getRuleContext(InterfaceMethodDeclarationContext.class,0);
		}
		public GenericInterfaceMethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericInterfaceMethodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).enterGenericInterfaceMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).exitGenericInterfaceMethodDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProcessingVisitor ) return ((ProcessingVisitor<? extends T>)visitor).visitGenericInterfaceMethodDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GenericInterfaceMethodDeclarationContext genericInterfaceMethodDeclaration() throws RecognitionException {
		GenericInterfaceMethodDeclarationContext _localctx = new GenericInterfaceMethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_genericInterfaceMethodDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(741);
			typeParameters();
			setState(742);
			interfaceMethodDeclaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclaratorsContext extends ParserRuleContext {
		public List<VariableDeclaratorContext> variableDeclarator() {
			return getRuleContexts(VariableDeclaratorContext.class);
		}
		public VariableDeclaratorContext variableDeclarator(int i) {
			return getRuleContext(VariableDeclaratorContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ProcessingParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ProcessingParser.COMMA, i);
		}
		public VariableDeclaratorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarators; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).enterVariableDeclarators(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).exitVariableDeclarators(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProcessingVisitor ) return ((ProcessingVisitor<? extends T>)visitor).visitVariableDeclarators(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclaratorsContext variableDeclarators() throws RecognitionException {
		VariableDeclaratorsContext _localctx = new VariableDeclaratorsContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_variableDeclarators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(744);
			variableDeclarator();
			setState(749);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(745);
				match(COMMA);
				setState(746);
				variableDeclarator();
				}
				}
				setState(751);
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

	public static class VariableDeclaratorContext extends ParserRuleContext {
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(ProcessingParser.ASSIGN, 0); }
		public VariableInitializerContext variableInitializer() {
			return getRuleContext(VariableInitializerContext.class,0);
		}
		public VariableDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).enterVariableDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).exitVariableDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProcessingVisitor ) return ((ProcessingVisitor<? extends T>)visitor).visitVariableDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclaratorContext variableDeclarator() throws RecognitionException {
		VariableDeclaratorContext _localctx = new VariableDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_variableDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(752);
			variableDeclaratorId();
			setState(755);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(753);
				match(ASSIGN);
				setState(754);
				variableInitializer();
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

	public static class VariableInitializerContext extends ParserRuleContext {
		public ArrayInitializerContext arrayInitializer() {
			return getRuleContext(ArrayInitializerContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).enterVariableInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).exitVariableInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProcessingVisitor ) return ((ProcessingVisitor<? extends T>)visitor).visitVariableInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableInitializerContext variableInitializer() throws RecognitionException {
		VariableInitializerContext _localctx = new VariableInitializerContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_variableInitializer);
		try {
			setState(759);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(757);
				arrayInitializer();
				}
				break;
			case T__0:
			case HexColorLiteral:
			case CHAR_LITERAL:
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case NEW:
			case SHORT:
			case SUPER:
			case THIS:
			case VAR:
			case VOID:
			case DECIMAL_LITERAL:
			case HEX_LITERAL:
			case OCT_LITERAL:
			case BINARY_LITERAL:
			case FLOAT_LITERAL:
			case HEX_FLOAT_LITERAL:
			case BOOL_LITERAL:
			case STRING_LITERAL:
			case MULTI_STRING_LIT:
			case NULL_LITERAL:
			case LPAREN:
			case LT:
			case BANG:
			case TILDE:
			case INC:
			case DEC:
			case ADD:
			case SUB:
			case AT:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(758);
				expression(0);
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

	public static class ArrayInitializerContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(ProcessingParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(ProcessingParser.RBRACE, 0); }
		public List<VariableInitializerContext> variableInitializer() {
			return getRuleContexts(VariableInitializerContext.class);
		}
		public VariableInitializerContext variableInitializer(int i) {
			return getRuleContext(VariableInitializerContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ProcessingParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ProcessingParser.COMMA, i);
		}
		public ArrayInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).enterArrayInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).exitArrayInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProcessingVisitor ) return ((ProcessingVisitor<? extends T>)visitor).visitArrayInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayInitializerContext arrayInitializer() throws RecognitionException {
		ArrayInitializerContext _localctx = new ArrayInitializerContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_arrayInitializer);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(761);
			match(LBRACE);
			setState(773);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << HexColorLiteral) | (1L << CHAR_LITERAL) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VAR) | (1L << VOID) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (BOOL_LITERAL - 64)) | (1L << (STRING_LITERAL - 64)) | (1L << (MULTI_STRING_LIT - 64)) | (1L << (NULL_LITERAL - 64)) | (1L << (LPAREN - 64)) | (1L << (LBRACE - 64)) | (1L << (LT - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (AT - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
				{
				setState(762);
				variableInitializer();
				setState(767);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,85,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(763);
						match(COMMA);
						setState(764);
						variableInitializer();
						}
						} 
					}
					setState(769);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,85,_ctx);
				}
				setState(771);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(770);
					match(COMMA);
					}
				}

				}
			}

			setState(775);
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

	public static class ClassOrInterfaceTypeContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(ProcessingParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(ProcessingParser.IDENTIFIER, i);
		}
		public List<TypeArgumentsContext> typeArguments() {
			return getRuleContexts(TypeArgumentsContext.class);
		}
		public TypeArgumentsContext typeArguments(int i) {
			return getRuleContext(TypeArgumentsContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(ProcessingParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(ProcessingParser.DOT, i);
		}
		public ClassOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).enterClassOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).exitClassOrInterfaceType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProcessingVisitor ) return ((ProcessingVisitor<? extends T>)visitor).visitClassOrInterfaceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassOrInterfaceTypeContext classOrInterfaceType() throws RecognitionException {
		ClassOrInterfaceTypeContext _localctx = new ClassOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_classOrInterfaceType);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(777);
			match(IDENTIFIER);
			setState(779);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
			case 1:
				{
				setState(778);
				typeArguments();
				}
				break;
			}
			setState(788);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,90,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(781);
					match(DOT);
					setState(782);
					match(IDENTIFIER);
					setState(784);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
					case 1:
						{
						setState(783);
						typeArguments();
						}
						break;
					}
					}
					} 
				}
				setState(790);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,90,_ctx);
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

	public static class TypeArgumentContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public TerminalNode QUESTION() { return getToken(ProcessingParser.QUESTION, 0); }
		public TerminalNode EXTENDS() { return getToken(ProcessingParser.EXTENDS, 0); }
		public TerminalNode SUPER() { return getToken(ProcessingParser.SUPER, 0); }
		public TypeArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArgument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).enterTypeArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).exitTypeArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProcessingVisitor ) return ((ProcessingVisitor<? extends T>)visitor).visitTypeArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeArgumentContext typeArgument() throws RecognitionException {
		TypeArgumentContext _localctx = new TypeArgumentContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_typeArgument);
		int _la;
		try {
			setState(797);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
			case VAR:
			case AT:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(791);
				typeType();
				}
				break;
			case QUESTION:
				enterOuterAlt(_localctx, 2);
				{
				setState(792);
				match(QUESTION);
				setState(795);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EXTENDS || _la==SUPER) {
					{
					setState(793);
					_la = _input.LA(1);
					if ( !(_la==EXTENDS || _la==SUPER) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(794);
					typeType();
					}
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

	public static class QualifiedNameListContext extends ParserRuleContext {
		public List<QualifiedNameContext> qualifiedName() {
			return getRuleContexts(QualifiedNameContext.class);
		}
		public QualifiedNameContext qualifiedName(int i) {
			return getRuleContext(QualifiedNameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ProcessingParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ProcessingParser.COMMA, i);
		}
		public QualifiedNameListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedNameList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).enterQualifiedNameList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).exitQualifiedNameList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProcessingVisitor ) return ((ProcessingVisitor<? extends T>)visitor).visitQualifiedNameList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedNameListContext qualifiedNameList() throws RecognitionException {
		QualifiedNameListContext _localctx = new QualifiedNameListContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_qualifiedNameList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(799);
			qualifiedName();
			setState(804);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(800);
				match(COMMA);
				setState(801);
				qualifiedName();
				}
				}
				setState(806);
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

	public static class FormalParametersContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(ProcessingParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(ProcessingParser.RPAREN, 0); }
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public FormalParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).enterFormalParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).exitFormalParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProcessingVisitor ) return ((ProcessingVisitor<? extends T>)visitor).visitFormalParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParametersContext formalParameters() throws RecognitionException {
		FormalParametersContext _localctx = new FormalParametersContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_formalParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(807);
			match(LPAREN);
			setState(809);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT) | (1L << VAR))) != 0) || _la==AT || _la==IDENTIFIER) {
				{
				setState(808);
				formalParameterList();
				}
			}

			setState(811);
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

	public static class FormalParameterListContext extends ParserRuleContext {
		public List<FormalParameterContext> formalParameter() {
			return getRuleContexts(FormalParameterContext.class);
		}
		public FormalParameterContext formalParameter(int i) {
			return getRuleContext(FormalParameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ProcessingParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ProcessingParser.COMMA, i);
		}
		public LastFormalParameterContext lastFormalParameter() {
			return getRuleContext(LastFormalParameterContext.class,0);
		}
		public FormalParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).enterFormalParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).exitFormalParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProcessingVisitor ) return ((ProcessingVisitor<? extends T>)visitor).visitFormalParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParameterListContext formalParameterList() throws RecognitionException {
		FormalParameterListContext _localctx = new FormalParameterListContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_formalParameterList);
		int _la;
		try {
			int _alt;
			setState(826);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,97,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(813);
				formalParameter();
				setState(818);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,95,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(814);
						match(COMMA);
						setState(815);
						formalParameter();
						}
						} 
					}
					setState(820);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,95,_ctx);
				}
				setState(823);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(821);
					match(COMMA);
					setState(822);
					lastFormalParameter();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(825);
				lastFormalParameter();
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

	public static class FormalParameterContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public FormalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).enterFormalParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).exitFormalParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProcessingVisitor ) return ((ProcessingVisitor<? extends T>)visitor).visitFormalParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParameterContext formalParameter() throws RecognitionException {
		FormalParameterContext _localctx = new FormalParameterContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_formalParameter);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(831);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,98,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(828);
					variableModifier();
					}
					} 
				}
				setState(833);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,98,_ctx);
			}
			setState(834);
			typeType();
			setState(835);
			variableDeclaratorId();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LastFormalParameterContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public TerminalNode ELLIPSIS() { return getToken(ProcessingParser.ELLIPSIS, 0); }
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public LastFormalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lastFormalParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).enterLastFormalParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).exitLastFormalParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProcessingVisitor ) return ((ProcessingVisitor<? extends T>)visitor).visitLastFormalParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LastFormalParameterContext lastFormalParameter() throws RecognitionException {
		LastFormalParameterContext _localctx = new LastFormalParameterContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_lastFormalParameter);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(840);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,99,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(837);
					variableModifier();
					}
					} 
				}
				setState(842);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,99,_ctx);
			}
			setState(843);
			typeType();
			setState(844);
			match(ELLIPSIS);
			setState(845);
			variableDeclaratorId();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BaseStringLiteralContext extends ParserRuleContext {
		public TerminalNode STRING_LITERAL() { return getToken(ProcessingParser.STRING_LITERAL, 0); }
		public BaseStringLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_baseStringLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).enterBaseStringLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).exitBaseStringLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProcessingVisitor ) return ((ProcessingVisitor<? extends T>)visitor).visitBaseStringLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BaseStringLiteralContext baseStringLiteral() throws RecognitionException {
		BaseStringLiteralContext _localctx = new BaseStringLiteralContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_baseStringLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(847);
			match(STRING_LITERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MultilineStringLiteralContext extends ParserRuleContext {
		public TerminalNode MULTI_STRING_LIT() { return getToken(ProcessingParser.MULTI_STRING_LIT, 0); }
		public MultilineStringLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multilineStringLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).enterMultilineStringLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).exitMultilineStringLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProcessingVisitor ) return ((ProcessingVisitor<? extends T>)visitor).visitMultilineStringLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultilineStringLiteralContext multilineStringLiteral() throws RecognitionException {
		MultilineStringLiteralContext _localctx = new MultilineStringLiteralContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_multilineStringLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(849);
			match(MULTI_STRING_LIT);
			}
		}
		catch (RecognitionException re) {
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
		public BaseStringLiteralContext baseStringLiteral() {
			return getRuleContext(BaseStringLiteralContext.class,0);
		}
		public MultilineStringLiteralContext multilineStringLiteral() {
			return getRuleContext(MultilineStringLiteralContext.class,0);
		}
		public StringLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).enterStringLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).exitStringLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProcessingVisitor ) return ((ProcessingVisitor<? extends T>)visitor).visitStringLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringLiteralContext stringLiteral() throws RecognitionException {
		StringLiteralContext _localctx = new StringLiteralContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_stringLiteral);
		try {
			setState(853);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(851);
				baseStringLiteral();
				}
				break;
			case MULTI_STRING_LIT:
				enterOuterAlt(_localctx, 2);
				{
				setState(852);
				multilineStringLiteral();
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

	public static class IntegerLiteralContext extends ParserRuleContext {
		public TerminalNode DECIMAL_LITERAL() { return getToken(ProcessingParser.DECIMAL_LITERAL, 0); }
		public TerminalNode HEX_LITERAL() { return getToken(ProcessingParser.HEX_LITERAL, 0); }
		public TerminalNode OCT_LITERAL() { return getToken(ProcessingParser.OCT_LITERAL, 0); }
		public TerminalNode BINARY_LITERAL() { return getToken(ProcessingParser.BINARY_LITERAL, 0); }
		public IntegerLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integerLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).enterIntegerLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).exitIntegerLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProcessingVisitor ) return ((ProcessingVisitor<? extends T>)visitor).visitIntegerLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntegerLiteralContext integerLiteral() throws RecognitionException {
		IntegerLiteralContext _localctx = new IntegerLiteralContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_integerLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(855);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL))) != 0)) ) {
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

	public static class FloatLiteralContext extends ParserRuleContext {
		public TerminalNode FLOAT_LITERAL() { return getToken(ProcessingParser.FLOAT_LITERAL, 0); }
		public TerminalNode HEX_FLOAT_LITERAL() { return getToken(ProcessingParser.HEX_FLOAT_LITERAL, 0); }
		public FloatLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floatLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).enterFloatLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).exitFloatLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProcessingVisitor ) return ((ProcessingVisitor<? extends T>)visitor).visitFloatLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FloatLiteralContext floatLiteral() throws RecognitionException {
		FloatLiteralContext _localctx = new FloatLiteralContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_floatLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(857);
			_la = _input.LA(1);
			if ( !(_la==FLOAT_LITERAL || _la==HEX_FLOAT_LITERAL) ) {
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

	public static class AnnotationContext extends ParserRuleContext {
		public TerminalNode AT() { return getToken(ProcessingParser.AT, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(ProcessingParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(ProcessingParser.RPAREN, 0); }
		public ElementValuePairsContext elementValuePairs() {
			return getRuleContext(ElementValuePairsContext.class,0);
		}
		public ElementValueContext elementValue() {
			return getRuleContext(ElementValueContext.class,0);
		}
		public AnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).enterAnnotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).exitAnnotation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProcessingVisitor ) return ((ProcessingVisitor<? extends T>)visitor).visitAnnotation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationContext annotation() throws RecognitionException {
		AnnotationContext _localctx = new AnnotationContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_annotation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(859);
			match(AT);
			setState(860);
			qualifiedName();
			setState(867);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(861);
				match(LPAREN);
				setState(864);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
				case 1:
					{
					setState(862);
					elementValuePairs();
					}
					break;
				case 2:
					{
					setState(863);
					elementValue();
					}
					break;
				}
				setState(866);
				match(RPAREN);
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

	public static class ElementValuePairsContext extends ParserRuleContext {
		public List<ElementValuePairContext> elementValuePair() {
			return getRuleContexts(ElementValuePairContext.class);
		}
		public ElementValuePairContext elementValuePair(int i) {
			return getRuleContext(ElementValuePairContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ProcessingParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ProcessingParser.COMMA, i);
		}
		public ElementValuePairsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValuePairs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).enterElementValuePairs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).exitElementValuePairs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProcessingVisitor ) return ((ProcessingVisitor<? extends T>)visitor).visitElementValuePairs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementValuePairsContext elementValuePairs() throws RecognitionException {
		ElementValuePairsContext _localctx = new ElementValuePairsContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_elementValuePairs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(869);
			elementValuePair();
			setState(874);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(870);
				match(COMMA);
				setState(871);
				elementValuePair();
				}
				}
				setState(876);
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

	public static class ElementValuePairContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ProcessingParser.IDENTIFIER, 0); }
		public TerminalNode ASSIGN() { return getToken(ProcessingParser.ASSIGN, 0); }
		public ElementValueContext elementValue() {
			return getRuleContext(ElementValueContext.class,0);
		}
		public ElementValuePairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValuePair; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).enterElementValuePair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).exitElementValuePair(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProcessingVisitor ) return ((ProcessingVisitor<? extends T>)visitor).visitElementValuePair(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementValuePairContext elementValuePair() throws RecognitionException {
		ElementValuePairContext _localctx = new ElementValuePairContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_elementValuePair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(877);
			match(IDENTIFIER);
			setState(878);
			match(ASSIGN);
			setState(879);
			elementValue();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementValueContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public ElementValueArrayInitializerContext elementValueArrayInitializer() {
			return getRuleContext(ElementValueArrayInitializerContext.class,0);
		}
		public ElementValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).enterElementValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).exitElementValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProcessingVisitor ) return ((ProcessingVisitor<? extends T>)visitor).visitElementValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementValueContext elementValue() throws RecognitionException {
		ElementValueContext _localctx = new ElementValueContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_elementValue);
		try {
			setState(884);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,104,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(881);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(882);
				annotation();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(883);
				elementValueArrayInitializer();
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

	public static class ElementValueArrayInitializerContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(ProcessingParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(ProcessingParser.RBRACE, 0); }
		public List<ElementValueContext> elementValue() {
			return getRuleContexts(ElementValueContext.class);
		}
		public ElementValueContext elementValue(int i) {
			return getRuleContext(ElementValueContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ProcessingParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ProcessingParser.COMMA, i);
		}
		public ElementValueArrayInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValueArrayInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).enterElementValueArrayInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).exitElementValueArrayInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProcessingVisitor ) return ((ProcessingVisitor<? extends T>)visitor).visitElementValueArrayInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementValueArrayInitializerContext elementValueArrayInitializer() throws RecognitionException {
		ElementValueArrayInitializerContext _localctx = new ElementValueArrayInitializerContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_elementValueArrayInitializer);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(886);
			match(LBRACE);
			setState(895);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << HexColorLiteral) | (1L << CHAR_LITERAL) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VAR) | (1L << VOID) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (BOOL_LITERAL - 64)) | (1L << (STRING_LITERAL - 64)) | (1L << (MULTI_STRING_LIT - 64)) | (1L << (NULL_LITERAL - 64)) | (1L << (LPAREN - 64)) | (1L << (LBRACE - 64)) | (1L << (LT - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (AT - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
				{
				setState(887);
				elementValue();
				setState(892);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,105,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(888);
						match(COMMA);
						setState(889);
						elementValue();
						}
						} 
					}
					setState(894);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,105,_ctx);
				}
				}
			}

			setState(898);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(897);
				match(COMMA);
				}
			}

			setState(900);
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

	public static class AnnotationTypeDeclarationContext extends ParserRuleContext {
		public TerminalNode AT() { return getToken(ProcessingParser.AT, 0); }
		public TerminalNode INTERFACE() { return getToken(ProcessingParser.INTERFACE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(ProcessingParser.IDENTIFIER, 0); }
		public AnnotationTypeBodyContext annotationTypeBody() {
			return getRuleContext(AnnotationTypeBodyContext.class,0);
		}
		public AnnotationTypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).enterAnnotationTypeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).exitAnnotationTypeDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProcessingVisitor ) return ((ProcessingVisitor<? extends T>)visitor).visitAnnotationTypeDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationTypeDeclarationContext annotationTypeDeclaration() throws RecognitionException {
		AnnotationTypeDeclarationContext _localctx = new AnnotationTypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_annotationTypeDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(902);
			match(AT);
			setState(903);
			match(INTERFACE);
			setState(904);
			match(IDENTIFIER);
			setState(905);
			annotationTypeBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationTypeBodyContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(ProcessingParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(ProcessingParser.RBRACE, 0); }
		public List<AnnotationTypeElementDeclarationContext> annotationTypeElementDeclaration() {
			return getRuleContexts(AnnotationTypeElementDeclarationContext.class);
		}
		public AnnotationTypeElementDeclarationContext annotationTypeElementDeclaration(int i) {
			return getRuleContext(AnnotationTypeElementDeclarationContext.class,i);
		}
		public AnnotationTypeBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).enterAnnotationTypeBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).exitAnnotationTypeBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProcessingVisitor ) return ((ProcessingVisitor<? extends T>)visitor).visitAnnotationTypeBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationTypeBodyContext annotationTypeBody() throws RecognitionException {
		AnnotationTypeBodyContext _localctx = new AnnotationTypeBodyContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_annotationTypeBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(907);
			match(LBRACE);
			setState(911);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VAR) | (1L << VOLATILE))) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (SEMI - 74)) | (1L << (AT - 74)) | (1L << (IDENTIFIER - 74)))) != 0)) {
				{
				{
				setState(908);
				annotationTypeElementDeclaration();
				}
				}
				setState(913);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(914);
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

	public static class AnnotationTypeElementDeclarationContext extends ParserRuleContext {
		public AnnotationTypeElementRestContext annotationTypeElementRest() {
			return getRuleContext(AnnotationTypeElementRestContext.class,0);
		}
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public TerminalNode SEMI() { return getToken(ProcessingParser.SEMI, 0); }
		public AnnotationTypeElementDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeElementDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).enterAnnotationTypeElementDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).exitAnnotationTypeElementDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProcessingVisitor ) return ((ProcessingVisitor<? extends T>)visitor).visitAnnotationTypeElementDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationTypeElementDeclarationContext annotationTypeElementDeclaration() throws RecognitionException {
		AnnotationTypeElementDeclarationContext _localctx = new AnnotationTypeElementDeclarationContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_annotationTypeElementDeclaration);
		try {
			int _alt;
			setState(924);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case ABSTRACT:
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case CLASS:
			case DOUBLE:
			case ENUM:
			case FINAL:
			case FLOAT:
			case INT:
			case INTERFACE:
			case LONG:
			case NATIVE:
			case PRIVATE:
			case PROTECTED:
			case PUBLIC:
			case SHORT:
			case STATIC:
			case STRICTFP:
			case SYNCHRONIZED:
			case TRANSIENT:
			case VAR:
			case VOLATILE:
			case AT:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(919);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,109,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(916);
						modifier();
						}
						} 
					}
					setState(921);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,109,_ctx);
				}
				setState(922);
				annotationTypeElementRest();
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(923);
				match(SEMI);
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

	public static class AnnotationTypeElementRestContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public AnnotationMethodOrConstantRestContext annotationMethodOrConstantRest() {
			return getRuleContext(AnnotationMethodOrConstantRestContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(ProcessingParser.SEMI, 0); }
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public EnumDeclarationContext enumDeclaration() {
			return getRuleContext(EnumDeclarationContext.class,0);
		}
		public AnnotationTypeDeclarationContext annotationTypeDeclaration() {
			return getRuleContext(AnnotationTypeDeclarationContext.class,0);
		}
		public AnnotationTypeElementRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeElementRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).enterAnnotationTypeElementRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).exitAnnotationTypeElementRest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProcessingVisitor ) return ((ProcessingVisitor<? extends T>)visitor).visitAnnotationTypeElementRest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationTypeElementRestContext annotationTypeElementRest() throws RecognitionException {
		AnnotationTypeElementRestContext _localctx = new AnnotationTypeElementRestContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_annotationTypeElementRest);
		try {
			setState(946);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,115,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(926);
				typeType();
				setState(927);
				annotationMethodOrConstantRest();
				setState(928);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(930);
				classDeclaration();
				setState(932);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,111,_ctx) ) {
				case 1:
					{
					setState(931);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(934);
				interfaceDeclaration();
				setState(936);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,112,_ctx) ) {
				case 1:
					{
					setState(935);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(938);
				enumDeclaration();
				setState(940);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,113,_ctx) ) {
				case 1:
					{
					setState(939);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(942);
				annotationTypeDeclaration();
				setState(944);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,114,_ctx) ) {
				case 1:
					{
					setState(943);
					match(SEMI);
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

	public static class AnnotationMethodOrConstantRestContext extends ParserRuleContext {
		public AnnotationMethodRestContext annotationMethodRest() {
			return getRuleContext(AnnotationMethodRestContext.class,0);
		}
		public AnnotationConstantRestContext annotationConstantRest() {
			return getRuleContext(AnnotationConstantRestContext.class,0);
		}
		public AnnotationMethodOrConstantRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationMethodOrConstantRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).enterAnnotationMethodOrConstantRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).exitAnnotationMethodOrConstantRest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProcessingVisitor ) return ((ProcessingVisitor<? extends T>)visitor).visitAnnotationMethodOrConstantRest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationMethodOrConstantRestContext annotationMethodOrConstantRest() throws RecognitionException {
		AnnotationMethodOrConstantRestContext _localctx = new AnnotationMethodOrConstantRestContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_annotationMethodOrConstantRest);
		try {
			setState(950);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,116,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(948);
				annotationMethodRest();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(949);
				annotationConstantRest();
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

	public static class AnnotationMethodRestContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ProcessingParser.IDENTIFIER, 0); }
		public TerminalNode LPAREN() { return getToken(ProcessingParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(ProcessingParser.RPAREN, 0); }
		public DefaultValueContext defaultValue() {
			return getRuleContext(DefaultValueContext.class,0);
		}
		public AnnotationMethodRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationMethodRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).enterAnnotationMethodRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).exitAnnotationMethodRest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProcessingVisitor ) return ((ProcessingVisitor<? extends T>)visitor).visitAnnotationMethodRest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationMethodRestContext annotationMethodRest() throws RecognitionException {
		AnnotationMethodRestContext _localctx = new AnnotationMethodRestContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_annotationMethodRest);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(952);
			match(IDENTIFIER);
			setState(953);
			match(LPAREN);
			setState(954);
			match(RPAREN);
			setState(956);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DEFAULT) {
				{
				setState(955);
				defaultValue();
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

	public static class AnnotationConstantRestContext extends ParserRuleContext {
		public VariableDeclaratorsContext variableDeclarators() {
			return getRuleContext(VariableDeclaratorsContext.class,0);
		}
		public AnnotationConstantRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationConstantRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).enterAnnotationConstantRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).exitAnnotationConstantRest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProcessingVisitor ) return ((ProcessingVisitor<? extends T>)visitor).visitAnnotationConstantRest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationConstantRestContext annotationConstantRest() throws RecognitionException {
		AnnotationConstantRestContext _localctx = new AnnotationConstantRestContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_annotationConstantRest);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(958);
			variableDeclarators();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefaultValueContext extends ParserRuleContext {
		public TerminalNode DEFAULT() { return getToken(ProcessingParser.DEFAULT, 0); }
		public ElementValueContext elementValue() {
			return getRuleContext(ElementValueContext.class,0);
		}
		public DefaultValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defaultValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).enterDefaultValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).exitDefaultValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProcessingVisitor ) return ((ProcessingVisitor<? extends T>)visitor).visitDefaultValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefaultValueContext defaultValue() throws RecognitionException {
		DefaultValueContext _localctx = new DefaultValueContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_defaultValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(960);
			match(DEFAULT);
			setState(961);
			elementValue();
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode LBRACE() { return getToken(ProcessingParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(ProcessingParser.RBRACE, 0); }
		public List<BlockStatementContext> blockStatement() {
			return getRuleContexts(BlockStatementContext.class);
		}
		public BlockStatementContext blockStatement(int i) {
			return getRuleContext(BlockStatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProcessingVisitor ) return ((ProcessingVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(963);
			match(LBRACE);
			setState(967);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << HexColorLiteral) | (1L << CHAR_LITERAL) | (1L << ABSTRACT) | (1L << ASSERT) | (1L << BOOLEAN) | (1L << BREAK) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << CONTINUE) | (1L << DO) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << FOR) | (1L << IF) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NEW) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << RETURN) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SUPER) | (1L << SWITCH) | (1L << SYNCHRONIZED) | (1L << THIS) | (1L << THROW) | (1L << TRY) | (1L << VAR) | (1L << VOID) | (1L << WHILE) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (BOOL_LITERAL - 64)) | (1L << (STRING_LITERAL - 64)) | (1L << (MULTI_STRING_LIT - 64)) | (1L << (NULL_LITERAL - 64)) | (1L << (LPAREN - 64)) | (1L << (LBRACE - 64)) | (1L << (SEMI - 64)) | (1L << (LT - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (AT - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
				{
				{
				setState(964);
				blockStatement();
				}
				}
				setState(969);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(970);
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

	public static class BlockStatementContext extends ParserRuleContext {
		public LocalVariableDeclarationContext localVariableDeclaration() {
			return getRuleContext(LocalVariableDeclarationContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(ProcessingParser.SEMI, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public LocalTypeDeclarationContext localTypeDeclaration() {
			return getRuleContext(LocalTypeDeclarationContext.class,0);
		}
		public BlockStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).enterBlockStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).exitBlockStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProcessingVisitor ) return ((ProcessingVisitor<? extends T>)visitor).visitBlockStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockStatementContext blockStatement() throws RecognitionException {
		BlockStatementContext _localctx = new BlockStatementContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_blockStatement);
		try {
			setState(977);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,119,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(972);
				localVariableDeclaration();
				setState(973);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(975);
				statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(976);
				localTypeDeclaration();
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

	public static class LocalVariableDeclarationContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public VariableDeclaratorsContext variableDeclarators() {
			return getRuleContext(VariableDeclaratorsContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public LocalVariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localVariableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).enterLocalVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).exitLocalVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProcessingVisitor ) return ((ProcessingVisitor<? extends T>)visitor).visitLocalVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocalVariableDeclarationContext localVariableDeclaration() throws RecognitionException {
		LocalVariableDeclarationContext _localctx = new LocalVariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_localVariableDeclaration);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(982);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,120,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(979);
					variableModifier();
					}
					} 
				}
				setState(984);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,120,_ctx);
			}
			setState(985);
			typeType();
			setState(986);
			variableDeclarators();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LocalTypeDeclarationContext extends ParserRuleContext {
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public List<ClassOrInterfaceModifierContext> classOrInterfaceModifier() {
			return getRuleContexts(ClassOrInterfaceModifierContext.class);
		}
		public ClassOrInterfaceModifierContext classOrInterfaceModifier(int i) {
			return getRuleContext(ClassOrInterfaceModifierContext.class,i);
		}
		public TerminalNode SEMI() { return getToken(ProcessingParser.SEMI, 0); }
		public LocalTypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localTypeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).enterLocalTypeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).exitLocalTypeDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProcessingVisitor ) return ((ProcessingVisitor<? extends T>)visitor).visitLocalTypeDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocalTypeDeclarationContext localTypeDeclaration() throws RecognitionException {
		LocalTypeDeclarationContext _localctx = new LocalTypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_localTypeDeclaration);
		int _la;
		try {
			setState(999);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ABSTRACT:
			case CLASS:
			case FINAL:
			case INTERFACE:
			case PRIVATE:
			case PROTECTED:
			case PUBLIC:
			case STATIC:
			case STRICTFP:
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(991);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << FINAL) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0) || _la==AT) {
					{
					{
					setState(988);
					classOrInterfaceModifier();
					}
					}
					setState(993);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(996);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CLASS:
					{
					setState(994);
					classDeclaration();
					}
					break;
				case INTERFACE:
					{
					setState(995);
					interfaceDeclaration();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(998);
				match(SEMI);
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

	public static class StatementContext extends ParserRuleContext {
		public BlockContext blockLabel;
		public ExpressionContext statementExpression;
		public Token identifierLabel;
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode ASSERT() { return getToken(ProcessingParser.ASSERT, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode SEMI() { return getToken(ProcessingParser.SEMI, 0); }
		public TerminalNode COLON() { return getToken(ProcessingParser.COLON, 0); }
		public TerminalNode IF() { return getToken(ProcessingParser.IF, 0); }
		public ParExpressionContext parExpression() {
			return getRuleContext(ParExpressionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(ProcessingParser.ELSE, 0); }
		public TerminalNode FOR() { return getToken(ProcessingParser.FOR, 0); }
		public TerminalNode LPAREN() { return getToken(ProcessingParser.LPAREN, 0); }
		public ForControlContext forControl() {
			return getRuleContext(ForControlContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ProcessingParser.RPAREN, 0); }
		public TerminalNode WHILE() { return getToken(ProcessingParser.WHILE, 0); }
		public TerminalNode DO() { return getToken(ProcessingParser.DO, 0); }
		public TerminalNode TRY() { return getToken(ProcessingParser.TRY, 0); }
		public FinallyBlockContext finallyBlock() {
			return getRuleContext(FinallyBlockContext.class,0);
		}
		public List<CatchClauseContext> catchClause() {
			return getRuleContexts(CatchClauseContext.class);
		}
		public CatchClauseContext catchClause(int i) {
			return getRuleContext(CatchClauseContext.class,i);
		}
		public ResourceSpecificationContext resourceSpecification() {
			return getRuleContext(ResourceSpecificationContext.class,0);
		}
		public TerminalNode SWITCH() { return getToken(ProcessingParser.SWITCH, 0); }
		public TerminalNode LBRACE() { return getToken(ProcessingParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(ProcessingParser.RBRACE, 0); }
		public List<SwitchBlockStatementGroupContext> switchBlockStatementGroup() {
			return getRuleContexts(SwitchBlockStatementGroupContext.class);
		}
		public SwitchBlockStatementGroupContext switchBlockStatementGroup(int i) {
			return getRuleContext(SwitchBlockStatementGroupContext.class,i);
		}
		public List<SwitchLabelContext> switchLabel() {
			return getRuleContexts(SwitchLabelContext.class);
		}
		public SwitchLabelContext switchLabel(int i) {
			return getRuleContext(SwitchLabelContext.class,i);
		}
		public TerminalNode SYNCHRONIZED() { return getToken(ProcessingParser.SYNCHRONIZED, 0); }
		public TerminalNode RETURN() { return getToken(ProcessingParser.RETURN, 0); }
		public TerminalNode THROW() { return getToken(ProcessingParser.THROW, 0); }
		public TerminalNode BREAK() { return getToken(ProcessingParser.BREAK, 0); }
		public TerminalNode IDENTIFIER() { return getToken(ProcessingParser.IDENTIFIER, 0); }
		public TerminalNode CONTINUE() { return getToken(ProcessingParser.CONTINUE, 0); }
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProcessingVisitor ) return ((ProcessingVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_statement);
		int _la;
		try {
			int _alt;
			setState(1105);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,136,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1001);
				((StatementContext)_localctx).blockLabel = block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1002);
				match(ASSERT);
				setState(1003);
				expression(0);
				setState(1006);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(1004);
					match(COLON);
					setState(1005);
					expression(0);
					}
				}

				setState(1008);
				match(SEMI);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1010);
				match(IF);
				setState(1011);
				parExpression();
				setState(1012);
				statement();
				setState(1015);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,125,_ctx) ) {
				case 1:
					{
					setState(1013);
					match(ELSE);
					setState(1014);
					statement();
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1017);
				match(FOR);
				setState(1018);
				match(LPAREN);
				setState(1019);
				forControl();
				setState(1020);
				match(RPAREN);
				setState(1021);
				statement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1023);
				match(WHILE);
				setState(1024);
				parExpression();
				setState(1025);
				statement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1027);
				match(DO);
				setState(1028);
				statement();
				setState(1029);
				match(WHILE);
				setState(1030);
				parExpression();
				setState(1031);
				match(SEMI);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1033);
				match(TRY);
				setState(1034);
				block();
				setState(1044);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CATCH:
					{
					setState(1036); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(1035);
						catchClause();
						}
						}
						setState(1038); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==CATCH );
					setState(1041);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==FINALLY) {
						{
						setState(1040);
						finallyBlock();
						}
					}

					}
					break;
				case FINALLY:
					{
					setState(1043);
					finallyBlock();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1046);
				match(TRY);
				setState(1047);
				resourceSpecification();
				setState(1048);
				block();
				setState(1052);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CATCH) {
					{
					{
					setState(1049);
					catchClause();
					}
					}
					setState(1054);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1056);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FINALLY) {
					{
					setState(1055);
					finallyBlock();
					}
				}

				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1058);
				match(SWITCH);
				setState(1059);
				parExpression();
				setState(1060);
				match(LBRACE);
				setState(1064);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,131,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1061);
						switchBlockStatementGroup();
						}
						} 
					}
					setState(1066);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,131,_ctx);
				}
				setState(1070);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CASE || _la==DEFAULT) {
					{
					{
					setState(1067);
					switchLabel();
					}
					}
					setState(1072);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1073);
				match(RBRACE);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1075);
				match(SYNCHRONIZED);
				setState(1076);
				parExpression();
				setState(1077);
				block();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1079);
				match(RETURN);
				setState(1081);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << HexColorLiteral) | (1L << CHAR_LITERAL) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VAR) | (1L << VOID) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (BOOL_LITERAL - 64)) | (1L << (STRING_LITERAL - 64)) | (1L << (MULTI_STRING_LIT - 64)) | (1L << (NULL_LITERAL - 64)) | (1L << (LPAREN - 64)) | (1L << (LT - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (AT - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
					{
					setState(1080);
					expression(0);
					}
				}

				setState(1083);
				match(SEMI);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1084);
				match(THROW);
				setState(1085);
				expression(0);
				setState(1086);
				match(SEMI);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1088);
				match(BREAK);
				setState(1090);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(1089);
					match(IDENTIFIER);
					}
				}

				setState(1092);
				match(SEMI);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(1093);
				match(CONTINUE);
				setState(1095);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(1094);
					match(IDENTIFIER);
					}
				}

				setState(1097);
				match(SEMI);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(1098);
				match(SEMI);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(1099);
				((StatementContext)_localctx).statementExpression = expression(0);
				setState(1100);
				match(SEMI);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(1102);
				((StatementContext)_localctx).identifierLabel = match(IDENTIFIER);
				setState(1103);
				match(COLON);
				setState(1104);
				statement();
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

	public static class CatchClauseContext extends ParserRuleContext {
		public TerminalNode CATCH() { return getToken(ProcessingParser.CATCH, 0); }
		public TerminalNode LPAREN() { return getToken(ProcessingParser.LPAREN, 0); }
		public CatchTypeContext catchType() {
			return getRuleContext(CatchTypeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(ProcessingParser.IDENTIFIER, 0); }
		public TerminalNode RPAREN() { return getToken(ProcessingParser.RPAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public CatchClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).enterCatchClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).exitCatchClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProcessingVisitor ) return ((ProcessingVisitor<? extends T>)visitor).visitCatchClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CatchClauseContext catchClause() throws RecognitionException {
		CatchClauseContext _localctx = new CatchClauseContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_catchClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1107);
			match(CATCH);
			setState(1108);
			match(LPAREN);
			setState(1112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(1109);
				variableModifier();
				}
				}
				setState(1114);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1115);
			catchType();
			setState(1116);
			match(IDENTIFIER);
			setState(1117);
			match(RPAREN);
			setState(1118);
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

	public static class CatchTypeContext extends ParserRuleContext {
		public List<QualifiedNameContext> qualifiedName() {
			return getRuleContexts(QualifiedNameContext.class);
		}
		public QualifiedNameContext qualifiedName(int i) {
			return getRuleContext(QualifiedNameContext.class,i);
		}
		public List<TerminalNode> BITOR() { return getTokens(ProcessingParser.BITOR); }
		public TerminalNode BITOR(int i) {
			return getToken(ProcessingParser.BITOR, i);
		}
		public CatchTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).enterCatchType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).exitCatchType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProcessingVisitor ) return ((ProcessingVisitor<? extends T>)visitor).visitCatchType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CatchTypeContext catchType() throws RecognitionException {
		CatchTypeContext _localctx = new CatchTypeContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_catchType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1120);
			qualifiedName();
			setState(1125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BITOR) {
				{
				{
				setState(1121);
				match(BITOR);
				setState(1122);
				qualifiedName();
				}
				}
				setState(1127);
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

	public static class FinallyBlockContext extends ParserRuleContext {
		public TerminalNode FINALLY() { return getToken(ProcessingParser.FINALLY, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FinallyBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_finallyBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).enterFinallyBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).exitFinallyBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProcessingVisitor ) return ((ProcessingVisitor<? extends T>)visitor).visitFinallyBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FinallyBlockContext finallyBlock() throws RecognitionException {
		FinallyBlockContext _localctx = new FinallyBlockContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_finallyBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1128);
			match(FINALLY);
			setState(1129);
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

	public static class ResourceSpecificationContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(ProcessingParser.LPAREN, 0); }
		public ResourcesContext resources() {
			return getRuleContext(ResourcesContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ProcessingParser.RPAREN, 0); }
		public TerminalNode SEMI() { return getToken(ProcessingParser.SEMI, 0); }
		public ResourceSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resourceSpecification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).enterResourceSpecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).exitResourceSpecification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProcessingVisitor ) return ((ProcessingVisitor<? extends T>)visitor).visitResourceSpecification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ResourceSpecificationContext resourceSpecification() throws RecognitionException {
		ResourceSpecificationContext _localctx = new ResourceSpecificationContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_resourceSpecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1131);
			match(LPAREN);
			setState(1132);
			resources();
			setState(1134);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(1133);
				match(SEMI);
				}
			}

			setState(1136);
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

	public static class ResourcesContext extends ParserRuleContext {
		public List<ResourceContext> resource() {
			return getRuleContexts(ResourceContext.class);
		}
		public ResourceContext resource(int i) {
			return getRuleContext(ResourceContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(ProcessingParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(ProcessingParser.SEMI, i);
		}
		public ResourcesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resources; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).enterResources(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).exitResources(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProcessingVisitor ) return ((ProcessingVisitor<? extends T>)visitor).visitResources(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ResourcesContext resources() throws RecognitionException {
		ResourcesContext _localctx = new ResourcesContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_resources);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1138);
			resource();
			setState(1143);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,140,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1139);
					match(SEMI);
					setState(1140);
					resource();
					}
					} 
				}
				setState(1145);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,140,_ctx);
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

	public static class ResourceContext extends ParserRuleContext {
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(ProcessingParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public ResourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resource; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).enterResource(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).exitResource(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProcessingVisitor ) return ((ProcessingVisitor<? extends T>)visitor).visitResource(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ResourceContext resource() throws RecognitionException {
		ResourceContext _localctx = new ResourceContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_resource);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1149);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(1146);
				variableModifier();
				}
				}
				setState(1151);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1152);
			classOrInterfaceType();
			setState(1153);
			variableDeclaratorId();
			setState(1154);
			match(ASSIGN);
			setState(1155);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchBlockStatementGroupContext extends ParserRuleContext {
		public List<SwitchLabelContext> switchLabel() {
			return getRuleContexts(SwitchLabelContext.class);
		}
		public SwitchLabelContext switchLabel(int i) {
			return getRuleContext(SwitchLabelContext.class,i);
		}
		public List<BlockStatementContext> blockStatement() {
			return getRuleContexts(BlockStatementContext.class);
		}
		public BlockStatementContext blockStatement(int i) {
			return getRuleContext(BlockStatementContext.class,i);
		}
		public SwitchBlockStatementGroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchBlockStatementGroup; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).enterSwitchBlockStatementGroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).exitSwitchBlockStatementGroup(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProcessingVisitor ) return ((ProcessingVisitor<? extends T>)visitor).visitSwitchBlockStatementGroup(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchBlockStatementGroupContext switchBlockStatementGroup() throws RecognitionException {
		SwitchBlockStatementGroupContext _localctx = new SwitchBlockStatementGroupContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_switchBlockStatementGroup);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1158); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1157);
				switchLabel();
				}
				}
				setState(1160); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CASE || _la==DEFAULT );
			setState(1163); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1162);
				blockStatement();
				}
				}
				setState(1165); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << HexColorLiteral) | (1L << CHAR_LITERAL) | (1L << ABSTRACT) | (1L << ASSERT) | (1L << BOOLEAN) | (1L << BREAK) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << CONTINUE) | (1L << DO) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << FOR) | (1L << IF) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NEW) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << RETURN) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SUPER) | (1L << SWITCH) | (1L << SYNCHRONIZED) | (1L << THIS) | (1L << THROW) | (1L << TRY) | (1L << VAR) | (1L << VOID) | (1L << WHILE) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (BOOL_LITERAL - 64)) | (1L << (STRING_LITERAL - 64)) | (1L << (MULTI_STRING_LIT - 64)) | (1L << (NULL_LITERAL - 64)) | (1L << (LPAREN - 64)) | (1L << (LBRACE - 64)) | (1L << (SEMI - 64)) | (1L << (LT - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (AT - 64)) | (1L << (IDENTIFIER - 64)))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchLabelContext extends ParserRuleContext {
		public ExpressionContext constantExpression;
		public Token enumConstantName;
		public TerminalNode CASE() { return getToken(ProcessingParser.CASE, 0); }
		public TerminalNode COLON() { return getToken(ProcessingParser.COLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(ProcessingParser.IDENTIFIER, 0); }
		public TerminalNode DEFAULT() { return getToken(ProcessingParser.DEFAULT, 0); }
		public SwitchLabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchLabel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).enterSwitchLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).exitSwitchLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProcessingVisitor ) return ((ProcessingVisitor<? extends T>)visitor).visitSwitchLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchLabelContext switchLabel() throws RecognitionException {
		SwitchLabelContext _localctx = new SwitchLabelContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_switchLabel);
		try {
			setState(1175);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CASE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1167);
				match(CASE);
				setState(1170);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,144,_ctx) ) {
				case 1:
					{
					setState(1168);
					((SwitchLabelContext)_localctx).constantExpression = expression(0);
					}
					break;
				case 2:
					{
					setState(1169);
					((SwitchLabelContext)_localctx).enumConstantName = match(IDENTIFIER);
					}
					break;
				}
				setState(1172);
				match(COLON);
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1173);
				match(DEFAULT);
				setState(1174);
				match(COLON);
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

	public static class ForControlContext extends ParserRuleContext {
		public ExpressionListContext forUpdate;
		public EnhancedForControlContext enhancedForControl() {
			return getRuleContext(EnhancedForControlContext.class,0);
		}
		public List<TerminalNode> SEMI() { return getTokens(ProcessingParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(ProcessingParser.SEMI, i);
		}
		public ForInitContext forInit() {
			return getRuleContext(ForInitContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ForControlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forControl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).enterForControl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).exitForControl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProcessingVisitor ) return ((ProcessingVisitor<? extends T>)visitor).visitForControl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForControlContext forControl() throws RecognitionException {
		ForControlContext _localctx = new ForControlContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_forControl);
		int _la;
		try {
			setState(1189);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,149,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1177);
				enhancedForControl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1179);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << HexColorLiteral) | (1L << CHAR_LITERAL) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VAR) | (1L << VOID) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (BOOL_LITERAL - 64)) | (1L << (STRING_LITERAL - 64)) | (1L << (MULTI_STRING_LIT - 64)) | (1L << (NULL_LITERAL - 64)) | (1L << (LPAREN - 64)) | (1L << (LT - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (AT - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
					{
					setState(1178);
					forInit();
					}
				}

				setState(1181);
				match(SEMI);
				setState(1183);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << HexColorLiteral) | (1L << CHAR_LITERAL) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VAR) | (1L << VOID) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (BOOL_LITERAL - 64)) | (1L << (STRING_LITERAL - 64)) | (1L << (MULTI_STRING_LIT - 64)) | (1L << (NULL_LITERAL - 64)) | (1L << (LPAREN - 64)) | (1L << (LT - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (AT - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
					{
					setState(1182);
					expression(0);
					}
				}

				setState(1185);
				match(SEMI);
				setState(1187);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << HexColorLiteral) | (1L << CHAR_LITERAL) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VAR) | (1L << VOID) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (BOOL_LITERAL - 64)) | (1L << (STRING_LITERAL - 64)) | (1L << (MULTI_STRING_LIT - 64)) | (1L << (NULL_LITERAL - 64)) | (1L << (LPAREN - 64)) | (1L << (LT - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (AT - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
					{
					setState(1186);
					((ForControlContext)_localctx).forUpdate = expressionList();
					}
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

	public static class ForInitContext extends ParserRuleContext {
		public LocalVariableDeclarationContext localVariableDeclaration() {
			return getRuleContext(LocalVariableDeclarationContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ForInitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forInit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).enterForInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).exitForInit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProcessingVisitor ) return ((ProcessingVisitor<? extends T>)visitor).visitForInit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForInitContext forInit() throws RecognitionException {
		ForInitContext _localctx = new ForInitContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_forInit);
		try {
			setState(1193);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,150,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1191);
				localVariableDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1192);
				expressionList();
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

	public static class EnhancedForControlContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public TerminalNode COLON() { return getToken(ProcessingParser.COLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public EnhancedForControlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enhancedForControl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).enterEnhancedForControl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).exitEnhancedForControl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProcessingVisitor ) return ((ProcessingVisitor<? extends T>)visitor).visitEnhancedForControl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnhancedForControlContext enhancedForControl() throws RecognitionException {
		EnhancedForControlContext _localctx = new EnhancedForControlContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_enhancedForControl);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1198);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,151,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1195);
					variableModifier();
					}
					} 
				}
				setState(1200);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,151,_ctx);
			}
			setState(1201);
			typeType();
			setState(1202);
			variableDeclaratorId();
			setState(1203);
			match(COLON);
			setState(1204);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParExpressionContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(ProcessingParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ProcessingParser.RPAREN, 0); }
		public ParExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).enterParExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).exitParExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProcessingVisitor ) return ((ProcessingVisitor<? extends T>)visitor).visitParExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParExpressionContext parExpression() throws RecognitionException {
		ParExpressionContext _localctx = new ParExpressionContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_parExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1206);
			match(LPAREN);
			setState(1207);
			expression(0);
			setState(1208);
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

	public static class ExpressionListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ProcessingParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ProcessingParser.COMMA, i);
		}
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).enterExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).exitExpressionList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProcessingVisitor ) return ((ProcessingVisitor<? extends T>)visitor).visitExpressionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1210);
			expression(0);
			setState(1215);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1211);
				match(COMMA);
				setState(1212);
				expression(0);
				}
				}
				setState(1217);
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

	public static class ExpressionContext extends ParserRuleContext {
		public Token prefix;
		public Token bop;
		public Token postfix;
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public MethodCallContext methodCall() {
			return getRuleContext(MethodCallContext.class,0);
		}
		public TerminalNode NEW() { return getToken(ProcessingParser.NEW, 0); }
		public CreatorContext creator() {
			return getRuleContext(CreatorContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(ProcessingParser.LPAREN, 0); }
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ProcessingParser.RPAREN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ADD() { return getToken(ProcessingParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(ProcessingParser.SUB, 0); }
		public TerminalNode INC() { return getToken(ProcessingParser.INC, 0); }
		public TerminalNode DEC() { return getToken(ProcessingParser.DEC, 0); }
		public TerminalNode TILDE() { return getToken(ProcessingParser.TILDE, 0); }
		public TerminalNode BANG() { return getToken(ProcessingParser.BANG, 0); }
		public LambdaExpressionContext lambdaExpression() {
			return getRuleContext(LambdaExpressionContext.class,0);
		}
		public TerminalNode COLONCOLON() { return getToken(ProcessingParser.COLONCOLON, 0); }
		public TerminalNode IDENTIFIER() { return getToken(ProcessingParser.IDENTIFIER, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public ClassTypeContext classType() {
			return getRuleContext(ClassTypeContext.class,0);
		}
		public TerminalNode MUL() { return getToken(ProcessingParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(ProcessingParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(ProcessingParser.MOD, 0); }
		public List<TerminalNode> LT() { return getTokens(ProcessingParser.LT); }
		public TerminalNode LT(int i) {
			return getToken(ProcessingParser.LT, i);
		}
		public List<TerminalNode> GT() { return getTokens(ProcessingParser.GT); }
		public TerminalNode GT(int i) {
			return getToken(ProcessingParser.GT, i);
		}
		public TerminalNode LE() { return getToken(ProcessingParser.LE, 0); }
		public TerminalNode GE() { return getToken(ProcessingParser.GE, 0); }
		public TerminalNode EQUAL() { return getToken(ProcessingParser.EQUAL, 0); }
		public TerminalNode NOTEQUAL() { return getToken(ProcessingParser.NOTEQUAL, 0); }
		public TerminalNode BITAND() { return getToken(ProcessingParser.BITAND, 0); }
		public TerminalNode CARET() { return getToken(ProcessingParser.CARET, 0); }
		public TerminalNode BITOR() { return getToken(ProcessingParser.BITOR, 0); }
		public TerminalNode AND() { return getToken(ProcessingParser.AND, 0); }
		public TerminalNode OR() { return getToken(ProcessingParser.OR, 0); }
		public TerminalNode COLON() { return getToken(ProcessingParser.COLON, 0); }
		public TerminalNode QUESTION() { return getToken(ProcessingParser.QUESTION, 0); }
		public TerminalNode ASSIGN() { return getToken(ProcessingParser.ASSIGN, 0); }
		public TerminalNode ADD_ASSIGN() { return getToken(ProcessingParser.ADD_ASSIGN, 0); }
		public TerminalNode SUB_ASSIGN() { return getToken(ProcessingParser.SUB_ASSIGN, 0); }
		public TerminalNode MUL_ASSIGN() { return getToken(ProcessingParser.MUL_ASSIGN, 0); }
		public TerminalNode DIV_ASSIGN() { return getToken(ProcessingParser.DIV_ASSIGN, 0); }
		public TerminalNode AND_ASSIGN() { return getToken(ProcessingParser.AND_ASSIGN, 0); }
		public TerminalNode OR_ASSIGN() { return getToken(ProcessingParser.OR_ASSIGN, 0); }
		public TerminalNode XOR_ASSIGN() { return getToken(ProcessingParser.XOR_ASSIGN, 0); }
		public TerminalNode RSHIFT_ASSIGN() { return getToken(ProcessingParser.RSHIFT_ASSIGN, 0); }
		public TerminalNode URSHIFT_ASSIGN() { return getToken(ProcessingParser.URSHIFT_ASSIGN, 0); }
		public TerminalNode LSHIFT_ASSIGN() { return getToken(ProcessingParser.LSHIFT_ASSIGN, 0); }
		public TerminalNode MOD_ASSIGN() { return getToken(ProcessingParser.MOD_ASSIGN, 0); }
		public TerminalNode DOT() { return getToken(ProcessingParser.DOT, 0); }
		public TerminalNode THIS() { return getToken(ProcessingParser.THIS, 0); }
		public InnerCreatorContext innerCreator() {
			return getRuleContext(InnerCreatorContext.class,0);
		}
		public TerminalNode SUPER() { return getToken(ProcessingParser.SUPER, 0); }
		public SuperSuffixContext superSuffix() {
			return getRuleContext(SuperSuffixContext.class,0);
		}
		public ExplicitGenericInvocationContext explicitGenericInvocation() {
			return getRuleContext(ExplicitGenericInvocationContext.class,0);
		}
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public TerminalNode LBRACK() { return getToken(ProcessingParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(ProcessingParser.RBRACK, 0); }
		public TerminalNode INSTANCEOF() { return getToken(ProcessingParser.INSTANCEOF, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProcessingVisitor ) return ((ProcessingVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
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
		int _startState = 190;
		enterRecursionRule(_localctx, 190, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1249);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,156,_ctx) ) {
			case 1:
				{
				setState(1219);
				primary();
				}
				break;
			case 2:
				{
				setState(1220);
				methodCall();
				}
				break;
			case 3:
				{
				setState(1221);
				match(NEW);
				setState(1222);
				creator();
				}
				break;
			case 4:
				{
				setState(1223);
				match(LPAREN);
				setState(1224);
				typeType();
				setState(1225);
				match(RPAREN);
				setState(1226);
				expression(21);
				}
				break;
			case 5:
				{
				setState(1228);
				((ExpressionContext)_localctx).prefix = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 90)) & ~0x3f) == 0 && ((1L << (_la - 90)) & ((1L << (INC - 90)) | (1L << (DEC - 90)) | (1L << (ADD - 90)) | (1L << (SUB - 90)))) != 0)) ) {
					((ExpressionContext)_localctx).prefix = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1229);
				expression(19);
				}
				break;
			case 6:
				{
				setState(1230);
				((ExpressionContext)_localctx).prefix = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==BANG || _la==TILDE) ) {
					((ExpressionContext)_localctx).prefix = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1231);
				expression(18);
				}
				break;
			case 7:
				{
				setState(1232);
				lambdaExpression();
				}
				break;
			case 8:
				{
				setState(1233);
				typeType();
				setState(1234);
				match(COLONCOLON);
				setState(1240);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LT:
				case IDENTIFIER:
					{
					setState(1236);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LT) {
						{
						setState(1235);
						typeArguments();
						}
					}

					setState(1238);
					match(IDENTIFIER);
					}
					break;
				case NEW:
					{
					setState(1239);
					match(NEW);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 9:
				{
				setState(1242);
				classType();
				setState(1243);
				match(COLONCOLON);
				setState(1245);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1244);
					typeArguments();
					}
				}

				setState(1247);
				match(NEW);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1331);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,162,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1329);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,161,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1251);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(1252);
						((ExpressionContext)_localctx).bop = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 94)) & ~0x3f) == 0 && ((1L << (_la - 94)) & ((1L << (MUL - 94)) | (1L << (DIV - 94)) | (1L << (MOD - 94)))) != 0)) ) {
							((ExpressionContext)_localctx).bop = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1253);
						expression(18);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1254);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(1255);
						((ExpressionContext)_localctx).bop = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
							((ExpressionContext)_localctx).bop = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1256);
						expression(17);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1257);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(1265);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,157,_ctx) ) {
						case 1:
							{
							setState(1258);
							match(LT);
							setState(1259);
							match(LT);
							}
							break;
						case 2:
							{
							setState(1260);
							match(GT);
							setState(1261);
							match(GT);
							setState(1262);
							match(GT);
							}
							break;
						case 3:
							{
							setState(1263);
							match(GT);
							setState(1264);
							match(GT);
							}
							break;
						}
						setState(1267);
						expression(16);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1268);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(1269);
						((ExpressionContext)_localctx).bop = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 78)) & ~0x3f) == 0 && ((1L << (_la - 78)) & ((1L << (GT - 78)) | (1L << (LT - 78)) | (1L << (LE - 78)) | (1L << (GE - 78)))) != 0)) ) {
							((ExpressionContext)_localctx).bop = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1270);
						expression(15);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1271);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(1272);
						((ExpressionContext)_localctx).bop = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==EQUAL || _la==NOTEQUAL) ) {
							((ExpressionContext)_localctx).bop = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1273);
						expression(13);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1274);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(1275);
						((ExpressionContext)_localctx).bop = match(BITAND);
						setState(1276);
						expression(12);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1277);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(1278);
						((ExpressionContext)_localctx).bop = match(CARET);
						setState(1279);
						expression(11);
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1280);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(1281);
						((ExpressionContext)_localctx).bop = match(BITOR);
						setState(1282);
						expression(10);
						}
						break;
					case 9:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1283);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(1284);
						((ExpressionContext)_localctx).bop = match(AND);
						setState(1285);
						expression(9);
						}
						break;
					case 10:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1286);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(1287);
						((ExpressionContext)_localctx).bop = match(OR);
						setState(1288);
						expression(8);
						}
						break;
					case 11:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1289);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(1290);
						((ExpressionContext)_localctx).bop = match(QUESTION);
						setState(1291);
						expression(0);
						setState(1292);
						match(COLON);
						setState(1293);
						expression(7);
						}
						break;
					case 12:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1295);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1296);
						((ExpressionContext)_localctx).bop = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (ASSIGN - 77)) | (1L << (ADD_ASSIGN - 77)) | (1L << (SUB_ASSIGN - 77)) | (1L << (MUL_ASSIGN - 77)) | (1L << (DIV_ASSIGN - 77)) | (1L << (AND_ASSIGN - 77)) | (1L << (OR_ASSIGN - 77)) | (1L << (XOR_ASSIGN - 77)) | (1L << (MOD_ASSIGN - 77)) | (1L << (LSHIFT_ASSIGN - 77)) | (1L << (RSHIFT_ASSIGN - 77)) | (1L << (URSHIFT_ASSIGN - 77)))) != 0)) ) {
							((ExpressionContext)_localctx).bop = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1297);
						expression(5);
						}
						break;
					case 13:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1298);
						if (!(precpred(_ctx, 25))) throw new FailedPredicateException(this, "precpred(_ctx, 25)");
						setState(1299);
						((ExpressionContext)_localctx).bop = match(DOT);
						setState(1311);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,159,_ctx) ) {
						case 1:
							{
							setState(1300);
							match(IDENTIFIER);
							}
							break;
						case 2:
							{
							setState(1301);
							methodCall();
							}
							break;
						case 3:
							{
							setState(1302);
							match(THIS);
							}
							break;
						case 4:
							{
							setState(1303);
							match(NEW);
							setState(1305);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if (_la==LT) {
								{
								setState(1304);
								nonWildcardTypeArguments();
								}
							}

							setState(1307);
							innerCreator();
							}
							break;
						case 5:
							{
							setState(1308);
							match(SUPER);
							setState(1309);
							superSuffix();
							}
							break;
						case 6:
							{
							setState(1310);
							explicitGenericInvocation();
							}
							break;
						}
						}
						break;
					case 14:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1313);
						if (!(precpred(_ctx, 24))) throw new FailedPredicateException(this, "precpred(_ctx, 24)");
						setState(1314);
						match(LBRACK);
						setState(1315);
						expression(0);
						setState(1316);
						match(RBRACK);
						}
						break;
					case 15:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1318);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(1319);
						((ExpressionContext)_localctx).postfix = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==INC || _la==DEC) ) {
							((ExpressionContext)_localctx).postfix = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						break;
					case 16:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1320);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(1321);
						((ExpressionContext)_localctx).bop = match(INSTANCEOF);
						setState(1322);
						typeType();
						}
						break;
					case 17:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1323);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1324);
						match(COLONCOLON);
						setState(1326);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==LT) {
							{
							setState(1325);
							typeArguments();
							}
						}

						setState(1328);
						match(IDENTIFIER);
						}
						break;
					}
					} 
				}
				setState(1333);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,162,_ctx);
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

	public static class LambdaExpressionContext extends ParserRuleContext {
		public LambdaParametersContext lambdaParameters() {
			return getRuleContext(LambdaParametersContext.class,0);
		}
		public TerminalNode ARROW() { return getToken(ProcessingParser.ARROW, 0); }
		public LambdaBodyContext lambdaBody() {
			return getRuleContext(LambdaBodyContext.class,0);
		}
		public LambdaExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).enterLambdaExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).exitLambdaExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProcessingVisitor ) return ((ProcessingVisitor<? extends T>)visitor).visitLambdaExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LambdaExpressionContext lambdaExpression() throws RecognitionException {
		LambdaExpressionContext _localctx = new LambdaExpressionContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_lambdaExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1334);
			lambdaParameters();
			setState(1335);
			match(ARROW);
			setState(1336);
			lambdaBody();
			}
		}
		catch (RecognitionException re) {
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
		public List<TerminalNode> IDENTIFIER() { return getTokens(ProcessingParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(ProcessingParser.IDENTIFIER, i);
		}
		public TerminalNode LPAREN() { return getToken(ProcessingParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(ProcessingParser.RPAREN, 0); }
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(ProcessingParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ProcessingParser.COMMA, i);
		}
		public LambdaParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).enterLambdaParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).exitLambdaParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProcessingVisitor ) return ((ProcessingVisitor<? extends T>)visitor).visitLambdaParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LambdaParametersContext lambdaParameters() throws RecognitionException {
		LambdaParametersContext _localctx = new LambdaParametersContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_lambdaParameters);
		int _la;
		try {
			setState(1354);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,165,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1338);
				match(IDENTIFIER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1339);
				match(LPAREN);
				setState(1341);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT) | (1L << VAR))) != 0) || _la==AT || _la==IDENTIFIER) {
					{
					setState(1340);
					formalParameterList();
					}
				}

				setState(1343);
				match(RPAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1344);
				match(LPAREN);
				setState(1345);
				match(IDENTIFIER);
				setState(1350);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1346);
					match(COMMA);
					setState(1347);
					match(IDENTIFIER);
					}
					}
					setState(1352);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1353);
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

	public static class LambdaBodyContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public LambdaBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).enterLambdaBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).exitLambdaBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProcessingVisitor ) return ((ProcessingVisitor<? extends T>)visitor).visitLambdaBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LambdaBodyContext lambdaBody() throws RecognitionException {
		LambdaBodyContext _localctx = new LambdaBodyContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_lambdaBody);
		try {
			setState(1358);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case HexColorLiteral:
			case CHAR_LITERAL:
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case NEW:
			case SHORT:
			case SUPER:
			case THIS:
			case VAR:
			case VOID:
			case DECIMAL_LITERAL:
			case HEX_LITERAL:
			case OCT_LITERAL:
			case BINARY_LITERAL:
			case FLOAT_LITERAL:
			case HEX_FLOAT_LITERAL:
			case BOOL_LITERAL:
			case STRING_LITERAL:
			case MULTI_STRING_LIT:
			case NULL_LITERAL:
			case LPAREN:
			case LT:
			case BANG:
			case TILDE:
			case INC:
			case DEC:
			case ADD:
			case SUB:
			case AT:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1356);
				expression(0);
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1357);
				block();
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

	public static class PrimaryContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(ProcessingParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ProcessingParser.RPAREN, 0); }
		public TerminalNode THIS() { return getToken(ProcessingParser.THIS, 0); }
		public TerminalNode SUPER() { return getToken(ProcessingParser.SUPER, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(ProcessingParser.IDENTIFIER, 0); }
		public TypeTypeOrVoidContext typeTypeOrVoid() {
			return getRuleContext(TypeTypeOrVoidContext.class,0);
		}
		public TerminalNode DOT() { return getToken(ProcessingParser.DOT, 0); }
		public TerminalNode CLASS() { return getToken(ProcessingParser.CLASS, 0); }
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public ExplicitGenericInvocationSuffixContext explicitGenericInvocationSuffix() {
			return getRuleContext(ExplicitGenericInvocationSuffixContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).enterPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).exitPrimary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProcessingVisitor ) return ((ProcessingVisitor<? extends T>)visitor).visitPrimary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_primary);
		try {
			setState(1378);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,168,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1360);
				match(LPAREN);
				setState(1361);
				expression(0);
				setState(1362);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1364);
				match(THIS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1365);
				match(SUPER);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1366);
				literal();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1367);
				match(IDENTIFIER);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1368);
				typeTypeOrVoid();
				setState(1369);
				match(DOT);
				setState(1370);
				match(CLASS);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1372);
				nonWildcardTypeArguments();
				setState(1376);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SUPER:
				case IDENTIFIER:
					{
					setState(1373);
					explicitGenericInvocationSuffix();
					}
					break;
				case THIS:
					{
					setState(1374);
					match(THIS);
					setState(1375);
					arguments();
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

	public static class ClassTypeContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ProcessingParser.IDENTIFIER, 0); }
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public TerminalNode DOT() { return getToken(ProcessingParser.DOT, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public ClassTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).enterClassType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).exitClassType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProcessingVisitor ) return ((ProcessingVisitor<? extends T>)visitor).visitClassType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassTypeContext classType() throws RecognitionException {
		ClassTypeContext _localctx = new ClassTypeContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_classType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1383);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,169,_ctx) ) {
			case 1:
				{
				setState(1380);
				classOrInterfaceType();
				setState(1381);
				match(DOT);
				}
				break;
			}
			setState(1388);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(1385);
				annotation();
				}
				}
				setState(1390);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1391);
			match(IDENTIFIER);
			setState(1393);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1392);
				typeArguments();
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

	public static class CreatorContext extends ParserRuleContext {
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public CreatedNameContext createdName() {
			return getRuleContext(CreatedNameContext.class,0);
		}
		public ClassCreatorRestContext classCreatorRest() {
			return getRuleContext(ClassCreatorRestContext.class,0);
		}
		public ArrayCreatorRestContext arrayCreatorRest() {
			return getRuleContext(ArrayCreatorRestContext.class,0);
		}
		public CreatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_creator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).enterCreator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).exitCreator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProcessingVisitor ) return ((ProcessingVisitor<? extends T>)visitor).visitCreator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreatorContext creator() throws RecognitionException {
		CreatorContext _localctx = new CreatorContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_creator);
		try {
			setState(1404);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1395);
				nonWildcardTypeArguments();
				setState(1396);
				createdName();
				setState(1397);
				classCreatorRest();
				}
				break;
			case T__0:
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(1399);
				createdName();
				setState(1402);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LBRACK:
					{
					setState(1400);
					arrayCreatorRest();
					}
					break;
				case LPAREN:
					{
					setState(1401);
					classCreatorRest();
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
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreatedNameContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(ProcessingParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(ProcessingParser.IDENTIFIER, i);
		}
		public List<TypeArgumentsOrDiamondContext> typeArgumentsOrDiamond() {
			return getRuleContexts(TypeArgumentsOrDiamondContext.class);
		}
		public TypeArgumentsOrDiamondContext typeArgumentsOrDiamond(int i) {
			return getRuleContext(TypeArgumentsOrDiamondContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(ProcessingParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(ProcessingParser.DOT, i);
		}
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public CreatedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createdName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).enterCreatedName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).exitCreatedName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProcessingVisitor ) return ((ProcessingVisitor<? extends T>)visitor).visitCreatedName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreatedNameContext createdName() throws RecognitionException {
		CreatedNameContext _localctx = new CreatedNameContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_createdName);
		int _la;
		try {
			setState(1421);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1406);
				match(IDENTIFIER);
				setState(1408);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1407);
					typeArgumentsOrDiamond();
					}
				}

				setState(1417);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DOT) {
					{
					{
					setState(1410);
					match(DOT);
					setState(1411);
					match(IDENTIFIER);
					setState(1413);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LT) {
						{
						setState(1412);
						typeArgumentsOrDiamond();
						}
					}

					}
					}
					setState(1419);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__0:
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1420);
				primitiveType();
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

	public static class InnerCreatorContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ProcessingParser.IDENTIFIER, 0); }
		public ClassCreatorRestContext classCreatorRest() {
			return getRuleContext(ClassCreatorRestContext.class,0);
		}
		public NonWildcardTypeArgumentsOrDiamondContext nonWildcardTypeArgumentsOrDiamond() {
			return getRuleContext(NonWildcardTypeArgumentsOrDiamondContext.class,0);
		}
		public InnerCreatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_innerCreator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).enterInnerCreator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).exitInnerCreator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProcessingVisitor ) return ((ProcessingVisitor<? extends T>)visitor).visitInnerCreator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InnerCreatorContext innerCreator() throws RecognitionException {
		InnerCreatorContext _localctx = new InnerCreatorContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_innerCreator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1423);
			match(IDENTIFIER);
			setState(1425);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1424);
				nonWildcardTypeArgumentsOrDiamond();
				}
			}

			setState(1427);
			classCreatorRest();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayCreatorRestContext extends ParserRuleContext {
		public List<TerminalNode> LBRACK() { return getTokens(ProcessingParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(ProcessingParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(ProcessingParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(ProcessingParser.RBRACK, i);
		}
		public ArrayInitializerContext arrayInitializer() {
			return getRuleContext(ArrayInitializerContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ArrayCreatorRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayCreatorRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).enterArrayCreatorRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).exitArrayCreatorRest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProcessingVisitor ) return ((ProcessingVisitor<? extends T>)visitor).visitArrayCreatorRest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayCreatorRestContext arrayCreatorRest() throws RecognitionException {
		ArrayCreatorRestContext _localctx = new ArrayCreatorRestContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_arrayCreatorRest);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1429);
			match(LBRACK);
			setState(1457);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RBRACK:
				{
				setState(1430);
				match(RBRACK);
				setState(1435);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(1431);
					match(LBRACK);
					setState(1432);
					match(RBRACK);
					}
					}
					setState(1437);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1438);
				arrayInitializer();
				}
				break;
			case T__0:
			case HexColorLiteral:
			case CHAR_LITERAL:
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case NEW:
			case SHORT:
			case SUPER:
			case THIS:
			case VAR:
			case VOID:
			case DECIMAL_LITERAL:
			case HEX_LITERAL:
			case OCT_LITERAL:
			case BINARY_LITERAL:
			case FLOAT_LITERAL:
			case HEX_FLOAT_LITERAL:
			case BOOL_LITERAL:
			case STRING_LITERAL:
			case MULTI_STRING_LIT:
			case NULL_LITERAL:
			case LPAREN:
			case LT:
			case BANG:
			case TILDE:
			case INC:
			case DEC:
			case ADD:
			case SUB:
			case AT:
			case IDENTIFIER:
				{
				setState(1439);
				expression(0);
				setState(1440);
				match(RBRACK);
				setState(1447);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,180,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1441);
						match(LBRACK);
						setState(1442);
						expression(0);
						setState(1443);
						match(RBRACK);
						}
						} 
					}
					setState(1449);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,180,_ctx);
				}
				setState(1454);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,181,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1450);
						match(LBRACK);
						setState(1451);
						match(RBRACK);
						}
						} 
					}
					setState(1456);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,181,_ctx);
				}
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

	public static class ClassCreatorRestContext extends ParserRuleContext {
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public ClassCreatorRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classCreatorRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).enterClassCreatorRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).exitClassCreatorRest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProcessingVisitor ) return ((ProcessingVisitor<? extends T>)visitor).visitClassCreatorRest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassCreatorRestContext classCreatorRest() throws RecognitionException {
		ClassCreatorRestContext _localctx = new ClassCreatorRestContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_classCreatorRest);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1459);
			arguments();
			setState(1461);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,183,_ctx) ) {
			case 1:
				{
				setState(1460);
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

	public static class ExplicitGenericInvocationContext extends ParserRuleContext {
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public ExplicitGenericInvocationSuffixContext explicitGenericInvocationSuffix() {
			return getRuleContext(ExplicitGenericInvocationSuffixContext.class,0);
		}
		public ExplicitGenericInvocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explicitGenericInvocation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).enterExplicitGenericInvocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).exitExplicitGenericInvocation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProcessingVisitor ) return ((ProcessingVisitor<? extends T>)visitor).visitExplicitGenericInvocation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExplicitGenericInvocationContext explicitGenericInvocation() throws RecognitionException {
		ExplicitGenericInvocationContext _localctx = new ExplicitGenericInvocationContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_explicitGenericInvocation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1463);
			nonWildcardTypeArguments();
			setState(1464);
			explicitGenericInvocationSuffix();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeArgumentsOrDiamondContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(ProcessingParser.LT, 0); }
		public TerminalNode GT() { return getToken(ProcessingParser.GT, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public TypeArgumentsOrDiamondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArgumentsOrDiamond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).enterTypeArgumentsOrDiamond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).exitTypeArgumentsOrDiamond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProcessingVisitor ) return ((ProcessingVisitor<? extends T>)visitor).visitTypeArgumentsOrDiamond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeArgumentsOrDiamondContext typeArgumentsOrDiamond() throws RecognitionException {
		TypeArgumentsOrDiamondContext _localctx = new TypeArgumentsOrDiamondContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_typeArgumentsOrDiamond);
		try {
			setState(1469);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,184,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1466);
				match(LT);
				setState(1467);
				match(GT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1468);
				typeArguments();
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

	public static class NonWildcardTypeArgumentsOrDiamondContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(ProcessingParser.LT, 0); }
		public TerminalNode GT() { return getToken(ProcessingParser.GT, 0); }
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public NonWildcardTypeArgumentsOrDiamondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonWildcardTypeArgumentsOrDiamond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).enterNonWildcardTypeArgumentsOrDiamond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).exitNonWildcardTypeArgumentsOrDiamond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProcessingVisitor ) return ((ProcessingVisitor<? extends T>)visitor).visitNonWildcardTypeArgumentsOrDiamond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NonWildcardTypeArgumentsOrDiamondContext nonWildcardTypeArgumentsOrDiamond() throws RecognitionException {
		NonWildcardTypeArgumentsOrDiamondContext _localctx = new NonWildcardTypeArgumentsOrDiamondContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_nonWildcardTypeArgumentsOrDiamond);
		try {
			setState(1474);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,185,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1471);
				match(LT);
				setState(1472);
				match(GT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1473);
				nonWildcardTypeArguments();
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

	public static class NonWildcardTypeArgumentsContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(ProcessingParser.LT, 0); }
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
		}
		public TerminalNode GT() { return getToken(ProcessingParser.GT, 0); }
		public NonWildcardTypeArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonWildcardTypeArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).enterNonWildcardTypeArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).exitNonWildcardTypeArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProcessingVisitor ) return ((ProcessingVisitor<? extends T>)visitor).visitNonWildcardTypeArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NonWildcardTypeArgumentsContext nonWildcardTypeArguments() throws RecognitionException {
		NonWildcardTypeArgumentsContext _localctx = new NonWildcardTypeArgumentsContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_nonWildcardTypeArguments);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1476);
			match(LT);
			setState(1477);
			typeList();
			setState(1478);
			match(GT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeListContext extends ParserRuleContext {
		public List<TypeTypeContext> typeType() {
			return getRuleContexts(TypeTypeContext.class);
		}
		public TypeTypeContext typeType(int i) {
			return getRuleContext(TypeTypeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ProcessingParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ProcessingParser.COMMA, i);
		}
		public TypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).enterTypeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).exitTypeList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProcessingVisitor ) return ((ProcessingVisitor<? extends T>)visitor).visitTypeList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeListContext typeList() throws RecognitionException {
		TypeListContext _localctx = new TypeListContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_typeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1480);
			typeType();
			setState(1485);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1481);
				match(COMMA);
				setState(1482);
				typeType();
				}
				}
				setState(1487);
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

	public static class TypeTypeContext extends ParserRuleContext {
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public TerminalNode VAR() { return getToken(ProcessingParser.VAR, 0); }
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public List<TerminalNode> LBRACK() { return getTokens(ProcessingParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(ProcessingParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(ProcessingParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(ProcessingParser.RBRACK, i);
		}
		public TypeTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).enterTypeType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).exitTypeType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProcessingVisitor ) return ((ProcessingVisitor<? extends T>)visitor).visitTypeType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeTypeContext typeType() throws RecognitionException {
		TypeTypeContext _localctx = new TypeTypeContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_typeType);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1489);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT) {
				{
				setState(1488);
				annotation();
				}
			}

			setState(1494);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				setState(1491);
				classOrInterfaceType();
				}
				break;
			case T__0:
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
				{
				setState(1492);
				primitiveType();
				}
				break;
			case VAR:
				{
				setState(1493);
				match(VAR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1500);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,189,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1496);
					match(LBRACK);
					setState(1497);
					match(RBRACK);
					}
					} 
				}
				setState(1502);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,189,_ctx);
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

	public static class TypeArgumentsContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(ProcessingParser.LT, 0); }
		public List<TypeArgumentContext> typeArgument() {
			return getRuleContexts(TypeArgumentContext.class);
		}
		public TypeArgumentContext typeArgument(int i) {
			return getRuleContext(TypeArgumentContext.class,i);
		}
		public TerminalNode GT() { return getToken(ProcessingParser.GT, 0); }
		public List<TerminalNode> COMMA() { return getTokens(ProcessingParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ProcessingParser.COMMA, i);
		}
		public TypeArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).enterTypeArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).exitTypeArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProcessingVisitor ) return ((ProcessingVisitor<? extends T>)visitor).visitTypeArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeArgumentsContext typeArguments() throws RecognitionException {
		TypeArgumentsContext _localctx = new TypeArgumentsContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_typeArguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1503);
			match(LT);
			setState(1504);
			typeArgument();
			setState(1509);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1505);
				match(COMMA);
				setState(1506);
				typeArgument();
				}
				}
				setState(1511);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1512);
			match(GT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SuperSuffixContext extends ParserRuleContext {
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public TerminalNode DOT() { return getToken(ProcessingParser.DOT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(ProcessingParser.IDENTIFIER, 0); }
		public SuperSuffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_superSuffix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).enterSuperSuffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).exitSuperSuffix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProcessingVisitor ) return ((ProcessingVisitor<? extends T>)visitor).visitSuperSuffix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SuperSuffixContext superSuffix() throws RecognitionException {
		SuperSuffixContext _localctx = new SuperSuffixContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_superSuffix);
		try {
			setState(1520);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(1514);
				arguments();
				}
				break;
			case DOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1515);
				match(DOT);
				setState(1516);
				match(IDENTIFIER);
				setState(1518);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,191,_ctx) ) {
				case 1:
					{
					setState(1517);
					arguments();
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

	public static class ExplicitGenericInvocationSuffixContext extends ParserRuleContext {
		public TerminalNode SUPER() { return getToken(ProcessingParser.SUPER, 0); }
		public SuperSuffixContext superSuffix() {
			return getRuleContext(SuperSuffixContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(ProcessingParser.IDENTIFIER, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public ExplicitGenericInvocationSuffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explicitGenericInvocationSuffix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).enterExplicitGenericInvocationSuffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).exitExplicitGenericInvocationSuffix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProcessingVisitor ) return ((ProcessingVisitor<? extends T>)visitor).visitExplicitGenericInvocationSuffix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExplicitGenericInvocationSuffixContext explicitGenericInvocationSuffix() throws RecognitionException {
		ExplicitGenericInvocationSuffixContext _localctx = new ExplicitGenericInvocationSuffixContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_explicitGenericInvocationSuffix);
		try {
			setState(1526);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SUPER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1522);
				match(SUPER);
				setState(1523);
				superSuffix();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(1524);
				match(IDENTIFIER);
				setState(1525);
				arguments();
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

	public static class ArgumentsContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(ProcessingParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(ProcessingParser.RPAREN, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessingListener ) ((ProcessingListener)listener).exitArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProcessingVisitor ) return ((ProcessingVisitor<? extends T>)visitor).visitArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1528);
			match(LPAREN);
			setState(1530);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << HexColorLiteral) | (1L << CHAR_LITERAL) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VAR) | (1L << VOID) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (BOOL_LITERAL - 64)) | (1L << (STRING_LITERAL - 64)) | (1L << (MULTI_STRING_LIT - 64)) | (1L << (NULL_LITERAL - 64)) | (1L << (LPAREN - 64)) | (1L << (LT - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (AT - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
				{
				setState(1529);
				expressionList();
				}
			}

			setState(1532);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 95:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 17);
		case 1:
			return precpred(_ctx, 16);
		case 2:
			return precpred(_ctx, 15);
		case 3:
			return precpred(_ctx, 14);
		case 4:
			return precpred(_ctx, 12);
		case 5:
			return precpred(_ctx, 11);
		case 6:
			return precpred(_ctx, 10);
		case 7:
			return precpred(_ctx, 9);
		case 8:
			return precpred(_ctx, 8);
		case 9:
			return precpred(_ctx, 7);
		case 10:
			return precpred(_ctx, 6);
		case 11:
			return precpred(_ctx, 5);
		case 12:
			return precpred(_ctx, 25);
		case 13:
			return precpred(_ctx, 24);
		case 14:
			return precpred(_ctx, 20);
		case 15:
			return precpred(_ctx, 13);
		case 16:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001s\u05ff\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0002"+
		"-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u00071\u0002"+
		"2\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u00076\u0002"+
		"7\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0002;\u0007;\u0002"+
		"<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007?\u0002@\u0007@\u0002"+
		"A\u0007A\u0002B\u0007B\u0002C\u0007C\u0002D\u0007D\u0002E\u0007E\u0002"+
		"F\u0007F\u0002G\u0007G\u0002H\u0007H\u0002I\u0007I\u0002J\u0007J\u0002"+
		"K\u0007K\u0002L\u0007L\u0002M\u0007M\u0002N\u0007N\u0002O\u0007O\u0002"+
		"P\u0007P\u0002Q\u0007Q\u0002R\u0007R\u0002S\u0007S\u0002T\u0007T\u0002"+
		"U\u0007U\u0002V\u0007V\u0002W\u0007W\u0002X\u0007X\u0002Y\u0007Y\u0002"+
		"Z\u0007Z\u0002[\u0007[\u0002\\\u0007\\\u0002]\u0007]\u0002^\u0007^\u0002"+
		"_\u0007_\u0002`\u0007`\u0002a\u0007a\u0002b\u0007b\u0002c\u0007c\u0002"+
		"d\u0007d\u0002e\u0007e\u0002f\u0007f\u0002g\u0007g\u0002h\u0007h\u0002"+
		"i\u0007i\u0002j\u0007j\u0002k\u0007k\u0002l\u0007l\u0002m\u0007m\u0002"+
		"n\u0007n\u0002o\u0007o\u0002p\u0007p\u0002q\u0007q\u0002r\u0007r\u0002"+
		"s\u0007s\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0003\u0000\u00ed"+
		"\b\u0000\u0001\u0001\u0003\u0001\u00f0\b\u0001\u0001\u0001\u0005\u0001"+
		"\u00f3\b\u0001\n\u0001\f\u0001\u00f6\t\u0001\u0001\u0001\u0004\u0001\u00f9"+
		"\b\u0001\u000b\u0001\f\u0001\u00fa\u0001\u0001\u0001\u0001\u0001\u0002"+
		"\u0001\u0002\u0005\u0002\u0101\b\u0002\n\u0002\f\u0002\u0104\t\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0005\u0003\u010a\b\u0003\n"+
		"\u0003\f\u0003\u010d\t\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0005\u0004\u0114\b\u0004\n\u0004\f\u0004\u0117\t\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004"+
		"\u011e\b\u0004\n\u0004\f\u0004\u0121\t\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0005\u0004\u0126\b\u0004\n\u0004\f\u0004\u0129\t\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004\u0130\b\u0004"+
		"\n\u0004\f\u0004\u0133\t\u0004\u0003\u0004\u0135\b\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0005\u0005\u013b\b\u0005\n\u0005\f\u0005"+
		"\u013e\t\u0005\u0003\u0005\u0140\b\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0005\u0006\u0145\b\u0006\n\u0006\f\u0006\u0148\t\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007"+
		"\u0150\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007"+
		"\u0156\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007"+
		"\u015c\b\u0007\u0001\u0007\u0003\u0007\u015f\b\u0007\u0001\b\u0001\b\u0001"+
		"\b\u0003\b\u0164\b\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u0171\b\t\u0001\n\u0001\n\u0001"+
		"\u000b\u0001\u000b\u0003\u000b\u0177\b\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0003\u000b\u017c\b\u000b\u0005\u000b\u017e\b\u000b\n\u000b\f\u000b"+
		"\u0181\t\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f"+
		"\u0003\f\u018a\b\f\u0001\r\u0001\r\u0001\u000e\u0003\u000e\u018f\b\u000e"+
		"\u0001\u000e\u0005\u000e\u0192\b\u000e\n\u000e\f\u000e\u0195\t\u000e\u0001"+
		"\u000e\u0005\u000e\u0198\b\u000e\n\u000e\f\u000e\u019b\t\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000f\u0005\u000f\u01a0\b\u000f\n\u000f\f\u000f\u01a3"+
		"\t\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001"+
		"\u0010\u0003\u0010\u01ab\b\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003"+
		"\u0010\u01b0\b\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0005\u0011\u01b5"+
		"\b\u0011\n\u0011\f\u0011\u01b8\t\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0003\u0011\u01be\b\u0011\u0001\u0011\u0003\u0011\u01c1\b"+
		"\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003"+
		"\u0012\u01c8\b\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u01d2\b\u0013\u0001"+
		"\u0014\u0001\u0014\u0003\u0014\u01d6\b\u0014\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0003\u0015\u01db\b\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u01df"+
		"\b\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u01e3\b\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0005\u0016"+
		"\u01eb\b\u0016\n\u0016\f\u0016\u01ee\t\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0017\u0005\u0017\u01f3\b\u0017\n\u0017\f\u0017\u01f6\t\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0003\u0017\u01fb\b\u0017\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0005\u0018\u0200\b\u0018\n\u0018\f\u0018\u0203\t\u0018\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u0209\b\u0019\u0001"+
		"\u0019\u0001\u0019\u0003\u0019\u020d\b\u0019\u0001\u0019\u0003\u0019\u0210"+
		"\b\u0019\u0001\u0019\u0003\u0019\u0213\b\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0005\u001a\u021a\b\u001a\n\u001a"+
		"\f\u001a\u021d\t\u001a\u0001\u001b\u0005\u001b\u0220\b\u001b\n\u001b\f"+
		"\u001b\u0223\t\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u0227\b\u001b"+
		"\u0001\u001b\u0003\u001b\u022a\b\u001b\u0001\u001c\u0001\u001c\u0005\u001c"+
		"\u022e\b\u001c\n\u001c\f\u001c\u0231\t\u001c\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0003\u001d\u0236\b\u001d\u0001\u001d\u0001\u001d\u0003\u001d\u023a"+
		"\b\u001d\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0005\u001e\u0240"+
		"\b\u001e\n\u001e\f\u001e\u0243\t\u001e\u0001\u001e\u0001\u001e\u0001\u001f"+
		"\u0001\u001f\u0005\u001f\u0249\b\u001f\n\u001f\f\u001f\u024c\t\u001f\u0001"+
		"\u001f\u0001\u001f\u0001 \u0001 \u0001 \u0003 \u0253\b \u0001 \u0001 "+
		"\u0005 \u0257\b \n \f \u025a\t \u0001 \u0003 \u025d\b \u0001!\u0001!\u0001"+
		"!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0003!\u0268\b!\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0005\"\u026f\b\"\n\"\f\"\u0272\t\"\u0001\""+
		"\u0001\"\u0003\"\u0276\b\"\u0001\"\u0001\"\u0001#\u0001#\u0003#\u027c"+
		"\b#\u0001$\u0001$\u0003$\u0280\b$\u0001%\u0001%\u0001%\u0001&\u0001&\u0001"+
		"&\u0001\'\u0001\'\u0001\'\u0001\'\u0003\'\u028c\b\'\u0001\'\u0001\'\u0001"+
		"(\u0001(\u0001(\u0001(\u0001)\u0005)\u0295\b)\n)\f)\u0298\t)\u0001)\u0001"+
		")\u0003)\u029c\b)\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0003"+
		"*\u02a5\b*\u0001+\u0001+\u0001+\u0001+\u0005+\u02ab\b+\n+\f+\u02ae\t+"+
		"\u0001+\u0001+\u0001,\u0001,\u0001,\u0005,\u02b5\b,\n,\f,\u02b8\t,\u0001"+
		",\u0001,\u0001,\u0001-\u0005-\u02be\b-\n-\f-\u02c1\t-\u0001-\u0001-\u0001"+
		"-\u0005-\u02c6\b-\n-\f-\u02c9\t-\u0001-\u0001-\u0003-\u02cd\b-\u0001-"+
		"\u0001-\u0001-\u0001-\u0005-\u02d3\b-\n-\f-\u02d6\t-\u0001-\u0001-\u0003"+
		"-\u02da\b-\u0001-\u0001-\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0003"+
		".\u02e4\b.\u0001/\u0001/\u0001/\u00010\u00010\u00010\u00050\u02ec\b0\n"+
		"0\f0\u02ef\t0\u00011\u00011\u00011\u00031\u02f4\b1\u00012\u00012\u0003"+
		"2\u02f8\b2\u00013\u00013\u00013\u00013\u00053\u02fe\b3\n3\f3\u0301\t3"+
		"\u00013\u00033\u0304\b3\u00033\u0306\b3\u00013\u00013\u00014\u00014\u0003"+
		"4\u030c\b4\u00014\u00014\u00014\u00034\u0311\b4\u00054\u0313\b4\n4\f4"+
		"\u0316\t4\u00015\u00015\u00015\u00015\u00035\u031c\b5\u00035\u031e\b5"+
		"\u00016\u00016\u00016\u00056\u0323\b6\n6\f6\u0326\t6\u00017\u00017\u0003"+
		"7\u032a\b7\u00017\u00017\u00018\u00018\u00018\u00058\u0331\b8\n8\f8\u0334"+
		"\t8\u00018\u00018\u00038\u0338\b8\u00018\u00038\u033b\b8\u00019\u0005"+
		"9\u033e\b9\n9\f9\u0341\t9\u00019\u00019\u00019\u0001:\u0005:\u0347\b:"+
		"\n:\f:\u034a\t:\u0001:\u0001:\u0001:\u0001:\u0001;\u0001;\u0001<\u0001"+
		"<\u0001=\u0001=\u0003=\u0356\b=\u0001>\u0001>\u0001?\u0001?\u0001@\u0001"+
		"@\u0001@\u0001@\u0001@\u0003@\u0361\b@\u0001@\u0003@\u0364\b@\u0001A\u0001"+
		"A\u0001A\u0005A\u0369\bA\nA\fA\u036c\tA\u0001B\u0001B\u0001B\u0001B\u0001"+
		"C\u0001C\u0001C\u0003C\u0375\bC\u0001D\u0001D\u0001D\u0001D\u0005D\u037b"+
		"\bD\nD\fD\u037e\tD\u0003D\u0380\bD\u0001D\u0003D\u0383\bD\u0001D\u0001"+
		"D\u0001E\u0001E\u0001E\u0001E\u0001E\u0001F\u0001F\u0005F\u038e\bF\nF"+
		"\fF\u0391\tF\u0001F\u0001F\u0001G\u0005G\u0396\bG\nG\fG\u0399\tG\u0001"+
		"G\u0001G\u0003G\u039d\bG\u0001H\u0001H\u0001H\u0001H\u0001H\u0001H\u0003"+
		"H\u03a5\bH\u0001H\u0001H\u0003H\u03a9\bH\u0001H\u0001H\u0003H\u03ad\b"+
		"H\u0001H\u0001H\u0003H\u03b1\bH\u0003H\u03b3\bH\u0001I\u0001I\u0003I\u03b7"+
		"\bI\u0001J\u0001J\u0001J\u0001J\u0003J\u03bd\bJ\u0001K\u0001K\u0001L\u0001"+
		"L\u0001L\u0001M\u0001M\u0005M\u03c6\bM\nM\fM\u03c9\tM\u0001M\u0001M\u0001"+
		"N\u0001N\u0001N\u0001N\u0001N\u0003N\u03d2\bN\u0001O\u0005O\u03d5\bO\n"+
		"O\fO\u03d8\tO\u0001O\u0001O\u0001O\u0001P\u0005P\u03de\bP\nP\fP\u03e1"+
		"\tP\u0001P\u0001P\u0003P\u03e5\bP\u0001P\u0003P\u03e8\bP\u0001Q\u0001"+
		"Q\u0001Q\u0001Q\u0001Q\u0003Q\u03ef\bQ\u0001Q\u0001Q\u0001Q\u0001Q\u0001"+
		"Q\u0001Q\u0001Q\u0003Q\u03f8\bQ\u0001Q\u0001Q\u0001Q\u0001Q\u0001Q\u0001"+
		"Q\u0001Q\u0001Q\u0001Q\u0001Q\u0001Q\u0001Q\u0001Q\u0001Q\u0001Q\u0001"+
		"Q\u0001Q\u0001Q\u0001Q\u0004Q\u040d\bQ\u000bQ\fQ\u040e\u0001Q\u0003Q\u0412"+
		"\bQ\u0001Q\u0003Q\u0415\bQ\u0001Q\u0001Q\u0001Q\u0001Q\u0005Q\u041b\b"+
		"Q\nQ\fQ\u041e\tQ\u0001Q\u0003Q\u0421\bQ\u0001Q\u0001Q\u0001Q\u0001Q\u0005"+
		"Q\u0427\bQ\nQ\fQ\u042a\tQ\u0001Q\u0005Q\u042d\bQ\nQ\fQ\u0430\tQ\u0001"+
		"Q\u0001Q\u0001Q\u0001Q\u0001Q\u0001Q\u0001Q\u0001Q\u0003Q\u043a\bQ\u0001"+
		"Q\u0001Q\u0001Q\u0001Q\u0001Q\u0001Q\u0001Q\u0003Q\u0443\bQ\u0001Q\u0001"+
		"Q\u0001Q\u0003Q\u0448\bQ\u0001Q\u0001Q\u0001Q\u0001Q\u0001Q\u0001Q\u0001"+
		"Q\u0001Q\u0003Q\u0452\bQ\u0001R\u0001R\u0001R\u0005R\u0457\bR\nR\fR\u045a"+
		"\tR\u0001R\u0001R\u0001R\u0001R\u0001R\u0001S\u0001S\u0001S\u0005S\u0464"+
		"\bS\nS\fS\u0467\tS\u0001T\u0001T\u0001T\u0001U\u0001U\u0001U\u0003U\u046f"+
		"\bU\u0001U\u0001U\u0001V\u0001V\u0001V\u0005V\u0476\bV\nV\fV\u0479\tV"+
		"\u0001W\u0005W\u047c\bW\nW\fW\u047f\tW\u0001W\u0001W\u0001W\u0001W\u0001"+
		"W\u0001X\u0004X\u0487\bX\u000bX\fX\u0488\u0001X\u0004X\u048c\bX\u000b"+
		"X\fX\u048d\u0001Y\u0001Y\u0001Y\u0003Y\u0493\bY\u0001Y\u0001Y\u0001Y\u0003"+
		"Y\u0498\bY\u0001Z\u0001Z\u0003Z\u049c\bZ\u0001Z\u0001Z\u0003Z\u04a0\b"+
		"Z\u0001Z\u0001Z\u0003Z\u04a4\bZ\u0003Z\u04a6\bZ\u0001[\u0001[\u0003[\u04aa"+
		"\b[\u0001\\\u0005\\\u04ad\b\\\n\\\f\\\u04b0\t\\\u0001\\\u0001\\\u0001"+
		"\\\u0001\\\u0001\\\u0001]\u0001]\u0001]\u0001]\u0001^\u0001^\u0001^\u0005"+
		"^\u04be\b^\n^\f^\u04c1\t^\u0001_\u0001_\u0001_\u0001_\u0001_\u0001_\u0001"+
		"_\u0001_\u0001_\u0001_\u0001_\u0001_\u0001_\u0001_\u0001_\u0001_\u0001"+
		"_\u0001_\u0003_\u04d5\b_\u0001_\u0001_\u0003_\u04d9\b_\u0001_\u0001_\u0001"+
		"_\u0003_\u04de\b_\u0001_\u0001_\u0003_\u04e2\b_\u0001_\u0001_\u0001_\u0001"+
		"_\u0001_\u0001_\u0001_\u0001_\u0001_\u0001_\u0001_\u0001_\u0001_\u0001"+
		"_\u0003_\u04f2\b_\u0001_\u0001_\u0001_\u0001_\u0001_\u0001_\u0001_\u0001"+
		"_\u0001_\u0001_\u0001_\u0001_\u0001_\u0001_\u0001_\u0001_\u0001_\u0001"+
		"_\u0001_\u0001_\u0001_\u0001_\u0001_\u0001_\u0001_\u0001_\u0001_\u0001"+
		"_\u0001_\u0001_\u0001_\u0001_\u0001_\u0001_\u0001_\u0001_\u0001_\u0001"+
		"_\u0003_\u051a\b_\u0001_\u0001_\u0001_\u0001_\u0003_\u0520\b_\u0001_\u0001"+
		"_\u0001_\u0001_\u0001_\u0001_\u0001_\u0001_\u0001_\u0001_\u0001_\u0001"+
		"_\u0001_\u0003_\u052f\b_\u0001_\u0005_\u0532\b_\n_\f_\u0535\t_\u0001`"+
		"\u0001`\u0001`\u0001`\u0001a\u0001a\u0001a\u0003a\u053e\ba\u0001a\u0001"+
		"a\u0001a\u0001a\u0001a\u0005a\u0545\ba\na\fa\u0548\ta\u0001a\u0003a\u054b"+
		"\ba\u0001b\u0001b\u0003b\u054f\bb\u0001c\u0001c\u0001c\u0001c\u0001c\u0001"+
		"c\u0001c\u0001c\u0001c\u0001c\u0001c\u0001c\u0001c\u0001c\u0001c\u0001"+
		"c\u0003c\u0561\bc\u0003c\u0563\bc\u0001d\u0001d\u0001d\u0003d\u0568\b"+
		"d\u0001d\u0005d\u056b\bd\nd\fd\u056e\td\u0001d\u0001d\u0003d\u0572\bd"+
		"\u0001e\u0001e\u0001e\u0001e\u0001e\u0001e\u0001e\u0003e\u057b\be\u0003"+
		"e\u057d\be\u0001f\u0001f\u0003f\u0581\bf\u0001f\u0001f\u0001f\u0003f\u0586"+
		"\bf\u0005f\u0588\bf\nf\ff\u058b\tf\u0001f\u0003f\u058e\bf\u0001g\u0001"+
		"g\u0003g\u0592\bg\u0001g\u0001g\u0001h\u0001h\u0001h\u0001h\u0005h\u059a"+
		"\bh\nh\fh\u059d\th\u0001h\u0001h\u0001h\u0001h\u0001h\u0001h\u0001h\u0005"+
		"h\u05a6\bh\nh\fh\u05a9\th\u0001h\u0001h\u0005h\u05ad\bh\nh\fh\u05b0\t"+
		"h\u0003h\u05b2\bh\u0001i\u0001i\u0003i\u05b6\bi\u0001j\u0001j\u0001j\u0001"+
		"k\u0001k\u0001k\u0003k\u05be\bk\u0001l\u0001l\u0001l\u0003l\u05c3\bl\u0001"+
		"m\u0001m\u0001m\u0001m\u0001n\u0001n\u0001n\u0005n\u05cc\bn\nn\fn\u05cf"+
		"\tn\u0001o\u0003o\u05d2\bo\u0001o\u0001o\u0001o\u0003o\u05d7\bo\u0001"+
		"o\u0001o\u0005o\u05db\bo\no\fo\u05de\to\u0001p\u0001p\u0001p\u0001p\u0005"+
		"p\u05e4\bp\np\fp\u05e7\tp\u0001p\u0001p\u0001q\u0001q\u0001q\u0001q\u0003"+
		"q\u05ef\bq\u0003q\u05f1\bq\u0001r\u0001r\u0001r\u0001r\u0003r\u05f7\b"+
		"r\u0001s\u0001s\u0003s\u05fb\bs\u0001s\u0001s\u0001s\u0000\u0001\u00be"+
		"t\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a"+
		"\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082"+
		"\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a"+
		"\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2"+
		"\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca"+
		"\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\u00dc\u00de\u00e0\u00e2"+
		"\u00e4\u00e6\u0000\f\u0006\u0000\u0001\u0001\t\t\u000b\u000b\u000e\u000e"+
		"\u001a\u001a!!\u0002\u0000\u0017\u0017..\u0001\u0000:=\u0001\u0000>?\u0001"+
		"\u0000Z]\u0001\u0000PQ\u0002\u0000^_cc\u0001\u0000\\]\u0002\u0000NOUV"+
		"\u0002\u0000TTWW\u0002\u0000MMdn\u0001\u0000Z[\u06b5\u0000\u00ec\u0001"+
		"\u0000\u0000\u0000\u0002\u00ef\u0001\u0000\u0000\u0000\u0004\u0102\u0001"+
		"\u0000\u0000\u0000\u0006\u010b\u0001\u0000\u0000\u0000\b\u0134\u0001\u0000"+
		"\u0000\u0000\n\u013f\u0001\u0000\u0000\u0000\f\u0141\u0001\u0000\u0000"+
		"\u0000\u000e\u015e\u0001\u0000\u0000\u0000\u0010\u0160\u0001\u0000\u0000"+
		"\u0000\u0012\u0170\u0001\u0000\u0000\u0000\u0014\u0172\u0001\u0000\u0000"+
		"\u0000\u0016\u0176\u0001\u0000\u0000\u0000\u0018\u0189\u0001\u0000\u0000"+
		"\u0000\u001a\u018b\u0001\u0000\u0000\u0000\u001c\u018e\u0001\u0000\u0000"+
		"\u0000\u001e\u01a1\u0001\u0000\u0000\u0000 \u01a8\u0001\u0000\u0000\u0000"+
		"\"\u01c0\u0001\u0000\u0000\u0000$\u01c7\u0001\u0000\u0000\u0000&\u01d1"+
		"\u0001\u0000\u0000\u0000(\u01d5\u0001\u0000\u0000\u0000*\u01d7\u0001\u0000"+
		"\u0000\u0000,\u01e6\u0001\u0000\u0000\u0000.\u01f4\u0001\u0000\u0000\u0000"+
		"0\u01fc\u0001\u0000\u0000\u00002\u0204\u0001\u0000\u0000\u00004\u0216"+
		"\u0001\u0000\u0000\u00006\u0221\u0001\u0000\u0000\u00008\u022b\u0001\u0000"+
		"\u0000\u0000:\u0232\u0001\u0000\u0000\u0000<\u023d\u0001\u0000\u0000\u0000"+
		">\u0246\u0001\u0000\u0000\u0000@\u025c\u0001\u0000\u0000\u0000B\u0267"+
		"\u0001\u0000\u0000\u0000D\u0269\u0001\u0000\u0000\u0000F\u027b\u0001\u0000"+
		"\u0000\u0000H\u027f\u0001\u0000\u0000\u0000J\u0281\u0001\u0000\u0000\u0000"+
		"L\u0284\u0001\u0000\u0000\u0000N\u0287\u0001\u0000\u0000\u0000P\u028f"+
		"\u0001\u0000\u0000\u0000R\u029b\u0001\u0000\u0000\u0000T\u02a4\u0001\u0000"+
		"\u0000\u0000V\u02a6\u0001\u0000\u0000\u0000X\u02b1\u0001\u0000\u0000\u0000"+
		"Z\u02bf\u0001\u0000\u0000\u0000\\\u02e3\u0001\u0000\u0000\u0000^\u02e5"+
		"\u0001\u0000\u0000\u0000`\u02e8\u0001\u0000\u0000\u0000b\u02f0\u0001\u0000"+
		"\u0000\u0000d\u02f7\u0001\u0000\u0000\u0000f\u02f9\u0001\u0000\u0000\u0000"+
		"h\u0309\u0001\u0000\u0000\u0000j\u031d\u0001\u0000\u0000\u0000l\u031f"+
		"\u0001\u0000\u0000\u0000n\u0327\u0001\u0000\u0000\u0000p\u033a\u0001\u0000"+
		"\u0000\u0000r\u033f\u0001\u0000\u0000\u0000t\u0348\u0001\u0000\u0000\u0000"+
		"v\u034f\u0001\u0000\u0000\u0000x\u0351\u0001\u0000\u0000\u0000z\u0355"+
		"\u0001\u0000\u0000\u0000|\u0357\u0001\u0000\u0000\u0000~\u0359\u0001\u0000"+
		"\u0000\u0000\u0080\u035b\u0001\u0000\u0000\u0000\u0082\u0365\u0001\u0000"+
		"\u0000\u0000\u0084\u036d\u0001\u0000\u0000\u0000\u0086\u0374\u0001\u0000"+
		"\u0000\u0000\u0088\u0376\u0001\u0000\u0000\u0000\u008a\u0386\u0001\u0000"+
		"\u0000\u0000\u008c\u038b\u0001\u0000\u0000\u0000\u008e\u039c\u0001\u0000"+
		"\u0000\u0000\u0090\u03b2\u0001\u0000\u0000\u0000\u0092\u03b6\u0001\u0000"+
		"\u0000\u0000\u0094\u03b8\u0001\u0000\u0000\u0000\u0096\u03be\u0001\u0000"+
		"\u0000\u0000\u0098\u03c0\u0001\u0000\u0000\u0000\u009a\u03c3\u0001\u0000"+
		"\u0000\u0000\u009c\u03d1\u0001\u0000\u0000\u0000\u009e\u03d6\u0001\u0000"+
		"\u0000\u0000\u00a0\u03e7\u0001\u0000\u0000\u0000\u00a2\u0451\u0001\u0000"+
		"\u0000\u0000\u00a4\u0453\u0001\u0000\u0000\u0000\u00a6\u0460\u0001\u0000"+
		"\u0000\u0000\u00a8\u0468\u0001\u0000\u0000\u0000\u00aa\u046b\u0001\u0000"+
		"\u0000\u0000\u00ac\u0472\u0001\u0000\u0000\u0000\u00ae\u047d\u0001\u0000"+
		"\u0000\u0000\u00b0\u0486\u0001\u0000\u0000\u0000\u00b2\u0497\u0001\u0000"+
		"\u0000\u0000\u00b4\u04a5\u0001\u0000\u0000\u0000\u00b6\u04a9\u0001\u0000"+
		"\u0000\u0000\u00b8\u04ae\u0001\u0000\u0000\u0000\u00ba\u04b6\u0001\u0000"+
		"\u0000\u0000\u00bc\u04ba\u0001\u0000\u0000\u0000\u00be\u04e1\u0001\u0000"+
		"\u0000\u0000\u00c0\u0536\u0001\u0000\u0000\u0000\u00c2\u054a\u0001\u0000"+
		"\u0000\u0000\u00c4\u054e\u0001\u0000\u0000\u0000\u00c6\u0562\u0001\u0000"+
		"\u0000\u0000\u00c8\u0567\u0001\u0000\u0000\u0000\u00ca\u057c\u0001\u0000"+
		"\u0000\u0000\u00cc\u058d\u0001\u0000\u0000\u0000\u00ce\u058f\u0001\u0000"+
		"\u0000\u0000\u00d0\u0595\u0001\u0000\u0000\u0000\u00d2\u05b3\u0001\u0000"+
		"\u0000\u0000\u00d4\u05b7\u0001\u0000\u0000\u0000\u00d6\u05bd\u0001\u0000"+
		"\u0000\u0000\u00d8\u05c2\u0001\u0000\u0000\u0000\u00da\u05c4\u0001\u0000"+
		"\u0000\u0000\u00dc\u05c8\u0001\u0000\u0000\u0000\u00de\u05d1\u0001\u0000"+
		"\u0000\u0000\u00e0\u05df\u0001\u0000\u0000\u0000\u00e2\u05f0\u0001\u0000"+
		"\u0000\u0000\u00e4\u05f6\u0001\u0000\u0000\u0000\u00e6\u05f8\u0001\u0000"+
		"\u0000\u0000\u00e8\u00ed\u0003\u0002\u0001\u0000\u00e9\u00ed\u0003\u0004"+
		"\u0002\u0000\u00ea\u00ed\u0003\u0006\u0003\u0000\u00eb\u00ed\u0003\b\u0004"+
		"\u0000\u00ec\u00e8\u0001\u0000\u0000\u0000\u00ec\u00e9\u0001\u0000\u0000"+
		"\u0000\u00ec\u00ea\u0001\u0000\u0000\u0000\u00ec\u00eb\u0001\u0000\u0000"+
		"\u0000\u00ed\u0001\u0001\u0000\u0000\u0000\u00ee\u00f0\u0003\u001e\u000f"+
		"\u0000\u00ef\u00ee\u0001\u0000\u0000\u0000\u00ef\u00f0\u0001\u0000\u0000"+
		"\u0000\u00f0\u00f4\u0001\u0000\u0000\u0000\u00f1\u00f3\u0003 \u0010\u0000"+
		"\u00f2\u00f1\u0001\u0000\u0000\u0000\u00f3\u00f6\u0001\u0000\u0000\u0000"+
		"\u00f4\u00f2\u0001\u0000\u0000\u0000\u00f4\u00f5\u0001\u0000\u0000\u0000"+
		"\u00f5\u00f8\u0001\u0000\u0000\u0000\u00f6\u00f4\u0001\u0000\u0000\u0000"+
		"\u00f7\u00f9\u0003\"\u0011\u0000\u00f8\u00f7\u0001\u0000\u0000\u0000\u00f9"+
		"\u00fa\u0001\u0000\u0000\u0000\u00fa\u00f8\u0001\u0000\u0000\u0000\u00fa"+
		"\u00fb\u0001\u0000\u0000\u0000\u00fb\u00fc\u0001\u0000\u0000\u0000\u00fc"+
		"\u00fd\u0005\u0000\u0000\u0001\u00fd\u0003\u0001\u0000\u0000\u0000\u00fe"+
		"\u0101\u0003 \u0010\u0000\u00ff\u0101\u0003\u009cN\u0000\u0100\u00fe\u0001"+
		"\u0000\u0000\u0000\u0100\u00ff\u0001\u0000\u0000\u0000\u0101\u0104\u0001"+
		"\u0000\u0000\u0000\u0102\u0100\u0001\u0000\u0000\u0000\u0102\u0103\u0001"+
		"\u0000\u0000\u0000\u0103\u0105\u0001\u0000\u0000\u0000\u0104\u0102\u0001"+
		"\u0000\u0000\u0000\u0105\u0106\u0005\u0000\u0000\u0001\u0106\u0005\u0001"+
		"\u0000\u0000\u0000\u0107\u010a\u0003 \u0010\u0000\u0108\u010a\u0003@ "+
		"\u0000\u0109\u0107\u0001\u0000\u0000\u0000\u0109\u0108\u0001\u0000\u0000"+
		"\u0000\u010a\u010d\u0001\u0000\u0000\u0000\u010b\u0109\u0001\u0000\u0000"+
		"\u0000\u010b\u010c\u0001\u0000\u0000\u0000\u010c\u010e\u0001\u0000\u0000"+
		"\u0000\u010d\u010b\u0001\u0000\u0000\u0000\u010e\u010f\u0005\u0000\u0000"+
		"\u0001\u010f\u0007\u0001\u0000\u0000\u0000\u0110\u0114\u0003 \u0010\u0000"+
		"\u0111\u0114\u0003@ \u0000\u0112\u0114\u0003\u009cN\u0000\u0113\u0110"+
		"\u0001\u0000\u0000\u0000\u0113\u0111\u0001\u0000\u0000\u0000\u0113\u0112"+
		"\u0001\u0000\u0000\u0000\u0114\u0117\u0001\u0000\u0000\u0000\u0115\u0113"+
		"\u0001\u0000\u0000\u0000\u0115\u0116\u0001\u0000\u0000\u0000\u0116\u0118"+
		"\u0001\u0000\u0000\u0000\u0117\u0115\u0001\u0000\u0000\u0000\u0118\u0119"+
		"\u0003\u009cN\u0000\u0119\u011f\u0003@ \u0000\u011a\u011e\u0003 \u0010"+
		"\u0000\u011b\u011e\u0003@ \u0000\u011c\u011e\u0003\u009cN\u0000\u011d"+
		"\u011a\u0001\u0000\u0000\u0000\u011d\u011b\u0001\u0000\u0000\u0000\u011d"+
		"\u011c\u0001\u0000\u0000\u0000\u011e\u0121\u0001\u0000\u0000\u0000\u011f"+
		"\u011d\u0001\u0000\u0000\u0000\u011f\u0120\u0001\u0000\u0000\u0000\u0120"+
		"\u0135\u0001\u0000\u0000\u0000\u0121\u011f\u0001\u0000\u0000\u0000\u0122"+
		"\u0126\u0003 \u0010\u0000\u0123\u0126\u0003@ \u0000\u0124\u0126\u0003"+
		"\u009cN\u0000\u0125\u0122\u0001\u0000\u0000\u0000\u0125\u0123\u0001\u0000"+
		"\u0000\u0000\u0125\u0124\u0001\u0000\u0000\u0000\u0126\u0129\u0001\u0000"+
		"\u0000\u0000\u0127\u0125\u0001\u0000\u0000\u0000\u0127\u0128\u0001\u0000"+
		"\u0000\u0000\u0128\u012a\u0001\u0000\u0000\u0000\u0129\u0127\u0001\u0000"+
		"\u0000\u0000\u012a\u012b\u0003@ \u0000\u012b\u0131\u0003\u009cN\u0000"+
		"\u012c\u0130\u0003 \u0010\u0000\u012d\u0130\u0003@ \u0000\u012e\u0130"+
		"\u0003\u009cN\u0000\u012f\u012c\u0001\u0000\u0000\u0000\u012f\u012d\u0001"+
		"\u0000\u0000\u0000\u012f\u012e\u0001\u0000\u0000\u0000\u0130\u0133\u0001"+
		"\u0000\u0000\u0000\u0131\u012f\u0001\u0000\u0000\u0000\u0131\u0132\u0001"+
		"\u0000\u0000\u0000\u0132\u0135\u0001\u0000\u0000\u0000\u0133\u0131\u0001"+
		"\u0000\u0000\u0000\u0134\u0115\u0001\u0000\u0000\u0000\u0134\u0127\u0001"+
		"\u0000\u0000\u0000\u0135\t\u0001\u0000\u0000\u0000\u0136\u0140\u0003\f"+
		"\u0006\u0000\u0137\u013c\u0005s\u0000\u0000\u0138\u0139\u0005H\u0000\u0000"+
		"\u0139\u013b\u0005I\u0000\u0000\u013a\u0138\u0001\u0000\u0000\u0000\u013b"+
		"\u013e\u0001\u0000\u0000\u0000\u013c\u013a\u0001\u0000\u0000\u0000\u013c"+
		"\u013d\u0001\u0000\u0000\u0000\u013d\u0140\u0001\u0000\u0000\u0000\u013e"+
		"\u013c\u0001\u0000\u0000\u0000\u013f\u0136\u0001\u0000\u0000\u0000\u013f"+
		"\u0137\u0001\u0000\u0000\u0000\u0140\u000b\u0001\u0000\u0000\u0000\u0141"+
		"\u0146\u0003\u0012\t\u0000\u0142\u0143\u0005H\u0000\u0000\u0143\u0145"+
		"\u0005I\u0000\u0000\u0144\u0142\u0001\u0000\u0000\u0000\u0145\u0148\u0001"+
		"\u0000\u0000\u0000\u0146\u0144\u0001\u0000\u0000\u0000\u0146\u0147\u0001"+
		"\u0000\u0000\u0000\u0147\u0149\u0001\u0000\u0000\u0000\u0148\u0146\u0001"+
		"\u0000\u0000\u0000\u0149\u014a\u0006\u0006\uffff\uffff\u0000\u014a\r\u0001"+
		"\u0000\u0000\u0000\u014b\u015f\u0003\u0010\b\u0000\u014c\u014d\u0005s"+
		"\u0000\u0000\u014d\u014f\u0005D\u0000\u0000\u014e\u0150\u0003\u00bc^\u0000"+
		"\u014f\u014e\u0001\u0000\u0000\u0000\u014f\u0150\u0001\u0000\u0000\u0000"+
		"\u0150\u0151\u0001\u0000\u0000\u0000\u0151\u015f\u0005E\u0000\u0000\u0152"+
		"\u0153\u00051\u0000\u0000\u0153\u0155\u0005D\u0000\u0000\u0154\u0156\u0003"+
		"\u00bc^\u0000\u0155\u0154\u0001\u0000\u0000\u0000\u0155\u0156\u0001\u0000"+
		"\u0000\u0000\u0156\u0157\u0001\u0000\u0000\u0000\u0157\u015f\u0005E\u0000"+
		"\u0000\u0158\u0159\u0005.\u0000\u0000\u0159\u015b\u0005D\u0000\u0000\u015a"+
		"\u015c\u0003\u00bc^\u0000\u015b\u015a\u0001\u0000\u0000\u0000\u015b\u015c"+
		"\u0001\u0000\u0000\u0000\u015c\u015d\u0001\u0000\u0000\u0000\u015d\u015f"+
		"\u0005E\u0000\u0000\u015e\u014b\u0001\u0000\u0000\u0000\u015e\u014c\u0001"+
		"\u0000\u0000\u0000\u015e\u0152\u0001\u0000\u0000\u0000\u015e\u0158\u0001"+
		"\u0000\u0000\u0000\u015f\u000f\u0001\u0000\u0000\u0000\u0160\u0161\u0007"+
		"\u0000\u0000\u0000\u0161\u0163\u0005D\u0000\u0000\u0162\u0164\u0003\u00bc"+
		"^\u0000\u0163\u0162\u0001\u0000\u0000\u0000\u0163\u0164\u0001\u0000\u0000"+
		"\u0000\u0164\u0165\u0001\u0000\u0000\u0000\u0165\u0166\u0005E\u0000\u0000"+
		"\u0166\u0011\u0001\u0000\u0000\u0000\u0167\u0171\u0005\t\u0000\u0000\u0168"+
		"\u0171\u0005\u000e\u0000\u0000\u0169\u0171\u0005\u000b\u0000\u0000\u016a"+
		"\u0171\u0005+\u0000\u0000\u016b\u0171\u0005!\u0000\u0000\u016c\u0171\u0005"+
		"#\u0000\u0000\u016d\u0171\u0005\u001a\u0000\u0000\u016e\u0171\u0005\u0014"+
		"\u0000\u0000\u016f\u0171\u0003\u0014\n\u0000\u0170\u0167\u0001\u0000\u0000"+
		"\u0000\u0170\u0168\u0001\u0000\u0000\u0000\u0170\u0169\u0001\u0000\u0000"+
		"\u0000\u0170\u016a\u0001\u0000\u0000\u0000\u0170\u016b\u0001\u0000\u0000"+
		"\u0000\u0170\u016c\u0001\u0000\u0000\u0000\u0170\u016d\u0001\u0000\u0000"+
		"\u0000\u0170\u016e\u0001\u0000\u0000\u0000\u0170\u016f\u0001\u0000\u0000"+
		"\u0000\u0171\u0013\u0001\u0000\u0000\u0000\u0172\u0173\u0005\u0001\u0000"+
		"\u0000\u0173\u0015\u0001\u0000\u0000\u0000\u0174\u0177\u0005s\u0000\u0000"+
		"\u0175\u0177\u0003\u0014\n\u0000\u0176\u0174\u0001\u0000\u0000\u0000\u0176"+
		"\u0175\u0001\u0000\u0000\u0000\u0177\u017f\u0001\u0000\u0000\u0000\u0178"+
		"\u017b\u0005L\u0000\u0000\u0179\u017c\u0005s\u0000\u0000\u017a\u017c\u0003"+
		"\u0014\n\u0000\u017b\u0179\u0001\u0000\u0000\u0000\u017b\u017a\u0001\u0000"+
		"\u0000\u0000\u017c\u017e\u0001\u0000\u0000\u0000\u017d\u0178\u0001\u0000"+
		"\u0000\u0000\u017e\u0181\u0001\u0000\u0000\u0000\u017f\u017d\u0001\u0000"+
		"\u0000\u0000\u017f\u0180\u0001\u0000\u0000\u0000\u0180\u0017\u0001\u0000"+
		"\u0000\u0000\u0181\u017f\u0001\u0000\u0000\u0000\u0182\u018a\u0003|>\u0000"+
		"\u0183\u018a\u0003~?\u0000\u0184\u018a\u0005\u0006\u0000\u0000\u0185\u018a"+
		"\u0003z=\u0000\u0186\u018a\u0005@\u0000\u0000\u0187\u018a\u0005C\u0000"+
		"\u0000\u0188\u018a\u0003\u001a\r\u0000\u0189\u0182\u0001\u0000\u0000\u0000"+
		"\u0189\u0183\u0001\u0000\u0000\u0000\u0189\u0184\u0001\u0000\u0000\u0000"+
		"\u0189\u0185\u0001\u0000\u0000\u0000\u0189\u0186\u0001\u0000\u0000\u0000"+
		"\u0189\u0187\u0001\u0000\u0000\u0000\u0189\u0188\u0001\u0000\u0000\u0000"+
		"\u018a\u0019\u0001\u0000\u0000\u0000\u018b\u018c\u0005\u0002\u0000\u0000"+
		"\u018c\u001b\u0001\u0000\u0000\u0000\u018d\u018f\u0003\u001e\u000f\u0000"+
		"\u018e\u018d\u0001\u0000\u0000\u0000\u018e\u018f\u0001\u0000\u0000\u0000"+
		"\u018f\u0193\u0001\u0000\u0000\u0000\u0190\u0192\u0003 \u0010\u0000\u0191"+
		"\u0190\u0001\u0000\u0000\u0000\u0192\u0195\u0001\u0000\u0000\u0000\u0193"+
		"\u0191\u0001\u0000\u0000\u0000\u0193\u0194\u0001\u0000\u0000\u0000\u0194"+
		"\u0199\u0001\u0000\u0000\u0000\u0195\u0193\u0001\u0000\u0000\u0000\u0196"+
		"\u0198\u0003\"\u0011\u0000\u0197\u0196\u0001\u0000\u0000\u0000\u0198\u019b"+
		"\u0001\u0000\u0000\u0000\u0199\u0197\u0001\u0000\u0000\u0000\u0199\u019a"+
		"\u0001\u0000\u0000\u0000\u019a\u019c\u0001\u0000\u0000\u0000\u019b\u0199"+
		"\u0001\u0000\u0000\u0000\u019c\u019d\u0005\u0000\u0000\u0001\u019d\u001d"+
		"\u0001\u0000\u0000\u0000\u019e\u01a0\u0003\u0080@\u0000\u019f\u019e\u0001"+
		"\u0000\u0000\u0000\u01a0\u01a3\u0001\u0000\u0000\u0000\u01a1\u019f\u0001"+
		"\u0000\u0000\u0000\u01a1\u01a2\u0001\u0000\u0000\u0000\u01a2\u01a4\u0001"+
		"\u0000\u0000\u0000\u01a3\u01a1\u0001\u0000\u0000\u0000\u01a4\u01a5\u0005"+
		"&\u0000\u0000\u01a5\u01a6\u0003\u0016\u000b\u0000\u01a6\u01a7\u0005J\u0000"+
		"\u0000\u01a7\u001f\u0001\u0000\u0000\u0000\u01a8\u01aa\u0005\u001f\u0000"+
		"\u0000\u01a9\u01ab\u0005,\u0000\u0000\u01aa\u01a9\u0001\u0000\u0000\u0000"+
		"\u01aa\u01ab\u0001\u0000\u0000\u0000\u01ab\u01ac\u0001\u0000\u0000\u0000"+
		"\u01ac\u01af\u0003\u0016\u000b\u0000\u01ad\u01ae\u0005L\u0000\u0000\u01ae"+
		"\u01b0\u0005^\u0000\u0000\u01af\u01ad\u0001\u0000\u0000\u0000\u01af\u01b0"+
		"\u0001\u0000\u0000\u0000\u01b0\u01b1\u0001\u0000\u0000\u0000\u01b1\u01b2"+
		"\u0005J\u0000\u0000\u01b2!\u0001\u0000\u0000\u0000\u01b3\u01b5\u0003&"+
		"\u0013\u0000\u01b4\u01b3\u0001\u0000\u0000\u0000\u01b5\u01b8\u0001\u0000"+
		"\u0000\u0000\u01b6\u01b4\u0001\u0000\u0000\u0000\u01b6\u01b7\u0001\u0000"+
		"\u0000\u0000\u01b7\u01bd\u0001\u0000\u0000\u0000\u01b8\u01b6\u0001\u0000"+
		"\u0000\u0000\u01b9\u01be\u0003*\u0015\u0000\u01ba\u01be\u00032\u0019\u0000"+
		"\u01bb\u01be\u0003:\u001d\u0000\u01bc\u01be\u0003\u008aE\u0000\u01bd\u01b9"+
		"\u0001\u0000\u0000\u0000\u01bd\u01ba\u0001\u0000\u0000\u0000\u01bd\u01bb"+
		"\u0001\u0000\u0000\u0000\u01bd\u01bc\u0001\u0000\u0000\u0000\u01be\u01c1"+
		"\u0001\u0000\u0000\u0000\u01bf\u01c1\u0005J\u0000\u0000\u01c0\u01b6\u0001"+
		"\u0000\u0000\u0000\u01c0\u01bf\u0001\u0000\u0000\u0000\u01c1#\u0001\u0000"+
		"\u0000\u0000\u01c2\u01c8\u0003&\u0013\u0000\u01c3\u01c8\u0005$\u0000\u0000"+
		"\u01c4\u01c8\u00050\u0000\u0000\u01c5\u01c8\u00054\u0000\u0000\u01c6\u01c8"+
		"\u00058\u0000\u0000\u01c7\u01c2\u0001\u0000\u0000\u0000\u01c7\u01c3\u0001"+
		"\u0000\u0000\u0000\u01c7\u01c4\u0001\u0000\u0000\u0000\u01c7\u01c5\u0001"+
		"\u0000\u0000\u0000\u01c7\u01c6\u0001\u0000\u0000\u0000\u01c8%\u0001\u0000"+
		"\u0000\u0000\u01c9\u01d2\u0003\u0080@\u0000\u01ca\u01d2\u0005)\u0000\u0000"+
		"\u01cb\u01d2\u0005(\u0000\u0000\u01cc\u01d2\u0005\'\u0000\u0000\u01cd"+
		"\u01d2\u0005,\u0000\u0000\u01ce\u01d2\u0005\u0007\u0000\u0000\u01cf\u01d2"+
		"\u0005\u0018\u0000\u0000\u01d0\u01d2\u0005-\u0000\u0000\u01d1\u01c9\u0001"+
		"\u0000\u0000\u0000\u01d1\u01ca\u0001\u0000\u0000\u0000\u01d1\u01cb\u0001"+
		"\u0000\u0000\u0000\u01d1\u01cc\u0001\u0000\u0000\u0000\u01d1\u01cd\u0001"+
		"\u0000\u0000\u0000\u01d1\u01ce\u0001\u0000\u0000\u0000\u01d1\u01cf\u0001"+
		"\u0000\u0000\u0000\u01d1\u01d0\u0001\u0000\u0000\u0000\u01d2\'\u0001\u0000"+
		"\u0000\u0000\u01d3\u01d6\u0005\u0018\u0000\u0000\u01d4\u01d6\u0003\u0080"+
		"@\u0000\u01d5\u01d3\u0001\u0000\u0000\u0000\u01d5\u01d4\u0001\u0000\u0000"+
		"\u0000\u01d6)\u0001\u0000\u0000\u0000\u01d7\u01d8\u0005\u000f\u0000\u0000"+
		"\u01d8\u01da\u0005s\u0000\u0000\u01d9\u01db\u0003,\u0016\u0000\u01da\u01d9"+
		"\u0001\u0000\u0000\u0000\u01da\u01db\u0001\u0000\u0000\u0000\u01db\u01de"+
		"\u0001\u0000\u0000\u0000\u01dc\u01dd\u0005\u0017\u0000\u0000\u01dd\u01df"+
		"\u0003\u00deo\u0000\u01de\u01dc\u0001\u0000\u0000\u0000\u01de\u01df\u0001"+
		"\u0000\u0000\u0000\u01df\u01e2\u0001\u0000\u0000\u0000\u01e0\u01e1\u0005"+
		"\u001e\u0000\u0000\u01e1\u01e3\u0003\u00dcn\u0000\u01e2\u01e0\u0001\u0000"+
		"\u0000\u0000\u01e2\u01e3\u0001\u0000\u0000\u0000\u01e3\u01e4\u0001\u0000"+
		"\u0000\u0000\u01e4\u01e5\u0003<\u001e\u0000\u01e5+\u0001\u0000\u0000\u0000"+
		"\u01e6\u01e7\u0005O\u0000\u0000\u01e7\u01ec\u0003.\u0017\u0000\u01e8\u01e9"+
		"\u0005K\u0000\u0000\u01e9\u01eb\u0003.\u0017\u0000\u01ea\u01e8\u0001\u0000"+
		"\u0000\u0000\u01eb\u01ee\u0001\u0000\u0000\u0000\u01ec\u01ea\u0001\u0000"+
		"\u0000\u0000\u01ec\u01ed\u0001\u0000\u0000\u0000\u01ed\u01ef\u0001\u0000"+
		"\u0000\u0000\u01ee\u01ec\u0001\u0000\u0000\u0000\u01ef\u01f0\u0005N\u0000"+
		"\u0000\u01f0-\u0001\u0000\u0000\u0000\u01f1\u01f3\u0003\u0080@\u0000\u01f2"+
		"\u01f1\u0001\u0000\u0000\u0000\u01f3\u01f6\u0001\u0000\u0000\u0000\u01f4"+
		"\u01f2\u0001\u0000\u0000\u0000\u01f4\u01f5\u0001\u0000\u0000\u0000\u01f5"+
		"\u01f7\u0001\u0000\u0000\u0000\u01f6\u01f4\u0001\u0000\u0000\u0000\u01f7"+
		"\u01fa\u0005s\u0000\u0000\u01f8\u01f9\u0005\u0017\u0000\u0000\u01f9\u01fb"+
		"\u00030\u0018\u0000\u01fa\u01f8\u0001\u0000\u0000\u0000\u01fa\u01fb\u0001"+
		"\u0000\u0000\u0000\u01fb/\u0001\u0000\u0000\u0000\u01fc\u0201\u0003\u00de"+
		"o\u0000\u01fd\u01fe\u0005`\u0000\u0000\u01fe\u0200\u0003\u00deo\u0000"+
		"\u01ff\u01fd\u0001\u0000\u0000\u0000\u0200\u0203\u0001\u0000\u0000\u0000"+
		"\u0201\u01ff\u0001\u0000\u0000\u0000\u0201\u0202\u0001\u0000\u0000\u0000"+
		"\u02021\u0001\u0000\u0000\u0000\u0203\u0201\u0001\u0000\u0000\u0000\u0204"+
		"\u0205\u0005\u0016\u0000\u0000\u0205\u0208\u0005s\u0000\u0000\u0206\u0207"+
		"\u0005\u001e\u0000\u0000\u0207\u0209\u0003\u00dcn\u0000\u0208\u0206\u0001"+
		"\u0000\u0000\u0000\u0208\u0209\u0001\u0000\u0000\u0000\u0209\u020a\u0001"+
		"\u0000\u0000\u0000\u020a\u020c\u0005F\u0000\u0000\u020b\u020d\u00034\u001a"+
		"\u0000\u020c\u020b\u0001\u0000\u0000\u0000\u020c\u020d\u0001\u0000\u0000"+
		"\u0000\u020d\u020f\u0001\u0000\u0000\u0000\u020e\u0210\u0005K\u0000\u0000"+
		"\u020f\u020e\u0001\u0000\u0000\u0000\u020f\u0210\u0001\u0000\u0000\u0000"+
		"\u0210\u0212\u0001\u0000\u0000\u0000\u0211\u0213\u00038\u001c\u0000\u0212"+
		"\u0211\u0001\u0000\u0000\u0000\u0212\u0213\u0001\u0000\u0000\u0000\u0213"+
		"\u0214\u0001\u0000\u0000\u0000\u0214\u0215\u0005G\u0000\u0000\u02153\u0001"+
		"\u0000\u0000\u0000\u0216\u021b\u00036\u001b\u0000\u0217\u0218\u0005K\u0000"+
		"\u0000\u0218\u021a\u00036\u001b\u0000\u0219\u0217\u0001\u0000\u0000\u0000"+
		"\u021a\u021d\u0001\u0000\u0000\u0000\u021b\u0219\u0001\u0000\u0000\u0000"+
		"\u021b\u021c\u0001\u0000\u0000\u0000\u021c5\u0001\u0000\u0000\u0000\u021d"+
		"\u021b\u0001\u0000\u0000\u0000\u021e\u0220\u0003\u0080@\u0000\u021f\u021e"+
		"\u0001\u0000\u0000\u0000\u0220\u0223\u0001\u0000\u0000\u0000\u0221\u021f"+
		"\u0001\u0000\u0000\u0000\u0221\u0222\u0001\u0000\u0000\u0000\u0222\u0224"+
		"\u0001\u0000\u0000\u0000\u0223\u0221\u0001\u0000\u0000\u0000\u0224\u0226"+
		"\u0005s\u0000\u0000\u0225\u0227\u0003\u00e6s\u0000\u0226\u0225\u0001\u0000"+
		"\u0000\u0000\u0226\u0227\u0001\u0000\u0000\u0000\u0227\u0229\u0001\u0000"+
		"\u0000\u0000\u0228\u022a\u0003<\u001e\u0000\u0229\u0228\u0001\u0000\u0000"+
		"\u0000\u0229\u022a\u0001\u0000\u0000\u0000\u022a7\u0001\u0000\u0000\u0000"+
		"\u022b\u022f\u0005J\u0000\u0000\u022c\u022e\u0003@ \u0000\u022d\u022c"+
		"\u0001\u0000\u0000\u0000\u022e\u0231\u0001\u0000\u0000\u0000\u022f\u022d"+
		"\u0001\u0000\u0000\u0000\u022f\u0230\u0001\u0000\u0000\u0000\u02309\u0001"+
		"\u0000\u0000\u0000\u0231\u022f\u0001\u0000\u0000\u0000\u0232\u0233\u0005"+
		"\"\u0000\u0000\u0233\u0235\u0005s\u0000\u0000\u0234\u0236\u0003,\u0016"+
		"\u0000\u0235\u0234\u0001\u0000\u0000\u0000\u0235\u0236\u0001\u0000\u0000"+
		"\u0000\u0236\u0239\u0001\u0000\u0000\u0000\u0237\u0238\u0005\u0017\u0000"+
		"\u0000\u0238\u023a\u0003\u00dcn\u0000\u0239\u0237\u0001\u0000\u0000\u0000"+
		"\u0239\u023a\u0001\u0000\u0000\u0000\u023a\u023b\u0001\u0000\u0000\u0000"+
		"\u023b\u023c\u0003>\u001f\u0000\u023c;\u0001\u0000\u0000\u0000\u023d\u0241"+
		"\u0005F\u0000\u0000\u023e\u0240\u0003@ \u0000\u023f\u023e\u0001\u0000"+
		"\u0000\u0000\u0240\u0243\u0001\u0000\u0000\u0000\u0241\u023f\u0001\u0000"+
		"\u0000\u0000\u0241\u0242\u0001\u0000\u0000\u0000\u0242\u0244\u0001\u0000"+
		"\u0000\u0000\u0243\u0241\u0001\u0000\u0000\u0000\u0244\u0245\u0005G\u0000"+
		"\u0000\u0245=\u0001\u0000\u0000\u0000\u0246\u024a\u0005F\u0000\u0000\u0247"+
		"\u0249\u0003R)\u0000\u0248\u0247\u0001\u0000\u0000\u0000\u0249\u024c\u0001"+
		"\u0000\u0000\u0000\u024a\u0248\u0001\u0000\u0000\u0000\u024a\u024b\u0001"+
		"\u0000\u0000\u0000\u024b\u024d\u0001\u0000\u0000\u0000\u024c\u024a\u0001"+
		"\u0000\u0000\u0000\u024d\u024e\u0005G\u0000\u0000\u024e?\u0001\u0000\u0000"+
		"\u0000\u024f\u025d\u0005J\u0000\u0000\u0250\u025d\u0003 \u0010\u0000\u0251"+
		"\u0253\u0005,\u0000\u0000\u0252\u0251\u0001\u0000\u0000\u0000\u0252\u0253"+
		"\u0001\u0000\u0000\u0000\u0253\u0254\u0001\u0000\u0000\u0000\u0254\u025d"+
		"\u0003\u009aM\u0000\u0255\u0257\u0003$\u0012\u0000\u0256\u0255\u0001\u0000"+
		"\u0000\u0000\u0257\u025a\u0001\u0000\u0000\u0000\u0258\u0256\u0001\u0000"+
		"\u0000\u0000\u0258\u0259\u0001\u0000\u0000\u0000\u0259\u025b\u0001\u0000"+
		"\u0000\u0000\u025a\u0258\u0001\u0000\u0000\u0000\u025b\u025d\u0003B!\u0000"+
		"\u025c\u024f\u0001\u0000\u0000\u0000\u025c\u0250\u0001\u0000\u0000\u0000"+
		"\u025c\u0252\u0001\u0000\u0000\u0000\u025c\u0258\u0001\u0000\u0000\u0000"+
		"\u025dA\u0001\u0000\u0000\u0000\u025e\u0268\u0003D\"\u0000\u025f\u0268"+
		"\u0003J%\u0000\u0260\u0268\u0003P(\u0000\u0261\u0268\u0003N\'\u0000\u0262"+
		"\u0268\u0003L&\u0000\u0263\u0268\u0003:\u001d\u0000\u0264\u0268\u0003"+
		"\u008aE\u0000\u0265\u0268\u0003*\u0015\u0000\u0266\u0268\u00032\u0019"+
		"\u0000\u0267\u025e\u0001\u0000\u0000\u0000\u0267\u025f\u0001\u0000\u0000"+
		"\u0000\u0267\u0260\u0001\u0000\u0000\u0000\u0267\u0261\u0001\u0000\u0000"+
		"\u0000\u0267\u0262\u0001\u0000\u0000\u0000\u0267\u0263\u0001\u0000\u0000"+
		"\u0000\u0267\u0264\u0001\u0000\u0000\u0000\u0267\u0265\u0001\u0000\u0000"+
		"\u0000\u0267\u0266\u0001\u0000\u0000\u0000\u0268C\u0001\u0000\u0000\u0000"+
		"\u0269\u026a\u0003H$\u0000\u026a\u026b\u0005s\u0000\u0000\u026b\u0270"+
		"\u0003n7\u0000\u026c\u026d\u0005H\u0000\u0000\u026d\u026f\u0005I\u0000"+
		"\u0000\u026e\u026c\u0001\u0000\u0000\u0000\u026f\u0272\u0001\u0000\u0000"+
		"\u0000\u0270\u026e\u0001\u0000\u0000\u0000\u0270\u0271\u0001\u0000\u0000"+
		"\u0000\u0271\u0275\u0001\u0000\u0000\u0000\u0272\u0270\u0001\u0000\u0000"+
		"\u0000\u0273\u0274\u00053\u0000\u0000\u0274\u0276\u0003l6\u0000\u0275"+
		"\u0273\u0001\u0000\u0000\u0000\u0275\u0276\u0001\u0000\u0000\u0000\u0276"+
		"\u0277\u0001\u0000\u0000\u0000\u0277\u0278\u0003F#\u0000\u0278E\u0001"+
		"\u0000\u0000\u0000\u0279\u027c\u0003\u009aM\u0000\u027a\u027c\u0005J\u0000"+
		"\u0000\u027b\u0279\u0001\u0000\u0000\u0000\u027b\u027a\u0001\u0000\u0000"+
		"\u0000\u027cG\u0001\u0000\u0000\u0000\u027d\u0280\u0003\u00deo\u0000\u027e"+
		"\u0280\u00057\u0000\u0000\u027f\u027d\u0001\u0000\u0000\u0000\u027f\u027e"+
		"\u0001\u0000\u0000\u0000\u0280I\u0001\u0000\u0000\u0000\u0281\u0282\u0003"+
		",\u0016\u0000\u0282\u0283\u0003D\"\u0000\u0283K\u0001\u0000\u0000\u0000"+
		"\u0284\u0285\u0003,\u0016\u0000\u0285\u0286\u0003N\'\u0000\u0286M\u0001"+
		"\u0000\u0000\u0000\u0287\u0288\u0005s\u0000\u0000\u0288\u028b\u0003n7"+
		"\u0000\u0289\u028a\u00053\u0000\u0000\u028a\u028c\u0003l6\u0000\u028b"+
		"\u0289\u0001\u0000\u0000\u0000\u028b\u028c\u0001\u0000\u0000\u0000\u028c"+
		"\u028d\u0001\u0000\u0000\u0000\u028d\u028e\u0003\u009aM\u0000\u028eO\u0001"+
		"\u0000\u0000\u0000\u028f\u0290\u0003\u00deo\u0000\u0290\u0291\u0003`0"+
		"\u0000\u0291\u0292\u0005J\u0000\u0000\u0292Q\u0001\u0000\u0000\u0000\u0293"+
		"\u0295\u0003$\u0012\u0000\u0294\u0293\u0001\u0000\u0000\u0000\u0295\u0298"+
		"\u0001\u0000\u0000\u0000\u0296\u0294\u0001\u0000\u0000\u0000\u0296\u0297"+
		"\u0001\u0000\u0000\u0000\u0297\u0299\u0001\u0000\u0000\u0000\u0298\u0296"+
		"\u0001\u0000\u0000\u0000\u0299\u029c\u0003T*\u0000\u029a\u029c\u0005J"+
		"\u0000\u0000\u029b\u0296\u0001\u0000\u0000\u0000\u029b\u029a\u0001\u0000"+
		"\u0000\u0000\u029cS\u0001\u0000\u0000\u0000\u029d\u02a5\u0003V+\u0000"+
		"\u029e\u02a5\u0003Z-\u0000\u029f\u02a5\u0003^/\u0000\u02a0\u02a5\u0003"+
		":\u001d\u0000\u02a1\u02a5\u0003\u008aE\u0000\u02a2\u02a5\u0003*\u0015"+
		"\u0000\u02a3\u02a5\u00032\u0019\u0000\u02a4\u029d\u0001\u0000\u0000\u0000"+
		"\u02a4\u029e\u0001\u0000\u0000\u0000\u02a4\u029f\u0001\u0000\u0000\u0000"+
		"\u02a4\u02a0\u0001\u0000\u0000\u0000\u02a4\u02a1\u0001\u0000\u0000\u0000"+
		"\u02a4\u02a2\u0001\u0000\u0000\u0000\u02a4\u02a3\u0001\u0000\u0000\u0000"+
		"\u02a5U\u0001\u0000\u0000\u0000\u02a6\u02a7\u0003\u00deo\u0000\u02a7\u02ac"+
		"\u0003X,\u0000\u02a8\u02a9\u0005K\u0000\u0000\u02a9\u02ab\u0003X,\u0000"+
		"\u02aa\u02a8\u0001\u0000\u0000\u0000\u02ab\u02ae\u0001\u0000\u0000\u0000"+
		"\u02ac\u02aa\u0001\u0000\u0000\u0000\u02ac\u02ad\u0001\u0000\u0000\u0000"+
		"\u02ad\u02af\u0001\u0000\u0000\u0000\u02ae\u02ac\u0001\u0000\u0000\u0000"+
		"\u02af\u02b0\u0005J\u0000\u0000\u02b0W\u0001\u0000\u0000\u0000\u02b1\u02b6"+
		"\u0005s\u0000\u0000\u02b2\u02b3\u0005H\u0000\u0000\u02b3\u02b5\u0005I"+
		"\u0000\u0000\u02b4\u02b2\u0001\u0000\u0000\u0000\u02b5\u02b8\u0001\u0000"+
		"\u0000\u0000\u02b6\u02b4\u0001\u0000\u0000\u0000\u02b6\u02b7\u0001\u0000"+
		"\u0000\u0000\u02b7\u02b9\u0001\u0000\u0000\u0000\u02b8\u02b6\u0001\u0000"+
		"\u0000\u0000\u02b9\u02ba\u0005M\u0000\u0000\u02ba\u02bb\u0003d2\u0000"+
		"\u02bbY\u0001\u0000\u0000\u0000\u02bc\u02be\u0003\\.\u0000\u02bd\u02bc"+
		"\u0001\u0000\u0000\u0000\u02be\u02c1\u0001\u0000\u0000\u0000\u02bf\u02bd"+
		"\u0001\u0000\u0000\u0000\u02bf\u02c0\u0001\u0000\u0000\u0000\u02c0\u02cc"+
		"\u0001\u0000\u0000\u0000\u02c1\u02bf\u0001\u0000\u0000\u0000\u02c2\u02cd"+
		"\u0003H$\u0000\u02c3\u02c7\u0003,\u0016\u0000\u02c4\u02c6\u0003\u0080"+
		"@\u0000\u02c5\u02c4\u0001\u0000\u0000\u0000\u02c6\u02c9\u0001\u0000\u0000"+
		"\u0000\u02c7\u02c5\u0001\u0000\u0000\u0000\u02c7\u02c8\u0001\u0000\u0000"+
		"\u0000\u02c8\u02ca\u0001\u0000\u0000\u0000\u02c9\u02c7\u0001\u0000\u0000"+
		"\u0000\u02ca\u02cb\u0003H$\u0000\u02cb\u02cd\u0001\u0000\u0000\u0000\u02cc"+
		"\u02c2\u0001\u0000\u0000\u0000\u02cc\u02c3\u0001\u0000\u0000\u0000\u02cd"+
		"\u02ce\u0001\u0000\u0000\u0000\u02ce\u02cf\u0005s\u0000\u0000\u02cf\u02d4"+
		"\u0003n7\u0000\u02d0\u02d1\u0005H\u0000\u0000\u02d1\u02d3\u0005I\u0000"+
		"\u0000\u02d2\u02d0\u0001\u0000\u0000\u0000\u02d3\u02d6\u0001\u0000\u0000"+
		"\u0000\u02d4\u02d2\u0001\u0000\u0000\u0000\u02d4\u02d5\u0001\u0000\u0000"+
		"\u0000\u02d5\u02d9\u0001\u0000\u0000\u0000\u02d6\u02d4\u0001\u0000\u0000"+
		"\u0000\u02d7\u02d8\u00053\u0000\u0000\u02d8\u02da\u0003l6\u0000\u02d9"+
		"\u02d7\u0001\u0000\u0000\u0000\u02d9\u02da\u0001\u0000\u0000\u0000\u02da"+
		"\u02db\u0001\u0000\u0000\u0000\u02db\u02dc\u0003F#\u0000\u02dc[\u0001"+
		"\u0000\u0000\u0000\u02dd\u02e4\u0003\u0080@\u0000\u02de\u02e4\u0005)\u0000"+
		"\u0000\u02df\u02e4\u0005\u0007\u0000\u0000\u02e0\u02e4\u0005\u0012\u0000"+
		"\u0000\u02e1\u02e4\u0005,\u0000\u0000\u02e2\u02e4\u0005-\u0000\u0000\u02e3"+
		"\u02dd\u0001\u0000\u0000\u0000\u02e3\u02de\u0001\u0000\u0000\u0000\u02e3"+
		"\u02df\u0001\u0000\u0000\u0000\u02e3\u02e0\u0001\u0000\u0000\u0000\u02e3"+
		"\u02e1\u0001\u0000\u0000\u0000\u02e3\u02e2\u0001\u0000\u0000\u0000\u02e4"+
		"]\u0001\u0000\u0000\u0000\u02e5\u02e6\u0003,\u0016\u0000\u02e6\u02e7\u0003"+
		"Z-\u0000\u02e7_\u0001\u0000\u0000\u0000\u02e8\u02ed\u0003b1\u0000\u02e9"+
		"\u02ea\u0005K\u0000\u0000\u02ea\u02ec\u0003b1\u0000\u02eb\u02e9\u0001"+
		"\u0000\u0000\u0000\u02ec\u02ef\u0001\u0000\u0000\u0000\u02ed\u02eb\u0001"+
		"\u0000\u0000\u0000\u02ed\u02ee\u0001\u0000\u0000\u0000\u02eea\u0001\u0000"+
		"\u0000\u0000\u02ef\u02ed\u0001\u0000\u0000\u0000\u02f0\u02f3\u0003\n\u0005"+
		"\u0000\u02f1\u02f2\u0005M\u0000\u0000\u02f2\u02f4\u0003d2\u0000\u02f3"+
		"\u02f1\u0001\u0000\u0000\u0000\u02f3\u02f4\u0001\u0000\u0000\u0000\u02f4"+
		"c\u0001\u0000\u0000\u0000\u02f5\u02f8\u0003f3\u0000\u02f6\u02f8\u0003"+
		"\u00be_\u0000\u02f7\u02f5\u0001\u0000\u0000\u0000\u02f7\u02f6\u0001\u0000"+
		"\u0000\u0000\u02f8e\u0001\u0000\u0000\u0000\u02f9\u0305\u0005F\u0000\u0000"+
		"\u02fa\u02ff\u0003d2\u0000\u02fb\u02fc\u0005K\u0000\u0000\u02fc\u02fe"+
		"\u0003d2\u0000\u02fd\u02fb\u0001\u0000\u0000\u0000\u02fe\u0301\u0001\u0000"+
		"\u0000\u0000\u02ff\u02fd\u0001\u0000\u0000\u0000\u02ff\u0300\u0001\u0000"+
		"\u0000\u0000\u0300\u0303\u0001\u0000\u0000\u0000\u0301\u02ff\u0001\u0000"+
		"\u0000\u0000\u0302\u0304\u0005K\u0000\u0000\u0303\u0302\u0001\u0000\u0000"+
		"\u0000\u0303\u0304\u0001\u0000\u0000\u0000\u0304\u0306\u0001\u0000\u0000"+
		"\u0000\u0305\u02fa\u0001\u0000\u0000\u0000\u0305\u0306\u0001\u0000\u0000"+
		"\u0000\u0306\u0307\u0001\u0000\u0000\u0000\u0307\u0308\u0005G\u0000\u0000"+
		"\u0308g\u0001\u0000\u0000\u0000\u0309\u030b\u0005s\u0000\u0000\u030a\u030c"+
		"\u0003\u00e0p\u0000\u030b\u030a\u0001\u0000\u0000\u0000\u030b\u030c\u0001"+
		"\u0000\u0000\u0000\u030c\u0314\u0001\u0000\u0000\u0000\u030d\u030e\u0005"+
		"L\u0000\u0000\u030e\u0310\u0005s\u0000\u0000\u030f\u0311\u0003\u00e0p"+
		"\u0000\u0310\u030f\u0001\u0000\u0000\u0000\u0310\u0311\u0001\u0000\u0000"+
		"\u0000\u0311\u0313\u0001\u0000\u0000\u0000\u0312\u030d\u0001\u0000\u0000"+
		"\u0000\u0313\u0316\u0001\u0000\u0000\u0000\u0314\u0312\u0001\u0000\u0000"+
		"\u0000\u0314\u0315\u0001\u0000\u0000\u0000\u0315i\u0001\u0000\u0000\u0000"+
		"\u0316\u0314\u0001\u0000\u0000\u0000\u0317\u031e\u0003\u00deo\u0000\u0318"+
		"\u031b\u0005R\u0000\u0000\u0319\u031a\u0007\u0001\u0000\u0000\u031a\u031c"+
		"\u0003\u00deo\u0000\u031b\u0319\u0001\u0000\u0000\u0000\u031b\u031c\u0001"+
		"\u0000\u0000\u0000\u031c\u031e\u0001\u0000\u0000\u0000\u031d\u0317\u0001"+
		"\u0000\u0000\u0000\u031d\u0318\u0001\u0000\u0000\u0000\u031ek\u0001\u0000"+
		"\u0000\u0000\u031f\u0324\u0003\u0016\u000b\u0000\u0320\u0321\u0005K\u0000"+
		"\u0000\u0321\u0323\u0003\u0016\u000b\u0000\u0322\u0320\u0001\u0000\u0000"+
		"\u0000\u0323\u0326\u0001\u0000\u0000\u0000\u0324\u0322\u0001\u0000\u0000"+
		"\u0000\u0324\u0325\u0001\u0000\u0000\u0000\u0325m\u0001\u0000\u0000\u0000"+
		"\u0326\u0324\u0001\u0000\u0000\u0000\u0327\u0329\u0005D\u0000\u0000\u0328"+
		"\u032a\u0003p8\u0000\u0329\u0328\u0001\u0000\u0000\u0000\u0329\u032a\u0001"+
		"\u0000\u0000\u0000\u032a\u032b\u0001\u0000\u0000\u0000\u032b\u032c\u0005"+
		"E\u0000\u0000\u032co\u0001\u0000\u0000\u0000\u032d\u0332\u0003r9\u0000"+
		"\u032e\u032f\u0005K\u0000\u0000\u032f\u0331\u0003r9\u0000\u0330\u032e"+
		"\u0001\u0000\u0000\u0000\u0331\u0334\u0001\u0000\u0000\u0000\u0332\u0330"+
		"\u0001\u0000\u0000\u0000\u0332\u0333\u0001\u0000\u0000\u0000\u0333\u0337"+
		"\u0001\u0000\u0000\u0000\u0334\u0332\u0001\u0000\u0000\u0000\u0335\u0336"+
		"\u0005K\u0000\u0000\u0336\u0338\u0003t:\u0000\u0337\u0335\u0001\u0000"+
		"\u0000\u0000\u0337\u0338\u0001\u0000\u0000\u0000\u0338\u033b\u0001\u0000"+
		"\u0000\u0000\u0339\u033b\u0003t:\u0000\u033a\u032d\u0001\u0000\u0000\u0000"+
		"\u033a\u0339\u0001\u0000\u0000\u0000\u033bq\u0001\u0000\u0000\u0000\u033c"+
		"\u033e\u0003(\u0014\u0000\u033d\u033c\u0001\u0000\u0000\u0000\u033e\u0341"+
		"\u0001\u0000\u0000\u0000\u033f\u033d\u0001\u0000\u0000\u0000\u033f\u0340"+
		"\u0001\u0000\u0000\u0000\u0340\u0342\u0001\u0000\u0000\u0000\u0341\u033f"+
		"\u0001\u0000\u0000\u0000\u0342\u0343\u0003\u00deo\u0000\u0343\u0344\u0003"+
		"\n\u0005\u0000\u0344s\u0001\u0000\u0000\u0000\u0345\u0347\u0003(\u0014"+
		"\u0000\u0346\u0345\u0001\u0000\u0000\u0000\u0347\u034a\u0001\u0000\u0000"+
		"\u0000\u0348\u0346\u0001\u0000\u0000\u0000\u0348\u0349\u0001\u0000\u0000"+
		"\u0000\u0349\u034b\u0001\u0000\u0000\u0000\u034a\u0348\u0001\u0000\u0000"+
		"\u0000\u034b\u034c\u0003\u00deo\u0000\u034c\u034d\u0005r\u0000\u0000\u034d"+
		"\u034e\u0003\n\u0005\u0000\u034eu\u0001\u0000\u0000\u0000\u034f\u0350"+
		"\u0005A\u0000\u0000\u0350w\u0001\u0000\u0000\u0000\u0351\u0352\u0005B"+
		"\u0000\u0000\u0352y\u0001\u0000\u0000\u0000\u0353\u0356\u0003v;\u0000"+
		"\u0354\u0356\u0003x<\u0000\u0355\u0353\u0001\u0000\u0000\u0000\u0355\u0354"+
		"\u0001\u0000\u0000\u0000\u0356{\u0001\u0000\u0000\u0000\u0357\u0358\u0007"+
		"\u0002\u0000\u0000\u0358}\u0001\u0000\u0000\u0000\u0359\u035a\u0007\u0003"+
		"\u0000\u0000\u035a\u007f\u0001\u0000\u0000\u0000\u035b\u035c\u0005q\u0000"+
		"\u0000\u035c\u0363\u0003\u0016\u000b\u0000\u035d\u0360\u0005D\u0000\u0000"+
		"\u035e\u0361\u0003\u0082A\u0000\u035f\u0361\u0003\u0086C\u0000\u0360\u035e"+
		"\u0001\u0000\u0000\u0000\u0360\u035f\u0001\u0000\u0000\u0000\u0360\u0361"+
		"\u0001\u0000\u0000\u0000\u0361\u0362\u0001\u0000\u0000\u0000\u0362\u0364"+
		"\u0005E\u0000\u0000\u0363\u035d\u0001\u0000\u0000\u0000\u0363\u0364\u0001"+
		"\u0000\u0000\u0000\u0364\u0081\u0001\u0000\u0000\u0000\u0365\u036a\u0003"+
		"\u0084B\u0000\u0366\u0367\u0005K\u0000\u0000\u0367\u0369\u0003\u0084B"+
		"\u0000\u0368\u0366\u0001\u0000\u0000\u0000\u0369\u036c\u0001\u0000\u0000"+
		"\u0000\u036a\u0368\u0001\u0000\u0000\u0000\u036a\u036b\u0001\u0000\u0000"+
		"\u0000\u036b\u0083\u0001\u0000\u0000\u0000\u036c\u036a\u0001\u0000\u0000"+
		"\u0000\u036d\u036e\u0005s\u0000\u0000\u036e\u036f\u0005M\u0000\u0000\u036f"+
		"\u0370\u0003\u0086C\u0000\u0370\u0085\u0001\u0000\u0000\u0000\u0371\u0375"+
		"\u0003\u00be_\u0000\u0372\u0375\u0003\u0080@\u0000\u0373\u0375\u0003\u0088"+
		"D\u0000\u0374\u0371\u0001\u0000\u0000\u0000\u0374\u0372\u0001\u0000\u0000"+
		"\u0000\u0374\u0373\u0001\u0000\u0000\u0000\u0375\u0087\u0001\u0000\u0000"+
		"\u0000\u0376\u037f\u0005F\u0000\u0000\u0377\u037c\u0003\u0086C\u0000\u0378"+
		"\u0379\u0005K\u0000\u0000\u0379\u037b\u0003\u0086C\u0000\u037a\u0378\u0001"+
		"\u0000\u0000\u0000\u037b\u037e\u0001\u0000\u0000\u0000\u037c\u037a\u0001"+
		"\u0000\u0000\u0000\u037c\u037d\u0001\u0000\u0000\u0000\u037d\u0380\u0001"+
		"\u0000\u0000\u0000\u037e\u037c\u0001\u0000\u0000\u0000\u037f\u0377\u0001"+
		"\u0000\u0000\u0000\u037f\u0380\u0001\u0000\u0000\u0000\u0380\u0382\u0001"+
		"\u0000\u0000\u0000\u0381\u0383\u0005K\u0000\u0000\u0382\u0381\u0001\u0000"+
		"\u0000\u0000\u0382\u0383\u0001\u0000\u0000\u0000\u0383\u0384\u0001\u0000"+
		"\u0000\u0000\u0384\u0385\u0005G\u0000\u0000\u0385\u0089\u0001\u0000\u0000"+
		"\u0000\u0386\u0387\u0005q\u0000\u0000\u0387\u0388\u0005\"\u0000\u0000"+
		"\u0388\u0389\u0005s\u0000\u0000\u0389\u038a\u0003\u008cF\u0000\u038a\u008b"+
		"\u0001\u0000\u0000\u0000\u038b\u038f\u0005F\u0000\u0000\u038c\u038e\u0003"+
		"\u008eG\u0000\u038d\u038c\u0001\u0000\u0000\u0000\u038e\u0391\u0001\u0000"+
		"\u0000\u0000\u038f\u038d\u0001\u0000\u0000\u0000\u038f\u0390\u0001\u0000"+
		"\u0000\u0000\u0390\u0392\u0001\u0000\u0000\u0000\u0391\u038f\u0001\u0000"+
		"\u0000\u0000\u0392\u0393\u0005G\u0000\u0000\u0393\u008d\u0001\u0000\u0000"+
		"\u0000\u0394\u0396\u0003$\u0012\u0000\u0395\u0394\u0001\u0000\u0000\u0000"+
		"\u0396\u0399\u0001\u0000\u0000\u0000\u0397\u0395\u0001\u0000\u0000\u0000"+
		"\u0397\u0398\u0001\u0000\u0000\u0000\u0398\u039a\u0001\u0000\u0000\u0000"+
		"\u0399\u0397\u0001\u0000\u0000\u0000\u039a\u039d\u0003\u0090H\u0000\u039b"+
		"\u039d\u0005J\u0000\u0000\u039c\u0397\u0001\u0000\u0000\u0000\u039c\u039b"+
		"\u0001\u0000\u0000\u0000\u039d\u008f\u0001\u0000\u0000\u0000\u039e\u039f"+
		"\u0003\u00deo\u0000\u039f\u03a0\u0003\u0092I\u0000\u03a0\u03a1\u0005J"+
		"\u0000\u0000\u03a1\u03b3\u0001\u0000\u0000\u0000\u03a2\u03a4\u0003*\u0015"+
		"\u0000\u03a3\u03a5\u0005J\u0000\u0000\u03a4\u03a3\u0001\u0000\u0000\u0000"+
		"\u03a4\u03a5\u0001\u0000\u0000\u0000\u03a5\u03b3\u0001\u0000\u0000\u0000"+
		"\u03a6\u03a8\u0003:\u001d\u0000\u03a7\u03a9\u0005J\u0000\u0000\u03a8\u03a7"+
		"\u0001\u0000\u0000\u0000\u03a8\u03a9\u0001\u0000\u0000\u0000\u03a9\u03b3"+
		"\u0001\u0000\u0000\u0000\u03aa\u03ac\u00032\u0019\u0000\u03ab\u03ad\u0005"+
		"J\u0000\u0000\u03ac\u03ab\u0001\u0000\u0000\u0000\u03ac\u03ad\u0001\u0000"+
		"\u0000\u0000\u03ad\u03b3\u0001\u0000\u0000\u0000\u03ae\u03b0\u0003\u008a"+
		"E\u0000\u03af\u03b1\u0005J\u0000\u0000\u03b0\u03af\u0001\u0000\u0000\u0000"+
		"\u03b0\u03b1\u0001\u0000\u0000\u0000\u03b1\u03b3\u0001\u0000\u0000\u0000"+
		"\u03b2\u039e\u0001\u0000\u0000\u0000\u03b2\u03a2\u0001\u0000\u0000\u0000"+
		"\u03b2\u03a6\u0001\u0000\u0000\u0000\u03b2\u03aa\u0001\u0000\u0000\u0000"+
		"\u03b2\u03ae\u0001\u0000\u0000\u0000\u03b3\u0091\u0001\u0000\u0000\u0000"+
		"\u03b4\u03b7\u0003\u0094J\u0000\u03b5\u03b7\u0003\u0096K\u0000\u03b6\u03b4"+
		"\u0001\u0000\u0000\u0000\u03b6\u03b5\u0001\u0000\u0000\u0000\u03b7\u0093"+
		"\u0001\u0000\u0000\u0000\u03b8\u03b9\u0005s\u0000\u0000\u03b9\u03ba\u0005"+
		"D\u0000\u0000\u03ba\u03bc\u0005E\u0000\u0000\u03bb\u03bd\u0003\u0098L"+
		"\u0000\u03bc\u03bb\u0001\u0000\u0000\u0000\u03bc\u03bd\u0001\u0000\u0000"+
		"\u0000\u03bd\u0095\u0001\u0000\u0000\u0000\u03be\u03bf\u0003`0\u0000\u03bf"+
		"\u0097\u0001\u0000\u0000\u0000\u03c0\u03c1\u0005\u0012\u0000\u0000\u03c1"+
		"\u03c2\u0003\u0086C\u0000\u03c2\u0099\u0001\u0000\u0000\u0000\u03c3\u03c7"+
		"\u0005F\u0000\u0000\u03c4\u03c6\u0003\u009cN\u0000\u03c5\u03c4\u0001\u0000"+
		"\u0000\u0000\u03c6\u03c9\u0001\u0000\u0000\u0000\u03c7\u03c5\u0001\u0000"+
		"\u0000\u0000\u03c7\u03c8\u0001\u0000\u0000\u0000\u03c8\u03ca\u0001\u0000"+
		"\u0000\u0000\u03c9\u03c7\u0001\u0000\u0000\u0000\u03ca\u03cb\u0005G\u0000"+
		"\u0000\u03cb\u009b\u0001\u0000\u0000\u0000\u03cc\u03cd\u0003\u009eO\u0000"+
		"\u03cd\u03ce\u0005J\u0000\u0000\u03ce\u03d2\u0001\u0000\u0000\u0000\u03cf"+
		"\u03d2\u0003\u00a2Q\u0000\u03d0\u03d2\u0003\u00a0P\u0000\u03d1\u03cc\u0001"+
		"\u0000\u0000\u0000\u03d1\u03cf\u0001\u0000\u0000\u0000\u03d1\u03d0\u0001"+
		"\u0000\u0000\u0000\u03d2\u009d\u0001\u0000\u0000\u0000\u03d3\u03d5\u0003"+
		"(\u0014\u0000\u03d4\u03d3\u0001\u0000\u0000\u0000\u03d5\u03d8\u0001\u0000"+
		"\u0000\u0000\u03d6\u03d4\u0001\u0000\u0000\u0000\u03d6\u03d7\u0001\u0000"+
		"\u0000\u0000\u03d7\u03d9\u0001\u0000\u0000\u0000\u03d8\u03d6\u0001\u0000"+
		"\u0000\u0000\u03d9\u03da\u0003\u00deo\u0000\u03da\u03db\u0003`0\u0000"+
		"\u03db\u009f\u0001\u0000\u0000\u0000\u03dc\u03de\u0003&\u0013\u0000\u03dd"+
		"\u03dc\u0001\u0000\u0000\u0000\u03de\u03e1\u0001\u0000\u0000\u0000\u03df"+
		"\u03dd\u0001\u0000\u0000\u0000\u03df\u03e0\u0001\u0000\u0000\u0000\u03e0"+
		"\u03e4\u0001\u0000\u0000\u0000\u03e1\u03df\u0001\u0000\u0000\u0000\u03e2"+
		"\u03e5\u0003*\u0015\u0000\u03e3\u03e5\u0003:\u001d\u0000\u03e4\u03e2\u0001"+
		"\u0000\u0000\u0000\u03e4\u03e3\u0001\u0000\u0000\u0000\u03e5\u03e8\u0001"+
		"\u0000\u0000\u0000\u03e6\u03e8\u0005J\u0000\u0000\u03e7\u03df\u0001\u0000"+
		"\u0000\u0000\u03e7\u03e6\u0001\u0000\u0000\u0000\u03e8\u00a1\u0001\u0000"+
		"\u0000\u0000\u03e9\u0452\u0003\u009aM\u0000\u03ea\u03eb\u0005\b\u0000"+
		"\u0000\u03eb\u03ee\u0003\u00be_\u0000\u03ec\u03ed\u0005S\u0000\u0000\u03ed"+
		"\u03ef\u0003\u00be_\u0000\u03ee\u03ec\u0001\u0000\u0000\u0000\u03ee\u03ef"+
		"\u0001\u0000\u0000\u0000\u03ef\u03f0\u0001\u0000\u0000\u0000\u03f0\u03f1"+
		"\u0005J\u0000\u0000\u03f1\u0452\u0001\u0000\u0000\u0000\u03f2\u03f3\u0005"+
		"\u001c\u0000\u0000\u03f3\u03f4\u0003\u00ba]\u0000\u03f4\u03f7\u0003\u00a2"+
		"Q\u0000\u03f5\u03f6\u0005\u0015\u0000\u0000\u03f6\u03f8\u0003\u00a2Q\u0000"+
		"\u03f7\u03f5\u0001\u0000\u0000\u0000\u03f7\u03f8\u0001\u0000\u0000\u0000"+
		"\u03f8\u0452\u0001\u0000\u0000\u0000\u03f9\u03fa\u0005\u001b\u0000\u0000"+
		"\u03fa\u03fb\u0005D\u0000\u0000\u03fb\u03fc\u0003\u00b4Z\u0000\u03fc\u03fd"+
		"\u0005E\u0000\u0000\u03fd\u03fe\u0003\u00a2Q\u0000\u03fe\u0452\u0001\u0000"+
		"\u0000\u0000\u03ff\u0400\u00059\u0000\u0000\u0400\u0401\u0003\u00ba]\u0000"+
		"\u0401\u0402\u0003\u00a2Q\u0000\u0402\u0452\u0001\u0000\u0000\u0000\u0403"+
		"\u0404\u0005\u0013\u0000\u0000\u0404\u0405\u0003\u00a2Q\u0000\u0405\u0406"+
		"\u00059\u0000\u0000\u0406\u0407\u0003\u00ba]\u0000\u0407\u0408\u0005J"+
		"\u0000\u0000\u0408\u0452\u0001\u0000\u0000\u0000\u0409\u040a\u00055\u0000"+
		"\u0000\u040a\u0414\u0003\u009aM\u0000\u040b\u040d\u0003\u00a4R\u0000\u040c"+
		"\u040b\u0001\u0000\u0000\u0000\u040d\u040e\u0001\u0000\u0000\u0000\u040e"+
		"\u040c\u0001\u0000\u0000\u0000\u040e\u040f\u0001\u0000\u0000\u0000\u040f"+
		"\u0411\u0001\u0000\u0000\u0000\u0410\u0412\u0003\u00a8T\u0000\u0411\u0410"+
		"\u0001\u0000\u0000\u0000\u0411\u0412\u0001\u0000\u0000\u0000\u0412\u0415"+
		"\u0001\u0000\u0000\u0000\u0413\u0415\u0003\u00a8T\u0000\u0414\u040c\u0001"+
		"\u0000\u0000\u0000\u0414\u0413\u0001\u0000\u0000\u0000\u0415\u0452\u0001"+
		"\u0000\u0000\u0000\u0416\u0417\u00055\u0000\u0000\u0417\u0418\u0003\u00aa"+
		"U\u0000\u0418\u041c\u0003\u009aM\u0000\u0419\u041b\u0003\u00a4R\u0000"+
		"\u041a\u0419\u0001\u0000\u0000\u0000\u041b\u041e\u0001\u0000\u0000\u0000"+
		"\u041c\u041a\u0001\u0000\u0000\u0000\u041c\u041d\u0001\u0000\u0000\u0000"+
		"\u041d\u0420\u0001\u0000\u0000\u0000\u041e\u041c\u0001\u0000\u0000\u0000"+
		"\u041f\u0421\u0003\u00a8T\u0000\u0420\u041f\u0001\u0000\u0000\u0000\u0420"+
		"\u0421\u0001\u0000\u0000\u0000\u0421\u0452\u0001\u0000\u0000\u0000\u0422"+
		"\u0423\u0005/\u0000\u0000\u0423\u0424\u0003\u00ba]\u0000\u0424\u0428\u0005"+
		"F\u0000\u0000\u0425\u0427\u0003\u00b0X\u0000\u0426\u0425\u0001\u0000\u0000"+
		"\u0000\u0427\u042a\u0001\u0000\u0000\u0000\u0428\u0426\u0001\u0000\u0000"+
		"\u0000\u0428\u0429\u0001\u0000\u0000\u0000\u0429\u042e\u0001\u0000\u0000"+
		"\u0000\u042a\u0428\u0001\u0000\u0000\u0000\u042b\u042d\u0003\u00b2Y\u0000"+
		"\u042c\u042b\u0001\u0000\u0000\u0000\u042d\u0430\u0001\u0000\u0000\u0000"+
		"\u042e\u042c\u0001\u0000\u0000\u0000\u042e\u042f\u0001\u0000\u0000\u0000"+
		"\u042f\u0431\u0001\u0000\u0000\u0000\u0430\u042e\u0001\u0000\u0000\u0000"+
		"\u0431\u0432\u0005G\u0000\u0000\u0432\u0452\u0001\u0000\u0000\u0000\u0433"+
		"\u0434\u00050\u0000\u0000\u0434\u0435\u0003\u00ba]\u0000\u0435\u0436\u0003"+
		"\u009aM\u0000\u0436\u0452\u0001\u0000\u0000\u0000\u0437\u0439\u0005*\u0000"+
		"\u0000\u0438\u043a\u0003\u00be_\u0000\u0439\u0438\u0001\u0000\u0000\u0000"+
		"\u0439\u043a\u0001\u0000\u0000\u0000\u043a\u043b\u0001\u0000\u0000\u0000"+
		"\u043b\u0452\u0005J\u0000\u0000\u043c\u043d\u00052\u0000\u0000\u043d\u043e"+
		"\u0003\u00be_\u0000\u043e\u043f\u0005J\u0000\u0000\u043f\u0452\u0001\u0000"+
		"\u0000\u0000\u0440\u0442\u0005\n\u0000\u0000\u0441\u0443\u0005s\u0000"+
		"\u0000\u0442\u0441\u0001\u0000\u0000\u0000\u0442\u0443\u0001\u0000\u0000"+
		"\u0000\u0443\u0444\u0001\u0000\u0000\u0000\u0444\u0452\u0005J\u0000\u0000"+
		"\u0445\u0447\u0005\u0011\u0000\u0000\u0446\u0448\u0005s\u0000\u0000\u0447"+
		"\u0446\u0001\u0000\u0000\u0000\u0447\u0448\u0001\u0000\u0000\u0000\u0448"+
		"\u0449\u0001\u0000\u0000\u0000\u0449\u0452\u0005J\u0000\u0000\u044a\u0452"+
		"\u0005J\u0000\u0000\u044b\u044c\u0003\u00be_\u0000\u044c\u044d\u0005J"+
		"\u0000\u0000\u044d\u0452\u0001\u0000\u0000\u0000\u044e\u044f\u0005s\u0000"+
		"\u0000\u044f\u0450\u0005S\u0000\u0000\u0450\u0452\u0003\u00a2Q\u0000\u0451"+
		"\u03e9\u0001\u0000\u0000\u0000\u0451\u03ea\u0001\u0000\u0000\u0000\u0451"+
		"\u03f2\u0001\u0000\u0000\u0000\u0451\u03f9\u0001\u0000\u0000\u0000\u0451"+
		"\u03ff\u0001\u0000\u0000\u0000\u0451\u0403\u0001\u0000\u0000\u0000\u0451"+
		"\u0409\u0001\u0000\u0000\u0000\u0451\u0416\u0001\u0000\u0000\u0000\u0451"+
		"\u0422\u0001\u0000\u0000\u0000\u0451\u0433\u0001\u0000\u0000\u0000\u0451"+
		"\u0437\u0001\u0000\u0000\u0000\u0451\u043c\u0001\u0000\u0000\u0000\u0451"+
		"\u0440\u0001\u0000\u0000\u0000\u0451\u0445\u0001\u0000\u0000\u0000\u0451"+
		"\u044a\u0001\u0000\u0000\u0000\u0451\u044b\u0001\u0000\u0000\u0000\u0451"+
		"\u044e\u0001\u0000\u0000\u0000\u0452\u00a3\u0001\u0000\u0000\u0000\u0453"+
		"\u0454\u0005\r\u0000\u0000\u0454\u0458\u0005D\u0000\u0000\u0455\u0457"+
		"\u0003(\u0014\u0000\u0456\u0455\u0001\u0000\u0000\u0000\u0457\u045a\u0001"+
		"\u0000\u0000\u0000\u0458\u0456\u0001\u0000\u0000\u0000\u0458\u0459\u0001"+
		"\u0000\u0000\u0000\u0459\u045b\u0001\u0000\u0000\u0000\u045a\u0458\u0001"+
		"\u0000\u0000\u0000\u045b\u045c\u0003\u00a6S\u0000\u045c\u045d\u0005s\u0000"+
		"\u0000\u045d\u045e\u0005E\u0000\u0000\u045e\u045f\u0003\u009aM\u0000\u045f"+
		"\u00a5\u0001\u0000\u0000\u0000\u0460\u0465\u0003\u0016\u000b\u0000\u0461"+
		"\u0462\u0005a\u0000\u0000\u0462\u0464\u0003\u0016\u000b\u0000\u0463\u0461"+
		"\u0001\u0000\u0000\u0000\u0464\u0467\u0001\u0000\u0000\u0000\u0465\u0463"+
		"\u0001\u0000\u0000\u0000\u0465\u0466\u0001\u0000\u0000\u0000\u0466\u00a7"+
		"\u0001\u0000\u0000\u0000\u0467\u0465\u0001\u0000\u0000\u0000\u0468\u0469"+
		"\u0005\u0019\u0000\u0000\u0469\u046a\u0003\u009aM\u0000\u046a\u00a9\u0001"+
		"\u0000\u0000\u0000\u046b\u046c\u0005D\u0000\u0000\u046c\u046e\u0003\u00ac"+
		"V\u0000\u046d\u046f\u0005J\u0000\u0000\u046e\u046d\u0001\u0000\u0000\u0000"+
		"\u046e\u046f\u0001\u0000\u0000\u0000\u046f\u0470\u0001\u0000\u0000\u0000"+
		"\u0470\u0471\u0005E\u0000\u0000\u0471\u00ab\u0001\u0000\u0000\u0000\u0472"+
		"\u0477\u0003\u00aeW\u0000\u0473\u0474\u0005J\u0000\u0000\u0474\u0476\u0003"+
		"\u00aeW\u0000\u0475\u0473\u0001\u0000\u0000\u0000\u0476\u0479\u0001\u0000"+
		"\u0000\u0000\u0477\u0475\u0001\u0000\u0000\u0000\u0477\u0478\u0001\u0000"+
		"\u0000\u0000\u0478\u00ad\u0001\u0000\u0000\u0000\u0479\u0477\u0001\u0000"+
		"\u0000\u0000\u047a\u047c\u0003(\u0014\u0000\u047b\u047a\u0001\u0000\u0000"+
		"\u0000\u047c\u047f\u0001\u0000\u0000\u0000\u047d\u047b\u0001\u0000\u0000"+
		"\u0000\u047d\u047e\u0001\u0000\u0000\u0000\u047e\u0480\u0001\u0000\u0000"+
		"\u0000\u047f\u047d\u0001\u0000\u0000\u0000\u0480\u0481\u0003h4\u0000\u0481"+
		"\u0482\u0003\n\u0005\u0000\u0482\u0483\u0005M\u0000\u0000\u0483\u0484"+
		"\u0003\u00be_\u0000\u0484\u00af\u0001\u0000\u0000\u0000\u0485\u0487\u0003"+
		"\u00b2Y\u0000\u0486\u0485\u0001\u0000\u0000\u0000\u0487\u0488\u0001\u0000"+
		"\u0000\u0000\u0488\u0486\u0001\u0000\u0000\u0000\u0488\u0489\u0001\u0000"+
		"\u0000\u0000\u0489\u048b\u0001\u0000\u0000\u0000\u048a\u048c\u0003\u009c"+
		"N\u0000\u048b\u048a\u0001\u0000\u0000\u0000\u048c\u048d\u0001\u0000\u0000"+
		"\u0000\u048d\u048b\u0001\u0000\u0000\u0000\u048d\u048e\u0001\u0000\u0000"+
		"\u0000\u048e\u00b1\u0001\u0000\u0000\u0000\u048f\u0492\u0005\f\u0000\u0000"+
		"\u0490\u0493\u0003\u00be_\u0000\u0491\u0493\u0005s\u0000\u0000\u0492\u0490"+
		"\u0001\u0000\u0000\u0000\u0492\u0491\u0001\u0000\u0000\u0000\u0493\u0494"+
		"\u0001\u0000\u0000\u0000\u0494\u0498\u0005S\u0000\u0000\u0495\u0496\u0005"+
		"\u0012\u0000\u0000\u0496\u0498\u0005S\u0000\u0000\u0497\u048f\u0001\u0000"+
		"\u0000\u0000\u0497\u0495\u0001\u0000\u0000\u0000\u0498\u00b3\u0001\u0000"+
		"\u0000\u0000\u0499\u04a6\u0003\u00b8\\\u0000\u049a\u049c\u0003\u00b6["+
		"\u0000\u049b\u049a\u0001\u0000\u0000\u0000\u049b\u049c\u0001\u0000\u0000"+
		"\u0000\u049c\u049d\u0001\u0000\u0000\u0000\u049d\u049f\u0005J\u0000\u0000"+
		"\u049e\u04a0\u0003\u00be_\u0000\u049f\u049e\u0001\u0000\u0000\u0000\u049f"+
		"\u04a0\u0001\u0000\u0000\u0000\u04a0\u04a1\u0001\u0000\u0000\u0000\u04a1"+
		"\u04a3\u0005J\u0000\u0000\u04a2\u04a4\u0003\u00bc^\u0000\u04a3\u04a2\u0001"+
		"\u0000\u0000\u0000\u04a3\u04a4\u0001\u0000\u0000\u0000\u04a4\u04a6\u0001"+
		"\u0000\u0000\u0000\u04a5\u0499\u0001\u0000\u0000\u0000\u04a5\u049b\u0001"+
		"\u0000\u0000\u0000\u04a6\u00b5\u0001\u0000\u0000\u0000\u04a7\u04aa\u0003"+
		"\u009eO\u0000\u04a8\u04aa\u0003\u00bc^\u0000\u04a9\u04a7\u0001\u0000\u0000"+
		"\u0000\u04a9\u04a8\u0001\u0000\u0000\u0000\u04aa\u00b7\u0001\u0000\u0000"+
		"\u0000\u04ab\u04ad\u0003(\u0014\u0000\u04ac\u04ab\u0001\u0000\u0000\u0000"+
		"\u04ad\u04b0\u0001\u0000\u0000\u0000\u04ae\u04ac\u0001\u0000\u0000\u0000"+
		"\u04ae\u04af\u0001\u0000\u0000\u0000\u04af\u04b1\u0001\u0000\u0000\u0000"+
		"\u04b0\u04ae\u0001\u0000\u0000\u0000\u04b1\u04b2\u0003\u00deo\u0000\u04b2"+
		"\u04b3\u0003\n\u0005\u0000\u04b3\u04b4\u0005S\u0000\u0000\u04b4\u04b5"+
		"\u0003\u00be_\u0000\u04b5\u00b9\u0001\u0000\u0000\u0000\u04b6\u04b7\u0005"+
		"D\u0000\u0000\u04b7\u04b8\u0003\u00be_\u0000\u04b8\u04b9\u0005E\u0000"+
		"\u0000\u04b9\u00bb\u0001\u0000\u0000\u0000\u04ba\u04bf\u0003\u00be_\u0000"+
		"\u04bb\u04bc\u0005K\u0000\u0000\u04bc\u04be\u0003\u00be_\u0000\u04bd\u04bb"+
		"\u0001\u0000\u0000\u0000\u04be\u04c1\u0001\u0000\u0000\u0000\u04bf\u04bd"+
		"\u0001\u0000\u0000\u0000\u04bf\u04c0\u0001\u0000\u0000\u0000\u04c0\u00bd"+
		"\u0001\u0000\u0000\u0000\u04c1\u04bf\u0001\u0000\u0000\u0000\u04c2\u04c3"+
		"\u0006_\uffff\uffff\u0000\u04c3\u04e2\u0003\u00c6c\u0000\u04c4\u04e2\u0003"+
		"\u000e\u0007\u0000\u04c5\u04c6\u0005%\u0000\u0000\u04c6\u04e2\u0003\u00ca"+
		"e\u0000\u04c7\u04c8\u0005D\u0000\u0000\u04c8\u04c9\u0003\u00deo\u0000"+
		"\u04c9\u04ca\u0005E\u0000\u0000\u04ca\u04cb\u0003\u00be_\u0015\u04cb\u04e2"+
		"\u0001\u0000\u0000\u0000\u04cc\u04cd\u0007\u0004\u0000\u0000\u04cd\u04e2"+
		"\u0003\u00be_\u0013\u04ce\u04cf\u0007\u0005\u0000\u0000\u04cf\u04e2\u0003"+
		"\u00be_\u0012\u04d0\u04e2\u0003\u00c0`\u0000\u04d1\u04d2\u0003\u00deo"+
		"\u0000\u04d2\u04d8\u0005p\u0000\u0000\u04d3\u04d5\u0003\u00e0p\u0000\u04d4"+
		"\u04d3\u0001\u0000\u0000\u0000\u04d4\u04d5\u0001\u0000\u0000\u0000\u04d5"+
		"\u04d6\u0001\u0000\u0000\u0000\u04d6\u04d9\u0005s\u0000\u0000\u04d7\u04d9"+
		"\u0005%\u0000\u0000\u04d8\u04d4\u0001\u0000\u0000\u0000\u04d8\u04d7\u0001"+
		"\u0000\u0000\u0000\u04d9\u04e2\u0001\u0000\u0000\u0000\u04da\u04db\u0003"+
		"\u00c8d\u0000\u04db\u04dd\u0005p\u0000\u0000\u04dc\u04de\u0003\u00e0p"+
		"\u0000\u04dd\u04dc\u0001\u0000\u0000\u0000\u04dd\u04de\u0001\u0000\u0000"+
		"\u0000\u04de\u04df\u0001\u0000\u0000\u0000\u04df\u04e0\u0005%\u0000\u0000"+
		"\u04e0\u04e2\u0001\u0000\u0000\u0000\u04e1\u04c2\u0001\u0000\u0000\u0000"+
		"\u04e1\u04c4\u0001\u0000\u0000\u0000\u04e1\u04c5\u0001\u0000\u0000\u0000"+
		"\u04e1\u04c7\u0001\u0000\u0000\u0000\u04e1\u04cc\u0001\u0000\u0000\u0000"+
		"\u04e1\u04ce\u0001\u0000\u0000\u0000\u04e1\u04d0\u0001\u0000\u0000\u0000"+
		"\u04e1\u04d1\u0001\u0000\u0000\u0000\u04e1\u04da\u0001\u0000\u0000\u0000"+
		"\u04e2\u0533\u0001\u0000\u0000\u0000\u04e3\u04e4\n\u0011\u0000\u0000\u04e4"+
		"\u04e5\u0007\u0006\u0000\u0000\u04e5\u0532\u0003\u00be_\u0012\u04e6\u04e7"+
		"\n\u0010\u0000\u0000\u04e7\u04e8\u0007\u0007\u0000\u0000\u04e8\u0532\u0003"+
		"\u00be_\u0011\u04e9\u04f1\n\u000f\u0000\u0000\u04ea\u04eb\u0005O\u0000"+
		"\u0000\u04eb\u04f2\u0005O\u0000\u0000\u04ec\u04ed\u0005N\u0000\u0000\u04ed"+
		"\u04ee\u0005N\u0000\u0000\u04ee\u04f2\u0005N\u0000\u0000\u04ef\u04f0\u0005"+
		"N\u0000\u0000\u04f0\u04f2\u0005N\u0000\u0000\u04f1\u04ea\u0001\u0000\u0000"+
		"\u0000\u04f1\u04ec\u0001\u0000\u0000\u0000\u04f1\u04ef\u0001\u0000\u0000"+
		"\u0000\u04f2\u04f3\u0001\u0000\u0000\u0000\u04f3\u0532\u0003\u00be_\u0010"+
		"\u04f4\u04f5\n\u000e\u0000\u0000\u04f5\u04f6\u0007\b\u0000\u0000\u04f6"+
		"\u0532\u0003\u00be_\u000f\u04f7\u04f8\n\f\u0000\u0000\u04f8\u04f9\u0007"+
		"\t\u0000\u0000\u04f9\u0532\u0003\u00be_\r\u04fa\u04fb\n\u000b\u0000\u0000"+
		"\u04fb\u04fc\u0005`\u0000\u0000\u04fc\u0532\u0003\u00be_\f\u04fd\u04fe"+
		"\n\n\u0000\u0000\u04fe\u04ff\u0005b\u0000\u0000\u04ff\u0532\u0003\u00be"+
		"_\u000b\u0500\u0501\n\t\u0000\u0000\u0501\u0502\u0005a\u0000\u0000\u0502"+
		"\u0532\u0003\u00be_\n\u0503\u0504\n\b\u0000\u0000\u0504\u0505\u0005X\u0000"+
		"\u0000\u0505\u0532\u0003\u00be_\t\u0506\u0507\n\u0007\u0000\u0000\u0507"+
		"\u0508\u0005Y\u0000\u0000\u0508\u0532\u0003\u00be_\b\u0509\u050a\n\u0006"+
		"\u0000\u0000\u050a\u050b\u0005R\u0000\u0000\u050b\u050c\u0003\u00be_\u0000"+
		"\u050c\u050d\u0005S\u0000\u0000\u050d\u050e\u0003\u00be_\u0007\u050e\u0532"+
		"\u0001\u0000\u0000\u0000\u050f\u0510\n\u0005\u0000\u0000\u0510\u0511\u0007"+
		"\n\u0000\u0000\u0511\u0532\u0003\u00be_\u0005\u0512\u0513\n\u0019\u0000"+
		"\u0000\u0513\u051f\u0005L\u0000\u0000\u0514\u0520\u0005s\u0000\u0000\u0515"+
		"\u0520\u0003\u000e\u0007\u0000\u0516\u0520\u00051\u0000\u0000\u0517\u0519"+
		"\u0005%\u0000\u0000\u0518\u051a\u0003\u00dam\u0000\u0519\u0518\u0001\u0000"+
		"\u0000\u0000\u0519\u051a\u0001\u0000\u0000\u0000\u051a\u051b\u0001\u0000"+
		"\u0000\u0000\u051b\u0520\u0003\u00ceg\u0000\u051c\u051d\u0005.\u0000\u0000"+
		"\u051d\u0520\u0003\u00e2q\u0000\u051e\u0520\u0003\u00d4j\u0000\u051f\u0514"+
		"\u0001\u0000\u0000\u0000\u051f\u0515\u0001\u0000\u0000\u0000\u051f\u0516"+
		"\u0001\u0000\u0000\u0000\u051f\u0517\u0001\u0000\u0000\u0000\u051f\u051c"+
		"\u0001\u0000\u0000\u0000\u051f\u051e\u0001\u0000\u0000\u0000\u0520\u0532"+
		"\u0001\u0000\u0000\u0000\u0521\u0522\n\u0018\u0000\u0000\u0522\u0523\u0005"+
		"H\u0000\u0000\u0523\u0524\u0003\u00be_\u0000\u0524\u0525\u0005I\u0000"+
		"\u0000\u0525\u0532\u0001\u0000\u0000\u0000\u0526\u0527\n\u0014\u0000\u0000"+
		"\u0527\u0532\u0007\u000b\u0000\u0000\u0528\u0529\n\r\u0000\u0000\u0529"+
		"\u052a\u0005 \u0000\u0000\u052a\u0532\u0003\u00deo\u0000\u052b\u052c\n"+
		"\u0003\u0000\u0000\u052c\u052e\u0005p\u0000\u0000\u052d\u052f\u0003\u00e0"+
		"p\u0000\u052e\u052d\u0001\u0000\u0000\u0000\u052e\u052f\u0001\u0000\u0000"+
		"\u0000\u052f\u0530\u0001\u0000\u0000\u0000\u0530\u0532\u0005s\u0000\u0000"+
		"\u0531\u04e3\u0001\u0000\u0000\u0000\u0531\u04e6\u0001\u0000\u0000\u0000"+
		"\u0531\u04e9\u0001\u0000\u0000\u0000\u0531\u04f4\u0001\u0000\u0000\u0000"+
		"\u0531\u04f7\u0001\u0000\u0000\u0000\u0531\u04fa\u0001\u0000\u0000\u0000"+
		"\u0531\u04fd\u0001\u0000\u0000\u0000\u0531\u0500\u0001\u0000\u0000\u0000"+
		"\u0531\u0503\u0001\u0000\u0000\u0000\u0531\u0506\u0001\u0000\u0000\u0000"+
		"\u0531\u0509\u0001\u0000\u0000\u0000\u0531\u050f\u0001\u0000\u0000\u0000"+
		"\u0531\u0512\u0001\u0000\u0000\u0000\u0531\u0521\u0001\u0000\u0000\u0000"+
		"\u0531\u0526\u0001\u0000\u0000\u0000\u0531\u0528\u0001\u0000\u0000\u0000"+
		"\u0531\u052b\u0001\u0000\u0000\u0000\u0532\u0535\u0001\u0000\u0000\u0000"+
		"\u0533\u0531\u0001\u0000\u0000\u0000\u0533\u0534\u0001\u0000\u0000\u0000"+
		"\u0534\u00bf\u0001\u0000\u0000\u0000\u0535\u0533\u0001\u0000\u0000\u0000"+
		"\u0536\u0537\u0003\u00c2a\u0000\u0537\u0538\u0005o\u0000\u0000\u0538\u0539"+
		"\u0003\u00c4b\u0000\u0539\u00c1\u0001\u0000\u0000\u0000\u053a\u054b\u0005"+
		"s\u0000\u0000\u053b\u053d\u0005D\u0000\u0000\u053c\u053e\u0003p8\u0000"+
		"\u053d\u053c\u0001\u0000\u0000\u0000\u053d\u053e\u0001\u0000\u0000\u0000"+
		"\u053e\u053f\u0001\u0000\u0000\u0000\u053f\u054b\u0005E\u0000\u0000\u0540"+
		"\u0541\u0005D\u0000\u0000\u0541\u0546\u0005s\u0000\u0000\u0542\u0543\u0005"+
		"K\u0000\u0000\u0543\u0545\u0005s\u0000\u0000\u0544\u0542\u0001\u0000\u0000"+
		"\u0000\u0545\u0548\u0001\u0000\u0000\u0000\u0546\u0544\u0001\u0000\u0000"+
		"\u0000\u0546\u0547\u0001\u0000\u0000\u0000\u0547\u0549\u0001\u0000\u0000"+
		"\u0000\u0548\u0546\u0001\u0000\u0000\u0000\u0549\u054b\u0005E\u0000\u0000"+
		"\u054a\u053a\u0001\u0000\u0000\u0000\u054a\u053b\u0001\u0000\u0000\u0000"+
		"\u054a\u0540\u0001\u0000\u0000\u0000\u054b\u00c3\u0001\u0000\u0000\u0000"+
		"\u054c\u054f\u0003\u00be_\u0000\u054d\u054f\u0003\u009aM\u0000\u054e\u054c"+
		"\u0001\u0000\u0000\u0000\u054e\u054d\u0001\u0000\u0000\u0000\u054f\u00c5"+
		"\u0001\u0000\u0000\u0000\u0550\u0551\u0005D\u0000\u0000\u0551\u0552\u0003"+
		"\u00be_\u0000\u0552\u0553\u0005E\u0000\u0000\u0553\u0563\u0001\u0000\u0000"+
		"\u0000\u0554\u0563\u00051\u0000\u0000\u0555\u0563\u0005.\u0000\u0000\u0556"+
		"\u0563\u0003\u0018\f\u0000\u0557\u0563\u0005s\u0000\u0000\u0558\u0559"+
		"\u0003H$\u0000\u0559\u055a\u0005L\u0000\u0000\u055a\u055b\u0005\u000f"+
		"\u0000\u0000\u055b\u0563\u0001\u0000\u0000\u0000\u055c\u0560\u0003\u00da"+
		"m\u0000\u055d\u0561\u0003\u00e4r\u0000\u055e\u055f\u00051\u0000\u0000"+
		"\u055f\u0561\u0003\u00e6s\u0000\u0560\u055d\u0001\u0000\u0000\u0000\u0560"+
		"\u055e\u0001\u0000\u0000\u0000\u0561\u0563\u0001\u0000\u0000\u0000\u0562"+
		"\u0550\u0001\u0000\u0000\u0000\u0562\u0554\u0001\u0000\u0000\u0000\u0562"+
		"\u0555\u0001\u0000\u0000\u0000\u0562\u0556\u0001\u0000\u0000\u0000\u0562"+
		"\u0557\u0001\u0000\u0000\u0000\u0562\u0558\u0001\u0000\u0000\u0000\u0562"+
		"\u055c\u0001\u0000\u0000\u0000\u0563\u00c7\u0001\u0000\u0000\u0000\u0564"+
		"\u0565\u0003h4\u0000\u0565\u0566\u0005L\u0000\u0000\u0566\u0568\u0001"+
		"\u0000\u0000\u0000\u0567\u0564\u0001\u0000\u0000\u0000\u0567\u0568\u0001"+
		"\u0000\u0000\u0000\u0568\u056c\u0001\u0000\u0000\u0000\u0569\u056b\u0003"+
		"\u0080@\u0000\u056a\u0569\u0001\u0000\u0000\u0000\u056b\u056e\u0001\u0000"+
		"\u0000\u0000\u056c\u056a\u0001\u0000\u0000\u0000\u056c\u056d\u0001\u0000"+
		"\u0000\u0000\u056d\u056f\u0001\u0000\u0000\u0000\u056e\u056c\u0001\u0000"+
		"\u0000\u0000\u056f\u0571\u0005s\u0000\u0000\u0570\u0572\u0003\u00e0p\u0000"+
		"\u0571\u0570\u0001\u0000\u0000\u0000\u0571\u0572\u0001\u0000\u0000\u0000"+
		"\u0572\u00c9\u0001\u0000\u0000\u0000\u0573\u0574\u0003\u00dam\u0000\u0574"+
		"\u0575\u0003\u00ccf\u0000\u0575\u0576\u0003\u00d2i\u0000\u0576\u057d\u0001"+
		"\u0000\u0000\u0000\u0577\u057a\u0003\u00ccf\u0000\u0578\u057b\u0003\u00d0"+
		"h\u0000\u0579\u057b\u0003\u00d2i\u0000\u057a\u0578\u0001\u0000\u0000\u0000"+
		"\u057a\u0579\u0001\u0000\u0000\u0000\u057b\u057d\u0001\u0000\u0000\u0000"+
		"\u057c\u0573\u0001\u0000\u0000\u0000\u057c\u0577\u0001\u0000\u0000\u0000"+
		"\u057d\u00cb\u0001\u0000\u0000\u0000\u057e\u0580\u0005s\u0000\u0000\u057f"+
		"\u0581\u0003\u00d6k\u0000\u0580\u057f\u0001\u0000\u0000\u0000\u0580\u0581"+
		"\u0001\u0000\u0000\u0000\u0581\u0589\u0001\u0000\u0000\u0000\u0582\u0583"+
		"\u0005L\u0000\u0000\u0583\u0585\u0005s\u0000\u0000\u0584\u0586\u0003\u00d6"+
		"k\u0000\u0585\u0584\u0001\u0000\u0000\u0000\u0585\u0586\u0001\u0000\u0000"+
		"\u0000\u0586\u0588\u0001\u0000\u0000\u0000\u0587\u0582\u0001\u0000\u0000"+
		"\u0000\u0588\u058b\u0001\u0000\u0000\u0000\u0589\u0587\u0001\u0000\u0000"+
		"\u0000\u0589\u058a\u0001\u0000\u0000\u0000\u058a\u058e\u0001\u0000\u0000"+
		"\u0000\u058b\u0589\u0001\u0000\u0000\u0000\u058c\u058e\u0003\u0012\t\u0000"+
		"\u058d\u057e\u0001\u0000\u0000\u0000\u058d\u058c\u0001\u0000\u0000\u0000"+
		"\u058e\u00cd\u0001\u0000\u0000\u0000\u058f\u0591\u0005s\u0000\u0000\u0590"+
		"\u0592\u0003\u00d8l\u0000\u0591\u0590\u0001\u0000\u0000\u0000\u0591\u0592"+
		"\u0001\u0000\u0000\u0000\u0592\u0593\u0001\u0000\u0000\u0000\u0593\u0594"+
		"\u0003\u00d2i\u0000\u0594\u00cf\u0001\u0000\u0000\u0000\u0595\u05b1\u0005"+
		"H\u0000\u0000\u0596\u059b\u0005I\u0000\u0000\u0597\u0598\u0005H\u0000"+
		"\u0000\u0598\u059a\u0005I\u0000\u0000\u0599\u0597\u0001\u0000\u0000\u0000"+
		"\u059a\u059d\u0001\u0000\u0000\u0000\u059b\u0599\u0001\u0000\u0000\u0000"+
		"\u059b\u059c\u0001\u0000\u0000\u0000\u059c\u059e\u0001\u0000\u0000\u0000"+
		"\u059d\u059b\u0001\u0000\u0000\u0000\u059e\u05b2\u0003f3\u0000\u059f\u05a0"+
		"\u0003\u00be_\u0000\u05a0\u05a7\u0005I\u0000\u0000\u05a1\u05a2\u0005H"+
		"\u0000\u0000\u05a2\u05a3\u0003\u00be_\u0000\u05a3\u05a4\u0005I\u0000\u0000"+
		"\u05a4\u05a6\u0001\u0000\u0000\u0000\u05a5\u05a1\u0001\u0000\u0000\u0000"+
		"\u05a6\u05a9\u0001\u0000\u0000\u0000\u05a7\u05a5\u0001\u0000\u0000\u0000"+
		"\u05a7\u05a8\u0001\u0000\u0000\u0000\u05a8\u05ae\u0001\u0000\u0000\u0000"+
		"\u05a9\u05a7\u0001\u0000\u0000\u0000\u05aa\u05ab\u0005H\u0000\u0000\u05ab"+
		"\u05ad\u0005I\u0000\u0000\u05ac\u05aa\u0001\u0000\u0000\u0000\u05ad\u05b0"+
		"\u0001\u0000\u0000\u0000\u05ae\u05ac\u0001\u0000\u0000\u0000\u05ae\u05af"+
		"\u0001\u0000\u0000\u0000\u05af\u05b2\u0001\u0000\u0000\u0000\u05b0\u05ae"+
		"\u0001\u0000\u0000\u0000\u05b1\u0596\u0001\u0000\u0000\u0000\u05b1\u059f"+
		"\u0001\u0000\u0000\u0000\u05b2\u00d1\u0001\u0000\u0000\u0000\u05b3\u05b5"+
		"\u0003\u00e6s\u0000\u05b4\u05b6\u0003<\u001e\u0000\u05b5\u05b4\u0001\u0000"+
		"\u0000\u0000\u05b5\u05b6\u0001\u0000\u0000\u0000\u05b6\u00d3\u0001\u0000"+
		"\u0000\u0000\u05b7\u05b8\u0003\u00dam\u0000\u05b8\u05b9\u0003\u00e4r\u0000"+
		"\u05b9\u00d5\u0001\u0000\u0000\u0000\u05ba\u05bb\u0005O\u0000\u0000\u05bb"+
		"\u05be\u0005N\u0000\u0000\u05bc\u05be\u0003\u00e0p\u0000\u05bd\u05ba\u0001"+
		"\u0000\u0000\u0000\u05bd\u05bc\u0001\u0000\u0000\u0000\u05be\u00d7\u0001"+
		"\u0000\u0000\u0000\u05bf\u05c0\u0005O\u0000\u0000\u05c0\u05c3\u0005N\u0000"+
		"\u0000\u05c1\u05c3\u0003\u00dam\u0000\u05c2\u05bf\u0001\u0000\u0000\u0000"+
		"\u05c2\u05c1\u0001\u0000\u0000\u0000\u05c3\u00d9\u0001\u0000\u0000\u0000"+
		"\u05c4\u05c5\u0005O\u0000\u0000\u05c5\u05c6\u0003\u00dcn\u0000\u05c6\u05c7"+
		"\u0005N\u0000\u0000\u05c7\u00db\u0001\u0000\u0000\u0000\u05c8\u05cd\u0003"+
		"\u00deo\u0000\u05c9\u05ca\u0005K\u0000\u0000\u05ca\u05cc\u0003\u00deo"+
		"\u0000\u05cb\u05c9\u0001\u0000\u0000\u0000\u05cc\u05cf\u0001\u0000\u0000"+
		"\u0000\u05cd\u05cb\u0001\u0000\u0000\u0000\u05cd\u05ce\u0001\u0000\u0000"+
		"\u0000\u05ce\u00dd\u0001\u0000\u0000\u0000\u05cf\u05cd\u0001\u0000\u0000"+
		"\u0000\u05d0\u05d2\u0003\u0080@\u0000\u05d1\u05d0\u0001\u0000\u0000\u0000"+
		"\u05d1\u05d2\u0001\u0000\u0000\u0000\u05d2\u05d6\u0001\u0000\u0000\u0000"+
		"\u05d3\u05d7\u0003h4\u0000\u05d4\u05d7\u0003\u0012\t\u0000\u05d5\u05d7"+
		"\u00056\u0000\u0000\u05d6\u05d3\u0001\u0000\u0000\u0000\u05d6\u05d4\u0001"+
		"\u0000\u0000\u0000\u05d6\u05d5\u0001\u0000\u0000\u0000\u05d7\u05dc\u0001"+
		"\u0000\u0000\u0000\u05d8\u05d9\u0005H\u0000\u0000\u05d9\u05db\u0005I\u0000"+
		"\u0000\u05da\u05d8\u0001\u0000\u0000\u0000\u05db\u05de\u0001\u0000\u0000"+
		"\u0000\u05dc\u05da\u0001\u0000\u0000\u0000\u05dc\u05dd\u0001\u0000\u0000"+
		"\u0000\u05dd\u00df\u0001\u0000\u0000\u0000\u05de\u05dc\u0001\u0000\u0000"+
		"\u0000\u05df\u05e0\u0005O\u0000\u0000\u05e0\u05e5\u0003j5\u0000\u05e1"+
		"\u05e2\u0005K\u0000\u0000\u05e2\u05e4\u0003j5\u0000\u05e3\u05e1\u0001"+
		"\u0000\u0000\u0000\u05e4\u05e7\u0001\u0000\u0000\u0000\u05e5\u05e3\u0001"+
		"\u0000\u0000\u0000\u05e5\u05e6\u0001\u0000\u0000\u0000\u05e6\u05e8\u0001"+
		"\u0000\u0000\u0000\u05e7\u05e5\u0001\u0000\u0000\u0000\u05e8\u05e9\u0005"+
		"N\u0000\u0000\u05e9\u00e1\u0001\u0000\u0000\u0000\u05ea\u05f1\u0003\u00e6"+
		"s\u0000\u05eb\u05ec\u0005L\u0000\u0000\u05ec\u05ee\u0005s\u0000\u0000"+
		"\u05ed\u05ef\u0003\u00e6s\u0000\u05ee\u05ed\u0001\u0000\u0000\u0000\u05ee"+
		"\u05ef\u0001\u0000\u0000\u0000\u05ef\u05f1\u0001\u0000\u0000\u0000\u05f0"+
		"\u05ea\u0001\u0000\u0000\u0000\u05f0\u05eb\u0001\u0000\u0000\u0000\u05f1"+
		"\u00e3\u0001\u0000\u0000\u0000\u05f2\u05f3\u0005.\u0000\u0000\u05f3\u05f7"+
		"\u0003\u00e2q\u0000\u05f4\u05f5\u0005s\u0000\u0000\u05f5\u05f7\u0003\u00e6"+
		"s\u0000\u05f6\u05f2\u0001\u0000\u0000\u0000\u05f6\u05f4\u0001\u0000\u0000"+
		"\u0000\u05f7\u00e5\u0001\u0000\u0000\u0000\u05f8\u05fa\u0005D\u0000\u0000"+
		"\u05f9\u05fb\u0003\u00bc^\u0000\u05fa\u05f9\u0001\u0000\u0000\u0000\u05fa"+
		"\u05fb\u0001\u0000\u0000\u0000\u05fb\u05fc\u0001\u0000\u0000\u0000\u05fc"+
		"\u05fd\u0005E\u0000\u0000\u05fd\u00e7\u0001\u0000\u0000\u0000\u00c3\u00ec"+
		"\u00ef\u00f4\u00fa\u0100\u0102\u0109\u010b\u0113\u0115\u011d\u011f\u0125"+
		"\u0127\u012f\u0131\u0134\u013c\u013f\u0146\u014f\u0155\u015b\u015e\u0163"+
		"\u0170\u0176\u017b\u017f\u0189\u018e\u0193\u0199\u01a1\u01aa\u01af\u01b6"+
		"\u01bd\u01c0\u01c7\u01d1\u01d5\u01da\u01de\u01e2\u01ec\u01f4\u01fa\u0201"+
		"\u0208\u020c\u020f\u0212\u021b\u0221\u0226\u0229\u022f\u0235\u0239\u0241"+
		"\u024a\u0252\u0258\u025c\u0267\u0270\u0275\u027b\u027f\u028b\u0296\u029b"+
		"\u02a4\u02ac\u02b6\u02bf\u02c7\u02cc\u02d4\u02d9\u02e3\u02ed\u02f3\u02f7"+
		"\u02ff\u0303\u0305\u030b\u0310\u0314\u031b\u031d\u0324\u0329\u0332\u0337"+
		"\u033a\u033f\u0348\u0355\u0360\u0363\u036a\u0374\u037c\u037f\u0382\u038f"+
		"\u0397\u039c\u03a4\u03a8\u03ac\u03b0\u03b2\u03b6\u03bc\u03c7\u03d1\u03d6"+
		"\u03df\u03e4\u03e7\u03ee\u03f7\u040e\u0411\u0414\u041c\u0420\u0428\u042e"+
		"\u0439\u0442\u0447\u0451\u0458\u0465\u046e\u0477\u047d\u0488\u048d\u0492"+
		"\u0497\u049b\u049f\u04a3\u04a5\u04a9\u04ae\u04bf\u04d4\u04d8\u04dd\u04e1"+
		"\u04f1\u0519\u051f\u052e\u0531\u0533\u053d\u0546\u054a\u054e\u0560\u0562"+
		"\u0567\u056c\u0571\u057a\u057c\u0580\u0585\u0589\u058d\u0591\u059b\u05a7"+
		"\u05ae\u05b1\u05b5\u05bd\u05c2\u05cd\u05d1\u05d6\u05dc\u05e5\u05ee\u05f0"+
		"\u05f6\u05fa";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}