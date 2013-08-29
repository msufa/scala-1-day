package solution

class Words extends App {
  val keywords = Set("scala", "rocks")

  var words = List.empty[String]
  for (arg <- args) {
    ???
  }

  if (???) {
    println("No words!")
  } else {
    println("First word is " + ???)
    println("Remaining words are " + ???)
  }

  if (???) {
    println("Words contain keywords")
  }

  if (???) {
      println("Words contain only keywords")
  }

  val firstNonKeyword = ???
  if (firstNonKeyword.isDefined) {
    println("First non-keyword is " + firstNonKeyword.get)
  } else {
    println("No keywords!")
  }
}
