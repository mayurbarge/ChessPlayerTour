/*
package game.configuration

import game.domain.{Cell, King, Position, Rook}
import org.scalatest.{FunSpec, Matchers}

class ChessBoardTest extends FunSpec with Matchers {
  describe("ChessBoafd") {
    it("should return false when X position is less than 1") {
      ChessBoard.isValidPosition(Position(0, 5)) shouldBe false
    }
    it("should return false when X position is greater than 8") {
      ChessBoard.isValidPosition(Position(2, 9)) shouldBe false
    }
    it("should return false when Y position is less than 1") {
      ChessBoard.isValidPosition(Position(2, 0)) shouldBe false
    }
    it("should return false when Y position is greater than 8") {
      ChessBoard.isValidPosition(Position(2, 9)) shouldBe false
    }
    it("should return true when X, Y position lies within chessboard boundries") {
      ChessBoard.isValidPosition(Position(8, 8)) shouldBe true
      ChessBoard.isValidPosition(Position(1, 1)) shouldBe true
    }
    it("should produce all possible moves for given piece which takes single steps") {
      ChessBoard.possibleMoves(King(Position(3,3), None)) should contain theSameElementsAs List(
        Position(4,3),Position(2,3),
        Position(3,4),Position(3,2),
        Position(4,4), Position(2,4),
        Position(4,2),Position(2,2))
    }
    it("should produce all possible moves for given piece which takes multiple steps") {
      ChessBoard.possibleMoves(Rook(Position(1,1), None)) should contain theSameElementsAs List(
        Position(1,2),Position(1,3),Position(1,4),Position(1,5),Position(1,6),Position(1,7),Position(1,8),
        Position(2,1),Position(3,1),Position(4,1),Position(5,1),Position(6,1),Position(7,1),Position(8,1)
        )
    }
    it("should return Cells for given positions") {
      ChessBoard.getCells(List(Position(1,1),Position(8,8))) should contain theSameElementsAs List(Cell("A1", Position(1,1)), Cell("H8",Position(8,8)))
    }
  }
}
*/
