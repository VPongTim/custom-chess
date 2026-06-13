import chess.Position;
import chess.PieceColor;
import chess.Pawn;
import chess.Board;
import chess.Rook;

public class Main {
    public static void main(String[] args) {

        // checking basic functionality
        Position pos1 = new Position(1, 3);
        Position pos2 = new Position(2, 4);

        Pawn pwn = new Pawn(PieceColor.WHITE);
        Rook rk = new Rook(PieceColor.BLACK);

        Board board = new Board();
        board.placePiece(pwn, pos2);
        board.placePiece(rk, pos1);

        board.printBoard();
    }
}