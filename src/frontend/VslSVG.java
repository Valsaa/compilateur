package frontend;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.DOTTreeGenerator;
import org.antlr.stringtemplate.StringTemplate;

public class VslSVG {

    /**
     * @param args
     */
    public static void main(String[] args) throws IOException, RecognitionException {
		if(args.length > 2 || args.length == 0){
			System.out.println("Usage fichier.vsl [fichier[.svg]]");
			System.exit(-1);
		}
		
		String vsl = args[0];
		boolean svg = (args.length == 2);
		String dotFile = null;
		String svgFile = null;
		if (svg){
		    svgFile = args[1];
		    String base = null;
		    if(svgFile.endsWith(".svg")){
		    	Pattern p = Pattern.compile("(.*).svg");
		    	Matcher m = p.matcher(svgFile);
		    	m.matches();
		    	base = m.group(1);
		    }
		    else{
		    	base = svgFile ;
		    	svgFile = base+".svg";
		    }
		    dotFile = base+".dot";
		    System.out.println(dotFile);
		}
		
        ANTLRFileStream input = new ANTLRFileStream (args[0]);
        VslLexer lexer = new VslLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        VslParser parser = new VslParser(tokens);
        VslParser.program_return r = parser.program();
        CommonTree tree = (CommonTree)r.getTree();
        // Pour afficher l'AST sur la sortie standard
        //System.out.println(tree.toStringTree());
        DOTTreeGenerator gen = new DOTTreeGenerator();
        StringTemplate st = gen.toDOT(tree);
		if(svg){
			FileOutputStream fileDot = new FileOutputStream(dotFile);
			DataOutputStream dos = new DataOutputStream(fileDot);
			dos.writeBytes(st.toString());
			fileDot.close();
			Process p = new ProcessBuilder("/usr/bin/dot","-Tsvg", dotFile, "-o", svgFile).start();
		}
		else
			System.out.println(st);
    }
}