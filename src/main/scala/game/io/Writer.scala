package game.io

import scalaz.effect.IO.putStrLn

object Writer {
  def write(line: String) = {
    for {
      _ <- putStrLn(line)
    } yield ()
  }

  def writeLines(data: Array[String]) = {
    for {
      line <- data.toList
    } yield (write(line))
  }

}
