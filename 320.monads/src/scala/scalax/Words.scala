package scalax

import scala.io.Source

class Words extends App {
  val keywords = Source.fromURL(getClass.getResource("keywords"))

  val words: List[String] = ???

  println("All keywords: " + ???)
  println("All words in uppercase: " + ???)
}
