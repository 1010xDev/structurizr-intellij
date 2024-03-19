// This is a generated file. Not intended for manual editing.
package com.github.guillaumetaffin.structurizr.intellij.dsl.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface StructurizrDslElementStatement extends PsiElement {

  @Nullable
  StructurizrDslADescription getADescription();

  @NotNull
  StructurizrDslAName getAName();

  @Nullable
  StructurizrDslElementBlock getElementBlock();

  @Nullable
  StructurizrDslTag getTag();

  @Nullable
  PsiElement getQuotedText();

  @Nullable
  PsiElement getUnquotedText();

}