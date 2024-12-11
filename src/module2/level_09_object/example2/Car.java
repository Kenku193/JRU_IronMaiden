package module2.level_09_object.example2;

import java.util.Objects;

public class Car extends Object implements Cloneable {

    public String model;
    public Integer power;
    public Engine engine;


    public Car(String model, Integer power, Engine engine) {
        this.model = model;
        this.power = power;
        this.engine = engine;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        if (!Objects.equals(model, car.model)) return false;
        if (!Objects.equals(power, car.power)) return false;
        return Objects.equals(engine, car.engine);
    }

    @Override
    public int hashCode() {
        int result = model != null ? model.hashCode() : 0;
        result = 31 * result + (power != null ? power.hashCode() : 0);
        result = 31 * result + (engine != null ? engine.hashCode() : 0);
        return result;
    }

//    @Override
//    protected Object clone() throws CloneNotSupportedException {
//        return super.clone();
//    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new Car(new String(this.model), new Integer(this.power), new Engine(this.engine.engineNumber));
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
