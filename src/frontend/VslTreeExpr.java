// $ANTLR 3.4 /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g 2016-02-26 23:58:32
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
    // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:11:1: start : program ;
    public final void start() throws RecognitionException {
        try {
            // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:11:7: ( program )
            // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:11:9: program
            {
            pushFollow(FOLLOW_program_in_start52);
            program();

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



    // $ANTLR start "program"
    // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:13:1: program returns [Code code] : ^( PROGRAMME (c= unite[ts] )+ ) ;
    public final Code program() throws RecognitionException {
        Code code = null;


        Code c =null;


        TableSymboles ts = new TableSymboles(); code = new Code();
        try {
            // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:15:3: ( ^( PROGRAMME (c= unite[ts] )+ ) )
            // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:15:3: ^( PROGRAMME (c= unite[ts] )+ )
            {
            match(input,PROGRAMME,FOLLOW_PROGRAMME_in_program69); 

            match(input, Token.DOWN, null); 
            // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:15:15: (c= unite[ts] )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==FUNC_KW||LA1_0==PROTO_KW) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:15:16: c= unite[ts]
            	    {
            	    pushFollow(FOLLOW_unite_in_program74);
            	    c=unite(ts);

            	    state._fsp--;



            	        code.append(c);
            	      

            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
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
    // $ANTLR end "program"



    // $ANTLR start "unite"
    // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:20:1: unite[TableSymboles ts] returns [Code code] : (c= fonction[ts] |c= prototype[ts] );
    public final Code unite(TableSymboles ts) throws RecognitionException {
        Code code = null;


        Code c =null;


        code = new Code();
        try {
            // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:22:3: (c= fonction[ts] |c= prototype[ts] )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==FUNC_KW) ) {
                alt2=1;
            }
            else if ( (LA2_0==PROTO_KW) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }
            switch (alt2) {
                case 1 :
                    // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:22:3: c= fonction[ts]
                    {
                    pushFollow(FOLLOW_fonction_in_unite101);
                    c=fonction(ts);

                    state._fsp--;



                        code.append(c);
                      

                    }
                    break;
                case 2 :
                    // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:25:3: c= prototype[ts]
                    {
                    pushFollow(FOLLOW_prototype_in_unite110);
                    c=prototype(ts);

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
    // $ANTLR end "unite"



    // $ANTLR start "fonction"
    // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:30:1: fonction[TableSymboles ts] returns [Code code] : ^( FUNC_KW ty= type id= IDENT codes= parametres[ts] ^( CORPS c2= instruction[ts] ) ) ;
    public final Code fonction(TableSymboles ts) throws RecognitionException {
        Code code = null;


        CommonTree id=null;
        Type ty =null;

        ArrayList<Code> codes =null;

        Code c2 =null;


        code = new Code();
        try {
            // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:32:3: ( ^( FUNC_KW ty= type id= IDENT codes= parametres[ts] ^( CORPS c2= instruction[ts] ) ) )
            // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:32:3: ^( FUNC_KW ty= type id= IDENT codes= parametres[ts] ^( CORPS c2= instruction[ts] ) )
            {
            match(input,FUNC_KW,FOLLOW_FUNC_KW_in_fonction136); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_type_in_fonction143);
            ty=type();

            state._fsp--;


            id=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_fonction147); 

                
                String name = id.getText();
                Tokatt tok = null;
                if(!name.equals("main"))
                  tok = TypeSystem.CheckFuncDec(name, new TypeFunction(ty), ts);
                else
                  tok = new Tokatt(new TypeFunction(ty), name, 0);
                code.append(new Inst3a(Inst3a.TAC_LABEL, tok, null, null));
                code.append(new Inst3a(Inst3a.TAC_BEGINFUNC, null, null, null));
                ts.Enter_Scope();
              

            pushFollow(FOLLOW_parametres_in_fonction155);
            codes=parametres(ts);

            state._fsp--;



                for(int i = 0 ; i < codes.size() ; i++) {
                  code.append(codes.get(i));
                }
              

            match(input,CORPS,FOLLOW_CORPS_in_fonction167); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_instruction_in_fonction171);
            c2=instruction(ts);

            state._fsp--;


            match(input, Token.UP, null); 



                code.append(c2);
              

            match(input, Token.UP, null); 



                ts.Leave_Scope();
                code.append(new Inst3a(Inst3a.TAC_ENDFUNC, null, null, null));
              

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
    // $ANTLR end "fonction"



    // $ANTLR start "prototype"
    // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:57:1: prototype[TableSymboles ts] returns [Code code] : ^( PROTO_KW ty= type id= IDENT codes= parametres[ts] ) ;
    public final Code prototype(TableSymboles ts) throws RecognitionException {
        Code code = null;


        CommonTree id=null;
        Type ty =null;

        ArrayList<Code> codes =null;


        code = new Code();
        try {
            // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:59:3: ( ^( PROTO_KW ty= type id= IDENT codes= parametres[ts] ) )
            // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:59:3: ^( PROTO_KW ty= type id= IDENT codes= parametres[ts] )
            {
            match(input,PROTO_KW,FOLLOW_PROTO_KW_in_prototype201); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_type_in_prototype205);
            ty=type();

            state._fsp--;


            id=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_prototype209); 

            pushFollow(FOLLOW_parametres_in_prototype213);
            codes=parametres(ts);

            state._fsp--;


            match(input, Token.UP, null); 



                String name  = id.getText();
                int    scope = ts.getScope();
                Tokatt tok = TypeSystem.CheckProtoDec(name, new TypeFunction(ty), ts);
                tok.scope = scope;
                tok.value = codes.size();
                ts.Insert(name, tok);
              

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
    // $ANTLR end "prototype"



    // $ANTLR start "type"
    // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:69:1: type returns [Type type] : ( ^( INT_KW ) | ^( VOID_KW ) );
    public final Type type() throws RecognitionException {
        Type type = null;


        type = null;
        try {
            // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:71:3: ( ^( INT_KW ) | ^( VOID_KW ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==INT_KW) ) {
                alt3=1;
            }
            else if ( (LA3_0==VOID_KW) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;

            }
            switch (alt3) {
                case 1 :
                    // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:71:3: ^( INT_KW )
                    {
                    match(input,INT_KW,FOLLOW_INT_KW_in_type237); 

                    type = TypeSystem.T_integer;

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        match(input, Token.UP, null); 
                    }


                    }
                    break;
                case 2 :
                    // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:72:3: ^( VOID_KW )
                    {
                    match(input,VOID_KW,FOLLOW_VOID_KW_in_type245); 

                    type = TypeSystem.T_void;

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        match(input, Token.UP, null); 
                    }


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
        return type;
    }
    // $ANTLR end "type"



    // $ANTLR start "parametres"
    // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:75:1: parametres[TableSymboles ts] returns [ArrayList<Code> codes] : ^( PARAMETRE (c= parametre[ts] )* ) ;
    public final ArrayList<Code> parametres(TableSymboles ts) throws RecognitionException {
        ArrayList<Code> codes = null;


        Code c =null;


        codes = new ArrayList<Code>();
        try {
            // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:77:3: ( ^( PARAMETRE (c= parametre[ts] )* ) )
            // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:77:3: ^( PARAMETRE (c= parametre[ts] )* )
            {
            match(input,PARAMETRE,FOLLOW_PARAMETRE_in_parametres270); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:77:15: (c= parametre[ts] )*
                loop4:
                do {
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==IDENT) ) {
                        alt4=1;
                    }


                    switch (alt4) {
                	case 1 :
                	    // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:77:16: c= parametre[ts]
                	    {
                	    pushFollow(FOLLOW_parametre_in_parametres275);
                	    c=parametre(ts);

                	    state._fsp--;


                	    codes.add(c);

                	    }
                	    break;

                	default :
                	    break loop4;
                    }
                } while (true);


                match(input, Token.UP, null); 
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return codes;
    }
    // $ANTLR end "parametres"



    // $ANTLR start "parametre"
    // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:80:1: parametre[TableSymboles ts] returns [Code code] : id= IDENT ;
    public final Code parametre(TableSymboles ts) throws RecognitionException {
        Code code = null;


        CommonTree id=null;

        code = new Code();
        try {
            // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:82:3: (id= IDENT )
            // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:82:3: id= IDENT
            {
            id=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_parametre304); 


                String name = id.getText();
                Tokatt tok  = TypeSystem.CheckDecParIdent(name, ts);
                tok.setParam();
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
    // $ANTLR end "parametre"



    // $ANTLR start "instruction"
    // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:90:1: instruction[TableSymboles ts] returns [Code code] : (c1= affectation[ts] |c2= retourne[ts] |c3= impression[ts] |c4= lecture[ts] |c5= conditionnelle[ts] |c7= iteration[ts] |c8= bloc[ts] );
    public final Code instruction(TableSymboles ts) throws RecognitionException {
        Code code = null;


        Code c1 =null;

        Code c2 =null;

        Code c3 =null;

        Code c4 =null;

        Code c5 =null;

        Code c7 =null;

        Code c8 =null;


        code = new Code();
        try {
            // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:92:3: (c1= affectation[ts] |c2= retourne[ts] |c3= impression[ts] |c4= lecture[ts] |c5= conditionnelle[ts] |c7= iteration[ts] |c8= bloc[ts] )
            int alt5=7;
            switch ( input.LA(1) ) {
            case ASSIGN_KW:
                {
                alt5=1;
                }
                break;
            case RETURN_KW:
                {
                alt5=2;
                }
                break;
            case PRINT_KW:
                {
                alt5=3;
                }
                break;
            case READ_KW:
                {
                alt5=4;
                }
                break;
            case IF_KW:
                {
                alt5=5;
                }
                break;
            case WHILE_KW:
                {
                alt5=6;
                }
                break;
            case BLOC:
                {
                alt5=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;

            }

            switch (alt5) {
                case 1 :
                    // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:92:3: c1= affectation[ts]
                    {
                    pushFollow(FOLLOW_affectation_in_instruction327);
                    c1=affectation(ts);

                    state._fsp--;



                          code.append(c1);
                      

                    }
                    break;
                case 2 :
                    // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:95:3: c2= retourne[ts]
                    {
                    pushFollow(FOLLOW_retourne_in_instruction336);
                    c2=retourne(ts);

                    state._fsp--;



                          code.append(c2);
                      

                    }
                    break;
                case 3 :
                    // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:98:3: c3= impression[ts]
                    {
                    pushFollow(FOLLOW_impression_in_instruction345);
                    c3=impression(ts);

                    state._fsp--;



                          code.append(c3);
                      

                    }
                    break;
                case 4 :
                    // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:101:3: c4= lecture[ts]
                    {
                    pushFollow(FOLLOW_lecture_in_instruction354);
                    c4=lecture(ts);

                    state._fsp--;



                          code.append(c4);
                      

                    }
                    break;
                case 5 :
                    // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:104:3: c5= conditionnelle[ts]
                    {
                    pushFollow(FOLLOW_conditionnelle_in_instruction364);
                    c5=conditionnelle(ts);

                    state._fsp--;



                          code.append(c5);
                      

                    }
                    break;
                case 6 :
                    // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:110:3: c7= iteration[ts]
                    {
                    pushFollow(FOLLOW_iteration_in_instruction376);
                    c7=iteration(ts);

                    state._fsp--;



                          code.append(c7);
                      

                    }
                    break;
                case 7 :
                    // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:113:3: c8= bloc[ts]
                    {
                    pushFollow(FOLLOW_bloc_in_instruction386);
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
    // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:118:1: affectation[TableSymboles ts] returns [Code code] : ^( ASSIGN_KW id= IDENT exp= expression[ts] ) ;
    public final Code affectation(TableSymboles ts) throws RecognitionException {
        Code code = null;


        CommonTree id=null;
        Expratt exp =null;


        code = new Code();
        try {
            // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:120:3: ( ^( ASSIGN_KW id= IDENT exp= expression[ts] ) )
            // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:120:3: ^( ASSIGN_KW id= IDENT exp= expression[ts] )
            {
            match(input,ASSIGN_KW,FOLLOW_ASSIGN_KW_in_affectation409); 

            match(input, Token.DOWN, null); 
            id=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_affectation413); 

            pushFollow(FOLLOW_expression_in_affectation417);
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



    // $ANTLR start "expression"
    // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:131:1: expression[TableSymboles ts] returns [Expratt exp] : ( ^( PLUS exp1= expression[ts] exp2= expression[ts] ) | ^( MOINS exp1= expression[ts] exp2= expression[ts] ) | ^( MUL exp1= expression[ts] exp2= expression[ts] ) | ^( DIV exp1= expression[ts] exp2= expression[ts] ) |exp1= facteur[ts] );
    public final Expratt expression(TableSymboles ts) throws RecognitionException {
        Expratt exp = null;


        Expratt exp1 =null;

        Expratt exp2 =null;


        exp = null;
        try {
            // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:133:3: ( ^( PLUS exp1= expression[ts] exp2= expression[ts] ) | ^( MOINS exp1= expression[ts] exp2= expression[ts] ) | ^( MUL exp1= expression[ts] exp2= expression[ts] ) | ^( DIV exp1= expression[ts] exp2= expression[ts] ) |exp1= facteur[ts] )
            int alt6=5;
            switch ( input.LA(1) ) {
            case PLUS:
                {
                alt6=1;
                }
                break;
            case MOINS:
                {
                alt6=2;
                }
                break;
            case MUL:
                {
                alt6=3;
                }
                break;
            case DIV:
                {
                alt6=4;
                }
                break;
            case IDENT:
            case INTEGER:
                {
                alt6=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;

            }

            switch (alt6) {
                case 1 :
                    // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:133:5: ^( PLUS exp1= expression[ts] exp2= expression[ts] )
                    {
                    match(input,PLUS,FOLLOW_PLUS_in_expression445); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression449);
                    exp1=expression(ts);

                    state._fsp--;


                    pushFollow(FOLLOW_expression_in_expression454);
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
                    // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:139:5: ^( MOINS exp1= expression[ts] exp2= expression[ts] )
                    {
                    match(input,MOINS,FOLLOW_MOINS_in_expression465); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression469);
                    exp1=expression(ts);

                    state._fsp--;


                    pushFollow(FOLLOW_expression_in_expression474);
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
                    // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:145:5: ^( MUL exp1= expression[ts] exp2= expression[ts] )
                    {
                    match(input,MUL,FOLLOW_MUL_in_expression484); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression488);
                    exp1=expression(ts);

                    state._fsp--;


                    pushFollow(FOLLOW_expression_in_expression493);
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
                    // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:151:5: ^( DIV exp1= expression[ts] exp2= expression[ts] )
                    {
                    match(input,DIV,FOLLOW_DIV_in_expression503); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression507);
                    exp1=expression(ts);

                    state._fsp--;


                    pushFollow(FOLLOW_expression_in_expression512);
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
                    // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:157:5: exp1= facteur[ts]
                    {
                    pushFollow(FOLLOW_facteur_in_expression525);
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
    // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:162:1: facteur[TableSymboles ts] returns [Expratt exp] : (id= IDENT |i= INTEGER );
    public final Expratt facteur(TableSymboles ts) throws RecognitionException {
        Expratt exp = null;


        CommonTree id=null;
        CommonTree i=null;

        exp = null;
        try {
            // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:164:3: (id= IDENT |i= INTEGER )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==IDENT) ) {
                alt7=1;
            }
            else if ( (LA7_0==INTEGER) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;

            }
            switch (alt7) {
                case 1 :
                    // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:164:3: id= IDENT
                    {
                    id=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_facteur558); 


                        String name = id.getText();
                        Type   ty   = TypeSystem.CheckIdent(name, ts);
                        Tokatt tok  = (Tokatt) ts.Lookup(name);
                        exp = new Expratt(ty, new Code(), tok);
                      

                    }
                    break;
                case 2 :
                    // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:170:3: i= INTEGER
                    {
                    i=(CommonTree)match(input,INTEGER,FOLLOW_INTEGER_in_facteur566); 


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



    // $ANTLR start "retourne"
    // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:176:1: retourne[TableSymboles ts] returns [Code code] : ^( RETURN_KW exp= expression[ts] ) ;
    public final Code retourne(TableSymboles ts) throws RecognitionException {
        Code code = null;


        Expratt exp =null;


        code = new Code();
        try {
            // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:178:3: ( ^( RETURN_KW exp= expression[ts] ) )
            // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:178:3: ^( RETURN_KW exp= expression[ts] )
            {
            match(input,RETURN_KW,FOLLOW_RETURN_KW_in_retourne589); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_expression_in_retourne593);
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
    // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:183:1: impression[TableSymboles ts] returns [Code code] : ^( PRINT_KW (exp= item_imp[ts] )+ ) ;
    public final Code impression(TableSymboles ts) throws RecognitionException {
        Code code = null;


        Expratt exp =null;


        code = new Code();
        try {
            // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:185:3: ( ^( PRINT_KW (exp= item_imp[ts] )+ ) )
            // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:185:3: ^( PRINT_KW (exp= item_imp[ts] )+ )
            {
            match(input,PRINT_KW,FOLLOW_PRINT_KW_in_impression617); 

            match(input, Token.DOWN, null); 
            // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:185:14: (exp= item_imp[ts] )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==DIV||LA8_0==IDENT||LA8_0==INTEGER||(LA8_0 >= MOINS && LA8_0 <= MUL)||LA8_0==PLUS||LA8_0==TEXT) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:185:15: exp= item_imp[ts]
            	    {
            	    pushFollow(FOLLOW_item_imp_in_impression622);
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
    // $ANTLR end "impression"



    // $ANTLR start "item_imp"
    // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:196:1: item_imp[TableSymboles ts] returns [Expratt exp] : (text= TEXT |exp1= expression[ts] );
    public final Expratt item_imp(TableSymboles ts) throws RecognitionException {
        Expratt exp = null;


        CommonTree text=null;
        Expratt exp1 =null;


        exp = null;
        try {
            // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:198:3: (text= TEXT |exp1= expression[ts] )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==TEXT) ) {
                alt9=1;
            }
            else if ( (LA9_0==DIV||LA9_0==IDENT||LA9_0==INTEGER||(LA9_0 >= MOINS && LA9_0 <= MUL)||LA9_0==PLUS) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;

            }
            switch (alt9) {
                case 1 :
                    // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:198:3: text= TEXT
                    {
                    text=(CommonTree)match(input,TEXT,FOLLOW_TEXT_in_item_imp650); 


                        String n    = text.getText();
                        Tokatt tok  = new Tokatt(n);
                        Code   code = new Code(new Inst3a(Inst3a.TAC_ARG, tok, null, null));
                        code.appendData(tok);
                        exp = new Expratt(TypeSystem.T_c_text, code, null); 
                      

                    }
                    break;
                case 2 :
                    // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:205:3: exp1= expression[ts]
                    {
                    pushFollow(FOLLOW_expression_in_item_imp658);
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
    // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:213:1: lecture[TableSymboles ts] returns [Code code] : ^( READ_KW (c= item_lec[ts] )+ ) ;
    public final Code lecture(TableSymboles ts) throws RecognitionException {
        Code code = null;


        Code c =null;


        code = new Code();
        try {
            // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:215:3: ( ^( READ_KW (c= item_lec[ts] )+ ) )
            // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:215:3: ^( READ_KW (c= item_lec[ts] )+ )
            {
            match(input,READ_KW,FOLLOW_READ_KW_in_lecture681); 

            match(input, Token.DOWN, null); 
            // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:215:13: (c= item_lec[ts] )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==IDENT) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:215:14: c= item_lec[ts]
            	    {
            	    pushFollow(FOLLOW_item_lec_in_lecture686);
            	    c=item_lec(ts);

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
    // $ANTLR end "lecture"



    // $ANTLR start "item_lec"
    // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:220:1: item_lec[TableSymboles ts] returns [Code code] : id= IDENT ;
    public final Code item_lec(TableSymboles ts) throws RecognitionException {
        Code code = null;


        CommonTree id=null;

        code = new Code();
        try {
            // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:222:3: (id= IDENT )
            // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:222:3: id= IDENT
            {
            id=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_item_lec713); 


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



    // $ANTLR start "conditionnelle"
    // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:231:1: conditionnelle[TableSymboles ts] returns [Code code] : ^( IF_KW exp= expression[ts] c1= instruction[ts] (c2= instruction[ts] )? ) ;
    public final Code conditionnelle(TableSymboles ts) throws RecognitionException {
        Code code = null;


        Expratt exp =null;

        Code c1 =null;

        Code c2 =null;


        code = new Code();
        try {
            // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:233:3: ( ^( IF_KW exp= expression[ts] c1= instruction[ts] (c2= instruction[ts] )? ) )
            // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:233:3: ^( IF_KW exp= expression[ts] c1= instruction[ts] (c2= instruction[ts] )? )
            {
            match(input,IF_KW,FOLLOW_IF_KW_in_conditionnelle736); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_expression_in_conditionnelle740);
            exp=expression(ts);

            state._fsp--;



                Tokatt tok = SymbDistrib.newLabel();
                code.append(exp.code);
                code.append(new Inst3a(Inst3a.TAC_IFZ, exp.place, tok, null));
              

            pushFollow(FOLLOW_instruction_in_conditionnelle750);
            c1=instruction(ts);

            state._fsp--;



                code.append(c1);
                Tokatt tok1 = SymbDistrib.newLabel();
                code.append(new Inst3a(Inst3a.TAC_GOTO, tok1, null, null));
                code.append(new Inst3a(Inst3a.TAC_LABEL, tok, null, null));    
              

            // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:244:3: (c2= instruction[ts] )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==ASSIGN_KW||LA11_0==IF_KW||LA11_0==PRINT_KW||(LA11_0 >= READ_KW && LA11_0 <= RETURN_KW)||LA11_0==WHILE_KW||LA11_0==BLOC) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:244:4: c2= instruction[ts]
                    {
                    pushFollow(FOLLOW_instruction_in_conditionnelle760);
                    c2=instruction(ts);

                    state._fsp--;



                        code.append(c2); 
                      

                    }
                    break;

            }



                code.append(new Inst3a(Inst3a.TAC_LABEL, tok1, null, null));
              

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
    // $ANTLR end "conditionnelle"



    // $ANTLR start "iteration"
    // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:252:1: iteration[TableSymboles ts] returns [Code code] : ^( WHILE_KW exp= expression[ts] c= instruction[ts] ) ;
    public final Code iteration(TableSymboles ts) throws RecognitionException {
        Code code = null;


        Expratt exp =null;

        Code c =null;


        code = new Code();
        try {
            // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:254:3: ( ^( WHILE_KW exp= expression[ts] c= instruction[ts] ) )
            // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:254:3: ^( WHILE_KW exp= expression[ts] c= instruction[ts] )
            {
            match(input,WHILE_KW,FOLLOW_WHILE_KW_in_iteration793); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_expression_in_iteration797);
            exp=expression(ts);

            state._fsp--;


            pushFollow(FOLLOW_instruction_in_iteration802);
            c=instruction(ts);

            state._fsp--;


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
    // $ANTLR end "iteration"



    // $ANTLR start "bloc"
    // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:257:1: bloc[TableSymboles ts] returns [Code code] : ( ^( BLOC (c1= declarations[ts] ) (c2= instructions[ts] )+ ) | ^( BLOC c3= declarations[ts] ) | ^( BLOC (c4= instructions[ts] )+ ) );
    public final Code bloc(TableSymboles ts) throws RecognitionException {
        Code code = null;


        Code c1 =null;

        Code c2 =null;

        Code c3 =null;

        Code c4 =null;


        code = new Code();
        try {
            // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:259:3: ( ^( BLOC (c1= declarations[ts] ) (c2= instructions[ts] )+ ) | ^( BLOC c3= declarations[ts] ) | ^( BLOC (c4= instructions[ts] )+ ) )
            int alt14=3;
            alt14 = dfa14.predict(input);
            switch (alt14) {
                case 1 :
                    // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:259:3: ^( BLOC (c1= declarations[ts] ) (c2= instructions[ts] )+ )
                    {
                    match(input,BLOC,FOLLOW_BLOC_in_bloc829); 

                    ts.Enter_Scope();

                    match(input, Token.DOWN, null); 
                    // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:260:3: (c1= declarations[ts] )
                    // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:260:4: c1= declarations[ts]
                    {
                    pushFollow(FOLLOW_declarations_in_bloc839);
                    c1=declarations(ts);

                    state._fsp--;


                    code.append(c1);

                    }


                    // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:261:3: (c2= instructions[ts] )+
                    int cnt12=0;
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==INSTRUCTION) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:261:4: c2= instructions[ts]
                    	    {
                    	    pushFollow(FOLLOW_instructions_in_bloc851);
                    	    c2=instructions(ts);

                    	    state._fsp--;


                    	    code.append(c2);

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt12 >= 1 ) break loop12;
                                EarlyExitException eee =
                                    new EarlyExitException(12, input);
                                throw eee;
                        }
                        cnt12++;
                    } while (true);


                    ts.Leave_Scope();

                    match(input, Token.UP, null); 


                    }
                    break;
                case 2 :
                    // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:263:3: ^( BLOC c3= declarations[ts] )
                    {
                    match(input,BLOC,FOLLOW_BLOC_in_bloc866); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_declarations_in_bloc870);
                    c3=declarations(ts);

                    state._fsp--;


                    code.append(c3);

                    match(input, Token.UP, null); 


                    }
                    break;
                case 3 :
                    // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:264:3: ^( BLOC (c4= instructions[ts] )+ )
                    {
                    match(input,BLOC,FOLLOW_BLOC_in_bloc880); 

                    match(input, Token.DOWN, null); 
                    // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:264:10: (c4= instructions[ts] )+
                    int cnt13=0;
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==INSTRUCTION) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:264:11: c4= instructions[ts]
                    	    {
                    	    pushFollow(FOLLOW_instructions_in_bloc885);
                    	    c4=instructions(ts);

                    	    state._fsp--;


                    	    code.append(c4);

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt13 >= 1 ) break loop13;
                                EarlyExitException eee =
                                    new EarlyExitException(13, input);
                                throw eee;
                        }
                        cnt13++;
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
    // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:267:1: instructions[TableSymboles ts] returns [Code code] : ^( INSTRUCTION (c= instruction[ts] )+ ) ;
    public final Code instructions(TableSymboles ts) throws RecognitionException {
        Code code = null;


        Code c =null;


        code = new Code();
        try {
            // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:269:3: ( ^( INSTRUCTION (c= instruction[ts] )+ ) )
            // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:269:3: ^( INSTRUCTION (c= instruction[ts] )+ )
            {
            match(input,INSTRUCTION,FOLLOW_INSTRUCTION_in_instructions912); 

            match(input, Token.DOWN, null); 
            // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:269:17: (c= instruction[ts] )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==ASSIGN_KW||LA15_0==IF_KW||LA15_0==PRINT_KW||(LA15_0 >= READ_KW && LA15_0 <= RETURN_KW)||LA15_0==WHILE_KW||LA15_0==BLOC) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:269:18: c= instruction[ts]
            	    {
            	    pushFollow(FOLLOW_instruction_in_instructions917);
            	    c=instruction(ts);

            	    state._fsp--;



            	        code.append(c);
            	      

            	    }
            	    break;

            	default :
            	    if ( cnt15 >= 1 ) break loop15;
                        EarlyExitException eee =
                            new EarlyExitException(15, input);
                        throw eee;
                }
                cnt15++;
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
    // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:274:1: declarations[TableSymboles ts] returns [Code code] : ^( DECLARATION (c= item_dec[ts] )+ ) ;
    public final Code declarations(TableSymboles ts) throws RecognitionException {
        Code code = null;


        Code c =null;


        code = new Code();
        try {
            // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:276:3: ( ^( DECLARATION (c= item_dec[ts] )+ ) )
            // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:276:3: ^( DECLARATION (c= item_dec[ts] )+ )
            {
            match(input,DECLARATION,FOLLOW_DECLARATION_in_declarations942); 

            match(input, Token.DOWN, null); 
            // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:276:17: (c= item_dec[ts] )+
            int cnt16=0;
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==IDENT) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:276:18: c= item_dec[ts]
            	    {
            	    pushFollow(FOLLOW_item_dec_in_declarations947);
            	    c=item_dec(ts);

            	    state._fsp--;


            	    code.append(c);

            	    }
            	    break;

            	default :
            	    if ( cnt16 >= 1 ) break loop16;
                        EarlyExitException eee =
                            new EarlyExitException(16, input);
                        throw eee;
                }
                cnt16++;
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
    // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:279:1: item_dec[TableSymboles ts] returns [Code code] : id= IDENT ;
    public final Code item_dec(TableSymboles ts) throws RecognitionException {
        Code code = null;


        CommonTree id=null;

        code = new Code();
        try {
            // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:281:3: (id= IDENT )
            // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:281:3: id= IDENT
            {
            id=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_item_dec977); 


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


    protected DFA14 dfa14 = new DFA14(this);
    static final String DFA14_eotS =
        "\12\uffff";
    static final String DFA14_eofS =
        "\12\uffff";
    static final String DFA14_minS =
        "\1\47\1\2\1\52\1\2\1\uffff\1\21\2\3\2\uffff";
    static final String DFA14_maxS =
        "\1\47\1\2\1\53\1\2\1\uffff\2\21\1\53\2\uffff";
    static final String DFA14_acceptS =
        "\4\uffff\1\3\3\uffff\1\1\1\2";
    static final String DFA14_specialS =
        "\12\uffff}>";
    static final String[] DFA14_transitionS = {
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

    static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
    static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
    static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
    static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
    static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
    static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
    static final short[][] DFA14_transition;

    static {
        int numStates = DFA14_transitionS.length;
        DFA14_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
        }
    }

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = DFA14_eot;
            this.eof = DFA14_eof;
            this.min = DFA14_min;
            this.max = DFA14_max;
            this.accept = DFA14_accept;
            this.special = DFA14_special;
            this.transition = DFA14_transition;
        }
        public String getDescription() {
            return "257:1: bloc[TableSymboles ts] returns [Code code] : ( ^( BLOC (c1= declarations[ts] ) (c2= instructions[ts] )+ ) | ^( BLOC c3= declarations[ts] ) | ^( BLOC (c4= instructions[ts] )+ ) );";
        }
    }
 

    public static final BitSet FOLLOW_program_in_start52 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PROGRAMME_in_program69 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_unite_in_program74 = new BitSet(new long[]{0x0000000020010008L});
    public static final BitSet FOLLOW_fonction_in_unite101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_prototype_in_unite110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNC_KW_in_fonction136 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_in_fonction143 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_IDENT_in_fonction147 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_parametres_in_fonction155 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_CORPS_in_fonction167 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_instruction_in_fonction171 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PROTO_KW_in_prototype201 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_in_prototype205 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_IDENT_in_prototype209 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_parametres_in_prototype213 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INT_KW_in_type237 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_VOID_KW_in_type245 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_PARAMETRE_in_parametres270 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_parametre_in_parametres275 = new BitSet(new long[]{0x0000000000020008L});
    public static final BitSet FOLLOW_IDENT_in_parametre304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_affectation_in_instruction327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_retourne_in_instruction336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_impression_in_instruction345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lecture_in_instruction354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionnelle_in_instruction364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iteration_in_instruction376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bloc_in_instruction386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ASSIGN_KW_in_affectation409 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_affectation413 = new BitSet(new long[]{0x0000000008CA1000L});
    public static final BitSet FOLLOW_expression_in_affectation417 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PLUS_in_expression445 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression449 = new BitSet(new long[]{0x0000000008CA1000L});
    public static final BitSet FOLLOW_expression_in_expression454 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MOINS_in_expression465 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression469 = new BitSet(new long[]{0x0000000008CA1000L});
    public static final BitSet FOLLOW_expression_in_expression474 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MUL_in_expression484 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression488 = new BitSet(new long[]{0x0000000008CA1000L});
    public static final BitSet FOLLOW_expression_in_expression493 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DIV_in_expression503 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression507 = new BitSet(new long[]{0x0000000008CA1000L});
    public static final BitSet FOLLOW_expression_in_expression512 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_facteur_in_expression525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_facteur558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTEGER_in_facteur566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RETURN_KW_in_retourne589 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_retourne593 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PRINT_KW_in_impression617 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_item_imp_in_impression622 = new BitSet(new long[]{0x0000000108CA1008L});
    public static final BitSet FOLLOW_TEXT_in_item_imp650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_item_imp658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_READ_KW_in_lecture681 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_item_lec_in_lecture686 = new BitSet(new long[]{0x0000000000020008L});
    public static final BitSet FOLLOW_IDENT_in_item_lec713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_KW_in_conditionnelle736 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_conditionnelle740 = new BitSet(new long[]{0x00000090D0040080L});
    public static final BitSet FOLLOW_instruction_in_conditionnelle750 = new BitSet(new long[]{0x00000090D0040088L});
    public static final BitSet FOLLOW_instruction_in_conditionnelle760 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_WHILE_KW_in_iteration793 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_iteration797 = new BitSet(new long[]{0x00000090D0040080L});
    public static final BitSet FOLLOW_instruction_in_iteration802 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BLOC_in_bloc829 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_declarations_in_bloc839 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_instructions_in_bloc851 = new BitSet(new long[]{0x0000080000000008L});
    public static final BitSet FOLLOW_BLOC_in_bloc866 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_declarations_in_bloc870 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BLOC_in_bloc880 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_instructions_in_bloc885 = new BitSet(new long[]{0x0000080000000008L});
    public static final BitSet FOLLOW_INSTRUCTION_in_instructions912 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_instruction_in_instructions917 = new BitSet(new long[]{0x00000090D0040088L});
    public static final BitSet FOLLOW_DECLARATION_in_declarations942 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_item_dec_in_declarations947 = new BitSet(new long[]{0x0000000000020008L});
    public static final BitSet FOLLOW_IDENT_in_item_dec977 = new BitSet(new long[]{0x0000000000000002L});

}