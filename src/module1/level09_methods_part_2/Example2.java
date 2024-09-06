package module1.level09_methods_part_2;

public class Example2 {
    public static void main(String[] args) {
        // КОНСТАНТНОЙ БУДЕТ ССЫЛКА А НЕ ОБЪЕКТ
        final String s = "Текст";

        final double PI = 3.1415926563;
        double r = 23.8;

        System.out.println(PI * r * r);

        System.out.println(Example3.selectAllFromTableQuery);

    }
}
