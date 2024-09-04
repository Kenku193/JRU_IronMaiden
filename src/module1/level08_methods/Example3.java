package module1.level08_methods;

import java.util.Arrays;
import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) { //arguments

        System.out.println(Arrays.toString(args));

        multiplyer(10, 10);
        multiplyer(9, 87);
        multiplyer(2, -887);

        Scanner console = new Scanner(System.in);
      //  int a = console.nextInt();
      //  int b = console.nextInt();

        multiplyer(console.nextInt(), console.nextInt());

    }

    public static void multiplyer(int first, int second){
        int a = first * second;
        System.out.println(a);
    }

}
