import chess.Position;
import chess.PieceColor;
import chess.Pawn;
import chess.Board;
import chess.Rook;
import chess.Knight;
import chess.Bishop;
import chess.Queen;
import chess.King;
import chess.Game;

public class Main {
    public static void main(String[] args) {
        Game game = new Game();

        game.getBoard().printBoard();

        System.out.println(game.move(new Position(4, 1), new Position(4, 3))); // white pawn e2-ish to e4-ish
        game.getBoard().printBoard();

        System.out.println(game.move(new Position(4, 6), new Position(4, 4))); // black pawn e7-ish to e5-ish
        game.getBoard().printBoard(); 
    }
}