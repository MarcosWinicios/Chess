package main;

public class ChessBoard {
	static private ChessBoard instance =  new ChessBoard();
	
	private ChessBoard() {}
	
	static ChessBoard getInstance () {return instance;}
	
	public static void main(String[] args) {
		ChessBoard tabuleiro = ChessBoard.getInstance();
	}
}
