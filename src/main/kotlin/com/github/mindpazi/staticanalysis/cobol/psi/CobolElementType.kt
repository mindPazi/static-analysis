package com.github.mindpazi.staticanalysis.cobol.psi

import com.github.mindpazi.staticanalysis.cobol.CobolLanguage
import com.intellij.psi.tree.IElementType
import org.jetbrains.annotations.NonNls

class CobolElementType(@NonNls debugName: String) : IElementType(debugName, CobolLanguage)
