/**
 * <copyright>
 * </copyright>
 *

 */
package org.waml.w3c.webidl.webIDL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.waml.w3c.webidl.webIDL.TypeRef#isIsArray <em>Is Array</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.waml.w3c.webidl.webIDL.WebIDLPackage#getTypeRef()
 * @model
 * @generated
 */
public interface TypeRef extends EObject
{
  /**
   * Returns the value of the '<em><b>Is Array</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Is Array</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Is Array</em>' attribute.
   * @see #setIsArray(boolean)
   * @see org.waml.w3c.webidl.webIDL.WebIDLPackage#getTypeRef_IsArray()
   * @model
   * @generated
   */
  boolean isIsArray();

  /**
   * Sets the value of the '{@link org.waml.w3c.webidl.webIDL.TypeRef#isIsArray <em>Is Array</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Is Array</em>' attribute.
   * @see #isIsArray()
   * @generated
   */
  void setIsArray(boolean value);

} // TypeRef
