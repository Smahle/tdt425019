/**
 */
package ra;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Study Plan</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ra.StudyPlan#getProgramme <em>Programme</em>}</li>
 *   <li>{@link ra.StudyPlan#getSpesialization <em>Spesialization</em>}</li>
 *   <li>{@link ra.StudyPlan#getSemester <em>Semester</em>}</li>
 *   <li>{@link ra.StudyPlan#getMandatoryCourse <em>Mandatory Course</em>}</li>
 * </ul>
 *
 * @see ra.RaPackage#getStudyPlan()
 * @model
 * @generated
 */
public interface StudyPlan extends EObject {
	/**
	 * Returns the value of the '<em><b>Programme</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Programme</em>' reference.
	 * @see #setProgramme(Programme)
	 * @see ra.RaPackage#getStudyPlan_Programme()
	 * @model
	 * @generated
	 */
	Programme getProgramme();

	/**
	 * Sets the value of the '{@link ra.StudyPlan#getProgramme <em>Programme</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Programme</em>' reference.
	 * @see #getProgramme()
	 * @generated
	 */
	void setProgramme(Programme value);

	/**
	 * Returns the value of the '<em><b>Spesialization</b></em>' containment reference list.
	 * The list contents are of type {@link ra.Specialization}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spesialization</em>' containment reference list.
	 * @see ra.RaPackage#getStudyPlan_Spesialization()
	 * @model containment="true"
	 * @generated
	 */
	EList<Specialization> getSpesialization();

	/**
	 * Returns the value of the '<em><b>Semester</b></em>' containment reference list.
	 * The list contents are of type {@link ra.Semester}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semester</em>' containment reference list.
	 * @see ra.RaPackage#getStudyPlan_Semester()
	 * @model containment="true"
	 * @generated
	 */
	EList<Semester> getSemester();

	/**
	 * Returns the value of the '<em><b>Mandatory Course</b></em>' containment reference list.
	 * The list contents are of type {@link ra.MandatoryCourse}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mandatory Course</em>' containment reference list.
	 * @see ra.RaPackage#getStudyPlan_MandatoryCourse()
	 * @model containment="true"
	 * @generated
	 */
	EList<MandatoryCourse> getMandatoryCourse();

} // StudyPlan
