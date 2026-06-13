package chess;

public class Position {
    
    //fields
    private int row;
    private int col;

    //constructor
    public Position(int col, int row) {
        this.row = row;
        this.col = col;
    }

    //methods
    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

    //defines, how an object should be shown as text
    @Override
    public String toString() {
        return "Position(Column: " + col + ", Row: " + row + ")";
    }


    //returns true, if the position this is used on is on the chess board, so on the 8x8 grid
    public boolean isInBounds() {
        if (row < 0 || row > 7) {
            return false;
        }
        if (col < 0 || col > 7) {
            return false;
        }
        return true;
    }
}


