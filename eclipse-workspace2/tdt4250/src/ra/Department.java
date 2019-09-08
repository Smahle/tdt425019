/**
 */
package ra;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Department</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ra.Department#getProgramme <em>Programme</em>}</li>
 *   <li>{@link ra.Department#getCourse <em>Course</em>}</li>
 *   <li>{@link ra.Department#getStudyPlan <em>Study Plan</em>}</li>
 *   <li>{@link ra.Department#getSpesialization <em>Spesialization</em>}</li>
 * </ul>
 *
 * @see ra.RaPackage#getDepartment()
 * @model
 * @generated
 */
public interface Department extends EObject {
	/**
	 * Returns the value of the '<em><b>Programme</b></em>' containment reference list.
	 * The list contents are of type {@link ra.Programme}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Programme</em>' containment reference list.
	 * @see ra.RaPackage#getDepartment_Programme()
	 * @model containment="true"
	 * @generated
	 */
	EList<Programme> getProgramme();

	/**
	 * Returns the value of the '<em><b>Course</b></em>' containment reference list.
	 * The list contents are of type {@link ra.Course}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Course</em>' containment reference list.
	 * @see ra.RaPackage#getDepartment_Course()
	 * @model containment="true"
	 * @generated
	 */
	EList<Course> getCourse();

	/**
	 * Returns the value of the '<em><b>Study Plan</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Study Plan</em>' containment reference.
	 * @see #setStudyPlan(StudyPlan)
	 * @see ra.RaPackage#getDepartment_StudyPlan()
	 * @model containment="true"
	 * @generated
	 */
	StudyPlan getStudyPlan();

	/**
	 * Sets the value of the '{@link ra.Department#getStudyPlan <em>Study Plan</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Study Plan</em>' containment reference.
	 * @see #getStudyPlan()
	 * @generated
	 */
	void setStudyPlan(StudyPlan value);

	/**
	 * Returns the value of the '<em><b>Spesialization</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spesialization</em>' containment reference.
	 * @see #setSpesialization(Specialization)
	 * @see ra.RaPackage#getDepartment_Spesialization()
	 * @model containment="true"
	 * @generated
	 */
	Specialization getSpesialization();

	/**
	 * Sets the value of the '{@link ra.Department#getSpesialization <em>Spesialization</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Spesialization</em>' containment reference.
	 * @see #getSpesialization()
	 * @generated
	 */
	void setSpesialization(Specialization value);

} // Department
