package net.etfbl.kki;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

import rs.etf.pp1.symboltable.Tab;
import java_cup.runtime.Symbol;

public class ParserTest {

	public static void pln(int o){
		System.out.println(o);
	}
	
	public static void pln(String str, int o){
		System.out.print(str);
		pln(o);
	}
	
	public static void main(String[] args) throws Exception {
		Reader br = null;
		try {

			File sourceCode = new File("test/program.mj");
			System.out.println("Compiling source file: " + sourceCode.getAbsolutePath());

			br = new BufferedReader(new FileReader(sourceCode));

			Yylex lexer = new Yylex(br);
			Parser parser = new Parser(lexer);
			Symbol symbol = parser.parse();
			
			pln("Global constants: ", parser.nDeclGlobSimpleConsts);
			pln("Global variables: ", parser.nDeclGlobSimpleVars);
			pln("Global arrays: ", parser.nDeclGlobArrays);
			pln("Definitions of global functions: ", parser.nDefProgramFuncs);
			pln("Definitions of class methods: ", parser.nDefClassMeths);
			pln("Declarations of classes: ", parser.nDeclClasses);
			pln("Statements in main: ", parser.nSimpleMainStatements);
			pln("Blocks of statements: ", parser.nStatementBlocks);
			pln("Function calls in main: ", parser.nFuncCallsInMain);
			pln("Object instatiations: ", parser.nObjInsts);
			
			
			

			Tab.dump();

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
