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

  def writeResult(data: Option[Array[Array[Int]]]) = {
    data match {
      case Some(value) => {
        printArray(value)
        val resultString = value.map(row=>{
          print("")
          print(row.mkString("   "))
        })
      }
      case None => print("No valid tour found")
    }

    def printArray(data: Array[Array[Int]]) = {
      println("#############")
      data.foreach(r => {
        println()
        print(r.mkString("  "))
      })
    }

    def print(data: String) = {
      for {
        _ <- putStrLn(data)
      } yield ()
    }

  }
}
