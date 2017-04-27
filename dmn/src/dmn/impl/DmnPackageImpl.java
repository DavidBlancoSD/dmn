/**
 */
package dmn.impl;

import dmn.BuiltinAggregator;
import dmn.DMNElement;
import dmn.DecisionRule;
import dmn.DecisionTable;
import dmn.DecisionTableOrientation;
import dmn.DmnFactory;
import dmn.DmnPackage;
import dmn.Expression;
import dmn.HitPolicy;
import dmn.InputClause;
import dmn.ItcmDcfinition;
import dmn.LiteralExpression;
import dmn.OutputClause;
import dmn.UnaryTest;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DmnPackageImpl extends EPackageImpl implements DmnPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dmnElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unaryTestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass decisionRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass literalExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputClauseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass itcmDcfinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass decisionTableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outputClauseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum builtinAggregatorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum hitPolicyEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum decisionTableOrientationEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see dmn.DmnPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DmnPackageImpl() {
		super(eNS_URI, DmnFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link DmnPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DmnPackage init() {
		if (isInited) return (DmnPackage)EPackage.Registry.INSTANCE.getEPackage(DmnPackage.eNS_URI);

		// Obtain or create and register package
		DmnPackageImpl theDmnPackage = (DmnPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DmnPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DmnPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theDmnPackage.createPackageContents();

		// Initialize created meta-data
		theDmnPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDmnPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DmnPackage.eNS_URI, theDmnPackage);
		return theDmnPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDMNElement() {
		return dmnElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnaryTest() {
		return unaryTestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDecisionRule() {
		return decisionRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDecisionRule_InputEntry() {
		return (EReference)decisionRuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDecisionRule_OutputEntry() {
		return (EReference)decisionRuleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLiteralExpression() {
		return literalExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInputClause() {
		return inputClauseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInputClause_InputValues() {
		return (EReference)inputClauseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInputClause_InputExpression() {
		return (EReference)inputClauseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInputClause_Name() {
		return (EAttribute)inputClauseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInputClause_TypeRef() {
		return (EAttribute)inputClauseEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpression() {
		return expressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpression_Value() {
		return (EReference)expressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getItcmDcfinition() {
		return itcmDcfinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getItcmDcfinition_AllowedValues() {
		return (EReference)itcmDcfinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDecisionTable() {
		return decisionTableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDecisionTable_Input() {
		return (EReference)decisionTableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDecisionTable_DecisionTable() {
		return (EReference)decisionTableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDecisionTable_HitPolicy() {
		return (EAttribute)decisionTableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDecisionTable_Aggregation() {
		return (EAttribute)decisionTableEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDecisionTable_PreferredOrientation() {
		return (EAttribute)decisionTableEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDecisionTable_OutputLabel() {
		return (EAttribute)decisionTableEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDecisionTable_Output() {
		return (EReference)decisionTableEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOutputClause() {
		return outputClauseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOutputClause_DefaultOutputEntry() {
		return (EReference)outputClauseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOutputClause_OutputDefinition() {
		return (EReference)outputClauseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOutputClause_OutputValues() {
		return (EReference)outputClauseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutputClause_Name() {
		return (EAttribute)outputClauseEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutputClause_TypeRef() {
		return (EAttribute)outputClauseEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getBuiltinAggregator() {
		return builtinAggregatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getHitPolicy() {
		return hitPolicyEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDecisionTableOrientation() {
		return decisionTableOrientationEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DmnFactory getDmnFactory() {
		return (DmnFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		dmnElementEClass = createEClass(DMN_ELEMENT);

		unaryTestEClass = createEClass(UNARY_TEST);

		decisionRuleEClass = createEClass(DECISION_RULE);
		createEReference(decisionRuleEClass, DECISION_RULE__INPUT_ENTRY);
		createEReference(decisionRuleEClass, DECISION_RULE__OUTPUT_ENTRY);

		literalExpressionEClass = createEClass(LITERAL_EXPRESSION);

		inputClauseEClass = createEClass(INPUT_CLAUSE);
		createEReference(inputClauseEClass, INPUT_CLAUSE__INPUT_VALUES);
		createEReference(inputClauseEClass, INPUT_CLAUSE__INPUT_EXPRESSION);
		createEAttribute(inputClauseEClass, INPUT_CLAUSE__NAME);
		createEAttribute(inputClauseEClass, INPUT_CLAUSE__TYPE_REF);

		expressionEClass = createEClass(EXPRESSION);
		createEReference(expressionEClass, EXPRESSION__VALUE);

		itcmDcfinitionEClass = createEClass(ITCM_DCFINITION);
		createEReference(itcmDcfinitionEClass, ITCM_DCFINITION__ALLOWED_VALUES);

		decisionTableEClass = createEClass(DECISION_TABLE);
		createEReference(decisionTableEClass, DECISION_TABLE__INPUT);
		createEReference(decisionTableEClass, DECISION_TABLE__DECISION_TABLE);
		createEAttribute(decisionTableEClass, DECISION_TABLE__HIT_POLICY);
		createEAttribute(decisionTableEClass, DECISION_TABLE__AGGREGATION);
		createEAttribute(decisionTableEClass, DECISION_TABLE__PREFERRED_ORIENTATION);
		createEAttribute(decisionTableEClass, DECISION_TABLE__OUTPUT_LABEL);
		createEReference(decisionTableEClass, DECISION_TABLE__OUTPUT);

		outputClauseEClass = createEClass(OUTPUT_CLAUSE);
		createEReference(outputClauseEClass, OUTPUT_CLAUSE__DEFAULT_OUTPUT_ENTRY);
		createEReference(outputClauseEClass, OUTPUT_CLAUSE__OUTPUT_DEFINITION);
		createEReference(outputClauseEClass, OUTPUT_CLAUSE__OUTPUT_VALUES);
		createEAttribute(outputClauseEClass, OUTPUT_CLAUSE__NAME);
		createEAttribute(outputClauseEClass, OUTPUT_CLAUSE__TYPE_REF);

		// Create enums
		builtinAggregatorEEnum = createEEnum(BUILTIN_AGGREGATOR);
		hitPolicyEEnum = createEEnum(HIT_POLICY);
		decisionTableOrientationEEnum = createEEnum(DECISION_TABLE_ORIENTATION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		unaryTestEClass.getESuperTypes().add(this.getDMNElement());
		decisionRuleEClass.getESuperTypes().add(this.getDMNElement());
		literalExpressionEClass.getESuperTypes().add(this.getExpression());
		inputClauseEClass.getESuperTypes().add(this.getDMNElement());
		decisionTableEClass.getESuperTypes().add(this.getExpression());
		outputClauseEClass.getESuperTypes().add(this.getDMNElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(dmnElementEClass, DMNElement.class, "DMNElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(unaryTestEClass, UnaryTest.class, "UnaryTest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(decisionRuleEClass, DecisionRule.class, "DecisionRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDecisionRule_InputEntry(), this.getUnaryTest(), null, "inputEntry", null, 0, -1, DecisionRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDecisionRule_OutputEntry(), this.getLiteralExpression(), null, "OutputEntry", null, 1, -1, DecisionRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(literalExpressionEClass, LiteralExpression.class, "LiteralExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(inputClauseEClass, InputClause.class, "InputClause", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInputClause_InputValues(), this.getUnaryTest(), null, "InputValues", null, 0, 1, InputClause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInputClause_InputExpression(), this.getLiteralExpression(), null, "InputExpression", null, 0, 1, InputClause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInputClause_Name(), ecorePackage.getEString(), "name", null, 0, 1, InputClause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInputClause_TypeRef(), theXMLTypePackage.getQName(), "typeRef", null, 0, 1, InputClause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(expressionEClass, Expression.class, "Expression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExpression_Value(), this.getItcmDcfinition(), null, "value", null, 1, -1, Expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(itcmDcfinitionEClass, ItcmDcfinition.class, "ItcmDcfinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getItcmDcfinition_AllowedValues(), this.getUnaryTest(), null, "allowedValues", null, 0, 1, ItcmDcfinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(decisionTableEClass, DecisionTable.class, "DecisionTable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDecisionTable_Input(), this.getInputClause(), null, "input", null, 0, -1, DecisionTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDecisionTable_DecisionTable(), this.getDecisionRule(), null, "decisionTable", null, 0, -1, DecisionTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDecisionTable_HitPolicy(), this.getHitPolicy(), "hitPolicy", null, 0, 1, DecisionTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDecisionTable_Aggregation(), this.getBuiltinAggregator(), "aggregation", null, 0, 1, DecisionTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDecisionTable_PreferredOrientation(), this.getDecisionTableOrientation(), "preferredOrientation", null, 0, 1, DecisionTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDecisionTable_OutputLabel(), ecorePackage.getEString(), "outputLabel", null, 0, 1, DecisionTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDecisionTable_Output(), this.getOutputClause(), null, "output", null, 1, -1, DecisionTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(outputClauseEClass, OutputClause.class, "OutputClause", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOutputClause_DefaultOutputEntry(), this.getLiteralExpression(), null, "defaultOutputEntry", null, 0, 1, OutputClause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOutputClause_OutputDefinition(), this.getItcmDcfinition(), null, "outputDefinition", null, 0, 1, OutputClause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOutputClause_OutputValues(), this.getUnaryTest(), null, "outputValues", null, 0, 1, OutputClause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOutputClause_Name(), ecorePackage.getEString(), "name", null, 0, 1, OutputClause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOutputClause_TypeRef(), theXMLTypePackage.getQName(), "typeRef", null, 0, 1, OutputClause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(builtinAggregatorEEnum, BuiltinAggregator.class, "BuiltinAggregator");
		addEEnumLiteral(builtinAggregatorEEnum, BuiltinAggregator.SUM);
		addEEnumLiteral(builtinAggregatorEEnum, BuiltinAggregator.COUNT);
		addEEnumLiteral(builtinAggregatorEEnum, BuiltinAggregator.MIN);
		addEEnumLiteral(builtinAggregatorEEnum, BuiltinAggregator.MAX);

		initEEnum(hitPolicyEEnum, HitPolicy.class, "HitPolicy");
		addEEnumLiteral(hitPolicyEEnum, HitPolicy.UNIQUE);
		addEEnumLiteral(hitPolicyEEnum, HitPolicy.FIRST);
		addEEnumLiteral(hitPolicyEEnum, HitPolicy.PRIORITY);
		addEEnumLiteral(hitPolicyEEnum, HitPolicy.ANY);
		addEEnumLiteral(hitPolicyEEnum, HitPolicy.COLLECT);
		addEEnumLiteral(hitPolicyEEnum, HitPolicy.RULEORDER);
		addEEnumLiteral(hitPolicyEEnum, HitPolicy.OUTPUTORDER);

		initEEnum(decisionTableOrientationEEnum, DecisionTableOrientation.class, "DecisionTableOrientation");
		addEEnumLiteral(decisionTableOrientationEEnum, DecisionTableOrientation.RULE_AS_ROW);
		addEEnumLiteral(decisionTableOrientationEEnum, DecisionTableOrientation.RULE_AS_COLUMN);
		addEEnumLiteral(decisionTableOrientationEEnum, DecisionTableOrientation.CROSS_TABLE);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";	
		addAnnotation
		  (getExpression_Value(), 
		   source, 
		   new String[] {
			 "wildcards", "",
			 "name", ""
		   });
	}

} //DmnPackageImpl
