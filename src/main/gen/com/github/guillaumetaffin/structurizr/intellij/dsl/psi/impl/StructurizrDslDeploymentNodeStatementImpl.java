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

public class StructurizrDslDeploymentNodeStatementImpl extends ASTWrapperPsiElement implements StructurizrDslDeploymentNodeStatement {

  public StructurizrDslDeploymentNodeStatementImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull StructurizrDslVisitor visitor) {
    visitor.visitDeploymentNodeStatement(this);
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
  @NotNull
  public StructurizrDslAName getAName() {
    return findNotNullChildByClass(StructurizrDslAName.class);
  }

  @Override
  @NotNull
  public List<StructurizrDslBoolean> getBooleanList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, StructurizrDslBoolean.class);
  }

  @Override
  @Nullable
  public StructurizrDslDeploymentNodeBlock getDeploymentNodeBlock() {
    return findChildByClass(StructurizrDslDeploymentNodeBlock.class);
  }

  @Override
  @Nullable
  public StructurizrDslTag getTag() {
    return findChildByClass(StructurizrDslTag.class);
  }

}
