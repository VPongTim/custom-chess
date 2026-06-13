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

    public void printBoard() {
        for (int i = field.length - 1; i >= 0; i--) {
            for (int j = 0; j < field.length; j++) {
                Position posCur = new Position(j, i);
                if (positionIsEmpty(posCur) == true) {
                    System.out.print(". ");
                }
                else {
                    Piece pc = field[j][i];
                    System.out.print(pc.getSymbol() + " ");
                }
            }
            System.out.print("\n");
        }
        System.out.print("\n");
    }
    //checks if a move is a move is mechanically possible and on the board
    public boolean movePiece(Position from, Position to) {
        
        if (!from.isInBounds() || !to.isInBounds()) {
            return false;
        }

        if (field[from.getCol()][from.getRow()] == null) {
            return false;
        }
        
        Piece destPiece = field[to.getCol()][to.getRow()];
        Piece movePiece = field[from.getCol()][from.getRow()];
        if (destPiece != null) {
            if (destPiece.getColor() == movePiece.getColor()) {
                return false;
            }
        }
        Piece m = field[from.getCol()][from.getRow()];
        field[from.getCol()][from.getRow()] = null;
        field[to.getCol()][to.getRow()] = m;
        return true;
    }

}