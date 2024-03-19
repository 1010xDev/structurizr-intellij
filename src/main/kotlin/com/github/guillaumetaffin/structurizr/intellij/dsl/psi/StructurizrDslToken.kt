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
class Name : StructurizrKeyword("name")
class Description : StructurizrKeyword("description")
class Properties : StructurizrKeyword("properties")
class Identifiers : StructurizrKeyword("!identifiers")
class Hierarchical : StructurizrKeyword("hierarchical")
class Flat : StructurizrKeyword("flat")
class Docs : StructurizrKeyword("!docs")
class Adrs : StructurizrKeyword("!adrs")
class Views : StructurizrKeyword("views")
class Configuration : StructurizrKeyword("configuration")
class Tags : StructurizrKeyword("tags")
class Url : StructurizrKeyword("url")
class Perspectives : StructurizrKeyword("perspectives")
class RelationArrow : StructurizrKeyword("->")
class This : StructurizrKeyword("this")
class Technology : StructurizrKeyword("technology")
class Element : StructurizrKeyword("element")
class DeploymentEnvironment : StructurizrKeyword("deploymentEnvironment")
class DeploymentGroup : StructurizrKeyword("deploymentGroup")
class DeploymentNode : StructurizrKeyword("deploymentNode")
class Instances : StructurizrKeyword("instances")
class InfrastructureNode : StructurizrKeyword("infrastructureNode")
class SoftwareSystemInstance : StructurizrKeyword("softwareSystemInstance")
class HealthCheck : StructurizrKeyword("healthCheck")
class ContainerInstance : StructurizrKeyword("containerInstance")
class SystemLandscape : StructurizrKeyword("systemLandscape")
class Include : StructurizrKeyword("include")
class Exclude : StructurizrKeyword("exclude")
class Autolayout : StructurizrKeyword("autolayout")
class Bt : StructurizrKeyword("bt")
class Tb : StructurizrKeyword("tb")
class Rl : StructurizrKeyword("rl")
class Lr : StructurizrKeyword("lr")
class Default : StructurizrKeyword("default")
class Star : StructurizrKeyword("*")
class Animation : StructurizrKeyword("animation")
class Title : StructurizrKeyword("title")
class SystemContext : StructurizrKeyword("systemContext")
class Filtered : StructurizrKeyword("filtered")
class Dynamic : StructurizrKeyword("dynamic")
class Deployment : StructurizrKeyword("deployment")
class Custom : StructurizrKeyword("custom")
class Image : StructurizrKeyword("image")
class PlantUml : StructurizrKeyword("plantuml")
class Mermaid : StructurizrKeyword("mermaid")
class Kroki : StructurizrKeyword("kroki")

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
    val NAME = Name()

    @JvmField
    val DESCRIPTION = Description()

    @JvmField
    val PROPERTIES = Properties()

    @JvmField
    val IDENTIFIERS = Identifiers()

    @JvmField
    val HIERARCHICAL = Hierarchical()

    @JvmField
    val FLAT = Flat()

    @JvmField
    val DOCS = Docs()

    @JvmField
    val ADRS = Adrs()

    @JvmField
    val VIEWS = Views()

    @JvmField
    val CONFIGURATION = Configuration()

    @JvmField
    val TAGS = Tags()

    @JvmField
    val URL = Url()

    @JvmField
    val PERSPECTIVES = Perspectives()

    @JvmField
    val RELATION_ARROW = RelationArrow()

    @JvmField
    val THIS = This()

    @JvmField
    val TECHNOLOGY = Technology()

    @JvmField
    val ELEMENT = Element()

    @JvmField
    val DEPLOYMENT_ENVIRONMENT = DeploymentEnvironment()

    @JvmField
    val DEPLOYMENT_GROUP = DeploymentGroup()

    @JvmField
    val DEPLOYMENT_NODE = DeploymentNode()

    @JvmField
    val INSTANCES = Instances()

    @JvmField
    val INFRASTRUCTURE_NODE = InfrastructureNode()

    @JvmField
    val SOFTWARE_SYSTEM_INSTANCE = SoftwareSystemInstance()

    @JvmField
    val HEALTH_CHECK = HealthCheck()

    @JvmField
    val CONTAINER_INSTANCE = ContainerInstance()

    @JvmField
    val SYSTEM_LANDSCAPE = SystemLandscape()

    @JvmField
    val INCLUDE = Include()

    @JvmField
    val EXCLUDE = Exclude()

    @JvmField
    val AUTOLAYOUT = Autolayout()

    @JvmField
    val BT = Bt()

    @JvmField
    val TB = Tb()

    @JvmField
    val LR = Lr()

    @JvmField
    val RL = Rl()

    @JvmField
    val DEFAULT = Default()

    @JvmField
    val STAR = Star()

    @JvmField
    val ANIMATION = Animation()

    @JvmField
    val TITLE = Title()

    @JvmField
    val SYSTEM_CONTEXT = SystemContext()

    @JvmField
    val FILTERED = Filtered()

    @JvmField
    val DYNAMIC = Dynamic()

    @JvmField
    val DEPLOYMENT = Deployment()

    @JvmField
    val CUSTOM = Custom()

    @JvmField
    val IMAGE = Image()

    @JvmField
    val PLANTUML = PlantUml()

    @JvmField
    val MERMAID = Mermaid()

    @JvmField
    val KROKI = Kroki()

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