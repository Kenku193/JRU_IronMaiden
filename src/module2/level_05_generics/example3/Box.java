package module2.level_05_generics.example3;

public class Box<T extends Animal> {

    private T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
