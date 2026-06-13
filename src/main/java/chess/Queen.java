package chess;

public class Queen extends Piece {

    public Queen(PieceColor color) {
        super(color);
    }

    public String getSymbol() {
        if (this.getColor() == PieceColor.WHITE) {
            return "Q";
        }
        else {
            return "q";
        }
    }
}