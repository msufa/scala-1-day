package solution1

import scala.collection.mutable.ListBuffer

object MyList extends App {
  assert(args.size >= 1, "Usage: MyList 1 2 3 ...")

  val list = args.toList
  val reversedTail = reverseTail(list)
  printList(reversedTail)

  private def reverseTail(in: List[String]): List[String] = {
    val reversed = new ListBuffer[String]()
    if (in.isEmpty) {
      reversed
    } else {
      for (i <- 1 until in.size) {
        in(i) +=: reversed
      }
      in(0) +=: reversed
    }
    reversed.toList
  }

  private def printList(in: List[String]): Unit = {
    for (i <- 0 until in.size) {
      if (i == 0) {
        print(in(i))
      } else {
        print(", " + in(i))
      }
    }
    println()
  }
}
