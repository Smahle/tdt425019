/**
 */
package ra;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>programme Code</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see ra.RaPackage#getprogrammeCode()
 * @model
 * @generated
 */
public enum programmeCode implements Enumerator {
	/**
	 * The '<em><b>Datateknologi5</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATATEKNOLOGI5_VALUE
	 * @generated
	 * @ordered
	 */
	DATATEKNOLOGI5(0, "Datateknologi5", "MTDT"),

	/**
	 * The '<em><b>Informatikk</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INFORMATIKK_VALUE
	 * @generated
	 * @ordered
	 */
	INFORMATIKK(1, "Informatikk", "MSIT"),

	/**
	 * The '<em><b>Datateknologi2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATATEKNOLOGI2_VALUE
	 * @generated
	 * @ordered
	 */
	DATATEKNOLOGI2(2, "Datateknologi2", "MIDT");

	/**
	 * The '<em><b>Datateknologi5</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATATEKNOLOGI5
	 * @model name="Datateknologi5" literal="MTDT"
	 * @generated
	 * @ordered
	 */
	public static final int DATATEKNOLOGI5_VALUE = 0;

	/**
	 * The '<em><b>Informatikk</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INFORMATIKK
	 * @model name="Informatikk" literal="MSIT"
	 * @generated
	 * @ordered
	 */
	public static final int INFORMATIKK_VALUE = 1;

	/**
	 * The '<em><b>Datateknologi2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATATEKNOLOGI2
	 * @model name="Datateknologi2" literal="MIDT"
	 * @generated
	 * @ordered
	 */
	public static final int DATATEKNOLOGI2_VALUE = 2;

	/**
	 * An array of all the '<em><b>programme Code</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final programmeCode[] VALUES_ARRAY =
		new programmeCode[] {
			DATATEKNOLOGI5,
			INFORMATIKK,
			DATATEKNOLOGI2,
		};

	/**
	 * A public read-only list of all the '<em><b>programme Code</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<programmeCode> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>programme Code</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static programmeCode get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			programmeCode result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>programme Code</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static programmeCode getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			programmeCode result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>programme Code</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static programmeCode get(int value) {
		switch (value) {
			case DATATEKNOLOGI5_VALUE: return DATATEKNOLOGI5;
			case INFORMATIKK_VALUE: return INFORMATIKK;
			case DATATEKNOLOGI2_VALUE: return DATATEKNOLOGI2;
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
	private programmeCode(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
	
} //programmeCode
