package game.domain

import game.rules.{Diagonal, Horizontal, MultiStep, SingleStep, Step, TwoAndHalf, Vertical}

trait Piece { self =>
  def position: Position
  def movingDirection: Option[Direction]
  def possibleDirections(): List[Direction]

  def allMoves():List[Position] = {
    possibleDirections().map(direction => direction.transform(position))
  }
}

case class King(override val position: Position, override val movingDirection: Option[Direction]) extends Piece {
  def possibleDirections() = Horizontal.movementToDirections ++ Vertical.movementToDirections ++ Diagonal.movementToDirections
}

case class Horse(override val position: Position, override val movingDirection: Option[Direction]) extends Piece {
  def step: Step = SingleStep
  def possibleDirections() = TwoAndHalf.movementToDirections
}

object Piece {
  def apply(name: String, position: Position): Option[Piece] = name match {
    case "King" => Some(King(position, None))
    case "Horse" => Some(Horse(position, None))

    case _=> None
  }
}
