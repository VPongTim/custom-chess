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
    @Override
    public boolean moveShapeLegit(Position from, Position to) {
        
        int x1 = from.getCol();
        int y1 = from.getRow();
        int x2 = to.getCol();
        int y2 = to.getRow();

        int colDiff = Math.abs(x2 - x1);
        int rowDiff = Math.abs(y2 - y1);

        if ((colDiff == 2 && rowDiff == 1) || (colDiff == 1 && rowDiff == 2)) {
            return true;
        }
        return false;
    }

    @Override
    public boolean requiresPathFreeCheck() {
        return false;
    }
}