/**
 */
package ros1.tests;

import junit.textui.TestRunner;

import ros1.ParameterSequence;
import ros1.Ros1Factory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Parameter Sequence</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ParameterSequenceTest extends ParameterValueTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ParameterSequenceTest.class);
	}

	/**
	 * Constructs a new Parameter Sequence test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterSequenceTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Parameter Sequence test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ParameterSequence getFixture() {
		return (ParameterSequence)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Ros1Factory.eINSTANCE.createParameterSequence());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //ParameterSequenceTest
