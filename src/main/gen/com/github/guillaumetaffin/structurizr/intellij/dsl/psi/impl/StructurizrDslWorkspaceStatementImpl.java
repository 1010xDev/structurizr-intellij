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

public class StructurizrDslWorkspaceStatementImpl extends ASTWrapperPsiElement implements StructurizrDslWorkspaceStatement {

  public StructurizrDslWorkspaceStatementImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull StructurizrDslVisitor visitor) {
    visitor.visitWorkspaceStatement(this);
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
  public List<StructurizrDslConfigurationStatement> getConfigurationStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, StructurizrDslConfigurationStatement.class);
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
  public List<StructurizrDslIdentifiersStatement> getIdentifiersStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, StructurizrDslIdentifiersStatement.class);
  }

  @Override
  @NotNull
  public List<StructurizrDslModelStatement> getModelStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, StructurizrDslModelStatement.class);
  }

  @Override
  @NotNull
  public List<StructurizrDslNameStatement> getNameStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, StructurizrDslNameStatement.class);
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
  public List<StructurizrDslViewsStatement> getViewsStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, StructurizrDslViewsStatement.class);
  }

  @Override
  @NotNull
  public StructurizrDslWorkspaceDefinition getWorkspaceDefinition() {
    return findNotNullChildByClass(StructurizrDslWorkspaceDefinition.class);
  }

}
