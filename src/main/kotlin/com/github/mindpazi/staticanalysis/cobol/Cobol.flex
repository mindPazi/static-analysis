package com.github.mindpazi.staticanalysis.cobol;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;

import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static com.intellij.psi.TokenType.WHITE_SPACE;
import static com.github.mindpazi.staticanalysis.cobol.psi.CobolTypes.*;

%%

%class CobolLexer
%implements FlexLexer
%unicode
%function advance
%type IElementType
%eof{  return;
%eof}

CRLF=\R
WHITE_SPACE=[ \t]+
LINE_NUMBER=[0-9]+
INTEGER=[0-9]+
IDENTIFIER=[A-Za-z][A-Za-z0-9\-]*
STRING='[^']*'
PICTURE_STRING=[9AX]+(\([0-9]+\))?
COMMENT=\*.*

%state AFTER_PIC

%%

<YYINITIAL> {
  {CRLF}                      { return CRLF; }
  {WHITE_SPACE}               { return WHITE_SPACE; }

  // Keywords (case-insensitive)
  "IDENTIFICATION"            { return IDENTIFICATION; }
  "DIVISION"                  { return DIVISION; }
  "PROGRAM-ID"                { return PROGRAM_ID; }
  "DATA"                      { return DATA; }
  "WORKING-STORAGE"           { return WORKING_STORAGE; }
  "SECTION"                   { return SECTION; }
  "PROCEDURE"                 { return PROCEDURE; }
  "PIC"                       { yybegin(AFTER_PIC); return PIC; }
  "PICTURE"                   { yybegin(AFTER_PIC); return PIC; }
  "VALUE"                     { return VALUE; }
  "PERFORM"                   { return PERFORM; }
  "VARYING"                   { return VARYING; }
  "FROM"                      { return FROM; }
  "BY"                        { return BY; }
  "UNTIL"                     { return UNTIL; }
  "STOP"                      { return STOP; }
  "RUN"                       { return RUN; }
  "DISPLAY"                   { return DISPLAY; }

  // Punctuation
  "."                         { return DOT; }
  "("                         { return LPAREN; }
  ")"                         { return RPAREN; }
  "="                         { return EQUALS; }

  // Comment line (starts with *)
  {COMMENT}                   { return COMMENT; }

  // String literals
  {STRING}                    { return STRING; }

  // Numbers and identifiers
  {INTEGER}                   { return INTEGER; }
  {IDENTIFIER}                { return IDENTIFIER; }
}

<AFTER_PIC> {
  {WHITE_SPACE}               { return WHITE_SPACE; }
  {PICTURE_STRING}            { yybegin(YYINITIAL); return PICTURE_STRING; }
  [^ \t\r\n.]+                { yybegin(YYINITIAL); return PICTURE_STRING; }
  {CRLF}                      { yybegin(YYINITIAL); return CRLF; }
  "."                         { yybegin(YYINITIAL); return DOT; }
}

[^]                           { return BAD_CHARACTER; }
