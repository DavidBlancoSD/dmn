/**
 */
package dmn;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Decision Table Orientation</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see dmn.DmnPackage#getDecisionTableOrientation()
 * @model
 * @generated
 */
public enum DecisionTableOrientation implements Enumerator {
	/**
	 * The '<em><b>Rule As Row</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RULE_AS_ROW_VALUE
	 * @generated
	 * @ordered
	 */
	RULE_AS_ROW(0, "RuleAsRow", "RuleAsRow"),

	/**
	 * The '<em><b>Rule As Column</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RULE_AS_COLUMN_VALUE
	 * @generated
	 * @ordered
	 */
	RULE_AS_COLUMN(1, "RuleAsColumn", "RuleAsColumn"),

	/**
	 * The '<em><b>Cross Table</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CROSS_TABLE_VALUE
	 * @generated
	 * @ordered
	 */
	CROSS_TABLE(2, "CrossTable", "CrossTable");

	/**
	 * The '<em><b>Rule As Row</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Rule As Row</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RULE_AS_ROW
	 * @model name="RuleAsRow"
	 * @generated
	 * @ordered
	 */
	public static final int RULE_AS_ROW_VALUE = 0;

	/**
	 * The '<em><b>Rule As Column</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Rule As Column</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RULE_AS_COLUMN
	 * @model name="RuleAsColumn"
	 * @generated
	 * @ordered
	 */
	public static final int RULE_AS_COLUMN_VALUE = 1;

	/**
	 * The '<em><b>Cross Table</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Cross Table</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CROSS_TABLE
	 * @model name="CrossTable"
	 * @generated
	 * @ordered
	 */
	public static final int CROSS_TABLE_VALUE = 2;

	/**
	 * An array of all the '<em><b>Decision Table Orientation</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DecisionTableOrientation[] VALUES_ARRAY =
		new DecisionTableOrientation[] {
			RULE_AS_ROW,
			RULE_AS_COLUMN,
			CROSS_TABLE,
		};

	/**
	 * A public read-only list of all the '<em><b>Decision Table Orientation</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DecisionTableOrientation> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Decision Table Orientation</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DecisionTableOrientation get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DecisionTableOrientation result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Decision Table Orientation</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DecisionTableOrientation getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DecisionTableOrientation result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Decision Table Orientation</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DecisionTableOrientation get(int value) {
		switch (value) {
			case RULE_AS_ROW_VALUE: return RULE_AS_ROW;
			case RULE_AS_COLUMN_VALUE: return RULE_AS_COLUMN;
			case CROSS_TABLE_VALUE: return CROSS_TABLE;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private DecisionTableOrientation(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
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
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //DecisionTableOrientation
