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
import static com.github.guillaumetaffin.structurizr.intellij.dsl.psi.Tokens.*;

public class StructurizrDslContainerInstanceStatementImpl extends ASTWrapperPsiElement implements StructurizrDslContainerInstanceStatement {

  public StructurizrDslContainerInstanceStatementImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull StructurizrDslVisitor visitor) {
    visitor.visitContainerInstanceStatement(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof StructurizrDslVisitor) accept((StructurizrDslVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public StructurizrDslContainerInstanceBlock getContainerInstanceBlock() {
    return findChildByClass(StructurizrDslContainerInstanceBlock.class);
  }

  @Override
  @NotNull
  public StructurizrDslId getId() {
    return findNotNullChildByClass(StructurizrDslId.class);
  }

  @Override
  @Nullable
  public StructurizrDslTag getTag() {
    return findChildByClass(StructurizrDslTag.class);
  }

  @Override
  @Nullable
  public PsiElement getQuotedText() {
    return findChildByType(QUOTED_TEXT);
  }

  @Override
  @Nullable
  public PsiElement getUnquotedText() {
    return findChildByType(UNQUOTED_TEXT);
  }

}
