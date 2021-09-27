package example

class Rational(n: Int, d: Int):
  require(d != 0)

  private val g = gcd(n.abs, d.abs)

  val number: Int = n / g
  val denom: Int = d / g

  def this(n: Int) = this(n, 1) // auxiliary constructor

  override def toString: String = s"$number/$denom"

  private def gcd(a: Int, b: Int): Int =
    if b == 0 then a else gcd(b, a % b)

  def +(that: Rational): Rational =
    Rational(number * that.denom + that.number * denom,
      denom * that.denom)

  def +(i: Int): Rational =
    Rational(number + i * denom, denom)

  def -(that: Rational): Rational =
    Rational(number * that.denom - that.number * denom,
      denom * that.denom)

  def -(i: Int): Rational =
    Rational(number - i * denom, denom)

  def *(that: Rational): Rational =
    Rational(number * that.number, denom * that.denom)

  def *(i: Int): Rational =
    Rational(number * i, denom)

  def /(that: Rational): Rational =
    Rational(number * that.denom, denom * that.number)

  def /(i:Int): Rational =
    Rational(number, denom * i)

  def lessThan(that: Rational) =
    this.number * that.denom < that.number * this.denom

  def max(that: Rational)=
    if this.lessThan(that) then that else this

object Main {
  def main(args: Array[String]): Unit = {
    new Rational(1, 2)
  }
}
