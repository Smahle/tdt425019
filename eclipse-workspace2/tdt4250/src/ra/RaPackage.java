/**
 */
package ra;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see ra.RaFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore validationDelegates='http://www.eclipse.org/acceleo/query/1.0' invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL'"
 * @generated
 */
public interface RaPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ra";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/resource/tdt4250/model/ra.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "tdt4250.ra";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RaPackage eINSTANCE = ra.impl.RaPackageImpl.init();

	/**
	 * The meta object id for the '{@link ra.impl.DepartmentImpl <em>Department</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ra.impl.DepartmentImpl
	 * @see ra.impl.RaPackageImpl#getDepartment()
	 * @generated
	 */
	int DEPARTMENT = 0;

	/**
	 * The feature id for the '<em><b>Programme</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTMENT__PROGRAMME = 0;

	/**
	 * The feature id for the '<em><b>Course</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTMENT__COURSE = 1;

	/**
	 * The feature id for the '<em><b>Study Plan</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTMENT__STUDY_PLAN = 2;

	/**
	 * The feature id for the '<em><b>Spesialization</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTMENT__SPESIALIZATION = 3;

	/**
	 * The number of structural features of the '<em>Department</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTMENT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Department</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ra.impl.CourseImpl <em>Course</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ra.impl.CourseImpl
	 * @see ra.impl.RaPackageImpl#getCourse()
	 * @generated
	 */
	int COURSE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__CODE = 1;

	/**
	 * The feature id for the '<em><b>Mandatory Course</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__MANDATORY_COURSE = 2;

	/**
	 * The feature id for the '<em><b>Credit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__CREDIT = 3;

	/**
	 * The number of structural features of the '<em>Course</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Course</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ra.impl.ProgrammeImpl <em>Programme</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ra.impl.ProgrammeImpl
	 * @see ra.impl.RaPackageImpl#getProgramme()
	 * @generated
	 */
	int PROGRAMME = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMME__NAME = 0;

	/**
	 * The feature id for the '<em><b>MCode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMME__MCODE = 1;

	/**
	 * The feature id for the '<em><b>Study Plan</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMME__STUDY_PLAN = 2;

	/**
	 * The number of structural features of the '<em>Programme</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMME_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Programme</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMME_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ra.impl.StudyPlanImpl <em>Study Plan</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ra.impl.StudyPlanImpl
	 * @see ra.impl.RaPackageImpl#getStudyPlan()
	 * @generated
	 */
	int STUDY_PLAN = 3;

	/**
	 * The feature id for the '<em><b>Programme</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDY_PLAN__PROGRAMME = 0;

	/**
	 * The feature id for the '<em><b>Spesialization</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDY_PLAN__SPESIALIZATION = 1;

	/**
	 * The feature id for the '<em><b>Semester</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDY_PLAN__SEMESTER = 2;

	/**
	 * The feature id for the '<em><b>Mandatory Course</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDY_PLAN__MANDATORY_COURSE = 3;

	/**
	 * The number of structural features of the '<em>Study Plan</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDY_PLAN_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Study Plan</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDY_PLAN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ra.impl.SpecializationImpl <em>Specialization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ra.impl.SpecializationImpl
	 * @see ra.impl.RaPackageImpl#getSpecialization()
	 * @generated
	 */
	int SPECIALIZATION = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALIZATION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Study Plan</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALIZATION__STUDY_PLAN = 1;

	/**
	 * The feature id for the '<em><b>Semester</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALIZATION__SEMESTER = 2;

	/**
	 * The number of structural features of the '<em>Specialization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALIZATION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Specialization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALIZATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ra.impl.SemesterImpl <em>Semester</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ra.impl.SemesterImpl
	 * @see ra.impl.RaPackageImpl#getSemester()
	 * @generated
	 */
	int SEMESTER = 5;

	/**
	 * The feature id for the '<em><b>Semester Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER__SEMESTER_NUMBER = 0;

	/**
	 * The feature id for the '<em><b>Total Points</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER__TOTAL_POINTS = 1;

	/**
	 * The feature id for the '<em><b>Course Slot</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER__COURSE_SLOT = 2;

	/**
	 * The feature id for the '<em><b>Mandatory Course</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER__MANDATORY_COURSE = 3;

	/**
	 * The number of structural features of the '<em>Semester</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER_FEATURE_COUNT = 4;

	/**
	 * The operation id for the '<em>Compute Total Points</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER___COMPUTE_TOTAL_POINTS__ELIST = 0;

	/**
	 * The number of operations of the '<em>Semester</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link ra.impl.MandatoryCourseImpl <em>Mandatory Course</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ra.impl.MandatoryCourseImpl
	 * @see ra.impl.RaPackageImpl#getMandatoryCourse()
	 * @generated
	 */
	int MANDATORY_COURSE = 6;

	/**
	 * The feature id for the '<em><b>Semester</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANDATORY_COURSE__SEMESTER = 0;

	/**
	 * The feature id for the '<em><b>Course</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANDATORY_COURSE__COURSE = 1;

	/**
	 * The feature id for the '<em><b>Mandatory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANDATORY_COURSE__MANDATORY = 2;

	/**
	 * The feature id for the '<em><b>Credit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANDATORY_COURSE__CREDIT = 3;

	/**
	 * The number of structural features of the '<em>Mandatory Course</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANDATORY_COURSE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Mandatory Course</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANDATORY_COURSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ra.programmeCode <em>programme Code</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ra.programmeCode
	 * @see ra.impl.RaPackageImpl#getprogrammeCode()
	 * @generated
	 */
	int PROGRAMME_CODE = 7;

	/**
	 * The meta object id for the '<em>course Code</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see ra.impl.RaPackageImpl#getcourseCode()
	 * @generated
	 */
	int COURSE_CODE = 8;

	/**
	 * Returns the meta object for class '{@link ra.Department <em>Department</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Department</em>'.
	 * @see ra.Department
	 * @generated
	 */
	EClass getDepartment();

	/**
	 * Returns the meta object for the containment reference list '{@link ra.Department#getProgramme <em>Programme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Programme</em>'.
	 * @see ra.Department#getProgramme()
	 * @see #getDepartment()
	 * @generated
	 */
	EReference getDepartment_Programme();

	/**
	 * Returns the meta object for the containment reference list '{@link ra.Department#getCourse <em>Course</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Course</em>'.
	 * @see ra.Department#getCourse()
	 * @see #getDepartment()
	 * @generated
	 */
	EReference getDepartment_Course();

	/**
	 * Returns the meta object for the containment reference '{@link ra.Department#getStudyPlan <em>Study Plan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Study Plan</em>'.
	 * @see ra.Department#getStudyPlan()
	 * @see #getDepartment()
	 * @generated
	 */
	EReference getDepartment_StudyPlan();

	/**
	 * Returns the meta object for the containment reference '{@link ra.Department#getSpesialization <em>Spesialization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Spesialization</em>'.
	 * @see ra.Department#getSpesialization()
	 * @see #getDepartment()
	 * @generated
	 */
	EReference getDepartment_Spesialization();

	/**
	 * Returns the meta object for class '{@link ra.Course <em>Course</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Course</em>'.
	 * @see ra.Course
	 * @generated
	 */
	EClass getCourse();

	/**
	 * Returns the meta object for the attribute '{@link ra.Course#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ra.Course#getName()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_Name();

	/**
	 * Returns the meta object for the attribute '{@link ra.Course#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see ra.Course#getCode()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_Code();

	/**
	 * Returns the meta object for the reference '{@link ra.Course#getMandatoryCourse <em>Mandatory Course</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Mandatory Course</em>'.
	 * @see ra.Course#getMandatoryCourse()
	 * @see #getCourse()
	 * @generated
	 */
	EReference getCourse_MandatoryCourse();

	/**
	 * Returns the meta object for the attribute '{@link ra.Course#getCredit <em>Credit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Credit</em>'.
	 * @see ra.Course#getCredit()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_Credit();

	/**
	 * Returns the meta object for class '{@link ra.Programme <em>Programme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Programme</em>'.
	 * @see ra.Programme
	 * @generated
	 */
	EClass getProgramme();

	/**
	 * Returns the meta object for the attribute '{@link ra.Programme#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ra.Programme#getName()
	 * @see #getProgramme()
	 * @generated
	 */
	EAttribute getProgramme_Name();

	/**
	 * Returns the meta object for the attribute '{@link ra.Programme#getMCode <em>MCode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>MCode</em>'.
	 * @see ra.Programme#getMCode()
	 * @see #getProgramme()
	 * @generated
	 */
	EAttribute getProgramme_MCode();

	/**
	 * Returns the meta object for the containment reference '{@link ra.Programme#getStudyPlan <em>Study Plan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Study Plan</em>'.
	 * @see ra.Programme#getStudyPlan()
	 * @see #getProgramme()
	 * @generated
	 */
	EReference getProgramme_StudyPlan();

	/**
	 * Returns the meta object for class '{@link ra.StudyPlan <em>Study Plan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Study Plan</em>'.
	 * @see ra.StudyPlan
	 * @generated
	 */
	EClass getStudyPlan();

	/**
	 * Returns the meta object for the reference '{@link ra.StudyPlan#getProgramme <em>Programme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Programme</em>'.
	 * @see ra.StudyPlan#getProgramme()
	 * @see #getStudyPlan()
	 * @generated
	 */
	EReference getStudyPlan_Programme();

	/**
	 * Returns the meta object for the containment reference list '{@link ra.StudyPlan#getSpesialization <em>Spesialization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Spesialization</em>'.
	 * @see ra.StudyPlan#getSpesialization()
	 * @see #getStudyPlan()
	 * @generated
	 */
	EReference getStudyPlan_Spesialization();

	/**
	 * Returns the meta object for the containment reference list '{@link ra.StudyPlan#getSemester <em>Semester</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Semester</em>'.
	 * @see ra.StudyPlan#getSemester()
	 * @see #getStudyPlan()
	 * @generated
	 */
	EReference getStudyPlan_Semester();

	/**
	 * Returns the meta object for the containment reference list '{@link ra.StudyPlan#getMandatoryCourse <em>Mandatory Course</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mandatory Course</em>'.
	 * @see ra.StudyPlan#getMandatoryCourse()
	 * @see #getStudyPlan()
	 * @generated
	 */
	EReference getStudyPlan_MandatoryCourse();

	/**
	 * Returns the meta object for class '{@link ra.Specialization <em>Specialization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Specialization</em>'.
	 * @see ra.Specialization
	 * @generated
	 */
	EClass getSpecialization();

	/**
	 * Returns the meta object for the attribute '{@link ra.Specialization#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ra.Specialization#getName()
	 * @see #getSpecialization()
	 * @generated
	 */
	EAttribute getSpecialization_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link ra.Specialization#getStudyPlan <em>Study Plan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Study Plan</em>'.
	 * @see ra.Specialization#getStudyPlan()
	 * @see #getSpecialization()
	 * @generated
	 */
	EReference getSpecialization_StudyPlan();

	/**
	 * Returns the meta object for the containment reference list '{@link ra.Specialization#getSemester <em>Semester</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Semester</em>'.
	 * @see ra.Specialization#getSemester()
	 * @see #getSpecialization()
	 * @generated
	 */
	EReference getSpecialization_Semester();

	/**
	 * Returns the meta object for class '{@link ra.Semester <em>Semester</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Semester</em>'.
	 * @see ra.Semester
	 * @generated
	 */
	EClass getSemester();

	/**
	 * Returns the meta object for the attribute '{@link ra.Semester#getSemesterNumber <em>Semester Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Semester Number</em>'.
	 * @see ra.Semester#getSemesterNumber()
	 * @see #getSemester()
	 * @generated
	 */
	EAttribute getSemester_SemesterNumber();

	/**
	 * Returns the meta object for the reference list '{@link ra.Semester#getCourseSlot <em>Course Slot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Course Slot</em>'.
	 * @see ra.Semester#getCourseSlot()
	 * @see #getSemester()
	 * @generated
	 */
	EReference getSemester_CourseSlot();

	/**
	 * Returns the meta object for the reference '{@link ra.Semester#getMandatoryCourse <em>Mandatory Course</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Mandatory Course</em>'.
	 * @see ra.Semester#getMandatoryCourse()
	 * @see #getSemester()
	 * @generated
	 */
	EReference getSemester_MandatoryCourse();

	/**
	 * Returns the meta object for the '{@link ra.Semester#computeTotalPoints(org.eclipse.emf.common.util.EList) <em>Compute Total Points</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Compute Total Points</em>' operation.
	 * @see ra.Semester#computeTotalPoints(org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getSemester__ComputeTotalPoints__EList();

	/**
	 * Returns the meta object for the attribute '{@link ra.Semester#getTotalPoints <em>Total Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total Points</em>'.
	 * @see ra.Semester#getTotalPoints()
	 * @see #getSemester()
	 * @generated
	 */
	EAttribute getSemester_TotalPoints();

	/**
	 * Returns the meta object for class '{@link ra.MandatoryCourse <em>Mandatory Course</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mandatory Course</em>'.
	 * @see ra.MandatoryCourse
	 * @generated
	 */
	EClass getMandatoryCourse();

	/**
	 * Returns the meta object for the reference '{@link ra.MandatoryCourse#getSemester <em>Semester</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Semester</em>'.
	 * @see ra.MandatoryCourse#getSemester()
	 * @see #getMandatoryCourse()
	 * @generated
	 */
	EReference getMandatoryCourse_Semester();

	/**
	 * Returns the meta object for the reference '{@link ra.MandatoryCourse#getCourse <em>Course</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Course</em>'.
	 * @see ra.MandatoryCourse#getCourse()
	 * @see #getMandatoryCourse()
	 * @generated
	 */
	EReference getMandatoryCourse_Course();

	/**
	 * Returns the meta object for the attribute '{@link ra.MandatoryCourse#isMandatory <em>Mandatory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mandatory</em>'.
	 * @see ra.MandatoryCourse#isMandatory()
	 * @see #getMandatoryCourse()
	 * @generated
	 */
	EAttribute getMandatoryCourse_Mandatory();

	/**
	 * Returns the meta object for the attribute '{@link ra.MandatoryCourse#getCredit <em>Credit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Credit</em>'.
	 * @see ra.MandatoryCourse#getCredit()
	 * @see #getMandatoryCourse()
	 * @generated
	 */
	EAttribute getMandatoryCourse_Credit();

	/**
	 * Returns the meta object for enum '{@link ra.programmeCode <em>programme Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>programme Code</em>'.
	 * @see ra.programmeCode
	 * @generated
	 */
	EEnum getprogrammeCode();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>course Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>course Code</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="maxLength='8' minLength='7'"
	 * @generated
	 */
	EDataType getcourseCode();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RaFactory getRaFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link ra.impl.DepartmentImpl <em>Department</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ra.impl.DepartmentImpl
		 * @see ra.impl.RaPackageImpl#getDepartment()
		 * @generated
		 */
		EClass DEPARTMENT = eINSTANCE.getDepartment();

		/**
		 * The meta object literal for the '<em><b>Programme</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPARTMENT__PROGRAMME = eINSTANCE.getDepartment_Programme();

		/**
		 * The meta object literal for the '<em><b>Course</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPARTMENT__COURSE = eINSTANCE.getDepartment_Course();

		/**
		 * The meta object literal for the '<em><b>Study Plan</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPARTMENT__STUDY_PLAN = eINSTANCE.getDepartment_StudyPlan();

		/**
		 * The meta object literal for the '<em><b>Spesialization</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPARTMENT__SPESIALIZATION = eINSTANCE.getDepartment_Spesialization();

		/**
		 * The meta object literal for the '{@link ra.impl.CourseImpl <em>Course</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ra.impl.CourseImpl
		 * @see ra.impl.RaPackageImpl#getCourse()
		 * @generated
		 */
		EClass COURSE = eINSTANCE.getCourse();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__NAME = eINSTANCE.getCourse_Name();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__CODE = eINSTANCE.getCourse_Code();

		/**
		 * The meta object literal for the '<em><b>Mandatory Course</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COURSE__MANDATORY_COURSE = eINSTANCE.getCourse_MandatoryCourse();

		/**
		 * The meta object literal for the '<em><b>Credit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__CREDIT = eINSTANCE.getCourse_Credit();

		/**
		 * The meta object literal for the '{@link ra.impl.ProgrammeImpl <em>Programme</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ra.impl.ProgrammeImpl
		 * @see ra.impl.RaPackageImpl#getProgramme()
		 * @generated
		 */
		EClass PROGRAMME = eINSTANCE.getProgramme();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROGRAMME__NAME = eINSTANCE.getProgramme_Name();

		/**
		 * The meta object literal for the '<em><b>MCode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROGRAMME__MCODE = eINSTANCE.getProgramme_MCode();

		/**
		 * The meta object literal for the '<em><b>Study Plan</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAMME__STUDY_PLAN = eINSTANCE.getProgramme_StudyPlan();

		/**
		 * The meta object literal for the '{@link ra.impl.StudyPlanImpl <em>Study Plan</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ra.impl.StudyPlanImpl
		 * @see ra.impl.RaPackageImpl#getStudyPlan()
		 * @generated
		 */
		EClass STUDY_PLAN = eINSTANCE.getStudyPlan();

		/**
		 * The meta object literal for the '<em><b>Programme</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STUDY_PLAN__PROGRAMME = eINSTANCE.getStudyPlan_Programme();

		/**
		 * The meta object literal for the '<em><b>Spesialization</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STUDY_PLAN__SPESIALIZATION = eINSTANCE.getStudyPlan_Spesialization();

		/**
		 * The meta object literal for the '<em><b>Semester</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STUDY_PLAN__SEMESTER = eINSTANCE.getStudyPlan_Semester();

		/**
		 * The meta object literal for the '<em><b>Mandatory Course</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STUDY_PLAN__MANDATORY_COURSE = eINSTANCE.getStudyPlan_MandatoryCourse();

		/**
		 * The meta object literal for the '{@link ra.impl.SpecializationImpl <em>Specialization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ra.impl.SpecializationImpl
		 * @see ra.impl.RaPackageImpl#getSpecialization()
		 * @generated
		 */
		EClass SPECIALIZATION = eINSTANCE.getSpecialization();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECIALIZATION__NAME = eINSTANCE.getSpecialization_Name();

		/**
		 * The meta object literal for the '<em><b>Study Plan</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIALIZATION__STUDY_PLAN = eINSTANCE.getSpecialization_StudyPlan();

		/**
		 * The meta object literal for the '<em><b>Semester</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIALIZATION__SEMESTER = eINSTANCE.getSpecialization_Semester();

		/**
		 * The meta object literal for the '{@link ra.impl.SemesterImpl <em>Semester</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ra.impl.SemesterImpl
		 * @see ra.impl.RaPackageImpl#getSemester()
		 * @generated
		 */
		EClass SEMESTER = eINSTANCE.getSemester();

		/**
		 * The meta object literal for the '<em><b>Semester Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEMESTER__SEMESTER_NUMBER = eINSTANCE.getSemester_SemesterNumber();

		/**
		 * The meta object literal for the '<em><b>Course Slot</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMESTER__COURSE_SLOT = eINSTANCE.getSemester_CourseSlot();

		/**
		 * The meta object literal for the '<em><b>Mandatory Course</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMESTER__MANDATORY_COURSE = eINSTANCE.getSemester_MandatoryCourse();

		/**
		 * The meta object literal for the '<em><b>Compute Total Points</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SEMESTER___COMPUTE_TOTAL_POINTS__ELIST = eINSTANCE.getSemester__ComputeTotalPoints__EList();

		/**
		 * The meta object literal for the '<em><b>Total Points</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEMESTER__TOTAL_POINTS = eINSTANCE.getSemester_TotalPoints();

		/**
		 * The meta object literal for the '{@link ra.impl.MandatoryCourseImpl <em>Mandatory Course</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ra.impl.MandatoryCourseImpl
		 * @see ra.impl.RaPackageImpl#getMandatoryCourse()
		 * @generated
		 */
		EClass MANDATORY_COURSE = eINSTANCE.getMandatoryCourse();

		/**
		 * The meta object literal for the '<em><b>Semester</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MANDATORY_COURSE__SEMESTER = eINSTANCE.getMandatoryCourse_Semester();

		/**
		 * The meta object literal for the '<em><b>Course</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MANDATORY_COURSE__COURSE = eINSTANCE.getMandatoryCourse_Course();

		/**
		 * The meta object literal for the '<em><b>Mandatory</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MANDATORY_COURSE__MANDATORY = eINSTANCE.getMandatoryCourse_Mandatory();

		/**
		 * The meta object literal for the '<em><b>Credit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MANDATORY_COURSE__CREDIT = eINSTANCE.getMandatoryCourse_Credit();

		/**
		 * The meta object literal for the '{@link ra.programmeCode <em>programme Code</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ra.programmeCode
		 * @see ra.impl.RaPackageImpl#getprogrammeCode()
		 * @generated
		 */
		EEnum PROGRAMME_CODE = eINSTANCE.getprogrammeCode();

		/**
		 * The meta object literal for the '<em>course Code</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see ra.impl.RaPackageImpl#getcourseCode()
		 * @generated
		 */
		EDataType COURSE_CODE = eINSTANCE.getcourseCode();

	}

} //RaPackage
