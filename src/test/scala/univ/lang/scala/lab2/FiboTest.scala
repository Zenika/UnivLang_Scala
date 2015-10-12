package univ.lang.scala.lab2

import org.scalatest.FunSuite

/**
 * Created by fsznajderman on 12/10/15.
 */
class FiboTest extends FunSuite {


  test("For value 5, fibo should be 5") {
    val r = SuiteFibo.fibo(10)
    assert(55 == r)
  }

  test("For value 10, suite of fibo should be  equal to [1, 1, 2, 3, 5, 8, 13, 21, 34, 55]") {
    val r = SuiteFibo.suiteFibo(10)
    assert(List(1, 1, 2, 3, 5, 8, 13, 21, 34, 55) == r)
  }


}