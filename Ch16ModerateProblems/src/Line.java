public class Line {
    double m; //slope
    double b; //y-int
    boolean infinitem = false;

    public Line() {
    }

    public Line(double m, double b) {
        this.m = m;
        this.b = b;
    }

    public Line(Coordinate c1,Coordinate c2) {
        if(c1.x == c2.x) {
            infinitem = true;
            m = 0;
            b = c1.x;
        } else {
            m = (c2.y - c1.y) / (c2.x - c1.x);
            b = c1.y - (c1.x * m);
        }
    }

    @Override
    public String toString() {
        return "Line{" +
                "m=" + m +
                ", b=" + b +
                ", infinitem=" + infinitem +
                '}';
    }
}
