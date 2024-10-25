package module1.level23_io;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class Example2 {
    public static void main(String[] args) {
        try {
            InputStream inputStream = System.in;
            System.out.println(inputStream.available());

            byte[] bytes = new byte[40];
            System.out.println(Arrays.toString(bytes));

            inputStream.read(bytes);

            System.out.println(Arrays.toString(bytes));
            // ЧТО ЗА 10 ОКАЗЫВАТСЯ В МАССИВЕ?

            inputStream.close();

        }
        catch (IOException e){
            System.out.println("Не удалось прочитать");
        }


    }
}
