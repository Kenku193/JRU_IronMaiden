package module2.level_14_threadPool_JUC.airportGame.entity.transport.plane;

import module2.level_14_threadPool_JUC.airportGame.entity.Runway;
import module2.level_14_threadPool_JUC.airportGame.utill.State;

public class Plane implements Runnable {

    Long id;

    State state;

    public Plane(Long id, State state) {
        this.id = id;
        this.state = state;
    }

    void landing(Runway runway){
        state = State.LANDING;
        // ДОЛЖЕН ИЗМЕНИТЬ СОСТОЯНИЕ САМОЛЕТА
        // 2 РАЗА - В НАЧАЛЕ State.LANDING

        // ВЗАИМОДЕЙСТВОВАТЬ С ПОЛОСОЙ
        // ЗАХВАТИТЬ ЕЕ КАК ОБЩИЙ РЕСУРС

        // ПО ОКОНЧАНИИ - State.LANDED
        state = State.LANDED;
    }

    @Override
    public void run() {
        landing();
    }
}
