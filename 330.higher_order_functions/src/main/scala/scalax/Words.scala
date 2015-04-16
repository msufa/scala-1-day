package scalax

object Words extends App {
  val words = args.toList.flatMap { arg =>
    arg.split(" ").filter(word => word.length > 0)
  }

  val wordsByFirstLetter: Map[Char, List[String]] = words.groupBy(word => word.head.toLower)
  println("Words by first letter: " + wordsByFirstLetter)

  val (even, odd): (List[String], List[String]) = words.partition(word => word.size % 2 == 0)
  println("Words with even length: " + even)
  println("Words with odd length: " + odd)

  val wordHistogram: Map[String, Int] = words.foldLeft(
    Map[String, Int]())((hist, word) => hist + (word.toLowerCase -> (hist.getOrElse(word.toLowerCase, 0) + 1)))

  println("Word frequencies: " + wordHistogram)
}
