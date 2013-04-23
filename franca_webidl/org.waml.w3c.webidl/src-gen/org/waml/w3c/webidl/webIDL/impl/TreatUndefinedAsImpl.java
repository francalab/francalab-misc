/**
 * <copyright>
 * </copyright>
 *

 */
package org.waml.w3c.webidl.webIDL.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.waml.w3c.webidl.webIDL.TreatUndefinedAs;
import org.waml.w3c.webidl.webIDL.WebIDLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Treat Undefined As</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.waml.w3c.webidl.webIDL.impl.TreatUndefinedAsImpl#isAsEmptyString <em>As Empty String</em>}</li>
 *   <li>{@link org.waml.w3c.webidl.webIDL.impl.TreatUndefinedAsImpl#isAsNull <em>As Null</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TreatUndefinedAsImpl extends OperationExtendedAttributeImpl implements TreatUndefinedAs
{
  /**
   * The default value of the '{@link #isAsEmptyString() <em>As Empty String</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isAsEmptyString()
   * @generated
   * @ordered
   */
  protected static final boolean AS_EMPTY_STRING_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isAsEmptyString() <em>As Empty String</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isAsEmptyString()
   * @generated
   * @ordered
   */
  protected boolean asEmptyString = AS_EMPTY_STRING_EDEFAULT;

  /**
   * The default value of the '{@link #isAsNull() <em>As Null</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isAsNull()
   * @generated
   * @ordered
   */
  protected static final boolean AS_NULL_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isAsNull() <em>As Null</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isAsNull()
   * @generated
   * @ordered
   */
  protected boolean asNull = AS_NULL_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TreatUndefinedAsImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return WebIDLPackage.Literals.TREAT_UNDEFINED_AS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isAsEmptyString()
  {
    return asEmptyString;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAsEmptyString(boolean newAsEmptyString)
  {
    boolean oldAsEmptyString = asEmptyString;
    asEmptyString = newAsEmptyString;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WebIDLPackage.TREAT_UNDEFINED_AS__AS_EMPTY_STRING, oldAsEmptyString, asEmptyString));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isAsNull()
  {
    return asNull;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAsNull(boolean newAsNull)
  {
    boolean oldAsNull = asNull;
    asNull = newAsNull;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WebIDLPackage.TREAT_UNDEFINED_AS__AS_NULL, oldAsNull, asNull));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case WebIDLPackage.TREAT_UNDEFINED_AS__AS_EMPTY_STRING:
        return isAsEmptyString();
      case WebIDLPackage.TREAT_UNDEFINED_AS__AS_NULL:
        return isAsNull();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case WebIDLPackage.TREAT_UNDEFINED_AS__AS_EMPTY_STRING:
        setAsEmptyString((Boolean)newValue);
        return;
      case WebIDLPackage.TREAT_UNDEFINED_AS__AS_NULL:
        setAsNull((Boolean)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case WebIDLPackage.TREAT_UNDEFINED_AS__AS_EMPTY_STRING:
        setAsEmptyString(AS_EMPTY_STRING_EDEFAULT);
        return;
      case WebIDLPackage.TREAT_UNDEFINED_AS__AS_NULL:
        setAsNull(AS_NULL_EDEFAULT);
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case WebIDLPackage.TREAT_UNDEFINED_AS__AS_EMPTY_STRING:
        return asEmptyString != AS_EMPTY_STRING_EDEFAULT;
      case WebIDLPackage.TREAT_UNDEFINED_AS__AS_NULL:
        return asNull != AS_NULL_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (asEmptyString: ");
    result.append(asEmptyString);
    result.append(", asNull: ");
    result.append(asNull);
    result.append(')');
    return result.toString();
  }

} //TreatUndefinedAsImpl
