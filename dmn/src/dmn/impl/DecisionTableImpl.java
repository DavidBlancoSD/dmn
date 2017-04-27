/**
 */
package dmn.impl;

import dmn.BuiltinAggregator;
import dmn.DecisionRule;
import dmn.DecisionTable;
import dmn.DecisionTableOrientation;
import dmn.DmnPackage;
import dmn.HitPolicy;
import dmn.InputClause;
import dmn.OutputClause;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Decision Table</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dmn.impl.DecisionTableImpl#getInput <em>Input</em>}</li>
 *   <li>{@link dmn.impl.DecisionTableImpl#getDecisionTable <em>Decision Table</em>}</li>
 *   <li>{@link dmn.impl.DecisionTableImpl#getHitPolicy <em>Hit Policy</em>}</li>
 *   <li>{@link dmn.impl.DecisionTableImpl#getAggregation <em>Aggregation</em>}</li>
 *   <li>{@link dmn.impl.DecisionTableImpl#getPreferredOrientation <em>Preferred Orientation</em>}</li>
 *   <li>{@link dmn.impl.DecisionTableImpl#getOutputLabel <em>Output Label</em>}</li>
 *   <li>{@link dmn.impl.DecisionTableImpl#getOutput <em>Output</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DecisionTableImpl extends ExpressionImpl implements DecisionTable {
	/**
	 * The cached value of the '{@link #getInput() <em>Input</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput()
	 * @generated
	 * @ordered
	 */
	protected EList<InputClause> input;

	/**
	 * The cached value of the '{@link #getDecisionTable() <em>Decision Table</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecisionTable()
	 * @generated
	 * @ordered
	 */
	protected EList<DecisionRule> decisionTable;

	/**
	 * The default value of the '{@link #getHitPolicy() <em>Hit Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHitPolicy()
	 * @generated
	 * @ordered
	 */
	protected static final HitPolicy HIT_POLICY_EDEFAULT = HitPolicy.UNIQUE;

	/**
	 * The cached value of the '{@link #getHitPolicy() <em>Hit Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHitPolicy()
	 * @generated
	 * @ordered
	 */
	protected HitPolicy hitPolicy = HIT_POLICY_EDEFAULT;

	/**
	 * The default value of the '{@link #getAggregation() <em>Aggregation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAggregation()
	 * @generated
	 * @ordered
	 */
	protected static final BuiltinAggregator AGGREGATION_EDEFAULT = BuiltinAggregator.SUM;

	/**
	 * The cached value of the '{@link #getAggregation() <em>Aggregation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAggregation()
	 * @generated
	 * @ordered
	 */
	protected BuiltinAggregator aggregation = AGGREGATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getPreferredOrientation() <em>Preferred Orientation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreferredOrientation()
	 * @generated
	 * @ordered
	 */
	protected static final DecisionTableOrientation PREFERRED_ORIENTATION_EDEFAULT = DecisionTableOrientation.RULE_AS_ROW;

	/**
	 * The cached value of the '{@link #getPreferredOrientation() <em>Preferred Orientation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreferredOrientation()
	 * @generated
	 * @ordered
	 */
	protected DecisionTableOrientation preferredOrientation = PREFERRED_ORIENTATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getOutputLabel() <em>Output Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String OUTPUT_LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOutputLabel() <em>Output Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputLabel()
	 * @generated
	 * @ordered
	 */
	protected String outputLabel = OUTPUT_LABEL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOutput() <em>Output</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput()
	 * @generated
	 * @ordered
	 */
	protected EList<OutputClause> output;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DecisionTableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DmnPackage.Literals.DECISION_TABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InputClause> getInput() {
		if (input == null) {
			input = new EObjectContainmentEList<InputClause>(InputClause.class, this, DmnPackage.DECISION_TABLE__INPUT);
		}
		return input;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DecisionRule> getDecisionTable() {
		if (decisionTable == null) {
			decisionTable = new EObjectContainmentEList<DecisionRule>(DecisionRule.class, this, DmnPackage.DECISION_TABLE__DECISION_TABLE);
		}
		return decisionTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HitPolicy getHitPolicy() {
		return hitPolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHitPolicy(HitPolicy newHitPolicy) {
		HitPolicy oldHitPolicy = hitPolicy;
		hitPolicy = newHitPolicy == null ? HIT_POLICY_EDEFAULT : newHitPolicy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DmnPackage.DECISION_TABLE__HIT_POLICY, oldHitPolicy, hitPolicy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BuiltinAggregator getAggregation() {
		return aggregation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAggregation(BuiltinAggregator newAggregation) {
		BuiltinAggregator oldAggregation = aggregation;
		aggregation = newAggregation == null ? AGGREGATION_EDEFAULT : newAggregation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DmnPackage.DECISION_TABLE__AGGREGATION, oldAggregation, aggregation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecisionTableOrientation getPreferredOrientation() {
		return preferredOrientation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPreferredOrientation(DecisionTableOrientation newPreferredOrientation) {
		DecisionTableOrientation oldPreferredOrientation = preferredOrientation;
		preferredOrientation = newPreferredOrientation == null ? PREFERRED_ORIENTATION_EDEFAULT : newPreferredOrientation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DmnPackage.DECISION_TABLE__PREFERRED_ORIENTATION, oldPreferredOrientation, preferredOrientation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOutputLabel() {
		return outputLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutputLabel(String newOutputLabel) {
		String oldOutputLabel = outputLabel;
		outputLabel = newOutputLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DmnPackage.DECISION_TABLE__OUTPUT_LABEL, oldOutputLabel, outputLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OutputClause> getOutput() {
		if (output == null) {
			output = new EObjectContainmentEList<OutputClause>(OutputClause.class, this, DmnPackage.DECISION_TABLE__OUTPUT);
		}
		return output;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DmnPackage.DECISION_TABLE__INPUT:
				return ((InternalEList<?>)getInput()).basicRemove(otherEnd, msgs);
			case DmnPackage.DECISION_TABLE__DECISION_TABLE:
				return ((InternalEList<?>)getDecisionTable()).basicRemove(otherEnd, msgs);
			case DmnPackage.DECISION_TABLE__OUTPUT:
				return ((InternalEList<?>)getOutput()).basicRemove(otherEnd, msgs);
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
			case DmnPackage.DECISION_TABLE__INPUT:
				return getInput();
			case DmnPackage.DECISION_TABLE__DECISION_TABLE:
				return getDecisionTable();
			case DmnPackage.DECISION_TABLE__HIT_POLICY:
				return getHitPolicy();
			case DmnPackage.DECISION_TABLE__AGGREGATION:
				return getAggregation();
			case DmnPackage.DECISION_TABLE__PREFERRED_ORIENTATION:
				return getPreferredOrientation();
			case DmnPackage.DECISION_TABLE__OUTPUT_LABEL:
				return getOutputLabel();
			case DmnPackage.DECISION_TABLE__OUTPUT:
				return getOutput();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DmnPackage.DECISION_TABLE__INPUT:
				getInput().clear();
				getInput().addAll((Collection<? extends InputClause>)newValue);
				return;
			case DmnPackage.DECISION_TABLE__DECISION_TABLE:
				getDecisionTable().clear();
				getDecisionTable().addAll((Collection<? extends DecisionRule>)newValue);
				return;
			case DmnPackage.DECISION_TABLE__HIT_POLICY:
				setHitPolicy((HitPolicy)newValue);
				return;
			case DmnPackage.DECISION_TABLE__AGGREGATION:
				setAggregation((BuiltinAggregator)newValue);
				return;
			case DmnPackage.DECISION_TABLE__PREFERRED_ORIENTATION:
				setPreferredOrientation((DecisionTableOrientation)newValue);
				return;
			case DmnPackage.DECISION_TABLE__OUTPUT_LABEL:
				setOutputLabel((String)newValue);
				return;
			case DmnPackage.DECISION_TABLE__OUTPUT:
				getOutput().clear();
				getOutput().addAll((Collection<? extends OutputClause>)newValue);
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
			case DmnPackage.DECISION_TABLE__INPUT:
				getInput().clear();
				return;
			case DmnPackage.DECISION_TABLE__DECISION_TABLE:
				getDecisionTable().clear();
				return;
			case DmnPackage.DECISION_TABLE__HIT_POLICY:
				setHitPolicy(HIT_POLICY_EDEFAULT);
				return;
			case DmnPackage.DECISION_TABLE__AGGREGATION:
				setAggregation(AGGREGATION_EDEFAULT);
				return;
			case DmnPackage.DECISION_TABLE__PREFERRED_ORIENTATION:
				setPreferredOrientation(PREFERRED_ORIENTATION_EDEFAULT);
				return;
			case DmnPackage.DECISION_TABLE__OUTPUT_LABEL:
				setOutputLabel(OUTPUT_LABEL_EDEFAULT);
				return;
			case DmnPackage.DECISION_TABLE__OUTPUT:
				getOutput().clear();
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
			case DmnPackage.DECISION_TABLE__INPUT:
				return input != null && !input.isEmpty();
			case DmnPackage.DECISION_TABLE__DECISION_TABLE:
				return decisionTable != null && !decisionTable.isEmpty();
			case DmnPackage.DECISION_TABLE__HIT_POLICY:
				return hitPolicy != HIT_POLICY_EDEFAULT;
			case DmnPackage.DECISION_TABLE__AGGREGATION:
				return aggregation != AGGREGATION_EDEFAULT;
			case DmnPackage.DECISION_TABLE__PREFERRED_ORIENTATION:
				return preferredOrientation != PREFERRED_ORIENTATION_EDEFAULT;
			case DmnPackage.DECISION_TABLE__OUTPUT_LABEL:
				return OUTPUT_LABEL_EDEFAULT == null ? outputLabel != null : !OUTPUT_LABEL_EDEFAULT.equals(outputLabel);
			case DmnPackage.DECISION_TABLE__OUTPUT:
				return output != null && !output.isEmpty();
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
		result.append(" (hitPolicy: ");
		result.append(hitPolicy);
		result.append(", aggregation: ");
		result.append(aggregation);
		result.append(", preferredOrientation: ");
		result.append(preferredOrientation);
		result.append(", outputLabel: ");
		result.append(outputLabel);
		result.append(')');
		return result.toString();
	}

} //DecisionTableImpl
