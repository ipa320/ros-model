/*
 * generated by Xtext 2.13.0
 */
package de.fraunhofer.ipa.rossystem.generator

import com.google.inject.Inject
import java.util.Set
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.eclipse.xtext.generator.IOutputConfigurationProvider
import org.eclipse.xtext.generator.OutputConfiguration
import rossystem.RosSystem

class CustomOutputProvider implements IOutputConfigurationProvider {
	public final static String CM_CONFIGURATION = "CM_CONFIGURATION"
	public final static String DEFAULT_OUTPUT = "DEFAULT_OUTPUT"
	

	override Set<OutputConfiguration> getOutputConfigurations() {
		var OutputConfiguration cm_config = new OutputConfiguration(CM_CONFIGURATION)
		cm_config.setDescription("CM_CONFIGURATION");
		cm_config.setOutputDirectory("./components/");
		cm_config.setOverrideExistingResources(true);
		cm_config.setCreateOutputDirectory(true);
		cm_config.setCleanUpDerivedResources(false);
		cm_config.setSetDerivedProperty(false);
		var OutputConfiguration default_config = new OutputConfiguration(DEFAULT_OUTPUT)
		default_config.setDescription("DEFAULT_OUTPUT");
		default_config.setOutputDirectory("./src-gen/");
		default_config.setOverrideExistingResources(true);
		default_config.setCreateOutputDirectory(true);
		default_config.setCleanUpDerivedResources(false);
		default_config.setSetDerivedProperty(false);
		return newHashSet(cm_config, default_config)
	}
}

class RosSystemGenerator extends AbstractGenerator {

	@Inject extension GeneratorHelpers
	@Inject extension PackageXmlCompiler
	@Inject extension CMakeListsCompiler
	@Inject extension ComponentInterfaceCompiler
	@Inject extension LaunchFileCompiler_ROS1
	@Inject extension LaunchFileCompiler_ROS2
	@Inject extension SetupPyCompile
	@Inject extension DockerContainerCompiler
	@Inject extension RosInstallCompiler
	
	//@Inject extension InstallScriptCompiler
	

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		for (system : resource.allContents.toIterable.filter(RosSystem)){
				fsa.generateFile(system.getName()+".componentinterface",CustomOutputProvider::CM_CONFIGURATION,system.compile_toComponentInterface)
				}
//		for (system : resource.allContents.toIterable.filter(RosSystem)){
//				fsa.generateFile(system.getName()+"install.sh",system.compile_toIntallScript)
//				}


		// ROS1 package
		for (system : resource.allContents.toIterable.filter(RosSystem)){
				fsa.generateFile(system.getName().toLowerCase+"/launch/"+system.getName()+".launch",system.compile_toROS1launch.toString().replace("\t","  "))
				}
		for (system : resource.allContents.toIterable.filter(RosSystem)){
				fsa.generateFile(system.getName().toLowerCase+"/package.xml",system.compile_package_xml_format2)
				}
		for (system : resource.allContents.toIterable.filter(RosSystem)){
				fsa.generateFile(system.getName().toLowerCase+"/CMakeLists.txt",system.compile_CMakeLists_ROS1)
				}
 		for (system : resource.allContents.toIterable.filter(RosSystem)){
 				fsa.generateFile(system.getName().toLowerCase+"/Dockerfile",system.compile_toDockerContainer)
 				}
 		for (system : resource.allContents.toIterable.filter(RosSystem)){
 				fsa.generateFile(system.getName().toLowerCase+"/.rosinstall",system.compile_toRosInstall)
 		}

		//ROS2 package
		for (system : resource.allContents.toIterable.filter(RosSystem)){
				fsa.generateFile(system.getName().toLowerCase+"_ros2/launch/"+system.getName()+".launch.py",system.compile_toROS2launch.toString().replace("\t","  "))
				}
		for (system : resource.allContents.toIterable.filter(RosSystem)){
				fsa.generateFile(system.getName().toLowerCase+"_ros2/package.xml",system.compile_package_xml_format3)
				}
		for (system : resource.allContents.toIterable.filter(RosSystem)){
				fsa.generateFile(system.getName().toLowerCase+"_ros2/setup.py",system.compile_setup_py)
				}
		for (system : resource.allContents.toIterable.filter(RosSystem)){
				fsa.generateFile(system.getName().toLowerCase+"_ros2/resource/" + system.getName().toLowerCase, "")
				}
		for (system : resource.allContents.toIterable.filter(RosSystem)){
				fsa.generateFile(system.getName().toLowerCase+"_ros2/" + system.getName().toLowerCase + "/__init__.py", "")
				}
//		for (system : resource.allContents.toIterable.filter(RosSystem)){
//				fsa.generateFile(system.getName().toLowerCase+"_ros2/CMakeLists.txt",system.compile_CMakeLists_ROS2)
//				}


	}
}

