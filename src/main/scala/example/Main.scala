package example

class Rational(n: Int, d: Int):
  require(d != 0)

  override def toString: String = s"$n/$d"

  println("Created " + n + "/" + d)

object Main {
  def main(args: Array[String]): Unit = {
    new Rational(1, 2)
  }
}
