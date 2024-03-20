// This is a generated file. Not intended for manual editing.
package com.github.guillaumetaffin.structurizr.intellij.dsl.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface StructurizrDslGroupStatements extends PsiElement {

  @NotNull
  StructurizrDslClosingBlock getClosingBlock();

  @NotNull
  StructurizrDslOpeningBlock getOpeningBlock();

  @Nullable
  PsiElement getColor();

  @Nullable
  PsiElement getQuotedText();

  @Nullable
  PsiElement getUnquotedText();

}
