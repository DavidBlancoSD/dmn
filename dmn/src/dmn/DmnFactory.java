/**
 */
package dmn;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see dmn.DmnPackage
 * @generated
 */
public interface DmnFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DmnFactory eINSTANCE = dmn.impl.DmnFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Unary Test</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unary Test</em>'.
	 * @generated
	 */
	UnaryTest createUnaryTest();

	/**
	 * Returns a new object of class '<em>Decision Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Decision Rule</em>'.
	 * @generated
	 */
	DecisionRule createDecisionRule();

	/**
	 * Returns a new object of class '<em>Literal Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Literal Expression</em>'.
	 * @generated
	 */
	LiteralExpression createLiteralExpression();

	/**
	 * Returns a new object of class '<em>Input Clause</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Input Clause</em>'.
	 * @generated
	 */
	InputClause createInputClause();

	/**
	 * Returns a new object of class '<em>Itcm Dcfinition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Itcm Dcfinition</em>'.
	 * @generated
	 */
	ItcmDcfinition createItcmDcfinition();

	/**
	 * Returns a new object of class '<em>Decision Table</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Decision Table</em>'.
	 * @generated
	 */
	DecisionTable createDecisionTable();

	/**
	 * Returns a new object of class '<em>Output Clause</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Output Clause</em>'.
	 * @generated
	 */
	OutputClause createOutputClause();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DmnPackage getDmnPackage();

} //DmnFactory
