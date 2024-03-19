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

public class StructurizrDslRelationStatementImpl extends ASTWrapperPsiElement implements StructurizrDslRelationStatement {

  public StructurizrDslRelationStatementImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull StructurizrDslVisitor visitor) {
    visitor.visitRelationStatement(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof StructurizrDslVisitor) accept((StructurizrDslVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public StructurizrDslLhsRelationStatement getLhsRelationStatement() {
    return findNotNullChildByClass(StructurizrDslLhsRelationStatement.class);
  }

  @Override
  @Nullable
  public StructurizrDslRelationBlock getRelationBlock() {
    return findChildByClass(StructurizrDslRelationBlock.class);
  }

  @Override
  @NotNull
  public StructurizrDslRhsRelationStatement getRhsRelationStatement() {
    return findNotNullChildByClass(StructurizrDslRhsRelationStatement.class);
  }

}
