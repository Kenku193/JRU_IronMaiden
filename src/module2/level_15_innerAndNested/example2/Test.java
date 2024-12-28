package module2.level_15_innerAndNested.example2;

import java.util.LinkedList;

public class Test {
    public static void main(String[] args) {

        Bicycle peugeot = new Bicycle("Peugeot", 120, 2222, 5);

        Bicycle.HandleBar handleBar = peugeot.new HandleBar();
        Bicycle.Seat seat = peugeot.new Seat();

        Bicycle.Pump pump = new Bicycle.Pump();
        pump.pumpIt();

        seat.getDiameter();

        System.out.println(peugeot);
        System.out.println(seat.b);

        seat.getSeatParam();

        seat.up();
        peugeot.start();
        handleBar.left();
        handleBar.right();


        System.out.println(Bicycle.Seat.x);
        Bicycle.Seat.up();

        Bicycle.Pump p = new Bicycle.Pump();
        System.out.println(Bicycle.b);


    }
}
