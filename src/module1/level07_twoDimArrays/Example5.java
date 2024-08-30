package module1.level07_twoDimArrays;

import java.util.Arrays;

public class Example5 {
    public static void main(String[] args) {

        int[] ints = {1,2,3,4,5,6,7};
        System.out.println(Arrays.toString(ints));


        int[][] months = {
                {101, 102},
                {201, 202, 203},
                {301, 302, 303, 304, 306},
                {401}
        };

        // ГЛУБИНА Я НЕ ТВОЙ)))
        System.out.println(Arrays.deepToString(months));

    }
}
