import chess.Position;


public class Main {
    public static void main(String[] args) {

        Position pos1 = new Position(1, -2);
        Position pos2 = new Position(2, 10);
        System.out.println(pos1.isInBounds());
        System.out.println(pos2.isInBounds());
    }
    
}