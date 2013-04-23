package org.waml.w3c.webidl.tests.validator;

import org.waml.w3c.webidl.validation.ValidationErrorCode;
import org.waml.w3c.webidl.webIDL.IDLDefinitions;
import org.waml.w3c.webidl.webIDL.Interface;
import org.waml.w3c.webidl.webIDL.Operation;

public class ArgumentsValidatorTests extends ValidatorTests {

	/**
	 * 
	 * @spec REQ_CORE_21 An argument MUST NOT be declared with the "..." terminal unless it is the final argument in the operation’s argument list.
	 * @spec REQ_CORE_23 An argument MUST NOT be declared to be optional unless any subsequent arguments to the operation are also optional
	 */
	public void testArguments_1()
	{
		IDLDefinitions lModel = null;
		try{
			lModel = (IDLDefinitions) getModelAndExpect(
					"interface IntegerSet { " +
					"	readonly attribute unsigned long cardinality; " +
					"	void union(in long... ints, in long bad);" +
					"	void intersection(in DOMString ok, in long... ints);" +
					"};" +
					"interface ColorCreator {" +
					"	object createColorBad(in float v1, in float v2, in optional float alpha,  in float v3);" +
					"	object createColor(in float v1, in float v2, in float v3, in optional float alpha);" +
					"};", 0);
			
			// check variadic argument 
			Interface lInterface = (Interface) lModel.getDefinitions().get(0);
			Operation lBadOpe = lInterface.getOperations().get(0);
			Operation lGoodOpe = lInterface.getOperations().get(1);
			// the variadic argument is not the last argument
			tester.validator().checkArguments(lBadOpe);
			assertErrorWithCode(ValidationErrorCode.VARIADIC_OPERATOR_NOT_FINAL_ARG);
			
			// the variadic argument is the last argument
			tester.validator().checkArguments(lGoodOpe);
			tester.diagnose().assertOK();
			
			// check optional argument 
			lInterface = (Interface) lModel.getDefinitions().get(1);
			lBadOpe = lInterface.getOperations().get(0);
			lGoodOpe = lInterface.getOperations().get(1);
			
			// the optional argument is not the last argument 
			tester.validator().checkArguments(lBadOpe);
			assertErrorWithCode(ValidationErrorCode.LAST_OPTIONAL_ARG);
	
			// the optional argument is the last argument 
			tester.validator().checkArguments(lGoodOpe);
			tester.diagnose().assertOK();
			
			
		}catch (Exception e) {
			fail(e.getMessage());
		}
	}
	
	

}
