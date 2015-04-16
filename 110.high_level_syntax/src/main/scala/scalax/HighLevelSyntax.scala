package scalax

object HighLevelSyntax extends App {
  def getParameters(args: Array[String]): Option[String] = {
    if (args.length == 1) Some(args(0))
    else None
  }

  def buildString(one: String, two: String): String = s"$one $two"

  val hello = "Hello"
  val world = getParameters(args).getOrElse("World!")

  println(buildString(hello, world))
}
