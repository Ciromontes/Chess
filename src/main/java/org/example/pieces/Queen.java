package org.example.pieces;

import org.example.Square;
import org.example.utils.Color;

public class Queen  extends Piece  {
    public Queen(PieceType type, Color color) {
        super(type, color);
    }

    public Queen() {
    }

    @Override
    public boolean move(Square destination) {
        return false;
    }
}
