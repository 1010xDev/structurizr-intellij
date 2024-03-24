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

public class StructurizrDslCommonViewBlockImpl extends ASTWrapperPsiElement implements StructurizrDslCommonViewBlock {

  public StructurizrDslCommonViewBlockImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull StructurizrDslVisitor visitor) {
    visitor.visitCommonViewBlock(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof StructurizrDslVisitor) accept((StructurizrDslVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<StructurizrDslAnimationStatement> getAnimationStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, StructurizrDslAnimationStatement.class);
  }

  @Override
  @NotNull
  public List<StructurizrDslAutolayoutStatement> getAutolayoutStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, StructurizrDslAutolayoutStatement.class);
  }

  @Override
  @NotNull
  public StructurizrDslClosingBlock getClosingBlock() {
    return findNotNullChildByClass(StructurizrDslClosingBlock.class);
  }

  @Override
  @NotNull
  public List<StructurizrDslDefaultStatement> getDefaultStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, StructurizrDslDefaultStatement.class);
  }

  @Override
  @NotNull
  public List<StructurizrDslDescriptionStatement> getDescriptionStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, StructurizrDslDescriptionStatement.class);
  }

  @Override
  @NotNull
  public List<StructurizrDslExcludeStatement> getExcludeStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, StructurizrDslExcludeStatement.class);
  }

  @Override
  @NotNull
  public List<StructurizrDslIncludeStatement> getIncludeStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, StructurizrDslIncludeStatement.class);
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
  public List<StructurizrDslTitleStatement> getTitleStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, StructurizrDslTitleStatement.class);
  }

}
