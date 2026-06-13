package chess;

public class King extends Piece {

    public King(PieceColor color) {
        super(color);
    }

    public String getSymbol() {
        if (this.getColor() == PieceColor.WHITE) {
            return "K";
        }
        else {
            return "k";
        }
    }
}