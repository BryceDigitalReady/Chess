import java.awt.*;
import java.util.ArrayList;

public class Horse extends Piece {

    public Horse(String name, Color color, char symbol) {
        super(name, color, symbol);
    }
    public Horse(Color color) {
        super("Horse", color, color == Color.WHITE ? '♘' : '♞');
    }

    @Override
    public boolean validMove(Board board, int startRow, int startCol, int endRow, int endCol) {
        Piece piece = board.getPiece(endRow, endCol);
        int xDiff = (endCol - startCol);
        int yDiff = (endRow - startRow);
        if (endRow < 0 || endRow >= board.pieces.length || endCol < 0 || endCol >= board.pieces[0].length) {
            return false;
        }

        if (startCol == endCol && startRow == endRow) {
            return false;
        }
        if (piece != null && board.getPiece(endRow, endCol).color == this.color) {
            return false;
        }
        return (Math.abs(xDiff) == 2 && Math.abs(yDiff) == 1) || (Math.abs(xDiff) == 1 && Math.abs(yDiff) == 2);
    }

}