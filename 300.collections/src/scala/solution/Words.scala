package solution

class Words extends App {
  val keywords = Set("scala", "rocks")

  var words = List.empty[String]
  for (arg <- args) {
    val parts = arg.split(" ")
    for (part <- parts) {
      if (part.length() > 0) {
        words :+ part
      }
    }
  }

  if (words.isEmpty) {
    println("No words!")
  } else {
    println("First word is " + words.head)
    println("Remaining words are " + words.tail.mkString(","))
  }

  if (words.exists(word => keywords.contains(word.toLowerCase))) {
    println("Words contain keywords")
  }

  if (!words.isEmpty && words.forall(word => keywords.contains(word.toLowerCase))) {
    println("Words contain only keywords")
  }

  val firstNonKeyword = words.find(word => !keywords.contains(word.toLowerCase))

  if (firstNonKeyword.isDefined) {
    println("First non-keyword is " + firstNonKeyword.get)
  } else {
    println("No keywords!")
  }
}
