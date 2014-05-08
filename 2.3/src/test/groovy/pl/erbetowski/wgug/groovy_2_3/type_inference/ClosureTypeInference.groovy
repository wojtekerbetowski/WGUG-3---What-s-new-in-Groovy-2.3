package pl.erbetowski.wgug.groovy_2_3.type_inference

import groovy.transform.stc.ClosureParams
import groovy.transform.stc.FirstParam
import groovy.transform.stc.SimpleType

@groovy.transform.TypeChecked
class ClosureTypeInference {

  public static void main(String[] args) {
    [1,2,3].each {
      println it + 2
    }

//    new ClosureTypeInference().test()
  }

//  void test() {
//    callClosure { it * 2 }
//  }

//  void callClosure(Closure closure) {
//    println closure(2)
//  }

// @ClosureParams(value=SimpleType.class, options = 'java.lang.Integer')
}
