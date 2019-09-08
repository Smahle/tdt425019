/**
 */
package ra;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ra.Person#getName <em>Name</em>}</li>
 *   <li>{@link ra.Person#getEmployer <em>Employer</em>}</li>
 *   <li>{@link ra.Person#getAllocations <em>Allocations</em>}</li>
 * </ul>
 *
 * @see ra.RaPackage#getPerson()
 * @model
 * @generated
 */
public interface Person extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see ra.RaPackage#getPerson_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ra.Person#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Employer</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ra.Department#getStaff <em>Staff</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Employer</em>' container reference.
	 * @see #setEmployer(Department)
	 * @see ra.RaPackage#getPerson_Employer()
	 * @see ra.Department#getStaff
	 * @model opposite="staff" transient="false"
	 * @generated
	 */
	Department getEmployer();

	/**
	 * Sets the value of the '{@link ra.Person#getEmployer <em>Employer</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Employer</em>' container reference.
	 * @see #getEmployer()
	 * @generated
	 */
	void setEmployer(Department value);

	/**
	 * Returns the value of the '<em><b>Allocations</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ra.ResourceAllocation#getPerson <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allocations</em>' container reference.
	 * @see #setAllocations(ResourceAllocation)
	 * @see ra.RaPackage#getPerson_Allocations()
	 * @see ra.ResourceAllocation#getPerson
	 * @model opposite="person" transient="false"
	 * @generated
	 */
	ResourceAllocation getAllocations();

	/**
	 * Sets the value of the '{@link ra.Person#getAllocations <em>Allocations</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allocations</em>' container reference.
	 * @see #getAllocations()
	 * @generated
	 */
	void setAllocations(ResourceAllocation value);

} // Person
