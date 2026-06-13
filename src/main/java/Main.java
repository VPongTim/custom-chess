import chess.Position;
import chess.PieceColor;
import chess.Pawn;
import chess.Board;
import chess.Rook;
import chess.Knight;
import chess.Bishop;
import chess.Queen;
import chess.King;


public class Main {
    public static void main(String[] args) {

        // checking basic functionality
        Position pos1 = new Position(1, 3);
        Position pos2 = new Position(2, 4);
        Position pos3 = new Position(0, 0);
        Position pos4 = new Position(7, 6);
        Position pos5 = new Position(0, 4);
        Position pos6 = new Position(5, 5);
        Position newPos = new Position(3, 3);
        
        Pawn pwn = new Pawn(PieceColor.WHITE);
        Rook rk = new Rook(PieceColor.BLACK);
        Knight kn = new Knight(PieceColor.WHITE);
        Bishop b = new Bishop(PieceColor.BLACK);
        King k = new King(PieceColor.WHITE);
        Queen q = new Queen(PieceColor.BLACK);

        Board board = new Board();
        board.placePiece(pwn, pos2);
        board.placePiece(rk, pos1);
        board.placePiece(kn, pos3);
        board.placePiece(b, pos4);
        board.placePiece(k, pos5);
        board.placePiece(q, pos6);

        board.printBoard();

        Position fMove1 = new Position(0, 4);
        System.out.println(board.movePiece(pos5, fMove1));
        board.printBoard();

        Position fMove2 = new Position(1, 6);
        System.out.println(board.movePiece(pos1, fMove2));
        board.printBoard();

        Position fMove3 = new Position(1, 2);
        System.out.println(board.movePiece(pos3, fMove3));
        board.printBoard();
    }
}