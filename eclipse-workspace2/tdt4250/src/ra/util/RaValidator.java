/**
 */
package ra.util;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import ra.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see ra.RaPackage
 * @generated
 */
public class RaValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final RaValidator INSTANCE = new RaValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "ra";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RaValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return RaPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case RaPackage.DEPARTMENT:
				return validateDepartment((Department)value, diagnostics, context);
			case RaPackage.COURSE:
				return validateCourse((Course)value, diagnostics, context);
			case RaPackage.PROGRAMME:
				return validateProgramme((Programme)value, diagnostics, context);
			case RaPackage.STUDY_PLAN:
				return validateStudyPlan((StudyPlan)value, diagnostics, context);
			case RaPackage.SPECIALIZATION:
				return validateSpecialization((Specialization)value, diagnostics, context);
			case RaPackage.SEMESTER:
				return validateSemester((Semester)value, diagnostics, context);
			case RaPackage.MANDATORY_COURSE:
				return validateMandatoryCourse((MandatoryCourse)value, diagnostics, context);
			case RaPackage.PROGRAMME_CODE:
				return validateprogrammeCode((programmeCode)value, diagnostics, context);
			case RaPackage.COURSE_CODE:
				return validatecourseCode((String)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDepartment(Department department, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(department, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCourse(Course course, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(course, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgramme(Programme programme, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(programme, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStudyPlan(StudyPlan studyPlan, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(studyPlan, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSpecialization(Specialization specialization, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(specialization, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSemester(Semester semester, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(semester, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(semester, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(semester, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(semester, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(semester, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(semester, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(semester, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(semester, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(semester, diagnostics, context);
		if (result || diagnostics != null) result &= validateSemester_mandatoryOrNotCourse(semester, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the mandatoryOrNotCourse constraint of '<em>Semester</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SEMESTER__MANDATORY_OR_NOT_COURSE__EEXPRESSION = "if self.mandatoryCourse.mandatory = true then not self.courseSlot->excludes(self.mandatoryCourse.course) else true endif and self.mandatoryCourse.credit->sum() >= 30.0";

	/**
	 * Validates the mandatoryOrNotCourse constraint of '<em>Semester</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSemester_mandatoryOrNotCourse(Semester semester, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RaPackage.Literals.SEMESTER,
				 semester,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/acceleo/query/1.0",
				 "mandatoryOrNotCourse",
				 SEMESTER__MANDATORY_OR_NOT_COURSE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMandatoryCourse(MandatoryCourse mandatoryCourse, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mandatoryCourse, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateprogrammeCode(programmeCode programmeCode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatecourseCode(String courseCode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validatecourseCode_MinLength(courseCode, diagnostics, context);
		if (result || diagnostics != null) result &= validatecourseCode_MaxLength(courseCode, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>course Code</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatecourseCode_MinLength(String courseCode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = courseCode.length();
		boolean result = length >= 7;
		if (!result && diagnostics != null)
			reportMinLengthViolation(RaPackage.Literals.COURSE_CODE, courseCode, length, 7, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>course Code</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatecourseCode_MaxLength(String courseCode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = courseCode.length();
		boolean result = length <= 8;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(RaPackage.Literals.COURSE_CODE, courseCode, length, 8, diagnostics, context);
		return result;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //RaValidator
