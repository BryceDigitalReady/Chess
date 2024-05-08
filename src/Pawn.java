import java.awt.*;
import java.util.ArrayList;

import static java.awt.Color.getColor;

public class Pawn extends Piece {
    public Pawn(String name, Color color, char symbol) {
        super(name, color, symbol);
    }
    public Pawn(Color color) {
        super("Pawn", color, color == Color.WHITE ? '♙' : '♟');
    }


    public boolean validMove(Board board, int startRow, int startCol, int endRow, int endCol) {
        int side = this.color == Color.WHITE ? 1 : -1;
        int startPosition = this.color == Color.WHITE ? 1 : 6;
        Piece piece = board.getPiece(endRow, endCol);
        if (endRow < 0 || endRow >= board.pieces.length || endCol < 0 || endCol >= board.pieces[0].length) {
            return false;
        }

        if (startCol == endCol && startRow == endRow) {
            return false;
        }
        if (piece != null && board.getPiece(endRow, endCol).color == this.color) {
            return false;
        }
        if (board.getPiece(endRow, endCol) == null  && endCol == startCol) {
            if (endRow == startRow + 1) {
                return true;
            }
            if (startPosition == startRow) {
                if (endRow == startRow + 2 * side) {
                    if(board.getPiece(endRow - side, endCol) == null) {
                        return true;
                    }
                }


            }
        } if(endCol == startCol + 1 && endRow == startRow + side) {
            if(piece != null) {
                return true;
            }
        } if(endCol == startCol - 1 && endRow == startRow + side) {
            if(piece != null) {
                return true;
            }
        }
        return false;
    }
}


