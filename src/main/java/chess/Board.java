package chess;

public class Board {
    
    private Piece[][] field;
    
    //where columns are the first entryindex and rows are the 2nd, so a position can be read as usual: x coordinate, then y coordinate.
    public Board() {
        this.field = new Piece[8][8];
    }

    public void placePiece(Piece piece, Position pos) {
        field[pos.getCol()][pos.getRow()] = piece;
    }

    public Piece getPieceAtPosition(Position pos) {
        return field[pos.getCol()][pos.getRow()];
    }

    public boolean positionIsEmpty(Position pos) {
        return field[pos.getCol()][pos.getRow()] == null;
    }

}