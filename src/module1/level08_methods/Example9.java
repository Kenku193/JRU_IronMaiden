package module1.level08_methods;

public class Example9 {
    public static void main(String[] args) {

        String[] strings = {"first", "second", "third"};

        String s = new String();

        for (int i = 0; i < strings.length; i++) {
            s = s + strings[i]; // ПАМЯТЬ БУДЕТ КИПЕТЬ
            // ЧИТАЕМ ПРО StringBuilder
        }

        System.out.println(s);


    }
}
