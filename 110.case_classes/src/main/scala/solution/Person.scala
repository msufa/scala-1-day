package solution;

case class Person(firstName: String, lastName: String, age: Int)

object Person {

  def describe(anyType: Any): String = {
    anyType match {
      case Person(firstName, _, age) => if (age <= 18) firstName + " is a child" else firstName + " is an adult"
      case _ => "not human"
    }
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
