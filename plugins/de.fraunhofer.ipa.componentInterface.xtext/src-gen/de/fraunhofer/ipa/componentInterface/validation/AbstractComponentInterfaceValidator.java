/*
 * generated by Xtext 2.16.0
 */
package de.fraunhofer.ipa.componentInterface.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;

public abstract class AbstractComponentInterfaceValidator extends AbstractDeclarativeValidator {
	
	@Override
	protected List<EPackage> getEPackages() {
		List<EPackage> result = new ArrayList<EPackage>();
		result.add(EPackage.Registry.INSTANCE.getEPackage("http://www.ipa.fraunhofer.de/componentInterface"));
		return result;
	}
}
