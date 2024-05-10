import org.junit.Assert;
import org.junit.Test;

public class RookTest {
    @Test
    public void rookNotNull() {
        Board board = new Board(false);
        Rook rook = new Rook(Color.WHITE);
        board.setPiece(0, 7, rook);
    }
    @Test
    public void rookMoveVertically() {
        Board board = new Board(false);
        Rook rook = new Rook(Color.WHITE);
        Rook rook2 = new Rook(Color.WHITE);
        board.setPiece(5,7, rook2);
        Assert.assertFalse(board.clearVerticalPath(4,7, 7));
    }
    @Test
    public void rookMoveHorizontalNotValid() {
        Board board = new Board(false);
        Rook rook = new Rook(Color.WHITE);
        Rook rook2 = new Rook(Color.WHITE);
        board.setPiece(0,6, rook2);
        Assert.assertFalse(rook.validMove(board, 0, 5, 0, 7));
    }
    @Test
    public void rookMoveCapture() {
        Board board = new Board(false);
        Rook rook = new Rook(Color.WHITE);
        Rook rook2 = new Rook(Color.BLACK);
        board.setPiece(6,6, rook2);
        Assert.assertTrue(rook.validMove(board,1,6,6,6));
}
}
