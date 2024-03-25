// This is a generated file. Not intended for manual editing.
package com.github.guillaumetaffin.structurizr.intellij.dsl.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface StructurizrDslExtendBlock extends PsiElement {

  @NotNull
  List<StructurizrDslAdrsStatement> getAdrsStatementList();

  @NotNull
  StructurizrDslClosingBlock getClosingBlock();

  @NotNull
  List<StructurizrDslComponentStatement> getComponentStatementList();

  @NotNull
  List<StructurizrDslContainerStatement> getContainerStatementList();

  @NotNull
  List<StructurizrDslDeploymentEnvironmentStatement> getDeploymentEnvironmentStatementList();

  @NotNull
  List<StructurizrDslDescriptionStatement> getDescriptionStatementList();

  @NotNull
  List<StructurizrDslDocsStatement> getDocsStatementList();

  @NotNull
  List<StructurizrDslElementStatement> getElementStatementList();

  @NotNull
  List<StructurizrDslExtendStatement> getExtendStatementList();

  @NotNull
  List<StructurizrDslGroupStatements> getGroupStatementsList();

  @NotNull
  List<StructurizrDslIdentifiersStatement> getIdentifiersStatementList();

  @NotNull
  List<StructurizrDslInlineIncludeStatement> getInlineIncludeStatementList();

  @NotNull
  StructurizrDslOpeningBlock getOpeningBlock();

  @NotNull
  List<StructurizrDslPersonStatement> getPersonStatementList();

  @NotNull
  List<StructurizrDslPerspectivesStatement> getPerspectivesStatementList();

  @NotNull
  List<StructurizrDslPropertiesStatement> getPropertiesStatementList();

  @NotNull
  List<StructurizrDslRelationStatement> getRelationStatementList();

  @NotNull
  List<StructurizrDslSoftwareSystemStatement> getSoftwareSystemStatementList();

  @NotNull
  List<StructurizrDslTagsStatement> getTagsStatementList();

  @NotNull
  List<StructurizrDslTechnologyStatement> getTechnologyStatementList();

  @NotNull
  List<StructurizrDslUrlStatement> getUrlStatementList();

}
