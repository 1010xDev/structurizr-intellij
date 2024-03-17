package com.github.guillaumetaffin.structurizr.intellij.dsl.highlighting

import com.github.guillaumetaffin.intellij.matlab.language.highlighting.StructurizrDslSyntaxHighlighter
import com.intellij.openapi.fileTypes.SyntaxHighlighter
import com.intellij.openapi.fileTypes.SyntaxHighlighterFactory
import com.intellij.openapi.project.Project
import com.intellij.openapi.vfs.VirtualFile

class StructurizrDslSyntaxHighlighterFactory : SyntaxHighlighterFactory() {
    override fun getSyntaxHighlighter(project: Project?, virtualFile: VirtualFile?): SyntaxHighlighter =
        StructurizrDslSyntaxHighlighter()
}