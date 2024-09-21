package module1.level13_classesAndStatic;


import java.util.HashMap;

public class Auto {

    String color;
    double power;
    double volume;
    String model;

    static int count;

    public void honk() {
        System.out.println("Beeep beeep!");
    }

    public static void someMethod() {
        System.out.println("Я статический метод класса автомобиль");
    }

    public Auto(String color, double power, double volume, String model) {
        this.color = color;
        this.power = power;
        this.volume = volume;
        this.model = model;
        count++;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "color='" + color + '\'' +
                ", power=" + power +
                ", volume=" + volume +
                ", model='" + model + '\'' +
                '}';
    }
    static class ManufacturerAddress {
        static String address = "Автомобильная, 1";

        public void makeReceipt(){
            System.out.println("Произведен авто, завод находится по адресу " + address);
        }
    }

}

class Application {

    public static void main(String[] args) {

        Auto auto1 = new Auto("Yellow", 100.0, 1500.0, "Honda");
        Auto auto2 = new Auto("Green", 150.0, 2000.0, "VW");
        Auto auto3 = new Auto("White", 500.0, 0.0, "Tesla");

        System.out.println(auto1);
        System.out.println(auto2);
        System.out.println(auto3);
        System.out.println("Всего машин создано: " + Auto.count);

        auto1.honk();
        auto2.honk();
        auto3.honk();

        Auto.someMethod();

        // ВОТ ЗДЕСЬ ОСТОРОЖНЕЕ!
        // Application.main(new String[]{});

        auto1.someMethod(); // НЕПОСРЕДСТВЕННЫЙ ВЫЗОЗ У ОБЪЕКТА? НЕТ! ВЫЗОВ ПРОИЗВОДИТСЯ НА КЛАССЕ!

        Class<? extends Auto> aClass = auto1.getClass(); // ОБЪЕКТ КТО ТЫ?
        System.out.println(aClass);

        Auto.someMethod();

        System.out.println(Auto.ManufacturerAddress.address);

        Auto.ManufacturerAddress manufacturerAddress = new Auto.ManufacturerAddress();
        manufacturerAddress.makeReceipt();

    }
}

class Display{

    static {}

    static String name;

    int h;
    int w;

    Pixel[][] pixels;

    public Display(int h, int w) {
        this.h = h;
        this.w = w;
    }

    class Pixel{
        double color;
    }

}
