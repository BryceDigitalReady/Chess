import org.junit.Assert;
import org.junit.Test;

public class KingTest {
    @Test
    public void kingNotNull() {
        Board board = new Board(false);
        Piece king = new King(Color.WHITE);
        board.setPiece(0, 4, king);
        Assert.assertNotNull(king);
    }
    @Test
    public void kingValidMoveUpOne() {
        Board board = new Board(false);
        Piece king = new King(Color.WHITE);
        Assert.assertTrue(king.validMove(board, 0, 4, 1, 4));
    }
}

