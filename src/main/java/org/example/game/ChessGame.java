package org.example.game;

import org.example.players.Player;

public class ChessGame {
    private Player currentPlayer;
    private GameState gameState;
    private boolean isPlayerOneTurn;
    private Board board;
    private Player whitePlayer;
    private Player blackPlayer;

    public ChessGame() {
        // Inicializar variables
        currentPlayer = null; // o un jugador inicial
        gameState = GameState.NEW; // suponiendo que GameState es un enum
        isPlayerOneTurn = true; // o false, dependiendo de quién comienza
        board = new Board();
        whitePlayer = new Player("Blancas");
        blackPlayer = new Player("Negras");
        // La creación del tablero y los jugadores dentro del constructor indica una relación de composición
    }
    

    public static boolean isWhiteTurn(int moveCount) {
        return moveCount % 2 == 0;
    }
    // Métodos adicionales...
}
