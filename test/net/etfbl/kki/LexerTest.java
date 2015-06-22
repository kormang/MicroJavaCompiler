package net.etfbl.kki;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

import java_cup.runtime.Symbol;


public class LexerTest {

	
	public static void main(String[] args) throws IOException {
		Reader br = null;
		
		char c = '\'';
		
		try {
			
			File sourceCode = new File("test/nivo0.mj");	
		
			br = new BufferedReader(new FileReader(sourceCode));
			
			Yylex lexer = new Yylex(br);
			Symbol currToken = null;
			while ((currToken = lexer.next_token()).sym != sym.EOF) {
				if (currToken != null)
					if(currToken.sym == sym.INVALID) {
						System.err.print("[INVALID]" );
					}
					if(currToken.value != null) {
						System.out.println(currToken.toString() + " " + currToken.value.toString());
					} else {
						System.err.println(currToken.toString());
					}
				
				//log.info(currToken.toString() + " " + currToken.value.toString());
			}
		} 
		finally {
			if (br != null) try { br.close(); } catch (IOException e1) { e1.printStackTrace(); }
		}
	}
	
}