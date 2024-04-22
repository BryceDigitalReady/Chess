import java.awt.*;
import java.util.ArrayList;

public class  Queen extends Piece {

    public Queen(String name, Color color, char symbol) {
        super(name, color, symbol);
    }
    public static ArrayList<int[]> findQueenMoves(int row, int col) {
        ArrayList<int[]> moves = new ArrayList<>();
        // horizontal function
        for (int i = 0; i < 8; i++) {

            if (i != row) {

                moves.add(new int[] {i, col});
            }
        }
        // vertical function
        for (int q = 0; q < 8; q++) {

            if (q != col) {

                moves.add(new int[] {row, q});
            }
        }
        // top diagonal right
        while(int i = row + 1 && int j = col + 1; ) {

        }


        // top diagonal left



        // bottom diagonal left


        // bottom diagonal right



        return moves;
    }
}
