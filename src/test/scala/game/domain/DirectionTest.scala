package game.domain

import org.scalatest.{FunSpec, Matchers}

class DirectionTest extends FunSpec with Matchers {
  describe("Direction") {
    describe("tranform") {
      it("should increment x axis by one for East") {
        East.transform(Position(1, 1)) shouldBe Position(2, 1)
      }
      it("should decrement x axis by one for West") {
        West.transform(Position(1, 1)) shouldBe Position(0, 1)
      }
      it("should increment position in y axis by one for North") {
        North.transform(Position(1, 1)) shouldBe Position(1, 2)
      }
      it("should decrement position in y axis by one for South") {
        South.transform(Position(1, 1)) shouldBe Position(1, 0)
      }
      it("should increment position in x and y axis by one for NorthEast") {
        NorthEast.transform(Position(1, 1)) shouldBe Position(2, 2)
      }
      it("should decrement x axis by one and increment y axis by one for NorthWest") {
        NorthWest.transform(Position(1, 1)) shouldBe Position(0, 2)
      }
      it("should increment x axis by one and decrement y axis by one for SouthEast") {
        SouthEast.transform(Position(1, 1)) shouldBe Position(2, 0)
      }
      it("should decrement x axis by one and decrement y axis by one for SouthWest") {
        SouthWest.transform(Position(1, 1)) shouldBe Position(0, 0)
      }
      it("should increment x axis by one and increment y axis by two for NorthNorthEast") {
        NorthNorthEast.transform(Position(1, 1)) shouldBe Position(2, 3)
      }
      it("should decrement x axis by one and increment y axis by two for NorthNorthWest") {
        NorthNorthWest.transform(Position(1, 1)) shouldBe Position(0, 3)
      }
      it("should increment x axis by one  and decrement y axis by two for SouthSouthEast") {
        SouthSouthEast.transform(Position(4, 4)) shouldBe Position(5, 2)
      }
      it("should decrement x axis by one  and decrement y axis by two for SouthSouthWest") {
        SouthSouthWest.transform(Position(4, 4)) shouldBe Position(3, 2)
      }
      it("should increment x axis by two and increment y axis by one for EastEastNorth") {
        EastEastNorth.transform(Position(4, 4)) shouldBe Position(6, 5)
      }
      it("should increment x axis by two and increment y axis by one for EastEastSouth") {
        EastEastSouth.transform(Position(4, 4)) shouldBe Position(6, 3)
      }
      it("should decrement x axis by two and increment y axis by one for WestWestNorth") {
        WestWestNorth.transform(Position(4, 4)) shouldBe Position(2, 5)
      }
      it("should decrement x axis by two and decrement y axis by one for WestWestSouth") {
        WestWestSouth.transform(Position(4, 4)) shouldBe Position(2, 3)
      }
    }
  }
}
