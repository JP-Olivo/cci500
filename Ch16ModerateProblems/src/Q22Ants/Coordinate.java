package Q22Ants;

public class Coordinate {
    int x;
    int y;

    Coordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Coordinate) {
            Coordinate p = (Coordinate) o;
            return p.x == x && p.y == y;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return (x * 31) ^ y;
    }

    @Override
    public String toString() {
        return "Coordinate{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
