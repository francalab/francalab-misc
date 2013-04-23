package org.waml.w3c.webidl.tests;

import org.waml.w3c.webidl.tests.validator.ArgumentsValidatorTests;
import org.waml.w3c.webidl.tests.validator.InterfaceValidatorTests;
import org.waml.w3c.webidl.tests.validator.OperationValidatorTests;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Entry point class for test suite
 * 
 * @author pbourdil
 */
public class AllTests {
	public static Test suite() {
		TestSuite suite = new TestSuite(
				"Tests for org.waml.w3c.webidl");

		suite.addTestSuite(OperationValidatorTests.class);
		suite.addTestSuite(InterfaceValidatorTests.class);
		suite.addTestSuite(ArgumentsValidatorTests.class);

		return suite;
	}
}
