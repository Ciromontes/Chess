package org.example.players;

import org.example.pieces.Piece;
import org.example.game.Move;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private String name;
    private List<Piece> pieces;

    public Player(String name) {
        this.name = name;
        this.pieces = new ArrayList<>();
    }

    public boolean makeMove(Move move) {
        // Implement the logic to make a move on the board
        // Return true if the move is successful, false otherwise
        return true; // or false, depending on the result of the move
    }

    public void surrender() {
        // Surrender the game
    }
}