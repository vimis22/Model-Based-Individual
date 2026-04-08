package org.xtext.example.mydsl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslLexer extends Lexer {
    public static final int RULE_ALPHANUMERIC=13;
    public static final int RULE_BOOLEAN=12;
    public static final int RULE_STRING=10;
    public static final int RULE_POSITION=8;
    public static final int RULE_SL_COMMENT=15;
    public static final int T__19=19;
    public static final int T__18=18;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=4;
    public static final int RULE_WS=16;
    public static final int RULE_ANY_OTHER=17;
    public static final int RULE_LETTER=5;
    public static final int RULE_LINE=6;
    public static final int RULE_COLORSTRING=9;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=7;
    public static final int RULE_CELLREF=11;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=14;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators

    public InternalMyDslLexer() {;} 
    public InternalMyDslLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalMyDslLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:11:7: ( 'Table' )
            // InternalMyDsl.g:11:9: 'Table'
            {
            match("Table"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:12:7: ( 'Column' )
            // InternalMyDsl.g:12:9: 'Column'
            {
            match("Column"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:13:7: ( 'Columns' )
            // InternalMyDsl.g:13:9: 'Columns'
            {
            match("Columns"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:14:7: ( 'Width' )
            // InternalMyDsl.g:14:9: 'Width'
            {
            match("Width"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:15:7: ( 'cm' )
            // InternalMyDsl.g:15:9: 'cm'
            {
            match("cm"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:16:7: ( 'Alignment' )
            // InternalMyDsl.g:16:9: 'Alignment'
            {
            match("Alignment"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:17:7: ( 'Color' )
            // InternalMyDsl.g:17:9: 'Color'
            {
            match("Color"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:18:7: ( 'Cell' )
            // InternalMyDsl.g:18:9: 'Cell'
            {
            match("Cell"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:19:7: ( 'sum' )
            // InternalMyDsl.g:19:9: 'sum'
            {
            match("sum"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:20:7: ( 'mean' )
            // InternalMyDsl.g:20:9: 'mean'
            {
            match("mean"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:21:7: ( 'median' )
            // InternalMyDsl.g:21:9: 'median'
            {
            match("median"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:22:7: ( 'Value' )
            // InternalMyDsl.g:22:9: 'Value'
            {
            match("Value"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:23:7: ( '+' )
            // InternalMyDsl.g:23:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:24:7: ( '-' )
            // InternalMyDsl.g:24:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:25:7: ( '*' )
            // InternalMyDsl.g:25:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:26:7: ( '/' )
            // InternalMyDsl.g:26:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:27:7: ( '(' )
            // InternalMyDsl.g:27:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:28:7: ( ')' )
            // InternalMyDsl.g:28:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:29:7: ( ':' )
            // InternalMyDsl.g:29:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "RULE_LINE"
    public final void mRULE_LINE() throws RecognitionException {
        try {
            int _type = RULE_LINE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:1099:11: ( ( 'rightVerticalLine' | 'leftVertical' RULE_BOOLEAN ) )
            // InternalMyDsl.g:1099:13: ( 'rightVerticalLine' | 'leftVertical' RULE_BOOLEAN )
            {
            // InternalMyDsl.g:1099:13: ( 'rightVerticalLine' | 'leftVertical' RULE_BOOLEAN )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='r') ) {
                alt1=1;
            }
            else if ( (LA1_0=='l') ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalMyDsl.g:1099:14: 'rightVerticalLine'
                    {
                    match("rightVerticalLine"); 


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1099:34: 'leftVertical' RULE_BOOLEAN
                    {
                    match("leftVertical"); 

                    mRULE_BOOLEAN(); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LINE"

    // $ANTLR start "RULE_POSITION"
    public final void mRULE_POSITION() throws RecognitionException {
        try {
            int _type = RULE_POSITION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:1101:15: ( ( 'left' | 'center' | 'right' ) )
            // InternalMyDsl.g:1101:17: ( 'left' | 'center' | 'right' )
            {
            // InternalMyDsl.g:1101:17: ( 'left' | 'center' | 'right' )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 'l':
                {
                alt2=1;
                }
                break;
            case 'c':
                {
                alt2=2;
                }
                break;
            case 'r':
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:1101:18: 'left'
                    {
                    match("left"); 


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1101:25: 'center'
                    {
                    match("center"); 


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1101:34: 'right'
                    {
                    match("right"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_POSITION"

    // $ANTLR start "RULE_LETTER"
    public final void mRULE_LETTER() throws RecognitionException {
        try {
            int _type = RULE_LETTER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:1103:13: ( ( 'a' .. 'z' | 'A' .. 'Z' ) )
            // InternalMyDsl.g:1103:15: ( 'a' .. 'z' | 'A' .. 'Z' )
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LETTER"

    // $ANTLR start "RULE_ALPHANUMERIC"
    public final void mRULE_ALPHANUMERIC() throws RecognitionException {
        try {
            // InternalMyDsl.g:1105:28: ( ( RULE_INT | RULE_LETTER ) )
            // InternalMyDsl.g:1105:30: ( RULE_INT | RULE_LETTER )
            {
            // InternalMyDsl.g:1105:30: ( RULE_INT | RULE_LETTER )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                alt3=1;
            }
            else if ( ((LA3_0>='A' && LA3_0<='Z')||(LA3_0>='a' && LA3_0<='z')) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:1105:31: RULE_INT
                    {
                    mRULE_INT(); 

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1105:40: RULE_LETTER
                    {
                    mRULE_LETTER(); 

                    }
                    break;

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_ALPHANUMERIC"

    // $ANTLR start "RULE_COLORSTRING"
    public final void mRULE_COLORSTRING() throws RecognitionException {
        try {
            int _type = RULE_COLORSTRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:1107:18: ( ( ( RULE_LETTER )+ | '#' ( RULE_ALPHANUMERIC )+ | 'RGB(' ( RULE_INT )+ ',' ( RULE_INT )+ ',' ( RULE_INT )+ ')' ) )
            // InternalMyDsl.g:1107:20: ( ( RULE_LETTER )+ | '#' ( RULE_ALPHANUMERIC )+ | 'RGB(' ( RULE_INT )+ ',' ( RULE_INT )+ ',' ( RULE_INT )+ ')' )
            {
            // InternalMyDsl.g:1107:20: ( ( RULE_LETTER )+ | '#' ( RULE_ALPHANUMERIC )+ | 'RGB(' ( RULE_INT )+ ',' ( RULE_INT )+ ',' ( RULE_INT )+ ')' )
            int alt9=3;
            switch ( input.LA(1) ) {
            case 'R':
                {
                int LA9_1 = input.LA(2);

                if ( (LA9_1=='G') ) {
                    int LA9_4 = input.LA(3);

                    if ( (LA9_4=='B') ) {
                        int LA9_5 = input.LA(4);

                        if ( (LA9_5=='(') ) {
                            alt9=3;
                        }
                        else {
                            alt9=1;}
                    }
                    else {
                        alt9=1;}
                }
                else {
                    alt9=1;}
                }
                break;
            case '#':
                {
                alt9=2;
                }
                break;
            case 'A':
            case 'B':
            case 'C':
            case 'D':
            case 'E':
            case 'F':
            case 'G':
            case 'H':
            case 'I':
            case 'J':
            case 'K':
            case 'L':
            case 'M':
            case 'N':
            case 'O':
            case 'P':
            case 'Q':
            case 'S':
            case 'T':
            case 'U':
            case 'V':
            case 'W':
            case 'X':
            case 'Y':
            case 'Z':
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
                alt9=1;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalMyDsl.g:1107:21: ( RULE_LETTER )+
                    {
                    // InternalMyDsl.g:1107:21: ( RULE_LETTER )+
                    int cnt4=0;
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( ((LA4_0>='A' && LA4_0<='Z')||(LA4_0>='a' && LA4_0<='z')) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalMyDsl.g:1107:21: RULE_LETTER
                    	    {
                    	    mRULE_LETTER(); 

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
                    break;
                case 2 :
                    // InternalMyDsl.g:1107:34: '#' ( RULE_ALPHANUMERIC )+
                    {
                    match('#'); 
                    // InternalMyDsl.g:1107:38: ( RULE_ALPHANUMERIC )+
                    int cnt5=0;
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( ((LA5_0>='0' && LA5_0<='9')||(LA5_0>='A' && LA5_0<='Z')||(LA5_0>='a' && LA5_0<='z')) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalMyDsl.g:1107:38: RULE_ALPHANUMERIC
                    	    {
                    	    mRULE_ALPHANUMERIC(); 

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


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1107:57: 'RGB(' ( RULE_INT )+ ',' ( RULE_INT )+ ',' ( RULE_INT )+ ')'
                    {
                    match("RGB("); 

                    // InternalMyDsl.g:1107:64: ( RULE_INT )+
                    int cnt6=0;
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( ((LA6_0>='0' && LA6_0<='9')) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalMyDsl.g:1107:64: RULE_INT
                    	    {
                    	    mRULE_INT(); 

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

                    match(','); 
                    // InternalMyDsl.g:1107:78: ( RULE_INT )+
                    int cnt7=0;
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( ((LA7_0>='0' && LA7_0<='9')) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalMyDsl.g:1107:78: RULE_INT
                    	    {
                    	    mRULE_INT(); 

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

                    match(','); 
                    // InternalMyDsl.g:1107:92: ( RULE_INT )+
                    int cnt8=0;
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( ((LA8_0>='0' && LA8_0<='9')) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalMyDsl.g:1107:92: RULE_INT
                    	    {
                    	    mRULE_INT(); 

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

                    match(')'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_COLORSTRING"

    // $ANTLR start "RULE_BOOLEAN"
    public final void mRULE_BOOLEAN() throws RecognitionException {
        try {
            // InternalMyDsl.g:1109:23: ( ( 'true' | 'false' ) )
            // InternalMyDsl.g:1109:25: ( 'true' | 'false' )
            {
            // InternalMyDsl.g:1109:25: ( 'true' | 'false' )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='t') ) {
                alt10=1;
            }
            else if ( (LA10_0=='f') ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalMyDsl.g:1109:26: 'true'
                    {
                    match("true"); 


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1109:33: 'false'
                    {
                    match("false"); 


                    }
                    break;

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_BOOLEAN"

    // $ANTLR start "RULE_CELLREF"
    public final void mRULE_CELLREF() throws RecognitionException {
        try {
            int _type = RULE_CELLREF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:1111:14: ( 'A' .. 'Z' '0' .. '9' )
            // InternalMyDsl.g:1111:16: 'A' .. 'Z' '0' .. '9'
            {
            matchRange('A','Z'); 
            matchRange('0','9'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_CELLREF"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:1113:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalMyDsl.g:1113:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalMyDsl.g:1113:11: ( '^' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='^') ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalMyDsl.g:1113:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalMyDsl.g:1113:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='0' && LA12_0<='9')||(LA12_0>='A' && LA12_0<='Z')||LA12_0=='_'||(LA12_0>='a' && LA12_0<='z')) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalMyDsl.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:1115:10: ( ( '0' .. '9' )+ )
            // InternalMyDsl.g:1115:12: ( '0' .. '9' )+
            {
            // InternalMyDsl.g:1115:12: ( '0' .. '9' )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='0' && LA13_0<='9')) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalMyDsl.g:1115:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

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


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:1117:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalMyDsl.g:1117:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalMyDsl.g:1117:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0=='\"') ) {
                alt16=1;
            }
            else if ( (LA16_0=='\'') ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalMyDsl.g:1117:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalMyDsl.g:1117:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop14:
                    do {
                        int alt14=3;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0=='\\') ) {
                            alt14=1;
                        }
                        else if ( ((LA14_0>='\u0000' && LA14_0<='!')||(LA14_0>='#' && LA14_0<='[')||(LA14_0>=']' && LA14_0<='\uFFFF')) ) {
                            alt14=2;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalMyDsl.g:1117:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalMyDsl.g:1117:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1117:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalMyDsl.g:1117:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop15:
                    do {
                        int alt15=3;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0=='\\') ) {
                            alt15=1;
                        }
                        else if ( ((LA15_0>='\u0000' && LA15_0<='&')||(LA15_0>='(' && LA15_0<='[')||(LA15_0>=']' && LA15_0<='\uFFFF')) ) {
                            alt15=2;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // InternalMyDsl.g:1117:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalMyDsl.g:1117:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:1119:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalMyDsl.g:1119:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalMyDsl.g:1119:24: ( options {greedy=false; } : . )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0=='*') ) {
                    int LA17_1 = input.LA(2);

                    if ( (LA17_1=='/') ) {
                        alt17=2;
                    }
                    else if ( ((LA17_1>='\u0000' && LA17_1<='.')||(LA17_1>='0' && LA17_1<='\uFFFF')) ) {
                        alt17=1;
                    }


                }
                else if ( ((LA17_0>='\u0000' && LA17_0<=')')||(LA17_0>='+' && LA17_0<='\uFFFF')) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalMyDsl.g:1119:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:1121:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalMyDsl.g:1121:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalMyDsl.g:1121:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>='\u0000' && LA18_0<='\t')||(LA18_0>='\u000B' && LA18_0<='\f')||(LA18_0>='\u000E' && LA18_0<='\uFFFF')) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalMyDsl.g:1121:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            // InternalMyDsl.g:1121:40: ( ( '\\r' )? '\\n' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0=='\n'||LA20_0=='\r') ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalMyDsl.g:1121:41: ( '\\r' )? '\\n'
                    {
                    // InternalMyDsl.g:1121:41: ( '\\r' )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0=='\r') ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // InternalMyDsl.g:1121:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:1123:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalMyDsl.g:1123:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalMyDsl.g:1123:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt21=0;
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>='\t' && LA21_0<='\n')||LA21_0=='\r'||LA21_0==' ') ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalMyDsl.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


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


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:1125:16: ( . )
            // InternalMyDsl.g:1125:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalMyDsl.g:1:8: ( T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | RULE_LINE | RULE_POSITION | RULE_LETTER | RULE_COLORSTRING | RULE_CELLREF | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt22=31;
        alt22 = dfa22.predict(input);
        switch (alt22) {
            case 1 :
                // InternalMyDsl.g:1:10: T__18
                {
                mT__18(); 

                }
                break;
            case 2 :
                // InternalMyDsl.g:1:16: T__19
                {
                mT__19(); 

                }
                break;
            case 3 :
                // InternalMyDsl.g:1:22: T__20
                {
                mT__20(); 

                }
                break;
            case 4 :
                // InternalMyDsl.g:1:28: T__21
                {
                mT__21(); 

                }
                break;
            case 5 :
                // InternalMyDsl.g:1:34: T__22
                {
                mT__22(); 

                }
                break;
            case 6 :
                // InternalMyDsl.g:1:40: T__23
                {
                mT__23(); 

                }
                break;
            case 7 :
                // InternalMyDsl.g:1:46: T__24
                {
                mT__24(); 

                }
                break;
            case 8 :
                // InternalMyDsl.g:1:52: T__25
                {
                mT__25(); 

                }
                break;
            case 9 :
                // InternalMyDsl.g:1:58: T__26
                {
                mT__26(); 

                }
                break;
            case 10 :
                // InternalMyDsl.g:1:64: T__27
                {
                mT__27(); 

                }
                break;
            case 11 :
                // InternalMyDsl.g:1:70: T__28
                {
                mT__28(); 

                }
                break;
            case 12 :
                // InternalMyDsl.g:1:76: T__29
                {
                mT__29(); 

                }
                break;
            case 13 :
                // InternalMyDsl.g:1:82: T__30
                {
                mT__30(); 

                }
                break;
            case 14 :
                // InternalMyDsl.g:1:88: T__31
                {
                mT__31(); 

                }
                break;
            case 15 :
                // InternalMyDsl.g:1:94: T__32
                {
                mT__32(); 

                }
                break;
            case 16 :
                // InternalMyDsl.g:1:100: T__33
                {
                mT__33(); 

                }
                break;
            case 17 :
                // InternalMyDsl.g:1:106: T__34
                {
                mT__34(); 

                }
                break;
            case 18 :
                // InternalMyDsl.g:1:112: T__35
                {
                mT__35(); 

                }
                break;
            case 19 :
                // InternalMyDsl.g:1:118: T__36
                {
                mT__36(); 

                }
                break;
            case 20 :
                // InternalMyDsl.g:1:124: RULE_LINE
                {
                mRULE_LINE(); 

                }
                break;
            case 21 :
                // InternalMyDsl.g:1:134: RULE_POSITION
                {
                mRULE_POSITION(); 

                }
                break;
            case 22 :
                // InternalMyDsl.g:1:148: RULE_LETTER
                {
                mRULE_LETTER(); 

                }
                break;
            case 23 :
                // InternalMyDsl.g:1:160: RULE_COLORSTRING
                {
                mRULE_COLORSTRING(); 

                }
                break;
            case 24 :
                // InternalMyDsl.g:1:177: RULE_CELLREF
                {
                mRULE_CELLREF(); 

                }
                break;
            case 25 :
                // InternalMyDsl.g:1:190: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 26 :
                // InternalMyDsl.g:1:198: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 27 :
                // InternalMyDsl.g:1:207: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 28 :
                // InternalMyDsl.g:1:219: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 29 :
                // InternalMyDsl.g:1:235: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 30 :
                // InternalMyDsl.g:1:251: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 31 :
                // InternalMyDsl.g:1:259: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA22 dfa22 = new DFA22(this);
    static final String DFA22_eotS =
        "\1\uffff\10\37\3\uffff\1\60\3\uffff\3\37\1\34\2\37\1\34\2\uffff\2\34\2\uffff\1\67\1\74\1\uffff\1\67\1\uffff\3\67\1\100\5\67\11\uffff\3\67\4\uffff\1\67\1\uffff\3\67\1\uffff\2\67\1\121\11\67\1\132\3\67\1\uffff\1\136\3\67\1\143\1\144\1\67\1\146\1\uffff\1\147\2\67\1\uffff\1\67\1\153\1\143\1\67\2\uffff\1\157\2\uffff\1\143\1\67\1\161\1\uffff\2\67\1\164\1\uffff\1\67\1\uffff\2\67\1\uffff\3\67\1\173\2\67\1\uffff\20\67\1\u008f\1\67\1\u008f\1\uffff\1\u008f";
    static final String DFA22_eofS =
        "\u0091\uffff";
    static final String DFA22_minS =
        "\1\0\10\60\3\uffff\1\52\3\uffff\6\60\1\101\2\uffff\2\0\2\uffff\2\60\1\uffff\1\60\1\uffff\11\60\11\uffff\3\60\4\uffff\1\60\1\uffff\3\60\1\uffff\20\60\1\uffff\10\60\1\uffff\3\60\1\uffff\4\60\2\uffff\1\60\2\uffff\3\60\1\uffff\3\60\1\uffff\1\60\1\uffff\2\60\1\uffff\6\60\1\uffff\23\60\1\uffff\1\60";
    static final String DFA22_maxS =
        "\1\uffff\10\172\3\uffff\1\57\3\uffff\7\172\2\uffff\2\uffff\2\uffff\2\172\1\uffff\1\172\1\uffff\11\172\11\uffff\3\172\4\uffff\1\172\1\uffff\3\172\1\uffff\20\172\1\uffff\10\172\1\uffff\3\172\1\uffff\4\172\2\uffff\1\172\2\uffff\3\172\1\uffff\3\172\1\uffff\1\172\1\uffff\2\172\1\uffff\6\172\1\uffff\23\172\1\uffff\1\172";
    static final String DFA22_acceptS =
        "\11\uffff\1\15\1\16\1\17\1\uffff\1\21\1\22\1\23\7\uffff\1\31\1\32\2\uffff\1\36\1\37\2\uffff\1\26\1\uffff\1\31\11\uffff\1\15\1\16\1\17\1\34\1\35\1\20\1\21\1\22\1\23\3\uffff\1\27\1\32\1\33\1\36\1\uffff\1\30\3\uffff\1\5\20\uffff\1\11\10\uffff\1\10\3\uffff\1\12\4\uffff\1\25\1\1\1\uffff\1\7\1\4\3\uffff\1\14\3\uffff\1\2\1\uffff\1\13\2\uffff\1\3\6\uffff\1\6\23\uffff\1\24\1\uffff";
    static final String DFA22_specialS =
        "\1\0\30\uffff\1\2\1\1\166\uffff}>";
    static final String[] DFA22_transitionS = {
            "\11\34\2\33\2\34\1\33\22\34\1\33\1\34\1\31\1\23\3\34\1\32\1\15\1\16\1\13\1\11\1\34\1\12\1\34\1\14\12\30\1\17\6\34\1\5\1\24\1\2\16\24\1\22\1\24\1\1\1\24\1\10\1\3\3\24\3\34\1\26\1\27\1\34\2\25\1\4\10\25\1\21\1\7\4\25\1\20\1\6\7\25\uff85\34",
            "\12\36\7\uffff\32\40\4\uffff\1\41\1\uffff\1\35\31\40",
            "\12\36\7\uffff\32\40\4\uffff\1\41\1\uffff\4\40\1\43\11\40\1\42\13\40",
            "\12\36\7\uffff\32\40\4\uffff\1\41\1\uffff\10\40\1\44\21\40",
            "\12\41\7\uffff\32\40\4\uffff\1\41\1\uffff\4\40\1\46\7\40\1\45\15\40",
            "\12\36\7\uffff\32\40\4\uffff\1\41\1\uffff\13\40\1\47\16\40",
            "\12\41\7\uffff\32\40\4\uffff\1\41\1\uffff\24\40\1\50\5\40",
            "\12\41\7\uffff\32\40\4\uffff\1\41\1\uffff\4\40\1\51\25\40",
            "\12\36\7\uffff\32\40\4\uffff\1\41\1\uffff\1\52\31\40",
            "",
            "",
            "",
            "\1\56\4\uffff\1\57",
            "",
            "",
            "",
            "\12\41\7\uffff\32\40\4\uffff\1\41\1\uffff\10\40\1\64\21\40",
            "\12\41\7\uffff\32\40\4\uffff\1\41\1\uffff\4\40\1\65\25\40",
            "\12\36\7\uffff\6\40\1\66\23\40\4\uffff\1\41\1\uffff\32\40",
            "\12\67\7\uffff\32\67\6\uffff\32\67",
            "\12\36\7\uffff\32\40\4\uffff\1\41\1\uffff\32\40",
            "\12\41\7\uffff\32\40\4\uffff\1\41\1\uffff\32\40",
            "\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "",
            "\0\71",
            "\0\71",
            "",
            "",
            "\12\41\7\uffff\32\40\4\uffff\1\41\1\uffff\1\40\1\73\30\40",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "\12\41\7\uffff\32\40\4\uffff\1\41\1\uffff\32\40",
            "",
            "\12\41\7\uffff\32\40\4\uffff\1\41\1\uffff\13\40\1\75\16\40",
            "\12\41\7\uffff\32\40\4\uffff\1\41\1\uffff\13\40\1\76\16\40",
            "\12\41\7\uffff\32\40\4\uffff\1\41\1\uffff\3\40\1\77\26\40",
            "\12\41\7\uffff\32\40\4\uffff\1\41\1\uffff\32\40",
            "\12\41\7\uffff\32\40\4\uffff\1\41\1\uffff\15\40\1\101\14\40",
            "\12\41\7\uffff\32\40\4\uffff\1\41\1\uffff\10\40\1\102\21\40",
            "\12\41\7\uffff\32\40\4\uffff\1\41\1\uffff\14\40\1\103\15\40",
            "\12\41\7\uffff\32\40\4\uffff\1\41\1\uffff\1\104\2\40\1\105\26\40",
            "\12\41\7\uffff\32\40\4\uffff\1\41\1\uffff\13\40\1\106\16\40",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\41\7\uffff\32\40\4\uffff\1\41\1\uffff\6\40\1\107\23\40",
            "\12\41\7\uffff\32\40\4\uffff\1\41\1\uffff\5\40\1\110\24\40",
            "\12\41\7\uffff\1\40\1\111\30\40\4\uffff\1\41\1\uffff\32\40",
            "",
            "",
            "",
            "",
            "\12\41\7\uffff\32\40\4\uffff\1\41\1\uffff\13\40\1\112\16\40",
            "",
            "\12\41\7\uffff\32\40\4\uffff\1\41\1\uffff\16\40\1\114\5\40\1\113\5\40",
            "\12\41\7\uffff\32\40\4\uffff\1\41\1\uffff\13\40\1\115\16\40",
            "\12\41\7\uffff\32\40\4\uffff\1\41\1\uffff\23\40\1\116\6\40",
            "",
            "\12\41\7\uffff\32\40\4\uffff\1\41\1\uffff\23\40\1\117\6\40",
            "\12\41\7\uffff\32\40\4\uffff\1\41\1\uffff\6\40\1\120\23\40",
            "\12\41\7\uffff\32\40\4\uffff\1\41\1\uffff\32\40",
            "\12\41\7\uffff\32\40\4\uffff\1\41\1\uffff\15\40\1\122\14\40",
            "\12\41\7\uffff\32\40\4\uffff\1\41\1\uffff\10\40\1\123\21\40",
            "\12\41\7\uffff\32\40\4\uffff\1\41\1\uffff\24\40\1\124\5\40",
            "\12\41\7\uffff\32\40\4\uffff\1\41\1\uffff\7\40\1\125\22\40",
            "\12\41\7\uffff\32\40\4\uffff\1\41\1\uffff\23\40\1\126\6\40",
            "\12\41\7\uffff\32\40\4\uffff\1\41\1\uffff\32\40",
            "\12\41\7\uffff\32\40\4\uffff\1\41\1\uffff\4\40\1\127\25\40",
            "\12\41\7\uffff\32\40\4\uffff\1\41\1\uffff\14\40\1\130\15\40",
            "\12\41\7\uffff\32\40\4\uffff\1\41\1\uffff\21\40\1\131\10\40",
            "\12\41\7\uffff\32\40\4\uffff\1\41\1\uffff\32\40",
            "\12\41\7\uffff\32\40\4\uffff\1\41\1\uffff\7\40\1\133\22\40",
            "\12\41\7\uffff\32\40\4\uffff\1\41\1\uffff\4\40\1\134\25\40",
            "\12\41\7\uffff\32\40\4\uffff\1\41\1\uffff\15\40\1\135\14\40",
            "",
            "\12\41\7\uffff\32\40\4\uffff\1\41\1\uffff\32\40",
            "\12\41\7\uffff\32\40\4\uffff\1\41\1\uffff\1\137\31\40",
            "\12\41\7\uffff\32\40\4\uffff\1\41\1\uffff\4\40\1\140\25\40",
            "\12\41\7\uffff\32\40\4\uffff\1\41\1\uffff\23\40\1\141\6\40",
            "\12\41\7\uffff\25\40\1\142\4\40\4\uffff\1\41\1\uffff\32\40",
            "\12\41\7\uffff\32\40\4\uffff\1\41\1\uffff\32\40",
            "\12\41\7\uffff\32\40\4\uffff\1\41\1\uffff\15\40\1\145\14\40",
            "\12\41\7\uffff\32\40\4\uffff\1\41\1\uffff\32\40",
            "",
            "\12\41\7\uffff\32\40\4\uffff\1\41\1\uffff\32\40",
            "\12\41\7\uffff\32\40\4\uffff\1\41\1\uffff\21\40\1\150\10\40",
            "\12\41\7\uffff\32\40\4\uffff\1\41\1\uffff\14\40\1\151\15\40",
            "",
            "\12\41\7\uffff\32\40\4\uffff\1\41\1\uffff\15\40\1\152\14\40",
            "\12\41\7\uffff\32\40\4\uffff\1\41\1\uffff\32\40",
            "\12\41\7\uffff\25\40\1\154\4\40\4\uffff\1\41\1\uffff\32\40",
            "\12\41\7\uffff\32\40\4\uffff\1\41\1\uffff\4\40\1\155\25\40",
            "",
            "",
            "\12\41\7\uffff\32\40\4\uffff\1\41\1\uffff\22\40\1\156\7\40",
            "",
            "",
            "\12\41\7\uffff\32\40\4\uffff\1\41\1\uffff\32\40",
            "\12\41\7\uffff\32\40\4\uffff\1\41\1\uffff\4\40\1\160\25\40",
            "\12\41\7\uffff\32\40\4\uffff\1\41\1\uffff\32\40",
            "",
            "\12\41\7\uffff\32\40\4\uffff\1\41\1\uffff\4\40\1\162\25\40",
            "\12\41\7\uffff\32\40\4\uffff\1\41\1\uffff\21\40\1\163\10\40",
            "\12\41\7\uffff\32\40\4\uffff\1\41\1\uffff\32\40",
            "",
            "\12\41\7\uffff\32\40\4\uffff\1\41\1\uffff\15\40\1\165\14\40",
            "",
            "\12\41\7\uffff\32\40\4\uffff\1\41\1\uffff\21\40\1\166\10\40",
            "\12\41\7\uffff\32\40\4\uffff\1\41\1\uffff\23\40\1\167\6\40",
            "",
            "\12\41\7\uffff\32\40\4\uffff\1\41\1\uffff\23\40\1\170\6\40",
            "\12\41\7\uffff\32\40\4\uffff\1\41\1\uffff\23\40\1\171\6\40",
            "\12\41\7\uffff\32\40\4\uffff\1\41\1\uffff\10\40\1\172\21\40",
            "\12\41\7\uffff\32\40\4\uffff\1\41\1\uffff\32\40",
            "\12\41\7\uffff\32\40\4\uffff\1\41\1\uffff\10\40\1\174\21\40",
            "\12\41\7\uffff\32\40\4\uffff\1\41\1\uffff\2\40\1\175\27\40",
            "",
            "\12\41\7\uffff\32\40\4\uffff\1\41\1\uffff\2\40\1\176\27\40",
            "\12\41\7\uffff\32\40\4\uffff\1\41\1\uffff\1\177\31\40",
            "\12\41\7\uffff\32\40\4\uffff\1\41\1\uffff\1\u0080\31\40",
            "\12\41\7\uffff\32\40\4\uffff\1\41\1\uffff\13\40\1\u0081\16\40",
            "\12\41\7\uffff\32\40\4\uffff\1\41\1\uffff\13\40\1\u0082\16\40",
            "\12\41\7\uffff\32\40\4\uffff\1\41\1\uffff\5\40\1\u0084\15\40\1\u0083\6\40",
            "\12\41\7\uffff\13\40\1\u0085\16\40\4\uffff\1\41\1\uffff\32\40",
            "\12\41\7\uffff\32\40\4\uffff\1\41\1\uffff\21\40\1\u0086\10\40",
            "\12\41\7\uffff\32\40\4\uffff\1\41\1\uffff\1\u0087\31\40",
            "\12\41\7\uffff\32\40\4\uffff\1\41\1\uffff\10\40\1\u0088\21\40",
            "\12\41\7\uffff\32\40\4\uffff\1\41\1\uffff\24\40\1\u0089\5\40",
            "\12\41\7\uffff\32\40\4\uffff\1\41\1\uffff\13\40\1\u008a\16\40",
            "\12\41\7\uffff\32\40\4\uffff\1\41\1\uffff\15\40\1\u008b\14\40",
            "\12\41\7\uffff\32\40\4\uffff\1\41\1\uffff\4\40\1\u008c\25\40",
            "\12\41\7\uffff\32\40\4\uffff\1\41\1\uffff\22\40\1\u008d\7\40",
            "\12\41\7\uffff\32\40\4\uffff\1\41\1\uffff\4\40\1\u008e\25\40",
            "\12\41\7\uffff\32\40\4\uffff\1\41\1\uffff\32\40",
            "\12\41\7\uffff\32\40\4\uffff\1\41\1\uffff\4\40\1\u0090\25\40",
            "\12\41\7\uffff\32\40\4\uffff\1\41\1\uffff\32\40",
            "",
            "\12\41\7\uffff\32\40\4\uffff\1\41\1\uffff\32\40"
    };

    static final short[] DFA22_eot = DFA.unpackEncodedString(DFA22_eotS);
    static final short[] DFA22_eof = DFA.unpackEncodedString(DFA22_eofS);
    static final char[] DFA22_min = DFA.unpackEncodedStringToUnsignedChars(DFA22_minS);
    static final char[] DFA22_max = DFA.unpackEncodedStringToUnsignedChars(DFA22_maxS);
    static final short[] DFA22_accept = DFA.unpackEncodedString(DFA22_acceptS);
    static final short[] DFA22_special = DFA.unpackEncodedString(DFA22_specialS);
    static final short[][] DFA22_transition;

    static {
        int numStates = DFA22_transitionS.length;
        DFA22_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA22_transition[i] = DFA.unpackEncodedString(DFA22_transitionS[i]);
        }
    }

    class DFA22 extends DFA {

        public DFA22(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 22;
            this.eot = DFA22_eot;
            this.eof = DFA22_eof;
            this.min = DFA22_min;
            this.max = DFA22_max;
            this.accept = DFA22_accept;
            this.special = DFA22_special;
            this.transition = DFA22_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | RULE_LINE | RULE_POSITION | RULE_LETTER | RULE_COLORSTRING | RULE_CELLREF | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA22_0 = input.LA(1);

                        s = -1;
                        if ( (LA22_0=='T') ) {s = 1;}

                        else if ( (LA22_0=='C') ) {s = 2;}

                        else if ( (LA22_0=='W') ) {s = 3;}

                        else if ( (LA22_0=='c') ) {s = 4;}

                        else if ( (LA22_0=='A') ) {s = 5;}

                        else if ( (LA22_0=='s') ) {s = 6;}

                        else if ( (LA22_0=='m') ) {s = 7;}

                        else if ( (LA22_0=='V') ) {s = 8;}

                        else if ( (LA22_0=='+') ) {s = 9;}

                        else if ( (LA22_0=='-') ) {s = 10;}

                        else if ( (LA22_0=='*') ) {s = 11;}

                        else if ( (LA22_0=='/') ) {s = 12;}

                        else if ( (LA22_0=='(') ) {s = 13;}

                        else if ( (LA22_0==')') ) {s = 14;}

                        else if ( (LA22_0==':') ) {s = 15;}

                        else if ( (LA22_0=='r') ) {s = 16;}

                        else if ( (LA22_0=='l') ) {s = 17;}

                        else if ( (LA22_0=='R') ) {s = 18;}

                        else if ( (LA22_0=='#') ) {s = 19;}

                        else if ( (LA22_0=='B'||(LA22_0>='D' && LA22_0<='Q')||LA22_0=='S'||LA22_0=='U'||(LA22_0>='X' && LA22_0<='Z')) ) {s = 20;}

                        else if ( ((LA22_0>='a' && LA22_0<='b')||(LA22_0>='d' && LA22_0<='k')||(LA22_0>='n' && LA22_0<='q')||(LA22_0>='t' && LA22_0<='z')) ) {s = 21;}

                        else if ( (LA22_0=='^') ) {s = 22;}

                        else if ( (LA22_0=='_') ) {s = 23;}

                        else if ( ((LA22_0>='0' && LA22_0<='9')) ) {s = 24;}

                        else if ( (LA22_0=='\"') ) {s = 25;}

                        else if ( (LA22_0=='\'') ) {s = 26;}

                        else if ( ((LA22_0>='\t' && LA22_0<='\n')||LA22_0=='\r'||LA22_0==' ') ) {s = 27;}

                        else if ( ((LA22_0>='\u0000' && LA22_0<='\b')||(LA22_0>='\u000B' && LA22_0<='\f')||(LA22_0>='\u000E' && LA22_0<='\u001F')||LA22_0=='!'||(LA22_0>='$' && LA22_0<='&')||LA22_0==','||LA22_0=='.'||(LA22_0>=';' && LA22_0<='@')||(LA22_0>='[' && LA22_0<=']')||LA22_0=='`'||(LA22_0>='{' && LA22_0<='\uFFFF')) ) {s = 28;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA22_26 = input.LA(1);

                        s = -1;
                        if ( ((LA22_26>='\u0000' && LA22_26<='\uFFFF')) ) {s = 57;}

                        else s = 28;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA22_25 = input.LA(1);

                        s = -1;
                        if ( ((LA22_25>='\u0000' && LA22_25<='\uFFFF')) ) {s = 57;}

                        else s = 28;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 22, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}