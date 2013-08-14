package scalax

object MyList {
  def main(args: Array[String]): Unit = {
    assert(args.size >= 1, "Usage: MyList 1 2 3 ...")

    val digits = args.map(_.toInt).toList
    val reversedDigits = reverse(digits)
    println(reversedDigits.mkString(" "))
  }

  private def reverse(in: List[Int]): List[Int] = {
    List()
  }
}
