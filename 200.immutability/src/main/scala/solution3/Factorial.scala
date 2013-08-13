package solution3

import scala.annotation.tailrec

object Factorial {
  def main(args: Array[String]): Unit = {
    assert(args.size == 1, "Usage: Factorial <n>")
    val n = args(0).toInt
    assert(n >= 0, "<n> needs to be >= 0")

    println(fac(n))
  }

  private def fac(n: Int): Int = {
    @tailrec
    def fac(n: Int, f: Int): Int = {
      if(n == 0) f
      else fac(n - 1, f + n)
    }
    fac(n, 0)
  }
}
