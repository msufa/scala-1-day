package scalax

object Functions2 {
  /** Retries the given function up to numTimes until it succeeds **/
  def retry[T](numTimes: Int)(f: => T): T = {
    ???
  }

  var countdown = 5
  val result: String = retry(6) {
    if (countdown <= 0) "Success"
    else {
      countdown -= 1
      throw new RuntimeException("boom")
    }
  }
}
