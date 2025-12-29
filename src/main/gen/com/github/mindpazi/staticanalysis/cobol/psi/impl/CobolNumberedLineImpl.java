// This is a generated file. Not intended for manual editing.
package com.github.mindpazi.staticanalysis.cobol.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.github.mindpazi.staticanalysis.cobol.psi.CobolTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.github.mindpazi.staticanalysis.cobol.psi.*;

public class CobolNumberedLineImpl extends ASTWrapperPsiElement implements CobolNumberedLine {

  public CobolNumberedLineImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull CobolVisitor visitor) {
    visitor.visitNumberedLine(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CobolVisitor) accept((CobolVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public CobolDataDefinition getDataDefinition() {
    return findChildByClass(CobolDataDefinition.class);
  }

  @Override
  @Nullable
  public CobolDataDivision getDataDivision() {
    return findChildByClass(CobolDataDivision.class);
  }

  @Override
  @Nullable
  public CobolDisplayStatement getDisplayStatement() {
    return findChildByClass(CobolDisplayStatement.class);
  }

  @Override
  @Nullable
  public CobolIdentificationDivision getIdentificationDivision() {
    return findChildByClass(CobolIdentificationDivision.class);
  }

  @Override
  @Nullable
  public CobolParagraphDefinition getParagraphDefinition() {
    return findChildByClass(CobolParagraphDefinition.class);
  }

  @Override
  @Nullable
  public CobolPerformStatement getPerformStatement() {
    return findChildByClass(CobolPerformStatement.class);
  }

  @Override
  @Nullable
  public CobolProcedureDivision getProcedureDivision() {
    return findChildByClass(CobolProcedureDivision.class);
  }

  @Override
  @Nullable
  public CobolProgramIdStatement getProgramIdStatement() {
    return findChildByClass(CobolProgramIdStatement.class);
  }

  @Override
  @Nullable
  public CobolStopStatement getStopStatement() {
    return findChildByClass(CobolStopStatement.class);
  }

  @Override
  @Nullable
  public CobolWorkingStorageSection getWorkingStorageSection() {
    return findChildByClass(CobolWorkingStorageSection.class);
  }

  @Override
  @NotNull
  public PsiElement getInteger() {
    return findNotNullChildByType(INTEGER);
  }

}
