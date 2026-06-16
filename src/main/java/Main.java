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
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Game game = new Game();
        game.getBoard().printBoard();

        while (true) {
            System.out.println("Current turn: " + game.getCurrentTurn());

            Move move = userInput();

            boolean moveWorked = game.move(move);

            if (!moveWorked) {
                System.out.println("Illegal move. Try again.");
            }

            game.getBoard().printBoard();
        }
    }

    static Move userInput() {
        boolean inputCorrect = false;
        Scanner sc = new Scanner(System.in);
        String moveString = "";
        while (!inputCorrect) {
            System.out.print("Enter Move: ");
            moveString = sc.nextLine();
            if (moveString.length() != 5) {
                System.out.println("Invalid input.");
                continue;
            }
            char[] ca = moveString.toCharArray();
            if (ca[0] < 'a' || ca[0] > 'h') {
                System.out.println("Invalid input.");
                continue;
            }
            if (ca[3] < 'a' || ca[3] > 'h') {
                System.out.println("Invalid input.");
                continue;
            }
            if (ca[1] < '1' || ca[1] > '8') {
                System.out.println("Invalid input.");
                continue;
            }
            if (ca[4] < '1' || ca[4] > '8') {
                System.out.println("Invalid input.");
                continue;
            }
            if (ca[2] != ' ') {
                System.out.println("Invalid input.");
                continue;
            }
            inputCorrect = true;
        }
        int x1 = 0;
        int y1 = 0;
        int x2 = 0;
        int y2 = 0;

        char[] ca = moveString.toCharArray();
        String helpString = "abcdefgh";
        String helpString2 = "12345678";
        char[] helperArray = helpString.toCharArray();
        char[] helperArray2 = helpString2.toCharArray();

        // this could be done more elegantly with conversion via subtraction
        for (int i = 0; i < helperArray.length; i++) {
            if (ca[0] == helperArray[i]) {
                x1 = i;
            }
        }
        for (int i = 0; i < helperArray.length; i++) {
            if (ca[3] == helperArray[i]) {
                x2 = i;
            }
        }
        for (int i = 0; i < helperArray2.length; i++) {
            if (ca[1] == helperArray2[i]) {
                y1 = i;
            }
        }
        for (int i = 0; i < helperArray2.length; i++) {
            if (ca[4] == helperArray2[i]) {
                y2 = i;
            }
        }
        Move parsedMove = new Move(new Position(x1, y1), new Position(x2, y2));
        return parsedMove;
    }
}