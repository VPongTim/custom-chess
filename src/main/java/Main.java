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

        System.out.println("=== Pawn Movement Tests ===");

        // 1. White pawn one step forward into empty square -> true
        Board board1 = new Board();
        board1.placePiece(new Pawn(PieceColor.WHITE), new Position(0, 1));
        System.out.println("White pawn one forward, expected true: "
                + board1.movePiece(new Position(0, 1), new Position(0, 2)));

        // 2. White pawn two steps from starting row -> true
        Board board2 = new Board();
        board2.placePiece(new Pawn(PieceColor.WHITE), new Position(1, 1));
        System.out.println("White pawn two forward from start, expected true: "
                + board2.movePiece(new Position(1, 1), new Position(1, 3)));

        // 3. White pawn two steps not from starting row -> false
        Board board3 = new Board();
        board3.placePiece(new Pawn(PieceColor.WHITE), new Position(2, 2));
        System.out.println("White pawn two forward not from start, expected false: "
                + board3.movePiece(new Position(2, 2), new Position(2, 4)));

        // 4. White pawn two steps with blocker in between -> false
        Board board4 = new Board();
        board4.placePiece(new Pawn(PieceColor.WHITE), new Position(3, 1));
        board4.placePiece(new Rook(PieceColor.BLACK), new Position(3, 2));
        System.out.println("White pawn two forward blocked, expected false: "
                + board4.movePiece(new Position(3, 1), new Position(3, 3)));

        // 5. White pawn forward into occupied square -> false
        Board board5 = new Board();
        board5.placePiece(new Pawn(PieceColor.WHITE), new Position(4, 1));
        board5.placePiece(new Rook(PieceColor.BLACK), new Position(4, 2));
        System.out.println("White pawn forward into occupied square, expected false: "
                + board5.movePiece(new Position(4, 1), new Position(4, 2)));

        // 6. White pawn diagonal into empty square -> false
        Board board6 = new Board();
        board6.placePiece(new Pawn(PieceColor.WHITE), new Position(5, 1));
        System.out.println("White pawn diagonal into empty square, expected false: "
                + board6.movePiece(new Position(5, 1), new Position(6, 2)));

        // 7. White pawn diagonal into enemy piece -> true
        Board board7 = new Board();
        board7.placePiece(new Pawn(PieceColor.WHITE), new Position(6, 1));
        board7.placePiece(new Rook(PieceColor.BLACK), new Position(7, 2));
        System.out.println("White pawn diagonal capture, expected true: "
                + board7.movePiece(new Position(6, 1), new Position(7, 2)));

        // 8. Black pawn one step forward into empty square -> true
        Board board8 = new Board();
        board8.placePiece(new Pawn(PieceColor.BLACK), new Position(0, 6));
        System.out.println("Black pawn one forward, expected true: "
                + board8.movePiece(new Position(0, 6), new Position(0, 5)));

        // 9. Black pawn two steps from starting row -> true
        Board board9 = new Board();
        board9.placePiece(new Pawn(PieceColor.BLACK), new Position(1, 6));
        System.out.println("Black pawn two forward from start, expected true: "
                + board9.movePiece(new Position(1, 6), new Position(1, 4)));

        // 10. Black pawn two steps with blocker in between -> false
        Board board10 = new Board();
        board10.placePiece(new Pawn(PieceColor.BLACK), new Position(2, 6));
        board10.placePiece(new Rook(PieceColor.WHITE), new Position(2, 5));
        System.out.println("Black pawn two forward blocked, expected false: "
                + board10.movePiece(new Position(2, 6), new Position(2, 4)));

        // 11. Black pawn forward into occupied square -> false
        Board board11 = new Board();
        board11.placePiece(new Pawn(PieceColor.BLACK), new Position(3, 6));
        board11.placePiece(new Rook(PieceColor.WHITE), new Position(3, 5));
        System.out.println("Black pawn forward into occupied square, expected false: "
                + board11.movePiece(new Position(3, 6), new Position(3, 5)));

        // 12. Black pawn diagonal into empty square -> false
        Board board12 = new Board();
        board12.placePiece(new Pawn(PieceColor.BLACK), new Position(4, 6));
        System.out.println("Black pawn diagonal into empty square, expected false: "
                + board12.movePiece(new Position(4, 6), new Position(5, 5)));

        // 13. Black pawn diagonal into enemy piece -> true
        Board board13 = new Board();
        board13.placePiece(new Pawn(PieceColor.BLACK), new Position(5, 6));
        board13.placePiece(new Rook(PieceColor.WHITE), new Position(4, 5));
        System.out.println("Black pawn diagonal capture, expected true: "
                + board13.movePiece(new Position(5, 6), new Position(4, 5)));
        
    }
}