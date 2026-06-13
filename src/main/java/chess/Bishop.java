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

        if (colDiff == rowDiff) {
            return true;
        }
        return false;
    }

    @Override
    public boolean requiresPathFreeCheck() {
        return true;
    }
}
