package game.domain

trait Direction {
  val transformBy:(Int => Position => Position)
}
case object East extends Direction {
  override val transformBy: Int => Position => Position = (steps: Int) => (e : Position) => Position(e.row + steps, e.col)
}
case object West extends Direction {
  override val transformBy: Int => Position => Position = (steps: Int) => (e : Position) => Position(e.row - steps, e.col)
}
case object North extends Direction {
  override val transformBy: Int => Position => Position = (steps: Int) => (e : Position) => Position(e.row, e.col + steps)
}
case object South extends Direction {
  override val transformBy: Int => Position => Position = (steps: Int) => (e : Position) => Position(e.row, e.col - steps)
}
case object NorthEast extends Direction {
  override val transformBy: Int => Position => Position = (steps: Int) => North.transformBy(steps) andThen East.transformBy(steps)
}
case object SouthEast extends Direction {
  override val transformBy: Int => Position => Position = (steps: Int) => South.transformBy(steps) andThen East.transformBy(steps)
}
case object NorthWest extends Direction {
  override val transformBy: Int => Position => Position = (steps: Int) => North.transformBy(steps) andThen West.transformBy(steps)
}
case object SouthWest extends Direction {
  override val transformBy: Int => Position => Position = (steps: Int) => South.transformBy(steps) andThen West.transformBy(steps)
}

object Moves {
  val horizontalMoves = List(East.transformBy(3), West.transformBy(3))
  val verticalMoves = List(North.transformBy(3), South.transformBy(3))
  val diagonalMoves = List(NorthEast.transformBy(2), NorthWest.transformBy(2), SouthEast.transformBy(2),SouthWest.transformBy(2))
}

