import org.junit.Assert;
import org.junit.Test;

import static java.awt.Color.BLACK;
import static java.awt.Color.black;
import static org.junit.Assert.*;
public class TestHorse {
@Test
public void horseNotNull() {
    Board board = new Board(false);
    Piece horse = new Horse(Color.WHITE);
    board.setPiece(0, 1, horse);
    Assert.assertNotNull(horse);
}
    @Test
    public void horseNotValid() {
        Board board = new Board(false);
        Piece horse = new Horse(Color.WHITE);
        Assert.assertFalse(horse.validMove(board, 0, 4, 1, 4));
    }
    @Test
    public void horseNotValidVertical() {
    Board board = new Board(false);
    Piece horse = new Horse(Color.WHITE);
    Assert.assertFalse(horse.validMove(board, 0, 4, 0, 6));
    }
    @Test
    public void horseNotValidHorizontal() {
    Board board = new Board(false);
    Piece horse = new Horse(Color.WHITE);
    Assert.assertFalse(horse.validMove(board,0,4, 4, 4));
    }
    @Test
    public void horseValidUpLeftL() {
    Board board = new Board(false);
    Piece horse = new Horse(Color.WHITE);
    Assert.assertTrue(horse.validMove(board, 0, 4, 2, 3));
    }
    @Test
    public void horseValidUpRightL() {
    Board board = new Board(false);
    Piece horse = new Horse(Color.WHITE);
    Assert.assertTrue(horse.validMove(board, 0, 4, 2, 5));
    }
    @Test
    public void horseValidDownLeftL() {
    Board board = new Board(false);
    Piece horse = new Horse(Color.WHITE);
    Assert.assertTrue(horse.validMove(board, 4, 6, 2, 5));
        }
    @Test
    public void horseValidDownRightL() {
        Board board = new Board(false);
        Piece horse = new Horse(Color.WHITE);
        Assert.assertTrue(horse.validMove(board, 4, 6, 2, 7));
    }
}
