package com.github.guillaumetaffin.structurizr.intellij.dsl

import com.intellij.openapi.fileTypes.LanguageFileType
import javax.swing.Icon

object StructurizrDslFileType : LanguageFileType(StructurizrDsl) {
    override fun getName() = "Structurizr DSL File"

    override fun getDescription() = "Structurizr DSL File"

    override fun getDefaultExtension() = "dsl"

    override fun getIcon(): Icon = StructurizrIcons.FileIcon
}