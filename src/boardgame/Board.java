package boardgame;


public class Board {
	
	private int rows;
	private int columns;
	private Piece[][] pieces;
	
	public Board(int rows, int columns) {
		this.rows = rows;
		this.columns = columns;
		 pieces = new Piece[rows][columns];
	}
	
	public int getRows() {
		return rows;
	}
	public void setRows(int rows) {
		this.rows = rows;
	}
	public int getColumns() {
		return columns;
	}
	public void setColumns(int columns) {
		this.columns = columns;
	}

	public Piece piece(int row, int column) {
		return pieces[row][column]; //metodo criado para retornar a matriz pieces na linha row e na coluna column
	}
	public Piece piece(Position position) {
		return pieces[position.getRow()][position.getColumn()]; //aqui ele retorna a pieces pela posicions criadas pelo getter.
	}
	
	public void placePiece(Piece piece, Position position) {
		pieces[position.getRow()][position.getColumn()] = piece; //esse metodo pega a posição da linha e da coluna e atribui o piece.
		piece.position = position;
	}
}
