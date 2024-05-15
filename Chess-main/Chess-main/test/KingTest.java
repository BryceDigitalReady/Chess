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
    @Test
    public void kingValidMoveDownOne() {
        Board board = new Board(false);
        Piece king = new King(Color.WHITE);
        Assert.assertTrue(king.validMove(board, 1, 4, 0, 4));
    }
    @Test
    public void kingValidMoveRightOne() {
        Board board = new Board(false);
        Piece king = new King(Color.WHITE);
        Assert.assertTrue(king.validMove(board, 0, 4, 0, 5));
    }
    @Test
    public void kingValidMoveLeftOne() {
        Board board = new Board(false);
        Piece king = new King(Color.WHITE);
        Assert.assertTrue(king.validMove(board, 0, 4, 0, 3));
    }
    @Test
    public void kingValidMoveDiagonalUpLeft() {
        Board board = new Board(false);
        Piece king = new King(Color.WHITE);
        Assert.assertTrue(king.validMove(board, 0, 4, 1, 3));
    }
    @Test
    public void kingValidMoveDiagonalUpRight() {
        Board board = new Board(false);
        Piece king = new King(Color.WHITE);
        Assert.assertTrue(king.validMove(board, 0, 4, 1, 5));
    }
    @Test
    public void kingValidMoveDiagonalDownLeft() {
        Board board = new Board(false);
        Piece king = new King(Color.WHITE);
        Assert.assertTrue(king.validMove(board, 1, 4, 0, 3));
    }
    @Test
    public void kingValidMoveDiagonalDownRight() {
        Board board = new Board(false);
        Piece king = new King(Color.WHITE);
        Assert.assertTrue(king.validMove(board, 1, 4, 0, 5));
    }
}

