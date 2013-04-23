/**
 * <copyright>
 * </copyright>
 *

 */
package org.waml.w3c.webidl.webIDL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exception</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.waml.w3c.webidl.webIDL.Exception#getExtendedAttributes <em>Extended Attributes</em>}</li>
 *   <li>{@link org.waml.w3c.webidl.webIDL.Exception#getName <em>Name</em>}</li>
 *   <li>{@link org.waml.w3c.webidl.webIDL.Exception#getMembers <em>Members</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.waml.w3c.webidl.webIDL.WebIDLPackage#getException()
 * @model
 * @generated
 */
public interface Exception extends Definitions
{
  /**
   * Returns the value of the '<em><b>Extended Attributes</b></em>' containment reference list.
   * The list contents are of type {@link org.waml.w3c.webidl.webIDL.ExceptionExtendedAttribute}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Extended Attributes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Extended Attributes</em>' containment reference list.
   * @see org.waml.w3c.webidl.webIDL.WebIDLPackage#getException_ExtendedAttributes()
   * @model containment="true"
   * @generated
   */
  EList<ExceptionExtendedAttribute> getExtendedAttributes();

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.waml.w3c.webidl.webIDL.WebIDLPackage#getException_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.waml.w3c.webidl.webIDL.Exception#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Members</b></em>' containment reference list.
   * The list contents are of type {@link org.waml.w3c.webidl.webIDL.ExceptionMember}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Members</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Members</em>' containment reference list.
   * @see org.waml.w3c.webidl.webIDL.WebIDLPackage#getException_Members()
   * @model containment="true"
   * @generated
   */
  EList<ExceptionMember> getMembers();

} // Exception
