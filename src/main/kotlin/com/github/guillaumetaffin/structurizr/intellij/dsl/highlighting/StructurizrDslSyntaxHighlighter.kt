package com.github.guillaumetaffin.intellij.matlab.language.highlighting

import com.github.guillaumetaffin.structurizr.intellij.dsl.StructurizrDslLexerAdapter
import com.github.guillaumetaffin.structurizr.intellij.dsl.psi.*
import com.intellij.lexer.Lexer
import com.intellij.openapi.editor.HighlighterColors
import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase
import com.intellij.psi.TokenType
import com.intellij.psi.tree.IElementType
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors as Colors

class StructurizrDslSyntaxHighlighter : SyntaxHighlighterBase() {

    override fun getHighlightingLexer(): Lexer = StructurizrDslLexerAdapter()

    override fun getTokenHighlights(tokenType: IElementType?): Array<TextAttributesKey> = when (tokenType) {
        is StructurizrDslToken -> when (tokenType) {
            is StructurizrKeyword -> AttributeKeys.KEYWORD
            is StructurizrParens -> AttributeKeys.PARENS
            is StructurizrOperator -> AttributeKeys.OPERATOR
            is StructurizrText -> AttributeKeys.STRING
            is LineBreak -> AttributeKeys.NO_HIGHLIGHTING
        }

        TokenType.BAD_CHARACTER -> AttributeKeys.BAD_CHARACTER
        else -> AttributeKeys.NO_HIGHLIGHTING
    }

}

object AttributeKeys {
    val KEYWORD = keys("KEYWORD", Colors.KEYWORD)
    val STRING = keys("STRING", Colors.STRING)
    val OPERATOR = keys("EQUAL", Colors.OPERATION_SIGN)
    val PARENS = keys("PARENS", Colors.PARENTHESES)
    val BAD_CHARACTER = keys("BAD CHARACTER", HighlighterColors.BAD_CHARACTER)
    val NO_HIGHLIGHTING = keys("NO HIGHLIGHTING", HighlighterColors.NO_HIGHLIGHTING)
}

fun keys(text: String, color: TextAttributesKey) = arrayOf(createTextAttributesKey(text, color))
