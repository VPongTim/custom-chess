import chess.Position;
import chess.PieceColor;
import chess.Pawn;
import chess.Board;

public class Main {
    public static void main(String[] args) {

        Position pos1 = new Position(1, 3);
        Position pos2 = new Position(2, 4);
        System.out.println(pos1.isInBounds());
        System.out.println(pos2.isInBounds());
        PieceColor color = PieceColor.WHITE;
        System.out.println(color);

        Pawn pwn = new Pawn(PieceColor.WHITE);
        System.out.println(pwn.getSymbol());
        Pawn pwn2 = new Pawn(PieceColor.BLACK);
        System.out.println(pwn2.getSymbol());

        Board board = new Board();
        board.placePiece(pwn, pos2);

        System.out.println(board.getPieceAtPosition(pos2).getSymbol());
        System.out.println(board.positionIsEmpty(pos2));
        System.out.println(board.positionIsEmpty(pos1));


    }
    
}