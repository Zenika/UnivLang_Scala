package univ.lang.scala.lab2

/**
 * Created by fsznajderman on 12/10/15.
 */
object SuiteFibo {

  def fibo(n: Int): Int = {

    if (n <= 1)
      1
    else if (n == 2)
      1
    else
      fibo(n - 1) + fibo(n - 2)
  }

  def suiteFibo(n: Int): List[Int] = {
    var suiteFibo = List[Int]()
    for (n <- 1 to n) {
      suiteFibo = suiteFibo :+ (fibo(n))
    }
    suiteFibo
  }

  def fibo2(n: Int): Int = {

    def fib_tr(n: Int, b: Int, a: Int): Int = n match {
      case 0 => a
      case _ => fib_tr(n - 1, a + b, b)

    }
    fib_tr(n, 1, 0)
  }
}
