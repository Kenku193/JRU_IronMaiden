package module1.level11_oop;

public class Example {
    public static void main(String[] args) {

        long a = 1038238932L;
        int b = 1038238932;
        Integer s = new Integer(90); // УСТАРЕВШЕЕ - НО ЛУЧШЕ НЕ ИСПОЛЬЗОВАТЬ
        Integer x = 10;

        String m = new String("some text");

        char c = ';';

        doNothing(90); // doNothing(int a){}
        doNothing(90L); // doNothing(long a){}

        System.out.println(Integer.BYTES);

    }

    public static void doNothing(int a){}
    public static void doNothing(long a){}
}
