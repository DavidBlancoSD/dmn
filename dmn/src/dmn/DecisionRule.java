/**
 */
package dmn;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Decision Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dmn.DecisionRule#getInputEntry <em>Input Entry</em>}</li>
 *   <li>{@link dmn.DecisionRule#getOutputEntry <em>Output Entry</em>}</li>
 * </ul>
 *
 * @see dmn.DmnPackage#getDecisionRule()
 * @model
 * @generated
 */
public interface DecisionRule extends DMNElement {
	/**
	 * Returns the value of the '<em><b>Input Entry</b></em>' containment reference list.
	 * The list contents are of type {@link dmn.UnaryTest}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Entry</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Entry</em>' containment reference list.
	 * @see dmn.DmnPackage#getDecisionRule_InputEntry()
	 * @model containment="true"
	 * @generated
	 */
	EList<UnaryTest> getInputEntry();

	/**
	 * Returns the value of the '<em><b>Output Entry</b></em>' containment reference list.
	 * The list contents are of type {@link dmn.LiteralExpression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output Entry</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Entry</em>' containment reference list.
	 * @see dmn.DmnPackage#getDecisionRule_OutputEntry()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<LiteralExpression> getOutputEntry();

} // DecisionRule
