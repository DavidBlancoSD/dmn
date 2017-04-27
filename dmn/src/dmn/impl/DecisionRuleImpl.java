/**
 */
package dmn.impl;

import dmn.DecisionRule;
import dmn.DmnPackage;
import dmn.LiteralExpression;
import dmn.UnaryTest;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Decision Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dmn.impl.DecisionRuleImpl#getInputEntry <em>Input Entry</em>}</li>
 *   <li>{@link dmn.impl.DecisionRuleImpl#getOutputEntry <em>Output Entry</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DecisionRuleImpl extends DMNElementImpl implements DecisionRule {
	/**
	 * The cached value of the '{@link #getInputEntry() <em>Input Entry</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputEntry()
	 * @generated
	 * @ordered
	 */
	protected EList<UnaryTest> inputEntry;

	/**
	 * The cached value of the '{@link #getOutputEntry() <em>Output Entry</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputEntry()
	 * @generated
	 * @ordered
	 */
	protected EList<LiteralExpression> outputEntry;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DecisionRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DmnPackage.Literals.DECISION_RULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UnaryTest> getInputEntry() {
		if (inputEntry == null) {
			inputEntry = new EObjectContainmentEList<UnaryTest>(UnaryTest.class, this, DmnPackage.DECISION_RULE__INPUT_ENTRY);
		}
		return inputEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LiteralExpression> getOutputEntry() {
		if (outputEntry == null) {
			outputEntry = new EObjectContainmentEList<LiteralExpression>(LiteralExpression.class, this, DmnPackage.DECISION_RULE__OUTPUT_ENTRY);
		}
		return outputEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DmnPackage.DECISION_RULE__INPUT_ENTRY:
				return ((InternalEList<?>)getInputEntry()).basicRemove(otherEnd, msgs);
			case DmnPackage.DECISION_RULE__OUTPUT_ENTRY:
				return ((InternalEList<?>)getOutputEntry()).basicRemove(otherEnd, msgs);
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
			case DmnPackage.DECISION_RULE__INPUT_ENTRY:
				return getInputEntry();
			case DmnPackage.DECISION_RULE__OUTPUT_ENTRY:
				return getOutputEntry();
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
			case DmnPackage.DECISION_RULE__INPUT_ENTRY:
				getInputEntry().clear();
				getInputEntry().addAll((Collection<? extends UnaryTest>)newValue);
				return;
			case DmnPackage.DECISION_RULE__OUTPUT_ENTRY:
				getOutputEntry().clear();
				getOutputEntry().addAll((Collection<? extends LiteralExpression>)newValue);
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
			case DmnPackage.DECISION_RULE__INPUT_ENTRY:
				getInputEntry().clear();
				return;
			case DmnPackage.DECISION_RULE__OUTPUT_ENTRY:
				getOutputEntry().clear();
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
			case DmnPackage.DECISION_RULE__INPUT_ENTRY:
				return inputEntry != null && !inputEntry.isEmpty();
			case DmnPackage.DECISION_RULE__OUTPUT_ENTRY:
				return outputEntry != null && !outputEntry.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DecisionRuleImpl
