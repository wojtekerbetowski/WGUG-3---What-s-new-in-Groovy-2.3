package pl.erbetowski.wgug.groovy_2_3.markup

import groovy.text.markup.MarkupTemplateEngine
import groovy.text.markup.TemplateConfiguration
import groovy.transform.Canonical

@Canonical
class Markup {

  public static void main(String[] args) {
    def engine = new MarkupTemplateEngine(new TemplateConfiguration())

    def templateString = '''
html {
  body {
    p((1..5).collect{"$some."})
  }
}'''


    def writer = new StringWriter()

    def template = engine.createTypeCheckedModelTemplate(
        templateString,
        [some: 'String']
    )

    template
        .make([ some: 'Some test text'])
        .writeTo(writer)

    println writer
  }
}
