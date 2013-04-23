package org.waml.w3c.webidl.validation;

import java.util.Iterator;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.validation.Check;
import org.waml.w3c.webidl.webIDL.Argument;
import org.waml.w3c.webidl.webIDL.Attribute;
import org.waml.w3c.webidl.webIDL.Interface;
import org.waml.w3c.webidl.webIDL.InterfaceMember;
import org.waml.w3c.webidl.webIDL.Operation;
import org.waml.w3c.webidl.webIDL.OperationExtendedAttribute;
import org.waml.w3c.webidl.webIDL.OperationSpecial;
import org.waml.w3c.webidl.webIDL.OperationSpecialCreator;
import org.waml.w3c.webidl.webIDL.OperationSpecialDeleter;
import org.waml.w3c.webidl.webIDL.OperationSpecialGetter;
import org.waml.w3c.webidl.webIDL.OperationSpecialSetter;
import org.waml.w3c.webidl.webIDL.PrimitiveTypeRef;
import org.waml.w3c.webidl.webIDL.WebIDLPackage;
 

public class WebIDLJavaValidator extends AbstractWebIDLJavaValidator {


	protected void error(String string, EObject source, EStructuralFeature feature, Integer code, String... issueData)
	{
		error(string,source,feature,Integer.toString(code),issueData);
	}
	
	//TODO : better implementation of function overloading plus comment and error code creation 
	@Check
	public void checkAttributeNameIsUnique(Attribute aAttribute){
		final String lName = aAttribute.getName();
		for (InterfaceMember sibling:((Interface)aAttribute.eContainer()).getMembers())
		{
			if (sibling instanceof Attribute)
			{
				if (((Attribute) sibling).getName().equals(lName)  &&  sibling != aAttribute)
				{
					error(" Duplicate name '" + lName +"'", WebIDLPackage.Literals.INTERFACE_FEATURE__NAME);
				}
			}
		}
	}
	
	/**
	 * Check properties of function with no identifier
	 * Check that : 
	 * 	<ul>
	 * 		<li>an operation with no identifier is a special operation.
	 * 		<li>an omittable keyword is not specified on a function with no identifier 
	 *  </ul>
	 * 
	 * 
	 * @spec REQ_CORE_19 If an operation has no identifier, then it MUST be declared to be a special operation using one of the special keywords
	 * @spec REQ_CORE_24 The “omittable” keyword MUST NOT appear on an operation that has no identifier.
	 * @param aOperation 
	 * @errorcode OPERATION_MUST_BE_SPECIAL
	 * @errorcode OPERATION_OMITTABLE
	 * @author pbourdil
	 *
	 */
	@Check
	public void checkOperationWithNoIdentifier(Operation aOperation)
	{
 		if ( aOperation.getName() == null || aOperation.getName() == "" )
		{
			EList<OperationSpecial> lSpecs = aOperation.getSpecials();
			if ( lSpecs == null || lSpecs.size() == 0 )
			{
				error(" Operation has no identier but is not a special operation (getter,setter,...) ", 
						aOperation,
						WebIDLPackage.Literals.OPERATION__SPECIALS,
						ValidationErrorCode.OPERATION_MUST_BE_SPECIAL);
			}
			if (aOperation.isOmittable())
			{
				error(" Operation has no identifier but is declared as omittable ", 
						aOperation,
						WebIDLPackage.Literals.OPERATION__SPECIALS,
						ValidationErrorCode.OPERATION_OMITTABLE);
			}
		}
	}
	
