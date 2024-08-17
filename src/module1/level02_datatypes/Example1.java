package module1.level02_datatypes;

public class Example1 {
    public static void main(String[] args) {

        byte b = 10; // 1 BYTE
        System.out.println(Byte.MIN_VALUE);
        System.out.println(Byte.MAX_VALUE);

        short s = 10; // 2 BYTE
        System.out.println(Short.MIN_VALUE);
        System.out.println(Short.MAX_VALUE);

        int i = 10; // 4 BYTE
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);

        long l = 10L; // 8 BYTE
        System.out.println(Long.MIN_VALUE);
        System.out.println(Long.MAX_VALUE);

        float f = 29.8F; // 0.298 * 10 * 10 = 29.8
        double d = 2.4;
        System.out.println(f);

        // 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 = 0.9999999999999999
    }
}
