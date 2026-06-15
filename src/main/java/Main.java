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
    }
}