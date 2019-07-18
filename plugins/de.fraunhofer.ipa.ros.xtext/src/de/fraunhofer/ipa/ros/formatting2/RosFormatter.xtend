/*
 * generated by Xtext 2.12.0
 */
package de.fraunhofer.ipa.ros.formatting2

import com.google.inject.Inject
import de.fraunhofer.ipa.ros.services.RosGrammarAccess
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument
import ros.Artifact
import ros.PackageSet
import primitives.SpecBase

class RosFormatter extends AbstractFormatter2 {
	
	@Inject extension RosGrammarAccess

	def dispatch void format(PackageSet packageSet, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (ros.Package _package : packageSet.getPackage()) {
			_package.format;
		}
	}

	def dispatch void format(ros.Package _package, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (SpecBase specBase : _package.getSpec()) {
			specBase.format;
		}
		for (Artifact artifact : _package.getArtifact()) {
			artifact.format;
		}
	}
	
	// TODO: implement for Artifact, CatkinPackage, ServiceSpec, TopicSpec, ActionSpec, Node, ServiceServer, Publisher, Subscriber, ServiceClient, ActionServer, ActionClient, Parameter, ParameterListType, ParameterStructType, ParameterIntegerType, ParameterStringType, ParameterDoubleType, ParameterDateType, ParameterBooleanType, ParameterBase64Type, ParameterAnyType, ParameterArrayType, ParameterSequence, ParameterStruct, ParameterStructMember, ParameterStructTypeMember
}
