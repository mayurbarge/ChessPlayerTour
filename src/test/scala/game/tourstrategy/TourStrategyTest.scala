package game.tourstrategy

import game.domain.{Horse, Moves, Piece, Position}
import org.scalatest.{FunSpec, Matchers}

class TourStrategyTest extends FunSpec with Matchers {
  describe("Tour Stragegy") {
    it("should return valid solution when piece tour is found") {
      val result = TourStrategy.backtrackingStrategy.run(Horse(),Position(0,0))
      result.isDefined shouldBe true
    }

    it("should return valid solution when piece tour is not found") {
      val pieceWithHorizontalMoves = new Piece {
        override def possibleMoves(): Seq[Position => Position] = Moves.horizontalMoves
      }

      val result = TourStrategy.backtrackingStrategy.run(pieceWithHorizontalMoves,Position(0,0))
      result.isDefined shouldBe false
    }
  }
}
