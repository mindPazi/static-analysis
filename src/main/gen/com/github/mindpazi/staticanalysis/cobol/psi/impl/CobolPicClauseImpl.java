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

public class CobolPicClauseImpl extends ASTWrapperPsiElement implements CobolPicClause {

  public CobolPicClauseImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull CobolVisitor visitor) {
    visitor.visitPicClause(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CobolVisitor) accept((CobolVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public PsiElement getPictureString() {
    return findNotNullChildByType(PICTURE_STRING);
  }

}
