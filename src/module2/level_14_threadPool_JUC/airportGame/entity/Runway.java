package module2.level_14_threadPool_JUC.airportGame.entity;

import java.util.concurrent.locks.ReentrantLock;

public class Runway {

    public ReentrantLock lock;
    int count;

    public Runway(ReentrantLock reentrantLock) {
        this.lock = reentrantLock;
        this.count = 0;
    }

    public void addCount(){
        count++;
        System.out.println("Севших самолетов: " + count);
    }
}

