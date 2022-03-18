package boardgame;

public class Piece {
	protected Position position;
	private Board board;
	
	public Piece(Board board) {
		this.board = board;
	}

	// Somente classes do mesmo pacote e subclasses poderão acessar o tabuleiro
	protected Board getBoard() {
		return board;
	}

}
