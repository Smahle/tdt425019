/**
 */
package ra.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import ra.Programme;
import ra.RaPackage;
import ra.StudyPlan;
import ra.programmeCode;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Programme</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ra.impl.ProgrammeImpl#getName <em>Name</em>}</li>
 *   <li>{@link ra.impl.ProgrammeImpl#getMCode <em>MCode</em>}</li>
 *   <li>{@link ra.impl.ProgrammeImpl#getStudyPlan <em>Study Plan</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProgrammeImpl extends MinimalEObjectImpl.Container implements Programme {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getMCode() <em>MCode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMCode()
	 * @generated
	 * @ordered
	 */
	protected static final programmeCode MCODE_EDEFAULT = programmeCode.DATATEKNOLOGI5;

	/**
	 * The cached value of the '{@link #getMCode() <em>MCode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMCode()
	 * @generated
	 * @ordered
	 */
	protected programmeCode mCode = MCODE_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProgrammeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RaPackage.Literals.PROGRAMME;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RaPackage.PROGRAMME__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public programmeCode getMCode() {
		return mCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMCode(programmeCode newMCode) {
		programmeCode oldMCode = mCode;
		mCode = newMCode == null ? MCODE_EDEFAULT : newMCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RaPackage.PROGRAMME__MCODE, oldMCode, mCode));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RaPackage.PROGRAMME__STUDY_PLAN, oldStudyPlan, newStudyPlan);
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
				msgs = ((InternalEObject)studyPlan).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RaPackage.PROGRAMME__STUDY_PLAN, null, msgs);
			if (newStudyPlan != null)
				msgs = ((InternalEObject)newStudyPlan).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RaPackage.PROGRAMME__STUDY_PLAN, null, msgs);
			msgs = basicSetStudyPlan(newStudyPlan, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RaPackage.PROGRAMME__STUDY_PLAN, newStudyPlan, newStudyPlan));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RaPackage.PROGRAMME__STUDY_PLAN:
				return basicSetStudyPlan(null, msgs);
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
			case RaPackage.PROGRAMME__NAME:
				return getName();
			case RaPackage.PROGRAMME__MCODE:
				return getMCode();
			case RaPackage.PROGRAMME__STUDY_PLAN:
				return getStudyPlan();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RaPackage.PROGRAMME__NAME:
				setName((String)newValue);
				return;
			case RaPackage.PROGRAMME__MCODE:
				setMCode((programmeCode)newValue);
				return;
			case RaPackage.PROGRAMME__STUDY_PLAN:
				setStudyPlan((StudyPlan)newValue);
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
			case RaPackage.PROGRAMME__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RaPackage.PROGRAMME__MCODE:
				setMCode(MCODE_EDEFAULT);
				return;
			case RaPackage.PROGRAMME__STUDY_PLAN:
				setStudyPlan((StudyPlan)null);
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
			case RaPackage.PROGRAMME__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RaPackage.PROGRAMME__MCODE:
				return mCode != MCODE_EDEFAULT;
			case RaPackage.PROGRAMME__STUDY_PLAN:
				return studyPlan != null;
		}
		return super.eIsSet(featureID);
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
		result.append(" (name: ");
		result.append(name);
		result.append(", mCode: ");
		result.append(mCode);
		result.append(')');
		return result.toString();
	}

} //ProgrammeImpl
