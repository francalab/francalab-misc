/**
 * <copyright>
 * </copyright>
 *

 */
package org.waml.w3c.webidl.webIDL;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.waml.w3c.webidl.webIDL.WebIDLPackage
 * @generated
 */
public interface WebIDLFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  WebIDLFactory eINSTANCE = org.waml.w3c.webidl.webIDL.impl.WebIDLFactoryImpl.init();

  /**
   * Returns a new object of class '<em>IDL Definitions</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>IDL Definitions</em>'.
   * @generated
   */
  IDLDefinitions createIDLDefinitions();

  /**
   * Returns a new object of class '<em>Import</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Import</em>'.
   * @generated
   */
  Import createImport();

  /**
   * Returns a new object of class '<em>Type Def</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Type Def</em>'.
   * @generated
   */
  TypeDef createTypeDef();

  /**
   * Returns a new object of class '<em>Type Ref</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Type Ref</em>'.
   * @generated
   */
  TypeRef createTypeRef();

  /**
   * Returns a new object of class '<em>User Type Ref</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>User Type Ref</em>'.
   * @generated
   */
  UserTypeRef createUserTypeRef();

  /**
   * Returns a new object of class '<em>Types</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Types</em>'.
   * @generated
   */
  Types createTypes();

  /**
   * Returns a new object of class '<em>Primitive Type Ref</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Primitive Type Ref</em>'.
   * @generated
   */
  PrimitiveTypeRef createPrimitiveTypeRef();

  /**
   * Returns a new object of class '<em>Sequence Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Sequence Type</em>'.
   * @generated
   */
  SequenceType createSequenceType();

  /**
   * Returns a new object of class '<em>Callable</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Callable</em>'.
   * @generated
   */
  Callable createCallable();

  /**
   * Returns a new object of class '<em>Constructor</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Constructor</em>'.
   * @generated
   */
  Constructor createConstructor();

  /**
   * Returns a new object of class '<em>Named Constructor</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Named Constructor</em>'.
   * @generated
   */
  NamedConstructor createNamedConstructor();

  /**
   * Returns a new object of class '<em>Callback</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Callback</em>'.
   * @generated
   */
  Callback createCallback();

  /**
   * Returns a new object of class '<em>No Interface Object</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>No Interface Object</em>'.
   * @generated
   */
  NoInterfaceObject createNoInterfaceObject();

  /**
   * Returns a new object of class '<em>Prototype Root</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Prototype Root</em>'.
   * @generated
   */
  PrototypeRoot createPrototypeRoot();

  /**
   * Returns a new object of class '<em>Put Forwards</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Put Forwards</em>'.
   * @generated
   */
  PutForwards createPutForwards();

  /**
   * Returns a new object of class '<em>Treat Null As</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Treat Null As</em>'.
   * @generated
   */
  TreatNullAs createTreatNullAs();

  /**
   * Returns a new object of class '<em>Treat Undefined As</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Treat Undefined As</em>'.
   * @generated
   */
  TreatUndefinedAs createTreatUndefinedAs();

  /**
   * Returns a new object of class '<em>Allow Any</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Allow Any</em>'.
   * @generated
   */
  AllowAny createAllowAny();

  /**
   * Returns a new object of class '<em>Replaceable</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Replaceable</em>'.
   * @generated
   */
  Replaceable createReplaceable();

  /**
   * Returns a new object of class '<em>Supplemental</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Supplemental</em>'.
   * @generated
   */
  Supplemental createSupplemental();

  /**
   * Returns a new object of class '<em>Replaceable Named Properties</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Replaceable Named Properties</em>'.
   * @generated
   */
  ReplaceableNamedProperties createReplaceableNamedProperties();

  /**
   * Returns a new object of class '<em>Abstract Definitions</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Abstract Definitions</em>'.
   * @generated
   */
  AbstractDefinitions createAbstractDefinitions();

  /**
   * Returns a new object of class '<em>Definitions</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Definitions</em>'.
   * @generated
   */
  Definitions createDefinitions();

  /**
   * Returns a new object of class '<em>Implement Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Implement Statement</em>'.
   * @generated
   */
  ImplementStatement createImplementStatement();

  /**
   * Returns a new object of class '<em>Module</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Module</em>'.
   * @generated
   */
  Module createModule();

  /**
   * Returns a new object of class '<em>Module Extended Attribute</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Module Extended Attribute</em>'.
   * @generated
   */
  ModuleExtendedAttribute createModuleExtendedAttribute();

  /**
   * Returns a new object of class '<em>Prefix</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Prefix</em>'.
   * @generated
   */
  Prefix createPrefix();

  /**
   * Returns a new object of class '<em>Namespace Object</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Namespace Object</em>'.
   * @generated
   */
  NamespaceObject createNamespaceObject();

  /**
   * Returns a new object of class '<em>Interface</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Interface</em>'.
   * @generated
   */
  Interface createInterface();

  /**
   * Returns a new object of class '<em>Interface Extended Attribute</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Interface Extended Attribute</em>'.
   * @generated
   */
  InterfaceExtendedAttribute createInterfaceExtendedAttribute();

  /**
   * Returns a new object of class '<em>Interface Member</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Interface Member</em>'.
   * @generated
   */
  InterfaceMember createInterfaceMember();

  /**
   * Returns a new object of class '<em>Interface Feature</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Interface Feature</em>'.
   * @generated
   */
  InterfaceFeature createInterfaceFeature();

  /**
   * Returns a new object of class '<em>Operation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Operation</em>'.
   * @generated
   */
  Operation createOperation();

  /**
   * Returns a new object of class '<em>Operation Extended Attribute</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Operation Extended Attribute</em>'.
   * @generated
   */
  OperationExtendedAttribute createOperationExtendedAttribute();

  /**
   * Returns a new object of class '<em>Operation Special</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Operation Special</em>'.
   * @generated
   */
  OperationSpecial createOperationSpecial();

  /**
   * Returns a new object of class '<em>Attribute</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Attribute</em>'.
   * @generated
   */
  Attribute createAttribute();

  /**
   * Returns a new object of class '<em>Attribute Extended Attribute</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Attribute Extended Attribute</em>'.
   * @generated
   */
  AttributeExtendedAttribute createAttributeExtendedAttribute();

  /**
   * Returns a new object of class '<em>Exception</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Exception</em>'.
   * @generated
   */
  Exception createException();

  /**
   * Returns a new object of class '<em>Exception Member</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Exception Member</em>'.
   * @generated
   */
  ExceptionMember createExceptionMember();

  /**
   * Returns a new object of class '<em>Exception Field</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Exception Field</em>'.
   * @generated
   */
  ExceptionField createExceptionField();

  /**
   * Returns a new object of class '<em>Exception Extended Attribute</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Exception Extended Attribute</em>'.
   * @generated
   */
  ExceptionExtendedAttribute createExceptionExtendedAttribute();

  /**
   * Returns a new object of class '<em>Argument</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Argument</em>'.
   * @generated
   */
  Argument createArgument();

  /**
   * Returns a new object of class '<em>Argument Extended Attribute</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Argument Extended Attribute</em>'.
   * @generated
   */
  ArgumentExtendedAttribute createArgumentExtendedAttribute();

  /**
   * Returns a new object of class '<em>Const</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Const</em>'.
   * @generated
   */
  Const createConst();

  /**
   * Returns a new object of class '<em>Const Expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Const Expr</em>'.
   * @generated
   */
  ConstExpr createConstExpr();

  /**
   * Returns a new object of class '<em>Operation Special Getter</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Operation Special Getter</em>'.
   * @generated
   */
  OperationSpecialGetter createOperationSpecialGetter();

  /**
   * Returns a new object of class '<em>Operation Special Setter</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Operation Special Setter</em>'.
   * @generated
   */
  OperationSpecialSetter createOperationSpecialSetter();

  /**
   * Returns a new object of class '<em>Operation Special Creator</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Operation Special Creator</em>'.
   * @generated
   */
  OperationSpecialCreator createOperationSpecialCreator();

  /**
   * Returns a new object of class '<em>Operation Special Deleter</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Operation Special Deleter</em>'.
   * @generated
   */
  OperationSpecialDeleter createOperationSpecialDeleter();

  /**
   * Returns a new object of class '<em>Operation Special Caller</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Operation Special Caller</em>'.
   * @generated
   */
  OperationSpecialCaller createOperationSpecialCaller();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  WebIDLPackage getWebIDLPackage();

} //WebIDLFactory
