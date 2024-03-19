// This is a generated file. Not intended for manual editing.
package com.github.guillaumetaffin.structurizr.intellij.dsl.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface StructurizrDslDeploymentNodeBlock extends PsiElement {

  @NotNull
  StructurizrDslClosingBlock getClosingBlock();

  @NotNull
  List<StructurizrDslContainerInstanceStatement> getContainerInstanceStatementList();

  @NotNull
  List<StructurizrDslDeploymentNodeStatement> getDeploymentNodeStatementList();

  @NotNull
  List<StructurizrDslDescriptionStatement> getDescriptionStatementList();

  @NotNull
  List<StructurizrDslGroupStatements> getGroupStatementsList();

  @NotNull
  List<StructurizrDslInfrastructureNodeStatement> getInfrastructureNodeStatementList();

  @NotNull
  List<StructurizrDslInstancesStatement> getInstancesStatementList();

  @NotNull
  StructurizrDslOpeningBlock getOpeningBlock();

  @NotNull
  List<StructurizrDslPerspectivesStatement> getPerspectivesStatementList();

  @NotNull
  List<StructurizrDslPropertiesStatement> getPropertiesStatementList();

  @NotNull
  List<StructurizrDslRelationStatement> getRelationStatementList();

  @NotNull
  List<StructurizrDslSoftwareSystemInstanceStatement> getSoftwareSystemInstanceStatementList();

  @NotNull
  List<StructurizrDslTagsStatement> getTagsStatementList();

  @NotNull
  List<StructurizrDslTechnologyStatement> getTechnologyStatementList();

  @NotNull
  List<StructurizrDslUrlStatement> getUrlStatementList();

}
