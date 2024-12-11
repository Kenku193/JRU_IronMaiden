package module2.level_09_object.example1;

import module2.level_09_object.example1.entity.Car;
import module2.level_09_object.example1.entity.Engine;

public class App1 extends Object {

    public static void main(String[] args) {

        Engine engine1 = new Engine(109087);
        Engine engine2 = new Engine(987331);

        Car car1 = new Car("VW", 150, engine1);
        Car car2 = new Car("BMW", 5, engine2);

        Car car3 = new Car("Mercedes", -1, new Engine(8));

        // !!!
        Car car4 = new Car(null, null, null);

        Engine engine3 = car3.engine;

        String carString = car1.toString();
        System.out.println(carString);

        String car4String = car4.toString();
        System.out.println(car4String);

    }

}
