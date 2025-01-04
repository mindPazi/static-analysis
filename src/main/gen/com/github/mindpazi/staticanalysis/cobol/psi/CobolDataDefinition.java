// This is a generated file. Not intended for manual editing.
package com.github.mindpazi.staticanalysis.cobol.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface CobolDataDefinition extends PsiElement {

  @Nullable
  CobolPicClause getPicClause();

  @Nullable
  CobolValueClause getValueClause();

  @NotNull
  PsiElement getIdentifier();

  @NotNull
  PsiElement getInteger();

}
