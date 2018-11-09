/*
 * generated by Xtext 2.13.0
 */
package de.fraunhofer.ipa.componentInterface.ide

import com.google.inject.Guice
import de.fraunhofer.ipa.componentInterface.ComponentInterfaceRuntimeModule
import de.fraunhofer.ipa.componentInterface.ComponentInterfaceStandaloneSetup
import org.eclipse.xtext.util.Modules2

/**
 * Initialization support for running Xtext languages as language servers.
 */
class ComponentInterfaceIdeSetup extends ComponentInterfaceStandaloneSetup {

	override createInjector() {
		Guice.createInjector(Modules2.mixin(new ComponentInterfaceRuntimeModule, new ComponentInterfaceIdeModule))
	}
	
}
