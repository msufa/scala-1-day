package scalax

object MyList extends App {
  assert(args.size >= 1, "Usage: MyList 1 2 3 ...")

  val list = args.toList
  val reversedTail = reverseTail(list)
  printList(reversedTail)

  private def reverseTail(in: List[String]): List[String] = {
    in.head :: in.tail.reverse
  }

  private def printList(in: List[String]): Unit = {
    println(in.mkString(","))
  }
}
