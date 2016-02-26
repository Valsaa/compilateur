tree grammar VslTreeExpr;

options {
    tokenVocab=VslParser;
    ASTLabelType=CommonTree;
    language=Java;
}

@treeparser::header{package frontend; import backend.*;}

start 
@init{TableSymboles ts = new TableSymboles();}
: bloc[ts];

//program returns [Code code]
//@init{TableSymbole ts = new TableSymboles(); code = new Code();}
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
//    for(int i = 0 ; i < codes.size() ; i++) {
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
  
//type returns [Type type]
//@init{type = null;}
//: INT_KW^ {type = TypeSystem.T_integer;}
//| VOID_KW^ {type = TypeSystem.T_void;}
//;

//parametres [TableSymboles ts] returns [ArrayList<Code> codes]
//@init{codes = new ArrayList<Code>();}
//: ^(PARAMETRE (c=parametre[ts] {code.add(c);})*)
//;

//parametre [TableSymboles ts] returns [Code code] 
//@init {code = new Code();}
//: id=IDENT {
//    String name = id.getText();
//    Tokatt tok  = TypeSystem.CheckDecParIdent(name, ts);
//    tok.setParam();
//    code.append(Code.genVar(tok));
//  }
//;

instruction [TableSymboles ts] returns [Code code]
@init{code = new Code();}
: c1=affectation[ts] {
      code.append(c1);
  }
| c2=retourne[ts] {
      code.append(c2);
  }
| c3=impression[ts] {
      code.append(c3);
  }
| c4=lecture[ts] {
      code.append(c4);
  } 
//| c5=conditionnelle[ts] {
//      code.append(c5);
//  }
//| c6=appelFonction[ts] {
//      code.append(c6);
//  } 
//| c7=iteration[ts] {
//      code.append(c7);
//  } 
| c8=bloc[ts] {
	  code.append(c8);
	}
;

affectation [TableSymboles ts] returns [Code code]
@init{code = new Code();}
: ^(ASSIGN_KW id=IDENT exp=expression[ts] {
     String name  = id.getText();
     Type   ty    = TypeSystem.CheckIdent(name, ts);
     Tokatt tok   = (Tokatt) ts.Lookup(name);
     
     TypeSystem.CheckAssign(ty, exp.type); 
     code.append(exp.code);     
     code.append(new Inst3a(Inst3a.TAC_COPY, tok, exp.place, null));
  })
;

retourne [TableSymboles ts] returns [Code code] 
@init{code = new Code();}
: ^(RETURN_KW exp=expression[ts]) {
    code.append(new Inst3a(Inst3a.TAC_RETURN, exp.place, null, null));
  }
;

impression [TableSymboles ts] returns [Code code]
@init{code = new Code();}
: ^(PRINT_KW (exp=item_imp[ts] {
      code.append(exp.code);
      Tokatt tok = null;
      if (exp.type == TypeSystem.T_integer)  
          tok = new Tokatt("L2", TypeSystem.T_label);
      else if (exp.type == TypeSystem.T_c_text)         
          tok = new Tokatt("L4", TypeSystem.T_label);
      code.append(new Inst3a(Inst3a.TAC_CALL, null, tok, null));
  })+)
;

item_imp [TableSymboles ts] returns [Expratt exp] 
@init{exp = null;}
: text=TEXT {
    String n    = text.getText();
    Tokatt tok  = new Tokatt(n);
    Code   code = new Code(new Inst3a(Inst3a.TAC_ARG, tok, null, null));
    code.appendData(tok);
    exp = new Expratt(TypeSystem.T_c_text, code, null); 
  }
| exp1=expression[ts] {
    Code code = new Code();
    code.append(exp1.code);
    code.append(new Inst3a(Inst3a.TAC_ARG, exp1.place, null, null));
    exp = new Expratt(exp1.type, code, exp1.place);
  }
;

lecture [TableSymboles ts] returns [Code code]
@init{code = new Code();}
: ^(READ_KW (c=item_lec[ts] {
      code.append(c);
  })+)
;

item_lec [TableSymboles ts] returns [Code code]
@init{code = new Code();}
: id=IDENT {
    String name = id.getText();
    Type   ty   = TypeSystem.CheckIdent(name, ts);
    Tokatt tok1 = (Tokatt) ts.Lookup(name);
    Tokatt tok2 = new Tokatt("L8", TypeSystem.T_label);
    code.append(new Inst3a(Inst3a.TAC_CALL, tok1, tok2, null));
  } 
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
| i=INTEGER {
    int ival = Integer.parseInt(i.getText());
    exp = new Expratt(TypeSystem.T_integer, new Code(), new Tokatt(ival));
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
;
