package module2.level_04_interfaces.entity;

import module2.level_04_interfaces.contracts.Drivable;
import module2.level_04_interfaces.contracts.Movable;
import module2.level_04_interfaces.contracts.Stopable;

public class Boat implements Drivable, Stopable, Movable {
    @Override
    public void goStraight() {
        System.out.println("Лодка плывет вперед");
    }

    @Override
    public void goBack() {
        System.out.println("Лодка плывет назад");
    }

    @Override
    public void goLeft() {
        System.out.println("Лодка плывет налево");
    }

    @Override
    public void goRight() {
        System.out.println("Лодка плывет направо");
    }

    @Override
    public void stop() {
        System.out.println("Лодка замедляется");
    }
}
