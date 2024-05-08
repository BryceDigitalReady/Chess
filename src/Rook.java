import java.awt.*;
import java.util.ArrayList;

public class Rook extends Piece {

    public Rook(String name, Color color, char symbol) {
        super(name, color, symbol);
    }
    public Rook(Color color) {
        // fix symbols
        super("Rook", color, color == Color.WHITE ? '♕' : '♚');
    }


    public boolean validMove(Board board, int startRow, int startCol, int endRow, int endCol) {
        }
        return false;
    }
}


