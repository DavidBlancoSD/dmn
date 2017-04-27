/**
 */
package dmn;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dmn.Expression#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see dmn.DmnPackage#getExpression()
 * @model abstract="true"
 * @generated
 */
public interface Expression extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' reference list.
	 * The list contents are of type {@link dmn.ItcmDcfinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' reference list.
	 * @see dmn.DmnPackage#getExpression_Value()
	 * @model required="true"
	 *        extendedMetaData="wildcards='' name=''"
	 * @generated
	 */
	EList<ItcmDcfinition> getValue();

} // Expression
