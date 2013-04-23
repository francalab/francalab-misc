package org.waml.w3c.webidl.tests.validator;

import org.waml.w3c.webidl.validation.ValidationErrorCode;
import org.waml.w3c.webidl.webIDL.IDLDefinitions;
import org.waml.w3c.webidl.webIDL.Interface;
import org.waml.w3c.webidl.webIDL.Operation;

public class OperationValidatorTests extends ValidatorTests {

	/**
	 * 
	 * @spec REQ_CORE_19 If an operation has no identifier, then it MUST be
	 *       declared to be a special operation using one of the special
	 *       keywords
	 * @spec REQ_CORE_24 The “omittable” keyword MUST NOT appear on an operation
	 *       that has no identifier.
	 * 
	 */
	public void testOperation_1() {
		IDLDefinitions lModel = null;

		try {
			// the anonymous method needs a return type
			lModel = (IDLDefinitions) getModelAndExpect(
					"interface A {omittable getter DOMString ();};", 0);
			Interface lInterface = (Interface) lModel.getDefinitions().get(0);
			Operation lOpe = lInterface.getOperations().get(0);

			tester.validator().checkOperationWithNoIdentifier(lOpe);
			// tester.diagnose().assertErrorContains("Operation has no identifier but is declared as omittable");
			assertErrorWithCode(ValidationErrorCode.OPERATION_OMITTABLE);

			lModel = (IDLDefinitions) getModelAndExpect(
					"interface A { DOMString ();};", 0);
			lInterface = (Interface) lModel.getDefinitions().get(0);
			lOpe = lInterface.getOperations().get(0);

			tester.validator().checkOperationWithNoIdentifier(lOpe);
			assertErrorWithCode(ValidationErrorCode.OPERATION_MUST_BE_SPECIAL);

		} catch (Exception e) {
			fail(e.getMessage());
		}
	}

	/**
	 * 
	 * @spec REQ_CORE_25 A given special keyword MUST NOT appear twice on a
	 *       operation.
	 * @spec REQ_CORE_27 Special operation declared using operation must not be
	 *       variadic nor have any optional arguments
	 */
	public void testOperation_2() {
		try {
			IDLDefinitions lModel = (IDLDefinitions) getModelAndExpect(
					"interface A{"
							+ "	getter getter A opeNok(unsigned long index);"
							+ "	getter  A opeOk(unsigned long index);"
							+ "	getter  A opeNok2(unsigned long... index);"
							+ "};", 0);

			Interface lInterface = (Interface) lModel.getDefinitions().get(0);
			Operation lBadOpe = lInterface.getOperations().get(0);
			Operation lGoodOpe = lInterface.getOperations().get(1);
			Operation lBadOpe2 = lInterface.getOperations().get(2);

			tester.validator().checkOperation(lBadOpe);
			assertErrorWithCode(ValidationErrorCode.SPECIAL_KEYWORD_NOT_UNIQUE);

			tester.validator().checkOperation(lGoodOpe);
			tester.diagnose().assertOK();

			tester.validator().checkOperation(lBadOpe2);
			assertErrorWithCode(ValidationErrorCode.SPECIAL_OPERATION_VARIADIC_OR_WITH_OPTIONAL_ARGS);

		} catch (Exception e) {
			fail(e.getMessage());
		}
	}

	/**
	 * @spec REQ_CORE_31 Index getter and deleter MUST be declared to take a
	 *       single unsigned long argument. Index creator and setter MUST be
	 *       declared to take two argument, the first one is an unsigned long
	 */
	public void testOperation_3() {
		try {
			// the only arg is not an unsigned long
			IDLDefinitions lModel = (IDLDefinitions) getModelAndExpect(
					"interface A{" + "	deleter  A opeNok(long index);" + "};",
					0);

			Interface lInterface = (Interface) lModel.getDefinitions().get(0);
			Operation lBadOpe = lInterface.getOperations().get(0);

			tester.validator().checkOperation(lBadOpe);
			assertErrorWithCode(ValidationErrorCode.INVALID_GETTER_DELETER_CREATOR_SETTER_OPERATION);

			// well defined deleter
			lModel = (IDLDefinitions) getModelAndExpect("interface A{"
					+ "	deleter  A opeOk(unsigned long index);" + "};", 0);

			lInterface = (Interface) lModel.getDefinitions().get(0);
			Operation lGoodOpe = lInterface.getOperations().get(0);

			tester.validator().checkOperation(lGoodOpe);
			tester.diagnose().assertOK();

			// only one argument, whereas setter expects two args
			lModel = (IDLDefinitions) getModelAndExpect("interface A{"
					+ "	setter  A opeNok(unsigned long index);" + "};", 0);
			lInterface = (Interface) lModel.getDefinitions().get(0);
			lBadOpe = lInterface.getOperations().get(0);
			tester.validator().checkOperation(lBadOpe);
			assertErrorWithCode(ValidationErrorCode.INVALID_GETTER_DELETER_CREATOR_SETTER_OPERATION);

			// well defined creator
			lModel = (IDLDefinitions) getModelAndExpect("interface A{"
					+ "	creator  A opeOk(unsigned long index, DOMString arg);"
					+ "};", 0);
			lInterface = (Interface) lModel.getDefinitions().get(0);
			lGoodOpe = lInterface.getOperations().get(0);

			tester.validator().checkOperation(lGoodOpe);
			tester.diagnose().assertOK();

		} catch (Exception e) {
			fail(e.getMessage());
		}
	}

