package module2.level_09_object.example2;

public class App1 extends Object {
    public static void main(String[] args) {

        Integer a = new Integer(999);
        Integer b = new Integer(999);

        System.out.println(a.equals(b));
        System.out.println(a == b);

        System.out.println("-".repeat(100));

        Car car1 = new Car("VW", 150, new Engine(98));
        Car car2 = new Car("VW", 150, new Engine(98));

        System.out.println(car1.equals(car2));


    }
}
