package com.github.mindpazi.staticanalysis.cobol

import com.intellij.lang.Language

object CobolLanguage : Language("Cobol") {
    private fun readResolve(): Any = CobolLanguage

    override fun getDisplayName(): String = "COBOL"
}
