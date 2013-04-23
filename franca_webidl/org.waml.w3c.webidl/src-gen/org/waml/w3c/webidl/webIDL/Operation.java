/**
 * <copyright>
 * </copyright>
 *

 */
package org.waml.w3c.webidl.webIDL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.waml.w3c.webidl.webIDL.Operation#getExtendedAttributes <em>Extended Attributes</em>}</li>
 *   <li>{@link org.waml.w3c.webidl.webIDL.Operation#isOmittable <em>Omittable</em>}</li>
 *   <li>{@link org.waml.w3c.webidl.webIDL.Operation#getSpecials <em>Specials</em>}</li>
 *   <li>{@link org.waml.w3c.webidl.webIDL.Operation#getReturn <em>Return</em>}</li>
 *   <li>{@link org.waml.w3c.webidl.webIDL.Operation#getArguments <em>Arguments</em>}</li>
 *   <li>{@link org.waml.w3c.webidl.webIDL.Operation#getRaises <em>Raises</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.waml.w3c.webidl.webIDL.WebIDLPackage#getOperation()
 * @model
 * @generated
 */
public interface Operation extends InterfaceFeature
{
  /**
   * Returns the value of the '<em><b>Extended Attributes</b></em>' containment reference list.
   * The list contents are of type {@link org.waml.w3c.webidl.webIDL.OperationExtendedAttribute}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Extended Attributes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Extended Attributes</em>' containment reference list.
   * @see org.waml.w3c.webidl.webIDL.WebIDLPackage#getOperation_ExtendedAttributes()
   * @model containment="true"
   * @generated
   */
  EList<OperationExtendedAttribute> getExtendedAttributes();

  /**
   * Returns the value of the '<em><b>Omittable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Omittable</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Omittable</em>' attribute.
   * @see #setOmittable(boolean)
   * @see org.waml.w3c.webidl.webIDL.WebIDLPackage#getOperation_Omittable()
   * @model
   * @generated
   */
  boolean isOmittable();

  /**
   * Sets the value of the '{@link org.waml.w3c.webidl.webIDL.Operation#isOmittable <em>Omittable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Omittable</em>' attribute.
   * @see #isOmittable()
   * @generated
   */
  void setOmittable(boolean value);

  /**
   * Returns the value of the '<em><b>Specials</b></em>' containment reference list.
   * The list contents are of type {@link org.waml.w3c.webidl.webIDL.OperationSpecial}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Specials</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Specials</em>' containment reference list.
   * @see org.waml.w3c.webidl.webIDL.WebIDLPackage#getOperation_Specials()
   * @model containment="true"
   * @generated
   */
  EList<OperationSpecial> getSpecials();

  /**
   * Returns the value of the '<em><b>Return</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Return</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Return</em>' containment reference.
   * @see #setReturn(TypeRef)
   * @see org.waml.w3c.webidl.webIDL.WebIDLPackage#getOperation_Return()
   * @model containment="true"
   * @generated
   */
  TypeRef getReturn();

  /**
   * Sets the value of the '{@link org.waml.w3c.webidl.webIDL.Operation#getReturn <em>Return</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Return</em>' containment reference.
   * @see #getReturn()
   * @generated
   */
  void setReturn(TypeRef value);

  /**
   * Returns the value of the '<em><b>Arguments</b></em>' containment reference list.
   * The list contents are of type {@link org.waml.w3c.webidl.webIDL.Argument}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Arguments</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Arguments</em>' containment reference list.
   * @see org.waml.w3c.webidl.webIDL.WebIDLPackage#getOperation_Arguments()
   * @model containment="true"
   * @generated
   */
  EList<Argument> getArguments();

  /**
   * Returns the value of the '<em><b>Raises</b></em>' reference list.
   * The list contents are of type {@link org.waml.w3c.webidl.webIDL.Exception}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Raises</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Raises</em>' reference list.
   * @see org.waml.w3c.webidl.webIDL.WebIDLPackage#getOperation_Raises()
   * @model
   * @generated
   */
  EList<org.waml.w3c.webidl.webIDL.Exception> getRaises();

} // Operation
