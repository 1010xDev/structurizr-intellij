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

  "{"                          { return Tokens.OPEN_PARENS; }
  "}"                          { return Tokens.CLOSE_PARENS; }

  "="                          { return Tokens.EQ; }

  {QUOTED_TEXT}                { return Tokens.QUOTED_TEXT; }
  {UNQUOTED_TEXT}              { return Tokens.UNQUOTED_TEXT; }

  {HORIZONTAL_WHITESPACE}      { return WHITE_SPACE; }
  {LINE_BREAK}                 { return Tokens.LINE_BREAK; }
}

[^]                            { return TokenType.BAD_CHARACTER; }