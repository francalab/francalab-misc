package org.waml.w3c.webidl.tests.validator;

import org.waml.w3c.webidl.validation.ValidationErrorCode;
import org.waml.w3c.webidl.webIDL.IDLDefinitions;
import org.waml.w3c.webidl.webIDL.Interface;

public class AttributeValidatorTests extends ValidatorTests {
	
	/**
	 * @spec REQ_CORE_30 The “stringifier” keyword MUST NOT be placed on an attribute unless it is declared to be of type DOMString
	 */
	public void testAttribute_1(){
		
		IDLDefinitions lModel;
		try {
			lModel = (IDLDefinitions) getModelAndExpect(
					"interface A{"
					+ " stringifier attribute DOMString attrOk;" 
					+ "};", 0);
			Interface lInterface = (Interface) lModel.getDefinitions().get(0);
			tester.validator().checkAttributeSpecials(lInterface.getAttributes().get(0));
			
			
			lModel = (IDLDefinitions) getModelAndExpect(
					"interface A{"
					+ " stringifier attribute long attrNok;" 
					+ "};", 0);
			lInterface = (Interface) lModel.getDefinitions().get(0);
			tester.validator().checkAttributeSpecials(lInterface.getAttributes().get(0));
			assertErrorWithCode(ValidationErrorCode.STRINGIFIER_ATTRIBUTE_NOT_DOMSTRING);

		} catch (Exception e) {
			fail(e.getMessage());
		}
	}
}
