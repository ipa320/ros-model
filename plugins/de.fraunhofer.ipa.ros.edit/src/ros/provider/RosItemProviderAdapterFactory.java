/**
 */
package ros.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

import ros.util.RosAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class RosItemProviderAdapterFactory extends RosAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RosItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link ros.Node} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NodeItemProvider nodeItemProvider;

	/**
	 * This creates an adapter for a {@link ros.Node}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createNodeAdapter() {
		if (nodeItemProvider == null) {
			nodeItemProvider = new NodeItemProvider(this);
		}

		return nodeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ros.Package} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PackageItemProvider packageItemProvider;

	/**
	 * This creates an adapter for a {@link ros.Package}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPackageAdapter() {
		if (packageItemProvider == null) {
			packageItemProvider = new PackageItemProvider(this);
		}

		return packageItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ros.ServiceServer} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceServerItemProvider serviceServerItemProvider;

	/**
	 * This creates an adapter for a {@link ros.ServiceServer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createServiceServerAdapter() {
		if (serviceServerItemProvider == null) {
			serviceServerItemProvider = new ServiceServerItemProvider(this);
		}

		return serviceServerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ros.Publisher} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PublisherItemProvider publisherItemProvider;

	/**
	 * This creates an adapter for a {@link ros.Publisher}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPublisherAdapter() {
		if (publisherItemProvider == null) {
			publisherItemProvider = new PublisherItemProvider(this);
		}

		return publisherItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ros.PackageDependency} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PackageDependencyItemProvider packageDependencyItemProvider;

	/**
	 * This creates an adapter for a {@link ros.PackageDependency}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPackageDependencyAdapter() {
		if (packageDependencyItemProvider == null) {
			packageDependencyItemProvider = new PackageDependencyItemProvider(this);
		}

		return packageDependencyItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ros.ExternalDependency} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExternalDependencyItemProvider externalDependencyItemProvider;

	/**
	 * This creates an adapter for a {@link ros.ExternalDependency}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createExternalDependencyAdapter() {
		if (externalDependencyItemProvider == null) {
			externalDependencyItemProvider = new ExternalDependencyItemProvider(this);
		}

		return externalDependencyItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ros.CatkinPackage} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CatkinPackageItemProvider catkinPackageItemProvider;

	/**
	 * This creates an adapter for a {@link ros.CatkinPackage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCatkinPackageAdapter() {
		if (catkinPackageItemProvider == null) {
			catkinPackageItemProvider = new CatkinPackageItemProvider(this);
		}

		return catkinPackageItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ros.Artifact} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArtifactItemProvider artifactItemProvider;

	/**
	 * This creates an adapter for a {@link ros.Artifact}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createArtifactAdapter() {
		if (artifactItemProvider == null) {
			artifactItemProvider = new ArtifactItemProvider(this);
		}

		return artifactItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ros.Subscriber} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubscriberItemProvider subscriberItemProvider;

	/**
	 * This creates an adapter for a {@link ros.Subscriber}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSubscriberAdapter() {
		if (subscriberItemProvider == null) {
			subscriberItemProvider = new SubscriberItemProvider(this);
		}

		return subscriberItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ros.ServiceClient} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceClientItemProvider serviceClientItemProvider;

	/**
	 * This creates an adapter for a {@link ros.ServiceClient}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createServiceClientAdapter() {
		if (serviceClientItemProvider == null) {
			serviceClientItemProvider = new ServiceClientItemProvider(this);
		}

		return serviceClientItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ros.PackageSet} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PackageSetItemProvider packageSetItemProvider;

	/**
	 * This creates an adapter for a {@link ros.PackageSet}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPackageSetAdapter() {
		if (packageSetItemProvider == null) {
			packageSetItemProvider = new PackageSetItemProvider(this);
		}

		return packageSetItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ros.ActionServer} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActionServerItemProvider actionServerItemProvider;

	/**
	 * This creates an adapter for a {@link ros.ActionServer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createActionServerAdapter() {
		if (actionServerItemProvider == null) {
			actionServerItemProvider = new ActionServerItemProvider(this);
		}

		return actionServerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ros.ActionClient} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActionClientItemProvider actionClientItemProvider;

	/**
	 * This creates an adapter for a {@link ros.ActionClient}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createActionClientAdapter() {
		if (actionClientItemProvider == null) {
			actionClientItemProvider = new ActionClientItemProvider(this);
		}

		return actionClientItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ros.MessageDefinition} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MessageDefinitionItemProvider messageDefinitionItemProvider;

	/**
	 * This creates an adapter for a {@link ros.MessageDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMessageDefinitionAdapter() {
		if (messageDefinitionItemProvider == null) {
			messageDefinitionItemProvider = new MessageDefinitionItemProvider(this);
		}

		return messageDefinitionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ros.GlobalNamespace} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GlobalNamespaceItemProvider globalNamespaceItemProvider;

	/**
	 * This creates an adapter for a {@link ros.GlobalNamespace}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGlobalNamespaceAdapter() {
		if (globalNamespaceItemProvider == null) {
			globalNamespaceItemProvider = new GlobalNamespaceItemProvider(this);
		}

		return globalNamespaceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ros.RelativeNamespace} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelativeNamespaceItemProvider relativeNamespaceItemProvider;

	/**
	 * This creates an adapter for a {@link ros.RelativeNamespace}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRelativeNamespaceAdapter() {
		if (relativeNamespaceItemProvider == null) {
			relativeNamespaceItemProvider = new RelativeNamespaceItemProvider(this);
		}

		return relativeNamespaceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ros.PrivateNamespace} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PrivateNamespaceItemProvider privateNamespaceItemProvider;

	/**
	 * This creates an adapter for a {@link ros.PrivateNamespace}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPrivateNamespaceAdapter() {
		if (privateNamespaceItemProvider == null) {
			privateNamespaceItemProvider = new PrivateNamespaceItemProvider(this);
		}

		return privateNamespaceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ros.NamespacedElement} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NamespacedElementItemProvider namespacedElementItemProvider;

	/**
	 * This creates an adapter for a {@link ros.NamespacedElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createNamespacedElementAdapter() {
		if (namespacedElementItemProvider == null) {
			namespacedElementItemProvider = new NamespacedElementItemProvider(this);
		}

		return namespacedElementItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ros.ParameterListType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterListTypeItemProvider parameterListTypeItemProvider;

	/**
	 * This creates an adapter for a {@link ros.ParameterListType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createParameterListTypeAdapter() {
		if (parameterListTypeItemProvider == null) {
			parameterListTypeItemProvider = new ParameterListTypeItemProvider(this);
		}

		return parameterListTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ros.ParameterStructType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterStructTypeItemProvider parameterStructTypeItemProvider;

	/**
	 * This creates an adapter for a {@link ros.ParameterStructType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createParameterStructTypeAdapter() {
		if (parameterStructTypeItemProvider == null) {
			parameterStructTypeItemProvider = new ParameterStructTypeItemProvider(this);
		}

		return parameterStructTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ros.ParameterIntegerType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterIntegerTypeItemProvider parameterIntegerTypeItemProvider;

	/**
	 * This creates an adapter for a {@link ros.ParameterIntegerType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createParameterIntegerTypeAdapter() {
		if (parameterIntegerTypeItemProvider == null) {
			parameterIntegerTypeItemProvider = new ParameterIntegerTypeItemProvider(this);
		}

		return parameterIntegerTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ros.ParameterStringType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterStringTypeItemProvider parameterStringTypeItemProvider;

	/**
	 * This creates an adapter for a {@link ros.ParameterStringType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createParameterStringTypeAdapter() {
		if (parameterStringTypeItemProvider == null) {
			parameterStringTypeItemProvider = new ParameterStringTypeItemProvider(this);
		}

		return parameterStringTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ros.ParameterDoubleType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterDoubleTypeItemProvider parameterDoubleTypeItemProvider;

	/**
	 * This creates an adapter for a {@link ros.ParameterDoubleType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createParameterDoubleTypeAdapter() {
		if (parameterDoubleTypeItemProvider == null) {
			parameterDoubleTypeItemProvider = new ParameterDoubleTypeItemProvider(this);
		}

		return parameterDoubleTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ros.Parameter} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterItemProvider parameterItemProvider;

	/**
	 * This creates an adapter for a {@link ros.Parameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createParameterAdapter() {
		if (parameterItemProvider == null) {
			parameterItemProvider = new ParameterItemProvider(this);
		}

		return parameterItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ros.ParameterDateType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterDateTypeItemProvider parameterDateTypeItemProvider;

	/**
	 * This creates an adapter for a {@link ros.ParameterDateType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createParameterDateTypeAdapter() {
		if (parameterDateTypeItemProvider == null) {
			parameterDateTypeItemProvider = new ParameterDateTypeItemProvider(this);
		}

		return parameterDateTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ros.ParameterBooleanType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterBooleanTypeItemProvider parameterBooleanTypeItemProvider;

	/**
	 * This creates an adapter for a {@link ros.ParameterBooleanType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createParameterBooleanTypeAdapter() {
		if (parameterBooleanTypeItemProvider == null) {
			parameterBooleanTypeItemProvider = new ParameterBooleanTypeItemProvider(this);
		}

		return parameterBooleanTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ros.ParameterBase64Type} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterBase64TypeItemProvider parameterBase64TypeItemProvider;

	/**
	 * This creates an adapter for a {@link ros.ParameterBase64Type}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createParameterBase64TypeAdapter() {
		if (parameterBase64TypeItemProvider == null) {
			parameterBase64TypeItemProvider = new ParameterBase64TypeItemProvider(this);
		}

		return parameterBase64TypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ros.ParameterAnyType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterAnyTypeItemProvider parameterAnyTypeItemProvider;

	/**
	 * This creates an adapter for a {@link ros.ParameterAnyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createParameterAnyTypeAdapter() {
		if (parameterAnyTypeItemProvider == null) {
			parameterAnyTypeItemProvider = new ParameterAnyTypeItemProvider(this);
		}

		return parameterAnyTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ros.ParameterStructTypeMember} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterStructTypeMemberItemProvider parameterStructTypeMemberItemProvider;

	/**
	 * This creates an adapter for a {@link ros.ParameterStructTypeMember}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createParameterStructTypeMemberAdapter() {
		if (parameterStructTypeMemberItemProvider == null) {
			parameterStructTypeMemberItemProvider = new ParameterStructTypeMemberItemProvider(this);
		}

		return parameterStructTypeMemberItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ros.ParameterArrayType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterArrayTypeItemProvider parameterArrayTypeItemProvider;

	/**
	 * This creates an adapter for a {@link ros.ParameterArrayType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createParameterArrayTypeAdapter() {
		if (parameterArrayTypeItemProvider == null) {
			parameterArrayTypeItemProvider = new ParameterArrayTypeItemProvider(this);
		}

		return parameterArrayTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ros.ParameterAny} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterAnyItemProvider parameterAnyItemProvider;

	/**
	 * This creates an adapter for a {@link ros.ParameterAny}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createParameterAnyAdapter() {
		if (parameterAnyItemProvider == null) {
			parameterAnyItemProvider = new ParameterAnyItemProvider(this);
		}

		return parameterAnyItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ros.ParameterString} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterStringItemProvider parameterStringItemProvider;

	/**
	 * This creates an adapter for a {@link ros.ParameterString}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createParameterStringAdapter() {
		if (parameterStringItemProvider == null) {
			parameterStringItemProvider = new ParameterStringItemProvider(this);
		}

		return parameterStringItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ros.ParameterBase64} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterBase64ItemProvider parameterBase64ItemProvider;

	/**
	 * This creates an adapter for a {@link ros.ParameterBase64}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createParameterBase64Adapter() {
		if (parameterBase64ItemProvider == null) {
			parameterBase64ItemProvider = new ParameterBase64ItemProvider(this);
		}

		return parameterBase64ItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ros.ParameterInteger} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterIntegerItemProvider parameterIntegerItemProvider;

	/**
	 * This creates an adapter for a {@link ros.ParameterInteger}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createParameterIntegerAdapter() {
		if (parameterIntegerItemProvider == null) {
			parameterIntegerItemProvider = new ParameterIntegerItemProvider(this);
		}

		return parameterIntegerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ros.ParameterDouble} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterDoubleItemProvider parameterDoubleItemProvider;

	/**
	 * This creates an adapter for a {@link ros.ParameterDouble}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createParameterDoubleAdapter() {
		if (parameterDoubleItemProvider == null) {
			parameterDoubleItemProvider = new ParameterDoubleItemProvider(this);
		}

		return parameterDoubleItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ros.ParameterBoolean} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterBooleanItemProvider parameterBooleanItemProvider;

	/**
	 * This creates an adapter for a {@link ros.ParameterBoolean}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createParameterBooleanAdapter() {
		if (parameterBooleanItemProvider == null) {
			parameterBooleanItemProvider = new ParameterBooleanItemProvider(this);
		}

		return parameterBooleanItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ros.ParameterSequence} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterSequenceItemProvider parameterSequenceItemProvider;

	/**
	 * This creates an adapter for a {@link ros.ParameterSequence}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createParameterSequenceAdapter() {
		if (parameterSequenceItemProvider == null) {
			parameterSequenceItemProvider = new ParameterSequenceItemProvider(this);
		}

		return parameterSequenceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ros.ParameterStruct} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterStructItemProvider parameterStructItemProvider;

	/**
	 * This creates an adapter for a {@link ros.ParameterStruct}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createParameterStructAdapter() {
		if (parameterStructItemProvider == null) {
			parameterStructItemProvider = new ParameterStructItemProvider(this);
		}

		return parameterStructItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ros.ParameterStructMember} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterStructMemberItemProvider parameterStructMemberItemProvider;

	/**
	 * This creates an adapter for a {@link ros.ParameterStructMember}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createParameterStructMemberAdapter() {
		if (parameterStructMemberItemProvider == null) {
			parameterStructMemberItemProvider = new ParameterStructMemberItemProvider(this);
		}

		return parameterStructMemberItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ros.ParameterDate} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterDateItemProvider parameterDateItemProvider;

	/**
	 * This creates an adapter for a {@link ros.ParameterDate}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createParameterDateAdapter() {
		if (parameterDateItemProvider == null) {
			parameterDateItemProvider = new ParameterDateItemProvider(this);
		}

		return parameterDateItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void dispose() {
		if (nodeItemProvider != null) nodeItemProvider.dispose();
		if (packageItemProvider != null) packageItemProvider.dispose();
		if (serviceServerItemProvider != null) serviceServerItemProvider.dispose();
		if (packageDependencyItemProvider != null) packageDependencyItemProvider.dispose();
		if (externalDependencyItemProvider != null) externalDependencyItemProvider.dispose();
		if (catkinPackageItemProvider != null) catkinPackageItemProvider.dispose();
		if (publisherItemProvider != null) publisherItemProvider.dispose();
		if (artifactItemProvider != null) artifactItemProvider.dispose();
		if (subscriberItemProvider != null) subscriberItemProvider.dispose();
		if (serviceClientItemProvider != null) serviceClientItemProvider.dispose();
		if (packageSetItemProvider != null) packageSetItemProvider.dispose();
		if (actionServerItemProvider != null) actionServerItemProvider.dispose();
		if (actionClientItemProvider != null) actionClientItemProvider.dispose();
		if (messageDefinitionItemProvider != null) messageDefinitionItemProvider.dispose();
		if (globalNamespaceItemProvider != null) globalNamespaceItemProvider.dispose();
		if (relativeNamespaceItemProvider != null) relativeNamespaceItemProvider.dispose();
		if (privateNamespaceItemProvider != null) privateNamespaceItemProvider.dispose();
		if (namespacedElementItemProvider != null) namespacedElementItemProvider.dispose();
		if (parameterListTypeItemProvider != null) parameterListTypeItemProvider.dispose();
		if (parameterStructTypeItemProvider != null) parameterStructTypeItemProvider.dispose();
		if (parameterIntegerTypeItemProvider != null) parameterIntegerTypeItemProvider.dispose();
		if (parameterStringTypeItemProvider != null) parameterStringTypeItemProvider.dispose();
		if (parameterDoubleTypeItemProvider != null) parameterDoubleTypeItemProvider.dispose();
		if (parameterItemProvider != null) parameterItemProvider.dispose();
		if (parameterDateTypeItemProvider != null) parameterDateTypeItemProvider.dispose();
		if (parameterBooleanTypeItemProvider != null) parameterBooleanTypeItemProvider.dispose();
		if (parameterBase64TypeItemProvider != null) parameterBase64TypeItemProvider.dispose();
		if (parameterAnyTypeItemProvider != null) parameterAnyTypeItemProvider.dispose();
		if (parameterStructTypeMemberItemProvider != null) parameterStructTypeMemberItemProvider.dispose();
		if (parameterArrayTypeItemProvider != null) parameterArrayTypeItemProvider.dispose();
		if (parameterAnyItemProvider != null) parameterAnyItemProvider.dispose();
		if (parameterStringItemProvider != null) parameterStringItemProvider.dispose();
		if (parameterBase64ItemProvider != null) parameterBase64ItemProvider.dispose();
		if (parameterIntegerItemProvider != null) parameterIntegerItemProvider.dispose();
		if (parameterDoubleItemProvider != null) parameterDoubleItemProvider.dispose();
		if (parameterBooleanItemProvider != null) parameterBooleanItemProvider.dispose();
		if (parameterSequenceItemProvider != null) parameterSequenceItemProvider.dispose();
		if (parameterStructItemProvider != null) parameterStructItemProvider.dispose();
		if (parameterStructMemberItemProvider != null) parameterStructMemberItemProvider.dispose();
		if (parameterDateItemProvider != null) parameterDateItemProvider.dispose();
	}

}
