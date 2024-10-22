package module1.level25_io2;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.ThreadLocalRandom;

public class Example2 {
    public static void main(String[] args) {

        try {
            DataOutputStream dataOutputStream = new DataOutputStream(
                    new BufferedOutputStream(
                            new FileOutputStream("data_2.dat")));

            for (int i = 0; i < 100; i++) {
                ThreadLocalRandom random = ThreadLocalRandom.current();
                int value = random.nextInt(1000);
                dataOutputStream.write(value);
            }

            dataOutputStream.close();


        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
