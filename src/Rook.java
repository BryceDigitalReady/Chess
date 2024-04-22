import java.awt.*;
import java.util.ArrayList;

public class Rook extends Piece {

    public Rook(String name, Color color, char symbol) {
        super(name, color, symbol);
    }
    public static ArrayList<int[]> findRookMoves(int row, int col) {
        ArrayList<int[]> moves = new ArrayList<>();
        for (int i = 0; i < 8; i++) {

            if (i != row) {

                moves.add(new int[] {i, col});
            }
        }
        for (int j = 0; j < 8; j++) {

            if (j != col) {

                moves.add(new int[] {row, j});
            }
        }
        return moves;
    }
            }



