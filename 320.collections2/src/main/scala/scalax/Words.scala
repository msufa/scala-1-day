package scalax

object Words extends App {
  val keywords = Set("scala", "rocks")

  var words = List.empty[String]
  for (arg <- args) {
    words = words :+ arg
  }

  if (words.isEmpty) {
    println("No words!")
  } else {
    val first: String = words.head
    println("First word is " + first)
    val remainder: List[String] = words.tail
    println("Remaining words are " + remainder.mkString(","))
  }

  if (words.find(word => keywords.contains(word)).nonEmpty) {
    println("Words contain keywords")
  } else {
    println("No keywords found")
  }

  if (!words.isEmpty) {
    if (words.forall(word => keywords.contains(word))) {
      println("Words contain only keywords")
    } else {
      println("Non-keywords found")
    }
  }

  val firstKeyword: Option[String] = words.find(word => keywords.contains(word))
  val firstNonKeyword: Option[String] = words.find(word => !keywords.contains(word))
  println("First keyword " + firstKeyword.getOrElse("not found"))
  println("First non-keyword is " + firstNonKeyword.getOrElse("not found"))
}
