
package org.waml.w3c.webidl;

import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.scoping.IScopeProvider;
import org.waml.w3c.webidl.scoping.WebIDLScopeProvider;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class WebIDLStandaloneSetup extends WebIDLStandaloneSetupGenerated{

	public static void doSetup() {
		new WebIDLStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
	
}

