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
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.waml.w3c.webidl.webIDL.Argument;
import org.waml.w3c.webidl.webIDL.ArgumentExtendedAttribute;
import org.waml.w3c.webidl.webIDL.TypeRef;
import org.waml.w3c.webidl.webIDL.WebIDLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Argument</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.waml.w3c.webidl.webIDL.impl.ArgumentImpl#getExtendedAttributes <em>Extended Attributes</em>}</li>
 *   <li>{@link org.waml.w3c.webidl.webIDL.impl.ArgumentImpl#isIn <em>In</em>}</li>
 *   <li>{@link org.waml.w3c.webidl.webIDL.impl.ArgumentImpl#isOptional <em>Optional</em>}</li>
 *   <li>{@link org.waml.w3c.webidl.webIDL.impl.ArgumentImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.waml.w3c.webidl.webIDL.impl.ArgumentImpl#isEllipsis <em>Ellipsis</em>}</li>
 *   <li>{@link org.waml.w3c.webidl.webIDL.impl.ArgumentImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ArgumentImpl extends MinimalEObjectImpl.Container implements Argument
{
  /**
   * The cached value of the '{@link #getExtendedAttributes() <em>Extended Attributes</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExtendedAttributes()
   * @generated
   * @ordered
   */
  protected EList<ArgumentExtendedAttribute> extendedAttributes;

  /**
   * The default value of the '{@link #isIn() <em>In</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIn()
   * @generated
   * @ordered
   */
  protected static final boolean IN_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isIn() <em>In</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIn()
   * @generated
   * @ordered
   */
  protected boolean in = IN_EDEFAULT;

  /**
   * The default value of the '{@link #isOptional() <em>Optional</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isOptional()
   * @generated
   * @ordered
   */
  protected static final boolean OPTIONAL_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isOptional() <em>Optional</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isOptional()
   * @generated
   * @ordered
   */
  protected boolean optional = OPTIONAL_EDEFAULT;

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
   * The default value of the '{@link #isEllipsis() <em>Ellipsis</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isEllipsis()
   * @generated
   * @ordered
   */
  protected static final boolean ELLIPSIS_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isEllipsis() <em>Ellipsis</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isEllipsis()
   * @generated
   * @ordered
   */
  protected boolean ellipsis = ELLIPSIS_EDEFAULT;

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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ArgumentImpl()
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
    return WebIDLPackage.Literals.ARGUMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ArgumentExtendedAttribute> getExtendedAttributes()
  {
    if (extendedAttributes == null)
    {
      extendedAttributes = new EObjectContainmentEList<ArgumentExtendedAttribute>(ArgumentExtendedAttribute.class, this, WebIDLPackage.ARGUMENT__EXTENDED_ATTRIBUTES);
    }
    return extendedAttributes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isIn()
  {
    return in;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIn(boolean newIn)
  {
    boolean oldIn = in;
    in = newIn;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WebIDLPackage.ARGUMENT__IN, oldIn, in));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isOptional()
  {
    return optional;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOptional(boolean newOptional)
  {
    boolean oldOptional = optional;
    optional = newOptional;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WebIDLPackage.ARGUMENT__OPTIONAL, oldOptional, optional));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WebIDLPackage.ARGUMENT__TYPE, oldType, newType);
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
        msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WebIDLPackage.ARGUMENT__TYPE, null, msgs);
      if (newType != null)
        msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WebIDLPackage.ARGUMENT__TYPE, null, msgs);
      msgs = basicSetType(newType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WebIDLPackage.ARGUMENT__TYPE, newType, newType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isEllipsis()
  {
    return ellipsis;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEllipsis(boolean newEllipsis)
  {
    boolean oldEllipsis = ellipsis;
    ellipsis = newEllipsis;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WebIDLPackage.ARGUMENT__ELLIPSIS, oldEllipsis, ellipsis));
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
      eNotify(new ENotificationImpl(this, Notification.SET, WebIDLPackage.ARGUMENT__NAME, oldName, name));
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
      case WebIDLPackage.ARGUMENT__EXTENDED_ATTRIBUTES:
        return ((InternalEList<?>)getExtendedAttributes()).basicRemove(otherEnd, msgs);
      case WebIDLPackage.ARGUMENT__TYPE:
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
      case WebIDLPackage.ARGUMENT__EXTENDED_ATTRIBUTES:
        return getExtendedAttributes();
      case WebIDLPackage.ARGUMENT__IN:
        return isIn();
      case WebIDLPackage.ARGUMENT__OPTIONAL:
        return isOptional();
      case WebIDLPackage.ARGUMENT__TYPE:
        return getType();
      case WebIDLPackage.ARGUMENT__ELLIPSIS:
        return isEllipsis();
      case WebIDLPackage.ARGUMENT__NAME:
        return getName();
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
      case WebIDLPackage.ARGUMENT__EXTENDED_ATTRIBUTES:
        getExtendedAttributes().clear();
        getExtendedAttributes().addAll((Collection<? extends ArgumentExtendedAttribute>)newValue);
        return;
      case WebIDLPackage.ARGUMENT__IN:
        setIn((Boolean)newValue);
        return;
      case WebIDLPackage.ARGUMENT__OPTIONAL:
        setOptional((Boolean)newValue);
        return;
      case WebIDLPackage.ARGUMENT__TYPE:
        setType((TypeRef)newValue);
        return;
      case WebIDLPackage.ARGUMENT__ELLIPSIS:
        setEllipsis((Boolean)newValue);
        return;
      case WebIDLPackage.ARGUMENT__NAME:
        setName((String)newValue);
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
      case WebIDLPackage.ARGUMENT__EXTENDED_ATTRIBUTES:
        getExtendedAttributes().clear();
        return;
      case WebIDLPackage.ARGUMENT__IN:
        setIn(IN_EDEFAULT);
        return;
      case WebIDLPackage.ARGUMENT__OPTIONAL:
        setOptional(OPTIONAL_EDEFAULT);
        return;
      case WebIDLPackage.ARGUMENT__TYPE:
        setType((TypeRef)null);
        return;
      case WebIDLPackage.ARGUMENT__ELLIPSIS:
        setEllipsis(ELLIPSIS_EDEFAULT);
        return;
      case WebIDLPackage.ARGUMENT__NAME:
        setName(NAME_EDEFAULT);
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
      case WebIDLPackage.ARGUMENT__EXTENDED_ATTRIBUTES:
        return extendedAttributes != null && !extendedAttributes.isEmpty();
      case WebIDLPackage.ARGUMENT__IN:
        return in != IN_EDEFAULT;
      case WebIDLPackage.ARGUMENT__OPTIONAL:
        return optional != OPTIONAL_EDEFAULT;
      case WebIDLPackage.ARGUMENT__TYPE:
        return type != null;
      case WebIDLPackage.ARGUMENT__ELLIPSIS:
        return ellipsis != ELLIPSIS_EDEFAULT;
      case WebIDLPackage.ARGUMENT__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
    result.append(" (in: ");
    result.append(in);
    result.append(", optional: ");
    result.append(optional);
    result.append(", ellipsis: ");
    result.append(ellipsis);
    result.append(", name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //ArgumentImpl
