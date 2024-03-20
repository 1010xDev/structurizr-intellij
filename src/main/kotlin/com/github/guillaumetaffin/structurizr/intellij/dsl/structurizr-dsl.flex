package com.github.guillaumetaffin.structurizr.intellij.dsl;

import com.github.guillaumetaffin.structurizr.intellij.dsl.psi.Tokens;
import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import com.intellij.psi.TokenType;

import static com.intellij.psi.TokenType.WHITE_SPACE;

%%

%class StructurizrDslLexer
%implements FlexLexer
%unicode
%function advance
%type IElementType
%eof{  return;
%eof}

HORIZONTAL_WHITESPACE=[ \t\f]+
LINE_BREAK=[\n\r]

QUOTED_TEXT=\"[^\"\r\n]*\"?
UNQUOTED_TEXT=[^\s\"\r\n\{\=]+

%%
<YYINITIAL> {
  "extends"                    { return Tokens.EXTENDS; }
  "workspace"                  { return Tokens.WORKSPACE; }
  "model"                      { return Tokens.MODEL; }
  "person"                     { return Tokens.PERSON; }
  "softwareSystem"             { return Tokens.SOFTWARE_SYSTEM; }
  "container"                  { return Tokens.CONTAINER; }
  "component"                  { return Tokens.COMPONENT; }
  "group"                      { return Tokens.GROUP; }
  "name"                       { return Tokens.NAME; }
  "description"                { return Tokens.DESCRIPTION; }
  "properties"                 { return Tokens.PROPERTIES; }
  "!identifiers"               { return Tokens.IDENTIFIERS; }
  "hierarchical"               { return Tokens.HIERARCHICAL; }
  "flat"                       { return Tokens.FLAT; }
  "!docs"                      { return Tokens.DOCS; }
  "!adrs"                      { return Tokens.ADRS; }
  "views"                      { return Tokens.VIEWS; }
  "configuration"              { return Tokens.CONFIGURATION; }
  "tags"                       { return Tokens.TAGS; }
  "url"                        { return Tokens.URL; }
  "perspectives"               { return Tokens.PERSPECTIVES; }
  "->"                         { return Tokens.RELATION_ARROW; }
  "this"                       { return Tokens.THIS; }
  "technology"                 { return Tokens.TECHNOLOGY; }
  "element"                    { return Tokens.ELEMENT; }
  "deploymentEnvironment"      { return Tokens.DEPLOYMENT_ENVIRONMENT; }
  "deploymentGroup"            { return Tokens.DEPLOYMENT_GROUP; }
  "deploymentNode"             { return Tokens.DEPLOYMENT_NODE; }
  "instances"                  { return Tokens.INSTANCES; }
  "infrastructureNode"         { return Tokens.INFRASTRUCTURE_NODE; }
  "softwareSystemInstance"     { return Tokens.SOFTWARE_SYSTEM_INSTANCE; }
  "healthCheck"                { return Tokens.HEALTH_CHECK; }
  "containerInstance"          { return Tokens.CONTAINER_INSTANCE; }
  "systemLandscape"            { return Tokens.SYSTEM_LANDSCAPE; }
  "include"                    { return Tokens.INCLUDE; }
  "exclude"                    { return Tokens.EXCLUDE; }
  "autolayout"                 { return Tokens.AUTOLAYOUT; }
  "bt"                         { return Tokens.BT; }
  "tb"                         { return Tokens.TB; }
  "lr"                         { return Tokens.LR; }
  "rl"                         { return Tokens.RL; }
  "default"                    { return Tokens.DEFAULT; }
  "*"                          { return Tokens.STAR; }
  "animation"                  { return Tokens.ANIMATION; }
  "title"                      { return Tokens.TITLE; }
  "systemContext"              { return Tokens.SYSTEM_CONTEXT; }
  "filtered"                   { return Tokens.FILTERED; }
  "dynamic"                    { return Tokens.DYNAMIC; }
  "deployment"                 { return Tokens.DEPLOYMENT; }
  "custom"                     { return Tokens.CUSTOM; }
  "image"                      { return Tokens.IMAGE; }
  "plantuml"                   { return Tokens.PLANTUML; }
  "mermaid"                    { return Tokens.MERMAID; }
  "kroki"                      { return Tokens.KROKI; }
  "styles"                     { return Tokens.STYLES; }
  "shape"                      { return Tokens.SHAPE; }
  "Box"                        { return Tokens.BOX; }
  "RoundedBox"                 { return Tokens.ROUNDED_BOX; }
  "Circle"                     { return Tokens.CIRCLE; }
  "Ellipse"                    { return Tokens.ELLIPSE; }
  "Hexagon"                    { return Tokens.HEXAGON; }
  "Cylinder"                   { return Tokens.CYLINDER; }
  "Pipe"                       { return Tokens.PIPE; }
  "Person"                     { return Tokens.PERSON_SHAPE; }
  "Robot"                      { return Tokens.ROBOT; }
  "Folder"                     { return Tokens.FOLDER; }
  "WebBrowser"                 { return Tokens.WEB_BROWSER; }
  "MobileDevicePortrait"       { return Tokens.MOBILE_DEVICE_PORTRAIT; }
  "MobileDeviceLandscape"      { return Tokens.MOBILE_DEVICE_LANDSCAPE; }
  "Component"                  { return Tokens.COMPONENT_SHAPE; }
  "relationship"               { return Tokens.RELATIONSHIP; }
  "icon"                       { return Tokens.ICON; }
  "width"                      { return Tokens.WIDTH; }
  "height"                     { return Tokens.HEIGHT; }
  "background"                 { return Tokens.BACKGROUND; }
  "color"                      { return Tokens.COLOR; }
  "colour"                     { return Tokens.COLOR; }
  "stroke"                     { return Tokens.STROKE; }
  "strokeWidth"                { return Tokens.STROKE_WIDTH; }
  "fontSize"                   { return Tokens.FONT_SIZE; }
  "border"                     { return Tokens.BORDER; }
  "solid"                      { return Tokens.SOLID; }
  "dashed"                     { return Tokens.DASHED; }
  "dotted"                     { return Tokens.DOTTED; }
  "opacity"                    { return Tokens.OPACITY; }
  "metadata"                   { return Tokens.METADATA; }
  "true"                       { return Tokens.TRUE; }
  "false"                      { return Tokens.FALSE; }

  "{"                          { return Tokens.OPEN_PARENS; }
  "}"                          { return Tokens.CLOSE_PARENS; }

  "="                          { return Tokens.EQ; }

  {QUOTED_TEXT}                { return Tokens.QUOTED_TEXT; }
  {UNQUOTED_TEXT}              { return Tokens.UNQUOTED_TEXT; }

  {HORIZONTAL_WHITESPACE}      { return WHITE_SPACE; }
  {LINE_BREAK}                 { return Tokens.LINE_BREAK; }
}

[^]                            { return TokenType.BAD_CHARACTER; }