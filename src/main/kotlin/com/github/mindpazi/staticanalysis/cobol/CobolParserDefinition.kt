package com.github.mindpazi.staticanalysis.cobol

import com.github.mindpazi.staticanalysis.cobol.parser.CobolParser
import com.github.mindpazi.staticanalysis.cobol.psi.CobolFile
import com.github.mindpazi.staticanalysis.cobol.psi.CobolTokenSets
import com.github.mindpazi.staticanalysis.cobol.psi.CobolTypes
import com.intellij.lang.ASTNode
import com.intellij.lang.ParserDefinition
import com.intellij.lang.PsiParser
import com.intellij.lexer.Lexer
import com.intellij.openapi.project.Project
import com.intellij.psi.FileViewProvider
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiFile
import com.intellij.psi.tree.IFileElementType
import com.intellij.psi.tree.TokenSet

class CobolParserDefinition : ParserDefinition {
    companion object {
        val FILE = IFileElementType(CobolLanguage)
    }

    override fun createLexer(project: Project): Lexer = CobolLexerAdapter()

    override fun getCommentTokens(): TokenSet = CobolTokenSets.COMMENTS

    override fun getStringLiteralElements(): TokenSet = CobolTokenSets.STRINGS

    override fun createParser(project: Project): PsiParser = CobolParser()

    override fun getFileNodeType(): IFileElementType = FILE

    override fun createFile(viewProvider: FileViewProvider): PsiFile = CobolFile(viewProvider)

    override fun createElement(node: ASTNode): PsiElement = CobolTypes.Factory.createElement(node)
}
