import java.util.Arrays;

public class Q23Rand7 {
    /**
     * Implement a method Rand7 given Rand5.
     * That is, given a method that generates a number
     * 0 through 4 inclusive,write a method that
     * generates an integer 0 through 6(inclusive).
     */

    public static int rand7() {
        int randy = rand5() * 5 + rand5();
        while(randy>=21) {
            randy = rand5() * 5 + rand5();
        }
        return randy % 7;
    }

    public static int rand5(){
        return (int) (Math.random() * 100) % 5;
    }

    public static void main(String[] args) {
        int[] array = new int[7];
        for (int i = 0; i < 700000; i++) {
            array[rand7()] += 1;
        }

        System.out.println(Arrays.toString(array));
    }
}
