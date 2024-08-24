package module1.level05_loops;

public class Example6 {
    public static void main(String[] args) {

        int i = 1;

        while (i <= 20){
            if (i % 6 == 0){ // 6 % 6 == 0
                i++;
                continue;
            }
            System.out.println(i);
            i++;
        }

    }
}
