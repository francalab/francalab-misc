/**
 * <copyright>
 * </copyright>
 *

 */
package org.waml.w3c.webidl.webIDL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.waml.w3c.webidl.webIDL.TypeDef#getType <em>Type</em>}</li>
 *   <li>{@link org.waml.w3c.webidl.webIDL.TypeDef#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.waml.w3c.webidl.webIDL.WebIDLPackage#getTypeDef()
 * @model
 * @generated
 */
public interface TypeDef extends Types, Definitions
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
   * @see org.waml.w3c.webidl.webIDL.WebIDLPackage#getTypeDef_Type()
   * @model containment="true"
   * @generated
   */
  TypeRef getType();

  /**
   * Sets the value of the '{@link org.waml.w3c.webidl.webIDL.TypeDef#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(TypeRef value);

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
   * @see org.waml.w3c.webidl.webIDL.WebIDLPackage#getTypeDef_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.waml.w3c.webidl.webIDL.TypeDef#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

} // TypeDef
