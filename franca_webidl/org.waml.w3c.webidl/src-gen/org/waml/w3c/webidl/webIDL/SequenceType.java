/**
 * <copyright>
 * </copyright>
 *

 */
package org.waml.w3c.webidl.webIDL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sequence Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.waml.w3c.webidl.webIDL.SequenceType#getType <em>Type</em>}</li>
 *   <li>{@link org.waml.w3c.webidl.webIDL.SequenceType#isNullable <em>Nullable</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.waml.w3c.webidl.webIDL.WebIDLPackage#getSequenceType()
 * @model
 * @generated
 */
public interface SequenceType extends TypeRef
{
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
   * @see org.waml.w3c.webidl.webIDL.WebIDLPackage#getSequenceType_Type()
   * @model containment="true"
   * @generated
   */
  TypeRef getType();

  /**
   * Sets the value of the '{@link org.waml.w3c.webidl.webIDL.SequenceType#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(TypeRef value);

  /**
   * Returns the value of the '<em><b>Nullable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Nullable</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Nullable</em>' attribute.
   * @see #setNullable(boolean)
   * @see org.waml.w3c.webidl.webIDL.WebIDLPackage#getSequenceType_Nullable()
   * @model
   * @generated
   */
  boolean isNullable();

  /**
   * Sets the value of the '{@link org.waml.w3c.webidl.webIDL.SequenceType#isNullable <em>Nullable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Nullable</em>' attribute.
   * @see #isNullable()
   * @generated
   */
  void setNullable(boolean value);

} // SequenceType
