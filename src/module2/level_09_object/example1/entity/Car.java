package module2.level_09_object.example1.entity;

public class Car extends Object {

    public String model;
    public Integer power;
    public Engine engine;

    public Car(String model, Integer power, Engine engine) {
        this.model = model;
        this.power = power;
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", power=" + power +
                ", engine=" + engine +
                '}';
    }
}
