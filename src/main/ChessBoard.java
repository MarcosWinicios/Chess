package main;

public class ChessBoard {
	static private ChessBoard instance = null;
	
	private ChessBoard() {}
	
	static ChessBoard getInstance () {
		if( instance == null) {
			instance = new ChessBoard();
		}
		
		return instance;
	}
	
	public static void main(String[] args) {
		ChessBoard tabuleiro = ChessBoard.getInstance();
	}
}
