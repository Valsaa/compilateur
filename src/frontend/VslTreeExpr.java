// $ANTLR 3.4 /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g 2016-02-26 21:12:39
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



    // $ANTLR start "start"
    // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:11:1: start : bloc[ts] ;
    public final void start() throws RecognitionException {
        TableSymboles ts = new TableSymboles();
        try {
            // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:13:3: ( bloc[ts] )
            // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:13:3: bloc[ts]
            {
            pushFollow(FOLLOW_bloc_in_start57);
            bloc(ts);

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
    // $ANTLR end "start"



    // $ANTLR start "instruction"
    // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:88:1: instruction[TableSymboles ts] returns [Code code] : (c1= affectation[ts] |c2= retourne[ts] |c3= impression[ts] |c4= lecture[ts] |c8= bloc[ts] );
    public final Code instruction(TableSymboles ts) throws RecognitionException {
        Code code = null;


        Code c1 =null;

        Code c2 =null;

        Code c3 =null;

        Code c4 =null;

        Code c8 =null;


        code = new Code();
        try {
            // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:90:3: (c1= affectation[ts] |c2= retourne[ts] |c3= impression[ts] |c4= lecture[ts] |c8= bloc[ts] )
            int alt1=5;
            switch ( input.LA(1) ) {
            case ASSIGN_KW:
                {
                alt1=1;
                }
                break;
            case RETURN_KW:
                {
                alt1=2;
                }
                break;
            case PRINT_KW:
                {
                alt1=3;
                }
                break;
            case READ_KW:
                {
                alt1=4;
                }
                break;
            case BLOC:
                {
                alt1=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;

            }

            switch (alt1) {
                case 1 :
                    // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:90:3: c1= affectation[ts]
                    {
                    pushFollow(FOLLOW_affectation_in_instruction155);
                    c1=affectation(ts);

                    state._fsp--;



                          code.append(c1);
                      

                    }
                    break;
                case 2 :
                    // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:93:3: c2= retourne[ts]
                    {
                    pushFollow(FOLLOW_retourne_in_instruction164);
                    c2=retourne(ts);

                    state._fsp--;



                          code.append(c2);
                      

                    }
                    break;
                case 3 :
                    // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:96:3: c3= impression[ts]
                    {
                    pushFollow(FOLLOW_impression_in_instruction173);
                    c3=impression(ts);

                    state._fsp--;



                          code.append(c3);
                      

                    }
                    break;
                case 4 :
                    // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:99:3: c4= lecture[ts]
                    {
                    pushFollow(FOLLOW_lecture_in_instruction182);
                    c4=lecture(ts);

                    state._fsp--;



                          code.append(c4);
                      

                    }
                    break;
                case 5 :
                    // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:111:3: c8= bloc[ts]
                    {
                    pushFollow(FOLLOW_bloc_in_instruction201);
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
    // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:116:1: affectation[TableSymboles ts] returns [Code code] : ^( ASSIGN_KW id= IDENT exp= expression[ts] ) ;
    public final Code affectation(TableSymboles ts) throws RecognitionException {
        Code code = null;


        CommonTree id=null;
        Expratt exp =null;


        code = new Code();
        try {
            // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:118:3: ( ^( ASSIGN_KW id= IDENT exp= expression[ts] ) )
            // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:118:3: ^( ASSIGN_KW id= IDENT exp= expression[ts] )
            {
            match(input,ASSIGN_KW,FOLLOW_ASSIGN_KW_in_affectation224); 

            match(input, Token.DOWN, null); 
            id=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_affectation228); 

            pushFollow(FOLLOW_expression_in_affectation232);
            exp=expression(ts);

            state._fsp--;



                 String name  = id.getText();
                 Type   ty    = TypeSystem.CheckIdent(name, ts);
                 Tokatt tok   = (Tokatt) ts.Lookup(name);
                 
                 TypeSystem.CheckAssign(ty, exp.type); 
                 code.append(exp.code);     
                 code.append(new Inst3a(Inst3a.TAC_COPY, tok, exp.place, null));
              

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
    // $ANTLR end "affectation"



    // $ANTLR start "retourne"
    // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:129:1: retourne[TableSymboles ts] returns [Code code] : ^( RETURN_KW exp= expression[ts] ) ;
    public final Code retourne(TableSymboles ts) throws RecognitionException {
        Code code = null;


        Expratt exp =null;


        code = new Code();
        try {
            // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:131:3: ( ^( RETURN_KW exp= expression[ts] ) )
            // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:131:3: ^( RETURN_KW exp= expression[ts] )
            {
            match(input,RETURN_KW,FOLLOW_RETURN_KW_in_retourne257); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_expression_in_retourne261);
            exp=expression(ts);

            state._fsp--;


            match(input, Token.UP, null); 



                code.append(new Inst3a(Inst3a.TAC_RETURN, exp.place, null, null));
              

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
    // $ANTLR end "retourne"



    // $ANTLR start "impression"
    // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:136:1: impression[TableSymboles ts] returns [Code code] : ^( PRINT_KW (exp= item_imp[ts] )+ ) ;
    public final Code impression(TableSymboles ts) throws RecognitionException {
        Code code = null;


        Expratt exp =null;


        code = new Code();
        try {
            // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:138:3: ( ^( PRINT_KW (exp= item_imp[ts] )+ ) )
            // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:138:3: ^( PRINT_KW (exp= item_imp[ts] )+ )
            {
            match(input,PRINT_KW,FOLLOW_PRINT_KW_in_impression285); 

            match(input, Token.DOWN, null); 
            // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:138:14: (exp= item_imp[ts] )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==DIV||LA2_0==IDENT||LA2_0==INTEGER||(LA2_0 >= MOINS && LA2_0 <= MUL)||LA2_0==PLUS||LA2_0==TEXT) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:138:15: exp= item_imp[ts]
            	    {
            	    pushFollow(FOLLOW_item_imp_in_impression290);
            	    exp=item_imp(ts);

            	    state._fsp--;



            	          code.append(exp.code);
            	          Tokatt tok = null;
            	          if (exp.type == TypeSystem.T_integer)  
            	              tok = new Tokatt("L2", TypeSystem.T_label);
            	          else if (exp.type == TypeSystem.T_c_text)         
            	              tok = new Tokatt("L4", TypeSystem.T_label);
            	          code.append(new Inst3a(Inst3a.TAC_CALL, null, tok, null));
            	      

            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
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
    // $ANTLR end "impression"



    // $ANTLR start "item_imp"
    // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:149:1: item_imp[TableSymboles ts] returns [Expratt exp] : (text= TEXT |exp1= expression[ts] );
    public final Expratt item_imp(TableSymboles ts) throws RecognitionException {
        Expratt exp = null;


        CommonTree text=null;
        Expratt exp1 =null;


        exp = null;
        try {
            // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:151:3: (text= TEXT |exp1= expression[ts] )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==TEXT) ) {
                alt3=1;
            }
            else if ( (LA3_0==DIV||LA3_0==IDENT||LA3_0==INTEGER||(LA3_0 >= MOINS && LA3_0 <= MUL)||LA3_0==PLUS) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;

            }
            switch (alt3) {
                case 1 :
                    // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:151:3: text= TEXT
                    {
                    text=(CommonTree)match(input,TEXT,FOLLOW_TEXT_in_item_imp318); 


                        String n    = text.getText();
                        Tokatt tok  = new Tokatt(n);
                        Code   code = new Code(new Inst3a(Inst3a.TAC_ARG, tok, null, null));
                        code.appendData(tok);
                        exp = new Expratt(TypeSystem.T_c_text, code, null); 
                      

                    }
                    break;
                case 2 :
                    // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:158:3: exp1= expression[ts]
                    {
                    pushFollow(FOLLOW_expression_in_item_imp326);
                    exp1=expression(ts);

                    state._fsp--;



                        Code code = new Code();
                        code.append(exp1.code);
                        code.append(new Inst3a(Inst3a.TAC_ARG, exp1.place, null, null));
                        exp = new Expratt(exp1.type, code, exp1.place);
                      

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
    // $ANTLR end "item_imp"



    // $ANTLR start "lecture"
    // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:166:1: lecture[TableSymboles ts] returns [Code code] : ^( READ_KW (c= item_lec[ts] )+ ) ;
    public final Code lecture(TableSymboles ts) throws RecognitionException {
        Code code = null;


        Code c =null;


        code = new Code();
        try {
            // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:168:3: ( ^( READ_KW (c= item_lec[ts] )+ ) )
            // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:168:3: ^( READ_KW (c= item_lec[ts] )+ )
            {
            match(input,READ_KW,FOLLOW_READ_KW_in_lecture349); 

            match(input, Token.DOWN, null); 
            // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:168:13: (c= item_lec[ts] )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==IDENT) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:168:14: c= item_lec[ts]
            	    {
            	    pushFollow(FOLLOW_item_lec_in_lecture354);
            	    c=item_lec(ts);

            	    state._fsp--;



            	          code.append(c);
            	      

            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
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
    // $ANTLR end "lecture"



    // $ANTLR start "item_lec"
    // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:173:1: item_lec[TableSymboles ts] returns [Code code] : id= IDENT ;
    public final Code item_lec(TableSymboles ts) throws RecognitionException {
        Code code = null;


        CommonTree id=null;

        code = new Code();
        try {
            // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:175:3: (id= IDENT )
            // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:175:3: id= IDENT
            {
            id=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_item_lec381); 


                String name = id.getText();
                Type   ty   = TypeSystem.CheckIdent(name, ts);
                Tokatt tok1 = (Tokatt) ts.Lookup(name);
                Tokatt tok2 = new Tokatt("L8", TypeSystem.T_label);
                code.append(new Inst3a(Inst3a.TAC_CALL, tok1, tok2, null));
              

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
    // $ANTLR end "item_lec"



    // $ANTLR start "expression"
    // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:184:1: expression[TableSymboles ts] returns [Expratt exp] : ( ^( PLUS exp1= expression[ts] exp2= expression[ts] ) | ^( MOINS exp1= expression[ts] exp2= expression[ts] ) | ^( MUL exp1= expression[ts] exp2= expression[ts] ) | ^( DIV exp1= expression[ts] exp2= expression[ts] ) |exp1= facteur[ts] );
    public final Expratt expression(TableSymboles ts) throws RecognitionException {
        Expratt exp = null;


        Expratt exp1 =null;

        Expratt exp2 =null;


        exp = null;
        try {
            // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:186:3: ( ^( PLUS exp1= expression[ts] exp2= expression[ts] ) | ^( MOINS exp1= expression[ts] exp2= expression[ts] ) | ^( MUL exp1= expression[ts] exp2= expression[ts] ) | ^( DIV exp1= expression[ts] exp2= expression[ts] ) |exp1= facteur[ts] )
            int alt5=5;
            switch ( input.LA(1) ) {
            case PLUS:
                {
                alt5=1;
                }
                break;
            case MOINS:
                {
                alt5=2;
                }
                break;
            case MUL:
                {
                alt5=3;
                }
                break;
            case DIV:
                {
                alt5=4;
                }
                break;
            case IDENT:
            case INTEGER:
                {
                alt5=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;

            }

            switch (alt5) {
                case 1 :
                    // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:186:5: ^( PLUS exp1= expression[ts] exp2= expression[ts] )
                    {
                    match(input,PLUS,FOLLOW_PLUS_in_expression408); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression412);
                    exp1=expression(ts);

                    state._fsp--;


                    pushFollow(FOLLOW_expression_in_expression417);
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
                    // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:192:5: ^( MOINS exp1= expression[ts] exp2= expression[ts] )
                    {
                    match(input,MOINS,FOLLOW_MOINS_in_expression428); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression432);
                    exp1=expression(ts);

                    state._fsp--;


                    pushFollow(FOLLOW_expression_in_expression437);
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
                    // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:198:5: ^( MUL exp1= expression[ts] exp2= expression[ts] )
                    {
                    match(input,MUL,FOLLOW_MUL_in_expression447); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression451);
                    exp1=expression(ts);

                    state._fsp--;


                    pushFollow(FOLLOW_expression_in_expression456);
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
                    // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:204:5: ^( DIV exp1= expression[ts] exp2= expression[ts] )
                    {
                    match(input,DIV,FOLLOW_DIV_in_expression466); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression470);
                    exp1=expression(ts);

                    state._fsp--;


                    pushFollow(FOLLOW_expression_in_expression475);
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
                    // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:210:5: exp1= facteur[ts]
                    {
                    pushFollow(FOLLOW_facteur_in_expression488);
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
    // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:215:1: facteur[TableSymboles ts] returns [Expratt exp] : (id= IDENT |i= INTEGER );
    public final Expratt facteur(TableSymboles ts) throws RecognitionException {
        Expratt exp = null;


        CommonTree id=null;
        CommonTree i=null;

        exp = null;
        try {
            // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:217:3: (id= IDENT |i= INTEGER )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==IDENT) ) {
                alt6=1;
            }
            else if ( (LA6_0==INTEGER) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;

            }
            switch (alt6) {
                case 1 :
                    // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:217:3: id= IDENT
                    {
                    id=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_facteur521); 


                        String name = id.getText();
                        Type   ty   = TypeSystem.CheckIdent(name, ts);
                        Tokatt tok  = (Tokatt) ts.Lookup(name);
                        exp = new Expratt(ty, new Code(), tok);
                      

                    }
                    break;
                case 2 :
                    // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:223:3: i= INTEGER
                    {
                    i=(CommonTree)match(input,INTEGER,FOLLOW_INTEGER_in_facteur529); 


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



    // $ANTLR start "bloc"
    // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:229:1: bloc[TableSymboles ts] returns [Code code] : ( ^( BLOC (c1= declarations[ts] ) (c2= instructions[ts] )+ ) | ^( BLOC c3= declarations[ts] ) | ^( BLOC (c4= instructions[ts] )+ ) );
    public final Code bloc(TableSymboles ts) throws RecognitionException {
        Code code = null;


        Code c1 =null;

        Code c2 =null;

        Code c3 =null;

        Code c4 =null;


        code = new Code();
        try {
            // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:231:3: ( ^( BLOC (c1= declarations[ts] ) (c2= instructions[ts] )+ ) | ^( BLOC c3= declarations[ts] ) | ^( BLOC (c4= instructions[ts] )+ ) )
            int alt9=3;
            alt9 = dfa9.predict(input);
            switch (alt9) {
                case 1 :
                    // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:231:3: ^( BLOC (c1= declarations[ts] ) (c2= instructions[ts] )+ )
                    {
                    match(input,BLOC,FOLLOW_BLOC_in_bloc556); 

                    ts.Enter_Scope();

                    match(input, Token.DOWN, null); 
                    // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:232:3: (c1= declarations[ts] )
                    // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:232:4: c1= declarations[ts]
                    {
                    pushFollow(FOLLOW_declarations_in_bloc566);
                    c1=declarations(ts);

                    state._fsp--;


                    code.append(c1);

                    }


                    // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:233:3: (c2= instructions[ts] )+
                    int cnt7=0;
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==INSTRUCTION) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:233:4: c2= instructions[ts]
                    	    {
                    	    pushFollow(FOLLOW_instructions_in_bloc578);
                    	    c2=instructions(ts);

                    	    state._fsp--;


                    	    code.append(c2);

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt7 >= 1 ) break loop7;
                                EarlyExitException eee =
                                    new EarlyExitException(7, input);
                                throw eee;
                        }
                        cnt7++;
                    } while (true);


                    ts.Leave_Scope();

                    match(input, Token.UP, null); 


                    }
                    break;
                case 2 :
                    // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:235:3: ^( BLOC c3= declarations[ts] )
                    {
                    match(input,BLOC,FOLLOW_BLOC_in_bloc593); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_declarations_in_bloc597);
                    c3=declarations(ts);

                    state._fsp--;


                    code.append(c3);

                    match(input, Token.UP, null); 


                    }
                    break;
                case 3 :
                    // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:236:3: ^( BLOC (c4= instructions[ts] )+ )
                    {
                    match(input,BLOC,FOLLOW_BLOC_in_bloc607); 

                    match(input, Token.DOWN, null); 
                    // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:236:10: (c4= instructions[ts] )+
                    int cnt8=0;
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==INSTRUCTION) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:236:11: c4= instructions[ts]
                    	    {
                    	    pushFollow(FOLLOW_instructions_in_bloc612);
                    	    c4=instructions(ts);

                    	    state._fsp--;


                    	    code.append(c4);

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
    // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:239:1: instructions[TableSymboles ts] returns [Code code] : ^( INSTRUCTION (c= instruction[ts] )+ ) ;
    public final Code instructions(TableSymboles ts) throws RecognitionException {
        Code code = null;


        Code c =null;


        code = new Code();
        try {
            // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:241:3: ( ^( INSTRUCTION (c= instruction[ts] )+ ) )
            // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:241:3: ^( INSTRUCTION (c= instruction[ts] )+ )
            {
            match(input,INSTRUCTION,FOLLOW_INSTRUCTION_in_instructions639); 

            match(input, Token.DOWN, null); 
            // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:241:17: (c= instruction[ts] )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==ASSIGN_KW||LA10_0==PRINT_KW||(LA10_0 >= READ_KW && LA10_0 <= RETURN_KW)||LA10_0==BLOC) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:241:18: c= instruction[ts]
            	    {
            	    pushFollow(FOLLOW_instruction_in_instructions644);
            	    c=instruction(ts);

            	    state._fsp--;



            	        code.append(c);
            	      

            	    }
            	    break;

            	default :
            	    if ( cnt10 >= 1 ) break loop10;
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
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
    // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:246:1: declarations[TableSymboles ts] returns [Code code] : ^( DECLARATION (c= item_dec[ts] )+ ) ;
    public final Code declarations(TableSymboles ts) throws RecognitionException {
        Code code = null;


        Code c =null;


        code = new Code();
        try {
            // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:248:3: ( ^( DECLARATION (c= item_dec[ts] )+ ) )
            // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:248:3: ^( DECLARATION (c= item_dec[ts] )+ )
            {
            match(input,DECLARATION,FOLLOW_DECLARATION_in_declarations669); 

            match(input, Token.DOWN, null); 
            // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:248:17: (c= item_dec[ts] )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==IDENT) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:248:18: c= item_dec[ts]
            	    {
            	    pushFollow(FOLLOW_item_dec_in_declarations674);
            	    c=item_dec(ts);

            	    state._fsp--;


            	    code.append(c);

            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
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
    // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:251:1: item_dec[TableSymboles ts] returns [Code code] : id= IDENT ;
    public final Code item_dec(TableSymboles ts) throws RecognitionException {
        Code code = null;


        CommonTree id=null;

        code = new Code();
        try {
            // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:253:3: (id= IDENT )
            // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:253:3: id= IDENT
            {
            id=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_item_dec704); 


                String name = id.getText();
                Tokatt tok  = TypeSystem.CheckDecIdent(name, ts);
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
    // $ANTLR end "item_dec"

    // Delegated rules


    protected DFA9 dfa9 = new DFA9(this);
    static final String DFA9_eotS =
        "\12\uffff";
    static final String DFA9_eofS =
        "\12\uffff";
    static final String DFA9_minS =
        "\1\47\1\2\1\52\1\2\1\uffff\1\21\2\3\2\uffff";
    static final String DFA9_maxS =
        "\1\47\1\2\1\53\1\2\1\uffff\2\21\1\53\2\uffff";
    static final String DFA9_acceptS =
        "\4\uffff\1\3\3\uffff\1\1\1\2";
    static final String DFA9_specialS =
        "\12\uffff}>";
    static final String[] DFA9_transitionS = {
            "\1\1",
            "\1\2",
            "\1\3\1\4",
            "\1\5",
            "",
            "\1\6",
            "\1\7\15\uffff\1\6",
            "\1\11\47\uffff\1\10",
            "",
            ""
    };

    static final short[] DFA9_eot = DFA.unpackEncodedString(DFA9_eotS);
    static final short[] DFA9_eof = DFA.unpackEncodedString(DFA9_eofS);
    static final char[] DFA9_min = DFA.unpackEncodedStringToUnsignedChars(DFA9_minS);
    static final char[] DFA9_max = DFA.unpackEncodedStringToUnsignedChars(DFA9_maxS);
    static final short[] DFA9_accept = DFA.unpackEncodedString(DFA9_acceptS);
    static final short[] DFA9_special = DFA.unpackEncodedString(DFA9_specialS);
    static final short[][] DFA9_transition;

    static {
        int numStates = DFA9_transitionS.length;
        DFA9_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA9_transition[i] = DFA.unpackEncodedString(DFA9_transitionS[i]);
        }
    }

    class DFA9 extends DFA {

        public DFA9(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 9;
            this.eot = DFA9_eot;
            this.eof = DFA9_eof;
            this.min = DFA9_min;
            this.max = DFA9_max;
            this.accept = DFA9_accept;
            this.special = DFA9_special;
            this.transition = DFA9_transition;
        }
        public String getDescription() {
            return "229:1: bloc[TableSymboles ts] returns [Code code] : ( ^( BLOC (c1= declarations[ts] ) (c2= instructions[ts] )+ ) | ^( BLOC c3= declarations[ts] ) | ^( BLOC (c4= instructions[ts] )+ ) );";
        }
    }
 

    public static final BitSet FOLLOW_bloc_in_start57 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_affectation_in_instruction155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_retourne_in_instruction164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_impression_in_instruction173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lecture_in_instruction182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bloc_in_instruction201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ASSIGN_KW_in_affectation224 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_affectation228 = new BitSet(new long[]{0x0000000008CA1000L});
    public static final BitSet FOLLOW_expression_in_affectation232 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_RETURN_KW_in_retourne257 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_retourne261 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PRINT_KW_in_impression285 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_item_imp_in_impression290 = new BitSet(new long[]{0x0000000108CA1008L});
    public static final BitSet FOLLOW_TEXT_in_item_imp318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_item_imp326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_READ_KW_in_lecture349 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_item_lec_in_lecture354 = new BitSet(new long[]{0x0000000000020008L});
    public static final BitSet FOLLOW_IDENT_in_item_lec381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PLUS_in_expression408 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression412 = new BitSet(new long[]{0x0000000008CA1000L});
    public static final BitSet FOLLOW_expression_in_expression417 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MOINS_in_expression428 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression432 = new BitSet(new long[]{0x0000000008CA1000L});
    public static final BitSet FOLLOW_expression_in_expression437 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MUL_in_expression447 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression451 = new BitSet(new long[]{0x0000000008CA1000L});
    public static final BitSet FOLLOW_expression_in_expression456 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DIV_in_expression466 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression470 = new BitSet(new long[]{0x0000000008CA1000L});
    public static final BitSet FOLLOW_expression_in_expression475 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_facteur_in_expression488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_facteur521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTEGER_in_facteur529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BLOC_in_bloc556 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_declarations_in_bloc566 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_instructions_in_bloc578 = new BitSet(new long[]{0x0000080000000008L});
    public static final BitSet FOLLOW_BLOC_in_bloc593 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_declarations_in_bloc597 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BLOC_in_bloc607 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_instructions_in_bloc612 = new BitSet(new long[]{0x0000080000000008L});
    public static final BitSet FOLLOW_INSTRUCTION_in_instructions639 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_instruction_in_instructions644 = new BitSet(new long[]{0x00000080D0000088L});
    public static final BitSet FOLLOW_DECLARATION_in_declarations669 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_item_dec_in_declarations674 = new BitSet(new long[]{0x0000000000020008L});
    public static final BitSet FOLLOW_IDENT_in_item_dec704 = new BitSet(new long[]{0x0000000000000002L});

}