package module1.level24_io2.game;

public class Magician extends AbstractUnit {

    public Magician(Unit unit) {
        super(unit);
    }

    @Override
    protected void loudScream() {
        System.out.println("Бегите, глупцы!");
    }
}
