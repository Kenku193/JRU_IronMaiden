package module1.level19_singletoneSwitchEnum.enumeration;

import java.util.Scanner;

public class App2 {
    public static void main(String[] args) {

        Car bmw = new Car("BMW", 300.0, Color.GREEN);
        Car tesla = new Car("Tesla", 1000.0, Color.SILVER);
        Car vw = new Car("VW", 3000.0, Color.GREY);

        // !!!
//        Scanner console = new Scanner(System.in);
//        Car toyota = new Car("Toyota", 0.0, Color.valueOf(console.nextLine()));

        Color[] brightColors = Color.getBrightColors();
        for (Color color : brightColors) {
            System.out.println(color);
        }

    }
}
