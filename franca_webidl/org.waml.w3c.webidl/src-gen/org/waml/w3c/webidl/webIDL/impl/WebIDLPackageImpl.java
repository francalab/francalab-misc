/**
 * <copyright>
 * </copyright>
 *

 */
package org.waml.w3c.webidl.webIDL.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

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
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class WebIDLPackageImpl extends EPackageImpl implements WebIDLPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass idlDefinitionsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass importEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass typeDefEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass typeRefEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass userTypeRefEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass typesEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass primitiveTypeRefEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sequenceTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass callableEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass constructorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass namedConstructorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass callbackEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass noInterfaceObjectEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass prototypeRootEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass putForwardsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass treatNullAsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass treatUndefinedAsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass allowAnyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass replaceableEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass supplementalEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass replaceableNamedPropertiesEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass abstractDefinitionsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass definitionsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass implementStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass moduleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass moduleExtendedAttributeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass prefixEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass namespaceObjectEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass interfaceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass interfaceExtendedAttributeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass interfaceMemberEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass interfaceFeatureEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass operationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass operationExtendedAttributeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass operationSpecialEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass attributeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass attributeExtendedAttributeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass exceptionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass exceptionMemberEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass exceptionFieldEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass exceptionExtendedAttributeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass argumentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass argumentExtendedAttributeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass constEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass constExprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass operationSpecialGetterEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass operationSpecialSetterEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass operationSpecialCreatorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass operationSpecialDeleterEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass operationSpecialCallerEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see org.waml.w3c.webidl.webIDL.WebIDLPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private WebIDLPackageImpl()
  {
    super(eNS_URI, WebIDLFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link WebIDLPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static WebIDLPackage init()
  {
    if (isInited) return (WebIDLPackage)EPackage.Registry.INSTANCE.getEPackage(WebIDLPackage.eNS_URI);

    // Obtain or create and register package
    WebIDLPackageImpl theWebIDLPackage = (WebIDLPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof WebIDLPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new WebIDLPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theWebIDLPackage.createPackageContents();

    // Initialize created meta-data
    theWebIDLPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theWebIDLPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(WebIDLPackage.eNS_URI, theWebIDLPackage);
    return theWebIDLPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIDLDefinitions()
  {
    return idlDefinitionsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIDLDefinitions_Imports()
  {
    return (EReference)idlDefinitionsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIDLDefinitions_Definitions()
  {
    return (EReference)idlDefinitionsEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getImport()
  {
    return importEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getImport_ImportURI()
  {
    return (EAttribute)importEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTypeDef()
  {
    return typeDefEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTypeDef_Type()
  {
    return (EReference)typeDefEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTypeDef_Name()
  {
    return (EAttribute)typeDefEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTypeRef()
  {
    return typeRefEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTypeRef_IsArray()
  {
    return (EAttribute)typeRefEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUserTypeRef()
  {
    return userTypeRefEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUserTypeRef_Type()
  {
    return (EReference)userTypeRefEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTypes()
  {
    return typesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPrimitiveTypeRef()
  {
    return primitiveTypeRefEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPrimitiveTypeRef_Unsigned()
  {
    return (EAttribute)primitiveTypeRefEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPrimitiveTypeRef_Name()
  {
    return (EAttribute)primitiveTypeRefEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPrimitiveTypeRef_Nullable()
  {
    return (EAttribute)primitiveTypeRefEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSequenceType()
  {
    return sequenceTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSequenceType_Type()
  {
    return (EReference)sequenceTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSequenceType_Nullable()
  {
    return (EAttribute)sequenceTypeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCallable()
  {
    return callableEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCallable_Target()
  {
    return (EReference)callableEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConstructor()
  {
    return constructorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConstructor_Arguments()
  {
    return (EReference)constructorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getConstructor_Name()
  {
    return (EAttribute)constructorEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNamedConstructor()
  {
    return namedConstructorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCallback()
  {
    return callbackEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCallback_FunctionOnly()
  {
    return (EAttribute)callbackEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCallback_PropertyOnly()
  {
    return (EAttribute)callbackEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNoInterfaceObject()
  {
    return noInterfaceObjectEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPrototypeRoot()
  {
    return prototypeRootEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPutForwards()
  {
    return putForwardsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPutForwards_Target()
  {
    return (EReference)putForwardsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTreatNullAs()
  {
    return treatNullAsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTreatUndefinedAs()
  {
    return treatUndefinedAsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTreatUndefinedAs_AsEmptyString()
  {
    return (EAttribute)treatUndefinedAsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTreatUndefinedAs_AsNull()
  {
    return (EAttribute)treatUndefinedAsEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAllowAny()
  {
    return allowAnyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getReplaceable()
  {
    return replaceableEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSupplemental()
  {
    return supplementalEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getReplaceableNamedProperties()
  {
    return replaceableNamedPropertiesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAbstractDefinitions()
  {
    return abstractDefinitionsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDefinitions()
  {
    return definitionsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getImplementStatement()
  {
    return implementStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getImplementStatement_Source()
  {
    return (EReference)implementStatementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getImplementStatement_Target()
  {
    return (EReference)implementStatementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getModule()
  {
    return moduleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModule_ExtendedAttributes()
  {
    return (EReference)moduleEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getModule_Name()
  {
    return (EAttribute)moduleEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModule_Definitions()
  {
    return (EReference)moduleEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getModuleExtendedAttribute()
  {
    return moduleExtendedAttributeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPrefix()
  {
    return prefixEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPrefix_Value()
  {
    return (EAttribute)prefixEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNamespaceObject()
  {
    return namespaceObjectEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInterface()
  {
    return interfaceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInterface_ExtendedAttributes()
  {
    return (EReference)interfaceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInterface_ExtendedAttribute()
  {
    return (EReference)interfaceEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInterface_Name()
  {
    return (EAttribute)interfaceEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInterface_SuperType()
  {
    return (EReference)interfaceEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInterface_Members()
  {
    return (EReference)interfaceEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInterfaceExtendedAttribute()
  {
    return interfaceExtendedAttributeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInterfaceMember()
  {
    return interfaceMemberEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInterfaceFeature()
  {
    return interfaceFeatureEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInterfaceFeature_Stringifier()
  {
    return (EAttribute)interfaceFeatureEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInterfaceFeature_Name()
  {
    return (EAttribute)interfaceFeatureEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOperation()
  {
    return operationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOperation_ExtendedAttributes()
  {
    return (EReference)operationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOperation_Omittable()
  {
    return (EAttribute)operationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOperation_Specials()
  {
    return (EReference)operationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOperation_Return()
  {
    return (EReference)operationEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOperation_Arguments()
  {
    return (EReference)operationEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOperation_Raises()
  {
    return (EReference)operationEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOperationExtendedAttribute()
  {
    return operationExtendedAttributeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOperationSpecial()
  {
    return operationSpecialEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAttribute()
  {
    return attributeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAttribute_ExtendedAttributes()
  {
    return (EReference)attributeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAttribute_Type()
  {
    return (EReference)attributeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAttribute_GetRaises()
  {
    return (EReference)attributeEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAttribute_SetRaises()
  {
    return (EReference)attributeEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAttributeExtendedAttribute()
  {
    return attributeExtendedAttributeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getException()
  {
    return exceptionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getException_ExtendedAttributes()
  {
    return (EReference)exceptionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getException_Name()
  {
    return (EAttribute)exceptionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getException_Members()
  {
    return (EReference)exceptionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExceptionMember()
  {
    return exceptionMemberEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExceptionMember_Type()
  {
    return (EReference)exceptionMemberEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExceptionField()
  {
    return exceptionFieldEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getExceptionField_Name()
  {
    return (EAttribute)exceptionFieldEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExceptionExtendedAttribute()
  {
    return exceptionExtendedAttributeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getArgument()
  {
    return argumentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getArgument_ExtendedAttributes()
  {
    return (EReference)argumentEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getArgument_In()
  {
    return (EAttribute)argumentEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getArgument_Optional()
  {
    return (EAttribute)argumentEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getArgument_Type()
  {
    return (EReference)argumentEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getArgument_Ellipsis()
  {
    return (EAttribute)argumentEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getArgument_Name()
  {
    return (EAttribute)argumentEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getArgumentExtendedAttribute()
  {
    return argumentExtendedAttributeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConst()
  {
    return constEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getConst_Name()
  {
    return (EAttribute)constEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConst_Expr()
  {
    return (EReference)constEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConstExpr()
  {
    return constExprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOperationSpecialGetter()
  {
    return operationSpecialGetterEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOperationSpecialSetter()
  {
    return operationSpecialSetterEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOperationSpecialCreator()
  {
    return operationSpecialCreatorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOperationSpecialDeleter()
  {
    return operationSpecialDeleterEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOperationSpecialCaller()
  {
    return operationSpecialCallerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WebIDLFactory getWebIDLFactory()
  {
    return (WebIDLFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    idlDefinitionsEClass = createEClass(IDL_DEFINITIONS);
    createEReference(idlDefinitionsEClass, IDL_DEFINITIONS__IMPORTS);
    createEReference(idlDefinitionsEClass, IDL_DEFINITIONS__DEFINITIONS);

    importEClass = createEClass(IMPORT);
    createEAttribute(importEClass, IMPORT__IMPORT_URI);

    typeDefEClass = createEClass(TYPE_DEF);
    createEReference(typeDefEClass, TYPE_DEF__TYPE);
    createEAttribute(typeDefEClass, TYPE_DEF__NAME);

    typeRefEClass = createEClass(TYPE_REF);
    createEAttribute(typeRefEClass, TYPE_REF__IS_ARRAY);

    userTypeRefEClass = createEClass(USER_TYPE_REF);
    createEReference(userTypeRefEClass, USER_TYPE_REF__TYPE);

    typesEClass = createEClass(TYPES);

    primitiveTypeRefEClass = createEClass(PRIMITIVE_TYPE_REF);
    createEAttribute(primitiveTypeRefEClass, PRIMITIVE_TYPE_REF__UNSIGNED);
    createEAttribute(primitiveTypeRefEClass, PRIMITIVE_TYPE_REF__NAME);
    createEAttribute(primitiveTypeRefEClass, PRIMITIVE_TYPE_REF__NULLABLE);

    sequenceTypeEClass = createEClass(SEQUENCE_TYPE);
    createEReference(sequenceTypeEClass, SEQUENCE_TYPE__TYPE);
    createEAttribute(sequenceTypeEClass, SEQUENCE_TYPE__NULLABLE);

    callableEClass = createEClass(CALLABLE);
    createEReference(callableEClass, CALLABLE__TARGET);

    constructorEClass = createEClass(CONSTRUCTOR);
    createEReference(constructorEClass, CONSTRUCTOR__ARGUMENTS);
    createEAttribute(constructorEClass, CONSTRUCTOR__NAME);

    namedConstructorEClass = createEClass(NAMED_CONSTRUCTOR);

    callbackEClass = createEClass(CALLBACK);
    createEAttribute(callbackEClass, CALLBACK__FUNCTION_ONLY);
    createEAttribute(callbackEClass, CALLBACK__PROPERTY_ONLY);

    noInterfaceObjectEClass = createEClass(NO_INTERFACE_OBJECT);

    prototypeRootEClass = createEClass(PROTOTYPE_ROOT);

    putForwardsEClass = createEClass(PUT_FORWARDS);
    createEReference(putForwardsEClass, PUT_FORWARDS__TARGET);

    treatNullAsEClass = createEClass(TREAT_NULL_AS);

    treatUndefinedAsEClass = createEClass(TREAT_UNDEFINED_AS);
    createEAttribute(treatUndefinedAsEClass, TREAT_UNDEFINED_AS__AS_EMPTY_STRING);
    createEAttribute(treatUndefinedAsEClass, TREAT_UNDEFINED_AS__AS_NULL);

    allowAnyEClass = createEClass(ALLOW_ANY);

    replaceableEClass = createEClass(REPLACEABLE);

    supplementalEClass = createEClass(SUPPLEMENTAL);

    replaceableNamedPropertiesEClass = createEClass(REPLACEABLE_NAMED_PROPERTIES);

    abstractDefinitionsEClass = createEClass(ABSTRACT_DEFINITIONS);

    definitionsEClass = createEClass(DEFINITIONS);

    implementStatementEClass = createEClass(IMPLEMENT_STATEMENT);
    createEReference(implementStatementEClass, IMPLEMENT_STATEMENT__SOURCE);
    createEReference(implementStatementEClass, IMPLEMENT_STATEMENT__TARGET);

    moduleEClass = createEClass(MODULE);
    createEReference(moduleEClass, MODULE__EXTENDED_ATTRIBUTES);
    createEAttribute(moduleEClass, MODULE__NAME);
    createEReference(moduleEClass, MODULE__DEFINITIONS);

    moduleExtendedAttributeEClass = createEClass(MODULE_EXTENDED_ATTRIBUTE);

    prefixEClass = createEClass(PREFIX);
    createEAttribute(prefixEClass, PREFIX__VALUE);

    namespaceObjectEClass = createEClass(NAMESPACE_OBJECT);

    interfaceEClass = createEClass(INTERFACE);
    createEReference(interfaceEClass, INTERFACE__EXTENDED_ATTRIBUTES);
    createEReference(interfaceEClass, INTERFACE__EXTENDED_ATTRIBUTE);
    createEAttribute(interfaceEClass, INTERFACE__NAME);
    createEReference(interfaceEClass, INTERFACE__SUPER_TYPE);
    createEReference(interfaceEClass, INTERFACE__MEMBERS);

    interfaceExtendedAttributeEClass = createEClass(INTERFACE_EXTENDED_ATTRIBUTE);

    interfaceMemberEClass = createEClass(INTERFACE_MEMBER);

    interfaceFeatureEClass = createEClass(INTERFACE_FEATURE);
    createEAttribute(interfaceFeatureEClass, INTERFACE_FEATURE__STRINGIFIER);
    createEAttribute(interfaceFeatureEClass, INTERFACE_FEATURE__NAME);

    operationEClass = createEClass(OPERATION);
    createEReference(operationEClass, OPERATION__EXTENDED_ATTRIBUTES);
    createEAttribute(operationEClass, OPERATION__OMITTABLE);
    createEReference(operationEClass, OPERATION__SPECIALS);
    createEReference(operationEClass, OPERATION__RETURN);
    createEReference(operationEClass, OPERATION__ARGUMENTS);
    createEReference(operationEClass, OPERATION__RAISES);

    operationExtendedAttributeEClass = createEClass(OPERATION_EXTENDED_ATTRIBUTE);

    operationSpecialEClass = createEClass(OPERATION_SPECIAL);

    attributeEClass = createEClass(ATTRIBUTE);
    createEReference(attributeEClass, ATTRIBUTE__EXTENDED_ATTRIBUTES);
    createEReference(attributeEClass, ATTRIBUTE__TYPE);
    createEReference(attributeEClass, ATTRIBUTE__GET_RAISES);
    createEReference(attributeEClass, ATTRIBUTE__SET_RAISES);

    attributeExtendedAttributeEClass = createEClass(ATTRIBUTE_EXTENDED_ATTRIBUTE);

    exceptionEClass = createEClass(EXCEPTION);
    createEReference(exceptionEClass, EXCEPTION__EXTENDED_ATTRIBUTES);
    createEAttribute(exceptionEClass, EXCEPTION__NAME);
    createEReference(exceptionEClass, EXCEPTION__MEMBERS);

    exceptionMemberEClass = createEClass(EXCEPTION_MEMBER);
    createEReference(exceptionMemberEClass, EXCEPTION_MEMBER__TYPE);

    exceptionFieldEClass = createEClass(EXCEPTION_FIELD);
    createEAttribute(exceptionFieldEClass, EXCEPTION_FIELD__NAME);

    exceptionExtendedAttributeEClass = createEClass(EXCEPTION_EXTENDED_ATTRIBUTE);

    argumentEClass = createEClass(ARGUMENT);
    createEReference(argumentEClass, ARGUMENT__EXTENDED_ATTRIBUTES);
    createEAttribute(argumentEClass, ARGUMENT__IN);
    createEAttribute(argumentEClass, ARGUMENT__OPTIONAL);
    createEReference(argumentEClass, ARGUMENT__TYPE);
    createEAttribute(argumentEClass, ARGUMENT__ELLIPSIS);
    createEAttribute(argumentEClass, ARGUMENT__NAME);

    argumentExtendedAttributeEClass = createEClass(ARGUMENT_EXTENDED_ATTRIBUTE);

    constEClass = createEClass(CONST);
    createEAttribute(constEClass, CONST__NAME);
    createEReference(constEClass, CONST__EXPR);

    constExprEClass = createEClass(CONST_EXPR);

    operationSpecialGetterEClass = createEClass(OPERATION_SPECIAL_GETTER);

    operationSpecialSetterEClass = createEClass(OPERATION_SPECIAL_SETTER);

    operationSpecialCreatorEClass = createEClass(OPERATION_SPECIAL_CREATOR);

    operationSpecialDeleterEClass = createEClass(OPERATION_SPECIAL_DELETER);

    operationSpecialCallerEClass = createEClass(OPERATION_SPECIAL_CALLER);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    typeDefEClass.getESuperTypes().add(this.getTypes());
    typeDefEClass.getESuperTypes().add(this.getDefinitions());
    userTypeRefEClass.getESuperTypes().add(this.getTypeRef());
    primitiveTypeRefEClass.getESuperTypes().add(this.getTypeRef());
    sequenceTypeEClass.getESuperTypes().add(this.getTypeRef());
    constructorEClass.getESuperTypes().add(this.getNamedConstructor());
    constructorEClass.getESuperTypes().add(this.getInterfaceExtendedAttribute());
    namedConstructorEClass.getESuperTypes().add(this.getInterfaceExtendedAttribute());
    callbackEClass.getESuperTypes().add(this.getInterfaceExtendedAttribute());
    noInterfaceObjectEClass.getESuperTypes().add(this.getInterfaceExtendedAttribute());
    noInterfaceObjectEClass.getESuperTypes().add(this.getExceptionExtendedAttribute());
    prototypeRootEClass.getESuperTypes().add(this.getInterfaceExtendedAttribute());
    putForwardsEClass.getESuperTypes().add(this.getAttributeExtendedAttribute());
    treatNullAsEClass.getESuperTypes().add(this.getOperationExtendedAttribute());
    treatNullAsEClass.getESuperTypes().add(this.getAttributeExtendedAttribute());
    treatNullAsEClass.getESuperTypes().add(this.getArgumentExtendedAttribute());
    treatUndefinedAsEClass.getESuperTypes().add(this.getOperationExtendedAttribute());
    treatUndefinedAsEClass.getESuperTypes().add(this.getAttributeExtendedAttribute());
    treatUndefinedAsEClass.getESuperTypes().add(this.getArgumentExtendedAttribute());
    allowAnyEClass.getESuperTypes().add(this.getArgumentExtendedAttribute());
    replaceableEClass.getESuperTypes().add(this.getAttributeExtendedAttribute());
    supplementalEClass.getESuperTypes().add(this.getInterfaceExtendedAttribute());
    replaceableNamedPropertiesEClass.getESuperTypes().add(this.getInterfaceExtendedAttribute());
    definitionsEClass.getESuperTypes().add(this.getAbstractDefinitions());
    implementStatementEClass.getESuperTypes().add(this.getDefinitions());
    moduleEClass.getESuperTypes().add(this.getAbstractDefinitions());
    prefixEClass.getESuperTypes().add(this.getModuleExtendedAttribute());
    namespaceObjectEClass.getESuperTypes().add(this.getModuleExtendedAttribute());
    interfaceEClass.getESuperTypes().add(this.getTypes());
    interfaceEClass.getESuperTypes().add(this.getDefinitions());
    interfaceFeatureEClass.getESuperTypes().add(this.getTypes());
    interfaceFeatureEClass.getESuperTypes().add(this.getInterfaceMember());
    operationEClass.getESuperTypes().add(this.getInterfaceFeature());
    attributeEClass.getESuperTypes().add(this.getInterfaceFeature());
    exceptionEClass.getESuperTypes().add(this.getDefinitions());
    exceptionFieldEClass.getESuperTypes().add(this.getExceptionMember());
    constEClass.getESuperTypes().add(this.getInterfaceMember());
    constEClass.getESuperTypes().add(this.getExceptionMember());
    operationSpecialGetterEClass.getESuperTypes().add(this.getOperationSpecial());
    operationSpecialSetterEClass.getESuperTypes().add(this.getOperationSpecial());
    operationSpecialCreatorEClass.getESuperTypes().add(this.getOperationSpecial());
    operationSpecialDeleterEClass.getESuperTypes().add(this.getOperationSpecial());
    operationSpecialCallerEClass.getESuperTypes().add(this.getOperationSpecial());

    // Initialize classes and features; add operations and parameters
    initEClass(idlDefinitionsEClass, IDLDefinitions.class, "IDLDefinitions", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getIDLDefinitions_Imports(), this.getImport(), null, "imports", null, 0, -1, IDLDefinitions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getIDLDefinitions_Definitions(), this.getAbstractDefinitions(), null, "definitions", null, 0, -1, IDLDefinitions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(importEClass, Import.class, "Import", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getImport_ImportURI(), ecorePackage.getEString(), "importURI", null, 0, 1, Import.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(typeDefEClass, TypeDef.class, "TypeDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTypeDef_Type(), this.getTypeRef(), null, "type", null, 0, 1, TypeDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTypeDef_Name(), ecorePackage.getEString(), "name", null, 0, 1, TypeDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(typeRefEClass, TypeRef.class, "TypeRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTypeRef_IsArray(), ecorePackage.getEBoolean(), "isArray", null, 0, 1, TypeRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(userTypeRefEClass, UserTypeRef.class, "UserTypeRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getUserTypeRef_Type(), this.getTypes(), null, "type", null, 0, 1, UserTypeRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(typesEClass, Types.class, "Types", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(primitiveTypeRefEClass, PrimitiveTypeRef.class, "PrimitiveTypeRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPrimitiveTypeRef_Unsigned(), ecorePackage.getEBoolean(), "unsigned", null, 0, 1, PrimitiveTypeRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPrimitiveTypeRef_Name(), ecorePackage.getEString(), "name", null, 0, 1, PrimitiveTypeRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPrimitiveTypeRef_Nullable(), ecorePackage.getEBoolean(), "nullable", null, 0, 1, PrimitiveTypeRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(sequenceTypeEClass, SequenceType.class, "SequenceType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSequenceType_Type(), this.getTypeRef(), null, "type", null, 0, 1, SequenceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSequenceType_Nullable(), ecorePackage.getEBoolean(), "nullable", null, 0, 1, SequenceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(callableEClass, Callable.class, "Callable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCallable_Target(), this.getOperation(), null, "target", null, 0, 1, Callable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(constructorEClass, Constructor.class, "Constructor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getConstructor_Arguments(), this.getArgument(), null, "arguments", null, 0, -1, Constructor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getConstructor_Name(), ecorePackage.getEString(), "name", null, 0, 1, Constructor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(namedConstructorEClass, NamedConstructor.class, "NamedConstructor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(callbackEClass, Callback.class, "Callback", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCallback_FunctionOnly(), ecorePackage.getEBoolean(), "functionOnly", null, 0, 1, Callback.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCallback_PropertyOnly(), ecorePackage.getEBoolean(), "propertyOnly", null, 0, 1, Callback.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(noInterfaceObjectEClass, NoInterfaceObject.class, "NoInterfaceObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(prototypeRootEClass, PrototypeRoot.class, "PrototypeRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(putForwardsEClass, PutForwards.class, "PutForwards", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPutForwards_Target(), this.getAttribute(), null, "target", null, 0, 1, PutForwards.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(treatNullAsEClass, TreatNullAs.class, "TreatNullAs", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(treatUndefinedAsEClass, TreatUndefinedAs.class, "TreatUndefinedAs", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTreatUndefinedAs_AsEmptyString(), ecorePackage.getEBoolean(), "asEmptyString", null, 0, 1, TreatUndefinedAs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTreatUndefinedAs_AsNull(), ecorePackage.getEBoolean(), "asNull", null, 0, 1, TreatUndefinedAs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(allowAnyEClass, AllowAny.class, "AllowAny", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(replaceableEClass, Replaceable.class, "Replaceable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(supplementalEClass, Supplemental.class, "Supplemental", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(replaceableNamedPropertiesEClass, ReplaceableNamedProperties.class, "ReplaceableNamedProperties", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(abstractDefinitionsEClass, AbstractDefinitions.class, "AbstractDefinitions", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(definitionsEClass, Definitions.class, "Definitions", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(implementStatementEClass, ImplementStatement.class, "ImplementStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getImplementStatement_Source(), this.getInterface(), null, "source", null, 0, 1, ImplementStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getImplementStatement_Target(), this.getInterface(), null, "target", null, 0, 1, ImplementStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(moduleEClass, Module.class, "Module", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getModule_ExtendedAttributes(), this.getModuleExtendedAttribute(), null, "extendedAttributes", null, 0, -1, Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getModule_Name(), ecorePackage.getEString(), "name", null, 0, 1, Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModule_Definitions(), this.getAbstractDefinitions(), null, "definitions", null, 0, -1, Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(moduleExtendedAttributeEClass, ModuleExtendedAttribute.class, "ModuleExtendedAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(prefixEClass, Prefix.class, "Prefix", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPrefix_Value(), ecorePackage.getEString(), "value", null, 0, -1, Prefix.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(namespaceObjectEClass, NamespaceObject.class, "NamespaceObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(interfaceEClass, Interface.class, "Interface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getInterface_ExtendedAttributes(), this.getInterfaceExtendedAttribute(), null, "extendedAttributes", null, 0, -1, Interface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInterface_ExtendedAttribute(), this.getInterfaceExtendedAttribute(), null, "extendedAttribute", null, 0, -1, Interface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getInterface_Name(), ecorePackage.getEString(), "name", null, 0, 1, Interface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInterface_SuperType(), this.getInterface(), null, "superType", null, 0, -1, Interface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInterface_Members(), this.getInterfaceMember(), null, "members", null, 0, -1, Interface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    addEOperation(interfaceEClass, this.getOperation(), "getOperations", 0, -1, IS_UNIQUE, IS_ORDERED);

    addEOperation(interfaceEClass, this.getAttribute(), "getAttributes", 0, -1, IS_UNIQUE, IS_ORDERED);

    initEClass(interfaceExtendedAttributeEClass, InterfaceExtendedAttribute.class, "InterfaceExtendedAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(interfaceMemberEClass, InterfaceMember.class, "InterfaceMember", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(interfaceFeatureEClass, InterfaceFeature.class, "InterfaceFeature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getInterfaceFeature_Stringifier(), ecorePackage.getEBoolean(), "stringifier", null, 0, 1, InterfaceFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getInterfaceFeature_Name(), ecorePackage.getEString(), "name", null, 0, 1, InterfaceFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(operationEClass, Operation.class, "Operation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getOperation_ExtendedAttributes(), this.getOperationExtendedAttribute(), null, "extendedAttributes", null, 0, -1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getOperation_Omittable(), ecorePackage.getEBoolean(), "omittable", null, 0, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOperation_Specials(), this.getOperationSpecial(), null, "specials", null, 0, -1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOperation_Return(), this.getTypeRef(), null, "return", null, 0, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOperation_Arguments(), this.getArgument(), null, "arguments", null, 0, -1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOperation_Raises(), this.getException(), null, "raises", null, 0, -1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(operationExtendedAttributeEClass, OperationExtendedAttribute.class, "OperationExtendedAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(operationSpecialEClass, OperationSpecial.class, "OperationSpecial", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(attributeEClass, Attribute.class, "Attribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAttribute_ExtendedAttributes(), this.getAttributeExtendedAttribute(), null, "extendedAttributes", null, 0, -1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAttribute_Type(), this.getTypeRef(), null, "type", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAttribute_GetRaises(), this.getException(), null, "getRaises", null, 0, -1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAttribute_SetRaises(), this.getException(), null, "setRaises", null, 0, -1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(attributeExtendedAttributeEClass, AttributeExtendedAttribute.class, "AttributeExtendedAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(exceptionEClass, org.waml.w3c.webidl.webIDL.Exception.class, "Exception", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getException_ExtendedAttributes(), this.getExceptionExtendedAttribute(), null, "extendedAttributes", null, 0, -1, org.waml.w3c.webidl.webIDL.Exception.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getException_Name(), ecorePackage.getEString(), "name", null, 0, 1, org.waml.w3c.webidl.webIDL.Exception.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getException_Members(), this.getExceptionMember(), null, "members", null, 0, -1, org.waml.w3c.webidl.webIDL.Exception.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(exceptionMemberEClass, ExceptionMember.class, "ExceptionMember", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getExceptionMember_Type(), this.getTypeRef(), null, "type", null, 0, 1, ExceptionMember.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(exceptionFieldEClass, ExceptionField.class, "ExceptionField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getExceptionField_Name(), ecorePackage.getEString(), "name", null, 0, 1, ExceptionField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(exceptionExtendedAttributeEClass, ExceptionExtendedAttribute.class, "ExceptionExtendedAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(argumentEClass, Argument.class, "Argument", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getArgument_ExtendedAttributes(), this.getArgumentExtendedAttribute(), null, "extendedAttributes", null, 0, -1, Argument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getArgument_In(), ecorePackage.getEBoolean(), "in", null, 0, 1, Argument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getArgument_Optional(), ecorePackage.getEBoolean(), "optional", null, 0, 1, Argument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getArgument_Type(), this.getTypeRef(), null, "type", null, 0, 1, Argument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getArgument_Ellipsis(), ecorePackage.getEBoolean(), "ellipsis", null, 0, 1, Argument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getArgument_Name(), ecorePackage.getEString(), "name", null, 0, 1, Argument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(argumentExtendedAttributeEClass, ArgumentExtendedAttribute.class, "ArgumentExtendedAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(constEClass, Const.class, "Const", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getConst_Name(), ecorePackage.getEString(), "name", null, 0, -1, Const.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getConst_Expr(), this.getConstExpr(), null, "expr", null, 0, 1, Const.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(constExprEClass, ConstExpr.class, "ConstExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(operationSpecialGetterEClass, OperationSpecialGetter.class, "OperationSpecialGetter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(operationSpecialSetterEClass, OperationSpecialSetter.class, "OperationSpecialSetter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(operationSpecialCreatorEClass, OperationSpecialCreator.class, "OperationSpecialCreator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(operationSpecialDeleterEClass, OperationSpecialDeleter.class, "OperationSpecialDeleter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(operationSpecialCallerEClass, OperationSpecialCaller.class, "OperationSpecialCaller", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    // Create resource
    createResource(eNS_URI);
  }

} //WebIDLPackageImpl
