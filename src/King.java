import java.awt.*;
import java.util.ArrayList;

public class King extends Piece {

    public King(String name, Color color, char symbol) {
        super(name, color, symbol);
    }
    public King(Color color) {
        super("King", color, color == Color.WHITE ? '♕' : '♚');
    }

    @Override
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
        }
        return Math.abs(endRow - startRow) <= 1 && Math.abs(endCol - startCol) <= 1;
    }

}