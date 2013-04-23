/**
 * <copyright>
 * </copyright>
 *

 */
package org.waml.w3c.webidl.webIDL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Implement Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.waml.w3c.webidl.webIDL.ImplementStatement#getSource <em>Source</em>}</li>
 *   <li>{@link org.waml.w3c.webidl.webIDL.ImplementStatement#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.waml.w3c.webidl.webIDL.WebIDLPackage#getImplementStatement()
 * @model
 * @generated
 */
public interface ImplementStatement extends Definitions
{
  /**
   * Returns the value of the '<em><b>Source</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Source</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Source</em>' reference.
   * @see #setSource(Interface)
   * @see org.waml.w3c.webidl.webIDL.WebIDLPackage#getImplementStatement_Source()
   * @model
   * @generated
   */
  Interface getSource();

  /**
   * Sets the value of the '{@link org.waml.w3c.webidl.webIDL.ImplementStatement#getSource <em>Source</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Source</em>' reference.
   * @see #getSource()
   * @generated
   */
  void setSource(Interface value);

  /**
   * Returns the value of the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Target</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target</em>' reference.
   * @see #setTarget(Interface)
   * @see org.waml.w3c.webidl.webIDL.WebIDLPackage#getImplementStatement_Target()
   * @model
   * @generated
   */
  Interface getTarget();

  /**
   * Sets the value of the '{@link org.waml.w3c.webidl.webIDL.ImplementStatement#getTarget <em>Target</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target</em>' reference.
   * @see #getTarget()
   * @generated
   */
  void setTarget(Interface value);

} // ImplementStatement
