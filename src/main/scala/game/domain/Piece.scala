package game.domain

import game.rules.{SingleStep, Step}

trait Piece { self =>
  def position: Position
  def possibleMoves(): Seq[Position => Position]
}

case class Horse(override val position: Position) extends Piece {
  def step: Step = SingleStep
  def possibleMoves() = Moves.horizontalMoves ++ Moves.verticalMoves ++ Moves.diagonalMoves
}

object Piece {
  def apply(name: String, position: Position): Option[Piece] = name match {
    case "Horse" => Some(Horse(position))
    case _=> None
  }
}

/*
object Test extends App {
  val x: Option[Piece] = Piece("Horse", Position(0,0))
  println(x.get.possibleMoves().map(f=>f(Position(2,3))))
  List(Position(5,3), Position(-1,3), Position(2,6), Position(2,0), Position(4,5), Position(0,5), Position(4,1), Position(0,1))

}*/
