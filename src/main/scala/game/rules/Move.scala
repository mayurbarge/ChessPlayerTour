package game.rules

import game.domain._

trait Step
case object SingleStep extends Step
case object MultiStep extends Step

trait Move {
  def movementToDirections: List[Direction]
}
case object Horizontal extends Move {
  override def movementToDirections: List[Direction] = List(East,West)
}
case object Vertical extends Move {
  override def movementToDirections: List[Direction] = List(North,South)
}
case object Diagonal extends Move {
  override def movementToDirections: List[Direction] =
    List(NorthEast,NorthWest,SouthEast,SouthWest)
}
case object TwoAndHalf extends Move {
  override def movementToDirections: List[Direction] = List(EastEastNorth,EastEastSouth,
    WestWestNorth,WestWestSouth, NorthNorthEast, NorthNorthWest,SouthSouthEast, SouthSouthWest)
}