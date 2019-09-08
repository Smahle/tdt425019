/**
 */
package ra.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import ra.Course;
import ra.MandatoryCourse;
import ra.RaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Course</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ra.impl.CourseImpl#getName <em>Name</em>}</li>
 *   <li>{@link ra.impl.CourseImpl#getCode <em>Code</em>}</li>
 *   <li>{@link ra.impl.CourseImpl#getMandatoryCourse <em>Mandatory Course</em>}</li>
 *   <li>{@link ra.impl.CourseImpl#getCredit <em>Credit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CourseImpl extends MinimalEObjectImpl.Container implements Course {
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
	 * The default value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected static final String CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected String code = CODE_EDEFAULT;

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
	 * The default value of the '{@link #getCredit() <em>Credit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCredit()
	 * @generated
	 * @ordered
	 */
	protected static final double CREDIT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getCredit() <em>Credit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCredit()
	 * @generated
	 * @ordered
	 */
	protected double credit = CREDIT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CourseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RaPackage.Literals.COURSE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, RaPackage.COURSE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCode() {
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCode(String newCode) {
		String oldCode = code;
		code = newCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RaPackage.COURSE__CODE, oldCode, code));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RaPackage.COURSE__MANDATORY_COURSE, oldMandatoryCourse, mandatoryCourse));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RaPackage.COURSE__MANDATORY_COURSE, oldMandatoryCourse, newMandatoryCourse);
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
				msgs = ((InternalEObject)mandatoryCourse).eInverseRemove(this, RaPackage.MANDATORY_COURSE__COURSE, MandatoryCourse.class, msgs);
			if (newMandatoryCourse != null)
				msgs = ((InternalEObject)newMandatoryCourse).eInverseAdd(this, RaPackage.MANDATORY_COURSE__COURSE, MandatoryCourse.class, msgs);
			msgs = basicSetMandatoryCourse(newMandatoryCourse, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RaPackage.COURSE__MANDATORY_COURSE, newMandatoryCourse, newMandatoryCourse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getCredit() {
		return credit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCredit(double newCredit) {
		double oldCredit = credit;
		credit = newCredit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RaPackage.COURSE__CREDIT, oldCredit, credit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RaPackage.COURSE__MANDATORY_COURSE:
				if (mandatoryCourse != null)
					msgs = ((InternalEObject)mandatoryCourse).eInverseRemove(this, RaPackage.MANDATORY_COURSE__COURSE, MandatoryCourse.class, msgs);
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
			case RaPackage.COURSE__MANDATORY_COURSE:
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
			case RaPackage.COURSE__NAME:
				return getName();
			case RaPackage.COURSE__CODE:
				return getCode();
			case RaPackage.COURSE__MANDATORY_COURSE:
				if (resolve) return getMandatoryCourse();
				return basicGetMandatoryCourse();
			case RaPackage.COURSE__CREDIT:
				return getCredit();
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
			case RaPackage.COURSE__NAME:
				setName((String)newValue);
				return;
			case RaPackage.COURSE__CODE:
				setCode((String)newValue);
				return;
			case RaPackage.COURSE__MANDATORY_COURSE:
				setMandatoryCourse((MandatoryCourse)newValue);
				return;
			case RaPackage.COURSE__CREDIT:
				setCredit((Double)newValue);
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
			case RaPackage.COURSE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RaPackage.COURSE__CODE:
				setCode(CODE_EDEFAULT);
				return;
			case RaPackage.COURSE__MANDATORY_COURSE:
				setMandatoryCourse((MandatoryCourse)null);
				return;
			case RaPackage.COURSE__CREDIT:
				setCredit(CREDIT_EDEFAULT);
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
			case RaPackage.COURSE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RaPackage.COURSE__CODE:
				return CODE_EDEFAULT == null ? code != null : !CODE_EDEFAULT.equals(code);
			case RaPackage.COURSE__MANDATORY_COURSE:
				return mandatoryCourse != null;
			case RaPackage.COURSE__CREDIT:
				return credit != CREDIT_EDEFAULT;
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
		result.append(", code: ");
		result.append(code);
		result.append(", credit: ");
		result.append(credit);
		result.append(')');
		return result.toString();
	}

} //CourseImpl
