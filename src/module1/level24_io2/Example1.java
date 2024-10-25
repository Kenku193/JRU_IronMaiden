package module1.level24_io2;

import java.io.*;

public class Example1 {
    public static void main(String[] args) {

        try {
            DataOutputStream dataOutputStream = new DataOutputStream(
                    new BufferedOutputStream(
                            new FileOutputStream("data.dat")));

//            dataOutputStream.writeInt(10);
//            dataOutputStream.writeInt(10);

            dataOutputStream.writeInt(90 + (89<<8) + (88<<16) + (87<<24));
            dataOutputStream.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
