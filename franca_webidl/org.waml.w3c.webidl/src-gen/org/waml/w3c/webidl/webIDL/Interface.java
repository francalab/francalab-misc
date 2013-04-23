/**
 * <copyright>
 * </copyright>
 *

 */
package org.waml.w3c.webidl.webIDL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.waml.w3c.webidl.webIDL.Interface#getExtendedAttributes <em>Extended Attributes</em>}</li>
 *   <li>{@link org.waml.w3c.webidl.webIDL.Interface#getExtendedAttribute <em>Extended Attribute</em>}</li>
 *   <li>{@link org.waml.w3c.webidl.webIDL.Interface#getName <em>Name</em>}</li>
 *   <li>{@link org.waml.w3c.webidl.webIDL.Interface#getSuperType <em>Super Type</em>}</li>
 *   <li>{@link org.waml.w3c.webidl.webIDL.Interface#getMembers <em>Members</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.waml.w3c.webidl.webIDL.WebIDLPackage#getInterface()
 * @model
 * @generated
 */
public interface Interface extends Types, Definitions
{
  /**
   * Returns the value of the '<em><b>Extended Attributes</b></em>' containment reference list.
   * The list contents are of type {@link org.waml.w3c.webidl.webIDL.InterfaceExtendedAttribute}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Extended Attributes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Extended Attributes</em>' containment reference list.
   * @see org.waml.w3c.webidl.webIDL.WebIDLPackage#getInterface_ExtendedAttributes()
   * @model containment="true"
   * @generated
   */
  EList<InterfaceExtendedAttribute> getExtendedAttributes();

  /**
   * Returns the value of the '<em><b>Extended Attribute</b></em>' containment reference list.
   * The list contents are of type {@link org.waml.w3c.webidl.webIDL.InterfaceExtendedAttribute}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Extended Attribute</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Extended Attribute</em>' containment reference list.
   * @see org.waml.w3c.webidl.webIDL.WebIDLPackage#getInterface_ExtendedAttribute()
   * @model containment="true"
   * @generated
   */
  EList<InterfaceExtendedAttribute> getExtendedAttribute();

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
   * @see org.waml.w3c.webidl.webIDL.WebIDLPackage#getInterface_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.waml.w3c.webidl.webIDL.Interface#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Super Type</b></em>' reference list.
   * The list contents are of type {@link org.waml.w3c.webidl.webIDL.Interface}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Super Type</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Super Type</em>' reference list.
   * @see org.waml.w3c.webidl.webIDL.WebIDLPackage#getInterface_SuperType()
   * @model
   * @generated
   */
  EList<Interface> getSuperType();

  /**
   * Returns the value of the '<em><b>Members</b></em>' containment reference list.
   * The list contents are of type {@link org.waml.w3c.webidl.webIDL.InterfaceMember}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Members</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Members</em>' containment reference list.
   * @see org.waml.w3c.webidl.webIDL.WebIDLPackage#getInterface_Members()
   * @model containment="true"
   * @generated
   */
  EList<InterfaceMember> getMembers();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model kind="operation"
   *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\r\n\tEList<Operation> lResult = new org.eclipse.emf.common.util.BasicEList<Operation>();\r\n\tfor(java.util.Iterator<InterfaceMember> ite=this.getMembers().iterator();ite.hasNext();)\r\n\t{\r\n\t\tInterfaceMember lIm = ite.next();\r\n\t\tif (lIm instanceof Operation)\r\n\t\t{\r\n\t\t\tlResult.add((Operation)lIm);\r\n\t\t}\r\n\t}\r\n\treturn lResult;'"
   * @generated
   */
  EList<Operation> getOperations();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model kind="operation"
   *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\r\n\tEList<Attribute> lResult = new org.eclipse.emf.common.util.BasicEList<Attribute>();\r\n\tfor(java.util.Iterator<InterfaceMember> ite=this.getMembers().iterator();ite.hasNext();)\r\n\t{\r\n\t\tInterfaceMember lIm = ite.next();\r\n\t\tif (lIm instanceof Attribute)\r\n\t\t{\r\n\t\t\tlResult.add((Attribute)lIm);\r\n\t\t}\r\n\t}\r\n\treturn lResult;'"
   * @generated
   */
  EList<Attribute> getAttributes();

} // Interface
