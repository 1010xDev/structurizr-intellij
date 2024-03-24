// This is a generated file. Not intended for manual editing.
package com.github.guillaumetaffin.structurizr.intellij.dsl.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface StructurizrDslRelationshipStyleBlock extends PsiElement {

  @NotNull
  List<StructurizrDslBorderStatement> getBorderStatementList();

  @NotNull
  StructurizrDslClosingBlock getClosingBlock();

  @NotNull
  List<StructurizrDslColorStatement> getColorStatementList();

  @NotNull
  List<StructurizrDslFontSizeStatement> getFontSizeStatementList();

  @NotNull
  List<StructurizrDslOpacityStatement> getOpacityStatementList();

  @NotNull
  StructurizrDslOpeningBlock getOpeningBlock();

  @NotNull
  List<StructurizrDslPositionStatement> getPositionStatementList();

  @NotNull
  List<StructurizrDslPropertiesStatement> getPropertiesStatementList();

  @NotNull
  List<StructurizrDslRoutingStatement> getRoutingStatementList();

  @NotNull
  List<StructurizrDslThicknessStatement> getThicknessStatementList();

  @NotNull
  List<StructurizrDslWidthStatement> getWidthStatementList();

}
