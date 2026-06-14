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
    // implement later when board logic is more refined
    @Override
    public boolean moveShapeLegit(Position from, Position to) {
        
        if (from.getCol() == to.getCol() && from.getRow() == to.getRow()) {
            return false;
        }

        int x1 = from.getCol();
        int y1 = from.getRow();
        int x2 = to.getCol();
        int y2 = to.getRow();

        if (getColor() == PieceColor.WHITE) {
            if (y2 - y1 < 1 || y2 - y1 > 2 || Math.abs(x2 - x1) > 1) {
                return false;
            }
            if ((y2 - y1 == 2 && y1 != 1) || (y2 - y1 == 2 && Math.abs(x2 - x1) != 0)) {
                return false;
            }
            return true;
        }
        else {
            if (y1 - y2 < 1 || y1 - y2 > 2 || Math.abs(x2 - x1) > 1) {
                return false;
            }
            if ((y1 - y2 == 2 && y1 != 6) || (y1 - y2 == 2 && Math.abs(x2 - x1) != 0)) {
                return false;
            }
            return true;
        }
    }

    @Override
    public boolean requiresPathFreeCheck() {
        return true;
    }
}