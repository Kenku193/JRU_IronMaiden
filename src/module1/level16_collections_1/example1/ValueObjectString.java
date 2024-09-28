package module1.level16_collections_1.example1;

public class ValueObjectString {
    private String value;

    public ValueObjectString(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "ValueObjectString{" +
                "value='" + value + '\'' +
                '}';
    }
}
