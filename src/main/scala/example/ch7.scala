package example

import java.io.File

object ch7 {
  def gcdLoop(x: Long, y: Long): Long=
    var a = x
    var b = y
    while a != 0 do
      val temp = a
      a = b % a
      b = temp
    return b

  def fileLines(file: File) =
    scala.io.Source.fromFile(file).getLines().toArray

  val filesHere = (new File(".")).listFiles

  val forLineLengths =
    for
      file <- filesHere
      if file.getName.endsWith(".scala")
      line <- fileLines(file)
      trimmed = line.trim
      if trimmed.matches(".*for.*")
    yield trimmed.length

  def printforLineLengths =
    println(forLineLengths)

}
