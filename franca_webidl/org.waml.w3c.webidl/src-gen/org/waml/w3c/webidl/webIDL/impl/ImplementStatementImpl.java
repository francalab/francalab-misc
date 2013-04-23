/**
 * <copyright>
 * </copyright>
 *

 */
package org.waml.w3c.webidl.webIDL.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.waml.w3c.webidl.webIDL.ImplementStatement;
import org.waml.w3c.webidl.webIDL.Interface;
import org.waml.w3c.webidl.webIDL.WebIDLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Implement Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.waml.w3c.webidl.webIDL.impl.ImplementStatementImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.waml.w3c.webidl.webIDL.impl.ImplementStatementImpl#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ImplementStatementImpl extends DefinitionsImpl implements ImplementStatement
{
  /**
   * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSource()
   * @generated
   * @ordered
   */
  protected Interface source;

  /**
   * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTarget()
   * @generated
   * @ordered
   */
  protected Interface target;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ImplementStatementImpl()
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
    return WebIDLPackage.Literals.IMPLEMENT_STATEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Interface getSource()
  {
    if (source != null && source.eIsProxy())
    {
      InternalEObject oldSource = (InternalEObject)source;
      source = (Interface)eResolveProxy(oldSource);
      if (source != oldSource)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, WebIDLPackage.IMPLEMENT_STATEMENT__SOURCE, oldSource, source));
      }
    }
    return source;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Interface basicGetSource()
  {
    return source;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSource(Interface newSource)
  {
    Interface oldSource = source;
    source = newSource;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WebIDLPackage.IMPLEMENT_STATEMENT__SOURCE, oldSource, source));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Interface getTarget()
  {
    if (target != null && target.eIsProxy())
    {
      InternalEObject oldTarget = (InternalEObject)target;
      target = (Interface)eResolveProxy(oldTarget);
      if (target != oldTarget)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, WebIDLPackage.IMPLEMENT_STATEMENT__TARGET, oldTarget, target));
      }
    }
    return target;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Interface basicGetTarget()
  {
    return target;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTarget(Interface newTarget)
  {
    Interface oldTarget = target;
    target = newTarget;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WebIDLPackage.IMPLEMENT_STATEMENT__TARGET, oldTarget, target));
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
      case WebIDLPackage.IMPLEMENT_STATEMENT__SOURCE:
        if (resolve) return getSource();
        return basicGetSource();
      case WebIDLPackage.IMPLEMENT_STATEMENT__TARGET:
        if (resolve) return getTarget();
        return basicGetTarget();
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
      case WebIDLPackage.IMPLEMENT_STATEMENT__SOURCE:
        setSource((Interface)newValue);
        return;
      case WebIDLPackage.IMPLEMENT_STATEMENT__TARGET:
        setTarget((Interface)newValue);
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
      case WebIDLPackage.IMPLEMENT_STATEMENT__SOURCE:
        setSource((Interface)null);
        return;
      case WebIDLPackage.IMPLEMENT_STATEMENT__TARGET:
        setTarget((Interface)null);
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
      case WebIDLPackage.IMPLEMENT_STATEMENT__SOURCE:
        return source != null;
      case WebIDLPackage.IMPLEMENT_STATEMENT__TARGET:
        return target != null;
    }
    return super.eIsSet(featureID);
  }

} //ImplementStatementImpl
