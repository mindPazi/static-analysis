package com.github.mindpazi.staticanalysis.cobol

import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.openapi.fileTypes.SyntaxHighlighter
import com.intellij.openapi.options.colors.AttributesDescriptor
import com.intellij.openapi.options.colors.ColorDescriptor
import com.intellij.openapi.options.colors.ColorSettingsPage
import javax.swing.Icon

class CobolColorSettingsPage : ColorSettingsPage {
    companion object {
        private val DESCRIPTORS = arrayOf(
            AttributesDescriptor("Keyword", CobolSyntaxHighlighter.KEYWORD),
            AttributesDescriptor("Identifier", CobolSyntaxHighlighter.IDENTIFIER),
            AttributesDescriptor("String", CobolSyntaxHighlighter.STRING),
            AttributesDescriptor("Number", CobolSyntaxHighlighter.NUMBER),
            AttributesDescriptor("Comment", CobolSyntaxHighlighter.COMMENT),
            AttributesDescriptor("Dot", CobolSyntaxHighlighter.DOT),
            AttributesDescriptor("Parentheses", CobolSyntaxHighlighter.PARENTHESES),
            AttributesDescriptor("Operator", CobolSyntaxHighlighter.OPERATOR),
            AttributesDescriptor("Line Number", CobolSyntaxHighlighter.LINE_NUMBER),
            AttributesDescriptor("Picture String", CobolSyntaxHighlighter.PICTURE_STRING),
            AttributesDescriptor("Bad Character", CobolSyntaxHighlighter.BAD_CHARACTER)
        )
    }

    override fun getIcon(): Icon = CobolIcons.FILE

    override fun getHighlighter(): SyntaxHighlighter = CobolSyntaxHighlighter()

    override fun getDemoText(): String = """
        01 IDENTIFICATION DIVISION.
        02 PROGRAM-ID. HELLO.
        03 DATA DIVISION.
        04 WORKING-STORAGE SECTION.
        05 01 WS-A PIC 9(2) VALUE 0.
        06 PROCEDURE DIVISION.
        07 A-PARA.
        08 PERFORM B-PARA VARYING WS-A FROM 2 BY 2 UNTIL WS-A=12
        09 STOP RUN.
        10 B-PARA.
        11 DISPLAY 'B-PARA ' WS-A.
        12 DISPLAY 'B-PARA'.
    """.trimIndent()

    override fun getAdditionalHighlightingTagToDescriptorMap(): Map<String, TextAttributesKey>? = null

    override fun getAttributeDescriptors(): Array<AttributesDescriptor> = DESCRIPTORS

    override fun getColorDescriptors(): Array<ColorDescriptor> = ColorDescriptor.EMPTY_ARRAY

    override fun getDisplayName(): String = "COBOL"
}
