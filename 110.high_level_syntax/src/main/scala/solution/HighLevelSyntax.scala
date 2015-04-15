package solution

object HighLevelSyntax extends App {
  def getParameter(args: Array[String]): Option[String] = {
    if (args.length == 1) {
      Some(args(0))
    } else {
      None
    }
  }

  def buildString(one: String, two: String): String = {
    s"$one $two"
  }

  val hello = "Hello"
  val name = getParameter(args).getOrElse("World!")

  println(buildString(hello, name))
}
