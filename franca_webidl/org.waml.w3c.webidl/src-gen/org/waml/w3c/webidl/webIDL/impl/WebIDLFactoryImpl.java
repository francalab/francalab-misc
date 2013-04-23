/**
 * <copyright>
 * </copyright>
 *

 */
package org.waml.w3c.webidl.webIDL.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.waml.w3c.webidl.webIDL.AbstractDefinitions;
import org.waml.w3c.webidl.webIDL.AllowAny;
import org.waml.w3c.webidl.webIDL.Argument;
import org.waml.w3c.webidl.webIDL.ArgumentExtendedAttribute;
import org.waml.w3c.webidl.webIDL.Attribute;
import org.waml.w3c.webidl.webIDL.AttributeExtendedAttribute;
import org.waml.w3c.webidl.webIDL.Callable;
import org.waml.w3c.webidl.webIDL.Callback;
import org.waml.w3c.webidl.webIDL.Const;
import org.waml.w3c.webidl.webIDL.ConstExpr;
import org.waml.w3c.webidl.webIDL.Constructor;
import org.waml.w3c.webidl.webIDL.Definitions;
import org.waml.w3c.webidl.webIDL.ExceptionExtendedAttribute;
import org.waml.w3c.webidl.webIDL.ExceptionField;
import org.waml.w3c.webidl.webIDL.ExceptionMember;
import org.waml.w3c.webidl.webIDL.IDLDefinitions;
import org.waml.w3c.webidl.webIDL.ImplementStatement;
import org.waml.w3c.webidl.webIDL.Import;
import org.waml.w3c.webidl.webIDL.Interface;
import org.waml.w3c.webidl.webIDL.InterfaceExtendedAttribute;
import org.waml.w3c.webidl.webIDL.InterfaceFeature;
import org.waml.w3c.webidl.webIDL.InterfaceMember;
import org.waml.w3c.webidl.webIDL.Module;
import org.waml.w3c.webidl.webIDL.ModuleExtendedAttribute;
import org.waml.w3c.webidl.webIDL.NamedConstructor;
import org.waml.w3c.webidl.webIDL.NamespaceObject;
import org.waml.w3c.webidl.webIDL.NoInterfaceObject;
import org.waml.w3c.webidl.webIDL.Operation;
import org.waml.w3c.webidl.webIDL.OperationExtendedAttribute;
import org.waml.w3c.webidl.webIDL.OperationSpecial;
import org.waml.w3c.webidl.webIDL.OperationSpecialCaller;
import org.waml.w3c.webidl.webIDL.OperationSpecialCreator;
import org.waml.w3c.webidl.webIDL.OperationSpecialDeleter;
import org.waml.w3c.webidl.webIDL.OperationSpecialGetter;
import org.waml.w3c.webidl.webIDL.OperationSpecialSetter;
import org.waml.w3c.webidl.webIDL.Prefix;
import org.waml.w3c.webidl.webIDL.PrimitiveTypeRef;
import org.waml.w3c.webidl.webIDL.PrototypeRoot;
import org.waml.w3c.webidl.webIDL.PutForwards;
import org.waml.w3c.webidl.webIDL.Replaceable;
import org.waml.w3c.webidl.webIDL.ReplaceableNamedProperties;
import org.waml.w3c.webidl.webIDL.SequenceType;
import org.waml.w3c.webidl.webIDL.Supplemental;
import org.waml.w3c.webidl.webIDL.TreatNullAs;
import org.waml.w3c.webidl.webIDL.TreatUndefinedAs;
import org.waml.w3c.webidl.webIDL.TypeDef;
import org.waml.w3c.webidl.webIDL.TypeRef;
import org.waml.w3c.webidl.webIDL.Types;
import org.waml.w3c.webidl.webIDL.UserTypeRef;
import org.waml.w3c.webidl.webIDL.WebIDLFactory;
import org.waml.w3c.webidl.webIDL.WebIDLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class WebIDLFactoryImpl extends EFactoryImpl implements WebIDLFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static WebIDLFactory init()
  {
    try
    {
      WebIDLFactory theWebIDLFactory = (WebIDLFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.waml.org/w3c/webidl/WebIDL"); 
      if (theWebIDLFactory != null)
      {
        return theWebIDLFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new WebIDLFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WebIDLFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case WebIDLPackage.IDL_DEFINITIONS: return createIDLDefinitions();
      case WebIDLPackage.IMPORT: return createImport();
      case WebIDLPackage.TYPE_DEF: return createTypeDef();
      case WebIDLPackage.TYPE_REF: return createTypeRef();
      case WebIDLPackage.USER_TYPE_REF: return createUserTypeRef();
      case WebIDLPackage.TYPES: return createTypes();
      case WebIDLPackage.PRIMITIVE_TYPE_REF: return createPrimitiveTypeRef();
      case WebIDLPackage.SEQUENCE_TYPE: return createSequenceType();
      case WebIDLPackage.CALLABLE: return createCallable();
      case WebIDLPackage.CONSTRUCTOR: return createConstructor();
      case WebIDLPackage.NAMED_CONSTRUCTOR: return createNamedConstructor();
      case WebIDLPackage.CALLBACK: return createCallback();
      case WebIDLPackage.NO_INTERFACE_OBJECT: return createNoInterfaceObject();
      case WebIDLPackage.PROTOTYPE_ROOT: return createPrototypeRoot();
      case WebIDLPackage.PUT_FORWARDS: return createPutForwards();
      case WebIDLPackage.TREAT_NULL_AS: return createTreatNullAs();
      case WebIDLPackage.TREAT_UNDEFINED_AS: return createTreatUndefinedAs();
      case WebIDLPackage.ALLOW_ANY: return createAllowAny();
      case WebIDLPackage.REPLACEABLE: return createReplaceable();
      case WebIDLPackage.SUPPLEMENTAL: return createSupplemental();
      case WebIDLPackage.REPLACEABLE_NAMED_PROPERTIES: return createReplaceableNamedProperties();
      case WebIDLPackage.ABSTRACT_DEFINITIONS: return createAbstractDefinitions();
      case WebIDLPackage.DEFINITIONS: return createDefinitions();
      case WebIDLPackage.IMPLEMENT_STATEMENT: return createImplementStatement();
      case WebIDLPackage.MODULE: return createModule();
      case WebIDLPackage.MODULE_EXTENDED_ATTRIBUTE: return createModuleExtendedAttribute();
      case WebIDLPackage.PREFIX: return createPrefix();
      case WebIDLPackage.NAMESPACE_OBJECT: return createNamespaceObject();
      case WebIDLPackage.INTERFACE: return createInterface();
      case WebIDLPackage.INTERFACE_EXTENDED_ATTRIBUTE: return createInterfaceExtendedAttribute();
      case WebIDLPackage.INTERFACE_MEMBER: return createInterfaceMember();
      case WebIDLPackage.INTERFACE_FEATURE: return createInterfaceFeature();
      case WebIDLPackage.OPERATION: return createOperation();
      case WebIDLPackage.OPERATION_EXTENDED_ATTRIBUTE: return createOperationExtendedAttribute();
      case WebIDLPackage.OPERATION_SPECIAL: return createOperationSpecial();
      case WebIDLPackage.ATTRIBUTE: return createAttribute();
      case WebIDLPackage.ATTRIBUTE_EXTENDED_ATTRIBUTE: return createAttributeExtendedAttribute();
      case WebIDLPackage.EXCEPTION: return createException();
      case WebIDLPackage.EXCEPTION_MEMBER: return createExceptionMember();
      case WebIDLPackage.EXCEPTION_FIELD: return createExceptionField();
      case WebIDLPackage.EXCEPTION_EXTENDED_ATTRIBUTE: return createExceptionExtendedAttribute();
      case WebIDLPackage.ARGUMENT: return createArgument();
      case WebIDLPackage.ARGUMENT_EXTENDED_ATTRIBUTE: return createArgumentExtendedAttribute();
      case WebIDLPackage.CONST: return createConst();
      case WebIDLPackage.CONST_EXPR: return createConstExpr();
      case WebIDLPackage.OPERATION_SPECIAL_GETTER: return createOperationSpecialGetter();
      case WebIDLPackage.OPERATION_SPECIAL_SETTER: return createOperationSpecialSetter();
      case WebIDLPackage.OPERATION_SPECIAL_CREATOR: return createOperationSpecialCreator();
      case WebIDLPackage.OPERATION_SPECIAL_DELETER: return createOperationSpecialDeleter();
      case WebIDLPackage.OPERATION_SPECIAL_CALLER: return createOperationSpecialCaller();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IDLDefinitions createIDLDefinitions()
  {
    IDLDefinitionsImpl idlDefinitions = new IDLDefinitionsImpl();
    return idlDefinitions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Import createImport()
  {
    ImportImpl import_ = new ImportImpl();
    return import_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeDef createTypeDef()
  {
    TypeDefImpl typeDef = new TypeDefImpl();
    return typeDef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeRef createTypeRef()
  {
    TypeRefImpl typeRef = new TypeRefImpl();
    return typeRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UserTypeRef createUserTypeRef()
  {
    UserTypeRefImpl userTypeRef = new UserTypeRefImpl();
    return userTypeRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Types createTypes()
  {
    TypesImpl types = new TypesImpl();
    return types;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PrimitiveTypeRef createPrimitiveTypeRef()
  {
    PrimitiveTypeRefImpl primitiveTypeRef = new PrimitiveTypeRefImpl();
    return primitiveTypeRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SequenceType createSequenceType()
  {
    SequenceTypeImpl sequenceType = new SequenceTypeImpl();
    return sequenceType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Callable createCallable()
  {
    CallableImpl callable = new CallableImpl();
    return callable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Constructor createConstructor()
  {
    ConstructorImpl constructor = new ConstructorImpl();
    return constructor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NamedConstructor createNamedConstructor()
  {
    NamedConstructorImpl namedConstructor = new NamedConstructorImpl();
    return namedConstructor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Callback createCallback()
  {
    CallbackImpl callback = new CallbackImpl();
    return callback;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NoInterfaceObject createNoInterfaceObject()
  {
    NoInterfaceObjectImpl noInterfaceObject = new NoInterfaceObjectImpl();
    return noInterfaceObject;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PrototypeRoot createPrototypeRoot()
  {
    PrototypeRootImpl prototypeRoot = new PrototypeRootImpl();
    return prototypeRoot;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PutForwards createPutForwards()
  {
    PutForwardsImpl putForwards = new PutForwardsImpl();
    return putForwards;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TreatNullAs createTreatNullAs()
  {
    TreatNullAsImpl treatNullAs = new TreatNullAsImpl();
    return treatNullAs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TreatUndefinedAs createTreatUndefinedAs()
  {
    TreatUndefinedAsImpl treatUndefinedAs = new TreatUndefinedAsImpl();
    return treatUndefinedAs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AllowAny createAllowAny()
  {
    AllowAnyImpl allowAny = new AllowAnyImpl();
    return allowAny;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Replaceable createReplaceable()
  {
    ReplaceableImpl replaceable = new ReplaceableImpl();
    return replaceable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Supplemental createSupplemental()
  {
    SupplementalImpl supplemental = new SupplementalImpl();
    return supplemental;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ReplaceableNamedProperties createReplaceableNamedProperties()
  {
    ReplaceableNamedPropertiesImpl replaceableNamedProperties = new ReplaceableNamedPropertiesImpl();
    return replaceableNamedProperties;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbstractDefinitions createAbstractDefinitions()
  {
    AbstractDefinitionsImpl abstractDefinitions = new AbstractDefinitionsImpl();
    return abstractDefinitions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Definitions createDefinitions()
  {
    DefinitionsImpl definitions = new DefinitionsImpl();
    return definitions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ImplementStatement createImplementStatement()
  {
    ImplementStatementImpl implementStatement = new ImplementStatementImpl();
    return implementStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Module createModule()
  {
    ModuleImpl module = new ModuleImpl();
    return module;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ModuleExtendedAttribute createModuleExtendedAttribute()
  {
    ModuleExtendedAttributeImpl moduleExtendedAttribute = new ModuleExtendedAttributeImpl();
    return moduleExtendedAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Prefix createPrefix()
  {
    PrefixImpl prefix = new PrefixImpl();
    return prefix;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NamespaceObject createNamespaceObject()
  {
    NamespaceObjectImpl namespaceObject = new NamespaceObjectImpl();
    return namespaceObject;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Interface createInterface()
  {
    InterfaceImpl interface_ = new InterfaceImpl();
    return interface_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InterfaceExtendedAttribute createInterfaceExtendedAttribute()
  {
    InterfaceExtendedAttributeImpl interfaceExtendedAttribute = new InterfaceExtendedAttributeImpl();
    return interfaceExtendedAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InterfaceMember createInterfaceMember()
  {
    InterfaceMemberImpl interfaceMember = new InterfaceMemberImpl();
    return interfaceMember;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InterfaceFeature createInterfaceFeature()
  {
    InterfaceFeatureImpl interfaceFeature = new InterfaceFeatureImpl();
    return interfaceFeature;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Operation createOperation()
  {
    OperationImpl operation = new OperationImpl();
    return operation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OperationExtendedAttribute createOperationExtendedAttribute()
  {
    OperationExtendedAttributeImpl operationExtendedAttribute = new OperationExtendedAttributeImpl();
    return operationExtendedAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OperationSpecial createOperationSpecial()
  {
    OperationSpecialImpl operationSpecial = new OperationSpecialImpl();
    return operationSpecial;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Attribute createAttribute()
  {
    AttributeImpl attribute = new AttributeImpl();
    return attribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AttributeExtendedAttribute createAttributeExtendedAttribute()
  {
    AttributeExtendedAttributeImpl attributeExtendedAttribute = new AttributeExtendedAttributeImpl();
    return attributeExtendedAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public org.waml.w3c.webidl.webIDL.Exception createException()
  {
    ExceptionImpl exception = new ExceptionImpl();
    return exception;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExceptionMember createExceptionMember()
  {
    ExceptionMemberImpl exceptionMember = new ExceptionMemberImpl();
    return exceptionMember;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExceptionField createExceptionField()
  {
    ExceptionFieldImpl exceptionField = new ExceptionFieldImpl();
    return exceptionField;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExceptionExtendedAttribute createExceptionExtendedAttribute()
  {
    ExceptionExtendedAttributeImpl exceptionExtendedAttribute = new ExceptionExtendedAttributeImpl();
    return exceptionExtendedAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Argument createArgument()
  {
    ArgumentImpl argument = new ArgumentImpl();
    return argument;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArgumentExtendedAttribute createArgumentExtendedAttribute()
  {
    ArgumentExtendedAttributeImpl argumentExtendedAttribute = new ArgumentExtendedAttributeImpl();
    return argumentExtendedAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Const createConst()
  {
    ConstImpl const_ = new ConstImpl();
    return const_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConstExpr createConstExpr()
  {
    ConstExprImpl constExpr = new ConstExprImpl();
    return constExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OperationSpecialGetter createOperationSpecialGetter()
  {
    OperationSpecialGetterImpl operationSpecialGetter = new OperationSpecialGetterImpl();
    return operationSpecialGetter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OperationSpecialSetter createOperationSpecialSetter()
  {
    OperationSpecialSetterImpl operationSpecialSetter = new OperationSpecialSetterImpl();
    return operationSpecialSetter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OperationSpecialCreator createOperationSpecialCreator()
  {
    OperationSpecialCreatorImpl operationSpecialCreator = new OperationSpecialCreatorImpl();
    return operationSpecialCreator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OperationSpecialDeleter createOperationSpecialDeleter()
  {
    OperationSpecialDeleterImpl operationSpecialDeleter = new OperationSpecialDeleterImpl();
    return operationSpecialDeleter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OperationSpecialCaller createOperationSpecialCaller()
  {
    OperationSpecialCallerImpl operationSpecialCaller = new OperationSpecialCallerImpl();
    return operationSpecialCaller;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WebIDLPackage getWebIDLPackage()
  {
    return (WebIDLPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static WebIDLPackage getPackage()
  {
    return WebIDLPackage.eINSTANCE;
  }

} //WebIDLFactoryImpl
