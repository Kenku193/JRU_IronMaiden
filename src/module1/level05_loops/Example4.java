package module1.level05_loops;

public class Example4 {
    public static void main(String[] args) {

        for (int i = 2000; i>0; i=i-2) {
            System.out.println(i);
            if (i == 1000){
                break;
            }
        }

    }
}
