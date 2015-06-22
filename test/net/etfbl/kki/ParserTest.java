package net.etfbl.kki;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

import rs.etf.pp1.mj.runtime.Code;
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
	
		String inputFileName = "test/program.mj";
		String outputFileName = "test/a.out";
		
		Reader br = null;
		try {

			if(args.length >= 1) {
				inputFileName = args[args.length - 1];
			}
			
			File sourceCode = new File(inputFileName);
			System.out.println("Compiling source file: " + sourceCode.getAbsolutePath());

			br = new BufferedReader(new FileReader(sourceCode));

			Yylex lexer = new Yylex(br);
			Parser parser = new Parser(lexer);
			Symbol symbol = parser.parse();
/*
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
*/
			if(parser.errorDetected){
				System.out.println("Compilation failed!");
			}
			else{
				pln("Code size: ", Code.pc);
				pln("Main address: ", Code.mainPc);
				pln("Data size: ", Code.dataSize);
				
				Code.write(new FileOutputStream(outputFileName));
				System.out.println("Compilation finished!");
			}

		} 
		finally {
			if (br != null) try { br.close(); } catch (IOException e1) { e1.printStackTrace(); }
		}
	}
}
