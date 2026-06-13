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

    @Override
    public boolean moveShapeLegit(Position from, Position to) {
        if (from.getCol() == to.getCol() && from.getRow() == to.getRow()) {
            return false;
        }
        int x1 = from.getCol();
        int y1 = from.getRow();
        int x2 = to.getCol();
        int y2 = to.getRow();

        int colDiff = Math.abs(x2 - x1);
        int rowDiff = Math.abs(y2 - y1);

        if (colDiff > 1 || rowDiff > 1) {
            return false;
        }
        return true;
    }
}