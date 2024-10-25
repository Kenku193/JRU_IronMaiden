package module1.level24_io2.game;

public class Elf extends Magician{

    public Elf(Unit unit) {
        super(unit);
    }

    @Override
    protected void loudScream() {
        System.out.println("Где мои подвески!");
    }
}
