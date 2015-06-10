/* The following code was generated by JFlex 1.4.3 on 6/10/15 10:41 PM */

//Import section

package net.etfbl.kki;

import java_cup.runtime.Symbol;
import org.apache.commons.lang.StringEscapeUtils;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 6/10/15 10:41 PM from the specification file
 * <tt>spec/micro_java_lexer.flex</tt>
 */
class Yylex implements java_cup.runtime.Scanner {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\10\62\1\7\1\7\1\2\1\63\1\10\1\4\22\62\1\7\1\44"+
    "\1\64\2\62\1\47\1\40\1\61\1\52\1\53\1\5\1\41\1\51"+
    "\1\42\1\6\1\1\12\60\1\62\1\50\1\46\1\43\1\45\2\62"+
    "\32\66\1\56\1\65\1\57\1\62\1\67\1\62\1\15\1\35\1\26"+
    "\1\25\1\22\1\33\1\14\1\34\1\17\1\66\1\36\1\27\1\16"+
    "\1\20\1\13\1\11\1\66\1\12\1\30\1\21\1\23\1\24\1\32"+
    "\1\31\2\66\1\54\1\37\1\55\7\62\1\63\172\62\u1f28\0\2\3"+
    "\udfd6\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\1\1\1\4\1\5\15\6"+
    "\2\1\1\7\1\10\1\11\1\1\1\12\1\13\1\14"+
    "\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24"+
    "\1\25\2\1\2\0\2\6\1\26\5\6\1\27\5\6"+
    "\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37"+
    "\2\0\1\40\1\0\3\41\1\0\4\6\1\42\11\6"+
    "\1\43\1\40\1\44\1\0\2\6\1\45\1\6\1\46"+
    "\1\47\1\6\1\50\5\6\1\0\1\6\1\51\2\6"+
    "\1\52\1\53\1\54\1\55\1\56\1\6\1\57\1\6"+
    "\1\60\1\61";

