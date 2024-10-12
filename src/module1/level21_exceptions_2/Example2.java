package module1.level21_exceptions_2;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Example2 {
    public static void main(String[] args) {

        MyClassForFileReadingExample2 fr = new MyClassForFileReadingExample2();
            fr.myFileReader("/Users/mentor/Desktop/example.sh");
    }

}

class MyClassForFileReadingExample2 {
    public void myFileReader(String filePath) throws MyFileException {
        try {
            FileReader fileReader = new FileReader(filePath);
        }
        catch (FileNotFoundException e){
            throw new MyFileException(e.getMessage());
        }

    }
}
