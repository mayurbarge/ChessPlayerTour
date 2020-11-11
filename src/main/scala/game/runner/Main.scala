package game.runner

import game.io.Reader
import game.io.Writer
import scalaz._
import Scalaz._
import game.domain.{Piece, Position}
import game.runner.MainApp.Validator.Result
import game.tourstrategy.TourStrategy

import scala.util.Try
object MainApp extends App {

  val result = validateTokens(Reader.read()).map((inputs) => {
    val (piece, start) = inputs
    TourStrategy.backtrackingStrategy.run(piece,start)
  })

  result match {
    case Success(output) => {
      Writer.writeLines(output.map(_.map(_.mkString("  "))).getOrElse(Array("No valid tour found."))).sequence.unsafePerformIO()
    }
    case Failure(message) => Writer.write(message.toList.mkString("\n")).unsafePerformIO()
  }

  def validateTokens(tokens: List[String]): Result[(Piece,Position)] = {
    if(tokens.size == 3) {
      tokens match {
        case pieceToken :: x :: y :: Nil if Try{x.toInt}.isSuccess && Try{y.toInt}.isSuccess => {
          val piece = Piece(pieceToken)
          val position = Position(x.toInt, y.toInt)
          if(piece.isDefined) {
            (piece.get, position).success
          }
          else "Invalid input format".failureNel
        }
        case _=> "Invalid inputs".failureNel
      }
    } else "Invalid number of arguments.".failureNel
  }

  object Validator {
    type Result[A] = ValidationNel[String, A]
  }

}
