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
        return false;
    }

    @Override
    public boolean requiresPathFreeCheck() {
        return false;
    }
}