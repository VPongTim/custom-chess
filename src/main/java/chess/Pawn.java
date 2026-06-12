package chess;

public class Pawn extends Piece {

    public Pawn(PieceColor color) {
        super(color);
    }

    public String getSymbol() {
        if (this.getColor() == PieceColor.WHITE) {
            return "P";
        }
        else {
            return "p";
        }
    }
}