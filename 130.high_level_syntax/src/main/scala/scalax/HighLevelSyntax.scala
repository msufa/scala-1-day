package scalax

object HighLevelSyntax extends App {
  val hello = "Hello"
  val space =  " "
  val world = "World!"

  val words = List(hello, space , world)

  val printFunc: (String) => Unit = print

  def word(n: Int) : String = {
    words(n)
  }

  // PART 1
  // Add a parameter 'func' of type function, which takes a 'String' as a parameter and returns a 'Unit'
  // Add a second parameter 'str' of type 'String'
  // Hint: See printFunc above
  def functionAsParameter() {
    // Remove the comments below i.e. the code should be executed
    // func(str)
  }

  // PART 2
  // Add a parameter 'func' of type function, which takes a 'String' as a parameter and returns a 'Unit'
  // Add a return type of type function, which takes a 'String' as a parameter and returns a 'Unit'
  // Hint: See printFunc above
	def functionAsReturnType() {
    // Remove the comments below i.e. the code should be executed
    // func
  }


  // PART 3
  // Remove the comments below i.e. the code should be executed
  // functionAsParameter(printFunc, word(0))
  // functionAsParameter(printFunc, word(1))
  // functionAsReturnType(printFunc)(word(2))

  println()
}
