/**
 */
package dmn;

import javax.xml.namespace.QName;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Input Clause</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dmn.InputClause#getInputValues <em>Input Values</em>}</li>
 *   <li>{@link dmn.InputClause#getInputExpression <em>Input Expression</em>}</li>
 *   <li>{@link dmn.InputClause#getName <em>Name</em>}</li>
 *   <li>{@link dmn.InputClause#getTypeRef <em>Type Ref</em>}</li>
 * </ul>
 *
 * @see dmn.DmnPackage#getInputClause()
 * @model
 * @generated
 */
public interface InputClause extends DMNElement {
	/**
	 * Returns the value of the '<em><b>Input Values</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Values</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Values</em>' containment reference.
	 * @see #setInputValues(UnaryTest)
	 * @see dmn.DmnPackage#getInputClause_InputValues()
	 * @model containment="true"
	 * @generated
	 */
	UnaryTest getInputValues();

	/**
	 * Sets the value of the '{@link dmn.InputClause#getInputValues <em>Input Values</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Values</em>' containment reference.
	 * @see #getInputValues()
	 * @generated
	 */
	void setInputValues(UnaryTest value);

	/**
	 * Returns the value of the '<em><b>Input Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Expression</em>' containment reference.
	 * @see #setInputExpression(LiteralExpression)
	 * @see dmn.DmnPackage#getInputClause_InputExpression()
	 * @model containment="true"
	 * @generated
	 */
	LiteralExpression getInputExpression();

	/**
	 * Sets the value of the '{@link dmn.InputClause#getInputExpression <em>Input Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Expression</em>' containment reference.
	 * @see #getInputExpression()
	 * @generated
	 */
	void setInputExpression(LiteralExpression value);

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
	 * @see dmn.DmnPackage#getInputClause_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link dmn.InputClause#getName <em>Name</em>}' attribute.
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
	 * @see dmn.DmnPackage#getInputClause_TypeRef()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.QName"
	 * @generated
	 */
	QName getTypeRef();

	/**
	 * Sets the value of the '{@link dmn.InputClause#getTypeRef <em>Type Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Ref</em>' attribute.
	 * @see #getTypeRef()
	 * @generated
	 */
	void setTypeRef(QName value);

} // InputClause
