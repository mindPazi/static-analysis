// This is a generated file. Not intended for manual editing.
package com.github.mindpazi.staticanalysis.cobol.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static com.github.mindpazi.staticanalysis.cobol.psi.CobolTypes.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class CobolParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType root_, PsiBuilder builder_) {
    parseLight(root_, builder_);
    return builder_.getTreeBuilt();
  }

  public void parseLight(IElementType root_, PsiBuilder builder_) {
    boolean result_;
    builder_ = adapt_builder_(root_, builder_, this, null);
    Marker marker_ = enter_section_(builder_, 0, _COLLAPSE_, null);
    result_ = parse_root_(root_, builder_);
    exit_section_(builder_, 0, marker_, root_, result_, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType root_, PsiBuilder builder_) {
    return parse_root_(root_, builder_, 0);
  }

  static boolean parse_root_(IElementType root_, PsiBuilder builder_, int level_) {
    return cobolFile(builder_, level_ + 1);
  }

  /* ********************************************************** */
  // line*
  static boolean cobolFile(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "cobolFile")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!line(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "cobolFile", pos_)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // IDENTIFIER EQUALS (INTEGER | IDENTIFIER)
  public static boolean condition(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "condition")) return false;
    if (!nextTokenIs(builder_, IDENTIFIER)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, IDENTIFIER, EQUALS);
    result_ = result_ && condition_2(builder_, level_ + 1);
    exit_section_(builder_, marker_, CONDITION, result_);
    return result_;
  }

  // INTEGER | IDENTIFIER
  private static boolean condition_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "condition_2")) return false;
    boolean result_;
    result_ = consumeToken(builder_, INTEGER);
    if (!result_) result_ = consumeToken(builder_, IDENTIFIER);
    return result_;
  }

  /* ********************************************************** */
  // LEVEL_NUMBER IDENTIFIER picClause? valueClause?
  public static boolean dataDefinition(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "dataDefinition")) return false;
    if (!nextTokenIs(builder_, LEVEL_NUMBER)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, LEVEL_NUMBER, IDENTIFIER);
    result_ = result_ && dataDefinition_2(builder_, level_ + 1);
    result_ = result_ && dataDefinition_3(builder_, level_ + 1);
    exit_section_(builder_, marker_, DATA_DEFINITION, result_);
    return result_;
  }

  // picClause?
  private static boolean dataDefinition_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "dataDefinition_2")) return false;
    picClause(builder_, level_ + 1);
    return true;
  }

  // valueClause?
  private static boolean dataDefinition_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "dataDefinition_3")) return false;
    valueClause(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // DATA DIVISION DOT
  public static boolean dataDivision(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "dataDivision")) return false;
    if (!nextTokenIs(builder_, DATA)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, DATA, DIVISION, DOT);
    exit_section_(builder_, marker_, DATA_DIVISION, result_);
    return result_;
  }

  /* ********************************************************** */
  // STRING | IDENTIFIER
  static boolean displayItem(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "displayItem")) return false;
    if (!nextTokenIs(builder_, "", IDENTIFIER, STRING)) return false;
    boolean result_;
    result_ = consumeToken(builder_, STRING);
    if (!result_) result_ = consumeToken(builder_, IDENTIFIER);
    return result_;
  }

  /* ********************************************************** */
  // DISPLAY displayItem+
  public static boolean displayStatement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "displayStatement")) return false;
    if (!nextTokenIs(builder_, DISPLAY)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, DISPLAY);
    result_ = result_ && displayStatement_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, DISPLAY_STATEMENT, result_);
    return result_;
  }

  // displayItem+
  private static boolean displayStatement_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "displayStatement_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = displayItem(builder_, level_ + 1);
    while (result_) {
      int pos_ = current_position_(builder_);
      if (!displayItem(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "displayStatement_1", pos_)) break;
    }
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // IDENTIFICATION DIVISION DOT
  public static boolean identificationDivision(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "identificationDivision")) return false;
    if (!nextTokenIs(builder_, IDENTIFICATION)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, IDENTIFICATION, DIVISION, DOT);
    exit_section_(builder_, marker_, IDENTIFICATION_DIVISION, result_);
    return result_;
  }

  /* ********************************************************** */
  // numberedLine | CRLF | COMMENT
  static boolean line(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "line")) return false;
    boolean result_;
    result_ = numberedLine(builder_, level_ + 1);
    if (!result_) result_ = consumeToken(builder_, CRLF);
    if (!result_) result_ = consumeToken(builder_, COMMENT);
    return result_;
  }

  /* ********************************************************** */
  // LINE_NUMBER statement DOT?
  public static boolean numberedLine(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "numberedLine")) return false;
    if (!nextTokenIs(builder_, LINE_NUMBER)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, LINE_NUMBER);
    result_ = result_ && statement(builder_, level_ + 1);
    result_ = result_ && numberedLine_2(builder_, level_ + 1);
    exit_section_(builder_, marker_, NUMBERED_LINE, result_);
    return result_;
  }

  // DOT?
  private static boolean numberedLine_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "numberedLine_2")) return false;
    consumeToken(builder_, DOT);
    return true;
  }

  /* ********************************************************** */
  // IDENTIFIER DOT
  public static boolean paragraphDefinition(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "paragraphDefinition")) return false;
    if (!nextTokenIs(builder_, IDENTIFIER)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, IDENTIFIER, DOT);
    exit_section_(builder_, marker_, PARAGRAPH_DEFINITION, result_);
    return result_;
  }

  /* ********************************************************** */
  // PERFORM IDENTIFIER varyingClause?
  public static boolean performStatement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "performStatement")) return false;
    if (!nextTokenIs(builder_, PERFORM)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, PERFORM, IDENTIFIER);
    result_ = result_ && performStatement_2(builder_, level_ + 1);
    exit_section_(builder_, marker_, PERFORM_STATEMENT, result_);
    return result_;
  }

  // varyingClause?
  private static boolean performStatement_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "performStatement_2")) return false;
    varyingClause(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // PIC PICTURE_STRING
  public static boolean picClause(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "picClause")) return false;
    if (!nextTokenIs(builder_, PIC)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, PIC, PICTURE_STRING);
    exit_section_(builder_, marker_, PIC_CLAUSE, result_);
    return result_;
  }

  /* ********************************************************** */
  // PROCEDURE DIVISION DOT
  public static boolean procedureDivision(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "procedureDivision")) return false;
    if (!nextTokenIs(builder_, PROCEDURE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, PROCEDURE, DIVISION, DOT);
    exit_section_(builder_, marker_, PROCEDURE_DIVISION, result_);
    return result_;
  }

  /* ********************************************************** */
  // PROGRAM_ID DOT IDENTIFIER DOT?
  public static boolean programIdStatement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "programIdStatement")) return false;
    if (!nextTokenIs(builder_, PROGRAM_ID)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, PROGRAM_ID, DOT, IDENTIFIER);
    result_ = result_ && programIdStatement_3(builder_, level_ + 1);
    exit_section_(builder_, marker_, PROGRAM_ID_STATEMENT, result_);
    return result_;
  }

  // DOT?
  private static boolean programIdStatement_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "programIdStatement_3")) return false;
    consumeToken(builder_, DOT);
    return true;
  }

  /* ********************************************************** */
  // identificationDivision
  //                     | programIdStatement
  //                     | dataDivision
  //                     | workingStorageSection
  //                     | dataDefinition
  //                     | procedureDivision
  //                     | paragraphDefinition
  //                     | performStatement
  //                     | stopStatement
  //                     | displayStatement
  static boolean statement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "statement")) return false;
    boolean result_;
    result_ = identificationDivision(builder_, level_ + 1);
    if (!result_) result_ = programIdStatement(builder_, level_ + 1);
    if (!result_) result_ = dataDivision(builder_, level_ + 1);
    if (!result_) result_ = workingStorageSection(builder_, level_ + 1);
    if (!result_) result_ = dataDefinition(builder_, level_ + 1);
    if (!result_) result_ = procedureDivision(builder_, level_ + 1);
    if (!result_) result_ = paragraphDefinition(builder_, level_ + 1);
    if (!result_) result_ = performStatement(builder_, level_ + 1);
    if (!result_) result_ = stopStatement(builder_, level_ + 1);
    if (!result_) result_ = displayStatement(builder_, level_ + 1);
    return result_;
  }

  /* ********************************************************** */
  // STOP RUN
  public static boolean stopStatement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "stopStatement")) return false;
    if (!nextTokenIs(builder_, STOP)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, STOP, RUN);
    exit_section_(builder_, marker_, STOP_STATEMENT, result_);
    return result_;
  }

  /* ********************************************************** */
  // VALUE (INTEGER | STRING | IDENTIFIER)
  public static boolean valueClause(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "valueClause")) return false;
    if (!nextTokenIs(builder_, VALUE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, VALUE);
    result_ = result_ && valueClause_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, VALUE_CLAUSE, result_);
    return result_;
  }

  // INTEGER | STRING | IDENTIFIER
  private static boolean valueClause_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "valueClause_1")) return false;
    boolean result_;
    result_ = consumeToken(builder_, INTEGER);
    if (!result_) result_ = consumeToken(builder_, STRING);
    if (!result_) result_ = consumeToken(builder_, IDENTIFIER);
    return result_;
  }

  /* ********************************************************** */
  // VARYING IDENTIFIER FROM (INTEGER | IDENTIFIER) BY (INTEGER | IDENTIFIER) UNTIL condition
  public static boolean varyingClause(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "varyingClause")) return false;
    if (!nextTokenIs(builder_, VARYING)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, VARYING, IDENTIFIER, FROM);
    result_ = result_ && varyingClause_3(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, BY);
    result_ = result_ && varyingClause_5(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, UNTIL);
    result_ = result_ && condition(builder_, level_ + 1);
    exit_section_(builder_, marker_, VARYING_CLAUSE, result_);
    return result_;
  }

  // INTEGER | IDENTIFIER
  private static boolean varyingClause_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "varyingClause_3")) return false;
    boolean result_;
    result_ = consumeToken(builder_, INTEGER);
    if (!result_) result_ = consumeToken(builder_, IDENTIFIER);
    return result_;
  }

  // INTEGER | IDENTIFIER
  private static boolean varyingClause_5(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "varyingClause_5")) return false;
    boolean result_;
    result_ = consumeToken(builder_, INTEGER);
    if (!result_) result_ = consumeToken(builder_, IDENTIFIER);
    return result_;
  }

  /* ********************************************************** */
  // WORKING_STORAGE SECTION DOT
  public static boolean workingStorageSection(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "workingStorageSection")) return false;
    if (!nextTokenIs(builder_, WORKING_STORAGE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, WORKING_STORAGE, SECTION, DOT);
    exit_section_(builder_, marker_, WORKING_STORAGE_SECTION, result_);
    return result_;
  }

}
