package chess;

public class Game {

    private Board board;
    private PieceColor currentTurn;

    public Game() {
        board = new Board();
        currentTurn = PieceColor.WHITE;
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
}