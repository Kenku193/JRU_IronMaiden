package module1.level05_loops;

public class Example7 {
    public static void main(String[] args) {

        int i = 0;

        while (true) {
            ++i;
            if (i == 1000) break;
            if (i % 2 == 0) continue;
            System.out.println(i);
        }

    }
}
