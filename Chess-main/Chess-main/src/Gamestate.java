import java.util.Scanner;

public class Gamestate {
    public boolean gameOver;
    public Board board = new Board(true);
    public Player blackPlayer;
    public Player whitePlayer;
    public Color currentPlayer;

    public Gamestate() {
        this.board = new Board(true);
        blackPlayer = new Player(Color.BLACK);
        whitePlayer = new Player(Color.WHITE);
        currentPlayer = Color.WHITE;
        gameOver = false;
    }

    public Board getBoard() {
        return board;
    }

    public Color getCurrentPlayer() {
        return currentPlayer;
    }

    public void play() {
        while (!gameOver) {
            System.out.println(board.toString());
            System.out.println("Current Player:" + getCurrentPlayer());
            Move move = Player.getInput();
            Piece piece = board.getPiece(move.startX, move.startY);
            board.setPiece(move.endX, move.endY, piece);
        }
    }
}

