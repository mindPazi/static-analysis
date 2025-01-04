// This is a generated file. Not intended for manual editing.
package com.github.mindpazi.staticanalysis.cobol.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface CobolNumberedLine extends PsiElement {

  @Nullable
  CobolDataDefinition getDataDefinition();

  @Nullable
  CobolDataDivision getDataDivision();

  @Nullable
  CobolDisplayStatement getDisplayStatement();

  @Nullable
  CobolIdentificationDivision getIdentificationDivision();

  @Nullable
  CobolParagraphDefinition getParagraphDefinition();

  @Nullable
  CobolPerformStatement getPerformStatement();

  @Nullable
  CobolProcedureDivision getProcedureDivision();

  @Nullable
  CobolProgramIdStatement getProgramIdStatement();

  @Nullable
  CobolStopStatement getStopStatement();

  @Nullable
  CobolWorkingStorageSection getWorkingStorageSection();

  @NotNull
  PsiElement getInteger();

}