  private static int [] zzUnpackAction() {
    int [] result = new int[118];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\70\0\160\0\70\0\250\0\70\0\70\0\340"+
    "\0\u0118\0\u0150\0\u0188\0\u01c0\0\u01f8\0\u0230\0\u0268\0\u02a0"+
    "\0\u02d8\0\u0310\0\u0348\0\u0380\0\u03b8\0\u03f0\0\u0428\0\u0460"+
    "\0\u0498\0\u04d0\0\u0508\0\u0540\0\70\0\70\0\70\0\70"+
    "\0\70\0\70\0\70\0\70\0\70\0\u0578\0\u05b0\0\u05e8"+
    "\0\u0620\0\u0658\0\u0690\0\u06c8\0\u0150\0\u0700\0\u0738\0\u0770"+
    "\0\u07a8\0\u07e0\0\u0150\0\u0818\0\u0850\0\u0888\0\u08c0\0\u08f8"+
    "\0\70\0\70\0\70\0\70\0\70\0\70\0\70\0\70"+
    "\0\u0930\0\u05e8\0\70\0\u0968\0\70\0\u0620\0\u09a0\0\u09d8"+
    "\0\u0a10\0\u0a48\0\u0a80\0\u0ab8\0\u0150\0\u0af0\0\u0b28\0\u0b60"+
    "\0\u0b98\0\u0bd0\0\u0c08\0\u0c40\0\u0c78\0\u0cb0\0\70\0\u05e8"+
    "\0\70\0\u0ce8\0\u0d20\0\u0d58\0\u0150\0\u0d90\0\u0150\0\u0150"+
    "\0\u0dc8\0\u0150\0\u0e00\0\u0e38\0\u0e70\0\u0ea8\0\u0ee0\0\u0f18"+
    "\0\u0f50\0\u0150\0\u0f88\0\u0fc0\0\u0150\0\u0150\0\u0150\0\u0150"+
    "\0\u0150\0\u0ff8\0\u0150\0\u1030\0\u0150\0\u0150";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[118];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\1\3\1\4\1\2\1\5\1\6\1\7\2\4"+
    "\1\10\1\11\4\12\1\13\1\14\1\15\1\16\1\12"+
    "\1\17\1\20\1\21\3\12\1\22\1\23\1\12\1\24"+
    "\1\12\1\25\1\26\1\27\1\30\1\31\1\32\1\33"+
    "\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43"+
    "\1\44\1\45\1\46\1\47\2\2\1\50\1\2\1\12"+
    "\1\2\71\0\1\51\3\0\1\52\64\0\1\4\76\0"+
    "\1\12\1\53\25\12\20\0\1\12\5\0\2\12\11\0"+
    "\11\12\1\54\15\12\20\0\1\12\5\0\2\12\11\0"+
    "\27\12\20\0\1\12\5\0\2\12\11\0\22\12\1\55"+
    "\4\12\20\0\1\12\5\0\2\12\11\0\11\12\1\56"+
    "\15\12\20\0\1\12\5\0\2\12\11\0\1\12\1\57"+
    "\25\12\20\0\1\12\5\0\2\12\11\0\16\12\1\60"+
    "\1\12\1\61\6\12\20\0\1\12\5\0\2\12\11\0"+
    "\2\12\1\62\24\12\20\0\1\12\5\0\2\12\11\0"+
    "\2\12\1\63\24\12\20\0\1\12\5\0\2\12\11\0"+
    "\2\12\1\64\13\12\1\65\10\12\20\0\1\12\5\0"+
    "\2\12\11\0\23\12\1\66\3\12\20\0\1\12\5\0"+
    "\2\12\11\0\4\12\1\67\22\12\20\0\1\12\5\0"+
    "\2\12\11\0\1\12\1\70\25\12\20\0\1\12\5\0"+
    "\2\12\37\0\1\71\70\0\1\72\70\0\1\73\70\0"+
    "\1\74\70\0\1\75\67\0\1\76\67\0\1\77\67\0"+
    "\1\100\104\0\1\46\10\0\2\101\1\0\64\101\64\102"+
    "\1\103\1\104\2\102\2\51\1\105\1\106\1\107\3\51"+
    "\1\106\52\51\1\106\4\51\6\0\1\110\72\0\2\12"+
    "\1\111\3\12\1\112\20\12\20\0\1\12\5\0\2\12"+
    "\11\0\4\12\1\113\3\12\1\114\16\12\20\0\1\12"+
    "\5\0\2\12\11\0\21\12\1\115\5\12\20\0\1\12"+
    "\5\0\2\12\11\0\12\12\1\116\14\12\20\0\1\12"+
    "\5\0\2\12\11\0\17\12\1\117\7\12\20\0\1\12"+
    "\5\0\2\12\11\0\10\12\1\120\16\12\20\0\1\12"+
    "\5\0\2\12\11\0\6\12\1\121\20\12\20\0\1\12"+
    "\5\0\2\12\11\0\7\12\1\122\17\12\20\0\1\12"+
    "\5\0\2\12\11\0\4\12\1\123\22\12\20\0\1\12"+
    "\5\0\2\12\11\0\6\12\1\124\20\12\20\0\1\12"+
    "\5\0\2\12\11\0\16\12\1\125\10\12\20\0\1\12"+
    "\5\0\2\12\11\0\11\12\1\126\15\12\20\0\1\12"+
    "\5\0\2\12\61\0\1\127\6\0\64\102\1\130\1\104"+
    "\2\102\2\51\1\131\1\106\1\107\3\51\1\106\52\51"+
    "\1\106\4\51\5\0\1\132\73\0\3\12\1\133\23\12"+
    "\20\0\1\12\5\0\2\12\11\0\7\12\1\134\17\12"+
    "\20\0\1\12\5\0\2\12\11\0\14\12\1\135\12\12"+
    "\20\0\1\12\5\0\2\12\11\0\12\12\1\136\14\12"+
    "\20\0\1\12\5\0\2\12\11\0\11\12\1\137\15\12"+
    "\20\0\1\12\5\0\2\12\11\0\11\12\1\140\15\12"+
    "\20\0\1\12\5\0\2\12\11\0\11\12\1\141\15\12"+
    "\20\0\1\12\5\0\2\12\11\0\14\12\1\142\12\12"+
    "\20\0\1\12\5\0\2\12\11\0\17\12\1\143\7\12"+
    "\20\0\1\12\5\0\2\12\11\0\17\12\1\144\7\12"+
    "\20\0\1\12\5\0\2\12\11\0\16\12\1\145\10\12"+
    "\20\0\1\12\5\0\2\12\11\0\17\12\1\146\7\12"+
    "\20\0\1\12\5\0\2\12\11\0\4\12\1\147\22\12"+
    "\20\0\1\12\5\0\2\12\5\0\1\150\73\0\1\12"+
    "\1\151\25\12\20\0\1\12\5\0\2\12\11\0\10\12"+
    "\1\152\16\12\20\0\1\12\5\0\2\12\11\0\1\12"+
    "\1\153\25\12\20\0\1\12\5\0\2\12\11\0\7\12"+
    "\1\154\17\12\20\0\1\12\5\0\2\12\11\0\10\12"+
    "\1\155\16\12\20\0\1\12\5\0\2\12\11\0\17\12"+
    "\1\156\7\12\20\0\1\12\5\0\2\12\11\0\11\12"+
    "\1\157\15\12\20\0\1\12\5\0\2\12\11\0\11\12"+
    "\1\160\15\12\20\0\1\12\5\0\2\12\11\0\25\12"+
    "\1\161\1\12\20\0\1\12\5\0\2\12\1\0\1\4"+
    "\77\0\4\12\1\162\22\12\20\0\1\12\5\0\2\12"+
    "\11\0\7\12\1\163\17\12\20\0\1\12\5\0\2\12"+
    "\11\0\14\12\1\164\12\12\20\0\1\12\5\0\2\12"+
    "\11\0\5\12\1\165\21\12\20\0\1\12\5\0\2\12"+
    "\11\0\17\12\1\166\7\12\20\0\1\12\5\0\2\12";

  private static int [] zzUnpackTrans() {
    int [] result = new int[4200];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\1\1\1\11\1\1\2\11\25\1\11\11"+
    "\3\1\2\0\16\1\10\11\2\0\1\11\1\0\1\11"+
    "\2\1\1\0\16\1\1\11\1\1\1\11\1\0\15\1"+
    "\1\0\16\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[118];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */

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
	



  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  Yylex(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  Yylex(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 142) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead > 0) {
      zzEndRead+= numRead;
      return false;
    }
    // unlikely but not impossible: read 0 characters, but not at end of stream    
    if (numRead == 0) {
      int c = zzReader.read();
      if (c == -1) {
        return true;
      } else {
        zzBuffer[zzEndRead++] = (char) c;
        return false;
      }     
    }

	// numRead < 0
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      boolean zzR = false;
      for (zzCurrentPosL = zzStartRead; zzCurrentPosL < zzMarkedPosL;
                                                             zzCurrentPosL++) {
        switch (zzBufferL[zzCurrentPosL]) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn++;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL[zzCurrentPosL++];
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = zzBufferL[zzCurrentPosL++];
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 7: 
          { return new_symbol(sym.PLUS, yytext());
          }
        case 50: break;
        case 16: 
          { return new_symbol(sym.RPAREN, yytext());
          }
        case 51: break;
        case 25: 
          { return new_symbol(sym.LOGICAL_AND, yytext());
          }
        case 52: break;
        case 14: 
          { return new_symbol(sym.COMMA, yytext());
          }
        case 53: break;
        case 49: 
          { return new_symbol(sym.EXTENDS, yytext());
          }
        case 54: break;
        case 34: 
          { return new_symbol(sym.NEW, yytext());
          }
        case 55: break;
        case 24: 
          { return new_symbol(sym.LOGICAL_OR, yytext());
          }
        case 56: break;
        case 38: 
          { return new_symbol(sym.BOOL_LITERAL, Boolean.TRUE);
          }
        case 57: break;
        case 21: 
          { return new_symbol(sym.NUMBER_LITERAL, new Integer(yytext()));
          }
        case 58: break;
        case 18: 
          { return new_symbol(sym.RBRACE, yytext());
          }
        case 59: break;
        case 39: 
          { return new_symbol(sym.ELSE, yytext());
          }
        case 60: break;
        case 22: 
          { return new_symbol(sym.IF, yytext());
          }
        case 61: break;
        case 5: 
          { return new_symbol(sym.DOT, yytext());
          }
        case 62: break;
        case 31: 
          { return new_symbol(sym.LESS_OR_EQUAL, yytext());
          }
        case 63: break;
        case 8: 
          { return new_symbol(sym.MINUS, yytext());
          }
        case 64: break;
        case 29: 
          { return new_symbol(sym.NOT_EQUAL, yytext());
          }
        case 65: break;
        case 45: 
          { return new_symbol(sym.BOOL_LITERAL, Boolean.FALSE);
          }
        case 66: break;
        case 27: 
          { return new_symbol(sym.DECREAMENT, yytext());
          }
        case 67: break;
        case 40: 
          { return new_symbol(sym.VOID, yytext());
          }
        case 68: break;
        case 42: 
          { return new_symbol(sym.CONST, yytext());
          }
        case 69: break;
        case 6: 
          { return new_symbol(sym.IDENT, yytext());
          }
        case 70: break;
        case 15: 
          { return new_symbol(sym.LPAREN, yytext());
          }
        case 71: break;
        case 28: 
          { return new_symbol(sym.EQUAL, yytext());
          }
        case 72: break;
        case 11: 
          { return new_symbol(sym.LESS, yytext());
          }
        case 73: break;
        case 19: 
          { return new_symbol(sym.LBRACKET, yytext());
          }
        case 74: break;
        case 12: 
          { return new_symbol(sym.MOD, yytext());
          }
        case 75: break;
        case 4: 
          { return new_symbol(sym.TIMES, yytext());
          }
        case 76: break;
        case 46: 
          { return new_symbol(sym.BREAK, yytext());
          }
        case 77: break;
        case 9: 
          { return new_symbol(sym.ASSIGMENT, yytext());
          }
        case 78: break;
        case 17: 
          { return new_symbol(sym.LBRACE, yytext());
          }
        case 79: break;
        case 37: 
          { return new_symbol(sym.READ, yytext());
          }
        case 80: break;
        case 26: 
          { return new_symbol(sym.INCREAMENT, yytext());
          }
        case 81: break;
        case 32: 
          { if(yytext().length() == 2) return new_symbol(sym.STRING_LITERAL, ""); else { String lit = StringEscapeUtils.unescapeJava(yytext().substring(1, yytext().length()-1)); return new_symbol(sym.STRING_LITERAL, lit);}
          }
        case 82: break;
        case 10: 
          { return new_symbol(sym.GREATER, yytext());
          }
        case 83: break;
        case 44: 
          { return new_symbol(sym.WHILE, yytext());
          }
        case 84: break;
        case 13: 
          { return new_symbol(sym.SEMI, yytext());
          }
        case 85: break;
        case 41: 
          { return new_symbol(sym.PRINT, yytext());
          }
        case 86: break;
        case 20: 
          { return new_symbol(sym.RBRACKET, yytext());
          }
        case 87: break;
        case 30: 
          { return new_symbol(sym.GREATER_OR_EQUAL, yytext());
          }
        case 88: break;
        case 23: 
          { return new_symbol(sym.DO, yytext());
          }
        case 89: break;
        case 43: 
          { return new_symbol(sym.CLASS, yytext());
          }
        case 90: break;
        case 2: 
          { return new_symbol(sym.DEVIDE, yytext());
          }
        case 91: break;
        case 48: 
          { return new_symbol(sym.PROGRAM, yytext());
          }
        case 92: break;
        case 1: 
          { System.err.println("Lexical error:"+(yyline+1)+":"+(yycolumn)+": "+yytext()); return new_symbol(sym.INVALID, yytext());
          }
        case 93: break;
        case 47: 
          { return new_symbol(sym.RETURN, yytext());
          }
        case 94: break;
        case 35: 
          { return new_symbol(sym.CHAR_LITERAL, Character.valueOf(extract_char_literal(yytext())));
          }
        case 95: break;
        case 36: 
          // lookahead expression with fixed lookahead length
          yypushback(2);
          { 
          }
        case 96: break;
        case 3: 
          { 
          }
        case 97: break;
        case 33: 
          // lookahead expression with fixed lookahead length
          yypushback(1);
          { 
          }
        case 98: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            zzDoEOF();
              { 	return new_symbol(sym.EOF);
 }
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
