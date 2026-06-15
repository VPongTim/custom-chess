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
        System.out.println("=== Move History Tests ===");

        Game game = new Game();

        System.out.println("Initial turn, expected WHITE: " + game.getCurrentTurn());
        System.out.println("Initial history size, expected 0: " + game.getMoveHistory().size());

        // Successful white move
        Move move1 = new Move(new Position(4, 1), new Position(4, 3));
        System.out.println("White pawn move e2-ish to e4-ish, expected true: " + game.move(move1));
        System.out.println("Turn after successful white move, expected BLACK: " + game.getCurrentTurn());
        System.out.println("History size, expected 1: " + game.getMoveHistory().size());

        // Failed move: white tries to move again while it is black's turn
        Move illegalMove = new Move(new Position(3, 1), new Position(3, 3));
        System.out.println("White tries to move again, expected false: " + game.move(illegalMove));
        System.out.println("Turn after failed move, expected BLACK: " + game.getCurrentTurn());
        System.out.println("History size after failed move, expected 1: " + game.getMoveHistory().size());

        // Successful black move
        Move move2 = new Move(new Position(4, 6), new Position(4, 4));
        System.out.println("Black pawn move e7-ish to e5-ish, expected true: " + game.move(move2));
        System.out.println("Turn after successful black move, expected WHITE: " + game.getCurrentTurn());
        System.out.println("History size, expected 2: " + game.getMoveHistory().size());

        System.out.println("\nMove history:");
        for (Move move : game.getMoveHistory()) {
            System.out.println(move);
        }

        System.out.println("\nFinal board:");
        game.getBoard().printBoard();
    }
}