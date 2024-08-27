package module1.level06_arrays;

public class Example5 {
    public static void main(String[] args) {
        //             0  1   2    3    4    5     6    7
        int[] array = {1, 10, 99, 100, -12, 90/2, 6*6};

        int length = array.length;
        System.out.println("Длина массива: " + length);

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        // Error - ОШИБКА
        // Exception - ИСКЛЮЧЕНИЕ

    }
}
