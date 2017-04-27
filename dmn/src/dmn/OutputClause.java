/**
 */
package dmn;

import javax.xml.namespace.QName;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Output Clause</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dmn.OutputClause#getDefaultOutputEntry <em>Default Output Entry</em>}</li>
 *   <li>{@link dmn.OutputClause#getOutputDefinition <em>Output Definition</em>}</li>
 *   <li>{@link dmn.OutputClause#getOutputValues <em>Output Values</em>}</li>
 *   <li>{@link dmn.OutputClause#getName <em>Name</em>}</li>
 *   <li>{@link dmn.OutputClause#getTypeRef <em>Type Ref</em>}</li>
 * </ul>
 *
 * @see dmn.DmnPackage#getOutputClause()
 * @model
 * @generated
 */
public interface OutputClause extends DMNElement {
	/**
	 * Returns the value of the '<em><b>Default Output Entry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Output Entry</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Output Entry</em>' containment reference.
	 * @see #setDefaultOutputEntry(LiteralExpression)
	 * @see dmn.DmnPackage#getOutputClause_DefaultOutputEntry()
	 * @model containment="true"
	 * @generated
	 */
	LiteralExpression getDefaultOutputEntry();

	/**
	 * Sets the value of the '{@link dmn.OutputClause#getDefaultOutputEntry <em>Default Output Entry</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Output Entry</em>' containment reference.
	 * @see #getDefaultOutputEntry()
	 * @generated
	 */
	void setDefaultOutputEntry(LiteralExpression value);

	/**
	 * Returns the value of the '<em><b>Output Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output Definition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Definition</em>' reference.
	 * @see #setOutputDefinition(ItcmDcfinition)
	 * @see dmn.DmnPackage#getOutputClause_OutputDefinition()
	 * @model
	 * @generated
	 */
	ItcmDcfinition getOutputDefinition();

	/**
	 * Sets the value of the '{@link dmn.OutputClause#getOutputDefinition <em>Output Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output Definition</em>' reference.
	 * @see #getOutputDefinition()
	 * @generated
	 */
	void setOutputDefinition(ItcmDcfinition value);

	/**
	 * Returns the value of the '<em><b>Output Values</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output Values</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Values</em>' containment reference.
	 * @see #setOutputValues(UnaryTest)
	 * @see dmn.DmnPackage#getOutputClause_OutputValues()
	 * @model containment="true"
	 * @generated
	 */
	UnaryTest getOutputValues();

	/**
	 * Sets the value of the '{@link dmn.OutputClause#getOutputValues <em>Output Values</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output Values</em>' containment reference.
	 * @see #getOutputValues()
	 * @generated
	 */
	void setOutputValues(UnaryTest value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see dmn.DmnPackage#getOutputClause_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link dmn.OutputClause#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Type Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Ref</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Ref</em>' attribute.
	 * @see #setTypeRef(QName)
	 * @see dmn.DmnPackage#getOutputClause_TypeRef()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.QName"
	 * @generated
	 */
	QName getTypeRef();

	/**
	 * Sets the value of the '{@link dmn.OutputClause#getTypeRef <em>Type Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Ref</em>' attribute.
	 * @see #getTypeRef()
	 * @generated
	 */
	void setTypeRef(QName value);

} // OutputClause
