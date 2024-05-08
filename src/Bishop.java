import java.awt.*;
import java.util.ArrayList;

public class Bishop extends Piece {

    public Bishop(String name, Color color, char symbol) {
        super(name, color, symbol);
    }
    public boolean validMove(Board board, int startRow, int startCol, int endRow, int endCol) {
        return false;
    }
}
