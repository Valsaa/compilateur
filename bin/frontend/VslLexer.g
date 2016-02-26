// Définit le type de grammaire : lexical
lexer grammar VslLexer;


options {
  // Le langage cible pour la génération de code
  language = Java;
}

// Assure l'inclusion du package frontend au début des classes lexicales Java générées
@lexer::header {package frontend;}

// Définition des règles associées au langage VSL
WS              :  (' '|'\n'|'\t'|'\r')
                   {skip();}
                ;
                

COMMENT   : '//'(~'\n')* {skip();}
    ;

// Déclaration de mots-clés réutilisables dans la définition de règles
fragment
LETTER    : 'a'..'z' ;

fragment
DIGIT   : '0'..'9' ;

fragment
ASCII   : ~( '\"' );

IDENT   : LETTER( LETTER|DIGIT )* 
      ;
TEXT    : '\"' ASCII* '\"';


INTEGER   : DIGIT+ ;
PG    : '(' ;
PD    : ')' ;
CG    : '[' ;
CD    : ']' ;
AG    : '{' ;
AD    : '}' ;
VIRG    : ',' ;
FUNC_KW   : 'FUNC' ;
PROTO_KW  : 'PROTO' ;
INT_KW    : 'INT' ;
VOID_KW   : 'VOID' ;
ASSIGN_KW : ':=' ;
RETURN_KW : 'RETURN' ;
PRINT_KW  : 'PRINT' ;
READ_KW   : 'READ' ;
IF_KW   : 'IF' ;
THEN_KW   : 'THEN' ;
ELSE_KW   : 'ELSE' ;
FI_KW   : 'FI' ;
WHILE_KW  : 'WHILE' ;
DO_KW   : 'DO' ;
OD_KW   : 'DONE' ;
PLUS    : '+' ;
MOINS   : '-' ;
MUL   : '*' ;
DIV   : '/' ;

