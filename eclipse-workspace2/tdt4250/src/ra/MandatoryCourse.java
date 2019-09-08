/**
 */
package ra;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mandatory Course</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ra.MandatoryCourse#getSemester <em>Semester</em>}</li>
 *   <li>{@link ra.MandatoryCourse#getCourse <em>Course</em>}</li>
 *   <li>{@link ra.MandatoryCourse#isMandatory <em>Mandatory</em>}</li>
 *   <li>{@link ra.MandatoryCourse#getCredit <em>Credit</em>}</li>
 * </ul>
 *
 * @see ra.RaPackage#getMandatoryCourse()
 * @model
 * @generated
 */
public interface MandatoryCourse extends EObject {
	/**
	 * Returns the value of the '<em><b>Semester</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ra.Semester#getMandatoryCourse <em>Mandatory Course</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semester</em>' reference.
	 * @see #setSemester(Semester)
	 * @see ra.RaPackage#getMandatoryCourse_Semester()
	 * @see ra.Semester#getMandatoryCourse
	 * @model opposite="mandatoryCourse"
	 * @generated
	 */
	Semester getSemester();

	/**
	 * Sets the value of the '{@link ra.MandatoryCourse#getSemester <em>Semester</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Semester</em>' reference.
	 * @see #getSemester()
	 * @generated
	 */
	void setSemester(Semester value);

	/**
	 * Returns the value of the '<em><b>Course</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ra.Course#getMandatoryCourse <em>Mandatory Course</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Course</em>' reference.
	 * @see #setCourse(Course)
	 * @see ra.RaPackage#getMandatoryCourse_Course()
	 * @see ra.Course#getMandatoryCourse
	 * @model opposite="mandatoryCourse"
	 * @generated
	 */
	Course getCourse();

	/**
	 * Sets the value of the '{@link ra.MandatoryCourse#getCourse <em>Course</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Course</em>' reference.
	 * @see #getCourse()
	 * @generated
	 */
	void setCourse(Course value);

	/**
	 * Returns the value of the '<em><b>Mandatory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mandatory</em>' attribute.
	 * @see #setMandatory(boolean)
	 * @see ra.RaPackage#getMandatoryCourse_Mandatory()
	 * @model
	 * @generated
	 */
	boolean isMandatory();

	/**
	 * Sets the value of the '{@link ra.MandatoryCourse#isMandatory <em>Mandatory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mandatory</em>' attribute.
	 * @see #isMandatory()
	 * @generated
	 */
	void setMandatory(boolean value);

	/**
	 * Returns the value of the '<em><b>Credit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Credit</em>' attribute.
	 * @see #setCredit(double)
	 * @see ra.RaPackage#getMandatoryCourse_Credit()
	 * @model
	 * @generated
	 */
	double getCredit();

	/**
	 * Sets the value of the '{@link ra.MandatoryCourse#getCredit <em>Credit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Credit</em>' attribute.
	 * @see #getCredit()
	 * @generated
	 */
	void setCredit(double value);

} // MandatoryCourse
