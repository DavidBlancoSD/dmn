/**
 */
package dmn;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Itcm Dcfinition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dmn.ItcmDcfinition#getAllowedValues <em>Allowed Values</em>}</li>
 * </ul>
 *
 * @see dmn.DmnPackage#getItcmDcfinition()
 * @model
 * @generated
 */
public interface ItcmDcfinition extends EObject {
	/**
	 * Returns the value of the '<em><b>Allowed Values</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allowed Values</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allowed Values</em>' containment reference.
	 * @see #setAllowedValues(UnaryTest)
	 * @see dmn.DmnPackage#getItcmDcfinition_AllowedValues()
	 * @model containment="true"
	 * @generated
	 */
	UnaryTest getAllowedValues();

	/**
	 * Sets the value of the '{@link dmn.ItcmDcfinition#getAllowedValues <em>Allowed Values</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allowed Values</em>' containment reference.
	 * @see #getAllowedValues()
	 * @generated
	 */
	void setAllowedValues(UnaryTest value);

} // ItcmDcfinition
