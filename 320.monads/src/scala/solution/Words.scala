package solution

import scala.io.Source

class Words extends App {
  val keywords = Source.fromURL(getClass.getResource("keywords"))

  val words = args.flatMap { arg =>
    arg.split(" ").filter(word => word.length > 0)
  }

  List("a").map
  println("All keywords: " + words.filter(word => keywords.contains(word.toLowerCase)))
  println("All words in uppercase: " + words.map(word => word.toUpperCase))
}
