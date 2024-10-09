package module1.level20_exceptions_1;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) throws RuntimeException, Error {

        System.out.println("НАЧАЛО РАБОТЫ ПРИЛОЖЕНИЯ");
        System.out.println("ВВЕДИТЕ ДВА ЧИСЛА ДЛЯ ДЕЛЕНИЯ");
        Scanner console = new Scanner(System.in);

        Integer divisionResult = division(console.nextLine(), console.nextLine());

        // ПРОДОЛЖАЕТ РАБОТАТЬ
        System.out.println("КОНЕЦ РАБОТЫ ПРИЛОЖЕНИЯ");
    }
    private static Integer division(String left, String right) throws RuntimeException, Error {
        Integer result = null;
        try {
            result = Integer.parseInt(left) / Integer.parseInt(right);
        } catch (NumberFormatException e) {
            System.out.println("ВОЗНИКЛА ПРОБЛЕМА С ФОРМАТОМ ВВОДА");
        } catch (ArithmeticException e) {
            System.out.println("ВОЗНИКЛА ПРОБЛЕМА С ДЕЛЕНИЕМ НА 0");
        } finally {
            System.out.println("Я КОД ИЗ БЛОКА Finally");
            return result;
        }
    }

}
