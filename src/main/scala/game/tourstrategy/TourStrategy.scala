/*
package game.tourstrategy

import game.configuration.{BoardConfiguration, ChessBoard}
import game.domain.{Horse, King, Position}

object TourStrategy extends App {

  val knight  = Horse(Position(0,0), None)

  var solution = Array.ofDim[Int](8,8)


  for(i <- 0 until 8) {
    for(j <- 0 until 8) {
      solution(i)(j) = -1
    }
  }

  solution(0)(0) = 0

  /* Start from 0,0 and explore all tours using
    solveKTUtil() *//* Start from 0,0 and explore all tours using
    solveKTUtil() */
  if (solveKTUtil(0, 0, 1, solution) == 0) {
   println("Solution does not exist")
  }
  else {
    printSolution
  }

  var generation = 0


  /* A recursive utility function to solve Knight Tour
  problem */
  def solveKTUtil(x: Int, y: Int, movei: Int, solution: Array[Array[Int]]):Int =
  {

    if (movei == 25 )
      return 1;

    /* Try all next moves from
    the current coordinate x, y */
    knight.allMoves(Position(x,y)).foreach(position => {
      if(isSafe(position, solution)) {
        solution(position.row)(position.col) = movei
        if(solveKTUtil(position.row, position.col, movei + 1, solution) == 1)
          return 1
        else {
          solution(position.row)(position.col) = -1
        }
      }
    }
    )

    return 0
    }

  /* A utility function to check if i,j are valid indexes for N*N chessboard */
  def isSafe(position: Position, solution: Array[Array[Int]]) = {
    (position.row >= 0 && position.row < 8 && position.col >= 0 && position.col < 8
      && solution(position.row)(position.col) == -1);
  }

  def printSolution = {
    for(i <- 0 until 8) {
      for(j <- 0 until 8) {
        print(solution(i)(j) + " ")
      }
      println()
    }
  }
}



*/
