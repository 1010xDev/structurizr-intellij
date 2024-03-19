// This is a generated file. Not intended for manual editing.
package com.github.guillaumetaffin.structurizr.intellij.dsl.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface StructurizrDslFilteredViewStatement extends PsiElement {

  @Nullable
  StructurizrDslADescription getADescription();

  @Nullable
  StructurizrDslFilteredViewBlock getFilteredViewBlock();

  @NotNull
  StructurizrDslTag getTag();

  @NotNull
  List<StructurizrDslViewKey> getViewKeyList();

}
