package module2.level_14_threadPool_JUC.airportGame.entity.transport.plane;

import module2.level_14_threadPool_JUC.airportGame.entity.Airport;
import module2.level_14_threadPool_JUC.airportGame.entity.Runway;
import module2.level_14_threadPool_JUC.airportGame.utill.State;

public class Plane implements Runnable {
    Long id;
    State state;
    Runway runway = null;
    Airport airport;

    public Plane(Long id, State state, Airport airport) {
        this.id = id;
        this.state = state;
        this.airport = airport;
    }

    public void setAirport(Airport airport) {
        this.airport = airport;
    }

    void landing(){
        this.runway = this.airport.runwayList.get(0);
        runway.lock.lock();
        state = State.LANDING;

        System.out.println("САМОЛЕТ " + Thread.currentThread().getName() + "САДИТСЯ");
        // ВЗАИМОДЕЙСТВОВАТЬ С ПОЛОСОЙ
        // ЗАХВАТИТЬ ЕЕ КАК ОБЩИЙ РЕСУРС
        state = State.LANDED;
        runway.addCount();
        runway.lock.unlock();
    }

    @Override
    public void run() {
        landing();
    }
}
