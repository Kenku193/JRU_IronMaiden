package module2.elective_01_streamApi;

import module2.level_06_labmdas.example7.Color;

public class Car {

    String brandName;
    String color;

    public Car( String brandName, String color) {
        this.color = color;
        this.brandName = brandName;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", brandName='" + brandName + '\'' +
                '}';
    }
}
