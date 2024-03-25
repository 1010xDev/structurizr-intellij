// This is a generated file. Not intended for manual editing.
package com.github.guillaumetaffin.structurizr.intellij.dsl.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface StructurizrDslWorkspaceStatement extends PsiElement {

  @NotNull
  List<StructurizrDslAdrsStatement> getAdrsStatementList();

  @NotNull
  StructurizrDslClosingBlock getClosingBlock();

  @NotNull
  List<StructurizrDslConfigurationStatement> getConfigurationStatementList();

  @NotNull
  List<StructurizrDslDescriptionStatement> getDescriptionStatementList();

  @NotNull
  List<StructurizrDslDocsStatement> getDocsStatementList();

  @NotNull
  List<StructurizrDslIdentifiersStatement> getIdentifiersStatementList();

  @NotNull
  List<StructurizrDslImpliedRelationshipsStatement> getImpliedRelationshipsStatementList();

  @NotNull
  List<StructurizrDslModelStatement> getModelStatementList();

  @NotNull
  List<StructurizrDslNameStatement> getNameStatementList();

  @NotNull
  StructurizrDslOpeningBlock getOpeningBlock();

  @NotNull
  List<StructurizrDslPropertiesStatement> getPropertiesStatementList();

  @NotNull
  List<StructurizrDslViewsStatement> getViewsStatementList();

  @NotNull
  StructurizrDslWorkspaceDefinition getWorkspaceDefinition();

}
