package com.github.guillaumetaffin.structurizr.intellij.dsl.psi

import com.github.guillaumetaffin.structurizr.intellij.dsl.StructurizrDsl
import com.github.guillaumetaffin.structurizr.intellij.dsl.StructurizrDslFileType
import com.intellij.extapi.psi.PsiFileBase
import com.intellij.openapi.fileTypes.FileType
import com.intellij.psi.FileViewProvider

class StructurizrDslFile(viewProvider: FileViewProvider): PsiFileBase(viewProvider, StructurizrDsl) {
    override fun getFileType(): FileType = StructurizrDslFileType

    override fun toString(): String = "Structurizr DSL File"
}