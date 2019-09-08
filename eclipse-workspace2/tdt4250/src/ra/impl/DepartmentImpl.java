/**
 */
package ra.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import ra.Course;
import ra.Department;
import ra.Programme;
import ra.RaPackage;
import ra.Specialization;
import ra.StudyPlan;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Department</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ra.impl.DepartmentImpl#getProgramme <em>Programme</em>}</li>
 *   <li>{@link ra.impl.DepartmentImpl#getCourse <em>Course</em>}</li>
 *   <li>{@link ra.impl.DepartmentImpl#getStudyPlan <em>Study Plan</em>}</li>
 *   <li>{@link ra.impl.DepartmentImpl#getSpesialization <em>Spesialization</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DepartmentImpl extends MinimalEObjectImpl.Container implements Department {
	/**
	 * The cached value of the '{@link #getProgramme() <em>Programme</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgramme()
	 * @generated
	 * @ordered
	 */
	protected EList<Programme> programme;

	/**
	 * The cached value of the '{@link #getCourse() <em>Course</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCourse()
	 * @generated
	 * @ordered
	 */
	protected EList<Course> course;

	/**
	 * The cached value of the '{@link #getStudyPlan() <em>Study Plan</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStudyPlan()
	 * @generated
	 * @ordered
	 */
	protected StudyPlan studyPlan;

	/**
	 * The cached value of the '{@link #getSpesialization() <em>Spesialization</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpesialization()
	 * @generated
	 * @ordered
	 */
	protected Specialization spesialization;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DepartmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RaPackage.Literals.DEPARTMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Programme> getProgramme() {
		if (programme == null) {
			programme = new EObjectContainmentEList<Programme>(Programme.class, this, RaPackage.DEPARTMENT__PROGRAMME);
		}
		return programme;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Course> getCourse() {
		if (course == null) {
			course = new EObjectContainmentEList<Course>(Course.class, this, RaPackage.DEPARTMENT__COURSE);
		}
		return course;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StudyPlan getStudyPlan() {
		return studyPlan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStudyPlan(StudyPlan newStudyPlan, NotificationChain msgs) {
		StudyPlan oldStudyPlan = studyPlan;
		studyPlan = newStudyPlan;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RaPackage.DEPARTMENT__STUDY_PLAN, oldStudyPlan, newStudyPlan);
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
	public void setStudyPlan(StudyPlan newStudyPlan) {
		if (newStudyPlan != studyPlan) {
			NotificationChain msgs = null;
			if (studyPlan != null)
				msgs = ((InternalEObject)studyPlan).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RaPackage.DEPARTMENT__STUDY_PLAN, null, msgs);
			if (newStudyPlan != null)
				msgs = ((InternalEObject)newStudyPlan).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RaPackage.DEPARTMENT__STUDY_PLAN, null, msgs);
			msgs = basicSetStudyPlan(newStudyPlan, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RaPackage.DEPARTMENT__STUDY_PLAN, newStudyPlan, newStudyPlan));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Specialization getSpesialization() {
		return spesialization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpesialization(Specialization newSpesialization, NotificationChain msgs) {
		Specialization oldSpesialization = spesialization;
		spesialization = newSpesialization;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RaPackage.DEPARTMENT__SPESIALIZATION, oldSpesialization, newSpesialization);
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
	public void setSpesialization(Specialization newSpesialization) {
		if (newSpesialization != spesialization) {
			NotificationChain msgs = null;
			if (spesialization != null)
				msgs = ((InternalEObject)spesialization).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RaPackage.DEPARTMENT__SPESIALIZATION, null, msgs);
			if (newSpesialization != null)
				msgs = ((InternalEObject)newSpesialization).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RaPackage.DEPARTMENT__SPESIALIZATION, null, msgs);
			msgs = basicSetSpesialization(newSpesialization, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RaPackage.DEPARTMENT__SPESIALIZATION, newSpesialization, newSpesialization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RaPackage.DEPARTMENT__PROGRAMME:
				return ((InternalEList<?>)getProgramme()).basicRemove(otherEnd, msgs);
			case RaPackage.DEPARTMENT__COURSE:
				return ((InternalEList<?>)getCourse()).basicRemove(otherEnd, msgs);
			case RaPackage.DEPARTMENT__STUDY_PLAN:
				return basicSetStudyPlan(null, msgs);
			case RaPackage.DEPARTMENT__SPESIALIZATION:
				return basicSetSpesialization(null, msgs);
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
			case RaPackage.DEPARTMENT__PROGRAMME:
				return getProgramme();
			case RaPackage.DEPARTMENT__COURSE:
				return getCourse();
			case RaPackage.DEPARTMENT__STUDY_PLAN:
				return getStudyPlan();
			case RaPackage.DEPARTMENT__SPESIALIZATION:
				return getSpesialization();
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
			case RaPackage.DEPARTMENT__PROGRAMME:
				getProgramme().clear();
				getProgramme().addAll((Collection<? extends Programme>)newValue);
				return;
			case RaPackage.DEPARTMENT__COURSE:
				getCourse().clear();
				getCourse().addAll((Collection<? extends Course>)newValue);
				return;
			case RaPackage.DEPARTMENT__STUDY_PLAN:
				setStudyPlan((StudyPlan)newValue);
				return;
			case RaPackage.DEPARTMENT__SPESIALIZATION:
				setSpesialization((Specialization)newValue);
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
			case RaPackage.DEPARTMENT__PROGRAMME:
				getProgramme().clear();
				return;
			case RaPackage.DEPARTMENT__COURSE:
				getCourse().clear();
				return;
			case RaPackage.DEPARTMENT__STUDY_PLAN:
				setStudyPlan((StudyPlan)null);
				return;
			case RaPackage.DEPARTMENT__SPESIALIZATION:
				setSpesialization((Specialization)null);
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
			case RaPackage.DEPARTMENT__PROGRAMME:
				return programme != null && !programme.isEmpty();
			case RaPackage.DEPARTMENT__COURSE:
				return course != null && !course.isEmpty();
			case RaPackage.DEPARTMENT__STUDY_PLAN:
				return studyPlan != null;
			case RaPackage.DEPARTMENT__SPESIALIZATION:
				return spesialization != null;
		}
		return super.eIsSet(featureID);
	}

} //DepartmentImpl
