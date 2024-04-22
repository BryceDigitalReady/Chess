import java.awt.*;
import java.util.ArrayList;

public class Horse extends Piece {

    public Horse(String name, Color color, char symbol) {
        super(name, color, symbol);
    }
    public static ArrayList<String> findHorseMoves(int row, int col) {
        ArrayList<String> possibleMoves = new ArrayList<>();
        int[][] moves = {
                {-2, -1}, {-2, 1}, {-1, -2}, {-1, 2},
                {1, -2}, {1, 2}, {2, -1}, {2, 1}
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
    public String showTheHorse() {
        return this.toString();
    }
}
