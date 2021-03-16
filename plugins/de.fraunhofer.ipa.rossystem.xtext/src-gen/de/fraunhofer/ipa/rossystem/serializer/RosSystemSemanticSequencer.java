/*
 * generated by Xtext 2.16.0
 */
package de.fraunhofer.ipa.rossystem.serializer;

import com.google.inject.Inject;
import componentInterface.ComponentInterface;
import componentInterface.ComponentInterfacePackage;
import componentInterface.RosActionClient;
import componentInterface.RosActionServer;
import componentInterface.RosParameter;
import componentInterface.RosPublisher;
import componentInterface.RosServiceClient;
import componentInterface.RosServiceServer;
import componentInterface.RosSubscriber;
import de.fraunhofer.ipa.rossystem.services.RosSystemGrammarAccess;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import ros.GlobalNamespace;
import ros.ParameterAny;
import ros.ParameterAnyType;
import ros.ParameterArrayType;
import ros.ParameterBase64;
import ros.ParameterBase64Type;
import ros.ParameterBoolean;
import ros.ParameterBooleanType;
import ros.ParameterDate;
import ros.ParameterDateType;
import ros.ParameterDouble;
import ros.ParameterDoubleType;
import ros.ParameterInteger;
import ros.ParameterIntegerType;
import ros.ParameterListType;
import ros.ParameterSequence;
import ros.ParameterString;
import ros.ParameterStringType;
import ros.ParameterStruct;
import ros.ParameterStructMember;
import ros.ParameterStructType;
import ros.ParameterStructTypeMember;
import ros.PrivateNamespace;
import ros.RelativeNamespace;
import ros.RosPackage;
import rossystem.ActionConnection;
import rossystem.RosSystem;
import rossystem.RossystemPackage;
import rossystem.ServiceConnection;
import rossystem.TopicConnection;

