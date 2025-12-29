// This is a generated file. Not intended for manual editing.
package com.github.mindpazi.staticanalysis.cobol.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.github.mindpazi.staticanalysis.cobol.psi.impl.*;

public interface CobolTypes {

  IElementType CONDITION = new CobolElementType("CONDITION");
  IElementType DATA_DEFINITION = new CobolElementType("DATA_DEFINITION");
  IElementType DATA_DIVISION = new CobolElementType("DATA_DIVISION");
  IElementType DISPLAY_STATEMENT = new CobolElementType("DISPLAY_STATEMENT");
  IElementType IDENTIFICATION_DIVISION = new CobolElementType("IDENTIFICATION_DIVISION");
  IElementType NUMBERED_LINE = new CobolElementType("NUMBERED_LINE");
  IElementType PARAGRAPH_DEFINITION = new CobolElementType("PARAGRAPH_DEFINITION");
  IElementType PERFORM_STATEMENT = new CobolElementType("PERFORM_STATEMENT");
  IElementType PIC_CLAUSE = new CobolElementType("PIC_CLAUSE");
  IElementType PROCEDURE_DIVISION = new CobolElementType("PROCEDURE_DIVISION");
  IElementType PROGRAM_ID_STATEMENT = new CobolElementType("PROGRAM_ID_STATEMENT");
  IElementType STOP_STATEMENT = new CobolElementType("STOP_STATEMENT");
  IElementType VALUE_CLAUSE = new CobolElementType("VALUE_CLAUSE");
  IElementType VARYING_CLAUSE = new CobolElementType("VARYING_CLAUSE");
  IElementType WORKING_STORAGE_SECTION = new CobolElementType("WORKING_STORAGE_SECTION");

  IElementType BY = new CobolTokenType("BY");
  IElementType COMMENT = new CobolTokenType("COMMENT");
  IElementType CRLF = new CobolTokenType("CRLF");
  IElementType DATA = new CobolTokenType("DATA");
  IElementType DISPLAY = new CobolTokenType("DISPLAY");
  IElementType DIVISION = new CobolTokenType("DIVISION");
  IElementType DOT = new CobolTokenType(".");
  IElementType EQUALS = new CobolTokenType("=");
  IElementType FROM = new CobolTokenType("FROM");
  IElementType IDENTIFICATION = new CobolTokenType("IDENTIFICATION");
  IElementType IDENTIFIER = new CobolTokenType("IDENTIFIER");
  IElementType INTEGER = new CobolTokenType("INTEGER");
  IElementType LEVEL_NUMBER = new CobolTokenType("LEVEL_NUMBER");
  IElementType LINE_NUMBER = new CobolTokenType("LINE_NUMBER");
  IElementType LPAREN = new CobolTokenType("(");
  IElementType PERFORM = new CobolTokenType("PERFORM");
  IElementType PIC = new CobolTokenType("PIC");
  IElementType PICTURE_STRING = new CobolTokenType("PICTURE_STRING");
  IElementType PROCEDURE = new CobolTokenType("PROCEDURE");
  IElementType PROGRAM_ID = new CobolTokenType("PROGRAM-ID");
  IElementType RPAREN = new CobolTokenType(")");
  IElementType RUN = new CobolTokenType("RUN");
  IElementType SECTION = new CobolTokenType("SECTION");
  IElementType STOP = new CobolTokenType("STOP");
  IElementType STRING = new CobolTokenType("STRING");
  IElementType UNTIL = new CobolTokenType("UNTIL");
  IElementType VALUE = new CobolTokenType("VALUE");
  IElementType VARYING = new CobolTokenType("VARYING");
  IElementType WORKING_STORAGE = new CobolTokenType("WORKING-STORAGE");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == CONDITION) {
        return new CobolConditionImpl(node);
      }
      else if (type == DATA_DEFINITION) {
        return new CobolDataDefinitionImpl(node);
      }
      else if (type == DATA_DIVISION) {
        return new CobolDataDivisionImpl(node);
      }
      else if (type == DISPLAY_STATEMENT) {
        return new CobolDisplayStatementImpl(node);
      }
      else if (type == IDENTIFICATION_DIVISION) {
        return new CobolIdentificationDivisionImpl(node);
      }
      else if (type == NUMBERED_LINE) {
        return new CobolNumberedLineImpl(node);
      }
      else if (type == PARAGRAPH_DEFINITION) {
        return new CobolParagraphDefinitionImpl(node);
      }
      else if (type == PERFORM_STATEMENT) {
        return new CobolPerformStatementImpl(node);
      }
      else if (type == PIC_CLAUSE) {
        return new CobolPicClauseImpl(node);
      }
      else if (type == PROCEDURE_DIVISION) {
        return new CobolProcedureDivisionImpl(node);
      }
      else if (type == PROGRAM_ID_STATEMENT) {
        return new CobolProgramIdStatementImpl(node);
      }
      else if (type == STOP_STATEMENT) {
        return new CobolStopStatementImpl(node);
      }
      else if (type == VALUE_CLAUSE) {
        return new CobolValueClauseImpl(node);
      }
      else if (type == VARYING_CLAUSE) {
        return new CobolVaryingClauseImpl(node);
      }
      else if (type == WORKING_STORAGE_SECTION) {
        return new CobolWorkingStorageSectionImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
