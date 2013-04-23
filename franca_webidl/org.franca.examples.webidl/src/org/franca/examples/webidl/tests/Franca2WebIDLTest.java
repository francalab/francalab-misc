package org.franca.examples.webidl.tests;

import static org.junit.Assert.assertNotNull;

import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.franca.connectors.webidl.WebIDLConnector;
import org.franca.connectors.webidl.WebIDLModelContainer;
import org.franca.core.dsl.FrancaPersistenceManager;
import org.franca.core.dsl.FrancaIDLInjectorProvider;
import org.franca.core.franca.FModel;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.google.inject.Inject;
//import org.franca.core.dsl.FrancaIDLHelpers;

/**
 * Test case for the Franca=>WebIDL transformation toolchain.
 * 
 * @author gunnar
 *
 */
@RunWith(XtextRunner.class)
@InjectWith(FrancaIDLInjectorProvider.class)
public class Franca2WebIDLTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
	
	@Inject
	FrancaPersistenceManager loader;
	
	@Test
	public void test() {
		System.out.println("*** Franca2WebIDLTest");
			
		FModel model = loader.loadModel(TestConfiguration.francaFile);
		// FIXME, replace the deprecated method
		// This is how:
		//      URI root = URI.createURI("classpath:/");
		//    	URI loc = URI.createFileURI(filename);
		//    	FModel fmodel = loader.loadModel(loc, root);
		//    
		    
		// load example Franca interface
		assertNotNull(model);
		System.out.println("Franca: Loaded " + model.getInterfaces().size() + " definitions.");
				
		// create WebIDL/Franca connector
		WebIDLConnector webidlConn = new WebIDLConnector();

		String outputPath = TestConfiguration.francaFile.replaceFirst(".fidl", ".webidl");
		
        WebIDLModelContainer webidlContainer = (WebIDLModelContainer)webidlConn.fromFranca(model);
		webidlConn.saveModel(webidlContainer, outputPath);
		
		// TODO: Generate a WebIDL EMF model instead
		// (and from that generate the WebIDL text, which is already
		// part of the WebIDL EMF project most likely)

		// 
		// Generate to: TestConfiguration.outputDir);		
	}

}
