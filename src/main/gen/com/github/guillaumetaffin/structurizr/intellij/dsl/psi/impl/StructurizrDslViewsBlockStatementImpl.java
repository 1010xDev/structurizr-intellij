// This is a generated file. Not intended for manual editing.
package com.github.guillaumetaffin.structurizr.intellij.dsl.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.github.guillaumetaffin.structurizr.intellij.dsl.psi.StructurizrDslTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.github.guillaumetaffin.structurizr.intellij.dsl.psi.*;

public class StructurizrDslViewsBlockStatementImpl extends ASTWrapperPsiElement implements StructurizrDslViewsBlockStatement {

  public StructurizrDslViewsBlockStatementImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull StructurizrDslVisitor visitor) {
    visitor.visitViewsBlockStatement(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof StructurizrDslVisitor) accept((StructurizrDslVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public StructurizrDslBrandingStatement getBrandingStatement() {
    return findChildByClass(StructurizrDslBrandingStatement.class);
  }

  @Override
  @Nullable
  public StructurizrDslComponentViewStatement getComponentViewStatement() {
    return findChildByClass(StructurizrDslComponentViewStatement.class);
  }

  @Override
  @Nullable
  public StructurizrDslContainerViewStatement getContainerViewStatement() {
    return findChildByClass(StructurizrDslContainerViewStatement.class);
  }

  @Override
  @Nullable
  public StructurizrDslCustomViewStatement getCustomViewStatement() {
    return findChildByClass(StructurizrDslCustomViewStatement.class);
  }

  @Override
  @Nullable
  public StructurizrDslDeploymentViewStatement getDeploymentViewStatement() {
    return findChildByClass(StructurizrDslDeploymentViewStatement.class);
  }

  @Override
  @Nullable
  public StructurizrDslDynamicViewStatement getDynamicViewStatement() {
    return findChildByClass(StructurizrDslDynamicViewStatement.class);
  }

  @Override
  @Nullable
  public StructurizrDslFilteredViewStatement getFilteredViewStatement() {
    return findChildByClass(StructurizrDslFilteredViewStatement.class);
  }

  @Override
  @Nullable
  public StructurizrDslImageViewStatement getImageViewStatement() {
    return findChildByClass(StructurizrDslImageViewStatement.class);
  }

  @Override
  @Nullable
  public StructurizrDslPropertiesStatement getPropertiesStatement() {
    return findChildByClass(StructurizrDslPropertiesStatement.class);
  }

  @Override
  @Nullable
  public StructurizrDslStylesStatement getStylesStatement() {
    return findChildByClass(StructurizrDslStylesStatement.class);
  }

  @Override
  @Nullable
  public StructurizrDslSystemContextViewStatement getSystemContextViewStatement() {
    return findChildByClass(StructurizrDslSystemContextViewStatement.class);
  }

  @Override
  @Nullable
  public StructurizrDslSystemLandscapeViewStatement getSystemLandscapeViewStatement() {
    return findChildByClass(StructurizrDslSystemLandscapeViewStatement.class);
  }

  @Override
  @Nullable
  public StructurizrDslTerminologyStatement getTerminologyStatement() {
    return findChildByClass(StructurizrDslTerminologyStatement.class);
  }

  @Override
  @Nullable
  public StructurizrDslThemeStatement getThemeStatement() {
    return findChildByClass(StructurizrDslThemeStatement.class);
  }

  @Override
  @Nullable
  public StructurizrDslThemesStatement getThemesStatement() {
    return findChildByClass(StructurizrDslThemesStatement.class);
  }

}
