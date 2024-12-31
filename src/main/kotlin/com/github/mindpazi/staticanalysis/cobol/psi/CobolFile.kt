package com.github.mindpazi.staticanalysis.cobol.psi

import com.github.mindpazi.staticanalysis.cobol.CobolFileType
import com.github.mindpazi.staticanalysis.cobol.CobolLanguage
import com.intellij.extapi.psi.PsiFileBase
import com.intellij.openapi.fileTypes.FileType
import com.intellij.psi.FileViewProvider

class CobolFile(viewProvider: FileViewProvider) : PsiFileBase(viewProvider, CobolLanguage) {
    override fun getFileType(): FileType = CobolFileType

    override fun toString(): String = "COBOL File"
}
