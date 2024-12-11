package module2.level_09_object.example2;

public class Engine {

    int engineNumber;

    public Engine(int engineNumber) {
        this.engineNumber = engineNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Engine engine = (Engine) o;

        return engineNumber == engine.engineNumber;
    }

    @Override
    public int hashCode() {
        return engineNumber;
    }
}
