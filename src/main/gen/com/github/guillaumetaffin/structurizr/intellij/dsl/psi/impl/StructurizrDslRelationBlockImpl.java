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

public class StructurizrDslRelationBlockImpl extends ASTWrapperPsiElement implements StructurizrDslRelationBlock {

  public StructurizrDslRelationBlockImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull StructurizrDslVisitor visitor) {
    visitor.visitRelationBlock(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof StructurizrDslVisitor) accept((StructurizrDslVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public StructurizrDslClosingBlock getClosingBlock() {
    return findNotNullChildByClass(StructurizrDslClosingBlock.class);
  }

  @Override
  @NotNull
  public StructurizrDslOpeningBlock getOpeningBlock() {
    return findNotNullChildByClass(StructurizrDslOpeningBlock.class);
  }

  @Override
  @Nullable
  public StructurizrDslPerspectiveStatement getPerspectiveStatement() {
    return findChildByClass(StructurizrDslPerspectiveStatement.class);
  }

  @Override
  @Nullable
  public StructurizrDslPropertiesStatement getPropertiesStatement() {
    return findChildByClass(StructurizrDslPropertiesStatement.class);
  }

  @Override
  @Nullable
  public StructurizrDslTagsStatement getTagsStatement() {
    return findChildByClass(StructurizrDslTagsStatement.class);
  }

  @Override
  @Nullable
  public StructurizrDslUrlStatement getUrlStatement() {
    return findChildByClass(StructurizrDslUrlStatement.class);
  }

}
