/**
 */
package ra;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Specialization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ra.Specialization#getName <em>Name</em>}</li>
 *   <li>{@link ra.Specialization#getStudyPlan <em>Study Plan</em>}</li>
 *   <li>{@link ra.Specialization#getSemester <em>Semester</em>}</li>
 * </ul>
 *
 * @see ra.RaPackage#getSpecialization()
 * @model
 * @generated
 */
public interface Specialization extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see ra.RaPackage#getSpecialization_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ra.Specialization#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Study Plan</b></em>' containment reference list.
	 * The list contents are of type {@link ra.StudyPlan}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Study Plan</em>' containment reference list.
	 * @see ra.RaPackage#getSpecialization_StudyPlan()
	 * @model containment="true"
	 * @generated
	 */
	EList<StudyPlan> getStudyPlan();

	/**
	 * Returns the value of the '<em><b>Semester</b></em>' containment reference list.
	 * The list contents are of type {@link ra.Semester}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semester</em>' containment reference list.
	 * @see ra.RaPackage#getSpecialization_Semester()
	 * @model containment="true"
	 * @generated
	 */
	EList<Semester> getSemester();

} // Specialization
