package module1.level24_io;

import java.io.*;
import java.util.Arrays;

public class Example1 {
    public static void main(String[] args) {
                                                        // ВОТ ОТСЮДА ПОНЯТНО ОТКУДА ПРОИЗВОДИТСЯ ЧТЕНИЕ
        try { InputStream inputStream = new FileInputStream("src/module1/level24_io/input.txt");

            int available = inputStream.available();
            System.out.println("Кол-во входящих байт: " + available);

            byte[] array = new byte[available];

            // А В МЕТОД READ Я ДОЛЖЕН ПЕРЕДАТЬ УКАЗАНИЕ НА ТО МЕСТО куда ЧИТАЕМ ИЗ ИСТОЧНИКА
            inputStream.read(array);

            System.out.println("Прочитанная информация");
            System.out.println(Arrays.toString(array));

            String s = new String(array);
            System.out.println(s);

            // ЗАКРЫТЬ ПОТОК (ЗАКРЫТЬ СОЕДИНЕНИЕ, ПОЛОЖИТЬ ТРУБКУ)
            inputStream.close();

        }
        catch (FileNotFoundException e){
            System.out.println("Файл не найден!");
        }
        catch (IOException e){
            throw new RuntimeException(e);
        }
    }
}
