package module1.level21_exceptions_2;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Example6 {
    public static void main(String[] args) {
//        FileReader fileReader = new FileReader("/Users/mentor/Desktop/file.txt");
//        FileWriter fileWriter = new FileWriter("/Users/mentor/Desktop/file_copy1.txt");
//        try {
//            while (fileReader.ready()) {
//                int symbol = fileReader.read();
//                fileWriter.write(symbol);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            fileReader.close();
//            fileWriter.close();
//        }

        // TRY С РЕСУРСАМИ (ДЛЯ РЕСУРСОВ)
        try (FileReader fileReader = new FileReader("/Users/mentor/Desktop/file.txt");
             FileWriter fileWriter = new FileWriter("/Users/mentor/Desktop/file_copy1.txt")) {
            while (fileReader.ready()) {
                int symbol = fileReader.read();
                fileWriter.write(symbol);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
