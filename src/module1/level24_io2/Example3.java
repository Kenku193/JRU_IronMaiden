package module1.level24_io2;

import java.io.*;
import java.util.ArrayList;

public class Example3 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        try (DataInputStream dataInputStream = new DataInputStream(new BufferedInputStream(new FileInputStream("data_2.dat")))) {

            while (dataInputStream.available() > 0){
                                     // readInt();
                int i = dataInputStream.readByte();
                list.add(i);
            }

        } catch (
                IOException e) {
            e.printStackTrace();
        }

        System.out.println(list);

    }


}

