package game.domain

trait Direction {
  val transform:(Position => Position)
}
case object East extends Direction {
  override val transform: Position => Position = e => Position(e.row + 1, e.col)
}
case object West extends Direction {
  override val transform: Position => Position = e => Position(e.row - 1, e.col)
}
case object North extends Direction {
  override val transform: Position => Position = e => Position(e.row, e.col + 1)
}
case object South extends Direction {
  override val transform: Position => Position = e => Position(e.row, e.col - 1)
}
case object NorthEast extends Direction {
  override val transform: Position => Position = North.transform andThen East.transform
}
case object NorthWest extends Direction {
  override val transform: Position => Position = North.transform andThen West.transform
}
case object SouthEast extends Direction {
  override val transform: Position => Position = South.transform andThen East.transform
}
case object SouthWest extends Direction {
  override val transform: Position => Position = South.transform andThen West.transform
}

case object NorthNorthEast extends Direction {
  override val transform: Position => Position = North.transform andThen North.transform andThen East.transform
}
case object NorthNorthWest extends Direction {
  override val transform: Position => Position = North.transform andThen North.transform andThen West.transform
}
case object SouthSouthEast extends Direction {
  override val transform: Position => Position = South.transform andThen South.transform andThen East.transform
}
case object SouthSouthWest extends Direction {
  override val transform: Position => Position = South.transform andThen South.transform andThen West.transform
}
case object EastEastNorth extends Direction {
  override val transform: Position => Position = East.transform andThen East.transform andThen North.transform
}
case object EastEastSouth extends Direction {
  override val transform: Position => Position = East.transform andThen East.transform andThen South.transform
}
case object WestWestNorth extends Direction {
  override val transform: Position => Position = West.transform andThen West.transform andThen North.transform
}
case object WestWestSouth extends Direction {
  override val transform: Position => Position = West.transform andThen West.transform andThen South.transform
}