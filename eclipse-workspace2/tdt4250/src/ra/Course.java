/**
 */
package ra;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Course</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ra.Course#getName <em>Name</em>}</li>
 *   <li>{@link ra.Course#getCode <em>Code</em>}</li>
 *   <li>{@link ra.Course#getMandatoryCourse <em>Mandatory Course</em>}</li>
 *   <li>{@link ra.Course#getCredit <em>Credit</em>}</li>
 * </ul>
 *
 * @see ra.RaPackage#getCourse()
 * @model
 * @generated
 */
public interface Course extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see ra.RaPackage#getCourse_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ra.Course#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see #setCode(String)
	 * @see ra.RaPackage#getCourse_Code()
	 * @model dataType="ra.courseCode"
	 * @generated
	 */
	String getCode();

	/**
	 * Sets the value of the '{@link ra.Course#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(String value);

	/**
	 * Returns the value of the '<em><b>Mandatory Course</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ra.MandatoryCourse#getCourse <em>Course</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mandatory Course</em>' reference.
	 * @see #setMandatoryCourse(MandatoryCourse)
	 * @see ra.RaPackage#getCourse_MandatoryCourse()
	 * @see ra.MandatoryCourse#getCourse
	 * @model opposite="course"
	 * @generated
	 */
	MandatoryCourse getMandatoryCourse();

	/**
	 * Sets the value of the '{@link ra.Course#getMandatoryCourse <em>Mandatory Course</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mandatory Course</em>' reference.
	 * @see #getMandatoryCourse()
	 * @generated
	 */
	void setMandatoryCourse(MandatoryCourse value);

	/**
	 * Returns the value of the '<em><b>Credit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Credit</em>' attribute.
	 * @see #setCredit(double)
	 * @see ra.RaPackage#getCourse_Credit()
	 * @model
	 * @generated
	 */
	double getCredit();

	/**
	 * Sets the value of the '{@link ra.Course#getCredit <em>Credit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Credit</em>' attribute.
	 * @see #getCredit()
	 * @generated
	 */
	void setCredit(double value);

} // Course
