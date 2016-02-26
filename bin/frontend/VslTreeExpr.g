tree grammar VslTreeExpr;

options {
    tokenVocab=VslParser;
    ASTLabelType=CommonTree;
    language=Java;
}

@treeparser::header{package frontend; import backend.*;}

//program returns [Code code]
//@init{code = new Code(); TableSymboles ts = new TableSymboles();}
//: ^(PROG (c=unite[ts] {
//    code.append(c);
//  })+)
//;
//
//unite [TableSymboles ts] returns [Code code]
//@init{code = new Code();}
//: c=fonction[ts] {
//    code.append(c);
//  }
//| c=prototype[ts] {
//    code.append(c);
//  }
//;
//  
//fonction [TableSymboles ts] returns [Code code] 
//@init{code = new Code();}
//: ^(FUNC_KW 
//  ty=type id=IDENT {    
//    String name = id.getText();
//    Tokatt tok  = TypeSystem.CheckFuncDec(name, new TypeFunction(ty), ts);
//    code.append(Code.genLabel(tok));
//    code.append(new Inst3a(Inst3a.TAC_BEGINFUNC, null, null, null));
//    ts.Enter_Scope();
//  }
//  codes=parametres[ts] {
//    for(int i = 0 ; i < par.size() ; i++) {
//      code.append(codes.at(i));
//    }
//  }    
//  ^(CORPS c2=instruction[ts]) {
//    code.append(c2);
//  }) {
//    ts.Leave_Scope();
//    code.append(new Inst3a(Inst3a.TAC_ENDFUNC, null, null, null));
//  }
//; 

//prototype [TableSymboles ts] returns [Code code]
//@init{code = new Code();}  
//: ^(PROTO_KW ty=type id=IDENT codes=parametres[ts]) {
//    String name  = id.getText();
//    int    scope = ts.getScope();
//    Tokatt tok = TypeSystem.CheckProtoDec(name, new TypeFunction(ty), ts);
//    tok.scope = scope;
//    tok.value = codes.size();
//    ts.Insert(name, tok);
//  }
//;
//  
//type returns [Type type]
//@init{type = null;}
//: INT_KW^ {type = TypeSystem.T_integer;}
//| VOID_KW^ {type = TypeSystem.T_void;}
//;
//
//
//parametres [TableSymboles ts] returns [ArrayList<Code> codes]
//@init{codes = new ArrayList<Code>();}
//: ^(PARAMETRE (c=parametre[ts] {code.add(c);})*)
//;
//
//parametre [TableSymboles ts] returns [Code code] 
//@init {code = new Code();}
//: id=IDENT {
//    String name = id.getText();
//    Tokatt tok  = TypeSystem.CheckDecParIdent(name, ts);
//    code.append(Code.genVar(tok));
//  }
//| ^(TABLEAU id=IDENT) {
//    String name = id.getText();
//    Tokatt tok  = TypeSystem.CheckDecParPointer(name, ts);
//    code.append(Code.genVar(tok));
//  }
//;

instruction [TableSymboles ts] returns [Code code]
@init{code = new Code();}
: c1=affectation[ts] {
      code.append(c1);
  }
  //| retourne[ts, code]
  //| impression[ts, code]
  //| ordreLecture[ts, code] 
  //| conditionnelle[ts, code] 
  //| appelFonction[ts, code] 
  //| iteration[ts, code] 
| c8 = bloc[ts] {
	  code.append(c8);
	}
;

affectation [TableSymboles ts] returns [Code code]
@init{code = new Code();}
: ^(ASSIGN_KW id=IDENT {
     String name = id.getText();
     Type   ty   = TypeSystem.CheckIdent(name, ts);
     Tokatt tok  = (Tokatt) ts.Lookup(name);
     Expratt exp1 = new Expratt(ty, new Code(), tok);
  }
  exp=expression[ts] {
     TypeSystem.CheckAssign(ty, exp.type);      
     Tokatt temp = SymbDistrib.newTemp();
     code.append(Code.genBinOp(Inst3a.TAC_COPY, exp1, exp, temp));
  })
| ^(ASSIGN_KW tok1=tableau_elem[ts] exp=expression[ts] {
    Expratt exp1 = new Expratt(TypeSystem.T_integer, new Code(), tok1);
    TypeSystem.CheckAssign(tok1.type, exp.type);      
    Tokatt temp = SymbDistrib.newTemp();
    
    code.append(exp.code);
    code.append(Code.genBinOp(Inst3a.TAC_TABVAR, exp1, exp, temp));
  })
