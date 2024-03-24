// This is a generated file. Not intended for manual editing.
package com.github.guillaumetaffin.structurizr.intellij.dsl.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface StructurizrDslDeploymentEnvironmentBlock extends PsiElement {

  @NotNull
  StructurizrDslClosingBlock getClosingBlock();

  @NotNull
  List<StructurizrDslDeploymentGroupStatement> getDeploymentGroupStatementList();

  @NotNull
  List<StructurizrDslDeploymentNodeStatement> getDeploymentNodeStatementList();

  @NotNull
  List<StructurizrDslGroupStatements> getGroupStatementsList();

  @NotNull
  StructurizrDslOpeningBlock getOpeningBlock();

  @NotNull
  List<StructurizrDslRelationStatement> getRelationStatementList();

}
