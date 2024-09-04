package module1.level08_methods;

import java.util.Arrays;
import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {

        int[] counts = fill(); // ???

        printOut(counts);

    }

    private static void printOut(int[] c) {
        // ВЫВОДИМ ОЦЕНКИ
        System.out.println("Оценки:");
        System.out.println(Arrays.toString(c));
    }

    private static int[] fill() { // МОГУТ ЧТО-ТО ВОЗВРАЩАТЬ - КАКИЕ-ТО РЕЗУЛЬТАТЫ СВОЕЙ РАБОТЫ
        // ЗАПОЛНЯЕМ ОЦЕНКИ
        Scanner console = new Scanner(System.in);
        int[] counts = new int[5];
        for (int i = 0; i < counts.length; i++) {
            System.out.println("Введите оценку №" + (i+1) + ":");
            counts[i] = Integer.parseInt(console.nextLine());
        }
        return counts;
    }
}
