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

        game.getBoard().placePiece(new Pawn(PieceColor.WHITE), new Position(0, 1));
        game.getBoard().placePiece(new Pawn(PieceColor.BLACK), new Position(0, 6));

        System.out.println(game.getCurrentTurn()); // WHITE
        System.out.println(game.move(new Position(0, 1), new Position(0, 2))); // true
        System.out.println(game.getCurrentTurn()); // BLACK
        System.out.println(game.move(new Position(0, 2), new Position(0, 3))); // false, wrong turn
        System.out.println(game.move(new Position(0, 6), new Position(0, 5))); // true
        System.out.println(game.getCurrentTurn()); // WHITE  
    }
}