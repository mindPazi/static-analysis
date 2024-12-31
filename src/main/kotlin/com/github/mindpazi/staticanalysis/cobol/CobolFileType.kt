package com.github.mindpazi.staticanalysis.cobol

import com.intellij.openapi.fileTypes.LanguageFileType
import javax.swing.Icon

object CobolFileType : LanguageFileType(CobolLanguage) {
    override fun getName(): String = "Cobol File"

    override fun getDescription(): String = "COBOL language file"

    override fun getDefaultExtension(): String = "cob"

    override fun getIcon(): Icon = CobolIcons.FILE
}
