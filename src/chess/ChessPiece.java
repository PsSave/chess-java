package chess;

import boardgame.Board;
import boardgame.Piece;

public class ChessPiece extends Piece { //é uma subclasse da Piece.

	private Color color;

	public ChessPiece(Board board, Color color) {
		super(board);
		this.color = color;
	}

	public Color getColor() {
		return color;
	}

}
