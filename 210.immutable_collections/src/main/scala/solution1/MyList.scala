package solution1

import scala.collection.mutable.MutableList

object MyList extends App {
  assert(args.size >= 1, "Usage: MyList 1 2 3 ...")

  val digits = new MutableList[Int]()
  for(i <- 0 until args.size) {
    digits += args(i).toInt
  }

  val reversedDigits = MutableList[Int]()
  reverse(digits, reversedDigits)
  for(i <- 0 until reversedDigits.size) {
    print(reversedDigits(i) + " ")
  }
  println()

  private def reverse(in: MutableList[Int], out: MutableList[Int]): Unit = {
    for(i <- 0 until in.size) {
      in(i) +=: out
    }
  }
}
