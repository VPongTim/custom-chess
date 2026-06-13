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
    public boolean moveShapeLegit(Position from, Position to) {
        if (from.getCol() == to.getCol() && from.getRow() == to.getRow()) {
            return false;
        }
        //rook movement pattern
        if (from.getCol() == to.getCol() || from.getRow() == to.getRow()) {
            return true;
        }
        //bishop movement pattern
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