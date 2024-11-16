package module2.level_02_abstractions.example2;

public abstract class Aircraft {
    public abstract void doFly();
}

abstract class Copter extends Aircraft {
    public abstract void straightUp();
}

class Helicopter extends Copter {
    @Override
    public void doFly() {
        System.out.println("Я вертолет");
    }

    @Override
    public void straightUp() {
        System.out.println("Строго вверх");
    }
}

