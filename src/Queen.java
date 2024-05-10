import java.awt.*;
import java.util.ArrayList;

public class  Queen extends Piece {

    public Queen(String name, Color color, char symbol) {
        super(name, color, symbol);
    }

    public boolean validMove(Board board, int startRow, int startCol, int endRow, int endCol) {
        Piece piece = board.getPiece(endRow, endCol);
        if (endRow < 0 || endRow >= board.pieces.length || endCol < 0 || endCol >= board.pieces[0].length) {
            return false;
        }

        if (startCol == endCol && startRow == endRow) {
            return false;
        }
        if (piece != null && board.getPiece(endRow, endCol).color == this.color) {
            return false;
        } if(endRow == startRow) {
            if(!board.clearHorizontalPath(startRow, startCol, endCol)) {
                return false;
            }
        } else if(endCol == startCol) {
            if(!board.clearVerticalPath(startRow, startCol, endRow)) {
                return false;
            }
        } else if(!board.clearDiagonalPath(startRow, startCol, endRow, endCol)) {
            return false;
        } return board.getPiece(endRow, endCol) == null || color != board.getPiece(endRow, endCol).color;
    }
}
