package net.etfbl.kki;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

import rs.etf.pp1.symboltable.Tab;
import java_cup.runtime.Symbol;

public class ParserTest {

	public static void main(String[] args) throws Exception {
		Reader br = null;
		try {

			File sourceCode = new File("test/program.mj");
			System.out.println("Compiling source file: " + sourceCode.getAbsolutePath());

			br = new BufferedReader(new FileReader(sourceCode));

			Yylex lexer = new Yylex(br);
			Parser parser = new Parser(lexer);
			Symbol symbol = parser.parse();

			//Tab.dump();

//			if(parser.errorDetected){
//				System.out.println("Parsiranje nije uspjesno zavrseno!");
//			}
//			else{
//				System.out.println("Parsiranje je uspjesno zavrseno!");
//			}

			//System.out.println("Broj pojavljivanja metode print: "+parser.printCounter);

		} 
		finally {
			if (br != null) try { br.close(); } catch (IOException e1) { e1.printStackTrace(); }
		}
	}
}
