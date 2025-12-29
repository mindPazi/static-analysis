package com.github.mindpazi.staticanalysis.cobol.psi

import com.intellij.psi.tree.TokenSet

object CobolTokenSets {
    @JvmField
    val COMMENTS = TokenSet.create(CobolTypes.COMMENT)

    @JvmField
    val KEYWORDS = TokenSet.create(
        CobolTypes.IDENTIFICATION,
        CobolTypes.DIVISION,
        CobolTypes.PROGRAM_ID,
        CobolTypes.DATA,
        CobolTypes.WORKING_STORAGE,
        CobolTypes.SECTION,
        CobolTypes.PROCEDURE,
        CobolTypes.PIC,
        CobolTypes.VALUE,
        CobolTypes.PERFORM,
        CobolTypes.VARYING,
        CobolTypes.FROM,
        CobolTypes.BY,
        CobolTypes.UNTIL,
        CobolTypes.STOP,
        CobolTypes.RUN,
        CobolTypes.DISPLAY
    )

    @JvmField
    val STRINGS = TokenSet.create(CobolTypes.STRING)

    @JvmField
    val NUMBERS = TokenSet.create(CobolTypes.INTEGER)
}
