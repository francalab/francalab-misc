/**
 * <copyright>
 * </copyright>
 *

 */
package org.waml.w3c.webidl.webIDL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Callback</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.waml.w3c.webidl.webIDL.Callback#isFunctionOnly <em>Function Only</em>}</li>
 *   <li>{@link org.waml.w3c.webidl.webIDL.Callback#isPropertyOnly <em>Property Only</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.waml.w3c.webidl.webIDL.WebIDLPackage#getCallback()
 * @model
 * @generated
 */
public interface Callback extends InterfaceExtendedAttribute
{
  /**
   * Returns the value of the '<em><b>Function Only</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Function Only</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Function Only</em>' attribute.
   * @see #setFunctionOnly(boolean)
   * @see org.waml.w3c.webidl.webIDL.WebIDLPackage#getCallback_FunctionOnly()
   * @model
   * @generated
   */
  boolean isFunctionOnly();

  /**
   * Sets the value of the '{@link org.waml.w3c.webidl.webIDL.Callback#isFunctionOnly <em>Function Only</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Function Only</em>' attribute.
   * @see #isFunctionOnly()
   * @generated
   */
  void setFunctionOnly(boolean value);

  /**
   * Returns the value of the '<em><b>Property Only</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Property Only</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Property Only</em>' attribute.
   * @see #setPropertyOnly(boolean)
   * @see org.waml.w3c.webidl.webIDL.WebIDLPackage#getCallback_PropertyOnly()
   * @model
   * @generated
   */
  boolean isPropertyOnly();

  /**
   * Sets the value of the '{@link org.waml.w3c.webidl.webIDL.Callback#isPropertyOnly <em>Property Only</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Property Only</em>' attribute.
   * @see #isPropertyOnly()
   * @generated
   */
  void setPropertyOnly(boolean value);

} // Callback
