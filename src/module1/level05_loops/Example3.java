package module1.level05_loops;

import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {
//
        Scanner console = new Scanner(System.in);

//        System.out.println("I multiply your number by 2!");
//        Scanner console = new Scanner(System.in);
//        while (true) {
//            System.out.println("Enter a number:");
//            if (console.hasNextInt()) {
//                int i = console.nextInt();
//                System.out.println(i * 2);
//            } else {
//                String input = console.nextLine();
//                if (input.equalsIgnoreCase("exit")) {
//                    break;
//                }
//                else {
//                    System.out.println("Invalid input. Please enter an integer or type 'exit' to quit.");
//                }
//            }
//        }
//        console.close();

        System.out.println("Умножу на 2 твое число");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Input a number");
            boolean d = scanner.hasNextInt(); // 50 ЦИФРЫ -> ОНИ МОГУТ СТАТЬ Int (ЧИСЛОМ) -> ЗНАЧИТ true
            String s = scanner.nextLine(); // ЗАПИСЫВАЕМ ДАННЫЕ СРАЗУ В СТРОКОВУЮ ПЕРЕМЕННУЮ 50

            // ПРОВЕРКА 1
            if (d) { // true
                int x = Integer.parseInt(s);
                System.out.println(x);
            }

            // ПРОВЕРКА 2
            if (s.equals("exit")) { // 50 СРАВНИВАЮТСЯ С exit
                break;
            }
        }

    }
}
