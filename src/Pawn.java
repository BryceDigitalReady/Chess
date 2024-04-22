import java.awt.*;
import java.util.ArrayList;

public class Pawn extends Piece {

    public Pawn(String name, Color color, char symbol) {
        super(name, color, symbol);
    }
    public static ArrayList<String> findHorseMoves(int row, int col) {
        ArrayList<String> possibleMoves = new ArrayList<>();
        int[][] moves = {
                {1,0}
        };
        for (int[] move : moves) {
            int newRow = row + move[0];
            int newCol = col + move[1];
            if (newRow >= 0 && newRow < 8 && newCol >= 0 && newCol < 8) {
                possibleMoves.add((char) ('A' + newCol) + Integer.toString(8 - newRow));
            }
        }
        return possibleMoves;
    }
}
