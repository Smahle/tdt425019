/**
 */
package ra.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import ra.Course;
import ra.MandatoryCourse;
import ra.RaPackage;
import ra.Semester;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Semester</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ra.impl.SemesterImpl#getSemesterNumber <em>Semester Number</em>}</li>
 *   <li>{@link ra.impl.SemesterImpl#getTotalPoints <em>Total Points</em>}</li>
 *   <li>{@link ra.impl.SemesterImpl#getCourseSlot <em>Course Slot</em>}</li>
 *   <li>{@link ra.impl.SemesterImpl#getMandatoryCourse <em>Mandatory Course</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SemesterImpl extends MinimalEObjectImpl.Container implements Semester {
	/**
	 * The default value of the '{@link #getSemesterNumber() <em>Semester Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemesterNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int SEMESTER_NUMBER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSemesterNumber() <em>Semester Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemesterNumber()
	 * @generated
	 * @ordered
	 */
	protected int semesterNumber = SEMESTER_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getTotalPoints() <em>Total Points</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalPoints()
	 * @generated
	 * @ordered
	 */
	protected static final double TOTAL_POINTS_EDEFAULT = 1.0;

	/**
	 * The cached value of the '{@link #getCourseSlot() <em>Course Slot</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCourseSlot()
	 * @generated
	 * @ordered
	 */
	protected EList<Course> courseSlot;

	/**
	 * The cached value of the '{@link #getMandatoryCourse() <em>Mandatory Course</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMandatoryCourse()
	 * @generated
	 * @ordered
	 */
	protected MandatoryCourse mandatoryCourse;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SemesterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RaPackage.Literals.SEMESTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getSemesterNumber() {
		return semesterNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSemesterNumber(int newSemesterNumber) {
		int oldSemesterNumber = semesterNumber;
		semesterNumber = newSemesterNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RaPackage.SEMESTER__SEMESTER_NUMBER, oldSemesterNumber, semesterNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Course> getCourseSlot() {
		if (courseSlot == null) {
			courseSlot = new EObjectResolvingEList<Course>(Course.class, this, RaPackage.SEMESTER__COURSE_SLOT);
		}
		return courseSlot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MandatoryCourse getMandatoryCourse() {
		if (mandatoryCourse != null && mandatoryCourse.eIsProxy()) {
			InternalEObject oldMandatoryCourse = (InternalEObject)mandatoryCourse;
			mandatoryCourse = (MandatoryCourse)eResolveProxy(oldMandatoryCourse);
			if (mandatoryCourse != oldMandatoryCourse) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RaPackage.SEMESTER__MANDATORY_COURSE, oldMandatoryCourse, mandatoryCourse));
			}
		}
		return mandatoryCourse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MandatoryCourse basicGetMandatoryCourse() {
		return mandatoryCourse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMandatoryCourse(MandatoryCourse newMandatoryCourse, NotificationChain msgs) {
		MandatoryCourse oldMandatoryCourse = mandatoryCourse;
		mandatoryCourse = newMandatoryCourse;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RaPackage.SEMESTER__MANDATORY_COURSE, oldMandatoryCourse, newMandatoryCourse);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMandatoryCourse(MandatoryCourse newMandatoryCourse) {
		if (newMandatoryCourse != mandatoryCourse) {
			NotificationChain msgs = null;
			if (mandatoryCourse != null)
				msgs = ((InternalEObject)mandatoryCourse).eInverseRemove(this, RaPackage.MANDATORY_COURSE__SEMESTER, MandatoryCourse.class, msgs);
			if (newMandatoryCourse != null)
				msgs = ((InternalEObject)newMandatoryCourse).eInverseAdd(this, RaPackage.MANDATORY_COURSE__SEMESTER, MandatoryCourse.class, msgs);
			msgs = basicSetMandatoryCourse(newMandatoryCourse, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RaPackage.SEMESTER__MANDATORY_COURSE, newMandatoryCourse, newMandatoryCourse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void computeTotalPoints(EList<Course> point) {
	
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public double getTotalPoints() {
		return 3.1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RaPackage.SEMESTER__MANDATORY_COURSE:
				if (mandatoryCourse != null)
					msgs = ((InternalEObject)mandatoryCourse).eInverseRemove(this, RaPackage.MANDATORY_COURSE__SEMESTER, MandatoryCourse.class, msgs);
				return basicSetMandatoryCourse((MandatoryCourse)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RaPackage.SEMESTER__MANDATORY_COURSE:
				return basicSetMandatoryCourse(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RaPackage.SEMESTER__SEMESTER_NUMBER:
				return getSemesterNumber();
			case RaPackage.SEMESTER__TOTAL_POINTS:
				return getTotalPoints();
			case RaPackage.SEMESTER__COURSE_SLOT:
				return getCourseSlot();
			case RaPackage.SEMESTER__MANDATORY_COURSE:
				if (resolve) return getMandatoryCourse();
				return basicGetMandatoryCourse();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RaPackage.SEMESTER__SEMESTER_NUMBER:
				setSemesterNumber((Integer)newValue);
				return;
			case RaPackage.SEMESTER__COURSE_SLOT:
				getCourseSlot().clear();
				getCourseSlot().addAll((Collection<? extends Course>)newValue);
				return;
			case RaPackage.SEMESTER__MANDATORY_COURSE:
				setMandatoryCourse((MandatoryCourse)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case RaPackage.SEMESTER__SEMESTER_NUMBER:
				setSemesterNumber(SEMESTER_NUMBER_EDEFAULT);
				return;
			case RaPackage.SEMESTER__COURSE_SLOT:
				getCourseSlot().clear();
				return;
			case RaPackage.SEMESTER__MANDATORY_COURSE:
				setMandatoryCourse((MandatoryCourse)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case RaPackage.SEMESTER__SEMESTER_NUMBER:
				return semesterNumber != SEMESTER_NUMBER_EDEFAULT;
			case RaPackage.SEMESTER__TOTAL_POINTS:
				return getTotalPoints() != TOTAL_POINTS_EDEFAULT;
			case RaPackage.SEMESTER__COURSE_SLOT:
				return courseSlot != null && !courseSlot.isEmpty();
			case RaPackage.SEMESTER__MANDATORY_COURSE:
				return mandatoryCourse != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case RaPackage.SEMESTER___COMPUTE_TOTAL_POINTS__ELIST:
				computeTotalPoints((EList<Course>)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (semesterNumber: ");
		result.append(semesterNumber);
		result.append(')');
		return result.toString();
	}
	


} //SemesterImpl
