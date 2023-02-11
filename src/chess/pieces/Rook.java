package chess.pieces;

import boardgame.Board;
import chess.ChessPiece;
import chess.Color;

public class Rook extends ChessPiece{
	
	public Rook(Board board, Color color) { //informa quem é a cor e o tabuleiro
		super(board, color); //repassa para a super classe
	}
	
	@Override
	public String toString() {
		return "R";
	}
}
