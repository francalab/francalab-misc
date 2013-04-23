/**
 * <copyright>
 * </copyright>
 *

 */
package org.waml.w3c.webidl.webIDL.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.waml.w3c.webidl.webIDL.Argument;
import org.waml.w3c.webidl.webIDL.Operation;
import org.waml.w3c.webidl.webIDL.OperationExtendedAttribute;
import org.waml.w3c.webidl.webIDL.OperationSpecial;
import org.waml.w3c.webidl.webIDL.TypeRef;
import org.waml.w3c.webidl.webIDL.WebIDLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.waml.w3c.webidl.webIDL.impl.OperationImpl#getExtendedAttributes <em>Extended Attributes</em>}</li>
 *   <li>{@link org.waml.w3c.webidl.webIDL.impl.OperationImpl#isOmittable <em>Omittable</em>}</li>
 *   <li>{@link org.waml.w3c.webidl.webIDL.impl.OperationImpl#getSpecials <em>Specials</em>}</li>
 *   <li>{@link org.waml.w3c.webidl.webIDL.impl.OperationImpl#getReturn <em>Return</em>}</li>
 *   <li>{@link org.waml.w3c.webidl.webIDL.impl.OperationImpl#getArguments <em>Arguments</em>}</li>
 *   <li>{@link org.waml.w3c.webidl.webIDL.impl.OperationImpl#getRaises <em>Raises</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OperationImpl extends InterfaceFeatureImpl implements Operation
{
  /**
   * The cached value of the '{@link #getExtendedAttributes() <em>Extended Attributes</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExtendedAttributes()
   * @generated
   * @ordered
   */
  protected EList<OperationExtendedAttribute> extendedAttributes;

  /**
   * The default value of the '{@link #isOmittable() <em>Omittable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isOmittable()
   * @generated
   * @ordered
   */
  protected static final boolean OMITTABLE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isOmittable() <em>Omittable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isOmittable()
   * @generated
   * @ordered
   */
  protected boolean omittable = OMITTABLE_EDEFAULT;

  /**
   * The cached value of the '{@link #getSpecials() <em>Specials</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSpecials()
   * @generated
   * @ordered
   */
  protected EList<OperationSpecial> specials;

  /**
   * The cached value of the '{@link #getReturn() <em>Return</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReturn()
   * @generated
   * @ordered
   */
  protected TypeRef return_;

  /**
   * The cached value of the '{@link #getArguments() <em>Arguments</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArguments()
   * @generated
   * @ordered
   */
  protected EList<Argument> arguments;

  /**
   * The cached value of the '{@link #getRaises() <em>Raises</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRaises()
   * @generated
   * @ordered
   */
  protected EList<org.waml.w3c.webidl.webIDL.Exception> raises;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected OperationImpl()
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
    return WebIDLPackage.Literals.OPERATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<OperationExtendedAttribute> getExtendedAttributes()
  {
    if (extendedAttributes == null)
    {
      extendedAttributes = new EObjectContainmentEList<OperationExtendedAttribute>(OperationExtendedAttribute.class, this, WebIDLPackage.OPERATION__EXTENDED_ATTRIBUTES);
    }
    return extendedAttributes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isOmittable()
  {
    return omittable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOmittable(boolean newOmittable)
  {
    boolean oldOmittable = omittable;
    omittable = newOmittable;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WebIDLPackage.OPERATION__OMITTABLE, oldOmittable, omittable));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<OperationSpecial> getSpecials()
  {
    if (specials == null)
    {
      specials = new EObjectContainmentEList<OperationSpecial>(OperationSpecial.class, this, WebIDLPackage.OPERATION__SPECIALS);
    }
    return specials;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeRef getReturn()
  {
    return return_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetReturn(TypeRef newReturn, NotificationChain msgs)
  {
    TypeRef oldReturn = return_;
    return_ = newReturn;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WebIDLPackage.OPERATION__RETURN, oldReturn, newReturn);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReturn(TypeRef newReturn)
  {
    if (newReturn != return_)
    {
      NotificationChain msgs = null;
      if (return_ != null)
        msgs = ((InternalEObject)return_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WebIDLPackage.OPERATION__RETURN, null, msgs);
      if (newReturn != null)
        msgs = ((InternalEObject)newReturn).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WebIDLPackage.OPERATION__RETURN, null, msgs);
      msgs = basicSetReturn(newReturn, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WebIDLPackage.OPERATION__RETURN, newReturn, newReturn));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Argument> getArguments()
  {
    if (arguments == null)
    {
      arguments = new EObjectContainmentEList<Argument>(Argument.class, this, WebIDLPackage.OPERATION__ARGUMENTS);
    }
    return arguments;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<org.waml.w3c.webidl.webIDL.Exception> getRaises()
  {
    if (raises == null)
    {
      raises = new EObjectResolvingEList<org.waml.w3c.webidl.webIDL.Exception>(org.waml.w3c.webidl.webIDL.Exception.class, this, WebIDLPackage.OPERATION__RAISES);
    }
    return raises;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case WebIDLPackage.OPERATION__EXTENDED_ATTRIBUTES:
        return ((InternalEList<?>)getExtendedAttributes()).basicRemove(otherEnd, msgs);
      case WebIDLPackage.OPERATION__SPECIALS:
        return ((InternalEList<?>)getSpecials()).basicRemove(otherEnd, msgs);
      case WebIDLPackage.OPERATION__RETURN:
        return basicSetReturn(null, msgs);
      case WebIDLPackage.OPERATION__ARGUMENTS:
        return ((InternalEList<?>)getArguments()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case WebIDLPackage.OPERATION__EXTENDED_ATTRIBUTES:
        return getExtendedAttributes();
      case WebIDLPackage.OPERATION__OMITTABLE:
        return isOmittable();
      case WebIDLPackage.OPERATION__SPECIALS:
        return getSpecials();
      case WebIDLPackage.OPERATION__RETURN:
        return getReturn();
      case WebIDLPackage.OPERATION__ARGUMENTS:
        return getArguments();
      case WebIDLPackage.OPERATION__RAISES:
        return getRaises();
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
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case WebIDLPackage.OPERATION__EXTENDED_ATTRIBUTES:
        getExtendedAttributes().clear();
        getExtendedAttributes().addAll((Collection<? extends OperationExtendedAttribute>)newValue);
        return;
      case WebIDLPackage.OPERATION__OMITTABLE:
        setOmittable((Boolean)newValue);
        return;
      case WebIDLPackage.OPERATION__SPECIALS:
        getSpecials().clear();
        getSpecials().addAll((Collection<? extends OperationSpecial>)newValue);
        return;
      case WebIDLPackage.OPERATION__RETURN:
        setReturn((TypeRef)newValue);
        return;
      case WebIDLPackage.OPERATION__ARGUMENTS:
        getArguments().clear();
        getArguments().addAll((Collection<? extends Argument>)newValue);
        return;
      case WebIDLPackage.OPERATION__RAISES:
        getRaises().clear();
        getRaises().addAll((Collection<? extends org.waml.w3c.webidl.webIDL.Exception>)newValue);
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
      case WebIDLPackage.OPERATION__EXTENDED_ATTRIBUTES:
        getExtendedAttributes().clear();
        return;
      case WebIDLPackage.OPERATION__OMITTABLE:
        setOmittable(OMITTABLE_EDEFAULT);
        return;
      case WebIDLPackage.OPERATION__SPECIALS:
        getSpecials().clear();
        return;
      case WebIDLPackage.OPERATION__RETURN:
        setReturn((TypeRef)null);
        return;
      case WebIDLPackage.OPERATION__ARGUMENTS:
        getArguments().clear();
        return;
      case WebIDLPackage.OPERATION__RAISES:
        getRaises().clear();
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
      case WebIDLPackage.OPERATION__EXTENDED_ATTRIBUTES:
        return extendedAttributes != null && !extendedAttributes.isEmpty();
      case WebIDLPackage.OPERATION__OMITTABLE:
        return omittable != OMITTABLE_EDEFAULT;
      case WebIDLPackage.OPERATION__SPECIALS:
        return specials != null && !specials.isEmpty();
      case WebIDLPackage.OPERATION__RETURN:
        return return_ != null;
      case WebIDLPackage.OPERATION__ARGUMENTS:
        return arguments != null && !arguments.isEmpty();
      case WebIDLPackage.OPERATION__RAISES:
        return raises != null && !raises.isEmpty();
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
    result.append(" (omittable: ");
    result.append(omittable);
    result.append(')');
    return result.toString();
  }

} //OperationImpl
