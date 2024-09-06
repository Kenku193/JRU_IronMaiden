package module1.level09_methods_part_2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Example10 {
    public static void main(String[] args) {

        String s1 = new String("АБВГД");
        String s2 = new String("абвгд");

        System.out.println(s1 == s2);

        System.out.println("По содержимому равны? " + s1.equals(s2));
        System.out.println("По содержимому равны игнорируя регистр? " + s1.equalsIgnoreCase(s2));
        System.out.println("Compare - лексиграфически " + s1.compareTo(s2));
        System.out.println("Compare - лексиграфически " + s1.compareToIgnoreCase(s2));

        String m = "Привет! Я Юра";

        System.out.println(m.startsWith("Привет!"));
        System.out.println(m.endsWith("Пока!"));

        String[] strings = {"Текст", "Буква", "Ясно", "Алеша"};
        System.out.println(Arrays.toString(strings));
        Arrays.sort(strings);
        System.out.println(Arrays.toString(strings));

    }
}
