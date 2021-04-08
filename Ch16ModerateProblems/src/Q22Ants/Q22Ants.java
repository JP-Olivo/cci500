package Q22Ants;

public class Q22Ants {

    public static void main(String[] args) {
        Coordinate c = new Coordinate(0, 0);
        Direction direction = Direction.Up;
        Ant ant = new Ant(direction, c);

        for(int i = 0; i<10; i++) {
            ant.move();
            ant.grid.print();
        }

    }


}
