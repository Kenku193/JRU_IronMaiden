package module2.level_14_threadPool_JUC.airportGame.repository;

import module2.level_14_threadPool_JUC.airportGame.entity.transport.plane.Plane;

import java.util.ArrayList;
import java.util.List;

public class PlaneRepository {
    // В КАКОМ СТАТУСЕ САМОЛЕТЫ ЗДЕСЬ?
    // ONAIR
    // LANDING - landing() - это часть многопоточной задачи
    // LANDED??? - planeList.remove(САМОЛЕТ) + Runway.addCount()
    List<Plane> planeList = new ArrayList<>();
}
