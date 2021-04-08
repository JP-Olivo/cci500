import java.util.Arrays;

public class Q24PairsWSum {
    /*
    Design an algorithm to find all pairs of integers within
    an array which sum to a specified int.
     */

    public static int pairwithsum(int[] array, int target) {
        Arrays.sort(array);
        //Use this to iterate through array from start to end;
        int forward = 0;
        //Use this to iterate through array from end to start;
        int backward = array.length-1;
        int total = 0;

        while(forward<backward) {
            if(array[backward] > (target - array[forward])) {
                backward--;
                //if we fine a pair;
            } else if((array[backward] == (target - array[forward]))) {
                System.out.println(array[forward] + " " + array[backward]);
                total++;
                backward--;

            } else if((array[backward] < (target - array[forward]))) {
                forward++;
            }
        }
        return total;
    }

    public static void main(String[] args) {
        int[] array = new int[]{1,2,3,4,5,6,7};

        pairwithsum(array,10);
    }
}
