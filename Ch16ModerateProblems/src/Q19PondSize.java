
import java.util.ArrayList;
import java.util.Arrays;

public class Q19PondSize {
    public static ArrayList<Integer> pondsize(int[][] pond) {
        boolean[][] pb = new boolean[pond.length][pond[0].length];
        ArrayList<Integer> psizes = new ArrayList<>();

        for(int i = 0; i < pond.length; i++ )  {
            for(int j = 0; j < pond[0].length; j++) {

                System.out.println(Arrays.toString(pb[0]));
                if ((pond[i][j] == 0) && !pb[i][j]) {
                    System.out.println(i + " " + j);
                    psizes.add(countzeros(pond,pb,i,j));
                }

            }
        }
        return psizes;
    }

    public static int countzeros(int[][] pond, boolean[][] pb, int x, int y) {

        if(x<0 || y<0 || x > pond.length-1 || y > pond[0].length-1 || pond[x][y] != 0 || pb[x][y]) {
            return 0;
        } else {

            pb[x][y] = true;
            int zeros = 1;
            for(int i = -1; i < 2; i++) {
                for(int j = -1; j < 2; j++) {
                    if(j!=0 || i!=0) {
                    zeros += countzeros(pond,pb,x+i,y+j);
                    }
                }
            }
            return zeros;
        }



    }

    public static void main(String[] args) {
        int[][] pond = {
                {1,0,1,0,1},
                {0,1,0,1,1},
                {1,1,1,1,0},
                {1,0,0,1,0},
                {1,1,1,1,0}
        };

        System.out.println(pondsize(pond).toString());
    }
}
