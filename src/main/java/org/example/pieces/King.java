package org.example.pieces;

import org.example.Square;
import org.example.utils.Color;

public class King  extends Piece {
    public King(PieceType type, Color color) {
        super(type, color);
    }

    @Override
    public boolean move(Square destination) {
        return false;
    }
}
