package game.configuration

import game.domain.{Cell, Direction, King, Piece, Position}
import game.rules.{MultiStep, SingleStep}

object ChessBoard extends BoardConfiguration {
  def isValidPosition(position: Position) =
      cells.map(_.position).exists(validPosition => validPosition.row == position.row && validPosition.col == position.col)

  def possibleMoves(piece: Piece) = piece.allMoves(piece.position)

  def findCellByLabel(label: String) = cells.find(_.label == label)
}

case class BoardConfiguration() {
  val MAX = 8
  val cells = {
    val rowLabels = List("A","B","C","D","E","F","G","H")
    val rows = List("1","2","3","4","5","6","7","8")
    val cols = List("1","2","3","4","5","6","7","8")
    for {
      rowNumberLabelPair <- (rowLabels zip rows)
      c <- cols
    } yield {
      val (label, r) = rowNumberLabelPair
      Cell(label + c, Position(r.toInt, c.toInt))
    }
  }

  def getCells(positions: List[Position]) = positions.flatMap(position => cells.find(position == _.position))
}