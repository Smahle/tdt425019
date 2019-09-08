/**
 */
package ra;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Programme</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ra.Programme#getName <em>Name</em>}</li>
 *   <li>{@link ra.Programme#getMCode <em>MCode</em>}</li>
 *   <li>{@link ra.Programme#getStudyPlan <em>Study Plan</em>}</li>
 * </ul>
 *
 * @see ra.RaPackage#getProgramme()
 * @model
 * @generated
 */
public interface Programme extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see ra.RaPackage#getProgramme_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ra.Programme#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>MCode</b></em>' attribute.
	 * The literals are from the enumeration {@link ra.programmeCode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MCode</em>' attribute.
	 * @see ra.programmeCode
	 * @see #setMCode(programmeCode)
	 * @see ra.RaPackage#getProgramme_MCode()
	 * @model
	 * @generated
	 */
	programmeCode getMCode();

	/**
	 * Sets the value of the '{@link ra.Programme#getMCode <em>MCode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MCode</em>' attribute.
	 * @see ra.programmeCode
	 * @see #getMCode()
	 * @generated
	 */
	void setMCode(programmeCode value);

	/**
	 * Returns the value of the '<em><b>Study Plan</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Study Plan</em>' containment reference.
	 * @see #setStudyPlan(StudyPlan)
	 * @see ra.RaPackage#getProgramme_StudyPlan()
	 * @model containment="true"
	 * @generated
	 */
	StudyPlan getStudyPlan();

	/**
	 * Sets the value of the '{@link ra.Programme#getStudyPlan <em>Study Plan</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Study Plan</em>' containment reference.
	 * @see #getStudyPlan()
	 * @generated
	 */
	void setStudyPlan(StudyPlan value);

} // Programme
