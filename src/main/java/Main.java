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
import chess.Move;


public class Main {
    public static void main(String[] args) {
        Game game = new Game();

        Move move1 = new Move(new Position(4, 1), new Position(4, 3));
        System.out.println(move1);
        System.out.println(game.move(move1));          // expected true
        System.out.println(game.getCurrentTurn());     // expected BLACK

        Move move2 = new Move(new Position(4, 6), new Position(4, 4));
        System.out.println(move2);
        System.out.println(game.move(move2));          // expected true
        System.out.println(game.getCurrentTurn());     // expected WHITE

        game.getBoard().printBoard();
    }
}