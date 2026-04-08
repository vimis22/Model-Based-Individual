package org.example.domainmodel.tests

import com.google.inject.Inject
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.extensions.InjectionExtension
import org.eclipse.xtext.xbase.testing.CompilationTestHelper
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.^extension.ExtendWith

@ExtendWith(InjectionExtension)
@InjectWith(DomainModelInjectorProvider)
class DomainModelGeneratorTest {

    @Inject extension CompilationTestHelper

    @Test
    def void testGenerator() {
        '''
            datatype String

            package my.company.blog {
                entity Blog {
                    title: String
                }
            }
        '''.assertCompilesTo('''
            package my.company.blog;

            public class Blog {
                private String title;

                public String getTitle() {
                    return title;
                }

                public void setTitle(String title) {
                    this.title = title;
                }
            }
        ''')
    }
}