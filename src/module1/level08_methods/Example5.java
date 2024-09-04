package module1.level08_methods;

import java.util.Arrays;

public class Example5 {
    public static void main(String[] args) {

        fill(20);
        fill(1,2,3,4);
        fill();

    }

    public static void fill(int a, int b, int c, int d) { // Signature - ПОДПИСЬ - УНИКАЛЬНЫЙ ИДЕНТИФИКАТОР
        System.out.println(a + b + c + d);
    }

    public static void fill(String a){

    }

    public static void fill(int a){
        System.out.println(a);
    }

    public static void fill(){
    }

}
