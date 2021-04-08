import java.util.Arrays;

public class Q17ContigousSequence {

    /* you are given an array of integer(both pos and neg).
       Find the contiguous sequence with the largest sum.
       */



    public static int[] contiguoussequence(int[] array) {
        int start = 0;
        int tempstart = 0;
        int end = array.length - 1;

        int sum = 0;
        int max = 0;
        if(allpositive(array)) {
            return array;
        } else {
            for(int i = 0; i < array.length; i++) {
                System.out.println(start);
                sum+= array[i];
                if(sum > max) {
                    max = sum;
                    start = tempstart;
                    end = i;
                } else if (sum < 0) {
                    if((sum - array[i]) > max) {
                        max = (sum - array[i]);
                        start = tempstart;
                        end =  i;
                    }
                    sum = 0;
                    tempstart = i + 1;
                }

            }
        }
        int[] res = new int[(end - start) + 1];
        for(int i = start; i <= end; i++) {
            res[i - start] = array[i];
        }
        return res;

    }
    //returns true if all ints in an array are positive
    public static boolean allpositive(int[] array) {
        for(int i:array) {
            if(i < 0) return false;
        }

        return true;
    }

    public static void main(String[] args) {
        int[] array = new int[]{-1,3,4,5,-3,1};
        int[] ans = contiguoussequence(array);
        for(int i:ans) {
            System.out.print(i + " ");
        }

    }

}
