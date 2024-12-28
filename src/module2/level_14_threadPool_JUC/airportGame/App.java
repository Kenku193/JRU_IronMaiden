package module2.level_14_threadPool_JUC.airportGame;

import module2.level_14_threadPool_JUC.airportGame.entity.Airport;
import module2.level_14_threadPool_JUC.airportGame.entity.Runway;
import module2.level_14_threadPool_JUC.airportGame.entity.transport.plane.Plane;
import module2.level_14_threadPool_JUC.airportGame.utill.State;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantLock;

public class App {
    public static void main(String[] args) {

        // СОЗДАЛИ АЭРОПОРТ
        Airport airport = new Airport();
        // ВОТ ЕГО ВЗЛЕТНАЯ ПОЛОСА
        ReentrantLock lock = new ReentrantLock(); // ЭТО ИГРАЕТ РОЛЬ МОНИТОРА (МЬЮТЕКСА)
        Runway runway = new Runway(lock);
        airport.runwayList.add(runway);

//        Plane plane = new Plane(1L, State.ONAIR, airport);
//        ExecutorService executorService = Executors.newFixedThreadPool(8);
//        executorService.execute(plane);

        ExecutorService executorService = Executors.newFixedThreadPool(8);
        for (long i = 0; i < 100; i++) {
            executorService.execute(new Plane(i, State.ONAIR, airport));
        }

    }
}
