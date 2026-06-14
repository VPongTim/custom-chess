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
        // checks if the movement shape is legitimate for that Piecetype
        if (!movePiece.moveShapeLegit(from, to)) {
            return false;
        }
        // pawn specific can capture-diagonally check
        if ((movePiece instanceof Pawn) && (Math.abs(from.getCol() - to.getCol()) != 0)) {
            if (field[to.getCol()][to.getRow()] == null) {
                return false;
            } 
        }
        else if (((movePiece instanceof Pawn) && (Math.abs(from.getRow() - to.getRow()) == 1)) || ((movePiece instanceof Pawn) && (Math.abs(from.getRow() - to.getRow()) == 2))) {
            if (field[to.getCol()][to.getRow()] != null) {
                return false;
            }
            if ((movePiece instanceof Pawn) && (Math.abs(from.getRow() - to.getRow()) == 2)) {
                PieceColor cl = movePiece.getColor();
                if (cl == PieceColor.WHITE && field[to.getCol()][to.getRow() - 1] != null) {
                    return false;
                }
                else if(cl == PieceColor.BLACK && field[to.getCol()][to.getRow() + 1] != null) {
                    return false;
                }
            }
        }
        if (movePiece.requiresPathFreeCheck()){
            if (!pathFree(from, to)) {
                return false;
            }
        }
        field[from.getCol()][from.getRow()] = null;
        field[to.getCol()][to.getRow()] = movePiece;
        return true;
    }

    public boolean pathFree(Position from, Position to) {
        int xDir;
        int yDir;
        if (from.getCol() < to.getCol()) {
            xDir = 1;
        }
        else if (from.getCol() == to.getCol()) {
            xDir = 0;
        }
        else {
            xDir = -1;
        }
        if (from.getRow() < to.getRow()) {
            yDir = 1;
        }
        else if (from.getRow() == to.getRow()) {
            yDir = 0;
        }
        else {
            yDir = -1;
        }
        int x1 = from.getCol();
        int y1 = from.getRow();
        int x2 = to.getCol();
        int y2 = to.getRow();

        
        int i = x1 + xDir;
        int j = y1 + yDir;
        while (i != x2 || j != y2) {
            Position curPosChecker = new Position(i, j);
            if (field[curPosChecker.getCol()][curPosChecker.getRow()] != null) {
                return false;
            }
            i += xDir;
            j += yDir;
        }
        return true;
    }
}