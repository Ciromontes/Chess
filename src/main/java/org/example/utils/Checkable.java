package org.example.utils;

import org.example.game.Board;

public interface Checkable {
    boolean isInCheck(Board board);
}
