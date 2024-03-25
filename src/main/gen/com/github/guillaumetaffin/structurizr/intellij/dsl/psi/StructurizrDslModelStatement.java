// This is a generated file. Not intended for manual editing.
package com.github.guillaumetaffin.structurizr.intellij.dsl.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface StructurizrDslModelStatement extends PsiElement {

  @NotNull
  StructurizrDslClosingBlock getClosingBlock();

  @NotNull
  List<StructurizrDslDeploymentEnvironmentStatement> getDeploymentEnvironmentStatementList();

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
  List<StructurizrDslSoftwareSystemStatement> getSoftwareSystemStatementList();

}
