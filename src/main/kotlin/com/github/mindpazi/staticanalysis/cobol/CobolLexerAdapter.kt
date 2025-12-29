package com.github.mindpazi.staticanalysis.cobol

import com.intellij.lexer.FlexAdapter

class CobolLexerAdapter : FlexAdapter(CobolLexer(null))