	/**
	 * Check that :
	 * <ul>
	 * 		<li> an operation special is unique for a given operation
 	 *  	<li> Special operation declared using operation must not be variadic nor have any optional arguments
	 * 		<li> Index getter and setter take a single unsigned long argument, the first argument of an index creator or setter is an unsigned long, whatever the second. 
	 *      <li> Name getter and setter take a single DOMString argument, the first argument of a name creator or setter is a DOMString, whatever the second. 

	 * </ul>
	 * 
	 * @param aOperation
	 * @errorcode SPECIAL_KEYWORD_NOT_UNIQUE
	 * @errorcode SPECIAL_OPERATION_VARIADIC_OR_WITH_OPTIONAL_ARGS
	 * @errorcode INVALID_GETTER_DELETER_CREATOR_SETTER_OPERATION
	 * @spec REQ_CORE_25 A given special keyword MUST NOT appear twice on a operation.
	 * @spec REQ_CORE_27 Special operation declared using operation must not be variadic nor have any optional arguments
	 * @spec REQ_CORE_31 Index getter and deleter MUST be declared to take a single unsigned long argument.  Index creator and setter MUST be declared to take two argument, the first one is an unsigned long
	 * @spec REQ_CORE_32 Name getter and deleter MUST be declared to take a single DOMString argument.  Name creator and setter MUST be declared to take two argument, the first one is a DOMString
	 */
	@Check
	public void checkOperation(Operation aOperation)
	{
		int nbGetter = 0,nbDeleter =0 , nbCreator = 0 , nbSetter = 0;
		
		//getter, setter, caller, deleter  creator
		EList<OperationSpecial> lOps = aOperation.getSpecials();
		
		// Operation is special, check it is not variadic nor has optional arguments  
		if (lOps.size() > 0)
		{
			for(Argument lArgs:aOperation.getArguments())
			{
				if (lArgs.isEllipsis() || lArgs.isOptional())
				{
					error(" Operation "+aOperation.getName()+" is special but is variadic or with optional argument. ",
							aOperation,
							WebIDLPackage.Literals.OPERATION__SPECIALS,
							ValidationErrorCode.SPECIAL_OPERATION_VARIADIC_OR_WITH_OPTIONAL_ARGS);
				}
			}
			
			// check the unicity of special keywords
			if (lOps.size() > 1 )
			{
				OperationSpecial lSpec = lOps.get(0);
				error(" Special keyword "+lSpec.toString()+" is  declared twice on operation "+aOperation.getName(),
						aOperation,
						WebIDLPackage.Literals.OPERATION__SPECIALS,
						ValidationErrorCode.SPECIAL_KEYWORD_NOT_UNIQUE);
			}
			else
			{
				OperationSpecial lSpec = lOps.get(0);
				if (lSpec instanceof OperationSpecialGetter || lSpec instanceof OperationSpecialDeleter)
				{
					
					if (aOperation.getArguments().size() != 1)
					{
						error(" The operation "+aOperation.getName()+" is a getter or a deleter and has zero or more than one paramter",
								aOperation,
								WebIDLPackage.Literals.OPERATION__SPECIALS,
								ValidationErrorCode.INVALID_GETTER_DELETER_CREATOR_SETTER_OPERATION);
					}
					else
					{
						Argument lArg = aOperation.getArguments().get(0);
						if ( ! isArgumentTypeUnsignedLong(lArg) && ! isArgumentTypeDOMString(lArg))
						{
							error(" The operation "+aOperation.getName()+" is a getter and has an argument which is not an unsigned long nor a DOMString ",
									aOperation,
									WebIDLPackage.Literals.OPERATION__SPECIALS,
									ValidationErrorCode.INVALID_GETTER_DELETER_CREATOR_SETTER_OPERATION);
						}
						
					}
				}
				if (lSpec instanceof OperationSpecialCreator || lSpec instanceof OperationSpecialSetter)
				{
					if (aOperation.getArguments().size() != 2)
					{
						error(" The operation "+aOperation.getName()+" is a creator or a setter and has more than one paramter",
								aOperation,
								WebIDLPackage.Literals.OPERATION__SPECIALS,
								ValidationErrorCode.INVALID_GETTER_DELETER_CREATOR_SETTER_OPERATION);
					}
					else
					{
						Argument lArg = aOperation.getArguments().get(0);
						if ( ! isArgumentTypeUnsignedLong(lArg) && ! isArgumentTypeDOMString(lArg) )
						{
							error(" The operation "+aOperation.getName()+" is a creator or a setter and has an argument which is not an unsigned long nor a DOMString ",
									aOperation,
									WebIDLPackage.Literals.OPERATION__SPECIALS,
									ValidationErrorCode.INVALID_GETTER_DELETER_CREATOR_SETTER_OPERATION);
						}
					}
				}
			}
			
			//check the arguments : 
		
		}
	}
	
	
	/**
	 * Check that :
	 * <ul>
	 *  	<li> Stringifier declared with operation MUST de declared to take zero argument and return a DOMString.
	 * </ul>
	 * @errorcode STRINGIFIER_OPERATION_HAS_ARGS_OR_NOT_RETURNS_DOMSTRING
	 * @spec REQ_CORE_28 Stringifier declared with operation MUST be declared to take zero argument and return a DOMString.
	 */
	@Check
	public void checkStringifier(Operation aOperation)
	{
		if (aOperation.isStringifier())
		{
			// Operation is a stringifier, check it has zero arguments and returns a DOMString
			if (aOperation.getArguments().size() > 0 ||
					!isOperationTypeDOMString(aOperation)) 
			{
				error(" Stringifier operation "+ aOperation.getName()+" has more than zero argument or is not DOMString type",
						aOperation,
						WebIDLPackage.Literals.OPERATION__EXTENDED_ATTRIBUTES,
						ValidationErrorCode.STRINGIFIER_OPERATION_HAS_ARGS_OR_NOT_RETURNS_DOMSTRING);
			}
					
		}
		else
		{
			//TODO : make the difference between no argument list and empty argument lists 
		}
	}
	
