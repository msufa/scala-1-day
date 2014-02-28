package monads.scalax

import scala.io.Source

object Words extends App {
  val keywords = Source.fromInputStream(getClass.getResourceAsStream("/keywords.txt")).getLines.toSet

  val words: List[String] = ???

  val foundKeywords: List[String] = ???
  println("All keywords: " + foundKeywords.mkString("[",",","]"))

  val upperCaseWords: List[String] = ???
  println("All words in uppercase: " + upperCaseWords.mkString("[",",","]"))
}
