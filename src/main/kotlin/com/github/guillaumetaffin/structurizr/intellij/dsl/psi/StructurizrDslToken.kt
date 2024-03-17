package com.github.guillaumetaffin.structurizr.intellij.dsl.psi

import com.github.guillaumetaffin.structurizr.intellij.dsl.StructurizrDsl
import com.intellij.psi.tree.IElementType

sealed class StructurizrDslToken(private val display: String) : IElementType(display, StructurizrDsl) {
    override fun toString(): String {
        return display
    }
}

sealed class StructurizrKeyword(display: String) : StructurizrDslToken(display)
class Extends : StructurizrKeyword("extends")
class Workspace : StructurizrKeyword("workspace")
class Model : StructurizrKeyword("model")
class Person : StructurizrKeyword("person")
class SoftwareSystem : StructurizrKeyword("softwareSystem")
class Container : StructurizrKeyword("container")
class Component : StructurizrKeyword("component")
class Group : StructurizrKeyword("group")

sealed class StructurizrParens(display: String) : StructurizrDslToken(display)
class OpenParens : StructurizrParens("{")
class CloseParens : StructurizrParens("}")

sealed class StructurizrOperator(display: String) : StructurizrDslToken(display)
class Equal : StructurizrOperator("=")

sealed class StructurizrText(display: String) : StructurizrDslToken(display)
class UnquotedText : StructurizrText("text")
class QuotedText : StructurizrText("\"text\"")

class LineBreak : StructurizrDslToken("EOL(s)")

data object Tokens {
    @JvmField
    val EXTENDS = Extends()

    @JvmField
    val WORKSPACE = Workspace()

    @JvmField
    val MODEL = Model()

    @JvmField
    val PERSON = Person()

    @JvmField
    val SOFTWARE_SYSTEM = SoftwareSystem()

    @JvmField
    val CONTAINER = Container()

    @JvmField
    val COMPONENT = Component()

    @JvmField
    val GROUP = Group()

    @JvmField
    val EQ = Equal()

    @JvmField
    val OPEN_PARENS = OpenParens()

    @JvmField
    val CLOSE_PARENS = CloseParens()

    @JvmField
    val LINE_BREAK = LineBreak()

    @JvmField
    val UNQUOTED_TEXT = UnquotedText()

    @JvmField
    val QUOTED_TEXT = QuotedText()
}