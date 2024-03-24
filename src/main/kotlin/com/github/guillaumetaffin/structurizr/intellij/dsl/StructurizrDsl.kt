package com.github.guillaumetaffin.structurizr.intellij.dsl

import com.intellij.lang.Language

object StructurizrDsl : Language("StructurizrDsl") {
    private fun readResolve(): Any = StructurizrDsl
}