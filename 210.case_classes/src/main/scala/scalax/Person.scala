package scalax

// define a class CPerson
class CPerson(val firstName: String, val lastName: String, val age: Int)

// define a case class CCPerson
case class CCPerson(val firstName: String, val lastName: String, val age: Int)

object Person extends App {
  val cKid = new CPerson("John", "Smith", 9)
  val cAdult = new CPerson("Martin", "Smith", 47)
  val cAdult2 = new CPerson("Martin", "Smith", 47)

  println(cKid)
  println(cAdult)
  println(cAdult == cAdult2)

  val ccKid = CCPerson("John", "Smith", 9)
  val ccAdult = CCPerson("Martin", "Smith", 47)
  val ccAdult2 = CCPerson("Martin", "Smith", 47)

  println(ccKid)
  println(ccAdult)
  println(ccAdult == ccAdult2)
}
