package boardgame;

public class BoardException extends RuntimeException{ //excessão para corrigir erros.

	private static final long serialVersionUID = 1L;

	public BoardException(String msg) {
		super(msg);
	}
}
