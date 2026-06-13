package chess;

public abstract class Piece {
    private PieceColor color;

    public Piece(PieceColor color) {
        this.color = color;
    }

    public PieceColor getColor() {
        return color;
    }

    public abstract String getSymbol();

    public abstract boolean moveShapeLegit(Position from, Position to);

    public abstract boolean requiresPathFreeCheck();
}