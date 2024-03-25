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

public class StructurizrDslDeploymentViewStatementImpl extends ASTWrapperPsiElement implements StructurizrDslDeploymentViewStatement {

  public StructurizrDslDeploymentViewStatementImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull StructurizrDslVisitor visitor) {
    visitor.visitDeploymentViewStatement(this);
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
  public StructurizrDslBoolean getBoolean() {
    return findChildByClass(StructurizrDslBoolean.class);
  }

  @Override
  @Nullable
  public StructurizrDslCommonViewBlock getCommonViewBlock() {
    return findChildByClass(StructurizrDslCommonViewBlock.class);
  }

  @Override
  @Nullable
  public StructurizrDslId getId() {
    return findChildByClass(StructurizrDslId.class);
  }

  @Override
  @Nullable
  public StructurizrDslViewKey getViewKey() {
    return findChildByClass(StructurizrDslViewKey.class);
  }

  @Override
  @Nullable
  public PsiElement getColor() {
    return findChildByType(COLOR);
  }

  @Override
  @Nullable
  public PsiElement getInterpolatedText() {
    return findChildByType(INTERPOLATED_TEXT);
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
