package de.fraunhofer.ipa.rossystem.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import de.fraunhofer.ipa.rossystem.services.RosSystemGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRosSystemParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_BINARY", "RULE_BOOLEAN", "RULE_DOUBLE", "RULE_DECINT", "RULE_DATE_TIME", "RULE_DIGIT", "RULE_DAY", "RULE_MONTH", "RULE_YEAR", "RULE_HOUR", "RULE_MIN_SEC", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'RosSystem'", "'{'", "'Name'", "'RosComponents'", "'('", "','", "')'", "'RosComponentStacks'", "'TopicConnections'", "'}'", "'ServiceConnections'", "'ActionConnections'", "'Parameters'", "'TopicConnection'", "'From'", "'To'", "'ServiceConnection'", "'ActionConnection'", "'ComponentStack'", "'name'", "'QualityAttributes'", "'QualityAttribute'", "'type'", "'value'", "'ComponentInterface'", "'NameSpace'", "'RosPublishers'", "'RosSubscribers'", "'RosSrvServers'", "'RosSrvClients'", "'RosActionServers'", "'RosActionClients'", "'RosParameters'", "'RosPublisher'", "'ns'", "'RefPublisher'", "'RosSubscriber'", "'RefSubscriber'", "'RosServiceServer'", "'RefServer'", "'RosServiceClient'", "'RefClient'", "'RosActionServer'", "'RosActionClient'", "'RosParameter'", "'RefParameter'", "'Parameter'", "'List'", "'Struc'", "'Integer'", "'default'", "'String'", "'Double'", "'Boolean'", "'Base64'", "'Array'", "'ParameterAny'", "'GlobalNamespace'", "'parts'", "'RelativeNamespace'", "'PrivateNamespace'", "'GraphName'"
    };
    public static final int T__50=50;
    public static final int RULE_DAY=12;
    public static final int RULE_DATE_TIME=10;
    public static final int RULE_BOOLEAN=7;
    public static final int RULE_YEAR=14;
    public static final int RULE_MIN_SEC=16;
    public static final int T__59=59;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=5;
    public static final int RULE_DIGIT=11;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=17;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=18;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=19;
    public static final int T__37=37;
    public static final int RULE_DOUBLE=8;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__77=77;
    public static final int T__34=34;
    public static final int T__78=78;
    public static final int T__35=35;
    public static final int T__79=79;
    public static final int T__36=36;
    public static final int RULE_DECINT=9;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__74=74;
    public static final int T__31=31;
    public static final int T__75=75;
    public static final int T__32=32;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int RULE_HOUR=15;
    public static final int RULE_WS=20;
    public static final int RULE_ANY_OTHER=21;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int RULE_MONTH=13;
    public static final int T__46=46;
    public static final int RULE_BINARY=6;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalRosSystemParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalRosSystemParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalRosSystemParser.tokenNames; }
    public String getGrammarFileName() { return "InternalRosSystem.g"; }



     	private RosSystemGrammarAccess grammarAccess;

        public InternalRosSystemParser(TokenStream input, RosSystemGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "RosSystem";
       	}

       	@Override
       	protected RosSystemGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleRosSystem"
    // InternalRosSystem.g:64:1: entryRuleRosSystem returns [EObject current=null] : iv_ruleRosSystem= ruleRosSystem EOF ;
    public final EObject entryRuleRosSystem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRosSystem = null;


        try {
            // InternalRosSystem.g:64:50: (iv_ruleRosSystem= ruleRosSystem EOF )
            // InternalRosSystem.g:65:2: iv_ruleRosSystem= ruleRosSystem EOF
            {
             newCompositeNode(grammarAccess.getRosSystemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRosSystem=ruleRosSystem();

            state._fsp--;

             current =iv_ruleRosSystem; 
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
    // $ANTLR end "entryRuleRosSystem"


    // $ANTLR start "ruleRosSystem"
    // InternalRosSystem.g:71:1: ruleRosSystem returns [EObject current=null] : ( () otherlv_1= 'RosSystem' otherlv_2= '{' otherlv_3= 'Name' ( (lv_Name_4_0= ruleEString ) ) (otherlv_5= 'RosComponents' otherlv_6= '(' ( ( (lv_RosComponent_7_0= ruleComponentInterface ) ) (otherlv_8= ',' ( (lv_RosComponent_9_0= ruleComponentInterface ) ) )* )? otherlv_10= ')' )? (otherlv_11= 'RosComponentStacks' otherlv_12= '(' ( ( (lv_ComponentStack_13_0= ruleComponentStack ) ) (otherlv_14= ',' ( (lv_ComponentStack_15_0= ruleComponentStack ) ) )* )? otherlv_16= ')' )? (otherlv_17= 'TopicConnections' otherlv_18= '{' ( ( (lv_TopicConnections_19_0= ruleTopicConnection ) ) (otherlv_20= ',' ( (lv_TopicConnections_21_0= ruleTopicConnection ) ) )* )? otherlv_22= '}' )? (otherlv_23= 'ServiceConnections' otherlv_24= '{' ( ( (lv_ServiceConnections_25_0= ruleServiceConnection ) ) (otherlv_26= ',' ( (lv_ServiceConnections_27_0= ruleServiceConnection ) ) )* )? otherlv_28= '}' )? (otherlv_29= 'ActionConnections' otherlv_30= '{' ( ( (lv_ActionConnections_31_0= ruleActionConnection ) ) (otherlv_32= ',' ( (lv_ActionConnections_33_0= ruleActionConnection ) ) )* )? otherlv_34= '}' )? (otherlv_35= 'Parameters' otherlv_36= '{' ( ( (lv_Parameter_37_0= ruleParameter ) ) (otherlv_38= ',' ( (lv_Parameter_39_0= ruleParameter ) ) )* )? otherlv_40= '}' )? otherlv_41= '}' ) ;
    public final EObject ruleRosSystem() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        Token otherlv_28=null;
        Token otherlv_29=null;
        Token otherlv_30=null;
        Token otherlv_32=null;
        Token otherlv_34=null;
        Token otherlv_35=null;
        Token otherlv_36=null;
        Token otherlv_38=null;
        Token otherlv_40=null;
        Token otherlv_41=null;
        AntlrDatatypeRuleToken lv_Name_4_0 = null;

        EObject lv_RosComponent_7_0 = null;

        EObject lv_RosComponent_9_0 = null;

        EObject lv_ComponentStack_13_0 = null;

        EObject lv_ComponentStack_15_0 = null;

        EObject lv_TopicConnections_19_0 = null;

        EObject lv_TopicConnections_21_0 = null;

        EObject lv_ServiceConnections_25_0 = null;

        EObject lv_ServiceConnections_27_0 = null;

        EObject lv_ActionConnections_31_0 = null;

        EObject lv_ActionConnections_33_0 = null;

        EObject lv_Parameter_37_0 = null;

        EObject lv_Parameter_39_0 = null;



        	enterRule();

        try {
            // InternalRosSystem.g:77:2: ( ( () otherlv_1= 'RosSystem' otherlv_2= '{' otherlv_3= 'Name' ( (lv_Name_4_0= ruleEString ) ) (otherlv_5= 'RosComponents' otherlv_6= '(' ( ( (lv_RosComponent_7_0= ruleComponentInterface ) ) (otherlv_8= ',' ( (lv_RosComponent_9_0= ruleComponentInterface ) ) )* )? otherlv_10= ')' )? (otherlv_11= 'RosComponentStacks' otherlv_12= '(' ( ( (lv_ComponentStack_13_0= ruleComponentStack ) ) (otherlv_14= ',' ( (lv_ComponentStack_15_0= ruleComponentStack ) ) )* )? otherlv_16= ')' )? (otherlv_17= 'TopicConnections' otherlv_18= '{' ( ( (lv_TopicConnections_19_0= ruleTopicConnection ) ) (otherlv_20= ',' ( (lv_TopicConnections_21_0= ruleTopicConnection ) ) )* )? otherlv_22= '}' )? (otherlv_23= 'ServiceConnections' otherlv_24= '{' ( ( (lv_ServiceConnections_25_0= ruleServiceConnection ) ) (otherlv_26= ',' ( (lv_ServiceConnections_27_0= ruleServiceConnection ) ) )* )? otherlv_28= '}' )? (otherlv_29= 'ActionConnections' otherlv_30= '{' ( ( (lv_ActionConnections_31_0= ruleActionConnection ) ) (otherlv_32= ',' ( (lv_ActionConnections_33_0= ruleActionConnection ) ) )* )? otherlv_34= '}' )? (otherlv_35= 'Parameters' otherlv_36= '{' ( ( (lv_Parameter_37_0= ruleParameter ) ) (otherlv_38= ',' ( (lv_Parameter_39_0= ruleParameter ) ) )* )? otherlv_40= '}' )? otherlv_41= '}' ) )
            // InternalRosSystem.g:78:2: ( () otherlv_1= 'RosSystem' otherlv_2= '{' otherlv_3= 'Name' ( (lv_Name_4_0= ruleEString ) ) (otherlv_5= 'RosComponents' otherlv_6= '(' ( ( (lv_RosComponent_7_0= ruleComponentInterface ) ) (otherlv_8= ',' ( (lv_RosComponent_9_0= ruleComponentInterface ) ) )* )? otherlv_10= ')' )? (otherlv_11= 'RosComponentStacks' otherlv_12= '(' ( ( (lv_ComponentStack_13_0= ruleComponentStack ) ) (otherlv_14= ',' ( (lv_ComponentStack_15_0= ruleComponentStack ) ) )* )? otherlv_16= ')' )? (otherlv_17= 'TopicConnections' otherlv_18= '{' ( ( (lv_TopicConnections_19_0= ruleTopicConnection ) ) (otherlv_20= ',' ( (lv_TopicConnections_21_0= ruleTopicConnection ) ) )* )? otherlv_22= '}' )? (otherlv_23= 'ServiceConnections' otherlv_24= '{' ( ( (lv_ServiceConnections_25_0= ruleServiceConnection ) ) (otherlv_26= ',' ( (lv_ServiceConnections_27_0= ruleServiceConnection ) ) )* )? otherlv_28= '}' )? (otherlv_29= 'ActionConnections' otherlv_30= '{' ( ( (lv_ActionConnections_31_0= ruleActionConnection ) ) (otherlv_32= ',' ( (lv_ActionConnections_33_0= ruleActionConnection ) ) )* )? otherlv_34= '}' )? (otherlv_35= 'Parameters' otherlv_36= '{' ( ( (lv_Parameter_37_0= ruleParameter ) ) (otherlv_38= ',' ( (lv_Parameter_39_0= ruleParameter ) ) )* )? otherlv_40= '}' )? otherlv_41= '}' )
            {
            // InternalRosSystem.g:78:2: ( () otherlv_1= 'RosSystem' otherlv_2= '{' otherlv_3= 'Name' ( (lv_Name_4_0= ruleEString ) ) (otherlv_5= 'RosComponents' otherlv_6= '(' ( ( (lv_RosComponent_7_0= ruleComponentInterface ) ) (otherlv_8= ',' ( (lv_RosComponent_9_0= ruleComponentInterface ) ) )* )? otherlv_10= ')' )? (otherlv_11= 'RosComponentStacks' otherlv_12= '(' ( ( (lv_ComponentStack_13_0= ruleComponentStack ) ) (otherlv_14= ',' ( (lv_ComponentStack_15_0= ruleComponentStack ) ) )* )? otherlv_16= ')' )? (otherlv_17= 'TopicConnections' otherlv_18= '{' ( ( (lv_TopicConnections_19_0= ruleTopicConnection ) ) (otherlv_20= ',' ( (lv_TopicConnections_21_0= ruleTopicConnection ) ) )* )? otherlv_22= '}' )? (otherlv_23= 'ServiceConnections' otherlv_24= '{' ( ( (lv_ServiceConnections_25_0= ruleServiceConnection ) ) (otherlv_26= ',' ( (lv_ServiceConnections_27_0= ruleServiceConnection ) ) )* )? otherlv_28= '}' )? (otherlv_29= 'ActionConnections' otherlv_30= '{' ( ( (lv_ActionConnections_31_0= ruleActionConnection ) ) (otherlv_32= ',' ( (lv_ActionConnections_33_0= ruleActionConnection ) ) )* )? otherlv_34= '}' )? (otherlv_35= 'Parameters' otherlv_36= '{' ( ( (lv_Parameter_37_0= ruleParameter ) ) (otherlv_38= ',' ( (lv_Parameter_39_0= ruleParameter ) ) )* )? otherlv_40= '}' )? otherlv_41= '}' )
            // InternalRosSystem.g:79:3: () otherlv_1= 'RosSystem' otherlv_2= '{' otherlv_3= 'Name' ( (lv_Name_4_0= ruleEString ) ) (otherlv_5= 'RosComponents' otherlv_6= '(' ( ( (lv_RosComponent_7_0= ruleComponentInterface ) ) (otherlv_8= ',' ( (lv_RosComponent_9_0= ruleComponentInterface ) ) )* )? otherlv_10= ')' )? (otherlv_11= 'RosComponentStacks' otherlv_12= '(' ( ( (lv_ComponentStack_13_0= ruleComponentStack ) ) (otherlv_14= ',' ( (lv_ComponentStack_15_0= ruleComponentStack ) ) )* )? otherlv_16= ')' )? (otherlv_17= 'TopicConnections' otherlv_18= '{' ( ( (lv_TopicConnections_19_0= ruleTopicConnection ) ) (otherlv_20= ',' ( (lv_TopicConnections_21_0= ruleTopicConnection ) ) )* )? otherlv_22= '}' )? (otherlv_23= 'ServiceConnections' otherlv_24= '{' ( ( (lv_ServiceConnections_25_0= ruleServiceConnection ) ) (otherlv_26= ',' ( (lv_ServiceConnections_27_0= ruleServiceConnection ) ) )* )? otherlv_28= '}' )? (otherlv_29= 'ActionConnections' otherlv_30= '{' ( ( (lv_ActionConnections_31_0= ruleActionConnection ) ) (otherlv_32= ',' ( (lv_ActionConnections_33_0= ruleActionConnection ) ) )* )? otherlv_34= '}' )? (otherlv_35= 'Parameters' otherlv_36= '{' ( ( (lv_Parameter_37_0= ruleParameter ) ) (otherlv_38= ',' ( (lv_Parameter_39_0= ruleParameter ) ) )* )? otherlv_40= '}' )? otherlv_41= '}'
            {
            // InternalRosSystem.g:79:3: ()
            // InternalRosSystem.g:80:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRosSystemAccess().getRosSystemAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getRosSystemAccess().getRosSystemKeyword_1());
            		
            otherlv_2=(Token)match(input,23,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getRosSystemAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,24,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getRosSystemAccess().getNameKeyword_3());
            		
            // InternalRosSystem.g:98:3: ( (lv_Name_4_0= ruleEString ) )
            // InternalRosSystem.g:99:4: (lv_Name_4_0= ruleEString )
            {
            // InternalRosSystem.g:99:4: (lv_Name_4_0= ruleEString )
            // InternalRosSystem.g:100:5: lv_Name_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRosSystemAccess().getNameEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_6);
            lv_Name_4_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRosSystemRule());
            					}
            					set(
            						current,
            						"Name",
            						lv_Name_4_0,
            						"de.fraunhofer.ipa.rossystem.RosSystem.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRosSystem.g:117:3: (otherlv_5= 'RosComponents' otherlv_6= '(' ( ( (lv_RosComponent_7_0= ruleComponentInterface ) ) (otherlv_8= ',' ( (lv_RosComponent_9_0= ruleComponentInterface ) ) )* )? otherlv_10= ')' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==25) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalRosSystem.g:118:4: otherlv_5= 'RosComponents' otherlv_6= '(' ( ( (lv_RosComponent_7_0= ruleComponentInterface ) ) (otherlv_8= ',' ( (lv_RosComponent_9_0= ruleComponentInterface ) ) )* )? otherlv_10= ')'
                    {
                    otherlv_5=(Token)match(input,25,FOLLOW_7); 

                    				newLeafNode(otherlv_5, grammarAccess.getRosSystemAccess().getRosComponentsKeyword_5_0());
                    			
                    otherlv_6=(Token)match(input,26,FOLLOW_8); 

                    				newLeafNode(otherlv_6, grammarAccess.getRosSystemAccess().getLeftParenthesisKeyword_5_1());
                    			
                    // InternalRosSystem.g:126:4: ( ( (lv_RosComponent_7_0= ruleComponentInterface ) ) (otherlv_8= ',' ( (lv_RosComponent_9_0= ruleComponentInterface ) ) )* )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0==46) ) {
                        alt2=1;
                    }
                    switch (alt2) {
                        case 1 :
                            // InternalRosSystem.g:127:5: ( (lv_RosComponent_7_0= ruleComponentInterface ) ) (otherlv_8= ',' ( (lv_RosComponent_9_0= ruleComponentInterface ) ) )*
                            {
                            // InternalRosSystem.g:127:5: ( (lv_RosComponent_7_0= ruleComponentInterface ) )
                            // InternalRosSystem.g:128:6: (lv_RosComponent_7_0= ruleComponentInterface )
                            {
                            // InternalRosSystem.g:128:6: (lv_RosComponent_7_0= ruleComponentInterface )
                            // InternalRosSystem.g:129:7: lv_RosComponent_7_0= ruleComponentInterface
                            {

                            							newCompositeNode(grammarAccess.getRosSystemAccess().getRosComponentComponentInterfaceParserRuleCall_5_2_0_0());
                            						
                            pushFollow(FOLLOW_9);
                            lv_RosComponent_7_0=ruleComponentInterface();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getRosSystemRule());
                            							}
                            							add(
                            								current,
                            								"RosComponent",
                            								lv_RosComponent_7_0,
                            								"de.fraunhofer.ipa.rossystem.RosSystem.ComponentInterface");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }

                            // InternalRosSystem.g:146:5: (otherlv_8= ',' ( (lv_RosComponent_9_0= ruleComponentInterface ) ) )*
                            loop1:
                            do {
                                int alt1=2;
                                int LA1_0 = input.LA(1);

                                if ( (LA1_0==27) ) {
                                    alt1=1;
                                }


                                switch (alt1) {
                            	case 1 :
                            	    // InternalRosSystem.g:147:6: otherlv_8= ',' ( (lv_RosComponent_9_0= ruleComponentInterface ) )
                            	    {
                            	    otherlv_8=(Token)match(input,27,FOLLOW_10); 

                            	    						newLeafNode(otherlv_8, grammarAccess.getRosSystemAccess().getCommaKeyword_5_2_1_0());
                            	    					
                            	    // InternalRosSystem.g:151:6: ( (lv_RosComponent_9_0= ruleComponentInterface ) )
                            	    // InternalRosSystem.g:152:7: (lv_RosComponent_9_0= ruleComponentInterface )
                            	    {
                            	    // InternalRosSystem.g:152:7: (lv_RosComponent_9_0= ruleComponentInterface )
                            	    // InternalRosSystem.g:153:8: lv_RosComponent_9_0= ruleComponentInterface
                            	    {

                            	    								newCompositeNode(grammarAccess.getRosSystemAccess().getRosComponentComponentInterfaceParserRuleCall_5_2_1_1_0());
                            	    							
                            	    pushFollow(FOLLOW_9);
                            	    lv_RosComponent_9_0=ruleComponentInterface();

                            	    state._fsp--;


                            	    								if (current==null) {
                            	    									current = createModelElementForParent(grammarAccess.getRosSystemRule());
                            	    								}
                            	    								add(
                            	    									current,
                            	    									"RosComponent",
                            	    									lv_RosComponent_9_0,
                            	    									"de.fraunhofer.ipa.rossystem.RosSystem.ComponentInterface");
                            	    								afterParserOrEnumRuleCall();
                            	    							

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop1;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_10=(Token)match(input,28,FOLLOW_11); 

                    				newLeafNode(otherlv_10, grammarAccess.getRosSystemAccess().getRightParenthesisKeyword_5_3());
                    			

                    }
                    break;

            }

            // InternalRosSystem.g:177:3: (otherlv_11= 'RosComponentStacks' otherlv_12= '(' ( ( (lv_ComponentStack_13_0= ruleComponentStack ) ) (otherlv_14= ',' ( (lv_ComponentStack_15_0= ruleComponentStack ) ) )* )? otherlv_16= ')' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==29) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalRosSystem.g:178:4: otherlv_11= 'RosComponentStacks' otherlv_12= '(' ( ( (lv_ComponentStack_13_0= ruleComponentStack ) ) (otherlv_14= ',' ( (lv_ComponentStack_15_0= ruleComponentStack ) ) )* )? otherlv_16= ')'
                    {
                    otherlv_11=(Token)match(input,29,FOLLOW_7); 

                    				newLeafNode(otherlv_11, grammarAccess.getRosSystemAccess().getRosComponentStacksKeyword_6_0());
                    			
                    otherlv_12=(Token)match(input,26,FOLLOW_12); 

                    				newLeafNode(otherlv_12, grammarAccess.getRosSystemAccess().getLeftParenthesisKeyword_6_1());
                    			
                    // InternalRosSystem.g:186:4: ( ( (lv_ComponentStack_13_0= ruleComponentStack ) ) (otherlv_14= ',' ( (lv_ComponentStack_15_0= ruleComponentStack ) ) )* )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==40) ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // InternalRosSystem.g:187:5: ( (lv_ComponentStack_13_0= ruleComponentStack ) ) (otherlv_14= ',' ( (lv_ComponentStack_15_0= ruleComponentStack ) ) )*
                            {
                            // InternalRosSystem.g:187:5: ( (lv_ComponentStack_13_0= ruleComponentStack ) )
                            // InternalRosSystem.g:188:6: (lv_ComponentStack_13_0= ruleComponentStack )
                            {
                            // InternalRosSystem.g:188:6: (lv_ComponentStack_13_0= ruleComponentStack )
                            // InternalRosSystem.g:189:7: lv_ComponentStack_13_0= ruleComponentStack
                            {

                            							newCompositeNode(grammarAccess.getRosSystemAccess().getComponentStackComponentStackParserRuleCall_6_2_0_0());
                            						
                            pushFollow(FOLLOW_9);
                            lv_ComponentStack_13_0=ruleComponentStack();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getRosSystemRule());
                            							}
                            							add(
                            								current,
                            								"ComponentStack",
                            								lv_ComponentStack_13_0,
                            								"de.fraunhofer.ipa.rossystem.RosSystem.ComponentStack");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }

                            // InternalRosSystem.g:206:5: (otherlv_14= ',' ( (lv_ComponentStack_15_0= ruleComponentStack ) ) )*
                            loop4:
                            do {
                                int alt4=2;
                                int LA4_0 = input.LA(1);

                                if ( (LA4_0==27) ) {
                                    alt4=1;
                                }


                                switch (alt4) {
                            	case 1 :
                            	    // InternalRosSystem.g:207:6: otherlv_14= ',' ( (lv_ComponentStack_15_0= ruleComponentStack ) )
                            	    {
                            	    otherlv_14=(Token)match(input,27,FOLLOW_13); 

                            	    						newLeafNode(otherlv_14, grammarAccess.getRosSystemAccess().getCommaKeyword_6_2_1_0());
                            	    					
                            	    // InternalRosSystem.g:211:6: ( (lv_ComponentStack_15_0= ruleComponentStack ) )
                            	    // InternalRosSystem.g:212:7: (lv_ComponentStack_15_0= ruleComponentStack )
                            	    {
                            	    // InternalRosSystem.g:212:7: (lv_ComponentStack_15_0= ruleComponentStack )
                            	    // InternalRosSystem.g:213:8: lv_ComponentStack_15_0= ruleComponentStack
                            	    {

                            	    								newCompositeNode(grammarAccess.getRosSystemAccess().getComponentStackComponentStackParserRuleCall_6_2_1_1_0());
                            	    							
                            	    pushFollow(FOLLOW_9);
                            	    lv_ComponentStack_15_0=ruleComponentStack();

                            	    state._fsp--;


                            	    								if (current==null) {
                            	    									current = createModelElementForParent(grammarAccess.getRosSystemRule());
                            	    								}
                            	    								add(
                            	    									current,
                            	    									"ComponentStack",
                            	    									lv_ComponentStack_15_0,
                            	    									"de.fraunhofer.ipa.rossystem.RosSystem.ComponentStack");
                            	    								afterParserOrEnumRuleCall();
                            	    							

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop4;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_16=(Token)match(input,28,FOLLOW_14); 

                    				newLeafNode(otherlv_16, grammarAccess.getRosSystemAccess().getRightParenthesisKeyword_6_3());
                    			

                    }
                    break;

            }

            // InternalRosSystem.g:237:3: (otherlv_17= 'TopicConnections' otherlv_18= '{' ( ( (lv_TopicConnections_19_0= ruleTopicConnection ) ) (otherlv_20= ',' ( (lv_TopicConnections_21_0= ruleTopicConnection ) ) )* )? otherlv_22= '}' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==30) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalRosSystem.g:238:4: otherlv_17= 'TopicConnections' otherlv_18= '{' ( ( (lv_TopicConnections_19_0= ruleTopicConnection ) ) (otherlv_20= ',' ( (lv_TopicConnections_21_0= ruleTopicConnection ) ) )* )? otherlv_22= '}'
                    {
                    otherlv_17=(Token)match(input,30,FOLLOW_3); 

                    				newLeafNode(otherlv_17, grammarAccess.getRosSystemAccess().getTopicConnectionsKeyword_7_0());
                    			
                    otherlv_18=(Token)match(input,23,FOLLOW_15); 

                    				newLeafNode(otherlv_18, grammarAccess.getRosSystemAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalRosSystem.g:246:4: ( ( (lv_TopicConnections_19_0= ruleTopicConnection ) ) (otherlv_20= ',' ( (lv_TopicConnections_21_0= ruleTopicConnection ) ) )* )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==35) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // InternalRosSystem.g:247:5: ( (lv_TopicConnections_19_0= ruleTopicConnection ) ) (otherlv_20= ',' ( (lv_TopicConnections_21_0= ruleTopicConnection ) ) )*
                            {
                            // InternalRosSystem.g:247:5: ( (lv_TopicConnections_19_0= ruleTopicConnection ) )
                            // InternalRosSystem.g:248:6: (lv_TopicConnections_19_0= ruleTopicConnection )
                            {
                            // InternalRosSystem.g:248:6: (lv_TopicConnections_19_0= ruleTopicConnection )
                            // InternalRosSystem.g:249:7: lv_TopicConnections_19_0= ruleTopicConnection
                            {

                            							newCompositeNode(grammarAccess.getRosSystemAccess().getTopicConnectionsTopicConnectionParserRuleCall_7_2_0_0());
                            						
                            pushFollow(FOLLOW_16);
                            lv_TopicConnections_19_0=ruleTopicConnection();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getRosSystemRule());
                            							}
                            							add(
                            								current,
                            								"TopicConnections",
                            								lv_TopicConnections_19_0,
                            								"de.fraunhofer.ipa.rossystem.RosSystem.TopicConnection");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }

                            // InternalRosSystem.g:266:5: (otherlv_20= ',' ( (lv_TopicConnections_21_0= ruleTopicConnection ) ) )*
                            loop7:
                            do {
                                int alt7=2;
                                int LA7_0 = input.LA(1);

                                if ( (LA7_0==27) ) {
                                    alt7=1;
                                }


                                switch (alt7) {
                            	case 1 :
                            	    // InternalRosSystem.g:267:6: otherlv_20= ',' ( (lv_TopicConnections_21_0= ruleTopicConnection ) )
                            	    {
                            	    otherlv_20=(Token)match(input,27,FOLLOW_17); 

                            	    						newLeafNode(otherlv_20, grammarAccess.getRosSystemAccess().getCommaKeyword_7_2_1_0());
                            	    					
                            	    // InternalRosSystem.g:271:6: ( (lv_TopicConnections_21_0= ruleTopicConnection ) )
                            	    // InternalRosSystem.g:272:7: (lv_TopicConnections_21_0= ruleTopicConnection )
                            	    {
                            	    // InternalRosSystem.g:272:7: (lv_TopicConnections_21_0= ruleTopicConnection )
                            	    // InternalRosSystem.g:273:8: lv_TopicConnections_21_0= ruleTopicConnection
                            	    {

                            	    								newCompositeNode(grammarAccess.getRosSystemAccess().getTopicConnectionsTopicConnectionParserRuleCall_7_2_1_1_0());
                            	    							
                            	    pushFollow(FOLLOW_16);
                            	    lv_TopicConnections_21_0=ruleTopicConnection();

                            	    state._fsp--;


                            	    								if (current==null) {
                            	    									current = createModelElementForParent(grammarAccess.getRosSystemRule());
                            	    								}
                            	    								add(
                            	    									current,
                            	    									"TopicConnections",
                            	    									lv_TopicConnections_21_0,
                            	    									"de.fraunhofer.ipa.rossystem.RosSystem.TopicConnection");
                            	    								afterParserOrEnumRuleCall();
                            	    							

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop7;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_22=(Token)match(input,31,FOLLOW_18); 

                    				newLeafNode(otherlv_22, grammarAccess.getRosSystemAccess().getRightCurlyBracketKeyword_7_3());
                    			

                    }
                    break;

            }

            // InternalRosSystem.g:297:3: (otherlv_23= 'ServiceConnections' otherlv_24= '{' ( ( (lv_ServiceConnections_25_0= ruleServiceConnection ) ) (otherlv_26= ',' ( (lv_ServiceConnections_27_0= ruleServiceConnection ) ) )* )? otherlv_28= '}' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==32) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalRosSystem.g:298:4: otherlv_23= 'ServiceConnections' otherlv_24= '{' ( ( (lv_ServiceConnections_25_0= ruleServiceConnection ) ) (otherlv_26= ',' ( (lv_ServiceConnections_27_0= ruleServiceConnection ) ) )* )? otherlv_28= '}'
                    {
                    otherlv_23=(Token)match(input,32,FOLLOW_3); 

                    				newLeafNode(otherlv_23, grammarAccess.getRosSystemAccess().getServiceConnectionsKeyword_8_0());
                    			
                    otherlv_24=(Token)match(input,23,FOLLOW_19); 

                    				newLeafNode(otherlv_24, grammarAccess.getRosSystemAccess().getLeftCurlyBracketKeyword_8_1());
                    			
                    // InternalRosSystem.g:306:4: ( ( (lv_ServiceConnections_25_0= ruleServiceConnection ) ) (otherlv_26= ',' ( (lv_ServiceConnections_27_0= ruleServiceConnection ) ) )* )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==38) ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // InternalRosSystem.g:307:5: ( (lv_ServiceConnections_25_0= ruleServiceConnection ) ) (otherlv_26= ',' ( (lv_ServiceConnections_27_0= ruleServiceConnection ) ) )*
                            {
                            // InternalRosSystem.g:307:5: ( (lv_ServiceConnections_25_0= ruleServiceConnection ) )
                            // InternalRosSystem.g:308:6: (lv_ServiceConnections_25_0= ruleServiceConnection )
                            {
                            // InternalRosSystem.g:308:6: (lv_ServiceConnections_25_0= ruleServiceConnection )
                            // InternalRosSystem.g:309:7: lv_ServiceConnections_25_0= ruleServiceConnection
                            {

                            							newCompositeNode(grammarAccess.getRosSystemAccess().getServiceConnectionsServiceConnectionParserRuleCall_8_2_0_0());
                            						
                            pushFollow(FOLLOW_16);
                            lv_ServiceConnections_25_0=ruleServiceConnection();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getRosSystemRule());
                            							}
                            							add(
                            								current,
                            								"ServiceConnections",
                            								lv_ServiceConnections_25_0,
                            								"de.fraunhofer.ipa.rossystem.RosSystem.ServiceConnection");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }

                            // InternalRosSystem.g:326:5: (otherlv_26= ',' ( (lv_ServiceConnections_27_0= ruleServiceConnection ) ) )*
                            loop10:
                            do {
                                int alt10=2;
                                int LA10_0 = input.LA(1);

                                if ( (LA10_0==27) ) {
                                    alt10=1;
                                }


                                switch (alt10) {
                            	case 1 :
                            	    // InternalRosSystem.g:327:6: otherlv_26= ',' ( (lv_ServiceConnections_27_0= ruleServiceConnection ) )
                            	    {
                            	    otherlv_26=(Token)match(input,27,FOLLOW_20); 

                            	    						newLeafNode(otherlv_26, grammarAccess.getRosSystemAccess().getCommaKeyword_8_2_1_0());
                            	    					
                            	    // InternalRosSystem.g:331:6: ( (lv_ServiceConnections_27_0= ruleServiceConnection ) )
                            	    // InternalRosSystem.g:332:7: (lv_ServiceConnections_27_0= ruleServiceConnection )
                            	    {
                            	    // InternalRosSystem.g:332:7: (lv_ServiceConnections_27_0= ruleServiceConnection )
                            	    // InternalRosSystem.g:333:8: lv_ServiceConnections_27_0= ruleServiceConnection
                            	    {

                            	    								newCompositeNode(grammarAccess.getRosSystemAccess().getServiceConnectionsServiceConnectionParserRuleCall_8_2_1_1_0());
                            	    							
                            	    pushFollow(FOLLOW_16);
                            	    lv_ServiceConnections_27_0=ruleServiceConnection();

                            	    state._fsp--;


                            	    								if (current==null) {
                            	    									current = createModelElementForParent(grammarAccess.getRosSystemRule());
                            	    								}
                            	    								add(
                            	    									current,
                            	    									"ServiceConnections",
                            	    									lv_ServiceConnections_27_0,
                            	    									"de.fraunhofer.ipa.rossystem.RosSystem.ServiceConnection");
                            	    								afterParserOrEnumRuleCall();
                            	    							

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop10;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_28=(Token)match(input,31,FOLLOW_21); 

                    				newLeafNode(otherlv_28, grammarAccess.getRosSystemAccess().getRightCurlyBracketKeyword_8_3());
                    			

                    }
                    break;

            }

            // InternalRosSystem.g:357:3: (otherlv_29= 'ActionConnections' otherlv_30= '{' ( ( (lv_ActionConnections_31_0= ruleActionConnection ) ) (otherlv_32= ',' ( (lv_ActionConnections_33_0= ruleActionConnection ) ) )* )? otherlv_34= '}' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==33) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalRosSystem.g:358:4: otherlv_29= 'ActionConnections' otherlv_30= '{' ( ( (lv_ActionConnections_31_0= ruleActionConnection ) ) (otherlv_32= ',' ( (lv_ActionConnections_33_0= ruleActionConnection ) ) )* )? otherlv_34= '}'
                    {
                    otherlv_29=(Token)match(input,33,FOLLOW_3); 

                    				newLeafNode(otherlv_29, grammarAccess.getRosSystemAccess().getActionConnectionsKeyword_9_0());
                    			
                    otherlv_30=(Token)match(input,23,FOLLOW_22); 

                    				newLeafNode(otherlv_30, grammarAccess.getRosSystemAccess().getLeftCurlyBracketKeyword_9_1());
                    			
                    // InternalRosSystem.g:366:4: ( ( (lv_ActionConnections_31_0= ruleActionConnection ) ) (otherlv_32= ',' ( (lv_ActionConnections_33_0= ruleActionConnection ) ) )* )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==39) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // InternalRosSystem.g:367:5: ( (lv_ActionConnections_31_0= ruleActionConnection ) ) (otherlv_32= ',' ( (lv_ActionConnections_33_0= ruleActionConnection ) ) )*
                            {
                            // InternalRosSystem.g:367:5: ( (lv_ActionConnections_31_0= ruleActionConnection ) )
                            // InternalRosSystem.g:368:6: (lv_ActionConnections_31_0= ruleActionConnection )
                            {
                            // InternalRosSystem.g:368:6: (lv_ActionConnections_31_0= ruleActionConnection )
                            // InternalRosSystem.g:369:7: lv_ActionConnections_31_0= ruleActionConnection
                            {

                            							newCompositeNode(grammarAccess.getRosSystemAccess().getActionConnectionsActionConnectionParserRuleCall_9_2_0_0());
                            						
                            pushFollow(FOLLOW_16);
                            lv_ActionConnections_31_0=ruleActionConnection();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getRosSystemRule());
                            							}
                            							add(
                            								current,
                            								"ActionConnections",
                            								lv_ActionConnections_31_0,
                            								"de.fraunhofer.ipa.rossystem.RosSystem.ActionConnection");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }

                            // InternalRosSystem.g:386:5: (otherlv_32= ',' ( (lv_ActionConnections_33_0= ruleActionConnection ) ) )*
                            loop13:
                            do {
                                int alt13=2;
                                int LA13_0 = input.LA(1);

                                if ( (LA13_0==27) ) {
                                    alt13=1;
                                }


                                switch (alt13) {
                            	case 1 :
                            	    // InternalRosSystem.g:387:6: otherlv_32= ',' ( (lv_ActionConnections_33_0= ruleActionConnection ) )
                            	    {
                            	    otherlv_32=(Token)match(input,27,FOLLOW_23); 

                            	    						newLeafNode(otherlv_32, grammarAccess.getRosSystemAccess().getCommaKeyword_9_2_1_0());
                            	    					
                            	    // InternalRosSystem.g:391:6: ( (lv_ActionConnections_33_0= ruleActionConnection ) )
                            	    // InternalRosSystem.g:392:7: (lv_ActionConnections_33_0= ruleActionConnection )
                            	    {
                            	    // InternalRosSystem.g:392:7: (lv_ActionConnections_33_0= ruleActionConnection )
                            	    // InternalRosSystem.g:393:8: lv_ActionConnections_33_0= ruleActionConnection
                            	    {

                            	    								newCompositeNode(grammarAccess.getRosSystemAccess().getActionConnectionsActionConnectionParserRuleCall_9_2_1_1_0());
                            	    							
                            	    pushFollow(FOLLOW_16);
                            	    lv_ActionConnections_33_0=ruleActionConnection();

                            	    state._fsp--;


                            	    								if (current==null) {
                            	    									current = createModelElementForParent(grammarAccess.getRosSystemRule());
                            	    								}
                            	    								add(
                            	    									current,
                            	    									"ActionConnections",
                            	    									lv_ActionConnections_33_0,
                            	    									"de.fraunhofer.ipa.rossystem.RosSystem.ActionConnection");
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
                            break;

                    }

                    otherlv_34=(Token)match(input,31,FOLLOW_24); 

                    				newLeafNode(otherlv_34, grammarAccess.getRosSystemAccess().getRightCurlyBracketKeyword_9_3());
                    			

                    }
                    break;

            }

            // InternalRosSystem.g:417:3: (otherlv_35= 'Parameters' otherlv_36= '{' ( ( (lv_Parameter_37_0= ruleParameter ) ) (otherlv_38= ',' ( (lv_Parameter_39_0= ruleParameter ) ) )* )? otherlv_40= '}' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==34) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalRosSystem.g:418:4: otherlv_35= 'Parameters' otherlv_36= '{' ( ( (lv_Parameter_37_0= ruleParameter ) ) (otherlv_38= ',' ( (lv_Parameter_39_0= ruleParameter ) ) )* )? otherlv_40= '}'
                    {
                    otherlv_35=(Token)match(input,34,FOLLOW_3); 

                    				newLeafNode(otherlv_35, grammarAccess.getRosSystemAccess().getParametersKeyword_10_0());
                    			
                    otherlv_36=(Token)match(input,23,FOLLOW_25); 

                    				newLeafNode(otherlv_36, grammarAccess.getRosSystemAccess().getLeftCurlyBracketKeyword_10_1());
                    			
                    // InternalRosSystem.g:426:4: ( ( (lv_Parameter_37_0= ruleParameter ) ) (otherlv_38= ',' ( (lv_Parameter_39_0= ruleParameter ) ) )* )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==68) ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // InternalRosSystem.g:427:5: ( (lv_Parameter_37_0= ruleParameter ) ) (otherlv_38= ',' ( (lv_Parameter_39_0= ruleParameter ) ) )*
                            {
                            // InternalRosSystem.g:427:5: ( (lv_Parameter_37_0= ruleParameter ) )
                            // InternalRosSystem.g:428:6: (lv_Parameter_37_0= ruleParameter )
                            {
                            // InternalRosSystem.g:428:6: (lv_Parameter_37_0= ruleParameter )
                            // InternalRosSystem.g:429:7: lv_Parameter_37_0= ruleParameter
                            {

                            							newCompositeNode(grammarAccess.getRosSystemAccess().getParameterParameterParserRuleCall_10_2_0_0());
                            						
                            pushFollow(FOLLOW_16);
                            lv_Parameter_37_0=ruleParameter();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getRosSystemRule());
                            							}
                            							add(
                            								current,
                            								"Parameter",
                            								lv_Parameter_37_0,
                            								"de.fraunhofer.ipa.rossystem.RosSystem.Parameter");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }

                            // InternalRosSystem.g:446:5: (otherlv_38= ',' ( (lv_Parameter_39_0= ruleParameter ) ) )*
                            loop16:
                            do {
                                int alt16=2;
                                int LA16_0 = input.LA(1);

                                if ( (LA16_0==27) ) {
                                    alt16=1;
                                }


                                switch (alt16) {
                            	case 1 :
                            	    // InternalRosSystem.g:447:6: otherlv_38= ',' ( (lv_Parameter_39_0= ruleParameter ) )
                            	    {
                            	    otherlv_38=(Token)match(input,27,FOLLOW_26); 

                            	    						newLeafNode(otherlv_38, grammarAccess.getRosSystemAccess().getCommaKeyword_10_2_1_0());
                            	    					
                            	    // InternalRosSystem.g:451:6: ( (lv_Parameter_39_0= ruleParameter ) )
                            	    // InternalRosSystem.g:452:7: (lv_Parameter_39_0= ruleParameter )
                            	    {
                            	    // InternalRosSystem.g:452:7: (lv_Parameter_39_0= ruleParameter )
                            	    // InternalRosSystem.g:453:8: lv_Parameter_39_0= ruleParameter
                            	    {

                            	    								newCompositeNode(grammarAccess.getRosSystemAccess().getParameterParameterParserRuleCall_10_2_1_1_0());
                            	    							
                            	    pushFollow(FOLLOW_16);
                            	    lv_Parameter_39_0=ruleParameter();

                            	    state._fsp--;


                            	    								if (current==null) {
                            	    									current = createModelElementForParent(grammarAccess.getRosSystemRule());
                            	    								}
                            	    								add(
                            	    									current,
                            	    									"Parameter",
                            	    									lv_Parameter_39_0,
                            	    									"de.fraunhofer.ipa.rossystem.RosSystem.Parameter");
                            	    								afterParserOrEnumRuleCall();
                            	    							

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop16;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_40=(Token)match(input,31,FOLLOW_27); 

                    				newLeafNode(otherlv_40, grammarAccess.getRosSystemAccess().getRightCurlyBracketKeyword_10_3());
                    			

                    }
                    break;

            }

            otherlv_41=(Token)match(input,31,FOLLOW_2); 

            			newLeafNode(otherlv_41, grammarAccess.getRosSystemAccess().getRightCurlyBracketKeyword_11());
            		

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
    // $ANTLR end "ruleRosSystem"


    // $ANTLR start "entryRuleTopicConnection"
    // InternalRosSystem.g:485:1: entryRuleTopicConnection returns [EObject current=null] : iv_ruleTopicConnection= ruleTopicConnection EOF ;
    public final EObject entryRuleTopicConnection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTopicConnection = null;


        try {
            // InternalRosSystem.g:485:56: (iv_ruleTopicConnection= ruleTopicConnection EOF )
            // InternalRosSystem.g:486:2: iv_ruleTopicConnection= ruleTopicConnection EOF
            {
             newCompositeNode(grammarAccess.getTopicConnectionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTopicConnection=ruleTopicConnection();

            state._fsp--;

             current =iv_ruleTopicConnection; 
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
    // $ANTLR end "entryRuleTopicConnection"


    // $ANTLR start "ruleTopicConnection"
    // InternalRosSystem.g:492:1: ruleTopicConnection returns [EObject current=null] : (otherlv_0= 'TopicConnection' ( (lv_TopicName_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'From' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' otherlv_9= 'To' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' otherlv_15= '}' ) ;
    public final EObject ruleTopicConnection() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        AntlrDatatypeRuleToken lv_TopicName_1_0 = null;



        	enterRule();

        try {
            // InternalRosSystem.g:498:2: ( (otherlv_0= 'TopicConnection' ( (lv_TopicName_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'From' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' otherlv_9= 'To' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' otherlv_15= '}' ) )
            // InternalRosSystem.g:499:2: (otherlv_0= 'TopicConnection' ( (lv_TopicName_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'From' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' otherlv_9= 'To' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' otherlv_15= '}' )
            {
            // InternalRosSystem.g:499:2: (otherlv_0= 'TopicConnection' ( (lv_TopicName_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'From' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' otherlv_9= 'To' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' otherlv_15= '}' )
            // InternalRosSystem.g:500:3: otherlv_0= 'TopicConnection' ( (lv_TopicName_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'From' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' otherlv_9= 'To' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' otherlv_15= '}'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getTopicConnectionAccess().getTopicConnectionKeyword_0());
            		
            // InternalRosSystem.g:504:3: ( (lv_TopicName_1_0= ruleEString ) )
            // InternalRosSystem.g:505:4: (lv_TopicName_1_0= ruleEString )
            {
            // InternalRosSystem.g:505:4: (lv_TopicName_1_0= ruleEString )
            // InternalRosSystem.g:506:5: lv_TopicName_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getTopicConnectionAccess().getTopicNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_TopicName_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTopicConnectionRule());
            					}
            					set(
            						current,
            						"TopicName",
            						lv_TopicName_1_0,
            						"de.fraunhofer.ipa.rossystem.RosSystem.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,23,FOLLOW_28); 

            			newLeafNode(otherlv_2, grammarAccess.getTopicConnectionAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,36,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getTopicConnectionAccess().getFromKeyword_3());
            		
            otherlv_4=(Token)match(input,26,FOLLOW_5); 

            			newLeafNode(otherlv_4, grammarAccess.getTopicConnectionAccess().getLeftParenthesisKeyword_4());
            		
            // InternalRosSystem.g:535:3: ( ( ruleEString ) )
            // InternalRosSystem.g:536:4: ( ruleEString )
            {
            // InternalRosSystem.g:536:4: ( ruleEString )
            // InternalRosSystem.g:537:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTopicConnectionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getTopicConnectionAccess().getFromRosPublisherCrossReference_5_0());
            				
            pushFollow(FOLLOW_9);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRosSystem.g:551:3: (otherlv_6= ',' ( ( ruleEString ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==27) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalRosSystem.g:552:4: otherlv_6= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_6=(Token)match(input,27,FOLLOW_5); 

            	    				newLeafNode(otherlv_6, grammarAccess.getTopicConnectionAccess().getCommaKeyword_6_0());
            	    			
            	    // InternalRosSystem.g:556:4: ( ( ruleEString ) )
            	    // InternalRosSystem.g:557:5: ( ruleEString )
            	    {
            	    // InternalRosSystem.g:557:5: ( ruleEString )
            	    // InternalRosSystem.g:558:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getTopicConnectionRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getTopicConnectionAccess().getFromRosPublisherCrossReference_6_1_0());
            	    					
            	    pushFollow(FOLLOW_9);
            	    ruleEString();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            otherlv_8=(Token)match(input,28,FOLLOW_29); 

            			newLeafNode(otherlv_8, grammarAccess.getTopicConnectionAccess().getRightParenthesisKeyword_7());
            		
            otherlv_9=(Token)match(input,37,FOLLOW_7); 

            			newLeafNode(otherlv_9, grammarAccess.getTopicConnectionAccess().getToKeyword_8());
            		
            otherlv_10=(Token)match(input,26,FOLLOW_5); 

            			newLeafNode(otherlv_10, grammarAccess.getTopicConnectionAccess().getLeftParenthesisKeyword_9());
            		
            // InternalRosSystem.g:585:3: ( ( ruleEString ) )
            // InternalRosSystem.g:586:4: ( ruleEString )
            {
            // InternalRosSystem.g:586:4: ( ruleEString )
            // InternalRosSystem.g:587:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTopicConnectionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getTopicConnectionAccess().getToRosSubscriberCrossReference_10_0());
            				
            pushFollow(FOLLOW_9);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRosSystem.g:601:3: (otherlv_12= ',' ( ( ruleEString ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==27) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalRosSystem.g:602:4: otherlv_12= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_12=(Token)match(input,27,FOLLOW_5); 

            	    				newLeafNode(otherlv_12, grammarAccess.getTopicConnectionAccess().getCommaKeyword_11_0());
            	    			
            	    // InternalRosSystem.g:606:4: ( ( ruleEString ) )
            	    // InternalRosSystem.g:607:5: ( ruleEString )
            	    {
            	    // InternalRosSystem.g:607:5: ( ruleEString )
            	    // InternalRosSystem.g:608:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getTopicConnectionRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getTopicConnectionAccess().getToRosSubscriberCrossReference_11_1_0());
            	    					
            	    pushFollow(FOLLOW_9);
            	    ruleEString();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            otherlv_14=(Token)match(input,28,FOLLOW_27); 

            			newLeafNode(otherlv_14, grammarAccess.getTopicConnectionAccess().getRightParenthesisKeyword_12());
            		
            otherlv_15=(Token)match(input,31,FOLLOW_2); 

            			newLeafNode(otherlv_15, grammarAccess.getTopicConnectionAccess().getRightCurlyBracketKeyword_13());
            		

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
    // $ANTLR end "ruleTopicConnection"


    // $ANTLR start "entryRuleServiceConnection"
    // InternalRosSystem.g:635:1: entryRuleServiceConnection returns [EObject current=null] : iv_ruleServiceConnection= ruleServiceConnection EOF ;
    public final EObject entryRuleServiceConnection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServiceConnection = null;


        try {
            // InternalRosSystem.g:635:58: (iv_ruleServiceConnection= ruleServiceConnection EOF )
            // InternalRosSystem.g:636:2: iv_ruleServiceConnection= ruleServiceConnection EOF
            {
             newCompositeNode(grammarAccess.getServiceConnectionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleServiceConnection=ruleServiceConnection();

            state._fsp--;

             current =iv_ruleServiceConnection; 
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
    // $ANTLR end "entryRuleServiceConnection"


    // $ANTLR start "ruleServiceConnection"
    // InternalRosSystem.g:642:1: ruleServiceConnection returns [EObject current=null] : (otherlv_0= 'ServiceConnection' ( (lv_ServiceName_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'From' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' otherlv_9= 'To' ( ( ruleEString ) ) otherlv_11= '}' ) ;
    public final EObject ruleServiceConnection() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_ServiceName_1_0 = null;



        	enterRule();

        try {
            // InternalRosSystem.g:648:2: ( (otherlv_0= 'ServiceConnection' ( (lv_ServiceName_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'From' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' otherlv_9= 'To' ( ( ruleEString ) ) otherlv_11= '}' ) )
            // InternalRosSystem.g:649:2: (otherlv_0= 'ServiceConnection' ( (lv_ServiceName_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'From' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' otherlv_9= 'To' ( ( ruleEString ) ) otherlv_11= '}' )
            {
            // InternalRosSystem.g:649:2: (otherlv_0= 'ServiceConnection' ( (lv_ServiceName_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'From' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' otherlv_9= 'To' ( ( ruleEString ) ) otherlv_11= '}' )
            // InternalRosSystem.g:650:3: otherlv_0= 'ServiceConnection' ( (lv_ServiceName_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'From' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' otherlv_9= 'To' ( ( ruleEString ) ) otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,38,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getServiceConnectionAccess().getServiceConnectionKeyword_0());
            		
            // InternalRosSystem.g:654:3: ( (lv_ServiceName_1_0= ruleEString ) )
            // InternalRosSystem.g:655:4: (lv_ServiceName_1_0= ruleEString )
            {
            // InternalRosSystem.g:655:4: (lv_ServiceName_1_0= ruleEString )
            // InternalRosSystem.g:656:5: lv_ServiceName_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getServiceConnectionAccess().getServiceNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_ServiceName_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getServiceConnectionRule());
            					}
            					set(
            						current,
            						"ServiceName",
            						lv_ServiceName_1_0,
            						"de.fraunhofer.ipa.rossystem.RosSystem.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,23,FOLLOW_28); 

            			newLeafNode(otherlv_2, grammarAccess.getServiceConnectionAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,36,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getServiceConnectionAccess().getFromKeyword_3());
            		
            otherlv_4=(Token)match(input,26,FOLLOW_5); 

            			newLeafNode(otherlv_4, grammarAccess.getServiceConnectionAccess().getLeftParenthesisKeyword_4());
            		
            // InternalRosSystem.g:685:3: ( ( ruleEString ) )
            // InternalRosSystem.g:686:4: ( ruleEString )
            {
            // InternalRosSystem.g:686:4: ( ruleEString )
            // InternalRosSystem.g:687:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getServiceConnectionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getServiceConnectionAccess().getFromRosServiceServerCrossReference_5_0());
            				
            pushFollow(FOLLOW_9);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRosSystem.g:701:3: (otherlv_6= ',' ( ( ruleEString ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==27) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalRosSystem.g:702:4: otherlv_6= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_6=(Token)match(input,27,FOLLOW_5); 

            	    				newLeafNode(otherlv_6, grammarAccess.getServiceConnectionAccess().getCommaKeyword_6_0());
            	    			
            	    // InternalRosSystem.g:706:4: ( ( ruleEString ) )
            	    // InternalRosSystem.g:707:5: ( ruleEString )
            	    {
            	    // InternalRosSystem.g:707:5: ( ruleEString )
            	    // InternalRosSystem.g:708:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getServiceConnectionRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getServiceConnectionAccess().getFromRosServiceServerCrossReference_6_1_0());
            	    					
            	    pushFollow(FOLLOW_9);
            	    ruleEString();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            otherlv_8=(Token)match(input,28,FOLLOW_29); 

            			newLeafNode(otherlv_8, grammarAccess.getServiceConnectionAccess().getRightParenthesisKeyword_7());
            		
            otherlv_9=(Token)match(input,37,FOLLOW_5); 

            			newLeafNode(otherlv_9, grammarAccess.getServiceConnectionAccess().getToKeyword_8());
            		
            // InternalRosSystem.g:731:3: ( ( ruleEString ) )
            // InternalRosSystem.g:732:4: ( ruleEString )
            {
            // InternalRosSystem.g:732:4: ( ruleEString )
            // InternalRosSystem.g:733:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getServiceConnectionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getServiceConnectionAccess().getToRosServiceClientCrossReference_9_0());
            				
            pushFollow(FOLLOW_27);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_11=(Token)match(input,31,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getServiceConnectionAccess().getRightCurlyBracketKeyword_10());
            		

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
    // $ANTLR end "ruleServiceConnection"


    // $ANTLR start "entryRuleActionConnection"
    // InternalRosSystem.g:755:1: entryRuleActionConnection returns [EObject current=null] : iv_ruleActionConnection= ruleActionConnection EOF ;
    public final EObject entryRuleActionConnection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActionConnection = null;


        try {
            // InternalRosSystem.g:755:57: (iv_ruleActionConnection= ruleActionConnection EOF )
            // InternalRosSystem.g:756:2: iv_ruleActionConnection= ruleActionConnection EOF
            {
             newCompositeNode(grammarAccess.getActionConnectionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleActionConnection=ruleActionConnection();

            state._fsp--;

             current =iv_ruleActionConnection; 
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
    // $ANTLR end "entryRuleActionConnection"


    // $ANTLR start "ruleActionConnection"
    // InternalRosSystem.g:762:1: ruleActionConnection returns [EObject current=null] : (otherlv_0= 'ActionConnection' ( (lv_ActionName_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'From' ( ( ruleEString ) ) otherlv_5= 'To' ( ( ruleEString ) ) otherlv_7= '}' ) ;
    public final EObject ruleActionConnection() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_ActionName_1_0 = null;



        	enterRule();

        try {
            // InternalRosSystem.g:768:2: ( (otherlv_0= 'ActionConnection' ( (lv_ActionName_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'From' ( ( ruleEString ) ) otherlv_5= 'To' ( ( ruleEString ) ) otherlv_7= '}' ) )
            // InternalRosSystem.g:769:2: (otherlv_0= 'ActionConnection' ( (lv_ActionName_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'From' ( ( ruleEString ) ) otherlv_5= 'To' ( ( ruleEString ) ) otherlv_7= '}' )
            {
            // InternalRosSystem.g:769:2: (otherlv_0= 'ActionConnection' ( (lv_ActionName_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'From' ( ( ruleEString ) ) otherlv_5= 'To' ( ( ruleEString ) ) otherlv_7= '}' )
            // InternalRosSystem.g:770:3: otherlv_0= 'ActionConnection' ( (lv_ActionName_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'From' ( ( ruleEString ) ) otherlv_5= 'To' ( ( ruleEString ) ) otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,39,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getActionConnectionAccess().getActionConnectionKeyword_0());
            		
            // InternalRosSystem.g:774:3: ( (lv_ActionName_1_0= ruleEString ) )
            // InternalRosSystem.g:775:4: (lv_ActionName_1_0= ruleEString )
            {
            // InternalRosSystem.g:775:4: (lv_ActionName_1_0= ruleEString )
            // InternalRosSystem.g:776:5: lv_ActionName_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getActionConnectionAccess().getActionNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_ActionName_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getActionConnectionRule());
            					}
            					set(
            						current,
            						"ActionName",
            						lv_ActionName_1_0,
            						"de.fraunhofer.ipa.rossystem.RosSystem.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,23,FOLLOW_28); 

            			newLeafNode(otherlv_2, grammarAccess.getActionConnectionAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,36,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getActionConnectionAccess().getFromKeyword_3());
            		
            // InternalRosSystem.g:801:3: ( ( ruleEString ) )
            // InternalRosSystem.g:802:4: ( ruleEString )
            {
            // InternalRosSystem.g:802:4: ( ruleEString )
            // InternalRosSystem.g:803:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getActionConnectionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getActionConnectionAccess().getFromRosActionServerCrossReference_4_0());
            				
            pushFollow(FOLLOW_29);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,37,FOLLOW_5); 

            			newLeafNode(otherlv_5, grammarAccess.getActionConnectionAccess().getToKeyword_5());
            		
            // InternalRosSystem.g:821:3: ( ( ruleEString ) )
            // InternalRosSystem.g:822:4: ( ruleEString )
            {
            // InternalRosSystem.g:822:4: ( ruleEString )
            // InternalRosSystem.g:823:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getActionConnectionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getActionConnectionAccess().getToRosActionClientCrossReference_6_0());
            				
            pushFollow(FOLLOW_27);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,31,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getActionConnectionAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleActionConnection"


    // $ANTLR start "entryRuleEString"
    // InternalRosSystem.g:845:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalRosSystem.g:845:47: (iv_ruleEString= ruleEString EOF )
            // InternalRosSystem.g:846:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalRosSystem.g:852:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalRosSystem.g:858:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalRosSystem.g:859:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalRosSystem.g:859:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_STRING) ) {
                alt22=1;
            }
            else if ( (LA22_0==RULE_ID) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // InternalRosSystem.g:860:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalRosSystem.g:868:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

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
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleComponentStack"
    // InternalRosSystem.g:879:1: entryRuleComponentStack returns [EObject current=null] : iv_ruleComponentStack= ruleComponentStack EOF ;
    public final EObject entryRuleComponentStack() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentStack = null;


        try {
            // InternalRosSystem.g:879:55: (iv_ruleComponentStack= ruleComponentStack EOF )
            // InternalRosSystem.g:880:2: iv_ruleComponentStack= ruleComponentStack EOF
            {
             newCompositeNode(grammarAccess.getComponentStackRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComponentStack=ruleComponentStack();

            state._fsp--;

             current =iv_ruleComponentStack; 
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
    // $ANTLR end "entryRuleComponentStack"


    // $ANTLR start "ruleComponentStack"
    // InternalRosSystem.g:886:1: ruleComponentStack returns [EObject current=null] : (otherlv_0= 'ComponentStack' otherlv_1= '{' otherlv_2= 'name' ( (lv_Name_3_0= ruleEString ) ) (otherlv_4= 'RosComponents' otherlv_5= '(' ( ( (lv_RosComponent_6_0= ruleComponentInterface ) ) (otherlv_7= ',' ( (lv_RosComponent_8_0= ruleComponentInterface ) ) )* )? otherlv_9= ')' )? (otherlv_10= 'QualityAttributes' otherlv_11= '(' ( ( (lv_QualityAttribute_12_0= ruleQualityAttribute ) ) (otherlv_13= ',' ( (lv_QualityAttribute_14_0= ruleQualityAttribute ) ) )* )? otherlv_15= ')' )? otherlv_16= '}' ) ;
    public final EObject ruleComponentStack() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        AntlrDatatypeRuleToken lv_Name_3_0 = null;

        EObject lv_RosComponent_6_0 = null;

        EObject lv_RosComponent_8_0 = null;

        EObject lv_QualityAttribute_12_0 = null;

        EObject lv_QualityAttribute_14_0 = null;



        	enterRule();

        try {
            // InternalRosSystem.g:892:2: ( (otherlv_0= 'ComponentStack' otherlv_1= '{' otherlv_2= 'name' ( (lv_Name_3_0= ruleEString ) ) (otherlv_4= 'RosComponents' otherlv_5= '(' ( ( (lv_RosComponent_6_0= ruleComponentInterface ) ) (otherlv_7= ',' ( (lv_RosComponent_8_0= ruleComponentInterface ) ) )* )? otherlv_9= ')' )? (otherlv_10= 'QualityAttributes' otherlv_11= '(' ( ( (lv_QualityAttribute_12_0= ruleQualityAttribute ) ) (otherlv_13= ',' ( (lv_QualityAttribute_14_0= ruleQualityAttribute ) ) )* )? otherlv_15= ')' )? otherlv_16= '}' ) )
            // InternalRosSystem.g:893:2: (otherlv_0= 'ComponentStack' otherlv_1= '{' otherlv_2= 'name' ( (lv_Name_3_0= ruleEString ) ) (otherlv_4= 'RosComponents' otherlv_5= '(' ( ( (lv_RosComponent_6_0= ruleComponentInterface ) ) (otherlv_7= ',' ( (lv_RosComponent_8_0= ruleComponentInterface ) ) )* )? otherlv_9= ')' )? (otherlv_10= 'QualityAttributes' otherlv_11= '(' ( ( (lv_QualityAttribute_12_0= ruleQualityAttribute ) ) (otherlv_13= ',' ( (lv_QualityAttribute_14_0= ruleQualityAttribute ) ) )* )? otherlv_15= ')' )? otherlv_16= '}' )
            {
            // InternalRosSystem.g:893:2: (otherlv_0= 'ComponentStack' otherlv_1= '{' otherlv_2= 'name' ( (lv_Name_3_0= ruleEString ) ) (otherlv_4= 'RosComponents' otherlv_5= '(' ( ( (lv_RosComponent_6_0= ruleComponentInterface ) ) (otherlv_7= ',' ( (lv_RosComponent_8_0= ruleComponentInterface ) ) )* )? otherlv_9= ')' )? (otherlv_10= 'QualityAttributes' otherlv_11= '(' ( ( (lv_QualityAttribute_12_0= ruleQualityAttribute ) ) (otherlv_13= ',' ( (lv_QualityAttribute_14_0= ruleQualityAttribute ) ) )* )? otherlv_15= ')' )? otherlv_16= '}' )
            // InternalRosSystem.g:894:3: otherlv_0= 'ComponentStack' otherlv_1= '{' otherlv_2= 'name' ( (lv_Name_3_0= ruleEString ) ) (otherlv_4= 'RosComponents' otherlv_5= '(' ( ( (lv_RosComponent_6_0= ruleComponentInterface ) ) (otherlv_7= ',' ( (lv_RosComponent_8_0= ruleComponentInterface ) ) )* )? otherlv_9= ')' )? (otherlv_10= 'QualityAttributes' otherlv_11= '(' ( ( (lv_QualityAttribute_12_0= ruleQualityAttribute ) ) (otherlv_13= ',' ( (lv_QualityAttribute_14_0= ruleQualityAttribute ) ) )* )? otherlv_15= ')' )? otherlv_16= '}'
            {
            otherlv_0=(Token)match(input,40,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getComponentStackAccess().getComponentStackKeyword_0());
            		
            otherlv_1=(Token)match(input,23,FOLLOW_30); 

            			newLeafNode(otherlv_1, grammarAccess.getComponentStackAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,41,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getComponentStackAccess().getNameKeyword_2());
            		
            // InternalRosSystem.g:906:3: ( (lv_Name_3_0= ruleEString ) )
            // InternalRosSystem.g:907:4: (lv_Name_3_0= ruleEString )
            {
            // InternalRosSystem.g:907:4: (lv_Name_3_0= ruleEString )
            // InternalRosSystem.g:908:5: lv_Name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getComponentStackAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_31);
            lv_Name_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComponentStackRule());
            					}
            					set(
            						current,
            						"Name",
            						lv_Name_3_0,
            						"de.fraunhofer.ipa.rossystem.RosSystem.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRosSystem.g:925:3: (otherlv_4= 'RosComponents' otherlv_5= '(' ( ( (lv_RosComponent_6_0= ruleComponentInterface ) ) (otherlv_7= ',' ( (lv_RosComponent_8_0= ruleComponentInterface ) ) )* )? otherlv_9= ')' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==25) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalRosSystem.g:926:4: otherlv_4= 'RosComponents' otherlv_5= '(' ( ( (lv_RosComponent_6_0= ruleComponentInterface ) ) (otherlv_7= ',' ( (lv_RosComponent_8_0= ruleComponentInterface ) ) )* )? otherlv_9= ')'
                    {
                    otherlv_4=(Token)match(input,25,FOLLOW_7); 

                    				newLeafNode(otherlv_4, grammarAccess.getComponentStackAccess().getRosComponentsKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,26,FOLLOW_8); 

                    				newLeafNode(otherlv_5, grammarAccess.getComponentStackAccess().getLeftParenthesisKeyword_4_1());
                    			
                    // InternalRosSystem.g:934:4: ( ( (lv_RosComponent_6_0= ruleComponentInterface ) ) (otherlv_7= ',' ( (lv_RosComponent_8_0= ruleComponentInterface ) ) )* )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==46) ) {
                        alt24=1;
                    }
                    switch (alt24) {
                        case 1 :
                            // InternalRosSystem.g:935:5: ( (lv_RosComponent_6_0= ruleComponentInterface ) ) (otherlv_7= ',' ( (lv_RosComponent_8_0= ruleComponentInterface ) ) )*
                            {
                            // InternalRosSystem.g:935:5: ( (lv_RosComponent_6_0= ruleComponentInterface ) )
                            // InternalRosSystem.g:936:6: (lv_RosComponent_6_0= ruleComponentInterface )
                            {
                            // InternalRosSystem.g:936:6: (lv_RosComponent_6_0= ruleComponentInterface )
                            // InternalRosSystem.g:937:7: lv_RosComponent_6_0= ruleComponentInterface
                            {

                            							newCompositeNode(grammarAccess.getComponentStackAccess().getRosComponentComponentInterfaceParserRuleCall_4_2_0_0());
                            						
                            pushFollow(FOLLOW_9);
                            lv_RosComponent_6_0=ruleComponentInterface();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getComponentStackRule());
                            							}
                            							add(
                            								current,
                            								"RosComponent",
                            								lv_RosComponent_6_0,
                            								"de.fraunhofer.ipa.rossystem.RosSystem.ComponentInterface");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }

                            // InternalRosSystem.g:954:5: (otherlv_7= ',' ( (lv_RosComponent_8_0= ruleComponentInterface ) ) )*
                            loop23:
                            do {
                                int alt23=2;
                                int LA23_0 = input.LA(1);

                                if ( (LA23_0==27) ) {
                                    alt23=1;
                                }


                                switch (alt23) {
                            	case 1 :
                            	    // InternalRosSystem.g:955:6: otherlv_7= ',' ( (lv_RosComponent_8_0= ruleComponentInterface ) )
                            	    {
                            	    otherlv_7=(Token)match(input,27,FOLLOW_10); 

                            	    						newLeafNode(otherlv_7, grammarAccess.getComponentStackAccess().getCommaKeyword_4_2_1_0());
                            	    					
                            	    // InternalRosSystem.g:959:6: ( (lv_RosComponent_8_0= ruleComponentInterface ) )
                            	    // InternalRosSystem.g:960:7: (lv_RosComponent_8_0= ruleComponentInterface )
                            	    {
                            	    // InternalRosSystem.g:960:7: (lv_RosComponent_8_0= ruleComponentInterface )
                            	    // InternalRosSystem.g:961:8: lv_RosComponent_8_0= ruleComponentInterface
                            	    {

                            	    								newCompositeNode(grammarAccess.getComponentStackAccess().getRosComponentComponentInterfaceParserRuleCall_4_2_1_1_0());
                            	    							
                            	    pushFollow(FOLLOW_9);
                            	    lv_RosComponent_8_0=ruleComponentInterface();

                            	    state._fsp--;


                            	    								if (current==null) {
                            	    									current = createModelElementForParent(grammarAccess.getComponentStackRule());
                            	    								}
                            	    								add(
                            	    									current,
                            	    									"RosComponent",
                            	    									lv_RosComponent_8_0,
                            	    									"de.fraunhofer.ipa.rossystem.RosSystem.ComponentInterface");
                            	    								afterParserOrEnumRuleCall();
                            	    							

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop23;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_9=(Token)match(input,28,FOLLOW_32); 

                    				newLeafNode(otherlv_9, grammarAccess.getComponentStackAccess().getRightParenthesisKeyword_4_3());
                    			

                    }
                    break;

            }

            // InternalRosSystem.g:985:3: (otherlv_10= 'QualityAttributes' otherlv_11= '(' ( ( (lv_QualityAttribute_12_0= ruleQualityAttribute ) ) (otherlv_13= ',' ( (lv_QualityAttribute_14_0= ruleQualityAttribute ) ) )* )? otherlv_15= ')' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==42) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalRosSystem.g:986:4: otherlv_10= 'QualityAttributes' otherlv_11= '(' ( ( (lv_QualityAttribute_12_0= ruleQualityAttribute ) ) (otherlv_13= ',' ( (lv_QualityAttribute_14_0= ruleQualityAttribute ) ) )* )? otherlv_15= ')'
                    {
                    otherlv_10=(Token)match(input,42,FOLLOW_7); 

                    				newLeafNode(otherlv_10, grammarAccess.getComponentStackAccess().getQualityAttributesKeyword_5_0());
                    			
                    otherlv_11=(Token)match(input,26,FOLLOW_33); 

                    				newLeafNode(otherlv_11, grammarAccess.getComponentStackAccess().getLeftParenthesisKeyword_5_1());
                    			
                    // InternalRosSystem.g:994:4: ( ( (lv_QualityAttribute_12_0= ruleQualityAttribute ) ) (otherlv_13= ',' ( (lv_QualityAttribute_14_0= ruleQualityAttribute ) ) )* )?
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==43) ) {
                        alt27=1;
                    }
                    switch (alt27) {
                        case 1 :
                            // InternalRosSystem.g:995:5: ( (lv_QualityAttribute_12_0= ruleQualityAttribute ) ) (otherlv_13= ',' ( (lv_QualityAttribute_14_0= ruleQualityAttribute ) ) )*
                            {
                            // InternalRosSystem.g:995:5: ( (lv_QualityAttribute_12_0= ruleQualityAttribute ) )
                            // InternalRosSystem.g:996:6: (lv_QualityAttribute_12_0= ruleQualityAttribute )
                            {
                            // InternalRosSystem.g:996:6: (lv_QualityAttribute_12_0= ruleQualityAttribute )
                            // InternalRosSystem.g:997:7: lv_QualityAttribute_12_0= ruleQualityAttribute
                            {

                            							newCompositeNode(grammarAccess.getComponentStackAccess().getQualityAttributeQualityAttributeParserRuleCall_5_2_0_0());
                            						
                            pushFollow(FOLLOW_9);
                            lv_QualityAttribute_12_0=ruleQualityAttribute();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getComponentStackRule());
                            							}
                            							add(
                            								current,
                            								"QualityAttribute",
                            								lv_QualityAttribute_12_0,
                            								"de.fraunhofer.ipa.rossystem.RosSystem.QualityAttribute");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }

                            // InternalRosSystem.g:1014:5: (otherlv_13= ',' ( (lv_QualityAttribute_14_0= ruleQualityAttribute ) ) )*
                            loop26:
                            do {
                                int alt26=2;
                                int LA26_0 = input.LA(1);

                                if ( (LA26_0==27) ) {
                                    alt26=1;
                                }


                                switch (alt26) {
                            	case 1 :
                            	    // InternalRosSystem.g:1015:6: otherlv_13= ',' ( (lv_QualityAttribute_14_0= ruleQualityAttribute ) )
                            	    {
                            	    otherlv_13=(Token)match(input,27,FOLLOW_34); 

                            	    						newLeafNode(otherlv_13, grammarAccess.getComponentStackAccess().getCommaKeyword_5_2_1_0());
                            	    					
                            	    // InternalRosSystem.g:1019:6: ( (lv_QualityAttribute_14_0= ruleQualityAttribute ) )
                            	    // InternalRosSystem.g:1020:7: (lv_QualityAttribute_14_0= ruleQualityAttribute )
                            	    {
                            	    // InternalRosSystem.g:1020:7: (lv_QualityAttribute_14_0= ruleQualityAttribute )
                            	    // InternalRosSystem.g:1021:8: lv_QualityAttribute_14_0= ruleQualityAttribute
                            	    {

                            	    								newCompositeNode(grammarAccess.getComponentStackAccess().getQualityAttributeQualityAttributeParserRuleCall_5_2_1_1_0());
                            	    							
                            	    pushFollow(FOLLOW_9);
                            	    lv_QualityAttribute_14_0=ruleQualityAttribute();

                            	    state._fsp--;


                            	    								if (current==null) {
                            	    									current = createModelElementForParent(grammarAccess.getComponentStackRule());
                            	    								}
                            	    								add(
                            	    									current,
                            	    									"QualityAttribute",
                            	    									lv_QualityAttribute_14_0,
                            	    									"de.fraunhofer.ipa.rossystem.RosSystem.QualityAttribute");
                            	    								afterParserOrEnumRuleCall();
                            	    							

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop26;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_15=(Token)match(input,28,FOLLOW_27); 

                    				newLeafNode(otherlv_15, grammarAccess.getComponentStackAccess().getRightParenthesisKeyword_5_3());
                    			

                    }
                    break;

            }

            otherlv_16=(Token)match(input,31,FOLLOW_2); 

            			newLeafNode(otherlv_16, grammarAccess.getComponentStackAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleComponentStack"


    // $ANTLR start "entryRuleQualityAttribute"
    // InternalRosSystem.g:1053:1: entryRuleQualityAttribute returns [EObject current=null] : iv_ruleQualityAttribute= ruleQualityAttribute EOF ;
    public final EObject entryRuleQualityAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQualityAttribute = null;


        try {
            // InternalRosSystem.g:1053:57: (iv_ruleQualityAttribute= ruleQualityAttribute EOF )
            // InternalRosSystem.g:1054:2: iv_ruleQualityAttribute= ruleQualityAttribute EOF
            {
             newCompositeNode(grammarAccess.getQualityAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQualityAttribute=ruleQualityAttribute();

            state._fsp--;

             current =iv_ruleQualityAttribute; 
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
    // $ANTLR end "entryRuleQualityAttribute"


    // $ANTLR start "ruleQualityAttribute"
    // InternalRosSystem.g:1060:1: ruleQualityAttribute returns [EObject current=null] : (otherlv_0= 'QualityAttribute' ( (lv_Name_1_0= ruleEString ) ) (otherlv_2= 'type' ( (lv_Type_3_0= ruleParameterType ) ) )? (otherlv_4= 'value' ( (lv_Value_5_0= ruleParameterValue ) ) )? ) ;
    public final EObject ruleQualityAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_Name_1_0 = null;

        EObject lv_Type_3_0 = null;

        EObject lv_Value_5_0 = null;



        	enterRule();

        try {
            // InternalRosSystem.g:1066:2: ( (otherlv_0= 'QualityAttribute' ( (lv_Name_1_0= ruleEString ) ) (otherlv_2= 'type' ( (lv_Type_3_0= ruleParameterType ) ) )? (otherlv_4= 'value' ( (lv_Value_5_0= ruleParameterValue ) ) )? ) )
            // InternalRosSystem.g:1067:2: (otherlv_0= 'QualityAttribute' ( (lv_Name_1_0= ruleEString ) ) (otherlv_2= 'type' ( (lv_Type_3_0= ruleParameterType ) ) )? (otherlv_4= 'value' ( (lv_Value_5_0= ruleParameterValue ) ) )? )
            {
            // InternalRosSystem.g:1067:2: (otherlv_0= 'QualityAttribute' ( (lv_Name_1_0= ruleEString ) ) (otherlv_2= 'type' ( (lv_Type_3_0= ruleParameterType ) ) )? (otherlv_4= 'value' ( (lv_Value_5_0= ruleParameterValue ) ) )? )
            // InternalRosSystem.g:1068:3: otherlv_0= 'QualityAttribute' ( (lv_Name_1_0= ruleEString ) ) (otherlv_2= 'type' ( (lv_Type_3_0= ruleParameterType ) ) )? (otherlv_4= 'value' ( (lv_Value_5_0= ruleParameterValue ) ) )?
            {
            otherlv_0=(Token)match(input,43,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getQualityAttributeAccess().getQualityAttributeKeyword_0());
            		
            // InternalRosSystem.g:1072:3: ( (lv_Name_1_0= ruleEString ) )
            // InternalRosSystem.g:1073:4: (lv_Name_1_0= ruleEString )
            {
            // InternalRosSystem.g:1073:4: (lv_Name_1_0= ruleEString )
            // InternalRosSystem.g:1074:5: lv_Name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getQualityAttributeAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_35);
            lv_Name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getQualityAttributeRule());
            					}
            					set(
            						current,
            						"Name",
            						lv_Name_1_0,
            						"de.fraunhofer.ipa.rossystem.RosSystem.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRosSystem.g:1091:3: (otherlv_2= 'type' ( (lv_Type_3_0= ruleParameterType ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==44) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalRosSystem.g:1092:4: otherlv_2= 'type' ( (lv_Type_3_0= ruleParameterType ) )
                    {
                    otherlv_2=(Token)match(input,44,FOLLOW_36); 

                    				newLeafNode(otherlv_2, grammarAccess.getQualityAttributeAccess().getTypeKeyword_2_0());
                    			
                    // InternalRosSystem.g:1096:4: ( (lv_Type_3_0= ruleParameterType ) )
                    // InternalRosSystem.g:1097:5: (lv_Type_3_0= ruleParameterType )
                    {
                    // InternalRosSystem.g:1097:5: (lv_Type_3_0= ruleParameterType )
                    // InternalRosSystem.g:1098:6: lv_Type_3_0= ruleParameterType
                    {

                    						newCompositeNode(grammarAccess.getQualityAttributeAccess().getTypeParameterTypeParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_37);
                    lv_Type_3_0=ruleParameterType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getQualityAttributeRule());
                    						}
                    						set(
                    							current,
                    							"Type",
                    							lv_Type_3_0,
                    							"de.fraunhofer.ipa.rossystem.RosSystem.ParameterType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRosSystem.g:1116:3: (otherlv_4= 'value' ( (lv_Value_5_0= ruleParameterValue ) ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==45) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalRosSystem.g:1117:4: otherlv_4= 'value' ( (lv_Value_5_0= ruleParameterValue ) )
                    {
                    otherlv_4=(Token)match(input,45,FOLLOW_38); 

                    				newLeafNode(otherlv_4, grammarAccess.getQualityAttributeAccess().getValueKeyword_3_0());
                    			
                    // InternalRosSystem.g:1121:4: ( (lv_Value_5_0= ruleParameterValue ) )
                    // InternalRosSystem.g:1122:5: (lv_Value_5_0= ruleParameterValue )
                    {
                    // InternalRosSystem.g:1122:5: (lv_Value_5_0= ruleParameterValue )
                    // InternalRosSystem.g:1123:6: lv_Value_5_0= ruleParameterValue
                    {

                    						newCompositeNode(grammarAccess.getQualityAttributeAccess().getValueParameterValueParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_Value_5_0=ruleParameterValue();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getQualityAttributeRule());
                    						}
                    						set(
                    							current,
                    							"Value",
                    							lv_Value_5_0,
                    							"de.fraunhofer.ipa.rossystem.RosSystem.ParameterValue");
                    						afterParserOrEnumRuleCall();
                    					

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
    // $ANTLR end "ruleQualityAttribute"


    // $ANTLR start "entryRuleComponentInterface"
    // InternalRosSystem.g:1145:1: entryRuleComponentInterface returns [EObject current=null] : iv_ruleComponentInterface= ruleComponentInterface EOF ;
    public final EObject entryRuleComponentInterface() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentInterface = null;


        try {
            // InternalRosSystem.g:1145:59: (iv_ruleComponentInterface= ruleComponentInterface EOF )
            // InternalRosSystem.g:1146:2: iv_ruleComponentInterface= ruleComponentInterface EOF
            {
             newCompositeNode(grammarAccess.getComponentInterfaceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComponentInterface=ruleComponentInterface();

            state._fsp--;

             current =iv_ruleComponentInterface; 
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
    // $ANTLR end "entryRuleComponentInterface"


    // $ANTLR start "ruleComponentInterface"
    // InternalRosSystem.g:1152:1: ruleComponentInterface returns [EObject current=null] : (otherlv_0= 'ComponentInterface' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'NameSpace' ( (lv_NameSpace_5_0= ruleEString ) ) )? (otherlv_6= 'RosPublishers' otherlv_7= '{' ( (lv_rospublisher_8_0= ruleRosPublisher ) ) (otherlv_9= ',' ( (lv_rospublisher_10_0= ruleRosPublisher ) ) )* otherlv_11= '}' )? (otherlv_12= 'RosSubscribers' otherlv_13= '{' ( (lv_rossubscriber_14_0= ruleRosSubscriber ) ) (otherlv_15= ',' ( (lv_rossubscriber_16_0= ruleRosSubscriber ) ) )* otherlv_17= '}' )? (otherlv_18= 'RosSrvServers' otherlv_19= '{' ( (lv_rosserviceserver_20_0= ruleRosServiceServer ) ) (otherlv_21= ',' ( (lv_rosserviceserver_22_0= ruleRosServiceServer ) ) )* otherlv_23= '}' )? (otherlv_24= 'RosSrvClients' otherlv_25= '{' ( (lv_rosserviceclient_26_0= ruleRosServiceClient ) ) (otherlv_27= ',' ( (lv_rosserviceclient_28_0= ruleRosServiceClient ) ) )* otherlv_29= '}' )? (otherlv_30= 'RosActionServers' otherlv_31= '{' ( (lv_rosactionserver_32_0= ruleRosActionServer ) ) (otherlv_33= ',' ( (lv_rosactionserver_34_0= ruleRosActionServer ) ) )* otherlv_35= '}' )? (otherlv_36= 'RosActionClients' otherlv_37= '{' ( (lv_rosactionclient_38_0= ruleRosActionClient ) ) (otherlv_39= ',' ( (lv_rosactionclient_40_0= ruleRosActionClient ) ) )* otherlv_41= '}' )? (otherlv_42= 'RosParameters' otherlv_43= '{' ( (lv_rosparameter_44_0= ruleRosParameter ) ) (otherlv_45= ',' ( (lv_rosparameter_46_0= ruleRosParameter ) ) )* otherlv_47= '}' )? otherlv_48= '}' ) ;
    public final EObject ruleComponentInterface() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        Token otherlv_29=null;
        Token otherlv_30=null;
        Token otherlv_31=null;
        Token otherlv_33=null;
        Token otherlv_35=null;
        Token otherlv_36=null;
        Token otherlv_37=null;
        Token otherlv_39=null;
        Token otherlv_41=null;
        Token otherlv_42=null;
        Token otherlv_43=null;
        Token otherlv_45=null;
        Token otherlv_47=null;
        Token otherlv_48=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        AntlrDatatypeRuleToken lv_NameSpace_5_0 = null;

        EObject lv_rospublisher_8_0 = null;

        EObject lv_rospublisher_10_0 = null;

        EObject lv_rossubscriber_14_0 = null;

        EObject lv_rossubscriber_16_0 = null;

        EObject lv_rosserviceserver_20_0 = null;

        EObject lv_rosserviceserver_22_0 = null;

        EObject lv_rosserviceclient_26_0 = null;

        EObject lv_rosserviceclient_28_0 = null;

        EObject lv_rosactionserver_32_0 = null;

        EObject lv_rosactionserver_34_0 = null;

        EObject lv_rosactionclient_38_0 = null;

        EObject lv_rosactionclient_40_0 = null;

        EObject lv_rosparameter_44_0 = null;

        EObject lv_rosparameter_46_0 = null;



        	enterRule();

        try {
            // InternalRosSystem.g:1158:2: ( (otherlv_0= 'ComponentInterface' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'NameSpace' ( (lv_NameSpace_5_0= ruleEString ) ) )? (otherlv_6= 'RosPublishers' otherlv_7= '{' ( (lv_rospublisher_8_0= ruleRosPublisher ) ) (otherlv_9= ',' ( (lv_rospublisher_10_0= ruleRosPublisher ) ) )* otherlv_11= '}' )? (otherlv_12= 'RosSubscribers' otherlv_13= '{' ( (lv_rossubscriber_14_0= ruleRosSubscriber ) ) (otherlv_15= ',' ( (lv_rossubscriber_16_0= ruleRosSubscriber ) ) )* otherlv_17= '}' )? (otherlv_18= 'RosSrvServers' otherlv_19= '{' ( (lv_rosserviceserver_20_0= ruleRosServiceServer ) ) (otherlv_21= ',' ( (lv_rosserviceserver_22_0= ruleRosServiceServer ) ) )* otherlv_23= '}' )? (otherlv_24= 'RosSrvClients' otherlv_25= '{' ( (lv_rosserviceclient_26_0= ruleRosServiceClient ) ) (otherlv_27= ',' ( (lv_rosserviceclient_28_0= ruleRosServiceClient ) ) )* otherlv_29= '}' )? (otherlv_30= 'RosActionServers' otherlv_31= '{' ( (lv_rosactionserver_32_0= ruleRosActionServer ) ) (otherlv_33= ',' ( (lv_rosactionserver_34_0= ruleRosActionServer ) ) )* otherlv_35= '}' )? (otherlv_36= 'RosActionClients' otherlv_37= '{' ( (lv_rosactionclient_38_0= ruleRosActionClient ) ) (otherlv_39= ',' ( (lv_rosactionclient_40_0= ruleRosActionClient ) ) )* otherlv_41= '}' )? (otherlv_42= 'RosParameters' otherlv_43= '{' ( (lv_rosparameter_44_0= ruleRosParameter ) ) (otherlv_45= ',' ( (lv_rosparameter_46_0= ruleRosParameter ) ) )* otherlv_47= '}' )? otherlv_48= '}' ) )
            // InternalRosSystem.g:1159:2: (otherlv_0= 'ComponentInterface' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'NameSpace' ( (lv_NameSpace_5_0= ruleEString ) ) )? (otherlv_6= 'RosPublishers' otherlv_7= '{' ( (lv_rospublisher_8_0= ruleRosPublisher ) ) (otherlv_9= ',' ( (lv_rospublisher_10_0= ruleRosPublisher ) ) )* otherlv_11= '}' )? (otherlv_12= 'RosSubscribers' otherlv_13= '{' ( (lv_rossubscriber_14_0= ruleRosSubscriber ) ) (otherlv_15= ',' ( (lv_rossubscriber_16_0= ruleRosSubscriber ) ) )* otherlv_17= '}' )? (otherlv_18= 'RosSrvServers' otherlv_19= '{' ( (lv_rosserviceserver_20_0= ruleRosServiceServer ) ) (otherlv_21= ',' ( (lv_rosserviceserver_22_0= ruleRosServiceServer ) ) )* otherlv_23= '}' )? (otherlv_24= 'RosSrvClients' otherlv_25= '{' ( (lv_rosserviceclient_26_0= ruleRosServiceClient ) ) (otherlv_27= ',' ( (lv_rosserviceclient_28_0= ruleRosServiceClient ) ) )* otherlv_29= '}' )? (otherlv_30= 'RosActionServers' otherlv_31= '{' ( (lv_rosactionserver_32_0= ruleRosActionServer ) ) (otherlv_33= ',' ( (lv_rosactionserver_34_0= ruleRosActionServer ) ) )* otherlv_35= '}' )? (otherlv_36= 'RosActionClients' otherlv_37= '{' ( (lv_rosactionclient_38_0= ruleRosActionClient ) ) (otherlv_39= ',' ( (lv_rosactionclient_40_0= ruleRosActionClient ) ) )* otherlv_41= '}' )? (otherlv_42= 'RosParameters' otherlv_43= '{' ( (lv_rosparameter_44_0= ruleRosParameter ) ) (otherlv_45= ',' ( (lv_rosparameter_46_0= ruleRosParameter ) ) )* otherlv_47= '}' )? otherlv_48= '}' )
            {
            // InternalRosSystem.g:1159:2: (otherlv_0= 'ComponentInterface' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'NameSpace' ( (lv_NameSpace_5_0= ruleEString ) ) )? (otherlv_6= 'RosPublishers' otherlv_7= '{' ( (lv_rospublisher_8_0= ruleRosPublisher ) ) (otherlv_9= ',' ( (lv_rospublisher_10_0= ruleRosPublisher ) ) )* otherlv_11= '}' )? (otherlv_12= 'RosSubscribers' otherlv_13= '{' ( (lv_rossubscriber_14_0= ruleRosSubscriber ) ) (otherlv_15= ',' ( (lv_rossubscriber_16_0= ruleRosSubscriber ) ) )* otherlv_17= '}' )? (otherlv_18= 'RosSrvServers' otherlv_19= '{' ( (lv_rosserviceserver_20_0= ruleRosServiceServer ) ) (otherlv_21= ',' ( (lv_rosserviceserver_22_0= ruleRosServiceServer ) ) )* otherlv_23= '}' )? (otherlv_24= 'RosSrvClients' otherlv_25= '{' ( (lv_rosserviceclient_26_0= ruleRosServiceClient ) ) (otherlv_27= ',' ( (lv_rosserviceclient_28_0= ruleRosServiceClient ) ) )* otherlv_29= '}' )? (otherlv_30= 'RosActionServers' otherlv_31= '{' ( (lv_rosactionserver_32_0= ruleRosActionServer ) ) (otherlv_33= ',' ( (lv_rosactionserver_34_0= ruleRosActionServer ) ) )* otherlv_35= '}' )? (otherlv_36= 'RosActionClients' otherlv_37= '{' ( (lv_rosactionclient_38_0= ruleRosActionClient ) ) (otherlv_39= ',' ( (lv_rosactionclient_40_0= ruleRosActionClient ) ) )* otherlv_41= '}' )? (otherlv_42= 'RosParameters' otherlv_43= '{' ( (lv_rosparameter_44_0= ruleRosParameter ) ) (otherlv_45= ',' ( (lv_rosparameter_46_0= ruleRosParameter ) ) )* otherlv_47= '}' )? otherlv_48= '}' )
            // InternalRosSystem.g:1160:3: otherlv_0= 'ComponentInterface' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'NameSpace' ( (lv_NameSpace_5_0= ruleEString ) ) )? (otherlv_6= 'RosPublishers' otherlv_7= '{' ( (lv_rospublisher_8_0= ruleRosPublisher ) ) (otherlv_9= ',' ( (lv_rospublisher_10_0= ruleRosPublisher ) ) )* otherlv_11= '}' )? (otherlv_12= 'RosSubscribers' otherlv_13= '{' ( (lv_rossubscriber_14_0= ruleRosSubscriber ) ) (otherlv_15= ',' ( (lv_rossubscriber_16_0= ruleRosSubscriber ) ) )* otherlv_17= '}' )? (otherlv_18= 'RosSrvServers' otherlv_19= '{' ( (lv_rosserviceserver_20_0= ruleRosServiceServer ) ) (otherlv_21= ',' ( (lv_rosserviceserver_22_0= ruleRosServiceServer ) ) )* otherlv_23= '}' )? (otherlv_24= 'RosSrvClients' otherlv_25= '{' ( (lv_rosserviceclient_26_0= ruleRosServiceClient ) ) (otherlv_27= ',' ( (lv_rosserviceclient_28_0= ruleRosServiceClient ) ) )* otherlv_29= '}' )? (otherlv_30= 'RosActionServers' otherlv_31= '{' ( (lv_rosactionserver_32_0= ruleRosActionServer ) ) (otherlv_33= ',' ( (lv_rosactionserver_34_0= ruleRosActionServer ) ) )* otherlv_35= '}' )? (otherlv_36= 'RosActionClients' otherlv_37= '{' ( (lv_rosactionclient_38_0= ruleRosActionClient ) ) (otherlv_39= ',' ( (lv_rosactionclient_40_0= ruleRosActionClient ) ) )* otherlv_41= '}' )? (otherlv_42= 'RosParameters' otherlv_43= '{' ( (lv_rosparameter_44_0= ruleRosParameter ) ) (otherlv_45= ',' ( (lv_rosparameter_46_0= ruleRosParameter ) ) )* otherlv_47= '}' )? otherlv_48= '}'
            {
            otherlv_0=(Token)match(input,46,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getComponentInterfaceAccess().getComponentInterfaceKeyword_0());
            		
            otherlv_1=(Token)match(input,23,FOLLOW_30); 

            			newLeafNode(otherlv_1, grammarAccess.getComponentInterfaceAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,41,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getComponentInterfaceAccess().getNameKeyword_2());
            		
            // InternalRosSystem.g:1172:3: ( (lv_name_3_0= ruleEString ) )
            // InternalRosSystem.g:1173:4: (lv_name_3_0= ruleEString )
            {
            // InternalRosSystem.g:1173:4: (lv_name_3_0= ruleEString )
            // InternalRosSystem.g:1174:5: lv_name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getComponentInterfaceAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_39);
            lv_name_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComponentInterfaceRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_3_0,
            						"de.fraunhofer.ipa.rossystem.RosSystem.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRosSystem.g:1191:3: (otherlv_4= 'NameSpace' ( (lv_NameSpace_5_0= ruleEString ) ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==47) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalRosSystem.g:1192:4: otherlv_4= 'NameSpace' ( (lv_NameSpace_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,47,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getComponentInterfaceAccess().getNameSpaceKeyword_4_0());
                    			
                    // InternalRosSystem.g:1196:4: ( (lv_NameSpace_5_0= ruleEString ) )
                    // InternalRosSystem.g:1197:5: (lv_NameSpace_5_0= ruleEString )
                    {
                    // InternalRosSystem.g:1197:5: (lv_NameSpace_5_0= ruleEString )
                    // InternalRosSystem.g:1198:6: lv_NameSpace_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getComponentInterfaceAccess().getNameSpaceEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_40);
                    lv_NameSpace_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getComponentInterfaceRule());
                    						}
                    						set(
                    							current,
                    							"NameSpace",
                    							lv_NameSpace_5_0,
                    							"de.fraunhofer.ipa.rossystem.RosSystem.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRosSystem.g:1216:3: (otherlv_6= 'RosPublishers' otherlv_7= '{' ( (lv_rospublisher_8_0= ruleRosPublisher ) ) (otherlv_9= ',' ( (lv_rospublisher_10_0= ruleRosPublisher ) ) )* otherlv_11= '}' )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==48) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalRosSystem.g:1217:4: otherlv_6= 'RosPublishers' otherlv_7= '{' ( (lv_rospublisher_8_0= ruleRosPublisher ) ) (otherlv_9= ',' ( (lv_rospublisher_10_0= ruleRosPublisher ) ) )* otherlv_11= '}'
                    {
                    otherlv_6=(Token)match(input,48,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getComponentInterfaceAccess().getRosPublishersKeyword_5_0());
                    			
                    otherlv_7=(Token)match(input,23,FOLLOW_41); 

                    				newLeafNode(otherlv_7, grammarAccess.getComponentInterfaceAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalRosSystem.g:1225:4: ( (lv_rospublisher_8_0= ruleRosPublisher ) )
                    // InternalRosSystem.g:1226:5: (lv_rospublisher_8_0= ruleRosPublisher )
                    {
                    // InternalRosSystem.g:1226:5: (lv_rospublisher_8_0= ruleRosPublisher )
                    // InternalRosSystem.g:1227:6: lv_rospublisher_8_0= ruleRosPublisher
                    {

                    						newCompositeNode(grammarAccess.getComponentInterfaceAccess().getRospublisherRosPublisherParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_rospublisher_8_0=ruleRosPublisher();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getComponentInterfaceRule());
                    						}
                    						add(
                    							current,
                    							"rospublisher",
                    							lv_rospublisher_8_0,
                    							"de.fraunhofer.ipa.rossystem.RosSystem.RosPublisher");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRosSystem.g:1244:4: (otherlv_9= ',' ( (lv_rospublisher_10_0= ruleRosPublisher ) ) )*
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0==27) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // InternalRosSystem.g:1245:5: otherlv_9= ',' ( (lv_rospublisher_10_0= ruleRosPublisher ) )
                    	    {
                    	    otherlv_9=(Token)match(input,27,FOLLOW_41); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getComponentInterfaceAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalRosSystem.g:1249:5: ( (lv_rospublisher_10_0= ruleRosPublisher ) )
                    	    // InternalRosSystem.g:1250:6: (lv_rospublisher_10_0= ruleRosPublisher )
                    	    {
                    	    // InternalRosSystem.g:1250:6: (lv_rospublisher_10_0= ruleRosPublisher )
                    	    // InternalRosSystem.g:1251:7: lv_rospublisher_10_0= ruleRosPublisher
                    	    {

                    	    							newCompositeNode(grammarAccess.getComponentInterfaceAccess().getRospublisherRosPublisherParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_16);
                    	    lv_rospublisher_10_0=ruleRosPublisher();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getComponentInterfaceRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"rospublisher",
                    	    								lv_rospublisher_10_0,
                    	    								"de.fraunhofer.ipa.rossystem.RosSystem.RosPublisher");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop32;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,31,FOLLOW_42); 

                    				newLeafNode(otherlv_11, grammarAccess.getComponentInterfaceAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalRosSystem.g:1274:3: (otherlv_12= 'RosSubscribers' otherlv_13= '{' ( (lv_rossubscriber_14_0= ruleRosSubscriber ) ) (otherlv_15= ',' ( (lv_rossubscriber_16_0= ruleRosSubscriber ) ) )* otherlv_17= '}' )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==49) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalRosSystem.g:1275:4: otherlv_12= 'RosSubscribers' otherlv_13= '{' ( (lv_rossubscriber_14_0= ruleRosSubscriber ) ) (otherlv_15= ',' ( (lv_rossubscriber_16_0= ruleRosSubscriber ) ) )* otherlv_17= '}'
                    {
                    otherlv_12=(Token)match(input,49,FOLLOW_3); 

                    				newLeafNode(otherlv_12, grammarAccess.getComponentInterfaceAccess().getRosSubscribersKeyword_6_0());
                    			
                    otherlv_13=(Token)match(input,23,FOLLOW_43); 

                    				newLeafNode(otherlv_13, grammarAccess.getComponentInterfaceAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalRosSystem.g:1283:4: ( (lv_rossubscriber_14_0= ruleRosSubscriber ) )
                    // InternalRosSystem.g:1284:5: (lv_rossubscriber_14_0= ruleRosSubscriber )
                    {
                    // InternalRosSystem.g:1284:5: (lv_rossubscriber_14_0= ruleRosSubscriber )
                    // InternalRosSystem.g:1285:6: lv_rossubscriber_14_0= ruleRosSubscriber
                    {

                    						newCompositeNode(grammarAccess.getComponentInterfaceAccess().getRossubscriberRosSubscriberParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_rossubscriber_14_0=ruleRosSubscriber();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getComponentInterfaceRule());
                    						}
                    						add(
                    							current,
                    							"rossubscriber",
                    							lv_rossubscriber_14_0,
                    							"de.fraunhofer.ipa.rossystem.RosSystem.RosSubscriber");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRosSystem.g:1302:4: (otherlv_15= ',' ( (lv_rossubscriber_16_0= ruleRosSubscriber ) ) )*
                    loop34:
                    do {
                        int alt34=2;
                        int LA34_0 = input.LA(1);

                        if ( (LA34_0==27) ) {
                            alt34=1;
                        }


                        switch (alt34) {
                    	case 1 :
                    	    // InternalRosSystem.g:1303:5: otherlv_15= ',' ( (lv_rossubscriber_16_0= ruleRosSubscriber ) )
                    	    {
                    	    otherlv_15=(Token)match(input,27,FOLLOW_43); 

                    	    					newLeafNode(otherlv_15, grammarAccess.getComponentInterfaceAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalRosSystem.g:1307:5: ( (lv_rossubscriber_16_0= ruleRosSubscriber ) )
                    	    // InternalRosSystem.g:1308:6: (lv_rossubscriber_16_0= ruleRosSubscriber )
                    	    {
                    	    // InternalRosSystem.g:1308:6: (lv_rossubscriber_16_0= ruleRosSubscriber )
                    	    // InternalRosSystem.g:1309:7: lv_rossubscriber_16_0= ruleRosSubscriber
                    	    {

                    	    							newCompositeNode(grammarAccess.getComponentInterfaceAccess().getRossubscriberRosSubscriberParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_16);
                    	    lv_rossubscriber_16_0=ruleRosSubscriber();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getComponentInterfaceRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"rossubscriber",
                    	    								lv_rossubscriber_16_0,
                    	    								"de.fraunhofer.ipa.rossystem.RosSystem.RosSubscriber");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop34;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,31,FOLLOW_44); 

                    				newLeafNode(otherlv_17, grammarAccess.getComponentInterfaceAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            // InternalRosSystem.g:1332:3: (otherlv_18= 'RosSrvServers' otherlv_19= '{' ( (lv_rosserviceserver_20_0= ruleRosServiceServer ) ) (otherlv_21= ',' ( (lv_rosserviceserver_22_0= ruleRosServiceServer ) ) )* otherlv_23= '}' )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==50) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalRosSystem.g:1333:4: otherlv_18= 'RosSrvServers' otherlv_19= '{' ( (lv_rosserviceserver_20_0= ruleRosServiceServer ) ) (otherlv_21= ',' ( (lv_rosserviceserver_22_0= ruleRosServiceServer ) ) )* otherlv_23= '}'
                    {
                    otherlv_18=(Token)match(input,50,FOLLOW_3); 

                    				newLeafNode(otherlv_18, grammarAccess.getComponentInterfaceAccess().getRosSrvServersKeyword_7_0());
                    			
                    otherlv_19=(Token)match(input,23,FOLLOW_45); 

                    				newLeafNode(otherlv_19, grammarAccess.getComponentInterfaceAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalRosSystem.g:1341:4: ( (lv_rosserviceserver_20_0= ruleRosServiceServer ) )
                    // InternalRosSystem.g:1342:5: (lv_rosserviceserver_20_0= ruleRosServiceServer )
                    {
                    // InternalRosSystem.g:1342:5: (lv_rosserviceserver_20_0= ruleRosServiceServer )
                    // InternalRosSystem.g:1343:6: lv_rosserviceserver_20_0= ruleRosServiceServer
                    {

                    						newCompositeNode(grammarAccess.getComponentInterfaceAccess().getRosserviceserverRosServiceServerParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_rosserviceserver_20_0=ruleRosServiceServer();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getComponentInterfaceRule());
                    						}
                    						add(
                    							current,
                    							"rosserviceserver",
                    							lv_rosserviceserver_20_0,
                    							"de.fraunhofer.ipa.rossystem.RosSystem.RosServiceServer");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRosSystem.g:1360:4: (otherlv_21= ',' ( (lv_rosserviceserver_22_0= ruleRosServiceServer ) ) )*
                    loop36:
                    do {
                        int alt36=2;
                        int LA36_0 = input.LA(1);

                        if ( (LA36_0==27) ) {
                            alt36=1;
                        }


                        switch (alt36) {
                    	case 1 :
                    	    // InternalRosSystem.g:1361:5: otherlv_21= ',' ( (lv_rosserviceserver_22_0= ruleRosServiceServer ) )
                    	    {
                    	    otherlv_21=(Token)match(input,27,FOLLOW_45); 

                    	    					newLeafNode(otherlv_21, grammarAccess.getComponentInterfaceAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalRosSystem.g:1365:5: ( (lv_rosserviceserver_22_0= ruleRosServiceServer ) )
                    	    // InternalRosSystem.g:1366:6: (lv_rosserviceserver_22_0= ruleRosServiceServer )
                    	    {
                    	    // InternalRosSystem.g:1366:6: (lv_rosserviceserver_22_0= ruleRosServiceServer )
                    	    // InternalRosSystem.g:1367:7: lv_rosserviceserver_22_0= ruleRosServiceServer
                    	    {

                    	    							newCompositeNode(grammarAccess.getComponentInterfaceAccess().getRosserviceserverRosServiceServerParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_16);
                    	    lv_rosserviceserver_22_0=ruleRosServiceServer();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getComponentInterfaceRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"rosserviceserver",
                    	    								lv_rosserviceserver_22_0,
                    	    								"de.fraunhofer.ipa.rossystem.RosSystem.RosServiceServer");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop36;
                        }
                    } while (true);

                    otherlv_23=(Token)match(input,31,FOLLOW_46); 

                    				newLeafNode(otherlv_23, grammarAccess.getComponentInterfaceAccess().getRightCurlyBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            // InternalRosSystem.g:1390:3: (otherlv_24= 'RosSrvClients' otherlv_25= '{' ( (lv_rosserviceclient_26_0= ruleRosServiceClient ) ) (otherlv_27= ',' ( (lv_rosserviceclient_28_0= ruleRosServiceClient ) ) )* otherlv_29= '}' )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==51) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalRosSystem.g:1391:4: otherlv_24= 'RosSrvClients' otherlv_25= '{' ( (lv_rosserviceclient_26_0= ruleRosServiceClient ) ) (otherlv_27= ',' ( (lv_rosserviceclient_28_0= ruleRosServiceClient ) ) )* otherlv_29= '}'
                    {
                    otherlv_24=(Token)match(input,51,FOLLOW_3); 

                    				newLeafNode(otherlv_24, grammarAccess.getComponentInterfaceAccess().getRosSrvClientsKeyword_8_0());
                    			
                    otherlv_25=(Token)match(input,23,FOLLOW_47); 

                    				newLeafNode(otherlv_25, grammarAccess.getComponentInterfaceAccess().getLeftCurlyBracketKeyword_8_1());
                    			
                    // InternalRosSystem.g:1399:4: ( (lv_rosserviceclient_26_0= ruleRosServiceClient ) )
                    // InternalRosSystem.g:1400:5: (lv_rosserviceclient_26_0= ruleRosServiceClient )
                    {
                    // InternalRosSystem.g:1400:5: (lv_rosserviceclient_26_0= ruleRosServiceClient )
                    // InternalRosSystem.g:1401:6: lv_rosserviceclient_26_0= ruleRosServiceClient
                    {

                    						newCompositeNode(grammarAccess.getComponentInterfaceAccess().getRosserviceclientRosServiceClientParserRuleCall_8_2_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_rosserviceclient_26_0=ruleRosServiceClient();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getComponentInterfaceRule());
                    						}
                    						add(
                    							current,
                    							"rosserviceclient",
                    							lv_rosserviceclient_26_0,
                    							"de.fraunhofer.ipa.rossystem.RosSystem.RosServiceClient");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRosSystem.g:1418:4: (otherlv_27= ',' ( (lv_rosserviceclient_28_0= ruleRosServiceClient ) ) )*
                    loop38:
                    do {
                        int alt38=2;
                        int LA38_0 = input.LA(1);

                        if ( (LA38_0==27) ) {
                            alt38=1;
                        }


                        switch (alt38) {
                    	case 1 :
                    	    // InternalRosSystem.g:1419:5: otherlv_27= ',' ( (lv_rosserviceclient_28_0= ruleRosServiceClient ) )
                    	    {
                    	    otherlv_27=(Token)match(input,27,FOLLOW_47); 

                    	    					newLeafNode(otherlv_27, grammarAccess.getComponentInterfaceAccess().getCommaKeyword_8_3_0());
                    	    				
                    	    // InternalRosSystem.g:1423:5: ( (lv_rosserviceclient_28_0= ruleRosServiceClient ) )
                    	    // InternalRosSystem.g:1424:6: (lv_rosserviceclient_28_0= ruleRosServiceClient )
                    	    {
                    	    // InternalRosSystem.g:1424:6: (lv_rosserviceclient_28_0= ruleRosServiceClient )
                    	    // InternalRosSystem.g:1425:7: lv_rosserviceclient_28_0= ruleRosServiceClient
                    	    {

                    	    							newCompositeNode(grammarAccess.getComponentInterfaceAccess().getRosserviceclientRosServiceClientParserRuleCall_8_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_16);
                    	    lv_rosserviceclient_28_0=ruleRosServiceClient();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getComponentInterfaceRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"rosserviceclient",
                    	    								lv_rosserviceclient_28_0,
                    	    								"de.fraunhofer.ipa.rossystem.RosSystem.RosServiceClient");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop38;
                        }
                    } while (true);

                    otherlv_29=(Token)match(input,31,FOLLOW_48); 

                    				newLeafNode(otherlv_29, grammarAccess.getComponentInterfaceAccess().getRightCurlyBracketKeyword_8_4());
                    			

                    }
                    break;

            }

            // InternalRosSystem.g:1448:3: (otherlv_30= 'RosActionServers' otherlv_31= '{' ( (lv_rosactionserver_32_0= ruleRosActionServer ) ) (otherlv_33= ',' ( (lv_rosactionserver_34_0= ruleRosActionServer ) ) )* otherlv_35= '}' )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==52) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalRosSystem.g:1449:4: otherlv_30= 'RosActionServers' otherlv_31= '{' ( (lv_rosactionserver_32_0= ruleRosActionServer ) ) (otherlv_33= ',' ( (lv_rosactionserver_34_0= ruleRosActionServer ) ) )* otherlv_35= '}'
                    {
                    otherlv_30=(Token)match(input,52,FOLLOW_3); 

                    				newLeafNode(otherlv_30, grammarAccess.getComponentInterfaceAccess().getRosActionServersKeyword_9_0());
                    			
                    otherlv_31=(Token)match(input,23,FOLLOW_49); 

                    				newLeafNode(otherlv_31, grammarAccess.getComponentInterfaceAccess().getLeftCurlyBracketKeyword_9_1());
                    			
                    // InternalRosSystem.g:1457:4: ( (lv_rosactionserver_32_0= ruleRosActionServer ) )
                    // InternalRosSystem.g:1458:5: (lv_rosactionserver_32_0= ruleRosActionServer )
                    {
                    // InternalRosSystem.g:1458:5: (lv_rosactionserver_32_0= ruleRosActionServer )
                    // InternalRosSystem.g:1459:6: lv_rosactionserver_32_0= ruleRosActionServer
                    {

                    						newCompositeNode(grammarAccess.getComponentInterfaceAccess().getRosactionserverRosActionServerParserRuleCall_9_2_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_rosactionserver_32_0=ruleRosActionServer();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getComponentInterfaceRule());
                    						}
                    						add(
                    							current,
                    							"rosactionserver",
                    							lv_rosactionserver_32_0,
                    							"de.fraunhofer.ipa.rossystem.RosSystem.RosActionServer");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRosSystem.g:1476:4: (otherlv_33= ',' ( (lv_rosactionserver_34_0= ruleRosActionServer ) ) )*
                    loop40:
                    do {
                        int alt40=2;
                        int LA40_0 = input.LA(1);

                        if ( (LA40_0==27) ) {
                            alt40=1;
                        }


                        switch (alt40) {
                    	case 1 :
                    	    // InternalRosSystem.g:1477:5: otherlv_33= ',' ( (lv_rosactionserver_34_0= ruleRosActionServer ) )
                    	    {
                    	    otherlv_33=(Token)match(input,27,FOLLOW_49); 

                    	    					newLeafNode(otherlv_33, grammarAccess.getComponentInterfaceAccess().getCommaKeyword_9_3_0());
                    	    				
                    	    // InternalRosSystem.g:1481:5: ( (lv_rosactionserver_34_0= ruleRosActionServer ) )
                    	    // InternalRosSystem.g:1482:6: (lv_rosactionserver_34_0= ruleRosActionServer )
                    	    {
                    	    // InternalRosSystem.g:1482:6: (lv_rosactionserver_34_0= ruleRosActionServer )
                    	    // InternalRosSystem.g:1483:7: lv_rosactionserver_34_0= ruleRosActionServer
                    	    {

                    	    							newCompositeNode(grammarAccess.getComponentInterfaceAccess().getRosactionserverRosActionServerParserRuleCall_9_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_16);
                    	    lv_rosactionserver_34_0=ruleRosActionServer();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getComponentInterfaceRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"rosactionserver",
                    	    								lv_rosactionserver_34_0,
                    	    								"de.fraunhofer.ipa.rossystem.RosSystem.RosActionServer");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop40;
                        }
                    } while (true);

                    otherlv_35=(Token)match(input,31,FOLLOW_50); 

                    				newLeafNode(otherlv_35, grammarAccess.getComponentInterfaceAccess().getRightCurlyBracketKeyword_9_4());
                    			

                    }
                    break;

            }

            // InternalRosSystem.g:1506:3: (otherlv_36= 'RosActionClients' otherlv_37= '{' ( (lv_rosactionclient_38_0= ruleRosActionClient ) ) (otherlv_39= ',' ( (lv_rosactionclient_40_0= ruleRosActionClient ) ) )* otherlv_41= '}' )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==53) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalRosSystem.g:1507:4: otherlv_36= 'RosActionClients' otherlv_37= '{' ( (lv_rosactionclient_38_0= ruleRosActionClient ) ) (otherlv_39= ',' ( (lv_rosactionclient_40_0= ruleRosActionClient ) ) )* otherlv_41= '}'
                    {
                    otherlv_36=(Token)match(input,53,FOLLOW_3); 

                    				newLeafNode(otherlv_36, grammarAccess.getComponentInterfaceAccess().getRosActionClientsKeyword_10_0());
                    			
                    otherlv_37=(Token)match(input,23,FOLLOW_51); 

                    				newLeafNode(otherlv_37, grammarAccess.getComponentInterfaceAccess().getLeftCurlyBracketKeyword_10_1());
                    			
                    // InternalRosSystem.g:1515:4: ( (lv_rosactionclient_38_0= ruleRosActionClient ) )
                    // InternalRosSystem.g:1516:5: (lv_rosactionclient_38_0= ruleRosActionClient )
                    {
                    // InternalRosSystem.g:1516:5: (lv_rosactionclient_38_0= ruleRosActionClient )
                    // InternalRosSystem.g:1517:6: lv_rosactionclient_38_0= ruleRosActionClient
                    {

                    						newCompositeNode(grammarAccess.getComponentInterfaceAccess().getRosactionclientRosActionClientParserRuleCall_10_2_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_rosactionclient_38_0=ruleRosActionClient();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getComponentInterfaceRule());
                    						}
                    						add(
                    							current,
                    							"rosactionclient",
                    							lv_rosactionclient_38_0,
                    							"de.fraunhofer.ipa.rossystem.RosSystem.RosActionClient");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRosSystem.g:1534:4: (otherlv_39= ',' ( (lv_rosactionclient_40_0= ruleRosActionClient ) ) )*
                    loop42:
                    do {
                        int alt42=2;
                        int LA42_0 = input.LA(1);

                        if ( (LA42_0==27) ) {
                            alt42=1;
                        }


                        switch (alt42) {
                    	case 1 :
                    	    // InternalRosSystem.g:1535:5: otherlv_39= ',' ( (lv_rosactionclient_40_0= ruleRosActionClient ) )
                    	    {
                    	    otherlv_39=(Token)match(input,27,FOLLOW_51); 

                    	    					newLeafNode(otherlv_39, grammarAccess.getComponentInterfaceAccess().getCommaKeyword_10_3_0());
                    	    				
                    	    // InternalRosSystem.g:1539:5: ( (lv_rosactionclient_40_0= ruleRosActionClient ) )
                    	    // InternalRosSystem.g:1540:6: (lv_rosactionclient_40_0= ruleRosActionClient )
                    	    {
                    	    // InternalRosSystem.g:1540:6: (lv_rosactionclient_40_0= ruleRosActionClient )
                    	    // InternalRosSystem.g:1541:7: lv_rosactionclient_40_0= ruleRosActionClient
                    	    {

                    	    							newCompositeNode(grammarAccess.getComponentInterfaceAccess().getRosactionclientRosActionClientParserRuleCall_10_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_16);
                    	    lv_rosactionclient_40_0=ruleRosActionClient();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getComponentInterfaceRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"rosactionclient",
                    	    								lv_rosactionclient_40_0,
                    	    								"de.fraunhofer.ipa.rossystem.RosSystem.RosActionClient");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop42;
                        }
                    } while (true);

                    otherlv_41=(Token)match(input,31,FOLLOW_52); 

                    				newLeafNode(otherlv_41, grammarAccess.getComponentInterfaceAccess().getRightCurlyBracketKeyword_10_4());
                    			

                    }
                    break;

            }

            // InternalRosSystem.g:1564:3: (otherlv_42= 'RosParameters' otherlv_43= '{' ( (lv_rosparameter_44_0= ruleRosParameter ) ) (otherlv_45= ',' ( (lv_rosparameter_46_0= ruleRosParameter ) ) )* otherlv_47= '}' )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==54) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalRosSystem.g:1565:4: otherlv_42= 'RosParameters' otherlv_43= '{' ( (lv_rosparameter_44_0= ruleRosParameter ) ) (otherlv_45= ',' ( (lv_rosparameter_46_0= ruleRosParameter ) ) )* otherlv_47= '}'
                    {
                    otherlv_42=(Token)match(input,54,FOLLOW_3); 

                    				newLeafNode(otherlv_42, grammarAccess.getComponentInterfaceAccess().getRosParametersKeyword_11_0());
                    			
                    otherlv_43=(Token)match(input,23,FOLLOW_53); 

                    				newLeafNode(otherlv_43, grammarAccess.getComponentInterfaceAccess().getLeftCurlyBracketKeyword_11_1());
                    			
                    // InternalRosSystem.g:1573:4: ( (lv_rosparameter_44_0= ruleRosParameter ) )
                    // InternalRosSystem.g:1574:5: (lv_rosparameter_44_0= ruleRosParameter )
                    {
                    // InternalRosSystem.g:1574:5: (lv_rosparameter_44_0= ruleRosParameter )
                    // InternalRosSystem.g:1575:6: lv_rosparameter_44_0= ruleRosParameter
                    {

                    						newCompositeNode(grammarAccess.getComponentInterfaceAccess().getRosparameterRosParameterParserRuleCall_11_2_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_rosparameter_44_0=ruleRosParameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getComponentInterfaceRule());
                    						}
                    						add(
                    							current,
                    							"rosparameter",
                    							lv_rosparameter_44_0,
                    							"de.fraunhofer.ipa.rossystem.RosSystem.RosParameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRosSystem.g:1592:4: (otherlv_45= ',' ( (lv_rosparameter_46_0= ruleRosParameter ) ) )*
                    loop44:
                    do {
                        int alt44=2;
                        int LA44_0 = input.LA(1);

                        if ( (LA44_0==27) ) {
                            alt44=1;
                        }


                        switch (alt44) {
                    	case 1 :
                    	    // InternalRosSystem.g:1593:5: otherlv_45= ',' ( (lv_rosparameter_46_0= ruleRosParameter ) )
                    	    {
                    	    otherlv_45=(Token)match(input,27,FOLLOW_53); 

                    	    					newLeafNode(otherlv_45, grammarAccess.getComponentInterfaceAccess().getCommaKeyword_11_3_0());
                    	    				
                    	    // InternalRosSystem.g:1597:5: ( (lv_rosparameter_46_0= ruleRosParameter ) )
                    	    // InternalRosSystem.g:1598:6: (lv_rosparameter_46_0= ruleRosParameter )
                    	    {
                    	    // InternalRosSystem.g:1598:6: (lv_rosparameter_46_0= ruleRosParameter )
                    	    // InternalRosSystem.g:1599:7: lv_rosparameter_46_0= ruleRosParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getComponentInterfaceAccess().getRosparameterRosParameterParserRuleCall_11_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_16);
                    	    lv_rosparameter_46_0=ruleRosParameter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getComponentInterfaceRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"rosparameter",
                    	    								lv_rosparameter_46_0,
                    	    								"de.fraunhofer.ipa.rossystem.RosSystem.RosParameter");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop44;
                        }
                    } while (true);

                    otherlv_47=(Token)match(input,31,FOLLOW_27); 

                    				newLeafNode(otherlv_47, grammarAccess.getComponentInterfaceAccess().getRightCurlyBracketKeyword_11_4());
                    			

                    }
                    break;

            }

            otherlv_48=(Token)match(input,31,FOLLOW_2); 

            			newLeafNode(otherlv_48, grammarAccess.getComponentInterfaceAccess().getRightCurlyBracketKeyword_12());
            		

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
    // $ANTLR end "ruleComponentInterface"


    // $ANTLR start "entryRuleRosPublisher"
    // InternalRosSystem.g:1630:1: entryRuleRosPublisher returns [EObject current=null] : iv_ruleRosPublisher= ruleRosPublisher EOF ;
    public final EObject entryRuleRosPublisher() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRosPublisher = null;


        try {
            // InternalRosSystem.g:1630:53: (iv_ruleRosPublisher= ruleRosPublisher EOF )
            // InternalRosSystem.g:1631:2: iv_ruleRosPublisher= ruleRosPublisher EOF
            {
             newCompositeNode(grammarAccess.getRosPublisherRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRosPublisher=ruleRosPublisher();

            state._fsp--;

             current =iv_ruleRosPublisher; 
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
    // $ANTLR end "entryRuleRosPublisher"


    // $ANTLR start "ruleRosPublisher"
    // InternalRosSystem.g:1637:1: ruleRosPublisher returns [EObject current=null] : ( () otherlv_1= 'RosPublisher' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefPublisher' ( ( ruleEString ) ) otherlv_8= '}' ) ;
    public final EObject ruleRosPublisher() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_ns_5_0 = null;



        	enterRule();

        try {
            // InternalRosSystem.g:1643:2: ( ( () otherlv_1= 'RosPublisher' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefPublisher' ( ( ruleEString ) ) otherlv_8= '}' ) )
            // InternalRosSystem.g:1644:2: ( () otherlv_1= 'RosPublisher' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefPublisher' ( ( ruleEString ) ) otherlv_8= '}' )
            {
            // InternalRosSystem.g:1644:2: ( () otherlv_1= 'RosPublisher' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefPublisher' ( ( ruleEString ) ) otherlv_8= '}' )
            // InternalRosSystem.g:1645:3: () otherlv_1= 'RosPublisher' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefPublisher' ( ( ruleEString ) ) otherlv_8= '}'
            {
            // InternalRosSystem.g:1645:3: ()
            // InternalRosSystem.g:1646:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRosPublisherAccess().getRosPublisherAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,55,FOLLOW_54); 

            			newLeafNode(otherlv_1, grammarAccess.getRosPublisherAccess().getRosPublisherKeyword_1());
            		
            // InternalRosSystem.g:1656:3: ( (lv_name_2_0= ruleEString ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( ((LA46_0>=RULE_STRING && LA46_0<=RULE_ID)) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalRosSystem.g:1657:4: (lv_name_2_0= ruleEString )
                    {
                    // InternalRosSystem.g:1657:4: (lv_name_2_0= ruleEString )
                    // InternalRosSystem.g:1658:5: lv_name_2_0= ruleEString
                    {

                    					newCompositeNode(grammarAccess.getRosPublisherAccess().getNameEStringParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_3);
                    lv_name_2_0=ruleEString();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getRosPublisherRule());
                    					}
                    					set(
                    						current,
                    						"name",
                    						lv_name_2_0,
                    						"de.fraunhofer.ipa.rossystem.RosSystem.EString");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,23,FOLLOW_55); 

            			newLeafNode(otherlv_3, grammarAccess.getRosPublisherAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalRosSystem.g:1679:3: (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==56) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalRosSystem.g:1680:4: otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,56,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getRosPublisherAccess().getNsKeyword_4_0());
                    			
                    // InternalRosSystem.g:1684:4: ( (lv_ns_5_0= ruleEString ) )
                    // InternalRosSystem.g:1685:5: (lv_ns_5_0= ruleEString )
                    {
                    // InternalRosSystem.g:1685:5: (lv_ns_5_0= ruleEString )
                    // InternalRosSystem.g:1686:6: lv_ns_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getRosPublisherAccess().getNsEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_56);
                    lv_ns_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRosPublisherRule());
                    						}
                    						set(
                    							current,
                    							"ns",
                    							lv_ns_5_0,
                    							"de.fraunhofer.ipa.rossystem.RosSystem.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,57,FOLLOW_5); 

            			newLeafNode(otherlv_6, grammarAccess.getRosPublisherAccess().getRefPublisherKeyword_5());
            		
            // InternalRosSystem.g:1708:3: ( ( ruleEString ) )
            // InternalRosSystem.g:1709:4: ( ruleEString )
            {
            // InternalRosSystem.g:1709:4: ( ruleEString )
            // InternalRosSystem.g:1710:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRosPublisherRule());
            					}
            				

            					newCompositeNode(grammarAccess.getRosPublisherAccess().getPublisherPublisherCrossReference_6_0());
            				
            pushFollow(FOLLOW_27);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,31,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getRosPublisherAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleRosPublisher"


    // $ANTLR start "entryRuleRosSubscriber"
    // InternalRosSystem.g:1732:1: entryRuleRosSubscriber returns [EObject current=null] : iv_ruleRosSubscriber= ruleRosSubscriber EOF ;
    public final EObject entryRuleRosSubscriber() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRosSubscriber = null;


        try {
            // InternalRosSystem.g:1732:54: (iv_ruleRosSubscriber= ruleRosSubscriber EOF )
            // InternalRosSystem.g:1733:2: iv_ruleRosSubscriber= ruleRosSubscriber EOF
            {
             newCompositeNode(grammarAccess.getRosSubscriberRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRosSubscriber=ruleRosSubscriber();

            state._fsp--;

             current =iv_ruleRosSubscriber; 
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
    // $ANTLR end "entryRuleRosSubscriber"


    // $ANTLR start "ruleRosSubscriber"
    // InternalRosSystem.g:1739:1: ruleRosSubscriber returns [EObject current=null] : ( () otherlv_1= 'RosSubscriber' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefSubscriber' ( ( ruleEString ) ) otherlv_8= '}' ) ;
    public final EObject ruleRosSubscriber() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_ns_5_0 = null;



        	enterRule();

        try {
            // InternalRosSystem.g:1745:2: ( ( () otherlv_1= 'RosSubscriber' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefSubscriber' ( ( ruleEString ) ) otherlv_8= '}' ) )
            // InternalRosSystem.g:1746:2: ( () otherlv_1= 'RosSubscriber' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefSubscriber' ( ( ruleEString ) ) otherlv_8= '}' )
            {
            // InternalRosSystem.g:1746:2: ( () otherlv_1= 'RosSubscriber' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefSubscriber' ( ( ruleEString ) ) otherlv_8= '}' )
            // InternalRosSystem.g:1747:3: () otherlv_1= 'RosSubscriber' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefSubscriber' ( ( ruleEString ) ) otherlv_8= '}'
            {
            // InternalRosSystem.g:1747:3: ()
            // InternalRosSystem.g:1748:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRosSubscriberAccess().getRosSubscriberAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,58,FOLLOW_54); 

            			newLeafNode(otherlv_1, grammarAccess.getRosSubscriberAccess().getRosSubscriberKeyword_1());
            		
            // InternalRosSystem.g:1758:3: ( (lv_name_2_0= ruleEString ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( ((LA48_0>=RULE_STRING && LA48_0<=RULE_ID)) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalRosSystem.g:1759:4: (lv_name_2_0= ruleEString )
                    {
                    // InternalRosSystem.g:1759:4: (lv_name_2_0= ruleEString )
                    // InternalRosSystem.g:1760:5: lv_name_2_0= ruleEString
                    {

                    					newCompositeNode(grammarAccess.getRosSubscriberAccess().getNameEStringParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_3);
                    lv_name_2_0=ruleEString();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getRosSubscriberRule());
                    					}
                    					set(
                    						current,
                    						"name",
                    						lv_name_2_0,
                    						"de.fraunhofer.ipa.rossystem.RosSystem.EString");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,23,FOLLOW_57); 

            			newLeafNode(otherlv_3, grammarAccess.getRosSubscriberAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalRosSystem.g:1781:3: (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==56) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalRosSystem.g:1782:4: otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,56,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getRosSubscriberAccess().getNsKeyword_4_0());
                    			
                    // InternalRosSystem.g:1786:4: ( (lv_ns_5_0= ruleEString ) )
                    // InternalRosSystem.g:1787:5: (lv_ns_5_0= ruleEString )
                    {
                    // InternalRosSystem.g:1787:5: (lv_ns_5_0= ruleEString )
                    // InternalRosSystem.g:1788:6: lv_ns_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getRosSubscriberAccess().getNsEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_58);
                    lv_ns_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRosSubscriberRule());
                    						}
                    						set(
                    							current,
                    							"ns",
                    							lv_ns_5_0,
                    							"de.fraunhofer.ipa.rossystem.RosSystem.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,59,FOLLOW_5); 

            			newLeafNode(otherlv_6, grammarAccess.getRosSubscriberAccess().getRefSubscriberKeyword_5());
            		
            // InternalRosSystem.g:1810:3: ( ( ruleEString ) )
            // InternalRosSystem.g:1811:4: ( ruleEString )
            {
            // InternalRosSystem.g:1811:4: ( ruleEString )
            // InternalRosSystem.g:1812:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRosSubscriberRule());
            					}
            				

            					newCompositeNode(grammarAccess.getRosSubscriberAccess().getSubscriberSubscriberCrossReference_6_0());
            				
            pushFollow(FOLLOW_27);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,31,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getRosSubscriberAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleRosSubscriber"


    // $ANTLR start "entryRuleRosServiceServer"
    // InternalRosSystem.g:1834:1: entryRuleRosServiceServer returns [EObject current=null] : iv_ruleRosServiceServer= ruleRosServiceServer EOF ;
    public final EObject entryRuleRosServiceServer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRosServiceServer = null;


        try {
            // InternalRosSystem.g:1834:57: (iv_ruleRosServiceServer= ruleRosServiceServer EOF )
            // InternalRosSystem.g:1835:2: iv_ruleRosServiceServer= ruleRosServiceServer EOF
            {
             newCompositeNode(grammarAccess.getRosServiceServerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRosServiceServer=ruleRosServiceServer();

            state._fsp--;

             current =iv_ruleRosServiceServer; 
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
    // $ANTLR end "entryRuleRosServiceServer"


    // $ANTLR start "ruleRosServiceServer"
    // InternalRosSystem.g:1841:1: ruleRosServiceServer returns [EObject current=null] : ( () otherlv_1= 'RosServiceServer' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefServer' ( ( ruleEString ) ) otherlv_8= '}' ) ;
    public final EObject ruleRosServiceServer() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_ns_5_0 = null;



        	enterRule();

        try {
            // InternalRosSystem.g:1847:2: ( ( () otherlv_1= 'RosServiceServer' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefServer' ( ( ruleEString ) ) otherlv_8= '}' ) )
            // InternalRosSystem.g:1848:2: ( () otherlv_1= 'RosServiceServer' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefServer' ( ( ruleEString ) ) otherlv_8= '}' )
            {
            // InternalRosSystem.g:1848:2: ( () otherlv_1= 'RosServiceServer' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefServer' ( ( ruleEString ) ) otherlv_8= '}' )
            // InternalRosSystem.g:1849:3: () otherlv_1= 'RosServiceServer' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefServer' ( ( ruleEString ) ) otherlv_8= '}'
            {
            // InternalRosSystem.g:1849:3: ()
            // InternalRosSystem.g:1850:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRosServiceServerAccess().getRosServiceServerAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,60,FOLLOW_54); 

            			newLeafNode(otherlv_1, grammarAccess.getRosServiceServerAccess().getRosServiceServerKeyword_1());
            		
            // InternalRosSystem.g:1860:3: ( (lv_name_2_0= ruleEString ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( ((LA50_0>=RULE_STRING && LA50_0<=RULE_ID)) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalRosSystem.g:1861:4: (lv_name_2_0= ruleEString )
                    {
                    // InternalRosSystem.g:1861:4: (lv_name_2_0= ruleEString )
                    // InternalRosSystem.g:1862:5: lv_name_2_0= ruleEString
                    {

                    					newCompositeNode(grammarAccess.getRosServiceServerAccess().getNameEStringParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_3);
                    lv_name_2_0=ruleEString();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getRosServiceServerRule());
                    					}
                    					set(
                    						current,
                    						"name",
                    						lv_name_2_0,
                    						"de.fraunhofer.ipa.rossystem.RosSystem.EString");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,23,FOLLOW_59); 

            			newLeafNode(otherlv_3, grammarAccess.getRosServiceServerAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalRosSystem.g:1883:3: (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==56) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalRosSystem.g:1884:4: otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,56,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getRosServiceServerAccess().getNsKeyword_4_0());
                    			
                    // InternalRosSystem.g:1888:4: ( (lv_ns_5_0= ruleEString ) )
                    // InternalRosSystem.g:1889:5: (lv_ns_5_0= ruleEString )
                    {
                    // InternalRosSystem.g:1889:5: (lv_ns_5_0= ruleEString )
                    // InternalRosSystem.g:1890:6: lv_ns_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getRosServiceServerAccess().getNsEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_60);
                    lv_ns_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRosServiceServerRule());
                    						}
                    						set(
                    							current,
                    							"ns",
                    							lv_ns_5_0,
                    							"de.fraunhofer.ipa.rossystem.RosSystem.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,61,FOLLOW_5); 

            			newLeafNode(otherlv_6, grammarAccess.getRosServiceServerAccess().getRefServerKeyword_5());
            		
            // InternalRosSystem.g:1912:3: ( ( ruleEString ) )
            // InternalRosSystem.g:1913:4: ( ruleEString )
            {
            // InternalRosSystem.g:1913:4: ( ruleEString )
            // InternalRosSystem.g:1914:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRosServiceServerRule());
            					}
            				

            					newCompositeNode(grammarAccess.getRosServiceServerAccess().getSrvserverServiceServerCrossReference_6_0());
            				
            pushFollow(FOLLOW_27);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,31,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getRosServiceServerAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleRosServiceServer"


    // $ANTLR start "entryRuleRosServiceClient"
    // InternalRosSystem.g:1936:1: entryRuleRosServiceClient returns [EObject current=null] : iv_ruleRosServiceClient= ruleRosServiceClient EOF ;
    public final EObject entryRuleRosServiceClient() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRosServiceClient = null;


        try {
            // InternalRosSystem.g:1936:57: (iv_ruleRosServiceClient= ruleRosServiceClient EOF )
            // InternalRosSystem.g:1937:2: iv_ruleRosServiceClient= ruleRosServiceClient EOF
            {
             newCompositeNode(grammarAccess.getRosServiceClientRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRosServiceClient=ruleRosServiceClient();

            state._fsp--;

             current =iv_ruleRosServiceClient; 
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
    // $ANTLR end "entryRuleRosServiceClient"


    // $ANTLR start "ruleRosServiceClient"
    // InternalRosSystem.g:1943:1: ruleRosServiceClient returns [EObject current=null] : ( () otherlv_1= 'RosServiceClient' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefClient' ( ( ruleEString ) ) otherlv_8= '}' ) ;
    public final EObject ruleRosServiceClient() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_ns_5_0 = null;



        	enterRule();

        try {
            // InternalRosSystem.g:1949:2: ( ( () otherlv_1= 'RosServiceClient' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefClient' ( ( ruleEString ) ) otherlv_8= '}' ) )
            // InternalRosSystem.g:1950:2: ( () otherlv_1= 'RosServiceClient' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefClient' ( ( ruleEString ) ) otherlv_8= '}' )
            {
            // InternalRosSystem.g:1950:2: ( () otherlv_1= 'RosServiceClient' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefClient' ( ( ruleEString ) ) otherlv_8= '}' )
            // InternalRosSystem.g:1951:3: () otherlv_1= 'RosServiceClient' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefClient' ( ( ruleEString ) ) otherlv_8= '}'
            {
            // InternalRosSystem.g:1951:3: ()
            // InternalRosSystem.g:1952:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRosServiceClientAccess().getRosServiceClientAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,62,FOLLOW_54); 

            			newLeafNode(otherlv_1, grammarAccess.getRosServiceClientAccess().getRosServiceClientKeyword_1());
            		
            // InternalRosSystem.g:1962:3: ( (lv_name_2_0= ruleEString ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( ((LA52_0>=RULE_STRING && LA52_0<=RULE_ID)) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalRosSystem.g:1963:4: (lv_name_2_0= ruleEString )
                    {
                    // InternalRosSystem.g:1963:4: (lv_name_2_0= ruleEString )
                    // InternalRosSystem.g:1964:5: lv_name_2_0= ruleEString
                    {

                    					newCompositeNode(grammarAccess.getRosServiceClientAccess().getNameEStringParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_3);
                    lv_name_2_0=ruleEString();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getRosServiceClientRule());
                    					}
                    					set(
                    						current,
                    						"name",
                    						lv_name_2_0,
                    						"de.fraunhofer.ipa.rossystem.RosSystem.EString");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,23,FOLLOW_61); 

            			newLeafNode(otherlv_3, grammarAccess.getRosServiceClientAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalRosSystem.g:1985:3: (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==56) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalRosSystem.g:1986:4: otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,56,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getRosServiceClientAccess().getNsKeyword_4_0());
                    			
                    // InternalRosSystem.g:1990:4: ( (lv_ns_5_0= ruleEString ) )
                    // InternalRosSystem.g:1991:5: (lv_ns_5_0= ruleEString )
                    {
                    // InternalRosSystem.g:1991:5: (lv_ns_5_0= ruleEString )
                    // InternalRosSystem.g:1992:6: lv_ns_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getRosServiceClientAccess().getNsEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_62);
                    lv_ns_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRosServiceClientRule());
                    						}
                    						set(
                    							current,
                    							"ns",
                    							lv_ns_5_0,
                    							"de.fraunhofer.ipa.rossystem.RosSystem.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,63,FOLLOW_5); 

            			newLeafNode(otherlv_6, grammarAccess.getRosServiceClientAccess().getRefClientKeyword_5());
            		
            // InternalRosSystem.g:2014:3: ( ( ruleEString ) )
            // InternalRosSystem.g:2015:4: ( ruleEString )
            {
            // InternalRosSystem.g:2015:4: ( ruleEString )
            // InternalRosSystem.g:2016:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRosServiceClientRule());
            					}
            				

            					newCompositeNode(grammarAccess.getRosServiceClientAccess().getSrvclientServiceClientCrossReference_6_0());
            				
            pushFollow(FOLLOW_27);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,31,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getRosServiceClientAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleRosServiceClient"


    // $ANTLR start "entryRuleRosActionServer"
    // InternalRosSystem.g:2038:1: entryRuleRosActionServer returns [EObject current=null] : iv_ruleRosActionServer= ruleRosActionServer EOF ;
    public final EObject entryRuleRosActionServer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRosActionServer = null;


        try {
            // InternalRosSystem.g:2038:56: (iv_ruleRosActionServer= ruleRosActionServer EOF )
            // InternalRosSystem.g:2039:2: iv_ruleRosActionServer= ruleRosActionServer EOF
            {
             newCompositeNode(grammarAccess.getRosActionServerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRosActionServer=ruleRosActionServer();

            state._fsp--;

             current =iv_ruleRosActionServer; 
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
    // $ANTLR end "entryRuleRosActionServer"


    // $ANTLR start "ruleRosActionServer"
    // InternalRosSystem.g:2045:1: ruleRosActionServer returns [EObject current=null] : ( () otherlv_1= 'RosActionServer' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefServer' ( ( ruleEString ) ) otherlv_8= '}' ) ;
    public final EObject ruleRosActionServer() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_ns_5_0 = null;



        	enterRule();

        try {
            // InternalRosSystem.g:2051:2: ( ( () otherlv_1= 'RosActionServer' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefServer' ( ( ruleEString ) ) otherlv_8= '}' ) )
            // InternalRosSystem.g:2052:2: ( () otherlv_1= 'RosActionServer' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefServer' ( ( ruleEString ) ) otherlv_8= '}' )
            {
            // InternalRosSystem.g:2052:2: ( () otherlv_1= 'RosActionServer' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefServer' ( ( ruleEString ) ) otherlv_8= '}' )
            // InternalRosSystem.g:2053:3: () otherlv_1= 'RosActionServer' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefServer' ( ( ruleEString ) ) otherlv_8= '}'
            {
            // InternalRosSystem.g:2053:3: ()
            // InternalRosSystem.g:2054:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRosActionServerAccess().getRosActionServerAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,64,FOLLOW_54); 

            			newLeafNode(otherlv_1, grammarAccess.getRosActionServerAccess().getRosActionServerKeyword_1());
            		
            // InternalRosSystem.g:2064:3: ( (lv_name_2_0= ruleEString ) )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( ((LA54_0>=RULE_STRING && LA54_0<=RULE_ID)) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalRosSystem.g:2065:4: (lv_name_2_0= ruleEString )
                    {
                    // InternalRosSystem.g:2065:4: (lv_name_2_0= ruleEString )
                    // InternalRosSystem.g:2066:5: lv_name_2_0= ruleEString
                    {

                    					newCompositeNode(grammarAccess.getRosActionServerAccess().getNameEStringParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_3);
                    lv_name_2_0=ruleEString();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getRosActionServerRule());
                    					}
                    					set(
                    						current,
                    						"name",
                    						lv_name_2_0,
                    						"de.fraunhofer.ipa.rossystem.RosSystem.EString");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,23,FOLLOW_59); 

            			newLeafNode(otherlv_3, grammarAccess.getRosActionServerAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalRosSystem.g:2087:3: (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==56) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalRosSystem.g:2088:4: otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,56,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getRosActionServerAccess().getNsKeyword_4_0());
                    			
                    // InternalRosSystem.g:2092:4: ( (lv_ns_5_0= ruleEString ) )
                    // InternalRosSystem.g:2093:5: (lv_ns_5_0= ruleEString )
                    {
                    // InternalRosSystem.g:2093:5: (lv_ns_5_0= ruleEString )
                    // InternalRosSystem.g:2094:6: lv_ns_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getRosActionServerAccess().getNsEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_60);
                    lv_ns_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRosActionServerRule());
                    						}
                    						set(
                    							current,
                    							"ns",
                    							lv_ns_5_0,
                    							"de.fraunhofer.ipa.rossystem.RosSystem.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,61,FOLLOW_5); 

            			newLeafNode(otherlv_6, grammarAccess.getRosActionServerAccess().getRefServerKeyword_5());
            		
            // InternalRosSystem.g:2116:3: ( ( ruleEString ) )
            // InternalRosSystem.g:2117:4: ( ruleEString )
            {
            // InternalRosSystem.g:2117:4: ( ruleEString )
            // InternalRosSystem.g:2118:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRosActionServerRule());
            					}
            				

            					newCompositeNode(grammarAccess.getRosActionServerAccess().getActserverActionServerCrossReference_6_0());
            				
            pushFollow(FOLLOW_27);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,31,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getRosActionServerAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleRosActionServer"


    // $ANTLR start "entryRuleRosActionClient"
    // InternalRosSystem.g:2140:1: entryRuleRosActionClient returns [EObject current=null] : iv_ruleRosActionClient= ruleRosActionClient EOF ;
    public final EObject entryRuleRosActionClient() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRosActionClient = null;


        try {
            // InternalRosSystem.g:2140:56: (iv_ruleRosActionClient= ruleRosActionClient EOF )
            // InternalRosSystem.g:2141:2: iv_ruleRosActionClient= ruleRosActionClient EOF
            {
             newCompositeNode(grammarAccess.getRosActionClientRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRosActionClient=ruleRosActionClient();

            state._fsp--;

             current =iv_ruleRosActionClient; 
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
    // $ANTLR end "entryRuleRosActionClient"


    // $ANTLR start "ruleRosActionClient"
    // InternalRosSystem.g:2147:1: ruleRosActionClient returns [EObject current=null] : ( () otherlv_1= 'RosActionClient' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefClient' ( ( ruleEString ) ) otherlv_8= '}' ) ;
    public final EObject ruleRosActionClient() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_ns_5_0 = null;



        	enterRule();

        try {
            // InternalRosSystem.g:2153:2: ( ( () otherlv_1= 'RosActionClient' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefClient' ( ( ruleEString ) ) otherlv_8= '}' ) )
            // InternalRosSystem.g:2154:2: ( () otherlv_1= 'RosActionClient' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefClient' ( ( ruleEString ) ) otherlv_8= '}' )
            {
            // InternalRosSystem.g:2154:2: ( () otherlv_1= 'RosActionClient' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefClient' ( ( ruleEString ) ) otherlv_8= '}' )
            // InternalRosSystem.g:2155:3: () otherlv_1= 'RosActionClient' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefClient' ( ( ruleEString ) ) otherlv_8= '}'
            {
            // InternalRosSystem.g:2155:3: ()
            // InternalRosSystem.g:2156:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRosActionClientAccess().getRosActionClientAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,65,FOLLOW_54); 

            			newLeafNode(otherlv_1, grammarAccess.getRosActionClientAccess().getRosActionClientKeyword_1());
            		
            // InternalRosSystem.g:2166:3: ( (lv_name_2_0= ruleEString ) )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( ((LA56_0>=RULE_STRING && LA56_0<=RULE_ID)) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalRosSystem.g:2167:4: (lv_name_2_0= ruleEString )
                    {
                    // InternalRosSystem.g:2167:4: (lv_name_2_0= ruleEString )
                    // InternalRosSystem.g:2168:5: lv_name_2_0= ruleEString
                    {

                    					newCompositeNode(grammarAccess.getRosActionClientAccess().getNameEStringParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_3);
                    lv_name_2_0=ruleEString();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getRosActionClientRule());
                    					}
                    					set(
                    						current,
                    						"name",
                    						lv_name_2_0,
                    						"de.fraunhofer.ipa.rossystem.RosSystem.EString");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,23,FOLLOW_61); 

            			newLeafNode(otherlv_3, grammarAccess.getRosActionClientAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalRosSystem.g:2189:3: (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==56) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalRosSystem.g:2190:4: otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,56,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getRosActionClientAccess().getNsKeyword_4_0());
                    			
                    // InternalRosSystem.g:2194:4: ( (lv_ns_5_0= ruleEString ) )
                    // InternalRosSystem.g:2195:5: (lv_ns_5_0= ruleEString )
                    {
                    // InternalRosSystem.g:2195:5: (lv_ns_5_0= ruleEString )
                    // InternalRosSystem.g:2196:6: lv_ns_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getRosActionClientAccess().getNsEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_62);
                    lv_ns_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRosActionClientRule());
                    						}
                    						set(
                    							current,
                    							"ns",
                    							lv_ns_5_0,
                    							"de.fraunhofer.ipa.rossystem.RosSystem.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,63,FOLLOW_5); 

            			newLeafNode(otherlv_6, grammarAccess.getRosActionClientAccess().getRefClientKeyword_5());
            		
            // InternalRosSystem.g:2218:3: ( ( ruleEString ) )
            // InternalRosSystem.g:2219:4: ( ruleEString )
            {
            // InternalRosSystem.g:2219:4: ( ruleEString )
            // InternalRosSystem.g:2220:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRosActionClientRule());
            					}
            				

            					newCompositeNode(grammarAccess.getRosActionClientAccess().getActclientActionClientCrossReference_6_0());
            				
            pushFollow(FOLLOW_27);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,31,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getRosActionClientAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleRosActionClient"


    // $ANTLR start "entryRuleRosParameter"
    // InternalRosSystem.g:2242:1: entryRuleRosParameter returns [EObject current=null] : iv_ruleRosParameter= ruleRosParameter EOF ;
    public final EObject entryRuleRosParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRosParameter = null;


        try {
            // InternalRosSystem.g:2242:53: (iv_ruleRosParameter= ruleRosParameter EOF )
            // InternalRosSystem.g:2243:2: iv_ruleRosParameter= ruleRosParameter EOF
            {
             newCompositeNode(grammarAccess.getRosParameterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRosParameter=ruleRosParameter();

            state._fsp--;

             current =iv_ruleRosParameter; 
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
    // $ANTLR end "entryRuleRosParameter"


    // $ANTLR start "ruleRosParameter"
    // InternalRosSystem.g:2249:1: ruleRosParameter returns [EObject current=null] : ( () otherlv_1= 'RosParameter' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefParameter' ( ( ruleEString ) ) (otherlv_8= 'value' ( (lv_value_9_0= ruleParameterValue ) ) )? otherlv_10= '}' ) ;
    public final EObject ruleRosParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_ns_5_0 = null;

        EObject lv_value_9_0 = null;



        	enterRule();

        try {
            // InternalRosSystem.g:2255:2: ( ( () otherlv_1= 'RosParameter' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefParameter' ( ( ruleEString ) ) (otherlv_8= 'value' ( (lv_value_9_0= ruleParameterValue ) ) )? otherlv_10= '}' ) )
            // InternalRosSystem.g:2256:2: ( () otherlv_1= 'RosParameter' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefParameter' ( ( ruleEString ) ) (otherlv_8= 'value' ( (lv_value_9_0= ruleParameterValue ) ) )? otherlv_10= '}' )
            {
            // InternalRosSystem.g:2256:2: ( () otherlv_1= 'RosParameter' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefParameter' ( ( ruleEString ) ) (otherlv_8= 'value' ( (lv_value_9_0= ruleParameterValue ) ) )? otherlv_10= '}' )
            // InternalRosSystem.g:2257:3: () otherlv_1= 'RosParameter' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefParameter' ( ( ruleEString ) ) (otherlv_8= 'value' ( (lv_value_9_0= ruleParameterValue ) ) )? otherlv_10= '}'
            {
            // InternalRosSystem.g:2257:3: ()
            // InternalRosSystem.g:2258:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRosParameterAccess().getRosParameterAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,66,FOLLOW_54); 

            			newLeafNode(otherlv_1, grammarAccess.getRosParameterAccess().getRosParameterKeyword_1());
            		
            // InternalRosSystem.g:2268:3: ( (lv_name_2_0= ruleEString ) )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( ((LA58_0>=RULE_STRING && LA58_0<=RULE_ID)) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalRosSystem.g:2269:4: (lv_name_2_0= ruleEString )
                    {
                    // InternalRosSystem.g:2269:4: (lv_name_2_0= ruleEString )
                    // InternalRosSystem.g:2270:5: lv_name_2_0= ruleEString
                    {

                    					newCompositeNode(grammarAccess.getRosParameterAccess().getNameEStringParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_3);
                    lv_name_2_0=ruleEString();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getRosParameterRule());
                    					}
                    					set(
                    						current,
                    						"name",
                    						lv_name_2_0,
                    						"de.fraunhofer.ipa.rossystem.RosSystem.EString");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,23,FOLLOW_63); 

            			newLeafNode(otherlv_3, grammarAccess.getRosParameterAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalRosSystem.g:2291:3: (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==56) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalRosSystem.g:2292:4: otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,56,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getRosParameterAccess().getNsKeyword_4_0());
                    			
                    // InternalRosSystem.g:2296:4: ( (lv_ns_5_0= ruleEString ) )
                    // InternalRosSystem.g:2297:5: (lv_ns_5_0= ruleEString )
                    {
                    // InternalRosSystem.g:2297:5: (lv_ns_5_0= ruleEString )
                    // InternalRosSystem.g:2298:6: lv_ns_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getRosParameterAccess().getNsEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_64);
                    lv_ns_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRosParameterRule());
                    						}
                    						set(
                    							current,
                    							"ns",
                    							lv_ns_5_0,
                    							"de.fraunhofer.ipa.rossystem.RosSystem.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,67,FOLLOW_5); 

            			newLeafNode(otherlv_6, grammarAccess.getRosParameterAccess().getRefParameterKeyword_5());
            		
            // InternalRosSystem.g:2320:3: ( ( ruleEString ) )
            // InternalRosSystem.g:2321:4: ( ruleEString )
            {
            // InternalRosSystem.g:2321:4: ( ruleEString )
            // InternalRosSystem.g:2322:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRosParameterRule());
            					}
            				

            					newCompositeNode(grammarAccess.getRosParameterAccess().getParameterParameterCrossReference_6_0());
            				
            pushFollow(FOLLOW_65);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRosSystem.g:2336:3: (otherlv_8= 'value' ( (lv_value_9_0= ruleParameterValue ) ) )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==45) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // InternalRosSystem.g:2337:4: otherlv_8= 'value' ( (lv_value_9_0= ruleParameterValue ) )
                    {
                    otherlv_8=(Token)match(input,45,FOLLOW_38); 

                    				newLeafNode(otherlv_8, grammarAccess.getRosParameterAccess().getValueKeyword_7_0());
                    			
                    // InternalRosSystem.g:2341:4: ( (lv_value_9_0= ruleParameterValue ) )
                    // InternalRosSystem.g:2342:5: (lv_value_9_0= ruleParameterValue )
                    {
                    // InternalRosSystem.g:2342:5: (lv_value_9_0= ruleParameterValue )
                    // InternalRosSystem.g:2343:6: lv_value_9_0= ruleParameterValue
                    {

                    						newCompositeNode(grammarAccess.getRosParameterAccess().getValueParameterValueParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_27);
                    lv_value_9_0=ruleParameterValue();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRosParameterRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_9_0,
                    							"de.fraunhofer.ipa.rossystem.RosSystem.ParameterValue");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,31,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getRosParameterAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "ruleRosParameter"


    // $ANTLR start "entryRuleParameter"
    // InternalRosSystem.g:2369:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalRosSystem.g:2369:50: (iv_ruleParameter= ruleParameter EOF )
            // InternalRosSystem.g:2370:2: iv_ruleParameter= ruleParameter EOF
            {
             newCompositeNode(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameter=ruleParameter();

            state._fsp--;

             current =iv_ruleParameter; 
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
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // InternalRosSystem.g:2376:1: ruleParameter returns [EObject current=null] : (otherlv_0= 'Parameter' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'NameSpace' ( (lv_namespace_5_0= ruleNamespace ) ) )? (otherlv_6= 'type' ( (lv_type_7_0= ruleParameterType ) ) )? (otherlv_8= 'value' ( (lv_value_9_0= ruleParameterValue ) ) )? otherlv_10= '}' ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        EObject lv_namespace_5_0 = null;

        EObject lv_type_7_0 = null;

        EObject lv_value_9_0 = null;



        	enterRule();

        try {
            // InternalRosSystem.g:2382:2: ( (otherlv_0= 'Parameter' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'NameSpace' ( (lv_namespace_5_0= ruleNamespace ) ) )? (otherlv_6= 'type' ( (lv_type_7_0= ruleParameterType ) ) )? (otherlv_8= 'value' ( (lv_value_9_0= ruleParameterValue ) ) )? otherlv_10= '}' ) )
            // InternalRosSystem.g:2383:2: (otherlv_0= 'Parameter' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'NameSpace' ( (lv_namespace_5_0= ruleNamespace ) ) )? (otherlv_6= 'type' ( (lv_type_7_0= ruleParameterType ) ) )? (otherlv_8= 'value' ( (lv_value_9_0= ruleParameterValue ) ) )? otherlv_10= '}' )
            {
            // InternalRosSystem.g:2383:2: (otherlv_0= 'Parameter' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'NameSpace' ( (lv_namespace_5_0= ruleNamespace ) ) )? (otherlv_6= 'type' ( (lv_type_7_0= ruleParameterType ) ) )? (otherlv_8= 'value' ( (lv_value_9_0= ruleParameterValue ) ) )? otherlv_10= '}' )
            // InternalRosSystem.g:2384:3: otherlv_0= 'Parameter' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'NameSpace' ( (lv_namespace_5_0= ruleNamespace ) ) )? (otherlv_6= 'type' ( (lv_type_7_0= ruleParameterType ) ) )? (otherlv_8= 'value' ( (lv_value_9_0= ruleParameterValue ) ) )? otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,68,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getParameterAccess().getParameterKeyword_0());
            		
            otherlv_1=(Token)match(input,23,FOLLOW_30); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,41,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getParameterAccess().getNameKeyword_2());
            		
            // InternalRosSystem.g:2396:3: ( (lv_name_3_0= ruleEString ) )
            // InternalRosSystem.g:2397:4: (lv_name_3_0= ruleEString )
            {
            // InternalRosSystem.g:2397:4: (lv_name_3_0= ruleEString )
            // InternalRosSystem.g:2398:5: lv_name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getParameterAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_66);
            lv_name_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParameterRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_3_0,
            						"de.fraunhofer.ipa.rossystem.RosSystem.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRosSystem.g:2415:3: (otherlv_4= 'NameSpace' ( (lv_namespace_5_0= ruleNamespace ) ) )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==47) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // InternalRosSystem.g:2416:4: otherlv_4= 'NameSpace' ( (lv_namespace_5_0= ruleNamespace ) )
                    {
                    otherlv_4=(Token)match(input,47,FOLLOW_67); 

                    				newLeafNode(otherlv_4, grammarAccess.getParameterAccess().getNameSpaceKeyword_4_0());
                    			
                    // InternalRosSystem.g:2420:4: ( (lv_namespace_5_0= ruleNamespace ) )
                    // InternalRosSystem.g:2421:5: (lv_namespace_5_0= ruleNamespace )
                    {
                    // InternalRosSystem.g:2421:5: (lv_namespace_5_0= ruleNamespace )
                    // InternalRosSystem.g:2422:6: lv_namespace_5_0= ruleNamespace
                    {

                    						newCompositeNode(grammarAccess.getParameterAccess().getNamespaceNamespaceParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_68);
                    lv_namespace_5_0=ruleNamespace();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParameterRule());
                    						}
                    						set(
                    							current,
                    							"namespace",
                    							lv_namespace_5_0,
                    							"de.fraunhofer.ipa.rossystem.RosSystem.Namespace");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRosSystem.g:2440:3: (otherlv_6= 'type' ( (lv_type_7_0= ruleParameterType ) ) )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==44) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // InternalRosSystem.g:2441:4: otherlv_6= 'type' ( (lv_type_7_0= ruleParameterType ) )
                    {
                    otherlv_6=(Token)match(input,44,FOLLOW_36); 

                    				newLeafNode(otherlv_6, grammarAccess.getParameterAccess().getTypeKeyword_5_0());
                    			
                    // InternalRosSystem.g:2445:4: ( (lv_type_7_0= ruleParameterType ) )
                    // InternalRosSystem.g:2446:5: (lv_type_7_0= ruleParameterType )
                    {
                    // InternalRosSystem.g:2446:5: (lv_type_7_0= ruleParameterType )
                    // InternalRosSystem.g:2447:6: lv_type_7_0= ruleParameterType
                    {

                    						newCompositeNode(grammarAccess.getParameterAccess().getTypeParameterTypeParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_65);
                    lv_type_7_0=ruleParameterType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParameterRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_7_0,
                    							"de.fraunhofer.ipa.rossystem.RosSystem.ParameterType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRosSystem.g:2465:3: (otherlv_8= 'value' ( (lv_value_9_0= ruleParameterValue ) ) )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==45) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // InternalRosSystem.g:2466:4: otherlv_8= 'value' ( (lv_value_9_0= ruleParameterValue ) )
                    {
                    otherlv_8=(Token)match(input,45,FOLLOW_38); 

                    				newLeafNode(otherlv_8, grammarAccess.getParameterAccess().getValueKeyword_6_0());
                    			
                    // InternalRosSystem.g:2470:4: ( (lv_value_9_0= ruleParameterValue ) )
                    // InternalRosSystem.g:2471:5: (lv_value_9_0= ruleParameterValue )
                    {
                    // InternalRosSystem.g:2471:5: (lv_value_9_0= ruleParameterValue )
                    // InternalRosSystem.g:2472:6: lv_value_9_0= ruleParameterValue
                    {

                    						newCompositeNode(grammarAccess.getParameterAccess().getValueParameterValueParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_27);
                    lv_value_9_0=ruleParameterValue();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParameterRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_9_0,
                    							"de.fraunhofer.ipa.rossystem.RosSystem.ParameterValue");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,31,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getParameterAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleParameterType"
    // InternalRosSystem.g:2498:1: entryRuleParameterType returns [EObject current=null] : iv_ruleParameterType= ruleParameterType EOF ;
    public final EObject entryRuleParameterType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterType = null;


        try {
            // InternalRosSystem.g:2498:54: (iv_ruleParameterType= ruleParameterType EOF )
            // InternalRosSystem.g:2499:2: iv_ruleParameterType= ruleParameterType EOF
            {
             newCompositeNode(grammarAccess.getParameterTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameterType=ruleParameterType();

            state._fsp--;

             current =iv_ruleParameterType; 
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
    // $ANTLR end "entryRuleParameterType"


    // $ANTLR start "ruleParameterType"
    // InternalRosSystem.g:2505:1: ruleParameterType returns [EObject current=null] : (this_ParameterListType_0= ruleParameterListType | this_ParameterStructType_1= ruleParameterStructType | this_ParameterIntegerType_2= ruleParameterIntegerType | this_ParameterStringType_3= ruleParameterStringType | this_ParameterDoubleType_4= ruleParameterDoubleType | this_ParameterBooleanType_5= ruleParameterBooleanType | this_ParameterBase64Type_6= ruleParameterBase64Type | this_ParameterArrayType_7= ruleParameterArrayType ) ;
    public final EObject ruleParameterType() throws RecognitionException {
        EObject current = null;

        EObject this_ParameterListType_0 = null;

        EObject this_ParameterStructType_1 = null;

        EObject this_ParameterIntegerType_2 = null;

        EObject this_ParameterStringType_3 = null;

        EObject this_ParameterDoubleType_4 = null;

        EObject this_ParameterBooleanType_5 = null;

        EObject this_ParameterBase64Type_6 = null;

        EObject this_ParameterArrayType_7 = null;



        	enterRule();

        try {
            // InternalRosSystem.g:2511:2: ( (this_ParameterListType_0= ruleParameterListType | this_ParameterStructType_1= ruleParameterStructType | this_ParameterIntegerType_2= ruleParameterIntegerType | this_ParameterStringType_3= ruleParameterStringType | this_ParameterDoubleType_4= ruleParameterDoubleType | this_ParameterBooleanType_5= ruleParameterBooleanType | this_ParameterBase64Type_6= ruleParameterBase64Type | this_ParameterArrayType_7= ruleParameterArrayType ) )
            // InternalRosSystem.g:2512:2: (this_ParameterListType_0= ruleParameterListType | this_ParameterStructType_1= ruleParameterStructType | this_ParameterIntegerType_2= ruleParameterIntegerType | this_ParameterStringType_3= ruleParameterStringType | this_ParameterDoubleType_4= ruleParameterDoubleType | this_ParameterBooleanType_5= ruleParameterBooleanType | this_ParameterBase64Type_6= ruleParameterBase64Type | this_ParameterArrayType_7= ruleParameterArrayType )
            {
            // InternalRosSystem.g:2512:2: (this_ParameterListType_0= ruleParameterListType | this_ParameterStructType_1= ruleParameterStructType | this_ParameterIntegerType_2= ruleParameterIntegerType | this_ParameterStringType_3= ruleParameterStringType | this_ParameterDoubleType_4= ruleParameterDoubleType | this_ParameterBooleanType_5= ruleParameterBooleanType | this_ParameterBase64Type_6= ruleParameterBase64Type | this_ParameterArrayType_7= ruleParameterArrayType )
            int alt64=8;
            switch ( input.LA(1) ) {
            case 69:
                {
                alt64=1;
                }
                break;
            case 70:
                {
                alt64=2;
                }
                break;
            case 71:
                {
                alt64=3;
                }
                break;
            case 73:
                {
                alt64=4;
                }
                break;
            case 74:
                {
                alt64=5;
                }
                break;
            case 75:
                {
                alt64=6;
                }
                break;
            case 76:
                {
                alt64=7;
                }
                break;
            case 77:
                {
                alt64=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 64, 0, input);

                throw nvae;
            }

            switch (alt64) {
                case 1 :
                    // InternalRosSystem.g:2513:3: this_ParameterListType_0= ruleParameterListType
                    {

                    			newCompositeNode(grammarAccess.getParameterTypeAccess().getParameterListTypeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ParameterListType_0=ruleParameterListType();

                    state._fsp--;


                    			current = this_ParameterListType_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalRosSystem.g:2522:3: this_ParameterStructType_1= ruleParameterStructType
                    {

                    			newCompositeNode(grammarAccess.getParameterTypeAccess().getParameterStructTypeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ParameterStructType_1=ruleParameterStructType();

                    state._fsp--;


                    			current = this_ParameterStructType_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalRosSystem.g:2531:3: this_ParameterIntegerType_2= ruleParameterIntegerType
                    {

                    			newCompositeNode(grammarAccess.getParameterTypeAccess().getParameterIntegerTypeParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_ParameterIntegerType_2=ruleParameterIntegerType();

                    state._fsp--;


                    			current = this_ParameterIntegerType_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalRosSystem.g:2540:3: this_ParameterStringType_3= ruleParameterStringType
                    {

                    			newCompositeNode(grammarAccess.getParameterTypeAccess().getParameterStringTypeParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_ParameterStringType_3=ruleParameterStringType();

                    state._fsp--;


                    			current = this_ParameterStringType_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalRosSystem.g:2549:3: this_ParameterDoubleType_4= ruleParameterDoubleType
                    {

                    			newCompositeNode(grammarAccess.getParameterTypeAccess().getParameterDoubleTypeParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_ParameterDoubleType_4=ruleParameterDoubleType();

                    state._fsp--;


                    			current = this_ParameterDoubleType_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalRosSystem.g:2558:3: this_ParameterBooleanType_5= ruleParameterBooleanType
                    {

                    			newCompositeNode(grammarAccess.getParameterTypeAccess().getParameterBooleanTypeParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_ParameterBooleanType_5=ruleParameterBooleanType();

                    state._fsp--;


                    			current = this_ParameterBooleanType_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalRosSystem.g:2567:3: this_ParameterBase64Type_6= ruleParameterBase64Type
                    {

                    			newCompositeNode(grammarAccess.getParameterTypeAccess().getParameterBase64TypeParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_ParameterBase64Type_6=ruleParameterBase64Type();

                    state._fsp--;


                    			current = this_ParameterBase64Type_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalRosSystem.g:2576:3: this_ParameterArrayType_7= ruleParameterArrayType
                    {

                    			newCompositeNode(grammarAccess.getParameterTypeAccess().getParameterArrayTypeParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_ParameterArrayType_7=ruleParameterArrayType();

                    state._fsp--;


                    			current = this_ParameterArrayType_7;
                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "ruleParameterType"


    // $ANTLR start "entryRuleParameterValue"
    // InternalRosSystem.g:2588:1: entryRuleParameterValue returns [EObject current=null] : iv_ruleParameterValue= ruleParameterValue EOF ;
    public final EObject entryRuleParameterValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterValue = null;


        try {
            // InternalRosSystem.g:2588:55: (iv_ruleParameterValue= ruleParameterValue EOF )
            // InternalRosSystem.g:2589:2: iv_ruleParameterValue= ruleParameterValue EOF
            {
             newCompositeNode(grammarAccess.getParameterValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameterValue=ruleParameterValue();

            state._fsp--;

             current =iv_ruleParameterValue; 
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
    // $ANTLR end "entryRuleParameterValue"


    // $ANTLR start "ruleParameterValue"
    // InternalRosSystem.g:2595:1: ruleParameterValue returns [EObject current=null] : (this_ParameterString_0= ruleParameterString | this_ParameterBase64_1= ruleParameterBase64 | this_ParameterInteger_2= ruleParameterInteger | this_ParameterDouble_3= ruleParameterDouble | this_ParameterBoolean_4= ruleParameterBoolean | this_ParameterList_5= ruleParameterList | this_ParameterStruct_6= ruleParameterStruct ) ;
    public final EObject ruleParameterValue() throws RecognitionException {
        EObject current = null;

        EObject this_ParameterString_0 = null;

        EObject this_ParameterBase64_1 = null;

        EObject this_ParameterInteger_2 = null;

        EObject this_ParameterDouble_3 = null;

        EObject this_ParameterBoolean_4 = null;

        EObject this_ParameterList_5 = null;

        EObject this_ParameterStruct_6 = null;



        	enterRule();

        try {
            // InternalRosSystem.g:2601:2: ( (this_ParameterString_0= ruleParameterString | this_ParameterBase64_1= ruleParameterBase64 | this_ParameterInteger_2= ruleParameterInteger | this_ParameterDouble_3= ruleParameterDouble | this_ParameterBoolean_4= ruleParameterBoolean | this_ParameterList_5= ruleParameterList | this_ParameterStruct_6= ruleParameterStruct ) )
            // InternalRosSystem.g:2602:2: (this_ParameterString_0= ruleParameterString | this_ParameterBase64_1= ruleParameterBase64 | this_ParameterInteger_2= ruleParameterInteger | this_ParameterDouble_3= ruleParameterDouble | this_ParameterBoolean_4= ruleParameterBoolean | this_ParameterList_5= ruleParameterList | this_ParameterStruct_6= ruleParameterStruct )
            {
            // InternalRosSystem.g:2602:2: (this_ParameterString_0= ruleParameterString | this_ParameterBase64_1= ruleParameterBase64 | this_ParameterInteger_2= ruleParameterInteger | this_ParameterDouble_3= ruleParameterDouble | this_ParameterBoolean_4= ruleParameterBoolean | this_ParameterList_5= ruleParameterList | this_ParameterStruct_6= ruleParameterStruct )
            int alt65=7;
            alt65 = dfa65.predict(input);
            switch (alt65) {
                case 1 :
                    // InternalRosSystem.g:2603:3: this_ParameterString_0= ruleParameterString
                    {

                    			newCompositeNode(grammarAccess.getParameterValueAccess().getParameterStringParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ParameterString_0=ruleParameterString();

                    state._fsp--;


                    			current = this_ParameterString_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalRosSystem.g:2612:3: this_ParameterBase64_1= ruleParameterBase64
                    {

                    			newCompositeNode(grammarAccess.getParameterValueAccess().getParameterBase64ParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ParameterBase64_1=ruleParameterBase64();

                    state._fsp--;


                    			current = this_ParameterBase64_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalRosSystem.g:2621:3: this_ParameterInteger_2= ruleParameterInteger
                    {

                    			newCompositeNode(grammarAccess.getParameterValueAccess().getParameterIntegerParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_ParameterInteger_2=ruleParameterInteger();

                    state._fsp--;


                    			current = this_ParameterInteger_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalRosSystem.g:2630:3: this_ParameterDouble_3= ruleParameterDouble
                    {

                    			newCompositeNode(grammarAccess.getParameterValueAccess().getParameterDoubleParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_ParameterDouble_3=ruleParameterDouble();

                    state._fsp--;


                    			current = this_ParameterDouble_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalRosSystem.g:2639:3: this_ParameterBoolean_4= ruleParameterBoolean
                    {

                    			newCompositeNode(grammarAccess.getParameterValueAccess().getParameterBooleanParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_ParameterBoolean_4=ruleParameterBoolean();

                    state._fsp--;


                    			current = this_ParameterBoolean_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalRosSystem.g:2648:3: this_ParameterList_5= ruleParameterList
                    {

                    			newCompositeNode(grammarAccess.getParameterValueAccess().getParameterListParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_ParameterList_5=ruleParameterList();

                    state._fsp--;


                    			current = this_ParameterList_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalRosSystem.g:2657:3: this_ParameterStruct_6= ruleParameterStruct
                    {

                    			newCompositeNode(grammarAccess.getParameterValueAccess().getParameterStructParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_ParameterStruct_6=ruleParameterStruct();

                    state._fsp--;


                    			current = this_ParameterStruct_6;
                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "ruleParameterValue"


    // $ANTLR start "entryRuleParameterListType"
    // InternalRosSystem.g:2669:1: entryRuleParameterListType returns [EObject current=null] : iv_ruleParameterListType= ruleParameterListType EOF ;
    public final EObject entryRuleParameterListType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterListType = null;


        try {
            // InternalRosSystem.g:2669:58: (iv_ruleParameterListType= ruleParameterListType EOF )
            // InternalRosSystem.g:2670:2: iv_ruleParameterListType= ruleParameterListType EOF
            {
             newCompositeNode(grammarAccess.getParameterListTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameterListType=ruleParameterListType();

            state._fsp--;

             current =iv_ruleParameterListType; 
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
    // $ANTLR end "entryRuleParameterListType"


    // $ANTLR start "ruleParameterListType"
    // InternalRosSystem.g:2676:1: ruleParameterListType returns [EObject current=null] : ( () otherlv_1= 'List' otherlv_2= '{' ( (lv_sequence_3_0= ruleParameterType ) ) (otherlv_4= ',' ( (lv_sequence_5_0= ruleParameterType ) ) )* otherlv_6= '}' ) ;
    public final EObject ruleParameterListType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_sequence_3_0 = null;

        EObject lv_sequence_5_0 = null;



        	enterRule();

        try {
            // InternalRosSystem.g:2682:2: ( ( () otherlv_1= 'List' otherlv_2= '{' ( (lv_sequence_3_0= ruleParameterType ) ) (otherlv_4= ',' ( (lv_sequence_5_0= ruleParameterType ) ) )* otherlv_6= '}' ) )
            // InternalRosSystem.g:2683:2: ( () otherlv_1= 'List' otherlv_2= '{' ( (lv_sequence_3_0= ruleParameterType ) ) (otherlv_4= ',' ( (lv_sequence_5_0= ruleParameterType ) ) )* otherlv_6= '}' )
            {
            // InternalRosSystem.g:2683:2: ( () otherlv_1= 'List' otherlv_2= '{' ( (lv_sequence_3_0= ruleParameterType ) ) (otherlv_4= ',' ( (lv_sequence_5_0= ruleParameterType ) ) )* otherlv_6= '}' )
            // InternalRosSystem.g:2684:3: () otherlv_1= 'List' otherlv_2= '{' ( (lv_sequence_3_0= ruleParameterType ) ) (otherlv_4= ',' ( (lv_sequence_5_0= ruleParameterType ) ) )* otherlv_6= '}'
            {
            // InternalRosSystem.g:2684:3: ()
            // InternalRosSystem.g:2685:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterListTypeAccess().getParameterListTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,69,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterListTypeAccess().getListKeyword_1());
            		
            otherlv_2=(Token)match(input,23,FOLLOW_36); 

            			newLeafNode(otherlv_2, grammarAccess.getParameterListTypeAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalRosSystem.g:2699:3: ( (lv_sequence_3_0= ruleParameterType ) )
            // InternalRosSystem.g:2700:4: (lv_sequence_3_0= ruleParameterType )
            {
            // InternalRosSystem.g:2700:4: (lv_sequence_3_0= ruleParameterType )
            // InternalRosSystem.g:2701:5: lv_sequence_3_0= ruleParameterType
            {

            					newCompositeNode(grammarAccess.getParameterListTypeAccess().getSequenceParameterTypeParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_16);
            lv_sequence_3_0=ruleParameterType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParameterListTypeRule());
            					}
            					add(
            						current,
            						"sequence",
            						lv_sequence_3_0,
            						"de.fraunhofer.ipa.rossystem.RosSystem.ParameterType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRosSystem.g:2718:3: (otherlv_4= ',' ( (lv_sequence_5_0= ruleParameterType ) ) )*
            loop66:
            do {
                int alt66=2;
                int LA66_0 = input.LA(1);

                if ( (LA66_0==27) ) {
                    alt66=1;
                }


                switch (alt66) {
            	case 1 :
            	    // InternalRosSystem.g:2719:4: otherlv_4= ',' ( (lv_sequence_5_0= ruleParameterType ) )
            	    {
            	    otherlv_4=(Token)match(input,27,FOLLOW_36); 

            	    				newLeafNode(otherlv_4, grammarAccess.getParameterListTypeAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalRosSystem.g:2723:4: ( (lv_sequence_5_0= ruleParameterType ) )
            	    // InternalRosSystem.g:2724:5: (lv_sequence_5_0= ruleParameterType )
            	    {
            	    // InternalRosSystem.g:2724:5: (lv_sequence_5_0= ruleParameterType )
            	    // InternalRosSystem.g:2725:6: lv_sequence_5_0= ruleParameterType
            	    {

            	    						newCompositeNode(grammarAccess.getParameterListTypeAccess().getSequenceParameterTypeParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_16);
            	    lv_sequence_5_0=ruleParameterType();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getParameterListTypeRule());
            	    						}
            	    						add(
            	    							current,
            	    							"sequence",
            	    							lv_sequence_5_0,
            	    							"de.fraunhofer.ipa.rossystem.RosSystem.ParameterType");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop66;
                }
            } while (true);

            otherlv_6=(Token)match(input,31,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getParameterListTypeAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleParameterListType"


    // $ANTLR start "entryRuleParameterStructType"
    // InternalRosSystem.g:2751:1: entryRuleParameterStructType returns [EObject current=null] : iv_ruleParameterStructType= ruleParameterStructType EOF ;
    public final EObject entryRuleParameterStructType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterStructType = null;


        try {
            // InternalRosSystem.g:2751:60: (iv_ruleParameterStructType= ruleParameterStructType EOF )
            // InternalRosSystem.g:2752:2: iv_ruleParameterStructType= ruleParameterStructType EOF
            {
             newCompositeNode(grammarAccess.getParameterStructTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameterStructType=ruleParameterStructType();

            state._fsp--;

             current =iv_ruleParameterStructType; 
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
    // $ANTLR end "entryRuleParameterStructType"


    // $ANTLR start "ruleParameterStructType"
    // InternalRosSystem.g:2758:1: ruleParameterStructType returns [EObject current=null] : ( () otherlv_1= 'Struc' otherlv_2= '{' ( (lv_parameterstructypetmember_3_0= ruleParameterStructTypeMember ) ) (otherlv_4= ',' ( (lv_parameterstructypetmember_5_0= ruleParameterStructTypeMember ) ) )* otherlv_6= '}' ) ;
    public final EObject ruleParameterStructType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_parameterstructypetmember_3_0 = null;

        EObject lv_parameterstructypetmember_5_0 = null;



        	enterRule();

        try {
            // InternalRosSystem.g:2764:2: ( ( () otherlv_1= 'Struc' otherlv_2= '{' ( (lv_parameterstructypetmember_3_0= ruleParameterStructTypeMember ) ) (otherlv_4= ',' ( (lv_parameterstructypetmember_5_0= ruleParameterStructTypeMember ) ) )* otherlv_6= '}' ) )
            // InternalRosSystem.g:2765:2: ( () otherlv_1= 'Struc' otherlv_2= '{' ( (lv_parameterstructypetmember_3_0= ruleParameterStructTypeMember ) ) (otherlv_4= ',' ( (lv_parameterstructypetmember_5_0= ruleParameterStructTypeMember ) ) )* otherlv_6= '}' )
            {
            // InternalRosSystem.g:2765:2: ( () otherlv_1= 'Struc' otherlv_2= '{' ( (lv_parameterstructypetmember_3_0= ruleParameterStructTypeMember ) ) (otherlv_4= ',' ( (lv_parameterstructypetmember_5_0= ruleParameterStructTypeMember ) ) )* otherlv_6= '}' )
            // InternalRosSystem.g:2766:3: () otherlv_1= 'Struc' otherlv_2= '{' ( (lv_parameterstructypetmember_3_0= ruleParameterStructTypeMember ) ) (otherlv_4= ',' ( (lv_parameterstructypetmember_5_0= ruleParameterStructTypeMember ) ) )* otherlv_6= '}'
            {
            // InternalRosSystem.g:2766:3: ()
            // InternalRosSystem.g:2767:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterStructTypeAccess().getParameterStructTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,70,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterStructTypeAccess().getStrucKeyword_1());
            		
            otherlv_2=(Token)match(input,23,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getParameterStructTypeAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalRosSystem.g:2781:3: ( (lv_parameterstructypetmember_3_0= ruleParameterStructTypeMember ) )
            // InternalRosSystem.g:2782:4: (lv_parameterstructypetmember_3_0= ruleParameterStructTypeMember )
            {
            // InternalRosSystem.g:2782:4: (lv_parameterstructypetmember_3_0= ruleParameterStructTypeMember )
            // InternalRosSystem.g:2783:5: lv_parameterstructypetmember_3_0= ruleParameterStructTypeMember
            {

            					newCompositeNode(grammarAccess.getParameterStructTypeAccess().getParameterstructypetmemberParameterStructTypeMemberParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_16);
            lv_parameterstructypetmember_3_0=ruleParameterStructTypeMember();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParameterStructTypeRule());
            					}
            					add(
            						current,
            						"parameterstructypetmember",
            						lv_parameterstructypetmember_3_0,
            						"de.fraunhofer.ipa.rossystem.RosSystem.ParameterStructTypeMember");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRosSystem.g:2800:3: (otherlv_4= ',' ( (lv_parameterstructypetmember_5_0= ruleParameterStructTypeMember ) ) )*
            loop67:
            do {
                int alt67=2;
                int LA67_0 = input.LA(1);

                if ( (LA67_0==27) ) {
                    alt67=1;
                }


                switch (alt67) {
            	case 1 :
            	    // InternalRosSystem.g:2801:4: otherlv_4= ',' ( (lv_parameterstructypetmember_5_0= ruleParameterStructTypeMember ) )
            	    {
            	    otherlv_4=(Token)match(input,27,FOLLOW_5); 

            	    				newLeafNode(otherlv_4, grammarAccess.getParameterStructTypeAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalRosSystem.g:2805:4: ( (lv_parameterstructypetmember_5_0= ruleParameterStructTypeMember ) )
            	    // InternalRosSystem.g:2806:5: (lv_parameterstructypetmember_5_0= ruleParameterStructTypeMember )
            	    {
            	    // InternalRosSystem.g:2806:5: (lv_parameterstructypetmember_5_0= ruleParameterStructTypeMember )
            	    // InternalRosSystem.g:2807:6: lv_parameterstructypetmember_5_0= ruleParameterStructTypeMember
            	    {

            	    						newCompositeNode(grammarAccess.getParameterStructTypeAccess().getParameterstructypetmemberParameterStructTypeMemberParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_16);
            	    lv_parameterstructypetmember_5_0=ruleParameterStructTypeMember();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getParameterStructTypeRule());
            	    						}
            	    						add(
            	    							current,
            	    							"parameterstructypetmember",
            	    							lv_parameterstructypetmember_5_0,
            	    							"de.fraunhofer.ipa.rossystem.RosSystem.ParameterStructTypeMember");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop67;
                }
            } while (true);

            otherlv_6=(Token)match(input,31,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getParameterStructTypeAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleParameterStructType"


    // $ANTLR start "entryRuleParameterIntegerType"
    // InternalRosSystem.g:2833:1: entryRuleParameterIntegerType returns [EObject current=null] : iv_ruleParameterIntegerType= ruleParameterIntegerType EOF ;
    public final EObject entryRuleParameterIntegerType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterIntegerType = null;


        try {
            // InternalRosSystem.g:2833:61: (iv_ruleParameterIntegerType= ruleParameterIntegerType EOF )
            // InternalRosSystem.g:2834:2: iv_ruleParameterIntegerType= ruleParameterIntegerType EOF
            {
             newCompositeNode(grammarAccess.getParameterIntegerTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameterIntegerType=ruleParameterIntegerType();

            state._fsp--;

             current =iv_ruleParameterIntegerType; 
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
    // $ANTLR end "entryRuleParameterIntegerType"


    // $ANTLR start "ruleParameterIntegerType"
    // InternalRosSystem.g:2840:1: ruleParameterIntegerType returns [EObject current=null] : ( () otherlv_1= 'Integer' (otherlv_2= '{' otherlv_3= 'default' ( (lv_default_4_0= ruleParameterInteger ) ) otherlv_5= '}' )? ) ;
    public final EObject ruleParameterIntegerType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_default_4_0 = null;



        	enterRule();

        try {
            // InternalRosSystem.g:2846:2: ( ( () otherlv_1= 'Integer' (otherlv_2= '{' otherlv_3= 'default' ( (lv_default_4_0= ruleParameterInteger ) ) otherlv_5= '}' )? ) )
            // InternalRosSystem.g:2847:2: ( () otherlv_1= 'Integer' (otherlv_2= '{' otherlv_3= 'default' ( (lv_default_4_0= ruleParameterInteger ) ) otherlv_5= '}' )? )
            {
            // InternalRosSystem.g:2847:2: ( () otherlv_1= 'Integer' (otherlv_2= '{' otherlv_3= 'default' ( (lv_default_4_0= ruleParameterInteger ) ) otherlv_5= '}' )? )
            // InternalRosSystem.g:2848:3: () otherlv_1= 'Integer' (otherlv_2= '{' otherlv_3= 'default' ( (lv_default_4_0= ruleParameterInteger ) ) otherlv_5= '}' )?
            {
            // InternalRosSystem.g:2848:3: ()
            // InternalRosSystem.g:2849:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterIntegerTypeAccess().getParameterIntegerTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,71,FOLLOW_69); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterIntegerTypeAccess().getIntegerKeyword_1());
            		
            // InternalRosSystem.g:2859:3: (otherlv_2= '{' otherlv_3= 'default' ( (lv_default_4_0= ruleParameterInteger ) ) otherlv_5= '}' )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==23) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // InternalRosSystem.g:2860:4: otherlv_2= '{' otherlv_3= 'default' ( (lv_default_4_0= ruleParameterInteger ) ) otherlv_5= '}'
                    {
                    otherlv_2=(Token)match(input,23,FOLLOW_70); 

                    				newLeafNode(otherlv_2, grammarAccess.getParameterIntegerTypeAccess().getLeftCurlyBracketKeyword_2_0());
                    			
                    otherlv_3=(Token)match(input,72,FOLLOW_71); 

                    				newLeafNode(otherlv_3, grammarAccess.getParameterIntegerTypeAccess().getDefaultKeyword_2_1());
                    			
                    // InternalRosSystem.g:2868:4: ( (lv_default_4_0= ruleParameterInteger ) )
                    // InternalRosSystem.g:2869:5: (lv_default_4_0= ruleParameterInteger )
                    {
                    // InternalRosSystem.g:2869:5: (lv_default_4_0= ruleParameterInteger )
                    // InternalRosSystem.g:2870:6: lv_default_4_0= ruleParameterInteger
                    {

                    						newCompositeNode(grammarAccess.getParameterIntegerTypeAccess().getDefaultParameterIntegerParserRuleCall_2_2_0());
                    					
                    pushFollow(FOLLOW_27);
                    lv_default_4_0=ruleParameterInteger();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParameterIntegerTypeRule());
                    						}
                    						set(
                    							current,
                    							"default",
                    							lv_default_4_0,
                    							"de.fraunhofer.ipa.rossystem.RosSystem.ParameterInteger");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_5=(Token)match(input,31,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getParameterIntegerTypeAccess().getRightCurlyBracketKeyword_2_3());
                    			

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
    // $ANTLR end "ruleParameterIntegerType"


    // $ANTLR start "entryRuleParameterStringType"
    // InternalRosSystem.g:2896:1: entryRuleParameterStringType returns [EObject current=null] : iv_ruleParameterStringType= ruleParameterStringType EOF ;
    public final EObject entryRuleParameterStringType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterStringType = null;


        try {
            // InternalRosSystem.g:2896:60: (iv_ruleParameterStringType= ruleParameterStringType EOF )
            // InternalRosSystem.g:2897:2: iv_ruleParameterStringType= ruleParameterStringType EOF
            {
             newCompositeNode(grammarAccess.getParameterStringTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameterStringType=ruleParameterStringType();

            state._fsp--;

             current =iv_ruleParameterStringType; 
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
    // $ANTLR end "entryRuleParameterStringType"


    // $ANTLR start "ruleParameterStringType"
    // InternalRosSystem.g:2903:1: ruleParameterStringType returns [EObject current=null] : ( () otherlv_1= 'String' (otherlv_2= '{' otherlv_3= 'default' ( (lv_default_4_0= ruleParameterString ) ) otherlv_5= '}' )? ) ;
    public final EObject ruleParameterStringType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_default_4_0 = null;



        	enterRule();

        try {
            // InternalRosSystem.g:2909:2: ( ( () otherlv_1= 'String' (otherlv_2= '{' otherlv_3= 'default' ( (lv_default_4_0= ruleParameterString ) ) otherlv_5= '}' )? ) )
            // InternalRosSystem.g:2910:2: ( () otherlv_1= 'String' (otherlv_2= '{' otherlv_3= 'default' ( (lv_default_4_0= ruleParameterString ) ) otherlv_5= '}' )? )
            {
            // InternalRosSystem.g:2910:2: ( () otherlv_1= 'String' (otherlv_2= '{' otherlv_3= 'default' ( (lv_default_4_0= ruleParameterString ) ) otherlv_5= '}' )? )
            // InternalRosSystem.g:2911:3: () otherlv_1= 'String' (otherlv_2= '{' otherlv_3= 'default' ( (lv_default_4_0= ruleParameterString ) ) otherlv_5= '}' )?
            {
            // InternalRosSystem.g:2911:3: ()
            // InternalRosSystem.g:2912:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterStringTypeAccess().getParameterStringTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,73,FOLLOW_69); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterStringTypeAccess().getStringKeyword_1());
            		
            // InternalRosSystem.g:2922:3: (otherlv_2= '{' otherlv_3= 'default' ( (lv_default_4_0= ruleParameterString ) ) otherlv_5= '}' )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==23) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // InternalRosSystem.g:2923:4: otherlv_2= '{' otherlv_3= 'default' ( (lv_default_4_0= ruleParameterString ) ) otherlv_5= '}'
                    {
                    otherlv_2=(Token)match(input,23,FOLLOW_70); 

                    				newLeafNode(otherlv_2, grammarAccess.getParameterStringTypeAccess().getLeftCurlyBracketKeyword_2_0());
                    			
                    otherlv_3=(Token)match(input,72,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getParameterStringTypeAccess().getDefaultKeyword_2_1());
                    			
                    // InternalRosSystem.g:2931:4: ( (lv_default_4_0= ruleParameterString ) )
                    // InternalRosSystem.g:2932:5: (lv_default_4_0= ruleParameterString )
                    {
                    // InternalRosSystem.g:2932:5: (lv_default_4_0= ruleParameterString )
                    // InternalRosSystem.g:2933:6: lv_default_4_0= ruleParameterString
                    {

                    						newCompositeNode(grammarAccess.getParameterStringTypeAccess().getDefaultParameterStringParserRuleCall_2_2_0());
                    					
                    pushFollow(FOLLOW_27);
                    lv_default_4_0=ruleParameterString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParameterStringTypeRule());
                    						}
                    						set(
                    							current,
                    							"default",
                    							lv_default_4_0,
                    							"de.fraunhofer.ipa.rossystem.RosSystem.ParameterString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_5=(Token)match(input,31,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getParameterStringTypeAccess().getRightCurlyBracketKeyword_2_3());
                    			

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
    // $ANTLR end "ruleParameterStringType"


    // $ANTLR start "entryRuleParameterDoubleType"
    // InternalRosSystem.g:2959:1: entryRuleParameterDoubleType returns [EObject current=null] : iv_ruleParameterDoubleType= ruleParameterDoubleType EOF ;
    public final EObject entryRuleParameterDoubleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterDoubleType = null;


        try {
            // InternalRosSystem.g:2959:60: (iv_ruleParameterDoubleType= ruleParameterDoubleType EOF )
            // InternalRosSystem.g:2960:2: iv_ruleParameterDoubleType= ruleParameterDoubleType EOF
            {
             newCompositeNode(grammarAccess.getParameterDoubleTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameterDoubleType=ruleParameterDoubleType();

            state._fsp--;

             current =iv_ruleParameterDoubleType; 
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
    // $ANTLR end "entryRuleParameterDoubleType"


    // $ANTLR start "ruleParameterDoubleType"
    // InternalRosSystem.g:2966:1: ruleParameterDoubleType returns [EObject current=null] : ( () otherlv_1= 'Double' (otherlv_2= '{' otherlv_3= 'default' ( (lv_default_4_0= ruleParameterDouble ) ) otherlv_5= '}' )? ) ;
    public final EObject ruleParameterDoubleType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_default_4_0 = null;



        	enterRule();

        try {
            // InternalRosSystem.g:2972:2: ( ( () otherlv_1= 'Double' (otherlv_2= '{' otherlv_3= 'default' ( (lv_default_4_0= ruleParameterDouble ) ) otherlv_5= '}' )? ) )
            // InternalRosSystem.g:2973:2: ( () otherlv_1= 'Double' (otherlv_2= '{' otherlv_3= 'default' ( (lv_default_4_0= ruleParameterDouble ) ) otherlv_5= '}' )? )
            {
            // InternalRosSystem.g:2973:2: ( () otherlv_1= 'Double' (otherlv_2= '{' otherlv_3= 'default' ( (lv_default_4_0= ruleParameterDouble ) ) otherlv_5= '}' )? )
            // InternalRosSystem.g:2974:3: () otherlv_1= 'Double' (otherlv_2= '{' otherlv_3= 'default' ( (lv_default_4_0= ruleParameterDouble ) ) otherlv_5= '}' )?
            {
            // InternalRosSystem.g:2974:3: ()
            // InternalRosSystem.g:2975:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterDoubleTypeAccess().getParameterDoubleTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,74,FOLLOW_69); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterDoubleTypeAccess().getDoubleKeyword_1());
            		
            // InternalRosSystem.g:2985:3: (otherlv_2= '{' otherlv_3= 'default' ( (lv_default_4_0= ruleParameterDouble ) ) otherlv_5= '}' )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==23) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // InternalRosSystem.g:2986:4: otherlv_2= '{' otherlv_3= 'default' ( (lv_default_4_0= ruleParameterDouble ) ) otherlv_5= '}'
                    {
                    otherlv_2=(Token)match(input,23,FOLLOW_70); 

                    				newLeafNode(otherlv_2, grammarAccess.getParameterDoubleTypeAccess().getLeftCurlyBracketKeyword_2_0());
                    			
                    otherlv_3=(Token)match(input,72,FOLLOW_72); 

                    				newLeafNode(otherlv_3, grammarAccess.getParameterDoubleTypeAccess().getDefaultKeyword_2_1());
                    			
                    // InternalRosSystem.g:2994:4: ( (lv_default_4_0= ruleParameterDouble ) )
                    // InternalRosSystem.g:2995:5: (lv_default_4_0= ruleParameterDouble )
                    {
                    // InternalRosSystem.g:2995:5: (lv_default_4_0= ruleParameterDouble )
                    // InternalRosSystem.g:2996:6: lv_default_4_0= ruleParameterDouble
                    {

                    						newCompositeNode(grammarAccess.getParameterDoubleTypeAccess().getDefaultParameterDoubleParserRuleCall_2_2_0());
                    					
                    pushFollow(FOLLOW_27);
                    lv_default_4_0=ruleParameterDouble();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParameterDoubleTypeRule());
                    						}
                    						set(
                    							current,
                    							"default",
                    							lv_default_4_0,
                    							"de.fraunhofer.ipa.rossystem.RosSystem.ParameterDouble");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_5=(Token)match(input,31,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getParameterDoubleTypeAccess().getRightCurlyBracketKeyword_2_3());
                    			

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
    // $ANTLR end "ruleParameterDoubleType"


    // $ANTLR start "entryRuleParameterBooleanType"
    // InternalRosSystem.g:3022:1: entryRuleParameterBooleanType returns [EObject current=null] : iv_ruleParameterBooleanType= ruleParameterBooleanType EOF ;
    public final EObject entryRuleParameterBooleanType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterBooleanType = null;


        try {
            // InternalRosSystem.g:3022:61: (iv_ruleParameterBooleanType= ruleParameterBooleanType EOF )
            // InternalRosSystem.g:3023:2: iv_ruleParameterBooleanType= ruleParameterBooleanType EOF
            {
             newCompositeNode(grammarAccess.getParameterBooleanTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameterBooleanType=ruleParameterBooleanType();

            state._fsp--;

             current =iv_ruleParameterBooleanType; 
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
    // $ANTLR end "entryRuleParameterBooleanType"


    // $ANTLR start "ruleParameterBooleanType"
    // InternalRosSystem.g:3029:1: ruleParameterBooleanType returns [EObject current=null] : ( () otherlv_1= 'Boolean' (otherlv_2= '{' otherlv_3= 'default' ( (lv_default_4_0= ruleParameterBoolean ) ) otherlv_5= '}' )? ) ;
    public final EObject ruleParameterBooleanType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_default_4_0 = null;



        	enterRule();

        try {
            // InternalRosSystem.g:3035:2: ( ( () otherlv_1= 'Boolean' (otherlv_2= '{' otherlv_3= 'default' ( (lv_default_4_0= ruleParameterBoolean ) ) otherlv_5= '}' )? ) )
            // InternalRosSystem.g:3036:2: ( () otherlv_1= 'Boolean' (otherlv_2= '{' otherlv_3= 'default' ( (lv_default_4_0= ruleParameterBoolean ) ) otherlv_5= '}' )? )
            {
            // InternalRosSystem.g:3036:2: ( () otherlv_1= 'Boolean' (otherlv_2= '{' otherlv_3= 'default' ( (lv_default_4_0= ruleParameterBoolean ) ) otherlv_5= '}' )? )
            // InternalRosSystem.g:3037:3: () otherlv_1= 'Boolean' (otherlv_2= '{' otherlv_3= 'default' ( (lv_default_4_0= ruleParameterBoolean ) ) otherlv_5= '}' )?
            {
            // InternalRosSystem.g:3037:3: ()
            // InternalRosSystem.g:3038:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterBooleanTypeAccess().getParameterBooleanTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,75,FOLLOW_69); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterBooleanTypeAccess().getBooleanKeyword_1());
            		
            // InternalRosSystem.g:3048:3: (otherlv_2= '{' otherlv_3= 'default' ( (lv_default_4_0= ruleParameterBoolean ) ) otherlv_5= '}' )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==23) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // InternalRosSystem.g:3049:4: otherlv_2= '{' otherlv_3= 'default' ( (lv_default_4_0= ruleParameterBoolean ) ) otherlv_5= '}'
                    {
                    otherlv_2=(Token)match(input,23,FOLLOW_70); 

                    				newLeafNode(otherlv_2, grammarAccess.getParameterBooleanTypeAccess().getLeftCurlyBracketKeyword_2_0());
                    			
                    otherlv_3=(Token)match(input,72,FOLLOW_73); 

                    				newLeafNode(otherlv_3, grammarAccess.getParameterBooleanTypeAccess().getDefaultKeyword_2_1());
                    			
                    // InternalRosSystem.g:3057:4: ( (lv_default_4_0= ruleParameterBoolean ) )
                    // InternalRosSystem.g:3058:5: (lv_default_4_0= ruleParameterBoolean )
                    {
                    // InternalRosSystem.g:3058:5: (lv_default_4_0= ruleParameterBoolean )
                    // InternalRosSystem.g:3059:6: lv_default_4_0= ruleParameterBoolean
                    {

                    						newCompositeNode(grammarAccess.getParameterBooleanTypeAccess().getDefaultParameterBooleanParserRuleCall_2_2_0());
                    					
                    pushFollow(FOLLOW_27);
                    lv_default_4_0=ruleParameterBoolean();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParameterBooleanTypeRule());
                    						}
                    						set(
                    							current,
                    							"default",
                    							lv_default_4_0,
                    							"de.fraunhofer.ipa.rossystem.RosSystem.ParameterBoolean");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_5=(Token)match(input,31,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getParameterBooleanTypeAccess().getRightCurlyBracketKeyword_2_3());
                    			

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
    // $ANTLR end "ruleParameterBooleanType"


    // $ANTLR start "entryRuleParameterBase64Type"
    // InternalRosSystem.g:3085:1: entryRuleParameterBase64Type returns [EObject current=null] : iv_ruleParameterBase64Type= ruleParameterBase64Type EOF ;
    public final EObject entryRuleParameterBase64Type() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterBase64Type = null;


        try {
            // InternalRosSystem.g:3085:60: (iv_ruleParameterBase64Type= ruleParameterBase64Type EOF )
            // InternalRosSystem.g:3086:2: iv_ruleParameterBase64Type= ruleParameterBase64Type EOF
            {
             newCompositeNode(grammarAccess.getParameterBase64TypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameterBase64Type=ruleParameterBase64Type();

            state._fsp--;

             current =iv_ruleParameterBase64Type; 
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
    // $ANTLR end "entryRuleParameterBase64Type"


    // $ANTLR start "ruleParameterBase64Type"
    // InternalRosSystem.g:3092:1: ruleParameterBase64Type returns [EObject current=null] : ( () otherlv_1= 'Base64' (otherlv_2= '{' otherlv_3= 'default' ( (lv_default_4_0= ruleParameterBase64 ) ) otherlv_5= '}' )? ) ;
    public final EObject ruleParameterBase64Type() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_default_4_0 = null;



        	enterRule();

        try {
            // InternalRosSystem.g:3098:2: ( ( () otherlv_1= 'Base64' (otherlv_2= '{' otherlv_3= 'default' ( (lv_default_4_0= ruleParameterBase64 ) ) otherlv_5= '}' )? ) )
            // InternalRosSystem.g:3099:2: ( () otherlv_1= 'Base64' (otherlv_2= '{' otherlv_3= 'default' ( (lv_default_4_0= ruleParameterBase64 ) ) otherlv_5= '}' )? )
            {
            // InternalRosSystem.g:3099:2: ( () otherlv_1= 'Base64' (otherlv_2= '{' otherlv_3= 'default' ( (lv_default_4_0= ruleParameterBase64 ) ) otherlv_5= '}' )? )
            // InternalRosSystem.g:3100:3: () otherlv_1= 'Base64' (otherlv_2= '{' otherlv_3= 'default' ( (lv_default_4_0= ruleParameterBase64 ) ) otherlv_5= '}' )?
            {
            // InternalRosSystem.g:3100:3: ()
            // InternalRosSystem.g:3101:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterBase64TypeAccess().getParameterBase64TypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,76,FOLLOW_69); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterBase64TypeAccess().getBase64Keyword_1());
            		
            // InternalRosSystem.g:3111:3: (otherlv_2= '{' otherlv_3= 'default' ( (lv_default_4_0= ruleParameterBase64 ) ) otherlv_5= '}' )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==23) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // InternalRosSystem.g:3112:4: otherlv_2= '{' otherlv_3= 'default' ( (lv_default_4_0= ruleParameterBase64 ) ) otherlv_5= '}'
                    {
                    otherlv_2=(Token)match(input,23,FOLLOW_70); 

                    				newLeafNode(otherlv_2, grammarAccess.getParameterBase64TypeAccess().getLeftCurlyBracketKeyword_2_0());
                    			
                    otherlv_3=(Token)match(input,72,FOLLOW_74); 

                    				newLeafNode(otherlv_3, grammarAccess.getParameterBase64TypeAccess().getDefaultKeyword_2_1());
                    			
                    // InternalRosSystem.g:3120:4: ( (lv_default_4_0= ruleParameterBase64 ) )
                    // InternalRosSystem.g:3121:5: (lv_default_4_0= ruleParameterBase64 )
                    {
                    // InternalRosSystem.g:3121:5: (lv_default_4_0= ruleParameterBase64 )
                    // InternalRosSystem.g:3122:6: lv_default_4_0= ruleParameterBase64
                    {

                    						newCompositeNode(grammarAccess.getParameterBase64TypeAccess().getDefaultParameterBase64ParserRuleCall_2_2_0());
                    					
                    pushFollow(FOLLOW_27);
                    lv_default_4_0=ruleParameterBase64();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParameterBase64TypeRule());
                    						}
                    						set(
                    							current,
                    							"default",
                    							lv_default_4_0,
                    							"de.fraunhofer.ipa.rossystem.RosSystem.ParameterBase64");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_5=(Token)match(input,31,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getParameterBase64TypeAccess().getRightCurlyBracketKeyword_2_3());
                    			

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
    // $ANTLR end "ruleParameterBase64Type"


    // $ANTLR start "entryRuleParameterArrayType"
    // InternalRosSystem.g:3148:1: entryRuleParameterArrayType returns [EObject current=null] : iv_ruleParameterArrayType= ruleParameterArrayType EOF ;
    public final EObject entryRuleParameterArrayType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterArrayType = null;


        try {
            // InternalRosSystem.g:3148:59: (iv_ruleParameterArrayType= ruleParameterArrayType EOF )
            // InternalRosSystem.g:3149:2: iv_ruleParameterArrayType= ruleParameterArrayType EOF
            {
             newCompositeNode(grammarAccess.getParameterArrayTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameterArrayType=ruleParameterArrayType();

            state._fsp--;

             current =iv_ruleParameterArrayType; 
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
    // $ANTLR end "entryRuleParameterArrayType"


    // $ANTLR start "ruleParameterArrayType"
    // InternalRosSystem.g:3155:1: ruleParameterArrayType returns [EObject current=null] : (otherlv_0= 'Array' otherlv_1= '{' otherlv_2= 'type' ( (lv_type_3_0= ruleParameterType ) ) (otherlv_4= 'default' ( (lv_default_5_0= ruleParameterList ) ) )? otherlv_6= '}' ) ;
    public final EObject ruleParameterArrayType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_type_3_0 = null;

        EObject lv_default_5_0 = null;



        	enterRule();

        try {
            // InternalRosSystem.g:3161:2: ( (otherlv_0= 'Array' otherlv_1= '{' otherlv_2= 'type' ( (lv_type_3_0= ruleParameterType ) ) (otherlv_4= 'default' ( (lv_default_5_0= ruleParameterList ) ) )? otherlv_6= '}' ) )
            // InternalRosSystem.g:3162:2: (otherlv_0= 'Array' otherlv_1= '{' otherlv_2= 'type' ( (lv_type_3_0= ruleParameterType ) ) (otherlv_4= 'default' ( (lv_default_5_0= ruleParameterList ) ) )? otherlv_6= '}' )
            {
            // InternalRosSystem.g:3162:2: (otherlv_0= 'Array' otherlv_1= '{' otherlv_2= 'type' ( (lv_type_3_0= ruleParameterType ) ) (otherlv_4= 'default' ( (lv_default_5_0= ruleParameterList ) ) )? otherlv_6= '}' )
            // InternalRosSystem.g:3163:3: otherlv_0= 'Array' otherlv_1= '{' otherlv_2= 'type' ( (lv_type_3_0= ruleParameterType ) ) (otherlv_4= 'default' ( (lv_default_5_0= ruleParameterList ) ) )? otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,77,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getParameterArrayTypeAccess().getArrayKeyword_0());
            		
            otherlv_1=(Token)match(input,23,FOLLOW_75); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterArrayTypeAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,44,FOLLOW_36); 

            			newLeafNode(otherlv_2, grammarAccess.getParameterArrayTypeAccess().getTypeKeyword_2());
            		
            // InternalRosSystem.g:3175:3: ( (lv_type_3_0= ruleParameterType ) )
            // InternalRosSystem.g:3176:4: (lv_type_3_0= ruleParameterType )
            {
            // InternalRosSystem.g:3176:4: (lv_type_3_0= ruleParameterType )
            // InternalRosSystem.g:3177:5: lv_type_3_0= ruleParameterType
            {

            					newCompositeNode(grammarAccess.getParameterArrayTypeAccess().getTypeParameterTypeParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_76);
            lv_type_3_0=ruleParameterType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParameterArrayTypeRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_3_0,
            						"de.fraunhofer.ipa.rossystem.RosSystem.ParameterType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRosSystem.g:3194:3: (otherlv_4= 'default' ( (lv_default_5_0= ruleParameterList ) ) )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==72) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // InternalRosSystem.g:3195:4: otherlv_4= 'default' ( (lv_default_5_0= ruleParameterList ) )
                    {
                    otherlv_4=(Token)match(input,72,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getParameterArrayTypeAccess().getDefaultKeyword_4_0());
                    			
                    // InternalRosSystem.g:3199:4: ( (lv_default_5_0= ruleParameterList ) )
                    // InternalRosSystem.g:3200:5: (lv_default_5_0= ruleParameterList )
                    {
                    // InternalRosSystem.g:3200:5: (lv_default_5_0= ruleParameterList )
                    // InternalRosSystem.g:3201:6: lv_default_5_0= ruleParameterList
                    {

                    						newCompositeNode(grammarAccess.getParameterArrayTypeAccess().getDefaultParameterListParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_27);
                    lv_default_5_0=ruleParameterList();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParameterArrayTypeRule());
                    						}
                    						set(
                    							current,
                    							"default",
                    							lv_default_5_0,
                    							"de.fraunhofer.ipa.rossystem.RosSystem.ParameterList");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,31,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getParameterArrayTypeAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleParameterArrayType"


    // $ANTLR start "entryRuleParameterList"
    // InternalRosSystem.g:3227:1: entryRuleParameterList returns [EObject current=null] : iv_ruleParameterList= ruleParameterList EOF ;
    public final EObject entryRuleParameterList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterList = null;


        try {
            // InternalRosSystem.g:3227:54: (iv_ruleParameterList= ruleParameterList EOF )
            // InternalRosSystem.g:3228:2: iv_ruleParameterList= ruleParameterList EOF
            {
             newCompositeNode(grammarAccess.getParameterListRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameterList=ruleParameterList();

            state._fsp--;

             current =iv_ruleParameterList; 
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
    // $ANTLR end "entryRuleParameterList"


    // $ANTLR start "ruleParameterList"
    // InternalRosSystem.g:3234:1: ruleParameterList returns [EObject current=null] : ( () otherlv_1= '{' ( (lv_value_2_0= ruleParameterValue ) ) (otherlv_3= ',' ( (lv_value_4_0= ruleParameterValue ) ) )* otherlv_5= '}' ) ;
    public final EObject ruleParameterList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_value_2_0 = null;

        EObject lv_value_4_0 = null;



        	enterRule();

        try {
            // InternalRosSystem.g:3240:2: ( ( () otherlv_1= '{' ( (lv_value_2_0= ruleParameterValue ) ) (otherlv_3= ',' ( (lv_value_4_0= ruleParameterValue ) ) )* otherlv_5= '}' ) )
            // InternalRosSystem.g:3241:2: ( () otherlv_1= '{' ( (lv_value_2_0= ruleParameterValue ) ) (otherlv_3= ',' ( (lv_value_4_0= ruleParameterValue ) ) )* otherlv_5= '}' )
            {
            // InternalRosSystem.g:3241:2: ( () otherlv_1= '{' ( (lv_value_2_0= ruleParameterValue ) ) (otherlv_3= ',' ( (lv_value_4_0= ruleParameterValue ) ) )* otherlv_5= '}' )
            // InternalRosSystem.g:3242:3: () otherlv_1= '{' ( (lv_value_2_0= ruleParameterValue ) ) (otherlv_3= ',' ( (lv_value_4_0= ruleParameterValue ) ) )* otherlv_5= '}'
            {
            // InternalRosSystem.g:3242:3: ()
            // InternalRosSystem.g:3243:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterListAccess().getParameterSequenceAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,23,FOLLOW_38); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterListAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalRosSystem.g:3253:3: ( (lv_value_2_0= ruleParameterValue ) )
            // InternalRosSystem.g:3254:4: (lv_value_2_0= ruleParameterValue )
            {
            // InternalRosSystem.g:3254:4: (lv_value_2_0= ruleParameterValue )
            // InternalRosSystem.g:3255:5: lv_value_2_0= ruleParameterValue
            {

            					newCompositeNode(grammarAccess.getParameterListAccess().getValueParameterValueParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_16);
            lv_value_2_0=ruleParameterValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParameterListRule());
            					}
            					add(
            						current,
            						"value",
            						lv_value_2_0,
            						"de.fraunhofer.ipa.rossystem.RosSystem.ParameterValue");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRosSystem.g:3272:3: (otherlv_3= ',' ( (lv_value_4_0= ruleParameterValue ) ) )*
            loop74:
            do {
                int alt74=2;
                int LA74_0 = input.LA(1);

                if ( (LA74_0==27) ) {
                    alt74=1;
                }


                switch (alt74) {
            	case 1 :
            	    // InternalRosSystem.g:3273:4: otherlv_3= ',' ( (lv_value_4_0= ruleParameterValue ) )
            	    {
            	    otherlv_3=(Token)match(input,27,FOLLOW_38); 

            	    				newLeafNode(otherlv_3, grammarAccess.getParameterListAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalRosSystem.g:3277:4: ( (lv_value_4_0= ruleParameterValue ) )
            	    // InternalRosSystem.g:3278:5: (lv_value_4_0= ruleParameterValue )
            	    {
            	    // InternalRosSystem.g:3278:5: (lv_value_4_0= ruleParameterValue )
            	    // InternalRosSystem.g:3279:6: lv_value_4_0= ruleParameterValue
            	    {

            	    						newCompositeNode(grammarAccess.getParameterListAccess().getValueParameterValueParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_16);
            	    lv_value_4_0=ruleParameterValue();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getParameterListRule());
            	    						}
            	    						add(
            	    							current,
            	    							"value",
            	    							lv_value_4_0,
            	    							"de.fraunhofer.ipa.rossystem.RosSystem.ParameterValue");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop74;
                }
            } while (true);

            otherlv_5=(Token)match(input,31,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getParameterListAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleParameterList"


    // $ANTLR start "entryRuleParameterAny"
    // InternalRosSystem.g:3305:1: entryRuleParameterAny returns [EObject current=null] : iv_ruleParameterAny= ruleParameterAny EOF ;
    public final EObject entryRuleParameterAny() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterAny = null;


        try {
            // InternalRosSystem.g:3305:53: (iv_ruleParameterAny= ruleParameterAny EOF )
            // InternalRosSystem.g:3306:2: iv_ruleParameterAny= ruleParameterAny EOF
            {
             newCompositeNode(grammarAccess.getParameterAnyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameterAny=ruleParameterAny();

            state._fsp--;

             current =iv_ruleParameterAny; 
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
    // $ANTLR end "entryRuleParameterAny"


    // $ANTLR start "ruleParameterAny"
    // InternalRosSystem.g:3312:1: ruleParameterAny returns [EObject current=null] : ( () otherlv_1= 'ParameterAny' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleParameterAny() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_value_4_0 = null;



        	enterRule();

        try {
            // InternalRosSystem.g:3318:2: ( ( () otherlv_1= 'ParameterAny' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) )? otherlv_5= '}' ) )
            // InternalRosSystem.g:3319:2: ( () otherlv_1= 'ParameterAny' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) )? otherlv_5= '}' )
            {
            // InternalRosSystem.g:3319:2: ( () otherlv_1= 'ParameterAny' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) )? otherlv_5= '}' )
            // InternalRosSystem.g:3320:3: () otherlv_1= 'ParameterAny' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) )? otherlv_5= '}'
            {
            // InternalRosSystem.g:3320:3: ()
            // InternalRosSystem.g:3321:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterAnyAccess().getParameterAnyAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,78,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterAnyAccess().getParameterAnyKeyword_1());
            		
            otherlv_2=(Token)match(input,23,FOLLOW_65); 

            			newLeafNode(otherlv_2, grammarAccess.getParameterAnyAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalRosSystem.g:3335:3: (otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==45) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // InternalRosSystem.g:3336:4: otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,45,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getParameterAnyAccess().getValueKeyword_3_0());
                    			
                    // InternalRosSystem.g:3340:4: ( (lv_value_4_0= ruleEString ) )
                    // InternalRosSystem.g:3341:5: (lv_value_4_0= ruleEString )
                    {
                    // InternalRosSystem.g:3341:5: (lv_value_4_0= ruleEString )
                    // InternalRosSystem.g:3342:6: lv_value_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getParameterAnyAccess().getValueEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_27);
                    lv_value_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParameterAnyRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_4_0,
                    							"de.fraunhofer.ipa.rossystem.RosSystem.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,31,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getParameterAnyAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleParameterAny"


    // $ANTLR start "entryRuleParameterString"
    // InternalRosSystem.g:3368:1: entryRuleParameterString returns [EObject current=null] : iv_ruleParameterString= ruleParameterString EOF ;
    public final EObject entryRuleParameterString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterString = null;


        try {
            // InternalRosSystem.g:3368:56: (iv_ruleParameterString= ruleParameterString EOF )
            // InternalRosSystem.g:3369:2: iv_ruleParameterString= ruleParameterString EOF
            {
             newCompositeNode(grammarAccess.getParameterStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameterString=ruleParameterString();

            state._fsp--;

             current =iv_ruleParameterString; 
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
    // $ANTLR end "entryRuleParameterString"


    // $ANTLR start "ruleParameterString"
    // InternalRosSystem.g:3375:1: ruleParameterString returns [EObject current=null] : ( (lv_value_0_0= ruleEString ) ) ;
    public final EObject ruleParameterString() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalRosSystem.g:3381:2: ( ( (lv_value_0_0= ruleEString ) ) )
            // InternalRosSystem.g:3382:2: ( (lv_value_0_0= ruleEString ) )
            {
            // InternalRosSystem.g:3382:2: ( (lv_value_0_0= ruleEString ) )
            // InternalRosSystem.g:3383:3: (lv_value_0_0= ruleEString )
            {
            // InternalRosSystem.g:3383:3: (lv_value_0_0= ruleEString )
            // InternalRosSystem.g:3384:4: lv_value_0_0= ruleEString
            {

            				newCompositeNode(grammarAccess.getParameterStringAccess().getValueEStringParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_value_0_0=ruleEString();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getParameterStringRule());
            				}
            				set(
            					current,
            					"value",
            					lv_value_0_0,
            					"de.fraunhofer.ipa.rossystem.RosSystem.EString");
            				afterParserOrEnumRuleCall();
            			

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
    // $ANTLR end "ruleParameterString"


    // $ANTLR start "entryRuleParameterBase64"
    // InternalRosSystem.g:3404:1: entryRuleParameterBase64 returns [EObject current=null] : iv_ruleParameterBase64= ruleParameterBase64 EOF ;
    public final EObject entryRuleParameterBase64() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterBase64 = null;


        try {
            // InternalRosSystem.g:3404:56: (iv_ruleParameterBase64= ruleParameterBase64 EOF )
            // InternalRosSystem.g:3405:2: iv_ruleParameterBase64= ruleParameterBase64 EOF
            {
             newCompositeNode(grammarAccess.getParameterBase64Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameterBase64=ruleParameterBase64();

            state._fsp--;

             current =iv_ruleParameterBase64; 
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
    // $ANTLR end "entryRuleParameterBase64"


    // $ANTLR start "ruleParameterBase64"
    // InternalRosSystem.g:3411:1: ruleParameterBase64 returns [EObject current=null] : ( (lv_value_0_0= ruleBase64Binary ) ) ;
    public final EObject ruleParameterBase64() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalRosSystem.g:3417:2: ( ( (lv_value_0_0= ruleBase64Binary ) ) )
            // InternalRosSystem.g:3418:2: ( (lv_value_0_0= ruleBase64Binary ) )
            {
            // InternalRosSystem.g:3418:2: ( (lv_value_0_0= ruleBase64Binary ) )
            // InternalRosSystem.g:3419:3: (lv_value_0_0= ruleBase64Binary )
            {
            // InternalRosSystem.g:3419:3: (lv_value_0_0= ruleBase64Binary )
            // InternalRosSystem.g:3420:4: lv_value_0_0= ruleBase64Binary
            {

            				newCompositeNode(grammarAccess.getParameterBase64Access().getValueBase64BinaryParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_value_0_0=ruleBase64Binary();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getParameterBase64Rule());
            				}
            				set(
            					current,
            					"value",
            					lv_value_0_0,
            					"de.fraunhofer.ipa.rossystem.RosSystem.Base64Binary");
            				afterParserOrEnumRuleCall();
            			

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
    // $ANTLR end "ruleParameterBase64"


    // $ANTLR start "entryRuleParameterInteger"
    // InternalRosSystem.g:3440:1: entryRuleParameterInteger returns [EObject current=null] : iv_ruleParameterInteger= ruleParameterInteger EOF ;
    public final EObject entryRuleParameterInteger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterInteger = null;


        try {
            // InternalRosSystem.g:3440:57: (iv_ruleParameterInteger= ruleParameterInteger EOF )
            // InternalRosSystem.g:3441:2: iv_ruleParameterInteger= ruleParameterInteger EOF
            {
             newCompositeNode(grammarAccess.getParameterIntegerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameterInteger=ruleParameterInteger();

            state._fsp--;

             current =iv_ruleParameterInteger; 
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
    // $ANTLR end "entryRuleParameterInteger"


    // $ANTLR start "ruleParameterInteger"
    // InternalRosSystem.g:3447:1: ruleParameterInteger returns [EObject current=null] : ( (lv_value_0_0= ruleInteger0 ) ) ;
    public final EObject ruleParameterInteger() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalRosSystem.g:3453:2: ( ( (lv_value_0_0= ruleInteger0 ) ) )
            // InternalRosSystem.g:3454:2: ( (lv_value_0_0= ruleInteger0 ) )
            {
            // InternalRosSystem.g:3454:2: ( (lv_value_0_0= ruleInteger0 ) )
            // InternalRosSystem.g:3455:3: (lv_value_0_0= ruleInteger0 )
            {
            // InternalRosSystem.g:3455:3: (lv_value_0_0= ruleInteger0 )
            // InternalRosSystem.g:3456:4: lv_value_0_0= ruleInteger0
            {

            				newCompositeNode(grammarAccess.getParameterIntegerAccess().getValueInteger0ParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_value_0_0=ruleInteger0();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getParameterIntegerRule());
            				}
            				set(
            					current,
            					"value",
            					lv_value_0_0,
            					"de.fraunhofer.ipa.rossystem.RosSystem.Integer0");
            				afterParserOrEnumRuleCall();
            			

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
    // $ANTLR end "ruleParameterInteger"


    // $ANTLR start "entryRuleParameterDouble"
    // InternalRosSystem.g:3476:1: entryRuleParameterDouble returns [EObject current=null] : iv_ruleParameterDouble= ruleParameterDouble EOF ;
    public final EObject entryRuleParameterDouble() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterDouble = null;


        try {
            // InternalRosSystem.g:3476:56: (iv_ruleParameterDouble= ruleParameterDouble EOF )
            // InternalRosSystem.g:3477:2: iv_ruleParameterDouble= ruleParameterDouble EOF
            {
             newCompositeNode(grammarAccess.getParameterDoubleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameterDouble=ruleParameterDouble();

            state._fsp--;

             current =iv_ruleParameterDouble; 
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
    // $ANTLR end "entryRuleParameterDouble"


    // $ANTLR start "ruleParameterDouble"
    // InternalRosSystem.g:3483:1: ruleParameterDouble returns [EObject current=null] : ( (lv_value_0_0= ruleDouble0 ) ) ;
    public final EObject ruleParameterDouble() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalRosSystem.g:3489:2: ( ( (lv_value_0_0= ruleDouble0 ) ) )
            // InternalRosSystem.g:3490:2: ( (lv_value_0_0= ruleDouble0 ) )
            {
            // InternalRosSystem.g:3490:2: ( (lv_value_0_0= ruleDouble0 ) )
            // InternalRosSystem.g:3491:3: (lv_value_0_0= ruleDouble0 )
            {
            // InternalRosSystem.g:3491:3: (lv_value_0_0= ruleDouble0 )
            // InternalRosSystem.g:3492:4: lv_value_0_0= ruleDouble0
            {

            				newCompositeNode(grammarAccess.getParameterDoubleAccess().getValueDouble0ParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_value_0_0=ruleDouble0();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getParameterDoubleRule());
            				}
            				set(
            					current,
            					"value",
            					lv_value_0_0,
            					"de.fraunhofer.ipa.rossystem.RosSystem.Double0");
            				afterParserOrEnumRuleCall();
            			

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
    // $ANTLR end "ruleParameterDouble"


    // $ANTLR start "entryRuleParameterBoolean"
    // InternalRosSystem.g:3512:1: entryRuleParameterBoolean returns [EObject current=null] : iv_ruleParameterBoolean= ruleParameterBoolean EOF ;
    public final EObject entryRuleParameterBoolean() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterBoolean = null;


        try {
            // InternalRosSystem.g:3512:57: (iv_ruleParameterBoolean= ruleParameterBoolean EOF )
            // InternalRosSystem.g:3513:2: iv_ruleParameterBoolean= ruleParameterBoolean EOF
            {
             newCompositeNode(grammarAccess.getParameterBooleanRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameterBoolean=ruleParameterBoolean();

            state._fsp--;

             current =iv_ruleParameterBoolean; 
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
    // $ANTLR end "entryRuleParameterBoolean"


    // $ANTLR start "ruleParameterBoolean"
    // InternalRosSystem.g:3519:1: ruleParameterBoolean returns [EObject current=null] : ( (lv_value_0_0= ruleboolean0 ) ) ;
    public final EObject ruleParameterBoolean() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalRosSystem.g:3525:2: ( ( (lv_value_0_0= ruleboolean0 ) ) )
            // InternalRosSystem.g:3526:2: ( (lv_value_0_0= ruleboolean0 ) )
            {
            // InternalRosSystem.g:3526:2: ( (lv_value_0_0= ruleboolean0 ) )
            // InternalRosSystem.g:3527:3: (lv_value_0_0= ruleboolean0 )
            {
            // InternalRosSystem.g:3527:3: (lv_value_0_0= ruleboolean0 )
            // InternalRosSystem.g:3528:4: lv_value_0_0= ruleboolean0
            {

            				newCompositeNode(grammarAccess.getParameterBooleanAccess().getValueBoolean0ParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_value_0_0=ruleboolean0();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getParameterBooleanRule());
            				}
            				set(
            					current,
            					"value",
            					lv_value_0_0,
            					"de.fraunhofer.ipa.rossystem.RosSystem.boolean0");
            				afterParserOrEnumRuleCall();
            			

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
    // $ANTLR end "ruleParameterBoolean"


    // $ANTLR start "entryRuleParameterDate"
    // InternalRosSystem.g:3548:1: entryRuleParameterDate returns [EObject current=null] : iv_ruleParameterDate= ruleParameterDate EOF ;
    public final EObject entryRuleParameterDate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterDate = null;


        try {
            // InternalRosSystem.g:3548:54: (iv_ruleParameterDate= ruleParameterDate EOF )
            // InternalRosSystem.g:3549:2: iv_ruleParameterDate= ruleParameterDate EOF
            {
             newCompositeNode(grammarAccess.getParameterDateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameterDate=ruleParameterDate();

            state._fsp--;

             current =iv_ruleParameterDate; 
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
    // $ANTLR end "entryRuleParameterDate"


    // $ANTLR start "ruleParameterDate"
    // InternalRosSystem.g:3555:1: ruleParameterDate returns [EObject current=null] : ( (lv_value_0_0= ruleDateTime0 ) ) ;
    public final EObject ruleParameterDate() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalRosSystem.g:3561:2: ( ( (lv_value_0_0= ruleDateTime0 ) ) )
            // InternalRosSystem.g:3562:2: ( (lv_value_0_0= ruleDateTime0 ) )
            {
            // InternalRosSystem.g:3562:2: ( (lv_value_0_0= ruleDateTime0 ) )
            // InternalRosSystem.g:3563:3: (lv_value_0_0= ruleDateTime0 )
            {
            // InternalRosSystem.g:3563:3: (lv_value_0_0= ruleDateTime0 )
            // InternalRosSystem.g:3564:4: lv_value_0_0= ruleDateTime0
            {

            				newCompositeNode(grammarAccess.getParameterDateAccess().getValueDateTime0ParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_value_0_0=ruleDateTime0();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getParameterDateRule());
            				}
            				set(
            					current,
            					"value",
            					lv_value_0_0,
            					"de.fraunhofer.ipa.rossystem.RosSystem.DateTime0");
            				afterParserOrEnumRuleCall();
            			

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
    // $ANTLR end "ruleParameterDate"


    // $ANTLR start "entryRuleParameterStruct"
    // InternalRosSystem.g:3584:1: entryRuleParameterStruct returns [EObject current=null] : iv_ruleParameterStruct= ruleParameterStruct EOF ;
    public final EObject entryRuleParameterStruct() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterStruct = null;


        try {
            // InternalRosSystem.g:3584:56: (iv_ruleParameterStruct= ruleParameterStruct EOF )
            // InternalRosSystem.g:3585:2: iv_ruleParameterStruct= ruleParameterStruct EOF
            {
             newCompositeNode(grammarAccess.getParameterStructRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameterStruct=ruleParameterStruct();

            state._fsp--;

             current =iv_ruleParameterStruct; 
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
    // $ANTLR end "entryRuleParameterStruct"


    // $ANTLR start "ruleParameterStruct"
    // InternalRosSystem.g:3591:1: ruleParameterStruct returns [EObject current=null] : ( () (otherlv_1= '{' ( (lv_value_2_0= ruleParameterStructMember ) ) (otherlv_3= ',' otherlv_4= '{' ( (lv_value_5_0= ruleParameterStructMember ) ) otherlv_6= '}' )* otherlv_7= '}' )? ) ;
    public final EObject ruleParameterStruct() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        EObject lv_value_2_0 = null;

        EObject lv_value_5_0 = null;



        	enterRule();

        try {
            // InternalRosSystem.g:3597:2: ( ( () (otherlv_1= '{' ( (lv_value_2_0= ruleParameterStructMember ) ) (otherlv_3= ',' otherlv_4= '{' ( (lv_value_5_0= ruleParameterStructMember ) ) otherlv_6= '}' )* otherlv_7= '}' )? ) )
            // InternalRosSystem.g:3598:2: ( () (otherlv_1= '{' ( (lv_value_2_0= ruleParameterStructMember ) ) (otherlv_3= ',' otherlv_4= '{' ( (lv_value_5_0= ruleParameterStructMember ) ) otherlv_6= '}' )* otherlv_7= '}' )? )
            {
            // InternalRosSystem.g:3598:2: ( () (otherlv_1= '{' ( (lv_value_2_0= ruleParameterStructMember ) ) (otherlv_3= ',' otherlv_4= '{' ( (lv_value_5_0= ruleParameterStructMember ) ) otherlv_6= '}' )* otherlv_7= '}' )? )
            // InternalRosSystem.g:3599:3: () (otherlv_1= '{' ( (lv_value_2_0= ruleParameterStructMember ) ) (otherlv_3= ',' otherlv_4= '{' ( (lv_value_5_0= ruleParameterStructMember ) ) otherlv_6= '}' )* otherlv_7= '}' )?
            {
            // InternalRosSystem.g:3599:3: ()
            // InternalRosSystem.g:3600:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterStructAccess().getParameterStructAction_0(),
            					current);
            			

            }

            // InternalRosSystem.g:3606:3: (otherlv_1= '{' ( (lv_value_2_0= ruleParameterStructMember ) ) (otherlv_3= ',' otherlv_4= '{' ( (lv_value_5_0= ruleParameterStructMember ) ) otherlv_6= '}' )* otherlv_7= '}' )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==23) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // InternalRosSystem.g:3607:4: otherlv_1= '{' ( (lv_value_2_0= ruleParameterStructMember ) ) (otherlv_3= ',' otherlv_4= '{' ( (lv_value_5_0= ruleParameterStructMember ) ) otherlv_6= '}' )* otherlv_7= '}'
                    {
                    otherlv_1=(Token)match(input,23,FOLLOW_5); 

                    				newLeafNode(otherlv_1, grammarAccess.getParameterStructAccess().getLeftCurlyBracketKeyword_1_0());
                    			
                    // InternalRosSystem.g:3611:4: ( (lv_value_2_0= ruleParameterStructMember ) )
                    // InternalRosSystem.g:3612:5: (lv_value_2_0= ruleParameterStructMember )
                    {
                    // InternalRosSystem.g:3612:5: (lv_value_2_0= ruleParameterStructMember )
                    // InternalRosSystem.g:3613:6: lv_value_2_0= ruleParameterStructMember
                    {

                    						newCompositeNode(grammarAccess.getParameterStructAccess().getValueParameterStructMemberParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_value_2_0=ruleParameterStructMember();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParameterStructRule());
                    						}
                    						add(
                    							current,
                    							"value",
                    							lv_value_2_0,
                    							"de.fraunhofer.ipa.rossystem.RosSystem.ParameterStructMember");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRosSystem.g:3630:4: (otherlv_3= ',' otherlv_4= '{' ( (lv_value_5_0= ruleParameterStructMember ) ) otherlv_6= '}' )*
                    loop76:
                    do {
                        int alt76=2;
                        int LA76_0 = input.LA(1);

                        if ( (LA76_0==27) ) {
                            alt76=1;
                        }


                        switch (alt76) {
                    	case 1 :
                    	    // InternalRosSystem.g:3631:5: otherlv_3= ',' otherlv_4= '{' ( (lv_value_5_0= ruleParameterStructMember ) ) otherlv_6= '}'
                    	    {
                    	    otherlv_3=(Token)match(input,27,FOLLOW_3); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getParameterStructAccess().getCommaKeyword_1_2_0());
                    	    				
                    	    otherlv_4=(Token)match(input,23,FOLLOW_5); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getParameterStructAccess().getLeftCurlyBracketKeyword_1_2_1());
                    	    				
                    	    // InternalRosSystem.g:3639:5: ( (lv_value_5_0= ruleParameterStructMember ) )
                    	    // InternalRosSystem.g:3640:6: (lv_value_5_0= ruleParameterStructMember )
                    	    {
                    	    // InternalRosSystem.g:3640:6: (lv_value_5_0= ruleParameterStructMember )
                    	    // InternalRosSystem.g:3641:7: lv_value_5_0= ruleParameterStructMember
                    	    {

                    	    							newCompositeNode(grammarAccess.getParameterStructAccess().getValueParameterStructMemberParserRuleCall_1_2_2_0());
                    	    						
                    	    pushFollow(FOLLOW_27);
                    	    lv_value_5_0=ruleParameterStructMember();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getParameterStructRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"value",
                    	    								lv_value_5_0,
                    	    								"de.fraunhofer.ipa.rossystem.RosSystem.ParameterStructMember");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }

                    	    otherlv_6=(Token)match(input,31,FOLLOW_16); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getParameterStructAccess().getRightCurlyBracketKeyword_1_2_3());
                    	    				

                    	    }
                    	    break;

                    	default :
                    	    break loop76;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,31,FOLLOW_2); 

                    				newLeafNode(otherlv_7, grammarAccess.getParameterStructAccess().getRightCurlyBracketKeyword_1_3());
                    			

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
    // $ANTLR end "ruleParameterStruct"


    // $ANTLR start "entryRuleParameterStructMember"
    // InternalRosSystem.g:3672:1: entryRuleParameterStructMember returns [EObject current=null] : iv_ruleParameterStructMember= ruleParameterStructMember EOF ;
    public final EObject entryRuleParameterStructMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterStructMember = null;


        try {
            // InternalRosSystem.g:3672:62: (iv_ruleParameterStructMember= ruleParameterStructMember EOF )
            // InternalRosSystem.g:3673:2: iv_ruleParameterStructMember= ruleParameterStructMember EOF
            {
             newCompositeNode(grammarAccess.getParameterStructMemberRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameterStructMember=ruleParameterStructMember();

            state._fsp--;

             current =iv_ruleParameterStructMember; 
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
    // $ANTLR end "entryRuleParameterStructMember"


    // $ANTLR start "ruleParameterStructMember"
    // InternalRosSystem.g:3679:1: ruleParameterStructMember returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleParameterValue ) ) otherlv_4= '}' ) ;
    public final EObject ruleParameterStructMember() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalRosSystem.g:3685:2: ( ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleParameterValue ) ) otherlv_4= '}' ) )
            // InternalRosSystem.g:3686:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleParameterValue ) ) otherlv_4= '}' )
            {
            // InternalRosSystem.g:3686:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleParameterValue ) ) otherlv_4= '}' )
            // InternalRosSystem.g:3687:3: ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleParameterValue ) ) otherlv_4= '}'
            {
            // InternalRosSystem.g:3687:3: ( (lv_name_0_0= ruleEString ) )
            // InternalRosSystem.g:3688:4: (lv_name_0_0= ruleEString )
            {
            // InternalRosSystem.g:3688:4: (lv_name_0_0= ruleEString )
            // InternalRosSystem.g:3689:5: lv_name_0_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getParameterStructMemberAccess().getNameEStringParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_0_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParameterStructMemberRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"de.fraunhofer.ipa.rossystem.RosSystem.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,23,FOLLOW_77); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterStructMemberAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,45,FOLLOW_38); 

            			newLeafNode(otherlv_2, grammarAccess.getParameterStructMemberAccess().getValueKeyword_2());
            		
            // InternalRosSystem.g:3714:3: ( (lv_value_3_0= ruleParameterValue ) )
            // InternalRosSystem.g:3715:4: (lv_value_3_0= ruleParameterValue )
            {
            // InternalRosSystem.g:3715:4: (lv_value_3_0= ruleParameterValue )
            // InternalRosSystem.g:3716:5: lv_value_3_0= ruleParameterValue
            {

            					newCompositeNode(grammarAccess.getParameterStructMemberAccess().getValueParameterValueParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_27);
            lv_value_3_0=ruleParameterValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParameterStructMemberRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_3_0,
            						"de.fraunhofer.ipa.rossystem.RosSystem.ParameterValue");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,31,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getParameterStructMemberAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleParameterStructMember"


    // $ANTLR start "entryRuleParameterStructTypeMember"
    // InternalRosSystem.g:3741:1: entryRuleParameterStructTypeMember returns [EObject current=null] : iv_ruleParameterStructTypeMember= ruleParameterStructTypeMember EOF ;
    public final EObject entryRuleParameterStructTypeMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterStructTypeMember = null;


        try {
            // InternalRosSystem.g:3741:66: (iv_ruleParameterStructTypeMember= ruleParameterStructTypeMember EOF )
            // InternalRosSystem.g:3742:2: iv_ruleParameterStructTypeMember= ruleParameterStructTypeMember EOF
            {
             newCompositeNode(grammarAccess.getParameterStructTypeMemberRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameterStructTypeMember=ruleParameterStructTypeMember();

            state._fsp--;

             current =iv_ruleParameterStructTypeMember; 
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
    // $ANTLR end "entryRuleParameterStructTypeMember"


    // $ANTLR start "ruleParameterStructTypeMember"
    // InternalRosSystem.g:3748:1: ruleParameterStructTypeMember returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) ( (lv_type_1_0= ruleParameterType ) ) ) ;
    public final EObject ruleParameterStructTypeMember() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_type_1_0 = null;



        	enterRule();

        try {
            // InternalRosSystem.g:3754:2: ( ( ( (lv_name_0_0= ruleEString ) ) ( (lv_type_1_0= ruleParameterType ) ) ) )
            // InternalRosSystem.g:3755:2: ( ( (lv_name_0_0= ruleEString ) ) ( (lv_type_1_0= ruleParameterType ) ) )
            {
            // InternalRosSystem.g:3755:2: ( ( (lv_name_0_0= ruleEString ) ) ( (lv_type_1_0= ruleParameterType ) ) )
            // InternalRosSystem.g:3756:3: ( (lv_name_0_0= ruleEString ) ) ( (lv_type_1_0= ruleParameterType ) )
            {
            // InternalRosSystem.g:3756:3: ( (lv_name_0_0= ruleEString ) )
            // InternalRosSystem.g:3757:4: (lv_name_0_0= ruleEString )
            {
            // InternalRosSystem.g:3757:4: (lv_name_0_0= ruleEString )
            // InternalRosSystem.g:3758:5: lv_name_0_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getParameterStructTypeMemberAccess().getNameEStringParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_36);
            lv_name_0_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParameterStructTypeMemberRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"de.fraunhofer.ipa.rossystem.RosSystem.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRosSystem.g:3775:3: ( (lv_type_1_0= ruleParameterType ) )
            // InternalRosSystem.g:3776:4: (lv_type_1_0= ruleParameterType )
            {
            // InternalRosSystem.g:3776:4: (lv_type_1_0= ruleParameterType )
            // InternalRosSystem.g:3777:5: lv_type_1_0= ruleParameterType
            {

            					newCompositeNode(grammarAccess.getParameterStructTypeMemberAccess().getTypeParameterTypeParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_1_0=ruleParameterType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParameterStructTypeMemberRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_1_0,
            						"de.fraunhofer.ipa.rossystem.RosSystem.ParameterType");
            					afterParserOrEnumRuleCall();
            				

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
    // $ANTLR end "ruleParameterStructTypeMember"


    // $ANTLR start "entryRuleBase64Binary"
    // InternalRosSystem.g:3798:1: entryRuleBase64Binary returns [String current=null] : iv_ruleBase64Binary= ruleBase64Binary EOF ;
    public final String entryRuleBase64Binary() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBase64Binary = null;


        try {
            // InternalRosSystem.g:3798:52: (iv_ruleBase64Binary= ruleBase64Binary EOF )
            // InternalRosSystem.g:3799:2: iv_ruleBase64Binary= ruleBase64Binary EOF
            {
             newCompositeNode(grammarAccess.getBase64BinaryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBase64Binary=ruleBase64Binary();

            state._fsp--;

             current =iv_ruleBase64Binary.getText(); 
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
    // $ANTLR end "entryRuleBase64Binary"


    // $ANTLR start "ruleBase64Binary"
    // InternalRosSystem.g:3805:1: ruleBase64Binary returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_BINARY_0= RULE_BINARY ;
    public final AntlrDatatypeRuleToken ruleBase64Binary() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_BINARY_0=null;


        	enterRule();

        try {
            // InternalRosSystem.g:3811:2: (this_BINARY_0= RULE_BINARY )
            // InternalRosSystem.g:3812:2: this_BINARY_0= RULE_BINARY
            {
            this_BINARY_0=(Token)match(input,RULE_BINARY,FOLLOW_2); 

            		current.merge(this_BINARY_0);
            	

            		newLeafNode(this_BINARY_0, grammarAccess.getBase64BinaryAccess().getBINARYTerminalRuleCall());
            	

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
    // $ANTLR end "ruleBase64Binary"


    // $ANTLR start "entryRuleboolean0"
    // InternalRosSystem.g:3822:1: entryRuleboolean0 returns [String current=null] : iv_ruleboolean0= ruleboolean0 EOF ;
    public final String entryRuleboolean0() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleboolean0 = null;


        try {
            // InternalRosSystem.g:3822:48: (iv_ruleboolean0= ruleboolean0 EOF )
            // InternalRosSystem.g:3823:2: iv_ruleboolean0= ruleboolean0 EOF
            {
             newCompositeNode(grammarAccess.getBoolean0Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleboolean0=ruleboolean0();

            state._fsp--;

             current =iv_ruleboolean0.getText(); 
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
    // $ANTLR end "entryRuleboolean0"


    // $ANTLR start "ruleboolean0"
    // InternalRosSystem.g:3829:1: ruleboolean0 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_BOOLEAN_0= RULE_BOOLEAN ;
    public final AntlrDatatypeRuleToken ruleboolean0() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_BOOLEAN_0=null;


        	enterRule();

        try {
            // InternalRosSystem.g:3835:2: (this_BOOLEAN_0= RULE_BOOLEAN )
            // InternalRosSystem.g:3836:2: this_BOOLEAN_0= RULE_BOOLEAN
            {
            this_BOOLEAN_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_2); 

            		current.merge(this_BOOLEAN_0);
            	

            		newLeafNode(this_BOOLEAN_0, grammarAccess.getBoolean0Access().getBOOLEANTerminalRuleCall());
            	

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
    // $ANTLR end "ruleboolean0"


    // $ANTLR start "entryRuleDouble0"
    // InternalRosSystem.g:3846:1: entryRuleDouble0 returns [String current=null] : iv_ruleDouble0= ruleDouble0 EOF ;
    public final String entryRuleDouble0() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDouble0 = null;


        try {
            // InternalRosSystem.g:3846:47: (iv_ruleDouble0= ruleDouble0 EOF )
            // InternalRosSystem.g:3847:2: iv_ruleDouble0= ruleDouble0 EOF
            {
             newCompositeNode(grammarAccess.getDouble0Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDouble0=ruleDouble0();

            state._fsp--;

             current =iv_ruleDouble0.getText(); 
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
    // $ANTLR end "entryRuleDouble0"


    // $ANTLR start "ruleDouble0"
    // InternalRosSystem.g:3853:1: ruleDouble0 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_DOUBLE_0= RULE_DOUBLE ;
    public final AntlrDatatypeRuleToken ruleDouble0() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_DOUBLE_0=null;


        	enterRule();

        try {
            // InternalRosSystem.g:3859:2: (this_DOUBLE_0= RULE_DOUBLE )
            // InternalRosSystem.g:3860:2: this_DOUBLE_0= RULE_DOUBLE
            {
            this_DOUBLE_0=(Token)match(input,RULE_DOUBLE,FOLLOW_2); 

            		current.merge(this_DOUBLE_0);
            	

            		newLeafNode(this_DOUBLE_0, grammarAccess.getDouble0Access().getDOUBLETerminalRuleCall());
            	

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
    // $ANTLR end "ruleDouble0"


    // $ANTLR start "entryRuleInteger0"
    // InternalRosSystem.g:3870:1: entryRuleInteger0 returns [String current=null] : iv_ruleInteger0= ruleInteger0 EOF ;
    public final String entryRuleInteger0() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInteger0 = null;


        try {
            // InternalRosSystem.g:3870:48: (iv_ruleInteger0= ruleInteger0 EOF )
            // InternalRosSystem.g:3871:2: iv_ruleInteger0= ruleInteger0 EOF
            {
             newCompositeNode(grammarAccess.getInteger0Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInteger0=ruleInteger0();

            state._fsp--;

             current =iv_ruleInteger0.getText(); 
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
    // $ANTLR end "entryRuleInteger0"


    // $ANTLR start "ruleInteger0"
    // InternalRosSystem.g:3877:1: ruleInteger0 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_DECINT_0= RULE_DECINT ;
    public final AntlrDatatypeRuleToken ruleInteger0() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_DECINT_0=null;


        	enterRule();

        try {
            // InternalRosSystem.g:3883:2: (this_DECINT_0= RULE_DECINT )
            // InternalRosSystem.g:3884:2: this_DECINT_0= RULE_DECINT
            {
            this_DECINT_0=(Token)match(input,RULE_DECINT,FOLLOW_2); 

            		current.merge(this_DECINT_0);
            	

            		newLeafNode(this_DECINT_0, grammarAccess.getInteger0Access().getDECINTTerminalRuleCall());
            	

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
    // $ANTLR end "ruleInteger0"


    // $ANTLR start "entryRuleDateTime0"
    // InternalRosSystem.g:3894:1: entryRuleDateTime0 returns [String current=null] : iv_ruleDateTime0= ruleDateTime0 EOF ;
    public final String entryRuleDateTime0() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDateTime0 = null;


        try {
            // InternalRosSystem.g:3894:49: (iv_ruleDateTime0= ruleDateTime0 EOF )
            // InternalRosSystem.g:3895:2: iv_ruleDateTime0= ruleDateTime0 EOF
            {
             newCompositeNode(grammarAccess.getDateTime0Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDateTime0=ruleDateTime0();

            state._fsp--;

             current =iv_ruleDateTime0.getText(); 
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
    // $ANTLR end "entryRuleDateTime0"


    // $ANTLR start "ruleDateTime0"
    // InternalRosSystem.g:3901:1: ruleDateTime0 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_DATE_TIME_0= RULE_DATE_TIME ;
    public final AntlrDatatypeRuleToken ruleDateTime0() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_DATE_TIME_0=null;


        	enterRule();

        try {
            // InternalRosSystem.g:3907:2: (this_DATE_TIME_0= RULE_DATE_TIME )
            // InternalRosSystem.g:3908:2: this_DATE_TIME_0= RULE_DATE_TIME
            {
            this_DATE_TIME_0=(Token)match(input,RULE_DATE_TIME,FOLLOW_2); 

            		current.merge(this_DATE_TIME_0);
            	

            		newLeafNode(this_DATE_TIME_0, grammarAccess.getDateTime0Access().getDATE_TIMETerminalRuleCall());
            	

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
    // $ANTLR end "ruleDateTime0"


    // $ANTLR start "entryRuleNamespace"
    // InternalRosSystem.g:3918:1: entryRuleNamespace returns [EObject current=null] : iv_ruleNamespace= ruleNamespace EOF ;
    public final EObject entryRuleNamespace() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamespace = null;


        try {
            // InternalRosSystem.g:3918:50: (iv_ruleNamespace= ruleNamespace EOF )
            // InternalRosSystem.g:3919:2: iv_ruleNamespace= ruleNamespace EOF
            {
             newCompositeNode(grammarAccess.getNamespaceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNamespace=ruleNamespace();

            state._fsp--;

             current =iv_ruleNamespace; 
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
    // $ANTLR end "entryRuleNamespace"


    // $ANTLR start "ruleNamespace"
    // InternalRosSystem.g:3925:1: ruleNamespace returns [EObject current=null] : (this_GlobalNamespace_0= ruleGlobalNamespace | this_RelativeNamespace_Impl_1= ruleRelativeNamespace_Impl | this_PrivateNamespace_2= rulePrivateNamespace ) ;
    public final EObject ruleNamespace() throws RecognitionException {
        EObject current = null;

        EObject this_GlobalNamespace_0 = null;

        EObject this_RelativeNamespace_Impl_1 = null;

        EObject this_PrivateNamespace_2 = null;



        	enterRule();

        try {
            // InternalRosSystem.g:3931:2: ( (this_GlobalNamespace_0= ruleGlobalNamespace | this_RelativeNamespace_Impl_1= ruleRelativeNamespace_Impl | this_PrivateNamespace_2= rulePrivateNamespace ) )
            // InternalRosSystem.g:3932:2: (this_GlobalNamespace_0= ruleGlobalNamespace | this_RelativeNamespace_Impl_1= ruleRelativeNamespace_Impl | this_PrivateNamespace_2= rulePrivateNamespace )
            {
            // InternalRosSystem.g:3932:2: (this_GlobalNamespace_0= ruleGlobalNamespace | this_RelativeNamespace_Impl_1= ruleRelativeNamespace_Impl | this_PrivateNamespace_2= rulePrivateNamespace )
            int alt78=3;
            switch ( input.LA(1) ) {
            case 79:
                {
                alt78=1;
                }
                break;
            case 81:
                {
                alt78=2;
                }
                break;
            case 82:
                {
                alt78=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 78, 0, input);

                throw nvae;
            }

            switch (alt78) {
                case 1 :
                    // InternalRosSystem.g:3933:3: this_GlobalNamespace_0= ruleGlobalNamespace
                    {

                    			newCompositeNode(grammarAccess.getNamespaceAccess().getGlobalNamespaceParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_GlobalNamespace_0=ruleGlobalNamespace();

                    state._fsp--;


                    			current = this_GlobalNamespace_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalRosSystem.g:3942:3: this_RelativeNamespace_Impl_1= ruleRelativeNamespace_Impl
                    {

                    			newCompositeNode(grammarAccess.getNamespaceAccess().getRelativeNamespace_ImplParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_RelativeNamespace_Impl_1=ruleRelativeNamespace_Impl();

                    state._fsp--;


                    			current = this_RelativeNamespace_Impl_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalRosSystem.g:3951:3: this_PrivateNamespace_2= rulePrivateNamespace
                    {

                    			newCompositeNode(grammarAccess.getNamespaceAccess().getPrivateNamespaceParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_PrivateNamespace_2=rulePrivateNamespace();

                    state._fsp--;


                    			current = this_PrivateNamespace_2;
                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "ruleNamespace"


    // $ANTLR start "entryRuleGlobalNamespace"
    // InternalRosSystem.g:3963:1: entryRuleGlobalNamespace returns [EObject current=null] : iv_ruleGlobalNamespace= ruleGlobalNamespace EOF ;
    public final EObject entryRuleGlobalNamespace() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGlobalNamespace = null;


        try {
            // InternalRosSystem.g:3963:56: (iv_ruleGlobalNamespace= ruleGlobalNamespace EOF )
            // InternalRosSystem.g:3964:2: iv_ruleGlobalNamespace= ruleGlobalNamespace EOF
            {
             newCompositeNode(grammarAccess.getGlobalNamespaceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGlobalNamespace=ruleGlobalNamespace();

            state._fsp--;

             current =iv_ruleGlobalNamespace; 
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
    // $ANTLR end "entryRuleGlobalNamespace"


    // $ANTLR start "ruleGlobalNamespace"
    // InternalRosSystem.g:3970:1: ruleGlobalNamespace returns [EObject current=null] : ( () otherlv_1= 'GlobalNamespace' otherlv_2= '{' (otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleGraphName ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) ;
    public final EObject ruleGlobalNamespace() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_parts_5_0 = null;

        AntlrDatatypeRuleToken lv_parts_7_0 = null;



        	enterRule();

        try {
            // InternalRosSystem.g:3976:2: ( ( () otherlv_1= 'GlobalNamespace' otherlv_2= '{' (otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleGraphName ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) )
            // InternalRosSystem.g:3977:2: ( () otherlv_1= 'GlobalNamespace' otherlv_2= '{' (otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleGraphName ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            {
            // InternalRosSystem.g:3977:2: ( () otherlv_1= 'GlobalNamespace' otherlv_2= '{' (otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleGraphName ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            // InternalRosSystem.g:3978:3: () otherlv_1= 'GlobalNamespace' otherlv_2= '{' (otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleGraphName ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )* otherlv_8= '}' )? otherlv_9= '}'
            {
            // InternalRosSystem.g:3978:3: ()
            // InternalRosSystem.g:3979:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getGlobalNamespaceAccess().getGlobalNamespaceAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,79,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getGlobalNamespaceAccess().getGlobalNamespaceKeyword_1());
            		
            otherlv_2=(Token)match(input,23,FOLLOW_78); 

            			newLeafNode(otherlv_2, grammarAccess.getGlobalNamespaceAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalRosSystem.g:3993:3: (otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleGraphName ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )* otherlv_8= '}' )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==80) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // InternalRosSystem.g:3994:4: otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleGraphName ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,80,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getGlobalNamespaceAccess().getPartsKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,23,FOLLOW_79); 

                    				newLeafNode(otherlv_4, grammarAccess.getGlobalNamespaceAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalRosSystem.g:4002:4: ( (lv_parts_5_0= ruleGraphName ) )
                    // InternalRosSystem.g:4003:5: (lv_parts_5_0= ruleGraphName )
                    {
                    // InternalRosSystem.g:4003:5: (lv_parts_5_0= ruleGraphName )
                    // InternalRosSystem.g:4004:6: lv_parts_5_0= ruleGraphName
                    {

                    						newCompositeNode(grammarAccess.getGlobalNamespaceAccess().getPartsGraphNameParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_parts_5_0=ruleGraphName();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getGlobalNamespaceRule());
                    						}
                    						add(
                    							current,
                    							"parts",
                    							lv_parts_5_0,
                    							"de.fraunhofer.ipa.rossystem.RosSystem.GraphName");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRosSystem.g:4021:4: (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )*
                    loop79:
                    do {
                        int alt79=2;
                        int LA79_0 = input.LA(1);

                        if ( (LA79_0==27) ) {
                            alt79=1;
                        }


                        switch (alt79) {
                    	case 1 :
                    	    // InternalRosSystem.g:4022:5: otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) )
                    	    {
                    	    otherlv_6=(Token)match(input,27,FOLLOW_79); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getGlobalNamespaceAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalRosSystem.g:4026:5: ( (lv_parts_7_0= ruleGraphName ) )
                    	    // InternalRosSystem.g:4027:6: (lv_parts_7_0= ruleGraphName )
                    	    {
                    	    // InternalRosSystem.g:4027:6: (lv_parts_7_0= ruleGraphName )
                    	    // InternalRosSystem.g:4028:7: lv_parts_7_0= ruleGraphName
                    	    {

                    	    							newCompositeNode(grammarAccess.getGlobalNamespaceAccess().getPartsGraphNameParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_16);
                    	    lv_parts_7_0=ruleGraphName();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getGlobalNamespaceRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parts",
                    	    								lv_parts_7_0,
                    	    								"de.fraunhofer.ipa.rossystem.RosSystem.GraphName");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop79;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,31,FOLLOW_27); 

                    				newLeafNode(otherlv_8, grammarAccess.getGlobalNamespaceAccess().getRightCurlyBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            otherlv_9=(Token)match(input,31,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getGlobalNamespaceAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleGlobalNamespace"


    // $ANTLR start "entryRuleRelativeNamespace_Impl"
    // InternalRosSystem.g:4059:1: entryRuleRelativeNamespace_Impl returns [EObject current=null] : iv_ruleRelativeNamespace_Impl= ruleRelativeNamespace_Impl EOF ;
    public final EObject entryRuleRelativeNamespace_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelativeNamespace_Impl = null;


        try {
            // InternalRosSystem.g:4059:63: (iv_ruleRelativeNamespace_Impl= ruleRelativeNamespace_Impl EOF )
            // InternalRosSystem.g:4060:2: iv_ruleRelativeNamespace_Impl= ruleRelativeNamespace_Impl EOF
            {
             newCompositeNode(grammarAccess.getRelativeNamespace_ImplRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRelativeNamespace_Impl=ruleRelativeNamespace_Impl();

            state._fsp--;

             current =iv_ruleRelativeNamespace_Impl; 
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
    // $ANTLR end "entryRuleRelativeNamespace_Impl"


    // $ANTLR start "ruleRelativeNamespace_Impl"
    // InternalRosSystem.g:4066:1: ruleRelativeNamespace_Impl returns [EObject current=null] : ( () otherlv_1= 'RelativeNamespace' otherlv_2= '{' (otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleGraphName ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) ;
    public final EObject ruleRelativeNamespace_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_parts_5_0 = null;

        AntlrDatatypeRuleToken lv_parts_7_0 = null;



        	enterRule();

        try {
            // InternalRosSystem.g:4072:2: ( ( () otherlv_1= 'RelativeNamespace' otherlv_2= '{' (otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleGraphName ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) )
            // InternalRosSystem.g:4073:2: ( () otherlv_1= 'RelativeNamespace' otherlv_2= '{' (otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleGraphName ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            {
            // InternalRosSystem.g:4073:2: ( () otherlv_1= 'RelativeNamespace' otherlv_2= '{' (otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleGraphName ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            // InternalRosSystem.g:4074:3: () otherlv_1= 'RelativeNamespace' otherlv_2= '{' (otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleGraphName ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )* otherlv_8= '}' )? otherlv_9= '}'
            {
            // InternalRosSystem.g:4074:3: ()
            // InternalRosSystem.g:4075:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRelativeNamespace_ImplAccess().getRelativeNamespaceAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,81,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getRelativeNamespace_ImplAccess().getRelativeNamespaceKeyword_1());
            		
            otherlv_2=(Token)match(input,23,FOLLOW_78); 

            			newLeafNode(otherlv_2, grammarAccess.getRelativeNamespace_ImplAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalRosSystem.g:4089:3: (otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleGraphName ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )* otherlv_8= '}' )?
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==80) ) {
                alt82=1;
            }
            switch (alt82) {
                case 1 :
                    // InternalRosSystem.g:4090:4: otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleGraphName ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,80,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getRelativeNamespace_ImplAccess().getPartsKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,23,FOLLOW_79); 

                    				newLeafNode(otherlv_4, grammarAccess.getRelativeNamespace_ImplAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalRosSystem.g:4098:4: ( (lv_parts_5_0= ruleGraphName ) )
                    // InternalRosSystem.g:4099:5: (lv_parts_5_0= ruleGraphName )
                    {
                    // InternalRosSystem.g:4099:5: (lv_parts_5_0= ruleGraphName )
                    // InternalRosSystem.g:4100:6: lv_parts_5_0= ruleGraphName
                    {

                    						newCompositeNode(grammarAccess.getRelativeNamespace_ImplAccess().getPartsGraphNameParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_parts_5_0=ruleGraphName();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRelativeNamespace_ImplRule());
                    						}
                    						add(
                    							current,
                    							"parts",
                    							lv_parts_5_0,
                    							"de.fraunhofer.ipa.rossystem.RosSystem.GraphName");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRosSystem.g:4117:4: (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )*
                    loop81:
                    do {
                        int alt81=2;
                        int LA81_0 = input.LA(1);

                        if ( (LA81_0==27) ) {
                            alt81=1;
                        }


                        switch (alt81) {
                    	case 1 :
                    	    // InternalRosSystem.g:4118:5: otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) )
                    	    {
                    	    otherlv_6=(Token)match(input,27,FOLLOW_79); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getRelativeNamespace_ImplAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalRosSystem.g:4122:5: ( (lv_parts_7_0= ruleGraphName ) )
                    	    // InternalRosSystem.g:4123:6: (lv_parts_7_0= ruleGraphName )
                    	    {
                    	    // InternalRosSystem.g:4123:6: (lv_parts_7_0= ruleGraphName )
                    	    // InternalRosSystem.g:4124:7: lv_parts_7_0= ruleGraphName
                    	    {

                    	    							newCompositeNode(grammarAccess.getRelativeNamespace_ImplAccess().getPartsGraphNameParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_16);
                    	    lv_parts_7_0=ruleGraphName();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRelativeNamespace_ImplRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parts",
                    	    								lv_parts_7_0,
                    	    								"de.fraunhofer.ipa.rossystem.RosSystem.GraphName");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop81;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,31,FOLLOW_27); 

                    				newLeafNode(otherlv_8, grammarAccess.getRelativeNamespace_ImplAccess().getRightCurlyBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            otherlv_9=(Token)match(input,31,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getRelativeNamespace_ImplAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleRelativeNamespace_Impl"


    // $ANTLR start "entryRulePrivateNamespace"
    // InternalRosSystem.g:4155:1: entryRulePrivateNamespace returns [EObject current=null] : iv_rulePrivateNamespace= rulePrivateNamespace EOF ;
    public final EObject entryRulePrivateNamespace() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrivateNamespace = null;


        try {
            // InternalRosSystem.g:4155:57: (iv_rulePrivateNamespace= rulePrivateNamespace EOF )
            // InternalRosSystem.g:4156:2: iv_rulePrivateNamespace= rulePrivateNamespace EOF
            {
             newCompositeNode(grammarAccess.getPrivateNamespaceRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrivateNamespace=rulePrivateNamespace();

            state._fsp--;

             current =iv_rulePrivateNamespace; 
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
    // $ANTLR end "entryRulePrivateNamespace"


    // $ANTLR start "rulePrivateNamespace"
    // InternalRosSystem.g:4162:1: rulePrivateNamespace returns [EObject current=null] : ( () otherlv_1= 'PrivateNamespace' otherlv_2= '{' (otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleGraphName ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) ;
    public final EObject rulePrivateNamespace() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_parts_5_0 = null;

        AntlrDatatypeRuleToken lv_parts_7_0 = null;



        	enterRule();

        try {
            // InternalRosSystem.g:4168:2: ( ( () otherlv_1= 'PrivateNamespace' otherlv_2= '{' (otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleGraphName ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) )
            // InternalRosSystem.g:4169:2: ( () otherlv_1= 'PrivateNamespace' otherlv_2= '{' (otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleGraphName ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            {
            // InternalRosSystem.g:4169:2: ( () otherlv_1= 'PrivateNamespace' otherlv_2= '{' (otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleGraphName ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            // InternalRosSystem.g:4170:3: () otherlv_1= 'PrivateNamespace' otherlv_2= '{' (otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleGraphName ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )* otherlv_8= '}' )? otherlv_9= '}'
            {
            // InternalRosSystem.g:4170:3: ()
            // InternalRosSystem.g:4171:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPrivateNamespaceAccess().getPrivateNamespaceAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,82,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getPrivateNamespaceAccess().getPrivateNamespaceKeyword_1());
            		
            otherlv_2=(Token)match(input,23,FOLLOW_78); 

            			newLeafNode(otherlv_2, grammarAccess.getPrivateNamespaceAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalRosSystem.g:4185:3: (otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleGraphName ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )* otherlv_8= '}' )?
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==80) ) {
                alt84=1;
            }
            switch (alt84) {
                case 1 :
                    // InternalRosSystem.g:4186:4: otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleGraphName ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,80,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getPrivateNamespaceAccess().getPartsKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,23,FOLLOW_79); 

                    				newLeafNode(otherlv_4, grammarAccess.getPrivateNamespaceAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalRosSystem.g:4194:4: ( (lv_parts_5_0= ruleGraphName ) )
                    // InternalRosSystem.g:4195:5: (lv_parts_5_0= ruleGraphName )
                    {
                    // InternalRosSystem.g:4195:5: (lv_parts_5_0= ruleGraphName )
                    // InternalRosSystem.g:4196:6: lv_parts_5_0= ruleGraphName
                    {

                    						newCompositeNode(grammarAccess.getPrivateNamespaceAccess().getPartsGraphNameParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_parts_5_0=ruleGraphName();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPrivateNamespaceRule());
                    						}
                    						add(
                    							current,
                    							"parts",
                    							lv_parts_5_0,
                    							"de.fraunhofer.ipa.rossystem.RosSystem.GraphName");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRosSystem.g:4213:4: (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )*
                    loop83:
                    do {
                        int alt83=2;
                        int LA83_0 = input.LA(1);

                        if ( (LA83_0==27) ) {
                            alt83=1;
                        }


                        switch (alt83) {
                    	case 1 :
                    	    // InternalRosSystem.g:4214:5: otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) )
                    	    {
                    	    otherlv_6=(Token)match(input,27,FOLLOW_79); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getPrivateNamespaceAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalRosSystem.g:4218:5: ( (lv_parts_7_0= ruleGraphName ) )
                    	    // InternalRosSystem.g:4219:6: (lv_parts_7_0= ruleGraphName )
                    	    {
                    	    // InternalRosSystem.g:4219:6: (lv_parts_7_0= ruleGraphName )
                    	    // InternalRosSystem.g:4220:7: lv_parts_7_0= ruleGraphName
                    	    {

                    	    							newCompositeNode(grammarAccess.getPrivateNamespaceAccess().getPartsGraphNameParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_16);
                    	    lv_parts_7_0=ruleGraphName();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getPrivateNamespaceRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parts",
                    	    								lv_parts_7_0,
                    	    								"de.fraunhofer.ipa.rossystem.RosSystem.GraphName");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop83;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,31,FOLLOW_27); 

                    				newLeafNode(otherlv_8, grammarAccess.getPrivateNamespaceAccess().getRightCurlyBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            otherlv_9=(Token)match(input,31,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getPrivateNamespaceAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "rulePrivateNamespace"


    // $ANTLR start "entryRuleGraphName"
    // InternalRosSystem.g:4251:1: entryRuleGraphName returns [String current=null] : iv_ruleGraphName= ruleGraphName EOF ;
    public final String entryRuleGraphName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleGraphName = null;


        try {
            // InternalRosSystem.g:4251:49: (iv_ruleGraphName= ruleGraphName EOF )
            // InternalRosSystem.g:4252:2: iv_ruleGraphName= ruleGraphName EOF
            {
             newCompositeNode(grammarAccess.getGraphNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGraphName=ruleGraphName();

            state._fsp--;

             current =iv_ruleGraphName.getText(); 
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
    // $ANTLR end "entryRuleGraphName"


    // $ANTLR start "ruleGraphName"
    // InternalRosSystem.g:4258:1: ruleGraphName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'GraphName' ;
    public final AntlrDatatypeRuleToken ruleGraphName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalRosSystem.g:4264:2: (kw= 'GraphName' )
            // InternalRosSystem.g:4265:2: kw= 'GraphName'
            {
            kw=(Token)match(input,83,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getGraphNameAccess().getGraphNameKeyword());
            	

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
    // $ANTLR end "ruleGraphName"

    // Delegated rules


    protected DFA65 dfa65 = new DFA65(this);
    static final String dfa_1s = "\13\uffff";
    static final String dfa_2s = "\1\7\12\uffff";
    static final String dfa_3s = "\1\4\5\uffff\1\4\1\uffff\2\27\1\uffff";
    static final String dfa_4s = "\1\37\5\uffff\1\37\1\uffff\2\37\1\uffff";
    static final String dfa_5s = "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\uffff\1\7\2\uffff\1\6";
    static final String dfa_6s = "\13\uffff}>";
    static final String[] dfa_7s = {
            "\2\1\1\2\1\5\1\4\1\3\15\uffff\1\6\3\uffff\2\7\2\uffff\1\7",
            "",
            "",
            "",
            "",
            "",
            "\1\10\1\11\4\12\15\uffff\1\12\3\uffff\1\12\3\uffff\1\12",
            "",
            "\1\7\3\uffff\1\12\3\uffff\1\12",
            "\1\7\3\uffff\1\12\3\uffff\1\12",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA65 extends DFA {

        public DFA65(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 65;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "2602:2: (this_ParameterString_0= ruleParameterString | this_ParameterBase64_1= ruleParameterBase64 | this_ParameterInteger_2= ruleParameterInteger | this_ParameterDouble_3= ruleParameterDouble | this_ParameterBoolean_4= ruleParameterBoolean | this_ParameterList_5= ruleParameterList | this_ParameterStruct_6= ruleParameterStruct )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000007E2000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000400010000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000007E0000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000010010000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x00000007C0000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000880000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000088000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000780000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000004080000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000680000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000008080000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000480000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000080000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000040082000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000040080000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000080010000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000300000000002L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000000000L,0x0000000000003EE0L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x00000000008003F0L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x007F800080000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x007F000080000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x007E000080000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x007C000080000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0078000080000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0070000080000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0060000080000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0040000080000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000000800030L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0300000000000000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0900000000000000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x2100000000000000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x8100000000000000L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0100000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0000200080000000L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0000B00080000000L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0000000000000000L,0x0000000000068000L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0000300080000000L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x0000000080000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_77 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_78 = new BitSet(new long[]{0x0000000080000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_79 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});

}