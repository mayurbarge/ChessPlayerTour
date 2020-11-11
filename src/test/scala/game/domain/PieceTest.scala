package game.domain

import org.scalatest.{FunSpec, Matchers}

class PieceTest extends FunSpec with Matchers {
  describe("Piece") {
    describe("Horse") {
      it("should calculate moves for Horse") {
        Horse().possibleMoves().map(f=>f(Position(2,3))) should contain theSameElementsAs
          List(Position(-1,3), Position(0,1), Position(0,5), Position(2,0), Position(2,6), Position(4,1), Position(4,5), Position(5,3))
      }
    }

    it("should create Horse") {
      Piece("Horse") shouldBe Some(Horse())
    }

    it("should give None if Piece name do not match") {
      Piece("ABC") shouldBe None
    }
  }
}