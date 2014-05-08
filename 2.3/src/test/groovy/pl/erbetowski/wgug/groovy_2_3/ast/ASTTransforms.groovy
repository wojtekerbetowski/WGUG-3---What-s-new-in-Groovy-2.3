package pl.erbetowski.wgug.groovy_2_3.ast

import groovy.transform.TailRecursive

def sumUntil(n) {
  n == 0? 0 : sumUntil(n-1) + n
}

println sumUntil(4)

//@TailRecursive def sumUntilRecur(n, aggr = 0) {
//  n == 0? aggr : sumUntilRecur(n-1, n + aggr)
//}
//
//println sumUntilRecur(1234567)
