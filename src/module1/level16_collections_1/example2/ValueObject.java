package module1.level16_collections_1.example2;

public class ValueObject<T> {

    private T value;

    public ValueObject(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "ValueObject{" +
                "value=" + value +
                '}';
    }
}
