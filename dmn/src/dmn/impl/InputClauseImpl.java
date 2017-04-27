/**
 */
package dmn.impl;

import dmn.DmnPackage;
import dmn.InputClause;
import dmn.LiteralExpression;
import dmn.UnaryTest;

import javax.xml.namespace.QName;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Input Clause</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dmn.impl.InputClauseImpl#getInputValues <em>Input Values</em>}</li>
 *   <li>{@link dmn.impl.InputClauseImpl#getInputExpression <em>Input Expression</em>}</li>
 *   <li>{@link dmn.impl.InputClauseImpl#getName <em>Name</em>}</li>
 *   <li>{@link dmn.impl.InputClauseImpl#getTypeRef <em>Type Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InputClauseImpl extends DMNElementImpl implements InputClause {
	/**
	 * The cached value of the '{@link #getInputValues() <em>Input Values</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputValues()
	 * @generated
	 * @ordered
	 */
	protected UnaryTest inputValues;

	/**
	 * The cached value of the '{@link #getInputExpression() <em>Input Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputExpression()
	 * @generated
	 * @ordered
	 */
	protected LiteralExpression inputExpression;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getTypeRef() <em>Type Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeRef()
	 * @generated
	 * @ordered
	 */
	protected static final QName TYPE_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTypeRef() <em>Type Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeRef()
	 * @generated
	 * @ordered
	 */
	protected QName typeRef = TYPE_REF_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InputClauseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DmnPackage.Literals.INPUT_CLAUSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnaryTest getInputValues() {
		return inputValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInputValues(UnaryTest newInputValues, NotificationChain msgs) {
		UnaryTest oldInputValues = inputValues;
		inputValues = newInputValues;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DmnPackage.INPUT_CLAUSE__INPUT_VALUES, oldInputValues, newInputValues);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInputValues(UnaryTest newInputValues) {
		if (newInputValues != inputValues) {
			NotificationChain msgs = null;
			if (inputValues != null)
				msgs = ((InternalEObject)inputValues).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DmnPackage.INPUT_CLAUSE__INPUT_VALUES, null, msgs);
			if (newInputValues != null)
				msgs = ((InternalEObject)newInputValues).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DmnPackage.INPUT_CLAUSE__INPUT_VALUES, null, msgs);
			msgs = basicSetInputValues(newInputValues, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DmnPackage.INPUT_CLAUSE__INPUT_VALUES, newInputValues, newInputValues));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiteralExpression getInputExpression() {
		return inputExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInputExpression(LiteralExpression newInputExpression, NotificationChain msgs) {
		LiteralExpression oldInputExpression = inputExpression;
		inputExpression = newInputExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DmnPackage.INPUT_CLAUSE__INPUT_EXPRESSION, oldInputExpression, newInputExpression);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInputExpression(LiteralExpression newInputExpression) {
		if (newInputExpression != inputExpression) {
			NotificationChain msgs = null;
			if (inputExpression != null)
				msgs = ((InternalEObject)inputExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DmnPackage.INPUT_CLAUSE__INPUT_EXPRESSION, null, msgs);
			if (newInputExpression != null)
				msgs = ((InternalEObject)newInputExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DmnPackage.INPUT_CLAUSE__INPUT_EXPRESSION, null, msgs);
			msgs = basicSetInputExpression(newInputExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DmnPackage.INPUT_CLAUSE__INPUT_EXPRESSION, newInputExpression, newInputExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DmnPackage.INPUT_CLAUSE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QName getTypeRef() {
		return typeRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeRef(QName newTypeRef) {
		QName oldTypeRef = typeRef;
		typeRef = newTypeRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DmnPackage.INPUT_CLAUSE__TYPE_REF, oldTypeRef, typeRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DmnPackage.INPUT_CLAUSE__INPUT_VALUES:
				return basicSetInputValues(null, msgs);
			case DmnPackage.INPUT_CLAUSE__INPUT_EXPRESSION:
				return basicSetInputExpression(null, msgs);
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
			case DmnPackage.INPUT_CLAUSE__INPUT_VALUES:
				return getInputValues();
			case DmnPackage.INPUT_CLAUSE__INPUT_EXPRESSION:
				return getInputExpression();
			case DmnPackage.INPUT_CLAUSE__NAME:
				return getName();
			case DmnPackage.INPUT_CLAUSE__TYPE_REF:
				return getTypeRef();
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
			case DmnPackage.INPUT_CLAUSE__INPUT_VALUES:
				setInputValues((UnaryTest)newValue);
				return;
			case DmnPackage.INPUT_CLAUSE__INPUT_EXPRESSION:
				setInputExpression((LiteralExpression)newValue);
				return;
			case DmnPackage.INPUT_CLAUSE__NAME:
				setName((String)newValue);
				return;
			case DmnPackage.INPUT_CLAUSE__TYPE_REF:
				setTypeRef((QName)newValue);
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
			case DmnPackage.INPUT_CLAUSE__INPUT_VALUES:
				setInputValues((UnaryTest)null);
				return;
			case DmnPackage.INPUT_CLAUSE__INPUT_EXPRESSION:
				setInputExpression((LiteralExpression)null);
				return;
			case DmnPackage.INPUT_CLAUSE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case DmnPackage.INPUT_CLAUSE__TYPE_REF:
				setTypeRef(TYPE_REF_EDEFAULT);
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
			case DmnPackage.INPUT_CLAUSE__INPUT_VALUES:
				return inputValues != null;
			case DmnPackage.INPUT_CLAUSE__INPUT_EXPRESSION:
				return inputExpression != null;
			case DmnPackage.INPUT_CLAUSE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DmnPackage.INPUT_CLAUSE__TYPE_REF:
				return TYPE_REF_EDEFAULT == null ? typeRef != null : !TYPE_REF_EDEFAULT.equals(typeRef);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", typeRef: ");
		result.append(typeRef);
		result.append(')');
		return result.toString();
	}

} //InputClauseImpl
