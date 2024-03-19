package org.example.pieces;

import org.example.Square;
import org.example.utils.Color;

import java.util.List;

import java.util.stream.Collectors;

public abstract class Piece {
    protected PieceType type;
    protected org.example.utils.Color color;
    private static int pieceCount = 0;
    private boolean captured;

    public Piece(PieceType type, org.example.utils.Color color) {
        this.type = type;
        this.color = color;
        pieceCount++;
    }

    public Piece() {

    }

    public abstract boolean move(Square destination);

    public void capture() {
        captured = true;
        // Capture an enemy piece

    }

    public static int getPieceCount() {
        return pieceCount;
    }
    public static List<Piece> getCapturedPieces(List<Piece> allPieces, org.example.utils.Color color) {
        return allPieces.stream()
                .filter(piece -> piece.getColor() == color && piece.isCaptured())
                .collect(Collectors.toList());
    }

    public boolean isCaptured() {
        return captured;
    }

    public Color getColor() {
        return color;
    }
}

