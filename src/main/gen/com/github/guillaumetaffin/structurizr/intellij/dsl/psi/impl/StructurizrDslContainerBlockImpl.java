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

public class StructurizrDslContainerBlockImpl extends ASTWrapperPsiElement implements StructurizrDslContainerBlock {

  public StructurizrDslContainerBlockImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull StructurizrDslVisitor visitor) {
    visitor.visitContainerBlock(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof StructurizrDslVisitor) accept((StructurizrDslVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<StructurizrDslAdrsStatement> getAdrsStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, StructurizrDslAdrsStatement.class);
  }

  @Override
  @NotNull
  public StructurizrDslClosingBlock getClosingBlock() {
    return findNotNullChildByClass(StructurizrDslClosingBlock.class);
  }

  @Override
  @NotNull
  public List<StructurizrDslComponentStatement> getComponentStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, StructurizrDslComponentStatement.class);
  }

  @Override
  @NotNull
  public List<StructurizrDslDescriptionStatement> getDescriptionStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, StructurizrDslDescriptionStatement.class);
  }

  @Override
  @NotNull
  public List<StructurizrDslDocsStatement> getDocsStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, StructurizrDslDocsStatement.class);
  }

  @Override
  @NotNull
  public List<StructurizrDslGroupStatements> getGroupStatementsList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, StructurizrDslGroupStatements.class);
  }

  @Override
  @NotNull
  public StructurizrDslOpeningBlock getOpeningBlock() {
    return findNotNullChildByClass(StructurizrDslOpeningBlock.class);
  }

  @Override
  @NotNull
  public List<StructurizrDslPerspectivesStatement> getPerspectivesStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, StructurizrDslPerspectivesStatement.class);
  }

  @Override
  @NotNull
  public List<StructurizrDslPropertiesStatement> getPropertiesStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, StructurizrDslPropertiesStatement.class);
  }

  @Override
  @NotNull
  public List<StructurizrDslRelationStatement> getRelationStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, StructurizrDslRelationStatement.class);
  }

  @Override
  @NotNull
  public List<StructurizrDslTagsStatement> getTagsStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, StructurizrDslTagsStatement.class);
  }

  @Override
  @NotNull
  public List<StructurizrDslTechnologyStatement> getTechnologyStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, StructurizrDslTechnologyStatement.class);
  }

  @Override
  @NotNull
  public List<StructurizrDslUrlStatement> getUrlStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, StructurizrDslUrlStatement.class);
  }

}