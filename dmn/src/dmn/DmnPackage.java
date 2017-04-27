/**
 */
package dmn;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see dmn.DmnFactory
 * @model kind="package"
 * @generated
 */
public interface DmnPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "dmn";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/dmn";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "dmn";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DmnPackage eINSTANCE = dmn.impl.DmnPackageImpl.init();

	/**
	 * The meta object id for the '{@link dmn.impl.DMNElementImpl <em>DMN Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dmn.impl.DMNElementImpl
	 * @see dmn.impl.DmnPackageImpl#getDMNElement()
	 * @generated
	 */
	int DMN_ELEMENT = 0;

	/**
	 * The number of structural features of the '<em>DMN Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMN_ELEMENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>DMN Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMN_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dmn.impl.UnaryTestImpl <em>Unary Test</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dmn.impl.UnaryTestImpl
	 * @see dmn.impl.DmnPackageImpl#getUnaryTest()
	 * @generated
	 */
	int UNARY_TEST = 1;

	/**
	 * The number of structural features of the '<em>Unary Test</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_TEST_FEATURE_COUNT = DMN_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Unary Test</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_TEST_OPERATION_COUNT = DMN_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dmn.impl.DecisionRuleImpl <em>Decision Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dmn.impl.DecisionRuleImpl
	 * @see dmn.impl.DmnPackageImpl#getDecisionRule()
	 * @generated
	 */
	int DECISION_RULE = 2;

	/**
	 * The feature id for the '<em><b>Input Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_RULE__INPUT_ENTRY = DMN_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Output Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_RULE__OUTPUT_ENTRY = DMN_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Decision Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_RULE_FEATURE_COUNT = DMN_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Decision Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_RULE_OPERATION_COUNT = DMN_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dmn.impl.ExpressionImpl <em>Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dmn.impl.ExpressionImpl
	 * @see dmn.impl.DmnPackageImpl#getExpression()
	 * @generated
	 */
	int EXPRESSION = 5;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__VALUE = 0;

	/**
	 * The number of structural features of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dmn.impl.LiteralExpressionImpl <em>Literal Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dmn.impl.LiteralExpressionImpl
	 * @see dmn.impl.DmnPackageImpl#getLiteralExpression()
	 * @generated
	 */
	int LITERAL_EXPRESSION = 3;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_EXPRESSION__VALUE = EXPRESSION__VALUE;

	/**
	 * The number of structural features of the '<em>Literal Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Literal Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_EXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dmn.impl.InputClauseImpl <em>Input Clause</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dmn.impl.InputClauseImpl
	 * @see dmn.impl.DmnPackageImpl#getInputClause()
	 * @generated
	 */
	int INPUT_CLAUSE = 4;

	/**
	 * The feature id for the '<em><b>Input Values</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_CLAUSE__INPUT_VALUES = DMN_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Input Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_CLAUSE__INPUT_EXPRESSION = DMN_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_CLAUSE__NAME = DMN_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Type Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_CLAUSE__TYPE_REF = DMN_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Input Clause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_CLAUSE_FEATURE_COUNT = DMN_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Input Clause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_CLAUSE_OPERATION_COUNT = DMN_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dmn.impl.ItcmDcfinitionImpl <em>Itcm Dcfinition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dmn.impl.ItcmDcfinitionImpl
	 * @see dmn.impl.DmnPackageImpl#getItcmDcfinition()
	 * @generated
	 */
	int ITCM_DCFINITION = 6;

	/**
	 * The feature id for the '<em><b>Allowed Values</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITCM_DCFINITION__ALLOWED_VALUES = 0;

	/**
	 * The number of structural features of the '<em>Itcm Dcfinition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITCM_DCFINITION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Itcm Dcfinition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITCM_DCFINITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dmn.impl.DecisionTableImpl <em>Decision Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dmn.impl.DecisionTableImpl
	 * @see dmn.impl.DmnPackageImpl#getDecisionTable()
	 * @generated
	 */
	int DECISION_TABLE = 7;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_TABLE__VALUE = EXPRESSION__VALUE;

	/**
	 * The feature id for the '<em><b>Input</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_TABLE__INPUT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Decision Table</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_TABLE__DECISION_TABLE = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Hit Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_TABLE__HIT_POLICY = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Aggregation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_TABLE__AGGREGATION = EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Preferred Orientation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_TABLE__PREFERRED_ORIENTATION = EXPRESSION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Output Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_TABLE__OUTPUT_LABEL = EXPRESSION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Output</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_TABLE__OUTPUT = EXPRESSION_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Decision Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_TABLE_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Decision Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_TABLE_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dmn.impl.OutputClauseImpl <em>Output Clause</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dmn.impl.OutputClauseImpl
	 * @see dmn.impl.DmnPackageImpl#getOutputClause()
	 * @generated
	 */
	int OUTPUT_CLAUSE = 8;

	/**
	 * The feature id for the '<em><b>Default Output Entry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_CLAUSE__DEFAULT_OUTPUT_ENTRY = DMN_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Output Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_CLAUSE__OUTPUT_DEFINITION = DMN_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Output Values</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_CLAUSE__OUTPUT_VALUES = DMN_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_CLAUSE__NAME = DMN_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Type Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_CLAUSE__TYPE_REF = DMN_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Output Clause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_CLAUSE_FEATURE_COUNT = DMN_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Output Clause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_CLAUSE_OPERATION_COUNT = DMN_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dmn.BuiltinAggregator <em>Builtin Aggregator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dmn.BuiltinAggregator
	 * @see dmn.impl.DmnPackageImpl#getBuiltinAggregator()
	 * @generated
	 */
	int BUILTIN_AGGREGATOR = 9;

	/**
	 * The meta object id for the '{@link dmn.HitPolicy <em>Hit Policy</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dmn.HitPolicy
	 * @see dmn.impl.DmnPackageImpl#getHitPolicy()
	 * @generated
	 */
	int HIT_POLICY = 10;

	/**
	 * The meta object id for the '{@link dmn.DecisionTableOrientation <em>Decision Table Orientation</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dmn.DecisionTableOrientation
	 * @see dmn.impl.DmnPackageImpl#getDecisionTableOrientation()
	 * @generated
	 */
	int DECISION_TABLE_ORIENTATION = 11;


	/**
	 * Returns the meta object for class '{@link dmn.DMNElement <em>DMN Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DMN Element</em>'.
	 * @see dmn.DMNElement
	 * @generated
	 */
	EClass getDMNElement();

	/**
	 * Returns the meta object for class '{@link dmn.UnaryTest <em>Unary Test</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unary Test</em>'.
	 * @see dmn.UnaryTest
	 * @generated
	 */
	EClass getUnaryTest();

	/**
	 * Returns the meta object for class '{@link dmn.DecisionRule <em>Decision Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Decision Rule</em>'.
	 * @see dmn.DecisionRule
	 * @generated
	 */
	EClass getDecisionRule();

	/**
	 * Returns the meta object for the containment reference list '{@link dmn.DecisionRule#getInputEntry <em>Input Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Input Entry</em>'.
	 * @see dmn.DecisionRule#getInputEntry()
	 * @see #getDecisionRule()
	 * @generated
	 */
	EReference getDecisionRule_InputEntry();

	/**
	 * Returns the meta object for the containment reference list '{@link dmn.DecisionRule#getOutputEntry <em>Output Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Output Entry</em>'.
	 * @see dmn.DecisionRule#getOutputEntry()
	 * @see #getDecisionRule()
	 * @generated
	 */
	EReference getDecisionRule_OutputEntry();

	/**
	 * Returns the meta object for class '{@link dmn.LiteralExpression <em>Literal Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Literal Expression</em>'.
	 * @see dmn.LiteralExpression
	 * @generated
	 */
	EClass getLiteralExpression();

	/**
	 * Returns the meta object for class '{@link dmn.InputClause <em>Input Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Clause</em>'.
	 * @see dmn.InputClause
	 * @generated
	 */
	EClass getInputClause();

	/**
	 * Returns the meta object for the containment reference '{@link dmn.InputClause#getInputValues <em>Input Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Input Values</em>'.
	 * @see dmn.InputClause#getInputValues()
	 * @see #getInputClause()
	 * @generated
	 */
	EReference getInputClause_InputValues();

	/**
	 * Returns the meta object for the containment reference '{@link dmn.InputClause#getInputExpression <em>Input Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Input Expression</em>'.
	 * @see dmn.InputClause#getInputExpression()
	 * @see #getInputClause()
	 * @generated
	 */
	EReference getInputClause_InputExpression();

	/**
	 * Returns the meta object for the attribute '{@link dmn.InputClause#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see dmn.InputClause#getName()
	 * @see #getInputClause()
	 * @generated
	 */
	EAttribute getInputClause_Name();

	/**
	 * Returns the meta object for the attribute '{@link dmn.InputClause#getTypeRef <em>Type Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Ref</em>'.
	 * @see dmn.InputClause#getTypeRef()
	 * @see #getInputClause()
	 * @generated
	 */
	EAttribute getInputClause_TypeRef();

	/**
	 * Returns the meta object for class '{@link dmn.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression</em>'.
	 * @see dmn.Expression
	 * @generated
	 */
	EClass getExpression();

	/**
	 * Returns the meta object for the reference list '{@link dmn.Expression#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Value</em>'.
	 * @see dmn.Expression#getValue()
	 * @see #getExpression()
	 * @generated
	 */
	EReference getExpression_Value();

	/**
	 * Returns the meta object for class '{@link dmn.ItcmDcfinition <em>Itcm Dcfinition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Itcm Dcfinition</em>'.
	 * @see dmn.ItcmDcfinition
	 * @generated
	 */
	EClass getItcmDcfinition();

	/**
	 * Returns the meta object for the containment reference '{@link dmn.ItcmDcfinition#getAllowedValues <em>Allowed Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Allowed Values</em>'.
	 * @see dmn.ItcmDcfinition#getAllowedValues()
	 * @see #getItcmDcfinition()
	 * @generated
	 */
	EReference getItcmDcfinition_AllowedValues();

	/**
	 * Returns the meta object for class '{@link dmn.DecisionTable <em>Decision Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Decision Table</em>'.
	 * @see dmn.DecisionTable
	 * @generated
	 */
	EClass getDecisionTable();

	/**
	 * Returns the meta object for the containment reference list '{@link dmn.DecisionTable#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Input</em>'.
	 * @see dmn.DecisionTable#getInput()
	 * @see #getDecisionTable()
	 * @generated
	 */
	EReference getDecisionTable_Input();

	/**
	 * Returns the meta object for the containment reference list '{@link dmn.DecisionTable#getDecisionTable <em>Decision Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Decision Table</em>'.
	 * @see dmn.DecisionTable#getDecisionTable()
	 * @see #getDecisionTable()
	 * @generated
	 */
	EReference getDecisionTable_DecisionTable();

	/**
	 * Returns the meta object for the attribute '{@link dmn.DecisionTable#getHitPolicy <em>Hit Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hit Policy</em>'.
	 * @see dmn.DecisionTable#getHitPolicy()
	 * @see #getDecisionTable()
	 * @generated
	 */
	EAttribute getDecisionTable_HitPolicy();

	/**
	 * Returns the meta object for the attribute '{@link dmn.DecisionTable#getAggregation <em>Aggregation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Aggregation</em>'.
	 * @see dmn.DecisionTable#getAggregation()
	 * @see #getDecisionTable()
	 * @generated
	 */
	EAttribute getDecisionTable_Aggregation();

	/**
	 * Returns the meta object for the attribute '{@link dmn.DecisionTable#getPreferredOrientation <em>Preferred Orientation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Preferred Orientation</em>'.
	 * @see dmn.DecisionTable#getPreferredOrientation()
	 * @see #getDecisionTable()
	 * @generated
	 */
	EAttribute getDecisionTable_PreferredOrientation();

	/**
	 * Returns the meta object for the attribute '{@link dmn.DecisionTable#getOutputLabel <em>Output Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Output Label</em>'.
	 * @see dmn.DecisionTable#getOutputLabel()
	 * @see #getDecisionTable()
	 * @generated
	 */
	EAttribute getDecisionTable_OutputLabel();

	/**
	 * Returns the meta object for the containment reference list '{@link dmn.DecisionTable#getOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Output</em>'.
	 * @see dmn.DecisionTable#getOutput()
	 * @see #getDecisionTable()
	 * @generated
	 */
	EReference getDecisionTable_Output();

	/**
	 * Returns the meta object for class '{@link dmn.OutputClause <em>Output Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output Clause</em>'.
	 * @see dmn.OutputClause
	 * @generated
	 */
	EClass getOutputClause();

	/**
	 * Returns the meta object for the containment reference '{@link dmn.OutputClause#getDefaultOutputEntry <em>Default Output Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Default Output Entry</em>'.
	 * @see dmn.OutputClause#getDefaultOutputEntry()
	 * @see #getOutputClause()
	 * @generated
	 */
	EReference getOutputClause_DefaultOutputEntry();

	/**
	 * Returns the meta object for the reference '{@link dmn.OutputClause#getOutputDefinition <em>Output Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output Definition</em>'.
	 * @see dmn.OutputClause#getOutputDefinition()
	 * @see #getOutputClause()
	 * @generated
	 */
	EReference getOutputClause_OutputDefinition();

	/**
	 * Returns the meta object for the containment reference '{@link dmn.OutputClause#getOutputValues <em>Output Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Output Values</em>'.
	 * @see dmn.OutputClause#getOutputValues()
	 * @see #getOutputClause()
	 * @generated
	 */
	EReference getOutputClause_OutputValues();

	/**
	 * Returns the meta object for the attribute '{@link dmn.OutputClause#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see dmn.OutputClause#getName()
	 * @see #getOutputClause()
	 * @generated
	 */
	EAttribute getOutputClause_Name();

	/**
	 * Returns the meta object for the attribute '{@link dmn.OutputClause#getTypeRef <em>Type Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Ref</em>'.
	 * @see dmn.OutputClause#getTypeRef()
	 * @see #getOutputClause()
	 * @generated
	 */
	EAttribute getOutputClause_TypeRef();

	/**
	 * Returns the meta object for enum '{@link dmn.BuiltinAggregator <em>Builtin Aggregator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Builtin Aggregator</em>'.
	 * @see dmn.BuiltinAggregator
	 * @generated
	 */
	EEnum getBuiltinAggregator();

	/**
	 * Returns the meta object for enum '{@link dmn.HitPolicy <em>Hit Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Hit Policy</em>'.
	 * @see dmn.HitPolicy
	 * @generated
	 */
	EEnum getHitPolicy();

	/**
	 * Returns the meta object for enum '{@link dmn.DecisionTableOrientation <em>Decision Table Orientation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Decision Table Orientation</em>'.
	 * @see dmn.DecisionTableOrientation
	 * @generated
	 */
	EEnum getDecisionTableOrientation();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DmnFactory getDmnFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link dmn.impl.DMNElementImpl <em>DMN Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dmn.impl.DMNElementImpl
		 * @see dmn.impl.DmnPackageImpl#getDMNElement()
		 * @generated
		 */
		EClass DMN_ELEMENT = eINSTANCE.getDMNElement();

		/**
		 * The meta object literal for the '{@link dmn.impl.UnaryTestImpl <em>Unary Test</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dmn.impl.UnaryTestImpl
		 * @see dmn.impl.DmnPackageImpl#getUnaryTest()
		 * @generated
		 */
		EClass UNARY_TEST = eINSTANCE.getUnaryTest();

		/**
		 * The meta object literal for the '{@link dmn.impl.DecisionRuleImpl <em>Decision Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dmn.impl.DecisionRuleImpl
		 * @see dmn.impl.DmnPackageImpl#getDecisionRule()
		 * @generated
		 */
		EClass DECISION_RULE = eINSTANCE.getDecisionRule();

		/**
		 * The meta object literal for the '<em><b>Input Entry</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECISION_RULE__INPUT_ENTRY = eINSTANCE.getDecisionRule_InputEntry();

		/**
		 * The meta object literal for the '<em><b>Output Entry</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECISION_RULE__OUTPUT_ENTRY = eINSTANCE.getDecisionRule_OutputEntry();

		/**
		 * The meta object literal for the '{@link dmn.impl.LiteralExpressionImpl <em>Literal Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dmn.impl.LiteralExpressionImpl
		 * @see dmn.impl.DmnPackageImpl#getLiteralExpression()
		 * @generated
		 */
		EClass LITERAL_EXPRESSION = eINSTANCE.getLiteralExpression();

		/**
		 * The meta object literal for the '{@link dmn.impl.InputClauseImpl <em>Input Clause</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dmn.impl.InputClauseImpl
		 * @see dmn.impl.DmnPackageImpl#getInputClause()
		 * @generated
		 */
		EClass INPUT_CLAUSE = eINSTANCE.getInputClause();

		/**
		 * The meta object literal for the '<em><b>Input Values</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT_CLAUSE__INPUT_VALUES = eINSTANCE.getInputClause_InputValues();

		/**
		 * The meta object literal for the '<em><b>Input Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT_CLAUSE__INPUT_EXPRESSION = eINSTANCE.getInputClause_InputExpression();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT_CLAUSE__NAME = eINSTANCE.getInputClause_Name();

		/**
		 * The meta object literal for the '<em><b>Type Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT_CLAUSE__TYPE_REF = eINSTANCE.getInputClause_TypeRef();

		/**
		 * The meta object literal for the '{@link dmn.impl.ExpressionImpl <em>Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dmn.impl.ExpressionImpl
		 * @see dmn.impl.DmnPackageImpl#getExpression()
		 * @generated
		 */
		EClass EXPRESSION = eINSTANCE.getExpression();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION__VALUE = eINSTANCE.getExpression_Value();

		/**
		 * The meta object literal for the '{@link dmn.impl.ItcmDcfinitionImpl <em>Itcm Dcfinition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dmn.impl.ItcmDcfinitionImpl
		 * @see dmn.impl.DmnPackageImpl#getItcmDcfinition()
		 * @generated
		 */
		EClass ITCM_DCFINITION = eINSTANCE.getItcmDcfinition();

		/**
		 * The meta object literal for the '<em><b>Allowed Values</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITCM_DCFINITION__ALLOWED_VALUES = eINSTANCE.getItcmDcfinition_AllowedValues();

		/**
		 * The meta object literal for the '{@link dmn.impl.DecisionTableImpl <em>Decision Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dmn.impl.DecisionTableImpl
		 * @see dmn.impl.DmnPackageImpl#getDecisionTable()
		 * @generated
		 */
		EClass DECISION_TABLE = eINSTANCE.getDecisionTable();

		/**
		 * The meta object literal for the '<em><b>Input</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECISION_TABLE__INPUT = eINSTANCE.getDecisionTable_Input();

		/**
		 * The meta object literal for the '<em><b>Decision Table</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECISION_TABLE__DECISION_TABLE = eINSTANCE.getDecisionTable_DecisionTable();

		/**
		 * The meta object literal for the '<em><b>Hit Policy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DECISION_TABLE__HIT_POLICY = eINSTANCE.getDecisionTable_HitPolicy();

		/**
		 * The meta object literal for the '<em><b>Aggregation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DECISION_TABLE__AGGREGATION = eINSTANCE.getDecisionTable_Aggregation();

		/**
		 * The meta object literal for the '<em><b>Preferred Orientation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DECISION_TABLE__PREFERRED_ORIENTATION = eINSTANCE.getDecisionTable_PreferredOrientation();

		/**
		 * The meta object literal for the '<em><b>Output Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DECISION_TABLE__OUTPUT_LABEL = eINSTANCE.getDecisionTable_OutputLabel();

		/**
		 * The meta object literal for the '<em><b>Output</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECISION_TABLE__OUTPUT = eINSTANCE.getDecisionTable_Output();

		/**
		 * The meta object literal for the '{@link dmn.impl.OutputClauseImpl <em>Output Clause</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dmn.impl.OutputClauseImpl
		 * @see dmn.impl.DmnPackageImpl#getOutputClause()
		 * @generated
		 */
		EClass OUTPUT_CLAUSE = eINSTANCE.getOutputClause();

		/**
		 * The meta object literal for the '<em><b>Default Output Entry</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTPUT_CLAUSE__DEFAULT_OUTPUT_ENTRY = eINSTANCE.getOutputClause_DefaultOutputEntry();

		/**
		 * The meta object literal for the '<em><b>Output Definition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTPUT_CLAUSE__OUTPUT_DEFINITION = eINSTANCE.getOutputClause_OutputDefinition();

		/**
		 * The meta object literal for the '<em><b>Output Values</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTPUT_CLAUSE__OUTPUT_VALUES = eINSTANCE.getOutputClause_OutputValues();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTPUT_CLAUSE__NAME = eINSTANCE.getOutputClause_Name();

		/**
		 * The meta object literal for the '<em><b>Type Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTPUT_CLAUSE__TYPE_REF = eINSTANCE.getOutputClause_TypeRef();

		/**
		 * The meta object literal for the '{@link dmn.BuiltinAggregator <em>Builtin Aggregator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dmn.BuiltinAggregator
		 * @see dmn.impl.DmnPackageImpl#getBuiltinAggregator()
		 * @generated
		 */
		EEnum BUILTIN_AGGREGATOR = eINSTANCE.getBuiltinAggregator();

		/**
		 * The meta object literal for the '{@link dmn.HitPolicy <em>Hit Policy</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dmn.HitPolicy
		 * @see dmn.impl.DmnPackageImpl#getHitPolicy()
		 * @generated
		 */
		EEnum HIT_POLICY = eINSTANCE.getHitPolicy();

		/**
		 * The meta object literal for the '{@link dmn.DecisionTableOrientation <em>Decision Table Orientation</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dmn.DecisionTableOrientation
		 * @see dmn.impl.DmnPackageImpl#getDecisionTableOrientation()
		 * @generated
		 */
		EEnum DECISION_TABLE_ORIENTATION = eINSTANCE.getDecisionTableOrientation();

	}

} //DmnPackage
