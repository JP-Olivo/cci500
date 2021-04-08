public class Q16SubSort {

    /*
    Given an array of integers, write a method to find indices
    m and n such that if you sorted elements m through n, the
    entire array would be sorted. Minimize m-n(find smallest of
    such sequence)
     */

    public static Coordinate subsort(int[] array) {
        int n=0;
        int m=0;
        boolean foundn = false;
        boolean foundm = false;
        for(int i=0; i < array.length; i++) {
            for(int j=i+1; j < array.length; j++) {
                if(array[i] > array[j] && !foundn) {
                    n = i;
                    foundn = true;
                }

                if(array[array.length-1 - i] < array[j] &&
                   !foundm) {
                    m = array.length - 1 - i;
                    foundm = true;
                }

                if(foundm && foundn) return new Coordinate(n,m);
            }
        }
        return new Coordinate(n,m);

    }
    //better subsort;
    public static Coordinate betterss(int[] array) {
        int n = 0;
        int m = array.length;

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        //find n;
        for(int i = array.length - 1; i >=0; i--) {
            if(!(array[i] < min)) {
                n = i;
            } else {
                min = array[i];
            }
        }

        //find m
        for(int j = n; j < array.length; j++) {
            if(!(array[j] > max)) {
                m = j;
            } else {
                max = array[j];
            }
        }
        return new Coordinate(n,m);
    }

    public static void main(String[] args) {
        int[] array = new int[]{-1,6,4,5,2,7};
        System.out.println(subsort(array).toString());
        int[] array2 = new int[]{3,-1,6,4,5,2,7};
        System.out.println(betterss(array2).toString());
        String g = "juan";
        System.out.println(g.length());
    }
}
