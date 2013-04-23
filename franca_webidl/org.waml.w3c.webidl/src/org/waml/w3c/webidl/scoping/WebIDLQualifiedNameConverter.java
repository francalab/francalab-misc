package org.waml.w3c.webidl.scoping;

import org.eclipse.xtext.naming.IQualifiedNameConverter.DefaultImpl;

public class WebIDLQualifiedNameConverter extends DefaultImpl {

	@Override
	public String getDelimiter() {
		return "::";
	}

	
}
