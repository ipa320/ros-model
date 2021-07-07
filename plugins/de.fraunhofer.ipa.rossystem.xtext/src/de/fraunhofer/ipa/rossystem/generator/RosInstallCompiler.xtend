package de.fraunhofer.ipa.rossystem.generator

import com.google.inject.Inject
import rossystem.RosSystem
import java.util.List
import componentInterface.ComponentInterface
import ros.impl.PackageImpl
import ros.Dependency
import ros.PackageDependency
import java.util.ArrayList
import java.util.Set
import java.util.HashSet

class RosInstallCompiler {
		
	@Inject extension GeneratorHelpers
	PackageImpl component_package;
	Set<String> Repos;
	
	
 def compile_toRosInstall (RosSystem system) '''«init_pkg()»
«FOR repo:system.listOfRepos»
- git: {local-name: «repo.substring(repo.lastIndexOf("/") + 1).replace(".git","")», uri: '«repo»'}
«ENDFOR»
'''

	def Set<String> listOfRepos(RosSystem system) {
		Repos = new HashSet<String>();
		for (ComponentInterface component: system.rosComponent){
			component_package = null;
			component_package = get_pkg(component);
			if (component_package !== null){
				if (component_package.fromGitRepo !== null){
					Repos.add(component_package.fromGitRepo);
				}
				if (!component_package.dependency.empty){
					for (Dependency depend: component_package.dependency){
						if ((depend as PackageDependency).package !== null){
							if ((depend as PackageDependency).package.fromGitRepo !== null){
								Repos.add((depend as PackageDependency).package.fromGitRepo);					
					}
				}
			}
		}}}
		return Repos;
	}

}