package scalax;

case class Person(firstName: String, lastName: String, age: Int)

object Person {

  def describe(anyType: Any): String = {
		// flesh out this function using Pattern Matching
    "Not Implmented"
  }

  def main(args: Array[String]): Unit = {
    val kid = Person("John", "Smith", 9)
    val adult = Person("Martin", "Smith", 47)
    val cat = "Fluffy"

    println(describe(kid))
    println(describe(adult))
    println(describe(cat))
  }
}
