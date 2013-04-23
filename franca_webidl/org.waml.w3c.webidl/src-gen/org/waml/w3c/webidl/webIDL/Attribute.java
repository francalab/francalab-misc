/**
 * <copyright>
 * </copyright>
 *

 */
package org.waml.w3c.webidl.webIDL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.waml.w3c.webidl.webIDL.Attribute#getExtendedAttributes <em>Extended Attributes</em>}</li>
 *   <li>{@link org.waml.w3c.webidl.webIDL.Attribute#getType <em>Type</em>}</li>
 *   <li>{@link org.waml.w3c.webidl.webIDL.Attribute#getGetRaises <em>Get Raises</em>}</li>
 *   <li>{@link org.waml.w3c.webidl.webIDL.Attribute#getSetRaises <em>Set Raises</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.waml.w3c.webidl.webIDL.WebIDLPackage#getAttribute()
 * @model
 * @generated
 */
public interface Attribute extends InterfaceFeature
{
  /**
   * Returns the value of the '<em><b>Extended Attributes</b></em>' containment reference list.
   * The list contents are of type {@link org.waml.w3c.webidl.webIDL.AttributeExtendedAttribute}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Extended Attributes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Extended Attributes</em>' containment reference list.
   * @see org.waml.w3c.webidl.webIDL.WebIDLPackage#getAttribute_ExtendedAttributes()
   * @model containment="true"
   * @generated
   */
  EList<AttributeExtendedAttribute> getExtendedAttributes();

  /**
   * Returns the value of the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' containment reference.
   * @see #setType(TypeRef)
   * @see org.waml.w3c.webidl.webIDL.WebIDLPackage#getAttribute_Type()
   * @model containment="true"
   * @generated
   */
  TypeRef getType();

  /**
   * Sets the value of the '{@link org.waml.w3c.webidl.webIDL.Attribute#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(TypeRef value);

  /**
   * Returns the value of the '<em><b>Get Raises</b></em>' reference list.
   * The list contents are of type {@link org.waml.w3c.webidl.webIDL.Exception}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Get Raises</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Get Raises</em>' reference list.
   * @see org.waml.w3c.webidl.webIDL.WebIDLPackage#getAttribute_GetRaises()
   * @model
   * @generated
   */
  EList<org.waml.w3c.webidl.webIDL.Exception> getGetRaises();

  /**
   * Returns the value of the '<em><b>Set Raises</b></em>' reference list.
   * The list contents are of type {@link org.waml.w3c.webidl.webIDL.Exception}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Set Raises</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Set Raises</em>' reference list.
   * @see org.waml.w3c.webidl.webIDL.WebIDLPackage#getAttribute_SetRaises()
   * @model
   * @generated
   */
  EList<org.waml.w3c.webidl.webIDL.Exception> getSetRaises();

} // Attribute
