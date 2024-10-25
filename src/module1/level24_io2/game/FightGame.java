package module1.level24_io2.game;

public class FightGame {
    public static void main(String[] args) {

        Unit[] units = {
                new Knight(), // go()
                new Ork(), // go()
                new Magician(new Knight()), // go()
                new Magician(new Elf(new Ork())) // go()
        };

        for (Unit unit : units) {
            unit.go();
        }

    }
}
