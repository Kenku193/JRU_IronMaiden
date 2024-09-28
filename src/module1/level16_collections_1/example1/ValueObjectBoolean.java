package module1.level16_collections_1.example1;

public class ValueObjectBoolean {
    private Boolean value;

    public ValueObjectBoolean(Boolean value) {
        this.value = value;
    }

    public Boolean getValue() {
        return value;
    }

    public void setValue(Boolean value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "ValueObjectBoolean{" +
                "value=" + value +
                '}';
    }
}
