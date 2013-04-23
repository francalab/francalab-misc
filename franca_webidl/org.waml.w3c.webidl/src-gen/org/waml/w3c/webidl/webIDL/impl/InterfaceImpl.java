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
import org.waml.w3c.webidl.webIDL.Interface;
import org.waml.w3c.webidl.webIDL.InterfaceExtendedAttribute;
import org.waml.w3c.webidl.webIDL.InterfaceMember;
import org.waml.w3c.webidl.webIDL.Operation;
import org.waml.w3c.webidl.webIDL.WebIDLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.waml.w3c.webidl.webIDL.impl.InterfaceImpl#getExtendedAttributes <em>Extended Attributes</em>}</li>
 *   <li>{@link org.waml.w3c.webidl.webIDL.impl.InterfaceImpl#getExtendedAttribute <em>Extended Attribute</em>}</li>
 *   <li>{@link org.waml.w3c.webidl.webIDL.impl.InterfaceImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.waml.w3c.webidl.webIDL.impl.InterfaceImpl#getSuperType <em>Super Type</em>}</li>
 *   <li>{@link org.waml.w3c.webidl.webIDL.impl.InterfaceImpl#getMembers <em>Members</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InterfaceImpl extends TypesImpl implements Interface
{
  /**
   * The cached value of the '{@link #getExtendedAttributes() <em>Extended Attributes</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExtendedAttributes()
   * @generated
   * @ordered
   */
  protected EList<InterfaceExtendedAttribute> extendedAttributes;

  /**
   * The cached value of the '{@link #getExtendedAttribute() <em>Extended Attribute</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExtendedAttribute()
   * @generated
   * @ordered
   */
  protected EList<InterfaceExtendedAttribute> extendedAttribute;

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
   * The cached value of the '{@link #getSuperType() <em>Super Type</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSuperType()
   * @generated
   * @ordered
   */
  protected EList<Interface> superType;

  /**
   * The cached value of the '{@link #getMembers() <em>Members</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMembers()
   * @generated
   * @ordered
   */
  protected EList<InterfaceMember> members;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected InterfaceImpl()
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
    return WebIDLPackage.Literals.INTERFACE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<InterfaceExtendedAttribute> getExtendedAttributes()
  {
    if (extendedAttributes == null)
    {
      extendedAttributes = new EObjectContainmentEList<InterfaceExtendedAttribute>(InterfaceExtendedAttribute.class, this, WebIDLPackage.INTERFACE__EXTENDED_ATTRIBUTES);
    }
    return extendedAttributes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<InterfaceExtendedAttribute> getExtendedAttribute()
  {
    if (extendedAttribute == null)
    {
      extendedAttribute = new EObjectContainmentEList<InterfaceExtendedAttribute>(InterfaceExtendedAttribute.class, this, WebIDLPackage.INTERFACE__EXTENDED_ATTRIBUTE);
    }
    return extendedAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WebIDLPackage.INTERFACE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Interface> getSuperType()
  {
    if (superType == null)
    {
      superType = new EObjectResolvingEList<Interface>(Interface.class, this, WebIDLPackage.INTERFACE__SUPER_TYPE);
    }
    return superType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<InterfaceMember> getMembers()
  {
    if (members == null)
    {
      members = new EObjectContainmentEList<InterfaceMember>(InterfaceMember.class, this, WebIDLPackage.INTERFACE__MEMBERS);
    }
    return members;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Operation> getOperations()
  {
    
      EList<Operation> lResult = new org.eclipse.emf.common.util.BasicEList<Operation>();
      for(java.util.Iterator<InterfaceMember> ite=this.getMembers().iterator();ite.hasNext();)
      {
        InterfaceMember lIm = ite.next();
        if (lIm instanceof Operation)
        {
          lResult.add((Operation)lIm);
        }
      }
      return lResult;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Attribute> getAttributes()
  {
    
      EList<Attribute> lResult = new org.eclipse.emf.common.util.BasicEList<Attribute>();
      for(java.util.Iterator<InterfaceMember> ite=this.getMembers().iterator();ite.hasNext();)
      {
        InterfaceMember lIm = ite.next();
        if (lIm instanceof Attribute)
        {
          lResult.add((Attribute)lIm);
        }
      }
      return lResult;
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
      case WebIDLPackage.INTERFACE__EXTENDED_ATTRIBUTES:
        return ((InternalEList<?>)getExtendedAttributes()).basicRemove(otherEnd, msgs);
      case WebIDLPackage.INTERFACE__EXTENDED_ATTRIBUTE:
        return ((InternalEList<?>)getExtendedAttribute()).basicRemove(otherEnd, msgs);
      case WebIDLPackage.INTERFACE__MEMBERS:
        return ((InternalEList<?>)getMembers()).basicRemove(otherEnd, msgs);
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
      case WebIDLPackage.INTERFACE__EXTENDED_ATTRIBUTES:
        return getExtendedAttributes();
      case WebIDLPackage.INTERFACE__EXTENDED_ATTRIBUTE:
        return getExtendedAttribute();
      case WebIDLPackage.INTERFACE__NAME:
        return getName();
      case WebIDLPackage.INTERFACE__SUPER_TYPE:
        return getSuperType();
      case WebIDLPackage.INTERFACE__MEMBERS:
        return getMembers();
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
      case WebIDLPackage.INTERFACE__EXTENDED_ATTRIBUTES:
        getExtendedAttributes().clear();
        getExtendedAttributes().addAll((Collection<? extends InterfaceExtendedAttribute>)newValue);
        return;
      case WebIDLPackage.INTERFACE__EXTENDED_ATTRIBUTE:
        getExtendedAttribute().clear();
        getExtendedAttribute().addAll((Collection<? extends InterfaceExtendedAttribute>)newValue);
        return;
      case WebIDLPackage.INTERFACE__NAME:
        setName((String)newValue);
        return;
      case WebIDLPackage.INTERFACE__SUPER_TYPE:
        getSuperType().clear();
        getSuperType().addAll((Collection<? extends Interface>)newValue);
        return;
      case WebIDLPackage.INTERFACE__MEMBERS:
        getMembers().clear();
        getMembers().addAll((Collection<? extends InterfaceMember>)newValue);
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
      case WebIDLPackage.INTERFACE__EXTENDED_ATTRIBUTES:
        getExtendedAttributes().clear();
        return;
      case WebIDLPackage.INTERFACE__EXTENDED_ATTRIBUTE:
        getExtendedAttribute().clear();
        return;
      case WebIDLPackage.INTERFACE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case WebIDLPackage.INTERFACE__SUPER_TYPE:
        getSuperType().clear();
        return;
      case WebIDLPackage.INTERFACE__MEMBERS:
        getMembers().clear();
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
      case WebIDLPackage.INTERFACE__EXTENDED_ATTRIBUTES:
        return extendedAttributes != null && !extendedAttributes.isEmpty();
      case WebIDLPackage.INTERFACE__EXTENDED_ATTRIBUTE:
        return extendedAttribute != null && !extendedAttribute.isEmpty();
      case WebIDLPackage.INTERFACE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case WebIDLPackage.INTERFACE__SUPER_TYPE:
        return superType != null && !superType.isEmpty();
      case WebIDLPackage.INTERFACE__MEMBERS:
        return members != null && !members.isEmpty();
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
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //InterfaceImpl
