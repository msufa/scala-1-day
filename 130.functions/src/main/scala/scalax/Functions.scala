package scalax

object Functions extends App {

  def add(x: Int, y: Int) = x + y
  def mult(x: Int, y: Int) = x * y

  def invoke(zeroVal: Int, end: Int, op: (Int, Int) => Int): Int = {
    def invoke(i: Int): Int = {
      if (i == 0) zeroVal
      else op(i, invoke(i - 1))
    }
    invoke(end)
  }

  def sum(to: Int) = invoke(???, ???, ???)

  def fact(to: Int) = ???

  def pow(base: Int, exponent: Int) = invoke(???, ???, { (count, acc) => ??? })

}
