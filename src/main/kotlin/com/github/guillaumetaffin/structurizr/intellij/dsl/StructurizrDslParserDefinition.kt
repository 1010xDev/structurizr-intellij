package com.github.guillaumetaffin.structurizr.intellij.dsl

import com.github.guillaumetaffin.structurizr.intellij.dsl.parser.StructurizrDslParser
import com.github.guillaumetaffin.structurizr.intellij.dsl.psi.StructurizrDslFile
import com.github.guillaumetaffin.structurizr.intellij.dsl.psi.StructurizrDslTokenSets
import com.github.guillaumetaffin.structurizr.intellij.dsl.psi.StructurizrDslTypes
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

class StructurizrDslParserDefinition : ParserDefinition {
    override fun createLexer(project: Project?): Lexer = StructurizrDslLexerAdapter()

    override fun createParser(project: Project?): PsiParser = StructurizrDslParser()

    override fun getFileNodeType(): IFileElementType = FILE

    override fun getCommentTokens(): TokenSet = StructurizrDslTokenSets.EMPTY

    override fun getStringLiteralElements(): TokenSet = StructurizrDslTokenSets.EMPTY

    override fun createElement(node: ASTNode?): PsiElement = StructurizrDslTypes.Factory.createElement(node)

    override fun createFile(viewProvider: FileViewProvider): PsiFile = StructurizrDslFile(viewProvider)
}

val FILE = IFileElementType(StructurizrDsl)