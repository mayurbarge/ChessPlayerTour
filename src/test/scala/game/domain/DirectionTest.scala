package game.domain

import org.scalatest.{FunSpec, Matchers}

class DirectionTest extends FunSpec with Matchers {
  describe("Direction") {
    it("should tranform position in horizontal directions") {
      Moves.horizontalMoves.map(f=>f(Position(1,1))) should contain theSameElementsAs (List(Position(4,1), Position(-2,1)))
    }
    it("should tranform position in vertical directions") {
      Moves.verticalMoves.map(f=>f(Position(3,3))) should contain theSameElementsAs (List(Position(3,0), Position(3,6)))
    }
    it("should tranform position in diagonal directions") {
      Moves.diagonalMoves.map(f=>f(Position(3,3))) should contain theSameElementsAs List(Position(5,5), Position(1,5), Position(5,1), Position(1,1))
    }
  }
}