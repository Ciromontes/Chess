package org.example.pieces;

import org.example.Square;
import org.example.utils.Color;

public class  Bishop extends Piece {
    public Bishop(PieceType type, Color color) {
        super(type, color);
    }

    @Override
    public boolean move(Square destination) {
        return false;
    }
}
