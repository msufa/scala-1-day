package solution

object HighLevelSyntax extends App {
  val hello = "Hello"
  val space =  " "
  val world = "World!"

  val words = List(hello, space , world)

  val printFunc: (String) => Unit = print

  def word(n: Int) : String = {
    words(n)
  }

  def functionAsParameter(func: (String) => Unit, str: String) {
    func(str)
  }

	def functionAsReturnType(func: (String) => Unit): (String) => Unit = {
    func
  }

  functionAsParameter(printFunc, word(0))
  functionAsParameter(printFunc, word(1))
  functionAsReturnType(printFunc)(word(2))

  println()
}
