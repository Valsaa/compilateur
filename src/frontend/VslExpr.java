package frontend;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintStream;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeNodeStream;

import backend.Code;
import backend.TableSymboles;

public class VslExpr {
	public static void main(String[] args) throws Exception {
		File f; FileReader s;
		PrintStream output;
		try {

			if( (args.length > 2) || (args.length == 0)) {
				System.err.println("Usage: Vsl fichier.vsl [fichier.s]");
				System.exit(1);
			};

			f = new File(args[0]);
			s = new FileReader(f);

			if(args.length == 2){
				output = new PrintStream(new File(args[1]));
			}
			else{
				output = System.out;
			}


			ANTLRFileStream input = new ANTLRFileStream(args[0]);
			VslLexer lexer = new VslLexer(input);
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			VslParser parser = new VslParser(tokens);
			VslParser.bloc_return r = parser.bloc();


			//resulting tree
			CommonTree t = (CommonTree)r.getTree();

			// Print the resulting tree out in LISP notation
			System.out.println(t.toStringTree());

			CommonTreeNodeStream nodes = new CommonTreeNodeStream(t);
			VslTreeExpr tparser = new VslTreeExpr(nodes);

			Code c3a;

			try {
				c3a = tparser.bloc(new TableSymboles());
				c3a.print();
				
//				CodeGenerator cg = new CodeGenerator(output);
//
//				cg.addStubPrint(c3a);
//				cg.addStubMain(c3a);
//
//				cg.genCodeMIPS(c3a);
			}
			catch (Exception e) {
				System.err.println(e.getMessage());
				e.printStackTrace();
			}





		}
		catch (FileNotFoundException fnf){
			System.err.println("exception: "+fnf);
		}



	}
}
