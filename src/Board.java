public class Board {
    Piece[][] pieces = new Piece[8][8];

    public Board() {
        this.newBoard();
    }
    public Board(boolean fill) {
        if(fill) {
            this.newBoard();
        }
    }

    private void newBoard() {
        // black pieces
        this.pieces[0][0] = new Rook("RookW1", Color.WHITE, '♖');
        this.pieces[0][1] = new Horse("HorseW1", Color.WHITE, '♘');
        this.pieces[0][2] = new Bishop("BishopW1", Color.WHITE, '♗');
        this.pieces[0][3] = new Queen("QueenW1", Color.WHITE, '♔');
        this.pieces[0][4] = new King("KingW1", Color.WHITE, '♕');
        this.pieces[0][5] = new Bishop("BishopW2", Color.WHITE, '♗');
        this.pieces[0][6] = new Horse("HorseW2", Color.WHITE, '♘');
        this.pieces[0][7] = new Rook("RookW2", Color.WHITE, '♖');
        this.pieces[1][0] = new Pawn("PawnW1", Color.WHITE, '♙');
        this.pieces[1][1] = new Pawn("PawnW2", Color.WHITE, '♙');
        this.pieces[1][2] = new Pawn("PawnW3", Color.WHITE, '♙');
        this.pieces[1][3] = new Pawn("PawnW4", Color.WHITE, '♙');
        this.pieces[1][4] = new Pawn("PawnW5", Color.WHITE, '♙');
        this.pieces[1][5] = new Pawn("PawnW6", Color.WHITE, '♙');
        this.pieces[1][6] = new Pawn("PawnW7", Color.WHITE, '♙');
        this.pieces[1][7] = new Pawn("PawnW8", Color.WHITE,'♙');
        // white pieces
        this.pieces[7][0] = new Rook("RookB1", Color.BLACK, '♜');
        this.pieces[7][1] = new Horse("HorseB1", Color.BLACK, '♞');
        this.pieces[7][2] = new Bishop("BishopB1", Color.BLACK,'♝' );
        this.pieces[7][3] = new Queen("QueenB1", Color.BLACK, '♛');
        this.pieces[7][4] = new King("KingB1", Color.BLACK, '♚');
        this.pieces[7][5] = new Bishop("BishopB2", Color.BLACK, '♝');
        this.pieces[7][6] = new Horse("HorseB2", Color.BLACK,'♞' );
        this.pieces[7][7] = new Rook("RookB2", Color.BLACK, '♜');
        this.pieces[6][0] = new Pawn("PawnB1", Color.BLACK, '♟');
        this.pieces[6][1] = new Pawn("PawnB2", Color.BLACK, '♟');
        this.pieces[6][2] = new Pawn("PawnB3", Color.BLACK, '♟');
        this.pieces[6][3] = new Pawn("PawnB4", Color.BLACK, '♟');
        this.pieces[6][4] = new Pawn("PawnB5", Color.BLACK, '♟');
        this.pieces[6][5] = new Pawn("PawnB6", Color.BLACK, '♟');
        this.pieces[6][6] = new Pawn("PawnB7", Color.BLACK, '♟');
        this.pieces[6][7] = new Pawn("PawnB8", Color.BLACK, '♟');
    }
    private void emptyNewBoard(){
    }

    public Piece getPiece(int row, int col) {
        return this.pieces[row][col];
    }
    public void setPiece(int row, int col, Piece piece) {
        this.pieces[row][col] = piece;
    }
    public boolean clearHorizontalPath(int startRow, int startCol, int endCol) {
        int side = startCol < endCol ? 1 : -1;
        for (int i = startCol; i != endCol ; i += side) {
            if(getPiece(startRow, endCol) != null) {
                return false;

        }

        }
        return true;
    }
    public boolean clearVerticalPath(int startRow, int startCol, int endRow) {
        int side = startRow < endRow ? 1 : -1;
        for (int i = startRow; i != endRow ; i += side) {
            if(getPiece(endRow, startCol) != null) {
                return false;
            }

        }
        return true;
    }
    public boolean clearDiagonalPath(int startRow,int startCol, int endRow, int endCol) {
        int down = (endRow - startRow) < 0 ?  -1 : 1;
        int left = (endCol - startCol) < 0 ?  -1 : 1;
        for(int i = startRow; i != endRow ; i += down) {
            if(getPiece(endRow, startCol) != null) {
                return false;
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(int row = 0; row < 8; row++) {
            for (int col = 0; col < 8; col++) {
                if (this.pieces[row][col] != null) {
                    sb.append(this.pieces[row][col].symbol).append(" ");
                } else {
                    sb.append("   ");
                }
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    }

