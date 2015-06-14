//Import section

package net.etfbl.kki;

import java_cup.runtime.Symbol;
import org.apache.commons.lang.StringEscapeUtils;

%%

//JFlex directives

%cup
%line
%column

%{

	static char[] char_LUT = new char[256];
	
	static {
		char_LUT['t'] = '\t';
		char_LUT['b'] = '\b';
		char_LUT['n'] = '\n';
		char_LUT['r'] = '\r';
		char_LUT['\\'] = '\\';
		char_LUT['\''] = '\'';
		char_LUT['\"'] = '\"';
		char_LUT['f'] = '\f';
	}

	private Symbol new_symbol(int type) {
		return new Symbol(type, yyline+1, yycolumn);
	}
	
	private Symbol new_symbol(int type, Object value) {
		return new Symbol(type, yyline+1, yycolumn, value);
	}
	
	private char extract_char_literal(String text) {
		char c = text.charAt(1);
		if(c == '\\'){
			c = char_LUT[text.charAt(1)];
		}
		
		return c;
	}
	

%}



%eofval{
	return new_symbol(sym.EOF);
%eofval}


%%

//Regular expressions

//comments


"//".*$ { }

"/\*.*\*/" { } 

//white space

" "  	{ }
"\b" 	{ }
"\t" 	{ }
"\n"	{ }
"\r\n"  { }
"\f"	{ }

//keywords

"program"  { return new_symbol(sym.PROGRAM, yytext()); }
"print"    { return new_symbol(sym.PRINT, yytext()); }
"return"   { return new_symbol(sym.RETURN, yytext()); }
"void"     { return new_symbol(sym.VOID, yytext()); }
"class"	   { return new_symbol(sym.CLASS, yytext()); }
"extends"  { return new_symbol(sym.EXTENDS, yytext()); }
"new"      { return new_symbol(sym.NEW, yytext()); }
"if"       { return new_symbol(sym.IF, yytext()); }
"else"     { return new_symbol(sym.ELSE, yytext()); }
"while"    { return new_symbol(sym.WHILE, yytext()); }
"read"     { return new_symbol(sym.READ, yytext()); }
"break"    { return new_symbol(sym.BREAK, yytext()); }
"do"       { return new_symbol(sym.DO, yytext()); }
"const"    { return new_symbol(sym.CONST, yytext()); }

// operators

"||"  	   { return new_symbol(sym.LOGICAL_OR, yytext()); }
"&&"  	   { return new_symbol(sym.LOGICAL_AND, yytext()); }
"++"  	   { return new_symbol(sym.INCREAMENT, yytext()); }
"--"  	   { return new_symbol(sym.DECREAMENT, yytext()); }
"=="  	   { return new_symbol(sym.EQUAL, yytext()); }
"!="  	   { return new_symbol(sym.NOT_EQUAL, yytext()); }
">"  	   { return new_symbol(sym.GREATER, yytext()); }
">="  	   { return new_symbol(sym.GREATER_OR_EQUAL, yytext()); }
"<"  	   { return new_symbol(sym.LESS, yytext()); }
"<="  	   { return new_symbol(sym.LESS_OR_EQUAL, yytext()); }
"+"  	   { return new_symbol(sym.PLUS, yytext()); }
"-"  	   { return new_symbol(sym.MINUS, yytext()); }
"="  	   { return new_symbol(sym.ASSIGNMENT, yytext()); }
"*"  	   { return new_symbol(sym.TIMES, yytext()); }
"/"  	   { return new_symbol(sym.DEVIDE, yytext()); }
"%"  	   { return new_symbol(sym.MOD, yytext()); }
";"  	   { return new_symbol(sym.SEMI, yytext()); }
"," 	   { return new_symbol(sym.COMMA, yytext()); }
"("  	   { return new_symbol(sym.LPAREN, yytext()); }
")"  	   { return new_symbol(sym.RPAREN, yytext()); }
"{"  	   { return new_symbol(sym.LBRACE, yytext()); }
"}"  	   { return new_symbol(sym.RBRACE, yytext()); }
"["  	   { return new_symbol(sym.LBRACKET, yytext()); }
"]"  	   { return new_symbol(sym.RBRACKET, yytext()); }
\.		   { return new_symbol(sym.DOT, yytext()); }

//literals

[0-9]+     { return new_symbol(sym.NUMBER_LITERAL, new Integer(yytext())); }
"false"	   { return new_symbol(sym.BOOL_LITERAL, Boolean.FALSE); }
"true"	   { return new_symbol(sym.BOOL_LITERAL, Boolean.TRUE); }
\'[\x00-\xff]\' { return new_symbol(sym.CHAR_LITERAL, Character.valueOf(extract_char_literal(yytext()))); }
\"([^\"]|(\\\"))*\" { if(yytext().length() == 2) return new_symbol(sym.STRING_LITERAL, ""); else { String lit = StringEscapeUtils.unescapeJava(yytext().substring(1, yytext().length()-1)); return new_symbol(sym.STRING_LITERAL, lit);} }

([a-z]|[A-Z])[a-z|A-Z|0-9|_]*  { return new_symbol(sym.IDENT, yytext()); }

.   { 	System.err.println("Lexical error:"+(yyline+1)+":"+(yycolumn)+": "+yytext()); return new_symbol(sym.INVALID, yytext()); }





