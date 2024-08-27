package module1.level06_arrays;

import java.util.Arrays;

public class Example4 {
    public static void main(String[] args) {

        int[] ints = new int[5];

        ints[0] = 101;
        ints[1] = 202;
        ints[2] = 303;
        ints[3] = 404;
        ints[4] = 505;

        System.out.println(Arrays.toString(ints));

        ints[0] = -100;
        ints[4] = -100;

        System.out.println(Arrays.toString(ints));

        ints[4] = ints[4] * -1;

        System.out.println(Arrays.toString(ints));


    }
}
