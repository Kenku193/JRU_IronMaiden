package module1.level11_oop;

public class Example7 {
    public static void main(String[] args) {

        int a;
        char c = 'p';

        a = c;

        System.out.println(a);

        long t = 198;
        byte b; // -128 -127 -126 -125 ... 0 ... 127

        b = (byte) t;

        System.out.println(b);

        char u = 0;
        for (int i = 0; i < 65536; i++) {
            u = (char) i;
            System.out.println(i + " " + u);
        }

    }
}
