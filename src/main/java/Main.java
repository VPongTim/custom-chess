import chess.Position;


public class Main {
    public static void main(String[] args) {

        Position pos1 = new Position(1, 3);
        Position pos2 = new Position(2, 4);
        System.out.println(pos1);
        System.out.println(pos1.getRow());
        System.out.println(pos1.getCol());
        System.out.println(pos2.getCol());
        System.out.println(pos2.getCol());
        System.out.println(pos2);
    }
    
}