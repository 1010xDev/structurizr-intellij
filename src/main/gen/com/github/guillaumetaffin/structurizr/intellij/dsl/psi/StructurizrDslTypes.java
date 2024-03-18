// This is a generated file. Not intended for manual editing.
package com.github.guillaumetaffin.structurizr.intellij.dsl.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.github.guillaumetaffin.structurizr.intellij.dsl.psi.impl.*;

public interface StructurizrDslTypes {

  IElementType ADRS_STATEMENT = new StructurizrDslElementType("ADRS_STATEMENT");
  IElementType A_DESCRIPTION = new StructurizrDslElementType("A_DESCRIPTION");
  IElementType A_NAME = new StructurizrDslElementType("A_NAME");
  IElementType CLOSING_BLOCK = new StructurizrDslElementType("CLOSING_BLOCK");
  IElementType COMPONENT_BLOCK = new StructurizrDslElementType("COMPONENT_BLOCK");
  IElementType COMPONENT_STATEMENT = new StructurizrDslElementType("COMPONENT_STATEMENT");
  IElementType CONFIGURATION_STATEMENT = new StructurizrDslElementType("CONFIGURATION_STATEMENT");
  IElementType CONTAINER_BLOCK = new StructurizrDslElementType("CONTAINER_BLOCK");
  IElementType CONTAINER_INSTANCE_BLOCK = new StructurizrDslElementType("CONTAINER_INSTANCE_BLOCK");
  IElementType CONTAINER_INSTANCE_STATEMENT = new StructurizrDslElementType("CONTAINER_INSTANCE_STATEMENT");
  IElementType CONTAINER_STATEMENT = new StructurizrDslElementType("CONTAINER_STATEMENT");
  IElementType DEPLOYMENT_ENVIRONMENT_BLOCK = new StructurizrDslElementType("DEPLOYMENT_ENVIRONMENT_BLOCK");
  IElementType DEPLOYMENT_ENVIRONMENT_STATEMENT = new StructurizrDslElementType("DEPLOYMENT_ENVIRONMENT_STATEMENT");
  IElementType DEPLOYMENT_GROUP_STATEMENT = new StructurizrDslElementType("DEPLOYMENT_GROUP_STATEMENT");
  IElementType DEPLOYMENT_NODE_BLOCK = new StructurizrDslElementType("DEPLOYMENT_NODE_BLOCK");
  IElementType DEPLOYMENT_NODE_STATEMENT = new StructurizrDslElementType("DEPLOYMENT_NODE_STATEMENT");
  IElementType DESCRIPTION_STATEMENT = new StructurizrDslElementType("DESCRIPTION_STATEMENT");
  IElementType DOCS_STATEMENT = new StructurizrDslElementType("DOCS_STATEMENT");
  IElementType ELEMENT_BLOCK = new StructurizrDslElementType("ELEMENT_BLOCK");
  IElementType ELEMENT_BLOCK_STATEMENT = new StructurizrDslElementType("ELEMENT_BLOCK_STATEMENT");
  IElementType ELEMENT_STATEMENT = new StructurizrDslElementType("ELEMENT_STATEMENT");
  IElementType GROUP_STATEMENTS = new StructurizrDslElementType("GROUP_STATEMENTS");
  IElementType HEALTH_CHECK_STATEMENT = new StructurizrDslElementType("HEALTH_CHECK_STATEMENT");
  IElementType ID = new StructurizrDslElementType("ID");
  IElementType IDENTIFIERS_STATEMENT = new StructurizrDslElementType("IDENTIFIERS_STATEMENT");
  IElementType INFRASTRUCTURE_NODE_BLOCK = new StructurizrDslElementType("INFRASTRUCTURE_NODE_BLOCK");
  IElementType INFRASTRUCTURE_NODE_STATEMENT = new StructurizrDslElementType("INFRASTRUCTURE_NODE_STATEMENT");
  IElementType INSTANCES_STATEMENT = new StructurizrDslElementType("INSTANCES_STATEMENT");
  IElementType LHS_RELATION_STATEMENT = new StructurizrDslElementType("LHS_RELATION_STATEMENT");
  IElementType MODEL_STATEMENT = new StructurizrDslElementType("MODEL_STATEMENT");
  IElementType NAME_STATEMENT = new StructurizrDslElementType("NAME_STATEMENT");
  IElementType OPENING_BLOCK = new StructurizrDslElementType("OPENING_BLOCK");
  IElementType PERSON_BLOCK = new StructurizrDslElementType("PERSON_BLOCK");
  IElementType PERSON_STATEMENT = new StructurizrDslElementType("PERSON_STATEMENT");
  IElementType PERSPECTIVES_STATEMENT = new StructurizrDslElementType("PERSPECTIVES_STATEMENT");
  IElementType PERSPECTIVE_STATEMENT = new StructurizrDslElementType("PERSPECTIVE_STATEMENT");
  IElementType PROPERTIES_STATEMENT = new StructurizrDslElementType("PROPERTIES_STATEMENT");
  IElementType PROPERTY_STATEMENT = new StructurizrDslElementType("PROPERTY_STATEMENT");
  IElementType RELATION_BLOCK = new StructurizrDslElementType("RELATION_BLOCK");
  IElementType RELATION_STATEMENT = new StructurizrDslElementType("RELATION_STATEMENT");
  IElementType RHS_RELATION_STATEMENT = new StructurizrDslElementType("RHS_RELATION_STATEMENT");
  IElementType SOFTWARE_SYSTEM_BLOCK = new StructurizrDslElementType("SOFTWARE_SYSTEM_BLOCK");
  IElementType SOFTWARE_SYSTEM_INSTANCE_BLOCK = new StructurizrDslElementType("SOFTWARE_SYSTEM_INSTANCE_BLOCK");
  IElementType SOFTWARE_SYSTEM_INSTANCE_STATEMENT = new StructurizrDslElementType("SOFTWARE_SYSTEM_INSTANCE_STATEMENT");
  IElementType SOFTWARE_SYSTEM_STATEMENT = new StructurizrDslElementType("SOFTWARE_SYSTEM_STATEMENT");
  IElementType TAG = new StructurizrDslElementType("TAG");
  IElementType TAGS_STATEMENT = new StructurizrDslElementType("TAGS_STATEMENT");
  IElementType TECHNOLOGY_STATEMENT = new StructurizrDslElementType("TECHNOLOGY_STATEMENT");
  IElementType URL_STATEMENT = new StructurizrDslElementType("URL_STATEMENT");
  IElementType VIEWS_STATEMENT = new StructurizrDslElementType("VIEWS_STATEMENT");
  IElementType WORKSPACE_DEFINITION = new StructurizrDslElementType("WORKSPACE_DEFINITION");
  IElementType WORKSPACE_STATEMENT = new StructurizrDslElementType("WORKSPACE_STATEMENT");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == ADRS_STATEMENT) {
        return new StructurizrDslAdrsStatementImpl(node);
      }
      else if (type == A_DESCRIPTION) {
        return new StructurizrDslADescriptionImpl(node);
      }
      else if (type == A_NAME) {
        return new StructurizrDslANameImpl(node);
      }
      else if (type == CLOSING_BLOCK) {
        return new StructurizrDslClosingBlockImpl(node);
      }
      else if (type == COMPONENT_BLOCK) {
        return new StructurizrDslComponentBlockImpl(node);
      }
      else if (type == COMPONENT_STATEMENT) {
        return new StructurizrDslComponentStatementImpl(node);
      }
      else if (type == CONFIGURATION_STATEMENT) {
        return new StructurizrDslConfigurationStatementImpl(node);
      }
      else if (type == CONTAINER_BLOCK) {
        return new StructurizrDslContainerBlockImpl(node);
      }
      else if (type == CONTAINER_INSTANCE_BLOCK) {
        return new StructurizrDslContainerInstanceBlockImpl(node);
      }
      else if (type == CONTAINER_INSTANCE_STATEMENT) {
        return new StructurizrDslContainerInstanceStatementImpl(node);
      }
      else if (type == CONTAINER_STATEMENT) {
        return new StructurizrDslContainerStatementImpl(node);
      }
      else if (type == DEPLOYMENT_ENVIRONMENT_BLOCK) {
        return new StructurizrDslDeploymentEnvironmentBlockImpl(node);
      }
      else if (type == DEPLOYMENT_ENVIRONMENT_STATEMENT) {
        return new StructurizrDslDeploymentEnvironmentStatementImpl(node);
      }
      else if (type == DEPLOYMENT_GROUP_STATEMENT) {
        return new StructurizrDslDeploymentGroupStatementImpl(node);
      }
      else if (type == DEPLOYMENT_NODE_BLOCK) {
        return new StructurizrDslDeploymentNodeBlockImpl(node);
      }
      else if (type == DEPLOYMENT_NODE_STATEMENT) {
        return new StructurizrDslDeploymentNodeStatementImpl(node);
      }
      else if (type == DESCRIPTION_STATEMENT) {
        return new StructurizrDslDescriptionStatementImpl(node);
      }
      else if (type == DOCS_STATEMENT) {
        return new StructurizrDslDocsStatementImpl(node);
      }
      else if (type == ELEMENT_BLOCK) {
        return new StructurizrDslElementBlockImpl(node);
      }
      else if (type == ELEMENT_BLOCK_STATEMENT) {
        return new StructurizrDslElementBlockStatementImpl(node);
      }
      else if (type == ELEMENT_STATEMENT) {
        return new StructurizrDslElementStatementImpl(node);
      }
      else if (type == GROUP_STATEMENTS) {
        return new StructurizrDslGroupStatementsImpl(node);
      }
      else if (type == HEALTH_CHECK_STATEMENT) {
        return new StructurizrDslHealthCheckStatementImpl(node);
      }
      else if (type == ID) {
        return new StructurizrDslIdImpl(node);
      }
      else if (type == IDENTIFIERS_STATEMENT) {
        return new StructurizrDslIdentifiersStatementImpl(node);
      }
      else if (type == INFRASTRUCTURE_NODE_BLOCK) {
        return new StructurizrDslInfrastructureNodeBlockImpl(node);
      }
      else if (type == INFRASTRUCTURE_NODE_STATEMENT) {
        return new StructurizrDslInfrastructureNodeStatementImpl(node);
      }
      else if (type == INSTANCES_STATEMENT) {
        return new StructurizrDslInstancesStatementImpl(node);
      }
      else if (type == LHS_RELATION_STATEMENT) {
        return new StructurizrDslLhsRelationStatementImpl(node);
      }
      else if (type == MODEL_STATEMENT) {
        return new StructurizrDslModelStatementImpl(node);
      }
      else if (type == NAME_STATEMENT) {
        return new StructurizrDslNameStatementImpl(node);
      }
      else if (type == OPENING_BLOCK) {
        return new StructurizrDslOpeningBlockImpl(node);
      }
      else if (type == PERSON_BLOCK) {
        return new StructurizrDslPersonBlockImpl(node);
      }
      else if (type == PERSON_STATEMENT) {
        return new StructurizrDslPersonStatementImpl(node);
      }
      else if (type == PERSPECTIVES_STATEMENT) {
        return new StructurizrDslPerspectivesStatementImpl(node);
      }
      else if (type == PERSPECTIVE_STATEMENT) {
        return new StructurizrDslPerspectiveStatementImpl(node);
      }
      else if (type == PROPERTIES_STATEMENT) {
        return new StructurizrDslPropertiesStatementImpl(node);
      }
      else if (type == PROPERTY_STATEMENT) {
        return new StructurizrDslPropertyStatementImpl(node);
      }
      else if (type == RELATION_BLOCK) {
        return new StructurizrDslRelationBlockImpl(node);
      }
      else if (type == RELATION_STATEMENT) {
        return new StructurizrDslRelationStatementImpl(node);
      }
      else if (type == RHS_RELATION_STATEMENT) {
        return new StructurizrDslRhsRelationStatementImpl(node);
      }
      else if (type == SOFTWARE_SYSTEM_BLOCK) {
        return new StructurizrDslSoftwareSystemBlockImpl(node);
      }
      else if (type == SOFTWARE_SYSTEM_INSTANCE_BLOCK) {
        return new StructurizrDslSoftwareSystemInstanceBlockImpl(node);
      }
      else if (type == SOFTWARE_SYSTEM_INSTANCE_STATEMENT) {
        return new StructurizrDslSoftwareSystemInstanceStatementImpl(node);
      }
      else if (type == SOFTWARE_SYSTEM_STATEMENT) {
        return new StructurizrDslSoftwareSystemStatementImpl(node);
      }
      else if (type == TAG) {
        return new StructurizrDslTagImpl(node);
      }
      else if (type == TAGS_STATEMENT) {
        return new StructurizrDslTagsStatementImpl(node);
      }
      else if (type == TECHNOLOGY_STATEMENT) {
        return new StructurizrDslTechnologyStatementImpl(node);
      }
      else if (type == URL_STATEMENT) {
        return new StructurizrDslUrlStatementImpl(node);
      }
      else if (type == VIEWS_STATEMENT) {
        return new StructurizrDslViewsStatementImpl(node);
      }
      else if (type == WORKSPACE_DEFINITION) {
        return new StructurizrDslWorkspaceDefinitionImpl(node);
      }
      else if (type == WORKSPACE_STATEMENT) {
        return new StructurizrDslWorkspaceStatementImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
