package scalax

import scala.annotation.tailrec

object Factorial extends App {
  assert(args.size == 1, "Usage: Factorial <n>")
  val n = args(0).toInt
  assert(n >= 0, "<n> needs to be >= 0")

  println(fac(n))
  println(facRec(n))
  println(facTailRec(n))

  private def fac(n: Int): Int = {
    var f = 1
    for (i <- 1 to n) {
      f = f * i
    }
    f
  }

  private def facRec(n: Int): Int = {
    if (n == 0) 1
    else n * facRec(n - 1)
  }

  private def facTailRec(n: Int): Int = {
    @tailrec
    def fac(n: Int, acc: Int): Int = {
    if (n == 0) acc
    else fac(n - 1, n * acc)
    }
    fac(n, 1)
  }
}
