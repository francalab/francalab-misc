/**
 * <copyright>
 * </copyright>
 *

 */
package org.waml.w3c.webidl.webIDL.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

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
import org.waml.w3c.webidl.webIDL.WebIDLPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.waml.w3c.webidl.webIDL.WebIDLPackage
 * @generated
 */
public class WebIDLSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static WebIDLPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WebIDLSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = WebIDLPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case WebIDLPackage.IDL_DEFINITIONS:
      {
        IDLDefinitions idlDefinitions = (IDLDefinitions)theEObject;
        T result = caseIDLDefinitions(idlDefinitions);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case WebIDLPackage.IMPORT:
      {
        Import import_ = (Import)theEObject;
        T result = caseImport(import_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case WebIDLPackage.TYPE_DEF:
      {
        TypeDef typeDef = (TypeDef)theEObject;
        T result = caseTypeDef(typeDef);
        if (result == null) result = caseTypes(typeDef);
        if (result == null) result = caseDefinitions(typeDef);
        if (result == null) result = caseAbstractDefinitions(typeDef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case WebIDLPackage.TYPE_REF:
      {
        TypeRef typeRef = (TypeRef)theEObject;
        T result = caseTypeRef(typeRef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case WebIDLPackage.USER_TYPE_REF:
      {
        UserTypeRef userTypeRef = (UserTypeRef)theEObject;
        T result = caseUserTypeRef(userTypeRef);
        if (result == null) result = caseTypeRef(userTypeRef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case WebIDLPackage.TYPES:
      {
        Types types = (Types)theEObject;
        T result = caseTypes(types);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case WebIDLPackage.PRIMITIVE_TYPE_REF:
      {
        PrimitiveTypeRef primitiveTypeRef = (PrimitiveTypeRef)theEObject;
        T result = casePrimitiveTypeRef(primitiveTypeRef);
        if (result == null) result = caseTypeRef(primitiveTypeRef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case WebIDLPackage.SEQUENCE_TYPE:
      {
        SequenceType sequenceType = (SequenceType)theEObject;
        T result = caseSequenceType(sequenceType);
        if (result == null) result = caseTypeRef(sequenceType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case WebIDLPackage.CALLABLE:
      {
        Callable callable = (Callable)theEObject;
        T result = caseCallable(callable);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case WebIDLPackage.CONSTRUCTOR:
      {
        Constructor constructor = (Constructor)theEObject;
        T result = caseConstructor(constructor);
        if (result == null) result = caseNamedConstructor(constructor);
        if (result == null) result = caseInterfaceExtendedAttribute(constructor);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case WebIDLPackage.NAMED_CONSTRUCTOR:
      {
        NamedConstructor namedConstructor = (NamedConstructor)theEObject;
        T result = caseNamedConstructor(namedConstructor);
        if (result == null) result = caseInterfaceExtendedAttribute(namedConstructor);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case WebIDLPackage.CALLBACK:
      {
        Callback callback = (Callback)theEObject;
        T result = caseCallback(callback);
        if (result == null) result = caseInterfaceExtendedAttribute(callback);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case WebIDLPackage.NO_INTERFACE_OBJECT:
      {
        NoInterfaceObject noInterfaceObject = (NoInterfaceObject)theEObject;
        T result = caseNoInterfaceObject(noInterfaceObject);
        if (result == null) result = caseInterfaceExtendedAttribute(noInterfaceObject);
        if (result == null) result = caseExceptionExtendedAttribute(noInterfaceObject);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case WebIDLPackage.PROTOTYPE_ROOT:
      {
        PrototypeRoot prototypeRoot = (PrototypeRoot)theEObject;
        T result = casePrototypeRoot(prototypeRoot);
        if (result == null) result = caseInterfaceExtendedAttribute(prototypeRoot);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case WebIDLPackage.PUT_FORWARDS:
      {
        PutForwards putForwards = (PutForwards)theEObject;
        T result = casePutForwards(putForwards);
        if (result == null) result = caseAttributeExtendedAttribute(putForwards);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case WebIDLPackage.TREAT_NULL_AS:
      {
        TreatNullAs treatNullAs = (TreatNullAs)theEObject;
        T result = caseTreatNullAs(treatNullAs);
        if (result == null) result = caseOperationExtendedAttribute(treatNullAs);
        if (result == null) result = caseAttributeExtendedAttribute(treatNullAs);
        if (result == null) result = caseArgumentExtendedAttribute(treatNullAs);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case WebIDLPackage.TREAT_UNDEFINED_AS:
      {
        TreatUndefinedAs treatUndefinedAs = (TreatUndefinedAs)theEObject;
        T result = caseTreatUndefinedAs(treatUndefinedAs);
        if (result == null) result = caseOperationExtendedAttribute(treatUndefinedAs);
        if (result == null) result = caseAttributeExtendedAttribute(treatUndefinedAs);
        if (result == null) result = caseArgumentExtendedAttribute(treatUndefinedAs);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case WebIDLPackage.ALLOW_ANY:
      {
        AllowAny allowAny = (AllowAny)theEObject;
        T result = caseAllowAny(allowAny);
        if (result == null) result = caseArgumentExtendedAttribute(allowAny);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case WebIDLPackage.REPLACEABLE:
      {
        Replaceable replaceable = (Replaceable)theEObject;
        T result = caseReplaceable(replaceable);
        if (result == null) result = caseAttributeExtendedAttribute(replaceable);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case WebIDLPackage.SUPPLEMENTAL:
      {
        Supplemental supplemental = (Supplemental)theEObject;
        T result = caseSupplemental(supplemental);
        if (result == null) result = caseInterfaceExtendedAttribute(supplemental);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case WebIDLPackage.REPLACEABLE_NAMED_PROPERTIES:
      {
        ReplaceableNamedProperties replaceableNamedProperties = (ReplaceableNamedProperties)theEObject;
        T result = caseReplaceableNamedProperties(replaceableNamedProperties);
        if (result == null) result = caseInterfaceExtendedAttribute(replaceableNamedProperties);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case WebIDLPackage.ABSTRACT_DEFINITIONS:
      {
        AbstractDefinitions abstractDefinitions = (AbstractDefinitions)theEObject;
        T result = caseAbstractDefinitions(abstractDefinitions);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case WebIDLPackage.DEFINITIONS:
      {
        Definitions definitions = (Definitions)theEObject;
        T result = caseDefinitions(definitions);
        if (result == null) result = caseAbstractDefinitions(definitions);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case WebIDLPackage.IMPLEMENT_STATEMENT:
      {
        ImplementStatement implementStatement = (ImplementStatement)theEObject;
        T result = caseImplementStatement(implementStatement);
        if (result == null) result = caseDefinitions(implementStatement);
        if (result == null) result = caseAbstractDefinitions(implementStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case WebIDLPackage.MODULE:
      {
        Module module = (Module)theEObject;
        T result = caseModule(module);
        if (result == null) result = caseAbstractDefinitions(module);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case WebIDLPackage.MODULE_EXTENDED_ATTRIBUTE:
      {
        ModuleExtendedAttribute moduleExtendedAttribute = (ModuleExtendedAttribute)theEObject;
        T result = caseModuleExtendedAttribute(moduleExtendedAttribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case WebIDLPackage.PREFIX:
      {
        Prefix prefix = (Prefix)theEObject;
        T result = casePrefix(prefix);
        if (result == null) result = caseModuleExtendedAttribute(prefix);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case WebIDLPackage.NAMESPACE_OBJECT:
      {
        NamespaceObject namespaceObject = (NamespaceObject)theEObject;
        T result = caseNamespaceObject(namespaceObject);
        if (result == null) result = caseModuleExtendedAttribute(namespaceObject);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case WebIDLPackage.INTERFACE:
      {
        Interface interface_ = (Interface)theEObject;
        T result = caseInterface(interface_);
        if (result == null) result = caseTypes(interface_);
        if (result == null) result = caseDefinitions(interface_);
        if (result == null) result = caseAbstractDefinitions(interface_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case WebIDLPackage.INTERFACE_EXTENDED_ATTRIBUTE:
      {
        InterfaceExtendedAttribute interfaceExtendedAttribute = (InterfaceExtendedAttribute)theEObject;
        T result = caseInterfaceExtendedAttribute(interfaceExtendedAttribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case WebIDLPackage.INTERFACE_MEMBER:
      {
        InterfaceMember interfaceMember = (InterfaceMember)theEObject;
        T result = caseInterfaceMember(interfaceMember);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case WebIDLPackage.INTERFACE_FEATURE:
      {
        InterfaceFeature interfaceFeature = (InterfaceFeature)theEObject;
        T result = caseInterfaceFeature(interfaceFeature);
        if (result == null) result = caseTypes(interfaceFeature);
        if (result == null) result = caseInterfaceMember(interfaceFeature);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case WebIDLPackage.OPERATION:
      {
        Operation operation = (Operation)theEObject;
        T result = caseOperation(operation);
        if (result == null) result = caseInterfaceFeature(operation);
        if (result == null) result = caseTypes(operation);
        if (result == null) result = caseInterfaceMember(operation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case WebIDLPackage.OPERATION_EXTENDED_ATTRIBUTE:
      {
        OperationExtendedAttribute operationExtendedAttribute = (OperationExtendedAttribute)theEObject;
        T result = caseOperationExtendedAttribute(operationExtendedAttribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case WebIDLPackage.OPERATION_SPECIAL:
      {
        OperationSpecial operationSpecial = (OperationSpecial)theEObject;
        T result = caseOperationSpecial(operationSpecial);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case WebIDLPackage.ATTRIBUTE:
      {
        Attribute attribute = (Attribute)theEObject;
        T result = caseAttribute(attribute);
        if (result == null) result = caseInterfaceFeature(attribute);
        if (result == null) result = caseTypes(attribute);
        if (result == null) result = caseInterfaceMember(attribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case WebIDLPackage.ATTRIBUTE_EXTENDED_ATTRIBUTE:
      {
        AttributeExtendedAttribute attributeExtendedAttribute = (AttributeExtendedAttribute)theEObject;
        T result = caseAttributeExtendedAttribute(attributeExtendedAttribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case WebIDLPackage.EXCEPTION:
      {
        org.waml.w3c.webidl.webIDL.Exception exception = (org.waml.w3c.webidl.webIDL.Exception)theEObject;
        T result = caseException(exception);
        if (result == null) result = caseDefinitions(exception);
        if (result == null) result = caseAbstractDefinitions(exception);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case WebIDLPackage.EXCEPTION_MEMBER:
      {
        ExceptionMember exceptionMember = (ExceptionMember)theEObject;
        T result = caseExceptionMember(exceptionMember);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case WebIDLPackage.EXCEPTION_FIELD:
      {
        ExceptionField exceptionField = (ExceptionField)theEObject;
        T result = caseExceptionField(exceptionField);
        if (result == null) result = caseExceptionMember(exceptionField);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case WebIDLPackage.EXCEPTION_EXTENDED_ATTRIBUTE:
      {
        ExceptionExtendedAttribute exceptionExtendedAttribute = (ExceptionExtendedAttribute)theEObject;
        T result = caseExceptionExtendedAttribute(exceptionExtendedAttribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case WebIDLPackage.ARGUMENT:
      {
        Argument argument = (Argument)theEObject;
        T result = caseArgument(argument);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case WebIDLPackage.ARGUMENT_EXTENDED_ATTRIBUTE:
      {
        ArgumentExtendedAttribute argumentExtendedAttribute = (ArgumentExtendedAttribute)theEObject;
        T result = caseArgumentExtendedAttribute(argumentExtendedAttribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case WebIDLPackage.CONST:
      {
        Const const_ = (Const)theEObject;
        T result = caseConst(const_);
        if (result == null) result = caseInterfaceMember(const_);
        if (result == null) result = caseExceptionMember(const_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case WebIDLPackage.CONST_EXPR:
      {
        ConstExpr constExpr = (ConstExpr)theEObject;
        T result = caseConstExpr(constExpr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case WebIDLPackage.OPERATION_SPECIAL_GETTER:
      {
        OperationSpecialGetter operationSpecialGetter = (OperationSpecialGetter)theEObject;
        T result = caseOperationSpecialGetter(operationSpecialGetter);
        if (result == null) result = caseOperationSpecial(operationSpecialGetter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case WebIDLPackage.OPERATION_SPECIAL_SETTER:
      {
        OperationSpecialSetter operationSpecialSetter = (OperationSpecialSetter)theEObject;
        T result = caseOperationSpecialSetter(operationSpecialSetter);
        if (result == null) result = caseOperationSpecial(operationSpecialSetter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case WebIDLPackage.OPERATION_SPECIAL_CREATOR:
      {
        OperationSpecialCreator operationSpecialCreator = (OperationSpecialCreator)theEObject;
        T result = caseOperationSpecialCreator(operationSpecialCreator);
        if (result == null) result = caseOperationSpecial(operationSpecialCreator);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case WebIDLPackage.OPERATION_SPECIAL_DELETER:
      {
        OperationSpecialDeleter operationSpecialDeleter = (OperationSpecialDeleter)theEObject;
        T result = caseOperationSpecialDeleter(operationSpecialDeleter);
        if (result == null) result = caseOperationSpecial(operationSpecialDeleter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case WebIDLPackage.OPERATION_SPECIAL_CALLER:
      {
        OperationSpecialCaller operationSpecialCaller = (OperationSpecialCaller)theEObject;
        T result = caseOperationSpecialCaller(operationSpecialCaller);
        if (result == null) result = caseOperationSpecial(operationSpecialCaller);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>IDL Definitions</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>IDL Definitions</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIDLDefinitions(IDLDefinitions object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Import</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Import</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseImport(Import object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Type Def</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Type Def</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTypeDef(TypeDef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Type Ref</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Type Ref</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTypeRef(TypeRef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>User Type Ref</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>User Type Ref</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUserTypeRef(UserTypeRef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Types</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Types</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTypes(Types object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Primitive Type Ref</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Primitive Type Ref</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePrimitiveTypeRef(PrimitiveTypeRef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Sequence Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Sequence Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSequenceType(SequenceType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Callable</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Callable</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCallable(Callable object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Constructor</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Constructor</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConstructor(Constructor object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Named Constructor</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Named Constructor</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNamedConstructor(NamedConstructor object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Callback</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Callback</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCallback(Callback object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>No Interface Object</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>No Interface Object</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNoInterfaceObject(NoInterfaceObject object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Prototype Root</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Prototype Root</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePrototypeRoot(PrototypeRoot object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Put Forwards</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Put Forwards</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePutForwards(PutForwards object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Treat Null As</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Treat Null As</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTreatNullAs(TreatNullAs object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Treat Undefined As</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Treat Undefined As</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTreatUndefinedAs(TreatUndefinedAs object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Allow Any</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Allow Any</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAllowAny(AllowAny object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Replaceable</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Replaceable</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseReplaceable(Replaceable object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Supplemental</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Supplemental</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSupplemental(Supplemental object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Replaceable Named Properties</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Replaceable Named Properties</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseReplaceableNamedProperties(ReplaceableNamedProperties object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Abstract Definitions</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Abstract Definitions</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAbstractDefinitions(AbstractDefinitions object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Definitions</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Definitions</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDefinitions(Definitions object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Implement Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Implement Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseImplementStatement(ImplementStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Module</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Module</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModule(Module object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Module Extended Attribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Module Extended Attribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModuleExtendedAttribute(ModuleExtendedAttribute object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Prefix</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Prefix</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePrefix(Prefix object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Namespace Object</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Namespace Object</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNamespaceObject(NamespaceObject object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Interface</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Interface</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInterface(Interface object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Interface Extended Attribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Interface Extended Attribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInterfaceExtendedAttribute(InterfaceExtendedAttribute object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Interface Member</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Interface Member</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInterfaceMember(InterfaceMember object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Interface Feature</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Interface Feature</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInterfaceFeature(InterfaceFeature object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Operation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Operation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOperation(Operation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Operation Extended Attribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Operation Extended Attribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOperationExtendedAttribute(OperationExtendedAttribute object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Operation Special</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Operation Special</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOperationSpecial(OperationSpecial object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Attribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Attribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAttribute(Attribute object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Attribute Extended Attribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Attribute Extended Attribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAttributeExtendedAttribute(AttributeExtendedAttribute object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Exception</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Exception</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseException(org.waml.w3c.webidl.webIDL.Exception object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Exception Member</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Exception Member</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExceptionMember(ExceptionMember object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Exception Field</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Exception Field</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExceptionField(ExceptionField object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Exception Extended Attribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Exception Extended Attribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExceptionExtendedAttribute(ExceptionExtendedAttribute object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Argument</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Argument</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseArgument(Argument object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Argument Extended Attribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Argument Extended Attribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseArgumentExtendedAttribute(ArgumentExtendedAttribute object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Const</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Const</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConst(Const object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Const Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Const Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConstExpr(ConstExpr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Operation Special Getter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Operation Special Getter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOperationSpecialGetter(OperationSpecialGetter object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Operation Special Setter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Operation Special Setter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOperationSpecialSetter(OperationSpecialSetter object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Operation Special Creator</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Operation Special Creator</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOperationSpecialCreator(OperationSpecialCreator object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Operation Special Deleter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Operation Special Deleter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOperationSpecialDeleter(OperationSpecialDeleter object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Operation Special Caller</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Operation Special Caller</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOperationSpecialCaller(OperationSpecialCaller object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //WebIDLSwitch
