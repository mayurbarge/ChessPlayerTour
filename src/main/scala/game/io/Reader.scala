package game.io

import scalaz.effect.IO
import scalaz.effect.IO._

object Reader {
  val io = IO {
    val source = scala.io.Source.stdin
    source.getLines
  }

  def read() = {
    IO {
      val source = scala.io.Source.stdin
      val line = source.bufferedReader().readLine()
      line.split(" ").toList
    }.unsafePerformIO()
  }

}