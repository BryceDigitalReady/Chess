public class Gamestate {
    public boolean gameOver;
    public Board board = new Board(true);
    public Player blackPlayer;
    public Player whitePlayer;
    public Player currentPlayer;

    public Gamestate() {
        blackPlayer = new Player(Color.BLACK);
        whitePlayer = new Player(Color.WHITE);
        currentPlayer = whitePlayer;
    }
    public void play() {
        while(!gameOver) {
            System.out.println(board.toString());
            Move move = currentPlayer.getInput();
            board.set

        }
    }
}
