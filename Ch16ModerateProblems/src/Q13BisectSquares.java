public class Q13BisectSquares {

    public static Coordinate[] bisectsq(double sq1, Coordinate csq1, double sq2, Coordinate csq2) {
        Coordinate[] res = new Coordinate[2];
        Line line = new Line();
        //Get Slope
        line.m =  (csq2.y - csq1.y) / (csq2.x - csq1.x);

        //Get y-int
        line.b = csq1.y - (line.m * csq1.x);

        //get start of line
        double x1 = csq1.x - (sq1/2);
        System.out.print(sq1/2);
        double x2 = csq2.x + (sq2/2);
        res[0] = new Coordinate(x1,line.m*x1 + line.b);
        res[1] = new Coordinate(x2, line.m*x2 + line.b);
        return res;
    }

    public static void main(String[] args) {
        Coordinate sq1 = new Coordinate(0,2);
        Coordinate sq2 = new Coordinate(2,2);

        Coordinate[] ans = bisectsq(1,sq1,1,sq2);
        System.out.print(ans[0].toString() + " " + ans[1].toString());

    }
}