;

expression [TableSymboles ts] returns [Expratt exp]
  @init{exp = null;}
  : ^(PLUS exp1=expression[ts] exp2=expression[ts]) {
      Type   ty   = TypeSystem.CheckBinOp(exp1.type, exp2.type);
      Tokatt temp = SymbDistrib.newTemp();
      Code   code = Code.genBinOp(Inst3a.TAC_ADD, exp1, exp2, temp);
      exp = new Expratt(ty, code, temp);
     }
  | ^(MOINS exp1=expression[ts] exp2=expression[ts]){
      Type   ty   = TypeSystem.CheckBinOp(exp1.type, exp2.type);
      Tokatt temp = SymbDistrib.newTemp();
      Code   code = Code.genBinOp(Inst3a.TAC_SUB, exp1, exp2, temp);
      exp = new Expratt(ty, code, temp);
    }
  | ^(MUL exp1=expression[ts] exp2=expression[ts]){
      Type   ty   = TypeSystem.CheckBinOp(exp1.type, exp2.type);
      Tokatt temp = SymbDistrib.newTemp();
      Code   code = Code.genBinOp(Inst3a.TAC_MUL, exp1, exp2, temp);
      exp = new Expratt(ty, code, temp);
    }
  | ^(DIV exp1=expression[ts] exp2=expression[ts]){
      Type   ty   = TypeSystem.CheckBinOp(exp1.type, exp2.type);
      Tokatt temp = SymbDistrib.newTemp();
      Code   code = Code.genBinOp(Inst3a.TAC_DIV, exp1, exp2, temp);
      exp = new Expratt(ty, code, temp);
    }
  | exp1 = facteur[ts] {
      exp = exp1;
    }
  ;
  
facteur [TableSymboles ts] returns [Expratt exp]    
@init {exp = null;}
: id=IDENT {
    String name = id.getText();
    Type   ty   = TypeSystem.CheckIdent(name, ts);
    Tokatt tok  = (Tokatt) ts.Lookup(name);
    exp = new Expratt(ty, new Code(), tok);
  }
| tok1 = tableau_elem[ts] {
    Code   code = Code.genVar(tok1);
    exp = new Expratt(TypeSystem.T_integer, code, tok1);
  } 
| i=INTEGER {
    int ival = Integer.parseInt(i.getText());
    exp = new Expratt(TypeSystem.T_integer, new Code(), new Tokatt(ival));
  }
;
  
tableau_elem [TableSymboles ts] returns [Tokatt tok] 
@init{tok = null;}
: ^(TABLEAU_ELEMENT id=IDENT exp=expression[ts]) {
    String name = id.getText();
    Type ty = TypeSystem.CheckIdent(name, ts);
    tok = new Tokatt(name, ty);
  }
;

bloc [TableSymboles ts] returns [Code code]     
@init{code = new Code();}
: ^(BLOC {ts.Enter_Scope();} 
  (c1=declarations[ts] {code.append(c1);}) 
  (c2=instructions[ts] {code.append(c2);})+
  {ts.Leave_Scope();})
| ^(BLOC c3=declarations[ts] {code.append(c3);}) 
| ^(BLOC (c4=instructions[ts] {code.append(c4);})+) 
;

instructions [TableSymboles ts] returns [Code code]
@init{code = new Code();}
: ^(INSTRUCTION (c=instruction[ts]{
    code.append(c);
  })+)
;

declarations [TableSymboles ts] returns [Code code]
@init{code = new Code();}
: ^(DECLARATION (c=item_dec[ts] {code.append(c);})+)
;
  
item_dec [TableSymboles ts] returns [Code code] 
@init{code = new Code();}
: id=IDENT {
    String name = id.getText();
    Tokatt tok  = TypeSystem.CheckDecIdent(name, ts);
    code.append(Code.genVar(tok));
  }
  | c=tableau_dec[ts] {
    code.append(c);
  }
;

tableau_dec [TableSymboles ts] returns [Code code] 
  @init{code = new Code();}
  : ^(TABLEAU_DECLARATION id=IDENT taille=INTEGER) {
        String name = id.getText();
        int    dim  = Integer.parseInt(taille.getText());
        Tokatt tok  = TypeSystem.CheckDecArray(name, dim, ts);
        code.append(Code.genVar(tok));  
    }
  ;
  
variables [TableSymboles ts]  
  :
  ;
 
  
parametres [TableSymboles ts]          
  : expression[ts]
  ;
