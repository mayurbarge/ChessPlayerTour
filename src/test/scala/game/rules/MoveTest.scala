package game.rules

import game.domain.{East, EastEastNorth, EastEastSouth, North, NorthEast, NorthNorthEast, NorthNorthWest, NorthWest, Position, South, SouthEast, SouthSouthEast, SouthSouthWest, SouthWest, West, WestWestNorth, WestWestSouth}
import org.scalatest.{FunSpec, Matchers}
import game.rules._

class MoveTest extends FunSpec with Matchers {
/*  describe("Move") {
    it("should return East and West movement when Horizontal") {
      Horizontal.movementToDirections.map(transform => transform(Position(2,2))) should contain theSameElementsAs  List(Position(1,2), Position(3,2))
    }
    it("should return North and South movement when Vertical") {
      Vertical.movementToDirections.map(transform => transform(Position(2,2))) should contain theSameElementsAs  List(Position(2,1), Position(2,3))
    }
    it("should return NorthEast, NorthWest, SouthEast and SouthWest movement when Diagonal") {
      Diagonal.movementToDirections should contain theSameElementsAs  List(NorthEast, NorthWest, SouthEast, SouthWest)
    }
    it("should return NorthEast, NorthWest, SouthEast, SouthWest, EastEastNorth movement when TwoAndHalf") {
      TwoAndHalf.movementToDirections should contain theSameElementsAs  List(EastEastNorth,EastEastSouth,WestWestNorth,WestWestSouth, NorthNorthEast, NorthNorthWest, SouthSouthEast, SouthSouthWest)
    }

    it("should return increment EastEastNorth by one when movement is ThreeAndHalf") {
      ThreeAndHalf.movementToDirections should contain theSameElementsAs List(EastEastNorth.transform andThen North.transform)
    }
  }*/
}
