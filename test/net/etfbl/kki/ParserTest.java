package net.etfbl.kki;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

import rs.etf.pp1.mj.runtime.Code;
import rs.etf.pp1.symboltable.Tab;
import rs.etf.pp1.symboltable.concepts.Obj;
import java_cup.runtime.Symbol;

public class ParserTest {

	public static void pln(int o){
		System.out.println(o);
	}
	
	public static void pln(String str, int o){
		System.out.print(str);
		pln(o);
	}
	
	static void loadLibfunc(Parser p, String mapingFile, String codeFile){
		try {
			BufferedReader br = new BufferedReader(new FileReader(mapingFile));
			
			String line = null;
			while((line = br.readLine()) != null){
				String[] sp = line.split(" ");
				switch(sp[0]){
				case "__strfprint":
					p.__strfprint = new Obj(Obj.Meth, "__strfprint", Tab.noType);
					p.__strfprint.setAdr(Integer.parseInt(sp[2]));
					break;
				case "__strfread":
					p.__strfread = new Obj(Obj.Meth, "__strfread", Tab.noType);
					p.__strfread.setAdr(Integer.parseInt(sp[2]));
					break;
				default:
					
				}
				
			}
			
			BufferedInputStream bis = new BufferedInputStream(new FileInputStream(codeFile));
			int chunk = 0, len = 0;
			while((chunk = bis.read(Code.buf, Code.pc, Code.buf.length - Code.pc)) != -1 ) {
				Code.pc += chunk;
			}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public static void main(String[] args) throws Exception {
		// [ -l ] | [ mapingFile codeFile ] sourceFile
		String inputFileName = "test/program.mj";
		String outputFileName = "test/a.out";
		
		Reader br = null;
		try {
			boolean l = false;
			
			if(args.length >= 2) {
				if("-l".equals(args[0])) l = true;
				inputFileName = args[args.length - 1];
			}
						
			File sourceCode = new File(inputFileName);
			System.out.println("Compiling source file: " + sourceCode.getAbsolutePath());

			br = new BufferedReader(new FileReader(sourceCode));

			Yylex lexer = new Yylex(br);
			Parser parser = new Parser(lexer);
			
			if(args.length >= 3 && !l) {
				loadLibfunc(parser, args[0], args[1]);
			}
			
			Symbol symbol = parser.parse();
			
			if(l){
				FileOutputStream fos = new FileOutputStream("test/libfunc.obj");
				fos.write(Code.buf, 0, Code.pc);
			} else {
			
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

		} 
		finally {
			if (br != null) try { br.close(); } catch (IOException e1) { e1.printStackTrace(); }
		}
	}
}
