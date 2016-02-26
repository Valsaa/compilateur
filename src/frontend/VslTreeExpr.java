// $ANTLR 3.4 /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g 2016-02-26 10:34:14
package frontend; import backend.*;

import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class VslTreeExpr extends TreeParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "AD", "AG", "ASCII", "ASSIGN_KW", "CD", "CG", "COMMENT", "DIGIT", "DIV", "DO_KW", "ELSE_KW", "FI_KW", "FUNC_KW", "IDENT", "IF_KW", "INTEGER", "INT_KW", "LETTER", "MOINS", "MUL", "OD_KW", "PD", "PG", "PLUS", "PRINT_KW", "PROTO_KW", "READ_KW", "RETURN_KW", "TEXT", "THEN_KW", "VIRG", "VOID_KW", "WHILE_KW", "WS", "APPEL_FONCTION", "BLOC", "CONDITION", "CORPS", "DECLARATION", "INSTRUCTION", "PARAMETRE", "PROGRAMME", "TABLEAU", "TABLEAU_DECLARATION", "TABLEAU_ELEMENT"
    };

    public static final int EOF=-1;
    public static final int AD=4;
    public static final int AG=5;
    public static final int ASCII=6;
    public static final int ASSIGN_KW=7;
    public static final int CD=8;
    public static final int CG=9;
    public static final int COMMENT=10;
    public static final int DIGIT=11;
    public static final int DIV=12;
    public static final int DO_KW=13;
    public static final int ELSE_KW=14;
    public static final int FI_KW=15;
    public static final int FUNC_KW=16;
    public static final int IDENT=17;
    public static final int IF_KW=18;
    public static final int INTEGER=19;
    public static final int INT_KW=20;
    public static final int LETTER=21;
    public static final int MOINS=22;
    public static final int MUL=23;
    public static final int OD_KW=24;
    public static final int PD=25;
    public static final int PG=26;
    public static final int PLUS=27;
    public static final int PRINT_KW=28;
    public static final int PROTO_KW=29;
    public static final int READ_KW=30;
    public static final int RETURN_KW=31;
    public static final int TEXT=32;
    public static final int THEN_KW=33;
    public static final int VIRG=34;
    public static final int VOID_KW=35;
    public static final int WHILE_KW=36;
    public static final int WS=37;
    public static final int APPEL_FONCTION=38;
    public static final int BLOC=39;
    public static final int CONDITION=40;
    public static final int CORPS=41;
    public static final int DECLARATION=42;
    public static final int INSTRUCTION=43;
    public static final int PARAMETRE=44;
    public static final int PROGRAMME=45;
    public static final int TABLEAU=46;
    public static final int TABLEAU_DECLARATION=47;
    public static final int TABLEAU_ELEMENT=48;

    // delegates
    public TreeParser[] getDelegates() {
        return new TreeParser[] {};
    }

    // delegators


    public VslTreeExpr(TreeNodeStream input) {
        this(input, new RecognizerSharedState());
    }
    public VslTreeExpr(TreeNodeStream input, RecognizerSharedState state) {
        super(input, state);
    }

    public String[] getTokenNames() { return VslTreeExpr.tokenNames; }
    public String getGrammarFileName() { return "/home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g"; }



    // $ANTLR start "instruction"
    // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:89:1: instruction[TableSymboles ts] returns [Code code] : (c1= affectation[ts] |c8= bloc[ts] );
    public final Code instruction(TableSymboles ts) throws RecognitionException {
        Code code = null;


        Code c1 =null;

        Code c8 =null;


        code = new Code();
        try {
            // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:91:3: (c1= affectation[ts] |c8= bloc[ts] )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==ASSIGN_KW) ) {
                alt1=1;
            }
            else if ( (LA1_0==BLOC) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;

            }
            switch (alt1) {
                case 1 :
                    // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:91:3: c1= affectation[ts]
                    {
                    pushFollow(FOLLOW_affectation_in_instruction142);
                    c1=affectation(ts);

                    state._fsp--;



                          code.append(c1);
                      

                    }
                    break;
                case 2 :
                    // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:100:3: c8= bloc[ts]
                    {
                    pushFollow(FOLLOW_bloc_in_instruction171);
                    c8=bloc(ts);

                    state._fsp--;



                    	  code.append(c8);
                    	

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return code;
    }
    // $ANTLR end "instruction"



    // $ANTLR start "affectation"
    // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:105:1: affectation[TableSymboles ts] returns [Code code] : ( ^( ASSIGN_KW id= IDENT exp= expression[ts] ) | ^( ASSIGN_KW tok1= tableau_elem[ts] exp= expression[ts] ) );
    public final Code affectation(TableSymboles ts) throws RecognitionException {
        Code code = null;


        CommonTree id=null;
        Expratt exp =null;

        Tokatt tok1 =null;


        code = new Code();
        try {
            // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:107:3: ( ^( ASSIGN_KW id= IDENT exp= expression[ts] ) | ^( ASSIGN_KW tok1= tableau_elem[ts] exp= expression[ts] ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==ASSIGN_KW) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==DOWN) ) {
                    int LA2_2 = input.LA(3);

                    if ( (LA2_2==IDENT) ) {
                        alt2=1;
                    }
                    else if ( (LA2_2==TABLEAU_ELEMENT) ) {
                        alt2=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 2, input);

                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }
            switch (alt2) {
                case 1 :
                    // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:107:3: ^( ASSIGN_KW id= IDENT exp= expression[ts] )
                    {
                    match(input,ASSIGN_KW,FOLLOW_ASSIGN_KW_in_affectation194); 

                    match(input, Token.DOWN, null); 
                    id=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_affectation198); 


                         String name = id.getText();
                         Type   ty   = TypeSystem.CheckIdent(name, ts);
                         Tokatt tok  = (Tokatt) ts.Lookup(name);
                         Expratt exp1 = new Expratt(ty, new Code(), tok);
                      

                    pushFollow(FOLLOW_expression_in_affectation206);
                    exp=expression(ts);

                    state._fsp--;



                         TypeSystem.CheckAssign(ty, exp.type);      
                         Tokatt temp = SymbDistrib.newTemp();
                         code.append(Code.genBinOp(Inst3a.TAC_COPY, exp1, exp, temp));
                      

                    match(input, Token.UP, null); 


                    }
                    break;
                case 2 :
                    // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:118:3: ^( ASSIGN_KW tok1= tableau_elem[ts] exp= expression[ts] )
                    {
                    match(input,ASSIGN_KW,FOLLOW_ASSIGN_KW_in_affectation215); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_tableau_elem_in_affectation219);
                    tok1=tableau_elem(ts);

                    state._fsp--;


                    pushFollow(FOLLOW_expression_in_affectation224);
                    exp=expression(ts);

                    state._fsp--;



                        Expratt exp1 = new Expratt(TypeSystem.T_integer, new Code(), tok1);
                        TypeSystem.CheckAssign(tok1.type, exp.type);      
                        Tokatt temp = SymbDistrib.newTemp();
                        
                        code.append(exp.code);
                        code.append(Code.genBinOp(Inst3a.TAC_TABVAR, exp1, exp, temp));
                      

                    match(input, Token.UP, null); 


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return code;
    }
    // $ANTLR end "affectation"



    // $ANTLR start "expression"
    // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:128:1: expression[TableSymboles ts] returns [Expratt exp] : ( ^( PLUS exp1= expression[ts] exp2= expression[ts] ) | ^( MOINS exp1= expression[ts] exp2= expression[ts] ) | ^( MUL exp1= expression[ts] exp2= expression[ts] ) | ^( DIV exp1= expression[ts] exp2= expression[ts] ) |exp1= facteur[ts] );
    public final Expratt expression(TableSymboles ts) throws RecognitionException {
        Expratt exp = null;


        Expratt exp1 =null;

        Expratt exp2 =null;


        exp = null;
        try {
            // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:130:3: ( ^( PLUS exp1= expression[ts] exp2= expression[ts] ) | ^( MOINS exp1= expression[ts] exp2= expression[ts] ) | ^( MUL exp1= expression[ts] exp2= expression[ts] ) | ^( DIV exp1= expression[ts] exp2= expression[ts] ) |exp1= facteur[ts] )
            int alt3=5;
            switch ( input.LA(1) ) {
            case PLUS:
                {
                alt3=1;
                }
                break;
            case MOINS:
                {
                alt3=2;
                }
                break;
            case MUL:
                {
                alt3=3;
                }
                break;
            case DIV:
                {
                alt3=4;
                }
                break;
            case IDENT:
            case INTEGER:
            case TABLEAU_ELEMENT:
                {
                alt3=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;

            }

            switch (alt3) {
                case 1 :
                    // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:130:5: ^( PLUS exp1= expression[ts] exp2= expression[ts] )
                    {
                    match(input,PLUS,FOLLOW_PLUS_in_expression252); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression256);
                    exp1=expression(ts);

                    state._fsp--;


                    pushFollow(FOLLOW_expression_in_expression261);
                    exp2=expression(ts);

                    state._fsp--;


                    match(input, Token.UP, null); 



                          Type   ty   = TypeSystem.CheckBinOp(exp1.type, exp2.type);
                          Tokatt temp = SymbDistrib.newTemp();
                          Code   code = Code.genBinOp(Inst3a.TAC_ADD, exp1, exp2, temp);
                          exp = new Expratt(ty, code, temp);
                         

                    }
                    break;
                case 2 :
                    // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:136:5: ^( MOINS exp1= expression[ts] exp2= expression[ts] )
                    {
                    match(input,MOINS,FOLLOW_MOINS_in_expression272); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression276);
                    exp1=expression(ts);

                    state._fsp--;


                    pushFollow(FOLLOW_expression_in_expression281);
                    exp2=expression(ts);

                    state._fsp--;


                    match(input, Token.UP, null); 



                          Type   ty   = TypeSystem.CheckBinOp(exp1.type, exp2.type);
                          Tokatt temp = SymbDistrib.newTemp();
                          Code   code = Code.genBinOp(Inst3a.TAC_SUB, exp1, exp2, temp);
                          exp = new Expratt(ty, code, temp);
                        

                    }
                    break;
                case 3 :
                    // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:142:5: ^( MUL exp1= expression[ts] exp2= expression[ts] )
                    {
                    match(input,MUL,FOLLOW_MUL_in_expression291); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression295);
                    exp1=expression(ts);

                    state._fsp--;


                    pushFollow(FOLLOW_expression_in_expression300);
                    exp2=expression(ts);

                    state._fsp--;


                    match(input, Token.UP, null); 



                          Type   ty   = TypeSystem.CheckBinOp(exp1.type, exp2.type);
                          Tokatt temp = SymbDistrib.newTemp();
                          Code   code = Code.genBinOp(Inst3a.TAC_MUL, exp1, exp2, temp);
                          exp = new Expratt(ty, code, temp);
                        

                    }
                    break;
                case 4 :
                    // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:148:5: ^( DIV exp1= expression[ts] exp2= expression[ts] )
                    {
                    match(input,DIV,FOLLOW_DIV_in_expression310); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression314);
                    exp1=expression(ts);

                    state._fsp--;


                    pushFollow(FOLLOW_expression_in_expression319);
                    exp2=expression(ts);

                    state._fsp--;


                    match(input, Token.UP, null); 



                          Type   ty   = TypeSystem.CheckBinOp(exp1.type, exp2.type);
                          Tokatt temp = SymbDistrib.newTemp();
                          Code   code = Code.genBinOp(Inst3a.TAC_DIV, exp1, exp2, temp);
                          exp = new Expratt(ty, code, temp);
                        

                    }
                    break;
                case 5 :
                    // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:154:5: exp1= facteur[ts]
                    {
                    pushFollow(FOLLOW_facteur_in_expression332);
                    exp1=facteur(ts);

                    state._fsp--;



                          exp = exp1;
                        

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return exp;
    }
    // $ANTLR end "expression"



    // $ANTLR start "facteur"
    // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:159:1: facteur[TableSymboles ts] returns [Expratt exp] : (id= IDENT |tok1= tableau_elem[ts] |i= INTEGER );
    public final Expratt facteur(TableSymboles ts) throws RecognitionException {
        Expratt exp = null;


        CommonTree id=null;
        CommonTree i=null;
        Tokatt tok1 =null;


        exp = null;
        try {
            // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:161:3: (id= IDENT |tok1= tableau_elem[ts] |i= INTEGER )
            int alt4=3;
            switch ( input.LA(1) ) {
            case IDENT:
                {
                alt4=1;
                }
                break;
            case TABLEAU_ELEMENT:
                {
                alt4=2;
                }
                break;
            case INTEGER:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;

            }

            switch (alt4) {
                case 1 :
                    // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:161:3: id= IDENT
                    {
                    id=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_facteur365); 


                        String name = id.getText();
                        Type   ty   = TypeSystem.CheckIdent(name, ts);
                        Tokatt tok  = (Tokatt) ts.Lookup(name);
                        exp = new Expratt(ty, new Code(), tok);
                      

                    }
                    break;
                case 2 :
                    // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:167:3: tok1= tableau_elem[ts]
                    {
                    pushFollow(FOLLOW_tableau_elem_in_facteur375);
                    tok1=tableau_elem(ts);

                    state._fsp--;



                        Code   code = Code.genVar(tok1);
                        exp = new Expratt(TypeSystem.T_integer, code, tok1);
                      

                    }
                    break;
                case 3 :
                    // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:171:3: i= INTEGER
                    {
                    i=(CommonTree)match(input,INTEGER,FOLLOW_INTEGER_in_facteur385); 


                        int ival = Integer.parseInt(i.getText());
                        exp = new Expratt(TypeSystem.T_integer, new Code(), new Tokatt(ival));
                      

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return exp;
    }
    // $ANTLR end "facteur"



    // $ANTLR start "tableau_elem"
    // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:177:1: tableau_elem[TableSymboles ts] returns [Tokatt tok] : ^( TABLEAU_ELEMENT id= IDENT exp= expression[ts] ) ;
    public final Tokatt tableau_elem(TableSymboles ts) throws RecognitionException {
        Tokatt tok = null;


        CommonTree id=null;
        Expratt exp =null;


        tok = null;
        try {
            // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:179:3: ( ^( TABLEAU_ELEMENT id= IDENT exp= expression[ts] ) )
            // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:179:3: ^( TABLEAU_ELEMENT id= IDENT exp= expression[ts] )
            {
            match(input,TABLEAU_ELEMENT,FOLLOW_TABLEAU_ELEMENT_in_tableau_elem410); 

            match(input, Token.DOWN, null); 
            id=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_tableau_elem414); 

            pushFollow(FOLLOW_expression_in_tableau_elem418);
            exp=expression(ts);

            state._fsp--;


            match(input, Token.UP, null); 



                String name = id.getText();
                Type ty = TypeSystem.CheckIdent(name, ts);
                tok = new Tokatt(name, ty);
              

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return tok;
    }
    // $ANTLR end "tableau_elem"



    // $ANTLR start "bloc"
    // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:186:1: bloc[TableSymboles ts] returns [Code code] : ( ^( BLOC (c1= declarations[ts] ) (c2= instructions[ts] )+ ) | ^( BLOC c3= declarations[ts] ) | ^( BLOC (c4= instructions[ts] )+ ) );
    public final Code bloc(TableSymboles ts) throws RecognitionException {
        Code code = null;


        Code c1 =null;

        Code c2 =null;

        Code c3 =null;

        Code c4 =null;


        code = new Code();
        try {
            // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:188:3: ( ^( BLOC (c1= declarations[ts] ) (c2= instructions[ts] )+ ) | ^( BLOC c3= declarations[ts] ) | ^( BLOC (c4= instructions[ts] )+ ) )
            int alt7=3;
            alt7 = dfa7.predict(input);
            switch (alt7) {
                case 1 :
                    // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:188:3: ^( BLOC (c1= declarations[ts] ) (c2= instructions[ts] )+ )
                    {
                    match(input,BLOC,FOLLOW_BLOC_in_bloc447); 

                    ts.Enter_Scope();

                    match(input, Token.DOWN, null); 
                    // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:189:3: (c1= declarations[ts] )
                    // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:189:4: c1= declarations[ts]
                    {
                    pushFollow(FOLLOW_declarations_in_bloc457);
                    c1=declarations(ts);

                    state._fsp--;


                    code.append(c1);

                    }


                    // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:190:3: (c2= instructions[ts] )+
                    int cnt5=0;
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==INSTRUCTION) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:190:4: c2= instructions[ts]
                    	    {
                    	    pushFollow(FOLLOW_instructions_in_bloc469);
                    	    c2=instructions(ts);

                    	    state._fsp--;


                    	    code.append(c2);

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt5 >= 1 ) break loop5;
                                EarlyExitException eee =
                                    new EarlyExitException(5, input);
                                throw eee;
                        }
                        cnt5++;
                    } while (true);


                    ts.Leave_Scope();

                    match(input, Token.UP, null); 


                    }
                    break;
                case 2 :
                    // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:192:3: ^( BLOC c3= declarations[ts] )
                    {
                    match(input,BLOC,FOLLOW_BLOC_in_bloc484); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_declarations_in_bloc488);
                    c3=declarations(ts);

                    state._fsp--;


                    code.append(c3);

                    match(input, Token.UP, null); 


                    }
                    break;
                case 3 :
                    // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:193:3: ^( BLOC (c4= instructions[ts] )+ )
                    {
                    match(input,BLOC,FOLLOW_BLOC_in_bloc498); 

                    match(input, Token.DOWN, null); 
                    // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:193:10: (c4= instructions[ts] )+
                    int cnt6=0;
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==INSTRUCTION) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:193:11: c4= instructions[ts]
                    	    {
                    	    pushFollow(FOLLOW_instructions_in_bloc503);
                    	    c4=instructions(ts);

                    	    state._fsp--;


                    	    code.append(c4);

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt6 >= 1 ) break loop6;
                                EarlyExitException eee =
                                    new EarlyExitException(6, input);
                                throw eee;
                        }
                        cnt6++;
                    } while (true);


                    match(input, Token.UP, null); 


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return code;
    }
    // $ANTLR end "bloc"



    // $ANTLR start "instructions"
    // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:196:1: instructions[TableSymboles ts] returns [Code code] : ^( INSTRUCTION (c= instruction[ts] )+ ) ;
    public final Code instructions(TableSymboles ts) throws RecognitionException {
        Code code = null;


        Code c =null;


        code = new Code();
        try {
            // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:198:3: ( ^( INSTRUCTION (c= instruction[ts] )+ ) )
            // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:198:3: ^( INSTRUCTION (c= instruction[ts] )+ )
            {
            match(input,INSTRUCTION,FOLLOW_INSTRUCTION_in_instructions530); 

            match(input, Token.DOWN, null); 
            // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:198:17: (c= instruction[ts] )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==ASSIGN_KW||LA8_0==BLOC) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:198:18: c= instruction[ts]
            	    {
            	    pushFollow(FOLLOW_instruction_in_instructions535);
            	    c=instruction(ts);

            	    state._fsp--;



            	        code.append(c);
            	      

            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);


            match(input, Token.UP, null); 


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return code;
    }
    // $ANTLR end "instructions"



    // $ANTLR start "declarations"
    // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:203:1: declarations[TableSymboles ts] returns [Code code] : ^( DECLARATION (c= item_dec[ts] )+ ) ;
    public final Code declarations(TableSymboles ts) throws RecognitionException {
        Code code = null;


        Code c =null;


        code = new Code();
        try {
            // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:205:3: ( ^( DECLARATION (c= item_dec[ts] )+ ) )
            // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:205:3: ^( DECLARATION (c= item_dec[ts] )+ )
            {
            match(input,DECLARATION,FOLLOW_DECLARATION_in_declarations560); 

            match(input, Token.DOWN, null); 
            // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:205:17: (c= item_dec[ts] )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==IDENT||LA9_0==TABLEAU_DECLARATION) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:205:18: c= item_dec[ts]
            	    {
            	    pushFollow(FOLLOW_item_dec_in_declarations565);
            	    c=item_dec(ts);

            	    state._fsp--;


            	    code.append(c);

            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
            } while (true);


            match(input, Token.UP, null); 


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return code;
    }
    // $ANTLR end "declarations"



    // $ANTLR start "item_dec"
    // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:208:1: item_dec[TableSymboles ts] returns [Code code] : (id= IDENT |c= tableau_dec[ts] );
    public final Code item_dec(TableSymboles ts) throws RecognitionException {
        Code code = null;


        CommonTree id=null;
        Code c =null;


        code = new Code();
        try {
            // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:210:3: (id= IDENT |c= tableau_dec[ts] )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==IDENT) ) {
                alt10=1;
            }
            else if ( (LA10_0==TABLEAU_DECLARATION) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;

            }
            switch (alt10) {
                case 1 :
                    // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:210:3: id= IDENT
                    {
                    id=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_item_dec595); 


                        String name = id.getText();
                        Tokatt tok  = TypeSystem.CheckDecIdent(name, ts);
                        code.append(Code.genVar(tok));
                      

                    }
                    break;
                case 2 :
                    // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:215:5: c= tableau_dec[ts]
                    {
                    pushFollow(FOLLOW_tableau_dec_in_item_dec605);
                    c=tableau_dec(ts);

                    state._fsp--;



                        code.append(c);
                      

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return code;
    }
    // $ANTLR end "item_dec"



    // $ANTLR start "tableau_dec"
    // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:220:1: tableau_dec[TableSymboles ts] returns [Code code] : ^( TABLEAU_DECLARATION id= IDENT taille= INTEGER ) ;
    public final Code tableau_dec(TableSymboles ts) throws RecognitionException {
        Code code = null;


        CommonTree id=null;
        CommonTree taille=null;

        code = new Code();
        try {
            // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:222:3: ( ^( TABLEAU_DECLARATION id= IDENT taille= INTEGER ) )
            // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:222:5: ^( TABLEAU_DECLARATION id= IDENT taille= INTEGER )
            {
            match(input,TABLEAU_DECLARATION,FOLLOW_TABLEAU_DECLARATION_in_tableau_dec633); 

            match(input, Token.DOWN, null); 
            id=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_tableau_dec637); 

            taille=(CommonTree)match(input,INTEGER,FOLLOW_INTEGER_in_tableau_dec641); 

            match(input, Token.UP, null); 



                    String name = id.getText();
                    int    dim  = Integer.parseInt(taille.getText());
                    Tokatt tok  = TypeSystem.CheckDecArray(name, dim, ts);
                    code.append(Code.genVar(tok));  
                

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return code;
    }
    // $ANTLR end "tableau_dec"



    // $ANTLR start "variables"
    // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:230:1: variables[TableSymboles ts] :;
    public final void variables(TableSymboles ts) throws RecognitionException {
        try {
            // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:231:3: ()
            // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:232:3: 
            {
            }

        }
        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "variables"



    // $ANTLR start "parametres"
    // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:235:1: parametres[TableSymboles ts] : expression[ts] ;
    public final void parametres(TableSymboles ts) throws RecognitionException {
        try {
            // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:236:3: ( expression[ts] )
            // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:236:5: expression[ts]
            {
            pushFollow(FOLLOW_expression_in_parametres690);
            expression(ts);

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "parametres"

    // Delegated rules


    protected DFA7 dfa7 = new DFA7(this);
    static final String DFA7_eotS =
        "\17\uffff";
    static final String DFA7_eofS =
        "\17\uffff";
    static final String DFA7_minS =
        "\1\47\1\2\1\52\1\2\1\uffff\1\21\1\3\1\2\1\3\1\21\2\uffff\1\23\2"+
        "\3";
    static final String DFA7_maxS =
        "\1\47\1\2\1\53\1\2\1\uffff\2\57\1\2\1\53\1\21\2\uffff\1\23\1\3\1"+
        "\57";
    static final String DFA7_acceptS =
        "\4\uffff\1\3\5\uffff\1\1\1\2\3\uffff";
    static final String DFA7_specialS =
        "\17\uffff}>";
    static final String[] DFA7_transitionS = {
            "\1\1",
            "\1\2",
            "\1\3\1\4",
            "\1\5",
            "",
            "\1\6\35\uffff\1\7",
            "\1\10\15\uffff\1\6\35\uffff\1\7",
            "\1\11",
            "\1\13\47\uffff\1\12",
            "\1\14",
            "",
            "",
            "\1\15",
            "\1\16",
            "\1\10\15\uffff\1\6\35\uffff\1\7"
    };

    static final short[] DFA7_eot = DFA.unpackEncodedString(DFA7_eotS);
    static final short[] DFA7_eof = DFA.unpackEncodedString(DFA7_eofS);
    static final char[] DFA7_min = DFA.unpackEncodedStringToUnsignedChars(DFA7_minS);
    static final char[] DFA7_max = DFA.unpackEncodedStringToUnsignedChars(DFA7_maxS);
    static final short[] DFA7_accept = DFA.unpackEncodedString(DFA7_acceptS);
    static final short[] DFA7_special = DFA.unpackEncodedString(DFA7_specialS);
    static final short[][] DFA7_transition;

    static {
        int numStates = DFA7_transitionS.length;
        DFA7_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA7_transition[i] = DFA.unpackEncodedString(DFA7_transitionS[i]);
        }
    }

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = DFA7_eot;
            this.eof = DFA7_eof;
            this.min = DFA7_min;
            this.max = DFA7_max;
            this.accept = DFA7_accept;
            this.special = DFA7_special;
            this.transition = DFA7_transition;
        }
        public String getDescription() {
            return "186:1: bloc[TableSymboles ts] returns [Code code] : ( ^( BLOC (c1= declarations[ts] ) (c2= instructions[ts] )+ ) | ^( BLOC c3= declarations[ts] ) | ^( BLOC (c4= instructions[ts] )+ ) );";
        }
    }
 

    public static final BitSet FOLLOW_affectation_in_instruction142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bloc_in_instruction171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ASSIGN_KW_in_affectation194 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_affectation198 = new BitSet(new long[]{0x0001000008CA1000L});
    public static final BitSet FOLLOW_expression_in_affectation206 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ASSIGN_KW_in_affectation215 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tableau_elem_in_affectation219 = new BitSet(new long[]{0x0001000008CA1000L});
    public static final BitSet FOLLOW_expression_in_affectation224 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PLUS_in_expression252 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression256 = new BitSet(new long[]{0x0001000008CA1000L});
    public static final BitSet FOLLOW_expression_in_expression261 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MOINS_in_expression272 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression276 = new BitSet(new long[]{0x0001000008CA1000L});
    public static final BitSet FOLLOW_expression_in_expression281 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MUL_in_expression291 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression295 = new BitSet(new long[]{0x0001000008CA1000L});
    public static final BitSet FOLLOW_expression_in_expression300 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DIV_in_expression310 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression314 = new BitSet(new long[]{0x0001000008CA1000L});
    public static final BitSet FOLLOW_expression_in_expression319 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_facteur_in_expression332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_facteur365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tableau_elem_in_facteur375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTEGER_in_facteur385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TABLEAU_ELEMENT_in_tableau_elem410 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_tableau_elem414 = new BitSet(new long[]{0x0001000008CA1000L});
    public static final BitSet FOLLOW_expression_in_tableau_elem418 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BLOC_in_bloc447 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_declarations_in_bloc457 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_instructions_in_bloc469 = new BitSet(new long[]{0x0000080000000008L});
    public static final BitSet FOLLOW_BLOC_in_bloc484 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_declarations_in_bloc488 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BLOC_in_bloc498 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_instructions_in_bloc503 = new BitSet(new long[]{0x0000080000000008L});
    public static final BitSet FOLLOW_INSTRUCTION_in_instructions530 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_instruction_in_instructions535 = new BitSet(new long[]{0x0000008000000088L});
    public static final BitSet FOLLOW_DECLARATION_in_declarations560 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_item_dec_in_declarations565 = new BitSet(new long[]{0x0000800000020008L});
    public static final BitSet FOLLOW_IDENT_in_item_dec595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tableau_dec_in_item_dec605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TABLEAU_DECLARATION_in_tableau_dec633 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_tableau_dec637 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_INTEGER_in_tableau_dec641 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_expression_in_parametres690 = new BitSet(new long[]{0x0000000000000002L});

}