package module2.level_14_threadPool_JUC.airportGame.entity;

import module2.level_14_threadPool_JUC.airportGame.config.Settings;
import module2.level_14_threadPool_JUC.airportGame.entity.transport.plane.Plane;

import java.util.ArrayList;
import java.util.List;

public class Airport {

    List<Runway> runwayList = new ArrayList<>();

    public Airport() {
        for (int i = 0; i < Settings.RUNWAY_QUANTITY; i++) {
            runwayList.add(new Runway());
        }
    }
}
