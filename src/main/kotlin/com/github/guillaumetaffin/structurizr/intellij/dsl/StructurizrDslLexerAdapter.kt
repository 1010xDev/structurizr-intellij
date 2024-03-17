package com.github.guillaumetaffin.structurizr.intellij.dsl

import com.intellij.lexer.FlexAdapter
import java.io.Reader

class StructurizrDslLexerAdapter: FlexAdapter(StructurizrDslLexer(Reader.nullReader()))