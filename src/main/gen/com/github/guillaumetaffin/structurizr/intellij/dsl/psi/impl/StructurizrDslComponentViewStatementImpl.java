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

public class StructurizrDslComponentViewStatementImpl extends ASTWrapperPsiElement implements StructurizrDslComponentViewStatement {

  public StructurizrDslComponentViewStatementImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull StructurizrDslVisitor visitor) {
    visitor.visitComponentViewStatement(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof StructurizrDslVisitor) accept((StructurizrDslVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public StructurizrDslADescription getADescription() {
    return findChildByClass(StructurizrDslADescription.class);
  }

  @Override
  @Nullable
  public StructurizrDslCommonViewBlock getCommonViewBlock() {
    return findChildByClass(StructurizrDslCommonViewBlock.class);
  }

  @Override
  @NotNull
  public StructurizrDslId getId() {
    return findNotNullChildByClass(StructurizrDslId.class);
  }

  @Override
  @Nullable
  public StructurizrDslViewKey getViewKey() {
    return findChildByClass(StructurizrDslViewKey.class);
  }

}
