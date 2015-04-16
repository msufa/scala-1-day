package scalax

import scala.util.{Try, Success, Failure}

object Functions2 extends App {
  /** Retries the given function up to numTimes until it succeeds **/
  def retry[T](numTimes: Int)(f: => T): T = {
    Try(f) match {
      case Success(v) => v
      case Failure(ex) => {
        if (numTimes > 0) retry(numTimes - 1)(f)
        else throw ex
      }
    }
  }

  var countdown = 5
  val result: String = retry(6) {
    if (countdown <= 0) {
      "Success"
    } else {
      countdown -= 1
      throw new RuntimeException("boom")
    }
  }
  println(result)
}
