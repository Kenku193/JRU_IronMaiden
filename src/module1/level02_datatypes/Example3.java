package module1.level02_datatypes;

import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        String s = console.nextLine();

        int i = Integer.parseInt(s);

        System.out.println("Было получено " + s);
        System.out.println("Было преобразовано в число " + i);


    }
}
