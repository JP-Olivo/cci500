package Q22Ants;

import java.util.HashSet;


public class Grid {

    HashSet<Coordinate> hs = new HashSet<Coordinate>();
    Coordinate start;
    Coordinate end;

    public Grid(Coordinate first) {

        start = new Coordinate(first.x,first.y);
        end = new Coordinate(first.x,first.y);
    }

    public boolean black(Coordinate c) {
        return hs.contains(c);
    }

    public void turnblack(Coordinate c) {
        hs.add(c);
    }

    public void turnwhite(Coordinate c) {
        hs.remove(c);
    }

    public void updateedge(Coordinate c) {
        if (c.x < start.x) {
            start.x = c.x;
        } else if(c.y > start.y) {
            start.y = c.y;
        } else if(c.x > end.x) {
            end.x = c.x;
        } else if(c.y < end.y) {
            end.y = c.y;
        }
    }

    public void print() {
        Coordinate c = new Coordinate(0,0);
        System.out.println(start.toString() + " " + end.toString());
        for(int j = start.y; j >= end.y; j--) {

            c.y = j;
            for (int i = start.x; i <= end.x; i++) {
                c.x = i;
                if(black(c)){
                    System.out.print('B');
                } else {
                    System.out.print('W');
                }

                if (i == end.x) {
                    System.out.println();
                }
            }
        }
    }



}
