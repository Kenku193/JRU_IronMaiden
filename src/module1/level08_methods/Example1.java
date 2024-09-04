package module1.level08_methods;

import java.util.Arrays;

public class Example1 {

    public static void main(String[] args) {

        // ВЫЗОВ МЕТОДА
        myMethod1();
        myMethod2();

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

    }

    // ОБЪЯВЛЕНИЕ МЕТОДА
    public static void myMethod1(){
        int i = 1;
        System.out.println(i + " from method 1");
    }

    public static void myMethod2(){
        int i = 2;
        System.out.println(i + " from method 2");
    }

}
