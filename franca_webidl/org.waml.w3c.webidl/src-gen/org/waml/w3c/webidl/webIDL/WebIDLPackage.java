/**
 * <copyright>
 * </copyright>
 *

 */
package org.waml.w3c.webidl.webIDL;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.waml.w3c.webidl.webIDL.WebIDLFactory
 * @model kind="package"
 * @generated
 */
public interface WebIDLPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "webIDL";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.waml.org/w3c/webidl/WebIDL";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "webIDL";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  WebIDLPackage eINSTANCE = org.waml.w3c.webidl.webIDL.impl.WebIDLPackageImpl.init();

  /**
   * The meta object id for the '{@link org.waml.w3c.webidl.webIDL.impl.IDLDefinitionsImpl <em>IDL Definitions</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.waml.w3c.webidl.webIDL.impl.IDLDefinitionsImpl
   * @see org.waml.w3c.webidl.webIDL.impl.WebIDLPackageImpl#getIDLDefinitions()
   * @generated
   */
  int IDL_DEFINITIONS = 0;

  /**
   * The feature id for the '<em><b>Imports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IDL_DEFINITIONS__IMPORTS = 0;

  /**
   * The feature id for the '<em><b>Definitions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IDL_DEFINITIONS__DEFINITIONS = 1;

  /**
   * The number of structural features of the '<em>IDL Definitions</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IDL_DEFINITIONS_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.waml.w3c.webidl.webIDL.impl.ImportImpl <em>Import</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.waml.w3c.webidl.webIDL.impl.ImportImpl
   * @see org.waml.w3c.webidl.webIDL.impl.WebIDLPackageImpl#getImport()
   * @generated
   */
  int IMPORT = 1;

  /**
   * The feature id for the '<em><b>Import URI</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT__IMPORT_URI = 0;

  /**
   * The number of structural features of the '<em>Import</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.waml.w3c.webidl.webIDL.impl.TypesImpl <em>Types</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.waml.w3c.webidl.webIDL.impl.TypesImpl
   * @see org.waml.w3c.webidl.webIDL.impl.WebIDLPackageImpl#getTypes()
   * @generated
   */
  int TYPES = 5;

  /**
   * The number of structural features of the '<em>Types</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPES_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.waml.w3c.webidl.webIDL.impl.TypeDefImpl <em>Type Def</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.waml.w3c.webidl.webIDL.impl.TypeDefImpl
   * @see org.waml.w3c.webidl.webIDL.impl.WebIDLPackageImpl#getTypeDef()
   * @generated
   */
  int TYPE_DEF = 2;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_DEF__TYPE = TYPES_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_DEF__NAME = TYPES_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Type Def</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_DEF_FEATURE_COUNT = TYPES_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.waml.w3c.webidl.webIDL.impl.TypeRefImpl <em>Type Ref</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.waml.w3c.webidl.webIDL.impl.TypeRefImpl
   * @see org.waml.w3c.webidl.webIDL.impl.WebIDLPackageImpl#getTypeRef()
   * @generated
   */
  int TYPE_REF = 3;

  /**
   * The feature id for the '<em><b>Is Array</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_REF__IS_ARRAY = 0;

  /**
   * The number of structural features of the '<em>Type Ref</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_REF_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.waml.w3c.webidl.webIDL.impl.UserTypeRefImpl <em>User Type Ref</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.waml.w3c.webidl.webIDL.impl.UserTypeRefImpl
   * @see org.waml.w3c.webidl.webIDL.impl.WebIDLPackageImpl#getUserTypeRef()
   * @generated
   */
  int USER_TYPE_REF = 4;

  /**
   * The feature id for the '<em><b>Is Array</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USER_TYPE_REF__IS_ARRAY = TYPE_REF__IS_ARRAY;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USER_TYPE_REF__TYPE = TYPE_REF_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>User Type Ref</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USER_TYPE_REF_FEATURE_COUNT = TYPE_REF_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.waml.w3c.webidl.webIDL.impl.PrimitiveTypeRefImpl <em>Primitive Type Ref</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.waml.w3c.webidl.webIDL.impl.PrimitiveTypeRefImpl
   * @see org.waml.w3c.webidl.webIDL.impl.WebIDLPackageImpl#getPrimitiveTypeRef()
   * @generated
   */
  int PRIMITIVE_TYPE_REF = 6;

  /**
   * The feature id for the '<em><b>Is Array</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMITIVE_TYPE_REF__IS_ARRAY = TYPE_REF__IS_ARRAY;

  /**
   * The feature id for the '<em><b>Unsigned</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMITIVE_TYPE_REF__UNSIGNED = TYPE_REF_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMITIVE_TYPE_REF__NAME = TYPE_REF_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Nullable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMITIVE_TYPE_REF__NULLABLE = TYPE_REF_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Primitive Type Ref</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMITIVE_TYPE_REF_FEATURE_COUNT = TYPE_REF_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.waml.w3c.webidl.webIDL.impl.SequenceTypeImpl <em>Sequence Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.waml.w3c.webidl.webIDL.impl.SequenceTypeImpl
   * @see org.waml.w3c.webidl.webIDL.impl.WebIDLPackageImpl#getSequenceType()
   * @generated
   */
  int SEQUENCE_TYPE = 7;

  /**
   * The feature id for the '<em><b>Is Array</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEQUENCE_TYPE__IS_ARRAY = TYPE_REF__IS_ARRAY;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEQUENCE_TYPE__TYPE = TYPE_REF_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Nullable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEQUENCE_TYPE__NULLABLE = TYPE_REF_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Sequence Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEQUENCE_TYPE_FEATURE_COUNT = TYPE_REF_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.waml.w3c.webidl.webIDL.impl.CallableImpl <em>Callable</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.waml.w3c.webidl.webIDL.impl.CallableImpl
   * @see org.waml.w3c.webidl.webIDL.impl.WebIDLPackageImpl#getCallable()
   * @generated
   */
  int CALLABLE = 8;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CALLABLE__TARGET = 0;

  /**
   * The number of structural features of the '<em>Callable</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CALLABLE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.waml.w3c.webidl.webIDL.impl.InterfaceExtendedAttributeImpl <em>Interface Extended Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.waml.w3c.webidl.webIDL.impl.InterfaceExtendedAttributeImpl
   * @see org.waml.w3c.webidl.webIDL.impl.WebIDLPackageImpl#getInterfaceExtendedAttribute()
   * @generated
   */
  int INTERFACE_EXTENDED_ATTRIBUTE = 29;

  /**
   * The number of structural features of the '<em>Interface Extended Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_EXTENDED_ATTRIBUTE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.waml.w3c.webidl.webIDL.impl.NamedConstructorImpl <em>Named Constructor</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.waml.w3c.webidl.webIDL.impl.NamedConstructorImpl
   * @see org.waml.w3c.webidl.webIDL.impl.WebIDLPackageImpl#getNamedConstructor()
   * @generated
   */
  int NAMED_CONSTRUCTOR = 10;

  /**
   * The number of structural features of the '<em>Named Constructor</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMED_CONSTRUCTOR_FEATURE_COUNT = INTERFACE_EXTENDED_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.waml.w3c.webidl.webIDL.impl.ConstructorImpl <em>Constructor</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.waml.w3c.webidl.webIDL.impl.ConstructorImpl
   * @see org.waml.w3c.webidl.webIDL.impl.WebIDLPackageImpl#getConstructor()
   * @generated
   */
  int CONSTRUCTOR = 9;

  /**
   * The feature id for the '<em><b>Arguments</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRUCTOR__ARGUMENTS = NAMED_CONSTRUCTOR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRUCTOR__NAME = NAMED_CONSTRUCTOR_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Constructor</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRUCTOR_FEATURE_COUNT = NAMED_CONSTRUCTOR_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.waml.w3c.webidl.webIDL.impl.CallbackImpl <em>Callback</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.waml.w3c.webidl.webIDL.impl.CallbackImpl
   * @see org.waml.w3c.webidl.webIDL.impl.WebIDLPackageImpl#getCallback()
   * @generated
   */
  int CALLBACK = 11;

  /**
   * The feature id for the '<em><b>Function Only</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CALLBACK__FUNCTION_ONLY = INTERFACE_EXTENDED_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Property Only</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CALLBACK__PROPERTY_ONLY = INTERFACE_EXTENDED_ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Callback</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CALLBACK_FEATURE_COUNT = INTERFACE_EXTENDED_ATTRIBUTE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.waml.w3c.webidl.webIDL.impl.NoInterfaceObjectImpl <em>No Interface Object</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.waml.w3c.webidl.webIDL.impl.NoInterfaceObjectImpl
   * @see org.waml.w3c.webidl.webIDL.impl.WebIDLPackageImpl#getNoInterfaceObject()
   * @generated
   */
  int NO_INTERFACE_OBJECT = 12;

  /**
   * The number of structural features of the '<em>No Interface Object</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NO_INTERFACE_OBJECT_FEATURE_COUNT = INTERFACE_EXTENDED_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.waml.w3c.webidl.webIDL.impl.PrototypeRootImpl <em>Prototype Root</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.waml.w3c.webidl.webIDL.impl.PrototypeRootImpl
   * @see org.waml.w3c.webidl.webIDL.impl.WebIDLPackageImpl#getPrototypeRoot()
   * @generated
   */
  int PROTOTYPE_ROOT = 13;

  /**
   * The number of structural features of the '<em>Prototype Root</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROTOTYPE_ROOT_FEATURE_COUNT = INTERFACE_EXTENDED_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.waml.w3c.webidl.webIDL.impl.AttributeExtendedAttributeImpl <em>Attribute Extended Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.waml.w3c.webidl.webIDL.impl.AttributeExtendedAttributeImpl
   * @see org.waml.w3c.webidl.webIDL.impl.WebIDLPackageImpl#getAttributeExtendedAttribute()
   * @generated
   */
  int ATTRIBUTE_EXTENDED_ATTRIBUTE = 36;

  /**
   * The number of structural features of the '<em>Attribute Extended Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_EXTENDED_ATTRIBUTE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.waml.w3c.webidl.webIDL.impl.PutForwardsImpl <em>Put Forwards</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.waml.w3c.webidl.webIDL.impl.PutForwardsImpl
   * @see org.waml.w3c.webidl.webIDL.impl.WebIDLPackageImpl#getPutForwards()
   * @generated
   */
  int PUT_FORWARDS = 14;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PUT_FORWARDS__TARGET = ATTRIBUTE_EXTENDED_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Put Forwards</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PUT_FORWARDS_FEATURE_COUNT = ATTRIBUTE_EXTENDED_ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.waml.w3c.webidl.webIDL.impl.OperationExtendedAttributeImpl <em>Operation Extended Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.waml.w3c.webidl.webIDL.impl.OperationExtendedAttributeImpl
   * @see org.waml.w3c.webidl.webIDL.impl.WebIDLPackageImpl#getOperationExtendedAttribute()
   * @generated
   */
  int OPERATION_EXTENDED_ATTRIBUTE = 33;

  /**
   * The number of structural features of the '<em>Operation Extended Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION_EXTENDED_ATTRIBUTE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.waml.w3c.webidl.webIDL.impl.TreatNullAsImpl <em>Treat Null As</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.waml.w3c.webidl.webIDL.impl.TreatNullAsImpl
   * @see org.waml.w3c.webidl.webIDL.impl.WebIDLPackageImpl#getTreatNullAs()
   * @generated
   */
  int TREAT_NULL_AS = 15;

  /**
   * The number of structural features of the '<em>Treat Null As</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TREAT_NULL_AS_FEATURE_COUNT = OPERATION_EXTENDED_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.waml.w3c.webidl.webIDL.impl.TreatUndefinedAsImpl <em>Treat Undefined As</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.waml.w3c.webidl.webIDL.impl.TreatUndefinedAsImpl
   * @see org.waml.w3c.webidl.webIDL.impl.WebIDLPackageImpl#getTreatUndefinedAs()
   * @generated
   */
  int TREAT_UNDEFINED_AS = 16;

  /**
   * The feature id for the '<em><b>As Empty String</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TREAT_UNDEFINED_AS__AS_EMPTY_STRING = OPERATION_EXTENDED_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>As Null</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TREAT_UNDEFINED_AS__AS_NULL = OPERATION_EXTENDED_ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Treat Undefined As</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TREAT_UNDEFINED_AS_FEATURE_COUNT = OPERATION_EXTENDED_ATTRIBUTE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.waml.w3c.webidl.webIDL.impl.ArgumentExtendedAttributeImpl <em>Argument Extended Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.waml.w3c.webidl.webIDL.impl.ArgumentExtendedAttributeImpl
   * @see org.waml.w3c.webidl.webIDL.impl.WebIDLPackageImpl#getArgumentExtendedAttribute()
   * @generated
   */
  int ARGUMENT_EXTENDED_ATTRIBUTE = 42;

  /**
   * The number of structural features of the '<em>Argument Extended Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARGUMENT_EXTENDED_ATTRIBUTE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.waml.w3c.webidl.webIDL.impl.AllowAnyImpl <em>Allow Any</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.waml.w3c.webidl.webIDL.impl.AllowAnyImpl
   * @see org.waml.w3c.webidl.webIDL.impl.WebIDLPackageImpl#getAllowAny()
   * @generated
   */
  int ALLOW_ANY = 17;

  /**
   * The number of structural features of the '<em>Allow Any</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALLOW_ANY_FEATURE_COUNT = ARGUMENT_EXTENDED_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.waml.w3c.webidl.webIDL.impl.ReplaceableImpl <em>Replaceable</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.waml.w3c.webidl.webIDL.impl.ReplaceableImpl
   * @see org.waml.w3c.webidl.webIDL.impl.WebIDLPackageImpl#getReplaceable()
   * @generated
   */
  int REPLACEABLE = 18;

  /**
   * The number of structural features of the '<em>Replaceable</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPLACEABLE_FEATURE_COUNT = ATTRIBUTE_EXTENDED_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.waml.w3c.webidl.webIDL.impl.SupplementalImpl <em>Supplemental</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.waml.w3c.webidl.webIDL.impl.SupplementalImpl
   * @see org.waml.w3c.webidl.webIDL.impl.WebIDLPackageImpl#getSupplemental()
   * @generated
   */
  int SUPPLEMENTAL = 19;

  /**
   * The number of structural features of the '<em>Supplemental</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUPPLEMENTAL_FEATURE_COUNT = INTERFACE_EXTENDED_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.waml.w3c.webidl.webIDL.impl.ReplaceableNamedPropertiesImpl <em>Replaceable Named Properties</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.waml.w3c.webidl.webIDL.impl.ReplaceableNamedPropertiesImpl
   * @see org.waml.w3c.webidl.webIDL.impl.WebIDLPackageImpl#getReplaceableNamedProperties()
   * @generated
   */
  int REPLACEABLE_NAMED_PROPERTIES = 20;

  /**
   * The number of structural features of the '<em>Replaceable Named Properties</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPLACEABLE_NAMED_PROPERTIES_FEATURE_COUNT = INTERFACE_EXTENDED_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.waml.w3c.webidl.webIDL.impl.AbstractDefinitionsImpl <em>Abstract Definitions</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.waml.w3c.webidl.webIDL.impl.AbstractDefinitionsImpl
   * @see org.waml.w3c.webidl.webIDL.impl.WebIDLPackageImpl#getAbstractDefinitions()
   * @generated
   */
  int ABSTRACT_DEFINITIONS = 21;

  /**
   * The number of structural features of the '<em>Abstract Definitions</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_DEFINITIONS_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.waml.w3c.webidl.webIDL.impl.DefinitionsImpl <em>Definitions</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.waml.w3c.webidl.webIDL.impl.DefinitionsImpl
   * @see org.waml.w3c.webidl.webIDL.impl.WebIDLPackageImpl#getDefinitions()
   * @generated
   */
  int DEFINITIONS = 22;

  /**
   * The number of structural features of the '<em>Definitions</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFINITIONS_FEATURE_COUNT = ABSTRACT_DEFINITIONS_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.waml.w3c.webidl.webIDL.impl.ImplementStatementImpl <em>Implement Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.waml.w3c.webidl.webIDL.impl.ImplementStatementImpl
   * @see org.waml.w3c.webidl.webIDL.impl.WebIDLPackageImpl#getImplementStatement()
   * @generated
   */
  int IMPLEMENT_STATEMENT = 23;

  /**
   * The feature id for the '<em><b>Source</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPLEMENT_STATEMENT__SOURCE = DEFINITIONS_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPLEMENT_STATEMENT__TARGET = DEFINITIONS_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Implement Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPLEMENT_STATEMENT_FEATURE_COUNT = DEFINITIONS_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.waml.w3c.webidl.webIDL.impl.ModuleImpl <em>Module</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.waml.w3c.webidl.webIDL.impl.ModuleImpl
   * @see org.waml.w3c.webidl.webIDL.impl.WebIDLPackageImpl#getModule()
   * @generated
   */
  int MODULE = 24;

  /**
   * The feature id for the '<em><b>Extended Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE__EXTENDED_ATTRIBUTES = ABSTRACT_DEFINITIONS_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE__NAME = ABSTRACT_DEFINITIONS_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Definitions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE__DEFINITIONS = ABSTRACT_DEFINITIONS_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Module</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE_FEATURE_COUNT = ABSTRACT_DEFINITIONS_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.waml.w3c.webidl.webIDL.impl.ModuleExtendedAttributeImpl <em>Module Extended Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.waml.w3c.webidl.webIDL.impl.ModuleExtendedAttributeImpl
   * @see org.waml.w3c.webidl.webIDL.impl.WebIDLPackageImpl#getModuleExtendedAttribute()
   * @generated
   */
  int MODULE_EXTENDED_ATTRIBUTE = 25;

  /**
   * The number of structural features of the '<em>Module Extended Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE_EXTENDED_ATTRIBUTE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.waml.w3c.webidl.webIDL.impl.PrefixImpl <em>Prefix</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.waml.w3c.webidl.webIDL.impl.PrefixImpl
   * @see org.waml.w3c.webidl.webIDL.impl.WebIDLPackageImpl#getPrefix()
   * @generated
   */
  int PREFIX = 26;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREFIX__VALUE = MODULE_EXTENDED_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Prefix</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREFIX_FEATURE_COUNT = MODULE_EXTENDED_ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.waml.w3c.webidl.webIDL.impl.NamespaceObjectImpl <em>Namespace Object</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.waml.w3c.webidl.webIDL.impl.NamespaceObjectImpl
   * @see org.waml.w3c.webidl.webIDL.impl.WebIDLPackageImpl#getNamespaceObject()
   * @generated
   */
  int NAMESPACE_OBJECT = 27;

  /**
   * The number of structural features of the '<em>Namespace Object</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMESPACE_OBJECT_FEATURE_COUNT = MODULE_EXTENDED_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.waml.w3c.webidl.webIDL.impl.InterfaceImpl <em>Interface</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.waml.w3c.webidl.webIDL.impl.InterfaceImpl
   * @see org.waml.w3c.webidl.webIDL.impl.WebIDLPackageImpl#getInterface()
   * @generated
   */
  int INTERFACE = 28;

  /**
   * The feature id for the '<em><b>Extended Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE__EXTENDED_ATTRIBUTES = TYPES_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Extended Attribute</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE__EXTENDED_ATTRIBUTE = TYPES_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE__NAME = TYPES_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Super Type</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE__SUPER_TYPE = TYPES_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Members</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE__MEMBERS = TYPES_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>Interface</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_FEATURE_COUNT = TYPES_FEATURE_COUNT + 5;

  /**
   * The meta object id for the '{@link org.waml.w3c.webidl.webIDL.impl.InterfaceMemberImpl <em>Interface Member</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.waml.w3c.webidl.webIDL.impl.InterfaceMemberImpl
   * @see org.waml.w3c.webidl.webIDL.impl.WebIDLPackageImpl#getInterfaceMember()
   * @generated
   */
  int INTERFACE_MEMBER = 30;

  /**
   * The number of structural features of the '<em>Interface Member</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_MEMBER_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.waml.w3c.webidl.webIDL.impl.InterfaceFeatureImpl <em>Interface Feature</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.waml.w3c.webidl.webIDL.impl.InterfaceFeatureImpl
   * @see org.waml.w3c.webidl.webIDL.impl.WebIDLPackageImpl#getInterfaceFeature()
   * @generated
   */
  int INTERFACE_FEATURE = 31;

  /**
   * The feature id for the '<em><b>Stringifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_FEATURE__STRINGIFIER = TYPES_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_FEATURE__NAME = TYPES_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Interface Feature</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_FEATURE_FEATURE_COUNT = TYPES_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.waml.w3c.webidl.webIDL.impl.OperationImpl <em>Operation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.waml.w3c.webidl.webIDL.impl.OperationImpl
   * @see org.waml.w3c.webidl.webIDL.impl.WebIDLPackageImpl#getOperation()
   * @generated
   */
  int OPERATION = 32;

  /**
   * The feature id for the '<em><b>Stringifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION__STRINGIFIER = INTERFACE_FEATURE__STRINGIFIER;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION__NAME = INTERFACE_FEATURE__NAME;

  /**
   * The feature id for the '<em><b>Extended Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION__EXTENDED_ATTRIBUTES = INTERFACE_FEATURE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Omittable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION__OMITTABLE = INTERFACE_FEATURE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Specials</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION__SPECIALS = INTERFACE_FEATURE_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Return</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION__RETURN = INTERFACE_FEATURE_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Arguments</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION__ARGUMENTS = INTERFACE_FEATURE_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Raises</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION__RAISES = INTERFACE_FEATURE_FEATURE_COUNT + 5;

  /**
   * The number of structural features of the '<em>Operation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION_FEATURE_COUNT = INTERFACE_FEATURE_FEATURE_COUNT + 6;

  /**
   * The meta object id for the '{@link org.waml.w3c.webidl.webIDL.impl.OperationSpecialImpl <em>Operation Special</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.waml.w3c.webidl.webIDL.impl.OperationSpecialImpl
   * @see org.waml.w3c.webidl.webIDL.impl.WebIDLPackageImpl#getOperationSpecial()
   * @generated
   */
  int OPERATION_SPECIAL = 34;

  /**
   * The number of structural features of the '<em>Operation Special</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION_SPECIAL_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.waml.w3c.webidl.webIDL.impl.AttributeImpl <em>Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.waml.w3c.webidl.webIDL.impl.AttributeImpl
   * @see org.waml.w3c.webidl.webIDL.impl.WebIDLPackageImpl#getAttribute()
   * @generated
   */
  int ATTRIBUTE = 35;

  /**
   * The feature id for the '<em><b>Stringifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__STRINGIFIER = INTERFACE_FEATURE__STRINGIFIER;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__NAME = INTERFACE_FEATURE__NAME;

  /**
   * The feature id for the '<em><b>Extended Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__EXTENDED_ATTRIBUTES = INTERFACE_FEATURE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__TYPE = INTERFACE_FEATURE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Get Raises</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__GET_RAISES = INTERFACE_FEATURE_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Set Raises</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__SET_RAISES = INTERFACE_FEATURE_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_FEATURE_COUNT = INTERFACE_FEATURE_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link org.waml.w3c.webidl.webIDL.impl.ExceptionImpl <em>Exception</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.waml.w3c.webidl.webIDL.impl.ExceptionImpl
   * @see org.waml.w3c.webidl.webIDL.impl.WebIDLPackageImpl#getException()
   * @generated
   */
  int EXCEPTION = 37;

  /**
   * The feature id for the '<em><b>Extended Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXCEPTION__EXTENDED_ATTRIBUTES = DEFINITIONS_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXCEPTION__NAME = DEFINITIONS_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Members</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXCEPTION__MEMBERS = DEFINITIONS_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Exception</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXCEPTION_FEATURE_COUNT = DEFINITIONS_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.waml.w3c.webidl.webIDL.impl.ExceptionMemberImpl <em>Exception Member</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.waml.w3c.webidl.webIDL.impl.ExceptionMemberImpl
   * @see org.waml.w3c.webidl.webIDL.impl.WebIDLPackageImpl#getExceptionMember()
   * @generated
   */
  int EXCEPTION_MEMBER = 38;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXCEPTION_MEMBER__TYPE = 0;

  /**
   * The number of structural features of the '<em>Exception Member</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXCEPTION_MEMBER_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.waml.w3c.webidl.webIDL.impl.ExceptionFieldImpl <em>Exception Field</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.waml.w3c.webidl.webIDL.impl.ExceptionFieldImpl
   * @see org.waml.w3c.webidl.webIDL.impl.WebIDLPackageImpl#getExceptionField()
   * @generated
   */
  int EXCEPTION_FIELD = 39;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXCEPTION_FIELD__TYPE = EXCEPTION_MEMBER__TYPE;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXCEPTION_FIELD__NAME = EXCEPTION_MEMBER_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Exception Field</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXCEPTION_FIELD_FEATURE_COUNT = EXCEPTION_MEMBER_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.waml.w3c.webidl.webIDL.impl.ExceptionExtendedAttributeImpl <em>Exception Extended Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.waml.w3c.webidl.webIDL.impl.ExceptionExtendedAttributeImpl
   * @see org.waml.w3c.webidl.webIDL.impl.WebIDLPackageImpl#getExceptionExtendedAttribute()
   * @generated
   */
  int EXCEPTION_EXTENDED_ATTRIBUTE = 40;

  /**
   * The number of structural features of the '<em>Exception Extended Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXCEPTION_EXTENDED_ATTRIBUTE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.waml.w3c.webidl.webIDL.impl.ArgumentImpl <em>Argument</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.waml.w3c.webidl.webIDL.impl.ArgumentImpl
   * @see org.waml.w3c.webidl.webIDL.impl.WebIDLPackageImpl#getArgument()
   * @generated
   */
  int ARGUMENT = 41;

  /**
   * The feature id for the '<em><b>Extended Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARGUMENT__EXTENDED_ATTRIBUTES = 0;

  /**
   * The feature id for the '<em><b>In</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARGUMENT__IN = 1;

  /**
   * The feature id for the '<em><b>Optional</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARGUMENT__OPTIONAL = 2;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARGUMENT__TYPE = 3;

  /**
   * The feature id for the '<em><b>Ellipsis</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARGUMENT__ELLIPSIS = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARGUMENT__NAME = 5;

  /**
   * The number of structural features of the '<em>Argument</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARGUMENT_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link org.waml.w3c.webidl.webIDL.impl.ConstImpl <em>Const</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.waml.w3c.webidl.webIDL.impl.ConstImpl
   * @see org.waml.w3c.webidl.webIDL.impl.WebIDLPackageImpl#getConst()
   * @generated
   */
  int CONST = 43;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONST__TYPE = INTERFACE_MEMBER_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONST__NAME = INTERFACE_MEMBER_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONST__EXPR = INTERFACE_MEMBER_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Const</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONST_FEATURE_COUNT = INTERFACE_MEMBER_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.waml.w3c.webidl.webIDL.impl.ConstExprImpl <em>Const Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.waml.w3c.webidl.webIDL.impl.ConstExprImpl
   * @see org.waml.w3c.webidl.webIDL.impl.WebIDLPackageImpl#getConstExpr()
   * @generated
   */
  int CONST_EXPR = 44;

  /**
   * The number of structural features of the '<em>Const Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONST_EXPR_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.waml.w3c.webidl.webIDL.impl.OperationSpecialGetterImpl <em>Operation Special Getter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.waml.w3c.webidl.webIDL.impl.OperationSpecialGetterImpl
   * @see org.waml.w3c.webidl.webIDL.impl.WebIDLPackageImpl#getOperationSpecialGetter()
   * @generated
   */
  int OPERATION_SPECIAL_GETTER = 45;

  /**
   * The number of structural features of the '<em>Operation Special Getter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION_SPECIAL_GETTER_FEATURE_COUNT = OPERATION_SPECIAL_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.waml.w3c.webidl.webIDL.impl.OperationSpecialSetterImpl <em>Operation Special Setter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.waml.w3c.webidl.webIDL.impl.OperationSpecialSetterImpl
   * @see org.waml.w3c.webidl.webIDL.impl.WebIDLPackageImpl#getOperationSpecialSetter()
   * @generated
   */
  int OPERATION_SPECIAL_SETTER = 46;

  /**
   * The number of structural features of the '<em>Operation Special Setter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION_SPECIAL_SETTER_FEATURE_COUNT = OPERATION_SPECIAL_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.waml.w3c.webidl.webIDL.impl.OperationSpecialCreatorImpl <em>Operation Special Creator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.waml.w3c.webidl.webIDL.impl.OperationSpecialCreatorImpl
   * @see org.waml.w3c.webidl.webIDL.impl.WebIDLPackageImpl#getOperationSpecialCreator()
   * @generated
   */
  int OPERATION_SPECIAL_CREATOR = 47;

  /**
   * The number of structural features of the '<em>Operation Special Creator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION_SPECIAL_CREATOR_FEATURE_COUNT = OPERATION_SPECIAL_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.waml.w3c.webidl.webIDL.impl.OperationSpecialDeleterImpl <em>Operation Special Deleter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.waml.w3c.webidl.webIDL.impl.OperationSpecialDeleterImpl
   * @see org.waml.w3c.webidl.webIDL.impl.WebIDLPackageImpl#getOperationSpecialDeleter()
   * @generated
   */
  int OPERATION_SPECIAL_DELETER = 48;

  /**
   * The number of structural features of the '<em>Operation Special Deleter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION_SPECIAL_DELETER_FEATURE_COUNT = OPERATION_SPECIAL_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.waml.w3c.webidl.webIDL.impl.OperationSpecialCallerImpl <em>Operation Special Caller</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.waml.w3c.webidl.webIDL.impl.OperationSpecialCallerImpl
   * @see org.waml.w3c.webidl.webIDL.impl.WebIDLPackageImpl#getOperationSpecialCaller()
   * @generated
   */
  int OPERATION_SPECIAL_CALLER = 49;

  /**
   * The number of structural features of the '<em>Operation Special Caller</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION_SPECIAL_CALLER_FEATURE_COUNT = OPERATION_SPECIAL_FEATURE_COUNT + 0;


  /**
   * Returns the meta object for class '{@link org.waml.w3c.webidl.webIDL.IDLDefinitions <em>IDL Definitions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>IDL Definitions</em>'.
   * @see org.waml.w3c.webidl.webIDL.IDLDefinitions
   * @generated
   */
  EClass getIDLDefinitions();

  /**
   * Returns the meta object for the containment reference list '{@link org.waml.w3c.webidl.webIDL.IDLDefinitions#getImports <em>Imports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Imports</em>'.
   * @see org.waml.w3c.webidl.webIDL.IDLDefinitions#getImports()
   * @see #getIDLDefinitions()
   * @generated
   */
  EReference getIDLDefinitions_Imports();

  /**
   * Returns the meta object for the containment reference list '{@link org.waml.w3c.webidl.webIDL.IDLDefinitions#getDefinitions <em>Definitions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Definitions</em>'.
   * @see org.waml.w3c.webidl.webIDL.IDLDefinitions#getDefinitions()
   * @see #getIDLDefinitions()
   * @generated
   */
  EReference getIDLDefinitions_Definitions();

  /**
   * Returns the meta object for class '{@link org.waml.w3c.webidl.webIDL.Import <em>Import</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Import</em>'.
   * @see org.waml.w3c.webidl.webIDL.Import
   * @generated
   */
  EClass getImport();

  /**
   * Returns the meta object for the attribute '{@link org.waml.w3c.webidl.webIDL.Import#getImportURI <em>Import URI</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Import URI</em>'.
   * @see org.waml.w3c.webidl.webIDL.Import#getImportURI()
   * @see #getImport()
   * @generated
   */
  EAttribute getImport_ImportURI();

  /**
   * Returns the meta object for class '{@link org.waml.w3c.webidl.webIDL.TypeDef <em>Type Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type Def</em>'.
   * @see org.waml.w3c.webidl.webIDL.TypeDef
   * @generated
   */
  EClass getTypeDef();

  /**
   * Returns the meta object for the containment reference '{@link org.waml.w3c.webidl.webIDL.TypeDef#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.waml.w3c.webidl.webIDL.TypeDef#getType()
   * @see #getTypeDef()
   * @generated
   */
  EReference getTypeDef_Type();

  /**
   * Returns the meta object for the attribute '{@link org.waml.w3c.webidl.webIDL.TypeDef#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.waml.w3c.webidl.webIDL.TypeDef#getName()
   * @see #getTypeDef()
   * @generated
   */
  EAttribute getTypeDef_Name();

  /**
   * Returns the meta object for class '{@link org.waml.w3c.webidl.webIDL.TypeRef <em>Type Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type Ref</em>'.
   * @see org.waml.w3c.webidl.webIDL.TypeRef
   * @generated
   */
  EClass getTypeRef();

  /**
   * Returns the meta object for the attribute '{@link org.waml.w3c.webidl.webIDL.TypeRef#isIsArray <em>Is Array</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Array</em>'.
   * @see org.waml.w3c.webidl.webIDL.TypeRef#isIsArray()
   * @see #getTypeRef()
   * @generated
   */
  EAttribute getTypeRef_IsArray();

  /**
   * Returns the meta object for class '{@link org.waml.w3c.webidl.webIDL.UserTypeRef <em>User Type Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>User Type Ref</em>'.
   * @see org.waml.w3c.webidl.webIDL.UserTypeRef
   * @generated
   */
  EClass getUserTypeRef();

  /**
   * Returns the meta object for the reference '{@link org.waml.w3c.webidl.webIDL.UserTypeRef#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see org.waml.w3c.webidl.webIDL.UserTypeRef#getType()
   * @see #getUserTypeRef()
   * @generated
   */
  EReference getUserTypeRef_Type();

  /**
   * Returns the meta object for class '{@link org.waml.w3c.webidl.webIDL.Types <em>Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Types</em>'.
   * @see org.waml.w3c.webidl.webIDL.Types
   * @generated
   */
  EClass getTypes();

  /**
   * Returns the meta object for class '{@link org.waml.w3c.webidl.webIDL.PrimitiveTypeRef <em>Primitive Type Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Primitive Type Ref</em>'.
   * @see org.waml.w3c.webidl.webIDL.PrimitiveTypeRef
   * @generated
   */
  EClass getPrimitiveTypeRef();

  /**
   * Returns the meta object for the attribute '{@link org.waml.w3c.webidl.webIDL.PrimitiveTypeRef#isUnsigned <em>Unsigned</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Unsigned</em>'.
   * @see org.waml.w3c.webidl.webIDL.PrimitiveTypeRef#isUnsigned()
   * @see #getPrimitiveTypeRef()
   * @generated
   */
  EAttribute getPrimitiveTypeRef_Unsigned();

  /**
   * Returns the meta object for the attribute '{@link org.waml.w3c.webidl.webIDL.PrimitiveTypeRef#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.waml.w3c.webidl.webIDL.PrimitiveTypeRef#getName()
   * @see #getPrimitiveTypeRef()
   * @generated
   */
  EAttribute getPrimitiveTypeRef_Name();

  /**
   * Returns the meta object for the attribute '{@link org.waml.w3c.webidl.webIDL.PrimitiveTypeRef#isNullable <em>Nullable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Nullable</em>'.
   * @see org.waml.w3c.webidl.webIDL.PrimitiveTypeRef#isNullable()
   * @see #getPrimitiveTypeRef()
   * @generated
   */
  EAttribute getPrimitiveTypeRef_Nullable();

  /**
   * Returns the meta object for class '{@link org.waml.w3c.webidl.webIDL.SequenceType <em>Sequence Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sequence Type</em>'.
   * @see org.waml.w3c.webidl.webIDL.SequenceType
   * @generated
   */
  EClass getSequenceType();

  /**
   * Returns the meta object for the containment reference '{@link org.waml.w3c.webidl.webIDL.SequenceType#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.waml.w3c.webidl.webIDL.SequenceType#getType()
   * @see #getSequenceType()
   * @generated
   */
  EReference getSequenceType_Type();

  /**
   * Returns the meta object for the attribute '{@link org.waml.w3c.webidl.webIDL.SequenceType#isNullable <em>Nullable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Nullable</em>'.
   * @see org.waml.w3c.webidl.webIDL.SequenceType#isNullable()
   * @see #getSequenceType()
   * @generated
   */
  EAttribute getSequenceType_Nullable();

  /**
   * Returns the meta object for class '{@link org.waml.w3c.webidl.webIDL.Callable <em>Callable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Callable</em>'.
   * @see org.waml.w3c.webidl.webIDL.Callable
   * @generated
   */
  EClass getCallable();

  /**
   * Returns the meta object for the reference '{@link org.waml.w3c.webidl.webIDL.Callable#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Target</em>'.
   * @see org.waml.w3c.webidl.webIDL.Callable#getTarget()
   * @see #getCallable()
   * @generated
   */
  EReference getCallable_Target();

  /**
   * Returns the meta object for class '{@link org.waml.w3c.webidl.webIDL.Constructor <em>Constructor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Constructor</em>'.
   * @see org.waml.w3c.webidl.webIDL.Constructor
   * @generated
   */
  EClass getConstructor();

  /**
   * Returns the meta object for the containment reference list '{@link org.waml.w3c.webidl.webIDL.Constructor#getArguments <em>Arguments</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Arguments</em>'.
   * @see org.waml.w3c.webidl.webIDL.Constructor#getArguments()
   * @see #getConstructor()
   * @generated
   */
  EReference getConstructor_Arguments();

  /**
   * Returns the meta object for the attribute '{@link org.waml.w3c.webidl.webIDL.Constructor#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.waml.w3c.webidl.webIDL.Constructor#getName()
   * @see #getConstructor()
   * @generated
   */
  EAttribute getConstructor_Name();

  /**
   * Returns the meta object for class '{@link org.waml.w3c.webidl.webIDL.NamedConstructor <em>Named Constructor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Named Constructor</em>'.
   * @see org.waml.w3c.webidl.webIDL.NamedConstructor
   * @generated
   */
  EClass getNamedConstructor();

  /**
   * Returns the meta object for class '{@link org.waml.w3c.webidl.webIDL.Callback <em>Callback</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Callback</em>'.
   * @see org.waml.w3c.webidl.webIDL.Callback
   * @generated
   */
  EClass getCallback();

  /**
   * Returns the meta object for the attribute '{@link org.waml.w3c.webidl.webIDL.Callback#isFunctionOnly <em>Function Only</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Function Only</em>'.
   * @see org.waml.w3c.webidl.webIDL.Callback#isFunctionOnly()
   * @see #getCallback()
   * @generated
   */
  EAttribute getCallback_FunctionOnly();

  /**
   * Returns the meta object for the attribute '{@link org.waml.w3c.webidl.webIDL.Callback#isPropertyOnly <em>Property Only</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Property Only</em>'.
   * @see org.waml.w3c.webidl.webIDL.Callback#isPropertyOnly()
   * @see #getCallback()
   * @generated
   */
  EAttribute getCallback_PropertyOnly();

  /**
   * Returns the meta object for class '{@link org.waml.w3c.webidl.webIDL.NoInterfaceObject <em>No Interface Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>No Interface Object</em>'.
   * @see org.waml.w3c.webidl.webIDL.NoInterfaceObject
   * @generated
   */
  EClass getNoInterfaceObject();

  /**
   * Returns the meta object for class '{@link org.waml.w3c.webidl.webIDL.PrototypeRoot <em>Prototype Root</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Prototype Root</em>'.
   * @see org.waml.w3c.webidl.webIDL.PrototypeRoot
   * @generated
   */
  EClass getPrototypeRoot();

  /**
   * Returns the meta object for class '{@link org.waml.w3c.webidl.webIDL.PutForwards <em>Put Forwards</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Put Forwards</em>'.
   * @see org.waml.w3c.webidl.webIDL.PutForwards
   * @generated
   */
  EClass getPutForwards();

  /**
   * Returns the meta object for the reference '{@link org.waml.w3c.webidl.webIDL.PutForwards#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Target</em>'.
   * @see org.waml.w3c.webidl.webIDL.PutForwards#getTarget()
   * @see #getPutForwards()
   * @generated
   */
  EReference getPutForwards_Target();

  /**
   * Returns the meta object for class '{@link org.waml.w3c.webidl.webIDL.TreatNullAs <em>Treat Null As</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Treat Null As</em>'.
   * @see org.waml.w3c.webidl.webIDL.TreatNullAs
   * @generated
   */
  EClass getTreatNullAs();

  /**
   * Returns the meta object for class '{@link org.waml.w3c.webidl.webIDL.TreatUndefinedAs <em>Treat Undefined As</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Treat Undefined As</em>'.
   * @see org.waml.w3c.webidl.webIDL.TreatUndefinedAs
   * @generated
   */
  EClass getTreatUndefinedAs();

  /**
   * Returns the meta object for the attribute '{@link org.waml.w3c.webidl.webIDL.TreatUndefinedAs#isAsEmptyString <em>As Empty String</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>As Empty String</em>'.
   * @see org.waml.w3c.webidl.webIDL.TreatUndefinedAs#isAsEmptyString()
   * @see #getTreatUndefinedAs()
   * @generated
   */
  EAttribute getTreatUndefinedAs_AsEmptyString();

  /**
   * Returns the meta object for the attribute '{@link org.waml.w3c.webidl.webIDL.TreatUndefinedAs#isAsNull <em>As Null</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>As Null</em>'.
   * @see org.waml.w3c.webidl.webIDL.TreatUndefinedAs#isAsNull()
   * @see #getTreatUndefinedAs()
   * @generated
   */
  EAttribute getTreatUndefinedAs_AsNull();

  /**
   * Returns the meta object for class '{@link org.waml.w3c.webidl.webIDL.AllowAny <em>Allow Any</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Allow Any</em>'.
   * @see org.waml.w3c.webidl.webIDL.AllowAny
   * @generated
   */
  EClass getAllowAny();

  /**
   * Returns the meta object for class '{@link org.waml.w3c.webidl.webIDL.Replaceable <em>Replaceable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Replaceable</em>'.
   * @see org.waml.w3c.webidl.webIDL.Replaceable
   * @generated
   */
  EClass getReplaceable();

  /**
   * Returns the meta object for class '{@link org.waml.w3c.webidl.webIDL.Supplemental <em>Supplemental</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Supplemental</em>'.
   * @see org.waml.w3c.webidl.webIDL.Supplemental
   * @generated
   */
  EClass getSupplemental();

  /**
   * Returns the meta object for class '{@link org.waml.w3c.webidl.webIDL.ReplaceableNamedProperties <em>Replaceable Named Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Replaceable Named Properties</em>'.
   * @see org.waml.w3c.webidl.webIDL.ReplaceableNamedProperties
   * @generated
   */
  EClass getReplaceableNamedProperties();

  /**
   * Returns the meta object for class '{@link org.waml.w3c.webidl.webIDL.AbstractDefinitions <em>Abstract Definitions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Abstract Definitions</em>'.
   * @see org.waml.w3c.webidl.webIDL.AbstractDefinitions
   * @generated
   */
  EClass getAbstractDefinitions();

  /**
   * Returns the meta object for class '{@link org.waml.w3c.webidl.webIDL.Definitions <em>Definitions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Definitions</em>'.
   * @see org.waml.w3c.webidl.webIDL.Definitions
   * @generated
   */
  EClass getDefinitions();

  /**
   * Returns the meta object for class '{@link org.waml.w3c.webidl.webIDL.ImplementStatement <em>Implement Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Implement Statement</em>'.
   * @see org.waml.w3c.webidl.webIDL.ImplementStatement
   * @generated
   */
  EClass getImplementStatement();

  /**
   * Returns the meta object for the reference '{@link org.waml.w3c.webidl.webIDL.ImplementStatement#getSource <em>Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Source</em>'.
   * @see org.waml.w3c.webidl.webIDL.ImplementStatement#getSource()
   * @see #getImplementStatement()
   * @generated
   */
  EReference getImplementStatement_Source();

  /**
   * Returns the meta object for the reference '{@link org.waml.w3c.webidl.webIDL.ImplementStatement#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Target</em>'.
   * @see org.waml.w3c.webidl.webIDL.ImplementStatement#getTarget()
   * @see #getImplementStatement()
   * @generated
   */
  EReference getImplementStatement_Target();

  /**
   * Returns the meta object for class '{@link org.waml.w3c.webidl.webIDL.Module <em>Module</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Module</em>'.
   * @see org.waml.w3c.webidl.webIDL.Module
   * @generated
   */
  EClass getModule();

  /**
   * Returns the meta object for the containment reference list '{@link org.waml.w3c.webidl.webIDL.Module#getExtendedAttributes <em>Extended Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Extended Attributes</em>'.
   * @see org.waml.w3c.webidl.webIDL.Module#getExtendedAttributes()
   * @see #getModule()
   * @generated
   */
  EReference getModule_ExtendedAttributes();

  /**
   * Returns the meta object for the attribute '{@link org.waml.w3c.webidl.webIDL.Module#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.waml.w3c.webidl.webIDL.Module#getName()
   * @see #getModule()
   * @generated
   */
  EAttribute getModule_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.waml.w3c.webidl.webIDL.Module#getDefinitions <em>Definitions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Definitions</em>'.
   * @see org.waml.w3c.webidl.webIDL.Module#getDefinitions()
   * @see #getModule()
   * @generated
   */
  EReference getModule_Definitions();

  /**
   * Returns the meta object for class '{@link org.waml.w3c.webidl.webIDL.ModuleExtendedAttribute <em>Module Extended Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Module Extended Attribute</em>'.
   * @see org.waml.w3c.webidl.webIDL.ModuleExtendedAttribute
   * @generated
   */
  EClass getModuleExtendedAttribute();

  /**
   * Returns the meta object for class '{@link org.waml.w3c.webidl.webIDL.Prefix <em>Prefix</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Prefix</em>'.
   * @see org.waml.w3c.webidl.webIDL.Prefix
   * @generated
   */
  EClass getPrefix();

  /**
   * Returns the meta object for the attribute list '{@link org.waml.w3c.webidl.webIDL.Prefix#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Value</em>'.
   * @see org.waml.w3c.webidl.webIDL.Prefix#getValue()
   * @see #getPrefix()
   * @generated
   */
  EAttribute getPrefix_Value();

  /**
   * Returns the meta object for class '{@link org.waml.w3c.webidl.webIDL.NamespaceObject <em>Namespace Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Namespace Object</em>'.
   * @see org.waml.w3c.webidl.webIDL.NamespaceObject
   * @generated
   */
  EClass getNamespaceObject();

  /**
   * Returns the meta object for class '{@link org.waml.w3c.webidl.webIDL.Interface <em>Interface</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Interface</em>'.
   * @see org.waml.w3c.webidl.webIDL.Interface
   * @generated
   */
  EClass getInterface();

  /**
   * Returns the meta object for the containment reference list '{@link org.waml.w3c.webidl.webIDL.Interface#getExtendedAttributes <em>Extended Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Extended Attributes</em>'.
   * @see org.waml.w3c.webidl.webIDL.Interface#getExtendedAttributes()
   * @see #getInterface()
   * @generated
   */
  EReference getInterface_ExtendedAttributes();

  /**
   * Returns the meta object for the containment reference list '{@link org.waml.w3c.webidl.webIDL.Interface#getExtendedAttribute <em>Extended Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Extended Attribute</em>'.
   * @see org.waml.w3c.webidl.webIDL.Interface#getExtendedAttribute()
   * @see #getInterface()
   * @generated
   */
  EReference getInterface_ExtendedAttribute();

  /**
   * Returns the meta object for the attribute '{@link org.waml.w3c.webidl.webIDL.Interface#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.waml.w3c.webidl.webIDL.Interface#getName()
   * @see #getInterface()
   * @generated
   */
  EAttribute getInterface_Name();

  /**
   * Returns the meta object for the reference list '{@link org.waml.w3c.webidl.webIDL.Interface#getSuperType <em>Super Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Super Type</em>'.
   * @see org.waml.w3c.webidl.webIDL.Interface#getSuperType()
   * @see #getInterface()
   * @generated
   */
  EReference getInterface_SuperType();

  /**
   * Returns the meta object for the containment reference list '{@link org.waml.w3c.webidl.webIDL.Interface#getMembers <em>Members</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Members</em>'.
   * @see org.waml.w3c.webidl.webIDL.Interface#getMembers()
   * @see #getInterface()
   * @generated
   */
  EReference getInterface_Members();

  /**
   * Returns the meta object for class '{@link org.waml.w3c.webidl.webIDL.InterfaceExtendedAttribute <em>Interface Extended Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Interface Extended Attribute</em>'.
   * @see org.waml.w3c.webidl.webIDL.InterfaceExtendedAttribute
   * @generated
   */
  EClass getInterfaceExtendedAttribute();

  /**
   * Returns the meta object for class '{@link org.waml.w3c.webidl.webIDL.InterfaceMember <em>Interface Member</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Interface Member</em>'.
   * @see org.waml.w3c.webidl.webIDL.InterfaceMember
   * @generated
   */
  EClass getInterfaceMember();

  /**
   * Returns the meta object for class '{@link org.waml.w3c.webidl.webIDL.InterfaceFeature <em>Interface Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Interface Feature</em>'.
   * @see org.waml.w3c.webidl.webIDL.InterfaceFeature
   * @generated
   */
  EClass getInterfaceFeature();

  /**
   * Returns the meta object for the attribute '{@link org.waml.w3c.webidl.webIDL.InterfaceFeature#isStringifier <em>Stringifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Stringifier</em>'.
   * @see org.waml.w3c.webidl.webIDL.InterfaceFeature#isStringifier()
   * @see #getInterfaceFeature()
   * @generated
   */
  EAttribute getInterfaceFeature_Stringifier();

  /**
   * Returns the meta object for the attribute '{@link org.waml.w3c.webidl.webIDL.InterfaceFeature#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.waml.w3c.webidl.webIDL.InterfaceFeature#getName()
   * @see #getInterfaceFeature()
   * @generated
   */
  EAttribute getInterfaceFeature_Name();

  /**
   * Returns the meta object for class '{@link org.waml.w3c.webidl.webIDL.Operation <em>Operation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Operation</em>'.
   * @see org.waml.w3c.webidl.webIDL.Operation
   * @generated
   */
  EClass getOperation();

  /**
   * Returns the meta object for the containment reference list '{@link org.waml.w3c.webidl.webIDL.Operation#getExtendedAttributes <em>Extended Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Extended Attributes</em>'.
   * @see org.waml.w3c.webidl.webIDL.Operation#getExtendedAttributes()
   * @see #getOperation()
   * @generated
   */
  EReference getOperation_ExtendedAttributes();

  /**
   * Returns the meta object for the attribute '{@link org.waml.w3c.webidl.webIDL.Operation#isOmittable <em>Omittable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Omittable</em>'.
   * @see org.waml.w3c.webidl.webIDL.Operation#isOmittable()
   * @see #getOperation()
   * @generated
   */
  EAttribute getOperation_Omittable();

  /**
   * Returns the meta object for the containment reference list '{@link org.waml.w3c.webidl.webIDL.Operation#getSpecials <em>Specials</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Specials</em>'.
   * @see org.waml.w3c.webidl.webIDL.Operation#getSpecials()
   * @see #getOperation()
   * @generated
   */
  EReference getOperation_Specials();

  /**
   * Returns the meta object for the containment reference '{@link org.waml.w3c.webidl.webIDL.Operation#getReturn <em>Return</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Return</em>'.
   * @see org.waml.w3c.webidl.webIDL.Operation#getReturn()
   * @see #getOperation()
   * @generated
   */
  EReference getOperation_Return();

  /**
   * Returns the meta object for the containment reference list '{@link org.waml.w3c.webidl.webIDL.Operation#getArguments <em>Arguments</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Arguments</em>'.
   * @see org.waml.w3c.webidl.webIDL.Operation#getArguments()
   * @see #getOperation()
   * @generated
   */
  EReference getOperation_Arguments();

  /**
   * Returns the meta object for the reference list '{@link org.waml.w3c.webidl.webIDL.Operation#getRaises <em>Raises</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Raises</em>'.
   * @see org.waml.w3c.webidl.webIDL.Operation#getRaises()
   * @see #getOperation()
   * @generated
   */
  EReference getOperation_Raises();

  /**
   * Returns the meta object for class '{@link org.waml.w3c.webidl.webIDL.OperationExtendedAttribute <em>Operation Extended Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Operation Extended Attribute</em>'.
   * @see org.waml.w3c.webidl.webIDL.OperationExtendedAttribute
   * @generated
   */
  EClass getOperationExtendedAttribute();

  /**
   * Returns the meta object for class '{@link org.waml.w3c.webidl.webIDL.OperationSpecial <em>Operation Special</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Operation Special</em>'.
   * @see org.waml.w3c.webidl.webIDL.OperationSpecial
   * @generated
   */
  EClass getOperationSpecial();

  /**
   * Returns the meta object for class '{@link org.waml.w3c.webidl.webIDL.Attribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Attribute</em>'.
   * @see org.waml.w3c.webidl.webIDL.Attribute
   * @generated
   */
  EClass getAttribute();

  /**
   * Returns the meta object for the containment reference list '{@link org.waml.w3c.webidl.webIDL.Attribute#getExtendedAttributes <em>Extended Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Extended Attributes</em>'.
   * @see org.waml.w3c.webidl.webIDL.Attribute#getExtendedAttributes()
   * @see #getAttribute()
   * @generated
   */
  EReference getAttribute_ExtendedAttributes();

  /**
   * Returns the meta object for the containment reference '{@link org.waml.w3c.webidl.webIDL.Attribute#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.waml.w3c.webidl.webIDL.Attribute#getType()
   * @see #getAttribute()
   * @generated
   */
  EReference getAttribute_Type();

  /**
   * Returns the meta object for the reference list '{@link org.waml.w3c.webidl.webIDL.Attribute#getGetRaises <em>Get Raises</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Get Raises</em>'.
   * @see org.waml.w3c.webidl.webIDL.Attribute#getGetRaises()
   * @see #getAttribute()
   * @generated
   */
  EReference getAttribute_GetRaises();

  /**
   * Returns the meta object for the reference list '{@link org.waml.w3c.webidl.webIDL.Attribute#getSetRaises <em>Set Raises</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Set Raises</em>'.
   * @see org.waml.w3c.webidl.webIDL.Attribute#getSetRaises()
   * @see #getAttribute()
   * @generated
   */
  EReference getAttribute_SetRaises();

  /**
   * Returns the meta object for class '{@link org.waml.w3c.webidl.webIDL.AttributeExtendedAttribute <em>Attribute Extended Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Attribute Extended Attribute</em>'.
   * @see org.waml.w3c.webidl.webIDL.AttributeExtendedAttribute
   * @generated
   */
  EClass getAttributeExtendedAttribute();

  /**
   * Returns the meta object for class '{@link org.waml.w3c.webidl.webIDL.Exception <em>Exception</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Exception</em>'.
   * @see org.waml.w3c.webidl.webIDL.Exception
   * @generated
   */
  EClass getException();

  /**
   * Returns the meta object for the containment reference list '{@link org.waml.w3c.webidl.webIDL.Exception#getExtendedAttributes <em>Extended Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Extended Attributes</em>'.
   * @see org.waml.w3c.webidl.webIDL.Exception#getExtendedAttributes()
   * @see #getException()
   * @generated
   */
  EReference getException_ExtendedAttributes();

  /**
   * Returns the meta object for the attribute '{@link org.waml.w3c.webidl.webIDL.Exception#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.waml.w3c.webidl.webIDL.Exception#getName()
   * @see #getException()
   * @generated
   */
  EAttribute getException_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.waml.w3c.webidl.webIDL.Exception#getMembers <em>Members</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Members</em>'.
   * @see org.waml.w3c.webidl.webIDL.Exception#getMembers()
   * @see #getException()
   * @generated
   */
  EReference getException_Members();

  /**
   * Returns the meta object for class '{@link org.waml.w3c.webidl.webIDL.ExceptionMember <em>Exception Member</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Exception Member</em>'.
   * @see org.waml.w3c.webidl.webIDL.ExceptionMember
   * @generated
   */
  EClass getExceptionMember();

  /**
   * Returns the meta object for the containment reference '{@link org.waml.w3c.webidl.webIDL.ExceptionMember#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.waml.w3c.webidl.webIDL.ExceptionMember#getType()
   * @see #getExceptionMember()
   * @generated
   */
  EReference getExceptionMember_Type();

  /**
   * Returns the meta object for class '{@link org.waml.w3c.webidl.webIDL.ExceptionField <em>Exception Field</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Exception Field</em>'.
   * @see org.waml.w3c.webidl.webIDL.ExceptionField
   * @generated
   */
  EClass getExceptionField();

  /**
   * Returns the meta object for the attribute '{@link org.waml.w3c.webidl.webIDL.ExceptionField#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.waml.w3c.webidl.webIDL.ExceptionField#getName()
   * @see #getExceptionField()
   * @generated
   */
  EAttribute getExceptionField_Name();

  /**
   * Returns the meta object for class '{@link org.waml.w3c.webidl.webIDL.ExceptionExtendedAttribute <em>Exception Extended Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Exception Extended Attribute</em>'.
   * @see org.waml.w3c.webidl.webIDL.ExceptionExtendedAttribute
   * @generated
   */
  EClass getExceptionExtendedAttribute();

  /**
   * Returns the meta object for class '{@link org.waml.w3c.webidl.webIDL.Argument <em>Argument</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Argument</em>'.
   * @see org.waml.w3c.webidl.webIDL.Argument
   * @generated
   */
  EClass getArgument();

  /**
   * Returns the meta object for the containment reference list '{@link org.waml.w3c.webidl.webIDL.Argument#getExtendedAttributes <em>Extended Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Extended Attributes</em>'.
   * @see org.waml.w3c.webidl.webIDL.Argument#getExtendedAttributes()
   * @see #getArgument()
   * @generated
   */
  EReference getArgument_ExtendedAttributes();

  /**
   * Returns the meta object for the attribute '{@link org.waml.w3c.webidl.webIDL.Argument#isIn <em>In</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>In</em>'.
   * @see org.waml.w3c.webidl.webIDL.Argument#isIn()
   * @see #getArgument()
   * @generated
   */
  EAttribute getArgument_In();

  /**
   * Returns the meta object for the attribute '{@link org.waml.w3c.webidl.webIDL.Argument#isOptional <em>Optional</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Optional</em>'.
   * @see org.waml.w3c.webidl.webIDL.Argument#isOptional()
   * @see #getArgument()
   * @generated
   */
  EAttribute getArgument_Optional();

  /**
   * Returns the meta object for the containment reference '{@link org.waml.w3c.webidl.webIDL.Argument#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.waml.w3c.webidl.webIDL.Argument#getType()
   * @see #getArgument()
   * @generated
   */
  EReference getArgument_Type();

  /**
   * Returns the meta object for the attribute '{@link org.waml.w3c.webidl.webIDL.Argument#isEllipsis <em>Ellipsis</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Ellipsis</em>'.
   * @see org.waml.w3c.webidl.webIDL.Argument#isEllipsis()
   * @see #getArgument()
   * @generated
   */
  EAttribute getArgument_Ellipsis();

  /**
   * Returns the meta object for the attribute '{@link org.waml.w3c.webidl.webIDL.Argument#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.waml.w3c.webidl.webIDL.Argument#getName()
   * @see #getArgument()
   * @generated
   */
  EAttribute getArgument_Name();

  /**
   * Returns the meta object for class '{@link org.waml.w3c.webidl.webIDL.ArgumentExtendedAttribute <em>Argument Extended Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Argument Extended Attribute</em>'.
   * @see org.waml.w3c.webidl.webIDL.ArgumentExtendedAttribute
   * @generated
   */
  EClass getArgumentExtendedAttribute();

  /**
   * Returns the meta object for class '{@link org.waml.w3c.webidl.webIDL.Const <em>Const</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Const</em>'.
   * @see org.waml.w3c.webidl.webIDL.Const
   * @generated
   */
  EClass getConst();

  /**
   * Returns the meta object for the attribute list '{@link org.waml.w3c.webidl.webIDL.Const#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Name</em>'.
   * @see org.waml.w3c.webidl.webIDL.Const#getName()
   * @see #getConst()
   * @generated
   */
  EAttribute getConst_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.waml.w3c.webidl.webIDL.Const#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr</em>'.
   * @see org.waml.w3c.webidl.webIDL.Const#getExpr()
   * @see #getConst()
   * @generated
   */
  EReference getConst_Expr();

  /**
   * Returns the meta object for class '{@link org.waml.w3c.webidl.webIDL.ConstExpr <em>Const Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Const Expr</em>'.
   * @see org.waml.w3c.webidl.webIDL.ConstExpr
   * @generated
   */
  EClass getConstExpr();

  /**
   * Returns the meta object for class '{@link org.waml.w3c.webidl.webIDL.OperationSpecialGetter <em>Operation Special Getter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Operation Special Getter</em>'.
   * @see org.waml.w3c.webidl.webIDL.OperationSpecialGetter
   * @generated
   */
  EClass getOperationSpecialGetter();

  /**
   * Returns the meta object for class '{@link org.waml.w3c.webidl.webIDL.OperationSpecialSetter <em>Operation Special Setter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Operation Special Setter</em>'.
   * @see org.waml.w3c.webidl.webIDL.OperationSpecialSetter
   * @generated
   */
  EClass getOperationSpecialSetter();

  /**
   * Returns the meta object for class '{@link org.waml.w3c.webidl.webIDL.OperationSpecialCreator <em>Operation Special Creator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Operation Special Creator</em>'.
   * @see org.waml.w3c.webidl.webIDL.OperationSpecialCreator
   * @generated
   */
  EClass getOperationSpecialCreator();

  /**
   * Returns the meta object for class '{@link org.waml.w3c.webidl.webIDL.OperationSpecialDeleter <em>Operation Special Deleter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Operation Special Deleter</em>'.
   * @see org.waml.w3c.webidl.webIDL.OperationSpecialDeleter
   * @generated
   */
  EClass getOperationSpecialDeleter();

  /**
   * Returns the meta object for class '{@link org.waml.w3c.webidl.webIDL.OperationSpecialCaller <em>Operation Special Caller</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Operation Special Caller</em>'.
   * @see org.waml.w3c.webidl.webIDL.OperationSpecialCaller
   * @generated
   */
  EClass getOperationSpecialCaller();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  WebIDLFactory getWebIDLFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.waml.w3c.webidl.webIDL.impl.IDLDefinitionsImpl <em>IDL Definitions</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.waml.w3c.webidl.webIDL.impl.IDLDefinitionsImpl
     * @see org.waml.w3c.webidl.webIDL.impl.WebIDLPackageImpl#getIDLDefinitions()
     * @generated
     */
    EClass IDL_DEFINITIONS = eINSTANCE.getIDLDefinitions();

    /**
     * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IDL_DEFINITIONS__IMPORTS = eINSTANCE.getIDLDefinitions_Imports();

    /**
     * The meta object literal for the '<em><b>Definitions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IDL_DEFINITIONS__DEFINITIONS = eINSTANCE.getIDLDefinitions_Definitions();

    /**
     * The meta object literal for the '{@link org.waml.w3c.webidl.webIDL.impl.ImportImpl <em>Import</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.waml.w3c.webidl.webIDL.impl.ImportImpl
     * @see org.waml.w3c.webidl.webIDL.impl.WebIDLPackageImpl#getImport()
     * @generated
     */
    EClass IMPORT = eINSTANCE.getImport();

    /**
     * The meta object literal for the '<em><b>Import URI</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMPORT__IMPORT_URI = eINSTANCE.getImport_ImportURI();

    /**
     * The meta object literal for the '{@link org.waml.w3c.webidl.webIDL.impl.TypeDefImpl <em>Type Def</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.waml.w3c.webidl.webIDL.impl.TypeDefImpl
     * @see org.waml.w3c.webidl.webIDL.impl.WebIDLPackageImpl#getTypeDef()
     * @generated
     */
    EClass TYPE_DEF = eINSTANCE.getTypeDef();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE_DEF__TYPE = eINSTANCE.getTypeDef_Type();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE_DEF__NAME = eINSTANCE.getTypeDef_Name();

    /**
     * The meta object literal for the '{@link org.waml.w3c.webidl.webIDL.impl.TypeRefImpl <em>Type Ref</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.waml.w3c.webidl.webIDL.impl.TypeRefImpl
     * @see org.waml.w3c.webidl.webIDL.impl.WebIDLPackageImpl#getTypeRef()
     * @generated
     */
    EClass TYPE_REF = eINSTANCE.getTypeRef();

    /**
     * The meta object literal for the '<em><b>Is Array</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE_REF__IS_ARRAY = eINSTANCE.getTypeRef_IsArray();

    /**
     * The meta object literal for the '{@link org.waml.w3c.webidl.webIDL.impl.UserTypeRefImpl <em>User Type Ref</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.waml.w3c.webidl.webIDL.impl.UserTypeRefImpl
     * @see org.waml.w3c.webidl.webIDL.impl.WebIDLPackageImpl#getUserTypeRef()
     * @generated
     */
    EClass USER_TYPE_REF = eINSTANCE.getUserTypeRef();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference USER_TYPE_REF__TYPE = eINSTANCE.getUserTypeRef_Type();

    /**
     * The meta object literal for the '{@link org.waml.w3c.webidl.webIDL.impl.TypesImpl <em>Types</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.waml.w3c.webidl.webIDL.impl.TypesImpl
     * @see org.waml.w3c.webidl.webIDL.impl.WebIDLPackageImpl#getTypes()
     * @generated
     */
    EClass TYPES = eINSTANCE.getTypes();

    /**
     * The meta object literal for the '{@link org.waml.w3c.webidl.webIDL.impl.PrimitiveTypeRefImpl <em>Primitive Type Ref</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.waml.w3c.webidl.webIDL.impl.PrimitiveTypeRefImpl
     * @see org.waml.w3c.webidl.webIDL.impl.WebIDLPackageImpl#getPrimitiveTypeRef()
     * @generated
     */
    EClass PRIMITIVE_TYPE_REF = eINSTANCE.getPrimitiveTypeRef();

    /**
     * The meta object literal for the '<em><b>Unsigned</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PRIMITIVE_TYPE_REF__UNSIGNED = eINSTANCE.getPrimitiveTypeRef_Unsigned();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PRIMITIVE_TYPE_REF__NAME = eINSTANCE.getPrimitiveTypeRef_Name();

    /**
     * The meta object literal for the '<em><b>Nullable</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PRIMITIVE_TYPE_REF__NULLABLE = eINSTANCE.getPrimitiveTypeRef_Nullable();

    /**
     * The meta object literal for the '{@link org.waml.w3c.webidl.webIDL.impl.SequenceTypeImpl <em>Sequence Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.waml.w3c.webidl.webIDL.impl.SequenceTypeImpl
     * @see org.waml.w3c.webidl.webIDL.impl.WebIDLPackageImpl#getSequenceType()
     * @generated
     */
    EClass SEQUENCE_TYPE = eINSTANCE.getSequenceType();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SEQUENCE_TYPE__TYPE = eINSTANCE.getSequenceType_Type();

    /**
     * The meta object literal for the '<em><b>Nullable</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SEQUENCE_TYPE__NULLABLE = eINSTANCE.getSequenceType_Nullable();

    /**
     * The meta object literal for the '{@link org.waml.w3c.webidl.webIDL.impl.CallableImpl <em>Callable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.waml.w3c.webidl.webIDL.impl.CallableImpl
     * @see org.waml.w3c.webidl.webIDL.impl.WebIDLPackageImpl#getCallable()
     * @generated
     */
    EClass CALLABLE = eINSTANCE.getCallable();

    /**
     * The meta object literal for the '<em><b>Target</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CALLABLE__TARGET = eINSTANCE.getCallable_Target();

    /**
     * The meta object literal for the '{@link org.waml.w3c.webidl.webIDL.impl.ConstructorImpl <em>Constructor</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.waml.w3c.webidl.webIDL.impl.ConstructorImpl
     * @see org.waml.w3c.webidl.webIDL.impl.WebIDLPackageImpl#getConstructor()
     * @generated
     */
    EClass CONSTRUCTOR = eINSTANCE.getConstructor();

    /**
     * The meta object literal for the '<em><b>Arguments</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONSTRUCTOR__ARGUMENTS = eINSTANCE.getConstructor_Arguments();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONSTRUCTOR__NAME = eINSTANCE.getConstructor_Name();

    /**
     * The meta object literal for the '{@link org.waml.w3c.webidl.webIDL.impl.NamedConstructorImpl <em>Named Constructor</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.waml.w3c.webidl.webIDL.impl.NamedConstructorImpl
     * @see org.waml.w3c.webidl.webIDL.impl.WebIDLPackageImpl#getNamedConstructor()
     * @generated
     */
    EClass NAMED_CONSTRUCTOR = eINSTANCE.getNamedConstructor();

    /**
     * The meta object literal for the '{@link org.waml.w3c.webidl.webIDL.impl.CallbackImpl <em>Callback</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.waml.w3c.webidl.webIDL.impl.CallbackImpl
     * @see org.waml.w3c.webidl.webIDL.impl.WebIDLPackageImpl#getCallback()
     * @generated
     */
    EClass CALLBACK = eINSTANCE.getCallback();

    /**
     * The meta object literal for the '<em><b>Function Only</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CALLBACK__FUNCTION_ONLY = eINSTANCE.getCallback_FunctionOnly();

    /**
     * The meta object literal for the '<em><b>Property Only</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CALLBACK__PROPERTY_ONLY = eINSTANCE.getCallback_PropertyOnly();

    /**
     * The meta object literal for the '{@link org.waml.w3c.webidl.webIDL.impl.NoInterfaceObjectImpl <em>No Interface Object</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.waml.w3c.webidl.webIDL.impl.NoInterfaceObjectImpl
     * @see org.waml.w3c.webidl.webIDL.impl.WebIDLPackageImpl#getNoInterfaceObject()
     * @generated
     */
    EClass NO_INTERFACE_OBJECT = eINSTANCE.getNoInterfaceObject();

    /**
     * The meta object literal for the '{@link org.waml.w3c.webidl.webIDL.impl.PrototypeRootImpl <em>Prototype Root</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.waml.w3c.webidl.webIDL.impl.PrototypeRootImpl
     * @see org.waml.w3c.webidl.webIDL.impl.WebIDLPackageImpl#getPrototypeRoot()
     * @generated
     */
    EClass PROTOTYPE_ROOT = eINSTANCE.getPrototypeRoot();

    /**
     * The meta object literal for the '{@link org.waml.w3c.webidl.webIDL.impl.PutForwardsImpl <em>Put Forwards</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.waml.w3c.webidl.webIDL.impl.PutForwardsImpl
     * @see org.waml.w3c.webidl.webIDL.impl.WebIDLPackageImpl#getPutForwards()
     * @generated
     */
    EClass PUT_FORWARDS = eINSTANCE.getPutForwards();

    /**
     * The meta object literal for the '<em><b>Target</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PUT_FORWARDS__TARGET = eINSTANCE.getPutForwards_Target();

    /**
     * The meta object literal for the '{@link org.waml.w3c.webidl.webIDL.impl.TreatNullAsImpl <em>Treat Null As</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.waml.w3c.webidl.webIDL.impl.TreatNullAsImpl
     * @see org.waml.w3c.webidl.webIDL.impl.WebIDLPackageImpl#getTreatNullAs()
     * @generated
     */
    EClass TREAT_NULL_AS = eINSTANCE.getTreatNullAs();

    /**
     * The meta object literal for the '{@link org.waml.w3c.webidl.webIDL.impl.TreatUndefinedAsImpl <em>Treat Undefined As</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.waml.w3c.webidl.webIDL.impl.TreatUndefinedAsImpl
     * @see org.waml.w3c.webidl.webIDL.impl.WebIDLPackageImpl#getTreatUndefinedAs()
     * @generated
     */
    EClass TREAT_UNDEFINED_AS = eINSTANCE.getTreatUndefinedAs();

    /**
     * The meta object literal for the '<em><b>As Empty String</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TREAT_UNDEFINED_AS__AS_EMPTY_STRING = eINSTANCE.getTreatUndefinedAs_AsEmptyString();

    /**
     * The meta object literal for the '<em><b>As Null</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TREAT_UNDEFINED_AS__AS_NULL = eINSTANCE.getTreatUndefinedAs_AsNull();

    /**
     * The meta object literal for the '{@link org.waml.w3c.webidl.webIDL.impl.AllowAnyImpl <em>Allow Any</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.waml.w3c.webidl.webIDL.impl.AllowAnyImpl
     * @see org.waml.w3c.webidl.webIDL.impl.WebIDLPackageImpl#getAllowAny()
     * @generated
     */
    EClass ALLOW_ANY = eINSTANCE.getAllowAny();

    /**
     * The meta object literal for the '{@link org.waml.w3c.webidl.webIDL.impl.ReplaceableImpl <em>Replaceable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.waml.w3c.webidl.webIDL.impl.ReplaceableImpl
     * @see org.waml.w3c.webidl.webIDL.impl.WebIDLPackageImpl#getReplaceable()
     * @generated
     */
    EClass REPLACEABLE = eINSTANCE.getReplaceable();

    /**
     * The meta object literal for the '{@link org.waml.w3c.webidl.webIDL.impl.SupplementalImpl <em>Supplemental</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.waml.w3c.webidl.webIDL.impl.SupplementalImpl
     * @see org.waml.w3c.webidl.webIDL.impl.WebIDLPackageImpl#getSupplemental()
     * @generated
     */
    EClass SUPPLEMENTAL = eINSTANCE.getSupplemental();

    /**
     * The meta object literal for the '{@link org.waml.w3c.webidl.webIDL.impl.ReplaceableNamedPropertiesImpl <em>Replaceable Named Properties</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.waml.w3c.webidl.webIDL.impl.ReplaceableNamedPropertiesImpl
     * @see org.waml.w3c.webidl.webIDL.impl.WebIDLPackageImpl#getReplaceableNamedProperties()
     * @generated
     */
    EClass REPLACEABLE_NAMED_PROPERTIES = eINSTANCE.getReplaceableNamedProperties();

    /**
     * The meta object literal for the '{@link org.waml.w3c.webidl.webIDL.impl.AbstractDefinitionsImpl <em>Abstract Definitions</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.waml.w3c.webidl.webIDL.impl.AbstractDefinitionsImpl
     * @see org.waml.w3c.webidl.webIDL.impl.WebIDLPackageImpl#getAbstractDefinitions()
     * @generated
     */
    EClass ABSTRACT_DEFINITIONS = eINSTANCE.getAbstractDefinitions();

    /**
     * The meta object literal for the '{@link org.waml.w3c.webidl.webIDL.impl.DefinitionsImpl <em>Definitions</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.waml.w3c.webidl.webIDL.impl.DefinitionsImpl
     * @see org.waml.w3c.webidl.webIDL.impl.WebIDLPackageImpl#getDefinitions()
     * @generated
     */
    EClass DEFINITIONS = eINSTANCE.getDefinitions();

    /**
     * The meta object literal for the '{@link org.waml.w3c.webidl.webIDL.impl.ImplementStatementImpl <em>Implement Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.waml.w3c.webidl.webIDL.impl.ImplementStatementImpl
     * @see org.waml.w3c.webidl.webIDL.impl.WebIDLPackageImpl#getImplementStatement()
     * @generated
     */
    EClass IMPLEMENT_STATEMENT = eINSTANCE.getImplementStatement();

    /**
     * The meta object literal for the '<em><b>Source</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IMPLEMENT_STATEMENT__SOURCE = eINSTANCE.getImplementStatement_Source();

    /**
     * The meta object literal for the '<em><b>Target</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IMPLEMENT_STATEMENT__TARGET = eINSTANCE.getImplementStatement_Target();

    /**
     * The meta object literal for the '{@link org.waml.w3c.webidl.webIDL.impl.ModuleImpl <em>Module</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.waml.w3c.webidl.webIDL.impl.ModuleImpl
     * @see org.waml.w3c.webidl.webIDL.impl.WebIDLPackageImpl#getModule()
     * @generated
     */
    EClass MODULE = eINSTANCE.getModule();

    /**
     * The meta object literal for the '<em><b>Extended Attributes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODULE__EXTENDED_ATTRIBUTES = eINSTANCE.getModule_ExtendedAttributes();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MODULE__NAME = eINSTANCE.getModule_Name();

    /**
     * The meta object literal for the '<em><b>Definitions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODULE__DEFINITIONS = eINSTANCE.getModule_Definitions();

    /**
     * The meta object literal for the '{@link org.waml.w3c.webidl.webIDL.impl.ModuleExtendedAttributeImpl <em>Module Extended Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.waml.w3c.webidl.webIDL.impl.ModuleExtendedAttributeImpl
     * @see org.waml.w3c.webidl.webIDL.impl.WebIDLPackageImpl#getModuleExtendedAttribute()
     * @generated
     */
    EClass MODULE_EXTENDED_ATTRIBUTE = eINSTANCE.getModuleExtendedAttribute();

    /**
     * The meta object literal for the '{@link org.waml.w3c.webidl.webIDL.impl.PrefixImpl <em>Prefix</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.waml.w3c.webidl.webIDL.impl.PrefixImpl
     * @see org.waml.w3c.webidl.webIDL.impl.WebIDLPackageImpl#getPrefix()
     * @generated
     */
    EClass PREFIX = eINSTANCE.getPrefix();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PREFIX__VALUE = eINSTANCE.getPrefix_Value();

    /**
     * The meta object literal for the '{@link org.waml.w3c.webidl.webIDL.impl.NamespaceObjectImpl <em>Namespace Object</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.waml.w3c.webidl.webIDL.impl.NamespaceObjectImpl
     * @see org.waml.w3c.webidl.webIDL.impl.WebIDLPackageImpl#getNamespaceObject()
     * @generated
     */
    EClass NAMESPACE_OBJECT = eINSTANCE.getNamespaceObject();

    /**
     * The meta object literal for the '{@link org.waml.w3c.webidl.webIDL.impl.InterfaceImpl <em>Interface</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.waml.w3c.webidl.webIDL.impl.InterfaceImpl
     * @see org.waml.w3c.webidl.webIDL.impl.WebIDLPackageImpl#getInterface()
     * @generated
     */
    EClass INTERFACE = eINSTANCE.getInterface();

    /**
     * The meta object literal for the '<em><b>Extended Attributes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERFACE__EXTENDED_ATTRIBUTES = eINSTANCE.getInterface_ExtendedAttributes();

    /**
     * The meta object literal for the '<em><b>Extended Attribute</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERFACE__EXTENDED_ATTRIBUTE = eINSTANCE.getInterface_ExtendedAttribute();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INTERFACE__NAME = eINSTANCE.getInterface_Name();

    /**
     * The meta object literal for the '<em><b>Super Type</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERFACE__SUPER_TYPE = eINSTANCE.getInterface_SuperType();

    /**
     * The meta object literal for the '<em><b>Members</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERFACE__MEMBERS = eINSTANCE.getInterface_Members();

    /**
     * The meta object literal for the '{@link org.waml.w3c.webidl.webIDL.impl.InterfaceExtendedAttributeImpl <em>Interface Extended Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.waml.w3c.webidl.webIDL.impl.InterfaceExtendedAttributeImpl
     * @see org.waml.w3c.webidl.webIDL.impl.WebIDLPackageImpl#getInterfaceExtendedAttribute()
     * @generated
     */
    EClass INTERFACE_EXTENDED_ATTRIBUTE = eINSTANCE.getInterfaceExtendedAttribute();

    /**
     * The meta object literal for the '{@link org.waml.w3c.webidl.webIDL.impl.InterfaceMemberImpl <em>Interface Member</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.waml.w3c.webidl.webIDL.impl.InterfaceMemberImpl
     * @see org.waml.w3c.webidl.webIDL.impl.WebIDLPackageImpl#getInterfaceMember()
     * @generated
     */
    EClass INTERFACE_MEMBER = eINSTANCE.getInterfaceMember();

    /**
     * The meta object literal for the '{@link org.waml.w3c.webidl.webIDL.impl.InterfaceFeatureImpl <em>Interface Feature</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.waml.w3c.webidl.webIDL.impl.InterfaceFeatureImpl
     * @see org.waml.w3c.webidl.webIDL.impl.WebIDLPackageImpl#getInterfaceFeature()
     * @generated
     */
    EClass INTERFACE_FEATURE = eINSTANCE.getInterfaceFeature();

    /**
     * The meta object literal for the '<em><b>Stringifier</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INTERFACE_FEATURE__STRINGIFIER = eINSTANCE.getInterfaceFeature_Stringifier();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INTERFACE_FEATURE__NAME = eINSTANCE.getInterfaceFeature_Name();

    /**
     * The meta object literal for the '{@link org.waml.w3c.webidl.webIDL.impl.OperationImpl <em>Operation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.waml.w3c.webidl.webIDL.impl.OperationImpl
     * @see org.waml.w3c.webidl.webIDL.impl.WebIDLPackageImpl#getOperation()
     * @generated
     */
    EClass OPERATION = eINSTANCE.getOperation();

    /**
     * The meta object literal for the '<em><b>Extended Attributes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OPERATION__EXTENDED_ATTRIBUTES = eINSTANCE.getOperation_ExtendedAttributes();

    /**
     * The meta object literal for the '<em><b>Omittable</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OPERATION__OMITTABLE = eINSTANCE.getOperation_Omittable();

    /**
     * The meta object literal for the '<em><b>Specials</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OPERATION__SPECIALS = eINSTANCE.getOperation_Specials();

    /**
     * The meta object literal for the '<em><b>Return</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OPERATION__RETURN = eINSTANCE.getOperation_Return();

    /**
     * The meta object literal for the '<em><b>Arguments</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OPERATION__ARGUMENTS = eINSTANCE.getOperation_Arguments();

    /**
     * The meta object literal for the '<em><b>Raises</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OPERATION__RAISES = eINSTANCE.getOperation_Raises();

    /**
     * The meta object literal for the '{@link org.waml.w3c.webidl.webIDL.impl.OperationExtendedAttributeImpl <em>Operation Extended Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.waml.w3c.webidl.webIDL.impl.OperationExtendedAttributeImpl
     * @see org.waml.w3c.webidl.webIDL.impl.WebIDLPackageImpl#getOperationExtendedAttribute()
     * @generated
     */
    EClass OPERATION_EXTENDED_ATTRIBUTE = eINSTANCE.getOperationExtendedAttribute();

    /**
     * The meta object literal for the '{@link org.waml.w3c.webidl.webIDL.impl.OperationSpecialImpl <em>Operation Special</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.waml.w3c.webidl.webIDL.impl.OperationSpecialImpl
     * @see org.waml.w3c.webidl.webIDL.impl.WebIDLPackageImpl#getOperationSpecial()
     * @generated
     */
    EClass OPERATION_SPECIAL = eINSTANCE.getOperationSpecial();

    /**
     * The meta object literal for the '{@link org.waml.w3c.webidl.webIDL.impl.AttributeImpl <em>Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.waml.w3c.webidl.webIDL.impl.AttributeImpl
     * @see org.waml.w3c.webidl.webIDL.impl.WebIDLPackageImpl#getAttribute()
     * @generated
     */
    EClass ATTRIBUTE = eINSTANCE.getAttribute();

    /**
     * The meta object literal for the '<em><b>Extended Attributes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATTRIBUTE__EXTENDED_ATTRIBUTES = eINSTANCE.getAttribute_ExtendedAttributes();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATTRIBUTE__TYPE = eINSTANCE.getAttribute_Type();

    /**
     * The meta object literal for the '<em><b>Get Raises</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATTRIBUTE__GET_RAISES = eINSTANCE.getAttribute_GetRaises();

    /**
     * The meta object literal for the '<em><b>Set Raises</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATTRIBUTE__SET_RAISES = eINSTANCE.getAttribute_SetRaises();

    /**
     * The meta object literal for the '{@link org.waml.w3c.webidl.webIDL.impl.AttributeExtendedAttributeImpl <em>Attribute Extended Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.waml.w3c.webidl.webIDL.impl.AttributeExtendedAttributeImpl
     * @see org.waml.w3c.webidl.webIDL.impl.WebIDLPackageImpl#getAttributeExtendedAttribute()
     * @generated
     */
    EClass ATTRIBUTE_EXTENDED_ATTRIBUTE = eINSTANCE.getAttributeExtendedAttribute();

    /**
     * The meta object literal for the '{@link org.waml.w3c.webidl.webIDL.impl.ExceptionImpl <em>Exception</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.waml.w3c.webidl.webIDL.impl.ExceptionImpl
     * @see org.waml.w3c.webidl.webIDL.impl.WebIDLPackageImpl#getException()
     * @generated
     */
    EClass EXCEPTION = eINSTANCE.getException();

    /**
     * The meta object literal for the '<em><b>Extended Attributes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXCEPTION__EXTENDED_ATTRIBUTES = eINSTANCE.getException_ExtendedAttributes();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXCEPTION__NAME = eINSTANCE.getException_Name();

    /**
     * The meta object literal for the '<em><b>Members</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXCEPTION__MEMBERS = eINSTANCE.getException_Members();

    /**
     * The meta object literal for the '{@link org.waml.w3c.webidl.webIDL.impl.ExceptionMemberImpl <em>Exception Member</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.waml.w3c.webidl.webIDL.impl.ExceptionMemberImpl
     * @see org.waml.w3c.webidl.webIDL.impl.WebIDLPackageImpl#getExceptionMember()
     * @generated
     */
    EClass EXCEPTION_MEMBER = eINSTANCE.getExceptionMember();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXCEPTION_MEMBER__TYPE = eINSTANCE.getExceptionMember_Type();

    /**
     * The meta object literal for the '{@link org.waml.w3c.webidl.webIDL.impl.ExceptionFieldImpl <em>Exception Field</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.waml.w3c.webidl.webIDL.impl.ExceptionFieldImpl
     * @see org.waml.w3c.webidl.webIDL.impl.WebIDLPackageImpl#getExceptionField()
     * @generated
     */
    EClass EXCEPTION_FIELD = eINSTANCE.getExceptionField();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXCEPTION_FIELD__NAME = eINSTANCE.getExceptionField_Name();

    /**
     * The meta object literal for the '{@link org.waml.w3c.webidl.webIDL.impl.ExceptionExtendedAttributeImpl <em>Exception Extended Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.waml.w3c.webidl.webIDL.impl.ExceptionExtendedAttributeImpl
     * @see org.waml.w3c.webidl.webIDL.impl.WebIDLPackageImpl#getExceptionExtendedAttribute()
     * @generated
     */
    EClass EXCEPTION_EXTENDED_ATTRIBUTE = eINSTANCE.getExceptionExtendedAttribute();

    /**
     * The meta object literal for the '{@link org.waml.w3c.webidl.webIDL.impl.ArgumentImpl <em>Argument</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.waml.w3c.webidl.webIDL.impl.ArgumentImpl
     * @see org.waml.w3c.webidl.webIDL.impl.WebIDLPackageImpl#getArgument()
     * @generated
     */
    EClass ARGUMENT = eINSTANCE.getArgument();

    /**
     * The meta object literal for the '<em><b>Extended Attributes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARGUMENT__EXTENDED_ATTRIBUTES = eINSTANCE.getArgument_ExtendedAttributes();

    /**
     * The meta object literal for the '<em><b>In</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ARGUMENT__IN = eINSTANCE.getArgument_In();

    /**
     * The meta object literal for the '<em><b>Optional</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ARGUMENT__OPTIONAL = eINSTANCE.getArgument_Optional();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARGUMENT__TYPE = eINSTANCE.getArgument_Type();

    /**
     * The meta object literal for the '<em><b>Ellipsis</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ARGUMENT__ELLIPSIS = eINSTANCE.getArgument_Ellipsis();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ARGUMENT__NAME = eINSTANCE.getArgument_Name();

    /**
     * The meta object literal for the '{@link org.waml.w3c.webidl.webIDL.impl.ArgumentExtendedAttributeImpl <em>Argument Extended Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.waml.w3c.webidl.webIDL.impl.ArgumentExtendedAttributeImpl
     * @see org.waml.w3c.webidl.webIDL.impl.WebIDLPackageImpl#getArgumentExtendedAttribute()
     * @generated
     */
    EClass ARGUMENT_EXTENDED_ATTRIBUTE = eINSTANCE.getArgumentExtendedAttribute();

    /**
     * The meta object literal for the '{@link org.waml.w3c.webidl.webIDL.impl.ConstImpl <em>Const</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.waml.w3c.webidl.webIDL.impl.ConstImpl
     * @see org.waml.w3c.webidl.webIDL.impl.WebIDLPackageImpl#getConst()
     * @generated
     */
    EClass CONST = eINSTANCE.getConst();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONST__NAME = eINSTANCE.getConst_Name();

    /**
     * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONST__EXPR = eINSTANCE.getConst_Expr();

    /**
     * The meta object literal for the '{@link org.waml.w3c.webidl.webIDL.impl.ConstExprImpl <em>Const Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.waml.w3c.webidl.webIDL.impl.ConstExprImpl
     * @see org.waml.w3c.webidl.webIDL.impl.WebIDLPackageImpl#getConstExpr()
     * @generated
     */
    EClass CONST_EXPR = eINSTANCE.getConstExpr();

    /**
     * The meta object literal for the '{@link org.waml.w3c.webidl.webIDL.impl.OperationSpecialGetterImpl <em>Operation Special Getter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.waml.w3c.webidl.webIDL.impl.OperationSpecialGetterImpl
     * @see org.waml.w3c.webidl.webIDL.impl.WebIDLPackageImpl#getOperationSpecialGetter()
     * @generated
     */
    EClass OPERATION_SPECIAL_GETTER = eINSTANCE.getOperationSpecialGetter();

    /**
     * The meta object literal for the '{@link org.waml.w3c.webidl.webIDL.impl.OperationSpecialSetterImpl <em>Operation Special Setter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.waml.w3c.webidl.webIDL.impl.OperationSpecialSetterImpl
     * @see org.waml.w3c.webidl.webIDL.impl.WebIDLPackageImpl#getOperationSpecialSetter()
     * @generated
     */
    EClass OPERATION_SPECIAL_SETTER = eINSTANCE.getOperationSpecialSetter();

    /**
     * The meta object literal for the '{@link org.waml.w3c.webidl.webIDL.impl.OperationSpecialCreatorImpl <em>Operation Special Creator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.waml.w3c.webidl.webIDL.impl.OperationSpecialCreatorImpl
     * @see org.waml.w3c.webidl.webIDL.impl.WebIDLPackageImpl#getOperationSpecialCreator()
     * @generated
     */
    EClass OPERATION_SPECIAL_CREATOR = eINSTANCE.getOperationSpecialCreator();

    /**
     * The meta object literal for the '{@link org.waml.w3c.webidl.webIDL.impl.OperationSpecialDeleterImpl <em>Operation Special Deleter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.waml.w3c.webidl.webIDL.impl.OperationSpecialDeleterImpl
     * @see org.waml.w3c.webidl.webIDL.impl.WebIDLPackageImpl#getOperationSpecialDeleter()
     * @generated
     */
    EClass OPERATION_SPECIAL_DELETER = eINSTANCE.getOperationSpecialDeleter();

    /**
     * The meta object literal for the '{@link org.waml.w3c.webidl.webIDL.impl.OperationSpecialCallerImpl <em>Operation Special Caller</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.waml.w3c.webidl.webIDL.impl.OperationSpecialCallerImpl
     * @see org.waml.w3c.webidl.webIDL.impl.WebIDLPackageImpl#getOperationSpecialCaller()
     * @generated
     */
    EClass OPERATION_SPECIAL_CALLER = eINSTANCE.getOperationSpecialCaller();

  }

} //WebIDLPackage
