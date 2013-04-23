/**
 * <copyright>
 * </copyright>
 *

 */
package org.waml.w3c.webidl.webIDL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User Type Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.waml.w3c.webidl.webIDL.UserTypeRef#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.waml.w3c.webidl.webIDL.WebIDLPackage#getUserTypeRef()
 * @model
 * @generated
 */
public interface UserTypeRef extends TypeRef
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' reference.
   * @see #setType(Types)
   * @see org.waml.w3c.webidl.webIDL.WebIDLPackage#getUserTypeRef_Type()
   * @model
   * @generated
   */
  Types getType();

  /**
   * Sets the value of the '{@link org.waml.w3c.webidl.webIDL.UserTypeRef#getType <em>Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' reference.
   * @see #getType()
   * @generated
   */
  void setType(Types value);

} // UserTypeRef
