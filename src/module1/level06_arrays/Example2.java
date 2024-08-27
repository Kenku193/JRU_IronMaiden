package module1.level06_arrays;

import java.util.Arrays;

public class Example2 {
    public static void main(String[] args) {

        int[] array = new int[10]; // 0
        boolean[] booleans = new boolean[5]; // false
        String[] strings = new String[10]; // null
        char[] chars = new char[4]; // пустой символ
        double[] doubles = new double[9]; // 0.0

        System.out.println(array);
        System.out.println(booleans);
        System.out.println(strings);
        System.out.println(chars);
        System.out.println(doubles);

        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(booleans));
        System.out.println(Arrays.toString(strings));
        System.out.println(Arrays.toString(chars));
        System.out.println(Arrays.toString(doubles));


    }
}
