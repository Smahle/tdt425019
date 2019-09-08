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

import ra.MandatoryCourse;
import ra.Programme;
import ra.RaPackage;
import ra.Semester;
import ra.Specialization;
import ra.StudyPlan;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Study Plan</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ra.impl.StudyPlanImpl#getProgramme <em>Programme</em>}</li>
 *   <li>{@link ra.impl.StudyPlanImpl#getSpesialization <em>Spesialization</em>}</li>
 *   <li>{@link ra.impl.StudyPlanImpl#getSemester <em>Semester</em>}</li>
 *   <li>{@link ra.impl.StudyPlanImpl#getMandatoryCourse <em>Mandatory Course</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StudyPlanImpl extends MinimalEObjectImpl.Container implements StudyPlan {
	/**
	 * The cached value of the '{@link #getProgramme() <em>Programme</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgramme()
	 * @generated
	 * @ordered
	 */
	protected Programme programme;

	/**
	 * The cached value of the '{@link #getSpesialization() <em>Spesialization</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpesialization()
	 * @generated
	 * @ordered
	 */
	protected EList<Specialization> spesialization;

	/**
	 * The cached value of the '{@link #getSemester() <em>Semester</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemester()
	 * @generated
	 * @ordered
	 */
	protected EList<Semester> semester;

	/**
	 * The cached value of the '{@link #getMandatoryCourse() <em>Mandatory Course</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMandatoryCourse()
	 * @generated
	 * @ordered
	 */
	protected EList<MandatoryCourse> mandatoryCourse;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StudyPlanImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RaPackage.Literals.STUDY_PLAN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Programme getProgramme() {
		if (programme != null && programme.eIsProxy()) {
			InternalEObject oldProgramme = (InternalEObject)programme;
			programme = (Programme)eResolveProxy(oldProgramme);
			if (programme != oldProgramme) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RaPackage.STUDY_PLAN__PROGRAMME, oldProgramme, programme));
			}
		}
		return programme;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Programme basicGetProgramme() {
		return programme;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProgramme(Programme newProgramme) {
		Programme oldProgramme = programme;
		programme = newProgramme;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RaPackage.STUDY_PLAN__PROGRAMME, oldProgramme, programme));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Specialization> getSpesialization() {
		if (spesialization == null) {
			spesialization = new EObjectContainmentEList<Specialization>(Specialization.class, this, RaPackage.STUDY_PLAN__SPESIALIZATION);
		}
		return spesialization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Semester> getSemester() {
		if (semester == null) {
			semester = new EObjectContainmentEList<Semester>(Semester.class, this, RaPackage.STUDY_PLAN__SEMESTER);
		}
		return semester;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MandatoryCourse> getMandatoryCourse() {
		if (mandatoryCourse == null) {
			mandatoryCourse = new EObjectContainmentEList<MandatoryCourse>(MandatoryCourse.class, this, RaPackage.STUDY_PLAN__MANDATORY_COURSE);
		}
		return mandatoryCourse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RaPackage.STUDY_PLAN__SPESIALIZATION:
				return ((InternalEList<?>)getSpesialization()).basicRemove(otherEnd, msgs);
			case RaPackage.STUDY_PLAN__SEMESTER:
				return ((InternalEList<?>)getSemester()).basicRemove(otherEnd, msgs);
			case RaPackage.STUDY_PLAN__MANDATORY_COURSE:
				return ((InternalEList<?>)getMandatoryCourse()).basicRemove(otherEnd, msgs);
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
			case RaPackage.STUDY_PLAN__PROGRAMME:
				if (resolve) return getProgramme();
				return basicGetProgramme();
			case RaPackage.STUDY_PLAN__SPESIALIZATION:
				return getSpesialization();
			case RaPackage.STUDY_PLAN__SEMESTER:
				return getSemester();
			case RaPackage.STUDY_PLAN__MANDATORY_COURSE:
				return getMandatoryCourse();
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
			case RaPackage.STUDY_PLAN__PROGRAMME:
				setProgramme((Programme)newValue);
				return;
			case RaPackage.STUDY_PLAN__SPESIALIZATION:
				getSpesialization().clear();
				getSpesialization().addAll((Collection<? extends Specialization>)newValue);
				return;
			case RaPackage.STUDY_PLAN__SEMESTER:
				getSemester().clear();
				getSemester().addAll((Collection<? extends Semester>)newValue);
				return;
			case RaPackage.STUDY_PLAN__MANDATORY_COURSE:
				getMandatoryCourse().clear();
				getMandatoryCourse().addAll((Collection<? extends MandatoryCourse>)newValue);
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
			case RaPackage.STUDY_PLAN__PROGRAMME:
				setProgramme((Programme)null);
				return;
			case RaPackage.STUDY_PLAN__SPESIALIZATION:
				getSpesialization().clear();
				return;
			case RaPackage.STUDY_PLAN__SEMESTER:
				getSemester().clear();
				return;
			case RaPackage.STUDY_PLAN__MANDATORY_COURSE:
				getMandatoryCourse().clear();
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
			case RaPackage.STUDY_PLAN__PROGRAMME:
				return programme != null;
			case RaPackage.STUDY_PLAN__SPESIALIZATION:
				return spesialization != null && !spesialization.isEmpty();
			case RaPackage.STUDY_PLAN__SEMESTER:
				return semester != null && !semester.isEmpty();
			case RaPackage.STUDY_PLAN__MANDATORY_COURSE:
				return mandatoryCourse != null && !mandatoryCourse.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //StudyPlanImpl
