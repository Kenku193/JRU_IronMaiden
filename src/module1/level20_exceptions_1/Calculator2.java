package module1.level20_exceptions_1;

import java.util.Scanner;

public class Calculator2 {

    public static void main(String[] args) throws RuntimeException, Error {

        System.out.println("НАЧАЛО РАБОТЫ ПРИЛОЖЕНИЯ");
        System.out.println("ВВЕДИТЕ ДВА ЧИСЛА ДЛЯ ДЕЛЕНИЯ");
        Scanner console = new Scanner(System.in);

        System.out.println(division(console.nextLine(), console.nextLine()));

        // ПРОДОЛЖАЕТ РАБОТАТЬ
        System.out.println("КОНЕЦ РАБОТЫ ПРИЛОЖЕНИЯ");

    }


    private static int division(String left, String right) throws RuntimeException, Error {
        int result = Integer.MIN_VALUE;
        try {
            result = Integer.parseInt(left) / Integer.parseInt(right);
        } catch (ArithmeticException | IllegalArgumentException e) {
            System.out.println("ВОЗНИКЛА ПРОБЛЕМА");
        } finally {
            System.out.println("Я КОД ИЗ БЛОКА Finally");
            return result;
        }
    }

}
