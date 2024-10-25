package module1.level23_io;

import java.io.*;

public class Example5 {
    public static void main(String[] args) throws IOException, InterruptedException {

        OutputStream outputStream = new FileOutputStream("src/module1/level24_io/output.txt");
        byte[] bytes = {72, 101, 108, 108, 111, 32, 74, 97, 118, 97, 82, 117, 115, 104};
        outputStream.write(bytes);
        outputStream.close();

        Writer writer = new FileWriter("src/module1/level24_io/outputFromString.txt");
        String s = "Pied Piper";
        writer.write(s);
        writer.close();

    }
}
