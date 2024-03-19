package org.example.pieces;

import org.example.utils.Color;
import org.example.Square;

public class Pawn extends Piece {
    public Pawn(Color color) {
        super();
        this.type = PieceType.PAWN;
        this.color = color;
    }

    @Override
    public boolean move(Square destination) {
        // Implement pawn-specific movement logic
        return false;
    }
}
