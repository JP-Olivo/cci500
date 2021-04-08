import java.util.HashMap;

public class Q14BestLine {


    public static Line bestline(Coordinate[] coordinates) {
        //to keep track of the number of coordinates in best line
        int maxcount = 0;
        Line maxline = new Line();
        // HashMap to store Lines created
        HashMap<Line,Integer> map = new HashMap<Line,Integer>();

        for(Coordinate c: coordinates) {
            Line templine;
            int tempcount;
            for (int i = 1; i < coordinates.length ; i++) {
                templine = new Line(c,coordinates[i]);
                if(!map.containsKey(templine)) {
                    tempcount = getcount(templine,i+1, coordinates);
                    if(tempcount>maxcount) {
                        maxcount = tempcount;
                        maxline = templine;
                    }
                }

            }
        }

        return maxline;
    }

    //returns the number of points in Line;
    public static int getcount(Line line, int i, Coordinate[] coordinates){
        int count = 0;
        if(line.infinitem == true) {
            for(int j = i; j < coordinates.length; j++) {
                if(coordinates[j].x == line.b) {
                    count++;
                }
            }

        } else {
            for(int j = i; j < coordinates.length; j++) {
                if((line.m*coordinates[j].x + line.b) == coordinates[j].y) {
                    count++;
                }
            }

        }
        return count;

    }

    public static void main(String[] args) {
        Coordinate c1 = new Coordinate(1,3);
        Coordinate c2 = new Coordinate(2,4);
        Coordinate c3 = new Coordinate(3,5);
        Coordinate c4 = new Coordinate(1,6);
        Coordinate c5 = new Coordinate(1,8);
        Coordinate c6 = new Coordinate(1,5);

        Coordinate[] coordinates = new Coordinate[]{c1,c2,c3,c4,c5,c6};

        System.out.print(bestline(coordinates).toString());



    }
}
