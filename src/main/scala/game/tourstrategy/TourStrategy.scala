package game.tourstrategy

import game.domain.{Horse, Piece, Position}

trait TourStrategy[R] {
  def run(piece: Piece, start: Position): R
}

object TourStrategy {
  val backtrackingStrategy = new TourStrategy[Option[Array[Array[Int]]]] {
    override def run(piece: Piece, start: Position) = {
      val MAX = 8
      var solution = Array.fill(MAX)(Array.fill(MAX)(-1))

      solution(start.row)(start.col) = 0

      def solveAndBacktrack(x: Int, y: Int, currentStepCount: Int, solution: Array[Array[Int]]): Int = {
        if (currentStepCount == MAX * MAX)
          return 1;

        piece.possibleMoves().map(f => f(Position(x, y))).foreach(position => {
          if (isSafe(position, solution)) {
            solution(position.row)(position.col) = currentStepCount
            if (solveAndBacktrack(position.row, position.col, currentStepCount + 1, solution) == 1)
              return 1
            else {
              solution(position.row)(position.col) = -1
            }
          }
        })
        return 0
      }

      def isSafe(position: Position, solution: Array[Array[Int]]) = {
        (position.row >= 0 && position.row < MAX && position.col >= 0 && position.col < MAX
          && solution(position.row)(position.col) == -1);
      }

      if (solveAndBacktrack(start.row, start.col, 1, solution) == 0) None
      else
        Some(solution)
    }
  }
}
