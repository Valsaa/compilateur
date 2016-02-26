// $ANTLR 3.4 /home/heyoen/workspace/VSL/bin/frontend/VslParser.g 2016-02-26 21:12:38
package frontend;

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class VslParser extends Parser {
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
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public VslParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public VslParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

protected TreeAdaptor adaptor = new CommonTreeAdaptor();

public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = adaptor;
}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}
    public String[] getTokenNames() { return VslParser.tokenNames; }
    public String getGrammarFileName() { return "/home/heyoen/workspace/VSL/bin/frontend/VslParser.g"; }


    public static class program_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "program"
    // /home/heyoen/workspace/VSL/bin/frontend/VslParser.g:25:1: program : ( unite )+ -> ^( PROGRAMME ( unite )+ ) ;
    public final VslParser.program_return program() throws RecognitionException {
        VslParser.program_return retval = new VslParser.program_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        VslParser.unite_return unite1 =null;


        RewriteRuleSubtreeStream stream_unite=new RewriteRuleSubtreeStream(adaptor,"rule unite");
        try {
            // /home/heyoen/workspace/VSL/bin/frontend/VslParser.g:25:16: ( ( unite )+ -> ^( PROGRAMME ( unite )+ ) )
            // /home/heyoen/workspace/VSL/bin/frontend/VslParser.g:25:18: ( unite )+
            {
            // /home/heyoen/workspace/VSL/bin/frontend/VslParser.g:25:18: ( unite )+
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
            	    // /home/heyoen/workspace/VSL/bin/frontend/VslParser.g:25:18: unite
            	    {
            	    pushFollow(FOLLOW_unite_in_program120);
            	    unite1=unite();

            	    state._fsp--;

            	    stream_unite.add(unite1.getTree());

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


            // AST REWRITE
            // elements: unite
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 26:18: -> ^( PROGRAMME ( unite )+ )
            {
                // /home/heyoen/workspace/VSL/bin/frontend/VslParser.g:26:21: ^( PROGRAMME ( unite )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(PROGRAMME, "PROGRAMME")
                , root_1);

                if ( !(stream_unite.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_unite.hasNext() ) {
                    adaptor.addChild(root_1, stream_unite.nextTree());

                }
                stream_unite.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "program"


    public static class unite_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "unite"
    // /home/heyoen/workspace/VSL/bin/frontend/VslParser.g:28:1: unite : ( fonction | prototype );
    public final VslParser.unite_return unite() throws RecognitionException {
        VslParser.unite_return retval = new VslParser.unite_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        VslParser.fonction_return fonction2 =null;

        VslParser.prototype_return prototype3 =null;



        try {
            // /home/heyoen/workspace/VSL/bin/frontend/VslParser.g:28:16: ( fonction | prototype )
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
                    // /home/heyoen/workspace/VSL/bin/frontend/VslParser.g:28:18: fonction
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_fonction_in_unite165);
                    fonction2=fonction();

                    state._fsp--;

                    adaptor.addChild(root_0, fonction2.getTree());

                    }
                    break;
                case 2 :
                    // /home/heyoen/workspace/VSL/bin/frontend/VslParser.g:28:29: prototype
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_prototype_in_unite169);
                    prototype3=prototype();

                    state._fsp--;

                    adaptor.addChild(root_0, prototype3.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "unite"


    public static class fonction_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "fonction"
    // /home/heyoen/workspace/VSL/bin/frontend/VslParser.g:30:1: fonction : FUNC_KW type IDENT PG parametres PD instruction -> ^( FUNC_KW type IDENT parametres ^( CORPS instruction ) ) ;
    public final VslParser.fonction_return fonction() throws RecognitionException {
        VslParser.fonction_return retval = new VslParser.fonction_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token FUNC_KW4=null;
        Token IDENT6=null;
        Token PG7=null;
        Token PD9=null;
        VslParser.type_return type5 =null;

        VslParser.parametres_return parametres8 =null;

        VslParser.instruction_return instruction10 =null;


        Object FUNC_KW4_tree=null;
        Object IDENT6_tree=null;
        Object PG7_tree=null;
        Object PD9_tree=null;
        RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
        RewriteRuleTokenStream stream_PD=new RewriteRuleTokenStream(adaptor,"token PD");
        RewriteRuleTokenStream stream_PG=new RewriteRuleTokenStream(adaptor,"token PG");
        RewriteRuleTokenStream stream_FUNC_KW=new RewriteRuleTokenStream(adaptor,"token FUNC_KW");
        RewriteRuleSubtreeStream stream_parametres=new RewriteRuleSubtreeStream(adaptor,"rule parametres");
        RewriteRuleSubtreeStream stream_instruction=new RewriteRuleSubtreeStream(adaptor,"rule instruction");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            // /home/heyoen/workspace/VSL/bin/frontend/VslParser.g:30:16: ( FUNC_KW type IDENT PG parametres PD instruction -> ^( FUNC_KW type IDENT parametres ^( CORPS instruction ) ) )
            // /home/heyoen/workspace/VSL/bin/frontend/VslParser.g:30:18: FUNC_KW type IDENT PG parametres PD instruction
            {
            FUNC_KW4=(Token)match(input,FUNC_KW,FOLLOW_FUNC_KW_in_fonction183);  
            stream_FUNC_KW.add(FUNC_KW4);


            pushFollow(FOLLOW_type_in_fonction185);
            type5=type();

            state._fsp--;

            stream_type.add(type5.getTree());

            IDENT6=(Token)match(input,IDENT,FOLLOW_IDENT_in_fonction187);  
            stream_IDENT.add(IDENT6);


            PG7=(Token)match(input,PG,FOLLOW_PG_in_fonction189);  
            stream_PG.add(PG7);


            pushFollow(FOLLOW_parametres_in_fonction191);
            parametres8=parametres();

            state._fsp--;

            stream_parametres.add(parametres8.getTree());

            PD9=(Token)match(input,PD,FOLLOW_PD_in_fonction193);  
            stream_PD.add(PD9);


            pushFollow(FOLLOW_instruction_in_fonction195);
            instruction10=instruction();

            state._fsp--;

            stream_instruction.add(instruction10.getTree());

            // AST REWRITE
            // elements: instruction, type, parametres, FUNC_KW, IDENT
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 31:18: -> ^( FUNC_KW type IDENT parametres ^( CORPS instruction ) )
            {
                // /home/heyoen/workspace/VSL/bin/frontend/VslParser.g:31:21: ^( FUNC_KW type IDENT parametres ^( CORPS instruction ) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                stream_FUNC_KW.nextNode()
                , root_1);

                adaptor.addChild(root_1, stream_type.nextTree());

                adaptor.addChild(root_1, 
                stream_IDENT.nextNode()
                );

                adaptor.addChild(root_1, stream_parametres.nextTree());

                // /home/heyoen/workspace/VSL/bin/frontend/VslParser.g:31:53: ^( CORPS instruction )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(CORPS, "CORPS")
                , root_2);

                adaptor.addChild(root_2, stream_instruction.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "fonction"


    public static class prototype_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "prototype"
    // /home/heyoen/workspace/VSL/bin/frontend/VslParser.g:33:1: prototype : PROTO_KW ^ type IDENT PG ! parametres PD !;
    public final VslParser.prototype_return prototype() throws RecognitionException {
        VslParser.prototype_return retval = new VslParser.prototype_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token PROTO_KW11=null;
        Token IDENT13=null;
        Token PG14=null;
        Token PD16=null;
        VslParser.type_return type12 =null;

        VslParser.parametres_return parametres15 =null;


        Object PROTO_KW11_tree=null;
        Object IDENT13_tree=null;
        Object PG14_tree=null;
        Object PD16_tree=null;

        try {
            // /home/heyoen/workspace/VSL/bin/frontend/VslParser.g:33:16: ( PROTO_KW ^ type IDENT PG ! parametres PD !)
            // /home/heyoen/workspace/VSL/bin/frontend/VslParser.g:33:18: PROTO_KW ^ type IDENT PG ! parametres PD !
            {
            root_0 = (Object)adaptor.nil();


            PROTO_KW11=(Token)match(input,PROTO_KW,FOLLOW_PROTO_KW_in_prototype243); 
            PROTO_KW11_tree = 
            (Object)adaptor.create(PROTO_KW11)
            ;
            root_0 = (Object)adaptor.becomeRoot(PROTO_KW11_tree, root_0);


            pushFollow(FOLLOW_type_in_prototype246);
            type12=type();

            state._fsp--;

            adaptor.addChild(root_0, type12.getTree());

            IDENT13=(Token)match(input,IDENT,FOLLOW_IDENT_in_prototype248); 
            IDENT13_tree = 
            (Object)adaptor.create(IDENT13)
            ;
            adaptor.addChild(root_0, IDENT13_tree);


            PG14=(Token)match(input,PG,FOLLOW_PG_in_prototype250); 

            pushFollow(FOLLOW_parametres_in_prototype253);
            parametres15=parametres();

            state._fsp--;

            adaptor.addChild(root_0, parametres15.getTree());

            PD16=(Token)match(input,PD,FOLLOW_PD_in_prototype255); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "prototype"


    public static class type_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "type"
    // /home/heyoen/workspace/VSL/bin/frontend/VslParser.g:35:1: type : ( INT_KW ^| VOID_KW ^);
    public final VslParser.type_return type() throws RecognitionException {
        VslParser.type_return retval = new VslParser.type_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token INT_KW17=null;
        Token VOID_KW18=null;

        Object INT_KW17_tree=null;
        Object VOID_KW18_tree=null;

        try {
            // /home/heyoen/workspace/VSL/bin/frontend/VslParser.g:35:16: ( INT_KW ^| VOID_KW ^)
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
                    // /home/heyoen/workspace/VSL/bin/frontend/VslParser.g:35:18: INT_KW ^
                    {
                    root_0 = (Object)adaptor.nil();


                    INT_KW17=(Token)match(input,INT_KW,FOLLOW_INT_KW_in_type275); 
                    INT_KW17_tree = 
                    (Object)adaptor.create(INT_KW17)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(INT_KW17_tree, root_0);


                    }
                    break;
                case 2 :
                    // /home/heyoen/workspace/VSL/bin/frontend/VslParser.g:35:28: VOID_KW ^
                    {
                    root_0 = (Object)adaptor.nil();


                    VOID_KW18=(Token)match(input,VOID_KW,FOLLOW_VOID_KW_in_type280); 
                    VOID_KW18_tree = 
                    (Object)adaptor.create(VOID_KW18)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(VOID_KW18_tree, root_0);


                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "type"


    public static class parametres_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "parametres"
    // /home/heyoen/workspace/VSL/bin/frontend/VslParser.g:37:1: parametres : ( parametre ( VIRG parametre ) -> ^( PARAMETRE parametre ) | -> ^( PARAMETRE ) );
    public final VslParser.parametres_return parametres() throws RecognitionException {
        VslParser.parametres_return retval = new VslParser.parametres_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token VIRG20=null;
        VslParser.parametre_return parametre19 =null;

        VslParser.parametre_return parametre21 =null;


        Object VIRG20_tree=null;
        RewriteRuleTokenStream stream_VIRG=new RewriteRuleTokenStream(adaptor,"token VIRG");
        RewriteRuleSubtreeStream stream_parametre=new RewriteRuleSubtreeStream(adaptor,"rule parametre");
        try {
            // /home/heyoen/workspace/VSL/bin/frontend/VslParser.g:37:16: ( parametre ( VIRG parametre ) -> ^( PARAMETRE parametre ) | -> ^( PARAMETRE ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==IDENT) ) {
                alt4=1;
            }
            else if ( (LA4_0==PD) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;

            }
            switch (alt4) {
                case 1 :
                    // /home/heyoen/workspace/VSL/bin/frontend/VslParser.g:37:18: parametre ( VIRG parametre )
                    {
                    pushFollow(FOLLOW_parametre_in_parametres293);
                    parametre19=parametre();

                    state._fsp--;

                    stream_parametre.add(parametre19.getTree());

                    // /home/heyoen/workspace/VSL/bin/frontend/VslParser.g:37:28: ( VIRG parametre )
                    // /home/heyoen/workspace/VSL/bin/frontend/VslParser.g:37:29: VIRG parametre
                    {
                    VIRG20=(Token)match(input,VIRG,FOLLOW_VIRG_in_parametres296);  
                    stream_VIRG.add(VIRG20);


                    pushFollow(FOLLOW_parametre_in_parametres298);
                    parametre21=parametre();

                    state._fsp--;

                    stream_parametre.add(parametre21.getTree());

                    }


                    // AST REWRITE
                    // elements: parametre
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 38:18: -> ^( PARAMETRE parametre )
                    {
                        // /home/heyoen/workspace/VSL/bin/frontend/VslParser.g:38:21: ^( PARAMETRE parametre )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(PARAMETRE, "PARAMETRE")
                        , root_1);

                        adaptor.addChild(root_1, stream_parametre.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // /home/heyoen/workspace/VSL/bin/frontend/VslParser.g:38:46: 
                    {
                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 38:46: -> ^( PARAMETRE )
                    {
                        // /home/heyoen/workspace/VSL/bin/frontend/VslParser.g:38:49: ^( PARAMETRE )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(PARAMETRE, "PARAMETRE")
                        , root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "parametres"


    public static class parametre_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "parametre"
    // /home/heyoen/workspace/VSL/bin/frontend/VslParser.g:40:1: parametre : ( IDENT | IDENT CG CD -> ^( TABLEAU IDENT ) );
    public final VslParser.parametre_return parametre() throws RecognitionException {
        VslParser.parametre_return retval = new VslParser.parametre_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token IDENT22=null;
        Token IDENT23=null;
        Token CG24=null;
        Token CD25=null;

        Object IDENT22_tree=null;
        Object IDENT23_tree=null;
        Object CG24_tree=null;
        Object CD25_tree=null;
        RewriteRuleTokenStream stream_CD=new RewriteRuleTokenStream(adaptor,"token CD");
        RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
        RewriteRuleTokenStream stream_CG=new RewriteRuleTokenStream(adaptor,"token CG");

        try {
            // /home/heyoen/workspace/VSL/bin/frontend/VslParser.g:40:16: ( IDENT | IDENT CG CD -> ^( TABLEAU IDENT ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==IDENT) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==CG) ) {
                    alt5=2;
                }
                else if ( (LA5_1==PD||LA5_1==VIRG) ) {
                    alt5=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;

            }
            switch (alt5) {
                case 1 :
                    // /home/heyoen/workspace/VSL/bin/frontend/VslParser.g:40:18: IDENT
                    {
                    root_0 = (Object)adaptor.nil();


                    IDENT22=(Token)match(input,IDENT,FOLLOW_IDENT_in_parametre345); 
                    IDENT22_tree = 
                    (Object)adaptor.create(IDENT22)
                    ;
                    adaptor.addChild(root_0, IDENT22_tree);


                    }
                    break;
                case 2 :
                    // /home/heyoen/workspace/VSL/bin/frontend/VslParser.g:40:26: IDENT CG CD
                    {
                    IDENT23=(Token)match(input,IDENT,FOLLOW_IDENT_in_parametre349);  
                    stream_IDENT.add(IDENT23);


                    CG24=(Token)match(input,CG,FOLLOW_CG_in_parametre351);  
                    stream_CG.add(CG24);


                    CD25=(Token)match(input,CD,FOLLOW_CD_in_parametre353);  
                    stream_CD.add(CD25);


                    // AST REWRITE
                    // elements: IDENT
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 41:18: -> ^( TABLEAU IDENT )
                    {
                        // /home/heyoen/workspace/VSL/bin/frontend/VslParser.g:41:21: ^( TABLEAU IDENT )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(TABLEAU, "TABLEAU")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_IDENT.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "parametre"


    public static class instruction_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "instruction"
    // /home/heyoen/workspace/VSL/bin/frontend/VslParser.g:43:1: instruction : ( affectation | retourne | impression | lecture | conditionnelle | appelFonction | iteration | bloc );
    public final VslParser.instruction_return instruction() throws RecognitionException {
        VslParser.instruction_return retval = new VslParser.instruction_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        VslParser.affectation_return affectation26 =null;

        VslParser.retourne_return retourne27 =null;

        VslParser.impression_return impression28 =null;

        VslParser.lecture_return lecture29 =null;

        VslParser.conditionnelle_return conditionnelle30 =null;

        VslParser.appelFonction_return appelFonction31 =null;

        VslParser.iteration_return iteration32 =null;

        VslParser.bloc_return bloc33 =null;



        try {
            // /home/heyoen/workspace/VSL/bin/frontend/VslParser.g:43:16: ( affectation | retourne | impression | lecture | conditionnelle | appelFonction | iteration | bloc )
            int alt6=8;
            switch ( input.LA(1) ) {
            case IDENT:
                {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==ASSIGN_KW||LA6_1==CG) ) {
                    alt6=1;
                }
                else if ( (LA6_1==PG) ) {
                    alt6=6;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;

                }
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
            case WHILE_KW:
                {
                alt6=7;
                }
                break;
            case AG:
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
                    // /home/heyoen/workspace/VSL/bin/frontend/VslParser.g:43:18: affectation
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_affectation_in_instruction390);
                    affectation26=affectation();

                    state._fsp--;

                    adaptor.addChild(root_0, affectation26.getTree());

                    }
                    break;
                case 2 :
                    // /home/heyoen/workspace/VSL/bin/frontend/VslParser.g:43:32: retourne
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_retourne_in_instruction394);
                    retourne27=retourne();

                    state._fsp--;

                    adaptor.addChild(root_0, retourne27.getTree());

                    }
                    break;
                case 3 :
                    // /home/heyoen/workspace/VSL/bin/frontend/VslParser.g:43:43: impression
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_impression_in_instruction398);
                    impression28=impression();

                    state._fsp--;

                    adaptor.addChild(root_0, impression28.getTree());

                    }
                    break;
                case 4 :
                    // /home/heyoen/workspace/VSL/bin/frontend/VslParser.g:43:56: lecture
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_lecture_in_instruction402);
                    lecture29=lecture();

                    state._fsp--;

                    adaptor.addChild(root_0, lecture29.getTree());

                    }
                    break;
                case 5 :
                    // /home/heyoen/workspace/VSL/bin/frontend/VslParser.g:43:66: conditionnelle
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_conditionnelle_in_instruction406);
                    conditionnelle30=conditionnelle();

                    state._fsp--;

                    adaptor.addChild(root_0, conditionnelle30.getTree());

                    }
                    break;
                case 6 :
                    // /home/heyoen/workspace/VSL/bin/frontend/VslParser.g:43:83: appelFonction
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_appelFonction_in_instruction410);
                    appelFonction31=appelFonction();

                    state._fsp--;

                    adaptor.addChild(root_0, appelFonction31.getTree());

                    }
                    break;
                case 7 :
                    // /home/heyoen/workspace/VSL/bin/frontend/VslParser.g:43:99: iteration
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_iteration_in_instruction414);
                    iteration32=iteration();

                    state._fsp--;

                    adaptor.addChild(root_0, iteration32.getTree());

                    }
                    break;
                case 8 :
                    // /home/heyoen/workspace/VSL/bin/frontend/VslParser.g:43:111: bloc
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_bloc_in_instruction418);
                    bloc33=bloc();

                    state._fsp--;

                    adaptor.addChild(root_0, bloc33.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "instruction"


    public static class affectation_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "affectation"
    // /home/heyoen/workspace/VSL/bin/frontend/VslParser.g:45:1: affectation : ( IDENT ASSIGN_KW ^ expression | tableau_elem ASSIGN_KW expression -> ^( ASSIGN_KW tableau_elem expression ) );
    public final VslParser.affectation_return affectation() throws RecognitionException {
        VslParser.affectation_return retval = new VslParser.affectation_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token IDENT34=null;
        Token ASSIGN_KW35=null;
        Token ASSIGN_KW38=null;
        VslParser.expression_return expression36 =null;

        VslParser.tableau_elem_return tableau_elem37 =null;

        VslParser.expression_return expression39 =null;


        Object IDENT34_tree=null;
        Object ASSIGN_KW35_tree=null;
        Object ASSIGN_KW38_tree=null;
        RewriteRuleTokenStream stream_ASSIGN_KW=new RewriteRuleTokenStream(adaptor,"token ASSIGN_KW");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_tableau_elem=new RewriteRuleSubtreeStream(adaptor,"rule tableau_elem");
        try {
            // /home/heyoen/workspace/VSL/bin/frontend/VslParser.g:45:16: ( IDENT ASSIGN_KW ^ expression | tableau_elem ASSIGN_KW expression -> ^( ASSIGN_KW tableau_elem expression ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==IDENT) ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==ASSIGN_KW) ) {
                    alt7=1;
                }
                else if ( (LA7_1==CG) ) {
                    alt7=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;

            }
            switch (alt7) {
                case 1 :
                    // /home/heyoen/workspace/VSL/bin/frontend/VslParser.g:45:18: IDENT ASSIGN_KW ^ expression
                    {
                    root_0 = (Object)adaptor.nil();


                    IDENT34=(Token)match(input,IDENT,FOLLOW_IDENT_in_affectation429); 
                    IDENT34_tree = 
                    (Object)adaptor.create(IDENT34)
                    ;
                    adaptor.addChild(root_0, IDENT34_tree);


                    ASSIGN_KW35=(Token)match(input,ASSIGN_KW,FOLLOW_ASSIGN_KW_in_affectation431); 
                    ASSIGN_KW35_tree = 
                    (Object)adaptor.create(ASSIGN_KW35)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(ASSIGN_KW35_tree, root_0);


                    pushFollow(FOLLOW_expression_in_affectation434);
                    expression36=expression();

                    state._fsp--;

                    adaptor.addChild(root_0, expression36.getTree());

                    }
                    break;
                case 2 :
                    // /home/heyoen/workspace/VSL/bin/frontend/VslParser.g:45:48: tableau_elem ASSIGN_KW expression
                    {
                    pushFollow(FOLLOW_tableau_elem_in_affectation438);
                    tableau_elem37=tableau_elem();

                    state._fsp--;

                    stream_tableau_elem.add(tableau_elem37.getTree());

                    ASSIGN_KW38=(Token)match(input,ASSIGN_KW,FOLLOW_ASSIGN_KW_in_affectation440);  
                    stream_ASSIGN_KW.add(ASSIGN_KW38);


                    pushFollow(FOLLOW_expression_in_affectation442);
                    expression39=expression();

                    state._fsp--;

                    stream_expression.add(expression39.getTree());

                    // AST REWRITE
                    // elements: ASSIGN_KW, tableau_elem, expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 46:18: -> ^( ASSIGN_KW tableau_elem expression )
                    {
                        // /home/heyoen/workspace/VSL/bin/frontend/VslParser.g:46:21: ^( ASSIGN_KW tableau_elem expression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_ASSIGN_KW.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, stream_tableau_elem.nextTree());

                        adaptor.addChild(root_1, stream_expression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "affectation"


    public static class expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expression"
    // /home/heyoen/workspace/VSL/bin/frontend/VslParser.g:48:1: expression : terme ( ( PLUS ^| MOINS ^) terme )* ;
    public final VslParser.expression_return expression() throws RecognitionException {
        VslParser.expression_return retval = new VslParser.expression_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token PLUS41=null;
        Token MOINS42=null;
        VslParser.terme_return terme40 =null;

        VslParser.terme_return terme43 =null;


        Object PLUS41_tree=null;
        Object MOINS42_tree=null;

        try {
            // /home/heyoen/workspace/VSL/bin/frontend/VslParser.g:48:16: ( terme ( ( PLUS ^| MOINS ^) terme )* )
            // /home/heyoen/workspace/VSL/bin/frontend/VslParser.g:48:18: terme ( ( PLUS ^| MOINS ^) terme )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_terme_in_expression482);
            terme40=terme();

            state._fsp--;

            adaptor.addChild(root_0, terme40.getTree());

            // /home/heyoen/workspace/VSL/bin/frontend/VslParser.g:48:24: ( ( PLUS ^| MOINS ^) terme )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==MOINS||LA9_0==PLUS) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // /home/heyoen/workspace/VSL/bin/frontend/VslParser.g:48:25: ( PLUS ^| MOINS ^) terme
            	    {
            	    // /home/heyoen/workspace/VSL/bin/frontend/VslParser.g:48:25: ( PLUS ^| MOINS ^)
            	    int alt8=2;
            	    int LA8_0 = input.LA(1);

            	    if ( (LA8_0==PLUS) ) {
            	        alt8=1;
            	    }
            	    else if ( (LA8_0==MOINS) ) {
            	        alt8=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 8, 0, input);

            	        throw nvae;

            	    }
            	    switch (alt8) {
            	        case 1 :
            	            // /home/heyoen/workspace/VSL/bin/frontend/VslParser.g:48:26: PLUS ^
            	            {
            	            PLUS41=(Token)match(input,PLUS,FOLLOW_PLUS_in_expression486); 
            	            PLUS41_tree = 
            	            (Object)adaptor.create(PLUS41)
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(PLUS41_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // /home/heyoen/workspace/VSL/bin/frontend/VslParser.g:48:33: MOINS ^
            	            {
            	            MOINS42=(Token)match(input,MOINS,FOLLOW_MOINS_in_expression490); 
            	            MOINS42_tree = 
            	            (Object)adaptor.create(MOINS42)
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(MOINS42_tree, root_0);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_terme_in_expression494);
            	    terme43=terme();

            	    state._fsp--;

            	    adaptor.addChild(root_0, terme43.getTree());

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "expression"


    public static class terme_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "terme"
    // /home/heyoen/workspace/VSL/bin/frontend/VslParser.g:50:1: terme : facteur ( ( MUL ^| DIV ^) facteur )* ;
    public final VslParser.terme_return terme() throws RecognitionException {
        VslParser.terme_return retval = new VslParser.terme_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token MUL45=null;
        Token DIV46=null;
        VslParser.facteur_return facteur44 =null;

        VslParser.facteur_return facteur47 =null;


        Object MUL45_tree=null;
        Object DIV46_tree=null;

        try {
            // /home/heyoen/workspace/VSL/bin/frontend/VslParser.g:50:16: ( facteur ( ( MUL ^| DIV ^) facteur )* )
            // /home/heyoen/workspace/VSL/bin/frontend/VslParser.g:50:18: facteur ( ( MUL ^| DIV ^) facteur )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_facteur_in_terme513);
            facteur44=facteur();

            state._fsp--;

            adaptor.addChild(root_0, facteur44.getTree());

            // /home/heyoen/workspace/VSL/bin/frontend/VslParser.g:50:26: ( ( MUL ^| DIV ^) facteur )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==DIV||LA11_0==MUL) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // /home/heyoen/workspace/VSL/bin/frontend/VslParser.g:50:27: ( MUL ^| DIV ^) facteur
            	    {
            	    // /home/heyoen/workspace/VSL/bin/frontend/VslParser.g:50:27: ( MUL ^| DIV ^)
            	    int alt10=2;
            	    int LA10_0 = input.LA(1);

            	    if ( (LA10_0==MUL) ) {
            	        alt10=1;
            	    }
            	    else if ( (LA10_0==DIV) ) {
            	        alt10=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 10, 0, input);

            	        throw nvae;

            	    }
            	    switch (alt10) {
            	        case 1 :
            	            // /home/heyoen/workspace/VSL/bin/frontend/VslParser.g:50:28: MUL ^
            	            {
            	            MUL45=(Token)match(input,MUL,FOLLOW_MUL_in_terme517); 
            	            MUL45_tree = 
            	            (Object)adaptor.create(MUL45)
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(MUL45_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // /home/heyoen/workspace/VSL/bin/frontend/VslParser.g:50:34: DIV ^
            	            {
            	            DIV46=(Token)match(input,DIV,FOLLOW_DIV_in_terme521); 
            	            DIV46_tree = 
            	            (Object)adaptor.create(DIV46)
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(DIV46_tree, root_0);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_facteur_in_terme525);
            	    facteur47=facteur();

            	    state._fsp--;

            	    adaptor.addChild(root_0, facteur47.getTree());

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "terme"


    public static class facteur_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "facteur"
    // /home/heyoen/workspace/VSL/bin/frontend/VslParser.g:52:1: facteur : ( IDENT | tableau_elem | appelFonction | INTEGER | PG ! expression PD !);
    public final VslParser.facteur_return facteur() throws RecognitionException {
        VslParser.facteur_return retval = new VslParser.facteur_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token IDENT48=null;
        Token INTEGER51=null;
        Token PG52=null;
        Token PD54=null;
        VslParser.tableau_elem_return tableau_elem49 =null;

        VslParser.appelFonction_return appelFonction50 =null;

        VslParser.expression_return expression53 =null;


        Object IDENT48_tree=null;
        Object INTEGER51_tree=null;
        Object PG52_tree=null;
        Object PD54_tree=null;

        try {
            // /home/heyoen/workspace/VSL/bin/frontend/VslParser.g:52:16: ( IDENT | tableau_elem | appelFonction | INTEGER | PG ! expression PD !)
            int alt12=5;
            switch ( input.LA(1) ) {
            case IDENT:
                {
                switch ( input.LA(2) ) {
                case CG:
                    {
                    alt12=2;
                    }
                    break;
                case PG:
                    {
                    alt12=3;
                    }
                    break;
                case EOF:
                case AD:
                case AG:
                case CD:
                case DIV:
                case DO_KW:
                case ELSE_KW:
                case FI_KW:
                case FUNC_KW:
                case IDENT:
                case IF_KW:
                case MOINS:
                case MUL:
                case OD_KW:
                case PD:
                case PLUS:
                case PRINT_KW:
                case PROTO_KW:
                case READ_KW:
                case RETURN_KW:
                case THEN_KW:
                case VIRG:
                case WHILE_KW:
                    {
                    alt12=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 1, input);

                    throw nvae;

                }

                }
                break;
            case INTEGER:
                {
                alt12=4;
                }
                break;
            case PG:
                {
                alt12=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;

            }

            switch (alt12) {
                case 1 :
                    // /home/heyoen/workspace/VSL/bin/frontend/VslParser.g:52:18: IDENT
                    {
                    root_0 = (Object)adaptor.nil();


                    IDENT48=(Token)match(input,IDENT,FOLLOW_IDENT_in_facteur542); 
                    IDENT48_tree = 
                    (Object)adaptor.create(IDENT48)
                    ;
                    adaptor.addChild(root_0, IDENT48_tree);


                    }
                    break;
                case 2 :
                    // /home/heyoen/workspace/VSL/bin/frontend/VslParser.g:52:26: tableau_elem
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_tableau_elem_in_facteur546);
                    tableau_elem49=tableau_elem();

                    state._fsp--;

                    adaptor.addChild(root_0, tableau_elem49.getTree());

                    }
                    break;
                case 3 :
                    // /home/heyoen/workspace/VSL/bin/frontend/VslParser.g:52:41: appelFonction
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_appelFonction_in_facteur550);
                    appelFonction50=appelFonction();

                    state._fsp--;

                    adaptor.addChild(root_0, appelFonction50.getTree());

                    }
                    break;
                case 4 :
                    // /home/heyoen/workspace/VSL/bin/frontend/VslParser.g:52:57: INTEGER
                    {
                    root_0 = (Object)adaptor.nil();


                    INTEGER51=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_facteur554); 
                    INTEGER51_tree = 
                    (Object)adaptor.create(INTEGER51)
                    ;
                    adaptor.addChild(root_0, INTEGER51_tree);


                    }
                    break;
                case 5 :
                    // /home/heyoen/workspace/VSL/bin/frontend/VslParser.g:52:67: PG ! expression PD !
                    {
                    root_0 = (Object)adaptor.nil();


                    PG52=(Token)match(input,PG,FOLLOW_PG_in_facteur558); 

                    pushFollow(FOLLOW_expression_in_facteur561);
                    expression53=expression();

                    state._fsp--;

                    adaptor.addChild(root_0, expression53.getTree());

                    PD54=(Token)match(input,PD,FOLLOW_PD_in_facteur563); 

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "facteur"


    public static class tableau_elem_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "tableau_elem"
    // /home/heyoen/workspace/VSL/bin/frontend/VslParser.g:54:1: tableau_elem : IDENT CG expression CD -> ^( TABLEAU_ELEMENT IDENT expression ) ;
    public final VslParser.tableau_elem_return tableau_elem() throws RecognitionException {
        VslParser.tableau_elem_return retval = new VslParser.tableau_elem_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token IDENT55=null;
        Token CG56=null;
        Token CD58=null;
        VslParser.expression_return expression57 =null;


        Object IDENT55_tree=null;
        Object CG56_tree=null;
        Object CD58_tree=null;
        RewriteRuleTokenStream stream_CD=new RewriteRuleTokenStream(adaptor,"token CD");
        RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
        RewriteRuleTokenStream stream_CG=new RewriteRuleTokenStream(adaptor,"token CG");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // /home/heyoen/workspace/VSL/bin/frontend/VslParser.g:54:16: ( IDENT CG expression CD -> ^( TABLEAU_ELEMENT IDENT expression ) )
            // /home/heyoen/workspace/VSL/bin/frontend/VslParser.g:54:18: IDENT CG expression CD
            {
            IDENT55=(Token)match(input,IDENT,FOLLOW_IDENT_in_tableau_elem574);  
            stream_IDENT.add(IDENT55);


            CG56=(Token)match(input,CG,FOLLOW_CG_in_tableau_elem576);  
            stream_CG.add(CG56);


            pushFollow(FOLLOW_expression_in_tableau_elem578);
            expression57=expression();

            state._fsp--;

            stream_expression.add(expression57.getTree());

            CD58=(Token)match(input,CD,FOLLOW_CD_in_tableau_elem580);  
            stream_CD.add(CD58);


            // AST REWRITE
            // elements: expression, IDENT
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 55:18: -> ^( TABLEAU_ELEMENT IDENT expression )
            {
                // /home/heyoen/workspace/VSL/bin/frontend/VslParser.g:55:21: ^( TABLEAU_ELEMENT IDENT expression )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(TABLEAU_ELEMENT, "TABLEAU_ELEMENT")
                , root_1);

                adaptor.addChild(root_1, 
                stream_IDENT.nextNode()
                );

                adaptor.addChild(root_1, stream_expression.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "tableau_elem"


    public static class retourne_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "retourne"
    // /home/heyoen/workspace/VSL/bin/frontend/VslParser.g:57:1: retourne : RETURN_KW ^ expression ;
    public final VslParser.retourne_return retourne() throws RecognitionException {
        VslParser.retourne_return retval = new VslParser.retourne_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token RETURN_KW59=null;
        VslParser.expression_return expression60 =null;


        Object RETURN_KW59_tree=null;

        try {
            // /home/heyoen/workspace/VSL/bin/frontend/VslParser.g:57:16: ( RETURN_KW ^ expression )
            // /home/heyoen/workspace/VSL/bin/frontend/VslParser.g:57:18: RETURN_KW ^ expression
            {
            root_0 = (Object)adaptor.nil();


            RETURN_KW59=(Token)match(input,RETURN_KW,FOLLOW_RETURN_KW_in_retourne638); 
            RETURN_KW59_tree = 
            (Object)adaptor.create(RETURN_KW59)
            ;
            root_0 = (Object)adaptor.becomeRoot(RETURN_KW59_tree, root_0);


            pushFollow(FOLLOW_expression_in_retourne641);
            expression60=expression();

            state._fsp--;

            adaptor.addChild(root_0, expression60.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "retourne"


    public static class impression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "impression"
    // /home/heyoen/workspace/VSL/bin/frontend/VslParser.g:59:1: impression : PRINT_KW ^ items_imp ;
    public final VslParser.impression_return impression() throws RecognitionException {
        VslParser.impression_return retval = new VslParser.impression_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token PRINT_KW61=null;
        VslParser.items_imp_return items_imp62 =null;


        Object PRINT_KW61_tree=null;

        try {
            // /home/heyoen/workspace/VSL/bin/frontend/VslParser.g:59:16: ( PRINT_KW ^ items_imp )
            // /home/heyoen/workspace/VSL/bin/frontend/VslParser.g:59:18: PRINT_KW ^ items_imp
            {
            root_0 = (Object)adaptor.nil();


            PRINT_KW61=(Token)match(input,PRINT_KW,FOLLOW_PRINT_KW_in_impression653); 
            PRINT_KW61_tree = 
            (Object)adaptor.create(PRINT_KW61)
            ;
            root_0 = (Object)adaptor.becomeRoot(PRINT_KW61_tree, root_0);


            pushFollow(FOLLOW_items_imp_in_impression656);
            items_imp62=items_imp();

            state._fsp--;

            adaptor.addChild(root_0, items_imp62.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "impression"


    public static class items_imp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "items_imp"
    // /home/heyoen/workspace/VSL/bin/frontend/VslParser.g:61:1: items_imp : item_imp ( VIRG ! item_imp )* ;
    public final VslParser.items_imp_return items_imp() throws RecognitionException {
        VslParser.items_imp_return retval = new VslParser.items_imp_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token VIRG64=null;
        VslParser.item_imp_return item_imp63 =null;

        VslParser.item_imp_return item_imp65 =null;


        Object VIRG64_tree=null;

        try {
            // /home/heyoen/workspace/VSL/bin/frontend/VslParser.g:61:16: ( item_imp ( VIRG ! item_imp )* )
            // /home/heyoen/workspace/VSL/bin/frontend/VslParser.g:61:18: item_imp ( VIRG ! item_imp )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_item_imp_in_items_imp669);
            item_imp63=item_imp();

            state._fsp--;

            adaptor.addChild(root_0, item_imp63.getTree());

            // /home/heyoen/workspace/VSL/bin/frontend/VslParser.g:61:27: ( VIRG ! item_imp )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==VIRG) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // /home/heyoen/workspace/VSL/bin/frontend/VslParser.g:61:28: VIRG ! item_imp
            	    {
            	    VIRG64=(Token)match(input,VIRG,FOLLOW_VIRG_in_items_imp672); 

            	    pushFollow(FOLLOW_item_imp_in_items_imp675);
            	    item_imp65=item_imp();

            	    state._fsp--;

            	    adaptor.addChild(root_0, item_imp65.getTree());

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "items_imp"


    public static class item_imp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "item_imp"
    // /home/heyoen/workspace/VSL/bin/frontend/VslParser.g:63:1: item_imp : ( TEXT | expression );
    public final VslParser.item_imp_return item_imp() throws RecognitionException {
        VslParser.item_imp_return retval = new VslParser.item_imp_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token TEXT66=null;
        VslParser.expression_return expression67 =null;


        Object TEXT66_tree=null;

        try {
            // /home/heyoen/workspace/VSL/bin/frontend/VslParser.g:63:16: ( TEXT | expression )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==TEXT) ) {
                alt14=1;
            }
            else if ( (LA14_0==IDENT||LA14_0==INTEGER||LA14_0==PG) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;

            }
            switch (alt14) {
                case 1 :
                    // /home/heyoen/workspace/VSL/bin/frontend/VslParser.g:63:18: TEXT
                    {
                    root_0 = (Object)adaptor.nil();


                    TEXT66=(Token)match(input,TEXT,FOLLOW_TEXT_in_item_imp691); 
                    TEXT66_tree = 
                    (Object)adaptor.create(TEXT66)
                    ;
                    adaptor.addChild(root_0, TEXT66_tree);


                    }
                    break;
                case 2 :
                    // /home/heyoen/workspace/VSL/bin/frontend/VslParser.g:63:25: expression
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_expression_in_item_imp695);
                    expression67=expression();

                    state._fsp--;

                    adaptor.addChild(root_0, expression67.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "item_imp"


    public static class lecture_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "lecture"
    // /home/heyoen/workspace/VSL/bin/frontend/VslParser.g:65:1: lecture : READ_KW ^ items_lec ;
    public final VslParser.lecture_return lecture() throws RecognitionException {
        VslParser.lecture_return retval = new VslParser.lecture_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token READ_KW68=null;
        VslParser.items_lec_return items_lec69 =null;


        Object READ_KW68_tree=null;

        try {
            // /home/heyoen/workspace/VSL/bin/frontend/VslParser.g:65:16: ( READ_KW ^ items_lec )
            // /home/heyoen/workspace/VSL/bin/frontend/VslParser.g:65:18: READ_KW ^ items_lec
            {
            root_0 = (Object)adaptor.nil();


            READ_KW68=(Token)match(input,READ_KW,FOLLOW_READ_KW_in_lecture710); 
            READ_KW68_tree = 
            (Object)adaptor.create(READ_KW68)
            ;
            root_0 = (Object)adaptor.becomeRoot(READ_KW68_tree, root_0);


            pushFollow(FOLLOW_items_lec_in_lecture713);
            items_lec69=items_lec();

            state._fsp--;

            adaptor.addChild(root_0, items_lec69.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "lecture"


    public static class items_lec_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "items_lec"
    // /home/heyoen/workspace/VSL/bin/frontend/VslParser.g:67:1: items_lec : item_lec ( VIRG ! item_lec )* ;
    public final VslParser.items_lec_return items_lec() throws RecognitionException {
        VslParser.items_lec_return retval = new VslParser.items_lec_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token VIRG71=null;
        VslParser.item_lec_return item_lec70 =null;

        VslParser.item_lec_return item_lec72 =null;


        Object VIRG71_tree=null;

        try {
            // /home/heyoen/workspace/VSL/bin/frontend/VslParser.g:67:16: ( item_lec ( VIRG ! item_lec )* )
            // /home/heyoen/workspace/VSL/bin/frontend/VslParser.g:67:18: item_lec ( VIRG ! item_lec )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_item_lec_in_items_lec726);
            item_lec70=item_lec();

            state._fsp--;

            adaptor.addChild(root_0, item_lec70.getTree());

            // /home/heyoen/workspace/VSL/bin/frontend/VslParser.g:67:27: ( VIRG ! item_lec )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==VIRG) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // /home/heyoen/workspace/VSL/bin/frontend/VslParser.g:67:28: VIRG ! item_lec
            	    {
            	    VIRG71=(Token)match(input,VIRG,FOLLOW_VIRG_in_items_lec729); 

            	    pushFollow(FOLLOW_item_lec_in_items_lec732);
            	    item_lec72=item_lec();

            	    state._fsp--;

            	    adaptor.addChild(root_0, item_lec72.getTree());

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "items_lec"


    public static class item_lec_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "item_lec"
    // /home/heyoen/workspace/VSL/bin/frontend/VslParser.g:69:1: item_lec : ( IDENT | tableau_elem );
    public final VslParser.item_lec_return item_lec() throws RecognitionException {
        VslParser.item_lec_return retval = new VslParser.item_lec_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token IDENT73=null;
        VslParser.tableau_elem_return tableau_elem74 =null;


        Object IDENT73_tree=null;

        try {
            // /home/heyoen/workspace/VSL/bin/frontend/VslParser.g:69:16: ( IDENT | tableau_elem )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==IDENT) ) {
                int LA16_1 = input.LA(2);

                if ( (LA16_1==CG) ) {
                    alt16=2;
                }
                else if ( (LA16_1==EOF||(LA16_1 >= AD && LA16_1 <= AG)||(LA16_1 >= ELSE_KW && LA16_1 <= IF_KW)||LA16_1==OD_KW||(LA16_1 >= PRINT_KW && LA16_1 <= RETURN_KW)||LA16_1==VIRG||LA16_1==WHILE_KW) ) {
                    alt16=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 16, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;

            }
            switch (alt16) {
                case 1 :
                    // /home/heyoen/workspace/VSL/bin/frontend/VslParser.g:69:18: IDENT
                    {
                    root_0 = (Object)adaptor.nil();


                    IDENT73=(Token)match(input,IDENT,FOLLOW_IDENT_in_item_lec748); 
                    IDENT73_tree = 
                    (Object)adaptor.create(IDENT73)
                    ;
                    adaptor.addChild(root_0, IDENT73_tree);


                    }
                    break;
                case 2 :
                    // /home/heyoen/workspace/VSL/bin/frontend/VslParser.g:69:26: tableau_elem
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_tableau_elem_in_item_lec752);
                    tableau_elem74=tableau_elem();

                    state._fsp--;

                    adaptor.addChild(root_0, tableau_elem74.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "item_lec"


    public static class conditionnelle_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "conditionnelle"
    // /home/heyoen/workspace/VSL/bin/frontend/VslParser.g:71:1: conditionnelle : IF_KW ^ expression THEN_KW ! instruction ( ELSE_KW ! instruction )? FI_KW !;
    public final VslParser.conditionnelle_return conditionnelle() throws RecognitionException {
        VslParser.conditionnelle_return retval = new VslParser.conditionnelle_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token IF_KW75=null;
        Token THEN_KW77=null;
        Token ELSE_KW79=null;
        Token FI_KW81=null;
        VslParser.expression_return expression76 =null;

        VslParser.instruction_return instruction78 =null;

        VslParser.instruction_return instruction80 =null;


        Object IF_KW75_tree=null;
        Object THEN_KW77_tree=null;
        Object ELSE_KW79_tree=null;
        Object FI_KW81_tree=null;

        try {
            // /home/heyoen/workspace/VSL/bin/frontend/VslParser.g:71:16: ( IF_KW ^ expression THEN_KW ! instruction ( ELSE_KW ! instruction )? FI_KW !)
            // /home/heyoen/workspace/VSL/bin/frontend/VslParser.g:71:18: IF_KW ^ expression THEN_KW ! instruction ( ELSE_KW ! instruction )? FI_KW !
            {
            root_0 = (Object)adaptor.nil();


            IF_KW75=(Token)match(input,IF_KW,FOLLOW_IF_KW_in_conditionnelle760); 
            IF_KW75_tree = 
            (Object)adaptor.create(IF_KW75)
            ;
            root_0 = (Object)adaptor.becomeRoot(IF_KW75_tree, root_0);


            pushFollow(FOLLOW_expression_in_conditionnelle763);
            expression76=expression();

            state._fsp--;

            adaptor.addChild(root_0, expression76.getTree());

            THEN_KW77=(Token)match(input,THEN_KW,FOLLOW_THEN_KW_in_conditionnelle765); 

            pushFollow(FOLLOW_instruction_in_conditionnelle768);
            instruction78=instruction();

            state._fsp--;

            adaptor.addChild(root_0, instruction78.getTree());

            // /home/heyoen/workspace/VSL/bin/frontend/VslParser.g:71:57: ( ELSE_KW ! instruction )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==ELSE_KW) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // /home/heyoen/workspace/VSL/bin/frontend/VslParser.g:71:58: ELSE_KW ! instruction
                    {
                    ELSE_KW79=(Token)match(input,ELSE_KW,FOLLOW_ELSE_KW_in_conditionnelle771); 

                    pushFollow(FOLLOW_instruction_in_conditionnelle774);
                    instruction80=instruction();

                    state._fsp--;

                    adaptor.addChild(root_0, instruction80.getTree());

                    }
                    break;

            }


            FI_KW81=(Token)match(input,FI_KW,FOLLOW_FI_KW_in_conditionnelle778); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "conditionnelle"


    public static class appelFonction_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "appelFonction"
    // /home/heyoen/workspace/VSL/bin/frontend/VslParser.g:73:1: appelFonction : IDENT PG ( arguments )? PD -> ^( APPEL_FONCTION IDENT ( arguments )? ) ;
    public final VslParser.appelFonction_return appelFonction() throws RecognitionException {
        VslParser.appelFonction_return retval = new VslParser.appelFonction_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token IDENT82=null;
        Token PG83=null;
        Token PD85=null;
        VslParser.arguments_return arguments84 =null;


        Object IDENT82_tree=null;
        Object PG83_tree=null;
        Object PD85_tree=null;
        RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
        RewriteRuleTokenStream stream_PD=new RewriteRuleTokenStream(adaptor,"token PD");
        RewriteRuleTokenStream stream_PG=new RewriteRuleTokenStream(adaptor,"token PG");
        RewriteRuleSubtreeStream stream_arguments=new RewriteRuleSubtreeStream(adaptor,"rule arguments");
        try {
            // /home/heyoen/workspace/VSL/bin/frontend/VslParser.g:73:16: ( IDENT PG ( arguments )? PD -> ^( APPEL_FONCTION IDENT ( arguments )? ) )
            // /home/heyoen/workspace/VSL/bin/frontend/VslParser.g:73:18: IDENT PG ( arguments )? PD
            {
            IDENT82=(Token)match(input,IDENT,FOLLOW_IDENT_in_appelFonction788);  
            stream_IDENT.add(IDENT82);


            PG83=(Token)match(input,PG,FOLLOW_PG_in_appelFonction790);  
            stream_PG.add(PG83);


            // /home/heyoen/workspace/VSL/bin/frontend/VslParser.g:73:27: ( arguments )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==IDENT||LA18_0==INTEGER||LA18_0==PG) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // /home/heyoen/workspace/VSL/bin/frontend/VslParser.g:73:27: arguments
                    {
                    pushFollow(FOLLOW_arguments_in_appelFonction792);
                    arguments84=arguments();

                    state._fsp--;

                    stream_arguments.add(arguments84.getTree());

                    }
                    break;

            }


            PD85=(Token)match(input,PD,FOLLOW_PD_in_appelFonction795);  
            stream_PD.add(PD85);


            // AST REWRITE
            // elements: arguments, IDENT
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 74:18: -> ^( APPEL_FONCTION IDENT ( arguments )? )
            {
                // /home/heyoen/workspace/VSL/bin/frontend/VslParser.g:74:21: ^( APPEL_FONCTION IDENT ( arguments )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(APPEL_FONCTION, "APPEL_FONCTION")
                , root_1);

                adaptor.addChild(root_1, 
                stream_IDENT.nextNode()
                );

                // /home/heyoen/workspace/VSL/bin/frontend/VslParser.g:74:44: ( arguments )?
                if ( stream_arguments.hasNext() ) {
                    adaptor.addChild(root_1, stream_arguments.nextTree());

                }
                stream_arguments.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "appelFonction"


    public static class arguments_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "arguments"
    // /home/heyoen/workspace/VSL/bin/frontend/VslParser.g:76:1: arguments : expression ( VIRG ! expression )* ;
    public final VslParser.arguments_return arguments() throws RecognitionException {
        VslParser.arguments_return retval = new VslParser.arguments_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token VIRG87=null;
        VslParser.expression_return expression86 =null;

        VslParser.expression_return expression88 =null;


        Object VIRG87_tree=null;

        try {
            // /home/heyoen/workspace/VSL/bin/frontend/VslParser.g:76:16: ( expression ( VIRG ! expression )* )
            // /home/heyoen/workspace/VSL/bin/frontend/VslParser.g:76:18: expression ( VIRG ! expression )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_expression_in_arguments836);
            expression86=expression();

            state._fsp--;

            adaptor.addChild(root_0, expression86.getTree());

            // /home/heyoen/workspace/VSL/bin/frontend/VslParser.g:76:29: ( VIRG ! expression )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==VIRG) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // /home/heyoen/workspace/VSL/bin/frontend/VslParser.g:76:30: VIRG ! expression
            	    {
            	    VIRG87=(Token)match(input,VIRG,FOLLOW_VIRG_in_arguments839); 

            	    pushFollow(FOLLOW_expression_in_arguments842);
            	    expression88=expression();

            	    state._fsp--;

            	    adaptor.addChild(root_0, expression88.getTree());

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "arguments"


    public static class iteration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "iteration"
    // /home/heyoen/workspace/VSL/bin/frontend/VslParser.g:78:1: iteration : WHILE_KW ^ expression DO_KW ! instruction OD_KW !;
    public final VslParser.iteration_return iteration() throws RecognitionException {
        VslParser.iteration_return retval = new VslParser.iteration_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token WHILE_KW89=null;
        Token DO_KW91=null;
        Token OD_KW93=null;
        VslParser.expression_return expression90 =null;

        VslParser.instruction_return instruction92 =null;


        Object WHILE_KW89_tree=null;
        Object DO_KW91_tree=null;
        Object OD_KW93_tree=null;

        try {
            // /home/heyoen/workspace/VSL/bin/frontend/VslParser.g:78:16: ( WHILE_KW ^ expression DO_KW ! instruction OD_KW !)
            // /home/heyoen/workspace/VSL/bin/frontend/VslParser.g:78:18: WHILE_KW ^ expression DO_KW ! instruction OD_KW !
            {
            root_0 = (Object)adaptor.nil();


            WHILE_KW89=(Token)match(input,WHILE_KW,FOLLOW_WHILE_KW_in_iteration857); 
            WHILE_KW89_tree = 
            (Object)adaptor.create(WHILE_KW89)
            ;
            root_0 = (Object)adaptor.becomeRoot(WHILE_KW89_tree, root_0);


            pushFollow(FOLLOW_expression_in_iteration860);
            expression90=expression();

            state._fsp--;

            adaptor.addChild(root_0, expression90.getTree());

            DO_KW91=(Token)match(input,DO_KW,FOLLOW_DO_KW_in_iteration862); 

            pushFollow(FOLLOW_instruction_in_iteration865);
            instruction92=instruction();

            state._fsp--;

            adaptor.addChild(root_0, instruction92.getTree());

            OD_KW93=(Token)match(input,OD_KW,FOLLOW_OD_KW_in_iteration867); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "iteration"


    public static class bloc_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "bloc"
    // /home/heyoen/workspace/VSL/bin/frontend/VslParser.g:80:1: bloc : ( AG declarations instructions AD -> ^( BLOC declarations instructions ) | AG declarations AD -> ^( BLOC declarations ) | AG instructions AD -> ^( BLOC instructions ) );
    public final VslParser.bloc_return bloc() throws RecognitionException {
        VslParser.bloc_return retval = new VslParser.bloc_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token AG94=null;
        Token AD97=null;
        Token AG98=null;
        Token AD100=null;
        Token AG101=null;
        Token AD103=null;
        VslParser.declarations_return declarations95 =null;

        VslParser.instructions_return instructions96 =null;

        VslParser.declarations_return declarations99 =null;

        VslParser.instructions_return instructions102 =null;


        Object AG94_tree=null;
        Object AD97_tree=null;
        Object AG98_tree=null;
        Object AD100_tree=null;
        Object AG101_tree=null;
        Object AD103_tree=null;
        RewriteRuleTokenStream stream_AD=new RewriteRuleTokenStream(adaptor,"token AD");
        RewriteRuleTokenStream stream_AG=new RewriteRuleTokenStream(adaptor,"token AG");
        RewriteRuleSubtreeStream stream_instructions=new RewriteRuleSubtreeStream(adaptor,"rule instructions");
        RewriteRuleSubtreeStream stream_declarations=new RewriteRuleSubtreeStream(adaptor,"rule declarations");
        try {
            // /home/heyoen/workspace/VSL/bin/frontend/VslParser.g:80:16: ( AG declarations instructions AD -> ^( BLOC declarations instructions ) | AG declarations AD -> ^( BLOC declarations ) | AG instructions AD -> ^( BLOC instructions ) )
            int alt20=3;
            alt20 = dfa20.predict(input);
            switch (alt20) {
                case 1 :
                    // /home/heyoen/workspace/VSL/bin/frontend/VslParser.g:80:18: AG declarations instructions AD
                    {
                    AG94=(Token)match(input,AG,FOLLOW_AG_in_bloc886);  
                    stream_AG.add(AG94);


                    pushFollow(FOLLOW_declarations_in_bloc888);
                    declarations95=declarations();

                    state._fsp--;

                    stream_declarations.add(declarations95.getTree());

                    pushFollow(FOLLOW_instructions_in_bloc890);
                    instructions96=instructions();

                    state._fsp--;

                    stream_instructions.add(instructions96.getTree());

                    AD97=(Token)match(input,AD,FOLLOW_AD_in_bloc892);  
                    stream_AD.add(AD97);


                    // AST REWRITE
                    // elements: instructions, declarations
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 81:18: -> ^( BLOC declarations instructions )
                    {
                        // /home/heyoen/workspace/VSL/bin/frontend/VslParser.g:81:21: ^( BLOC declarations instructions )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(BLOC, "BLOC")
                        , root_1);

                        adaptor.addChild(root_1, stream_declarations.nextTree());

                        adaptor.addChild(root_1, stream_instructions.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // /home/heyoen/workspace/VSL/bin/frontend/VslParser.g:82:20: AG declarations AD
                    {
                    AG98=(Token)match(input,AG,FOLLOW_AG_in_bloc940);  
                    stream_AG.add(AG98);


                    pushFollow(FOLLOW_declarations_in_bloc942);
                    declarations99=declarations();

                    state._fsp--;

                    stream_declarations.add(declarations99.getTree());

                    AD100=(Token)match(input,AD,FOLLOW_AD_in_bloc944);  
                    stream_AD.add(AD100);


                    // AST REWRITE
                    // elements: declarations
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 83:18: -> ^( BLOC declarations )
                    {
                        // /home/heyoen/workspace/VSL/bin/frontend/VslParser.g:83:21: ^( BLOC declarations )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(BLOC, "BLOC")
                        , root_1);

                        adaptor.addChild(root_1, stream_declarations.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 3 :
                    // /home/heyoen/workspace/VSL/bin/frontend/VslParser.g:84:20: AG instructions AD
                    {
                    AG101=(Token)match(input,AG,FOLLOW_AG_in_bloc990);  
                    stream_AG.add(AG101);


                    pushFollow(FOLLOW_instructions_in_bloc992);
                    instructions102=instructions();

                    state._fsp--;

                    stream_instructions.add(instructions102.getTree());

                    AD103=(Token)match(input,AD,FOLLOW_AD_in_bloc994);  
                    stream_AD.add(AD103);


                    // AST REWRITE
                    // elements: instructions
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 85:18: -> ^( BLOC instructions )
                    {
                        // /home/heyoen/workspace/VSL/bin/frontend/VslParser.g:85:21: ^( BLOC instructions )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(BLOC, "BLOC")
                        , root_1);

                        adaptor.addChild(root_1, stream_instructions.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "bloc"


    public static class instructions_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "instructions"
    // /home/heyoen/workspace/VSL/bin/frontend/VslParser.g:87:1: instructions : ( instruction )+ -> ^( INSTRUCTION ( instruction )+ ) ;
    public final VslParser.instructions_return instructions() throws RecognitionException {
        VslParser.instructions_return retval = new VslParser.instructions_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        VslParser.instruction_return instruction104 =null;


        RewriteRuleSubtreeStream stream_instruction=new RewriteRuleSubtreeStream(adaptor,"rule instruction");
        try {
            // /home/heyoen/workspace/VSL/bin/frontend/VslParser.g:87:16: ( ( instruction )+ -> ^( INSTRUCTION ( instruction )+ ) )
            // /home/heyoen/workspace/VSL/bin/frontend/VslParser.g:87:18: ( instruction )+
            {
            // /home/heyoen/workspace/VSL/bin/frontend/VslParser.g:87:18: ( instruction )+
            int cnt21=0;
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==AG||(LA21_0 >= IDENT && LA21_0 <= IF_KW)||LA21_0==PRINT_KW||(LA21_0 >= READ_KW && LA21_0 <= RETURN_KW)||LA21_0==WHILE_KW) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // /home/heyoen/workspace/VSL/bin/frontend/VslParser.g:87:18: instruction
            	    {
            	    pushFollow(FOLLOW_instruction_in_instructions1046);
            	    instruction104=instruction();

            	    state._fsp--;

            	    stream_instruction.add(instruction104.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt21 >= 1 ) break loop21;
                        EarlyExitException eee =
                            new EarlyExitException(21, input);
                        throw eee;
                }
                cnt21++;
            } while (true);


            // AST REWRITE
            // elements: instruction
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 88:18: -> ^( INSTRUCTION ( instruction )+ )
            {
                // /home/heyoen/workspace/VSL/bin/frontend/VslParser.g:88:21: ^( INSTRUCTION ( instruction )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(INSTRUCTION, "INSTRUCTION")
                , root_1);

                if ( !(stream_instruction.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_instruction.hasNext() ) {
                    adaptor.addChild(root_1, stream_instruction.nextTree());

                }
                stream_instruction.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "instructions"


    public static class declarations_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "declarations"
    // /home/heyoen/workspace/VSL/bin/frontend/VslParser.g:90:1: declarations : ( INT_KW declaration )+ -> ^( DECLARATION ( declaration )+ ) ;
    public final VslParser.declarations_return declarations() throws RecognitionException {
        VslParser.declarations_return retval = new VslParser.declarations_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token INT_KW105=null;
        VslParser.declaration_return declaration106 =null;


        Object INT_KW105_tree=null;
        RewriteRuleTokenStream stream_INT_KW=new RewriteRuleTokenStream(adaptor,"token INT_KW");
        RewriteRuleSubtreeStream stream_declaration=new RewriteRuleSubtreeStream(adaptor,"rule declaration");
        try {
            // /home/heyoen/workspace/VSL/bin/frontend/VslParser.g:90:16: ( ( INT_KW declaration )+ -> ^( DECLARATION ( declaration )+ ) )
            // /home/heyoen/workspace/VSL/bin/frontend/VslParser.g:90:18: ( INT_KW declaration )+
            {
            // /home/heyoen/workspace/VSL/bin/frontend/VslParser.g:90:18: ( INT_KW declaration )+
            int cnt22=0;
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==INT_KW) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // /home/heyoen/workspace/VSL/bin/frontend/VslParser.g:90:19: INT_KW declaration
            	    {
            	    INT_KW105=(Token)match(input,INT_KW,FOLLOW_INT_KW_in_declarations1101);  
            	    stream_INT_KW.add(INT_KW105);


            	    pushFollow(FOLLOW_declaration_in_declarations1103);
            	    declaration106=declaration();

            	    state._fsp--;

            	    stream_declaration.add(declaration106.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt22 >= 1 ) break loop22;
                        EarlyExitException eee =
                            new EarlyExitException(22, input);
                        throw eee;
                }
                cnt22++;
            } while (true);


            // AST REWRITE
            // elements: declaration
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 91:18: -> ^( DECLARATION ( declaration )+ )
            {
                // /home/heyoen/workspace/VSL/bin/frontend/VslParser.g:91:21: ^( DECLARATION ( declaration )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(DECLARATION, "DECLARATION")
                , root_1);

                if ( !(stream_declaration.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_declaration.hasNext() ) {
                    adaptor.addChild(root_1, stream_declaration.nextTree());

                }
                stream_declaration.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "declarations"


    public static class declaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "declaration"
    // /home/heyoen/workspace/VSL/bin/frontend/VslParser.g:93:1: declaration : item_dec ( VIRG ! item_dec )* ;
    public final VslParser.declaration_return declaration() throws RecognitionException {
        VslParser.declaration_return retval = new VslParser.declaration_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token VIRG108=null;
        VslParser.item_dec_return item_dec107 =null;

        VslParser.item_dec_return item_dec109 =null;


        Object VIRG108_tree=null;

        try {
            // /home/heyoen/workspace/VSL/bin/frontend/VslParser.g:93:16: ( item_dec ( VIRG ! item_dec )* )
            // /home/heyoen/workspace/VSL/bin/frontend/VslParser.g:93:18: item_dec ( VIRG ! item_dec )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_item_dec_in_declaration1143);
            item_dec107=item_dec();

            state._fsp--;

            adaptor.addChild(root_0, item_dec107.getTree());

            // /home/heyoen/workspace/VSL/bin/frontend/VslParser.g:93:27: ( VIRG ! item_dec )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==VIRG) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // /home/heyoen/workspace/VSL/bin/frontend/VslParser.g:93:28: VIRG ! item_dec
            	    {
            	    VIRG108=(Token)match(input,VIRG,FOLLOW_VIRG_in_declaration1146); 

            	    pushFollow(FOLLOW_item_dec_in_declaration1149);
            	    item_dec109=item_dec();

            	    state._fsp--;

            	    adaptor.addChild(root_0, item_dec109.getTree());

            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "declaration"


    public static class item_dec_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "item_dec"
    // /home/heyoen/workspace/VSL/bin/frontend/VslParser.g:95:1: item_dec : ( IDENT | tableau_dec );
    public final VslParser.item_dec_return item_dec() throws RecognitionException {
        VslParser.item_dec_return retval = new VslParser.item_dec_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token IDENT110=null;
        VslParser.tableau_dec_return tableau_dec111 =null;


        Object IDENT110_tree=null;

        try {
            // /home/heyoen/workspace/VSL/bin/frontend/VslParser.g:95:16: ( IDENT | tableau_dec )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==IDENT) ) {
                int LA24_1 = input.LA(2);

                if ( (LA24_1==CG) ) {
                    alt24=2;
                }
                else if ( ((LA24_1 >= AD && LA24_1 <= AG)||(LA24_1 >= IDENT && LA24_1 <= IF_KW)||LA24_1==INT_KW||LA24_1==PRINT_KW||(LA24_1 >= READ_KW && LA24_1 <= RETURN_KW)||LA24_1==VIRG||LA24_1==WHILE_KW) ) {
                    alt24=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 24, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;

            }
            switch (alt24) {
                case 1 :
                    // /home/heyoen/workspace/VSL/bin/frontend/VslParser.g:95:18: IDENT
                    {
                    root_0 = (Object)adaptor.nil();


                    IDENT110=(Token)match(input,IDENT,FOLLOW_IDENT_in_item_dec1165); 
                    IDENT110_tree = 
                    (Object)adaptor.create(IDENT110)
                    ;
                    adaptor.addChild(root_0, IDENT110_tree);


                    }
                    break;
                case 2 :
                    // /home/heyoen/workspace/VSL/bin/frontend/VslParser.g:95:26: tableau_dec
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_tableau_dec_in_item_dec1169);
                    tableau_dec111=tableau_dec();

                    state._fsp--;

                    adaptor.addChild(root_0, tableau_dec111.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "item_dec"


    public static class tableau_dec_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "tableau_dec"
    // /home/heyoen/workspace/VSL/bin/frontend/VslParser.g:97:1: tableau_dec : IDENT CG INTEGER CD -> ^( TABLEAU_DECLARATION IDENT INTEGER ) ;
    public final VslParser.tableau_dec_return tableau_dec() throws RecognitionException {
        VslParser.tableau_dec_return retval = new VslParser.tableau_dec_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token IDENT112=null;
        Token CG113=null;
        Token INTEGER114=null;
        Token CD115=null;

        Object IDENT112_tree=null;
        Object CG113_tree=null;
        Object INTEGER114_tree=null;
        Object CD115_tree=null;
        RewriteRuleTokenStream stream_CD=new RewriteRuleTokenStream(adaptor,"token CD");
        RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
        RewriteRuleTokenStream stream_CG=new RewriteRuleTokenStream(adaptor,"token CG");
        RewriteRuleTokenStream stream_INTEGER=new RewriteRuleTokenStream(adaptor,"token INTEGER");

        try {
            // /home/heyoen/workspace/VSL/bin/frontend/VslParser.g:97:16: ( IDENT CG INTEGER CD -> ^( TABLEAU_DECLARATION IDENT INTEGER ) )
            // /home/heyoen/workspace/VSL/bin/frontend/VslParser.g:97:18: IDENT CG INTEGER CD
            {
            IDENT112=(Token)match(input,IDENT,FOLLOW_IDENT_in_tableau_dec1180);  
            stream_IDENT.add(IDENT112);


            CG113=(Token)match(input,CG,FOLLOW_CG_in_tableau_dec1182);  
            stream_CG.add(CG113);


            INTEGER114=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_tableau_dec1184);  
            stream_INTEGER.add(INTEGER114);


            CD115=(Token)match(input,CD,FOLLOW_CD_in_tableau_dec1186);  
            stream_CD.add(CD115);


            // AST REWRITE
            // elements: INTEGER, IDENT
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 98:18: -> ^( TABLEAU_DECLARATION IDENT INTEGER )
            {
                // /home/heyoen/workspace/VSL/bin/frontend/VslParser.g:98:21: ^( TABLEAU_DECLARATION IDENT INTEGER )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(TABLEAU_DECLARATION, "TABLEAU_DECLARATION")
                , root_1);

                adaptor.addChild(root_1, 
                stream_IDENT.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_INTEGER.nextNode()
                );

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "tableau_dec"

    // Delegated rules


    protected DFA20 dfa20 = new DFA20(this);
    static final String DFA20_eotS =
        "\17\uffff";
    static final String DFA20_eofS =
        "\17\uffff";
    static final String DFA20_minS =
        "\2\5\1\21\1\uffff\1\4\1\23\1\21\2\uffff\1\10\2\4\1\23\1\10\1\4";
    static final String DFA20_maxS =
        "\1\5\1\44\1\21\1\uffff\1\44\1\23\1\21\2\uffff\1\10\2\44\1\23\1\10"+
        "\1\44";
    static final String DFA20_acceptS =
        "\3\uffff\1\3\3\uffff\1\1\1\2\6\uffff";
    static final String DFA20_specialS =
        "\17\uffff}>";
    static final String[] DFA20_transitionS = {
            "\1\1",
            "\1\3\13\uffff\2\3\1\uffff\1\2\7\uffff\1\3\1\uffff\2\3\4\uffff"+
            "\1\3",
            "\1\4",
            "",
            "\1\10\1\7\3\uffff\1\5\7\uffff\2\7\1\uffff\1\2\7\uffff\1\7\1"+
            "\uffff\2\7\2\uffff\1\6\1\uffff\1\7",
            "\1\11",
            "\1\12",
            "",
            "",
            "\1\13",
            "\1\10\1\7\3\uffff\1\14\7\uffff\2\7\1\uffff\1\2\7\uffff\1\7"+
            "\1\uffff\2\7\2\uffff\1\6\1\uffff\1\7",
            "\1\10\1\7\13\uffff\2\7\1\uffff\1\2\7\uffff\1\7\1\uffff\2\7"+
            "\2\uffff\1\6\1\uffff\1\7",
            "\1\15",
            "\1\16",
            "\1\10\1\7\13\uffff\2\7\1\uffff\1\2\7\uffff\1\7\1\uffff\2\7"+
            "\2\uffff\1\6\1\uffff\1\7"
    };

    static final short[] DFA20_eot = DFA.unpackEncodedString(DFA20_eotS);
    static final short[] DFA20_eof = DFA.unpackEncodedString(DFA20_eofS);
    static final char[] DFA20_min = DFA.unpackEncodedStringToUnsignedChars(DFA20_minS);
    static final char[] DFA20_max = DFA.unpackEncodedStringToUnsignedChars(DFA20_maxS);
    static final short[] DFA20_accept = DFA.unpackEncodedString(DFA20_acceptS);
    static final short[] DFA20_special = DFA.unpackEncodedString(DFA20_specialS);
    static final short[][] DFA20_transition;

    static {
        int numStates = DFA20_transitionS.length;
        DFA20_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA20_transition[i] = DFA.unpackEncodedString(DFA20_transitionS[i]);
        }
    }

    class DFA20 extends DFA {

        public DFA20(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 20;
            this.eot = DFA20_eot;
            this.eof = DFA20_eof;
            this.min = DFA20_min;
            this.max = DFA20_max;
            this.accept = DFA20_accept;
            this.special = DFA20_special;
            this.transition = DFA20_transition;
        }
        public String getDescription() {
            return "80:1: bloc : ( AG declarations instructions AD -> ^( BLOC declarations instructions ) | AG declarations AD -> ^( BLOC declarations ) | AG instructions AD -> ^( BLOC instructions ) );";
        }
    }
 

    public static final BitSet FOLLOW_unite_in_program120 = new BitSet(new long[]{0x0000000020010002L});
    public static final BitSet FOLLOW_fonction_in_unite165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_prototype_in_unite169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNC_KW_in_fonction183 = new BitSet(new long[]{0x0000000800100000L});
    public static final BitSet FOLLOW_type_in_fonction185 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_IDENT_in_fonction187 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_PG_in_fonction189 = new BitSet(new long[]{0x0000000002020000L});
    public static final BitSet FOLLOW_parametres_in_fonction191 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_PD_in_fonction193 = new BitSet(new long[]{0x00000010D0060020L});
    public static final BitSet FOLLOW_instruction_in_fonction195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PROTO_KW_in_prototype243 = new BitSet(new long[]{0x0000000800100000L});
    public static final BitSet FOLLOW_type_in_prototype246 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_IDENT_in_prototype248 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_PG_in_prototype250 = new BitSet(new long[]{0x0000000002020000L});
    public static final BitSet FOLLOW_parametres_in_prototype253 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_PD_in_prototype255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_KW_in_type275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VOID_KW_in_type280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parametre_in_parametres293 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_VIRG_in_parametres296 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_parametre_in_parametres298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_parametre345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_parametre349 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_CG_in_parametre351 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_CD_in_parametre353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_affectation_in_instruction390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_retourne_in_instruction394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_impression_in_instruction398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lecture_in_instruction402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionnelle_in_instruction406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_appelFonction_in_instruction410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iteration_in_instruction414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bloc_in_instruction418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_affectation429 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ASSIGN_KW_in_affectation431 = new BitSet(new long[]{0x00000000040A0000L});
    public static final BitSet FOLLOW_expression_in_affectation434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tableau_elem_in_affectation438 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ASSIGN_KW_in_affectation440 = new BitSet(new long[]{0x00000000040A0000L});
    public static final BitSet FOLLOW_expression_in_affectation442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_terme_in_expression482 = new BitSet(new long[]{0x0000000008400002L});
    public static final BitSet FOLLOW_PLUS_in_expression486 = new BitSet(new long[]{0x00000000040A0000L});
    public static final BitSet FOLLOW_MOINS_in_expression490 = new BitSet(new long[]{0x00000000040A0000L});
    public static final BitSet FOLLOW_terme_in_expression494 = new BitSet(new long[]{0x0000000008400002L});
    public static final BitSet FOLLOW_facteur_in_terme513 = new BitSet(new long[]{0x0000000000801002L});
    public static final BitSet FOLLOW_MUL_in_terme517 = new BitSet(new long[]{0x00000000040A0000L});
    public static final BitSet FOLLOW_DIV_in_terme521 = new BitSet(new long[]{0x00000000040A0000L});
    public static final BitSet FOLLOW_facteur_in_terme525 = new BitSet(new long[]{0x0000000000801002L});
    public static final BitSet FOLLOW_IDENT_in_facteur542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tableau_elem_in_facteur546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_appelFonction_in_facteur550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTEGER_in_facteur554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PG_in_facteur558 = new BitSet(new long[]{0x00000000040A0000L});
    public static final BitSet FOLLOW_expression_in_facteur561 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_PD_in_facteur563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_tableau_elem574 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_CG_in_tableau_elem576 = new BitSet(new long[]{0x00000000040A0000L});
    public static final BitSet FOLLOW_expression_in_tableau_elem578 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_CD_in_tableau_elem580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RETURN_KW_in_retourne638 = new BitSet(new long[]{0x00000000040A0000L});
    public static final BitSet FOLLOW_expression_in_retourne641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PRINT_KW_in_impression653 = new BitSet(new long[]{0x00000001040A0000L});
    public static final BitSet FOLLOW_items_imp_in_impression656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_item_imp_in_items_imp669 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_VIRG_in_items_imp672 = new BitSet(new long[]{0x00000001040A0000L});
    public static final BitSet FOLLOW_item_imp_in_items_imp675 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_TEXT_in_item_imp691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_item_imp695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_READ_KW_in_lecture710 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_items_lec_in_lecture713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_item_lec_in_items_lec726 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_VIRG_in_items_lec729 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_item_lec_in_items_lec732 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_IDENT_in_item_lec748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tableau_elem_in_item_lec752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_KW_in_conditionnelle760 = new BitSet(new long[]{0x00000000040A0000L});
    public static final BitSet FOLLOW_expression_in_conditionnelle763 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_THEN_KW_in_conditionnelle765 = new BitSet(new long[]{0x00000010D0060020L});
    public static final BitSet FOLLOW_instruction_in_conditionnelle768 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_ELSE_KW_in_conditionnelle771 = new BitSet(new long[]{0x00000010D0060020L});
    public static final BitSet FOLLOW_instruction_in_conditionnelle774 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_FI_KW_in_conditionnelle778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_appelFonction788 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_PG_in_appelFonction790 = new BitSet(new long[]{0x00000000060A0000L});
    public static final BitSet FOLLOW_arguments_in_appelFonction792 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_PD_in_appelFonction795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_arguments836 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_VIRG_in_arguments839 = new BitSet(new long[]{0x00000000040A0000L});
    public static final BitSet FOLLOW_expression_in_arguments842 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_WHILE_KW_in_iteration857 = new BitSet(new long[]{0x00000000040A0000L});
    public static final BitSet FOLLOW_expression_in_iteration860 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_DO_KW_in_iteration862 = new BitSet(new long[]{0x00000010D0060020L});
    public static final BitSet FOLLOW_instruction_in_iteration865 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_OD_KW_in_iteration867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AG_in_bloc886 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_declarations_in_bloc888 = new BitSet(new long[]{0x00000010D0060020L});
    public static final BitSet FOLLOW_instructions_in_bloc890 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_AD_in_bloc892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AG_in_bloc940 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_declarations_in_bloc942 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_AD_in_bloc944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AG_in_bloc990 = new BitSet(new long[]{0x00000010D0060020L});
    public static final BitSet FOLLOW_instructions_in_bloc992 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_AD_in_bloc994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instruction_in_instructions1046 = new BitSet(new long[]{0x00000010D0060022L});
    public static final BitSet FOLLOW_INT_KW_in_declarations1101 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_declaration_in_declarations1103 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_item_dec_in_declaration1143 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_VIRG_in_declaration1146 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_item_dec_in_declaration1149 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_IDENT_in_item_dec1165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tableau_dec_in_item_dec1169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_tableau_dec1180 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_CG_in_tableau_dec1182 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_INTEGER_in_tableau_dec1184 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_CD_in_tableau_dec1186 = new BitSet(new long[]{0x0000000000000002L});

}