package module1.level24_io2.game;

public abstract class AbstractUnit implements Unit {

    private final Unit unit;

    public AbstractUnit(Unit unit) {
        this.unit = unit;
    }

    @Override
    public void go() {
        unit.go(); // рыцарь пошел
        loudScream();
    }

    protected abstract void loudScream();
}
