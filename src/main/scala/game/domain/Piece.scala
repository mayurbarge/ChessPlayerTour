package game.domain

trait Step
case object SingleStep extends Step
case object MultiStep extends Step

trait Piece {
  def possibleMoves(): Seq[Position => Position]
}

case class Horse() extends Piece {
  def step: Step = SingleStep
  def possibleMoves() = Moves.horizontalMoves ++ Moves.verticalMoves ++ Moves.diagonalMoves
}

object Piece {
  def apply(name: String): Option[Piece] = name match {
    case "Horse" => Some(Horse())
    case _=> None
  }
}