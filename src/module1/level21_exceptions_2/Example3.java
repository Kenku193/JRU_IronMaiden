package module1.level21_exceptions_2;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.net.SocketException;


public class Example3 {
    public static void main(String[] args) {

        MyClassForFileReadingExample3 fr = new MyClassForFileReadingExample3();
        try {
            fr.myFileReader("/Users/mentor/Desktop/example.sh");
        }
        catch (FileNotFoundException | SocketException e){

        }

    }

}

class MyClassForFileReadingExample3 {
                                                    // ПРОВЕРЯЕМОЕ           ПРОВЕРЯЕМОЕ      НЕ ПРОВЕРЯЕМОЕ
    public void myFileReader(String filePath) throws FileNotFoundException, SocketException, ArithmeticException {
            FileReader fileReader = new FileReader(filePath);
    }
}
