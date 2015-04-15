package solution

import scala.annotation.tailrec

object Functions2 {
  /**
   * Retries the given function up to numTimes until it succeeds
   */
  @tailrec
  def retry[T](numTimes: Int)(f: => T): T = {
     if (numTimes <= 0) {
       f
     } else {
       try {
         f
       } catch {
         case ex: Exception => retry(numTimes - 1)(f)
       }
     }
/*
    // alternative using Try
    import scala.util.{Try, Success, Failure}
    Try(f) match {
      case Success(t) => t
      case Failure(e) if numTimes > 0 => retry(numTimes - 1)(f)
      case Failure(e) => throw e
    }
*/
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
}
