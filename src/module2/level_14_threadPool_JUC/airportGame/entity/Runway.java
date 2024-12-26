package module2.level_14_threadPool_JUC.airportGame.entity;

public class Runway {

    int count;

    public Runway() {
        this.count = 0;
    }

    void addCount(){
        count++;
        System.out.println("Севших самолетов: " + count);
    }
}

