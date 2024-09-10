package module1.level10_elective_1;

public class Cup {

    Spoon spoon;

    public Cup(Spoon spoon) {
        this.spoon = spoon;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Чашка исчезает навсегда");
    }

    public static void main(String[] args) {

        // СЦЕНАРИЙ 1
//        Spoon spoon = new Spoon();
//        Cup cup = new Cup(spoon);

        // СЦЕНАРИЙ 2
        Cup cup = new Cup(new Spoon());

        cup = null;

        System.gc();

    }
}
