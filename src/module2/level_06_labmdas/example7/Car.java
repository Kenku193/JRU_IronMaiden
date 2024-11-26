package module2.level_06_labmdas.example7;

public class Car {

    Color color;
    String brandName;
    int power;
    int year;

    public Car(Color color, String brandName, int power, int year) {
        this.color = color;
        this.brandName = brandName;
        this.power = power;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color=" + color +
                ", brandName='" + brandName + '\'' +
                ", power=" + power +
                ", year=" + year +
                '}';
    }
}
