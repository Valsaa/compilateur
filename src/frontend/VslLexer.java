// $ANTLR 3.4 /home/heyoen/workspace/VSL/bin/frontend/VslLexer.g 2016-02-26 10:34:11
package frontend;

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class VslLexer extends Lexer {
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

    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public VslLexer() {} 
    public VslLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public VslLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "/home/heyoen/workspace/VSL/bin/frontend/VslLexer.g"; }

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/heyoen/workspace/VSL/bin/frontend/VslLexer.g:14:17: ( ( ' ' | '\\n' | '\\t' | '\\r' ) )
            // /home/heyoen/workspace/VSL/bin/frontend/VslLexer.g:14:20: ( ' ' | '\\n' | '\\t' | '\\r' )
            {
            if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            skip();

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/heyoen/workspace/VSL/bin/frontend/VslLexer.g:19:11: ( '//' (~ '\\n' )* )
            // /home/heyoen/workspace/VSL/bin/frontend/VslLexer.g:19:13: '//' (~ '\\n' )*
            {
            match("//"); 



            // /home/heyoen/workspace/VSL/bin/frontend/VslLexer.g:19:17: (~ '\\n' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= '\u0000' && LA1_0 <= '\t')||(LA1_0 >= '\u000B' && LA1_0 <= '\uFFFF')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /home/heyoen/workspace/VSL/bin/frontend/VslLexer.g:
            	    {
            	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\uFFFF') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            skip();

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COMMENT"

    // $ANTLR start "LETTER"
    public final void mLETTER() throws RecognitionException {
        try {
            // /home/heyoen/workspace/VSL/bin/frontend/VslLexer.g:24:11: ( 'a' .. 'z' )
            // /home/heyoen/workspace/VSL/bin/frontend/VslLexer.g:
            {
            if ( (input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LETTER"

    // $ANTLR start "DIGIT"
    public final void mDIGIT() throws RecognitionException {
        try {
            // /home/heyoen/workspace/VSL/bin/frontend/VslLexer.g:27:9: ( '0' .. '9' )
            // /home/heyoen/workspace/VSL/bin/frontend/VslLexer.g:
            {
            if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DIGIT"

    // $ANTLR start "ASCII"
    public final void mASCII() throws RecognitionException {
        try {
            // /home/heyoen/workspace/VSL/bin/frontend/VslLexer.g:30:9: (~ ( '\\\"' ) )
            // /home/heyoen/workspace/VSL/bin/frontend/VslLexer.g:
            {
            if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '\uFFFF') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ASCII"

    // $ANTLR start "IDENT"
    public final void mIDENT() throws RecognitionException {
        try {
            int _type = IDENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/heyoen/workspace/VSL/bin/frontend/VslLexer.g:32:9: ( LETTER ( LETTER | DIGIT )* )
            // /home/heyoen/workspace/VSL/bin/frontend/VslLexer.g:32:11: LETTER ( LETTER | DIGIT )*
            {
            mLETTER(); 


            // /home/heyoen/workspace/VSL/bin/frontend/VslLexer.g:32:17: ( LETTER | DIGIT )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0 >= '0' && LA2_0 <= '9')||(LA2_0 >= 'a' && LA2_0 <= 'z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /home/heyoen/workspace/VSL/bin/frontend/VslLexer.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "IDENT"

    // $ANTLR start "TEXT"
    public final void mTEXT() throws RecognitionException {
        try {
            int _type = TEXT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/heyoen/workspace/VSL/bin/frontend/VslLexer.g:34:9: ( '\\\"' ( ASCII )* '\\\"' )
            // /home/heyoen/workspace/VSL/bin/frontend/VslLexer.g:34:11: '\\\"' ( ASCII )* '\\\"'
            {
            match('\"'); 

            // /home/heyoen/workspace/VSL/bin/frontend/VslLexer.g:34:16: ( ASCII )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0 >= '\u0000' && LA3_0 <= '!')||(LA3_0 >= '#' && LA3_0 <= '\uFFFF')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // /home/heyoen/workspace/VSL/bin/frontend/VslLexer.g:
            	    {
            	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '\uFFFF') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TEXT"

    // $ANTLR start "INTEGER"
    public final void mINTEGER() throws RecognitionException {
        try {
            int _type = INTEGER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/heyoen/workspace/VSL/bin/frontend/VslLexer.g:37:11: ( ( DIGIT )+ )
            // /home/heyoen/workspace/VSL/bin/frontend/VslLexer.g:37:13: ( DIGIT )+
            {
            // /home/heyoen/workspace/VSL/bin/frontend/VslLexer.g:37:13: ( DIGIT )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0 >= '0' && LA4_0 <= '9')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // /home/heyoen/workspace/VSL/bin/frontend/VslLexer.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


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


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INTEGER"

    // $ANTLR start "PG"
    public final void mPG() throws RecognitionException {
        try {
            int _type = PG;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/heyoen/workspace/VSL/bin/frontend/VslLexer.g:38:7: ( '(' )
            // /home/heyoen/workspace/VSL/bin/frontend/VslLexer.g:38:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PG"

    // $ANTLR start "PD"
    public final void mPD() throws RecognitionException {
        try {
            int _type = PD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/heyoen/workspace/VSL/bin/frontend/VslLexer.g:39:7: ( ')' )
            // /home/heyoen/workspace/VSL/bin/frontend/VslLexer.g:39:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PD"

    // $ANTLR start "CG"
    public final void mCG() throws RecognitionException {
        try {
            int _type = CG;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/heyoen/workspace/VSL/bin/frontend/VslLexer.g:40:7: ( '[' )
            // /home/heyoen/workspace/VSL/bin/frontend/VslLexer.g:40:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CG"

    // $ANTLR start "CD"
    public final void mCD() throws RecognitionException {
        try {
            int _type = CD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/heyoen/workspace/VSL/bin/frontend/VslLexer.g:41:7: ( ']' )
            // /home/heyoen/workspace/VSL/bin/frontend/VslLexer.g:41:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CD"

    // $ANTLR start "AG"
    public final void mAG() throws RecognitionException {
        try {
            int _type = AG;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/heyoen/workspace/VSL/bin/frontend/VslLexer.g:42:7: ( '{' )
            // /home/heyoen/workspace/VSL/bin/frontend/VslLexer.g:42:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "AG"

    // $ANTLR start "AD"
    public final void mAD() throws RecognitionException {
        try {
            int _type = AD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/heyoen/workspace/VSL/bin/frontend/VslLexer.g:43:7: ( '}' )
            // /home/heyoen/workspace/VSL/bin/frontend/VslLexer.g:43:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "AD"

    // $ANTLR start "VIRG"
    public final void mVIRG() throws RecognitionException {
        try {
            int _type = VIRG;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/heyoen/workspace/VSL/bin/frontend/VslLexer.g:44:9: ( ',' )
            // /home/heyoen/workspace/VSL/bin/frontend/VslLexer.g:44:11: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "VIRG"

    // $ANTLR start "FUNC_KW"
    public final void mFUNC_KW() throws RecognitionException {
        try {
            int _type = FUNC_KW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/heyoen/workspace/VSL/bin/frontend/VslLexer.g:45:11: ( 'FUNC' )
            // /home/heyoen/workspace/VSL/bin/frontend/VslLexer.g:45:13: 'FUNC'
            {
            match("FUNC"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FUNC_KW"

    // $ANTLR start "PROTO_KW"
    public final void mPROTO_KW() throws RecognitionException {
        try {
            int _type = PROTO_KW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/heyoen/workspace/VSL/bin/frontend/VslLexer.g:46:11: ( 'PROTO' )
            // /home/heyoen/workspace/VSL/bin/frontend/VslLexer.g:46:13: 'PROTO'
            {
            match("PROTO"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PROTO_KW"

    // $ANTLR start "INT_KW"
    public final void mINT_KW() throws RecognitionException {
        try {
            int _type = INT_KW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/heyoen/workspace/VSL/bin/frontend/VslLexer.g:47:11: ( 'INT' )
            // /home/heyoen/workspace/VSL/bin/frontend/VslLexer.g:47:13: 'INT'
            {
            match("INT"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INT_KW"

    // $ANTLR start "VOID_KW"
    public final void mVOID_KW() throws RecognitionException {
        try {
            int _type = VOID_KW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/heyoen/workspace/VSL/bin/frontend/VslLexer.g:48:11: ( 'VOID' )
            // /home/heyoen/workspace/VSL/bin/frontend/VslLexer.g:48:13: 'VOID'
            {
            match("VOID"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "VOID_KW"

    // $ANTLR start "ASSIGN_KW"
    public final void mASSIGN_KW() throws RecognitionException {
        try {
            int _type = ASSIGN_KW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/heyoen/workspace/VSL/bin/frontend/VslLexer.g:49:11: ( ':=' )
            // /home/heyoen/workspace/VSL/bin/frontend/VslLexer.g:49:13: ':='
            {
            match(":="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ASSIGN_KW"

    // $ANTLR start "RETURN_KW"
    public final void mRETURN_KW() throws RecognitionException {
        try {
            int _type = RETURN_KW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/heyoen/workspace/VSL/bin/frontend/VslLexer.g:50:11: ( 'RETURN' )
            // /home/heyoen/workspace/VSL/bin/frontend/VslLexer.g:50:13: 'RETURN'
            {
            match("RETURN"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RETURN_KW"

    // $ANTLR start "PRINT_KW"
    public final void mPRINT_KW() throws RecognitionException {
        try {
            int _type = PRINT_KW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/heyoen/workspace/VSL/bin/frontend/VslLexer.g:51:11: ( 'PRINT' )
            // /home/heyoen/workspace/VSL/bin/frontend/VslLexer.g:51:13: 'PRINT'
            {
            match("PRINT"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PRINT_KW"

    // $ANTLR start "READ_KW"
    public final void mREAD_KW() throws RecognitionException {
        try {
            int _type = READ_KW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/heyoen/workspace/VSL/bin/frontend/VslLexer.g:52:11: ( 'READ' )
            // /home/heyoen/workspace/VSL/bin/frontend/VslLexer.g:52:13: 'READ'
            {
            match("READ"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "READ_KW"

    // $ANTLR start "IF_KW"
    public final void mIF_KW() throws RecognitionException {
        try {
            int _type = IF_KW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/heyoen/workspace/VSL/bin/frontend/VslLexer.g:53:9: ( 'IF' )
            // /home/heyoen/workspace/VSL/bin/frontend/VslLexer.g:53:11: 'IF'
            {
            match("IF"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "IF_KW"

    // $ANTLR start "THEN_KW"
    public final void mTHEN_KW() throws RecognitionException {
        try {
            int _type = THEN_KW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/heyoen/workspace/VSL/bin/frontend/VslLexer.g:54:11: ( 'THEN' )
            // /home/heyoen/workspace/VSL/bin/frontend/VslLexer.g:54:13: 'THEN'
            {
            match("THEN"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "THEN_KW"

    // $ANTLR start "ELSE_KW"
    public final void mELSE_KW() throws RecognitionException {
        try {
            int _type = ELSE_KW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/heyoen/workspace/VSL/bin/frontend/VslLexer.g:55:11: ( 'ELSE' )
            // /home/heyoen/workspace/VSL/bin/frontend/VslLexer.g:55:13: 'ELSE'
            {
            match("ELSE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ELSE_KW"

    // $ANTLR start "FI_KW"
    public final void mFI_KW() throws RecognitionException {
        try {
            int _type = FI_KW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/heyoen/workspace/VSL/bin/frontend/VslLexer.g:56:9: ( 'FI' )
            // /home/heyoen/workspace/VSL/bin/frontend/VslLexer.g:56:11: 'FI'
            {
            match("FI"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FI_KW"

    // $ANTLR start "WHILE_KW"
    public final void mWHILE_KW() throws RecognitionException {
        try {
            int _type = WHILE_KW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/heyoen/workspace/VSL/bin/frontend/VslLexer.g:57:11: ( 'WHILE' )
            // /home/heyoen/workspace/VSL/bin/frontend/VslLexer.g:57:13: 'WHILE'
            {
            match("WHILE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WHILE_KW"

    // $ANTLR start "DO_KW"
    public final void mDO_KW() throws RecognitionException {
        try {
            int _type = DO_KW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/heyoen/workspace/VSL/bin/frontend/VslLexer.g:58:9: ( 'DO' )
            // /home/heyoen/workspace/VSL/bin/frontend/VslLexer.g:58:11: 'DO'
            {
            match("DO"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DO_KW"

    // $ANTLR start "OD_KW"
    public final void mOD_KW() throws RecognitionException {
        try {
            int _type = OD_KW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/heyoen/workspace/VSL/bin/frontend/VslLexer.g:59:9: ( 'DONE' )
            // /home/heyoen/workspace/VSL/bin/frontend/VslLexer.g:59:11: 'DONE'
            {
            match("DONE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "OD_KW"

    // $ANTLR start "PLUS"
    public final void mPLUS() throws RecognitionException {
        try {
            int _type = PLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/heyoen/workspace/VSL/bin/frontend/VslLexer.g:60:9: ( '+' )
            // /home/heyoen/workspace/VSL/bin/frontend/VslLexer.g:60:11: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PLUS"

    // $ANTLR start "MOINS"
    public final void mMOINS() throws RecognitionException {
        try {
            int _type = MOINS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/heyoen/workspace/VSL/bin/frontend/VslLexer.g:61:9: ( '-' )
            // /home/heyoen/workspace/VSL/bin/frontend/VslLexer.g:61:11: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MOINS"

    // $ANTLR start "MUL"
    public final void mMUL() throws RecognitionException {
        try {
            int _type = MUL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/heyoen/workspace/VSL/bin/frontend/VslLexer.g:62:7: ( '*' )
            // /home/heyoen/workspace/VSL/bin/frontend/VslLexer.g:62:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MUL"

    // $ANTLR start "DIV"
    public final void mDIV() throws RecognitionException {
        try {
            int _type = DIV;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/heyoen/workspace/VSL/bin/frontend/VslLexer.g:63:7: ( '/' )
            // /home/heyoen/workspace/VSL/bin/frontend/VslLexer.g:63:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DIV"

    public void mTokens() throws RecognitionException {
        // /home/heyoen/workspace/VSL/bin/frontend/VslLexer.g:1:8: ( WS | COMMENT | IDENT | TEXT | INTEGER | PG | PD | CG | CD | AG | AD | VIRG | FUNC_KW | PROTO_KW | INT_KW | VOID_KW | ASSIGN_KW | RETURN_KW | PRINT_KW | READ_KW | IF_KW | THEN_KW | ELSE_KW | FI_KW | WHILE_KW | DO_KW | OD_KW | PLUS | MOINS | MUL | DIV )
        int alt5=31;
        switch ( input.LA(1) ) {
        case '\t':
        case '\n':
        case '\r':
        case ' ':
            {
            alt5=1;
            }
            break;
        case '/':
            {
            int LA5_2 = input.LA(2);

            if ( (LA5_2=='/') ) {
                alt5=2;
            }
            else {
                alt5=31;
            }
            }
            break;
        case 'a':
        case 'b':
        case 'c':
        case 'd':
        case 'e':
        case 'f':
        case 'g':
        case 'h':
        case 'i':
        case 'j':
        case 'k':
        case 'l':
        case 'm':
        case 'n':
        case 'o':
        case 'p':
        case 'q':
        case 'r':
        case 's':
        case 't':
        case 'u':
        case 'v':
        case 'w':
        case 'x':
        case 'y':
        case 'z':
            {
            alt5=3;
            }
            break;
        case '\"':
            {
            alt5=4;
            }
            break;
        case '0':
        case '1':
        case '2':
        case '3':
        case '4':
        case '5':
        case '6':
        case '7':
        case '8':
        case '9':
            {
            alt5=5;
            }
            break;
        case '(':
            {
            alt5=6;
            }
            break;
        case ')':
            {
            alt5=7;
            }
            break;
        case '[':
            {
            alt5=8;
            }
            break;
        case ']':
            {
            alt5=9;
            }
            break;
        case '{':
            {
            alt5=10;
            }
            break;
        case '}':
            {
            alt5=11;
            }
            break;
        case ',':
            {
            alt5=12;
            }
            break;
        case 'F':
            {
            int LA5_13 = input.LA(2);

            if ( (LA5_13=='U') ) {
                alt5=13;
            }
            else if ( (LA5_13=='I') ) {
                alt5=24;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 13, input);

                throw nvae;

            }
            }
            break;
        case 'P':
            {
            int LA5_14 = input.LA(2);

            if ( (LA5_14=='R') ) {
                int LA5_30 = input.LA(3);

                if ( (LA5_30=='O') ) {
                    alt5=14;
                }
                else if ( (LA5_30=='I') ) {
                    alt5=19;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 30, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 14, input);

                throw nvae;

            }
            }
            break;
        case 'I':
            {
            int LA5_15 = input.LA(2);

            if ( (LA5_15=='N') ) {
                alt5=15;
            }
            else if ( (LA5_15=='F') ) {
                alt5=21;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 15, input);

                throw nvae;

            }
            }
            break;
        case 'V':
            {
            alt5=16;
            }
            break;
        case ':':
            {
            alt5=17;
            }
            break;
        case 'R':
            {
            int LA5_18 = input.LA(2);

            if ( (LA5_18=='E') ) {
                int LA5_33 = input.LA(3);

                if ( (LA5_33=='T') ) {
                    alt5=18;
                }
                else if ( (LA5_33=='A') ) {
                    alt5=20;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 33, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 18, input);

                throw nvae;

            }
            }
            break;
        case 'T':
            {
            alt5=22;
            }
            break;
        case 'E':
            {
            alt5=23;
            }
            break;
        case 'W':
            {
            alt5=25;
            }
            break;
        case 'D':
            {
            int LA5_22 = input.LA(2);

            if ( (LA5_22=='O') ) {
                int LA5_34 = input.LA(3);

                if ( (LA5_34=='N') ) {
                    alt5=27;
                }
                else {
                    alt5=26;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 22, input);

                throw nvae;

            }
            }
            break;
        case '+':
            {
            alt5=28;
            }
            break;
        case '-':
            {
            alt5=29;
            }
            break;
        case '*':
            {
            alt5=30;
            }
            break;
        default:
            NoViableAltException nvae =
                new NoViableAltException("", 5, 0, input);

            throw nvae;

        }

        switch (alt5) {
            case 1 :
                // /home/heyoen/workspace/VSL/bin/frontend/VslLexer.g:1:10: WS
                {
                mWS(); 


                }
                break;
            case 2 :
                // /home/heyoen/workspace/VSL/bin/frontend/VslLexer.g:1:13: COMMENT
                {
                mCOMMENT(); 


                }
                break;
            case 3 :
                // /home/heyoen/workspace/VSL/bin/frontend/VslLexer.g:1:21: IDENT
                {
                mIDENT(); 


                }
                break;
            case 4 :
                // /home/heyoen/workspace/VSL/bin/frontend/VslLexer.g:1:27: TEXT
                {
                mTEXT(); 


                }
                break;
            case 5 :
                // /home/heyoen/workspace/VSL/bin/frontend/VslLexer.g:1:32: INTEGER
                {
                mINTEGER(); 


                }
                break;
            case 6 :
                // /home/heyoen/workspace/VSL/bin/frontend/VslLexer.g:1:40: PG
                {
                mPG(); 


                }
                break;
            case 7 :
                // /home/heyoen/workspace/VSL/bin/frontend/VslLexer.g:1:43: PD
                {
                mPD(); 


                }
                break;
            case 8 :
                // /home/heyoen/workspace/VSL/bin/frontend/VslLexer.g:1:46: CG
                {
                mCG(); 


                }
                break;
            case 9 :
                // /home/heyoen/workspace/VSL/bin/frontend/VslLexer.g:1:49: CD
                {
                mCD(); 


                }
                break;
            case 10 :
                // /home/heyoen/workspace/VSL/bin/frontend/VslLexer.g:1:52: AG
                {
                mAG(); 


                }
                break;
            case 11 :
                // /home/heyoen/workspace/VSL/bin/frontend/VslLexer.g:1:55: AD
                {
                mAD(); 


                }
                break;
            case 12 :
                // /home/heyoen/workspace/VSL/bin/frontend/VslLexer.g:1:58: VIRG
                {
                mVIRG(); 


                }
                break;
            case 13 :
                // /home/heyoen/workspace/VSL/bin/frontend/VslLexer.g:1:63: FUNC_KW
                {
                mFUNC_KW(); 


                }
                break;
            case 14 :
                // /home/heyoen/workspace/VSL/bin/frontend/VslLexer.g:1:71: PROTO_KW
                {
                mPROTO_KW(); 


                }
                break;
            case 15 :
                // /home/heyoen/workspace/VSL/bin/frontend/VslLexer.g:1:80: INT_KW
                {
                mINT_KW(); 


                }
                break;
            case 16 :
                // /home/heyoen/workspace/VSL/bin/frontend/VslLexer.g:1:87: VOID_KW
                {
                mVOID_KW(); 


                }
                break;
            case 17 :
                // /home/heyoen/workspace/VSL/bin/frontend/VslLexer.g:1:95: ASSIGN_KW
                {
                mASSIGN_KW(); 


                }
                break;
            case 18 :
                // /home/heyoen/workspace/VSL/bin/frontend/VslLexer.g:1:105: RETURN_KW
                {
                mRETURN_KW(); 


                }
                break;
            case 19 :
                // /home/heyoen/workspace/VSL/bin/frontend/VslLexer.g:1:115: PRINT_KW
                {
                mPRINT_KW(); 


                }
                break;
            case 20 :
                // /home/heyoen/workspace/VSL/bin/frontend/VslLexer.g:1:124: READ_KW
                {
                mREAD_KW(); 


                }
                break;
            case 21 :
                // /home/heyoen/workspace/VSL/bin/frontend/VslLexer.g:1:132: IF_KW
                {
                mIF_KW(); 


                }
                break;
            case 22 :
                // /home/heyoen/workspace/VSL/bin/frontend/VslLexer.g:1:138: THEN_KW
                {
                mTHEN_KW(); 


                }
                break;
            case 23 :
                // /home/heyoen/workspace/VSL/bin/frontend/VslLexer.g:1:146: ELSE_KW
                {
                mELSE_KW(); 


                }
                break;
            case 24 :
                // /home/heyoen/workspace/VSL/bin/frontend/VslLexer.g:1:154: FI_KW
                {
                mFI_KW(); 


                }
                break;
            case 25 :
                // /home/heyoen/workspace/VSL/bin/frontend/VslLexer.g:1:160: WHILE_KW
                {
                mWHILE_KW(); 


                }
                break;
            case 26 :
                // /home/heyoen/workspace/VSL/bin/frontend/VslLexer.g:1:169: DO_KW
                {
                mDO_KW(); 


                }
                break;
            case 27 :
                // /home/heyoen/workspace/VSL/bin/frontend/VslLexer.g:1:175: OD_KW
                {
                mOD_KW(); 


                }
                break;
            case 28 :
                // /home/heyoen/workspace/VSL/bin/frontend/VslLexer.g:1:181: PLUS
                {
                mPLUS(); 


                }
                break;
            case 29 :
                // /home/heyoen/workspace/VSL/bin/frontend/VslLexer.g:1:186: MOINS
                {
                mMOINS(); 


                }
                break;
            case 30 :
                // /home/heyoen/workspace/VSL/bin/frontend/VslLexer.g:1:192: MUL
                {
                mMUL(); 


                }
                break;
            case 31 :
                // /home/heyoen/workspace/VSL/bin/frontend/VslLexer.g:1:196: DIV
                {
                mDIV(); 


                }
                break;

        }

    }


 

}