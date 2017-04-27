/**
 */
package dmn.impl;

import dmn.DmnPackage;
import dmn.ItcmDcfinition;
import dmn.LiteralExpression;
import dmn.OutputClause;
import dmn.UnaryTest;

import javax.xml.namespace.QName;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Output Clause</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dmn.impl.OutputClauseImpl#getDefaultOutputEntry <em>Default Output Entry</em>}</li>
 *   <li>{@link dmn.impl.OutputClauseImpl#getOutputDefinition <em>Output Definition</em>}</li>
 *   <li>{@link dmn.impl.OutputClauseImpl#getOutputValues <em>Output Values</em>}</li>
 *   <li>{@link dmn.impl.OutputClauseImpl#getName <em>Name</em>}</li>
 *   <li>{@link dmn.impl.OutputClauseImpl#getTypeRef <em>Type Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OutputClauseImpl extends DMNElementImpl implements OutputClause {
	/**
	 * The cached value of the '{@link #getDefaultOutputEntry() <em>Default Output Entry</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultOutputEntry()
	 * @generated
	 * @ordered
	 */
	protected LiteralExpression defaultOutputEntry;

	/**
	 * The cached value of the '{@link #getOutputDefinition() <em>Output Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputDefinition()
	 * @generated
	 * @ordered
	 */
	protected ItcmDcfinition outputDefinition;

	/**
	 * The cached value of the '{@link #getOutputValues() <em>Output Values</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputValues()
	 * @generated
	 * @ordered
	 */
	protected UnaryTest outputValues;

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
	protected OutputClauseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DmnPackage.Literals.OUTPUT_CLAUSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiteralExpression getDefaultOutputEntry() {
		return defaultOutputEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefaultOutputEntry(LiteralExpression newDefaultOutputEntry, NotificationChain msgs) {
		LiteralExpression oldDefaultOutputEntry = defaultOutputEntry;
		defaultOutputEntry = newDefaultOutputEntry;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DmnPackage.OUTPUT_CLAUSE__DEFAULT_OUTPUT_ENTRY, oldDefaultOutputEntry, newDefaultOutputEntry);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultOutputEntry(LiteralExpression newDefaultOutputEntry) {
		if (newDefaultOutputEntry != defaultOutputEntry) {
			NotificationChain msgs = null;
			if (defaultOutputEntry != null)
				msgs = ((InternalEObject)defaultOutputEntry).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DmnPackage.OUTPUT_CLAUSE__DEFAULT_OUTPUT_ENTRY, null, msgs);
			if (newDefaultOutputEntry != null)
				msgs = ((InternalEObject)newDefaultOutputEntry).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DmnPackage.OUTPUT_CLAUSE__DEFAULT_OUTPUT_ENTRY, null, msgs);
			msgs = basicSetDefaultOutputEntry(newDefaultOutputEntry, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DmnPackage.OUTPUT_CLAUSE__DEFAULT_OUTPUT_ENTRY, newDefaultOutputEntry, newDefaultOutputEntry));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ItcmDcfinition getOutputDefinition() {
		if (outputDefinition != null && outputDefinition.eIsProxy()) {
			InternalEObject oldOutputDefinition = (InternalEObject)outputDefinition;
			outputDefinition = (ItcmDcfinition)eResolveProxy(oldOutputDefinition);
			if (outputDefinition != oldOutputDefinition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DmnPackage.OUTPUT_CLAUSE__OUTPUT_DEFINITION, oldOutputDefinition, outputDefinition));
			}
		}
		return outputDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ItcmDcfinition basicGetOutputDefinition() {
		return outputDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutputDefinition(ItcmDcfinition newOutputDefinition) {
		ItcmDcfinition oldOutputDefinition = outputDefinition;
		outputDefinition = newOutputDefinition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DmnPackage.OUTPUT_CLAUSE__OUTPUT_DEFINITION, oldOutputDefinition, outputDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnaryTest getOutputValues() {
		return outputValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOutputValues(UnaryTest newOutputValues, NotificationChain msgs) {
		UnaryTest oldOutputValues = outputValues;
		outputValues = newOutputValues;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DmnPackage.OUTPUT_CLAUSE__OUTPUT_VALUES, oldOutputValues, newOutputValues);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutputValues(UnaryTest newOutputValues) {
		if (newOutputValues != outputValues) {
			NotificationChain msgs = null;
			if (outputValues != null)
				msgs = ((InternalEObject)outputValues).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DmnPackage.OUTPUT_CLAUSE__OUTPUT_VALUES, null, msgs);
			if (newOutputValues != null)
				msgs = ((InternalEObject)newOutputValues).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DmnPackage.OUTPUT_CLAUSE__OUTPUT_VALUES, null, msgs);
			msgs = basicSetOutputValues(newOutputValues, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DmnPackage.OUTPUT_CLAUSE__OUTPUT_VALUES, newOutputValues, newOutputValues));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DmnPackage.OUTPUT_CLAUSE__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DmnPackage.OUTPUT_CLAUSE__TYPE_REF, oldTypeRef, typeRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DmnPackage.OUTPUT_CLAUSE__DEFAULT_OUTPUT_ENTRY:
				return basicSetDefaultOutputEntry(null, msgs);
			case DmnPackage.OUTPUT_CLAUSE__OUTPUT_VALUES:
				return basicSetOutputValues(null, msgs);
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
			case DmnPackage.OUTPUT_CLAUSE__DEFAULT_OUTPUT_ENTRY:
				return getDefaultOutputEntry();
			case DmnPackage.OUTPUT_CLAUSE__OUTPUT_DEFINITION:
				if (resolve) return getOutputDefinition();
				return basicGetOutputDefinition();
			case DmnPackage.OUTPUT_CLAUSE__OUTPUT_VALUES:
				return getOutputValues();
			case DmnPackage.OUTPUT_CLAUSE__NAME:
				return getName();
			case DmnPackage.OUTPUT_CLAUSE__TYPE_REF:
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
			case DmnPackage.OUTPUT_CLAUSE__DEFAULT_OUTPUT_ENTRY:
				setDefaultOutputEntry((LiteralExpression)newValue);
				return;
			case DmnPackage.OUTPUT_CLAUSE__OUTPUT_DEFINITION:
				setOutputDefinition((ItcmDcfinition)newValue);
				return;
			case DmnPackage.OUTPUT_CLAUSE__OUTPUT_VALUES:
				setOutputValues((UnaryTest)newValue);
				return;
			case DmnPackage.OUTPUT_CLAUSE__NAME:
				setName((String)newValue);
				return;
			case DmnPackage.OUTPUT_CLAUSE__TYPE_REF:
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
			case DmnPackage.OUTPUT_CLAUSE__DEFAULT_OUTPUT_ENTRY:
				setDefaultOutputEntry((LiteralExpression)null);
				return;
			case DmnPackage.OUTPUT_CLAUSE__OUTPUT_DEFINITION:
				setOutputDefinition((ItcmDcfinition)null);
				return;
			case DmnPackage.OUTPUT_CLAUSE__OUTPUT_VALUES:
				setOutputValues((UnaryTest)null);
				return;
			case DmnPackage.OUTPUT_CLAUSE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case DmnPackage.OUTPUT_CLAUSE__TYPE_REF:
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
			case DmnPackage.OUTPUT_CLAUSE__DEFAULT_OUTPUT_ENTRY:
				return defaultOutputEntry != null;
			case DmnPackage.OUTPUT_CLAUSE__OUTPUT_DEFINITION:
				return outputDefinition != null;
			case DmnPackage.OUTPUT_CLAUSE__OUTPUT_VALUES:
				return outputValues != null;
			case DmnPackage.OUTPUT_CLAUSE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DmnPackage.OUTPUT_CLAUSE__TYPE_REF:
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

} //OutputClauseImpl
