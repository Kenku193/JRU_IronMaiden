package module1.level24_io;

import java.io.*;

public class Example4 {
    public static void main(String[] args) throws IOException {

        // PATTERN DECORATOR
        FileInputStream fileInputStream = new FileInputStream("src/module1/level24_io/input.txt");
        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        System.out.println(bufferedReader.readLine());
        System.out.println(bufferedReader.readLine());

        System.out.println("-".repeat(100));

        BufferedReader bufRd = new BufferedReader(new InputStreamReader(System.in));
        String s1 = bufRd.readLine();
        String s2 = bufRd.readLine();
        String s3 = bufRd.readLine();

        System.out.println(s1 + " " + s2 + " " + s3);

    }
}
