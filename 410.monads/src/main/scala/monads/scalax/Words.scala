package monads.scalax

import scala.io.Source

object Words extends App {
  val keywords = Source.fromURL(getClass.getResource("/keywords.txt")).getLines.toSet

  val words: List[String] = args.toList

  val foundKeywords: List[String] = for {
    word <- words if keywords.contains(word.toLowerCase)
  } yield word
  println("All keywords: " + foundKeywords.mkString("[",",","]"))

  val upperCaseWords: List[String] = for {
    word <- words
  } yield word.toUpperCase
  println("All words in uppercase: " + upperCaseWords.mkString("[",",","]"))
}
