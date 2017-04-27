/**
 */
package dmn.impl;

import dmn.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DmnFactoryImpl extends EFactoryImpl implements DmnFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DmnFactory init() {
		try {
			DmnFactory theDmnFactory = (DmnFactory)EPackage.Registry.INSTANCE.getEFactory(DmnPackage.eNS_URI);
			if (theDmnFactory != null) {
				return theDmnFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DmnFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DmnFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case DmnPackage.UNARY_TEST: return createUnaryTest();
			case DmnPackage.DECISION_RULE: return createDecisionRule();
			case DmnPackage.LITERAL_EXPRESSION: return createLiteralExpression();
			case DmnPackage.INPUT_CLAUSE: return createInputClause();
			case DmnPackage.ITCM_DCFINITION: return createItcmDcfinition();
			case DmnPackage.DECISION_TABLE: return createDecisionTable();
			case DmnPackage.OUTPUT_CLAUSE: return createOutputClause();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case DmnPackage.BUILTIN_AGGREGATOR:
				return createBuiltinAggregatorFromString(eDataType, initialValue);
			case DmnPackage.HIT_POLICY:
				return createHitPolicyFromString(eDataType, initialValue);
			case DmnPackage.DECISION_TABLE_ORIENTATION:
				return createDecisionTableOrientationFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case DmnPackage.BUILTIN_AGGREGATOR:
				return convertBuiltinAggregatorToString(eDataType, instanceValue);
			case DmnPackage.HIT_POLICY:
				return convertHitPolicyToString(eDataType, instanceValue);
			case DmnPackage.DECISION_TABLE_ORIENTATION:
				return convertDecisionTableOrientationToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnaryTest createUnaryTest() {
		UnaryTestImpl unaryTest = new UnaryTestImpl();
		return unaryTest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecisionRule createDecisionRule() {
		DecisionRuleImpl decisionRule = new DecisionRuleImpl();
		return decisionRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiteralExpression createLiteralExpression() {
		LiteralExpressionImpl literalExpression = new LiteralExpressionImpl();
		return literalExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputClause createInputClause() {
		InputClauseImpl inputClause = new InputClauseImpl();
		return inputClause;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ItcmDcfinition createItcmDcfinition() {
		ItcmDcfinitionImpl itcmDcfinition = new ItcmDcfinitionImpl();
		return itcmDcfinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecisionTable createDecisionTable() {
		DecisionTableImpl decisionTable = new DecisionTableImpl();
		return decisionTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputClause createOutputClause() {
		OutputClauseImpl outputClause = new OutputClauseImpl();
		return outputClause;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BuiltinAggregator createBuiltinAggregatorFromString(EDataType eDataType, String initialValue) {
		BuiltinAggregator result = BuiltinAggregator.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBuiltinAggregatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HitPolicy createHitPolicyFromString(EDataType eDataType, String initialValue) {
		HitPolicy result = HitPolicy.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertHitPolicyToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecisionTableOrientation createDecisionTableOrientationFromString(EDataType eDataType, String initialValue) {
		DecisionTableOrientation result = DecisionTableOrientation.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDecisionTableOrientationToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DmnPackage getDmnPackage() {
		return (DmnPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DmnPackage getPackage() {
		return DmnPackage.eINSTANCE;
	}

} //DmnFactoryImpl
