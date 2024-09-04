package module1.level08_methods;

public class Example4 {
    public static void main(String[] args) {

        String s = "Иван";
        int a = 20;
        prnt(s, a);

    }

    public static void prnt(String s, int a){
        for (int i = 0; i < a; i++) {
            System.out.println(s);
        }
    }
}
