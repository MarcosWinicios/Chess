package main;

public class ChessBoard {
	static private ChessBoard instance = null;
	
	private ChessBoard() {}
	
	static ChessBoard getInstance () {
		/*Lazy instance: Garante que o objeto seja instanciado apenas quando necessário*/
		if( instance == null) {
			instance = new ChessBoard();
		}
		
		return instance;
	}
	
	public static void main(String[] args) {
		ChessBoard tabuleiro1 = ChessBoard.getInstance();
		ChessBoard tabuleiro2 = ChessBoard.getInstance();
		
		System.out.println(tabuleiro1);
		System.out.println(tabuleiro2);


	}
}
