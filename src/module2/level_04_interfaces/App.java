package module2.level_04_interfaces;

import module2.level_04_interfaces.contracts.Drivable;
import module2.level_04_interfaces.contracts.InterfaceWithStaticMethod;
import module2.level_04_interfaces.contracts.Movable;
import module2.level_04_interfaces.contracts.Stopable;
import module2.level_04_interfaces.entity.Boat;
import module2.level_04_interfaces.entity.Car;
import module2.level_04_interfaces.service.EncryptionInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class App {
    public static void main(String[] args) {

        Drivable car = new Car();
        car.goStraight();

        Drivable boat = new Boat();
        boat.goBack();

        List<Drivable> transport = new ArrayList<>();
        transport.add(car);
        transport.add(boat);

        for (Drivable d : transport) {
            d.goLeft();
        }

        Car car2 = new Car();
        car2.stop();
        Boat boat2 = new Boat();
        boat2.stop();

        List<Stopable> stopableList = new ArrayList<>();
        stopableList.add(car2);
        stopableList.add(boat2);

        for (Stopable s : stopableList) {
            s.stop();
        }

        InterfaceWithStaticMethod.toConsole();
        System.out.println(InterfaceWithStaticMethod.s);

//        EncryptionInterface e = new EncryptionInterface() {
//            @Override
//            public void doCrypt() {
//                System.out.println("ШИФРУЕМ");
//            }
//
//        };

        EncryptionInterface e = () -> System.out.println("ШИФРУЕМ");
        e.doCrypt();

    }

}

