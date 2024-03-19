package org.example.pieces;

import org.example.Square;
import org.example.utils.Color;

public class Knight  extends Piece {
    public Knight(PieceType type, Color color) {
        super(type, color);
    }

    @Override
    public boolean move(Square destination) {
        return false;
    }
}
