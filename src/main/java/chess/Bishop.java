package chess;

public class Bishop extends Piece {

    public Bishop(PieceColor color) {
        super(color);
    }

    @Override
    public String getSymbol() {
        if (this.getColor() == PieceColor.WHITE) {
            return "B";
        }
        else {
            return "b";
        }
    }
}