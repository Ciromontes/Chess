package org.example.game;

import org.example.utils.Coordinate;
import org.example.pieces.Piece;
import org.example.Square;

import java.util.ArrayList;
import java.util.List;

public class Board {
    private Square[][] squares;
    private List<Piece> capturedPieces;


    //Agregation
    private List<Piece> pieces;

    public Board() {
        squares = new Square[8][8];
        capturedPieces = new ArrayList<>();
        setupBoard(); // Configurar el tablero con las piezas
        pieces = new ArrayList<>();
        // Aquí se crearían y agregarían las piezas al tablero, lo que indica una relación de composición
    }

    private void setupBoard() {
    }

    public static boolean isValidPosition(Coordinate position) {
        return position.getX() >= 0 && position.getX() < 8 &&
                position.getY() >= 0 && position.getY() < 8;
    }
}
    // Métodos adicionales...
