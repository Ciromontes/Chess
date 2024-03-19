package org.example;

import org.example.game.Board;
import org.example.pieces.Piece;
import org.example.utils.Coordinate;

public class Square extends Board {
    private Coordinate position;
    private Piece piece;

    public Square(Coordinate position) {
        this.position = position;
        piece = null; // Inicialmente, la casilla no tiene pieza
    }
    // Métodos adicionales...
}

// Clases como Player, Piece (y sus subclases como Pawn), y Move también tendrían constructores similares.
