import java.util.Arrays;

public class Q21SumSwap {

    //Given two arrays of integers, find a pair of values
    //(one value from each array) that you can swap to give the two
    //arrays the same sum.
    public static Coordinate sumswap(int[] array1, int[] array2) {
        Arrays.sort(array1);
        Arrays.sort(array2);
        //sums of arrays
        int suma1 = sumarrray(array1);
        int suma2 = sumarrray(array2);
        //Diff in array sums;
        if ((suma1-suma2) % 2 != 0) return null;
        int diff = (suma1-suma2)/2;
        int a1 = 0;
        int a2 = 0;

        while(a1< array1.length && a2 < array2.length) {
            System.out.println(array1[a1] + " " + array2[a2]);
            if(array1[a1] - array2[a2] == diff) {
                return new Coordinate(array1[a1],array2[a2]);
            } else if((array1[a1] -array2[a2]) > diff) {
                a2++;
            } else {
                a1++;
            }
        }

        return null;



    }
    //Summs all elements inside an array
    public static int sumarrray(int[] array) {
        int sum = 0;
        for(int i: array) {
            sum+=i;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] a1 = new int[]{1,2,5,6};
        int[] a2 = new int[]{1,4,8,9};
        System.out.println(sumswap(a1,a2).toString());
    }
}
