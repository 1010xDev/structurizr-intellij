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

public class StructurizrDslElementStyleImpl extends ASTWrapperPsiElement implements StructurizrDslElementStyle {

  public StructurizrDslElementStyleImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull StructurizrDslVisitor visitor) {
    visitor.visitElementStyle(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof StructurizrDslVisitor) accept((StructurizrDslVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<StructurizrDslBackgroundStatement> getBackgroundStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, StructurizrDslBackgroundStatement.class);
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
  public List<StructurizrDslFontSizeStatement> getFontSizeStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, StructurizrDslFontSizeStatement.class);
  }

  @Override
  @NotNull
  public List<StructurizrDslHeightStatement> getHeightStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, StructurizrDslHeightStatement.class);
  }

  @Override
  @NotNull
  public List<StructurizrDslIconStatement> getIconStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, StructurizrDslIconStatement.class);
  }

  @Override
  @NotNull
  public List<StructurizrDslMetadataStatement> getMetadataStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, StructurizrDslMetadataStatement.class);
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
  public List<StructurizrDslPropertiesStatement> getPropertiesStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, StructurizrDslPropertiesStatement.class);
  }

  @Override
  @NotNull
  public List<StructurizrDslShapeStatement> getShapeStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, StructurizrDslShapeStatement.class);
  }

  @Override
  @NotNull
  public List<StructurizrDslStrokeStatement> getStrokeStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, StructurizrDslStrokeStatement.class);
  }

  @Override
  @NotNull
  public List<StructurizrDslStrokeWidthStatement> getStrokeWidthStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, StructurizrDslStrokeWidthStatement.class);
  }

  @Override
  @NotNull
  public StructurizrDslTag getTag() {
    return findNotNullChildByClass(StructurizrDslTag.class);
  }

  @Override
  @NotNull
  public List<StructurizrDslWidthStatement> getWidthStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, StructurizrDslWidthStatement.class);
  }

}
