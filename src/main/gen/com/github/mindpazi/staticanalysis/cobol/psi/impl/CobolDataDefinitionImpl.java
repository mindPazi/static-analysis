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

public class CobolDataDefinitionImpl extends ASTWrapperPsiElement implements CobolDataDefinition {

  public CobolDataDefinitionImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull CobolVisitor visitor) {
    visitor.visitDataDefinition(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CobolVisitor) accept((CobolVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public CobolPicClause getPicClause() {
    return findChildByClass(CobolPicClause.class);
  }

  @Override
  @Nullable
  public CobolValueClause getValueClause() {
    return findChildByClass(CobolValueClause.class);
  }

  @Override
  @NotNull
  public PsiElement getIdentifier() {
    return findNotNullChildByType(IDENTIFIER);
  }

  @Override
  @NotNull
  public PsiElement getLevelNumber() {
    return findNotNullChildByType(LEVEL_NUMBER);
  }

}
