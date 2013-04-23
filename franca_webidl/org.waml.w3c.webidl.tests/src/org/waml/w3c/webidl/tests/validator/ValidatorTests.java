package org.waml.w3c.webidl.tests.validator;

import org.eclipse.xtext.Constants;
import org.eclipse.xtext.junit.AbstractXtextTests;
import org.eclipse.xtext.junit.validation.ValidatorTester;
import org.waml.w3c.webidl.WebIDLStandaloneSetup;
import org.waml.w3c.webidl.webIDL.OperationSpecial;
import org.waml.w3c.webidl.webIDL.OperationSpecialGetter;
import org.waml.w3c.webidl.validation.*;


// TODO : Check the expect error parameter from getModelAndExpect, it must be zero everywhere since there must not be any lexical error
public class ValidatorTests extends AbstractXtextTests {
	
	protected ValidatorTester<WebIDLJavaValidator> tester;
	
	@Override
	public void setUp() {
		try {
			super.setUp();
			with(WebIDLStandaloneSetup.class);
			WebIDLJavaValidator validator = get(WebIDLJavaValidator.class);
			tester = new ValidatorTester<WebIDLJavaValidator>(validator,getInjector());

		} catch (Exception e) {
			fail(e.getMessage());
		}
	}
	
	
	public void assertErrorWithCode(Integer aCode)
	{
		tester.diagnose().assertError( Integer.toString(aCode));
	}
}
