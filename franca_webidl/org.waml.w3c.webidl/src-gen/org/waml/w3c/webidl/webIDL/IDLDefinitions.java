/**
 * <copyright>
 * </copyright>
 *

 */
package org.waml.w3c.webidl.webIDL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IDL Definitions</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.waml.w3c.webidl.webIDL.IDLDefinitions#getImports <em>Imports</em>}</li>
 *   <li>{@link org.waml.w3c.webidl.webIDL.IDLDefinitions#getDefinitions <em>Definitions</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.waml.w3c.webidl.webIDL.WebIDLPackage#getIDLDefinitions()
 * @model
 * @generated
 */
public interface IDLDefinitions extends EObject
{
  /**
   * Returns the value of the '<em><b>Imports</b></em>' containment reference list.
   * The list contents are of type {@link org.waml.w3c.webidl.webIDL.Import}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Imports</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Imports</em>' containment reference list.
   * @see org.waml.w3c.webidl.webIDL.WebIDLPackage#getIDLDefinitions_Imports()
   * @model containment="true"
   * @generated
   */
  EList<Import> getImports();

  /**
   * Returns the value of the '<em><b>Definitions</b></em>' containment reference list.
   * The list contents are of type {@link org.waml.w3c.webidl.webIDL.AbstractDefinitions}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Definitions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Definitions</em>' containment reference list.
   * @see org.waml.w3c.webidl.webIDL.WebIDLPackage#getIDLDefinitions_Definitions()
   * @model containment="true"
   * @generated
   */
  EList<AbstractDefinitions> getDefinitions();

} // IDLDefinitions
