package chess;

public class Position {
    
    //fields
    private int row;
    private int col;

    //constructor
    public Position(int row, int col) {
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
        return "Position(row: " + row + ", col: " + col + ")";
    }
}


