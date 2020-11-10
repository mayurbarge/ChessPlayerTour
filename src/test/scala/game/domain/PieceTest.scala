/*
package game.domain

import game.rules.{MultiStep, SingleStep}
import org.scalatest.{FunSpec, Matchers}


class PieceTest extends FunSpec with Matchers {
  describe("Piece") {
    describe("King") {
      it("should take single step") {
        King(Position(1,1), None).step shouldBe SingleStep
      }
      it("should be able to move in East, West, North, South, NorthEast, NorthWest, SouthEast and SouthSouthWest directions") {
        King(Position(1,1), None).possibleDirections should contain theSameElementsAs List(East,West,North,South,NorthEast,NorthWest,SouthEast,SouthWest)
      }

      it("should calculate all moves for King") {
        King(Position(1,1), None).allMoves() should contain theSameElementsAs List(Position(1,2), Position(2,1))
      }
    }
    describe("Queen") {
      it("should take multiple steps") {
        Queen(Position(1,1), None).step shouldBe MultiStep
      }
      it("should be able to move in East, West, North, South, NorthEast, NorthWest, SouthEast and SouthSouthWest directions") {
        Queen(Position(1,1), None).possibleDirections should contain theSameElementsAs List(East,West,North,South,NorthEast,NorthWest,SouthEast,SouthWest)
      }
    }
    describe("Bishop") {
      it("should take multiple steps") {
        Bishop(Position(1,1), None).step shouldBe MultiStep
      }
      it("should be able to move in East, West, North, South, NorthEast, NorthWest, SouthEast and SouthSouthWest directions") {
        Bishop(Position(1,1), None).possibleDirections should contain theSameElementsAs List(NorthEast,NorthWest,SouthEast,SouthWest)
      }
    }
    describe("Horse") {
      it("should take single step") {
        Horse(Position(1,1), None).step shouldBe SingleStep
      }
      it("should be able to move in directions EastEastNorth, EastEastSouth, WestWestNorth, WestWestSouth, NorthNorthEast, NorthNorthWest, SouthSouthEast andSouthSouthWest") {
        Horse(Position(1,1), None).possibleDirections should contain theSameElementsAs
          List(EastEastNorth,EastEastSouth,WestWestNorth,WestWestSouth,
            NorthNorthEast,NorthNorthWest,SouthSouthEast,SouthSouthWest)
      }
    }
    describe("Rook") {
      it("should take single step") {
        Rook(Position(1,1), None).step shouldBe MultiStep
      }
      it("should be able to move in directions East, West, North and South") {
        Rook(Position(1,1), None).possibleDirections should contain theSameElementsAs List(East, West, North, South)
      }
    }
    describe("Pawn") {
      it("should take single step") {
        Pawn(Position(1,1), None).step shouldBe SingleStep
      }
      it("should be able to move in directions North, South") {
        Pawn(Position(1,1), None).possibleDirections should contain theSameElementsAs List(North, South)
      }
    }

    describe("move") {
      it("should be able to produce moves for given piece and direction") {
        King(Position(3,3), None).moves(East.transform).take(1).head shouldBe Position(4,3)
        Queen(Position(3,3), None).moves(NorthEast.transform).take(1).head shouldBe Position(4,4)
      }

      it("should move King by one step") {
        King(Position(2,2),None).moves(East.transform).take(1).head shouldBe Position(3,2)
      }
      it("should return multiple step moves for Queen in given direction") {
        Queen(Position(2,2),None).moves(East.transform).take(2).toList should contain theSameElementsAs List(Position(3,2), Position(4,2))
      }
    }

    it("should create King") {
      Piece("King", Position(1,1)) shouldBe Some(King(Position(1,1), None))
    }
    it("should create Queen") {
      Piece("Queen", Position(1,1)) shouldBe Some(Queen(Position(1,1), None))
    }
    it("should create Bishop") {
      Piece("Bishop", Position(1,1)) shouldBe Some(Bishop(Position(1,1), None))
    }
    it("should create Horse") {
      Piece("Horse", Position(1,1)) shouldBe Some(Horse(Position(1,1), None))
    }
    it("should create Rook") {
      Piece("Rook", Position(1,1)) shouldBe Some(Rook(Position(1,1), None))
    }
    it("should create Pawn") {
      Piece("Pawn", Position(1,1)) shouldBe Some(Pawn(Position(1,1), None))
    }
    it("should return None when name of piece is invalid") {
      Piece("xyz", Position(1,1)) shouldBe None
    }
  }
}
*/
