package module2.level_14_threadPool_JUC.airportGame.repository;

import module2.level_14_threadPool_JUC.airportGame.entity.transport.plane.Plane;
import module2.level_14_threadPool_JUC.airportGame.utill.State;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class PlaneFactory {

    public Plane createPlane(){

       // ThreadLocalRandom.current().nextLong();

        return new Plane(new Random().nextLong(), State.ONAIR);
    }
}
