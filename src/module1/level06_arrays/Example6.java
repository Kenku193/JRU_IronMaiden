package module1.level06_arrays;

import java.util.Arrays;

public class Example6 {
    public static void main(String[] args) {

        int[] ints = new int[50]; // 0

        for (int i = 0; i < ints.length; i++) {
            ints[i] = i * 5;
        }
        System.out.println(Arrays.toString(ints));

        double[] doubles = new double[50];

        for (int i = 0; i < doubles.length; i++) {
            doubles[i] =  i / 2.0;
        }

        System.out.println(Arrays.toString(doubles));

    }
}
