/**
 */
package ra;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Semester</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ra.Semester#getSemesterNumber <em>Semester Number</em>}</li>
 *   <li>{@link ra.Semester#getTotalPoints <em>Total Points</em>}</li>
 *   <li>{@link ra.Semester#getCourseSlot <em>Course Slot</em>}</li>
 *   <li>{@link ra.Semester#getMandatoryCourse <em>Mandatory Course</em>}</li>
 * </ul>
 *
 * @see ra.RaPackage#getSemester()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='mandatoryOrNotCourse'"
 *        annotation="http://www.eclipse.org/acceleo/query/1.0 mandatoryOrNotCourse='if self.mandatoryCourse.mandatory = true then not self.courseSlot-&gt;excludes(self.mandatoryCourse.course) else true endif and self.mandatoryCourse.credit-&gt;sum() &gt;= 30.0'"
 * @generated
 */
public interface Semester extends EObject {
	/**
	 * Returns the value of the '<em><b>Semester Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semester Number</em>' attribute.
	 * @see #setSemesterNumber(int)
	 * @see ra.RaPackage#getSemester_SemesterNumber()
	 * @model
	 * @generated
	 */
	int getSemesterNumber();

	/**
	 * Sets the value of the '{@link ra.Semester#getSemesterNumber <em>Semester Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Semester Number</em>' attribute.
	 * @see #getSemesterNumber()
	 * @generated
	 */
	void setSemesterNumber(int value);

	/**
	 * Returns the value of the '<em><b>Course Slot</b></em>' reference list.
	 * The list contents are of type {@link ra.Course}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Course Slot</em>' reference list.
	 * @see ra.RaPackage#getSemester_CourseSlot()
	 * @model
	 * @generated
	 */
	EList<Course> getCourseSlot();

	/**
	 * Returns the value of the '<em><b>Mandatory Course</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ra.MandatoryCourse#getSemester <em>Semester</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mandatory Course</em>' reference.
	 * @see #setMandatoryCourse(MandatoryCourse)
	 * @see ra.RaPackage#getSemester_MandatoryCourse()
	 * @see ra.MandatoryCourse#getSemester
	 * @model opposite="semester"
	 * @generated
	 */
	MandatoryCourse getMandatoryCourse();

	/**
	 * Sets the value of the '{@link ra.Semester#getMandatoryCourse <em>Mandatory Course</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mandatory Course</em>' reference.
	 * @see #getMandatoryCourse()
	 * @generated
	 */
	void setMandatoryCourse(MandatoryCourse value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model pointMany="true"
	 * @generated
	 */
	void computeTotalPoints(EList<Course> point);

	/**
	 * Returns the value of the '<em><b>Total Points</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total Points</em>' attribute.
	 * @see ra.RaPackage#getSemester_TotalPoints()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	double getTotalPoints();

} // Semester
