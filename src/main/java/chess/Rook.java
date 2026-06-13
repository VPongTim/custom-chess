package chess;

public class Rook extends Piece {

    public Rook(PieceColor color) {
        super(color);
    }

    @Override
    public String getSymbol() {
        if (this.getColor() == PieceColor.WHITE) {
            return "R";
        }
        else {
            return "r";
        }
    }
}