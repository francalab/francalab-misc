/**
 * <copyright>
 * </copyright>
 *

 */
package org.waml.w3c.webidl.webIDL.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

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
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.waml.w3c.webidl.webIDL.WebIDLPackage
 * @generated
 */
public class WebIDLAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static WebIDLPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WebIDLAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = WebIDLPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected WebIDLSwitch<Adapter> modelSwitch =
    new WebIDLSwitch<Adapter>()
    {
      @Override
      public Adapter caseIDLDefinitions(IDLDefinitions object)
      {
        return createIDLDefinitionsAdapter();
      }
      @Override
      public Adapter caseImport(Import object)
      {
        return createImportAdapter();
      }
      @Override
      public Adapter caseTypeDef(TypeDef object)
      {
        return createTypeDefAdapter();
      }
      @Override
      public Adapter caseTypeRef(TypeRef object)
      {
        return createTypeRefAdapter();
      }
      @Override
      public Adapter caseUserTypeRef(UserTypeRef object)
      {
        return createUserTypeRefAdapter();
      }
      @Override
      public Adapter caseTypes(Types object)
      {
        return createTypesAdapter();
      }
      @Override
      public Adapter casePrimitiveTypeRef(PrimitiveTypeRef object)
      {
        return createPrimitiveTypeRefAdapter();
      }
      @Override
      public Adapter caseSequenceType(SequenceType object)
      {
        return createSequenceTypeAdapter();
      }
      @Override
      public Adapter caseCallable(Callable object)
      {
        return createCallableAdapter();
      }
      @Override
      public Adapter caseConstructor(Constructor object)
      {
        return createConstructorAdapter();
      }
      @Override
      public Adapter caseNamedConstructor(NamedConstructor object)
      {
        return createNamedConstructorAdapter();
      }
      @Override
      public Adapter caseCallback(Callback object)
      {
        return createCallbackAdapter();
      }
      @Override
      public Adapter caseNoInterfaceObject(NoInterfaceObject object)
      {
        return createNoInterfaceObjectAdapter();
      }
      @Override
      public Adapter casePrototypeRoot(PrototypeRoot object)
      {
        return createPrototypeRootAdapter();
      }
      @Override
      public Adapter casePutForwards(PutForwards object)
      {
        return createPutForwardsAdapter();
      }
      @Override
      public Adapter caseTreatNullAs(TreatNullAs object)
      {
        return createTreatNullAsAdapter();
      }
      @Override
      public Adapter caseTreatUndefinedAs(TreatUndefinedAs object)
      {
        return createTreatUndefinedAsAdapter();
      }
      @Override
      public Adapter caseAllowAny(AllowAny object)
      {
        return createAllowAnyAdapter();
      }
      @Override
      public Adapter caseReplaceable(Replaceable object)
      {
        return createReplaceableAdapter();
      }
      @Override
      public Adapter caseSupplemental(Supplemental object)
      {
        return createSupplementalAdapter();
      }
      @Override
      public Adapter caseReplaceableNamedProperties(ReplaceableNamedProperties object)
      {
        return createReplaceableNamedPropertiesAdapter();
      }
      @Override
      public Adapter caseAbstractDefinitions(AbstractDefinitions object)
      {
        return createAbstractDefinitionsAdapter();
      }
      @Override
      public Adapter caseDefinitions(Definitions object)
      {
        return createDefinitionsAdapter();
      }
      @Override
      public Adapter caseImplementStatement(ImplementStatement object)
      {
        return createImplementStatementAdapter();
      }
      @Override
      public Adapter caseModule(Module object)
      {
        return createModuleAdapter();
      }
      @Override
      public Adapter caseModuleExtendedAttribute(ModuleExtendedAttribute object)
      {
        return createModuleExtendedAttributeAdapter();
      }
      @Override
      public Adapter casePrefix(Prefix object)
      {
        return createPrefixAdapter();
      }
      @Override
      public Adapter caseNamespaceObject(NamespaceObject object)
      {
        return createNamespaceObjectAdapter();
      }
      @Override
      public Adapter caseInterface(Interface object)
      {
        return createInterfaceAdapter();
      }
      @Override
      public Adapter caseInterfaceExtendedAttribute(InterfaceExtendedAttribute object)
      {
        return createInterfaceExtendedAttributeAdapter();
      }
      @Override
      public Adapter caseInterfaceMember(InterfaceMember object)
      {
        return createInterfaceMemberAdapter();
      }
      @Override
      public Adapter caseInterfaceFeature(InterfaceFeature object)
      {
        return createInterfaceFeatureAdapter();
      }
      @Override
      public Adapter caseOperation(Operation object)
      {
        return createOperationAdapter();
      }
      @Override
      public Adapter caseOperationExtendedAttribute(OperationExtendedAttribute object)
      {
        return createOperationExtendedAttributeAdapter();
      }
      @Override
      public Adapter caseOperationSpecial(OperationSpecial object)
      {
        return createOperationSpecialAdapter();
      }
      @Override
      public Adapter caseAttribute(Attribute object)
      {
        return createAttributeAdapter();
      }
      @Override
      public Adapter caseAttributeExtendedAttribute(AttributeExtendedAttribute object)
      {
        return createAttributeExtendedAttributeAdapter();
      }
      @Override
      public Adapter caseException(org.waml.w3c.webidl.webIDL.Exception object)
      {
        return createExceptionAdapter();
      }
      @Override
      public Adapter caseExceptionMember(ExceptionMember object)
      {
        return createExceptionMemberAdapter();
      }
      @Override
      public Adapter caseExceptionField(ExceptionField object)
      {
        return createExceptionFieldAdapter();
      }
      @Override
      public Adapter caseExceptionExtendedAttribute(ExceptionExtendedAttribute object)
      {
        return createExceptionExtendedAttributeAdapter();
      }
      @Override
      public Adapter caseArgument(Argument object)
      {
        return createArgumentAdapter();
      }
      @Override
      public Adapter caseArgumentExtendedAttribute(ArgumentExtendedAttribute object)
      {
        return createArgumentExtendedAttributeAdapter();
      }
      @Override
      public Adapter caseConst(Const object)
      {
        return createConstAdapter();
      }
      @Override
      public Adapter caseConstExpr(ConstExpr object)
      {
        return createConstExprAdapter();
      }
      @Override
      public Adapter caseOperationSpecialGetter(OperationSpecialGetter object)
      {
        return createOperationSpecialGetterAdapter();
      }
      @Override
      public Adapter caseOperationSpecialSetter(OperationSpecialSetter object)
      {
        return createOperationSpecialSetterAdapter();
      }
      @Override
      public Adapter caseOperationSpecialCreator(OperationSpecialCreator object)
      {
        return createOperationSpecialCreatorAdapter();
      }
      @Override
      public Adapter caseOperationSpecialDeleter(OperationSpecialDeleter object)
      {
        return createOperationSpecialDeleterAdapter();
      }
      @Override
      public Adapter caseOperationSpecialCaller(OperationSpecialCaller object)
      {
        return createOperationSpecialCallerAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link org.waml.w3c.webidl.webIDL.IDLDefinitions <em>IDL Definitions</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.waml.w3c.webidl.webIDL.IDLDefinitions
   * @generated
   */
  public Adapter createIDLDefinitionsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.waml.w3c.webidl.webIDL.Import <em>Import</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.waml.w3c.webidl.webIDL.Import
   * @generated
   */
  public Adapter createImportAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.waml.w3c.webidl.webIDL.TypeDef <em>Type Def</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.waml.w3c.webidl.webIDL.TypeDef
   * @generated
   */
  public Adapter createTypeDefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.waml.w3c.webidl.webIDL.TypeRef <em>Type Ref</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.waml.w3c.webidl.webIDL.TypeRef
   * @generated
   */
  public Adapter createTypeRefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.waml.w3c.webidl.webIDL.UserTypeRef <em>User Type Ref</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.waml.w3c.webidl.webIDL.UserTypeRef
   * @generated
   */
  public Adapter createUserTypeRefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.waml.w3c.webidl.webIDL.Types <em>Types</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.waml.w3c.webidl.webIDL.Types
   * @generated
   */
  public Adapter createTypesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.waml.w3c.webidl.webIDL.PrimitiveTypeRef <em>Primitive Type Ref</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.waml.w3c.webidl.webIDL.PrimitiveTypeRef
   * @generated
   */
  public Adapter createPrimitiveTypeRefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.waml.w3c.webidl.webIDL.SequenceType <em>Sequence Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.waml.w3c.webidl.webIDL.SequenceType
   * @generated
   */
  public Adapter createSequenceTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.waml.w3c.webidl.webIDL.Callable <em>Callable</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.waml.w3c.webidl.webIDL.Callable
   * @generated
   */
  public Adapter createCallableAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.waml.w3c.webidl.webIDL.Constructor <em>Constructor</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.waml.w3c.webidl.webIDL.Constructor
   * @generated
   */
  public Adapter createConstructorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.waml.w3c.webidl.webIDL.NamedConstructor <em>Named Constructor</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.waml.w3c.webidl.webIDL.NamedConstructor
   * @generated
   */
  public Adapter createNamedConstructorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.waml.w3c.webidl.webIDL.Callback <em>Callback</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.waml.w3c.webidl.webIDL.Callback
   * @generated
   */
  public Adapter createCallbackAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.waml.w3c.webidl.webIDL.NoInterfaceObject <em>No Interface Object</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.waml.w3c.webidl.webIDL.NoInterfaceObject
   * @generated
   */
  public Adapter createNoInterfaceObjectAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.waml.w3c.webidl.webIDL.PrototypeRoot <em>Prototype Root</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.waml.w3c.webidl.webIDL.PrototypeRoot
   * @generated
   */
  public Adapter createPrototypeRootAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.waml.w3c.webidl.webIDL.PutForwards <em>Put Forwards</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.waml.w3c.webidl.webIDL.PutForwards
   * @generated
   */
  public Adapter createPutForwardsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.waml.w3c.webidl.webIDL.TreatNullAs <em>Treat Null As</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.waml.w3c.webidl.webIDL.TreatNullAs
   * @generated
   */
  public Adapter createTreatNullAsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.waml.w3c.webidl.webIDL.TreatUndefinedAs <em>Treat Undefined As</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.waml.w3c.webidl.webIDL.TreatUndefinedAs
   * @generated
   */
  public Adapter createTreatUndefinedAsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.waml.w3c.webidl.webIDL.AllowAny <em>Allow Any</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.waml.w3c.webidl.webIDL.AllowAny
   * @generated
   */
  public Adapter createAllowAnyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.waml.w3c.webidl.webIDL.Replaceable <em>Replaceable</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.waml.w3c.webidl.webIDL.Replaceable
   * @generated
   */
  public Adapter createReplaceableAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.waml.w3c.webidl.webIDL.Supplemental <em>Supplemental</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.waml.w3c.webidl.webIDL.Supplemental
   * @generated
   */
  public Adapter createSupplementalAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.waml.w3c.webidl.webIDL.ReplaceableNamedProperties <em>Replaceable Named Properties</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.waml.w3c.webidl.webIDL.ReplaceableNamedProperties
   * @generated
   */
  public Adapter createReplaceableNamedPropertiesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.waml.w3c.webidl.webIDL.AbstractDefinitions <em>Abstract Definitions</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.waml.w3c.webidl.webIDL.AbstractDefinitions
   * @generated
   */
  public Adapter createAbstractDefinitionsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.waml.w3c.webidl.webIDL.Definitions <em>Definitions</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.waml.w3c.webidl.webIDL.Definitions
   * @generated
   */
  public Adapter createDefinitionsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.waml.w3c.webidl.webIDL.ImplementStatement <em>Implement Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.waml.w3c.webidl.webIDL.ImplementStatement
   * @generated
   */
  public Adapter createImplementStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.waml.w3c.webidl.webIDL.Module <em>Module</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.waml.w3c.webidl.webIDL.Module
   * @generated
   */
  public Adapter createModuleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.waml.w3c.webidl.webIDL.ModuleExtendedAttribute <em>Module Extended Attribute</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.waml.w3c.webidl.webIDL.ModuleExtendedAttribute
   * @generated
   */
  public Adapter createModuleExtendedAttributeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.waml.w3c.webidl.webIDL.Prefix <em>Prefix</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.waml.w3c.webidl.webIDL.Prefix
   * @generated
   */
  public Adapter createPrefixAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.waml.w3c.webidl.webIDL.NamespaceObject <em>Namespace Object</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.waml.w3c.webidl.webIDL.NamespaceObject
   * @generated
   */
  public Adapter createNamespaceObjectAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.waml.w3c.webidl.webIDL.Interface <em>Interface</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.waml.w3c.webidl.webIDL.Interface
   * @generated
   */
  public Adapter createInterfaceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.waml.w3c.webidl.webIDL.InterfaceExtendedAttribute <em>Interface Extended Attribute</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.waml.w3c.webidl.webIDL.InterfaceExtendedAttribute
   * @generated
   */
  public Adapter createInterfaceExtendedAttributeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.waml.w3c.webidl.webIDL.InterfaceMember <em>Interface Member</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.waml.w3c.webidl.webIDL.InterfaceMember
   * @generated
   */
  public Adapter createInterfaceMemberAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.waml.w3c.webidl.webIDL.InterfaceFeature <em>Interface Feature</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.waml.w3c.webidl.webIDL.InterfaceFeature
   * @generated
   */
  public Adapter createInterfaceFeatureAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.waml.w3c.webidl.webIDL.Operation <em>Operation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.waml.w3c.webidl.webIDL.Operation
   * @generated
   */
  public Adapter createOperationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.waml.w3c.webidl.webIDL.OperationExtendedAttribute <em>Operation Extended Attribute</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.waml.w3c.webidl.webIDL.OperationExtendedAttribute
   * @generated
   */
  public Adapter createOperationExtendedAttributeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.waml.w3c.webidl.webIDL.OperationSpecial <em>Operation Special</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.waml.w3c.webidl.webIDL.OperationSpecial
   * @generated
   */
  public Adapter createOperationSpecialAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.waml.w3c.webidl.webIDL.Attribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.waml.w3c.webidl.webIDL.Attribute
   * @generated
   */
  public Adapter createAttributeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.waml.w3c.webidl.webIDL.AttributeExtendedAttribute <em>Attribute Extended Attribute</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.waml.w3c.webidl.webIDL.AttributeExtendedAttribute
   * @generated
   */
  public Adapter createAttributeExtendedAttributeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.waml.w3c.webidl.webIDL.Exception <em>Exception</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.waml.w3c.webidl.webIDL.Exception
   * @generated
   */
  public Adapter createExceptionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.waml.w3c.webidl.webIDL.ExceptionMember <em>Exception Member</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.waml.w3c.webidl.webIDL.ExceptionMember
   * @generated
   */
  public Adapter createExceptionMemberAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.waml.w3c.webidl.webIDL.ExceptionField <em>Exception Field</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.waml.w3c.webidl.webIDL.ExceptionField
   * @generated
   */
  public Adapter createExceptionFieldAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.waml.w3c.webidl.webIDL.ExceptionExtendedAttribute <em>Exception Extended Attribute</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.waml.w3c.webidl.webIDL.ExceptionExtendedAttribute
   * @generated
   */
  public Adapter createExceptionExtendedAttributeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.waml.w3c.webidl.webIDL.Argument <em>Argument</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.waml.w3c.webidl.webIDL.Argument
   * @generated
   */
  public Adapter createArgumentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.waml.w3c.webidl.webIDL.ArgumentExtendedAttribute <em>Argument Extended Attribute</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.waml.w3c.webidl.webIDL.ArgumentExtendedAttribute
   * @generated
   */
  public Adapter createArgumentExtendedAttributeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.waml.w3c.webidl.webIDL.Const <em>Const</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.waml.w3c.webidl.webIDL.Const
   * @generated
   */
  public Adapter createConstAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.waml.w3c.webidl.webIDL.ConstExpr <em>Const Expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.waml.w3c.webidl.webIDL.ConstExpr
   * @generated
   */
  public Adapter createConstExprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.waml.w3c.webidl.webIDL.OperationSpecialGetter <em>Operation Special Getter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.waml.w3c.webidl.webIDL.OperationSpecialGetter
   * @generated
   */
  public Adapter createOperationSpecialGetterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.waml.w3c.webidl.webIDL.OperationSpecialSetter <em>Operation Special Setter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.waml.w3c.webidl.webIDL.OperationSpecialSetter
   * @generated
   */
  public Adapter createOperationSpecialSetterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.waml.w3c.webidl.webIDL.OperationSpecialCreator <em>Operation Special Creator</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.waml.w3c.webidl.webIDL.OperationSpecialCreator
   * @generated
   */
  public Adapter createOperationSpecialCreatorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.waml.w3c.webidl.webIDL.OperationSpecialDeleter <em>Operation Special Deleter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.waml.w3c.webidl.webIDL.OperationSpecialDeleter
   * @generated
   */
  public Adapter createOperationSpecialDeleterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.waml.w3c.webidl.webIDL.OperationSpecialCaller <em>Operation Special Caller</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.waml.w3c.webidl.webIDL.OperationSpecialCaller
   * @generated
   */
  public Adapter createOperationSpecialCallerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //WebIDLAdapterFactory
