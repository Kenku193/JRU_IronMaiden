package module2.level_09_object.example2;

import java.util.HashMap;

public class App2  {
    public static void main(String[] args) throws CloneNotSupportedException {

        Car original = new Car("Toyota", 90, new Engine(98765));

        Car clone = (Car) original.clone();
        
        System.out.println(original);
        System.out.println(clone);

        System.out.println("-".repeat(100));

        System.out.println(original.equals(clone));

    }
}