	/**
	 * @spec REQ_CORE_32 Name getter and deleter MUST be declared to take a
	 *       single DOMString argument. Name creator and setter MUST be declared
	 *       to take two argument, the first one is a DOMString
	 * 
	 */
	public void testOperation_4(){
		try {
			// the only arg is not a DOMString argument
			IDLDefinitions lModel = (IDLDefinitions) getModelAndExpect(
					"interface A{" + 
					"	getter  A opeNok(long index);" + "};",
					0);

			Interface lInterface = (Interface) lModel.getDefinitions().get(0);
			Operation lBadOpe = lInterface.getOperations().get(0);

			tester.validator().checkOperation(lBadOpe);
			assertErrorWithCode(ValidationErrorCode.INVALID_GETTER_DELETER_CREATOR_SETTER_OPERATION);

			// well defined deleter
			lModel = (IDLDefinitions) getModelAndExpect(
					"interface A{"
					+ "	getter  A opeOk(DOMString name);" 
					+ "};", 0);

			lInterface = (Interface) lModel.getDefinitions().get(0);
			Operation lGoodOpe = lInterface.getOperations().get(0);

			tester.validator().checkOperation(lGoodOpe);
			tester.diagnose().assertOK();

			// only one argument, whereas setter expects two args
			lModel = (IDLDefinitions) getModelAndExpect(
					"interface A{"
					+ "	setter  A opeNok(DOMString name);" + 
					"};", 0);
			lInterface = (Interface) lModel.getDefinitions().get(0);
			lBadOpe = lInterface.getOperations().get(0);
			tester.validator().checkOperation(lBadOpe);
			assertErrorWithCode(ValidationErrorCode.INVALID_GETTER_DELETER_CREATOR_SETTER_OPERATION);

			// well defined creator
			lModel = (IDLDefinitions) getModelAndExpect(
					"interface A{"
					+ "	creator  A opeOk(DOMString name, DOMString arg);"
					+ "};", 0);
			lInterface = (Interface) lModel.getDefinitions().get(0);
			lGoodOpe = lInterface.getOperations().get(0);

			tester.validator().checkOperation(lGoodOpe);
			tester.diagnose().assertOK();

		} catch (Exception e) {
			fail(e.getMessage());
		}
	}
	
	/**
	 * 
	 * @spec REQ_CORE_28 Stringifier declared with operation MUST be declared to
	 *       take zero argument and return a DOMString.
	 */
	public void testStringifier_1() {
		try {
			IDLDefinitions lModel;
			Interface lInterface;
			Operation lBadOpe;

			// Stringifier does not return a string
			lModel = (IDLDefinitions) getModelAndExpect("interface A{"
					+ "	stringifier  A opeNok();" + "};", 0);

			lInterface = (Interface) lModel.getDefinitions().get(0);
			lBadOpe = lInterface.getOperations().get(0);
			tester.validator().checkStringifier(lBadOpe);
			assertErrorWithCode(ValidationErrorCode.STRINGIFIER_OPERATION_HAS_ARGS_OR_NOT_RETURNS_DOMSTRING);

			// Stringifier has an argument
			lModel = (IDLDefinitions) getModelAndExpect("interface A{"
					+ "	stringifier  DOMString opeNok(in long arg);" + "};", 0);

			lInterface = (Interface) lModel.getDefinitions().get(0);
			lBadOpe = lInterface.getOperations().get(0);
			tester.validator().checkStringifier(lBadOpe);
			assertErrorWithCode(ValidationErrorCode.STRINGIFIER_OPERATION_HAS_ARGS_OR_NOT_RETURNS_DOMSTRING);

			// Finally, a well defined stringifier
			lModel = (IDLDefinitions) getModelAndExpect("interface A{"
					+ "	stringifier  DOMString opeOk();" + "};", 0);

			lInterface = (Interface) lModel.getDefinitions().get(0);
			lBadOpe = lInterface.getOperations().get(0);
			tester.validator().checkStringifier(lBadOpe);
			tester.diagnose().assertOK();

		} catch (Exception e) {
			fail(e.getMessage());
		}
	}

}
