package org.example.domainmodel.tests;

import com.google.inject.Inject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.extensions.InjectionExtension;
import org.eclipse.xtext.testing.util.ParseHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.example.domainmodel.domainModel.Domainmodel;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(InjectionExtension.class)
@InjectWith(DomainModelInjectorProvider.class)
@SuppressWarnings("all")
public class DomainModelParsingTest {
  @Inject
  private ParseHelper<Domainmodel> parseHelper;

  @Test
  public void loadModel() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("datatype String");
      _builder.newLine();
      _builder.newLine();
      _builder.append("entity Blog {");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("title: String");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final Domainmodel result = this.parseHelper.parse(_builder);
      Assertions.assertNotNull(result);
      final EList<Resource.Diagnostic> errors = result.eResource().getErrors();
      boolean _isEmpty = errors.isEmpty();
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("Unexpected errors: ");
      String _join = IterableExtensions.join(errors, ", ");
      _builder_1.append(_join);
      Assertions.assertTrue(_isEmpty, _builder_1.toString());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
