package module1.level03_ifs;

import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        System.out.println("Hello! Please enter your name:");
        String name = console.nextLine();
        System.out.println("Please enter your age:");

        int age = console.nextInt();
        // 999 < 18
        if (age < 18) {
            System.out.println(name + " oh no, age is too young!");
        }
        else {
            System.out.println(name + " it's ok, go ahead");
        }

        System.out.println("Bye!");

    }
}


