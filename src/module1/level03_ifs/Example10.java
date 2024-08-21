package module1.level03_ifs;

public class Example10 {
    public static void main(String[] args) {

        int age = 25;
        int money = age > 30 ? 100 : 50;

        System.out.println(money);

        int temp = 1;
        int a = temp < 30 ? (100 + 888) : (50 / 2);
        System.out.println(a);

    }
}
