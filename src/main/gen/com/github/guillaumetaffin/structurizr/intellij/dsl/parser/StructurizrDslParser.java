// This is a generated file. Not intended for manual editing.
package com.github.guillaumetaffin.structurizr.intellij.dsl.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static com.github.guillaumetaffin.structurizr.intellij.dsl.psi.StructurizrDslTypes.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;
import static com.github.guillaumetaffin.structurizr.intellij.dsl.psi.Tokens.*;
import static com.intellij.psi.TokenType.WHITE_SPACE;;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class StructurizrDslParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, null);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    r = parse_root_(t, b);
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b) {
    return parse_root_(t, b, 0);
  }

  static boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return structurizrFile(b, l + 1);
  }

  /* ********************************************************** */
  // any_text
  public static boolean a_description(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "a_description")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, A_DESCRIPTION, "<a description>");
    r = any_text(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // any_text
  public static boolean a_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "a_name")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, A_NAME, "<a name>");
    r = any_text(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '!adrs' any_text any_text? LINE_BREAK+
  public static boolean adrs_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "adrs_statement")) return false;
    if (!nextTokenIs(b, ADRS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ADRS);
    r = r && any_text(b, l + 1);
    r = r && adrs_statement_2(b, l + 1);
    r = r && adrs_statement_3(b, l + 1);
    exit_section_(b, m, ADRS_STATEMENT, r);
    return r;
  }

  // any_text?
  private static boolean adrs_statement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "adrs_statement_2")) return false;
    any_text(b, l + 1);
    return true;
  }

  // LINE_BREAK+
  private static boolean adrs_statement_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "adrs_statement_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LINE_BREAK);
    while (r) {
      int c = current_position_(b);
      if (!consumeToken(b, LINE_BREAK)) break;
      if (!empty_element_parsed_guard_(b, "adrs_statement_3", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'animation' opening_block animation_step* closing_block
  public static boolean animation_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "animation_statement")) return false;
    if (!nextTokenIs(b, ANIMATION)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ANIMATION);
    r = r && opening_block(b, l + 1);
    r = r && animation_statement_2(b, l + 1);
    r = r && closing_block(b, l + 1);
    exit_section_(b, m, ANIMATION_STATEMENT, r);
    return r;
  }

  // animation_step*
  private static boolean animation_statement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "animation_statement_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!animation_step(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "animation_statement_2", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // id+ LINE_BREAK+
  public static boolean animation_step(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "animation_step")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ANIMATION_STEP, "<animation step>");
    r = animation_step_0(b, l + 1);
    r = r && animation_step_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // id+
  private static boolean animation_step_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "animation_step_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = id(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!id(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "animation_step_0", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // LINE_BREAK+
  private static boolean animation_step_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "animation_step_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LINE_BREAK);
    while (r) {
      int c = current_position_(b);
      if (!consumeToken(b, LINE_BREAK)) break;
      if (!empty_element_parsed_guard_(b, "animation_step_1", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // "workspace"
  //  | "model"
  //  | "softwareSystem"
  //  | "person"
  //  | "container"
  //  | "component"
  //  | "group"
  //  | "extends"
  //  | "name"
  //  | "description"
  //  | "properties"
  //  | "!identifiers"
  //  | "hierarchical"
  //  | "flat"
  //  | "!docs"
  //  | "!adrs"
  //  | "views"
  //  | "tags"
  //  | "url"
  //  | "perspectives"
  //  | "this"
  //  | "technology"
  //  | "element"
  //  | "deploymentEnvironment"
  //  | "deploymentNode"
  //  | "deploymentGroup"
  //  | "instances"
  //  | "infrastructureNode"
  //  | "softwareSystemInstance"
  //  | "healthCheck"
  //  | "containerInstance"
  //  | "systemLandscape"
  //  | "include"
  //  | "exclude"
  //  | "autolayout"
  //  | "bt"
  //  | "tb"
  //  | "lr"
  //  | "rl"
  //  | "default"
  //  | "animation"
  //  | "title"
  //  | "systemContext"
  //  | "filtered"
  //  | "dynamic"
  //  | "deployment"
  //  | "custom"
  //  | "image"
  //  | "plantuml"
  //  | "mermaid"
  //  | "kroki"
  //  | shape
  //  | "icon"
  //  | "width"
  //  | "height"
  //  | "background"
  //  | COLOR
  //  | "stroke"
  //  | "strokeWidth"
  //  | "fontSize"
  //  | "border"
  //  | "solid"
  //  | "dashed"
  //  | "dotted"
  //  | "opacity"
  //  | "metadata"
  //  | "true"
  //  | "false"
  static boolean any_keyword(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "any_keyword")) return false;
    boolean r;
    r = consumeToken(b, WORKSPACE);
    if (!r) r = consumeToken(b, MODEL);
    if (!r) r = consumeToken(b, SOFTWARE_SYSTEM);
    if (!r) r = consumeToken(b, PERSON);
    if (!r) r = consumeToken(b, CONTAINER);
    if (!r) r = consumeToken(b, COMPONENT);
    if (!r) r = consumeToken(b, GROUP);
    if (!r) r = consumeToken(b, EXTENDS);
    if (!r) r = consumeToken(b, NAME);
    if (!r) r = consumeToken(b, DESCRIPTION);
    if (!r) r = consumeToken(b, PROPERTIES);
    if (!r) r = consumeToken(b, IDENTIFIERS);
    if (!r) r = consumeToken(b, HIERARCHICAL);
    if (!r) r = consumeToken(b, FLAT);
    if (!r) r = consumeToken(b, DOCS);
    if (!r) r = consumeToken(b, ADRS);
    if (!r) r = consumeToken(b, VIEWS);
    if (!r) r = consumeToken(b, TAGS);
    if (!r) r = consumeToken(b, URL);
    if (!r) r = consumeToken(b, PERSPECTIVES);
    if (!r) r = consumeToken(b, THIS);
    if (!r) r = consumeToken(b, TECHNOLOGY);
    if (!r) r = consumeToken(b, ELEMENT);
    if (!r) r = consumeToken(b, DEPLOYMENT_ENVIRONMENT);
    if (!r) r = consumeToken(b, DEPLOYMENT_NODE);
    if (!r) r = consumeToken(b, DEPLOYMENT_GROUP);
    if (!r) r = consumeToken(b, INSTANCES);
    if (!r) r = consumeToken(b, INFRASTRUCTURE_NODE);
    if (!r) r = consumeToken(b, SOFTWARE_SYSTEM_INSTANCE);
    if (!r) r = consumeToken(b, HEALTH_CHECK);
    if (!r) r = consumeToken(b, CONTAINER_INSTANCE);
    if (!r) r = consumeToken(b, SYSTEM_LANDSCAPE);
    if (!r) r = consumeToken(b, INCLUDE);
    if (!r) r = consumeToken(b, EXCLUDE);
    if (!r) r = consumeToken(b, AUTOLAYOUT);
    if (!r) r = consumeToken(b, BT);
    if (!r) r = consumeToken(b, TB);
    if (!r) r = consumeToken(b, LR);
    if (!r) r = consumeToken(b, RL);
    if (!r) r = consumeToken(b, DEFAULT);
    if (!r) r = consumeToken(b, ANIMATION);
    if (!r) r = consumeToken(b, TITLE);
    if (!r) r = consumeToken(b, SYSTEM_CONTEXT);
    if (!r) r = consumeToken(b, FILTERED);
    if (!r) r = consumeToken(b, DYNAMIC);
    if (!r) r = consumeToken(b, DEPLOYMENT);
    if (!r) r = consumeToken(b, CUSTOM);
    if (!r) r = consumeToken(b, IMAGE);
    if (!r) r = consumeToken(b, PLANTUML);
    if (!r) r = consumeToken(b, MERMAID);
    if (!r) r = consumeToken(b, KROKI);
    if (!r) r = shape(b, l + 1);
    if (!r) r = consumeToken(b, ICON);
    if (!r) r = consumeToken(b, WIDTH);
    if (!r) r = consumeToken(b, HEIGHT);
    if (!r) r = consumeToken(b, BACKGROUND);
    if (!r) r = consumeToken(b, COLOR);
    if (!r) r = consumeToken(b, STROKE);
    if (!r) r = consumeToken(b, STROKE_WIDTH);
    if (!r) r = consumeToken(b, FONT_SIZE);
    if (!r) r = consumeToken(b, BORDER);
    if (!r) r = consumeToken(b, SOLID);
    if (!r) r = consumeToken(b, DASHED);
    if (!r) r = consumeToken(b, DOTTED);
    if (!r) r = consumeToken(b, OPACITY);
    if (!r) r = consumeToken(b, METADATA);
    if (!r) r = consumeToken(b, TRUE);
    if (!r) r = consumeToken(b, FALSE);
    return r;
  }

  /* ********************************************************** */
  // UNQUOTED_TEXT | QUOTED_TEXT| any_keyword
  static boolean any_text(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "any_text")) return false;
    boolean r;
    r = consumeToken(b, UNQUOTED_TEXT);
    if (!r) r = consumeToken(b, QUOTED_TEXT);
    if (!r) r = any_keyword(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // 'autolayout' ('tb' | 'bt' | 'lr' | 'rl') any_text? any_text? LINE_BREAK+
  public static boolean autolayout_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "autolayout_statement")) return false;
    if (!nextTokenIs(b, AUTOLAYOUT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, AUTOLAYOUT);
    r = r && autolayout_statement_1(b, l + 1);
    r = r && autolayout_statement_2(b, l + 1);
    r = r && autolayout_statement_3(b, l + 1);
    r = r && autolayout_statement_4(b, l + 1);
    exit_section_(b, m, AUTOLAYOUT_STATEMENT, r);
    return r;
  }

  // 'tb' | 'bt' | 'lr' | 'rl'
  private static boolean autolayout_statement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "autolayout_statement_1")) return false;
    boolean r;
    r = consumeToken(b, TB);
    if (!r) r = consumeToken(b, BT);
    if (!r) r = consumeToken(b, LR);
    if (!r) r = consumeToken(b, RL);
    return r;
  }

  // any_text?
  private static boolean autolayout_statement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "autolayout_statement_2")) return false;
    any_text(b, l + 1);
    return true;
  }

  // any_text?
  private static boolean autolayout_statement_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "autolayout_statement_3")) return false;
    any_text(b, l + 1);
    return true;
  }

  // LINE_BREAK+
  private static boolean autolayout_statement_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "autolayout_statement_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LINE_BREAK);
    while (r) {
      int c = current_position_(b);
      if (!consumeToken(b, LINE_BREAK)) break;
      if (!empty_element_parsed_guard_(b, "autolayout_statement_4", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // "}" (LINE_BREAK+ | <<eof>>)
  public static boolean closing_block(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "closing_block")) return false;
    if (!nextTokenIs(b, CLOSE_PARENS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CLOSE_PARENS);
    r = r && closing_block_1(b, l + 1);
    exit_section_(b, m, CLOSING_BLOCK, r);
    return r;
  }

  // LINE_BREAK+ | <<eof>>
  private static boolean closing_block_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "closing_block_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = closing_block_1_0(b, l + 1);
    if (!r) r = eof(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // LINE_BREAK+
  private static boolean closing_block_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "closing_block_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LINE_BREAK);
    while (r) {
      int c = current_position_(b);
      if (!consumeToken(b, LINE_BREAK)) break;
      if (!empty_element_parsed_guard_(b, "closing_block_1_0", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // opening_block system_landscape_view_block_statement* closing_block
  public static boolean common_view_block(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "common_view_block")) return false;
    if (!nextTokenIs(b, OPEN_PARENS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = opening_block(b, l + 1);
    r = r && common_view_block_1(b, l + 1);
    r = r && closing_block(b, l + 1);
    exit_section_(b, m, COMMON_VIEW_BLOCK, r);
    return r;
  }

  // system_landscape_view_block_statement*
  private static boolean common_view_block_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "common_view_block_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!system_landscape_view_block_statement(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "common_view_block_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // opening_block component_block_statement*  closing_block
  public static boolean component_block(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "component_block")) return false;
    if (!nextTokenIs(b, OPEN_PARENS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = opening_block(b, l + 1);
    r = r && component_block_1(b, l + 1);
    r = r && closing_block(b, l + 1);
    exit_section_(b, m, COMPONENT_BLOCK, r);
    return r;
  }

  // component_block_statement*
  private static boolean component_block_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "component_block_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!component_block_statement(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "component_block_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // docs_statement
  //  | adrs_statement
  //  | description_statement
  //  | technology_statement
  //  | tags_statement
  //  | url_statement
  //  | properties_statement
  //  | perspectives_statement
  //  | relation_statement
  static boolean component_block_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "component_block_statement")) return false;
    boolean r;
    r = docs_statement(b, l + 1);
    if (!r) r = adrs_statement(b, l + 1);
    if (!r) r = description_statement(b, l + 1);
    if (!r) r = technology_statement(b, l + 1);
    if (!r) r = tags_statement(b, l + 1);
    if (!r) r = url_statement(b, l + 1);
    if (!r) r = properties_statement(b, l + 1);
    if (!r) r = perspectives_statement(b, l + 1);
    if (!r) r = relation_statement(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // <<tech_taggable_element_definition "component" >> (component_block | LINE_BREAK+)
  public static boolean component_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "component_statement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, COMPONENT_STATEMENT, "<component statement>");
    r = tech_taggable_element_definition(b, l + 1, COMPONENT_parser_);
    r = r && component_statement_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // component_block | LINE_BREAK+
  private static boolean component_statement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "component_statement_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = component_block(b, l + 1);
    if (!r) r = component_statement_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // LINE_BREAK+
  private static boolean component_statement_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "component_statement_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LINE_BREAK);
    while (r) {
      int c = current_position_(b);
      if (!consumeToken(b, LINE_BREAK)) break;
      if (!empty_element_parsed_guard_(b, "component_statement_1_1", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'component' id view_key? a_description? (common_view_block | LINE_BREAK+)
  public static boolean component_view_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "component_view_statement")) return false;
    if (!nextTokenIs(b, COMPONENT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMPONENT);
    r = r && id(b, l + 1);
    r = r && component_view_statement_2(b, l + 1);
    r = r && component_view_statement_3(b, l + 1);
    r = r && component_view_statement_4(b, l + 1);
    exit_section_(b, m, COMPONENT_VIEW_STATEMENT, r);
    return r;
  }

  // view_key?
  private static boolean component_view_statement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "component_view_statement_2")) return false;
    view_key(b, l + 1);
    return true;
  }

  // a_description?
  private static boolean component_view_statement_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "component_view_statement_3")) return false;
    a_description(b, l + 1);
    return true;
  }

  // common_view_block | LINE_BREAK+
  private static boolean component_view_statement_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "component_view_statement_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = common_view_block(b, l + 1);
    if (!r) r = component_view_statement_4_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // LINE_BREAK+
  private static boolean component_view_statement_4_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "component_view_statement_4_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LINE_BREAK);
    while (r) {
      int c = current_position_(b);
      if (!consumeToken(b, LINE_BREAK)) break;
      if (!empty_element_parsed_guard_(b, "component_view_statement_4_1", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // "configuration" opening_block closing_block
  public static boolean configuration_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "configuration_statement")) return false;
    if (!nextTokenIs(b, CONFIGURATION)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CONFIGURATION);
    r = r && opening_block(b, l + 1);
    r = r && closing_block(b, l + 1);
    exit_section_(b, m, CONFIGURATION_STATEMENT, r);
    return r;
  }

  /* ********************************************************** */
  // opening_block container_block_statement* closing_block
  public static boolean container_block(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "container_block")) return false;
    if (!nextTokenIs(b, OPEN_PARENS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = opening_block(b, l + 1);
    r = r && container_block_1(b, l + 1);
    r = r && closing_block(b, l + 1);
    exit_section_(b, m, CONTAINER_BLOCK, r);
    return r;
  }

  // container_block_statement*
  private static boolean container_block_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "container_block_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!container_block_statement(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "container_block_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // component_statement
  //  | docs_statement
  //  | adrs_statement
  //  | <<group_statements container_block_statement>>
  //  | description_statement
  //  | technology_statement
  //  | tags_statement
  //  | url_statement
  //  | properties_statement
  //  | perspectives_statement
  //  | relation_statement
  static boolean container_block_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "container_block_statement")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = component_statement(b, l + 1);
    if (!r) r = docs_statement(b, l + 1);
    if (!r) r = adrs_statement(b, l + 1);
    if (!r) r = group_statements(b, l + 1, StructurizrDslParser::container_block_statement);
    if (!r) r = description_statement(b, l + 1);
    if (!r) r = technology_statement(b, l + 1);
    if (!r) r = tags_statement(b, l + 1);
    if (!r) r = url_statement(b, l + 1);
    if (!r) r = properties_statement(b, l + 1);
    if (!r) r = perspectives_statement(b, l + 1);
    if (!r) r = relation_statement(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // opening_block container_instance_block_statement* closing_block
  public static boolean container_instance_block(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "container_instance_block")) return false;
    if (!nextTokenIs(b, OPEN_PARENS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = opening_block(b, l + 1);
    r = r && container_instance_block_1(b, l + 1);
    r = r && closing_block(b, l + 1);
    exit_section_(b, m, CONTAINER_INSTANCE_BLOCK, r);
    return r;
  }

  // container_instance_block_statement*
  private static boolean container_instance_block_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "container_instance_block_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!container_instance_block_statement(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "container_instance_block_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // relation_statement
  //  | description_statement
  //  | tags_statement
  //  | url_statement
  //  | properties_statement
  //  | perspectives_statement
  //  |health_check_statement
  static boolean container_instance_block_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "container_instance_block_statement")) return false;
    boolean r;
    r = relation_statement(b, l + 1);
    if (!r) r = description_statement(b, l + 1);
    if (!r) r = tags_statement(b, l + 1);
    if (!r) r = url_statement(b, l + 1);
    if (!r) r = properties_statement(b, l + 1);
    if (!r) r = perspectives_statement(b, l + 1);
    if (!r) r = health_check_statement(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // 'containerInstance' id any_text? tag? (container_instance_block | LINE_BREAK+)
  public static boolean container_instance_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "container_instance_statement")) return false;
    if (!nextTokenIs(b, CONTAINER_INSTANCE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CONTAINER_INSTANCE);
    r = r && id(b, l + 1);
    r = r && container_instance_statement_2(b, l + 1);
    r = r && container_instance_statement_3(b, l + 1);
    r = r && container_instance_statement_4(b, l + 1);
    exit_section_(b, m, CONTAINER_INSTANCE_STATEMENT, r);
    return r;
  }

  // any_text?
  private static boolean container_instance_statement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "container_instance_statement_2")) return false;
    any_text(b, l + 1);
    return true;
  }

  // tag?
  private static boolean container_instance_statement_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "container_instance_statement_3")) return false;
    tag(b, l + 1);
    return true;
  }

  // container_instance_block | LINE_BREAK+
  private static boolean container_instance_statement_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "container_instance_statement_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = container_instance_block(b, l + 1);
    if (!r) r = container_instance_statement_4_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // LINE_BREAK+
  private static boolean container_instance_statement_4_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "container_instance_statement_4_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LINE_BREAK);
    while (r) {
      int c = current_position_(b);
      if (!consumeToken(b, LINE_BREAK)) break;
      if (!empty_element_parsed_guard_(b, "container_instance_statement_4_1", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // <<tech_taggable_element_definition "container" >> (container_block | LINE_BREAK+)
  public static boolean container_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "container_statement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CONTAINER_STATEMENT, "<container statement>");
    r = tech_taggable_element_definition(b, l + 1, CONTAINER_parser_);
    r = r && container_statement_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // container_block | LINE_BREAK+
  private static boolean container_statement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "container_statement_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = container_block(b, l + 1);
    if (!r) r = container_statement_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // LINE_BREAK+
  private static boolean container_statement_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "container_statement_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LINE_BREAK);
    while (r) {
      int c = current_position_(b);
      if (!consumeToken(b, LINE_BREAK)) break;
      if (!empty_element_parsed_guard_(b, "container_statement_1_1", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'container' id view_key? a_description? (common_view_block | LINE_BREAK+)
  public static boolean container_view_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "container_view_statement")) return false;
    if (!nextTokenIs(b, CONTAINER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CONTAINER);
    r = r && id(b, l + 1);
    r = r && container_view_statement_2(b, l + 1);
    r = r && container_view_statement_3(b, l + 1);
    r = r && container_view_statement_4(b, l + 1);
    exit_section_(b, m, CONTAINER_VIEW_STATEMENT, r);
    return r;
  }

  // view_key?
  private static boolean container_view_statement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "container_view_statement_2")) return false;
    view_key(b, l + 1);
    return true;
  }

  // a_description?
  private static boolean container_view_statement_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "container_view_statement_3")) return false;
    a_description(b, l + 1);
    return true;
  }

  // common_view_block | LINE_BREAK+
  private static boolean container_view_statement_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "container_view_statement_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = common_view_block(b, l + 1);
    if (!r) r = container_view_statement_4_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // LINE_BREAK+
  private static boolean container_view_statement_4_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "container_view_statement_4_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LINE_BREAK);
    while (r) {
      int c = current_position_(b);
      if (!consumeToken(b, LINE_BREAK)) break;
      if (!empty_element_parsed_guard_(b, "container_view_statement_4_1", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'custom' view_key? any_text? a_description? (common_view_block | LINE_BREAK+)
  public static boolean custom_view_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "custom_view_statement")) return false;
    if (!nextTokenIs(b, CUSTOM)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CUSTOM);
    r = r && custom_view_statement_1(b, l + 1);
    r = r && custom_view_statement_2(b, l + 1);
    r = r && custom_view_statement_3(b, l + 1);
    r = r && custom_view_statement_4(b, l + 1);
    exit_section_(b, m, CUSTOM_VIEW_STATEMENT, r);
    return r;
  }

  // view_key?
  private static boolean custom_view_statement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "custom_view_statement_1")) return false;
    view_key(b, l + 1);
    return true;
  }

  // any_text?
  private static boolean custom_view_statement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "custom_view_statement_2")) return false;
    any_text(b, l + 1);
    return true;
  }

  // a_description?
  private static boolean custom_view_statement_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "custom_view_statement_3")) return false;
    a_description(b, l + 1);
    return true;
  }

  // common_view_block | LINE_BREAK+
  private static boolean custom_view_statement_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "custom_view_statement_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = common_view_block(b, l + 1);
    if (!r) r = custom_view_statement_4_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // LINE_BREAK+
  private static boolean custom_view_statement_4_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "custom_view_statement_4_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LINE_BREAK);
    while (r) {
      int c = current_position_(b);
      if (!consumeToken(b, LINE_BREAK)) break;
      if (!empty_element_parsed_guard_(b, "custom_view_statement_4_1", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'default' LINE_BREAK+
  public static boolean default_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "default_statement")) return false;
    if (!nextTokenIs(b, DEFAULT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DEFAULT);
    r = r && default_statement_1(b, l + 1);
    exit_section_(b, m, DEFAULT_STATEMENT, r);
    return r;
  }

  // LINE_BREAK+
  private static boolean default_statement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "default_statement_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LINE_BREAK);
    while (r) {
      int c = current_position_(b);
      if (!consumeToken(b, LINE_BREAK)) break;
      if (!empty_element_parsed_guard_(b, "default_statement_1", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // opening_block deployment_environment_block_statement* closing_block
  public static boolean deployment_environment_block(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "deployment_environment_block")) return false;
    if (!nextTokenIs(b, OPEN_PARENS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = opening_block(b, l + 1);
    r = r && deployment_environment_block_1(b, l + 1);
    r = r && closing_block(b, l + 1);
    exit_section_(b, m, DEPLOYMENT_ENVIRONMENT_BLOCK, r);
    return r;
  }

  // deployment_environment_block_statement*
  private static boolean deployment_environment_block_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "deployment_environment_block_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!deployment_environment_block_statement(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "deployment_environment_block_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // relation_statement
  //  | deployment_group_statement
  //  | deployment_node_statement
  //  | <<group_statements deployment_environment_block_statement>>
  static boolean deployment_environment_block_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "deployment_environment_block_statement")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = relation_statement(b, l + 1);
    if (!r) r = deployment_group_statement(b, l + 1);
    if (!r) r = deployment_node_statement(b, l + 1);
    if (!r) r = group_statements(b, l + 1, StructurizrDslParser::deployment_environment_block_statement);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'deploymentEnvironment' a_name deployment_environment_block
  public static boolean deployment_environment_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "deployment_environment_statement")) return false;
    if (!nextTokenIs(b, DEPLOYMENT_ENVIRONMENT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DEPLOYMENT_ENVIRONMENT);
    r = r && a_name(b, l + 1);
    r = r && deployment_environment_block(b, l + 1);
    exit_section_(b, m, DEPLOYMENT_ENVIRONMENT_STATEMENT, r);
    return r;
  }

  /* ********************************************************** */
  // 'deploymentGroup' a_name LINE_BREAK+
  public static boolean deployment_group_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "deployment_group_statement")) return false;
    if (!nextTokenIs(b, DEPLOYMENT_GROUP)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DEPLOYMENT_GROUP);
    r = r && a_name(b, l + 1);
    r = r && deployment_group_statement_2(b, l + 1);
    exit_section_(b, m, DEPLOYMENT_GROUP_STATEMENT, r);
    return r;
  }

  // LINE_BREAK+
  private static boolean deployment_group_statement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "deployment_group_statement_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LINE_BREAK);
    while (r) {
      int c = current_position_(b);
      if (!consumeToken(b, LINE_BREAK)) break;
      if (!empty_element_parsed_guard_(b, "deployment_group_statement_2", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // opening_block deployment_node_block_statement* closing_block
  public static boolean deployment_node_block(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "deployment_node_block")) return false;
    if (!nextTokenIs(b, OPEN_PARENS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = opening_block(b, l + 1);
    r = r && deployment_node_block_1(b, l + 1);
    r = r && closing_block(b, l + 1);
    exit_section_(b, m, DEPLOYMENT_NODE_BLOCK, r);
    return r;
  }

  // deployment_node_block_statement*
  private static boolean deployment_node_block_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "deployment_node_block_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!deployment_node_block_statement(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "deployment_node_block_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // <<group_statements deployment_node_statement>>
  //  | deployment_node_statement
  //  | infrastructure_node_statement
  //  | software_system_instance_statement
  //  | container_instance_statement
  //  | relation_statement
  //  | description_statement
  //  | technology_statement
  //  | instances_statement
  //  | tags_statement
  //  | url_statement
  //  | properties_statement
  //  | perspectives_statement
  static boolean deployment_node_block_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "deployment_node_block_statement")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = group_statements(b, l + 1, StructurizrDslParser::deployment_node_statement);
    if (!r) r = deployment_node_statement(b, l + 1);
    if (!r) r = infrastructure_node_statement(b, l + 1);
    if (!r) r = software_system_instance_statement(b, l + 1);
    if (!r) r = container_instance_statement(b, l + 1);
    if (!r) r = relation_statement(b, l + 1);
    if (!r) r = description_statement(b, l + 1);
    if (!r) r = technology_statement(b, l + 1);
    if (!r) r = instances_statement(b, l + 1);
    if (!r) r = tags_statement(b, l + 1);
    if (!r) r = url_statement(b, l + 1);
    if (!r) r = properties_statement(b, l + 1);
    if (!r) r = perspectives_statement(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'deploymentNode' a_name a_description? any_text? tag? any_text? (deployment_node_block | LINE_BREAK+)
  public static boolean deployment_node_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "deployment_node_statement")) return false;
    if (!nextTokenIs(b, DEPLOYMENT_NODE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DEPLOYMENT_NODE);
    r = r && a_name(b, l + 1);
    r = r && deployment_node_statement_2(b, l + 1);
    r = r && deployment_node_statement_3(b, l + 1);
    r = r && deployment_node_statement_4(b, l + 1);
    r = r && deployment_node_statement_5(b, l + 1);
    r = r && deployment_node_statement_6(b, l + 1);
    exit_section_(b, m, DEPLOYMENT_NODE_STATEMENT, r);
    return r;
  }

  // a_description?
  private static boolean deployment_node_statement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "deployment_node_statement_2")) return false;
    a_description(b, l + 1);
    return true;
  }

  // any_text?
  private static boolean deployment_node_statement_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "deployment_node_statement_3")) return false;
    any_text(b, l + 1);
    return true;
  }

  // tag?
  private static boolean deployment_node_statement_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "deployment_node_statement_4")) return false;
    tag(b, l + 1);
    return true;
  }

  // any_text?
  private static boolean deployment_node_statement_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "deployment_node_statement_5")) return false;
    any_text(b, l + 1);
    return true;
  }

  // deployment_node_block | LINE_BREAK+
  private static boolean deployment_node_statement_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "deployment_node_statement_6")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = deployment_node_block(b, l + 1);
    if (!r) r = deployment_node_statement_6_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // LINE_BREAK+
  private static boolean deployment_node_statement_6_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "deployment_node_statement_6_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LINE_BREAK);
    while (r) {
      int c = current_position_(b);
      if (!consumeToken(b, LINE_BREAK)) break;
      if (!empty_element_parsed_guard_(b, "deployment_node_statement_6_1", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'deployment' ('*' | id) any_text view_key? a_description? (common_view_block | LINE_BREAK+)
  public static boolean deployment_view_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "deployment_view_statement")) return false;
    if (!nextTokenIs(b, DEPLOYMENT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DEPLOYMENT);
    r = r && deployment_view_statement_1(b, l + 1);
    r = r && any_text(b, l + 1);
    r = r && deployment_view_statement_3(b, l + 1);
    r = r && deployment_view_statement_4(b, l + 1);
    r = r && deployment_view_statement_5(b, l + 1);
    exit_section_(b, m, DEPLOYMENT_VIEW_STATEMENT, r);
    return r;
  }

  // '*' | id
  private static boolean deployment_view_statement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "deployment_view_statement_1")) return false;
    boolean r;
    r = consumeToken(b, STAR);
    if (!r) r = id(b, l + 1);
    return r;
  }

  // view_key?
  private static boolean deployment_view_statement_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "deployment_view_statement_3")) return false;
    view_key(b, l + 1);
    return true;
  }

  // a_description?
  private static boolean deployment_view_statement_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "deployment_view_statement_4")) return false;
    a_description(b, l + 1);
    return true;
  }

  // common_view_block | LINE_BREAK+
  private static boolean deployment_view_statement_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "deployment_view_statement_5")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = common_view_block(b, l + 1);
    if (!r) r = deployment_view_statement_5_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // LINE_BREAK+
  private static boolean deployment_view_statement_5_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "deployment_view_statement_5_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LINE_BREAK);
    while (r) {
      int c = current_position_(b);
      if (!consumeToken(b, LINE_BREAK)) break;
      if (!empty_element_parsed_guard_(b, "deployment_view_statement_5_1", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // "description" any_text LINE_BREAK+
  public static boolean description_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "description_statement")) return false;
    if (!nextTokenIs(b, DESCRIPTION)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DESCRIPTION);
    r = r && any_text(b, l + 1);
    r = r && description_statement_2(b, l + 1);
    exit_section_(b, m, DESCRIPTION_STATEMENT, r);
    return r;
  }

  // LINE_BREAK+
  private static boolean description_statement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "description_statement_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LINE_BREAK);
    while (r) {
      int c = current_position_(b);
      if (!consumeToken(b, LINE_BREAK)) break;
      if (!empty_element_parsed_guard_(b, "description_statement_2", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // '!docs' any_text any_text? LINE_BREAK+
  public static boolean docs_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "docs_statement")) return false;
    if (!nextTokenIs(b, DOCS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DOCS);
    r = r && any_text(b, l + 1);
    r = r && docs_statement_2(b, l + 1);
    r = r && docs_statement_3(b, l + 1);
    exit_section_(b, m, DOCS_STATEMENT, r);
    return r;
  }

  // any_text?
  private static boolean docs_statement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "docs_statement_2")) return false;
    any_text(b, l + 1);
    return true;
  }

  // LINE_BREAK+
  private static boolean docs_statement_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "docs_statement_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LINE_BREAK);
    while (r) {
      int c = current_position_(b);
      if (!consumeToken(b, LINE_BREAK)) break;
      if (!empty_element_parsed_guard_(b, "docs_statement_3", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // opening_block (relation_statement | autolayout_statement | default_statement | title_statement | description_statement | properties_statement)* closing_block
  public static boolean dynamic_view_block(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dynamic_view_block")) return false;
    if (!nextTokenIs(b, OPEN_PARENS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = opening_block(b, l + 1);
    r = r && dynamic_view_block_1(b, l + 1);
    r = r && closing_block(b, l + 1);
    exit_section_(b, m, DYNAMIC_VIEW_BLOCK, r);
    return r;
  }

  // (relation_statement | autolayout_statement | default_statement | title_statement | description_statement | properties_statement)*
  private static boolean dynamic_view_block_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dynamic_view_block_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!dynamic_view_block_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "dynamic_view_block_1", c)) break;
    }
    return true;
  }

  // relation_statement | autolayout_statement | default_statement | title_statement | description_statement | properties_statement
  private static boolean dynamic_view_block_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dynamic_view_block_1_0")) return false;
    boolean r;
    r = relation_statement(b, l + 1);
    if (!r) r = autolayout_statement(b, l + 1);
    if (!r) r = default_statement(b, l + 1);
    if (!r) r = title_statement(b, l + 1);
    if (!r) r = description_statement(b, l + 1);
    if (!r) r = properties_statement(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // 'dynamic' ('*' | id) view_key? a_description? (dynamic_view_block | LINE_BREAK+)
  public static boolean dynamic_view_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dynamic_view_statement")) return false;
    if (!nextTokenIs(b, DYNAMIC)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DYNAMIC);
    r = r && dynamic_view_statement_1(b, l + 1);
    r = r && dynamic_view_statement_2(b, l + 1);
    r = r && dynamic_view_statement_3(b, l + 1);
    r = r && dynamic_view_statement_4(b, l + 1);
    exit_section_(b, m, DYNAMIC_VIEW_STATEMENT, r);
    return r;
  }

  // '*' | id
  private static boolean dynamic_view_statement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dynamic_view_statement_1")) return false;
    boolean r;
    r = consumeToken(b, STAR);
    if (!r) r = id(b, l + 1);
    return r;
  }

  // view_key?
  private static boolean dynamic_view_statement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dynamic_view_statement_2")) return false;
    view_key(b, l + 1);
    return true;
  }

  // a_description?
  private static boolean dynamic_view_statement_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dynamic_view_statement_3")) return false;
    a_description(b, l + 1);
    return true;
  }

  // dynamic_view_block | LINE_BREAK+
  private static boolean dynamic_view_statement_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dynamic_view_statement_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = dynamic_view_block(b, l + 1);
    if (!r) r = dynamic_view_statement_4_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // LINE_BREAK+
  private static boolean dynamic_view_statement_4_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dynamic_view_statement_4_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LINE_BREAK);
    while (r) {
      int c = current_position_(b);
      if (!consumeToken(b, LINE_BREAK)) break;
      if (!empty_element_parsed_guard_(b, "dynamic_view_statement_4_1", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // opening_block element_block_statement* closing_block
  public static boolean element_block(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "element_block")) return false;
    if (!nextTokenIs(b, OPEN_PARENS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = opening_block(b, l + 1);
    r = r && element_block_1(b, l + 1);
    r = r && closing_block(b, l + 1);
    exit_section_(b, m, ELEMENT_BLOCK, r);
    return r;
  }

  // element_block_statement*
  private static boolean element_block_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "element_block_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!element_block_statement(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "element_block_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // description_statement
  //  | tags_statement
  //  | url_statement
  //  | properties_statement
  //  | perspectives_statement
  //  | relation_statement
  public static boolean element_block_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "element_block_statement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ELEMENT_BLOCK_STATEMENT, "<element block statement>");
    r = description_statement(b, l + 1);
    if (!r) r = tags_statement(b, l + 1);
    if (!r) r = url_statement(b, l + 1);
    if (!r) r = properties_statement(b, l + 1);
    if (!r) r = perspectives_statement(b, l + 1);
    if (!r) r = relation_statement(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'element' a_name any_text? a_description? tag? (element_block | LINE_BREAK+)
  public static boolean element_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "element_statement")) return false;
    if (!nextTokenIs(b, ELEMENT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ELEMENT);
    r = r && a_name(b, l + 1);
    r = r && element_statement_2(b, l + 1);
    r = r && element_statement_3(b, l + 1);
    r = r && element_statement_4(b, l + 1);
    r = r && element_statement_5(b, l + 1);
    exit_section_(b, m, ELEMENT_STATEMENT, r);
    return r;
  }

  // any_text?
  private static boolean element_statement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "element_statement_2")) return false;
    any_text(b, l + 1);
    return true;
  }

  // a_description?
  private static boolean element_statement_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "element_statement_3")) return false;
    a_description(b, l + 1);
    return true;
  }

  // tag?
  private static boolean element_statement_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "element_statement_4")) return false;
    tag(b, l + 1);
    return true;
  }

  // element_block | LINE_BREAK+
  private static boolean element_statement_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "element_statement_5")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = element_block(b, l + 1);
    if (!r) r = element_statement_5_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // LINE_BREAK+
  private static boolean element_statement_5_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "element_statement_5_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LINE_BREAK);
    while (r) {
      int c = current_position_(b);
      if (!consumeToken(b, LINE_BREAK)) break;
      if (!empty_element_parsed_guard_(b, "element_statement_5_1", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'element' tag opening_block ( 'shape' shape
  //  | 'icon' any_text LINE_BREAK+
  //  | 'width' any_text LINE_BREAK+
  //  | 'height' any_text LINE_BREAK+
  //  | 'background' any_text LINE_BREAK+
  //  | COLOR any_text LINE_BREAK+
  //  | 'stroke' any_text LINE_BREAK+
  //  | 'strokeWidth' any_text LINE_BREAK+
  //  | 'fontSize' any_text LINE_BREAK+
  //  | 'border' ('solid' | 'dashed' | 'dotted') LINE_BREAK+
  //  | 'opacity' any_text LINE_BREAK+
  //  | 'metadata' ('true' | 'false') LINE_BREAK+
  //  | properties_statement
  // )* closing_block
  public static boolean element_style(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "element_style")) return false;
    if (!nextTokenIs(b, ELEMENT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ELEMENT);
    r = r && tag(b, l + 1);
    r = r && opening_block(b, l + 1);
    r = r && element_style_3(b, l + 1);
    r = r && closing_block(b, l + 1);
    exit_section_(b, m, ELEMENT_STYLE, r);
    return r;
  }

  // ( 'shape' shape
  //  | 'icon' any_text LINE_BREAK+
  //  | 'width' any_text LINE_BREAK+
  //  | 'height' any_text LINE_BREAK+
  //  | 'background' any_text LINE_BREAK+
  //  | COLOR any_text LINE_BREAK+
  //  | 'stroke' any_text LINE_BREAK+
  //  | 'strokeWidth' any_text LINE_BREAK+
  //  | 'fontSize' any_text LINE_BREAK+
  //  | 'border' ('solid' | 'dashed' | 'dotted') LINE_BREAK+
  //  | 'opacity' any_text LINE_BREAK+
  //  | 'metadata' ('true' | 'false') LINE_BREAK+
  //  | properties_statement
  // )*
  private static boolean element_style_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "element_style_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!element_style_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "element_style_3", c)) break;
    }
    return true;
  }

  // 'shape' shape
  //  | 'icon' any_text LINE_BREAK+
  //  | 'width' any_text LINE_BREAK+
  //  | 'height' any_text LINE_BREAK+
  //  | 'background' any_text LINE_BREAK+
  //  | COLOR any_text LINE_BREAK+
  //  | 'stroke' any_text LINE_BREAK+
  //  | 'strokeWidth' any_text LINE_BREAK+
  //  | 'fontSize' any_text LINE_BREAK+
  //  | 'border' ('solid' | 'dashed' | 'dotted') LINE_BREAK+
  //  | 'opacity' any_text LINE_BREAK+
  //  | 'metadata' ('true' | 'false') LINE_BREAK+
  //  | properties_statement
  private static boolean element_style_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "element_style_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = element_style_3_0_0(b, l + 1);
    if (!r) r = element_style_3_0_1(b, l + 1);
    if (!r) r = element_style_3_0_2(b, l + 1);
    if (!r) r = element_style_3_0_3(b, l + 1);
    if (!r) r = element_style_3_0_4(b, l + 1);
    if (!r) r = element_style_3_0_5(b, l + 1);
    if (!r) r = element_style_3_0_6(b, l + 1);
    if (!r) r = element_style_3_0_7(b, l + 1);
    if (!r) r = element_style_3_0_8(b, l + 1);
    if (!r) r = element_style_3_0_9(b, l + 1);
    if (!r) r = element_style_3_0_10(b, l + 1);
    if (!r) r = element_style_3_0_11(b, l + 1);
    if (!r) r = properties_statement(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'shape' shape
  private static boolean element_style_3_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "element_style_3_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SHAPE);
    r = r && shape(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'icon' any_text LINE_BREAK+
  private static boolean element_style_3_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "element_style_3_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ICON);
    r = r && any_text(b, l + 1);
    r = r && element_style_3_0_1_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // LINE_BREAK+
  private static boolean element_style_3_0_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "element_style_3_0_1_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LINE_BREAK);
    while (r) {
      int c = current_position_(b);
      if (!consumeToken(b, LINE_BREAK)) break;
      if (!empty_element_parsed_guard_(b, "element_style_3_0_1_2", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // 'width' any_text LINE_BREAK+
  private static boolean element_style_3_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "element_style_3_0_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, WIDTH);
    r = r && any_text(b, l + 1);
    r = r && element_style_3_0_2_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // LINE_BREAK+
  private static boolean element_style_3_0_2_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "element_style_3_0_2_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LINE_BREAK);
    while (r) {
      int c = current_position_(b);
      if (!consumeToken(b, LINE_BREAK)) break;
      if (!empty_element_parsed_guard_(b, "element_style_3_0_2_2", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // 'height' any_text LINE_BREAK+
  private static boolean element_style_3_0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "element_style_3_0_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, HEIGHT);
    r = r && any_text(b, l + 1);
    r = r && element_style_3_0_3_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // LINE_BREAK+
  private static boolean element_style_3_0_3_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "element_style_3_0_3_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LINE_BREAK);
    while (r) {
      int c = current_position_(b);
      if (!consumeToken(b, LINE_BREAK)) break;
      if (!empty_element_parsed_guard_(b, "element_style_3_0_3_2", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // 'background' any_text LINE_BREAK+
  private static boolean element_style_3_0_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "element_style_3_0_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, BACKGROUND);
    r = r && any_text(b, l + 1);
    r = r && element_style_3_0_4_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // LINE_BREAK+
  private static boolean element_style_3_0_4_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "element_style_3_0_4_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LINE_BREAK);
    while (r) {
      int c = current_position_(b);
      if (!consumeToken(b, LINE_BREAK)) break;
      if (!empty_element_parsed_guard_(b, "element_style_3_0_4_2", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // COLOR any_text LINE_BREAK+
  private static boolean element_style_3_0_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "element_style_3_0_5")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COLOR);
    r = r && any_text(b, l + 1);
    r = r && element_style_3_0_5_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // LINE_BREAK+
  private static boolean element_style_3_0_5_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "element_style_3_0_5_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LINE_BREAK);
    while (r) {
      int c = current_position_(b);
      if (!consumeToken(b, LINE_BREAK)) break;
      if (!empty_element_parsed_guard_(b, "element_style_3_0_5_2", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // 'stroke' any_text LINE_BREAK+
  private static boolean element_style_3_0_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "element_style_3_0_6")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, STROKE);
    r = r && any_text(b, l + 1);
    r = r && element_style_3_0_6_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // LINE_BREAK+
  private static boolean element_style_3_0_6_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "element_style_3_0_6_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LINE_BREAK);
    while (r) {
      int c = current_position_(b);
      if (!consumeToken(b, LINE_BREAK)) break;
      if (!empty_element_parsed_guard_(b, "element_style_3_0_6_2", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // 'strokeWidth' any_text LINE_BREAK+
  private static boolean element_style_3_0_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "element_style_3_0_7")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, STROKE_WIDTH);
    r = r && any_text(b, l + 1);
    r = r && element_style_3_0_7_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // LINE_BREAK+
  private static boolean element_style_3_0_7_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "element_style_3_0_7_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LINE_BREAK);
    while (r) {
      int c = current_position_(b);
      if (!consumeToken(b, LINE_BREAK)) break;
      if (!empty_element_parsed_guard_(b, "element_style_3_0_7_2", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // 'fontSize' any_text LINE_BREAK+
  private static boolean element_style_3_0_8(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "element_style_3_0_8")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, FONT_SIZE);
    r = r && any_text(b, l + 1);
    r = r && element_style_3_0_8_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // LINE_BREAK+
  private static boolean element_style_3_0_8_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "element_style_3_0_8_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LINE_BREAK);
    while (r) {
      int c = current_position_(b);
      if (!consumeToken(b, LINE_BREAK)) break;
      if (!empty_element_parsed_guard_(b, "element_style_3_0_8_2", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // 'border' ('solid' | 'dashed' | 'dotted') LINE_BREAK+
  private static boolean element_style_3_0_9(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "element_style_3_0_9")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, BORDER);
    r = r && element_style_3_0_9_1(b, l + 1);
    r = r && element_style_3_0_9_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'solid' | 'dashed' | 'dotted'
  private static boolean element_style_3_0_9_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "element_style_3_0_9_1")) return false;
    boolean r;
    r = consumeToken(b, SOLID);
    if (!r) r = consumeToken(b, DASHED);
    if (!r) r = consumeToken(b, DOTTED);
    return r;
  }

  // LINE_BREAK+
  private static boolean element_style_3_0_9_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "element_style_3_0_9_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LINE_BREAK);
    while (r) {
      int c = current_position_(b);
      if (!consumeToken(b, LINE_BREAK)) break;
      if (!empty_element_parsed_guard_(b, "element_style_3_0_9_2", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // 'opacity' any_text LINE_BREAK+
  private static boolean element_style_3_0_10(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "element_style_3_0_10")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OPACITY);
    r = r && any_text(b, l + 1);
    r = r && element_style_3_0_10_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // LINE_BREAK+
  private static boolean element_style_3_0_10_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "element_style_3_0_10_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LINE_BREAK);
    while (r) {
      int c = current_position_(b);
      if (!consumeToken(b, LINE_BREAK)) break;
      if (!empty_element_parsed_guard_(b, "element_style_3_0_10_2", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // 'metadata' ('true' | 'false') LINE_BREAK+
  private static boolean element_style_3_0_11(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "element_style_3_0_11")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, METADATA);
    r = r && element_style_3_0_11_1(b, l + 1);
    r = r && element_style_3_0_11_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'true' | 'false'
  private static boolean element_style_3_0_11_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "element_style_3_0_11_1")) return false;
    boolean r;
    r = consumeToken(b, TRUE);
    if (!r) r = consumeToken(b, FALSE);
    return r;
  }

  // LINE_BREAK+
  private static boolean element_style_3_0_11_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "element_style_3_0_11_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LINE_BREAK);
    while (r) {
      int c = current_position_(b);
      if (!consumeToken(b, LINE_BREAK)) break;
      if (!empty_element_parsed_guard_(b, "element_style_3_0_11_2", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'exclude' (id | any_text)+ LINE_BREAK+
  public static boolean exclude_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exclude_statement")) return false;
    if (!nextTokenIs(b, EXCLUDE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, EXCLUDE);
    r = r && exclude_statement_1(b, l + 1);
    r = r && exclude_statement_2(b, l + 1);
    exit_section_(b, m, EXCLUDE_STATEMENT, r);
    return r;
  }

  // (id | any_text)+
  private static boolean exclude_statement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exclude_statement_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = exclude_statement_1_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!exclude_statement_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "exclude_statement_1", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // id | any_text
  private static boolean exclude_statement_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exclude_statement_1_0")) return false;
    boolean r;
    r = id(b, l + 1);
    if (!r) r = any_text(b, l + 1);
    return r;
  }

  // LINE_BREAK+
  private static boolean exclude_statement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exclude_statement_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LINE_BREAK);
    while (r) {
      int c = current_position_(b);
      if (!consumeToken(b, LINE_BREAK)) break;
      if (!empty_element_parsed_guard_(b, "exclude_statement_2", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // opening_block (default_statement | title_statement | description_statement | properties_statement)* closing_block
  public static boolean filtered_view_block(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "filtered_view_block")) return false;
    if (!nextTokenIs(b, OPEN_PARENS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = opening_block(b, l + 1);
    r = r && filtered_view_block_1(b, l + 1);
    r = r && closing_block(b, l + 1);
    exit_section_(b, m, FILTERED_VIEW_BLOCK, r);
    return r;
  }

  // (default_statement | title_statement | description_statement | properties_statement)*
  private static boolean filtered_view_block_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "filtered_view_block_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!filtered_view_block_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "filtered_view_block_1", c)) break;
    }
    return true;
  }

  // default_statement | title_statement | description_statement | properties_statement
  private static boolean filtered_view_block_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "filtered_view_block_1_0")) return false;
    boolean r;
    r = default_statement(b, l + 1);
    if (!r) r = title_statement(b, l + 1);
    if (!r) r = description_statement(b, l + 1);
    if (!r) r = properties_statement(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // 'filtered' view_key ('include' | 'exclude') tag view_key? a_description? (filtered_view_block | LINE_BREAK+)
  public static boolean filtered_view_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "filtered_view_statement")) return false;
    if (!nextTokenIs(b, FILTERED)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, FILTERED);
    r = r && view_key(b, l + 1);
    r = r && filtered_view_statement_2(b, l + 1);
    r = r && tag(b, l + 1);
    r = r && filtered_view_statement_4(b, l + 1);
    r = r && filtered_view_statement_5(b, l + 1);
    r = r && filtered_view_statement_6(b, l + 1);
    exit_section_(b, m, FILTERED_VIEW_STATEMENT, r);
    return r;
  }

  // 'include' | 'exclude'
  private static boolean filtered_view_statement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "filtered_view_statement_2")) return false;
    boolean r;
    r = consumeToken(b, INCLUDE);
    if (!r) r = consumeToken(b, EXCLUDE);
    return r;
  }

  // view_key?
  private static boolean filtered_view_statement_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "filtered_view_statement_4")) return false;
    view_key(b, l + 1);
    return true;
  }

  // a_description?
  private static boolean filtered_view_statement_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "filtered_view_statement_5")) return false;
    a_description(b, l + 1);
    return true;
  }

  // filtered_view_block | LINE_BREAK+
  private static boolean filtered_view_statement_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "filtered_view_statement_6")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = filtered_view_block(b, l + 1);
    if (!r) r = filtered_view_statement_6_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // LINE_BREAK+
  private static boolean filtered_view_statement_6_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "filtered_view_statement_6_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LINE_BREAK);
    while (r) {
      int c = current_position_(b);
      if (!consumeToken(b, LINE_BREAK)) break;
      if (!empty_element_parsed_guard_(b, "filtered_view_statement_6_1", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // "group" any_text opening_block <<level_statements>>* closing_block
  public static boolean group_statements(PsiBuilder b, int l, Parser _level_statements) {
    if (!recursion_guard_(b, l, "group_statements")) return false;
    if (!nextTokenIs(b, GROUP)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, GROUP);
    r = r && any_text(b, l + 1);
    r = r && opening_block(b, l + 1);
    r = r && group_statements_3(b, l + 1, _level_statements);
    r = r && closing_block(b, l + 1);
    exit_section_(b, m, GROUP_STATEMENTS, r);
    return r;
  }

  // <<level_statements>>*
  private static boolean group_statements_3(PsiBuilder b, int l, Parser _level_statements) {
    if (!recursion_guard_(b, l, "group_statements_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!_level_statements.parse(b, l)) break;
      if (!empty_element_parsed_guard_(b, "group_statements_3", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // 'healthCheck' a_name any_text any_text? any_text?
  public static boolean health_check_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "health_check_statement")) return false;
    if (!nextTokenIs(b, HEALTH_CHECK)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, HEALTH_CHECK);
    r = r && a_name(b, l + 1);
    r = r && any_text(b, l + 1);
    r = r && health_check_statement_3(b, l + 1);
    r = r && health_check_statement_4(b, l + 1);
    exit_section_(b, m, HEALTH_CHECK_STATEMENT, r);
    return r;
  }

  // any_text?
  private static boolean health_check_statement_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "health_check_statement_3")) return false;
    any_text(b, l + 1);
    return true;
  }

  // any_text?
  private static boolean health_check_statement_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "health_check_statement_4")) return false;
    any_text(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // any_text
  public static boolean id(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "id")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ID, "<id>");
    r = any_text(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // "!identifiers" ("hierarchical" | "flat") LINE_BREAK+
  public static boolean identifiers_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "identifiers_statement")) return false;
    if (!nextTokenIs(b, IDENTIFIERS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIERS);
    r = r && identifiers_statement_1(b, l + 1);
    r = r && identifiers_statement_2(b, l + 1);
    exit_section_(b, m, IDENTIFIERS_STATEMENT, r);
    return r;
  }

  // "hierarchical" | "flat"
  private static boolean identifiers_statement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "identifiers_statement_1")) return false;
    boolean r;
    r = consumeToken(b, HIERARCHICAL);
    if (!r) r = consumeToken(b, FLAT);
    return r;
  }

  // LINE_BREAK+
  private static boolean identifiers_statement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "identifiers_statement_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LINE_BREAK);
    while (r) {
      int c = current_position_(b);
      if (!consumeToken(b, LINE_BREAK)) break;
      if (!empty_element_parsed_guard_(b, "identifiers_statement_2", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // opening_block image_view_block_statement* closing_block
  public static boolean image_view_block(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "image_view_block")) return false;
    if (!nextTokenIs(b, OPEN_PARENS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = opening_block(b, l + 1);
    r = r && image_view_block_1(b, l + 1);
    r = r && closing_block(b, l + 1);
    exit_section_(b, m, IMAGE_VIEW_BLOCK, r);
    return r;
  }

  // image_view_block_statement*
  private static boolean image_view_block_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "image_view_block_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!image_view_block_statement(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "image_view_block_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // 'plantuml' any_text
  //  | 'mermaid' any_text
  //  | 'kroki' any_text
  //  | 'image' any_text
  //  | default_statement
  //  | title_statement
  //  | description_statement
  //  | properties_statement
  static boolean image_view_block_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "image_view_block_statement")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = image_view_block_statement_0(b, l + 1);
    if (!r) r = image_view_block_statement_1(b, l + 1);
    if (!r) r = image_view_block_statement_2(b, l + 1);
    if (!r) r = image_view_block_statement_3(b, l + 1);
    if (!r) r = default_statement(b, l + 1);
    if (!r) r = title_statement(b, l + 1);
    if (!r) r = description_statement(b, l + 1);
    if (!r) r = properties_statement(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'plantuml' any_text
  private static boolean image_view_block_statement_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "image_view_block_statement_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PLANTUML);
    r = r && any_text(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'mermaid' any_text
  private static boolean image_view_block_statement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "image_view_block_statement_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, MERMAID);
    r = r && any_text(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'kroki' any_text
  private static boolean image_view_block_statement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "image_view_block_statement_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KROKI);
    r = r && any_text(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'image' any_text
  private static boolean image_view_block_statement_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "image_view_block_statement_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IMAGE);
    r = r && any_text(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'image' ('*' | id) view_key? (image_view_block | LINE_BREAK+)
  public static boolean image_view_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "image_view_statement")) return false;
    if (!nextTokenIs(b, IMAGE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IMAGE);
    r = r && image_view_statement_1(b, l + 1);
    r = r && image_view_statement_2(b, l + 1);
    r = r && image_view_statement_3(b, l + 1);
    exit_section_(b, m, IMAGE_VIEW_STATEMENT, r);
    return r;
  }

  // '*' | id
  private static boolean image_view_statement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "image_view_statement_1")) return false;
    boolean r;
    r = consumeToken(b, STAR);
    if (!r) r = id(b, l + 1);
    return r;
  }

  // view_key?
  private static boolean image_view_statement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "image_view_statement_2")) return false;
    view_key(b, l + 1);
    return true;
  }

  // image_view_block | LINE_BREAK+
  private static boolean image_view_statement_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "image_view_statement_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = image_view_block(b, l + 1);
    if (!r) r = image_view_statement_3_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // LINE_BREAK+
  private static boolean image_view_statement_3_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "image_view_statement_3_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LINE_BREAK);
    while (r) {
      int c = current_position_(b);
      if (!consumeToken(b, LINE_BREAK)) break;
      if (!empty_element_parsed_guard_(b, "image_view_statement_3_1", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'include' ('*' | id | any_text)+ LINE_BREAK+
  public static boolean include_element_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "include_element_statement")) return false;
    if (!nextTokenIs(b, INCLUDE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, INCLUDE);
    r = r && include_element_statement_1(b, l + 1);
    r = r && include_element_statement_2(b, l + 1);
    exit_section_(b, m, INCLUDE_ELEMENT_STATEMENT, r);
    return r;
  }

  // ('*' | id | any_text)+
  private static boolean include_element_statement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "include_element_statement_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = include_element_statement_1_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!include_element_statement_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "include_element_statement_1", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // '*' | id | any_text
  private static boolean include_element_statement_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "include_element_statement_1_0")) return false;
    boolean r;
    r = consumeToken(b, STAR);
    if (!r) r = id(b, l + 1);
    if (!r) r = any_text(b, l + 1);
    return r;
  }

  // LINE_BREAK+
  private static boolean include_element_statement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "include_element_statement_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LINE_BREAK);
    while (r) {
      int c = current_position_(b);
      if (!consumeToken(b, LINE_BREAK)) break;
      if (!empty_element_parsed_guard_(b, "include_element_statement_2", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'include' (id | any_text)+ LINE_BREAK+
  public static boolean include_relationship_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "include_relationship_statement")) return false;
    if (!nextTokenIs(b, INCLUDE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, INCLUDE);
    r = r && include_relationship_statement_1(b, l + 1);
    r = r && include_relationship_statement_2(b, l + 1);
    exit_section_(b, m, INCLUDE_RELATIONSHIP_STATEMENT, r);
    return r;
  }

  // (id | any_text)+
  private static boolean include_relationship_statement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "include_relationship_statement_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = include_relationship_statement_1_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!include_relationship_statement_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "include_relationship_statement_1", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // id | any_text
  private static boolean include_relationship_statement_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "include_relationship_statement_1_0")) return false;
    boolean r;
    r = id(b, l + 1);
    if (!r) r = any_text(b, l + 1);
    return r;
  }

  // LINE_BREAK+
  private static boolean include_relationship_statement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "include_relationship_statement_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LINE_BREAK);
    while (r) {
      int c = current_position_(b);
      if (!consumeToken(b, LINE_BREAK)) break;
      if (!empty_element_parsed_guard_(b, "include_relationship_statement_2", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // include_element_statement | include_relationship_statement
  public static boolean include_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "include_statement")) return false;
    if (!nextTokenIs(b, INCLUDE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = include_element_statement(b, l + 1);
    if (!r) r = include_relationship_statement(b, l + 1);
    exit_section_(b, m, INCLUDE_STATEMENT, r);
    return r;
  }

  /* ********************************************************** */
  // opening_block infrastructure_node_block_statement* closing_block
  public static boolean infrastructure_node_block(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "infrastructure_node_block")) return false;
    if (!nextTokenIs(b, OPEN_PARENS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = opening_block(b, l + 1);
    r = r && infrastructure_node_block_1(b, l + 1);
    r = r && closing_block(b, l + 1);
    exit_section_(b, m, INFRASTRUCTURE_NODE_BLOCK, r);
    return r;
  }

  // infrastructure_node_block_statement*
  private static boolean infrastructure_node_block_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "infrastructure_node_block_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!infrastructure_node_block_statement(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "infrastructure_node_block_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // relation_statement
  //  | description_statement
  //  | technology_statement
  //  | tags_statement
  //  | url_statement
  //  | properties_statement
  //  | perspectives_statement
  static boolean infrastructure_node_block_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "infrastructure_node_block_statement")) return false;
    boolean r;
    r = relation_statement(b, l + 1);
    if (!r) r = description_statement(b, l + 1);
    if (!r) r = technology_statement(b, l + 1);
    if (!r) r = tags_statement(b, l + 1);
    if (!r) r = url_statement(b, l + 1);
    if (!r) r = properties_statement(b, l + 1);
    if (!r) r = perspectives_statement(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // 'infrastructureNode' a_name a_description? any_text? tag? (infrastructure_node_block | LINE_BREAK+)
  public static boolean infrastructure_node_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "infrastructure_node_statement")) return false;
    if (!nextTokenIs(b, INFRASTRUCTURE_NODE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, INFRASTRUCTURE_NODE);
    r = r && a_name(b, l + 1);
    r = r && infrastructure_node_statement_2(b, l + 1);
    r = r && infrastructure_node_statement_3(b, l + 1);
    r = r && infrastructure_node_statement_4(b, l + 1);
    r = r && infrastructure_node_statement_5(b, l + 1);
    exit_section_(b, m, INFRASTRUCTURE_NODE_STATEMENT, r);
    return r;
  }

  // a_description?
  private static boolean infrastructure_node_statement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "infrastructure_node_statement_2")) return false;
    a_description(b, l + 1);
    return true;
  }

  // any_text?
  private static boolean infrastructure_node_statement_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "infrastructure_node_statement_3")) return false;
    any_text(b, l + 1);
    return true;
  }

  // tag?
  private static boolean infrastructure_node_statement_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "infrastructure_node_statement_4")) return false;
    tag(b, l + 1);
    return true;
  }

  // infrastructure_node_block | LINE_BREAK+
  private static boolean infrastructure_node_statement_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "infrastructure_node_statement_5")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = infrastructure_node_block(b, l + 1);
    if (!r) r = infrastructure_node_statement_5_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // LINE_BREAK+
  private static boolean infrastructure_node_statement_5_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "infrastructure_node_statement_5_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LINE_BREAK);
    while (r) {
      int c = current_position_(b);
      if (!consumeToken(b, LINE_BREAK)) break;
      if (!empty_element_parsed_guard_(b, "infrastructure_node_statement_5_1", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'instances' any_text LINE_BREAK+
  public static boolean instances_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "instances_statement")) return false;
    if (!nextTokenIs(b, INSTANCES)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, INSTANCES);
    r = r && any_text(b, l + 1);
    r = r && instances_statement_2(b, l + 1);
    exit_section_(b, m, INSTANCES_STATEMENT, r);
    return r;
  }

  // LINE_BREAK+
  private static boolean instances_statement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "instances_statement_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LINE_BREAK);
    while (r) {
      int c = current_position_(b);
      if (!consumeToken(b, LINE_BREAK)) break;
      if (!empty_element_parsed_guard_(b, "instances_statement_2", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ('this' | id) ?
  public static boolean lhs_relation_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "lhs_relation_statement")) return false;
    Marker m = enter_section_(b, l, _NONE_, LHS_RELATION_STATEMENT, "<lhs relation statement>");
    lhs_relation_statement_0(b, l + 1);
    exit_section_(b, l, m, true, false, null);
    return true;
  }

  // 'this' | id
  private static boolean lhs_relation_statement_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "lhs_relation_statement_0")) return false;
    boolean r;
    r = consumeToken(b, THIS);
    if (!r) r = id(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // person_statement
  //  | software_system_statement
  //  | identifiers_statement
  //  | element_statement
  //  | deployment_environment_statement
  //  | <<group_statements model_block_statement>>
  static boolean model_block_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "model_block_statement")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = person_statement(b, l + 1);
    if (!r) r = software_system_statement(b, l + 1);
    if (!r) r = identifiers_statement(b, l + 1);
    if (!r) r = element_statement(b, l + 1);
    if (!r) r = deployment_environment_statement(b, l + 1);
    if (!r) r = group_statements(b, l + 1, StructurizrDslParser::model_block_statement);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // "model" opening_block model_block_statement* closing_block
  public static boolean model_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "model_statement")) return false;
    if (!nextTokenIs(b, MODEL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, MODEL);
    r = r && opening_block(b, l + 1);
    r = r && model_statement_2(b, l + 1);
    r = r && closing_block(b, l + 1);
    exit_section_(b, m, MODEL_STATEMENT, r);
    return r;
  }

  // model_block_statement*
  private static boolean model_statement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "model_statement_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!model_block_statement(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "model_statement_2", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // "name" any_text LINE_BREAK+
  public static boolean name_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "name_statement")) return false;
    if (!nextTokenIs(b, NAME)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, NAME);
    r = r && any_text(b, l + 1);
    r = r && name_statement_2(b, l + 1);
    exit_section_(b, m, NAME_STATEMENT, r);
    return r;
  }

  // LINE_BREAK+
  private static boolean name_statement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "name_statement_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LINE_BREAK);
    while (r) {
      int c = current_position_(b);
      if (!consumeToken(b, LINE_BREAK)) break;
      if (!empty_element_parsed_guard_(b, "name_statement_2", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // "{" LINE_BREAK+
  public static boolean opening_block(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "opening_block")) return false;
    if (!nextTokenIs(b, OPEN_PARENS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OPEN_PARENS);
    r = r && opening_block_1(b, l + 1);
    exit_section_(b, m, OPENING_BLOCK, r);
    return r;
  }

  // LINE_BREAK+
  private static boolean opening_block_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "opening_block_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LINE_BREAK);
    while (r) {
      int c = current_position_(b);
      if (!consumeToken(b, LINE_BREAK)) break;
      if (!empty_element_parsed_guard_(b, "opening_block_1", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // opening_block person_block_statement* closing_block
  public static boolean person_block(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "person_block")) return false;
    if (!nextTokenIs(b, OPEN_PARENS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = opening_block(b, l + 1);
    r = r && person_block_1(b, l + 1);
    r = r && closing_block(b, l + 1);
    exit_section_(b, m, PERSON_BLOCK, r);
    return r;
  }

  // person_block_statement*
  private static boolean person_block_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "person_block_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!person_block_statement(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "person_block_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // description_statement
  //  | tags_statement
  //  | url_statement
  //  | properties_statement
  //  | perspectives_statement
  //  | relation_statement
  static boolean person_block_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "person_block_statement")) return false;
    boolean r;
    r = description_statement(b, l + 1);
    if (!r) r = tags_statement(b, l + 1);
    if (!r) r = url_statement(b, l + 1);
    if (!r) r = properties_statement(b, l + 1);
    if (!r) r = perspectives_statement(b, l + 1);
    if (!r) r = relation_statement(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // <<taggable_element_definition "person">> (person_block | LINE_BREAK+)
  public static boolean person_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "person_statement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PERSON_STATEMENT, "<person statement>");
    r = taggable_element_definition(b, l + 1, PERSON_parser_);
    r = r && person_statement_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // person_block | LINE_BREAK+
  private static boolean person_statement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "person_statement_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = person_block(b, l + 1);
    if (!r) r = person_statement_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // LINE_BREAK+
  private static boolean person_statement_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "person_statement_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LINE_BREAK);
    while (r) {
      int c = current_position_(b);
      if (!consumeToken(b, LINE_BREAK)) break;
      if (!empty_element_parsed_guard_(b, "person_statement_1_1", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // any_text any_text any_text? LINE_BREAK+
  public static boolean perspective_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "perspective_statement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PERSPECTIVE_STATEMENT, "<perspective statement>");
    r = any_text(b, l + 1);
    r = r && any_text(b, l + 1);
    r = r && perspective_statement_2(b, l + 1);
    r = r && perspective_statement_3(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // any_text?
  private static boolean perspective_statement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "perspective_statement_2")) return false;
    any_text(b, l + 1);
    return true;
  }

  // LINE_BREAK+
  private static boolean perspective_statement_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "perspective_statement_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LINE_BREAK);
    while (r) {
      int c = current_position_(b);
      if (!consumeToken(b, LINE_BREAK)) break;
      if (!empty_element_parsed_guard_(b, "perspective_statement_3", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // "perspectives" opening_block perspective_statement* closing_block
  public static boolean perspectives_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "perspectives_statement")) return false;
    if (!nextTokenIs(b, PERSPECTIVES)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PERSPECTIVES);
    r = r && opening_block(b, l + 1);
    r = r && perspectives_statement_2(b, l + 1);
    r = r && closing_block(b, l + 1);
    exit_section_(b, m, PERSPECTIVES_STATEMENT, r);
    return r;
  }

  // perspective_statement*
  private static boolean perspectives_statement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "perspectives_statement_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!perspective_statement(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "perspectives_statement_2", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // "properties" opening_block property_statement* closing_block
  public static boolean properties_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "properties_statement")) return false;
    if (!nextTokenIs(b, PROPERTIES)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PROPERTIES);
    r = r && opening_block(b, l + 1);
    r = r && properties_statement_2(b, l + 1);
    r = r && closing_block(b, l + 1);
    exit_section_(b, m, PROPERTIES_STATEMENT, r);
    return r;
  }

  // property_statement*
  private static boolean properties_statement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "properties_statement_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!property_statement(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "properties_statement_2", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // any_text any_text LINE_BREAK+
  public static boolean property_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "property_statement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PROPERTY_STATEMENT, "<property statement>");
    r = any_text(b, l + 1);
    r = r && any_text(b, l + 1);
    r = r && property_statement_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // LINE_BREAK+
  private static boolean property_statement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "property_statement_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LINE_BREAK);
    while (r) {
      int c = current_position_(b);
      if (!consumeToken(b, LINE_BREAK)) break;
      if (!empty_element_parsed_guard_(b, "property_statement_2", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // opening_block relation_block_statements* closing_block
  public static boolean relation_block(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "relation_block")) return false;
    if (!nextTokenIs(b, OPEN_PARENS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = opening_block(b, l + 1);
    r = r && relation_block_1(b, l + 1);
    r = r && closing_block(b, l + 1);
    exit_section_(b, m, RELATION_BLOCK, r);
    return r;
  }

  // relation_block_statements*
  private static boolean relation_block_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "relation_block_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!relation_block_statements(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "relation_block_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // tags_statement | url_statement | properties_statement | perspective_statement
  static boolean relation_block_statements(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "relation_block_statements")) return false;
    boolean r;
    r = tags_statement(b, l + 1);
    if (!r) r = url_statement(b, l + 1);
    if (!r) r = properties_statement(b, l + 1);
    if (!r) r = perspective_statement(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // lhs_relation_statement '->' rhs_relation_statement (relation_block | LINE_BREAK+)
  public static boolean relation_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "relation_statement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, RELATION_STATEMENT, "<relation statement>");
    r = lhs_relation_statement(b, l + 1);
    r = r && consumeToken(b, RELATION_ARROW);
    r = r && rhs_relation_statement(b, l + 1);
    r = r && relation_statement_3(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // relation_block | LINE_BREAK+
  private static boolean relation_statement_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "relation_statement_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = relation_block(b, l + 1);
    if (!r) r = relation_statement_3_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // LINE_BREAK+
  private static boolean relation_statement_3_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "relation_statement_3_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LINE_BREAK);
    while (r) {
      int c = current_position_(b);
      if (!consumeToken(b, LINE_BREAK)) break;
      if (!empty_element_parsed_guard_(b, "relation_statement_3_1", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'relationship'
  public static boolean relationship_style(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "relationship_style")) return false;
    if (!nextTokenIs(b, RELATIONSHIP)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, RELATIONSHIP);
    exit_section_(b, m, RELATIONSHIP_STYLE, r);
    return r;
  }

  /* ********************************************************** */
  // ('this' | id) a_description? any_text? tag?
  public static boolean rhs_relation_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rhs_relation_statement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, RHS_RELATION_STATEMENT, "<rhs relation statement>");
    r = rhs_relation_statement_0(b, l + 1);
    r = r && rhs_relation_statement_1(b, l + 1);
    r = r && rhs_relation_statement_2(b, l + 1);
    r = r && rhs_relation_statement_3(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // 'this' | id
  private static boolean rhs_relation_statement_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rhs_relation_statement_0")) return false;
    boolean r;
    r = consumeToken(b, THIS);
    if (!r) r = id(b, l + 1);
    return r;
  }

  // a_description?
  private static boolean rhs_relation_statement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rhs_relation_statement_1")) return false;
    a_description(b, l + 1);
    return true;
  }

  // any_text?
  private static boolean rhs_relation_statement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rhs_relation_statement_2")) return false;
    any_text(b, l + 1);
    return true;
  }

  // tag?
  private static boolean rhs_relation_statement_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rhs_relation_statement_3")) return false;
    tag(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // 'Box'|'RoundedBox'|'Circle'|'Ellipse'|'Hexagon'|'Cylinder'|'Pipe'|'Person'|'Robot'|'Folder'|'WebBrowser'|'MobileDevicePortrait'|'MobileDeviceLandscape'|'Component'
  static boolean shape(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "shape")) return false;
    boolean r;
    r = consumeToken(b, BOX);
    if (!r) r = consumeToken(b, ROUNDED_BOX);
    if (!r) r = consumeToken(b, CIRCLE);
    if (!r) r = consumeToken(b, ELLIPSE);
    if (!r) r = consumeToken(b, HEXAGON);
    if (!r) r = consumeToken(b, CYLINDER);
    if (!r) r = consumeToken(b, PIPE);
    if (!r) r = consumeToken(b, PERSON_SHAPE);
    if (!r) r = consumeToken(b, ROBOT);
    if (!r) r = consumeToken(b, FOLDER);
    if (!r) r = consumeToken(b, WEB_BROWSER);
    if (!r) r = consumeToken(b, MOBILE_DEVICE_PORTRAIT);
    if (!r) r = consumeToken(b, MOBILE_DEVICE_LANDSCAPE);
    if (!r) r = consumeToken(b, COMPONENT_SHAPE);
    return r;
  }

  /* ********************************************************** */
  // opening_block software_system_block_statement* closing_block
  public static boolean software_system_block(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "software_system_block")) return false;
    if (!nextTokenIs(b, OPEN_PARENS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = opening_block(b, l + 1);
    r = r && software_system_block_1(b, l + 1);
    r = r && closing_block(b, l + 1);
    exit_section_(b, m, SOFTWARE_SYSTEM_BLOCK, r);
    return r;
  }

  // software_system_block_statement*
  private static boolean software_system_block_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "software_system_block_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!software_system_block_statement(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "software_system_block_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // container_statement
  //  | docs_statement
  //  | adrs_statement
  //  | <<group_statements software_system_block_statement>>
  //  | description_statement
  //  | tags_statement
  //  | url_statement
  //  | properties_statement
  //  | perspectives_statement
  //  | relation_statement
  static boolean software_system_block_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "software_system_block_statement")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = container_statement(b, l + 1);
    if (!r) r = docs_statement(b, l + 1);
    if (!r) r = adrs_statement(b, l + 1);
    if (!r) r = group_statements(b, l + 1, StructurizrDslParser::software_system_block_statement);
    if (!r) r = description_statement(b, l + 1);
    if (!r) r = tags_statement(b, l + 1);
    if (!r) r = url_statement(b, l + 1);
    if (!r) r = properties_statement(b, l + 1);
    if (!r) r = perspectives_statement(b, l + 1);
    if (!r) r = relation_statement(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // opening_block software_system_instance_block_statement* closing_block
  public static boolean software_system_instance_block(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "software_system_instance_block")) return false;
    if (!nextTokenIs(b, OPEN_PARENS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = opening_block(b, l + 1);
    r = r && software_system_instance_block_1(b, l + 1);
    r = r && closing_block(b, l + 1);
    exit_section_(b, m, SOFTWARE_SYSTEM_INSTANCE_BLOCK, r);
    return r;
  }

  // software_system_instance_block_statement*
  private static boolean software_system_instance_block_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "software_system_instance_block_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!software_system_instance_block_statement(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "software_system_instance_block_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // relation_statement
  //  | description_statement
  //  | tags_statement
  //  | url_statement
  //  | properties_statement
  //  | perspectives_statement
  //  | health_check_statement
  static boolean software_system_instance_block_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "software_system_instance_block_statement")) return false;
    boolean r;
    r = relation_statement(b, l + 1);
    if (!r) r = description_statement(b, l + 1);
    if (!r) r = tags_statement(b, l + 1);
    if (!r) r = url_statement(b, l + 1);
    if (!r) r = properties_statement(b, l + 1);
    if (!r) r = perspectives_statement(b, l + 1);
    if (!r) r = health_check_statement(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // 'softwareSystemInstance' id any_text? tag? (software_system_instance_block | LINE_BREAK+)
  public static boolean software_system_instance_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "software_system_instance_statement")) return false;
    if (!nextTokenIs(b, SOFTWARE_SYSTEM_INSTANCE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SOFTWARE_SYSTEM_INSTANCE);
    r = r && id(b, l + 1);
    r = r && software_system_instance_statement_2(b, l + 1);
    r = r && software_system_instance_statement_3(b, l + 1);
    r = r && software_system_instance_statement_4(b, l + 1);
    exit_section_(b, m, SOFTWARE_SYSTEM_INSTANCE_STATEMENT, r);
    return r;
  }

  // any_text?
  private static boolean software_system_instance_statement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "software_system_instance_statement_2")) return false;
    any_text(b, l + 1);
    return true;
  }

  // tag?
  private static boolean software_system_instance_statement_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "software_system_instance_statement_3")) return false;
    tag(b, l + 1);
    return true;
  }

  // software_system_instance_block | LINE_BREAK+
  private static boolean software_system_instance_statement_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "software_system_instance_statement_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = software_system_instance_block(b, l + 1);
    if (!r) r = software_system_instance_statement_4_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // LINE_BREAK+
  private static boolean software_system_instance_statement_4_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "software_system_instance_statement_4_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LINE_BREAK);
    while (r) {
      int c = current_position_(b);
      if (!consumeToken(b, LINE_BREAK)) break;
      if (!empty_element_parsed_guard_(b, "software_system_instance_statement_4_1", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // <<taggable_element_definition "softwareSystem" >> (software_system_block | LINE_BREAK+)
  public static boolean software_system_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "software_system_statement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SOFTWARE_SYSTEM_STATEMENT, "<software system statement>");
    r = taggable_element_definition(b, l + 1, SOFTWARE_SYSTEM_parser_);
    r = r && software_system_statement_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // software_system_block | LINE_BREAK+
  private static boolean software_system_statement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "software_system_statement_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = software_system_block(b, l + 1);
    if (!r) r = software_system_statement_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // LINE_BREAK+
  private static boolean software_system_statement_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "software_system_statement_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LINE_BREAK);
    while (r) {
      int c = current_position_(b);
      if (!consumeToken(b, LINE_BREAK)) break;
      if (!empty_element_parsed_guard_(b, "software_system_statement_1_1", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // top_level_statements*
  static boolean structurizrFile(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "structurizrFile")) return false;
    while (true) {
      int c = current_position_(b);
      if (!top_level_statements(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "structurizrFile", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // opening_block (element_style | relationship_style)* closing_block
  public static boolean styles_block(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "styles_block")) return false;
    if (!nextTokenIs(b, OPEN_PARENS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = opening_block(b, l + 1);
    r = r && styles_block_1(b, l + 1);
    r = r && closing_block(b, l + 1);
    exit_section_(b, m, STYLES_BLOCK, r);
    return r;
  }

  // (element_style | relationship_style)*
  private static boolean styles_block_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "styles_block_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!styles_block_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "styles_block_1", c)) break;
    }
    return true;
  }

  // element_style | relationship_style
  private static boolean styles_block_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "styles_block_1_0")) return false;
    boolean r;
    r = element_style(b, l + 1);
    if (!r) r = relationship_style(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // 'styles' styles_block
  public static boolean styles_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "styles_statement")) return false;
    if (!nextTokenIs(b, STYLES)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, STYLES);
    r = r && styles_block(b, l + 1);
    exit_section_(b, m, STYLES_STATEMENT, r);
    return r;
  }

  /* ********************************************************** */
  // 'systemContext' id view_key? a_description? (common_view_block | LINE_BREAK+)
  public static boolean system_context_view_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "system_context_view_statement")) return false;
    if (!nextTokenIs(b, SYSTEM_CONTEXT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SYSTEM_CONTEXT);
    r = r && id(b, l + 1);
    r = r && system_context_view_statement_2(b, l + 1);
    r = r && system_context_view_statement_3(b, l + 1);
    r = r && system_context_view_statement_4(b, l + 1);
    exit_section_(b, m, SYSTEM_CONTEXT_VIEW_STATEMENT, r);
    return r;
  }

  // view_key?
  private static boolean system_context_view_statement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "system_context_view_statement_2")) return false;
    view_key(b, l + 1);
    return true;
  }

  // a_description?
  private static boolean system_context_view_statement_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "system_context_view_statement_3")) return false;
    a_description(b, l + 1);
    return true;
  }

  // common_view_block | LINE_BREAK+
  private static boolean system_context_view_statement_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "system_context_view_statement_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = common_view_block(b, l + 1);
    if (!r) r = system_context_view_statement_4_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // LINE_BREAK+
  private static boolean system_context_view_statement_4_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "system_context_view_statement_4_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LINE_BREAK);
    while (r) {
      int c = current_position_(b);
      if (!consumeToken(b, LINE_BREAK)) break;
      if (!empty_element_parsed_guard_(b, "system_context_view_statement_4_1", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // include_statement
  //  | exclude_statement
  //  | autolayout_statement
  //  | default_statement
  //  | animation_statement
  //  | title_statement
  //  | description_statement
  //  | properties_statement
  static boolean system_landscape_view_block_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "system_landscape_view_block_statement")) return false;
    boolean r;
    r = include_statement(b, l + 1);
    if (!r) r = exclude_statement(b, l + 1);
    if (!r) r = autolayout_statement(b, l + 1);
    if (!r) r = default_statement(b, l + 1);
    if (!r) r = animation_statement(b, l + 1);
    if (!r) r = title_statement(b, l + 1);
    if (!r) r = description_statement(b, l + 1);
    if (!r) r = properties_statement(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // 'systemLandscape' view_key? a_description? (common_view_block | LINE_BREAK+)
  public static boolean system_landscape_view_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "system_landscape_view_statement")) return false;
    if (!nextTokenIs(b, SYSTEM_LANDSCAPE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SYSTEM_LANDSCAPE);
    r = r && system_landscape_view_statement_1(b, l + 1);
    r = r && system_landscape_view_statement_2(b, l + 1);
    r = r && system_landscape_view_statement_3(b, l + 1);
    exit_section_(b, m, SYSTEM_LANDSCAPE_VIEW_STATEMENT, r);
    return r;
  }

  // view_key?
  private static boolean system_landscape_view_statement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "system_landscape_view_statement_1")) return false;
    view_key(b, l + 1);
    return true;
  }

  // a_description?
  private static boolean system_landscape_view_statement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "system_landscape_view_statement_2")) return false;
    a_description(b, l + 1);
    return true;
  }

  // common_view_block | LINE_BREAK+
  private static boolean system_landscape_view_statement_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "system_landscape_view_statement_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = common_view_block(b, l + 1);
    if (!r) r = system_landscape_view_statement_3_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // LINE_BREAK+
  private static boolean system_landscape_view_statement_3_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "system_landscape_view_statement_3_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LINE_BREAK);
    while (r) {
      int c = current_position_(b);
      if (!consumeToken(b, LINE_BREAK)) break;
      if (!empty_element_parsed_guard_(b, "system_landscape_view_statement_3_1", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // any_text
  public static boolean tag(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tag")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TAG, "<tag>");
    r = any_text(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // (id "=")? <<keyword>> a_name a_description? tag?
  static boolean taggable_element_definition(PsiBuilder b, int l, Parser _keyword) {
    if (!recursion_guard_(b, l, "taggable_element_definition")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = taggable_element_definition_0(b, l + 1);
    r = r && _keyword.parse(b, l);
    r = r && a_name(b, l + 1);
    r = r && taggable_element_definition_3(b, l + 1);
    r = r && taggable_element_definition_4(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (id "=")?
  private static boolean taggable_element_definition_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "taggable_element_definition_0")) return false;
    taggable_element_definition_0_0(b, l + 1);
    return true;
  }

  // id "="
  private static boolean taggable_element_definition_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "taggable_element_definition_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = id(b, l + 1);
    r = r && consumeToken(b, EQ);
    exit_section_(b, m, null, r);
    return r;
  }

  // a_description?
  private static boolean taggable_element_definition_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "taggable_element_definition_3")) return false;
    a_description(b, l + 1);
    return true;
  }

  // tag?
  private static boolean taggable_element_definition_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "taggable_element_definition_4")) return false;
    tag(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // 'tags' any_text+ LINE_BREAK+
  public static boolean tags_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tags_statement")) return false;
    if (!nextTokenIs(b, TAGS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TAGS);
    r = r && tags_statement_1(b, l + 1);
    r = r && tags_statement_2(b, l + 1);
    exit_section_(b, m, TAGS_STATEMENT, r);
    return r;
  }

  // any_text+
  private static boolean tags_statement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tags_statement_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = any_text(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!any_text(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "tags_statement_1", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // LINE_BREAK+
  private static boolean tags_statement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tags_statement_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LINE_BREAK);
    while (r) {
      int c = current_position_(b);
      if (!consumeToken(b, LINE_BREAK)) break;
      if (!empty_element_parsed_guard_(b, "tags_statement_2", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (id "=")? <<keyword>> a_name a_description? any_text? tag?
  static boolean tech_taggable_element_definition(PsiBuilder b, int l, Parser _keyword) {
    if (!recursion_guard_(b, l, "tech_taggable_element_definition")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = tech_taggable_element_definition_0(b, l + 1);
    r = r && _keyword.parse(b, l);
    r = r && a_name(b, l + 1);
    r = r && tech_taggable_element_definition_3(b, l + 1);
    r = r && tech_taggable_element_definition_4(b, l + 1);
    r = r && tech_taggable_element_definition_5(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (id "=")?
  private static boolean tech_taggable_element_definition_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tech_taggable_element_definition_0")) return false;
    tech_taggable_element_definition_0_0(b, l + 1);
    return true;
  }

  // id "="
  private static boolean tech_taggable_element_definition_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tech_taggable_element_definition_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = id(b, l + 1);
    r = r && consumeToken(b, EQ);
    exit_section_(b, m, null, r);
    return r;
  }

  // a_description?
  private static boolean tech_taggable_element_definition_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tech_taggable_element_definition_3")) return false;
    a_description(b, l + 1);
    return true;
  }

  // any_text?
  private static boolean tech_taggable_element_definition_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tech_taggable_element_definition_4")) return false;
    any_text(b, l + 1);
    return true;
  }

  // tag?
  private static boolean tech_taggable_element_definition_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tech_taggable_element_definition_5")) return false;
    tag(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // 'technology' any_text LINE_BREAK+
  public static boolean technology_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "technology_statement")) return false;
    if (!nextTokenIs(b, TECHNOLOGY)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TECHNOLOGY);
    r = r && any_text(b, l + 1);
    r = r && technology_statement_2(b, l + 1);
    exit_section_(b, m, TECHNOLOGY_STATEMENT, r);
    return r;
  }

  // LINE_BREAK+
  private static boolean technology_statement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "technology_statement_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LINE_BREAK);
    while (r) {
      int c = current_position_(b);
      if (!consumeToken(b, LINE_BREAK)) break;
      if (!empty_element_parsed_guard_(b, "technology_statement_2", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'title' any_text LINE_BREAK+
  public static boolean title_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "title_statement")) return false;
    if (!nextTokenIs(b, TITLE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TITLE);
    r = r && any_text(b, l + 1);
    r = r && title_statement_2(b, l + 1);
    exit_section_(b, m, TITLE_STATEMENT, r);
    return r;
  }

  // LINE_BREAK+
  private static boolean title_statement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "title_statement_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LINE_BREAK);
    while (r) {
      int c = current_position_(b);
      if (!consumeToken(b, LINE_BREAK)) break;
      if (!empty_element_parsed_guard_(b, "title_statement_2", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // workspace_statement
  static boolean top_level_statements(PsiBuilder b, int l) {
    return workspace_statement(b, l + 1);
  }

  /* ********************************************************** */
  // 'url' any_text LINE_BREAK+
  public static boolean url_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "url_statement")) return false;
    if (!nextTokenIs(b, URL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, URL);
    r = r && any_text(b, l + 1);
    r = r && url_statement_2(b, l + 1);
    exit_section_(b, m, URL_STATEMENT, r);
    return r;
  }

  // LINE_BREAK+
  private static boolean url_statement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "url_statement_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LINE_BREAK);
    while (r) {
      int c = current_position_(b);
      if (!consumeToken(b, LINE_BREAK)) break;
      if (!empty_element_parsed_guard_(b, "url_statement_2", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // any_text
  public static boolean view_key(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "view_key")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, VIEW_KEY, "<view key>");
    r = any_text(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // opening_block views_block_statement* closing_block
  public static boolean views_block(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "views_block")) return false;
    if (!nextTokenIs(b, OPEN_PARENS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = opening_block(b, l + 1);
    r = r && views_block_1(b, l + 1);
    r = r && closing_block(b, l + 1);
    exit_section_(b, m, VIEWS_BLOCK, r);
    return r;
  }

  // views_block_statement*
  private static boolean views_block_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "views_block_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!views_block_statement(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "views_block_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // system_landscape_view_statement
  //  | system_context_view_statement
  //  | container_view_statement
  //  | component_view_statement
  //  | filtered_view_statement
  //  | dynamic_view_statement
  //  | deployment_view_statement
  //  | custom_view_statement
  //  | image_view_statement
  //  | styles_statement
  public static boolean views_block_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "views_block_statement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, VIEWS_BLOCK_STATEMENT, "<views block statement>");
    r = system_landscape_view_statement(b, l + 1);
    if (!r) r = system_context_view_statement(b, l + 1);
    if (!r) r = container_view_statement(b, l + 1);
    if (!r) r = component_view_statement(b, l + 1);
    if (!r) r = filtered_view_statement(b, l + 1);
    if (!r) r = dynamic_view_statement(b, l + 1);
    if (!r) r = deployment_view_statement(b, l + 1);
    if (!r) r = custom_view_statement(b, l + 1);
    if (!r) r = image_view_statement(b, l + 1);
    if (!r) r = styles_statement(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // "views" views_block
  public static boolean views_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "views_statement")) return false;
    if (!nextTokenIs(b, VIEWS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, VIEWS);
    r = r && views_block(b, l + 1);
    exit_section_(b, m, VIEWS_STATEMENT, r);
    return r;
  }

  /* ********************************************************** */
  // name_statement
  //  | description_statement
  //  | properties_statement
  //  | identifiers_statement
  //  | docs_statement
  //  | adrs_statement
  //  | model_statement
  //  | views_statement
  //  | configuration_statement
  static boolean workspace_block_statements(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "workspace_block_statements")) return false;
    boolean r;
    r = name_statement(b, l + 1);
    if (!r) r = description_statement(b, l + 1);
    if (!r) r = properties_statement(b, l + 1);
    if (!r) r = identifiers_statement(b, l + 1);
    if (!r) r = docs_statement(b, l + 1);
    if (!r) r = adrs_statement(b, l + 1);
    if (!r) r = model_statement(b, l + 1);
    if (!r) r = views_statement(b, l + 1);
    if (!r) r = configuration_statement(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // WORKSPACE ( a_name a_description? | "extends" any_text )?
  public static boolean workspace_definition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "workspace_definition")) return false;
    if (!nextTokenIs(b, WORKSPACE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, WORKSPACE);
    r = r && workspace_definition_1(b, l + 1);
    exit_section_(b, m, WORKSPACE_DEFINITION, r);
    return r;
  }

  // ( a_name a_description? | "extends" any_text )?
  private static boolean workspace_definition_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "workspace_definition_1")) return false;
    workspace_definition_1_0(b, l + 1);
    return true;
  }

  // a_name a_description? | "extends" any_text
  private static boolean workspace_definition_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "workspace_definition_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = workspace_definition_1_0_0(b, l + 1);
    if (!r) r = workspace_definition_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // a_name a_description?
  private static boolean workspace_definition_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "workspace_definition_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = a_name(b, l + 1);
    r = r && workspace_definition_1_0_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // a_description?
  private static boolean workspace_definition_1_0_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "workspace_definition_1_0_0_1")) return false;
    a_description(b, l + 1);
    return true;
  }

  // "extends" any_text
  private static boolean workspace_definition_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "workspace_definition_1_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, EXTENDS);
    r = r && any_text(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // workspace_definition opening_block workspace_block_statements*  closing_block
  public static boolean workspace_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "workspace_statement")) return false;
    if (!nextTokenIs(b, WORKSPACE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = workspace_definition(b, l + 1);
    r = r && opening_block(b, l + 1);
    r = r && workspace_statement_2(b, l + 1);
    r = r && closing_block(b, l + 1);
    exit_section_(b, m, WORKSPACE_STATEMENT, r);
    return r;
  }

  // workspace_block_statements*
  private static boolean workspace_statement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "workspace_statement_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!workspace_block_statements(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "workspace_statement_2", c)) break;
    }
    return true;
  }

  static final Parser COMPONENT_parser_ = (b, l) -> consumeToken(b, COMPONENT);
  static final Parser CONTAINER_parser_ = (b, l) -> consumeToken(b, CONTAINER);
  static final Parser PERSON_parser_ = (b, l) -> consumeToken(b, PERSON);
  static final Parser SOFTWARE_SYSTEM_parser_ = (b, l) -> consumeToken(b, SOFTWARE_SYSTEM);
}
