package backend;

public class TypeSystem {
	// constant types are created as static attributes of the TypeSystem
	static final public Type T_integer = new Type("INTEGER", 4),
			T_c_integer = new Type("C_INTEGER", 4), T_c_text = new Type("TEXT",
					-1), T_label = new Type("LABEL", -1), T_pointer = new Type(
					"POINTER", 4), T_error = new Type("ERROR", -1),
			T_void = new Type("VOID", 0);

	static public Type TypeInteger() {
		return T_integer;
	}

	static public Type TypeVoid() {
		return T_void;
	}

	static public Type TypePointer() {
		return T_pointer;
	}

	static public Type TypeConstInteger() {
		return T_c_integer;
	}

	static public Type TypeLabel() {
		return T_label;
	}


	/**
	 * verif de type pour declaration d'identificateur Si la déclaration est
	 * correcte, le type est entier (seul possible)
	 */
	static public Tokatt CheckDecIdent(String name, TableSymboles tab) {
		Tokatt to = (Tokatt) tab.Lookup(name);
		if (to != null)
			if (to.scope == tab.getScope())
				error("Double declaration:", name);
			else if ((to.scope == 0) || (to.scope == 1))
				error("Deja utilise comme nom de fonction ou parametre: ", name);

			else if (to.scope < tab.getScope()){// for multiple declaration in different blocks
				to = new Tokatt(T_integer, name, tab.getScope());
				tab.Insert(name, to);
			} 
			else
				error("CheckDecIdent: pas normal!!", "");
		else {
			// first declaration
			to = new Tokatt(T_integer, name, tab.getScope());
			tab.Insert(name, to);
		}
		return to;
	}

	/**
	 * declaration de tableau
	 */
	static public Tokatt CheckDecArray(String name, int dim, TableSymboles tab) {
		Tokatt to = (Tokatt) tab.Lookup(name);
		if (to != null)
			if (to.scope == tab.getScope())
				error("Double declaration:", name);
			else if ((to.scope == 0) || (to.scope == 1))
				error("Deja utilise comme nom de fonction ou parametre: ", name);
			else
				error("CheckDecIdent: pas normal!!", "");
		else {
			to = new Tokatt(new TypeArray(T_integer, dim), name, tab.getScope());
			tab.Insert(name, to);
		}
		return to;
	}

	/**
	 * declaration de parametre entier
	 */
	static public Tokatt CheckDecParIdent(String name, TableSymboles tab) {
		Tokatt to = (Tokatt) tab.Lookup(name);
		if (to != null)
			if (to.scope == tab.getScope())
				error("Double declaration de parametre: ", name);
			else
				error("Nom de fonction utilisé en parametre:", name);
		else { // first declaration
			to = new Tokatt(T_integer, name, tab.getScope());
			tab.Insert(name, to);
		}
		return to;
	}

	/**
	 * declaration de parametre tableau
	 */
	static public Tokatt CheckDecParPointer(String name, TableSymboles tab) {
		Tokatt to = (Tokatt) tab.Lookup(name);
		if (to != null)
			if (to.scope == tab.getScope())
				error("Double declaration de parametre: ", name);
			else
				error("Nom de fonction utilise en parametre:", name);
		else {
			to = new Tokatt(T_pointer, name, tab.getScope());
			tab.Insert(name, to);
		}
		return to;
	}

	/**
	 * declaration de nom de fonction
	 */
	static public void CheckFuncName(String name, TypeFunction tf,
			TableSymboles tab) {
		Tokatt to = (Tokatt) tab.Lookup(name);
		if (to != null){
			if (!((TypeFunction) to.type).IsProto()){
				error("Double définition de fonction", name);
			}
			//else{
			//	error("C'est quoi ce bazard??", name);
			//}
		}
		else {
			to = new Tokatt(tf, name, tab.getScope());
			to.label = SymbDistrib.newLabel(name);
			tab.Insert(name, to);
		}
	}

	/**
	 * declaration de fonction
	 */
	static public Tokatt CheckFuncDec(String name, TypeFunction tf,
			TableSymboles tab) {
		Tokatt to = (Tokatt) tab.Lookup(name);
		if (to != null) {
			if (to.scope != 0)
				error("Mais qu'est ce qui se passe??", name);
			if (((TypeFunction) to.type).IsProto())
				if (tf.isCompatible(to.type))
					((TypeFunction) to.type).Proto2Fonc();
				else
					error("Declaration non conforme au prototype", name);
		} 
		else
			error("Mais qu'est ce qui se passe", name);
		return to;
	}

	/**
	 * declaration de proto
	 */
	static public Tokatt CheckProtoDec(String name, TypeFunction tf,
			TableSymboles tab) {
		Tokatt to = (Tokatt) tab.Lookup(name);
		if (to != null)
			error("Fonction definie ou prototypee: ", name);
		else {
			to = new Tokatt(tf, name, 0);
		}
		return to;
	}

	/**
	 * utilisation d'un identificateur dans expression (type doit etre entier ou
	 * pointeur )
	 */
	public static Type CheckIdent(String name, TableSymboles ts) {
		Tokatt to = (Tokatt) ts.Lookup(name);
		if (to == null) {
			error(name, " non declare");
			return T_error;
		} else if (to.type == T_integer)
			return T_integer;
		else if (to.isArray())
			return T_pointer;
		else
			return T_error;

	}

	/**
	 * verif du type de deux operandes d'une operation binaire entiere
	 */

	public static Type CheckBinOp(Type t1, Type t2) {
		if (t1 == T_integer && t1 == T_integer)
			return T_integer;
		else
			return T_error;
	}

	/**
	 * verif de type pour appel de fonction
	 * 
	 * @param name:
	 *            name of the function
	 * @param typarg:
	 *            TypeFunction inferred from the function call
	 * @param tab
	 * @return
	 */
	public static Type CheckFuncCall(String name, Type typarg, TableSymboles tab) {
		Tokatt to = (Tokatt) tab.Lookup(name);
		if (to == null) {
			error("Fonction non déclarée: ", name);
			return T_error;
		} else {
			Type ty = to.type; // System.out.println(ty.toString());
			// System.out.println(typarg.toString());
			if (typarg.isCompatible(ty)) {
				return T_integer;
			} else {
				error(name, " : appel de fonction incorrect");
				return T_error;
			}
		}
	}

	public static void error(String s1, String s2) {
		System.out.println("TypeSystem: "+s1 + s2);
	}

	public static void error1(String s1, String s2, int line) {
		System.out.println(s1 + s2 + " line:" + line);
	}

	/**
	 * type control for assignement
	 */
	public static void CheckAssign(Type leftType, Type rightType) {
		if (!(leftType == T_integer && rightType == T_integer)) {
			if (leftType != T_integer)
				error("not int left", " ");
			if (rightType != T_integer)
				error("not int right", " ");
			error("Type incompatible in assignement", " ");
		}

	}

	/**
	 * type control for array element
	 */
	public static Type CheckArrayEl(String name, Type indice, TableSymboles tab) {
		Tokatt to = (Tokatt) tab.Lookup(name);
		if (to == null) {
			error("Tableau non déclaré: ", name);
			return T_error;
		}
		if (to.isArray() || to.isPointer()) {
			if (indice == T_error)
				return T_error;
			else
				return T_integer;
		} else {
			error(" erreur de type, tableau attendu:", name);
			return T_error;
		}
	}
}// end TypeSystem