	/**
	 * Check that :
	 *  <ul>
	 * 	    <li> the variadic operator is declared with the final argument 	
	 *      <li> after an optional argument, all the argument in the argument list are optional.
	 *  </ul>
	 * 
	 * @spec REQ_CORE_21 An argument MUST NOT be declared with the "..." terminal unless it is the final argument in the operation’s argument list.
	 * @spec REQ_CORE_23 An argument MUST NOT be declared to be optional unless any subsequent arguments to the operation are also optional
	 * @param aOperation
	 * @errorcode LAST_OPTIONAL_ARG
	 * @errorcode VARIADIC_OPERATOR_NOT_FINAL_ARG
	 * @author pbourdil
	 * 
	 */
	@Check
	public void checkArguments(Operation aOperation)
	{
		EList<Argument> lArgs = aOperation.getArguments();
		Argument lArg,lArgPre;
		
		for(int i=lArgs.size()-1;i>0;i--)
		{
			lArg = lArgs.get(i);
			lArgPre = lArgs.get(i-1);
			// if an optional argument is followed by a non optional argument, store an error.
			if (lArgPre.isOptional() && !lArg.isOptional())
			{
				error(" The argument "+lArgPre.getName()+" that is not optionnal follow the argument "+lArg.getName()+" that is optionnal",
						lArgPre,
						WebIDLPackage.Literals.ARGUMENT__OPTIONAL,
						ValidationErrorCode.LAST_OPTIONAL_ARG);
				break;
			}
			// the argument is a sporadic one, it must be the last argument
			if (lArgPre.isEllipsis())
			{
				error(" An argument that is not the last argument of the operation "+aOperation.getName()+ 
					" argument list is a variadic argument (\"...\",",
					aOperation,
					WebIDLPackage.Literals.OPERATION__ARGUMENTS,
					ValidationErrorCode.VARIADIC_OPERATOR_NOT_FINAL_ARG);
				break;
			}
		}
	}
	
	/**
	 * Check that 
	 * 
	 * <ul>
	 * 	<li> If an attribute is a Stringifier, then its type is DOMString
	 * </ul>
	 * 
	 * @errorcode STRINGIFIER_ATTRIBUTE_NOT_DOMSTRING
	 * @spec REQ_CORE_30 The “stringifier” keyword MUST NOT be placed on an  attribute unless it is declared to be of type DOMString.
	 * @param aAttribute
	 */
	@Check
	public void checkAttributeSpecials(Attribute aAttribute)
	{
		if (aAttribute.isStringifier())
		{
			if ( ! isAttributeTypeDOMString(aAttribute))
			{
				error("The attribute "+aAttribute.getName()+" is a stringifier but its type is not DOMString ",
						aAttribute,
						WebIDLPackage.Literals.ATTRIBUTE__TYPE,
						ValidationErrorCode.STRINGIFIER_ATTRIBUTE_NOT_DOMSTRING);
			}
		}
	}
	
