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

public class StructurizrDslElementBlockStatementImpl extends ASTWrapperPsiElement implements StructurizrDslElementBlockStatement {

  public StructurizrDslElementBlockStatementImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull StructurizrDslVisitor visitor) {
    visitor.visitElementBlockStatement(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof StructurizrDslVisitor) accept((StructurizrDslVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public StructurizrDslDescriptionStatement getDescriptionStatement() {
    return findChildByClass(StructurizrDslDescriptionStatement.class);
  }

  @Override
  @Nullable
  public StructurizrDslPerspectivesStatement getPerspectivesStatement() {
    return findChildByClass(StructurizrDslPerspectivesStatement.class);
  }

  @Override
  @Nullable
  public StructurizrDslPropertiesStatement getPropertiesStatement() {
    return findChildByClass(StructurizrDslPropertiesStatement.class);
  }

  @Override
  @Nullable
  public StructurizrDslRelationStatement getRelationStatement() {
    return findChildByClass(StructurizrDslRelationStatement.class);
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
