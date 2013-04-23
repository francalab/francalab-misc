/**
 * <copyright>
 * </copyright>
 *

 */
package org.waml.w3c.webidl.webIDL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interface Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.waml.w3c.webidl.webIDL.InterfaceFeature#isStringifier <em>Stringifier</em>}</li>
 *   <li>{@link org.waml.w3c.webidl.webIDL.InterfaceFeature#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.waml.w3c.webidl.webIDL.WebIDLPackage#getInterfaceFeature()
 * @model
 * @generated
 */
public interface InterfaceFeature extends Types, InterfaceMember
{
  /**
   * Returns the value of the '<em><b>Stringifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Stringifier</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Stringifier</em>' attribute.
   * @see #setStringifier(boolean)
   * @see org.waml.w3c.webidl.webIDL.WebIDLPackage#getInterfaceFeature_Stringifier()
   * @model
   * @generated
   */
  boolean isStringifier();

  /**
   * Sets the value of the '{@link org.waml.w3c.webidl.webIDL.InterfaceFeature#isStringifier <em>Stringifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Stringifier</em>' attribute.
   * @see #isStringifier()
   * @generated
   */
  void setStringifier(boolean value);

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
   * @see org.waml.w3c.webidl.webIDL.WebIDLPackage#getInterfaceFeature_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.waml.w3c.webidl.webIDL.InterfaceFeature#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

} // InterfaceFeature
