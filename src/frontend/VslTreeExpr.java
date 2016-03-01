// $ANTLR 3.4 /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g 2016-02-27 12:03:03
package frontend; import backend.*;

import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class VslTreeExpr extends TreeParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "AD", "AG", "ASCII", "ASSIGN_KW", "CD", "CG", "COMMENT", "DIGIT", "DIV", "DO_KW", "ELSE_KW", "FI_KW", "FUNC_KW", "IDENT", "IF_KW", "INTEGER", "INT_KW", "LETTER", "MOINS", "MUL", "OD_KW", "PD", "PG", "PLUS", "PRINT_KW", "PROTO_KW", "READ_KW", "RETURN_KW", "TEXT", "THEN_KW", "VIRG", "VOID_KW", "WHILE_KW", "WS", "APPEL", "BLOC", "CONDITION", "CORPS", "DECLARATION", "INSTRUCTION", "PARAMETRE", "PROGRAMME", "TABLEAU", "TAB_DECLARATION", "TAB_ELEMENT"
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
    public static final int APPEL=38;
    public static final int BLOC=39;
    public static final int CONDITION=40;
    public static final int CORPS=41;
    public static final int DECLARATION=42;
    public static final int INSTRUCTION=43;
    public static final int PARAMETRE=44;
    public static final int PROGRAMME=45;
    public static final int TABLEAU=46;
    public static final int TAB_DECLARATION=47;
    public static final int TAB_ELEMENT=48;

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
                tok = new Tokatt(new TypeFunction(ty), SymbDistrib.newLabel().name, 0);
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
    // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:54:1: prototype[TableSymboles ts] returns [Code code] : ^( PROTO_KW ty= type id= IDENT codes= parametres[ts] ) ;
    public final Code prototype(TableSymboles ts) throws RecognitionException {
        Code code = null;


        CommonTree id=null;
        Type ty =null;

        ArrayList<Code> codes =null;


        code = new Code();
        try {
            // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:56:3: ( ^( PROTO_KW ty= type id= IDENT codes= parametres[ts] ) )
            // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:56:3: ^( PROTO_KW ty= type id= IDENT codes= parametres[ts] )
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
    // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:66:1: type returns [Type type] : ( ^( INT_KW ) | ^( VOID_KW ) );
    public final Type type() throws RecognitionException {
        Type type = null;


        type = null;
        try {
            // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:68:3: ( ^( INT_KW ) | ^( VOID_KW ) )
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
                    // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:68:3: ^( INT_KW )
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
                    // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:69:3: ^( VOID_KW )
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
    // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:72:1: parametres[TableSymboles ts] returns [ArrayList<Code> codes] : ^( PARAMETRE (c= parametre[ts] )* ) ;
    public final ArrayList<Code> parametres(TableSymboles ts) throws RecognitionException {
        ArrayList<Code> codes = null;


        Code c =null;


        codes = new ArrayList<Code>();
        try {
            // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:74:3: ( ^( PARAMETRE (c= parametre[ts] )* ) )
            // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:74:3: ^( PARAMETRE (c= parametre[ts] )* )
            {
            match(input,PARAMETRE,FOLLOW_PARAMETRE_in_parametres270); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:74:15: (c= parametre[ts] )*
                loop4:
                do {
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==IDENT) ) {
                        alt4=1;
                    }


                    switch (alt4) {
                	case 1 :
                	    // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:74:16: c= parametre[ts]
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
    // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:77:1: parametre[TableSymboles ts] returns [Code code] : id= IDENT ;
    public final Code parametre(TableSymboles ts) throws RecognitionException {
        Code code = null;


        CommonTree id=null;

        code = new Code();
        try {
            // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:79:3: (id= IDENT )
            // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:79:3: id= IDENT
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
    // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:87:1: instruction[TableSymboles ts] returns [Code code] : (c1= affectation[ts] |c2= retourne[ts] |c3= impression[ts] |c4= lecture[ts] |c5= conditionnelle[ts] | ^( APPEL id= IDENT (exp= expression[ts] )* ) |c6= iteration[ts] |c7= bloc[ts] );
    public final Code instruction(TableSymboles ts) throws RecognitionException {
        Code code = null;


        CommonTree id=null;
        Code c1 =null;

        Code c2 =null;

        Code c3 =null;

        Code c4 =null;

        Code c5 =null;

        Expratt exp =null;

        Code c6 =null;

        Code c7 =null;


        code = new Code();
        try {
            // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:89:3: (c1= affectation[ts] |c2= retourne[ts] |c3= impression[ts] |c4= lecture[ts] |c5= conditionnelle[ts] | ^( APPEL id= IDENT (exp= expression[ts] )* ) |c6= iteration[ts] |c7= bloc[ts] )
            int alt6=8;
            switch ( input.LA(1) ) {
            case ASSIGN_KW:
                {
                alt6=1;
                }
                break;
            case RETURN_KW:
                {
                alt6=2;
                }
                break;
            case PRINT_KW:
                {
                alt6=3;
                }
                break;
            case READ_KW:
                {
                alt6=4;
                }
                break;
            case IF_KW:
                {
                alt6=5;
                }
                break;
            case APPEL:
                {
                alt6=6;
                }
                break;
            case WHILE_KW:
                {
                alt6=7;
                }
                break;
            case BLOC:
                {
                alt6=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;

            }

            switch (alt6) {
                case 1 :
                    // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:89:3: c1= affectation[ts]
                    {
                    pushFollow(FOLLOW_affectation_in_instruction327);
                    c1=affectation(ts);

                    state._fsp--;



                          code.append(c1);
                      

                    }
                    break;
                case 2 :
                    // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:92:3: c2= retourne[ts]
                    {
                    pushFollow(FOLLOW_retourne_in_instruction336);
                    c2=retourne(ts);

                    state._fsp--;



                          code.append(c2);
                      

                    }
                    break;
                case 3 :
                    // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:95:3: c3= impression[ts]
                    {
                    pushFollow(FOLLOW_impression_in_instruction345);
                    c3=impression(ts);

                    state._fsp--;



                          code.append(c3);
                      

                    }
                    break;
                case 4 :
                    // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:98:3: c4= lecture[ts]
                    {
                    pushFollow(FOLLOW_lecture_in_instruction354);
                    c4=lecture(ts);

                    state._fsp--;



                          code.append(c4);
                      

                    }
                    break;
                case 5 :
                    // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:101:3: c5= conditionnelle[ts]
                    {
                    pushFollow(FOLLOW_conditionnelle_in_instruction364);
                    c5=conditionnelle(ts);

                    state._fsp--;



                          code.append(c5);
                      

                    }
                    break;
                case 6 :
                    // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:104:3: ^( APPEL id= IDENT (exp= expression[ts] )* )
                    {
                    match(input,APPEL,FOLLOW_APPEL_in_instruction372); 

                    match(input, Token.DOWN, null); 
                    id=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_instruction376); 

                     
                        String name = id.getText();    
                        Tokatt tok  = SymbDistrib.newTemp();
                        code.append(new Inst3a(Inst3a.TAC_ARG, tok, null, null));
                      

                    // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:109:3: (exp= expression[ts] )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==DIV||LA5_0==IDENT||LA5_0==INTEGER||(LA5_0 >= MOINS && LA5_0 <= MUL)||LA5_0==PLUS||LA5_0==APPEL) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:109:4: exp= expression[ts]
                    	    {
                    	    pushFollow(FOLLOW_expression_in_instruction386);
                    	    exp=expression(ts);

                    	    state._fsp--;



                    	        code.append(exp.code); 
                    	        code.append(new Inst3a(Inst3a.TAC_ARG, exp.place, null, null));
                    	      

                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);


                    match(input, Token.UP, null); 



                        //Type ty = TypeSystem.CheckFuncCall(name,,ts);
                        
                      

                    }
                    break;
                case 7 :
                    // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:116:3: c6= iteration[ts]
                    {
                    pushFollow(FOLLOW_iteration_in_instruction400);
                    c6=iteration(ts);

                    state._fsp--;



                          code.append(c6);
                      

                    }
                    break;
                case 8 :
                    // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:119:3: c7= bloc[ts]
                    {
                    pushFollow(FOLLOW_bloc_in_instruction410);
                    c7=bloc(ts);

                    state._fsp--;



                    	  code.append(c7);
                    	

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
    // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:124:1: affectation[TableSymboles ts] returns [Code code] : ^( ASSIGN_KW id= IDENT exp= expression[ts] ) ;
    public final Code affectation(TableSymboles ts) throws RecognitionException {
        Code code = null;


        CommonTree id=null;
        Expratt exp =null;


        code = new Code();
        try {
            // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:126:3: ( ^( ASSIGN_KW id= IDENT exp= expression[ts] ) )
            // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:126:3: ^( ASSIGN_KW id= IDENT exp= expression[ts] )
            {
            match(input,ASSIGN_KW,FOLLOW_ASSIGN_KW_in_affectation433); 

            match(input, Token.DOWN, null); 
            id=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_affectation437); 

            pushFollow(FOLLOW_expression_in_affectation441);
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
    // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:137:1: expression[TableSymboles ts] returns [Expratt exp] : ( ^( PLUS exp1= expression[ts] exp2= expression[ts] ) | ^( MOINS exp1= expression[ts] exp2= expression[ts] ) | ^( MUL exp1= expression[ts] exp2= expression[ts] ) | ^( DIV exp1= expression[ts] exp2= expression[ts] ) |exp1= facteur[ts] );
    public final Expratt expression(TableSymboles ts) throws RecognitionException {
        Expratt exp = null;


        Expratt exp1 =null;

        Expratt exp2 =null;


        exp = null;
        try {
            // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:139:3: ( ^( PLUS exp1= expression[ts] exp2= expression[ts] ) | ^( MOINS exp1= expression[ts] exp2= expression[ts] ) | ^( MUL exp1= expression[ts] exp2= expression[ts] ) | ^( DIV exp1= expression[ts] exp2= expression[ts] ) |exp1= facteur[ts] )
            int alt7=5;
            switch ( input.LA(1) ) {
            case PLUS:
                {
                alt7=1;
                }
                break;
            case MOINS:
                {
                alt7=2;
                }
                break;
            case MUL:
                {
                alt7=3;
                }
                break;
            case DIV:
                {
                alt7=4;
                }
                break;
            case IDENT:
            case INTEGER:
            case APPEL:
                {
                alt7=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;

            }

            switch (alt7) {
                case 1 :
                    // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:139:5: ^( PLUS exp1= expression[ts] exp2= expression[ts] )
                    {
                    match(input,PLUS,FOLLOW_PLUS_in_expression469); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression473);
                    exp1=expression(ts);

                    state._fsp--;


                    pushFollow(FOLLOW_expression_in_expression478);
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
                    // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:145:5: ^( MOINS exp1= expression[ts] exp2= expression[ts] )
                    {
                    match(input,MOINS,FOLLOW_MOINS_in_expression489); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression493);
                    exp1=expression(ts);

                    state._fsp--;


                    pushFollow(FOLLOW_expression_in_expression498);
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
                    // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:151:5: ^( MUL exp1= expression[ts] exp2= expression[ts] )
                    {
                    match(input,MUL,FOLLOW_MUL_in_expression508); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression512);
                    exp1=expression(ts);

                    state._fsp--;


                    pushFollow(FOLLOW_expression_in_expression517);
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
                    // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:157:5: ^( DIV exp1= expression[ts] exp2= expression[ts] )
                    {
                    match(input,DIV,FOLLOW_DIV_in_expression527); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression531);
                    exp1=expression(ts);

                    state._fsp--;


                    pushFollow(FOLLOW_expression_in_expression536);
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
                    // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:163:5: exp1= facteur[ts]
                    {
                    pushFollow(FOLLOW_facteur_in_expression549);
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
    // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:168:1: facteur[TableSymboles ts] returns [Expratt exp] : (id= IDENT |i= INTEGER | ^( APPEL id= IDENT (e= expression[ts] )* ) );
    public final Expratt facteur(TableSymboles ts) throws RecognitionException {
        Expratt exp = null;


        CommonTree id=null;
        CommonTree i=null;
        Expratt e =null;


        exp = null;
        try {
            // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:170:3: (id= IDENT |i= INTEGER | ^( APPEL id= IDENT (e= expression[ts] )* ) )
            int alt9=3;
            switch ( input.LA(1) ) {
            case IDENT:
                {
                alt9=1;
                }
                break;
            case INTEGER:
                {
                alt9=2;
                }
                break;
            case APPEL:
                {
                alt9=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;

            }

            switch (alt9) {
                case 1 :
                    // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:170:3: id= IDENT
                    {
                    id=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_facteur582); 


                        String name = id.getText();
                        Type   ty   = TypeSystem.CheckIdent(name, ts);
                        Tokatt tok  = (Tokatt) ts.Lookup(name);
                        exp = new Expratt(ty, new Code(), tok);
                      

                    }
                    break;
                case 2 :
                    // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:176:3: i= INTEGER
                    {
                    i=(CommonTree)match(input,INTEGER,FOLLOW_INTEGER_in_facteur590); 


                        int ival = Integer.parseInt(i.getText());
                        exp = new Expratt(TypeSystem.T_integer, new Code(), new Tokatt(ival));
                      

                    }
                    break;
                case 3 :
                    // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:180:3: ^( APPEL id= IDENT (e= expression[ts] )* )
                    {
                    match(input,APPEL,FOLLOW_APPEL_in_facteur597); 

                    match(input, Token.DOWN, null); 
                    id=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_facteur601); 


                        String name = id.getText();
                        Tokatt tok  = SymbDistrib.newTemp();
                        Code   code = new Code();  
                        code.append(new Inst3a(Inst3a.TAC_ARG, tok, null, null));
                      

                    // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:186:3: (e= expression[ts] )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==DIV||LA8_0==IDENT||LA8_0==INTEGER||(LA8_0 >= MOINS && LA8_0 <= MUL)||LA8_0==PLUS||LA8_0==APPEL) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:186:4: e= expression[ts]
                    	    {
                    	    pushFollow(FOLLOW_expression_in_facteur611);
                    	    e=expression(ts);

                    	    state._fsp--;


                    	      
                    	        code.append(exp.code); 
                    	        code.append(new Inst3a(Inst3a.TAC_ARG, e.place, null, null));
                    	      

                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);


                    match(input, Token.UP, null); 



                        //Type   ty   = TypeSystem.CheckFuncCall(name,,ts);
                        Tokatt tok1 = ts.Lookup(name);
                        code.append(new Inst3a(Inst3a.TAC_CALL, tok, tok1, null));
                        exp = new Expratt(TypeSystem.T_integer, code, tok);
                      

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
    // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:197:1: retourne[TableSymboles ts] returns [Code code] : ^( RETURN_KW exp= expression[ts] ) ;
    public final Code retourne(TableSymboles ts) throws RecognitionException {
        Code code = null;


        Expratt exp =null;


        code = new Code();
        try {
            // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:199:3: ( ^( RETURN_KW exp= expression[ts] ) )
            // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:199:3: ^( RETURN_KW exp= expression[ts] )
            {
            match(input,RETURN_KW,FOLLOW_RETURN_KW_in_retourne640); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_expression_in_retourne644);
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
    // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:204:1: impression[TableSymboles ts] returns [Code code] : ^( PRINT_KW (exp= item_imp[ts] )+ ) ;
    public final Code impression(TableSymboles ts) throws RecognitionException {
        Code code = null;


        Expratt exp =null;


        code = new Code();
        try {
            // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:206:3: ( ^( PRINT_KW (exp= item_imp[ts] )+ ) )
            // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:206:3: ^( PRINT_KW (exp= item_imp[ts] )+ )
            {
            match(input,PRINT_KW,FOLLOW_PRINT_KW_in_impression668); 

            match(input, Token.DOWN, null); 
            // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:206:14: (exp= item_imp[ts] )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==DIV||LA10_0==IDENT||LA10_0==INTEGER||(LA10_0 >= MOINS && LA10_0 <= MUL)||LA10_0==PLUS||LA10_0==TEXT||LA10_0==APPEL) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:206:15: exp= item_imp[ts]
            	    {
            	    pushFollow(FOLLOW_item_imp_in_impression673);
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
    // $ANTLR end "impression"



    // $ANTLR start "item_imp"
    // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:217:1: item_imp[TableSymboles ts] returns [Expratt exp] : (text= TEXT |exp1= expression[ts] );
    public final Expratt item_imp(TableSymboles ts) throws RecognitionException {
        Expratt exp = null;


        CommonTree text=null;
        Expratt exp1 =null;


        exp = null;
        try {
            // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:219:3: (text= TEXT |exp1= expression[ts] )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==TEXT) ) {
                alt11=1;
            }
            else if ( (LA11_0==DIV||LA11_0==IDENT||LA11_0==INTEGER||(LA11_0 >= MOINS && LA11_0 <= MUL)||LA11_0==PLUS||LA11_0==APPEL) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;

            }
            switch (alt11) {
                case 1 :
                    // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:219:3: text= TEXT
                    {
                    text=(CommonTree)match(input,TEXT,FOLLOW_TEXT_in_item_imp701); 


                        String n    = text.getText();
                        Tokatt tok  = new Tokatt(n);
                        Code   code = new Code(new Inst3a(Inst3a.TAC_ARG, tok, null, null));
                        code.appendData(tok);
                        exp = new Expratt(TypeSystem.T_c_text, code, null); 
                      

                    }
                    break;
                case 2 :
                    // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:226:3: exp1= expression[ts]
                    {
                    pushFollow(FOLLOW_expression_in_item_imp709);
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
    // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:234:1: lecture[TableSymboles ts] returns [Code code] : ^( READ_KW (c= item_lec[ts] )+ ) ;
    public final Code lecture(TableSymboles ts) throws RecognitionException {
        Code code = null;


        Code c =null;


        code = new Code();
        try {
            // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:236:3: ( ^( READ_KW (c= item_lec[ts] )+ ) )
            // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:236:3: ^( READ_KW (c= item_lec[ts] )+ )
            {
            match(input,READ_KW,FOLLOW_READ_KW_in_lecture732); 

            match(input, Token.DOWN, null); 
            // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:236:13: (c= item_lec[ts] )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==IDENT) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:236:14: c= item_lec[ts]
            	    {
            	    pushFollow(FOLLOW_item_lec_in_lecture737);
            	    c=item_lec(ts);

            	    state._fsp--;



            	          code.append(c);
            	      

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
    // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:241:1: item_lec[TableSymboles ts] returns [Code code] : id= IDENT ;
    public final Code item_lec(TableSymboles ts) throws RecognitionException {
        Code code = null;


        CommonTree id=null;

        code = new Code();
        try {
            // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:243:3: (id= IDENT )
            // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:243:3: id= IDENT
            {
            id=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_item_lec764); 


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
    // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:252:1: conditionnelle[TableSymboles ts] returns [Code code] : ^( IF_KW exp= expression[ts] c1= instruction[ts] (c2= instruction[ts] )? ) ;
    public final Code conditionnelle(TableSymboles ts) throws RecognitionException {
        Code code = null;


        Expratt exp =null;

        Code c1 =null;

        Code c2 =null;


        code = new Code();
        try {
            // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:254:3: ( ^( IF_KW exp= expression[ts] c1= instruction[ts] (c2= instruction[ts] )? ) )
            // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:254:3: ^( IF_KW exp= expression[ts] c1= instruction[ts] (c2= instruction[ts] )? )
            {
            match(input,IF_KW,FOLLOW_IF_KW_in_conditionnelle787); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_expression_in_conditionnelle791);
            exp=expression(ts);

            state._fsp--;



                Tokatt tok = SymbDistrib.newLabel();
                code.append(exp.code);
                code.append(new Inst3a(Inst3a.TAC_IFZ, exp.place, tok, null));
              

            pushFollow(FOLLOW_instruction_in_conditionnelle801);
            c1=instruction(ts);

            state._fsp--;



                code.append(c1);
                Tokatt tok1 = SymbDistrib.newLabel();
                code.append(new Inst3a(Inst3a.TAC_GOTO, tok1, null, null));
                code.append(new Inst3a(Inst3a.TAC_LABEL, tok, null, null));    
              

            // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:265:3: (c2= instruction[ts] )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==ASSIGN_KW||LA13_0==IF_KW||LA13_0==PRINT_KW||(LA13_0 >= READ_KW && LA13_0 <= RETURN_KW)||LA13_0==WHILE_KW||(LA13_0 >= APPEL && LA13_0 <= BLOC)) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:265:4: c2= instruction[ts]
                    {
                    pushFollow(FOLLOW_instruction_in_conditionnelle811);
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
    // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:273:1: iteration[TableSymboles ts] returns [Code code] : ^( WHILE_KW exp= expression[ts] c= instruction[ts] ) ;
    public final Code iteration(TableSymboles ts) throws RecognitionException {
        Code code = null;


        Expratt exp =null;

        Code c =null;


        code = new Code();
        try {
            // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:275:3: ( ^( WHILE_KW exp= expression[ts] c= instruction[ts] ) )
            // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:275:3: ^( WHILE_KW exp= expression[ts] c= instruction[ts] )
            {
            match(input,WHILE_KW,FOLLOW_WHILE_KW_in_iteration844); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_expression_in_iteration848);
            exp=expression(ts);

            state._fsp--;



                Tokatt tok = SymbDistrib.newLabel();    
                code.append(new Inst3a(Inst3a.TAC_LABEL, tok, null, null));
                
                Tokatt tok1 = SymbDistrib.newLabel();
                code.append(exp.code);
                code.append(new Inst3a(Inst3a.TAC_IFZ, exp.place, tok1, null));
              

            pushFollow(FOLLOW_instruction_in_iteration858);
            c=instruction(ts);

            state._fsp--;



                code.append(c);
                code.append(new Inst3a(Inst3a.TAC_GOTO, tok, null, null));    
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
    // $ANTLR end "iteration"



    // $ANTLR start "bloc"
    // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:290:1: bloc[TableSymboles ts] returns [Code code] : ( ^( BLOC (c1= declarations[ts] ) (c2= instructions[ts] )+ ) | ^( BLOC c3= declarations[ts] ) | ^( BLOC (c4= instructions[ts] )+ ) );
    public final Code bloc(TableSymboles ts) throws RecognitionException {
        Code code = null;


        Code c1 =null;

        Code c2 =null;

        Code c3 =null;

        Code c4 =null;


        code = new Code();
        try {
            // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:292:3: ( ^( BLOC (c1= declarations[ts] ) (c2= instructions[ts] )+ ) | ^( BLOC c3= declarations[ts] ) | ^( BLOC (c4= instructions[ts] )+ ) )
            int alt16=3;
            alt16 = dfa16.predict(input);
            switch (alt16) {
                case 1 :
                    // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:292:3: ^( BLOC (c1= declarations[ts] ) (c2= instructions[ts] )+ )
                    {
                    match(input,BLOC,FOLLOW_BLOC_in_bloc888); 

                    ts.Enter_Scope();

                    match(input, Token.DOWN, null); 
                    // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:293:3: (c1= declarations[ts] )
                    // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:293:4: c1= declarations[ts]
                    {
                    pushFollow(FOLLOW_declarations_in_bloc898);
                    c1=declarations(ts);

                    state._fsp--;


                    code.append(c1);

                    }


                    // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:294:3: (c2= instructions[ts] )+
                    int cnt14=0;
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==INSTRUCTION) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:294:4: c2= instructions[ts]
                    	    {
                    	    pushFollow(FOLLOW_instructions_in_bloc910);
                    	    c2=instructions(ts);

                    	    state._fsp--;


                    	    code.append(c2);

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt14 >= 1 ) break loop14;
                                EarlyExitException eee =
                                    new EarlyExitException(14, input);
                                throw eee;
                        }
                        cnt14++;
                    } while (true);


                    ts.Leave_Scope();

                    match(input, Token.UP, null); 


                    }
                    break;
                case 2 :
                    // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:296:3: ^( BLOC c3= declarations[ts] )
                    {
                    match(input,BLOC,FOLLOW_BLOC_in_bloc925); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_declarations_in_bloc929);
                    c3=declarations(ts);

                    state._fsp--;


                    code.append(c3);

                    match(input, Token.UP, null); 


                    }
                    break;
                case 3 :
                    // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:297:3: ^( BLOC (c4= instructions[ts] )+ )
                    {
                    match(input,BLOC,FOLLOW_BLOC_in_bloc939); 

                    match(input, Token.DOWN, null); 
                    // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:297:10: (c4= instructions[ts] )+
                    int cnt15=0;
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==INSTRUCTION) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:297:11: c4= instructions[ts]
                    	    {
                    	    pushFollow(FOLLOW_instructions_in_bloc944);
                    	    c4=instructions(ts);

                    	    state._fsp--;


                    	    code.append(c4);

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
    // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:300:1: instructions[TableSymboles ts] returns [Code code] : ^( INSTRUCTION (c= instruction[ts] )+ ) ;
    public final Code instructions(TableSymboles ts) throws RecognitionException {
        Code code = null;


        Code c =null;


        code = new Code();
        try {
            // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:302:3: ( ^( INSTRUCTION (c= instruction[ts] )+ ) )
            // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:302:3: ^( INSTRUCTION (c= instruction[ts] )+ )
            {
            match(input,INSTRUCTION,FOLLOW_INSTRUCTION_in_instructions971); 

            match(input, Token.DOWN, null); 
            // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:302:17: (c= instruction[ts] )+
            int cnt17=0;
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==ASSIGN_KW||LA17_0==IF_KW||LA17_0==PRINT_KW||(LA17_0 >= READ_KW && LA17_0 <= RETURN_KW)||LA17_0==WHILE_KW||(LA17_0 >= APPEL && LA17_0 <= BLOC)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:302:18: c= instruction[ts]
            	    {
            	    pushFollow(FOLLOW_instruction_in_instructions976);
            	    c=instruction(ts);

            	    state._fsp--;



            	        code.append(c);
            	      

            	    }
            	    break;

            	default :
            	    if ( cnt17 >= 1 ) break loop17;
                        EarlyExitException eee =
                            new EarlyExitException(17, input);
                        throw eee;
                }
                cnt17++;
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
    // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:307:1: declarations[TableSymboles ts] returns [Code code] : ^( DECLARATION (c= item_dec[ts] )+ ) ;
    public final Code declarations(TableSymboles ts) throws RecognitionException {
        Code code = null;


        Code c =null;


        code = new Code();
        try {
            // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:309:3: ( ^( DECLARATION (c= item_dec[ts] )+ ) )
            // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:309:3: ^( DECLARATION (c= item_dec[ts] )+ )
            {
            match(input,DECLARATION,FOLLOW_DECLARATION_in_declarations1001); 

            match(input, Token.DOWN, null); 
            // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:309:17: (c= item_dec[ts] )+
            int cnt18=0;
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==IDENT) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:309:18: c= item_dec[ts]
            	    {
            	    pushFollow(FOLLOW_item_dec_in_declarations1006);
            	    c=item_dec(ts);

            	    state._fsp--;


            	    code.append(c);

            	    }
            	    break;

            	default :
            	    if ( cnt18 >= 1 ) break loop18;
                        EarlyExitException eee =
                            new EarlyExitException(18, input);
                        throw eee;
                }
                cnt18++;
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
    // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:312:1: item_dec[TableSymboles ts] returns [Code code] : id= IDENT ;
    public final Code item_dec(TableSymboles ts) throws RecognitionException {
        Code code = null;


        CommonTree id=null;

        code = new Code();
        try {
            // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:314:3: (id= IDENT )
            // /home/heyoen/workspace/VSL/bin/frontend/VslTreeExpr.g:314:3: id= IDENT
            {
            id=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_item_dec1036); 


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


    protected DFA16 dfa16 = new DFA16(this);
    static final String DFA16_eotS =
        "\12\uffff";
    static final String DFA16_eofS =
        "\12\uffff";
    static final String DFA16_minS =
        "\1\47\1\2\1\52\1\2\1\uffff\1\21\2\3\2\uffff";
    static final String DFA16_maxS =
        "\1\47\1\2\1\53\1\2\1\uffff\2\21\1\53\2\uffff";
    static final String DFA16_acceptS =
        "\4\uffff\1\3\3\uffff\1\1\1\2";
    static final String DFA16_specialS =
        "\12\uffff}>";
    static final String[] DFA16_transitionS = {
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

    static final short[] DFA16_eot = DFA.unpackEncodedString(DFA16_eotS);
    static final short[] DFA16_eof = DFA.unpackEncodedString(DFA16_eofS);
    static final char[] DFA16_min = DFA.unpackEncodedStringToUnsignedChars(DFA16_minS);
    static final char[] DFA16_max = DFA.unpackEncodedStringToUnsignedChars(DFA16_maxS);
    static final short[] DFA16_accept = DFA.unpackEncodedString(DFA16_acceptS);
    static final short[] DFA16_special = DFA.unpackEncodedString(DFA16_specialS);
    static final short[][] DFA16_transition;

    static {
        int numStates = DFA16_transitionS.length;
        DFA16_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA16_transition[i] = DFA.unpackEncodedString(DFA16_transitionS[i]);
        }
    }

    class DFA16 extends DFA {

        public DFA16(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 16;
            this.eot = DFA16_eot;
            this.eof = DFA16_eof;
            this.min = DFA16_min;
            this.max = DFA16_max;
            this.accept = DFA16_accept;
            this.special = DFA16_special;
            this.transition = DFA16_transition;
        }
        public String getDescription() {
            return "290:1: bloc[TableSymboles ts] returns [Code code] : ( ^( BLOC (c1= declarations[ts] ) (c2= instructions[ts] )+ ) | ^( BLOC c3= declarations[ts] ) | ^( BLOC (c4= instructions[ts] )+ ) );";
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
    public static final BitSet FOLLOW_APPEL_in_instruction372 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_instruction376 = new BitSet(new long[]{0x0000004008CA1008L});
    public static final BitSet FOLLOW_expression_in_instruction386 = new BitSet(new long[]{0x0000004008CA1008L});
    public static final BitSet FOLLOW_iteration_in_instruction400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bloc_in_instruction410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ASSIGN_KW_in_affectation433 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_affectation437 = new BitSet(new long[]{0x0000004008CA1000L});
    public static final BitSet FOLLOW_expression_in_affectation441 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PLUS_in_expression469 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression473 = new BitSet(new long[]{0x0000004008CA1000L});
    public static final BitSet FOLLOW_expression_in_expression478 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MOINS_in_expression489 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression493 = new BitSet(new long[]{0x0000004008CA1000L});
    public static final BitSet FOLLOW_expression_in_expression498 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MUL_in_expression508 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression512 = new BitSet(new long[]{0x0000004008CA1000L});
    public static final BitSet FOLLOW_expression_in_expression517 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DIV_in_expression527 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression531 = new BitSet(new long[]{0x0000004008CA1000L});
    public static final BitSet FOLLOW_expression_in_expression536 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_facteur_in_expression549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_facteur582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTEGER_in_facteur590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_APPEL_in_facteur597 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_facteur601 = new BitSet(new long[]{0x0000004008CA1008L});
    public static final BitSet FOLLOW_expression_in_facteur611 = new BitSet(new long[]{0x0000004008CA1008L});
    public static final BitSet FOLLOW_RETURN_KW_in_retourne640 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_retourne644 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PRINT_KW_in_impression668 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_item_imp_in_impression673 = new BitSet(new long[]{0x0000004108CA1008L});
    public static final BitSet FOLLOW_TEXT_in_item_imp701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_item_imp709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_READ_KW_in_lecture732 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_item_lec_in_lecture737 = new BitSet(new long[]{0x0000000000020008L});
    public static final BitSet FOLLOW_IDENT_in_item_lec764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_KW_in_conditionnelle787 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_conditionnelle791 = new BitSet(new long[]{0x000000D0D0040080L});
    public static final BitSet FOLLOW_instruction_in_conditionnelle801 = new BitSet(new long[]{0x000000D0D0040088L});
    public static final BitSet FOLLOW_instruction_in_conditionnelle811 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_WHILE_KW_in_iteration844 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_iteration848 = new BitSet(new long[]{0x000000D0D0040080L});
    public static final BitSet FOLLOW_instruction_in_iteration858 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BLOC_in_bloc888 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_declarations_in_bloc898 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_instructions_in_bloc910 = new BitSet(new long[]{0x0000080000000008L});
    public static final BitSet FOLLOW_BLOC_in_bloc925 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_declarations_in_bloc929 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BLOC_in_bloc939 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_instructions_in_bloc944 = new BitSet(new long[]{0x0000080000000008L});
    public static final BitSet FOLLOW_INSTRUCTION_in_instructions971 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_instruction_in_instructions976 = new BitSet(new long[]{0x000000D0D0040088L});
    public static final BitSet FOLLOW_DECLARATION_in_declarations1001 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_item_dec_in_declarations1006 = new BitSet(new long[]{0x0000000000020008L});
    public static final BitSet FOLLOW_IDENT_in_item_dec1036 = new BitSet(new long[]{0x0000000000000002L});

}