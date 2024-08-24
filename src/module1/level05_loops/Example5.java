package module1.level05_loops;

import java.util.Scanner;

public class Example5 {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        String s;

        do {
            System.out.println("Произведите ввод:");
            s = console.nextLine();
        }
        while (!s.equals("exit"));

    }
}
