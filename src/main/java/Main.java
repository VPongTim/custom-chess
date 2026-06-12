import chess.Position;
import chess.PieceColor;
import chess.Pawn;

public class Main {
    public static void main(String[] args) {

        Position pos1 = new Position(1, -2);
        Position pos2 = new Position(2, 10);
        System.out.println(pos1.isInBounds());
        System.out.println(pos2.isInBounds());
        PieceColor color = PieceColor.WHITE;
        System.out.println(color);

        Pawn pwn = new Pawn(PieceColor.WHITE);
        System.out.println(pwn.getSymbol());
        Pawn pwn2 = new Pawn(PieceColor.BLACK);
        System.out.println(pwn2.getSymbol());
    }
    
}