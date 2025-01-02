package com.github.mindpazi.staticanalysis.cobol

import com.github.mindpazi.staticanalysis.cobol.psi.CobolTypes
import com.intellij.lexer.Lexer
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors
import com.intellij.openapi.editor.HighlighterColors
import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase
import com.intellij.psi.TokenType
import com.intellij.psi.tree.IElementType

class CobolSyntaxHighlighter : SyntaxHighlighterBase() {
    companion object {
        val KEYWORD: TextAttributesKey = createTextAttributesKey("COBOL_KEYWORD", DefaultLanguageHighlighterColors.KEYWORD)
        val IDENTIFIER: TextAttributesKey = createTextAttributesKey("COBOL_IDENTIFIER", DefaultLanguageHighlighterColors.IDENTIFIER)
        val STRING: TextAttributesKey = createTextAttributesKey("COBOL_STRING", DefaultLanguageHighlighterColors.STRING)
        val NUMBER: TextAttributesKey = createTextAttributesKey("COBOL_NUMBER", DefaultLanguageHighlighterColors.NUMBER)
        val COMMENT: TextAttributesKey = createTextAttributesKey("COBOL_COMMENT", DefaultLanguageHighlighterColors.LINE_COMMENT)
        val DOT: TextAttributesKey = createTextAttributesKey("COBOL_DOT", DefaultLanguageHighlighterColors.DOT)
        val PARENTHESES: TextAttributesKey = createTextAttributesKey("COBOL_PARENTHESES", DefaultLanguageHighlighterColors.PARENTHESES)
        val OPERATOR: TextAttributesKey = createTextAttributesKey("COBOL_OPERATOR", DefaultLanguageHighlighterColors.OPERATION_SIGN)
        val BAD_CHARACTER: TextAttributesKey = createTextAttributesKey("COBOL_BAD_CHARACTER", HighlighterColors.BAD_CHARACTER)
        val LINE_NUMBER: TextAttributesKey = createTextAttributesKey("COBOL_LINE_NUMBER", DefaultLanguageHighlighterColors.LINE_COMMENT)
        val PICTURE_STRING: TextAttributesKey = createTextAttributesKey("COBOL_PICTURE_STRING", DefaultLanguageHighlighterColors.METADATA)

        private val KEYWORD_KEYS = arrayOf(KEYWORD)
        private val IDENTIFIER_KEYS = arrayOf(IDENTIFIER)
        private val STRING_KEYS = arrayOf(STRING)
        private val NUMBER_KEYS = arrayOf(NUMBER)
        private val COMMENT_KEYS = arrayOf(COMMENT)
        private val DOT_KEYS = arrayOf(DOT)
        private val PARENTHESES_KEYS = arrayOf(PARENTHESES)
        private val OPERATOR_KEYS = arrayOf(OPERATOR)
        private val BAD_CHAR_KEYS = arrayOf(BAD_CHARACTER)
        private val LINE_NUMBER_KEYS = arrayOf(LINE_NUMBER)
        private val PICTURE_STRING_KEYS = arrayOf(PICTURE_STRING)
        private val EMPTY_KEYS = emptyArray<TextAttributesKey>()
    }

    override fun getHighlightingLexer(): Lexer = CobolLexerAdapter()

    override fun getTokenHighlights(tokenType: IElementType): Array<TextAttributesKey> {
        return when (tokenType) {
            // Keywords
            CobolTypes.IDENTIFICATION,
            CobolTypes.DIVISION,
            CobolTypes.PROGRAM_ID,
            CobolTypes.DATA,
            CobolTypes.WORKING_STORAGE,
            CobolTypes.SECTION,
            CobolTypes.PROCEDURE,
            CobolTypes.PIC,
            CobolTypes.VALUE,
            CobolTypes.PERFORM,
            CobolTypes.VARYING,
            CobolTypes.FROM,
            CobolTypes.BY,
            CobolTypes.UNTIL,
            CobolTypes.STOP,
            CobolTypes.RUN,
            CobolTypes.DISPLAY -> KEYWORD_KEYS

            // Identifier
            CobolTypes.IDENTIFIER -> IDENTIFIER_KEYS

            // String
            CobolTypes.STRING -> STRING_KEYS

            // Numbers
            CobolTypes.INTEGER -> NUMBER_KEYS

            // Comment
            CobolTypes.COMMENT -> COMMENT_KEYS

            // Punctuation
            CobolTypes.DOT -> DOT_KEYS
            CobolTypes.LPAREN, CobolTypes.RPAREN -> PARENTHESES_KEYS
            CobolTypes.EQUALS -> OPERATOR_KEYS

            // Picture string
            CobolTypes.PICTURE_STRING -> PICTURE_STRING_KEYS

            // Bad character
            TokenType.BAD_CHARACTER -> BAD_CHAR_KEYS

            else -> EMPTY_KEYS
        }
    }
}
