package com.github.syrious.processingintellijplugin;

import com.github.syrious.processingintellijplugin.antlr.ProcessingLexer;
import com.github.syrious.processingintellijplugin.antlr.ProcessingParser;
import com.intellij.lexer.Lexer;
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighter;
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase;
import com.intellij.psi.tree.IElementType;
import org.antlr.intellij.adaptor.lexer.ANTLRLexerAdaptor;
import org.antlr.intellij.adaptor.lexer.PSIElementTypeFactory;
import org.antlr.intellij.adaptor.lexer.TokenIElementType;
import org.jetbrains.annotations.NotNull;

import static com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey;

public class PdeSyntaxHighlighter extends SyntaxHighlighterBase {
    private static final TextAttributesKey[] EMPTY_KEYS = new TextAttributesKey[0];
    public static final TextAttributesKey ID =
            createTextAttributesKey("SAMPLE_ID", DefaultLanguageHighlighterColors.IDENTIFIER);
    public static final TextAttributesKey KEYWORD =
            createTextAttributesKey("SAMPLE_KEYWORD", DefaultLanguageHighlighterColors.KEYWORD);
    public static final TextAttributesKey STRING =
            createTextAttributesKey("SAMPLE_STRING", DefaultLanguageHighlighterColors.STRING);
    public static final TextAttributesKey LINE_COMMENT =
            createTextAttributesKey("SAMPLE_LINE_COMMENT", DefaultLanguageHighlighterColors.LINE_COMMENT);
    public static final TextAttributesKey BLOCK_COMMENT =
            createTextAttributesKey("SAMPLE_BLOCK_COMMENT", DefaultLanguageHighlighterColors.BLOCK_COMMENT);

    static {
        PSIElementTypeFactory.defineLanguageIElementTypes(PdeLanguage.INSTANCE,
                                                          ProcessingParser.tokenNames,
                                                          ProcessingParser.ruleNames);
    }

    @NotNull
    @Override
    public Lexer getHighlightingLexer() {
        ProcessingLexer lexer = new ProcessingLexer(null);
        return new ANTLRLexerAdaptor(PdeLanguage.INSTANCE, lexer);
    }

    @NotNull
    @Override
    public TextAttributesKey[] getTokenHighlights(IElementType tokenType) {
        if ( !(tokenType instanceof TokenIElementType) ) return EMPTY_KEYS;
        TokenIElementType myType = (TokenIElementType)tokenType;
        int ttype = myType.getANTLRTokenType();
        TextAttributesKey attrKey;
        switch ( ttype ) {
            case ProcessingLexer.IDENTIFIER:
                attrKey = ID;
                break;
            case ProcessingLexer.VAR :
            case ProcessingLexer.WHILE :
            case ProcessingLexer.IF :
            case ProcessingLexer.ELSE :
            case ProcessingLexer.RETURN :
//            case ProcessingLexer.PRINT :
//            case ProcessingLexer.FUNC :
//            case ProcessingLexer.TYPEINT :
//            case ProcessingLexer.TYPEFLOAT :
//            case ProcessingLexer.TYPESTRING :
//            case ProcessingLexer.TYPEBOOLEAN :
//            case ProcessingLexer.TRUE :
//            case ProcessingLexer.FALSE :
                attrKey = KEYWORD;
                break;
//            case ProcessingLexer.STRING :
//                attrKey = STRING;
//                break;
            case ProcessingLexer.COMMENT :
                attrKey = LINE_COMMENT;
                break;
            case ProcessingLexer.LINE_COMMENT :
                attrKey = BLOCK_COMMENT;
                break;
            default :
                return EMPTY_KEYS;
        }
        return new TextAttributesKey[] {attrKey};
    }
}
