package chess;

public class Knight extends Piece {

    public Knight(PieceColor color) {
        super(color);
    }

    public String getSymbol() {
        if (this.getColor() == PieceColor.WHITE) {
            return "N";
        }
        else {
            return "n";
        }
    }
}