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

public class StructurizrDslImageViewStatementImpl extends ASTWrapperPsiElement implements StructurizrDslImageViewStatement {

  public StructurizrDslImageViewStatementImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull StructurizrDslVisitor visitor) {
    visitor.visitImageViewStatement(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof StructurizrDslVisitor) accept((StructurizrDslVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public StructurizrDslId getId() {
    return findChildByClass(StructurizrDslId.class);
  }

  @Override
  @Nullable
  public StructurizrDslImageViewBlock getImageViewBlock() {
    return findChildByClass(StructurizrDslImageViewBlock.class);
  }

  @Override
  @Nullable
  public StructurizrDslViewKey getViewKey() {
    return findChildByClass(StructurizrDslViewKey.class);
  }

}
