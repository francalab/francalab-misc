/**
 * <copyright>
 * </copyright>
 *

 */
package org.waml.w3c.webidl.webIDL.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.waml.w3c.webidl.webIDL.AbstractDefinitions;
import org.waml.w3c.webidl.webIDL.IDLDefinitions;
import org.waml.w3c.webidl.webIDL.Import;
import org.waml.w3c.webidl.webIDL.WebIDLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>IDL Definitions</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.waml.w3c.webidl.webIDL.impl.IDLDefinitionsImpl#getImports <em>Imports</em>}</li>
 *   <li>{@link org.waml.w3c.webidl.webIDL.impl.IDLDefinitionsImpl#getDefinitions <em>Definitions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IDLDefinitionsImpl extends MinimalEObjectImpl.Container implements IDLDefinitions
{
  /**
   * The cached value of the '{@link #getImports() <em>Imports</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImports()
   * @generated
   * @ordered
   */
  protected EList<Import> imports;

  /**
   * The cached value of the '{@link #getDefinitions() <em>Definitions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDefinitions()
   * @generated
   * @ordered
   */
  protected EList<AbstractDefinitions> definitions;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected IDLDefinitionsImpl()
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
    return WebIDLPackage.Literals.IDL_DEFINITIONS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Import> getImports()
  {
    if (imports == null)
    {
      imports = new EObjectContainmentEList<Import>(Import.class, this, WebIDLPackage.IDL_DEFINITIONS__IMPORTS);
    }
    return imports;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<AbstractDefinitions> getDefinitions()
  {
    if (definitions == null)
    {
      definitions = new EObjectContainmentEList<AbstractDefinitions>(AbstractDefinitions.class, this, WebIDLPackage.IDL_DEFINITIONS__DEFINITIONS);
    }
    return definitions;
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
      case WebIDLPackage.IDL_DEFINITIONS__IMPORTS:
        return ((InternalEList<?>)getImports()).basicRemove(otherEnd, msgs);
      case WebIDLPackage.IDL_DEFINITIONS__DEFINITIONS:
        return ((InternalEList<?>)getDefinitions()).basicRemove(otherEnd, msgs);
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
      case WebIDLPackage.IDL_DEFINITIONS__IMPORTS:
        return getImports();
      case WebIDLPackage.IDL_DEFINITIONS__DEFINITIONS:
        return getDefinitions();
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
      case WebIDLPackage.IDL_DEFINITIONS__IMPORTS:
        getImports().clear();
        getImports().addAll((Collection<? extends Import>)newValue);
        return;
      case WebIDLPackage.IDL_DEFINITIONS__DEFINITIONS:
        getDefinitions().clear();
        getDefinitions().addAll((Collection<? extends AbstractDefinitions>)newValue);
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
      case WebIDLPackage.IDL_DEFINITIONS__IMPORTS:
        getImports().clear();
        return;
      case WebIDLPackage.IDL_DEFINITIONS__DEFINITIONS:
        getDefinitions().clear();
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
      case WebIDLPackage.IDL_DEFINITIONS__IMPORTS:
        return imports != null && !imports.isEmpty();
      case WebIDLPackage.IDL_DEFINITIONS__DEFINITIONS:
        return definitions != null && !definitions.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //IDLDefinitionsImpl
