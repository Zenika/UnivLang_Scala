package univ.lang.scala.lab2

import org.univ.lang.scala.lab2.SuiteFibo
import org.scalatest.FunSuite

/**
 * Created by fsznajderman on 12/10/15.
 */
class FiboTest extends FunSuite {


  test("For value N, fibo should be 3") {
    val r = SuiteFibo.fibo(5)
    assert(3 == r);
  }

  test("For value N, suite of fibo should be  equal to [3]") {
    val r = SuiteFibo.suiteFibo(10)
    assert(List( 0, 1, 1, 2, 3, 5, 8, 13, 21, 34) == r);
  }


}