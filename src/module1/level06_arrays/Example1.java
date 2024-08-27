package module1.level06_arrays;

import java.util.Scanner;

public class Example1 {

    public static void main(String[] args) {

        // IMMUTABLE for SIZE - неизменны по размеру
        // MUTABLE for VALUE - могут менять содержимое

        int[] array = new int[10]; // 4*10+
        boolean[] booleans = new boolean[5]; //
        String[] strings = new String[10];
        char[] chars = new char[4];
        double[] doubles = new double[9];


        int[] array2 = new int[50]; // 4*50+
        int x;
        Scanner console = new Scanner(System.in);
        x = console.nextInt();
        int[] array3 = new int[x];


    }
}
