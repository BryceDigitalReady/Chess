import org.junit.Test;

import static java.awt.Color.BLACK;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class TestBoard {
    @Test
    public void testBoard() {
        Board[][] board = new Board[0][8];
        assertNotNull(board);

    }
    @Test
    public void testHorse() {
        Horse horse = new Horse("Horse", BLACK, '♞');
    }
    @Test
    public void checkIfValidMove() {
    }

    }
 
