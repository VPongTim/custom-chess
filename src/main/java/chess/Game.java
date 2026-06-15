package chess;

public class Game {

    private Board board;
    private PieceColor currentTurn;

    public Game() {
        board = new Board();
        currentTurn = PieceColor.WHITE;
        standardBoardInit();
    }

    public Board getBoard() {
        return board;
    }

    public PieceColor getCurrentTurn() {
        return currentTurn;
    }

    public boolean move(Position from, Position to) {
        Piece pc = board.getPieceAtPosition(from);
        
        if (pc == null) {
            return false;
        }
        if (pc.getColor() != currentTurn) {
            return false;
        }
        boolean moveWorked = board.movePiece(from, to);
        if (moveWorked) {
            switchTurn();
        }
        return moveWorked;
    }

    public void switchTurn() {
        if (currentTurn == PieceColor.WHITE) {
            currentTurn = PieceColor.BLACK;
        }
        else {
            currentTurn = PieceColor.WHITE;
        }
    }

    public void standardBoardInit() {
        //set up pawns for both sides
        for (int i = 0; i <= 7; i++) {
            Position curPos = new Position(i, 1);
            board.placePiece(new Pawn(PieceColor.WHITE), curPos);
        }
        for (int i = 0; i <= 7; i++) {
            Position curPos = new Position(i, 6);
            board.placePiece(new Pawn(PieceColor.BLACK), curPos);
        }
        //rook setup
        board.placePiece(new Rook(PieceColor.WHITE), new Position(0, 0));
        board.placePiece(new Rook(PieceColor.WHITE), new Position(7, 0));
        board.placePiece(new Rook(PieceColor.BLACK), new Position(0, 7));
        board.placePiece(new Rook(PieceColor.BLACK), new Position(7, 7));

        //knight setup
        board.placePiece(new Knight(PieceColor.WHITE), new Position(1, 0));
        board.placePiece(new Knight(PieceColor.WHITE), new Position(6, 0));
        board.placePiece(new Knight(PieceColor.BLACK), new Position(1, 7));
        board.placePiece(new Knight(PieceColor.BLACK), new Position(6, 7));

        //bishop setup
        board.placePiece(new Bishop(PieceColor.WHITE), new Position(2, 0));
        board.placePiece(new Bishop(PieceColor.WHITE), new Position(5, 0));
        board.placePiece(new Bishop(PieceColor.BLACK), new Position(2, 7));
        board.placePiece(new Bishop(PieceColor.BLACK), new Position(5, 7));

        //queens setup
        board.placePiece(new Queen(PieceColor.WHITE), new Position(3, 0));
        board.placePiece(new Queen(PieceColor.BLACK), new Position(3, 7));

        //kings setup
        board.placePiece(new King(PieceColor.WHITE), new Position(4, 0));
        board.placePiece(new King(PieceColor.BLACK), new Position(4, 7));
    }
}