package org.xtext.example.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_LETTER", "RULE_LINE", "RULE_INT", "RULE_POSITION", "RULE_COLORSTRING", "RULE_STRING", "RULE_CELLREF", "RULE_BOOLEAN", "RULE_ALPHANUMERIC", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Table'", "'Column'", "'Columns'", "'Width'", "'cm'", "'Alignment'", "'Color'", "'Cell'", "'sum'", "'mean'", "'median'", "'Value'", "'+'", "'-'", "'*'", "'/'", "'('", "')'", "':'"
    };
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


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }



     	private MyDslGrammarAccess grammarAccess;

        public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Table";
       	}

       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleTable"
    // InternalMyDsl.g:64:1: entryRuleTable returns [EObject current=null] : iv_ruleTable= ruleTable EOF ;
    public final EObject entryRuleTable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTable = null;


        try {
            // InternalMyDsl.g:64:46: (iv_ruleTable= ruleTable EOF )
            // InternalMyDsl.g:65:2: iv_ruleTable= ruleTable EOF
            {
             newCompositeNode(grammarAccess.getTableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTable=ruleTable();

            state._fsp--;

             current =iv_ruleTable; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTable"


    // $ANTLR start "ruleTable"
    // InternalMyDsl.g:71:1: ruleTable returns [EObject current=null] : (otherlv_0= 'Table' ( (lv_name_1_0= RULE_ID ) ) ( (lv_nrColumns_2_0= ruleNrColumns ) ) ( (lv_columns_3_0= ruleColumn ) )+ ) ;
    public final EObject ruleTable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_nrColumns_2_0 = null;

        EObject lv_columns_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:77:2: ( (otherlv_0= 'Table' ( (lv_name_1_0= RULE_ID ) ) ( (lv_nrColumns_2_0= ruleNrColumns ) ) ( (lv_columns_3_0= ruleColumn ) )+ ) )
            // InternalMyDsl.g:78:2: (otherlv_0= 'Table' ( (lv_name_1_0= RULE_ID ) ) ( (lv_nrColumns_2_0= ruleNrColumns ) ) ( (lv_columns_3_0= ruleColumn ) )+ )
            {
            // InternalMyDsl.g:78:2: (otherlv_0= 'Table' ( (lv_name_1_0= RULE_ID ) ) ( (lv_nrColumns_2_0= ruleNrColumns ) ) ( (lv_columns_3_0= ruleColumn ) )+ )
            // InternalMyDsl.g:79:3: otherlv_0= 'Table' ( (lv_name_1_0= RULE_ID ) ) ( (lv_nrColumns_2_0= ruleNrColumns ) ) ( (lv_columns_3_0= ruleColumn ) )+
            {
            otherlv_0=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getTableAccess().getTableKeyword_0());
            		
            // InternalMyDsl.g:83:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:84:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:84:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:85:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getTableAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTableRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalMyDsl.g:101:3: ( (lv_nrColumns_2_0= ruleNrColumns ) )
            // InternalMyDsl.g:102:4: (lv_nrColumns_2_0= ruleNrColumns )
            {
            // InternalMyDsl.g:102:4: (lv_nrColumns_2_0= ruleNrColumns )
            // InternalMyDsl.g:103:5: lv_nrColumns_2_0= ruleNrColumns
            {

            					newCompositeNode(grammarAccess.getTableAccess().getNrColumnsNrColumnsParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_5);
            lv_nrColumns_2_0=ruleNrColumns();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTableRule());
            					}
            					set(
            						current,
            						"nrColumns",
            						lv_nrColumns_2_0,
            						"org.xtext.example.mydsl.MyDsl.NrColumns");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:120:3: ( (lv_columns_3_0= ruleColumn ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==19) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:121:4: (lv_columns_3_0= ruleColumn )
            	    {
            	    // InternalMyDsl.g:121:4: (lv_columns_3_0= ruleColumn )
            	    // InternalMyDsl.g:122:5: lv_columns_3_0= ruleColumn
            	    {

            	    					newCompositeNode(grammarAccess.getTableAccess().getColumnsColumnParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_columns_3_0=ruleColumn();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getTableRule());
            	    					}
            	    					add(
            	    						current,
            	    						"columns",
            	    						lv_columns_3_0,
            	    						"org.xtext.example.mydsl.MyDsl.Column");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


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


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTable"


    // $ANTLR start "entryRuleColumn"
    // InternalMyDsl.g:143:1: entryRuleColumn returns [EObject current=null] : iv_ruleColumn= ruleColumn EOF ;
    public final EObject entryRuleColumn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColumn = null;


        try {
            // InternalMyDsl.g:143:47: (iv_ruleColumn= ruleColumn EOF )
            // InternalMyDsl.g:144:2: iv_ruleColumn= ruleColumn EOF
            {
             newCompositeNode(grammarAccess.getColumnRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleColumn=ruleColumn();

            state._fsp--;

             current =iv_ruleColumn; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleColumn"


    // $ANTLR start "ruleColumn"
    // InternalMyDsl.g:150:1: ruleColumn returns [EObject current=null] : (otherlv_0= 'Column' ( (lv_letter_1_0= RULE_LETTER ) ) ( (lv_width_2_0= ruleWIDTH ) )? ( (lv_alignment_3_0= ruleALIGNMENT ) )? ( (lv_color_4_0= ruleCOLOR ) )? ( (lv_line_5_0= RULE_LINE ) )* ( (lv_cell_6_0= ruleCELL ) )* ) ;
    public final EObject ruleColumn() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_letter_1_0=null;
        Token lv_line_5_0=null;
        EObject lv_width_2_0 = null;

        EObject lv_alignment_3_0 = null;

        EObject lv_color_4_0 = null;

        EObject lv_cell_6_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:156:2: ( (otherlv_0= 'Column' ( (lv_letter_1_0= RULE_LETTER ) ) ( (lv_width_2_0= ruleWIDTH ) )? ( (lv_alignment_3_0= ruleALIGNMENT ) )? ( (lv_color_4_0= ruleCOLOR ) )? ( (lv_line_5_0= RULE_LINE ) )* ( (lv_cell_6_0= ruleCELL ) )* ) )
            // InternalMyDsl.g:157:2: (otherlv_0= 'Column' ( (lv_letter_1_0= RULE_LETTER ) ) ( (lv_width_2_0= ruleWIDTH ) )? ( (lv_alignment_3_0= ruleALIGNMENT ) )? ( (lv_color_4_0= ruleCOLOR ) )? ( (lv_line_5_0= RULE_LINE ) )* ( (lv_cell_6_0= ruleCELL ) )* )
            {
            // InternalMyDsl.g:157:2: (otherlv_0= 'Column' ( (lv_letter_1_0= RULE_LETTER ) ) ( (lv_width_2_0= ruleWIDTH ) )? ( (lv_alignment_3_0= ruleALIGNMENT ) )? ( (lv_color_4_0= ruleCOLOR ) )? ( (lv_line_5_0= RULE_LINE ) )* ( (lv_cell_6_0= ruleCELL ) )* )
            // InternalMyDsl.g:158:3: otherlv_0= 'Column' ( (lv_letter_1_0= RULE_LETTER ) ) ( (lv_width_2_0= ruleWIDTH ) )? ( (lv_alignment_3_0= ruleALIGNMENT ) )? ( (lv_color_4_0= ruleCOLOR ) )? ( (lv_line_5_0= RULE_LINE ) )* ( (lv_cell_6_0= ruleCELL ) )*
            {
            otherlv_0=(Token)match(input,19,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getColumnAccess().getColumnKeyword_0());
            		
            // InternalMyDsl.g:162:3: ( (lv_letter_1_0= RULE_LETTER ) )
            // InternalMyDsl.g:163:4: (lv_letter_1_0= RULE_LETTER )
            {
            // InternalMyDsl.g:163:4: (lv_letter_1_0= RULE_LETTER )
            // InternalMyDsl.g:164:5: lv_letter_1_0= RULE_LETTER
            {
            lv_letter_1_0=(Token)match(input,RULE_LETTER,FOLLOW_8); 

            					newLeafNode(lv_letter_1_0, grammarAccess.getColumnAccess().getLetterLETTERTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getColumnRule());
            					}
            					setWithLastConsumed(
            						current,
            						"letter",
            						lv_letter_1_0,
            						"org.xtext.example.mydsl.MyDsl.LETTER");
            				

            }


            }

            // InternalMyDsl.g:180:3: ( (lv_width_2_0= ruleWIDTH ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==21) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:181:4: (lv_width_2_0= ruleWIDTH )
                    {
                    // InternalMyDsl.g:181:4: (lv_width_2_0= ruleWIDTH )
                    // InternalMyDsl.g:182:5: lv_width_2_0= ruleWIDTH
                    {

                    					newCompositeNode(grammarAccess.getColumnAccess().getWidthWIDTHParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_9);
                    lv_width_2_0=ruleWIDTH();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getColumnRule());
                    					}
                    					set(
                    						current,
                    						"width",
                    						lv_width_2_0,
                    						"org.xtext.example.mydsl.MyDsl.WIDTH");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalMyDsl.g:199:3: ( (lv_alignment_3_0= ruleALIGNMENT ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==23) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:200:4: (lv_alignment_3_0= ruleALIGNMENT )
                    {
                    // InternalMyDsl.g:200:4: (lv_alignment_3_0= ruleALIGNMENT )
                    // InternalMyDsl.g:201:5: lv_alignment_3_0= ruleALIGNMENT
                    {

                    					newCompositeNode(grammarAccess.getColumnAccess().getAlignmentALIGNMENTParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_10);
                    lv_alignment_3_0=ruleALIGNMENT();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getColumnRule());
                    					}
                    					set(
                    						current,
                    						"alignment",
                    						lv_alignment_3_0,
                    						"org.xtext.example.mydsl.MyDsl.ALIGNMENT");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalMyDsl.g:218:3: ( (lv_color_4_0= ruleCOLOR ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==24) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:219:4: (lv_color_4_0= ruleCOLOR )
                    {
                    // InternalMyDsl.g:219:4: (lv_color_4_0= ruleCOLOR )
                    // InternalMyDsl.g:220:5: lv_color_4_0= ruleCOLOR
                    {

                    					newCompositeNode(grammarAccess.getColumnAccess().getColorCOLORParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_11);
                    lv_color_4_0=ruleCOLOR();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getColumnRule());
                    					}
                    					set(
                    						current,
                    						"color",
                    						lv_color_4_0,
                    						"org.xtext.example.mydsl.MyDsl.COLOR");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalMyDsl.g:237:3: ( (lv_line_5_0= RULE_LINE ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_LINE) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMyDsl.g:238:4: (lv_line_5_0= RULE_LINE )
            	    {
            	    // InternalMyDsl.g:238:4: (lv_line_5_0= RULE_LINE )
            	    // InternalMyDsl.g:239:5: lv_line_5_0= RULE_LINE
            	    {
            	    lv_line_5_0=(Token)match(input,RULE_LINE,FOLLOW_11); 

            	    					newLeafNode(lv_line_5_0, grammarAccess.getColumnAccess().getLineLINETerminalRuleCall_5_0());
            	    				

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getColumnRule());
            	    					}
            	    					addWithLastConsumed(
            	    						current,
            	    						"line",
            	    						lv_line_5_0,
            	    						"org.xtext.example.mydsl.MyDsl.LINE");
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            // InternalMyDsl.g:255:3: ( (lv_cell_6_0= ruleCELL ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==25) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalMyDsl.g:256:4: (lv_cell_6_0= ruleCELL )
            	    {
            	    // InternalMyDsl.g:256:4: (lv_cell_6_0= ruleCELL )
            	    // InternalMyDsl.g:257:5: lv_cell_6_0= ruleCELL
            	    {

            	    					newCompositeNode(grammarAccess.getColumnAccess().getCellCELLParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_12);
            	    lv_cell_6_0=ruleCELL();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getColumnRule());
            	    					}
            	    					add(
            	    						current,
            	    						"cell",
            	    						lv_cell_6_0,
            	    						"org.xtext.example.mydsl.MyDsl.CELL");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleColumn"


    // $ANTLR start "entryRuleNrColumns"
    // InternalMyDsl.g:278:1: entryRuleNrColumns returns [EObject current=null] : iv_ruleNrColumns= ruleNrColumns EOF ;
    public final EObject entryRuleNrColumns() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNrColumns = null;


        try {
            // InternalMyDsl.g:278:50: (iv_ruleNrColumns= ruleNrColumns EOF )
            // InternalMyDsl.g:279:2: iv_ruleNrColumns= ruleNrColumns EOF
            {
             newCompositeNode(grammarAccess.getNrColumnsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNrColumns=ruleNrColumns();

            state._fsp--;

             current =iv_ruleNrColumns; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNrColumns"


    // $ANTLR start "ruleNrColumns"
    // InternalMyDsl.g:285:1: ruleNrColumns returns [EObject current=null] : (otherlv_0= 'Columns' ( (lv_Nr_1_0= RULE_INT ) ) ) ;
    public final EObject ruleNrColumns() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_Nr_1_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:291:2: ( (otherlv_0= 'Columns' ( (lv_Nr_1_0= RULE_INT ) ) ) )
            // InternalMyDsl.g:292:2: (otherlv_0= 'Columns' ( (lv_Nr_1_0= RULE_INT ) ) )
            {
            // InternalMyDsl.g:292:2: (otherlv_0= 'Columns' ( (lv_Nr_1_0= RULE_INT ) ) )
            // InternalMyDsl.g:293:3: otherlv_0= 'Columns' ( (lv_Nr_1_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getNrColumnsAccess().getColumnsKeyword_0());
            		
            // InternalMyDsl.g:297:3: ( (lv_Nr_1_0= RULE_INT ) )
            // InternalMyDsl.g:298:4: (lv_Nr_1_0= RULE_INT )
            {
            // InternalMyDsl.g:298:4: (lv_Nr_1_0= RULE_INT )
            // InternalMyDsl.g:299:5: lv_Nr_1_0= RULE_INT
            {
            lv_Nr_1_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_Nr_1_0, grammarAccess.getNrColumnsAccess().getNrINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNrColumnsRule());
            					}
            					addWithLastConsumed(
            						current,
            						"Nr",
            						lv_Nr_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNrColumns"


    // $ANTLR start "entryRuleWIDTH"
    // InternalMyDsl.g:319:1: entryRuleWIDTH returns [EObject current=null] : iv_ruleWIDTH= ruleWIDTH EOF ;
    public final EObject entryRuleWIDTH() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWIDTH = null;


        try {
            // InternalMyDsl.g:319:46: (iv_ruleWIDTH= ruleWIDTH EOF )
            // InternalMyDsl.g:320:2: iv_ruleWIDTH= ruleWIDTH EOF
            {
             newCompositeNode(grammarAccess.getWIDTHRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWIDTH=ruleWIDTH();

            state._fsp--;

             current =iv_ruleWIDTH; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWIDTH"


    // $ANTLR start "ruleWIDTH"
    // InternalMyDsl.g:326:1: ruleWIDTH returns [EObject current=null] : (otherlv_0= 'Width' ( (lv_number_1_0= RULE_INT ) ) otherlv_2= 'cm' ) ;
    public final EObject ruleWIDTH() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_number_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalMyDsl.g:332:2: ( (otherlv_0= 'Width' ( (lv_number_1_0= RULE_INT ) ) otherlv_2= 'cm' ) )
            // InternalMyDsl.g:333:2: (otherlv_0= 'Width' ( (lv_number_1_0= RULE_INT ) ) otherlv_2= 'cm' )
            {
            // InternalMyDsl.g:333:2: (otherlv_0= 'Width' ( (lv_number_1_0= RULE_INT ) ) otherlv_2= 'cm' )
            // InternalMyDsl.g:334:3: otherlv_0= 'Width' ( (lv_number_1_0= RULE_INT ) ) otherlv_2= 'cm'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getWIDTHAccess().getWidthKeyword_0());
            		
            // InternalMyDsl.g:338:3: ( (lv_number_1_0= RULE_INT ) )
            // InternalMyDsl.g:339:4: (lv_number_1_0= RULE_INT )
            {
            // InternalMyDsl.g:339:4: (lv_number_1_0= RULE_INT )
            // InternalMyDsl.g:340:5: lv_number_1_0= RULE_INT
            {
            lv_number_1_0=(Token)match(input,RULE_INT,FOLLOW_14); 

            					newLeafNode(lv_number_1_0, grammarAccess.getWIDTHAccess().getNumberINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getWIDTHRule());
            					}
            					setWithLastConsumed(
            						current,
            						"number",
            						lv_number_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_2=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getWIDTHAccess().getCmKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWIDTH"


    // $ANTLR start "entryRuleALIGNMENT"
    // InternalMyDsl.g:364:1: entryRuleALIGNMENT returns [EObject current=null] : iv_ruleALIGNMENT= ruleALIGNMENT EOF ;
    public final EObject entryRuleALIGNMENT() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleALIGNMENT = null;


        try {
            // InternalMyDsl.g:364:50: (iv_ruleALIGNMENT= ruleALIGNMENT EOF )
            // InternalMyDsl.g:365:2: iv_ruleALIGNMENT= ruleALIGNMENT EOF
            {
             newCompositeNode(grammarAccess.getALIGNMENTRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleALIGNMENT=ruleALIGNMENT();

            state._fsp--;

             current =iv_ruleALIGNMENT; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleALIGNMENT"


    // $ANTLR start "ruleALIGNMENT"
    // InternalMyDsl.g:371:1: ruleALIGNMENT returns [EObject current=null] : (otherlv_0= 'Alignment' ( (lv_position_1_0= RULE_POSITION ) ) ) ;
    public final EObject ruleALIGNMENT() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_position_1_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:377:2: ( (otherlv_0= 'Alignment' ( (lv_position_1_0= RULE_POSITION ) ) ) )
            // InternalMyDsl.g:378:2: (otherlv_0= 'Alignment' ( (lv_position_1_0= RULE_POSITION ) ) )
            {
            // InternalMyDsl.g:378:2: (otherlv_0= 'Alignment' ( (lv_position_1_0= RULE_POSITION ) ) )
            // InternalMyDsl.g:379:3: otherlv_0= 'Alignment' ( (lv_position_1_0= RULE_POSITION ) )
            {
            otherlv_0=(Token)match(input,23,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getALIGNMENTAccess().getAlignmentKeyword_0());
            		
            // InternalMyDsl.g:383:3: ( (lv_position_1_0= RULE_POSITION ) )
            // InternalMyDsl.g:384:4: (lv_position_1_0= RULE_POSITION )
            {
            // InternalMyDsl.g:384:4: (lv_position_1_0= RULE_POSITION )
            // InternalMyDsl.g:385:5: lv_position_1_0= RULE_POSITION
            {
            lv_position_1_0=(Token)match(input,RULE_POSITION,FOLLOW_2); 

            					newLeafNode(lv_position_1_0, grammarAccess.getALIGNMENTAccess().getPositionPOSITIONTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getALIGNMENTRule());
            					}
            					setWithLastConsumed(
            						current,
            						"position",
            						lv_position_1_0,
            						"org.xtext.example.mydsl.MyDsl.POSITION");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleALIGNMENT"


    // $ANTLR start "entryRuleCOLOR"
    // InternalMyDsl.g:405:1: entryRuleCOLOR returns [EObject current=null] : iv_ruleCOLOR= ruleCOLOR EOF ;
    public final EObject entryRuleCOLOR() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCOLOR = null;


        try {
            // InternalMyDsl.g:405:46: (iv_ruleCOLOR= ruleCOLOR EOF )
            // InternalMyDsl.g:406:2: iv_ruleCOLOR= ruleCOLOR EOF
            {
             newCompositeNode(grammarAccess.getCOLORRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCOLOR=ruleCOLOR();

            state._fsp--;

             current =iv_ruleCOLOR; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCOLOR"


    // $ANTLR start "ruleCOLOR"
    // InternalMyDsl.g:412:1: ruleCOLOR returns [EObject current=null] : (otherlv_0= 'Color' ( (lv_colorstring_1_0= RULE_COLORSTRING ) ) ) ;
    public final EObject ruleCOLOR() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_colorstring_1_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:418:2: ( (otherlv_0= 'Color' ( (lv_colorstring_1_0= RULE_COLORSTRING ) ) ) )
            // InternalMyDsl.g:419:2: (otherlv_0= 'Color' ( (lv_colorstring_1_0= RULE_COLORSTRING ) ) )
            {
            // InternalMyDsl.g:419:2: (otherlv_0= 'Color' ( (lv_colorstring_1_0= RULE_COLORSTRING ) ) )
            // InternalMyDsl.g:420:3: otherlv_0= 'Color' ( (lv_colorstring_1_0= RULE_COLORSTRING ) )
            {
            otherlv_0=(Token)match(input,24,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getCOLORAccess().getColorKeyword_0());
            		
            // InternalMyDsl.g:424:3: ( (lv_colorstring_1_0= RULE_COLORSTRING ) )
            // InternalMyDsl.g:425:4: (lv_colorstring_1_0= RULE_COLORSTRING )
            {
            // InternalMyDsl.g:425:4: (lv_colorstring_1_0= RULE_COLORSTRING )
            // InternalMyDsl.g:426:5: lv_colorstring_1_0= RULE_COLORSTRING
            {
            lv_colorstring_1_0=(Token)match(input,RULE_COLORSTRING,FOLLOW_2); 

            					newLeafNode(lv_colorstring_1_0, grammarAccess.getCOLORAccess().getColorstringCOLORSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCOLORRule());
            					}
            					setWithLastConsumed(
            						current,
            						"colorstring",
            						lv_colorstring_1_0,
            						"org.xtext.example.mydsl.MyDsl.COLORSTRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCOLOR"


    // $ANTLR start "entryRuleCELL"
    // InternalMyDsl.g:446:1: entryRuleCELL returns [EObject current=null] : iv_ruleCELL= ruleCELL EOF ;
    public final EObject entryRuleCELL() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCELL = null;


        try {
            // InternalMyDsl.g:446:45: (iv_ruleCELL= ruleCELL EOF )
            // InternalMyDsl.g:447:2: iv_ruleCELL= ruleCELL EOF
            {
             newCompositeNode(grammarAccess.getCELLRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCELL=ruleCELL();

            state._fsp--;

             current =iv_ruleCELL; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCELL"


    // $ANTLR start "ruleCELL"
    // InternalMyDsl.g:453:1: ruleCELL returns [EObject current=null] : (otherlv_0= 'Cell' ( (lv_number_1_0= RULE_INT ) ) ( (lv_color_2_0= ruleCOLOR ) )? ( (lv_value_3_0= ruleVALUE ) )? ) ;
    public final EObject ruleCELL() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_number_1_0=null;
        EObject lv_color_2_0 = null;

        EObject lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:459:2: ( (otherlv_0= 'Cell' ( (lv_number_1_0= RULE_INT ) ) ( (lv_color_2_0= ruleCOLOR ) )? ( (lv_value_3_0= ruleVALUE ) )? ) )
            // InternalMyDsl.g:460:2: (otherlv_0= 'Cell' ( (lv_number_1_0= RULE_INT ) ) ( (lv_color_2_0= ruleCOLOR ) )? ( (lv_value_3_0= ruleVALUE ) )? )
            {
            // InternalMyDsl.g:460:2: (otherlv_0= 'Cell' ( (lv_number_1_0= RULE_INT ) ) ( (lv_color_2_0= ruleCOLOR ) )? ( (lv_value_3_0= ruleVALUE ) )? )
            // InternalMyDsl.g:461:3: otherlv_0= 'Cell' ( (lv_number_1_0= RULE_INT ) ) ( (lv_color_2_0= ruleCOLOR ) )? ( (lv_value_3_0= ruleVALUE ) )?
            {
            otherlv_0=(Token)match(input,25,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getCELLAccess().getCellKeyword_0());
            		
            // InternalMyDsl.g:465:3: ( (lv_number_1_0= RULE_INT ) )
            // InternalMyDsl.g:466:4: (lv_number_1_0= RULE_INT )
            {
            // InternalMyDsl.g:466:4: (lv_number_1_0= RULE_INT )
            // InternalMyDsl.g:467:5: lv_number_1_0= RULE_INT
            {
            lv_number_1_0=(Token)match(input,RULE_INT,FOLLOW_17); 

            					newLeafNode(lv_number_1_0, grammarAccess.getCELLAccess().getNumberINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCELLRule());
            					}
            					setWithLastConsumed(
            						current,
            						"number",
            						lv_number_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalMyDsl.g:483:3: ( (lv_color_2_0= ruleCOLOR ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==24) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalMyDsl.g:484:4: (lv_color_2_0= ruleCOLOR )
                    {
                    // InternalMyDsl.g:484:4: (lv_color_2_0= ruleCOLOR )
                    // InternalMyDsl.g:485:5: lv_color_2_0= ruleCOLOR
                    {

                    					newCompositeNode(grammarAccess.getCELLAccess().getColorCOLORParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_18);
                    lv_color_2_0=ruleCOLOR();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getCELLRule());
                    					}
                    					set(
                    						current,
                    						"color",
                    						lv_color_2_0,
                    						"org.xtext.example.mydsl.MyDsl.COLOR");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalMyDsl.g:502:3: ( (lv_value_3_0= ruleVALUE ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==29) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalMyDsl.g:503:4: (lv_value_3_0= ruleVALUE )
                    {
                    // InternalMyDsl.g:503:4: (lv_value_3_0= ruleVALUE )
                    // InternalMyDsl.g:504:5: lv_value_3_0= ruleVALUE
                    {

                    					newCompositeNode(grammarAccess.getCELLAccess().getValueVALUEParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_value_3_0=ruleVALUE();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getCELLRule());
                    					}
                    					set(
                    						current,
                    						"value",
                    						lv_value_3_0,
                    						"org.xtext.example.mydsl.MyDsl.VALUE");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCELL"


    // $ANTLR start "entryRuleMATH"
    // InternalMyDsl.g:525:1: entryRuleMATH returns [String current=null] : iv_ruleMATH= ruleMATH EOF ;
    public final String entryRuleMATH() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMATH = null;


        try {
            // InternalMyDsl.g:525:44: (iv_ruleMATH= ruleMATH EOF )
            // InternalMyDsl.g:526:2: iv_ruleMATH= ruleMATH EOF
            {
             newCompositeNode(grammarAccess.getMATHRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMATH=ruleMATH();

            state._fsp--;

             current =iv_ruleMATH.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMATH"


    // $ANTLR start "ruleMATH"
    // InternalMyDsl.g:532:1: ruleMATH returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'sum' | kw= 'mean' | kw= 'median' ) ;
    public final AntlrDatatypeRuleToken ruleMATH() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyDsl.g:538:2: ( (kw= 'sum' | kw= 'mean' | kw= 'median' ) )
            // InternalMyDsl.g:539:2: (kw= 'sum' | kw= 'mean' | kw= 'median' )
            {
            // InternalMyDsl.g:539:2: (kw= 'sum' | kw= 'mean' | kw= 'median' )
            int alt9=3;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt9=1;
                }
                break;
            case 27:
                {
                alt9=2;
                }
                break;
            case 28:
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
                    // InternalMyDsl.g:540:3: kw= 'sum'
                    {
                    kw=(Token)match(input,26,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getMATHAccess().getSumKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:546:3: kw= 'mean'
                    {
                    kw=(Token)match(input,27,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getMATHAccess().getMeanKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:552:3: kw= 'median'
                    {
                    kw=(Token)match(input,28,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getMATHAccess().getMedianKeyword_2());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMATH"


    // $ANTLR start "entryRuleVALUE"
    // InternalMyDsl.g:561:1: entryRuleVALUE returns [EObject current=null] : iv_ruleVALUE= ruleVALUE EOF ;
    public final EObject entryRuleVALUE() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVALUE = null;


        try {
            // InternalMyDsl.g:561:46: (iv_ruleVALUE= ruleVALUE EOF )
            // InternalMyDsl.g:562:2: iv_ruleVALUE= ruleVALUE EOF
            {
             newCompositeNode(grammarAccess.getVALUERule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVALUE=ruleVALUE();

            state._fsp--;

             current =iv_ruleVALUE; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVALUE"


    // $ANTLR start "ruleVALUE"
    // InternalMyDsl.g:568:1: ruleVALUE returns [EObject current=null] : (otherlv_0= 'Value' ( ( (lv_string_1_0= RULE_STRING ) ) | ( (lv_expr_2_0= ruleADD ) ) | ( ( (lv_math_3_0= ruleMATH ) ) ( (lv_range_4_0= ruleCELLRANGE ) ) ) ) ) ;
    public final EObject ruleVALUE() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_string_1_0=null;
        EObject lv_expr_2_0 = null;

        AntlrDatatypeRuleToken lv_math_3_0 = null;

        EObject lv_range_4_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:574:2: ( (otherlv_0= 'Value' ( ( (lv_string_1_0= RULE_STRING ) ) | ( (lv_expr_2_0= ruleADD ) ) | ( ( (lv_math_3_0= ruleMATH ) ) ( (lv_range_4_0= ruleCELLRANGE ) ) ) ) ) )
            // InternalMyDsl.g:575:2: (otherlv_0= 'Value' ( ( (lv_string_1_0= RULE_STRING ) ) | ( (lv_expr_2_0= ruleADD ) ) | ( ( (lv_math_3_0= ruleMATH ) ) ( (lv_range_4_0= ruleCELLRANGE ) ) ) ) )
            {
            // InternalMyDsl.g:575:2: (otherlv_0= 'Value' ( ( (lv_string_1_0= RULE_STRING ) ) | ( (lv_expr_2_0= ruleADD ) ) | ( ( (lv_math_3_0= ruleMATH ) ) ( (lv_range_4_0= ruleCELLRANGE ) ) ) ) )
            // InternalMyDsl.g:576:3: otherlv_0= 'Value' ( ( (lv_string_1_0= RULE_STRING ) ) | ( (lv_expr_2_0= ruleADD ) ) | ( ( (lv_math_3_0= ruleMATH ) ) ( (lv_range_4_0= ruleCELLRANGE ) ) ) )
            {
            otherlv_0=(Token)match(input,29,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getVALUEAccess().getValueKeyword_0());
            		
            // InternalMyDsl.g:580:3: ( ( (lv_string_1_0= RULE_STRING ) ) | ( (lv_expr_2_0= ruleADD ) ) | ( ( (lv_math_3_0= ruleMATH ) ) ( (lv_range_4_0= ruleCELLRANGE ) ) ) )
            int alt10=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt10=1;
                }
                break;
            case RULE_INT:
            case RULE_CELLREF:
            case 34:
                {
                alt10=2;
                }
                break;
            case 26:
            case 27:
            case 28:
                {
                alt10=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalMyDsl.g:581:4: ( (lv_string_1_0= RULE_STRING ) )
                    {
                    // InternalMyDsl.g:581:4: ( (lv_string_1_0= RULE_STRING ) )
                    // InternalMyDsl.g:582:5: (lv_string_1_0= RULE_STRING )
                    {
                    // InternalMyDsl.g:582:5: (lv_string_1_0= RULE_STRING )
                    // InternalMyDsl.g:583:6: lv_string_1_0= RULE_STRING
                    {
                    lv_string_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_string_1_0, grammarAccess.getVALUEAccess().getStringSTRINGTerminalRuleCall_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getVALUERule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"string",
                    							lv_string_1_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:600:4: ( (lv_expr_2_0= ruleADD ) )
                    {
                    // InternalMyDsl.g:600:4: ( (lv_expr_2_0= ruleADD ) )
                    // InternalMyDsl.g:601:5: (lv_expr_2_0= ruleADD )
                    {
                    // InternalMyDsl.g:601:5: (lv_expr_2_0= ruleADD )
                    // InternalMyDsl.g:602:6: lv_expr_2_0= ruleADD
                    {

                    						newCompositeNode(grammarAccess.getVALUEAccess().getExprADDParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_expr_2_0=ruleADD();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getVALUERule());
                    						}
                    						set(
                    							current,
                    							"expr",
                    							lv_expr_2_0,
                    							"org.xtext.example.mydsl.MyDsl.ADD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:620:4: ( ( (lv_math_3_0= ruleMATH ) ) ( (lv_range_4_0= ruleCELLRANGE ) ) )
                    {
                    // InternalMyDsl.g:620:4: ( ( (lv_math_3_0= ruleMATH ) ) ( (lv_range_4_0= ruleCELLRANGE ) ) )
                    // InternalMyDsl.g:621:5: ( (lv_math_3_0= ruleMATH ) ) ( (lv_range_4_0= ruleCELLRANGE ) )
                    {
                    // InternalMyDsl.g:621:5: ( (lv_math_3_0= ruleMATH ) )
                    // InternalMyDsl.g:622:6: (lv_math_3_0= ruleMATH )
                    {
                    // InternalMyDsl.g:622:6: (lv_math_3_0= ruleMATH )
                    // InternalMyDsl.g:623:7: lv_math_3_0= ruleMATH
                    {

                    							newCompositeNode(grammarAccess.getVALUEAccess().getMathMATHParserRuleCall_1_2_0_0());
                    						
                    pushFollow(FOLLOW_20);
                    lv_math_3_0=ruleMATH();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getVALUERule());
                    							}
                    							set(
                    								current,
                    								"math",
                    								lv_math_3_0,
                    								"org.xtext.example.mydsl.MyDsl.MATH");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    // InternalMyDsl.g:640:5: ( (lv_range_4_0= ruleCELLRANGE ) )
                    // InternalMyDsl.g:641:6: (lv_range_4_0= ruleCELLRANGE )
                    {
                    // InternalMyDsl.g:641:6: (lv_range_4_0= ruleCELLRANGE )
                    // InternalMyDsl.g:642:7: lv_range_4_0= ruleCELLRANGE
                    {

                    							newCompositeNode(grammarAccess.getVALUEAccess().getRangeCELLRANGEParserRuleCall_1_2_1_0());
                    						
                    pushFollow(FOLLOW_2);
                    lv_range_4_0=ruleCELLRANGE();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getVALUERule());
                    							}
                    							set(
                    								current,
                    								"range",
                    								lv_range_4_0,
                    								"org.xtext.example.mydsl.MyDsl.CELLRANGE");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVALUE"


    // $ANTLR start "entryRuleADD"
    // InternalMyDsl.g:665:1: entryRuleADD returns [EObject current=null] : iv_ruleADD= ruleADD EOF ;
    public final EObject entryRuleADD() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleADD = null;


        try {
            // InternalMyDsl.g:665:44: (iv_ruleADD= ruleADD EOF )
            // InternalMyDsl.g:666:2: iv_ruleADD= ruleADD EOF
            {
             newCompositeNode(grammarAccess.getADDRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleADD=ruleADD();

            state._fsp--;

             current =iv_ruleADD; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleADD"


    // $ANTLR start "ruleADD"
    // InternalMyDsl.g:672:1: ruleADD returns [EObject current=null] : ( ( (lv_sub1_0_0= ruleSUB ) ) (otherlv_1= '+' ( (lv_sub2_2_0= ruleSUB ) ) )* ) ;
    public final EObject ruleADD() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_sub1_0_0 = null;

        EObject lv_sub2_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:678:2: ( ( ( (lv_sub1_0_0= ruleSUB ) ) (otherlv_1= '+' ( (lv_sub2_2_0= ruleSUB ) ) )* ) )
            // InternalMyDsl.g:679:2: ( ( (lv_sub1_0_0= ruleSUB ) ) (otherlv_1= '+' ( (lv_sub2_2_0= ruleSUB ) ) )* )
            {
            // InternalMyDsl.g:679:2: ( ( (lv_sub1_0_0= ruleSUB ) ) (otherlv_1= '+' ( (lv_sub2_2_0= ruleSUB ) ) )* )
            // InternalMyDsl.g:680:3: ( (lv_sub1_0_0= ruleSUB ) ) (otherlv_1= '+' ( (lv_sub2_2_0= ruleSUB ) ) )*
            {
            // InternalMyDsl.g:680:3: ( (lv_sub1_0_0= ruleSUB ) )
            // InternalMyDsl.g:681:4: (lv_sub1_0_0= ruleSUB )
            {
            // InternalMyDsl.g:681:4: (lv_sub1_0_0= ruleSUB )
            // InternalMyDsl.g:682:5: lv_sub1_0_0= ruleSUB
            {

            					newCompositeNode(grammarAccess.getADDAccess().getSub1SUBParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_21);
            lv_sub1_0_0=ruleSUB();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getADDRule());
            					}
            					set(
            						current,
            						"sub1",
            						lv_sub1_0_0,
            						"org.xtext.example.mydsl.MyDsl.SUB");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:699:3: (otherlv_1= '+' ( (lv_sub2_2_0= ruleSUB ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==30) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalMyDsl.g:700:4: otherlv_1= '+' ( (lv_sub2_2_0= ruleSUB ) )
            	    {
            	    otherlv_1=(Token)match(input,30,FOLLOW_22); 

            	    				newLeafNode(otherlv_1, grammarAccess.getADDAccess().getPlusSignKeyword_1_0());
            	    			
            	    // InternalMyDsl.g:704:4: ( (lv_sub2_2_0= ruleSUB ) )
            	    // InternalMyDsl.g:705:5: (lv_sub2_2_0= ruleSUB )
            	    {
            	    // InternalMyDsl.g:705:5: (lv_sub2_2_0= ruleSUB )
            	    // InternalMyDsl.g:706:6: lv_sub2_2_0= ruleSUB
            	    {

            	    						newCompositeNode(grammarAccess.getADDAccess().getSub2SUBParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_21);
            	    lv_sub2_2_0=ruleSUB();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getADDRule());
            	    						}
            	    						add(
            	    							current,
            	    							"sub2",
            	    							lv_sub2_2_0,
            	    							"org.xtext.example.mydsl.MyDsl.SUB");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleADD"


    // $ANTLR start "entryRuleSUB"
    // InternalMyDsl.g:728:1: entryRuleSUB returns [EObject current=null] : iv_ruleSUB= ruleSUB EOF ;
    public final EObject entryRuleSUB() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSUB = null;


        try {
            // InternalMyDsl.g:728:44: (iv_ruleSUB= ruleSUB EOF )
            // InternalMyDsl.g:729:2: iv_ruleSUB= ruleSUB EOF
            {
             newCompositeNode(grammarAccess.getSUBRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSUB=ruleSUB();

            state._fsp--;

             current =iv_ruleSUB; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSUB"


    // $ANTLR start "ruleSUB"
    // InternalMyDsl.g:735:1: ruleSUB returns [EObject current=null] : ( ( (lv_mult1_0_0= ruleMULT ) ) (otherlv_1= '-' ( (lv_mult2_2_0= ruleMULT ) ) )* ) ;
    public final EObject ruleSUB() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_mult1_0_0 = null;

        EObject lv_mult2_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:741:2: ( ( ( (lv_mult1_0_0= ruleMULT ) ) (otherlv_1= '-' ( (lv_mult2_2_0= ruleMULT ) ) )* ) )
            // InternalMyDsl.g:742:2: ( ( (lv_mult1_0_0= ruleMULT ) ) (otherlv_1= '-' ( (lv_mult2_2_0= ruleMULT ) ) )* )
            {
            // InternalMyDsl.g:742:2: ( ( (lv_mult1_0_0= ruleMULT ) ) (otherlv_1= '-' ( (lv_mult2_2_0= ruleMULT ) ) )* )
            // InternalMyDsl.g:743:3: ( (lv_mult1_0_0= ruleMULT ) ) (otherlv_1= '-' ( (lv_mult2_2_0= ruleMULT ) ) )*
            {
            // InternalMyDsl.g:743:3: ( (lv_mult1_0_0= ruleMULT ) )
            // InternalMyDsl.g:744:4: (lv_mult1_0_0= ruleMULT )
            {
            // InternalMyDsl.g:744:4: (lv_mult1_0_0= ruleMULT )
            // InternalMyDsl.g:745:5: lv_mult1_0_0= ruleMULT
            {

            					newCompositeNode(grammarAccess.getSUBAccess().getMult1MULTParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_23);
            lv_mult1_0_0=ruleMULT();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSUBRule());
            					}
            					set(
            						current,
            						"mult1",
            						lv_mult1_0_0,
            						"org.xtext.example.mydsl.MyDsl.MULT");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:762:3: (otherlv_1= '-' ( (lv_mult2_2_0= ruleMULT ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==31) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalMyDsl.g:763:4: otherlv_1= '-' ( (lv_mult2_2_0= ruleMULT ) )
            	    {
            	    otherlv_1=(Token)match(input,31,FOLLOW_22); 

            	    				newLeafNode(otherlv_1, grammarAccess.getSUBAccess().getHyphenMinusKeyword_1_0());
            	    			
            	    // InternalMyDsl.g:767:4: ( (lv_mult2_2_0= ruleMULT ) )
            	    // InternalMyDsl.g:768:5: (lv_mult2_2_0= ruleMULT )
            	    {
            	    // InternalMyDsl.g:768:5: (lv_mult2_2_0= ruleMULT )
            	    // InternalMyDsl.g:769:6: lv_mult2_2_0= ruleMULT
            	    {

            	    						newCompositeNode(grammarAccess.getSUBAccess().getMult2MULTParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_23);
            	    lv_mult2_2_0=ruleMULT();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getSUBRule());
            	    						}
            	    						add(
            	    							current,
            	    							"mult2",
            	    							lv_mult2_2_0,
            	    							"org.xtext.example.mydsl.MyDsl.MULT");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSUB"


    // $ANTLR start "entryRuleMULT"
    // InternalMyDsl.g:791:1: entryRuleMULT returns [EObject current=null] : iv_ruleMULT= ruleMULT EOF ;
    public final EObject entryRuleMULT() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMULT = null;


        try {
            // InternalMyDsl.g:791:45: (iv_ruleMULT= ruleMULT EOF )
            // InternalMyDsl.g:792:2: iv_ruleMULT= ruleMULT EOF
            {
             newCompositeNode(grammarAccess.getMULTRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMULT=ruleMULT();

            state._fsp--;

             current =iv_ruleMULT; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMULT"


    // $ANTLR start "ruleMULT"
    // InternalMyDsl.g:798:1: ruleMULT returns [EObject current=null] : ( ( (lv_divid1_0_0= ruleDIVID ) ) (otherlv_1= '*' ( (lv_divid2_2_0= ruleDIVID ) ) )* ) ;
    public final EObject ruleMULT() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_divid1_0_0 = null;

        EObject lv_divid2_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:804:2: ( ( ( (lv_divid1_0_0= ruleDIVID ) ) (otherlv_1= '*' ( (lv_divid2_2_0= ruleDIVID ) ) )* ) )
            // InternalMyDsl.g:805:2: ( ( (lv_divid1_0_0= ruleDIVID ) ) (otherlv_1= '*' ( (lv_divid2_2_0= ruleDIVID ) ) )* )
            {
            // InternalMyDsl.g:805:2: ( ( (lv_divid1_0_0= ruleDIVID ) ) (otherlv_1= '*' ( (lv_divid2_2_0= ruleDIVID ) ) )* )
            // InternalMyDsl.g:806:3: ( (lv_divid1_0_0= ruleDIVID ) ) (otherlv_1= '*' ( (lv_divid2_2_0= ruleDIVID ) ) )*
            {
            // InternalMyDsl.g:806:3: ( (lv_divid1_0_0= ruleDIVID ) )
            // InternalMyDsl.g:807:4: (lv_divid1_0_0= ruleDIVID )
            {
            // InternalMyDsl.g:807:4: (lv_divid1_0_0= ruleDIVID )
            // InternalMyDsl.g:808:5: lv_divid1_0_0= ruleDIVID
            {

            					newCompositeNode(grammarAccess.getMULTAccess().getDivid1DIVIDParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_24);
            lv_divid1_0_0=ruleDIVID();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMULTRule());
            					}
            					set(
            						current,
            						"divid1",
            						lv_divid1_0_0,
            						"org.xtext.example.mydsl.MyDsl.DIVID");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:825:3: (otherlv_1= '*' ( (lv_divid2_2_0= ruleDIVID ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==32) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalMyDsl.g:826:4: otherlv_1= '*' ( (lv_divid2_2_0= ruleDIVID ) )
            	    {
            	    otherlv_1=(Token)match(input,32,FOLLOW_22); 

            	    				newLeafNode(otherlv_1, grammarAccess.getMULTAccess().getAsteriskKeyword_1_0());
            	    			
            	    // InternalMyDsl.g:830:4: ( (lv_divid2_2_0= ruleDIVID ) )
            	    // InternalMyDsl.g:831:5: (lv_divid2_2_0= ruleDIVID )
            	    {
            	    // InternalMyDsl.g:831:5: (lv_divid2_2_0= ruleDIVID )
            	    // InternalMyDsl.g:832:6: lv_divid2_2_0= ruleDIVID
            	    {

            	    						newCompositeNode(grammarAccess.getMULTAccess().getDivid2DIVIDParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_24);
            	    lv_divid2_2_0=ruleDIVID();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMULTRule());
            	    						}
            	    						add(
            	    							current,
            	    							"divid2",
            	    							lv_divid2_2_0,
            	    							"org.xtext.example.mydsl.MyDsl.DIVID");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMULT"


    // $ANTLR start "entryRuleDIVID"
    // InternalMyDsl.g:854:1: entryRuleDIVID returns [EObject current=null] : iv_ruleDIVID= ruleDIVID EOF ;
    public final EObject entryRuleDIVID() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDIVID = null;


        try {
            // InternalMyDsl.g:854:46: (iv_ruleDIVID= ruleDIVID EOF )
            // InternalMyDsl.g:855:2: iv_ruleDIVID= ruleDIVID EOF
            {
             newCompositeNode(grammarAccess.getDIVIDRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDIVID=ruleDIVID();

            state._fsp--;

             current =iv_ruleDIVID; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDIVID"


    // $ANTLR start "ruleDIVID"
    // InternalMyDsl.g:861:1: ruleDIVID returns [EObject current=null] : ( ( (lv_prim1_0_0= rulePRIM ) ) (otherlv_1= '/' ( (lv_prim2_2_0= rulePRIM ) ) )* ) ;
    public final EObject ruleDIVID() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_prim1_0_0 = null;

        EObject lv_prim2_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:867:2: ( ( ( (lv_prim1_0_0= rulePRIM ) ) (otherlv_1= '/' ( (lv_prim2_2_0= rulePRIM ) ) )* ) )
            // InternalMyDsl.g:868:2: ( ( (lv_prim1_0_0= rulePRIM ) ) (otherlv_1= '/' ( (lv_prim2_2_0= rulePRIM ) ) )* )
            {
            // InternalMyDsl.g:868:2: ( ( (lv_prim1_0_0= rulePRIM ) ) (otherlv_1= '/' ( (lv_prim2_2_0= rulePRIM ) ) )* )
            // InternalMyDsl.g:869:3: ( (lv_prim1_0_0= rulePRIM ) ) (otherlv_1= '/' ( (lv_prim2_2_0= rulePRIM ) ) )*
            {
            // InternalMyDsl.g:869:3: ( (lv_prim1_0_0= rulePRIM ) )
            // InternalMyDsl.g:870:4: (lv_prim1_0_0= rulePRIM )
            {
            // InternalMyDsl.g:870:4: (lv_prim1_0_0= rulePRIM )
            // InternalMyDsl.g:871:5: lv_prim1_0_0= rulePRIM
            {

            					newCompositeNode(grammarAccess.getDIVIDAccess().getPrim1PRIMParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_25);
            lv_prim1_0_0=rulePRIM();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDIVIDRule());
            					}
            					set(
            						current,
            						"prim1",
            						lv_prim1_0_0,
            						"org.xtext.example.mydsl.MyDsl.PRIM");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:888:3: (otherlv_1= '/' ( (lv_prim2_2_0= rulePRIM ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==33) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalMyDsl.g:889:4: otherlv_1= '/' ( (lv_prim2_2_0= rulePRIM ) )
            	    {
            	    otherlv_1=(Token)match(input,33,FOLLOW_22); 

            	    				newLeafNode(otherlv_1, grammarAccess.getDIVIDAccess().getSolidusKeyword_1_0());
            	    			
            	    // InternalMyDsl.g:893:4: ( (lv_prim2_2_0= rulePRIM ) )
            	    // InternalMyDsl.g:894:5: (lv_prim2_2_0= rulePRIM )
            	    {
            	    // InternalMyDsl.g:894:5: (lv_prim2_2_0= rulePRIM )
            	    // InternalMyDsl.g:895:6: lv_prim2_2_0= rulePRIM
            	    {

            	    						newCompositeNode(grammarAccess.getDIVIDAccess().getPrim2PRIMParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_25);
            	    lv_prim2_2_0=rulePRIM();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getDIVIDRule());
            	    						}
            	    						add(
            	    							current,
            	    							"prim2",
            	    							lv_prim2_2_0,
            	    							"org.xtext.example.mydsl.MyDsl.PRIM");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDIVID"


    // $ANTLR start "entryRulePRIM"
    // InternalMyDsl.g:917:1: entryRulePRIM returns [EObject current=null] : iv_rulePRIM= rulePRIM EOF ;
    public final EObject entryRulePRIM() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePRIM = null;


        try {
            // InternalMyDsl.g:917:45: (iv_rulePRIM= rulePRIM EOF )
            // InternalMyDsl.g:918:2: iv_rulePRIM= rulePRIM EOF
            {
             newCompositeNode(grammarAccess.getPRIMRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePRIM=rulePRIM();

            state._fsp--;

             current =iv_rulePRIM; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePRIM"


    // $ANTLR start "rulePRIM"
    // InternalMyDsl.g:924:1: rulePRIM returns [EObject current=null] : ( ( (lv_mathunit_0_0= ruleMATHUNIT ) ) | (otherlv_1= '(' ( (lv_add_2_0= ruleADD ) ) otherlv_3= ')' ) ) ;
    public final EObject rulePRIM() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_mathunit_0_0 = null;

        EObject lv_add_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:930:2: ( ( ( (lv_mathunit_0_0= ruleMATHUNIT ) ) | (otherlv_1= '(' ( (lv_add_2_0= ruleADD ) ) otherlv_3= ')' ) ) )
            // InternalMyDsl.g:931:2: ( ( (lv_mathunit_0_0= ruleMATHUNIT ) ) | (otherlv_1= '(' ( (lv_add_2_0= ruleADD ) ) otherlv_3= ')' ) )
            {
            // InternalMyDsl.g:931:2: ( ( (lv_mathunit_0_0= ruleMATHUNIT ) ) | (otherlv_1= '(' ( (lv_add_2_0= ruleADD ) ) otherlv_3= ')' ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_INT||LA15_0==RULE_CELLREF) ) {
                alt15=1;
            }
            else if ( (LA15_0==34) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalMyDsl.g:932:3: ( (lv_mathunit_0_0= ruleMATHUNIT ) )
                    {
                    // InternalMyDsl.g:932:3: ( (lv_mathunit_0_0= ruleMATHUNIT ) )
                    // InternalMyDsl.g:933:4: (lv_mathunit_0_0= ruleMATHUNIT )
                    {
                    // InternalMyDsl.g:933:4: (lv_mathunit_0_0= ruleMATHUNIT )
                    // InternalMyDsl.g:934:5: lv_mathunit_0_0= ruleMATHUNIT
                    {

                    					newCompositeNode(grammarAccess.getPRIMAccess().getMathunitMATHUNITParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_mathunit_0_0=ruleMATHUNIT();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getPRIMRule());
                    					}
                    					set(
                    						current,
                    						"mathunit",
                    						lv_mathunit_0_0,
                    						"org.xtext.example.mydsl.MyDsl.MATHUNIT");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:952:3: (otherlv_1= '(' ( (lv_add_2_0= ruleADD ) ) otherlv_3= ')' )
                    {
                    // InternalMyDsl.g:952:3: (otherlv_1= '(' ( (lv_add_2_0= ruleADD ) ) otherlv_3= ')' )
                    // InternalMyDsl.g:953:4: otherlv_1= '(' ( (lv_add_2_0= ruleADD ) ) otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,34,FOLLOW_22); 

                    				newLeafNode(otherlv_1, grammarAccess.getPRIMAccess().getLeftParenthesisKeyword_1_0());
                    			
                    // InternalMyDsl.g:957:4: ( (lv_add_2_0= ruleADD ) )
                    // InternalMyDsl.g:958:5: (lv_add_2_0= ruleADD )
                    {
                    // InternalMyDsl.g:958:5: (lv_add_2_0= ruleADD )
                    // InternalMyDsl.g:959:6: lv_add_2_0= ruleADD
                    {

                    						newCompositeNode(grammarAccess.getPRIMAccess().getAddADDParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_26);
                    lv_add_2_0=ruleADD();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPRIMRule());
                    						}
                    						set(
                    							current,
                    							"add",
                    							lv_add_2_0,
                    							"org.xtext.example.mydsl.MyDsl.ADD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_3=(Token)match(input,35,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getPRIMAccess().getRightParenthesisKeyword_1_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePRIM"


    // $ANTLR start "entryRuleCELLRANGE"
    // InternalMyDsl.g:985:1: entryRuleCELLRANGE returns [EObject current=null] : iv_ruleCELLRANGE= ruleCELLRANGE EOF ;
    public final EObject entryRuleCELLRANGE() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCELLRANGE = null;


        try {
            // InternalMyDsl.g:985:50: (iv_ruleCELLRANGE= ruleCELLRANGE EOF )
            // InternalMyDsl.g:986:2: iv_ruleCELLRANGE= ruleCELLRANGE EOF
            {
             newCompositeNode(grammarAccess.getCELLRANGERule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCELLRANGE=ruleCELLRANGE();

            state._fsp--;

             current =iv_ruleCELLRANGE; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCELLRANGE"


    // $ANTLR start "ruleCELLRANGE"
    // InternalMyDsl.g:992:1: ruleCELLRANGE returns [EObject current=null] : ( ( (lv_rangestart_0_0= RULE_CELLREF ) ) otherlv_1= ':' ( (lv_rangeend_2_0= RULE_CELLREF ) ) ) ;
    public final EObject ruleCELLRANGE() throws RecognitionException {
        EObject current = null;

        Token lv_rangestart_0_0=null;
        Token otherlv_1=null;
        Token lv_rangeend_2_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:998:2: ( ( ( (lv_rangestart_0_0= RULE_CELLREF ) ) otherlv_1= ':' ( (lv_rangeend_2_0= RULE_CELLREF ) ) ) )
            // InternalMyDsl.g:999:2: ( ( (lv_rangestart_0_0= RULE_CELLREF ) ) otherlv_1= ':' ( (lv_rangeend_2_0= RULE_CELLREF ) ) )
            {
            // InternalMyDsl.g:999:2: ( ( (lv_rangestart_0_0= RULE_CELLREF ) ) otherlv_1= ':' ( (lv_rangeend_2_0= RULE_CELLREF ) ) )
            // InternalMyDsl.g:1000:3: ( (lv_rangestart_0_0= RULE_CELLREF ) ) otherlv_1= ':' ( (lv_rangeend_2_0= RULE_CELLREF ) )
            {
            // InternalMyDsl.g:1000:3: ( (lv_rangestart_0_0= RULE_CELLREF ) )
            // InternalMyDsl.g:1001:4: (lv_rangestart_0_0= RULE_CELLREF )
            {
            // InternalMyDsl.g:1001:4: (lv_rangestart_0_0= RULE_CELLREF )
            // InternalMyDsl.g:1002:5: lv_rangestart_0_0= RULE_CELLREF
            {
            lv_rangestart_0_0=(Token)match(input,RULE_CELLREF,FOLLOW_27); 

            					newLeafNode(lv_rangestart_0_0, grammarAccess.getCELLRANGEAccess().getRangestartCELLREFTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCELLRANGERule());
            					}
            					setWithLastConsumed(
            						current,
            						"rangestart",
            						lv_rangestart_0_0,
            						"org.xtext.example.mydsl.MyDsl.CELLREF");
            				

            }


            }

            otherlv_1=(Token)match(input,36,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getCELLRANGEAccess().getColonKeyword_1());
            		
            // InternalMyDsl.g:1022:3: ( (lv_rangeend_2_0= RULE_CELLREF ) )
            // InternalMyDsl.g:1023:4: (lv_rangeend_2_0= RULE_CELLREF )
            {
            // InternalMyDsl.g:1023:4: (lv_rangeend_2_0= RULE_CELLREF )
            // InternalMyDsl.g:1024:5: lv_rangeend_2_0= RULE_CELLREF
            {
            lv_rangeend_2_0=(Token)match(input,RULE_CELLREF,FOLLOW_2); 

            					newLeafNode(lv_rangeend_2_0, grammarAccess.getCELLRANGEAccess().getRangeendCELLREFTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCELLRANGERule());
            					}
            					setWithLastConsumed(
            						current,
            						"rangeend",
            						lv_rangeend_2_0,
            						"org.xtext.example.mydsl.MyDsl.CELLREF");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCELLRANGE"


    // $ANTLR start "entryRuleMATHUNIT"
    // InternalMyDsl.g:1044:1: entryRuleMATHUNIT returns [EObject current=null] : iv_ruleMATHUNIT= ruleMATHUNIT EOF ;
    public final EObject entryRuleMATHUNIT() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMATHUNIT = null;


        try {
            // InternalMyDsl.g:1044:49: (iv_ruleMATHUNIT= ruleMATHUNIT EOF )
            // InternalMyDsl.g:1045:2: iv_ruleMATHUNIT= ruleMATHUNIT EOF
            {
             newCompositeNode(grammarAccess.getMATHUNITRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMATHUNIT=ruleMATHUNIT();

            state._fsp--;

             current =iv_ruleMATHUNIT; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMATHUNIT"


    // $ANTLR start "ruleMATHUNIT"
    // InternalMyDsl.g:1051:1: ruleMATHUNIT returns [EObject current=null] : ( ( (lv_number_0_0= RULE_INT ) ) | ( (lv_cellref_1_0= RULE_CELLREF ) ) ) ;
    public final EObject ruleMATHUNIT() throws RecognitionException {
        EObject current = null;

        Token lv_number_0_0=null;
        Token lv_cellref_1_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1057:2: ( ( ( (lv_number_0_0= RULE_INT ) ) | ( (lv_cellref_1_0= RULE_CELLREF ) ) ) )
            // InternalMyDsl.g:1058:2: ( ( (lv_number_0_0= RULE_INT ) ) | ( (lv_cellref_1_0= RULE_CELLREF ) ) )
            {
            // InternalMyDsl.g:1058:2: ( ( (lv_number_0_0= RULE_INT ) ) | ( (lv_cellref_1_0= RULE_CELLREF ) ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_INT) ) {
                alt16=1;
            }
            else if ( (LA16_0==RULE_CELLREF) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalMyDsl.g:1059:3: ( (lv_number_0_0= RULE_INT ) )
                    {
                    // InternalMyDsl.g:1059:3: ( (lv_number_0_0= RULE_INT ) )
                    // InternalMyDsl.g:1060:4: (lv_number_0_0= RULE_INT )
                    {
                    // InternalMyDsl.g:1060:4: (lv_number_0_0= RULE_INT )
                    // InternalMyDsl.g:1061:5: lv_number_0_0= RULE_INT
                    {
                    lv_number_0_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    					newLeafNode(lv_number_0_0, grammarAccess.getMATHUNITAccess().getNumberINTTerminalRuleCall_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMATHUNITRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"number",
                    						lv_number_0_0,
                    						"org.eclipse.xtext.common.Terminals.INT");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1078:3: ( (lv_cellref_1_0= RULE_CELLREF ) )
                    {
                    // InternalMyDsl.g:1078:3: ( (lv_cellref_1_0= RULE_CELLREF ) )
                    // InternalMyDsl.g:1079:4: (lv_cellref_1_0= RULE_CELLREF )
                    {
                    // InternalMyDsl.g:1079:4: (lv_cellref_1_0= RULE_CELLREF )
                    // InternalMyDsl.g:1080:5: lv_cellref_1_0= RULE_CELLREF
                    {
                    lv_cellref_1_0=(Token)match(input,RULE_CELLREF,FOLLOW_2); 

                    					newLeafNode(lv_cellref_1_0, grammarAccess.getMATHUNITAccess().getCellrefCELLREFTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMATHUNITRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"cellref",
                    						lv_cellref_1_0,
                    						"org.xtext.example.mydsl.MyDsl.CELLREF");
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMATHUNIT"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000003A00042L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000003800042L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000003000042L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000002000042L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000021000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x000000041C000C80L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000400000880L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000001000000000L});

}