/**
 */
package dmn;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Decision Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dmn.DecisionTable#getInput <em>Input</em>}</li>
 *   <li>{@link dmn.DecisionTable#getDecisionTable <em>Decision Table</em>}</li>
 *   <li>{@link dmn.DecisionTable#getHitPolicy <em>Hit Policy</em>}</li>
 *   <li>{@link dmn.DecisionTable#getAggregation <em>Aggregation</em>}</li>
 *   <li>{@link dmn.DecisionTable#getPreferredOrientation <em>Preferred Orientation</em>}</li>
 *   <li>{@link dmn.DecisionTable#getOutputLabel <em>Output Label</em>}</li>
 *   <li>{@link dmn.DecisionTable#getOutput <em>Output</em>}</li>
 * </ul>
 *
 * @see dmn.DmnPackage#getDecisionTable()
 * @model
 * @generated
 */
public interface DecisionTable extends Expression {
	/**
	 * Returns the value of the '<em><b>Input</b></em>' containment reference list.
	 * The list contents are of type {@link dmn.InputClause}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input</em>' containment reference list.
	 * @see dmn.DmnPackage#getDecisionTable_Input()
	 * @model containment="true"
	 * @generated
	 */
	EList<InputClause> getInput();

	/**
	 * Returns the value of the '<em><b>Decision Table</b></em>' containment reference list.
	 * The list contents are of type {@link dmn.DecisionRule}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Decision Table</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decision Table</em>' containment reference list.
	 * @see dmn.DmnPackage#getDecisionTable_DecisionTable()
	 * @model containment="true"
	 * @generated
	 */
	EList<DecisionRule> getDecisionTable();

	/**
	 * Returns the value of the '<em><b>Hit Policy</b></em>' attribute.
	 * The literals are from the enumeration {@link dmn.HitPolicy}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hit Policy</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hit Policy</em>' attribute.
	 * @see dmn.HitPolicy
	 * @see #setHitPolicy(HitPolicy)
	 * @see dmn.DmnPackage#getDecisionTable_HitPolicy()
	 * @model
	 * @generated
	 */
	HitPolicy getHitPolicy();

	/**
	 * Sets the value of the '{@link dmn.DecisionTable#getHitPolicy <em>Hit Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hit Policy</em>' attribute.
	 * @see dmn.HitPolicy
	 * @see #getHitPolicy()
	 * @generated
	 */
	void setHitPolicy(HitPolicy value);

	/**
	 * Returns the value of the '<em><b>Aggregation</b></em>' attribute.
	 * The literals are from the enumeration {@link dmn.BuiltinAggregator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aggregation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aggregation</em>' attribute.
	 * @see dmn.BuiltinAggregator
	 * @see #setAggregation(BuiltinAggregator)
	 * @see dmn.DmnPackage#getDecisionTable_Aggregation()
	 * @model
	 * @generated
	 */
	BuiltinAggregator getAggregation();

	/**
	 * Sets the value of the '{@link dmn.DecisionTable#getAggregation <em>Aggregation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aggregation</em>' attribute.
	 * @see dmn.BuiltinAggregator
	 * @see #getAggregation()
	 * @generated
	 */
	void setAggregation(BuiltinAggregator value);

	/**
	 * Returns the value of the '<em><b>Preferred Orientation</b></em>' attribute.
	 * The literals are from the enumeration {@link dmn.DecisionTableOrientation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Preferred Orientation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Preferred Orientation</em>' attribute.
	 * @see dmn.DecisionTableOrientation
	 * @see #setPreferredOrientation(DecisionTableOrientation)
	 * @see dmn.DmnPackage#getDecisionTable_PreferredOrientation()
	 * @model
	 * @generated
	 */
	DecisionTableOrientation getPreferredOrientation();

	/**
	 * Sets the value of the '{@link dmn.DecisionTable#getPreferredOrientation <em>Preferred Orientation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Preferred Orientation</em>' attribute.
	 * @see dmn.DecisionTableOrientation
	 * @see #getPreferredOrientation()
	 * @generated
	 */
	void setPreferredOrientation(DecisionTableOrientation value);

	/**
	 * Returns the value of the '<em><b>Output Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Label</em>' attribute.
	 * @see #setOutputLabel(String)
	 * @see dmn.DmnPackage#getDecisionTable_OutputLabel()
	 * @model
	 * @generated
	 */
	String getOutputLabel();

	/**
	 * Sets the value of the '{@link dmn.DecisionTable#getOutputLabel <em>Output Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output Label</em>' attribute.
	 * @see #getOutputLabel()
	 * @generated
	 */
	void setOutputLabel(String value);

	/**
	 * Returns the value of the '<em><b>Output</b></em>' containment reference list.
	 * The list contents are of type {@link dmn.OutputClause}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output</em>' containment reference list.
	 * @see dmn.DmnPackage#getDecisionTable_Output()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<OutputClause> getOutput();

} // DecisionTable
