/**
 * <copyright>
 * </copyright>
 *

 */
package org.waml.w3c.webidl.webIDL.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.waml.w3c.webidl.webIDL.Callback;
import org.waml.w3c.webidl.webIDL.WebIDLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Callback</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.waml.w3c.webidl.webIDL.impl.CallbackImpl#isFunctionOnly <em>Function Only</em>}</li>
 *   <li>{@link org.waml.w3c.webidl.webIDL.impl.CallbackImpl#isPropertyOnly <em>Property Only</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CallbackImpl extends InterfaceExtendedAttributeImpl implements Callback
{
  /**
   * The default value of the '{@link #isFunctionOnly() <em>Function Only</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isFunctionOnly()
   * @generated
   * @ordered
   */
  protected static final boolean FUNCTION_ONLY_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isFunctionOnly() <em>Function Only</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isFunctionOnly()
   * @generated
   * @ordered
   */
  protected boolean functionOnly = FUNCTION_ONLY_EDEFAULT;

  /**
   * The default value of the '{@link #isPropertyOnly() <em>Property Only</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isPropertyOnly()
   * @generated
   * @ordered
   */
  protected static final boolean PROPERTY_ONLY_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isPropertyOnly() <em>Property Only</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isPropertyOnly()
   * @generated
   * @ordered
   */
  protected boolean propertyOnly = PROPERTY_ONLY_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CallbackImpl()
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
    return WebIDLPackage.Literals.CALLBACK;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isFunctionOnly()
  {
    return functionOnly;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFunctionOnly(boolean newFunctionOnly)
  {
    boolean oldFunctionOnly = functionOnly;
    functionOnly = newFunctionOnly;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WebIDLPackage.CALLBACK__FUNCTION_ONLY, oldFunctionOnly, functionOnly));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isPropertyOnly()
  {
    return propertyOnly;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPropertyOnly(boolean newPropertyOnly)
  {
    boolean oldPropertyOnly = propertyOnly;
    propertyOnly = newPropertyOnly;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WebIDLPackage.CALLBACK__PROPERTY_ONLY, oldPropertyOnly, propertyOnly));
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
      case WebIDLPackage.CALLBACK__FUNCTION_ONLY:
        return isFunctionOnly();
      case WebIDLPackage.CALLBACK__PROPERTY_ONLY:
        return isPropertyOnly();
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
      case WebIDLPackage.CALLBACK__FUNCTION_ONLY:
        setFunctionOnly((Boolean)newValue);
        return;
      case WebIDLPackage.CALLBACK__PROPERTY_ONLY:
        setPropertyOnly((Boolean)newValue);
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
      case WebIDLPackage.CALLBACK__FUNCTION_ONLY:
        setFunctionOnly(FUNCTION_ONLY_EDEFAULT);
        return;
      case WebIDLPackage.CALLBACK__PROPERTY_ONLY:
        setPropertyOnly(PROPERTY_ONLY_EDEFAULT);
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
      case WebIDLPackage.CALLBACK__FUNCTION_ONLY:
        return functionOnly != FUNCTION_ONLY_EDEFAULT;
      case WebIDLPackage.CALLBACK__PROPERTY_ONLY:
        return propertyOnly != PROPERTY_ONLY_EDEFAULT;
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
    result.append(" (functionOnly: ");
    result.append(functionOnly);
    result.append(", propertyOnly: ");
    result.append(propertyOnly);
    result.append(')');
    return result.toString();
  }

} //CallbackImpl
