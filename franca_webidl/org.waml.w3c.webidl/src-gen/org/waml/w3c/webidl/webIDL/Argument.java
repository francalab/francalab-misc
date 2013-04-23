/**
 * <copyright>
 * </copyright>
 *

 */
package org.waml.w3c.webidl.webIDL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Argument</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.waml.w3c.webidl.webIDL.Argument#getExtendedAttributes <em>Extended Attributes</em>}</li>
 *   <li>{@link org.waml.w3c.webidl.webIDL.Argument#isIn <em>In</em>}</li>
 *   <li>{@link org.waml.w3c.webidl.webIDL.Argument#isOptional <em>Optional</em>}</li>
 *   <li>{@link org.waml.w3c.webidl.webIDL.Argument#getType <em>Type</em>}</li>
 *   <li>{@link org.waml.w3c.webidl.webIDL.Argument#isEllipsis <em>Ellipsis</em>}</li>
 *   <li>{@link org.waml.w3c.webidl.webIDL.Argument#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.waml.w3c.webidl.webIDL.WebIDLPackage#getArgument()
 * @model
 * @generated
 */
public interface Argument extends EObject
{
  /**
   * Returns the value of the '<em><b>Extended Attributes</b></em>' containment reference list.
   * The list contents are of type {@link org.waml.w3c.webidl.webIDL.ArgumentExtendedAttribute}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Extended Attributes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Extended Attributes</em>' containment reference list.
   * @see org.waml.w3c.webidl.webIDL.WebIDLPackage#getArgument_ExtendedAttributes()
   * @model containment="true"
   * @generated
   */
  EList<ArgumentExtendedAttribute> getExtendedAttributes();

  /**
   * Returns the value of the '<em><b>In</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>In</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>In</em>' attribute.
   * @see #setIn(boolean)
   * @see org.waml.w3c.webidl.webIDL.WebIDLPackage#getArgument_In()
   * @model
   * @generated
   */
  boolean isIn();

  /**
   * Sets the value of the '{@link org.waml.w3c.webidl.webIDL.Argument#isIn <em>In</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>In</em>' attribute.
   * @see #isIn()
   * @generated
   */
  void setIn(boolean value);

  /**
   * Returns the value of the '<em><b>Optional</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Optional</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Optional</em>' attribute.
   * @see #setOptional(boolean)
   * @see org.waml.w3c.webidl.webIDL.WebIDLPackage#getArgument_Optional()
   * @model
   * @generated
   */
  boolean isOptional();

  /**
   * Sets the value of the '{@link org.waml.w3c.webidl.webIDL.Argument#isOptional <em>Optional</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Optional</em>' attribute.
   * @see #isOptional()
   * @generated
   */
  void setOptional(boolean value);

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
   * @see org.waml.w3c.webidl.webIDL.WebIDLPackage#getArgument_Type()
   * @model containment="true"
   * @generated
   */
  TypeRef getType();

  /**
   * Sets the value of the '{@link org.waml.w3c.webidl.webIDL.Argument#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(TypeRef value);

  /**
   * Returns the value of the '<em><b>Ellipsis</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ellipsis</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ellipsis</em>' attribute.
   * @see #setEllipsis(boolean)
   * @see org.waml.w3c.webidl.webIDL.WebIDLPackage#getArgument_Ellipsis()
   * @model
   * @generated
   */
  boolean isEllipsis();

  /**
   * Sets the value of the '{@link org.waml.w3c.webidl.webIDL.Argument#isEllipsis <em>Ellipsis</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ellipsis</em>' attribute.
   * @see #isEllipsis()
   * @generated
   */
  void setEllipsis(boolean value);

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
   * @see org.waml.w3c.webidl.webIDL.WebIDLPackage#getArgument_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.waml.w3c.webidl.webIDL.Argument#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

} // Argument
