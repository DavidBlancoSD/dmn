/**
 */
package dmn.impl;

import dmn.DmnPackage;
import dmn.ItcmDcfinition;
import dmn.UnaryTest;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Itcm Dcfinition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dmn.impl.ItcmDcfinitionImpl#getAllowedValues <em>Allowed Values</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ItcmDcfinitionImpl extends MinimalEObjectImpl.Container implements ItcmDcfinition {
	/**
	 * The cached value of the '{@link #getAllowedValues() <em>Allowed Values</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowedValues()
	 * @generated
	 * @ordered
	 */
	protected UnaryTest allowedValues;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ItcmDcfinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DmnPackage.Literals.ITCM_DCFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnaryTest getAllowedValues() {
		return allowedValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAllowedValues(UnaryTest newAllowedValues, NotificationChain msgs) {
		UnaryTest oldAllowedValues = allowedValues;
		allowedValues = newAllowedValues;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DmnPackage.ITCM_DCFINITION__ALLOWED_VALUES, oldAllowedValues, newAllowedValues);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAllowedValues(UnaryTest newAllowedValues) {
		if (newAllowedValues != allowedValues) {
			NotificationChain msgs = null;
			if (allowedValues != null)
				msgs = ((InternalEObject)allowedValues).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DmnPackage.ITCM_DCFINITION__ALLOWED_VALUES, null, msgs);
			if (newAllowedValues != null)
				msgs = ((InternalEObject)newAllowedValues).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DmnPackage.ITCM_DCFINITION__ALLOWED_VALUES, null, msgs);
			msgs = basicSetAllowedValues(newAllowedValues, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DmnPackage.ITCM_DCFINITION__ALLOWED_VALUES, newAllowedValues, newAllowedValues));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DmnPackage.ITCM_DCFINITION__ALLOWED_VALUES:
				return basicSetAllowedValues(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DmnPackage.ITCM_DCFINITION__ALLOWED_VALUES:
				return getAllowedValues();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DmnPackage.ITCM_DCFINITION__ALLOWED_VALUES:
				setAllowedValues((UnaryTest)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case DmnPackage.ITCM_DCFINITION__ALLOWED_VALUES:
				setAllowedValues((UnaryTest)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case DmnPackage.ITCM_DCFINITION__ALLOWED_VALUES:
				return allowedValues != null;
		}
		return super.eIsSet(featureID);
	}

} //ItcmDcfinitionImpl
