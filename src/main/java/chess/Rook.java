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

    @Override
    public boolean moveShapeLegit(Position from, Position to) {
        if (from.getCol() == to.getCol() && from.getRow() == to.getRow()) {
            return false;
        }
        if (from.getCol() == to.getCol() || from.getRow() == to.getRow()) {
            return true;
        }
        return false;
    }
}