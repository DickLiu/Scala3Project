package example

class Rational(n: Int, d: Int):
  require(d != 0)

  val number: Int = n
  val denom: Int = d

  override def toString: String = s"$n/$d"

  def add(that: Rational): Rational =
    Rational(number * that.denom + that.number * denom,
      denom * that.denom)

  def lessThan(that: Rational) =
    this.number * that.denom < that.number * this.denom

object Main {
  def main(args: Array[String]): Unit = {
    new Rational(1, 2)
  }
}
