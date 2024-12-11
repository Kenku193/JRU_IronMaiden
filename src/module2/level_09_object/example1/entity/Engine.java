package module2.level_09_object.example1.entity;

public class Engine {

    int engineNumber;

    public Engine(int engineNumber) {
        this.engineNumber = engineNumber;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "engineNumber=" + engineNumber +
                '}';
    }
}
