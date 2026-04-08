package org.example.domainmodel.tests;

import com.google.inject.Inject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.extensions.InjectionExtension;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.testing.CompilationTestHelper;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(InjectionExtension.class)
@InjectWith(DomainModelInjectorProvider.class)
@SuppressWarnings("all")
public class DomainModelGeneratorTest {
  @Inject
  @Extension
  private CompilationTestHelper _compilationTestHelper;

  @Test
  public void testGenerator() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("datatype String");
      _builder.newLine();
      _builder.newLine();
      _builder.append("package my.company.blog {");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("entity Blog {");
      _builder.newLine();
      _builder.append("        ");
      _builder.append("title: String");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("}");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("package my.company.blog;");
      _builder_1.newLine();
      _builder_1.newLine();
      _builder_1.append("public class Blog {");
      _builder_1.newLine();
      _builder_1.append("    ");
      _builder_1.append("private String title;");
      _builder_1.newLine();
      _builder_1.newLine();
      _builder_1.append("    ");
      _builder_1.append("public String getTitle() {");
      _builder_1.newLine();
      _builder_1.append("        ");
      _builder_1.append("return title;");
      _builder_1.newLine();
      _builder_1.append("    ");
      _builder_1.append("}");
      _builder_1.newLine();
      _builder_1.newLine();
      _builder_1.append("    ");
      _builder_1.append("public void setTitle(String title) {");
      _builder_1.newLine();
      _builder_1.append("        ");
      _builder_1.append("this.title = title;");
      _builder_1.newLine();
      _builder_1.append("    ");
      _builder_1.append("}");
      _builder_1.newLine();
      _builder_1.append("}");
      _builder_1.newLine();
      this._compilationTestHelper.assertCompilesTo(_builder, _builder_1);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
