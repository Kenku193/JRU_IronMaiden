package module2.level_01_oop1;

public interface Movable {
    void move();
}

class Car implements Movable{
    @Override
    public void move() {
        System.out.println("Едет");
    }
}

class Duck implements Movable{
    @Override
    public void move() {
        System.out.println("Летит");
    }
}

class App {

    Movable m;

    public static void main(String[] args) {

        Movable duck = new Duck();
        duck.move();

        Movable car = new Car();
        car.move();

    }
}
