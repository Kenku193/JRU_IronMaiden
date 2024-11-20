package module2.level_04_interfaces.entity;

import module2.level_04_interfaces.contracts.Drivable;
import module2.level_04_interfaces.contracts.Movable;
import module2.level_04_interfaces.contracts.Stopable;

import java.io.Serializable;
import java.util.Map;

public class Car implements Drivable, Stopable, Movable {

    @Override
    public void goStraight() {
        System.out.println("Машина едет вперед");
    }

    @Override
    public void goBack() {
        System.out.println("Машина едет назад");
    }

    @Override
    public void goLeft() {
        System.out.println("Машина едет налево");
    }

    @Override
    public void goRight() {
        System.out.println("Машина едет направо");
    }

}
