package module1.level24_io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;

public class Example3 {
    public static void main(String[] args) {

        try{
            Reader reader = new FileReader("src/module1/level24_io/input.txt");
            System.out.println("Есть ли что-то в потоке? ->>> " + reader.ready());

            char[] chars = new char[10];

            reader.read(chars);

            System.out.println("Результат:");
            System.out.println(Arrays.toString(chars));

            reader.close();

        }
        catch (FileNotFoundException e){
            System.out.println("Файл не найден!");
        }
        catch (IOException e){
            throw new RuntimeException(e);
        }

    }
}
