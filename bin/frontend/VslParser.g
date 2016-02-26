parser grammar VslParser;

options {
  language = Java;
  output = AST;
  tokenVocab = VslLexer;
}

tokens {
  APPEL_FONCTION;
  PROGRAMME;
  PARAMETRE;
  CORPS;
  INSTRUCTION;
  DECLARATION;
  CONDITION;
  TABLEAU;
  TABLEAU_DECLARATION;
  TABLEAU_ELEMENT;
  BLOC;
}

@parser::header {package frontend;}

program        : unite+ 
                 -> ^(PROGRAMME unite+);

unite          : fonction | prototype;

fonction       : FUNC_KW type IDENT PG parametres PD instruction
                 -> ^(FUNC_KW type IDENT parametres ^(CORPS instruction));

prototype      : PROTO_KW^ type IDENT PG! parametres PD!;
 
type           : INT_KW^ | VOID_KW^;

parametres     : parametre (VIRG parametre)
                 -> ^(PARAMETRE parametre) | -> ^(PARAMETRE);

parametre      : IDENT | IDENT CG CD 
                 -> ^(TABLEAU IDENT);

instruction    : affectation | retourne | impression | lecture | conditionnelle | appelFonction | iteration | bloc;

affectation    : IDENT ASSIGN_KW^ expression | tableau_elem ASSIGN_KW expression 
                 -> ^(ASSIGN_KW tableau_elem expression);

expression     : terme ((PLUS^| MOINS^) terme)*;

terme          : facteur ((MUL^| DIV^) facteur)*;

facteur        : IDENT | tableau_elem | appelFonction | INTEGER | PG! expression PD!;

tableau_elem   : IDENT CG expression CD
                 -> ^(TABLEAU_ELEMENT IDENT expression);                 

retourne       : RETURN_KW^ expression;

impression     : PRINT_KW^ items_imp;

items_imp      : item_imp (VIRG! item_imp)*;

item_imp       : TEXT | expression;

lecture        : READ_KW^ items_lec;

items_lec      : item_lec (VIRG! item_lec)*;

item_lec       : IDENT | tableau_elem;

conditionnelle : IF_KW^ expression THEN_KW! instruction (ELSE_KW! instruction)? FI_KW!;

appelFonction  : IDENT PG arguments? PD
                 -> ^(APPEL_FONCTION IDENT arguments?);

arguments      : expression (VIRG! expression)*;

iteration      : WHILE_KW^ expression DO_KW! instruction OD_KW!;

bloc           : AG declarations instructions AD
                 -> ^(BLOC declarations instructions)
                 | AG declarations AD
                 -> ^(BLOC declarations)
                 | AG instructions AD
                 -> ^(BLOC instructions);
                 
instructions   : instruction+
                 -> ^(INSTRUCTION instruction+);
                 
declarations   : (INT_KW declaration)+ 
                 -> ^(DECLARATION declaration+);

declaration    : item_dec (VIRG! item_dec)*;

item_dec       : IDENT | tableau_dec;

tableau_dec    : IDENT CG INTEGER CD 
                 -> ^(TABLEAU_DECLARATION IDENT INTEGER);


