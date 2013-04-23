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

import org.waml.w3c.webidl.webIDL.Attribute;
import org.waml.w3c.webidl.webIDL.AttributeExtendedAttribute;
import org.waml.w3c.webidl.webIDL.TypeRef;
import org.waml.w3c.webidl.webIDL.WebIDLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.waml.w3c.webidl.webIDL.impl.AttributeImpl#getExtendedAttributes <em>Extended Attributes</em>}</li>
 *   <li>{@link org.waml.w3c.webidl.webIDL.impl.AttributeImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.waml.w3c.webidl.webIDL.impl.AttributeImpl#getGetRaises <em>Get Raises</em>}</li>
 *   <li>{@link org.waml.w3c.webidl.webIDL.impl.AttributeImpl#getSetRaises <em>Set Raises</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AttributeImpl extends InterfaceFeatureImpl implements Attribute
{
  /**
   * The cached value of the '{@link #getExtendedAttributes() <em>Extended Attributes</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExtendedAttributes()
   * @generated
   * @ordered
   */
  protected EList<AttributeExtendedAttribute> extendedAttributes;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected TypeRef type;

  /**
   * The cached value of the '{@link #getGetRaises() <em>Get Raises</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGetRaises()
   * @generated
   * @ordered
   */
  protected EList<org.waml.w3c.webidl.webIDL.Exception> getRaises;

  /**
   * The cached value of the '{@link #getSetRaises() <em>Set Raises</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSetRaises()
   * @generated
   * @ordered
   */
  protected EList<org.waml.w3c.webidl.webIDL.Exception> setRaises;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AttributeImpl()
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
    return WebIDLPackage.Literals.ATTRIBUTE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<AttributeExtendedAttribute> getExtendedAttributes()
  {
    if (extendedAttributes == null)
    {
      extendedAttributes = new EObjectContainmentEList<AttributeExtendedAttribute>(AttributeExtendedAttribute.class, this, WebIDLPackage.ATTRIBUTE__EXTENDED_ATTRIBUTES);
    }
    return extendedAttributes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeRef getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetType(TypeRef newType, NotificationChain msgs)
  {
    TypeRef oldType = type;
    type = newType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WebIDLPackage.ATTRIBUTE__TYPE, oldType, newType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(TypeRef newType)
  {
    if (newType != type)
    {
      NotificationChain msgs = null;
      if (type != null)
        msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WebIDLPackage.ATTRIBUTE__TYPE, null, msgs);
      if (newType != null)
        msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WebIDLPackage.ATTRIBUTE__TYPE, null, msgs);
      msgs = basicSetType(newType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WebIDLPackage.ATTRIBUTE__TYPE, newType, newType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<org.waml.w3c.webidl.webIDL.Exception> getGetRaises()
  {
    if (getRaises == null)
    {
      getRaises = new EObjectResolvingEList<org.waml.w3c.webidl.webIDL.Exception>(org.waml.w3c.webidl.webIDL.Exception.class, this, WebIDLPackage.ATTRIBUTE__GET_RAISES);
    }
    return getRaises;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<org.waml.w3c.webidl.webIDL.Exception> getSetRaises()
  {
    if (setRaises == null)
    {
      setRaises = new EObjectResolvingEList<org.waml.w3c.webidl.webIDL.Exception>(org.waml.w3c.webidl.webIDL.Exception.class, this, WebIDLPackage.ATTRIBUTE__SET_RAISES);
    }
    return setRaises;
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
      case WebIDLPackage.ATTRIBUTE__EXTENDED_ATTRIBUTES:
        return ((InternalEList<?>)getExtendedAttributes()).basicRemove(otherEnd, msgs);
      case WebIDLPackage.ATTRIBUTE__TYPE:
        return basicSetType(null, msgs);
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
      case WebIDLPackage.ATTRIBUTE__EXTENDED_ATTRIBUTES:
        return getExtendedAttributes();
      case WebIDLPackage.ATTRIBUTE__TYPE:
        return getType();
      case WebIDLPackage.ATTRIBUTE__GET_RAISES:
        return getGetRaises();
      case WebIDLPackage.ATTRIBUTE__SET_RAISES:
        return getSetRaises();
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
      case WebIDLPackage.ATTRIBUTE__EXTENDED_ATTRIBUTES:
        getExtendedAttributes().clear();
        getExtendedAttributes().addAll((Collection<? extends AttributeExtendedAttribute>)newValue);
        return;
      case WebIDLPackage.ATTRIBUTE__TYPE:
        setType((TypeRef)newValue);
        return;
      case WebIDLPackage.ATTRIBUTE__GET_RAISES:
        getGetRaises().clear();
        getGetRaises().addAll((Collection<? extends org.waml.w3c.webidl.webIDL.Exception>)newValue);
        return;
      case WebIDLPackage.ATTRIBUTE__SET_RAISES:
        getSetRaises().clear();
        getSetRaises().addAll((Collection<? extends org.waml.w3c.webidl.webIDL.Exception>)newValue);
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
      case WebIDLPackage.ATTRIBUTE__EXTENDED_ATTRIBUTES:
        getExtendedAttributes().clear();
        return;
      case WebIDLPackage.ATTRIBUTE__TYPE:
        setType((TypeRef)null);
        return;
      case WebIDLPackage.ATTRIBUTE__GET_RAISES:
        getGetRaises().clear();
        return;
      case WebIDLPackage.ATTRIBUTE__SET_RAISES:
        getSetRaises().clear();
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
      case WebIDLPackage.ATTRIBUTE__EXTENDED_ATTRIBUTES:
        return extendedAttributes != null && !extendedAttributes.isEmpty();
      case WebIDLPackage.ATTRIBUTE__TYPE:
        return type != null;
      case WebIDLPackage.ATTRIBUTE__GET_RAISES:
        return getRaises != null && !getRaises.isEmpty();
      case WebIDLPackage.ATTRIBUTE__SET_RAISES:
        return setRaises != null && !setRaises.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //AttributeImpl
