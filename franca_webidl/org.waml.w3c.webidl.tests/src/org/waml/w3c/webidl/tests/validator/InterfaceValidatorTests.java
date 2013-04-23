package org.waml.w3c.webidl.tests.validator;

import org.waml.w3c.webidl.validation.ValidationErrorCode;
import org.waml.w3c.webidl.webIDL.IDLDefinitions;
import org.waml.w3c.webidl.webIDL.Interface;
import org.waml.w3c.webidl.webIDL.Operation;

public class InterfaceValidatorTests extends ValidatorTests {

	/**
	 * 
	 * @spec REQ_CORE_26 On a given interface there must exists AT MOST one
	 *       stringifier and at most one of each variety of
	 *       getter,setter,creator,deleter,
	 * 
	 */
	public void testInterface_1() {
		
		IDLDefinitions lModel; 
		Interface lInterface;
		Operation lBadOpe;
		try{
		// There must be at most one stringifier
		lModel = (IDLDefinitions) getModelAndExpect(
				"interface A{" 
				+ "	stringifier  DOMString stringOk();"
				+ " stringifier  DOMString stringNok();"
				+ "};",0);
		
		lInterface = (Interface) lModel.getDefinitions().get(0);
		tester.validator().checkInterfaceSpecialsUnicity(lInterface);
		assertErrorWithCode(ValidationErrorCode.TOO_MUCH_SPECIAL_INTERFACE_MEMBERS);
		
		// There must be at most one special keywords of each sort
		lModel = (IDLDefinitions) getModelAndExpect(
				"interface A{" 
				+ "	getter A getterOk(unsigned long index);"
				+ " getter A getterNok(unsigned long index);"
				+ " setter void setterNok(unsigned long index, A a);"
				+ "};",0);
		lInterface = (Interface) lModel.getDefinitions().get(0);
		tester.validator().checkInterfaceSpecialsUnicity(lInterface);
		assertErrorWithCode(ValidationErrorCode.TOO_MUCH_SPECIAL_INTERFACE_MEMBERS);
	
		
		}catch(Exception e){
			fail(e.getMessage());
		}
	}

}
