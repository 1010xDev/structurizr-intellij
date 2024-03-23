// This is a generated file. Not intended for manual editing.
package com.github.guillaumetaffin.structurizr.intellij.dsl.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface StructurizrDslComponentBlock extends PsiElement {

  @NotNull
  List<StructurizrDslAdrsStatement> getAdrsStatementList();

  @NotNull
  StructurizrDslClosingBlock getClosingBlock();

  @NotNull
  List<StructurizrDslDescriptionStatement> getDescriptionStatementList();

  @NotNull
  List<StructurizrDslDocsStatement> getDocsStatementList();

  @NotNull
  List<StructurizrDslExtendStatement> getExtendStatementList();

  @NotNull
  StructurizrDslOpeningBlock getOpeningBlock();

  @NotNull
  List<StructurizrDslPerspectivesStatement> getPerspectivesStatementList();

  @NotNull
  List<StructurizrDslPropertiesStatement> getPropertiesStatementList();

  @NotNull
  List<StructurizrDslRelationStatement> getRelationStatementList();

  @NotNull
  List<StructurizrDslTagsStatement> getTagsStatementList();

  @NotNull
  List<StructurizrDslTechnologyStatement> getTechnologyStatementList();

  @NotNull
  List<StructurizrDslUrlStatement> getUrlStatementList();

}
