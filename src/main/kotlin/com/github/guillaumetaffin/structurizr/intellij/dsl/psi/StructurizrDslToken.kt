package com.github.guillaumetaffin.structurizr.intellij.dsl.psi

import com.github.guillaumetaffin.structurizr.intellij.dsl.StructurizrDsl
import com.intellij.psi.tree.IElementType

sealed class StructurizrDslToken( private val display: String) : IElementType(display, StructurizrDsl) {
    override fun toString(): String {
        return display
    }
}

sealed class StructurizrKeyword( display: String) : StructurizrDslToken(display)
class Workspace : StructurizrKeyword("workspace")

sealed class StructurizrParens( display: String) : StructurizrDslToken(display)
class OpenParens : StructurizrParens("{")
class CloseParens : StructurizrParens("}")

class LineBreak : StructurizrDslToken("EOL(s)")

data object Tokens {
    @JvmField
    val WORKSPACE=  Workspace()
    @JvmField
    val OPEN_PARENS = OpenParens()
    @JvmField
    val CLOSE_PARENS = CloseParens()
    @JvmField
    val LINE_BREAK = LineBreak()
}