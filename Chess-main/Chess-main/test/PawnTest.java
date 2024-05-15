import org.junit.Assert;
import org.junit.Test;

public class PawnTest {
    @Test
    public void pawnNotNull() {
        Board board = new Board(false);
        Piece pawn = new Pawn(Color.WHITE);
        board.setPiece(1, 2, pawn);
        Assert.assertNotNull(pawn);
    }
    @Test
    public void pawnValidMoveForward() {
        Board board = new Board(false);
        Piece pawn = new Pawn(Color.WHITE);
        Assert.assertTrue(pawn.validMove(board, 1, 2, 2, 2));
    }
    @Test
    public void pawnValidMoveStartPosition() {
        Board board = new Board(false);
        Piece pawn = new Pawn(Color.WHITE);
        Assert.assertTrue(pawn.validMove(board, 1, 2, 3, 2 ));
    }
    @Test
    public void pawnValidMoveStartPositionFalse() {
        Board board = new Board(false);
        Piece pawn = new Pawn(Color.WHITE);
        Assert.assertFalse(pawn.validMove(board, 2, 2, 4, 2));
    }
    @Test
    public void pawnValidMoveDiagonalEnemyRight() {
        Board board = new Board(false);
        Piece pawn = new Pawn(Color.WHITE);
        Piece pawn2 = new Pawn(Color.BLACK);
        board.setPiece(2, 3, pawn2);
        Assert.assertTrue(pawn.validMove(board, 1, 2, 2, 3));
    }
    @Test
    public void pawnValidMoveDiagonalEnemyLeft() {
        Board board = new Board(false);
        Piece pawn = new Pawn(Color.WHITE);
        Piece pawn2 = new Pawn(Color.BLACK);
        board.setPiece(2, 1, pawn2);
        Assert.assertTrue(pawn.validMove(board, 1, 2, 2, 1));
    }
    @Test
    public void pawnMoveBlockedFront() {
        Board board = new Board(false);
        Piece pawn = new Pawn(Color.WHITE);
        Piece pawn2 = new Pawn(Color.BLACK);
        board.setPiece(2,2,pawn2);
        Assert.assertFalse(pawn.validMove(board, 1, 2, 3, 2));
    }
}
