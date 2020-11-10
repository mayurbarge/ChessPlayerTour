package game.runner

import cats.effect._
import game.configuration.ChessBoard
import game.domain.{Cell, Piece, Position}

object ChessRunner extends IOApp {

  def run(args: List[String]): IO[ExitCode] = {
    val result: IO[IO[Any]] =
    for {
      _ <- IO(println(s"Input - "))
      inputs <- IO(scala.io.StdIn.readLine)
    } yield {
        processInputTokens("King D5")
    }
    result.unsafeRunSync()

    IO(ExitCode.Success)
  }

  private def processInputTokens(inputs: String) = {
    inputs.split(" ").toList match {
      case pieceInput :: cellInput :: Nil => calculateMoves(pieceInput, cellInput)
      case _ => IO(println("invalid tokens"))
    }
  }

  private def calculateMoves(pieceInput: String, cellInput: String) = {

    ChessBoard.findCellByLabel(cellInput) match {
      case Some(cell) => {
        println("############")

        val king = Piece(pieceInput, cell.position).get

        val x: String = ChessBoard.getCells(ChessBoard.possibleMoves(king)).map(_.label).mkString(",")
        println("$$$$$$$$$$$$$$"+ x)
        //ChessBoard.getCells(ChessBoard.possibleMoves(piece)).map(_.label).mkString(","))


        IO(
          for {
            piece <- Piece(pieceInput, cell.position)
          } yield {
            println("Output - " + ChessBoard.getCells(ChessBoard.possibleMoves(piece)).map(_.label).mkString(","))
          }
          )
      }
      case None => IO(println("Invalid cell position provided"))
    }
  }
}