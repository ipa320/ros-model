package de.fraunhofer.ipa.rossystem.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRosSystemLexer extends Lexer {
    public static final int RULE_HEX=15;
    public static final int T__50=50;
    public static final int RULE_SIGN=12;
    public static final int RULE_BOOLEAN=7;
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
    public static final int RULE_DIGIT=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=9;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=17;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=18;
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
    public static final int RULE_DECINT=11;
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
    public static final int RULE_WS=19;
    public static final int RULE_SIGNED_INT=13;
    public static final int RULE_ANY_OTHER=20;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int RULE_HEX_DIGIT=14;
    public static final int T__46=46;
    public static final int RULE_BINARY=6;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__84=84;
    public static final int RULE_BINARY_DIGIT=16;
    public static final int T__41=41;
    public static final int T__85=85;
    public static final int T__42=42;
    public static final int T__86=86;
    public static final int T__43=43;

    // delegates
    // delegators

    public InternalRosSystemLexer() {;} 
    public InternalRosSystemLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalRosSystemLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalRosSystem.g"; }

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystem.g:11:7: ( 'RosSystem' )
            // InternalRosSystem.g:11:9: 'RosSystem'
            {
            match("RosSystem"); 


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
            // InternalRosSystem.g:12:7: ( '{' )
            // InternalRosSystem.g:12:9: '{'
            {
            match('{'); 

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
            // InternalRosSystem.g:13:7: ( 'Name' )
            // InternalRosSystem.g:13:9: 'Name'
            {
            match("Name"); 


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
            // InternalRosSystem.g:14:7: ( 'RosComponents' )
            // InternalRosSystem.g:14:9: 'RosComponents'
            {
            match("RosComponents"); 


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
            // InternalRosSystem.g:15:7: ( '(' )
            // InternalRosSystem.g:15:9: '('
            {
            match('('); 

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
            // InternalRosSystem.g:16:7: ( ',' )
            // InternalRosSystem.g:16:9: ','
            {
            match(','); 

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
            // InternalRosSystem.g:17:7: ( ')' )
            // InternalRosSystem.g:17:9: ')'
            {
            match(')'); 

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
            // InternalRosSystem.g:18:7: ( 'TopicConnections' )
            // InternalRosSystem.g:18:9: 'TopicConnections'
            {
            match("TopicConnections"); 


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
            // InternalRosSystem.g:19:7: ( '}' )
            // InternalRosSystem.g:19:9: '}'
            {
            match('}'); 

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
            // InternalRosSystem.g:20:7: ( 'ServiceConnections' )
            // InternalRosSystem.g:20:9: 'ServiceConnections'
            {
            match("ServiceConnections"); 


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
            // InternalRosSystem.g:21:7: ( 'ActionConnections' )
            // InternalRosSystem.g:21:9: 'ActionConnections'
            {
            match("ActionConnections"); 


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
            // InternalRosSystem.g:22:7: ( 'Parameters' )
            // InternalRosSystem.g:22:9: 'Parameters'
            {
            match("Parameters"); 


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
            // InternalRosSystem.g:23:7: ( 'TopicConnection' )
            // InternalRosSystem.g:23:9: 'TopicConnection'
            {
            match("TopicConnection"); 


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
            // InternalRosSystem.g:24:7: ( 'From' )
            // InternalRosSystem.g:24:9: 'From'
            {
            match("From"); 


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
            // InternalRosSystem.g:25:7: ( 'To' )
            // InternalRosSystem.g:25:9: 'To'
            {
            match("To"); 


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
            // InternalRosSystem.g:26:7: ( 'ServiceConnection' )
            // InternalRosSystem.g:26:9: 'ServiceConnection'
            {
            match("ServiceConnection"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystem.g:27:7: ( 'ActionConnection' )
            // InternalRosSystem.g:27:9: 'ActionConnection'
            {
            match("ActionConnection"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystem.g:28:7: ( 'ComponentInterface' )
            // InternalRosSystem.g:28:9: 'ComponentInterface'
            {
            match("ComponentInterface"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystem.g:29:7: ( 'name' )
            // InternalRosSystem.g:29:9: 'name'
            {
            match("name"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystem.g:30:7: ( 'NameSpace' )
            // InternalRosSystem.g:30:9: 'NameSpace'
            {
            match("NameSpace"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystem.g:31:7: ( 'RosPublishers' )
            // InternalRosSystem.g:31:9: 'RosPublishers'
            {
            match("RosPublishers"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystem.g:32:7: ( 'RosSubscribers' )
            // InternalRosSystem.g:32:9: 'RosSubscribers'
            {
            match("RosSubscribers"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystem.g:33:7: ( 'RosSrvServers' )
            // InternalRosSystem.g:33:9: 'RosSrvServers'
            {
            match("RosSrvServers"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystem.g:34:7: ( 'RosSrvClients' )
            // InternalRosSystem.g:34:9: 'RosSrvClients'
            {
            match("RosSrvClients"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystem.g:35:7: ( 'RosActionServers' )
            // InternalRosSystem.g:35:9: 'RosActionServers'
            {
            match("RosActionServers"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystem.g:36:7: ( 'RosActionClients' )
            // InternalRosSystem.g:36:9: 'RosActionClients'
            {
            match("RosActionClients"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystem.g:37:7: ( 'RosParameters' )
            // InternalRosSystem.g:37:9: 'RosParameters'
            {
            match("RosParameters"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystem.g:38:7: ( 'RosPublisher' )
            // InternalRosSystem.g:38:9: 'RosPublisher'
            {
            match("RosPublisher"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystem.g:39:7: ( 'ns' )
            // InternalRosSystem.g:39:9: 'ns'
            {
            match("ns"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystem.g:40:7: ( 'RefPublisher' )
            // InternalRosSystem.g:40:9: 'RefPublisher'
            {
            match("RefPublisher"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystem.g:41:7: ( 'RosSubscriber' )
            // InternalRosSystem.g:41:9: 'RosSubscriber'
            {
            match("RosSubscriber"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystem.g:42:7: ( 'RefSubscriber' )
            // InternalRosSystem.g:42:9: 'RefSubscriber'
            {
            match("RefSubscriber"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystem.g:43:7: ( 'RosServiceServer' )
            // InternalRosSystem.g:43:9: 'RosServiceServer'
            {
            match("RosServiceServer"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystem.g:44:7: ( 'RefServer' )
            // InternalRosSystem.g:44:9: 'RefServer'
            {
            match("RefServer"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystem.g:45:7: ( 'RosServiceClient' )
            // InternalRosSystem.g:45:9: 'RosServiceClient'
            {
            match("RosServiceClient"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystem.g:46:7: ( 'RefClient' )
            // InternalRosSystem.g:46:9: 'RefClient'
            {
            match("RefClient"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystem.g:47:7: ( 'RosActionServer' )
            // InternalRosSystem.g:47:9: 'RosActionServer'
            {
            match("RosActionServer"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystem.g:48:7: ( 'RosActionClient' )
            // InternalRosSystem.g:48:9: 'RosActionClient'
            {
            match("RosActionClient"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystem.g:49:7: ( 'RosParameter' )
            // InternalRosSystem.g:49:9: 'RosParameter'
            {
            match("RosParameter"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystem.g:50:7: ( 'RefParameter' )
            // InternalRosSystem.g:50:9: 'RefParameter'
            {
            match("RefParameter"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystem.g:51:7: ( 'Parameter' )
            // InternalRosSystem.g:51:9: 'Parameter'
            {
            match("Parameter"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystem.g:52:7: ( 'type' )
            // InternalRosSystem.g:52:9: 'type'
            {
            match("type"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystem.g:53:7: ( 'value' )
            // InternalRosSystem.g:53:9: 'value'
            {
            match("value"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystem.g:54:7: ( 'GlobalNamespace' )
            // InternalRosSystem.g:54:9: 'GlobalNamespace'
            {
            match("GlobalNamespace"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystem.g:55:7: ( 'parts' )
            // InternalRosSystem.g:55:9: 'parts'
            {
            match("parts"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystem.g:56:7: ( 'RelativeNamespace' )
            // InternalRosSystem.g:56:9: 'RelativeNamespace'
            {
            match("RelativeNamespace"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystem.g:57:7: ( 'PrivateNamespace' )
            // InternalRosSystem.g:57:9: 'PrivateNamespace'
            {
            match("PrivateNamespace"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystem.g:58:7: ( 'GraphName' )
            // InternalRosSystem.g:58:9: 'GraphName'
            {
            match("GraphName"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystem.g:59:7: ( 'List' )
            // InternalRosSystem.g:59:9: 'List'
            {
            match("List"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__69"

    // $ANTLR start "T__70"
    public final void mT__70() throws RecognitionException {
        try {
            int _type = T__70;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystem.g:60:7: ( 'sequence' )
            // InternalRosSystem.g:60:9: 'sequence'
            {
            match("sequence"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__70"

    // $ANTLR start "T__71"
    public final void mT__71() throws RecognitionException {
        try {
            int _type = T__71;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystem.g:61:7: ( 'default' )
            // InternalRosSystem.g:61:9: 'default'
            {
            match("default"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__71"

    // $ANTLR start "T__72"
    public final void mT__72() throws RecognitionException {
        try {
            int _type = T__72;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystem.g:62:7: ( 'Struct' )
            // InternalRosSystem.g:62:9: 'Struct'
            {
            match("Struct"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__72"

    // $ANTLR start "T__73"
    public final void mT__73() throws RecognitionException {
        try {
            int _type = T__73;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystem.g:63:7: ( 'parameterstructypetmember' )
            // InternalRosSystem.g:63:9: 'parameterstructypetmember'
            {
            match("parameterstructypetmember"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__73"

    // $ANTLR start "T__74"
    public final void mT__74() throws RecognitionException {
        try {
            int _type = T__74;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystem.g:64:7: ( 'Integer' )
            // InternalRosSystem.g:64:9: 'Integer'
            {
            match("Integer"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__74"

    // $ANTLR start "T__75"
    public final void mT__75() throws RecognitionException {
        try {
            int _type = T__75;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystem.g:65:7: ( 'String' )
            // InternalRosSystem.g:65:9: 'String'
            {
            match("String"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__75"

    // $ANTLR start "T__76"
    public final void mT__76() throws RecognitionException {
        try {
            int _type = T__76;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystem.g:66:7: ( 'Double' )
            // InternalRosSystem.g:66:9: 'Double'
            {
            match("Double"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__76"

    // $ANTLR start "T__77"
    public final void mT__77() throws RecognitionException {
        try {
            int _type = T__77;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystem.g:67:7: ( 'Date' )
            // InternalRosSystem.g:67:9: 'Date'
            {
            match("Date"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__77"

    // $ANTLR start "T__78"
    public final void mT__78() throws RecognitionException {
        try {
            int _type = T__78;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystem.g:68:7: ( 'Boolean' )
            // InternalRosSystem.g:68:9: 'Boolean'
            {
            match("Boolean"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__78"

    // $ANTLR start "T__79"
    public final void mT__79() throws RecognitionException {
        try {
            int _type = T__79;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystem.g:69:7: ( 'Base64' )
            // InternalRosSystem.g:69:9: 'Base64'
            {
            match("Base64"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__79"

    // $ANTLR start "T__80"
    public final void mT__80() throws RecognitionException {
        try {
            int _type = T__80;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystem.g:70:7: ( 'Any' )
            // InternalRosSystem.g:70:9: 'Any'
            {
            match("Any"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__80"

    // $ANTLR start "T__81"
    public final void mT__81() throws RecognitionException {
        try {
            int _type = T__81;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystem.g:71:7: ( 'Array' )
            // InternalRosSystem.g:71:9: 'Array'
            {
            match("Array"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__81"

    // $ANTLR start "T__82"
    public final void mT__82() throws RecognitionException {
        try {
            int _type = T__82;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystem.g:72:7: ( 'ParameterAny' )
            // InternalRosSystem.g:72:9: 'ParameterAny'
            {
            match("ParameterAny"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__82"

    // $ANTLR start "T__83"
    public final void mT__83() throws RecognitionException {
        try {
            int _type = T__83;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystem.g:73:7: ( 'ParameterStruct' )
            // InternalRosSystem.g:73:9: 'ParameterStruct'
            {
            match("ParameterStruct"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__83"

    // $ANTLR start "T__84"
    public final void mT__84() throws RecognitionException {
        try {
            int _type = T__84;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystem.g:74:7: ( 'ParameterStructMember' )
            // InternalRosSystem.g:74:9: 'ParameterStructMember'
            {
            match("ParameterStructMember"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__84"

    // $ANTLR start "T__85"
    public final void mT__85() throws RecognitionException {
        try {
            int _type = T__85;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystem.g:75:7: ( 'ParameterStructTypeMember' )
            // InternalRosSystem.g:75:9: 'ParameterStructTypeMember'
            {
            match("ParameterStructTypeMember"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__85"

    // $ANTLR start "T__86"
    public final void mT__86() throws RecognitionException {
        try {
            int _type = T__86;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystem.g:76:7: ( 'DateTime' )
            // InternalRosSystem.g:76:9: 'DateTime'
            {
            match("DateTime"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__86"

    // $ANTLR start "RULE_BOOLEAN"
    public final void mRULE_BOOLEAN() throws RecognitionException {
        try {
            int _type = RULE_BOOLEAN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystem.g:4189:14: ( ( 'true' | 'false' ) )
            // InternalRosSystem.g:4189:16: ( 'true' | 'false' )
            {
            // InternalRosSystem.g:4189:16: ( 'true' | 'false' )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='t') ) {
                alt1=1;
            }
            else if ( (LA1_0=='f') ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalRosSystem.g:4189:17: 'true'
                    {
                    match("true"); 


                    }
                    break;
                case 2 :
                    // InternalRosSystem.g:4189:24: 'false'
                    {
                    match("false"); 


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
    // $ANTLR end "RULE_BOOLEAN"

    // $ANTLR start "RULE_DIGIT"
    public final void mRULE_DIGIT() throws RecognitionException {
        try {
            // InternalRosSystem.g:4191:21: ( '0' .. '9' )
            // InternalRosSystem.g:4191:23: '0' .. '9'
            {
            matchRange('0','9'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_DIGIT"

    // $ANTLR start "RULE_DOUBLE"
    public final void mRULE_DOUBLE() throws RecognitionException {
        try {
            int _type = RULE_DOUBLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystem.g:4193:13: ( ( RULE_DECINT ( '.' ( RULE_DIGIT )* | ( '.' ( RULE_DIGIT )* )? ( 'E' | 'e' ) ( '-' | '+' )? RULE_DECINT ) | RULE_INT ) )
            // InternalRosSystem.g:4193:15: ( RULE_DECINT ( '.' ( RULE_DIGIT )* | ( '.' ( RULE_DIGIT )* )? ( 'E' | 'e' ) ( '-' | '+' )? RULE_DECINT ) | RULE_INT )
            {
            // InternalRosSystem.g:4193:15: ( RULE_DECINT ( '.' ( RULE_DIGIT )* | ( '.' ( RULE_DIGIT )* )? ( 'E' | 'e' ) ( '-' | '+' )? RULE_DECINT ) | RULE_INT )
            int alt7=2;
            alt7 = dfa7.predict(input);
            switch (alt7) {
                case 1 :
                    // InternalRosSystem.g:4193:16: RULE_DECINT ( '.' ( RULE_DIGIT )* | ( '.' ( RULE_DIGIT )* )? ( 'E' | 'e' ) ( '-' | '+' )? RULE_DECINT )
                    {
                    mRULE_DECINT(); 
                    // InternalRosSystem.g:4193:28: ( '.' ( RULE_DIGIT )* | ( '.' ( RULE_DIGIT )* )? ( 'E' | 'e' ) ( '-' | '+' )? RULE_DECINT )
                    int alt6=2;
                    alt6 = dfa6.predict(input);
                    switch (alt6) {
                        case 1 :
                            // InternalRosSystem.g:4193:29: '.' ( RULE_DIGIT )*
                            {
                            match('.'); 
                            // InternalRosSystem.g:4193:33: ( RULE_DIGIT )*
                            loop2:
                            do {
                                int alt2=2;
                                int LA2_0 = input.LA(1);

                                if ( ((LA2_0>='0' && LA2_0<='9')) ) {
                                    alt2=1;
                                }


                                switch (alt2) {
                            	case 1 :
                            	    // InternalRosSystem.g:4193:33: RULE_DIGIT
                            	    {
                            	    mRULE_DIGIT(); 

                            	    }
                            	    break;

                            	default :
                            	    break loop2;
                                }
                            } while (true);


                            }
                            break;
                        case 2 :
                            // InternalRosSystem.g:4193:45: ( '.' ( RULE_DIGIT )* )? ( 'E' | 'e' ) ( '-' | '+' )? RULE_DECINT
                            {
                            // InternalRosSystem.g:4193:45: ( '.' ( RULE_DIGIT )* )?
                            int alt4=2;
                            int LA4_0 = input.LA(1);

                            if ( (LA4_0=='.') ) {
                                alt4=1;
                            }
                            switch (alt4) {
                                case 1 :
                                    // InternalRosSystem.g:4193:46: '.' ( RULE_DIGIT )*
                                    {
                                    match('.'); 
                                    // InternalRosSystem.g:4193:50: ( RULE_DIGIT )*
                                    loop3:
                                    do {
                                        int alt3=2;
                                        int LA3_0 = input.LA(1);

                                        if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                                            alt3=1;
                                        }


                                        switch (alt3) {
                                    	case 1 :
                                    	    // InternalRosSystem.g:4193:50: RULE_DIGIT
                                    	    {
                                    	    mRULE_DIGIT(); 

                                    	    }
                                    	    break;

                                    	default :
                                    	    break loop3;
                                        }
                                    } while (true);


                                    }
                                    break;

                            }

                            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}

                            // InternalRosSystem.g:4193:74: ( '-' | '+' )?
                            int alt5=2;
                            int LA5_0 = input.LA(1);

                            if ( (LA5_0=='+'||LA5_0=='-') ) {
                                alt5=1;
                            }
                            switch (alt5) {
                                case 1 :
                                    // InternalRosSystem.g:
                                    {
                                    if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                                        input.consume();

                                    }
                                    else {
                                        MismatchedSetException mse = new MismatchedSetException(null,input);
                                        recover(mse);
                                        throw mse;}


                                    }
                                    break;

                            }

                            mRULE_DECINT(); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // InternalRosSystem.g:4193:98: RULE_INT
                    {
                    mRULE_INT(); 

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
    // $ANTLR end "RULE_DOUBLE"

    // $ANTLR start "RULE_DECINT"
    public final void mRULE_DECINT() throws RecognitionException {
        try {
            // InternalRosSystem.g:4195:22: ( ( '0' | '1' .. '9' ( RULE_DIGIT )* ) )
            // InternalRosSystem.g:4195:24: ( '0' | '1' .. '9' ( RULE_DIGIT )* )
            {
            // InternalRosSystem.g:4195:24: ( '0' | '1' .. '9' ( RULE_DIGIT )* )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='0') ) {
                alt9=1;
            }
            else if ( ((LA9_0>='1' && LA9_0<='9')) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalRosSystem.g:4195:25: '0'
                    {
                    match('0'); 

                    }
                    break;
                case 2 :
                    // InternalRosSystem.g:4195:29: '1' .. '9' ( RULE_DIGIT )*
                    {
                    matchRange('1','9'); 
                    // InternalRosSystem.g:4195:38: ( RULE_DIGIT )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( ((LA8_0>='0' && LA8_0<='9')) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalRosSystem.g:4195:38: RULE_DIGIT
                    	    {
                    	    mRULE_DIGIT(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);


                    }
                    break;

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_DECINT"

    // $ANTLR start "RULE_SIGN"
    public final void mRULE_SIGN() throws RecognitionException {
        try {
            // InternalRosSystem.g:4197:20: ( ( '+' | '-' ) )
            // InternalRosSystem.g:4197:22: ( '+' | '-' )
            {
            if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_SIGN"

    // $ANTLR start "RULE_SIGNED_INT"
    public final void mRULE_SIGNED_INT() throws RecognitionException {
        try {
            int _type = RULE_SIGNED_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystem.g:4199:17: ( ( '-' )* ( RULE_INT )* )
            // InternalRosSystem.g:4199:19: ( '-' )* ( RULE_INT )*
            {
            // InternalRosSystem.g:4199:19: ( '-' )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0=='-') ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalRosSystem.g:4199:19: '-'
            	    {
            	    match('-'); 

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            // InternalRosSystem.g:4199:24: ( RULE_INT )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='0' && LA11_0<='9')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalRosSystem.g:4199:24: RULE_INT
            	    {
            	    mRULE_INT(); 

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SIGNED_INT"

    // $ANTLR start "RULE_HEX_DIGIT"
    public final void mRULE_HEX_DIGIT() throws RecognitionException {
        try {
            // InternalRosSystem.g:4201:25: ( ( RULE_DIGIT | 'a' .. 'f' | 'A' .. 'F' ) )
            // InternalRosSystem.g:4201:27: ( RULE_DIGIT | 'a' .. 'f' | 'A' .. 'F' )
            {
            if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_HEX_DIGIT"

    // $ANTLR start "RULE_HEX"
    public final void mRULE_HEX() throws RecognitionException {
        try {
            int _type = RULE_HEX;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystem.g:4203:10: ( '0x' ( RULE_HEX_DIGIT )* )
            // InternalRosSystem.g:4203:12: '0x' ( RULE_HEX_DIGIT )*
            {
            match("0x"); 

            // InternalRosSystem.g:4203:17: ( RULE_HEX_DIGIT )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='0' && LA12_0<='9')||(LA12_0>='A' && LA12_0<='F')||(LA12_0>='a' && LA12_0<='f')) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalRosSystem.g:4203:17: RULE_HEX_DIGIT
            	    {
            	    mRULE_HEX_DIGIT(); 

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
    // $ANTLR end "RULE_HEX"

    // $ANTLR start "RULE_BINARY_DIGIT"
    public final void mRULE_BINARY_DIGIT() throws RecognitionException {
        try {
            // InternalRosSystem.g:4205:28: ( ( '0' | '1' ) )
            // InternalRosSystem.g:4205:30: ( '0' | '1' )
            {
            if ( (input.LA(1)>='0' && input.LA(1)<='1') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_BINARY_DIGIT"

    // $ANTLR start "RULE_BINARY"
    public final void mRULE_BINARY() throws RecognitionException {
        try {
            int _type = RULE_BINARY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystem.g:4207:13: ( '0b' ( RULE_BINARY_DIGIT ( '_' )* )* )
            // InternalRosSystem.g:4207:15: '0b' ( RULE_BINARY_DIGIT ( '_' )* )*
            {
            match("0b"); 

            // InternalRosSystem.g:4207:20: ( RULE_BINARY_DIGIT ( '_' )* )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>='0' && LA14_0<='1')) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalRosSystem.g:4207:21: RULE_BINARY_DIGIT ( '_' )*
            	    {
            	    mRULE_BINARY_DIGIT(); 
            	    // InternalRosSystem.g:4207:39: ( '_' )*
            	    loop13:
            	    do {
            	        int alt13=2;
            	        int LA13_0 = input.LA(1);

            	        if ( (LA13_0=='_') ) {
            	            alt13=1;
            	        }


            	        switch (alt13) {
            	    	case 1 :
            	    	    // InternalRosSystem.g:4207:39: '_'
            	    	    {
            	    	    match('_'); 

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop13;
            	        }
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_BINARY"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystem.g:4209:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalRosSystem.g:4209:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalRosSystem.g:4209:11: ( '^' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0=='^') ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalRosSystem.g:4209:11: '^'
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

            // InternalRosSystem.g:4209:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>='0' && LA16_0<='9')||(LA16_0>='A' && LA16_0<='Z')||LA16_0=='_'||(LA16_0>='a' && LA16_0<='z')) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalRosSystem.g:
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
            	    break loop16;
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
            // InternalRosSystem.g:4211:10: ( ( '0' .. '9' )+ )
            // InternalRosSystem.g:4211:12: ( '0' .. '9' )+
            {
            // InternalRosSystem.g:4211:12: ( '0' .. '9' )+
            int cnt17=0;
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>='0' && LA17_0<='9')) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalRosSystem.g:4211:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

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
            // InternalRosSystem.g:4213:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalRosSystem.g:4213:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalRosSystem.g:4213:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0=='\"') ) {
                alt20=1;
            }
            else if ( (LA20_0=='\'') ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalRosSystem.g:4213:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalRosSystem.g:4213:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop18:
                    do {
                        int alt18=3;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0=='\\') ) {
                            alt18=1;
                        }
                        else if ( ((LA18_0>='\u0000' && LA18_0<='!')||(LA18_0>='#' && LA18_0<='[')||(LA18_0>=']' && LA18_0<='\uFFFF')) ) {
                            alt18=2;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // InternalRosSystem.g:4213:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalRosSystem.g:4213:28: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop18;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalRosSystem.g:4213:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalRosSystem.g:4213:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop19:
                    do {
                        int alt19=3;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0=='\\') ) {
                            alt19=1;
                        }
                        else if ( ((LA19_0>='\u0000' && LA19_0<='&')||(LA19_0>='(' && LA19_0<='[')||(LA19_0>=']' && LA19_0<='\uFFFF')) ) {
                            alt19=2;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // InternalRosSystem.g:4213:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalRosSystem.g:4213:61: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop19;
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
            // InternalRosSystem.g:4215:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalRosSystem.g:4215:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalRosSystem.g:4215:24: ( options {greedy=false; } : . )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0=='*') ) {
                    int LA21_1 = input.LA(2);

                    if ( (LA21_1=='/') ) {
                        alt21=2;
                    }
                    else if ( ((LA21_1>='\u0000' && LA21_1<='.')||(LA21_1>='0' && LA21_1<='\uFFFF')) ) {
                        alt21=1;
                    }


                }
                else if ( ((LA21_0>='\u0000' && LA21_0<=')')||(LA21_0>='+' && LA21_0<='\uFFFF')) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalRosSystem.g:4215:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop21;
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
            // InternalRosSystem.g:4217:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalRosSystem.g:4217:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalRosSystem.g:4217:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>='\u0000' && LA22_0<='\t')||(LA22_0>='\u000B' && LA22_0<='\f')||(LA22_0>='\u000E' && LA22_0<='\uFFFF')) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalRosSystem.g:4217:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop22;
                }
            } while (true);

            // InternalRosSystem.g:4217:40: ( ( '\\r' )? '\\n' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0=='\n'||LA24_0=='\r') ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalRosSystem.g:4217:41: ( '\\r' )? '\\n'
                    {
                    // InternalRosSystem.g:4217:41: ( '\\r' )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0=='\r') ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // InternalRosSystem.g:4217:41: '\\r'
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
            // InternalRosSystem.g:4219:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalRosSystem.g:4219:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalRosSystem.g:4219:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt25=0;
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( ((LA25_0>='\t' && LA25_0<='\n')||LA25_0=='\r'||LA25_0==' ') ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalRosSystem.g:
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
            	    if ( cnt25 >= 1 ) break loop25;
                        EarlyExitException eee =
                            new EarlyExitException(25, input);
                        throw eee;
                }
                cnt25++;
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
            // InternalRosSystem.g:4221:16: ( . )
            // InternalRosSystem.g:4221:18: .
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
        // InternalRosSystem.g:1:8: ( T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | RULE_BOOLEAN | RULE_DOUBLE | RULE_SIGNED_INT | RULE_HEX | RULE_BINARY | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt26=78;
        alt26 = dfa26.predict(input);
        switch (alt26) {
            case 1 :
                // InternalRosSystem.g:1:10: T__21
                {
                mT__21(); 

                }
                break;
            case 2 :
                // InternalRosSystem.g:1:16: T__22
                {
                mT__22(); 

                }
                break;
            case 3 :
                // InternalRosSystem.g:1:22: T__23
                {
                mT__23(); 

                }
                break;
            case 4 :
                // InternalRosSystem.g:1:28: T__24
                {
                mT__24(); 

                }
                break;
            case 5 :
                // InternalRosSystem.g:1:34: T__25
                {
                mT__25(); 

                }
                break;
            case 6 :
                // InternalRosSystem.g:1:40: T__26
                {
                mT__26(); 

                }
                break;
            case 7 :
                // InternalRosSystem.g:1:46: T__27
                {
                mT__27(); 

                }
                break;
            case 8 :
                // InternalRosSystem.g:1:52: T__28
                {
                mT__28(); 

                }
                break;
            case 9 :
                // InternalRosSystem.g:1:58: T__29
                {
                mT__29(); 

                }
                break;
            case 10 :
                // InternalRosSystem.g:1:64: T__30
                {
                mT__30(); 

                }
                break;
            case 11 :
                // InternalRosSystem.g:1:70: T__31
                {
                mT__31(); 

                }
                break;
            case 12 :
                // InternalRosSystem.g:1:76: T__32
                {
                mT__32(); 

                }
                break;
            case 13 :
                // InternalRosSystem.g:1:82: T__33
                {
                mT__33(); 

                }
                break;
            case 14 :
                // InternalRosSystem.g:1:88: T__34
                {
                mT__34(); 

                }
                break;
            case 15 :
                // InternalRosSystem.g:1:94: T__35
                {
                mT__35(); 

                }
                break;
            case 16 :
                // InternalRosSystem.g:1:100: T__36
                {
                mT__36(); 

                }
                break;
            case 17 :
                // InternalRosSystem.g:1:106: T__37
                {
                mT__37(); 

                }
                break;
            case 18 :
                // InternalRosSystem.g:1:112: T__38
                {
                mT__38(); 

                }
                break;
            case 19 :
                // InternalRosSystem.g:1:118: T__39
                {
                mT__39(); 

                }
                break;
            case 20 :
                // InternalRosSystem.g:1:124: T__40
                {
                mT__40(); 

                }
                break;
            case 21 :
                // InternalRosSystem.g:1:130: T__41
                {
                mT__41(); 

                }
                break;
            case 22 :
                // InternalRosSystem.g:1:136: T__42
                {
                mT__42(); 

                }
                break;
            case 23 :
                // InternalRosSystem.g:1:142: T__43
                {
                mT__43(); 

                }
                break;
            case 24 :
                // InternalRosSystem.g:1:148: T__44
                {
                mT__44(); 

                }
                break;
            case 25 :
                // InternalRosSystem.g:1:154: T__45
                {
                mT__45(); 

                }
                break;
            case 26 :
                // InternalRosSystem.g:1:160: T__46
                {
                mT__46(); 

                }
                break;
            case 27 :
                // InternalRosSystem.g:1:166: T__47
                {
                mT__47(); 

                }
                break;
            case 28 :
                // InternalRosSystem.g:1:172: T__48
                {
                mT__48(); 

                }
                break;
            case 29 :
                // InternalRosSystem.g:1:178: T__49
                {
                mT__49(); 

                }
                break;
            case 30 :
                // InternalRosSystem.g:1:184: T__50
                {
                mT__50(); 

                }
                break;
            case 31 :
                // InternalRosSystem.g:1:190: T__51
                {
                mT__51(); 

                }
                break;
            case 32 :
                // InternalRosSystem.g:1:196: T__52
                {
                mT__52(); 

                }
                break;
            case 33 :
                // InternalRosSystem.g:1:202: T__53
                {
                mT__53(); 

                }
                break;
            case 34 :
                // InternalRosSystem.g:1:208: T__54
                {
                mT__54(); 

                }
                break;
            case 35 :
                // InternalRosSystem.g:1:214: T__55
                {
                mT__55(); 

                }
                break;
            case 36 :
                // InternalRosSystem.g:1:220: T__56
                {
                mT__56(); 

                }
                break;
            case 37 :
                // InternalRosSystem.g:1:226: T__57
                {
                mT__57(); 

                }
                break;
            case 38 :
                // InternalRosSystem.g:1:232: T__58
                {
                mT__58(); 

                }
                break;
            case 39 :
                // InternalRosSystem.g:1:238: T__59
                {
                mT__59(); 

                }
                break;
            case 40 :
                // InternalRosSystem.g:1:244: T__60
                {
                mT__60(); 

                }
                break;
            case 41 :
                // InternalRosSystem.g:1:250: T__61
                {
                mT__61(); 

                }
                break;
            case 42 :
                // InternalRosSystem.g:1:256: T__62
                {
                mT__62(); 

                }
                break;
            case 43 :
                // InternalRosSystem.g:1:262: T__63
                {
                mT__63(); 

                }
                break;
            case 44 :
                // InternalRosSystem.g:1:268: T__64
                {
                mT__64(); 

                }
                break;
            case 45 :
                // InternalRosSystem.g:1:274: T__65
                {
                mT__65(); 

                }
                break;
            case 46 :
                // InternalRosSystem.g:1:280: T__66
                {
                mT__66(); 

                }
                break;
            case 47 :
                // InternalRosSystem.g:1:286: T__67
                {
                mT__67(); 

                }
                break;
            case 48 :
                // InternalRosSystem.g:1:292: T__68
                {
                mT__68(); 

                }
                break;
            case 49 :
                // InternalRosSystem.g:1:298: T__69
                {
                mT__69(); 

                }
                break;
            case 50 :
                // InternalRosSystem.g:1:304: T__70
                {
                mT__70(); 

                }
                break;
            case 51 :
                // InternalRosSystem.g:1:310: T__71
                {
                mT__71(); 

                }
                break;
            case 52 :
                // InternalRosSystem.g:1:316: T__72
                {
                mT__72(); 

                }
                break;
            case 53 :
                // InternalRosSystem.g:1:322: T__73
                {
                mT__73(); 

                }
                break;
            case 54 :
                // InternalRosSystem.g:1:328: T__74
                {
                mT__74(); 

                }
                break;
            case 55 :
                // InternalRosSystem.g:1:334: T__75
                {
                mT__75(); 

                }
                break;
            case 56 :
                // InternalRosSystem.g:1:340: T__76
                {
                mT__76(); 

                }
                break;
            case 57 :
                // InternalRosSystem.g:1:346: T__77
                {
                mT__77(); 

                }
                break;
            case 58 :
                // InternalRosSystem.g:1:352: T__78
                {
                mT__78(); 

                }
                break;
            case 59 :
                // InternalRosSystem.g:1:358: T__79
                {
                mT__79(); 

                }
                break;
            case 60 :
                // InternalRosSystem.g:1:364: T__80
                {
                mT__80(); 

                }
                break;
            case 61 :
                // InternalRosSystem.g:1:370: T__81
                {
                mT__81(); 

                }
                break;
            case 62 :
                // InternalRosSystem.g:1:376: T__82
                {
                mT__82(); 

                }
                break;
            case 63 :
                // InternalRosSystem.g:1:382: T__83
                {
                mT__83(); 

                }
                break;
            case 64 :
                // InternalRosSystem.g:1:388: T__84
                {
                mT__84(); 

                }
                break;
            case 65 :
                // InternalRosSystem.g:1:394: T__85
                {
                mT__85(); 

                }
                break;
            case 66 :
                // InternalRosSystem.g:1:400: T__86
                {
                mT__86(); 

                }
                break;
            case 67 :
                // InternalRosSystem.g:1:406: RULE_BOOLEAN
                {
                mRULE_BOOLEAN(); 

                }
                break;
            case 68 :
                // InternalRosSystem.g:1:419: RULE_DOUBLE
                {
                mRULE_DOUBLE(); 

                }
                break;
            case 69 :
                // InternalRosSystem.g:1:431: RULE_SIGNED_INT
                {
                mRULE_SIGNED_INT(); 

                }
                break;
            case 70 :
                // InternalRosSystem.g:1:447: RULE_HEX
                {
                mRULE_HEX(); 

                }
                break;
            case 71 :
                // InternalRosSystem.g:1:456: RULE_BINARY
                {
                mRULE_BINARY(); 

                }
                break;
            case 72 :
                // InternalRosSystem.g:1:468: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 73 :
                // InternalRosSystem.g:1:476: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 74 :
                // InternalRosSystem.g:1:485: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 75 :
                // InternalRosSystem.g:1:497: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 76 :
                // InternalRosSystem.g:1:513: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 77 :
                // InternalRosSystem.g:1:529: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 78 :
                // InternalRosSystem.g:1:537: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA7 dfa7 = new DFA7(this);
    protected DFA6 dfa6 = new DFA6(this);
    protected DFA26 dfa26 = new DFA26(this);
    static final String DFA7_eotS =
        "\1\uffff\2\3\2\uffff\1\3";
    static final String DFA7_eofS =
        "\6\uffff";
    static final String DFA7_minS =
        "\1\60\2\56\2\uffff\1\56";
    static final String DFA7_maxS =
        "\1\71\2\145\2\uffff\1\145";
    static final String DFA7_acceptS =
        "\3\uffff\1\2\1\1\1\uffff";
    static final String DFA7_specialS =
        "\6\uffff}>";
    static final String[] DFA7_transitionS = {
            "\1\1\11\2",
            "\1\4\26\uffff\1\4\37\uffff\1\4",
            "\1\4\1\uffff\12\5\13\uffff\1\4\37\uffff\1\4",
            "",
            "",
            "\1\4\1\uffff\12\5\13\uffff\1\4\37\uffff\1\4"
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
            return "4193:15: ( RULE_DECINT ( '.' ( RULE_DIGIT )* | ( '.' ( RULE_DIGIT )* )? ( 'E' | 'e' ) ( '-' | '+' )? RULE_DECINT ) | RULE_INT )";
        }
    }
    static final String DFA6_eotS =
        "\1\uffff\1\4\1\uffff\1\4\1\uffff";
    static final String DFA6_eofS =
        "\5\uffff";
    static final String DFA6_minS =
        "\1\56\1\60\1\uffff\1\60\1\uffff";
    static final String DFA6_maxS =
        "\2\145\1\uffff\1\145\1\uffff";
    static final String DFA6_acceptS =
        "\2\uffff\1\2\1\uffff\1\1";
    static final String DFA6_specialS =
        "\5\uffff}>";
    static final String[] DFA6_transitionS = {
            "\1\1\26\uffff\1\2\37\uffff\1\2",
            "\12\3\13\uffff\1\2\37\uffff\1\2",
            "",
            "\12\3\13\uffff\1\2\37\uffff\1\2",
            ""
    };

    static final short[] DFA6_eot = DFA.unpackEncodedString(DFA6_eotS);
    static final short[] DFA6_eof = DFA.unpackEncodedString(DFA6_eofS);
    static final char[] DFA6_min = DFA.unpackEncodedStringToUnsignedChars(DFA6_minS);
    static final char[] DFA6_max = DFA.unpackEncodedStringToUnsignedChars(DFA6_maxS);
    static final short[] DFA6_accept = DFA.unpackEncodedString(DFA6_acceptS);
    static final short[] DFA6_special = DFA.unpackEncodedString(DFA6_specialS);
    static final short[][] DFA6_transition;

    static {
        int numStates = DFA6_transitionS.length;
        DFA6_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA6_transition[i] = DFA.unpackEncodedString(DFA6_transitionS[i]);
        }
    }

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = DFA6_eot;
            this.eof = DFA6_eof;
            this.min = DFA6_min;
            this.max = DFA6_max;
            this.accept = DFA6_accept;
            this.special = DFA6_special;
            this.transition = DFA6_transition;
        }
        public String getDescription() {
            return "4193:28: ( '.' ( RULE_DIGIT )* | ( '.' ( RULE_DIGIT )* )? ( 'E' | 'e' ) ( '-' | '+' )? RULE_DECINT )";
        }
    }
    static final String DFA26_eotS =
        "\1\35\1\47\1\uffff\1\47\3\uffff\1\47\1\uffff\21\47\2\113\2\uffff\1\44\1\uffff\3\44\2\uffff\2\47\2\uffff\1\47\3\uffff\1\127\1\uffff\12\47\1\142\17\47\3\uffff\2\113\4\uffff\5\47\1\uffff\3\47\1\u0080\6\47\1\uffff\27\47\1\u00a6\5\47\1\uffff\3\47\1\u00af\1\47\1\u00b1\1\u00b2\1\u00b3\5\47\1\u00b9\4\47\1\u00bf\22\47\1\uffff\5\47\1\u00d7\2\47\1\uffff\1\47\3\uffff\1\u00db\2\47\1\u00de\1\47\1\uffff\5\47\1\uffff\2\47\1\u00b3\21\47\1\u00f9\1\u00fa\1\47\1\uffff\3\47\1\uffff\2\47\1\uffff\4\47\1\u0105\2\47\1\u0108\22\47\2\uffff\10\47\1\u0123\1\u0124\1\uffff\1\47\1\u0126\1\uffff\31\47\1\u0140\2\uffff\1\u0141\1\uffff\1\u0142\13\47\1\u014f\1\u0150\1\47\1\u0152\3\47\1\u0159\3\47\1\u015d\1\47\3\uffff\14\47\2\uffff\1\47\1\uffff\3\47\1\u0170\2\47\1\uffff\3\47\1\uffff\22\47\1\uffff\14\47\1\u0195\1\u0197\2\47\1\u019a\1\u019b\5\47\1\u01a1\5\47\1\u01a8\1\u01a9\1\u01aa\2\47\1\u01ad\1\u01ae\1\uffff\1\u01af\1\uffff\2\47\2\uffff\1\u01b2\4\47\1\uffff\5\47\1\u01bc\3\uffff\2\47\3\uffff\2\47\1\uffff\11\47\1\uffff\2\47\1\u01cd\1\u01cf\1\47\1\u01d2\2\47\1\u01d7\2\47\1\u01da\1\47\1\u01dc\1\u01dd\1\u01de\1\uffff\1\u01df\1\uffff\1\47\1\u01e1\1\uffff\1\47\1\u01e4\2\47\1\uffff\1\u01e7\1\47\1\uffff\1\47\4\uffff\1\u01ea\1\uffff\1\u01ec\1\u01ed\1\uffff\2\47\1\uffff\2\47\1\uffff\1\u01f2\2\uffff\2\47\1\u01f5\1\47\1\uffff\2\47\1\uffff\4\47\1\u01fd\2\47\1\uffff\6\47\1\u0206\1\u0207\2\uffff";
    static final String DFA26_eofS =
        "\u0208\uffff";
    static final String DFA26_minS =
        "\1\0\1\145\1\uffff\1\141\3\uffff\1\157\1\uffff\1\145\1\143\1\141\1\162\1\157\1\141\1\162\1\141\1\154\1\141\1\151\2\145\1\156\3\141\2\60\2\uffff\1\101\1\uffff\2\0\1\52\2\uffff\1\163\1\146\2\uffff\1\155\3\uffff\1\60\1\uffff\2\162\1\164\1\171\2\162\1\151\1\157\2\155\1\60\1\160\1\165\1\154\1\157\1\141\1\162\1\163\1\161\1\146\1\164\1\165\1\164\1\157\1\163\1\154\3\uffff\2\60\4\uffff\1\101\1\103\1\141\1\145\1\151\1\uffff\1\166\2\151\1\60\2\141\1\166\1\155\1\160\1\145\1\uffff\2\145\1\165\1\142\1\160\1\141\1\164\1\165\1\141\1\145\1\142\1\145\1\154\1\145\1\163\1\145\1\157\1\141\1\143\1\141\1\145\1\154\1\164\1\60\1\143\1\151\1\143\1\156\1\157\1\uffff\1\171\1\155\1\141\1\60\1\157\3\60\1\145\1\141\1\150\1\163\1\155\1\60\1\145\1\165\1\147\1\154\1\60\1\145\1\66\1\145\1\163\1\142\1\166\1\162\1\155\1\142\1\162\1\164\1\142\1\162\1\142\1\162\2\151\1\160\1\uffff\1\103\1\143\1\164\1\147\1\156\1\60\1\145\1\164\1\uffff\1\156\3\uffff\1\60\1\154\1\116\1\60\1\145\1\uffff\1\156\1\154\2\145\1\151\1\uffff\1\141\1\64\1\60\1\164\1\163\1\103\1\166\1\160\1\154\1\141\1\151\1\154\1\141\1\163\1\166\1\145\1\166\1\141\1\157\1\145\2\60\1\103\1\uffff\1\164\2\145\1\uffff\1\116\1\141\1\uffff\1\164\1\143\1\164\1\162\1\60\1\155\1\156\1\60\1\145\1\143\1\145\1\154\1\151\1\157\1\151\1\155\1\157\1\151\1\155\1\143\1\145\1\156\1\145\1\143\1\156\1\103\2\uffff\1\157\1\145\1\116\1\156\1\141\1\155\2\145\2\60\1\uffff\1\145\1\60\1\uffff\1\155\2\162\1\151\1\143\1\156\1\163\1\145\1\156\1\163\1\145\2\162\1\164\1\116\1\145\1\156\1\157\1\156\1\162\1\141\1\164\1\155\1\145\1\162\1\60\2\uffff\1\60\1\uffff\1\60\1\151\1\166\3\145\1\150\1\164\1\103\1\150\1\164\1\151\2\60\1\141\1\60\1\145\2\156\1\60\1\155\1\111\1\145\1\60\1\163\3\uffff\1\142\1\145\1\156\1\103\1\156\3\145\1\154\2\145\1\142\2\uffff\1\155\1\uffff\1\143\1\156\1\145\1\60\1\156\1\164\1\uffff\1\145\1\156\1\163\1\uffff\1\164\1\145\1\162\1\164\1\145\1\154\1\164\3\162\1\151\2\162\2\145\1\164\1\145\1\143\1\uffff\1\171\1\162\1\163\1\164\1\160\2\162\2\163\1\162\1\151\1\163\2\60\1\166\1\145\2\60\1\162\1\163\1\151\1\143\1\164\1\60\1\165\1\160\1\145\1\141\1\165\3\60\1\166\1\145\2\60\1\uffff\1\60\1\uffff\1\145\1\156\2\uffff\1\60\1\160\1\157\1\164\1\151\1\uffff\1\143\1\141\1\162\2\143\1\60\3\uffff\1\145\1\156\3\uffff\1\162\1\164\1\uffff\1\141\1\156\1\151\1\157\1\164\1\143\1\146\1\145\1\164\1\uffff\1\162\1\164\2\60\1\143\1\60\1\157\1\156\1\60\1\145\1\141\1\60\1\171\3\60\1\uffff\1\60\1\uffff\1\145\1\60\1\uffff\1\156\1\60\1\145\1\171\1\uffff\1\60\1\143\1\uffff\1\160\4\uffff\1\60\1\uffff\2\60\1\uffff\1\155\1\160\1\uffff\2\145\1\uffff\1\60\2\uffff\1\142\1\145\1\60\1\164\1\uffff\1\145\1\115\1\uffff\1\155\1\162\2\145\1\60\2\155\1\uffff\2\142\2\145\2\162\2\60\2\uffff";
    static final String DFA26_maxS =
        "\1\uffff\1\157\1\uffff\1\141\3\uffff\1\157\1\uffff\1\164\3\162\1\157\1\163\1\171\1\141\1\162\1\141\1\151\2\145\1\156\2\157\1\141\1\170\1\71\2\uffff\1\172\1\uffff\2\uffff\1\57\2\uffff\1\163\1\154\2\uffff\1\155\3\uffff\1\172\1\uffff\2\162\1\164\1\171\2\162\1\151\1\157\2\155\1\172\1\160\1\165\1\154\1\157\1\141\1\162\1\163\1\161\1\146\1\164\1\165\1\164\1\157\1\163\1\154\3\uffff\2\71\4\uffff\2\123\1\141\1\145\1\151\1\uffff\1\166\1\165\1\151\1\172\2\141\1\166\1\155\1\160\1\145\1\uffff\2\145\1\165\1\142\1\160\2\164\1\165\1\141\1\145\1\142\1\145\1\154\1\145\1\163\1\171\1\157\1\165\1\143\2\165\1\154\1\164\1\172\1\143\1\151\1\143\1\156\1\157\1\uffff\1\171\1\155\1\141\1\172\1\157\3\172\1\145\1\141\1\150\1\163\1\155\1\172\1\145\1\165\1\147\1\154\1\172\1\145\1\66\1\145\1\163\1\142\1\166\1\162\1\155\1\142\1\162\1\164\1\142\1\162\1\142\1\162\2\151\1\160\1\uffff\1\103\1\143\1\164\1\147\1\156\1\172\1\145\1\164\1\uffff\1\156\3\uffff\1\172\1\154\1\116\1\172\1\145\1\uffff\1\156\1\154\2\145\1\151\1\uffff\1\141\1\64\1\172\1\164\1\163\1\123\1\166\1\160\1\154\1\141\1\151\1\154\1\141\1\163\1\166\1\145\1\166\1\141\1\157\1\145\2\172\1\103\1\uffff\1\164\2\145\1\uffff\1\116\1\141\1\uffff\1\164\1\143\1\164\1\162\1\172\1\155\1\156\1\172\1\145\1\143\1\145\1\154\1\151\1\157\1\151\1\155\1\157\1\151\1\155\1\143\1\145\1\156\1\145\1\143\1\156\1\103\2\uffff\1\157\1\145\1\116\1\156\1\141\1\155\2\145\2\172\1\uffff\1\145\1\172\1\uffff\1\155\2\162\1\151\1\143\1\156\1\163\1\145\1\156\1\163\1\145\2\162\1\164\1\116\1\145\1\156\1\157\1\156\1\162\1\141\1\164\1\155\1\145\1\162\1\172\2\uffff\1\172\1\uffff\1\172\1\151\1\166\3\145\1\150\1\164\1\123\1\150\1\164\1\151\2\172\1\141\1\172\1\145\2\156\1\172\1\155\1\111\1\145\1\172\1\163\3\uffff\1\142\1\145\1\156\1\123\1\156\3\145\1\154\2\145\1\142\2\uffff\1\155\1\uffff\1\143\1\156\1\145\1\172\1\156\1\164\1\uffff\1\145\1\156\1\163\1\uffff\1\164\1\145\1\162\1\164\1\145\1\154\1\164\3\162\1\151\2\162\2\145\1\164\1\145\1\143\1\uffff\1\171\1\162\1\163\1\164\1\160\2\162\2\163\1\162\1\151\1\163\2\172\1\166\1\145\2\172\1\162\1\163\1\151\1\143\1\164\1\172\1\165\1\160\1\145\1\141\1\165\3\172\1\166\1\145\2\172\1\uffff\1\172\1\uffff\1\145\1\156\2\uffff\1\172\1\160\1\157\1\164\1\151\1\uffff\1\143\1\141\1\162\2\143\1\172\3\uffff\1\145\1\156\3\uffff\1\162\1\164\1\uffff\1\141\1\156\1\151\1\157\1\164\1\143\1\146\1\145\1\164\1\uffff\1\162\1\164\2\172\1\143\1\172\1\157\1\156\1\172\1\145\1\141\1\172\1\171\3\172\1\uffff\1\172\1\uffff\1\145\1\172\1\uffff\1\156\1\172\1\145\1\171\1\uffff\1\172\1\143\1\uffff\1\160\4\uffff\1\172\1\uffff\2\172\1\uffff\1\155\1\160\1\uffff\2\145\1\uffff\1\172\2\uffff\1\142\1\145\1\172\1\164\1\uffff\1\145\1\115\1\uffff\1\155\1\162\2\145\1\172\2\155\1\uffff\2\142\2\145\2\162\2\172\2\uffff";
    static final String DFA26_acceptS =
        "\2\uffff\1\2\1\uffff\1\5\1\6\1\7\1\uffff\1\11\23\uffff\2\105\1\uffff\1\110\3\uffff\1\115\1\116\2\uffff\1\110\1\2\1\uffff\1\5\1\6\1\7\1\uffff\1\11\32\uffff\1\106\1\107\1\104\2\uffff\1\112\1\113\1\114\1\115\5\uffff\1\17\12\uffff\1\35\35\uffff\1\74\45\uffff\1\3\10\uffff\1\16\1\uffff\1\23\1\52\1\103\5\uffff\1\61\5\uffff\1\71\27\uffff\1\75\3\uffff\1\53\2\uffff\1\55\32\uffff\1\64\1\67\12\uffff\1\70\2\uffff\1\73\32\uffff\1\63\1\66\1\uffff\1\72\31\uffff\1\62\1\102\1\1\14\uffff\1\42\1\44\1\uffff\1\24\6\uffff\1\51\3\uffff\1\60\22\uffff\1\14\44\uffff\1\34\1\uffff\1\47\2\uffff\1\36\1\50\5\uffff\1\76\6\uffff\1\37\1\27\1\30\2\uffff\1\4\1\25\1\33\2\uffff\1\40\11\uffff\1\26\20\uffff\1\45\1\uffff\1\46\2\uffff\1\15\4\uffff\1\77\2\uffff\1\54\1\uffff\1\41\1\43\1\31\1\32\1\uffff\1\10\2\uffff\1\21\2\uffff\1\57\2\uffff\1\56\1\uffff\1\20\1\13\4\uffff\1\12\2\uffff\1\22\7\uffff\1\100\10\uffff\1\101\1\65";
    static final String DFA26_specialS =
        "\1\2\37\uffff\1\0\1\1\u01e6\uffff}>";
    static final String[] DFA26_transitionS = {
            "\11\44\2\43\2\44\1\43\22\44\1\43\1\44\1\40\4\44\1\41\1\4\1\6\2\44\1\5\1\34\1\44\1\42\1\32\11\33\7\44\1\12\1\30\1\15\1\27\1\37\1\14\1\21\1\37\1\26\2\37\1\23\1\37\1\3\1\37\1\13\1\37\1\1\1\11\1\7\6\37\3\44\1\36\1\37\1\44\3\37\1\25\1\37\1\31\7\37\1\16\1\37\1\22\2\37\1\24\1\17\1\37\1\20\4\37\1\2\1\44\1\10\uff82\44",
            "\1\46\11\uffff\1\45",
            "",
            "\1\51",
            "",
            "",
            "",
            "\1\55",
            "",
            "\1\57\16\uffff\1\60",
            "\1\61\12\uffff\1\62\3\uffff\1\63",
            "\1\64\20\uffff\1\65",
            "\1\66",
            "\1\67",
            "\1\70\21\uffff\1\71",
            "\1\73\6\uffff\1\72",
            "\1\74",
            "\1\75\5\uffff\1\76",
            "\1\77",
            "\1\100",
            "\1\101",
            "\1\102",
            "\1\103",
            "\1\105\15\uffff\1\104",
            "\1\107\15\uffff\1\106",
            "\1\110",
            "\12\114\50\uffff\1\112\25\uffff\1\111",
            "\12\115",
            "",
            "",
            "\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "\0\116",
            "\0\116",
            "\1\117\4\uffff\1\120",
            "",
            "",
            "\1\122",
            "\1\123\5\uffff\1\124",
            "",
            "",
            "\1\125",
            "",
            "",
            "",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\17\47\1\126\12\47",
            "",
            "\1\130",
            "\1\131",
            "\1\132",
            "\1\133",
            "\1\134",
            "\1\135",
            "\1\136",
            "\1\137",
            "\1\140",
            "\1\141",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\143",
            "\1\144",
            "\1\145",
            "\1\146",
            "\1\147",
            "\1\150",
            "\1\151",
            "\1\152",
            "\1\153",
            "\1\154",
            "\1\155",
            "\1\156",
            "\1\157",
            "\1\160",
            "\1\161",
            "",
            "",
            "",
            "\12\114",
            "\12\115",
            "",
            "",
            "",
            "",
            "\1\165\1\uffff\1\163\14\uffff\1\164\2\uffff\1\162",
            "\1\170\14\uffff\1\166\2\uffff\1\167",
            "\1\171",
            "\1\172",
            "\1\173",
            "",
            "\1\174",
            "\1\176\13\uffff\1\175",
            "\1\177",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "",
            "\1\u0087",
            "\1\u0088",
            "\1\u0089",
            "\1\u008a",
            "\1\u008b",
            "\1\u008d\22\uffff\1\u008c",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093",
            "\1\u0094",
            "\1\u0095",
            "\1\u0096",
            "\1\u009a\14\uffff\1\u0099\2\uffff\1\u0098\3\uffff\1\u0097",
            "\1\u009b",
            "\1\u009d\23\uffff\1\u009c",
            "\1\u009e",
            "\1\u00a0\23\uffff\1\u009f",
            "\1\u00a2\17\uffff\1\u00a1",
            "\1\u00a3",
            "\1\u00a4",
            "\12\47\7\uffff\22\47\1\u00a5\7\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u00a7",
            "\1\u00a8",
            "\1\u00a9",
            "\1\u00aa",
            "\1\u00ab",
            "",
            "\1\u00ac",
            "\1\u00ad",
            "\1\u00ae",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u00b0",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u00b4",
            "\1\u00b5",
            "\1\u00b6",
            "\1\u00b7",
            "\1\u00b8",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u00ba",
            "\1\u00bb",
            "\1\u00bc",
            "\1\u00bd",
            "\12\47\7\uffff\23\47\1\u00be\6\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u00c0",
            "\1\u00c1",
            "\1\u00c2",
            "\1\u00c3",
            "\1\u00c4",
            "\1\u00c5",
            "\1\u00c6",
            "\1\u00c7",
            "\1\u00c8",
            "\1\u00c9",
            "\1\u00ca",
            "\1\u00cb",
            "\1\u00cc",
            "\1\u00cd",
            "\1\u00ce",
            "\1\u00cf",
            "\1\u00d0",
            "\1\u00d1",
            "",
            "\1\u00d2",
            "\1\u00d3",
            "\1\u00d4",
            "\1\u00d5",
            "\1\u00d6",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u00d8",
            "\1\u00d9",
            "",
            "\1\u00da",
            "",
            "",
            "",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u00dc",
            "\1\u00dd",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u00df",
            "",
            "\1\u00e0",
            "\1\u00e1",
            "\1\u00e2",
            "\1\u00e3",
            "\1\u00e4",
            "",
            "\1\u00e5",
            "\1\u00e6",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u00e7",
            "\1\u00e8",
            "\1\u00ea\17\uffff\1\u00e9",
            "\1\u00eb",
            "\1\u00ec",
            "\1\u00ed",
            "\1\u00ee",
            "\1\u00ef",
            "\1\u00f0",
            "\1\u00f1",
            "\1\u00f2",
            "\1\u00f3",
            "\1\u00f4",
            "\1\u00f5",
            "\1\u00f6",
            "\1\u00f7",
            "\1\u00f8",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u00fb",
            "",
            "\1\u00fc",
            "\1\u00fd",
            "\1\u00fe",
            "",
            "\1\u00ff",
            "\1\u0100",
            "",
            "\1\u0101",
            "\1\u0102",
            "\1\u0103",
            "\1\u0104",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u0106",
            "\1\u0107",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u0109",
            "\1\u010a",
            "\1\u010b",
            "\1\u010c",
            "\1\u010d",
            "\1\u010e",
            "\1\u010f",
            "\1\u0110",
            "\1\u0111",
            "\1\u0112",
            "\1\u0113",
            "\1\u0114",
            "\1\u0115",
            "\1\u0116",
            "\1\u0117",
            "\1\u0118",
            "\1\u0119",
            "\1\u011a",
            "",
            "",
            "\1\u011b",
            "\1\u011c",
            "\1\u011d",
            "\1\u011e",
            "\1\u011f",
            "\1\u0120",
            "\1\u0121",
            "\1\u0122",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "\1\u0125",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "\1\u0127",
            "\1\u0128",
            "\1\u0129",
            "\1\u012a",
            "\1\u012b",
            "\1\u012c",
            "\1\u012d",
            "\1\u012e",
            "\1\u012f",
            "\1\u0130",
            "\1\u0131",
            "\1\u0132",
            "\1\u0133",
            "\1\u0134",
            "\1\u0135",
            "\1\u0136",
            "\1\u0137",
            "\1\u0138",
            "\1\u0139",
            "\1\u013a",
            "\1\u013b",
            "\1\u013c",
            "\1\u013d",
            "\1\u013e",
            "\1\u013f",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u0143",
            "\1\u0144",
            "\1\u0145",
            "\1\u0146",
            "\1\u0147",
            "\1\u0148",
            "\1\u0149",
            "\1\u014b\17\uffff\1\u014a",
            "\1\u014c",
            "\1\u014d",
            "\1\u014e",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u0151",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u0153",
            "\1\u0154",
            "\1\u0155",
            "\12\47\7\uffff\1\u0157\21\47\1\u0158\7\47\4\uffff\1\47\1\uffff\22\47\1\u0156\7\47",
            "\1\u015a",
            "\1\u015b",
            "\1\u015c",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u015e",
            "",
            "",
            "",
            "\1\u015f",
            "\1\u0160",
            "\1\u0161",
            "\1\u0163\17\uffff\1\u0162",
            "\1\u0164",
            "\1\u0165",
            "\1\u0166",
            "\1\u0167",
            "\1\u0168",
            "\1\u0169",
            "\1\u016a",
            "\1\u016b",
            "",
            "",
            "\1\u016c",
            "",
            "\1\u016d",
            "\1\u016e",
            "\1\u016f",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u0171",
            "\1\u0172",
            "",
            "\1\u0173",
            "\1\u0174",
            "\1\u0175",
            "",
            "\1\u0176",
            "\1\u0177",
            "\1\u0178",
            "\1\u0179",
            "\1\u017a",
            "\1\u017b",
            "\1\u017c",
            "\1\u017d",
            "\1\u017e",
            "\1\u017f",
            "\1\u0180",
            "\1\u0181",
            "\1\u0182",
            "\1\u0183",
            "\1\u0184",
            "\1\u0185",
            "\1\u0186",
            "\1\u0187",
            "",
            "\1\u0188",
            "\1\u0189",
            "\1\u018a",
            "\1\u018b",
            "\1\u018c",
            "\1\u018d",
            "\1\u018e",
            "\1\u018f",
            "\1\u0190",
            "\1\u0191",
            "\1\u0192",
            "\1\u0193",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\22\47\1\u0194\7\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\22\47\1\u0196\7\47",
            "\1\u0198",
            "\1\u0199",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u019c",
            "\1\u019d",
            "\1\u019e",
            "\1\u019f",
            "\1\u01a0",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u01a2",
            "\1\u01a3",
            "\1\u01a4",
            "\1\u01a5",
            "\1\u01a6",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\22\47\1\u01a7\7\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u01ab",
            "\1\u01ac",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "\1\u01b0",
            "\1\u01b1",
            "",
            "",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u01b3",
            "\1\u01b4",
            "\1\u01b5",
            "\1\u01b6",
            "",
            "\1\u01b7",
            "\1\u01b8",
            "\1\u01b9",
            "\1\u01ba",
            "\1\u01bb",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "",
            "",
            "\1\u01bd",
            "\1\u01be",
            "",
            "",
            "",
            "\1\u01bf",
            "\1\u01c0",
            "",
            "\1\u01c1",
            "\1\u01c2",
            "\1\u01c3",
            "\1\u01c4",
            "\1\u01c5",
            "\1\u01c6",
            "\1\u01c7",
            "\1\u01c8",
            "\1\u01c9",
            "",
            "\1\u01ca",
            "\1\u01cb",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\22\47\1\u01cc\7\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\22\47\1\u01ce\7\47",
            "\1\u01d0",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\22\47\1\u01d1\7\47",
            "\1\u01d3",
            "\1\u01d4",
            "\12\47\7\uffff\14\47\1\u01d5\6\47\1\u01d6\6\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u01d8",
            "\1\u01d9",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u01db",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "\1\u01e0",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "\1\u01e2",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\22\47\1\u01e3\7\47",
            "\1\u01e5",
            "\1\u01e6",
            "",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u01e8",
            "",
            "\1\u01e9",
            "",
            "",
            "",
            "",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\22\47\1\u01eb\7\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "\1\u01ee",
            "\1\u01ef",
            "",
            "\1\u01f0",
            "\1\u01f1",
            "",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "",
            "\1\u01f3",
            "\1\u01f4",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u01f6",
            "",
            "\1\u01f7",
            "\1\u01f8",
            "",
            "\1\u01f9",
            "\1\u01fa",
            "\1\u01fb",
            "\1\u01fc",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u01fe",
            "\1\u01ff",
            "",
            "\1\u0200",
            "\1\u0201",
            "\1\u0202",
            "\1\u0203",
            "\1\u0204",
            "\1\u0205",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            ""
    };

    static final short[] DFA26_eot = DFA.unpackEncodedString(DFA26_eotS);
    static final short[] DFA26_eof = DFA.unpackEncodedString(DFA26_eofS);
    static final char[] DFA26_min = DFA.unpackEncodedStringToUnsignedChars(DFA26_minS);
    static final char[] DFA26_max = DFA.unpackEncodedStringToUnsignedChars(DFA26_maxS);
    static final short[] DFA26_accept = DFA.unpackEncodedString(DFA26_acceptS);
    static final short[] DFA26_special = DFA.unpackEncodedString(DFA26_specialS);
    static final short[][] DFA26_transition;

    static {
        int numStates = DFA26_transitionS.length;
        DFA26_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA26_transition[i] = DFA.unpackEncodedString(DFA26_transitionS[i]);
        }
    }

    class DFA26 extends DFA {

        public DFA26(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 26;
            this.eot = DFA26_eot;
            this.eof = DFA26_eof;
            this.min = DFA26_min;
            this.max = DFA26_max;
            this.accept = DFA26_accept;
            this.special = DFA26_special;
            this.transition = DFA26_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | RULE_BOOLEAN | RULE_DOUBLE | RULE_SIGNED_INT | RULE_HEX | RULE_BINARY | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA26_32 = input.LA(1);

                        s = -1;
                        if ( ((LA26_32>='\u0000' && LA26_32<='\uFFFF')) ) {s = 78;}

                        else s = 36;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA26_33 = input.LA(1);

                        s = -1;
                        if ( ((LA26_33>='\u0000' && LA26_33<='\uFFFF')) ) {s = 78;}

                        else s = 36;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA26_0 = input.LA(1);

                        s = -1;
                        if ( (LA26_0=='R') ) {s = 1;}

                        else if ( (LA26_0=='{') ) {s = 2;}

                        else if ( (LA26_0=='N') ) {s = 3;}

                        else if ( (LA26_0=='(') ) {s = 4;}

                        else if ( (LA26_0==',') ) {s = 5;}

                        else if ( (LA26_0==')') ) {s = 6;}

                        else if ( (LA26_0=='T') ) {s = 7;}

                        else if ( (LA26_0=='}') ) {s = 8;}

                        else if ( (LA26_0=='S') ) {s = 9;}

                        else if ( (LA26_0=='A') ) {s = 10;}

                        else if ( (LA26_0=='P') ) {s = 11;}

                        else if ( (LA26_0=='F') ) {s = 12;}

                        else if ( (LA26_0=='C') ) {s = 13;}

                        else if ( (LA26_0=='n') ) {s = 14;}

                        else if ( (LA26_0=='t') ) {s = 15;}

                        else if ( (LA26_0=='v') ) {s = 16;}

                        else if ( (LA26_0=='G') ) {s = 17;}

                        else if ( (LA26_0=='p') ) {s = 18;}

                        else if ( (LA26_0=='L') ) {s = 19;}

                        else if ( (LA26_0=='s') ) {s = 20;}

                        else if ( (LA26_0=='d') ) {s = 21;}

                        else if ( (LA26_0=='I') ) {s = 22;}

                        else if ( (LA26_0=='D') ) {s = 23;}

                        else if ( (LA26_0=='B') ) {s = 24;}

                        else if ( (LA26_0=='f') ) {s = 25;}

                        else if ( (LA26_0=='0') ) {s = 26;}

                        else if ( ((LA26_0>='1' && LA26_0<='9')) ) {s = 27;}

                        else if ( (LA26_0=='-') ) {s = 28;}

                        else if ( (LA26_0=='^') ) {s = 30;}

                        else if ( (LA26_0=='E'||LA26_0=='H'||(LA26_0>='J' && LA26_0<='K')||LA26_0=='M'||LA26_0=='O'||LA26_0=='Q'||(LA26_0>='U' && LA26_0<='Z')||LA26_0=='_'||(LA26_0>='a' && LA26_0<='c')||LA26_0=='e'||(LA26_0>='g' && LA26_0<='m')||LA26_0=='o'||(LA26_0>='q' && LA26_0<='r')||LA26_0=='u'||(LA26_0>='w' && LA26_0<='z')) ) {s = 31;}

                        else if ( (LA26_0=='\"') ) {s = 32;}

                        else if ( (LA26_0=='\'') ) {s = 33;}

                        else if ( (LA26_0=='/') ) {s = 34;}

                        else if ( ((LA26_0>='\t' && LA26_0<='\n')||LA26_0=='\r'||LA26_0==' ') ) {s = 35;}

                        else if ( ((LA26_0>='\u0000' && LA26_0<='\b')||(LA26_0>='\u000B' && LA26_0<='\f')||(LA26_0>='\u000E' && LA26_0<='\u001F')||LA26_0=='!'||(LA26_0>='#' && LA26_0<='&')||(LA26_0>='*' && LA26_0<='+')||LA26_0=='.'||(LA26_0>=':' && LA26_0<='@')||(LA26_0>='[' && LA26_0<=']')||LA26_0=='`'||LA26_0=='|'||(LA26_0>='~' && LA26_0<='\uFFFF')) ) {s = 36;}

                        else s = 29;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 26, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}