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
        System.out.println("=== Path Blocking Tests ===");

        // 1. Rook horizontal, no blocker -> true
        Board board1 = new Board();
        board1.placePiece(new Rook(PieceColor.WHITE), new Position(0, 0));
        System.out.println("Rook horizontal no blocker, expected true: "
                + board1.movePiece(new Position(0, 0), new Position(5, 0)));

        // 2. Rook horizontal, blocker between -> false
        Board board2 = new Board();
        board2.placePiece(new Rook(PieceColor.WHITE), new Position(0, 0));
        board2.placePiece(new Pawn(PieceColor.BLACK), new Position(3, 0));
        System.out.println("Rook horizontal blocked, expected false: "
                + board2.movePiece(new Position(0, 0), new Position(5, 0)));

        // 3. Bishop diagonal, no blocker -> true
        Board board3 = new Board();
        board3.placePiece(new Bishop(PieceColor.WHITE), new Position(0, 0));
        System.out.println("Bishop diagonal no blocker, expected true: "
                + board3.movePiece(new Position(0, 0), new Position(4, 4)));

        // 4. Bishop diagonal, blocker between -> false
        Board board4 = new Board();
        board4.placePiece(new Bishop(PieceColor.WHITE), new Position(0, 0));
        board4.placePiece(new Pawn(PieceColor.BLACK), new Position(2, 2));
        System.out.println("Bishop diagonal blocked, expected false: "
                + board4.movePiece(new Position(0, 0), new Position(4, 4)));

        // 5. Queen vertical, no blocker -> true
        Board board5 = new Board();
        board5.placePiece(new Queen(PieceColor.WHITE), new Position(4, 0));
        System.out.println("Queen vertical no blocker, expected true: "
                + board5.movePiece(new Position(4, 0), new Position(4, 6)));

        // 6. Queen diagonal, blocker between -> false
        Board board6 = new Board();
        board6.placePiece(new Queen(PieceColor.WHITE), new Position(0, 0));
        board6.placePiece(new Pawn(PieceColor.BLACK), new Position(3, 3));
        System.out.println("Queen diagonal blocked, expected false: "
                + board6.movePiece(new Position(0, 0), new Position(5, 5)));

        // 7. Knight jumps over blocker -> true
        Board board7 = new Board();
        board7.placePiece(new Knight(PieceColor.WHITE), new Position(0, 0));
        board7.placePiece(new Pawn(PieceColor.WHITE), new Position(1, 1));
        System.out.println("Knight jumps over blocker, expected true: "
                + board7.movePiece(new Position(0, 0), new Position(1, 2)));

        
    }
}