package module2.level_15_innerAndNested.example2;

public class Bicycle {
    static int b = 111;
    private String model;
    private int weight;

    private int diameter;

    private int seatPostDiameter = 10;

    public Bicycle(String model, int weight, int diameter, int seatPostDiameter) {
        this.diameter = diameter;
        this.model = model;
        this.weight = weight;
        this.seatPostDiameter = seatPostDiameter;
    }

    public void start() {
        System.out.println("Поехали!");
    }

    public Seat createSeat() {
        return new Seat();
    }

    public class HandleBar {

        public void right() {
            System.out.println("Руль вправо!");
        }

        public void left() {
            System.out.println("Руль влево!");
        }
    }

    class Seat {

        static int x = 0;

        public Bicycle b = Bicycle.this;

        public static void up() {
            System.out.println("Сиденье поднято выше!");
        }

        public void down() {
            System.out.println("Сиденье опущено ниже!");
        }

        public void getDiameter() {
            System.out.println("Диаметер втулки" + Bicycle.this.diameter);
        }

        public void getSeatParam() {
            System.out.println("Параметр сиденья: диаметр штыря =" + Bicycle.this.seatPostDiameter);
        }
    }

    public static class Pump {
        public void pumpIt() {
            System.out.println("Pump!Pump!Pump!BADABOOM!");
        }

        public void getDiameter() {
            System.out.println("Диаметер втулки" + Bicycle.b);
        }
    }
}
