package org.waml.w3c.webidl.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.waml.w3c.webidl.services.WebIDLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalWebIDLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "';'", "'typedef'", "'[]'", "'unsigned'", "'void'", "'boolean'", "'byte'", "'double'", "'float'", "'short'", "'long'", "'Object'", "'object'", "'any'", "'octet'", "'DOMString'", "'?'", "'sequence<'", "'>'", "'::'", "'Constructor'", "'('", "','", "')'", "'NamedConstructor'", "'='", "'Callback'", "'FunctionOnly'", "'PropertyOnly'", "'NoInterfaceObject'", "'OverrideBuiltins'", "'PrototypeRoot'", "'PutForwards'", "'TreatNullAs'", "'EmptyString'", "'TreatUndefinedAs'", "'null'", "'AllowAny'", "'Replaceable'", "'Supplemental'", "'ReplaceableNamedProperties'", "'implements'", "'['", "']'", "'module'", "'{'", "'}'", "'Prefix'", "'NamespaceObject'", "'interface'", "':'", "'stringifier'", "'omittable'", "'raises'", "'getter'", "'setter'", "'creator'", "'deleter'", "'caller'", "'readonly'", "'attribute'", "'getraises'", "'setraises'", "'exception'", "'in'", "'optional'", "'...'", "'const'", "'0x'"
    };
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int RULE_ID=5;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__64=64;
    public static final int T__29=29;
    public static final int T__65=65;
    public static final int T__28=28;
    public static final int T__62=62;
    public static final int T__27=27;
    public static final int T__63=63;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int T__61=61;
    public static final int T__60=60;
    public static final int EOF=-1;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__19=19;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__16=16;
    public static final int T__52=52;
    public static final int T__15=15;
    public static final int T__53=53;
    public static final int T__18=18;
    public static final int T__54=54;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int T__59=59;
    public static final int RULE_INT=6;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__80=80;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=4;
    public static final int T__32=32;
    public static final int T__71=71;
    public static final int T__33=33;
    public static final int T__72=72;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__70=70;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=9;
    public static final int T__76=76;
    public static final int T__75=75;
    public static final int T__74=74;
    public static final int T__73=73;
    public static final int T__79=79;
    public static final int T__78=78;
    public static final int T__77=77;

    // delegates
    // delegators


        public InternalWebIDLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalWebIDLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalWebIDLParser.tokenNames; }
    public String getGrammarFileName() { return "../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g"; }



    /*
      This grammar contains a lot of empty actions to work around a bug in ANTLR.
      Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
    */
     
     	private WebIDLGrammarAccess grammarAccess;
     	
        public InternalWebIDLParser(TokenStream input, WebIDLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "IDLDefinitions";	
       	}
       	
       	@Override
       	protected WebIDLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleIDLDefinitions"
    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:73:1: entryRuleIDLDefinitions returns [EObject current=null] : iv_ruleIDLDefinitions= ruleIDLDefinitions EOF ;
    public final EObject entryRuleIDLDefinitions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIDLDefinitions = null;


        try {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:74:2: (iv_ruleIDLDefinitions= ruleIDLDefinitions EOF )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:75:2: iv_ruleIDLDefinitions= ruleIDLDefinitions EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIDLDefinitionsRule()); 
            }
            pushFollow(FOLLOW_ruleIDLDefinitions_in_entryRuleIDLDefinitions81);
            iv_ruleIDLDefinitions=ruleIDLDefinitions();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIDLDefinitions; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIDLDefinitions91); if (state.failed) return current;

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
    // $ANTLR end "entryRuleIDLDefinitions"


    // $ANTLR start "ruleIDLDefinitions"
    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:82:1: ruleIDLDefinitions returns [EObject current=null] : ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_definitions_1_0= ruleAbstractDefinitions ) )* ) ;
    public final EObject ruleIDLDefinitions() throws RecognitionException {
        EObject current = null;

        EObject lv_imports_0_0 = null;

        EObject lv_definitions_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:85:28: ( ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_definitions_1_0= ruleAbstractDefinitions ) )* ) )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:86:1: ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_definitions_1_0= ruleAbstractDefinitions ) )* )
            {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:86:1: ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_definitions_1_0= ruleAbstractDefinitions ) )* )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:86:2: ( (lv_imports_0_0= ruleImport ) )* ( (lv_definitions_1_0= ruleAbstractDefinitions ) )*
            {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:86:2: ( (lv_imports_0_0= ruleImport ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:87:1: (lv_imports_0_0= ruleImport )
            	    {
            	    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:87:1: (lv_imports_0_0= ruleImport )
            	    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:88:3: lv_imports_0_0= ruleImport
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getIDLDefinitionsAccess().getImportsImportParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleImport_in_ruleIDLDefinitions137);
            	    lv_imports_0_0=ruleImport();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getIDLDefinitionsRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"imports",
            	              		lv_imports_0_0, 
            	              		"Import");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:104:3: ( (lv_definitions_1_0= ruleAbstractDefinitions ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID||LA2_0==13||LA2_0==54||LA2_0==56||LA2_0==61||LA2_0==75) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:105:1: (lv_definitions_1_0= ruleAbstractDefinitions )
            	    {
            	    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:105:1: (lv_definitions_1_0= ruleAbstractDefinitions )
            	    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:106:3: lv_definitions_1_0= ruleAbstractDefinitions
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getIDLDefinitionsAccess().getDefinitionsAbstractDefinitionsParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAbstractDefinitions_in_ruleIDLDefinitions159);
            	    lv_definitions_1_0=ruleAbstractDefinitions();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getIDLDefinitionsRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"definitions",
            	              		lv_definitions_1_0, 
            	              		"AbstractDefinitions");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleIDLDefinitions"


    // $ANTLR start "entryRuleImport"
    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:130:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:131:2: (iv_ruleImport= ruleImport EOF )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:132:2: iv_ruleImport= ruleImport EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImportRule()); 
            }
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport196);
            iv_ruleImport=ruleImport();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImport; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport206); if (state.failed) return current;

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
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:139:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) otherlv_2= ';' ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_importURI_1_0=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:142:28: ( (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) otherlv_2= ';' ) )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:143:1: (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) otherlv_2= ';' )
            {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:143:1: (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) otherlv_2= ';' )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:143:3: otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleImport243); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
                  
            }
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:147:1: ( (lv_importURI_1_0= RULE_STRING ) )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:148:1: (lv_importURI_1_0= RULE_STRING )
            {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:148:1: (lv_importURI_1_0= RULE_STRING )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:149:3: lv_importURI_1_0= RULE_STRING
            {
            lv_importURI_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleImport260); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_importURI_1_0, grammarAccess.getImportAccess().getImportURISTRINGTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getImportRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"importURI",
                      		lv_importURI_1_0, 
                      		"STRING");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleImport277); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getImportAccess().getSemicolonKeyword_2());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleTypeDef"
    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:177:1: entryRuleTypeDef returns [EObject current=null] : iv_ruleTypeDef= ruleTypeDef EOF ;
    public final EObject entryRuleTypeDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeDef = null;


        try {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:178:2: (iv_ruleTypeDef= ruleTypeDef EOF )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:179:2: iv_ruleTypeDef= ruleTypeDef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeDefRule()); 
            }
            pushFollow(FOLLOW_ruleTypeDef_in_entryRuleTypeDef313);
            iv_ruleTypeDef=ruleTypeDef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeDef; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeDef323); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTypeDef"


    // $ANTLR start "ruleTypeDef"
    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:186:1: ruleTypeDef returns [EObject current=null] : (otherlv_0= 'typedef' ( (lv_type_1_0= ruleTypeRef ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' ) ;
    public final EObject ruleTypeDef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        EObject lv_type_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:189:28: ( (otherlv_0= 'typedef' ( (lv_type_1_0= ruleTypeRef ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' ) )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:190:1: (otherlv_0= 'typedef' ( (lv_type_1_0= ruleTypeRef ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' )
            {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:190:1: (otherlv_0= 'typedef' ( (lv_type_1_0= ruleTypeRef ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:190:3: otherlv_0= 'typedef' ( (lv_type_1_0= ruleTypeRef ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleTypeDef360); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getTypeDefAccess().getTypedefKeyword_0());
                  
            }
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:194:1: ( (lv_type_1_0= ruleTypeRef ) )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:195:1: (lv_type_1_0= ruleTypeRef )
            {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:195:1: (lv_type_1_0= ruleTypeRef )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:196:3: lv_type_1_0= ruleTypeRef
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTypeDefAccess().getTypeTypeRefParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleTypeRef_in_ruleTypeDef381);
            lv_type_1_0=ruleTypeRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTypeDefRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_1_0, 
                      		"TypeRef");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:212:2: ( (lv_name_2_0= RULE_ID ) )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:213:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:213:1: (lv_name_2_0= RULE_ID )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:214:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTypeDef398); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_2_0, grammarAccess.getTypeDefAccess().getNameIDTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getTypeDefRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_2_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_12_in_ruleTypeDef415); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getTypeDefAccess().getSemicolonKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleTypeDef"


    // $ANTLR start "entryRuleTypeRef"
    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:242:1: entryRuleTypeRef returns [EObject current=null] : iv_ruleTypeRef= ruleTypeRef EOF ;
    public final EObject entryRuleTypeRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeRef = null;


        try {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:243:2: (iv_ruleTypeRef= ruleTypeRef EOF )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:244:2: iv_ruleTypeRef= ruleTypeRef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeRefRule()); 
            }
            pushFollow(FOLLOW_ruleTypeRef_in_entryRuleTypeRef451);
            iv_ruleTypeRef=ruleTypeRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeRef; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeRef461); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTypeRef"


    // $ANTLR start "ruleTypeRef"
    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:251:1: ruleTypeRef returns [EObject current=null] : ( (this_PrimitiveTypeRef_0= rulePrimitiveTypeRef ( (lv_isArray_1_0= '[]' ) )? ) | (this_SequenceType_2= ruleSequenceType ( (lv_isArray_3_0= '[]' ) )? ) | (this_UserTypeRef_4= ruleUserTypeRef ( (lv_isArray_5_0= '[]' ) )? ) ) ;
    public final EObject ruleTypeRef() throws RecognitionException {
        EObject current = null;

        Token lv_isArray_1_0=null;
        Token lv_isArray_3_0=null;
        Token lv_isArray_5_0=null;
        EObject this_PrimitiveTypeRef_0 = null;

        EObject this_SequenceType_2 = null;

        EObject this_UserTypeRef_4 = null;


         enterRule(); 
            
        try {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:254:28: ( ( (this_PrimitiveTypeRef_0= rulePrimitiveTypeRef ( (lv_isArray_1_0= '[]' ) )? ) | (this_SequenceType_2= ruleSequenceType ( (lv_isArray_3_0= '[]' ) )? ) | (this_UserTypeRef_4= ruleUserTypeRef ( (lv_isArray_5_0= '[]' ) )? ) ) )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:255:1: ( (this_PrimitiveTypeRef_0= rulePrimitiveTypeRef ( (lv_isArray_1_0= '[]' ) )? ) | (this_SequenceType_2= ruleSequenceType ( (lv_isArray_3_0= '[]' ) )? ) | (this_UserTypeRef_4= ruleUserTypeRef ( (lv_isArray_5_0= '[]' ) )? ) )
            {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:255:1: ( (this_PrimitiveTypeRef_0= rulePrimitiveTypeRef ( (lv_isArray_1_0= '[]' ) )? ) | (this_SequenceType_2= ruleSequenceType ( (lv_isArray_3_0= '[]' ) )? ) | (this_UserTypeRef_4= ruleUserTypeRef ( (lv_isArray_5_0= '[]' ) )? ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
                {
                alt6=1;
                }
                break;
            case 29:
                {
                alt6=2;
                }
                break;
            case RULE_ID:
                {
                alt6=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:255:2: (this_PrimitiveTypeRef_0= rulePrimitiveTypeRef ( (lv_isArray_1_0= '[]' ) )? )
                    {
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:255:2: (this_PrimitiveTypeRef_0= rulePrimitiveTypeRef ( (lv_isArray_1_0= '[]' ) )? )
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:256:2: this_PrimitiveTypeRef_0= rulePrimitiveTypeRef ( (lv_isArray_1_0= '[]' ) )?
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTypeRefAccess().getPrimitiveTypeRefParserRuleCall_0_0()); 
                          
                    }
                    pushFollow(FOLLOW_rulePrimitiveTypeRef_in_ruleTypeRef512);
                    this_PrimitiveTypeRef_0=rulePrimitiveTypeRef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_PrimitiveTypeRef_0; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:267:1: ( (lv_isArray_1_0= '[]' ) )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0==14) ) {
                        alt3=1;
                    }
                    switch (alt3) {
                        case 1 :
                            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:268:1: (lv_isArray_1_0= '[]' )
                            {
                            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:268:1: (lv_isArray_1_0= '[]' )
                            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:269:3: lv_isArray_1_0= '[]'
                            {
                            lv_isArray_1_0=(Token)match(input,14,FOLLOW_14_in_ruleTypeRef529); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_isArray_1_0, grammarAccess.getTypeRefAccess().getIsArrayLeftSquareBracketRightSquareBracketKeyword_0_1_0());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getTypeRefRule());
                              	        }
                                     		setWithLastConsumed(current, "isArray", true, "[]");
                              	    
                            }

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:283:6: (this_SequenceType_2= ruleSequenceType ( (lv_isArray_3_0= '[]' ) )? )
                    {
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:283:6: (this_SequenceType_2= ruleSequenceType ( (lv_isArray_3_0= '[]' ) )? )
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:284:2: this_SequenceType_2= ruleSequenceType ( (lv_isArray_3_0= '[]' ) )?
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTypeRefAccess().getSequenceTypeParserRuleCall_1_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSequenceType_in_ruleTypeRef576);
                    this_SequenceType_2=ruleSequenceType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_SequenceType_2; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:295:1: ( (lv_isArray_3_0= '[]' ) )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==14) ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:296:1: (lv_isArray_3_0= '[]' )
                            {
                            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:296:1: (lv_isArray_3_0= '[]' )
                            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:297:3: lv_isArray_3_0= '[]'
                            {
                            lv_isArray_3_0=(Token)match(input,14,FOLLOW_14_in_ruleTypeRef593); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_isArray_3_0, grammarAccess.getTypeRefAccess().getIsArrayLeftSquareBracketRightSquareBracketKeyword_1_1_0());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getTypeRefRule());
                              	        }
                                     		setWithLastConsumed(current, "isArray", true, "[]");
                              	    
                            }

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:311:6: (this_UserTypeRef_4= ruleUserTypeRef ( (lv_isArray_5_0= '[]' ) )? )
                    {
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:311:6: (this_UserTypeRef_4= ruleUserTypeRef ( (lv_isArray_5_0= '[]' ) )? )
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:312:2: this_UserTypeRef_4= ruleUserTypeRef ( (lv_isArray_5_0= '[]' ) )?
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTypeRefAccess().getUserTypeRefParserRuleCall_2_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleUserTypeRef_in_ruleTypeRef640);
                    this_UserTypeRef_4=ruleUserTypeRef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_UserTypeRef_4; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:323:1: ( (lv_isArray_5_0= '[]' ) )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==14) ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:324:1: (lv_isArray_5_0= '[]' )
                            {
                            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:324:1: (lv_isArray_5_0= '[]' )
                            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:325:3: lv_isArray_5_0= '[]'
                            {
                            lv_isArray_5_0=(Token)match(input,14,FOLLOW_14_in_ruleTypeRef657); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_isArray_5_0, grammarAccess.getTypeRefAccess().getIsArrayLeftSquareBracketRightSquareBracketKeyword_2_1_0());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getTypeRefRule());
                              	        }
                                     		setWithLastConsumed(current, "isArray", true, "[]");
                              	    
                            }

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleTypeRef"


    // $ANTLR start "entryRuleUserTypeRef"
    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:346:1: entryRuleUserTypeRef returns [EObject current=null] : iv_ruleUserTypeRef= ruleUserTypeRef EOF ;
    public final EObject entryRuleUserTypeRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUserTypeRef = null;


        try {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:347:2: (iv_ruleUserTypeRef= ruleUserTypeRef EOF )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:348:2: iv_ruleUserTypeRef= ruleUserTypeRef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUserTypeRefRule()); 
            }
            pushFollow(FOLLOW_ruleUserTypeRef_in_entryRuleUserTypeRef708);
            iv_ruleUserTypeRef=ruleUserTypeRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUserTypeRef; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUserTypeRef718); if (state.failed) return current;

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
    // $ANTLR end "entryRuleUserTypeRef"


    // $ANTLR start "ruleUserTypeRef"
    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:355:1: ruleUserTypeRef returns [EObject current=null] : ( ( ruleScopedName ) ) ;
    public final EObject ruleUserTypeRef() throws RecognitionException {
        EObject current = null;

         enterRule(); 
            
        try {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:358:28: ( ( ( ruleScopedName ) ) )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:359:1: ( ( ruleScopedName ) )
            {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:359:1: ( ( ruleScopedName ) )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:360:1: ( ruleScopedName )
            {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:360:1: ( ruleScopedName )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:361:3: ruleScopedName
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getUserTypeRefRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getUserTypeRefAccess().getTypeTypesCrossReference_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleScopedName_in_ruleUserTypeRef769);
            ruleScopedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleUserTypeRef"


    // $ANTLR start "entryRulePrimitiveTypeRef"
    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:387:1: entryRulePrimitiveTypeRef returns [EObject current=null] : iv_rulePrimitiveTypeRef= rulePrimitiveTypeRef EOF ;
    public final EObject entryRulePrimitiveTypeRef() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveTypeRef = null;


        try {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:388:2: (iv_rulePrimitiveTypeRef= rulePrimitiveTypeRef EOF )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:389:2: iv_rulePrimitiveTypeRef= rulePrimitiveTypeRef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimitiveTypeRefRule()); 
            }
            pushFollow(FOLLOW_rulePrimitiveTypeRef_in_entryRulePrimitiveTypeRef806);
            iv_rulePrimitiveTypeRef=rulePrimitiveTypeRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimitiveTypeRef; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimitiveTypeRef816); if (state.failed) return current;

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
    // $ANTLR end "entryRulePrimitiveTypeRef"


    // $ANTLR start "rulePrimitiveTypeRef"
    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:396:1: rulePrimitiveTypeRef returns [EObject current=null] : ( ( (lv_unsigned_0_0= 'unsigned' ) )? ( ( (lv_name_1_1= 'void' | lv_name_1_2= 'boolean' | lv_name_1_3= 'byte' | lv_name_1_4= 'double' | lv_name_1_5= 'float' | lv_name_1_6= 'short' | lv_name_1_7= 'long' | lv_name_1_8= 'Object' | lv_name_1_9= 'object' | lv_name_1_10= 'any' | lv_name_1_11= 'octet' | lv_name_1_12= 'DOMString' ) ) )+ ( (lv_nullable_2_0= '?' ) )? ) ;
    public final EObject rulePrimitiveTypeRef() throws RecognitionException {
        EObject current = null;

        Token lv_unsigned_0_0=null;
        Token lv_name_1_1=null;
        Token lv_name_1_2=null;
        Token lv_name_1_3=null;
        Token lv_name_1_4=null;
        Token lv_name_1_5=null;
        Token lv_name_1_6=null;
        Token lv_name_1_7=null;
        Token lv_name_1_8=null;
        Token lv_name_1_9=null;
        Token lv_name_1_10=null;
        Token lv_name_1_11=null;
        Token lv_name_1_12=null;
        Token lv_nullable_2_0=null;

         enterRule(); 
            
        try {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:399:28: ( ( ( (lv_unsigned_0_0= 'unsigned' ) )? ( ( (lv_name_1_1= 'void' | lv_name_1_2= 'boolean' | lv_name_1_3= 'byte' | lv_name_1_4= 'double' | lv_name_1_5= 'float' | lv_name_1_6= 'short' | lv_name_1_7= 'long' | lv_name_1_8= 'Object' | lv_name_1_9= 'object' | lv_name_1_10= 'any' | lv_name_1_11= 'octet' | lv_name_1_12= 'DOMString' ) ) )+ ( (lv_nullable_2_0= '?' ) )? ) )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:400:1: ( ( (lv_unsigned_0_0= 'unsigned' ) )? ( ( (lv_name_1_1= 'void' | lv_name_1_2= 'boolean' | lv_name_1_3= 'byte' | lv_name_1_4= 'double' | lv_name_1_5= 'float' | lv_name_1_6= 'short' | lv_name_1_7= 'long' | lv_name_1_8= 'Object' | lv_name_1_9= 'object' | lv_name_1_10= 'any' | lv_name_1_11= 'octet' | lv_name_1_12= 'DOMString' ) ) )+ ( (lv_nullable_2_0= '?' ) )? )
            {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:400:1: ( ( (lv_unsigned_0_0= 'unsigned' ) )? ( ( (lv_name_1_1= 'void' | lv_name_1_2= 'boolean' | lv_name_1_3= 'byte' | lv_name_1_4= 'double' | lv_name_1_5= 'float' | lv_name_1_6= 'short' | lv_name_1_7= 'long' | lv_name_1_8= 'Object' | lv_name_1_9= 'object' | lv_name_1_10= 'any' | lv_name_1_11= 'octet' | lv_name_1_12= 'DOMString' ) ) )+ ( (lv_nullable_2_0= '?' ) )? )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:400:2: ( (lv_unsigned_0_0= 'unsigned' ) )? ( ( (lv_name_1_1= 'void' | lv_name_1_2= 'boolean' | lv_name_1_3= 'byte' | lv_name_1_4= 'double' | lv_name_1_5= 'float' | lv_name_1_6= 'short' | lv_name_1_7= 'long' | lv_name_1_8= 'Object' | lv_name_1_9= 'object' | lv_name_1_10= 'any' | lv_name_1_11= 'octet' | lv_name_1_12= 'DOMString' ) ) )+ ( (lv_nullable_2_0= '?' ) )?
            {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:400:2: ( (lv_unsigned_0_0= 'unsigned' ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==15) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:401:1: (lv_unsigned_0_0= 'unsigned' )
                    {
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:401:1: (lv_unsigned_0_0= 'unsigned' )
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:402:3: lv_unsigned_0_0= 'unsigned'
                    {
                    lv_unsigned_0_0=(Token)match(input,15,FOLLOW_15_in_rulePrimitiveTypeRef859); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_unsigned_0_0, grammarAccess.getPrimitiveTypeRefAccess().getUnsignedUnsignedKeyword_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getPrimitiveTypeRefRule());
                      	        }
                             		setWithLastConsumed(current, "unsigned", true, "unsigned");
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:415:3: ( ( (lv_name_1_1= 'void' | lv_name_1_2= 'boolean' | lv_name_1_3= 'byte' | lv_name_1_4= 'double' | lv_name_1_5= 'float' | lv_name_1_6= 'short' | lv_name_1_7= 'long' | lv_name_1_8= 'Object' | lv_name_1_9= 'object' | lv_name_1_10= 'any' | lv_name_1_11= 'octet' | lv_name_1_12= 'DOMString' ) ) )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=16 && LA9_0<=27)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:416:1: ( (lv_name_1_1= 'void' | lv_name_1_2= 'boolean' | lv_name_1_3= 'byte' | lv_name_1_4= 'double' | lv_name_1_5= 'float' | lv_name_1_6= 'short' | lv_name_1_7= 'long' | lv_name_1_8= 'Object' | lv_name_1_9= 'object' | lv_name_1_10= 'any' | lv_name_1_11= 'octet' | lv_name_1_12= 'DOMString' ) )
            	    {
            	    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:416:1: ( (lv_name_1_1= 'void' | lv_name_1_2= 'boolean' | lv_name_1_3= 'byte' | lv_name_1_4= 'double' | lv_name_1_5= 'float' | lv_name_1_6= 'short' | lv_name_1_7= 'long' | lv_name_1_8= 'Object' | lv_name_1_9= 'object' | lv_name_1_10= 'any' | lv_name_1_11= 'octet' | lv_name_1_12= 'DOMString' ) )
            	    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:417:1: (lv_name_1_1= 'void' | lv_name_1_2= 'boolean' | lv_name_1_3= 'byte' | lv_name_1_4= 'double' | lv_name_1_5= 'float' | lv_name_1_6= 'short' | lv_name_1_7= 'long' | lv_name_1_8= 'Object' | lv_name_1_9= 'object' | lv_name_1_10= 'any' | lv_name_1_11= 'octet' | lv_name_1_12= 'DOMString' )
            	    {
            	    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:417:1: (lv_name_1_1= 'void' | lv_name_1_2= 'boolean' | lv_name_1_3= 'byte' | lv_name_1_4= 'double' | lv_name_1_5= 'float' | lv_name_1_6= 'short' | lv_name_1_7= 'long' | lv_name_1_8= 'Object' | lv_name_1_9= 'object' | lv_name_1_10= 'any' | lv_name_1_11= 'octet' | lv_name_1_12= 'DOMString' )
            	    int alt8=12;
            	    switch ( input.LA(1) ) {
            	    case 16:
            	        {
            	        alt8=1;
            	        }
            	        break;
            	    case 17:
            	        {
            	        alt8=2;
            	        }
            	        break;
            	    case 18:
            	        {
            	        alt8=3;
            	        }
            	        break;
            	    case 19:
            	        {
            	        alt8=4;
            	        }
            	        break;
            	    case 20:
            	        {
            	        alt8=5;
            	        }
            	        break;
            	    case 21:
            	        {
            	        alt8=6;
            	        }
            	        break;
            	    case 22:
            	        {
            	        alt8=7;
            	        }
            	        break;
            	    case 23:
            	        {
            	        alt8=8;
            	        }
            	        break;
            	    case 24:
            	        {
            	        alt8=9;
            	        }
            	        break;
            	    case 25:
            	        {
            	        alt8=10;
            	        }
            	        break;
            	    case 26:
            	        {
            	        alt8=11;
            	        }
            	        break;
            	    case 27:
            	        {
            	        alt8=12;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 8, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt8) {
            	        case 1 :
            	            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:418:3: lv_name_1_1= 'void'
            	            {
            	            lv_name_1_1=(Token)match(input,16,FOLLOW_16_in_rulePrimitiveTypeRef893); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_name_1_1, grammarAccess.getPrimitiveTypeRefAccess().getNameVoidKeyword_1_0_0());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getPrimitiveTypeRefRule());
            	              	        }
            	                     		setWithLastConsumed(current, "name", lv_name_1_1, null);
            	              	    
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:430:8: lv_name_1_2= 'boolean'
            	            {
            	            lv_name_1_2=(Token)match(input,17,FOLLOW_17_in_rulePrimitiveTypeRef922); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_name_1_2, grammarAccess.getPrimitiveTypeRefAccess().getNameBooleanKeyword_1_0_1());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getPrimitiveTypeRefRule());
            	              	        }
            	                     		setWithLastConsumed(current, "name", lv_name_1_2, null);
            	              	    
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:442:8: lv_name_1_3= 'byte'
            	            {
            	            lv_name_1_3=(Token)match(input,18,FOLLOW_18_in_rulePrimitiveTypeRef951); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_name_1_3, grammarAccess.getPrimitiveTypeRefAccess().getNameByteKeyword_1_0_2());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getPrimitiveTypeRefRule());
            	              	        }
            	                     		setWithLastConsumed(current, "name", lv_name_1_3, null);
            	              	    
            	            }

            	            }
            	            break;
            	        case 4 :
            	            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:454:8: lv_name_1_4= 'double'
            	            {
            	            lv_name_1_4=(Token)match(input,19,FOLLOW_19_in_rulePrimitiveTypeRef980); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_name_1_4, grammarAccess.getPrimitiveTypeRefAccess().getNameDoubleKeyword_1_0_3());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getPrimitiveTypeRefRule());
            	              	        }
            	                     		setWithLastConsumed(current, "name", lv_name_1_4, null);
            	              	    
            	            }

            	            }
            	            break;
            	        case 5 :
            	            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:466:8: lv_name_1_5= 'float'
            	            {
            	            lv_name_1_5=(Token)match(input,20,FOLLOW_20_in_rulePrimitiveTypeRef1009); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_name_1_5, grammarAccess.getPrimitiveTypeRefAccess().getNameFloatKeyword_1_0_4());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getPrimitiveTypeRefRule());
            	              	        }
            	                     		setWithLastConsumed(current, "name", lv_name_1_5, null);
            	              	    
            	            }

            	            }
            	            break;
            	        case 6 :
            	            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:478:8: lv_name_1_6= 'short'
            	            {
            	            lv_name_1_6=(Token)match(input,21,FOLLOW_21_in_rulePrimitiveTypeRef1038); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_name_1_6, grammarAccess.getPrimitiveTypeRefAccess().getNameShortKeyword_1_0_5());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getPrimitiveTypeRefRule());
            	              	        }
            	                     		setWithLastConsumed(current, "name", lv_name_1_6, null);
            	              	    
            	            }

            	            }
            	            break;
            	        case 7 :
            	            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:490:8: lv_name_1_7= 'long'
            	            {
            	            lv_name_1_7=(Token)match(input,22,FOLLOW_22_in_rulePrimitiveTypeRef1067); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_name_1_7, grammarAccess.getPrimitiveTypeRefAccess().getNameLongKeyword_1_0_6());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getPrimitiveTypeRefRule());
            	              	        }
            	                     		setWithLastConsumed(current, "name", lv_name_1_7, null);
            	              	    
            	            }

            	            }
            	            break;
            	        case 8 :
            	            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:502:8: lv_name_1_8= 'Object'
            	            {
            	            lv_name_1_8=(Token)match(input,23,FOLLOW_23_in_rulePrimitiveTypeRef1096); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_name_1_8, grammarAccess.getPrimitiveTypeRefAccess().getNameObjectKeyword_1_0_7());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getPrimitiveTypeRefRule());
            	              	        }
            	                     		setWithLastConsumed(current, "name", lv_name_1_8, null);
            	              	    
            	            }

            	            }
            	            break;
            	        case 9 :
            	            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:514:8: lv_name_1_9= 'object'
            	            {
            	            lv_name_1_9=(Token)match(input,24,FOLLOW_24_in_rulePrimitiveTypeRef1125); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_name_1_9, grammarAccess.getPrimitiveTypeRefAccess().getNameObjectKeyword_1_0_8());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getPrimitiveTypeRefRule());
            	              	        }
            	                     		setWithLastConsumed(current, "name", lv_name_1_9, null);
            	              	    
            	            }

            	            }
            	            break;
            	        case 10 :
            	            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:526:8: lv_name_1_10= 'any'
            	            {
            	            lv_name_1_10=(Token)match(input,25,FOLLOW_25_in_rulePrimitiveTypeRef1154); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_name_1_10, grammarAccess.getPrimitiveTypeRefAccess().getNameAnyKeyword_1_0_9());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getPrimitiveTypeRefRule());
            	              	        }
            	                     		setWithLastConsumed(current, "name", lv_name_1_10, null);
            	              	    
            	            }

            	            }
            	            break;
            	        case 11 :
            	            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:538:8: lv_name_1_11= 'octet'
            	            {
            	            lv_name_1_11=(Token)match(input,26,FOLLOW_26_in_rulePrimitiveTypeRef1183); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_name_1_11, grammarAccess.getPrimitiveTypeRefAccess().getNameOctetKeyword_1_0_10());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getPrimitiveTypeRefRule());
            	              	        }
            	                     		setWithLastConsumed(current, "name", lv_name_1_11, null);
            	              	    
            	            }

            	            }
            	            break;
            	        case 12 :
            	            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:550:8: lv_name_1_12= 'DOMString'
            	            {
            	            lv_name_1_12=(Token)match(input,27,FOLLOW_27_in_rulePrimitiveTypeRef1212); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_name_1_12, grammarAccess.getPrimitiveTypeRefAccess().getNameDOMStringKeyword_1_0_11());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getPrimitiveTypeRefRule());
            	              	        }
            	                     		setWithLastConsumed(current, "name", lv_name_1_12, null);
            	              	    
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
            } while (true);

            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:565:3: ( (lv_nullable_2_0= '?' ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==28) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:566:1: (lv_nullable_2_0= '?' )
                    {
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:566:1: (lv_nullable_2_0= '?' )
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:567:3: lv_nullable_2_0= '?'
                    {
                    lv_nullable_2_0=(Token)match(input,28,FOLLOW_28_in_rulePrimitiveTypeRef1247); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_nullable_2_0, grammarAccess.getPrimitiveTypeRefAccess().getNullableQuestionMarkKeyword_2_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getPrimitiveTypeRefRule());
                      	        }
                             		setWithLastConsumed(current, "nullable", true, "?");
                      	    
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "rulePrimitiveTypeRef"


    // $ANTLR start "entryRuleSequenceType"
    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:588:1: entryRuleSequenceType returns [EObject current=null] : iv_ruleSequenceType= ruleSequenceType EOF ;
    public final EObject entryRuleSequenceType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSequenceType = null;


        try {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:589:2: (iv_ruleSequenceType= ruleSequenceType EOF )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:590:2: iv_ruleSequenceType= ruleSequenceType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSequenceTypeRule()); 
            }
            pushFollow(FOLLOW_ruleSequenceType_in_entryRuleSequenceType1297);
            iv_ruleSequenceType=ruleSequenceType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSequenceType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSequenceType1307); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSequenceType"


    // $ANTLR start "ruleSequenceType"
    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:597:1: ruleSequenceType returns [EObject current=null] : (otherlv_0= 'sequence<' ( (lv_type_1_0= ruleTypeRef ) ) otherlv_2= '>' ( (lv_nullable_3_0= '?' ) )? ) ;
    public final EObject ruleSequenceType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_nullable_3_0=null;
        EObject lv_type_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:600:28: ( (otherlv_0= 'sequence<' ( (lv_type_1_0= ruleTypeRef ) ) otherlv_2= '>' ( (lv_nullable_3_0= '?' ) )? ) )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:601:1: (otherlv_0= 'sequence<' ( (lv_type_1_0= ruleTypeRef ) ) otherlv_2= '>' ( (lv_nullable_3_0= '?' ) )? )
            {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:601:1: (otherlv_0= 'sequence<' ( (lv_type_1_0= ruleTypeRef ) ) otherlv_2= '>' ( (lv_nullable_3_0= '?' ) )? )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:601:3: otherlv_0= 'sequence<' ( (lv_type_1_0= ruleTypeRef ) ) otherlv_2= '>' ( (lv_nullable_3_0= '?' ) )?
            {
            otherlv_0=(Token)match(input,29,FOLLOW_29_in_ruleSequenceType1344); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getSequenceTypeAccess().getSequenceKeyword_0());
                  
            }
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:605:1: ( (lv_type_1_0= ruleTypeRef ) )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:606:1: (lv_type_1_0= ruleTypeRef )
            {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:606:1: (lv_type_1_0= ruleTypeRef )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:607:3: lv_type_1_0= ruleTypeRef
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSequenceTypeAccess().getTypeTypeRefParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleTypeRef_in_ruleSequenceType1365);
            lv_type_1_0=ruleTypeRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getSequenceTypeRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_1_0, 
                      		"TypeRef");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,30,FOLLOW_30_in_ruleSequenceType1377); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getSequenceTypeAccess().getGreaterThanSignKeyword_2());
                  
            }
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:627:1: ( (lv_nullable_3_0= '?' ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==28) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:628:1: (lv_nullable_3_0= '?' )
                    {
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:628:1: (lv_nullable_3_0= '?' )
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:629:3: lv_nullable_3_0= '?'
                    {
                    lv_nullable_3_0=(Token)match(input,28,FOLLOW_28_in_ruleSequenceType1395); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_nullable_3_0, grammarAccess.getSequenceTypeAccess().getNullableQuestionMarkKeyword_3_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getSequenceTypeRule());
                      	        }
                             		setWithLastConsumed(current, "nullable", true, "?");
                      	    
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleSequenceType"


    // $ANTLR start "entryRuleScopedName"
    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:650:1: entryRuleScopedName returns [String current=null] : iv_ruleScopedName= ruleScopedName EOF ;
    public final String entryRuleScopedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleScopedName = null;


        try {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:651:2: (iv_ruleScopedName= ruleScopedName EOF )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:652:2: iv_ruleScopedName= ruleScopedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getScopedNameRule()); 
            }
            pushFollow(FOLLOW_ruleScopedName_in_entryRuleScopedName1446);
            iv_ruleScopedName=ruleScopedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleScopedName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleScopedName1457); if (state.failed) return current;

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
    // $ANTLR end "entryRuleScopedName"


    // $ANTLR start "ruleScopedName"
    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:659:1: ruleScopedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '::' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleScopedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:662:28: ( (this_ID_0= RULE_ID (kw= '::' this_ID_2= RULE_ID )* ) )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:663:1: (this_ID_0= RULE_ID (kw= '::' this_ID_2= RULE_ID )* )
            {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:663:1: (this_ID_0= RULE_ID (kw= '::' this_ID_2= RULE_ID )* )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:663:6: this_ID_0= RULE_ID (kw= '::' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleScopedName1497); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getScopedNameAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:670:1: (kw= '::' this_ID_2= RULE_ID )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==31) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:671:2: kw= '::' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,31,FOLLOW_31_in_ruleScopedName1516); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getScopedNameAccess().getColonColonKeyword_1_0()); 
            	          
            	    }
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleScopedName1531); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_2, grammarAccess.getScopedNameAccess().getIDTerminalRuleCall_1_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleScopedName"


    // $ANTLR start "entryRuleConstructor"
    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:693:1: entryRuleConstructor returns [EObject current=null] : iv_ruleConstructor= ruleConstructor EOF ;
    public final EObject entryRuleConstructor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstructor = null;


        try {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:694:2: (iv_ruleConstructor= ruleConstructor EOF )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:695:2: iv_ruleConstructor= ruleConstructor EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConstructorRule()); 
            }
            pushFollow(FOLLOW_ruleConstructor_in_entryRuleConstructor1580);
            iv_ruleConstructor=ruleConstructor();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConstructor; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstructor1590); if (state.failed) return current;

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
    // $ANTLR end "entryRuleConstructor"


    // $ANTLR start "ruleConstructor"
    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:702:1: ruleConstructor returns [EObject current=null] : (otherlv_0= 'Constructor' () (otherlv_2= '(' ( (lv_arguments_3_0= ruleArgument ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleArgument ) ) )* otherlv_6= ')' )? ) ;
    public final EObject ruleConstructor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_arguments_3_0 = null;

        EObject lv_arguments_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:705:28: ( (otherlv_0= 'Constructor' () (otherlv_2= '(' ( (lv_arguments_3_0= ruleArgument ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleArgument ) ) )* otherlv_6= ')' )? ) )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:706:1: (otherlv_0= 'Constructor' () (otherlv_2= '(' ( (lv_arguments_3_0= ruleArgument ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleArgument ) ) )* otherlv_6= ')' )? )
            {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:706:1: (otherlv_0= 'Constructor' () (otherlv_2= '(' ( (lv_arguments_3_0= ruleArgument ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleArgument ) ) )* otherlv_6= ')' )? )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:706:3: otherlv_0= 'Constructor' () (otherlv_2= '(' ( (lv_arguments_3_0= ruleArgument ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleArgument ) ) )* otherlv_6= ')' )?
            {
            otherlv_0=(Token)match(input,32,FOLLOW_32_in_ruleConstructor1627); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getConstructorAccess().getConstructorKeyword_0());
                  
            }
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:710:1: ()
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:711:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getConstructorAccess().getConstructorAction_1(),
                          current);
                  
            }

            }

            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:719:2: (otherlv_2= '(' ( (lv_arguments_3_0= ruleArgument ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleArgument ) ) )* otherlv_6= ')' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==33) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:719:4: otherlv_2= '(' ( (lv_arguments_3_0= ruleArgument ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleArgument ) ) )* otherlv_6= ')'
                    {
                    otherlv_2=(Token)match(input,33,FOLLOW_33_in_ruleConstructor1652); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getConstructorAccess().getLeftParenthesisKeyword_2_0());
                          
                    }
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:723:1: ( (lv_arguments_3_0= ruleArgument ) )
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:724:1: (lv_arguments_3_0= ruleArgument )
                    {
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:724:1: (lv_arguments_3_0= ruleArgument )
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:725:3: lv_arguments_3_0= ruleArgument
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getConstructorAccess().getArgumentsArgumentParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleArgument_in_ruleConstructor1673);
                    lv_arguments_3_0=ruleArgument();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getConstructorRule());
                      	        }
                             		add(
                             			current, 
                             			"arguments",
                              		lv_arguments_3_0, 
                              		"Argument");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:741:2: (otherlv_4= ',' ( (lv_arguments_5_0= ruleArgument ) ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==34) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:741:4: otherlv_4= ',' ( (lv_arguments_5_0= ruleArgument ) )
                    	    {
                    	    otherlv_4=(Token)match(input,34,FOLLOW_34_in_ruleConstructor1686); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getConstructorAccess().getCommaKeyword_2_2_0());
                    	          
                    	    }
                    	    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:745:1: ( (lv_arguments_5_0= ruleArgument ) )
                    	    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:746:1: (lv_arguments_5_0= ruleArgument )
                    	    {
                    	    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:746:1: (lv_arguments_5_0= ruleArgument )
                    	    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:747:3: lv_arguments_5_0= ruleArgument
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getConstructorAccess().getArgumentsArgumentParserRuleCall_2_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleArgument_in_ruleConstructor1707);
                    	    lv_arguments_5_0=ruleArgument();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getConstructorRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"arguments",
                    	              		lv_arguments_5_0, 
                    	              		"Argument");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,35,FOLLOW_35_in_ruleConstructor1721); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getConstructorAccess().getRightParenthesisKeyword_2_3());
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleConstructor"


    // $ANTLR start "entryRuleNamedConstructor"
    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:775:1: entryRuleNamedConstructor returns [EObject current=null] : iv_ruleNamedConstructor= ruleNamedConstructor EOF ;
    public final EObject entryRuleNamedConstructor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamedConstructor = null;


        try {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:776:2: (iv_ruleNamedConstructor= ruleNamedConstructor EOF )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:777:2: iv_ruleNamedConstructor= ruleNamedConstructor EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNamedConstructorRule()); 
            }
            pushFollow(FOLLOW_ruleNamedConstructor_in_entryRuleNamedConstructor1759);
            iv_ruleNamedConstructor=ruleNamedConstructor();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNamedConstructor; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNamedConstructor1769); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNamedConstructor"


    // $ANTLR start "ruleNamedConstructor"
    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:784:1: ruleNamedConstructor returns [EObject current=null] : (otherlv_0= 'NamedConstructor' () otherlv_2= '=' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= '(' ( ( (lv_arguments_5_0= ruleArgument ) ) (otherlv_6= ',' ( (lv_arguments_7_0= ruleArgument ) ) )* )? otherlv_8= ')' )? ) ;
    public final EObject ruleNamedConstructor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_arguments_5_0 = null;

        EObject lv_arguments_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:787:28: ( (otherlv_0= 'NamedConstructor' () otherlv_2= '=' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= '(' ( ( (lv_arguments_5_0= ruleArgument ) ) (otherlv_6= ',' ( (lv_arguments_7_0= ruleArgument ) ) )* )? otherlv_8= ')' )? ) )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:788:1: (otherlv_0= 'NamedConstructor' () otherlv_2= '=' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= '(' ( ( (lv_arguments_5_0= ruleArgument ) ) (otherlv_6= ',' ( (lv_arguments_7_0= ruleArgument ) ) )* )? otherlv_8= ')' )? )
            {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:788:1: (otherlv_0= 'NamedConstructor' () otherlv_2= '=' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= '(' ( ( (lv_arguments_5_0= ruleArgument ) ) (otherlv_6= ',' ( (lv_arguments_7_0= ruleArgument ) ) )* )? otherlv_8= ')' )? )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:788:3: otherlv_0= 'NamedConstructor' () otherlv_2= '=' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= '(' ( ( (lv_arguments_5_0= ruleArgument ) ) (otherlv_6= ',' ( (lv_arguments_7_0= ruleArgument ) ) )* )? otherlv_8= ')' )?
            {
            otherlv_0=(Token)match(input,36,FOLLOW_36_in_ruleNamedConstructor1806); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getNamedConstructorAccess().getNamedConstructorKeyword_0());
                  
            }
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:792:1: ()
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:793:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getNamedConstructorAccess().getConstructorAction_1(),
                          current);
                  
            }

            }

            otherlv_2=(Token)match(input,37,FOLLOW_37_in_ruleNamedConstructor1830); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getNamedConstructorAccess().getEqualsSignKeyword_2());
                  
            }
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:805:1: ( (lv_name_3_0= RULE_ID ) )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:806:1: (lv_name_3_0= RULE_ID )
            {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:806:1: (lv_name_3_0= RULE_ID )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:807:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNamedConstructor1847); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_3_0, grammarAccess.getNamedConstructorAccess().getNameIDTerminalRuleCall_3_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getNamedConstructorRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_3_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:823:2: (otherlv_4= '(' ( ( (lv_arguments_5_0= ruleArgument ) ) (otherlv_6= ',' ( (lv_arguments_7_0= ruleArgument ) ) )* )? otherlv_8= ')' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==33) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:823:4: otherlv_4= '(' ( ( (lv_arguments_5_0= ruleArgument ) ) (otherlv_6= ',' ( (lv_arguments_7_0= ruleArgument ) ) )* )? otherlv_8= ')'
                    {
                    otherlv_4=(Token)match(input,33,FOLLOW_33_in_ruleNamedConstructor1865); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getNamedConstructorAccess().getLeftParenthesisKeyword_4_0());
                          
                    }
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:827:1: ( ( (lv_arguments_5_0= ruleArgument ) ) (otherlv_6= ',' ( (lv_arguments_7_0= ruleArgument ) ) )* )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==RULE_ID||(LA16_0>=15 && LA16_0<=27)||LA16_0==29||LA16_0==54||(LA16_0>=76 && LA16_0<=77)) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:827:2: ( (lv_arguments_5_0= ruleArgument ) ) (otherlv_6= ',' ( (lv_arguments_7_0= ruleArgument ) ) )*
                            {
                            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:827:2: ( (lv_arguments_5_0= ruleArgument ) )
                            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:828:1: (lv_arguments_5_0= ruleArgument )
                            {
                            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:828:1: (lv_arguments_5_0= ruleArgument )
                            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:829:3: lv_arguments_5_0= ruleArgument
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getNamedConstructorAccess().getArgumentsArgumentParserRuleCall_4_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleArgument_in_ruleNamedConstructor1887);
                            lv_arguments_5_0=ruleArgument();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getNamedConstructorRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"arguments",
                                      		lv_arguments_5_0, 
                                      		"Argument");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:845:2: (otherlv_6= ',' ( (lv_arguments_7_0= ruleArgument ) ) )*
                            loop15:
                            do {
                                int alt15=2;
                                int LA15_0 = input.LA(1);

                                if ( (LA15_0==34) ) {
                                    alt15=1;
                                }


                                switch (alt15) {
                            	case 1 :
                            	    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:845:4: otherlv_6= ',' ( (lv_arguments_7_0= ruleArgument ) )
                            	    {
                            	    otherlv_6=(Token)match(input,34,FOLLOW_34_in_ruleNamedConstructor1900); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_6, grammarAccess.getNamedConstructorAccess().getCommaKeyword_4_1_1_0());
                            	          
                            	    }
                            	    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:849:1: ( (lv_arguments_7_0= ruleArgument ) )
                            	    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:850:1: (lv_arguments_7_0= ruleArgument )
                            	    {
                            	    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:850:1: (lv_arguments_7_0= ruleArgument )
                            	    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:851:3: lv_arguments_7_0= ruleArgument
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getNamedConstructorAccess().getArgumentsArgumentParserRuleCall_4_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleArgument_in_ruleNamedConstructor1921);
                            	    lv_arguments_7_0=ruleArgument();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = createModelElementForParent(grammarAccess.getNamedConstructorRule());
                            	      	        }
                            	             		add(
                            	             			current, 
                            	             			"arguments",
                            	              		lv_arguments_7_0, 
                            	              		"Argument");
                            	      	        afterParserOrEnumRuleCall();
                            	      	    
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop15;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_8=(Token)match(input,35,FOLLOW_35_in_ruleNamedConstructor1937); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getNamedConstructorAccess().getRightParenthesisKeyword_4_2());
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleNamedConstructor"


    // $ANTLR start "entryRuleCallback"
    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:879:1: entryRuleCallback returns [EObject current=null] : iv_ruleCallback= ruleCallback EOF ;
    public final EObject entryRuleCallback() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCallback = null;


        try {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:880:2: (iv_ruleCallback= ruleCallback EOF )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:881:2: iv_ruleCallback= ruleCallback EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCallbackRule()); 
            }
            pushFollow(FOLLOW_ruleCallback_in_entryRuleCallback1975);
            iv_ruleCallback=ruleCallback();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCallback; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCallback1985); if (state.failed) return current;

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
    // $ANTLR end "entryRuleCallback"


    // $ANTLR start "ruleCallback"
    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:888:1: ruleCallback returns [EObject current=null] : ( (otherlv_0= 'Callback' () ) | (otherlv_2= 'Callback' otherlv_3= '=' ( (lv_functionOnly_4_0= 'FunctionOnly' ) ) ) | (otherlv_5= 'Callback' otherlv_6= '=' ( (lv_propertyOnly_7_0= 'PropertyOnly' ) ) ) ) ;
    public final EObject ruleCallback() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_functionOnly_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_propertyOnly_7_0=null;

         enterRule(); 
            
        try {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:891:28: ( ( (otherlv_0= 'Callback' () ) | (otherlv_2= 'Callback' otherlv_3= '=' ( (lv_functionOnly_4_0= 'FunctionOnly' ) ) ) | (otherlv_5= 'Callback' otherlv_6= '=' ( (lv_propertyOnly_7_0= 'PropertyOnly' ) ) ) ) )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:892:1: ( (otherlv_0= 'Callback' () ) | (otherlv_2= 'Callback' otherlv_3= '=' ( (lv_functionOnly_4_0= 'FunctionOnly' ) ) ) | (otherlv_5= 'Callback' otherlv_6= '=' ( (lv_propertyOnly_7_0= 'PropertyOnly' ) ) ) )
            {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:892:1: ( (otherlv_0= 'Callback' () ) | (otherlv_2= 'Callback' otherlv_3= '=' ( (lv_functionOnly_4_0= 'FunctionOnly' ) ) ) | (otherlv_5= 'Callback' otherlv_6= '=' ( (lv_propertyOnly_7_0= 'PropertyOnly' ) ) ) )
            int alt18=3;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==38) ) {
                int LA18_1 = input.LA(2);

                if ( (LA18_1==37) ) {
                    int LA18_2 = input.LA(3);

                    if ( (LA18_2==39) ) {
                        alt18=2;
                    }
                    else if ( (LA18_2==40) ) {
                        alt18=3;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 18, 2, input);

                        throw nvae;
                    }
                }
                else if ( (LA18_1==EOF||LA18_1==34||LA18_1==55) ) {
                    alt18=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 18, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:892:2: (otherlv_0= 'Callback' () )
                    {
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:892:2: (otherlv_0= 'Callback' () )
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:892:4: otherlv_0= 'Callback' ()
                    {
                    otherlv_0=(Token)match(input,38,FOLLOW_38_in_ruleCallback2023); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getCallbackAccess().getCallbackKeyword_0_0());
                          
                    }
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:896:1: ()
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:897:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getCallbackAccess().getCallbackAction_0_1(),
                                  current);
                          
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:906:6: (otherlv_2= 'Callback' otherlv_3= '=' ( (lv_functionOnly_4_0= 'FunctionOnly' ) ) )
                    {
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:906:6: (otherlv_2= 'Callback' otherlv_3= '=' ( (lv_functionOnly_4_0= 'FunctionOnly' ) ) )
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:906:8: otherlv_2= 'Callback' otherlv_3= '=' ( (lv_functionOnly_4_0= 'FunctionOnly' ) )
                    {
                    otherlv_2=(Token)match(input,38,FOLLOW_38_in_ruleCallback2055); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getCallbackAccess().getCallbackKeyword_1_0());
                          
                    }
                    otherlv_3=(Token)match(input,37,FOLLOW_37_in_ruleCallback2067); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getCallbackAccess().getEqualsSignKeyword_1_1());
                          
                    }
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:914:1: ( (lv_functionOnly_4_0= 'FunctionOnly' ) )
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:915:1: (lv_functionOnly_4_0= 'FunctionOnly' )
                    {
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:915:1: (lv_functionOnly_4_0= 'FunctionOnly' )
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:916:3: lv_functionOnly_4_0= 'FunctionOnly'
                    {
                    lv_functionOnly_4_0=(Token)match(input,39,FOLLOW_39_in_ruleCallback2085); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_functionOnly_4_0, grammarAccess.getCallbackAccess().getFunctionOnlyFunctionOnlyKeyword_1_2_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getCallbackRule());
                      	        }
                             		setWithLastConsumed(current, "functionOnly", true, "FunctionOnly");
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:930:6: (otherlv_5= 'Callback' otherlv_6= '=' ( (lv_propertyOnly_7_0= 'PropertyOnly' ) ) )
                    {
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:930:6: (otherlv_5= 'Callback' otherlv_6= '=' ( (lv_propertyOnly_7_0= 'PropertyOnly' ) ) )
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:930:8: otherlv_5= 'Callback' otherlv_6= '=' ( (lv_propertyOnly_7_0= 'PropertyOnly' ) )
                    {
                    otherlv_5=(Token)match(input,38,FOLLOW_38_in_ruleCallback2118); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getCallbackAccess().getCallbackKeyword_2_0());
                          
                    }
                    otherlv_6=(Token)match(input,37,FOLLOW_37_in_ruleCallback2130); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getCallbackAccess().getEqualsSignKeyword_2_1());
                          
                    }
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:938:1: ( (lv_propertyOnly_7_0= 'PropertyOnly' ) )
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:939:1: (lv_propertyOnly_7_0= 'PropertyOnly' )
                    {
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:939:1: (lv_propertyOnly_7_0= 'PropertyOnly' )
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:940:3: lv_propertyOnly_7_0= 'PropertyOnly'
                    {
                    lv_propertyOnly_7_0=(Token)match(input,40,FOLLOW_40_in_ruleCallback2148); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_propertyOnly_7_0, grammarAccess.getCallbackAccess().getPropertyOnlyPropertyOnlyKeyword_2_2_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getCallbackRule());
                      	        }
                             		setWithLastConsumed(current, "propertyOnly", true, "PropertyOnly");
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleCallback"


    // $ANTLR start "entryRuleNoInterfaceObject"
    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:961:1: entryRuleNoInterfaceObject returns [EObject current=null] : iv_ruleNoInterfaceObject= ruleNoInterfaceObject EOF ;
    public final EObject entryRuleNoInterfaceObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNoInterfaceObject = null;


        try {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:962:2: (iv_ruleNoInterfaceObject= ruleNoInterfaceObject EOF )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:963:2: iv_ruleNoInterfaceObject= ruleNoInterfaceObject EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNoInterfaceObjectRule()); 
            }
            pushFollow(FOLLOW_ruleNoInterfaceObject_in_entryRuleNoInterfaceObject2198);
            iv_ruleNoInterfaceObject=ruleNoInterfaceObject();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNoInterfaceObject; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNoInterfaceObject2208); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNoInterfaceObject"


    // $ANTLR start "ruleNoInterfaceObject"
    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:970:1: ruleNoInterfaceObject returns [EObject current=null] : ( () otherlv_1= 'NoInterfaceObject' ) ;
    public final EObject ruleNoInterfaceObject() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:973:28: ( ( () otherlv_1= 'NoInterfaceObject' ) )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:974:1: ( () otherlv_1= 'NoInterfaceObject' )
            {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:974:1: ( () otherlv_1= 'NoInterfaceObject' )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:974:2: () otherlv_1= 'NoInterfaceObject'
            {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:974:2: ()
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:975:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getNoInterfaceObjectAccess().getNoInterfaceObjectAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,41,FOLLOW_41_in_ruleNoInterfaceObject2257); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getNoInterfaceObjectAccess().getNoInterfaceObjectKeyword_1());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleNoInterfaceObject"


    // $ANTLR start "entryRuleOverrideBuiltins"
    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:995:1: entryRuleOverrideBuiltins returns [String current=null] : iv_ruleOverrideBuiltins= ruleOverrideBuiltins EOF ;
    public final String entryRuleOverrideBuiltins() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOverrideBuiltins = null;


        try {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:996:2: (iv_ruleOverrideBuiltins= ruleOverrideBuiltins EOF )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:997:2: iv_ruleOverrideBuiltins= ruleOverrideBuiltins EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOverrideBuiltinsRule()); 
            }
            pushFollow(FOLLOW_ruleOverrideBuiltins_in_entryRuleOverrideBuiltins2294);
            iv_ruleOverrideBuiltins=ruleOverrideBuiltins();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOverrideBuiltins.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOverrideBuiltins2305); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOverrideBuiltins"


    // $ANTLR start "ruleOverrideBuiltins"
    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1004:1: ruleOverrideBuiltins returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'OverrideBuiltins' ;
    public final AntlrDatatypeRuleToken ruleOverrideBuiltins() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1007:28: (kw= 'OverrideBuiltins' )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1009:2: kw= 'OverrideBuiltins'
            {
            kw=(Token)match(input,42,FOLLOW_42_in_ruleOverrideBuiltins2342); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getOverrideBuiltinsAccess().getOverrideBuiltinsKeyword()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleOverrideBuiltins"


    // $ANTLR start "entryRulePrototypeRoot"
    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1022:1: entryRulePrototypeRoot returns [EObject current=null] : iv_rulePrototypeRoot= rulePrototypeRoot EOF ;
    public final EObject entryRulePrototypeRoot() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrototypeRoot = null;


        try {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1023:2: (iv_rulePrototypeRoot= rulePrototypeRoot EOF )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1024:2: iv_rulePrototypeRoot= rulePrototypeRoot EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrototypeRootRule()); 
            }
            pushFollow(FOLLOW_rulePrototypeRoot_in_entryRulePrototypeRoot2381);
            iv_rulePrototypeRoot=rulePrototypeRoot();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrototypeRoot; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePrototypeRoot2391); if (state.failed) return current;

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
    // $ANTLR end "entryRulePrototypeRoot"


    // $ANTLR start "rulePrototypeRoot"
    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1031:1: rulePrototypeRoot returns [EObject current=null] : ( () otherlv_1= 'PrototypeRoot' ) ;
    public final EObject rulePrototypeRoot() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1034:28: ( ( () otherlv_1= 'PrototypeRoot' ) )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1035:1: ( () otherlv_1= 'PrototypeRoot' )
            {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1035:1: ( () otherlv_1= 'PrototypeRoot' )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1035:2: () otherlv_1= 'PrototypeRoot'
            {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1035:2: ()
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1036:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getPrototypeRootAccess().getPrototypeRootAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,43,FOLLOW_43_in_rulePrototypeRoot2440); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getPrototypeRootAccess().getPrototypeRootKeyword_1());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "rulePrototypeRoot"


    // $ANTLR start "entryRulePutForwards"
    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1056:1: entryRulePutForwards returns [EObject current=null] : iv_rulePutForwards= rulePutForwards EOF ;
    public final EObject entryRulePutForwards() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePutForwards = null;


        try {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1057:2: (iv_rulePutForwards= rulePutForwards EOF )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1058:2: iv_rulePutForwards= rulePutForwards EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPutForwardsRule()); 
            }
            pushFollow(FOLLOW_rulePutForwards_in_entryRulePutForwards2476);
            iv_rulePutForwards=rulePutForwards();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePutForwards; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePutForwards2486); if (state.failed) return current;

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
    // $ANTLR end "entryRulePutForwards"


    // $ANTLR start "rulePutForwards"
    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1065:1: rulePutForwards returns [EObject current=null] : (otherlv_0= 'PutForwards' otherlv_1= '=' ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject rulePutForwards() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1068:28: ( (otherlv_0= 'PutForwards' otherlv_1= '=' ( (otherlv_2= RULE_ID ) ) ) )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1069:1: (otherlv_0= 'PutForwards' otherlv_1= '=' ( (otherlv_2= RULE_ID ) ) )
            {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1069:1: (otherlv_0= 'PutForwards' otherlv_1= '=' ( (otherlv_2= RULE_ID ) ) )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1069:3: otherlv_0= 'PutForwards' otherlv_1= '=' ( (otherlv_2= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,44,FOLLOW_44_in_rulePutForwards2523); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getPutForwardsAccess().getPutForwardsKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,37,FOLLOW_37_in_rulePutForwards2535); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getPutForwardsAccess().getEqualsSignKeyword_1());
                  
            }
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1077:1: ( (otherlv_2= RULE_ID ) )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1078:1: (otherlv_2= RULE_ID )
            {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1078:1: (otherlv_2= RULE_ID )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1079:3: otherlv_2= RULE_ID
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getPutForwardsRule());
              	        }
                      
            }
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePutForwards2559); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_2, grammarAccess.getPutForwardsAccess().getTargetAttributeCrossReference_2_0()); 
              	
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "rulePutForwards"


    // $ANTLR start "entryRuleTreatNullAs"
    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1101:1: entryRuleTreatNullAs returns [EObject current=null] : iv_ruleTreatNullAs= ruleTreatNullAs EOF ;
    public final EObject entryRuleTreatNullAs() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTreatNullAs = null;


        try {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1102:2: (iv_ruleTreatNullAs= ruleTreatNullAs EOF )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1103:2: iv_ruleTreatNullAs= ruleTreatNullAs EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTreatNullAsRule()); 
            }
            pushFollow(FOLLOW_ruleTreatNullAs_in_entryRuleTreatNullAs2595);
            iv_ruleTreatNullAs=ruleTreatNullAs();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTreatNullAs; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTreatNullAs2605); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTreatNullAs"


    // $ANTLR start "ruleTreatNullAs"
    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1110:1: ruleTreatNullAs returns [EObject current=null] : ( () otherlv_1= 'TreatNullAs' otherlv_2= '=' otherlv_3= 'EmptyString' ) ;
    public final EObject ruleTreatNullAs() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1113:28: ( ( () otherlv_1= 'TreatNullAs' otherlv_2= '=' otherlv_3= 'EmptyString' ) )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1114:1: ( () otherlv_1= 'TreatNullAs' otherlv_2= '=' otherlv_3= 'EmptyString' )
            {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1114:1: ( () otherlv_1= 'TreatNullAs' otherlv_2= '=' otherlv_3= 'EmptyString' )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1114:2: () otherlv_1= 'TreatNullAs' otherlv_2= '=' otherlv_3= 'EmptyString'
            {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1114:2: ()
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1115:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getTreatNullAsAccess().getTreatNullAsAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,45,FOLLOW_45_in_ruleTreatNullAs2654); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getTreatNullAsAccess().getTreatNullAsKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,37,FOLLOW_37_in_ruleTreatNullAs2666); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getTreatNullAsAccess().getEqualsSignKeyword_2());
                  
            }
            otherlv_3=(Token)match(input,46,FOLLOW_46_in_ruleTreatNullAs2678); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getTreatNullAsAccess().getEmptyStringKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleTreatNullAs"


    // $ANTLR start "entryRuleTreatUndefinedAs"
    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1143:1: entryRuleTreatUndefinedAs returns [EObject current=null] : iv_ruleTreatUndefinedAs= ruleTreatUndefinedAs EOF ;
    public final EObject entryRuleTreatUndefinedAs() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTreatUndefinedAs = null;


        try {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1144:2: (iv_ruleTreatUndefinedAs= ruleTreatUndefinedAs EOF )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1145:2: iv_ruleTreatUndefinedAs= ruleTreatUndefinedAs EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTreatUndefinedAsRule()); 
            }
            pushFollow(FOLLOW_ruleTreatUndefinedAs_in_entryRuleTreatUndefinedAs2714);
            iv_ruleTreatUndefinedAs=ruleTreatUndefinedAs();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTreatUndefinedAs; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTreatUndefinedAs2724); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTreatUndefinedAs"


    // $ANTLR start "ruleTreatUndefinedAs"
    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1152:1: ruleTreatUndefinedAs returns [EObject current=null] : ( ( () otherlv_1= 'TreatUndefinedAs' otherlv_2= '=' ( (lv_asEmptyString_3_0= 'EmptyString' ) ) ) | ( () otherlv_5= 'TreatUndefinedAs' otherlv_6= '=' ( (lv_asNull_7_0= 'null' ) ) ) ) ;
    public final EObject ruleTreatUndefinedAs() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_asEmptyString_3_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_asNull_7_0=null;

         enterRule(); 
            
        try {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1155:28: ( ( ( () otherlv_1= 'TreatUndefinedAs' otherlv_2= '=' ( (lv_asEmptyString_3_0= 'EmptyString' ) ) ) | ( () otherlv_5= 'TreatUndefinedAs' otherlv_6= '=' ( (lv_asNull_7_0= 'null' ) ) ) ) )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1156:1: ( ( () otherlv_1= 'TreatUndefinedAs' otherlv_2= '=' ( (lv_asEmptyString_3_0= 'EmptyString' ) ) ) | ( () otherlv_5= 'TreatUndefinedAs' otherlv_6= '=' ( (lv_asNull_7_0= 'null' ) ) ) )
            {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1156:1: ( ( () otherlv_1= 'TreatUndefinedAs' otherlv_2= '=' ( (lv_asEmptyString_3_0= 'EmptyString' ) ) ) | ( () otherlv_5= 'TreatUndefinedAs' otherlv_6= '=' ( (lv_asNull_7_0= 'null' ) ) ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==47) ) {
                int LA19_1 = input.LA(2);

                if ( (LA19_1==37) ) {
                    int LA19_2 = input.LA(3);

                    if ( (LA19_2==48) ) {
                        alt19=2;
                    }
                    else if ( (LA19_2==46) ) {
                        alt19=1;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 19, 2, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 19, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1156:2: ( () otherlv_1= 'TreatUndefinedAs' otherlv_2= '=' ( (lv_asEmptyString_3_0= 'EmptyString' ) ) )
                    {
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1156:2: ( () otherlv_1= 'TreatUndefinedAs' otherlv_2= '=' ( (lv_asEmptyString_3_0= 'EmptyString' ) ) )
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1156:3: () otherlv_1= 'TreatUndefinedAs' otherlv_2= '=' ( (lv_asEmptyString_3_0= 'EmptyString' ) )
                    {
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1156:3: ()
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1157:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getTreatUndefinedAsAccess().getTreatUndefinedAsAction_0_0(),
                                  current);
                          
                    }

                    }

                    otherlv_1=(Token)match(input,47,FOLLOW_47_in_ruleTreatUndefinedAs2774); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getTreatUndefinedAsAccess().getTreatUndefinedAsKeyword_0_1());
                          
                    }
                    otherlv_2=(Token)match(input,37,FOLLOW_37_in_ruleTreatUndefinedAs2786); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getTreatUndefinedAsAccess().getEqualsSignKeyword_0_2());
                          
                    }
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1173:1: ( (lv_asEmptyString_3_0= 'EmptyString' ) )
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1174:1: (lv_asEmptyString_3_0= 'EmptyString' )
                    {
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1174:1: (lv_asEmptyString_3_0= 'EmptyString' )
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1175:3: lv_asEmptyString_3_0= 'EmptyString'
                    {
                    lv_asEmptyString_3_0=(Token)match(input,46,FOLLOW_46_in_ruleTreatUndefinedAs2804); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_asEmptyString_3_0, grammarAccess.getTreatUndefinedAsAccess().getAsEmptyStringEmptyStringKeyword_0_3_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getTreatUndefinedAsRule());
                      	        }
                             		setWithLastConsumed(current, "asEmptyString", true, "EmptyString");
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1189:6: ( () otherlv_5= 'TreatUndefinedAs' otherlv_6= '=' ( (lv_asNull_7_0= 'null' ) ) )
                    {
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1189:6: ( () otherlv_5= 'TreatUndefinedAs' otherlv_6= '=' ( (lv_asNull_7_0= 'null' ) ) )
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1189:7: () otherlv_5= 'TreatUndefinedAs' otherlv_6= '=' ( (lv_asNull_7_0= 'null' ) )
                    {
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1189:7: ()
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1190:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getTreatUndefinedAsAccess().getTreatUndefinedAsAction_1_0(),
                                  current);
                          
                    }

                    }

                    otherlv_5=(Token)match(input,47,FOLLOW_47_in_ruleTreatUndefinedAs2849); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getTreatUndefinedAsAccess().getTreatUndefinedAsKeyword_1_1());
                          
                    }
                    otherlv_6=(Token)match(input,37,FOLLOW_37_in_ruleTreatUndefinedAs2861); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getTreatUndefinedAsAccess().getEqualsSignKeyword_1_2());
                          
                    }
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1206:1: ( (lv_asNull_7_0= 'null' ) )
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1207:1: (lv_asNull_7_0= 'null' )
                    {
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1207:1: (lv_asNull_7_0= 'null' )
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1208:3: lv_asNull_7_0= 'null'
                    {
                    lv_asNull_7_0=(Token)match(input,48,FOLLOW_48_in_ruleTreatUndefinedAs2879); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_asNull_7_0, grammarAccess.getTreatUndefinedAsAccess().getAsNullNullKeyword_1_3_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getTreatUndefinedAsRule());
                      	        }
                             		setWithLastConsumed(current, "asNull", true, "null");
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleTreatUndefinedAs"


    // $ANTLR start "entryRuleAllowAny"
    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1229:1: entryRuleAllowAny returns [EObject current=null] : iv_ruleAllowAny= ruleAllowAny EOF ;
    public final EObject entryRuleAllowAny() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAllowAny = null;


        try {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1230:2: (iv_ruleAllowAny= ruleAllowAny EOF )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1231:2: iv_ruleAllowAny= ruleAllowAny EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAllowAnyRule()); 
            }
            pushFollow(FOLLOW_ruleAllowAny_in_entryRuleAllowAny2929);
            iv_ruleAllowAny=ruleAllowAny();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAllowAny; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAllowAny2939); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAllowAny"


    // $ANTLR start "ruleAllowAny"
    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1238:1: ruleAllowAny returns [EObject current=null] : ( () otherlv_1= 'AllowAny' ) ;
    public final EObject ruleAllowAny() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1241:28: ( ( () otherlv_1= 'AllowAny' ) )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1242:1: ( () otherlv_1= 'AllowAny' )
            {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1242:1: ( () otherlv_1= 'AllowAny' )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1242:2: () otherlv_1= 'AllowAny'
            {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1242:2: ()
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1243:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getAllowAnyAccess().getAllowAnyAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,49,FOLLOW_49_in_ruleAllowAny2988); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getAllowAnyAccess().getAllowAnyKeyword_1());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleAllowAny"


    // $ANTLR start "entryRuleReplaceable"
    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1263:1: entryRuleReplaceable returns [EObject current=null] : iv_ruleReplaceable= ruleReplaceable EOF ;
    public final EObject entryRuleReplaceable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReplaceable = null;


        try {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1264:2: (iv_ruleReplaceable= ruleReplaceable EOF )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1265:2: iv_ruleReplaceable= ruleReplaceable EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReplaceableRule()); 
            }
            pushFollow(FOLLOW_ruleReplaceable_in_entryRuleReplaceable3024);
            iv_ruleReplaceable=ruleReplaceable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReplaceable; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleReplaceable3034); if (state.failed) return current;

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
    // $ANTLR end "entryRuleReplaceable"


    // $ANTLR start "ruleReplaceable"
    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1272:1: ruleReplaceable returns [EObject current=null] : ( () otherlv_1= 'Replaceable' ) ;
    public final EObject ruleReplaceable() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1275:28: ( ( () otherlv_1= 'Replaceable' ) )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1276:1: ( () otherlv_1= 'Replaceable' )
            {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1276:1: ( () otherlv_1= 'Replaceable' )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1276:2: () otherlv_1= 'Replaceable'
            {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1276:2: ()
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1277:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getReplaceableAccess().getReplaceableAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,50,FOLLOW_50_in_ruleReplaceable3083); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getReplaceableAccess().getReplaceableKeyword_1());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleReplaceable"


    // $ANTLR start "entryRuleSupplemental"
    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1297:1: entryRuleSupplemental returns [EObject current=null] : iv_ruleSupplemental= ruleSupplemental EOF ;
    public final EObject entryRuleSupplemental() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSupplemental = null;


        try {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1298:2: (iv_ruleSupplemental= ruleSupplemental EOF )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1299:2: iv_ruleSupplemental= ruleSupplemental EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSupplementalRule()); 
            }
            pushFollow(FOLLOW_ruleSupplemental_in_entryRuleSupplemental3119);
            iv_ruleSupplemental=ruleSupplemental();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSupplemental; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSupplemental3129); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSupplemental"


    // $ANTLR start "ruleSupplemental"
    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1306:1: ruleSupplemental returns [EObject current=null] : ( () otherlv_1= 'Supplemental' ) ;
    public final EObject ruleSupplemental() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1309:28: ( ( () otherlv_1= 'Supplemental' ) )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1310:1: ( () otherlv_1= 'Supplemental' )
            {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1310:1: ( () otherlv_1= 'Supplemental' )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1310:2: () otherlv_1= 'Supplemental'
            {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1310:2: ()
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1311:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getSupplementalAccess().getSupplementalAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,51,FOLLOW_51_in_ruleSupplemental3178); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getSupplementalAccess().getSupplementalKeyword_1());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleSupplemental"


    // $ANTLR start "entryRuleReplaceableNamedProperties"
    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1331:1: entryRuleReplaceableNamedProperties returns [EObject current=null] : iv_ruleReplaceableNamedProperties= ruleReplaceableNamedProperties EOF ;
    public final EObject entryRuleReplaceableNamedProperties() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReplaceableNamedProperties = null;


        try {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1332:2: (iv_ruleReplaceableNamedProperties= ruleReplaceableNamedProperties EOF )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1333:2: iv_ruleReplaceableNamedProperties= ruleReplaceableNamedProperties EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReplaceableNamedPropertiesRule()); 
            }
            pushFollow(FOLLOW_ruleReplaceableNamedProperties_in_entryRuleReplaceableNamedProperties3214);
            iv_ruleReplaceableNamedProperties=ruleReplaceableNamedProperties();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReplaceableNamedProperties; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleReplaceableNamedProperties3224); if (state.failed) return current;

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
    // $ANTLR end "entryRuleReplaceableNamedProperties"


    // $ANTLR start "ruleReplaceableNamedProperties"
    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1340:1: ruleReplaceableNamedProperties returns [EObject current=null] : ( () otherlv_1= 'ReplaceableNamedProperties' ) ;
    public final EObject ruleReplaceableNamedProperties() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1343:28: ( ( () otherlv_1= 'ReplaceableNamedProperties' ) )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1344:1: ( () otherlv_1= 'ReplaceableNamedProperties' )
            {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1344:1: ( () otherlv_1= 'ReplaceableNamedProperties' )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1344:2: () otherlv_1= 'ReplaceableNamedProperties'
            {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1344:2: ()
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1345:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getReplaceableNamedPropertiesAccess().getReplaceableNamedPropertiesAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,52,FOLLOW_52_in_ruleReplaceableNamedProperties3273); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getReplaceableNamedPropertiesAccess().getReplaceableNamedPropertiesKeyword_1());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleReplaceableNamedProperties"


    // $ANTLR start "entryRuleAbstractDefinitions"
    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1365:1: entryRuleAbstractDefinitions returns [EObject current=null] : iv_ruleAbstractDefinitions= ruleAbstractDefinitions EOF ;
    public final EObject entryRuleAbstractDefinitions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractDefinitions = null;


        try {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1366:2: (iv_ruleAbstractDefinitions= ruleAbstractDefinitions EOF )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1367:2: iv_ruleAbstractDefinitions= ruleAbstractDefinitions EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAbstractDefinitionsRule()); 
            }
            pushFollow(FOLLOW_ruleAbstractDefinitions_in_entryRuleAbstractDefinitions3309);
            iv_ruleAbstractDefinitions=ruleAbstractDefinitions();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAbstractDefinitions; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractDefinitions3319); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAbstractDefinitions"


    // $ANTLR start "ruleAbstractDefinitions"
    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1374:1: ruleAbstractDefinitions returns [EObject current=null] : (this_Definitions_0= ruleDefinitions | this_Module_1= ruleModule ) ;
    public final EObject ruleAbstractDefinitions() throws RecognitionException {
        EObject current = null;

        EObject this_Definitions_0 = null;

        EObject this_Module_1 = null;


         enterRule(); 
            
        try {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1377:28: ( (this_Definitions_0= ruleDefinitions | this_Module_1= ruleModule ) )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1378:1: (this_Definitions_0= ruleDefinitions | this_Module_1= ruleModule )
            {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1378:1: (this_Definitions_0= ruleDefinitions | this_Module_1= ruleModule )
            int alt20=2;
            switch ( input.LA(1) ) {
            case 54:
                {
                int LA20_1 = input.LA(2);

                if ( (LA20_1==32||LA20_1==36||LA20_1==38||(LA20_1>=41 && LA20_1<=43)||(LA20_1>=51 && LA20_1<=52)) ) {
                    alt20=1;
                }
                else if ( ((LA20_1>=59 && LA20_1<=60)) ) {
                    alt20=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 20, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
            case 13:
            case 61:
            case 75:
                {
                alt20=1;
                }
                break;
            case 56:
                {
                alt20=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1379:2: this_Definitions_0= ruleDefinitions
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAbstractDefinitionsAccess().getDefinitionsParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleDefinitions_in_ruleAbstractDefinitions3369);
                    this_Definitions_0=ruleDefinitions();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Definitions_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1392:2: this_Module_1= ruleModule
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAbstractDefinitionsAccess().getModuleParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleModule_in_ruleAbstractDefinitions3399);
                    this_Module_1=ruleModule();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Module_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleAbstractDefinitions"


    // $ANTLR start "entryRuleDefinitions"
    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1411:1: entryRuleDefinitions returns [EObject current=null] : iv_ruleDefinitions= ruleDefinitions EOF ;
    public final EObject entryRuleDefinitions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefinitions = null;


        try {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1412:2: (iv_ruleDefinitions= ruleDefinitions EOF )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1413:2: iv_ruleDefinitions= ruleDefinitions EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDefinitionsRule()); 
            }
            pushFollow(FOLLOW_ruleDefinitions_in_entryRuleDefinitions3434);
            iv_ruleDefinitions=ruleDefinitions();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDefinitions; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefinitions3444); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDefinitions"


    // $ANTLR start "ruleDefinitions"
    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1420:1: ruleDefinitions returns [EObject current=null] : (this_Interface_0= ruleInterface | this_Exception_1= ruleException | this_TypeDef_2= ruleTypeDef | this_ImplementStatement_3= ruleImplementStatement ) ;
    public final EObject ruleDefinitions() throws RecognitionException {
        EObject current = null;

        EObject this_Interface_0 = null;

        EObject this_Exception_1 = null;

        EObject this_TypeDef_2 = null;

        EObject this_ImplementStatement_3 = null;


         enterRule(); 
            
        try {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1423:28: ( (this_Interface_0= ruleInterface | this_Exception_1= ruleException | this_TypeDef_2= ruleTypeDef | this_ImplementStatement_3= ruleImplementStatement ) )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1424:1: (this_Interface_0= ruleInterface | this_Exception_1= ruleException | this_TypeDef_2= ruleTypeDef | this_ImplementStatement_3= ruleImplementStatement )
            {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1424:1: (this_Interface_0= ruleInterface | this_Exception_1= ruleException | this_TypeDef_2= ruleTypeDef | this_ImplementStatement_3= ruleImplementStatement )
            int alt21=4;
            alt21 = dfa21.predict(input);
            switch (alt21) {
                case 1 :
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1425:2: this_Interface_0= ruleInterface
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDefinitionsAccess().getInterfaceParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleInterface_in_ruleDefinitions3494);
                    this_Interface_0=ruleInterface();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Interface_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1438:2: this_Exception_1= ruleException
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDefinitionsAccess().getExceptionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleException_in_ruleDefinitions3524);
                    this_Exception_1=ruleException();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Exception_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1451:2: this_TypeDef_2= ruleTypeDef
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDefinitionsAccess().getTypeDefParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleTypeDef_in_ruleDefinitions3554);
                    this_TypeDef_2=ruleTypeDef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_TypeDef_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1464:2: this_ImplementStatement_3= ruleImplementStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDefinitionsAccess().getImplementStatementParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleImplementStatement_in_ruleDefinitions3584);
                    this_ImplementStatement_3=ruleImplementStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ImplementStatement_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleDefinitions"


    // $ANTLR start "entryRuleImplementStatement"
    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1483:1: entryRuleImplementStatement returns [EObject current=null] : iv_ruleImplementStatement= ruleImplementStatement EOF ;
    public final EObject entryRuleImplementStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImplementStatement = null;


        try {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1484:2: (iv_ruleImplementStatement= ruleImplementStatement EOF )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1485:2: iv_ruleImplementStatement= ruleImplementStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImplementStatementRule()); 
            }
            pushFollow(FOLLOW_ruleImplementStatement_in_entryRuleImplementStatement3619);
            iv_ruleImplementStatement=ruleImplementStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImplementStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleImplementStatement3629); if (state.failed) return current;

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
    // $ANTLR end "entryRuleImplementStatement"


    // $ANTLR start "ruleImplementStatement"
    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1492:1: ruleImplementStatement returns [EObject current=null] : ( ( ( ruleScopedName ) ) otherlv_1= 'implements' ( ( ruleScopedName ) ) otherlv_3= ';' ) ;
    public final EObject ruleImplementStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1495:28: ( ( ( ( ruleScopedName ) ) otherlv_1= 'implements' ( ( ruleScopedName ) ) otherlv_3= ';' ) )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1496:1: ( ( ( ruleScopedName ) ) otherlv_1= 'implements' ( ( ruleScopedName ) ) otherlv_3= ';' )
            {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1496:1: ( ( ( ruleScopedName ) ) otherlv_1= 'implements' ( ( ruleScopedName ) ) otherlv_3= ';' )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1496:2: ( ( ruleScopedName ) ) otherlv_1= 'implements' ( ( ruleScopedName ) ) otherlv_3= ';'
            {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1496:2: ( ( ruleScopedName ) )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1497:1: ( ruleScopedName )
            {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1497:1: ( ruleScopedName )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1498:3: ruleScopedName
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getImplementStatementRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getImplementStatementAccess().getSourceInterfaceCrossReference_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleScopedName_in_ruleImplementStatement3681);
            ruleScopedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,53,FOLLOW_53_in_ruleImplementStatement3693); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getImplementStatementAccess().getImplementsKeyword_1());
                  
            }
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1518:1: ( ( ruleScopedName ) )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1519:1: ( ruleScopedName )
            {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1519:1: ( ruleScopedName )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1520:3: ruleScopedName
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getImplementStatementRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getImplementStatementAccess().getTargetInterfaceCrossReference_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleScopedName_in_ruleImplementStatement3720);
            ruleScopedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_12_in_ruleImplementStatement3732); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getImplementStatementAccess().getSemicolonKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleImplementStatement"


    // $ANTLR start "entryRuleModule"
    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1548:1: entryRuleModule returns [EObject current=null] : iv_ruleModule= ruleModule EOF ;
    public final EObject entryRuleModule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModule = null;


        try {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1549:2: (iv_ruleModule= ruleModule EOF )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1550:2: iv_ruleModule= ruleModule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModuleRule()); 
            }
            pushFollow(FOLLOW_ruleModule_in_entryRuleModule3768);
            iv_ruleModule=ruleModule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModule; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleModule3778); if (state.failed) return current;

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
    // $ANTLR end "entryRuleModule"


    // $ANTLR start "ruleModule"
    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1557:1: ruleModule returns [EObject current=null] : ( (otherlv_0= '[' ( (lv_extendedAttributes_1_0= ruleModuleExtendedAttribute ) ) (otherlv_2= ',' ( (lv_extendedAttributes_3_0= ruleModuleExtendedAttribute ) ) )* otherlv_4= ']' )? otherlv_5= 'module' ( (lv_name_6_0= ruleScopedName ) ) otherlv_7= '{' ( (lv_definitions_8_0= ruleAbstractDefinitions ) )+ otherlv_9= '}' otherlv_10= ';' ) ;
    public final EObject ruleModule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        EObject lv_extendedAttributes_1_0 = null;

        EObject lv_extendedAttributes_3_0 = null;

        AntlrDatatypeRuleToken lv_name_6_0 = null;

        EObject lv_definitions_8_0 = null;


         enterRule(); 
            
        try {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1560:28: ( ( (otherlv_0= '[' ( (lv_extendedAttributes_1_0= ruleModuleExtendedAttribute ) ) (otherlv_2= ',' ( (lv_extendedAttributes_3_0= ruleModuleExtendedAttribute ) ) )* otherlv_4= ']' )? otherlv_5= 'module' ( (lv_name_6_0= ruleScopedName ) ) otherlv_7= '{' ( (lv_definitions_8_0= ruleAbstractDefinitions ) )+ otherlv_9= '}' otherlv_10= ';' ) )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1561:1: ( (otherlv_0= '[' ( (lv_extendedAttributes_1_0= ruleModuleExtendedAttribute ) ) (otherlv_2= ',' ( (lv_extendedAttributes_3_0= ruleModuleExtendedAttribute ) ) )* otherlv_4= ']' )? otherlv_5= 'module' ( (lv_name_6_0= ruleScopedName ) ) otherlv_7= '{' ( (lv_definitions_8_0= ruleAbstractDefinitions ) )+ otherlv_9= '}' otherlv_10= ';' )
            {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1561:1: ( (otherlv_0= '[' ( (lv_extendedAttributes_1_0= ruleModuleExtendedAttribute ) ) (otherlv_2= ',' ( (lv_extendedAttributes_3_0= ruleModuleExtendedAttribute ) ) )* otherlv_4= ']' )? otherlv_5= 'module' ( (lv_name_6_0= ruleScopedName ) ) otherlv_7= '{' ( (lv_definitions_8_0= ruleAbstractDefinitions ) )+ otherlv_9= '}' otherlv_10= ';' )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1561:2: (otherlv_0= '[' ( (lv_extendedAttributes_1_0= ruleModuleExtendedAttribute ) ) (otherlv_2= ',' ( (lv_extendedAttributes_3_0= ruleModuleExtendedAttribute ) ) )* otherlv_4= ']' )? otherlv_5= 'module' ( (lv_name_6_0= ruleScopedName ) ) otherlv_7= '{' ( (lv_definitions_8_0= ruleAbstractDefinitions ) )+ otherlv_9= '}' otherlv_10= ';'
            {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1561:2: (otherlv_0= '[' ( (lv_extendedAttributes_1_0= ruleModuleExtendedAttribute ) ) (otherlv_2= ',' ( (lv_extendedAttributes_3_0= ruleModuleExtendedAttribute ) ) )* otherlv_4= ']' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==54) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1561:4: otherlv_0= '[' ( (lv_extendedAttributes_1_0= ruleModuleExtendedAttribute ) ) (otherlv_2= ',' ( (lv_extendedAttributes_3_0= ruleModuleExtendedAttribute ) ) )* otherlv_4= ']'
                    {
                    otherlv_0=(Token)match(input,54,FOLLOW_54_in_ruleModule3816); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getModuleAccess().getLeftSquareBracketKeyword_0_0());
                          
                    }
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1565:1: ( (lv_extendedAttributes_1_0= ruleModuleExtendedAttribute ) )
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1566:1: (lv_extendedAttributes_1_0= ruleModuleExtendedAttribute )
                    {
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1566:1: (lv_extendedAttributes_1_0= ruleModuleExtendedAttribute )
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1567:3: lv_extendedAttributes_1_0= ruleModuleExtendedAttribute
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getModuleAccess().getExtendedAttributesModuleExtendedAttributeParserRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleModuleExtendedAttribute_in_ruleModule3837);
                    lv_extendedAttributes_1_0=ruleModuleExtendedAttribute();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getModuleRule());
                      	        }
                             		add(
                             			current, 
                             			"extendedAttributes",
                              		lv_extendedAttributes_1_0, 
                              		"ModuleExtendedAttribute");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1583:2: (otherlv_2= ',' ( (lv_extendedAttributes_3_0= ruleModuleExtendedAttribute ) ) )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==34) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1583:4: otherlv_2= ',' ( (lv_extendedAttributes_3_0= ruleModuleExtendedAttribute ) )
                    	    {
                    	    otherlv_2=(Token)match(input,34,FOLLOW_34_in_ruleModule3850); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getModuleAccess().getCommaKeyword_0_2_0());
                    	          
                    	    }
                    	    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1587:1: ( (lv_extendedAttributes_3_0= ruleModuleExtendedAttribute ) )
                    	    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1588:1: (lv_extendedAttributes_3_0= ruleModuleExtendedAttribute )
                    	    {
                    	    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1588:1: (lv_extendedAttributes_3_0= ruleModuleExtendedAttribute )
                    	    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1589:3: lv_extendedAttributes_3_0= ruleModuleExtendedAttribute
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getModuleAccess().getExtendedAttributesModuleExtendedAttributeParserRuleCall_0_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleModuleExtendedAttribute_in_ruleModule3871);
                    	    lv_extendedAttributes_3_0=ruleModuleExtendedAttribute();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getModuleRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"extendedAttributes",
                    	              		lv_extendedAttributes_3_0, 
                    	              		"ModuleExtendedAttribute");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop22;
                        }
                    } while (true);

                    otherlv_4=(Token)match(input,55,FOLLOW_55_in_ruleModule3885); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getModuleAccess().getRightSquareBracketKeyword_0_3());
                          
                    }

                    }
                    break;

            }

            otherlv_5=(Token)match(input,56,FOLLOW_56_in_ruleModule3899); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getModuleAccess().getModuleKeyword_1());
                  
            }
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1613:1: ( (lv_name_6_0= ruleScopedName ) )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1614:1: (lv_name_6_0= ruleScopedName )
            {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1614:1: (lv_name_6_0= ruleScopedName )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1615:3: lv_name_6_0= ruleScopedName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getModuleAccess().getNameScopedNameParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleScopedName_in_ruleModule3920);
            lv_name_6_0=ruleScopedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getModuleRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_6_0, 
                      		"ScopedName");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_7=(Token)match(input,57,FOLLOW_57_in_ruleModule3932); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getModuleAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1635:1: ( (lv_definitions_8_0= ruleAbstractDefinitions ) )+
            int cnt24=0;
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==RULE_ID||LA24_0==13||LA24_0==54||LA24_0==56||LA24_0==61||LA24_0==75) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1636:1: (lv_definitions_8_0= ruleAbstractDefinitions )
            	    {
            	    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1636:1: (lv_definitions_8_0= ruleAbstractDefinitions )
            	    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1637:3: lv_definitions_8_0= ruleAbstractDefinitions
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getModuleAccess().getDefinitionsAbstractDefinitionsParserRuleCall_4_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAbstractDefinitions_in_ruleModule3953);
            	    lv_definitions_8_0=ruleAbstractDefinitions();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getModuleRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"definitions",
            	              		lv_definitions_8_0, 
            	              		"AbstractDefinitions");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt24 >= 1 ) break loop24;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(24, input);
                        throw eee;
                }
                cnt24++;
            } while (true);

            otherlv_9=(Token)match(input,58,FOLLOW_58_in_ruleModule3966); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_9, grammarAccess.getModuleAccess().getRightCurlyBracketKeyword_5());
                  
            }
            otherlv_10=(Token)match(input,12,FOLLOW_12_in_ruleModule3978); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_10, grammarAccess.getModuleAccess().getSemicolonKeyword_6());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleModule"


    // $ANTLR start "entryRuleModuleExtendedAttribute"
    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1669:1: entryRuleModuleExtendedAttribute returns [EObject current=null] : iv_ruleModuleExtendedAttribute= ruleModuleExtendedAttribute EOF ;
    public final EObject entryRuleModuleExtendedAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModuleExtendedAttribute = null;


        try {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1670:2: (iv_ruleModuleExtendedAttribute= ruleModuleExtendedAttribute EOF )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1671:2: iv_ruleModuleExtendedAttribute= ruleModuleExtendedAttribute EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModuleExtendedAttributeRule()); 
            }
            pushFollow(FOLLOW_ruleModuleExtendedAttribute_in_entryRuleModuleExtendedAttribute4014);
            iv_ruleModuleExtendedAttribute=ruleModuleExtendedAttribute();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModuleExtendedAttribute; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleModuleExtendedAttribute4024); if (state.failed) return current;

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
    // $ANTLR end "entryRuleModuleExtendedAttribute"


    // $ANTLR start "ruleModuleExtendedAttribute"
    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1678:1: ruleModuleExtendedAttribute returns [EObject current=null] : (this_Prefix_0= rulePrefix | this_NamespaceObject_1= ruleNamespaceObject ) ;
    public final EObject ruleModuleExtendedAttribute() throws RecognitionException {
        EObject current = null;

        EObject this_Prefix_0 = null;

        EObject this_NamespaceObject_1 = null;


         enterRule(); 
            
        try {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1681:28: ( (this_Prefix_0= rulePrefix | this_NamespaceObject_1= ruleNamespaceObject ) )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1682:1: (this_Prefix_0= rulePrefix | this_NamespaceObject_1= ruleNamespaceObject )
            {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1682:1: (this_Prefix_0= rulePrefix | this_NamespaceObject_1= ruleNamespaceObject )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==59) ) {
                alt25=1;
            }
            else if ( (LA25_0==60) ) {
                alt25=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1683:2: this_Prefix_0= rulePrefix
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getModuleExtendedAttributeAccess().getPrefixParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_rulePrefix_in_ruleModuleExtendedAttribute4074);
                    this_Prefix_0=rulePrefix();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Prefix_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1696:2: this_NamespaceObject_1= ruleNamespaceObject
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getModuleExtendedAttributeAccess().getNamespaceObjectParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNamespaceObject_in_ruleModuleExtendedAttribute4104);
                    this_NamespaceObject_1=ruleNamespaceObject();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_NamespaceObject_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleModuleExtendedAttribute"


    // $ANTLR start "entryRulePrefix"
    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1715:1: entryRulePrefix returns [EObject current=null] : iv_rulePrefix= rulePrefix EOF ;
    public final EObject entryRulePrefix() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrefix = null;


        try {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1716:2: (iv_rulePrefix= rulePrefix EOF )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1717:2: iv_rulePrefix= rulePrefix EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrefixRule()); 
            }
            pushFollow(FOLLOW_rulePrefix_in_entryRulePrefix4139);
            iv_rulePrefix=rulePrefix();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrefix; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePrefix4149); if (state.failed) return current;

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
    // $ANTLR end "entryRulePrefix"


    // $ANTLR start "rulePrefix"
    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1724:1: rulePrefix returns [EObject current=null] : (otherlv_0= 'Prefix' otherlv_1= '=' ( (lv_value_2_0= ruleScopedName ) ) ) ;
    public final EObject rulePrefix() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1727:28: ( (otherlv_0= 'Prefix' otherlv_1= '=' ( (lv_value_2_0= ruleScopedName ) ) ) )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1728:1: (otherlv_0= 'Prefix' otherlv_1= '=' ( (lv_value_2_0= ruleScopedName ) ) )
            {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1728:1: (otherlv_0= 'Prefix' otherlv_1= '=' ( (lv_value_2_0= ruleScopedName ) ) )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1728:3: otherlv_0= 'Prefix' otherlv_1= '=' ( (lv_value_2_0= ruleScopedName ) )
            {
            otherlv_0=(Token)match(input,59,FOLLOW_59_in_rulePrefix4186); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getPrefixAccess().getPrefixKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,37,FOLLOW_37_in_rulePrefix4198); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getPrefixAccess().getEqualsSignKeyword_1());
                  
            }
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1736:1: ( (lv_value_2_0= ruleScopedName ) )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1737:1: (lv_value_2_0= ruleScopedName )
            {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1737:1: (lv_value_2_0= ruleScopedName )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1738:3: lv_value_2_0= ruleScopedName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPrefixAccess().getValueScopedNameParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleScopedName_in_rulePrefix4219);
            lv_value_2_0=ruleScopedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getPrefixRule());
              	        }
                     		add(
                     			current, 
                     			"value",
                      		lv_value_2_0, 
                      		"ScopedName");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "rulePrefix"


    // $ANTLR start "entryRuleNamespaceObject"
    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1762:1: entryRuleNamespaceObject returns [EObject current=null] : iv_ruleNamespaceObject= ruleNamespaceObject EOF ;
    public final EObject entryRuleNamespaceObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamespaceObject = null;


        try {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1763:2: (iv_ruleNamespaceObject= ruleNamespaceObject EOF )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1764:2: iv_ruleNamespaceObject= ruleNamespaceObject EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNamespaceObjectRule()); 
            }
            pushFollow(FOLLOW_ruleNamespaceObject_in_entryRuleNamespaceObject4255);
            iv_ruleNamespaceObject=ruleNamespaceObject();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNamespaceObject; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNamespaceObject4265); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNamespaceObject"


    // $ANTLR start "ruleNamespaceObject"
    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1771:1: ruleNamespaceObject returns [EObject current=null] : (otherlv_0= 'NamespaceObject' () ) ;
    public final EObject ruleNamespaceObject() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1774:28: ( (otherlv_0= 'NamespaceObject' () ) )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1775:1: (otherlv_0= 'NamespaceObject' () )
            {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1775:1: (otherlv_0= 'NamespaceObject' () )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1775:3: otherlv_0= 'NamespaceObject' ()
            {
            otherlv_0=(Token)match(input,60,FOLLOW_60_in_ruleNamespaceObject4302); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getNamespaceObjectAccess().getNamespaceObjectKeyword_0());
                  
            }
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1779:1: ()
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1780:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getNamespaceObjectAccess().getNamespaceObjectAction_1(),
                          current);
                  
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleNamespaceObject"


    // $ANTLR start "entryRuleInterface"
    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1796:1: entryRuleInterface returns [EObject current=null] : iv_ruleInterface= ruleInterface EOF ;
    public final EObject entryRuleInterface() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterface = null;


        try {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1797:2: (iv_ruleInterface= ruleInterface EOF )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1798:2: iv_ruleInterface= ruleInterface EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInterfaceRule()); 
            }
            pushFollow(FOLLOW_ruleInterface_in_entryRuleInterface4350);
            iv_ruleInterface=ruleInterface();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInterface; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterface4360); if (state.failed) return current;

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
    // $ANTLR end "entryRuleInterface"


    // $ANTLR start "ruleInterface"
    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1805:1: ruleInterface returns [EObject current=null] : ( (otherlv_0= '[' ( (lv_extendedAttributes_1_0= ruleInterfaceExtendedAttribute ) ) (otherlv_2= ',' ( (lv_extendedAttribute_3_0= ruleInterfaceExtendedAttribute ) ) )* otherlv_4= ']' )? otherlv_5= 'interface' ( (lv_name_6_0= RULE_ID ) ) ( (otherlv_7= ':' ( ( ruleScopedName ) ) ) (otherlv_9= ',' ( ( ruleScopedName ) ) )* )? (otherlv_11= '{' ( (lv_members_12_0= ruleInterfaceMember ) )* otherlv_13= '}' )? otherlv_14= ';' ) ;
    public final EObject ruleInterface() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_name_6_0=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        EObject lv_extendedAttributes_1_0 = null;

        EObject lv_extendedAttribute_3_0 = null;

        EObject lv_members_12_0 = null;


         enterRule(); 
            
        try {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1808:28: ( ( (otherlv_0= '[' ( (lv_extendedAttributes_1_0= ruleInterfaceExtendedAttribute ) ) (otherlv_2= ',' ( (lv_extendedAttribute_3_0= ruleInterfaceExtendedAttribute ) ) )* otherlv_4= ']' )? otherlv_5= 'interface' ( (lv_name_6_0= RULE_ID ) ) ( (otherlv_7= ':' ( ( ruleScopedName ) ) ) (otherlv_9= ',' ( ( ruleScopedName ) ) )* )? (otherlv_11= '{' ( (lv_members_12_0= ruleInterfaceMember ) )* otherlv_13= '}' )? otherlv_14= ';' ) )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1809:1: ( (otherlv_0= '[' ( (lv_extendedAttributes_1_0= ruleInterfaceExtendedAttribute ) ) (otherlv_2= ',' ( (lv_extendedAttribute_3_0= ruleInterfaceExtendedAttribute ) ) )* otherlv_4= ']' )? otherlv_5= 'interface' ( (lv_name_6_0= RULE_ID ) ) ( (otherlv_7= ':' ( ( ruleScopedName ) ) ) (otherlv_9= ',' ( ( ruleScopedName ) ) )* )? (otherlv_11= '{' ( (lv_members_12_0= ruleInterfaceMember ) )* otherlv_13= '}' )? otherlv_14= ';' )
            {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1809:1: ( (otherlv_0= '[' ( (lv_extendedAttributes_1_0= ruleInterfaceExtendedAttribute ) ) (otherlv_2= ',' ( (lv_extendedAttribute_3_0= ruleInterfaceExtendedAttribute ) ) )* otherlv_4= ']' )? otherlv_5= 'interface' ( (lv_name_6_0= RULE_ID ) ) ( (otherlv_7= ':' ( ( ruleScopedName ) ) ) (otherlv_9= ',' ( ( ruleScopedName ) ) )* )? (otherlv_11= '{' ( (lv_members_12_0= ruleInterfaceMember ) )* otherlv_13= '}' )? otherlv_14= ';' )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1809:2: (otherlv_0= '[' ( (lv_extendedAttributes_1_0= ruleInterfaceExtendedAttribute ) ) (otherlv_2= ',' ( (lv_extendedAttribute_3_0= ruleInterfaceExtendedAttribute ) ) )* otherlv_4= ']' )? otherlv_5= 'interface' ( (lv_name_6_0= RULE_ID ) ) ( (otherlv_7= ':' ( ( ruleScopedName ) ) ) (otherlv_9= ',' ( ( ruleScopedName ) ) )* )? (otherlv_11= '{' ( (lv_members_12_0= ruleInterfaceMember ) )* otherlv_13= '}' )? otherlv_14= ';'
            {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1809:2: (otherlv_0= '[' ( (lv_extendedAttributes_1_0= ruleInterfaceExtendedAttribute ) ) (otherlv_2= ',' ( (lv_extendedAttribute_3_0= ruleInterfaceExtendedAttribute ) ) )* otherlv_4= ']' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==54) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1809:4: otherlv_0= '[' ( (lv_extendedAttributes_1_0= ruleInterfaceExtendedAttribute ) ) (otherlv_2= ',' ( (lv_extendedAttribute_3_0= ruleInterfaceExtendedAttribute ) ) )* otherlv_4= ']'
                    {
                    otherlv_0=(Token)match(input,54,FOLLOW_54_in_ruleInterface4398); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getInterfaceAccess().getLeftSquareBracketKeyword_0_0());
                          
                    }
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1813:1: ( (lv_extendedAttributes_1_0= ruleInterfaceExtendedAttribute ) )
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1814:1: (lv_extendedAttributes_1_0= ruleInterfaceExtendedAttribute )
                    {
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1814:1: (lv_extendedAttributes_1_0= ruleInterfaceExtendedAttribute )
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1815:3: lv_extendedAttributes_1_0= ruleInterfaceExtendedAttribute
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getInterfaceAccess().getExtendedAttributesInterfaceExtendedAttributeParserRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleInterfaceExtendedAttribute_in_ruleInterface4419);
                    lv_extendedAttributes_1_0=ruleInterfaceExtendedAttribute();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getInterfaceRule());
                      	        }
                             		add(
                             			current, 
                             			"extendedAttributes",
                              		lv_extendedAttributes_1_0, 
                              		"InterfaceExtendedAttribute");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1831:2: (otherlv_2= ',' ( (lv_extendedAttribute_3_0= ruleInterfaceExtendedAttribute ) ) )*
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0==34) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1831:4: otherlv_2= ',' ( (lv_extendedAttribute_3_0= ruleInterfaceExtendedAttribute ) )
                    	    {
                    	    otherlv_2=(Token)match(input,34,FOLLOW_34_in_ruleInterface4432); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getInterfaceAccess().getCommaKeyword_0_2_0());
                    	          
                    	    }
                    	    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1835:1: ( (lv_extendedAttribute_3_0= ruleInterfaceExtendedAttribute ) )
                    	    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1836:1: (lv_extendedAttribute_3_0= ruleInterfaceExtendedAttribute )
                    	    {
                    	    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1836:1: (lv_extendedAttribute_3_0= ruleInterfaceExtendedAttribute )
                    	    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1837:3: lv_extendedAttribute_3_0= ruleInterfaceExtendedAttribute
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getInterfaceAccess().getExtendedAttributeInterfaceExtendedAttributeParserRuleCall_0_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleInterfaceExtendedAttribute_in_ruleInterface4453);
                    	    lv_extendedAttribute_3_0=ruleInterfaceExtendedAttribute();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getInterfaceRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"extendedAttribute",
                    	              		lv_extendedAttribute_3_0, 
                    	              		"InterfaceExtendedAttribute");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop26;
                        }
                    } while (true);

                    otherlv_4=(Token)match(input,55,FOLLOW_55_in_ruleInterface4467); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getInterfaceAccess().getRightSquareBracketKeyword_0_3());
                          
                    }

                    }
                    break;

            }

            otherlv_5=(Token)match(input,61,FOLLOW_61_in_ruleInterface4481); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getInterfaceAccess().getInterfaceKeyword_1());
                  
            }
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1861:1: ( (lv_name_6_0= RULE_ID ) )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1862:1: (lv_name_6_0= RULE_ID )
            {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1862:1: (lv_name_6_0= RULE_ID )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1863:3: lv_name_6_0= RULE_ID
            {
            lv_name_6_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInterface4498); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_6_0, grammarAccess.getInterfaceAccess().getNameIDTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getInterfaceRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_6_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1879:2: ( (otherlv_7= ':' ( ( ruleScopedName ) ) ) (otherlv_9= ',' ( ( ruleScopedName ) ) )* )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==62) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1879:3: (otherlv_7= ':' ( ( ruleScopedName ) ) ) (otherlv_9= ',' ( ( ruleScopedName ) ) )*
                    {
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1879:3: (otherlv_7= ':' ( ( ruleScopedName ) ) )
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1879:5: otherlv_7= ':' ( ( ruleScopedName ) )
                    {
                    otherlv_7=(Token)match(input,62,FOLLOW_62_in_ruleInterface4517); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getInterfaceAccess().getColonKeyword_3_0_0());
                          
                    }
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1883:1: ( ( ruleScopedName ) )
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1884:1: ( ruleScopedName )
                    {
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1884:1: ( ruleScopedName )
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1885:3: ruleScopedName
                    {
                    if ( state.backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getInterfaceRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getInterfaceAccess().getSuperTypeInterfaceCrossReference_3_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleScopedName_in_ruleInterface4544);
                    ruleScopedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }

                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1901:3: (otherlv_9= ',' ( ( ruleScopedName ) ) )*
                    loop28:
                    do {
                        int alt28=2;
                        int LA28_0 = input.LA(1);

                        if ( (LA28_0==34) ) {
                            alt28=1;
                        }


                        switch (alt28) {
                    	case 1 :
                    	    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1901:5: otherlv_9= ',' ( ( ruleScopedName ) )
                    	    {
                    	    otherlv_9=(Token)match(input,34,FOLLOW_34_in_ruleInterface4558); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_9, grammarAccess.getInterfaceAccess().getCommaKeyword_3_1_0());
                    	          
                    	    }
                    	    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1905:1: ( ( ruleScopedName ) )
                    	    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1906:1: ( ruleScopedName )
                    	    {
                    	    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1906:1: ( ruleScopedName )
                    	    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1907:3: ruleScopedName
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      		  /* */ 
                    	      		
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      			if (current==null) {
                    	      	            current = createModelElement(grammarAccess.getInterfaceRule());
                    	      	        }
                    	              
                    	    }
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getInterfaceAccess().getSuperTypeInterfaceCrossReference_3_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleScopedName_in_ruleInterface4585);
                    	    ruleScopedName();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop28;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1923:6: (otherlv_11= '{' ( (lv_members_12_0= ruleInterfaceMember ) )* otherlv_13= '}' )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==57) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1923:8: otherlv_11= '{' ( (lv_members_12_0= ruleInterfaceMember ) )* otherlv_13= '}'
                    {
                    otherlv_11=(Token)match(input,57,FOLLOW_57_in_ruleInterface4602); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_11, grammarAccess.getInterfaceAccess().getLeftCurlyBracketKeyword_4_0());
                          
                    }
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1927:1: ( (lv_members_12_0= ruleInterfaceMember ) )*
                    loop30:
                    do {
                        int alt30=2;
                        int LA30_0 = input.LA(1);

                        if ( (LA30_0==RULE_ID||(LA30_0>=15 && LA30_0<=27)||LA30_0==29||LA30_0==54||(LA30_0>=63 && LA30_0<=64)||(LA30_0>=66 && LA30_0<=72)||LA30_0==79) ) {
                            alt30=1;
                        }


                        switch (alt30) {
                    	case 1 :
                    	    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1928:1: (lv_members_12_0= ruleInterfaceMember )
                    	    {
                    	    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1928:1: (lv_members_12_0= ruleInterfaceMember )
                    	    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1929:3: lv_members_12_0= ruleInterfaceMember
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getInterfaceAccess().getMembersInterfaceMemberParserRuleCall_4_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleInterfaceMember_in_ruleInterface4623);
                    	    lv_members_12_0=ruleInterfaceMember();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getInterfaceRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"members",
                    	              		lv_members_12_0, 
                    	              		"InterfaceMember");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop30;
                        }
                    } while (true);

                    otherlv_13=(Token)match(input,58,FOLLOW_58_in_ruleInterface4636); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getInterfaceAccess().getRightCurlyBracketKeyword_4_2());
                          
                    }

                    }
                    break;

            }

            otherlv_14=(Token)match(input,12,FOLLOW_12_in_ruleInterface4650); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_14, grammarAccess.getInterfaceAccess().getSemicolonKeyword_5());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleInterface"


    // $ANTLR start "entryRuleInterfaceExtendedAttribute"
    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1961:1: entryRuleInterfaceExtendedAttribute returns [EObject current=null] : iv_ruleInterfaceExtendedAttribute= ruleInterfaceExtendedAttribute EOF ;
    public final EObject entryRuleInterfaceExtendedAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterfaceExtendedAttribute = null;


        try {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1962:2: (iv_ruleInterfaceExtendedAttribute= ruleInterfaceExtendedAttribute EOF )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1963:2: iv_ruleInterfaceExtendedAttribute= ruleInterfaceExtendedAttribute EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInterfaceExtendedAttributeRule()); 
            }
            pushFollow(FOLLOW_ruleInterfaceExtendedAttribute_in_entryRuleInterfaceExtendedAttribute4686);
            iv_ruleInterfaceExtendedAttribute=ruleInterfaceExtendedAttribute();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInterfaceExtendedAttribute; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterfaceExtendedAttribute4696); if (state.failed) return current;

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
    // $ANTLR end "entryRuleInterfaceExtendedAttribute"


    // $ANTLR start "ruleInterfaceExtendedAttribute"
    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1970:1: ruleInterfaceExtendedAttribute returns [EObject current=null] : (this_Callback_0= ruleCallback | this_Constructor_1= ruleConstructor | this_NamedConstructor_2= ruleNamedConstructor | this_NoInterfaceObject_3= ruleNoInterfaceObject | this_PrototypeRoot_4= rulePrototypeRoot | this_Supplemental_5= ruleSupplemental | ruleOverrideBuiltins | this_ReplaceableNamedProperties_7= ruleReplaceableNamedProperties ) ;
    public final EObject ruleInterfaceExtendedAttribute() throws RecognitionException {
        EObject current = null;

        EObject this_Callback_0 = null;

        EObject this_Constructor_1 = null;

        EObject this_NamedConstructor_2 = null;

        EObject this_NoInterfaceObject_3 = null;

        EObject this_PrototypeRoot_4 = null;

        EObject this_Supplemental_5 = null;

        EObject this_ReplaceableNamedProperties_7 = null;


         enterRule(); 
            
        try {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1973:28: ( (this_Callback_0= ruleCallback | this_Constructor_1= ruleConstructor | this_NamedConstructor_2= ruleNamedConstructor | this_NoInterfaceObject_3= ruleNoInterfaceObject | this_PrototypeRoot_4= rulePrototypeRoot | this_Supplemental_5= ruleSupplemental | ruleOverrideBuiltins | this_ReplaceableNamedProperties_7= ruleReplaceableNamedProperties ) )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1974:1: (this_Callback_0= ruleCallback | this_Constructor_1= ruleConstructor | this_NamedConstructor_2= ruleNamedConstructor | this_NoInterfaceObject_3= ruleNoInterfaceObject | this_PrototypeRoot_4= rulePrototypeRoot | this_Supplemental_5= ruleSupplemental | ruleOverrideBuiltins | this_ReplaceableNamedProperties_7= ruleReplaceableNamedProperties )
            {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1974:1: (this_Callback_0= ruleCallback | this_Constructor_1= ruleConstructor | this_NamedConstructor_2= ruleNamedConstructor | this_NoInterfaceObject_3= ruleNoInterfaceObject | this_PrototypeRoot_4= rulePrototypeRoot | this_Supplemental_5= ruleSupplemental | ruleOverrideBuiltins | this_ReplaceableNamedProperties_7= ruleReplaceableNamedProperties )
            int alt32=8;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt32=1;
                }
                break;
            case 32:
                {
                alt32=2;
                }
                break;
            case 36:
                {
                alt32=3;
                }
                break;
            case 41:
                {
                alt32=4;
                }
                break;
            case 43:
                {
                alt32=5;
                }
                break;
            case 51:
                {
                alt32=6;
                }
                break;
            case 42:
                {
                alt32=7;
                }
                break;
            case 52:
                {
                alt32=8;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }

            switch (alt32) {
                case 1 :
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1975:2: this_Callback_0= ruleCallback
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getInterfaceExtendedAttributeAccess().getCallbackParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleCallback_in_ruleInterfaceExtendedAttribute4746);
                    this_Callback_0=ruleCallback();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Callback_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1988:2: this_Constructor_1= ruleConstructor
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getInterfaceExtendedAttributeAccess().getConstructorParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleConstructor_in_ruleInterfaceExtendedAttribute4776);
                    this_Constructor_1=ruleConstructor();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Constructor_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2001:2: this_NamedConstructor_2= ruleNamedConstructor
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getInterfaceExtendedAttributeAccess().getNamedConstructorParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNamedConstructor_in_ruleInterfaceExtendedAttribute4806);
                    this_NamedConstructor_2=ruleNamedConstructor();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_NamedConstructor_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2014:2: this_NoInterfaceObject_3= ruleNoInterfaceObject
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getInterfaceExtendedAttributeAccess().getNoInterfaceObjectParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNoInterfaceObject_in_ruleInterfaceExtendedAttribute4836);
                    this_NoInterfaceObject_3=ruleNoInterfaceObject();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_NoInterfaceObject_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2027:2: this_PrototypeRoot_4= rulePrototypeRoot
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getInterfaceExtendedAttributeAccess().getPrototypeRootParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_rulePrototypeRoot_in_ruleInterfaceExtendedAttribute4866);
                    this_PrototypeRoot_4=rulePrototypeRoot();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_PrototypeRoot_4; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 6 :
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2040:2: this_Supplemental_5= ruleSupplemental
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getInterfaceExtendedAttributeAccess().getSupplementalParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSupplemental_in_ruleInterfaceExtendedAttribute4896);
                    this_Supplemental_5=ruleSupplemental();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Supplemental_5; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 7 :
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2053:2: ruleOverrideBuiltins
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getInterfaceExtendedAttributeAccess().getOverrideBuiltinsParserRuleCall_6()); 
                          
                    }
                    pushFollow(FOLLOW_ruleOverrideBuiltins_in_ruleInterfaceExtendedAttribute4920);
                    ruleOverrideBuiltins();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 8 :
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2065:2: this_ReplaceableNamedProperties_7= ruleReplaceableNamedProperties
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getInterfaceExtendedAttributeAccess().getReplaceableNamedPropertiesParserRuleCall_7()); 
                          
                    }
                    pushFollow(FOLLOW_ruleReplaceableNamedProperties_in_ruleInterfaceExtendedAttribute4950);
                    this_ReplaceableNamedProperties_7=ruleReplaceableNamedProperties();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ReplaceableNamedProperties_7; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleInterfaceExtendedAttribute"


    // $ANTLR start "entryRuleInterfaceMember"
    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2084:1: entryRuleInterfaceMember returns [EObject current=null] : iv_ruleInterfaceMember= ruleInterfaceMember EOF ;
    public final EObject entryRuleInterfaceMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterfaceMember = null;


        try {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2085:2: (iv_ruleInterfaceMember= ruleInterfaceMember EOF )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2086:2: iv_ruleInterfaceMember= ruleInterfaceMember EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInterfaceMemberRule()); 
            }
            pushFollow(FOLLOW_ruleInterfaceMember_in_entryRuleInterfaceMember4985);
            iv_ruleInterfaceMember=ruleInterfaceMember();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInterfaceMember; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterfaceMember4995); if (state.failed) return current;

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
    // $ANTLR end "entryRuleInterfaceMember"


    // $ANTLR start "ruleInterfaceMember"
    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2093:1: ruleInterfaceMember returns [EObject current=null] : (this_Const_0= ruleConst | this_InterfaceFeature_1= ruleInterfaceFeature ) ;
    public final EObject ruleInterfaceMember() throws RecognitionException {
        EObject current = null;

        EObject this_Const_0 = null;

        EObject this_InterfaceFeature_1 = null;


         enterRule(); 
            
        try {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2096:28: ( (this_Const_0= ruleConst | this_InterfaceFeature_1= ruleInterfaceFeature ) )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2097:1: (this_Const_0= ruleConst | this_InterfaceFeature_1= ruleInterfaceFeature )
            {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2097:1: (this_Const_0= ruleConst | this_InterfaceFeature_1= ruleInterfaceFeature )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==79) ) {
                alt33=1;
            }
            else if ( (LA33_0==RULE_ID||(LA33_0>=15 && LA33_0<=27)||LA33_0==29||LA33_0==54||(LA33_0>=63 && LA33_0<=64)||(LA33_0>=66 && LA33_0<=72)) ) {
                alt33=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2098:2: this_Const_0= ruleConst
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getInterfaceMemberAccess().getConstParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleConst_in_ruleInterfaceMember5045);
                    this_Const_0=ruleConst();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Const_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2111:2: this_InterfaceFeature_1= ruleInterfaceFeature
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getInterfaceMemberAccess().getInterfaceFeatureParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleInterfaceFeature_in_ruleInterfaceMember5075);
                    this_InterfaceFeature_1=ruleInterfaceFeature();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_InterfaceFeature_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleInterfaceMember"


    // $ANTLR start "entryRuleInterfaceFeature"
    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2130:1: entryRuleInterfaceFeature returns [EObject current=null] : iv_ruleInterfaceFeature= ruleInterfaceFeature EOF ;
    public final EObject entryRuleInterfaceFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterfaceFeature = null;


        try {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2131:2: (iv_ruleInterfaceFeature= ruleInterfaceFeature EOF )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2132:2: iv_ruleInterfaceFeature= ruleInterfaceFeature EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInterfaceFeatureRule()); 
            }
            pushFollow(FOLLOW_ruleInterfaceFeature_in_entryRuleInterfaceFeature5110);
            iv_ruleInterfaceFeature=ruleInterfaceFeature();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInterfaceFeature; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterfaceFeature5120); if (state.failed) return current;

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
    // $ANTLR end "entryRuleInterfaceFeature"


    // $ANTLR start "ruleInterfaceFeature"
    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2139:1: ruleInterfaceFeature returns [EObject current=null] : (this_Attribute_0= ruleAttribute | this_Operation_1= ruleOperation ) ;
    public final EObject ruleInterfaceFeature() throws RecognitionException {
        EObject current = null;

        EObject this_Attribute_0 = null;

        EObject this_Operation_1 = null;


         enterRule(); 
            
        try {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2142:28: ( (this_Attribute_0= ruleAttribute | this_Operation_1= ruleOperation ) )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2143:1: (this_Attribute_0= ruleAttribute | this_Operation_1= ruleOperation )
            {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2143:1: (this_Attribute_0= ruleAttribute | this_Operation_1= ruleOperation )
            int alt34=2;
            alt34 = dfa34.predict(input);
            switch (alt34) {
                case 1 :
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2144:2: this_Attribute_0= ruleAttribute
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getInterfaceFeatureAccess().getAttributeParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAttribute_in_ruleInterfaceFeature5170);
                    this_Attribute_0=ruleAttribute();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Attribute_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2157:2: this_Operation_1= ruleOperation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getInterfaceFeatureAccess().getOperationParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleOperation_in_ruleInterfaceFeature5200);
                    this_Operation_1=ruleOperation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Operation_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleInterfaceFeature"


    // $ANTLR start "entryRuleOperation"
    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2176:1: entryRuleOperation returns [EObject current=null] : iv_ruleOperation= ruleOperation EOF ;
    public final EObject entryRuleOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperation = null;


        try {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2177:2: (iv_ruleOperation= ruleOperation EOF )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2178:2: iv_ruleOperation= ruleOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOperationRule()); 
            }
            pushFollow(FOLLOW_ruleOperation_in_entryRuleOperation5235);
            iv_ruleOperation=ruleOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOperation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOperation5245); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOperation"


    // $ANTLR start "ruleOperation"
    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2185:1: ruleOperation returns [EObject current=null] : ( (otherlv_0= '[' ( (lv_extendedAttributes_1_0= ruleOperationExtendedAttribute ) ) (otherlv_2= ',' ( (lv_extendedAttributes_3_0= ruleOperationExtendedAttribute ) ) )* otherlv_4= ']' )? ( (lv_stringifier_5_0= 'stringifier' ) )? ( (lv_omittable_6_0= 'omittable' ) )? ( (lv_specials_7_0= ruleOperationSpecial ) )* ( (lv_return_8_0= ruleTypeRef ) ) ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '(' ( ( (lv_arguments_11_0= ruleArgument ) ) (otherlv_12= ',' ( (lv_arguments_13_0= ruleArgument ) ) )* )? otherlv_14= ')' (otherlv_15= 'raises' otherlv_16= '(' ( ( ruleScopedName ) ) (otherlv_18= ',' ( ( ruleScopedName ) ) )* otherlv_20= ')' )? otherlv_21= ';' ) ;
    public final EObject ruleOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token lv_stringifier_5_0=null;
        Token lv_omittable_6_0=null;
        Token lv_name_9_0=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        EObject lv_extendedAttributes_1_0 = null;

        EObject lv_extendedAttributes_3_0 = null;

        EObject lv_specials_7_0 = null;

        EObject lv_return_8_0 = null;

        EObject lv_arguments_11_0 = null;

        EObject lv_arguments_13_0 = null;


         enterRule(); 
            
        try {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2188:28: ( ( (otherlv_0= '[' ( (lv_extendedAttributes_1_0= ruleOperationExtendedAttribute ) ) (otherlv_2= ',' ( (lv_extendedAttributes_3_0= ruleOperationExtendedAttribute ) ) )* otherlv_4= ']' )? ( (lv_stringifier_5_0= 'stringifier' ) )? ( (lv_omittable_6_0= 'omittable' ) )? ( (lv_specials_7_0= ruleOperationSpecial ) )* ( (lv_return_8_0= ruleTypeRef ) ) ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '(' ( ( (lv_arguments_11_0= ruleArgument ) ) (otherlv_12= ',' ( (lv_arguments_13_0= ruleArgument ) ) )* )? otherlv_14= ')' (otherlv_15= 'raises' otherlv_16= '(' ( ( ruleScopedName ) ) (otherlv_18= ',' ( ( ruleScopedName ) ) )* otherlv_20= ')' )? otherlv_21= ';' ) )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2189:1: ( (otherlv_0= '[' ( (lv_extendedAttributes_1_0= ruleOperationExtendedAttribute ) ) (otherlv_2= ',' ( (lv_extendedAttributes_3_0= ruleOperationExtendedAttribute ) ) )* otherlv_4= ']' )? ( (lv_stringifier_5_0= 'stringifier' ) )? ( (lv_omittable_6_0= 'omittable' ) )? ( (lv_specials_7_0= ruleOperationSpecial ) )* ( (lv_return_8_0= ruleTypeRef ) ) ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '(' ( ( (lv_arguments_11_0= ruleArgument ) ) (otherlv_12= ',' ( (lv_arguments_13_0= ruleArgument ) ) )* )? otherlv_14= ')' (otherlv_15= 'raises' otherlv_16= '(' ( ( ruleScopedName ) ) (otherlv_18= ',' ( ( ruleScopedName ) ) )* otherlv_20= ')' )? otherlv_21= ';' )
            {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2189:1: ( (otherlv_0= '[' ( (lv_extendedAttributes_1_0= ruleOperationExtendedAttribute ) ) (otherlv_2= ',' ( (lv_extendedAttributes_3_0= ruleOperationExtendedAttribute ) ) )* otherlv_4= ']' )? ( (lv_stringifier_5_0= 'stringifier' ) )? ( (lv_omittable_6_0= 'omittable' ) )? ( (lv_specials_7_0= ruleOperationSpecial ) )* ( (lv_return_8_0= ruleTypeRef ) ) ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '(' ( ( (lv_arguments_11_0= ruleArgument ) ) (otherlv_12= ',' ( (lv_arguments_13_0= ruleArgument ) ) )* )? otherlv_14= ')' (otherlv_15= 'raises' otherlv_16= '(' ( ( ruleScopedName ) ) (otherlv_18= ',' ( ( ruleScopedName ) ) )* otherlv_20= ')' )? otherlv_21= ';' )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2189:2: (otherlv_0= '[' ( (lv_extendedAttributes_1_0= ruleOperationExtendedAttribute ) ) (otherlv_2= ',' ( (lv_extendedAttributes_3_0= ruleOperationExtendedAttribute ) ) )* otherlv_4= ']' )? ( (lv_stringifier_5_0= 'stringifier' ) )? ( (lv_omittable_6_0= 'omittable' ) )? ( (lv_specials_7_0= ruleOperationSpecial ) )* ( (lv_return_8_0= ruleTypeRef ) ) ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '(' ( ( (lv_arguments_11_0= ruleArgument ) ) (otherlv_12= ',' ( (lv_arguments_13_0= ruleArgument ) ) )* )? otherlv_14= ')' (otherlv_15= 'raises' otherlv_16= '(' ( ( ruleScopedName ) ) (otherlv_18= ',' ( ( ruleScopedName ) ) )* otherlv_20= ')' )? otherlv_21= ';'
            {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2189:2: (otherlv_0= '[' ( (lv_extendedAttributes_1_0= ruleOperationExtendedAttribute ) ) (otherlv_2= ',' ( (lv_extendedAttributes_3_0= ruleOperationExtendedAttribute ) ) )* otherlv_4= ']' )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==54) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2189:4: otherlv_0= '[' ( (lv_extendedAttributes_1_0= ruleOperationExtendedAttribute ) ) (otherlv_2= ',' ( (lv_extendedAttributes_3_0= ruleOperationExtendedAttribute ) ) )* otherlv_4= ']'
                    {
                    otherlv_0=(Token)match(input,54,FOLLOW_54_in_ruleOperation5283); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getOperationAccess().getLeftSquareBracketKeyword_0_0());
                          
                    }
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2193:1: ( (lv_extendedAttributes_1_0= ruleOperationExtendedAttribute ) )
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2194:1: (lv_extendedAttributes_1_0= ruleOperationExtendedAttribute )
                    {
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2194:1: (lv_extendedAttributes_1_0= ruleOperationExtendedAttribute )
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2195:3: lv_extendedAttributes_1_0= ruleOperationExtendedAttribute
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getOperationAccess().getExtendedAttributesOperationExtendedAttributeParserRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleOperationExtendedAttribute_in_ruleOperation5304);
                    lv_extendedAttributes_1_0=ruleOperationExtendedAttribute();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getOperationRule());
                      	        }
                             		add(
                             			current, 
                             			"extendedAttributes",
                              		lv_extendedAttributes_1_0, 
                              		"OperationExtendedAttribute");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2211:2: (otherlv_2= ',' ( (lv_extendedAttributes_3_0= ruleOperationExtendedAttribute ) ) )*
                    loop35:
                    do {
                        int alt35=2;
                        int LA35_0 = input.LA(1);

                        if ( (LA35_0==34) ) {
                            alt35=1;
                        }


                        switch (alt35) {
                    	case 1 :
                    	    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2211:4: otherlv_2= ',' ( (lv_extendedAttributes_3_0= ruleOperationExtendedAttribute ) )
                    	    {
                    	    otherlv_2=(Token)match(input,34,FOLLOW_34_in_ruleOperation5317); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getOperationAccess().getCommaKeyword_0_2_0());
                    	          
                    	    }
                    	    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2215:1: ( (lv_extendedAttributes_3_0= ruleOperationExtendedAttribute ) )
                    	    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2216:1: (lv_extendedAttributes_3_0= ruleOperationExtendedAttribute )
                    	    {
                    	    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2216:1: (lv_extendedAttributes_3_0= ruleOperationExtendedAttribute )
                    	    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2217:3: lv_extendedAttributes_3_0= ruleOperationExtendedAttribute
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getOperationAccess().getExtendedAttributesOperationExtendedAttributeParserRuleCall_0_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleOperationExtendedAttribute_in_ruleOperation5338);
                    	    lv_extendedAttributes_3_0=ruleOperationExtendedAttribute();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getOperationRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"extendedAttributes",
                    	              		lv_extendedAttributes_3_0, 
                    	              		"OperationExtendedAttribute");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop35;
                        }
                    } while (true);

                    otherlv_4=(Token)match(input,55,FOLLOW_55_in_ruleOperation5352); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getOperationAccess().getRightSquareBracketKeyword_0_3());
                          
                    }

                    }
                    break;

            }

            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2237:3: ( (lv_stringifier_5_0= 'stringifier' ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==63) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2238:1: (lv_stringifier_5_0= 'stringifier' )
                    {
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2238:1: (lv_stringifier_5_0= 'stringifier' )
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2239:3: lv_stringifier_5_0= 'stringifier'
                    {
                    lv_stringifier_5_0=(Token)match(input,63,FOLLOW_63_in_ruleOperation5372); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_stringifier_5_0, grammarAccess.getOperationAccess().getStringifierStringifierKeyword_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getOperationRule());
                      	        }
                             		setWithLastConsumed(current, "stringifier", true, "stringifier");
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2252:3: ( (lv_omittable_6_0= 'omittable' ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==64) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2253:1: (lv_omittable_6_0= 'omittable' )
                    {
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2253:1: (lv_omittable_6_0= 'omittable' )
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2254:3: lv_omittable_6_0= 'omittable'
                    {
                    lv_omittable_6_0=(Token)match(input,64,FOLLOW_64_in_ruleOperation5404); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_omittable_6_0, grammarAccess.getOperationAccess().getOmittableOmittableKeyword_2_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getOperationRule());
                      	        }
                             		setWithLastConsumed(current, "omittable", true, "omittable");
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2267:3: ( (lv_specials_7_0= ruleOperationSpecial ) )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( ((LA39_0>=66 && LA39_0<=70)) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2268:1: (lv_specials_7_0= ruleOperationSpecial )
            	    {
            	    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2268:1: (lv_specials_7_0= ruleOperationSpecial )
            	    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2269:3: lv_specials_7_0= ruleOperationSpecial
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getOperationAccess().getSpecialsOperationSpecialParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOperationSpecial_in_ruleOperation5439);
            	    lv_specials_7_0=ruleOperationSpecial();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getOperationRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"specials",
            	              		lv_specials_7_0, 
            	              		"OperationSpecial");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);

            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2285:3: ( (lv_return_8_0= ruleTypeRef ) )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2286:1: (lv_return_8_0= ruleTypeRef )
            {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2286:1: (lv_return_8_0= ruleTypeRef )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2287:3: lv_return_8_0= ruleTypeRef
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getOperationAccess().getReturnTypeRefParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleTypeRef_in_ruleOperation5461);
            lv_return_8_0=ruleTypeRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getOperationRule());
              	        }
                     		set(
                     			current, 
                     			"return",
                      		lv_return_8_0, 
                      		"TypeRef");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2303:2: ( (lv_name_9_0= RULE_ID ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==RULE_ID) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2304:1: (lv_name_9_0= RULE_ID )
                    {
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2304:1: (lv_name_9_0= RULE_ID )
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2305:3: lv_name_9_0= RULE_ID
                    {
                    lv_name_9_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleOperation5478); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_name_9_0, grammarAccess.getOperationAccess().getNameIDTerminalRuleCall_5_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getOperationRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"name",
                              		lv_name_9_0, 
                              		"ID");
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,33,FOLLOW_33_in_ruleOperation5496); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_10, grammarAccess.getOperationAccess().getLeftParenthesisKeyword_6());
                  
            }
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2325:1: ( ( (lv_arguments_11_0= ruleArgument ) ) (otherlv_12= ',' ( (lv_arguments_13_0= ruleArgument ) ) )* )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==RULE_ID||(LA42_0>=15 && LA42_0<=27)||LA42_0==29||LA42_0==54||(LA42_0>=76 && LA42_0<=77)) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2325:2: ( (lv_arguments_11_0= ruleArgument ) ) (otherlv_12= ',' ( (lv_arguments_13_0= ruleArgument ) ) )*
                    {
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2325:2: ( (lv_arguments_11_0= ruleArgument ) )
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2326:1: (lv_arguments_11_0= ruleArgument )
                    {
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2326:1: (lv_arguments_11_0= ruleArgument )
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2327:3: lv_arguments_11_0= ruleArgument
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getOperationAccess().getArgumentsArgumentParserRuleCall_7_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleArgument_in_ruleOperation5518);
                    lv_arguments_11_0=ruleArgument();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getOperationRule());
                      	        }
                             		add(
                             			current, 
                             			"arguments",
                              		lv_arguments_11_0, 
                              		"Argument");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2343:2: (otherlv_12= ',' ( (lv_arguments_13_0= ruleArgument ) ) )*
                    loop41:
                    do {
                        int alt41=2;
                        int LA41_0 = input.LA(1);

                        if ( (LA41_0==34) ) {
                            alt41=1;
                        }


                        switch (alt41) {
                    	case 1 :
                    	    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2343:4: otherlv_12= ',' ( (lv_arguments_13_0= ruleArgument ) )
                    	    {
                    	    otherlv_12=(Token)match(input,34,FOLLOW_34_in_ruleOperation5531); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_12, grammarAccess.getOperationAccess().getCommaKeyword_7_1_0());
                    	          
                    	    }
                    	    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2347:1: ( (lv_arguments_13_0= ruleArgument ) )
                    	    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2348:1: (lv_arguments_13_0= ruleArgument )
                    	    {
                    	    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2348:1: (lv_arguments_13_0= ruleArgument )
                    	    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2349:3: lv_arguments_13_0= ruleArgument
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getOperationAccess().getArgumentsArgumentParserRuleCall_7_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleArgument_in_ruleOperation5552);
                    	    lv_arguments_13_0=ruleArgument();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getOperationRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"arguments",
                    	              		lv_arguments_13_0, 
                    	              		"Argument");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop41;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_14=(Token)match(input,35,FOLLOW_35_in_ruleOperation5568); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_14, grammarAccess.getOperationAccess().getRightParenthesisKeyword_8());
                  
            }
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2369:1: (otherlv_15= 'raises' otherlv_16= '(' ( ( ruleScopedName ) ) (otherlv_18= ',' ( ( ruleScopedName ) ) )* otherlv_20= ')' )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==65) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2369:3: otherlv_15= 'raises' otherlv_16= '(' ( ( ruleScopedName ) ) (otherlv_18= ',' ( ( ruleScopedName ) ) )* otherlv_20= ')'
                    {
                    otherlv_15=(Token)match(input,65,FOLLOW_65_in_ruleOperation5581); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_15, grammarAccess.getOperationAccess().getRaisesKeyword_9_0());
                          
                    }
                    otherlv_16=(Token)match(input,33,FOLLOW_33_in_ruleOperation5593); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_16, grammarAccess.getOperationAccess().getLeftParenthesisKeyword_9_1());
                          
                    }
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2377:1: ( ( ruleScopedName ) )
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2378:1: ( ruleScopedName )
                    {
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2378:1: ( ruleScopedName )
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2379:3: ruleScopedName
                    {
                    if ( state.backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getOperationRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getOperationAccess().getRaisesExceptionCrossReference_9_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleScopedName_in_ruleOperation5620);
                    ruleScopedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2395:2: (otherlv_18= ',' ( ( ruleScopedName ) ) )*
                    loop43:
                    do {
                        int alt43=2;
                        int LA43_0 = input.LA(1);

                        if ( (LA43_0==34) ) {
                            alt43=1;
                        }


                        switch (alt43) {
                    	case 1 :
                    	    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2395:4: otherlv_18= ',' ( ( ruleScopedName ) )
                    	    {
                    	    otherlv_18=(Token)match(input,34,FOLLOW_34_in_ruleOperation5633); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_18, grammarAccess.getOperationAccess().getCommaKeyword_9_3_0());
                    	          
                    	    }
                    	    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2399:1: ( ( ruleScopedName ) )
                    	    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2400:1: ( ruleScopedName )
                    	    {
                    	    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2400:1: ( ruleScopedName )
                    	    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2401:3: ruleScopedName
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      		  /* */ 
                    	      		
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      			if (current==null) {
                    	      	            current = createModelElement(grammarAccess.getOperationRule());
                    	      	        }
                    	              
                    	    }
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getOperationAccess().getRaisesExceptionCrossReference_9_3_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleScopedName_in_ruleOperation5660);
                    	    ruleScopedName();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop43;
                        }
                    } while (true);

                    otherlv_20=(Token)match(input,35,FOLLOW_35_in_ruleOperation5674); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_20, grammarAccess.getOperationAccess().getRightParenthesisKeyword_9_4());
                          
                    }

                    }
                    break;

            }

            otherlv_21=(Token)match(input,12,FOLLOW_12_in_ruleOperation5688); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_21, grammarAccess.getOperationAccess().getSemicolonKeyword_10());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleOperation"


    // $ANTLR start "entryRuleOperationExtendedAttribute"
    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2433:1: entryRuleOperationExtendedAttribute returns [EObject current=null] : iv_ruleOperationExtendedAttribute= ruleOperationExtendedAttribute EOF ;
    public final EObject entryRuleOperationExtendedAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperationExtendedAttribute = null;


        try {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2434:2: (iv_ruleOperationExtendedAttribute= ruleOperationExtendedAttribute EOF )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2435:2: iv_ruleOperationExtendedAttribute= ruleOperationExtendedAttribute EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOperationExtendedAttributeRule()); 
            }
            pushFollow(FOLLOW_ruleOperationExtendedAttribute_in_entryRuleOperationExtendedAttribute5724);
            iv_ruleOperationExtendedAttribute=ruleOperationExtendedAttribute();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOperationExtendedAttribute; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOperationExtendedAttribute5734); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOperationExtendedAttribute"


    // $ANTLR start "ruleOperationExtendedAttribute"
    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2442:1: ruleOperationExtendedAttribute returns [EObject current=null] : (this_TreatNullAs_0= ruleTreatNullAs | this_TreatUndefinedAs_1= ruleTreatUndefinedAs ) ;
    public final EObject ruleOperationExtendedAttribute() throws RecognitionException {
        EObject current = null;

        EObject this_TreatNullAs_0 = null;

        EObject this_TreatUndefinedAs_1 = null;


         enterRule(); 
            
        try {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2445:28: ( (this_TreatNullAs_0= ruleTreatNullAs | this_TreatUndefinedAs_1= ruleTreatUndefinedAs ) )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2446:1: (this_TreatNullAs_0= ruleTreatNullAs | this_TreatUndefinedAs_1= ruleTreatUndefinedAs )
            {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2446:1: (this_TreatNullAs_0= ruleTreatNullAs | this_TreatUndefinedAs_1= ruleTreatUndefinedAs )
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==45) ) {
                alt45=1;
            }
            else if ( (LA45_0==47) ) {
                alt45=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }
            switch (alt45) {
                case 1 :
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2447:2: this_TreatNullAs_0= ruleTreatNullAs
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getOperationExtendedAttributeAccess().getTreatNullAsParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleTreatNullAs_in_ruleOperationExtendedAttribute5784);
                    this_TreatNullAs_0=ruleTreatNullAs();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_TreatNullAs_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2460:2: this_TreatUndefinedAs_1= ruleTreatUndefinedAs
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getOperationExtendedAttributeAccess().getTreatUndefinedAsParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleTreatUndefinedAs_in_ruleOperationExtendedAttribute5814);
                    this_TreatUndefinedAs_1=ruleTreatUndefinedAs();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_TreatUndefinedAs_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleOperationExtendedAttribute"


    // $ANTLR start "entryRuleOperationSpecial"
    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2479:1: entryRuleOperationSpecial returns [EObject current=null] : iv_ruleOperationSpecial= ruleOperationSpecial EOF ;
    public final EObject entryRuleOperationSpecial() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperationSpecial = null;


        try {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2480:2: (iv_ruleOperationSpecial= ruleOperationSpecial EOF )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2481:2: iv_ruleOperationSpecial= ruleOperationSpecial EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOperationSpecialRule()); 
            }
            pushFollow(FOLLOW_ruleOperationSpecial_in_entryRuleOperationSpecial5849);
            iv_ruleOperationSpecial=ruleOperationSpecial();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOperationSpecial; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOperationSpecial5859); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOperationSpecial"


    // $ANTLR start "ruleOperationSpecial"
    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2488:1: ruleOperationSpecial returns [EObject current=null] : ( ( () otherlv_1= 'getter' ) | ( () otherlv_3= 'setter' ) | ( () otherlv_5= 'creator' ) | ( () otherlv_7= 'deleter' ) | ( () otherlv_9= 'caller' ) ) ;
    public final EObject ruleOperationSpecial() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;

         enterRule(); 
            
        try {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2491:28: ( ( ( () otherlv_1= 'getter' ) | ( () otherlv_3= 'setter' ) | ( () otherlv_5= 'creator' ) | ( () otherlv_7= 'deleter' ) | ( () otherlv_9= 'caller' ) ) )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2492:1: ( ( () otherlv_1= 'getter' ) | ( () otherlv_3= 'setter' ) | ( () otherlv_5= 'creator' ) | ( () otherlv_7= 'deleter' ) | ( () otherlv_9= 'caller' ) )
            {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2492:1: ( ( () otherlv_1= 'getter' ) | ( () otherlv_3= 'setter' ) | ( () otherlv_5= 'creator' ) | ( () otherlv_7= 'deleter' ) | ( () otherlv_9= 'caller' ) )
            int alt46=5;
            switch ( input.LA(1) ) {
            case 66:
                {
                alt46=1;
                }
                break;
            case 67:
                {
                alt46=2;
                }
                break;
            case 68:
                {
                alt46=3;
                }
                break;
            case 69:
                {
                alt46=4;
                }
                break;
            case 70:
                {
                alt46=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }

            switch (alt46) {
                case 1 :
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2492:2: ( () otherlv_1= 'getter' )
                    {
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2492:2: ( () otherlv_1= 'getter' )
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2492:3: () otherlv_1= 'getter'
                    {
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2492:3: ()
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2493:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getOperationSpecialAccess().getOperationSpecialGetterAction_0_0(),
                                  current);
                          
                    }

                    }

                    otherlv_1=(Token)match(input,66,FOLLOW_66_in_ruleOperationSpecial5909); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getOperationSpecialAccess().getGetterKeyword_0_1());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2506:6: ( () otherlv_3= 'setter' )
                    {
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2506:6: ( () otherlv_3= 'setter' )
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2506:7: () otherlv_3= 'setter'
                    {
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2506:7: ()
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2507:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getOperationSpecialAccess().getOperationSpecialSetterAction_1_0(),
                                  current);
                          
                    }

                    }

                    otherlv_3=(Token)match(input,67,FOLLOW_67_in_ruleOperationSpecial5941); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getOperationSpecialAccess().getSetterKeyword_1_1());
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2520:6: ( () otherlv_5= 'creator' )
                    {
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2520:6: ( () otherlv_5= 'creator' )
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2520:7: () otherlv_5= 'creator'
                    {
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2520:7: ()
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2521:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getOperationSpecialAccess().getOperationSpecialCreatorAction_2_0(),
                                  current);
                          
                    }

                    }

                    otherlv_5=(Token)match(input,68,FOLLOW_68_in_ruleOperationSpecial5973); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getOperationSpecialAccess().getCreatorKeyword_2_1());
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2534:6: ( () otherlv_7= 'deleter' )
                    {
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2534:6: ( () otherlv_7= 'deleter' )
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2534:7: () otherlv_7= 'deleter'
                    {
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2534:7: ()
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2535:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getOperationSpecialAccess().getOperationSpecialDeleterAction_3_0(),
                                  current);
                          
                    }

                    }

                    otherlv_7=(Token)match(input,69,FOLLOW_69_in_ruleOperationSpecial6005); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getOperationSpecialAccess().getDeleterKeyword_3_1());
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2548:6: ( () otherlv_9= 'caller' )
                    {
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2548:6: ( () otherlv_9= 'caller' )
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2548:7: () otherlv_9= 'caller'
                    {
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2548:7: ()
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2549:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getOperationSpecialAccess().getOperationSpecialCallerAction_4_0(),
                                  current);
                          
                    }

                    }

                    otherlv_9=(Token)match(input,70,FOLLOW_70_in_ruleOperationSpecial6037); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getOperationSpecialAccess().getCallerKeyword_4_1());
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleOperationSpecial"


    // $ANTLR start "entryRuleAttribute"
    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2569:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2570:2: (iv_ruleAttribute= ruleAttribute EOF )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2571:2: iv_ruleAttribute= ruleAttribute EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAttributeRule()); 
            }
            pushFollow(FOLLOW_ruleAttribute_in_entryRuleAttribute6074);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAttribute; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttribute6084); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2578:1: ruleAttribute returns [EObject current=null] : ( (otherlv_0= '[' ( (lv_extendedAttributes_1_0= ruleAttributeExtendedAttribute ) ) (otherlv_2= ',' ( (lv_extendedAttributes_3_0= ruleAttributeExtendedAttribute ) ) )* otherlv_4= ']' )? ( (lv_stringifier_5_0= 'stringifier' ) )? (otherlv_6= 'readonly' )? otherlv_7= 'attribute' ( (lv_type_8_0= ruleTypeRef ) ) ( (lv_name_9_0= ruleScopedName ) ) ( (otherlv_10= 'getraises' otherlv_11= '(' ( ( ruleScopedName ) ) (otherlv_13= ',' ( ( ruleScopedName ) ) )* otherlv_15= ')' )? (otherlv_16= 'setraises' otherlv_17= '(' ( ( ruleScopedName ) ) (otherlv_19= ',' ( ( ruleScopedName ) ) )* otherlv_21= ')' )? ) otherlv_22= ';' ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token lv_stringifier_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        EObject lv_extendedAttributes_1_0 = null;

        EObject lv_extendedAttributes_3_0 = null;

        EObject lv_type_8_0 = null;

        AntlrDatatypeRuleToken lv_name_9_0 = null;


         enterRule(); 
            
        try {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2581:28: ( ( (otherlv_0= '[' ( (lv_extendedAttributes_1_0= ruleAttributeExtendedAttribute ) ) (otherlv_2= ',' ( (lv_extendedAttributes_3_0= ruleAttributeExtendedAttribute ) ) )* otherlv_4= ']' )? ( (lv_stringifier_5_0= 'stringifier' ) )? (otherlv_6= 'readonly' )? otherlv_7= 'attribute' ( (lv_type_8_0= ruleTypeRef ) ) ( (lv_name_9_0= ruleScopedName ) ) ( (otherlv_10= 'getraises' otherlv_11= '(' ( ( ruleScopedName ) ) (otherlv_13= ',' ( ( ruleScopedName ) ) )* otherlv_15= ')' )? (otherlv_16= 'setraises' otherlv_17= '(' ( ( ruleScopedName ) ) (otherlv_19= ',' ( ( ruleScopedName ) ) )* otherlv_21= ')' )? ) otherlv_22= ';' ) )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2582:1: ( (otherlv_0= '[' ( (lv_extendedAttributes_1_0= ruleAttributeExtendedAttribute ) ) (otherlv_2= ',' ( (lv_extendedAttributes_3_0= ruleAttributeExtendedAttribute ) ) )* otherlv_4= ']' )? ( (lv_stringifier_5_0= 'stringifier' ) )? (otherlv_6= 'readonly' )? otherlv_7= 'attribute' ( (lv_type_8_0= ruleTypeRef ) ) ( (lv_name_9_0= ruleScopedName ) ) ( (otherlv_10= 'getraises' otherlv_11= '(' ( ( ruleScopedName ) ) (otherlv_13= ',' ( ( ruleScopedName ) ) )* otherlv_15= ')' )? (otherlv_16= 'setraises' otherlv_17= '(' ( ( ruleScopedName ) ) (otherlv_19= ',' ( ( ruleScopedName ) ) )* otherlv_21= ')' )? ) otherlv_22= ';' )
            {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2582:1: ( (otherlv_0= '[' ( (lv_extendedAttributes_1_0= ruleAttributeExtendedAttribute ) ) (otherlv_2= ',' ( (lv_extendedAttributes_3_0= ruleAttributeExtendedAttribute ) ) )* otherlv_4= ']' )? ( (lv_stringifier_5_0= 'stringifier' ) )? (otherlv_6= 'readonly' )? otherlv_7= 'attribute' ( (lv_type_8_0= ruleTypeRef ) ) ( (lv_name_9_0= ruleScopedName ) ) ( (otherlv_10= 'getraises' otherlv_11= '(' ( ( ruleScopedName ) ) (otherlv_13= ',' ( ( ruleScopedName ) ) )* otherlv_15= ')' )? (otherlv_16= 'setraises' otherlv_17= '(' ( ( ruleScopedName ) ) (otherlv_19= ',' ( ( ruleScopedName ) ) )* otherlv_21= ')' )? ) otherlv_22= ';' )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2582:2: (otherlv_0= '[' ( (lv_extendedAttributes_1_0= ruleAttributeExtendedAttribute ) ) (otherlv_2= ',' ( (lv_extendedAttributes_3_0= ruleAttributeExtendedAttribute ) ) )* otherlv_4= ']' )? ( (lv_stringifier_5_0= 'stringifier' ) )? (otherlv_6= 'readonly' )? otherlv_7= 'attribute' ( (lv_type_8_0= ruleTypeRef ) ) ( (lv_name_9_0= ruleScopedName ) ) ( (otherlv_10= 'getraises' otherlv_11= '(' ( ( ruleScopedName ) ) (otherlv_13= ',' ( ( ruleScopedName ) ) )* otherlv_15= ')' )? (otherlv_16= 'setraises' otherlv_17= '(' ( ( ruleScopedName ) ) (otherlv_19= ',' ( ( ruleScopedName ) ) )* otherlv_21= ')' )? ) otherlv_22= ';'
            {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2582:2: (otherlv_0= '[' ( (lv_extendedAttributes_1_0= ruleAttributeExtendedAttribute ) ) (otherlv_2= ',' ( (lv_extendedAttributes_3_0= ruleAttributeExtendedAttribute ) ) )* otherlv_4= ']' )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==54) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2582:4: otherlv_0= '[' ( (lv_extendedAttributes_1_0= ruleAttributeExtendedAttribute ) ) (otherlv_2= ',' ( (lv_extendedAttributes_3_0= ruleAttributeExtendedAttribute ) ) )* otherlv_4= ']'
                    {
                    otherlv_0=(Token)match(input,54,FOLLOW_54_in_ruleAttribute6122); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getAttributeAccess().getLeftSquareBracketKeyword_0_0());
                          
                    }
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2586:1: ( (lv_extendedAttributes_1_0= ruleAttributeExtendedAttribute ) )
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2587:1: (lv_extendedAttributes_1_0= ruleAttributeExtendedAttribute )
                    {
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2587:1: (lv_extendedAttributes_1_0= ruleAttributeExtendedAttribute )
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2588:3: lv_extendedAttributes_1_0= ruleAttributeExtendedAttribute
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAttributeAccess().getExtendedAttributesAttributeExtendedAttributeParserRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleAttributeExtendedAttribute_in_ruleAttribute6143);
                    lv_extendedAttributes_1_0=ruleAttributeExtendedAttribute();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getAttributeRule());
                      	        }
                             		add(
                             			current, 
                             			"extendedAttributes",
                              		lv_extendedAttributes_1_0, 
                              		"AttributeExtendedAttribute");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2604:2: (otherlv_2= ',' ( (lv_extendedAttributes_3_0= ruleAttributeExtendedAttribute ) ) )*
                    loop47:
                    do {
                        int alt47=2;
                        int LA47_0 = input.LA(1);

                        if ( (LA47_0==34) ) {
                            alt47=1;
                        }


                        switch (alt47) {
                    	case 1 :
                    	    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2604:4: otherlv_2= ',' ( (lv_extendedAttributes_3_0= ruleAttributeExtendedAttribute ) )
                    	    {
                    	    otherlv_2=(Token)match(input,34,FOLLOW_34_in_ruleAttribute6156); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getAttributeAccess().getCommaKeyword_0_2_0());
                    	          
                    	    }
                    	    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2608:1: ( (lv_extendedAttributes_3_0= ruleAttributeExtendedAttribute ) )
                    	    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2609:1: (lv_extendedAttributes_3_0= ruleAttributeExtendedAttribute )
                    	    {
                    	    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2609:1: (lv_extendedAttributes_3_0= ruleAttributeExtendedAttribute )
                    	    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2610:3: lv_extendedAttributes_3_0= ruleAttributeExtendedAttribute
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getAttributeAccess().getExtendedAttributesAttributeExtendedAttributeParserRuleCall_0_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleAttributeExtendedAttribute_in_ruleAttribute6177);
                    	    lv_extendedAttributes_3_0=ruleAttributeExtendedAttribute();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getAttributeRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"extendedAttributes",
                    	              		lv_extendedAttributes_3_0, 
                    	              		"AttributeExtendedAttribute");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop47;
                        }
                    } while (true);

                    otherlv_4=(Token)match(input,55,FOLLOW_55_in_ruleAttribute6191); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getAttributeAccess().getRightSquareBracketKeyword_0_3());
                          
                    }

                    }
                    break;

            }

            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2630:3: ( (lv_stringifier_5_0= 'stringifier' ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==63) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2631:1: (lv_stringifier_5_0= 'stringifier' )
                    {
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2631:1: (lv_stringifier_5_0= 'stringifier' )
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2632:3: lv_stringifier_5_0= 'stringifier'
                    {
                    lv_stringifier_5_0=(Token)match(input,63,FOLLOW_63_in_ruleAttribute6211); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_stringifier_5_0, grammarAccess.getAttributeAccess().getStringifierStringifierKeyword_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getAttributeRule());
                      	        }
                             		setWithLastConsumed(current, "stringifier", true, "stringifier");
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2645:3: (otherlv_6= 'readonly' )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==71) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2645:5: otherlv_6= 'readonly'
                    {
                    otherlv_6=(Token)match(input,71,FOLLOW_71_in_ruleAttribute6238); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getAttributeAccess().getReadonlyKeyword_2());
                          
                    }

                    }
                    break;

            }

            otherlv_7=(Token)match(input,72,FOLLOW_72_in_ruleAttribute6252); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getAttributeAccess().getAttributeKeyword_3());
                  
            }
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2653:1: ( (lv_type_8_0= ruleTypeRef ) )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2654:1: (lv_type_8_0= ruleTypeRef )
            {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2654:1: (lv_type_8_0= ruleTypeRef )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2655:3: lv_type_8_0= ruleTypeRef
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAttributeAccess().getTypeTypeRefParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleTypeRef_in_ruleAttribute6273);
            lv_type_8_0=ruleTypeRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getAttributeRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_8_0, 
                      		"TypeRef");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2671:2: ( (lv_name_9_0= ruleScopedName ) )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2672:1: (lv_name_9_0= ruleScopedName )
            {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2672:1: (lv_name_9_0= ruleScopedName )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2673:3: lv_name_9_0= ruleScopedName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAttributeAccess().getNameScopedNameParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleScopedName_in_ruleAttribute6294);
            lv_name_9_0=ruleScopedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getAttributeRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_9_0, 
                      		"ScopedName");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2689:2: ( (otherlv_10= 'getraises' otherlv_11= '(' ( ( ruleScopedName ) ) (otherlv_13= ',' ( ( ruleScopedName ) ) )* otherlv_15= ')' )? (otherlv_16= 'setraises' otherlv_17= '(' ( ( ruleScopedName ) ) (otherlv_19= ',' ( ( ruleScopedName ) ) )* otherlv_21= ')' )? )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2689:3: (otherlv_10= 'getraises' otherlv_11= '(' ( ( ruleScopedName ) ) (otherlv_13= ',' ( ( ruleScopedName ) ) )* otherlv_15= ')' )? (otherlv_16= 'setraises' otherlv_17= '(' ( ( ruleScopedName ) ) (otherlv_19= ',' ( ( ruleScopedName ) ) )* otherlv_21= ')' )?
            {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2689:3: (otherlv_10= 'getraises' otherlv_11= '(' ( ( ruleScopedName ) ) (otherlv_13= ',' ( ( ruleScopedName ) ) )* otherlv_15= ')' )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==73) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2689:5: otherlv_10= 'getraises' otherlv_11= '(' ( ( ruleScopedName ) ) (otherlv_13= ',' ( ( ruleScopedName ) ) )* otherlv_15= ')'
                    {
                    otherlv_10=(Token)match(input,73,FOLLOW_73_in_ruleAttribute6308); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_10, grammarAccess.getAttributeAccess().getGetraisesKeyword_6_0_0());
                          
                    }
                    otherlv_11=(Token)match(input,33,FOLLOW_33_in_ruleAttribute6320); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_11, grammarAccess.getAttributeAccess().getLeftParenthesisKeyword_6_0_1());
                          
                    }
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2697:1: ( ( ruleScopedName ) )
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2698:1: ( ruleScopedName )
                    {
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2698:1: ( ruleScopedName )
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2699:3: ruleScopedName
                    {
                    if ( state.backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getAttributeRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAttributeAccess().getGetRaisesExceptionCrossReference_6_0_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleScopedName_in_ruleAttribute6347);
                    ruleScopedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2715:2: (otherlv_13= ',' ( ( ruleScopedName ) ) )*
                    loop51:
                    do {
                        int alt51=2;
                        int LA51_0 = input.LA(1);

                        if ( (LA51_0==34) ) {
                            alt51=1;
                        }


                        switch (alt51) {
                    	case 1 :
                    	    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2715:4: otherlv_13= ',' ( ( ruleScopedName ) )
                    	    {
                    	    otherlv_13=(Token)match(input,34,FOLLOW_34_in_ruleAttribute6360); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_13, grammarAccess.getAttributeAccess().getCommaKeyword_6_0_3_0());
                    	          
                    	    }
                    	    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2719:1: ( ( ruleScopedName ) )
                    	    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2720:1: ( ruleScopedName )
                    	    {
                    	    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2720:1: ( ruleScopedName )
                    	    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2721:3: ruleScopedName
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      		  /* */ 
                    	      		
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      			if (current==null) {
                    	      	            current = createModelElement(grammarAccess.getAttributeRule());
                    	      	        }
                    	              
                    	    }
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getAttributeAccess().getGetRaisesExceptionCrossReference_6_0_3_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleScopedName_in_ruleAttribute6387);
                    	    ruleScopedName();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop51;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,35,FOLLOW_35_in_ruleAttribute6401); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_15, grammarAccess.getAttributeAccess().getRightParenthesisKeyword_6_0_4());
                          
                    }

                    }
                    break;

            }

            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2741:3: (otherlv_16= 'setraises' otherlv_17= '(' ( ( ruleScopedName ) ) (otherlv_19= ',' ( ( ruleScopedName ) ) )* otherlv_21= ')' )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==74) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2741:5: otherlv_16= 'setraises' otherlv_17= '(' ( ( ruleScopedName ) ) (otherlv_19= ',' ( ( ruleScopedName ) ) )* otherlv_21= ')'
                    {
                    otherlv_16=(Token)match(input,74,FOLLOW_74_in_ruleAttribute6416); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_16, grammarAccess.getAttributeAccess().getSetraisesKeyword_6_1_0());
                          
                    }
                    otherlv_17=(Token)match(input,33,FOLLOW_33_in_ruleAttribute6428); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_17, grammarAccess.getAttributeAccess().getLeftParenthesisKeyword_6_1_1());
                          
                    }
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2749:1: ( ( ruleScopedName ) )
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2750:1: ( ruleScopedName )
                    {
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2750:1: ( ruleScopedName )
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2751:3: ruleScopedName
                    {
                    if ( state.backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getAttributeRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAttributeAccess().getSetRaisesExceptionCrossReference_6_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleScopedName_in_ruleAttribute6455);
                    ruleScopedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2767:2: (otherlv_19= ',' ( ( ruleScopedName ) ) )*
                    loop53:
                    do {
                        int alt53=2;
                        int LA53_0 = input.LA(1);

                        if ( (LA53_0==34) ) {
                            alt53=1;
                        }


                        switch (alt53) {
                    	case 1 :
                    	    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2767:4: otherlv_19= ',' ( ( ruleScopedName ) )
                    	    {
                    	    otherlv_19=(Token)match(input,34,FOLLOW_34_in_ruleAttribute6468); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_19, grammarAccess.getAttributeAccess().getCommaKeyword_6_1_3_0());
                    	          
                    	    }
                    	    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2771:1: ( ( ruleScopedName ) )
                    	    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2772:1: ( ruleScopedName )
                    	    {
                    	    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2772:1: ( ruleScopedName )
                    	    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2773:3: ruleScopedName
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      		  /* */ 
                    	      		
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      			if (current==null) {
                    	      	            current = createModelElement(grammarAccess.getAttributeRule());
                    	      	        }
                    	              
                    	    }
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getAttributeAccess().getSetRaisesExceptionCrossReference_6_1_3_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleScopedName_in_ruleAttribute6495);
                    	    ruleScopedName();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop53;
                        }
                    } while (true);

                    otherlv_21=(Token)match(input,35,FOLLOW_35_in_ruleAttribute6509); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_21, grammarAccess.getAttributeAccess().getRightParenthesisKeyword_6_1_4());
                          
                    }

                    }
                    break;

            }


            }

            otherlv_22=(Token)match(input,12,FOLLOW_12_in_ruleAttribute6524); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_22, grammarAccess.getAttributeAccess().getSemicolonKeyword_7());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleAttributeExtendedAttribute"
    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2805:1: entryRuleAttributeExtendedAttribute returns [EObject current=null] : iv_ruleAttributeExtendedAttribute= ruleAttributeExtendedAttribute EOF ;
    public final EObject entryRuleAttributeExtendedAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeExtendedAttribute = null;


        try {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2806:2: (iv_ruleAttributeExtendedAttribute= ruleAttributeExtendedAttribute EOF )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2807:2: iv_ruleAttributeExtendedAttribute= ruleAttributeExtendedAttribute EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAttributeExtendedAttributeRule()); 
            }
            pushFollow(FOLLOW_ruleAttributeExtendedAttribute_in_entryRuleAttributeExtendedAttribute6560);
            iv_ruleAttributeExtendedAttribute=ruleAttributeExtendedAttribute();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAttributeExtendedAttribute; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttributeExtendedAttribute6570); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAttributeExtendedAttribute"


    // $ANTLR start "ruleAttributeExtendedAttribute"
    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2814:1: ruleAttributeExtendedAttribute returns [EObject current=null] : (this_PutForwards_0= rulePutForwards | this_Replaceable_1= ruleReplaceable | this_TreatNullAs_2= ruleTreatNullAs | this_TreatUndefinedAs_3= ruleTreatUndefinedAs ) ;
    public final EObject ruleAttributeExtendedAttribute() throws RecognitionException {
        EObject current = null;

        EObject this_PutForwards_0 = null;

        EObject this_Replaceable_1 = null;

        EObject this_TreatNullAs_2 = null;

        EObject this_TreatUndefinedAs_3 = null;


         enterRule(); 
            
        try {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2817:28: ( (this_PutForwards_0= rulePutForwards | this_Replaceable_1= ruleReplaceable | this_TreatNullAs_2= ruleTreatNullAs | this_TreatUndefinedAs_3= ruleTreatUndefinedAs ) )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2818:1: (this_PutForwards_0= rulePutForwards | this_Replaceable_1= ruleReplaceable | this_TreatNullAs_2= ruleTreatNullAs | this_TreatUndefinedAs_3= ruleTreatUndefinedAs )
            {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2818:1: (this_PutForwards_0= rulePutForwards | this_Replaceable_1= ruleReplaceable | this_TreatNullAs_2= ruleTreatNullAs | this_TreatUndefinedAs_3= ruleTreatUndefinedAs )
            int alt55=4;
            switch ( input.LA(1) ) {
            case 44:
                {
                alt55=1;
                }
                break;
            case 50:
                {
                alt55=2;
                }
                break;
            case 45:
                {
                alt55=3;
                }
                break;
            case 47:
                {
                alt55=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                throw nvae;
            }

            switch (alt55) {
                case 1 :
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2819:2: this_PutForwards_0= rulePutForwards
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAttributeExtendedAttributeAccess().getPutForwardsParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_rulePutForwards_in_ruleAttributeExtendedAttribute6620);
                    this_PutForwards_0=rulePutForwards();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_PutForwards_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2832:2: this_Replaceable_1= ruleReplaceable
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAttributeExtendedAttributeAccess().getReplaceableParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleReplaceable_in_ruleAttributeExtendedAttribute6650);
                    this_Replaceable_1=ruleReplaceable();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Replaceable_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2845:2: this_TreatNullAs_2= ruleTreatNullAs
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAttributeExtendedAttributeAccess().getTreatNullAsParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleTreatNullAs_in_ruleAttributeExtendedAttribute6680);
                    this_TreatNullAs_2=ruleTreatNullAs();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_TreatNullAs_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2858:2: this_TreatUndefinedAs_3= ruleTreatUndefinedAs
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAttributeExtendedAttributeAccess().getTreatUndefinedAsParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleTreatUndefinedAs_in_ruleAttributeExtendedAttribute6710);
                    this_TreatUndefinedAs_3=ruleTreatUndefinedAs();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_TreatUndefinedAs_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleAttributeExtendedAttribute"


    // $ANTLR start "entryRuleException"
    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2877:1: entryRuleException returns [EObject current=null] : iv_ruleException= ruleException EOF ;
    public final EObject entryRuleException() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleException = null;


        try {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2878:2: (iv_ruleException= ruleException EOF )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2879:2: iv_ruleException= ruleException EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExceptionRule()); 
            }
            pushFollow(FOLLOW_ruleException_in_entryRuleException6745);
            iv_ruleException=ruleException();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleException; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleException6755); if (state.failed) return current;

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
    // $ANTLR end "entryRuleException"


    // $ANTLR start "ruleException"
    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2886:1: ruleException returns [EObject current=null] : ( (otherlv_0= '[' ( (lv_extendedAttributes_1_0= ruleExceptionExtendedAttribute ) ) (otherlv_2= ',' ( (lv_extendedAttributes_3_0= ruleExceptionExtendedAttribute ) ) )* otherlv_4= ']' )? otherlv_5= 'exception' ( (lv_name_6_0= RULE_ID ) ) otherlv_7= '{' ( (lv_members_8_0= ruleExceptionMember ) )* otherlv_9= '}' otherlv_10= ';' ) ;
    public final EObject ruleException() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_name_6_0=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        EObject lv_extendedAttributes_1_0 = null;

        EObject lv_extendedAttributes_3_0 = null;

        EObject lv_members_8_0 = null;


         enterRule(); 
            
        try {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2889:28: ( ( (otherlv_0= '[' ( (lv_extendedAttributes_1_0= ruleExceptionExtendedAttribute ) ) (otherlv_2= ',' ( (lv_extendedAttributes_3_0= ruleExceptionExtendedAttribute ) ) )* otherlv_4= ']' )? otherlv_5= 'exception' ( (lv_name_6_0= RULE_ID ) ) otherlv_7= '{' ( (lv_members_8_0= ruleExceptionMember ) )* otherlv_9= '}' otherlv_10= ';' ) )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2890:1: ( (otherlv_0= '[' ( (lv_extendedAttributes_1_0= ruleExceptionExtendedAttribute ) ) (otherlv_2= ',' ( (lv_extendedAttributes_3_0= ruleExceptionExtendedAttribute ) ) )* otherlv_4= ']' )? otherlv_5= 'exception' ( (lv_name_6_0= RULE_ID ) ) otherlv_7= '{' ( (lv_members_8_0= ruleExceptionMember ) )* otherlv_9= '}' otherlv_10= ';' )
            {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2890:1: ( (otherlv_0= '[' ( (lv_extendedAttributes_1_0= ruleExceptionExtendedAttribute ) ) (otherlv_2= ',' ( (lv_extendedAttributes_3_0= ruleExceptionExtendedAttribute ) ) )* otherlv_4= ']' )? otherlv_5= 'exception' ( (lv_name_6_0= RULE_ID ) ) otherlv_7= '{' ( (lv_members_8_0= ruleExceptionMember ) )* otherlv_9= '}' otherlv_10= ';' )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2890:2: (otherlv_0= '[' ( (lv_extendedAttributes_1_0= ruleExceptionExtendedAttribute ) ) (otherlv_2= ',' ( (lv_extendedAttributes_3_0= ruleExceptionExtendedAttribute ) ) )* otherlv_4= ']' )? otherlv_5= 'exception' ( (lv_name_6_0= RULE_ID ) ) otherlv_7= '{' ( (lv_members_8_0= ruleExceptionMember ) )* otherlv_9= '}' otherlv_10= ';'
            {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2890:2: (otherlv_0= '[' ( (lv_extendedAttributes_1_0= ruleExceptionExtendedAttribute ) ) (otherlv_2= ',' ( (lv_extendedAttributes_3_0= ruleExceptionExtendedAttribute ) ) )* otherlv_4= ']' )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==54) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2890:4: otherlv_0= '[' ( (lv_extendedAttributes_1_0= ruleExceptionExtendedAttribute ) ) (otherlv_2= ',' ( (lv_extendedAttributes_3_0= ruleExceptionExtendedAttribute ) ) )* otherlv_4= ']'
                    {
                    otherlv_0=(Token)match(input,54,FOLLOW_54_in_ruleException6793); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getExceptionAccess().getLeftSquareBracketKeyword_0_0());
                          
                    }
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2894:1: ( (lv_extendedAttributes_1_0= ruleExceptionExtendedAttribute ) )
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2895:1: (lv_extendedAttributes_1_0= ruleExceptionExtendedAttribute )
                    {
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2895:1: (lv_extendedAttributes_1_0= ruleExceptionExtendedAttribute )
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2896:3: lv_extendedAttributes_1_0= ruleExceptionExtendedAttribute
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExceptionAccess().getExtendedAttributesExceptionExtendedAttributeParserRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExceptionExtendedAttribute_in_ruleException6814);
                    lv_extendedAttributes_1_0=ruleExceptionExtendedAttribute();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExceptionRule());
                      	        }
                             		add(
                             			current, 
                             			"extendedAttributes",
                              		lv_extendedAttributes_1_0, 
                              		"ExceptionExtendedAttribute");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2912:2: (otherlv_2= ',' ( (lv_extendedAttributes_3_0= ruleExceptionExtendedAttribute ) ) )*
                    loop56:
                    do {
                        int alt56=2;
                        int LA56_0 = input.LA(1);

                        if ( (LA56_0==34) ) {
                            alt56=1;
                        }


                        switch (alt56) {
                    	case 1 :
                    	    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2912:4: otherlv_2= ',' ( (lv_extendedAttributes_3_0= ruleExceptionExtendedAttribute ) )
                    	    {
                    	    otherlv_2=(Token)match(input,34,FOLLOW_34_in_ruleException6827); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getExceptionAccess().getCommaKeyword_0_2_0());
                    	          
                    	    }
                    	    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2916:1: ( (lv_extendedAttributes_3_0= ruleExceptionExtendedAttribute ) )
                    	    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2917:1: (lv_extendedAttributes_3_0= ruleExceptionExtendedAttribute )
                    	    {
                    	    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2917:1: (lv_extendedAttributes_3_0= ruleExceptionExtendedAttribute )
                    	    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2918:3: lv_extendedAttributes_3_0= ruleExceptionExtendedAttribute
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getExceptionAccess().getExtendedAttributesExceptionExtendedAttributeParserRuleCall_0_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleExceptionExtendedAttribute_in_ruleException6848);
                    	    lv_extendedAttributes_3_0=ruleExceptionExtendedAttribute();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getExceptionRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"extendedAttributes",
                    	              		lv_extendedAttributes_3_0, 
                    	              		"ExceptionExtendedAttribute");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop56;
                        }
                    } while (true);

                    otherlv_4=(Token)match(input,55,FOLLOW_55_in_ruleException6862); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getExceptionAccess().getRightSquareBracketKeyword_0_3());
                          
                    }

                    }
                    break;

            }

            otherlv_5=(Token)match(input,75,FOLLOW_75_in_ruleException6876); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getExceptionAccess().getExceptionKeyword_1());
                  
            }
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2942:1: ( (lv_name_6_0= RULE_ID ) )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2943:1: (lv_name_6_0= RULE_ID )
            {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2943:1: (lv_name_6_0= RULE_ID )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2944:3: lv_name_6_0= RULE_ID
            {
            lv_name_6_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleException6893); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_6_0, grammarAccess.getExceptionAccess().getNameIDTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getExceptionRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_6_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_7=(Token)match(input,57,FOLLOW_57_in_ruleException6910); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getExceptionAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2964:1: ( (lv_members_8_0= ruleExceptionMember ) )*
            loop58:
            do {
                int alt58=2;
                int LA58_0 = input.LA(1);

                if ( (LA58_0==RULE_ID||(LA58_0>=15 && LA58_0<=27)||LA58_0==29||LA58_0==79) ) {
                    alt58=1;
                }


                switch (alt58) {
            	case 1 :
            	    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2965:1: (lv_members_8_0= ruleExceptionMember )
            	    {
            	    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2965:1: (lv_members_8_0= ruleExceptionMember )
            	    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2966:3: lv_members_8_0= ruleExceptionMember
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getExceptionAccess().getMembersExceptionMemberParserRuleCall_4_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExceptionMember_in_ruleException6931);
            	    lv_members_8_0=ruleExceptionMember();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getExceptionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"members",
            	              		lv_members_8_0, 
            	              		"ExceptionMember");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop58;
                }
            } while (true);

            otherlv_9=(Token)match(input,58,FOLLOW_58_in_ruleException6944); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_9, grammarAccess.getExceptionAccess().getRightCurlyBracketKeyword_5());
                  
            }
            otherlv_10=(Token)match(input,12,FOLLOW_12_in_ruleException6956); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_10, grammarAccess.getExceptionAccess().getSemicolonKeyword_6());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleException"


    // $ANTLR start "entryRuleExceptionMember"
    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2998:1: entryRuleExceptionMember returns [EObject current=null] : iv_ruleExceptionMember= ruleExceptionMember EOF ;
    public final EObject entryRuleExceptionMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExceptionMember = null;


        try {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2999:2: (iv_ruleExceptionMember= ruleExceptionMember EOF )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3000:2: iv_ruleExceptionMember= ruleExceptionMember EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExceptionMemberRule()); 
            }
            pushFollow(FOLLOW_ruleExceptionMember_in_entryRuleExceptionMember6992);
            iv_ruleExceptionMember=ruleExceptionMember();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExceptionMember; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExceptionMember7002); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExceptionMember"


    // $ANTLR start "ruleExceptionMember"
    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3007:1: ruleExceptionMember returns [EObject current=null] : (this_Const_0= ruleConst | this_ExceptionField_1= ruleExceptionField ) ;
    public final EObject ruleExceptionMember() throws RecognitionException {
        EObject current = null;

        EObject this_Const_0 = null;

        EObject this_ExceptionField_1 = null;


         enterRule(); 
            
        try {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3010:28: ( (this_Const_0= ruleConst | this_ExceptionField_1= ruleExceptionField ) )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3011:1: (this_Const_0= ruleConst | this_ExceptionField_1= ruleExceptionField )
            {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3011:1: (this_Const_0= ruleConst | this_ExceptionField_1= ruleExceptionField )
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==79) ) {
                alt59=1;
            }
            else if ( (LA59_0==RULE_ID||(LA59_0>=15 && LA59_0<=27)||LA59_0==29) ) {
                alt59=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 0, input);

                throw nvae;
            }
            switch (alt59) {
                case 1 :
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3012:2: this_Const_0= ruleConst
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExceptionMemberAccess().getConstParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleConst_in_ruleExceptionMember7052);
                    this_Const_0=ruleConst();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Const_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3025:2: this_ExceptionField_1= ruleExceptionField
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExceptionMemberAccess().getExceptionFieldParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExceptionField_in_ruleExceptionMember7082);
                    this_ExceptionField_1=ruleExceptionField();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ExceptionField_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleExceptionMember"


    // $ANTLR start "entryRuleExceptionField"
    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3044:1: entryRuleExceptionField returns [EObject current=null] : iv_ruleExceptionField= ruleExceptionField EOF ;
    public final EObject entryRuleExceptionField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExceptionField = null;


        try {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3045:2: (iv_ruleExceptionField= ruleExceptionField EOF )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3046:2: iv_ruleExceptionField= ruleExceptionField EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExceptionFieldRule()); 
            }
            pushFollow(FOLLOW_ruleExceptionField_in_entryRuleExceptionField7117);
            iv_ruleExceptionField=ruleExceptionField();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExceptionField; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExceptionField7127); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExceptionField"


    // $ANTLR start "ruleExceptionField"
    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3053:1: ruleExceptionField returns [EObject current=null] : ( ( (lv_type_0_0= ruleTypeRef ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) ;
    public final EObject ruleExceptionField() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_type_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3056:28: ( ( ( (lv_type_0_0= ruleTypeRef ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3057:1: ( ( (lv_type_0_0= ruleTypeRef ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )
            {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3057:1: ( ( (lv_type_0_0= ruleTypeRef ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3057:2: ( (lv_type_0_0= ruleTypeRef ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';'
            {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3057:2: ( (lv_type_0_0= ruleTypeRef ) )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3058:1: (lv_type_0_0= ruleTypeRef )
            {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3058:1: (lv_type_0_0= ruleTypeRef )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3059:3: lv_type_0_0= ruleTypeRef
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getExceptionFieldAccess().getTypeTypeRefParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleTypeRef_in_ruleExceptionField7173);
            lv_type_0_0=ruleTypeRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getExceptionFieldRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_0_0, 
                      		"TypeRef");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3075:2: ( (lv_name_1_0= RULE_ID ) )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3076:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3076:1: (lv_name_1_0= RULE_ID )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3077:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleExceptionField7190); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getExceptionFieldAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getExceptionFieldRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleExceptionField7207); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getExceptionFieldAccess().getSemicolonKeyword_2());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleExceptionField"


    // $ANTLR start "entryRuleExceptionExtendedAttribute"
    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3105:1: entryRuleExceptionExtendedAttribute returns [EObject current=null] : iv_ruleExceptionExtendedAttribute= ruleExceptionExtendedAttribute EOF ;
    public final EObject entryRuleExceptionExtendedAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExceptionExtendedAttribute = null;


        try {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3106:2: (iv_ruleExceptionExtendedAttribute= ruleExceptionExtendedAttribute EOF )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3107:2: iv_ruleExceptionExtendedAttribute= ruleExceptionExtendedAttribute EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExceptionExtendedAttributeRule()); 
            }
            pushFollow(FOLLOW_ruleExceptionExtendedAttribute_in_entryRuleExceptionExtendedAttribute7243);
            iv_ruleExceptionExtendedAttribute=ruleExceptionExtendedAttribute();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExceptionExtendedAttribute; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExceptionExtendedAttribute7253); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExceptionExtendedAttribute"


    // $ANTLR start "ruleExceptionExtendedAttribute"
    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3114:1: ruleExceptionExtendedAttribute returns [EObject current=null] : this_NoInterfaceObject_0= ruleNoInterfaceObject ;
    public final EObject ruleExceptionExtendedAttribute() throws RecognitionException {
        EObject current = null;

        EObject this_NoInterfaceObject_0 = null;


         enterRule(); 
            
        try {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3117:28: (this_NoInterfaceObject_0= ruleNoInterfaceObject )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3119:2: this_NoInterfaceObject_0= ruleNoInterfaceObject
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getExceptionExtendedAttributeAccess().getNoInterfaceObjectParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleNoInterfaceObject_in_ruleExceptionExtendedAttribute7302);
            this_NoInterfaceObject_0=ruleNoInterfaceObject();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_NoInterfaceObject_0; 
                      afterParserOrEnumRuleCall();
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleExceptionExtendedAttribute"


    // $ANTLR start "entryRuleArgument"
    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3138:1: entryRuleArgument returns [EObject current=null] : iv_ruleArgument= ruleArgument EOF ;
    public final EObject entryRuleArgument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArgument = null;


        try {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3139:2: (iv_ruleArgument= ruleArgument EOF )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3140:2: iv_ruleArgument= ruleArgument EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArgumentRule()); 
            }
            pushFollow(FOLLOW_ruleArgument_in_entryRuleArgument7336);
            iv_ruleArgument=ruleArgument();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArgument; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleArgument7346); if (state.failed) return current;

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
    // $ANTLR end "entryRuleArgument"


    // $ANTLR start "ruleArgument"
    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3147:1: ruleArgument returns [EObject current=null] : ( (otherlv_0= '[' ( (lv_extendedAttributes_1_0= ruleArgumentExtendedAttribute ) ) (otherlv_2= ',' ( (lv_extendedAttributes_3_0= ruleArgumentExtendedAttribute ) ) )* otherlv_4= ']' )? ( (lv_in_5_0= 'in' ) )? ( (lv_optional_6_0= 'optional' ) )? ( (lv_type_7_0= ruleTypeRef ) ) ( (lv_ellipsis_8_0= '...' ) )? ( (lv_name_9_0= RULE_ID ) ) ) ;
    public final EObject ruleArgument() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token lv_in_5_0=null;
        Token lv_optional_6_0=null;
        Token lv_ellipsis_8_0=null;
        Token lv_name_9_0=null;
        EObject lv_extendedAttributes_1_0 = null;

        EObject lv_extendedAttributes_3_0 = null;

        EObject lv_type_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3150:28: ( ( (otherlv_0= '[' ( (lv_extendedAttributes_1_0= ruleArgumentExtendedAttribute ) ) (otherlv_2= ',' ( (lv_extendedAttributes_3_0= ruleArgumentExtendedAttribute ) ) )* otherlv_4= ']' )? ( (lv_in_5_0= 'in' ) )? ( (lv_optional_6_0= 'optional' ) )? ( (lv_type_7_0= ruleTypeRef ) ) ( (lv_ellipsis_8_0= '...' ) )? ( (lv_name_9_0= RULE_ID ) ) ) )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3151:1: ( (otherlv_0= '[' ( (lv_extendedAttributes_1_0= ruleArgumentExtendedAttribute ) ) (otherlv_2= ',' ( (lv_extendedAttributes_3_0= ruleArgumentExtendedAttribute ) ) )* otherlv_4= ']' )? ( (lv_in_5_0= 'in' ) )? ( (lv_optional_6_0= 'optional' ) )? ( (lv_type_7_0= ruleTypeRef ) ) ( (lv_ellipsis_8_0= '...' ) )? ( (lv_name_9_0= RULE_ID ) ) )
            {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3151:1: ( (otherlv_0= '[' ( (lv_extendedAttributes_1_0= ruleArgumentExtendedAttribute ) ) (otherlv_2= ',' ( (lv_extendedAttributes_3_0= ruleArgumentExtendedAttribute ) ) )* otherlv_4= ']' )? ( (lv_in_5_0= 'in' ) )? ( (lv_optional_6_0= 'optional' ) )? ( (lv_type_7_0= ruleTypeRef ) ) ( (lv_ellipsis_8_0= '...' ) )? ( (lv_name_9_0= RULE_ID ) ) )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3151:2: (otherlv_0= '[' ( (lv_extendedAttributes_1_0= ruleArgumentExtendedAttribute ) ) (otherlv_2= ',' ( (lv_extendedAttributes_3_0= ruleArgumentExtendedAttribute ) ) )* otherlv_4= ']' )? ( (lv_in_5_0= 'in' ) )? ( (lv_optional_6_0= 'optional' ) )? ( (lv_type_7_0= ruleTypeRef ) ) ( (lv_ellipsis_8_0= '...' ) )? ( (lv_name_9_0= RULE_ID ) )
            {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3151:2: (otherlv_0= '[' ( (lv_extendedAttributes_1_0= ruleArgumentExtendedAttribute ) ) (otherlv_2= ',' ( (lv_extendedAttributes_3_0= ruleArgumentExtendedAttribute ) ) )* otherlv_4= ']' )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==54) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3151:4: otherlv_0= '[' ( (lv_extendedAttributes_1_0= ruleArgumentExtendedAttribute ) ) (otherlv_2= ',' ( (lv_extendedAttributes_3_0= ruleArgumentExtendedAttribute ) ) )* otherlv_4= ']'
                    {
                    otherlv_0=(Token)match(input,54,FOLLOW_54_in_ruleArgument7384); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getArgumentAccess().getLeftSquareBracketKeyword_0_0());
                          
                    }
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3155:1: ( (lv_extendedAttributes_1_0= ruleArgumentExtendedAttribute ) )
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3156:1: (lv_extendedAttributes_1_0= ruleArgumentExtendedAttribute )
                    {
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3156:1: (lv_extendedAttributes_1_0= ruleArgumentExtendedAttribute )
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3157:3: lv_extendedAttributes_1_0= ruleArgumentExtendedAttribute
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getArgumentAccess().getExtendedAttributesArgumentExtendedAttributeParserRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleArgumentExtendedAttribute_in_ruleArgument7405);
                    lv_extendedAttributes_1_0=ruleArgumentExtendedAttribute();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getArgumentRule());
                      	        }
                             		add(
                             			current, 
                             			"extendedAttributes",
                              		lv_extendedAttributes_1_0, 
                              		"ArgumentExtendedAttribute");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3173:2: (otherlv_2= ',' ( (lv_extendedAttributes_3_0= ruleArgumentExtendedAttribute ) ) )*
                    loop60:
                    do {
                        int alt60=2;
                        int LA60_0 = input.LA(1);

                        if ( (LA60_0==34) ) {
                            alt60=1;
                        }


                        switch (alt60) {
                    	case 1 :
                    	    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3173:4: otherlv_2= ',' ( (lv_extendedAttributes_3_0= ruleArgumentExtendedAttribute ) )
                    	    {
                    	    otherlv_2=(Token)match(input,34,FOLLOW_34_in_ruleArgument7418); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getArgumentAccess().getCommaKeyword_0_2_0());
                    	          
                    	    }
                    	    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3177:1: ( (lv_extendedAttributes_3_0= ruleArgumentExtendedAttribute ) )
                    	    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3178:1: (lv_extendedAttributes_3_0= ruleArgumentExtendedAttribute )
                    	    {
                    	    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3178:1: (lv_extendedAttributes_3_0= ruleArgumentExtendedAttribute )
                    	    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3179:3: lv_extendedAttributes_3_0= ruleArgumentExtendedAttribute
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getArgumentAccess().getExtendedAttributesArgumentExtendedAttributeParserRuleCall_0_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleArgumentExtendedAttribute_in_ruleArgument7439);
                    	    lv_extendedAttributes_3_0=ruleArgumentExtendedAttribute();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getArgumentRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"extendedAttributes",
                    	              		lv_extendedAttributes_3_0, 
                    	              		"ArgumentExtendedAttribute");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop60;
                        }
                    } while (true);

                    otherlv_4=(Token)match(input,55,FOLLOW_55_in_ruleArgument7453); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getArgumentAccess().getRightSquareBracketKeyword_0_3());
                          
                    }

                    }
                    break;

            }

            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3199:3: ( (lv_in_5_0= 'in' ) )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==76) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3200:1: (lv_in_5_0= 'in' )
                    {
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3200:1: (lv_in_5_0= 'in' )
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3201:3: lv_in_5_0= 'in'
                    {
                    lv_in_5_0=(Token)match(input,76,FOLLOW_76_in_ruleArgument7473); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_in_5_0, grammarAccess.getArgumentAccess().getInInKeyword_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getArgumentRule());
                      	        }
                             		setWithLastConsumed(current, "in", true, "in");
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3214:3: ( (lv_optional_6_0= 'optional' ) )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==77) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3215:1: (lv_optional_6_0= 'optional' )
                    {
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3215:1: (lv_optional_6_0= 'optional' )
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3216:3: lv_optional_6_0= 'optional'
                    {
                    lv_optional_6_0=(Token)match(input,77,FOLLOW_77_in_ruleArgument7505); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_optional_6_0, grammarAccess.getArgumentAccess().getOptionalOptionalKeyword_2_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getArgumentRule());
                      	        }
                             		setWithLastConsumed(current, "optional", true, "optional");
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3229:3: ( (lv_type_7_0= ruleTypeRef ) )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3230:1: (lv_type_7_0= ruleTypeRef )
            {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3230:1: (lv_type_7_0= ruleTypeRef )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3231:3: lv_type_7_0= ruleTypeRef
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getArgumentAccess().getTypeTypeRefParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleTypeRef_in_ruleArgument7540);
            lv_type_7_0=ruleTypeRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getArgumentRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_7_0, 
                      		"TypeRef");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3247:2: ( (lv_ellipsis_8_0= '...' ) )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==78) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3248:1: (lv_ellipsis_8_0= '...' )
                    {
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3248:1: (lv_ellipsis_8_0= '...' )
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3249:3: lv_ellipsis_8_0= '...'
                    {
                    lv_ellipsis_8_0=(Token)match(input,78,FOLLOW_78_in_ruleArgument7558); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_ellipsis_8_0, grammarAccess.getArgumentAccess().getEllipsisFullStopFullStopFullStopKeyword_4_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getArgumentRule());
                      	        }
                             		setWithLastConsumed(current, "ellipsis", true, "...");
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3262:3: ( (lv_name_9_0= RULE_ID ) )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3263:1: (lv_name_9_0= RULE_ID )
            {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3263:1: (lv_name_9_0= RULE_ID )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3264:3: lv_name_9_0= RULE_ID
            {
            lv_name_9_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleArgument7589); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_9_0, grammarAccess.getArgumentAccess().getNameIDTerminalRuleCall_5_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getArgumentRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_9_0, 
                      		"ID");
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleArgument"


    // $ANTLR start "entryRuleArgumentExtendedAttribute"
    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3288:1: entryRuleArgumentExtendedAttribute returns [EObject current=null] : iv_ruleArgumentExtendedAttribute= ruleArgumentExtendedAttribute EOF ;
    public final EObject entryRuleArgumentExtendedAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArgumentExtendedAttribute = null;


        try {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3289:2: (iv_ruleArgumentExtendedAttribute= ruleArgumentExtendedAttribute EOF )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3290:2: iv_ruleArgumentExtendedAttribute= ruleArgumentExtendedAttribute EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArgumentExtendedAttributeRule()); 
            }
            pushFollow(FOLLOW_ruleArgumentExtendedAttribute_in_entryRuleArgumentExtendedAttribute7630);
            iv_ruleArgumentExtendedAttribute=ruleArgumentExtendedAttribute();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArgumentExtendedAttribute; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleArgumentExtendedAttribute7640); if (state.failed) return current;

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
    // $ANTLR end "entryRuleArgumentExtendedAttribute"


    // $ANTLR start "ruleArgumentExtendedAttribute"
    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3297:1: ruleArgumentExtendedAttribute returns [EObject current=null] : (this_AllowAny_0= ruleAllowAny | this_TreatNullAs_1= ruleTreatNullAs | this_TreatUndefinedAs_2= ruleTreatUndefinedAs ) ;
    public final EObject ruleArgumentExtendedAttribute() throws RecognitionException {
        EObject current = null;

        EObject this_AllowAny_0 = null;

        EObject this_TreatNullAs_1 = null;

        EObject this_TreatUndefinedAs_2 = null;


         enterRule(); 
            
        try {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3300:28: ( (this_AllowAny_0= ruleAllowAny | this_TreatNullAs_1= ruleTreatNullAs | this_TreatUndefinedAs_2= ruleTreatUndefinedAs ) )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3301:1: (this_AllowAny_0= ruleAllowAny | this_TreatNullAs_1= ruleTreatNullAs | this_TreatUndefinedAs_2= ruleTreatUndefinedAs )
            {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3301:1: (this_AllowAny_0= ruleAllowAny | this_TreatNullAs_1= ruleTreatNullAs | this_TreatUndefinedAs_2= ruleTreatUndefinedAs )
            int alt65=3;
            switch ( input.LA(1) ) {
            case 49:
                {
                alt65=1;
                }
                break;
            case 45:
                {
                alt65=2;
                }
                break;
            case 47:
                {
                alt65=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 65, 0, input);

                throw nvae;
            }

            switch (alt65) {
                case 1 :
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3302:2: this_AllowAny_0= ruleAllowAny
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getArgumentExtendedAttributeAccess().getAllowAnyParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAllowAny_in_ruleArgumentExtendedAttribute7690);
                    this_AllowAny_0=ruleAllowAny();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_AllowAny_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3315:2: this_TreatNullAs_1= ruleTreatNullAs
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getArgumentExtendedAttributeAccess().getTreatNullAsParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleTreatNullAs_in_ruleArgumentExtendedAttribute7720);
                    this_TreatNullAs_1=ruleTreatNullAs();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_TreatNullAs_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3328:2: this_TreatUndefinedAs_2= ruleTreatUndefinedAs
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getArgumentExtendedAttributeAccess().getTreatUndefinedAsParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleTreatUndefinedAs_in_ruleArgumentExtendedAttribute7750);
                    this_TreatUndefinedAs_2=ruleTreatUndefinedAs();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_TreatUndefinedAs_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleArgumentExtendedAttribute"


    // $ANTLR start "entryRuleConst"
    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3347:1: entryRuleConst returns [EObject current=null] : iv_ruleConst= ruleConst EOF ;
    public final EObject entryRuleConst() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConst = null;


        try {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3348:2: (iv_ruleConst= ruleConst EOF )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3349:2: iv_ruleConst= ruleConst EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConstRule()); 
            }
            pushFollow(FOLLOW_ruleConst_in_entryRuleConst7785);
            iv_ruleConst=ruleConst();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConst; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConst7795); if (state.failed) return current;

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
    // $ANTLR end "entryRuleConst"


    // $ANTLR start "ruleConst"
    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3356:1: ruleConst returns [EObject current=null] : (otherlv_0= 'const' ( (lv_type_1_0= ruleTypeRef ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_expr_4_0= ruleConstExpr ) ) otherlv_5= ';' ) ;
    public final EObject ruleConst() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_type_1_0 = null;

        EObject lv_expr_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3359:28: ( (otherlv_0= 'const' ( (lv_type_1_0= ruleTypeRef ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_expr_4_0= ruleConstExpr ) ) otherlv_5= ';' ) )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3360:1: (otherlv_0= 'const' ( (lv_type_1_0= ruleTypeRef ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_expr_4_0= ruleConstExpr ) ) otherlv_5= ';' )
            {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3360:1: (otherlv_0= 'const' ( (lv_type_1_0= ruleTypeRef ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_expr_4_0= ruleConstExpr ) ) otherlv_5= ';' )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3360:3: otherlv_0= 'const' ( (lv_type_1_0= ruleTypeRef ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_expr_4_0= ruleConstExpr ) ) otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,79,FOLLOW_79_in_ruleConst7832); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getConstAccess().getConstKeyword_0());
                  
            }
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3364:1: ( (lv_type_1_0= ruleTypeRef ) )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3365:1: (lv_type_1_0= ruleTypeRef )
            {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3365:1: (lv_type_1_0= ruleTypeRef )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3366:3: lv_type_1_0= ruleTypeRef
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getConstAccess().getTypeTypeRefParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleTypeRef_in_ruleConst7853);
            lv_type_1_0=ruleTypeRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getConstRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_1_0, 
                      		"TypeRef");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3382:2: ( (lv_name_2_0= RULE_ID ) )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3383:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3383:1: (lv_name_2_0= RULE_ID )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3384:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleConst7870); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_2_0, grammarAccess.getConstAccess().getNameIDTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getConstRule());
              	        }
                     		addWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_2_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,37,FOLLOW_37_in_ruleConst7887); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getConstAccess().getEqualsSignKeyword_3());
                  
            }
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3404:1: ( (lv_expr_4_0= ruleConstExpr ) )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3405:1: (lv_expr_4_0= ruleConstExpr )
            {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3405:1: (lv_expr_4_0= ruleConstExpr )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3406:3: lv_expr_4_0= ruleConstExpr
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getConstAccess().getExprConstExprParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleConstExpr_in_ruleConst7908);
            lv_expr_4_0=ruleConstExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getConstRule());
              	        }
                     		set(
                     			current, 
                     			"expr",
                      		lv_expr_4_0, 
                      		"ConstExpr");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_5=(Token)match(input,12,FOLLOW_12_in_ruleConst7920); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getConstAccess().getSemicolonKeyword_5());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleConst"


    // $ANTLR start "entryRuleConstExpr"
    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3434:1: entryRuleConstExpr returns [EObject current=null] : iv_ruleConstExpr= ruleConstExpr EOF ;
    public final EObject entryRuleConstExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstExpr = null;


        try {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3435:2: (iv_ruleConstExpr= ruleConstExpr EOF )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3436:2: iv_ruleConstExpr= ruleConstExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConstExprRule()); 
            }
            pushFollow(FOLLOW_ruleConstExpr_in_entryRuleConstExpr7956);
            iv_ruleConstExpr=ruleConstExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConstExpr; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstExpr7966); if (state.failed) return current;

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
    // $ANTLR end "entryRuleConstExpr"


    // $ANTLR start "ruleConstExpr"
    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3443:1: ruleConstExpr returns [EObject current=null] : ( ( () this_STRING_1= RULE_STRING ) | ( () (otherlv_3= '0x' )? this_INT_4= RULE_INT ) ) ;
    public final EObject ruleConstExpr() throws RecognitionException {
        EObject current = null;

        Token this_STRING_1=null;
        Token otherlv_3=null;
        Token this_INT_4=null;

         enterRule(); 
            
        try {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3446:28: ( ( ( () this_STRING_1= RULE_STRING ) | ( () (otherlv_3= '0x' )? this_INT_4= RULE_INT ) ) )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3447:1: ( ( () this_STRING_1= RULE_STRING ) | ( () (otherlv_3= '0x' )? this_INT_4= RULE_INT ) )
            {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3447:1: ( ( () this_STRING_1= RULE_STRING ) | ( () (otherlv_3= '0x' )? this_INT_4= RULE_INT ) )
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==RULE_STRING) ) {
                alt67=1;
            }
            else if ( (LA67_0==RULE_INT||LA67_0==80) ) {
                alt67=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 67, 0, input);

                throw nvae;
            }
            switch (alt67) {
                case 1 :
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3447:2: ( () this_STRING_1= RULE_STRING )
                    {
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3447:2: ( () this_STRING_1= RULE_STRING )
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3447:3: () this_STRING_1= RULE_STRING
                    {
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3447:3: ()
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3448:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getConstExprAccess().getConstExprAction_0_0(),
                                  current);
                          
                    }

                    }

                    this_STRING_1=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleConstExpr8015); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_STRING_1, grammarAccess.getConstExprAccess().getSTRINGTerminalRuleCall_0_1()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3461:6: ( () (otherlv_3= '0x' )? this_INT_4= RULE_INT )
                    {
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3461:6: ( () (otherlv_3= '0x' )? this_INT_4= RULE_INT )
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3461:7: () (otherlv_3= '0x' )? this_INT_4= RULE_INT
                    {
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3461:7: ()
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3462:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getConstExprAccess().getConstExprAction_1_0(),
                                  current);
                          
                    }

                    }

                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3470:2: (otherlv_3= '0x' )?
                    int alt66=2;
                    int LA66_0 = input.LA(1);

                    if ( (LA66_0==80) ) {
                        alt66=1;
                    }
                    switch (alt66) {
                        case 1 :
                            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3470:4: otherlv_3= '0x'
                            {
                            otherlv_3=(Token)match(input,80,FOLLOW_80_in_ruleConstExpr8047); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_3, grammarAccess.getConstExprAccess().getXKeyword_1_1());
                                  
                            }

                            }
                            break;

                    }

                    this_INT_4=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleConstExpr8060); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_INT_4, grammarAccess.getConstExprAccess().getINTTerminalRuleCall_1_2()); 
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleConstExpr"

    // Delegated rules


    protected DFA21 dfa21 = new DFA21(this);
    protected DFA34 dfa34 = new DFA34(this);
    static final String DFA21_eotS =
        "\12\uffff";
    static final String DFA21_eofS =
        "\12\uffff";
    static final String DFA21_minS =
        "\1\5\1\40\4\uffff\1\42\1\40\1\75\1\42";
    static final String DFA21_maxS =
        "\1\113\1\64\4\uffff\1\67\1\64\1\113\1\67";
    static final String DFA21_acceptS =
        "\2\uffff\1\1\1\2\1\3\1\4\4\uffff";
    static final String DFA21_specialS =
        "\12\uffff}>";
    static final String[] DFA21_transitionS = {
            "\1\5\7\uffff\1\4\50\uffff\1\1\6\uffff\1\2\15\uffff\1\3",
            "\1\2\3\uffff\1\2\1\uffff\1\2\2\uffff\1\6\2\2\7\uffff\2\2",
            "",
            "",
            "",
            "",
            "\1\7\24\uffff\1\10",
            "\1\2\3\uffff\1\2\1\uffff\1\2\2\uffff\1\11\2\2\7\uffff\2\2",
            "\1\2\15\uffff\1\3",
            "\1\7\24\uffff\1\10"
    };

    static final short[] DFA21_eot = DFA.unpackEncodedString(DFA21_eotS);
    static final short[] DFA21_eof = DFA.unpackEncodedString(DFA21_eofS);
    static final char[] DFA21_min = DFA.unpackEncodedStringToUnsignedChars(DFA21_minS);
    static final char[] DFA21_max = DFA.unpackEncodedStringToUnsignedChars(DFA21_maxS);
    static final short[] DFA21_accept = DFA.unpackEncodedString(DFA21_acceptS);
    static final short[] DFA21_special = DFA.unpackEncodedString(DFA21_specialS);
    static final short[][] DFA21_transition;

    static {
        int numStates = DFA21_transitionS.length;
        DFA21_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA21_transition[i] = DFA.unpackEncodedString(DFA21_transitionS[i]);
        }
    }

    class DFA21 extends DFA {

        public DFA21(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 21;
            this.eot = DFA21_eot;
            this.eof = DFA21_eof;
            this.min = DFA21_min;
            this.max = DFA21_max;
            this.accept = DFA21_accept;
            this.special = DFA21_special;
            this.transition = DFA21_transition;
        }
        public String getDescription() {
            return "1424:1: (this_Interface_0= ruleInterface | this_Exception_1= ruleException | this_TypeDef_2= ruleTypeDef | this_ImplementStatement_3= ruleImplementStatement )";
        }
    }
    static final String DFA34_eotS =
        "\25\uffff";
    static final String DFA34_eofS =
        "\25\uffff";
    static final String DFA34_minS =
        "\1\5\1\54\1\5\2\uffff\2\45\2\56\3\42\1\54\1\5\2\45\2\56\3\42";
    static final String DFA34_maxS =
        "\1\110\1\62\1\110\2\uffff\2\45\1\56\1\60\3\67\1\62\1\110\2\45\1"+
        "\56\1\60\3\67";
    static final String DFA34_acceptS =
        "\3\uffff\1\1\1\2\20\uffff";
    static final String DFA34_specialS =
        "\25\uffff}>";
    static final String[] DFA34_transitionS = {
            "\1\4\11\uffff\15\4\1\uffff\1\4\30\uffff\1\1\10\uffff\1\2\1"+
            "\4\1\uffff\5\4\2\3",
            "\1\3\1\5\1\uffff\1\6\2\uffff\1\3",
            "\1\4\11\uffff\15\4\1\uffff\1\4\42\uffff\1\4\1\uffff\5\4\2"+
            "\3",
            "",
            "",
            "\1\7",
            "\1\10",
            "\1\11",
            "\1\12\1\uffff\1\13",
            "\1\14\24\uffff\1\15",
            "\1\14\24\uffff\1\15",
            "\1\14\24\uffff\1\15",
            "\1\3\1\16\1\uffff\1\17\2\uffff\1\3",
            "\1\4\11\uffff\15\4\1\uffff\1\4\41\uffff\1\2\1\4\1\uffff\5"+
            "\4\2\3",
            "\1\20",
            "\1\21",
            "\1\22",
            "\1\23\1\uffff\1\24",
            "\1\14\24\uffff\1\15",
            "\1\14\24\uffff\1\15",
            "\1\14\24\uffff\1\15"
    };

    static final short[] DFA34_eot = DFA.unpackEncodedString(DFA34_eotS);
    static final short[] DFA34_eof = DFA.unpackEncodedString(DFA34_eofS);
    static final char[] DFA34_min = DFA.unpackEncodedStringToUnsignedChars(DFA34_minS);
    static final char[] DFA34_max = DFA.unpackEncodedStringToUnsignedChars(DFA34_maxS);
    static final short[] DFA34_accept = DFA.unpackEncodedString(DFA34_acceptS);
    static final short[] DFA34_special = DFA.unpackEncodedString(DFA34_specialS);
    static final short[][] DFA34_transition;

    static {
        int numStates = DFA34_transitionS.length;
        DFA34_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA34_transition[i] = DFA.unpackEncodedString(DFA34_transitionS[i]);
        }
    }

    class DFA34 extends DFA {

        public DFA34(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 34;
            this.eot = DFA34_eot;
            this.eof = DFA34_eof;
            this.min = DFA34_min;
            this.max = DFA34_max;
            this.accept = DFA34_accept;
            this.special = DFA34_special;
            this.transition = DFA34_transition;
        }
        public String getDescription() {
            return "2143:1: (this_Attribute_0= ruleAttribute | this_Operation_1= ruleOperation )";
        }
    }
 

    public static final BitSet FOLLOW_ruleIDLDefinitions_in_entryRuleIDLDefinitions81 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIDLDefinitions91 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_ruleIDLDefinitions137 = new BitSet(new long[]{0x2140000000002822L,0x0000000000000800L});
    public static final BitSet FOLLOW_ruleAbstractDefinitions_in_ruleIDLDefinitions159 = new BitSet(new long[]{0x2140000000002022L,0x0000000000000800L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport196 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleImport243 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleImport260 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleImport277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeDef_in_entryRuleTypeDef313 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeDef323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleTypeDef360 = new BitSet(new long[]{0x204000002FFFA020L,0x0000000000000800L});
    public static final BitSet FOLLOW_ruleTypeRef_in_ruleTypeDef381 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTypeDef398 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleTypeDef415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeRef_in_entryRuleTypeRef451 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeRef461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveTypeRef_in_ruleTypeRef512 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_14_in_ruleTypeRef529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSequenceType_in_ruleTypeRef576 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_14_in_ruleTypeRef593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUserTypeRef_in_ruleTypeRef640 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_14_in_ruleTypeRef657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUserTypeRef_in_entryRuleUserTypeRef708 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUserTypeRef718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScopedName_in_ruleUserTypeRef769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveTypeRef_in_entryRulePrimitiveTypeRef806 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimitiveTypeRef816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rulePrimitiveTypeRef859 = new BitSet(new long[]{0x000000000FFF0000L});
    public static final BitSet FOLLOW_16_in_rulePrimitiveTypeRef893 = new BitSet(new long[]{0x000000001FFF0002L});
    public static final BitSet FOLLOW_17_in_rulePrimitiveTypeRef922 = new BitSet(new long[]{0x000000001FFF0002L});
    public static final BitSet FOLLOW_18_in_rulePrimitiveTypeRef951 = new BitSet(new long[]{0x000000001FFF0002L});
    public static final BitSet FOLLOW_19_in_rulePrimitiveTypeRef980 = new BitSet(new long[]{0x000000001FFF0002L});
    public static final BitSet FOLLOW_20_in_rulePrimitiveTypeRef1009 = new BitSet(new long[]{0x000000001FFF0002L});
    public static final BitSet FOLLOW_21_in_rulePrimitiveTypeRef1038 = new BitSet(new long[]{0x000000001FFF0002L});
    public static final BitSet FOLLOW_22_in_rulePrimitiveTypeRef1067 = new BitSet(new long[]{0x000000001FFF0002L});
    public static final BitSet FOLLOW_23_in_rulePrimitiveTypeRef1096 = new BitSet(new long[]{0x000000001FFF0002L});
    public static final BitSet FOLLOW_24_in_rulePrimitiveTypeRef1125 = new BitSet(new long[]{0x000000001FFF0002L});
    public static final BitSet FOLLOW_25_in_rulePrimitiveTypeRef1154 = new BitSet(new long[]{0x000000001FFF0002L});
    public static final BitSet FOLLOW_26_in_rulePrimitiveTypeRef1183 = new BitSet(new long[]{0x000000001FFF0002L});
    public static final BitSet FOLLOW_27_in_rulePrimitiveTypeRef1212 = new BitSet(new long[]{0x000000001FFF0002L});
    public static final BitSet FOLLOW_28_in_rulePrimitiveTypeRef1247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSequenceType_in_entryRuleSequenceType1297 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSequenceType1307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleSequenceType1344 = new BitSet(new long[]{0x204000002FFFA020L,0x0000000000000800L});
    public static final BitSet FOLLOW_ruleTypeRef_in_ruleSequenceType1365 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleSequenceType1377 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_28_in_ruleSequenceType1395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScopedName_in_entryRuleScopedName1446 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleScopedName1457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleScopedName1497 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_31_in_ruleScopedName1516 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleScopedName1531 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_ruleConstructor_in_entryRuleConstructor1580 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstructor1590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleConstructor1627 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_33_in_ruleConstructor1652 = new BitSet(new long[]{0x204000002FFFA020L,0x0000000000003800L});
    public static final BitSet FOLLOW_ruleArgument_in_ruleConstructor1673 = new BitSet(new long[]{0x0000000C00000000L});
    public static final BitSet FOLLOW_34_in_ruleConstructor1686 = new BitSet(new long[]{0x204000002FFFA020L,0x0000000000003800L});
    public static final BitSet FOLLOW_ruleArgument_in_ruleConstructor1707 = new BitSet(new long[]{0x0000000C00000000L});
    public static final BitSet FOLLOW_35_in_ruleConstructor1721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNamedConstructor_in_entryRuleNamedConstructor1759 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNamedConstructor1769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleNamedConstructor1806 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleNamedConstructor1830 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNamedConstructor1847 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_33_in_ruleNamedConstructor1865 = new BitSet(new long[]{0x204000082FFFA020L,0x0000000000003800L});
    public static final BitSet FOLLOW_ruleArgument_in_ruleNamedConstructor1887 = new BitSet(new long[]{0x0000000C00000000L});
    public static final BitSet FOLLOW_34_in_ruleNamedConstructor1900 = new BitSet(new long[]{0x204000002FFFA020L,0x0000000000003800L});
    public static final BitSet FOLLOW_ruleArgument_in_ruleNamedConstructor1921 = new BitSet(new long[]{0x0000000C00000000L});
    public static final BitSet FOLLOW_35_in_ruleNamedConstructor1937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCallback_in_entryRuleCallback1975 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCallback1985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleCallback2023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleCallback2055 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleCallback2067 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleCallback2085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleCallback2118 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleCallback2130 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleCallback2148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNoInterfaceObject_in_entryRuleNoInterfaceObject2198 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNoInterfaceObject2208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleNoInterfaceObject2257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOverrideBuiltins_in_entryRuleOverrideBuiltins2294 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOverrideBuiltins2305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleOverrideBuiltins2342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrototypeRoot_in_entryRulePrototypeRoot2381 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrototypeRoot2391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rulePrototypeRoot2440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePutForwards_in_entryRulePutForwards2476 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePutForwards2486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rulePutForwards2523 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_rulePutForwards2535 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePutForwards2559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTreatNullAs_in_entryRuleTreatNullAs2595 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTreatNullAs2605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleTreatNullAs2654 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleTreatNullAs2666 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleTreatNullAs2678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTreatUndefinedAs_in_entryRuleTreatUndefinedAs2714 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTreatUndefinedAs2724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleTreatUndefinedAs2774 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleTreatUndefinedAs2786 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleTreatUndefinedAs2804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleTreatUndefinedAs2849 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleTreatUndefinedAs2861 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_ruleTreatUndefinedAs2879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAllowAny_in_entryRuleAllowAny2929 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAllowAny2939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleAllowAny2988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReplaceable_in_entryRuleReplaceable3024 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReplaceable3034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleReplaceable3083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSupplemental_in_entryRuleSupplemental3119 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSupplemental3129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleSupplemental3178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReplaceableNamedProperties_in_entryRuleReplaceableNamedProperties3214 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReplaceableNamedProperties3224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleReplaceableNamedProperties3273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractDefinitions_in_entryRuleAbstractDefinitions3309 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractDefinitions3319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefinitions_in_ruleAbstractDefinitions3369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModule_in_ruleAbstractDefinitions3399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefinitions_in_entryRuleDefinitions3434 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefinitions3444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterface_in_ruleDefinitions3494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleException_in_ruleDefinitions3524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeDef_in_ruleDefinitions3554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImplementStatement_in_ruleDefinitions3584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImplementStatement_in_entryRuleImplementStatement3619 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImplementStatement3629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScopedName_in_ruleImplementStatement3681 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_ruleImplementStatement3693 = new BitSet(new long[]{0x2040000000002020L,0x0000000000000800L});
    public static final BitSet FOLLOW_ruleScopedName_in_ruleImplementStatement3720 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleImplementStatement3732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModule_in_entryRuleModule3768 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModule3778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleModule3816 = new BitSet(new long[]{0x1800000000000000L});
    public static final BitSet FOLLOW_ruleModuleExtendedAttribute_in_ruleModule3837 = new BitSet(new long[]{0x0080000400000000L});
    public static final BitSet FOLLOW_34_in_ruleModule3850 = new BitSet(new long[]{0x1800000000000000L});
    public static final BitSet FOLLOW_ruleModuleExtendedAttribute_in_ruleModule3871 = new BitSet(new long[]{0x0080000400000000L});
    public static final BitSet FOLLOW_55_in_ruleModule3885 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_ruleModule3899 = new BitSet(new long[]{0x2040000000002020L,0x0000000000000800L});
    public static final BitSet FOLLOW_ruleScopedName_in_ruleModule3920 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_ruleModule3932 = new BitSet(new long[]{0x2140000000002020L,0x0000000000000800L});
    public static final BitSet FOLLOW_ruleAbstractDefinitions_in_ruleModule3953 = new BitSet(new long[]{0x2540000000002020L,0x0000000000000800L});
    public static final BitSet FOLLOW_58_in_ruleModule3966 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleModule3978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModuleExtendedAttribute_in_entryRuleModuleExtendedAttribute4014 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModuleExtendedAttribute4024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrefix_in_ruleModuleExtendedAttribute4074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNamespaceObject_in_ruleModuleExtendedAttribute4104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrefix_in_entryRulePrefix4139 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrefix4149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_rulePrefix4186 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_rulePrefix4198 = new BitSet(new long[]{0x2040000000002020L,0x0000000000000800L});
    public static final BitSet FOLLOW_ruleScopedName_in_rulePrefix4219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNamespaceObject_in_entryRuleNamespaceObject4255 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNamespaceObject4265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleNamespaceObject4302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterface_in_entryRuleInterface4350 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterface4360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleInterface4398 = new BitSet(new long[]{0x00180E5100000000L});
    public static final BitSet FOLLOW_ruleInterfaceExtendedAttribute_in_ruleInterface4419 = new BitSet(new long[]{0x0080000400000000L});
    public static final BitSet FOLLOW_34_in_ruleInterface4432 = new BitSet(new long[]{0x00180E5100000000L});
    public static final BitSet FOLLOW_ruleInterfaceExtendedAttribute_in_ruleInterface4453 = new BitSet(new long[]{0x0080000400000000L});
    public static final BitSet FOLLOW_55_in_ruleInterface4467 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_ruleInterface4481 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInterface4498 = new BitSet(new long[]{0x4200000000001000L});
    public static final BitSet FOLLOW_62_in_ruleInterface4517 = new BitSet(new long[]{0x2040000000002020L,0x0000000000000800L});
    public static final BitSet FOLLOW_ruleScopedName_in_ruleInterface4544 = new BitSet(new long[]{0x0200000400001000L});
    public static final BitSet FOLLOW_34_in_ruleInterface4558 = new BitSet(new long[]{0x2040000000002020L,0x0000000000000800L});
    public static final BitSet FOLLOW_ruleScopedName_in_ruleInterface4585 = new BitSet(new long[]{0x0200000400001000L});
    public static final BitSet FOLLOW_57_in_ruleInterface4602 = new BitSet(new long[]{0xA44000002FFFA020L,0x00000000000089FDL});
    public static final BitSet FOLLOW_ruleInterfaceMember_in_ruleInterface4623 = new BitSet(new long[]{0xA44000002FFFA020L,0x00000000000089FDL});
    public static final BitSet FOLLOW_58_in_ruleInterface4636 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleInterface4650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfaceExtendedAttribute_in_entryRuleInterfaceExtendedAttribute4686 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterfaceExtendedAttribute4696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCallback_in_ruleInterfaceExtendedAttribute4746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstructor_in_ruleInterfaceExtendedAttribute4776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNamedConstructor_in_ruleInterfaceExtendedAttribute4806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNoInterfaceObject_in_ruleInterfaceExtendedAttribute4836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrototypeRoot_in_ruleInterfaceExtendedAttribute4866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSupplemental_in_ruleInterfaceExtendedAttribute4896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOverrideBuiltins_in_ruleInterfaceExtendedAttribute4920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReplaceableNamedProperties_in_ruleInterfaceExtendedAttribute4950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfaceMember_in_entryRuleInterfaceMember4985 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterfaceMember4995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConst_in_ruleInterfaceMember5045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfaceFeature_in_ruleInterfaceMember5075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfaceFeature_in_entryRuleInterfaceFeature5110 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterfaceFeature5120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_ruleInterfaceFeature5170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperation_in_ruleInterfaceFeature5200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperation_in_entryRuleOperation5235 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperation5245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleOperation5283 = new BitSet(new long[]{0x0000A00000000000L});
    public static final BitSet FOLLOW_ruleOperationExtendedAttribute_in_ruleOperation5304 = new BitSet(new long[]{0x0080000400000000L});
    public static final BitSet FOLLOW_34_in_ruleOperation5317 = new BitSet(new long[]{0x0000A00000000000L});
    public static final BitSet FOLLOW_ruleOperationExtendedAttribute_in_ruleOperation5338 = new BitSet(new long[]{0x0080000400000000L});
    public static final BitSet FOLLOW_55_in_ruleOperation5352 = new BitSet(new long[]{0xA04000002FFFA020L,0x000000000000087DL});
    public static final BitSet FOLLOW_63_in_ruleOperation5372 = new BitSet(new long[]{0x204000002FFFA020L,0x000000000000087DL});
    public static final BitSet FOLLOW_64_in_ruleOperation5404 = new BitSet(new long[]{0x204000002FFFA020L,0x000000000000087CL});
    public static final BitSet FOLLOW_ruleOperationSpecial_in_ruleOperation5439 = new BitSet(new long[]{0x204000002FFFA020L,0x000000000000087CL});
    public static final BitSet FOLLOW_ruleTypeRef_in_ruleOperation5461 = new BitSet(new long[]{0x0000000200000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleOperation5478 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleOperation5496 = new BitSet(new long[]{0x204000082FFFA020L,0x0000000000003800L});
    public static final BitSet FOLLOW_ruleArgument_in_ruleOperation5518 = new BitSet(new long[]{0x0000000C00000000L});
    public static final BitSet FOLLOW_34_in_ruleOperation5531 = new BitSet(new long[]{0x204000002FFFA020L,0x0000000000003800L});
    public static final BitSet FOLLOW_ruleArgument_in_ruleOperation5552 = new BitSet(new long[]{0x0000000C00000000L});
    public static final BitSet FOLLOW_35_in_ruleOperation5568 = new BitSet(new long[]{0x0000000000001000L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleOperation5581 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleOperation5593 = new BitSet(new long[]{0x2040000000002020L,0x0000000000000800L});
    public static final BitSet FOLLOW_ruleScopedName_in_ruleOperation5620 = new BitSet(new long[]{0x0000000C00000000L});
    public static final BitSet FOLLOW_34_in_ruleOperation5633 = new BitSet(new long[]{0x2040000000002020L,0x0000000000000800L});
    public static final BitSet FOLLOW_ruleScopedName_in_ruleOperation5660 = new BitSet(new long[]{0x0000000C00000000L});
    public static final BitSet FOLLOW_35_in_ruleOperation5674 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleOperation5688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperationExtendedAttribute_in_entryRuleOperationExtendedAttribute5724 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperationExtendedAttribute5734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTreatNullAs_in_ruleOperationExtendedAttribute5784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTreatUndefinedAs_in_ruleOperationExtendedAttribute5814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperationSpecial_in_entryRuleOperationSpecial5849 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperationSpecial5859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleOperationSpecial5909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleOperationSpecial5941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleOperationSpecial5973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleOperationSpecial6005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleOperationSpecial6037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute6074 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttribute6084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleAttribute6122 = new BitSet(new long[]{0x0004B00000000000L});
    public static final BitSet FOLLOW_ruleAttributeExtendedAttribute_in_ruleAttribute6143 = new BitSet(new long[]{0x0080000400000000L});
    public static final BitSet FOLLOW_34_in_ruleAttribute6156 = new BitSet(new long[]{0x0004B00000000000L});
    public static final BitSet FOLLOW_ruleAttributeExtendedAttribute_in_ruleAttribute6177 = new BitSet(new long[]{0x0080000400000000L});
    public static final BitSet FOLLOW_55_in_ruleAttribute6191 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000180L});
    public static final BitSet FOLLOW_63_in_ruleAttribute6211 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000180L});
    public static final BitSet FOLLOW_71_in_ruleAttribute6238 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_ruleAttribute6252 = new BitSet(new long[]{0x204000002FFFA020L,0x0000000000000800L});
    public static final BitSet FOLLOW_ruleTypeRef_in_ruleAttribute6273 = new BitSet(new long[]{0x2040000000002020L,0x0000000000000800L});
    public static final BitSet FOLLOW_ruleScopedName_in_ruleAttribute6294 = new BitSet(new long[]{0x0000000000001000L,0x0000000000000600L});
    public static final BitSet FOLLOW_73_in_ruleAttribute6308 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleAttribute6320 = new BitSet(new long[]{0x2040000000002020L,0x0000000000000800L});
    public static final BitSet FOLLOW_ruleScopedName_in_ruleAttribute6347 = new BitSet(new long[]{0x0000000C00000000L});
    public static final BitSet FOLLOW_34_in_ruleAttribute6360 = new BitSet(new long[]{0x2040000000002020L,0x0000000000000800L});
    public static final BitSet FOLLOW_ruleScopedName_in_ruleAttribute6387 = new BitSet(new long[]{0x0000000C00000000L});
    public static final BitSet FOLLOW_35_in_ruleAttribute6401 = new BitSet(new long[]{0x0000000000001000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_ruleAttribute6416 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleAttribute6428 = new BitSet(new long[]{0x2040000000002020L,0x0000000000000800L});
    public static final BitSet FOLLOW_ruleScopedName_in_ruleAttribute6455 = new BitSet(new long[]{0x0000000C00000000L});
    public static final BitSet FOLLOW_34_in_ruleAttribute6468 = new BitSet(new long[]{0x2040000000002020L,0x0000000000000800L});
    public static final BitSet FOLLOW_ruleScopedName_in_ruleAttribute6495 = new BitSet(new long[]{0x0000000C00000000L});
    public static final BitSet FOLLOW_35_in_ruleAttribute6509 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleAttribute6524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeExtendedAttribute_in_entryRuleAttributeExtendedAttribute6560 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttributeExtendedAttribute6570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePutForwards_in_ruleAttributeExtendedAttribute6620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReplaceable_in_ruleAttributeExtendedAttribute6650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTreatNullAs_in_ruleAttributeExtendedAttribute6680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTreatUndefinedAs_in_ruleAttributeExtendedAttribute6710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleException_in_entryRuleException6745 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleException6755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleException6793 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_ruleExceptionExtendedAttribute_in_ruleException6814 = new BitSet(new long[]{0x0080000400000000L});
    public static final BitSet FOLLOW_34_in_ruleException6827 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_ruleExceptionExtendedAttribute_in_ruleException6848 = new BitSet(new long[]{0x0080000400000000L});
    public static final BitSet FOLLOW_55_in_ruleException6862 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_ruleException6876 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleException6893 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_ruleException6910 = new BitSet(new long[]{0x244000002FFFA020L,0x0000000000008800L});
    public static final BitSet FOLLOW_ruleExceptionMember_in_ruleException6931 = new BitSet(new long[]{0x244000002FFFA020L,0x0000000000008800L});
    public static final BitSet FOLLOW_58_in_ruleException6944 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleException6956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExceptionMember_in_entryRuleExceptionMember6992 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExceptionMember7002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConst_in_ruleExceptionMember7052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExceptionField_in_ruleExceptionMember7082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExceptionField_in_entryRuleExceptionField7117 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExceptionField7127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeRef_in_ruleExceptionField7173 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleExceptionField7190 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleExceptionField7207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExceptionExtendedAttribute_in_entryRuleExceptionExtendedAttribute7243 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExceptionExtendedAttribute7253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNoInterfaceObject_in_ruleExceptionExtendedAttribute7302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArgument_in_entryRuleArgument7336 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArgument7346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleArgument7384 = new BitSet(new long[]{0x0002A00000000000L});
    public static final BitSet FOLLOW_ruleArgumentExtendedAttribute_in_ruleArgument7405 = new BitSet(new long[]{0x0080000400000000L});
    public static final BitSet FOLLOW_34_in_ruleArgument7418 = new BitSet(new long[]{0x0002A00000000000L});
    public static final BitSet FOLLOW_ruleArgumentExtendedAttribute_in_ruleArgument7439 = new BitSet(new long[]{0x0080000400000000L});
    public static final BitSet FOLLOW_55_in_ruleArgument7453 = new BitSet(new long[]{0x204000002FFFA020L,0x0000000000003800L});
    public static final BitSet FOLLOW_76_in_ruleArgument7473 = new BitSet(new long[]{0x204000002FFFA020L,0x0000000000002800L});
    public static final BitSet FOLLOW_77_in_ruleArgument7505 = new BitSet(new long[]{0x204000002FFFA020L,0x0000000000000800L});
    public static final BitSet FOLLOW_ruleTypeRef_in_ruleArgument7540 = new BitSet(new long[]{0x0000000000000020L,0x0000000000004000L});
    public static final BitSet FOLLOW_78_in_ruleArgument7558 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleArgument7589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArgumentExtendedAttribute_in_entryRuleArgumentExtendedAttribute7630 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArgumentExtendedAttribute7640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAllowAny_in_ruleArgumentExtendedAttribute7690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTreatNullAs_in_ruleArgumentExtendedAttribute7720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTreatUndefinedAs_in_ruleArgumentExtendedAttribute7750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConst_in_entryRuleConst7785 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConst7795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_ruleConst7832 = new BitSet(new long[]{0x204000002FFFA020L,0x0000000000000800L});
    public static final BitSet FOLLOW_ruleTypeRef_in_ruleConst7853 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleConst7870 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleConst7887 = new BitSet(new long[]{0x0000000000000050L,0x0000000000010000L});
    public static final BitSet FOLLOW_ruleConstExpr_in_ruleConst7908 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleConst7920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstExpr_in_entryRuleConstExpr7956 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstExpr7966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleConstExpr8015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_ruleConstExpr8047 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleConstExpr8060 = new BitSet(new long[]{0x0000000000000002L});

}