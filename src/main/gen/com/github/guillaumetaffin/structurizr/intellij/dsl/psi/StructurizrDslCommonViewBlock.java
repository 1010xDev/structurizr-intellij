// This is a generated file. Not intended for manual editing.
package com.github.guillaumetaffin.structurizr.intellij.dsl.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface StructurizrDslCommonViewBlock extends PsiElement {

  @NotNull
  List<StructurizrDslAnimationStatement> getAnimationStatementList();

  @NotNull
  List<StructurizrDslAutolayoutStatement> getAutolayoutStatementList();

  @NotNull
  StructurizrDslClosingBlock getClosingBlock();

  @NotNull
  List<StructurizrDslDefaultStatement> getDefaultStatementList();

  @NotNull
  List<StructurizrDslDescriptionStatement> getDescriptionStatementList();

  @NotNull
  List<StructurizrDslExcludeStatement> getExcludeStatementList();

  @NotNull
  List<StructurizrDslIncludeStatement> getIncludeStatementList();

  @NotNull
  StructurizrDslOpeningBlock getOpeningBlock();

  @NotNull
  List<StructurizrDslPropertiesStatement> getPropertiesStatementList();

  @NotNull
  List<StructurizrDslTitleStatement> getTitleStatementList();

}
