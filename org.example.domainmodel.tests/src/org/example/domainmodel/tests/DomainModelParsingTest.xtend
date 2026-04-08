package org.example.domainmodel.tests

import com.google.inject.Inject
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.extensions.InjectionExtension
import org.eclipse.xtext.testing.util.ParseHelper
import org.example.domainmodel.domainModel.Domainmodel
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.^extension.ExtendWith

@ExtendWith(InjectionExtension)
@InjectWith(DomainModelInjectorProvider)
class DomainModelParsingTest {

    @Inject
    ParseHelper<Domainmodel> parseHelper

    @Test
    def void loadModel() {
        val result = parseHelper.parse('''
	        datatype String
	        
	        entity Blog {
	            title: String
	        }
    	''')
	    Assertions.assertNotNull(result)
	    val errors = result.eResource.errors
	    Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: «errors.join(", ")»''')
    }
}