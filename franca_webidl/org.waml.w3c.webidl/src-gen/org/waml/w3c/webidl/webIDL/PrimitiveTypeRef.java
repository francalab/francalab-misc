/**
 * <copyright>
 * </copyright>
 *

 */
package org.waml.w3c.webidl.webIDL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Primitive Type Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.waml.w3c.webidl.webIDL.PrimitiveTypeRef#isUnsigned <em>Unsigned</em>}</li>
 *   <li>{@link org.waml.w3c.webidl.webIDL.PrimitiveTypeRef#getName <em>Name</em>}</li>
 *   <li>{@link org.waml.w3c.webidl.webIDL.PrimitiveTypeRef#isNullable <em>Nullable</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.waml.w3c.webidl.webIDL.WebIDLPackage#getPrimitiveTypeRef()
 * @model
 * @generated
 */
public interface PrimitiveTypeRef extends TypeRef
{
  /**
   * Returns the value of the '<em><b>Unsigned</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Unsigned</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Unsigned</em>' attribute.
   * @see #setUnsigned(boolean)
   * @see org.waml.w3c.webidl.webIDL.WebIDLPackage#getPrimitiveTypeRef_Unsigned()
   * @model
   * @generated
   */
  boolean isUnsigned();

  /**
   * Sets the value of the '{@link org.waml.w3c.webidl.webIDL.PrimitiveTypeRef#isUnsigned <em>Unsigned</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Unsigned</em>' attribute.
   * @see #isUnsigned()
   * @generated
   */
  void setUnsigned(boolean value);

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
   * @see org.waml.w3c.webidl.webIDL.WebIDLPackage#getPrimitiveTypeRef_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.waml.w3c.webidl.webIDL.PrimitiveTypeRef#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

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
   * @see org.waml.w3c.webidl.webIDL.WebIDLPackage#getPrimitiveTypeRef_Nullable()
   * @model
   * @generated
   */
  boolean isNullable();

  /**
   * Sets the value of the '{@link org.waml.w3c.webidl.webIDL.PrimitiveTypeRef#isNullable <em>Nullable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Nullable</em>' attribute.
   * @see #isNullable()
   * @generated
   */
  void setNullable(boolean value);

} // PrimitiveTypeRef
