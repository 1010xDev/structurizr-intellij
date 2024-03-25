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

public class StructurizrDslRelationshipStyleBlockImpl extends ASTWrapperPsiElement implements StructurizrDslRelationshipStyleBlock {

  public StructurizrDslRelationshipStyleBlockImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull StructurizrDslVisitor visitor) {
    visitor.visitRelationshipStyleBlock(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof StructurizrDslVisitor) accept((StructurizrDslVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<StructurizrDslBorderStatement> getBorderStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, StructurizrDslBorderStatement.class);
  }

  @Override
  @NotNull
  public StructurizrDslClosingBlock getClosingBlock() {
    return findNotNullChildByClass(StructurizrDslClosingBlock.class);
  }

  @Override
  @NotNull
  public List<StructurizrDslColorStatement> getColorStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, StructurizrDslColorStatement.class);
  }

  @Override
  @NotNull
  public List<StructurizrDslDashedStatement> getDashedStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, StructurizrDslDashedStatement.class);
  }

  @Override
  @NotNull
  public List<StructurizrDslFontSizeStatement> getFontSizeStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, StructurizrDslFontSizeStatement.class);
  }

  @Override
  @NotNull
  public List<StructurizrDslOpacityStatement> getOpacityStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, StructurizrDslOpacityStatement.class);
  }

  @Override
  @NotNull
  public StructurizrDslOpeningBlock getOpeningBlock() {
    return findNotNullChildByClass(StructurizrDslOpeningBlock.class);
  }

  @Override
  @NotNull
  public List<StructurizrDslPositionStatement> getPositionStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, StructurizrDslPositionStatement.class);
  }

  @Override
  @NotNull
  public List<StructurizrDslPropertiesStatement> getPropertiesStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, StructurizrDslPropertiesStatement.class);
  }

  @Override
  @NotNull
  public List<StructurizrDslRoutingStatement> getRoutingStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, StructurizrDslRoutingStatement.class);
  }

  @Override
  @NotNull
  public List<StructurizrDslThicknessStatement> getThicknessStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, StructurizrDslThicknessStatement.class);
  }

  @Override
  @NotNull
  public List<StructurizrDslWidthStatement> getWidthStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, StructurizrDslWidthStatement.class);
  }

}
