/*
 * generated by Xtext 2.13.0
 */
package de.fraunhofer.ipa.rossystem.validation

import org.eclipse.xtext.validation.Check
import rossystem.ServiceConnection
import rossystem.TopicConnection

/**
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class RosSystemValidator extends AbstractRosSystemValidator {
	
	public static val NOT_MATCHED_NAME = 'notMatchedName'
	public static val NOT_MATCHED_TYPE = 'notMatchedType'

	@Check
	def void checkTopicConnection(TopicConnection topicconnection){
		for (pub:topicconnection.from){
			for (sub:topicconnection.to){
				/**if( !pub.name.equalsIgnoreCase(sub.name)){
				error("Names not matched", null, NOT_MATCHED_NAME)
				}*/
				if( !pub.publisher.message.name.equalsIgnoreCase(sub.subscriber.message.name)){
					error("Messages not matched", null, NOT_MATCHED_TYPE)
				}
			}
	}}

	@Check
	def void checkSrvConnection(ServiceConnection serviceconnection){
		for (srvs:serviceconnection.from){
			/**if( !srvs.name.equalsIgnoreCase(serviceconnection.to.name)){
				error("Names not matched", null, NOT_MATCHED_NAME)
				return
			}*/
			if( !srvs.srvserver.service.name.equalsIgnoreCase(serviceconnection.to.srvclient.service.name)){
				error("Services not matched", null, NOT_MATCHED_TYPE)
				return
			}
	}}}