	/**
	 * 
	 * Check that :
	 * 	<ul>
	 * 		<li> There's exists at most one stringifier and at most one of each variety of specials getter,setter,creator,deleter
	 *  </ul>
	 * 
	 * @spec REQ_CORE_26 - On a given interface there must exists AT MOST one stringifier and at most one of each variety of getter,setter,creator,deleter
	 * @errorcode TOO_MUCH_SPECIAL_INTERFACE_MEMBERS
	 * @param aInterface
	 * @author pbourdil
	 */
	@Check
	public void checkInterfaceSpecialsUnicity(Interface aInterface)
	{
		int lCountStringifier = 0 ;
		int lCountGetter = 0,lCountSetter = 0,lCountCreator = 0,lCountDeleter = 0; 
	
		// Iterate over operation, and collect stringifier plus specials
		Iterator<Operation> lIte = aInterface.getOperations().iterator();
		while ( lCountStringifier <= 1 && lCountCreator <= 1 && lCountSetter <= 1 && lCountGetter <= 1 && lCountDeleter <= 1
				&& lIte.hasNext())
		{
			Operation lCurrent = lIte.next();
			if (lCurrent.isStringifier())
			{
				lCountStringifier += 1;
			}
			for(OperationSpecial lSpecial:lCurrent.getSpecials())
			{
				if (lSpecial instanceof OperationSpecialGetter)
				{
					lCountGetter += 1;
				}
				else if (lSpecial instanceof OperationSpecialSetter)
				{
					lCountSetter += 1;
				}
				else if (lSpecial instanceof OperationSpecialDeleter)
				{
					lCountDeleter += 1; 
				}
				else if (lSpecial instanceof OperationSpecialCreator)
				{
					lCountCreator += 1;
				}
			}
		}
		// there's more than one stringifier or special getter, setter, deleter, creator 
		// let's create an error
		if (lCountStringifier > 1 || lCountCreator > 1 || lCountSetter > 1 || lCountGetter > 1 || lCountDeleter > 1)
		{
			error(" Interface "+aInterface.getName()+" has more than one stringifier or more than one of getter,setter,deleter,creator. ",
					aInterface,
					WebIDLPackage.Literals.INTERFACE__MEMBERS,
					ValidationErrorCode.TOO_MUCH_SPECIAL_INTERFACE_MEMBERS);
		}else
		{
			//check if a stringifier is defined on attribute, other specials can not be defined on attribute
			Iterator<Attribute> lIteAttr = aInterface.getAttributes().iterator();
			while ( lCountStringifier <= 1 && lIteAttr.hasNext())
			{
				Attribute lCurrent = lIteAttr.next();
				if (lCurrent.isStringifier())
				{
					lCountStringifier += 1;
				}
			}
			if (lCountStringifier > 1)
			{
				error(" Interface "+aInterface.getName()+" has more than one stringifier.",
						aInterface,
						WebIDLPackage.Literals.INTERFACE__MEMBERS,
						ValidationErrorCode.TOO_MUCH_SPECIAL_INTERFACE_MEMBERS);
			}
		}
	}
	
	/**
	 * 
	 * @param aOperation
	 * @return true if the operation type is DOMString
	 */
	private boolean isOperationTypeDOMString(Operation aOperation)
	{
		return (aOperation.getReturn() instanceof PrimitiveTypeRef 
				 && ((PrimitiveTypeRef)aOperation.getReturn()).getName().equals("DOMString"));
	}
	
	/**
	 * 
	 * @param aAttribute
	 * @return true if the attribute type is DOMString
	 */
	private boolean isAttributeTypeDOMString(Attribute aAttribute)
	{
		return isAttributeType(aAttribute,"DOMString");
	}
	
	/**
	 * 
	 * @param aAttribute
	 * @return true if the attribute type is a Unsigned Long
	 */
	private boolean isAttributeTypeUnsignedLong(Attribute aAttribute)
	{
		if (isAttributeType(aAttribute,"long"))
		{
			PrimitiveTypeRef lType = (PrimitiveTypeRef) aAttribute.getType();
			if ( lType.isUnsigned())
			{
				return true;
			}
		}
		return false;
	}
	
	/**
	 * 
	 * @param aArgument
	 * @return true if the argument type is a Unsigned Long
	 */
	private boolean isArgumentTypeUnsignedLong(Argument aArgument)
	{
		if (isArgumentType(aArgument,"long"))
		{
			PrimitiveTypeRef lType = (PrimitiveTypeRef) aArgument.getType();
			if ( lType.isUnsigned())
			{
				return true;
			}
		}
		return false;
	}
	
	/**
	 * 
	 * @param aArgument
	 * @return true if the argument type is a DOMString
	 */
	private boolean isArgumentTypeDOMString(Argument aArgument)
	{
		if (isArgumentType(aArgument,"DOMString"))
		{
			return true;
		}
		return false;
	}
	/**
	 * 
	 * @param aAttribute
	 * @param aTypeName
	 * @return true if the attribute type name is aTypeName
	 */
	private boolean isAttributeType(Attribute aAttribute,String aTypeName)
	{
		return ( aAttribute.getType() instanceof PrimitiveTypeRef 
				&& (((PrimitiveTypeRef)aAttribute.getType()).getName().equals(aTypeName)));
	}
	
	/**
	 * 
	 * @param aArgument
	 * @param aTypeName
	 * @return true if the argument type name is aTypeNale
	 */
	private boolean isArgumentType(Argument aArgument,String aTypeName)
	{
		return ( aArgument.getType() instanceof PrimitiveTypeRef 
				&& (((PrimitiveTypeRef)aArgument.getType()).getName().equals(aTypeName)));
	}

	/**
	 *  This error signature, with index as last parameter, cause a nullpointerexception at assert step (AssertableDiagnostic), because 
	 *  it left the issue code null. So we override the AbstractDeclarativeValidator, so that it calls the string as last parameter error signature
	 */
	@Override
	protected void error(String message, EObject source,
			EStructuralFeature feature, int index) {
		super.error(message, source, feature, Integer.toString(index));
	}
	
	
}