@SuppressWarnings("all")
public class RosSystemSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private RosSystemGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == ComponentInterfacePackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case ComponentInterfacePackage.COMPONENT_INTERFACE:
				sequence_ComponentInterface(context, (ComponentInterface) semanticObject); 
				return; 
			case ComponentInterfacePackage.ROS_ACTION_CLIENT:
				sequence_RosActionClient(context, (RosActionClient) semanticObject); 
				return; 
			case ComponentInterfacePackage.ROS_ACTION_SERVER:
				sequence_RosActionServer(context, (RosActionServer) semanticObject); 
				return; 
			case ComponentInterfacePackage.ROS_PARAMETER:
				sequence_RosParameter(context, (RosParameter) semanticObject); 
				return; 
			case ComponentInterfacePackage.ROS_PUBLISHER:
				sequence_RosPublisher(context, (RosPublisher) semanticObject); 
				return; 
			case ComponentInterfacePackage.ROS_SERVICE_CLIENT:
				sequence_RosServiceClient(context, (RosServiceClient) semanticObject); 
				return; 
			case ComponentInterfacePackage.ROS_SERVICE_SERVER:
				sequence_RosServiceServer(context, (RosServiceServer) semanticObject); 
				return; 
			case ComponentInterfacePackage.ROS_SUBSCRIBER:
				sequence_RosSubscriber(context, (RosSubscriber) semanticObject); 
				return; 
			}
		else if (epackage == RosPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case RosPackage.GLOBAL_NAMESPACE:
				sequence_GlobalNamespace(context, (GlobalNamespace) semanticObject); 
				return; 
			case RosPackage.PARAMETER:
				sequence_Parameter(context, (ros.Parameter) semanticObject); 
				return; 
			case RosPackage.PARAMETER_ANY:
				sequence_ParameterAny(context, (ParameterAny) semanticObject); 
				return; 
			case RosPackage.PARAMETER_ANY_TYPE:
				sequence_ParameterAnyType(context, (ParameterAnyType) semanticObject); 
				return; 
			case RosPackage.PARAMETER_ARRAY_TYPE:
				sequence_ParameterArrayType(context, (ParameterArrayType) semanticObject); 
				return; 
			case RosPackage.PARAMETER_BASE64:
				sequence_ParameterBase64(context, (ParameterBase64) semanticObject); 
				return; 
			case RosPackage.PARAMETER_BASE64_TYPE:
				sequence_ParameterBase64Type(context, (ParameterBase64Type) semanticObject); 
				return; 
			case RosPackage.PARAMETER_BOOLEAN:
				sequence_ParameterBoolean(context, (ParameterBoolean) semanticObject); 
				return; 
			case RosPackage.PARAMETER_BOOLEAN_TYPE:
				sequence_ParameterBooleanType(context, (ParameterBooleanType) semanticObject); 
				return; 
			case RosPackage.PARAMETER_DATE:
				sequence_ParameterDate(context, (ParameterDate) semanticObject); 
				return; 
			case RosPackage.PARAMETER_DATE_TYPE:
				sequence_ParameterDateType(context, (ParameterDateType) semanticObject); 
				return; 
			case RosPackage.PARAMETER_DOUBLE:
				sequence_ParameterDouble(context, (ParameterDouble) semanticObject); 
				return; 
			case RosPackage.PARAMETER_DOUBLE_TYPE:
				sequence_ParameterDoubleType(context, (ParameterDoubleType) semanticObject); 
				return; 
			case RosPackage.PARAMETER_INTEGER:
				sequence_ParameterInteger(context, (ParameterInteger) semanticObject); 
				return; 
			case RosPackage.PARAMETER_INTEGER_TYPE:
				sequence_ParameterIntegerType(context, (ParameterIntegerType) semanticObject); 
				return; 
			case RosPackage.PARAMETER_LIST_TYPE:
				sequence_ParameterListType(context, (ParameterListType) semanticObject); 
				return; 
			case RosPackage.PARAMETER_SEQUENCE:
				sequence_ParameterList(context, (ParameterSequence) semanticObject); 
				return; 
			case RosPackage.PARAMETER_STRING:
				sequence_ParameterString(context, (ParameterString) semanticObject); 
				return; 
			case RosPackage.PARAMETER_STRING_TYPE:
				sequence_ParameterStringType(context, (ParameterStringType) semanticObject); 
				return; 
			case RosPackage.PARAMETER_STRUCT:
				sequence_ParameterStruct(context, (ParameterStruct) semanticObject); 
				return; 
			case RosPackage.PARAMETER_STRUCT_MEMBER:
				sequence_ParameterStructMember(context, (ParameterStructMember) semanticObject); 
				return; 
			case RosPackage.PARAMETER_STRUCT_TYPE:
				sequence_ParameterStructType(context, (ParameterStructType) semanticObject); 
				return; 
			case RosPackage.PARAMETER_STRUCT_TYPE_MEMBER:
				sequence_ParameterStructTypeMember(context, (ParameterStructTypeMember) semanticObject); 
				return; 
			case RosPackage.PRIVATE_NAMESPACE:
				sequence_PrivateNamespace(context, (PrivateNamespace) semanticObject); 
				return; 
			case RosPackage.RELATIVE_NAMESPACE:
				sequence_RelativeNamespace_Impl(context, (RelativeNamespace) semanticObject); 
				return; 
			}
		else if (epackage == RossystemPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case RossystemPackage.ACTION_CONNECTION:
				sequence_ActionConnection(context, (ActionConnection) semanticObject); 
				return; 
			case RossystemPackage.ROS_SYSTEM:
				sequence_RosSystem(context, (RosSystem) semanticObject); 
				return; 
			case RossystemPackage.SERVICE_CONNECTION:
				sequence_ServiceConnection(context, (ServiceConnection) semanticObject); 
				return; 
			case RossystemPackage.TOPIC_CONNECTION:
				sequence_TopicConnection(context, (TopicConnection) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     ActionConnection returns ActionConnection
	 *
	 * Constraint:
	 *     (ActionName=EString From=[RosActionServer|EString] To=[RosActionClient|EString])
	 */
	protected void sequence_ActionConnection(ISerializationContext context, ActionConnection semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RossystemPackage.Literals.ACTION_CONNECTION__ACTION_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RossystemPackage.Literals.ACTION_CONNECTION__ACTION_NAME));
			if (transientValues.isValueTransient(semanticObject, RossystemPackage.Literals.ACTION_CONNECTION__FROM) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RossystemPackage.Literals.ACTION_CONNECTION__FROM));
			if (transientValues.isValueTransient(semanticObject, RossystemPackage.Literals.ACTION_CONNECTION__TO) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RossystemPackage.Literals.ACTION_CONNECTION__TO));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getActionConnectionAccess().getActionNameEStringParserRuleCall_1_0(), semanticObject.getActionName());
		feeder.accept(grammarAccess.getActionConnectionAccess().getFromRosActionServerEStringParserRuleCall_4_0_1(), semanticObject.eGet(RossystemPackage.Literals.ACTION_CONNECTION__FROM, false));
		feeder.accept(grammarAccess.getActionConnectionAccess().getToRosActionClientEStringParserRuleCall_6_0_1(), semanticObject.eGet(RossystemPackage.Literals.ACTION_CONNECTION__TO, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ComponentInterface returns ComponentInterface
	 *
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         NameSpace=EString? 
	 *         FromRosNode=[Node|EString]? 
	 *         (rospublisher+=RosPublisher rospublisher+=RosPublisher*)? 
	 *         (rossubscriber+=RosSubscriber rossubscriber+=RosSubscriber*)? 
	 *         (rosserviceserver+=RosServiceServer rosserviceserver+=RosServiceServer*)? 
	 *         (rosserviceclient+=RosServiceClient rosserviceclient+=RosServiceClient*)? 
	 *         (rosactionserver+=RosActionServer rosactionserver+=RosActionServer*)? 
	 *         (rosactionclient+=RosActionClient rosactionclient+=RosActionClient*)? 
	 *         (rosparameter+=RosParameter rosparameter+=RosParameter*)?
	 *     )
	 */
	protected void sequence_ComponentInterface(ISerializationContext context, ComponentInterface semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Namespace returns GlobalNamespace
	 *     GlobalNamespace returns GlobalNamespace
	 *
	 * Constraint:
	 *     (parts+=GraphName parts+=GraphName*)?
	 */
	protected void sequence_GlobalNamespace(ISerializationContext context, GlobalNamespace semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ParameterAnyType returns ParameterAnyType
	 *
	 * Constraint:
	 *     default=ParameterAny?
	 */
	protected void sequence_ParameterAnyType(ISerializationContext context, ParameterAnyType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ParameterAny returns ParameterAny
	 *
	 * Constraint:
	 *     value=EString?
	 */
	protected void sequence_ParameterAny(ISerializationContext context, ParameterAny semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ParameterType returns ParameterArrayType
	 *     ParameterArrayType returns ParameterArrayType
	 *
	 * Constraint:
	 *     (type=ParameterType default=ParameterList?)
	 */
	protected void sequence_ParameterArrayType(ISerializationContext context, ParameterArrayType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ParameterType returns ParameterBase64Type
	 *     ParameterBase64Type returns ParameterBase64Type
	 *
	 * Constraint:
	 *     default=ParameterBase64?
	 */
	protected void sequence_ParameterBase64Type(ISerializationContext context, ParameterBase64Type semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ParameterValue returns ParameterBase64
	 *     ParameterBase64 returns ParameterBase64
	 *
	 * Constraint:
	 *     value=Base64Binary
	 */
	protected void sequence_ParameterBase64(ISerializationContext context, ParameterBase64 semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RosPackage.Literals.PARAMETER_BASE64__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RosPackage.Literals.PARAMETER_BASE64__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getParameterBase64Access().getValueBase64BinaryParserRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ParameterType returns ParameterBooleanType
	 *     ParameterBooleanType returns ParameterBooleanType
	 *
	 * Constraint:
	 *     default=ParameterBoolean?
	 */
	protected void sequence_ParameterBooleanType(ISerializationContext context, ParameterBooleanType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ParameterValue returns ParameterBoolean
	 *     ParameterBoolean returns ParameterBoolean
	 *
	 * Constraint:
	 *     value=boolean0
	 */
	protected void sequence_ParameterBoolean(ISerializationContext context, ParameterBoolean semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RosPackage.Literals.PARAMETER_BOOLEAN__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RosPackage.Literals.PARAMETER_BOOLEAN__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getParameterBooleanAccess().getValueBoolean0ParserRuleCall_0(), semanticObject.isValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ParameterDateType returns ParameterDateType
	 *
	 * Constraint:
	 *     default=ParameterDate?
	 */
	protected void sequence_ParameterDateType(ISerializationContext context, ParameterDateType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ParameterDate returns ParameterDate
	 *
	 * Constraint:
	 *     value=DateTime0
	 */
	protected void sequence_ParameterDate(ISerializationContext context, ParameterDate semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RosPackage.Literals.PARAMETER_DATE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RosPackage.Literals.PARAMETER_DATE__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getParameterDateAccess().getValueDateTime0ParserRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ParameterType returns ParameterDoubleType
	 *     ParameterDoubleType returns ParameterDoubleType
	 *
	 * Constraint:
	 *     default=ParameterDouble?
	 */
	protected void sequence_ParameterDoubleType(ISerializationContext context, ParameterDoubleType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ParameterValue returns ParameterDouble
	 *     ParameterDouble returns ParameterDouble
	 *
	 * Constraint:
	 *     value=Double0
	 */
	protected void sequence_ParameterDouble(ISerializationContext context, ParameterDouble semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RosPackage.Literals.PARAMETER_DOUBLE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RosPackage.Literals.PARAMETER_DOUBLE__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getParameterDoubleAccess().getValueDouble0ParserRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ParameterType returns ParameterIntegerType
	 *     ParameterIntegerType returns ParameterIntegerType
	 *
	 * Constraint:
	 *     default=ParameterInteger?
	 */
	protected void sequence_ParameterIntegerType(ISerializationContext context, ParameterIntegerType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ParameterValue returns ParameterInteger
	 *     ParameterInteger returns ParameterInteger
	 *
	 * Constraint:
	 *     value=Integer0
	 */
	protected void sequence_ParameterInteger(ISerializationContext context, ParameterInteger semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RosPackage.Literals.PARAMETER_INTEGER__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RosPackage.Literals.PARAMETER_INTEGER__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getParameterIntegerAccess().getValueInteger0ParserRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ParameterType returns ParameterListType
	 *     ParameterListType returns ParameterListType
	 *
	 * Constraint:
	 *     (sequence+=ParameterType sequence+=ParameterType*)
	 */
	protected void sequence_ParameterListType(ISerializationContext context, ParameterListType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ParameterValue returns ParameterSequence
	 *     ParameterList returns ParameterSequence
	 *
	 * Constraint:
	 *     (value+=ParameterValue value+=ParameterValue*)
	 */
	protected void sequence_ParameterList(ISerializationContext context, ParameterSequence semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ParameterType returns ParameterStringType
	 *     ParameterStringType returns ParameterStringType
	 *
	 * Constraint:
	 *     default=ParameterString?
	 */
	protected void sequence_ParameterStringType(ISerializationContext context, ParameterStringType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ParameterValue returns ParameterString
	 *     ParameterString returns ParameterString
	 *
	 * Constraint:
	 *     value=EString
	 */
	protected void sequence_ParameterString(ISerializationContext context, ParameterString semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RosPackage.Literals.PARAMETER_STRING__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RosPackage.Literals.PARAMETER_STRING__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getParameterStringAccess().getValueEStringParserRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ParameterStructMember returns ParameterStructMember
	 *
	 * Constraint:
	 *     (name=EString value=ParameterValue)
	 */
	protected void sequence_ParameterStructMember(ISerializationContext context, ParameterStructMember semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RosPackage.Literals.PARAMETER_STRUCT_MEMBER__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RosPackage.Literals.PARAMETER_STRUCT_MEMBER__NAME));
			if (transientValues.isValueTransient(semanticObject, RosPackage.Literals.PARAMETER_STRUCT_MEMBER__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RosPackage.Literals.PARAMETER_STRUCT_MEMBER__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getParameterStructMemberAccess().getNameEStringParserRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getParameterStructMemberAccess().getValueParameterValueParserRuleCall_3_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ParameterStructTypeMember returns ParameterStructTypeMember
	 *
	 * Constraint:
	 *     (name=EString type=ParameterType)
	 */
	protected void sequence_ParameterStructTypeMember(ISerializationContext context, ParameterStructTypeMember semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RosPackage.Literals.PARAMETER_STRUCT_TYPE_MEMBER__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RosPackage.Literals.PARAMETER_STRUCT_TYPE_MEMBER__NAME));
			if (transientValues.isValueTransient(semanticObject, RosPackage.Literals.PARAMETER_STRUCT_TYPE_MEMBER__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RosPackage.Literals.PARAMETER_STRUCT_TYPE_MEMBER__TYPE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getParameterStructTypeMemberAccess().getNameEStringParserRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getParameterStructTypeMemberAccess().getTypeParameterTypeParserRuleCall_1_0(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ParameterType returns ParameterStructType
	 *     ParameterStructType returns ParameterStructType
	 *
	 * Constraint:
	 *     (parameterstructypetmember+=ParameterStructTypeMember parameterstructypetmember+=ParameterStructTypeMember*)
	 */
	protected void sequence_ParameterStructType(ISerializationContext context, ParameterStructType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ParameterValue returns ParameterStruct
	 *     ParameterStruct returns ParameterStruct
	 *
	 * Constraint:
	 *     (value+=ParameterStructMember value+=ParameterStructMember*)?
	 */
	protected void sequence_ParameterStruct(ISerializationContext context, ParameterStruct semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Parameter returns Parameter
	 *
	 * Constraint:
	 *     (name=EString namespace=Namespace? type=ParameterType? value=ParameterValue?)
	 */
	protected void sequence_Parameter(ISerializationContext context, ros.Parameter semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Namespace returns PrivateNamespace
	 *     PrivateNamespace returns PrivateNamespace
	 *
	 * Constraint:
	 *     (parts+=GraphName parts+=GraphName*)?
	 */
	protected void sequence_PrivateNamespace(ISerializationContext context, PrivateNamespace semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Namespace returns RelativeNamespace
	 *     RelativeNamespace_Impl returns RelativeNamespace
	 *
	 * Constraint:
	 *     (parts+=GraphName parts+=GraphName*)?
	 */
	protected void sequence_RelativeNamespace_Impl(ISerializationContext context, RelativeNamespace semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     RosActionClient returns RosActionClient
	 *
	 * Constraint:
	 *     (name=EString? ns=EString? actclient=[ActionClient|EString])
	 */
	protected void sequence_RosActionClient(ISerializationContext context, RosActionClient semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     RosActionServer returns RosActionServer
	 *
	 * Constraint:
	 *     (name=EString? ns=EString? actserver=[ActionServer|EString])
	 */
	protected void sequence_RosActionServer(ISerializationContext context, RosActionServer semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     RosParameter returns RosParameter
	 *
	 * Constraint:
	 *     (name=EString? ns=EString? parameter=[Parameter|EString] value=ParameterValue?)
	 */
	protected void sequence_RosParameter(ISerializationContext context, RosParameter semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     RosPublisher returns RosPublisher
	 *
	 * Constraint:
	 *     (name=EString? ns=EString? publisher=[Publisher|EString])
	 */
	protected void sequence_RosPublisher(ISerializationContext context, RosPublisher semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     RosServiceClient returns RosServiceClient
	 *
	 * Constraint:
	 *     (name=EString? ns=EString? srvclient=[ServiceClient|EString])
	 */
	protected void sequence_RosServiceClient(ISerializationContext context, RosServiceClient semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     RosServiceServer returns RosServiceServer
	 *
	 * Constraint:
	 *     (name=EString? ns=EString? srvserver=[ServiceServer|EString])
	 */
	protected void sequence_RosServiceServer(ISerializationContext context, RosServiceServer semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     RosSubscriber returns RosSubscriber
	 *
	 * Constraint:
	 *     (name=EString? ns=EString? subscriber=[Subscriber|EString])
	 */
	protected void sequence_RosSubscriber(ISerializationContext context, RosSubscriber semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     RosSystem returns RosSystem
	 *
	 * Constraint:
	 *     (
	 *         Name=EString 
	 *         (RosComponent+=ComponentInterface RosComponent+=ComponentInterface*)? 
	 *         (TopicConnections+=TopicConnection TopicConnections+=TopicConnection*)? 
	 *         (ServiceConnections+=ServiceConnection ServiceConnections+=ServiceConnection*)? 
	 *         (ActionConnections+=ActionConnection ActionConnections+=ActionConnection*)? 
	 *         (Parameter+=Parameter Parameter+=Parameter*)?
	 *     )
	 */
	protected void sequence_RosSystem(ISerializationContext context, RosSystem semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ServiceConnection returns ServiceConnection
	 *
	 * Constraint:
	 *     (ServiceName=EString From+=[RosServiceServer|EString] From+=[RosServiceServer|EString]* To=[RosServiceClient|EString])
	 */
	protected void sequence_ServiceConnection(ISerializationContext context, ServiceConnection semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     TopicConnection returns TopicConnection
	 *
	 * Constraint:
	 *     (TopicName=EString From+=[RosPublisher|EString] From+=[RosPublisher|EString]* To+=[RosSubscriber|EString] To+=[RosSubscriber|EString]*)
	 */
	protected void sequence_TopicConnection(ISerializationContext context, TopicConnection semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
