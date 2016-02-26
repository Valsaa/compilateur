package backend;

public class Code extends Code3a{
	private static boolean error = false;
	 public Code (){
		 super ();
	 }
	 
		 public Code(Inst3a i){
		 super(i);
	 }

	
	 public static Code genVar(Operand3a t){
		  Inst3a i= new Inst3a(Inst3a.TAC_VAR, t, null, null);
		  return new Code(i);
	 }


	 public static Code genBinOp(int op, Expratt exp1, Expratt exp2, Operand3a temp){
		  Code cod = exp1.code;
		  cod.append(exp2.code);
		  cod.append(genVar(temp)); 
		  Inst3a i = new Inst3a(op, temp, exp1.place, exp2.place);
		  cod.append(new Code(i));
		  return cod;
	 }




} // Code ***
