package module2.level_02_abstractions.example4;

public interface Swimable {
    void go();
}

interface Flyable{
    void go();
}

class Duck implements Flyable, Swimable{

    @Override
    public void go() {

    }

}

class App{
    public static void main(String[] args) {
        Swimable duck = new Duck();
        duck.go();
    }
}
