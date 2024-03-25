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

public class StructurizrDslViewsBlockImpl extends ASTWrapperPsiElement implements StructurizrDslViewsBlock {

  public StructurizrDslViewsBlockImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull StructurizrDslVisitor visitor) {
    visitor.visitViewsBlock(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof StructurizrDslVisitor) accept((StructurizrDslVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<StructurizrDslBrandingStatement> getBrandingStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, StructurizrDslBrandingStatement.class);
  }

  @Override
  @NotNull
  public StructurizrDslClosingBlock getClosingBlock() {
    return findNotNullChildByClass(StructurizrDslClosingBlock.class);
  }

  @Override
  @NotNull
  public List<StructurizrDslComponentViewStatement> getComponentViewStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, StructurizrDslComponentViewStatement.class);
  }

  @Override
  @NotNull
  public List<StructurizrDslContainerViewStatement> getContainerViewStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, StructurizrDslContainerViewStatement.class);
  }

  @Override
  @NotNull
  public List<StructurizrDslCustomViewStatement> getCustomViewStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, StructurizrDslCustomViewStatement.class);
  }

  @Override
  @NotNull
  public List<StructurizrDslDeploymentViewStatement> getDeploymentViewStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, StructurizrDslDeploymentViewStatement.class);
  }

  @Override
  @NotNull
  public List<StructurizrDslDynamicViewStatement> getDynamicViewStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, StructurizrDslDynamicViewStatement.class);
  }

  @Override
  @NotNull
  public List<StructurizrDslFilteredViewStatement> getFilteredViewStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, StructurizrDslFilteredViewStatement.class);
  }

  @Override
  @NotNull
  public List<StructurizrDslImageViewStatement> getImageViewStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, StructurizrDslImageViewStatement.class);
  }

  @Override
  @NotNull
  public List<StructurizrDslInlineIncludeStatement> getInlineIncludeStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, StructurizrDslInlineIncludeStatement.class);
  }

  @Override
  @NotNull
  public StructurizrDslOpeningBlock getOpeningBlock() {
    return findNotNullChildByClass(StructurizrDslOpeningBlock.class);
  }

  @Override
  @NotNull
  public List<StructurizrDslPropertiesStatement> getPropertiesStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, StructurizrDslPropertiesStatement.class);
  }

  @Override
  @NotNull
  public List<StructurizrDslStylesStatement> getStylesStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, StructurizrDslStylesStatement.class);
  }

  @Override
  @NotNull
  public List<StructurizrDslSystemContextViewStatement> getSystemContextViewStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, StructurizrDslSystemContextViewStatement.class);
  }

  @Override
  @NotNull
  public List<StructurizrDslSystemLandscapeViewStatement> getSystemLandscapeViewStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, StructurizrDslSystemLandscapeViewStatement.class);
  }

  @Override
  @NotNull
  public List<StructurizrDslTerminologyStatement> getTerminologyStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, StructurizrDslTerminologyStatement.class);
  }

  @Override
  @NotNull
  public List<StructurizrDslThemeStatement> getThemeStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, StructurizrDslThemeStatement.class);
  }

  @Override
  @NotNull
  public List<StructurizrDslThemesStatement> getThemesStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, StructurizrDslThemesStatement.class);
  }

}
