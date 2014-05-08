package pl.erbetowski.wgug.groovy_2_3.json

import groovy.json.JsonSlurper
import groovy.json.JsonBuilder
import groovyx.gbench.Benchmark
import org.jfairy.Fairy

def fairy = Fairy.create(Locale.forLanguageTag("en"))

def builder = new groovy.json.JsonBuilder()

builder(people: (1..1000).collect {fairy.person()})

def json = builder.toPrettyString()

println json

def b = benchmark(verbose:true) {
  'JSONSlurper 2.3' {
    def people = new JsonSlurper().parseText(json).people

    assert people.size() == 1000
  }
}

b.prettyPrint()
