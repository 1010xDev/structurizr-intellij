// This is a generated file. Not intended for manual editing.
package com.github.guillaumetaffin.structurizr.intellij.dsl.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface StructurizrDslViewsBlock extends PsiElement {

  @NotNull
  List<StructurizrDslBrandingStatement> getBrandingStatementList();

  @NotNull
  StructurizrDslClosingBlock getClosingBlock();

  @NotNull
  List<StructurizrDslComponentViewStatement> getComponentViewStatementList();

  @NotNull
  List<StructurizrDslContainerViewStatement> getContainerViewStatementList();

  @NotNull
  List<StructurizrDslCustomViewStatement> getCustomViewStatementList();

  @NotNull
  List<StructurizrDslDeploymentViewStatement> getDeploymentViewStatementList();

  @NotNull
  List<StructurizrDslDynamicViewStatement> getDynamicViewStatementList();

  @NotNull
  List<StructurizrDslFilteredViewStatement> getFilteredViewStatementList();

  @NotNull
  List<StructurizrDslImageViewStatement> getImageViewStatementList();

  @NotNull
  List<StructurizrDslInlineIncludeStatement> getInlineIncludeStatementList();

  @NotNull
  StructurizrDslOpeningBlock getOpeningBlock();

  @NotNull
  List<StructurizrDslPropertiesStatement> getPropertiesStatementList();

  @NotNull
  List<StructurizrDslStylesStatement> getStylesStatementList();

  @NotNull
  List<StructurizrDslSystemContextViewStatement> getSystemContextViewStatementList();

  @NotNull
  List<StructurizrDslSystemLandscapeViewStatement> getSystemLandscapeViewStatementList();

  @NotNull
  List<StructurizrDslTerminologyStatement> getTerminologyStatementList();

  @NotNull
  List<StructurizrDslThemeStatement> getThemeStatementList();

  @NotNull
  List<StructurizrDslThemesStatement> getThemesStatementList();

}
