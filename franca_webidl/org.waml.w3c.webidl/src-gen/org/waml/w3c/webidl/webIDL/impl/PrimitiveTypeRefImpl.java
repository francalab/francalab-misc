/**
 * <copyright>
 * </copyright>
 *

 */
package org.waml.w3c.webidl.webIDL.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.waml.w3c.webidl.webIDL.PrimitiveTypeRef;
import org.waml.w3c.webidl.webIDL.WebIDLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Primitive Type Ref</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.waml.w3c.webidl.webIDL.impl.PrimitiveTypeRefImpl#isUnsigned <em>Unsigned</em>}</li>
 *   <li>{@link org.waml.w3c.webidl.webIDL.impl.PrimitiveTypeRefImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.waml.w3c.webidl.webIDL.impl.PrimitiveTypeRefImpl#isNullable <em>Nullable</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PrimitiveTypeRefImpl extends TypeRefImpl implements PrimitiveTypeRef
{
  /**
   * The default value of the '{@link #isUnsigned() <em>Unsigned</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isUnsigned()
   * @generated
   * @ordered
   */
  protected static final boolean UNSIGNED_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isUnsigned() <em>Unsigned</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isUnsigned()
   * @generated
   * @ordered
   */
  protected boolean unsigned = UNSIGNED_EDEFAULT;

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
   * The default value of the '{@link #isNullable() <em>Nullable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isNullable()
   * @generated
   * @ordered
   */
  protected static final boolean NULLABLE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isNullable() <em>Nullable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isNullable()
   * @generated
   * @ordered
   */
  protected boolean nullable = NULLABLE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PrimitiveTypeRefImpl()
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
    return WebIDLPackage.Literals.PRIMITIVE_TYPE_REF;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isUnsigned()
  {
    return unsigned;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUnsigned(boolean newUnsigned)
  {
    boolean oldUnsigned = unsigned;
    unsigned = newUnsigned;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WebIDLPackage.PRIMITIVE_TYPE_REF__UNSIGNED, oldUnsigned, unsigned));
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
      eNotify(new ENotificationImpl(this, Notification.SET, WebIDLPackage.PRIMITIVE_TYPE_REF__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isNullable()
  {
    return nullable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNullable(boolean newNullable)
  {
    boolean oldNullable = nullable;
    nullable = newNullable;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WebIDLPackage.PRIMITIVE_TYPE_REF__NULLABLE, oldNullable, nullable));
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
      case WebIDLPackage.PRIMITIVE_TYPE_REF__UNSIGNED:
        return isUnsigned();
      case WebIDLPackage.PRIMITIVE_TYPE_REF__NAME:
        return getName();
      case WebIDLPackage.PRIMITIVE_TYPE_REF__NULLABLE:
        return isNullable();
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
      case WebIDLPackage.PRIMITIVE_TYPE_REF__UNSIGNED:
        setUnsigned((Boolean)newValue);
        return;
      case WebIDLPackage.PRIMITIVE_TYPE_REF__NAME:
        setName((String)newValue);
        return;
      case WebIDLPackage.PRIMITIVE_TYPE_REF__NULLABLE:
        setNullable((Boolean)newValue);
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
      case WebIDLPackage.PRIMITIVE_TYPE_REF__UNSIGNED:
        setUnsigned(UNSIGNED_EDEFAULT);
        return;
      case WebIDLPackage.PRIMITIVE_TYPE_REF__NAME:
        setName(NAME_EDEFAULT);
        return;
      case WebIDLPackage.PRIMITIVE_TYPE_REF__NULLABLE:
        setNullable(NULLABLE_EDEFAULT);
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
      case WebIDLPackage.PRIMITIVE_TYPE_REF__UNSIGNED:
        return unsigned != UNSIGNED_EDEFAULT;
      case WebIDLPackage.PRIMITIVE_TYPE_REF__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case WebIDLPackage.PRIMITIVE_TYPE_REF__NULLABLE:
        return nullable != NULLABLE_EDEFAULT;
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
    result.append(" (unsigned: ");
    result.append(unsigned);
    result.append(", name: ");
    result.append(name);
    result.append(", nullable: ");
    result.append(nullable);
    result.append(')');
    return result.toString();
  }

} //PrimitiveTypeRefImpl
