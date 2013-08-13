package solution1

object Factorial {
  def main(args: Array[String]): Unit = {
    assert(args.size == 1, "Usage: Factorial <n>")
    val n = args(0).toInt
    assert(n >= 0, "<n> needs to be >= 0")

    println(fac(n))
  }

  private def fac(n: Int): Int = {
    var f = 0
    for(i <- 0 to n) {
      f = f + i
    }
    f
  }
}
