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
}