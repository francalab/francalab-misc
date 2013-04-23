/**
 * <copyright>
 * </copyright>
 *

 */
package org.waml.w3c.webidl.webIDL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Treat Undefined As</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.waml.w3c.webidl.webIDL.TreatUndefinedAs#isAsEmptyString <em>As Empty String</em>}</li>
 *   <li>{@link org.waml.w3c.webidl.webIDL.TreatUndefinedAs#isAsNull <em>As Null</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.waml.w3c.webidl.webIDL.WebIDLPackage#getTreatUndefinedAs()
 * @model
 * @generated
 */
public interface TreatUndefinedAs extends OperationExtendedAttribute, AttributeExtendedAttribute, ArgumentExtendedAttribute
{
  /**
   * Returns the value of the '<em><b>As Empty String</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>As Empty String</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>As Empty String</em>' attribute.
   * @see #setAsEmptyString(boolean)
   * @see org.waml.w3c.webidl.webIDL.WebIDLPackage#getTreatUndefinedAs_AsEmptyString()
   * @model
   * @generated
   */
  boolean isAsEmptyString();

  /**
   * Sets the value of the '{@link org.waml.w3c.webidl.webIDL.TreatUndefinedAs#isAsEmptyString <em>As Empty String</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>As Empty String</em>' attribute.
   * @see #isAsEmptyString()
   * @generated
   */
  void setAsEmptyString(boolean value);

  /**
   * Returns the value of the '<em><b>As Null</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>As Null</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>As Null</em>' attribute.
   * @see #setAsNull(boolean)
   * @see org.waml.w3c.webidl.webIDL.WebIDLPackage#getTreatUndefinedAs_AsNull()
   * @model
   * @generated
   */
  boolean isAsNull();

  /**
   * Sets the value of the '{@link org.waml.w3c.webidl.webIDL.TreatUndefinedAs#isAsNull <em>As Null</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>As Null</em>' attribute.
   * @see #isAsNull()
   * @generated
   */
  void setAsNull(boolean value);

} // TreatUndefinedAs
